import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class121 extends class334 {

    @OriginalMember(owner = "client!gg", name = "P", descriptor = "I")
    private int field2059 = -1;

    @OriginalMember(owner = "client!gg", name = "R", descriptor = "Ljava/lang/String;")
    public static String field2061 = null;

    @OriginalMember(owner = "client!gg", name = "F", descriptor = "I")
    public static int field2051 = -1;

    @OriginalMember(owner = "client!gg", name = "Q", descriptor = "Lbn;")
    public static class517 field2060 = new class517("WTWIP", "office", "_wip", 3);

    @OriginalMember(owner = "client!gg", name = "E", descriptor = "I")
    public int field2050;

    @OriginalMember(owner = "client!gg", name = "H", descriptor = "I")
    public static int field2052;

    @OriginalMember(owner = "client!gg", name = "I", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!gg", name = "K", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!gg", name = "N", descriptor = "I")
    public static int field2057;

    @OriginalMember(owner = "client!gg", name = "O", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!gg", name = "S", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!gg", name = "T", descriptor = "I")
    public int field2063;

    @OriginalMember(owner = "client!gg", name = "U", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!gg", name = "V", descriptor = "I")
    public static int field2065;

    @OriginalMember(owner = "client!gg", name = "W", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!gg", name = "J", descriptor = "[I")
    public int[] field2054;

    @OriginalMember(owner = "client!gg", name = "M", descriptor = "[I")
    public static int[] field2056;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIILfe;ILmp;IIIIII)V", line = 3)
    public static final void method1058(int arg0, int arg1, int arg2, class345 arg3, int arg4, class565 arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        class233.field3381 = arg0;
        ++field2064;
        class552.field7658 = arg2;
        class105.field1520 = null;
        class396.field5469 = null;
        class598.field8529 = arg9;
        class656.field9263 = arg10;
        class17.field189 = arg3;
        class286.field4208 = arg5;
        class197.field2959 = arg6;
        class86.field1289 = null;
        class570.field7912 = arg4;
        class236.field3423 = arg7;
        if (arg1 != -24978) {
            method1060((byte) -57);
        }
        class131.field2207 = arg8;
        class223.field3272 = arg11;
        class447.method2647((byte) 119);
        class251.field3615 = true;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IZIIIILgga;)V", line = 30)
    public static final void method1059(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, class513 arg6) {
        class144.field2337 = arg0;
        class229.field3357 = arg5;
        class582.field8375 = 1;
        ++field2062;
        class406.field5591 = arg3;
        if (arg2 != 4080) {
            field2051 = -62;
        }
        class542.field7503 = null;
        class348.field4945 = arg6;
        class430.field5951 = arg1;
        class419.field5804 = arg4;
    }

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "(B)V", line = 55)
    public static void method1060(byte arg0) {
        field2056 = null;
        field2061 = null;
        field2060 = null;
        if (arg0 != -97) {
            field2061 = null;
        }
    }

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "(I)Z", line = 67)
    public final boolean method1061(int arg0) {
        ++field2058;
        if (this.field2054 != null) {
            return true;
        } else if (arg0 >= ~this.field2059) {
            class418 var2 = ~class239.field3442 <= -1 ? class418.method2468(class694.field9779, class239.field3442, this.field2059) : class418.method2464(class694.field9779, this.field2059);
            var2.method2462();
            this.field2054 = var2.method2460();
            this.field2063 = var2.field5792;
            this.field2050 = var2.field5796;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(BLm;)Ljava/lang/String;", line = 92)
    public static final String method1062(byte arg0, class554 arg1) {
        int var2 = 107 % ((arg0 - -65) / 37);
        ++field2053;
        if (arg1.field7689 != null && ~arg1.field7689.length() != -1) {
            return arg1.field7690 != null && arg1.field7690.length() > 0 ? arg1.field7694 + class563.field7830.method3281(class423.field5892, -1) + arg1.field7690 + class563.field7830.method3281(class423.field5892, -1) + arg1.field7689 : arg1.field7694 + class563.field7830.method3281(class423.field5892, -1) + arg1.field7689;
        } else {
            return arg1.field7690 != null && arg1.field7690.length() > 0 ? arg1.field7694 + class563.field7830.method3281(class423.field5892, -1) + arg1.field7690 : arg1.field7694;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZI)[[I", line = 118)
    public int[][] method283(boolean arg0, int arg1) {
        if (!arg0) {
            return null;
        } else {
            ++field2066;
            int[][] var3 = super.field4734.method275(26422, arg1);
            if (super.field4734.field425 && this.method1061(-1)) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                int var7 = this.field2050 * (class327.field4668 == this.field2063 ? arg1 : this.field2063 * arg1 / class327.field4668);
                if (class439.field6099 != this.field2050) {
                    for (int var8 = 0; var8 < class439.field6099; ++var8) {
                        int var9 = this.field2050 * var8 / class439.field6099;
                        int var10 = this.field2054[var7 + var9];
                        var6[var8] = class194.method1380(var10, 255) << 4;
                        var5[var8] = class194.method1380(65280, var10) >> 4;
                        var4[var8] = class194.method1380(16711680, var10) >> 12;
                    }
                } else {
                    for (int var11 = 0; ~class439.field6099 < ~var11; ++var11) {
                        int var12 = this.field2054[var7++];
                        var6[var11] = class194.method1380(255, var12) << 4;
                        var5[var11] = class194.method1380(var12 >> 4, 4080);
                        var4[var11] = class194.method1380(var12 >> 12, 4080);
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IZLol;)V", line = 186)
    public final void method29(int arg0, boolean arg1, class431 arg2) {
        ++field2065;
        if (arg1) {
            this.field2059 = -124;
        }
        if (~arg0 == -1) {
            this.field2059 = arg2.method2565((byte) -109);
        }
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "()V", line = 200)
    public class121() {
        super(0, false);
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(II)V", line = 204)
    public static final void method1063(int arg0, int arg1) {
        ++field2057;
        class371 var2 = class490.method2867((byte) -118, 14, (long) arg0);
        if (arg1 != 20183) {
            method1058(-101, -26, -64, (class345) null, -10, (class565) null, -41, -57, 0, 14, 94, 34);
        }
        var2.method2215(arg1 + -20179);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)V", line = 217)
    public final void method1064(int arg0) {
        super.method1064(-128);
        if (arg0 > -126) {
            method1062((byte) 106, (class554) null);
        }
        ++field2052;
        this.field2054 = null;
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)I", line = 242)
    public final int method1065(int arg0) {
        ++field2055;
        return arg0 != -1 ? -63 : this.field2059;
    }
}
