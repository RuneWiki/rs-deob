import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public class class585 {

    @OriginalMember(owner = "client!av", name = "c", descriptor = "[I")
    private int[] field8167;

    @OriginalMember(owner = "client!av", name = "d", descriptor = "Luc;")
    public static class27 field8168 = new class27(67, 3);

    @OriginalMember(owner = "client!av", name = "f", descriptor = "Lfc;")
    public static class235 field8170 = new class235(54, 3);

    @OriginalMember(owner = "client!av", name = "g", descriptor = "Lkh;")
    public static class15 field8171 = new class15();

    @OriginalMember(owner = "client!av", name = "b", descriptor = "I")
    public static int field8166;

    @OriginalMember(owner = "client!av", name = "e", descriptor = "I")
    public static int field8169;

    @OriginalMember(owner = "client!av", name = "a", descriptor = "J")
    public static long field8165;

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(B)V")
    public static void method3261(byte arg0) {
        if (arg0 > 40) {
            field8170 = null;
            field8171 = null;
            field8168 = null;
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(II)I")
    public final int method3262(int arg0, int arg1) {
        field8169++;
        int var3 = (this.field8167.length >> 1) + arg1;
        int var4 = arg0 & var3;
        while (true) {
            int var5 = this.field8167[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field8167[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "([B[[BI[I[[BI[IZ)I")
    public static final int method3263(byte[] arg0, byte[][] arg1, int arg2, int[] arg3, byte[][] arg4, int arg5, int[] arg6, boolean arg7) {
        field8166++;
        int var8 = arg3[arg2];
        int var9 = arg6[arg2] + var8;
        int var10 = arg3[arg5];
        int var11 = arg6[arg5] + var10;
        int var12 = var8;
        if (var10 > var8) {
            var12 = var10;
        }
        int var13 = var9;
        if (var9 > var11) {
            var13 = var11;
        }
        int var14 = arg0[arg2] & 0xFF;
        if (var14 > (arg0[arg5] & 0xFF)) {
            var14 = arg0[arg5] & 0xFF;
        }
        byte[] var15 = arg1[arg2];
        byte[] var16 = arg4[arg5];
        int var17 = var12 - var8;
        if (!arg7) {
            return -64;
        }
        int var18 = var12 - var10;
        for (int var19 = var12; var19 < var13; var19++) {
            int var20 = var16[var18++] + var15[var17++];
            if (var20 < var14) {
                var14 = var20;
            }
        }
        return -var14;
    }

    @OriginalMember(owner = "client!av", name = "<init>", descriptor = "([I)V")
    public class585(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
        }
        this.field8167 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field8167[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field8167[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 - 1) {
            }
            this.field8167[var5 + var5] = arg0[var4];
            this.field8167[var5 - (-var5 - 1)] = var4++;
        }
    }
}
