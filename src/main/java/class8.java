import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class8 extends class16 {

    @OriginalMember(owner = "client!gk", name = "U", descriptor = "I")
    public static int field91 = 0;

    @OriginalMember(owner = "client!gk", name = "T", descriptor = "I")
    public static int field90 = 0;

    @OriginalMember(owner = "client!gk", name = "X", descriptor = "I")
    public static int field94 = 99;

    @OriginalMember(owner = "client!gk", name = "R", descriptor = "Z")
    public static boolean field88 = false;

    @OriginalMember(owner = "client!gk", name = "Q", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!gk", name = "V", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "client!gk", name = "W", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!gk", name = "Y", descriptor = "Lfj;")
    public static class254 field95;

    @OriginalMember(owner = "client!gk", name = "S", descriptor = "Lkb;")
    public static class39 field89;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(BLim;I)V", line = 5)
    public final void method52(byte arg0, class192 arg1, int arg2) {
        if (arg0 != -7) {
            this.method8(false, -120);
        }
        if (arg2 == 0) {
            this.field191 = arg1.method1399(-1172389784) == 1;
        }
        field92++;
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(ZI)[I", line = 24)
    public final int[] method8(boolean arg0, int arg1) {
        if (!arg0) {
            method53(-65);
        }
        int[] var3 = this.field207.method1784(arg1, (byte) 102);
        if (this.field207.field4024) {
            int[] var4 = this.method103(0, 4389, arg1);
            int[] var5 = this.method103(1, 4389, arg1);
            int[] var6 = this.method103(2, 4389, arg1);
            for (int var7 = 0; var7 < class276.field4376; var7++) {
                int var8 = var6[var7];
                if (var8 == 4096) {
                    var3[var7] = var4[var7];
                } else if (var8 == 0) {
                    var3[var7] = var5[var7];
                } else {
                    var3[var7] = (4096 - var8) * var5[var7] + var4[var7] * var8 >> 12;
                }
            }
        }
        field87++;
        return var3;
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "()V", line = 88)
    public class8() {
        super(3, false);
    }

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "(I)V", line = 92)
    public static void method53(int arg0) {
        field95 = null;
        if (arg0 >= -37) {
            method53(-22);
        }
        field89 = null;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IB)[[I", line = 112)
    public final int[][] method54(int arg0, byte arg1) {
        int var3 = -59 / ((40 - arg1) / 41);
        field93++;
        int[][] var4 = this.field197.method715(true, arg0);
        if (this.field197.field1548) {
            int[] var5 = this.method103(2, 4389, arg0);
            int[][] var6 = this.method111(0, (byte) 122, arg0);
            int[][] var7 = this.method111(1, (byte) 122, arg0);
            int[] var8 = var6[0];
            int[] var9 = var6[1];
            int[] var10 = var4[0];
            int[] var11 = var4[1];
            int[] var12 = var4[2];
            int[] var13 = var6[2];
            int[] var14 = var7[0];
            int[] var15 = var7[1];
            int[] var16 = var7[2];
            for (int var17 = 0; var17 < class276.field4376; var17++) {
                int var18 = var5[var17];
                if (var18 == 4096) {
                    var10[var17] = var8[var17];
                    var11[var17] = var9[var17];
                    var12[var17] = var13[var17];
                } else if (var18 == 0) {
                    var10[var17] = var14[var17];
                    var11[var17] = var15[var17];
                    var12[var17] = var16[var17];
                } else {
                    int var19 = 4096 - var18;
                    var10[var17] = var8[var17] * var18 + var14[var17] * var19 >> 12;
                    var11[var17] = var9[var17] * var18 + (var15[var17] * var19) >> 12;
                    var12[var17] = var13[var17] * var18 + var16[var17] * var19 >> 12;
                }
            }
        }
        return var4;
    }
}
