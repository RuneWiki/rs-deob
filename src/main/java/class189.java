import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class189 extends class110 {

    @OriginalMember(owner = "client!v", name = "v", descriptor = "I")
    public int field3659;

    @OriginalMember(owner = "client!v", name = "x", descriptor = "I")
    private int field3661;

    @OriginalMember(owner = "client!v", name = "F", descriptor = "[Z")
    private boolean[] field3669;

    @OriginalMember(owner = "client!v", name = "A", descriptor = "[I")
    public int[] field3664;

    @OriginalMember(owner = "client!v", name = "B", descriptor = "[[I")
    public int[][] field3665;

    @OriginalMember(owner = "client!v", name = "s", descriptor = "Leh;")
    public static class47 field3656 = class195.method1282((byte) -4, "lila:");

    @OriginalMember(owner = "client!v", name = "t", descriptor = "Leh;")
    private static class47 field3657 = class195.method1282((byte) -4, " is already on your friend list)3");

    @OriginalMember(owner = "client!v", name = "u", descriptor = "Leh;")
    public static class47 field3658 = field3657;

    @OriginalMember(owner = "client!v", name = "G", descriptor = "Leh;")
    private static class47 field3670 = class195.method1282((byte) -4, "Loaded title screen");

    @OriginalMember(owner = "client!v", name = "z", descriptor = "Leh;")
    public static class47 field3663 = field3670;

    @OriginalMember(owner = "client!v", name = "y", descriptor = "[[I")
    public static int[][] field3662 = new int[104][104];

    @OriginalMember(owner = "client!v", name = "w", descriptor = "Lpa;")
    public static class136 field3660 = new class136(64);

    @OriginalMember(owner = "client!v", name = "I", descriptor = "Leh;")
    public static class47 field3672 = class195.method1282((byte) -4, "<img=1>");

    @OriginalMember(owner = "client!v", name = "K", descriptor = "Leh;")
    public static class47 field3674 = class195.method1282((byte) -4, "Das ist eine Mitglieder)2Welt(Q");

    @OriginalMember(owner = "client!v", name = "J", descriptor = "Leh;")
    private static class47 field3673 = class195.method1282((byte) -4, "Welcome to RuneScape");

    @OriginalMember(owner = "client!v", name = "L", descriptor = "Leh;")
    public static class47 field3675 = field3673;

    @OriginalMember(owner = "client!v", name = "C", descriptor = "I")
    public static int field3666;

    @OriginalMember(owner = "client!v", name = "E", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!v", name = "H", descriptor = "I")
    public static int field3671;

    @OriginalMember(owner = "client!v", name = "D", descriptor = "Lfd;")
    public static class52 field3667;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IB)V")
    public static final void method1245(int arg0, byte arg1) {
        int var2 = 16 % ((22 - arg1) / 42);
        field3666++;
        class20.field387 = -1;
        class9.field211 = 1;
        class3.field36 = -1;
        class86.field1848 = null;
        class86.field1841 = false;
        field3668 = 0;
        class148.field2893 = arg0;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIII)V")
    public static final void method1246(int arg0, int arg1, int arg2, int arg3) {
        class152 var4 = class173.field3351[arg0][arg1][arg2];
        if (var4 != null) {
            class173.field3351[arg0][arg1][arg2].field2995 = arg3;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(II)Z")
    public static final boolean method1247(int arg0, int arg1) {
        int var2 = 115 % ((2 - arg1) / 56);
        field3671++;
        return arg0 >= 48 && arg0 <= 57;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(Z)V")
    public static void method1248(boolean arg0) {
        field3658 = null;
        field3660 = null;
        field3673 = null;
        field3670 = null;
        field3657 = null;
        field3667 = null;
        field3674 = null;
        if (!arg0) {
            field3672 = null;
        }
        field3675 = null;
        field3663 = null;
        field3672 = null;
        field3662 = null;
        field3656 = null;
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(I[B)V")
    public class189(int arg0, byte[] arg1) {
        this.field3659 = arg0;
        class68 var3 = new class68(arg1);
        this.field3661 = var3.method604((byte) 6);
        this.field3669 = new boolean[this.field3661];
        this.field3664 = new int[this.field3661];
        this.field3665 = new int[this.field3661][];
        for (int var4 = 0; var4 < this.field3661; var4++) {
            this.field3664[var4] = var3.method604((byte) -25);
        }
        for (int var5 = 0; var5 < this.field3661; var5++) {
            this.field3669[var5] = var3.method604((byte) -127) == 1;
        }
        for (int var6 = 0; var6 < this.field3661; var6++) {
            this.field3665[var6] = new int[var3.method604((byte) -18)];
        }
        for (int var7 = 0; var7 < this.field3661; var7++) {
            for (int var8 = 0; var8 < this.field3665[var7].length; var8++) {
                this.field3665[var7][var8] = var3.method604((byte) 80);
            }
        }
    }
}
