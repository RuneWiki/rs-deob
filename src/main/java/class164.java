import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class164 extends class107 {

    @OriginalMember(owner = "client!jg", name = "U", descriptor = "I")
    private int field2916 = 32768;

    @OriginalMember(owner = "client!jg", name = "T", descriptor = "Lge;")
    public static class69 field2915 = new class69(8);

    @OriginalMember(owner = "client!jg", name = "W", descriptor = "Lfe;")
    public static class243 field2918 = new class243(0, 0);

    @OriginalMember(owner = "client!jg", name = "cb", descriptor = "Lpj;")
    private static class237 field2924 = class33.method353("Loaded title screen", 30);

    @OriginalMember(owner = "client!jg", name = "ab", descriptor = "Lpj;")
    public static class237 field2922 = class33.method353("loginscreen", 44);

    @OriginalMember(owner = "client!jg", name = "fb", descriptor = "Lpj;")
    public static class237 field2927 = field2924;

    @OriginalMember(owner = "client!jg", name = "P", descriptor = "I")
    public static int field2911;

    @OriginalMember(owner = "client!jg", name = "Q", descriptor = "I")
    public static int field2912;

    @OriginalMember(owner = "client!jg", name = "R", descriptor = "I")
    public static int field2913;

    @OriginalMember(owner = "client!jg", name = "S", descriptor = "I")
    public static int field2914;

    @OriginalMember(owner = "client!jg", name = "V", descriptor = "I")
    public static int field2917;

    @OriginalMember(owner = "client!jg", name = "X", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!jg", name = "Y", descriptor = "I")
    public static int field2920;

    @OriginalMember(owner = "client!jg", name = "Z", descriptor = "I")
    public static int field2921;

    @OriginalMember(owner = "client!jg", name = "db", descriptor = "[Lcj;")
    public static class115[] field2925;

    @OriginalMember(owner = "client!jg", name = "eb", descriptor = "[Lf;")
    public static class36[] field2926;

    @OriginalMember(owner = "client!jg", name = "bb", descriptor = "[S")
    public static short[] field2923;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(BI)[[I")
    public final int[][] method240(byte arg0, int arg1) {
        ++field2911;
        int[][] var3 = super.field1903.method634(arg1, 13012);
        int var4 = 88 % ((26 - arg0) / 45);
        if (super.field1903.field1551) {
            int[] var5 = this.method797(1, arg1, (byte) -116);
            int[] var6 = this.method797(2, arg1, (byte) 125);
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var3[0];
            for (int var10 = 0; var10 < class106.field1862; ++var10) {
                int var11 = (var5[var10] * 255 & 1044766) >> 12;
                int var12 = var6[var10] * this.field2916 >> 12;
                int var13 = class34.field730[var11] * var12 >> 12;
                int var14 = class110.field1937 & var10 - -(var13 >> 12);
                int var15 = class105.field1845[var11] * var12 >> 12;
                int var16 = class254.field4363 & (var15 >> 12) + arg1;
                int[][] var17 = this.method802(3, var16, 0);
                var9[var10] = var17[0][var14];
                var7[var10] = var17[1][var14];
                var8[var10] = var17[2][var14];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(BI)[I")
    public final int[] method123(byte arg0, int arg1) {
        if (arg0 != -17) {
            field2924 = null;
        }
        ++field2919;
        int[] var3 = super.field1921.method1388(arg1, (byte) -26);
        if (super.field1921.field3539) {
            int[] var4 = this.method797(1, arg1, (byte) -101);
            int[] var5 = this.method797(2, arg1, (byte) 125);
            for (int var6 = 0; class106.field1862 > var6; ++var6) {
                int var7 = var5[var6] * this.field2916 >> 12;
                int var8 = (var4[var6] & 4089) >> 4;
                int var9 = class34.field730[var8] * var7 >> 12;
                int var10 = class105.field1845[var8] * var7 >> 12;
                int var11 = var6 - -(var9 >> 12) & class110.field1937;
                int var12 = class254.field4363 & arg1 - -(var10 >> 12);
                int[] var13 = this.method797(0, var12, (byte) -99);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lie;II)V")
    public final void method122(class32 arg0, int arg1, int arg2) {
        ++field2920;
        if (arg2 != -32513) {
            field2918 = null;
        }
        if (~arg1 != -1) {
            if (~arg1 == -2) {
                super.field1897 = arg0.method316((byte) -30) == 1;
            }
        } else {
            this.field2916 = arg0.method339(-16777216) << 4;
        }
    }

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "(I)V")
    public static void method1149(int arg0) {
        field2927 = null;
        field2918 = null;
        field2926 = null;
        field2915 = null;
        field2923 = null;
        field2925 = null;
        field2924 = null;
        if (arg0 == 1) {
            field2922 = null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "(B)V")
    public static final void method1150(byte arg0) {
        if (arg0 != 111) {
            field2924 = null;
        }
        class41.field926.method934((byte) 62);
        ++field2914;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIII)V")
    public static final void method1151(int arg0, int arg1, int arg2, int arg3) {
        ++field2912;
        int var4 = -52 / ((54 - arg1) / 59);
        class141 var5 = class61.method519(arg2, 0, arg3);
        if (var5 != null && var5.field2568 != null) {
            class117 var6 = new class117();
            var6.field2053 = var5.field2568;
            var6.field2046 = var5;
            class229.method1519(-112, var6);
        }
        class144.field2606 = arg3;
        class187.field3272 = arg2;
        class149.field2644 = arg0;
        class15.field244 = true;
        class128.method911(var5, -17149);
    }

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "(I)V")
    public final void method124(int arg0) {
        if (arg0 != 31) {
            this.field2916 = 106;
        }
        ++field2913;
        class212.method1423(-19836);
    }

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "(I)V")
    public static final void method1152(int arg0) {
        class139.method960();
        ++field2917;
        for (int var1 = arg0; ~var1 > -5; ++var1) {
            class146.field2613[var1].method232(~arg0);
        }
        System.gc();
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "()V")
    public class164() {
        super(3, false);
    }
}
