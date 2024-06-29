import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class294 {

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "I")
    public static int field4623 = -1;

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "[I")
    public static int[] field4624 = new int[32];

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "Lta;")
    public static class262 field4625 = new class262(64);

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "I")
    public static int field4620;

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "I")
    public static int field4621;

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "I")
    public static int field4622;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
    public static void method1973(int arg0) {
        field4625 = null;
        if (arg0 != 1024) {
            field4624 = null;
        }
        field4624 = null;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(BLka;)V")
    public static final void method1974(byte arg0, class264 arg1) {
        field4622++;
        if (class267.field4256 == arg1.field4219 || arg1.field4210 == -1 || arg1.field4179 != 0 || arg1.field4194 + 1 > class28.method224(arg1.field4210, 58).field3488[arg1.field4185]) {
            int var2 = arg1.field4219 - arg1.field4201;
            int var3 = class267.field4256 - arg1.field4201;
            int var4 = arg1.field4126 * 128 + arg1.method226((byte) -97) * 64;
            int var5 = arg1.field4142 * 128 + (arg1.method226((byte) -97) * 64);
            int var6 = arg1.field4125 * 128 + arg1.method226((byte) -97) * 64;
            int var7 = arg1.field4141 * 128 + arg1.method226((byte) -97) * 64;
            arg1.field4123 = ((var2 - var3) * var5 + var3 * var7) / var2;
            arg1.field4176 = ((var2 - var3) * var4 + var3 * var6) / var2;
        }
        arg1.field4178 = 0;
        int var8 = -6 / ((48 - arg0) / 47);
        if (arg1.field4218 == 0) {
            arg1.field4199 = 1024;
        }
        if (arg1.field4218 == 1) {
            arg1.field4199 = 1536;
        }
        if (arg1.field4218 == 2) {
            arg1.field4199 = 0;
        }
        if (arg1.field4218 == 3) {
            arg1.field4199 = 512;
        }
        arg1.field4159 = arg1.field4199;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I[I[Ljava/lang/Object;IB)V")
    public static final void method1975(int arg0, int[] arg1, Object[] arg2, int arg3, byte arg4) {
        if (arg4 < 104) {
            method1974((byte) 103, (class264) null);
        }
        field4620++;
        if (arg3 >= arg0) {
            return;
        }
        int var5 = (arg0 + arg3) / 2;
        int var6 = arg3;
        int var7 = arg1[var5];
        arg1[var5] = arg1[arg0];
        arg1[arg0] = var7;
        Object var8 = arg2[var5];
        arg2[var5] = arg2[arg0];
        arg2[arg0] = var8;
        for (int var9 = arg3; var9 < arg0; var9++) {
            if ((var9 & 0x1) + var7 > arg1[var9]) {
                int var10 = arg1[var9];
                arg1[var9] = arg1[var6];
                arg1[var6] = var10;
                Object var11 = arg2[var9];
                arg2[var9] = arg2[var6];
                arg2[var6++] = var11;
            }
        }
        arg1[arg0] = arg1[var6];
        arg1[var6] = var7;
        arg2[arg0] = arg2[var6];
        arg2[var6] = var8;
        method1975(var6 - 1, arg1, arg2, arg3, (byte) 113);
        method1975(arg0, arg1, arg2, var6 + 1, (byte) 115);
    }
}
