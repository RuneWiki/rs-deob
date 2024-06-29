import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public class class686 implements Runnable {
   @OriginalMember(
      owner = "client!sv",
      name = "i",
      descriptor = "I"
   )
   private int field10298 = 0;
   @OriginalMember(
      owner = "client!sv",
      name = "g",
      descriptor = "I"
   )
   private int field10290 = 0;
   @OriginalMember(
      owner = "client!sv",
      name = "n",
      descriptor = "I"
   )
   private int field10287;
   @OriginalMember(
      owner = "client!sv",
      name = "h",
      descriptor = "Ljava/io/InputStream;"
   )
   private InputStream field10297;
   @OriginalMember(
      owner = "client!sv",
      name = "k",
      descriptor = "[B"
   )
   private byte[] field10288;
   @OriginalMember(
      owner = "client!sv",
      name = "l",
      descriptor = "Ljava/lang/Thread;"
   )
   private Thread field10286;
   @OriginalMember(
      owner = "client!sv",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10301 = new String[]{method4991(method4990("h\u0015;\u007f")), method4991(method4990("}Ny=;")), method4991(method4990("u\u0016y//h\t#-n")), method4991(method4990("u\u0016yQn")), method4991(method4990("u\u0016yVn")), method4991(method4990("u\u0016yTn")), method4991(method4990("u\u0016ya3hH")), method4991(method4990("&\u0010$z<cZ")), method4991(method4990("+Mzv(b\u0007'ck+M")), method4991(method4990("a\u0010>\"fv\u000f$)")), method4991(method4990("u\u0016yUn")), method4991(method4990("u\u0016yPn")), method4991(method4990("u\u0016yWn")), method4991(method4990("u\u0016yRn")), method4991(method4990("u\u0016y[n"))};
   @OriginalMember(
      owner = "client!sv",
      name = "f",
      descriptor = "Ldw;"
   )
   public static class748 field10293 = new class748(3000000, 200);
   @OriginalMember(
      owner = "client!sv",
      name = "d",
      descriptor = "I"
   )
   public static int field10285;
   @OriginalMember(
      owner = "client!sv",
      name = "a",
      descriptor = "I"
   )
   public static int field10289;
   @OriginalMember(
      owner = "client!sv",
      name = "o",
      descriptor = "I"
   )
   public static int field10292;
   @OriginalMember(
      owner = "client!sv",
      name = "j",
      descriptor = "I"
   )
   public static int field10294;
   @OriginalMember(
      owner = "client!sv",
      name = "c",
      descriptor = "I"
   )
   public static int field10295;
   @OriginalMember(
      owner = "client!sv",
      name = "p",
      descriptor = "I"
   )
   public static int field10296;
   @OriginalMember(
      owner = "client!sv",
      name = "b",
      descriptor = "I"
   )
   public static int field10299;
   @OriginalMember(
      owner = "client!sv",
      name = "m",
      descriptor = "I"
   )
   public static int field10300;
   @OriginalMember(
      owner = "client!sv",
      name = "e",
      descriptor = "Ljava/io/IOException;"
   )
   private IOException field10291;

   @OriginalMember(
      owner = "client!sv",
      name = "a",
      descriptor = "(Liaa;IB)V"
   )
   public static final void method4982(class520 arg0, int arg1, byte arg2) {
      try {
         class276.field3852 = 0;
         class315.field4508 = false;
         ++field10294;
         class242.method1801(arg0, 0);
         class317.method2409(arg0, (byte)8);
         if (arg2 <= 64) {
            method4983(-117, 96, 2, -98, -27, -88, -95);
         }

         if (class315.field4508) {
            System.out.println(field10301[8]);
         }

         if (~arg0.field1590 != ~arg1) {
            throw new RuntimeException(field10301[9] + arg0.field1590 + field10301[7] + arg1);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10301[10] + (arg0 != null ? field10301[1] : field10301[0]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sv",
      name = "a",
      descriptor = "(IIIIIII)I"
   )
   public static final int method4983(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         ++field10300;
         if ((1 & arg3) == 1) {
            int var7 = arg5;
            arg5 = arg2;
            arg2 = var7;
         }

         int var10 = arg6 & arg1;
         if (~var10 == -1) {
            return arg4;
         } else if (~var10 == -2) {
            return 7 - (arg0 - 1 - -arg5);
         } else {
            return var10 == 2 ? -arg2 - (-1 - (-arg4 + 7)) : arg0;
         }
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field10301[13] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sv",
      name = "a",
      descriptor = "([BIII)I"
   )
   public final int method4984(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
      int var5 = client.field4530;

      try {
         ++field10285;
         if (arg2 >= 0 && ~arg3 <= -1 && arg2 + arg3 <= arg0.length) {
            synchronized(this) {
               int var7;
               label53: {
                  if (~this.field10290 <= ~this.field10298) {
                     var7 = this.field10290 - this.field10298;
                     if (var5 == 0) {
                        break label53;
                     }
                  }

                  var7 = this.field10287 - this.field10298 + this.field10290;
               }

               if (arg2 > var7) {
                  arg2 = var7;
               }

               if (arg1 == arg2 && this.field10291 != null) {
                  throw new IOException(this.field10291.toString());
               } else {
                  label45: {
                     if (this.field10287 < this.field10298 + arg2) {
                        int var8 = -this.field10298 + this.field10287;
                        class195.method1492(this.field10288, this.field10298, arg0, arg3, var8);
                        class195.method1492(this.field10288, 0, arg0, arg3 + var8, -var8 + arg2);
                        if (var5 == 0) {
                           break label45;
                        }
                     }

                     class195.method1492(this.field10288, this.field10298, arg0, arg3, arg2);
                  }

                  this.field10298 = (this.field10298 + arg2) % this.field10287;
                  this.notifyAll();
                  return arg2;
               }
            }
         } else {
            throw new IOException();
         }
      } catch (RuntimeException var14) {
         throw class670.method4877(var14, field10301[5] + (arg0 != null ? field10301[1] : field10301[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sv",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method4985(int arg0) {
      try {
         field10293 = null;
         if (arg0 != 12271) {
            method4985(122);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10301[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sv",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method4986(int arg0) {
      try {
         ++field10289;
         synchronized(this) {
            if (this.field10291 == null) {
               this.field10291 = new IOException("");
            }

            this.notifyAll();
         }

         try {
            this.field10286.join();
            if (arg0 <= 12) {
               field10293 = null;
            }
         } catch (InterruptedException var4) {
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field10301[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sv",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method4987(byte arg0) {
      try {
         if (arg0 != -34) {
            field10293 = null;
         }

         ++field10295;
         this.field10297 = new class106();
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10301[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sv",
      name = "run",
      descriptor = "()V"
   )
   public final void run() {
      int var1 = client.field4530;

      try {
         ++field10299;

         while(true) {
            int var3;
            synchronized(this) {
               while(true) {
                  label57: {
                     if (this.field10291 != null) {
                        if (var1 == 0) {
                           return;
                        }
                     } else if (this.field10298 != 0) {
                        if (~this.field10290 > ~this.field10298) {
                           var3 = -this.field10290 + this.field10298 + -1;
                           if (var1 == 0) {
                              break label57;
                           }
                        }

                        var3 = -this.field10290 + this.field10287;
                        if (var1 == 0) {
                           break label57;
                        }
                     }

                     var3 = this.field10287 - this.field10290 + -1;
                  }

                  if (~var3 < -1) {
                     break;
                  }

                  try {
                     this.wait();
                  } catch (InterruptedException var15) {
                     if (var1 != 0) {
                        break;
                     }
                  }
               }
            }

            int var4;
            try {
               var4 = this.field10297.read(this.field10288, this.field10290, var3);
               if (var4 == -1) {
                  throw new EOFException();
               }
            } catch (IOException var17) {
               IOException var5 = var17;
               synchronized(this) {
                  this.field10291 = var5;
                  return;
               }
            }

            synchronized(this) {
               this.field10290 = (this.field10290 + var4) % this.field10287;
            }
         }
      } catch (RuntimeException var18) {
         throw class670.method4877(var18, field10301[6] + ')');
      }
   }

   @OriginalMember(
      owner = "client!sv",
      name = "a",
      descriptor = "(Leaa;Leaa;BLwba;Leaa;Lsu;)Z"
   )
   public static final boolean method4988(class526 arg0, class526 arg1, byte arg2, class55 arg3, class526 arg4, class220 arg5) {
      int var6 = client.field4530;

      try {
         class100.field1225 = arg0;
         class386.field5904 = arg4;
         class185.field2310 = new int[16];
         if (arg2 != 88) {
            method4985(-125);
         }

         class663.field9609 = arg3;
         ++field10292;
         class69.field872 = arg5;
         class48.field577 = arg1;
         int var7 = 0;
         if (var6 != 0) {
            class185.field2310[var7] = 255;
            ++var7;
         }

         while(true) {
            while(~var7 > -17) {
               class185.field2310[var7] = 255;
               ++var7;
            }

            if (var6 == 0) {
               return true;
            }

            ++var7;
         }
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field10301[14] + (arg0 != null ? field10301[1] : field10301[0]) + ',' + (arg1 != null ? field10301[1] : field10301[0]) + ',' + arg2 + ',' + (arg3 != null ? field10301[1] : field10301[0]) + ',' + (arg4 != null ? field10301[1] : field10301[0]) + ',' + (arg5 != null ? field10301[1] : field10301[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sv",
      name = "a",
      descriptor = "(II)Z"
   )
   public final boolean method4989(int arg0, int arg1) throws IOException {
      try {
         ++field10296;
         if (arg0 > arg1 && this.field10287 > arg0) {
            synchronized(this) {
               int var4;
               label35: {
                  if (this.field10290 >= this.field10298) {
                     var4 = -this.field10298 + this.field10290;
                     if (client.field4530 == 0) {
                        break label35;
                     }
                  }

                  var4 = -this.field10298 + this.field10287 - -this.field10290;
               }

               if (~arg0 < ~var4) {
                  if (this.field10291 != null) {
                     throw new IOException(this.field10291.toString());
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
         throw class670.method4877(var13, field10301[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sv",
      name = "<init>",
      descriptor = "(Ljava/io/InputStream;I)V"
   )
   public class686(InputStream arg0, int arg1) {
      try {
         this.field10287 = arg1 + 1;
         this.field10297 = arg0;
         this.field10288 = new byte[this.field10287];
         this.field10286 = new Thread(this);
         this.field10286.setDaemon(true);
         this.field10286.start();
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10301[2] + (arg0 != null ? field10301[1] : field10301[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4990(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 70);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4991(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 6;
            break;
         case 1:
            var10005 = 96;
            break;
         case 2:
            var10005 = 87;
            break;
         case 3:
            var10005 = 19;
            break;
         default:
            var10005 = 70;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
