import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public class class303 extends class578 {

    @OriginalMember(owner = "client!vv", name = "t", descriptor = "I")
    private int field3843 = 0;

    @OriginalMember(owner = "client!vv", name = "C", descriptor = "Lpv;")
    private class66 field3852 = new class66();

    @OriginalMember(owner = "client!vv", name = "y", descriptor = "I")
    public static int field3848 = 0;

    @OriginalMember(owner = "client!vv", name = "n", descriptor = "I")
    public static int field3837;

    @OriginalMember(owner = "client!vv", name = "o", descriptor = "I")
    public static int field3838;

    @OriginalMember(owner = "client!vv", name = "p", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!vv", name = "q", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!vv", name = "r", descriptor = "I")
    public static int field3841;

    @OriginalMember(owner = "client!vv", name = "s", descriptor = "I")
    public static int field3842;

    @OriginalMember(owner = "client!vv", name = "u", descriptor = "I")
    public static int field3844;

    @OriginalMember(owner = "client!vv", name = "v", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!vv", name = "w", descriptor = "I")
    public static int field3846;

    @OriginalMember(owner = "client!vv", name = "x", descriptor = "I")
    public static int field3847;

    @OriginalMember(owner = "client!vv", name = "z", descriptor = "I")
    public static int field3849;

    @OriginalMember(owner = "client!vv", name = "A", descriptor = "I")
    public static int field3850;

    @OriginalMember(owner = "client!vv", name = "B", descriptor = "I")
    public static int field3851;

    @OriginalMember(owner = "client!vv", name = "D", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(Lqs;B)V", line = 7)
    public final void method1797(class565 arg0, byte arg1) {
        if (arg1 != 97) {
            this.method1804(-88, -111);
        }
        ++field3844;
        --super.field7762;
        if (~super.field7762 > -1) {
            super.field7762 = 4999;
        }
        super.field7759[super.field7762] = 21;
        super.field7761[super.field7762] = arg0;
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(III)Lmf;", line = 26)
    public static final class387 method1798(int arg0, int arg1, int arg2) {
        class565 var3 = class407.field5237[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class387 var4 = var3.field7078;
            var3.field7078 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(Z)Lek;", line = 37)
    public static final class474 method1799(boolean arg0) {
        if (arg0) {
            field3847 = 45;
        }
        ++field3850;
        return class604.field8107;
    }

    @OriginalMember(owner = "client!vv", name = "e", descriptor = "(I)V", line = 49)
    public static final void method1800(int arg0) {
        ++field3841;
        if (class470.field5804 == 3) {
            class78.method609(10503, 4);
        } else if (class470.field5804 == 7) {
            class78.method609(10503, 8);
        } else if (~class470.field5804 == -11) {
            class78.method609(10503, 11);
        }
        if (arg0 != -28818) {
            field3838 = 114;
        }
    }

    @OriginalMember(owner = "client!vv", name = "b", descriptor = "(I)V", line = 72)
    public final void method1801(int arg0) {
        if (arg0 != 0) {
            method1800(32);
        }
        ++field3849;
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(Lqs;I)V", line = 90)
    public final void method1802(class565 arg0, int arg1) {
        ++field3851;
        super.field7759[super.field7757] = 20;
        if (arg1 == 0) {
            super.field7761[super.field7757] = arg0;
            ++super.field7757;
            if (super.field7757 >= 5000) {
                super.field7757 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(BZILd;)V", line = 111)
    public final void method1803(byte arg0, boolean arg1, int arg2, class140 arg3) {
        super.field7759[super.field7757] = (byte) (!arg1 ? arg2 + 30 : arg2 + 40);
        int var5 = 52 % ((arg0 - 40) / 55);
        ++field3845;
        super.field7761[super.field7757] = arg3;
        ++super.field7757;
        if (~super.field7757 <= -5001) {
            super.field7757 = 0;
        }
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(II)V", line = 129)
    public final void method1804(int arg0, int arg1) {
        ++field3846;
        int var3 = -101 / ((-55 - arg1) / 34);
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(B)V", line = 138)
    private final void method1805(byte arg0) {
        ++field3840;
        if (arg0 == -23) {
            int var2 = super.field7762++;
            if (super.field7762 >= 5000) {
                super.field7762 = 0;
            }
            this.field3843 = super.field7759[var2];
            Object var3 = super.field7761[var2];
            super.field7761[var2] = null;
            if (this.field3843 != 21) {
                if (this.field3843 == 20) {
                    class565 var4 = (class565) var3;
                    if (var4.field7079 != null) {
                        var4.field7079.method7(class687.field9409, (byte) 98);
                    }
                    if (var4.field7087 != null) {
                        var4.field7087.method7(class687.field9409, (byte) 98);
                    }
                    if (var4.field7082 != null) {
                        var4.field7082.method7(class687.field9409, (byte) 98);
                    }
                    if (var4.field7073 != null) {
                        var4.field7073.method7(class687.field9409, (byte) 98);
                    }
                    if (var4.field7085 != null) {
                        var4.field7085.method7(class687.field9409, (byte) 98);
                    }
                    for (class436 var5 = var4.field7074; var5 != null; var5 = var5.field5485) {
                        var5.field5486.method7(class687.field9409, (byte) 98);
                    }
                    return;
                }
                if (this.field3843 >= 30 && ~this.field3843 >= -34) {
                    ((class140) var3).method195(class662.field8971, class513.field6440, class664.field9021, class82.field1060, ~(this.field3843 + -30) == -1);
                    return;
                }
                if (~this.field3843 <= -41 && this.field3843 <= 43) {
                    ((class140) var3).method195(class662.field8971, class513.field6440, class664.field9021, class42.field597, this.field3843 + -40 == 0);
                    return;
                }
                if (this.field3843 == 22) {
                    class687.field9409.method484(-1, 1583160, 40, 127);
                    return;
                }
                if (this.field3843 == 23) {
                    class687.field9409.method409();
                    return;
                }
                if (this.field3843 == 24) {
                    class687.field9409.method473(0, (class227[]) null);
                    return;
                }
            } else {
                class73.method586(this.field3852, (class565) var3);
            }
        }
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(IZ)V", line = 235)
    public final void method1806(int arg0, boolean arg1) {
        super.field7759[super.field7757] = (byte) arg0;
        ++field3839;
        ++super.field7757;
        if (!arg1) {
            this.method1808(-115);
        }
        if (~super.field7757 <= -5001) {
            super.field7757 = 0;
        }
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(ILqs;)V", line = 254)
    public final void method1807(int arg0, class565 arg1) {
        ++field3842;
        super.field7759[super.field7757] = 21;
        super.field7761[super.field7757] = arg1;
        ++super.field7757;
        if (super.field7757 >= 5000) {
            super.field7757 = 0;
        }
        if (arg0 != -18542) {
            this.method1804(-82, 28);
        }
    }

    @OriginalMember(owner = "client!vv", name = "c", descriptor = "(I)V", line = 271)
    public final void method1808(int arg0) {
        while (~super.field7762 != ~super.field7757) {
            this.method1805((byte) -23);
        }
        if (arg0 != 3) {
            field3848 = -50;
        }
        ++field3853;
    }
}
