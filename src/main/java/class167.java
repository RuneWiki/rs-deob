import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public abstract class class167 extends class186 {

    @OriginalMember(owner = "client!in", name = "h", descriptor = "Z")
    public boolean field2550 = false;

    @OriginalMember(owner = "client!in", name = "j", descriptor = "Z")
    public boolean field2552 = false;

    @OriginalMember(owner = "client!in", name = "o", descriptor = "S")
    public short field2557;

    @OriginalMember(owner = "client!in", name = "i", descriptor = "I")
    public int field2551;

    @OriginalMember(owner = "client!in", name = "n", descriptor = "I")
    public int field2556;

    @OriginalMember(owner = "client!in", name = "k", descriptor = "I")
    public int field2553;

    @OriginalMember(owner = "client!in", name = "g", descriptor = "F")
    public static float field2549;

    @OriginalMember(owner = "client!in", name = "l", descriptor = "I")
    public static int field2554;

    @OriginalMember(owner = "client!in", name = "m", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "(IIIIZZ)V", line = 29)
    public class167(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5) {
        this.field2557 = (short) arg3;
        this.field2550 = arg4;
        this.field2551 = arg0;
        this.field2552 = arg5;
        this.field2556 = arg2;
        this.field2553 = arg1;
    }

    @OriginalMember(owner = "client!in", name = "f", descriptor = "(I)V", line = 10)
    public static final void method1160(int arg0) {
        class188.field2771.method2764(-769);
        if (arg0 != -10560) {
            method1160(-8);
        }
        field2555++;
    }
}
