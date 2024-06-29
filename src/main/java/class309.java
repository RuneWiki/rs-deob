import jaggl.OpenGL;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class309 extends class503 {

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "Z")
    private boolean field4493 = false;

    @OriginalMember(owner = "client!bg", name = "z", descriptor = "Z")
    private boolean field4509;

    @OriginalMember(owner = "client!bg", name = "w", descriptor = "[Lgh;")
    private class368[] field4506;

    @OriginalMember(owner = "client!bg", name = "l", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field4495 = new Rectangle[100];

    @OriginalMember(owner = "client!bg", name = "r", descriptor = "Lpp;")
    public static class256 field4501;

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "I")
    public static int field4494;

    @OriginalMember(owner = "client!bg", name = "m", descriptor = "I")
    public static int field4496;

    @OriginalMember(owner = "client!bg", name = "n", descriptor = "I")
    public static int field4497;

    @OriginalMember(owner = "client!bg", name = "o", descriptor = "I")
    public static int field4498;

    @OriginalMember(owner = "client!bg", name = "p", descriptor = "I")
    public static int field4499;

    @OriginalMember(owner = "client!bg", name = "q", descriptor = "I")
    public static int field4500;

    @OriginalMember(owner = "client!bg", name = "s", descriptor = "I")
    public static int field4502;

    @OriginalMember(owner = "client!bg", name = "t", descriptor = "I")
    public static int field4503;

    @OriginalMember(owner = "client!bg", name = "v", descriptor = "I")
    public static int field4505;

    @OriginalMember(owner = "client!bg", name = "y", descriptor = "I")
    public static int field4508;

    @OriginalMember(owner = "client!bg", name = "x", descriptor = "Liu;")
    public static class390 field4507;

    @OriginalMember(owner = "client!bg", name = "u", descriptor = "Lhu;")
    private class81 field4504;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IBLtu;)V")
    public final void method626(int arg0, byte arg1, class221 arg2) {
        super.field7679.method2883(arg2, 16);
        ++field4494;
        if (arg1 >= -21) {
            field4495 = null;
        }
        super.field7679.method2914(127, arg0);
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(B)V")
    public final void method629(byte arg0) {
        if (!this.field4493) {
            super.field7679.method2876(-397556104, 0, 770, 5890);
        } else {
            if (!this.field4509) {
                super.field7679.method2849(2, (byte) -109);
                super.field7679.method2883((class221) null, arg0 ^ -99);
            }
            super.field7679.method2849(1, (byte) -109);
            super.field7679.method2883((class221) null, 107);
            super.field7679.method2849(0, (byte) -109);
            this.field4504.method523((byte) 127, '\u0001');
            this.field4493 = false;
        }
        if (arg0 != -122) {
            this.field4509 = false;
        }
        ++field4508;
        super.field7679.method2919(8448, 8448, false);
    }

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(I)V")
    private final void method1854(int arg0) {
        this.field4504 = new class81(super.field7679, 2);
        ++field4503;
        this.field4504.method520(112, 0);
        super.field7679.method2849(1, (byte) -109);
        if (arg0 > -59) {
            field4501 = null;
        }
        OpenGL.glTexGeni(8192, 9472, 34065);
        OpenGL.glTexGeni(8193, 9472, 34065);
        OpenGL.glTexGeni(8194, 9472, 34065);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glEnable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glRotatef(22.5F, 1.0F, 0.0F, 0.0F);
        OpenGL.glMatrixMode(5888);
        if (!this.field4509) {
            super.field7679.method2919(8448, 7681, false);
            super.field7679.method2855(0, (byte) 50, 34168, 768);
            super.field7679.method2849(2, (byte) -109);
            super.field7679.method2919(7681, 260, false);
            super.field7679.method2855(0, (byte) 50, 34168, 768);
            super.field7679.method2855(1, (byte) 50, 34168, 770);
            super.field7679.method2876(-397556104, 0, 770, 34167);
        } else {
            super.field7679.method2919(7681, 260, false);
            super.field7679.method2855(0, (byte) 50, 5890, 770);
            super.field7679.method2876(-397556104, 0, 770, 34167);
        }
        super.field7679.method2849(0, (byte) -109);
        this.field4504.method522(false);
        this.field4504.method520(124, 1);
        super.field7679.method2849(1, (byte) -109);
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        OpenGL.glDisable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        if (this.field4509) {
            super.field7679.method2919(8448, 8448, false);
            super.field7679.method2855(0, (byte) 50, 5890, 768);
            super.field7679.method2876(-397556104, 0, 770, 5890);
        } else {
            super.field7679.method2919(8448, 8448, false);
            super.field7679.method2855(0, (byte) 50, 5890, 768);
            super.field7679.method2849(2, (byte) -109);
            super.field7679.method2919(8448, 8448, false);
            super.field7679.method2855(0, (byte) 50, 5890, 768);
            super.field7679.method2855(1, (byte) 50, 34168, 768);
            super.field7679.method2876(-397556104, 0, 770, 5890);
        }
        super.field7679.method2849(0, (byte) -109);
        this.field4504.method522(false);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IZBLjava/lang/String;ILjava/lang/String;ZJZII)V")
    public static final void method1855(int arg0, boolean arg1, byte arg2, String arg3, int arg4, String arg5, boolean arg6, long arg7, boolean arg8, int arg9, int arg10) {
        ++field4497;
        int[] var12 = new int[4];
        for (int var13 = 0; ~var13 > -4; ++var13) {
            var12[var13] = (int) (9.9999999E7D * Math.random());
        }
        class156 var14 = new class156(128);
        var14.method947(-94, 10);
        int var15 = 2 / ((21 - arg2) / 55);
        var14.method961((!arg8 ? 0 : 4) | (!arg1 ? 0 : 1) | (arg6 ? 2 : 0), 1608339368);
        var14.method983(arg7, (byte) -100);
        var14.method969(19869, var12[0]);
        var14.method956(true, arg3);
        var14.method969(19869, var12[1]);
        var14.method961(class111.field1456, 1608339368);
        var14.method947(-31, arg10);
        var14.method947(-59, arg9);
        var14.method969(19869, var12[2]);
        var14.method961(arg4, 1608339368);
        var14.method961(arg0, 1608339368);
        var14.method969(19869, var12[3]);
        var14.method940(-91, class284.field4050, class230.field3224);
        class156 var16 = new class156(350);
        var16.method956(true, arg5);
        int var17 = 8 - class100.method604((byte) 124, arg5) % 8;
        for (int var18 = 0; var18 < var17; ++var18) {
            var16.method947(-62, (int) (255.0D * Math.random()));
        }
        var16.method962(var12, (byte) 118);
        class79.field1108.field2018 = 0;
        class79.field1108.method947(-114, class58.field897.field5608);
        class79.field1108.method961(2 - -var14.field2018 - -var16.field2018, 1608339368);
        class79.field1108.method961(582, 1608339368);
        class79.field1108.method948(var14.field2041, 0, 2, var14.field2018);
        class79.field1108.method948(var16.field2041, 0, 2, var16.field2018);
        class148.field1918 = 0;
        class379.field5660 = -3;
        class497.field7577 = 1;
        class455.field6628 = 0;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IZ)V")
    public static final void method1856(int arg0, boolean arg1) {
        class334.method2018(arg1, class207.field2874, class223.field3156, class465.field6737, 27714);
        ++field4505;
        if (arg0 >= -72) {
            field4501 = null;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(III)V")
    public final void method624(int arg0, int arg1, int arg2) {
        ++field4500;
        int var4 = 23 / (-arg0 / 59);
        if (this.field4493) {
            super.field7679.method2849(1, (byte) -109);
            super.field7679.method2883(this.field4506[arg2 - 1], 35);
            super.field7679.method2849(0, (byte) -109);
        }
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(Lrl;)V")
    public class309(class487 arg0) {
        super(arg0);
        if (arg0.field7453) {
            this.field4509 = ~arg0.field7387 > -4;
            int var2 = !this.field4509 ? 127 : 48;
            byte[][] var3 = new byte[6][4096];
            byte[][] var4 = new byte[6][4096];
            byte[][] var5 = new byte[6][4096];
            int var6 = 0;
            for (int var7 = 0; var7 < 64; ++var7) {
                for (int var8 = 0; var8 < 64; ++var8) {
                    float var9 = (float) var7 * 2.0F / 64.0F + -1.0F;
                    float var10 = (float) var8 * 2.0F / 64.0F + -1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var9 * var9 + var10 * var10 + 1.0F)));
                    float var12 = var9 * var11;
                    float var13 = var10 * var11;
                    for (int var14 = 0; ~var14 > -7; ++var14) {
                        float var15;
                        if (var14 != 0) {
                            if (~var14 == -2) {
                                var15 = var13;
                            } else if (~var14 == -3) {
                                var15 = var12;
                            } else if (var14 == 3) {
                                var15 = -var12;
                            } else if (var14 != 4) {
                                var15 = -var11;
                            } else {
                                var15 = var11;
                            }
                        } else {
                            var15 = -var13;
                        }
                        int var16;
                        int var17;
                        int var18;
                        if (!(var15 > 0.0F)) {
                            var16 = 0;
                            var17 = 0;
                            var18 = 0;
                        } else {
                            var18 = (int) (Math.pow((double) var15, 96.0D) * (double) var2);
                            var17 = (int) ((double) var2 * Math.pow((double) var15, 36.0D));
                            var16 = (int) (Math.pow((double) var15, 12.0D) * (double) var2);
                        }
                        var4[var14][var6] = (byte) var18;
                        var5[var14][var6] = (byte) var17;
                        var3[var14][var6] = (byte) var16;
                    }
                    ++var6;
                }
            }
            this.field4506 = new class368[3];
            this.field4506[0] = new class368(super.field7679, 6406, 64, false, var4, 6406);
            this.field4506[1] = new class368(super.field7679, 6406, 64, false, var5, 6406);
            this.field4506[2] = new class368(super.field7679, 6406, 64, false, var3, 6406);
            this.method1854(-72);
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)Z")
    public final boolean method623(byte arg0) {
        ++field4499;
        if (arg0 <= 45) {
            this.method624(4, 29, -10);
        }
        return true;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZZ)V")
    public final void method625(boolean arg0, boolean arg1) {
        if (arg0) {
            this.method627(true, 56);
        }
        super.field7679.method2919(7681, 8448, arg0);
        ++field4502;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZI)V")
    public final void method627(boolean arg0, int arg1) {
        if (this.field4504 != null && arg0) {
            if (!this.field4509) {
                super.field7679.method2849(2, (byte) -109);
                super.field7679.method2883(super.field7679.field7347, -97);
                super.field7679.method2849(0, (byte) -109);
            }
            this.field4504.method523((byte) -26, '\u0000');
            this.field4493 = true;
        } else {
            super.field7679.method2876(-397556104, 0, 770, 34168);
        }
        ++field4496;
        if (arg1 != -1805) {
            this.method1854(87);
        }
    }

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "(I)V")
    public static void method1857(int arg0) {
        field4495 = null;
        if (arg0 != 3372) {
            method1858(-61, 105, -93, 38, -6, -24, (byte[]) null);
        }
        field4501 = null;
        field4507 = null;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIIII[B)Z")
    public static final boolean method1858(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6) {
        ++field4498;
        if (arg2 < 125) {
            return false;
        } else {
            int var7 = arg1 % arg0;
            int var8;
            if (~var7 == -1) {
                var8 = 0;
            } else {
                var8 = -var7 + arg0;
            }
            int var9 = -((arg0 + arg5 + -1) / arg0);
            int var10 = -((arg0 + arg1 + -1) / arg0);
            for (int var11 = var9; ~var11 > -1; ++var11) {
                for (int var12 = var10; ~var12 > -1; ++var12) {
                    if (~arg6[arg3] == -1) {
                        return true;
                    }
                    arg3 += arg0;
                }
                int var13 = arg3 - var8;
                if (~arg6[var13 + -1] == -1) {
                    return true;
                }
                arg3 = arg4 + var13;
            }
            return false;
        }
    }

    static {
        for (int var0 = 0; ~var0 > -101; ++var0) {
            field4495[var0] = new Rectangle();
        }
        field4501 = new class256("", 13);
    }
}
