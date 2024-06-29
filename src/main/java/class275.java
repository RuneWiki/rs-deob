import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class275 extends class125 {

    @OriginalMember(owner = "client!hf", name = "v", descriptor = "Ltn;")
    public static class60 field4074 = new class60(6, -1);

    @OriginalMember(owner = "client!hf", name = "O", descriptor = "[I")
    public static int[] field4093 = new int[14];

    @OriginalMember(owner = "client!hf", name = "R", descriptor = "[F")
    private static float[] field4096 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "F")
    public float field4059;

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "F")
    public float field4061;

    @OriginalMember(owner = "client!hf", name = "j", descriptor = "F")
    public float field4062;

    @OriginalMember(owner = "client!hf", name = "p", descriptor = "F")
    public float field4068;

    @OriginalMember(owner = "client!hf", name = "q", descriptor = "F")
    public float field4069;

    @OriginalMember(owner = "client!hf", name = "y", descriptor = "F")
    public float field4077;

    @OriginalMember(owner = "client!hf", name = "z", descriptor = "F")
    public float field4078;

    @OriginalMember(owner = "client!hf", name = "A", descriptor = "F")
    public float field4079;

    @OriginalMember(owner = "client!hf", name = "D", descriptor = "F")
    public float field4082;

    @OriginalMember(owner = "client!hf", name = "F", descriptor = "F")
    public float field4084;

    @OriginalMember(owner = "client!hf", name = "J", descriptor = "F")
    public float field4088;

    @OriginalMember(owner = "client!hf", name = "M", descriptor = "F")
    public float field4091;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "I")
    public static int field4058;

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "I")
    public static int field4060;

    @OriginalMember(owner = "client!hf", name = "l", descriptor = "I")
    public static int field4064;

    @OriginalMember(owner = "client!hf", name = "m", descriptor = "I")
    public static int field4065;

    @OriginalMember(owner = "client!hf", name = "n", descriptor = "I")
    public static int field4066;

    @OriginalMember(owner = "client!hf", name = "o", descriptor = "I")
    public static int field4067;

    @OriginalMember(owner = "client!hf", name = "r", descriptor = "I")
    public static int field4070;

    @OriginalMember(owner = "client!hf", name = "s", descriptor = "I")
    public static int field4071;

    @OriginalMember(owner = "client!hf", name = "t", descriptor = "I")
    public static int field4072;

    @OriginalMember(owner = "client!hf", name = "u", descriptor = "I")
    public static int field4073;

    @OriginalMember(owner = "client!hf", name = "w", descriptor = "I")
    public static int field4075;

    @OriginalMember(owner = "client!hf", name = "x", descriptor = "I")
    public static int field4076;

    @OriginalMember(owner = "client!hf", name = "B", descriptor = "I")
    public static int field4080;

    @OriginalMember(owner = "client!hf", name = "C", descriptor = "I")
    public static int field4081;

    @OriginalMember(owner = "client!hf", name = "E", descriptor = "I")
    public static int field4083;

    @OriginalMember(owner = "client!hf", name = "G", descriptor = "I")
    public static int field4085;

    @OriginalMember(owner = "client!hf", name = "H", descriptor = "I")
    public static int field4086;

    @OriginalMember(owner = "client!hf", name = "I", descriptor = "I")
    public static int field4087;

    @OriginalMember(owner = "client!hf", name = "K", descriptor = "I")
    public static int field4089;

    @OriginalMember(owner = "client!hf", name = "L", descriptor = "I")
    public static int field4090;

    @OriginalMember(owner = "client!hf", name = "N", descriptor = "I")
    public static int field4092;

    @OriginalMember(owner = "client!hf", name = "P", descriptor = "I")
    public static int field4094;

    @OriginalMember(owner = "client!hf", name = "Q", descriptor = "I")
    public static int field4095;

    @OriginalMember(owner = "client!hf", name = "k", descriptor = "Lwk;")
    public static class97 field4063;

    // $FF: synthetic field
    @OriginalMember(owner = "client!hf", name = "S", descriptor = "Ljava/lang/Class;")
    public static Class field4097;

    // $FF: synthetic method
    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1736(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)[F", line = 3)
    public final float[] method1725(int arg0) {
        field4095++;
        field4096[4] = this.field4068;
        field4096[13] = this.field4077;
        field4096[12] = this.field4059;
        field4096[5] = this.field4078;
        field4096[6] = this.field4061;
        field4096[9] = this.field4088;
        field4096[14] = this.field4091;
        field4096[2] = this.field4079;
        field4096[8] = this.field4084;
        field4096[10] = this.field4069;
        int var2 = 45 / ((-arg0 - 40) / 51);
        field4096[0] = this.field4062;
        field4096[1] = this.field4082;
        return field4096;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(III[I)V", line = 26)
    public final void method819(int arg0, int arg1, int arg2, int[] arg3) {
        field4066++;
        arg3[0] = (int) ((float) arg2 * this.field4084 + (float) arg0 * this.field4062 + (float) arg1 * this.field4068 + this.field4059);
        arg3[1] = (int) ((float) arg2 * this.field4088 + (float) arg0 * this.field4082 + (float) arg1 * this.field4078 + this.field4077);
        arg3[2] = (int) ((float) arg2 * this.field4069 + (float) arg0 * this.field4079 + (float) arg1 * this.field4061 + this.field4091);
    }

    @OriginalMember(owner = "client!hf", name = "K", descriptor = "(III[I)V", line = 38)
    public final void method818(int arg0, int arg1, int arg2, int[] arg3) {
        field4075++;
        arg3[1] = (int) ((float) arg2 * this.field4088 + (float) arg0 * this.field4082 + (float) arg1 * this.field4078);
        arg3[0] = (int) ((float) arg2 * this.field4084 + (float) arg0 * this.field4062 + (float) arg1 * this.field4068);
        arg3[2] = (int) ((float) arg2 * this.field4069 + (float) arg0 * this.field4079 + (float) arg1 * this.field4061);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "()Lc;", line = 51)
    public final class125 method827() {
        field4065++;
        class275 var1 = new class275();
        var1.field4059 = this.field4059;
        var1.field4091 = this.field4091;
        var1.field4068 = this.field4068;
        var1.field4084 = this.field4084;
        var1.field4078 = this.field4078;
        var1.field4077 = this.field4077;
        var1.field4079 = this.field4079;
        var1.field4088 = this.field4088;
        var1.field4082 = this.field4082;
        var1.field4069 = this.field4069;
        var1.field4061 = this.field4061;
        var1.field4062 = this.field4062;
        return var1;
    }

    @OriginalMember(owner = "client!hf", name = "ca", descriptor = "(I)V", line = 73)
    public final void method830(int arg0) {
        this.field4078 = 1.0F;
        field4080++;
        this.field4062 = this.field4069 = class423.field5962[arg0 & 0x3FFF];
        this.field4084 = class423.field5963[arg0 & 0x3FFF];
        this.field4068 = this.field4059 = this.field4082 = this.field4088 = this.field4077 = this.field4061 = this.field4091 = 0.0F;
        this.field4079 = -this.field4084;
    }

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "(I)V", line = 88)
    public final void method831(int arg0) {
        field4067++;
        this.field4062 = 1.0F;
        this.field4078 = this.field4069 = class423.field5962[arg0 & 0x3FFF];
        this.field4061 = class423.field5963[arg0 & 0x3FFF];
        this.field4068 = this.field4084 = this.field4059 = this.field4082 = this.field4077 = this.field4079 = this.field4091 = 0.0F;
        this.field4088 = -this.field4061;
    }

    @OriginalMember(owner = "client!hf", name = "v", descriptor = "()V", line = 100)
    public final void method826() {
        field4086++;
        this.field4082 = this.field4079 = this.field4068 = this.field4061 = this.field4084 = this.field4088 = this.field4059 = this.field4077 = this.field4091 = 0.0F;
        this.field4062 = this.field4078 = this.field4069 = 1.0F;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(III)Z", line = 109)
    public static final boolean method1726(int arg0, int arg1, int arg2) {
        field4092++;
        if (arg1 != 0) {
            field4096 = null;
        }
        return (arg0 & 0x180) != 0;
    }

    @OriginalMember(owner = "client!hf", name = "EA", descriptor = "(I)V", line = 121)
    public final void method823(int arg0) {
        field4058++;
        float var2 = class423.field5962[arg0 & 0x3FFF];
        float var3 = class423.field5963[arg0 & 0x3FFF];
        float var4 = this.field4062;
        float var5 = this.field4068;
        float var6 = this.field4084;
        this.field4062 = this.field4079 * var3 + var2 * var4;
        float var7 = this.field4059;
        this.field4068 = this.field4061 * var3 + var2 * var5;
        this.field4079 = this.field4079 * var2 - (var3 * var4);
        this.field4061 = this.field4061 * var2 - (var3 * var5);
        this.field4084 = this.field4069 * var3 + var2 * var6;
        this.field4069 = this.field4069 * var2 - (var3 * var6);
        this.field4059 = this.field4091 * var3 + var2 * var7;
        this.field4091 = this.field4091 * var2 - (var3 * var7);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(BI)V", line = 152)
    public static final void method1727(byte arg0, int arg1) {
        field4090++;
        if (arg0 < 86) {
            method1732();
        }
        class45 var2 = class354.method2094(arg1, (byte) -77, 1);
        var2.method261(4);
    }

    @OriginalMember(owner = "client!hf", name = "A", descriptor = "(I)V", line = 171)
    public final void method821(int arg0) {
        field4073++;
        this.field4069 = 1.0F;
        this.field4062 = this.field4078 = class423.field5962[arg0 & 0x3FFF];
        this.field4082 = class423.field5963[arg0 & 0x3FFF];
        this.field4084 = this.field4059 = this.field4088 = this.field4077 = this.field4079 = this.field4061 = this.field4091 = 0.0F;
        this.field4068 = -this.field4082;
    }

    @OriginalMember(owner = "client!hf", name = "YA", descriptor = "(IIIIII)V", line = 183)
    public final void method822(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4076++;
        float var7 = class423.field5962[arg3 & 0x3FFF];
        float var8 = class423.field5963[arg3 & 0x3FFF];
        float var9 = class423.field5962[arg4 & 0x3FFF];
        float var10 = class423.field5963[arg4 & 0x3FFF];
        float var11 = class423.field5962[arg5 & 0x3FFF];
        float var12 = class423.field5963[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field4068 = var7 * var12;
        this.field4078 = var7 * var11;
        this.field4082 = -var9 * var12 + var10 * var13;
        this.field4069 = var7 * var9;
        this.field4061 = -var8;
        this.field4062 = var9 * var11 + var10 * var14;
        this.field4084 = -var10 * var11 + var9 * var14;
        this.field4088 = var9 * var13 + var10 * var12;
        this.field4079 = var7 * var10;
        this.field4077 = (float) (-arg0) * this.field4082 - (float) arg1 * this.field4078 - (float) arg2 * this.field4088;
        this.field4091 = (float) (-arg0) * this.field4079 - (float) arg1 * this.field4061 - (float) arg2 * this.field4069;
        this.field4059 = (float) (-arg0) * this.field4062 - ((float) arg1 * this.field4068) - ((float) arg2 * this.field4084);
    }

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "(I)[F", line = 218)
    public final float[] method1728(int arg0) {
        field4087++;
        field4096[14] = 0.0F;
        field4096[6] = this.field4061;
        field4096[2] = this.field4079;
        field4096[10] = this.field4069;
        field4096[13] = 0.0F;
        field4096[9] = this.field4088;
        field4096[4] = this.field4068;
        field4096[5] = this.field4078;
        field4096[8] = this.field4084;
        field4096[1] = this.field4082;
        field4096[0] = this.field4062;
        field4096[12] = arg0;
        return field4096;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIFFIIF)V", line = 240)
    public final void method1729(int arg0, int arg1, float arg2, float arg3, int arg4, int arg5, float arg6) {
        if (arg4 == 0) {
            this.field4078 = arg1;
            this.field4082 = this.field4079 = this.field4068 = this.field4061 = this.field4084 = this.field4088 = 0.0F;
            this.field4069 = 1.0F;
            this.field4062 = arg5;
        } else {
            float var8 = class423.field5962[arg4 & 0x3FFF];
            float var9 = class423.field5963[arg4 & 0x3FFF];
            this.field4068 = (float) arg1 * -var9;
            this.field4082 = (float) arg5 * var9;
            this.field4069 = 1.0F;
            this.field4078 = (float) arg1 * var8;
            this.field4062 = (float) arg5 * var8;
            this.field4079 = this.field4061 = this.field4084 = this.field4088 = 0.0F;
        }
        field4085++;
        this.field4077 = arg2;
        if (arg0 != -29478) {
            this.method1733((byte) -67, null);
        }
        this.field4059 = arg6;
        this.field4091 = arg3;
    }

    @OriginalMember(owner = "client!hf", name = "ea", descriptor = "(I)V", line = 276)
    public final void method832(int arg0) {
        field4081++;
        float var2 = class423.field5962[arg0 & 0x3FFF];
        float var3 = class423.field5963[arg0 & 0x3FFF];
        float var4 = this.field4082;
        float var5 = this.field4078;
        float var6 = this.field4088;
        float var7 = this.field4077;
        this.field4082 = var2 * var4 - this.field4079 * var3;
        this.field4079 = this.field4079 * var2 + var3 * var4;
        this.field4078 = var2 * var5 - this.field4061 * var3;
        this.field4061 = this.field4061 * var2 + var3 * var5;
        this.field4088 = var2 * var6 - this.field4069 * var3;
        this.field4069 = this.field4069 * var2 + var3 * var6;
        this.field4077 = var2 * var7 - this.field4091 * var3;
        this.field4091 = this.field4091 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "()V", line = 305)
    public static final void method1730() {
        for (int var0 = 0; var0 < class222.field3184; var0++) {
            class144 var1 = class521.field7661[var0];
            class438.method2574(var1);
            class521.field7661[var0] = null;
        }
        class222.field3184 = 0;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZILoi;I)Lul;", line = 318)
    public static final class411 method1731(boolean arg0, int arg1, class53 arg2, int arg3) {
        if (!arg0) {
            field4089 = -92;
        }
        field4064++;
        byte[] var4 = arg2.method426(arg3, (byte) 9, arg1);
        return var4 == null ? null : new class411(var4);
    }

    @OriginalMember(owner = "client!hf", name = "ha", descriptor = "(Lc;)V", line = 341)
    public final void method828(class125 arg0) {
        field4072++;
        class275 var2 = (class275) arg0;
        this.field4077 = var2.field4077;
        this.field4091 = var2.field4091;
        this.field4084 = var2.field4084;
        this.field4059 = var2.field4059;
        this.field4088 = var2.field4088;
        this.field4068 = var2.field4068;
        this.field4061 = var2.field4061;
        this.field4069 = var2.field4069;
        this.field4082 = var2.field4082;
        this.field4062 = var2.field4062;
        this.field4078 = var2.field4078;
        this.field4079 = var2.field4079;
    }

    @OriginalMember(owner = "client!hf", name = "W", descriptor = "(III)V", line = 364)
    public final void method824(int arg0, int arg1, int arg2) {
        this.field4091 += arg2;
        this.field4077 += arg1;
        this.field4059 += arg0;
        field4060++;
    }

    @OriginalMember(owner = "client!hf", name = "U", descriptor = "(III)V", line = 374)
    public final void method825(int arg0, int arg1, int arg2) {
        this.field4077 = arg1;
        field4094++;
        this.field4059 = arg0;
        this.field4062 = this.field4078 = this.field4069 = 1.0F;
        this.field4082 = this.field4079 = this.field4068 = this.field4061 = this.field4084 = this.field4088 = 0.0F;
        this.field4091 = arg2;
    }

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "()V", line = 388)
    public static final void method1732() {
        for (int var0 = 0; var0 < class446.field6233; var0++) {
            if (!class147.field1955[var0]) {
                class391 var1 = class74.field899[var0];
                class95 var2 = var1.field5504;
                int var3 = var1.field5494;
                int var4 = var2.method675((byte) 69) - class534.field7832;
                int var5 = (var4 * 2 >> class493.field6970) + 1;
                int var6 = 0;
                int[] var7 = new int[var5 * var5];
                int var8 = var2.method672((byte) -41) - var4 >> class493.field6970;
                int var9 = var2.method673(10518) - var4 >> class493.field6970;
                int var10 = var2.method673(10518) + var4 >> class493.field6970;
                if (var9 < 0) {
                    var6 -= var9;
                    var9 = 0;
                }
                if (var10 >= class272.field4032) {
                    var10 = class272.field4032 - 1;
                }
                for (int var11 = var9; var11 <= var10; var11++) {
                    short var12 = var1.field5505[var6];
                    int var13 = var12 >>> 8;
                    int var14 = var5 * var6 + var13;
                    int var15 = (var12 >>> 8) + var8;
                    int var16 = (var12 & 0xFF) + var15 - 1;
                    if (var15 < 0) {
                        var14 -= var15;
                        var15 = 0;
                    }
                    if (var16 >= class6.field109) {
                        var16 = class6.field109 - 1;
                    }
                    for (int var17 = var15; var17 <= var16; var17++) {
                        byte var18 = 1;
                        class144 var19 = class248.method1622(var3, var17, var11, field4097 == null ? (field4097 = method1736("eq")) : field4097);
                        if (var19 != null && var19.field1900 != 0) {
                            if (var19.field1900 == 1) {
                                boolean var20 = var17 - 1 >= var15;
                                boolean var21 = var17 + 1 <= var16;
                                if (!var20 && var11 + 1 <= var10) {
                                    short var22 = var1.field5505[var6 + 1];
                                    int var23 = (var22 >>> 8) + var8;
                                    int var24 = (var22 & 0xFF) + var23;
                                    var20 = var17 > var23 && var17 < var24;
                                }
                                if (!var21 && var11 - 1 >= var9) {
                                    short var25 = var1.field5505[var6 - 1];
                                    int var26 = (var25 >>> 8) + var8;
                                    int var27 = (var25 & 0xFF) + var26;
                                    var21 = var17 > var26 && var17 < var27;
                                }
                                if (var20 && !var21) {
                                    var18 = 4;
                                } else if (var21 && !var20) {
                                    var18 = 2;
                                }
                            } else {
                                boolean var28 = var17 - 1 >= var15;
                                boolean var29 = var17 + 1 <= var16;
                                if (!var28 && var11 - 1 >= var9) {
                                    short var30 = var1.field5505[var6 - 1];
                                    int var31 = (var30 >>> 8) + var8;
                                    int var32 = (var30 & 0xFF) + var31;
                                    var28 = var17 > var31 && var17 < var32;
                                }
                                if (!var29 && var11 + 1 <= var10) {
                                    short var33 = var1.field5505[var6 + 1];
                                    int var34 = (var33 >>> 8) + var8;
                                    int var35 = (var33 & 0xFF) + var34;
                                    var29 = var17 > var34 && var17 < var35;
                                }
                                if (var28 && !var29) {
                                    var18 = 3;
                                } else if (var29 && !var28) {
                                    var18 = 5;
                                }
                            }
                        }
                        var7[var14++] = var18;
                    }
                    var6++;
                }
                class147.field1955[var0] = true;
                class330.field4818[var3].method6(var2, var7);
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "wa", descriptor = "([I)V", line = 564)
    public final void method820(int[] arg0) {
        field4083++;
        float var2 = (float) arg0[0] - this.field4059;
        float var3 = (float) arg0[1] - this.field4077;
        float var4 = (float) arg0[2] - this.field4091;
        arg0[1] = (int) (this.field4061 * var4 + this.field4078 * var3 + this.field4068 * var2);
        arg0[0] = (int) (this.field4079 * var4 + this.field4082 * var3 + this.field4062 * var2);
        arg0[2] = (int) (this.field4069 * var4 + this.field4088 * var3 + this.field4084 * var2);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(BLc;)V", line = 580)
    public final void method1733(byte arg0, class125 arg1) {
        field4070++;
        class275 var3 = (class275) arg1;
        int var4 = 95 / ((arg0 + 48) / 54);
        this.field4084 = var3.field4079;
        this.field4068 = var3.field4082;
        this.field4062 = var3.field4062;
        this.field4079 = var3.field4084;
        this.field4082 = var3.field4068;
        this.field4088 = var3.field4061;
        this.field4078 = var3.field4078;
        this.field4059 = -(this.field4084 * var3.field4091 + this.field4068 * var3.field4077 + this.field4062 * var3.field4059);
        this.field4069 = var3.field4069;
        this.field4061 = var3.field4088;
        this.field4077 = -(this.field4088 * var3.field4091 + this.field4082 * var3.field4059 + this.field4078 * var3.field4077);
        this.field4091 = -(this.field4069 * var3.field4091 + this.field4079 * var3.field4059 + this.field4061 * var3.field4077);
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "()V", line = 609)
    public class275() {
        this.method826();
    }

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "(I)V", line = 627)
    public static final void method1734(int arg0) {
        field4071++;
        class408 var1 = (class408) class191.field2730.method2655(15152);
        if (arg0 != 15911) {
            method1726(-52, 59, 43);
        }
        while (var1 != null) {
            if (var1.field5776 > 0) {
                var1.field5776--;
            }
            if (var1.field5776 != 0) {
                if (var1.field5766 > 0) {
                    var1.field5766--;
                }
                if (var1.field5766 == 0 && var1.field5770 >= 1 && var1.field5773 >= 1 && class43.field494 - 2 >= var1.field5770 && var1.field5773 <= (class500.field7068 - 2) && (var1.field5781 < 0 || class540.method3177(var1.field5781, (byte) -97, var1.field5778))) {
                    class447.method2607(var1.field5778, var1.field5777, var1.field5773, false, var1.field5779, var1.field5770, var1.field5781, var1.field5771, -1);
                    var1.field5766 = -1;
                    if (var1.field5781 == var1.field5768 && var1.field5768 == -1) {
                        var1.method2891(-126);
                    } else if (var1.field5781 == var1.field5768 && var1.field5779 == var1.field5774 && var1.field5778 == var1.field5769) {
                        var1.method2891(-121);
                    }
                }
            } else if (var1.field5768 < 0 || class540.method3177(var1.field5768, (byte) -58, var1.field5769)) {
                class447.method2607(var1.field5769, var1.field5777, var1.field5773, false, var1.field5774, var1.field5770, var1.field5768, var1.field5771, -1);
                var1.method2891(arg0 ^ 0x3E32);
            }
            var1 = (class408) class191.field2730.method2660((byte) 67);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V", line = 685)
    public static void method1735(byte arg0) {
        field4096 = null;
        field4063 = null;
        if (arg0 == 121) {
            field4074 = null;
            field4093 = null;
        }
    }
}
