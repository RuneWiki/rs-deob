import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rea")
public class class32 {

    @OriginalMember(owner = "client!rea", name = "h", descriptor = "I")
    public int field476;

    @OriginalMember(owner = "client!rea", name = "n", descriptor = "I")
    public int field482;

    @OriginalMember(owner = "client!rea", name = "j", descriptor = "Lrea;")
    public class32 field478;

    @OriginalMember(owner = "client!rea", name = "d", descriptor = "Lq;")
    public class151 field472;

    @OriginalMember(owner = "client!rea", name = "c", descriptor = "[Lsn;")
    public static class659[] field471 = new class659[100];

    @OriginalMember(owner = "client!rea", name = "e", descriptor = "[I")
    public static int[] field473 = new int[1];

    @OriginalMember(owner = "client!rea", name = "l", descriptor = "[I")
    public static int[] field480 = new int[1];

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!rea", name = "b", descriptor = "I")
    public int field470;

    @OriginalMember(owner = "client!rea", name = "f", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!rea", name = "g", descriptor = "I")
    public int field475;

    @OriginalMember(owner = "client!rea", name = "i", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "client!rea", name = "k", descriptor = "I")
    public int field479;

    @OriginalMember(owner = "client!rea", name = "m", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!rea", name = "o", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(III)Z")
    public static final boolean method258(int arg0, int arg1, int arg2) {
        field477++;
        if (arg1 != 32768) {
            field480 = null;
        }
        return (arg2 & 0x8000) != 0;
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(B)V")
    public static void method259(byte arg0) {
        field473 = null;
        field480 = null;
        int var1 = -1 % ((75 - arg0) / 49);
        field471 = null;
    }

    @OriginalMember(owner = "client!rea", name = "b", descriptor = "(B)Lbg;")
    public final class641 method260(byte arg0) {
        if (arg0 <= 4) {
            this.method260((byte) -108);
        }
        field474++;
        return class467.method2596(this.field476, (byte) 113);
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(ZI)Lrea;")
    public final class32 method261(boolean arg0, int arg1) {
        field483++;
        return arg0 ? null : new class32(this.field476, arg1);
    }

    @OriginalMember(owner = "client!rea", name = "<init>", descriptor = "(II)V")
    public class32(int arg0, int arg1) {
        this.field476 = arg0;
        this.field482 = arg1;
    }

    @OriginalMember(owner = "client!rea", name = "<init>", descriptor = "(Lrea;I)V")
    public class32(class32 arg0, int arg1) {
        this.field478 = arg0;
        this.field472 = this.field478.field472;
        this.field482 = this.field478.field482 + arg1;
        this.field476 = this.field478.field476;
    }
}
