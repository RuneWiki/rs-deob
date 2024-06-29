import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class297 extends class113 {

    @OriginalMember(owner = "client!kd", name = "x", descriptor = "Ljava/lang/Object;")
    private Object field4197;

    @OriginalMember(owner = "client!kd", name = "z", descriptor = "I")
    public static int field4199 = 0;

    @OriginalMember(owner = "client!kd", name = "y", descriptor = "D")
    public static double field4198;

    @OriginalMember(owner = "client!kd", name = "B", descriptor = "I")
    public static int field4201;

    @OriginalMember(owner = "client!kd", name = "C", descriptor = "I")
    public static int field4202;

    @OriginalMember(owner = "client!kd", name = "A", descriptor = "Ltc;")
    public static class371 field4200;

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "(I)Z")
    public final boolean method837(int arg0) {
        if (arg0 != 9614) {
            this.field4197 = null;
        }
        field4201++;
        return false;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)Ljava/lang/Object;")
    public final Object method834(int arg0) {
        field4202++;
        if (arg0 != 6) {
            this.method837(-39);
        }
        return this.field4197;
    }

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "(I)V")
    public static void method1940(int arg0) {
        if (arg0 != 23111) {
            method1940(-42);
        }
        field4200 = null;
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class297(Object arg0, int arg1) {
        super(arg1);
        this.field4197 = arg0;
    }
}
