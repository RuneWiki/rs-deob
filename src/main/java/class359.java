import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public class class359 extends class372 implements class154 {

    @OriginalMember(owner = "client!lp", name = "A", descriptor = "Lbv;")
    private class279 field4779;

    @OriginalMember(owner = "client!lp", name = "B", descriptor = "Lwo;")
    public static class690 field4780 = new class690(71, 6);

    @OriginalMember(owner = "client!lp", name = "E", descriptor = "[I")
    public static int[] field4783 = new int[8];

    @OriginalMember(owner = "client!lp", name = "I", descriptor = "[I")
    public static int[] field4787 = new int[32];

    @OriginalMember(owner = "client!lp", name = "H", descriptor = "[I")
    public static int[] field4786 = new int[500];

    @OriginalMember(owner = "client!lp", name = "v", descriptor = "I")
    public static int field4774;

    @OriginalMember(owner = "client!lp", name = "w", descriptor = "I")
    public static int field4775;

    @OriginalMember(owner = "client!lp", name = "x", descriptor = "I")
    public static int field4776;

    @OriginalMember(owner = "client!lp", name = "y", descriptor = "I")
    public static int field4777;

    @OriginalMember(owner = "client!lp", name = "z", descriptor = "I")
    public static int field4778;

    @OriginalMember(owner = "client!lp", name = "C", descriptor = "I")
    public static int field4781;

    @OriginalMember(owner = "client!lp", name = "D", descriptor = "I")
    public static int field4782;

    @OriginalMember(owner = "client!lp", name = "F", descriptor = "I")
    public static int field4784;

    @OriginalMember(owner = "client!lp", name = "G", descriptor = "I")
    public static int field4785;

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(I)Z")
    public final boolean method15(int arg0) {
        ++field4775;
        if (arg0 != -1969) {
            this.method14(false, (byte) -120);
        }
        return super.method2172(super.field5016.field4658, 20);
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(Z)Lbv;")
    public final class279 method12(boolean arg0) {
        if (!arg0) {
            this.method15(-76);
        }
        ++field4774;
        return this.field4779;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(ZB)Ljaclib/memory/Buffer;")
    public final Buffer method14(boolean arg0, byte arg1) {
        ++field4776;
        return arg1 != -60 ? null : super.method2170(-28650, super.field5016.field4658, arg0);
    }

    @OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(Ldda;Lbv;Z)V")
    public class359(class349 arg0, class279 arg1, boolean arg2) {
        super(arg0, 34963, arg2);
        this.field4779 = arg1;
    }

    @OriginalMember(owner = "client!lp", name = "e", descriptor = "(I)V")
    public static void method2017(int arg0) {
        field4780 = null;
        field4786 = null;
        field4783 = null;
        field4787 = null;
        if (arg0 != 500) {
            field4784 = 93;
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "([IIIII)V")
    public static final void method2018(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        --arg4;
        ++field4781;
        int var5 = 47 / ((arg2 - 16) / 46);
        int var7 = arg1 - 1;
        int var6 = var7 - 7;
        while (~arg4 > ~var6) {
            int var8 = arg4 + 1;
            arg0[var8] = arg3;
            int var9 = var8 + 1;
            arg0[var9] = arg3;
            int var10 = var9 + 1;
            arg0[var10] = arg3;
            int var11 = var10 + 1;
            arg0[var11] = arg3;
            int var12 = var11 + 1;
            arg0[var12] = arg3;
            int var13 = var12 + 1;
            arg0[var13] = arg3;
            int var14 = var13 + 1;
            arg0[var14] = arg3;
            arg4 = var14 + 1;
            arg0[arg4] = arg3;
        }
        while (var7 > arg4) {
            ++arg4;
            arg0[arg4] = arg3;
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(II)V")
    public final void method13(int arg0, int arg1) {
        ++field4777;
        super.method13(this.field4779.field3788 * arg0, arg1);
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(B)V")
    public final void method11(byte arg0) {
        int var2 = 38 / ((arg0 - -86) / 37);
        ++field4782;
        super.method11((byte) 40);
    }

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "(I)I")
    public final int method16(int arg0) {
        if (arg0 != 34962) {
            method2018((int[]) null, 48, -29, 96, -117);
        }
        ++field4778;
        return super.method16(arg0);
    }
}
