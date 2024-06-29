import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class425 {

    @OriginalMember(owner = "client!oo", name = "l", descriptor = "I")
    public int field6102;

    @OriginalMember(owner = "client!oo", name = "g", descriptor = "I")
    private int field6097;

    @OriginalMember(owner = "client!oo", name = "k", descriptor = "I")
    public int field6101;

    @OriginalMember(owner = "client!oo", name = "j", descriptor = "I")
    public int field6100;

    @OriginalMember(owner = "client!oo", name = "h", descriptor = "B")
    public byte field6098;

    @OriginalMember(owner = "client!oo", name = "i", descriptor = "Loo;")
    public class425 field6099;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "I")
    public int field6091;

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "I")
    public static int field6092;

    @OriginalMember(owner = "client!oo", name = "c", descriptor = "I")
    public int field6093;

    @OriginalMember(owner = "client!oo", name = "d", descriptor = "I")
    public int field6094;

    @OriginalMember(owner = "client!oo", name = "e", descriptor = "I")
    public int field6095;

    @OriginalMember(owner = "client!oo", name = "f", descriptor = "I")
    public int field6096;

    @OriginalMember(owner = "client!oo", name = "m", descriptor = "I")
    public int field6103;

    @OriginalMember(owner = "client!oo", name = "n", descriptor = "I")
    public static int field6104;

    @OriginalMember(owner = "client!oo", name = "o", descriptor = "I")
    public int field6105;

    @OriginalMember(owner = "client!oo", name = "p", descriptor = "I")
    public int field6106;

    @OriginalMember(owner = "client!oo", name = "q", descriptor = "I")
    public static int field6107;

    @OriginalMember(owner = "client!oo", name = "r", descriptor = "I")
    public int field6108;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(I)Luo;")
    public final class389 method2496(int arg0) {
        if (arg0 != 24623) {
            this.field6102 = 119;
        }
        field6092++;
        return class508.method3038(111, this.field6097);
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "([I[BI[II[[BI[[B)I")
    public static final int method2497(int[] arg0, byte[] arg1, int arg2, int[] arg3, int arg4, byte[][] arg5, int arg6, byte[][] arg7) {
        field6107++;
        int var8 = arg0[arg4];
        int var9 = arg3[arg4] + var8;
        int var10 = arg0[arg2];
        int var11 = arg3[arg2] + var10;
        int var12 = var8;
        if (var10 > var8) {
            var12 = var10;
        }
        int var13 = var9;
        if (var9 > var11) {
            var13 = var11;
        }
        int var14 = arg6 & arg1[arg4];
        if (var14 > (arg1[arg2] & 0xFF)) {
            var14 = arg1[arg2] & 0xFF;
        }
        byte[] var15 = arg7[arg4];
        byte[] var16 = arg5[arg2];
        int var17 = var12 - var8;
        int var18 = var12 - var10;
        for (int var19 = var12; var19 < var13; var19++) {
            int var20 = var16[var18++] + var15[var17++];
            if (var14 > var20) {
                var14 = var20;
            }
        }
        return -var14;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(IIII)Loo;")
    public final class425 method2498(int arg0, int arg1, int arg2, int arg3) {
        field6104++;
        if (arg2 != -15002) {
            this.field6093 = -9;
        }
        return new class425(this.field6097, arg0, arg1, arg3, this.field6098);
    }

    @OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(IIIIB)V")
    public class425(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field6102 = arg1;
        this.field6097 = arg0;
        this.field6101 = arg3;
        this.field6100 = arg2;
        this.field6098 = arg4;
    }

    @OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(Loo;I)V")
    public class425(class425 arg0, int arg1) {
        this.field6099 = arg0;
        this.field6101 = this.field6099.field6101 + arg1;
        this.field6097 = this.field6099.field6097;
        this.field6102 = this.field6099.field6102 + arg1;
        this.field6098 = this.field6099.field6098;
        this.field6100 = this.field6099.field6100 + arg1;
    }
}
