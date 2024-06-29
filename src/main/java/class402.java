import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class402 extends class223 {

    @OriginalMember(owner = "client!ul", name = "n", descriptor = "I")
    public int field5953;

    @OriginalMember(owner = "client!ul", name = "l", descriptor = "I")
    public int field5951;

    @OriginalMember(owner = "client!ul", name = "r", descriptor = "I")
    public int field5957;

    @OriginalMember(owner = "client!ul", name = "z", descriptor = "I")
    public int field5965;

    @OriginalMember(owner = "client!ul", name = "x", descriptor = "I")
    private int field5963;

    @OriginalMember(owner = "client!ul", name = "u", descriptor = "I")
    private int field5960;

    @OriginalMember(owner = "client!ul", name = "q", descriptor = "I")
    private int field5956;

    @OriginalMember(owner = "client!ul", name = "w", descriptor = "I")
    private int field5962;

    @OriginalMember(owner = "client!ul", name = "t", descriptor = "I")
    private int field5959;

    @OriginalMember(owner = "client!ul", name = "p", descriptor = "Lbg;")
    public static class324 field5955 = new class324(96, 2);

    @OriginalMember(owner = "client!ul", name = "D", descriptor = "[F")
    public static float[] field5968 = new float[4];

    @OriginalMember(owner = "client!ul", name = "A", descriptor = "Lbg;")
    public static class324 field5966 = new class324(94, 0);

    @OriginalMember(owner = "client!ul", name = "F", descriptor = "Lfa;")
    public static class156 field5970 = new class156(8);

    @OriginalMember(owner = "client!ul", name = "G", descriptor = "I")
    public static int field5971 = 0;

    @OriginalMember(owner = "client!ul", name = "m", descriptor = "I")
    public static int field5952;

    @OriginalMember(owner = "client!ul", name = "o", descriptor = "I")
    public static int field5954;

    @OriginalMember(owner = "client!ul", name = "s", descriptor = "I")
    public static int field5958;

    @OriginalMember(owner = "client!ul", name = "v", descriptor = "I")
    public static int field5961;

    @OriginalMember(owner = "client!ul", name = "y", descriptor = "I")
    public static int field5964;

    @OriginalMember(owner = "client!ul", name = "B", descriptor = "I")
    public static int field5967;

    @OriginalMember(owner = "client!ul", name = "E", descriptor = "I")
    public static int field5969;

    @OriginalMember(owner = "client!ul", name = "H", descriptor = "I")
    public static int field5972;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "([IIII)V")
    public final void method2467(int[] arg0, int arg1, int arg2, int arg3) {
        arg0[2] = arg3 + this.field5953 - this.field5962;
        arg0[1] = this.field5965 + arg2 - this.field5960;
        field5964++;
        arg0[arg1] = 0;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(III[I)V")
    public final void method2468(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[arg2] = this.field5962 + arg0 - this.field5953;
        arg3[0] = this.field5956;
        field5969++;
        arg3[1] = -this.field5965 - (-this.field5960 - arg1);
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(BII)Z")
    public final boolean method2469(byte arg0, int arg1, int arg2) {
        field5954++;
        if (arg0 <= 38) {
            this.field5959 = -125;
        }
        return this.field5960 <= arg2 && arg2 <= this.field5963 && arg1 >= this.field5962 && this.field5959 >= arg1;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIB)Z")
    public final boolean method2470(int arg0, int arg1, byte arg2) {
        field5952++;
        if (arg2 != -58) {
            this.method2467(null, 113, -16, 92);
        }
        return this.field5965 <= arg1 && this.field5951 >= arg1 && arg0 >= this.field5953 && arg0 <= this.field5957;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIII)Z")
    public final boolean method2471(int arg0, int arg1, int arg2, int arg3) {
        int var5 = -54 % ((17 - arg0) / 44);
        field5961++;
        return this.field5956 == arg3 && arg2 >= this.field5960 && arg2 <= this.field5963 && this.field5962 <= arg1 && this.field5959 >= arg1;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)V")
    public static void method2472(int arg0) {
        field5955 = null;
        field5966 = null;
        field5968 = null;
        int var1 = 15 / ((-arg0 - 29) / 58);
        field5970 = null;
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(IIIIIIIII)V")
    public class402(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field5953 = arg6;
        this.field5951 = arg7;
        this.field5957 = arg8;
        this.field5965 = arg5;
        this.field5963 = arg3;
        this.field5960 = arg1;
        this.field5956 = arg0;
        this.field5962 = arg2;
        this.field5959 = arg4;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIIBII)V")
    public static final void method2473(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field5958++;
        for (int var6 = arg5; var6 <= arg1; var6++) {
            class531.method3136(arg0, -110, arg2, arg4, class141.field1996[var6]);
        }
        int var7 = 69 / ((arg3 - 80) / 33);
    }
}
