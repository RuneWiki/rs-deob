import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kka")
public class class329 implements Runnable {
   @OriginalMember(
      owner = "client!kka",
      name = "k",
      descriptor = "I"
   )
   private int field4720 = 0;
   @OriginalMember(
      owner = "client!kka",
      name = "m",
      descriptor = "I"
   )
   private int field4724 = 0;
   @OriginalMember(
      owner = "client!kka",
      name = "a",
      descriptor = "Ljava/io/OutputStream;"
   )
   private OutputStream field4711;
   @OriginalMember(
      owner = "client!kka",
      name = "g",
      descriptor = "I"
   )
   private int field4722;
   @OriginalMember(
      owner = "client!kka",
      name = "i",
      descriptor = "[B"
   )
   private byte[] field4716;
   @OriginalMember(
      owner = "client!kka",
      name = "c",
      descriptor = "Ljava/lang/Thread;"
   )
   private Thread field4723;
   @OriginalMember(
      owner = "client!kka",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4725 = new String[]{method2623(method2622("\u001dg.b\u0001\u0003bg")), method2623(method2622("\u0018y# ")), method2623(method2622("\r\"ab\u000e")), method2623(method2622("\u001dg.bO\u001fb&8M^")), method2623(method2622("\u001dg.b0^")), method2623(method2622("\u001dg.b7^")), method2623(method2622("\u001dg.b2^")), method2623(method2622("\u001dg.b1^"))};
   @OriginalMember(
      owner = "client!kka",
      name = "l",
      descriptor = "[I"
   )
   public static int[] field4713 = new int[3];
   @OriginalMember(
      owner = "client!kka",
      name = "f",
      descriptor = "[I"
   )
   public static int[] field4719 = new int[2];
   @OriginalMember(
      owner = "client!kka",
      name = "d",
      descriptor = "F"
   )
   public static float field4712;
   @OriginalMember(
      owner = "client!kka",
      name = "b",
      descriptor = "I"
   )
   public static int field4714;
   @OriginalMember(
      owner = "client!kka",
      name = "j",
      descriptor = "I"
   )
   public static int field4715;
   @OriginalMember(
      owner = "client!kka",
      name = "h",
      descriptor = "I"
   )
   public static int field4718;
   @OriginalMember(
      owner = "client!kka",
      name = "e",
      descriptor = "I"
   )
   public static int field4721;
   @OriginalMember(
      owner = "client!kka",
      name = "n",
      descriptor = "Ljava/io/IOException;"
   )
   private IOException field4717;

   @OriginalMember(
      owner = "client!kka",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method2618(int arg0) {
      try {
         if (arg0 == -21771) {
            field4713 = null;
            field4719 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field4725[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kka",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method2619(int arg0) {
      try {
         synchronized(this) {
            if (this.field4717 == null) {
               this.field4717 = new IOException("");
            }

            this.notifyAll();
         }

         if (arg0 == -9742) {
            ++field4721;

            try {
               this.field4723.join();
            } catch (InterruptedException var4) {
            }
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field4725[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kka",
      name = "run",
      descriptor = "()V"
   )
   public final void run() {
      boolean var1 = client.field4273;

      try {
         ++field4718;

         while(true) {
            int var3;
            synchronized(this) {
               while(true) {
                  label61: {
                     if (this.field4717 != null) {
                        if (!var1) {
                           return;
                        }
                     } else if (this.field4720 >= this.field4724) {
                        var3 = -this.field4724 + this.field4720;
                        if (!var1) {
                           break label61;
                        }
                     }

                     var3 = this.field4722 - (this.field4724 - this.field4720);
                  }

                  if (~var3 < -1) {
                     break;
                  }

                  try {
                     this.field4711.flush();
                  } catch (IOException var18) {
                     this.field4717 = var18;
                     return;
                  }

                  try {
                     this.wait();
                  } catch (InterruptedException var19) {
                     if (var1) {
                        break;
                     }
                  }
               }
            }

            try {
               label76: {
                  if (~(this.field4724 + var3) >= ~this.field4722) {
                     this.field4711.write(this.field4716, this.field4724, var3);
                     if (!var1) {
                        break label76;
                     }
                  }

                  int var5 = -this.field4724 + this.field4722;
                  this.field4711.write(this.field4716, this.field4724, var5);
                  this.field4711.write(this.field4716, 0, -var5 + var3);
               }
            } catch (IOException var21) {
               IOException var6 = var21;
               synchronized(this) {
                  this.field4717 = var6;
                  return;
               }
            }

            synchronized(this) {
               this.field4724 = (this.field4724 - -var3) % this.field4722;
            }
         }
      } catch (RuntimeException var22) {
         throw class534.method3846(var22, field4725[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!kka",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method2620(int arg0) {
      try {
         if (arg0 <= 105) {
            this.field4716 = null;
         }

         ++field4714;
         this.field4711 = new class631();
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4725[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kka",
      name = "a",
      descriptor = "(II[BZ)V"
   )
   public final void method2621(int arg0, int arg1, byte[] arg2, boolean arg3) throws IOException {
      boolean var5 = client.field4273;

      try {
         ++field4715;
         if (arg1 >= 0 && arg0 >= 0 && arg0 + arg1 <= arg2.length) {
            synchronized(this) {
               if (this.field4717 != null) {
                  throw new IOException(this.field4717.toString());
               } else {
                  int var7;
                  label51: {
                     if (this.field4720 < this.field4724) {
                        var7 = -this.field4720 + -1 + this.field4724;
                        if (!var5) {
                           break label51;
                        }
                     }

                     var7 = -this.field4720 + this.field4722 + this.field4724 - 1;
                  }

                  if (~arg1 < ~var7) {
                     throw new IOException("");
                  } else {
                     label45: {
                        if (~this.field4722 <= ~(this.field4720 - -arg1)) {
                           class714.method5200(arg2, arg0, this.field4716, this.field4720, arg1);
                           if (!var5) {
                              break label45;
                           }
                        }

                        int var8 = -this.field4720 + this.field4722;
                        class714.method5200(arg2, arg0, this.field4716, this.field4720, var8);
                        class714.method5200(arg2, arg0 + var8, this.field4716, 0, -var8 + arg1);
                     }

                     this.field4720 = (this.field4720 + arg1) % this.field4722;
                     this.notifyAll();
                     if (arg3) {
                        method2618(-102);
                     }

                  }
               }
            }
         } else {
            throw new IOException();
         }
      } catch (RuntimeException var11) {
         throw class534.method3846(var11, field4725[5] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4725[2] : field4725[1]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kka",
      name = "<init>",
      descriptor = "(Ljava/io/OutputStream;I)V"
   )
   public class329(OutputStream arg0, int arg1) {
      try {
         this.field4711 = arg0;
         this.field4722 = arg1 - -1;
         this.field4716 = new byte[this.field4722];
         this.field4723 = new Thread(this);
         this.field4723.setDaemon(true);
         this.field4723.start();
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field4725[3] + (arg0 != null ? field4725[2] : field4725[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2622(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 115);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2623(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 118;
            break;
         case 1:
            var10005 = 12;
            break;
         case 2:
            var10005 = 79;
            break;
         case 3:
            var10005 = 76;
            break;
         default:
            var10005 = 115;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
