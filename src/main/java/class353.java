import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class353 {

    @OriginalMember(owner = "client!jo", name = "g", descriptor = "[I")
    public int[] field5699;

    @OriginalMember(owner = "client!jo", name = "e", descriptor = "[I")
    public int[] field5697;

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "[I")
    public int[] field5696;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "[I")
    public int[] field5698;

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "[S")
    public short[] field5700;

    @OriginalMember(owner = "client!jo", name = "f", descriptor = "[S")
    public short[] field5695;

    @OriginalMember(owner = "client!jo", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5701 = new String[] { method2933(method2932(".#\u0000j\"*%Zhc")), method2933(method2932("*9B:")), method2933(method2932("?b\u0000x6")) };

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "I")
    public static int field5694;

    @OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(Lnda;)V", line = 11)
    public class353(class584 arg0) {
        try {
            this.field5699 = new int[3];
            this.field5697 = new int[2];
            this.field5696 = new int[3];
            this.field5698 = new int[2];
            this.field5696[0] = arg0.field8448;
            this.field5696[1] = arg0.field8437;
            this.field5696[2] = arg0.field8441;
            this.field5699[2] = arg0.field8477;
            this.field5699[0] = arg0.field8416;
            this.field5699[1] = arg0.field8459;
            this.field5698[0] = arg0.field8397;
            this.field5698[1] = arg0.field8457;
            this.field5697[0] = arg0.field8452;
            this.field5697[1] = arg0.field8432;
            if (arg0.field8469 != null) {
                this.field5700 = new short[arg0.field8469.length];
                class405.method3261(arg0.field8469, 0, this.field5700, 0, this.field5700.length);
            }
            if (arg0.field8454 != null) {
                this.field5695 = new short[arg0.field8454.length];
                class405.method3261(arg0.field8454, 0, this.field5695, 0, this.field5695.length);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5701[0] + (arg0 == null ? field5701[1] : field5701[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!jo", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2932(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x4B);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!jo", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2933(char[] arg0) {
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
                    var10005 = 76;
                    break;
                case 2:
                    var10005 = 46;
                    break;
                case 3:
                    var10005 = 86;
                    break;
                default:
                    var10005 = 75;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
