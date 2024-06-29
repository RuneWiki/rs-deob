import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class116 extends class64 {

    @OriginalMember(owner = "client!n", name = "P", descriptor = "I")
    private int field2412 = 32768;

    @OriginalMember(owner = "client!n", name = "V", descriptor = "Z")
    public static boolean field2418 = false;

    @OriginalMember(owner = "client!n", name = "T", descriptor = "Lcd;")
    public static class23 field2416 = class54.method414("Untersuchen", -1);

    @OriginalMember(owner = "client!n", name = "R", descriptor = "I")
    public static int field2414;

    @OriginalMember(owner = "client!n", name = "S", descriptor = "I")
    public static int field2415;

    @OriginalMember(owner = "client!n", name = "U", descriptor = "I")
    public static int field2417;

    @OriginalMember(owner = "client!n", name = "X", descriptor = "I")
    public static int field2420;

    @OriginalMember(owner = "client!n", name = "Y", descriptor = "I")
    public static int field2421;

    @OriginalMember(owner = "client!n", name = "W", descriptor = "Loe;")
    public static class130 field2419;

    @OriginalMember(owner = "client!n", name = "Q", descriptor = "Lkh;")
    public static class97 field2413;

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "()V")
    public class116() {
        super(3, false);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(BILva;)V")
    public final void method37(byte arg0, int arg1, class189 arg2) {
        ++field2417;
        if (~arg1 != -1) {
            if (arg1 == 1) {
                super.field1510 = ~arg2.method1202(-76) == -2;
            }
        } else {
            this.field2412 = arg2.method1197(-1) << 4;
        }
        int var5 = 101 / ((7 - arg0) / 43);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        if (arg1 != -9421) {
            field2419 = null;
        }
        int[] var3 = super.field1513.method1033(-67, arg0);
        ++field2414;
        if (super.field1513.field3368) {
            int[] var4 = this.method479(-1, arg0, 1);
            int[] var5 = this.method479(-1, arg0, 2);
            for (int var6 = 0; ~var6 > ~class168.field3367; ++var6) {
                int var7 = (1046091 & var4[var6] * 255) >> 12;
                int var8 = var5[var6] * this.field2412 >> 12;
                int var9 = class48.field1151[var7] * var8 >> 12;
                int var10 = class21.field429[var7] * var8 >> 12;
                int var11 = class81.field1760 & arg0 - -(var10 >> 12);
                int var12 = (var9 >> 12) + var6 & class163.field3266;
                int[] var13 = this.method479(-1, var11, 0);
                var3[var6] = var13[var12];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ILhe;Z)V")
    public static final void method735(int arg0, class68 arg1, boolean arg2) {
        ++field2420;
        if (class61.field1418 != null) {
            try {
                class61.field1418.method501(false);
            } catch (Exception var8) {
            }
            class61.field1418 = null;
        }
        class61.field1418 = arg1;
        class115.method733((byte) 73, arg2);
        class28.field595.field3752 = arg0;
        class10.field202 = null;
        class180.field3568 = 0;
        class157.field3131 = null;
        while (true) {
            class111 var3 = (class111) class23.field499.method264(36);
            if (var3 == null) {
                while (true) {
                    class111 var4 = (class111) class60.field1393.method264(60);
                    if (var4 == null) {
                        if (~class138.field2849 != -1) {
                            try {
                                class189 var5 = new class189(4);
                                var5.method1180(4, (byte) 81);
                                var5.method1180(class138.field2849, (byte) 60);
                                var5.method1220((byte) 57, 0);
                                class61.field1418.method495(4, var5.field3753, (byte) 127, 0);
                            } catch (IOException var7) {
                                try {
                                    class61.field1418.method501(false);
                                } catch (Exception var6) {
                                }
                                ++class39.field846;
                                class61.field1418 = null;
                            }
                        }
                        class44.field922 = 0;
                        class57.field1324 = class30.method224((byte) 95);
                        return;
                    }
                    class23.field514.method432(var4, -7053);
                    class175.field3492.method262(var4.field3317, -125, var4);
                    ++class31.field677;
                    --class10.field196;
                }
            }
            class204.field4014.method262(var3.field3317, -90, var3);
            --class84.field1789;
            ++class145.field2973;
        }
    }

    @OriginalMember(owner = "client!n", name = "f", descriptor = "(I)V")
    public static void method736(int arg0) {
        field2413 = null;
        field2419 = null;
        if (arg0 < 31) {
            field2413 = null;
        }
        field2416 = null;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method36(int arg0, boolean arg1) {
        int[][] var3 = super.field1508.method846(7287, arg0);
        if (!arg1) {
            this.method35(-105, -35);
        }
        ++field2421;
        if (super.field1508.field2757) {
            int[] var4 = this.method479(-1, arg0, 1);
            int[] var5 = this.method479(-1, arg0, 2);
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            int[] var8 = var3[0];
            for (int var9 = 0; ~var9 > ~class168.field3367; ++var9) {
                int var10 = 255 & var4[var9] * 255 >> 12;
                int var11 = var5[var9] * this.field2412 >> 12;
                int var12 = class48.field1151[var10] * var11 >> 12;
                int var13 = class21.field429[var10] * var11 >> 12;
                int var14 = (var13 >> 12) + arg0 & class81.field1760;
                int var15 = class163.field3266 & (var12 >> 12) + var9;
                int[][] var16 = this.method482(0, var14, (byte) -125);
                var8[var9] = var16[0][var15];
                var6[var9] = var16[1][var15];
                var7[var9] = var16[2][var15];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(B)V")
    public final void method44(byte arg0) {
        if (arg0 == -22) {
            ++field2415;
            class111.method715(arg0 ^ -4118);
        }
    }
}
