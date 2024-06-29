import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class158 extends class30 {

    @OriginalMember(owner = "client!we", name = "Y", descriptor = "[I")
    private int[] field3619 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!we", name = "V", descriptor = "Z")
    public boolean field3616 = false;

    @OriginalMember(owner = "client!we", name = "ob", descriptor = "I")
    public int field3635 = -1;

    @OriginalMember(owner = "client!we", name = "bb", descriptor = "I")
    public static int field3622 = 2;

    @OriginalMember(owner = "client!we", name = "fb", descriptor = "B")
    public static byte field3626 = 0;

    @OriginalMember(owner = "client!we", name = "nb", descriptor = "Lje;")
    private static class67 field3634 = class85.method592(255, "Error connecting to server)3");

    @OriginalMember(owner = "client!we", name = "gb", descriptor = "I")
    public static int field3627 = 0;

    @OriginalMember(owner = "client!we", name = "hb", descriptor = "Lje;")
    private static class67 field3628 = class85.method592(255, "Hidden");

    @OriginalMember(owner = "client!we", name = "jb", descriptor = "Lje;")
    public static class67 field3630 = field3634;

    @OriginalMember(owner = "client!we", name = "db", descriptor = "Lje;")
    public static class67 field3624 = field3628;

    @OriginalMember(owner = "client!we", name = "R", descriptor = "I")
    public static int field3612;

    @OriginalMember(owner = "client!we", name = "T", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!we", name = "U", descriptor = "I")
    public static int field3615;

    @OriginalMember(owner = "client!we", name = "W", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!we", name = "Z", descriptor = "I")
    public static int field3620;

    @OriginalMember(owner = "client!we", name = "cb", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!we", name = "eb", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!we", name = "ib", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!we", name = "lb", descriptor = "I")
    public static int field3632;

    @OriginalMember(owner = "client!we", name = "mb", descriptor = "I")
    public static int field3633;

    @OriginalMember(owner = "client!we", name = "pb", descriptor = "I")
    public static int field3636;

    @OriginalMember(owner = "client!we", name = "qb", descriptor = "I")
    public static int field3637;

    @OriginalMember(owner = "client!we", name = "sb", descriptor = "I")
    public static int field3639;

    @OriginalMember(owner = "client!we", name = "tb", descriptor = "I")
    public static int field3640;

    @OriginalMember(owner = "client!we", name = "ub", descriptor = "I")
    public static int field3641;

    @OriginalMember(owner = "client!we", name = "ab", descriptor = "Lua;")
    public static class140 field3621;

    @OriginalMember(owner = "client!we", name = "S", descriptor = "[I")
    public static int[] field3613;

    @OriginalMember(owner = "client!we", name = "wb", descriptor = "[I")
    private int[] field3643;

    @OriginalMember(owner = "client!we", name = "X", descriptor = "[S")
    private short[] field3618;

    @OriginalMember(owner = "client!we", name = "kb", descriptor = "[S")
    private short[] field3631;

    @OriginalMember(owner = "client!we", name = "rb", descriptor = "[S")
    private short[] field3638;

    @OriginalMember(owner = "client!we", name = "vb", descriptor = "[S")
    private short[] field3642;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IILje;Lje;ZLfd;)V")
    public static final void method1215(int arg0, int arg1, class67 arg2, class67 arg3, boolean arg4, class40 arg5) {
        field3641++;
        if (arg0 <= 123) {
            method1220(95, 49, -10, (byte) -102);
        }
        int var6 = arg5.method251(0, arg2);
        int var7 = arg5.method254(arg3, 0, var6);
        class64.method435(arg4, var6, var7, arg5, (byte) 109, arg1);
    }

    @OriginalMember(owner = "client!we", name = "d", descriptor = "(I)Lwc;")
    public final class156 method1216(int arg0) {
        field3612++;
        if (this.field3643 == null) {
            return null;
        }
        class156[] var2 = new class156[this.field3643.length];
        for (int var3 = 0; var3 < this.field3643.length; var3++) {
            var2[var3] = class156.method1186(class46.field856, this.field3643[var3], 0);
        }
        if (arg0 != -15815) {
            this.field3618 = null;
        }
        class156 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class156(var2, var2.length);
        }
        if (this.field3618 != null) {
            for (int var5 = 0; var5 < this.field3618.length; var5++) {
                var4.method1195(this.field3618[var5], this.field3638[var5]);
            }
        }
        if (this.field3631 != null) {
            for (int var6 = 0; var6 < this.field3631.length; var6++) {
                var4.method1202(this.field3631[var6], this.field3642[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!we", name = "e", descriptor = "(I)Z")
    public final boolean method1217(int arg0) {
        field3615++;
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field3619[var3] != -1 && !class46.field856.method260(this.field3619[var3], 0, false)) {
                var2 = false;
            }
        }
        if (arg0 >= -111) {
            this.method1221(null, -59, -96);
        }
        return var2;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIIII)V")
    public static final void method1218(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3617++;
        if (class159.field3654 == arg2 && class159.field3656 == arg3 && (class2.field13 == arg1 || !class41.field773)) {
            return;
        }
        class159.field3654 = arg2;
        class2.field13 = arg1;
        if (!class41.field773) {
            class2.field13 = 0;
        }
        if (arg5 != 5151) {
            field3634 = null;
        }
        class159.field3656 = arg3;
        class27.method181(25, -75);
        class6.method56(true, class39.field703, 14489);
        int var6 = class130.field2863;
        class130.field2863 = (arg2 - 6) * 8;
        int var7 = class130.field2863 - var6;
        int var8 = class130.field2863;
        int var9 = class35.field647;
        class35.field647 = (arg3 - 6) * 8;
        int var10 = class35.field647 - var9;
        int var11 = class35.field647;
        for (int var12 = 0; var12 < 32768; var12++) {
            class24 var28 = class152.field3479[var12];
            if (var28 != null) {
                for (int var29 = 0; var29 < 10; var29++) {
                    var28.field2942[var29] -= var7;
                    var28.field2993[var29] -= var10;
                }
                var28.field2963 -= var10 * 128;
                var28.field2957 -= var7 * 128;
            }
        }
        for (int var13 = 0; var13 < 2048; var13++) {
            class83 var26 = class85.field1885[var13];
            if (var26 != null) {
                for (int var27 = 0; var27 < 10; var27++) {
                    var26.field2942[var27] -= var7;
                    var26.field2993[var27] -= var10;
                }
                var26.field2957 -= var7 * 128;
                var26.field2963 -= var10 * 128;
            }
        }
        class128.field2817 = arg1;
        class37.field667.method1013(false, arg4, arg0, -9);
        byte var14 = 0;
        byte var15 = 0;
        byte var16 = 104;
        byte var17 = 1;
        if (var7 < 0) {
            var14 = 103;
            var17 = -1;
            var16 = -1;
        }
        byte var18 = 1;
        byte var19 = 104;
        if (var10 < 0) {
            var19 = -1;
            var15 = 103;
            var18 = -1;
        }
        for (int var20 = var14; var20 != var16; var20 += var17) {
            for (int var22 = var15; var22 != var19; var22 += var18) {
                int var23 = var7 + var20;
                int var24 = var10 + var22;
                for (int var25 = 0; var25 < 4; var25++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104) {
                        class99.field2200[var25][var20][var22] = class99.field2200[var25][var23][var24];
                    } else {
                        class99.field2200[var25][var20][var22] = null;
                    }
                }
            }
        }
        for (class138 var21 = (class138) class25.field447.method26((byte) 72); var21 != null; var21 = (class138) class25.field447.method18((byte) -128)) {
            var21.field3126 -= var10;
            var21.field3111 -= var7;
            if (var21.field3111 < 0 || var21.field3126 < 0 || var21.field3111 >= 104 || var21.field3126 >= 104) {
                var21.method115(26851);
            }
        }
        class26.field474 = false;
        class86.field1903 = 0;
        if (class82.field1818 != 0) {
            class71.field1432 -= var10;
            class82.field1818 -= var7;
        }
        class56.field1131 = -1;
        class97.field2167.method25(arg5 ^ 0x146A);
        class144.field3299.method25(-118);
    }

    @OriginalMember(owner = "client!we", name = "e", descriptor = "(B)V")
    public static void method1219(byte arg0) {
        field3621 = null;
        field3630 = null;
        field3634 = null;
        field3624 = null;
        field3628 = null;
        int var1 = 98 / ((3 - arg0) / 52);
        field3613 = null;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIB)V")
    public static final void method1220(int arg0, int arg1, int arg2, byte arg3) {
        for (int var4 = 0; var4 < 8; var4++) {
            for (int var7 = 0; var7 < 8; var7++) {
                class142.field3253[arg0][arg1 + var4][arg2 + var7] = 0;
            }
        }
        if (arg3 > -12) {
            method1222(false, null, null, null);
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                class142.field3253[arg0][arg1][arg2 + var5] = class142.field3253[arg0][arg1 - 1][arg2 + var5];
            }
        }
        field3620++;
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                class142.field3253[arg0][arg1 + var6][arg2] = class142.field3253[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && class142.field3253[arg0][arg1 - 1][arg2] != 0) {
            class142.field3253[arg0][arg1][arg2] = class142.field3253[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && class142.field3253[arg0][arg1][arg2 - 1] != 0) {
            class142.field3253[arg0][arg1][arg2] = class142.field3253[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && class142.field3253[arg0][arg1 - 1][arg2 - 1] != 0) {
            class142.field3253[arg0][arg1][arg2] = class142.field3253[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lna;II)V")
    private final void method1221(class91 arg0, int arg1, int arg2) {
        field3636++;
        if (arg2 == 1) {
            this.field3635 = arg0.method649(false);
        } else if (arg2 == 2) {
            int var8 = arg0.method649(false);
            this.field3643 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field3643[var9] = arg0.method641(255);
            }
        } else if (arg2 == 3) {
            this.field3616 = true;
        } else if (arg2 == 40) {
            int var4 = arg0.method649(false);
            this.field3618 = new short[var4];
            this.field3638 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3618[var5] = (short) arg0.method641(255);
                this.field3638[var5] = (short) arg0.method641(255);
            }
        } else if (arg2 == 41) {
            int var6 = arg0.method649(false);
            this.field3642 = new short[var6];
            this.field3631 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field3631[var7] = (short) arg0.method641(255);
                this.field3642[var7] = (short) arg0.method641(255);
            }
        } else if (arg2 >= 60 && arg2 < 70) {
            this.field3619[arg2 - 60] = arg0.method641(255);
        }
        int var10 = 127 % ((-arg1 - 44) / 62);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ZLfd;Lje;Lje;)Lqb;")
    public static final class113 method1222(boolean arg0, class40 arg1, class67 arg2, class67 arg3) {
        if (arg0) {
            field3627 = 89;
        }
        int var4 = arg1.method251(0, arg2);
        int var5 = arg1.method254(arg3, 0, var4);
        field3633++;
        return class137.method1042((byte) 113, var5, arg1, var4);
    }

    @OriginalMember(owner = "client!we", name = "f", descriptor = "(I)V")
    public static final void method1223(int arg0) {
        field3629++;
        int var1 = 59 / ((58 - arg0) / 49);
        for (class138 var2 = (class138) class25.field447.method26((byte) 50); var2 != null; var2 = (class138) class25.field447.method18((byte) -128)) {
            if (var2.field3125 == -1) {
                var2.field3106 = 0;
                class85.method597(var2, (byte) -121);
            } else {
                var2.method115(26851);
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIII)V")
    public static final void method1224(int arg0, int arg1, int arg2, int arg3) {
        class67.method485(arg1 ^ 0xFFFFFFDF);
        class8.method60(arg2, arg3, arg2 + class46.field846.field1592, class46.field846.field1590 + arg3);
        if (class33.field594 == 2 || class33.field594 == 5) {
            class8.method71(arg2 + 25, arg3 - -5, 0, class83.field1834, class68.field1381);
        } else {
            int var4 = class47.field874 + class25.field463 & 0x7FF;
            int var5 = class37.field667.field2957 / 32 + 48;
            int var6 = 464 - class37.field667.field2963 / 32;
            class61.field1215.method897(arg2 + 25, arg3 + 5, 146, 151, var5, var6, var4, class115.field2603 + 256, class83.field1834, class68.field1381);
            for (int var7 = 0; var7 < class34.field599; var7++) {
                int var37 = class37.field670[var7] * 4 + 2 - class37.field667.field2957 / 32;
                int var38 = class95.field2138[var7] * 4 + 2 - class37.field667.field2963 / 32;
                class145.method1121(var37, arg3, var38, class58.field1172[var7], arg1 ^ 0x69, arg2);
            }
            for (int var8 = 0; var8 < 104; var8++) {
                for (int var33 = 0; var33 < 104; var33++) {
                    class4 var34 = class99.field2200[class128.field2817][var8][var33];
                    if (var34 != null) {
                        int var35 = var8 * 4 + 2 - class37.field667.field2957 / 32;
                        int var36 = var33 * 4 + 2 - class37.field667.field2963 / 32;
                        class145.method1121(var35, arg3, var36, class69.field1412[0], 110, arg2);
                    }
                }
            }
            for (int var9 = 0; var9 < class123.field2743; var9++) {
                class24 var29 = class152.field3479[class45.field836[var9]];
                if (var29 != null && var29.method164((byte) 82)) {
                    class112 var30 = var29.field442;
                    if (var30 != null && var30.field2536 != null) {
                        var30 = var30.method890(arg1 - 34);
                    }
                    if (var30 != null && var30.field2567 && var30.field2524) {
                        int var31 = var29.field2957 / 32 - class37.field667.field2957 / 32;
                        int var32 = var29.field2963 / 32 - class37.field667.field2963 / 32;
                        class145.method1121(var31, arg3, var32, class69.field1412[1], 115, arg2);
                    }
                }
            }
            for (int var10 = 0; var10 < class155.field3540; var10++) {
                class83 var21 = class85.field1885[class151.field3464[var10]];
                if (var21 != null && var21.method164((byte) 89)) {
                    boolean var22 = false;
                    int var23 = var21.field2957 / 32 - class37.field667.field2957 / 32;
                    int var24 = var21.field2963 / 32 - class37.field667.field2963 / 32;
                    long var25 = var21.field1854.method476((byte) 77);
                    for (int var27 = 0; var27 < class137.field3087; var27++) {
                        if (class107.field2454[var27] == var25 && class47.field921[var27] != 0) {
                            var22 = true;
                            break;
                        }
                    }
                    boolean var28 = false;
                    if (class37.field667.field1827 != 0 && var21.field1827 != 0 && class37.field667.field1827 == var21.field1827) {
                        var28 = true;
                    }
                    if (var22) {
                        class145.method1121(var23, arg3, var24, class69.field1412[3], 108, arg2);
                    } else if (var28) {
                        class145.method1121(var23, arg3, var24, class69.field1412[4], arg1 ^ 0x6A, arg2);
                    } else {
                        class145.method1121(var23, arg3, var24, class69.field1412[2], 93, arg2);
                    }
                }
            }
            if (class37.field668 != 0 && class34.field627 % 20 < 10) {
                if (class37.field668 == 1 && class47.field911 >= 0 && class152.field3479.length > class47.field911) {
                    class24 var11 = class152.field3479[class47.field911];
                    if (var11 != null) {
                        int var12 = var11.field2963 / 32 - class37.field667.field2963 / 32;
                        int var13 = var11.field2957 / 32 - class37.field667.field2957 / 32;
                        class56.method391(var12, var13, arg3, class17.field302[1], (byte) -123, arg2);
                    }
                }
                if (class37.field668 == 2) {
                    int var14 = (class77.field1647 - class35.field647) * 4 + 2 - class37.field667.field2963 / 32;
                    int var15 = (class79.field1747 - class130.field2863) * 4 + 2 - class37.field667.field2957 / 32;
                    class56.method391(var14, var15, arg3, class17.field302[1], (byte) -123, arg2);
                }
                if (class37.field668 == 10 && class103.field2295 >= 0 && class103.field2295 < class85.field1885.length) {
                    class83 var16 = class85.field1885[class103.field2295];
                    if (var16 != null) {
                        int var17 = var16.field2957 / 32 - class37.field667.field2957 / 32;
                        int var18 = var16.field2963 / 32 - class37.field667.field2963 / 32;
                        class56.method391(var18, var17, arg3, class17.field302[1], (byte) -123, arg2);
                    }
                }
            }
            if (class82.field1818 != 0) {
                int var19 = class71.field1432 * 4 + 2 - class37.field667.field2963 / 32;
                int var20 = class82.field1818 * 4 + 2 - class37.field667.field2957 / 32;
                class145.method1121(var20, arg3, var19, class17.field302[0], 101, arg2);
            }
            class8.method70(arg2 + 93 + 4, arg3 + 78, 3, 3, 16777215);
        }
        field3623++;
        if (class33.field594 >= 3) {
            class8.method71(arg2, arg3, 0, class145.field3353, class159.field3651);
        } else {
            class29.field517.method897(arg2, arg3, 33, 33, 25, 25, class47.field874, 256, class145.field3353, class159.field3651);
        }
        if (arg1 == 33) {
            if (class61.field1220[arg0]) {
                class46.field846.method531(arg2, arg3);
            }
            class103.field2301[arg0] = true;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILna;)Lje;")
    public static final class67 method1225(int arg0, class91 arg1) {
        field3625++;
        int var2 = -70 % ((81 - arg0) / 35);
        return class55.method387(arg1, 32767, (byte) 9);
    }

    @OriginalMember(owner = "client!we", name = "g", descriptor = "(I)Lwc;")
    public final class156 method1226(int arg0) {
        field3639++;
        class156[] var2 = new class156[5];
        int var3 = 0;
        if (arg0 != -21918) {
            this.field3635 = 58;
        }
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field3619[var4] != -1) {
                var2[var3++] = class156.method1186(class46.field856, this.field3619[var4], 0);
            }
        }
        class156 var5 = new class156(var2, var3);
        if (this.field3618 != null) {
            for (int var6 = 0; var6 < this.field3618.length; var6++) {
                var5.method1195(this.field3618[var6], this.field3638[var6]);
            }
        }
        if (this.field3631 != null) {
            for (int var7 = 0; var7 < this.field3631.length; var7++) {
                var5.method1202(this.field3631[var7], this.field3642[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Z)Z")
    public final boolean method1227(boolean arg0) {
        field3632++;
        if (this.field3643 == null) {
            return true;
        }
        boolean var2 = arg0;
        for (int var3 = 0; var3 < this.field3643.length; var3++) {
            if (!class46.field856.method260(this.field3643[var3], 0, false)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(BLna;)V")
    public final void method1228(byte arg0, class91 arg1) {
        if (arg0 != -97) {
            return;
        }
        while (true) {
            int var3 = arg1.method649(false);
            if (var3 == 0) {
                field3637++;
                return;
            }
            this.method1221(arg1, 106, var3);
        }
    }
}
