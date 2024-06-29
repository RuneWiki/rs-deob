import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class class136 extends class265 implements class138 {

    @OriginalMember(owner = "client!sr", name = "d", descriptor = "I")
    private int field1972;

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "I")
    private int field1971;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(I[BI)V", line = 3)
    public final void method390(int arg0, byte[] arg1, int arg2) {
        this.method1729(arg1, arg2);
        this.field1972 = arg0;
        this.field1971 = this.field3689.method1532(this.field1972);
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(III)V", line = 8)
    public final void method391(int arg0, int arg1, int arg2) {
        this.field3689.field3184.glDrawElements(arg0, arg2, this.field1972, this.field3690.position(this.field1971 * arg1));
    }

    @OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(Ltb;I[BI)V", line = 13)
    public class136(class227 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field1972 = arg1;
        this.field1971 = this.field3689.method1532(this.field1972);
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "()I", line = 19)
    public final int method392() {
        return 0;
    }
}
