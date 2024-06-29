import jaggl.memory.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class47 extends class16 {

    @OriginalMember(owner = "client!wc", name = "v", descriptor = "Ljaggl/memory/NativeHeap;")
    public NativeHeap field718;

    @OriginalMember(owner = "client!wc", name = "w", descriptor = "Lao;")
    public static class188 field719 = new class188(79, -1);

    @OriginalMember(owner = "client!wc", name = "z", descriptor = "Lwv;")
    public static class26 field722 = new class26();

    @OriginalMember(owner = "client!wc", name = "x", descriptor = "I")
    public static int field720;

    @OriginalMember(owner = "client!wc", name = "y", descriptor = "I")
    public static int field721;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "(I)V")
    public static void method352(int arg0) {
        field722 = null;
        field719 = null;
        if (arg0 != -1) {
            method353(false);
        }
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(I)V")
    public class47(int arg0) {
        this.field718 = new NativeHeap(arg0);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z)V")
    public static final void method353(boolean arg0) {
        field721++;
        class120.field1887.method2349(0);
        class465.field6835.method2349(0);
        class279.field4013.method2349(0);
        class239.field3483.method2349(0);
        if (arg0) {
            class417.field6164.method2349(0);
        }
    }

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "(I)V")
    public final void method354(int arg0) {
        field720++;
        this.field718.method2659();
        if (arg0 != 79) {
            method353(false);
        }
    }
}
