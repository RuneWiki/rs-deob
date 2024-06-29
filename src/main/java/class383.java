import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public abstract class class383 {

    @OriginalMember(owner = "client!du", name = "c", descriptor = "Z")
    public static boolean field5613 = false;

    @OriginalMember(owner = "client!du", name = "a", descriptor = "Z")
    public static boolean field5611 = false;

    @OriginalMember(owner = "client!du", name = "e", descriptor = "[I")
    public static int[] field5615 = new int[32];

    @OriginalMember(owner = "client!du", name = "d", descriptor = "I")
    public static int field5614 = 0;

    @OriginalMember(owner = "client!du", name = "b", descriptor = "I")
    public static int field5612;

    @OriginalMember(owner = "client!du", name = "f", descriptor = "I")
    public static int field5616;

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(III)Z", line = 10)
    public static final boolean method2341(int arg0, int arg1, int arg2) {
        field5612++;
        if (arg0 > -75) {
            return true;
        } else {
            return (arg2 & 0x34) != 0;
        }
    }

    @OriginalMember(owner = "client!du", name = "c", descriptor = "(I)V", line = 21)
    public static void method2342(int arg0) {
        field5615 = null;
        if (arg0 != 31398) {
            method2342(67);
        }
    }

    @OriginalMember(owner = "client!du", name = "d", descriptor = "(I)Z", line = 31)
    public final boolean method2343(int arg0) {
        if (arg0 != 32) {
            field5614 = -97;
        }
        field5616++;
        return this.method309((byte) 88) || this.method316(arg0 ^ 0x65B7) || this.method322(32);
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(I)Z")
    public abstract boolean method316(int arg0);

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(B)V")
    public abstract void method314(byte arg0);

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(Z)I")
    public abstract int method310(boolean arg0);

    @OriginalMember(owner = "client!du", name = "b", descriptor = "(I)I")
    public abstract int method321(int arg0);

    @OriginalMember(owner = "client!du", name = "b", descriptor = "(B)Lrl;")
    public abstract class634 method313(byte arg0);

    @OriginalMember(owner = "client!du", name = "c", descriptor = "(B)Z")
    public abstract boolean method309(byte arg0);

    @OriginalMember(owner = "client!du", name = "e", descriptor = "(I)V")
    public abstract void method312(int arg0);

    @OriginalMember(owner = "client!du", name = "f", descriptor = "(I)Z")
    public abstract boolean method322(int arg0);
}
