import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public class class246 {

    @OriginalMember(owner = "client!uv", name = "d", descriptor = "[I")
    public static int[] field3796 = new int[32];

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "Lbj;")
    public static class162 field3794 = new class162(74, 3);

    @OriginalMember(owner = "client!uv", name = "e", descriptor = "Ls;")
    public static class186 field3797 = new class186(66, -1);

    @OriginalMember(owner = "client!uv", name = "f", descriptor = "Los;")
    public static class309 field3798 = new class309("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");

    @OriginalMember(owner = "client!uv", name = "g", descriptor = "[I")
    public static int[] field3799 = new int[99];

    @OriginalMember(owner = "client!uv", name = "h", descriptor = "[Lso;")
    public static class331[] field3800;

    @OriginalMember(owner = "client!uv", name = "i", descriptor = "[I")
    public static int[] field3801;

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "I")
    public static int field3793;

    @OriginalMember(owner = "client!uv", name = "c", descriptor = "I")
    public static int field3795;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field3799[var1] = var0 / 4;
        }
        field3800 = new class331[30];
        field3801 = new int[4096];
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(I)V", line = 15)
    public static void method1595(int arg0) {
        field3794 = null;
        field3801 = null;
        field3797 = null;
        field3800 = null;
        if (arg0 != 1) {
            method1595(-58);
        }
        field3796 = null;
        field3798 = null;
        field3799 = null;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(IIIII)V", line = 32)
    public static final void method1596(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class61.field1262 == 1) {
            class494.field7240[class108.field1991 / 100].method159(class68.field1381 - 8, class491.field7198 + -8);
        }
        if (arg1 != 100) {
            method1595(73);
        }
        field3793++;
        if (class61.field1262 == 2) {
            class494.field7240[class108.field1991 / 100 + 4].method159(class68.field1381 - 8, class491.field7198 + -8);
        }
        class146.method1083((byte) 127);
    }
}
