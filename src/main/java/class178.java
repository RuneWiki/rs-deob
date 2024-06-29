import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class178 extends class264 {
   @OriginalMember(
      owner = "client!uh",
      name = "G",
      descriptor = "Z"
   )
   private boolean field2457 = true;
   @OriginalMember(
      owner = "client!uh",
      name = "J",
      descriptor = "Z"
   )
   private boolean field2461 = true;
   @OriginalMember(
      owner = "client!uh",
      name = "O",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2464 = new String[]{method1430(method1429("\fE/d\u0011")), method1430(method1429("\fE/`\u0011")), method1430(method1429("\fE/b\u0011")), method1430(method1429("\u0017XmK")), method1430(method1429("\u0002\u0003/\tD")), method1430(method1429("\fE/f\u0011")), method1430(method1429("\fE/e\u0011")), method1430(method1429("\fE/c\u0011"))};
   @OriginalMember(
      owner = "client!uh",
      name = "N",
      descriptor = "[F"
   )
   public static float[] field2455 = new float[16];
   @OriginalMember(
      owner = "client!uh",
      name = "K",
      descriptor = "[I"
   )
   public static int[] field2460 = new int[13];
   @OriginalMember(
      owner = "client!uh",
      name = "H",
      descriptor = "I"
   )
   public static int field2456;
   @OriginalMember(
      owner = "client!uh",
      name = "L",
      descriptor = "I"
   )
   public static int field2458;
   @OriginalMember(
      owner = "client!uh",
      name = "M",
      descriptor = "I"
   )
   public static int field2459;
   @OriginalMember(
      owner = "client!uh",
      name = "F",
      descriptor = "I"
   )
   public static int field2462;
   @OriginalMember(
      owner = "client!uh",
      name = "I",
      descriptor = "I"
   )
   public static int field2463;

   @OriginalMember(
      owner = "client!uh",
      name = "a",
      descriptor = "(ILwf;I)V"
   )
   public final void method3(int arg0, class147 arg1, int arg2) {
      try {
         ++field2462;
         if (arg2 <= 49) {
            this.field2461 = false;
         }

         if (arg0 != 0) {
            if (arg0 == 1) {
               this.field2461 = ~arg1.method1143(-15465) == -2;
               return;
            }

            if (arg0 != 2) {
               return;
            }

            if (!client.field4360) {
               super.field3637 = ~arg1.method1143(-15465) == -2;
               return;
            }
         }

         this.field2457 = ~arg1.method1143(-15465) == -2;
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field2464[5] + arg0 + ',' + (arg1 != null ? field2464[4] : field2464[3]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uh",
      name = "a",
      descriptor = "(IIBIIIIIII)V"
   )
   public static final void method1426(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
      boolean var10 = client.field4360;

      try {
         if (arg2 == -67) {
            ++field2458;
            if (~arg4 == ~arg6 && ~arg0 == ~arg1 && arg3 == arg9 && ~arg5 == ~arg7) {
               class57.method444(arg9, arg7, arg4, arg8, arg1, (byte)-116);
            } else {
               int var11 = arg4;
               int var12 = arg1;
               int var13 = arg4 * 3;
               int var14 = arg1 * 3;
               int var15 = arg6 * 3;
               int var16 = arg0 * 3;
               int var17 = arg3 * 3;
               int var18 = arg5 * 3;
               int var19 = arg9 - (var17 - var15) + -arg4;
               int var20 = arg7 - arg1 + -var18 + var16;
               int var21 = -var15 - -var13 + -var15 + var17;
               int var22 = -var16 + var14 + -var16 + var18;
               int var23 = -var13 + var15;
               int var24 = -var14 + var16;
               int var25 = 128;
               if (var10 || ~var25 >= -4097) {
                  do {
                     int var26 = var25 * var25 >> 12;
                     int var27 = var25 * var26 >> 12;
                     int var28 = var19 * var27;
                     int var29 = var20 * var27;
                     int var30 = var21 * var26;
                     int var31 = var22 * var26;
                     int var32 = var23 * var25;
                     int var33 = var24 * var25;
                     int var34 = (var28 + var32 - -var30 >> 12) + arg4;
                     int var35 = (var31 + var33 + var29 >> 12) + arg1;
                     class57.method444(var34, var35, var11, arg8, var12, (byte)-96);
                     var12 = var35;
                     var11 = var34;
                     var25 += 128;
                  } while(~var25 >= -4097);

               }
            }
         }
      } catch (RuntimeException var37) {
         throw class237.method1823(var37, field2464[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uh",
      name = "a",
      descriptor = "(IILha;ILbl;)V"
   )
   public static final void method1427(int param0, int param1, class66 param2, int param3, class678 param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!uh",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method6(int arg0, int arg1) {
      boolean var3 = client.field4360;

      try {
         int var4 = -59 / ((arg1 - 24) / 44);
         ++field2456;
         int[] var5 = super.field3641.method3079(-14361, arg0);
         if (super.field3641.field5922) {
            int[] var6 = this.method2019(0, -27804, !this.field2461 ? arg0 : -arg0 + class220.field3144);
            if (this.field2457) {
               int var7 = 0;
               if (var3) {
                  var5[var7] = var6[class78.field967 - var7];
                  ++var7;
               }

               while(true) {
                  while(~var7 > ~class430.field6152) {
                     var5[var7] = var6[class78.field967 - var7];
                     ++var7;
                  }

                  if (!var3) {
                     if (!var3) {
                        return var5;
                     }
                     break;
                  }

                  ++var7;
               }
            }

            class242.method1853(var6, 0, var5, 0, class430.field6152);
         }

         return var5;
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field2464[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uh",
      name = "<init>",
      descriptor = "()V"
   )
   public class178() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!uh",
      name = "c",
      descriptor = "(Z)V"
   )
   public static void method1428(boolean arg0) {
      try {
         field2455 = null;
         field2460 = null;
         if (arg0) {
            field2455 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field2464[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uh",
      name = "a",
      descriptor = "(IB)[[I"
   )
   public final int[][] method4(int arg0, byte arg1) {
      boolean var3 = client.field4360;

      try {
         if (arg1 > -117) {
            this.method6(-41, 45);
         }

         ++field2463;
         int[][] var4 = super.field3634.method4362((byte)116, arg0);
         if (super.field3634.field8828) {
            int[][] var5 = this.method2015(0, (byte)76, this.field2461 ? -arg0 + class220.field3144 : arg0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            if (this.field2457) {
               int var12 = 0;
               if (var3) {
                  var9[var12] = var6[-var12 + class78.field967];
                  var10[var12] = var7[-var12 + class78.field967];
                  var11[var12] = var8[-var12 + class78.field967];
                  ++var12;
               }

               while(true) {
                  while(var12 < class430.field6152) {
                     var9[var12] = var6[-var12 + class78.field967];
                     var10[var12] = var7[-var12 + class78.field967];
                     var11[var12] = var8[-var12 + class78.field967];
                     ++var12;
                  }

                  if (!var3) {
                     if (!var3) {
                        return var4;
                     }
                     break;
                  }

                  ++var12;
               }
            }

            int var13 = 0;
            if (var3 || ~var13 > ~class430.field6152) {
               do {
                  var9[var13] = var6[var13];
                  var10[var13] = var7[var13];
                  var11[var13] = var8[var13];
                  ++var13;
               } while(~var13 > ~class430.field6152);
            }
         }

         return var4;
      } catch (RuntimeException var15) {
         throw class237.method1823(var15, field2464[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1429(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 57);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1430(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 121;
            break;
         case 1:
            var10005 = 45;
            break;
         case 2:
            var10005 = 1;
            break;
         case 3:
            var10005 = 39;
            break;
         default:
            var10005 = 57;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
