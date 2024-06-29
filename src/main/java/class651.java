import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class651 {

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "I")
    public int field9332 = 0;

    @OriginalMember(owner = "client!sk", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9333 = new String[] { method4749(method4748("R\u007f\u000fG")), method4749(method4748("G$M\u0005.")), method4749(method4748("OaMh{")), method4749(method4748("OaMo{")), method4749(method4748("OaMj{")), method4749(method4748("OaMi{")) };

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "I")
    public static int field9328;

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "I")
    public static int field9329;

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "I")
    public static int field9330;

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "I")
    public static int field9331;

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "[Lrda;")
    public static class693[] field9327;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lwq;B)V", line = 5)
    public final void method4744(class176 arg0, byte arg1) {
        try {
            field9328++;
            int var3 = 50 / ((-arg1 - 69) / 53);
            while (true) {
                int var4 = arg0.method1645((byte) -110);
                if (var4 == 0) {
                    return;
                }
                this.method4745(var4, (byte) 66, arg0);
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field9333[5] + (arg0 == null ? field9333[0] : field9333[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IBLwq;)V", line = 26)
    private final void method4745(int arg0, byte arg1, class176 arg2) {
        try {
            if (arg0 == 5) {
                this.field9332 = arg2.method1687((byte) -88);
            }
            if (arg1 < 47) {
                method4747((byte) 14);
            }
            field9329++;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field9333[2] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field9333[0] : field9333[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Z)V", line = 47)
    public static void method4746(boolean arg0) {
        try {
            if (!arg0) {
                field9327 = null;
            }
            field9327 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field9333[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)[Ljca;", line = 57)
    public static final class715[] method4747(byte arg0) {
        try {
            field9331++;
            return arg0 == 73 ? new class715[] { class239.field3676, class782.field11414, class120.field1729 } : null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field9333[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sk", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4748(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x53);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!sk", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4749(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 60;
                    break;
                case 1:
                    var10005 = 10;
                    break;
                case 2:
                    var10005 = 99;
                    break;
                case 3:
                    var10005 = 43;
                    break;
                default:
                    var10005 = 83;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
