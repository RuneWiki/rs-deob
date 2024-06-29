import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class178 extends class279 {

    @OriginalMember(owner = "client!jm", name = "J", descriptor = "I")
    private int field2910 = 204;

    @OriginalMember(owner = "client!jm", name = "O", descriptor = "I")
    private int field2915 = 1;

    @OriginalMember(owner = "client!jm", name = "R", descriptor = "I")
    private int field2918 = 1;

    @OriginalMember(owner = "client!jm", name = "H", descriptor = "Ltl;")
    public static class59 field2908 = class85.method639("settings", 9588);

    @OriginalMember(owner = "client!jm", name = "N", descriptor = "I")
    public static int field2914 = 0;

    @OriginalMember(owner = "client!jm", name = "M", descriptor = "Lkl;")
    public static class64 field2913 = new class64();

    @OriginalMember(owner = "client!jm", name = "V", descriptor = "I")
    public static int field2922 = 0;

    @OriginalMember(owner = "client!jm", name = "X", descriptor = "Ltl;")
    private static class59 field2924 = class85.method639(" is already on your ignore list)3", 9588);

    @OriginalMember(owner = "client!jm", name = "T", descriptor = "Ltl;")
    public static class59 field2920 = field2924;

    @OriginalMember(owner = "client!jm", name = "G", descriptor = "I")
    public static int field2907;

    @OriginalMember(owner = "client!jm", name = "I", descriptor = "I")
    public static int field2909;

    @OriginalMember(owner = "client!jm", name = "K", descriptor = "I")
    public static int field2911;

    @OriginalMember(owner = "client!jm", name = "L", descriptor = "I")
    public static int field2912;

    @OriginalMember(owner = "client!jm", name = "P", descriptor = "I")
    public static int field2916;

    @OriginalMember(owner = "client!jm", name = "S", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!jm", name = "U", descriptor = "Lki;")
    public static class166 field2921;

    @OriginalMember(owner = "client!jm", name = "W", descriptor = "Lvj;")
    public static class95 field2923;

    @OriginalMember(owner = "client!jm", name = "Q", descriptor = "[Ltl;")
    public static class59[] field2917;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(II[I[Ljava/lang/Object;I)V", line = 8)
    public static final void method1317(int arg0, int arg1, int[] arg2, Object[] arg3, int arg4) {
        if (arg1 != 2) {
            return;
        }
        if (arg4 > arg0) {
            int var5 = (arg0 + arg4) / 2;
            int var6 = arg0;
            int var7 = arg2[var5];
            arg2[var5] = arg2[arg4];
            arg2[arg4] = var7;
            Object var8 = arg3[var5];
            arg3[var5] = arg3[arg4];
            arg3[arg4] = var8;
            for (int var9 = arg0; var9 < arg4; var9++) {
                if (arg2[var9] < (var9 & 0x1) + var7) {
                    int var10 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6] = var10;
                    Object var11 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6++] = var11;
                }
            }
            arg2[arg4] = arg2[var6];
            arg2[var6] = var7;
            arg3[arg4] = arg3[var6];
            arg3[var6] = var8;
            method1317(arg0, 2, arg2, arg3, var6 - 1);
            method1317(var6 + 1, 2, arg2, arg3, arg4);
        }
        field2916++;
    }

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "(I)V", line = 66)
    public static void method1318(int arg0) {
        field2923 = null;
        field2924 = null;
        field2913 = null;
        field2921 = null;
        field2917 = null;
        field2920 = null;
        if (arg0 <= 112) {
            method1318(40);
        }
        field2908 = null;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IILs;)V", line = 84)
    public final void method51(int arg0, int arg1, class170 arg2) {
        field2907++;
        if (arg0 > -125) {
            return;
        }
        if (arg1 == 0) {
            this.field2915 = arg2.method1221(107);
        } else if (arg1 == 1) {
            this.field2918 = arg2.method1221(76);
        } else if (arg1 == 2) {
            this.field2910 = arg2.method1214(-18254);
        }
    }

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "(II)Z", line = 141)
    public static final boolean method1319(int arg0, int arg1) {
        if (arg0 != -199) {
            method1319(24, -56);
        }
        field2912++;
        return arg1 == 198 || arg1 == 230 || arg1 == 156 || arg1 == 140 || arg1 == 223;
    }

    @OriginalMember(owner = "client!jm", name = "<init>", descriptor = "()V", line = 266)
    public class178() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ZI)[I", line = 177)
    public final int[] method44(boolean arg0, int arg1) {
        field2911++;
        if (arg0) {
            field2920 = (class59) null;
        }
        int[] var3 = this.field4781.method165(arg1, (byte) -11);
        if (this.field4781.field354) {
            for (int var4 = 0; var4 < class56.field835; var4++) {
                int var5 = class31.field430[var4];
                int var6 = class71.field1104[arg1];
                int var7 = this.field2915 * var5 >> 12;
                int var8 = this.field2918 * var6 >> 12;
                int var9 = var5 % (4096 / this.field2915) * this.field2915;
                int var10 = var6 % (4096 / this.field2918) * this.field2918;
                if (var10 < this.field2910) {
                    for (var7 -= var8; var7 < 0; var7 += 4) {
                    }
                    while (var7 > 3) {
                        var7 -= 4;
                    }
                    if (var7 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (this.field2910 > var9) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (this.field2910 > var9) {
                    int var11;
                    for (var11 = var7 - var8; var11 < 0; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }
}
