import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public abstract class class188 {

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
    public static int field3680 = 0;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "Lkb;")
    private static class93 field3679 = class76.method390("Login limit exceeded)3", 0);

    @OriginalMember(owner = "client!ug", name = "m", descriptor = "Lkb;")
    private static class93 field3687 = class76.method390("Ok", 0);

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "Lkb;")
    public static class93 field3675 = class76.method390("null", 0);

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "[Lkb;")
    public static class93[] field3684 = new class93[1000];

    @OriginalMember(owner = "client!ug", name = "l", descriptor = "Lkb;")
    public static class93 field3686 = class76.method390("null", 0);

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "Lkb;")
    public static class93 field3678 = field3679;

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "[I")
    public static int[] field3683 = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, -1, -2, 0, 0, 2, 0, 0, 0, 0, 0, 7, -2, 0, 0, 0, -1, 0, 15, 0, 0, 1, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 11, 0, 11, 0, 5, 0, 0, 0, 0, 4, 0, 6, 0, 0, 0, 0, 8, 0, 0, -1, 2, -2, 0, 0, 0, 0, 20, 0, 0, 5, 0, 10, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 2, 7, 0, 24, 0, 0, 0, 0, 7, 6, 0, 6, 0, 2, 0, 0, 4, 1, -2, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 6, 1, -2, 0, 2, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 2, 0, -2, 0, 0, 0, 0, 0, 6, 3, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 6, 0, 0, 0, 5, 4, 0, -2, 0, 3, 0, -1, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, -2, 0, 0, 0, 0, 0, 0, 0, 0, 8, 6, 0, 0, 0, 0, 0, 0, 6, 14, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 6, 2, 0, 0, 6, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 4, 0, 0, 0, -2, 0, -2, 0, 0, 0, -1, 0, 0, 3 };

    @OriginalMember(owner = "client!ug", name = "s", descriptor = "I")
    public static int field3693 = -1;

    @OriginalMember(owner = "client!ug", name = "p", descriptor = "Lkb;")
    public static class93 field3690 = field3687;

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "I")
    public static int field3676;

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "I")
    public static int field3677;

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "I")
    public int field3681;

    @OriginalMember(owner = "client!ug", name = "k", descriptor = "I")
    public static int field3685;

    @OriginalMember(owner = "client!ug", name = "n", descriptor = "I")
    public static int field3688;

    @OriginalMember(owner = "client!ug", name = "o", descriptor = "I")
    public int field3689;

    @OriginalMember(owner = "client!ug", name = "r", descriptor = "I")
    public static int field3692;

    @OriginalMember(owner = "client!ug", name = "q", descriptor = "Ljava/awt/Image;")
    public Image field3691;

    @OriginalMember(owner = "client!ug", name = "t", descriptor = "[I")
    public int[] field3694;

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "[[S")
    public static short[][] field3682;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Ljava/awt/Component;IIB)V")
    public abstract void method88(Component arg0, int arg1, int arg2, byte arg3);

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILjava/awt/Graphics;IZII)V")
    public abstract void method86(int arg0, Graphics arg1, int arg2, boolean arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Ljg;BI)Z")
    public static final boolean method1220(class89 arg0, byte arg1, int arg2) {
        field3685++;
        byte[] var3 = arg0.method470(49, arg2);
        if (var3 == null) {
            return false;
        }
        class203.method1319(arg1 - 26701, var3);
        if (arg1 != -48) {
            field3679 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V")
    public static void method1221(int arg0) {
        field3682 = null;
        field3679 = null;
        if (arg0 > -48) {
            return;
        }
        field3690 = null;
        field3675 = null;
        field3687 = null;
        field3684 = null;
        field3683 = null;
        field3678 = null;
        field3686 = null;
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)V")
    public final void method1222(int arg0) {
        field3676++;
        if (arg0 == -27445) {
            class118.method667(this.field3694, this.field3689, this.field3681);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IBLjava/awt/Graphics;I)V")
    public abstract void method89(int arg0, byte arg1, Graphics arg2, int arg3);

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "()V")
    protected class188() {
    }
}
