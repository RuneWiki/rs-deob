import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!raa")
public abstract class class609 extends class184 {

    @OriginalMember(owner = "client!raa", name = "m", descriptor = "I")
    private int field8610;

    @OriginalMember(owner = "client!raa", name = "r", descriptor = "I")
    public int field8615;

    @OriginalMember(owner = "client!raa", name = "q", descriptor = "I")
    public int field8614;

    @OriginalMember(owner = "client!raa", name = "n", descriptor = "I")
    public int field8611;

    @OriginalMember(owner = "client!raa", name = "x", descriptor = "I")
    private int field8621;

    @OriginalMember(owner = "client!raa", name = "t", descriptor = "F")
    public float field8617;

    @OriginalMember(owner = "client!raa", name = "p", descriptor = "Lsca;")
    public static class46 field8613 = null;

    @OriginalMember(owner = "client!raa", name = "o", descriptor = "I")
    public static int field8612;

    @OriginalMember(owner = "client!raa", name = "s", descriptor = "I")
    public static int field8616;

    @OriginalMember(owner = "client!raa", name = "u", descriptor = "I")
    public static int field8618;

    @OriginalMember(owner = "client!raa", name = "v", descriptor = "I")
    public static int field8619;

    @OriginalMember(owner = "client!raa", name = "w", descriptor = "I")
    public static int field8620;

    @OriginalMember(owner = "client!raa", name = "y", descriptor = "I")
    public static int field8622;

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(I)I", line = 8)
    public final int method3531(int arg0) {
        if (arg0 == 20597) {
            field8616++;
            return this.field8615;
        } else {
            return 77;
        }
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(B)V", line = 22)
    public static void method3532(byte arg0) {
        field8613 = null;
        if (arg0 != -102) {
            method3532((byte) 7);
        }
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(Z)I", line = 33)
    public final int method3533(boolean arg0) {
        field8612++;
        if (arg0) {
            this.field8610 = -108;
        }
        return this.field8611;
    }

    @OriginalMember(owner = "client!raa", name = "b", descriptor = "(I)I", line = 47)
    public final int method3534(int arg0) {
        field8619++;
        int var2 = -85 / ((-arg0 - 33) / 50);
        return this.field8610;
    }

    @OriginalMember(owner = "client!raa", name = "b", descriptor = "(B)F", line = 59)
    public final float method3535(byte arg0) {
        if (arg0 != -41) {
            this.method3535((byte) 89);
        }
        field8622++;
        return this.field8617;
    }

    @OriginalMember(owner = "client!raa", name = "c", descriptor = "(I)I", line = 70)
    public final int method3536(int arg0) {
        field8620++;
        return arg0 == 24108 ? this.field8614 : 121;
    }

    @OriginalMember(owner = "client!raa", name = "<init>", descriptor = "(IIIIIF)V", line = 88)
    public class609(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        this.field8610 = arg4;
        this.field8615 = arg2;
        this.field8614 = arg1;
        this.field8611 = arg0;
        this.field8621 = arg3;
        this.field8617 = arg5;
    }

    @OriginalMember(owner = "client!raa", name = "e", descriptor = "(I)I", line = 101)
    public final int method3537(int arg0) {
        if (arg0 != 6490) {
            this.method881(-50, 100, 105, true);
        }
        field8618++;
        return this.field8621;
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(FI)V")
    public abstract void method879(float arg0, int arg1);

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(IIIZ)V")
    public abstract void method881(int arg0, int arg1, int arg2, boolean arg3);
}
