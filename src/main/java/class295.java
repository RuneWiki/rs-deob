import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uea")
public class class295 extends class263 {

    @OriginalMember(owner = "client!uea", name = "k", descriptor = "Z")
    public boolean field3743;

    @OriginalMember(owner = "client!uea", name = "j", descriptor = "I")
    public int field3742;

    @OriginalMember(owner = "client!uea", name = "h", descriptor = "I")
    public int field3740;

    @OriginalMember(owner = "client!uea", name = "l", descriptor = "I")
    public int field3744;

    @OriginalMember(owner = "client!uea", name = "g", descriptor = "I")
    public int field3739;

    @OriginalMember(owner = "client!uea", name = "m", descriptor = "I")
    public int field3745;

    @OriginalMember(owner = "client!uea", name = "i", descriptor = "I")
    public static int field3741 = 0;

    @OriginalMember(owner = "client!uea", name = "n", descriptor = "Lcf;")
    public static class566 field3746 = new class566(14, 1);

    @OriginalMember(owner = "client!uea", name = "o", descriptor = "Lcf;")
    public static class566 field3747 = new class566(15, 4);

    @OriginalMember(owner = "client!uea", name = "p", descriptor = "Lcf;")
    public static class566 field3748 = new class566(16, -2);

    @OriginalMember(owner = "client!uea", name = "q", descriptor = "Lcf;")
    public static class566 field3749 = new class566(17, 0);

    @OriginalMember(owner = "client!uea", name = "r", descriptor = "Lcf;")
    public static class566 field3750 = new class566(18, -2);

    @OriginalMember(owner = "client!uea", name = "s", descriptor = "Lcf;")
    public static class566 field3751 = new class566(19, -2);

    @OriginalMember(owner = "client!uea", name = "t", descriptor = "Lcf;")
    public static class566 field3752 = new class566(20, 6);

    @OriginalMember(owner = "client!uea", name = "u", descriptor = "Lcf;")
    public static class566 field3753 = new class566(21, 9);

    @OriginalMember(owner = "client!uea", name = "v", descriptor = "Lcf;")
    public static class566 field3754 = new class566(22, -2);

    @OriginalMember(owner = "client!uea", name = "w", descriptor = "Lcf;")
    public static class566 field3755 = new class566(23, 4);

    @OriginalMember(owner = "client!uea", name = "x", descriptor = "Lcf;")
    public static class566 field3756 = new class566(24, -1);

    @OriginalMember(owner = "client!uea", name = "y", descriptor = "Lcf;")
    public static class566 field3757 = new class566(25, -2);

    @OriginalMember(owner = "client!uea", name = "z", descriptor = "Lcf;")
    public static class566 field3758 = new class566(26, 0);

    @OriginalMember(owner = "client!uea", name = "A", descriptor = "Lcf;")
    public static class566 field3759 = new class566(27, 0);

    @OriginalMember(owner = "client!uea", name = "B", descriptor = "[Lcf;")
    private static class566[] field3760 = new class566[32];

    @OriginalMember(owner = "client!uea", name = "D", descriptor = "Z")
    public static boolean field3762;

    @OriginalMember(owner = "client!uea", name = "C", descriptor = "Llh;")
    public static class492 field3761;

    @OriginalMember(owner = "client!uea", name = "E", descriptor = "I")
    public static int field3763;

    static {
        class566[] var0 = class117.method794(-101);
        for (int var1 = 0; var1 < var0.length; var1++) {
            field3760[var0[var1].field7095] = var0[var1];
        }
        field3762 = false;
        field3761 = new class492("WTWIP", 3);
        field3763 = -1;
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(I)V", line = 3)
    public static void method1777(int arg0) {
        field3747 = null;
        field3756 = null;
        field3752 = null;
        field3748 = null;
        field3757 = null;
        if (arg0 != 18946) {
            field3741 = -103;
        }
        field3754 = null;
        field3761 = null;
        field3760 = null;
        field3758 = null;
        field3751 = null;
        field3750 = null;
        field3755 = null;
        field3749 = null;
        field3753 = null;
        field3746 = null;
        field3759 = null;
    }

    @OriginalMember(owner = "client!uea", name = "<init>", descriptor = "(IIIIIZ)V", line = 39)
    public class295(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field3743 = arg5;
        this.field3742 = arg1;
        this.field3740 = arg3;
        this.field3744 = arg2;
        this.field3739 = arg0;
        this.field3745 = arg4;
    }
}
