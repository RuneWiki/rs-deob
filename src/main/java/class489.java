import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class489 {

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
    public int field6108;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "[I")
    public int[] field6111;

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "[I")
    public int[] field6113;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "I")
    public static int field6109;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
    public static int field6110;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "Lpfa;")
    public static class275 field6112;

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "Laaa;")
    public static class578 field6114;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)V")
    public static final void method2657(int arg0, int arg1) {
        field6109++;
        class243 var2 = class546.method2926(arg0, 8, true);
        var2.method1455(true);
        if (arg1 > -24) {
            field6112 = null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V")
    public static void method2658(int arg0) {
        field6114 = null;
        if (arg0 >= 79) {
            field6112 = null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(I)V")
    public class489(int arg0) {
        this.field6108 = arg0;
        this.field6111 = new int[this.field6108];
        this.field6113 = new int[this.field6108];
    }
}
