import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class400 {

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "[F")
    private float[] field5658 = new float[16];

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "Ljt;")
    private class60 field5659 = new class60(786336);

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "I")
    private int field5661 = 0;

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "[I")
    private int[] field5663 = new int[8191];

    @OriginalMember(owner = "client!wa", name = "m", descriptor = "[I")
    private int[] field5670 = new int[1600];

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "[[Lfg;")
    private class74[][] field5667 = new class74[1600][64];

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "[[Lfg;")
    private class74[][] field5666 = new class74[64][768];

    @OriginalMember(owner = "client!wa", name = "l", descriptor = "[I")
    private int[] field5669 = new int[64];

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "Lga;")
    private class254 field5662;

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "Lga;")
    private class254 field5665;

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "Lga;")
    private class254 field5668;

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "Lht;")
    private class378 field5664;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "Ljaggl/opengl;")
    private opengl field5660;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lmi;I)V")
    private final void method2386(class315 arg0, int arg1) {
        this.field5660.glGetFloatv(2982, this.field5658, 0);
        float var3 = this.field5658[0];
        float var4 = this.field5658[4];
        float var5 = this.field5658[8];
        float var6 = this.field5658[1];
        float var7 = this.field5658[5];
        float var8 = this.field5658[9];
        float var9 = var3 + var6;
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var3 - var6;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var3;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        this.field5659.field4021 = 0;
        if (arg0.field4514) {
            for (int var18 = arg1 - 1; var18 >= 0; var18--) {
                int var19 = this.field5670[var18] > 64 ? 64 : this.field5670[var18];
                if (var19 > 0) {
                    for (int var20 = var19 - 1; var20 >= 0; var20--) {
                        class74 var21 = this.field5667[var18][var20];
                        int var22 = var21.field909;
                        byte var23 = (byte) (var22 >> 16);
                        byte var24 = (byte) (var22 >> 8);
                        byte var25 = (byte) var22;
                        byte var26 = (byte) (var22 >>> 24);
                        float var27 = (float) (var21.field913 >> class138.field1823);
                        float var28 = (float) (var21.field907 >> class138.field1823);
                        float var29 = (float) (var21.field910 >> class138.field1823);
                        int var30 = var21.field911 >> class138.field1823;
                        this.field5659.method374(0.0F, (byte) -60);
                        this.field5659.method374(0.0F, (byte) -97);
                        this.field5659.method374((float) (-var30) * var9 + var27, (byte) -47);
                        this.field5659.method374((float) (-var30) * var10 + var28, (byte) -60);
                        this.field5659.method374((float) (-var30) * var11 + var29, (byte) -118);
                        this.field5659.method1753(true, var23);
                        this.field5659.method1753(true, var24);
                        this.field5659.method1753(true, var25);
                        this.field5659.method1753(true, var26);
                        this.field5659.method374(1.0F, (byte) -63);
                        this.field5659.method374(0.0F, (byte) -59);
                        this.field5659.method374((float) var30 * var12 + var27, (byte) -76);
                        this.field5659.method374((float) var30 * var13 + var28, (byte) -117);
                        this.field5659.method374((float) var30 * var14 + var29, (byte) -99);
                        this.field5659.method1753(true, var23);
                        this.field5659.method1753(true, var24);
                        this.field5659.method1753(true, var25);
                        this.field5659.method1753(true, var26);
                        this.field5659.method374(1.0F, (byte) -110);
                        this.field5659.method374(1.0F, (byte) -49);
                        this.field5659.method374((float) var30 * var9 + var27, (byte) -88);
                        this.field5659.method374((float) var30 * var10 + var28, (byte) -127);
                        this.field5659.method374((float) var30 * var11 + var29, (byte) -46);
                        this.field5659.method1753(true, var23);
                        this.field5659.method1753(true, var24);
                        this.field5659.method1753(true, var25);
                        this.field5659.method1753(true, var26);
                        this.field5659.method374(0.0F, (byte) -63);
                        this.field5659.method374(1.0F, (byte) -61);
                        this.field5659.method374((float) var30 * var15 + var27, (byte) -76);
                        this.field5659.method374((float) var30 * var16 + var28, (byte) -58);
                        this.field5659.method374((float) var30 * var17 + var29, (byte) -100);
                        this.field5659.method1753(true, var23);
                        this.field5659.method1753(true, var24);
                        this.field5659.method1753(true, var25);
                        this.field5659.method1753(true, var26);
                    }
                    if (this.field5670[var18] > 64) {
                        int var31 = this.field5670[var18] - 64 - 1;
                        for (int var32 = this.field5669[var31] - 1; var32 >= 0; var32--) {
                            class74 var33 = this.field5666[var31][var32];
                            int var34 = var33.field909;
                            byte var35 = (byte) (var34 >> 16);
                            byte var36 = (byte) (var34 >> 8);
                            byte var37 = (byte) var34;
                            byte var38 = (byte) (var34 >>> 24);
                            float var39 = (float) (var33.field913 >> class138.field1823);
                            float var40 = (float) (var33.field907 >> class138.field1823);
                            float var41 = (float) (var33.field910 >> class138.field1823);
                            int var42 = var33.field911 >> class138.field1823;
                            this.field5659.method374(0.0F, (byte) -68);
                            this.field5659.method374(0.0F, (byte) -73);
                            this.field5659.method374((float) (-var42) * var9 + var39, (byte) -107);
                            this.field5659.method374((float) (-var42) * var10 + var40, (byte) -117);
                            this.field5659.method374((float) (-var42) * var11 + var41, (byte) -52);
                            this.field5659.method1753(true, var35);
                            this.field5659.method1753(true, var36);
                            this.field5659.method1753(true, var37);
                            this.field5659.method1753(true, var38);
                            this.field5659.method374(1.0F, (byte) -123);
                            this.field5659.method374(0.0F, (byte) -109);
                            this.field5659.method374((float) var42 * var12 + var39, (byte) -121);
                            this.field5659.method374((float) var42 * var13 + var40, (byte) -123);
                            this.field5659.method374((float) var42 * var14 + var41, (byte) -66);
                            this.field5659.method1753(true, var35);
                            this.field5659.method1753(true, var36);
                            this.field5659.method1753(true, var37);
                            this.field5659.method1753(true, var38);
                            this.field5659.method374(1.0F, (byte) -82);
                            this.field5659.method374(1.0F, (byte) -49);
                            this.field5659.method374((float) var42 * var9 + var39, (byte) -118);
                            this.field5659.method374((float) var42 * var10 + var40, (byte) -52);
                            this.field5659.method374((float) var42 * var11 + var41, (byte) -57);
                            this.field5659.method1753(true, var35);
                            this.field5659.method1753(true, var36);
                            this.field5659.method1753(true, var37);
                            this.field5659.method1753(true, var38);
                            this.field5659.method374(0.0F, (byte) -121);
                            this.field5659.method374(1.0F, (byte) -106);
                            this.field5659.method374((float) var42 * var15 + var39, (byte) -86);
                            this.field5659.method374((float) var42 * var16 + var40, (byte) -50);
                            this.field5659.method374((float) var42 * var17 + var41, (byte) -102);
                            this.field5659.method1753(true, var35);
                            this.field5659.method1753(true, var36);
                            this.field5659.method1753(true, var37);
                            this.field5659.method1753(true, var38);
                        }
                    }
                }
            }
        } else {
            for (int var43 = arg1 - 1; var43 >= 0; var43--) {
                int var44 = this.field5670[var43] > 64 ? 64 : this.field5670[var43];
                if (var44 > 0) {
                    for (int var45 = var44 - 1; var45 >= 0; var45--) {
                        class74 var46 = this.field5667[var43][var45];
                        int var47 = var46.field909;
                        byte var48 = (byte) (var47 >> 16);
                        byte var49 = (byte) (var47 >> 8);
                        byte var50 = (byte) var47;
                        byte var51 = (byte) (var47 >>> 24);
                        float var52 = (float) (var46.field913 >> class138.field1823);
                        float var53 = (float) (var46.field907 >> class138.field1823);
                        float var54 = (float) (var46.field910 >> class138.field1823);
                        int var55 = var46.field911 >> class138.field1823;
                        this.field5659.method373(-108, 0.0F);
                        this.field5659.method373(-115, 0.0F);
                        this.field5659.method373(-127, (float) (-var55) * var9 + var52);
                        this.field5659.method373(-110, (float) (-var55) * var10 + var53);
                        this.field5659.method373(-116, (float) (-var55) * var11 + var54);
                        this.field5659.method1753(true, var48);
                        this.field5659.method1753(true, var49);
                        this.field5659.method1753(true, var50);
                        this.field5659.method1753(true, var51);
                        this.field5659.method373(-106, 1.0F);
                        this.field5659.method373(-111, 0.0F);
                        this.field5659.method373(-121, (float) var55 * var12 + var52);
                        this.field5659.method373(-115, (float) var55 * var13 + var53);
                        this.field5659.method373(-112, (float) var55 * var14 + var54);
                        this.field5659.method1753(true, var48);
                        this.field5659.method1753(true, var49);
                        this.field5659.method1753(true, var50);
                        this.field5659.method1753(true, var51);
                        this.field5659.method373(-118, 1.0F);
                        this.field5659.method373(-112, 1.0F);
                        this.field5659.method373(-106, (float) var55 * var9 + var52);
                        this.field5659.method373(-111, (float) var55 * var10 + var53);
                        this.field5659.method373(-111, (float) var55 * var11 + var54);
                        this.field5659.method1753(true, var48);
                        this.field5659.method1753(true, var49);
                        this.field5659.method1753(true, var50);
                        this.field5659.method1753(true, var51);
                        this.field5659.method373(-116, 0.0F);
                        this.field5659.method373(-119, 1.0F);
                        this.field5659.method373(-118, (float) var55 * var15 + var52);
                        this.field5659.method373(-115, (float) var55 * var16 + var53);
                        this.field5659.method373(-124, (float) var55 * var17 + var54);
                        this.field5659.method1753(true, var48);
                        this.field5659.method1753(true, var49);
                        this.field5659.method1753(true, var50);
                        this.field5659.method1753(true, var51);
                    }
                    if (this.field5670[var43] > 64) {
                        int var56 = this.field5670[var43] - 64 - 1;
                        for (int var57 = this.field5669[var56] - 1; var57 >= 0; var57--) {
                            class74 var58 = this.field5666[var56][var57];
                            int var59 = var58.field909;
                            byte var60 = (byte) (var59 >> 16);
                            byte var61 = (byte) (var59 >> 8);
                            byte var62 = (byte) var59;
                            byte var63 = (byte) (var59 >>> 24);
                            float var64 = (float) (var58.field913 >> class138.field1823);
                            float var65 = (float) (var58.field907 >> class138.field1823);
                            float var66 = (float) (var58.field910 >> class138.field1823);
                            int var67 = var58.field911 >> class138.field1823;
                            this.field5659.method373(-114, 0.0F);
                            this.field5659.method373(-115, 0.0F);
                            this.field5659.method373(-107, (float) (-var67) * var9 + var64);
                            this.field5659.method373(-117, (float) (-var67) * var10 + var65);
                            this.field5659.method373(-119, (float) (-var67) * var11 + var66);
                            this.field5659.method1753(true, var60);
                            this.field5659.method1753(true, var61);
                            this.field5659.method1753(true, var62);
                            this.field5659.method1753(true, var63);
                            this.field5659.method373(-108, 1.0F);
                            this.field5659.method373(-118, 0.0F);
                            this.field5659.method373(-120, (float) var67 * var12 + var64);
                            this.field5659.method373(-107, (float) var67 * var13 + var65);
                            this.field5659.method373(-107, (float) var67 * var14 + var66);
                            this.field5659.method1753(true, var60);
                            this.field5659.method1753(true, var61);
                            this.field5659.method1753(true, var62);
                            this.field5659.method1753(true, var63);
                            this.field5659.method373(-122, 1.0F);
                            this.field5659.method373(-111, 1.0F);
                            this.field5659.method373(-110, (float) var67 * var9 + var64);
                            this.field5659.method373(-111, (float) var67 * var10 + var65);
                            this.field5659.method373(-118, (float) var67 * var11 + var66);
                            this.field5659.method1753(true, var60);
                            this.field5659.method1753(true, var61);
                            this.field5659.method1753(true, var62);
                            this.field5659.method1753(true, var63);
                            this.field5659.method373(-114, 0.0F);
                            this.field5659.method373(-122, 1.0F);
                            this.field5659.method373(-126, (float) var67 * var15 + var64);
                            this.field5659.method373(-109, (float) var67 * var16 + var65);
                            this.field5659.method373(-110, (float) var67 * var17 + var66);
                            this.field5659.method1753(true, var60);
                            this.field5659.method1753(true, var61);
                            this.field5659.method1753(true, var62);
                            this.field5659.method1753(true, var63);
                        }
                    }
                }
            }
        }
        if (this.field5659.field4021 != 0) {
            this.field5664.method837(24, this.field5659.field4064, this.field5659.field4021);
            arg0.method2008(this.field5665, (class254) null, this.field5668, this.field5662);
            arg0.method1980(7, 0, this.field5659.field4021 / 24);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lmi;)V")
    private final void method2387(class315 arg0) {
        arg0.method1966(true);
        this.field5660.glEnable(16384);
        this.field5660.glEnable(16385);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lmi;Lcs;)V")
    public final void method2388(class315 arg0, class207 arg1) {
        this.field5660 = arg0.field4445;
        if (arg0.field4484 == null) {
            return;
        }
        this.method2390(arg0);
        float var3 = arg0.field4484.field4626;
        float var4 = arg0.field4484.field4627;
        float var5 = arg0.field4484.field4629;
        float var6 = arg0.field4484.field4630;
        try {
            if (arg1.field3168) {
                int var23 = arg1.field3169 - arg1.field3167;
                if (var23 > 1600) {
                    var23 = 1600;
                }
                class413 var24 = arg1.field3161.field3579;
                class413 var25 = var24.field5807;
                int var26 = -2;
                boolean var27 = true;
                while (var24 != var25) {
                    this.field5661 = 0;
                    for (int var28 = 0; var28 < var23; var28++) {
                        this.field5670[var28] = 0;
                    }
                    for (int var29 = 0; var29 < 64; var29++) {
                        this.field5669[var29] = 0;
                    }
                    while (var24 != var25) {
                        class74 var30 = (class74) var25;
                        if (var27) {
                            var26 = var30.field915;
                            var27 = false;
                        } else if (var30.field915 != var26) {
                            var27 = true;
                            break;
                        }
                        int var31 = (int) ((float) (var30.field910 >> class138.field1823) * var5 + (float) (var30.field913 >> class138.field1823) * var3 + (float) (var30.field907 >> class138.field1823) * var4 + var6) - arg1.field3167;
                        if (var31 <= 1600) {
                            if (this.field5670[var31] < 64) {
                                this.field5667[var31][this.field5670[var31]++] = var30;
                            } else {
                                label188: {
                                    if (this.field5670[var31] == 64) {
                                        if (this.field5661 == 64) {
                                            break label188;
                                        }
                                        this.field5670[var31] += this.field5661++ + 1;
                                    }
                                    this.field5666[this.field5670[var31] - 64 - 1][this.field5669[this.field5670[var31] - 64 - 1]++] = var30;
                                }
                            }
                        }
                        var25 = var25.field5807;
                    }
                    arg0.method1967(var26 >= 0 ? arg0.field4454.method2602(92, var26) : null);
                    this.method2386(arg0, var23);
                }
            } else {
                int var7 = 0;
                int var8 = Integer.MAX_VALUE;
                int var9 = 0;
                class413 var10 = arg1.field3161.field3579;
                for (class413 var11 = var10.field5807; var11 != var10; var11 = var11.field5807) {
                    class74 var12 = (class74) var11;
                    int var13 = (int) ((float) (var12.field910 >> class138.field1823) * var5 + (float) (var12.field913 >> class138.field1823) * var3 + (float) (var12.field907 >> class138.field1823) * var4 + var6);
                    if (var13 > var9) {
                        var9 = var13;
                    }
                    if (var13 < var8) {
                        var8 = var13;
                    }
                    this.field5663[var7++] = var13;
                }
                int var14 = var9 - var8;
                if (var14 > 1600) {
                    var14 = 1600;
                }
                class413 var15 = var10.field5807;
                int var16 = 0;
                int var17 = -2;
                boolean var18 = true;
                while (var10 != var15) {
                    this.field5661 = 0;
                    for (int var19 = 0; var19 < var14; var19++) {
                        this.field5670[var19] = 0;
                    }
                    for (int var20 = 0; var20 < 64; var20++) {
                        this.field5669[var20] = 0;
                    }
                    while (var10 != var15) {
                        class74 var21 = (class74) var15;
                        if (var18) {
                            var17 = var21.field915;
                            var18 = false;
                        }
                        if (var16 > 0 && var21.field915 != var17) {
                            var18 = true;
                            break;
                        }
                        int var22 = this.field5663[var16++] - var8;
                        if (var22 <= 1600) {
                            if (this.field5670[var22] < 64) {
                                this.field5667[var22][this.field5670[var22]++] = var21;
                            } else {
                                label186: {
                                    if (this.field5670[var22] == 64) {
                                        if (this.field5661 == 64) {
                                            break label186;
                                        }
                                        this.field5670[var22] += this.field5661++ + 1;
                                    }
                                    this.field5666[this.field5670[var22] - 64 - 1][this.field5669[this.field5670[var22] - 64 - 1]++] = var21;
                                }
                            }
                        }
                        var15 = var15.field5807;
                    }
                    arg0.method1967(var17 >= 0 ? arg0.field4454.method2602(115, var17) : null);
                    this.method2386(arg0, var14);
                }
            }
        } catch (Exception var33) {
        }
        this.method2387(arg0);
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(Lmi;)V")
    public final void method2389(class315 arg0) {
        this.field5664 = arg0.method2004(24, (byte[]) null, 196584, true);
        this.field5662 = new class254(arg0, this.field5664, 5126, 2, 0);
        this.field5665 = new class254(arg0, this.field5664, 5126, 3, 8);
        this.field5668 = new class254(arg0, this.field5664, 5121, 4, 20);
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(Lmi;)V")
    private final void method2390(class315 arg0) {
        arg0.method1958();
        this.field5660.glDisable(16384);
        this.field5660.glDisable(16385);
        arg0.method1966(false);
        arg0.method2002(-2);
        this.field5660.glNormal3f(0.0F, -1.0F, 0.0F);
    }
}
