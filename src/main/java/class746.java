import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public class class746 {

    @OriginalMember(owner = "client!ot", name = "d", descriptor = "[F")
    private float[] field10285 = new float[16];

    @OriginalMember(owner = "client!ot", name = "o", descriptor = "Lun;")
    private class296 field10296 = new class296(786336);

    @OriginalMember(owner = "client!ot", name = "p", descriptor = "I")
    private int field10297 = class550.method3249(1600, 6520);

    @OriginalMember(owner = "client!ot", name = "v", descriptor = "[I")
    private int[] field10303 = new int[8191];

    @OriginalMember(owner = "client!ot", name = "u", descriptor = "[[Llg;")
    private class216[][] field10302 = new class216[1600][64];

    @OriginalMember(owner = "client!ot", name = "y", descriptor = "[I")
    private int[] field10306 = new int[1600];

    @OriginalMember(owner = "client!ot", name = "w", descriptor = "I")
    private int field10304 = 0;

    @OriginalMember(owner = "client!ot", name = "x", descriptor = "[I")
    private int[] field10305 = new int[64];

    @OriginalMember(owner = "client!ot", name = "z", descriptor = "[[Llg;")
    private class216[][] field10307 = new class216[64][768];

    @OriginalMember(owner = "client!ot", name = "m", descriptor = "[Lg;")
    public static class146[] field10294 = new class146[14];

    @OriginalMember(owner = "client!ot", name = "n", descriptor = "Z")
    public static boolean field10295 = false;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "I")
    public static int field10282;

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "I")
    public static int field10283;

    @OriginalMember(owner = "client!ot", name = "c", descriptor = "I")
    public static int field10284;

    @OriginalMember(owner = "client!ot", name = "e", descriptor = "I")
    public static int field10286;

    @OriginalMember(owner = "client!ot", name = "f", descriptor = "I")
    public static int field10287;

    @OriginalMember(owner = "client!ot", name = "g", descriptor = "I")
    public static int field10288;

    @OriginalMember(owner = "client!ot", name = "h", descriptor = "I")
    public static int field10289;

    @OriginalMember(owner = "client!ot", name = "i", descriptor = "I")
    public static int field10290;

    @OriginalMember(owner = "client!ot", name = "j", descriptor = "I")
    public static int field10291;

    @OriginalMember(owner = "client!ot", name = "k", descriptor = "I")
    public static int field10292;

    @OriginalMember(owner = "client!ot", name = "l", descriptor = "I")
    public static int field10293;

    @OriginalMember(owner = "client!ot", name = "q", descriptor = "Lls;")
    private class166 field10298;

    @OriginalMember(owner = "client!ot", name = "r", descriptor = "Lls;")
    private class166 field10299;

    @OriginalMember(owner = "client!ot", name = "t", descriptor = "Lls;")
    private class166 field10301;

    @OriginalMember(owner = "client!ot", name = "s", descriptor = "Lvn;")
    private class211 field10300;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(Lpq;B)V", line = 3)
    private final void method4125(class194 arg0, byte arg1) {
        arg0.method1247(true, (byte) 79);
        if (arg1 > -94) {
            return;
        }
        field10287++;
        OpenGL.glEnable(16384);
        OpenGL.glEnable(16385);
        if (class189.field2365 != arg0.field2726) {
            arg0.method202(class189.field2365);
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(B)V", line = 20)
    public static void method4126(byte arg0) {
        field10294 = null;
        if (arg0 >= -79) {
            method4126((byte) -57);
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(BILpq;)V", line = 32)
    private final void method4127(byte arg0, int arg1, class194 arg2) {
        field10288++;
        class189.field2365 = arg2.field2726;
        arg2.method1196((float) arg1, 3);
        arg2.method1209(98);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        arg2.method1247(false, (byte) 90);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
        if (arg0 != -74) {
            this.field10302 = null;
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(I)V", line = 55)
    public static final void method4128(int arg0) {
        class462.method2783(-25912);
        field10290++;
        int var1 = 50 % ((-arg0 - 48) / 37);
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(Ljava/lang/String;ZILpq;)Lcca;", line = 67)
    public static final class725 method4129(String arg0, boolean arg1, int arg2, class194 arg3) {
        field10291++;
        if (!arg1) {
            field10295 = true;
        }
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg2, var4);
        OpenGL.glProgramStringARB(arg2, 34933, arg0);
        OpenGL.glGetIntegerv(34379, class555.field7690, 0);
        if (class555.field7690[0] == -1) {
            OpenGL.glBindProgramARB(arg2, 0);
            return new class725(arg3, arg2, var4);
        } else {
            OpenGL.glBindProgramARB(arg2, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(Lpq;ILhda;I)V", line = 93)
    public final void method4130(class194 arg0, int arg1, class714 arg2, int arg3) {
        field10292++;
        if (arg0.field2636 == null) {
            return;
        }
        if (arg1 < ~arg3) {
            this.method4132(arg0, (byte) -78);
        } else {
            this.method4127((byte) -74, arg3, arg0);
        }
        float var5 = arg0.field2636.field334;
        float var6 = arg0.field2636.field365;
        float var7 = arg0.field2636.field355;
        float var8 = arg0.field2636.field366;
        try {
            int var9 = 0;
            int var10 = Integer.MAX_VALUE;
            int var11 = 0;
            class309 var12 = arg2.field9929.field3960;
            for (class309 var13 = var12.field4457; var13 != var12; var13 = var13.field4457) {
                class216 var14 = (class216) var13;
                int var15 = (int) ((float) (var14.field2978 >> 12) * var7 + (float) (var14.field2982 >> 12) * var6 + (float) (var14.field2979 >> 12) * var5 + var8);
                if (var15 > var11) {
                    var11 = var15;
                }
                if (var10 > var15) {
                    var10 = var15;
                }
                this.field10303[var9++] = var15;
            }
            int var16 = var11 - var10;
            int var17;
            if (var16 + 2 > 1600) {
                var17 = class550.method3249(var16, 6520) + 1 - this.field10297;
                var16 = (var16 >> var17) + 2;
            } else {
                var16 += 2;
                var17 = 0;
            }
            int var18 = 0;
            class309 var19 = var12.field4457;
            int var20 = -2;
            boolean var21 = true;
            boolean var22 = true;
            while (var12 != var19) {
                this.field10304 = 0;
                for (int var23 = 0; var23 < var16; var23++) {
                    this.field10306[var23] = 0;
                }
                for (int var24 = 0; var24 < 64; var24++) {
                    this.field10305[var24] = 0;
                }
                while (var12 != var19) {
                    class216 var25 = (class216) var19;
                    if (var22) {
                        var20 = var25.field2976;
                        var22 = false;
                        var21 = var25.field2972;
                    }
                    if (var18 > 0 && (var25.field2976 != var20 || var21 != var25.field2972)) {
                        var22 = true;
                        break;
                    }
                    int var26 = this.field10303[var18++] - var10 >> var17;
                    if (var26 < 1600) {
                        if (this.field10306[var26] >= 64) {
                            label106: {
                                if (this.field10306[var26] == 64) {
                                    if (this.field10304 == 64) {
                                        break label106;
                                    }
                                    this.field10306[var26] += this.field10304++ + 1;
                                }
                                this.field10307[this.field10306[var26] - 64 - 1][this.field10305[this.field10306[var26] - 1 - 64]++] = var25;
                            }
                        } else {
                            this.field10302[var26][this.field10306[var26]++] = var25;
                        }
                    }
                    var19 = var19.field4457;
                }
                if (var20 < 0) {
                    arg0.method1232(-1, arg1 ^ -2);
                } else {
                    arg0.method1232(var20, 1);
                }
                if (var21 && class189.field2365 != arg0.field2726) {
                    arg0.method202(class189.field2365);
                } else if (arg0.field2726 != 1.0F) {
                    arg0.method202(1.0F);
                }
                this.method4131(arg0, var16, (byte) -34);
            }
        } catch (Exception var27) {
        }
        this.method4125(arg0, (byte) -118);
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(Lpq;IB)V", line = 257)
    private final void method4131(class194 arg0, int arg1, byte arg2) {
        OpenGL.glGetFloatv(2982, this.field10285, 0);
        field10283++;
        float var4 = this.field10285[0];
        float var5 = this.field10285[4];
        float var6 = this.field10285[8];
        float var7 = this.field10285[1];
        float var8 = this.field10285[5];
        float var9 = this.field10285[9];
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var6 + var9;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var9;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        this.field10296.field6962 = 0;
        float var18 = var9 - var6;
        if (arg0.field2748) {
            for (int var44 = arg1 - 1; var44 >= 0; var44--) {
                int var45 = this.field10306[var44] <= 64 ? this.field10306[var44] : 64;
                if (var45 > 0) {
                    for (int var46 = var45 - 1; var46 >= 0; var46--) {
                        class216 var59 = this.field10302[var44][var46];
                        int var60 = var59.field2983;
                        byte var61 = (byte) (var60 >> 16);
                        byte var62 = (byte) (var60 >> 8);
                        byte var63 = (byte) var60;
                        byte var64 = (byte) (var60 >>> 24);
                        float var65 = (float) (var59.field2979 >> 12);
                        float var66 = (float) (var59.field2982 >> 12);
                        float var67 = (float) (var59.field2978 >> 12);
                        int var68 = var59.field2975 >> 12;
                        this.field10296.method1943(-21171, 0.0F);
                        this.field10296.method1943(arg2 - 21137, 0.0F);
                        this.field10296.method1943(-21171, (float) (-var68) * var10 + var65);
                        this.field10296.method1943(arg2 ^ 0x5293, (float) (-var68) * var11 + var66);
                        this.field10296.method1943(-21171, (float) (-var68) * var12 + var67);
                        this.field10296.method3005(arg2 ^ 0xFFFFFF21, var61);
                        this.field10296.method3005(arg2 + 289, var62);
                        this.field10296.method3005(255, var63);
                        this.field10296.method3005(arg2 + 289, var64);
                        this.field10296.method1943(-21171, 1.0F);
                        this.field10296.method1943(-21171, 0.0F);
                        this.field10296.method1943(-21171, (float) var68 * var13 + var65);
                        this.field10296.method1943(-21171, (float) var68 * var14 + var66);
                        this.field10296.method1943(-21171, (float) var68 * var15 + var67);
                        this.field10296.method3005(255, var61);
                        this.field10296.method3005(255, var62);
                        this.field10296.method3005(255, var63);
                        this.field10296.method3005(255, var64);
                        this.field10296.method1943(-21171, 1.0F);
                        this.field10296.method1943(arg2 - 21137, 1.0F);
                        this.field10296.method1943(-21171, (float) var68 * var10 + var65);
                        this.field10296.method1943(arg2 ^ 0x5293, (float) var68 * var11 + var66);
                        this.field10296.method1943(-21171, (float) var68 * var12 + var67);
                        this.field10296.method3005(255, var61);
                        this.field10296.method3005(arg2 ^ 0xFFFFFF21, var62);
                        this.field10296.method3005(arg2 + 289, var63);
                        this.field10296.method3005(255, var64);
                        this.field10296.method1943(-21171, 0.0F);
                        this.field10296.method1943(-21171, 1.0F);
                        this.field10296.method1943(-21171, (float) var68 * var16 + var65);
                        this.field10296.method1943(arg2 - 21137, (float) var68 * var17 + var66);
                        this.field10296.method1943(-21171, (float) var68 * var18 + var67);
                        this.field10296.method3005(255, var61);
                        this.field10296.method3005(255, var62);
                        this.field10296.method3005(255, var63);
                        this.field10296.method3005(255, var64);
                    }
                    if (this.field10306[var44] > 64) {
                        int var47 = this.field10306[var44] - 64 - 1;
                        for (int var48 = this.field10305[var47] - 1; var48 >= 0; var48--) {
                            class216 var49 = this.field10307[var47][var48];
                            int var50 = var49.field2983;
                            byte var51 = (byte) (var50 >> 16);
                            byte var52 = (byte) (var50 >> 8);
                            byte var53 = (byte) var50;
                            byte var54 = (byte) (var50 >>> 24);
                            float var55 = (float) (var49.field2979 >> 12);
                            float var56 = (float) (var49.field2982 >> 12);
                            float var57 = (float) (var49.field2978 >> 12);
                            int var58 = var49.field2975 >> 12;
                            this.field10296.method1943(arg2 - 21137, 0.0F);
                            this.field10296.method1943(-21171, 0.0F);
                            this.field10296.method1943(-21171, (float) (-var58) * var10 + var55);
                            this.field10296.method1943(-21171, (float) (-var58) * var11 + var56);
                            this.field10296.method1943(-21171, (float) (-var58) * var12 + var57);
                            this.field10296.method3005(255, var51);
                            this.field10296.method3005(255, var52);
                            this.field10296.method3005(arg2 + 289, var53);
                            this.field10296.method3005(255, var54);
                            this.field10296.method1943(arg2 - 21137, 1.0F);
                            this.field10296.method1943(arg2 - 21137, 0.0F);
                            this.field10296.method1943(-21171, (float) var58 * var13 + var55);
                            this.field10296.method1943(arg2 ^ 0x5293, (float) var58 * var14 + var56);
                            this.field10296.method1943(-21171, (float) var58 * var15 + var57);
                            this.field10296.method3005(255, var51);
                            this.field10296.method3005(arg2 ^ 0xFFFFFF21, var52);
                            this.field10296.method3005(255, var53);
                            this.field10296.method3005(arg2 ^ 0xFFFFFF21, var54);
                            this.field10296.method1943(-21171, 1.0F);
                            this.field10296.method1943(arg2 ^ 0x5293, 1.0F);
                            this.field10296.method1943(arg2 ^ 0x5293, (float) var58 * var10 + var55);
                            this.field10296.method1943(arg2 ^ 0x5293, (float) var58 * var11 + var56);
                            this.field10296.method1943(-21171, (float) var58 * var12 + var57);
                            this.field10296.method3005(255, var51);
                            this.field10296.method3005(arg2 ^ 0xFFFFFF21, var52);
                            this.field10296.method3005(255, var53);
                            this.field10296.method3005(255, var54);
                            this.field10296.method1943(-21171, 0.0F);
                            this.field10296.method1943(-21171, 1.0F);
                            this.field10296.method1943(-21171, (float) var58 * var16 + var55);
                            this.field10296.method1943(-21171, (float) var58 * var17 + var56);
                            this.field10296.method1943(-21171, (float) var58 * var18 + var57);
                            this.field10296.method3005(arg2 + 289, var51);
                            this.field10296.method3005(arg2 ^ 0xFFFFFF21, var52);
                            this.field10296.method3005(255, var53);
                            this.field10296.method3005(arg2 + 289, var54);
                        }
                    }
                }
            }
        } else {
            for (int var19 = arg1 - 1; var19 >= 0; var19--) {
                int var20 = this.field10306[var19] > 64 ? 64 : this.field10306[var19];
                if (var20 > 0) {
                    for (int var21 = var20 - 1; var21 >= 0; var21--) {
                        class216 var34 = this.field10302[var19][var21];
                        int var35 = var34.field2983;
                        byte var36 = (byte) (var35 >> 16);
                        byte var37 = (byte) (var35 >> 8);
                        byte var38 = (byte) var35;
                        byte var39 = (byte) (var35 >>> 24);
                        float var40 = (float) (var34.field2979 >> 12);
                        float var41 = (float) (var34.field2982 >> 12);
                        float var42 = (float) (var34.field2978 >> 12);
                        int var43 = var34.field2975 >> 12;
                        this.field10296.method1942(0.0F, arg2 - 79);
                        this.field10296.method1942(0.0F, -21);
                        this.field10296.method1942((float) (-var43) * var10 + var40, arg2 ^ 0x4);
                        this.field10296.method1942((float) (-var43) * var11 + var41, -72);
                        this.field10296.method1942((float) (-var43) * var12 + var42, -78);
                        this.field10296.method3005(255, var36);
                        this.field10296.method3005(255, var37);
                        this.field10296.method3005(255, var38);
                        this.field10296.method3005(255, var39);
                        this.field10296.method1942(1.0F, -41);
                        this.field10296.method1942(0.0F, -55);
                        this.field10296.method1942((float) var43 * var13 + var40, -25);
                        this.field10296.method1942((float) var43 * var14 + var41, -103);
                        this.field10296.method1942((float) var43 * var15 + var42, -30);
                        this.field10296.method3005(255, var36);
                        this.field10296.method3005(255, var37);
                        this.field10296.method3005(255, var38);
                        this.field10296.method3005(255, var39);
                        this.field10296.method1942(1.0F, arg2 ^ 0x36);
                        this.field10296.method1942(1.0F, -97);
                        this.field10296.method1942((float) var43 * var10 + var40, -100);
                        this.field10296.method1942((float) var43 * var11 + var41, -78);
                        this.field10296.method1942((float) var43 * var12 + var42, arg2 ^ 0x14);
                        this.field10296.method3005(255, var36);
                        this.field10296.method3005(255, var37);
                        this.field10296.method3005(255, var38);
                        this.field10296.method3005(255, var39);
                        this.field10296.method1942(0.0F, -94);
                        this.field10296.method1942(1.0F, arg2 ^ 0x52);
                        this.field10296.method1942((float) var43 * var16 + var40, -29);
                        this.field10296.method1942((float) var43 * var17 + var41, arg2 ^ 0xC);
                        this.field10296.method1942((float) var43 * var18 + var42, -20);
                        this.field10296.method3005(255, var36);
                        this.field10296.method3005(255, var37);
                        this.field10296.method3005(255, var38);
                        this.field10296.method3005(255, var39);
                    }
                    if (this.field10306[var19] > 64) {
                        int var22 = this.field10306[var19] - 64 - 1;
                        for (int var23 = this.field10305[var22] - 1; var23 >= 0; var23--) {
                            class216 var24 = this.field10307[var22][var23];
                            int var25 = var24.field2983;
                            byte var26 = (byte) (var25 >> 16);
                            byte var27 = (byte) (var25 >> 8);
                            byte var28 = (byte) var25;
                            byte var29 = (byte) (var25 >>> 24);
                            float var30 = (float) (var24.field2979 >> 12);
                            float var31 = (float) (var24.field2982 >> 12);
                            float var32 = (float) (var24.field2978 >> 12);
                            int var33 = var24.field2975 >> 12;
                            this.field10296.method1942(0.0F, -125);
                            this.field10296.method1942(0.0F, -114);
                            this.field10296.method1942((float) (-var33) * var10 + var30, -54);
                            this.field10296.method1942((float) (-var33) * var11 + var31, -76);
                            this.field10296.method1942((float) (-var33) * var12 + var32, -26);
                            this.field10296.method3005(255, var26);
                            this.field10296.method3005(255, var27);
                            this.field10296.method3005(255, var28);
                            this.field10296.method3005(255, var29);
                            this.field10296.method1942(1.0F, arg2 ^ 0x50);
                            this.field10296.method1942(0.0F, arg2 + 12);
                            this.field10296.method1942((float) var33 * var13 + var30, -53);
                            this.field10296.method1942((float) var33 * var14 + var31, -66);
                            this.field10296.method1942((float) var33 * var15 + var32, -41);
                            this.field10296.method3005(255, var26);
                            this.field10296.method3005(255, var27);
                            this.field10296.method3005(255, var28);
                            this.field10296.method3005(255, var29);
                            this.field10296.method1942(1.0F, arg2 ^ 0x31);
                            this.field10296.method1942(1.0F, arg2 - 83);
                            this.field10296.method1942((float) var33 * var10 + var30, -97);
                            this.field10296.method1942((float) var33 * var11 + var31, -69);
                            this.field10296.method1942((float) var33 * var12 + var32, arg2 ^ 0x4F);
                            this.field10296.method3005(255, var26);
                            this.field10296.method3005(arg2 ^ 0xFFFFFF21, var27);
                            this.field10296.method3005(255, var28);
                            this.field10296.method3005(255, var29);
                            this.field10296.method1942(0.0F, arg2 ^ 0x44);
                            this.field10296.method1942(1.0F, -107);
                            this.field10296.method1942((float) var33 * var16 + var30, arg2 + 4);
                            this.field10296.method1942((float) var33 * var17 + var31, -44);
                            this.field10296.method1942((float) var33 * var18 + var32, -24);
                            this.field10296.method3005(255, var26);
                            this.field10296.method3005(arg2 ^ 0xFFFFFF21, var27);
                            this.field10296.method3005(arg2 ^ 0xFFFFFF21, var28);
                            this.field10296.method3005(255, var29);
                        }
                    }
                }
            }
        }
        if (arg2 != -34) {
            this.method4132(null, (byte) -58);
        }
        if (this.field10296.field6962 != 0) {
            this.field10300.method864(this.field10296.field6962, 24, this.field10296.field6979, -26434);
            arg0.method1248(this.field10299, this.field10301, this.field10298, (byte) 125, null);
            arg0.method1240(7, 0, 0, this.field10296.field6962 / 24);
        }
    }

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "(Lpq;B)V", line = 612)
    private final void method4132(class194 arg0, byte arg1) {
        class189.field2365 = arg0.field2726;
        field10282++;
        arg0.method1237(true);
        if (arg1 == -78) {
            OpenGL.glDisable(16384);
            OpenGL.glDisable(16385);
            arg0.method1247(false, (byte) 42);
            OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(ZLpq;)V", line = 630)
    public final void method4133(boolean arg0, class194 arg1) {
        field10293++;
        this.field10300 = arg1.method1266(-3311, 24, 196584, arg0, null);
        this.field10301 = new class166(this.field10300, 5126, 2, 0);
        this.field10299 = new class166(this.field10300, 5126, 3, 8);
        this.field10298 = new class166(this.field10300, 5121, 4, 20);
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(IZI)V", line = 642)
    public static final void method4134(int arg0, boolean arg1, int arg2) {
        field10289++;
        if (!arg1) {
            field10294 = null;
        }
        class93.field1086 = arg2;
        class68.field754 = arg0;
        if (class166.field2118 == 0) {
            class327.field4604 = class41.field424 * 2 + class68.field754;
            class544.field7574 = class448.field6281 * 2 + class93.field1086;
        } else if (class166.field2118 == 1) {
            class410.field5753 = class68.field754 / class618.field8685 + class300.field4356 + 2;
            class737.field10141 = class93.field1086 / class750.field10361 + class333.field4768 + 2;
            class327.field4604 = class618.field8685 * class410.field5753;
            class544.field7574 = class750.field10361 * class737.field10141;
            class41.field424 = class327.field4604 - class68.field754 >> 1;
            class448.field6281 = class544.field7574 - class93.field1086 >> 1;
        } else if (class166.field2118 == 2) {
            class544.field7574 = class93.field1086;
            class327.field4604 = class68.field754;
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(IIIIB)V", line = 678)
    public static final void method4135(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 < 37) {
            method4135(110, 105, -123, 50, (byte) -14);
        }
        class734.field10128 = arg2;
        class471.field6524 = arg1;
        class597.field8368 = arg3;
        class638.field8977 = arg0;
        field10286++;
    }
}
