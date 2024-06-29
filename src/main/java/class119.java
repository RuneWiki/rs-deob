import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class119 {

    @OriginalMember(owner = "client!qk", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1515 = new String[] { method1083(method1082("Eia9<")), method1083(method1082("Eia;<")), method1083(method1082("Eia8<")) };

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "[[F")
    public static float[][] field1513 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "Z")
    public static boolean field1512 = false;

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "F")
    public static float field1511;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "I")
    public static int field1509;

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "I")
    public static int field1510;

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V")
    public static final void method1079(int arg0) {
        try {
            if (arg0 != 1) {
                method1080(114);
            }
            field1514++;
            if (class129.field1608 == null || class412.field5931 == null) {
                class412.field5931 = new int[256];
                class129.field1608 = new int[256];
                for (int var1 = 0; var1 < 256; var1++) {
                    double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                    class129.field1608[var1] = (int) (Math.sin(var2) * 4096.0D);
                    class412.field5931[var1] = (int) (Math.cos(var2) * 4096.0D);
                }
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field1515[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)V")
    public static final void method1080(int arg0) {
        try {
            field1509++;
            if (!class319.field4359 && arg0 >= 106) {
                class292.field4112 += (-24.0F - class292.field4112) / 2.0F;
                class319.field4359 = true;
                class669.field9440 = true;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field1515[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Z)V")
    public static void method1081(boolean arg0) {
        try {
            if (arg0) {
                method1081(false);
            }
            field1513 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field1515[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qk", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1082(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x14);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qk", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1083(char[] arg0) {
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
                    var10005 = 2;
                    break;
                case 2:
                    var10005 = 79;
                    break;
                case 3:
                    var10005 = 122;
                    break;
                default:
                    var10005 = 20;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
