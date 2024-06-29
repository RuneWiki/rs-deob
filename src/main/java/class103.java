import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public class class103 extends class585 {

    @OriginalMember(owner = "client!ps", name = "E", descriptor = "Lbu;")
    public static class21 field1183 = new class21(115, -2);

    @OriginalMember(owner = "client!ps", name = "L", descriptor = "Lbu;")
    public static class21 field1189 = new class21(24, -1);

    @OriginalMember(owner = "client!ps", name = "N", descriptor = "I")
    public static int field1191 = 0;

    @OriginalMember(owner = "client!ps", name = "F", descriptor = "I")
    public static int field1184;

    @OriginalMember(owner = "client!ps", name = "G", descriptor = "I")
    public static int field1185;

    @OriginalMember(owner = "client!ps", name = "H", descriptor = "I")
    public static int field1186;

    @OriginalMember(owner = "client!ps", name = "I", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!ps", name = "K", descriptor = "I")
    public static int field1188;

    @OriginalMember(owner = "client!ps", name = "M", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!ps", name = "O", descriptor = "I")
    public static int field1192;

    @OriginalMember(owner = "client!ps", name = "P", descriptor = "[I")
    public static int[] field1193;

    @OriginalMember(owner = "client!ps", name = "c", descriptor = "(I)[Ljb;")
    public static final class518[] method725(int arg0) {
        if (arg0 <= 37) {
            field1183 = null;
        }
        ++field1184;
        return new class518[] { class763.field10505, class763.field10506, class763.field10507, class763.field10508, class763.field10509, class763.field10510, class763.field10511, class763.field10512, class763.field10513, class763.field10514, class763.field10515, class763.field10516, class763.field10517 };
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method58(boolean arg0, int arg1) {
        ++field1185;
        int[][] var3 = super.field8265.method1576((byte) 125, arg1);
        if (super.field8265.field3546) {
            int[] var4 = this.method3415(-128, 2, arg1);
            int[][] var5 = this.method3417(0, arg1, (byte) 113);
            int[][] var6 = this.method3417(1, arg1, (byte) 113);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; ~var16 > ~class293.field4278; ++var16) {
                int var17 = var4[var16];
                if (~var17 != -4097) {
                    if (var17 == 0) {
                        var7[var16] = var13[var16];
                        var8[var16] = var14[var16];
                        var9[var16] = var15[var16];
                    } else {
                        int var18 = -var17 + 4096;
                        var7[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                        var8[var16] = var11[var16] * var17 - -(var14[var16] * var18) >> 12;
                        var9[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                    }
                } else {
                    var7[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var9[var16] = var12[var16];
                }
            }
        }
        return arg0 ? null : var3;
    }

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "(III)Lmb;")
    public static final class274 method726(int arg0, int arg1, int arg2) {
        if (arg1 > -108) {
            return null;
        } else {
            ++field1186;
            class274 var3 = new class274();
            var3.field3959 = arg0 + 1 + 5;
            var3.field3978 = -1;
            var3.field3953 = arg2 - -6;
            var3.field3968 = -1;
            var3.field3974 = new int[var3.field3959][var3.field3953];
            var3.method1772(24754);
            return var3;
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(Lso;II)V")
    public final void method54(class494 arg0, int arg1, int arg2) {
        ++field1187;
        if (arg1 != 1) {
            this.method55(61, 3);
        }
        if (~arg2 == -1) {
            super.field8266 = arg0.method2964((byte) 105) == 1;
        }
    }

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "(II)[I")
    public final int[] method55(int arg0, int arg1) {
        ++field1188;
        int[] var3 = super.field8255.method1637(-29827, arg0);
        if (arg1 < 123) {
            field1183 = null;
        }
        if (super.field8255.field3677) {
            int[] var4 = this.method3415(-128, 0, arg0);
            int[] var5 = this.method3415(-128, 1, arg0);
            int[] var6 = this.method3415(-128, 2, arg0);
            for (int var7 = 0; ~class293.field4278 < ~var7; ++var7) {
                int var8 = var6[var7];
                if (~var8 != -4097) {
                    if (var8 == 0) {
                        var3[var7] = var5[var7];
                    } else {
                        var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                    }
                } else {
                    var3[var7] = var4[var7];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ps", name = "<init>", descriptor = "()V")
    public class103() {
        super(3, false);
    }

    @OriginalMember(owner = "client!ps", name = "d", descriptor = "(I)V")
    public static void method727(int arg0) {
        field1189 = null;
        if (arg0 <= 121) {
            method727(-38);
        }
        field1183 = null;
        field1193 = null;
    }
}
