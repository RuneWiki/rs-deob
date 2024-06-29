import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eha")
public class class787 extends class497 {

    @OriginalMember(owner = "client!eha", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field11370 = new String[] { method5670(method5669("\u0013\u001de\u000ft^")), method5670(method5669("\u0013\u001de\u000f~^")), method5670(method5669("\u0013\u001de\u000f}^")), method5670(method5669("\u0013\u001de\u000f{^")), method5670(method5669("\u0013\u001de\u000fx^")), method5670(method5669("\u0013\u001de\u000fy^")), method5670(method5669("\u0013\u001de\u000f\u007f^")), method5670(method5669("\u0013\u001de\u000fu^")), method5670(method5669("\u0013\u001de\u000fz^")) };

    @OriginalMember(owner = "client!eha", name = "m", descriptor = "[Ljava/lang/String;")
    public static String[] field11367 = new String[8];

    @OriginalMember(owner = "client!eha", name = "o", descriptor = "I")
    public static int field11360;

    @OriginalMember(owner = "client!eha", name = "l", descriptor = "I")
    public static int field11361;

    @OriginalMember(owner = "client!eha", name = "f", descriptor = "I")
    public static int field11362;

    @OriginalMember(owner = "client!eha", name = "g", descriptor = "I")
    public static int field11363;

    @OriginalMember(owner = "client!eha", name = "k", descriptor = "I")
    public static int field11364;

    @OriginalMember(owner = "client!eha", name = "j", descriptor = "I")
    public static int field11365;

    @OriginalMember(owner = "client!eha", name = "n", descriptor = "I")
    public static int field11368;

    @OriginalMember(owner = "client!eha", name = "h", descriptor = "I")
    public static int field11369;

    @OriginalMember(owner = "client!eha", name = "i", descriptor = "[[I")
    public static int[][] field11366;

    @OriginalMember(owner = "client!eha", name = "<init>", descriptor = "(ILpp;)V", line = 5)
    public class787(int arg0, class640 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!eha", name = "b", descriptor = "(I)V", line = 10)
    public static void method5664(int arg0) {
        try {
            field11367 = null;
            field11366 = null;
            int var1 = -119 / ((arg0 - -20) / 52);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field11370[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eha", name = "c", descriptor = "(I)I", line = 20)
    public final int method5665(int arg0) {
        try {
            if (arg0 != 3) {
                this.method1030(-54, 110);
            }
            ++field11369;
            return super.field7292;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field11370[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "(II)V", line = 32)
    public final void method1030(int arg0, int arg1) {
        try {
            super.field7292 = arg1;
            if (arg0 == 64) {
                ++field11361;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field11370[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "(B)V", line = 44)
    public final void method1031(byte arg0) {
        try {
            ++field11363;
            if (super.field7293.method4677(93)) {
                super.field7292 = 2;
            }
            if (super.field7292 < 0 || super.field7292 > 2) {
                super.field7292 = this.method1032(-125);
            }
            if (arg0 > -70) {
                field11367 = null;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field11370[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "(BI)I", line = 65)
    public final int method1029(byte arg0, int arg1) {
        try {
            ++field11362;
            if (arg0 != -73) {
                this.method5667(-4);
            }
            return super.field7293.method4677(92) ? 3 : 1;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field11370[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!eha", name = "b", descriptor = "(B)V", line = 79)
    public static final void method5666(byte arg0) {
        try {
            class139.field1812 = -1;
            class398.field5797 = 1;
            if (arg0 > -64) {
                field11366 = null;
            }
            ++field11360;
            class341.field4966 = class60.field911;
            class157.method1317(true, class216.field3166, 0, "", class216.field3166.equals(""));
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field11370[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eha", name = "d", descriptor = "(I)Z", line = 93)
    public final boolean method5667(int arg0) {
        try {
            ++field11365;
            if (arg0 > -127) {
                field11366 = null;
            }
            return !super.field7293.method4677(23);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field11370[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "(BB)Z", line = 108)
    public static final boolean method5668(byte arg0, byte arg1) {
        try {
            int var2 = 26 / ((-16 - arg0) / 43);
            ++field11364;
            int var3 = arg1 & 255;
            if (var3 == 0) {
                return false;
            } else {
                return ~var3 > -129 || var3 >= 160 || class615.field8785[var3 + -128] != 0;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field11370[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!eha", name = "<init>", descriptor = "(Lpp;)V", line = 132)
    public class787(class640 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "(I)I", line = 140)
    public final int method1032(int arg0) {
        try {
            if (arg0 > -101) {
                return 17;
            } else {
                ++field11368;
                if (super.field7293.method4677(115)) {
                    return 2;
                } else {
                    return super.field7293.field9134.method4716(0) && class557.method4169((byte) -35, super.field7293.field9134.method4717(3)) ? 1 : 0;
                }
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field11370[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eha", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5669(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 60);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!eha", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5670(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 118;
                    break;
                case 1:
                    var10005 = 117;
                    break;
                case 2:
                    var10005 = 4;
                    break;
                case 3:
                    var10005 = 33;
                    break;
                default:
                    var10005 = 60;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
