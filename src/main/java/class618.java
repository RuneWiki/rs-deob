import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class618 extends class287 {

    @OriginalMember(owner = "client!wn", name = "m", descriptor = "Llu;")
    public static class610 field9133 = new class610(56, 0);

    @OriginalMember(owner = "client!wn", name = "q", descriptor = "I")
    public static int field9137 = -1;

    @OriginalMember(owner = "client!wn", name = "h", descriptor = "I")
    public int field9128;

    @OriginalMember(owner = "client!wn", name = "j", descriptor = "I")
    public static int field9130;

    @OriginalMember(owner = "client!wn", name = "k", descriptor = "I")
    public int field9131;

    @OriginalMember(owner = "client!wn", name = "n", descriptor = "I")
    public int field9134;

    @OriginalMember(owner = "client!wn", name = "o", descriptor = "I")
    public int field9135;

    @OriginalMember(owner = "client!wn", name = "p", descriptor = "I")
    public static int field9136;

    @OriginalMember(owner = "client!wn", name = "i", descriptor = "Lfaa;")
    public class136 field9129;

    @OriginalMember(owner = "client!wn", name = "l", descriptor = "[[B")
    public static byte[][] field9132;

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "(I)V", line = 4)
    public static final void method3620(int arg0) {
        class428.field5755 = -1;
        if (arg0 <= -119) {
            class302.field4155 = null;
            field9130++;
        }
    }

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "(B)V", line = 16)
    public static void method3621(byte arg0) {
        field9132 = null;
        int var1 = -109 / ((arg0 + 17) / 48);
        field9133 = null;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "([[BII[B[[B[II[I)I", line = 31)
    public static final int method3622(byte[][] arg0, int arg1, int arg2, byte[] arg3, byte[][] arg4, int[] arg5, int arg6, int[] arg7) {
        field9136++;
        int var8 = arg5[arg6];
        int var9 = arg7[arg6] + var8;
        int var10 = arg5[arg2];
        int var11 = arg7[arg2] + var10;
        int var12 = var8;
        if (var8 < var10) {
            var12 = var10;
        }
        int var13 = var9;
        if (var11 < var9) {
            var13 = var11;
        }
        int var14 = arg3[arg6] & 0xFF;
        if ((arg1 & arg3[arg2]) < var14) {
            var14 = arg3[arg2] & 0xFF;
        }
        byte[] var15 = arg0[arg6];
        byte[] var16 = arg4[arg2];
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
}
