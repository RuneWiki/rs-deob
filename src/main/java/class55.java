import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gda")
public abstract class class55 {

    @OriginalMember(owner = "client!gda", name = "d", descriptor = "Lij;")
    public class424 field759;

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!gda", name = "b", descriptor = "I")
    public static int field757;

    @OriginalMember(owner = "client!gda", name = "e", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!gda", name = "g", descriptor = "I")
    public static int field762;

    @OriginalMember(owner = "client!gda", name = "h", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!gda", name = "i", descriptor = "I")
    public static int field764;

    @OriginalMember(owner = "client!gda", name = "j", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!gda", name = "k", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!gda", name = "c", descriptor = "Lnd;")
    public static class547 field758;

    @OriginalMember(owner = "client!gda", name = "f", descriptor = "Lnl;")
    public static class554 field761;

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(III[J[I)V", line = 5)
    public static final void method401(int arg0, int arg1, int arg2, long[] arg3, int[] arg4) {
        if (arg1 < arg2) {
            int var5 = (arg1 + arg2) / 2;
            int var6 = arg1;
            long var7 = arg3[var5];
            arg3[var5] = arg3[arg2];
            arg3[arg2] = var7;
            int var9 = arg4[var5];
            arg4[var5] = arg4[arg2];
            arg4[arg2] = var9;
            int var10 = ~var7 == Long.MIN_VALUE ? 0 : 1;
            for (int var11 = arg1; var11 < arg2; var11++) {
                if (arg3[var11] < ((long) (var11 & var10) + var7)) {
                    long var12 = arg3[var11];
                    arg3[var11] = arg3[var6];
                    arg3[var6] = var12;
                    int var14 = arg4[var11];
                    arg4[var11] = arg4[var6];
                    arg4[var6++] = var14;
                }
            }
            arg3[arg2] = arg3[var6];
            arg3[var6] = var7;
            arg4[arg2] = arg4[var6];
            arg4[var6] = var9;
            method401(1, arg1, var6 - 1, arg3, arg4);
            method401(1, var6 + 1, arg2, arg3, arg4);
        }
        field756++;
        if (arg0 != 1) {
            field758 = null;
        }
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(I)V", line = 64)
    public void method402(int arg0) {
        field762++;
        if (arg0 != -3) {
            this.method202(-108);
        }
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(B)V", line = 76)
    public void method403(byte arg0) {
        field757++;
        if (arg0 != 119) {
            this.field759 = null;
        }
    }

    @OriginalMember(owner = "client!gda", name = "b", descriptor = "(I)V", line = 88)
    public void method404(int arg0) {
        if (arg0 >= 20) {
            field760++;
        }
    }

    @OriginalMember(owner = "client!gda", name = "c", descriptor = "(I)V", line = 99)
    public void method405(int arg0) {
        field764++;
        if (arg0 != 7289) {
            this.field759 = null;
        }
    }

    @OriginalMember(owner = "client!gda", name = "d", descriptor = "(I)V", line = 109)
    public void method406(int arg0) {
        if (arg0 != 1) {
            this.method199(38, -74, false);
        }
        field763++;
    }

    @OriginalMember(owner = "client!gda", name = "e", descriptor = "(I)V", line = 121)
    public void method407(int arg0) {
        field765++;
        if (arg0 <= 21) {
            field761 = null;
        }
    }

    @OriginalMember(owner = "client!gda", name = "b", descriptor = "(Z)V", line = 136)
    public static void method408(boolean arg0) {
        if (!arg0) {
            field761 = null;
            field758 = null;
        }
    }

    @OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(Lij;)V", line = 147)
    public class55(class424 arg0) {
        this.field759 = arg0;
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(II[FIIIF[FIII)V", line = 157)
    public static final void method409(int arg0, int arg1, float[] arg2, int arg3, int arg4, int arg5, float arg6, float[] arg7, int arg8, int arg9, int arg10) {
        field766++;
        int var11 = arg3 - arg9;
        int var12 = arg8 - arg10;
        int var13 = arg0 - arg5;
        float var14 = arg2[2] * (float) var13 + arg2[1] * (float) var11 + arg2[0] * (float) var12;
        float var15 = arg2[5] * (float) var13 + arg2[4] * (float) var11 + arg2[3] * (float) var12;
        float var16 = arg2[8] * (float) var13 + arg2[6] * (float) var12 + arg2[7] * (float) var11;
        float var17 = (float) Math.sqrt((double) (var16 * var16 + var14 * var14 + var15 * var15));
        float var18 = (float) Math.atan2((double) var14, (double) var16) / 6.2831855F + 0.5F;
        float var19 = (float) Math.asin((double) (var15 / var17)) / 3.1415927F + arg6 + 0.5F;
        if (arg1 == 1) {
            float var20 = var18;
            var18 = -var19;
            var19 = var20;
        } else if (arg1 == 2) {
            var19 = -var19;
            var18 = -var18;
        } else if (arg1 == 3) {
            float var21 = var18;
            var18 = var19;
            var19 = -var21;
        }
        arg7[arg4] = var19;
        arg7[0] = var18;
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(IZ)V")
    public abstract void method196(int arg0, boolean arg1);

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(ZB)V")
    public abstract void method197(boolean arg0, byte arg1);

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(IIZ)V")
    public abstract void method199(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(Z)V")
    public abstract void method201(boolean arg0);

    @OriginalMember(owner = "client!gda", name = "f", descriptor = "(I)Z")
    public abstract boolean method202(int arg0);

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(IILfe;)V")
    public abstract void method200(int arg0, int arg1, class572 arg2);
}
