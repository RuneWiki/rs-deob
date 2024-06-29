import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class236 extends class224 {

    @OriginalMember(owner = "client!mo", name = "J", descriptor = "I")
    public static int field3097 = 0;

    @OriginalMember(owner = "client!mo", name = "P", descriptor = "Z")
    public static boolean field3103;

    @OriginalMember(owner = "client!mo", name = "Q", descriptor = "I")
    public static int field3104;

    @OriginalMember(owner = "client!mo", name = "K", descriptor = "I")
    public static int field3098;

    @OriginalMember(owner = "client!mo", name = "L", descriptor = "I")
    public static int field3099;

    @OriginalMember(owner = "client!mo", name = "O", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!mo", name = "M", descriptor = "Lwo;")
    public static class285 field3100;

    @OriginalMember(owner = "client!mo", name = "N", descriptor = "Lfa;")
    public static class347 field3101;

    static {
        new class72("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
        field3103 = false;
        field3104 = 0;
    }

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "(II)V", line = 6)
    public static final void method1516(int arg0, int arg1) {
        field3098++;
        class219.field2706 = new class365(arg0);
        int var2 = 20 % ((arg1 - 39) / 54);
    }

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "(I)V", line = 21)
    public static void method1517(int arg0) {
        field3101 = null;
        field3100 = null;
        if (arg0 != 0) {
            field3101 = null;
        }
    }

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "(II)Log;", line = 35)
    public static final class66 method1518(int arg0, int arg1) {
        field3099++;
        class66 var2 = (class66) class225.field2845.method2295((long) arg0, (byte) 74);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class430.field5871.method1794(arg1 + 5826, arg1, arg0);
        class66 var4 = new class66();
        if (var3 != null) {
            var4.method386(-71, new class242(var3), arg0);
        }
        class225.field2845.method2294(var4, (byte) 48, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!mo", name = "e", descriptor = "(II)I", line = 58)
    public static final int method1519(int arg0, int arg1) {
        if (arg1 != 128) {
            method1517(-19);
        }
        field3102++;
        int var2 = arg0 & 0x3F;
        int var3 = arg0 >> 6 & 0x3;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }
}
