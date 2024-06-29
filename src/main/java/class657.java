import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class657 extends class316 {

    @OriginalMember(owner = "client!mh", name = "s", descriptor = "I")
    private int field9151 = -1;

    @OriginalMember(owner = "client!mh", name = "p", descriptor = "I")
    private int field9148;

    @OriginalMember(owner = "client!mh", name = "q", descriptor = "I")
    private int field9149;

    @OriginalMember(owner = "client!mh", name = "r", descriptor = "I")
    public static int field9150;

    @OriginalMember(owner = "client!mh", name = "t", descriptor = "I")
    private int field9152;

    @OriginalMember(owner = "client!mh", name = "u", descriptor = "I")
    public static int field9153;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(BLmda;)V")
    public final void method152(byte arg0, class276 arg1) {
        field9150++;
        arg1.method1785((byte) 117, this.field9152, this.field9151, this.field9148, this.field9149);
        if (arg0 < 80) {
            this.field9152 = 39;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILso;)V")
    public final void method148(int arg0, class494 arg1) {
        this.field9151 = arg1.method2998(true);
        field9153++;
        this.field9149 = arg1.method2976(arg0 + 874);
        if (arg0 != -1001) {
            this.field9152 = 44;
        }
        this.field9148 = arg1.method2964((byte) 55);
        this.field9152 = arg1.method2964((byte) 103);
    }
}
