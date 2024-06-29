import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lia")
public class class187 {

    @OriginalMember(owner = "client!lia", name = "p", descriptor = "I")
    public int field2627;

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "Z")
    public boolean field2612;

    @OriginalMember(owner = "client!lia", name = "q", descriptor = "Z")
    public boolean field2628;

    @OriginalMember(owner = "client!lia", name = "j", descriptor = "[S")
    public short[] field2621;

    @OriginalMember(owner = "client!lia", name = "h", descriptor = "I")
    public int field2619;

    @OriginalMember(owner = "client!lia", name = "o", descriptor = "I")
    private int field2626;

    @OriginalMember(owner = "client!lia", name = "e", descriptor = "I")
    public static int field2616 = -1;

    @OriginalMember(owner = "client!lia", name = "b", descriptor = "I")
    private int field2613;

    @OriginalMember(owner = "client!lia", name = "c", descriptor = "I")
    public static int field2614;

    @OriginalMember(owner = "client!lia", name = "d", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!lia", name = "f", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!lia", name = "g", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!lia", name = "i", descriptor = "I")
    private int field2620;

    @OriginalMember(owner = "client!lia", name = "k", descriptor = "I")
    private int field2622;

    @OriginalMember(owner = "client!lia", name = "l", descriptor = "I")
    public static int field2623;

    @OriginalMember(owner = "client!lia", name = "m", descriptor = "I")
    private int field2624;

    @OriginalMember(owner = "client!lia", name = "n", descriptor = "I")
    public static int field2625;

    @OriginalMember(owner = "client!lia", name = "r", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!lia", name = "t", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!lia", name = "s", descriptor = "Lwh;")
    public class40 field2630;

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(IILha;IIII)V")
    private final void method1320(int arg0, int arg1, class543 arg2, int arg3, int arg4, int arg5, int arg6) {
        field2618++;
        this.field2630 = arg2.method309(arg0, arg6, arg3, arg1, arg4, (float) arg5);
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(BIIII)V")
    public final void method1321(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field2620 = arg3;
        this.field2622 = arg1;
        field2614++;
        if (arg0 >= 79) {
            this.field2613 = arg2;
            this.field2624 = arg4;
        }
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(IIZ)V")
    public final void method1322(int arg0, int arg1, boolean arg2) {
        if (arg1 >= -89) {
            this.field2630 = null;
        }
        field2615++;
        int var4;
        if (arg2) {
            var4 = 2048;
        } else {
            int var5 = this.field2620 * arg0 / 50 + this.field2626 & 0x7FF;
            int var6 = this.field2613;
            if (var6 == 1) {
                var4 = (class125.field1736[var5 << 3] >> 4) + 1024;
            } else if (var6 == 3) {
                var4 = class105.field1478[var5] >> 1;
            } else if (var6 == 4) {
                var4 = var5 >> 10 << 11;
            } else if (var6 == 2) {
                var4 = var5;
            } else if (var6 == 5) {
                var4 = (var5 < 1024 ? var5 : 2048 - var5) << 1;
            } else {
                var4 = 2048;
            }
        }
        this.field2630.method424((float) (this.field2622 + (this.field2624 * var4 >> 11)) / 2048.0F, -1);
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(FI[FIIIIIII[F)V")
    public static final void method1323(float arg0, int arg1, float[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, float[] arg10) {
        field2623++;
        int var11 = arg9 - arg4;
        int var12 = arg6 - arg1;
        int var13 = arg3 - arg7;
        float var14 = arg10[2] * (float) var13 + arg10[0] * (float) var11 + arg10[1] * (float) var12;
        float var15 = arg10[5] * (float) var13 + arg10[3] * (float) var11 + arg10[4] * (float) var12;
        float var16 = arg10[8] * (float) var13 + arg10[7] * (float) var12 + arg10[6] * (float) var11;
        if (arg5 != 2048) {
            field2616 = 5;
        }
        float var17 = (float) Math.sqrt((double) (var16 * var16 + var14 * var14 + var15 * var15));
        float var18 = (float) Math.atan2((double) var14, (double) var16) / 6.2831855F + 0.5F;
        float var19 = (float) Math.asin((double) (var15 / var17)) / 3.1415927F + arg0 + 0.5F;
        if (arg8 == 1) {
            float var21 = var18;
            var18 = -var19;
            var19 = var21;
        } else if (arg8 == 2) {
            var19 = -var19;
            var18 = -var18;
        } else if (arg8 == 3) {
            float var20 = var18;
            var18 = var19;
            var19 = -var20;
        }
        arg2[1] = var19;
        arg2[0] = var18;
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(I)V")
    private final void method1324(int arg0) {
        field2625++;
        int var2 = this.field2619;
        if (var2 == 2) {
            this.field2613 = 1;
            this.field2620 = 2048;
            this.field2622 = 0;
            this.field2624 = 2048;
        } else if (var2 == 3) {
            this.field2624 = 2048;
            this.field2613 = 1;
            this.field2620 = 4096;
            this.field2622 = 0;
        } else if (var2 == 4) {
            this.field2624 = 2048;
            this.field2622 = 0;
            this.field2620 = 2048;
            this.field2613 = 4;
        } else if (var2 == 5) {
            this.field2613 = 4;
            this.field2620 = 8192;
            this.field2622 = 0;
            this.field2624 = 2048;
        } else if (var2 == 12) {
            this.field2613 = 2;
            this.field2622 = 0;
            this.field2620 = 2048;
            this.field2624 = 2048;
        } else if (var2 == 13) {
            this.field2622 = 0;
            this.field2624 = 2048;
            this.field2613 = 2;
            this.field2620 = 8192;
        } else if (var2 == 10) {
            this.field2622 = 1536;
            this.field2620 = 2048;
            this.field2613 = 3;
            this.field2624 = 512;
        } else if (var2 == 11) {
            this.field2624 = 512;
            this.field2620 = 4096;
            this.field2613 = 3;
            this.field2622 = 1536;
        } else if (var2 == 6) {
            this.field2613 = 3;
            this.field2620 = 2048;
            this.field2624 = 768;
            this.field2622 = 1280;
        } else if (var2 == 7) {
            this.field2624 = 768;
            this.field2620 = 4096;
            this.field2613 = 3;
            this.field2622 = 1280;
        } else if (var2 == 8) {
            this.field2613 = 3;
            this.field2622 = 1024;
            this.field2620 = 2048;
            this.field2624 = 1024;
        } else if (var2 == 9) {
            this.field2622 = 1024;
            this.field2620 = 4096;
            this.field2613 = 3;
            this.field2624 = 1024;
        } else if (var2 == 14) {
            this.field2613 = 1;
            this.field2624 = 768;
            this.field2622 = 1280;
            this.field2620 = 2048;
        } else if (var2 == 15) {
            this.field2624 = 512;
            this.field2622 = 1536;
            this.field2613 = 1;
            this.field2620 = 4096;
        } else if (var2 == 16) {
            this.field2624 = 256;
            this.field2622 = 1792;
            this.field2620 = 8192;
            this.field2613 = 1;
        } else {
            this.field2624 = 2048;
            this.field2620 = 2048;
            this.field2622 = 0;
            this.field2613 = 0;
        }
        if (arg0 != -15) {
            this.field2622 = 84;
        }
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(III)V")
    public static final void method1325(int arg0, int arg1, int arg2) {
        if (class3.field22 == 1) {
            class17.method82(-7, arg0, arg1, class691.field9800);
        } else if (class3.field22 == 2) {
            if (class416.field5919) {
                class518.method3149(class695.method3915((byte) 86) + arg0, 20927, class352.method2243(-58) + arg1);
            } else {
                class518.method3149(arg0, 20927, arg1);
            }
        }
        field2629++;
        int var3 = -19 / ((26 - arg2) / 47);
        class691.field9800 = null;
        class3.field22 = 0;
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(IIBII)Z")
    public static final boolean method1326(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 <= 93) {
            field2631 = 74;
        }
        field2617++;
        if (!class522.field7591 || !class511.field7403) {
            return false;
        } else if (class163.field2324 < 100) {
            return false;
        } else if (class141.method998(arg4, 124, arg1, arg3)) {
            int var5 = arg4 << class639.field9095;
            int var6 = arg1 << class639.field9095;
            if (class550.method3313(class95.field1372[arg3].method2087(44, arg4, arg1), var5, class150.field2190, (byte) -72, class150.field2190, arg0, var6)) {
                class671.field9573++;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lia", name = "<init>", descriptor = "()V")
    protected class187() {
        if (class105.field1478 == null) {
            class555.method3335(true);
        }
        this.method1324(-15);
    }

    @OriginalMember(owner = "client!lia", name = "<init>", descriptor = "(Lha;Lsl;I)V")
    public class187(class543 arg0, class479 arg1, int arg2) {
        if (class105.field1478 == null) {
            class555.method3335(true);
        }
        this.field2627 = arg1.method2886(true);
        this.field2612 = (this.field2627 & 0x8) != 0;
        this.field2628 = (this.field2627 & 0x10) != 0;
        this.field2627 &= 0x7;
        int var4 = arg1.method2882(-1) << arg2;
        int var5 = arg1.method2882(-1) << arg2;
        int var6 = arg1.method2882(-1) << arg2;
        int var7 = arg1.method2886(true);
        int var8 = var7 * 2 + 1;
        this.field2621 = new short[var8];
        for (int var9 = 0; var9 < this.field2621.length; var9++) {
            short var13 = (short) arg1.method2882(-1);
            int var14 = var13 >>> 8;
            int var15 = var13 & 0xFF;
            if (var8 <= var14) {
                var14 = var8 - 1;
            }
            if (var15 > var8 - var14) {
                var15 = var8 - var14;
            }
            this.field2621[var9] = (short) class430.method2658(var14 << 8, var15);
        }
        int var10 = (var7 << class639.field9095) + class231.field3477;
        int var11 = class519.field7479 == null ? class160.field2296[class489.method2982(arg1.method2882(-1), 127) & 0xFFFF] : class519.field7479[arg1.method2882(-1)];
        int var12 = arg1.method2886(true);
        this.field2619 = var12 & 0x1F;
        this.field2626 = (var12 & 0xE0) << 3;
        if (this.field2619 != 31) {
            this.method1324(-15);
        }
        this.method1320(var4, var10, arg0, var5, var11, 1, var6);
    }
}
