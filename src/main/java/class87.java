import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eda")
public class class87 extends class694 {

    @OriginalMember(owner = "client!eda", name = "J", descriptor = "Luc;")
    public static class27 field1189 = new class27(8, -1);

    @OriginalMember(owner = "client!eda", name = "K", descriptor = "Z")
    public static boolean field1190 = false;

    @OriginalMember(owner = "client!eda", name = "G", descriptor = "I")
    public static int field1186;

    @OriginalMember(owner = "client!eda", name = "H", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!eda", name = "I", descriptor = "I")
    public static int field1188;

    @OriginalMember(owner = "client!eda", name = "L", descriptor = "I")
    public static int field1191;

    @OriginalMember(owner = "client!eda", name = "M", descriptor = "Lfo;")
    public static class476 field1192;

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(II)[I", line = 4)
    public final int[] method39(int arg0, int arg1) {
        ++field1191;
        if (arg0 <= 112) {
            return null;
        } else {
            int[] var3 = super.field9751.method2712(arg1, (byte) 118);
            if (super.field9751.field6674) {
                int[] var4 = this.method3809(0, arg1, (byte) 35);
                int[] var5 = this.method3809(1, arg1, (byte) 35);
                int[] var6 = this.method3809(2, arg1, (byte) 35);
                for (int var7 = 0; class465.field6544 > var7; ++var7) {
                    int var8 = var6[var7];
                    if (var8 == 4096) {
                        var3[var7] = var4[var7];
                    } else if (var8 != 0) {
                        var3[var7] = var4[var7] * var8 - -((-var8 + 4096) * var5[var7]) >> 12;
                    } else {
                        var3[var7] = var5[var7];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!eda", name = "<init>", descriptor = "()V", line = 56)
    public class87() {
        super(3, false);
    }

    @OriginalMember(owner = "client!eda", name = "b", descriptor = "(Z)V", line = 59)
    public static void method659(boolean arg0) {
        field1189 = null;
        if (!arg0) {
            field1192 = null;
        }
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(BII)Z", line = 72)
    public static final boolean method660(byte arg0, int arg1, int arg2) {
        ++field1187;
        if (arg0 >= -23) {
            method660((byte) -34, -70, -22);
        }
        return class183.method1235(arg2, 44, arg1) | (arg2 & 458752) != 0 || class578.method3166(arg2, arg1, 91);
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(ILjr;B)V", line = 84)
    public final void method19(int arg0, class96 arg1, byte arg2) {
        if (arg0 == 0) {
            super.field9744 = ~arg1.method718(-85) == -2;
        }
        int var4 = 79 / ((58 - arg2) / 63);
        ++field1188;
    }

    @OriginalMember(owner = "client!eda", name = "c", descriptor = "(II)[[I", line = 102)
    public final int[][] method15(int arg0, int arg1) {
        if (arg0 != -22151) {
            field1192 = null;
        }
        ++field1186;
        int[][] var3 = super.field9740.method3483(arg1, true);
        if (super.field9740.field8738) {
            int[] var4 = this.method3809(2, arg1, (byte) 35);
            int[][] var5 = this.method3812(arg1, 0, -14032);
            int[][] var6 = this.method3812(arg1, 1, -14032);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; ~class465.field6544 < ~var16; ++var16) {
                int var17 = var4[var16];
                if (~var17 != -4097) {
                    if (~var17 == -1) {
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
        return var3;
    }
}
