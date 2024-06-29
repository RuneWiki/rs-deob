import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class534 extends class440 {

    @OriginalMember(owner = "client!nf", name = "E", descriptor = "Ldg;")
    public static class376 field7494 = new class376(22, 2);

    @OriginalMember(owner = "client!nf", name = "L", descriptor = "I")
    public static int field7501 = 0;

    @OriginalMember(owner = "client!nf", name = "C", descriptor = "I")
    public static int field7493;

    @OriginalMember(owner = "client!nf", name = "F", descriptor = "I")
    public static int field7495;

    @OriginalMember(owner = "client!nf", name = "G", descriptor = "I")
    public static int field7496;

    @OriginalMember(owner = "client!nf", name = "H", descriptor = "I")
    private int field7497;

    @OriginalMember(owner = "client!nf", name = "I", descriptor = "I")
    private int field7498;

    @OriginalMember(owner = "client!nf", name = "J", descriptor = "I")
    public static int field7499;

    @OriginalMember(owner = "client!nf", name = "K", descriptor = "I")
    private int field7500;

    @OriginalMember(owner = "client!nf", name = "M", descriptor = "I")
    public static int field7502;

    @OriginalMember(owner = "client!nf", name = "N", descriptor = "I")
    public static int field7503;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ILmo;I)V", line = 7)
    public final void method234(int arg0, class695 arg1, int arg2) {
        ++field7502;
        if (arg0 != 5) {
            this.field7498 = -51;
        }
        if (~arg2 == -1) {
            this.method3040(80, arg1.method3873(255));
        }
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(II)Lvg;", line = 37)
    public static final class49 method3038(int arg0, int arg1) {
        ++field7499;
        if (arg0 >= -82) {
            return null;
        } else {
            int var2 = arg1 >> 16;
            int var3 = 65535 & arg1;
            if (class181.field2558[var2] == null || class181.field2558[var2][var3] == null) {
                boolean var4 = class312.method1978(false, var2);
                if (!var4) {
                    return null;
                }
            }
            return class181.field2558[var2][var3];
        }
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(I)V", line = 62)
    private class534(int arg0) {
        super(0, false);
        this.method3040(39, arg0);
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(Z)V", line = 71)
    public static void method3039(boolean arg0) {
        if (!arg0) {
            field7494 = null;
        }
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "()V", line = 81)
    public class534() {
        this(0);
    }

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "(II)V", line = 85)
    private final void method3040(int arg0, int arg1) {
        this.field7500 = 4080 & arg1 >> 12;
        if (arg0 > 29) {
            this.field7497 = 4080 & arg1 << 4;
            this.field7498 = arg1 >> 4 & 4080;
            ++field7496;
        }
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(ILjava/lang/String;)Z", line = 102)
    public static final boolean method3041(int arg0, String arg1) {
        ++field7493;
        if (arg1 == null) {
            return false;
        } else {
            if (arg0 != -15788) {
                method3041(-75, (String) null);
            }
            for (int var2 = 0; ~var2 > ~class363.field5180; ++var2) {
                if (arg1.equalsIgnoreCase(class172.field2443[var2])) {
                    return true;
                }
                if (arg1.equalsIgnoreCase(class591.field8280[var2])) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(II[I[II)V", line = 132)
    public static final void method3042(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        if (arg1 <= -13) {
            if (~arg4 > ~arg0) {
                int var5 = (arg0 + arg4) / 2;
                int var6 = arg4;
                int var7 = arg2[var5];
                arg2[var5] = arg2[arg0];
                arg2[arg0] = var7;
                int var8 = arg3[var5];
                arg3[var5] = arg3[arg0];
                arg3[arg0] = var8;
                int var9 = ~var7 != Integer.MIN_VALUE ? 1 : 0;
                for (int var10 = arg4; arg0 > var10; ++var10) {
                    if (~((var9 & var10) + var7) < ~arg2[var10]) {
                        int var11 = arg2[var10];
                        arg2[var10] = arg2[var6];
                        arg2[var6] = var11;
                        int var12 = arg3[var10];
                        arg3[var10] = arg3[var6];
                        arg3[var6++] = var12;
                    }
                }
                arg2[arg0] = arg2[var6];
                arg2[var6] = var7;
                arg3[arg0] = arg3[var6];
                arg3[var6] = var8;
                method3042(var6 - 1, -34, arg2, arg3, arg4);
                method3042(arg0, -45, arg2, arg3, var6 + 1);
            }
            ++field7503;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)[[I", line = 192)
    public final int[][] method763(int arg0, int arg1) {
        ++field7495;
        if (arg0 != -5766) {
            method3042(-78, 8, (int[]) null, (int[]) null, 28);
        }
        int[][] var3 = super.field6417.method3769(arg1, -26435);
        if (super.field6417.field9606) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~var7 > ~class549.field7715; ++var7) {
                var4[var7] = this.field7500;
                var5[var7] = this.field7498;
                var6[var7] = this.field7497;
            }
        }
        return var3;
    }
}
