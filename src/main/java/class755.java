import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public class class755 extends class497 {

    @OriginalMember(owner = "client!bq", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10805 = new String[] { method5479(method5478("u_*7a")), method5479(method5478("u_*1a")), method5479(method5478("u_*5a")), method5479(method5478("u_*3a")), method5479(method5478("u_*4a")), method5479(method5478("u_*6a")), method5479(method5478("u_*2a")) };

    @OriginalMember(owner = "client!bq", name = "k", descriptor = "I")
    public static int field10796;

    @OriginalMember(owner = "client!bq", name = "j", descriptor = "I")
    public static int field10797;

    @OriginalMember(owner = "client!bq", name = "g", descriptor = "I")
    public static int field10799;

    @OriginalMember(owner = "client!bq", name = "m", descriptor = "I")
    public static int field10800;

    @OriginalMember(owner = "client!bq", name = "n", descriptor = "I")
    public static int field10802;

    @OriginalMember(owner = "client!bq", name = "i", descriptor = "I")
    public static int field10803;

    @OriginalMember(owner = "client!bq", name = "h", descriptor = "I")
    public static int field10804;

    @OriginalMember(owner = "client!bq", name = "f", descriptor = "J")
    public static long field10801;

    @OriginalMember(owner = "client!bq", name = "l", descriptor = "Lo;")
    public static class484 field10798;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(B)V")
    public final void method1031(byte arg0) {
        try {
            ++field10797;
            if (super.field7292 != 1 && super.field7292 != 0) {
                super.field7292 = this.method1032(-127);
            }
            if (arg0 > -70) {
                field10798 = null;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10805[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "(I)I")
    public final int method5475(int arg0) {
        try {
            if (arg0 != 3) {
                this.method5475(-71);
            }
            ++field10803;
            return super.field7292;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10805[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(Lpp;)V")
    public class755(class640 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "(B)V")
    public static final void method5476(byte arg0) {
        try {
            ++field10802;
            class727.field10423.method232(class376.field5494, class451.field6612.field9114.method5345(arg0 + 120) != 1 ? -1 : class189.field2518 + 256 << 2, 0);
            if (arg0 != -117) {
                field10800 = -29;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field10805[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bq", name = "c", descriptor = "(I)V")
    public static void method5477(int arg0) {
        try {
            field10798 = null;
            if (arg0 != 256) {
                field10798 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field10805[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(BI)I")
    public final int method1029(byte arg0, int arg1) {
        try {
            ++field10799;
            if (arg0 != -73) {
                this.method1029((byte) -11, 48);
            }
            return 1;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field10805[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(II)V")
    public final void method1030(int arg0, int arg1) {
        try {
            if (arg0 == 64) {
                super.field7292 = arg1;
                ++field10804;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field10805[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(ILpp;)V")
    public class755(int arg0, class640 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(I)I")
    public final int method1032(int arg0) {
        try {
            if (arg0 > -101) {
                field10798 = null;
            }
            ++field10796;
            return 1;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10805[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bq", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5478(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 73);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!bq", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5479(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 23;
                    break;
                case 1:
                    var10005 = 46;
                    break;
                case 2:
                    var10005 = 4;
                    break;
                case 3:
                    var10005 = 112;
                    break;
                default:
                    var10005 = 73;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
