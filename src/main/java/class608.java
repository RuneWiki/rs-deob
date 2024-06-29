import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class608 {

    @OriginalMember(owner = "client!rn", name = "i", descriptor = "Z")
    private boolean field8584;

    @OriginalMember(owner = "client!rn", name = "f", descriptor = "I")
    private int field8581;

    @OriginalMember(owner = "client!rn", name = "g", descriptor = "Z")
    private boolean field8582;

    @OriginalMember(owner = "client!rn", name = "h", descriptor = "I")
    private int field8583;

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "Lcb;")
    public static class631 field8579 = new class631(57, 2);

    @OriginalMember(owner = "client!rn", name = "m", descriptor = "I")
    public static int field8588 = 0;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "I")
    public static int field8576;

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "I")
    public static int field8577;

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "I")
    public static int field8578;

    @OriginalMember(owner = "client!rn", name = "e", descriptor = "I")
    public static int field8580;

    @OriginalMember(owner = "client!rn", name = "j", descriptor = "I")
    public static int field8585;

    @OriginalMember(owner = "client!rn", name = "k", descriptor = "I")
    public static int field8586;

    @OriginalMember(owner = "client!rn", name = "l", descriptor = "I")
    public static int field8587;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)Z", line = 3)
    public final boolean method3482(int arg0) {
        field8577++;
        int var2 = 53 / ((arg0 - 60) / 39);
        return this.field8582;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Z)I", line = 13)
    public final int method3483(boolean arg0) {
        if (arg0) {
            return -40;
        } else {
            field8586++;
            return this.field8583;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "([IIIII)V", line = 31)
    public static final void method3484(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        field8580++;
        arg1--;
        int var13 = arg4 - 1;
        int var5 = arg2 + var13;
        while (arg1 < var5) {
            int var6 = arg1 + 1;
            arg0[var6] = arg3;
            int var7 = var6 + 1;
            arg0[var7] = arg3;
            int var8 = var7 + 1;
            arg0[var8] = arg3;
            int var9 = var8 + 1;
            arg0[var9] = arg3;
            int var10 = var9 + 1;
            arg0[var10] = arg3;
            int var11 = var10 + 1;
            arg0[var11] = arg3;
            int var12 = var11 + 1;
            arg0[var12] = arg3;
            arg1 = var12 + 1;
            arg0[arg1] = arg3;
        }
        while (arg1 < var13) {
            arg1++;
            arg0[arg1] = arg3;
        }
    }

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(I)Z", line = 57)
    public final boolean method3485(int arg0) {
        field8576++;
        if (arg0 != 673) {
            field8587 = -10;
        }
        return this.field8584;
    }

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(Z)V", line = 68)
    public static void method3486(boolean arg0) {
        field8579 = null;
        if (!arg0) {
            method3486(true);
        }
    }

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "(I)I", line = 80)
    public final int method3487(int arg0) {
        field8578++;
        if (arg0 != -13485) {
            this.field8581 = -12;
        }
        return this.field8581;
    }

    @OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(ZIIZ)V", line = 92)
    public class608(boolean arg0, int arg1, int arg2, boolean arg3) {
        this.field8584 = arg0;
        this.field8581 = arg1;
        this.field8582 = arg3;
        this.field8583 = arg2;
    }
}
