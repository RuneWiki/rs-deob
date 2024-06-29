import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class10 {

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "I")
    public static int field163 = 2;

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "[Lrj;")
    public static class12[] field164 = new class12[14];

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "I")
    public static int field162;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(B)V", line = 5)
    public static final void method76(byte arg0) {
        for (int var1 = 0; var1 < class55.field746; var1++) {
            class172 var2 = class284.method1956(var1, -87);
            if (var2 != null && var2.field2301 == 0) {
                class4.field41[var1] = 0;
                class191.field2561[var1] = 0;
            }
        }
        if (arg0 > -82) {
            method77((byte) -106);
        }
        field162++;
        class312.field4570 = new class56(128);
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(B)V", line = 39)
    public static void method77(byte arg0) {
        if (arg0 <= 64) {
            field163 = -105;
        }
        field164 = null;
    }
}
