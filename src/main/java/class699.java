import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public class class699 {

    @OriginalMember(owner = "client!gv", name = "d", descriptor = "I")
    public int field9731 = 128;

    @OriginalMember(owner = "client!gv", name = "k", descriptor = "I")
    public int field9738 = 128;

    @OriginalMember(owner = "client!gv", name = "j", descriptor = "I")
    public int field9737;

    @OriginalMember(owner = "client!gv", name = "q", descriptor = "I")
    public int field9744;

    @OriginalMember(owner = "client!gv", name = "i", descriptor = "I")
    public int field9736;

    @OriginalMember(owner = "client!gv", name = "e", descriptor = "I")
    public int field9732;

    @OriginalMember(owner = "client!gv", name = "n", descriptor = "Lqk;")
    public static class148 field9741 = new class148(16, 7);

    @OriginalMember(owner = "client!gv", name = "p", descriptor = "Z")
    public static boolean field9743 = false;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "I")
    public static int field9728;

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "I")
    public int field9729;

    @OriginalMember(owner = "client!gv", name = "c", descriptor = "I")
    public int field9730;

    @OriginalMember(owner = "client!gv", name = "f", descriptor = "I")
    public static int field9733;

    @OriginalMember(owner = "client!gv", name = "g", descriptor = "I")
    public static int field9734;

    @OriginalMember(owner = "client!gv", name = "h", descriptor = "I")
    public int field9735;

    @OriginalMember(owner = "client!gv", name = "l", descriptor = "I")
    public int field9739;

    @OriginalMember(owner = "client!gv", name = "m", descriptor = "I")
    public static int field9740;

    @OriginalMember(owner = "client!gv", name = "o", descriptor = "I")
    public int field9742;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(BLgv;)V", line = 6)
    public final void method3943(byte arg0, class699 arg1) {
        this.field9744 = arg1.field9744;
        this.field9732 = arg1.field9732;
        this.field9738 = arg1.field9738;
        this.field9731 = arg1.field9731;
        int var3 = 16 / ((54 - arg0) / 36);
        this.field9737 = arg1.field9737;
        field9733++;
        this.field9736 = arg1.field9736;
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(Z)V", line = 21)
    public static void method3944(boolean arg0) {
        if (!arg0) {
            field9741 = null;
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(III)V", line = 31)
    public static final void method3945(int arg0, int arg1, int arg2) {
        if (arg0 != 128) {
            method3945(-52, 94, -2);
        }
        class429.field5920 = arg2 - class531.field7447;
        field9734++;
        class313.field4031 = arg1 - class531.field7452;
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(ID)V", line = 53)
    public static final void method3946(int arg0, double arg1) {
        field9728++;
        if (class317.field4078 != arg1) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg1) * 255.0D);
                class323.field4157[var3] = var4 <= 255 ? var4 : 255;
            }
            class317.field4078 = arg1;
        }
        if (arg0 != 128) {
            field9743 = false;
        }
    }

    @OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(I)V", line = 105)
    public class699(int arg0) {
        this.field9737 = arg0;
    }

    @OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(IIIIII)V", line = 112)
    private class699(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field9744 = arg4;
        this.field9736 = arg5;
        this.field9732 = arg3;
        this.field9737 = arg0;
        this.field9731 = arg1;
        this.field9738 = arg2;
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(I)Lgv;", line = 82)
    public final class699 method3947(int arg0) {
        if (arg0 == 0) {
            field9740++;
            return new class699(this.field9737, this.field9731, this.field9738, this.field9732, this.field9744, this.field9736);
        } else {
            return null;
        }
    }
}
