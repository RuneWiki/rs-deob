import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class105 extends class70 {
   @OriginalMember(
      owner = "client!vj",
      name = "M",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1460 = new String[]{method1014(method1013("\u000bpc4l")), method1014(method1013("\u000bpc3l")), method1014(method1013("\u0013o!\u001b")), method1014(method1013("\u00064cY9")), method1014(method1013("\u000bpc6l")), method1014(method1013("\u000bpc2l"))};
   @OriginalMember(
      owner = "client!vj",
      name = "H",
      descriptor = "I"
   )
   public static int field1454 = 2;
   @OriginalMember(
      owner = "client!vj",
      name = "J",
      descriptor = "I"
   )
   public static int field1456 = -1;
   @OriginalMember(
      owner = "client!vj",
      name = "G",
      descriptor = "I"
   )
   public static int field1459 = -1;
   @OriginalMember(
      owner = "client!vj",
      name = "L",
      descriptor = "I"
   )
   public static int field1453;
   @OriginalMember(
      owner = "client!vj",
      name = "I",
      descriptor = "I"
   )
   public static int field1455;
   @OriginalMember(
      owner = "client!vj",
      name = "F",
      descriptor = "I"
   )
   public static int field1457;
   @OriginalMember(
      owner = "client!vj",
      name = "K",
      descriptor = "I"
   )
   public static int field1458;

   @OriginalMember(
      owner = "client!vj",
      name = "a",
      descriptor = "(BI)[I"
   )
   public final int[] method8(byte arg0, int arg1) {
      boolean var3 = client.field1786;

      try {
         ++field1453;
         int[] var4 = super.field923.method3718(-2, arg1);
         if (arg0 != 87) {
            field1456 = -38;
         }

         if (super.field923.field7284) {
            int[][] var5 = this.method539(true, arg1, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int var9 = 0;
            if (var3 || class678.field10127 > var9) {
               do {
                  var4[var9] = (var6[var9] + var8[var9] - -var7[var9]) / 3;
                  ++var9;
               } while(class678.field10127 > var9);
            }
         }

         return var4;
      } catch (RuntimeException var11) {
         throw class482.method3757(var11, field1460[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vj",
      name = "a",
      descriptor = "([BII)[B"
   )
   public static final byte[] method1010(byte[] arg0, int arg1, int arg2) {
      try {
         ++field1458;
         if (arg2 >= -64) {
            return null;
         } else {
            byte[] var3 = new byte[arg1];
            class107.method1027(arg0, 0, var3, 0, arg1);
            return var3;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field1460[1] + (arg0 != null ? field1460[3] : field1460[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vj",
      name = "a",
      descriptor = "(IIIIIIBIII)V"
   )
   public static final void method1011(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9) {
      boolean var10 = client.field1786;

      try {
         label47: {
            if (arg3 == arg5 && ~arg4 == ~arg9 && ~arg0 == ~arg7 && ~arg1 == ~arg8) {
               class669.method4930(arg4, arg5, (byte)116, arg2, arg7, arg1);
               if (!var10) {
                  break label47;
               }
            }

            int var11 = arg5;
            int var12 = arg4;
            int var13 = arg5 * 3;
            int var14 = arg4 * 3;
            int var15 = arg3 * 3;
            int var16 = arg9 * 3;
            int var17 = arg0 * 3;
            int var18 = arg8 * 3;
            int var19 = -var17 + arg7 + -arg5 - -var15;
            int var20 = -var18 + arg1 + var16 + -arg4;
            int var21 = -var15 + var17 + -var15 + var13;
            int var22 = var18 - -var14 + -var16 + -var16;
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
                  int var34 = (var28 - -var32 + var30 >> 12) + arg5;
                  int var35 = (var29 - (-var31 - var33) >> 12) + arg4;
                  class669.method4930(var12, var11, (byte)116, arg2, var34, var35);
                  var11 = var34;
                  var12 = var35;
                  var25 += 128;
               } while(~var25 >= -4097);
            }
         }

         ++field1457;
         if (arg6 != -94) {
            method1012(61, 124, 121, -15, 30, 41, -54);
         }
      } catch (RuntimeException var37) {
         throw class482.method3757(var37, field1460[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vj",
      name = "<init>",
      descriptor = "()V"
   )
   public class105() {
      super(1, true);
   }

   @OriginalMember(
      owner = "client!vj",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public static final void method1012(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!vj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1013(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 68);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1014(char[] arg0) {
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
            var10005 = 26;
            break;
         case 2:
            var10005 = 77;
            break;
         case 3:
            var10005 = 119;
            break;
         default:
            var10005 = 68;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
