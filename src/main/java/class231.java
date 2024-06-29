import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class231 {

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "I")
    public int field3190 = -1;

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "Lsd;")
    public static class74 field3191;

    @OriginalMember(owner = "client!wi", name = "m", descriptor = "Lsd;")
    public static class74 field3200;

    @OriginalMember(owner = "client!wi", name = "s", descriptor = "I")
    public static int field3206;

    @OriginalMember(owner = "client!wi", name = "t", descriptor = "I")
    public static int field3207;

    @OriginalMember(owner = "client!wi", name = "u", descriptor = "Z")
    public static boolean field3208;

    @OriginalMember(owner = "client!wi", name = "x", descriptor = "Z")
    public static boolean field3211;

    @OriginalMember(owner = "client!wi", name = "w", descriptor = "[Lhu;")
    public static class207[] field3210;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "I")
    public int field3188;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "I")
    public int field3189;

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "I")
    public int field3192;

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "I")
    public int field3193;

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "I")
    public int field3194;

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "I")
    public int field3195;

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "I")
    public int field3196;

    @OriginalMember(owner = "client!wi", name = "k", descriptor = "I")
    public int field3198;

    @OriginalMember(owner = "client!wi", name = "l", descriptor = "I")
    public static int field3199;

    @OriginalMember(owner = "client!wi", name = "n", descriptor = "I")
    public int field3201;

    @OriginalMember(owner = "client!wi", name = "o", descriptor = "I")
    public int field3202;

    @OriginalMember(owner = "client!wi", name = "p", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "client!wi", name = "q", descriptor = "I")
    public static int field3204;

    @OriginalMember(owner = "client!wi", name = "v", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!wi", name = "r", descriptor = "Loj;")
    public static class280 field3205;

    @OriginalMember(owner = "client!wi", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field3197;

    static {
        new class40("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
        field3191 = new class74(10, 3);
        field3200 = new class74(64, -2);
        field3206 = -1;
        field3207 = -60;
        field3208 = false;
        field3211 = true;
        field3210 = new class207[14];
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I[B)[B", line = 3)
    public static final byte[] method1275(int arg0, byte[] arg1) {
        field3203++;
        int var2 = arg1.length;
        byte[] var3 = new byte[var2];
        class268.method1625(arg1, 0, var3, 0, var2);
        if (arg0 >= -61) {
            field3206 = -80;
        }
        return var3;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(III)Lil;", line = 20)
    public static final class287 method1276(int arg0, int arg1, int arg2) {
        class263 var3 = class293.field4356[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class287 var4 = var3.field3787;
            var3.field3787 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V", line = 36)
    public static void method1277(int arg0) {
        field3210 = null;
        field3205 = null;
        field3197 = null;
        field3200 = null;
        if (arg0 >= -74) {
            field3204 = -87;
        }
        field3191 = null;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;)V", line = 68)
    public static final void method1278(int arg0, String arg1, int arg2, int arg3, String arg4, String arg5) {
        if (arg2 != -26526) {
            field3204 = 10;
        }
        class476.method2820(arg1, -1, arg5, arg0, arg3, (byte) -98, arg4, (String) null);
        field3199++;
    }
}
