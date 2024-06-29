import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public abstract class class27 {

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "Lkn;")
    public static class530 field325 = new class530("shake:", "schütteln:", "tremblement:", "tremor:");

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
    public static int field329 = 0;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "Loi;")
    public static class53 field328;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V")
    public static void method171(byte arg0) {
        field328 = null;
        field325 = null;
        if (arg0 >= -30) {
            method171((byte) 82);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(III)B")
    public static final byte method172(int arg0, int arg1, int arg2) {
        if (arg1 != 14492) {
            field326 = 122;
        }
        field327++;
        if (arg2 == 9) {
            return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }
}
