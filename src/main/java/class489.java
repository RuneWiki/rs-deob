import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eba")
public class class489 extends class687 {

    @OriginalMember(owner = "client!eba", name = "w", descriptor = "Lqha;")
    public class747 field7165;

    @OriginalMember(owner = "client!eba", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7169 = new String[] { method3767(method3766("F;%I-J7-\u0013/\u000b")), method3767(method3766("M,(\u000b")), method3767(method3766("XwjIl")), method3767(method3766("F;%IR\u000b")), method3767(method3766("F;%IS\u000b")), method3767(method3766("F;%IP\u000b")) };

    @OriginalMember(owner = "client!eba", name = "x", descriptor = "[F")
    public static float[] field7166 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!eba", name = "v", descriptor = "Lsb;")
    public static class261 field7163 = new class261(54, 8);

    @OriginalMember(owner = "client!eba", name = "y", descriptor = "I")
    public static int field7164;

    @OriginalMember(owner = "client!eba", name = "t", descriptor = "I")
    public static int field7168;

    @OriginalMember(owner = "client!eba", name = "u", descriptor = "Llga;")
    public static class47 field7167;

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(I)V", line = 6)
    public static void method3763(int arg0) {
        try {
            if (arg0 != -1) {
                field7167 = null;
            }
            field7167 = null;
            field7163 = null;
            field7166 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field7169[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eba", name = "g", descriptor = "(I)V", line = 18)
    public static final void method3764(int arg0) {
        try {
            field7164++;
            class483.field7103 = null;
            class232.field3348 = -1;
            if (arg0 != -15640) {
                method3764(-82);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field7169[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(II)V", line = 31)
    public static final void method3765(int arg0, int arg1) {
        try {
            field7168++;
            class294 var2 = class146.method1261((long) arg1, -40, arg0);
            var2.method2376(-1);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field7169[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!eba", name = "<init>", descriptor = "(Lqha;)V", line = 40)
    public class489(class747 arg0) {
        try {
            this.field7165 = arg0;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field7169[0] + (arg0 == null ? field7169[1] : field7169[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!eba", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3766(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x11);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!eba", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3767(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 35;
                    break;
                case 1:
                    var10005 = 89;
                    break;
                case 2:
                    var10005 = 68;
                    break;
                case 3:
                    var10005 = 103;
                    break;
                default:
                    var10005 = 17;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
