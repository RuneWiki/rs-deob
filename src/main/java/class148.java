import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class148 {

    @OriginalMember(owner = "client!fn", name = "h", descriptor = "[I")
    public int[] field2141 = new int[2];

    @OriginalMember(owner = "client!fn", name = "e", descriptor = "[I")
    public int[] field2138 = new int[3];

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "[I")
    public int[] field2134 = new int[3];

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "[I")
    public int[] field2136 = new int[2];

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "[S")
    public short[] field2137;

    @OriginalMember(owner = "client!fn", name = "g", descriptor = "[S")
    public short[] field2140;

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "I")
    public static int field2135 = 0;

    @OriginalMember(owner = "client!fn", name = "f", descriptor = "[I")
    public static int[] field2139;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Z)V", line = 14)
    public static void method1035(boolean arg0) {
        field2139 = null;
        if (!arg0) {
            method1035(true);
        }
    }

    @OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(Lbca;)V", line = 24)
    public class148(class689 arg0) {
        this.field2134[0] = arg0.field9612;
        this.field2134[1] = arg0.field9639;
        this.field2134[2] = arg0.field9646;
        this.field2138[2] = arg0.field9577;
        this.field2138[1] = arg0.field9603;
        this.field2138[0] = arg0.field9586;
        this.field2136[1] = arg0.field9643;
        this.field2136[0] = arg0.field9598;
        this.field2141[1] = arg0.field9607;
        this.field2141[0] = arg0.field9597;
        if (arg0.field9566 != null) {
            this.field2137 = new short[arg0.field9566.length];
            class595.method3466(arg0.field9566, 0, this.field2137, 0, this.field2137.length);
        }
        if (arg0.field9567 != null) {
            this.field2140 = new short[arg0.field9567.length];
            class595.method3466(arg0.field9567, 0, this.field2140, 0, this.field2140.length);
        }
    }
}
