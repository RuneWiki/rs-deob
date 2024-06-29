import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class217 extends class128 {

    @OriginalMember(owner = "client!bg", name = "J", descriptor = "Z")
    public boolean field3043 = true;

    @OriginalMember(owner = "client!bg", name = "M", descriptor = "I")
    public int field3046 = 4;

    @OriginalMember(owner = "client!bg", name = "R", descriptor = "I")
    public int field3051 = 4;

    @OriginalMember(owner = "client!bg", name = "P", descriptor = "I")
    public int field3049 = 1638;

    @OriginalMember(owner = "client!bg", name = "Q", descriptor = "I")
    public int field3050 = 0;

    @OriginalMember(owner = "client!bg", name = "W", descriptor = "I")
    public int field3056 = 4;

    @OriginalMember(owner = "client!bg", name = "L", descriptor = "[B")
    private byte[] field3045 = new byte[512];

    @OriginalMember(owner = "client!bg", name = "H", descriptor = "[Ljava/lang/String;")
    public static String[] field3041 = new String[100];

    @OriginalMember(owner = "client!bg", name = "I", descriptor = "[I")
    public static int[] field3042 = new int[] { 1, 1, 1, 1, 4, 1, 1, 5, 6, 1, 5, 0, 7, 0, 4, 1, 7, 2, 1, 1, 6, 1, 1, 3, 6, 1, 7, 0, 0, 6, 7, 0, 1, 7, 6, 1, 1, 1, 5, 4, 3, 2, 1, 1, 0, 4, 1, 5 };

    @OriginalMember(owner = "client!bg", name = "X", descriptor = "[I")
    public static int[] field3057 = new int[128];

    @OriginalMember(owner = "client!bg", name = "K", descriptor = "I")
    public static int field3044;

    @OriginalMember(owner = "client!bg", name = "N", descriptor = "I")
    public static int field3047;

    @OriginalMember(owner = "client!bg", name = "O", descriptor = "I")
    public static int field3048;

    @OriginalMember(owner = "client!bg", name = "S", descriptor = "I")
    public static int field3052;

    @OriginalMember(owner = "client!bg", name = "T", descriptor = "I")
    public static int field3053;

    @OriginalMember(owner = "client!bg", name = "V", descriptor = "I")
    public static int field3055;

    @OriginalMember(owner = "client!bg", name = "Y", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!bg", name = "Z", descriptor = "I")
    public static int field3059;

    @OriginalMember(owner = "client!bg", name = "U", descriptor = "[S")
    private short[] field3054;

    @OriginalMember(owner = "client!bg", name = "ab", descriptor = "[S")
    private short[] field3060;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(Z)V", line = 4)
    public static void method1496(boolean arg0) {
        field3042 = null;
        field3057 = null;
        if (!arg0) {
            method1501((byte) -47);
        }
        field3041 = null;
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "()V", line = 16)
    public class217() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 34)
    public static final boolean method1497(String arg0, int arg1) {
        field3058++;
        if (arg1 < 83) {
            method1497((String) null, -111);
        }
        return class142.method941(arg0, true, 10, (byte) 78);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIIIII)I", line = 54)
    private final int method1498(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3055++;
        int var8 = arg1 - 4096;
        int var9 = arg2 >> 12;
        int var10 = var9 + 1;
        if (arg0 != -8304) {
            method1496(false);
        }
        if (arg5 <= var10) {
            var10 = 0;
        }
        int var11 = arg2 & 0xFFF;
        int var12 = var9 & 0xFF;
        int var13 = var10 & 0xFF;
        int var14 = var11 - 4096;
        int var15 = class264.field4158[var11];
        int var16 = this.field3045[arg6 + var12] & 0x3;
        int var17;
        if (var16 <= 1) {
            var17 = var16 == 0 ? arg1 + var11 : -var11 + arg1;
        } else {
            var17 = var16 == 2 ? var11 - arg1 : -arg1 + -var11;
        }
        int var18 = this.field3045[var13 + arg6] & 0x3;
        int var19;
        if (var18 > 1) {
            var19 = var18 == 2 ? var14 - arg1 : -arg1 + -var14;
        } else {
            var19 = var18 == 0 ? arg1 + var14 : -var14 + arg1;
        }
        int var20 = this.field3045[var12 + arg3] & 0x3;
        int var21 = ((var19 - var17) * var15 >> 12) + var17;
        int var22;
        if (var20 > 1) {
            var22 = var20 == 2 ? var11 - var8 : -var8 + -var11;
        } else {
            var22 = var20 == 0 ? var8 + var11 : -var11 + var8;
        }
        int var23 = this.field3045[arg3 + var13] & 0x3;
        int var24;
        if (var23 <= 1) {
            var24 = var23 == 0 ? var14 + var8 : -var14 + var8;
        } else {
            var24 = var23 == 2 ? var14 - var8 : -var8 + -var14;
        }
        int var25 = var22 + ((var24 - var22) * var15 >> 12);
        return var21 + ((var25 - var21) * arg4 >> 12);
    }

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "(I)V", line = 131)
    private final void method1499(int arg0) {
        if (arg0 > -116) {
            this.method1498(102, -120, -93, 83, -122, 41, 92);
        }
        field3052++;
        if (this.field3049 > 0) {
            this.field3060 = new short[this.field3051];
            this.field3054 = new short[this.field3051];
            for (int var2 = 0; var2 < this.field3051; var2++) {
                this.field3060[var2] = (short) ((int) (Math.pow((double) ((float) this.field3049 / 4096.0F), (double) var2) * 4096.0D));
                this.field3054[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        } else if (this.field3060 != null && this.field3060.length == this.field3051) {
            this.field3054 = new short[this.field3051];
            for (int var3 = 0; var3 < this.field3051; var3++) {
                this.field3054[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I[II)V", line = 175)
    public final void method1500(int arg0, int[] arg1, int arg2) {
        if (arg2 < 81) {
            this.method1499(49);
        }
        field3044++;
        int var4 = class49.field600[arg0] * this.field3046;
        if (this.field3051 == 1) {
            short var5 = this.field3060[0];
            int var6 = this.field3054[0] << 12;
            int var7 = this.field3056 * var6 >> 12;
            int var8 = this.field3046 * var6 >> 12;
            int var9 = var4 * var6 >> 12;
            int var10 = var9 >> 12;
            int var11 = var10 + 1;
            if (var11 >= var8) {
                var11 = 0;
            }
            int var12 = this.field3045[var10 & 0xFF] & 0xFF;
            int var13 = this.field3045[var11 & 0xFF] & 0xFF;
            int var14 = var9 & 0xFFF;
            int var15 = class264.field4158[var14];
            if (this.field3043) {
                for (int var19 = 0; var19 < class10.field141; var19++) {
                    int var20 = class334.field5157[var19] * this.field3056;
                    int var21 = this.method1498(-8304, var14, var6 * var20 >> 12, var13, var15, var7, var12);
                    int var22 = var5 * var21 >> 12;
                    arg1[var19] = (var22 >> 1) + 2048;
                }
            } else {
                for (int var16 = 0; var16 < class10.field141; var16++) {
                    int var17 = class334.field5157[var16] * this.field3056;
                    int var18 = this.method1498(-8304, var14, var6 * var17 >> 12, var13, var15, var7, var12);
                    arg1[var16] = var5 * var18 >> 12;
                }
            }
            return;
        }
        short var23 = this.field3060[0];
        if (var23 > 8 || var23 < -8) {
            int var24 = this.field3054[0] << 12;
            int var25 = var4 * var24 >> 12;
            int var26 = this.field3056 * var24 >> 12;
            int var27 = var25 >> 12;
            int var28 = this.field3045[var27 & 0xFF] & 0xFF;
            int var29 = var27 + 1;
            int var30 = this.field3046 * var24 >> 12;
            int var31 = var25 & 0xFFF;
            int var32 = class264.field4158[var31];
            if (var30 <= var29) {
                var29 = 0;
            }
            int var33 = this.field3045[var29 & 0xFF] & 0xFF;
            for (int var34 = 0; var34 < class10.field141; var34++) {
                int var35 = class334.field5157[var34] * this.field3056;
                int var36 = this.method1498(-8304, var31, var24 * var35 >> 12, var33, var32, var26, var28);
                arg1[var34] = var23 * var36 >> 12;
            }
        }
        for (int var37 = 1; var37 < this.field3051; var37++) {
            short var38 = this.field3060[var37];
            if (var38 > 8 || var38 < -8) {
                int var39 = this.field3054[var37] << 12;
                int var40 = var4 * var39 >> 12;
                int var41 = var40 >> 12;
                int var42 = this.field3045[var41 & 0xFF] & 0xFF;
                int var43 = this.field3046 * var39 >> 12;
                int var44 = var40 & 0xFFF;
                int var45 = this.field3056 * var39 >> 12;
                int var46 = class264.field4158[var44];
                int var47 = var41 + 1;
                if (var47 >= var43) {
                    var47 = 0;
                }
                int var48 = this.field3045[var47 & 0xFF] & 0xFF;
                if (this.field3043 && this.field3051 - 1 == var37) {
                    for (int var49 = 0; var49 < class10.field141; var49++) {
                        int var50 = class334.field5157[var49] * this.field3056;
                        int var51 = this.method1498(-8304, var44, var39 * var50 >> 12, var48, var46, var45, var42);
                        int var52 = (var38 * var51 >> 12) + arg1[var49];
                        arg1[var49] = (var52 >> 1) + 2048;
                    }
                } else {
                    for (int var53 = 0; var53 < class10.field141; var53++) {
                        int var54 = class334.field5157[var53] * this.field3056;
                        int var55 = this.method1498(-8304, var44, var39 * var54 >> 12, var48, var46, var45, var42);
                        arg1[var53] += var38 * var55 >> 12;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(Z)V", line = 339)
    public final void method130(boolean arg0) {
        this.field3045 = class257.method1863((byte) -78, this.field3050);
        field3048++;
        this.method1499(-126);
        for (int var2 = this.field3051 - 1; var2 >= 1; var2--) {
            short var3 = this.field3060[var2];
            if (var3 > 8 || var3 < -8) {
                break;
            }
            this.field3051--;
        }
        if (arg0) {
            method1496(true);
        }
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(BI)[I", line = 373)
    public final int[] method126(byte arg0, int arg1) {
        field3053++;
        int[] var3 = this.field1748.method902(arg1, true);
        if (this.field1748.field1878) {
            this.method1500(arg1, var3, 123);
        }
        if (arg0 <= 100) {
            this.field3056 = -112;
        }
        return var3;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lp;II)V", line = 397)
    public final void method107(class107 arg0, int arg1, int arg2) {
        if (arg2 > -85) {
            this.method126((byte) -4, 6);
        }
        if (arg1 == 0) {
            this.field3043 = arg0.method661(-1) == 1;
        } else if (arg1 == 1) {
            this.field3051 = arg0.method661(-1);
        } else if (arg1 == 2) {
            this.field3049 = arg0.method656(102);
            if (this.field3049 < 0) {
                this.field3060 = new short[this.field3051];
                for (int var5 = 0; var5 < this.field3051; var5++) {
                    this.field3060[var5] = (short) arg0.method656(110);
                }
            }
        } else if (arg1 == 3) {
            this.field3056 = this.field3046 = arg0.method661(-1);
        } else if (arg1 == 4) {
            this.field3050 = arg0.method661(-1);
        } else if (arg1 == 5) {
            this.field3056 = arg0.method661(-1);
        } else if (arg1 == 6) {
            this.field3046 = arg0.method661(-1);
        }
        field3047++;
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(B)V", line = 490)
    public static final void method1501(byte arg0) {
        class298 var1 = (class298) class68.field895.method2331((byte) 114);
        int var2 = 37 / ((-arg0 - 58) / 60);
        while (var1 != null) {
            if (var1.field4634) {
                var1.method2107(12295);
            }
            var1 = (class298) class68.field895.method2332(-81);
        }
        field3059++;
        for (class298 var3 = (class298) class299.field4667.method2331((byte) 28); var3 != null; var3 = (class298) class299.field4667.method2332(-122)) {
            if (var3.field4634) {
                var3.method2107(12295);
            }
        }
    }
}
