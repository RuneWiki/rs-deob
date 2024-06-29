import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class680 {

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "Lwq;")
    public class178 field9854 = new class178(20);

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "Lwq;")
    private class178 field9859 = new class178(64);

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "Lla;")
    public class476 field9853;

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "Lla;")
    private class476 field9851;

    @OriginalMember(owner = "client!mj", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9863 = new String[] { method4989(method4988("}N>\u001b")), method4989(method4988("h\u0015|YX")), method4989(method4988("~Q|KL}R&I\r")), method4989(method4988("~Q|4\r")), method4989(method4988("~Q|5\r")), method4989(method4988("~Q|2\r")), method4989(method4988("~Q|3\r")), method4989(method4988("~Q|6\r")), method4989(method4988("~Q|1\r")) };

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "Lqha;")
    public static class112 field9858 = new class112(16);

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "Lwia;")
    public static class790 field9860 = new class790(33, 3);

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "[Lika;")
    public static class447[] field9862 = new class447[37];

    @OriginalMember(owner = "client!mj", name = "n", descriptor = "I")
    public static int field9849;

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "I")
    public static int field9850;

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "I")
    public static int field9852;

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "I")
    public static int field9855;

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "I")
    public static int field9856;

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "I")
    public static int field9857;

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "I")
    public static int field9861;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IZ)V", line = 4)
    public final void method4982(int arg0, boolean arg1) {
        try {
            class178 var3 = this.field9859;
            synchronized (this.field9859) {
                this.field9859.method1557(arg0, (byte) -107);
            }
            field9852++;
            class178 var4 = this.field9854;
            synchronized (this.field9854) {
                if (!arg1) {
                    field9858 = null;
                }
                this.field9854.method1557(arg0, (byte) -113);
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field9863[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIZII)V", line = 22)
    public static final void method4983(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        try {
            field9855++;
            int var6 = class541.method4089(class676.field9807, class381.field5786, arg5, 18286);
            int var7 = class541.method4089(class676.field9807, class381.field5786, arg0, 18286);
            int var8 = class541.method4089(class200.field3119, class676.field9797, arg1, 18286);
            int var9 = class541.method4089(class200.field3119, class676.field9797, arg2, 18286);
            if (!arg3) {
                method4985(-81);
            }
            for (int var10 = var6; var10 <= var7; var10++) {
                class319.method2702(class243.field3731[var10], var8, var9, arg3, arg4);
            }
        } catch (RuntimeException var12) {
            throw class759.method5498(var12, field9863[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(I)V", line = 50)
    public final void method4984(int arg0) {
        try {
            class178 var2 = this.field9859;
            synchronized (this.field9859) {
                this.field9859.method1569(10574);
            }
            field9856++;
            class178 var3 = this.field9854;
            synchronized (this.field9854) {
                this.field9854.method1569(10574);
            }
            int var4 = -101 / ((-arg0 - 17) / 52);
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field9863[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V", line = 68)
    public static void method4985(int arg0) {
        try {
            field9862 = null;
            field9858 = null;
            field9860 = null;
            if (arg0 != -10633) {
                method4985(106);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field9863[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)V", line = 82)
    public final void method4986(byte arg0) {
        try {
            if (arg0 >= 8) {
                class178 var2 = this.field9859;
                synchronized (this.field9859) {
                    this.field9859.method1559(0);
                }
                field9849++;
                class178 var3 = this.field9854;
                synchronized (this.field9854) {
                    this.field9854.method1559(0);
                }
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field9863[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(Lto;ILla;Lla;)V", line = 145)
    public class680(class8 arg0, int arg1, class476 arg2, class476 arg3) {
        try {
            this.field9853 = arg3;
            this.field9851 = arg2;
            this.field9851.method3646(46, (byte) -85);
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field9863[2] + (arg0 == null ? field9863[0] : field9863[1]) + ',' + arg1 + ',' + (arg2 == null ? field9863[0] : field9863[1]) + ',' + (arg3 == null ? field9863[0] : field9863[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)Lhd;", line = 104)
    public final class772 method4987(int arg0, int arg1) {
        try {
            field9857++;
            class178 var3 = this.field9859;
            class772 var4;
            synchronized (this.field9859) {
                var4 = (class772) this.field9859.method1558((byte) 96, (long) arg1);
            }
            if (var4 != null) {
                return var4;
            }
            class476 var5 = this.field9851;
            byte[] var6;
            synchronized (this.field9851) {
                var6 = this.field9851.method3632(46, arg1, -10);
            }
            class772 var7 = new class772();
            var7.field11221 = this;
            if (arg0 != -21990) {
                return null;
            }
            if (var6 != null) {
                var7.method5595((byte) -125, new class163(var6));
            }
            class178 var8 = this.field9859;
            synchronized (this.field9859) {
                this.field9859.method1556((long) arg1, var7, 1);
                return var7;
            }
        } catch (RuntimeException var13) {
            throw class759.method5498(var13, field9863[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mj", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4988(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x25);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!mj", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4989(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 19;
                    break;
                case 1:
                    var10005 = 59;
                    break;
                case 2:
                    var10005 = 82;
                    break;
                case 3:
                    var10005 = 119;
                    break;
                default:
                    var10005 = 37;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
