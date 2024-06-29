import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class784 {
   @OriginalMember(
      owner = "client!lr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11431 = new String[]{method5639(method5638("\u0000a@\"\u0012")), method5639(method5638("\u0017=@OG")), method5639(method5638("\u0000a@ \u0012")), method5639(method5638("\u0002f\u0002\r")), method5639(method5638("\u0000a@#\u0012")), method5639(method5638("\u0000a@$\u0012")), method5639(method5638("\u0000a@'\u0012")), method5639(method5638("\u0000a@%\u0012"))};
   @OriginalMember(
      owner = "client!lr",
      name = "i",
      descriptor = "Z"
   )
   public static boolean field11427 = false;
   @OriginalMember(
      owner = "client!lr",
      name = "c",
      descriptor = "I"
   )
   public static int field11422;
   @OriginalMember(
      owner = "client!lr",
      name = "g",
      descriptor = "I"
   )
   public int field11424;
   @OriginalMember(
      owner = "client!lr",
      name = "j",
      descriptor = "I"
   )
   public static int field11425;
   @OriginalMember(
      owner = "client!lr",
      name = "h",
      descriptor = "I"
   )
   public static int field11426;
   @OriginalMember(
      owner = "client!lr",
      name = "a",
      descriptor = "I"
   )
   public static int field11428;
   @OriginalMember(
      owner = "client!lr",
      name = "f",
      descriptor = "I"
   )
   public static int field11429;
   @OriginalMember(
      owner = "client!lr",
      name = "d",
      descriptor = "I"
   )
   private int field11430;
   @OriginalMember(
      owner = "client!lr",
      name = "b",
      descriptor = "Lsd;"
   )
   public static class101 field11423;
   @OriginalMember(
      owner = "client!lr",
      name = "e",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field11421;

   @OriginalMember(
      owner = "client!lr",
      name = "b",
      descriptor = "(B)I"
   )
   public final int method5632(byte arg0) {
      try {
         ++field11429;
         if (arg0 > -57) {
            this.method5636(false, 9);
         }

         return 16383 & this.field11424;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field11431[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lr",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method5633(byte arg0) {
      try {
         field11423 = null;
         field11421 = null;
         int var1 = -61 / ((41 - arg0) / 60);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field11431[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lr",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method5634(int arg0) {
      try {
         this.field11424 &= 16383;
         if (arg0 != -32515) {
            this.field11424 = -102;
         }

         ++field11428;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field11431[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lr",
      name = "a",
      descriptor = "(IIII)Z"
   )
   public final boolean method5635(int arg0, int arg1, int arg2, int arg3) {
      int var5 = client.field4530;

      try {
         ++field11425;
         int var6 = this.field11430;
         if (this.field11424 == arg1 && ~this.field11430 == -1) {
            return false;
         } else {
            boolean var7;
            label167: {
               if (this.field11430 == arg2) {
                  if (this.field11424 < arg1 && ~arg1 >= ~(this.field11424 + arg0) || this.field11424 > arg1 && arg1 >= -arg0 + this.field11424) {
                     this.field11424 = arg1;
                     return false;
                  }

                  var7 = true;
                  if (var5 == 0) {
                     break label167;
                  }
               }

               if (~this.field11430 >= -1 || ~arg1 >= ~this.field11424) {
                  if (~this.field11430 <= -1 || this.field11424 <= arg1) {
                     var7 = false;
                     if (var5 == 0) {
                        break label167;
                     }
                  }

                  int var8 = this.field11430 * this.field11430 / (arg0 * 2);
                  int var9 = this.field11424 - var8;
                  if (arg1 >= var9 || ~var9 < ~this.field11424) {
                     var7 = false;
                     if (var5 == 0) {
                        break label167;
                     }
                  }

                  var7 = true;
                  if (var5 == 0) {
                     break label167;
                  }
               }

               int var10 = this.field11430 * this.field11430 / (arg0 * 2);
               int var11 = this.field11424 + var10;
               if (var11 >= arg1 || ~this.field11424 < ~var11) {
                  var7 = false;
                  if (var5 == 0) {
                     break label167;
                  }
               }

               var7 = true;
            }

            label160: {
               if (!var7) {
                  if (this.field11430 <= 0) {
                     this.field11430 += arg0;
                     if (~this.field11430 >= -1) {
                        break label160;
                     }

                     this.field11430 = 0;
                     if (var5 == 0) {
                        break label160;
                     }
                  }

                  this.field11430 -= arg0;
                  if (this.field11430 >= 0) {
                     break label160;
                  }

                  this.field11430 = 0;
                  if (var5 == 0) {
                     break label160;
                  }
               }

               label99: {
                  if (~arg1 >= ~this.field11424) {
                     this.field11430 -= arg0;
                     if (arg3 == 0 || -arg3 <= this.field11430) {
                        break label99;
                     }

                     this.field11430 = -arg3;
                     if (var5 == 0) {
                        break label99;
                     }
                  }

                  this.field11430 += arg0;
                  if (arg3 != 0 && ~this.field11430 < ~arg3) {
                     this.field11430 = arg3;
                  }
               }

               if (~this.field11430 != ~var6) {
                  label90: {
                     int var12 = this.field11430 * this.field11430 / (arg0 * 2);
                     if (this.field11424 >= arg1) {
                        if (this.field11424 <= arg1 || arg1 <= -var12 + this.field11424) {
                           break label90;
                        }

                        this.field11430 = var6;
                        if (var5 == 0) {
                           break label90;
                        }
                     }

                     if (~arg1 > ~(this.field11424 - -var12)) {
                        this.field11430 = var6;
                     }
                  }
               }
            }

            this.field11424 += this.field11430 + var6 >> 1;
            return var7;
         }
      } catch (RuntimeException var14) {
         throw class670.method4877(var14, field11431[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lr",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method5636(boolean arg0, int arg1) {
      try {
         this.field11430 = 0;
         this.field11424 = arg1;
         if (!arg0) {
            this.method5636(true, -74);
         }

         ++field11426;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field11431[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lr",
      name = "a",
      descriptor = "([FBI)[F"
   )
   public static final float[] method5637(float[] arg0, byte arg1, int arg2) {
      try {
         ++field11422;
         if (arg1 != 0) {
            field11421 = null;
         }

         float[] var3 = new float[arg2];
         class195.method1491(arg0, 0, var3, 0, arg2);
         return var3;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field11431[2] + (arg0 != null ? field11431[1] : field11431[3]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5638(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 58);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5639(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 108;
            break;
         case 1:
            var10005 = 19;
            break;
         case 2:
            var10005 = 110;
            break;
         case 3:
            var10005 = 97;
            break;
         default:
            var10005 = 58;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
