import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class12 extends class45 {

    @OriginalMember(owner = "client!ds", name = "H", descriptor = "I")
    private int field197 = 32768;

    @OriginalMember(owner = "client!ds", name = "N", descriptor = "[I")
    public static int[] field202 = new int[5];

    @OriginalMember(owner = "client!ds", name = "M", descriptor = "Lrn;")
    public static class174 field201 = new class174(74, -1);

    @OriginalMember(owner = "client!ds", name = "P", descriptor = "[Ljava/lang/String;")
    public static String[] field204 = new String[100];

    @OriginalMember(owner = "client!ds", name = "R", descriptor = "I")
    public static int field206 = 0;

    @OriginalMember(owner = "client!ds", name = "Q", descriptor = "J")
    public static long field205 = 0L;

    @OriginalMember(owner = "client!ds", name = "S", descriptor = "Ljava/lang/String;")
    public static String field207 = "";

    @OriginalMember(owner = "client!ds", name = "J", descriptor = "I")
    public static int field198;

    @OriginalMember(owner = "client!ds", name = "K", descriptor = "I")
    public static int field199;

    @OriginalMember(owner = "client!ds", name = "L", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!ds", name = "O", descriptor = "I")
    public static int field203;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Lcu;II)V")
    public final void method37(class145 arg0, int arg1, int arg2) {
        if (arg1 != -26471) {
            this.method35(-16, -113);
        }
        ++field203;
        if (~arg2 != -1) {
            if (~arg2 == -2) {
                super.field844 = arg0.method1063((byte) -109) == 1;
            }
        } else {
            this.field197 = arg0.method1069((byte) -59) << 4;
        }
    }

    @OriginalMember(owner = "client!ds", name = "d", descriptor = "(I)V")
    public final void method38(int arg0) {
        if (arg0 != 4095) {
            field204 = null;
        }
        ++field200;
        class416.method2523(arg0 + 1);
    }

    @OriginalMember(owner = "client!ds", name = "f", descriptor = "(B)V")
    public static void method84(byte arg0) {
        field202 = null;
        field207 = null;
        if (arg0 > 108) {
            field201 = null;
            field204 = null;
        }
    }

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "(II)[[I")
    public final int[][] method49(int arg0, int arg1) {
        if (arg0 != 8) {
            this.method37((class145) null, 118, 40);
        }
        ++field199;
        int[][] var3 = super.field833.method835(arg1, (byte) 23);
        if (super.field833.field1888) {
            int[] var4 = this.method434(1, arg1, 116);
            int[] var5 = this.method434(2, arg1, 119);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; class259.field3768 > var9; ++var9) {
                int var10 = var4[var9] * 255 >> 12 & 255;
                int var11 = var5[var9] * this.field197 >> 12;
                int var12 = class57.field1002[var10] * var11 >> 12;
                int var13 = class68.field1167[var10] * var11 >> 12;
                int var14 = (var12 >> 12) + var9 & class290.field4128;
                int var15 = class506.field7463 & (var13 >> 12) + arg1;
                int[][] var16 = this.method437(0, var15, 60);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ds", name = "<init>", descriptor = "()V")
    public class12() {
        super(3, false);
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        if (arg0 != 0) {
            this.method35(6, 119);
        }
        ++field198;
        int[] var3 = super.field854.method863((byte) 12, arg1);
        if (super.field854.field1928) {
            int[] var4 = this.method434(1, arg1, -56);
            int[] var5 = this.method434(2, arg1, -93);
            for (int var6 = 0; class259.field3768 > var6; ++var6) {
                int var7 = (var4[var6] & 4089) >> 4;
                int var8 = var5[var6] * this.field197 >> 12;
                int var9 = class57.field1002[var7] * var8 >> 12;
                int var10 = class68.field1167[var7] * var8 >> 12;
                int var11 = (var9 >> 12) + var6 & class290.field4128;
                int var12 = (var10 >> 12) + arg1 & class506.field7463;
                int[] var13 = this.method434(0, var12, 118);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }
}
