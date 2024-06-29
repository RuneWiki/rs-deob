import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class204 extends class272 {

    @OriginalMember(owner = "client!qg", name = "M", descriptor = "Lli;")
    public static class185 field3728 = class245.method1649("leuchten3:", 126);

    @OriginalMember(owner = "client!qg", name = "Q", descriptor = "Lli;")
    public static class185 field3732 = class245.method1649("null", -71);

    @OriginalMember(owner = "client!qg", name = "L", descriptor = "Lli;")
    public static class185 field3727 = class245.method1649(" autres options", 123);

    @OriginalMember(owner = "client!qg", name = "K", descriptor = "Lgf;")
    public static class7 field3726 = new class7(50);

    @OriginalMember(owner = "client!qg", name = "X", descriptor = "Lli;")
    public static class185 field3739 = class245.method1649("Vous ne pouvez pas ajouter votre nom -9 votre liste noire)3", -77);

    @OriginalMember(owner = "client!qg", name = "I", descriptor = "I")
    public static int field3725;

    @OriginalMember(owner = "client!qg", name = "N", descriptor = "I")
    public static int field3729;

    @OriginalMember(owner = "client!qg", name = "O", descriptor = "I")
    public static int field3730;

    @OriginalMember(owner = "client!qg", name = "P", descriptor = "I")
    public static int field3731;

    @OriginalMember(owner = "client!qg", name = "S", descriptor = "I")
    public static int field3734;

    @OriginalMember(owner = "client!qg", name = "T", descriptor = "I")
    public static int field3735;

    @OriginalMember(owner = "client!qg", name = "U", descriptor = "I")
    public static int field3736;

    @OriginalMember(owner = "client!qg", name = "V", descriptor = "I")
    public static int field3737;

    @OriginalMember(owner = "client!qg", name = "W", descriptor = "I")
    public static int field3738;

    @OriginalMember(owner = "client!qg", name = "R", descriptor = "[Lhb;")
    private class28[] field3733;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        if (arg1 != 4421) {
            this.method32(120, (byte) -102);
        }
        ++field3731;
        int[] var3 = super.field4819.method1632(arg1 + -4421, arg0);
        if (super.field4819.field4294) {
            this.method1453(super.field4819.method1627(arg1 + 23836), (byte) 95);
        }
        return var3;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IBILhi;)[Lcg;")
    public static final class34[] method1450(int arg0, byte arg1, int arg2, class250 arg3) {
        if (arg1 != 47) {
            method1450(70, (byte) -4, 122, (class250) null);
        }
        ++field3737;
        return !class224.method1551(arg0, arg2, arg3, (byte) -94) ? null : class173.method1232(true);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Ljd;BI)V")
    public final void method34(class118 arg0, byte arg1, int arg2) {
        ++field3730;
        int var4 = 115 % ((arg1 - -21) / 55);
        if (arg2 == 0) {
            this.field3733 = new class28[arg0.method867(false)];
            for (int var5 = 0; ~var5 > ~this.field3733.length; ++var5) {
                int var6 = arg0.method867(false);
                if (~var6 != -1) {
                    if (~var6 != -2) {
                        if (~var6 != -3) {
                            if (var6 == 3) {
                                this.field3733[var5] = class229.method1582(-5748, arg0);
                            }
                        } else {
                            this.field3733[var5] = class198.method1421((byte) 98, arg0);
                        }
                    } else {
                        this.field3733[var5] = class268.method1818(arg0, -1);
                    }
                } else {
                    this.field3733[var5] = class38.method243(arg0, 1);
                }
            }
        } else if (~arg2 == -2) {
            super.field4832 = ~arg0.method867(false) == -2;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "([BBII)Lli;")
    public static final class185 method1451(byte[] arg0, byte arg1, int arg2, int arg3) {
        ++field3725;
        class185 var4 = new class185();
        var4.field3411 = new byte[arg2];
        var4.field3437 = 0;
        int var5 = 80 / ((-62 - arg1) / 46);
        for (int var6 = arg3; ~var6 > ~(arg2 + arg3); ++var6) {
            if (~arg0[var6] != -1) {
                var4.field3411[var4.field3437++] = arg0[var6];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "(I)V")
    public static void method1452(int arg0) {
        field3727 = null;
        int var1 = 125 % ((47 - arg0) / 39);
        field3728 = null;
        field3726 = null;
        field3739 = null;
        field3732 = null;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "([[IB)V")
    private final void method1453(int[][] arg0, byte arg1) {
        int var3 = class13.field235;
        int var4 = -44 % ((arg1 - -20) / 55);
        int var5 = class246.field4385;
        ++field3734;
        class199.method1430(arg0, -1);
        class94.method608(class59.field1037, 0, (byte) 43, 0, class99.field1826);
        if (this.field3733 != null) {
            for (int var6 = 0; this.field3733.length > var6; ++var6) {
                class28 var7 = this.field3733[var6];
                int var8 = var7.field464;
                int var9 = var7.field466;
                if (~var8 <= -1) {
                    if (~var9 > -1) {
                        var7.method175(30792, var3, var5);
                    } else {
                        var7.method182(var3, 118, var5);
                    }
                } else if (var9 >= 0) {
                    var7.method176(122, var5, var3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "()V")
    public class204() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "(IB)[[I")
    public final int[][] method32(int arg0, byte arg1) {
        ++field3736;
        int[][] var3 = super.field4818.method1514(-2, arg0);
        int var4 = 118 % ((arg1 - -60) / 45);
        if (super.field4818.field3954) {
            int var5 = class246.field4385;
            int var6 = class13.field235;
            int[][] var7 = new int[var6][var5];
            int[][][] var8 = super.field4818.method1510((byte) 96);
            this.method1453(var7, (byte) 50);
            for (int var9 = 0; ~var9 > ~class13.field235; ++var9) {
                int[][] var10 = var8[var9];
                int[] var11 = var7[var9];
                int[] var12 = var10[1];
                int[] var13 = var10[0];
                int[] var14 = var10[2];
                for (int var15 = 0; var15 < class246.field4385; ++var15) {
                    int var16 = var11[var15];
                    var14[var15] = class220.method1526(255, var16) << 4;
                    var12[var15] = class220.method1526(4080, var16 >> 4);
                    var13[var15] = class220.method1526(4080, var16 >> 12);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "(I)V")
    public static final void method1454(int arg0) {
        ++field3735;
        class148.field2785.method80(-14113);
        if (arg0 != 0) {
            method1451((byte[]) null, (byte) -59, 87, -12);
        }
        class30.field495.method80(-14113);
    }
}
