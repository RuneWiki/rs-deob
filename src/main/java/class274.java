import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class274 {

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "Ljc;")
    private class285 field4702 = new class285();

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "Lve;")
    public static class255 field4701 = class87.method607(111, "null");

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "I")
    public static int field4703 = 0;

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "Lve;")
    public static class255 field4707 = class87.method607(107, "W-=hlen Sie eine Option");

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "I")
    public static int field4714 = 0;

    @OriginalMember(owner = "client!ma", name = "r", descriptor = "I")
    public static int field4715 = 0;

    @OriginalMember(owner = "client!ma", name = "s", descriptor = "Lfg;")
    public static class203 field4716 = new class203();

    @OriginalMember(owner = "client!ma", name = "t", descriptor = "Lve;")
    private static class255 field4717 = class87.method607(41, "Started 3d Library");

    @OriginalMember(owner = "client!ma", name = "v", descriptor = "Lve;")
    public static class255 field4719 = field4717;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "I")
    public static int field4698;

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "I")
    public static int field4699;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "I")
    public static int field4700;

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "I")
    public static int field4704;

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "I")
    public static int field4705;

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "I")
    public static int field4706;

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "I")
    public static int field4708;

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "I")
    public static int field4709;

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "I")
    public static int field4710;

    @OriginalMember(owner = "client!ma", name = "o", descriptor = "I")
    public static int field4712;

    @OriginalMember(owner = "client!ma", name = "p", descriptor = "I")
    public static int field4713;

    @OriginalMember(owner = "client!ma", name = "u", descriptor = "I")
    public static int field4718;

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "Ljc;")
    private class285 field4711;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(B)I", line = 5)
    public final int method1916(byte arg0) {
        int var2 = -15 / ((arg0 + 23) / 58);
        field4708++;
        int var3 = 0;
        class285 var4 = this.field4702.field4907;
        while (this.field4702 != var4) {
            var4 = var4.field4907;
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)Ljc;", line = 31)
    public final class285 method1917(int arg0) {
        field4712++;
        class285 var2 = this.field4711;
        if (this.field4702 == var2) {
            this.field4711 = null;
            return null;
        } else {
            this.field4711 = var2.field4907;
            return arg0 == -1 ? var2 : (class285) null;
        }
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(B)V", line = 58)
    public final void method1918(byte arg0) {
        while (true) {
            class285 var2 = this.field4702.field4907;
            if (this.field4702 == var2) {
                if (arg0 != -88) {
                    return;
                }
                field4705++;
                this.field4711 = null;
                return;
            }
            var2.method2024((byte) 88);
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z)Ljc;", line = 81)
    public final class285 method1919(boolean arg0) {
        if (arg0) {
            field4719 = (class255) null;
        }
        field4704++;
        class285 var2 = this.field4702.field4907;
        if (this.field4702 == var2) {
            this.field4711 = null;
            return null;
        } else {
            this.field4711 = var2.field4907;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(B)Ljc;", line = 103)
    public final class285 method1920(byte arg0) {
        if (arg0 != 11) {
            this.method1917(83);
        }
        field4698++;
        class285 var2 = this.field4702.field4907;
        if (this.field4702 == var2) {
            return null;
        } else {
            var2.method2024((byte) 108);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)V", line = 121)
    public static final void method1921(int arg0) {
        field4706++;
        if (class253.field4277 == null) {
            return;
        }
        if (class73.field1205 < 10) {
            if (!class17.field247.method629(class253.field4277.field1568, 19531) || !class17.field247.method629(class3.method14(new class255[] { class253.field4277.field1568, class235.field3870 }, (byte) -68), arg0 ^ 0x4C55)) {
                class73.field1205 = class159.field2686.method621(class253.field4277.field1568, (byte) -71) / 10;
                return;
            }
            class271.method1885(arg0 ^ 0xFFFFFFE5);
            class73.field1205 = 10;
        }
        if (class73.field1205 == 10) {
            class297.field5084 = class253.field4277.field1556 >> 6 << 6;
            class41.field636 = (class253.field4277.field1550 >> 6 << 6) + 64 - class297.field5084;
            class225.field3768 = class253.field4277.field1554 >> 6 << 6;
            int var1 = class197.field3355 + (class276.field4742.field5130 >> 7) - class225.field3768;
            int var2 = var1 + (int) (Math.random() * 10.0D) - 5;
            class282.field4846 = (class253.field4277.field1549 >> 6 << 6) + 64 - class225.field3768;
            int var3 = -(class276.field4742.field5173 >> 7) - class268.field4615 - (-class297.field5084 - -1 - class41.field636);
            class59.field905 = 8.0F;
            class97.field1683 = 8.0F;
            int var4 = var3 + (int) (Math.random() * 10.0D) - 5;
            if (var2 >= 0 && var2 < class282.field4846 && var4 >= 0 && var4 < class41.field636) {
                class149.field2520 = var4;
                class85.field1369 = var2;
            } else {
                class85.field1369 = class253.field4277.field1565 * 64 - class225.field3768;
                class149.field2520 = class297.field5084 + class41.field636 - (class253.field4277.field1570 * 64) - 1;
            }
            class301.method2099(88);
            int var5 = class282.field4846 >> 6;
            int var6 = class221.field3719 >> 1;
            class106.field1782 = new int[class6.field96 + 1];
            int var7 = class41.field636 >> 6;
            class76.field1248 = new byte[var5][var7][];
            class177.field2897 = new byte[var5][var7][];
            class38.field582 = new int[var5][var7][];
            class149.field2514 = new byte[var5][var7][];
            class160.field2700 = new byte[var5][var7][];
            int var8 = class168.field2825 >> 2 << 10;
            class203.field3503 = new int[var5][var7][];
            class118.field1981 = new byte[var5][var7][];
            class277.field4753 = new short[var5][var7][];
            class159.method1160(var6, false, var8);
            class73.field1205 = 20;
        } else if (class73.field1205 == 20) {
            class231.method1603(new class70(class17.field247.method641((byte) 60, class111.field1873, class253.field4277.field1568)), (byte) -47);
            class73.field1205 = 30;
            class111.method849(true, (byte) 119);
            class68.method414((byte) -121);
        } else if (class73.field1205 == 30) {
            class47.method287((byte) 42, new class70(class17.field247.method641((byte) 37, class122.field2028, class253.field4277.field1568)));
            class73.field1205 = 40;
            class68.method414((byte) -119);
        } else if (class73.field1205 == 40) {
            class136.method1021(new class70(class17.field247.method641((byte) 28, class2.field27, class253.field4277.field1568)), 0);
            class73.field1205 = 50;
            class68.method414((byte) -105);
        } else if (class73.field1205 == 50) {
            class121.method902(new class70(class17.field247.method641((byte) 12, class137.field2283, class253.field4277.field1568)), -125);
            class73.field1205 = 60;
            class111.method849(true, (byte) 105);
            class68.method414((byte) -100);
        } else if (class73.field1205 == 60) {
            class266.field4506 = class315.method2176((byte) 112, class3.method14(new class255[] { class253.field4277.field1568, class235.field3870 }, (byte) -57), class17.field247);
            class73.field1205 = 70;
            class68.method414((byte) -121);
        } else if (class73.field1205 == 70) {
            class41.field647 = new class228(11, true, class240.field3999);
            class73.field1205 = 73;
            class111.method849(true, (byte) 78);
            class68.method414((byte) -93);
        } else if (class73.field1205 == 73) {
            class93.field1602 = new class228(12, true, class240.field3999);
            class73.field1205 = 76;
            class111.method849(true, (byte) 80);
            class68.method414((byte) -120);
        } else if (class73.field1205 == 76) {
            class239.field3997 = new class228(14, true, class240.field3999);
            class73.field1205 = 79;
            class111.method849(true, (byte) 121);
            class68.method414((byte) -79);
        } else if (class73.field1205 == 79) {
            class30.field479 = new class228(17, true, class240.field3999);
            class73.field1205 = 82;
            class111.method849(true, (byte) 122);
            class68.method414((byte) -86);
        } else if (class73.field1205 == 82) {
            class215.field3659 = new class228(19, true, class240.field3999);
            class73.field1205 = 85;
            class111.method849(true, (byte) 62);
            class68.method414((byte) -80);
        } else if (class73.field1205 == 85) {
            class81.field1318 = new class228(22, true, class240.field3999);
            class73.field1205 = 88;
            class111.method849(true, (byte) 94);
            class68.method414((byte) -108);
        } else if (class73.field1205 == 88) {
            class277.field4766 = new class228(26, true, class240.field3999);
            class73.field1205 = 91;
            class111.method849(true, (byte) 69);
            class68.method414((byte) -119);
        } else {
            class144.field2397 = new class228(arg0, true, class240.field3999);
            class73.field1205 = 100;
            class111.method849(true, (byte) 64);
            class68.method414((byte) -119);
            class59.field897 = -1;
            class314.field5334 = -1;
            System.gc();
        }
    }

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "(B)V", line = 312)
    public static final void method1922(byte arg0) {
        class277.field4753 = (short[][][]) null;
        class203.field3503 = (int[][][]) null;
        class106.field1782 = null;
        field4710++;
        class76.field1248 = (byte[][][]) null;
        class118.field1981 = (byte[][][]) null;
        class38.field582 = (int[][][]) null;
        class149.field2514 = (byte[][][]) null;
        class285.field4900 = null;
        class160.field2700 = (byte[][][]) null;
        class177.field2897 = (byte[][][]) null;
        class73.field1205 = 0;
        class253.field4277 = null;
        class215.field3654.method1474(true);
        class81.field1318 = null;
        class70.field1046 = null;
        class144.field2397 = null;
        class93.field1602 = null;
        class30.field479 = null;
        class254.field4283 = null;
        class239.field3997 = null;
        class215.field3659 = null;
        class277.field4766 = null;
        class41.field647 = null;
        if (arg0 <= -55) {
            class266.field4506 = null;
        }
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "()V", line = 402)
    public class274() {
        this.field4702.field4907 = this.field4702;
        this.field4702.field4901 = this.field4702;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILjc;)V", line = 377)
    public final void method1923(int arg0, class285 arg1) {
        if (arg1.field4901 != null) {
            arg1.method2024((byte) 120);
        }
        if (arg0 != -8121) {
            field4701 = (class255) null;
        }
        arg1.field4907 = this.field4702;
        field4713++;
        arg1.field4901 = this.field4702.field4901;
        arg1.field4901.field4907 = arg1;
        arg1.field4907.field4901 = arg1;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ZI[Ltl;IBI)V", line = 414)
    public static final void method1924(boolean arg0, int arg1, class197[] arg2, int arg3, byte arg4, int arg5) {
        int var6 = -86 / ((arg4 + 29) / 60);
        for (int var7 = 0; var7 < arg2.length; var7++) {
            class197 var8 = arg2[var7];
            if (var8 != null && var8.field3353 == arg1) {
                class97.method767(var8, arg0, (byte) 10, arg3, arg5);
                class82.method566(var8, arg3, arg5, 118);
                if ((var8.field3261 - var8.field3294) < var8.field3371) {
                    var8.field3371 = var8.field3261 - var8.field3294;
                }
                if ((var8.field3384 - var8.field3253) < var8.field3310) {
                    var8.field3310 = var8.field3384 - var8.field3253;
                }
                if (var8.field3371 < 0) {
                    var8.field3371 = 0;
                }
                if (var8.field3310 < 0) {
                    var8.field3310 = 0;
                }
                if (var8.field3281 == 0) {
                    class131.method972((byte) 124, arg0, var8);
                }
            }
        }
        field4700++;
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(I)V", line = 461)
    public static void method1925(int arg0) {
        if (arg0 != -1) {
            return;
        }
        field4717 = null;
        field4719 = null;
        field4716 = null;
        field4701 = null;
        field4707 = null;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILrg;II)[Lud;", line = 476)
    public static final class269[] method1926(int arg0, class88 arg1, int arg2, int arg3) {
        if (arg0 != -30884) {
            field4719 = (class255) null;
        }
        field4709++;
        return class96.method763((byte) 58, arg3, arg2, arg1) ? class96.method756((byte) -77) : null;
    }
}
