import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tw")
public class class146 extends class497 {

    @OriginalMember(owner = "client!tw", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1891 = new String[] { method1264(method1263("^S}\u001d ")), method1264(method1263("^S}\u0019 ")), method1264(method1263("^S}\u001b ")), method1264(method1263("^S}\u001c ")), method1264(method1263("^S}\u0012 ")), method1264(method1263("^S}\u001f ")), method1264(method1263("^S}\u0018 ")), method1264(method1263("^S}\u001e ")) };

    @OriginalMember(owner = "client!tw", name = "l", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!tw", name = "h", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!tw", name = "g", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!tw", name = "m", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!tw", name = "k", descriptor = "I")
    public static int field1887;

    @OriginalMember(owner = "client!tw", name = "f", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!tw", name = "j", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!tw", name = "i", descriptor = "Lsn;")
    public static class369 field1888;

    @OriginalMember(owner = "client!tw", name = "d", descriptor = "(I)V")
    public static void method1259(int arg0) {
        try {
            if (arg0 != 0) {
                field1888 = null;
            }
            field1888 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field1891[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(B)V")
    public final void method1031(byte arg0) {
        try {
            if (super.field7293.method4677(109)) {
                super.field7292 = 0;
            }
            ++field1887;
            if (~super.field7292 > -1 && ~super.field7292 < -3) {
                super.field7292 = this.method1032(-120);
            }
            if (arg0 > -70) {
                field1888 = null;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1891[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tw", name = "c", descriptor = "(I)I")
    public final int method1260(int arg0) {
        try {
            if (arg0 != 3) {
                field1888 = null;
            }
            ++field1883;
            return super.field7292;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1891[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tw", name = "<init>", descriptor = "(ILpp;)V")
    public class146(int arg0, class640 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(II)V")
    public final void method1030(int arg0, int arg1) {
        try {
            ++field1885;
            if (arg0 != 64) {
                this.method1031((byte) 124);
            }
            super.field7292 = arg1;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field1891[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tw", name = "<init>", descriptor = "(Lpp;)V")
    public class146(class640 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(JII)Ldka;")
    public static final class294 method1261(long arg0, int arg1, int arg2) {
        try {
            ++field1890;
            int var4 = -100 / ((19 - arg1) / 46);
            class294 var5 = (class294) class326.field4453.method3693(false, (long) arg2 << 56 | arg0);
            if (var5 == null) {
                var5 = new class294(arg2, arg0);
                class326.field4453.method3691(var5, var5.field8378, -1);
            }
            return var5;
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field1891[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(I)I")
    public final int method1032(int arg0) {
        try {
            if (arg0 >= -101) {
                field1888 = null;
            }
            ++field1886;
            return 1;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1891[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(BI)I")
    public final int method1029(byte arg0, int arg1) {
        try {
            ++field1884;
            if (super.field7293.method4677(70)) {
                return 3;
            } else if (arg1 != 0 && ~super.field7293.field9101.method2398(3) != -2) {
                return arg0 != -73 ? -8 : 2;
            } else {
                return 1;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field1891[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tw", name = "b", descriptor = "(I)Z")
    public final boolean method1262(int arg0) {
        try {
            ++field1889;
            if (arg0 > -127) {
                return false;
            } else {
                return !super.field7293.method4677(54);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1891[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tw", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1263(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 8);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!tw", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1264(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 42;
                    break;
                case 1:
                    var10005 = 36;
                    break;
                case 2:
                    var10005 = 83;
                    break;
                case 3:
                    var10005 = 90;
                    break;
                default:
                    var10005 = 8;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
