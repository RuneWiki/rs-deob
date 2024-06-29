import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class6 extends class3 {

    @OriginalMember(owner = "client!ff", name = "L", descriptor = "I")
    private int field78 = 4096;

    @OriginalMember(owner = "client!ff", name = "I", descriptor = "[I")
    public static int[] field75 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!ff", name = "O", descriptor = "I")
    public static int field81 = 64;

    @OriginalMember(owner = "client!ff", name = "G", descriptor = "I")
    public static int field73;

    @OriginalMember(owner = "client!ff", name = "H", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!ff", name = "J", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!ff", name = "K", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!ff", name = "N", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "client!ff", name = "P", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!ff", name = "M", descriptor = "Lsi;")
    public static class264 field79;

    @OriginalMember(owner = "client!ff", name = "F", descriptor = "[[[B")
    public static byte[][][] field72;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "(I)V", line = 5)
    public static void method46(int arg0) {
        field72 = (byte[][][]) null;
        if (arg0 >= -31) {
            field74 = 68;
        }
        field79 = null;
        field75 = null;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lnm;I)Z", line = 17)
    public static final boolean method47(class221 arg0, int arg1) {
        field80++;
        if (arg0.method1519(false, class307.field5007)) {
            return true;
        } else {
            if (arg1 != 64) {
                field76 = 9;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(BI)[I", line = 33)
    public final int[] method25(byte arg0, int arg1) {
        if (arg0 <= 57) {
            field81 = -115;
        }
        field77++;
        int[] var3 = this.field21.method1258(arg1, 0);
        if (this.field21.field2808) {
            int[] var4 = this.method24(arg1 - 1 & class129.field1970, 1, 0);
            int[] var5 = this.method24(arg1, 1, 0);
            int[] var6 = this.method24(class129.field1970 & arg1 + 1, 1, 0);
            for (int var7 = 0; var7 < class326.field5342; var7++) {
                int var8 = (var5[class5.field70 & var7 + 1] - var5[var7 - 1 & class5.field70]) * this.field78;
                int var9 = var8 >> 12;
                int var10 = (var6[var7] - var4[var7]) * this.field78;
                int var11 = var10 >> 12;
                int var12 = var9 * var9 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var12 + var13 + 4096) / 4096.0F)) * 4096.0D);
                int var15 = var14 == 0 ? 0 : 16777216 / var14;
                var3[var7] = 4096 - var15;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIILkm;Lkm;IIIIJ)V", line = 83)
    public static final void method48(int arg0, int arg1, int arg2, int arg3, class162 arg4, class162 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class206 var12 = new class206();
        var12.field3128 = arg10;
        var12.field3142 = arg1 * 128 + 64;
        var12.field3135 = arg2 * 128 + 64;
        var12.field3131 = arg3;
        var12.field3136 = arg4;
        var12.field3141 = arg5;
        var12.field3137 = arg6;
        var12.field3134 = arg7;
        var12.field3140 = arg8;
        var12.field3138 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class264.field4230[var13][arg1][arg2] == null) {
                class264.field4230[var13][arg1][arg2] = new class50(var13, arg1, arg2);
            }
        }
        class264.field4230[arg0][arg1][arg2].field747 = var12;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lfh;IZ)V", line = 111)
    public final void method14(class313 arg0, int arg1, boolean arg2) {
        if (arg1 == 0) {
            this.field78 = arg0.method2250(-1613178296);
        }
        field73++;
        if (arg2) {
            field82 = 21;
        }
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "()V", line = 131)
    public class6() {
        super(1, true);
    }
}
