import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tia")
public class class278 extends class302 {
   @OriginalMember(
      owner = "client!tia",
      name = "O",
      descriptor = "I"
   )
   private int field3876 = 409;
   @OriginalMember(
      owner = "client!tia",
      name = "R",
      descriptor = "[I"
   )
   private int[] field3874 = new int[3];
   @OriginalMember(
      owner = "client!tia",
      name = "J",
      descriptor = "I"
   )
   private int field3880 = 4096;
   @OriginalMember(
      owner = "client!tia",
      name = "P",
      descriptor = "I"
   )
   private int field3881 = 4096;
   @OriginalMember(
      owner = "client!tia",
      name = "H",
      descriptor = "I"
   )
   private int field3883 = 4096;
   @OriginalMember(
      owner = "client!tia",
      name = "S",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3885 = new String[]{method2141(method2140("\u0005)\u0000<CY")), method2141(method2140("\u001f5\r~")), method2141(method2140("\u0005)\u0000<BY")), method2141(method2140("\nnO<y")), method2141(method2140("\u0005)\u0000<FY")), method2141(method2140("\u0005)\u0000<AY")), method2141(method2140("\u0005)\u0000<GY"))};
   @OriginalMember(
      owner = "client!tia",
      name = "N",
      descriptor = "Z"
   )
   public static boolean field3884 = false;
   @OriginalMember(
      owner = "client!tia",
      name = "M",
      descriptor = "Lwm;"
   )
   public static class590 field3879 = new class590();
   @OriginalMember(
      owner = "client!tia",
      name = "Q",
      descriptor = "I"
   )
   public static int field3875;
   @OriginalMember(
      owner = "client!tia",
      name = "K",
      descriptor = "I"
   )
   public static int field3877;
   @OriginalMember(
      owner = "client!tia",
      name = "I",
      descriptor = "I"
   )
   public static int field3878;
   @OriginalMember(
      owner = "client!tia",
      name = "L",
      descriptor = "I"
   )
   public static int field3882;

   @OriginalMember(
      owner = "client!tia",
      name = "b",
      descriptor = "(IZI)Ljava/lang/String;"
   )
   public static final String method2137(int arg0, boolean arg1, int arg2) {
      try {
         ++field3877;
         if (arg2 != 0) {
            field3884 = true;
         }

         return arg1 && arg0 >= 0 ? class427.method3251(arg1, 10, arg2 + -92, arg0) : Integer.toString(arg0);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field3885[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tia",
      name = "c",
      descriptor = "(B)V"
   )
   public static void method2138(byte arg0) {
      try {
         field3879 = null;
         if (arg0 <= 26) {
            method2138((byte)41);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field3885[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tia",
      name = "a",
      descriptor = "(BI)[[I"
   )
   public final int[][] method245(byte arg0, int arg1) {
      int var3 = client.field4530;

      try {
         ++field3878;
         int[][] var4 = super.field4292.method3409(arg1, 0);
         if (super.field4292.field6892) {
            label90: {
               int[][] var5 = this.method2297(0, arg1, 0);
               int[] var6 = var5[0];
               int[] var7 = var5[1];
               int[] var8 = var5[2];
               int[] var9 = var4[0];
               int[] var10 = var4[1];
               int[] var11 = var4[2];
               int var12 = 0;
               int var13;
               int var14;
               if (var3 != 0) {
                  var13 = var6[var12];
                  var14 = -this.field3874[0] + var13;
                  if (var14 < 0) {
                     var14 = -var14;
                  }
               } else {
                  if (~class344.field5238 >= ~var12) {
                     break label90;
                  }

                  var13 = var6[var12];
                  var14 = -this.field3874[0] + var13;
                  if (var14 < 0) {
                     var14 = -var14;
                  }
               }

               while(true) {
                  label97: {
                     int var15;
                     int var16;
                     if (this.field3876 < var14) {
                        var9[var12] = var13;
                        var10[var12] = var7[var12];
                        var11[var12] = var8[var12];
                        if (var3 == 0) {
                           ++var12;
                           break label97;
                        }

                        var15 = var7[var12];
                        var16 = -this.field3874[1] + var15;
                        if (var16 < 0) {
                           var16 = -var16;
                        }
                     } else {
                        var15 = var7[var12];
                        var16 = -this.field3874[1] + var15;
                        if (var16 < 0) {
                           var16 = -var16;
                        }
                     }

                     int var17;
                     int var18;
                     if (~var16 < ~this.field3876) {
                        var9[var12] = var13;
                        var10[var12] = var15;
                        var11[var12] = var8[var12];
                        if (var3 == 0) {
                           ++var12;
                           break label97;
                        }

                        var17 = var8[var12];
                        var18 = -this.field3874[2] + var17;
                        if (var18 < 0) {
                           var18 = -var18;
                        }
                     } else {
                        var17 = var8[var12];
                        var18 = -this.field3874[2] + var17;
                        if (var18 < 0) {
                           var18 = -var18;
                        }
                     }

                     if (this.field3876 < var18) {
                        var9[var12] = var13;
                        var10[var12] = var15;
                        var11[var12] = var17;
                        if (var3 != 0) {
                           var9[var12] = this.field3880 * var13 >> 12;
                           var10[var12] = this.field3881 * var15 >> 12;
                           var11[var12] = this.field3883 * var17 >> 12;
                           ++var12;
                        } else {
                           ++var12;
                        }
                     } else {
                        var9[var12] = this.field3880 * var13 >> 12;
                        var10[var12] = this.field3881 * var15 >> 12;
                        var11[var12] = this.field3883 * var17 >> 12;
                        ++var12;
                     }
                  }

                  if (~class344.field5238 >= ~var12) {
                     break;
                  }

                  var13 = var6[var12];
                  var14 = -this.field3874[0] + var13;
                  if (var14 < 0) {
                     var14 = -var14;
                  }
               }
            }
         }

         if (arg0 != -90) {
            this.method244(-48, -69, (class128)null);
         }

         return var4;
      } catch (RuntimeException var20) {
         throw class670.method4877(var20, field3885[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tia",
      name = "<init>",
      descriptor = "()V"
   )
   public class278() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!tia",
      name = "c",
      descriptor = "(III)V"
   )
   public static final void method2139(int arg0, int arg1, int arg2) {
      try {
         if (arg2 != -26219) {
            method2138((byte)8);
         }

         ++field3875;
         class82.field999 = -class329.field4696 + arg1;
         class303.field4325 = arg0 - class329.field4688;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field3885[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tia",
      name = "a",
      descriptor = "(IILjj;)V"
   )
   public final void method244(int arg0, int arg1, class128 arg2) {
      int var4 = client.field4530;

      try {
         label64: {
            label63: {
               label62: {
                  label61: {
                     label60: {
                        if (arg0 != 0) {
                           if (~arg0 == -2) {
                              break label60;
                           }

                           if (~arg0 == -3) {
                              break label61;
                           }

                           if (~arg0 == -4) {
                              break label62;
                           }

                           if (~arg0 != -5) {
                              break label64;
                           }

                           if (var4 == 0) {
                              break label63;
                           }
                        }

                        this.field3876 = arg2.method1038((byte)-108);
                        if (var4 == 0) {
                           break label64;
                        }
                     }

                     this.field3883 = arg2.method1038((byte)-98);
                     if (var4 == 0) {
                        break label64;
                     }
                  }

                  this.field3881 = arg2.method1038((byte)-110);
                  if (var4 == 0) {
                     break label64;
                  }
               }

               this.field3880 = arg2.method1038((byte)-121);
               if (var4 == 0) {
                  break label64;
               }
            }

            int var6 = arg2.method1077(-33);
            this.field3874[0] = class153.method1262(16711680, var6) << 4;
            this.field3874[1] = class153.method1262(var6 >> 4, 4080);
            this.field3874[2] = class153.method1262(var6, 255) >> 12;
         }

         ++field3882;
         if (arg1 != 0) {
            this.field3874 = null;
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field3885[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3885[3] : field3885[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2140(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 4);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2141(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 113;
            break;
         case 1:
            var10005 = 64;
            break;
         case 2:
            var10005 = 97;
            break;
         case 3:
            var10005 = 18;
            break;
         default:
            var10005 = 4;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
