import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class28 {

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "I")
    public int field486;

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "I")
    public int field488;

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "I")
    public int field490;

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "I")
    public int field483;

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "Lsd;")
    public static class166 field484 = class135.method935("Hier wechseln", 0);

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "Lsd;")
    public static class166 field482 = class135.method935("(Udns", 0);

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "Lsd;")
    public static class166 field489 = class135.method935("Unerwartete Antwort vom Anmelde)2Server)3", 0);

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "Lsd;")
    public static class166 field487 = class135.method935("Angreifen", 0);

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!ch", name = "j", descriptor = "I")
    public static int field491;

    @OriginalMember(owner = "client!ch", name = "k", descriptor = "Log;")
    public static class133 field492;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)V")
    public static final void method203(int arg0) {
        field491++;
        class165.field3139.method455(arg0 + 254);
        class153.field2952 = arg0;
        class81.field1655 = null;
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(I)V")
    public static void method204(int arg0) {
        field484 = null;
        if (arg0 == 1) {
            field489 = null;
            field482 = null;
            field492 = null;
            field487 = null;
        }
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "()V")
    public class28() {
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(Lch;)V")
    public class28(class28 arg0) {
        this.field486 = arg0.field486;
        this.field488 = arg0.field488;
        this.field490 = arg0.field490;
        this.field483 = arg0.field483;
    }
}
