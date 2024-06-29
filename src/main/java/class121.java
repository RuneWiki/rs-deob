import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class121 extends class198 {

    @OriginalMember(owner = "client!mj", name = "I", descriptor = "I")
    private int field1851 = 1;

    @OriginalMember(owner = "client!mj", name = "T", descriptor = "I")
    private int field1862 = 1;

    @OriginalMember(owner = "client!mj", name = "M", descriptor = "I")
    private int field1855 = 204;

    @OriginalMember(owner = "client!mj", name = "O", descriptor = "I")
    public static int field1857 = 0;

    @OriginalMember(owner = "client!mj", name = "J", descriptor = "Ljava/lang/String;")
    public static String field1852 = "Close";

    @OriginalMember(owner = "client!mj", name = "R", descriptor = "Ljava/lang/String;")
    public static String field1860 = "glow3:";

    @OriginalMember(owner = "client!mj", name = "L", descriptor = "I")
    public static int field1854;

    @OriginalMember(owner = "client!mj", name = "N", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!mj", name = "P", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!mj", name = "S", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!mj", name = "U", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!mj", name = "Q", descriptor = "Lfa;")
    public static class273 field1859;

    @OriginalMember(owner = "client!mj", name = "K", descriptor = "Lh;")
    public static class294 field1853;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIILjk;IJZ)Z")
    public static final boolean method786(int arg0, int arg1, int arg2, int arg3, int arg4, class276 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        } else {
            int var10 = arg1 - arg4;
            int var11 = arg2 - arg4;
            int var12 = arg1 + arg4;
            int var13 = arg2 + arg4;
            if (arg8) {
                if (arg6 > 640 && arg6 < 1408) {
                    var13 += 128;
                }
                if (arg6 > 1152 && arg6 < 1920) {
                    var12 += 128;
                }
                if (arg6 > 1664 || arg6 < 384) {
                    var11 -= 128;
                }
                if (arg6 > 128 && arg6 < 896) {
                    var10 -= 128;
                }
            }
            int var14 = var10 / 128;
            int var15 = var11 / 128;
            int var16 = var12 / 128;
            int var17 = var13 / 128;
            return class227.method1576(arg0, var14, var15, var16 - var14 + 1, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
        }
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "()V")
    public class121() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILh;Lkk;IIII)V")
    public static final void method787(int arg0, class294 arg1, class254 arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1856;
        if (arg1 != null) {
            int var7;
            if (class92.field1402 == 4) {
                var7 = 2047 & (int) class202.field3253;
            } else {
                var7 = (int) class202.field3253 + class262.field4330 & 2047;
            }
            int var8 = arg0 * arg0 + arg4 * arg4;
            int var9 = Math.max(arg2.field4085 / 2, arg2.field4152 / 2) + 10;
            if (arg6 != -1) {
                method791((byte) -5);
            }
            if (~var8 >= ~(var9 * var9)) {
                int var10 = class172.field2669[var7];
                int var11 = class172.field2658[var7];
                if (~class92.field1402 != -5) {
                    var10 = var10 * 256 / (class265.field4365 + 256);
                    var11 = var11 * 256 / (class265.field4365 + 256);
                }
                int var12 = arg4 * var10 - -(arg0 * var11) >> 16;
                int var13 = arg4 * var11 - arg0 * var10 >> 16;
                ((class38) arg1).method248(arg5 + var12 - (-(arg2.field4085 / 2) - -(arg1.field4827 / 2)), arg2.field4152 / 2 - arg1.field4831 / 2 + -var13 + arg3, arg2.field4193, arg2.field4092);
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(III)Ltf;")
    public static final class114 method788(int arg0, int arg1, int arg2) {
        class154 var3 = class27.field346[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            for (int var4 = 0; var4 < var3.field2431; ++var4) {
                class114 var5 = var3.field2418[var4];
                if ((var5.field1712 >> 29 & 3L) == 2L && var5.field1724 == arg1 && var5.field1719 == arg2) {
                    class257.method1793(var5);
                    return var5;
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "(I)V")
    public static final void method789(int arg0) {
        ++field1858;
        if (~class310.field5018 != 0 && class117.field1778 != -1) {
            int var1 = ((-class307.field4984 + class154.field2406) * class262.field4329 >> 16) + class307.field4984;
            float[] var2 = new float[3];
            class262.field4329 += var1;
            if (class262.field4329 < 65535) {
                class283.field4735 = false;
                class42.field580 = false;
            } else {
                if (!class283.field4735) {
                    class42.field580 = true;
                } else {
                    class42.field580 = false;
                }
                class283.field4735 = true;
                class262.field4329 = 65535;
            }
            float var3 = (float) class262.field4329 / 65535.0F;
            int var4 = class111.field1697 * 2;
            for (int var5 = 0; var5 < 3; ++var5) {
                int var21 = (class24.field313[class310.field5018][var4 + 2][var5] + -class24.field313[class310.field5018][var4 + 3][var5] + class24.field313[class310.field5018][var4 + 2][var5]) * 3;
                int var22 = class24.field313[class310.field5018][var4 + 1][var5] * 3;
                int var23 = class24.field313[class310.field5018][var4][var5];
                int var24 = class24.field313[class310.field5018][var4][var5] * 3;
                int var25 = -var24 + var22;
                int var26 = -(var22 * 2) + var24 - -var21;
                int var27 = class24.field313[class310.field5018][var4 + 2][var5] + var22 + -var23 - var21;
                var2[var5] = (((float) var27 * var3 + (float) var26) * var3 + (float) var25) * var3 + (float) var23;
            }
            class53.field715 = (int) var2[arg0] + -(class101.field1517 * 128);
            class174.field2724 = (int) var2[2] + -(class254.field4063 * 128);
            class262.field4326 = (int) var2[1] * -1;
            float[] var6 = new float[3];
            int var7 = class18.field249 * 2;
            for (int var8 = 0; ~var8 > -4; ++var8) {
                int var14 = class24.field313[class117.field1778][var7][var8] * 3;
                int var15 = class24.field313[class117.field1778][var7 - -1][var8] * 3;
                int var16 = class24.field313[class117.field1778][var7][var8];
                int var17 = var15 - var14;
                int var18 = (class24.field313[class117.field1778][var7 + 2][var8] + -class24.field313[class117.field1778][var7 + 3][var8] + class24.field313[class117.field1778][var7 + 2][var8]) * 3;
                int var19 = -(var15 * 2) + var18 + var14;
                int var20 = -var16 - var18 + class24.field313[class117.field1778][var7 + 2][var8] + var15;
                var6[var8] = (((float) var20 * var3 + (float) var19) * var3 + (float) var17) * var3 + (float) var16;
            }
            float var9 = (var6[1] - var2[1]) * -1.0F;
            float var10 = var6[2] + -var2[2];
            float var11 = var6[0] - var2[0];
            double var12 = Math.sqrt((double) (var10 * var10 + var11 * var11));
            class203.field3280 = (float) Math.atan2((double) var9, var12);
            class272.field4455 = -((float) Math.atan2((double) var11, (double) var10));
            class100.field1514 = (int) ((double) class272.field4455 * 325.949D) & 2047;
            class132.field2037 = (int) ((double) class203.field3280 * 325.949D) & 2047;
        }
    }

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "(I)V")
    public static void method790(int arg0) {
        if (arg0 != 4) {
            field1857 = 11;
        }
        field1859 = null;
        field1852 = null;
        field1853 = null;
        field1860 = null;
    }

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "(B)V")
    public static final void method791(byte arg0) {
        ++field1861;
        if (class145.field2280 == 2) {
            if (~class265.field4367 == ~class230.field3686 && ~class262.field4331 == ~class219.field3504) {
                class145.field2280 = 0;
                if (class253.field4019 && class3.field26[81] && ~class18.field251 < -3) {
                    class47.method295(class18.field251 - 2, 0);
                } else {
                    class47.method295(class18.field251 + -1, 0);
                }
            }
        } else if (~class265.field4367 == ~class199.field3158 && class262.field4331 == class218.field3483) {
            class145.field2280 = 0;
            if (class253.field4019 && class3.field26[81] && ~class18.field251 < -3) {
                class47.method295(class18.field251 - 2, 0);
            } else {
                class47.method295(class18.field251 + -1, 0);
            }
        } else {
            class219.field3504 = class218.field3483;
            class145.field2280 = 2;
            class230.field3686 = class199.field3158;
        }
        if (arg0 < 82) {
            method787(102, (class294) null, (class254) null, -118, 95, -44, -5);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZI)[I")
    public final int[] method32(boolean arg0, int arg1) {
        if (!arg0) {
            this.method32(true, -109);
        }
        ++field1854;
        int[] var3 = super.field3134.method36(arg1, 30672);
        if (super.field3134.field69) {
            for (int var4 = 0; ~var4 > ~class42.field590; ++var4) {
                int var5 = class152.field2367[var4];
                int var6 = class42.field591[arg1];
                int var7 = this.field1851 * var6 >> 12;
                int var8 = this.field1862 * var5 >> 12;
                int var9 = var5 % (4096 / this.field1862) * this.field1862;
                int var10 = var6 % (4096 / this.field1851) * this.field1851;
                if (this.field1855 > var10) {
                    for (var8 -= var7; var8 < 0; var8 += 4) {
                    }
                    while (var8 > 3) {
                        var8 -= 4;
                    }
                    if (~var8 != -2) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (~this.field1855 < ~var9) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (~this.field1855 < ~var9) {
                    int var11;
                    for (var11 = var8 - var7; ~var11 > -1; var11 += 4) {
                    }
                    while (~var11 < -4) {
                        var11 -= 4;
                    }
                    if (~var11 < -1) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILma;I)V")
    public final void method52(int arg0, class202 arg1, int arg2) {
        ++field1863;
        int var4 = 80 % ((60 - arg0) / 61);
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    this.field1855 = arg1.method1419(109);
                }
            } else {
                this.field1851 = arg1.method1420((byte) 0);
            }
        } else {
            this.field1862 = arg1.method1420((byte) 0);
        }
    }
}
