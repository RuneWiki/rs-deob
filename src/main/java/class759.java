import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public abstract class class759 extends class65 {

    @OriginalMember(owner = "client!vt", name = "p", descriptor = "I")
    private int field10588;

    @OriginalMember(owner = "client!vt", name = "m", descriptor = "I")
    private int field10585;

    @OriginalMember(owner = "client!vt", name = "q", descriptor = "F")
    public float field10589;

    @OriginalMember(owner = "client!vt", name = "l", descriptor = "I")
    public int field10584;

    @OriginalMember(owner = "client!vt", name = "u", descriptor = "I")
    public int field10593;

    @OriginalMember(owner = "client!vt", name = "v", descriptor = "I")
    public int field10594;

    @OriginalMember(owner = "client!vt", name = "x", descriptor = "D")
    public static double field10596;

    @OriginalMember(owner = "client!vt", name = "k", descriptor = "I")
    public static int field10583;

    @OriginalMember(owner = "client!vt", name = "n", descriptor = "I")
    public static int field10586;

    @OriginalMember(owner = "client!vt", name = "o", descriptor = "I")
    public static int field10587;

    @OriginalMember(owner = "client!vt", name = "r", descriptor = "I")
    public static int field10590;

    @OriginalMember(owner = "client!vt", name = "s", descriptor = "I")
    public static int field10591;

    @OriginalMember(owner = "client!vt", name = "t", descriptor = "I")
    public static int field10592;

    @OriginalMember(owner = "client!vt", name = "w", descriptor = "I")
    public static int field10595;

    @OriginalMember(owner = "client!vt", name = "y", descriptor = "I")
    public static int field10597;

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(IIIB)V")
    public abstract void method8(int arg0, int arg1, int arg2, byte arg3);

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(ZF)V")
    public abstract void method9(boolean arg0, float arg1);

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(B)I")
    public final int method4221(byte arg0) {
        field10586++;
        if (arg0 != -7) {
            field10596 = 0.6594043173106261D;
        }
        return this.field10593;
    }

    @OriginalMember(owner = "client!vt", name = "e", descriptor = "(B)V")
    public static final void method4222(byte arg0) {
        class565.field8015.method1268(class442.field6428, class416.field6111, class467.field6802);
        field10595++;
        if (arg0 <= 32) {
            field10596 = -0.12262983956273175D;
        }
    }

    @OriginalMember(owner = "client!vt", name = "f", descriptor = "(B)I")
    public final int method4223(byte arg0) {
        if (arg0 >= -8) {
            return -103;
        } else {
            field10583++;
            return this.field10584;
        }
    }

    @OriginalMember(owner = "client!vt", name = "g", descriptor = "(B)I")
    public final int method4224(byte arg0) {
        field10587++;
        if (arg0 <= 126) {
            this.field10593 = 75;
        }
        return this.field10585;
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(ILgba;)I")
    public static final int method4225(int arg0, class702 arg1) {
        if (arg0 <= 74) {
            method4225(30, null);
        }
        field10590++;
        int var2 = arg1.method3905(-4, 2);
        int var3;
        if (var2 == 0) {
            var3 = 0;
        } else if (var2 == 1) {
            var3 = arg1.method3905(-4, 5);
        } else if (var2 == 2) {
            var3 = arg1.method3905(-4, 8);
        } else {
            var3 = arg1.method3905(-4, 11);
        }
        return var3;
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(I)F")
    public final float method4226(int arg0) {
        field10591++;
        return arg0 == 5 ? this.field10589 : -0.21725684F;
    }

    @OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(IIIIIF)V")
    public class759(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        this.field10588 = arg4;
        this.field10585 = arg3;
        this.field10589 = arg5;
        this.field10584 = arg2;
        this.field10593 = arg1;
        this.field10594 = arg0;
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(Z)I")
    public final int method4227(boolean arg0) {
        field10592++;
        if (arg0) {
            this.method4221((byte) 49);
        }
        return this.field10588;
    }

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "(I)I")
    public final int method4228(int arg0) {
        field10597++;
        if (arg0 >= -103) {
            this.method8(66, -119, -14, (byte) 71);
        }
        return this.field10594;
    }
}
