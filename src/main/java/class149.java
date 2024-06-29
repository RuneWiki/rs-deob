import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class149 extends class748 {

    @OriginalMember(owner = "client!qa", name = "H", descriptor = "I")
    private int field2053 = 32768;

    @OriginalMember(owner = "client!qa", name = "P", descriptor = "[I")
    public static int[] field2061 = new int[25];

    @OriginalMember(owner = "client!qa", name = "I", descriptor = "I")
    public static int field2054;

    @OriginalMember(owner = "client!qa", name = "J", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!qa", name = "K", descriptor = "I")
    public static int field2056;

    @OriginalMember(owner = "client!qa", name = "L", descriptor = "I")
    public static int field2057;

    @OriginalMember(owner = "client!qa", name = "N", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!qa", name = "O", descriptor = "I")
    public static int field2060;

    @OriginalMember(owner = "client!qa", name = "M", descriptor = "[S")
    public static short[] field2058;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ljl;I)V", line = 5)
    public static final void method957(class596 arg0, int arg1) {
        arg0.field8575 = null;
        ++field2055;
        int var2 = arg0.field8579.length;
        for (int var3 = arg1; var3 < var2; ++var3) {
            arg0.field8579[var3].field3431 = false;
        }
        class336[] var4 = class704.field9787;
        synchronized (class704.field9787) {
            if (~var2 > ~class704.field9787.length && ~class296.field3860[var2] > -201) {
                class704.field9787[var2].method1946(-118, arg0);
                int var10002 = class296.field3860[var2]++;
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "()V", line = 31)
    public class149() {
        super(3, false);
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(II)[[I", line = 36)
    public final int[][] method445(int arg0, int arg1) {
        if (arg1 != 0) {
            method959(-95);
        }
        ++field2056;
        int[][] var3 = super.field10420.method930(29784, arg0);
        if (super.field10420.field1979) {
            int[] var4 = this.method4157(1, (byte) 24, arg0);
            int[] var5 = this.method4157(2, (byte) -116, arg0);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; ~class424.field5889 < ~var9; ++var9) {
                int var10 = (var4[var9] * 255 & 1046588) >> 12;
                int var11 = var5[var9] * this.field2053 >> 12;
                int var12 = class666.field9382[var10] * var11 >> 12;
                int var13 = class510.field7112[var10] * var11 >> 12;
                int var14 = class354.field4552 & (var12 >> 12) + var9;
                int var15 = class150.field2077 & (var13 >> 12) + arg0;
                int[][] var16 = this.method4159(0, 0, var15);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)V", line = 99)
    public final void method23(byte arg0) {
        class503.method3003((byte) 121);
        if (arg0 != 67) {
            this.method20(84, true, (class26) null);
        }
        ++field2060;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lvj;B)Lwt;", line = 113)
    public static final class449 method958(class26 arg0, byte arg1) {
        ++field2057;
        int var2 = -78 / ((54 - arg1) / 62);
        class449 var3 = new class449();
        var3.field6173 = arg0.method193(2);
        var3.field6174 = class225.field3151.method3658((byte) -45, var3.field6173);
        return var3;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IZLvj;)V", line = 127)
    public final void method20(int arg0, boolean arg1, class26 arg2) {
        if (~arg0 != -1) {
            if (arg0 == 1) {
                super.field10414 = ~arg2.method194((byte) 119) == -2;
            }
        } else {
            this.field2053 = arg2.method193(2) << 4;
        }
        if (arg1) {
            this.method23((byte) -108);
        }
        ++field2054;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)[I", line = 162)
    public final int[] method25(int arg0, int arg1) {
        ++field2059;
        if (arg1 != 255) {
            method957((class596) null, -3);
        }
        int[] var3 = super.field10407.method3873(0, arg0);
        if (super.field10407.field9527) {
            int[] var4 = this.method4157(1, (byte) -104, arg0);
            int[] var5 = this.method4157(2, (byte) -127, arg0);
            for (int var6 = 0; var6 < class424.field5889; ++var6) {
                int var7 = (var4[var6] & 4095) >> 4;
                int var8 = var5[var6] * this.field2053 >> 12;
                int var9 = class666.field9382[var7] * var8 >> 12;
                int var10 = class510.field7112[var7] * var8 >> 12;
                int var11 = (var9 >> 12) + var6 & class354.field4552;
                int var12 = class150.field2077 & (var10 >> 12) + arg0;
                int[] var13 = this.method4157(0, (byte) -102, var12);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "(I)V", line = 210)
    public static void method959(int arg0) {
        field2061 = null;
        if (arg0 != 45047404) {
            field2058 = null;
        }
        field2058 = null;
    }
}
