import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class312 extends class657 {

    @OriginalMember(owner = "client!eo", name = "n", descriptor = "Z")
    private boolean field4937 = false;

    @OriginalMember(owner = "client!eo", name = "l", descriptor = "Z")
    private boolean field4945;

    @OriginalMember(owner = "client!eo", name = "j", descriptor = "[Lod;")
    private class532[] field4944;

    @OriginalMember(owner = "client!eo", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4950 = new String[] { method2634(method2633("Lk\u0007Rt")), method2634(method2633("GqE}")), method2634(method2633("Lk\u0007Yt")), method2634(method2633("R*\u0007?!")), method2634(method2633("Lk\u0007Pt")), method2634(method2633("Lk\u0007Tt")), method2634(method2633("Lk\u0007Ut")), method2634(method2633("Lk\u0007Xt")), method2634(method2633("Lk\u0007St")), method2634(method2633("Lk\u0007Wt")), method2634(method2633("Lk\u0007-5Gm]/t")), method2634(method2633("Lk\u0007Vt")) };

    @OriginalMember(owner = "client!eo", name = "q", descriptor = "Ljh;")
    public static class169 field4948 = new class169();

    @OriginalMember(owner = "client!eo", name = "p", descriptor = "I")
    public static int field4938;

    @OriginalMember(owner = "client!eo", name = "o", descriptor = "I")
    public static int field4940;

    @OriginalMember(owner = "client!eo", name = "k", descriptor = "I")
    public static int field4941;

    @OriginalMember(owner = "client!eo", name = "u", descriptor = "I")
    public static int field4942;

    @OriginalMember(owner = "client!eo", name = "v", descriptor = "I")
    public static int field4943;

    @OriginalMember(owner = "client!eo", name = "t", descriptor = "I")
    public static int field4946;

    @OriginalMember(owner = "client!eo", name = "s", descriptor = "I")
    public static int field4947;

    @OriginalMember(owner = "client!eo", name = "m", descriptor = "I")
    public static int field4949;

    @OriginalMember(owner = "client!eo", name = "r", descriptor = "Lbia;")
    private class524 field4939;

    @OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(Lffa;)V")
    public class312(class197 arg0) {
        super(arg0);
        try {
            if (arg0.field2962) {
                this.field4945 = ~arg0.field2935 > -4;
                int var2 = this.field4945 ? 48 : 127;
                byte[][] var3 = new byte[6][4096];
                byte[][] var4 = new byte[6][4096];
                byte[][] var5 = new byte[6][4096];
                int var6 = 0;
                for (int var7 = 0; var7 < 64; ++var7) {
                    for (int var8 = 0; var8 < 64; ++var8) {
                        float var9 = (float) var7 * 2.0F / 64.0F + -1.0F;
                        float var10 = (float) var8 * 2.0F / 64.0F - 1.0F;
                        float var11 = (float) (1.0D / Math.sqrt((double) (var9 * var9 + var10 * var10 + 1.0F)));
                        float var12 = var10 * var11;
                        float var13 = var9 * var11;
                        for (int var14 = 0; var14 < 6; ++var14) {
                            float var15;
                            if (~var14 == -1) {
                                var15 = -var12;
                            } else if (~var14 != -2) {
                                if (~var14 != -3) {
                                    if (~var14 != -4) {
                                        if (var14 != 4) {
                                            var15 = -var11;
                                        } else {
                                            var15 = var11;
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
                                var16 = (int) ((double) var2 * Math.pow((double) var15, 12.0D));
                            }
                            var4[var14][var6] = (byte) var18;
                            var5[var14][var6] = (byte) var17;
                            var3[var14][var6] = (byte) var16;
                        }
                        ++var6;
                    }
                }
                this.field4944 = new class532[3];
                this.field4944[0] = new class532(super.field9490, 6406, 64, false, var4, 6406);
                this.field4944[1] = new class532(super.field9490, 6406, 64, false, var5, 6406);
                this.field4944[2] = new class532(super.field9490, 6406, 64, false, var3, 6406);
                this.method2632(-15062);
            }
        } catch (RuntimeException var20) {
            throw class759.method5498(var20, field4950[10] + (arg0 != null ? field4950[3] : field4950[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(Lkia;I)Z")
    public static final boolean method2630(class646 arg0, int arg1) {
        try {
            if (arg1 != -2374) {
                return false;
            } else {
                ++field4941;
                return class338.field5264 == arg0 || class779.field11332 == arg0 || class524.field7652 == arg0 || class439.field6482 == arg0 || class593.field8704 == arg0;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4950[2] + (arg0 != null ? field4950[3] : field4950[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(BZ)V")
    public final void method6(byte arg0, boolean arg1) {
        try {
            if (arg0 != 38) {
                this.field4939 = null;
            }
            ++field4940;
            super.field9490.method1684((byte) -61, 7681, 8448);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field4950[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)Z")
    public final boolean method8(int arg0) {
        try {
            ++field4942;
            int var2 = 47 % ((arg0 - -17) / 42);
            return true;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field4950[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IBLmw;)V")
    public final void method4(int arg0, byte arg1, class517 arg2) {
        try {
            ++field4949;
            super.field9490.method1733(arg2, 17237);
            super.field9490.method1753(0, arg0);
            if (arg1 <= 117) {
                this.method3(true, -46);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field4950[8] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4950[3] : field4950[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "(I)V")
    public final void method1(int arg0) {
        try {
            ++field4938;
            if (this.field4937) {
                if (!this.field4945) {
                    super.field9490.method1716(arg0 + 33984, 2);
                    super.field9490.method1733((class517) null, arg0 ^ 17237);
                }
                super.field9490.method1716(33984, 1);
                super.field9490.method1733((class517) null, 17237);
                super.field9490.method1716(33984, 0);
                this.field4939.method3971(0, '\u0001');
                this.field4937 = false;
            } else {
                super.field9490.method1683(770, 32888, 5890, 0);
            }
            if (arg0 != 0) {
                this.method2632(-108);
            }
            super.field9490.method1684((byte) -61, 8448, 8448);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4950[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "(B)V")
    public static void method2631(byte arg0) {
        try {
            if (arg0 < 86) {
                field4948 = null;
            }
            field4948 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field4950[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "(I)V")
    private final void method2632(int arg0) {
        try {
            this.field4939 = new class524(super.field9490, 2);
            ++field4947;
            this.field4939.method3972(0, (byte) -91);
            super.field9490.method1716(33984, 1);
            OpenGL.glTexGeni(8192, 9472, 34065);
            OpenGL.glTexGeni(8193, 9472, 34065);
            OpenGL.glTexGeni(8194, 9472, 34065);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            if (arg0 == -15062) {
                OpenGL.glEnable(3170);
                OpenGL.glMatrixMode(5890);
                OpenGL.glLoadIdentity();
                OpenGL.glRotatef(22.5F, 1.0F, 0.0F, 0.0F);
                OpenGL.glMatrixMode(5888);
                if (!this.field4945) {
                    super.field9490.method1684((byte) -61, 8448, 7681);
                    super.field9490.method1739(34168, 0, (byte) 19, 768);
                    super.field9490.method1716(arg0 + 49046, 2);
                    super.field9490.method1684((byte) -61, 7681, 260);
                    super.field9490.method1739(34168, 0, (byte) 19, 768);
                    super.field9490.method1739(34168, 1, (byte) 19, 770);
                    super.field9490.method1683(770, 32888, 34167, 0);
                } else {
                    super.field9490.method1684((byte) -61, 7681, 260);
                    super.field9490.method1739(5890, 0, (byte) 19, 770);
                    super.field9490.method1683(770, arg0 ^ -47790, 34167, 0);
                }
                super.field9490.method1716(33984, 0);
                this.field4939.method3973(123);
                this.field4939.method3972(1, (byte) -85);
                super.field9490.method1716(33984, 1);
                OpenGL.glDisable(3168);
                OpenGL.glDisable(3169);
                OpenGL.glDisable(3170);
                OpenGL.glMatrixMode(5890);
                OpenGL.glLoadIdentity();
                OpenGL.glMatrixMode(5888);
                if (this.field4945) {
                    super.field9490.method1684((byte) -61, 8448, 8448);
                    super.field9490.method1739(5890, 0, (byte) 19, 768);
                    super.field9490.method1683(770, 32888, 5890, 0);
                } else {
                    super.field9490.method1684((byte) -61, 8448, 8448);
                    super.field9490.method1739(5890, 0, (byte) 19, 768);
                    super.field9490.method1716(33984, 2);
                    super.field9490.method1684((byte) -61, 8448, 8448);
                    super.field9490.method1739(5890, 0, (byte) 19, 768);
                    super.field9490.method1739(34168, 1, (byte) 19, 768);
                    super.field9490.method1683(770, 32888, 5890, 0);
                }
                super.field9490.method1716(33984, 0);
                this.field4939.method3973(arg0 + 14977);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4950[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(ZI)V")
    public final void method3(boolean arg0, int arg1) {
        try {
            if (this.field4939 != null && arg0) {
                if (!this.field4945) {
                    super.field9490.method1716(33984, 2);
                    super.field9490.method1733(super.field9490.field2954, 17237);
                    super.field9490.method1716(33984, 0);
                }
                this.field4939.method3971(0, '\u0000');
                this.field4937 = true;
            } else {
                super.field9490.method1683(770, 32888, 34168, 0);
            }
            if (arg1 != 1) {
                this.field4945 = false;
            }
            ++field4946;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field4950[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIZ)V")
    public final void method7(int arg0, int arg1, boolean arg2) {
        try {
            if (!arg2) {
                this.method3(false, -106);
            }
            ++field4943;
            if (this.field4937) {
                super.field9490.method1716(33984, 1);
                super.field9490.method1733(this.field4944[arg1 + -1], 17237);
                super.field9490.method1716(33984, 0);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field4950[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!eo", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2633(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 92);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!eo", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2634(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 41;
                    break;
                case 1:
                    var10005 = 4;
                    break;
                case 2:
                    var10005 = 41;
                    break;
                case 3:
                    var10005 = 17;
                    break;
                default:
                    var10005 = 92;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
