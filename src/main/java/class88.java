import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class88 extends class282 {

    @OriginalMember(owner = "client!wf", name = "G", descriptor = "J")
    public static long field1201 = -1L;

    @OriginalMember(owner = "client!wf", name = "J", descriptor = "B")
    public byte field1204;

    @OriginalMember(owner = "client!wf", name = "H", descriptor = "I")
    public static int field1202;

    @OriginalMember(owner = "client!wf", name = "I", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "client!wf", name = "K", descriptor = "I")
    public int field1205;

    @OriginalMember(owner = "client!wf", name = "M", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "client!wf", name = "N", descriptor = "I")
    public static int field1208;

    @OriginalMember(owner = "client!wf", name = "P", descriptor = "I")
    public static int field1210;

    @OriginalMember(owner = "client!wf", name = "L", descriptor = "Llh;")
    public class365 field1206;

    @OriginalMember(owner = "client!wf", name = "O", descriptor = "Lpv;")
    public static class50 field1209;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "(B)V")
    public static void method612(byte arg0) {
        if (arg0 > 56) {
            field1209 = null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "(I)I")
    public final int method613(int arg0) {
        if (arg0 != -15473) {
            return 102;
        } else {
            ++field1203;
            return this.field1206 == null ? 0 : this.field1206.field5069 * 100 / (this.field1206.field5073.length + -this.field1204);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)[B")
    public final byte[] method614(int arg0) {
        ++field1208;
        if (arg0 < 20) {
            this.field1206 = null;
        }
        if (!super.field3807 && this.field1206.field5069 >= this.field1206.field5073.length + -this.field1204) {
            return this.field1206.field5073;
        } else {
            throw new RuntimeException();
        }
    }
}
