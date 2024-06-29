import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!caa")
public class class605 implements Runnable {
   @OriginalMember(
      owner = "client!caa",
      name = "c",
      descriptor = "I"
   )
   private int field8884 = 0;
   @OriginalMember(
      owner = "client!caa",
      name = "s",
      descriptor = "I"
   )
   private int field8893 = 0;
   @OriginalMember(
      owner = "client!caa",
      name = "k",
      descriptor = "I"
   )
   private int field8886;
   @OriginalMember(
      owner = "client!caa",
      name = "h",
      descriptor = "Ljava/io/InputStream;"
   )
   private InputStream field8889;
   @OriginalMember(
      owner = "client!caa",
      name = "j",
      descriptor = "[B"
   )
   private byte[] field8877;
   @OriginalMember(
      owner = "client!caa",
      name = "i",
      descriptor = "Ljava/lang/Thread;"
   )
   private Thread field8891;
   @OriginalMember(
      owner = "client!caa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8899 = new String[]{method4487(method4486("dSX\u0015U/")), method4487(method4486("dSX\u0015V/")), method4487(method4486("dSX\u0015Q/")), method4487(method4486("iGUW")), method4487(method4486("|\u001c\u0017\u0015i")), method4487(method4486("dSX\u0015W/")), method4487(method4486("dSX\u0015P/")), method4487(method4486("dSX\u0015S/")), method4487(method4486("dSX\u0015R/")), method4487(method4486("dSX\u0015fr\\\u0011")), method4487(method4486("dSX\u0015(n\\PO*/"))};
   @OriginalMember(
      owner = "client!caa",
      name = "t",
      descriptor = "I"
   )
   public static int field8883 = -1;
   @OriginalMember(
      owner = "client!caa",
      name = "f",
      descriptor = "I"
   )
   public static int field8890 = -1;
   @OriginalMember(
      owner = "client!caa",
      name = "u",
      descriptor = "Lse;"
   )
   public static class6 field8892 = new class6(54, 4);
   @OriginalMember(
      owner = "client!caa",
      name = "n",
      descriptor = "[S"
   )
   private static short[] field8895 = new short[]{962, 20423, -21582, 11214, -10295};
   @OriginalMember(
      owner = "client!caa",
      name = "q",
      descriptor = "[S"
   )
   private static short[] field8894 = new short[]{952, 20413, -21592, 11204, -10305};
   @OriginalMember(
      owner = "client!caa",
      name = "e",
      descriptor = "[S"
   )
   private static short[] field8897 = new short[]{967, 20428, -21577, 11219, -10290};
   @OriginalMember(
      owner = "client!caa",
      name = "g",
      descriptor = "[S"
   )
   private static short[] field8896 = new short[]{957, 20418, -21587, 11209, -10300};
   @OriginalMember(
      owner = "client!caa",
      name = "p",
      descriptor = "[[S"
   )
   public static short[][] field8898 = new short[][]{field8897, field8895, field8896, field8894};
   @OriginalMember(
      owner = "client!caa",
      name = "m",
      descriptor = "I"
   )
   public static int field8878;
   @OriginalMember(
      owner = "client!caa",
      name = "l",
      descriptor = "I"
   )
   public static int field8879;
   @OriginalMember(
      owner = "client!caa",
      name = "r",
      descriptor = "I"
   )
   public static int field8880;
   @OriginalMember(
      owner = "client!caa",
      name = "b",
      descriptor = "I"
   )
   public static int field8881;
   @OriginalMember(
      owner = "client!caa",
      name = "a",
      descriptor = "I"
   )
   public static int field8882;
   @OriginalMember(
      owner = "client!caa",
      name = "d",
      descriptor = "I"
   )
   public static int field8885;
   @OriginalMember(
      owner = "client!caa",
      name = "v",
      descriptor = "I"
   )
   public static int field8888;
   @OriginalMember(
      owner = "client!caa",
      name = "o",
      descriptor = "Ljava/io/IOException;"
   )
   private IOException field8887;

   @OriginalMember(
      owner = "client!caa",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method4479(int arg0) {
      try {
         ++field8881;
         synchronized(this) {
            if (this.field8887 == null) {
               this.field8887 = new IOException("");
            }

            this.notifyAll();
         }

         if (arg0 != -1) {
            method4481(10, false, (byte)25);
         }

         try {
            this.field8891.join();
         } catch (InterruptedException var4) {
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field8899[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!caa",
      name = "a",
      descriptor = "(BI)Z"
   )
   public final boolean method4480(byte arg0, int arg1) throws IOException {
      try {
         ++field8880;
         if (~arg1 < -1 && ~this.field8886 < ~arg1) {
            if (arg0 > -1) {
               return true;
            } else {
               synchronized(this) {
                  int var4;
                  label37: {
                     if (~this.field8893 > ~this.field8884) {
                        var4 = -this.field8884 + this.field8886 + this.field8893;
                        if (!client.field1481) {
                           break label37;
                        }
                     }

                     var4 = -this.field8884 + this.field8893;
                  }

                  if (arg1 > var4) {
                     if (this.field8887 != null) {
                        throw new IOException(this.field8887.toString());
                     } else {
                        this.notifyAll();
                        return false;
                     }
                  } else {
                     return true;
                  }
               }
            }
         } else {
            throw new IOException();
         }
      } catch (RuntimeException var13) {
         throw class93.method866(var13, field8899[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!caa",
      name = "a",
      descriptor = "(IZB)V"
   )
   public static final void method4481(int arg0, boolean arg1, byte arg2) {
      try {
         ++field8885;
         class80 var3 = arg1 ? class631.field9307 : class213.field2706;
         if (var3 != null && ~arg0 <= -1 && ~var3.field1115 < ~arg0) {
            class98 var4 = var3.field1104[arg0];
            int var5 = 3 / ((10 - arg2) / 36);
            if (~var4.field1298 == 0) {
               String var6 = var4.field1299;
               class594 var7 = class145.method1177((byte)94);
               class702 var8 = class19.method142(var7.field8765, class287.field3970, (byte)-109);
               var8.field10264.method593(3 - -class398.method3129(12, var6), 867770704);
               var8.field10264.method593(arg1 ? 1 : 0, 867770704);
               var8.field10264.method611(arg0, -1344798296);
               var8.field10264.method595(-15010, var6);
               var7.method4423(var8, (byte)127);
            }
         }
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field8899[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!caa",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method4482(byte arg0) {
      try {
         this.field8889 = new class92();
         int var2 = -41 % ((arg0 - -6) / 61);
         ++field8882;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field8899[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!caa",
      name = "a",
      descriptor = "(II)I"
   )
   public static final int method4483(int arg0, int arg1) {
      boolean var2 = client.field1481;

      try {
         ++field8879;
         double var3 = (double)(arg0 >> 16 & 255) / 256.0D;
         double var5 = (double)((arg0 & 65503) >> 8) / 256.0D;
         double var7 = (double)(arg0 & 255) / 256.0D;
         double var9 = var3;
         if (var5 < var3) {
            var9 = var5;
         }

         if (var9 > var7) {
            var9 = var7;
         }

         double var11 = var3;
         if (var3 < var5) {
            var11 = var5;
         }

         if (var7 > var11) {
            var11 = var7;
         }

         double var13 = 0.0D;
         double var15 = 0.0D;
         double var17 = (var9 + var11) / 2.0D;
         if (var9 != var11) {
            label104: {
               if (var17 < 0.5D) {
                  var15 = (var11 - var9) / (var9 + var11);
               }

               if (var17 >= 0.5D) {
                  var15 = (var11 - var9) / (-var11 + 2.0D - var9);
               }

               if (var3 == var11) {
                  var13 = (var5 - var7) / (-var9 + var11);
                  if (!var2) {
                     break label104;
                  }
               }

               if (var5 == var11) {
                  var13 = (var7 - var3) / (-var9 + var11) + 2.0D;
                  if (!var2) {
                     break label104;
                  }
               }

               if (var7 == var11) {
                  var13 = (-var5 + var3) / (-var9 + var11) + 4.0D;
               }
            }
         }

         int var21;
         int var22;
         int var23;
         label80: {
            double var19 = var13 / 6.0D;
            var21 = (int)((double)arg1 * var19);
            var22 = (int)(var15 * 256.0D);
            var23 = (int)(var17 * 256.0D);
            if (~var22 <= -1) {
               if (~var22 >= -256) {
                  break label80;
               }

               var22 = 255;
               if (!var2) {
                  break label80;
               }
            }

            var22 = 0;
         }

         label73: {
            if (var23 < 0) {
               var23 = 0;
               if (!var2) {
                  break label73;
               }
            }

            if (var23 > 255) {
               var23 = 255;
            }
         }

         if (var23 <= 243) {
            if (var23 > 217) {
               var22 >>= 3;
               if (!var2) {
                  return ((var21 >> 2 & 63) << 10) + (var22 >> 5 << 7) + (var23 >> 1);
               }
            }

            if (var23 <= 192) {
               if (var23 <= 179) {
                  return ((var21 >> 2 & 63) << 10) + (var22 >> 5 << 7) + (var23 >> 1);
               }

               var22 >>= 1;
               if (!var2) {
                  return ((var21 >> 2 & 63) << 10) + (var22 >> 5 << 7) + (var23 >> 1);
               }
            }

            var22 >>= 2;
            if (!var2) {
               return ((var21 >> 2 & 63) << 10) + (var22 >> 5 << 7) + (var23 >> 1);
            }
         }

         var22 >>= 4;
         return ((var21 >> 2 & 63) << 10) + (var22 >> 5 << 7) + (var23 >> 1);
      } catch (RuntimeException var25) {
         throw class93.method866(var25, field8899[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!caa",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4484(int arg0) {
      try {
         field8898 = null;
         field8896 = null;
         int var1 = -94 / ((arg0 - 45) / 63);
         field8894 = null;
         field8895 = null;
         field8892 = null;
         field8897 = null;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field8899[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!caa",
      name = "run",
      descriptor = "()V"
   )
   public final void run() {
      boolean var1 = client.field1481;

      try {
         ++field8888;

         while(true) {
            int var3;
            synchronized(this) {
               while(true) {
                  label81: {
                     if (this.field8887 != null) {
                        if (!var1) {
                           return;
                        }
                     } else if (this.field8884 == 0) {
                        var3 = this.field8886 + -1 + -this.field8893;
                        if (!var1) {
                           break label81;
                        }
                     }

                     if (this.field8884 > this.field8893) {
                        var3 = -this.field8893 + -1 + this.field8884;
                        if (!var1) {
                           break label81;
                        }
                     }

                     var3 = -this.field8893 + this.field8886;
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
               var4 = this.field8889.read(this.field8877, this.field8893, var3);
               if (var4 == -1) {
                  throw new EOFException();
               }
            } catch (IOException var17) {
               IOException var5 = var17;
               synchronized(this) {
                  this.field8887 = var5;
                  return;
               }
            }

            synchronized(this) {
               this.field8893 = (this.field8893 + var4) % this.field8886;
            }
         }
      } catch (RuntimeException var18) {
         throw class93.method866(var18, field8899[9] + ')');
      }
   }

   @OriginalMember(
      owner = "client!caa",
      name = "a",
      descriptor = "(II[BB)I"
   )
   public final int method4485(int arg0, int arg1, byte[] arg2, byte arg3) throws IOException {
      boolean var5 = client.field1481;

      try {
         ++field8878;
         if (arg0 >= 0 && arg1 >= 0 && arg2.length >= arg0 + arg1) {
            if (arg3 != -118) {
               field8896 = null;
            }

            synchronized(this) {
               int var7;
               label55: {
                  if (this.field8893 >= this.field8884) {
                     var7 = this.field8893 - this.field8884;
                     if (!var5) {
                        break label55;
                     }
                  }

                  var7 = -this.field8884 + this.field8886 + this.field8893;
               }

               if (~arg0 < ~var7) {
                  arg0 = var7;
               }

               if (arg0 == 0 && this.field8887 != null) {
                  throw new IOException(this.field8887.toString());
               } else {
                  label47: {
                     if (~this.field8886 > ~(this.field8884 + arg0)) {
                        int var8 = -this.field8884 + this.field8886;
                        class349.method2762(this.field8877, this.field8884, arg2, arg1, var8);
                        class349.method2762(this.field8877, 0, arg2, arg1 + var8, arg0 - var8);
                        if (!var5) {
                           break label47;
                        }
                     }

                     class349.method2762(this.field8877, this.field8884, arg2, arg1, arg0);
                  }

                  this.field8884 = (this.field8884 + arg0) % this.field8886;
                  this.notifyAll();
                  return arg0;
               }
            }
         } else {
            throw new IOException();
         }
      } catch (RuntimeException var14) {
         throw class93.method866(var14, field8899[5] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8899[4] : field8899[3]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!caa",
      name = "<init>",
      descriptor = "(Ljava/io/InputStream;I)V"
   )
   public class605(InputStream arg0, int arg1) {
      try {
         this.field8886 = arg1 - -1;
         this.field8889 = arg0;
         this.field8877 = new byte[this.field8886];
         this.field8891 = new Thread(this);
         this.field8891.setDaemon(true);
         this.field8891.start();
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field8899[10] + (arg0 != null ? field8899[4] : field8899[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!caa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4486(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 20);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!caa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4487(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 7;
            break;
         case 1:
            var10005 = 50;
            break;
         case 2:
            var10005 = 57;
            break;
         case 3:
            var10005 = 59;
            break;
         default:
            var10005 = 20;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
