import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class class503 {

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "Z")
    public static boolean field7375;

    @OriginalMember(owner = "client!dr", name = "g", descriptor = "I")
    public static int field7379;

    @OriginalMember(owner = "client!dr", name = "f", descriptor = "[[I")
    public static int[][] field7378;

    @OriginalMember(owner = "client!dr", name = "h", descriptor = "I")
    public static int field7380;

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "I")
    public static int field7373;

    @OriginalMember(owner = "client!dr", name = "d", descriptor = "I")
    public static int field7376;

    @OriginalMember(owner = "client!dr", name = "e", descriptor = "I")
    public static int field7377;

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "Lvb;")
    public static class130 field7374;

    static {
        new class180("You are not currently in a clan channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes pas dans un canal de clan.", "No momento você não está em um canal de clã.");
        field7375 = false;
        field7379 = 2;
        field7378 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };
        field7380 = 0;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(I[B)[B", line = 4)
    public static final byte[] method2990(int arg0, byte[] arg1) {
        field7376++;
        if (arg1 == null) {
            return null;
        }
        byte[] var2 = new byte[arg1.length];
        class486.method2905(arg1, 0, var2, 0, arg1.length);
        if (arg0 != -25936) {
            field7380 = 33;
        }
        return var2;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIZ)I", line = 30)
    public static final int method2991(int arg0, int arg1, boolean arg2) {
        field7377++;
        int var3 = class152.method1100(arg0 - 1, arg1 + -1, true) - (-class152.method1100(arg0 + 1, arg1 + -1, true) - (class152.method1100(arg0 - 1, arg1 + 1, true) + class152.method1100(arg0 + 1, arg1 + 1, !arg2)));
        int var4 = class152.method1100(arg0 - 1, arg1, true) + class152.method1100(arg0 + 1, arg1, true) + class152.method1100(arg0, arg1 + -1, true) + class152.method1100(arg0, arg1 + 1, true);
        if (arg2) {
            method2992(32);
        }
        int var5 = class152.method1100(arg0, arg1, true);
        return var5 / 4 + (var3 / 16 + (var4 / 8));
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(I)V", line = 54)
    public static void method2992(int arg0) {
        field7374 = null;
        field7378 = null;
        if (arg0 != 11) {
            field7379 = -115;
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIB)Z", line = 65)
    public static final boolean method2993(int arg0, int arg1, byte arg2) {
        field7373++;
        if (arg2 != -9) {
            field7378 = null;
        }
        return (class145.method1041(arg0, (byte) 108, arg1) | (arg1 & 0x2000) != 0 | class213.method1416(16555, arg1, arg0)) & class256.method1624(arg0, arg1, 2);
    }
}
