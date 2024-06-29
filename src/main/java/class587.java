import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class587 extends class497 {

    @OriginalMember(owner = "client!fa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8478 = new String[] { method4344(method4343("Aqy\u0017\u0014")), method4344(method4343("Aqy\u0011\u0014")), method4344(method4343("Aqy\u001d\u0014")), method4344(method4343("Aqy\u0016\u0014")), method4344(method4343("Aqy\u0012\u0014")), method4344(method4343("Ie;8")), method4344(method4343("\\>yzA")), method4344(method4343("Aqy\u0010\u0014")), method4344(method4343("Aqy\u0015\u0014")), method4344(method4343("Aqy\u001c\u0014")), method4344(method4343("Aqy\u0013\u0014")) };

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "[[I")
    public static int[][] field8477 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "I")
    public static int field8469;

    @OriginalMember(owner = "client!fa", name = "m", descriptor = "I")
    public static int field8470;

    @OriginalMember(owner = "client!fa", name = "l", descriptor = "I")
    public static int field8471;

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "I")
    public static int field8472;

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "I")
    public static int field8473;

    @OriginalMember(owner = "client!fa", name = "n", descriptor = "I")
    public static int field8474;

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "I")
    public static int field8475;

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "I")
    public static int field8476;

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(I)V", line = 3)
    public static void method4338(int arg0) {
        try {
            field8477 = null;
            if (arg0 != -15905) {
                field8477 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field8478[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)V", line = 13)
    public final void method1030(int arg0, int arg1) {
        try {
            super.field7292 = arg1;
            ++field8475;
            if (arg0 != 64) {
                field8477 = null;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field8478[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(ILpp;)V", line = 28)
    public class587(int arg0, class640 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "(I)I", line = 33)
    public final int method4339(int arg0) {
        try {
            ++field8470;
            if (arg0 != 3) {
                method4342((class782) null, (byte) 50, (class18) null);
            }
            return super.field7292;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8478[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)I", line = 44)
    public final int method1032(int arg0) {
        try {
            if (arg0 >= -101) {
                field8477 = null;
            }
            ++field8469;
            return 1;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8478[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)Z", line = 55)
    public final boolean method4340(int arg0) {
        try {
            ++field8471;
            if (arg0 > -127) {
                method4338(-36);
            }
            return class144.method1245(super.field7293.field9134.method4717(3), (byte) -115);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8478[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(BI)I", line = 71)
    public final int method1029(byte arg0, int arg1) {
        try {
            ++field8472;
            if (arg0 != -73) {
                field8477 = null;
            }
            return !class144.method1245(super.field7293.field9134.method4717(3), (byte) -120) ? 3 : 1;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field8478[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)V", line = 85)
    public final void method1031(byte arg0) {
        try {
            if (arg0 <= -70) {
                ++field8476;
                if (super.field7292 < 0 || ~super.field7292 < -2) {
                    super.field7292 = this.method1032(-109);
                }
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8478[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IB)Ljava/lang/String;", line = 99)
    public static final String method4341(int arg0, byte arg1) {
        try {
            ++field8474;
            if (arg1 != -47) {
                method4341(-87, (byte) -57);
            }
            return (255 & arg0 >> 24) + "." + ((16721630 & arg0) >> 16) + "." + ((65358 & arg0) >> 8) + "." + (255 & arg0);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8478[9] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(Lpp;)V", line = 110)
    public class587(class640 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lvo;BLha;)V", line = 117)
    public static final void method4342(class782 arg0, byte arg1, class18 arg2) {
        try {
            ++field8473;
            if (arg1 == -50) {
                boolean var3 = class153.field1955.method3238(arg0.field11276, arg0.field11297, -16777216 | arg0.field11163, 116, arg0.field11143, !arg0.field11201 ? null : class203.field2988.field4901, arg0.field11261, arg2) == null;
                if (var3) {
                    class628.field8955.method3984(new class727(arg0.field11276, arg0.field11297, arg0.field11261, -16777216 | arg0.field11163, arg0.field11143, arg0.field11201), 0);
                    class97.method959(arg0, -1);
                }
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field8478[4] + (arg0 != null ? field8478[6] : field8478[5]) + ',' + arg1 + ',' + (arg2 != null ? field8478[6] : field8478[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!fa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4343(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 60);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!fa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4344(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 39;
                    break;
                case 1:
                    var10005 = 16;
                    break;
                case 2:
                    var10005 = 87;
                    break;
                case 3:
                    var10005 = 84;
                    break;
                default:
                    var10005 = 60;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
