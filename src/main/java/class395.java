import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class395 extends class513 {

    @OriginalMember(owner = "client!li", name = "o", descriptor = "I")
    private int field5572;

    @OriginalMember(owner = "client!li", name = "t", descriptor = "I")
    public int field5577;

    @OriginalMember(owner = "client!li", name = "q", descriptor = "I")
    private int field5574;

    @OriginalMember(owner = "client!li", name = "k", descriptor = "I")
    public int field5568;

    @OriginalMember(owner = "client!li", name = "p", descriptor = "I")
    public int field5573;

    @OriginalMember(owner = "client!li", name = "m", descriptor = "I")
    private int field5570;

    @OriginalMember(owner = "client!li", name = "u", descriptor = "I")
    public int field5578;

    @OriginalMember(owner = "client!li", name = "x", descriptor = "I")
    private int field5581;

    @OriginalMember(owner = "client!li", name = "w", descriptor = "I")
    private int field5580;

    @OriginalMember(owner = "client!li", name = "v", descriptor = "[I")
    public static int[] field5579 = new int[16384];

    @OriginalMember(owner = "client!li", name = "y", descriptor = "[I")
    public static int[] field5582 = new int[16384];

    @OriginalMember(owner = "client!li", name = "z", descriptor = "J")
    public static long field5583;

    @OriginalMember(owner = "client!li", name = "D", descriptor = "Ljk;")
    public static class585 field5586;

    @OriginalMember(owner = "client!li", name = "A", descriptor = "F")
    public static float field5584;

    @OriginalMember(owner = "client!li", name = "j", descriptor = "I")
    public static int field5567;

    @OriginalMember(owner = "client!li", name = "l", descriptor = "I")
    public static int field5569;

    @OriginalMember(owner = "client!li", name = "n", descriptor = "I")
    public static int field5571;

    @OriginalMember(owner = "client!li", name = "r", descriptor = "I")
    public static int field5575;

    @OriginalMember(owner = "client!li", name = "s", descriptor = "I")
    public static int field5576;

    @OriginalMember(owner = "client!li", name = "B", descriptor = "I")
    public static int field5585;

    @OriginalMember(owner = "client!li", name = "E", descriptor = "[[[I")
    public static int[][][] field5587;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field5579[var2] = (int) (Math.sin((double) var2 * var0) * 16384.0D);
            field5582[var2] = (int) (Math.cos((double) var2 * var0) * 16384.0D);
        }
        field5583 = -1L;
        field5586 = new class585(69, -1);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Z)V", line = 6)
    public static void method2387(boolean arg0) {
        field5582 = null;
        field5586 = null;
        field5579 = null;
        field5587 = null;
        if (arg0) {
            field5579 = null;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IZII)Z", line = 19)
    public final boolean method2388(int arg0, boolean arg1, int arg2, int arg3) {
        if (arg1) {
            method2387(false);
        }
        field5571++;
        return this.field5574 == arg0 && arg3 >= this.field5580 && arg3 <= this.field5572 && arg2 >= this.field5570 && arg2 <= this.field5581;
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(III)Z", line = 37)
    public final boolean method2389(int arg0, int arg1, int arg2) {
        field5569++;
        if (arg1 != 16384) {
            field5585 = 18;
        }
        return this.field5580 <= arg2 && this.field5572 >= arg2 && arg0 >= this.field5570 && this.field5581 >= arg0;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(II[IB)V", line = 58)
    public final void method2390(int arg0, int arg1, int[] arg2, byte arg3) {
        field5576++;
        arg2[0] = this.field5574;
        if (arg3 != -66) {
            this.field5578 = -126;
        }
        arg2[1] = arg1 - (this.field5573 - this.field5580);
        arg2[2] = this.field5570 + arg0 - this.field5568;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I[III)V", line = 72)
    public final void method2391(int arg0, int[] arg1, int arg2, int arg3) {
        field5575++;
        arg1[1] = this.field5573 + arg0 - this.field5580;
        arg1[2] = arg3 + this.field5568 - this.field5570;
        arg1[0] = arg2;
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "(III)Z", line = 82)
    public final boolean method2392(int arg0, int arg1, int arg2) {
        int var4 = -111 / ((arg2 + 74) / 34);
        field5567++;
        return arg0 >= this.field5573 && this.field5577 >= arg0 && this.field5568 <= arg1 && this.field5578 >= arg1;
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "(IIIIIIIII)V", line = 102)
    public class395(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field5572 = arg3;
        this.field5577 = arg7;
        this.field5574 = arg0;
        this.field5568 = arg6;
        this.field5573 = arg5;
        this.field5570 = arg2;
        this.field5578 = arg8;
        this.field5581 = arg4;
        this.field5580 = arg1;
    }
}
