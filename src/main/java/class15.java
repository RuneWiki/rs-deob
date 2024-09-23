import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("EBTORROD")
public class class15 {

    @OriginalMember(owner = "EBTORROD", name = "a", descriptor = "B")
    private byte field803 = -111;

    @OriginalMember(owner = "EBTORROD", name = "b", descriptor = "Z")
    private boolean field804 = true;

    @OriginalMember(owner = "EBTORROD", name = "k", descriptor = "[I")
    private int[] field813 = new int[5];

    @OriginalMember(owner = "EBTORROD", name = "l", descriptor = "[I")
    private int[] field814 = new int[5];

    @OriginalMember(owner = "EBTORROD", name = "m", descriptor = "[I")
    private int[] field815 = new int[5];

    @OriginalMember(owner = "EBTORROD", name = "o", descriptor = "I")
    private int field817 = 100;

    @OriginalMember(owner = "EBTORROD", name = "r", descriptor = "I")
    public int field820 = 500;

    @OriginalMember(owner = "EBTORROD", name = "w", descriptor = "[I")
    private static int[] field825 = new int[5];

    @OriginalMember(owner = "EBTORROD", name = "x", descriptor = "[I")
    private static int[] field826 = new int[5];

    @OriginalMember(owner = "EBTORROD", name = "y", descriptor = "[I")
    private static int[] field827 = new int[5];

    @OriginalMember(owner = "EBTORROD", name = "z", descriptor = "[I")
    private static int[] field828 = new int[5];

    @OriginalMember(owner = "EBTORROD", name = "A", descriptor = "[I")
    private static int[] field829 = new int[5];

    @OriginalMember(owner = "EBTORROD", name = "n", descriptor = "I")
    private int field816;

    @OriginalMember(owner = "EBTORROD", name = "s", descriptor = "I")
    public int field821;

    @OriginalMember(owner = "EBTORROD", name = "p", descriptor = "LTUODRVGB;")
    private class52 field818;

    @OriginalMember(owner = "EBTORROD", name = "c", descriptor = "LXCOYGYOS;")
    private class59 field805;

    @OriginalMember(owner = "EBTORROD", name = "d", descriptor = "LXCOYGYOS;")
    private class59 field806;

    @OriginalMember(owner = "EBTORROD", name = "e", descriptor = "LXCOYGYOS;")
    private class59 field807;

    @OriginalMember(owner = "EBTORROD", name = "f", descriptor = "LXCOYGYOS;")
    private class59 field808;

    @OriginalMember(owner = "EBTORROD", name = "g", descriptor = "LXCOYGYOS;")
    private class59 field809;

    @OriginalMember(owner = "EBTORROD", name = "h", descriptor = "LXCOYGYOS;")
    private class59 field810;

    @OriginalMember(owner = "EBTORROD", name = "i", descriptor = "LXCOYGYOS;")
    private class59 field811;

    @OriginalMember(owner = "EBTORROD", name = "j", descriptor = "LXCOYGYOS;")
    private class59 field812;

    @OriginalMember(owner = "EBTORROD", name = "q", descriptor = "LXCOYGYOS;")
    private class59 field819;

    @OriginalMember(owner = "EBTORROD", name = "t", descriptor = "[I")
    private static int[] field822;

    @OriginalMember(owner = "EBTORROD", name = "u", descriptor = "[I")
    private static int[] field823;

    @OriginalMember(owner = "EBTORROD", name = "v", descriptor = "[I")
    private static int[] field824;

