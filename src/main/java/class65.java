import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gea")
public class class65 extends class466 {

    @OriginalMember(owner = "client!gea", name = "G", descriptor = "I")
    private int field1101 = 1024;

    @OriginalMember(owner = "client!gea", name = "H", descriptor = "I")
    private int field1102 = 3072;

    @OriginalMember(owner = "client!gea", name = "N", descriptor = "I")
    private int field1108 = 2048;

    @OriginalMember(owner = "client!gea", name = "K", descriptor = "Lvc;")
    public static class264 field1105 = new class264();

    @OriginalMember(owner = "client!gea", name = "O", descriptor = "[F")
    public static float[] field1109 = new float[4];

    @OriginalMember(owner = "client!gea", name = "P", descriptor = "Lh;")
    public static class571 field1110 = new class571(260);

    @OriginalMember(owner = "client!gea", name = "R", descriptor = "[I")
    public static int[] field1112 = new int[6];

    @OriginalMember(owner = "client!gea", name = "S", descriptor = "[S")
    public static short[] field1113 = new short[] { 46, 11, 6, 15, 20, 4, 17, 50 };

    @OriginalMember(owner = "client!gea", name = "E", descriptor = "I")
    public static int field1099;

    @OriginalMember(owner = "client!gea", name = "F", descriptor = "I")
    public static int field1100;

    @OriginalMember(owner = "client!gea", name = "I", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!gea", name = "J", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!gea", name = "L", descriptor = "I")
    public static int field1106;

    @OriginalMember(owner = "client!gea", name = "M", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!gea", name = "Q", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!gea", name = "c", descriptor = "(I)V")
    public final void method7(int arg0) {
        if (arg0 != -806066388) {
            field1112 = null;
        }
        ++field1104;
        this.field1108 = -this.field1101 + this.field1102;
    }

    @OriginalMember(owner = "client!gea", name = "b", descriptor = "(B)V")
    public static final void method545(byte arg0) {
        ++field1100;
        int var1 = class462.field6490 * 128 + 64;
        int var2 = class333.field4458 * 128 + 64;
        int var3 = class183.method1144(102, var1, var2, class206.field2901) - class214.field3027;
        if (~class157.field2329 <= -101) {
            class563.field7794 = class462.field6490 * 128 + 64;
            class462.field6488 = class333.field4458 * 128 + 64;
            class117.field1930 = class183.method1144(95, class563.field7794, class462.field6488, class206.field2901) - class214.field3027;
        } else {
            if (class563.field7794 < var1) {
                class563.field7794 += (-class563.field7794 + var1) * class157.field2329 / 1000 + class513.field7228;
                if (~var1 > ~class563.field7794) {
                    class563.field7794 = var1;
                }
            }
            if (class117.field1930 < var3) {
                class117.field1930 += (-class117.field1930 + var3) * class157.field2329 / 1000 + class513.field7228;
                if (~class117.field1930 < ~var3) {
                    class117.field1930 = var3;
                }
            }
            if (var1 < class563.field7794) {
                class563.field7794 -= (-var1 + class563.field7794) * class157.field2329 / 1000 + class513.field7228;
                if (class563.field7794 < var1) {
                    class563.field7794 = var1;
                }
            }
            if (~class462.field6488 > ~var2) {
                class462.field6488 += (-class462.field6488 + var2) * class157.field2329 / 1000 + class513.field7228;
                if (class462.field6488 > var2) {
                    class462.field6488 = var2;
                }
            }
            if (var3 < class117.field1930) {
                class117.field1930 -= (-var3 + class117.field1930) * class157.field2329 / 1000 + class513.field7228;
                if (class117.field1930 < var3) {
                    class117.field1930 = var3;
                }
            }
            if (~class462.field6488 < ~var2) {
                class462.field6488 -= (-var2 + class462.field6488) * class157.field2329 / 1000 + class513.field7228;
                if (~var2 < ~class462.field6488) {
                    class462.field6488 = var2;
                }
            }
        }
        int var4 = class87.field1384 * 128 + 64;
        int var5 = class124.field2019 * 128 + 64;
        int var6 = class183.method1144(98, var5, var4, class206.field2901) - class634.field9269;
        int var7 = -class563.field7794 + var5;
        int var8 = -class117.field1930 + var6;
        int var9 = -class462.field6488 + var4;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (2607.5945876176133D * Math.atan2((double) var8, (double) var10)) & 16383;
        int var12 = 16383 & (int) (Math.atan2((double) var7, (double) var9) * -2607.5945876176133D);
        if (~var11 > -1025) {
            var11 = 1024;
        }
        if (~var11 < -3073) {
            var11 = 3072;
        }
        if (~class160.field2349 > ~var11) {
            class160.field2349 += (-class160.field2349 + var11 >> 3) * class151.field2295 / 1000 + class23.field335 << 3;
            if (~class160.field2349 < ~var11) {
                class160.field2349 = var11;
            }
        }
        if (~var11 > ~class160.field2349) {
            class160.field2349 -= (-var11 + class160.field2349 >> 3) * class151.field2295 / 1000 + class23.field335 << 3;
            if (class160.field2349 < var11) {
                class160.field2349 = var11;
            }
        }
        int var13 = -class88.field1391 + var12;
        if (~var13 < -8193) {
            var13 -= 16384;
        }
        if (~var13 > 8191) {
            var13 += 16384;
        }
        int var14 = var13 >> 3;
        if (var14 > 0) {
            class88.field1391 += class151.field2295 * var14 / 1000 + class23.field335 << 3;
            class88.field1391 &= 16383;
        }
        if (~var14 > -1) {
            class88.field1391 -= -var14 * class151.field2295 / 1000 + class23.field335 << 3;
            class88.field1391 &= 16383;
        }
        int var15 = -class88.field1391 + var12;
        if (~var15 < -8193) {
            var15 -= 16384;
        }
        if (~var15 > 8191) {
            var15 += 16384;
        }
        if (var15 < 0 && ~var14 < -1 || var15 > 0 && ~var14 > -1) {
            class88.field1391 = var12;
        }
        class264.field3688 = 0;
        if (arg0 <= 26) {
            field1109 = null;
        }
    }

