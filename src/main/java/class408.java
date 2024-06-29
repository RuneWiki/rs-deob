import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public class class408 {

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "I")
    public int field5366;

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "Ljw;")
    public static class259 field5367 = new class259(9, 6);

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "I")
    public static int field5365;

    @OriginalMember(owner = "client!rr", name = "d", descriptor = "I")
    public static int field5368;

    @OriginalMember(owner = "client!rr", name = "f", descriptor = "I")
    public static int field5370;

    @OriginalMember(owner = "client!rr", name = "e", descriptor = "Lkba;")
    public static class573 field5369;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(B)V")
    public static void method2315(byte arg0) {
        field5367 = null;
        int var1 = -78 / ((arg0 + 59) / 49);
        field5369 = null;
    }

    @OriginalMember(owner = "client!rr", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field5365++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(I)V")
    public class408(int arg0) {
        this.field5366 = arg0;
    }
}
