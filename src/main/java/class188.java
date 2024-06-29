import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class188 extends class629 {
   @OriginalMember(
      owner = "client!sq",
      name = "J",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2837 = new String[]{method1646(method1645(")^<4h")), method1646(method1645(")^<0h")), method1646(method1645(")^<;h")), method1646(method1645("!\u0001<P=")), method1646(method1645("4Z~\u0012")), method1646(method1645(")^<2h")), method1646(method1645(")^<3h"))};
   @OriginalMember(
      owner = "client!sq",
      name = "G",
      descriptor = "I"
   )
   public static int field2831;
   @OriginalMember(
      owner = "client!sq",
      name = "I",
      descriptor = "I"
   )
   public static int field2832;
   @OriginalMember(
      owner = "client!sq",
      name = "F",
      descriptor = "I"
   )
   public static int field2833;
   @OriginalMember(
      owner = "client!sq",
      name = "E",
      descriptor = "I"
   )
   public static int field2834;
   @OriginalMember(
      owner = "client!sq",
      name = "D",
      descriptor = "I"
   )
   public static int field2835;
   @OriginalMember(
      owner = "client!sq",
      name = "H",
      descriptor = "I"
   )
   public static int field2836;

   @OriginalMember(
      owner = "client!sq",
      name = "a",
      descriptor = "(IIIIIIB)V",
      line = 4
   )
   public static final void method1643(int param0, int param1, int param2, int param3, int param4, int param5, byte param6) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!sq",
      name = "a",
      descriptor = "(Luda;II)V",
      line = 137
   )
   public final void method241(class473 arg0, int arg1, int arg2) {
      try {
         ++field2831;
         if (~arg2 == -1) {
            super.field9166 = arg0.method3564((byte)-126) == 1;
         }

         if (arg1 == 0) {
            ;
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field2837[2] + (arg0 != null ? field2837[3] : field2837[4]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sq",
      name = "a",
      descriptor = "(IIIIIIII)V",
      line = 151
   )
   public static final void method1644(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      try {
         ++field2833;
         if (arg6 == 3) {
            if (~arg1 <= ~class515.field7502 && ~class130.field2163 <= ~arg2 && ~arg3 <= ~class3.field16 && ~arg7 >= ~class581.field8354) {
               class303.method2360(arg5, arg4, arg0, (byte)-117, arg2, arg7, arg1, arg3);
            } else {
               class547.method4085(arg2, arg1, arg0, arg5, arg4, arg3, (byte)97, arg7);
            }
         }
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field2837[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sq",
      name = "b",
      descriptor = "(II)[I",
      line = 169
   )
   public final int[] method45(int arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         ++field2834;
         int[] var4 = super.field9161.method3870((byte)56, arg0);
         if (super.field9161.field7474) {
            int[] var5 = this.method4622((byte)117, 0, arg0);
            int[] var6 = this.method4622((byte)125, 1, arg0);
            int[] var7 = this.method4622((byte)119, 2, arg0);
            int var8 = 0;
            if (var3 || ~var8 > ~class66.field1214) {
               do {
                  int var9 = var7[var8];
                  if (~var9 != -4097) {
                     if (var9 != 0) {
                        var4[var8] = (4096 - var9) * var6[var8] + var5[var8] * var9 >> 12;
                        if (var3) {
                           var4[var8] = var6[var8];
                           if (var3) {
                              var4[var8] = var5[var8];
                              ++var8;
                           } else {
                              ++var8;
                           }
                        } else {
                           ++var8;
                        }
                     } else {
                        var4[var8] = var6[var8];
                        if (var3) {
                           var4[var8] = var5[var8];
                           ++var8;
                        } else {
                           ++var8;
                        }
                     }
                  } else {
                     var4[var8] = var5[var8];
                     ++var8;
                  }
               } while(~var8 > ~class66.field1214);
            }
         }

         if (arg1 != 2048) {
            this.method243(84, -39);
         }

         return var4;
      } catch (RuntimeException var11) {
         throw class608.method4462(var11, field2837[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sq",
      name = "a",
      descriptor = "(II)[[I",
      line = 223
   )
   public final int[][] method243(int arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         ++field2832;
         int[][] var4 = super.field9169.method785((byte)64, arg0);
         if (arg1 != 0) {
            return null;
         } else {
            if (super.field9169.field1332) {
               int[] var5 = this.method4622((byte)121, 2, arg0);
               int[][] var6 = this.method4621(65, 0, arg0);
               int[][] var7 = this.method4621(arg1 ^ -112, 1, arg0);
               int[] var8 = var4[0];
               int[] var9 = var4[1];
               int[] var10 = var4[2];
               int[] var11 = var6[0];
               int[] var12 = var6[1];
               int[] var13 = var6[2];
               int[] var14 = var7[0];
               int[] var15 = var7[1];
               int[] var16 = var7[2];
               int var17 = 0;
               if (var3 || var17 < class66.field1214) {
                  do {
                     int var18 = var5[var17];
                     if (var18 == 4096) {
                        var8[var17] = var11[var17];
                        var9[var17] = var12[var17];
                        var10[var17] = var13[var17];
                        if (!var3) {
                           ++var17;
                           continue;
                        }
                     }

                     if (~var18 != -1) {
                        int var19 = 4096 - var18;
                        var8[var17] = var11[var17] * var18 - -(var14[var17] * var19) >> 12;
                        var9[var17] = var12[var17] * var18 + var15[var17] * var19 >> 12;
                        var10[var17] = var13[var17] * var18 + var16[var17] * var19 >> 12;
                        if (!var3) {
                           ++var17;
                           continue;
                        }
                     }

                     var8[var17] = var14[var17];
                     var9[var17] = var15[var17];
                     var10[var17] = var16[var17];
                     ++var17;
                  } while(var17 < class66.field1214);
               }
            }

            return var4;
         }
      } catch (RuntimeException var21) {
         throw class608.method4462(var21, field2837[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sq",
      name = "<init>",
      descriptor = "()V",
      line = 303
   )
   public class188() {
      super(3, false);
   }

   @OriginalMember(
      owner = "client!sq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1645(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 64);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1646(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 90;
            break;
         case 1:
            var10005 = 47;
            break;
         case 2:
            var10005 = 18;
            break;
         case 3:
            var10005 = 126;
            break;
         default:
            var10005 = 64;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
