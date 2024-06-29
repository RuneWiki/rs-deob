import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qw")
public class class81 extends class344 {

    @OriginalMember(owner = "client!qw", name = "o", descriptor = "Z")
    private boolean field1242 = false;

    @OriginalMember(owner = "client!qw", name = "j", descriptor = "Z")
    private boolean field1238;

    @OriginalMember(owner = "client!qw", name = "k", descriptor = "[Ldka;")
    private class12[] field1232;

    @OriginalMember(owner = "client!qw", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1243 = new String[] { method840(method839("G/Ct")), method840(method839("Rt\u00016-")), method840(method839("X-\u0001]x")), method840(method839("X-\u0001$9G3[&x")), method840(method839("X-\u0001Yx")), method840(method839("X-\u0001_x")), method840(method839("X-\u0001Zx")), method840(method839("X-\u0001[x")), method840(method839("X-\u0001^x")), method840(method839("X-\u0001Px")), method840(method839("X-\u0001\\x")) };

    @OriginalMember(owner = "client!qw", name = "g", descriptor = "I")
    public static int field1230;

    @OriginalMember(owner = "client!qw", name = "h", descriptor = "I")
    public static int field1231;

    @OriginalMember(owner = "client!qw", name = "s", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!qw", name = "q", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!qw", name = "l", descriptor = "I")
    public static int field1236;

    @OriginalMember(owner = "client!qw", name = "m", descriptor = "I")
    public static int field1237;

    @OriginalMember(owner = "client!qw", name = "p", descriptor = "I")
    public static int field1239;

    @OriginalMember(owner = "client!qw", name = "i", descriptor = "I")
    public static int field1240;

    @OriginalMember(owner = "client!qw", name = "n", descriptor = "I")
    public static int field1241;

    @OriginalMember(owner = "client!qw", name = "r", descriptor = "Lfga;")
    private class266 field1234;

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(Z)Z")
    public final boolean method831(boolean arg0) {
        try {
            if (arg0) {
                field1240 = -85;
            }
            ++field1239;
            return true;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field1243[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qw", name = "b", descriptor = "(B)V")
    private final void method832(byte arg0) {
        try {
            this.field1234 = new class266(super.field5595, 2);
            ++field1235;
            this.field1234.method2303(0, 8334);
            super.field5595.method1432((byte) 3, 1);
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
            if (this.field1238) {
                super.field5595.method1492(7681, 260, (byte) 17);
                super.field5595.method1456((byte) -101, 770, 5890, 0);
                super.field5595.method1427(2, 34167, 770, 0);
            } else {
                super.field5595.method1492(8448, 7681, (byte) 17);
                super.field5595.method1456((byte) -101, 768, 34168, 0);
                super.field5595.method1432((byte) 3, 2);
                super.field5595.method1492(7681, 260, (byte) 17);
                super.field5595.method1456((byte) -101, 768, 34168, 0);
                super.field5595.method1456((byte) -101, 770, 34168, 1);
                super.field5595.method1427(2, 34167, 770, 0);
            }
            super.field5595.method1432((byte) 3, 0);
            this.field1234.method2304(false);
            this.field1234.method2303(1, 8334);
            if (arg0 <= 38) {
                this.method837((byte) 73, true);
            }
            super.field5595.method1432((byte) 3, 1);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            if (!this.field1238) {
                super.field5595.method1492(8448, 8448, (byte) 17);
                super.field5595.method1456((byte) -101, 768, 5890, 0);
                super.field5595.method1432((byte) 3, 2);
                super.field5595.method1492(8448, 8448, (byte) 17);
                super.field5595.method1456((byte) -101, 768, 5890, 0);
                super.field5595.method1456((byte) -101, 768, 34168, 1);
                super.field5595.method1427(2, 5890, 770, 0);
            } else {
                super.field5595.method1492(8448, 8448, (byte) 17);
                super.field5595.method1456((byte) -101, 768, 5890, 0);
                super.field5595.method1427(2, 5890, 770, 0);
            }
            super.field5595.method1432((byte) 3, 0);
            this.field1234.method2304(false);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field1243[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(I)V")
    public final void method833(int arg0) {
        try {
            if (arg0 <= 38) {
                this.field1242 = false;
            }
            if (this.field1242) {
                if (!this.field1238) {
                    super.field5595.method1432((byte) 3, 2);
                    super.field5595.method1497((class224) null, true);
                }
                super.field5595.method1432((byte) 3, 1);
                super.field5595.method1497((class224) null, true);
                super.field5595.method1432((byte) 3, 0);
                this.field1234.method2307(-1, '\u0001');
                this.field1242 = false;
            } else {
                super.field5595.method1427(2, 5890, 770, 0);
            }
            ++field1237;
            super.field5595.method1492(8448, 8448, (byte) 17);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field1243[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(IZ)V")
    public final void method834(int arg0, boolean arg1) {
        try {
            if (this.field1234 != null && arg1) {
                if (!this.field1238) {
                    super.field5595.method1432((byte) 3, 2);
                    super.field5595.method1497(super.field5595.field2462, true);
                    super.field5595.method1432((byte) 3, 0);
                }
                this.field1234.method2307(arg0 ^ -17, '\u0000');
                this.field1242 = true;
            } else {
                super.field5595.method1427(2, 34168, 770, 0);
            }
            ++field1241;
            if (arg0 != 16) {
                this.field1234 = null;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field1243[8] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qw", name = "b", descriptor = "(III)V")
    public final void method835(int arg0, int arg1, int arg2) {
        try {
            ++field1233;
            if (arg1 == 16) {
                if (this.field1242) {
                    super.field5595.method1432((byte) 3, 1);
                    super.field5595.method1497(this.field1232[arg0 + -1], true);
                    super.field5595.method1432((byte) 3, 0);
                }
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field1243[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(Lgb;II)V")
    public final void method836(class224 arg0, int arg1, int arg2) {
        try {
            ++field1236;
            super.field5595.method1497(arg0, true);
            if (arg2 == 16) {
                super.field5595.method1425((byte) 35, arg1);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field1243[2] + (arg0 != null ? field1243[1] : field1243[0]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(BZ)V")
    public final void method837(byte arg0, boolean arg1) {
        try {
            ++field1230;
            if (arg0 > -64) {
                field1240 = 16;
            }
            super.field5595.method1492(7681, 8448, (byte) 17);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field1243[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qw", name = "<init>", descriptor = "(Lvf;)V")
    public class81(class159 arg0) {
        super(arg0);
        try {
            if (arg0.field2450) {
                this.field1238 = arg0.field2499 < 3;
                int var2 = !this.field1238 ? 127 : 48;
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
                        for (int var14 = 0; var14 < 6; ++var14) {
                            float var15;
                            if (var14 != 0) {
                                if (~var14 != -2) {
                                    if (~var14 != -3) {
                                        if (~var14 == -4) {
                                            var15 = -var13;
                                        } else if (~var14 == -5) {
                                            var15 = var11;
                                        } else {
                                            var15 = -var11;
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
                            if (!(var15 > 0.0F)) {
                                var16 = 0;
                                var17 = 0;
                                var18 = 0;
                            } else {
                                var18 = (int) (Math.pow((double) var15, 96.0D) * (double) var2);
                                var17 = (int) (Math.pow((double) var15, 36.0D) * (double) var2);
                                var16 = (int) (Math.pow((double) var15, 12.0D) * (double) var2);
                            }
                            var4[var14][var6] = (byte) var18;
                            var5[var14][var6] = (byte) var17;
                            var3[var14][var6] = (byte) var16;
                        }
                        ++var6;
                    }
                }
                this.field1232 = new class12[3];
                this.field1232[0] = new class12(super.field5595, 6406, 64, false, var4, 6406);
                this.field1232[1] = new class12(super.field5595, 6406, 64, false, var5, 6406);
                this.field1232[2] = new class12(super.field5595, 6406, 64, false, var3, 6406);
                this.method832((byte) 44);
            }
        } catch (RuntimeException var20) {
            throw class590.method4333(var20, field1243[3] + (arg0 != null ? field1243[1] : field1243[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "([Lhk;I)V")
    public static final void method838(class107[] arg0, int arg1) {
        try {
            class731.field10713 = arg0.length;
            ++field1231;
            class714.field10323 = new int[class731.field10713 + arg1];
            class475.field7238 = new class107[class731.field10713 + 10];
            class405.method3255(arg0, 0, class475.field7238, 0, class731.field10713);
            for (int var2 = 0; class731.field10713 > var2; ++var2) {
                class714.field10323[var2] = class475.field7238[var2].method12();
            }
            for (int var3 = class731.field10713; ~class475.field7238.length < ~var3; ++var3) {
                class714.field10323[var3] = 12;
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field1243[6] + (arg0 != null ? field1243[1] : field1243[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qw", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method839(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 80);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qw", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method840(char[] arg0) {
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
                    var10005 = 90;
                    break;
                case 2:
                    var10005 = 47;
                    break;
                case 3:
                    var10005 = 24;
                    break;
                default:
                    var10005 = 80;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
