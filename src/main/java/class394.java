import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public class class394 extends class739 {

    @OriginalMember(owner = "client!fu", name = "L", descriptor = "I")
    private int field5000 = 32768;

    @OriginalMember(owner = "client!fu", name = "J", descriptor = "[I")
    public static int[] field4998 = new int[120];

    @OriginalMember(owner = "client!fu", name = "E", descriptor = "I")
    public static int field4993;

    @OriginalMember(owner = "client!fu", name = "F", descriptor = "I")
    public static int field4994;

    @OriginalMember(owner = "client!fu", name = "G", descriptor = "I")
    public static int field4995;

    @OriginalMember(owner = "client!fu", name = "H", descriptor = "I")
    public static int field4996;

    @OriginalMember(owner = "client!fu", name = "I", descriptor = "I")
    public static int field4997;

    @OriginalMember(owner = "client!fu", name = "K", descriptor = "I")
    public static int field4999;

    @OriginalMember(owner = "client!fu", name = "M", descriptor = "I")
    public static int field5001;

    @OriginalMember(owner = "client!fu", name = "c", descriptor = "(I)V")
    public final void method216(int arg0) {
        class144.method1039((byte) -24);
        ++field4994;
        if (arg0 != -21773) {
            method2220((byte) 107, 86);
        }
    }

    @OriginalMember(owner = "client!fu", name = "<init>", descriptor = "()V")
    public class394() {
        super(3, false);
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "([BIZI)I")
    public static final int method2218(byte[] arg0, int arg1, boolean arg2, int arg3) {
        ++field4995;
        if (arg2) {
            field4998 = null;
        }
        int var4 = -1;
        for (int var5 = arg1; ~var5 > ~arg3; ++var5) {
            var4 = class454.field6069[(arg0[var5] ^ var4) & 255] ^ var4 >>> 8;
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(BI)[[I")
    public final int[][] method223(byte arg0, int arg1) {
        ++field4993;
        if (arg0 <= 26) {
            this.field5000 = -92;
        }
        int[][] var3 = super.field10312.method2191((byte) 52, arg1);
        if (super.field10312.field4922) {
            int[] var4 = this.method4115(-115, arg1, 1);
            int[] var5 = this.method4115(-121, arg1, 2);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; ~var9 > ~class29.field523; ++var9) {
                int var10 = 255 & var4[var9] * 255 >> 12;
                int var11 = var5[var9] * this.field5000 >> 12;
                int var12 = class195.field2670[var10] * var11 >> 12;
                int var13 = class709.field9851[var10] * var11 >> 12;
                int var14 = class346.field4366 & (var12 >> 12) + var9;
                int var15 = arg1 - -(var13 >> 12) & class683.field9515;
                int[][] var16 = this.method4119(2, 0, var15);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "(II)V")
    public static final void method2219(int arg0, int arg1) {
        ++field4996;
        class37 var2 = class636.method3571(11, arg0, -92);
        if (arg1 >= 106) {
            var2.method230(119);
        }
    }

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "(BI)I")
    public static final int method2220(byte arg0, int arg1) {
        if (arg0 != 88) {
            method2221(87);
        }
        ++field4999;
        return arg1 & 255;
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(Lsl;II)V")
    public final void method214(class461 arg0, int arg1, int arg2) {
        if (~arg1 != -1) {
            if (~arg1 == -2) {
                super.field10297 = arg0.method2600((byte) -126) == 1;
            }
        } else {
            this.field5000 = arg0.method2566(-2) << 4;
        }
        if (arg2 != -3) {
            method2220((byte) 97, -73);
        }
        ++field5001;
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(II)[I")
    public final int[] method215(int arg0, int arg1) {
        ++field4997;
        if (arg0 != -23347) {
            this.field5000 = -90;
        }
        int[] var3 = super.field10311.method2116(arg1, (byte) 123);
        if (super.field10311.field4728) {
            int[] var4 = this.method4115(-123, arg1, 1);
            int[] var5 = this.method4115(-117, arg1, 2);
            for (int var6 = 0; class29.field523 > var6; ++var6) {
                int var7 = (var4[var6] & 4081) >> 4;
                int var8 = var5[var6] * this.field5000 >> 12;
                int var9 = class195.field2670[var7] * var8 >> 12;
                int var10 = class709.field9851[var7] * var8 >> 12;
                int var11 = class346.field4366 & (var9 >> 12) + var6;
                int var12 = class683.field9515 & (var10 >> 12) + arg1;
                int[] var13 = this.method4115(-115, var12, 0);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fu", name = "e", descriptor = "(I)V")
    public static void method2221(int arg0) {
        if (arg0 == -1) {
            field4998 = null;
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; ~var1 > -121; ++var1) {
            int var2 = var1 - -1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field4998[var1] = var0 / 4;
        }
    }
}
