import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class14 {

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "Lba;")
    private class12 field244 = new class12();

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "[I")
    public static int[] field243 = new int[2048];

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
    public static int field242 = 0;

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "Lkb;")
    public static class93 field245 = class76.method390("logo", 0);

    @OriginalMember(owner = "client!bc", name = "n", descriptor = "Lkb;")
    public static class93 field253 = class76.method390(" <col=00ff80>", 0);

    @OriginalMember(owner = "client!bc", name = "k", descriptor = "I")
    public static int field250 = 0;

    @OriginalMember(owner = "client!bc", name = "l", descriptor = "Lkb;")
    public static class93 field251 = class76.method390("jlv", 0);

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
    public static int field240;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
    public static int field241;

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "I")
    public static int field247;

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "I")
    public static int field248;

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "I")
    public static int field249;

    @OriginalMember(owner = "client!bc", name = "m", descriptor = "I")
    public static int field252;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Ljg;ZLjg;ILef;)V")
    public static final void method77(class89 arg0, boolean arg1, class89 arg2, int arg3, class45 arg4) {
        class43.field709 = arg1;
        if (arg3 != -23150) {
            method83(-35);
        }
        class41.field683 = arg0;
        class89.field1649 = arg2;
        field247++;
        class157.field3114 = class41.field683.method456(10, -56);
        class9.field144 = arg4;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)Lba;")
    public final class12 method78(int arg0) {
        field240++;
        class12 var2 = this.field244.field197;
        if (arg0 <= 73) {
            field242 = -102;
        }
        return this.field244 == var2 ? null : var2;
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)V")
    public static final void method79(int arg0) {
        class165.field3262 = new class122();
        if (arg0 != 10) {
            field242 = 46;
        }
        field241++;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lba;Z)V")
    public final void method80(class12 arg0, boolean arg1) {
        field246++;
        if (arg0.field202 != null) {
            arg0.method60((byte) -93);
        }
        arg0.field202 = this.field244;
        if (arg1) {
            arg0.field197 = this.field244.field197;
            arg0.field202.field197 = arg0;
            arg0.field197.field202 = arg0;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILba;)V")
    public final void method81(int arg0, class12 arg1) {
        field252++;
        if (arg1.field202 != null) {
            arg1.method60((byte) -93);
        }
        if (arg0 < 53) {
            this.method80(null, true);
        }
        arg1.field197 = this.field244;
        arg1.field202 = this.field244.field202;
        arg1.field202.field197 = arg1;
        arg1.field197.field202 = arg1;
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(I)Lba;")
    public final class12 method82(int arg0) {
        field249++;
        class12 var2 = this.field244.field197;
        if (this.field244 == var2) {
            return null;
        }
        var2.method60((byte) -93);
        if (arg0 != 2048) {
            field251 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "(I)V")
    public static void method83(int arg0) {
        int var1 = 60 % ((-arg0 - 58) / 59);
        field243 = null;
        field253 = null;
        field245 = null;
        field251 = null;
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "()V")
    public class14() {
        this.field244.field197 = this.field244;
        this.field244.field202 = this.field244;
    }
}
