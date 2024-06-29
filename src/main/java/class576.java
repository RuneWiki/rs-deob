import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mfa")
public class class576 {

    @OriginalMember(owner = "client!mfa", name = "d", descriptor = "I")
    public int field8042 = 128;

    @OriginalMember(owner = "client!mfa", name = "n", descriptor = "I")
    public int field8052 = 128;

    @OriginalMember(owner = "client!mfa", name = "l", descriptor = "I")
    public int field8050;

    @OriginalMember(owner = "client!mfa", name = "e", descriptor = "I")
    public int field8043;

    @OriginalMember(owner = "client!mfa", name = "m", descriptor = "I")
    public int field8051;

    @OriginalMember(owner = "client!mfa", name = "h", descriptor = "I")
    public int field8046;

    @OriginalMember(owner = "client!mfa", name = "f", descriptor = "Lnm;")
    public static class369 field8044 = new class369(0, -1);

    @OriginalMember(owner = "client!mfa", name = "j", descriptor = "[I")
    public static int[] field8048 = new int[25];

    @OriginalMember(owner = "client!mfa", name = "k", descriptor = "F")
    public static float field8049;

    @OriginalMember(owner = "client!mfa", name = "b", descriptor = "I")
    public static int field8040;

    @OriginalMember(owner = "client!mfa", name = "c", descriptor = "I")
    public static int field8041;

    @OriginalMember(owner = "client!mfa", name = "g", descriptor = "I")
    public static int field8045;

    @OriginalMember(owner = "client!mfa", name = "i", descriptor = "I")
    public static int field8047;

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "Loj;")
    public static class543 field8039;

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(I)Lmfa;", line = 5)
    public final class576 method3175(int arg0) {
        int var2 = -18 / ((-arg0 - 8) / 38);
        field8045++;
        return new class576(this.field8050, this.field8052, this.field8042, this.field8046, this.field8043, this.field8051);
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(II)I", line = 16)
    public static final int method3176(int arg0, int arg1) {
        int var2 = (arg1 & 0x55555555) + ((arg1 & 0xAAAAAAAB) >>> 1);
        field8047++;
        int var3 = ((var2 & 0xCCCCCCCF) >>> 2) + (var2 & 0x33333333);
        int var4 = var3 + (var3 >>> 4) & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        int var7 = -25 % ((72 - arg0) / 34);
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!mfa", name = "b", descriptor = "(I)V", line = 32)
    public static void method3177(int arg0) {
        field8048 = null;
        field8039 = null;
        field8044 = null;
        if (arg0 != 28163) {
            method3177(-97);
        }
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "([[B[B[IZ[[B[III)I", line = 53)
    public static final int method3178(byte[][] arg0, byte[] arg1, int[] arg2, boolean arg3, byte[][] arg4, int[] arg5, int arg6, int arg7) {
        field8040++;
        int var8 = arg2[arg7];
        int var9 = var8 + arg5[arg7];
        int var10 = arg2[arg6];
        int var11 = var10 + arg5[arg6];
        int var12 = var8;
        if (var10 > var8) {
            var12 = var10;
        }
        int var13 = var9;
        if (var9 > var11) {
            var13 = var11;
        }
        int var14 = arg1[arg7] & 0xFF;
        if (var14 > (arg1[arg6] & 0xFF)) {
            var14 = arg1[arg6] & 0xFF;
        }
        byte[] var15 = arg4[arg7];
        byte[] var16 = arg0[arg6];
        int var17 = var12 - var8;
        int var18 = var12 - var10;
        for (int var19 = var12; var19 < var13; var19++) {
            int var20 = var16[var18++] + var15[var17++];
            if (var14 > var20) {
                var14 = var20;
            }
        }
        if (arg3) {
            field8049 = -1.9385135F;
        }
        return -var14;
    }

    @OriginalMember(owner = "client!mfa", name = "<init>", descriptor = "(I)V", line = 137)
    public class576(int arg0) {
        this.field8050 = arg0;
    }

    @OriginalMember(owner = "client!mfa", name = "<init>", descriptor = "(IIIIII)V", line = 144)
    private class576(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field8043 = arg4;
        this.field8051 = arg5;
        this.field8050 = arg0;
        this.field8052 = arg1;
        this.field8042 = arg2;
        this.field8046 = arg3;
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(Lmfa;I)V", line = 119)
    public final void method3179(class576 arg0, int arg1) {
        this.field8050 = arg0.field8050;
        this.field8046 = arg0.field8046;
        this.field8052 = arg0.field8052;
        this.field8042 = arg0.field8042;
        this.field8043 = arg0.field8043;
        field8041++;
        if (arg1 != 255) {
            field8048 = null;
        }
        this.field8051 = arg0.field8051;
    }
}
