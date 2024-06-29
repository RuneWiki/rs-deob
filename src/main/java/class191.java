import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class191 extends class476 {

    @OriginalMember(owner = "client!fh", name = "i", descriptor = "I")
    public int field2784 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!fh", name = "q", descriptor = "I")
    public int field2792 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!fh", name = "o", descriptor = "I")
    public int field2790 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!fh", name = "t", descriptor = "I")
    public int field2795 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!fh", name = "u", descriptor = "I")
    public int field2796 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!fh", name = "l", descriptor = "I")
    public int field2787 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!fh", name = "x", descriptor = "I")
    public int field2799 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!fh", name = "y", descriptor = "I")
    public int field2800 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!fh", name = "k", descriptor = "Lti;")
    public class237 field2786;

    @OriginalMember(owner = "client!fh", name = "s", descriptor = "Z")
    public static boolean field2794 = false;

    @OriginalMember(owner = "client!fh", name = "v", descriptor = "F")
    public static float field2797 = 0.0F;

    @OriginalMember(owner = "client!fh", name = "n", descriptor = "I")
    public static int field2789 = 0;

    @OriginalMember(owner = "client!fh", name = "w", descriptor = "Lrb;")
    public static class283 field2798 = new class283(98, -1);

    @OriginalMember(owner = "client!fh", name = "z", descriptor = "I")
    public static int field2801 = -1;

    @OriginalMember(owner = "client!fh", name = "j", descriptor = "I")
    public static int field2785;

    @OriginalMember(owner = "client!fh", name = "m", descriptor = "I")
    public static int field2788;

    @OriginalMember(owner = "client!fh", name = "p", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "client!fh", name = "r", descriptor = "I")
    public static int field2793;

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)V")
    public static final void method1264(int arg0) {
        field2793++;
        if (class223.field3146 != null) {
            class223.field3146.method3021(-27669);
        }
        if (arg0 == Integer.MIN_VALUE && class515.field7534 != null) {
            class515.field7534.method3021(-27669);
        }
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "(I)V")
    public static void method1265(int arg0) {
        int var1 = 23 % ((arg0 - 29) / 37);
        field2798 = null;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(III)Z")
    public final boolean method1266(int arg0, int arg1, int arg2) {
        field2785++;
        if (arg0 >= this.field2787 && arg0 <= this.field2799 && arg2 >= this.field2790 && arg2 <= this.field2800) {
            return true;
        } else if (this.field2796 <= arg0 && this.field2784 >= arg0 && arg2 >= this.field2795 && this.field2792 >= arg2) {
            return true;
        } else {
            if (arg1 != 98) {
                this.field2795 = -30;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(III)Loa;")
    public static final class168 method1267(int arg0, int arg1, int arg2) {
        class532 var3 = class103.field1632[arg0][arg1][arg2];
        return var3 == null ? null : var3.field7830;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Z)V")
    public static final void method1268(boolean arg0) {
        field2791++;
        if (class182.field2717) {
            return;
        }
        class163.field2483 = true;
        class182.field2717 = true;
        if (class76.field1075.field3649) {
            field2797 = ((int) field2797 - 65 & 0xFFFFFF80);
        } else {
            class526.field7686 += (-class526.field7686 - 24.0F) / 2.0F;
        }
        if (arg0) {
            field2798 = null;
        }
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "(III)V")
    public static final void method1269(int arg0, int arg1, int arg2) {
        field2788++;
        class314 var3 = class177.method1213(false, 16, arg1);
        var3.method1808(-7412);
        var3.field4253 = arg2;
        if (arg0 != Integer.MAX_VALUE) {
            field2798 = null;
        }
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Lti;)V")
    public class191(class237 arg0) {
        this.field2786 = arg0;
    }
}
