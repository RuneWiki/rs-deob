import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class258 extends class394 {

    @OriginalMember(owner = "client!nj", name = "A", descriptor = "[Ljava/lang/String;")
    private static final String[] field3998 = new String[] { method2184(method2183("BL0[F")), method2184(method2183("BL0XF")), method2184(method2183("BL0TF")), method2184(method2183("BL0UF")), method2184(method2183("BL0_F")), method2184(method2183("BL0ZF")), method2184(method2183("BL0WF")), method2184(method2183("BL0\\F")) };

    @OriginalMember(owner = "client!nj", name = "u", descriptor = "I")
    public static int field3985;

    @OriginalMember(owner = "client!nj", name = "p", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!nj", name = "n", descriptor = "I")
    public int field3987;

    @OriginalMember(owner = "client!nj", name = "y", descriptor = "I")
    public static int field3988;

    @OriginalMember(owner = "client!nj", name = "w", descriptor = "I")
    public static int field3989;

    @OriginalMember(owner = "client!nj", name = "v", descriptor = "I")
    public static int field3990;

    @OriginalMember(owner = "client!nj", name = "t", descriptor = "I")
    public int field3992;

    @OriginalMember(owner = "client!nj", name = "z", descriptor = "I")
    public static int field3993;

    @OriginalMember(owner = "client!nj", name = "o", descriptor = "I")
    public int field3994;

    @OriginalMember(owner = "client!nj", name = "x", descriptor = "I")
    public static int field3995;

    @OriginalMember(owner = "client!nj", name = "r", descriptor = "I")
    public static int field3996;

    @OriginalMember(owner = "client!nj", name = "q", descriptor = "I")
    public int field3997;

    @OriginalMember(owner = "client!nj", name = "s", descriptor = "J")
    public long field3991;

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "(I)Lija;", line = 7)
    public static final class363 method2175(int arg0) {
        try {
            field3986++;
            return arg0 == 7 ? class161.field2149 : null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3998[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)J", line = 18)
    public final long method2176(int arg0) {
        try {
            field3988++;
            if (arg0 > -67) {
                this.method2182((byte) 3);
            }
            return this.field3991;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3998[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(B)I", line = 36)
    public final int method2177(byte arg0) {
        try {
            if (arg0 != 107) {
                this.method2177((byte) 125);
            }
            field3990++;
            return this.field3994;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3998[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Z)I", line = 47)
    public final int method2178(boolean arg0) {
        try {
            field3995++;
            if (arg0) {
                method2175(56);
            }
            return this.field3997;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3998[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(III)V", line = 59)
    public static final void method2179(int arg0, int arg1, int arg2) {
        try {
            field3985++;
            class313 var3 = class196.method1670((long) arg1, arg2, 79);
            var3.method2636((byte) -4);
            var3.field4951 = arg0;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field3998[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(Z)V", line = 72)
    public static final void method2180(boolean arg0) {
        try {
            field3993++;
            for (class655 var1 = (class655) class492.field7058.method4068(false); var1 != null; var1 = (class655) class492.field7058.method4072(-105)) {
                if (var1.field9459 > 1) {
                    var1.field9459 = 0;
                    class71.field775.method1556(((class417) var1.field9457.field7916.field529).field6154, var1, 1);
                    var1.field9457.method4069((byte) -59);
                }
            }
            class184.field2547 = 0;
            class593.field8707 = 0;
            class728.field10549.method3879(125);
            class244.field3740.method970(-93);
            class492.field7058.method4069((byte) -65);
            class115.method1014(class528.field7670, arg0);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3998[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)I", line = 101)
    public final int method2181(int arg0) {
        try {
            field3989++;
            return arg0 == -2 ? this.field3987 : 124;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3998[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "(B)I", line = 115)
    public final int method2182(byte arg0) {
        try {
            field3996++;
            if (arg0 != 117) {
                this.field3991 = 45L;
            }
            return this.field3992;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3998[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nj", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2183(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x6E);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!nj", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2184(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 44;
                    break;
                case 1:
                    var10005 = 38;
                    break;
                case 2:
                    var10005 = 30;
                    break;
                case 3:
                    var10005 = 29;
                    break;
                default:
                    var10005 = 110;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
