import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class193 extends class310 {

    @OriginalMember(owner = "client!sj", name = "O", descriptor = "I")
    public int field3071 = 4;

    @OriginalMember(owner = "client!sj", name = "T", descriptor = "I")
    public int field3076 = 4;

    @OriginalMember(owner = "client!sj", name = "Q", descriptor = "I")
    public int field3073 = 4;

    @OriginalMember(owner = "client!sj", name = "N", descriptor = "I")
    public int field3070 = 0;

    @OriginalMember(owner = "client!sj", name = "V", descriptor = "I")
    public int field3078 = 1638;

    @OriginalMember(owner = "client!sj", name = "bb", descriptor = "[B")
    private byte[] field3084 = new byte[512];

    @OriginalMember(owner = "client!sj", name = "cb", descriptor = "Z")
    public boolean field3085 = true;

    @OriginalMember(owner = "client!sj", name = "U", descriptor = "Ljava/lang/String;")
    public static String field3077 = "flash2:";

    @OriginalMember(owner = "client!sj", name = "Y", descriptor = "[Lwi;")
    public static class233[] field3081 = new class233[29];

    @OriginalMember(owner = "client!sj", name = "ab", descriptor = "Z")
    public static boolean field3083 = true;

    @OriginalMember(owner = "client!sj", name = "Z", descriptor = "Ljl;")
    public static class332 field3082 = new class332(64);

    @OriginalMember(owner = "client!sj", name = "K", descriptor = "I")
    public static int field3067;

    @OriginalMember(owner = "client!sj", name = "P", descriptor = "I")
    public static int field3072;

    @OriginalMember(owner = "client!sj", name = "S", descriptor = "I")
    public static int field3075;

    @OriginalMember(owner = "client!sj", name = "W", descriptor = "I")
    public static int field3079;

    @OriginalMember(owner = "client!sj", name = "X", descriptor = "I")
    public static int field3080;

    @OriginalMember(owner = "client!sj", name = "db", descriptor = "I")
    public static int field3086;

    @OriginalMember(owner = "client!sj", name = "R", descriptor = "Lvl;")
    public static class164 field3074;

    @OriginalMember(owner = "client!sj", name = "L", descriptor = "[S")
    private short[] field3068;

    @OriginalMember(owner = "client!sj", name = "M", descriptor = "[S")
    private short[] field3069;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIIZ)V", line = 7)
    public static final void method1498(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class273.field4526 = arg1;
        class162.field2574 = arg2;
        class172.field2740 = arg3;
        class159.field2532 = new class36[arg0][class273.field4526][class162.field2574];
        class208.field3270 = new int[arg0][class273.field4526 + 1][class162.field2574 + 1];
        if (class42.field607) {
            class307.field4899 = new class299[4][];
        }
        if (arg4) {
            class51.field799 = new class36[1][class273.field4526][class162.field2574];
            class128.field2168 = new int[class273.field4526][class162.field2574];
            class27.field332 = new int[1][class273.field4526 + 1][class162.field2574 + 1];
            if (class42.field607) {
                class90.field1545 = new class299[1][];
            }
        } else {
            class51.field799 = (class36[][][]) null;
            class128.field2168 = (int[][]) null;
            class27.field332 = (int[][][]) null;
            class90.field1545 = (class299[][]) null;
        }
        class298.method2132(false);
        class44.field687 = new class152[500];
        class103.field1674 = 0;
        class314.field5000 = new class152[500];
        class7.field63 = 0;
        class215.field3440 = new int[arg0][class273.field4526 + 1][class162.field2574 + 1];
        class335.field5299 = new class209[5000];
        class301.field4847 = 0;
        class270.field4501 = new class209[100];
        class166.field2653 = new boolean[class172.field2740 + class172.field2740 + 1][class172.field2740 + class172.field2740 + 1];
        class112.field1842 = new boolean[class172.field2740 + class172.field2740 + 2][class172.field2740 + class172.field2740 + 2];
        class187.field2999 = new byte[arg0][class273.field4526][class162.field2574];
    }

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "(I)V", line = 57)
    private final void method1499(int arg0) {
        if (this.field3078 > 0) {
            this.field3069 = new short[this.field3071];
            this.field3068 = new short[this.field3071];
            for (int var3 = 0; var3 < this.field3071; var3++) {
                this.field3068[var3] = (short) ((int) (Math.pow((double) ((float) this.field3078 / 4096.0F), (double) var3) * 4096.0D));
                this.field3069[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        } else if (this.field3068 != null && this.field3068.length == this.field3071) {
            this.field3069 = new short[this.field3071];
            for (int var2 = 0; var2 < this.field3071; var2++) {
                this.field3069[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        }
        if (arg0 != 2) {
            this.method75((class227) null, -25, -88);
        }
        field3075++;
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "()V", line = 534)
    public class193() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lqm;II)V", line = 122)
    public final void method75(class227 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field3085 = arg0.method1720((byte) -50) == 1;
        } else if (arg2 == 1) {
            this.field3071 = arg0.method1720((byte) -19);
        } else if (arg2 == 2) {
            this.field3078 = arg0.method1769(arg1 ^ 0x71A0);
            if (this.field3078 < 0) {
                this.field3068 = new short[this.field3071];
                for (int var5 = 0; var5 < this.field3071; var5++) {
                    this.field3068[var5] = (short) arg0.method1769(-30726);
                }
            }
        } else if (arg2 == 3) {
            this.field3073 = this.field3076 = arg0.method1720((byte) -19);
        } else if (arg2 == 4) {
            this.field3070 = arg0.method1720((byte) -90);
        } else if (arg2 == 5) {
            this.field3073 = arg0.method1720((byte) -47);
        } else if (arg2 == 6) {
            this.field3076 = arg0.method1720((byte) -102);
        }
        if (arg1 != -2470) {
            method1498(112, -62, 42, -105, true);
        }
        field3072++;
    }

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "(B)V", line = 198)
    public static void method1500(byte arg0) {
        field3082 = null;
        field3081 = null;
        field3077 = null;
        field3074 = null;
        int var1 = -126 % ((arg0 + 8) / 63);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIIIII)I", line = 211)
    private final int method1501(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3079++;
        int var8 = arg1 - 4096;
        int var9 = arg0 >> 12;
        int var10 = arg0 & 0xFFF;
        int var11 = var10 - 4096;
        int var12 = var9 + 1;
        int var13 = class20.field220[var10];
        if (arg3 <= var12) {
            var12 = 0;
        }
        int var14 = var9 & 0xFF;
        int var15 = this.field3084[arg2 + var14] & 0x3;
        int var16 = var12 & 0xFF;
        int var17;
        if (var15 > 1) {
            var17 = var15 == 2 ? var10 - arg1 : -arg1 + -var10;
        } else {
            var17 = var15 == 0 ? arg1 + var10 : -var10 + arg1;
        }
        int var18 = this.field3084[arg2 + var16] & 0x3;
        int var19;
        if (var18 <= 1) {
            var19 = var18 == 0 ? arg1 + var11 : -var11 + arg1;
        } else {
            var19 = var18 == 2 ? var11 - arg1 : -arg1 + -var11;
        }
        int var20 = var17 + ((var19 - var17) * var13 >> 12);
        int var21 = this.field3084[arg4 + var14] & 0x3;
        int var22;
        if (var21 > 1) {
            var22 = var21 == 2 ? var10 - var8 : -var10 - var8;
        } else {
            var22 = var21 == 0 ? var8 + var10 : -var10 + var8;
        }
        int var23 = this.field3084[var16 + arg4] & 0x3;
        int var24;
        if (var23 <= 1) {
            var24 = var23 == 0 ? var8 + var11 : -var11 + var8;
        } else {
            var24 = var23 == 2 ? var11 - var8 : -var8 + -var11;
        }
        int var25 = ((var24 - var22) * var13 >> 12) + var22;
        return arg5 == -40 ? ((var25 - var20) * arg6 >> 12) + var20 : 100;
    }

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "(B)V", line = 292)
    public final void method553(byte arg0) {
        this.field3084 = class66.method567((byte) 44, this.field3070);
        field3080++;
        this.method1499(2);
        if (arg0 > -82) {
            return;
        }
        for (int var2 = this.field3071 - 1; var2 >= 1; var2--) {
            short var3 = this.field3068[var2];
            if (var3 > 8 || var3 < -8) {
                break;
            }
            this.field3071--;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "([IIB)V", line = 328)
    public final void method1502(int[] arg0, int arg1, byte arg2) {
        field3086++;
        int var4 = class230.field3818[arg1] * this.field3076;
        if (arg2 != 123) {
            method1500((byte) -17);
        }
        if (this.field3071 == 1) {
            int var38 = this.field3069[0] << 12;
            int var39 = this.field3076 * var38 >> 12;
            short var40 = this.field3068[0];
            int var41 = this.field3073 * var38 >> 12;
            int var42 = var4 * var38 >> 12;
            int var43 = var42 >> 12;
            int var44 = var42 & 0xFFF;
            int var45 = class20.field220[var44];
            int var46 = this.field3084[var43 & 0xFF] & 0xFF;
            int var47 = var43 + 1;
            if (var39 <= var47) {
                var47 = 0;
            }
            int var48 = this.field3084[var47 & 0xFF] & 0xFF;
            if (this.field3085) {
                for (int var52 = 0; var52 < class261.field4405; var52++) {
                    int var53 = class293.field4737[var52] * this.field3073;
                    int var54 = this.method1501(var38 * var53 >> 12, var44, var46, var41, var48, arg2 ^ 0xFFFFFFA3, var45);
                    int var55 = var40 * var54 >> 12;
                    arg0[var52] = (var55 >> 1) + 2048;
                }
            } else {
                for (int var49 = 0; var49 < class261.field4405; var49++) {
                    int var50 = class293.field4737[var49] * this.field3073;
                    int var51 = this.method1501(var38 * var50 >> 12, var44, var46, var41, var48, -40, var45);
                    arg0[var49] = var40 * var51 >> 12;
                }
            }
            return;
        }
        short var5 = this.field3068[0];
        if (var5 > 8 || var5 < -8) {
            int var6 = this.field3069[0] << 12;
            int var7 = this.field3076 * var6 >> 12;
            int var8 = this.field3073 * var6 >> 12;
            int var9 = var4 * var6 >> 12;
            int var10 = var9 >> 12;
            int var11 = this.field3084[var10 & 0xFF] & 0xFF;
            int var12 = var9 & 0xFFF;
            int var13 = class20.field220[var12];
            int var14 = var10 + 1;
            if (var14 >= var7) {
                var14 = 0;
            }
            int var15 = this.field3084[var14 & 0xFF] & 0xFF;
            for (int var16 = 0; var16 < class261.field4405; var16++) {
                int var17 = class293.field4737[var16] * this.field3073;
                int var18 = this.method1501(var6 * var17 >> 12, var12, var11, var8, var15, arg2 - 163, var13);
                arg0[var16] = var5 * var18 >> 12;
            }
        }
        for (int var19 = 1; var19 < this.field3071; var19++) {
            short var20 = this.field3068[var19];
            if (var20 > 8 || var20 < -8) {
                int var21 = this.field3069[var19] << 12;
                int var22 = var4 * var21 >> 12;
                int var23 = this.field3073 * var21 >> 12;
                int var24 = var22 >> 12;
                int var25 = this.field3076 * var21 >> 12;
                int var26 = var22 & 0xFFF;
                int var27 = class20.field220[var26];
                int var28 = this.field3084[var24 & 0xFF] & 0xFF;
                int var29 = var24 + 1;
                if (var25 <= var29) {
                    var29 = 0;
                }
                int var30 = this.field3084[var29 & 0xFF] & 0xFF;
                if (this.field3085 && (this.field3071 - 1) == var19) {
                    for (int var31 = 0; var31 < class261.field4405; var31++) {
                        int var32 = class293.field4737[var31] * this.field3073;
                        int var33 = this.method1501(var21 * var32 >> 12, var26, var28, var23, var30, -40, var27);
                        int var34 = (var20 * var33 >> 12) + arg0[var31];
                        arg0[var31] = (var34 >> 1) + 2048;
                    }
                } else {
                    for (int var35 = 0; var35 < class261.field4405; var35++) {
                        int var36 = class293.field4737[var35] * this.field3073;
                        int var37 = this.method1501(var21 * var36 >> 12, var26, var28, var23, var30, -40, var27);
                        arg0[var35] += var20 * var37 >> 12;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(II)[I", line = 486)
    public final int[] method77(int arg0, int arg1) {
        field3067++;
        int[] var3 = this.field4950.method930(arg0, 0);
        if (this.field4950.field2001) {
            this.method1502(var3, arg0, (byte) 123);
        }
        return arg1 == -13093 ? var3 : (int[]) null;
    }
}
