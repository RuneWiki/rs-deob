import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class271 {

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "[F")
    private float[] field3435 = new float[16];

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "Laj;")
    private class205 field3436 = new class205(786336);

    @OriginalMember(owner = "client!ic", name = "t", descriptor = "I")
    private int field3447 = class487.method2909((byte) -91, 1600);

    @OriginalMember(owner = "client!ic", name = "w", descriptor = "[[Lo;")
    private class355[][] field3450 = new class355[1600][64];

    @OriginalMember(owner = "client!ic", name = "u", descriptor = "[I")
    private int[] field3448 = new int[1600];

    @OriginalMember(owner = "client!ic", name = "x", descriptor = "I")
    private int field3451 = 0;

    @OriginalMember(owner = "client!ic", name = "v", descriptor = "[[Lo;")
    private class355[][] field3449 = new class355[64][768];

    @OriginalMember(owner = "client!ic", name = "z", descriptor = "[I")
    private int[] field3453 = new int[64];

    @OriginalMember(owner = "client!ic", name = "y", descriptor = "[I")
    private int[] field3452 = new int[8191];

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
    public static int field3433 = 0;

    @OriginalMember(owner = "client!ic", name = "q", descriptor = "[Ljava/lang/String;")
    public static String[] field3444 = new String[100];

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "Lgp;")
    public static class459 field3439 = new class459(14, 3);

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
    public static int field3429;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
    public static int field3431;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "I")
    public static int field3434;

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "I")
    public static int field3437;

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "I")
    public static int field3438;

    @OriginalMember(owner = "client!ic", name = "n", descriptor = "I")
    public static int field3441;

    @OriginalMember(owner = "client!ic", name = "o", descriptor = "Ltp;")
    private class139 field3442;

    @OriginalMember(owner = "client!ic", name = "p", descriptor = "Ltp;")
    private class139 field3443;

    @OriginalMember(owner = "client!ic", name = "r", descriptor = "Ltp;")
    private class139 field3445;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "Ldn;")
    public static class201 field3430;

    @OriginalMember(owner = "client!ic", name = "m", descriptor = "Lhh;")
    private class500 field3440;

    @OriginalMember(owner = "client!ic", name = "s", descriptor = "[Lf;")
    public static class404[] field3446;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lgk;I)V", line = 3)
    public final void method1666(class463 arg0, int arg1) {
        field3441++;
        this.field3440 = arg0.method2750(196584, null, true, 255, 24);
        this.field3445 = new class139(arg0, this.field3440, 5126, 2, 0);
        int var3 = -13 % ((arg1 - 15) / 63);
        this.field3442 = new class139(arg0, this.field3440, 5126, 3, 8);
        this.field3443 = new class139(arg0, this.field3440, 5121, 4, 20);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IILeo;B)V", line = 21)
    public static final void method1667(int arg0, int arg1, class423 arg2, byte arg3) {
        field3437++;
        if (arg2 == null) {
            return;
        }
        if (arg2.field5801 != null) {
            class195 var4 = new class195();
            var4.field2516 = arg2;
            var4.field2523 = arg2.field5801;
            class490.method2928(var4);
        }
        class172.field2229 = arg2.field5734;
        class227.field2931 = arg1;
        class35.field543 = arg2.field5767;
        class501.field7364 = arg2.field5820;
        class315.field4065 = arg2.field5763;
        class182.field2380 = arg0;
        if (arg3 >= 18) {
            class515.field7573 = true;
            class206.field2687 = arg2.field5756;
            class415.method2440(10, arg2);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(III)Z", line = 56)
    public static final boolean method1668(int arg0, int arg1, int arg2) {
        field3432++;
        if (arg2 != 458752) {
            field3433 = -76;
        }
        return (arg1 & 0x70000) != 0 | class257.method1611(arg1, arg0, -1) || class71.method404(arg1, (byte) 117, arg0);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(BLgk;)V", line = 67)
    private final void method1669(byte arg0, class463 arg1) {
        if (arg0 > -81) {
            this.method1669((byte) -41, null);
        }
        field3429++;
        class349.field4473 = arg1.field6791;
        arg1.method2793((byte) 44);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        arg1.method2782(-17939, false);
        arg1.method2755(-2, true);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V", line = 94)
    public static void method1670(byte arg0) {
        field3446 = null;
        field3439 = null;
        field3430 = null;
        field3444 = null;
        if (arg0 != -126) {
            field3433 = -104;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lgk;BI)V", line = 107)
    private final void method1671(class463 arg0, byte arg1, int arg2) {
        OpenGL.glGetFloatv(2982, this.field3435, 0);
        field3428++;
        float var4 = this.field3435[0];
        float var5 = this.field3435[4];
        float var6 = this.field3435[8];
        float var7 = this.field3435[1];
        float var8 = this.field3435[5];
        float var9 = this.field3435[9];
        if (arg1 != -49) {
            return;
        }
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var6 + var9;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var9;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        float var18 = var9 - var6;
        this.field3436.field1176 = 0;
        if (arg0.field6759) {
            for (int var44 = arg2 - 1; var44 >= 0; var44--) {
                int var45 = this.field3448[var44] <= 64 ? this.field3448[var44] : 64;
                if (var45 > 0) {
                    for (int var46 = var45 - 1; var46 >= 0; var46--) {
                        class355 var59 = this.field3450[var44][var46];
                        int var60 = var59.field4562;
                        byte var61 = (byte) (var60 >> 16);
                        byte var62 = (byte) (var60 >> 8);
                        byte var63 = (byte) var60;
                        byte var64 = (byte) (var60 >>> 24);
                        float var65 = (float) (var59.field4558 >> class338.field4324);
                        float var66 = (float) (var59.field4552 >> class338.field4324);
                        float var67 = (float) (var59.field4557 >> class338.field4324);
                        int var68 = var59.field4553 >> class338.field4324;
                        this.field3436.method1343(0.0F, 1829123664);
                        this.field3436.method1343(0.0F, 1829123664);
                        this.field3436.method1343((float) (-var68) * var10 + var65, 1829123664);
                        this.field3436.method1343((float) (-var68) * var11 + var66, 1829123664);
                        this.field3436.method1343((float) (-var68) * var12 + var67, arg1 + 1829123713);
                        this.field3436.method565(-107, var61);
                        this.field3436.method565(-125, var62);
                        this.field3436.method565(-85, var63);
                        this.field3436.method565(-78, var64);
                        this.field3436.method1343(1.0F, 1829123664);
                        this.field3436.method1343(0.0F, 1829123664);
                        this.field3436.method1343((float) var68 * var13 + var65, arg1 + 1829123713);
                        this.field3436.method1343((float) var68 * var14 + var66, 1829123664);
                        this.field3436.method1343((float) var68 * var15 + var67, 1829123664);
                        this.field3436.method565(84, var61);
                        this.field3436.method565(-67, var62);
                        this.field3436.method565(arg1 ^ 0xFFFFFFB8, var63);
                        this.field3436.method565(arg1 ^ 0xFFFFFF93, var64);
                        this.field3436.method1343(1.0F, 1829123664);
                        this.field3436.method1343(1.0F, 1829123664);
                        this.field3436.method1343((float) var68 * var10 + var65, 1829123664);
                        this.field3436.method1343((float) var68 * var11 + var66, 1829123664);
                        this.field3436.method1343((float) var68 * var12 + var67, arg1 ^ 0x92F9C99F);
                        this.field3436.method565(110, var61);
                        this.field3436.method565(81, var62);
                        this.field3436.method565(52, var63);
                        this.field3436.method565(85, var64);
                        this.field3436.method1343(0.0F, 1829123664);
                        this.field3436.method1343(1.0F, 1829123664);
                        this.field3436.method1343((float) var68 * var16 + var65, 1829123664);
                        this.field3436.method1343((float) var68 * var17 + var66, 1829123664);
                        this.field3436.method1343((float) var68 * var18 + var67, 1829123664);
                        this.field3436.method565(arg1 - 29, var61);
                        this.field3436.method565(-76, var62);
                        this.field3436.method565(43, var63);
                        this.field3436.method565(35, var64);
                    }
                    if (this.field3448[var44] > 64) {
                        int var47 = this.field3448[var44] - 65;
                        for (int var48 = this.field3453[var47] - 1; var48 >= 0; var48--) {
                            class355 var49 = this.field3449[var47][var48];
                            int var50 = var49.field4562;
                            byte var51 = (byte) (var50 >> 16);
                            byte var52 = (byte) (var50 >> 8);
                            byte var53 = (byte) var50;
                            byte var54 = (byte) (var50 >>> 24);
                            float var55 = (float) (var49.field4558 >> class338.field4324);
                            float var56 = (float) (var49.field4552 >> class338.field4324);
                            float var57 = (float) (var49.field4557 >> class338.field4324);
                            int var58 = var49.field4553 >> class338.field4324;
                            this.field3436.method1343(0.0F, 1829123664);
                            this.field3436.method1343(0.0F, 1829123664);
                            this.field3436.method1343((float) (-var58) * var10 + var55, arg1 + 1829123713);
                            this.field3436.method1343((float) (-var58) * var11 + var56, 1829123664);
                            this.field3436.method1343((float) (-var58) * var12 + var57, 1829123664);
                            this.field3436.method565(arg1 + 96, var51);
                            this.field3436.method565(-100, var52);
                            this.field3436.method565(-122, var53);
                            this.field3436.method565(arg1 - 65, var54);
                            this.field3436.method1343(1.0F, 1829123664);
                            this.field3436.method1343(0.0F, arg1 ^ 0x92F9C99F);
                            this.field3436.method1343((float) var58 * var13 + var55, 1829123664);
                            this.field3436.method1343((float) var58 * var14 + var56, 1829123664);
                            this.field3436.method1343((float) var58 * var15 + var57, 1829123664);
                            this.field3436.method565(arg1 ^ 0xFFFFFFB4, var51);
                            this.field3436.method565(31, var52);
                            this.field3436.method565(-94, var53);
                            this.field3436.method565(-77, var54);
                            this.field3436.method1343(1.0F, 1829123664);
                            this.field3436.method1343(1.0F, 1829123664);
                            this.field3436.method1343((float) var58 * var10 + var55, 1829123664);
                            this.field3436.method1343((float) var58 * var11 + var56, arg1 ^ 0x92F9C99F);
                            this.field3436.method1343((float) var58 * var12 + var57, 1829123664);
                            this.field3436.method565(-77, var51);
                            this.field3436.method565(arg1 ^ 0x5D, var52);
                            this.field3436.method565(56, var53);
                            this.field3436.method565(arg1 - 26, var54);
                            this.field3436.method1343(0.0F, 1829123664);
                            this.field3436.method1343(1.0F, 1829123664);
                            this.field3436.method1343((float) var58 * var16 + var55, arg1 ^ 0x92F9C99F);
                            this.field3436.method1343((float) var58 * var17 + var56, 1829123664);
                            this.field3436.method1343((float) var58 * var18 + var57, 1829123664);
                            this.field3436.method565(arg1 ^ 0x53, var51);
                            this.field3436.method565(99, var52);
                            this.field3436.method565(arg1 ^ 0x59, var53);
                            this.field3436.method565(32, var54);
                        }
                    }
                }
            }
        } else {
            for (int var19 = arg2 - 1; var19 >= 0; var19--) {
                int var20 = this.field3448[var19] <= 64 ? this.field3448[var19] : 64;
                if (var20 > 0) {
                    for (int var21 = var20 - 1; var21 >= 0; var21--) {
                        class355 var34 = this.field3450[var19][var21];
                        int var35 = var34.field4562;
                        byte var36 = (byte) (var35 >> 16);
                        byte var37 = (byte) (var35 >> 8);
                        byte var38 = (byte) var35;
                        byte var39 = (byte) (var35 >>> 24);
                        float var40 = (float) (var34.field4558 >> class338.field4324);
                        float var41 = (float) (var34.field4552 >> class338.field4324);
                        float var42 = (float) (var34.field4557 >> class338.field4324);
                        int var43 = var34.field4553 >> class338.field4324;
                        this.field3436.method1338(0.0F, (byte) -99);
                        this.field3436.method1338(0.0F, (byte) -62);
                        this.field3436.method1338((float) (-var43) * var10 + var40, (byte) -81);
                        this.field3436.method1338((float) (-var43) * var11 + var41, (byte) -64);
                        this.field3436.method1338((float) (-var43) * var12 + var42, (byte) -83);
                        this.field3436.method565(arg1 ^ 0xFFFFFF97, var36);
                        this.field3436.method565(arg1 + 116, var37);
                        this.field3436.method565(arg1 - 34, var38);
                        this.field3436.method565(67, var39);
                        this.field3436.method1338(1.0F, (byte) -40);
                        this.field3436.method1338(0.0F, (byte) -68);
                        this.field3436.method1338((float) var43 * var13 + var40, (byte) -86);
                        this.field3436.method1338((float) var43 * var14 + var41, (byte) -16);
                        this.field3436.method1338((float) var43 * var15 + var42, (byte) -124);
                        this.field3436.method565(arg1 + 146, var36);
                        this.field3436.method565(-92, var37);
                        this.field3436.method565(-123, var38);
                        this.field3436.method565(43, var39);
                        this.field3436.method1338(1.0F, (byte) -22);
                        this.field3436.method1338(1.0F, (byte) -49);
                        this.field3436.method1338((float) var43 * var10 + var40, (byte) -90);
                        this.field3436.method1338((float) var43 * var11 + var41, (byte) -78);
                        this.field3436.method1338((float) var43 * var12 + var42, (byte) -53);
                        this.field3436.method565(-90, var36);
                        this.field3436.method565(-103, var37);
                        this.field3436.method565(36, var38);
                        this.field3436.method565(-118, var39);
                        this.field3436.method1338(0.0F, (byte) -15);
                        this.field3436.method1338(1.0F, (byte) -117);
                        this.field3436.method1338((float) var43 * var16 + var40, (byte) -84);
                        this.field3436.method1338((float) var43 * var17 + var41, (byte) -30);
                        this.field3436.method1338((float) var43 * var18 + var42, (byte) -124);
                        this.field3436.method565(89, var36);
                        this.field3436.method565(59, var37);
                        this.field3436.method565(arg1 ^ 0xB, var38);
                        this.field3436.method565(arg1 ^ 0x59, var39);
                    }
                    if (this.field3448[var19] > 64) {
                        int var22 = this.field3448[var19] - 64 - 1;
                        for (int var23 = this.field3453[var22] - 1; var23 >= 0; var23--) {
                            class355 var24 = this.field3449[var22][var23];
                            int var25 = var24.field4562;
                            byte var26 = (byte) (var25 >> 16);
                            byte var27 = (byte) (var25 >> 8);
                            byte var28 = (byte) var25;
                            byte var29 = (byte) (var25 >>> 24);
                            float var30 = (float) (var24.field4558 >> class338.field4324);
                            float var31 = (float) (var24.field4552 >> class338.field4324);
                            float var32 = (float) (var24.field4557 >> class338.field4324);
                            int var33 = var24.field4553 >> class338.field4324;
                            this.field3436.method1338(0.0F, (byte) -98);
                            this.field3436.method1338(0.0F, (byte) -122);
                            this.field3436.method1338((float) (-var33) * var10 + var30, (byte) -54);
                            this.field3436.method1338((float) (-var33) * var11 + var31, (byte) -113);
                            this.field3436.method1338((float) (-var33) * var12 + var32, (byte) -103);
                            this.field3436.method565(-101, var26);
                            this.field3436.method565(-95, var27);
                            this.field3436.method565(-99, var28);
                            this.field3436.method565(-100, var29);
                            this.field3436.method1338(1.0F, (byte) -101);
                            this.field3436.method1338(0.0F, (byte) -82);
                            this.field3436.method1338((float) var33 * var13 + var30, (byte) -20);
                            this.field3436.method1338((float) var33 * var14 + var31, (byte) -35);
                            this.field3436.method1338((float) var33 * var15 + var32, (byte) -50);
                            this.field3436.method565(49, var26);
                            this.field3436.method565(72, var27);
                            this.field3436.method565(arg1 ^ 0xFFFFFF9F, var28);
                            this.field3436.method565(-123, var29);
                            this.field3436.method1338(1.0F, (byte) -101);
                            this.field3436.method1338(1.0F, (byte) -121);
                            this.field3436.method1338((float) var33 * var10 + var30, (byte) -25);
                            this.field3436.method1338((float) var33 * var11 + var31, (byte) -100);
                            this.field3436.method1338((float) var33 * var12 + var32, (byte) -73);
                            this.field3436.method565(35, var26);
                            this.field3436.method565(-111, var27);
                            this.field3436.method565(-103, var28);
                            this.field3436.method565(-117, var29);
                            this.field3436.method1338(0.0F, (byte) -91);
                            this.field3436.method1338(1.0F, (byte) -17);
                            this.field3436.method1338((float) var33 * var16 + var30, (byte) -89);
                            this.field3436.method1338((float) var33 * var17 + var31, (byte) -97);
                            this.field3436.method1338((float) var33 * var18 + var32, (byte) -42);
                            this.field3436.method565(arg1 - 38, var26);
                            this.field3436.method565(116, var27);
                            this.field3436.method565(125, var28);
                            this.field3436.method565(54, var29);
                        }
                    }
                }
            }
        }
        if (this.field3436.field1176 != 0) {
            this.field3440.method343(24, this.field3436.field1223, this.field3436.field1176, 3238);
            arg0.method2788(null, this.field3442, this.field3443, (byte) -35, this.field3445);
            arg0.method2746(0, 7, 0, this.field3436.field1176 / 24);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lgk;Z)V", line = 462)
    private final void method1672(class463 arg0, boolean arg1) {
        arg0.method2782(-17939, arg1);
        field3434++;
        OpenGL.glEnable(16384);
        OpenGL.glEnable(16385);
        if (class349.field4473 != arg0.field6791) {
            arg0.method901(class349.field4473);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lgk;ILiv;)V", line = 497)
    public final void method1673(class463 arg0, int arg1, class287 arg2) {
        field3431++;
        if (arg0.field6807 == null) {
            return;
        }
        this.method1669((byte) -98, arg0);
        float var4 = arg0.field6807.field6301;
        float var5 = arg0.field6807.field6288;
        if (arg1 != -135) {
            this.field3442 = null;
        }
        float var6 = arg0.field6807.field6294;
        float var7 = arg0.field6807.field6286;
        try {
            if (arg2.field3667) {
                int var26 = arg2.field3668 - arg2.field3670;
                int var27;
                if (var26 + 2 > 1600) {
                    var27 = class487.method2909((byte) -91, var26) + 1 - this.field3447;
                    var26 = (var26 >> var27) + 2;
                } else {
                    var26 += 2;
                    var27 = 0;
                }
                class37 var28 = arg2.field3665.field6885;
                class37 var29 = var28.field568;
                int var30 = -2;
                boolean var31 = true;
                boolean var32 = true;
                while (var28 != var29) {
                    this.field3451 = 0;
                    for (int var33 = 0; var33 < var26; var33++) {
                        this.field3448[var33] = 0;
                    }
                    for (int var34 = 0; var34 < 64; var34++) {
                        this.field3453[var34] = 0;
                    }
                    while (var28 != var29) {
                        class355 var35 = (class355) var29;
                        if (var32) {
                            var31 = var35.field4559;
                            var30 = var35.field4556;
                            var32 = false;
                        } else if (var35.field4556 != var30 || var31 != var35.field4559) {
                            var32 = true;
                            break;
                        }
                        int var36 = (int) ((float) (var35.field4557 >> class338.field4324) * var6 + (float) (var35.field4558 >> class338.field4324) * var4 + (float) (var35.field4552 >> class338.field4324) * var5 + var7) - arg2.field3670 >> var27;
                        if (var36 < 1600) {
                            if (this.field3448[var36] >= 64) {
                                label145: {
                                    if (this.field3448[var36] == 64) {
                                        if (this.field3451 == 64) {
                                            break label145;
                                        }
                                        this.field3448[var36] += this.field3451++ + 1;
                                    }
                                    class355[] var10000 = this.field3449[this.field3448[var36] - 64 - 1];
                                    int var10002 = this.field3448[var36] - 65;
                                    int var10004 = this.field3453[this.field3448[var36] - 65];
                                    this.field3453[var10002] = this.field3453[this.field3448[var36] - 65] + 1;
                                    var10000[var10004] = var35;
                                }
                            } else {
                                this.field3450[var36][this.field3448[var36]++] = var35;
                            }
                        }
                        var29 = var29.field568;
                    }
                    if (var30 >= 0) {
                        arg0.method2771(arg0.field6683.method1075((byte) -127, var30), arg1 ^ 0x4116);
                        arg0.method2739(arg0.field1765.method460(-26282, var30).field7341, 0);
                    } else {
                        arg0.method2771(null, -16785);
                    }
                    if (var31 && class349.field4473 != arg0.field6791) {
                        arg0.method901(class349.field4473);
                    } else if (arg0.field6791 != 1.0F) {
                        arg0.method901(1.0F);
                    }
                    this.method1671(arg0, (byte) -49, var26);
                }
            } else {
                int var8 = 0;
                int var9 = Integer.MAX_VALUE;
                int var10 = 0;
                class37 var11 = arg2.field3665.field6885;
                for (class37 var12 = var11.field568; var12 != var11; var12 = var12.field568) {
                    class355 var13 = (class355) var12;
                    int var14 = (int) ((float) (var13.field4557 >> class338.field4324) * var6 + (float) (var13.field4558 >> class338.field4324) * var4 + (float) (var13.field4552 >> class338.field4324) * var5 + var7);
                    if (var9 > var14) {
                        var9 = var14;
                    }
                    if (var14 > var10) {
                        var10 = var14;
                    }
                    this.field3452[var8++] = var14;
                }
                int var15 = var10 - var9;
                int var16;
                if (var15 + 2 <= 1600) {
                    var15 += 2;
                    var16 = 0;
                } else {
                    var16 = class487.method2909((byte) -91, var15) + 1 - this.field3447;
                    var15 = (var15 >> var16) + 2;
                }
                int var17 = 0;
                class37 var18 = var11.field568;
                int var19 = -2;
                boolean var20 = true;
                boolean var21 = true;
                while (var11 != var18) {
                    this.field3451 = 0;
                    for (int var22 = 0; var22 < var15; var22++) {
                        this.field3448[var22] = 0;
                    }
                    for (int var23 = 0; var23 < 64; var23++) {
                        this.field3453[var23] = 0;
                    }
                    while (var11 != var18) {
                        class355 var24 = (class355) var18;
                        if (var21) {
                            var19 = var24.field4556;
                            var21 = false;
                            var20 = var24.field4559;
                        }
                        if (var17 > 0 && (var24.field4556 != var19 || var20 != var24.field4559)) {
                            var21 = true;
                            break;
                        }
                        int var25 = this.field3452[var17++] - var9 >> var16;
                        if (var25 < 1600) {
                            if (this.field3448[var25] >= 64) {
                                label190: {
                                    if (this.field3448[var25] == 64) {
                                        if (this.field3451 == 64) {
                                            break label190;
                                        }
                                        this.field3448[var25] += this.field3451++ + 1;
                                    }
                                    this.field3449[this.field3448[var25] - 1 - 64][this.field3453[this.field3448[var25] - 64 - 1]++] = var24;
                                }
                            } else {
                                this.field3450[var25][this.field3448[var25]++] = var24;
                            }
                        }
                        var18 = var18.field568;
                    }
                    if (var19 >= 0) {
                        arg0.method2771(arg0.field6683.method1075((byte) -126, var19), -16785);
                        arg0.method2739(arg0.field1765.method460(arg1 - 26147, var19).field7341, 0);
                    } else {
                        arg0.method2771(null, -16785);
                    }
                    if (var20 && class349.field4473 != arg0.field6791) {
                        arg0.method901(class349.field4473);
                    } else if (arg0.field6791 != 1.0F) {
                        arg0.method901(1.0F);
                    }
                    this.method1671(arg0, (byte) -49, var15);
                }
            }
        } catch (Exception var37) {
        }
        this.method1672(arg0, true);
    }
}
