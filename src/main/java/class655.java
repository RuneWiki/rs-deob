import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class655 extends class539 {

    @OriginalMember(owner = "client!sn", name = "N", descriptor = "I")
    private int field8818 = 0;

    @OriginalMember(owner = "client!sn", name = "db", descriptor = "I")
    private int field8834 = 0;

    @OriginalMember(owner = "client!sn", name = "R", descriptor = "I")
    private int field8822 = 0;

    @OriginalMember(owner = "client!sn", name = "kb", descriptor = "Z")
    public boolean field8841 = false;

    @OriginalMember(owner = "client!sn", name = "lb", descriptor = "Z")
    private boolean field8842 = true;

    @OriginalMember(owner = "client!sn", name = "X", descriptor = "I")
    private int field8828 = -1;

    @OriginalMember(owner = "client!sn", name = "Z", descriptor = "I")
    private int field8830 = 0;

    @OriginalMember(owner = "client!sn", name = "rb", descriptor = "I")
    private int field8848 = 0;

    @OriginalMember(owner = "client!sn", name = "tb", descriptor = "I")
    private int field8850;

    @OriginalMember(owner = "client!sn", name = "Q", descriptor = "I")
    public int field8821;

    @OriginalMember(owner = "client!sn", name = "S", descriptor = "Lmu;")
    private class317 field8823;

    @OriginalMember(owner = "client!sn", name = "ib", descriptor = "Lqw;")
    public static class84 field8839 = new class84();

    @OriginalMember(owner = "client!sn", name = "ob", descriptor = "Z")
    public static boolean field8845 = false;

    @OriginalMember(owner = "client!sn", name = "O", descriptor = "I")
    public static int field8819;

    @OriginalMember(owner = "client!sn", name = "P", descriptor = "I")
    public static int field8820;

    @OriginalMember(owner = "client!sn", name = "T", descriptor = "I")
    public static int field8824;

    @OriginalMember(owner = "client!sn", name = "U", descriptor = "I")
    public static int field8825;

    @OriginalMember(owner = "client!sn", name = "V", descriptor = "I")
    public static int field8826;

    @OriginalMember(owner = "client!sn", name = "W", descriptor = "I")
    public static int field8827;

    @OriginalMember(owner = "client!sn", name = "Y", descriptor = "I")
    public static int field8829;

    @OriginalMember(owner = "client!sn", name = "ab", descriptor = "I")
    public static int field8831;

    @OriginalMember(owner = "client!sn", name = "cb", descriptor = "I")
    public static int field8833;

    @OriginalMember(owner = "client!sn", name = "eb", descriptor = "I")
    public static int field8835;

    @OriginalMember(owner = "client!sn", name = "fb", descriptor = "I")
    public static int field8836;

    @OriginalMember(owner = "client!sn", name = "gb", descriptor = "I")
    public static int field8837;

    @OriginalMember(owner = "client!sn", name = "hb", descriptor = "I")
    public static int field8838;

    @OriginalMember(owner = "client!sn", name = "jb", descriptor = "I")
    public static int field8840;

    @OriginalMember(owner = "client!sn", name = "mb", descriptor = "I")
    public static int field8843;

    @OriginalMember(owner = "client!sn", name = "nb", descriptor = "I")
    public static int field8844;

    @OriginalMember(owner = "client!sn", name = "pb", descriptor = "I")
    public static int field8846;

    @OriginalMember(owner = "client!sn", name = "qb", descriptor = "I")
    public static int field8847;

    @OriginalMember(owner = "client!sn", name = "bb", descriptor = "Lls;")
    private class150 field8832;

    @OriginalMember(owner = "client!sn", name = "ub", descriptor = "Ld;")
    public static class161 field8851;

    @OriginalMember(owner = "client!sn", name = "sb", descriptor = "[I")
    public static int[] field8849;

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "(Lha;B)Lpia;", line = 3)
    public final class104 method114(class66 arg0, byte arg1) {
        ++field8837;
        class497 var3 = this.method3643(2048 | (~this.field8822 == -1 ? 0 : 5), arg1, arg0, this.field8850);
        if (var3 == null) {
            return null;
        } else {
            if (this.field8822 != 0) {
                var3.method256(this.field8822 * 2048);
            }
            class109 var4 = arg0.method475();
            var4.method814(super.field2802, super.field2815, super.field2810);
            this.method3641(-1, var3, var4, arg0);
            class104 var5 = class568.method3241(1, (byte) -99, false);
            if (!class408.field5786) {
                var3.method254(var4, var5.field1479[0], 0);
            } else {
                var3.method258(var4, var5.field1479[0], class72.field972, 0);
            }
            if (this.field8832 != null) {
                class586 var6 = this.field8832.method1057();
                if (!class408.field5786) {
                    arg0.method534(var6);
                } else {
                    arg0.method524(var6, class72.field972);
                }
            }
            this.field8842 = var3.method272();
            this.field8848 = var3.method265();
            this.field8830 = var3.method264();
            return var5;
        }
    }

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "(B)Z", line = 47)
    public final boolean method126(byte arg0) {
        ++field8829;
        if (arg0 != -34) {
            this.finalize();
        }
        return false;
    }

    @OriginalMember(owner = "client!sn", name = "g", descriptor = "(I)Z", line = 60)
    public final boolean method769(int arg0) {
        ++field8844;
        return arg0 >= -70;
    }

    @OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(IIIIIIIIIIIII)V", line = 71)
    public class655(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
        this.field8850 = arg0;
        this.field8821 = arg1 + arg2;
        this.field8822 = arg12;
        class573 var14 = class641.field8643.method918(this.field8850, 64);
        int var15 = var14.field7819;
        if (~var15 != 0) {
            this.field8823 = class693.field9223.method2388(var15, 0);
            this.field8841 = false;
        } else {
            this.field8841 = true;
        }
        if (~this.field8821 == ~arg2) {
            class627.method3466(this, this.field8823, -29701, this.field8818);
        }
    }

    @OriginalMember(owner = "client!sn", name = "h", descriptor = "(I)V", line = 97)
    public final void method127(int arg0) {
        if (arg0 != -13127) {
            field8845 = true;
        }
        ++field8838;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(III)Z", line = 108)
    public static final boolean method3640(int arg0, int arg1, int arg2) {
        ++field8847;
        if (!class247.method1533(arg2, arg0 ^ 8330, arg1)) {
            return false;
        } else if (~(36864 & arg1) != -1 | class7.method38(arg1, -118, arg2) | class719.method3971(arg2, arg1, (byte) -33)) {
            return true;
        } else {
            if (arg0 != -21797) {
                method3640(13, -69, 16);
            }
            return (55 & arg2) == 0 & (~(8192 & arg1) != -1 | class143.method995(arg2, arg1, -1) | class124.method891(arg1, 13546, arg2));
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(ILha;II)Z", line = 129)
    public final boolean method122(int arg0, class66 arg1, int arg2, int arg3) {
        ++field8846;
        if (arg2 != 6238) {
            this.method127(-53);
        }
        return false;
    }

    @OriginalMember(owner = "client!sn", name = "i", descriptor = "(I)Z", line = 140)
    public final boolean method777(int arg0) {
        int var2 = 32 / ((arg0 - -34) / 59);
        ++field8820;
        return this.field8842;
    }

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "(Z)I", line = 150)
    public final int method767(boolean arg0) {
        if (arg0) {
            this.method129(93, (class214) null, (byte) -67, 4, 71, (class66) null, false);
        }
        ++field8825;
        return this.field8830;
    }

    @OriginalMember(owner = "client!sn", name = "e", descriptor = "(Lha;B)V", line = 162)
    public final void method131(class66 arg0, byte arg1) {
        ++field8824;
        class497 var3 = this.method3643(0, (byte) 127, arg0, this.field8850);
        if (var3 != null) {
            class109 var4 = arg0.method475();
            var4.method814(super.field2802, super.field2815, super.field2810);
            this.method3641(-1, var3, var4, arg0);
        }
        if (arg1 != 53) {
            this.method126((byte) 93);
        }
    }

    @OriginalMember(owner = "client!sn", name = "finalize", descriptor = "()V", line = 197)
    protected final void finalize() {
        if (this.field8832 != null) {
            this.field8832.method1051();
        }
        ++field8835;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(ILka;Lal;Lha;)V", line = 217)
    private final void method3641(int arg0, class497 arg1, class109 arg2, class66 arg3) {
        arg1.method259(arg2);
        ++field8826;
        class290[] var5 = arg1.method263();
        class220[] var6 = arg1.method283();
        if ((this.field8832 == null || this.field8832.field2035) && (var5 != null || var6 != null)) {
            this.field8832 = class150.method1052(class572.field7788, true);
        }
        if (this.field8832 != null) {
            this.field8832.method1045(arg3, (long) class572.field7788, var5, var6, false);
            this.field8832.method1058(super.field2813, super.field7466, super.field7455, super.field7467, super.field7453);
        }
        if (arg0 != -1) {
            field8839 = null;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(B)V", line = 242)
    public final void method3642(byte arg0) {
        ++field8836;
        if (arg0 != -9) {
            this.method3644(-57, 30);
        }
        if (this.field8832 != null) {
            this.field8832.method1051();
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(ILfq;BIILha;Z)V", line = 261)
    public final void method129(int arg0, class214 arg1, byte arg2, int arg3, int arg4, class66 arg5, boolean arg6) {
        ++field8827;
        if (arg2 != -103) {
            this.field8821 = -114;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IBLha;I)Lka;", line = 283)
    private final class497 method3643(int arg0, byte arg1, class66 arg2, int arg3) {
        ++field8831;
        class573 var5 = class641.field8643.method918(arg3, 64);
        if (arg1 <= 104) {
            return null;
        } else {
            class295 var6 = class648.field8748[super.field2813];
            class295 var7 = ~super.field2809 <= -4 ? null : class648.field8748[super.field2809 + 1];
            return this.field8841 ? var5.method3258(arg2, super.field2815, -19124, class693.field9223, super.field2802, arg0, 0, super.field2810, true, -1, var6, var7, -1) : var5.method3258(arg2, super.field2815, -19124, class693.field9223, super.field2802, arg0, this.field8834, super.field2810, true, this.field8818, var6, var7, this.field8828);
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(II)V", line = 312)
    public final void method3644(int arg0, int arg1) {
        if (arg1 != -1) {
            this.method129(39, (class214) null, (byte) -59, -28, -51, (class66) null, true);
        }
        ++field8819;
        if (!this.field8841) {
            this.field8834 += arg0;
            while (this.field8823.field4485[this.field8818] < this.field8834) {
                this.field8834 -= this.field8823.field4485[this.field8818];
                ++this.field8818;
                if (this.field8818 >= this.field8823.field4493.length) {
                    this.field8841 = true;
                    break;
                }
            }
            if (!this.field8841) {
                class627.method3466(this, this.field8823, -29701, this.field8818);
            }
        }
    }

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "(Lha;B)Lln;", line = 348)
    public final class398 method119(class66 arg0, byte arg1) {
        ++field8843;
        if (arg1 > -35) {
            this.field8821 = 111;
        }
        return null;
    }

    @OriginalMember(owner = "client!sn", name = "e", descriptor = "(B)V", line = 363)
    public static void method3645(byte arg0) {
        field8839 = null;
        field8851 = null;
        field8849 = null;
        if (arg0 != -23) {
            method3640(-24, -48, -103);
        }
    }

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "(B)I", line = 375)
    public final int method774(byte arg0) {
        if (arg0 != 115) {
            field8845 = true;
        }
        ++field8833;
        return this.field8848;
    }
}
