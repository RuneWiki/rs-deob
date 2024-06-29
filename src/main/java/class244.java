import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class244 extends class88 {

    @OriginalMember(owner = "client!wa", name = "r", descriptor = "Lhj;")
    public class69 field4475;

    @OriginalMember(owner = "client!wa", name = "t", descriptor = "Lhj;")
    public static class69 field4477 = class181.method1318("Fps:", (byte) -119);

    @OriginalMember(owner = "client!wa", name = "w", descriptor = "I")
    public static int field4480;

    @OriginalMember(owner = "client!wa", name = "x", descriptor = "I")
    public static int field4481;

    @OriginalMember(owner = "client!wa", name = "v", descriptor = "Z")
    public static boolean field4479;

    @OriginalMember(owner = "client!wa", name = "s", descriptor = "[I")
    public static int[] field4476;

    @OriginalMember(owner = "client!wa", name = "u", descriptor = "[[S")
    public static short[][] field4478;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(I)V")
    public static void method1733(int arg0) {
        field4477 = null;
        field4478 = null;
        if (arg0 != 4) {
            method1734((int[]) null, 19, 12, 19, -95, 98);
        }
        field4476 = null;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "([IIIIII)V")
    public static final void method1734(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class217 var6 = class158.field2935[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class53 var7 = var6.field3938;
        if (var7 != null) {
            int var8 = var7.field944;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class267 var10 = var6.field3942;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field4746;
        int var12 = var10.field4741;
        int var13 = var10.field4736;
        int var14 = var10.field4755;
        int[] var15 = class19.field250[var11];
        int[] var16 = class162.field3005[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lnc;III)Z")
    public static final boolean method1735(class83 arg0, int arg1, int arg2, int arg3) {
        field4480++;
        byte[] var4 = arg0.method590(arg3, arg2, arg1);
        if (var4 == null) {
            return false;
        } else {
            class64.method418(var4, 107);
            return true;
        }
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "()V")
    public class244() {
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(Lhj;)V")
    public class244(class69 arg0) {
        this.field4475 = arg0;
    }
}
