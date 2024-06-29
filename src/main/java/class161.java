import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public class class161 extends class227 {

    @OriginalMember(owner = "client!dt", name = "M", descriptor = "I")
    private int field2092 = 32768;

    @OriginalMember(owner = "client!dt", name = "L", descriptor = "[Ljava/lang/String;")
    public static String[] field2091 = new String[100];

    @OriginalMember(owner = "client!dt", name = "K", descriptor = "Lho;")
    public static class103 field2090 = new class103(22, 8);

    @OriginalMember(owner = "client!dt", name = "R", descriptor = "Lho;")
    public static class103 field2097 = new class103(6, 4);

    @OriginalMember(owner = "client!dt", name = "U", descriptor = "Lho;")
    public static class103 field2100 = new class103(28, -1);

    @OriginalMember(owner = "client!dt", name = "G", descriptor = "I")
    public static int field2087;

    @OriginalMember(owner = "client!dt", name = "I", descriptor = "I")
    public static int field2088;

    @OriginalMember(owner = "client!dt", name = "J", descriptor = "I")
    public static int field2089;

    @OriginalMember(owner = "client!dt", name = "N", descriptor = "I")
    public static int field2093;

    @OriginalMember(owner = "client!dt", name = "O", descriptor = "I")
    public static int field2094;

    @OriginalMember(owner = "client!dt", name = "P", descriptor = "I")
    public static int field2095;

    @OriginalMember(owner = "client!dt", name = "S", descriptor = "I")
    public static int field2098;

    @OriginalMember(owner = "client!dt", name = "T", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!dt", name = "Q", descriptor = "Lla;")
    public static class316 field2096;

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(IZ)[[I", line = 4)
    public final int[][] method112(int arg0, boolean arg1) {
        ++field2093;
        int[][] var3 = super.field3059.method28((byte) 104, arg0);
        if (super.field3059.field57) {
            int[] var4 = this.method1459(arg0, 109, 1);
            int[] var5 = this.method1459(arg0, 116, 2);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; ~var9 > ~class446.field6486; ++var9) {
                int var10 = (var4[var9] * 255 & 1047425) >> 12;
                int var11 = var5[var9] * this.field2092 >> 12;
                int var12 = class143.field1906[var10] * var11 >> 12;
                int var13 = class169.field2189[var10] * var11 >> 12;
                int var14 = var9 - -(var12 >> 12) & class102.field1388;
                int var15 = class115.field1508 & arg0 - -(var13 >> 12);
                int[][] var16 = this.method1460(var15, 0, 0);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        if (!arg1) {
            field2091 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!dt", name = "j", descriptor = "(I)V", line = 67)
    public static void method950(int arg0) {
        field2100 = null;
        field2090 = null;
        field2096 = null;
        field2097 = null;
        if (arg0 == 597899500) {
            field2091 = null;
        }
    }

    @OriginalMember(owner = "client!dt", name = "<init>", descriptor = "()V", line = 81)
    public class161() {
        super(3, false);
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(II)[I", line = 88)
    public final int[] method62(int arg0, int arg1) {
        ++field2089;
        if (arg0 != 15811) {
            field2098 = 80;
        }
        int[] var3 = super.field3068.method1970(arg1, (byte) 107);
        if (super.field3068.field4480) {
            int[] var4 = this.method1459(arg1, arg0 ^ 15806, 1);
            int[] var5 = this.method1459(arg1, 126, 2);
            for (int var6 = 0; var6 < class446.field6486; ++var6) {
                int var7 = (var4[var6] & 4089) >> 4;
                int var8 = var5[var6] * this.field2092 >> 12;
                int var9 = class143.field1906[var7] * var8 >> 12;
                int var10 = class169.field2189[var7] * var8 >> 12;
                int var11 = class102.field1388 & (var9 >> 12) + var6;
                int var12 = arg1 - -(var10 >> 12) & class115.field1508;
                int[] var13 = this.method1459(var12, -100, 0);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(IIIBIIII)V", line = 148)
    public static final void method951(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field2087;
        int var8 = arg5 + -334;
        if (~var8 > -1) {
            var8 = 0;
        } else if (~var8 < -101) {
            var8 = 100;
        }
        int var9 = (class511.field7458 - class337.field4461) * var8 / 100 + class337.field4461;
        int var10 = arg7 * var9 >> 8;
        int var11 = -arg0 + 16384 & 16383;
        int var12 = 16383 & 16384 - arg4;
        if (arg3 != -90) {
            method951(-41, -66, -96, (byte) -125, 104, 87, -49, 54);
        }
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (~var11 != -1) {
            var14 = class456.field6812[var11] * -var10 >> 15;
            var15 = class456.field6811[var11] * var10 >> 15;
        }
        if (~var12 != -1) {
            var13 = class456.field6812[var12] * var15 >> 15;
            var15 = class456.field6811[var12] * var15 >> 15;
        }
        class65.field739 = arg0;
        class9.field110 = arg4;
        class267.field3572 = -var14 + arg2;
        class230.field3104 = 0;
        class139.field1857 = -var15 + arg6;
        class238.field3171 = -var13 + arg1;
    }

    @OriginalMember(owner = "client!dt", name = "c", descriptor = "(II)V", line = 204)
    public static final void method952(int arg0, int arg1) {
        class508.field7367 = -1;
        class49.field556 = arg0;
        class178.field2308 = -1;
        ++field2094;
        if (arg1 != 27341) {
            method950(60);
        }
        class104.method631((byte) 31);
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(Lug;II)V", line = 221)
    public final void method61(class396 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 == -2) {
                super.field3066 = ~arg0.method2388((byte) -117) == -2;
            }
        } else {
            this.field2092 = arg0.method2386(arg1 + -487238764) << 4;
        }
        if (arg1 != 487215116) {
            method950(40);
        }
        ++field2095;
    }

    @OriginalMember(owner = "client!dt", name = "e", descriptor = "(I)V", line = 258)
    public final void method877(int arg0) {
        if (arg0 != 1) {
            this.field2092 = 22;
        }
        class32.method182(arg0 ^ 126);
        ++field2099;
    }
}
