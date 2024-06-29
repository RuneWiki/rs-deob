import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public class class208 extends class443 {

    @OriginalMember(owner = "client!dt", name = "z", descriptor = "Ltf;")
    public class643 field2940;

    @OriginalMember(owner = "client!dt", name = "y", descriptor = "Li;")
    public class251 field2939;

    @OriginalMember(owner = "client!dt", name = "t", descriptor = "[I")
    public static int[] field2934 = new int[25];

    @OriginalMember(owner = "client!dt", name = "u", descriptor = "I")
    public int field2935;

    @OriginalMember(owner = "client!dt", name = "v", descriptor = "I")
    public int field2936;

    @OriginalMember(owner = "client!dt", name = "w", descriptor = "I")
    public int field2937;

    @OriginalMember(owner = "client!dt", name = "x", descriptor = "I")
    public int field2938;

    @OriginalMember(owner = "client!dt", name = "A", descriptor = "I")
    public static int field2941;

    @OriginalMember(owner = "client!dt", name = "B", descriptor = "I")
    public int field2942;

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "(B)V")
    public static void method1334(byte arg0) {
        if (arg0 != -118) {
            method1334((byte) 78);
        }
        field2934 = null;
    }

    @OriginalMember(owner = "client!dt", name = "c", descriptor = "(B)V")
    public final void method1335(byte arg0) {
        if (arg0 <= 52) {
            return;
        }
        this.field2935 = this.field2940.field9347;
        this.field2937 = this.field2940.field9345;
        this.field2938 = this.field2940.field9353;
        field2941++;
        if (this.field2940.field9344 != null) {
            this.field2940.field9344.method885(this.field2939.field3670, this.field2939.field3676, this.field2939.field3662, class365.field5174);
        }
        this.field2936 = class365.field5174[2];
        this.field2942 = class365.field5174[0];
    }

    @OriginalMember(owner = "client!dt", name = "<init>", descriptor = "(Ltf;Lqp;)V")
    public class208(class643 arg0, class585 arg1) {
        this.field2940 = arg0;
        this.field2939 = this.field2940.method3704(false);
        this.method1335((byte) 83);
    }
}
