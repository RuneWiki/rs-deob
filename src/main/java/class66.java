import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class66 {

    @OriginalMember(owner = "client!e", name = "c", descriptor = "Lec;")
    public static class25 field974 = new class25(64);

    @OriginalMember(owner = "client!e", name = "e", descriptor = "Lwa;")
    public static class281 field976 = new class281();

    @OriginalMember(owner = "client!e", name = "a", descriptor = "I")
    public static int field972;

    @OriginalMember(owner = "client!e", name = "b", descriptor = "I")
    public static int field973;

    @OriginalMember(owner = "client!e", name = "d", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!e", name = "g", descriptor = "I")
    public static int field978;

    @OriginalMember(owner = "client!e", name = "f", descriptor = "Lfa;")
    public static class273 field977;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V")
    public static final void method420(int arg0) {
        if (arg0 != 255) {
            field976 = null;
        }
        field973++;
        class102.field1547.method145(-86);
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(I)V")
    public static final void method421(int arg0) {
        if (arg0 != 1551136632) {
            method422((byte) -55);
        }
        field975++;
        class140.field2161.method145(-92);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(B)V")
    public static void method422(byte arg0) {
        field976 = null;
        field977 = null;
        field974 = null;
        if (arg0 != 101) {
            method420(13);
        }
    }
}
