import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class215 extends class46 {

    @OriginalMember(owner = "client!ua", name = "D", descriptor = "Z")
    public boolean field3919 = false;

    @OriginalMember(owner = "client!ua", name = "T", descriptor = "Ll;")
    private class119 field3935;

    @OriginalMember(owner = "client!ua", name = "K", descriptor = "Z")
    public boolean field3926;

    @OriginalMember(owner = "client!ua", name = "O", descriptor = "Z")
    public boolean field3930;

    @OriginalMember(owner = "client!ua", name = "W", descriptor = "I")
    public int field3938;

    @OriginalMember(owner = "client!ua", name = "z", descriptor = "Z")
    private boolean field3915;

    @OriginalMember(owner = "client!ua", name = "V", descriptor = "Z")
    private boolean field3937;

    @OriginalMember(owner = "client!ua", name = "X", descriptor = "I")
    public int field3939;

    @OriginalMember(owner = "client!ua", name = "H", descriptor = "I")
    private int field3923;

    @OriginalMember(owner = "client!ua", name = "M", descriptor = "I")
    private int field3928;

    @OriginalMember(owner = "client!ua", name = "J", descriptor = "I")
    private int field3925;

    @OriginalMember(owner = "client!ua", name = "L", descriptor = "Lmb;")
    private static class132 field3927 = class166.method1092("Password: ", 121);

    @OriginalMember(owner = "client!ua", name = "P", descriptor = "Lmb;")
    public static class132 field3931 = field3927;

    @OriginalMember(owner = "client!ua", name = "C", descriptor = "F")
    private float field3918;

    @OriginalMember(owner = "client!ua", name = "A", descriptor = "I")
    public static int field3916;

    @OriginalMember(owner = "client!ua", name = "E", descriptor = "I")
    public static int field3920;

    @OriginalMember(owner = "client!ua", name = "F", descriptor = "I")
    public static int field3921;

    @OriginalMember(owner = "client!ua", name = "G", descriptor = "I")
    public static int field3922;

    @OriginalMember(owner = "client!ua", name = "N", descriptor = "I")
    public static int field3929;

    @OriginalMember(owner = "client!ua", name = "Q", descriptor = "I")
    public static int field3932;

    @OriginalMember(owner = "client!ua", name = "R", descriptor = "I")
    public static int field3933;

    @OriginalMember(owner = "client!ua", name = "S", descriptor = "I")
    public static int field3934;

    @OriginalMember(owner = "client!ua", name = "U", descriptor = "I")
    public static int field3936;

    @OriginalMember(owner = "client!ua", name = "Y", descriptor = "Loc;")
    public static class155 field3940;

    @OriginalMember(owner = "client!ua", name = "B", descriptor = "[I")
    public static int[] field3917;

    @OriginalMember(owner = "client!ua", name = "I", descriptor = "[I")
    private int[] field3924;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(II)V")
    public final void method1338(int arg0, int arg1) {
        if (arg1 != 21168) {
            this.field3925 = -123;
        }
        field3920++;
        if (this.field3924 == null || this.field3925 == 0 && this.field3928 == 0) {
            return;
        }
        if (class138.field2588 == null || class138.field2588.length < this.field3924.length) {
            class138.field2588 = new int[this.field3924.length];
        }
        int var3 = this.field3924.length;
        int var4 = this.field3924.length == 4096 ? 64 : 128;
        int var5 = this.field3928 * arg0;
        int var6 = var4 - 1;
        int var7 = var3 - 1;
        int var8 = arg0 * var4 * this.field3925;
        for (int var9 = 0; var9 < var3; var9 += var4) {
            int var11 = var7 & var8 + var9;
            for (int var12 = 0; var12 < var4; var12++) {
                int var13 = var11 + (var6 & var5 + var12);
                int var14 = var9 + var12;
                class138.field2588[var14] = this.field3924[var13];
            }
        }
        int[] var10 = this.field3924;
        this.field3924 = class138.field2588;
        class138.field2588 = var10;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILhb;Lpb;I)[I")
    public final int[] method1339(int arg0, class79 arg1, class165 arg2, int arg3) {
        field3916++;
        if (!this.field3935.method792(arg1, (byte) 62, arg2)) {
            return null;
        }
        int var5 = arg0 >= this.field3938 ? this.field3938 : arg0;
        if (arg3 != -32032) {
            field3931 = null;
        }
        return this.field3935.method791(var5, 1.0D, var5, this.field3915, arg1, arg2, (byte) -9, false);
    }

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "(B)V")
    public static final void method1340(byte arg0) {
        field3933++;
        int var1 = class52.field887;
        int var2 = class25.field407;
        int var3 = class172.field3208;
        int var4 = class160.field2913;
        int var5 = 6116423;
        class239.method1525(var1, var2, var3, var4, var5);
        class239.method1525(var1 + 1, var2 + 1, var3 - 2, 16, 0);
        class239.method1528(var1 + 1, var2 - -18, var3 - 2, var4 + -19, 0);
        class53.field895.method670(class155.field2843, var1 + 3, var2 + 14, var5, -1);
        int var6 = class181.field3329;
        int var7 = -111 % ((54 - arg0) / 55);
        int var8 = class36.field584;
        for (int var9 = 0; var9 < class57.field974; var9++) {
            int var10 = 16777215;
            int var11 = (class57.field974 - var9 - 1) * 15 + var2 + 31;
            if (var6 > var1 && var6 < var1 + var3 && var11 - 13 < var8 && var11 + 3 > var8) {
                var10 = 16776960;
            }
            class53.field895.method670(class127.method834(var9, false), var1 + 3, var11, var10, 0);
        }
        class103.method639(class52.field887, class172.field3208, class160.field2913, class25.field407, true);
    }

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "(B)V")
    public static void method1341(byte arg0) {
        field3940 = null;
        int var1 = 47 % ((-arg0 - 59) / 62);
        field3931 = null;
        field3927 = null;
        field3917 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIIII)V")
    public static final void method1342(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3934++;
        int var6 = 0;
        int var7 = arg1;
        int var8 = arg3 * arg3;
        int var9 = arg1 * arg1;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = var8 << 2;
        int var13 = var9 << 2;
        int var14 = ((arg1 << 1) - 3) * var11;
        int var15 = ((var6 << 1) + 3) * var10;
        int var16 = arg1 << 1;
        int var17 = (var6 + 1) * var13;
        int var18 = (1 - var16) * var8 + var10;
        int var19 = var9 - (var16 - 1) * var11;
        if (class169.field3161 <= arg2 && arg2 <= class17.field254) {
            int var20 = class159.method1034(arg4 + arg3, (byte) 85, class135.field2542, class168.field3083);
            int var21 = class159.method1034(arg4 - arg3, (byte) 110, class135.field2542, class168.field3083);
            class23.method153(arg5, class61.field1033[arg2], true, var21, var20);
        }
        int var22 = (arg1 - 1) * var12;
        while (var7 > 0) {
            if (var18 < 0) {
                while (var18 < 0) {
                    var18 += var15;
                    var15 += var13;
                    var6++;
                    var19 += var17;
                    var17 += var13;
                }
            }
            if (var19 < 0) {
                var6++;
                var19 += var17;
                var17 += var13;
                var18 += var15;
                var15 += var13;
            }
            var19 += -var14;
            var18 += -var22;
            var7--;
            var22 -= var12;
            var14 -= var12;
            int var24 = arg2 - var7;
            int var25 = arg2 + var7;
            if (var25 >= class169.field3161 && var24 <= class17.field254) {
                int var26 = class159.method1034(arg4 + var6, (byte) 95, class135.field2542, class168.field3083);
                int var27 = class159.method1034(arg4 - var6, (byte) 83, class135.field2542, class168.field3083);
                if (class169.field3161 <= var24) {
                    class23.method153(arg5, class61.field1033[var24], true, var27, var26);
                }
                if (var25 <= class17.field254) {
                    class23.method153(arg5, class61.field1033[var25], true, var27, var26);
                }
            }
        }
        int var23 = 55 % ((arg0 + 67) / 53);
    }

    @OriginalMember(owner = "client!ua", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        super.finalize();
        field3932++;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lhb;FIILpb;)[I")
    public final int[] method1343(class79 arg0, float arg1, int arg2, int arg3, class165 arg4) {
        if (arg2 != 5069) {
            this.field3937 = true;
        }
        field3921++;
        if (this.field3924 == null || this.field3918 != arg1) {
            if (!this.field3935.method792(arg0, (byte) 62, arg4)) {
                return null;
            }
            int var6 = this.field3938 <= arg3 ? this.field3938 : arg3;
            this.field3924 = this.field3935.method791(var6, (double) arg1, var6, this.field3915, arg0, arg4, (byte) -9, true);
            this.field3918 = arg1;
            if (this.field3937) {
                int[] var7 = new int[var6];
                int[] var8 = new int[var6];
                int[] var9 = new int[var6];
                int[] var10 = new int[var6 * var6];
                int var11 = var6;
                int var12 = var6 - 1;
                int var14 = var6;
                int var15 = var6;
                int var16 = var6 - 1;
                int var17 = var6 * var6;
                for (int var18 = 2; var18 >= 0; var18--) {
                    for (int var34 = var12; var34 >= 0; var34--) {
                        var14--;
                        int var35 = this.field3924[var14];
                        var7[var34] += class75.method450(16756394, var35) >> 16;
                        var8[var34] += class75.method450(var35, 65446) >> 8;
                        var9[var34] += class75.method450(var35, 255);
                    }
                    if (var14 == 0) {
                        var14 = var17;
                    }
                }
                int var19 = var17;
                for (int var20 = var16; var20 >= 0; var20--) {
                    int var21 = 1;
                    int var22 = 1;
                    int var23 = 0;
                    int var24 = 0;
                    int var25 = 0;
                    for (int var26 = 2; var26 >= 0; var26--) {
                        var21--;
                        var23 += var8[var21];
                        var25 += var7[var21];
                        var24 += var9[var21];
                        if (var21 == 0) {
                            var21 = var11;
                        }
                    }
                    for (int var27 = var12; var27 >= 0; var27--) {
                        var22--;
                        int var31 = var25 / 9;
                        int var32 = var23 / 9;
                        var21--;
                        int var33 = var24 / 9;
                        var19--;
                        var10[var19] = class219.method1368(class219.method1368(var31 << 16, var32 << 8), var33);
                        var25 += var7[var21] - var7[var22];
                        var23 += var8[var21] - var8[var22];
                        var24 += var9[var21] - var9[var22];
                        if (var21 == 0) {
                            var21 = var11;
                        }
                        if (var22 == 0) {
                            var22 = var11;
                        }
                    }
                    for (int var28 = var12; var28 >= 0; var28--) {
                        var15--;
                        int var29 = this.field3924[var15];
                        var14--;
                        int var30 = this.field3924[var14];
                        var7[var28] += class75.method450(255, var30 >> 16) - (class75.method450(var29, 16717629) >> 16);
                        var8[var28] += -(class75.method450(65291, var29) >> 8) + (class75.method450(var30, 65328) >> 8);
                        var9[var28] += -class75.method450(var29, 255) + class75.method450(var30, 255);
                    }
                    if (var15 == 0) {
                        var15 = var17;
                    }
                    if (var14 == 0) {
                        var14 = var17;
                    }
                }
                this.field3924 = var10;
            }
        }
        return this.field3924;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lpb;BLhb;)Z")
    public final boolean method1344(class165 arg0, byte arg1, class79 arg2) {
        field3922++;
        if (arg1 != 43) {
            method1341((byte) 122);
        }
        return this.field3935.method792(arg2, (byte) 62, arg0);
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Lkd;)V")
    public class215(class112 arg0) {
        this.field3935 = new class119(arg0);
        int var2 = arg0.method716(-1308);
        this.field3926 = (var2 & 0x2) != 0;
        this.field3930 = (var2 & 0x1) != 0;
        int var3 = arg0.method716(-1308);
        this.field3938 = 0x1 << (var3 & 0x7) + 1;
        int var4 = var2 >> 3 & 0x3;
        this.field3915 = (var3 & 0x80) != 0;
        this.field3937 = (var3 & 0x8) != 0;
        this.field3939 = arg0.method739(20);
        this.field3923 = arg0.method716(-1308);
        if (this.field3923 == 255) {
            this.field3923 = 256;
        }
        this.field3928 = arg0.method734(true);
        this.field3925 = arg0.method734(true);
        arg0.method716(-1308);
        arg0.method716(-1308);
        arg0.method716(-1308);
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V")
    public class215() {
        this.field3935 = new class119();
        this.field3930 = true;
        this.field3938 = 64;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)V")
    public static final void method1345(boolean arg0) {
        field3936++;
        for (class226 var1 = (class226) class84.field1462.method119(arg0); var1 != null; var1 = (class226) class84.field1462.method125((byte) -85)) {
            if (var1.field4083 > 0) {
                var1.field4083--;
            }
            if (var1.field4083 != 0) {
                if (var1.field4093 > 0) {
                    var1.field4093--;
                }
                if (var1.field4093 == 0 && var1.field4102 >= 1 && var1.field4094 >= 1 && var1.field4102 <= 102 && var1.field4094 <= 102 && (var1.field4084 < 0 || class63.method402(var1.field4084, (byte) 110, var1.field4091))) {
                    class81.method499(var1.field4094, (byte) -16, var1.field4088, var1.field4091, var1.field4097, var1.field4084, var1.field4102, var1.field4099);
                    var1.field4093 = -1;
                    if (var1.field4089 == var1.field4084 && var1.field4089 == -1) {
                        var1.method995((byte) -47);
                    } else if (var1.field4089 == var1.field4084 && var1.field4097 == var1.field4095 && var1.field4091 == var1.field4087) {
                        var1.method995((byte) -113);
                    }
                }
            } else if (var1.field4089 < 0 || class63.method402(var1.field4089, (byte) 110, var1.field4087)) {
                class81.method499(var1.field4094, (byte) -16, var1.field4088, var1.field4087, var1.field4095, var1.field4089, var1.field4102, var1.field4099);
                var1.method995((byte) -19);
            }
        }
    }
}
