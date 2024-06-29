import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class136 extends class99 {

    @OriginalMember(owner = "client!ji", name = "S", descriptor = "I")
    private int field2511 = 4096;

    @OriginalMember(owner = "client!ji", name = "R", descriptor = "I")
    private int field2510 = 4096;

    @OriginalMember(owner = "client!ji", name = "W", descriptor = "[I")
    private int[] field2515 = new int[3];

    @OriginalMember(owner = "client!ji", name = "V", descriptor = "I")
    private int field2514 = 409;

    @OriginalMember(owner = "client!ji", name = "cb", descriptor = "I")
    private int field2521 = 4096;

    @OriginalMember(owner = "client!ji", name = "Q", descriptor = "Z")
    public static boolean field2509 = false;

    @OriginalMember(owner = "client!ji", name = "Z", descriptor = "Lr;")
    public static class66 field2518 = class93.method641(43, "RuneScape wird geladen )2 bitte warten)3)3)3");

    @OriginalMember(owner = "client!ji", name = "T", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!ji", name = "U", descriptor = "I")
    public static int field2513;

    @OriginalMember(owner = "client!ji", name = "X", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!ji", name = "ab", descriptor = "I")
    public static int field2519;

    @OriginalMember(owner = "client!ji", name = "bb", descriptor = "I")
    public static int field2520;

    @OriginalMember(owner = "client!ji", name = "db", descriptor = "I")
    public static int field2522;

    @OriginalMember(owner = "client!ji", name = "eb", descriptor = "I")
    public static int field2523;

    @OriginalMember(owner = "client!ji", name = "Y", descriptor = "[I")
    public static int[] field2517;

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "()V")
    public class136() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIII)I")
    public static final int method934(int arg0, int arg1, int arg2, int arg3) {
        ++field2512;
        int var4 = arg0 & 3;
        if (var4 == 0) {
            return arg2;
        } else if (~var4 == -2) {
            return arg1;
        } else {
            if (arg3 != -27039) {
                method939(-105, (class66) null);
            }
            return var4 == 2 ? 7 - arg2 : -arg1 + 7;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IILha;)Lr;")
    public static final class66 method935(int arg0, int arg1, class63 arg2) {
        ++field2519;
        if (!class182.method1214(arg1, client.method592(arg2), arg0 + -28702) && arg2.field1179 == null) {
            return null;
        } else if (arg2.field1146 != null && ~arg1 > ~arg2.field1146.length && arg2.field1146[arg1] != null && ~arg2.field1146[arg1].method455(true).method460((byte) -107) != -1) {
            if (arg0 != -3574) {
                method939(-79, (class66) null);
            }
            return arg2.field1146[arg1];
        } else {
            return class102.field1999 ? class212.method1372(2, new class66[] { class230.field3982, class144.method989(arg1, 0) }) : null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "(I)V")
    public static void method936(int arg0) {
        field2518 = null;
        if (arg0 == 0) {
            field2517 = null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method37(int arg0, boolean arg1) {
        if (!arg1) {
            method935(-121, 56, (class63) null);
        }
        ++field2520;
        int[][] var3 = super.field1946.method823(arg0, (byte) -102);
        if (super.field1946.field2297) {
            int[][] var4 = this.method683(-71, 0, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class199.field3432; ++var11) {
                int var12 = var5[var11];
                int var13 = -this.field2515[0] + var12;
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (~this.field2514 > ~var13) {
                    var8[var11] = var12;
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = -this.field2515[1] + var14;
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (~this.field2514 > ~var15) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = var16 - this.field2515[2];
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (var17 > this.field2514) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field2510 * var12 >> 12;
                            var9[var11] = this.field2521 * var14 >> 12;
                            var10[var11] = this.field2511 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ILcj;)I")
    public static final int method937(int arg0, class28 arg1) {
        int var2 = 0;
        if (arg1.method157(class102.field1994, 0)) {
            ++var2;
        }
        if (arg1.method157(class254.field4448, 0)) {
            ++var2;
        }
        if (arg1.method157(class222.field3792, 0)) {
            ++var2;
        }
        ++field2516;
        if (arg1.method157(class112.field2150, 0)) {
            ++var2;
        }
        if (arg1.method157(class8.field73, 0)) {
            ++var2;
        }
        if (arg1.method157(class215.field3690, arg0)) {
            ++var2;
        }
        if (arg1.method157(class52.field912, arg0)) {
            ++var2;
        }
        if (arg1.method157(class132.field2466, arg0)) {
            ++var2;
        }
        if (arg1.method157(class40.field638, 0)) {
            ++var2;
        }
        if (arg1.method157(class233.field4075, 0)) {
            ++var2;
        }
        if (arg1.method157(class69.field1377, 0)) {
            ++var2;
        }
        if (arg1.method157(class94.field1812, arg0 + arg0)) {
            ++var2;
        }
        if (arg1.method157(class109.field2120, 0)) {
            ++var2;
        }
        ++var2;
        if (arg1.method157(class11.field134, 0)) {
            ++var2;
        }
        if (arg1.method157(class11.field128, arg0)) {
            ++var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Llh;II)V")
    public final void method11(class249 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (arg1 == 4) {
                            int var5 = arg0.method1648((byte) 68);
                            this.field2515[0] = class115.method767(16711680, var5) << 4;
                            this.field2515[1] = class115.method767(4080, var5 >> 4);
                            this.field2515[2] = class115.method767(var5, 255) >> 12;
                        }
                    } else {
                        this.field2510 = arg0.method1674(1355769544);
                    }
                } else {
                    this.field2521 = arg0.method1674(1355769544);
                }
            } else {
                this.field2511 = arg0.method1674(1355769544);
            }
        } else {
            this.field2514 = arg0.method1674(1355769544);
        }
        if (arg2 != -1) {
            method935(22, -40, (class63) null);
        }
        ++field2523;
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(IB)Lrd;")
    public static final class94 method938(int arg0, byte arg1) {
        ++field2522;
        class94 var2 = (class94) class8.field80.method1505((long) arg0, (byte) -76);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class50.field894.method135(0, 0, arg0);
            if (var3 == null) {
                return null;
            } else {
                class94 var4 = new class94();
                if (arg1 < 22) {
                    field2518 = null;
                }
                class249 var5 = new class249(var3);
                var5.field4335 = var5.field4350.length - 2;
                int var6 = var5.method1674(1355769544);
                int var7 = var5.field4350.length + -2 - (var6 - -12);
                var5.field4335 = var7;
                int var8 = var5.method1652(-5528);
                var4.field1813 = var5.method1674(1355769544);
                var4.field1804 = var5.method1674(1355769544);
                var4.field1807 = var5.method1674(1355769544);
                var4.field1805 = var5.method1674(1355769544);
                int var9 = var5.method1677(-6677);
                if (~var9 < -1) {
                    var4.field1814 = new class215[var9];
                    for (int var10 = 0; ~var9 < ~var10; ++var10) {
                        int var11 = var5.method1674(1355769544);
                        class215 var12 = new class215(class62.method413(var11, -21189));
                        var4.field1814[var10] = var12;
                        while (~(var11--) < -1) {
                            int var13 = var5.method1652(-5528);
                            int var14 = var5.method1652(-5528);
                            var12.method1380((byte) -89, new class49(var14), (long) var13);
                        }
                    }
                }
                int var15 = 0;
                var5.field4335 = 0;
                var4.field1803 = var5.method1675(23733);
                var4.field1808 = new int[var8];
                var4.field1811 = new int[var8];
                var4.field1809 = new class66[var8];
                while (~var5.field4335 > ~var7) {
                    int var16 = var5.method1674(1355769544);
                    if (~var16 != -4) {
                        if (~var16 > -101 && var16 != 21 && ~var16 != -39 && var16 != 39) {
                            var4.field1808[var15] = var5.method1652(-5528);
                        } else {
                            var4.field1808[var15] = var5.method1677(-6677);
                        }
                    } else {
                        var4.field1809[var15] = var5.method1637(127);
                    }
                    var4.field1811[var15++] = var16;
                }
                class8.field80.method1497((long) arg0, (byte) -107, var4);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ILr;)Z")
    public static final boolean method939(int arg0, class66 arg1) {
        ++field2513;
        if (arg1 == null) {
            return false;
        } else {
            if (arg0 > -68) {
                field2517 = null;
            }
            for (int var2 = 0; class173.field3058 > var2; ++var2) {
                if (arg1.method470(false, class233.field4077[var2])) {
                    return true;
                }
            }
            return arg1.method470(false, class207.field3595.field815);
        }
    }
}
