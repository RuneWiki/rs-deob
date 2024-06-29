import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public class class478 extends class262 {

    @OriginalMember(owner = "client!hu", name = "N", descriptor = "I")
    private int field7310;

    @OriginalMember(owner = "client!hu", name = "O", descriptor = "Lnc;")
    private static class151 field7311;

    @OriginalMember(owner = "client!hu", name = "d", descriptor = "(I)V")
    public final void method1790(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field7311.method918((byte) -92, this.field7310, arg0);
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method1796(Component arg0) throws Exception {
        field7311.method919(class221.field3742, true, arg0, class309.field4835);
    }

    @OriginalMember(owner = "client!hu", name = "d", descriptor = "()I")
    public final int method1792() {
        return field7311.method921(this.field7310, false);
    }

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "()V")
    public final void method1785() {
        field7311.method920((byte) -126, this.field7310);
    }

    @OriginalMember(owner = "client!hu", name = "e", descriptor = "()V")
    public static void method2961() {
        field7311 = null;
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "()V")
    public final void method1783() {
        field7311.method922(19372, this.field7310);
    }

    @OriginalMember(owner = "client!hu", name = "<init>", descriptor = "(Lpb;I)V")
    public class478(class2 arg0, int arg1) {
        field7311 = arg0.method17(false);
        this.field7310 = arg1;
    }

    @OriginalMember(owner = "client!hu", name = "c", descriptor = "()V")
    public final void method1791() {
        field7311.method923(this.field7310, super.field4224);
    }
}
