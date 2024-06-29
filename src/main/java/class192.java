import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class192 extends class4 {

    @OriginalMember(owner = "client!vc", name = "kb", descriptor = "I")
    private int field3783 = 0;

    @OriginalMember(owner = "client!vc", name = "rb", descriptor = "Z")
    public boolean field3790 = false;

    @OriginalMember(owner = "client!vc", name = "sb", descriptor = "I")
    private int field3791 = 0;

    @OriginalMember(owner = "client!vc", name = "vb", descriptor = "I")
    public int field3794;

    @OriginalMember(owner = "client!vc", name = "ub", descriptor = "I")
    public int field3793;

    @OriginalMember(owner = "client!vc", name = "lb", descriptor = "I")
    public int field3784;

    @OriginalMember(owner = "client!vc", name = "qb", descriptor = "I")
    private int field3789;

    @OriginalMember(owner = "client!vc", name = "jb", descriptor = "I")
    public int field3782;

    @OriginalMember(owner = "client!vc", name = "tb", descriptor = "I")
    public int field3792;

    @OriginalMember(owner = "client!vc", name = "wb", descriptor = "Ltc;")
    private class174 field3795;

    @OriginalMember(owner = "client!vc", name = "pb", descriptor = "I")
    public static int field3788 = 0;

    @OriginalMember(owner = "client!vc", name = "ob", descriptor = "Lua;")
    public static class181 field3787 = new class181(64);

    @OriginalMember(owner = "client!vc", name = "xb", descriptor = "Lsa;")
    public static class163 field3796 = new class163(32);

    @OriginalMember(owner = "client!vc", name = "zb", descriptor = "[I")
    public static int[] field3798 = new int[5];

    @OriginalMember(owner = "client!vc", name = "yb", descriptor = "Lsg;")
    public static class169 field3797 = class165.method1060("Suche nach Updates )2 ", 1536);

    @OriginalMember(owner = "client!vc", name = "Bb", descriptor = "[I")
    public static int[] field3800 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!vc", name = "Cb", descriptor = "[I")
    public static int[] field3801 = new int[200];

    @OriginalMember(owner = "client!vc", name = "Ab", descriptor = "Lsg;")
    public static class169 field3799 = class165.method1060(" loggt sich aus)3", 1536);

    @OriginalMember(owner = "client!vc", name = "Db", descriptor = "[S")
    public static short[] field3802 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!vc", name = "mb", descriptor = "I")
    public static int field3785;

    @OriginalMember(owner = "client!vc", name = "nb", descriptor = "I")
    public static int field3786;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "(I)Lcd;")
    public final class24 method30(int arg0) {
        field3786++;
        class76 var2 = class45.method286((byte) 127, this.field3789);
        class24 var3;
        if (this.field3790) {
            var3 = var2.method467(-1, 17423);
        } else {
            var3 = var2.method467(this.field3783, 17423);
        }
        int var4 = 114 % ((arg0 - 48) / 49);
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(II)V")
    public final void method1272(int arg0, int arg1) {
        if (arg1 != 0) {
            field3802 = null;
        }
        field3785++;
        if (this.field3790) {
            return;
        }
        this.field3791 += arg0;
        while (this.field3791 > this.field3795.field3384[this.field3783]) {
            this.field3791 -= this.field3795.field3384[this.field3783];
            this.field3783++;
            if (this.field3783 >= this.field3795.field3379.length) {
                this.field3790 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "(I)V")
    public static void method1273(int arg0) {
        if (arg0 != 0) {
            method1273(41);
        }
        field3797 = null;
        field3787 = null;
        field3800 = null;
        field3802 = null;
        field3796 = null;
        field3801 = null;
        field3798 = null;
        field3799 = null;
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(IIIIIII)V")
    public class192(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field3794 = arg4;
        this.field3793 = arg3;
        this.field3784 = arg5 + arg6;
        this.field3789 = arg0;
        this.field3782 = arg2;
        this.field3792 = arg1;
        int var8 = class45.method286((byte) 127, this.field3789).field1433;
        if (var8 == -1) {
            this.field3790 = true;
        } else {
            this.field3790 = false;
            this.field3795 = class159.method1021((byte) 48, var8);
        }
    }
}
