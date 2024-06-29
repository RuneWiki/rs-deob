import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public abstract class class698 {

    @OriginalMember(owner = "client!vv", name = "e", descriptor = "I")
    public static int field9793 = 0;

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "I")
    public static int field9789;

    @OriginalMember(owner = "client!vv", name = "b", descriptor = "I")
    public static int field9790;

    @OriginalMember(owner = "client!vv", name = "c", descriptor = "I")
    public static int field9791;

    @OriginalMember(owner = "client!vv", name = "d", descriptor = "I")
    public static int field9792;

    @OriginalMember(owner = "client!vv", name = "f", descriptor = "I")
    public int field9794;

    @OriginalMember(owner = "client!vv", name = "g", descriptor = "I")
    public int field9795;

    @OriginalMember(owner = "client!vv", name = "h", descriptor = "I")
    public static int field9796;

    @OriginalMember(owner = "client!vv", name = "i", descriptor = "I")
    public static int field9797;

    @OriginalMember(owner = "client!vv", name = "j", descriptor = "I")
    public int field9798;

    @OriginalMember(owner = "client!vv", name = "l", descriptor = "Lrn;")
    public static class336 field9800;

    @OriginalMember(owner = "client!vv", name = "k", descriptor = "Lla;")
    public static class413 field9799;

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(Z)V")
    public static void method3835(boolean arg0) {
        field9800 = null;
        field9799 = null;
        if (!arg0) {
            field9799 = null;
        }
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(I[[BB[B[I[[BI[I)I")
    public static final int method3836(int arg0, byte[][] arg1, byte arg2, byte[] arg3, int[] arg4, byte[][] arg5, int arg6, int[] arg7) {
        if (arg2 != 36) {
            field9793 = 51;
        }
        field9791++;
        int var8 = arg4[arg6];
        int var9 = arg7[arg6] + var8;
        int var10 = arg4[arg0];
        int var11 = var10 + arg7[arg0];
        int var12 = var8;
        if (var8 < var10) {
            var12 = var10;
        }
        int var13 = var9;
        if (var9 > var11) {
            var13 = var11;
        }
        int var14 = arg3[arg6] & 0xFF;
        if (var14 > (arg3[arg0] & 0xFF)) {
            var14 = arg3[arg0] & 0xFF;
        }
        byte[] var15 = arg5[arg6];
        byte[] var16 = arg1[arg0];
        int var17 = var12 - var8;
        int var18 = var12 - var10;
        for (int var19 = var12; var19 < var13; var19++) {
            int var20 = var16[var18++] + var15[var17++];
            if (var20 < var14) {
                var14 = var20;
            }
        }
        return -var14;
    }

    @OriginalMember(owner = "client!vv", name = "b", descriptor = "(Z)Z")
    public final boolean method3837(boolean arg0) {
        field9797++;
        if (arg0) {
            this.method3837(true);
        }
        return (this.field9794 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(B)Z")
    public final boolean method3838(byte arg0) {
        field9790++;
        if (arg0 >= -108) {
            field9793 = -35;
        }
        return (this.field9794 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!vv", name = "b", descriptor = "(B)Z")
    public final boolean method3839(byte arg0) {
        field9792++;
        int var2 = 58 / ((arg0 - 18) / 59);
        return (this.field9794 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(I)Z")
    public final boolean method3840(int arg0) {
        if (arg0 != -25997) {
            field9799 = null;
        }
        field9789++;
        return (this.field9794 & 0x2) != 0;
    }
}
