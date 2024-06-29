import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wea")
public class class168 {

    @OriginalMember(owner = "client!wea", name = "f", descriptor = "Lhk;")
    private class111 field2708;

    @OriginalMember(owner = "client!wea", name = "d", descriptor = "I")
    public int field2706;

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "F")
    public static float field2703;

    @OriginalMember(owner = "client!wea", name = "c", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!wea", name = "e", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!wea", name = "b", descriptor = "[[[I")
    public static int[][][] field2704;

    @OriginalMember(owner = "client!wea", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field2708.method931(false, this.field2706);
        field2705++;
        super.finalize();
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(Luv;B)V")
    public static final void method1299(class385 arg0, byte arg1) {
        field2707++;
        if ((arg0 instanceof class666)) {
            class666 var3 = (class666) arg0;
            if (var3.field9253 != null) {
                class405.method2423(class235.field3379.field7391 != var3.field7391, false, var3);
            }
        } else if (arg0 instanceof class771) {
            class771 var2 = (class771) arg0;
            class692.method3872((byte) -45, var2, class235.field3379.field7391 != var2.field7391);
        }
        if (arg1 >= -55) {
            field2703 = 0.7228836F;
        }
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(B)V")
    public static void method1300(byte arg0) {
        field2704 = null;
        if (arg0 >= -123) {
            field2703 = -0.62157434F;
        }
    }

    @OriginalMember(owner = "client!wea", name = "<init>", descriptor = "(Lhk;II)V")
    public class168(class111 arg0, int arg1, int arg2) {
        this.field2708 = arg0;
        this.field2706 = arg2;
    }
}
