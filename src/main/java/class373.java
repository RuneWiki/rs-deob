import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class373 extends class32 {

    @OriginalMember(owner = "client!fb", name = "z", descriptor = "Lbi;")
    public static class104 field5731;

    @OriginalMember(owner = "client!fb", name = "r", descriptor = "I")
    public int field5723;

    @OriginalMember(owner = "client!fb", name = "s", descriptor = "I")
    public static int field5724;

    @OriginalMember(owner = "client!fb", name = "t", descriptor = "I")
    public int field5725;

    @OriginalMember(owner = "client!fb", name = "u", descriptor = "I")
    public static int field5726;

    @OriginalMember(owner = "client!fb", name = "v", descriptor = "I")
    public static int field5727;

    @OriginalMember(owner = "client!fb", name = "w", descriptor = "I")
    public int field5728;

    @OriginalMember(owner = "client!fb", name = "y", descriptor = "I")
    public static int field5730;

    @OriginalMember(owner = "client!fb", name = "A", descriptor = "I")
    public static int field5732;

    @OriginalMember(owner = "client!fb", name = "x", descriptor = "J")
    public long field5729;

    @OriginalMember(owner = "client!fb", name = "q", descriptor = "Lud;")
    public static class64 field5722;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)I")
    public final int method143(int arg0) {
        field5732++;
        return arg0 == 3 ? 0 : -20;
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(B)V")
    public static void method2423(byte arg0) {
        field5731 = null;
        field5722 = null;
        if (arg0 > -77) {
            method2423((byte) 20);
        }
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)J")
    public final long method140(int arg0) {
        if (arg0 >= -63) {
            return 111L;
        } else {
            field5727++;
            return this.field5729;
        }
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(I)I")
    public final int method142(int arg0) {
        if (arg0 < 36) {
            this.field5725 = 29;
        }
        field5724++;
        return this.field5723;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Z)I")
    public final int method139(boolean arg0) {
        field5730++;
        if (!arg0) {
            field5722 = null;
        }
        return this.field5728;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)I")
    public final int method141(byte arg0) {
        if (arg0 == -58) {
            field5726++;
            return this.field5725;
        } else {
            return -18;
        }
    }

    static {
        new class46("", 73);
        field5731 = new class104(46, 8);
    }
}
