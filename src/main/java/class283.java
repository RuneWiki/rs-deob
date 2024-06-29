import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class283 extends class68 {

    @OriginalMember(owner = "client!dk", name = "R", descriptor = "I")
    private int field4377 = 1365;

    @OriginalMember(owner = "client!dk", name = "X", descriptor = "I")
    private int field4383 = 0;

    @OriginalMember(owner = "client!dk", name = "W", descriptor = "I")
    private int field4382 = 0;

    @OriginalMember(owner = "client!dk", name = "V", descriptor = "I")
    private int field4381 = 20;

    @OriginalMember(owner = "client!dk", name = "U", descriptor = "[I")
    public static int[] field4380 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

    @OriginalMember(owner = "client!dk", name = "N", descriptor = "I")
    public static int field4373;

    @OriginalMember(owner = "client!dk", name = "O", descriptor = "I")
    public static int field4374;

    @OriginalMember(owner = "client!dk", name = "P", descriptor = "I")
    public static int field4375;

    @OriginalMember(owner = "client!dk", name = "Q", descriptor = "I")
    public static int field4376;

    @OriginalMember(owner = "client!dk", name = "S", descriptor = "I")
    public static int field4378;

    @OriginalMember(owner = "client!dk", name = "T", descriptor = "I")
    public static int field4379;

    @OriginalMember(owner = "client!dk", name = "Z", descriptor = "I")
    public static int field4385;

    @OriginalMember(owner = "client!dk", name = "ab", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!dk", name = "Y", descriptor = "[I")
    public static int[] field4384;

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(II)I")
    public static int method1897(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(II)[I")
    public final int[] method32(int arg0, int arg1) {
        if (arg1 > -118) {
            method1900((String) null, (String) null, 77, false);
        }
        ++field4374;
        int[] var3 = super.field917.method1920(arg0, true);
        if (super.field917.field4474) {
            for (int var4 = 0; ~var4 > ~class89.field1248; ++var4) {
                int var5 = (class215.field3231[var4] << 12) / this.field4377 - -this.field4383;
                int var6 = (class127.field1794[arg0] << 12) / this.field4377 - -this.field4382;
                int var7 = var6;
                int var8 = var5;
                int var9 = var5;
                int var10 = var5 * var5 >> 12;
                int var11 = 0;
                int var12 = var6;
                for (int var13 = var6 * var6 >> 12; ~(var10 + var13) > -16385 && ~var11 > ~this.field4381; var13 = var12 * var12 >> 12) {
                    var12 = (var9 * var12 >> 12) * 2 + var7;
                    ++var11;
                    var9 = var10 - -var8 + -var13;
                    var10 = var9 * var9 >> 12;
                }
                var3[var4] = var11 >= this.field4381 + -1 ? 0 : (var11 << 12) / this.field4381;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "(III)I")
    public static final int method1898(int arg0, int arg1, int arg2) {
        ++field4379;
        int var3 = -128 + class63.method385(4, arg0 + 91923, (byte) 46, arg1 - -45365) + (class63.method385(2, arg0 + 37821, (byte) 46, arg1 - -10294) + -128 >> 1) - -(-128 + class63.method385(1, arg0, (byte) 46, arg1) >> 2);
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (arg2 != 30509) {
            field4380 = null;
        }
        if (var4 >= 10) {
            if (var4 > 60) {
                var4 = 60;
            }
        } else {
            var4 = 10;
        }
        return var4;
    }

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "(I)V")
    public static void method1899(int arg0) {
        field4380 = null;
        field4384 = null;
        if (arg0 != 16974) {
            method1902((byte) -48, (class235) null);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IZ)V")
    public static final void method1900(String arg0, String arg1, int arg2, boolean arg3) {
        class88.method562((String) null, arg0, arg2, -1, arg3, arg1);
        ++field4373;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ZLjava/lang/String;B)V")
    public static final void method1901(boolean arg0, String arg1, byte arg2) {
        ++field4385;
        String var3 = arg1.toLowerCase();
        int var4 = 0;
        short[] var5 = new short[16];
        int var6 = 82 / ((arg2 - -46) / 58);
        for (int var7 = 0; ~class127.field1805 < ~var7; ++var7) {
            class32 var10 = class73.method463(var7, -31104);
            if ((!arg0 || var10.field431) && ~var10.field494 == 0 && var10.field430 == -1 && ~var10.field467 == -1 && ~var10.field437.toLowerCase().indexOf(var3) != 0) {
                if (~var4 <= -251) {
                    class154.field2151 = -1;
                    class159.field2214 = null;
                    return;
                }
                if (var4 >= var5.length) {
                    short[] var11 = new short[var5.length * 2];
                    for (int var12 = 0; ~var4 < ~var12; ++var12) {
                        var11[var12] = var5[var12];
                    }
                    var5 = var11;
                }
                var5[var4++] = (short) var7;
            }
        }
        class153.field2125 = 0;
        class159.field2214 = var5;
        class154.field2151 = var4;
        String[] var8 = new String[class154.field2151];
        for (int var9 = 0; var9 < class154.field2151; ++var9) {
            var8[var9] = class73.method463(var5[var9], -31104).field437;
        }
        class17.method100(var8, (byte) 90, class159.field2214);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(BLhc;)V")
    public static final void method1902(byte arg0, class235 arg1) {
        ++field4376;
        class199.field2769 = arg1.method1568("p11_full", -7551);
        class121.field1691 = arg1.method1568("p12_full", -7551);
        class284.field4403 = arg1.method1568("b12_full", -7551);
        if (arg0 >= -16) {
            method1900((String) null, (String) null, -30, true);
        }
        class13.field133 = arg1.method1568("mapfunction", -7551);
        class8.field66 = arg1.method1568("hitmarks", -7551);
        class264.field3963 = arg1.method1568("hitbar_default", -7551);
        class208.field2949 = arg1.method1568("headicons_pk", -7551);
        class86.field1164 = arg1.method1568("headicons_prayer", -7551);
        class137.field1918 = arg1.method1568("hint_headicons", -7551);
        class125.field1750 = arg1.method1568("hint_mapmarkers", -7551);
        class31.field419 = arg1.method1568("mapflag", -7551);
        class289.field4562 = arg1.method1568("cross", -7551);
        class124.field1747 = arg1.method1568("mapdots", -7551);
        class246.field3769 = arg1.method1568("scrollbar", -7551);
        class284.field4456 = arg1.method1568("name_icons", -7551);
        class273.field4223 = arg1.method1568("floorshadows", -7551);
        class172.field2387 = arg1.method1568("compass", -7551);
        class295.field4649 = arg1.method1568("hint_mapedge", -7551);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lql;IZ)V")
    public final void method28(class224 arg0, int arg1, boolean arg2) {
        if (!arg2) {
            method1899(69);
        }
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (arg1 == 3) {
                        this.field4382 = arg0.method1445(false);
                    }
                } else {
                    this.field4383 = arg0.method1445(!arg2);
                }
            } else {
                this.field4381 = arg0.method1445(false);
            }
        } else {
            this.field4377 = arg0.method1445(!arg2);
        }
        ++field4378;
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "()V")
    public class283() {
        super(0, true);
    }
}
