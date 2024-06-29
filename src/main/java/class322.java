import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class322 extends class130 {

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IF)V")
    public final void method2134(int arg0, float arg1) {
        int var3 = Float.floatToRawIntBits(arg1);
        this.field1851[this.field1880++] = (byte) var3;
        this.field1851[this.field1880++] = (byte) (var3 >> 8);
        if (arg0 <= -56) {
            this.field1851[this.field1880++] = (byte) (var3 >> 16);
            this.field1851[this.field1880++] = (byte) (var3 >> 24);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BF)V")
    public final void method2135(byte arg0, float arg1) {
        int var3 = Float.floatToRawIntBits(arg1);
        this.field1851[this.field1880++] = (byte) (var3 >> 24);
        this.field1851[this.field1880++] = (byte) (var3 >> 16);
        this.field1851[this.field1880++] = (byte) (var3 >> 8);
        this.field1851[this.field1880++] = (byte) var3;
        if (arg0 != 122) {
            this.method2134(115, -0.5962695F);
        }
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(I)V")
    public class322(int arg0) {
        super(arg0);
    }
}
