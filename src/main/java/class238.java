import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public abstract class class238 extends class4 {

    @OriginalMember(owner = "client!d", name = "C", descriptor = "[I")
    public static int[] field3866 = new int[4096];

    @OriginalMember(owner = "client!d", name = "E", descriptor = "Ljava/lang/String;")
    public static String field3868 = null;

    @OriginalMember(owner = "client!d", name = "x", descriptor = "I")
    public static int field3861;

    @OriginalMember(owner = "client!d", name = "y", descriptor = "I")
    public int field3862;

    @OriginalMember(owner = "client!d", name = "A", descriptor = "I")
    public int field3864;

    @OriginalMember(owner = "client!d", name = "B", descriptor = "I")
    public static int field3865;

    @OriginalMember(owner = "client!d", name = "D", descriptor = "I")
    public int field3867;

    @OriginalMember(owner = "client!d", name = "F", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!d", name = "G", descriptor = "I")
    public int field3870;

    @OriginalMember(owner = "client!d", name = "H", descriptor = "I")
    public int field3871;

    @OriginalMember(owner = "client!d", name = "I", descriptor = "I")
    public static int field3872;

    @OriginalMember(owner = "client!d", name = "J", descriptor = "I")
    public int field3873;

    @OriginalMember(owner = "client!d", name = "z", descriptor = "[Lcb;")
    public static class243[] field3863;

    @OriginalMember(owner = "client!d", name = "f", descriptor = "(I)V")
    public static void method1651(int arg0) {
        field3868 = null;
        field3866 = null;
        if (arg0 != -12431) {
            field3872 = -52;
        }
        field3863 = null;
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(II)V")
    public abstract void method314(int arg0, int arg1);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIII)V")
    public abstract void method326(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIII)V")
    public final void method1652(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3861++;
        int var6 = this.field3867 << 3;
        if (arg0 >= -90) {
            this.method326(-64, 7, -28, -33, 29, 46);
        }
        int var7 = (arg2 << 4) + (var6 & 0xF);
        int var8 = this.field3871 << 3;
        int var9 = (arg4 << 4) + (var8 & 0xF);
        this.method326(var6, var8, var7, var9, arg1, arg3);
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(II)V")
    public abstract void method332(int arg0, int arg1);

    @OriginalMember(owner = "client!d", name = "d", descriptor = "(II)V")
    public abstract void method321(int arg0, int arg1);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(III)V")
    public abstract void method310(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(IIIII)V")
    public abstract void method320(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIII)V")
    public abstract void method327(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(III)I")
    public static final int method1653(int arg0, int arg1, int arg2) {
        class239 var3 = (class239) class214.field3502.method1400((long) arg0, true);
        field3865++;
        if (var3 == null) {
            return -1;
        } else if (arg1 >= ~arg2 && var3.field3880.length > arg2) {
            return var3.field3880[arg2];
        } else {
            return -1;
        }
    }
}
