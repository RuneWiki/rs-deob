import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class271 {

    @OriginalMember(owner = "client!bg", name = "s", descriptor = "I")
    private int field3843 = -1;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "Z")
    private boolean field3826 = true;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
    private int field3825;

    @OriginalMember(owner = "client!bg", name = "o", descriptor = "[Lap;")
    private class280[] field3839;

    @OriginalMember(owner = "client!bg", name = "m", descriptor = "I")
    private int field3837;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "I")
    private int field3833;

    @OriginalMember(owner = "client!bg", name = "r", descriptor = "I")
    private int field3842;

    @OriginalMember(owner = "client!bg", name = "p", descriptor = "[Lap;")
    private class280[] field3840;

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "Lap;")
    private class280 field3835;

    @OriginalMember(owner = "client!bg", name = "l", descriptor = "I")
    public static int field3836 = 0;

    @OriginalMember(owner = "client!bg", name = "n", descriptor = "Z")
    public static boolean field3838 = true;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
    public static int field3829;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "I")
    public static int field3830;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
    private int field3831;

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "I")
    private int field3832;

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "I")
    public static int field3834;

    @OriginalMember(owner = "client!bg", name = "q", descriptor = "I")
    public static int field3841;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "Lgj;")
    public static class381 field3827;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "Lgj;")
    private class381 field3828;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IBLae;)Z", line = 6)
    public final boolean method1790(int arg0, byte arg1, class134 arg2) {
        if (this.field3843 != arg0) {
            this.field3843 = arg0;
            int var4 = class328.method2123(arg0, 20867);
            if (arg0 < var4) {
                var4 = class292.method1933(-583426143, arg0);
            }
            if (var4 > 512) {
                var4 = 512;
            }
            if (this.field3831 != var4) {
                this.field3831 = var4;
                this.field3828 = null;
            }
            if (this.field3839 != null) {
                this.field3832 = 0;
                int[] var5 = new int[this.field3839.length];
                for (int var6 = 0; var6 < this.field3839.length; var6++) {
                    class280 var7 = this.field3839[var6];
                    if (var7.method1849(this.field3842, this.field3833, this.field3837, this.field3843)) {
                        var5[this.field3832] = var7.field3956;
                        this.field3840[this.field3832++] = var7;
                    }
                }
                class377.method2436(var5, 1, this.field3840, 0, this.field3832 - 1);
            }
            this.field3826 = true;
        }
        field3830++;
        boolean var8 = false;
        if (arg1 != -79) {
            this.field3840 = null;
        }
        if (this.field3826) {
            this.field3826 = false;
            for (int var9 = this.field3832 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field3840[var9].method1853(arg2, this.field3835);
                var8 |= var10;
                this.field3826 |= !var10;
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V", line = 87)
    public static final void method1791(int arg0) {
        field3841++;
        if (class443.method2762((byte) 74) != 2) {
            return;
        }
        byte var1 = (byte) (class348.field4931 - 4 & 0xFF);
        int var2 = class348.field4931 % class176.field2403;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var16 = 0; var16 < class383.field5395; var16++) {
                class325.field4622[var3][var2][var16] = var1;
            }
        }
        if (arg0 != -15170) {
            field3836 = -32;
        }
        if (class129.field1570 == 3) {
            return;
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class300.field4212[var4] = -1000000;
            class237.field3367[var4] = 1000000;
            class18.field206[var4] = 0;
            class273.field3874[var4] = 1000000;
            class237.field3380[var4] = 0;
        }
        if (class129.field1568 != 1) {
            int var15 = class114.method709(class129.field1570, class334.field4730, 0, class265.field3774);
            if ((var15 - class276.field3925) >= 800 || (class399.field5699[class129.field1570][class334.field4730 >> 7][class265.field3774 >> 7] & 0x4) == 0) {
                return;
            }
            class183.method1232(1, -95, class334.field4730 >> 7, false, class250.field3570, class265.field3774 >> 7);
            return;
        }
        if ((class399.field5699[class129.field1570][class384.field5422.field3284 >> 7][class384.field5422.field3269 >> 7] & 0x4) != 0) {
            class183.method1232(0, 28, class384.field5422.field3284 >> 7, false, class250.field3570, class384.field5422.field3269 >> 7);
        }
        if (class138.field1722 >= 2560) {
            return;
        }
        int var5 = class334.field4730 >> 7;
        int var6 = class265.field3774 >> 7;
        int var7 = class384.field5422.field3284 >> 7;
        int var8 = class384.field5422.field3269 >> 7;
        int var9;
        if (var5 < var7) {
            var9 = var7 - var5;
        } else {
            var9 = var5 - var7;
        }
        int var10;
        if (var6 >= var8) {
            var10 = var6 - var8;
        } else {
            var10 = var8 - var6;
        }
        if ((var9 != 0 || var10 != 0) && var9 > (-class176.field2403) && var9 < class176.field2403 && var10 > (-class383.field5395) && var10 < class383.field5395) {
            if (var9 > var10) {
                int var11 = var10 * 65536 / var9;
                int var12 = 32768;
                while (var5 != var7) {
                    if (var7 > var5) {
                        var5++;
                    } else if (var5 > var7) {
                        var5--;
                    }
                    if ((class399.field5699[class129.field1570][var5][var6] & 0x4) != 0) {
                        class183.method1232(1, -98, var5, false, class250.field3570, var6);
                        return;
                    }
                    var12 += var11;
                    if (var12 >= 65536) {
                        var12 -= 65536;
                        if (var8 > var6) {
                            var6++;
                        } else if (var8 < var6) {
                            var6--;
                        }
                        if ((class399.field5699[class129.field1570][var5][var6] & 0x4) != 0) {
                            class183.method1232(1, arg0 ^ 0xFFFFC495, var5, false, class250.field3570, var6);
                            return;
                        }
                    }
                }
                return;
            }
            int var13 = var9 * 65536 / var10;
            int var14 = 32768;
            while (var6 != var8) {
                if (var8 > var6) {
                    var6++;
                } else if (var8 < var6) {
                    var6--;
                }
                if ((class399.field5699[class129.field1570][var5][var6] & 0x4) != 0) {
                    class183.method1232(1, 46, var5, false, class250.field3570, var6);
                    return;
                }
                var14 += var13;
                if (var14 >= 65536) {
                    var14 -= 65536;
                    if (var7 > var5) {
                        var5++;
                    } else if (var5 > var7) {
                        var5--;
                    }
                    if ((class399.field5699[class129.field1570][var5][var6] & 0x4) != 0) {
                        class183.method1232(1, 50, var5, false, class250.field3570, var6);
                        return;
                    }
                }
            }
            return;
        }
        class422.method2663("RC: " + var5 + "," + var6 + " " + var7 + "," + var8 + " " + class114.field1403 + "," + class41.field496, (Throwable) null, -78);
        return;
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)V", line = 285)
    public static void method1792(int arg0) {
        field3827 = null;
        if (arg0 != -1) {
            method1791(-10);
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)V", line = 299)
    public final void method1793(byte arg0) {
        field3829++;
        if (this.field3839 != null) {
            for (int var2 = 0; var2 < this.field3839.length; var2++) {
                this.field3839[var2].method1843();
            }
        }
        this.field3828 = null;
        if (arg0 > -18) {
            field3838 = true;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIIIIIILae;I)V", line = 328)
    public final void method1794(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class134 arg8, int arg9) {
        int var11 = arg1 + arg7 & 0x3FFF;
        field3834++;
        if (this.field3825 == -1) {
            arg8.method653(arg2, arg9, arg5, arg4, arg6, 0);
        } else {
            class336 var12 = class347.field4909.method1329((byte) -62, this.field3825);
            if (this.field3828 == null && class347.field4909.method1328((byte) -88, this.field3825)) {
                int[] var13 = var12.field4774 ? class347.field4909.method1325(4692, this.field3831, 0.7F, this.field3825, this.field3831, false) : class347.field4909.method1324(false, this.field3825, this.field3831, 0.7F, 1580, this.field3831);
                this.field3828 = arg8.method610(var13, 0, this.field3831, this.field3831, this.field3831);
            }
            if (!var12.field4774) {
                arg8.method653(arg2, arg9, arg5, arg4, arg6, 0);
            }
            if (this.field3828 != null) {
                int var14 = var12.field4774 ? 0 : 1;
                int var15 = arg0 * arg4 / -4096;
                int var16;
                for (var16 = arg4 * var11 / 4096 + (arg5 - arg4) / 2; var16 > arg4; var16 -= arg4) {
                }
                while (var16 < 0) {
                    var16 += arg4;
                }
                while (var15 > arg4) {
                    var15 -= arg4;
                }
                while (var15 < 0) {
                    var15 += arg4;
                }
                for (int var17 = var16 - arg4; var17 < arg5; var17 += arg4) {
                    for (int var18 = var15 - arg4; var18 < arg4; var18 += arg4) {
                        this.field3828.method752(arg2 + var17, arg9 + var18, arg4, arg4, 0, 0, var14);
                    }
                }
            }
        }
        for (int var19 = this.field3832 - 1; var19 >= 0; var19--) {
            this.field3840[var19].method1852(arg8, arg2, arg9, arg5, arg4, arg0, var11);
        }
        if (arg3 <= 67) {
            field3836 = -101;
        }
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(I[Lap;IIII)V", line = 417)
    public class271(int arg0, class280[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field3825 = arg0;
        this.field3839 = arg1;
        this.field3837 = arg5;
        this.field3833 = arg4;
        this.field3842 = arg3;
        if (arg1 == null) {
            this.field3840 = null;
            this.field3835 = null;
        } else {
            this.field3840 = new class280[arg1.length];
            this.field3835 = arg2 >= 0 ? arg1[arg2] : null;
        }
    }
}
