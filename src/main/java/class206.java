import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class206 extends class108 implements class134 {

    @OriginalMember(owner = "client!bf", name = "s", descriptor = "Z")
    private boolean field2864 = false;

    @OriginalMember(owner = "client!bf", name = "D", descriptor = "I")
    private int field2875 = 50;

    @OriginalMember(owner = "client!bf", name = "B", descriptor = "Lhc;")
    private class235 field2873;

    @OriginalMember(owner = "client!bf", name = "A", descriptor = "Lhc;")
    private class235 field2872;

    @OriginalMember(owner = "client!bf", name = "N", descriptor = "Lic;")
    private class143 field2885;

    @OriginalMember(owner = "client!bf", name = "t", descriptor = "Lic;")
    private class143 field2865;

    @OriginalMember(owner = "client!bf", name = "w", descriptor = "Ljava/lang/String;")
    public static String field2868 = "Loaded interfaces";

    @OriginalMember(owner = "client!bf", name = "C", descriptor = "I")
    public static volatile int field2874 = 0;

    @OriginalMember(owner = "client!bf", name = "r", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!bf", name = "u", descriptor = "I")
    public static int field2866;

    @OriginalMember(owner = "client!bf", name = "v", descriptor = "I")
    public static int field2867;

    @OriginalMember(owner = "client!bf", name = "x", descriptor = "I")
    public static int field2869;

    @OriginalMember(owner = "client!bf", name = "y", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!bf", name = "z", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!bf", name = "E", descriptor = "I")
    public static int field2876;

    @OriginalMember(owner = "client!bf", name = "F", descriptor = "I")
    public static int field2877;

    @OriginalMember(owner = "client!bf", name = "G", descriptor = "I")
    public static int field2878;

    @OriginalMember(owner = "client!bf", name = "H", descriptor = "I")
    public static int field2879;

    @OriginalMember(owner = "client!bf", name = "I", descriptor = "I")
    public static int field2880;

    @OriginalMember(owner = "client!bf", name = "J", descriptor = "I")
    public static int field2881;

    @OriginalMember(owner = "client!bf", name = "K", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!bf", name = "L", descriptor = "I")
    public static int field2883;

    @OriginalMember(owner = "client!bf", name = "M", descriptor = "Lse;")
    public static class211 field2884;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "(II)V")
    public final void method1307(int arg0, int arg1) {
        for (class258 var3 = (class258) this.field2885.method955(false); var3 != null; var3 = (class258) this.field2885.method960((byte) -88)) {
            if (var3.field3939) {
                var3.method1718(arg1);
                var3.field3939 = false;
            }
        }
        if (arg0 > -44) {
            this.field2875 = -82;
        }
        field2871++;
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(II)Lbl;")
    public final class34 method694(int arg0, int arg1) {
        class258 var3 = this.method1309(0, arg0);
        field2870++;
        if (arg1 != 19) {
            this.field2872 = null;
        }
        return var3 == null ? null : var3.field3935;
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(II)Z")
    public final boolean method913(int arg0, int arg1) {
        if (arg1 != -2) {
            this.field2865 = null;
        }
        field2881++;
        return this.field2864 || this.method699(arg0, false).field3840;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)I")
    public static final int method1308(byte arg0) {
        field2880++;
        if (arg0 > -37) {
            return 3;
        } else if (class273.field4202 && class138.field1928[81] && class68.field925 > 2) {
            return class227.field3444[class68.field925 - 2];
        } else {
            return class227.field3444[class68.field925 - 1];
        }
    }

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "(II)Lfj;")
    private final class258 method1309(int arg0, int arg1) {
        field2878++;
        class258 var3 = (class258) this.field2885.method961((long) arg1, arg0 + 9156);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field2873.method1576(-117, arg1, arg0);
        if (var4 == null) {
            return null;
        } else {
            class258 var5 = new class258(new class224(var4));
            this.field2885.method957(arg0 ^ 0x559B, (long) arg1, var5);
            return var5;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZIFII)Lq;")
    public final class128 method910(boolean arg0, int arg1, float arg2, int arg3, int arg4) {
        field2867++;
        if (arg4 <= 39) {
            return null;
        }
        class258 var6 = this.method1309(0, arg1);
        if (var6 != null && var6.method1720(this, this.field2872)) {
            return arg0 ? var6.field3935.method226(arg3, this.field2872, arg3, this, true, (double) arg2, false) : var6.field3935.method228(arg3, -1, false, this.field2872, this, (double) arg2, arg3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(B)V")
    public static void method1310(byte arg0) {
        field2868 = null;
        field2884 = null;
        if (arg0 >= -46) {
            field2884 = null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IB)Z")
    public final boolean method909(int arg0, byte arg1) {
        field2882++;
        if (arg1 != 85) {
            this.field2873 = null;
        }
        return this.method699(arg0, false).field3838;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)I")
    public final int method911(int arg0, int arg1) {
        field2877++;
        if (arg0 <= 74) {
            this.method1311(78);
        }
        return this.method699(arg1, false).field3834 & 0xFFFF;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIF)[I")
    public final int[] method914(int arg0, int arg1, float arg2) {
        if (arg1 > -105) {
            return null;
        }
        class258 var4 = this.method1309(0, arg0);
        field2883++;
        if (var4 == null) {
            return null;
        } else {
            var4.field3939 = true;
            return var4.method1719(this, this.field2872, arg2, this.field2864 || this.method699(arg0, false).field3840);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V")
    public final void method1311(int arg0) {
        this.field2885.method958((byte) 70);
        if (arg0 == 0) {
            field2869++;
            if (this.field2865 != null) {
                this.field2865.method958((byte) 70);
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lql;I)V")
    public static final void method1312(class224 arg0, int arg1) {
        field2863++;
        if (arg0.field3336.length - arg0.field3402 < 1) {
            return;
        }
        int var2 = arg0.method1453((byte) -127);
        if (var2 < 0 || var2 > 11) {
            return;
        }
        byte var3;
        if (var2 == 11) {
            var3 = 33;
        } else if (var2 == 10) {
            var3 = 32;
        } else if (var2 == 9) {
            var3 = 31;
        } else if (var2 == 8) {
            var3 = 30;
        } else if (var2 == 7) {
            var3 = 29;
        } else if (var2 == 6) {
            var3 = 28;
        } else if (var2 == 5) {
            var3 = 28;
        } else if (var2 == 4) {
            var3 = 24;
        } else if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if (var3 > arg0.field3336.length - arg0.field3402) {
            return;
        }
        class266.field3984 = arg0.method1453((byte) -127);
        if (class266.field3984 < 1) {
            class266.field3984 = 1;
        } else if (class266.field3984 > 4) {
            class266.field3984 = 4;
        }
        class199.method1270(-1, ~arg0.method1453((byte) -128) == -2);
        class148.field2048 = arg0.method1453((byte) -128) == 1;
        if (arg1 <= 86) {
            method1308((byte) 62);
        }
        class75.field1053 = arg0.method1453((byte) -127) == 1;
        class86.field1174 = arg0.method1453((byte) -127) == 1;
        class246.field3763 = arg0.method1453((byte) -127) == 1;
        class245.field3744 = arg0.method1453((byte) -128) == 1;
        class212.field3187 = arg0.method1453((byte) -127) == 1;
        class29.field390 = arg0.method1453((byte) -127) == 1;
        class213.field3211 = arg0.method1453((byte) -128);
        if (class213.field3211 > 2) {
            class213.field3211 = 2;
        }
        if (var2 < 2) {
            class141.field1957 = arg0.method1453((byte) -127) == 1;
            arg0.method1453((byte) -127);
        } else {
            class141.field1957 = arg0.method1453((byte) -128) == 1;
        }
        class208.field2951 = arg0.method1453((byte) -128) == 1;
        class41.field617 = arg0.method1453((byte) -127) == 1;
        class77.field1079 = arg0.method1453((byte) -127);
        if (class77.field1079 > 2) {
            class77.field1079 = 2;
        }
        class111.field1617 = class77.field1079;
        class261.field3954 = arg0.method1453((byte) -127) == 1;
        class205.field2860 = arg0.method1453((byte) -128);
        if (class205.field2860 > 127) {
            class205.field2860 = 127;
        }
        class168.field2312 = arg0.method1453((byte) -127);
        class122.field1701 = arg0.method1453((byte) -128);
        if (class122.field1701 > 127) {
            class122.field1701 = 127;
        }
        if (var2 >= 1) {
            class108.field1501 = arg0.method1445(false);
            class30.field408 = arg0.method1445(false);
        }
        if (var2 >= 3 && var2 < 6) {
            arg0.method1453((byte) -127);
        }
        if (var2 >= 4) {
            int var4 = arg0.method1453((byte) -128);
            if (class274.field4236 < 96) {
                var4 = 0;
            }
            class97.method643(var4);
        }
        if (var2 >= 5) {
            class254.field3899 = arg0.method1483((byte) 46);
        }
        if (var2 >= 6) {
            class221.field3321 = arg0.method1453((byte) -127);
        }
        if (var2 >= 7) {
            class235.field3553 = arg0.method1453((byte) -128) == 1;
        }
        if (var2 >= 8) {
            class297.field4681 = arg0.method1453((byte) -128) == 1;
        }
        if (var2 >= 9) {
            class219.field3294 = arg0.method1453((byte) -127);
        }
        if (var2 >= 10) {
            class34.field529 = arg0.method1453((byte) -128) != 0;
        }
        if (var2 >= 11) {
            class59.field844 = arg0.method1453((byte) -128) != 0;
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(IB)Z")
    public final boolean method912(int arg0, byte arg1) {
        if (arg1 == -33) {
            field2879++;
            return !this.method699(arg0, false).field3848;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(IZ)V")
    public final void method1313(int arg0, boolean arg1) {
        field2876++;
        this.field2864 = arg1;
        this.method1311(0);
        if (arg0 <= 18) {
            this.method914(-47, -116, -0.5873865F);
        }
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lhc;Lhc;Lhc;IZ)V")
    public class206(class235 arg0, class235 arg1, class235 arg2, int arg3, boolean arg4) {
        super(arg1, arg0, arg2);
        this.field2864 = arg4;
        this.field2875 = arg3;
        this.field2873 = arg0;
        this.field2872 = arg2;
        this.field2885 = new class143(this.field2875);
        this.field2865 = null;
    }
}
