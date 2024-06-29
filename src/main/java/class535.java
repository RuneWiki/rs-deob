import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class535 {

    @OriginalMember(owner = "client!ek", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7856 = new String[] { method3993(method3992("W\u0001:=\u0007")), method3993(method3992("BZx\u007f")), method3993(method3992("ID:PR")), method3993(method3992("ID:QR")), method3993(method3992("ID:WR")), method3993(method3992("ID:RR")) };

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "Lvn;")
    public static class330 field7851 = new class330(10, -1);

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "I")
    public static int field7852 = 0;

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "Z")
    public static boolean field7853 = false;

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "I")
    public static int field7849;

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "I")
    public static int field7850;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "I")
    public static int field7854;

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "I")
    public static int field7855;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIIII)V")
    public static final void method3988(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            field7855++;
            int var6 = class694.method5039(class478.field7264, class310.field5088, 0, arg4);
            int var7 = class694.method5039(class478.field7264, class310.field5088, 0, arg5);
            if (arg3 != 10) {
                method3991(-94);
            }
            int var8 = class694.method5039(class779.field11374, class546.field8030, 0, arg1);
            int var9 = class694.method5039(class779.field11374, class546.field8030, 0, arg0);
            for (int var10 = var6; var10 <= var7; var10++) {
                class545.method4051(var8, arg2, var9, class193.field3047[var10], -113);
            }
        } catch (RuntimeException var12) {
            throw class590.method4333(var12, field7856[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(CBI)I")
    public static final int method3989(char arg0, byte arg1, int arg2) {
        try {
            if (arg1 != 70) {
                return 15;
            }
            field7850++;
            int var3 = arg0 << 4;
            if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
                char var6 = Character.toLowerCase(arg0);
                var3 = (var6 << 4) + 1;
            }
            return var3;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field7856[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Leg;ZB)V")
    public static final void method3990(class114 arg0, boolean arg1, byte arg2) {
        try {
            int var3 = -38 / ((-arg2 - 74) / 32);
            class254.field3874.method5702((byte) 105, arg0);
            field7849++;
            if (arg1) {
                class310.method2663(arg0, class289.field4651, class345.field5607, (byte) 85, class551.field8080, class254.field3874);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field7856[2] + (arg0 == null ? field7856[1] : field7856[0]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V")
    public static void method3991(int arg0) {
        try {
            field7851 = null;
            int var1 = -105 / ((-arg0 - 51) / 51);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7856[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ek", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3992(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ek", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3993(char[] arg0) {
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
                    var10005 = 47;
                    break;
                case 2:
                    var10005 = 20;
                    break;
                case 3:
                    var10005 = 19;
                    break;
                default:
                    var10005 = 122;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
