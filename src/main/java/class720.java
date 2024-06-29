import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class720 implements Runnable {
   @OriginalMember(
      owner = "client!kb",
      name = "p",
      descriptor = "I"
   )
   private int field10519 = 0;
   @OriginalMember(
      owner = "client!kb",
      name = "c",
      descriptor = "I"
   )
   private int field10514 = 0;
   @OriginalMember(
      owner = "client!kb",
      name = "d",
      descriptor = "I"
   )
   private int field10524;
   @OriginalMember(
      owner = "client!kb",
      name = "l",
      descriptor = "Ljava/io/InputStream;"
   )
   private InputStream field10516;
   @OriginalMember(
      owner = "client!kb",
      name = "h",
      descriptor = "[B"
   )
   private byte[] field10512;
   @OriginalMember(
      owner = "client!kb",
      name = "o",
      descriptor = "Ljava/lang/Thread;"
   )
   private Thread field10517;
   @OriginalMember(
      owner = "client!kb",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10526 = new String[]{method5241(method5240("\n%7\u001b\u0007")), method5241(method5240("\n%7\u001d\u0007")), method5241(method5240("\u000f2u4")), method5241(method5240("\n%7dF\u000f.mf\u0007")), method5241(method5240("\u001ai7vR")), method5241(method5240("\n%7*Z\u000fo")), method5241(method5240("\n%7\u001a\u0007")), method5241(method5240("\n%7\u0019\u0007")), method5241(method5240("\n%7\u001c\u0007"))};
   @OriginalMember(
      owner = "client!kb",
      name = "e",
      descriptor = "I"
   )
   public static int field10513 = 1338;
   @OriginalMember(
      owner = "client!kb",
      name = "a",
      descriptor = "I"
   )
   public static int field10510;
   @OriginalMember(
      owner = "client!kb",
      name = "m",
      descriptor = "I"
   )
   public static int field10511;
   @OriginalMember(
      owner = "client!kb",
      name = "b",
      descriptor = "I"
   )
   public static int field10515;
   @OriginalMember(
      owner = "client!kb",
      name = "k",
      descriptor = "I"
   )
   public static int field10520;
   @OriginalMember(
      owner = "client!kb",
      name = "f",
      descriptor = "I"
   )
   public static int field10521;
   @OriginalMember(
      owner = "client!kb",
      name = "i",
      descriptor = "I"
   )
   public static int field10522;
   @OriginalMember(
      owner = "client!kb",
      name = "j",
      descriptor = "I"
   )
   public static int field10523;
   @OriginalMember(
      owner = "client!kb",
      name = "n",
      descriptor = "I"
   )
   public static int field10525;
   @OriginalMember(
      owner = "client!kb",
      name = "g",
      descriptor = "Ljava/io/IOException;"
   )
   private IOException field10518;

   @OriginalMember(
      owner = "client!kb",
      name = "a",
      descriptor = "(IB)V"
   )
   public static final void method5235(int arg0, byte arg1) {
      try {
         ++field10522;
         class541.field7769.method726(arg0, 25324);
         if (arg1 != 5) {
            method5235(20, (byte)-26);
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field10526[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kb",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method5236(int arg0) {
      try {
         ++field10510;
         this.field10516 = new class522();
         if (arg0 != 0) {
            this.field10516 = null;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field10526[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kb",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method5237(int arg0) {
      try {
         ++field10525;
         synchronized(this) {
            if (this.field10518 == null) {
               this.field10518 = new IOException("");
            }

            this.notifyAll();
         }

         try {
            this.field10517.join();
         } catch (InterruptedException var5) {
         }

         int var3 = 104 % ((arg0 - -38) / 44);
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field10526[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kb",
      name = "a",
      descriptor = "([BIII)I"
   )
   public final int method5238(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
      boolean var5 = client.field4360;

      try {
         ++field10523;
         if (arg2 >= 0 && ~arg1 <= -1 && ~(arg1 - -arg2) >= ~arg0.length) {
            synchronized(this) {
               int var7;
               label58: {
                  if (~this.field10514 > ~this.field10519) {
                     var7 = this.field10524 - this.field10519 + this.field10514;
                     if (!var5) {
                        break label58;
                     }
                  }

                  var7 = -this.field10519 + this.field10514;
               }

               if (arg2 > var7) {
                  arg2 = var7;
               }

               if (arg3 != 23484) {
                  this.method5236(51);
               }

               if (arg2 == 0 && this.field10518 != null) {
                  throw new IOException(this.field10518.toString());
               } else {
                  label49: {
                     if (~(this.field10519 + arg2) >= ~this.field10524) {
                        class242.method1848(this.field10512, this.field10519, arg0, arg1, arg2);
                        if (!var5) {
                           break label49;
                        }
                     }

                     int var8 = this.field10524 - this.field10519;
                     class242.method1848(this.field10512, this.field10519, arg0, arg1, var8);
                     class242.method1848(this.field10512, 0, arg0, arg1 + var8, -var8 + arg2);
                  }

                  this.field10519 = (this.field10519 + arg2) % this.field10524;
                  this.notifyAll();
                  return arg2;
               }
            }
         } else {
            throw new IOException();
         }
      } catch (RuntimeException var14) {
         throw class237.method1823(var14, field10526[6] + (arg0 != null ? field10526[4] : field10526[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kb",
      name = "a",
      descriptor = "(II)Z"
   )
   public final boolean method5239(int arg0, int arg1) throws IOException {
      try {
         ++field10521;
         if (~arg1 < -1 && ~this.field10524 < ~arg1) {
            synchronized(this) {
               int var4;
               label39: {
                  if (this.field10519 <= this.field10514) {
                     var4 = -this.field10519 + this.field10514;
                     if (!client.field4360) {
                        break label39;
                     }
                  }

                  var4 = -this.field10519 + this.field10524 + this.field10514;
               }

               if (arg0 != 3041) {
                  this.method5236(44);
               }

               if (~var4 > ~arg1) {
                  if (this.field10518 != null) {
                     throw new IOException(this.field10518.toString());
                  } else {
                     this.notifyAll();
                     return false;
                  }
               } else {
                  return true;
               }
            }
         } else {
            throw new IOException();
         }
      } catch (RuntimeException var13) {
         throw class237.method1823(var13, field10526[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kb",
      name = "run",
      descriptor = "()V"
   )
   public final void run() {
      boolean var1 = client.field4360;

      try {
         ++field10520;

         while(true) {
            int var3;
            synchronized(this) {
               while(true) {
                  label57: {
                     if (this.field10518 != null) {
                        if (!var1) {
                           return;
                        }
                     } else if (~this.field10519 != -1) {
                        if (~this.field10519 < ~this.field10514) {
                           var3 = this.field10519 + -1 + -this.field10514;
                           if (!var1) {
                              break label57;
                           }
                        }

                        var3 = -this.field10514 + this.field10524;
                        if (!var1) {
                           break label57;
                        }
                     }

                     var3 = -this.field10514 + this.field10524 - 1;
                  }

                  if (var3 > 0) {
                     break;
                  }

                  try {
                     this.wait();
                  } catch (InterruptedException var15) {
                     if (var1) {
                        break;
                     }
                  }
               }
            }

            int var4;
            try {
               var4 = this.field10516.read(this.field10512, this.field10514, var3);
               if (~var4 == 0) {
                  throw new EOFException();
               }
            } catch (IOException var17) {
               IOException var5 = var17;
               synchronized(this) {
                  this.field10518 = var5;
                  return;
               }
            }

            synchronized(this) {
               this.field10514 = (this.field10514 + var4) % this.field10524;
            }
         }
      } catch (RuntimeException var18) {
         throw class237.method1823(var18, field10526[5] + ')');
      }
   }

   @OriginalMember(
      owner = "client!kb",
      name = "<init>",
      descriptor = "(Ljava/io/InputStream;I)V"
   )
   public class720(InputStream arg0, int arg1) {
      try {
         this.field10524 = arg1 + 1;
         this.field10516 = arg0;
         this.field10512 = new byte[this.field10524];
         this.field10517 = new Thread(this);
         this.field10517.setDaemon(true);
         this.field10517.start();
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field10526[3] + (arg0 != null ? field10526[4] : field10526[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5240(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 47);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5241(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 97;
            break;
         case 1:
            var10005 = 71;
            break;
         case 2:
            var10005 = 25;
            break;
         case 3:
            var10005 = 88;
            break;
         default:
            var10005 = 47;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