    @OriginalMember(owner = "client!gea", name = "<init>", descriptor = "()V")
    public class65() {
        super(1, false);
    }

    @OriginalMember(owner = "client!gea", name = "d", descriptor = "(I)V")
    public static void method546(int arg0) {
        if (arg0 != -32658) {
            method546(-95);
        }
        field1109 = null;
        field1112 = null;
        field1105 = null;
        field1110 = null;
        field1113 = null;
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(Ldaa;II)V")
    public final void method6(class11 arg0, int arg1, int arg2) {
        if (arg1 != -5062) {
            this.field1101 = -69;
        }
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    super.field6565 = ~arg0.method110((byte) 38) == -2;
                }
            } else {
                this.field1102 = arg0.method93((byte) 119);
            }
        } else {
            this.field1101 = arg0.method93((byte) 117);
        }
        ++field1103;
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "([Ljava/lang/String;Z)[Ljava/lang/String;")
    public static final String[] method547(String[] arg0, boolean arg1) {
        if (arg1) {
            method546(-49);
        }
        ++field1107;
        String[] var2 = new String[5];
        for (int var3 = 0; var3 < 5; ++var3) {
            var2[var3] = var3 + ": ";
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = var2[var3] + arg0[var3];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(II)[I")
    public final int[] method2(int arg0, int arg1) {
        ++field1099;
        int[] var3 = super.field6557.method565(arg0, -24728);
        if (arg1 != 0) {
            field1105 = null;
        }
        if (super.field6557.field1163) {
            int[] var4 = this.method2721(0, arg0, 2);
            for (int var5 = 0; ~class312.field4207 < ~var5; ++var5) {
                var3[var5] = this.field1101 - -(var4[var5] * this.field1108 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method33(int arg0, boolean arg1) {
        ++field1106;
        int[][] var3 = super.field6569.method828((byte) 127, arg0);
        if (arg1) {
            this.field1101 = 126;
        }
        if (super.field6569.field1934) {
            int[][] var4 = this.method2719(0, arg0, 5);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class312.field4207; ++var11) {
                var8[var11] = this.field1101 - -(var5[var11] * this.field1108 >> 12);
                var9[var11] = (var6[var11] * this.field1108 >> 12) + this.field1101;
                var10[var11] = (var7[var11] * this.field1108 >> 12) + this.field1101;
            }
        }
        return var3;
    }
}
