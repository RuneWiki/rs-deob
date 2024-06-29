import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public class class154 {

    @OriginalMember(owner = "client!su", name = "g", descriptor = "[F")
    private float[] field1997 = new float[16];

    @OriginalMember(owner = "client!su", name = "b", descriptor = "Lfw;")
    private class458 field1992 = new class458(786336);

    @OriginalMember(owner = "client!su", name = "n", descriptor = "I")
    private int field2004 = class517.method2798(-24420, 1600);

    @OriginalMember(owner = "client!su", name = "p", descriptor = "[I")
    private int[] field2006 = new int[64];

    @OriginalMember(owner = "client!su", name = "r", descriptor = "[I")
    private int[] field2008 = new int[8191];

    @OriginalMember(owner = "client!su", name = "s", descriptor = "[[Lmm;")
    private class26[][] field2009 = new class26[1600][64];

    @OriginalMember(owner = "client!su", name = "t", descriptor = "[[Lmm;")
    private class26[][] field2010 = new class26[64][768];

    @OriginalMember(owner = "client!su", name = "u", descriptor = "I")
    private int field2011 = 0;

    @OriginalMember(owner = "client!su", name = "q", descriptor = "[I")
    private int[] field2007 = new int[1600];

    @OriginalMember(owner = "client!su", name = "a", descriptor = "[Lwd;")
    public static class356[] field1991 = new class356[4];

    @OriginalMember(owner = "client!su", name = "c", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!su", name = "d", descriptor = "I")
    public static int field1994;

    @OriginalMember(owner = "client!su", name = "e", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!su", name = "f", descriptor = "I")
    public static int field1996;

    @OriginalMember(owner = "client!su", name = "h", descriptor = "I")
    public static int field1998;

    @OriginalMember(owner = "client!su", name = "i", descriptor = "I")
    public static int field1999;

    @OriginalMember(owner = "client!su", name = "j", descriptor = "I")
    public static int field2000;

    @OriginalMember(owner = "client!su", name = "k", descriptor = "Lgv;")
    private class325 field2001;

    @OriginalMember(owner = "client!su", name = "l", descriptor = "Lgv;")
    private class325 field2002;

    @OriginalMember(owner = "client!su", name = "o", descriptor = "Lgv;")
    private class325 field2005;

    @OriginalMember(owner = "client!su", name = "m", descriptor = "Lnl;")
    private class585 field2003;

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(IILqj;)V", line = 3)
    private final void method876(int arg0, int arg1, class548 arg2) {
        OpenGL.glGetFloatv(2982, this.field1997, 0);
        field1994++;
        float var4 = this.field1997[0];
        float var5 = this.field1997[4];
        if (arg0 != 8593) {
            this.method880(null, (byte) 77);
        }
        float var6 = this.field1997[8];
        float var7 = this.field1997[1];
        float var8 = this.field1997[5];
        float var9 = this.field1997[9];
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var6 + var9;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var9;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        this.field1992.field8812 = 0;
        float var18 = var9 - var6;
        if (arg2.field7579) {
            for (int var44 = arg1 - 1; var44 >= 0; var44--) {
                int var45 = this.field2007[var44] > 64 ? 64 : this.field2007[var44];
                if (var45 > 0) {
                    for (int var46 = var45 - 1; var46 >= 0; var46--) {
                        class26 var59 = this.field2009[var44][var46];
                        int var60 = var59.field386;
                        byte var61 = (byte) (var60 >> 16);
                        byte var62 = (byte) (var60 >> 8);
                        byte var63 = (byte) var60;
                        byte var64 = (byte) (var60 >>> 24);
                        float var65 = (float) (var59.field393 >> 12);
                        float var66 = (float) (var59.field390 >> 12);
                        float var67 = (float) (var59.field388 >> 12);
                        int var68 = var59.field385 >> 12;
                        this.field1992.method2449(0.0F, -68);
                        this.field1992.method2449(0.0F, -121);
                        this.field1992.method2449((float) (-var68) * var10 + var65, arg0 + -8718);
                        this.field1992.method2449((float) (-var68) * var11 + var66, arg0 + -8673);
                        this.field1992.method2449((float) (-var68) * var12 + var67, arg0 + -8488);
                        this.field1992.method3509(var61, (byte) -123);
                        this.field1992.method3509(var62, (byte) -126);
                        this.field1992.method3509(var63, (byte) -109);
                        this.field1992.method3509(var64, (byte) -120);
                        this.field1992.method2449(1.0F, arg0 ^ 0xFFFFDE0F);
                        this.field1992.method2449(0.0F, 95);
                        this.field1992.method2449((float) var68 * var13 + var65, -67);
                        this.field1992.method2449((float) var68 * var14 + var66, -76);
                        this.field1992.method2449((float) var68 * var15 + var67, -106);
                        this.field1992.method3509(var61, (byte) -121);
                        this.field1992.method3509(var62, (byte) -122);
                        this.field1992.method3509(var63, (byte) -124);
                        this.field1992.method3509(var64, (byte) -123);
                        this.field1992.method2449(1.0F, 77);
                        this.field1992.method2449(1.0F, 30);
                        this.field1992.method2449((float) var68 * var10 + var65, -95);
                        this.field1992.method2449((float) var68 * var11 + var66, -108);
                        this.field1992.method2449((float) var68 * var12 + var67, -87);
                        this.field1992.method3509(var61, (byte) -125);
                        this.field1992.method3509(var62, (byte) -126);
                        this.field1992.method3509(var63, (byte) -113);
                        this.field1992.method3509(var64, (byte) -113);
                        this.field1992.method2449(0.0F, arg0 - 8719);
                        this.field1992.method2449(1.0F, arg0 ^ 0xFFFFDE2B);
                        this.field1992.method2449((float) var68 * var16 + var65, arg0 ^ 0x21A3);
                        this.field1992.method2449((float) var68 * var17 + var66, arg0 ^ 0x21AF);
                        this.field1992.method2449((float) var68 * var18 + var67, arg0 ^ 0x21A2);
                        this.field1992.method3509(var61, (byte) -114);
                        this.field1992.method3509(var62, (byte) -114);
                        this.field1992.method3509(var63, (byte) -123);
                        this.field1992.method3509(var64, (byte) -120);
                    }
                    if (this.field2007[var44] > 64) {
                        int var47 = this.field2007[var44] - 64 - 1;
                        for (int var48 = this.field2006[var47] - 1; var48 >= 0; var48--) {
                            class26 var49 = this.field2010[var47][var48];
                            int var50 = var49.field386;
                            byte var51 = (byte) (var50 >> 16);
                            byte var52 = (byte) (var50 >> 8);
                            byte var53 = (byte) var50;
                            byte var54 = (byte) (var50 >>> 24);
                            float var55 = (float) (var49.field393 >> 12);
                            float var56 = (float) (var49.field390 >> 12);
                            float var57 = (float) (var49.field388 >> 12);
                            int var58 = var49.field385 >> 12;
                            this.field1992.method2449(0.0F, -114);
                            this.field1992.method2449(0.0F, arg0 - 8558);
                            this.field1992.method2449((float) (-var58) * var10 + var55, arg0 ^ 0xFFFFDE54);
                            this.field1992.method2449((float) (-var58) * var11 + var56, -55);
                            this.field1992.method2449((float) (-var58) * var12 + var57, 80);
                            this.field1992.method3509(var51, (byte) -121);
                            this.field1992.method3509(var52, (byte) -113);
                            this.field1992.method3509(var53, (byte) -127);
                            this.field1992.method3509(var54, (byte) -113);
                            this.field1992.method2449(1.0F, arg0 ^ 0x21D0);
                            this.field1992.method2449(0.0F, -83);
                            this.field1992.method2449((float) var58 * var13 + var55, 102);
                            this.field1992.method2449((float) var58 * var14 + var56, -85);
                            this.field1992.method2449((float) var58 * var15 + var57, arg0 + -8647);
                            this.field1992.method3509(var51, (byte) -110);
                            this.field1992.method3509(var52, (byte) -112);
                            this.field1992.method3509(var53, (byte) -128);
                            this.field1992.method3509(var54, (byte) -112);
                            this.field1992.method2449(1.0F, arg0 ^ 0x21F3);
                            this.field1992.method2449(1.0F, 28);
                            this.field1992.method2449((float) var58 * var10 + var55, -78);
                            this.field1992.method2449((float) var58 * var11 + var56, 111);
                            this.field1992.method2449((float) var58 * var12 + var57, 40);
                            this.field1992.method3509(var51, (byte) -110);
                            this.field1992.method3509(var52, (byte) -121);
                            this.field1992.method3509(var53, (byte) -127);
                            this.field1992.method3509(var54, (byte) -111);
                            this.field1992.method2449(0.0F, -52);
                            this.field1992.method2449(1.0F, -100);
                            this.field1992.method2449((float) var58 * var16 + var55, arg0 ^ 0x21E2);
                            this.field1992.method2449((float) var58 * var17 + var56, arg0 + -8544);
                            this.field1992.method2449((float) var58 * var18 + var57, -99);
                            this.field1992.method3509(var51, (byte) -122);
                            this.field1992.method3509(var52, (byte) -121);
                            this.field1992.method3509(var53, (byte) -121);
                            this.field1992.method3509(var54, (byte) -127);
                        }
                    }
                }
            }
        } else {
            for (int var19 = arg1 - 1; var19 >= 0; var19--) {
                int var20 = this.field2007[var19] > 64 ? 64 : this.field2007[var19];
                if (var20 > 0) {
                    for (int var21 = var20 - 1; var21 >= 0; var21--) {
                        class26 var34 = this.field2009[var19][var21];
                        int var35 = var34.field386;
                        byte var36 = (byte) (var35 >> 16);
                        byte var37 = (byte) (var35 >> 8);
                        byte var38 = (byte) var35;
                        byte var39 = (byte) (var35 >>> 24);
                        float var40 = (float) (var34.field393 >> 12);
                        float var41 = (float) (var34.field390 >> 12);
                        float var42 = (float) (var34.field388 >> 12);
                        int var43 = var34.field385 >> 12;
                        this.field1992.method2447((byte) -71, 0.0F);
                        this.field1992.method2447((byte) -71, 0.0F);
                        this.field1992.method2447((byte) -71, (float) (-var43) * var10 + var40);
                        this.field1992.method2447((byte) -71, (float) (-var43) * var11 + var41);
                        this.field1992.method2447((byte) -71, (float) (-var43) * var12 + var42);
                        this.field1992.method3509(var36, (byte) -115);
                        this.field1992.method3509(var37, (byte) -125);
                        this.field1992.method3509(var38, (byte) -128);
                        this.field1992.method3509(var39, (byte) -117);
                        this.field1992.method2447((byte) -71, 1.0F);
                        this.field1992.method2447((byte) -71, 0.0F);
                        this.field1992.method2447((byte) -71, (float) var43 * var13 + var40);
                        this.field1992.method2447((byte) -71, (float) var43 * var14 + var41);
                        this.field1992.method2447((byte) -71, (float) var43 * var15 + var42);
                        this.field1992.method3509(var36, (byte) -122);
                        this.field1992.method3509(var37, (byte) -124);
                        this.field1992.method3509(var38, (byte) -120);
                        this.field1992.method3509(var39, (byte) -124);
                        this.field1992.method2447((byte) -71, 1.0F);
                        this.field1992.method2447((byte) -71, 1.0F);
                        this.field1992.method2447((byte) -71, (float) var43 * var10 + var40);
                        this.field1992.method2447((byte) -71, (float) var43 * var11 + var41);
                        this.field1992.method2447((byte) -71, (float) var43 * var12 + var42);
                        this.field1992.method3509(var36, (byte) -128);
                        this.field1992.method3509(var37, (byte) -108);
                        this.field1992.method3509(var38, (byte) -125);
                        this.field1992.method3509(var39, (byte) -126);
                        this.field1992.method2447((byte) -71, 0.0F);
                        this.field1992.method2447((byte) -71, 1.0F);
                        this.field1992.method2447((byte) -71, (float) var43 * var16 + var40);
                        this.field1992.method2447((byte) -71, (float) var43 * var17 + var41);
                        this.field1992.method2447((byte) -71, (float) var43 * var18 + var42);
                        this.field1992.method3509(var36, (byte) -123);
                        this.field1992.method3509(var37, (byte) -117);
                        this.field1992.method3509(var38, (byte) -126);
                        this.field1992.method3509(var39, (byte) -116);
                    }
                    if (this.field2007[var19] > 64) {
                        int var22 = this.field2007[var19] - 65;
                        for (int var23 = this.field2006[var22] - 1; var23 >= 0; var23--) {
                            class26 var24 = this.field2010[var22][var23];
                            int var25 = var24.field386;
                            byte var26 = (byte) (var25 >> 16);
                            byte var27 = (byte) (var25 >> 8);
                            byte var28 = (byte) var25;
                            byte var29 = (byte) (var25 >>> 24);
                            float var30 = (float) (var24.field393 >> 12);
                            float var31 = (float) (var24.field390 >> 12);
                            float var32 = (float) (var24.field388 >> 12);
                            int var33 = var24.field385 >> 12;
                            this.field1992.method2447((byte) -71, 0.0F);
                            this.field1992.method2447((byte) -71, 0.0F);
                            this.field1992.method2447((byte) -71, (float) (-var33) * var10 + var30);
                            this.field1992.method2447((byte) -71, (float) (-var33) * var11 + var31);
                            this.field1992.method2447((byte) -71, (float) (-var33) * var12 + var32);
                            this.field1992.method3509(var26, (byte) -124);
                            this.field1992.method3509(var27, (byte) -117);
                            this.field1992.method3509(var28, (byte) -120);
                            this.field1992.method3509(var29, (byte) -128);
                            this.field1992.method2447((byte) -71, 1.0F);
                            this.field1992.method2447((byte) -71, 0.0F);
                            this.field1992.method2447((byte) -71, (float) var33 * var13 + var30);
                            this.field1992.method2447((byte) -71, (float) var33 * var14 + var31);
                            this.field1992.method2447((byte) -71, (float) var33 * var15 + var32);
                            this.field1992.method3509(var26, (byte) -118);
                            this.field1992.method3509(var27, (byte) -126);
                            this.field1992.method3509(var28, (byte) -118);
                            this.field1992.method3509(var29, (byte) -124);
                            this.field1992.method2447((byte) -71, 1.0F);
                            this.field1992.method2447((byte) -71, 1.0F);
                            this.field1992.method2447((byte) -71, (float) var33 * var10 + var30);
                            this.field1992.method2447((byte) -71, (float) var33 * var11 + var31);
                            this.field1992.method2447((byte) -71, (float) var33 * var12 + var32);
                            this.field1992.method3509(var26, (byte) -128);
                            this.field1992.method3509(var27, (byte) -122);
                            this.field1992.method3509(var28, (byte) -111);
                            this.field1992.method3509(var29, (byte) -110);
                            this.field1992.method2447((byte) -71, 0.0F);
                            this.field1992.method2447((byte) -71, 1.0F);
                            this.field1992.method2447((byte) -71, (float) var33 * var16 + var30);
                            this.field1992.method2447((byte) -71, (float) var33 * var17 + var31);
                            this.field1992.method2447((byte) -71, (float) var33 * var18 + var32);
                            this.field1992.method3509(var26, (byte) -116);
                            this.field1992.method3509(var27, (byte) -111);
                            this.field1992.method3509(var28, (byte) -123);
                            this.field1992.method3509(var29, (byte) -123);
                        }
                    }
                }
            }
        }
        if (this.field1992.field8812 != 0) {
            this.field2003.method829(this.field1992.field8804, this.field1992.field8812, 24, (byte) -80);
            arg2.method2985(this.field2001, (byte) 83, this.field2002, this.field2005, null);
            arg2.method3004((byte) -121, this.field1992.field8812 / 24, 7, 0);
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(Lqj;I)V", line = 359)
    private final void method877(class548 arg0, int arg1) {
        arg0.method2953(true, 120);
        if (arg1 > -94) {
            this.field2004 = -29;
        }
        field1996++;
        OpenGL.glEnable(16384);
        OpenGL.glEnable(16385);
        if (class326.field4183 != arg0.field7568) {
            arg0.method1054(class326.field4183);
        }
    }

    @OriginalMember(owner = "client!su", name = "b", descriptor = "(IILqj;)V", line = 380)
    private final void method878(int arg0, int arg1, class548 arg2) {
        class326.field4183 = arg2.field7568;
        field1999++;
        if (arg0 != 0) {
            this.method878(116, -36, null);
        }
        arg2.method2977((byte) 95, (float) arg1);
        arg2.method2950(379);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        arg2.method2953(false, 126);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(IIIZLbda;)V", line = 399)
    public static final void method879(int arg0, int arg1, int arg2, boolean arg3, class441 arg4) {
        field1998++;
        for (class164 var5 = (class164) class236.field2953.method237(90); var5 != null; var5 = (class164) class236.field2953.method245((byte) 71)) {
            if (var5.field2166 == arg1 && (arg2 << 9) == var5.field2162 && (arg0 << 9) == var5.field2150 && var5.field2155.field5504 == arg4.field5504) {
                if (var5.field2170 != null) {
                    class480.field6387.method1295(var5.field2170);
                    var5.field2170 = null;
                }
                if (var5.field2156 != null) {
                    class480.field6387.method1295(var5.field2156);
                    var5.field2156 = null;
                }
                var5.method1871(-108);
                return;
            }
        }
        if (!arg3) {
            method879(97, 33, 123, true, null);
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(Lqj;B)V", line = 439)
    private final void method880(class548 arg0, byte arg1) {
        class326.field4183 = arg0.field7568;
        field1995++;
        arg0.method2988(-102);
        if (arg1 != -92) {
            this.field1997 = null;
        }
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        arg0.method2953(false, -80);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(BLqj;)V", line = 457)
    public final void method881(byte arg0, class548 arg1) {
        this.field2003 = arg1.method3024(null, 196584, true, 24, 66);
        if (arg0 <= 48) {
            method883(-72);
        }
        field2000++;
        this.field2005 = new class325(this.field2003, 5126, 2, 0);
        this.field2001 = new class325(this.field2003, 5126, 3, 8);
        this.field2002 = new class325(this.field2003, 5121, 4, 20);
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(ZLir;Lqj;I)V", line = 474)
    public final void method882(boolean arg0, class27 arg1, class548 arg2, int arg3) {
        field1993++;
        if (arg2.field7507 == null) {
            return;
        }
        if (arg3 >= 0) {
            this.method878(0, arg3, arg2);
        } else {
            this.method880(arg2, (byte) -92);
        }
        float var5 = arg2.field7507.field2070;
        float var6 = arg2.field7507.field2058;
        float var7 = arg2.field7507.field2086;
        if (arg0) {
            this.field2011 = -79;
        }
        float var8 = arg2.field7507.field2064;
        try {
            int var9 = 0;
            int var10 = Integer.MAX_VALUE;
            int var11 = 0;
            class181 var12 = arg1.field399.field1895;
            for (class181 var13 = var12.field2322; var13 != var12; var13 = var13.field2322) {
                class26 var14 = (class26) var13;
                int var15 = (int) ((float) (var14.field388 >> 12) * var7 + (float) (var14.field393 >> 12) * var5 + (float) (var14.field390 >> 12) * var6 + var8);
                if (var11 < var15) {
                    var11 = var15;
                }
                this.field2008[var9++] = var15;
                if (var15 < var10) {
                    var10 = var15;
                }
            }
            int var16 = var11 - var10;
            int var17;
            if ((var16 + 2) <= 1600) {
                var16 += 2;
                var17 = 0;
            } else {
                var17 = class517.method2798(-24420, var16) + 1 - this.field2004;
                var16 = (var16 >> var17) + 2;
            }
            class181 var18 = var12.field2322;
            int var19 = 0;
            int var20 = -2;
            boolean var21 = true;
            boolean var22 = true;
            while (var12 != var18) {
                this.field2011 = 0;
                for (int var23 = 0; var23 < var16; var23++) {
                    this.field2007[var23] = 0;
                }
                for (int var24 = 0; var24 < 64; var24++) {
                    this.field2006[var24] = 0;
                }
                while (var12 != var18) {
                    class26 var25 = (class26) var18;
                    if (var22) {
                        var20 = var25.field398;
                        var21 = var25.field384;
                        var22 = false;
                    }
                    if (var19 > 0 && (var25.field398 != var20 || var21 != var25.field384)) {
                        var22 = true;
                        break;
                    }
                    int var26 = this.field2008[var19++] - var10 >> var17;
                    if (var26 < 1600) {
                        if (this.field2007[var26] >= 64) {
                            label102: {
                                if (this.field2007[var26] == 64) {
                                    if (this.field2011 == 64) {
                                        break label102;
                                    }
                                    this.field2007[var26] += this.field2011++ + 1;
                                }
                                class26[] var28 = this.field2010[this.field2007[var26] - 65];
                                int var10002 = this.field2007[var26] - 65;
                                int var10004 = this.field2006[this.field2007[var26] - 65];
                                this.field2006[var10002] = this.field2006[this.field2007[var26] - 65] + 1;
                                var28[var10004] = var25;
                            }
                        } else {
                            this.field2009[var26][this.field2007[var26]++] = var25;
                        }
                    }
                    var18 = var18.field2322;
                }
                if (var20 < 0) {
                    arg2.method2961(-1, (byte) -41);
                } else {
                    arg2.method2961(var20, (byte) -32);
                }
                if (var21 && class326.field4183 != arg2.field7568) {
                    arg2.method1054(class326.field4183);
                } else if (arg2.field7568 != 1.0F) {
                    arg2.method1054(1.0F);
                }
                this.method876(8593, var16, arg2);
            }
        } catch (Exception var27) {
        }
        this.method877(arg2, -112);
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(I)V", line = 646)
    public static void method883(int arg0) {
        if (arg0 == -1) {
            field1991 = null;
        }
    }
}
