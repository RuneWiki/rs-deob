import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class200 {

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "J")
    public long field3565 = 0L;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "Lvf;")
    public static class265 field3570 = class87.method582(-46, "Lade Titelbild )2 ");

    @OriginalMember(owner = "client!ne", name = "o", descriptor = "I")
    public static int field3579 = 0;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
    public int field3566;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "I")
    public static int field3568;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
    public static int field3569;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "I")
    public static int field3571;

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "I")
    public int field3574;

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "I")
    public int field3575;

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "I")
    public int field3576;

    @OriginalMember(owner = "client!ne", name = "n", descriptor = "I")
    public int field3578;

    @OriginalMember(owner = "client!ne", name = "p", descriptor = "I")
    public int field3580;

    @OriginalMember(owner = "client!ne", name = "q", descriptor = "I")
    public int field3581;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "Ldk;")
    public class179 field3567;

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "Ldk;")
    public class179 field3572;

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "[Loe;")
    public static class108[] field3573;

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "[[[Lac;")
    public static class137[][][] field3577;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I[S[Lvf;)V")
    public static final void method1377(int arg0, short[] arg1, class265[] arg2) {
        if (arg0 > -112) {
            method1377(-116, (short[]) null, (class265[]) null);
        }
        field3571++;
        class21.method188(arg2.length - 1, arg1, arg2, 0, -90);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)V")
    public static void method1378(byte arg0) {
        field3570 = null;
        field3577 = null;
        if (arg0 >= -33) {
            method1377(-71, (short[]) null, (class265[]) null);
        }
        field3573 = null;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIZII)V")
    public static final void method1379(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field3569++;
        if (class45.field1006 == arg0 && class105.field1850 == arg2 && class58.field1181 == arg1 || class231.method1561(arg6 + 24960)) {
            return;
        }
        class105.field1850 = arg2;
        class58.field1181 = arg1;
        if (arg6 != 128) {
            field3573 = null;
        }
        class45.field1006 = arg0;
        if (class231.method1561(arg6 ^ 0x6280)) {
            class58.field1181 = 0;
        }
        if (arg4) {
            class70.method497(102, 28);
        } else {
            class70.method497(91, 25);
        }
        class166.method1094(24974, true, class119.field2103);
        int var7 = class231.field4073;
        int var8 = class64.field1248;
        class231.field4073 = (arg2 - 6) * 8;
        class64.field1248 = (arg0 - 6) * 8;
        class56.field1148 = class17.method119(class45.field1006 * 8, arg6 ^ 0xFFFFFF5F, class105.field1850 * 8);
        class221.field3962 = null;
        int var9 = class64.field1248 - var8;
        int var10 = class231.field4073 - var7;
        int var11 = class231.field4073;
        int var12 = class64.field1248;
        if (arg4) {
            class48.field1027 = 0;
            for (int var16 = 0; var16 < 32768; var16++) {
                class23 var32 = class4.field67[var16];
                if (var32 != null) {
                    var32.field2564 -= var10 * 128;
                    var32.field2600 -= var9 * 128;
                    if (var32.field2600 >= 0 && var32.field2600 <= 13184 && var32.field2564 >= 0 && var32.field2564 <= 13184) {
                        for (int var33 = 0; var33 < 10; var33++) {
                            var32.field2536[var33] -= var9;
                            var32.field2575[var33] -= var10;
                        }
                        class93.field1646[class48.field1027++] = var16;
                    } else {
                        class4.field67[var16].field681 = null;
                        class4.field67[var16] = null;
                    }
                }
            }
        } else {
            for (int var13 = 0; var13 < 32768; var13++) {
                class23 var14 = class4.field67[var13];
                if (var14 != null) {
                    for (int var15 = 0; var15 < 10; var15++) {
                        var14.field2536[var15] -= var9;
                        var14.field2575[var15] -= var10;
                    }
                    var14.field2600 -= var9 * 128;
                    var14.field2564 -= var10 * 128;
                }
            }
        }
        for (int var17 = 0; var17 < 2048; var17++) {
            class122 var30 = class209.field3766[var17];
            if (var30 != null) {
                for (int var31 = 0; var31 < 10; var31++) {
                    var30.field2536[var31] -= var9;
                    var30.field2575[var31] -= var10;
                }
                var30.field2600 -= var9 * 128;
                var30.field2564 -= var10 * 128;
            }
        }
        class216.field3902 = arg1;
        byte var18 = 0;
        class214.field3827.method823(arg6 - 19, arg5, arg3, false);
        byte var19 = 104;
        byte var20 = 1;
        byte var21 = 0;
        if (var9 < 0) {
            var20 = -1;
            var19 = -1;
            var18 = 103;
        }
        byte var22 = 104;
        byte var23 = 1;
        if (var10 < 0) {
            var21 = 103;
            var22 = -1;
            var23 = -1;
        }
        for (int var24 = var18; var24 != var19; var24 += var20) {
            for (int var26 = var21; var26 != var22; var26 += var23) {
                int var27 = var9 + var24;
                int var28 = var26 + var10;
                for (int var29 = 0; var29 < 4; var29++) {
                    if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104) {
                        class210.field3768[var29][var24][var26] = class210.field3768[var29][var27][var28];
                    } else {
                        class210.field3768[var29][var24][var26] = null;
                    }
                }
            }
        }
        for (class142 var25 = (class142) class53.field1105.method789((byte) -125); var25 != null; var25 = (class142) class53.field1105.method787((byte) -76)) {
            var25.field2637 -= var10;
            var25.field2638 -= var9;
            if (var25.field2638 < 0 || var25.field2637 < 0 || var25.field2638 >= 104 || var25.field2637 >= 104) {
                var25.method97(158);
            }
        }
        class87.field1588 = 0;
        class232.field4098 = -1;
        if (arg4) {
            class170.field3077 -= var9;
            class169.field3062 -= var10;
            class112.field1976 -= var9 * 128;
            class162.field2954 -= var9;
            class69.field1309 -= var10 * 128;
            class181.field3215 -= var10;
        } else {
            class254.field4361 = 1;
        }
        if (class161.field2936 != 0) {
            class203.field3633 -= var10;
            class161.field2936 -= var9;
        }
        class6.field99.method791(54);
        class204.field3650.method791(86);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V")
    public static final void method1380(int arg0) {
        field3568++;
        class89.field1597.method1893(-64);
        class52.field1085.method1893(-25);
        if (arg0 == -1) {
            class13.field417.method1893(arg0 - 46);
        }
    }
}
