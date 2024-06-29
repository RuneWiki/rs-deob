import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sw")
public class class701 extends class578 {

    @OriginalMember(owner = "client!sw", name = "B", descriptor = "Llp;")
    public class357 field9938;

    @OriginalMember(owner = "client!sw", name = "y", descriptor = "Lkba;")
    public class91 field9936;

    @OriginalMember(owner = "client!sw", name = "x", descriptor = "I")
    public int field9935;

    @OriginalMember(owner = "client!sw", name = "z", descriptor = "I")
    public int field9937;

    @OriginalMember(owner = "client!sw", name = "D", descriptor = "I")
    public int field9939;

    @OriginalMember(owner = "client!sw", name = "E", descriptor = "I")
    public int field9940;

    @OriginalMember(owner = "client!sw", name = "G", descriptor = "I")
    public static int field9942;

    @OriginalMember(owner = "client!sw", name = "I", descriptor = "I")
    public int field9943;

    @OriginalMember(owner = "client!sw", name = "F", descriptor = "Z")
    public static boolean field9941;

    @OriginalMember(owner = "client!sw", name = "d", descriptor = "(I)V")
    public final void method3924(int arg0) {
        this.field9943 = this.field9938.field4743;
        field9942++;
        this.field9937 = this.field9938.field4737;
        this.field9940 = this.field9938.field4741;
        if (this.field9938.field4734 != null) {
            this.field9938.field4734.method690(this.field9936.field1296, this.field9936.field1306, this.field9936.field1300, class439.field6089);
        }
        if (arg0 <= 4) {
            this.field9943 = 31;
        }
        this.field9935 = class439.field6089[2];
        this.field9939 = class439.field6089[0];
    }

    @OriginalMember(owner = "client!sw", name = "<init>", descriptor = "(Llp;Loa;)V")
    public class701(class357 arg0, class646 arg1) {
        this.field9938 = arg0;
        this.field9936 = this.field9938.method2047(-1);
        this.method3924(23);
    }
}
