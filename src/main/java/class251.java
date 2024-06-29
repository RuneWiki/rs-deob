import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class251 extends class82 {

    @OriginalMember(owner = "client!qf", name = "A", descriptor = "I")
    public int field3822;

    @OriginalMember(owner = "client!qf", name = "v", descriptor = "Ljava/lang/String;")
    public static String field3817 = "Use";

    @OriginalMember(owner = "client!qf", name = "y", descriptor = "Ljava/lang/String;")
    public static String field3820 = "";

    @OriginalMember(owner = "client!qf", name = "B", descriptor = "Ljava/lang/String;")
    public static String field3823 = "skill: ";

    @OriginalMember(owner = "client!qf", name = "D", descriptor = "[[I")
    public static int[][] field3825 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!qf", name = "q", descriptor = "I")
    public static int field3812;

    @OriginalMember(owner = "client!qf", name = "r", descriptor = "I")
    public static int field3813;

    @OriginalMember(owner = "client!qf", name = "t", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!qf", name = "w", descriptor = "I")
    public static int field3818;

    @OriginalMember(owner = "client!qf", name = "x", descriptor = "I")
    public static int field3819;

    @OriginalMember(owner = "client!qf", name = "z", descriptor = "I")
    public static int field3821;

    @OriginalMember(owner = "client!qf", name = "C", descriptor = "I")
    public static int field3824;

    @OriginalMember(owner = "client!qf", name = "E", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!qf", name = "s", descriptor = "Lrf;")
    public static class289 field3814;

    @OriginalMember(owner = "client!qf", name = "u", descriptor = "[[[Lgk;")
    public static class159[][][] field3816;

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "(I)V")
    public static final void method1646(int arg0) {
        for (int var1 = -1; var1 < class141.field2069; var1++) {
            int var5;
            if (var1 == -1) {
                var5 = 2047;
            } else {
                var5 = class58.field918[var1];
            }
            class107 var6 = class96.field1521[var5];
            if (var6 != null && var6.field2255 > 0) {
                var6.field2255--;
                if (var6.field2255 == 0) {
                    var6.field2254 = null;
                }
            }
        }
        field3824++;
        for (int var2 = 0; var2 < class24.field295; var2++) {
            int var3 = class169.field2586[var2];
            class61 var4 = class18.field220[var3];
            if (var4 != null && var4.field2255 > 0) {
                var4.field2255--;
                if (var4.field2255 == 0) {
                    var4.field2254 = null;
                }
            }
        }
        if (arg0 != 1) {
            field3825 = null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)V")
    public static final void method1647(int arg0, int arg1) {
        class246.field3680 = 1000 / arg0;
        if (arg1 != 10) {
            method1651(-107, (String) null, (String) null, -23, (String) null);
        }
        field3813++;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ljava/lang/String;II)V")
    public static final void method1648(String arg0, int arg1, int arg2) {
        int var3 = 46 % ((arg2 - 42) / 44);
        field3815++;
        class187 var4 = class120.method762((byte) 33, 2, arg1);
        var4.method1167(-119);
        var4.field2835 = arg0;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(BIII)I")
    public static final int method1649(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 45) {
            method1651(45, (String) null, (String) null, 119, (String) null);
        }
        field3821++;
        if ((class221.field3333[arg3][arg1][arg2] & 0x8) == 0) {
            return arg3 <= 0 || (class221.field3333[1][arg1][arg2] & 0x2) == 0 ? arg3 : arg3 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IZ)V")
    public static final void method1650(int arg0, boolean arg1) {
        class81.field1297.method1780(arg0, arg1);
        field3826++;
        if (!arg1) {
            field3814 = null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
    public static final void method1651(int arg0, String arg1, String arg2, int arg3, String arg4) {
        class1.method1(0, arg4, arg1, arg2, arg0, -1);
        if (arg3 != -1488) {
            field3825 = null;
        }
        field3812++;
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "()V")
    public class251() {
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(I)V")
    public class251(int arg0) {
        this.field3822 = arg0;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Z)V")
    public static void method1652(boolean arg0) {
        field3817 = null;
        field3825 = null;
        field3816 = null;
        if (!arg0) {
            field3820 = null;
        }
        field3823 = null;
        field3820 = null;
        field3814 = null;
    }
}