    @OriginalMember(owner = "EBTORROD", name = "a", descriptor = "()V")
    public static final void method208() {
        field823 = new int[32768];
        for (int var0 = 0; var0 < 32768; var0++) {
            if (Math.random() > 0.5D) {
                field823[var0] = 1;
            } else {
                field823[var0] = -1;
            }
        }
        field824 = new int[32768];
        for (int var1 = 0; var1 < 32768; var1++) {
            field824[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
        }
        field822 = new int[220500];
    }

    @OriginalMember(owner = "EBTORROD", name = "a", descriptor = "(II)[I")
    public final int[] method209(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field822[var3] = 0;
        }
        if (arg1 < 10) {
            return field822;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field805.method456(-752);
        this.field806.method456(-752);
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field807 != null) {
            this.field807.method456(-752);
            this.field808.method456(-752);
            var6 = (int) ((double) (this.field807.field1540 - this.field807.field1539) * 32.768D / var4);
            var7 = (int) ((double) this.field807.field1539 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field809 != null) {
            this.field809.method456(-752);
            this.field810.method456(-752);
            var9 = (int) ((double) (this.field809.field1540 - this.field809.field1539) * 32.768D / var4);
            var10 = (int) ((double) this.field809.field1539 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field813[var12] != 0) {
                field825[var12] = 0;
                field826[var12] = (int) ((double) this.field815[var12] * var4);
                field827[var12] = (this.field813[var12] << 14) / 100;
                field828[var12] = (int) ((double) (this.field805.field1540 - this.field805.field1539) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field814[var12]) / var4);
                field829[var12] = (int) ((double) this.field805.field1539 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var41 = this.field805.method457(arg0, 0);
            int var42 = this.field806.method457(arg0, 0);
            if (this.field807 != null) {
                int var43 = this.field807.method457(arg0, 0);
                int var44 = this.field808.method457(arg0, 0);
                var41 += this.method210(var8, this.field807.field1541, var44, (byte) -111) >> 1;
                var8 += (var6 * var43 >> 16) + var7;
            }
            if (this.field809 != null) {
                int var45 = this.field809.method457(arg0, 0);
                int var46 = this.field810.method457(arg0, 0);
                var42 = var42 * ((this.method210(var11, this.field809.field1541, var46, (byte) -111) >> 1) + 32768) >> 15;
                var11 += (var9 * var45 >> 16) + var10;
            }
            for (int var47 = 0; var47 < 5; var47++) {
                if (this.field813[var47] != 0) {
                    int var48 = field826[var47] + var13;
                    if (var48 < arg0) {
                        field822[var48] += this.method210(field825[var47], this.field805.field1541, field827[var47] * var42 >> 15, (byte) -111);
                        field825[var47] += (field828[var47] * var41 >> 16) + field829[var47];
                    }
                }
            }
        }
        if (this.field811 != null) {
            this.field811.method456(-752);
            this.field812.method456(-752);
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field811.method457(arg0, 0);
                int var19 = this.field812.method457(arg0, 0);
                int var20;
                if (var16) {
                    var20 = ((this.field811.field1540 - this.field811.field1539) * var18 >> 8) + this.field811.field1539;
                } else {
                    var20 = ((this.field811.field1540 - this.field811.field1539) * var19 >> 8) + this.field811.field1539;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field822[var17] = 0;
                }
            }
        }
        if (this.field816 > 0 && this.field817 > 0) {
            int var21 = (int) ((double) this.field816 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field822[var22] += field822[var22 - var21] * this.field817 / 100;
            }
        }
        if (this.field818.field1459[0] > 0 || this.field818.field1459[1] > 0) {
            this.field819.method456(-752);
            int var23 = this.field819.method457(arg0 + 1, 0);
            int var24 = this.field818.method446(0, 986, (float) var23 / 65536.0F);
            int var25 = this.field818.method446(1, 986, (float) var23 / 65536.0F);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var37 = (int) ((long) field822[var24 + var26] * (long) class52.field1466 >> 16);
                    for (int var38 = 0; var38 < var24; var38++) {
                        var37 += (int) ((long) field822[var24 + var26 - var38 - 1] * (long) class52.field1464[0][var38] >> 16);
                    }
                    for (int var39 = 0; var39 < var26; var39++) {
                        var37 -= (int) ((long) field822[var26 - var39 - 1] * (long) class52.field1464[1][var39] >> 16);
                    }
                    field822[var26] = var37;
                    var23 = this.field819.method457(arg0 + 1, 0);
                    var26++;
                }
                short var28 = 128;
                int var29 = var28;
                while (true) {
                    if (var29 > arg0 - var24) {
                        var29 = arg0 - var24;
                    }
                    while (var26 < var29) {
                        int var34 = (int) ((long) field822[var24 + var26] * (long) class52.field1466 >> 16);
                        for (int var35 = 0; var35 < var24; var35++) {
                            var34 += (int) ((long) field822[var24 + var26 - var35 - 1] * (long) class52.field1464[0][var35] >> 16);
                        }
                        for (int var36 = 0; var36 < var25; var36++) {
                            var34 -= (int) ((long) field822[var26 - var36 - 1] * (long) class52.field1464[1][var36] >> 16);
                        }
                        field822[var26] = var34;
                        var23 = this.field819.method457(arg0 + 1, 0);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var30 = 0;
                            for (int var31 = var24 + var26 - arg0; var31 < var24; var31++) {
                                var30 += (int) ((long) field822[var24 + var26 - var31 - 1] * (long) class52.field1464[0][var31] >> 16);
                            }
                            for (int var32 = 0; var32 < var25; var32++) {
                                var30 -= (int) ((long) field822[var26 - var32 - 1] * (long) class52.field1464[1][var32] >> 16);
                            }
                            field822[var26] = var30;
                            this.field819.method457(arg0 + 1, 0);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field818.method446(0, 986, (float) var23 / 65536.0F);
                    var25 = this.field818.method446(1, 986, (float) var23 / 65536.0F);
                    var29 += var28;
                }
            }
        }
        for (int var40 = 0; var40 < arg0; var40++) {
            if (field822[var40] < -32768) {
                field822[var40] = -32768;
            }
            if (field822[var40] > 32767) {
                field822[var40] = 32767;
            }
        }
        return field822;
    }

