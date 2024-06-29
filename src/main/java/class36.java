import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class36 {

    @OriginalMember(owner = "client!dh", name = "w", descriptor = "I")
    private int field743 = 0;

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "I")
    private int field728;

    @OriginalMember(owner = "client!dh", name = "s", descriptor = "[Lse;")
    private class166[] field739;

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "Lcd;")
    public static class23 field723 = class54.method414("Okay", -1);

    @OriginalMember(owner = "client!dh", name = "p", descriptor = "J")
    public static long field736 = 0L;

    @OriginalMember(owner = "client!dh", name = "t", descriptor = "Lcf;")
    public static class25 field740 = new class25();

    @OriginalMember(owner = "client!dh", name = "u", descriptor = "Lsa;")
    public static class162 field741 = new class162(64);

    @OriginalMember(owner = "client!dh", name = "x", descriptor = "Lcd;")
    public static class23 field744 = class54.method414("<img=0>", -1);

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "I")
    public static int field721;

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
    public static int field722;

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!dh", name = "i", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!dh", name = "j", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!dh", name = "l", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!dh", name = "m", descriptor = "I")
    public static int field733;

    @OriginalMember(owner = "client!dh", name = "n", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!dh", name = "o", descriptor = "I")
    public static int field735;

    @OriginalMember(owner = "client!dh", name = "q", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "client!dh", name = "r", descriptor = "I")
    public static int field738;

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "J")
    private long field724;

    @OriginalMember(owner = "client!dh", name = "k", descriptor = "Lse;")
    private class166 field731;

    @OriginalMember(owner = "client!dh", name = "v", descriptor = "Lse;")
    private class166 field742;

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "[Lcd;")
    public static class23[] field726;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)I")
    public final int method253(byte arg0) {
        int var2 = 0;
        field735++;
        if (arg0 >= -29) {
            this.method256(null, false);
        }
        for (int var3 = 0; var3 < this.field728; var3++) {
            class166 var4 = this.field739[var3];
            class166 var5 = var4.field3310;
            while (var4 != var5) {
                var5 = var5.field3310;
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(B)Lse;")
    public final class166 method254(byte arg0) {
        field722++;
        if (this.field731 == null) {
            return null;
        }
        class166 var2 = this.field739[(int) (this.field724 & (long) (this.field728 - 1))];
        while (this.field731 != var2) {
            if (this.field731.field3317 == this.field724) {
                class166 var3 = this.field731;
                this.field731 = this.field731.field3310;
                return var3;
            }
            this.field731 = this.field731.field3310;
        }
        if (arg0 == -97) {
            this.field731 = null;
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Z)V")
    public static void method255(boolean arg0) {
        field723 = null;
        field741 = null;
        field726 = null;
        field740 = null;
        field744 = null;
        if (arg0) {
            method257(99, -78, -106);
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "([Lse;Z)I")
    public final int method256(class166[] arg0, boolean arg1) {
        field737++;
        int var3 = 0;
        if (!arg1) {
            method257(94, -31, 35);
        }
        for (int var4 = 0; var4 < this.field728; var4++) {
            class166 var5 = this.field739[var4];
            for (class166 var6 = var5.field3310; var6 != var5; var6 = var6.field3310) {
                arg0[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(III)I")
    public static final int method257(int arg0, int arg1, int arg2) {
        field732++;
        if (arg1 == -1) {
            return 12345678;
        }
        int var3 = (arg1 & 0x7F) * arg2 / 128;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return arg0 == 2670 ? (arg1 & 0xFF80) + var3 : -33;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ILac;III)V")
    public static final void method258(int arg0, class4 arg1, int arg2, int arg3, int arg4) {
        field727++;
        if (class49.field1171 >= 400) {
            return;
        }
        if (arg1.field59 != null) {
            arg1 = arg1.method26((byte) 5);
        }
        if (arg1 == null || !arg1.field70) {
            return;
        }
        class23 var5 = arg1.field84;
        if (arg4 != -29956) {
            method258(40, null, 112, -2, 96);
        }
        if (arg1.field79 != 0) {
            var5 = class3.method14(true, new class23[] { var5, class165.method1011(-1, class134.field2790.field1341, arg1.field79), class55.field1297, class150.field3005, class184.method1132(-1, arg1.field79), class182.field3594 });
        }
        if (class47.field1013 == 1) {
            class162.method993(arg0, arg2, 9, class170.field3390, 6349, class3.method14(true, new class23[] { class183.field3609, class97.field2037, var5 }), arg3);
            class78.field1721++;
        } else if (!class73.field1660) {
            class2.field21++;
            class23[] var6 = arg1.field71;
            if (class177.field3526) {
                var6 = class177.method1111(var6, 62);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && !var6[var7].method146(-65, class134.field2792)) {
                        class194.field3832++;
                        byte var8 = 0;
                        if (var7 == 0) {
                            var8 = 19;
                        }
                        if (var7 == 1) {
                            var8 = 7;
                        }
                        if (var7 == 2) {
                            var8 = 16;
                        }
                        if (var7 == 3) {
                            var8 = 58;
                        }
                        if (var7 == 4) {
                            var8 = 29;
                        }
                        class162.method993(arg0, arg2, var8, var6[var7], 6349, class3.method14(true, new class23[] { class53.field1251, var5 }), arg3);
                    }
                }
            }
            if (var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].method146(127, class134.field2792)) {
                        class103.field2196++;
                        short var10 = 0;
                        if (class134.field2790.field1341 < arg1.field79) {
                            var10 = 2000;
                        }
                        int var11 = 0;
                        if (var9 == 0) {
                            var11 = var10 + 19;
                        }
                        if (var9 == 1) {
                            var11 = var10 + 7;
                        }
                        if (var9 == 2) {
                            var11 = var10 + 16;
                        }
                        if (var9 == 3) {
                            var11 = var10 + 58;
                        }
                        if (var9 == 4) {
                            var11 = var10 + 29;
                        }
                        class162.method993(arg0, arg2, var11, var6[var9], 6349, class3.method14(true, new class23[] { class53.field1251, var5 }), arg3);
                    }
                }
            }
            class162.method993(arg0, arg2, 1005, class160.field3205, arg4 + 36305, class3.method14(true, new class23[] { class53.field1251, var5 }), arg3);
            return;
        } else if ((class166.field3312 & 0x2) == 2) {
            class160.field3201++;
            class162.method993(arg0, arg2, 34, class124.field2550, 6349, class3.method14(true, new class23[] { class136.field2819, class97.field2037, var5 }), arg3);
            return;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)Lse;")
    public final class166 method259(int arg0) {
        if (arg0 > 0) {
            method258(-76, null, 71, -6, 113);
        }
        field721++;
        if (this.field743 > 0 && this.field739[this.field743 - 1] != this.field742) {
            class166 var2 = this.field742;
            this.field742 = var2.field3310;
            return var2;
        }
        while (this.field728 > this.field743) {
            class166 var3 = this.field739[this.field743++].field3310;
            if (this.field739[this.field743 - 1] != var3) {
                this.field742 = var3.field3310;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(JB)Lse;")
    public final class166 method260(long arg0, byte arg1) {
        field729++;
        this.field724 = arg0;
        if (arg1 != 28) {
            return null;
        }
        class166 var4 = this.field739[(int) ((long) (this.field728 - 1) & arg0)];
        for (this.field731 = var4.field3310; this.field731 != var4; this.field731 = this.field731.field3310) {
            if (this.field731.field3317 == arg0) {
                class166 var5 = this.field731;
                this.field731 = this.field731.field3310;
                return var5;
            }
        }
        this.field731 = null;
        return null;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(BILcd;)V")
    public static final void method261(byte arg0, int arg1, class23 arg2) {
        field734++;
        class85.field1808++;
        class159.field3190.method631(111, arg0 + 92);
        class159.field3190.method1180(arg1, (byte) 112);
        if (arg0 != -93) {
            field744 = null;
        }
        class159.field3190.method1181(31, arg2.method166((byte) -103));
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(JILse;)V")
    public final void method262(long arg0, int arg1, class166 arg2) {
        field733++;
        if (arg2.field3315 != null) {
            arg2.method1018(15789);
        }
        class166 var5 = this.field739[(int) (arg0 & (long) (this.field728 - 1))];
        if (arg1 >= -73) {
            this.field739 = null;
        }
        arg2.field3315 = var5.field3315;
        arg2.field3310 = var5;
        arg2.field3317 = arg0;
        arg2.field3315.field3310 = arg2;
        arg2.field3310.field3315 = arg2;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ZI)Lp;")
    public static final class134 method263(boolean arg0, int arg1) {
        field730++;
        class134 var2 = (class134) class190.field3777.method995(105, (long) arg1);
        if (var2 != null) {
            return var2;
        } else if (arg0) {
            return null;
        } else {
            byte[] var3 = class64.field1524.method651(4, arg1, 5);
            class134 var4 = new class134();
            if (var3 != null) {
                var4.method856(new class189(var3), 29857);
            }
            class190.field3777.method990(var4, (long) arg1, -114);
            return var4;
        }
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(I)Lse;")
    public final class166 method264(int arg0) {
        field738++;
        if (arg0 <= 27) {
            return null;
        } else {
            this.field743 = 0;
            return this.method259(-94);
        }
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(I)V")
    public class36(int arg0) {
        this.field728 = arg0;
        this.field739 = new class166[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class166 var3 = this.field739[var2] = new class166();
            var3.field3310 = var3;
            var3.field3315 = var3;
        }
    }
}
