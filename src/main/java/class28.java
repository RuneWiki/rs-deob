import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class28 extends class319 {

    @OriginalMember(owner = "client!nf", name = "Fb", descriptor = "Lhi;")
    public static class45 field406 = new class45(65, 4);

    @OriginalMember(owner = "client!nf", name = "Qb", descriptor = "I")
    public static int field417 = 0;

    @OriginalMember(owner = "client!nf", name = "zb", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "client!nf", name = "Ab", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!nf", name = "Bb", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!nf", name = "Cb", descriptor = "I")
    public static int field403;

    @OriginalMember(owner = "client!nf", name = "Db", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!nf", name = "Gb", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "client!nf", name = "Hb", descriptor = "I")
    public static int field408;

    @OriginalMember(owner = "client!nf", name = "Ib", descriptor = "I")
    public static int field409;

    @OriginalMember(owner = "client!nf", name = "Jb", descriptor = "I")
    public static int field410;

    @OriginalMember(owner = "client!nf", name = "Kb", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "client!nf", name = "Mb", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "client!nf", name = "Nb", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!nf", name = "Ob", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!nf", name = "Pb", descriptor = "I")
    private int field416;

    @OriginalMember(owner = "client!nf", name = "Eb", descriptor = "Lvu;")
    public static class155 field405;

    @OriginalMember(owner = "client!nf", name = "Lb", descriptor = "Lqr;")
    private class506 field412;

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "(B)I")
    public final int method185(byte arg0) {
        ++field402;
        if (arg0 >= -71) {
            this.method194(-33, 39);
        }
        int var2 = super.field4336[super.field4360++] - this.field412.method3001(-106) & 255;
        return var2 < 128 ? var2 : (255 & super.field4336[super.field4360++] + -this.field412.method3001(-110)) + (var2 - 128 << 8);
    }

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "(Z)V")
    public static void method186(boolean arg0) {
        field406 = null;
        field405 = null;
        if (!arg0) {
            field406 = null;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(BC)Z")
    public static final boolean method187(byte arg0, char arg1) {
        ++field415;
        if (arg0 != -36) {
            field406 = null;
        }
        if (arg1 >= ' ' && arg1 <= '~') {
            return true;
        } else if (~arg1 <= -161 && arg1 <= 255) {
            return true;
        } else {
            return arg1 == 8364 || arg1 == 338 || ~arg1 == -8213 || ~arg1 == -340 || arg1 == 376;
        }
    }

    @OriginalMember(owner = "client!nf", name = "C", descriptor = "(I)Lrg;")
    public static final class465 method188(int arg0) {
        if (arg0 != 255) {
            field405 = null;
        }
        ++field403;
        return class472.field6807;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(BI[BI)V")
    public final void method189(byte arg0, int arg1, byte[] arg2, int arg3) {
        if (arg0 == -104) {
            for (int var5 = 0; var5 < arg1; ++var5) {
                arg2[arg3 + var5] = (byte) (super.field4336[super.field4360++] + -this.field412.method3001(-116));
            }
            ++field400;
        }
    }

    @OriginalMember(owner = "client!nf", name = "o", descriptor = "(II)V")
    public final void method190(int arg0, int arg1) {
        if (arg1 != -19465) {
            method192((byte) -108);
        }
        super.field4336[super.field4360++] = (byte) (this.field412.method3001(class373.method2233(arg1, 19552)) + arg0);
        ++field408;
    }

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "(B)V")
    public final void method191(byte arg0) {
        ++field413;
        this.field416 = super.field4360 * 8;
        if (arg0 != 36) {
            method186(true);
        }
    }

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "(B)V")
    public static final void method192(byte arg0) {
        int var1 = 106 / ((arg0 - 65) / 61);
        if (class178.field2666 > 0) {
            int var2 = 0;
            for (int var3 = 0; class379.field5448.length > var3; ++var3) {
                if (class379.field5448[var3].startsWith("--> ")) {
                    ++var2;
                    if (~class178.field2666 == ~var2) {
                        class441.field6349 = class379.field5448[var3].substring(4);
                        break;
                    }
                }
            }
        } else {
            class441.field6349 = "";
        }
        ++field410;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "([IB)V")
    public final void method193(int[] arg0, byte arg1) {
        int var3 = -8 / ((arg1 - -29) / 32);
        this.field412 = new class506(arg0);
        ++field409;
    }

    @OriginalMember(owner = "client!nf", name = "p", descriptor = "(II)I")
    public final int method194(int arg0, int arg1) {
        ++field407;
        int var3 = this.field416 >> 3;
        if (arg1 != -15886) {
            return 102;
        } else {
            int var4 = 8 - (this.field416 & 7);
            int var5 = 0;
            this.field416 += arg0;
            while (~arg0 < ~var4) {
                var5 += (super.field4336[var3++] & class475.field6873[var4]) << -var4 + arg0;
                arg0 -= var4;
                var4 = 8;
            }
            int var6;
            if (~arg0 != ~var4) {
                var6 = (super.field4336[var3] >> var4 - arg0 & class475.field6873[arg0]) + var5;
            } else {
                var6 = (super.field4336[var3] & class475.field6873[var4]) + var5;
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(III)I")
    public static final int method195(int arg0, int arg1, int arg2) {
        ++field401;
        int var3 = arg1 * 57 + arg2;
        if (arg0 != -31334) {
            return 101;
        } else {
            int var4 = var3 << 13 ^ var3;
            int var5 = (var4 * var4 * 15731 - -789221) * var4 + 1376312589 & Integer.MAX_VALUE;
            return var5 >> 19 & 255;
        }
    }

    @OriginalMember(owner = "client!nf", name = "D", descriptor = "(I)V")
    public final void method196(int arg0) {
        super.field4360 = (this.field416 + 7) / 8;
        ++field411;
        if (arg0 != 30365) {
            field405 = null;
        }
    }

    @OriginalMember(owner = "client!nf", name = "E", descriptor = "(I)Z")
    public final boolean method197(int arg0) {
        ++field414;
        int var2 = 255 & super.field4336[super.field4360] + -this.field412.method3005(arg0 ^ arg0);
        return ~var2 <= -129;
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(I)V")
    public class28(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "(BI)I")
    public final int method198(byte arg0, int arg1) {
        if (arg0 < 48) {
            field417 = -46;
        }
        ++field404;
        return arg1 * 8 + -this.field416;
    }
}
