import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class180 extends class110 {

    @OriginalMember(owner = "client!wg", name = "N", descriptor = "I")
    private int field2688 = 3216;

    @OriginalMember(owner = "client!wg", name = "O", descriptor = "I")
    private int field2689 = 4096;

    @OriginalMember(owner = "client!wg", name = "S", descriptor = "I")
    private int field2692 = 3216;

    @OriginalMember(owner = "client!wg", name = "U", descriptor = "[I")
    private int[] field2694 = new int[3];

    @OriginalMember(owner = "client!wg", name = "L", descriptor = "[Ljava/lang/String;")
    public static String[] field2686 = new String[500];

    @OriginalMember(owner = "client!wg", name = "V", descriptor = "F")
    public static float field2695;

    @OriginalMember(owner = "client!wg", name = "G", descriptor = "I")
    public static int field2682;

    @OriginalMember(owner = "client!wg", name = "I", descriptor = "I")
    public static int field2683;

    @OriginalMember(owner = "client!wg", name = "J", descriptor = "I")
    public static int field2684;

    @OriginalMember(owner = "client!wg", name = "K", descriptor = "I")
    public static int field2685;

    @OriginalMember(owner = "client!wg", name = "M", descriptor = "I")
    public static int field2687;

    @OriginalMember(owner = "client!wg", name = "Q", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!wg", name = "T", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!wg", name = "W", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!wg", name = "X", descriptor = "I")
    public static int field2697;

    @OriginalMember(owner = "client!wg", name = "R", descriptor = "[I")
    public static int[] field2691;

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "(I)V", line = 12)
    public static void method1247(int arg0) {
        if (arg0 <= 10) {
            method1249(-62);
        }
        field2691 = null;
        field2686 = null;
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "()V", line = 339)
    public class180() {
        super(1, true);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BLij;ZIIZLij;)I", line = 33)
    public static final int method1248(byte arg0, class178 arg1, boolean arg2, int arg3, int arg4, boolean arg5, class178 arg6) {
        int var7 = class106.method752(arg1, arg4, arg2, arg6, -2);
        field2693++;
        if (arg0 < 29) {
            field2697 = -81;
        }
        if (var7 != 0) {
            return arg2 ? -var7 : var7;
        } else if (arg3 == -1) {
            return 0;
        } else {
            int var8 = class106.method752(arg1, arg3, arg5, arg6, -2);
            return arg5 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "(I)V", line = 66)
    public static final void method1249(int arg0) {
        field2696++;
        int var1 = class230.field3481 * 128 + 64;
        int var2 = class214.field3253 * 128 + 64;
        int var3 = class74.method473(var2, var1, arg0 ^ 0xFFFFFF80, field2697) - class181.field2701;
        if (class88.field1314 >= 100) {
            class302.field4612 = class230.field3481 * 128 + 64;
            class203.field3052 = class214.field3253 * 128 + 64;
            class287.field4338 = class74.method473(class203.field3052, class302.field4612, arg0 ^ 0xFFFFFF80, field2697) - class181.field2701;
        } else {
            if (class203.field3052 < var2) {
                class203.field3052 += (var2 - class203.field3052) * class88.field1314 / 1000 + class16.field178;
                if (var2 < class203.field3052) {
                    class203.field3052 = var2;
                }
            }
            if (var1 > class302.field4612) {
                class302.field4612 += (var1 - class302.field4612) * class88.field1314 / 1000 + class16.field178;
                if (class302.field4612 > var1) {
                    class302.field4612 = var1;
                }
            }
            if (class203.field3052 > var2) {
                class203.field3052 -= (class203.field3052 - var2) * class88.field1314 / 1000 + class16.field178;
                if (var2 > class203.field3052) {
                    class203.field3052 = var2;
                }
            }
            if (class287.field4338 < var3) {
                class287.field4338 += (var3 - class287.field4338) * class88.field1314 / 1000 + class16.field178;
                if (var3 < class287.field4338) {
                    class287.field4338 = var3;
                }
            }
            if (var3 < class287.field4338) {
                class287.field4338 -= class16.field178 + ((class287.field4338 - var3) * class88.field1314 / 1000);
                if (class287.field4338 < var3) {
                    class287.field4338 = var3;
                }
            }
            if (class302.field4612 > var1) {
                class302.field4612 -= class16.field178 + ((class302.field4612 - var1) * class88.field1314 / 1000);
                if (class302.field4612 < var1) {
                    class302.field4612 = var1;
                }
            }
        }
        int var4 = class168.field2519 * 128 + 64;
        int var5 = class327.field4918 * 128 - arg0;
        int var6 = class74.method473(var5, var4, 64, field2697) - class9.field83;
        int var7 = var6 - class287.field4338;
        int var8 = var5 - class203.field3052;
        int var9 = var4 - class302.field4612;
        int var10 = (int) Math.sqrt((double) (var8 * var8 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var7, (double) var10) * 325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        int var12 = (int) (-325.949D * Math.atan2((double) var9, (double) var8)) & 0x7FF;
        if (var11 > 383) {
            var11 = 383;
        }
        int var13 = var12 - class84.field1249;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (class160.field2392 < var11) {
            class160.field2392 += (var11 - class160.field2392) * class205.field3089 / 1000 + class43.field528;
            if (class160.field2392 > var11) {
                class160.field2392 = var11;
            }
        }
        if (class160.field2392 > var11) {
            class160.field2392 -= (class160.field2392 - var11) * class205.field3089 / 1000 + class43.field528;
            if (class160.field2392 < var11) {
                class160.field2392 = var11;
            }
        }
        if (var13 > 0) {
            class84.field1249 += class205.field3089 * var13 / 1000 + class43.field528;
            class84.field1249 &= 0x7FF;
        }
        if (var13 < 0) {
            class84.field1249 -= class43.field528 + (-var13 * class205.field3089 / 1000);
            class84.field1249 &= 0x7FF;
        }
        int var14 = var12 - class84.field1249;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class84.field1249 = var12;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BIILf;)V", line = 216)
    public static final void method1250(byte arg0, int arg1, int arg2, class329 arg3) {
        field2690++;
        if (class190.field2829 < 2 && class76.field985 == 0 && !class122.field1907 || arg0 != 63) {
            return;
        }
        String var4 = class150.method1086(4096);
        if (arg3 == null) {
            int var6 = class217.field3299.method633(var4, arg1 + 4, arg2 - -15, 16777215, 0, class170.field2548, class162.field2439);
            class252.method1704(arg2, false, arg1 + 4, 15, var6 + class217.field3299.method632(var4));
            return;
        }
        class89 var5 = arg3.method2241((byte) 18, class73.field948);
        if (var5 == null) {
            var5 = class217.field3299;
        }
        var5.method615(var4, arg1, arg2, arg3.field5018, arg3.field4994, arg3.field4935, arg3.field5043, arg3.field4983, arg3.field4952, class170.field2548, class162.field2439, class300.field4588);
        class252.method1704(class300.field4588[1], false, class300.field4588[0], class300.field4588[3], class300.field4588[2]);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILre;I)V", line = 249)
    public final void method44(int arg0, class263 arg1, int arg2) {
        field2683++;
        if (arg0 == 0) {
            this.field2689 = arg1.method1830((byte) -77);
        } else if (arg0 == 1) {
            this.field2692 = arg1.method1830((byte) -77);
        } else if (arg0 == 2) {
            this.field2688 = arg1.method1830((byte) -77);
        }
        if (arg2 >= -37) {
            method1250((byte) 40, 14, -47, (class329) null);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IB)V", line = 296)
    public static final void method1251(int arg0, byte arg1) {
        field2682++;
        if (arg0 > -107) {
            return;
        }
        if (class81.field1136 == null) {
            class81.field1136 = new byte[4][104][104];
        }
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    class81.field1136[var2][var3][var4] = arg1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)[I", line = 343)
    public final int[] method46(int arg0, int arg1) {
        field2685++;
        if (arg0 != 1) {
            this.field2692 = 87;
        }
        int[] var3 = this.field1695.method440((byte) -60, arg1);
        if (this.field1695.field875) {
            int var4 = class305.field4654 * this.field2689 >> 12;
            int[] var5 = this.method764(0, true, class154.field2320 & arg1 - 1);
            int[] var6 = this.method764(0, true, arg1);
            int[] var7 = this.method764(0, true, class154.field2320 & arg1 + 1);
            for (int var8 = 0; var8 < class124.field1936; var8++) {
                int var9 = (var7[var8] - var5[var8]) * var4 >> 12;
                int var10 = (var6[var8 - 1 & class196.field2949] - var6[class196.field2949 & var8 + 1]) * var4 >> 12;
                int var11 = var9 >> 4;
                int var12 = var10 >> 4;
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                if (var11 < 0) {
                    var11 = -var11;
                }
                if (var11 > 255) {
                    var11 = 255;
                }
                int var13 = class285.field4308[((var11 + 1) * var11 >> 1) + var12] & 0xFF;
                int var14 = var13 * 4096 >> 8;
                int var15 = var10 * var13 >> 8;
                int var16 = this.field2694[0] * var15 >> 12;
                int var17 = this.field2694[2] * var14 >> 12;
                int var18 = var9 * var13 >> 8;
                int var19 = this.field2694[1] * var18 >> 12;
                var3[var8] = var16 + var19 + var17;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "(I)V", line = 421)
    private final void method1252(int arg0) {
        field2684++;
        double var2 = Math.cos((double) ((float) this.field2688 / 4096.0F));
        this.field2694[0] = (int) (var2 * Math.sin((double) ((float) this.field2692 / 4096.0F)) * 4096.0D);
        this.field2694[1] = (int) (Math.cos((double) ((float) this.field2692 / 4096.0F)) * 4096.0D * var2);
        this.field2694[2] = (int) (Math.sin((double) ((float) this.field2688 / 4096.0F)) * 4096.0D);
        int var4 = this.field2694[1] * this.field2694[1] >> 12;
        int var5 = this.field2694[0] * this.field2694[0] >> 12;
        int var6 = this.field2694[2] * this.field2694[2] >> 12;
        int var7 = (int) (Math.sqrt((double) (var5 + var6 + var4 >> 12)) * 4096.0D);
        if (arg0 > 14 && var7 != 0) {
            this.field2694[2] = (this.field2694[2] << 12) / var7;
            this.field2694[0] = (this.field2694[0] << 12) / var7;
            this.field2694[1] = (this.field2694[1] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "(I)V", line = 452)
    public final void method47(int arg0) {
        field2687++;
        if (arg0 == -9) {
            this.method1252(63);
        }
    }
}
