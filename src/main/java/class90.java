import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class90 extends class35 {

    @OriginalMember(owner = "client!bk", name = "r", descriptor = "I")
    public static int field1257 = 0;

    @OriginalMember(owner = "client!bk", name = "l", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!bk", name = "o", descriptor = "I")
    public static int field1254;

    @OriginalMember(owner = "client!bk", name = "q", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!bk", name = "p", descriptor = "J")
    public long field1255;

    @OriginalMember(owner = "client!bk", name = "m", descriptor = "Lbk;")
    public class90 field1252;

    @OriginalMember(owner = "client!bk", name = "n", descriptor = "Lbk;")
    public class90 field1253;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "([[B[I[I[[B[BIII)I", line = 6)
    public static final int method699(byte[][] arg0, int[] arg1, int[] arg2, byte[][] arg3, byte[] arg4, int arg5, int arg6, int arg7) {
        field1251++;
        int var8 = arg1[arg7];
        int var9 = arg2[arg7] + var8;
        int var10 = arg1[arg5];
        int var11 = arg2[arg5] + var10;
        int var12 = var8;
        if (var10 > var8) {
            var12 = var10;
        }
        int var13 = var9;
        if (var9 > var11) {
            var13 = var11;
        }
        int var14 = arg4[arg7] & 0xFF;
        if ((arg4[arg5] & 0xFF) < var14) {
            var14 = arg4[arg5] & 0xFF;
        }
        byte[] var15 = arg0[arg7];
        if (arg6 > -24) {
            return -57;
        }
        byte[] var16 = arg3[arg5];
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

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "(I)Z", line = 70)
    public final boolean method700(int arg0) {
        field1256++;
        if (arg0 <= 88) {
            field1257 = 72;
        }
        return this.field1252 != null;
    }

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "(I)V", line = 89)
    public final void method701(int arg0) {
        if (arg0 > -3) {
            this.method700(-81);
        }
        field1254++;
        if (this.field1252 != null) {
            this.field1252.field1253 = this.field1253;
            this.field1253.field1252 = this.field1252;
            this.field1252 = null;
            this.field1253 = null;
        }
    }
}
