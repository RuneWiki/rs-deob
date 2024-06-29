import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class649 extends class477 {

    @OriginalMember(owner = "client!os", name = "C", descriptor = "Lpp;")
    public class190 field9199;

    @OriginalMember(owner = "client!os", name = "A", descriptor = "Lun;")
    public class604 field9197;

    @OriginalMember(owner = "client!os", name = "x", descriptor = "Lcb;")
    public static class318 field9194 = new class318(29, -1);

    @OriginalMember(owner = "client!os", name = "H", descriptor = "Z")
    public static boolean field9203 = false;

    @OriginalMember(owner = "client!os", name = "F", descriptor = "Ljj;")
    public static class398 field9202 = new class398(13, 8);

    @OriginalMember(owner = "client!os", name = "v", descriptor = "I")
    public int field9192;

    @OriginalMember(owner = "client!os", name = "w", descriptor = "I")
    public int field9193;

    @OriginalMember(owner = "client!os", name = "y", descriptor = "I")
    public int field9195;

    @OriginalMember(owner = "client!os", name = "z", descriptor = "I")
    public static int field9196;

    @OriginalMember(owner = "client!os", name = "B", descriptor = "I")
    public int field9198;

    @OriginalMember(owner = "client!os", name = "D", descriptor = "I")
    public static int field9200;

    @OriginalMember(owner = "client!os", name = "E", descriptor = "I")
    public int field9201;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(I)V", line = 10)
    public final void method3606(int arg0) {
        this.field9201 = this.field9199.field2480;
        this.field9193 = this.field9199.field2475;
        if (arg0 < 17) {
            this.field9197 = null;
        }
        field9196++;
        this.field9195 = this.field9199.field2476;
        if (this.field9199.field2471 != null) {
            this.field9199.field2471.method598(this.field9197.field8253, this.field9197.field8258, this.field9197.field8254, class370.field5322);
        }
        this.field9192 = class370.field5322[0];
        this.field9198 = class370.field5322[2];
    }

    @OriginalMember(owner = "client!os", name = "g", descriptor = "(I)V", line = 35)
    public static void method3607(int arg0) {
        field9194 = null;
        field9202 = null;
        if (arg0 > -22) {
            method3607(-6);
        }
    }

    @OriginalMember(owner = "client!os", name = "<init>", descriptor = "(Lpp;Ltp;)V", line = 52)
    public class649(class190 arg0, class117 arg1) {
        this.field9199 = arg0;
        this.field9197 = this.field9199.method1223(3);
        this.method3606(57);
    }
}
