import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bba")
public class class549 extends class214 {

    @OriginalMember(owner = "client!bba", name = "F", descriptor = "Z")
    private boolean field7826 = true;

    @OriginalMember(owner = "client!bba", name = "L", descriptor = "Z")
    private boolean field7832 = true;

    @OriginalMember(owner = "client!bba", name = "I", descriptor = "Lln;")
    public static class472 field7829 = new class472(6, 0, 4, 2);

    @OriginalMember(owner = "client!bba", name = "O", descriptor = "[Lb;")
    public static class352[] field7835 = new class352[4];

    @OriginalMember(owner = "client!bba", name = "M", descriptor = "Laia;")
    public static class257 field7833 = new class257("WTQA", "office", "_qa", 2);

    @OriginalMember(owner = "client!bba", name = "D", descriptor = "I")
    public static int field7824;

    @OriginalMember(owner = "client!bba", name = "E", descriptor = "I")
    public static int field7825;

    @OriginalMember(owner = "client!bba", name = "G", descriptor = "I")
    public static int field7827;

    @OriginalMember(owner = "client!bba", name = "H", descriptor = "I")
    public static int field7828;

    @OriginalMember(owner = "client!bba", name = "J", descriptor = "I")
    public static int field7830;

    @OriginalMember(owner = "client!bba", name = "K", descriptor = "I")
    public static int field7831;

    @OriginalMember(owner = "client!bba", name = "N", descriptor = "I")
    public static int field7834;

    @OriginalMember(owner = "client!bba", name = "P", descriptor = "Lla;")
    public static class422 field7836;

    @OriginalMember(owner = "client!bba", name = "c", descriptor = "(II)[[I")
    public final int[][] method62(int arg0, int arg1) {
        ++field7834;
        int[][] var3 = super.field3545.method2996((byte) 124, arg0);
        if (super.field3545.field7147) {
            int[][] var4 = this.method1539(true, 0, this.field7826 ? class580.field8203 - arg0 : arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (!this.field7832) {
                for (int var11 = 0; ~class626.field8787 < ~var11; ++var11) {
                    var8[var11] = var5[var11];
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                }
            } else {
                for (int var12 = 0; var12 < class626.field8787; ++var12) {
                    var8[var12] = var5[-var12 + class245.field3948];
                    var9[var12] = var6[class245.field3948 - var12];
                    var10[var12] = var7[-var12 + class245.field3948];
                }
            }
        }
        if (arg1 != -256) {
            field7833 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(IB)[I")
    public final int[] method64(int arg0, byte arg1) {
        if (arg1 != 5) {
            field7833 = null;
        }
        ++field7830;
        int[] var3 = super.field3544.method3869(arg0, arg1 + -124);
        if (super.field3544.field9836) {
            int[] var4 = this.method1545(this.field7826 ? -arg0 + class580.field8203 : arg0, 0, -1);
            if (!this.field7832) {
                class571.method3314(var4, 0, var3, 0, class626.field8787);
            } else {
                for (int var5 = 0; ~var5 > ~class626.field8787; ++var5) {
                    var3[var5] = var4[-var5 + class245.field3948];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(ZZ)V")
    public static final void method3206(boolean arg0, boolean arg1) {
        class493.method2998((byte) -126);
        ++field7827;
        if (client.method2740(class521.field7529, (byte) 121)) {
            ++class12.field117;
            if (arg1) {
                method3208((byte) -45);
            }
            if (~class12.field117 <= -51 || arg0) {
                class12.field117 = 0;
                if (!class612.field8625 && class166.field2624 != null) {
                    ++class651.field9243;
                    class540 var2 = class257.method1732(!arg1, class475.field6888, class655.field9332);
                    class756.method4211(var2, 119);
                    try {
                        class683.method3809(0);
                    } catch (IOException var3) {
                        class612.field8625 = true;
                    }
                }
                class493.method2998((byte) -103);
            }
        }
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(ILofa;I)V")
    public final void method59(int arg0, class301 arg1, int arg2) {
        if (arg0 < 92) {
            field7833 = null;
        }
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    super.field3540 = ~arg1.method1987(-125) == -2;
                }
            } else {
                this.field7826 = arg1.method1987(-63) == 1;
            }
        } else {
            this.field7832 = ~arg1.method1987(-101) == -2;
        }
        ++field7831;
    }

    @OriginalMember(owner = "client!bba", name = "<init>", descriptor = "()V")
    public class549() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(BIILbfa;I)V")
    public static final void method3207(byte arg0, int arg1, int arg2, class573 arg3, int arg4) {
        if (arg4 >= -120) {
            method3206(true, true);
        }
        ++field7828;
        int var5 = arg3.field1702[0];
        int var6 = arg3.field1704[0];
        if (~var5 <= -1 && ~var5 > ~class191.field3229 && var6 >= 0 && ~var6 > ~class314.field4720) {
            if (~arg2 <= -1 && ~class191.field3229 < ~arg2 && arg1 >= 0 && arg1 < class314.field4720) {
                int var7 = class606.method3475(var5, arg1, 0, var6, true, arg3.method878(-5740), 0, arg2, class247.field3958[arg3.field9470], class563.field7977, -4, class423.field6227, 0, 0, 0);
                if (~var7 <= -2) {
                    if (~var7 >= -4) {
                        for (int var8 = 0; ~var8 > ~(var7 + -1); ++var8) {
                            arg3.method3324(arg0, class563.field7977[var8], -108, class423.field6227[var8]);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bba", name = "e", descriptor = "(B)V")
    public static void method3208(byte arg0) {
        if (arg0 <= 113) {
            field7833 = null;
        }
        field7833 = null;
        field7835 = null;
        field7836 = null;
        field7829 = null;
    }

    @OriginalMember(owner = "client!bba", name = "f", descriptor = "(B)V")
    public static final void method3209(byte arg0) {
        ++field7825;
        class178.field3052 = 0;
        int var1 = (class145.field2251.field9477 >> 9) - -class265.field4123;
        int var2 = (class145.field2251.field9475 >> 9) + class723.field10155;
        if (var1 >= 3053 && var1 <= 3156 && ~var2 <= -3057 && ~var2 >= -3137) {
            class178.field3052 = 1;
        }
        int var3 = -89 % ((-40 - arg0) / 61);
        if (~var1 <= -3073 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class178.field3052 = 1;
        }
        if (~class178.field3052 == -2 && var1 >= 3139 && ~var1 >= -3200 && ~var2 <= -3009 && ~var2 >= -3063) {
            class178.field3052 = 0;
        }
    }
}
