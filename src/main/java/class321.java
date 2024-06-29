import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public class class321 extends class246 {
   @OriginalMember(
      owner = "client!bv",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4631 = new String[]{method2508(method2507("\u001fF\u0010&\u0003")), method2508(method2507("\u001fF\u0010\"\u0003")), method2508(method2507("\u001fF\u0010'\u0003")), method2508(method2507("\u0006\u001e\u0010JV")), method2508(method2507("\u0013ER\b")), method2508(method2507("\u001fF\u0010 \u0003")), method2508(method2507("\u001fF\u0010!\u0003")), method2508(method2507("\u001fF\u0010%\u0003")), method2508(method2507("\u0015G\r\u0000")), method2508(method2507("\u0017Q]\bB\u001f"))};
   @OriginalMember(
      owner = "client!bv",
      name = "l",
      descriptor = "Luw;"
   )
   public static class435 field4625 = new class435(31, 3);
   @OriginalMember(
      owner = "client!bv",
      name = "n",
      descriptor = "[I"
   )
   public static int[] field4628 = new int[256];
   @OriginalMember(
      owner = "client!bv",
      name = "r",
      descriptor = "I"
   )
   public static int field4621;
   @OriginalMember(
      owner = "client!bv",
      name = "p",
      descriptor = "I"
   )
   public static int field4624;
   @OriginalMember(
      owner = "client!bv",
      name = "s",
      descriptor = "I"
   )
   public static int field4626;
   @OriginalMember(
      owner = "client!bv",
      name = "q",
      descriptor = "I"
   )
   public static int field4627;
   @OriginalMember(
      owner = "client!bv",
      name = "m",
      descriptor = "I"
   )
   public static int field4629;
   @OriginalMember(
      owner = "client!bv",
      name = "k",
      descriptor = "Lvca;"
   )
   public class294 field4623;
   @OriginalMember(
      owner = "client!bv",
      name = "j",
      descriptor = "Z"
   )
   public boolean field4622;
   @OriginalMember(
      owner = "client!bv",
      name = "o",
      descriptor = "[Lija;"
   )
   public class362[] field4630;

   @OriginalMember(
      owner = "client!bv",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public static final void method2501(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var7 = client.field4564;

      try {
         class767[] var8 = class569.field8247;
         int var9 = arg0;
         if (!var7 && ~arg0 <= ~var8.length) {
            ++field4626;
         } else {
            do {
               class767 var10 = var8[var9];
               if (var10 != null) {
                  if (~var10.field11124 != -3 && !var7) {
                     ++var9;
                  } else {
                     class192.method1674(var10.field11125 * 2, var10.field11132, arg3, var10.field11127, var10.field11123, arg1 >> 1, (byte)54, arg6 >> 1, arg4);
                     if (~class409.field6005[0] < 0 && class29.field458 % 20 < 10) {
                        class476 var11 = class426.field6175[var10.field11134];
                        int var12 = arg2 + -12 + class409.field6005[0];
                        int var13 = arg5 - (-class409.field6005[1] + 28);
                        var11.method3609(var12, var13);
                        class670.method4896(var11.method3009() + var12, arg0, var12, var11.method3000() + var13, var13);
                     }

                     ++var9;
                  }
               } else {
                  ++var9;
               }
            } while(~var9 > ~var8.length);

            ++field4626;
         }
      } catch (RuntimeException var15) {
         throw class608.method4462(var15, field4631[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bv",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method2502(int arg0, int arg1, int arg2) {
      try {
         ++field4624;
         if (arg0 != -16941) {
            field4628 = null;
         }

         return (arg2 & 2048) != 0;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field4631[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bv",
      name = "a",
      descriptor = "(IIBIIIIIII)V"
   )
   public static final void method2503(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
      boolean var10 = client.field4564;

      try {
         label47: {
            if (arg4 == arg7 && arg1 == arg5 && arg0 == arg8 && arg6 == arg9) {
               class495.method3732(arg3, arg4, arg0, -1, arg6, arg1);
               if (!var10) {
                  break label47;
               }
            }

            int var11 = arg4;
            int var12 = arg1;
            int var13 = arg4 * 3;
            int var14 = arg1 * 3;
            int var15 = arg7 * 3;
            int var16 = arg5 * 3;
            int var17 = arg8 * 3;
            int var18 = arg9 * 3;
            int var19 = arg0 + var15 + -arg4 + -var17;
            int var20 = arg6 + var16 + -arg1 - var18;
            int var21 = -var15 + var13 + -var15 + var17;
            int var22 = -var16 + var14 + -var16 + var18;
            int var23 = -var13 + var15;
            int var24 = -var14 + var16;
            int var25 = 128;
            if (var10 || var25 <= 4096) {
               do {
                  int var26 = var25 * var25 >> 12;
                  int var27 = var25 * var26 >> 12;
                  int var28 = var19 * var27;
                  int var29 = var20 * var27;
                  int var30 = var21 * var26;
                  int var31 = var22 * var26;
                  int var32 = var23 * var25;
                  int var33 = var24 * var25;
                  int var34 = (var28 + var30 + var32 >> 12) + arg4;
                  int var35 = (var29 + var31 + var33 >> 12) + arg1;
                  class495.method3732(arg3, var11, var34, arg2 + 96, var35, var12);
                  var11 = var34;
                  var12 = var35;
                  var25 += 128;
               } while(var25 <= 4096);
            }
         }

         ++field4629;
         if (arg2 != -97) {
            field4625 = null;
         }
      } catch (RuntimeException var37) {
         throw class608.method4462(var37, field4631[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bv",
      name = "a",
      descriptor = "(ILha;II)Z"
   )
   public final boolean method2504(int arg0, class65 arg1, int arg2, int arg3) {
      boolean var5 = client.field4564;

      try {
         ++field4627;
         if (arg2 != 0) {
            return false;
         } else {
            int var6 = this.field4623.method2114(9549);
            if (this.field4630 != null) {
               int var7 = 0;
               if (var5 || ~this.field4630.length < ~var7) {
                  do {
                     this.field4630[var7].field5409 <<= var6;
                     if (this.field4630[var7].method2836(arg0, arg3) && this.field4623.method582(arg3, arg0, -119, arg1)) {
                        this.field4630[var7].field5409 >>= var6;
                        return true;
                     }

                     this.field4630[var7].field5409 >>= var6;
                     ++var7;
                  } while(~this.field4630.length < ~var7);
               }
            }

            return false;
         }
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field4631[5] + arg0 + ',' + (arg1 != null ? field4631[3] : field4631[4]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bv",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2505(int arg0) {
      try {
         field4628 = null;
         field4625 = null;
         if (arg0 != -12) {
            field4628 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field4631[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bv",
      name = "a",
      descriptor = "(Z)Z"
   )
   public static final boolean method2506(boolean arg0) {
      try {
         ++field4621;
         if (arg0) {
            return false;
         } else {
            return !class621.method4548((byte)115, field4631[9]) ? false : class621.method4548((byte)60, field4631[8]);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field4631[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2507(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 43);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2508(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 125;
            break;
         case 1:
            var10005 = 48;
            break;
         case 2:
            var10005 = 62;
            break;
         case 3:
            var10005 = 100;
            break;
         default:
            var10005 = 43;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
