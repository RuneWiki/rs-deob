import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public class class1 extends class314 {

    @OriginalMember(owner = "client!us", name = "S", descriptor = "I")
    private int field8 = 32768;

    @OriginalMember(owner = "client!us", name = "P", descriptor = "Z")
    public static boolean field5 = false;

    @OriginalMember(owner = "client!us", name = "U", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!us", name = "V", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!us", name = "M", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!us", name = "N", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!us", name = "O", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!us", name = "Q", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!us", name = "R", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!us", name = "T", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!us", name = "L", descriptor = "Lri;")
    public static class97 field1;

    @OriginalMember(owner = "client!us", name = "h", descriptor = "(I)Lcw;", line = 4)
    public static final class165 method1(int arg0) {
        ++field10;
        if (class149.field2476 == 0) {
            return new class165();
        } else {
            int var1 = 115 % ((-59 - arg0) / 47);
            return class462.field6902[--class149.field2476];
        }
    }

    @OriginalMember(owner = "client!us", name = "i", descriptor = "(I)V", line = 19)
    public static void method2(int arg0) {
        field1 = null;
        if (arg0 != -21839) {
            method1(18);
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(B)V", line = 31)
    public final void method3(byte arg0) {
        class46.method546(arg0 ^ 15546);
        if (arg0 != -15) {
            method7((class416) null, (byte) 53, (class416) null);
        }
        ++field3;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IB)[[I", line = 42)
    public final int[][] method4(int arg0, byte arg1) {
        if (arg1 <= 68) {
            field1 = null;
        }
        ++field11;
        int[][] var3 = super.field4931.method1345(arg0, 0);
        if (super.field4931.field2799) {
            int[] var4 = this.method2140(1, arg0, -125);
            int[] var5 = this.method2140(2, arg0, -125);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; ~var9 > ~class81.field1009; ++var9) {
                int var10 = var4[var9] * 255 >> 12 & 255;
                int var11 = var5[var9] * this.field8 >> 12;
                int var12 = class174.field2873[var10] * var11 >> 12;
                int var13 = class204.field3328[var10] * var11 >> 12;
                int var14 = class504.field7373 & (var12 >> 12) + var9;
                int var15 = (var13 >> 12) + arg0 & class66.field849;
                int[][] var16 = this.method2143(0, var15, (byte) -4);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(BLie;I)V", line = 104)
    public final void method5(byte arg0, class6 arg1, int arg2) {
        ++field7;
        if (~arg2 != -1) {
            if (~arg2 == -2) {
                super.field4936 = arg1.method70(-9059) == 1;
            }
        } else {
            this.field8 = arg1.method67(12021) << 4;
        }
        if (arg0 >= -1) {
            field6 = 36;
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(II)[I", line = 140)
    public final int[] method6(int arg0, int arg1) {
        ++field2;
        int[] var3 = super.field4928.method534((byte) -125, arg0);
        if (super.field4928.field618) {
            int[] var4 = this.method2140(1, arg0, -124);
            int[] var5 = this.method2140(2, arg0, -127);
            for (int var6 = 0; var6 < class81.field1009; ++var6) {
                int var7 = (4083 & var4[var6]) >> 4;
                int var8 = var5[var6] * this.field8 >> 12;
                int var9 = class174.field2873[var7] * var8 >> 12;
                int var10 = class204.field3328[var7] * var8 >> 12;
                int var11 = class504.field7373 & (var9 >> 12) + var6;
                int var12 = class66.field849 & arg0 - -(var10 >> 12);
                int[] var13 = this.method2140(0, var12, -123);
                var3[var6] = var13[var11];
            }
        }
        if (arg1 < 109) {
            this.method5((byte) -120, (class6) null, -118);
        }
        return var3;
    }

    @OriginalMember(owner = "client!us", name = "<init>", descriptor = "()V", line = 195)
    public class1() {
        super(3, false);
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Ljea;BLjea;)V", line = 202)
    public static final void method7(class416 arg0, byte arg1, class416 arg2) {
        ++field4;
        if (arg2.field6366 != null) {
            arg2.method2648((byte) -25);
        }
        arg2.field6366 = arg0.field6366;
        arg2.field6367 = arg0;
        int var3 = 117 / ((arg1 - -69) / 36);
        arg2.field6366.field6367 = arg2;
        arg2.field6367.field6366 = arg2;
    }
}
