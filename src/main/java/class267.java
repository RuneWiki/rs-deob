import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nca")
public class class267 extends class497 {

    @OriginalMember(owner = "client!nca", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3793 = new String[] { method2197(method2196("\u0011*:\u001frW")), method2197(method2196("\u0011*:\u001ftW")), method2197(method2196("\u0011*:\u001fwW")), method2197(method2196("\u0011*:\u001fuW")), method2197(method2196("\u0011*:\u001fvW")), method2197(method2196("\u0011*:\u001fsW")), method2197(method2196("\u0011*:\u001fpW")) };

    @OriginalMember(owner = "client!nca", name = "f", descriptor = "Ljava/util/Calendar;")
    public static Calendar field3785 = Calendar.getInstance();

    @OriginalMember(owner = "client!nca", name = "g", descriptor = "Ljava/util/Calendar;")
    public static Calendar field3791 = Calendar.getInstance(TimeZone.getTimeZone(method2197(method2196("8\u0004\u000f"))));

    @OriginalMember(owner = "client!nca", name = "i", descriptor = "I")
    public static int field3786;

    @OriginalMember(owner = "client!nca", name = "k", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!nca", name = "h", descriptor = "I")
    public static int field3788;

    @OriginalMember(owner = "client!nca", name = "m", descriptor = "I")
    public static int field3789;

    @OriginalMember(owner = "client!nca", name = "l", descriptor = "I")
    public static int field3790;

    @OriginalMember(owner = "client!nca", name = "j", descriptor = "I")
    public static int field3792;

    @OriginalMember(owner = "client!nca", name = "b", descriptor = "(I)V")
    public static void method2193(int arg0) {
        try {
            field3785 = null;
            if (arg0 != 0) {
                method2193(-34);
            }
            field3791 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3793[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(B)V")
    public final void method1031(byte arg0) {
        try {
            if (super.field7293.field9134.method4716(0) && !class144.method1245(super.field7293.field9134.method4717(3), (byte) -126)) {
                super.field7292 = 0;
            }
            ++field3789;
            if (super.field7292 < 0 || super.field7292 > 1) {
                super.field7292 = this.method1032(-119);
            }
            if (arg0 > -70) {
                this.method2194(-77);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field3793[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(I)I")
    public final int method1032(int arg0) {
        try {
            ++field3788;
            return arg0 > -101 ? 0 : 0;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field3793[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(II)V")
    public final void method1030(int arg0, int arg1) {
        try {
            super.field7292 = arg1;
            ++field3792;
            if (arg0 != 64) {
                this.method1031((byte) 92);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field3793[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!nca", name = "d", descriptor = "(I)Z")
    public final boolean method2194(int arg0) {
        try {
            ++field3790;
            if (arg0 >= -127) {
                return false;
            } else {
                return class144.method1245(super.field7293.field9134.method4717(3), (byte) -115);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field3793[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nca", name = "<init>", descriptor = "(ILpp;)V")
    public class267(int arg0, class640 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(BI)I")
    public final int method1029(byte arg0, int arg1) {
        try {
            if (arg0 != -73) {
                this.method1031((byte) -37);
            }
            ++field3786;
            return !class144.method1245(super.field7293.field9134.method4717(arg0 + 76), (byte) -126) ? 3 : 1;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field3793[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!nca", name = "c", descriptor = "(I)I")
    public final int method2195(int arg0) {
        try {
            if (arg0 != 3) {
                field3785 = null;
            }
            ++field3787;
            return super.field7292;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field3793[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nca", name = "<init>", descriptor = "(Lpp;)V")
    public class267(class640 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!nca", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2196(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 49);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!nca", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2197(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 127;
                    break;
                case 1:
                    var10005 = 73;
                    break;
                case 2:
                    var10005 = 91;
                    break;
                case 3:
                    var10005 = 49;
                    break;
                default:
                    var10005 = 49;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
