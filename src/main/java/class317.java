import jaggl.OpenGL;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public class class317 extends class246 {

    @OriginalMember(owner = "client!wv", name = "g", descriptor = "Lrk;")
    private class339 field4308;

    @OriginalMember(owner = "client!wv", name = "r", descriptor = "Lmd;")
    private class211 field4319;

    @OriginalMember(owner = "client!wv", name = "q", descriptor = "S")
    public static short field4318 = 32767;

    @OriginalMember(owner = "client!wv", name = "f", descriptor = "I")
    public static int field4307;

    @OriginalMember(owner = "client!wv", name = "i", descriptor = "I")
    public static int field4310;

    @OriginalMember(owner = "client!wv", name = "j", descriptor = "I")
    public static int field4311;

    @OriginalMember(owner = "client!wv", name = "k", descriptor = "I")
    public static int field4312;

    @OriginalMember(owner = "client!wv", name = "l", descriptor = "I")
    public static int field4313;

    @OriginalMember(owner = "client!wv", name = "m", descriptor = "I")
    public static int field4314;

    @OriginalMember(owner = "client!wv", name = "n", descriptor = "I")
    public static int field4315;

    @OriginalMember(owner = "client!wv", name = "o", descriptor = "I")
    public static int field4316;

    @OriginalMember(owner = "client!wv", name = "p", descriptor = "I")
    public static int field4317;

    @OriginalMember(owner = "client!wv", name = "s", descriptor = "I")
    public static int field4320;

    @OriginalMember(owner = "client!wv", name = "t", descriptor = "I")
    public static int field4321;

    @OriginalMember(owner = "client!wv", name = "h", descriptor = "Llo;")
    private class365 field4309;

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(ILfg;I)V")
    public final void method742(int arg0, class128 arg1, int arg2) {
        if (arg0 == 4) {
            ++field4307;
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(II)Z")
    public static final boolean method1823(int arg0, int arg1) {
        if (arg0 != 3) {
            field4318 = 6;
        }
        ++field4310;
        return ~arg1 == -3 || arg1 == 3 || arg1 == 4 || arg1 == 5;
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(ZIIIILza;)V")
    public static final void method1824(boolean arg0, int arg1, int arg2, int arg3, int arg4, class295 arg5) {
        arg5.method511(arg2, arg3, arg1 + arg2, arg3 + arg4);
        ++field4311;
        arg5.method1712(arg4, 0, -16777216, arg1, arg3, arg2);
        if (~class1.field16 <= -101) {
            float var6 = (float) class472.field6833 / (float) class472.field6821;
            int var7 = arg1;
            int var8 = arg4;
            if (arg0) {
                method1826((byte) 87);
            }
            if (var6 < 1.0F) {
                var8 = (int) ((float) arg1 * var6);
            } else {
                var7 = (int) ((float) arg4 / var6);
            }
            int var9 = (-var7 + arg1) / 2 + arg2;
            int var10 = (-var8 + arg4) / 2 + arg3;
            if (class298.field4088 == null || ~arg1 != ~class298.field4088.method205() || ~class298.field4088.method200() != ~arg4) {
                class472.method2741(class472.field6838, class472.field6835 - -class472.field6833, class472.field6838 + class472.field6821, class472.field6835, var9, var10, var9 - -var7, var10 - -var8);
                class472.method2756(arg5);
                class298.field4088 = arg5.method565(var9, var10, var7, var8, false);
            }
            class298.field4088.method2142(var9, var10);
            int var11 = class426.field6205 * var7 / class472.field6821;
            int var12 = class27.field398 * var8 / class472.field6833;
            int var13 = var9 - -(class349.field5057 * var7 / class472.field6821);
            int var14 = var8 - var12 + -(class486.field6997 * var8 / class472.field6833) + var10;
            int var15 = -1996554240;
            if (class308.field4192 == class152.field2343) {
                var15 = -1996488705;
            }
            arg5.method508(var13, var14, var11, var12, var15, 1);
            arg5.method527(var13, var14, var11, var12, var15, 0);
            if (~class149.field2304 < -1) {
                int var16;
                if (class203.field2940 > 50) {
                    var16 = (-class203.field2940 + 100) * 5;
                } else {
                    var16 = class203.field2940 * 5;
                }
                for (class237 var17 = (class237) class472.field6811.method3137(0); var17 != null; var17 = (class237) class472.field6811.method3132(0)) {
                    class92 var18 = class472.field6803.method1655(var17.field3280, (byte) -126);
                    if (class462.method2684(var18, (byte) -115)) {
                        if (class437.field6306 != var17.field3280) {
                            if (~class65.field944 != 0 && ~class65.field944 == ~var18.field1502) {
                                int var19 = var17.field3277 * var7 / class472.field6821 + var9;
                                int var20 = (-var17.field3274 + class472.field6833) * var8 / class472.field6833 + var10;
                                arg5.method1712(4, 0, 16776960 | var16 << 24, 4, var20 - 2, var19 + -2);
                            }
                        } else {
                            int var21 = var17.field3277 * var7 / class472.field6821 + var9;
                            int var22 = var10 - -((-var17.field3274 + class472.field6833) * var8 / class472.field6833);
                            arg5.method1712(4, 0, 16776960 | var16 << 24, 4, var22 + -2, var21 - 2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(ZB)V")
    public final void method743(boolean arg0, byte arg1) {
        ++field4317;
        if (arg1 >= 83) {
            if (~super.field3361.field4795 < -1) {
                float var3 = -0.5F / (float) super.field3361.field4795;
                super.field3361.method1990(false, 1);
                class467.field6756[0] = 0.0F;
                class467.field6756[1] = 0.0F;
                class467.field6756[3] = super.field3361.field4811 * var3 + 0.25F;
                class467.field6756[2] = var3;
                OpenGL.glPushMatrix();
                OpenGL.glLoadIdentity();
                OpenGL.glTexGenfv(8192, 9474, class467.field6756, 0);
                OpenGL.glPopMatrix();
                super.field3361.method1992(0.5F, (byte) 124, (float) super.field3361.field4795);
                super.field3361.method1977(this.field4319, true);
                super.field3361.method1990(false, 0);
            }
            this.field4309.method2183((byte) -41, '\u0000');
            OpenGL.glMatrixMode(5890);
            OpenGL.glPushMatrix();
            OpenGL.glScalef(0.25F, 0.25F, 1.0F);
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!wv", name = "b", descriptor = "(I)V")
    private final void method1825(int arg0) {
        if (arg0 == 9217) {
            ++field4313;
            this.field4309 = new class365(super.field3361, 2);
            this.field4309.method2185(-32, 0);
            super.field3361.method1990(false, 1);
            super.field3361.method2023(7681, 260, arg0 ^ 12144);
            super.field3361.method2040(false, 0, 768, 34168);
            OpenGL.glTexGeni(8192, 9472, 9216);
            OpenGL.glEnable(3168);
            super.field3361.method1990(false, 0);
            OpenGL.glTexEnvf(8960, 34163, 2.0F);
            if (this.field4308.field4912) {
                OpenGL.glTexGeni(8194, 9472, 9217);
                OpenGL.glTexGeni(8195, 9472, 9217);
                OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
                OpenGL.glEnable(3170);
                OpenGL.glEnable(3171);
            }
            this.field4309.method2186((byte) -96);
            this.field4309.method2185(-83, 1);
            super.field3361.method1990(false, 1);
            super.field3361.method2023(8448, 8448, 2929);
            super.field3361.method2040(false, 0, 768, 5890);
            OpenGL.glDisable(3168);
            super.field3361.method1990(false, 0);
            OpenGL.glTexEnvf(8960, 34163, 1.0F);
            if (this.field4308.field4912) {
                OpenGL.glDisable(3170);
                OpenGL.glDisable(3171);
            }
            this.field4309.method2186((byte) -93);
        }
    }

    @OriginalMember(owner = "client!wv", name = "<init>", descriptor = "(Lpg;Lrk;)V")
    public class317(class333 arg0, class339 arg1) {
        super(arg0);
        this.field4308 = arg1;
        this.method1825(9217);
        this.field4319 = new class211(super.field3361, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field4319.method1338((byte) 117, false);
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(I)V")
    public final void method739(int arg0) {
        int var2 = -23 / ((arg0 - -80) / 32);
        ++field4320;
        this.field4309.method2183((byte) -41, '\u0001');
        if (~super.field3361.field4795 < -1) {
            super.field3361.method1990(false, 1);
            super.field3361.method1977((class128) null, true);
            super.field3361.method1992(1.0F, (byte) 81, 0.0F);
            super.field3361.method1990(false, 0);
        }
        super.field3361.method2023(8448, 8448, 2929);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(ZI)V")
    public final void method740(boolean arg0, int arg1) {
        if (arg1 != 26715) {
            method1827(48, 113, 122, true, 58);
        }
        super.field3361.method2023(260, 8448, 2929);
        ++field4314;
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(B)Z")
    public final boolean method738(byte arg0) {
        ++field4321;
        if (arg0 < 99) {
            this.method738((byte) -61);
        }
        return true;
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(BII)V")
    public final void method744(byte arg0, int arg1, int arg2) {
        if (~(arg1 & 1) == -2) {
            if (this.field4308.field4912) {
                super.field3361.method1977(this.field4308.field4919, true);
                class467.field6756[2] = 0.0F;
                class467.field6756[1] = 0.0F;
                class467.field6756[3] = (float) (super.field3361.field4724 % 4000) / 4000.0F;
                class467.field6756[0] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, class467.field6756, 0);
            } else {
                int var4 = super.field3361.field4724 % 4000 * 16 / 4000;
                super.field3361.method1977(this.field4308.field4920[var4], true);
            }
        } else if (this.field4308.field4912) {
            super.field3361.method1977(this.field4308.field4919, true);
            class467.field6756[2] = 0.0F;
            class467.field6756[0] = 0.0F;
            class467.field6756[1] = 0.0F;
            class467.field6756[3] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class467.field6756, 0);
        } else {
            super.field3361.method1977(this.field4308.field4920[0], true);
        }
        ++field4315;
        if (arg0 != 53) {
            this.method743(false, (byte) -61);
        }
    }

    @OriginalMember(owner = "client!wv", name = "c", descriptor = "(B)V")
    public static final void method1826(byte arg0) {
        ++field4316;
        if (~class196.field2876 != -1) {
            try {
                if (~(++class221.field3126) < -2001) {
                    if (class104.field1702 != null) {
                        class104.field1702.method172(12292);
                        class104.field1702 = null;
                    }
                    if (~class92.field1489 <= -2) {
                        class196.field2876 = 0;
                        class49.field703 = -5;
                        return;
                    }
                    class221.field3126 = 0;
                    class196.field2876 = 1;
                    class414.field5911.field613 = !class414.field5911.field613;
                    ++class92.field1489;
                }
                if (class196.field2876 == 1) {
                    class42.field623 = class346.field4985.method1181(class414.field5911.field603, arg0 + 14, class414.field5911.method285(-50));
                    class196.field2876 = 2;
                }
                if (class196.field2876 == 2) {
                    if (~class42.field623.field6699 == -3) {
                        throw new IOException();
                    }
                    if (class42.field623.field6699 != 1) {
                        return;
                    }
                    class104.field1702 = new class27((Socket) class42.field623.field6695, class346.field4985);
                    class42.field623 = null;
                    class104.field1702.method180(0, class17.field275.field4360, 18170, class17.field275.field4336);
                    class191.method1264(Integer.MIN_VALUE);
                    int var1 = class104.field1702.method175(-25652);
                    class191.method1264(Integer.MIN_VALUE);
                    if (var1 != 21) {
                        class49.field703 = var1;
                        class196.field2876 = 0;
                        class104.field1702.method172(12292);
                        class104.field1702 = null;
                        return;
                    }
                    class196.field2876 = 3;
                }
                if (arg0 == 57) {
                    if (~class196.field2876 == -4) {
                        if (class104.field1702.method181(-1) < 1) {
                            return;
                        }
                        class33.field517 = new String[class104.field1702.method175(-25652)];
                        class196.field2876 = 4;
                    }
                    if (~class196.field2876 == -5) {
                        if (~class104.field1702.method181(arg0 ^ -58) <= ~(class33.field517.length * 8)) {
                            class508.field7414.field4360 = 0;
                            class104.field1702.method177(class33.field517.length * 8, class508.field7414.field4336, 0, 114);
                            for (int var2 = 0; ~var2 > ~class33.field517.length; ++var2) {
                                class33.field517[var2] = class468.method2723(class508.field7414.method1886(false), 92);
                            }
                            class196.field2876 = 0;
                            class49.field703 = 21;
                            class104.field1702.method172(arg0 + 12235);
                            class104.field1702 = null;
                        }
                    }
                }
            } catch (IOException var3) {
                if (class104.field1702 != null) {
                    class104.field1702.method172(12292);
                    class104.field1702 = null;
                }
                if (~class92.field1489 > -2) {
                    class221.field3126 = 0;
                    ++class92.field1489;
                    class196.field2876 = 1;
                    class414.field5911.field613 = !class414.field5911.field613;
                } else {
                    class49.field703 = -4;
                    class196.field2876 = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(IIIZI)Lha;")
    public static final class91 method1827(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        ++field4312;
        class91 var5 = new class91();
        var5.field1460 = arg0;
        var5.field1461 = arg1;
        class425.field6168.method1586(var5, (long) arg2, arg4);
        class416.method2459(arg0, arg4 + -97);
        class444 var6 = class22.method138(-126, arg2);
        if (var6 != null) {
            class151.method1093(var6, arg4 + 121);
        }
        if (class389.field5616 != null) {
            class151.method1093(class389.field5616, 123);
            class389.field5616 = null;
        }
        class502.method2983(26);
        if (var6 != null) {
            class345.method2078(!arg3, var6, 0);
        }
        if (!arg3) {
            class47.method317(arg0);
        }
        if (!arg3 && ~class236.field3268 != 0) {
            class264.method1554((byte) -123, 1, class236.field3268);
        }
        return var5;
    }

    static {
        new class157("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.");
        new class157("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
    }
}
