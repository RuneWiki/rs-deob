import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class324 extends class573 {

    @OriginalMember(owner = "client!db", name = "G", descriptor = "I")
    private int field4633;

    @OriginalMember(owner = "client!db", name = "E", descriptor = "I")
    private int field4631;

    @OriginalMember(owner = "client!db", name = "s", descriptor = "I")
    private int field4620;

    @OriginalMember(owner = "client!db", name = "y", descriptor = "I")
    private int field4626;

    @OriginalMember(owner = "client!db", name = "z", descriptor = "Z")
    public static boolean field4627 = false;

    @OriginalMember(owner = "client!db", name = "p", descriptor = "Lcda;")
    public static class172 field4617 = new class172("LIVE", 0);

    @OriginalMember(owner = "client!db", name = "q", descriptor = "I")
    private int field4618;

    @OriginalMember(owner = "client!db", name = "r", descriptor = "I")
    public static int field4619;

    @OriginalMember(owner = "client!db", name = "t", descriptor = "I")
    public static int field4621;

    @OriginalMember(owner = "client!db", name = "u", descriptor = "I")
    private int field4622;

    @OriginalMember(owner = "client!db", name = "v", descriptor = "I")
    public static int field4623;

    @OriginalMember(owner = "client!db", name = "w", descriptor = "I")
    public static int field4624;

    @OriginalMember(owner = "client!db", name = "x", descriptor = "I")
    private int field4625;

    @OriginalMember(owner = "client!db", name = "D", descriptor = "I")
    public static int field4630;

    @OriginalMember(owner = "client!db", name = "H", descriptor = "I")
    private int field4634;

    @OriginalMember(owner = "client!db", name = "B", descriptor = "[B")
    private byte[] field4629;

    @OriginalMember(owner = "client!db", name = "F", descriptor = "[I")
    public static int[] field4632;

    @OriginalMember(owner = "client!db", name = "A", descriptor = "[[B")
    public static byte[][] field4628;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ZB)I")
    public static final int method2058(boolean arg0, byte arg1) {
        field4621++;
        int var2 = 88 / ((arg1 - 56) / 32);
        int var3 = class22.field234;
        if (var3 == 0) {
            return arg0 ? 0 : class210.field3078;
        } else if (var3 == 1) {
            return class210.field3078;
        } else if (var3 == 2) {
            return 0;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IBI)V")
    public void method1993(int arg0, byte arg1, int arg2) {
        if (arg0 != 4096) {
            method2058(false, (byte) 72);
        }
        this.field4629[arg2] = arg1;
        field4619++;
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(B)V")
    public final void method2059(byte arg0) {
        if (arg0 < -7) {
            this.field4634 = 0;
            this.field4622 = 0;
            field4623++;
        }
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(IIIIIFFF)V")
    public class324(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field4633 = (int) (arg7 * 4096.0F);
        this.field4631 = (int) (arg6 * 4096.0F);
        this.field4626 = this.field4620 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V")
    public final void method2060(byte arg0) {
        if (arg0 <= 43) {
            this.method2059((byte) 41);
        }
        this.field4634 >>= 0x4;
        this.field4626 = this.field4620;
        field4630++;
        if (this.field4634 < 0) {
            this.field4634 = 0;
        } else if (this.field4634 > 255) {
            this.field4634 = 255;
        }
        this.method1993(4096, (byte) this.field4634, this.field4622++);
        this.field4634 = 0;
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(I)V")
    public static void method2061(int arg0) {
        field4632 = null;
        field4617 = null;
        field4628 = null;
        if (arg0 != -10056) {
            field4627 = false;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(BII)V")
    public final void method2062(byte arg0, int arg1, int arg2) {
        field4624++;
        if (arg2 == 0) {
            this.field4625 = this.field4631 - (arg1 >= 0 ? arg1 : -arg1);
            this.field4618 = 4096;
            this.field4625 = this.field4625 * this.field4625 >> 12;
            this.field4634 = this.field4625;
        } else {
            this.field4618 = this.field4633 * this.field4625 >> 12;
            this.field4625 = this.field4631 - (arg1 >= 0 ? arg1 : -arg1);
            if (this.field4618 < 0) {
                this.field4618 = 0;
            } else if (this.field4618 > 4096) {
                this.field4618 = 4096;
            }
            this.field4625 = this.field4625 * this.field4625 >> 12;
            this.field4625 = this.field4625 * this.field4618 >> 12;
            this.field4634 += this.field4626 * this.field4625 >> 12;
            this.field4626 = this.field4626 * this.field4620 >> 12;
        }
        if (arg0 <= 124) {
            this.field4634 = 3;
        }
    }
}
