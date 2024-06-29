import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class10 {

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "J")
    private static long field122;

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "J")
    private static long field123;

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "()V")
    private class10() {
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)J")
    public static final synchronized long method63(int arg0) {
        long var1 = System.currentTimeMillis();
        if (arg0 != -21149) {
            field123 = 55L;
        }
        if (field122 > var1) {
            field123 += field122 - var1;
        }
        field122 = var1;
        return var1 + field123;
    }
}
