import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class102 {

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "I")
    public static int field1578 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "Lta;")
    public static class197 field1579 = new class197(64);

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "Lek;")
    public static class184 field1581 = null;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "I")
    public static int field1580;

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "I")
    public static int field1582;

    @OriginalMember(owner = "client!pm", name = "g", descriptor = "I")
    public static int field1583;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(II)V", line = 6)
    public static final void method799(int arg0, int arg1) {
        field1583++;
        if (arg0 != -31078) {
            field1582 = 112;
        }
        class147 var2 = class92.method731(-29125, arg1, 3);
        var2.method1099(arg0 + 30962);
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(II)V", line = 20)
    public static final void method800(int arg0, int arg1) {
        if (arg1 != -8) {
            method800(-86, 1);
        }
        field1577++;
        class22.field242.method1429((byte) 127, arg0);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)V", line = 32)
    public static void method801(int arg0) {
        if (arg0 != 3) {
            field1579 = (class197) null;
        }
        field1581 = null;
        field1579 = null;
    }
}
