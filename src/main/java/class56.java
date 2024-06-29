import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class class56 extends class328 {

    @OriginalMember(owner = "client!rq", name = "D", descriptor = "I")
    private int field794 = -1;

    @OriginalMember(owner = "client!rq", name = "N", descriptor = "I")
    public static int field803 = 0;

    @OriginalMember(owner = "client!rq", name = "K", descriptor = "Z")
    public static boolean field800 = false;

    @OriginalMember(owner = "client!rq", name = "B", descriptor = "Lfea;")
    public static class47 field792 = new class47();

    @OriginalMember(owner = "client!rq", name = "R", descriptor = "I")
    public static int field807 = 0;

    @OriginalMember(owner = "client!rq", name = "C", descriptor = "I")
    public static int field793;

    @OriginalMember(owner = "client!rq", name = "E", descriptor = "I")
    public static int field795;

    @OriginalMember(owner = "client!rq", name = "F", descriptor = "I")
    private int field796;

    @OriginalMember(owner = "client!rq", name = "H", descriptor = "I")
    private int field797;

    @OriginalMember(owner = "client!rq", name = "I", descriptor = "I")
    public static int field798;

    @OriginalMember(owner = "client!rq", name = "J", descriptor = "I")
    public static int field799;

    @OriginalMember(owner = "client!rq", name = "L", descriptor = "I")
    public static int field801;

    @OriginalMember(owner = "client!rq", name = "M", descriptor = "I")
    public static int field802;

    @OriginalMember(owner = "client!rq", name = "O", descriptor = "I")
    public static int field804;

    @OriginalMember(owner = "client!rq", name = "Q", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!rq", name = "P", descriptor = "[I")
    private int[] field805;

    @OriginalMember(owner = "client!rq", name = "<init>", descriptor = "()V")
    public class56() {
        super(0, false);
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(BI)I")
    public static final int method455(byte arg0, int arg1) {
        if (arg0 != 28) {
            method460(11);
        }
        ++field801;
        return 127 & arg1;
    }

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "(I)V")
    public final void method456(int arg0) {
        ++field804;
        if (arg0 == 7) {
            super.method456(arg0);
            this.field805 = null;
        }
    }

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "(BI)I")
    public static final int method457(byte arg0, int arg1) {
        ++field795;
        if (arg0 != 89) {
            method455((byte) -66, -71);
        }
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "(I)I")
    public final int method458(int arg0) {
        ++field799;
        if (arg0 != 20025) {
            this.field805 = null;
        }
        return this.field794;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(BILco;)V")
    public final void method1(byte arg0, int arg1, class268 arg2) {
        if (~arg1 == -1) {
            this.field794 = arg2.method1745(32132);
        }
        ++field806;
        if (arg0 < 75) {
            method455((byte) -58, 105);
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(IZC)C")
    public static final char method459(int arg0, boolean arg1, char arg2) {
        ++field802;
        if (~arg2 <= -193 && arg2 <= 255) {
            if (arg2 >= 192 && arg2 <= 198) {
                return 'A';
            }
            if (~arg2 == -200) {
                return 'C';
            }
            if (arg2 >= 200 && arg2 <= 203) {
                return 'E';
            }
            if (~arg2 <= -205 && arg2 <= 207) {
                return 'I';
            }
            if (~arg2 == -210 && arg0 != 0) {
                return 'N';
            }
            if (~arg2 <= -211 && arg2 <= 214) {
                return 'O';
            }
            if (~arg2 <= -218 && ~arg2 >= -221) {
                return 'U';
            }
            if (arg2 == 221) {
                return 'Y';
            }
            if (arg2 == 223) {
                return 's';
            }
            if (arg2 >= 224 && arg2 <= 230) {
                return 'a';
            }
            if (arg2 == 231) {
                return 'c';
            }
            if (arg2 >= 232 && arg2 <= 235) {
                return 'e';
            }
            if (~arg2 <= -237 && ~arg2 >= -240) {
                return 'i';
            }
            if (arg2 == 241 && ~arg0 != -1) {
                return 'n';
            }
            if (~arg2 <= -243 && arg2 <= 246) {
                return 'o';
            }
            if (~arg2 <= -250 && arg2 <= 252) {
                return 'u';
            }
            if (~arg2 == -254 || ~arg2 == -256) {
                return 'y';
            }
        }
        if (~arg2 == -339) {
            return 'O';
        } else if (arg2 == 339) {
            return 'o';
        } else if (arg2 == 376) {
            return 'Y';
        } else {
            if (!arg1) {
                field800 = false;
            }
            return arg2;
        }
    }

    @OriginalMember(owner = "client!rq", name = "f", descriptor = "(I)V")
    public static void method460(int arg0) {
        if (arg0 != -193) {
            method457((byte) 122, -40);
        }
        field792 = null;
    }

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "(III)V")
    public final void method461(int arg0, int arg1, int arg2) {
        int var4 = 50 % ((arg2 - 35) / 35);
        super.method461(arg0, arg1, -77);
        ++field798;
        if (this.field794 >= 0 && class108.field1801 != null) {
            int var5 = !class108.field1801.method2387((byte) 127, this.field794).field8205 ? 128 : 64;
            this.field805 = class108.field1801.method2388(var5, var5, false, this.field794, 1.0F, (byte) -64);
            this.field797 = var5;
            this.field796 = var5;
        }
    }

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "(II)[[I")
    public final int[][] method7(int arg0, int arg1) {
        ++field793;
        int[][] var3 = super.field4725.method1886((byte) 46, arg0);
        int var4 = -121 % ((46 - arg1) / 54);
        if (super.field4725.field4371) {
            int var5 = (~class527.field7334 == ~this.field796 ? arg0 : this.field796 * arg0 / class527.field7334) * this.field797;
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            if (~class449.field6539 != ~this.field797) {
                for (int var9 = 0; var9 < class449.field6539; ++var9) {
                    int var10 = this.field797 * var9 / class449.field6539;
                    int var11 = this.field805[var5 + var10];
                    var8[var9] = class424.method2540(4080, var11 << 4);
                    var7[var9] = class424.method2540(var11 >> 4, 4080);
                    var6[var9] = class424.method2540(var11 >> 12, 4080);
                }
            } else {
                for (int var12 = 0; var12 < class449.field6539; ++var12) {
                    int var13 = this.field805[var5++];
                    var8[var12] = class424.method2540(255, var13) << 4;
                    var7[var12] = class424.method2540(var13 >> 4, 4080);
                    var6[var12] = class424.method2540(16711680, var13) >> 12;
                }
            }
        }
        return var3;
    }
}
