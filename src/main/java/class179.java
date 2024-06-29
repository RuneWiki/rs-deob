import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class179 extends class56 {

    @OriginalMember(owner = "client!kk", name = "v", descriptor = "Z")
    private boolean field2556 = false;

    @OriginalMember(owner = "client!kk", name = "m", descriptor = "Z")
    private boolean field2547;

    @OriginalMember(owner = "client!kk", name = "p", descriptor = "[Llr;")
    private class237[] field2550;

    @OriginalMember(owner = "client!kk", name = "o", descriptor = "Lui;")
    public static class375 field2549 = new class375("Examine", "Untersuchen", "Examiner", "Examinar");

    @OriginalMember(owner = "client!kk", name = "h", descriptor = "I")
    public static int field2542;

    @OriginalMember(owner = "client!kk", name = "i", descriptor = "I")
    public static int field2543;

    @OriginalMember(owner = "client!kk", name = "j", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "client!kk", name = "k", descriptor = "I")
    public static int field2545;

    @OriginalMember(owner = "client!kk", name = "l", descriptor = "I")
    public static int field2546;

    @OriginalMember(owner = "client!kk", name = "n", descriptor = "I")
    public static int field2548;

    @OriginalMember(owner = "client!kk", name = "q", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!kk", name = "s", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!kk", name = "t", descriptor = "I")
    public static int field2554;

    @OriginalMember(owner = "client!kk", name = "u", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!kk", name = "w", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!kk", name = "r", descriptor = "Lgs;")
    private class288 field2552;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(III)V")
    public final void method382(int arg0, int arg1, int arg2) {
        ++field2555;
        if (this.field2556) {
            super.field752.method1819(1, (byte) 104);
            super.field752.method1787(this.field2550[arg1 + -1], (byte) 121);
            super.field752.method1819(0, (byte) 114);
        }
        if (arg2 != 0) {
            this.field2547 = false;
        }
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(ZI)V")
    public final void method383(boolean arg0, int arg1) {
        if (this.field2552 != null && arg0) {
            if (!this.field2547) {
                super.field752.method1819(2, (byte) 126);
                super.field752.method1787(super.field752.field4119, (byte) 121);
                super.field752.method1819(0, (byte) 124);
            }
            this.field2552.method1866(13, '\u0000');
            this.field2556 = true;
        } else {
            super.field752.method1825((byte) 93, 0, 770, 34168);
        }
        if (arg1 <= -77) {
            ++field2554;
        }
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(B)V")
    public static void method1285(byte arg0) {
        field2549 = null;
        if (arg0 > -70) {
            field2549 = null;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IILkv;)V")
    public final void method379(int arg0, int arg1, class14 arg2) {
        super.field752.method1787(arg2, (byte) 121);
        ++field2548;
        super.field752.method1794(arg0, 88);
        int var4 = 42 % ((arg1 - 81) / 39);
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Lbv;)V")
    public class179(class282 arg0) {
        super(arg0);
        if (arg0.field4199) {
            this.field2547 = arg0.field4162 < 3;
            int var2 = this.field2547 ? 48 : 127;
            byte[][] var3 = new byte[6][4096];
            byte[][] var4 = new byte[6][4096];
            byte[][] var5 = new byte[6][4096];
            int var6 = 0;
            for (int var7 = 0; var7 < 64; ++var7) {
                for (int var8 = 0; var8 < 64; ++var8) {
                    float var9 = (float) var8 * 2.0F / 64.0F + -1.0F;
                    float var10 = (float) var7 * 2.0F / 64.0F + -1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var9 * var9 + 1.0F)));
                    float var12 = var9 * var11;
                    float var13 = var10 * var11;
                    for (int var14 = 0; ~var14 > -7; ++var14) {
                        float var15;
                        if (var14 != 0) {
                            if (~var14 != -2) {
                                if (~var14 != -3) {
                                    if (var14 != 3) {
                                        if (~var14 == -5) {
                                            var15 = var11;
                                        } else {
                                            var15 = -var11;
                                        }
                                    } else {
                                        var15 = -var13;
                                    }
                                } else {
                                    var15 = var13;
                                }
                            } else {
                                var15 = var12;
                            }
                        } else {
                            var15 = -var12;
                        }
                        int var16;
                        int var17;
                        int var18;
                        if (var15 > 0.0F) {
                            var16 = (int) (Math.pow((double) var15, 96.0D) * (double) var2);
                            var17 = (int) (Math.pow((double) var15, 36.0D) * (double) var2);
                            var18 = (int) (Math.pow((double) var15, 12.0D) * (double) var2);
                        } else {
                            var18 = 0;
                            var17 = 0;
                            var16 = 0;
                        }
                        var4[var14][var6] = (byte) var16;
                        var5[var14][var6] = (byte) var17;
                        var3[var14][var6] = (byte) var18;
                    }
                    ++var6;
                }
            }
            this.field2550 = new class237[3];
            this.field2550[0] = new class237(super.field752, 6406, 64, false, var4, 6406);
            this.field2550[1] = new class237(super.field752, 6406, 64, false, var5, 6406);
            this.field2550[2] = new class237(super.field752, 6406, 64, false, var3, 6406);
            this.method1290(768);
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIIIIII)Lmc;")
    public static final class242 method1286(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2553;
        long var7 = (long) arg4 * 76724863L ^ (long) arg2 * 986053L ^ (long) arg1 * 475427L ^ (long) arg6 * 97549L ^ (long) arg0 * 67481L ^ (long) arg3 * 32147369L;
        class242 var9 = (class242) class143.field2068.method1013(var7, (byte) -106);
        if (var9 != null) {
            return var9;
        } else if (arg5 > 0) {
            return null;
        } else {
            class242 var10 = class109.field1536.method1140(arg0, arg6, arg1, arg2, arg3, arg4);
            class143.field2068.method1012(-126, var7, var10);
            return var10;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZLcm;)V")
    public static final void method1287(boolean arg0, class449 arg1) {
        class75.field1006.method2082(103, arg1.method2714(124));
        if (!arg0) {
            ++field2543;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(FFFB)F")
    public static final float method1288(float arg0, float arg1, float arg2, byte arg3) {
        ++field2557;
        if (arg3 != 76) {
            method1289((String) null, false);
        }
        return (arg1 - arg2) * arg0 + arg2;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Ljava/lang/String;Z)I")
    public static final int method1289(String arg0, boolean arg1) {
        if (arg1) {
            return -21;
        } else {
            ++field2551;
            for (int var2 = 0; ~var2 > ~class275.field3827.length; ++var2) {
                if (class275.field3827[var2].equalsIgnoreCase(arg0)) {
                    return var2;
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)V")
    public final void method381(int arg0) {
        ++field2546;
        if (this.field2556) {
            if (!this.field2547) {
                super.field752.method1819(2, (byte) 108);
                super.field752.method1787((class14) null, (byte) 121);
            }
            super.field752.method1819(1, (byte) 126);
            super.field752.method1787((class14) null, (byte) 121);
            super.field752.method1819(0, (byte) 125);
            this.field2552.method1866(13, '\u0001');
            this.field2556 = false;
        } else {
            super.field752.method1825((byte) 109, 0, 770, 5890);
        }
        super.field752.method1776(-30, 8448, 8448);
        if (arg0 > -50) {
            method1288(0.70776093F, 1.5748079F, -0.33455244F, (byte) -11);
        }
    }

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "(I)V")
    private final void method1290(int arg0) {
        ++field2545;
        this.field2552 = new class288(super.field752, 2);
        this.field2552.method1864((byte) 72, 0);
        super.field752.method1819(1, (byte) 106);
        OpenGL.glTexGeni(8192, 9472, 34065);
        OpenGL.glTexGeni(8193, 9472, 34065);
        OpenGL.glTexGeni(8194, 9472, 34065);
        if (arg0 == 768) {
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glRotatef(22.5F, 1.0F, 0.0F, 0.0F);
            OpenGL.glMatrixMode(5888);
            if (this.field2547) {
                super.field752.method1776(-30, 7681, 260);
                super.field752.method1828(5890, 770, 0, (byte) -117);
                super.field752.method1825((byte) 84, 0, 770, 34167);
            } else {
                super.field752.method1776(-30, 8448, 7681);
                super.field752.method1828(34168, 768, 0, (byte) -74);
                super.field752.method1819(2, (byte) 95);
                super.field752.method1776(-30, 7681, 260);
                super.field752.method1828(34168, 768, 0, (byte) -90);
                super.field752.method1828(34168, 770, 1, (byte) -75);
                super.field752.method1825((byte) 88, 0, 770, 34167);
            }
            super.field752.method1819(0, (byte) 93);
            this.field2552.method1865(arg0 + -819);
            this.field2552.method1864((byte) 121, 1);
            super.field752.method1819(1, (byte) 92);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            if (this.field2547) {
                super.field752.method1776(arg0 ^ -798, 8448, 8448);
                super.field752.method1828(5890, 768, 0, (byte) -97);
                super.field752.method1825((byte) 93, 0, 770, 5890);
            } else {
                super.field752.method1776(-30, 8448, 8448);
                super.field752.method1828(5890, 768, 0, (byte) -110);
                super.field752.method1819(2, (byte) 104);
                super.field752.method1776(arg0 ^ -798, 8448, 8448);
                super.field752.method1828(5890, 768, 0, (byte) -127);
                super.field752.method1828(34168, 768, 1, (byte) -98);
                super.field752.method1825((byte) 98, 0, 770, 5890);
            }
            super.field752.method1819(0, (byte) 126);
            this.field2552.method1865(-91);
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZI)V")
    public final void method380(boolean arg0, int arg1) {
        if (arg1 >= 42) {
            ++field2542;
            super.field752.method1776(-30, 7681, 8448);
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)Z")
    public final boolean method377(byte arg0) {
        if (arg0 >= -8) {
            this.method379(-55, -92, (class14) null);
        }
        ++field2544;
        return true;
    }
}
