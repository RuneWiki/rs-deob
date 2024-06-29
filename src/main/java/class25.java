import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class25 extends class213 {
   @OriginalMember(
      owner = "client!an",
      name = "K",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field326 = new String[]{method219(method218("S\u001e9\u000e\u001b")), method219(method218("S\u001e9\r\u001b")), method219(method218("S\u001e9\f\u001b")), method219(method218("S\u001e9\u000b\u001b")), method219(method218("S\u001e9\u0005\u001b")), method219(method218("I^9aN")), method219(method218("S\u001e9\b\u001b")), method219(method218("\\\u0005{#"))};
   @OriginalMember(
      owner = "client!an",
      name = "G",
      descriptor = "Lnw;"
   )
   public static class616 field319 = new class616(38, 4);
   @OriginalMember(
      owner = "client!an",
      name = "H",
      descriptor = "Lw;"
   )
   public static class317 field322 = new class317();
   @OriginalMember(
      owner = "client!an",
      name = "F",
      descriptor = "I"
   )
   public static int field324 = -1;
   @OriginalMember(
      owner = "client!an",
      name = "L",
      descriptor = "Lbga;"
   )
   public static class378 field325 = new class378(130, 6);
   @OriginalMember(
      owner = "client!an",
      name = "D",
      descriptor = "I"
   )
   public static int field314;
   @OriginalMember(
      owner = "client!an",
      name = "J",
      descriptor = "I"
   )
   public static int field316;
   @OriginalMember(
      owner = "client!an",
      name = "M",
      descriptor = "I"
   )
   public static int field317;
   @OriginalMember(
      owner = "client!an",
      name = "N",
      descriptor = "I"
   )
   public static int field318;
   @OriginalMember(
      owner = "client!an",
      name = "O",
      descriptor = "I"
   )
   public static int field320;
   @OriginalMember(
      owner = "client!an",
      name = "P",
      descriptor = "I"
   )
   public static int field321;
   @OriginalMember(
      owner = "client!an",
      name = "I",
      descriptor = "Ljm;"
   )
   public static class720 field315;
   @OriginalMember(
      owner = "client!an",
      name = "E",
      descriptor = "[I"
   )
   public static int[] field323;

   @OriginalMember(
      owner = "client!an",
      name = "a",
      descriptor = "(IB)[[I"
   )
   public final int[][] method212(int arg0, byte arg1) {
      boolean var3 = client.field4273;

      try {
         ++field316;
         int[][] var4 = super.field2644.method3543(-2, arg0);
         if (arg1 < 26) {
            return null;
         } else {
            if (super.field2644.field6719) {
               int[] var5 = this.method1619((byte)124, arg0, 2);
               int[][] var6 = this.method1615(true, arg0, 0);
               int[][] var7 = this.method1615(true, arg0, 1);
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
               if (var3 || ~class576.field7916 < ~var17) {
                  do {
                     int var18 = var5[var17];
                     if (~var18 != -4097) {
                        if (~var18 == -1) {
                           var8[var17] = var14[var17];
                           var9[var17] = var15[var17];
                           var10[var17] = var16[var17];
                           if (!var3) {
                              ++var17;
                              continue;
                           }
                        }

                        int var19 = -var18 + 4096;
                        var8[var17] = var11[var17] * var18 + var14[var17] * var19 >> 12;
                        var9[var17] = var12[var17] * var18 - -(var15[var17] * var19) >> 12;
                        var10[var17] = var13[var17] * var18 + var16[var17] * var19 >> 12;
                        if (var3) {
                           var8[var17] = var11[var17];
                           var9[var17] = var12[var17];
                           var10[var17] = var13[var17];
                           ++var17;
                        } else {
                           ++var17;
                        }
                     } else {
                        var8[var17] = var11[var17];
                        var9[var17] = var12[var17];
                        var10[var17] = var13[var17];
                        ++var17;
                     }
                  } while(~class576.field7916 < ~var17);
               }
            }

            return var4;
         }
      } catch (RuntimeException var21) {
         throw class534.method3846(var21, field326[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!an",
      name = "g",
      descriptor = "(I)V"
   )
   public static void method213(int arg0) {
      try {
         field325 = null;
         if (arg0 != 0) {
            method216(3, true);
         }

         field319 = null;
         field323 = null;
         field322 = null;
         field315 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field326[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!an",
      name = "b",
      descriptor = "(IB)Z"
   )
   public static final boolean method214(int arg0, byte arg1) {
      try {
         if (arg1 != -46) {
            field324 = 116;
         }

         ++field321;
         return ~arg0 <= -5 && arg0 <= 8;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field326[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!an",
      name = "<init>",
      descriptor = "()V"
   )
   public class25() {
      super(3, false);
   }

   @OriginalMember(
      owner = "client!an",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method215(int arg0, int arg1) {
      boolean var3 = client.field4273;

      try {
         ++field317;
         if (arg1 != 2064866508) {
            method216(-112, true);
         }

         int[] var4 = super.field2650.method3769(arg0, -4);
         if (super.field2650.field7140) {
            int[] var5 = this.method1619((byte)47, arg0, 0);
            int[] var6 = this.method1619((byte)39, arg0, 1);
            int[] var7 = this.method1619((byte)56, arg0, 2);
            int var8 = 0;
            if (var3 || class576.field7916 > var8) {
               do {
                  int var9 = var7[var8];
                  if (~var9 != -4097) {
                     if (~var9 != -1) {
                        var4[var8] = var5[var8] * var9 - -((-var9 + 4096) * var6[var8]) >> 12;
                        if (!var3) {
                           ++var8;
                           continue;
                        }
                     }

                     var4[var8] = var6[var8];
                     if (var3) {
                        var4[var8] = var5[var8];
                        ++var8;
                     } else {
                        ++var8;
                     }
                  } else {
                     var4[var8] = var5[var8];
                     ++var8;
                  }
               } while(class576.field7916 > var8);
            }
         }

         return var4;
      } catch (RuntimeException var11) {
         throw class534.method3846(var11, field326[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!an",
      name = "b",
      descriptor = "(IZ)I"
   )
   public static final int method216(int arg0, boolean arg1) {
      try {
         ++field320;
         if (class671.field9873 == null) {
            return 0;
         } else if (!arg1 && class271.field3594 != null) {
            return class671.field9873.length * 2;
         } else {
            int var2 = 0;
            int var3 = 0;
            int var4 = -126 % ((9 - arg0) / 61);

            while(var3 < class671.field9873.length) {
               int var5 = class671.field9873[var3];
               if (class240.field2987.method717(var5, (byte)-58)) {
                  ++var2;
               }

               if (class14.field185.method717(var5, (byte)-58)) {
                  ++var2;
               }

               ++var3;
            }

            return var2;
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field326[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!an",
      name = "a",
      descriptor = "(Lwm;II)V"
   )
   public final void method217(class594 arg0, int arg1, int arg2) {
      try {
         int var4 = -90 % ((arg1 - 68) / 48);
         if (arg2 == 0) {
            super.field2645 = arg0.method4288((byte)102) == 1;
         }

         ++field314;
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field326[6] + (arg0 != null ? field326[5] : field326[7]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!an",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method218(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 51);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!an",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method219(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 50;
            break;
         case 1:
            var10005 = 112;
            break;
         case 2:
            var10005 = 23;
            break;
         case 3:
            var10005 = 79;
            break;
         default:
            var10005 = 51;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
