import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class152 extends class115 {

    @OriginalMember(owner = "client!vg", name = "Q", descriptor = "[Lnb;")
    public static class28[] field2642 = new class28[50];

    @OriginalMember(owner = "client!vg", name = "S", descriptor = "Z")
    public static boolean field2644 = false;

    @OriginalMember(owner = "client!vg", name = "U", descriptor = "Lqe;")
    public static class168 field2646 = class66.method448("slr2)3ws?order=LPWM", -118);

    @OriginalMember(owner = "client!vg", name = "R", descriptor = "I")
    public static int field2643;

    @OriginalMember(owner = "client!vg", name = "T", descriptor = "Lrd;")
    public static class207 field2645;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IB)[I")
    public final int[] method5(int arg0, byte arg1) {
        if (arg1 <= 37) {
            return null;
        } else {
            ++field2643;
            int[] var3 = super.field1872.method182((byte) -105, arg0);
            if (super.field1872.field341) {
                class22.method115(var3, 0, class130.field2297, class170.field2963[arg0]);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "()V")
    public class152() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vg", name = "i", descriptor = "(I)V")
    public static void method1007(int arg0) {
        field2642 = null;
        field2646 = null;
        if (arg0 >= -32) {
            field2642 = null;
        }
        field2645 = null;
    }
}
