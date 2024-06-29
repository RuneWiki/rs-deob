import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ww")
public abstract class class592 extends class108 {

    @OriginalMember(owner = "client!ww", name = "x", descriptor = "F")
    public float field8559;

    @OriginalMember(owner = "client!ww", name = "u", descriptor = "I")
    public int field8556;

    @OriginalMember(owner = "client!ww", name = "w", descriptor = "I")
    public int field8558;

    @OriginalMember(owner = "client!ww", name = "o", descriptor = "I")
    public int field8550;

    @OriginalMember(owner = "client!ww", name = "B", descriptor = "I")
    private int field8563;

    @OriginalMember(owner = "client!ww", name = "t", descriptor = "I")
    private int field8555;

    @OriginalMember(owner = "client!ww", name = "y", descriptor = "Z")
    public static boolean field8560 = false;

    @OriginalMember(owner = "client!ww", name = "v", descriptor = "I")
    public static int field8557 = -2;

    @OriginalMember(owner = "client!ww", name = "j", descriptor = "I")
    public static int field8545;

    @OriginalMember(owner = "client!ww", name = "l", descriptor = "I")
    public static int field8547;

    @OriginalMember(owner = "client!ww", name = "m", descriptor = "I")
    public static int field8548;

    @OriginalMember(owner = "client!ww", name = "n", descriptor = "I")
    public static int field8549;

    @OriginalMember(owner = "client!ww", name = "q", descriptor = "I")
    public static int field8552;

    @OriginalMember(owner = "client!ww", name = "r", descriptor = "I")
    public static int field8553;

    @OriginalMember(owner = "client!ww", name = "s", descriptor = "I")
    public static int field8554;

    @OriginalMember(owner = "client!ww", name = "z", descriptor = "I")
    public static int field8561;

    @OriginalMember(owner = "client!ww", name = "A", descriptor = "I")
    public static int field8562;

    @OriginalMember(owner = "client!ww", name = "k", descriptor = "Lkr;")
    public static class329 field8546;

    @OriginalMember(owner = "client!ww", name = "p", descriptor = "Lkr;")
    public static class329 field8551;

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(I)I")
    public final int method3414(int arg0) {
        if (arg0 != 232) {
            field8560 = true;
        }
        field8561++;
        return this.field8558;
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(B)I")
    public final int method3415(byte arg0) {
        if (arg0 == 117) {
            field8547++;
            return this.field8550;
        } else {
            return -9;
        }
    }

    @OriginalMember(owner = "client!ww", name = "b", descriptor = "(I)I")
    public final int method3416(int arg0) {
        if (arg0 != -2) {
            this.field8556 = 7;
        }
        field8562++;
        return this.field8556;
    }

    @OriginalMember(owner = "client!ww", name = "c", descriptor = "(I)V")
    public static void method3417(int arg0) {
        field8546 = null;
        field8551 = null;
        if (arg0 < 72) {
            field8551 = null;
        }
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(II)V")
    public static final void method3418(int arg0, int arg1) {
        class145.field1888 = arg1;
        class535.field7468 = 100;
        class35.field537 = -1;
        field8552++;
        field8548 = 3;
        if (arg0 != 4447) {
            method3417(-111);
        }
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(BF)V")
    public abstract void method557(byte arg0, float arg1);

    @OriginalMember(owner = "client!ww", name = "g", descriptor = "(I)I")
    public final int method3419(int arg0) {
        field8553++;
        return arg0 < 79 ? 63 : this.field8555;
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(IIBI)V")
    public abstract void method551(int arg0, int arg1, byte arg2, int arg3);

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(Z)I")
    public final int method3420(boolean arg0) {
        field8545++;
        return arg0 ? this.field8563 : -23;
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(IIB)I")
    public static final int method3421(int arg0, int arg1, byte arg2) {
        int var3 = 111 / ((-arg2 - 57) / 60);
        field8554++;
        return arg0 == 4 || arg0 == 5 ? class273.field3467[arg1 & 0x3] : 256;
    }

    @OriginalMember(owner = "client!ww", name = "h", descriptor = "(I)F")
    public final float method3422(int arg0) {
        if (arg0 <= 40) {
            this.method3415((byte) 127);
        }
        field8549++;
        return this.field8559;
    }

    @OriginalMember(owner = "client!ww", name = "<init>", descriptor = "(IIIIIF)V")
    public class592(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        this.field8559 = arg5;
        this.field8556 = arg1;
        this.field8558 = arg0;
        this.field8550 = arg2;
        this.field8563 = arg3;
        this.field8555 = arg4;
    }
}
