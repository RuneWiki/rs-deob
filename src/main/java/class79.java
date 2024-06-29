import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class79 extends class175 {

    @OriginalMember(owner = "client!jd", name = "Z", descriptor = "I")
    private int field1347 = 32768;

    @OriginalMember(owner = "client!jd", name = "U", descriptor = "Lmb;")
    public static class96 field1342 = class243.method1708(")2", (byte) 91);

    @OriginalMember(owner = "client!jd", name = "Y", descriptor = "[S")
    public static short[] field1346 = new short[500];

    @OriginalMember(owner = "client!jd", name = "P", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!jd", name = "Q", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!jd", name = "R", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!jd", name = "S", descriptor = "I")
    public static int field1340;

    @OriginalMember(owner = "client!jd", name = "T", descriptor = "I")
    public static int field1341;

    @OriginalMember(owner = "client!jd", name = "V", descriptor = "I")
    public static int field1343;

    @OriginalMember(owner = "client!jd", name = "W", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!jd", name = "X", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BI)[I")
    public final int[] method1(byte arg0, int arg1) {
        int var3 = 115 / ((arg0 - 62) / 54);
        ++field1345;
        int[] var4 = super.field3044.method904((byte) -116, arg1);
        if (super.field3044.field2150) {
            int[] var5 = this.method1255(1, arg1, 128);
            int[] var6 = this.method1255(2, arg1, 128);
            for (int var7 = 0; ~var7 > ~class1.field11; ++var7) {
                int var8 = 255 & var5[var7] >> 4;
                int var9 = var6[var7] * this.field1347 >> 12;
                int var10 = class153.field2681[var8] * var9 >> 12;
                int var11 = class103.field1741[var8] * var9 >> 12;
                int var12 = class194.field3343 & (var11 >> 12) + var7;
                int var13 = class92.field1520 & (var10 >> 12) + arg1;
                int[] var14 = this.method1255(0, var13, 128);
                var4[var7] = var14[var12];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)[[I")
    public final int[][] method77(int arg0, int arg1) {
        int[][] var3 = super.field3035.method637(arg0, false);
        if (super.field3035.field1493) {
            int[] var4 = this.method1255(1, arg0, arg1 + 64);
            int[] var5 = this.method1255(2, arg0, 128);
            int[] var6 = var3[0];
            int[] var7 = var3[2];
            int[] var8 = var3[1];
            for (int var9 = 0; ~class1.field11 < ~var9; ++var9) {
                int var10 = (var4[var9] * 255 & 1044729) >> 12;
                int var11 = var5[var9] * this.field1347 >> 12;
                int var12 = class153.field2681[var10] * var11 >> 12;
                int var13 = (var12 >> 12) + arg0 & class92.field1520;
                int var14 = class103.field1741[var10] * var11 >> 12;
                int var15 = var9 - -(var14 >> 12) & class194.field3343;
                int[][] var16 = this.method1253(var13, -2880, 0);
                var6[var9] = var16[0][var15];
                var8[var9] = var16[1][var15];
                var7[var9] = var16[2][var15];
            }
        }
        ++field1344;
        return arg1 != 64 ? null : var3;
    }

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "(I)V")
    public static void method560(int arg0) {
        field1346 = null;
        if (arg0 != -18445) {
            field1338 = -112;
        }
        field1342 = null;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BILrg;)V")
    public final void method115(byte arg0, int arg1, class239 arg2) {
        ++field1337;
        int var4 = 59 / ((-22 - arg0) / 58);
        if (~arg1 != -1) {
            if (~arg1 == -2) {
                super.field3034 = arg2.method1651(4139) == 1;
            }
        } else {
            this.field1347 = arg2.method1663((byte) -61) << 4;
        }
    }

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "(B)V")
    public static final void method561(byte arg0) {
        ++field1339;
        int var1 = 0;
        if (arg0 >= -23) {
            field1338 = 87;
        }
        while (var1 < class132.field2375) {
            int var2 = class222.field3797[var1];
            class197 var3 = class86.field1450[var2];
            if (var3 != null) {
                class237.method1610(var3.field3436.field3914, -129, var3);
            }
            ++var1;
        }
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "()V")
    public class79() {
        super(3, false);
    }

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "(I)V")
    public static final void method562(int arg0) {
        ++field1341;
        class241.field4183.method83(0);
        if (arg0 > 120) {
            class77.field1315.method83(0);
        }
    }

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "(I)V")
    public final void method150(int arg0) {
        class29.method189(4096);
        ++field1343;
        if (arg0 != 2) {
            this.field1347 = -124;
        }
    }
}
