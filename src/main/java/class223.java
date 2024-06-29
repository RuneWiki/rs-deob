import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class223 {

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "I")
    public int field3762;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "I")
    public int field3758;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "I")
    public int field3760;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
    public int field3761;

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "Lce;")
    public static class126 field3759 = class206.method1445(-7923, "Mem:");

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "Lml;")
    public static class160 field3756 = new class160(100);

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "Lml;")
    public static class160 field3763 = new class160(100);

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "Lce;")
    public static class126 field3765 = class206.method1445(-7923, ":duelstake:");

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "I")
    public static int field3764 = 0;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
    public static int field3755;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "I")
    public static int field3757;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "([JIII[I)V", line = 15)
    public static final void method1529(long[] arg0, int arg1, int arg2, int arg3, int[] arg4) {
        field3757++;
        if (arg2 != 10247 || arg3 >= arg1) {
            return;
        }
        int var5 = (arg1 + arg3) / 2;
        int var6 = arg3;
        long var7 = arg0[var5];
        arg0[var5] = arg0[arg1];
        arg0[arg1] = var7;
        int var9 = arg4[var5];
        arg4[var5] = arg4[arg1];
        arg4[arg1] = var9;
        for (int var10 = arg3; var10 < arg1; var10++) {
            if ((long) (var10 & 0x1) + var7 > arg0[var10]) {
                long var11 = arg0[var10];
                arg0[var10] = arg0[var6];
                arg0[var6] = var11;
                int var13 = arg4[var10];
                arg4[var10] = arg4[var6];
                arg4[var6++] = var13;
            }
        }
        arg0[arg1] = arg0[var6];
        arg0[var6] = var7;
        arg4[arg1] = arg4[var6];
        arg4[var6] = var9;
        method1529(arg0, var6 - 1, arg2 ^ 0x0, arg3, arg4);
        method1529(arg0, arg1, 10247, var6 + 1, arg4);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V", line = 79)
    public static void method1530(int arg0) {
        field3756 = null;
        field3763 = null;
        field3759 = null;
        if (arg0 != -1) {
            method1529((long[]) null, 102, -57, 2, (int[]) null);
        }
        field3765 = null;
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "()V", line = 94)
    public class223() {
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lbf;)V", line = 99)
    public class223(class223 arg0) {
        this.field3762 = arg0.field3762;
        this.field3758 = arg0.field3758;
        this.field3760 = arg0.field3760;
        this.field3761 = arg0.field3761;
    }
}
