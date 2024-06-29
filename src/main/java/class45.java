import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rja")
public abstract class class45 {

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "I")
    public static int field472 = 0;

    @OriginalMember(owner = "client!rja", name = "c", descriptor = "I")
    public static int field474 = 0;

    @OriginalMember(owner = "client!rja", name = "d", descriptor = "Z")
    public static boolean field475 = false;

    @OriginalMember(owner = "client!rja", name = "b", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!rja", name = "e", descriptor = "[S")
    public static short[] field476;

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "(I)I")
    public abstract int method351(int arg0);

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "(B)Z")
    public abstract boolean method352(byte arg0);

    @OriginalMember(owner = "client!rja", name = "b", descriptor = "(B)Z")
    public abstract boolean method353(byte arg0);

    @OriginalMember(owner = "client!rja", name = "c", descriptor = "(B)I")
    public abstract int method354(byte arg0);

    @OriginalMember(owner = "client!rja", name = "b", descriptor = "(I)V")
    public static void method355(int arg0) {
        field476 = null;
        if (arg0 != 0) {
            field472 = -11;
        }
    }

    @OriginalMember(owner = "client!rja", name = "d", descriptor = "(B)Z")
    public final boolean method356(byte arg0) {
        if (arg0 > -86) {
            field476 = null;
        }
        field473++;
        return this.method352((byte) -74) || this.method353((byte) -62) || this.method358((byte) -70);
    }

    @OriginalMember(owner = "client!rja", name = "c", descriptor = "(I)V")
    public abstract void method357(int arg0);

    @OriginalMember(owner = "client!rja", name = "e", descriptor = "(B)Z")
    public abstract boolean method358(byte arg0);

    @OriginalMember(owner = "client!rja", name = "d", descriptor = "(I)Lpea;")
    public abstract class620 method359(int arg0);

    @OriginalMember(owner = "client!rja", name = "f", descriptor = "(B)V")
    public abstract void method360(byte arg0);
}
