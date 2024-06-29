import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ow")
public class class235 extends class519 {

    @OriginalMember(owner = "client!ow", name = "Mb", descriptor = "[I")
    public static int[] field3500 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!ow", name = "Nb", descriptor = "Z")
    public static boolean field3501 = false;

    @OriginalMember(owner = "client!ow", name = "Qb", descriptor = "I")
    public static int field3504 = 0;

    @OriginalMember(owner = "client!ow", name = "Ub", descriptor = "[B")
    public static byte[] field3508 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!ow", name = "Rb", descriptor = "Lbd;")
    public static class44 field3505 = new class44("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");

    @OriginalMember(owner = "client!ow", name = "Ob", descriptor = "I")
    public static int field3502;

    @OriginalMember(owner = "client!ow", name = "Sb", descriptor = "I")
    public static int field3506;

    @OriginalMember(owner = "client!ow", name = "Tb", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!ow", name = "Pb", descriptor = "Lwp;")
    public static class122 field3503;

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "([BIB)[B", line = 3)
    public static final byte[] method1557(byte[] arg0, int arg1, byte arg2) {
        ++field3502;
        byte[] var3 = new byte[arg1];
        if (arg2 >= -83) {
            return null;
        } else {
            class282.method1818(arg0, 0, var3, 0, arg1);
            return var3;
        }
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(BF)V", line = 23)
    public final void method1558(byte arg0, float arg1) {
        ++field3507;
        int var3 = NativeStream.floatToRawIntBits(arg1);
        super.field7545[super.field7558++] = (byte) (var3 >> 24);
        super.field7545[super.field7558++] = (byte) (var3 >> 16);
        super.field7545[super.field7558++] = (byte) (var3 >> 8);
        if (arg0 != 117) {
            method1560(-97);
        }
        super.field7545[super.field7558++] = (byte) var3;
    }

    @OriginalMember(owner = "client!ow", name = "<init>", descriptor = "(I)V", line = 43)
    public class235(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(IF)V", line = 49)
    public final void method1559(int arg0, float arg1) {
        ++field3506;
        int var3 = NativeStream.floatToRawIntBits(arg1);
        super.field7545[super.field7558++] = (byte) var3;
        if (arg0 <= -95) {
            super.field7545[super.field7558++] = (byte) (var3 >> 8);
            super.field7545[super.field7558++] = (byte) (var3 >> 16);
            super.field7545[super.field7558++] = (byte) (var3 >> 24);
        }
    }

    @OriginalMember(owner = "client!ow", name = "y", descriptor = "(I)V", line = 68)
    public static void method1560(int arg0) {
        field3500 = null;
        field3508 = null;
        field3503 = null;
        field3505 = null;
        int var1 = -30 % ((arg0 - 46) / 35);
    }
}
