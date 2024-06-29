import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class35 extends class105 {

    @OriginalMember(owner = "client!ef", name = "sb", descriptor = "Z")
    private volatile boolean field877 = false;

    @OriginalMember(owner = "client!ef", name = "Eb", descriptor = "Z")
    private boolean field889 = false;

    @OriginalMember(owner = "client!ef", name = "Mb", descriptor = "I")
    private int field897 = -1;

    @OriginalMember(owner = "client!ef", name = "tb", descriptor = "Lve;")
    private class144 field878;

    @OriginalMember(owner = "client!ef", name = "Db", descriptor = "Lve;")
    private class144 field888;

    @OriginalMember(owner = "client!ef", name = "Nb", descriptor = "I")
    private int field898;

    @OriginalMember(owner = "client!ef", name = "vb", descriptor = "I")
    public static int field880 = 0;

    @OriginalMember(owner = "client!ef", name = "wb", descriptor = "Loc;")
    public static class99 field881 = class48.method402((byte) -104, "Nehmen");

    @OriginalMember(owner = "client!ef", name = "Jb", descriptor = "I")
    public static int field894 = 0;

    @OriginalMember(owner = "client!ef", name = "Qb", descriptor = "Loc;")
    public static class99 field901 = null;

    @OriginalMember(owner = "client!ef", name = "xb", descriptor = "Loc;")
    private static class99 field882 = class48.method402((byte) -104, "Your friendlist is full)3 Max of 100 for free users)1 and 200 for members");

    @OriginalMember(owner = "client!ef", name = "qb", descriptor = "Loc;")
    public static class99 field875 = class48.method402((byte) -104, "Regeln versto-8en hat)3");

    @OriginalMember(owner = "client!ef", name = "pb", descriptor = "Loc;")
    public static class99 field874 = field882;

    @OriginalMember(owner = "client!ef", name = "Pb", descriptor = "Loc;")
    private static class99 field900 = class48.method402((byte) -104, "Unexpected server response");

    @OriginalMember(owner = "client!ef", name = "yb", descriptor = "Loc;")
    public static class99 field883 = class48.method402((byte) -104, "null");

    @OriginalMember(owner = "client!ef", name = "Hb", descriptor = "Loc;")
    public static class99 field892 = field900;

    @OriginalMember(owner = "client!ef", name = "Xb", descriptor = "Loc;")
    public static class99 field908 = class48.method402((byte) -104, "auf einer freien Welt zu spielen)3");

    @OriginalMember(owner = "client!ef", name = "ob", descriptor = "I")
    public static int field873;

    @OriginalMember(owner = "client!ef", name = "rb", descriptor = "I")
    public static int field876;

    @OriginalMember(owner = "client!ef", name = "ub", descriptor = "I")
    public static int field879;

    @OriginalMember(owner = "client!ef", name = "zb", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!ef", name = "Ab", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!ef", name = "Cb", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!ef", name = "Fb", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!ef", name = "Ib", descriptor = "I")
    public static int field893;

    @OriginalMember(owner = "client!ef", name = "Kb", descriptor = "I")
    private int field895;

    @OriginalMember(owner = "client!ef", name = "Lb", descriptor = "I")
    public static int field896;

    @OriginalMember(owner = "client!ef", name = "Ob", descriptor = "I")
    public static int field899;

    @OriginalMember(owner = "client!ef", name = "Rb", descriptor = "I")
    public static int field902;

    @OriginalMember(owner = "client!ef", name = "Sb", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "client!ef", name = "Tb", descriptor = "I")
    public static int field904;

    @OriginalMember(owner = "client!ef", name = "Ub", descriptor = "I")
    public static int field905;

    @OriginalMember(owner = "client!ef", name = "Vb", descriptor = "I")
    public static int field906;

    @OriginalMember(owner = "client!ef", name = "Wb", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "client!ef", name = "Bb", descriptor = "Lwe;")
    public static class150 field886;

    @OriginalMember(owner = "client!ef", name = "Gb", descriptor = "[Z")
    private volatile boolean[] field891;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "([BLve;BIZ)V")
    public final void method300(byte[] arg0, class144 arg1, byte arg2, int arg3, boolean arg4) {
        ++field907;
        if (this.field888 == arg1) {
            if (this.field877) {
                throw new RuntimeException();
            }
            if (arg0 == null) {
                class39.method320(this, 255, this.field898, this.field895, (byte) 0, true, 1499);
                return;
            }
            class107.field2623.reset();
            class107.field2623.update(arg0, 0, arg0.length);
            int var6 = (int) class107.field2623.getValue();
            if (this.field895 != var6) {
                class39.method320(this, 255, this.field898, this.field895, (byte) 0, true, 1499);
                return;
            }
            this.method885(arg0, (byte) -78);
            this.method304((byte) -38);
        } else {
            if (!arg4 && ~this.field897 == ~arg3) {
                this.field877 = true;
            }
            if (arg0 == null || ~arg0.length >= -3) {
                this.field891[arg3] = false;
                if (this.field889 || arg4) {
                    class39.method320(this, this.field898, arg3, super.field2557[arg3], (byte) 2, arg4, 1499);
                }
                return;
            }
            class107.field2623.reset();
            class107.field2623.update(arg0, 0, arg0.length + -2);
            int var7 = (int) class107.field2623.getValue();
            int var8 = ((arg0[arg0.length + -2] & 255) << 8) - -(255 & arg0[arg0.length + -1]);
            if (~super.field2557[arg3] != ~var7 || super.field2545[arg3] != var8) {
                this.field891[arg3] = false;
                if (this.field889 || arg4) {
                    class39.method320(this, this.field898, arg3, super.field2557[arg3], (byte) 2, arg4, 1499);
                }
                return;
            }
            this.field891[arg3] = true;
            if (arg4) {
                super.field2604[arg3] = class53.method439(-10723, false, arg0);
            }
        }
        if (arg2 != 0) {
            field880 = -110;
        }
    }

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "(B)V")
    public static void method301(byte arg0) {
        field874 = null;
        if (arg0 <= 110) {
            field880 = 54;
        }
        field882 = null;
        field883 = null;
        field886 = null;
        field892 = null;
        field908 = null;
        field901 = null;
        field900 = null;
        field875 = null;
        field881 = null;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IB)V")
    public final void method302(int arg0, byte arg1) {
        ++field887;
        if (this.field878 != null && this.field891 != null && this.field891[arg0]) {
            class49.method407((byte) 38, arg0, this.field878, this);
        } else {
            class39.method320(this, this.field898, arg0, super.field2557[arg0], (byte) 2, true, arg1 + 1623);
        }
        if (arg1 != -124) {
            field886 = null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(ZI)V")
    public final void method303(boolean arg0, int arg1) {
        if (arg0) {
            this.method302(-116, (byte) 47);
        }
        ++field905;
        class104.method880((byte) -68, this.field898, arg1);
    }

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "(B)V")
    private final void method304(byte arg0) {
        ++field876;
        this.field891 = new boolean[super.field2604.length];
        if (arg0 != -38) {
            this.method304((byte) 70);
        }
        for (int var2 = 0; ~this.field891.length < ~var2; ++var2) {
            this.field891[var2] = false;
        }
        if (this.field878 == null) {
            this.field877 = true;
        } else {
            this.field897 = -1;
            for (int var3 = 0; ~this.field891.length < ~var3; ++var3) {
                if (super.field2566[var3] > 0) {
                    class136.method1138((byte) -27, this, var3, this.field878);
                    this.field897 = var3;
                }
            }
            if (~this.field897 == 0) {
                this.field877 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZIZ[BI)V")
    public final void method305(boolean arg0, int arg1, boolean arg2, byte[] arg3, int arg4) {
        ++field899;
        if (arg2) {
            if (this.field877) {
                throw new RuntimeException();
            }
            if (this.field888 != null) {
                class118.method999(0, this.field888, arg3, this.field898);
            }
            this.method885(arg3, (byte) -110);
            this.method304((byte) -38);
        } else {
            arg3[arg3.length + -2] = (byte) (super.field2545[arg1] >> 8);
            arg3[arg3.length + -1] = (byte) super.field2545[arg1];
            if (this.field878 != null) {
                class118.method999(0, this.field878, arg3, arg1);
                this.field891[arg1] = true;
            }
            if (arg0) {
                super.field2604[arg1] = class53.method439(-10723, false, arg3);
            }
        }
        int var6 = 88 % ((arg4 - -45) / 50);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(BI)Z")
    public static final boolean method306(byte arg0, int arg1) {
        ++field902;
        if (class83.field2053[arg1]) {
            return true;
        } else if (!class70.field1796.method910(arg1, (byte) -18)) {
            return false;
        } else {
            int var2 = class70.field1796.method892(true, arg1);
            if (var2 == 0) {
                class83.field2053[arg1] = true;
                return true;
            } else {
                if (class132.field3230[arg1] == null) {
                    class132.field3230[arg1] = new class54[var2];
                }
                int var3 = 0;
                int var4 = 83 / ((51 - arg0) / 32);
                while (~var3 > ~var2) {
                    if (class132.field3230[arg1][var3] == null) {
                        byte[] var5 = class70.field1796.method903(arg1, (byte) -128, var3);
                        if (var5 != null) {
                            class132.field3230[arg1][var3] = new class54();
                            class132.field3230[arg1][var3].field1293 = (arg1 << 16) + var3;
                            if (~var5[0] != 0) {
                                class132.field3230[arg1][var3].method453(0, new class57(var5));
                            } else {
                                class132.field3230[arg1][var3].method447(new class57(var5), -9);
                            }
                        }
                    }
                    ++var3;
                }
                class83.field2053[arg1] = true;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "(II)Loc;")
    public static final class99 method307(int arg0, int arg1) {
        if (arg0 != 4557) {
            method307(-110, 13);
        }
        ++field893;
        return class20.method189(new class99[] { class5.method31(255 & arg1 >> 24, 10), class89.field2196, class5.method31(255 & arg1 >> 16, 10), class89.field2196, class5.method31((arg1 & 65371) >> 8, 10), class89.field2196, class5.method31(255 & arg1, arg0 + -4547) }, 104);
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(IB)I")
    private final int method308(int arg0, byte arg1) {
        ++field904;
        if (arg1 >= 0) {
            return -55;
        } else if (super.field2604[arg0] != null) {
            return 100;
        } else {
            return this.field891[arg0] ? 100 : class91.method757(this.field898, arg0, false);
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)I")
    public final int method309(int arg0) {
        ++field890;
        if (this.field877) {
            return 100;
        } else if (super.field2604 != null) {
            return 99;
        } else {
            int var2 = class91.method757(255, this.field898, false);
            if (arg0 != -15208) {
                field880 = -116;
            }
            if (var2 >= 100) {
                var2 = 99;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "(IB)Ljb;")
    public static final class63 method310(int arg0, byte arg1) {
        ++field879;
        class63 var2 = (class63) class73.field1850.method997(-1, (long) arg0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class111.field2756.method903(arg0, (byte) -128, 0);
            if (var3 == null) {
                return null;
            } else {
                class63 var4 = new class63();
                class57 var5 = new class57(var3);
                int var6 = 0;
                var5.field1477 = var5.field1469.length + -12;
                int var7 = var5.method495(16711680);
                var4.field1672 = var5.method506(-1);
                if (arg1 >= -54) {
                    return null;
                } else {
                    var4.field1674 = var5.method506(-1);
                    var4.field1659 = var5.method506(-1);
                    var4.field1669 = var5.method506(-1);
                    var4.field1664 = new class99[var7];
                    var4.field1656 = new int[var7];
                    var4.field1670 = new int[var7];
                    var5.field1477 = 0;
                    while (var5.field1469.length - 12 > var5.field1477) {
                        int var8 = var5.method506(-1);
                        if (var8 != 3) {
                            if (~var8 > -101 && var8 != 21 && ~var8 != -39 && var8 != 39) {
                                var4.field1656[var6] = var5.method495(16711680);
                            } else {
                                var4.field1656[var6] = var5.method510(-110);
                            }
                        } else {
                            var4.field1664[var6] = var5.method518(261);
                        }
                        var4.field1670[var6++] = var8;
                    }
                    class73.field1850.method993((byte) 100, (long) arg0, var4);
                    return var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "(II)V")
    public final void method311(int arg0, int arg1) {
        ++field873;
        if (arg0 != 255) {
            this.field895 = 107;
        }
        this.field895 = arg1;
        if (this.field888 == null) {
            class39.method320(this, 255, this.field898, this.field895, (byte) 0, true, 1499);
        } else {
            class49.method407((byte) 123, this.field898, this.field888, this);
        }
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lve;Lve;IZZZ)V")
    public class35(class144 arg0, class144 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field878 = arg0;
        this.field889 = arg5;
        this.field888 = arg1;
        this.field898 = arg2;
        class110.method943(this.field898, this, 0);
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(I)I")
    public final int method312(int arg0) {
        ++field906;
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < super.field2604.length; ++var4) {
            if (super.field2566[var4] > 0) {
                var3 += this.method308(var4, (byte) -8);
                var2 += 100;
            }
        }
        if (~var2 == -1) {
            return 100;
        } else {
            if (arg0 != -12624) {
                field901 = null;
            }
            return var3 * 100 / var2;
        }
    }
}
