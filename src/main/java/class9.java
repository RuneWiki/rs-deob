import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class9 extends class122 {

    @OriginalMember(owner = "client!bb", name = "fb", descriptor = "Z")
    private boolean field151 = false;

    @OriginalMember(owner = "client!bb", name = "pb", descriptor = "Z")
    public volatile boolean field161 = false;

    @OriginalMember(owner = "client!bb", name = "hb", descriptor = "I")
    private int field153 = 0;

    @OriginalMember(owner = "client!bb", name = "eb", descriptor = "I")
    private int field150 = 0;

    @OriginalMember(owner = "client!bb", name = "gb", descriptor = "Lkc;")
    public class63 field152;

    @OriginalMember(owner = "client!bb", name = "qb", descriptor = "Lia;")
    private class49 field162;

    @OriginalMember(owner = "client!bb", name = "lb", descriptor = "I")
    public int field157;

    @OriginalMember(owner = "client!bb", name = "rb", descriptor = "Lec;")
    public static class28 field163 = class28.method210(-46, " @cya@");

    @OriginalMember(owner = "client!bb", name = "kb", descriptor = "Lpa;")
    public static class91 field156 = new class91(50);

    @OriginalMember(owner = "client!bb", name = "wb", descriptor = "Lec;")
    public static class28 field168 = class28.method210(-46, "flash2:");

    @OriginalMember(owner = "client!bb", name = "vb", descriptor = "Lec;")
    public static class28 field167 = class28.method210(-46, " (Xskill)2");

    @OriginalMember(owner = "client!bb", name = "xb", descriptor = "I")
    public static int field169 = -1;

    @OriginalMember(owner = "client!bb", name = "zb", descriptor = "Lec;")
    public static class28 field171 = class28.method210(-46, "Accept trade @whi@");

    @OriginalMember(owner = "client!bb", name = "Ab", descriptor = "Lec;")
    public static class28 field172 = class28.method210(-46, "titlebox");

    @OriginalMember(owner = "client!bb", name = "Db", descriptor = "I")
    public static int field175 = 0;

    @OriginalMember(owner = "client!bb", name = "ib", descriptor = "I")
    public static int field154;

    @OriginalMember(owner = "client!bb", name = "jb", descriptor = "I")
    public static int field155;

    @OriginalMember(owner = "client!bb", name = "mb", descriptor = "I")
    public static int field158;

    @OriginalMember(owner = "client!bb", name = "nb", descriptor = "I")
    public static int field159;

    @OriginalMember(owner = "client!bb", name = "ob", descriptor = "I")
    public static int field160;

    @OriginalMember(owner = "client!bb", name = "sb", descriptor = "I")
    public static int field164;

    @OriginalMember(owner = "client!bb", name = "tb", descriptor = "I")
    public static int field165;

    @OriginalMember(owner = "client!bb", name = "ub", descriptor = "I")
    public static int field166;

    @OriginalMember(owner = "client!bb", name = "yb", descriptor = "I")
    public static int field170;

    @OriginalMember(owner = "client!bb", name = "Cb", descriptor = "I")
    public static int field174;

    @OriginalMember(owner = "client!bb", name = "Bb", descriptor = "[Z")
    public volatile boolean[] field173;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I[B)V")
    public static final void method46(int arg0, byte[] arg1) {
        ++field159;
        if (arg0 <= 38) {
            method50(-42);
        }
        class119 var2 = new class119(arg1);
        var2.field2554 = arg1.length + -2;
        class66.field1509 = var2.method903(2);
        class118.field2514 = new int[class66.field1509];
        class123.field2682 = new byte[class66.field1509][];
        class62.field1382 = new int[class66.field1509];
        class61.field1365 = new int[class66.field1509];
        class25.field552 = new int[class66.field1509];
        var2.field2554 = arg1.length - (7 - -(class66.field1509 * 8));
        class106.field2250 = var2.method903(2);
        class72.field1613 = var2.method903(2);
        int var3 = (var2.method879((byte) 45) & 255) - -1;
        for (int var4 = 0; ~class66.field1509 < ~var4; ++var4) {
            class61.field1365[var4] = var2.method903(2);
        }
        for (int var5 = 0; ~class66.field1509 < ~var5; ++var5) {
            class25.field552[var5] = var2.method903(2);
        }
        for (int var6 = 0; class66.field1509 > var6; ++var6) {
            class118.field2514[var6] = var2.method903(2);
        }
        for (int var7 = 0; var7 < class66.field1509; ++var7) {
            class62.field1382[var7] = var2.method903(2);
        }
        var2.field2554 = -(class66.field1509 * 8) + -7 + -((var3 + -1) * 3) + arg1.length;
        class53.field1219 = new int[var3];
        for (int var8 = 1; var8 < var3; ++var8) {
            class53.field1219[var8] = var2.method869(-91);
            if (class53.field1219[var8] == 0) {
                class53.field1219[var8] = 1;
            }
        }
        var2.field2554 = 0;
        for (int var9 = 0; ~class66.field1509 < ~var9; ++var9) {
            int var10 = class118.field2514[var9];
            int var11 = class62.field1382[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class123.field2682[var9] = var13;
            int var14 = var2.method879((byte) 45);
            if (var14 == 0) {
                for (int var15 = 0; ~var15 > ~var12; ++var15) {
                    var13[var15] = var2.method904(-31558);
                }
            } else if (~var14 == -2) {
                for (int var16 = 0; var16 < var10; ++var16) {
                    for (int var17 = 0; var17 < var11; ++var17) {
                        var13[var16 - -(var10 * var17)] = var2.method904(-31558);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "(I)I")
    public final int method47(int arg0) {
        int var2 = 0;
        ++field164;
        int var3 = 0;
        for (int var4 = 0; super.field2634.length > var4; ++var4) {
            if (~super.field2646[var4] < -1) {
                var2 += 100;
                var3 += this.method51(var4, (byte) 124);
            }
        }
        int var5 = var3 * 100 / var2;
        if (arg0 != -8981) {
            this.field150 = 126;
        }
        if (var5 >= this.field153) {
            this.field153 = var5;
        } else {
            var5 = this.field153;
        }
        return var5;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(BI)V")
    public final void method48(byte arg0, int arg1) {
        ++field160;
        if (arg0 > 123) {
            if (this.field152 != null && this.field173 != null && this.field173[arg1]) {
                class69.method544(-123, arg1, true, this);
            } else {
                this.field162.method396(true, arg1 - -1, 127, this);
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "([BIZI)V")
    public final void method49(byte[] arg0, int arg1, boolean arg2, int arg3) {
        ++field174;
        int var5 = 31 / ((arg3 - -49) / 51);
        if (arg1 == 0) {
            this.method940(arg0, -124);
            if (this.field152 != null) {
                class4.method22(this, (byte) -80);
            } else {
                this.field173 = new boolean[super.field2634.length];
                for (int var6 = 0; ~var6 > ~this.field173.length; ++var6) {
                    this.field173[var6] = false;
                }
                this.field161 = true;
            }
        } else {
            if (this.field152 != null) {
                class66.method532(arg0, this, false, arg1 + -1);
                this.field173[arg1 - 1] = true;
            }
            if (arg2 || this.field151) {
                super.field2634[arg1 + -1] = arg0;
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "(I)V")
    public static void method50(int arg0) {
        if (arg0 != -21694) {
            field171 = null;
        }
        field163 = null;
        field156 = null;
        field171 = null;
        field167 = null;
        field168 = null;
        field172 = null;
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(IB)I")
    private final int method51(int arg0, byte arg1) {
        ++field155;
        if (arg1 != 124) {
            return -66;
        } else if (super.field2634[arg0] != null) {
            return 100;
        } else {
            return this.field173[arg0] ? 100 : this.field162.method393(arg0, this, (byte) 47);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZI)V")
    public final void method52(boolean arg0, int arg1) {
        if (arg1 == -17758) {
            ++field166;
            if (this.field152 != null || arg0) {
                this.field151 = arg0;
                for (int var3 = 0; ~super.field2634.length < ~var3; ++var3) {
                    if (super.field2646[var3] > 0) {
                        if (this.field173[var3]) {
                            if (arg0) {
                                class69.method544(-110, var3, false, this);
                            }
                        } else {
                            this.field162.method396(false, var3 + 1, arg1 ^ -17699, this);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lia;Lkc;IZZ)V")
    public class9(class49 arg0, class63 arg1, int arg2, boolean arg3, boolean arg4) {
        super(arg3, arg4);
        this.field152 = arg1;
        this.field162 = arg0;
        this.field157 = arg2;
        this.field162.method396(true, 0, 127, this);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Z)I")
    public final int method53(boolean arg0) {
        ++field165;
        if (this.field161) {
            return 100;
        } else if (!arg0) {
            return -104;
        } else {
            int var2 = this.field162.method393(-1, this, (byte) 47);
            if (~var2 <= ~this.field150) {
                this.field150 = var2;
            } else {
                var2 = this.field150;
            }
            if (~var2 <= -101) {
                var2 = 99;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "(I)V")
    public static final void method54(int arg0) {
        ++field154;
        if (class114.field2435 >= 2 || class76.field1691 != 0 || class95.field2097 != 0) {
            class28 var1;
            if (~class76.field1691 == -2 && ~class114.field2435 > -3) {
                var1 = class68.method537(1, new class28[] { class43.field918, class1.field6, class25.field532 });
            } else if (class95.field2097 == 1 && class114.field2435 < 2) {
                var1 = class68.method537(1, new class28[] { class37.field843, class55.field1264 });
            } else {
                var1 = class78.field1813[class114.field2435 + -1];
            }
            if (~class114.field2435 < -3) {
                var1 = class68.method537(1, new class28[] { var1, class122.field2658, class5.method25(6366, class114.field2435 + -2), class36.field795 });
            }
            if (arg0 != 15) {
                method46(115, (byte[]) null);
            }
            class126.field2737.method448(var1, 4, 15, 16777215, true, class83.field1888 / 1000);
        }
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(II)V")
    public final void method55(int arg0, int arg1) {
        this.field162.method402(false, this, arg1 + 1);
        if (arg0 != 100) {
            field170 = 30;
        }
        ++field158;
    }
}
