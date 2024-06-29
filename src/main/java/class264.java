import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jfa")
public class class264 {

    @OriginalMember(owner = "client!jfa", name = "d", descriptor = "J")
    public long field3865;

    @OriginalMember(owner = "client!jfa", name = "b", descriptor = "Lus;")
    private class1 field3863;

    @OriginalMember(owner = "client!jfa", name = "e", descriptor = "Lqfa;")
    public static class85 field3866 = new class85(57, -1);

    @OriginalMember(owner = "client!jfa", name = "f", descriptor = "I")
    public static int field3867 = 0;

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "I")
    public static int field3862;

    @OriginalMember(owner = "client!jfa", name = "c", descriptor = "I")
    public static int field3864;

    @OriginalMember(owner = "client!jfa", name = "g", descriptor = "[I")
    public static int[] field3868;

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(III)Lpc;")
    public static final class624 method1729(int arg0, int arg1, int arg2) {
        class370 var3 = class257.field3792[arg0][arg1][arg2];
        return var3 == null ? null : var3.field5491;
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(II)I")
    public static final int method1730(int arg0, int arg1) {
        field3862++;
        int var2 = arg1 >>> 1;
        int var3 = var2 | var2 >>> 1;
        if (arg0 < 63) {
            field3867 = -78;
        }
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return arg1 & ~var7;
    }

    @OriginalMember(owner = "client!jfa", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field3864++;
        this.field3863.method38(65280, this.field3865);
        super.finalize();
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(I)V")
    public static void method1731(int arg0) {
        field3866 = null;
        field3868 = null;
        if (arg0 != 1922904816) {
            method1731(78);
        }
    }

    @OriginalMember(owner = "client!jfa", name = "<init>", descriptor = "(Lus;JI)V")
    public class264(class1 arg0, long arg1, int arg2) {
        this.field3865 = arg1;
        this.field3863 = arg0;
    }
}
