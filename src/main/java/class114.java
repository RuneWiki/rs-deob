import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class114 {

    @OriginalMember(owner = "client!uq", name = "c", descriptor = "I")
    public static int field1700 = 0;

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "Lbd;")
    public static class44 field1698 = new class44(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!uq", name = "d", descriptor = "Ljava/lang/String;")
    public static String field1701;

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(B)V")
    public static void method806(byte arg0) {
        if (arg0 <= 94) {
            field1698 = null;
        }
        field1698 = null;
        field1701 = null;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "([BII[I[I[[BI[[B)I")
    public static final int method807(byte[] arg0, int arg1, int arg2, int[] arg3, int[] arg4, byte[][] arg5, int arg6, byte[][] arg7) {
        field1699++;
        int var8 = arg4[arg2];
        int var9 = var8 + arg3[arg2];
        int var10 = arg4[arg1];
        int var11 = arg3[arg1] + var10;
        int var12 = var8;
        if (var8 < var10) {
            var12 = var10;
        }
        if (arg6 <= 10) {
            method807(null, -121, -75, null, null, null, 82, null);
        }
        int var13 = var9;
        if (var11 < var9) {
            var13 = var11;
        }
        int var14 = arg0[arg2] & 0xFF;
        if (var14 > (arg0[arg1] & 0xFF)) {
            var14 = arg0[arg1] & 0xFF;
        }
        byte[] var15 = arg5[arg2];
        byte[] var16 = arg7[arg1];
        int var17 = var12 - var8;
        int var18 = var12 - var10;
        for (int var19 = var12; var19 < var13; var19++) {
            int var20 = var15[var17++] + var16[var18++];
            if (var20 < var14) {
                var14 = var20;
            }
        }
        return -var14;
    }
}
