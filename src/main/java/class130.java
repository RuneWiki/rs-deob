import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class130 {

    @OriginalMember(owner = "client!od", name = "b", descriptor = "Lsd;")
    private static class166 field2539 = class135.method935("New User", 0);

    @OriginalMember(owner = "client!od", name = "c", descriptor = "Lsd;")
    private static class166 field2540 = class135.method935("flash2:", 0);

    @OriginalMember(owner = "client!od", name = "j", descriptor = "Lsd;")
    public static class166 field2547 = field2539;

    @OriginalMember(owner = "client!od", name = "m", descriptor = "Lsd;")
    public static class166 field2550 = class135.method935("::errortest", 0);

    @OriginalMember(owner = "client!od", name = "n", descriptor = "Lsd;")
    public static class166 field2551 = class135.method935("sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1", 0);

    @OriginalMember(owner = "client!od", name = "p", descriptor = "I")
    public static int field2553 = 0;

    @OriginalMember(owner = "client!od", name = "l", descriptor = "Lsd;")
    public static class166 field2549 = field2540;

    @OriginalMember(owner = "client!od", name = "e", descriptor = "Lsd;")
    public static class166 field2542 = field2540;

    @OriginalMember(owner = "client!od", name = "h", descriptor = "Z")
    public static volatile boolean field2545 = false;

    @OriginalMember(owner = "client!od", name = "k", descriptor = "Lsd;")
    public static class166 field2548 = class135.method935("<col=ff7000>", 0);

    @OriginalMember(owner = "client!od", name = "q", descriptor = "I")
    public static int field2554 = 0;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "I")
    public static int field2538;

    @OriginalMember(owner = "client!od", name = "f", descriptor = "I")
    public static int field2543;

    @OriginalMember(owner = "client!od", name = "g", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "J")
    public long field2541;

    @OriginalMember(owner = "client!od", name = "i", descriptor = "Lod;")
    public class130 field2546;

    @OriginalMember(owner = "client!od", name = "o", descriptor = "Lod;")
    public class130 field2552;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V")
    public static void method914(int arg0) {
        field2551 = null;
        field2550 = null;
        field2549 = null;
        field2542 = null;
        field2547 = null;
        field2539 = null;
        field2540 = null;
        if (arg0 == 0) {
            field2548 = null;
        }
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(I)V")
    public final void method915(int arg0) {
        field2538++;
        if (this.field2546 == null) {
            return;
        }
        this.field2546.field2552 = this.field2552;
        this.field2552.field2546 = this.field2546;
        if (arg0 == 0) {
            this.field2546 = null;
            this.field2552 = null;
        }
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(I)Z")
    public final boolean method916(int arg0) {
        if (arg0 < 41) {
            field2545 = true;
        }
        field2543++;
        return this.field2546 != null;
    }
}
