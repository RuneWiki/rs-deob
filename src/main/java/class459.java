import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mw")
public class class459 {

    @OriginalMember(owner = "client!mw", name = "h", descriptor = "I")
    private int field6549 = 0;

    @OriginalMember(owner = "client!mw", name = "e", descriptor = "I")
    private int field6546 = 0;

    @OriginalMember(owner = "client!mw", name = "m", descriptor = "I")
    private int field6554 = 0;

    @OriginalMember(owner = "client!mw", name = "o", descriptor = "Lum;")
    private class487 field6556 = null;

    @OriginalMember(owner = "client!mw", name = "f", descriptor = "Lus;")
    private class1 field6547;

    @OriginalMember(owner = "client!mw", name = "c", descriptor = "Lvb;")
    private class180 field6544;

    @OriginalMember(owner = "client!mw", name = "l", descriptor = "[Ljg;")
    private class312[] field6553;

    @OriginalMember(owner = "client!mw", name = "g", descriptor = "Lnh;")
    public class694 field6548;

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "[Lqe;")
    public static class436[] field6542 = new class436[1024];

    @OriginalMember(owner = "client!mw", name = "i", descriptor = "Lqfa;")
    public static class85 field6550 = new class85(35, 0);

    @OriginalMember(owner = "client!mw", name = "q", descriptor = "I")
    public static int field6558 = -1;

    @OriginalMember(owner = "client!mw", name = "s", descriptor = "I")
    public static int field6560 = -1;

    @OriginalMember(owner = "client!mw", name = "t", descriptor = "[I")
    public static int[] field6561 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!mw", name = "b", descriptor = "I")
    public static int field6543;

    @OriginalMember(owner = "client!mw", name = "d", descriptor = "I")
    public static int field6545;

    @OriginalMember(owner = "client!mw", name = "j", descriptor = "I")
    public static int field6551;

    @OriginalMember(owner = "client!mw", name = "k", descriptor = "I")
    public static int field6552;

    @OriginalMember(owner = "client!mw", name = "n", descriptor = "I")
    public static int field6555;

    @OriginalMember(owner = "client!mw", name = "p", descriptor = "I")
    public static int field6557;

    @OriginalMember(owner = "client!mw", name = "r", descriptor = "Lr;")
    public static class167 field6559;

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(B)V")
    public static void method2750(byte arg0) {
        if (arg0 >= -23) {
            method2752(30);
        }
        field6561 = null;
        field6550 = null;
        field6542 = null;
        field6559 = null;
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(FFFII)F")
    public static final float method2751(float arg0, float arg1, float arg2, int arg3, int arg4) {
        field6555++;
        float[] var5 = class508.field7193[arg4];
        int var6 = 57 / ((arg3 - 71) / 38);
        return var5[2] * arg2 + var5[0] * arg0 + var5[1] * arg1;
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(I)V")
    public static final void method2752(int arg0) {
        if (arg0 == 15918) {
            class111.field2009.method782(false);
            field6552++;
        }
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(IILss;FFFIFIIF)[B")
    public static final byte[] method2753(int arg0, int arg1, class400 arg2, float arg3, float arg4, float arg5, int arg6, float arg7, int arg8, int arg9, float arg10) {
        field6543++;
        if (arg8 > -93) {
            return null;
        } else {
            byte[] var11 = new byte[arg1 * arg6 * arg9];
            class594.method3391(arg9, arg1, -5843, 0, arg3, arg6, arg2, var11, arg4, arg0, arg10, arg5, arg7);
            return var11;
        }
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(IILum;)Z")
    public final boolean method2754(int arg0, int arg1, class487 arg2) {
        field6551++;
        if (this.field6554 == 0) {
            return false;
        }
        if (arg1 != 2) {
            field6559 = null;
        }
        if (this.field6556 != arg2) {
            this.field6553[this.field6554 & Integer.MAX_VALUE].method244(arg0, (byte) -126, arg2);
            this.field6556 = arg2;
        }
        return true;
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(IIIZZI)V")
    public final void method2755(int arg0, int arg1, int arg2, boolean arg3, boolean arg4, int arg5) {
        if (arg1 >= -39) {
            this.method2756(22, -11);
        }
        field6557++;
        boolean var7 = arg4 & this.field6547.method31();
        if (!var7 && (arg5 == 4 || arg5 == 8 || arg5 == 9)) {
            if (arg5 == 4) {
                arg2 = arg0;
            }
            arg5 = 2;
        }
        if (arg5 != 0 && arg3) {
            arg5 |= Integer.MIN_VALUE;
        }
        if (this.field6554 != arg5) {
            if (this.field6554 != 0) {
                this.field6553[Integer.MAX_VALUE & this.field6554].method241(-123);
            }
            if (arg5 != 0) {
                this.field6553[Integer.MAX_VALUE & arg5].method243(arg3, false);
                this.field6553[arg5 & Integer.MAX_VALUE].method240(arg3, 127);
                this.field6553[arg5 & Integer.MAX_VALUE].method238(arg2, arg0, (byte) 121);
            }
            this.field6556 = null;
            this.field6549 = arg0;
            this.field6546 = arg2;
            this.field6554 = arg5;
        } else if (this.field6554 != 0) {
            this.field6553[Integer.MAX_VALUE & this.field6554].method240(arg3, 111);
            if (this.field6549 != arg0 || this.field6546 != arg2) {
                this.field6553[this.field6554 & Integer.MAX_VALUE].method238(arg2, arg0, (byte) -54);
                this.field6549 = arg0;
                this.field6546 = arg2;
            }
        }
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(II)Z")
    public final boolean method2756(int arg0, int arg1) {
        if (arg0 != 9) {
            method2753(-127, 16, null, 0.30069864F, 1.2941142F, 0.75274795F, -128, -0.52720916F, -123, -1, 0.24659234F);
        }
        field6545++;
        return this.field6553[arg1].method242((byte) -35);
    }

    @OriginalMember(owner = "client!mw", name = "<init>", descriptor = "(Lus;)V")
    public class459(class1 arg0) {
        this.field6547 = arg0;
        this.field6544 = new class180(arg0);
        this.field6553 = new class312[10];
        this.field6553[1] = new class290(arg0);
        this.field6553[2] = new class259(arg0, this.field6544);
        this.field6553[4] = new class362(arg0, this.field6544);
        this.field6553[5] = new class474(arg0, this.field6544);
        this.field6553[6] = new class181(arg0);
        this.field6553[7] = new class392(arg0);
        this.field6553[3] = this.field6548 = new class694(arg0);
        this.field6553[8] = new class364(arg0, this.field6544);
        this.field6553[9] = new class5(arg0, this.field6544);
        if (!this.field6553[8].method242((byte) 96)) {
            this.field6553[8] = this.field6553[4];
        }
        if (!this.field6553[9].method242((byte) -111)) {
            this.field6553[9] = this.field6553[8];
        }
    }
}
