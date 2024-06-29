import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class22 extends class163 {

    @OriginalMember(owner = "client!ub", name = "Tb", descriptor = "[Ljava/lang/String;")
    private static final String[] field270 = new String[] { method161(method160("5\u0012n\u0014\nh")), method161(method160("5\u0012n\u0015\nh")), method161(method160("5\u0012n\u001e\nh")), method161(method160("`L#=%}\u0016&4/p@~")), method161(method160("`L#=%}@p4/x@~")), method161(method160("`L#=%}\u0016&4/&\u0016~")), method161(method160("iLo1&,N")), method161(method160("`X")), method161(method160("5\u0012n\u0010\nh")), method161(method160("|_#=%~")), method161(method160("5\u0012n\u0017\nh")), method161(method160("5\u0012n\u001a\nh")), method161(method160(";^n|4")), method161(method160(".\u0005,>")), method161(method160("5\u0012n\u0016\nh")), method161(method160("5\u0012n\u0019\nh")), method161(method160("5\u0012n\u0011\nh")), method161(method160("5\u0012n\u001b\nh")), method161(method160("5\u0012n\u0018\nh")) };

    @OriginalMember(owner = "client!ub", name = "Qb", descriptor = "Z")
    public static boolean field257 = false;

    @OriginalMember(owner = "client!ub", name = "Hb", descriptor = "I")
    public static int field267 = 0;

    @OriginalMember(owner = "client!ub", name = "Mb", descriptor = "I")
    private int field255;

    @OriginalMember(owner = "client!ub", name = "Nb", descriptor = "I")
    public static int field256;

    @OriginalMember(owner = "client!ub", name = "Rb", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!ub", name = "Gb", descriptor = "I")
    public static int field259;

    @OriginalMember(owner = "client!ub", name = "Jb", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!ub", name = "Kb", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "client!ub", name = "Eb", descriptor = "I")
    public static int field263;

    @OriginalMember(owner = "client!ub", name = "Ib", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!ub", name = "Pb", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "client!ub", name = "Sb", descriptor = "I")
    public static int field266;

    @OriginalMember(owner = "client!ub", name = "Ob", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!ub", name = "Fb", descriptor = "I")
    public static int field269;

    @OriginalMember(owner = "client!ub", name = "Lb", descriptor = "Lsa;")
    private class216 field261;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "(ZI)Ljava/lang/String;", line = 3)
    public static final String method149(boolean arg0, int arg1) {
        try {
            ++field258;
            String var2 = Integer.toString(arg1);
            if (arg0) {
                method149(false, 66);
            }
            for (int var3 = -3 + var2.length(); var3 > 0; var3 -= 3) {
                var2 = var2.substring(0, var3) + "," + var2.substring(var3);
            }
            if (~var2.length() < -10) {
                return field270[4] + var2.substring(0, -8 + var2.length()) + class309.field4880.method2616(arg0, class167.field2300) + field270[7] + var2 + field270[6];
            } else {
                return ~var2.length() < -7 ? field270[5] + var2.substring(0, -4 + var2.length()) + class309.field4882.method2616(false, class167.field2300) + field270[7] + var2 + field270[6] : field270[3] + var2 + field270[9];
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field270[8] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ub", name = "y", descriptor = "(I)Z", line = 32)
    public final boolean method150(int arg0) {
        try {
            ++field268;
            int var2 = arg0 & super.field2209[super.field2201] + -this.field261.method1884(1178);
            return ~var2 <= -129;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field270[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ub", name = "n", descriptor = "(B)I", line = 51)
    public final int method151(byte arg0) {
        try {
            ++field263;
            if (arg0 != 77) {
                this.field255 = 98;
            }
            int var2 = 255 & super.field2209[super.field2201++] + -this.field261.method1886(-97);
            return ~var2 > -129 ? var2 : (255 & super.field2209[super.field2201++] + -this.field261.method1886(-128)) + (var2 - 128 << 8);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field270[16] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(I)V", line = 68)
    public class22(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "([II)V", line = 71)
    public final void method152(int[] arg0, int arg1) {
        try {
            ++field264;
            if (arg1 == 15378) {
                this.field261 = new class216(arg0);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field270[11] + (arg0 != null ? field270[12] : field270[13]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "(II)V", line = 82)
    public final void method153(int arg0, int arg1) {
        try {
            ++field265;
            super.field2209[super.field2201++] = (byte) (this.field261.method1886(-108) + arg1);
            if (arg0 != -2) {
                this.field255 = -110;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field270[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ub", name = "x", descriptor = "(I)V", line = 96)
    public final void method154(int arg0) {
        try {
            super.field2201 = (this.field255 - -7) / 8;
            if (arg0 != 3) {
                this.method156(107, -37);
            }
            ++field269;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field270[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ub", name = "w", descriptor = "(I)V", line = 121)
    public final void method155(int arg0) {
        try {
            this.field255 = super.field2201 * 8;
            if (arg0 == 655076648) {
                ++field256;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field270[18] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ub", name = "l", descriptor = "(II)I", line = 133)
    public final int method156(int arg0, int arg1) {
        try {
            ++field266;
            int var3 = this.field255 >> 3;
            int var4 = 8 - (this.field255 & 7);
            this.field255 += arg1;
            int var5 = 0;
            while (var4 < arg1) {
                var5 += (class541.field8086[var4] & super.field2209[var3++]) << -var4 + arg1;
                arg1 -= var4;
                var4 = 8;
            }
            int var6;
            if (~arg1 == ~var4) {
                var6 = (class541.field8086[var4] & super.field2209[var3]) + var5;
            } else {
                var6 = (super.field2209[var3] >> -arg1 + var4 & class541.field8086[arg1]) + var5;
            }
            return arg0 != -10160 ? 121 : var6;
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field270[10] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(BLsa;)V", line = 164)
    public final void method157(byte arg0, class216 arg1) {
        try {
            this.field261 = arg1;
            if (arg0 > 101) {
                ++field259;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field270[14] + arg0 + ',' + (arg1 != null ? field270[12] : field270[13]) + ')');
        }
    }

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "(BI)I", line = 175)
    public final int method158(byte arg0, int arg1) {
        try {
            ++field260;
            int var3 = 107 / ((arg0 - 16) / 43);
            return arg1 * 8 + -this.field255;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field270[17] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(II[BI)V", line = 194)
    public final void method159(int arg0, int arg1, byte[] arg2, int arg3) {
        try {
            for (int var5 = 0; ~var5 > ~arg0; ++var5) {
                arg2[arg1 + var5] = (byte) (super.field2209[super.field2201++] + -this.field261.method1886(-76));
            }
            if (arg3 == 29235) {
                ++field262;
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field270[15] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field270[12] : field270[13]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ub", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method160(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 73);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ub", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method161(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 64;
                    break;
                case 1:
                    var10005 = 112;
                    break;
                case 2:
                    var10005 = 64;
                    break;
                case 3:
                    var10005 = 82;
                    break;
                default:
                    var10005 = 73;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
