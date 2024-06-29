import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class262 extends class59 {

    @OriginalMember(owner = "client!oj", name = "N", descriptor = "I")
    public int field4371 = 4;

    @OriginalMember(owner = "client!oj", name = "T", descriptor = "I")
    public int field4377 = 1638;

    @OriginalMember(owner = "client!oj", name = "U", descriptor = "I")
    public int field4378 = 4;

    @OriginalMember(owner = "client!oj", name = "X", descriptor = "I")
    public int field4381 = 4;

    @OriginalMember(owner = "client!oj", name = "cb", descriptor = "I")
    public int field4386 = 0;

    @OriginalMember(owner = "client!oj", name = "fb", descriptor = "Z")
    public boolean field4389 = true;

    @OriginalMember(owner = "client!oj", name = "L", descriptor = "[B")
    private byte[] field4369 = new byte[512];

    @OriginalMember(owner = "client!oj", name = "ab", descriptor = "Lph;")
    public static class229 field4384 = class266.method1858(" )2> <col=00ffff>", 0);

    @OriginalMember(owner = "client!oj", name = "Y", descriptor = "Lph;")
    public static class229 field4382 = class266.method1858("::errortest", 0);

    @OriginalMember(owner = "client!oj", name = "O", descriptor = "I")
    public static int field4372 = 20;

    @OriginalMember(owner = "client!oj", name = "db", descriptor = "I")
    public static int field4387 = 0;

    @OriginalMember(owner = "client!oj", name = "W", descriptor = "I")
    public static int field4380 = -1;

    @OriginalMember(owner = "client!oj", name = "bb", descriptor = "Lph;")
    public static class229 field4385 = class266.method1858("Veuillez patienter )2 tentative de r-Btablissement)3", 0);

    @OriginalMember(owner = "client!oj", name = "S", descriptor = "[I")
    public static int[] field4376 = new int[50];

    @OriginalMember(owner = "client!oj", name = "J", descriptor = "I")
    public static int field4367;

    @OriginalMember(owner = "client!oj", name = "K", descriptor = "I")
    public static int field4368;

    @OriginalMember(owner = "client!oj", name = "M", descriptor = "I")
    public static int field4370;

    @OriginalMember(owner = "client!oj", name = "P", descriptor = "I")
    public static int field4373;

    @OriginalMember(owner = "client!oj", name = "Q", descriptor = "I")
    public static int field4374;

    @OriginalMember(owner = "client!oj", name = "R", descriptor = "I")
    public static int field4375;

    @OriginalMember(owner = "client!oj", name = "V", descriptor = "I")
    public static int field4379;

    @OriginalMember(owner = "client!oj", name = "eb", descriptor = "I")
    public static int field4388;

    @OriginalMember(owner = "client!oj", name = "I", descriptor = "[S")
    private short[] field4366;

    @OriginalMember(owner = "client!oj", name = "Z", descriptor = "[S")
    private short[] field4383;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIII)V", line = 6)
    public static final void method1820(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = -75 % ((-arg2 - 29) / 52);
        class61.field870 = -1;
        field4388++;
        class103.field1767 = class50.field716 * arg4 / arg1;
        class205.field3380 = -1;
        class324.field5534 = class214.field3537 * arg3 / arg0;
        class248.method1742((byte) -123);
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(B)V", line = 23)
    private final void method1821(byte arg0) {
        if (arg0 != -114) {
            method1820(-16, -87, -125, 97, -27);
        }
        if (this.field4377 > 0) {
            this.field4383 = new short[this.field4371];
            this.field4366 = new short[this.field4371];
            for (int var2 = 0; var2 < this.field4371; var2++) {
                this.field4383[var2] = (short) ((int) (Math.pow((double) ((float) this.field4377 / 4096.0F), (double) var2) * 4096.0D));
                this.field4366[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        } else if (this.field4383 != null && this.field4383.length == this.field4371) {
            this.field4366 = new short[this.field4371];
            for (int var3 = 0; var3 < this.field4371; var3++) {
                this.field4366[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        field4379++;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Z)V", line = 65)
    public static void method1822(boolean arg0) {
        if (!arg0) {
            field4384 = null;
            field4385 = null;
            field4376 = null;
            field4382 = null;
        }
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "()V", line = 944)
    public class262() {
        super(0, true);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ZI)[I", line = 84)
    public final int[] method63(boolean arg0, int arg1) {
        if (!arg0) {
            method1823(2, 74, 55, -119, -89, 74, 5, true, 39, -27, 58, 76);
        }
        field4373++;
        int[] var3 = this.field846.method383(3583, arg1);
        if (this.field846.field811) {
            this.method1826((byte) -121, var3, arg1);
        }
        return var3;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(BILhb;)V", line = 114)
    public final void method67(byte arg0, int arg1, class164 arg2) {
        field4370++;
        if (arg1 == 0) {
            this.field4389 = arg2.method1178(arg0 - 107) == 1;
        } else if (arg1 == 1) {
            this.field4371 = arg2.method1178(8);
        } else if (arg1 == 2) {
            this.field4377 = arg2.method1179((byte) -74);
            if (this.field4377 < 0) {
                this.field4383 = new short[this.field4371];
                for (int var5 = 0; var5 < this.field4371; var5++) {
                    this.field4383[var5] = (short) arg2.method1179((byte) -74);
                }
            }
        } else if (arg1 == 3) {
            this.field4381 = this.field4378 = arg2.method1178(arg0 - 107);
        } else if (arg1 == 4) {
            this.field4386 = arg2.method1178(8);
        } else if (arg1 == 5) {
            this.field4381 = arg2.method1178(arg0 - 107);
        } else if (arg1 == 6) {
            this.field4378 = arg2.method1178(8);
        }
        if (arg0 != 115) {
            method1820(74, -40, 106, -80, 119);
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIIIIIZIIII)Z", line = 211)
    public static final boolean method1823(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var13 = 0; var13 < 104; var13++) {
                class312.field5259[var12][var13] = 0;
                class177.field2926[var12][var13] = 99999999;
            }
        }
        class312.field5259[arg8][arg1] = 99;
        int var14 = arg8;
        int var15 = arg1;
        byte var16 = 0;
        field4375++;
        int var17 = 0;
        boolean var18 = false;
        class177.field2926[arg8][arg1] = 0;
        class1.field33[var16] = arg8;
        int var32 = var16 + 1;
        class311.field5215[var16] = arg1;
        int[][] var19 = class160.field2592[class298.field4849].field1828;
        while (var32 != var17) {
            var15 = class311.field5215[var17];
            var14 = class1.field33[var17];
            var17 = var17 + 1 & 0xFFF;
            if (arg6 == var14 && arg11 == var15) {
                var18 = true;
                break;
            }
            if (arg3 != 0) {
                if ((arg3 < 5 || arg3 == 10) && class160.field2592[class298.field4849].method817(2, arg2, arg11, 0, arg6, var15, var14, arg3 - 1)) {
                    var18 = true;
                    break;
                }
                if (arg3 < 10 && class160.field2592[class298.field4849].method830(arg11, 85, var15, var14, 2, arg3 - 1, arg2, arg6)) {
                    var18 = true;
                    break;
                }
            }
            if (arg9 != 0 && arg10 != 0 && class160.field2592[class298.field4849].method815(2, var14, arg10, var15, 30, arg9, arg0, arg11, arg6)) {
                var18 = true;
                break;
            }
            int var20 = class177.field2926[var14][var15] + 1;
            if (var14 > 0 && class312.field5259[var14 - 1][var15] == 0 && (var19[var14 - 1][var15] & 0x12C010E) == 0 && (var19[var14 - 1][var15 + 1] & 0x12C0138) == 0) {
                class1.field33[var32] = var14 - 1;
                class311.field5215[var32] = var15;
                var32 = var32 + 1 & 0xFFF;
                class312.field5259[var14 - 1][var15] = 2;
                class177.field2926[var14 - 1][var15] = var20;
            }
            if (var14 < 102 && class312.field5259[var14 + 1][var15] == 0 && (var19[var14 + 2][var15] & 0x12C0183) == 0 && (var19[var14 + 2][var15 + 1] & 0x12C01E0) == 0) {
                class1.field33[var32] = var14 + 1;
                class311.field5215[var32] = var15;
                var32 = var32 + 1 & 0xFFF;
                class312.field5259[var14 + 1][var15] = 8;
                class177.field2926[var14 + 1][var15] = var20;
            }
            if (var15 > 0 && class312.field5259[var14][var15 - 1] == 0 && (var19[var14][var15 - 1] & 0x12C010E) == 0 && (var19[var14 + 1][var15 - 1] & 0x12C0183) == 0) {
                class1.field33[var32] = var14;
                class311.field5215[var32] = var15 - 1;
                var32 = var32 + 1 & 0xFFF;
                class312.field5259[var14][var15 - 1] = 1;
                class177.field2926[var14][var15 - 1] = var20;
            }
            if (var15 < 102 && class312.field5259[var14][var15 + 1] == 0 && (var19[var14][var15 + 2] & 0x12C0138) == 0 && (var19[var14 + 1][var15 + 2] & 0x12C01E0) == 0) {
                class1.field33[var32] = var14;
                class311.field5215[var32] = var15 + 1;
                var32 = var32 + 1 & 0xFFF;
                class312.field5259[var14][var15 + 1] = 4;
                class177.field2926[var14][var15 + 1] = var20;
            }
            if (var14 > 0 && var15 > 0 && class312.field5259[var14 - 1][var15 - 1] == 0 && (var19[var14 - 1][var15] & 0x12C0138) == 0 && (var19[var14 - 1][var15 - 1] & 0x12C010E) == 0 && (var19[var14][var15 - 1] & 0x12C0183) == 0) {
                class1.field33[var32] = var14 - 1;
                class311.field5215[var32] = var15 - 1;
                var32 = var32 + 1 & 0xFFF;
                class312.field5259[var14 - 1][var15 - 1] = 3;
                class177.field2926[var14 - 1][var15 - 1] = var20;
            }
            if (var14 < 102 && var15 > 0 && class312.field5259[var14 + 1][var15 - 1] == 0 && (var19[var14 + 1][var15 - 1] & 0x12C010E) == 0 && (var19[var14 + 2][var15 - 1] & 0x12C0183) == 0 && (var19[var14 + 2][var15] & 0x12C01E0) == 0) {
                class1.field33[var32] = var14 + 1;
                class311.field5215[var32] = var15 - 1;
                class312.field5259[var14 + 1][var15 - 1] = 9;
                class177.field2926[var14 + 1][var15 - 1] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var14 > 0 && var15 < 102 && class312.field5259[var14 - 1][var15 + 1] == 0 && (var19[var14 - 1][var15 + 1] & 0x12C010E) == 0 && (var19[var14 - 1][var15 + 2] & 0x12C0138) == 0 && (var19[var14][var15 + 2] & 0x12C01E0) == 0) {
                class1.field33[var32] = var14 - 1;
                class311.field5215[var32] = var15 + 1;
                var32 = var32 + 1 & 0xFFF;
                class312.field5259[var14 - 1][var15 + 1] = 6;
                class177.field2926[var14 - 1][var15 + 1] = var20;
            }
            if (var14 < 102 && var15 < 102 && class312.field5259[var14 + 1][var15 + 1] == 0 && (var19[var14 + 1][var15 + 2] & 0x12C0138) == 0 && (var19[var14 + 2][var15 + 2] & 0x12C01E0) == 0 && (var19[var14 + 2][var15 + 1] & 0x12C0183) == 0) {
                class1.field33[var32] = var14 + 1;
                class311.field5215[var32] = var15 + 1;
                class312.field5259[var14 + 1][var15 + 1] = 12;
                class177.field2926[var14 + 1][var15 + 1] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
        }
        class228.field3746 = 0;
        if (!var18) {
            if (!arg7) {
                return false;
            }
            int var21 = 1000;
            int var22 = 100;
            byte var23 = 10;
            for (int var24 = arg6 - var23; var24 <= arg6 + var23; var24++) {
                for (int var25 = arg11 - var23; var25 <= arg11 + var23; var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && class177.field2926[var24][var25] < 100) {
                        int var26 = 0;
                        if (var24 < arg6) {
                            var26 = arg6 - var24;
                        } else if (arg6 + arg9 - 1 < var24) {
                            var26 = var24 + 1 - arg6 - arg9;
                        }
                        int var27 = 0;
                        if (arg11 > var25) {
                            var27 = arg11 - var25;
                        } else if (var25 > arg11 - (1 - arg10)) {
                            var27 = var25 - (arg10 + arg11 - 1);
                        }
                        int var28 = var26 * var26 + var27 * var27;
                        if (var21 > var28 || var21 == var28 && class177.field2926[var24][var25] < var22) {
                            var14 = var24;
                            var22 = class177.field2926[var24][var25];
                            var15 = var25;
                            var21 = var28;
                        }
                    }
                }
            }
            if (var21 == 1000) {
                return false;
            }
            if (arg8 == var14 && arg1 == var15) {
                return false;
            }
            class228.field3746 = 1;
        }
        if (arg5 <= 101) {
            method1823(-30, 5, 18, 109, -3, -47, 103, true, 63, -91, -32, -127);
        }
        byte var29 = 0;
        class1.field33[var29] = var14;
        int var33 = var29 + 1;
        class311.field5215[var29] = var15;
        int var30;
        int var31 = var30 = class312.field5259[var14][var15];
        while (arg8 != var14 || arg1 != var15) {
            if (var30 != var31) {
                var30 = var31;
                class1.field33[var33] = var14;
                class311.field5215[var33++] = var15;
            }
            if ((var31 & 0x2) != 0) {
                var14++;
            } else if ((var31 & 0x8) != 0) {
                var14--;
            }
            if ((var31 & 0x1) != 0) {
                var15++;
            } else if ((var31 & 0x4) != 0) {
                var15--;
            }
            var31 = class312.field5259[var14][var15];
        }
        if (var33 > 0) {
            class233.method1657(var33, arg4, (byte) 12);
            return true;
        } else if (arg4 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "(I)V", line = 619)
    public final void method65(int arg0) {
        this.field4369 = class273.method1889((byte) 119, this.field4386);
        field4367++;
        this.method1821((byte) -114);
        for (int var2 = this.field4371 - 1; var2 >= 1; var2--) {
            short var3 = this.field4383[var2];
            if (var3 > 8 || var3 < -8) {
                break;
            }
            this.field4371--;
        }
        if (arg0 <= 110) {
            field4384 = (class229) null;
        }
    }

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "(III)Z", line = 650)
    public static final boolean method1824(int arg0, int arg1, int arg2) {
        int var3 = class316.field5370[arg0][arg1][arg2];
        if (-class271.field4536 == var3) {
            return false;
        } else if (class271.field4536 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class61.method418(var4 + 1, class192.field3174[arg0][arg1][arg2], var5 + 1) && class61.method418(var4 + 128 - 1, class192.field3174[arg0][arg1 + 1][arg2], var5 + 1) && class61.method418(var4 + 128 - 1, class192.field3174[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class61.method418(var4 + 1, class192.field3174[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class316.field5370[arg0][arg1][arg2] = class271.field4536;
                return true;
            } else {
                class316.field5370[arg0][arg1][arg2] = -class271.field4536;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIIIII)I", line = 692)
    private final int method1825(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4374++;
        if (arg4 != -14318) {
            field4387 = -97;
        }
        int var8 = arg6 - 4096;
        int var9 = arg5 >> 12;
        int var10 = var9 + 1;
        if (arg2 <= var10) {
            var10 = 0;
        }
        int var11 = var10 & 0xFF;
        int var12 = var9 & 0xFF;
        int var13 = arg5 & 0xFFF;
        int var14 = var13 - 4096;
        int var15 = this.field4369[arg3 + var12] & 0x3;
        int var16;
        if (var15 > 1) {
            var16 = var15 == 2 ? var13 - arg6 : -arg6 + -var13;
        } else {
            var16 = var15 == 0 ? arg6 + var13 : -var13 + arg6;
        }
        int var17 = class165.field2697[var13];
        int var18 = this.field4369[var11 + arg3] & 0x3;
        int var19;
        if (var18 <= 1) {
            var19 = var18 == 0 ? arg6 + var14 : -var14 + arg6;
        } else {
            var19 = var18 == 2 ? var14 - arg6 : -arg6 + -var14;
        }
        int var20 = var16 + ((var19 - var16) * var17 >> 12);
        int var21 = this.field4369[var12 + arg0] & 0x3;
        int var22;
        if (var21 <= 1) {
            var22 = var21 == 0 ? var8 + var13 : -var13 + var8;
        } else {
            var22 = var21 == 2 ? var13 - var8 : -var8 + -var13;
        }
        int var23 = this.field4369[var11 + arg0] & 0x3;
        int var24;
        if (var23 > 1) {
            var24 = var23 == 2 ? var14 - var8 : -var14 - var8;
        } else {
            var24 = var23 == 0 ? var8 + var14 : -var14 + var8;
        }
        int var25 = ((var24 - var22) * var17 >> 12) + var22;
        return ((var25 - var20) * arg1 >> 12) + var20;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(B[II)V", line = 785)
    public final void method1826(byte arg0, int[] arg1, int arg2) {
        if (arg0 >= -118) {
            return;
        }
        field4368++;
        int var4 = class269.field4504[arg2] * this.field4378;
        if (this.field4371 == 1) {
            int var5 = this.field4366[0] << 12;
            short var6 = this.field4383[0];
            int var7 = var4 * var5 >> 12;
            int var8 = var7 >> 12;
            int var9 = this.field4381 * var5 >> 12;
            int var10 = var8 + 1;
            int var11 = this.field4369[var8 & 0xFF] & 0xFF;
            int var12 = this.field4378 * var5 >> 12;
            if (var12 <= var10) {
                var10 = 0;
            }
            int var13 = this.field4369[var10 & 0xFF] & 0xFF;
            int var14 = var7 & 0xFFF;
            int var15 = class165.field2697[var14];
            if (this.field4389) {
                for (int var16 = 0; var16 < class293.field4789; var16++) {
                    int var17 = class219.field3608[var16] * this.field4381;
                    int var18 = this.method1825(var13, var15, var9, var11, -14318, var5 * var17 >> 12, var14);
                    int var19 = var6 * var18 >> 12;
                    arg1[var16] = (var19 >> 1) + 2048;
                }
            } else {
                for (int var20 = 0; var20 < class293.field4789; var20++) {
                    int var21 = class219.field3608[var20] * this.field4381;
                    int var22 = this.method1825(var13, var15, var9, var11, -14318, var5 * var21 >> 12, var14);
                    arg1[var20] = var6 * var22 >> 12;
                }
            }
            return;
        }
        short var23 = this.field4383[0];
        if (var23 > 8 || var23 < -8) {
            int var24 = this.field4366[0] << 12;
            int var25 = this.field4381 * var24 >> 12;
            int var26 = this.field4378 * var24 >> 12;
            int var27 = var4 * var24 >> 12;
            int var28 = var27 >> 12;
            int var29 = var27 & 0xFFF;
            int var30 = var28 + 1;
            int var31 = this.field4369[var28 & 0xFF] & 0xFF;
            if (var30 >= var26) {
                var30 = 0;
            }
            int var32 = class165.field2697[var29];
            int var33 = this.field4369[var30 & 0xFF] & 0xFF;
            for (int var34 = 0; var34 < class293.field4789; var34++) {
                int var35 = class219.field3608[var34] * this.field4381;
                int var36 = this.method1825(var33, var32, var25, var31, -14318, var24 * var35 >> 12, var29);
                arg1[var34] = var23 * var36 >> 12;
            }
        }
        for (int var37 = 1; var37 < this.field4371; var37++) {
            short var38 = this.field4383[var37];
            if (var38 > 8 || var38 < -8) {
                int var39 = this.field4366[var37] << 12;
                int var40 = this.field4381 * var39 >> 12;
                int var41 = var4 * var39 >> 12;
                int var42 = var41 >> 12;
                int var43 = var41 & 0xFFF;
                int var44 = var42 + 1;
                int var45 = this.field4378 * var39 >> 12;
                int var46 = class165.field2697[var43];
                if (var45 <= var44) {
                    var44 = 0;
                }
                int var47 = this.field4369[var44 & 0xFF] & 0xFF;
                int var48 = this.field4369[var42 & 0xFF] & 0xFF;
                if (this.field4389 && this.field4371 - 1 == var37) {
                    for (int var49 = 0; var49 < class293.field4789; var49++) {
                        int var50 = class219.field3608[var49] * this.field4381;
                        int var51 = this.method1825(var47, var46, var40, var48, -14318, var39 * var50 >> 12, var43);
                        int var52 = arg1[var49] + (var38 * var51 >> 12);
                        arg1[var49] = (var52 >> 1) + 2048;
                    }
                } else {
                    for (int var53 = 0; var53 < class293.field4789; var53++) {
                        int var54 = class219.field3608[var53] * this.field4381;
                        int var55 = this.method1825(var47, var46, var40, var48, -14318, var39 * var54 >> 12, var43);
                        arg1[var53] += var38 * var55 >> 12;
                    }
                }
            }
        }
    }
}
