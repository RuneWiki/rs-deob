import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class35 extends class208 {

    @OriginalMember(owner = "client!kc", name = "N", descriptor = "I")
    private int field589;

    @OriginalMember(owner = "client!kc", name = "O", descriptor = "Lje;")
    private static class136 field590;

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "()V")
    public final void method182() {
        field590.method851(this.field589, super.field3539);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V")
    public final void method183(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field590.method847(arg0, this.field589, 78);
        }
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "()V")
    public final void method184() {
        field590.method848(-13369, this.field589);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method185(Component arg0) throws Exception {
        field590.method850(class216.field3641, class195.field3316, arg0, 23468);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "()I")
    public final int method186() {
        return field590.method852((byte) -86, this.field589);
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "()V")
    public final void method187() {
        field590.method849((byte) -128, this.field589);
    }

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "()V")
    public static void method188() {
        field590 = null;
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(Lth;I)V")
    public class35(class239 arg0, int arg1) {
        field590 = arg0.method1599(0);
        this.field589 = arg1;
    }
}
