import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public abstract class class145 {

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "I")
    public int field2787;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "I")
    public int field2779;

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "I")
    public int field2784;

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "[Lsg;")
    public static class30[] field2785 = new class30[200];

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "Lsg;")
    public static class30 field2781 = class167.method1221((byte) 33, ")4l=");

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "[S")
    public static short[] field2782 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!wk", name = "j", descriptor = "Lsg;")
    private static class30 field2788 = class167.method1221((byte) 33, "wishes to trade with you)3");

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "Lsg;")
    public static class30 field2780 = field2788;

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "I")
    public static int field2783;

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "I")
    public static int field2786;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)V")
    public static void method1069(int arg0) {
        field2785 = null;
        field2788 = null;
        field2781 = null;
        field2780 = null;
        if (arg0 == -1) {
            field2782 = null;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ZII)V")
    public abstract void method792(boolean arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(III)V")
    public abstract void method788(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IILsg;)V")
    public static final void method1070(int arg0, int arg1, class30 arg2) {
        int var3 = -69 / ((38 - arg0) / 37);
        field2786++;
        class68 var4 = class103.method830(arg1, 4, 3);
        var4.method608(false);
        var4.field1483 = arg2;
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(ZII)V")
    public abstract void method790(boolean arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(III)V")
    public class145(int arg0, int arg1, int arg2) {
        this.field2787 = arg0;
        this.field2779 = arg1;
        this.field2784 = arg2;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(II)V")
    public static final void method1071(int arg0, int arg1) {
        field2783++;
        class68 var2 = class103.method830(arg0, arg1 + arg1, 2);
        var2.method610(arg1 ^ 0x7FA6D762);
    }
}