    @OriginalMember(owner = "EBTORROD", name = "a", descriptor = "(IIIB)I")
    private final int method210(int arg0, int arg1, int arg2, byte arg3) {
        if (this.field803 != arg3) {
            this.field804 = !this.field804;
        }
        if (arg1 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg2 : -arg2;
        } else if (arg1 == 2) {
            return field824[arg0 & 0x7FFF] * arg2 >> 14;
        } else if (arg1 == 3) {
            return ((arg0 & 0x7FFF) * arg2 >> 14) - arg2;
        } else if (arg1 == 4) {
            return field823[arg0 / 2607 & 0x7FFF] * arg2;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "EBTORROD", name = "a", descriptor = "(LZOMNSJJM;B)V")
    public final void method211(class69 arg0, byte arg1) {
        this.field805 = new class59();
        this.field805.method454(arg0, (byte) 5);
        this.field806 = new class59();
        this.field806.method454(arg0, (byte) 5);
        int var3 = arg0.method547();
        if (var3 != 0) {
            arg0.field1700--;
            this.field807 = new class59();
            this.field807.method454(arg0, (byte) 5);
            this.field808 = new class59();
            this.field808.method454(arg0, (byte) 5);
        }
        int var4 = arg0.method547();
        if (var4 != 0) {
            arg0.field1700--;
            this.field809 = new class59();
            this.field809.method454(arg0, (byte) 5);
            this.field810 = new class59();
            this.field810.method454(arg0, (byte) 5);
        }
        int var5 = arg0.method547();
        if (var5 != 0) {
            arg0.field1700--;
            this.field811 = new class59();
            this.field811.method454(arg0, (byte) 5);
            this.field812 = new class59();
            this.field812.method454(arg0, (byte) 5);
        }
        for (int var6 = 0; var6 < 10; var6++) {
            int var7 = arg0.method561();
            if (var7 == 0) {
                break;
            }
            this.field813[var6] = var7;
            this.field814[var6] = arg0.method560();
            this.field815[var6] = arg0.method561();
        }
        this.field816 = arg0.method561();
        this.field817 = arg0.method561();
        this.field820 = arg0.method549();
        if (arg1 != 5) {
            throw new NullPointerException();
        }
        this.field821 = arg0.method549();
        this.field818 = new class52();
        this.field819 = new class59();
        this.field818.method447(this.field819, 8588, arg0);
    }
}
