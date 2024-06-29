import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public class class417 extends class478 {

    @OriginalMember(owner = "client!gu", name = "x", descriptor = "I")
    private int field5864 = -1;

    @OriginalMember(owner = "client!gu", name = "z", descriptor = "I")
    private int field5866 = -1;

    @OriginalMember(owner = "client!gu", name = "C", descriptor = "I")
    public int field5869;

    @OriginalMember(owner = "client!gu", name = "G", descriptor = "I")
    public int field5873;

    @OriginalMember(owner = "client!gu", name = "B", descriptor = "Lmg;")
    public static class103 field5868 = new class103("RC", 1);

    @OriginalMember(owner = "client!gu", name = "J", descriptor = "I")
    public static int field5876;

    @OriginalMember(owner = "client!gu", name = "w", descriptor = "I")
    public static int field5863;

    @OriginalMember(owner = "client!gu", name = "y", descriptor = "I")
    public static int field5865;

    @OriginalMember(owner = "client!gu", name = "A", descriptor = "I")
    public static int field5867;

    @OriginalMember(owner = "client!gu", name = "D", descriptor = "I")
    public static int field5870;

    @OriginalMember(owner = "client!gu", name = "E", descriptor = "I")
    public static int field5871;

    @OriginalMember(owner = "client!gu", name = "F", descriptor = "I")
    public static int field5872;

    @OriginalMember(owner = "client!gu", name = "H", descriptor = "I")
    public static int field5874;

    @OriginalMember(owner = "client!gu", name = "I", descriptor = "I")
    public static int field5875;

    @OriginalMember(owner = "client!gu", name = "K", descriptor = "I")
    public static int field5877;

    @OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(Lih;IIIIZ[BIZ)V")
    public class417(class503 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field5869 = arg3;
        this.field5873 = arg4;
        if (arg8) {
            byte[] var10 = new byte[arg6.length];
            for (int var11 = 0; ~var11 > ~arg4; ++var11) {
                int var12 = arg3 * var11;
                int var13 = (-var11 + arg4 + -1) * arg3;
                for (int var14 = 0; arg3 > var14; ++var14) {
                    var10[var12++] = arg6[var13++];
                }
            }
            arg6 = var10;
        }
        super.field6649.method2968(this, -45);
        OpenGL.glPixelStorei(3317, 1);
        if (arg5 && ~super.field6667 != -34038) {
            class269.method1692(arg7, arg4, (byte) 112, arg3, arg2, arg1, arg6);
            this.method2758(true, 122);
        } else {
            OpenGL.glTexImage2Dub(super.field6667, 0, super.field6670, this.field5869, this.field5873, 0, arg7, 5121, arg6, 0);
            this.method2758(false, 116);
        }
        OpenGL.glPixelStorei(3317, 4);
        this.method2762(9728, true);
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(ILl;Lza;)V")
    public static final void method2466(int arg0, class16 arg1, class290 arg2) {
        ++field5877;
        if (class245.field3547 != null) {
            if (class433.field6100 < 10) {
                if (!class245.field3554.method443(false, class245.field3547.field4492)) {
                    class433.field6100 = class290.field4248.method450(class245.field3547.field4492, 102) / 10;
                    return;
                }
                class180.method1120(true);
                class433.field6100 = 10;
            }
            if (class433.field6100 == 10) {
                class245.field3574 = class245.field3547.field4505 >> 6 << 6;
                class245.field3586 = class245.field3547.field4500 >> 6 << 6;
                class245.field3582 = (class245.field3547.field4499 >> 6 << 6) + -class245.field3574 + 64;
                class245.field3571 = (class245.field3547.field4508 >> 6 << 6) + -class245.field3586 + 64;
                int[] var3 = new int[3];
                int var4 = -1;
                int var5 = -1;
                if (class245.field3547.method1872((class246.field3587.field1899 >> 7) + class367.field5241, class246.field3587.field1904, var3, 0, class441.field6171 - -(class246.field3587.field1896 >> 7))) {
                    var4 = var3[1] + -class245.field3574;
                    var5 = var3[2] + -class245.field3586;
                }
                if (!class453.field6358 && var4 >= 0 && ~var4 > ~class245.field3582 && ~var5 <= -1 && class245.field3571 > var5) {
                    int var6 = var5 + -5 + (int) (10.0D * Math.random());
                    int var7 = var4 + -5 + (int) (Math.random() * 10.0D);
                    class307.field4455 = var7;
                    class421.field5935 = var6;
                } else if (~class214.field3084 != 0 && class15.field196 != -1) {
                    class245.field3547.method1873(var3, (byte) -127, class214.field3084, class15.field196);
                    class15.field196 = -1;
                    class214.field3084 = -1;
                    if (var3 != null) {
                        class421.field5935 = var3[2] + -class245.field3586;
                        class307.field4455 = var3[1] + -class245.field3574;
                    }
                    class453.field6358 = false;
                } else {
                    class245.field3547.method1873(var3, (byte) -127, (class245.field3547.field4498 & 268420770) >> 14, class245.field3547.field4498 & 16383);
                    class307.field4455 = var3[1] - class245.field3574;
                    class421.field5935 = var3[2] - class245.field3586;
                }
                if (class245.field3547.field4502 == 37) {
                    class245.field3556 = 3.0F;
                    class245.field3555 = 3.0F;
                } else if (~class245.field3547.field4502 != -51) {
                    if (~class245.field3547.field4502 == -76) {
                        class245.field3556 = 6.0F;
                        class245.field3555 = 6.0F;
                    } else if (class245.field3547.field4502 == 100) {
                        class245.field3556 = 8.0F;
                        class245.field3555 = 8.0F;
                    } else if (class245.field3547.field4502 == 200) {
                        class245.field3556 = 16.0F;
                        class245.field3555 = 16.0F;
                    } else {
                        class245.field3556 = 8.0F;
                        class245.field3555 = 8.0F;
                    }
                } else {
                    class245.field3556 = 4.0F;
                    class245.field3555 = 4.0F;
                }
                class245.field3563 = (int) class245.field3556 >> 1;
                class245.field3557 = class322.method1940(class245.field3563, (byte) 109);
                class516.method3066(114);
                class245.method1538();
                class382.field5382 = new class455();
                class245.field3564 += (int) (Math.random() * 5.0D) - 2;
                if (class245.field3564 < -8) {
                    class245.field3564 = -8;
                }
                class245.field3561 += (int) (5.0D * Math.random()) + -2;
                if (class245.field3564 > 8) {
                    class245.field3564 = 8;
                }
                if (~class245.field3561 > 15) {
                    class245.field3561 = -16;
                }
                if (class245.field3561 > 16) {
                    class245.field3561 = 16;
                }
                class245.method1545(arg1, class245.field3564 >> 2 << 10, class245.field3561 >> 1);
                class245.field3553.method1317(1024, 256, 61);
                class245.field3550.method1860(false, 256, 256);
                class245.field3552.method1905(-92, 4096);
                class181.field2596.method2791(256, (byte) -59);
                class433.field6100 = 20;
            } else if (~class433.field6100 == -21) {
                class295.method1820(true, (byte) 27);
                class245.method1541(arg2, class245.field3564, class245.field3561);
                class433.field6100 = 60;
                class295.method1820(true, (byte) 27);
                class429.method2539(32);
            } else {
                if (arg0 != -1684459574) {
                    field5868 = null;
                }
                if (class433.field6100 == 60) {
                    if (class245.field3554.method439(class245.field3547.field4492 + "_staticelements", arg0 + 1684459574)) {
                        if (!class245.field3554.method443(false, class245.field3547.field4492 + "_staticelements")) {
                            return;
                        }
                        class245.field3562 = class391.method2262((byte) 63, class192.field2735, class245.field3547.field4492 + "_staticelements", class245.field3554);
                    } else {
                        class245.field3562 = new class259(0);
                    }
                    class245.method1547();
                    class433.field6100 = 70;
                    class295.method1820(true, (byte) 27);
                    class429.method2539(32);
                } else if (class433.field6100 == 70) {
                    class132.field1734 = new class11(arg2, 11, true, class487.field6799);
                    class433.field6100 = 73;
                    class295.method1820(true, (byte) 27);
                    class429.method2539(arg0 ^ -1684459542);
                } else if (~class433.field6100 == -74) {
                    class68.field860 = new class11(arg2, 12, true, class487.field6799);
                    class433.field6100 = 76;
                    class295.method1820(true, (byte) 27);
                    class429.method2539(32);
                } else if (class433.field6100 == 76) {
                    class510.field7558 = new class11(arg2, 14, true, class487.field6799);
                    class433.field6100 = 79;
                    class295.method1820(true, (byte) 27);
                    class429.method2539(32);
                } else if (~class433.field6100 == -80) {
                    class377.field5337 = new class11(arg2, 17, true, class487.field6799);
                    class433.field6100 = 82;
                    class295.method1820(true, (byte) 27);
                    class429.method2539(32);
                } else if (class433.field6100 == 82) {
                    class496.field7037 = new class11(arg2, 19, true, class487.field6799);
                    class433.field6100 = 85;
                    class295.method1820(true, (byte) 27);
                    class429.method2539(arg0 ^ -1684459542);
                } else if (class433.field6100 == 85) {
                    class273.field4051 = new class11(arg2, 22, true, class487.field6799);
                    class433.field6100 = 88;
                    class295.method1820(true, (byte) 27);
                    class429.method2539(32);
                } else if (class433.field6100 == 88) {
                    class127.field1710 = new class11(arg2, 26, true, class487.field6799);
                    class433.field6100 = 91;
                    class295.method1820(true, (byte) 27);
                    class429.method2539(32);
                } else {
                    class150.field2035 = new class11(arg2, 30, true, class487.field6799);
                    class433.field6100 = 100;
                    class295.method1820(true, (byte) 27);
                    class429.method2539(arg0 + 1684459606);
                    System.gc();
                }
            }
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(IZZ)V")
    public final void method2467(int arg0, boolean arg1, boolean arg2) {
        ++field5874;
        if (~super.field6667 == -3554) {
            super.field6649.method2968(this, -76);
            OpenGL.glTexParameteri(super.field6667, 10242, !arg2 ? 33071 : 10497);
            OpenGL.glTexParameteri(super.field6667, 10243, !arg1 ? 33071 : 10497);
        }
        if (arg0 != 19) {
            method2471(-74);
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(IIIIIII)V")
    public final void method2468(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field5867;
        int var8 = -arg3 + super.field6649.field7259 + -arg0;
        super.field6649.method2968(this, -42);
        OpenGL.glCopyTexSubImage2D(super.field6667, arg5, arg2, -arg4 + this.field5873 - arg3, arg6, var8, arg1, arg3);
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(IBII)V")
    public final void method2469(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != -2) {
            this.method2467(-5, false, false);
        }
        ++field5872;
        OpenGL.glFramebufferTexture2DEXT(arg0, arg2, super.field6667, super.field6651, arg3);
        this.field5866 = arg0;
        this.field5864 = arg2;
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(IIZIZ[BIIII)V")
    public final void method2470(int arg0, int arg1, boolean arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field5871;
        if (~arg3 == -1) {
            arg3 = arg8;
        }
        if (arg4) {
            int var11 = class338.method2016(arg7, 1);
            int var12 = arg8 * var11;
            int var13 = arg3 * var11;
            byte[] var14 = new byte[arg1 * var12];
            for (int var15 = 0; ~arg1 < ~var15; ++var15) {
                int var16 = var12 * var15;
                int var17 = (-var15 + -1 + arg1) * var13 - -arg6;
                for (int var18 = 0; ~var18 > ~var12; ++var18) {
                    var14[var16++] = arg5[var17++];
                }
            }
            arg5 = var14;
        }
        super.field6649.method2968(this, -56);
        OpenGL.glPixelStorei(3317, 1);
        if (~arg3 != ~arg8) {
            OpenGL.glPixelStorei(3314, arg3);
        }
        OpenGL.glTexSubImage2Dub(super.field6667, 0, arg0, arg9, arg8, arg1, arg7, 5121, arg5, arg6);
        if (arg2) {
            field5868 = null;
        }
        if (~arg3 != ~arg8) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(Lih;IIII)V")
    public class417(class503 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        this.field5873 = arg4;
        this.field5869 = arg3;
        super.field6649.method2968(this, -104);
        OpenGL.glTexImage2Dub(super.field6667, 0, super.field6670, arg3, arg4, 0, class527.method3110(super.field6670, 6410), 5121, (byte[]) null, 0);
        this.method2762(9728, true);
    }

    @OriginalMember(owner = "client!gu", name = "f", descriptor = "(I)V")
    public static void method2471(int arg0) {
        field5868 = null;
        if (arg0 < 2) {
            method2466(100, (class16) null, (class290) null);
        }
    }

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "(IIIIIII)I")
    public static final int method2472(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field5865;
        if (arg2 != -20589) {
            return -90;
        } else {
            if (~(arg1 & 1) == -2) {
                int var7 = arg5;
                arg5 = arg4;
                arg4 = var7;
            }
            int var8 = arg6 & 3;
            if (~var8 == -1) {
                return arg0;
            } else if (~var8 == -2) {
                return arg3;
            } else {
                return ~var8 == -3 ? -arg0 + 7 + -arg5 + 1 : -arg4 + 1 + 7 + -arg3;
            }
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(I)V")
    public final void method462(int arg0) {
        if (arg0 != -1259451258) {
            method2466(-30, (class16) null, (class290) null);
        }
        ++field5870;
        OpenGL.glFramebufferTexture2DEXT(this.field5866, this.field5864, super.field6667, 0, 0);
        this.field5866 = -1;
        this.field5864 = -1;
    }

    @OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(Lih;IIIII)V")
    public class417(class503 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        this.field5869 = arg4;
        this.field5873 = arg5;
        int var7 = super.field6649.field7259 - (arg3 + arg5);
        super.field6649.method2968(this, -65);
        OpenGL.glCopyTexImage2D(super.field6667, 0, super.field6670, arg2, var7, arg4, arg5, 0);
        this.method2762(9728, true);
    }

    @OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(Lih;IIIIZ[FI)V")
    public class417(class503 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field5869 = arg3;
        this.field5873 = arg4;
        super.field6649.method2968(this, -48);
        if (arg5 && super.field6667 != 34037) {
            class29.method183(arg4, arg6, arg7, arg1, arg3, 61, arg2);
            this.method2758(true, 115);
        } else {
            OpenGL.glTexImage2Df(super.field6667, 0, super.field6670, this.field5869, this.field5873, 0, arg7, 5126, arg6, 0);
            this.method2758(false, 125);
        }
        this.method2762(9728, true);
    }

    @OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(Lih;IIIIZ[IZ)V")
    public class417(class503 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, boolean arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field5869 = arg3;
        this.field5873 = arg4;
        if (arg7) {
            int[] var9 = new int[arg6.length];
            for (int var10 = 0; ~arg4 < ~var10; ++var10) {
                int var11 = arg3 * var10;
                int var12 = (arg4 + -1 - var10) * arg3;
                for (int var13 = 0; arg3 > var13; ++var13) {
                    var9[var11++] = arg6[var12++];
                }
            }
            arg6 = var9;
        }
        super.field6649.method2968(this, -88);
        if (arg5 && ~super.field6667 != -34038) {
            class57.method475(super.field6667, 32993, arg6, this.field5873, this.field5869, super.field6649.field7442, 1479619105, super.field6670);
            this.method2758(true, 116);
        } else {
            OpenGL.glTexImage2Di(super.field6667, 0, super.field6670, this.field5869, this.field5873, 0, 32993, super.field6649.field7442, arg6, 0);
            this.method2758(false, 118);
        }
        this.method2762(9728, true);
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(IIZIIII[II)V")
    public final void method2473(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8) {
        if (~arg5 == -1) {
            arg5 = arg8;
        }
        ++field5863;
        if (arg2) {
            int[] var10 = new int[arg6 * arg8];
            for (int var11 = 0; arg6 > var11; ++var11) {
                int var12 = arg8 * var11;
                int var13 = (arg6 - var11 + -1) * arg5 - -arg0;
                for (int var14 = 0; ~var14 > ~arg8; ++var14) {
                    var10[var12++] = arg7[var13++];
                }
            }
            arg7 = var10;
        }
        super.field6649.method2968(this, -113);
        if (~arg5 != ~arg8) {
            OpenGL.glPixelStorei(3314, arg5);
        }
        OpenGL.glTexSubImage2Di(super.field6667, 0, arg3, arg1, arg8, arg6, 32993, super.field6649.field7442, arg7, arg0);
        if (arg5 != arg8) {
            OpenGL.glPixelStorei(3314, 0);
        }
        if (arg4 >= -32) {
            this.field5869 = -85;
        }
    }

    static {
        new class530("Player ", "Spieler ", "Joueur ", "Jogador ");
        field5876 = 0;
        new class530("From", "Von:", "De", "De");
    }
}
