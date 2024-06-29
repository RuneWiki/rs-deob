import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class153 {

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "Lmh;")
    public static class128 field2628 = class22.method156(123, "::qa_op_test");

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "Lmh;")
    public static class128 field2627 = class22.method156(126, "");

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "I")
    public static int field2633;

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "I")
    public static int field2634;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIIZI)V", line = 12)
    public static final void method1016(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        int var6 = arg3 - arg1;
        field2634++;
        int var7 = arg5 - arg0;
        if (var6 == 0) {
            if (var7 != 0) {
                class238.method1626(arg1, arg0, arg2, 19681, arg5);
            }
        } else if (var7 == 0) {
            class293.method2011(arg3, arg1, arg0, (byte) -108, arg2);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg0 - (arg1 * var8 >> 12);
            int var10;
            int var11;
            if (class193.field3335 > arg1) {
                var10 = class193.field3335;
                var11 = var9 + (class193.field3335 * var8 >> 12);
            } else if (class43.field875 >= arg1) {
                var11 = arg0;
                var10 = arg1;
            } else {
                var10 = class43.field875;
                var11 = (class43.field875 * var8 >> 12) + var9;
            }
            int var12;
            int var13;
            if (class193.field3335 > arg3) {
                var12 = (class193.field3335 * var8 >> 12) + var9;
                var13 = class193.field3335;
            } else if (class43.field875 >= arg3) {
                var12 = arg5;
                var13 = arg3;
            } else {
                var12 = (class43.field875 * var8 >> 12) + var9;
                var13 = class43.field875;
            }
            if (!arg4) {
                if (var12 < class70.field1315) {
                    var12 = class70.field1315;
                    var13 = (class70.field1315 - var9 << 12) / var8;
                } else if (class181.field3173 < var12) {
                    var12 = class181.field3173;
                    var13 = (class181.field3173 - var9 << 12) / var8;
                }
                if (var11 < class70.field1315) {
                    var11 = class70.field1315;
                    var10 = (class70.field1315 - var9 << 12) / var8;
                } else if (class181.field3173 < var11) {
                    var10 = (class181.field3173 - var9 << 12) / var8;
                    var11 = class181.field3173;
                }
                class90.method568(var11, (byte) -25, var10, var13, arg2, var12);
            }
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(BI)V", line = 126)
    public static final void method1017(byte arg0, int arg1) {
        if (class64.field1214 == null || class64.field1214.length < arg1) {
            class64.field1214 = new int[arg1];
        }
        if (arg0 > -109) {
            field2627 = (class128) null;
        }
        field2630++;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(DB)V", line = 149)
    public static final void method1018(double arg0, byte arg1) {
        field2631++;
        if (arg1 != -116 || class70.field1307 == arg0) {
            return;
        }
        for (int var3 = 0; var3 < 256; var3++) {
            int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
            class121.field2053[var3] = var4 <= 255 ? var4 : 255;
        }
        class70.field1307 = arg0;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IBII)I", line = 176)
    public static final int method1019(int arg0, byte arg1, int arg2, int arg3) {
        field2633++;
        int var4 = arg0 & 0x3;
        if (arg1 != 85) {
            return -88;
        } else if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return 1023 - arg2;
        } else if (var4 == 2) {
            return 1023 - arg3;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)V", line = 198)
    public static void method1020(byte arg0) {
        if (arg0 == -79) {
            field2627 = null;
            field2628 = null;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I[Lmh;ZI[S)V", line = 211)
    public static final void method1021(int arg0, class128[] arg1, boolean arg2, int arg3, short[] arg4) {
        field2632++;
        if (arg2 || arg0 <= arg3) {
            return;
        }
        int var5 = (arg0 + arg3) / 2;
        int var6 = arg3;
        class128 var7 = arg1[var5];
        arg1[var5] = arg1[arg0];
        arg1[arg0] = var7;
        short var8 = arg4[var5];
        arg4[var5] = arg4[arg0];
        arg4[arg0] = var8;
        for (int var9 = arg3; var9 < arg0; var9++) {
            if (var7 == null || arg1[var9] != null && (var9 & 0x1) > arg1[var9].method835(var7, (byte) 82)) {
                class128 var10 = arg1[var9];
                arg1[var9] = arg1[var6];
                arg1[var6] = var10;
                short var11 = arg4[var9];
                arg4[var9] = arg4[var6];
                arg4[var6++] = var11;
            }
        }
        arg1[arg0] = arg1[var6];
        arg1[var6] = var7;
        arg4[arg0] = arg4[var6];
        arg4[var6] = var8;
        method1021(var6 - 1, arg1, arg2, arg3, arg4);
        method1021(arg0, arg1, arg2, var6 + 1, arg4);
    }
}
