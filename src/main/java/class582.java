import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class582 {

    @OriginalMember(owner = "client!fs", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8382 = new String[] { method4273(method4272("R\u0007Zn;")), method4273(method4272("Z\u0001\u0018@")), method4273(method4272("R\u0007Zm;")), method4273(method4272("OZZ\u0002n")) };

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "I")
    public static int field8380 = 1;

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "Lvn;")
    public static class330 field8377 = new class330(45, 3);

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "I")
    public static int field8381 = 0;

    @OriginalMember(owner = "client!fs", name = "d", descriptor = "I")
    public static int field8378;

    @OriginalMember(owner = "client!fs", name = "e", descriptor = "I")
    public static int field8379;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(I)V")
    public static void method4270(int arg0) {
        try {
            field8377 = null;
            if (arg0 != 3) {
                field8381 = 76;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field8382[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(Ljava/io/File;I)[B")
    public static final byte[] method4271(File arg0, int arg1) {
        try {
            field8379++;
            if (arg1 != 0) {
                method4271(null, -61);
            }
            return class617.method4504((int) arg0.length(), (byte) -113, arg0);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field8382[2] + (arg0 == null ? field8382[1] : field8382[3]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fs", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4272(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x13);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!fs", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4273(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 52;
                    break;
                case 1:
                    var10005 = 116;
                    break;
                case 2:
                    var10005 = 116;
                    break;
                case 3:
                    var10005 = 44;
                    break;
                default:
                    var10005 = 19;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
