import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class136 {

    @OriginalMember(owner = "client!dg", name = "m", descriptor = "I")
    private int field2552 = 0;

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "Lc;")
    private class103 field2547;

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "Lhj;")
    public static class69 field2545 = class181.method1318("Ablegen", (byte) -105);

    @OriginalMember(owner = "client!dg", name = "j", descriptor = "[J")
    public static long[] field2549 = new long[32];

    @OriginalMember(owner = "client!dg", name = "n", descriptor = "Lhj;")
    public static class69 field2553 = class181.method1318("0(U", (byte) -122);

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "Lhj;")
    public static class69 field2548 = class181.method1318("Spieler kann nicht gefunden werden: ", (byte) -119);

    @OriginalMember(owner = "client!dg", name = "o", descriptor = "Lhj;")
    private static class69 field2554 = class181.method1318("glow2:", (byte) -117);

    @OriginalMember(owner = "client!dg", name = "l", descriptor = "Lhj;")
    public static class69 field2551 = field2554;

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "Lhj;")
    public static class69 field2543 = field2554;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "I")
    public static int field2540;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "I")
    public static int field2541;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "I")
    public static int field2542;

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "client!dg", name = "p", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!dg", name = "q", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!dg", name = "r", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "Lnc;")
    public static class83 field2546;

    @OriginalMember(owner = "client!dg", name = "k", descriptor = "Lbb;")
    private class88 field2550;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Z)Lbb;")
    public final class88 method1014(boolean arg0) {
        if (arg0) {
            method1016(false);
        }
        field2544++;
        if (this.field2552 > 0 && this.field2547.field1922[this.field2552 - 1] != this.field2550) {
            class88 var2 = this.field2550;
            this.field2550 = var2.field1677;
            return var2;
        }
        while (this.field2552 < this.field2547.field1919) {
            class88 var3 = this.field2547.field1922[this.field2552++].field1677;
            if (this.field2547.field1922[this.field2552 - 1] != var3) {
                this.field2550 = var3.field1677;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)I")
    public static final int method1015(int arg0, int arg1) {
        field2557++;
        if (arg0 == 1207330220) {
            int var2 = arg1 * 6 - 61440;
            int var3 = (arg1 * var2 >> 12) + 40960;
            int var4 = (arg1 * arg1 >> 12) * arg1 >> 12;
            return var3 * var4 >> 12;
        } else {
            return -89;
        }
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(Z)V")
    public static void method1016(boolean arg0) {
        field2548 = null;
        field2546 = null;
        field2553 = null;
        field2543 = null;
        field2554 = null;
        field2545 = null;
        field2551 = null;
        if (arg0) {
            field2549 = null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZIIIB)V")
    public static final void method1017(boolean arg0, int arg1, int arg2, int arg3, byte arg4) {
        int var5 = -86 % ((-arg4 - 56) / 32);
        field2555++;
        if (class131.method971(arg2, (byte) -86)) {
            class171.method1251(arg0, class116.field2222[arg2], arg1, -1, (byte) -116, arg3);
        }
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(II)I")
    public static final int method1018(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(II)I")
    public static final int method1019(int arg0, int arg1) {
        field2542++;
        return arg1 == 761691850 ? arg0 >>> 10 : -26;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)Lbb;")
    public final class88 method1020(byte arg0) {
        field2541++;
        if (arg0 != -88) {
            method1022((byte) -26);
        }
        this.field2552 = 0;
        return this.method1014(false);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIBII)V")
    public static final void method1021(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field2556++;
        int var6 = arg4 - arg2;
        int var7 = arg0 - arg5;
        if (var6 == 0) {
            if (var7 != 0) {
                class52.method308(-3, arg1, arg5, arg2, arg0);
            }
        } else if (var7 == 0) {
            class54.method322(arg2, arg5, arg1, -120, arg4);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg5 - (arg2 * var8 >> 12);
            if (arg3 != -37) {
                method1021(-97, -88, -34, (byte) 107, 19, 68);
            }
            int var10;
            int var11;
            if (class201.field3629 > arg4) {
                var10 = class201.field3629;
                var11 = (class201.field3629 * var8 >> 12) + var9;
            } else if (class35.field485 >= arg4) {
                var11 = arg0;
                var10 = arg4;
            } else {
                var10 = class35.field485;
                var11 = (class35.field485 * var8 >> 12) + var9;
            }
            int var12;
            int var13;
            if (arg2 < class201.field3629) {
                var12 = (class201.field3629 * var8 >> 12) + var9;
                var13 = class201.field3629;
            } else if (arg2 <= class35.field485) {
                var12 = arg5;
                var13 = arg2;
            } else {
                var12 = (class35.field485 * var8 >> 12) + var9;
                var13 = class35.field485;
            }
            if (var11 < class19.field252) {
                var11 = class19.field252;
                var10 = (class19.field252 - var9 << 12) / var8;
            } else if (class166.field3075 < var11) {
                var10 = (class166.field3075 - var9 << 12) / var8;
                var11 = class166.field3075;
            }
            if (var12 < class19.field252) {
                var13 = (class19.field252 - var9 << 12) / var8;
                var12 = class19.field252;
            } else if (var12 > class166.field3075) {
                var12 = class166.field3075;
                var13 = (class166.field3075 - var9 << 12) / var8;
            }
            class69.method459((byte) -113, arg1, var12, var11, var10, var13);
        }
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(B)V")
    public static final void method1022(byte arg0) {
        boolean var1 = true;
        class9.method43(false, (byte) -127);
        field2540++;
        class254.field4579 = 0;
        for (int var2 = 0; var2 < class230.field4204.length; var2++) {
            if (class194.field3540[var2] != -1 && class230.field4204[var2] == null) {
                class230.field4204[var2] = class173.field3171.method590(0, class194.field3540[var2], 0);
                if (class230.field4204[var2] == null) {
                    var1 = false;
                    class254.field4579++;
                }
            }
            if (class202.field3656[var2] != -1 && class40.field568[var2] == null) {
                class40.field568[var2] = class173.field3171.method614(class202.field3656[var2], (byte) 98, class272.field4814[var2], 0);
                if (class40.field568[var2] == null) {
                    var1 = false;
                    class254.field4579++;
                }
            }
            if (class220.field3955 != null && class51.field911[var2] == null && class220.field3955[var2] != -1) {
                class51.field911[var2] = class173.field3171.method614(class220.field3955[var2], (byte) 98, class272.field4814[var2], 0);
                if (class51.field911[var2] == null) {
                    class254.field4579++;
                    var1 = false;
                }
            }
        }
        if (class13.field192 == null || !class110.field2095.method592(class9.method42(-113, new class69[] { class13.field192.field712, class175.field3184 }), 100)) {
            class246.field4506 = null;
        } else if (class110.field2095.method611(arg0 ^ 0x77, class9.method42(87, new class69[] { class13.field192.field712, class175.field3184 }))) {
            class246.field4506 = class97.method717(class110.field2095, class9.method42(-78, new class69[] { class13.field192.field712, class175.field3184 }), arg0 - 164);
        } else {
            class254.field4579++;
            var1 = false;
        }
        if (!var1) {
            class221.field3974 = 1;
            return;
        }
        boolean var3 = true;
        class157.field2931 = 0;
        if (arg0 != 69) {
            return;
        }
        for (int var4 = 0; var4 < class230.field4204.length; var4++) {
            byte[] var19 = class40.field568[var4];
            if (var19 != null) {
                int var20 = (class245.field4486[var4] >> 8) * 64 - class242.field4441;
                int var21 = (class245.field4486[var4] & 0xFF) * 64 - class220.field3962;
                if (class83.field1577) {
                    var20 = 10;
                    var21 = 10;
                }
                var3 &= class122.method880(var20, arg0 - 47, var21, var19);
            }
        }
        if (!var3) {
            class221.field3974 = 2;
            return;
        }
        if (class221.field3974 != 0) {
            class155.method1175(false, true, class9.method42(-86, new class69[] { class138.field2589, class13.field185 }));
        }
        class17.method105(-102);
        class153.method1158((byte) -120);
        class168.method1239();
        for (int var5 = 0; var5 < 4; var5++) {
            class79.field1518[var5].method1816(arg0 - 182);
        }
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var17 = 0; var17 < 104; var17++) {
                for (int var18 = 0; var18 < 104; var18++) {
                    class19.field246[var6][var17][var18] = 0;
                }
            }
        }
        class268.method1846(false, arg0 - 68);
        class17.method105(-122);
        System.gc();
        class9.method43(true, (byte) -127);
        class45.method255(false, (byte) 115);
        if (!class83.field1577) {
            class12.method59(false, -23760);
            class9.method43(true, (byte) -127);
            class104.method776(false, (byte) 34);
            if (class51.field911 != null) {
                class268.method1842((byte) 42);
            }
        }
        if (class83.field1577) {
            class161.method1205(-5074, false);
            class9.method43(true, (byte) -127);
            class189.method1374(-10929, false);
        }
        class153.method1158((byte) -98);
        class9.method43(true, (byte) -127);
        class139.method1067(false, (byte) 86, class79.field1518);
        class9.method43(true, (byte) -127);
        int var7 = class88.field1670;
        if (class52.field927 < var7) {
            var7 = class52.field927;
        }
        if (class52.field927 - 1 > var7) {
            int var8 = class52.field927 - 1;
        }
        if (class163.method1215(95)) {
            class79.method566(0);
        } else {
            class79.method566(class88.field1670);
        }
        class108.method807((byte) 90);
        for (int var9 = 0; var9 < 104; var9++) {
            for (int var16 = 0; var16 < 104; var16++) {
                class263.method1808(var9, var16, 64);
            }
        }
        class10.method50(-122);
        class17.method105(-101);
        class55.method324(arg0 - 115);
        class153.method1158((byte) 67);
        if (class10.field85 != null && class135.field2532 != null && class268.field4760 == 25) {
            class48.field692.method301(138, -104);
            class48.field692.method908(false, 1057001181);
            class205.field3750++;
        }
        if (!class83.field1577) {
            int var10 = (class201.field3638 - 6) / 8;
            int var11 = (class201.field3638 + 6) / 8;
            int var12 = (class101.field1899 - 6) / 8;
            int var13 = (class101.field1899 + 6) / 8;
            for (int var14 = var10 - 1; var14 <= var11 + 1; var14++) {
                for (int var15 = var12 - 1; var15 <= var13 + 1; var15++) {
                    if (var14 < var10 || var11 < var14 || var15 < var12 || var13 < var15) {
                        class173.field3171.method605(true, class9.method42(62, new class69[] { class140.field2614, class98.method727(-229, var14), class266.field4729, class98.method727(-229, var15) }));
                        class173.field3171.method605(true, class9.method42(45, new class69[] { class23.field340, class98.method727(-229, var14), class266.field4729, class98.method727(arg0 - 298, var15) }));
                    }
                }
            }
        }
        if (class268.field4760 == 28) {
            class115.method851(124, 10);
        } else {
            class115.method851(arg0 - 154, 30);
            if (class135.field2532 != null) {
                class48.field692.method301(70, arg0 ^ 0xFFFFFFDD);
            }
        }
        class17.method105(-119);
        class88.method630((byte) -15);
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Lc;)V")
    public class136(class103 arg0) {
        this.field2547 = arg0;
    }
}
