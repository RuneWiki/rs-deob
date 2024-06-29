import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class26 {

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "Z")
    public boolean field305 = true;

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "I")
    public int field307;

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "I")
    public int field306;

    @OriginalMember(owner = "client!oi", name = "l", descriptor = "I")
    public int field312;

    @OriginalMember(owner = "client!oi", name = "k", descriptor = "I")
    public int field311;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "I")
    public int field302;

    @OriginalMember(owner = "client!oi", name = "o", descriptor = "I")
    public int field315;

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "[Lva;")
    public static class235[] field303 = new class235[2048];

    @OriginalMember(owner = "client!oi", name = "i", descriptor = "Loh;")
    public static class258 field309 = class153.method1046("Ladevorgang )2 bitte warten Sie)3", 87);

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "[I")
    public static int[] field304 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!oi", name = "p", descriptor = "Loh;")
    public static class258 field316 = class153.method1046(" weitere Optionen", 103);

    @OriginalMember(owner = "client!oi", name = "q", descriptor = "Lmb;")
    public static class172 field317 = new class172(64);

    @OriginalMember(owner = "client!oi", name = "r", descriptor = "[J")
    public static long[] field318 = new long[1000];

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!oi", name = "j", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!oi", name = "m", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!oi", name = "n", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V", line = 9)
    public static void method198(int arg0) {
        if (arg0 <= 4) {
            method200((byte) 46, (class171) null);
        }
        field318 = null;
        field309 = null;
        field317 = null;
        field304 = null;
        field303 = null;
        field316 = null;
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(I)V", line = 23)
    public static final void method199(int arg0) {
        class283.field4863 = arg0;
        for (int var1 = 0; var1 < class23.field277; var1++) {
            for (int var2 = 0; var2 < class290.field4995; var2++) {
                if (class178.field3180[arg0][var1][var2] == null) {
                    class178.field3180[arg0][var1][var2] = new class228(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(BLs;)Z", line = 50)
    public static final boolean method200(byte arg0, class171 arg1) {
        field301++;
        if (arg1.field2924 == 205) {
            class75.field1309 = 250;
            return true;
        } else {
            if (arg0 >= -112) {
                field318 = (long[]) null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(IIIIIIZ)V", line = 221)
    public class26(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field307 = arg5;
        this.field306 = arg0;
        this.field312 = arg3;
        this.field311 = arg2;
        this.field302 = arg1;
        this.field315 = arg4;
        this.field305 = arg6;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(III)V", line = 84)
    public static final void method201(int arg0, int arg1, int arg2) {
        field310++;
        if (arg1 < 80) {
            field304 = (int[]) null;
        }
        for (int var3 = 0; var3 < class106.field1902; var3++) {
            class71 var4 = class128.method922(var3, 31532);
            if (var4 != null) {
                int var5 = var4.field1259;
                if (var5 >= 0 && !class266.field4643.method189(var5, (byte) 118)) {
                    var5 = -1;
                }
                int var6;
                if (var4.field1258 >= 0) {
                    int var10 = var4.field1258;
                    int var11 = (var10 & 0x7F) + arg0;
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > 127) {
                        var11 = 127;
                    }
                    int var12 = (var10 + arg2 & 0xFC00) + (var10 & 0x380) + var11;
                    var6 = class266.field4634[class176.method1211(var12, (byte) 12, 96)];
                } else if (var5 >= 0) {
                    var6 = class266.field4634[class176.method1211(class266.field4643.method196(var5, true), (byte) -58, 96)];
                } else if (var4.field1235 == -1) {
                    var6 = -1;
                } else {
                    int var7 = var4.field1235;
                    int var8 = (var7 & 0x7F) + arg0;
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 127) {
                        var8 = 127;
                    }
                    int var9 = (var7 & 0x380) + (arg2 + var7 & 0xFC00) + var8;
                    var6 = class266.field4634[class176.method1211(var9, (byte) -16, 96)];
                }
                class37.field494[var3 + 1] = var6;
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(I)V", line = 165)
    public static final void method202(int arg0) {
        field313++;
        if (arg0 != 12608) {
            field304 = (int[]) null;
        }
        for (class179 var1 = (class179) class169.field2857.method83(-75); var1 != null; var1 = (class179) class169.field2857.method87((byte) -80)) {
            if (var1.field3205 == -1) {
                var1.field3193 = 0;
                class106.method790(var1, arg0 ^ 0xFFFFCEBC);
            } else {
                var1.method1054((byte) 98);
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIB)I", line = 190)
    public static final int method203(int arg0, int arg1, byte arg2) {
        if (arg2 >= -49) {
            return 51;
        }
        field308++;
        int var3 = class45.method374(arg1 + 45365, 16487, arg0 + 91923, 4) + (class45.method374(arg1 + 10294, 16487, arg0 + 37821, 2) - 128 >> 1) + (class45.method374(arg1, 16487, arg0, 1) + -128 >> 2) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Z)Ldb;", line = 237)
    public static final class41 method204(boolean arg0) {
        field314++;
        byte[] var1 = class37.field497[0];
        if (arg0) {
            field316 = (class258) null;
        }
        int var2 = class301.field5149[0] * class113.field1958[0];
        class41 var6;
        if (class294.field5056[0]) {
            byte[] var3 = class85.field1431[0];
            int[] var4 = new int[var2];
            for (int var5 = 0; var5 < var2; var5++) {
                var4[var5] = class307.method2139(class121.field2143[class2.method15(var1[var5], 255)], class2.method15(255, var3[var5]) << 24);
            }
            var6 = new class174(class108.field1919, class23.field279, class279.field4795[0], class280.field4819[0], class113.field1958[0], class301.field5149[0], var4);
        } else {
            int[] var7 = new int[var2];
            for (int var8 = 0; var8 < var2; var8++) {
                var7[var8] = class121.field2143[class2.method15(var1[var8], 255)];
            }
            var6 = new class41(class108.field1919, class23.field279, class279.field4795[0], class280.field4819[0], class113.field1958[0], class301.field5149[0], var7);
        }
        class290.method2038(112);
        return var6;
    }
}
