import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oea")
public class class647 extends class497 {

    @OriginalMember(owner = "client!oea", name = "f", descriptor = "Z")
    private boolean field9193 = true;

    @OriginalMember(owner = "client!oea", name = "l", descriptor = "Z")
    public boolean field9194 = false;

    @OriginalMember(owner = "client!oea", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9206 = new String[] { method4721(method4720("+\u0005GH\u001fl")), method4721(method4720("+\u0005GH\u0012l")), method4721(method4720("+\u0005GH\u0011l")), method4721(method4720("+\u0005GH\u0017l")), method4721(method4720("+\u0005GH\u0010l")), method4721(method4720("+\u0005GH\u0015l")), method4721(method4720("+\u0005GH\u0016l")), method4721(method4720(".\u0001A\u0002+")), method4721(method4720("+\u0005GH\u0014l")), method4721(method4720("+\u0005GH\u001bl")), method4721(method4720("+\u0005GH\u001al")) };

    @OriginalMember(owner = "client!oea", name = "m", descriptor = "Lhj;")
    public static class671 field9200 = new class671(1, 2, 2, 0);

    @OriginalMember(owner = "client!oea", name = "g", descriptor = "Lmv;")
    public static class125 field9201 = new class125(51, -1);

    @OriginalMember(owner = "client!oea", name = "j", descriptor = "I")
    public static int field9204 = 0;

    @OriginalMember(owner = "client!oea", name = "s", descriptor = "Ltka;")
    public static class599 field9205 = new class599();

    @OriginalMember(owner = "client!oea", name = "n", descriptor = "I")
    public static int field9190;

    @OriginalMember(owner = "client!oea", name = "h", descriptor = "I")
    public static int field9191;

    @OriginalMember(owner = "client!oea", name = "k", descriptor = "I")
    public static int field9192;

    @OriginalMember(owner = "client!oea", name = "q", descriptor = "I")
    public static int field9195;

    @OriginalMember(owner = "client!oea", name = "p", descriptor = "I")
    public static int field9196;

    @OriginalMember(owner = "client!oea", name = "i", descriptor = "I")
    public static int field9197;

    @OriginalMember(owner = "client!oea", name = "o", descriptor = "I")
    public static int field9198;

    @OriginalMember(owner = "client!oea", name = "t", descriptor = "I")
    public static int field9199;

    @OriginalMember(owner = "client!oea", name = "u", descriptor = "I")
    public static int field9202;

    @OriginalMember(owner = "client!oea", name = "r", descriptor = "I")
    public static int field9203;

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(II)V")
    public final void method1030(int arg0, int arg1) {
        try {
            if (arg0 != 64) {
                this.method4715(-57);
            }
            ++field9202;
            this.field9194 = false;
            super.field7292 = arg1;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field9206[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(BI)I")
    public final int method1029(byte arg0, int arg1) {
        try {
            ++field9190;
            if (arg0 != -73) {
                return 14;
            } else if (!super.field7293.method4675((byte) -111).method270(78)) {
                return 3;
            } else {
                return arg1 == 3 && !class141.method1224((byte) 63, field9206[7]) ? 3 : 2;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field9206[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!oea", name = "<init>", descriptor = "(ILpp;)V")
    public class647(int arg0, class640 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!oea", name = "d", descriptor = "(I)V")
    public static void method4714(int arg0) {
        try {
            field9200 = null;
            field9205 = null;
            field9201 = null;
            int var1 = -35 % ((arg0 - -56) / 60);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9206[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oea", name = "c", descriptor = "(I)Z")
    public final boolean method4715(int arg0) {
        try {
            if (arg0 >= -127) {
                return false;
            } else {
                ++field9192;
                return super.field7293.method4675((byte) -107).method270(30);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9206[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oea", name = "e", descriptor = "(I)Z")
    public final boolean method4716(int arg0) {
        try {
            if (arg0 != 0) {
                method4718((byte) 39);
            }
            ++field9196;
            return this.field9193;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9206[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oea", name = "b", descriptor = "(I)I")
    public final int method4717(int arg0) {
        try {
            if (arg0 != 3) {
                method4718((byte) -64);
            }
            ++field9203;
            return super.field7292;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9206[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oea", name = "<init>", descriptor = "(Lpp;)V")
    public class647(class640 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!oea", name = "b", descriptor = "(B)V")
    public static final void method4718(byte arg0) {
        try {
            class251 var1 = class699.field9789;
            synchronized (class699.field9789) {
                class699.field9789.method2047(11914);
            }
            ++field9197;
            if (arg0 <= 92) {
                method4718((byte) 83);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field9206[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(I)I")
    public final int method1032(int arg0) {
        try {
            if (arg0 > -101) {
                return -94;
            } else {
                this.field9194 = true;
                ++field9191;
                return !super.field7293.method4675((byte) -99).method270(106) ? 0 : 2;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9206[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(B)V")
    public final void method1031(byte arg0) {
        try {
            ++field9198;
            if (arg0 <= -70) {
                if (!super.field7293.method4675((byte) -94).method270(27)) {
                    super.field7292 = 0;
                }
                if (~super.field7292 > -1 || super.field7292 > 5) {
                    super.field7292 = this.method1032(-123);
                }
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9206[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(BZ)V")
    public final void method4719(byte arg0, boolean arg1) {
        try {
            this.field9193 = arg1;
            ++field9195;
            if (arg0 >= -2) {
                this.method1029((byte) -20, 127);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field9206[10] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!oea", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4720(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 83);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!oea", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4721(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 68;
                    break;
                case 1:
                    var10005 = 96;
                    break;
                case 2:
                    var10005 = 38;
                    break;
                case 3:
                    var10005 = 102;
                    break;
                default:
                    var10005 = 83;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
