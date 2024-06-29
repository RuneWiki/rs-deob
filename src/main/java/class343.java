import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public class class343 extends class101 {

    @OriginalMember(owner = "client!up", name = "u", descriptor = "Ljava/lang/Object;")
    private Object field4759;

    @OriginalMember(owner = "client!up", name = "x", descriptor = "[I")
    public static int[] field4762 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!up", name = "B", descriptor = "S")
    public static short field4766 = 256;

    @OriginalMember(owner = "client!up", name = "z", descriptor = "F")
    public static float field4764;

    @OriginalMember(owner = "client!up", name = "w", descriptor = "I")
    public static int field4761;

    @OriginalMember(owner = "client!up", name = "y", descriptor = "I")
    public static int field4763;

    @OriginalMember(owner = "client!up", name = "A", descriptor = "I")
    public static int field4765;

    @OriginalMember(owner = "client!up", name = "v", descriptor = "Lvn;")
    public static class330 field4760;

    @OriginalMember(owner = "client!up", name = "c", descriptor = "(I)Ljava/lang/Object;")
    public final Object method246(int arg0) {
        field4765++;
        return arg0 >= -16 ? null : this.field4759;
    }

    @OriginalMember(owner = "client!up", name = "b", descriptor = "(I)Z")
    public final boolean method247(int arg0) {
        if (arg0 != 1) {
            field4764 = 0.7070421F;
        }
        field4761++;
        return false;
    }

    @OriginalMember(owner = "client!up", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class343(Object arg0, int arg1) {
        super(arg1);
        this.field4759 = arg0;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(II)V")
    public static final void method2154(int arg0, int arg1) {
        field4763++;
        class632 var2 = class641.method3699(-101, 9, arg1);
        if (arg0 == 256) {
            var2.method3655(arg0 ^ 0x100);
        }
    }

    @OriginalMember(owner = "client!up", name = "b", descriptor = "(B)V")
    public static void method2155(byte arg0) {
        if (arg0 != -106) {
            method2155((byte) 77);
        }
        field4760 = null;
        field4762 = null;
    }
}
