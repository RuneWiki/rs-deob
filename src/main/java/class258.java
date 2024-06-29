import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class258 {

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "I")
    public static int field3482 = 0;

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "Z")
    public static boolean field3486 = false;

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "Ljava/lang/String;")
    public static String field3487 = "shake:";

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
    public static int field3481;

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "Lka;")
    public static class407 field3484;

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "Lrk;")
    public static class427 field3485;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "[Lkb;")
    public static class80[] field3483;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(BI)Z")
    public static final boolean method1675(byte arg0, int arg1) {
        if (arg0 > -62) {
            return false;
        }
        field3481++;
        if (arg1 == 10 || arg1 == 13 || arg1 == 49 || arg1 == 5 || arg1 == 16 || arg1 == 31 || arg1 == 20 || arg1 == 58) {
            return true;
        } else if (arg1 == 15 || arg1 == 50 || arg1 == 1006 || arg1 == 1011) {
            return true;
        } else if (arg1 == 21 || arg1 == 40 || arg1 == 34 || arg1 == 1 || arg1 == 18) {
            return true;
        } else {
            return arg1 == 36 || arg1 == 42 || arg1 == 30 || arg1 == 39 || arg1 == 25 || arg1 == 60;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)V")
    public static void method1676(byte arg0) {
        field3484 = null;
        field3483 = null;
        if (arg0 != 19) {
            method1676((byte) 29);
        }
        field3485 = null;
        field3487 = null;
    }
}
