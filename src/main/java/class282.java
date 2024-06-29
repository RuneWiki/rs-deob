import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class282 extends class83 {

    @OriginalMember(owner = "client!re", name = "n", descriptor = "I")
    public static int field4502 = 0;

    @OriginalMember(owner = "client!re", name = "v", descriptor = "Ljava/lang/String;")
    public static String field4510 = "red:";

    @OriginalMember(owner = "client!re", name = "l", descriptor = "I")
    public static int field4500;

    @OriginalMember(owner = "client!re", name = "p", descriptor = "I")
    public static int field4504;

    @OriginalMember(owner = "client!re", name = "q", descriptor = "I")
    public static int field4505;

    @OriginalMember(owner = "client!re", name = "r", descriptor = "I")
    public static int field4506;

    @OriginalMember(owner = "client!re", name = "s", descriptor = "I")
    public static int field4507;

    @OriginalMember(owner = "client!re", name = "t", descriptor = "I")
    public static int field4508;

    @OriginalMember(owner = "client!re", name = "w", descriptor = "I")
    public static int field4511;

    @OriginalMember(owner = "client!re", name = "m", descriptor = "Lre;")
    public class282 field4501;

    @OriginalMember(owner = "client!re", name = "o", descriptor = "Lre;")
    public class282 field4503;

    @OriginalMember(owner = "client!re", name = "u", descriptor = "[I")
    public static int[] field4509;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ILdk;)I")
    public static final int method1889(int arg0, class251 arg1) {
        field4506++;
        int var2 = arg0;
        if (arg1.method1698((byte) 63, class192.field3120)) {
            var2 = arg0 + 1;
        }
        if (arg1.method1698((byte) 106, class292.field4680)) {
            var2++;
        }
        if (arg1.method1698((byte) 101, class95.field1539)) {
            var2++;
        }
        if (arg1.method1698((byte) 127, class137.field2159)) {
            var2++;
        }
        if (arg1.method1698((byte) 118, class84.field1394)) {
            var2++;
        }
        if (arg1.method1698((byte) 109, class304.field4862)) {
            var2++;
        }
        if (arg1.method1698((byte) 58, class272.field4365)) {
            var2++;
        }
        if (arg1.method1698((byte) 103, class182.field2992)) {
            var2++;
        }
        if (arg1.method1698((byte) 126, class212.field3506)) {
            var2++;
        }
        if (arg1.method1698((byte) 117, class97.field1561)) {
            var2++;
        }
        if (arg1.method1698((byte) 120, field4500)) {
            var2++;
        }
        if (arg1.method1698((byte) 60, class167.field2728)) {
            var2++;
        }
        if (arg1.method1698((byte) 89, class11.field111)) {
            var2++;
        }
        if (arg1.method1698((byte) 72, class78.field1302)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(I)V")
    public static final void method1890(int arg0) {
        class195.field3151.method1257(-114);
        field4507++;
        class100.field1605.method1257(114);
        if (arg0 < 84) {
            method1889(-114, (class251) null);
        }
        class196.field3177.method1257(34);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lsa;I)V")
    public static final void method1891(class260 arg0, int arg1) {
        field4505++;
        short var2 = 256;
        for (int var3 = 0; var3 < class23.field293.length; var3++) {
            class23.field293[var3] = 0;
        }
        int var4 = 0;
        if (arg1 != 9479) {
            field4500 = -5;
        }
        while (var4 < 5000) {
            int var16 = (int) (Math.random() * 128.0D * (double) var2);
            class23.field293[var16] = (int) (Math.random() * 284.0D);
            var4++;
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var12 = 1; var12 < var2 - 1; var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = var14 + (var12 << 7);
                    class224.field3642[var15] = (class23.field293[var15 - 128] + class23.field293[var15 + 1] + class23.field293[var15 + -1] + class23.field293[var15 + 128]) / 4;
                }
            }
            int[] var13 = class23.field293;
            class23.field293 = class224.field3642;
            class224.field3642 = var13;
        }
        if (arg0 == null) {
            return;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < arg0.field3605; var7++) {
            for (int var8 = 0; var8 < arg0.field3603; var8++) {
                if (arg0.field4193[var6++] != 0) {
                    int var9 = var7 - (-arg0.field3599 - 16);
                    int var10 = var8 + arg0.field3604 + 16;
                    int var11 = (var9 << 7) + var10;
                    class23.field293[var11] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(JI)V")
    public static final void method1892(long arg0, int arg1) {
        field4511++;
        if (!class144.field2281) {
            class20.field240 += (float) arg0 * class193.field3141 / 40.0F;
            class90.field1456 += (float) arg0 * class245.field3887 / 40.0F;
        }
        int var3 = class256.field4149;
        if (arg1 != -20229) {
            return;
        }
        int var4 = class95.field1537;
        if (class162.field2580 != var3) {
            int var5 = var3 - class162.field2580;
            int var6 = (int) ((long) var5 * arg0 / 320L);
            if (var5 > 0) {
                if (var6 == 0) {
                    var6 = 1;
                } else if (var5 < var6) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = -1;
            } else if (var5 > var6) {
                var6 = var5;
            }
            class162.field2580 += var6;
        }
        if (class163.field2646 != var4) {
            int var7 = var4 - class163.field2646;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 <= 0) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (var8 < var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (var7 < var8) {
                var8 = var7;
            }
            class163.field2646 += var8;
        }
        class296.method1966(-100);
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(B)V")
    public static void method1893(byte arg0) {
        field4510 = null;
        field4509 = null;
        int var1 = -113 / (arg0 / 32);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Z)V")
    public final void method1894(boolean arg0) {
        field4508++;
        if (this.field4501 == null) {
            return;
        }
        this.field4501.field4503 = this.field4503;
        this.field4503.field4501 = this.field4501;
        this.field4501 = null;
        this.field4503 = null;
        if (arg0) {
            field4510 = null;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIILqk;Lqk;IIJ)V")
    public static final void method1895(int arg0, int arg1, int arg2, int arg3, class2 arg4, class2 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class209 var10 = new class209();
        var10.field3313 = arg8;
        var10.field3312 = arg1 * 128 + 64;
        var10.field3308 = arg2 * 128 + 64;
        var10.field3306 = arg3;
        var10.field3305 = arg4;
        var10.field3316 = arg5;
        var10.field3310 = arg6;
        var10.field3311 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class218.field3584[var11][arg1][arg2] == null) {
                class218.field3584[var11][arg1][arg2] = new class151(var11, arg1, arg2);
            }
        }
        class218.field3584[arg0][arg1][arg2].field2352 = var10;
    }
}
