import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class357 {
   @OriginalMember(
      owner = "client!hn",
      name = "a",
      descriptor = "I"
   )
   public int field5280;
   @OriginalMember(
      owner = "client!hn",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5281 = new String[]{method2810(method2809("\u0000JS$#")), method2810(method2809("\u0006Q\u0011\n")), method2810(method2809("\u0013\nSHv")), method2810(method2809("\u0000JSZb\u0006M\tX#")), method2810(method2809("\u0000JS%#")), method2810(method2809("\u0000JS'#")), method2810(method2809("\u0000JS\u0012d;P\u000f\u000fe\u000f\f"))};
   @OriginalMember(
      owner = "client!hn",
      name = "e",
      descriptor = "I"
   )
   public static int field5276 = -1;
   @OriginalMember(
      owner = "client!hn",
      name = "c",
      descriptor = "I"
   )
   public static int field5275;
   @OriginalMember(
      owner = "client!hn",
      name = "f",
      descriptor = "I"
   )
   public static int field5277;
   @OriginalMember(
      owner = "client!hn",
      name = "d",
      descriptor = "I"
   )
   public static int field5278;
   @OriginalMember(
      owner = "client!hn",
      name = "b",
      descriptor = "I"
   )
   public static int field5279;

   @OriginalMember(
      owner = "client!hn",
      name = "a",
      descriptor = "(IIILka;I)Loga;"
   )
   public static final class358 method2806(int arg0, int arg1, int arg2, class761 arg3, int arg4) {
      try {
         if (arg2 >= -117) {
            method2806(32, -67, 48, (class761)null, 112);
         }

         ++field5277;
         return arg3 == null ? null : new class358(arg1, arg4, arg0, arg3.method782(), arg3.method800(), arg3.method797(), arg3.method801(), arg3.method758(), arg3.method779(), arg3.method783());
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field5281[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field5281[2] : field5281[1]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hn",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method2807(int arg0) {
      boolean var1 = client.field10022;

      try {
         class19.field257 = 0;
         class249.field3818 = arg0;
         ++field5275;
         int var2 = 0;
         if (var1 || var2 < class701.field10102) {
            do {
               int var3 = class590.field8352 * var2;
               int var4 = 0;
               if (var1 || ~var4 > ~class590.field8352) {
                  do {
                     int var5 = var3 + var4;
                     class558.field7928[var5].method631(class502.field7168 * var4, class466.field6765 * var2, class502.field7168, class466.field6765, 0, 0, true, true);
                     ++var4;
                  } while(~var4 > ~class590.field8352);
               }

               ++var2;
            } while(var2 < class701.field10102);

         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field5281[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hn",
      name = "a",
      descriptor = "(BI)I"
   )
   public static final int method2808(byte arg0, int arg1) {
      boolean var2 = client.field10022;

      try {
         ++field5279;
         double var3 = (double)((arg1 & 16729700) >> 16) / 256.0D;
         if (arg0 != -53) {
            return -7;
         } else {
            double var5 = (double)((65510 & arg1) >> 8) / 256.0D;
            double var7 = (double)(255 & arg1) / 256.0D;
            double var9 = var3;
            if (var3 > var5) {
               var9 = var5;
            }

            if (var7 < var9) {
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
               label108: {
                  if (var17 < 0.5D) {
                     var15 = (var11 - var9) / (var9 + var11);
                  }

                  if (var17 >= 0.5D) {
                     var15 = (-var9 + var11) / (-var11 + 2.0D - var9);
                  }

                  if (var3 != var11) {
                     if (var5 == var11) {
                        var13 = (-var3 + var7) / (-var9 + var11) + 2.0D;
                        if (!var2) {
                           break label108;
                        }
                     }

                     if (var7 != var11) {
                        break label108;
                     }

                     var13 = (-var5 + var3) / (-var9 + var11) + 4.0D;
                     if (!var2) {
                        break label108;
                     }
                  }

                  var13 = (var5 - var7) / (var11 - var9);
               }
            }

            int var21;
            int var22;
            label82: {
               double var19 = var13 / 6.0D;
               var21 = (int)(var19 * 256.0D);
               var22 = (int)(var15 * 256.0D);
               if (var22 < 0) {
                  var22 = 0;
                  if (!var2) {
                     break label82;
                  }
               }

               if (~var22 < -256) {
                  var22 = 255;
               }
            }

            int var23;
            label77: {
               var23 = (int)(var17 * 256.0D);
               if (~var23 <= -1) {
                  if (~var23 >= -256) {
                     break label77;
                  }

                  var23 = 255;
                  if (!var2) {
                     break label77;
                  }
               }

               var23 = 0;
            }

            if (~var23 >= -244) {
               if (~var23 < -218) {
                  var22 >>= 3;
                  if (!var2) {
                     return (var23 >> 1) + (((var21 & 255) >> 2 << 10) - -(var22 >> 5 << 7));
                  }
               }

               if (~var23 < -193) {
                  var22 >>= 2;
                  if (!var2) {
                     return (var23 >> 1) + (((var21 & 255) >> 2 << 10) - -(var22 >> 5 << 7));
                  }
               }

               if (var23 <= 179) {
                  return (var23 >> 1) + (((var21 & 255) >> 2 << 10) - -(var22 >> 5 << 7));
               }

               var22 >>= 1;
               if (!var2) {
                  return (var23 >> 1) + (((var21 & 255) >> 2 << 10) - -(var22 >> 5 << 7));
               }
            }

            var22 >>= 4;
            return (var23 >> 1) + (((var21 & 255) >> 2 << 10) - -(var22 >> 5 << 7));
         }
      } catch (RuntimeException var25) {
         throw class612.method4503(var25, field5281[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hn",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field5278;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field5281[6] + ')');
      }
   }

   @OriginalMember(
      owner = "client!hn",
      name = "<init>",
      descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V"
   )
   public class357(String arg0, String arg1, String arg2, int arg3) {
      try {
         this.field5280 = arg3;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field5281[3] + (arg0 != null ? field5281[2] : field5281[1]) + ',' + (arg1 != null ? field5281[2] : field5281[1]) + ',' + (arg2 != null ? field5281[2] : field5281[1]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2809(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 11);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2810(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 104;
            break;
         case 1:
            var10005 = 36;
            break;
         case 2:
            var10005 = 125;
            break;
         case 3:
            var10005 = 102;
            break;
         default:
            var10005 = 11;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
