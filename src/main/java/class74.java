import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class74 extends class64 {

    @OriginalMember(owner = "client!ib", name = "V", descriptor = "I")
    private int field1679 = 0;

    @OriginalMember(owner = "client!ib", name = "Q", descriptor = "I")
    private int field1674 = 409;

    @OriginalMember(owner = "client!ib", name = "eb", descriptor = "I")
    private int field1688 = 1024;

    @OriginalMember(owner = "client!ib", name = "gb", descriptor = "I")
    private int field1690 = 4;

    @OriginalMember(owner = "client!ib", name = "pb", descriptor = "I")
    private int field1699 = 204;

    @OriginalMember(owner = "client!ib", name = "ob", descriptor = "I")
    private int field1698 = 81;

    @OriginalMember(owner = "client!ib", name = "cb", descriptor = "I")
    private int field1686 = 1024;

    @OriginalMember(owner = "client!ib", name = "R", descriptor = "I")
    private int field1675 = 8;

    @OriginalMember(owner = "client!ib", name = "W", descriptor = "[I")
    public static int[] field1680 = new int[200];

    @OriginalMember(owner = "client!ib", name = "kb", descriptor = "I")
    public static int field1694 = 0;

    @OriginalMember(owner = "client!ib", name = "tb", descriptor = "Lcd;")
    private static class23 field1703 = class54.method414("Loading interfaces )2 ", -1);

    @OriginalMember(owner = "client!ib", name = "lb", descriptor = "Lcd;")
    public static class23 field1695 = field1703;

    @OriginalMember(owner = "client!ib", name = "jb", descriptor = "Lcd;")
    private static class23 field1693 = class54.method414("Select", -1);

    @OriginalMember(owner = "client!ib", name = "mb", descriptor = "Lcd;")
    private static class23 field1696 = class54.method414("Location", -1);

    @OriginalMember(owner = "client!ib", name = "S", descriptor = "Lcd;")
    public static class23 field1676 = field1693;

    @OriginalMember(owner = "client!ib", name = "vb", descriptor = "Lcd;")
    public static class23 field1705 = field1696;

    @OriginalMember(owner = "client!ib", name = "P", descriptor = "I")
    public static int field1673;

    @OriginalMember(owner = "client!ib", name = "T", descriptor = "I")
    public static int field1677;

    @OriginalMember(owner = "client!ib", name = "X", descriptor = "I")
    private int field1681;

    @OriginalMember(owner = "client!ib", name = "Y", descriptor = "I")
    public static int field1682;

    @OriginalMember(owner = "client!ib", name = "Z", descriptor = "I")
    public static int field1683;

    @OriginalMember(owner = "client!ib", name = "ab", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!ib", name = "bb", descriptor = "I")
    public static int field1685;

    @OriginalMember(owner = "client!ib", name = "db", descriptor = "I")
    public static int field1687;

    @OriginalMember(owner = "client!ib", name = "fb", descriptor = "I")
    public static int field1689;

    @OriginalMember(owner = "client!ib", name = "hb", descriptor = "I")
    private int field1691;

    @OriginalMember(owner = "client!ib", name = "ib", descriptor = "I")
    public static int field1692;

    @OriginalMember(owner = "client!ib", name = "nb", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!ib", name = "sb", descriptor = "I")
    private int field1702;

    @OriginalMember(owner = "client!ib", name = "ub", descriptor = "I")
    public static int field1704;

    @OriginalMember(owner = "client!ib", name = "wb", descriptor = "I")
    public static int field1706;

    @OriginalMember(owner = "client!ib", name = "xb", descriptor = "[I")
    private int[] field1707;

    @OriginalMember(owner = "client!ib", name = "U", descriptor = "[Lea;")
    public static class38[] field1678;

    @OriginalMember(owner = "client!ib", name = "qb", descriptor = "[[I")
    private int[][] field1700;

    @OriginalMember(owner = "client!ib", name = "rb", descriptor = "[[I")
    private int[][] field1701;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IZLjava/lang/Object;)[B")
    public static final byte[] method524(int arg0, boolean arg1, Object arg2) {
        ++field1677;
        if (arg2 == null) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var3 = (byte[]) arg2;
            return arg1 ? class145.method919(-116, var3) : var3;
        } else if (arg2 instanceof class70) {
            class70 var4 = (class70) arg2;
            return var4.method509(-16);
        } else if (arg0 >= -90) {
            return null;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(BI)V")
    public static final void method525(byte arg0, int arg1) {
        ++field1697;
        if (class82.method556(arg1, (byte) -7)) {
            if (arg0 >= -110) {
                field1693 = null;
            }
            class8.method49(-1, false, class100.field2114[arg1]);
        }
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "()V")
    public class74() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "(I)V")
    private final void method526(int arg0) {
        ++field1684;
        Random var2 = new Random((long) this.field1675);
        this.field1702 = 4096 / this.field1675;
        this.field1691 = 4096 / this.field1690;
        this.field1707 = new int[this.field1675 + 1];
        this.field1681 = this.field1698 / 2;
        this.field1700 = new int[this.field1675][this.field1690];
        int var3 = this.field1691 / 2;
        this.field1707[0] = 0;
        this.field1701 = new int[this.field1675][this.field1690 + 1];
        int var4 = this.field1702 / 2;
        if (arg0 != -4) {
            this.method37((byte) 17, -4, (class189) null);
        }
        for (int var5 = 0; ~this.field1675 < ~var5; ++var5) {
            if (var5 > 0) {
                int var6 = this.field1702;
                int var7 = (-2048 + class155.method952(var2, 4096, -18)) * this.field1699 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field1707[var5] = this.field1707[var5 + -1] + var8;
            }
            this.field1701[var5][0] = 0;
            for (int var9 = 0; ~this.field1690 < ~var9; ++var9) {
                if (~var9 < -1) {
                    int var10 = this.field1691;
                    int var11 = (-2048 + class155.method952(var2, 4096, arg0 + 115)) * this.field1674 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field1701[var5][var9] = this.field1701[var5][var9 + -1] + var12;
                }
                this.field1700[var5][var9] = -class155.method952(var2, this.field1686, -48) + 4096;
            }
            this.field1701[var5][this.field1690] = 4096;
        }
        this.field1707[this.field1675] = 4096;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIII)V")
    public static final void method527(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class155.field3108[0].method836(arg4, arg0);
        ++field1687;
        class155.field3108[1].method836(arg4, arg2 + -16 + arg0);
        int var6 = (arg2 + -32) * arg2 / arg5;
        if (~var6 > -9) {
            var6 = 8;
        }
        int var7 = (-var6 + arg2 + -32) * arg1 / (-arg2 + arg5);
        class196.method1281(arg4, arg0 + 16, 16, arg2 + -32, class4.field55);
        class196.method1281(arg4, arg0 + 16 - -var7, 16, var6, class95.field2003);
        class196.method1283(arg4, arg0 + 16 + var7, var6, class135.field2796);
        class196.method1283(arg4 + 1, arg0 + 16 + var7, var6, class135.field2796);
        class196.method1284(arg4, var7 + 16 + arg0, 16, class135.field2796);
        class196.method1284(arg4, arg0 - (-17 - var7), 16, class135.field2796);
        class196.method1283(arg4 + 15, arg0 + 16 + var7, var6, class64.field1526);
        class196.method1283(arg4 + 14, arg0 + 17 + var7, var6 + -1, class64.field1526);
        class196.method1284(arg4, arg0 - (-15 - var6) + var7, 16, class64.field1526);
        class196.method1284(arg4 - -1, arg0 + 14 - (-var6 + -var7), 15, class64.field1526);
        if (arg3 >= -74) {
            method525((byte) 1, -81);
        }
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(III)V")
    public static final void method528(int arg0, int arg1, int arg2) {
        ++field1682;
        if (class49.field1171 >= 2 || class47.field1013 != 0 || class73.field1660) {
            class23 var3;
            if (class47.field1013 == 1 && class49.field1171 < 2) {
                var3 = class3.method14(true, new class23[] { class170.field3390, class183.field3608, class183.field3609, class109.field2318 });
            } else if (class73.field1660 && ~class49.field1171 > -3) {
                var3 = class3.method14(true, new class23[] { class124.field2550, class183.field3608, class136.field2819, class109.field2318 });
            } else {
                var3 = class9.method52(class49.field1171 + -1, (byte) 127);
            }
            if (arg0 != 8) {
                method527(-10, -19, 99, 27, -66, 125);
            }
            if (~class49.field1171 < -3) {
                var3 = class3.method14(true, new class23[] { var3, class42.field900, class184.method1132(-1, class49.field1171 + -2), class109.field2323 });
            }
            int var4 = class189.field3714.method269(var3, arg2 - -4, arg1 + 15, 16777215, 0, class200.field3949, field1673);
            class109.method709((byte) -30, arg2 - -4, arg1, var4 + class189.field3714.method273(var3), 15);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(BILva;)V")
    public final void method37(byte arg0, int arg1, class189 arg2) {
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (~arg1 != -7) {
                                    if (arg1 == 7) {
                                        this.field1686 = arg2.method1197(-1);
                                    }
                                } else {
                                    this.field1698 = arg2.method1197(-1);
                                }
                            } else {
                                this.field1679 = arg2.method1197(-1);
                            }
                        } else {
                            this.field1688 = arg2.method1197(-1);
                        }
                    } else {
                        this.field1699 = arg2.method1197(-1);
                    }
                } else {
                    this.field1674 = arg2.method1197(-1);
                }
            } else {
                this.field1675 = arg2.method1202(126);
            }
        } else {
            this.field1690 = arg2.method1202(-40);
        }
        int var5 = 101 / ((7 - arg0) / 43);
        ++field1685;
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(Z)V")
    public static final void method529(boolean arg0) {
        ++field1689;
        class3.method12(class17.field361, false);
        ++class132.field2725;
        if (!arg0) {
            field1673 = 68;
        }
        if (class146.field2975 && class160.field3218) {
            int var1 = class78.field1724;
            int var2 = var1 - class161.field3239;
            if (var2 < class153.field3050) {
                var2 = class153.field3050;
            }
            if (class17.field361.field1125 + var2 > class153.field3050 + class191.field3798.field1125) {
                var2 = class153.field3050 - -class191.field3798.field1125 - class17.field361.field1125;
            }
            int var3 = class64.field1518;
            int var4 = var3 - class44.field929;
            int var5 = -class204.field4023 + var2;
            if (~class96.field2030 < ~var4) {
                var4 = class96.field2030;
            }
            int var6 = class17.field361.field1087;
            int var7 = class191.field3798.field1100 + var2 + -class153.field3050;
            if (var4 - -class17.field361.field1123 > class96.field2030 + class191.field3798.field1123) {
                var4 = class96.field2030 + class191.field3798.field1123 - class17.field361.field1123;
            }
            int var8 = -class96.field2030 + var4 + class191.field3798.field1065;
            int var9 = -class73.field1665 + var4;
            if (class17.field361.field1113 < class132.field2725 && (var6 < var5 || ~(-var6) < ~var5 || ~var6 > ~var9 || -var6 > var9)) {
                class157.field3141 = true;
            }
            if (class17.field361.field1008 != null && class157.field3141) {
                class144 var10 = new class144();
                var10.field2952 = var7;
                var10.field2939 = class17.field361;
                var10.field2942 = class17.field361.field1008;
                var10.field2949 = var8;
                class50.method391(-1142686098, var10);
            }
            if (~class105.field2277 == -1) {
                if (class157.field3141) {
                    if (class17.field361.field1041 != null) {
                        class144 var11 = new class144();
                        var11.field2948 = class63.field1481;
                        var11.field2949 = var8;
                        var11.field2952 = var7;
                        var11.field2939 = class17.field361;
                        var11.field2942 = class17.field361.field1041;
                        class50.method391(-1142686098, var11);
                    }
                    if (class63.field1481 != null && class72.method511(class17.field361, (byte) -106) != null) {
                        class159.field3190.method631(64, -1);
                        class159.field3190.method1221(true, class17.field361.field1070);
                        class159.field3190.method1194(class63.field1481.field1071, (byte) -83);
                        ++class42.field897;
                        class159.field3190.method1215((byte) -96, class63.field1481.field1070);
                        class159.field3190.method1226(class17.field361.field1071, -10881704);
                    }
                } else if ((class146.field2988 == 1 || class157.method966((byte) 52, class49.field1171 + -1)) && class49.field1171 > 2) {
                    class8.method45(!arg0);
                } else if (~class49.field1171 < -1) {
                    class41.method334(67, class49.field1171 + -1);
                }
                class17.field361 = null;
            }
        } else {
            if (~class132.field2725 < -2) {
                class17.field361 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(Z)V")
    public static void method530(boolean arg0) {
        field1676 = null;
        field1678 = null;
        field1695 = null;
        field1705 = null;
        field1696 = null;
        if (arg0) {
            field1703 = null;
            field1693 = null;
            field1680 = null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IILbb;)V")
    public static final void method531(int arg0, int arg1, class12 arg2) {
        ++field1706;
        int var3 = -105 % (-arg0 / 63);
        class131.method839(-3846, arg1, arg2.field215, arg2.field277);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        ++field1704;
        if (arg1 != -9421) {
            this.field1675 = -25;
        }
        int[] var3 = super.field1513.method1033(-82, arg0);
        if (super.field1513.field3368) {
            int var4;
            for (var4 = class95.field1995[arg0] + this.field1679; var4 < 0; var4 += 4096) {
            }
            int var5 = 0;
            while (~var4 < -4097) {
                var4 -= 4096;
            }
            while (var5 < this.field1675 && this.field1707[var5] <= var4) {
                ++var5;
            }
            float var6 = (float) this.field1707[var5];
            float var7 = (float) this.field1707[var5 + -1];
            if ((float) var4 > (float) this.field1681 + var7 && (float) var4 < (float) (-this.field1681) + var6) {
                for (int var8 = 0; ~class168.field3367 < ~var8; ++var8) {
                    int var9 = 0;
                    int var10 = var5 % 2 != 0 ? -this.field1688 : this.field1688;
                    int var11;
                    for (var11 = (this.field1691 * var10 >> 12) + class174.field3475[var8]; ~var11 > -1; var11 += 4096) {
                    }
                    while (~var11 < -4097) {
                        var11 -= 4096;
                    }
                    while (this.field1690 > var9 && ~this.field1701[var5 + -1][var9] >= ~var11) {
                        ++var9;
                    }
                    float var12 = (float) this.field1701[var5 + -1][var9];
                    float var13 = (float) this.field1701[var5 + -1][var9 + -1];
                    if ((float) this.field1681 + var13 < (float) var11 && var12 - (float) this.field1681 > (float) var11) {
                        var3[var8] = this.field1700[var5 + -1][var9 + -1];
                    } else {
                        var3[var8] = 0;
                    }
                }
            } else {
                class93.method608(var3, 0, class168.field3367, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(B)V")
    public final void method44(byte arg0) {
        ++field1692;
        if (arg0 != -22) {
            method530(false);
        }
        this.method526(-4);
    }
}
