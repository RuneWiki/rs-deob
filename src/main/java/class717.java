import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class717 extends class748 {

    @OriginalMember(owner = "client!qp", name = "H", descriptor = "I")
    public static int field10135;

    @OriginalMember(owner = "client!qp", name = "I", descriptor = "I")
    public static int field10136;

    @OriginalMember(owner = "client!qp", name = "J", descriptor = "I")
    public static int field10137;

    @OriginalMember(owner = "client!qp", name = "L", descriptor = "I")
    public static int field10139;

    @OriginalMember(owner = "client!qp", name = "M", descriptor = "I")
    public static int field10140;

    @OriginalMember(owner = "client!qp", name = "K", descriptor = "Ljm;")
    public static class6 field10138;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(II)[I")
    public final int[] method25(int arg0, int arg1) {
        ++field10135;
        if (arg1 != 255) {
            field10138 = null;
        }
        int[] var3 = super.field10407.method3873(0, arg0);
        if (super.field10407.field9527) {
            int[] var4 = this.method4157(0, (byte) 71, arg0);
            int[] var5 = this.method4157(1, (byte) -69, arg0);
            int[] var6 = this.method4157(2, (byte) -79, arg0);
            for (int var7 = 0; ~var7 > ~class424.field5889; ++var7) {
                int var8 = var6[var7];
                if (var8 != 4096) {
                    if (var8 == 0) {
                        var3[var7] = var5[var7];
                    } else {
                        var3[var7] = var4[var7] * var8 - -((-var8 + 4096) * var5[var7]) >> 12;
                    }
                } else {
                    var3[var7] = var4[var7];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IZLvj;)V")
    public final void method20(int arg0, boolean arg1, class26 arg2) {
        ++field10136;
        if (arg1) {
            method4031((class545) null, (byte) -59);
        }
        if (arg0 == 0) {
            super.field10414 = arg2.method194((byte) 119) == 1;
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lha;B)V")
    public static final void method4031(class545 arg0, byte arg1) {
        ++field10139;
        class140.field1926 = class591.method3510((byte) -128, arg0, class661.field9333, true);
        class608.field8657 = class564.method3368((byte) 87, arg0, class661.field9333);
        class339.field4345 = class591.method3510((byte) -120, arg0, class688.field9641, true);
        class442.field6064 = class564.method3368((byte) 104, arg0, class688.field9641);
        class743.field10354 = class591.method3510((byte) -119, arg0, class574.field8108, true);
        if (arg1 != 50) {
            method4032(50);
        }
        class514.field7181 = class564.method3368((byte) 125, arg0, class574.field8108);
    }

    @OriginalMember(owner = "client!qp", name = "g", descriptor = "(I)V")
    public static void method4032(int arg0) {
        if (arg0 != -1600551476) {
            method4032(41);
        }
        field10138 = null;
    }

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "(II)[[I")
    public final int[][] method445(int arg0, int arg1) {
        ++field10137;
        int[][] var3 = super.field10420.method930(29784, arg0);
        if (super.field10420.field1979) {
            int[] var4 = this.method4157(2, (byte) 70, arg0);
            int[][] var5 = this.method4159(0, arg1, arg0);
            int[][] var6 = this.method4159(1, 0, arg0);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; class424.field5889 > var16; ++var16) {
                int var17 = var4[var16];
                if (var17 == 4096) {
                    var7[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var9[var16] = var12[var16];
                } else if (var17 == 0) {
                    var7[var16] = var13[var16];
                    var8[var16] = var14[var16];
                    var9[var16] = var15[var16];
                } else {
                    int var18 = -var17 + 4096;
                    var7[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                    var8[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                    var9[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                }
            }
        }
        if (arg1 != 0) {
            this.method25(-96, 66);
        }
        return var3;
    }

    @OriginalMember(owner = "client!qp", name = "<init>", descriptor = "()V")
    public class717() {
        super(3, false);
    }
}
