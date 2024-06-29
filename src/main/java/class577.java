import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class577 extends class96 {

    @OriginalMember(owner = "client!di", name = "q", descriptor = "Z")
    private boolean field8365 = false;

    @OriginalMember(owner = "client!di", name = "j", descriptor = "Z")
    private boolean field8362;

    @OriginalMember(owner = "client!di", name = "n", descriptor = "[Lgfa;")
    private class112[] field8369;

    @OriginalMember(owner = "client!di", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8371 = new String[] { method4290(method4289(".j$0\u0013")), method4290(method4289("$vf\u001a")), method4290(method4289("1-$XF")), method4290(method4289(".j$>\u0013")), method4290(method4289(".j$7\u0013")), method4290(method4289(".j$1\u0013")), method4290(method4289(".j$5\u0013")), method4290(method4289(".j$4\u0013")), method4290(method4289(".j$3\u0013")), method4290(method4289(".j$2\u0013")), method4290(method4289(".j$:\u0013")), method4290(method4289(".j$JR$j~H\u0013")) };

    @OriginalMember(owner = "client!di", name = "g", descriptor = "I")
    public static int field8367 = 0;

    @OriginalMember(owner = "client!di", name = "m", descriptor = "I")
    public static int field8358 = 0;

    @OriginalMember(owner = "client!di", name = "h", descriptor = "I")
    public static int field8356;

    @OriginalMember(owner = "client!di", name = "r", descriptor = "I")
    public static int field8357;

    @OriginalMember(owner = "client!di", name = "i", descriptor = "I")
    public static int field8359;

    @OriginalMember(owner = "client!di", name = "o", descriptor = "I")
    public static int field8360;

    @OriginalMember(owner = "client!di", name = "t", descriptor = "I")
    public static int field8363;

    @OriginalMember(owner = "client!di", name = "l", descriptor = "I")
    public static int field8364;

    @OriginalMember(owner = "client!di", name = "k", descriptor = "I")
    public static int field8366;

    @OriginalMember(owner = "client!di", name = "s", descriptor = "I")
    public static int field8368;

    @OriginalMember(owner = "client!di", name = "u", descriptor = "I")
    public static int field8370;

    @OriginalMember(owner = "client!di", name = "p", descriptor = "Lkca;")
    private class13 field8361;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ZI)V")
    public final void method673(boolean arg0, int arg1) {
        try {
            int var3 = -64 / ((36 - arg1) / 55);
            ++field8370;
            if (this.field8361 != null && arg0) {
                if (!this.field8362) {
                    super.field1301.method1619(2, (byte) 125);
                    super.field1301.method1618((byte) -1, super.field1301.field2833);
                    super.field1301.method1619(0, (byte) 125);
                }
                this.field8361.method88('\u0000', (byte) -112);
                this.field8365 = true;
            } else {
                super.field1301.method1650(0, (byte) -109, 770, 34168);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field8371[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!di", name = "d", descriptor = "(I)V")
    private final void method4286(int arg0) {
        try {
            ++field8359;
            this.field8361 = new class13(super.field1301, 2);
            this.field8361.method90(0, (byte) 123);
            super.field1301.method1619(1, (byte) 125);
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
            if (this.field8362) {
                super.field1301.method1628(7681, 260, 34162);
                super.field1301.method1669(770, 0, 5890, (byte) -128);
                super.field1301.method1650(0, (byte) -109, 770, 34167);
            } else {
                super.field1301.method1628(8448, 7681, 34162);
                super.field1301.method1669(768, 0, 34168, (byte) -125);
                super.field1301.method1619(2, (byte) 125);
                super.field1301.method1628(7681, 260, arg0 + 58227);
                super.field1301.method1669(768, 0, 34168, (byte) -124);
                super.field1301.method1669(770, 1, 34168, (byte) -113);
                super.field1301.method1650(0, (byte) -109, 770, 34167);
            }
            super.field1301.method1619(0, (byte) 125);
            this.field8361.method87((byte) 103);
            this.field8361.method90(1, (byte) 80);
            super.field1301.method1619(1, (byte) 125);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            if (!this.field8362) {
                super.field1301.method1628(8448, 8448, 34162);
                super.field1301.method1669(768, 0, 5890, (byte) -125);
                super.field1301.method1619(2, (byte) 125);
                super.field1301.method1628(8448, 8448, arg0 ^ -56179);
                super.field1301.method1669(768, 0, 5890, (byte) -120);
                super.field1301.method1669(768, 1, 34168, (byte) -117);
                super.field1301.method1650(0, (byte) -109, 770, 5890);
            } else {
                super.field1301.method1628(8448, 8448, 34162);
                super.field1301.method1669(768, 0, 5890, (byte) -126);
                super.field1301.method1650(0, (byte) -109, 770, 5890);
            }
            if (arg0 != -24065) {
                field8367 = 32;
            }
            super.field1301.method1619(0, (byte) 125);
            this.field8361.method87((byte) 103);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8371[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V")
    public final void method675(int arg0) {
        try {
            if (!this.field8365) {
                super.field1301.method1650(0, (byte) -109, 770, 5890);
            } else {
                if (!this.field8362) {
                    super.field1301.method1619(2, (byte) 125);
                    super.field1301.method1618((byte) -125, (class469) null);
                }
                super.field1301.method1619(1, (byte) 125);
                super.field1301.method1618((byte) 70, (class469) null);
                super.field1301.method1619(0, (byte) 125);
                this.field8361.method88('\u0001', (byte) -112);
                this.field8365 = false;
            }
            ++field8360;
            if (arg0 == -16265) {
                super.field1301.method1628(8448, 8448, 34162);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8371[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Z)Z")
    public final boolean method677(boolean arg0) {
        try {
            if (!arg0) {
                this.field8361 = null;
            }
            ++field8364;
            return true;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8371[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ZB)V")
    public final void method683(boolean arg0, byte arg1) {
        try {
            ++field8356;
            super.field1301.method1628(7681, 8448, arg1 + 34216);
            if (arg1 != -54) {
                this.method673(false, 24);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field8371[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!di", name = "c", descriptor = "(I)V")
    public static final void method4287(int arg0) {
        try {
            if (arg0 > 23) {
                ++field8366;
                try {
                    if (~class385.field5631 == -2) {
                        int var1 = class786.field11354.method3321(-1801413873);
                        if (~var1 < -1 && class786.field11354.method3326((byte) 112)) {
                            int var2 = var1 - class713.field10110;
                            if (~var2 > -1) {
                                var2 = 0;
                            }
                            class786.field11354.method3313(var2, (byte) 119);
                            return;
                        }
                        class786.field11354.method3344(18);
                        class786.field11354.method3322((byte) -120);
                        if (class430.field6242 != null) {
                            class385.field5631 = 2;
                        } else {
                            class385.field5631 = 0;
                        }
                        class700.field9796 = null;
                        class381.field5554 = null;
                    }
                    if (~class385.field5631 == -4) {
                        int var3 = class786.field11354.method3321(-1801413873);
                        if (class760.field10848 > var3 && class786.field11354.method3326((byte) 106)) {
                            int var4 = class511.field7507 + var3;
                            if (var4 > class760.field10848) {
                                var4 = class760.field10848;
                            }
                            class786.field11354.method3313(var4, (byte) 120);
                        } else {
                            class385.field5631 = 0;
                            class511.field7507 = 0;
                        }
                    }
                } catch (Exception var7) {
                    var7.printStackTrace();
                    class786.field11354.method3344(18);
                    class238.field3445 = null;
                    class381.field5554 = null;
                    class430.field6242 = null;
                    class700.field9796 = null;
                    class385.field5631 = 0;
                }
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field8371[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "(Lml;)V")
    public class577(class194 arg0) {
        super(arg0);
        try {
            if (arg0.field2860) {
                this.field8362 = ~arg0.field2906 > -4;
                int var2 = !this.field8362 ? 127 : 48;
                byte[][] var3 = new byte[6][4096];
                byte[][] var4 = new byte[6][4096];
                byte[][] var5 = new byte[6][4096];
                int var6 = 0;
                for (int var7 = 0; var7 < 64; ++var7) {
                    for (int var8 = 0; ~var8 > -65; ++var8) {
                        float var9 = (float) var8 * 2.0F / 64.0F - 1.0F;
                        float var10 = (float) var7 * 2.0F / 64.0F + -1.0F;
                        float var11 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var9 * var9 + 1.0F)));
                        float var12 = var10 * var11;
                        float var13 = var9 * var11;
                        for (int var14 = 0; ~var14 > -7; ++var14) {
                            float var15;
                            if (~var14 != -1) {
                                if (var14 == 1) {
                                    var15 = var13;
                                } else if (var14 != 2) {
                                    if (var14 != 3) {
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
                                var16 = (int) (Math.pow((double) var15, 96.0D) * (double) var2);
                                var17 = (int) ((double) var2 * Math.pow((double) var15, 36.0D));
                                var18 = (int) ((double) var2 * Math.pow((double) var15, 12.0D));
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
                this.field8369 = new class112[3];
                this.field8369[0] = new class112(super.field1301, 6406, 64, false, var4, 6406);
                this.field8369[1] = new class112(super.field1301, 6406, 64, false, var5, 6406);
                this.field8369[2] = new class112(super.field1301, 6406, 64, false, var3, 6406);
                this.method4286(-24065);
            }
        } catch (RuntimeException var20) {
            throw class665.method4799(var20, field8371[11] + (arg0 != null ? field8371[2] : field8371[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ZII)V")
    public final void method681(boolean arg0, int arg1, int arg2) {
        try {
            if (arg0) {
                field8367 = -43;
            }
            ++field8363;
            if (this.field8365) {
                super.field1301.method1619(1, (byte) 125);
                super.field1301.method1618((byte) 18, this.field8369[arg1 + -1]);
                super.field1301.method1619(0, (byte) 125);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field8371[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IZLica;)V")
    public final void method679(int arg0, boolean arg1, class469 arg2) {
        try {
            ++field8357;
            super.field1301.method1618((byte) -92, arg2);
            super.field1301.method1631(arg0, 7681);
            if (arg1) {
                this.field8369 = null;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field8371[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8371[2] : field8371[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIIBI)V")
    public static final void method4288(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        try {
            ++field8368;
            int var11 = arg5 + 1;
            class576.method4282(-7, arg0, arg2, class529.field7682[arg5], arg1);
            int var10 = arg3 - 1;
            class576.method4282(-7, arg0, arg2, class529.field7682[arg3], arg1);
            if (arg4 >= 64) {
                for (int var6 = var11; var10 >= var6; ++var6) {
                    int[] var7 = class529.field7682[var6];
                    var7[arg0] = var7[arg1] = arg2;
                }
            }
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field8371[10] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!di", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4289(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 59);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!di", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4290(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 74;
                    break;
                case 1:
                    var10005 = 3;
                    break;
                case 2:
                    var10005 = 10;
                    break;
                case 3:
                    var10005 = 118;
                    break;
                default:
                    var10005 = 59;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
