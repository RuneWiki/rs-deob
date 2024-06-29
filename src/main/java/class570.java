import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kia")
public class class570 extends class349 {

    @OriginalMember(owner = "client!kia", name = "K", descriptor = "I")
    private int field8218;

    @OriginalMember(owner = "client!kia", name = "J", descriptor = "Luaa;")
    private static class371 field8217;

    @OriginalMember(owner = "client!kia", name = "d", descriptor = "()V")
    public final void method2236() {
        field8217.method1331(this.field8218, super.field5159);
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "()V")
    public final void method2223() {
        field8217.method1332(2, this.field8218);
    }

    @OriginalMember(owner = "client!kia", name = "b", descriptor = "()I")
    public final int method2233() {
        return field8217.method1329(256, this.field8218);
    }

    @OriginalMember(owner = "client!kia", name = "e", descriptor = "()V")
    public static void method3392() {
        field8217 = null;
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method2232(Component arg0) throws Exception {
        field8217.method1333(class147.field2155, 0, class132.field1821, arg0);
    }

    @OriginalMember(owner = "client!kia", name = "<init>", descriptor = "(Lhga;I)V")
    public class570(class300 arg0, int arg1) {
        field8217 = (class371) arg0.method1865(true);
        this.field8218 = arg1;
    }

    @OriginalMember(owner = "client!kia", name = "c", descriptor = "()V")
    public final void method2234() {
        field8217.method1334(-21944, this.field8218);
    }

    @OriginalMember(owner = "client!kia", name = "b", descriptor = "(I)V")
    public final void method2222(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field8217.method1330(arg0, (byte) -112, this.field8218);
        }
    }
}
