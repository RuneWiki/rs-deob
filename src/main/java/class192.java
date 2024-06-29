import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class192 extends class66 {

    @OriginalMember(owner = "client!tl", name = "M", descriptor = "I")
    private int field3263;

    @OriginalMember(owner = "client!tl", name = "L", descriptor = "Lhm;")
    private static class44 field3262;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 3)
    public final void method463(Component arg0) throws Exception {
        field3262.method321((byte) 120, class15.field233, arg0, class306.field5146);
    }

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "()V", line = 6)
    public final void method470() {
        field3262.method323(this.field3263, this.field1037);
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "()V", line = 9)
    public final void method461() {
        field3262.method325(-24, this.field3263);
    }

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "()V", line = 12)
    public final void method471() {
        field3262.method322((byte) -42, this.field3263);
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "()I", line = 15)
    public final int method467() {
        return field3262.method320(this.field3263, 21203);
    }

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "(I)V", line = 18)
    public final void method474(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        field3262.method324(arg0, this.field3263, (byte) 104);
    }

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "()V", line = 25)
    public static void method1421() {
        field3262 = null;
    }

    @OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(Lib;I)V", line = 28)
    public class192(class28 arg0, int arg1) {
        field3262 = arg0.method234(false);
        this.field3263 = arg1;
    }
}
