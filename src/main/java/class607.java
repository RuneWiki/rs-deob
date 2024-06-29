import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rda")
public class class607 extends class694 {

    @OriginalMember(owner = "client!rda", name = "H", descriptor = "I")
    private int field8449 = 32768;

    @OriginalMember(owner = "client!rda", name = "L", descriptor = "Ldg;")
    public static class377 field8453 = new class377();

    @OriginalMember(owner = "client!rda", name = "F", descriptor = "I")
    public static int field8447;

    @OriginalMember(owner = "client!rda", name = "G", descriptor = "I")
    public static int field8448;

    @OriginalMember(owner = "client!rda", name = "I", descriptor = "I")
    public static int field8450;

    @OriginalMember(owner = "client!rda", name = "J", descriptor = "I")
    public static int field8451;

    @OriginalMember(owner = "client!rda", name = "K", descriptor = "I")
    public static int field8452;

    @OriginalMember(owner = "client!rda", name = "c", descriptor = "(II)[[I")
    public final int[][] method15(int arg0, int arg1) {
        ++field8452;
        int[][] var3 = super.field9740.method3483(arg1, true);
        if (arg0 != -22151) {
            return null;
        } else {
            if (super.field9740.field8738) {
                int[] var4 = this.method3809(1, arg1, (byte) 35);
                int[] var5 = this.method3809(2, arg1, (byte) 35);
                int[] var6 = var3[0];
                int[] var7 = var3[1];
                int[] var8 = var3[2];
                for (int var9 = 0; var9 < class465.field6544; ++var9) {
                    int var10 = (1045241 & var4[var9] * 255) >> 12;
                    int var11 = var5[var9] * this.field8449 >> 12;
                    int var12 = class388.field5445[var10] * var11 >> 12;
                    int var13 = class391.field5476[var10] * var11 >> 12;
                    int var14 = var9 - -(var12 >> 12) & class168.field2537;
                    int var15 = arg1 - -(var13 >> 12) & class384.field5383;
                    int[][] var16 = this.method3812(var15, 0, -14032);
                    var6[var9] = var16[0][var14];
                    var7[var9] = var16[1][var14];
                    var8[var9] = var16[2][var14];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!rda", name = "<init>", descriptor = "()V")
    public class607() {
        super(3, false);
    }

    @OriginalMember(owner = "client!rda", name = "d", descriptor = "(III)V")
    public static final void method3356(int arg0, int arg1, int arg2) {
        ++field8447;
        class679 var3 = class669.method3708(16, arg0, 1403048928);
        var3.method3748(true);
        if (arg2 == -2) {
            var3.field9574 = arg1;
        }
    }

    @OriginalMember(owner = "client!rda", name = "g", descriptor = "(I)V")
    public final void method40(int arg0) {
        if (arg0 <= 5) {
            this.field8449 = -126;
        }
        ++field8451;
        class280.method1698(123);
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(ILjr;B)V")
    public final void method19(int arg0, class96 arg1, byte arg2) {
        if (arg0 != 0) {
            if (~arg0 == -2) {
                super.field9744 = arg1.method718(-120) == 1;
            }
        } else {
            this.field8449 = arg1.method743((byte) -48) << 4;
        }
        int var5 = 28 % ((58 - arg2) / 63);
        ++field8450;
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(II)[I")
    public final int[] method39(int arg0, int arg1) {
        ++field8448;
        int[] var3 = super.field9751.method2712(arg1, (byte) 118);
        if (arg0 < 112) {
            this.method39(-17, -5);
        }
        if (super.field9751.field6674) {
            int[] var4 = this.method3809(1, arg1, (byte) 35);
            int[] var5 = this.method3809(2, arg1, (byte) 35);
            for (int var6 = 0; class465.field6544 > var6; ++var6) {
                int var7 = var4[var6] >> 4 & 255;
                int var8 = var5[var6] * this.field8449 >> 12;
                int var9 = class388.field5445[var7] * var8 >> 12;
                int var10 = class391.field5476[var7] * var8 >> 12;
                int var11 = class168.field2537 & (var9 >> 12) + var6;
                int var12 = class384.field5383 & arg1 - -(var10 >> 12);
                int[] var13 = this.method3809(0, var12, (byte) 35);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(B)V")
    public static void method3357(byte arg0) {
        if (arg0 != 14) {
            method3357((byte) 125);
        }
        field8453 = null;
    }
}
