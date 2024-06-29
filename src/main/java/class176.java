import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class176 {

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "Lhj;")
    public static class69 field3215 = class181.method1318(" weitere Optionen", (byte) -115);

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "Lhj;")
    public static class69 field3216 = class181.method1318("Freie Welt", (byte) -110);

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "I")
    public int field3210;

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
    public static int field3211;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "I")
    public static int field3212;

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "I")
    public int field3213;

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "I")
    public int field3214;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIII)V")
    public static final void method1276(int arg0, int arg1, int arg2, int arg3) {
        field3211++;
        if (arg2 != 0) {
            method1276(11, 74, 9, -112);
        }
        class50 var4 = class108.method814(arg3, arg1, -13706);
        if (var4 != null && var4.field733 != null) {
            class58 var5 = new class58();
            var5.field1048 = var4;
            var5.field1050 = var4.field733;
            class179.method1304((byte) 72, var5);
        }
        class149.field2769 = arg0;
        class228.field4164 = arg1;
        class65.field1254 = true;
        class20.field276 = arg3;
        class204.method1478(var4, false);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)V")
    public static void method1277(byte arg0) {
        field3216 = null;
        if (arg0 < -41) {
            field3215 = null;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method1278(int arg0, Component arg1) {
        field3212++;
        if (arg0 == -31547) {
            arg1.removeMouseListener(class113.field2173);
            arg1.removeMouseMotionListener(class113.field2173);
            arg1.removeFocusListener(class113.field2173);
            class76.field1482 = 0;
        }
    }
}
