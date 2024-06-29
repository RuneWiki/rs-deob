import jaggl.OpenGL;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class304 extends class121 {

    @OriginalMember(owner = "client!vj", name = "S", descriptor = "Z")
    private boolean field4313 = false;

    @OriginalMember(owner = "client!vj", name = "R", descriptor = "I")
    private int field4312 = 0;

    @OriginalMember(owner = "client!vj", name = "E", descriptor = "I")
    private int field4299 = 0;

    @OriginalMember(owner = "client!vj", name = "ub", descriptor = "I")
    private int field4341 = 0;

    @OriginalMember(owner = "client!vj", name = "Mb", descriptor = "I")
    private int field4359 = 0;

    @OriginalMember(owner = "client!vj", name = "mc", descriptor = "Z")
    private boolean field4385 = true;

    @OriginalMember(owner = "client!vj", name = "qb", descriptor = "I")
    private int field4337 = 0;

    @OriginalMember(owner = "client!vj", name = "xb", descriptor = "Lod;")
    private class349 field4344;

    @OriginalMember(owner = "client!vj", name = "oc", descriptor = "Lbg;")
    private class323 field4387;

    @OriginalMember(owner = "client!vj", name = "Sb", descriptor = "Lbg;")
    private class323 field4365;

    @OriginalMember(owner = "client!vj", name = "ib", descriptor = "Lbg;")
    private class323 field4329;

    @OriginalMember(owner = "client!vj", name = "P", descriptor = "Lbg;")
    private class323 field4310;

    @OriginalMember(owner = "client!vj", name = "C", descriptor = "Lgb;")
    private class142 field4297;

    @OriginalMember(owner = "client!vj", name = "Y", descriptor = "I")
    private int field4319;

    @OriginalMember(owner = "client!vj", name = "V", descriptor = "I")
    private int field4316;

    @OriginalMember(owner = "client!vj", name = "T", descriptor = "[I")
    private int[] field4314;

    @OriginalMember(owner = "client!vj", name = "Yb", descriptor = "[I")
    private int[] field4371;

    @OriginalMember(owner = "client!vj", name = "D", descriptor = "[S")
    private short[] field4298;

    @OriginalMember(owner = "client!vj", name = "jc", descriptor = "[I")
    private int[] field4382;

    @OriginalMember(owner = "client!vj", name = "Tb", descriptor = "[I")
    private int[] field4366;

    @OriginalMember(owner = "client!vj", name = "l", descriptor = "[Lat;")
    private class255[] field4280;

    @OriginalMember(owner = "client!vj", name = "Ob", descriptor = "[Lu;")
    private class52[] field4361;

    @OriginalMember(owner = "client!vj", name = "gc", descriptor = "I")
    private int field4379;

    @OriginalMember(owner = "client!vj", name = "cb", descriptor = "[Lsk;")
    private class438[] field4323;

    @OriginalMember(owner = "client!vj", name = "n", descriptor = "[Leo;")
    private class193[] field4282;

    @OriginalMember(owner = "client!vj", name = "kb", descriptor = "[B")
    private byte[] field4331;

    @OriginalMember(owner = "client!vj", name = "bb", descriptor = "[S")
    private short[] field4322;

    @OriginalMember(owner = "client!vj", name = "ic", descriptor = "[S")
    private short[] field4381;

    @OriginalMember(owner = "client!vj", name = "Eb", descriptor = "[S")
    private short[] field4351;

    @OriginalMember(owner = "client!vj", name = "Z", descriptor = "[B")
    private byte[] field4320;

    @OriginalMember(owner = "client!vj", name = "W", descriptor = "[S")
    private short[] field4317;

    @OriginalMember(owner = "client!vj", name = "Gb", descriptor = "[S")
    private short[] field4353;

    @OriginalMember(owner = "client!vj", name = "z", descriptor = "[S")
    private short[] field4294;

    @OriginalMember(owner = "client!vj", name = "I", descriptor = "[S")
    private short[] field4303;

    @OriginalMember(owner = "client!vj", name = "wb", descriptor = "[F")
    private float[] field4343;

    @OriginalMember(owner = "client!vj", name = "ab", descriptor = "S")
    private short field4321;

    @OriginalMember(owner = "client!vj", name = "p", descriptor = "[F")
    private float[] field4284;

    @OriginalMember(owner = "client!vj", name = "yb", descriptor = "S")
    private short field4345;

    @OriginalMember(owner = "client!vj", name = "J", descriptor = "[S")
    private short[] field4304;

    @OriginalMember(owner = "client!vj", name = "Xb", descriptor = "[S")
    private short[] field4370;

    @OriginalMember(owner = "client!vj", name = "K", descriptor = "[S")
    private short[] field4305;

    @OriginalMember(owner = "client!vj", name = "B", descriptor = "[I")
    private int[] field4296;

    @OriginalMember(owner = "client!vj", name = "gb", descriptor = "[[I")
    private int[][] field4327;

    @OriginalMember(owner = "client!vj", name = "Cb", descriptor = "[[I")
    private int[][] field4349;

    @OriginalMember(owner = "client!vj", name = "Vb", descriptor = "[[I")
    private int[][] field4368;

    @OriginalMember(owner = "client!vj", name = "y", descriptor = "I")
    public static int field4293 = -1;

    @OriginalMember(owner = "client!vj", name = "rb", descriptor = "B")
    private byte field4338;

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "I")
    public static int field4279;

    @OriginalMember(owner = "client!vj", name = "m", descriptor = "I")
    public static int field4281;

    @OriginalMember(owner = "client!vj", name = "o", descriptor = "I")
    public static int field4283;

    @OriginalMember(owner = "client!vj", name = "r", descriptor = "I")
    public static int field4286;

    @OriginalMember(owner = "client!vj", name = "s", descriptor = "I")
    public static int field4287;

    @OriginalMember(owner = "client!vj", name = "t", descriptor = "I")
    public static int field4288;

    @OriginalMember(owner = "client!vj", name = "u", descriptor = "I")
    public static int field4289;

    @OriginalMember(owner = "client!vj", name = "v", descriptor = "I")
    public static int field4290;

    @OriginalMember(owner = "client!vj", name = "w", descriptor = "I")
    public static int field4291;

    @OriginalMember(owner = "client!vj", name = "A", descriptor = "I")
    public static int field4295;

    @OriginalMember(owner = "client!vj", name = "F", descriptor = "I")
    public static int field4300;

    @OriginalMember(owner = "client!vj", name = "G", descriptor = "I")
    public static int field4301;

    @OriginalMember(owner = "client!vj", name = "H", descriptor = "I")
    public static int field4302;

    @OriginalMember(owner = "client!vj", name = "L", descriptor = "I")
    public static int field4306;

    @OriginalMember(owner = "client!vj", name = "M", descriptor = "I")
    public static int field4307;

    @OriginalMember(owner = "client!vj", name = "O", descriptor = "I")
    public static int field4309;

    @OriginalMember(owner = "client!vj", name = "Q", descriptor = "I")
    public static int field4311;

    @OriginalMember(owner = "client!vj", name = "U", descriptor = "I")
    public static int field4315;

    @OriginalMember(owner = "client!vj", name = "X", descriptor = "I")
    public static int field4318;

    @OriginalMember(owner = "client!vj", name = "db", descriptor = "I")
    public static int field4324;

    @OriginalMember(owner = "client!vj", name = "eb", descriptor = "I")
    public static int field4325;

    @OriginalMember(owner = "client!vj", name = "fb", descriptor = "I")
    public static int field4326;

    @OriginalMember(owner = "client!vj", name = "hb", descriptor = "I")
    public static int field4328;

    @OriginalMember(owner = "client!vj", name = "jb", descriptor = "I")
    public static int field4330;

    @OriginalMember(owner = "client!vj", name = "lb", descriptor = "I")
    public static int field4332;

    @OriginalMember(owner = "client!vj", name = "nb", descriptor = "I")
    public static int field4334;

    @OriginalMember(owner = "client!vj", name = "pb", descriptor = "I")
    public static int field4336;

    @OriginalMember(owner = "client!vj", name = "sb", descriptor = "I")
    public static int field4339;

    @OriginalMember(owner = "client!vj", name = "tb", descriptor = "I")
    public static int field4340;

    @OriginalMember(owner = "client!vj", name = "zb", descriptor = "I")
    public static int field4346;

    @OriginalMember(owner = "client!vj", name = "Ab", descriptor = "I")
    public static int field4347;

    @OriginalMember(owner = "client!vj", name = "Bb", descriptor = "I")
    public static int field4348;

    @OriginalMember(owner = "client!vj", name = "Fb", descriptor = "I")
    public static int field4352;

    @OriginalMember(owner = "client!vj", name = "Hb", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!vj", name = "Ib", descriptor = "I")
    public static int field4355;

    @OriginalMember(owner = "client!vj", name = "Jb", descriptor = "I")
    public static int field4356;

    @OriginalMember(owner = "client!vj", name = "Kb", descriptor = "I")
    public static int field4357;

    @OriginalMember(owner = "client!vj", name = "Lb", descriptor = "I")
    public static int field4358;

    @OriginalMember(owner = "client!vj", name = "Nb", descriptor = "I")
    public static int field4360;

    @OriginalMember(owner = "client!vj", name = "Pb", descriptor = "I")
    public static int field4362;

    @OriginalMember(owner = "client!vj", name = "Rb", descriptor = "I")
    public static int field4364;

    @OriginalMember(owner = "client!vj", name = "Ub", descriptor = "I")
    public static int field4367;

    @OriginalMember(owner = "client!vj", name = "Wb", descriptor = "I")
    public static int field4369;

    @OriginalMember(owner = "client!vj", name = "Zb", descriptor = "I")
    public static int field4372;

    @OriginalMember(owner = "client!vj", name = "bc", descriptor = "I")
    public static int field4374;

    @OriginalMember(owner = "client!vj", name = "dc", descriptor = "I")
    public static int field4376;

    @OriginalMember(owner = "client!vj", name = "ec", descriptor = "I")
    public static int field4377;

    @OriginalMember(owner = "client!vj", name = "fc", descriptor = "I")
    public static int field4378;

    @OriginalMember(owner = "client!vj", name = "hc", descriptor = "I")
    public static int field4380;

    @OriginalMember(owner = "client!vj", name = "kc", descriptor = "I")
    public static int field4383;

    @OriginalMember(owner = "client!vj", name = "lc", descriptor = "I")
    public static int field4384;

    @OriginalMember(owner = "client!vj", name = "nc", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!vj", name = "pc", descriptor = "I")
    public static int field4388;

    @OriginalMember(owner = "client!vj", name = "qc", descriptor = "I")
    public static int field4389;

    @OriginalMember(owner = "client!vj", name = "x", descriptor = "Lbj;")
    private class159 field4292;

    @OriginalMember(owner = "client!vj", name = "vb", descriptor = "Lnc;")
    private class21 field4342;

    @OriginalMember(owner = "client!vj", name = "ob", descriptor = "Lap;")
    private class332 field4335;

    @OriginalMember(owner = "client!vj", name = "q", descriptor = "S")
    private short field4285;

    @OriginalMember(owner = "client!vj", name = "N", descriptor = "S")
    private short field4308;

    @OriginalMember(owner = "client!vj", name = "mb", descriptor = "S")
    private short field4333;

    @OriginalMember(owner = "client!vj", name = "Db", descriptor = "S")
    private short field4350;

    @OriginalMember(owner = "client!vj", name = "Qb", descriptor = "S")
    private short field4363;

    @OriginalMember(owner = "client!vj", name = "ac", descriptor = "S")
    private short field4373;

    @OriginalMember(owner = "client!vj", name = "cc", descriptor = "S")
    private short field4375;

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "()V", line = 7)
    public final void method721() {
        field4364++;
        if (this.field4337 <= 0 || this.field4341 <= 0) {
            return;
        }
        this.method1916(false, false);
        if ((this.field4338 & 0x10) == 0 && this.field4297.field2120 == null) {
            this.method1913(-51, false);
        }
        this.method1918(-32767);
    }

    @OriginalMember(owner = "client!vj", name = "ia", descriptor = "(I)V", line = 26)
    public final void method688(int arg0) {
        field4367++;
        int var2 = class457.field6760[arg0];
        int var3 = class457.field6759[arg0];
        for (int var4 = 0; var4 < this.field4359; var4++) {
            int var7 = this.field4371[var4] * var2 + this.field4366[var4] * var3 >> 15;
            this.field4371[var4] = this.field4371[var4] * var3 - (this.field4366[var4] * var2) >> 15;
            this.field4366[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field4337; var5++) {
            int var6 = this.field4381[var5] * var3 + this.field4370[var5] * var2 >> 15;
            this.field4370[var5] = (short) (this.field4370[var5] * var3 - (this.field4381[var5] * var2) >> 15);
            this.field4381[var5] = (short) var6;
        }
        if (this.field4329 == null && this.field4310 != null) {
            this.field4310.field4626 = null;
        }
        if (this.field4329 != null) {
            this.field4329.field4626 = null;
        }
        this.field4313 = false;
        if (this.field4387 != null) {
            this.field4387.field4626 = null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "YA", descriptor = "(SS)V", line = 78)
    public final void method744(short arg0, short arg1) {
        field4354++;
        class126 var3 = this.field4344.field2379;
        for (int var4 = 0; var4 < this.field4312; var4++) {
            if (this.field4304[var4] == arg0) {
                this.field4304[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class321 var7 = var3.method838(true, arg0 & 0xFFFF);
            var6 = var7.field4594;
            var5 = var7.field4604;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class321 var10 = var3.method838(true, arg1 & 0xFFFF);
            var9 = var10.field4594;
            var8 = var10.field4604;
        }
        if (!var5 != var8 | var6 != var9) {
            return;
        }
        if (this.field4323 != null) {
            for (int var11 = 0; var11 < this.field4379; var11++) {
                class438 var12 = this.field4323[var11];
                class193 var13 = this.field4282[var11];
                var13.field2828 = class508.field7410[this.field4303[var12.field6541] & 0xFFFF] & 0xFFFFFF | var13.field2828 & 0xFF000000;
            }
        }
        if (this.field4310 != null) {
            this.field4310.field4626 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lia;Lvk;I)V", line = 161)
    public final void method720(class414 arg0, class247 arg1, int arg2) {
        field4372++;
        if (this.field4337 == 0) {
            return;
        }
        class227 var4 = this.field4344.field5320;
        if (!this.field4313) {
            this.method1917(-7534);
        }
        class227 var5 = (class227) arg0;
        this.method1910(448, var5);
        class143.field2141 = var4.field3338 * var5.field3344 + var4.field3352 * var5.field3348 + var4.field3329 * var5.field3341 + var4.field3344;
        class464.field6867 = var4.field3338 * var5.field3352 + var4.field3352 * var5.field3355 + var4.field3329 * var5.field3334;
        float var6 = (float) this.field4308 * class464.field6867 + class143.field2141;
        float var7 = (float) this.field4373 * class464.field6867 + class143.field2141;
        float var8;
        float var9;
        if (var7 < var6) {
            var8 = (float) this.field4350 + var6;
            var9 = var7 - (float) this.field4350;
        } else {
            var9 = (float) (-this.field4350) + var6;
            var8 = (float) this.field4350 + var7;
        }
        if ((var9 >= this.field4344.field5329) || ((float) this.field4344.field5275 >= var8)) {
            return;
        }
        class479.field7033 = var4.field3349 * var5.field3352 + var4.field3347 * var5.field3334 + var4.field3334 * var5.field3355;
        class429.field6408 = var4.field3349 * var5.field3344 + var4.field3347 * var5.field3341 + var4.field3334 * var5.field3348 + var4.field3341;
        float var10 = (float) this.field4308 * class479.field7033 + class429.field6408;
        float var11 = (float) this.field4373 * class479.field7033 + class429.field6408;
        float var12;
        float var13;
        if ((var10 > var11)) {
            var12 = ((float) this.field4350 + var10) * (float) this.field4344.field5260;
            var13 = (var11 - (float) this.field4350) * (float) this.field4344.field5260;
        } else {
            var12 = ((float) this.field4350 + var11) * (float) this.field4344.field5260;
            var13 = (var10 - (float) this.field4350) * (float) this.field4344.field5260;
        }
        if ((var13 / var8 >= this.field4344.field5351) || (this.field4344.field5360 >= var12 / var8)) {
            return;
        }
        class356.field5474 = var4.field3335 * var5.field3344 + var4.field3355 * var5.field3348 + var4.field3346 * var5.field3341 + var4.field3348;
        class279.field4024 = var4.field3335 * var5.field3352 + var4.field3355 * var5.field3355 + var4.field3346 * var5.field3334;
        float var14 = (float) this.field4308 * class279.field4024 + class356.field5474;
        float var15 = (float) this.field4373 * class279.field4024 + class356.field5474;
        float var16;
        float var17;
        if (var14 > var15) {
            var16 = ((float) this.field4350 + var14) * (float) this.field4344.field5301;
            var17 = ((float) (-this.field4350) + var15) * (float) this.field4344.field5301;
        } else {
            var17 = ((float) (-this.field4350) + var14) * (float) this.field4344.field5301;
            var16 = ((float) this.field4350 + var15) * (float) this.field4344.field5301;
        }
        if ((this.field4344.field5345 <= var17 / var8) || (var16 / var8 <= this.field4344.field5321)) {
            return;
        }
        if (arg1 != null || this.field4323 != null) {
            class424.field6363 = var4.field3349 * var5.field3329 + var4.field3347 * var5.field3347 + var4.field3334 * var5.field3346;
            class143.field2144 = var4.field3335 * var5.field3338 + var4.field3355 * var5.field3335 + var4.field3346 * var5.field3349;
            class484.field7102 = var4.field3338 * var5.field3338 + var4.field3352 * var5.field3335 + var4.field3329 * var5.field3349;
            class212.field3101 = var4.field3338 * var5.field3329 + var4.field3352 * var5.field3346 + var4.field3329 * var5.field3347;
            class69.field1046 = var4.field3349 * var5.field3338 + var4.field3347 * var5.field3349 + var4.field3334 * var5.field3335;
            class522.field7736 = var4.field3335 * var5.field3329 + var4.field3355 * var5.field3346 + var4.field3346 * var5.field3347;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field4375 + this.field4363 >> 1;
            int var21 = this.field4333 + this.field4285 >> 1;
            int var22 = (int) ((float) var21 * class69.field1046 + (float) this.field4308 * class479.field7033 + (float) var20 * class424.field6363 + class429.field6408);
            int var23 = (int) ((float) var21 * class143.field2144 + (float) this.field4308 * class279.field4024 + (float) var20 * class522.field7736 + class356.field5474);
            int var24 = (int) ((float) var21 * class484.field7102 + (float) this.field4308 * class464.field6867 + (float) var20 * class212.field3101 + class143.field2141);
            if (this.field4344.field5275 > var24) {
                var18 = true;
            } else {
                arg1.field3633 = this.field4344.field5347 + (this.field4344.field5260 * var22 / var24);
                arg1.field3634 = this.field4344.field5331 + (this.field4344.field5301 * var23 / var24);
            }
            int var25 = (int) ((float) var21 * class69.field1046 + (float) this.field4373 * class479.field7033 + (float) var20 * class424.field6363 + class429.field6408);
            int var26 = (int) ((float) var21 * class143.field2144 + (float) this.field4373 * class279.field4024 + (float) var20 * class522.field7736 + class356.field5474);
            int var27 = (int) ((float) var21 * class484.field7102 + (float) this.field4373 * class464.field6867 + (float) var20 * class212.field3101 + class143.field2141);
            if (this.field4344.field5275 > var27) {
                var18 = true;
            } else {
                arg1.field3630 = this.field4344.field5301 * var26 / var27 + this.field4344.field5331;
                arg1.field3632 = this.field4344.field5260 * var25 / var27 + this.field4344.field5347;
            }
            if (var18) {
                if (var24 < this.field4344.field5275 && this.field4344.field5275 > var27) {
                    var19 = false;
                } else if (var24 < this.field4344.field5275) {
                    int var28 = (var27 - this.field4344.field5275 << 16) / (var27 - var24);
                    int var29 = ((var25 - var22) * var28 >> 16) + var25;
                    arg1.field3633 = this.field4344.field5260 * var29 / this.field4344.field5275 + this.field4344.field5347;
                    int var30 = ((var26 - var23) * var28 >> 16) + var26;
                    arg1.field3634 = this.field4344.field5331 + (this.field4344.field5301 * var30 / this.field4344.field5275);
                } else if (var27 < this.field4344.field5275) {
                    int var31 = (var24 - this.field4344.field5275 << 16) / (var24 - var27);
                    int var32 = var22 + ((var22 - var25) * var31 >> 16);
                    int var33 = var23 + ((var23 - var26) * var31 >> 16);
                    arg1.field3633 = this.field4344.field5347 + (this.field4344.field5260 * var32 / this.field4344.field5275);
                    arg1.field3634 = this.field4344.field5301 * var33 / this.field4344.field5275 + this.field4344.field5331;
                }
            }
            if (var19) {
                if (var27 < var24) {
                    arg1.field3631 = this.field4344.field5347 + ((this.field4350 + var22) * this.field4344.field5260 / var24) - arg1.field3633;
                } else {
                    arg1.field3631 = (this.field4350 + var25) * this.field4344.field5260 / var27 + this.field4344.field5347 - arg1.field3632;
                }
                arg1.field3629 = true;
            }
        }
        this.field4344.method2142(-2);
        this.field4344.method2149(var5, 30);
        this.method1920((byte) 34);
        this.field4344.method2189(1);
        this.method1919(32767);
    }

    @OriginalMember(owner = "client!vj", name = "va", descriptor = "(I[IIIIZI[I)V", line = 368)
    public final void method689(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field4358++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg2 << 4;
            int var11 = arg4 << 4;
            int var12 = arg3 << 4;
            int var13 = 0;
            class107.field1544 = 0;
            class523.field7745 = 0;
            class494.field7292 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (var15 < this.field4327.length) {
                    int[] var16 = this.field4327[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field4298 == null || (this.field4298[var18] & arg6) != 0) {
                            class494.field7292 += this.field4366[var18];
                            class107.field1544 += this.field4382[var18];
                            var13++;
                            class523.field7745 += this.field4371[var18];
                        }
                    }
                }
            }
            if (var13 > 0) {
                class107.field1544 = class107.field1544 / var13 + var12;
                class523.field7745 = class523.field7745 / var13 + var11;
                class494.field7292 = class494.field7292 / var13 + var10;
                class524.field7752 = true;
            } else {
                class494.field7292 = var10;
                class107.field1544 = var12;
                class523.field7745 = var11;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[2] * arg4 + arg7[1] * arg3 + arg7[0] * arg2 + 16384 >> 15;
                int var20 = arg7[4] * arg3 + (arg7[3] * arg2 - (-(arg7[5] * arg4) - 16384)) >> 15;
                int var21 = arg7[7] * arg3 + arg7[6] * arg2 + arg7[8] * arg4 + 16384 >> 15;
                arg3 = var20;
                arg2 = var19;
                arg4 = var21;
            }
            int var22 = arg2 << 4;
            int var23 = arg3 << 4;
            int var24 = arg4 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (this.field4327.length > var26) {
                    int[] var27 = this.field4327[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field4298 == null || (this.field4298[var29] & arg6) != 0) {
                            this.field4366[var29] += var22;
                            this.field4382[var29] += var23;
                            this.field4371[var29] += var24;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var90 = 0; var90 < var9; var90++) {
                    int var109 = arg1[var90];
                    if (var109 < this.field4327.length) {
                        int[] var110 = this.field4327[var109];
                        for (int var111 = 0; var111 < var110.length; var111++) {
                            int var112 = var110[var111];
                            if (this.field4298 == null || (this.field4298[var112] & arg6) != 0) {
                                this.field4366[var112] -= class494.field7292;
                                this.field4382[var112] -= class107.field1544;
                                this.field4371[var112] -= class523.field7745;
                                if (arg4 != 0) {
                                    int var113 = class457.field6760[arg4];
                                    int var114 = class457.field6759[arg4];
                                    int var115 = this.field4382[var112] * var113 + this.field4366[var112] * var114 + 32767 >> 15;
                                    this.field4382[var112] = this.field4382[var112] * var114 + 32767 - (this.field4366[var112] * var113) >> 15;
                                    this.field4366[var112] = var115;
                                }
                                if (arg2 != 0) {
                                    int var116 = class457.field6760[arg2];
                                    int var117 = class457.field6759[arg2];
                                    int var118 = this.field4382[var112] * var117 + 32767 - (this.field4371[var112] * var116) >> 15;
                                    this.field4371[var112] = this.field4371[var112] * var117 + (this.field4382[var112] * var116 + 32767) >> 15;
                                    this.field4382[var112] = var118;
                                }
                                if (arg3 != 0) {
                                    int var119 = class457.field6760[arg3];
                                    int var120 = class457.field6759[arg3];
                                    int var121 = this.field4371[var112] * var119 + this.field4366[var112] * var120 + 32767 >> 15;
                                    this.field4371[var112] = this.field4371[var112] * var120 + (32767 - (this.field4366[var112] * var119)) >> 15;
                                    this.field4366[var112] = var121;
                                }
                                this.field4366[var112] += class494.field7292;
                                this.field4382[var112] += class107.field1544;
                                this.field4371[var112] += class523.field7745;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var91 = 0; var91 < var9; var91++) {
                        int var92 = arg1[var91];
                        if (this.field4327.length > var92) {
                            int[] var93 = this.field4327[var92];
                            for (int var94 = 0; var94 < var93.length; var94++) {
                                int var95 = var93[var94];
                                if (this.field4298 == null || (this.field4298[var95] & arg6) != 0) {
                                    int var96 = this.field4314[var95];
                                    int var97 = this.field4314[var95 + 1];
                                    for (int var98 = var96; var98 < var97; var98++) {
                                        int var99 = this.field4294[var98] - 1;
                                        if (var99 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var100 = class457.field6760[arg4];
                                            int var101 = class457.field6759[arg4];
                                            int var102 = this.field4381[var99] * var101 + this.field4322[var99] * var100 + 32767 >> 15;
                                            this.field4322[var99] = (short) (this.field4322[var99] * var101 + 32767 - (this.field4381[var99] * var100) >> 15);
                                            this.field4381[var99] = (short) var102;
                                        }
                                        if (arg2 != 0) {
                                            int var103 = class457.field6760[arg2];
                                            int var104 = class457.field6759[arg2];
                                            int var105 = this.field4322[var99] * var104 + 32767 - (this.field4370[var99] * var103) >> 15;
                                            this.field4370[var99] = (short) (this.field4370[var99] * var104 + this.field4322[var99] * var103 + 32767 >> 15);
                                            this.field4322[var99] = (short) var105;
                                        }
                                        if (arg3 != 0) {
                                            int var106 = class457.field6760[arg3];
                                            int var107 = class457.field6759[arg3];
                                            int var108 = this.field4381[var99] * var107 + this.field4370[var99] * var106 + 32767 >> 15;
                                            this.field4370[var99] = (short) (this.field4370[var99] * var107 + 32767 - (this.field4381[var99] * var106) >> 15);
                                            this.field4381[var99] = (short) var108;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field4329 == null && this.field4310 != null) {
                        this.field4310.field4626 = null;
                    }
                    if (this.field4329 != null) {
                        this.field4329.field4626 = null;
                    }
                }
            } else {
                int var30 = arg7[9] << 4;
                int var31 = arg7[10] << 4;
                int var32 = arg7[11] << 4;
                int var33 = arg7[12] << 4;
                int var34 = arg7[13] << 4;
                int var35 = arg7[14] << 4;
                if (class524.field7752) {
                    int var36 = arg7[0] * class494.field7292 + arg7[3] * class107.field1544 + arg7[6] * class523.field7745 + 16384 >> 15;
                    int var37 = arg7[7] * class523.field7745 + arg7[1] * class494.field7292 - (-(arg7[4] * class107.field1544) - 16384) >> 15;
                    int var38 = var34 + var37;
                    int var39 = var33 + var36;
                    int var40 = arg7[2] * class494.field7292 + (arg7[5] * class107.field1544) - (-(arg7[8] * class523.field7745) + -16384) >> 15;
                    int var41 = var35 + var40;
                    class107.field1544 = var38;
                    class494.field7292 = var39;
                    class524.field7752 = false;
                    class523.field7745 = var41;
                }
                int[] var42 = new int[9];
                int var43 = class457.field6759[arg2];
                int var44 = class457.field6760[arg2];
                int var45 = class457.field6759[arg3];
                int var46 = class457.field6760[arg3];
                int var47 = class457.field6759[arg4];
                int var48 = class457.field6760[arg4];
                int var49 = var44 * var47 + 16384 >> 15;
                int var50 = var44 * var48 + 16384 >> 15;
                var42[7] = var45 * var49 + var46 * var48 + 16384 >> 15;
                var42[5] = -var44;
                var42[8] = var43 * var45 + 16384 >> 15;
                var42[0] = var46 * var50 + var45 * var47 + 16384 >> 15;
                var42[1] = -var45 * var48 + var46 * var49 + 16384 >> 15;
                var42[6] = -var46 * var47 + var45 * var50 + 16384 >> 15;
                var42[2] = var43 * var46 + 16384 >> 15;
                var42[4] = var43 * var47 + 16384 >> 15;
                var42[3] = var43 * var48 + 16384 >> 15;
                int var51 = var42[1] * -class107.field1544 + (var42[0] * -class494.field7292 + (var42[2] * -class523.field7745) + 16384) >> 15;
                int var52 = var42[5] * -class523.field7745 + var42[3] * -class494.field7292 + var42[4] * -class107.field1544 + 16384 >> 15;
                int var53 = var42[7] * -class107.field1544 + (var42[6] * -class494.field7292 + (var42[8] * -class523.field7745)) + 16384 >> 15;
                int var54 = class494.field7292 + var51;
                int var55 = class107.field1544 + var52;
                int var56 = class523.field7745 + var53;
                int[] var57 = new int[9];
                for (int var58 = 0; var58 < 3; var58++) {
                    for (int var87 = 0; var87 < 3; var87++) {
                        int var88 = 0;
                        for (int var89 = 0; var89 < 3; var89++) {
                            var88 += var42[var58 * 3 + var89] * arg7[var87 * 3 + var89];
                        }
                        var57[var58 * 3 + var87] = var88 + 16384 >> 15;
                    }
                }
                int var59 = var42[1] * var34 + var42[0] * var33 - (-(var42[2] * var35) + -16384) >> 15;
                int var60 = var42[4] * var34 + (var42[3] * var33 + (var42[5] * var35)) + 16384 >> 15;
                int var61 = var55 + var60;
                int var62 = var54 + var59;
                int var63 = var42[8] * var35 + var42[7] * var34 + var42[6] * var33 + 16384 >> 15;
                int var64 = var56 + var63;
                int[] var65 = new int[9];
                for (int var66 = 0; var66 < 3; var66++) {
                    for (int var84 = 0; var84 < 3; var84++) {
                        int var85 = 0;
                        for (int var86 = 0; var86 < 3; var86++) {
                            var85 += arg7[var66 * 3 + var86] * var57[var86 * 3 + var84];
                        }
                        var65[var66 * 3 + var84] = var85 + 16384 >> 15;
                    }
                }
                int var67 = arg7[1] * var61 + arg7[0] * var62 - (-(arg7[2] * var64) - 16384) >> 15;
                int var68 = arg7[4] * var61 + (arg7[3] * var62 + (arg7[5] * var64)) + 16384 >> 15;
                int var69 = var31 + var68;
                int var70 = var30 + var67;
                int var71 = arg7[7] * var61 + arg7[6] * var62 - (-(arg7[8] * var64) - 16384) >> 15;
                int var72 = var32 + var71;
                for (int var73 = 0; var73 < var9; var73++) {
                    int var74 = arg1[var73];
                    if (this.field4327.length > var74) {
                        int[] var75 = this.field4327[var74];
                        for (int var76 = 0; var76 < var75.length; var76++) {
                            int var77 = var75[var76];
                            if (this.field4298 == null || (this.field4298[var77] & arg6) != 0) {
                                int var78 = this.field4382[var77] * var65[1] + this.field4371[var77] * var65[2] + this.field4366[var77] * var65[0] + 16384 >> 15;
                                int var79 = this.field4366[var77] * var65[3] + this.field4382[var77] * var65[4] + this.field4371[var77] * var65[5] + 16384 >> 15;
                                int var80 = var69 + var79;
                                int var81 = this.field4371[var77] * var65[8] + this.field4382[var77] * var65[7] + this.field4366[var77] * var65[6] + 16384 >> 15;
                                int var82 = var70 + var78;
                                this.field4366[var77] = var82;
                                int var83 = var72 + var81;
                                this.field4382[var77] = var80;
                                this.field4371[var77] = var83;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var122 = 0; var122 < var9; var122++) {
                    int var123 = arg1[var122];
                    if (this.field4327.length > var123) {
                        int[] var124 = this.field4327[var123];
                        for (int var125 = 0; var125 < var124.length; var125++) {
                            int var126 = var124[var125];
                            if (this.field4298 == null || (arg6 & this.field4298[var126]) != 0) {
                                this.field4366[var126] -= class494.field7292;
                                this.field4382[var126] -= class107.field1544;
                                this.field4371[var126] -= class523.field7745;
                                this.field4366[var126] = this.field4366[var126] * arg2 >> 7;
                                this.field4382[var126] = this.field4382[var126] * arg3 >> 7;
                                this.field4371[var126] = this.field4371[var126] * arg4 >> 7;
                                this.field4366[var126] += class494.field7292;
                                this.field4382[var126] += class107.field1544;
                                this.field4371[var126] += class523.field7745;
                            }
                        }
                    }
                }
            } else {
                int var127 = arg7[9] << 4;
                int var128 = arg7[10] << 4;
                int var129 = arg7[11] << 4;
                int var130 = arg7[12] << 4;
                int var131 = arg7[13] << 4;
                int var132 = arg7[14] << 4;
                if (class524.field7752) {
                    int var133 = arg7[0] * class494.field7292 + arg7[6] * class523.field7745 + arg7[3] * class107.field1544 + 16384 >> 15;
                    int var134 = arg7[1] * class494.field7292 + 16384 - (-(arg7[4] * class107.field1544) - arg7[7] * class523.field7745) >> 15;
                    int var135 = var130 + var133;
                    int var136 = var131 + var134;
                    int var137 = arg7[2] * class494.field7292 + (arg7[5] * class107.field1544) + arg7[8] * class523.field7745 + 16384 >> 15;
                    class107.field1544 = var136;
                    int var138 = var132 + var137;
                    class494.field7292 = var135;
                    class523.field7745 = var138;
                    class524.field7752 = false;
                }
                int var139 = arg2 << 15 >> 7;
                int var140 = arg3 << 15 >> 7;
                int var141 = arg4 << 15 >> 7;
                int var142 = -class494.field7292 * var139 + 16384 >> 15;
                int var143 = -class107.field1544 * var140 + 16384 >> 15;
                int var144 = -class523.field7745 * var141 + 16384 >> 15;
                int var145 = class494.field7292 + var142;
                int var146 = class107.field1544 + var143;
                int var147 = class523.field7745 + var144;
                int[] var148 = new int[] { arg7[0] * var139 + 16384 >> 15, arg7[3] * var139 + 16384 >> 15, arg7[6] * var139 + 16384 >> 15, arg7[1] * var140 + 16384 >> 15, arg7[4] * var140 + 16384 >> 15, arg7[7] * var140 + 16384 >> 15, arg7[2] * var141 + 16384 >> 15, arg7[5] * var141 + 16384 >> 15, arg7[8] * var141 + 16384 >> 15 };
                int var149 = var130 * var139 + 16384 >> 15;
                int var150 = var131 * var140 + 16384 >> 15;
                int var151 = var132 * var141 + 16384 >> 15;
                int var152 = var146 + var150;
                int var153 = var145 + var149;
                int var154 = var147 + var151;
                int[] var155 = new int[9];
                for (int var156 = 0; var156 < 3; var156++) {
                    for (int var174 = 0; var174 < 3; var174++) {
                        int var175 = 0;
                        for (int var176 = 0; var176 < 3; var176++) {
                            var175 += arg7[var156 * 3 + var176] * var148[var176 * 3 + var174];
                        }
                        var155[var156 * 3 + var174] = var175 + 16384 >> 15;
                    }
                }
                int var157 = arg7[2] * var154 + arg7[1] * var152 + arg7[0] * var153 + 16384 >> 15;
                int var158 = arg7[3] * var153 + 16384 - (-(arg7[4] * var152) - (arg7[5] * var154)) >> 15;
                int var159 = var127 + var157;
                int var160 = var128 + var158;
                int var161 = arg7[7] * var152 + arg7[8] * var154 + arg7[6] * var153 + 16384 >> 15;
                int var162 = var129 + var161;
                for (int var163 = 0; var163 < var9; var163++) {
                    int var164 = arg1[var163];
                    if (this.field4327.length > var164) {
                        int[] var165 = this.field4327[var164];
                        for (int var166 = 0; var166 < var165.length; var166++) {
                            int var167 = var165[var166];
                            if (this.field4298 == null || (this.field4298[var167] & arg6) != 0) {
                                int var168 = this.field4366[var167] * var155[0] + this.field4382[var167] * var155[1] + this.field4371[var167] * var155[2] + 16384 >> 15;
                                int var169 = this.field4382[var167] * var155[4] + this.field4366[var167] * var155[3] + (this.field4371[var167] * var155[5]) + 16384 >> 15;
                                int var170 = var159 + var168;
                                int var171 = this.field4371[var167] * var155[8] + this.field4366[var167] * var155[6] + (this.field4382[var167] * var155[7]) + 16384 >> 15;
                                int var172 = var160 + var169;
                                this.field4366[var167] = var170;
                                int var173 = var162 + var171;
                                this.field4382[var167] = var172;
                                this.field4371[var167] = var173;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field4368 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var181 = arg1[var177];
                    if (var181 < this.field4368.length) {
                        int[] var182 = this.field4368[var181];
                        for (int var183 = 0; var183 < var182.length; var183++) {
                            int var184 = var182[var183];
                            if (this.field4353 == null || (arg6 & this.field4353[var184]) != 0) {
                                int var185 = (this.field4320[var184] & 0xFF) + (arg2 * 8);
                                if (var185 < 0) {
                                    var185 = 0;
                                } else if (var185 > 255) {
                                    var185 = 255;
                                }
                                this.field4320[var184] = (byte) var185;
                                if (this.field4310 != null) {
                                    this.field4310.field4626 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field4323 != null) {
                    for (int var178 = 0; var178 < this.field4379; var178++) {
                        class438 var179 = this.field4323[var178];
                        class193 var180 = this.field4282[var178];
                        var180.field2828 = var180.field2828 & 0xFFFFFF | 255 - (this.field4320[var179.field6541] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field4368 != null) {
                for (int var186 = 0; var186 < var9; var186++) {
                    int var190 = arg1[var186];
                    if (var190 < this.field4368.length) {
                        int[] var191 = this.field4368[var190];
                        for (int var192 = 0; var192 < var191.length; var192++) {
                            int var193 = var191[var192];
                            if (this.field4353 == null || (this.field4353[var193] & arg6) != 0) {
                                int var194 = this.field4303[var193] & 0xFFFF;
                                int var195 = (var194 & 0xFF37) >> 10;
                                int var196 = (var194 & 0x3F4) >> 7;
                                int var197 = arg3 / 4 + var196;
                                int var198 = var194 & 0x7F;
                                int var199 = arg2 + var195 & 0x3F;
                                if (var197 < 0) {
                                    var197 = 0;
                                } else if (var197 > 7) {
                                    var197 = 7;
                                }
                                int var200 = arg4 + var198;
                                if (var200 < 0) {
                                    var200 = 0;
                                } else if (var200 > 127) {
                                    var200 = 127;
                                }
                                this.field4303[var193] = (short) class18.method119(class18.method119(var199 << 10, var197 << 7), var200);
                                if (this.field4310 != null) {
                                    this.field4310.field4626 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field4323 != null) {
                    for (int var187 = 0; var187 < this.field4379; var187++) {
                        class438 var188 = this.field4323[var187];
                        class193 var189 = this.field4282[var187];
                        var189.field2828 = var189.field2828 & 0xFF000000 | class508.field7410[this.field4303[var188.field6541] & 0xFFFF] & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field4349 != null) {
                for (int var201 = 0; var201 < var9; var201++) {
                    int var202 = arg1[var201];
                    if (var202 < this.field4349.length) {
                        int[] var203 = this.field4349[var202];
                        for (int var204 = 0; var204 < var203.length; var204++) {
                            class193 var205 = this.field4282[var203[var204]];
                            var205.field2830 += arg3;
                            var205.field2823 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field4349 != null) {
                for (int var206 = 0; var206 < var9; var206++) {
                    int var207 = arg1[var206];
                    if (var207 < this.field4349.length) {
                        int[] var208 = this.field4349[var207];
                        for (int var209 = 0; var209 < var208.length; var209++) {
                            class193 var210 = this.field4282[var208[var209]];
                            var210.field2826 = var210.field2826 * arg3 >> 7;
                            var210.field2831 = var210.field2831 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field4349 != null) {
            for (int var211 = 0; var211 < var9; var211++) {
                int var212 = arg1[var211];
                if (var212 < this.field4349.length) {
                    int[] var213 = this.field4349[var212];
                    for (int var214 = 0; var214 < var213.length; var214++) {
                        class193 var215 = this.field4282[var213[var214]];
                        var215.field2833 = var215.field2833 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "Q", descriptor = "()I", line = 1350)
    public final int method716() {
        field4309++;
        return this.field4345;
    }

    @OriginalMember(owner = "client!vj", name = "K", descriptor = "(IIII)V", line = 1358)
    public final void method741(int arg0, int arg1, int arg2, int arg3) {
        field4290++;
        if (arg0 == 0) {
            class494.field7292 = 0;
            class523.field7745 = 0;
            class107.field1544 = 0;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field4359; var6++) {
                class494.field7292 += this.field4366[var6];
                class107.field1544 += this.field4382[var6];
                class523.field7745 += this.field4371[var6];
                var5++;
            }
            if (var5 > 0) {
                class107.field1544 = class107.field1544 / var5 + arg2;
                class523.field7745 = class523.field7745 / var5 + arg3;
                class494.field7292 = class494.field7292 / var5 + arg1;
            } else {
                class523.field7745 = arg3;
                class107.field1544 = arg2;
                class494.field7292 = arg1;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field4359; var7++) {
                this.field4366[var7] += arg1;
                this.field4382[var7] += arg2;
                this.field4371[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field4359; var8++) {
                this.field4366[var8] -= class494.field7292;
                this.field4382[var8] -= class107.field1544;
                this.field4371[var8] -= class523.field7745;
                if (arg3 != 0) {
                    int var9 = class457.field6760[arg3];
                    int var10 = class457.field6759[arg3];
                    int var11 = this.field4382[var8] * var9 + (this.field4366[var8] * var10) + 32767 >> 15;
                    this.field4382[var8] = this.field4382[var8] * var10 + 32767 - (this.field4366[var8] * var9) >> 15;
                    this.field4366[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class457.field6760[arg1];
                    int var13 = class457.field6759[arg1];
                    int var14 = this.field4382[var8] * var13 - (this.field4371[var8] * var12 - 32767) >> 15;
                    this.field4371[var8] = this.field4382[var8] * var12 + (this.field4371[var8] * var13) + 32767 >> 15;
                    this.field4382[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class457.field6760[arg2];
                    int var16 = class457.field6759[arg2];
                    int var17 = this.field4371[var8] * var15 - (-(this.field4366[var8] * var16) - 32767) >> 15;
                    this.field4371[var8] = this.field4371[var8] * var16 + 32767 - this.field4366[var8] * var15 >> 15;
                    this.field4366[var8] = var17;
                }
                this.field4366[var8] += class494.field7292;
                this.field4382[var8] += class107.field1544;
                this.field4371[var8] += class523.field7745;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field4359; var18++) {
                this.field4366[var18] -= class494.field7292;
                this.field4382[var18] -= class107.field1544;
                this.field4371[var18] -= class523.field7745;
                this.field4366[var18] = this.field4366[var18] * arg1 / 128;
                this.field4382[var18] = this.field4382[var18] * arg2 / 128;
                this.field4371[var18] = this.field4371[var18] * arg3 / 128;
                this.field4366[var18] += class494.field7292;
                this.field4382[var18] += class107.field1544;
                this.field4371[var18] += class523.field7745;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field4312; var19++) {
                int var23 = (this.field4320[var19] & 0xFF) + (arg1 * 8);
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field4320[var19] = (byte) var23;
            }
            if (this.field4310 != null) {
                this.field4310.field4626 = null;
            }
            if (this.field4323 != null) {
                for (int var20 = 0; var20 < this.field4379; var20++) {
                    class438 var21 = this.field4323[var20];
                    class193 var22 = this.field4282[var20];
                    var22.field2828 = 255 - (this.field4320[var21.field6541] & 0xFF) << 24 | var22.field2828 & 0xFFFFFF;
                }
            }
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field4312; var24++) {
                int var28 = this.field4303[var24] & 0xFFFF;
                int var29 = var28 >> 10 & 0x3F;
                int var30 = var28 >> 7 & 0x7;
                int var31 = var28 & 0x7F;
                int var32 = arg2 / 4 + var30;
                int var33 = arg1 + var29 & 0x3F;
                if (var32 < 0) {
                    var32 = 0;
                } else if (var32 > 7) {
                    var32 = 7;
                }
                int var34 = arg3 + var31;
                if (var34 < 0) {
                    var34 = 0;
                } else if (var34 > 127) {
                    var34 = 127;
                }
                this.field4303[var24] = (short) class18.method119(class18.method119(var33 << 10, var32 << 7), var34);
            }
            if (this.field4310 != null) {
                this.field4310.field4626 = null;
            }
            if (this.field4323 != null) {
                for (int var25 = 0; var25 < this.field4379; var25++) {
                    class438 var26 = this.field4323[var25];
                    class193 var27 = this.field4282[var25];
                    var27.field2828 = class508.field7410[this.field4303[var26.field6541] & 0xFFFF] & 0xFFFFFF | var27.field2828 & 0xFF000000;
                }
            }
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field4379; var35++) {
                class193 var36 = this.field4282[var35];
                var36.field2823 += arg1;
                var36.field2830 += arg2;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field4379; var37++) {
                class193 var38 = this.field4282[var37];
                var38.field2831 = var38.field2831 * arg1 >> 7;
                var38.field2826 = var38.field2826 * arg2 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field4379; var39++) {
                class193 var40 = this.field4282[var39];
                var40.field2833 = var40.field2833 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "FA", descriptor = "()Z", line = 1666)
    public final boolean method715() {
        field4356++;
        if (this.field4327 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field4299; var1++) {
            this.field4366[var1] <<= 0x4;
            this.field4382[var1] <<= 0x4;
            this.field4371[var1] <<= 0x4;
        }
        class494.field7292 = 0;
        class107.field1544 = 0;
        class523.field7745 = 0;
        return true;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZILjava/lang/String;)V", line = 1698)
    public static final void method1908(boolean arg0, int arg1, String arg2) {
        field4287++;
        int var3 = class74.field1105;
        int[] var4 = class272.field3948;
        boolean var5 = false;
        for (int var6 = 0; var6 < var3; var6++) {
            class239 var7 = class44.field707[var4[var6]];
            if (var7 != null && class500.field7365 != var7 && var7.field3548 != null && var7.field3548.equalsIgnoreCase(arg2)) {
                var5 = true;
                if (arg1 == 1) {
                    class69.field1053++;
                    class291.method1861((byte) -104, class337.field4739);
                    class356.field5471.method1429((byte) -127, var4[var6]);
                    class356.field5471.method1408(0, -1244);
                } else if (arg1 == 4) {
                    class259.field3820++;
                    class291.method1861((byte) -104, class25.field269);
                    class356.field5471.method1410(0, -27645);
                    class356.field5471.method1429((byte) -123, var4[var6]);
                } else if (arg1 == 5) {
                    class291.method1861((byte) -104, class326.field4649);
                    class151.field2250++;
                    class356.field5471.method1410(0, -27645);
                    class356.field5471.method1439(-113, var4[var6]);
                } else if (arg1 == 6) {
                    class318.field4567++;
                    class291.method1861((byte) -104, class150.field2228);
                    class356.field5471.method1467(0, 0);
                    class356.field5471.method1437(var4[var6], 81);
                } else if (arg1 == 7) {
                    class182.field2662++;
                    class291.method1861((byte) -104, class219.field3209);
                    class356.field5471.method1408(0, -1244);
                    class356.field5471.method1439(107, var4[var6]);
                }
                break;
            }
        }
        if (!var5) {
            class61.method359(class337.field4740.method2838(false, class143.field2137) + arg2, (byte) -71);
        }
        if (!arg0) {
            field4293 = -17;
        }
    }

    @OriginalMember(owner = "client!vj", name = "ra", descriptor = "()I", line = 1780)
    public final int method711() {
        if (!this.field4313) {
            this.method1917(-7534);
        }
        field4380++;
        return this.field4350;
    }

    @OriginalMember(owner = "client!vj", name = "E", descriptor = "()I", line = 1794)
    public final int method743() {
        field4357++;
        if (!this.field4313) {
            this.method1917(-7534);
        }
        return this.field4373;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIII)V", line = 1808)
    public final void method742(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field4312; var5++) {
            int var9 = this.field4303[var5] & 0xFFFF;
            int var10 = (var9 & 0xFFF6) >> 10;
            int var11 = (var9 & 0x3D9) >> 7;
            int var12 = var9 & 0x7F;
            if (arg0 != -1) {
                var10 += (arg0 - var10) * arg3 >> 7;
            }
            if (arg1 != -1) {
                var11 += (arg1 - var11) * arg3 >> 7;
            }
            if (arg2 != -1) {
                var12 -= -((arg2 - var12) * arg3 >> 7);
            }
            this.field4303[var5] = (short) class18.method119(class18.method119(var11 << 7, var10 << 10), var12);
        }
        field4374++;
        if (this.field4323 != null) {
            for (int var6 = 0; var6 < this.field4379; var6++) {
                class438 var7 = this.field4323[var6];
                class193 var8 = this.field4282[var6];
                var8.field2828 = var8.field2828 & 0xFF000000 | class508.field7410[this.field4303[var7.field6541] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field4310 != null) {
            this.field4310.field4626 = null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "ua", descriptor = "(Lj;)Lj;", line = 1867)
    public final class377 method745(class377 arg0) {
        field4386++;
        if (this.field4337 == 0) {
            return null;
        }
        if (!this.field4313) {
            this.method1917(-7534);
        }
        int var2;
        int var3;
        if (this.field4344.field5300 <= 0) {
            var2 = this.field4363 - (this.field4344.field5300 * this.field4308 >> 8) >> this.field4344.field5231;
            var3 = this.field4375 - (this.field4344.field5300 * this.field4373 >> 8) >> this.field4344.field5231;
        } else {
            var2 = this.field4363 - (this.field4344.field5300 * this.field4373 >> 8) >> this.field4344.field5231;
            var3 = this.field4375 - (this.field4344.field5300 * this.field4308 >> 8) >> this.field4344.field5231;
        }
        int var4;
        int var5;
        if (this.field4344.field5322 <= 0) {
            var4 = this.field4285 - (this.field4344.field5322 * this.field4308 >> 8) >> this.field4344.field5231;
            var5 = this.field4333 - (this.field4344.field5322 * this.field4373 >> 8) >> this.field4344.field5231;
        } else {
            var4 = this.field4285 - (this.field4344.field5322 * this.field4373 >> 8) >> this.field4344.field5231;
            var5 = this.field4333 - (this.field4344.field5322 * this.field4308 >> 8) >> this.field4344.field5231;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class478 var8 = (class478) arg0;
        class478 var9;
        if (var8 != null && var8.method2851(var7, true, var6)) {
            var9 = var8;
            var8.method2847((byte) -32);
        } else {
            var9 = new class478(this.field4344, var6, var7);
        }
        var9.method2852(var4, -11470, var2, var5, var3);
        this.method1912(var9, -32209);
        return var9;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(BIIIS)I", line = 1930)
    private final int method1909(byte arg0, int arg1, int arg2, int arg3, short arg4) {
        field4289++;
        if (arg3 > -67) {
            return -25;
        }
        int var6 = class508.field7410[class66.method391(83, arg2, arg1)];
        if (arg4 != -1) {
            class321 var7 = this.field4344.field2379.method838(true, arg4 & 0xFFFF);
            int var8 = var7.field4604 & 0xFF;
            if (var8 != 0) {
                int var9;
                if (arg2 < 0) {
                    var9 = 0;
                } else if (arg2 > 127) {
                    var9 = 16777215;
                } else {
                    var9 = arg2 * 131586;
                }
                if (var8 == 256) {
                    var6 = var9;
                } else {
                    int var11 = 256 - var8;
                    var6 = ((var6 & 0xFF00FF) * var11 + (var9 & 0xFF00FF) * var8 & 0xFF00FF00) + ((var6 & 0xFF00) * var11 + (var9 & 0xFF00) * var8 & 0xFF0000) >> 8;
                }
            }
            int var12 = var7.field4594 & 0xFF;
            if (var12 != 0) {
                var12 += 256;
                int var13 = (var6 >> 16 & 0xFF) * var12;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (var6 >> 8 & 0xFF) * var12;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                int var15 = (var6 & 0xFF) * var12;
                if (var15 > 65535) {
                    var15 = 65535;
                }
                var6 = (var15 >> 8) + ((var13 & 0xFF00FF00) << 8) + (var14 & 0xFF00);
            }
        }
        return (var6 << 8) + 255 - (arg0 & 0xFF);
    }

    @OriginalMember(owner = "client!vj", name = "ja", descriptor = "(III)V", line = 2001)
    public final void method739(int arg0, int arg1, int arg2) {
        field4283++;
        for (int var4 = 0; var4 < this.field4359; var4++) {
            if (arg0 != 0) {
                this.field4366[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field4382[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field4371[var4] += arg2;
            }
        }
        this.field4313 = false;
        if (this.field4387 != null) {
            this.field4387.field4626 = null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "()[Lu;", line = 2038)
    public final class52[] method747() {
        field4347++;
        return this.field4361;
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "()[Lat;", line = 2047)
    public final class255[] method703() {
        field4377++;
        return this.field4280;
    }

    @OriginalMember(owner = "client!vj", name = "N", descriptor = "(SS)V", line = 2056)
    public final void method713(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field4312; var3++) {
            if (this.field4303[var3] == arg0) {
                this.field4303[var3] = arg1;
            }
        }
        field4302++;
        if (this.field4323 != null) {
            for (int var4 = 0; var4 < this.field4379; var4++) {
                class438 var5 = this.field4323[var4];
                class193 var6 = this.field4282[var4];
                var6.field2828 = class508.field7410[this.field4303[var5.field6541] & 0xFFFF] & 0xFFFFFF | var6.field2828 & 0xFF000000;
            }
        }
        if (this.field4310 != null) {
            this.field4310.field4626 = null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ILdj;)V", line = 2103)
    private final void method1910(int arg0, class227 arg1) {
        if (this.field4361 != null) {
            for (int var3 = 0; var3 < this.field4361.length; var3++) {
                class52 var4 = this.field4361[var3];
                class52 var5 = var4;
                if (var4.field831 != null) {
                    var5 = var4.field831;
                }
                var5.field813 = (int) ((float) this.field4371[var4.field808] * arg1.field3349 + (float) this.field4382[var4.field808] * arg1.field3334 + (float) this.field4366[var4.field808] * arg1.field3347 + arg1.field3341);
                var5.field809 = (int) ((float) this.field4371[var4.field808] * arg1.field3335 + (float) this.field4382[var4.field808] * arg1.field3355 + (float) this.field4366[var4.field808] * arg1.field3346 + arg1.field3348);
                var5.field818 = (int) ((float) this.field4371[var4.field808] * arg1.field3338 + (float) this.field4382[var4.field808] * arg1.field3352 + (float) this.field4366[var4.field808] * arg1.field3329 + arg1.field3344);
                var5.field812 = (int) ((float) this.field4371[var4.field815] * arg1.field3349 + (float) this.field4382[var4.field815] * arg1.field3334 + (float) this.field4366[var4.field815] * arg1.field3347 + arg1.field3341);
                var5.field827 = (int) ((float) this.field4371[var4.field815] * arg1.field3335 + (float) this.field4382[var4.field815] * arg1.field3355 + (float) this.field4366[var4.field815] * arg1.field3346 + arg1.field3348);
                var5.field828 = (int) ((float) this.field4371[var4.field815] * arg1.field3338 + (float) this.field4382[var4.field815] * arg1.field3352 + (float) this.field4366[var4.field815] * arg1.field3329 + arg1.field3344);
                var5.field826 = (int) ((float) this.field4371[var4.field811] * arg1.field3349 + (float) this.field4382[var4.field811] * arg1.field3334 + (float) this.field4366[var4.field811] * arg1.field3347 + arg1.field3341);
                var5.field830 = (int) ((float) this.field4371[var4.field811] * arg1.field3335 + (float) this.field4382[var4.field811] * arg1.field3355 + (float) this.field4366[var4.field811] * arg1.field3346 + arg1.field3348);
                var5.field816 = (int) ((float) this.field4371[var4.field811] * arg1.field3338 + (float) this.field4382[var4.field811] * arg1.field3352 + (float) this.field4366[var4.field811] * arg1.field3329 + arg1.field3344);
            }
        }
        field4311++;
        if (arg0 != 448) {
            this.method746();
        }
        if (this.field4280 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field4280.length; var6++) {
            class255 var7 = this.field4280[var6];
            class255 var8 = var7;
            if (var7.field3779 != null) {
                var8 = var7.field3779;
            }
            if (var7.field3774 == null) {
                var7.field3774 = arg1.method910();
            } else {
                var7.field3774.method903(arg1);
            }
            var8.field3776 = (int) ((float) this.field4371[var7.field3777] * arg1.field3349 + (float) this.field4382[var7.field3777] * arg1.field3334 + (float) this.field4366[var7.field3777] * arg1.field3347 + arg1.field3341);
            var8.field3782 = (int) ((float) this.field4371[var7.field3777] * arg1.field3335 + (float) this.field4382[var7.field3777] * arg1.field3355 + (float) this.field4366[var7.field3777] * arg1.field3346 + arg1.field3348);
            var8.field3773 = (int) ((float) this.field4371[var7.field3777] * arg1.field3338 + (float) this.field4382[var7.field3777] * arg1.field3352 + (float) this.field4366[var7.field3777] * arg1.field3329 + arg1.field3344);
        }
    }

    @OriginalMember(owner = "client!vj", name = "n", descriptor = "()I", line = 2170)
    public final int method738() {
        field4384++;
        return this.field4316;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lrb;III)V", line = 2178)
    public static final void method1911(class234 arg0, int arg1, int arg2, int arg3) {
        field4332++;
        class491.field7281[arg1][arg2] = arg0;
        if (arg3 != 0) {
            field4293 = -26;
        }
    }

    @OriginalMember(owner = "client!vj", name = "oa", descriptor = "(I)V", line = 2189)
    public final void method732(int arg0) {
        field4388++;
        this.field4345 = (short) arg0;
        if (this.field4310 != null) {
            this.field4310.field4626 = null;
        }
        if (this.field4329 != null) {
            this.field4329.field4626 = null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "X", descriptor = "()I", line = 2207)
    public final int method717() {
        if (!this.field4313) {
            this.method1917(-7534);
        }
        field4325++;
        return this.field4285;
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "()I", line = 2221)
    public final int method709() {
        if (!this.field4313) {
            this.method1917(-7534);
        }
        field4328++;
        return this.field4308;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lqf;I)V", line = 2234)
    private final void method1912(class478 arg0, int arg1) {
        if (this.field4337 > class52.field824.length) {
            class450.field6708 = new int[this.field4337];
            class52.field824 = new int[this.field4337];
        }
        field4348++;
        for (int var3 = 0; var3 < this.field4359; var3++) {
            int var14 = (this.field4366[var3] - (this.field4382[var3] * this.field4344.field5300 >> 8) >> this.field4344.field5231) - arg0.field7017;
            int var15 = (this.field4371[var3] - (this.field4382[var3] * this.field4344.field5322 >> 8) >> this.field4344.field5231) - arg0.field7029;
            int var16 = this.field4314[var3];
            int var17 = this.field4314[var3 + 1];
            for (int var18 = var16; var18 < var17; var18++) {
                int var19 = this.field4294[var18] - 1;
                if (var19 == -1) {
                    break;
                }
                class52.field824[var19] = var14;
                class450.field6708[var19] = var15;
            }
        }
        if (arg1 != -32209) {
            this.field4296 = null;
        }
        for (int var4 = 0; var4 < this.field4341; var4++) {
            if (this.field4320 == null || this.field4320[var4] <= 128) {
                short var5 = this.field4317[var4];
                short var6 = this.field4351[var4];
                short var7 = this.field4305[var4];
                int var8 = class52.field824[var5];
                int var9 = class52.field824[var6];
                int var10 = class52.field824[var7];
                int var11 = class450.field6708[var5];
                int var12 = class450.field6708[var6];
                int var13 = class450.field6708[var7];
                if ((var8 - var9) * (var12 - var13) - (var10 - var9) * (var12 - var11) > 0) {
                    arg0.method2846(var10, (byte) -24, var12, var8, var11, var13, var9);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Lod;)V", line = 5660)
    public class304(class349 arg0) {
        this.field4344 = arg0;
        this.field4387 = new class323(null, 5126, 3, 0);
        this.field4365 = new class323(null, 5126, 2, 0);
        this.field4329 = new class323(null, 5126, 3, 0);
        this.field4310 = new class323(null, 5121, 4, 0);
        this.field4297 = new class142();
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Lod;Lqc;IIII)V", line = 5672)
    public class304(class349 arg0, class521 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4319 = arg5;
        this.field4316 = arg2;
        this.field4344 = arg0;
        if (class115.method766((byte) -66, arg2, arg5)) {
            this.field4387 = new class323(null, 5126, 3, 0);
        }
        if (class397.method2402((byte) -82, arg2, arg5)) {
            this.field4365 = new class323(null, 5126, 2, 0);
        }
        if (class166.method1153(arg2, -59, arg5)) {
            this.field4329 = new class323(null, 5126, 3, 0);
        }
        if (class517.method3046(0, arg5, arg2)) {
            this.field4310 = new class323(null, 5121, 4, 0);
        }
        if (class394.method2391(arg2, arg5, true)) {
            this.field4297 = new class142();
        }
        class126 var7 = arg0.field2379;
        this.field4314 = new int[arg1.field7695 + 1];
        int[] var8 = new int[arg1.field7671];
        for (int var9 = 0; var9 < arg1.field7671; var9++) {
            if ((arg1.field7692 == null || arg1.field7692[var9] != 2) && (arg1.field7712 == null || arg1.field7712[var9] == -1 || !var7.method838(true, arg1.field7712[var9] & 0xFFFF).field4600)) {
                var8[this.field4312++] = var9;
                this.field4314[arg1.field7718[var9]]++;
                this.field4314[arg1.field7713[var9]]++;
                this.field4314[arg1.field7670[var9]]++;
            }
        }
        this.field4341 = this.field4312;
        long[] var10 = new long[this.field4312];
        boolean var11 = (this.field4316 & 0x100) != 0;
        label494: for (int var12 = 0; var12 < this.field4312; var12++) {
            int var180 = var8[var12];
            class321 var181 = null;
            int var182 = 0;
            byte var183 = 0;
            byte var184 = 0;
            byte var185 = 0;
            if (arg1.field7707 != null) {
                for (int var186 = 0; var186 < arg1.field7707.length; var186++) {
                    class287 var187 = arg1.field7707[var186];
                    if (var187.field4109 == var180) {
                        class54 var188 = class477.method2844(var187.field4115, (byte) -115);
                        if (var188.field840) {
                            var10[var12] = Long.MAX_VALUE;
                            this.field4341--;
                            continue label494;
                        }
                    }
                }
            }
            short var189 = -1;
            if (arg1.field7712 != null) {
                var189 = arg1.field7712[var180];
                if (var189 != -1) {
                    var181 = var7.method838(true, var189 & 0xFFFF);
                    var185 = var181.field4601;
                    var184 = var181.field4585;
                }
            }
            boolean var190 = arg1.field7684 != null && arg1.field7684[var180] != 0 || var181 != null && !var181.field4596;
            if ((var11 || var190) && arg1.field7690 != null) {
                var182 += arg1.field7690[var180] << 17;
            }
            if (var190) {
                var182 += 65536;
            }
            int var191 = ((var184 & 0xFF) << 8) + var182;
            int var192 = (var185 & 0xFF) + var191;
            int var193 = ((var189 & 0xFFFF) << 16) + var183;
            int var194 = (var12 & 0xFFFF) + var193;
            var10[var12] = ((long) var192 << 32) + (long) var194;
        }
        class366.method2273(var8, (byte) -125, var10);
        this.field4359 = arg1.field7695;
        this.field4371 = arg1.field7674;
        this.field4298 = arg1.field7698;
        this.field4299 = arg1.field7689;
        this.field4382 = arg1.field7694;
        this.field4366 = arg1.field7705;
        this.field4280 = arg1.field7711;
        this.field4361 = arg1.field7683;
        class421[] var13 = new class421[this.field4359];
        if (arg1.field7707 != null) {
            this.field4379 = arg1.field7707.length;
            this.field4323 = new class438[this.field4379];
            this.field4282 = new class193[this.field4379];
            for (int var14 = 0; var14 < this.field4379; var14++) {
                class287 var15 = arg1.field7707[var14];
                class54 var16 = class477.method2844(var15.field4115, (byte) 35);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field4312; var18++) {
                    if (var8[var18] == var15.field4109) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class508.field7410[arg1.field7673[var15.field4109] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field7684 == null ? 0 : arg1.field7684[var15.field4109]) << 24;
                this.field4323[var14] = new class438(var17, arg1.field7718[var15.field4109], arg1.field7713[var15.field4109], arg1.field7670[var15.field4109], var16.field839, var16.field846, var16.field845, var16.field847, var16.field843, var16.field840, var16.field844, var15.field4108);
                this.field4282[var14] = new class193(var20);
            }
        }
        int var21 = this.field4312 * 3;
        this.field4331 = new byte[var21];
        this.field4322 = new short[var21];
        this.field4381 = new short[var21];
        this.field4351 = new short[this.field4312];
        this.field4320 = new byte[this.field4312];
        this.field4317 = new short[this.field4312];
        if (arg1.field7708 != null) {
            this.field4353 = new short[this.field4312];
        }
        this.field4294 = new short[var21];
        this.field4303 = new short[this.field4312];
        this.field4343 = new float[var21];
        this.field4321 = (short) arg3;
        this.field4284 = new float[var21];
        this.field4345 = (short) arg4;
        this.field4304 = new short[this.field4312];
        this.field4370 = new short[var21];
        this.field4305 = new short[this.field4312];
        class196.field2863 = new long[var21];
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field7695; var23++) {
            int var179 = this.field4314[var23];
            this.field4314[var23] = var22;
            var22 += var179;
            var13[var23] = new class421();
        }
        this.field4314[arg1.field7695] = var22;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = null;
        if (arg1.field7681 != null) {
            int var28 = arg1.field7685;
            int[] var29 = new int[var28];
            int[] var30 = new int[var28];
            int[] var31 = new int[var28];
            int[] var32 = new int[var28];
            int[] var33 = new int[var28];
            int[] var34 = new int[var28];
            for (int var35 = 0; var35 < var28; var35++) {
                var29[var35] = Integer.MAX_VALUE;
                var30[var35] = -2147483647;
                var31[var35] = Integer.MAX_VALUE;
                var32[var35] = -2147483647;
                var33[var35] = Integer.MAX_VALUE;
                var34[var35] = -2147483647;
            }
            var27 = new float[var28][];
            for (int var36 = 0; var36 < this.field4312; var36++) {
                int var43 = var8[var36];
                if (arg1.field7681[var43] != -1) {
                    int var44 = arg1.field7681[var43] & 0xFF;
                    for (int var45 = 0; var45 < 3; var45++) {
                        short var46;
                        if (var45 == 0) {
                            var46 = arg1.field7718[var43];
                        } else if (var45 == 1) {
                            var46 = arg1.field7713[var43];
                        } else {
                            var46 = arg1.field7670[var43];
                        }
                        int var47 = arg1.field7705[var46];
                        int var48 = arg1.field7694[var46];
                        int var49 = arg1.field7674[var46];
                        if (var47 < var29[var44]) {
                            var29[var44] = var47;
                        }
                        if (var30[var44] < var47) {
                            var30[var44] = var47;
                        }
                        if (var31[var44] > var48) {
                            var31[var44] = var48;
                        }
                        if (var32[var44] < var48) {
                            var32[var44] = var48;
                        }
                        if (var49 < var33[var44]) {
                            var33[var44] = var49;
                        }
                        if (var49 > var34[var44]) {
                            var34[var44] = var49;
                        }
                    }
                }
            }
            var24 = new int[var28];
            var26 = new int[var28];
            var25 = new int[var28];
            for (int var37 = 0; var37 < var28; var37++) {
                byte var38 = arg1.field7719[var37];
                if (var38 > 0) {
                    var24[var37] = (var29[var37] + var30[var37]) / 2;
                    var25[var37] = (var31[var37] + var32[var37]) / 2;
                    var26[var37] = (var33[var37] + var34[var37]) / 2;
                    float var39;
                    float var40;
                    float var41;
                    if (var38 == 1) {
                        int var42 = arg1.field7716[var37];
                        if (var42 == 0) {
                            var39 = 1.0F;
                            var41 = 1.0F;
                        } else if (var42 > 0) {
                            var41 = 1.0F;
                            var39 = (float) var42 / 1024.0F;
                        } else {
                            var39 = 1.0F;
                            var41 = (float) (-var42) / 1024.0F;
                        }
                        var40 = 64.0F / (float) arg1.field7709[var37];
                    } else if (var38 == 2) {
                        var39 = 64.0F / (float) arg1.field7693[var37];
                        var40 = 64.0F / (float) arg1.field7709[var37];
                        var41 = 64.0F / (float) arg1.field7716[var37];
                    } else {
                        var39 = (float) arg1.field7693[var37] / 1024.0F;
                        var40 = (float) arg1.field7709[var37] / 1024.0F;
                        var41 = (float) arg1.field7716[var37] / 1024.0F;
                    }
                    var27[var37] = class80.method465(var39, arg1.field7676[var37], arg1.field7691[var37], class286.method1847(255, arg1.field7669[var37]), arg1.field7696[var37], var41, var40, (byte) -122);
                }
            }
        }
        class134[] var50 = new class134[arg1.field7671];
        for (int var51 = 0; var51 < arg1.field7671; var51++) {
            short var158 = arg1.field7718[var51];
            short var159 = arg1.field7713[var51];
            short var160 = arg1.field7670[var51];
            int var161 = this.field4366[var159] - this.field4366[var158];
            int var162 = this.field4382[var159] - this.field4382[var158];
            int var163 = this.field4371[var159] - this.field4371[var158];
            int var164 = this.field4366[var160] - this.field4366[var158];
            int var165 = this.field4382[var160] - this.field4382[var158];
            int var166 = this.field4371[var160] - this.field4371[var158];
            int var167 = var162 * var166 - (var163 * var165);
            int var168 = var163 * var164 - var161 * var166;
            int var169;
            for (var169 = var161 * var165 - (var162 * var164); var167 > 8192 || var168 > 8192 || var169 > 8192 || var167 < -8192 || var168 < -8192 || var169 < -8192; var169 >>= 0x1) {
                var167 >>= 0x1;
                var168 >>= 0x1;
            }
            int var170 = (int) Math.sqrt((double) (var169 * var169 + var167 * var167 + var168 * var168));
            if (var170 <= 0) {
                var170 = 1;
            }
            int var171 = var167 * 256 / var170;
            int var172 = var168 * 256 / var170;
            int var173 = var169 * 256 / var170;
            byte var174 = arg1.field7692 == null ? 0 : arg1.field7692[var51];
            if (var174 == 0) {
                class421 var176 = var13[var158];
                var176.field6337 += var172;
                var176.field6328 += var173;
                var176.field6333 += var171;
                var176.field6330++;
                class421 var177 = var13[var159];
                var177.field6328 += var173;
                var177.field6337 += var172;
                var177.field6330++;
                var177.field6333 += var171;
                class421 var178 = var13[var160];
                var178.field6337 += var172;
                var178.field6328 += var173;
                var178.field6333 += var171;
                var178.field6330++;
            } else if (var174 == 1) {
                class134 var175 = var50[var51] = new class134();
                var175.field2054 = var173;
                var175.field2051 = var172;
                var175.field2049 = var171;
            }
        }
        for (int var52 = 0; var52 < this.field4312; var52++) {
            int var68 = var8[var52];
            int var69 = arg1.field7673[var68] & 0xFFFF;
            short var70;
            if (arg1.field7712 == null) {
                var70 = -1;
            } else {
                var70 = arg1.field7712[var68];
            }
            int var71;
            if (arg1.field7681 == null) {
                var71 = -1;
            } else {
                var71 = arg1.field7681[var68];
            }
            int var72;
            if (arg1.field7684 == null) {
                var72 = 0;
            } else {
                var72 = arg1.field7684[var68] & 0xFF;
            }
            float var73 = 0.0F;
            float var74 = 0.0F;
            float var75 = 0.0F;
            float var76 = 0.0F;
            float var77 = 0.0F;
            float var78 = 0.0F;
            byte var79 = 0;
            byte var80 = 0;
            int var81 = 0;
            if (var70 != -1) {
                if (var71 == -1) {
                    var77 = 0.0F;
                    var80 = 2;
                    var75 = 1.0F;
                    var78 = 0.0F;
                    var73 = 0.0F;
                    var76 = 1.0F;
                    var79 = 1;
                    var74 = 1.0F;
                } else {
                    var71 &= 0xFF;
                    byte var82 = arg1.field7719[var71];
                    if (var82 == 0) {
                        short var111 = arg1.field7718[var68];
                        short var112 = arg1.field7713[var68];
                        short var113 = arg1.field7670[var68];
                        short var114 = arg1.field7696[var71];
                        short var115 = arg1.field7676[var71];
                        short var116 = arg1.field7691[var71];
                        float var117 = (float) arg1.field7705[var114];
                        float var118 = (float) arg1.field7694[var114];
                        float var119 = (float) arg1.field7674[var114];
                        float var120 = (float) arg1.field7705[var115] - var117;
                        float var121 = (float) arg1.field7694[var115] - var118;
                        float var122 = (float) arg1.field7674[var115] - var119;
                        float var123 = (float) arg1.field7705[var116] - var117;
                        float var124 = (float) arg1.field7694[var116] - var118;
                        float var125 = (float) arg1.field7674[var116] - var119;
                        float var126 = (float) arg1.field7705[var111] - var117;
                        float var127 = (float) arg1.field7694[var111] - var118;
                        float var128 = (float) arg1.field7674[var111] - var119;
                        float var129 = (float) arg1.field7705[var112] - var117;
                        float var130 = (float) arg1.field7694[var112] - var118;
                        float var131 = (float) arg1.field7674[var112] - var119;
                        float var132 = (float) arg1.field7705[var113] - var117;
                        float var133 = (float) arg1.field7694[var113] - var118;
                        float var134 = (float) arg1.field7674[var113] - var119;
                        float var135 = var121 * var125 - var122 * var124;
                        float var136 = var122 * var123 - var120 * var125;
                        float var137 = var120 * var124 - var121 * var123;
                        float var138 = var124 * var137 - var125 * var136;
                        float var139 = var125 * var135 - (var123 * var137);
                        float var140 = var123 * var136 - var124 * var135;
                        float var141 = 1.0F / (var122 * var140 + var120 * var138 + var121 * var139);
                        var73 = (var128 * var140 + var126 * var138 + var127 * var139) * var141;
                        var75 = (var131 * var140 + var129 * var138 + var130 * var139) * var141;
                        var77 = (var134 * var140 + var132 * var138 + var133 * var139) * var141;
                        float var142 = var122 * var135 - var120 * var137;
                        float var143 = var121 * var137 - var122 * var136;
                        float var144 = var120 * var136 - (var121 * var135);
                        float var145 = 1.0F / (var125 * var144 + var123 * var143 + var124 * var142);
                        var74 = (var128 * var144 + var126 * var143 + var127 * var142) * var145;
                        var78 = (var134 * var144 + var132 * var143 + var133 * var142) * var145;
                        var76 = (var131 * var144 + var129 * var143 + var130 * var142) * var145;
                    } else {
                        short var83 = arg1.field7718[var68];
                        short var84 = arg1.field7713[var68];
                        short var85 = arg1.field7670[var68];
                        int var86 = var24[var71];
                        int var87 = var25[var71];
                        int var88 = var26[var71];
                        float[] var89 = var27[var71];
                        byte var90 = arg1.field7714[var71];
                        float var91 = (float) arg1.field7675[var71] / 256.0F;
                        if (var82 == 1) {
                            float var92 = (float) arg1.field7693[var71] / 1024.0F;
                            class214.method1491(var86, 126, arg1.field7705[var83], var87, var92, var89, arg1.field7694[var83], var88, var91, arg1.field7674[var83], var90);
                            var73 = class317.field4550;
                            var74 = class493.field7290;
                            class214.method1491(var86, 108, arg1.field7705[var84], var87, var92, var89, arg1.field7694[var84], var88, var91, arg1.field7674[var84], var90);
                            var76 = class493.field7290;
                            var75 = class317.field4550;
                            class214.method1491(var86, 102, arg1.field7705[var85], var87, var92, var89, arg1.field7694[var85], var88, var91, arg1.field7674[var85], var90);
                            var78 = class493.field7290;
                            var77 = class317.field4550;
                            float var93 = var92 / 2.0F;
                            if ((var90 & 0x1) == 0) {
                                if (var93 < var75 - var73) {
                                    var79 = 1;
                                    var75 -= var92;
                                } else if (var73 - var75 > var93) {
                                    var79 = 2;
                                    var75 += var92;
                                }
                                if ((var93 < var77 - var73)) {
                                    var80 = 1;
                                    var77 -= var92;
                                } else if (var73 - var77 > var93) {
                                    var77 += var92;
                                    var80 = 2;
                                }
                            } else {
                                if (var76 - var74 > var93) {
                                    var79 = 1;
                                    var76 -= var92;
                                } else if (var93 < var74 - var76) {
                                    var76 += var92;
                                    var79 = 2;
                                }
                                if ((var78 - var74 > var93)) {
                                    var80 = 1;
                                    var78 -= var92;
                                } else if (var74 - var78 > var93) {
                                    var78 += var92;
                                    var80 = 2;
                                }
                            }
                        } else if (var82 == 2) {
                            float var94 = (float) arg1.field7710[var71] / 256.0F;
                            float var95 = (float) arg1.field7680[var71] / 256.0F;
                            int var96 = arg1.field7705[var84] - arg1.field7705[var83];
                            int var97 = arg1.field7694[var84] - arg1.field7694[var83];
                            int var98 = arg1.field7674[var84] - arg1.field7674[var83];
                            int var99 = arg1.field7705[var85] - arg1.field7705[var83];
                            int var100 = arg1.field7694[var85] - arg1.field7694[var83];
                            int var101 = arg1.field7674[var85] - arg1.field7674[var83];
                            int var102 = var97 * var101 - var98 * var100;
                            int var103 = var98 * var99 - var96 * var101;
                            int var104 = var96 * var100 - var97 * var99;
                            float var105 = 64.0F / (float) arg1.field7716[var71];
                            float var106 = 64.0F / (float) arg1.field7709[var71];
                            float var107 = 64.0F / (float) arg1.field7693[var71];
                            float var108 = (var89[2] * (float) var104 + var89[0] * (float) var102 + var89[1] * (float) var103) / var105;
                            float var109 = (var89[5] * (float) var104 + var89[3] * (float) var102 + var89[4] * (float) var103) / var106;
                            float var110 = (var89[8] * (float) var104 + var89[7] * (float) var103 + var89[6] * (float) var102) / var107;
                            var81 = class197.method1347(var108, 0, var109, var110);
                            class508.method3007(var87, arg1.field7674[var83], var91, arg1.field7694[var83], var94, var89, var88, var81, var95, var90, 66, var86, arg1.field7705[var83]);
                            var73 = class2.field34;
                            var74 = class227.field3362;
                            class508.method3007(var87, arg1.field7674[var84], var91, arg1.field7694[var84], var94, var89, var88, var81, var95, var90, 75, var86, arg1.field7705[var84]);
                            var76 = class227.field3362;
                            var75 = class2.field34;
                            class508.method3007(var87, arg1.field7674[var85], var91, arg1.field7694[var85], var94, var89, var88, var81, var95, var90, 123, var86, arg1.field7705[var85]);
                            var78 = class227.field3362;
                            var77 = class2.field34;
                        } else if (var82 == 3) {
                            class509.method3016(var90, var87, arg1.field7694[var83], var88, -3828, arg1.field7705[var83], var91, arg1.field7674[var83], var89, var86);
                            var74 = class221.field3285;
                            var73 = class123.field1863;
                            class509.method3016(var90, var87, arg1.field7694[var84], var88, -3828, arg1.field7705[var84], var91, arg1.field7674[var84], var89, var86);
                            var76 = class221.field3285;
                            var75 = class123.field1863;
                            class509.method3016(var90, var87, arg1.field7694[var85], var88, -3828, arg1.field7705[var85], var91, arg1.field7674[var85], var89, var86);
                            var77 = class123.field1863;
                            var78 = class221.field3285;
                            if ((var90 & 0x1) == 0) {
                                if (var75 - var73 > 0.5F) {
                                    var75--;
                                    var79 = 1;
                                } else if (var73 - var75 > 0.5F) {
                                    var79 = 2;
                                    var75++;
                                }
                                if ((var77 - var73 > 0.5F)) {
                                    var77--;
                                    var80 = 1;
                                } else if (var73 - var77 > 0.5F) {
                                    var77++;
                                    var80 = 2;
                                }
                            } else {
                                if ((var76 - var74 > 0.5F)) {
                                    var79 = 1;
                                    var76--;
                                } else if (var74 - var76 > 0.5F) {
                                    var79 = 2;
                                    var76++;
                                }
                                if ((var78 - var74 > 0.5F)) {
                                    var78--;
                                    var80 = 1;
                                } else if (var74 - var78 > 0.5F) {
                                    var80 = 2;
                                    var78++;
                                }
                            }
                        }
                    }
                }
            }
            byte var146;
            if (arg1.field7692 == null) {
                var146 = 0;
            } else {
                var146 = arg1.field7692[var68];
            }
            if (var146 == 0) {
                long var147 = ((long) (var81 << 24) + (long) var72 + (long) (var69 << 8) << 32) + (long) (var71 << 2);
                short var149 = arg1.field7718[var68];
                short var150 = arg1.field7713[var68];
                short var151 = arg1.field7670[var68];
                class421 var152 = var13[var149];
                this.field4317[var52] = this.method1915(var74, -53, var152.field6328, arg1, var73, var152.field6337, var147, var152.field6330, var152.field6333, var149);
                class421 var153 = var13[var150];
                this.field4351[var52] = this.method1915(var76, -25, var153.field6328, arg1, var75, var153.field6337, (long) var79 + var147, var153.field6330, var153.field6333, var150);
                class421 var154 = var13[var151];
                this.field4305[var52] = this.method1915(var78, 112, var154.field6328, arg1, var77, var154.field6337, (long) var80 + var147, var154.field6330, var154.field6333, var151);
            } else if (var146 == 1) {
                class134 var155 = var50[var68];
                long var156 = ((long) (var81 << 24) + ((long) (var69 << 8)) + ((long) var72) << 32) + (long) ((var71 << 2) + (var155.field2049 <= 0 ? 2048 : 1024) + (var155.field2054 + 256 << 22) + (var155.field2051 + 256 << 12));
                this.field4317[var52] = this.method1915(var74, -93, var155.field2054, arg1, var73, var155.field2051, var156, 0, var155.field2049, arg1.field7718[var68]);
                this.field4351[var52] = this.method1915(var76, 71, var155.field2054, arg1, var75, var155.field2051, (long) var79 + var156, 0, var155.field2049, arg1.field7713[var68]);
                this.field4305[var52] = this.method1915(var78, 113, var155.field2054, arg1, var77, var155.field2051, (long) var80 + var156, 0, var155.field2049, arg1.field7670[var68]);
            }
            if (arg1.field7712 == null) {
                this.field4304[var52] = -1;
            } else {
                this.field4304[var52] = arg1.field7712[var68];
            }
            if (arg1.field7684 != null) {
                this.field4320[var52] = arg1.field7684[var68];
            }
            if (arg1.field7708 != null) {
                this.field4353[var52] = arg1.field7708[var68];
            }
            this.field4303[var52] = arg1.field7673[var68];
        }
        int var53 = 0;
        short var54 = -10000;
        for (int var55 = 0; var55 < this.field4341; var55++) {
            short var67 = this.field4304[var55];
            if (var54 != var67) {
                var53++;
                var54 = var67;
            }
        }
        this.field4296 = new int[var53 + 1];
        int var56 = 0;
        short var57 = -10000;
        for (int var58 = 0; var58 < this.field4341; var58++) {
            short var66 = this.field4304[var58];
            if (var57 != var66) {
                this.field4296[var56++] = var58;
                var57 = var66;
            }
        }
        this.field4296[var56] = this.field4341;
        class196.field2863 = null;
        this.field4381 = class257.method1714(0, this.field4337, this.field4381);
        this.field4322 = class257.method1714(0, this.field4337, this.field4322);
        this.field4370 = class257.method1714(0, this.field4337, this.field4370);
        this.field4331 = class322.method1995(this.field4331, this.field4337, (byte) -123);
        this.field4284 = class82.method483(this.field4284, 58, this.field4337);
        this.field4343 = class82.method483(this.field4343, 11, this.field4337);
        if (arg1.field7667 != null && class14.method94(0, arg2, this.field4319)) {
            this.field4327 = arg1.method3079((byte) 81);
        }
        if (arg1.field7707 != null && class496.method2974(0, arg2, this.field4319)) {
            this.field4349 = arg1.method3092((byte) -48);
        }
        if (arg1.field7682 != null && class41.method245(arg2, 384, this.field4319)) {
            int var59 = 0;
            int[] var60 = new int[256];
            for (int var61 = 0; var61 < this.field4312; var61++) {
                int var65 = arg1.field7682[var8[var61]];
                if (var65 >= 0) {
                    int var10002 = var60[var65]++;
                    if (var59 < var65) {
                        var59 = var65;
                    }
                }
            }
            this.field4368 = new int[var59 + 1][];
            for (int var62 = 0; var62 <= var59; var62++) {
                this.field4368[var62] = new int[var60[var62]];
                var60[var62] = 0;
            }
            for (int var63 = 0; var63 < this.field4312; var63++) {
                int var64 = arg1.field7682[var8[var63]];
                if (var64 >= 0) {
                    this.field4368[var64][var60[var64]++] = var63;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "ea", descriptor = "(IILna;Lna;III)V", line = 2329)
    public final void method687(int arg0, int arg1, class35 arg2, class35 arg3, int arg4, int arg5, int arg6) {
        if (!this.field4313) {
            this.method1917(-7534);
        }
        field4279++;
        int var8 = this.field4363 + arg4;
        int var9 = arg4 + this.field4375;
        int var10 = this.field4285 + arg6;
        int var11 = this.field4333 + arg6;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || arg2.field370 <= arg2.field365 + var9 >> arg2.field372 || var10 < 0 || arg2.field365 + var11 >> arg2.field372 >= arg2.field369) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || arg3.field365 + var9 >> arg3.field372 >= arg3.field370 || var10 < 0 || arg3.field369 <= arg3.field365 + var11 >> arg3.field372) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field372;
            int var13 = arg2.field365 + var9 - 1 >> arg2.field372;
            int var14 = var10 >> arg2.field372;
            int var15 = arg2.field365 + var11 - 1 >> arg2.field372;
            if (arg2.method201(var12, var14) == arg5 && arg2.method201(var13, var14) == arg5 && arg2.method201(var12, var15) == arg5 && arg2.method201(var13, var15) == arg5) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var32 = 0; var32 < this.field4359; var32++) {
                this.field4382[var32] += arg2.method202(this.field4366[var32] + arg4, this.field4371[var32] + arg6) - arg5;
            }
        } else if (arg0 == 2) {
            short var16 = this.field4308;
            if (var16 == 0) {
                return;
            }
            for (int var17 = 0; var17 < this.field4359; var17++) {
                int var18 = (this.field4382[var17] << 16) / var16;
                if (var18 < arg1) {
                    this.field4382[var17] -= -((arg1 - var18) * (arg2.method202(this.field4366[var17] + arg4, this.field4371[var17] - -arg6) - arg5) / arg1);
                }
            }
        } else if (arg0 == 3) {
            int var28 = (arg1 & 0xFF) * 4;
            int var29 = (arg1 >> 8 & 0xFF) * 4;
            int var30 = (arg1 & 0xFFBC98) >> 16 << 6;
            int var31 = (arg1 >> 24 & 0xFF) << 6;
            if (arg4 - (var28 >> 1) < 0 || (arg2.field370 << arg2.field372) <= (arg4 - (-(var28 >> 1) - arg2.field365)) || arg6 - (var29 >> 1) < 0 || (var29 >> 1) + arg2.field365 + arg6 >= arg2.field369 << arg2.field372) {
                return;
            }
            this.method793(var28, arg4, arg5, var29, arg2, var30, var31, 103, arg6);
        } else if (arg0 == 4) {
            int var19 = this.field4373 - this.field4308;
            for (int var20 = 0; var20 < this.field4359; var20++) {
                this.field4382[var20] = this.field4382[var20] + var19 - (arg5 + -arg3.method202(this.field4366[var20] + arg4, this.field4371[var20] + arg6));
            }
        } else if (arg0 == 5) {
            int var21 = this.field4373 - this.field4308;
            for (int var22 = 0; var22 < this.field4359; var22++) {
                int var23 = this.field4366[var22] + arg4;
                int var24 = this.field4371[var22] + arg6;
                int var25 = arg2.method202(var23, var24);
                int var26 = arg3.method202(var23, var24);
                int var27 = var25 - var26;
                this.field4382[var22] = ((this.field4382[var22] << 8) / var21 * var27 >> 8) + var25 - arg5;
            }
        }
        this.field4313 = false;
        if (this.field4387 != null) {
            this.field4387.field4626 = null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IZ)V", line = 2482)
    private final void method1913(int arg0, boolean arg1) {
        int var3 = -107 / ((arg0 - 31) / 50);
        if (this.field4341 * 6 > class134.field2052.field3036.length) {
            class134.field2052 = new class25((this.field4341 + 100) * 6);
        } else {
            class134.field2052.field3037 = 0;
        }
        field4324++;
        if (this.field4344.field5313) {
            for (int var4 = 0; var4 < this.field4341; var4++) {
                class134.field2052.method1413(-126, this.field4317[var4]);
                class134.field2052.method1413(-127, this.field4351[var4]);
                class134.field2052.method1413(-122, this.field4305[var4]);
            }
        } else {
            for (int var5 = 0; var5 < this.field4341; var5++) {
                class134.field2052.method1453((byte) -71, this.field4317[var5]);
                class134.field2052.method1453((byte) -74, this.field4351[var5]);
                class134.field2052.method1453((byte) -110, this.field4305[var5]);
            }
        }
        if (class134.field2052.field3037 == 0) {
            return;
        }
        if (arg1) {
            if (this.field4335 == null) {
                this.field4335 = this.field4344.method2127(class134.field2052.field3037, 5123, true, class134.field2052.field3036, 87360);
            } else {
                this.field4335.method883((byte) -80, class134.field2052.field3037, class134.field2052.field3036, 5123);
            }
            this.field4297.field2120 = this.field4335;
        } else {
            this.field4297.field2120 = this.field4344.method2127(class134.field2052.field3037, 5123, false, class134.field2052.field3036, 87360);
        }
        if (!arg1) {
            this.field4385 = true;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lia;Lvk;II)V", line = 2546)
    public final void method691(class414 arg0, class247 arg1, int arg2, int arg3) {
        field4340++;
        if (this.field4337 == 0) {
            return;
        }
        class227 var5 = this.field4344.field5320;
        class227 var6 = (class227) arg0;
        if (!this.field4313) {
            this.method1917(-7534);
        }
        class464.field6867 = var5.field3338 * var6.field3352 + var5.field3352 * var6.field3355 + var5.field3329 * var6.field3334;
        class143.field2141 = var5.field3338 * var6.field3344 + var5.field3352 * var6.field3348 + var5.field3329 * var6.field3341 + var5.field3344;
        float var7 = (float) this.field4308 * class464.field6867 + class143.field2141;
        float var8 = (float) this.field4373 * class464.field6867 + class143.field2141;
        float var9;
        float var10;
        if (var7 > var8) {
            var9 = (float) this.field4350 + var7;
            var10 = (float) (-this.field4350) + var8;
        } else {
            var10 = (float) (-this.field4350) + var7;
            var9 = (float) this.field4350 + var8;
        }
        if ((this.field4344.field5363 <= var10) || ((float) this.field4344.field5275 >= var9)) {
            return;
        }
        class429.field6408 = var5.field3349 * var6.field3344 + var5.field3347 * var6.field3341 + var5.field3334 * var6.field3348 + var5.field3341;
        class479.field7033 = var5.field3349 * var6.field3352 + var5.field3347 * var6.field3334 + var5.field3334 * var6.field3355;
        float var11 = (float) this.field4308 * class479.field7033 + class429.field6408;
        float var12 = (float) this.field4373 * class479.field7033 + class429.field6408;
        float var13;
        float var14;
        if ((var12 < var11)) {
            var14 = ((float) this.field4350 + var11) * (float) this.field4344.field5260;
            var13 = (var12 - (float) this.field4350) * (float) this.field4344.field5260;
        } else {
            var13 = (var11 - (float) this.field4350) * (float) this.field4344.field5260;
            var14 = ((float) this.field4350 + var12) * (float) this.field4344.field5260;
        }
        if ((var13 / (float) arg2 >= this.field4344.field5351) || (this.field4344.field5360 >= var14 / (float) arg2)) {
            return;
        }
        class356.field5474 = var5.field3335 * var6.field3344 + var5.field3355 * var6.field3348 + var5.field3346 * var6.field3341 + var5.field3348;
        class279.field4024 = var5.field3335 * var6.field3352 + var5.field3355 * var6.field3355 + var5.field3346 * var6.field3334;
        float var15 = (float) this.field4308 * class279.field4024 + class356.field5474;
        float var16 = (float) this.field4373 * class279.field4024 + class356.field5474;
        float var17;
        float var18;
        if (var15 > var16) {
            var17 = ((float) (-this.field4350) + var16) * (float) this.field4344.field5301;
            var18 = ((float) this.field4350 + var15) * (float) this.field4344.field5301;
        } else {
            var18 = ((float) this.field4350 + var16) * (float) this.field4344.field5301;
            var17 = ((float) (-this.field4350) + var15) * (float) this.field4344.field5301;
        }
        if ((var17 / (float) arg2 >= this.field4344.field5345) || (this.field4344.field5321 >= var18 / (float) arg2)) {
            return;
        }
        if (arg1 != null || this.field4323 != null) {
            class424.field6363 = var5.field3349 * var6.field3329 + var5.field3347 * var6.field3347 + var5.field3334 * var6.field3346;
            class484.field7102 = var5.field3338 * var6.field3338 + var5.field3352 * var6.field3335 + var5.field3329 * var6.field3349;
            class212.field3101 = var5.field3338 * var6.field3329 + var5.field3352 * var6.field3346 + var5.field3329 * var6.field3347;
            class143.field2144 = var5.field3335 * var6.field3338 + var5.field3355 * var6.field3335 + var5.field3346 * var6.field3349;
            class69.field1046 = var5.field3349 * var6.field3338 + var5.field3347 * var6.field3349 + var5.field3334 * var6.field3335;
            class522.field7736 = var5.field3335 * var6.field3329 + var5.field3355 * var6.field3346 + var5.field3346 * var6.field3347;
        }
        if (arg1 != null) {
            int var19 = this.field4375 + this.field4363 >> 1;
            int var20 = this.field4333 + this.field4285 >> 1;
            int var21 = (int) ((float) var20 * class69.field1046 + (float) this.field4308 * class479.field7033 + (float) var19 * class424.field6363 + class429.field6408);
            int var22 = (int) ((float) var20 * class143.field2144 + (float) this.field4308 * class279.field4024 + (float) var19 * class522.field7736 + class356.field5474);
            int var23 = (int) ((float) var20 * class484.field7102 + (float) this.field4308 * class464.field6867 + (float) var19 * class212.field3101 + class143.field2141);
            int var24 = (int) ((float) var20 * class69.field1046 + (float) this.field4373 * class479.field7033 + (float) var19 * class424.field6363 + class429.field6408);
            int var25 = (int) ((float) var20 * class143.field2144 + (float) this.field4373 * class279.field4024 + (float) var19 * class522.field7736 + class356.field5474);
            arg1.field3634 = this.field4344.field5301 * var22 / arg2 + this.field4344.field5331;
            arg1.field3632 = this.field4344.field5260 * var24 / arg2 + this.field4344.field5347;
            int var26 = (int) ((float) var20 * class484.field7102 + (float) this.field4373 * class464.field6867 + (float) var19 * class212.field3101 + class143.field2141);
            arg1.field3630 = this.field4344.field5301 * var25 / arg2 + this.field4344.field5331;
            arg1.field3633 = this.field4344.field5260 * var21 / arg2 + this.field4344.field5347;
            if (var23 < this.field4344.field5275 && this.field4344.field5275 > var26) {
                arg1.field3631 = (var21 + this.field4350) * this.field4344.field5260 / arg2 + this.field4344.field5347 - arg1.field3633;
                arg1.field3629 = true;
            }
        }
        this.field4344.method2175((float) arg2, (byte) -107);
        this.field4344.method2178(1765);
        this.field4344.method2149(var6, -81);
        this.method1920((byte) 34);
        this.field4344.method2189(1);
        this.method1919(32767);
    }

    @OriginalMember(owner = "client!vj", name = "u", descriptor = "(I)V", line = 2696)
    public final void method719(int arg0) {
        this.field4316 = arg0;
        field4315++;
        this.field4385 = true;
        if (this.field4292 != null && (this.field4316 & 0x10000) == 0) {
            this.field4370 = this.field4292.field2347;
            this.field4322 = this.field4292.field2346;
            this.field4331 = this.field4292.field2354;
            this.field4381 = this.field4292.field2349;
            this.field4292 = null;
        }
        this.method1918(-32767);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lc;IIIZ)V", line = 2718)
    public final void method722(class121 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field4360++;
        class304 var6 = (class304) arg0;
        if (this.field4312 == 0 || var6.field4312 == 0) {
            return;
        }
        int var7 = var6.field4359;
        int[] var8 = var6.field4366;
        int[] var9 = var6.field4382;
        int[] var10 = var6.field4371;
        short[] var11 = var6.field4381;
        short[] var12 = var6.field4322;
        short[] var13 = var6.field4370;
        byte[] var14 = var6.field4331;
        short[] var15;
        short[] var16;
        short[] var17;
        byte[] var18;
        if (this.field4292 == null) {
            var18 = null;
            var15 = null;
            var17 = null;
            var16 = null;
        } else {
            var15 = this.field4292.field2347;
            var16 = this.field4292.field2346;
            var17 = this.field4292.field2349;
            var18 = this.field4292.field2354;
        }
        short[] var19;
        byte[] var20;
        short[] var21;
        short[] var22;
        if (var6.field4292 == null) {
            var22 = null;
            var19 = null;
            var21 = null;
            var20 = null;
        } else {
            var19 = var6.field4292.field2349;
            var20 = var6.field4292.field2354;
            var21 = var6.field4292.field2346;
            var22 = var6.field4292.field2347;
        }
        int[] var23 = var6.field4314;
        short[] var24 = var6.field4294;
        if (!var6.field4313) {
            var6.method1917(-7534);
        }
        short var25 = var6.field4308;
        short var26 = var6.field4373;
        short var27 = var6.field4363;
        short var28 = var6.field4375;
        short var29 = var6.field4285;
        short var30 = var6.field4333;
        for (int var31 = 0; var31 < this.field4359; var31++) {
            int var32 = this.field4382[var31] - arg2;
            if (var25 <= var32 && var26 >= var32) {
                int var33 = this.field4366[var31] - arg1;
                if (var33 >= var27 && var28 >= var33) {
                    int var34 = this.field4371[var31] - arg3;
                    if (var34 >= var29 && var30 >= var34) {
                        int var35 = -1;
                        int var36 = this.field4314[var31];
                        int var37 = this.field4314[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field4294[var38] - 1;
                            if (var35 == -1 || this.field4331[var35] != 0) {
                                break;
                            }
                        }
                        if (var35 != -1) {
                            for (int var39 = 0; var39 < var7; var39++) {
                                if (var8[var39] == var33 && var10[var39] == var34 && var9[var39] == var32) {
                                    int var40 = var23[var39];
                                    int var41 = -1;
                                    int var42 = var23[var39 + 1];
                                    for (int var43 = var40; var43 < var42; var43++) {
                                        var41 = var24[var43] - 1;
                                        if (var41 == -1 || var14[var41] != 0) {
                                            break;
                                        }
                                    }
                                    if (var41 != -1) {
                                        if (var17 == null) {
                                            this.field4292 = new class159();
                                            var17 = this.field4292.field2349 = class193.method1307(20, this.field4381);
                                            var16 = this.field4292.field2346 = class193.method1307(93, this.field4322);
                                            var15 = this.field4292.field2347 = class193.method1307(122, this.field4370);
                                            var18 = this.field4292.field2354 = class377.method2314(this.field4331, -234615161);
                                        }
                                        if (var19 == null) {
                                            class159 var44 = var6.field4292 = new class159();
                                            var19 = var44.field2349 = class193.method1307(116, var11);
                                            var21 = var44.field2346 = class193.method1307(119, var12);
                                            var22 = var44.field2347 = class193.method1307(57, var13);
                                            var20 = var44.field2354 = class377.method2314(var14, -234615161);
                                        }
                                        short var45 = this.field4381[var35];
                                        short var46 = this.field4322[var35];
                                        short var47 = this.field4370[var35];
                                        byte var48 = this.field4331[var35];
                                        int var49 = var23[var39 + 1];
                                        int var50 = var23[var39];
                                        for (int var51 = var50; var51 < var49; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var20[var52] != 0) {
                                                var19[var52] += var45;
                                                var21[var52] += var46;
                                                var22[var52] += var47;
                                                var20[var52] += var48;
                                            }
                                        }
                                        int var53 = this.field4314[var31 + 1];
                                        int var54 = this.field4314[var31];
                                        short var55 = var13[var41];
                                        short var56 = var11[var41];
                                        short var57 = var12[var41];
                                        byte var58 = var14[var41];
                                        for (int var59 = var54; var59 < var53; var59++) {
                                            int var60 = this.field4294[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var18[var60] != 0) {
                                                var17[var60] += var56;
                                                var16[var60] += var57;
                                                var15[var60] += var55;
                                                var18[var60] += var58;
                                            }
                                        }
                                        if (this.field4329 == null && this.field4310 != null) {
                                            this.field4310.field4626 = null;
                                        }
                                        if (this.field4329 != null) {
                                            this.field4329.field4626 = null;
                                        }
                                        if (var6.field4329 == null && var6.field4310 != null) {
                                            var6.field4310.field4626 = null;
                                        }
                                        if (var6.field4329 != null) {
                                            var6.field4329.field4626 = null;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "VA", descriptor = "()I", line = 2989)
    public final int method698() {
        if (!this.field4313) {
            this.method1917(-7534);
        }
        field4291++;
        return this.field4375;
    }

    @OriginalMember(owner = "client!vj", name = "o", descriptor = "(I)V", line = 3001)
    public final void method700(int arg0) {
        field4355++;
        int var2 = class457.field6760[arg0];
        int var3 = class457.field6759[arg0];
        for (int var4 = 0; var4 < this.field4359; var4++) {
            int var5 = this.field4382[var4] * var2 + (this.field4366[var4] * var3) >> 15;
            this.field4382[var4] = this.field4382[var4] * var3 - this.field4366[var4] * var2 >> 15;
            this.field4366[var4] = var5;
        }
        this.field4313 = false;
        if (this.field4387 != null) {
            this.field4387.field4626 = null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZIBLvj;Lvj;Z)Lc;", line = 3031)
    private final class121 method1914(boolean arg0, int arg1, byte arg2, class304 arg3, class304 arg4, boolean arg5) {
        arg4.field4337 = this.field4337;
        arg4.field4319 = this.field4319;
        arg4.field4321 = this.field4321;
        arg4.field4341 = this.field4341;
        field4369++;
        arg4.field4345 = this.field4345;
        arg4.field4379 = this.field4379;
        arg4.field4312 = this.field4312;
        arg4.field4338 = 0;
        arg4.field4299 = this.field4299;
        arg4.field4316 = arg1;
        arg4.field4359 = this.field4359;
        boolean var7 = class102.method622(this.field4319, (byte) 50, arg1);
        if (arg2 >= -4) {
            return null;
        }
        boolean var8 = class26.method163(this.field4319, (byte) -95, arg1);
        boolean var9 = class146.method965(this.field4319, arg1, true);
        boolean var10 = var9 | var7 | var8;
        if (var10) {
            if (!var7) {
                arg4.field4366 = this.field4366;
            } else if (arg3.field4366 == null || arg3.field4366.length < this.field4299) {
                arg4.field4366 = arg3.field4366 = new int[this.field4299];
            } else {
                arg4.field4366 = arg3.field4366;
            }
            if (!var8) {
                arg4.field4382 = this.field4382;
            } else if (arg3.field4382 == null || this.field4299 > arg3.field4382.length) {
                arg4.field4382 = arg3.field4382 = new int[this.field4299];
            } else {
                arg4.field4382 = arg3.field4382;
            }
            if (!var9) {
                arg4.field4371 = this.field4371;
            } else if (arg3.field4371 == null || this.field4299 > arg3.field4371.length) {
                arg4.field4371 = arg3.field4371 = new int[this.field4299];
            } else {
                arg4.field4371 = arg3.field4371;
            }
            for (int var11 = 0; var11 < this.field4299; var11++) {
                if (var7) {
                    arg4.field4366[var11] = this.field4366[var11];
                }
                if (var8) {
                    arg4.field4382[var11] = this.field4382[var11];
                }
                if (var9) {
                    arg4.field4371[var11] = this.field4371[var11];
                }
            }
        } else {
            arg4.field4371 = this.field4371;
            arg4.field4366 = this.field4366;
            arg4.field4382 = this.field4382;
        }
        if (class163.method1134(arg1, (byte) -118, this.field4319)) {
            if (arg0) {
                arg4.field4338 = (byte) (arg4.field4338 | 0x1);
            }
            arg4.field4387 = arg3.field4387;
            arg4.field4387.field4626 = this.field4387.field4626;
            arg4.field4387.field4620 = this.field4387.field4620;
        } else if (class115.method766((byte) -66, arg1, this.field4319)) {
            arg4.field4387 = this.field4387;
        } else {
            arg4.field4387 = null;
        }
        if (class99.method606((byte) 116, arg1, this.field4319)) {
            if (arg3.field4303 == null || this.field4312 > arg3.field4303.length) {
                arg4.field4303 = arg3.field4303 = new short[this.field4312];
            } else {
                arg4.field4303 = arg3.field4303;
            }
            for (int var12 = 0; var12 < this.field4312; var12++) {
                arg4.field4303[var12] = this.field4303[var12];
            }
        } else {
            arg4.field4303 = this.field4303;
        }
        if (class62.method365(this.field4319, arg1, (byte) -11)) {
            if (arg3.field4320 == null || arg3.field4320.length < this.field4312) {
                arg4.field4320 = arg3.field4320 = new byte[this.field4312];
            } else {
                arg4.field4320 = arg3.field4320;
            }
            for (int var13 = 0; var13 < this.field4312; var13++) {
                arg4.field4320[var13] = this.field4320[var13];
            }
        } else {
            arg4.field4320 = this.field4320;
        }
        if (class52.method319(arg1, true, this.field4319)) {
            arg4.field4310 = arg3.field4310;
            if (arg0) {
                arg4.field4338 = (byte) (arg4.field4338 | 0x2);
            }
            arg4.field4310.field4620 = this.field4310.field4620;
            arg4.field4310.field4626 = this.field4310.field4626;
        } else if (class517.method3046(0, this.field4319, arg1)) {
            arg4.field4310 = this.field4310;
        } else {
            arg4.field4310 = null;
        }
        if (class152.method991(this.field4319, arg1, 111)) {
            if (arg3.field4381 == null || arg3.field4381.length < this.field4337) {
                int var14 = this.field4337;
                arg4.field4322 = arg3.field4322 = new short[var14];
                arg4.field4370 = arg3.field4370 = new short[var14];
                arg4.field4381 = arg3.field4381 = new short[var14];
            } else {
                arg4.field4381 = arg3.field4381;
                arg4.field4322 = arg3.field4322;
                arg4.field4370 = arg3.field4370;
            }
            if (this.field4292 == null) {
                for (int var15 = 0; var15 < this.field4337; var15++) {
                    arg4.field4381[var15] = this.field4381[var15];
                    arg4.field4322[var15] = this.field4322[var15];
                    arg4.field4370[var15] = this.field4370[var15];
                }
            } else {
                if (arg3.field4292 == null) {
                    arg3.field4292 = new class159();
                }
                class159 var16 = arg4.field4292 = arg3.field4292;
                if (var16.field2349 == null || this.field4337 > var16.field2349.length) {
                    int var17 = this.field4337;
                    var16.field2349 = new short[var17];
                    var16.field2354 = new byte[var17];
                    var16.field2346 = new short[var17];
                    var16.field2347 = new short[var17];
                }
                for (int var18 = 0; var18 < this.field4337; var18++) {
                    arg4.field4381[var18] = this.field4381[var18];
                    arg4.field4322[var18] = this.field4322[var18];
                    arg4.field4370[var18] = this.field4370[var18];
                    var16.field2349[var18] = this.field4292.field2349[var18];
                    var16.field2346[var18] = this.field4292.field2346[var18];
                    var16.field2347[var18] = this.field4292.field2347[var18];
                    var16.field2354[var18] = this.field4292.field2354[var18];
                }
            }
            arg4.field4331 = this.field4331;
        } else {
            arg4.field4370 = this.field4370;
            arg4.field4322 = this.field4322;
            arg4.field4381 = this.field4381;
            arg4.field4292 = this.field4292;
            arg4.field4331 = this.field4331;
        }
        if (class229.method1572(0, this.field4319, arg1)) {
            arg4.field4329 = arg3.field4329;
            if (arg0) {
                arg4.field4338 = (byte) (arg4.field4338 | 0x4);
            }
            arg4.field4329.field4626 = this.field4329.field4626;
            arg4.field4329.field4620 = this.field4329.field4620;
        } else if (class166.method1153(arg1, -119, this.field4319)) {
            arg4.field4329 = this.field4329;
        } else {
            arg4.field4329 = null;
        }
        if (class163.method1131(arg1, this.field4319, false)) {
            if (arg3.field4284 == null || arg3.field4284.length < this.field4312) {
                int var19 = this.field4337;
                arg4.field4284 = arg3.field4284 = new float[var19];
                arg4.field4343 = arg3.field4343 = new float[var19];
            } else {
                arg4.field4284 = arg3.field4284;
                arg4.field4343 = arg3.field4343;
            }
            for (int var20 = 0; var20 < this.field4337; var20++) {
                arg4.field4284[var20] = this.field4284[var20];
                arg4.field4343[var20] = this.field4343[var20];
            }
        } else {
            arg4.field4343 = this.field4343;
            arg4.field4284 = this.field4284;
        }
        if (class508.method3010((byte) 91, arg1, this.field4319)) {
            if (arg0) {
                arg4.field4338 = (byte) (arg4.field4338 | 0x8);
            }
            arg4.field4365 = arg3.field4365;
            arg4.field4365.field4626 = this.field4365.field4626;
            arg4.field4365.field4620 = this.field4365.field4620;
        } else if (class397.method2402((byte) -82, arg1, this.field4319)) {
            arg4.field4365 = this.field4365;
        } else {
            arg4.field4365 = null;
        }
        if (class385.method2354(this.field4319, arg1, (byte) -123)) {
            if (arg3.field4317 == null || arg3.field4317.length < this.field4312) {
                int var21 = this.field4312;
                arg4.field4305 = arg3.field4305 = new short[var21];
                arg4.field4317 = arg3.field4317 = new short[var21];
                arg4.field4351 = arg3.field4351 = new short[var21];
            } else {
                arg4.field4351 = arg3.field4351;
                arg4.field4305 = arg3.field4305;
                arg4.field4317 = arg3.field4317;
            }
            for (int var22 = 0; var22 < this.field4312; var22++) {
                arg4.field4317[var22] = this.field4317[var22];
                arg4.field4351[var22] = this.field4351[var22];
                arg4.field4305[var22] = this.field4305[var22];
            }
        } else {
            arg4.field4317 = this.field4317;
            arg4.field4351 = this.field4351;
            arg4.field4305 = this.field4305;
        }
        if (class413.method2482((byte) 16, arg1, this.field4319)) {
            if (arg0) {
                arg4.field4338 = (byte) (arg4.field4338 | 0x10);
            }
            arg4.field4297 = arg3.field4297;
            arg4.field4297.field2120 = this.field4297.field2120;
        } else if (class394.method2391(arg1, this.field4319, true)) {
            arg4.field4297 = this.field4297;
        } else {
            arg4.field4297 = null;
        }
        if (class413.method2485(true, this.field4319, arg1)) {
            if (arg3.field4304 == null || this.field4312 > arg3.field4304.length) {
                int var23 = this.field4312;
                arg4.field4304 = arg3.field4304 = new short[var23];
            } else {
                arg4.field4304 = arg3.field4304;
            }
            for (int var24 = 0; var24 < this.field4312; var24++) {
                arg4.field4304[var24] = this.field4304[var24];
            }
        } else {
            arg4.field4304 = this.field4304;
        }
        if (!class14.method92(this.field4319, arg1, 1408)) {
            arg4.field4282 = this.field4282;
        } else if (arg3.field4282 == null || this.field4379 > arg3.field4282.length) {
            int var26 = this.field4379;
            arg4.field4282 = arg3.field4282 = new class193[var26];
            for (int var27 = 0; var27 < this.field4379; var27++) {
                arg4.field4282[var27] = this.field4282[var27].method1305((byte) 103);
            }
        } else {
            arg4.field4282 = arg3.field4282;
            for (int var25 = 0; var25 < this.field4379; var25++) {
                arg4.field4282[var25].method1308(12, this.field4282[var25]);
            }
        }
        arg4.field4294 = this.field4294;
        arg4.field4353 = this.field4353;
        arg4.field4296 = this.field4296;
        arg4.field4361 = this.field4361;
        arg4.field4349 = this.field4349;
        arg4.field4280 = this.field4280;
        arg4.field4323 = this.field4323;
        arg4.field4327 = this.field4327;
        arg4.field4314 = this.field4314;
        arg4.field4368 = this.field4368;
        if (this.field4313) {
            arg4.field4308 = this.field4308;
            arg4.field4285 = this.field4285;
            arg4.field4313 = true;
            arg4.field4373 = this.field4373;
            arg4.field4350 = this.field4350;
            arg4.field4363 = this.field4363;
            arg4.field4333 = this.field4333;
            arg4.field4375 = this.field4375;
        } else {
            arg4.field4313 = false;
        }
        arg4.field4298 = this.field4298;
        return arg4;
    }

    @OriginalMember(owner = "client!vj", name = "W", descriptor = "()V", line = 3495)
    public final void method736() {
        for (int var1 = 0; var1 < this.field4299; var1++) {
            this.field4366[var1] = this.field4366[var1] + 7 >> 4;
            this.field4382[var1] = this.field4382[var1] + 7 >> 4;
            this.field4371[var1] = this.field4371[var1] + 7 >> 4;
        }
        field4362++;
        if (this.field4387 != null) {
            this.field4387.field4626 = null;
        }
        this.field4313 = false;
    }

    @OriginalMember(owner = "client!vj", name = "la", descriptor = "()I", line = 3518)
    public final int method746() {
        field4288++;
        if (!this.field4313) {
            this.method1917(-7534);
        }
        return this.field4363;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(FIILqc;FIJIII)S", line = 3539)
    private final short method1915(float arg0, int arg1, int arg2, class521 arg3, float arg4, int arg5, long arg6, int arg7, int arg8, int arg9) {
        field4307++;
        int var12 = this.field4314[arg9];
        int var13 = this.field4314[arg9 + 1];
        int var14 = 0;
        for (int var15 = var12; var15 < var13; var15++) {
            short var16 = this.field4294[var15];
            if (var16 == 0) {
                var14 = var15;
                break;
            }
            if (class196.field2863[var15] == arg6) {
                return (short) (var16 - 1);
            }
        }
        this.field4294[var14] = (short) (this.field4337 + 1);
        int var17 = -70 / ((32 - arg1) / 34);
        class196.field2863[var14] = arg6;
        this.field4381[this.field4337] = (short) arg8;
        this.field4322[this.field4337] = (short) arg5;
        this.field4370[this.field4337] = (short) arg2;
        this.field4331[this.field4337] = (byte) arg7;
        this.field4284[this.field4337] = arg4;
        this.field4343[this.field4337] = arg0;
        return (short) (this.field4337++);
    }

    @OriginalMember(owner = "client!vj", name = "WA", descriptor = "(I)V", line = 3599)
    public final void method735(int arg0) {
        field4281++;
        int var2 = class457.field6760[arg0];
        int var3 = class457.field6759[arg0];
        for (int var4 = 0; var4 < this.field4359; var4++) {
            int var5 = this.field4382[var4] * var3 - (this.field4371[var4] * var2) >> 15;
            this.field4371[var4] = this.field4382[var4] * var2 + this.field4371[var4] * var3 >> 15;
            this.field4382[var4] = var5;
        }
        this.field4313 = false;
        if (this.field4387 != null) {
            this.field4387.field4626 = null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZZ)V", line = 3630)
    private final void method1916(boolean arg0, boolean arg1) {
        field4306++;
        boolean var3 = this.field4310 != null && this.field4310.field4626 == null;
        boolean var4 = this.field4329 != null && this.field4329.field4626 == null;
        boolean var5 = this.field4387 != null && this.field4387.field4626 == null;
        boolean var6 = this.field4365 != null && this.field4365.field4626 == null;
        if (arg0) {
            var5 &= (this.field4338 & 0x1) != 0;
            var4 &= (this.field4338 & 0x4) != 0;
            var6 &= (this.field4338 & 0x8) != 0;
            var3 &= (this.field4338 & 0x2) != 0;
        }
        byte var7 = 0;
        byte var8 = 0;
        byte var9 = 0;
        byte var10 = 0;
        byte var11 = 0;
        if (var5) {
            var8 = var7;
            var7 = (byte) (var7 + 12);
        }
        if (var3) {
            var9 = var7;
            var7 = (byte) (var7 + 4);
        }
        if (var4) {
            var10 = var7;
            var7 = (byte) (var7 + 12);
        }
        if (var6) {
            var11 = var7;
            var7 = (byte) (var7 + 8);
        }
        if (var7 == 0) {
            return;
        }
        if (this.field4337 * var7 > class134.field2052.field3036.length) {
            class134.field2052 = new class25((this.field4337 + 100) * var7);
        } else {
            class134.field2052.field3037 = 0;
        }
        if (var5) {
            if (this.field4344.field5313) {
                for (int var12 = 0; var12 < this.field4359; var12++) {
                    int var13 = NativeStream.floatToRawIntBits((float) this.field4366[var12]);
                    int var14 = NativeStream.floatToRawIntBits((float) this.field4382[var12]);
                    int var15 = NativeStream.floatToRawIntBits((float) this.field4371[var12]);
                    int var16 = this.field4314[var12];
                    int var17 = this.field4314[var12 + 1];
                    for (int var18 = var16; var18 < var17; var18++) {
                        int var19 = this.field4294[var18] - 1;
                        if (var19 == -1) {
                            break;
                        }
                        class134.field2052.field3037 = var7 * var19;
                        class134.field2052.method1415(var13, (byte) -97);
                        class134.field2052.method1415(var14, (byte) -111);
                        class134.field2052.method1415(var15, (byte) -71);
                    }
                }
            } else {
                for (int var20 = 0; var20 < this.field4359; var20++) {
                    int var21 = NativeStream.floatToRawIntBits((float) this.field4366[var20]);
                    int var22 = NativeStream.floatToRawIntBits((float) this.field4382[var20]);
                    int var23 = NativeStream.floatToRawIntBits((float) this.field4371[var20]);
                    int var24 = this.field4314[var20];
                    int var25 = this.field4314[var20 + 1];
                    for (int var26 = var24; var26 < var25; var26++) {
                        int var27 = this.field4294[var26] - 1;
                        if (var27 == -1) {
                            break;
                        }
                        class134.field2052.field3037 = var7 * var27;
                        class134.field2052.method1427(var21, -95);
                        class134.field2052.method1427(var22, 103);
                        class134.field2052.method1427(var23, -106);
                    }
                }
            }
        }
        if (var3) {
            if (this.field4329 == null) {
                short[] var28;
                short[] var29;
                short[] var30;
                byte[] var31;
                if (this.field4292 == null) {
                    var30 = this.field4381;
                    var28 = this.field4370;
                    var31 = this.field4331;
                    var29 = this.field4322;
                } else {
                    var28 = this.field4292.field2347;
                    var29 = this.field4292.field2346;
                    var30 = this.field4292.field2349;
                    var31 = this.field4292.field2354;
                }
                float var32 = this.field4344.field5341[0];
                float var33 = this.field4344.field5341[1];
                float var34 = this.field4344.field5341[2];
                float var35 = this.field4344.field5307;
                float var36 = this.field4344.field5266 * 768.0F / (float) this.field4345;
                float var37 = this.field4344.field5276 * 768.0F / (float) this.field4345;
                for (int var38 = 0; var38 < this.field4312; var38++) {
                    int var39 = this.method1909(this.field4320[var38], this.field4303[var38], this.field4321, -93, this.field4304[var38]);
                    short var40 = this.field4317[var38];
                    float var41 = (float) (var39 >> 16 & 0xFF) * this.field4344.field5337;
                    float var42 = (float) ((var39 & 0xFF7E) >> 8) * this.field4344.field5294;
                    float var43 = (float) (var39 >>> 24) * this.field4344.field5362;
                    short var44 = (short) var31[var40];
                    float var45;
                    if (var44 == 0) {
                        var45 = ((float) var28[var40] * var34 + (float) var29[var40] * var33 + (float) var30[var40] * var32) * 0.0026041667F;
                    } else {
                        var45 = ((float) var28[var40] * var34 + (float) var29[var40] * var33 + (float) var30[var40] * var32) / (float) (var44 * 256);
                    }
                    float var46 = var45 * ((var45 < 0.0F) ? var37 : var36) + var35;
                    int var47 = (int) (var43 * var46);
                    if (var47 < 0) {
                        var47 = 0;
                    } else if (var47 > 255) {
                        var47 = 255;
                    }
                    int var48 = (int) (var41 * var46);
                    int var49 = (int) (var42 * var46);
                    if (var48 < 0) {
                        var48 = 0;
                    } else if (var48 > 255) {
                        var48 = 255;
                    }
                    if (var49 < 0) {
                        var49 = 0;
                    } else if (var49 > 255) {
                        var49 = 255;
                    }
                    class134.field2052.field3037 = var7 * var40 + var9;
                    class134.field2052.method1410(var47, -27645);
                    class134.field2052.method1410(var48, -27645);
                    class134.field2052.method1410(var49, -27645);
                    class134.field2052.method1410(255 - (this.field4320[var38] & 0xFF), -27645);
                    short var50 = this.field4351[var38];
                    short var51 = (short) var31[var50];
                    float var52;
                    if (var51 == 0) {
                        var52 = ((float) var28[var50] * var34 + (float) var29[var50] * var33 + (float) var30[var50] * var32) * 0.0026041667F;
                    } else {
                        var52 = ((float) var28[var50] * var34 + (float) var29[var50] * var33 + (float) var30[var50] * var32) / (float) (var51 * 256);
                    }
                    float var53 = var52 * (var52 < 0.0F ? var37 : var36) + var35;
                    int var54 = (int) (var43 * var53);
                    if (var54 < 0) {
                        var54 = 0;
                    } else if (var54 > 255) {
                        var54 = 255;
                    }
                    int var55 = (int) (var41 * var53);
                    if (var55 < 0) {
                        var55 = 0;
                    } else if (var55 > 255) {
                        var55 = 255;
                    }
                    int var56 = (int) (var42 * var53);
                    if (var56 < 0) {
                        var56 = 0;
                    } else if (var56 > 255) {
                        var56 = 255;
                    }
                    class134.field2052.field3037 = var7 * var50 + var9;
                    class134.field2052.method1410(var54, -27645);
                    class134.field2052.method1410(var55, -27645);
                    class134.field2052.method1410(var56, -27645);
                    class134.field2052.method1410(255 - (this.field4320[var38] & 0xFF), -27645);
                    short var57 = this.field4305[var38];
                    short var58 = (short) var31[var57];
                    float var59;
                    if (var58 == 0) {
                        var59 = ((float) var28[var57] * var34 + (float) var29[var57] * var33 + (float) var30[var57] * var32) * 0.0026041667F;
                    } else {
                        var59 = ((float) var28[var57] * var34 + (float) var29[var57] * var33 + (float) var30[var57] * var32) / (float) (var58 * 256);
                    }
                    float var60 = var35 + ((var59 < 0.0F) ? var37 : var36) * var59;
                    int var61 = (int) (var43 * var60);
                    int var62 = (int) (var41 * var60);
                    if (var61 < 0) {
                        var61 = 0;
                    } else if (var61 > 255) {
                        var61 = 255;
                    }
                    int var63 = (int) (var42 * var60);
                    if (var62 < 0) {
                        var62 = 0;
                    } else if (var62 > 255) {
                        var62 = 255;
                    }
                    class134.field2052.field3037 = var7 * var57 + var9;
                    if (var63 < 0) {
                        var63 = 0;
                    } else if (var63 > 255) {
                        var63 = 255;
                    }
                    class134.field2052.method1410(var61, -27645);
                    class134.field2052.method1410(var62, -27645);
                    class134.field2052.method1410(var63, -27645);
                    class134.field2052.method1410(255 - (this.field4320[var38] & 0xFF), -27645);
                }
            } else {
                for (int var64 = 0; var64 < this.field4312; var64++) {
                    int var65 = this.method1909(this.field4320[var64], this.field4303[var64], this.field4321, -106, this.field4304[var64]);
                    class134.field2052.field3037 = this.field4317[var64] * var7 + var9;
                    class134.field2052.method1415(var65, (byte) -112);
                    class134.field2052.field3037 = this.field4351[var64] * var7 + var9;
                    class134.field2052.method1415(var65, (byte) -84);
                    class134.field2052.field3037 = this.field4305[var64] * var7 + var9;
                    class134.field2052.method1415(var65, (byte) -126);
                }
            }
        }
        if (var4) {
            short[] var66;
            short[] var67;
            short[] var68;
            byte[] var69;
            if (this.field4292 == null) {
                var66 = this.field4322;
                var67 = this.field4381;
                var68 = this.field4370;
                var69 = this.field4331;
            } else {
                var66 = this.field4292.field2346;
                var68 = this.field4292.field2347;
                var69 = this.field4292.field2354;
                var67 = this.field4292.field2349;
            }
            float var70 = 3.0F / (float) this.field4345;
            class134.field2052.field3037 = var10;
            float var71 = 3.0F / (float) (this.field4345 + (this.field4345 / 2));
            if (this.field4344.field5313) {
                for (int var75 = 0; var75 < this.field4337; var75++) {
                    int var76 = var69[var75] & 0xFF;
                    if (var76 == 0) {
                        class134.field2052.method157((float) var67[var75] * var71, -125);
                        class134.field2052.method157((float) var66[var75] * var71, -108);
                        class134.field2052.method157((float) var68[var75] * var71, -100);
                    } else {
                        float var77 = var70 / (float) var76;
                        class134.field2052.method157((float) var67[var75] * var77, 42);
                        class134.field2052.method157((float) var66[var75] * var77, -90);
                        class134.field2052.method157((float) var68[var75] * var77, 35);
                    }
                    class134.field2052.field3037 += var7 - 12;
                }
            } else {
                for (int var72 = 0; var72 < this.field4337; var72++) {
                    int var73 = var69[var72] & 0xFF;
                    if (var73 == 0) {
                        class134.field2052.method159((float) var67[var72] * var71, (byte) -37);
                        class134.field2052.method159((float) var66[var72] * var71, (byte) -37);
                        class134.field2052.method159((float) var68[var72] * var71, (byte) -37);
                    } else {
                        float var74 = var70 / (float) var73;
                        class134.field2052.method159((float) var67[var72] * var74, (byte) -37);
                        class134.field2052.method159((float) var66[var72] * var74, (byte) -37);
                        class134.field2052.method159((float) var68[var72] * var74, (byte) -37);
                    }
                    class134.field2052.field3037 += var7 - 12;
                }
            }
        }
        if (var6) {
            class134.field2052.field3037 = var11;
            if (this.field4344.field5313) {
                for (int var78 = 0; var78 < this.field4337; var78++) {
                    class134.field2052.method157(this.field4284[var78], -122);
                    class134.field2052.method157(this.field4343[var78], 93);
                    class134.field2052.field3037 += var7 - 8;
                }
            } else {
                for (int var79 = 0; var79 < this.field4337; var79++) {
                    class134.field2052.method159(this.field4284[var79], (byte) -37);
                    class134.field2052.method159(this.field4343[var79], (byte) -37);
                    class134.field2052.field3037 += var7 - 8;
                }
            }
        }
        class134.field2052.field3037 = this.field4337 * var7;
        class21 var80;
        if (arg0) {
            if (this.field4342 == null) {
                this.field4342 = this.field4344.method2166((byte) -120, var7, class134.field2052.field3037, true, class134.field2052.field3036);
            } else {
                this.field4342.method139(class134.field2052.field3036, class134.field2052.field3037, var7, 47);
            }
            this.field4338 = 0;
            var80 = this.field4342;
        } else {
            var80 = this.field4344.method2166((byte) -105, var7, class134.field2052.field3037, false, class134.field2052.field3036);
            this.field4385 = true;
        }
        if (var5) {
            this.field4387.field4626 = var80;
            this.field4387.field4620 = var8;
        }
        if (arg1) {
            this.method687(-19, -24, null, null, -15, 0, 34);
        }
        if (var6) {
            this.field4365.field4620 = var11;
            this.field4365.field4626 = var80;
        }
        if (var3) {
            this.field4310.field4620 = var9;
            this.field4310.field4626 = var80;
        }
        if (var4) {
            this.field4329.field4620 = var10;
            this.field4329.field4626 = var80;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)V", line = 4148)
    private final void method1917(int arg0) {
        field4295++;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = 32767;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = -32768;
        if (arg0 != -7534) {
            return;
        }
        int var8 = 0;
        int var9 = 0;
        for (int var10 = 0; var10 < this.field4359; var10++) {
            int var11 = this.field4366[var10];
            int var12 = this.field4382[var10];
            if (var3 > var12) {
                var3 = var12;
            }
            if (var6 < var12) {
                var6 = var12;
            }
            if (var11 < var2) {
                var2 = var11;
            }
            int var13 = this.field4371[var10];
            if (var11 > var5) {
                var5 = var11;
            }
            if (var7 < var13) {
                var7 = var13;
            }
            if (var13 < var4) {
                var4 = var13;
            }
            int var14 = var11 * var11 + (var13 * var13);
            if (var14 > var8) {
                var8 = var14;
            }
            int var15 = var12 * var12 + var11 * var11 + var13 * var13;
            if (var9 < var15) {
                var9 = var15;
            }
        }
        this.field4375 = (short) var5;
        this.field4285 = (short) var4;
        this.field4333 = (short) var7;
        this.field4363 = (short) var2;
        this.field4373 = (short) var6;
        this.field4308 = (short) var3;
        this.field4350 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
        Math.sqrt((double) var9);
        this.field4313 = true;
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(I)V", line = 4228)
    private final void method1918(int arg0) {
        field4330++;
        if (!this.field4385) {
            return;
        }
        this.field4385 = false;
        if (this.field4361 == null && this.field4280 == null && this.field4323 == null) {
            if (this.field4366 != null && !class347.method2111(this.field4316, this.field4319, -1)) {
                if (this.field4387 != null && this.field4387.field4626 == null) {
                    this.field4385 = true;
                } else {
                    if (!this.field4313) {
                        this.method1917(-7534);
                    }
                    this.field4366 = null;
                }
            }
            if (this.field4382 != null && !class499.method2988((byte) 50, this.field4319, this.field4316)) {
                if (this.field4387 != null && this.field4387.field4626 == null) {
                    this.field4385 = true;
                } else {
                    if (!this.field4313) {
                        this.method1917(arg0 ^ 0x6293);
                    }
                    this.field4382 = null;
                }
            }
            if (this.field4371 != null && !class436.method2621(-23633, this.field4319, this.field4316)) {
                if (this.field4387 != null && this.field4387.field4626 == null) {
                    this.field4385 = true;
                } else {
                    if (!this.field4313) {
                        this.method1917(-7534);
                    }
                    this.field4371 = null;
                }
            }
        }
        if (this.field4294 != null && this.field4366 == null && this.field4382 == null && this.field4371 == null) {
            this.field4294 = null;
            this.field4314 = null;
        }
        if (this.field4331 != null && !class498.method2983(-88, this.field4316, this.field4319)) {
            if (this.field4329 == null) {
                if (this.field4310 != null && this.field4310.field4626 == null) {
                    this.field4385 = true;
                } else {
                    this.field4331 = null;
                    this.field4381 = this.field4322 = this.field4370 = null;
                }
            } else if (this.field4329.field4626 == null) {
                this.field4385 = true;
            } else {
                this.field4331 = null;
                this.field4381 = this.field4322 = this.field4370 = null;
            }
        }
        if (this.field4303 != null && !class435.method2615(0, this.field4316, this.field4319)) {
            if (this.field4310 != null && this.field4310.field4626 == null) {
                this.field4385 = true;
            } else {
                this.field4303 = null;
            }
        }
        if (this.field4320 != null && !class445.method2674(262144, this.field4316, this.field4319)) {
            if (this.field4310 != null && this.field4310.field4626 == null) {
                this.field4385 = true;
            } else {
                this.field4320 = null;
            }
        }
        if (this.field4284 != null && !class24.method154(this.field4319, this.field4316, true)) {
            if (this.field4365 != null && this.field4365.field4626 == null) {
                this.field4385 = true;
            } else {
                this.field4284 = this.field4343 = null;
            }
        }
        if (this.field4304 != null && !class429.method2563((byte) -73, this.field4316, this.field4319)) {
            if (this.field4310 != null && this.field4310.field4626 == null) {
                this.field4385 = true;
            } else {
                this.field4304 = null;
            }
        }
        if (arg0 != -32767) {
            this.field4308 = 127;
        }
        if (this.field4317 != null && !class401.method2420(393216, this.field4316, this.field4319)) {
            if ((this.field4297 == null || this.field4297.field2120 != null) && (this.field4310 == null || this.field4310.field4626 != null)) {
                this.field4317 = this.field4351 = this.field4305 = null;
            } else {
                this.field4385 = true;
            }
        }
        if (this.field4368 != null && !class41.method245(this.field4316, 384, this.field4319)) {
            this.field4368 = null;
            this.field4353 = null;
        }
        if (this.field4327 != null && !class14.method94(0, this.field4316, this.field4319)) {
            this.field4327 = null;
            this.field4298 = null;
        }
        if (this.field4349 != null && !class496.method2974(0, this.field4316, this.field4319)) {
            this.field4349 = null;
        }
        if (this.field4296 != null && (this.field4316 & 0x800) == 0 && (this.field4316 & 0x40000) == 0) {
            this.field4296 = null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(BIZ)Lc;", line = 4405)
    public final class121 method723(byte arg0, int arg1, boolean arg2) {
        field4336++;
        class304 var4;
        class304 var5;
        if (arg0 == 1) {
            var5 = this.field4344.field5317;
            var4 = this.field4344.field5278;
        } else if (arg0 == 2) {
            var4 = this.field4344.field5291;
            var5 = this.field4344.field5314;
        } else if (arg0 == 3) {
            var4 = this.field4344.field5306;
            var5 = this.field4344.field5328;
        } else if (arg0 == 4) {
            var5 = this.field4344.field5255;
            var4 = this.field4344.field5262;
        } else if (arg0 == 5) {
            var4 = this.field4344.field5311;
            var5 = this.field4344.field5268;
        } else {
            var5 = var4 = new class304(this.field4344);
        }
        return this.method1914(arg0 != 0, arg1, (byte) -115, var4, var5, arg2);
    }

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "(I)V", line = 4454)
    public final void method685(int arg0) {
        field4318++;
        int var2 = class457.field6760[arg0];
        int var3 = class457.field6759[arg0];
        for (int var4 = 0; var4 < this.field4359; var4++) {
            int var5 = this.field4371[var4] * var2 + (this.field4366[var4] * var3) >> 15;
            this.field4371[var4] = this.field4371[var4] * var3 - (this.field4366[var4] * var2) >> 15;
            this.field4366[var4] = var5;
        }
        if (this.field4387 != null) {
            this.field4387.field4626 = null;
        }
        this.field4313 = false;
    }

    @OriginalMember(owner = "client!vj", name = "XA", descriptor = "(III)V", line = 4485)
    public final void method705(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field4359; var4++) {
            if (arg0 != 128) {
                this.field4366[var4] = this.field4366[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field4382[var4] = this.field4382[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field4371[var4] = this.field4371[var4] * arg2 >> 7;
            }
        }
        field4352++;
        this.field4313 = false;
        if (this.field4387 != null) {
            this.field4387.field4626 = null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(I)V", line = 4517)
    private final void method1919(int arg0) {
        if (this.field4323 != null) {
            class227 var2 = this.field4344.field5225;
            float var3 = this.field4344.method1020();
            float var4 = this.field4344.method1026();
            this.field4344.method2196(arg0 - 32752);
            this.field4344.method1110(false);
            this.field4344.method2130(65, false);
            this.field4344.method2173((byte) 114, this.field4344.field5281, null, null, this.field4344.field5270);
            for (int var5 = 0; var5 < this.field4379; var5++) {
                class438 var6 = this.field4323[var5];
                class193 var7 = this.field4282[var5];
                if (!var6.field6543 || !this.field4344.method1025()) {
                    float var8 = (float) (this.field4366[var6.field6542] + this.field4366[var6.field6544] + this.field4366[var6.field6535]) * 0.3333333F;
                    float var9 = (float) (this.field4382[var6.field6544] + this.field4382[var6.field6542] + this.field4382[var6.field6535]) * 0.3333333F;
                    float var10 = (float) (this.field4371[var6.field6544] + this.field4371[var6.field6542] + this.field4371[var6.field6535]) * 0.3333333F;
                    float var11 = class69.field1046 * var10 + class479.field7033 * var9 + class424.field6363 * var8 + class429.field6408;
                    float var12 = class143.field2144 * var10 + class522.field7736 * var8 + class279.field4024 * var9 + class356.field5474;
                    float var13 = class484.field7102 * var10 + class464.field6867 * var9 + class212.field3101 * var8 + class143.field2141;
                    var2.method1554(var6.field6547 * var7.field2826 >> 7, -var13, (float) var7.field2823 + var11, var6.field6533 * var7.field2831 >> 7, var7.field2833, (float) var7.field2830 - var12, 0);
                    this.field4344.method2194(var2, arg0 - 53833);
                    this.field4344.method1039(var4, var3 - (float) var6.field6537 * 1.5F);
                    int var14 = var7.field2828;
                    OpenGL.glColor4ub((byte) (var14 >> 16), (byte) (var14 >> 8), (byte) var14, (byte) (var14 >> 24));
                    this.field4344.method2161(112, var6.field6540);
                    this.field4344.method2162(var6.field6534, 1);
                    this.field4344.method2186(var6.field6548, 110);
                    this.field4344.method2154(7, 0, 4, -88);
                }
            }
            this.field4344.method1039(var4, var3);
            this.field4344.method1110(true);
            this.field4344.method2189(arg0 - 32766);
        }
        field4334++;
        if (arg0 != 32767) {
            this.method743();
        }
    }

    @OriginalMember(owner = "client!vj", name = "C", descriptor = "()I", line = 4584)
    public final int method694() {
        field4326++;
        if (!this.field4313) {
            this.method1917(-7534);
        }
        return this.field4333;
    }

    @OriginalMember(owner = "client!vj", name = "sa", descriptor = "()V", line = 4597)
    public final void method731() {
        field4376++;
        for (int var1 = 0; var1 < this.field4359; var1++) {
            this.field4371[var1] = -this.field4371[var1];
        }
        for (int var2 = 0; var2 < this.field4337; var2++) {
            this.field4370[var2] = (short) (-this.field4370[var2]);
        }
        for (int var3 = 0; var3 < this.field4312; var3++) {
            short var4 = this.field4317[var3];
            this.field4317[var3] = this.field4305[var3];
            this.field4305[var3] = var4;
        }
        if (this.field4329 == null && this.field4310 != null) {
            this.field4310.field4626 = null;
        }
        if (this.field4329 != null) {
            this.field4329.field4626 = null;
        }
        if (this.field4387 != null) {
            this.field4387.field4626 = null;
        }
        this.field4313 = false;
        if (this.field4297 != null) {
            this.field4297.field2120 = null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "()Z", line = 4646)
    public final boolean method748() {
        field4346++;
        if (this.field4304 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field4304.length; var1++) {
            if (this.field4304[var1] != -1 && !this.field4344.field2379.method839(this.field4304[var1], (byte) 48)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)V", line = 4674)
    private final void method1920(byte arg0) {
        field4378++;
        if (this.field4341 == 0) {
            return;
        }
        if (this.field4338 != 0) {
            this.method1916(true, false);
        }
        if (arg0 < 31) {
            this.field4381 = null;
        }
        this.method1916(false, false);
        if (this.field4297 != null) {
            if (this.field4297.field2120 == null) {
                this.method1913(-35, ~(this.field4338 & 0x10) != -1);
            }
            if (this.field4297.field2120 != null) {
                this.field4344.method2130(85, this.field4329 != null);
                this.field4344.method2173((byte) 108, this.field4365, this.field4310, this.field4329, this.field4387);
                int var2 = this.field4296.length - 1;
                for (int var3 = 0; var3 < var2; var3++) {
                    int var4 = this.field4296[var3];
                    int var5 = this.field4296[var3 + 1];
                    int var6 = this.field4304[var4] & 0xFFFF;
                    if (var6 == 65535) {
                        var6 = -1;
                    }
                    this.field4344.method2172(var6, 127, this.field4329 != null);
                    this.field4344.method2136((var5 - var4) * 3, 4, var4 * 3, this.field4297.field2120, (byte) -48);
                }
            }
        }
        this.method1918(-32767);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIIIIII)Z", line = 4732)
    private final boolean method1921(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4389++;
        if (arg5 > arg0 && arg1 > arg0 && arg7 > arg0) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg1 && arg0 > arg7) {
            return false;
        } else if (arg4 > arg3 && arg8 > arg3 && arg3 < arg2) {
            return false;
        } else if (arg3 > arg4 && arg3 > arg8 && arg2 < arg3) {
            return false;
        } else {
            int var10 = -56 % ((arg6 - 43) / 38);
            return true;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IILia;Z)Z", line = 4760)
    public final boolean method706(int arg0, int arg1, class414 arg2, boolean arg3) {
        field4301++;
        class227 var5 = (class227) arg2;
        class227 var6 = this.field4344.field5320;
        float var7 = var5.field3344 * var6.field3349 + var5.field3348 * var6.field3334 + var5.field3341 * var6.field3347 + var6.field3341;
        float var8 = var5.field3344 * var6.field3335 + var5.field3348 * var6.field3355 + var5.field3341 * var6.field3346 + var6.field3348;
        class484.field7102 = var5.field3338 * var6.field3338 + var5.field3349 * var6.field3329 + var5.field3335 * var6.field3352;
        class143.field2144 = var5.field3338 * var6.field3335 + var5.field3349 * var6.field3346 + var5.field3335 * var6.field3355;
        class424.field6363 = var5.field3329 * var6.field3349 + var5.field3347 * var6.field3347 + var5.field3346 * var6.field3334;
        class522.field7736 = var5.field3329 * var6.field3335 + var5.field3347 * var6.field3346 + var5.field3346 * var6.field3355;
        class479.field7033 = var5.field3352 * var6.field3349 + var5.field3355 * var6.field3334 + var5.field3334 * var6.field3347;
        class464.field6867 = var5.field3352 * var6.field3338 + var5.field3355 * var6.field3352 + var5.field3334 * var6.field3329;
        class69.field1046 = var5.field3338 * var6.field3349 + var5.field3349 * var6.field3347 + var5.field3335 * var6.field3334;
        float var9 = var5.field3344 * var6.field3338 + var5.field3348 * var6.field3352 + var5.field3341 * var6.field3329 + var6.field3344;
        class212.field3101 = var5.field3329 * var6.field3338 + var5.field3347 * var6.field3329 + var5.field3346 * var6.field3352;
        class279.field4024 = var5.field3352 * var6.field3335 + var5.field3355 * var6.field3355 + var5.field3334 * var6.field3346;
        boolean var10 = false;
        float var11 = Float.MAX_VALUE;
        float var12 = -3.4028235E38F;
        float var13 = Float.MAX_VALUE;
        float var14 = -3.4028235E38F;
        int var15 = this.field4344.field5260;
        int var16 = this.field4344.field5301;
        if (!this.field4313) {
            this.method1917(-7534);
        }
        class451.field6711[0] = this.field4363;
        class410.field6170[0] = this.field4308;
        class138.field2075[0] = this.field4285;
        class451.field6711[1] = this.field4375;
        class410.field6170[1] = this.field4308;
        class451.field6711[2] = this.field4363;
        class138.field2075[1] = this.field4285;
        class410.field6170[2] = this.field4373;
        class138.field2075[2] = this.field4285;
        class451.field6711[3] = this.field4375;
        class410.field6170[3] = this.field4373;
        class451.field6711[4] = this.field4363;
        class138.field2075[3] = this.field4285;
        class410.field6170[4] = this.field4308;
        class138.field2075[4] = this.field4333;
        class451.field6711[5] = this.field4375;
        class410.field6170[5] = this.field4308;
        class451.field6711[6] = this.field4363;
        class138.field2075[5] = this.field4333;
        class410.field6170[6] = this.field4373;
        class451.field6711[7] = this.field4375;
        class138.field2075[6] = this.field4333;
        class410.field6170[7] = this.field4373;
        class138.field2075[7] = this.field4333;
        for (int var17 = 0; var17 < 8; var17++) {
            float var36 = (float) class451.field6711[var17];
            float var37 = (float) class410.field6170[var17];
            float var38 = (float) class138.field2075[var17];
            float var39 = class484.field7102 * var38 + class464.field6867 * var37 + class212.field3101 * var36 + var9;
            float var40 = class69.field1046 * var38 + class479.field7033 * var37 + class424.field6363 * var36 + var7;
            float var41 = class143.field2144 * var38 + class522.field7736 * var36 + class279.field4024 * var37 + var8;
            if (var39 >= (float) this.field4344.field5275) {
                float var42 = (float) var15 * var40 / var39 + (float) this.field4344.field5347;
                float var43 = (float) var16 * var41 / var39 + (float) this.field4344.field5331;
                if (var42 > var12) {
                    var12 = var42;
                }
                if (var42 < var11) {
                    var11 = var42;
                }
                var10 = true;
                if (var43 > var14) {
                    var14 = var43;
                }
                if (var13 > var43) {
                    var13 = var43;
                }
            }
        }
        if (var10 && var11 < (float) arg0 && (float) arg0 < var12 && (float) arg1 > var13 && (float) arg1 < var14) {
            if (arg3) {
                return true;
            }
            if (this.field4337 > class52.field824.length) {
                class52.field824 = new int[this.field4337];
                class450.field6708 = new int[this.field4337];
            }
            for (int var18 = 0; var18 < this.field4359; var18++) {
                float var20 = (float) this.field4371[var18];
                float var21 = (float) this.field4366[var18];
                float var22 = (float) this.field4382[var18];
                float var23 = class484.field7102 * var20 + class464.field6867 * var22 + class212.field3101 * var21 + var9;
                float var24 = class69.field1046 * var20 + class479.field7033 * var22 + class424.field6363 * var21 + var7;
                float var25 = class143.field2144 * var20 + class522.field7736 * var21 + class279.field4024 * var22 + var8;
                if ((float) this.field4344.field5275 <= var23) {
                    int var26 = (int) ((float) var15 * var24 / var23 + (float) this.field4344.field5347);
                    int var27 = (int) ((float) var16 * var25 / var23 + (float) this.field4344.field5331);
                    int var28 = this.field4314[var18];
                    int var29 = this.field4314[var18 + 1];
                    for (int var30 = var28; var30 < var29; var30++) {
                        int var31 = this.field4294[var30] - 1;
                        if (var31 == -1) {
                            break;
                        }
                        class52.field824[var31] = var26;
                        class450.field6708[var31] = var27;
                    }
                } else {
                    int var32 = this.field4314[var18];
                    int var33 = this.field4314[var18 + 1];
                    for (int var34 = var32; var34 < var33; var34++) {
                        int var35 = this.field4294[var34] - 1;
                        if (var35 == -1) {
                            break;
                        }
                        class52.field824[this.field4294[var34] - 1] = -999999;
                    }
                }
            }
            for (int var19 = 0; var19 < this.field4312; var19++) {
                if (class52.field824[this.field4317[var19]] != -999999 && class52.field824[this.field4351[var19]] != -999999 && class52.field824[this.field4305[var19]] != -999999 && this.method1921(arg1, class450.field6708[this.field4351[var19]], class52.field824[this.field4305[var19]], arg0, class52.field824[this.field4317[var19]], class450.field6708[this.field4317[var19]], 93, class450.field6708[this.field4305[var19]], class52.field824[this.field4351[var19]])) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!vj", name = "xa", descriptor = "(I[IIIIIZ)V", line = 4972)
    public final void method695(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field4300++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg4 << 4;
            int var10 = arg3 << 4;
            int var11 = arg2 << 4;
            class494.field7292 = 0;
            class523.field7745 = 0;
            class107.field1544 = 0;
            int var12 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field4327.length) {
                    int[] var15 = this.field4327[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class494.field7292 += this.field4366[var17];
                        class107.field1544 += this.field4382[var17];
                        class523.field7745 += this.field4371[var17];
                        var12++;
                    }
                }
            }
            if (var12 <= 0) {
                class523.field7745 = var9;
                class494.field7292 = var11;
                class107.field1544 = var10;
            } else {
                class523.field7745 = class523.field7745 / var12 + var9;
                class107.field1544 = class107.field1544 / var12 + var10;
                class494.field7292 = class494.field7292 / var12 + var11;
            }
        } else if (arg0 == 1) {
            int var18 = arg4 << 4;
            int var19 = arg2 << 4;
            int var20 = arg3 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (var22 < this.field4327.length) {
                    int[] var23 = this.field4327[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field4366[var25] += var19;
                        this.field4382[var25] += var20;
                        this.field4371[var25] += var18;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (this.field4327.length > var45) {
                    int[] var46 = this.field4327[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field4366[var48] -= class494.field7292;
                            this.field4382[var48] -= class107.field1544;
                            this.field4371[var48] -= class523.field7745;
                            if (arg4 != 0) {
                                int var49 = class457.field6760[arg4];
                                int var50 = class457.field6759[arg4];
                                int var51 = this.field4382[var48] * var49 + this.field4366[var48] * var50 + 32767 >> 15;
                                this.field4382[var48] = this.field4382[var48] * var50 + 32767 - (this.field4366[var48] * var49) >> 15;
                                this.field4366[var48] = var51;
                            }
                            if (arg2 != 0) {
                                int var52 = class457.field6760[arg2];
                                int var53 = class457.field6759[arg2];
                                int var54 = this.field4382[var48] * var53 + 32767 - (this.field4371[var48] * var52) >> 15;
                                this.field4371[var48] = this.field4371[var48] * var53 + this.field4382[var48] * var52 + 32767 >> 15;
                                this.field4382[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class457.field6760[arg3];
                                int var56 = class457.field6759[arg3];
                                int var57 = this.field4371[var48] * var55 + this.field4366[var48] * var56 + 32767 >> 15;
                                this.field4371[var48] = this.field4371[var48] * var56 + 32767 - (this.field4366[var48] * var55) >> 15;
                                this.field4366[var48] = var57;
                            }
                            this.field4366[var48] += class494.field7292;
                            this.field4382[var48] += class107.field1544;
                            this.field4371[var48] += class523.field7745;
                        }
                    } else {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field4366[var59] -= class494.field7292;
                            this.field4382[var59] -= class107.field1544;
                            this.field4371[var59] -= class523.field7745;
                            if (arg2 != 0) {
                                int var60 = class457.field6760[arg2];
                                int var61 = class457.field6759[arg2];
                                int var62 = this.field4382[var59] * var61 + 32767 - this.field4371[var59] * var60 >> 15;
                                this.field4371[var59] = this.field4382[var59] * var60 - (-(this.field4371[var59] * var61) - 32767) >> 15;
                                this.field4382[var59] = var62;
                            }
                            if (arg4 != 0) {
                                int var63 = class457.field6760[arg4];
                                int var64 = class457.field6759[arg4];
                                int var65 = this.field4382[var59] * var63 + this.field4366[var59] * var64 + 32767 >> 15;
                                this.field4382[var59] = this.field4382[var59] * var64 + 32767 - (this.field4366[var59] * var63) >> 15;
                                this.field4366[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class457.field6760[arg3];
                                int var67 = class457.field6759[arg3];
                                int var68 = this.field4371[var59] * var66 + (this.field4366[var59] * var67) + 32767 >> 15;
                                this.field4371[var59] = this.field4371[var59] * var67 + 32767 - (this.field4366[var59] * var66) >> 15;
                                this.field4366[var59] = var68;
                            }
                            this.field4366[var59] += class494.field7292;
                            this.field4382[var59] += class107.field1544;
                            this.field4371[var59] += class523.field7745;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (var28 < this.field4327.length) {
                        int[] var29 = this.field4327[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field4314[var31];
                            int var33 = this.field4314[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field4294[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class457.field6760[arg4];
                                    int var37 = class457.field6759[arg4];
                                    int var38 = this.field4322[var35] * var36 - (-(this.field4381[var35] * var37) - 32767) >> 15;
                                    this.field4322[var35] = (short) (this.field4322[var35] * var37 + 32767 - (this.field4381[var35] * var36) >> 15);
                                    this.field4381[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class457.field6760[arg2];
                                    int var40 = class457.field6759[arg2];
                                    int var41 = this.field4322[var35] * var40 + 32767 - (this.field4370[var35] * var39) >> 15;
                                    this.field4370[var35] = (short) (this.field4370[var35] * var40 + this.field4322[var35] * var39 + 32767 >> 15);
                                    this.field4322[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class457.field6760[arg3];
                                    int var43 = class457.field6759[arg3];
                                    int var44 = this.field4381[var35] * var43 + this.field4370[var35] * var42 + 32767 >> 15;
                                    this.field4370[var35] = (short) (this.field4370[var35] * var43 + 32767 - (this.field4381[var35] * var42) >> 15);
                                    this.field4381[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                if (this.field4329 == null && this.field4310 != null) {
                    this.field4310.field4626 = null;
                }
                if (this.field4329 != null) {
                    this.field4329.field4626 = null;
                }
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (var70 < this.field4327.length) {
                    int[] var71 = this.field4327[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field4366[var73] -= class494.field7292;
                        this.field4382[var73] -= class107.field1544;
                        this.field4371[var73] -= class523.field7745;
                        this.field4366[var73] = this.field4366[var73] * arg2 >> 7;
                        this.field4382[var73] = this.field4382[var73] * arg3 >> 7;
                        this.field4371[var73] = this.field4371[var73] * arg4 >> 7;
                        this.field4366[var73] += class494.field7292;
                        this.field4382[var73] += class107.field1544;
                        this.field4371[var73] += class523.field7745;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field4368 != null) {
                for (int var74 = 0; var74 < var8; var74++) {
                    int var78 = arg1[var74];
                    if (this.field4368.length > var78) {
                        int[] var79 = this.field4368[var78];
                        for (int var80 = 0; var80 < var79.length; var80++) {
                            int var81 = var79[var80];
                            int var82 = (this.field4320[var81] & 0xFF) + arg2 * 8;
                            if (var82 < 0) {
                                var82 = 0;
                            } else if (var82 > 255) {
                                var82 = 255;
                            }
                            this.field4320[var81] = (byte) var82;
                        }
                        if (var79.length > 0 && this.field4310 != null) {
                            this.field4310.field4626 = null;
                        }
                    }
                }
                if (this.field4323 != null) {
                    for (int var75 = 0; var75 < this.field4379; var75++) {
                        class438 var76 = this.field4323[var75];
                        class193 var77 = this.field4282[var75];
                        var77.field2828 = var77.field2828 & 0xFFFFFF | 255 - (this.field4320[var76.field6541] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field4368 != null) {
                for (int var83 = 0; var83 < var8; var83++) {
                    int var87 = arg1[var83];
                    if (var87 < this.field4368.length) {
                        int[] var88 = this.field4368[var87];
                        for (int var89 = 0; var89 < var88.length; var89++) {
                            int var90 = var88[var89];
                            int var91 = this.field4303[var90] & 0xFFFF;
                            int var92 = var91 >> 10 & 0x3F;
                            int var93 = (var91 & 0x3CC) >> 7;
                            int var94 = var92 + arg2 & 0x3F;
                            int var95 = var91 & 0x7F;
                            int var96 = arg3 / 4 + var93;
                            int var97 = arg4 + var95;
                            if (var96 < 0) {
                                var96 = 0;
                            } else if (var96 > 7) {
                                var96 = 7;
                            }
                            if (var97 < 0) {
                                var97 = 0;
                            } else if (var97 > 127) {
                                var97 = 127;
                            }
                            this.field4303[var90] = (short) class18.method119(var97, class18.method119(var96 << 7, var94 << 10));
                        }
                        if (var88.length > 0 && this.field4310 != null) {
                            this.field4310.field4626 = null;
                        }
                    }
                }
                if (this.field4323 != null) {
                    for (int var84 = 0; var84 < this.field4379; var84++) {
                        class438 var85 = this.field4323[var84];
                        class193 var86 = this.field4282[var84];
                        var86.field2828 = class508.field7410[this.field4303[var85.field6541] & 0xFFFF] & 0xFFFFFF | var86.field2828 & 0xFF000000;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field4349 != null) {
                for (int var98 = 0; var98 < var8; var98++) {
                    int var99 = arg1[var98];
                    if (var99 < this.field4349.length) {
                        int[] var100 = this.field4349[var99];
                        for (int var101 = 0; var101 < var100.length; var101++) {
                            class193 var102 = this.field4282[var100[var101]];
                            var102.field2830 += arg3;
                            var102.field2823 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field4349 != null) {
                for (int var103 = 0; var103 < var8; var103++) {
                    int var104 = arg1[var103];
                    if (var104 < this.field4349.length) {
                        int[] var105 = this.field4349[var104];
                        for (int var106 = 0; var106 < var105.length; var106++) {
                            class193 var107 = this.field4282[var105[var106]];
                            var107.field2831 = var107.field2831 * arg2 >> 7;
                            var107.field2826 = var107.field2826 * arg3 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field4349 != null) {
            for (int var108 = 0; var108 < var8; var108++) {
                int var109 = arg1[var108];
                if (this.field4349.length > var109) {
                    int[] var110 = this.field4349[var109];
                    for (int var111 = 0; var111 < var110.length; var111++) {
                        class193 var112 = this.field4282[var110[var111]];
                        var112.field2833 = var112.field2833 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "ZA", descriptor = "(I)V", line = 5626)
    public final void method697(int arg0) {
        this.field4321 = (short) arg0;
        field4286++;
        if (this.field4310 != null) {
            this.field4310.field4626 = null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "fa", descriptor = "()I", line = 5647)
    public final int method724() {
        field4383++;
        return this.field4321;
    }
}
