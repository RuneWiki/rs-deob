import jaggl.OpenGL;
import java.awt.Font;
import java.io.File;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class581 extends class489 {

    @OriginalMember(owner = "client!tp", name = "j", descriptor = "Z")
    private boolean field8067 = false;

    @OriginalMember(owner = "client!tp", name = "v", descriptor = "Z")
    private boolean field8079;

    @OriginalMember(owner = "client!tp", name = "r", descriptor = "[Lgv;")
    private class45[] field8075;

    @OriginalMember(owner = "client!tp", name = "i", descriptor = "I")
    public static int field8066;

    @OriginalMember(owner = "client!tp", name = "k", descriptor = "I")
    public static int field8068;

    @OriginalMember(owner = "client!tp", name = "l", descriptor = "I")
    public static int field8069;

    @OriginalMember(owner = "client!tp", name = "m", descriptor = "I")
    public static int field8070;

    @OriginalMember(owner = "client!tp", name = "n", descriptor = "I")
    public static int field8071;

    @OriginalMember(owner = "client!tp", name = "o", descriptor = "I")
    public static int field8072;

    @OriginalMember(owner = "client!tp", name = "p", descriptor = "I")
    public static int field8073;

    @OriginalMember(owner = "client!tp", name = "s", descriptor = "I")
    public static int field8076;

    @OriginalMember(owner = "client!tp", name = "u", descriptor = "I")
    public static int field8078;

    @OriginalMember(owner = "client!tp", name = "w", descriptor = "I")
    public static int field8080;

    @OriginalMember(owner = "client!tp", name = "t", descriptor = "Lbp;")
    private class458 field8077;

    @OriginalMember(owner = "client!tp", name = "q", descriptor = "Ljava/awt/Font;")
    public static Font field8074;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(I)V")
    public final void method6(int arg0) {
        if (!this.field8067) {
            super.field6956.method2189(5890, true, 0, 770);
        } else {
            if (!this.field8079) {
                super.field6956.method2135(2, -5027);
                super.field6956.method2120(-1, (class411) null);
            }
            super.field6956.method2135(1, -5027);
            super.field6956.method2120(arg0 + -1, (class411) null);
            super.field6956.method2135(0, -5027);
            this.field8077.method2682('\u0001', 105);
            this.field8067 = false;
        }
        if (arg0 != 0) {
            method3239(101);
        }
        ++field8072;
        super.field6956.method2165((byte) 74, 8448, 8448);
    }

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "(B)V")
    private final void method3237(byte arg0) {
        ++field8066;
        this.field8077 = new class458(super.field6956, 2);
        this.field8077.method2686(0, (byte) -121);
        super.field6956.method2135(1, -5027);
        OpenGL.glTexGeni(8192, 9472, 34065);
        OpenGL.glTexGeni(8193, 9472, 34065);
        OpenGL.glTexGeni(8194, 9472, 34065);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glEnable(3170);
        if (arg0 <= -72) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glRotatef(22.5F, 1.0F, 0.0F, 0.0F);
            OpenGL.glMatrixMode(5888);
            if (this.field8079) {
                super.field6956.method2165((byte) 74, 7681, 260);
                super.field6956.method2132(770, (byte) -34, 5890, 0);
                super.field6956.method2189(34167, true, 0, 770);
            } else {
                super.field6956.method2165((byte) 74, 8448, 7681);
                super.field6956.method2132(768, (byte) 126, 34168, 0);
                super.field6956.method2135(2, -5027);
                super.field6956.method2165((byte) 74, 7681, 260);
                super.field6956.method2132(768, (byte) 102, 34168, 0);
                super.field6956.method2132(770, (byte) 100, 34168, 1);
                super.field6956.method2189(34167, true, 0, 770);
            }
            super.field6956.method2135(0, -5027);
            this.field8077.method2685(0);
            this.field8077.method2686(1, (byte) -123);
            super.field6956.method2135(1, -5027);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            if (!this.field8079) {
                super.field6956.method2165((byte) 74, 8448, 8448);
                super.field6956.method2132(768, (byte) 113, 5890, 0);
                super.field6956.method2135(2, -5027);
                super.field6956.method2165((byte) 74, 8448, 8448);
                super.field6956.method2132(768, (byte) -121, 5890, 0);
                super.field6956.method2132(768, (byte) 100, 34168, 1);
                super.field6956.method2189(5890, true, 0, 770);
            } else {
                super.field6956.method2165((byte) 74, 8448, 8448);
                super.field6956.method2132(768, (byte) 104, 5890, 0);
                super.field6956.method2189(5890, true, 0, 770);
            }
            super.field6956.method2135(0, -5027);
            this.field8077.method2685(0);
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(BLkp;I)V")
    public final void method12(byte arg0, class411 arg1, int arg2) {
        ++field8070;
        if (arg0 >= -66) {
            this.field8079 = false;
        }
        super.field6956.method2120(-1, arg1);
        super.field6956.method2153(-19, arg2);
    }

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "(B)Z")
    public final boolean method7(byte arg0) {
        ++field8068;
        return arg0 <= 95 ? true : true;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(IZ)V")
    public final void method10(int arg0, boolean arg1) {
        if (this.field8077 != null && arg1) {
            if (!this.field8079) {
                super.field6956.method2135(2, -5027);
                super.field6956.method2120(-1, super.field6956.field5037);
                super.field6956.method2135(0, -5027);
            }
            this.field8077.method2682('\u0000', 105);
            this.field8067 = true;
        } else {
            super.field6956.method2189(34168, true, 0, 770);
        }
        int var3 = 37 % ((arg0 - -43) / 37);
        ++field8073;
    }

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "(IZ)V")
    public final void method9(int arg0, boolean arg1) {
        if (arg0 != -5) {
            this.method9(17, false);
        }
        super.field6956.method2165((byte) 74, 7681, 8448);
        ++field8071;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(III)V")
    public final void method8(int arg0, int arg1, int arg2) {
        if (this.field8067) {
            super.field6956.method2135(1, -5027);
            super.field6956.method2120(arg2 ^ -41, this.field8075[arg1 - 1]);
            super.field6956.method2135(0, -5027);
        }
        if (arg2 == 40) {
            ++field8078;
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(ILjava/io/File;)[B")
    public static final byte[] method3238(int arg0, File arg1) {
        ++field8069;
        if (arg0 > -50) {
            field8076 = 43;
        }
        return class146.method911(-1, (int) arg1.length(), arg1);
    }

    @OriginalMember(owner = "client!tp", name = "<init>", descriptor = "(Leq;)V")
    public class581(class357 arg0) {
        super(arg0);
        if (arg0.field5034) {
            this.field8079 = arg0.field5006 < 3;
            int var2 = !this.field8079 ? 127 : 48;
            byte[][] var3 = new byte[6][4096];
            byte[][] var4 = new byte[6][4096];
            byte[][] var5 = new byte[6][4096];
            int var6 = 0;
            for (int var7 = 0; var7 < 64; ++var7) {
                for (int var8 = 0; ~var8 > -65; ++var8) {
                    float var9 = (float) var8 * 2.0F / 64.0F - 1.0F;
                    float var10 = (float) var7 * 2.0F / 64.0F - 1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var9 * var9 + 1.0F)));
                    float var12 = var9 * var11;
                    float var13 = var10 * var11;
                    for (int var14 = 0; ~var14 > -7; ++var14) {
                        float var15;
                        if (var14 != 0) {
                            if (~var14 == -2) {
                                var15 = var12;
                            } else if (var14 != 2) {
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
                            var15 = -var12;
                        }
                        int var16;
                        int var17;
                        int var18;
                        if (var15 > 0.0F) {
                            var16 = (int) ((double) var2 * Math.pow((double) var15, 96.0D));
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
            this.field8075 = new class45[3];
            this.field8075[0] = new class45(super.field6956, 6406, 64, false, var4, 6406);
            this.field8075[1] = new class45(super.field6956, 6406, 64, false, var5, 6406);
            this.field8075[2] = new class45(super.field6956, 6406, 64, false, var3, 6406);
            this.method3237((byte) -81);
        }
    }

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "(I)V")
    public static void method3239(int arg0) {
        field8074 = null;
        if (arg0 != -12398) {
            method3239(-119);
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(IILjava/lang/String;)Z")
    public static final boolean method3240(int arg0, int arg1, String arg2) {
        ++field8080;
        if (class681.field9312.field3251) {
            class575.field8035 = new class187();
            class575.field8035.field2460 = arg2;
            class575.field8035.field2454 = arg0;
            if (class323.field4120 != class171.field2248) {
                class575.field8035.field2456 = 50000 - -class575.field8035.field2454;
                class575.field8035.field2461 = class575.field8035.field2454 + 40000;
            }
            if (class303.field3903.length > arg0 && class303.field3903[arg0] != null) {
                class52.field764 = class303.field3903[arg0].field8458;
            }
            return true;
        } else {
            if (arg1 != 40000) {
                field8076 = -127;
            }
            String var3 = "";
            if (class323.field4120 != class171.field2248) {
                var3 = ":" + (arg0 + 7000);
            }
            String var4 = "";
            if (class371.field5224 != null) {
                var4 = "/p=" + class371.field5224;
            }
            String var5 = "http://" + arg2 + var3 + "/l=" + class416.field5920 + "/a=" + class718.field10135 + var4 + "/j" + (class536.field7527 ? "1" : "0") + ",o" + (!class142.field1688 ? "0" : "1") + ",a2";
            try {
                class612.field8463.getAppletContext().showDocument(new URL(var5), "_self");
                return true;
            } catch (Exception var6) {
                return false;
            }
        }
    }
}
