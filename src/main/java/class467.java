import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class467 {

    @OriginalMember(owner = "client!id", name = "e", descriptor = "Z")
    private boolean field6486 = false;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "I")
    public int field6489 = 43594;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "Z")
    private boolean field6487 = true;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "I")
    public int field6483 = 443;

    @OriginalMember(owner = "client!id", name = "j", descriptor = "J")
    public static long field6491 = (long) (Math.random() * 9.999999999E9D);

    @OriginalMember(owner = "client!id", name = "a", descriptor = "I")
    public static int field6482;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "I")
    public int field6484;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "I")
    public static int field6488;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "I")
    public static int field6490;

    @OriginalMember(owner = "client!id", name = "k", descriptor = "I")
    public static int field6492;

    @OriginalMember(owner = "client!id", name = "l", descriptor = "I")
    public static int field6493;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "Ljava/lang/String;")
    public String field6485;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lid;B)Z", line = 7)
    public final boolean method2851(class467 arg0, byte arg1) {
        int var3 = -53 / ((-arg1 - 5) / 63);
        field6493++;
        if (arg0 == null) {
            return false;
        } else {
            return this.field6484 == arg0.field6484 && this.field6485.equals(arg0.field6485);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V", line = 27)
    public final void method2852(int arg0) {
        if (!this.field6487) {
            this.field6486 = true;
            this.field6487 = true;
        } else if (this.field6486) {
            this.field6486 = false;
        } else {
            this.field6487 = false;
        }
        if (arg0 != 443) {
            this.method2851(null, (byte) 49);
        }
        field6482++;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(B)Lvi;", line = 61)
    public static final class370 method2853(byte arg0) {
        if (arg0 > -59) {
            method2853((byte) 86);
        }
        field6488++;
        return class462.field6425.length > class493.field6910 ? class462.field6425[class493.field6910++] : null;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lrp;I)Ljg;", line = 82)
    public final class246 method2854(class135 arg0, int arg1) {
        if (arg1 != 443) {
            this.method2854(null, -37);
        }
        field6490++;
        return arg0.method862(this.field6485, (byte) -84, this.field6487 ? this.field6483 : this.field6489, this.field6486);
    }
}
