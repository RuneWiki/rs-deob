import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uga")
public class class222 {

    @OriginalMember(owner = "client!uga", name = "e", descriptor = "[I")
    public int[] field3244 = new int[2];

    @OriginalMember(owner = "client!uga", name = "c", descriptor = "[I")
    public int[] field3242 = new int[3];

    @OriginalMember(owner = "client!uga", name = "d", descriptor = "[I")
    public int[] field3243 = new int[3];

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "[I")
    public int[] field3240 = new int[2];

    @OriginalMember(owner = "client!uga", name = "b", descriptor = "[S")
    public short[] field3241;

    @OriginalMember(owner = "client!uga", name = "f", descriptor = "[S")
    public short[] field3245;

    @OriginalMember(owner = "client!uga", name = "h", descriptor = "F")
    public static float field3247;

    @OriginalMember(owner = "client!uga", name = "g", descriptor = "[Lcn;")
    public static class543[] field3246;

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(B)V")
    public static void method1517(byte arg0) {
        if (arg0 != 6) {
            field3246 = null;
        }
        field3246 = null;
    }

    @OriginalMember(owner = "client!uga", name = "<init>", descriptor = "(Lgn;)V")
    public class222(class730 arg0) {
        this.field3243[1] = arg0.field10067;
        this.field3243[2] = arg0.field10071;
        this.field3243[0] = arg0.field10008;
        this.field3242[0] = arg0.field10012;
        this.field3242[2] = arg0.field10064;
        this.field3242[1] = arg0.field10010;
        this.field3240[0] = arg0.field10066;
        this.field3240[1] = arg0.field10016;
        this.field3244[0] = arg0.field10031;
        this.field3244[1] = arg0.field10018;
        if (arg0.field10029 != null) {
            this.field3241 = new short[arg0.field10029.length];
            class275.method1776(arg0.field10029, 0, this.field3241, 0, this.field3241.length);
        }
        if (arg0.field10045 != null) {
            this.field3245 = new short[arg0.field10045.length];
            class275.method1776(arg0.field10045, 0, this.field3245, 0, this.field3245.length);
        }
    }
}
