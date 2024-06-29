import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class208 implements class331 {

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "Lgr;")
    private class457 field3223;

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "I")
    public static int field3217 = 1;

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "Lok;")
    public static class266 field3220 = new class266();

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "I")
    public static int field3216;

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "I")
    public static int field3218;

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "I")
    public static int field3222;

    @OriginalMember(owner = "client!tj", name = "i", descriptor = "I")
    public static int field3224;

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "[Ls;")
    public static class294[] field3219;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V", line = 9)
    public final void method297(int arg0) {
        field3216++;
        int var2 = 87 / ((83 - arg0) / 32);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIIII)V", line = 22)
    public static final void method1438(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 31317) {
            return;
        }
        field3222++;
        int var5 = 0;
        int var6 = arg4;
        int var7 = -arg4;
        int var8 = -1;
        class434.method2601(class746.field10330[arg2], arg1 - arg4, arg3, (byte) -62, arg1 + arg4);
        while (var6 > var5) {
            var8 += 2;
            var7 += var8;
            var5++;
            if (var7 >= 0) {
                var6--;
                var7 -= var6 << 1;
                int[] var9 = class746.field10330[arg2 + var6];
                int[] var10 = class746.field10330[arg2 - var6];
                int var11 = arg1 + var5;
                int var12 = arg1 - var5;
                class434.method2601(var9, var12, arg3, (byte) -62, var11);
                class434.method2601(var10, var12, arg3, (byte) -62, var11);
            }
            int var13 = arg1 + var6;
            int var14 = arg1 - var6;
            int[] var15 = class746.field10330[arg2 + var5];
            int[] var16 = class746.field10330[arg2 - var5];
            class434.method2601(var15, var14, arg3, (byte) -62, var13);
            class434.method2601(var16, var14, arg3, (byte) -62, var13);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ZZ)V", line = 75)
    public final void method299(boolean arg0, boolean arg1) {
        if (arg0) {
            class37.field491.method495(0, 0, class428.field5825, class714.field9895, this.field3223.field6405, 0);
        }
        if (!arg1) {
            field3221++;
        }
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(B)V", line = 94)
    public static void method1439(byte arg0) {
        if (arg0 > -38) {
            field3217 = -36;
        }
        field3220 = null;
        field3219 = null;
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Lgr;)V", line = 104)
    public class208(class457 arg0) {
        this.field3223 = arg0;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)Z", line = 112)
    public final boolean method298(byte arg0) {
        if (arg0 != -98) {
            field3220 = null;
        }
        field3218++;
        return true;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Leo;I)V", line = 123)
    public static final void method1440(class312 arg0, int arg1) {
        if (arg1 <= 25) {
            field3219 = null;
        }
        class559.field7954.method1727(arg0, (byte) 65);
        field3224++;
        arg0.field4444 = arg0.field4445.field7042;
        arg0.field4445.field7042 = 0;
        class308.field4416 += arg0.field4444;
    }
}
