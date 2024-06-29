import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class230 extends class171 {

    @OriginalMember(owner = "client!jm", name = "A", descriptor = "I")
    public int field3838;

    @OriginalMember(owner = "client!jm", name = "K", descriptor = "I")
    private int field3848;

    @OriginalMember(owner = "client!jm", name = "L", descriptor = "[[I")
    public int[][] field3849;

    @OriginalMember(owner = "client!jm", name = "N", descriptor = "[Z")
    public boolean[] field3851;

    @OriginalMember(owner = "client!jm", name = "G", descriptor = "[I")
    public int[] field3844;

    @OriginalMember(owner = "client!jm", name = "q", descriptor = "Lok;")
    public static class146 field3828 = class235.method1724(-12908, ")3");

    @OriginalMember(owner = "client!jm", name = "s", descriptor = "Lok;")
    private static class146 field3830 = class235.method1724(-12908, "Apr");

    @OriginalMember(owner = "client!jm", name = "v", descriptor = "Lok;")
    private static class146 field3833 = class235.method1724(-12908, "Sep");

    @OriginalMember(owner = "client!jm", name = "t", descriptor = "Lok;")
    private static class146 field3831 = class235.method1724(-12908, "Dec");

    @OriginalMember(owner = "client!jm", name = "D", descriptor = "Lok;")
    private static class146 field3841 = class235.method1724(-12908, "Aug");

    @OriginalMember(owner = "client!jm", name = "z", descriptor = "Lok;")
    private static class146 field3837 = class235.method1724(-12908, "Mar");

    @OriginalMember(owner = "client!jm", name = "w", descriptor = "Lok;")
    private static class146 field3834 = class235.method1724(-12908, "Jan");

    @OriginalMember(owner = "client!jm", name = "C", descriptor = "Lok;")
    private static class146 field3840 = class235.method1724(-12908, "May");

    @OriginalMember(owner = "client!jm", name = "I", descriptor = "Lok;")
    private static class146 field3846 = class235.method1724(-12908, "Oct");

    @OriginalMember(owner = "client!jm", name = "x", descriptor = "Lok;")
    private static class146 field3835 = class235.method1724(-12908, "Feb");

    @OriginalMember(owner = "client!jm", name = "M", descriptor = "Lok;")
    private static class146 field3850 = class235.method1724(-12908, "Jun");

    @OriginalMember(owner = "client!jm", name = "r", descriptor = "Lok;")
    private static class146 field3829 = class235.method1724(-12908, "Nov");

    @OriginalMember(owner = "client!jm", name = "y", descriptor = "Lok;")
    private static class146 field3836 = class235.method1724(-12908, "Jul");

    @OriginalMember(owner = "client!jm", name = "O", descriptor = "[Lok;")
    public static class146[] field3852 = new class146[] { field3834, field3835, field3837, field3830, field3840, field3850, field3836, field3841, field3833, field3846, field3829, field3831 };

    @OriginalMember(owner = "client!jm", name = "P", descriptor = "Lok;")
    private static class146 field3853 = class235.method1724(-12908, "Connecting to update server");

    @OriginalMember(owner = "client!jm", name = "u", descriptor = "Lok;")
    public static class146 field3832 = field3853;

    @OriginalMember(owner = "client!jm", name = "J", descriptor = "Lmg;")
    public static class151 field3847 = new class151();

    @OriginalMember(owner = "client!jm", name = "R", descriptor = "I")
    public static int field3854 = 0;

    @OriginalMember(owner = "client!jm", name = "B", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!jm", name = "H", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!jm", name = "E", descriptor = "[Lok;")
    public static class146[] field3842;

    @OriginalMember(owner = "client!jm", name = "F", descriptor = "[Ltg;")
    public static class307[] field3843;

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(B)V", line = 14)
    public static void method1687(byte arg0) {
        field3842 = null;
        field3846 = null;
        field3835 = null;
        field3836 = null;
        field3837 = null;
        field3833 = null;
        field3840 = null;
        field3832 = null;
        field3843 = null;
        field3829 = null;
        field3853 = null;
        field3850 = null;
        field3852 = null;
        field3847 = null;
        field3831 = null;
        if (arg0 >= -111) {
            field3846 = (class146) null;
        }
        field3830 = null;
        field3841 = null;
        field3834 = null;
        field3828 = null;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIILoh;)Z", line = 85)
    public static final boolean method1688(int arg0, int arg1, int arg2, class15 arg3) {
        field3839++;
        byte[] var4 = arg3.method92(arg0, 0, arg1);
        if (var4 == null) {
            return false;
        }
        class196.method1518(var4, (byte) 18);
        if (arg2 != 1221) {
            method1687((byte) 65);
        }
        return true;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Loh;BLoh;)V", line = 110)
    public static final void method1689(class15 arg0, byte arg1, class15 arg2) {
        class56.field998 = arg2;
        field3845++;
        class227.field3790 = arg0;
        if (arg1 != -49) {
            field3842 = (class146[]) null;
        }
    }

    @OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(I[B)V", line = 127)
    public class230(int arg0, byte[] arg1) {
        this.field3838 = arg0;
        class47 var3 = new class47(arg1);
        this.field3848 = var3.method368(-114);
        this.field3849 = new int[this.field3848][];
        this.field3851 = new boolean[this.field3848];
        this.field3844 = new int[this.field3848];
        for (int var4 = 0; var4 < this.field3848; var4++) {
            this.field3844[var4] = var3.method368(-128);
        }
        for (int var5 = 0; var5 < this.field3848; var5++) {
            this.field3851[var5] = var3.method368(74) == 1;
        }
        for (int var6 = 0; var6 < this.field3848; var6++) {
            this.field3849[var6] = new int[var3.method368(-110)];
        }
        for (int var7 = 0; var7 < this.field3848; var7++) {
            for (int var8 = 0; var8 < this.field3849[var7].length; var8++) {
                this.field3849[var7][var8] = var3.method368(49);
            }
        }
    }
}
