import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class192 extends class46 {

    @OriginalMember(owner = "client!wk", name = "y", descriptor = "I")
    private final int field3227;

    @OriginalMember(owner = "client!wk", name = "v", descriptor = "I")
    private final int field3224;

    @OriginalMember(owner = "client!wk", name = "o", descriptor = "I")
    private final int field3217;

    @OriginalMember(owner = "client!wk", name = "C", descriptor = "I")
    private final int field3231;

    @OriginalMember(owner = "client!wk", name = "z", descriptor = "I")
    public static int field3228 = 1;

    @OriginalMember(owner = "client!wk", name = "u", descriptor = "Lud;")
    public static class52 field3223 = new class52();

    @OriginalMember(owner = "client!wk", name = "H", descriptor = "Z")
    public static boolean field3236 = false;

    @OriginalMember(owner = "client!wk", name = "G", descriptor = "Z")
    public static boolean field3235 = false;

    @OriginalMember(owner = "client!wk", name = "I", descriptor = "[I")
    public static int[] field3237 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!wk", name = "J", descriptor = "Lmh;")
    private static class62 field3238 = class201.method1405(true, "RuneScape is loading )2 please wait)3)3)3");

    @OriginalMember(owner = "client!wk", name = "D", descriptor = "Lmh;")
    public static class62 field3232 = field3238;

    @OriginalMember(owner = "client!wk", name = "m", descriptor = "I")
    public static int field3215;

    @OriginalMember(owner = "client!wk", name = "p", descriptor = "I")
    public static int field3218;

    @OriginalMember(owner = "client!wk", name = "q", descriptor = "I")
    public static int field3219;

    @OriginalMember(owner = "client!wk", name = "r", descriptor = "I")
    public static int field3220;

    @OriginalMember(owner = "client!wk", name = "s", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!wk", name = "t", descriptor = "I")
    public static int field3222;

    @OriginalMember(owner = "client!wk", name = "w", descriptor = "I")
    public static int field3225;

    @OriginalMember(owner = "client!wk", name = "x", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!wk", name = "A", descriptor = "I")
    public static int field3229;

    @OriginalMember(owner = "client!wk", name = "B", descriptor = "I")
    public static int field3230;

    @OriginalMember(owner = "client!wk", name = "n", descriptor = "Lhi;")
    public static class26 field3216;

    @OriginalMember(owner = "client!wk", name = "F", descriptor = "[I")
    public static int[] field3234;

    @OriginalMember(owner = "client!wk", name = "E", descriptor = "[Lfd;")
    public static class61[] field3233;

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(III)Lvg;", line = 6)
    public static final class32 method1344(int arg0, int arg1, int arg2) {
        class166 var3 = class256.field4320[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class32 var4 = var3.field2711;
            var3.field2711 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ZI)V", line = 19)
    public static final void method1345(boolean arg0, int arg1) {
        class169.field2737 = 99;
        field3221++;
        class98.field1621 = new int[104];
        class206.field3494 = new int[104];
        class252.field4282 = new int[104];
        class78.field1312 = new int[arg1];
        byte var2;
        if (arg0) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        class206.field3502 = new byte[var2][104][104];
        class72.field1110 = new byte[var2][105][105];
        class129.field2120 = new byte[var2][104][104];
        class121.field2020 = new byte[var2][104][104];
        class35.field473 = new byte[var2][104][104];
        class274.field4639 = new int[104];
        class143.field2283 = new int[var2][105][105];
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(III)V", line = 46)
    public final void method297(int arg0, int arg1, int arg2) {
        field3226++;
        int var4 = this.field3217 * arg0 >> 12;
        if (arg2 != 31462) {
            this.method298(16, false, 124);
        }
        int var5 = this.field3224 * arg0 >> 12;
        int var6 = this.field3227 * arg1 >> 12;
        int var7 = this.field3231 * arg1 >> 12;
        class108.method834(this.field687, (byte) -63, var7, var5, this.field686, var4, var6, this.field690);
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IZ)V", line = 67)
    public static final void method1346(int arg0, boolean arg1) {
        class151 var2 = class165.method1194((byte) 1, 8, arg0);
        field3219++;
        var2.method1081(128);
        if (arg1) {
            field3234 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IZLsg;)V", line = 92)
    public static final void method1347(int arg0, boolean arg1, class191 arg2) {
        field3230++;
        int var3 = arg2.field3149 == 0 ? arg2.field3190 : arg2.field3149;
        int var4 = arg2.field3067 == 0 ? arg2.field3126 : arg2.field3067;
        if (arg0 != -1908822544) {
            method1348(18, -100, 91, 10);
        }
        class236.method1665((byte) 86, var3, arg1, arg2.field3142, var4, class275.field4713[arg2.field3142 >> 16]);
        if (arg2.field3180 != null) {
            class236.method1665((byte) 103, var3, arg1, arg2.field3142, var4, arg2.field3180);
        }
        class146 var5 = (class146) class214.field3632.method311((byte) 114, (long) arg2.field3142);
        if (var5 != null) {
            class193.method1355((byte) -20, arg1, var3, var5.field2312, var4);
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIII)V", line = 118)
    public static final void method1348(int arg0, int arg1, int arg2, int arg3) {
        field3220++;
        class151 var4 = class165.method1194((byte) 1, 4, arg1);
        var4.method1088(126);
        var4.field2395 = arg0;
        var4.field2388 = arg2;
        if (arg3 <= 38) {
            field3216 = (class26) null;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IZI)V", line = 135)
    public final void method298(int arg0, boolean arg1, int arg2) {
        field3215++;
        int var4 = this.field3217 * arg0 >> 12;
        int var5 = this.field3227 * arg2 >> 12;
        int var6 = this.field3224 * arg0 >> 12;
        int var7 = this.field3231 * arg2 >> 12;
        if (arg1) {
            method1348(122, 34, -127, 112);
        }
        class120.method930(-50, var5, var4, var6, var7, this.field690);
    }

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "(III)V", line = 157)
    public static final void method1349(int arg0, int arg1, int arg2) {
        if (class100.field1650 != 0 && arg0 != -1) {
            class198.method1387(0, false, 121, class14.field115, arg0, class100.field1650);
            class91.field1429 = true;
        }
        field3225++;
        if (arg1 > -23) {
            method1347(92, true, (class191) null);
        }
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)V", line = 176)
    public static void method1350(int arg0) {
        field3238 = null;
        field3216 = null;
        field3233 = null;
        field3223 = null;
        field3237 = null;
        field3234 = null;
        if (arg0 == 105) {
            field3232 = null;
        }
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(IIIIIII)V", line = 195)
    public class192(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field3227 = arg1;
        this.field3224 = arg2;
        this.field3217 = arg0;
        this.field3231 = arg3;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IBI)V", line = 208)
    public final void method301(int arg0, byte arg1, int arg2) {
        field3222++;
        if (arg1 != -13) {
            method1351((byte) 13);
        }
        int var4 = this.field3217 * arg0 >> 12;
        int var5 = this.field3227 * arg2 >> 12;
        int var6 = this.field3224 * arg0 >> 12;
        int var7 = this.field3231 * arg2 >> 12;
        class240.method1685(this.field686, var7, var4, var6, var5, 127, this.field687);
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(B)V", line = 230)
    public static final void method1351(byte arg0) {
        for (class114 var1 = (class114) class38.field595.method334(-18673); var1 != null; var1 = (class114) class38.field595.method335((byte) 98)) {
            if (var1.field1901) {
                var1.method893(2);
            }
        }
        if (arg0 > -53) {
            method1344(-6, 58, -43);
        }
        field3218++;
        for (class114 var2 = (class114) class101.field1663.method334(-18673); var2 != null; var2 = (class114) class101.field1663.method335((byte) 123)) {
            if (var2.field1901) {
                var2.method893(2);
            }
        }
    }
}
