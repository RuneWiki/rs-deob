import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class6 extends class11 {

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(ZF)V", line = 5)
    public final void method36(boolean arg0, float arg1) {
        int var3 = Float.floatToRawIntBits(arg1);
        this.field230[this.field191++] = (byte) (var3 >> 24);
        this.field230[this.field191++] = (byte) (var3 >> 16);
        this.field230[this.field191++] = (byte) (var3 >> 8);
        this.field230[this.field191++] = (byte) var3;
        if (arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client!to", name = "<init>", descriptor = "(I)V", line = 18)
    public class6(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IF)V", line = 23)
    public final void method37(int arg0, float arg1) {
        int var3 = Float.floatToRawIntBits(arg1);
        if (arg0 != -1923362568) {
            this.method37(-82, 1.233501F);
        }
        this.field230[this.field191++] = (byte) var3;
        this.field230[this.field191++] = (byte) (var3 >> 8);
        this.field230[this.field191++] = (byte) (var3 >> 16);
        this.field230[this.field191++] = (byte) (var3 >> 24);
    }
}
