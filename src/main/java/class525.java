import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class525 extends class114 {

    @OriginalMember(owner = "client!np", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7653 = new String[] { method3994(method3993("\tj$\u000b\u0014")), method3994(method3993("\tj$\f\u0014")), method3994(method3993("\u001c4$fA")), method3994(method3993("\tof$")), method3994(method3993("\tj$\t\u0014")), method3994(method3993("\tj$\r\u0014")), method3994(method3993("\tj$\n\u0014")) };

    @OriginalMember(owner = "client!np", name = "j", descriptor = "I")
    private int field7644;

    @OriginalMember(owner = "client!np", name = "o", descriptor = "I")
    public static int field7646;

    @OriginalMember(owner = "client!np", name = "q", descriptor = "I")
    public static int field7647;

    @OriginalMember(owner = "client!np", name = "r", descriptor = "I")
    public static int field7649;

    @OriginalMember(owner = "client!np", name = "k", descriptor = "I")
    public static int field7650;

    @OriginalMember(owner = "client!np", name = "m", descriptor = "I")
    public static int field7651;

    @OriginalMember(owner = "client!np", name = "n", descriptor = "I")
    public static int field7652;

    @OriginalMember(owner = "client!np", name = "p", descriptor = "J")
    private long field7645;

    @OriginalMember(owner = "client!np", name = "l", descriptor = "[Ltb;")
    public static class392[] field7648;

    @OriginalMember(owner = "client!np", name = "b", descriptor = "(I)V", line = 10)
    public static void method3990(int arg0) {
        try {
            field7648 = null;
            if (arg0 != 0) {
                method3990(62);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field7653[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(ILwfa;)V", line = 20)
    public final void method115(int arg0, class286 arg1) {
        try {
            field7647++;
            if (arg0 == 95) {
                arg1.method2329(this.field7645, arg0 - 30824, this.field7644);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field7653[1] + arg0 + ',' + (arg1 == null ? field7653[3] : field7653[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Ljc;I)V", line = 34)
    public final void method116(class711 arg0, int arg1) {
        try {
            field7649++;
            this.field7644 = arg0.method5113(18443);
            if (arg1 == -27800) {
                this.field7645 = arg0.method5147((byte) 109);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field7653[4] + (arg0 == null ? field7653[3] : field7653[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(B)V", line = 46)
    public static final void method3991(byte arg0) {
        try {
            class35.field430 = 0L;
            field7652++;
            class216.field3166 = "";
            class466.field6807 = -1;
            if (arg0 != -111) {
                field7650 = -21;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field7653[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(I)V", line = 63)
    public static final void method3992(int arg0) {
        try {
            class251 var1 = class391.field5710;
            synchronized (class391.field5710) {
                class391.field5710.method2043(false);
            }
            field7651++;
            class251 var2 = class270.field3827;
            synchronized (class270.field3827) {
                class270.field3827.method2043(false);
                if (arg0 <= 16) {
                    method3992(-111);
                }
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field7653[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!np", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3993(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x3C);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!np", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3994(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 103;
                    break;
                case 1:
                    var10005 = 26;
                    break;
                case 2:
                    var10005 = 10;
                    break;
                case 3:
                    var10005 = 72;
                    break;
                default:
                    var10005 = 60;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
