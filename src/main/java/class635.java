import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kba")
public class class635 implements class763 {

    @OriginalMember(owner = "client!kba", name = "h", descriptor = "Llga;")
    private class47 field9004;

    @OriginalMember(owner = "client!kba", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9010 = new String[] { method4637(method4636("/\r!\u007f4l")), method4637(method4636("/\r!\u007f7l")), method4637(method4636("/\r!\u007f5l")), method4637(method4636("/\r!\u007f3l")), method4637(method4636("/\r!\u007f2l")), method4637(method4636("?An\u007f\u000b")), method4637(method4636("/\r!\u007fJ-\u0001)%Hl")), method4637(method4636("*\u001a,=")) };

    @OriginalMember(owner = "client!kba", name = "e", descriptor = "Lsb;")
    public static class261 field9003 = new class261(30, 12);

    @OriginalMember(owner = "client!kba", name = "c", descriptor = "I")
    public static int field9008 = 0;

    @OriginalMember(owner = "client!kba", name = "g", descriptor = "I")
    public static int field9001;

    @OriginalMember(owner = "client!kba", name = "d", descriptor = "I")
    public static int field9002;

    @OriginalMember(owner = "client!kba", name = "b", descriptor = "I")
    public static int field9005;

    @OriginalMember(owner = "client!kba", name = "i", descriptor = "I")
    public static int field9007;

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "I")
    public static int field9009;

    @OriginalMember(owner = "client!kba", name = "f", descriptor = "Lvo;")
    public static class782 field9006;

    @OriginalMember(owner = "client!kba", name = "c", descriptor = "(I)V", line = 3)
    public static final void method4633(int arg0) {
        try {
            field9001++;
            if (class499.field7298 != null) {
                class499.field7298.method3423(113);
            }
            if (class591.field8505 != null) {
                class591.field8505.method3423(87);
            }
            if (arg0 <= 84) {
                field9009 = 84;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field9010[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kba", name = "b", descriptor = "(I)I", line = 20)
    public final int method1252(int arg0) {
        try {
            int var2 = -5 / ((-arg0 - 28) / 36);
            field9005++;
            return this.field9004.method518((byte) -121) ? 100 : this.field9004.method508(29668);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field9010[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(B)V", line = 37)
    public static void method4634(byte arg0) {
        try {
            field9006 = null;
            field9003 = null;
            int var1 = 32 % ((arg0 + 20) / 56);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9010[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kba", name = "<init>", descriptor = "(Llga;)V", line = 49)
    public class635(class47 arg0) {
        try {
            this.field9004 = arg0;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9010[6] + (arg0 == null ? field9010[7] : field9010[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(ZJ)V", line = 57)
    public static final void method4635(boolean arg0, long arg1) {
        try {
            field9002++;
            class267.field3785.setTime(new Date(arg1));
            if (!arg0) {
                method4633(90);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field9010[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(I)Luw;", line = 77)
    public final class706 method1254(int arg0) {
        try {
            field9007++;
            if (arg0 >= -92) {
                this.method1254(-116);
            }
            return class706.field9867;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9010[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kba", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4636(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x76);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!kba", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4637(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 68;
                    break;
                case 1:
                    var10005 = 111;
                    break;
                case 2:
                    var10005 = 64;
                    break;
                case 3:
                    var10005 = 81;
                    break;
                default:
                    var10005 = 118;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
