import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gw")
public class class118 extends class208 {

    @OriginalMember(owner = "client!gw", name = "H", descriptor = "I")
    private int field1636;

    @OriginalMember(owner = "client!gw", name = "I", descriptor = "Lmi;")
    private static class348 field1637;

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "()I")
    public final int method795() {
        return field1637.method2064(6188, this.field1636);
    }

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "()V")
    public final void method796() {
        field1637.method2063(116, this.field1636);
    }

    @OriginalMember(owner = "client!gw", name = "c", descriptor = "(I)V")
    public final void method797(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field1637.method2060(arg0, false, this.field1636);
        }
    }

    @OriginalMember(owner = "client!gw", name = "c", descriptor = "()V")
    public final void method798() {
        field1637.method2062(this.field1636, super.field3005);
    }

    @OriginalMember(owner = "client!gw", name = "e", descriptor = "()V")
    public static void method799() {
        field1637 = null;
    }

    @OriginalMember(owner = "client!gw", name = "d", descriptor = "()V")
    public final void method800() {
        field1637.method2059(-26471, this.field1636);
    }

    @OriginalMember(owner = "client!gw", name = "<init>", descriptor = "(Lnt;I)V")
    public class118(class151 arg0, int arg1) {
        field1637 = arg0.method963(false);
        this.field1636 = arg1;
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method801(Component arg0) throws Exception {
        field1637.method2061(class366.field5230, arg0, class289.field4225, true);
    }
}
