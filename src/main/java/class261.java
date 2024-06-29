import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class261 extends OutputStream {

    @OriginalMember(owner = "client!id", name = "f", descriptor = "[I")
    public static int[] field4382 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!id", name = "a", descriptor = "Lpf;")
    public static class17 field4377 = new class17(20);

    @OriginalMember(owner = "client!id", name = "b", descriptor = "I")
    public static int field4378;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "I")
    public static int field4379;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "I")
    public static int field4380;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "I")
    public static int field4381;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "I")
    public static int field4384;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "Lpb;")
    public static class141 field4383;

    @OriginalMember(owner = "client!id", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field4381++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
    public static void method1860(int arg0) {
        field4383 = null;
        field4377 = null;
        field4382 = null;
        int var1 = -90 / ((arg0 - 44) / 38);
    }
}
