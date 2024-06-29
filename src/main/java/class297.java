import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class297 extends class435 {

    @OriginalMember(owner = "client!fr", name = "s", descriptor = "I")
    public int field4193;

    @OriginalMember(owner = "client!fr", name = "w", descriptor = "Z")
    public boolean field4197;

    @OriginalMember(owner = "client!fr", name = "v", descriptor = "I")
    public int field4196;

    @OriginalMember(owner = "client!fr", name = "u", descriptor = "I")
    public int field4195;

    @OriginalMember(owner = "client!fr", name = "t", descriptor = "I")
    public int field4194;

    @OriginalMember(owner = "client!fr", name = "r", descriptor = "I")
    public int field4192;

    @OriginalMember(owner = "client!fr", name = "q", descriptor = "Ljb;")
    public static class666 field4191 = new class666(4);

    @OriginalMember(owner = "client!fr", name = "x", descriptor = "Leda;")
    public static class116 field4198 = new class116(45, 6);

    @OriginalMember(owner = "client!fr", name = "y", descriptor = "[Lhea;")
    public static class374[] field4199 = new class374[14];

    @OriginalMember(owner = "client!fr", name = "z", descriptor = "[I")
    public static int[] field4200;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(Z)V")
    public static void method1842(boolean arg0) {
        field4199 = null;
        if (arg0) {
            field4191 = null;
            field4198 = null;
            field4200 = null;
        }
    }

    @OriginalMember(owner = "client!fr", name = "<init>", descriptor = "(IIIIIZ)V")
    public class297(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field4193 = arg2;
        this.field4197 = arg5;
        this.field4196 = arg1;
        this.field4195 = arg4;
        this.field4194 = arg3;
        this.field4192 = arg0;
    }
}
