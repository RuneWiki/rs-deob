import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uba")
public class class524 {

    @OriginalMember(owner = "client!uba", name = "c", descriptor = "Llc;")
    public static class435 field7612 = new class435(100, 5);

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "I")
    public static int field7610;

    @OriginalMember(owner = "client!uba", name = "e", descriptor = "I")
    public static int field7614;

    @OriginalMember(owner = "client!uba", name = "b", descriptor = "J")
    public static long field7611;

    @OriginalMember(owner = "client!uba", name = "d", descriptor = "Lmr;")
    public static class611 field7613;

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(III)Z")
    public static final boolean method3187(int arg0, int arg1, int arg2) {
        field7610++;
        if (arg0 == 458752) {
            return class520.method3159(52, arg1, arg2) | (arg2 & 0x70000) != 0 || class670.method3822(-1, arg1, arg2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(I)V")
    public static void method3188(int arg0) {
        field7612 = null;
        if (arg0 == 100) {
            field7613 = null;
        }
    }
}
