import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class301 extends class303 {

    @OriginalMember(owner = "client!jg", name = "G", descriptor = "I")
    private int field4728 = 0;

    @OriginalMember(owner = "client!jg", name = "V", descriptor = "I")
    private int field4743 = 0;

    @OriginalMember(owner = "client!jg", name = "S", descriptor = "I")
    private int field4740 = 0;

    @OriginalMember(owner = "client!jg", name = "M", descriptor = "[Z")
    public static boolean[] field4734 = new boolean[100];

    @OriginalMember(owner = "client!jg", name = "Z", descriptor = "I")
    public static int field4747 = 0;

    @OriginalMember(owner = "client!jg", name = "H", descriptor = "I")
    private int field4729;

    @OriginalMember(owner = "client!jg", name = "I", descriptor = "I")
    public static int field4730;

    @OriginalMember(owner = "client!jg", name = "J", descriptor = "I")
    public static int field4731;

    @OriginalMember(owner = "client!jg", name = "K", descriptor = "I")
    private int field4732;

    @OriginalMember(owner = "client!jg", name = "L", descriptor = "I")
    public static int field4733;

    @OriginalMember(owner = "client!jg", name = "N", descriptor = "I")
    public static int field4735;

    @OriginalMember(owner = "client!jg", name = "O", descriptor = "I")
    public static int field4736;

    @OriginalMember(owner = "client!jg", name = "P", descriptor = "I")
    private int field4737;

    @OriginalMember(owner = "client!jg", name = "Q", descriptor = "I")
    public static int field4738;

    @OriginalMember(owner = "client!jg", name = "R", descriptor = "I")
    private int field4739;

    @OriginalMember(owner = "client!jg", name = "T", descriptor = "I")
    private int field4741;

    @OriginalMember(owner = "client!jg", name = "U", descriptor = "I")
    public static int field4742;

    @OriginalMember(owner = "client!jg", name = "W", descriptor = "I")
    public static int field4744;

    @OriginalMember(owner = "client!jg", name = "X", descriptor = "I")
    public static int field4745;

    @OriginalMember(owner = "client!jg", name = "Y", descriptor = "I")
    private int field4746;

    @OriginalMember(owner = "client!jg", name = "ab", descriptor = "I")
    public static int field4748;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIII)V", line = 7)
    private final void method2093(int arg0, int arg1, int arg2, int arg3) {
        field4731++;
        int var5 = arg2 <= 2048 ? (arg0 + 4096) * arg2 >> 12 : arg0 + arg2 - (arg0 * arg2 >> 12);
        if (arg1 != 9125) {
            this.method65(117, (class101) null, 105);
        }
        if (var5 <= 0) {
            this.field4746 = this.field4739 = this.field4729 = arg2;
            return;
        }
        int var6 = arg3 * 6;
        int var7 = arg2 + arg2 - var5;
        int var8 = (var5 - var7 << 12) / var5;
        int var9 = var6 >> 12;
        int var10 = var6 - (var9 << 12);
        int var12 = var8 * var5 >> 12;
        int var13 = var10 * var12 >> 12;
        int var14 = var7 + var13;
        int var15 = var5 - var13;
        if (var9 == 0) {
            this.field4739 = var14;
            this.field4746 = var5;
            this.field4729 = var7;
        } else if (var9 == 1) {
            this.field4739 = var5;
            this.field4729 = var7;
            this.field4746 = var15;
        } else if (var9 == 2) {
            this.field4739 = var5;
            this.field4729 = var14;
            this.field4746 = var7;
        } else if (var9 == 3) {
            this.field4739 = var15;
            this.field4729 = var5;
            this.field4746 = var7;
        } else if (var9 == 4) {
            this.field4746 = var14;
            this.field4739 = var7;
            this.field4729 = var5;
        } else if (var9 == 5) {
            this.field4739 = var7;
            this.field4729 = var15;
            this.field4746 = var5;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILpe;I)V", line = 114)
    public final void method65(int arg0, class101 arg1, int arg2) {
        field4730++;
        if (arg2 == 0) {
            this.field4740 = arg1.method780(-17432);
        } else if (arg2 == 1) {
            this.field4743 = (arg1.method727((byte) 119) << 12) / 100;
        } else if (arg2 == 2) {
            this.field4728 = (arg1.method727((byte) 122) << 12) / 100;
        }
        if (arg0 != -4004) {
            this.field4729 = -8;
        }
    }

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "(I)V", line = 162)
    public static final void method2094(int arg0) {
        field4735++;
        int var1 = class76.field1168;
        if (arg0 < 1) {
            field4747 = 38;
        }
        int var2 = class316.field4931;
        int var3 = class217.field3485;
        int var4 = 6116423;
        int var5 = class169.field2626;
        if (class265.field4126) {
            class262.method1855(var1, var2, var3, var5, var4);
            class262.method1855(var1 + 1, var2 - -1, var3 - 2, 16, 0);
            class262.method1854(var1 + 1, var2 + 18, var3 - 2, var5 + -19, 0);
        } else {
            class182.method1360(var1, var2, var3, var5, var4);
            class182.method1360(var1 + 1, var2 - -1, var3 - 2, 16, 0);
            class182.method1364(var1 + 1, var2 + 18, var3 - 2, var5 + -19, 0);
        }
        class95.field1558.method1029(class77.field1175, var1 + 3, var2 + 14, var4, -1);
        int var6 = class203.field3225;
        int var7 = class278.field4309;
        for (int var8 = 0; var8 < class65.field1062; var8++) {
            int var9 = var2 + ((class65.field1062 - var8 - 1) * 15) + 31;
            int var10 = 16777215;
            if (var6 > var1 && (var1 + var3) > var6 && (var9 - 13) < var7 && var9 + 3 > var7) {
                var10 = 16776960;
            }
            class95.field1558.method1029(class215.method1559(false, var8), var1 + 3, var9, var10, 0);
        }
        class270.method1948(class169.field2626, (byte) -105, class316.field4931, class76.field1168, class217.field3485);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(II)[[I", line = 221)
    public final int[][] method74(int arg0, int arg1) {
        field4738++;
        if (arg1 != 82) {
            method2094(38);
        }
        int[][] var3 = this.field4772.method1175(-99, arg0);
        if (this.field4772.field2488) {
            int[][] var4 = this.method2106(arg0, 0, 43);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[1];
            int[] var8 = var3[0];
            int[] var9 = var4[2];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class70.field1108; var11++) {
                this.method2099(var5[var11], var9[var11], var6[var11], true);
                this.field4741 += this.field4740;
                this.field4732 += this.field4728;
                while (this.field4741 < 0) {
                    this.field4741 += 4096;
                }
                if (this.field4732 < 0) {
                    this.field4732 = 0;
                }
                this.field4737 += this.field4743;
                while (this.field4741 > 4096) {
                    this.field4741 -= 4096;
                }
                if (this.field4737 < 0) {
                    this.field4737 = 0;
                }
                if (this.field4732 > 4096) {
                    this.field4732 = 4096;
                }
                if (this.field4737 > 4096) {
                    this.field4737 = 4096;
                }
                this.method2093(this.field4737, 9125, this.field4732, this.field4741);
                var8[var11] = this.field4746;
                var7[var11] = this.field4739;
                var10[var11] = this.field4729;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "(I)V", line = 293)
    public static final void method2095(int arg0) {
        field4736++;
        if (class143.field2256 == -1 || class96.field1581 == -1) {
            return;
        }
        int var1 = ((class115.field1883 - class92.field1523) * class65.field1060 >> 16) + class92.field1523;
        class65.field1060 += var1;
        if (class65.field1060 < 65535) {
            class123.field1968 = false;
            class151.field2418 = false;
        } else {
            if (class151.field2418) {
                class123.field1968 = false;
            } else {
                class123.field1968 = true;
            }
            class65.field1060 = 65535;
            class151.field2418 = true;
        }
        float[] var2 = new float[3];
        float var3 = (float) class65.field1060 / 65535.0F;
        int var4 = class95.field1564 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var6 = class195.field3109[class143.field2256][var4][var5] * 3;
            int var7 = class195.field3109[class143.field2256][var4 + 1][var5] * 3;
            int var8 = class195.field3109[class143.field2256][var4][var5];
            int var9 = var7 - var6;
            int var10 = (class195.field3109[class143.field2256][var4 + 2][var5] - (class195.field3109[class143.field2256][var4 + 3][var5] - class195.field3109[class143.field2256][var4 + 2][var5])) * 3;
            int var11 = class195.field3109[class143.field2256][var4 + 2][var5] + var7 - var8 - var10;
            int var12 = var6 - (var7 * 2 - var10);
            var2[var5] = (((float) var11 * var3 + (float) var12) * var3 + (float) var9) * var3 + (float) var8;
        }
        class140.field2223 = (int) var2[0] - (class177.field2780 * 128);
        class312.field4904 = (int) var2[2] - class91.field1485 * 128;
        class48.field801 = (int) var2[1] * -1;
        int var13 = class91.field1505 * 2;
        float[] var14 = new float[3];
        for (int var15 = 0; var15 < 3; var15++) {
            int var16 = class195.field3109[class96.field1581][var13][var15] * 3;
            int var17 = class195.field3109[class96.field1581][var13 + 1][var15] * 3;
            int var18 = class195.field3109[class96.field1581][var13][var15];
            int var19 = var17 - var16;
            int var20 = (class195.field3109[class96.field1581][var13 + 2][var15] + class195.field3109[class96.field1581][var13 + 2][var15] - class195.field3109[class96.field1581][var13 + 3][var15]) * 3;
            int var21 = var20 + var16 - (var17 * 2);
            int var22 = class195.field3109[class96.field1581][var13 + 2][var15] - var20 - (var18 - var17);
            var14[var15] = (((float) var22 * var3 + (float) var21) * var3 + (float) var19) * var3 + (float) var18;
        }
        float var23 = var14[0] - var2[0];
        float var24 = (var14[1] - var2[1]) * -1.0F;
        float var25 = var14[2] - var2[2];
        double var26 = Math.sqrt((double) (var23 * var23 + var25 * var25));
        if (arg0 == -26846) {
            class85.field1267 = (float) Math.atan2((double) var24, var26);
            class318.field4948 = -((float) Math.atan2((double) var23, (double) var25));
            class103.field1746 = (int) ((double) class318.field4948 * 325.949D) & 0x7FF;
            class181.field2891 = (int) ((double) class85.field1267 * 325.949D) & 0x7FF;
        }
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "()V", line = 398)
    public class301() {
        super(1, false);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lpe;B)Leh;", line = 410)
    public static final class169 method2096(class101 arg0, byte arg1) {
        if (arg1 != -25) {
            return (class169) null;
        }
        class169 var2 = new class169(arg0.method749((byte) -97), arg0.method749((byte) -89), arg0.method731(false), arg0.method731(false), arg0.method775(80), arg0.method741(arg1 ^ 0xFFFFFFBB) == 1, arg0.method741(arg1 + 68));
        int var3 = arg0.method741(15);
        for (int var4 = 0; var4 < var3; var4++) {
            var2.field2621.method1493(-127, new class168(arg0.method731(false), arg0.method731(false), arg0.method731(false), arg0.method731(false)));
        }
        var2.method1233(4477);
        field4733++;
        return var2;
    }

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "(I)V", line = 435)
    public static void method2097(int arg0) {
        if (arg0 == 1) {
            field4734 = null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "(I)Z", line = 452)
    public static final boolean method2098(int arg0) {
        field4748++;
        if (class280.field4332) {
            try {
                class49.method379(class83.field1235.field5052, (byte) 51, "showVideoAd");
                return true;
            } catch (Throwable var2) {
            }
        }
        if (arg0 != 20480) {
            method2094(-6);
        }
        return false;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIZ)V", line = 472)
    private final void method2099(int arg0, int arg1, int arg2, boolean arg3) {
        field4742++;
        if (!arg3) {
            method2100(109, -51, 18, 7, -105, -82, -53, 98, 110, 32);
        }
        int var5 = arg2 >= arg0 ? arg2 : arg0;
        int var6 = arg1 <= var5 ? var5 : arg1;
        int var7 = arg2 <= arg0 ? arg2 : arg0;
        int var8 = var7 > arg1 ? arg1 : var7;
        this.field4732 = (var6 + var8) / 2;
        int var9 = var6 - var8;
        if (this.field4732 > 0 && this.field4732 < 4096) {
            this.field4737 = (var9 << 12) / (this.field4732 > 2048 ? 8192 - (this.field4732 * 2) : this.field4732 * 2);
        } else {
            this.field4737 = 0;
        }
        if (var9 <= 0) {
            this.field4741 = 0;
            return;
        }
        int var10 = (var6 - arg2 << 12) / var9;
        int var11 = (var6 - arg1 << 12) / var9;
        int var12 = (var6 - arg0 << 12) / var9;
        if (arg0 == var6) {
            this.field4741 = arg2 == var8 ? var11 + 20480 : 4096 - var10;
        } else if (arg2 == var6) {
            this.field4741 = arg1 == var8 ? var12 + 4096 : 12288 - var11;
        } else {
            this.field4741 = arg0 == var8 ? var10 + 12288 : -var12 + 20480;
        }
        this.field4741 /= 6;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIIIIIIII)V", line = 537)
    public static final void method2100(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 == arg1 && arg3 == arg6 && arg4 == arg7 && arg2 == arg9) {
            class329.method2246(arg4, arg8, -1, arg1, arg9, arg6);
        } else {
            int var10 = arg1;
            int var11 = arg6 * 3;
            int var12 = arg3 * 3;
            int var13 = arg6;
            int var14 = arg0 * 3;
            int var15 = arg1 * 3;
            int var16 = arg7 * 3;
            int var17 = arg2 * 3;
            int var18 = arg4 - arg1 - (-var14 + var16);
            int var19 = arg9 + var12 - (var17 + arg6);
            int var20 = var16 + var15 - var14 - var14;
            int var21 = var11 + var17 - var12 - var12;
            int var22 = var12 - var11;
            int var23 = var14 - var15;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var22 * var24;
                int var31 = var21 * var25;
                int var32 = arg6 + (var30 + var31 + var28 >> 12);
                int var33 = var23 * var24;
                int var34 = (var29 + var33 + var27 >> 12) + arg1;
                class329.method2246(var34, arg8, -1, var10, var32, var13);
                var13 = var32;
                var10 = var34;
            }
        }
        if (arg5 <= 9) {
            method2097(-95);
        }
        field4745++;
    }
}
