import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class495 implements class657 {

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "[F")
    public float[] field7436;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
    public int field7440;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
    public int field7439;

    @OriginalMember(owner = "client!qe", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7442 = new String[] { method3743(method3742("\n\u001dHb\u0001\u0015\u0011\u0012`@")), method3743(method3742("\n\u001dH\u001c@")), method3743(method3742("\n\u001dH\u001f@")) };

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "Lmp;")
    public static class796 field7438 = new class796(method3743(method3742("77%\u001f$")), "", method3743(method3742("\u0017\u0017\u0005?\u0004")), 4);

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "I")
    public static int field7437;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "I")
    public static int field7441;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z)V")
    public static final void method3740(boolean arg0) {
        try {
            field7441++;
            if (!class658.field9412) {
                class794.field11604 = arg0;
                class636.field9130 += (-class636.field9130 - 24.0F) / 2.0F;
                class658.field9412 = true;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field7442[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V")
    public static void method3741(int arg0) {
        try {
            field7438 = null;
            if (arg0 != 4) {
                field7438 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field7442[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(II)V")
    public class495(int arg0, int arg1) {
        try {
            this.field7436 = new float[arg0 * arg1];
            this.field7440 = arg1;
            this.field7439 = arg0;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7442[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qe", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3742(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x68);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qe", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3743(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 123;
                    break;
                case 1:
                    var10005 = 120;
                    break;
                case 2:
                    var10005 = 102;
                    break;
                case 3:
                    var10005 = 94;
                    break;
                default:
                    var10005 = 104;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
