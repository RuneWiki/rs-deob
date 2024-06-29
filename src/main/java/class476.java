import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eea")
public class class476 extends class711 {

    @OriginalMember(owner = "client!eea", name = "Sb", descriptor = "[Ljava/lang/String;")
    private static final String[] field7026 = new String[] { method3689(method3688("v62X};")), method3689(method3688("v62Xz;")), method3689(method3688("h}}XE")), method3689(method3688("v62Xp;")), method3689(method3688("}&?\u001a")), method3689(method3688("v62Xq;")), method3689(method3688("v62X~;")), method3689(method3688("v62X{;")), method3689(method3688("v62Xs;")), method3689(method3688("v62X\u007f;")), method3689(method3688("v62X|;")), method3689(method3688("v62Xy;")), method3689(method3688("v62Xr;")) };

    @OriginalMember(owner = "client!eea", name = "Eb", descriptor = "Lni;")
    public static class795 field7019 = new class795();

    @OriginalMember(owner = "client!eea", name = "Kb", descriptor = "Lmv;")
    public static class125 field7024 = new class125(90, 3);

    @OriginalMember(owner = "client!eea", name = "Mb", descriptor = "I")
    public static int field7011;

    @OriginalMember(owner = "client!eea", name = "Ob", descriptor = "I")
    public static int field7013;

    @OriginalMember(owner = "client!eea", name = "Gb", descriptor = "I")
    public static int field7014;

    @OriginalMember(owner = "client!eea", name = "Hb", descriptor = "I")
    public static int field7015;

    @OriginalMember(owner = "client!eea", name = "Qb", descriptor = "I")
    public static int field7016;

    @OriginalMember(owner = "client!eea", name = "Nb", descriptor = "I")
    public static int field7017;

    @OriginalMember(owner = "client!eea", name = "Db", descriptor = "I")
    public static int field7018;

    @OriginalMember(owner = "client!eea", name = "Jb", descriptor = "I")
    public static int field7020;

    @OriginalMember(owner = "client!eea", name = "Pb", descriptor = "I")
    private int field7021;

    @OriginalMember(owner = "client!eea", name = "Fb", descriptor = "I")
    public static int field7022;

    @OriginalMember(owner = "client!eea", name = "Rb", descriptor = "I")
    public static int field7023;

    @OriginalMember(owner = "client!eea", name = "Ib", descriptor = "Lmh;")
    public static class320 field7025;

    @OriginalMember(owner = "client!eea", name = "Lb", descriptor = "Loja;")
    private class646 field7012;

    @OriginalMember(owner = "client!eea", name = "o", descriptor = "(II)I", line = 3)
    public final int method3677(int arg0, int arg1) {
        try {
            ++field7022;
            int var3 = this.field7021 >> 3;
            if (arg0 > -36) {
                return -73;
            } else {
                int var4 = -(this.field7021 & 7) + 8;
                int var5 = 0;
                this.field7021 += arg1;
                while (var4 < arg1) {
                    var5 += (super.field9996[var3++] & class610.field8739[var4]) << -var4 + arg1;
                    arg1 -= var4;
                    var4 = 8;
                }
                int var6;
                if (arg1 != var4) {
                    var6 = (super.field9996[var3] >> -arg1 + var4 & class610.field8739[arg1]) + var5;
                } else {
                    var6 = (super.field9996[var3] & class610.field8739[var4]) + var5;
                }
                return var6;
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field7026[9] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!eea", name = "u", descriptor = "(I)V", line = 35)
    public final void method3678(int arg0) {
        try {
            ++field7016;
            if (arg0 == -1) {
                this.field7021 = super.field9945 * 8;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field7026[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eea", name = "<init>", descriptor = "(I)V", line = 47)
    public class476(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!eea", name = "p", descriptor = "(B)V", line = 53)
    public static void method3679(byte arg0) {
        try {
            field7025 = null;
            field7024 = null;
            if (arg0 <= 50) {
                method3679((byte) -100);
            }
            field7019 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field7026[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eea", name = "e", descriptor = "(IB)V", line = 75)
    public final void method3680(int arg0, byte arg1) {
        try {
            ++field7020;
            super.field9996[super.field9945++] = (byte) (this.field7012.method4707(-1) + arg0);
            if (arg1 != 0) {
                this.method3680(-105, (byte) 93);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field7026[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!eea", name = "v", descriptor = "(I)V", line = 92)
    public final void method3681(int arg0) {
        try {
            super.field9945 = (this.field7021 - -7) / 8;
            ++field7014;
            if (arg0 >= -63) {
                this.method3682((int[]) null, (byte) 37);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field7026[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eea", name = "b", descriptor = "([IB)V", line = 111)
    public final void method3682(int[] arg0, byte arg1) {
        try {
            if (arg1 >= -3) {
                field7024 = null;
            }
            ++field7018;
            this.field7012 = new class646(arg0);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field7026[6] + (arg0 != null ? field7026[2] : field7026[4]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(ILoja;)V", line = 122)
    public final void method3683(int arg0, class646 arg1) {
        try {
            if (arg0 == -6436) {
                ++field7011;
                this.field7012 = arg1;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field7026[7] + arg0 + ',' + (arg1 != null ? field7026[2] : field7026[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!eea", name = "s", descriptor = "(I)I", line = 136)
    public final int method3684(int arg0) {
        try {
            ++field7017;
            int var2 = super.field9996[super.field9945++] - this.field7012.method4707(-1) & 255;
            if (~var2 > -129) {
                return var2;
            } else {
                if (arg0 < 2) {
                    this.method3680(70, (byte) -124);
                }
                return (var2 + -128 << 8) - -(255 & super.field9996[super.field9945++] + -this.field7012.method4707(-1));
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field7026[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eea", name = "t", descriptor = "(I)Z", line = 152)
    public final boolean method3685(int arg0) {
        try {
            ++field7015;
            int var2 = 255 & super.field9996[super.field9945] - this.field7012.method4710(true);
            if (~var2 > -129) {
                return false;
            } else {
                if (arg0 != -7450) {
                    this.method3681(15);
                }
                return true;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field7026[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eea", name = "c", descriptor = "(BI)I", line = 168)
    public final int method3686(byte arg0, int arg1) {
        try {
            if (arg0 > -80) {
                this.method3677(40, 33);
            }
            ++field7023;
            return arg1 * 8 + -this.field7021;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field7026[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!eea", name = "b", descriptor = "([BIII)V", line = 180)
    public final void method3687(byte[] arg0, int arg1, int arg2, int arg3) {
        try {
            ++field7013;
            for (int var5 = 0; var5 < arg1; ++var5) {
                arg0[arg2 + var5] = (byte) (super.field9996[super.field9945++] + -this.field7012.method4707(-1));
            }
            if (arg3 > -9) {
                field7019 = null;
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field7026[3] + (arg0 != null ? field7026[2] : field7026[4]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!eea", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3688(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 56);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!eea", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3689(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 19;
                    break;
                case 1:
                    var10005 = 83;
                    break;
                case 2:
                    var10005 = 83;
                    break;
                case 3:
                    var10005 = 118;
                    break;
                default:
                    var10005 = 56;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
