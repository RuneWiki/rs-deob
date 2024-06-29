import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class140 extends class40 {

    @OriginalMember(owner = "client!ua", name = "nb", descriptor = "I")
    private int field3144 = -1;

    @OriginalMember(owner = "client!ua", name = "fb", descriptor = "Z")
    private boolean field3136 = false;

    @OriginalMember(owner = "client!ua", name = "zb", descriptor = "Z")
    private volatile boolean field3156 = false;

    @OriginalMember(owner = "client!ua", name = "mb", descriptor = "Lha;")
    private class50 field3143;

    @OriginalMember(owner = "client!ua", name = "sb", descriptor = "Lha;")
    private class50 field3149;

    @OriginalMember(owner = "client!ua", name = "yb", descriptor = "I")
    private int field3155;

    @OriginalMember(owner = "client!ua", name = "kb", descriptor = "Lob;")
    public static class99 field3141 = new class99(30);

    @OriginalMember(owner = "client!ua", name = "Ab", descriptor = "Lje;")
    public static class67 field3157 = class85.method592(255, " )2> ");

    @OriginalMember(owner = "client!ua", name = "Bb", descriptor = "I")
    public static int field3158 = -1;

    @OriginalMember(owner = "client!ua", name = "wb", descriptor = "Lje;")
    private static class67 field3153 = class85.method592(255, " seconds)3");

    @OriginalMember(owner = "client!ua", name = "ub", descriptor = "Lje;")
    public static class67 field3151 = field3153;

    @OriginalMember(owner = "client!ua", name = "Eb", descriptor = "Lje;")
    public static class67 field3161 = class85.method592(255, "Hidden)2use");

    @OriginalMember(owner = "client!ua", name = "Fb", descriptor = "Lje;")
    public static class67 field3162 = class85.method592(255, " zuerst von Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!ua", name = "Cb", descriptor = "Lje;")
    public static class67 field3159 = class85.method592(255, "Lade Konfiguration )2 ");

    @OriginalMember(owner = "client!ua", name = "Gb", descriptor = "I")
    public static int field3163 = 0;

    @OriginalMember(owner = "client!ua", name = "ab", descriptor = "I")
    public static int field3131;

    @OriginalMember(owner = "client!ua", name = "bb", descriptor = "I")
    public static int field3132;

    @OriginalMember(owner = "client!ua", name = "cb", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!ua", name = "db", descriptor = "I")
    public static int field3134;

    @OriginalMember(owner = "client!ua", name = "eb", descriptor = "I")
    public static int field3135;

    @OriginalMember(owner = "client!ua", name = "gb", descriptor = "I")
    public static int field3137;

    @OriginalMember(owner = "client!ua", name = "hb", descriptor = "I")
    public static int field3138;

    @OriginalMember(owner = "client!ua", name = "ib", descriptor = "I")
    private int field3139;

    @OriginalMember(owner = "client!ua", name = "jb", descriptor = "I")
    public static int field3140;

    @OriginalMember(owner = "client!ua", name = "lb", descriptor = "I")
    public static int field3142;

    @OriginalMember(owner = "client!ua", name = "pb", descriptor = "I")
    public static int field3146;

    @OriginalMember(owner = "client!ua", name = "qb", descriptor = "I")
    public static int field3147;

    @OriginalMember(owner = "client!ua", name = "rb", descriptor = "I")
    public static int field3148;

    @OriginalMember(owner = "client!ua", name = "tb", descriptor = "I")
    private int field3150;

    @OriginalMember(owner = "client!ua", name = "xb", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!ua", name = "Db", descriptor = "I")
    public static int field3160;

    @OriginalMember(owner = "client!ua", name = "vb", descriptor = "Z")
    public static boolean field3152;

    @OriginalMember(owner = "client!ua", name = "ob", descriptor = "[Z")
    private volatile boolean[] field3145;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IBII)I")
    public static final int method1053(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != 88) {
            return -41;
        } else {
            ++field3147;
            if (~(class82.field1809[arg3][arg2][arg0] & 8) != -1) {
                return 0;
            } else {
                return ~arg3 < -1 && ~(class82.field1809[1][arg2][arg0] & 2) != -1 ? arg3 + -1 : arg3;
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "(B)I")
    public final int method1054(byte arg0) {
        ++field3142;
        if (this.field3156) {
            return 100;
        } else if (super.field758 != null) {
            return 99;
        } else {
            if (arg0 >= -75) {
                field3162 = null;
            }
            int var2 = class2.method5(255, 32, this.field3155);
            if (var2 >= 100) {
                var2 = 99;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IZZ[BI)V")
    public final void method1055(int arg0, boolean arg1, boolean arg2, byte[] arg3, int arg4) {
        ++field3133;
        if (arg1) {
            if (this.field3156) {
                throw new RuntimeException();
            }
            if (this.field3149 != null) {
                class141.method1097((byte) 120, this.field3155, arg3, this.field3149);
            }
            this.method248(arg3, 0);
            this.method1060(true);
        } else {
            arg3[arg3.length + -2] = (byte) (super.field759[arg0] >> 8);
            arg3[arg3.length + -1] = (byte) super.field759[arg0];
            if (this.field3143 != null) {
                class141.method1097((byte) 120, arg0, arg3, this.field3143);
                this.field3145[arg0] = true;
            }
            if (arg2) {
                super.field758[arg0] = class6.method55(false, arg3, 3);
            }
        }
        if (arg4 != -2) {
            field3151 = null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IZ)V")
    public final void method255(int arg0, boolean arg1) {
        if (this.field3143 != null && this.field3145 != null && this.field3145[arg0]) {
            class45.method291(this.field3143, arg0, -1001, this);
        } else {
            class92.method679(this.field3155, super.field728[arg0], (byte) 2, arg0, this, -1772316688, true);
        }
        if (!arg1) {
            field3141 = null;
        }
        ++field3148;
    }

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "(II)I")
    private final int method1056(int arg0, int arg1) {
        ++field3131;
        if (super.field758[arg0] != null) {
            return 100;
        } else if (arg1 < 12) {
            return 9;
        } else {
            return this.field3145[arg0] ? 100 : class2.method5(this.field3155, 32, arg0);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lha;I[BZI)V")
    public final void method1057(class50 arg0, int arg1, byte[] arg2, boolean arg3, int arg4) {
        ++field3154;
        if (this.field3149 != arg0) {
            if (!arg3 && ~this.field3144 == ~arg1) {
                this.field3156 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field3145[arg1] = false;
                if (this.field3136 || arg3) {
                    class92.method679(this.field3155, super.field728[arg1], (byte) 2, arg1, this, -1772316688, arg3);
                }
                return;
            }
            class115.field2593.reset();
            class115.field2593.update(arg2, 0, arg2.length + -2);
            int var6 = (int) class115.field2593.getValue();
            int var7 = ((arg2[arg2.length + -2] & 255) << 8) - -(arg2[arg2.length + -1] & 255);
            if (~super.field728[arg1] != ~var6 || super.field759[arg1] != var7) {
                this.field3145[arg1] = false;
                if (this.field3136 || arg3) {
                    class92.method679(this.field3155, super.field728[arg1], (byte) 2, arg1, this, -1772316688, arg3);
                }
                return;
            }
            this.field3145[arg1] = true;
            if (arg3) {
                super.field758[arg1] = class6.method55(false, arg2, 3);
            }
        } else {
            if (this.field3156) {
                throw new RuntimeException();
            }
            if (arg2 == null) {
                class92.method679(255, this.field3139, (byte) 0, this.field3155, this, -1772316688, true);
                return;
            }
            class115.field2593.reset();
            class115.field2593.update(arg2, 0, arg2.length);
            int var8 = (int) class115.field2593.getValue();
            class91 var9 = new class91(class126.method972(arg4 ^ 149, arg2));
            int var10 = var9.method649(false);
            if (var10 != 5 && ~var10 != -7) {
                throw new RuntimeException("Incorrect JS5 protocol number: " + var10);
            }
            int var11 = 0;
            if (~var10 <= -7) {
                var11 = var9.method631(arg4 + -308);
            }
            if (this.field3139 != var8 || ~this.field3150 != ~var11) {
                class92.method679(255, this.field3139, (byte) 0, this.field3155, this, -1772316688, true);
                return;
            }
            this.method248(arg2, 0);
            this.method1060(true);
        }
        if (arg4 != 255) {
            field3157 = null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "(I)V")
    public static void method1058(int arg0) {
        field3161 = null;
        field3153 = null;
        field3159 = null;
        if (arg0 != 32502) {
            field3158 = -112;
        }
        field3162 = null;
        field3157 = null;
        field3141 = null;
        field3151 = null;
    }

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "(B)Lqb;")
    public static final class113 method1059(byte arg0) {
        ++field3137;
        class113 var1 = new class113();
        var1.field2573 = class14.field246;
        var1.field2570 = class69.field1409[0];
        var1.field2575 = class128.field2804[0];
        var1.field2572 = class4.field65[0];
        if (arg0 <= 75) {
            method1058(-11);
        }
        var1.field2574 = client.field397;
        var1.field2576 = class4.field61[0];
        byte[] var2 = class152.field3489[0];
        int var3 = var1.field2572 * var1.field2570;
        var1.field2571 = new int[var3];
        for (int var4 = 0; var3 > var4; ++var4) {
            var1.field2571[var4] = class85.field1888[class34.method213(255, var2[var4])];
        }
        class151.method1154(0);
        return var1;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)V")
    private final void method1060(boolean arg0) {
        ++field3132;
        this.field3145 = new boolean[super.field758.length];
        for (int var2 = 0; ~this.field3145.length < ~var2; ++var2) {
            this.field3145[var2] = false;
        }
        if (this.field3143 == null) {
            this.field3156 = true;
        } else {
            if (!arg0) {
                this.field3150 = -62;
            }
            this.field3144 = -1;
            for (int var3 = 0; ~var3 > ~this.field3145.length; ++var3) {
                if (super.field750[var3] > 0) {
                    class27.method180(this.field3143, var3, (byte) 86, this);
                    this.field3144 = var3;
                }
            }
            if (this.field3144 == -1) {
                this.field3156 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "(I)I")
    public final int method1061(int arg0) {
        ++field3134;
        int var2 = 0;
        int var3 = 66 % ((20 - arg0) / 61);
        int var4 = 0;
        for (int var5 = 0; var5 < super.field758.length; ++var5) {
            if (super.field750[var5] > 0) {
                var4 += 100;
                var2 += this.method1056(var5, 74);
            }
        }
        if (~var4 == -1) {
            return 100;
        } else {
            return var2 * 100 / var4;
        }
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(II)V")
    public final void method257(int arg0, int arg1) {
        ++field3146;
        if (arg0 <= -98) {
            class15.method109(this.field3155, 9, arg1);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IILge;III)V")
    public static final void method1062(int arg0, int arg1, class47 arg2, int arg3, int arg4, int arg5) {
        ++field3140;
        class75 var6 = new class75();
        var6.field1612 = arg1 * 128;
        var6.field1611 = arg2.field928;
        var6.field1624 = arg2.field935 * 128;
        var6.field1622 = arg2.field916;
        var6.field1621 = arg2.field888;
        var6.field1609 = arg2.field927;
        var6.field1602 = arg0;
        var6.field1601 = arg3 * 128;
        int var7 = arg2.field875;
        int var8 = arg2.field931;
        if (~arg5 == -2 || ~arg5 == -4) {
            var8 = arg2.field875;
            var7 = arg2.field931;
        }
        var6.field1606 = (arg1 + var7) * 128;
        var6.field1598 = (arg3 - -var8) * 128;
        if (arg2.field919 != null) {
            var6.field1610 = arg2;
            var6.method539(-115);
        }
        class60.field1209.method19((byte) 121, var6);
        if (var6.field1611 != null) {
            var6.field1618 = (int) (Math.random() * (double) (-var6.field1609 + var6.field1622)) + var6.field1609;
        }
        if (arg4 != -18698) {
            field3158 = 54;
        }
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Lha;Lha;IZZZ)V")
    public class140(class50 arg0, class50 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field3143 = arg0;
        this.field3149 = arg1;
        this.field3136 = arg5;
        this.field3155 = arg2;
        class2.method11((byte) 56, this.field3155, this);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lkc;B)I")
    public static final int method1063(class72 arg0, byte arg1) {
        ++field3135;
        class84 var2 = (class84) class128.field2819.method1119(28254, ((long) arg0.field1508 << 32) + (long) arg0.field1540);
        if (arg1 >= -38) {
            field3159 = null;
        }
        return var2 != null ? var2.field1870 : arg0.field1466;
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(IIZ)V")
    public final void method1064(int arg0, int arg1, boolean arg2) {
        this.field3150 = arg1;
        ++field3138;
        this.field3139 = arg0;
        if (this.field3149 != null) {
            class45.method291(this.field3149, this.field3155, -1001, this);
        } else {
            class92.method679(255, this.field3139, (byte) 0, this.field3155, this, -1772316688, true);
        }
        if (arg2) {
            this.field3136 = false;
        }
    }
}
