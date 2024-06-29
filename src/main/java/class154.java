import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class154 extends class273 {

    @OriginalMember(owner = "client!oc", name = "O", descriptor = "I")
    private int field2418 = 32768;

    @OriginalMember(owner = "client!oc", name = "M", descriptor = "Ljava/lang/String;")
    public static String field2416 = "Loaded defaults";

    @OriginalMember(owner = "client!oc", name = "J", descriptor = "I")
    public static int field2413;

    @OriginalMember(owner = "client!oc", name = "K", descriptor = "I")
    public static int field2414;

    @OriginalMember(owner = "client!oc", name = "L", descriptor = "I")
    public static int field2415;

    @OriginalMember(owner = "client!oc", name = "P", descriptor = "I")
    public static int field2419;

    @OriginalMember(owner = "client!oc", name = "Q", descriptor = "I")
    public static int field2420;

    @OriginalMember(owner = "client!oc", name = "S", descriptor = "I")
    public static int field2422;

    @OriginalMember(owner = "client!oc", name = "T", descriptor = "I")
    public static int field2423;

    @OriginalMember(owner = "client!oc", name = "R", descriptor = "Lwf;")
    public static class306 field2421;

    @OriginalMember(owner = "client!oc", name = "N", descriptor = "[I")
    public static int[] field2417;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IB)[[I", line = 7)
    public final int[][] method170(int arg0, byte arg1) {
        if (arg1 != 68) {
            return (int[][]) ((int[][]) null);
        }
        field2419++;
        int[][] var3 = this.field4200.method539(152, arg0);
        if (this.field4200.field1147) {
            int[] var4 = this.method1790(1, arg0, 0);
            int[] var5 = this.method1790(2, arg0, 0);
            int[] var6 = var3[1];
            int[] var7 = var3[0];
            int[] var8 = var3[2];
            for (int var9 = 0; var9 < class27.field346; var9++) {
                int var10 = var4[var9] * 255 >> 12 & 0xFF;
                int var11 = var5[var9] * this.field2418 >> 12;
                int var12 = class125.field1958[var10] * var11 >> 12;
                int var13 = class159.field2477[var10] * var11 >> 12;
                int var14 = var9 + (var12 >> 12) & class197.field2963;
                int var15 = (var13 >> 12) + arg0 & class117.field1819;
                int[][] var16 = this.method1795(var15, -126, 0);
                var7[var9] = var16[0][var14];
                var6[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(BILgn;)V", line = 69)
    public final void method167(byte arg0, int arg1, class303 arg2) {
        if (arg0 < 27) {
            this.method331(48, 94);
        }
        if (arg1 == 0) {
            this.field2418 = arg2.method1994(false) << 4;
        } else if (arg1 == 1) {
            this.field4194 = arg2.method2043((byte) -117) == 1;
        }
        field2413++;
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)V", line = 106)
    public final void method349(int arg0) {
        class27.method207((byte) 97);
        if (arg0 != 1) {
            this.field2418 = 99;
        }
        field2423++;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILjava/lang/String;)I", line = 119)
    public static final int method1073(int arg0, String arg1) {
        int var2 = 1 / ((arg0 + 50) / 62);
        field2422++;
        return class288.method1873((byte) 80, 10, arg1, true);
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V", line = 127)
    public class154() {
        super(3, false);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)[I", line = 133)
    public final int[] method331(int arg0, int arg1) {
        if (arg1 != -14650) {
            field2421 = (class306) null;
        }
        field2420++;
        int[] var3 = this.field4204.method365(arg0, 0);
        if (this.field4204.field792) {
            int[] var4 = this.method1790(1, arg0, 0);
            int[] var5 = this.method1790(2, arg0, 0);
            for (int var6 = 0; var6 < class27.field346; var6++) {
                int var7 = (var4[var6] & 0xFFC) >> 4;
                int var8 = var5[var6] * this.field2418 >> 12;
                int var9 = class125.field1958[var7] * var8 >> 12;
                int var10 = var6 + (var9 >> 12) & class197.field2963;
                int var11 = class159.field2477[var7] * var8 >> 12;
                int var12 = arg0 + (var11 >> 12) & class117.field1819;
                int[] var13 = this.method1790(0, var12, 0);
                var3[var6] = var13[var10];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "(I)V", line = 182)
    public static void method1074(int arg0) {
        field2417 = null;
        field2416 = null;
        if (arg0 <= -81) {
            field2421 = null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "()V", line = 194)
    public static final void method1075() {
        if (class2.field15 != null) {
            for (int var0 = 0; var0 < class2.field15.length; var0++) {
                for (int var1 = 0; var1 < class228.field3650; var1++) {
                    for (int var2 = 0; var2 < class84.field1276; var2++) {
                        class2.field15[var0][var1][var2] = null;
                    }
                }
            }
        }
        class126.field1962 = (class217[][]) null;
        if (class10.field94 != null) {
            for (int var3 = 0; var3 < class10.field94.length; var3++) {
                for (int var4 = 0; var4 < class228.field3650; var4++) {
                    for (int var5 = 0; var5 < class84.field1276; var5++) {
                        class10.field94[var3][var4][var5] = null;
                    }
                }
            }
        }
        class274.field4222 = (class217[][]) null;
        class175.field2684 = 0;
        if (class234.field3766 != null) {
            for (int var6 = 0; var6 < class175.field2684; var6++) {
                class234.field3766[var6] = null;
            }
        }
        if (class118.field1828 != null) {
            for (int var7 = 0; var7 < class33.field420; var7++) {
                class118.field1828[var7] = null;
            }
            class33.field420 = 0;
        }
        if (class123.field1932 != null) {
            for (int var8 = 0; var8 < class123.field1932.length; var8++) {
                class123.field1932[var8] = null;
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIIIIIILmd;)V", line = 298)
    public static final void method1076(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class17 arg8) {
        field2414++;
        int var9 = arg1 & 0x3;
        int var10;
        int var11;
        if (var9 == 1 || var9 == 3) {
            var11 = arg8.field187;
            var10 = arg8.field212;
        } else {
            var10 = arg8.field187;
            var11 = arg8.field212;
        }
        int var12;
        int var13;
        if ((arg4 + var10) <= 104) {
            var12 = arg4 + (var10 >> 1);
            var13 = arg4 + (var10 + 1 >> 1);
        } else {
            var12 = arg4;
            var13 = arg4 + 1;
        }
        int var14;
        int var15;
        if ((arg3 + var11) > 104) {
            var14 = arg3;
            var15 = arg3 + 1;
        } else {
            var14 = arg3 + (var11 >> 1);
            var15 = (var11 + 1 >> 1) + arg3;
        }
        int var16 = (arg3 << 7) + (var11 << 6);
        if (arg6 != 26008) {
            method1076(36, -103, -69, 116, 21, 122, 117, -50, (class17) null);
        }
        int var17 = 0;
        int var18 = (arg4 << 7) + (var10 << 6);
        int[][] var19 = client.field2034[arg5];
        int var20 = var19[var14][var12] + var19[var15][var13] + var19[var15][var12] + var19[var14][var13] >> 2;
        if (arg5 != 0) {
            int[][] var21 = client.field2034[0];
            var17 = var20 - (var21[var15][var12] + var21[var14][var13] + var21[var14][var12] + var21[var15][var13] >> 2);
        }
        int[][] var22 = (int[][]) null;
        if (arg5 < 3) {
            var22 = client.field2034[arg5 + 1];
        }
        class118 var23 = arg8.method123(arg0, var20, false, (class20) null, true, var22, var19, true, var18, arg1, var16);
        class11.method83(var23.field1831, var16 - arg7, var17, var18 - arg2);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(BI)V", line = 377)
    public static final void method1077(byte arg0, int arg1) {
        int var2 = 69 % ((arg0 - 36) / 50);
        class336.field5221.method1287(arg1, 115);
        field2415++;
        class183.field2802.method1287(arg1, 125);
    }
}
