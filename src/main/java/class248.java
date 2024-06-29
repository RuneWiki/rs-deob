import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class248 extends class272 {

    @OriginalMember(owner = "client!mk", name = "N", descriptor = "I")
    public static int field4405 = -1;

    @OriginalMember(owner = "client!mk", name = "M", descriptor = "Lli;")
    private static class185 field4404 = class245.method1649("Drop", 126);

    @OriginalMember(owner = "client!mk", name = "J", descriptor = "Lli;")
    public static class185 field4401 = field4404;

    @OriginalMember(owner = "client!mk", name = "I", descriptor = "I")
    public static int field4400;

    @OriginalMember(owner = "client!mk", name = "K", descriptor = "I")
    public static int field4402;

    @OriginalMember(owner = "client!mk", name = "L", descriptor = "I")
    public static int field4403;

    @OriginalMember(owner = "client!mk", name = "O", descriptor = "I")
    public static int field4406;

    @OriginalMember(owner = "client!mk", name = "P", descriptor = "I")
    public static int field4407;

    @OriginalMember(owner = "client!mk", name = "Q", descriptor = "I")
    public static int field4408;

    @OriginalMember(owner = "client!mk", name = "R", descriptor = "I")
    public static int field4409;

    @OriginalMember(owner = "client!mk", name = "S", descriptor = "I")
    public static int field4410;

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "(Z)V")
    public static void method1665(boolean arg0) {
        field4404 = null;
        if (!arg0) {
            method1668(31, -110, 118);
        }
        field4401 = null;
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "()V")
    public class248() {
        super(1, false);
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(B)V")
    public static final void method1666(byte arg0) {
        ++field4402;
        int var1 = class241.field4310.field2694 - -class108.field1936;
        int var2 = 100 % ((arg0 - 39) / 57);
        int var3 = class78.field1365 + class241.field4310.field2687;
        if (-var1 + class46.field732 < -500 || -var1 + class46.field732 > 500 || -var3 + class215.field3942 < -500 || ~(-var3 + class215.field3942) < -501) {
            class215.field3942 = var3;
            class46.field732 = var1;
        }
        if (~class215.field3942 != ~var3) {
            class215.field3942 += (var3 - class215.field3942) / 16;
        }
        if (~class46.field732 != ~var1) {
            class46.field732 += (-class46.field732 + var1) / 16;
        }
        if (!class240.field4296) {
            if (class139.field2615[98]) {
                class121.field2202 += (12 - class121.field2202) / 2;
            } else if (class139.field2615[99]) {
                class121.field2202 += (-class121.field2202 + -12) / 2;
            } else {
                class121.field2202 /= 2;
            }
            class43.field681 += class121.field2202 / 2;
            if (!class139.field2615[96]) {
                if (class139.field2615[97]) {
                    class147.field2779 += (-class147.field2779 + 24) / 2;
                } else {
                    class147.field2779 /= 2;
                }
            } else {
                class147.field2779 += (-24 - class147.field2779) / 2;
            }
            class92.field1765 += class147.field2779 / 2;
        } else {
            for (int var4 = 0; class173.field3176 > var4; ++var4) {
                int var5 = class135.field2535[var4];
                if (var5 == 98) {
                    class43.field681 = -16 & class43.field681 - -47;
                } else if (~var5 == -100) {
                    class43.field681 = class43.field681 + -17 & -16;
                } else if (~var5 == -97) {
                    class92.field1765 = class92.field1765 + -65 & -128;
                } else if (var5 == 97) {
                    class92.field1765 = -128 & class92.field1765 + 191;
                }
            }
        }
        class64.method433((byte) 45);
    }

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "(III)Z")
    public static final boolean method1667(int arg0, int arg1, int arg2) {
        int var3 = class13.field230[arg0][arg1][arg2];
        if (-class232.field4172 == var3) {
            return false;
        } else if (class232.field4172 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class188.method1357(var4 + 1, class201.field3694[arg0][arg1][arg2], var5 + 1) && class188.method1357(var4 + 128 - 1, class201.field3694[arg0][arg1 + 1][arg2], var5 + 1) && class188.method1357(var4 + 128 - 1, class201.field3694[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class188.method1357(var4 + 1, class201.field3694[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class13.field230[arg0][arg1][arg2] = class232.field4172;
                return true;
            } else {
                class13.field230[arg0][arg1][arg2] = -class232.field4172;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "(IB)[[I")
    public final int[][] method32(int arg0, byte arg1) {
        ++field4410;
        int[][] var3 = super.field4818.method1514(-2, arg0);
        if (super.field4818.field3954) {
            int[][] var4 = this.method1860(arg0, 3, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[0];
            int[] var8 = var4[2];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; ~class246.field4385 < ~var11; ++var11) {
                var7[var11] = -var5[var11] + 4096;
                var10[var11] = -var6[var11] + 4096;
                var9[var11] = -var8[var11] + 4096;
            }
        }
        int var12 = 85 % ((arg1 - -60) / 45);
        return var3;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Ljd;BI)V")
    public final void method34(class118 arg0, byte arg1, int arg2) {
        int var4 = 107 / ((arg1 - -21) / 55);
        ++field4407;
        if (~arg2 == -1) {
            super.field4832 = arg0.method867(false) == 1;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        ++field4406;
        int[] var3 = super.field4819.method1632(arg1 + -4421, arg0);
        if (super.field4819.field4294) {
            int[] var4 = this.method1866(arg0, 0, 118);
            for (int var5 = 0; ~var5 > ~class246.field4385; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        if (arg1 != 4421) {
            method1667(100, -10, 24);
        }
        return var3;
    }

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "(III)Lwd;")
    public static final class65 method1668(int arg0, int arg1, int arg2) {
        ++field4403;
        class65 var3 = new class65();
        class85 var4 = (class85) class235.field4213.method1375(arg1 + 16252);
        if (arg1 != 7) {
            field4404 = null;
        }
        while (var4 != null) {
            if (var4.field1685 && var4.method556(arg0, arg2, false)) {
                var3.method436((byte) -86, var4);
            }
            var4 = (class85) class235.field4213.method1377(arg1 + -19553);
        }
        return var3;
    }
}
