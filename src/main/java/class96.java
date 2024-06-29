import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iia")
public class class96 {

    @OriginalMember(owner = "client!iia", name = "p", descriptor = "B")
    public byte field1083;

    @OriginalMember(owner = "client!iia", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1091 = new String[] { method812(method811("Q\u0018\u007f\u007fWQ\u001fw%U\u0010")), method812(method811("Q\u0018\u007f\u007f*\u0010")), method812(method811("Q\u0018\u007f\u007f)\u0010")) };

    @OriginalMember(owner = "client!iia", name = "d", descriptor = "I")
    public static int field1077 = -1;

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "I")
    public static int field1075;

    @OriginalMember(owner = "client!iia", name = "g", descriptor = "Lqa;")
    public class261 field1079;

    @OriginalMember(owner = "client!iia", name = "f", descriptor = "Lqa;")
    public class261 field1082;

    @OriginalMember(owner = "client!iia", name = "o", descriptor = "Lqj;")
    public class535 field1080;

    @OriginalMember(owner = "client!iia", name = "n", descriptor = "Lqj;")
    public class535 field1090;

    @OriginalMember(owner = "client!iia", name = "e", descriptor = "Lpb;")
    public class681 field1085;

    @OriginalMember(owner = "client!iia", name = "l", descriptor = "Lmia;")
    public class69 field1089;

    @OriginalMember(owner = "client!iia", name = "h", descriptor = "Ldr;")
    public class749 field1081;

    @OriginalMember(owner = "client!iia", name = "j", descriptor = "Liia;")
    public class96 field1088;

    @OriginalMember(owner = "client!iia", name = "k", descriptor = "S")
    public short field1078;

    @OriginalMember(owner = "client!iia", name = "c", descriptor = "S")
    public short field1084;

    @OriginalMember(owner = "client!iia", name = "b", descriptor = "S")
    public short field1086;

    @OriginalMember(owner = "client!iia", name = "m", descriptor = "S")
    public short field1087;

    @OriginalMember(owner = "client!iia", name = "i", descriptor = "[Laaa;")
    public static class643[] field1076;

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(B)V", line = 4)
    public static void method809(byte arg0) {
        try {
            if (arg0 == -114) {
                field1076 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field1091[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(I)V", line = 15)
    public final void method810(int arg0) {
        try {
            while (this.field1085 != null) {
                class681 var2 = this.field1085.field9865;
                this.field1085.method4991(-501);
                this.field1085 = var2;
            }
            field1075++;
            if (arg0 != -1) {
                this.method810(-4);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field1091[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!iia", name = "<init>", descriptor = "(I)V", line = 35)
    public class96(int arg0) {
        try {
            this.field1083 = (byte) arg0;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1091[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!iia", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method811(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x6B);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!iia", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method812(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 56;
                    break;
                case 1:
                    var10005 = 113;
                    break;
                case 2:
                    var10005 = 30;
                    break;
                case 3:
                    var10005 = 81;
                    break;
                default:
                    var10005 = 107;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
