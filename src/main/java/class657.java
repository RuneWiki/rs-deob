import jaggl.OpenGL;
import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class657 extends class398 {

    @OriginalMember(owner = "client!qs", name = "n", descriptor = "Z")
    private boolean field9388 = false;

    @OriginalMember(owner = "client!qs", name = "m", descriptor = "Z")
    private boolean field9387;

    @OriginalMember(owner = "client!qs", name = "p", descriptor = "[Leg;")
    private class364[] field9390;

    @OriginalMember(owner = "client!qs", name = "j", descriptor = "Z")
    public static boolean field9384 = false;

    @OriginalMember(owner = "client!qs", name = "g", descriptor = "[I")
    public static int[] field9381 = new int[2];

    @OriginalMember(owner = "client!qs", name = "i", descriptor = "Lmea;")
    public static class355 field9383 = new class355("", 15);

    @OriginalMember(owner = "client!qs", name = "f", descriptor = "I")
    public static int field9380;

    @OriginalMember(owner = "client!qs", name = "h", descriptor = "I")
    public static int field9382;

    @OriginalMember(owner = "client!qs", name = "k", descriptor = "I")
    public static int field9385;

    @OriginalMember(owner = "client!qs", name = "l", descriptor = "I")
    public static int field9386;

    @OriginalMember(owner = "client!qs", name = "o", descriptor = "I")
    public static int field9389;

    @OriginalMember(owner = "client!qs", name = "q", descriptor = "I")
    public static int field9391;

    @OriginalMember(owner = "client!qs", name = "r", descriptor = "I")
    public static int field9392;

    @OriginalMember(owner = "client!qs", name = "s", descriptor = "I")
    public static int field9393;

    @OriginalMember(owner = "client!qs", name = "u", descriptor = "I")
    public static int field9395;

    @OriginalMember(owner = "client!qs", name = "e", descriptor = "Lmv;")
    public static class295 field9379;

    @OriginalMember(owner = "client!qs", name = "t", descriptor = "Lbq;")
    private class646 field9394;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IZ)V", line = 3)
    public final void method94(int arg0, boolean arg1) {
        super.field6009.method1701(8448, 1, 7681);
        if (arg0 != 0) {
            this.field9390 = null;
        }
        ++field9380;
    }

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "(I)V", line = 16)
    public static void method3707(int arg0) {
        field9379 = null;
        if (arg0 >= -62) {
            field9379 = null;
        }
        field9383 = null;
        field9381 = null;
    }

    @OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(Luca;)V", line = 30)
    public class657(class287 arg0) {
        super(arg0);
        if (arg0.field4090) {
            this.field9387 = arg0.field4162 < 3;
            int var2 = this.field9387 ? 48 : 127;
            byte[][] var3 = new byte[6][4096];
            byte[][] var4 = new byte[6][4096];
            byte[][] var5 = new byte[6][4096];
            int var6 = 0;
            for (int var7 = 0; ~var7 > -65; ++var7) {
                for (int var8 = 0; ~var8 > -65; ++var8) {
                    float var9 = (float) var7 * 2.0F / 64.0F + -1.0F;
                    float var10 = (float) var8 * 2.0F / 64.0F + -1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var9 * var9 + var10 * var10 + 1.0F)));
                    float var12 = var9 * var11;
                    float var13 = var10 * var11;
                    for (int var14 = 0; ~var14 > -7; ++var14) {
                        float var15;
                        if (~var14 != -1) {
                            if (var14 == 1) {
                                var15 = var13;
                            } else if (var14 != 2) {
                                if (~var14 != -4) {
                                    if (~var14 != -5) {
                                        var15 = -var11;
                                    } else {
                                        var15 = var11;
                                    }
                                } else {
                                    var15 = -var12;
                                }
                            } else {
                                var15 = var12;
                            }
                        } else {
                            var15 = -var13;
                        }
                        int var16;
                        int var17;
                        int var18;
                        if (var15 > 0.0F) {
                            var16 = (int) ((double) var2 * Math.pow((double) var15, 96.0D));
                            var17 = (int) ((double) var2 * Math.pow((double) var15, 36.0D));
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
            this.field9390 = new class364[3];
            this.field9390[0] = new class364(super.field6009, 6406, 64, false, var4, 6406);
            this.field9390[1] = new class364(super.field6009, 6406, 64, false, var5, 6406);
            this.field9390[2] = new class364(super.field6009, 6406, 64, false, var3, 6406);
            this.method3710(2);
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)Z", line = 143)
    public final boolean method87(int arg0) {
        ++field9391;
        return arg0 != 3 ? true : true;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(Ljava/lang/String;Ljava/io/File;Z)V", line = 155)
    public static final void method3708(String arg0, File arg1, boolean arg2) {
        class285.field3798.put(arg0, arg1);
        if (!arg2) {
            field9381 = null;
        }
        ++field9385;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(ILdu;Ldu;)V", line = 171)
    public static final void method3709(int arg0, class381 arg1, class381 arg2) {
        ++field9382;
        if (arg1.field5735 != null) {
            arg1.method2360((byte) 66);
        }
        if (arg0 != 5888) {
            field9384 = true;
        }
        arg1.field5735 = arg2.field5735;
        arg1.field5737 = arg2;
        arg1.field5735.field5737 = arg1;
        arg1.field5737.field5735 = arg1;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(ZI)V", line = 190)
    public final void method91(boolean arg0, int arg1) {
        if (arg1 != -5191) {
            this.method92(-60);
        }
        ++field9395;
        if (this.field9394 != null && arg0) {
            if (!this.field9387) {
                super.field6009.method1745(true, 2);
                super.field6009.method1709((byte) -48, super.field6009.field4165);
                super.field6009.method1745(true, 0);
            }
            this.field9394.method3678('\u0000', 109);
            this.field9388 = true;
        } else {
            super.field6009.method1724((byte) 11, 770, 34168, 0);
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IBI)V", line = 216)
    public final void method86(int arg0, byte arg1, int arg2) {
        if (arg1 == 82) {
            ++field9389;
            if (this.field9388) {
                super.field6009.method1745(true, 1);
                super.field6009.method1709((byte) -116, this.field9390[arg2 + -1]);
                super.field6009.method1745(true, 0);
            }
        }
    }

    @OriginalMember(owner = "client!qs", name = "d", descriptor = "(I)V", line = 237)
    private final void method3710(int arg0) {
        ++field9393;
        this.field9394 = new class646(super.field6009, arg0);
        this.field9394.method3680(0, (byte) 89);
        super.field6009.method1745(true, 1);
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
        if (this.field9387) {
            super.field6009.method1701(260, 1, 7681);
            super.field6009.method1755(5890, 34176, 770, 0);
            super.field6009.method1724((byte) 11, 770, 34167, 0);
        } else {
            super.field6009.method1701(7681, 1, 8448);
            super.field6009.method1755(34168, arg0 ^ 34178, 768, 0);
            super.field6009.method1745(true, 2);
            super.field6009.method1701(260, arg0 ^ 3, 7681);
            super.field6009.method1755(34168, 34176, 768, 0);
            super.field6009.method1755(34168, 34176, 770, 1);
            super.field6009.method1724((byte) 11, 770, 34167, 0);
        }
        super.field6009.method1745(true, 0);
        this.field9394.method3679(-92);
        this.field9394.method3680(1, (byte) -127);
        super.field6009.method1745(true, 1);
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        OpenGL.glDisable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        if (!this.field9387) {
            super.field6009.method1701(8448, 1, 8448);
            super.field6009.method1755(5890, 34176, 768, 0);
            super.field6009.method1745(true, 2);
            super.field6009.method1701(8448, arg0 ^ 3, 8448);
            super.field6009.method1755(5890, 34176, 768, 0);
            super.field6009.method1755(34168, arg0 + 34174, 768, 1);
            super.field6009.method1724((byte) 11, 770, 5890, 0);
        } else {
            super.field6009.method1701(8448, 1, 8448);
            super.field6009.method1755(5890, arg0 ^ 34178, 768, 0);
            super.field6009.method1724((byte) 11, 770, 5890, 0);
        }
        super.field6009.method1745(true, 0);
        this.field9394.method3679(-113);
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(I)V", line = 305)
    public final void method92(int arg0) {
        if (arg0 != 512) {
            field9379 = null;
        }
        if (!this.field9388) {
            super.field6009.method1724((byte) 11, 770, 5890, 0);
        } else {
            if (!this.field9387) {
                super.field6009.method1745(true, 2);
                super.field6009.method1709((byte) -126, (class517) null);
            }
            super.field6009.method1745(true, 1);
            super.field6009.method1709((byte) -57, (class517) null);
            super.field6009.method1745(true, 0);
            this.field9394.method3678('\u0001', arg0 ^ 611);
            this.field9388 = false;
        }
        ++field9392;
        super.field6009.method1701(8448, arg0 + -511, 8448);
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(ILvaa;B)V", line = 334)
    public final void method93(int arg0, class517 arg1, byte arg2) {
        super.field6009.method1709((byte) -63, arg1);
        ++field9386;
        super.field6009.method1751(arg0, 21575);
        int var4 = -55 / ((arg2 - 76) / 41);
    }
}
