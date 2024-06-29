import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public class class619 extends class750 {

    @OriginalMember(owner = "client!nu", name = "p", descriptor = "I")
    private int field8606;

    @OriginalMember(owner = "client!nu", name = "u", descriptor = "I")
    private int field8611;

    @OriginalMember(owner = "client!nu", name = "r", descriptor = "I")
    private int field8608;

    @OriginalMember(owner = "client!nu", name = "o", descriptor = "I")
    private int field8605;

    @OriginalMember(owner = "client!nu", name = "A", descriptor = "[I")
    public static int[] field8617 = new int[1000];

    @OriginalMember(owner = "client!nu", name = "t", descriptor = "Lnaa;")
    public static class79 field8610 = class504.method2881(-16647);

    @OriginalMember(owner = "client!nu", name = "D", descriptor = "Lfja;")
    public static class783 field8620 = new class783(105, -1);

    @OriginalMember(owner = "client!nu", name = "E", descriptor = "Lfja;")
    public static class783 field8621 = new class783(15, 8);

    @OriginalMember(owner = "client!nu", name = "m", descriptor = "I")
    private int field8603;

    @OriginalMember(owner = "client!nu", name = "n", descriptor = "I")
    private int field8604;

    @OriginalMember(owner = "client!nu", name = "q", descriptor = "I")
    public static int field8607;

    @OriginalMember(owner = "client!nu", name = "s", descriptor = "I")
    public static int field8609;

    @OriginalMember(owner = "client!nu", name = "v", descriptor = "I")
    private int field8612;

    @OriginalMember(owner = "client!nu", name = "w", descriptor = "I")
    public static int field8613;

    @OriginalMember(owner = "client!nu", name = "x", descriptor = "I")
    public static int field8614;

    @OriginalMember(owner = "client!nu", name = "y", descriptor = "I")
    public static int field8615;

    @OriginalMember(owner = "client!nu", name = "z", descriptor = "I")
    public static int field8616;

    @OriginalMember(owner = "client!nu", name = "B", descriptor = "I")
    private int field8618;

    @OriginalMember(owner = "client!nu", name = "F", descriptor = "Lgj;")
    public static class662 field8622;

    @OriginalMember(owner = "client!nu", name = "G", descriptor = "Ljava/lang/String;")
    public static String field8623;

    @OriginalMember(owner = "client!nu", name = "C", descriptor = "[B")
    private byte[] field8619;

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(IIB)V", line = 5)
    public final void method3437(int arg0, int arg1, byte arg2) {
        if (arg0 == 0) {
            this.field8604 = this.field8611 - (arg1 < 0 ? -arg1 : arg1);
            this.field8604 = this.field8604 * this.field8604 >> 12;
            this.field8603 = 4096;
            this.field8618 = this.field8604;
        } else {
            this.field8603 = this.field8606 * this.field8604 >> 12;
            if (this.field8603 < 0) {
                this.field8603 = 0;
            } else if (this.field8603 > 4096) {
                this.field8603 = 4096;
            }
            this.field8604 = this.field8611 - (arg1 >= 0 ? arg1 : -arg1);
            this.field8604 = this.field8604 * this.field8604 >> 12;
            this.field8604 = this.field8604 * this.field8603 >> 12;
            this.field8618 += this.field8605 * this.field8604 >> 12;
            this.field8605 = this.field8608 * this.field8605 >> 12;
        }
        field8614++;
        if (arg2 != 58) {
            this.method3437(60, -41, (byte) 66);
        }
    }

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "(II)V", line = 41)
    public static final void method3489(int arg0, int arg1) {
        if (arg0 == -1) {
            field8616++;
            class281 var2 = class54.method395((byte) -53, (long) arg1, 6);
            var2.method1818((byte) 87);
        }
    }

    @OriginalMember(owner = "client!nu", name = "<init>", descriptor = "(IIIIIFFF)V", line = 57)
    public class619(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field8606 = (int) (arg7 * 4096.0F);
        this.field8611 = (int) (arg6 * 4096.0F);
        this.field8605 = this.field8608 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(Z)V", line = 73)
    public final void method3436(boolean arg0) {
        this.field8618 = 0;
        field8613++;
        this.field8612 = 0;
        if (!arg0) {
            field8620 = null;
        }
    }

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "(Z)V", line = 89)
    public final void method3438(boolean arg0) {
        this.field8618 >>= 0x4;
        this.field8605 = this.field8608;
        field8607++;
        if (this.field8618 < 0) {
            this.field8618 = 0;
        } else if (this.field8618 > 255) {
            this.field8618 = 255;
        }
        if (arg0) {
            this.method392((byte) this.field8618, 8232, this.field8612++);
            this.field8618 = 0;
        }
    }

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "(I)V", line = 110)
    public static void method3490(int arg0) {
        field8610 = null;
        field8623 = null;
        if (arg0 < 4) {
            field8609 = -104;
        }
        field8622 = null;
        field8617 = null;
        field8621 = null;
        field8620 = null;
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(BII)V", line = 129)
    public void method392(byte arg0, int arg1, int arg2) {
        this.field8619[arg2] = arg0;
        if (arg1 == 8232) {
            field8615++;
        }
    }
}
