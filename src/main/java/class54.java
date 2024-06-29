import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class54 {

    @OriginalMember(owner = "client!m", name = "c", descriptor = "J")
    public long field656 = 0L;

    @OriginalMember(owner = "client!m", name = "o", descriptor = "Z")
    public static boolean field668 = true;

    @OriginalMember(owner = "client!m", name = "j", descriptor = "I")
    public static int field663 = 0;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "I")
    public int field654;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "I")
    public int field655;

    @OriginalMember(owner = "client!m", name = "d", descriptor = "I")
    public int field657;

    @OriginalMember(owner = "client!m", name = "f", descriptor = "I")
    public int field659;

    @OriginalMember(owner = "client!m", name = "g", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!m", name = "h", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!m", name = "l", descriptor = "I")
    public int field665;

    @OriginalMember(owner = "client!m", name = "m", descriptor = "I")
    public int field666;

    @OriginalMember(owner = "client!m", name = "n", descriptor = "I")
    public int field667;

    @OriginalMember(owner = "client!m", name = "i", descriptor = "Len;")
    public class47 field662;

    @OriginalMember(owner = "client!m", name = "p", descriptor = "Len;")
    public class47 field669;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "Z")
    public static boolean field658;

    @OriginalMember(owner = "client!m", name = "k", descriptor = "[I")
    public static int[] field664;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(II)V", line = 15)
    public static final void method327(int arg0, int arg1) {
        field661++;
        if (class285.method2039(arg1, arg0 ^ 0x5E8)) {
            if (arg0 != -31356) {
                method327(18, 82);
            }
            class323.method2245(class175.field2535[arg1], (byte) -100, -1);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V", line = 40)
    public static void method328(int arg0) {
        if (arg0 == 0) {
            field664 = null;
        }
    }
}
