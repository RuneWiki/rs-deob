import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public class class509 {

    @OriginalMember(owner = "client!ss", name = "e", descriptor = "B")
    public byte field7062;

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "S")
    public short field7059;

    @OriginalMember(owner = "client!ss", name = "d", descriptor = "B")
    public byte field7061;

    @OriginalMember(owner = "client!ss", name = "c", descriptor = "Lbia;")
    public class411 field7060;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "[I")
    public static int[] field7058 = new int[128];

    @OriginalMember(owner = "client!ss", name = "i", descriptor = "Luv;")
    public static class755 field7066;

    @OriginalMember(owner = "client!ss", name = "h", descriptor = "Z")
    public static boolean field7065;

    @OriginalMember(owner = "client!ss", name = "f", descriptor = "I")
    public static int field7063;

    @OriginalMember(owner = "client!ss", name = "g", descriptor = "I")
    public static int field7064;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Z)V")
    public static void method3051(boolean arg0) {
        field7066 = null;
        field7058 = null;
        if (!arg0) {
            field7066 = null;
        }
    }

    @OriginalMember(owner = "client!ss", name = "<init>", descriptor = "(Lbia;III)V")
    public class509(class411 arg0, int arg1, int arg2, int arg3) {
        this.field7062 = (byte) arg3;
        this.field7059 = (short) arg1;
        this.field7061 = (byte) arg2;
        this.field7060 = arg0;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(IIBI)Z")
    public static final boolean method3052(int arg0, int arg1, byte arg2, int arg3) {
        class474.field6574.method881(arg0, arg1, arg3, class563.field7811);
        field7064++;
        int var4 = class563.field7811[2];
        if (var4 < 50) {
            return false;
        }
        class563.field7811[1] = class563.field7811[1] * class698.field9746 / var4 + class626.field8423;
        class563.field7811[2] = var4;
        class563.field7811[0] = class563.field7811[0] * class68.field1051 / var4 + class338.field4751;
        int var5 = -24 % ((arg2 + 15) / 56);
        return true;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Luu;I)V")
    public static final void method3053(class237 arg0, int arg1) {
        field7063++;
        if (arg1 != 26) {
            method3053(null, 35);
        }
        class686.field9533 = arg0;
    }

    static {
        for (int var0 = 0; var0 < field7058.length; var0++) {
            field7058[var0] = -1;
        }
        for (int var1 = 65; var1 <= 90; var1++) {
            field7058[var1] = var1 - 65;
        }
        for (int var2 = 97; var2 <= 122; var2++) {
            field7058[var2] = var2 + 26 - 97;
        }
        for (int var3 = 48; var3 <= 57; var3++) {
            field7058[var3] = var3 + 52 - 48;
        }
        field7058[42] = field7058[43] = 62;
        field7058[45] = field7058[47] = 63;
        field7066 = null;
        field7065 = false;
    }
}
