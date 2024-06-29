import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public class class308 extends class188 {

    @OriginalMember(owner = "client!qv", name = "z", descriptor = "I")
    private int field4217 = -1;

    @OriginalMember(owner = "client!qv", name = "w", descriptor = "I")
    private int field4214 = -1;

    @OriginalMember(owner = "client!qv", name = "B", descriptor = "I")
    public int field4219;

    @OriginalMember(owner = "client!qv", name = "C", descriptor = "I")
    public int field4220;

    @OriginalMember(owner = "client!qv", name = "I", descriptor = "Luf;")
    public static class310 field4226;

    @OriginalMember(owner = "client!qv", name = "J", descriptor = "[I")
    public static int[] field4227;

    @OriginalMember(owner = "client!qv", name = "N", descriptor = "Z")
    public static volatile boolean field4230;

    @OriginalMember(owner = "client!qv", name = "x", descriptor = "I")
    public static int field4215;

    @OriginalMember(owner = "client!qv", name = "y", descriptor = "I")
    public static int field4216;

    @OriginalMember(owner = "client!qv", name = "A", descriptor = "I")
    public static int field4218;

    @OriginalMember(owner = "client!qv", name = "E", descriptor = "I")
    public static int field4222;

    @OriginalMember(owner = "client!qv", name = "F", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!qv", name = "G", descriptor = "I")
    public static int field4224;

    @OriginalMember(owner = "client!qv", name = "H", descriptor = "I")
    public static int field4225;

    @OriginalMember(owner = "client!qv", name = "K", descriptor = "I")
    public static int field4228;

    @OriginalMember(owner = "client!qv", name = "L", descriptor = "I")
    public static int field4229;

    @OriginalMember(owner = "client!qv", name = "D", descriptor = "J")
    public static long field4221;

    static {
        new class83("Ok", "Okay", "OK", "Ok");
        field4226 = new class310(27, -1);
        field4227 = new int[2];
        field4230 = true;
    }

    @OriginalMember(owner = "client!qv", name = "<init>", descriptor = "(Lht;IIIII)V", line = 4)
    public class308(class410 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        this.field4219 = arg4;
        this.field4220 = arg5;
        int var7 = -arg5 - arg3 + super.field2615.field5680;
        super.field2615.method2412((byte) 4, this);
        OpenGL.glCopyTexImage2D(super.field2613, 0, super.field2601, arg2, var7, arg4, arg5, 0);
        this.method1132(true, (byte) 62);
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(Z)Z", line = 21)
    public static final boolean method1744(boolean arg0) {
        for (int var1 = class354.field4827; var1 < class401.field5574; ++var1) {
            class61[][] var2 = class385.field5410[var1];
            for (int var3 = -class231.field3212; var3 <= 0; ++var3) {
                int var4 = class192.field2742 + var3;
                int var5 = class192.field2742 - var3;
                if (var4 >= class436.field6347 || var5 < class364.field5059) {
                    for (int var6 = -class231.field3212; var6 <= 0; ++var6) {
                        int var7 = class141.field2010 + var6;
                        int var8 = class141.field2010 - var6;
                        if (var4 >= class436.field6347) {
                            if (var7 >= class300.field4130) {
                                class61 var9 = var2[var4][var7];
                                if (var9 != null && var9.field817) {
                                    class142.field2033 = arg0;
                                    class210.field2984.method1956(-122, var9);
                                    class210.field2984.method1951((byte) -117);
                                }
                            }
                            if (var8 < class450.field6492) {
                                class61 var10 = var2[var4][var8];
                                if (var10 != null && var10.field817) {
                                    class142.field2033 = arg0;
                                    class210.field2984.method1956(-125, var10);
                                    class210.field2984.method1951((byte) -127);
                                }
                            }
                        }
                        if (var5 < class364.field5059) {
                            if (var7 >= class300.field4130) {
                                class61 var11 = var2[var5][var7];
                                if (var11 != null && var11.field817) {
                                    class142.field2033 = arg0;
                                    class210.field2984.method1956(-127, var11);
                                    class210.field2984.method1951((byte) -119);
                                }
                            }
                            if (var8 < class450.field6492) {
                                class61 var12 = var2[var5][var8];
                                if (var12 != null && var12.field817) {
                                    class142.field2033 = arg0;
                                    class210.field2984.method1956(-119, var12);
                                    class210.field2984.method1951((byte) -125);
                                }
                            }
                        }
                        if (class46.field643 == 0) {
                            if (class132.field1886) {
                                class210.field2984.method1958(24, false);
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(ILlh;)Ldr;", line = 128)
    public static final class505 method1745(int arg0, class365 arg1) {
        ++field4216;
        return arg0 != 32993 ? null : new class505(arg1.method2069(-123), arg1.method2069(-126), arg1.method2069(-125), arg1.method2069(-125), arg1.method2111(-2), arg1.method2111(-2), arg1.method2099(255));
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "([BZIIIIZIII)V", line = 140)
    public final void method1746(byte[] arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9) {
        if (~arg3 == -1) {
            arg3 = arg8;
        }
        if (arg1) {
            this.method43(111);
        }
        ++field4222;
        if (arg6) {
            int var11 = class185.method1115(-127, arg2);
            int var12 = arg8 * var11;
            int var13 = arg3 * var11;
            byte[] var14 = new byte[arg4 * var12];
            for (int var15 = 0; ~var15 > ~arg4; ++var15) {
                int var16 = var12 * var15;
                int var17 = (-var15 + -1 + arg4) * var13 + arg9;
                for (int var18 = 0; var12 > var18; ++var18) {
                    var14[var16++] = arg0[var17++];
                }
            }
            arg0 = var14;
        }
        super.field2615.method2412((byte) 4, this);
        OpenGL.glPixelStorei(3317, 1);
        if (~arg3 != ~arg8) {
            OpenGL.glPixelStorei(3314, arg3);
        }
        OpenGL.glTexSubImage2Dub(super.field2613, 0, arg5, arg7, arg8, arg4, arg2, 5121, arg0, arg9);
        if (arg3 != arg8) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!qv", name = "<init>", descriptor = "(Lht;IIIIZ[BIZ)V", line = 198)
    public class308(class410 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field4219 = arg3;
        this.field4220 = arg4;
        if (arg8) {
            byte[] var10 = new byte[arg6.length];
            for (int var11 = 0; var11 < arg4; ++var11) {
                int var12 = arg3 * var11;
                int var13 = (-var11 + -1 + arg4) * arg3;
                for (int var14 = 0; var14 < arg3; ++var14) {
                    var10[var12++] = arg6[var13++];
                }
            }
            arg6 = var10;
        }
        super.field2615.method2412((byte) 4, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg5 && ~super.field2613 != -34038) {
            class285.method1631(arg2, arg7, arg1, arg6, 0, arg3, arg4);
            this.method1134((byte) 24, true);
        } else {
            OpenGL.glTexImage2Dub(super.field2613, 0, super.field2601, this.field4219, this.field4220, 0, arg7, 5121, arg6, 0);
            this.method1134((byte) 24, false);
        }
        OpenGL.glPixelStorei(3317, 4);
        this.method1132(true, (byte) 62);
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(ZIIIBIII[I)V", line = 254)
    public final void method1747(boolean arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int[] arg8) {
        ++field4228;
        if (arg4 <= -111) {
            if (arg6 == 0) {
                arg6 = arg5;
            }
            if (arg0) {
                int[] var10 = new int[arg3 * arg5];
                for (int var11 = 0; ~arg3 < ~var11; ++var11) {
                    int var12 = arg5 * var11;
                    int var13 = (-var11 + -1 + arg3) * arg6 + arg1;
                    for (int var14 = 0; ~arg5 < ~var14; ++var14) {
                        var10[var12++] = arg8[var13++];
                    }
                }
                arg8 = var10;
            }
            super.field2615.method2412((byte) 4, this);
            if (~arg5 != ~arg6) {
                OpenGL.glPixelStorei(3314, arg6);
            }
            OpenGL.glTexSubImage2Di(super.field2613, 0, arg2, arg7, arg5, arg3, 32993, super.field2615.field5963, arg8, arg1);
            if (~arg5 != ~arg6) {
                OpenGL.glPixelStorei(3314, 0);
            }
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(IIZI)V", line = 305)
    public final void method1748(int arg0, int arg1, boolean arg2, int arg3) {
        OpenGL.glFramebufferTexture2DEXT(arg3, arg0, super.field2613, super.field2608, arg1);
        ++field4218;
        this.field4217 = arg3;
        if (!arg2) {
            this.field4214 = arg0;
        }
    }

    @OriginalMember(owner = "client!qv", name = "<init>", descriptor = "(Lht;IIIIZ[IZ)V", line = 319)
    public class308(class410 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, boolean arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field4219 = arg3;
        this.field4220 = arg4;
        if (arg7) {
            int[] var9 = new int[arg6.length];
            for (int var10 = 0; arg4 > var10; ++var10) {
                int var11 = arg3 * var10;
                int var12 = (arg4 + -1 + -var10) * arg3;
                for (int var13 = 0; ~arg3 < ~var13; ++var13) {
                    var9[var11++] = arg6[var12++];
                }
            }
            arg6 = var9;
        }
        super.field2615.method2412((byte) 4, this);
        if (arg5 && ~super.field2613 != -34038) {
            class270.method1540(super.field2615.field5963, super.field2601, super.field2613, true, 32993, this.field4219, arg6, this.field4220);
            this.method1134((byte) 24, true);
        } else {
            OpenGL.glTexImage2Di(super.field2613, 0, super.field2601, this.field4219, this.field4220, 0, 32993, super.field2615.field5963, arg6, 0);
            this.method1134((byte) 24, false);
        }
        this.method1132(true, (byte) 62);
    }

    @OriginalMember(owner = "client!qv", name = "<init>", descriptor = "(Lht;IIII)V", line = 370)
    public class308(class410 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        this.field4220 = arg4;
        this.field4219 = arg3;
        super.field2615.method2412((byte) 4, this);
        OpenGL.glTexImage2Dub(super.field2613, 0, super.field2601, arg3, arg4, 0, class162.method1005(super.field2601, -118), 5121, (byte[]) null, 0);
        this.method1132(true, (byte) 62);
    }

    @OriginalMember(owner = "client!qv", name = "<init>", descriptor = "(Lht;IIIIZ[FI)V", line = 618)
    public class308(class410 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field4219 = arg3;
        this.field4220 = arg4;
        super.field2615.method2412((byte) 4, this);
        if (arg5 && ~super.field2613 != -34038) {
            class238.method1381(arg4, arg2, arg7, (byte) -88, arg1, arg6, arg3);
            this.method1134((byte) 24, true);
        } else {
            OpenGL.glTexImage2Df(super.field2613, 0, super.field2601, this.field4219, this.field4220, 0, arg7, 5126, arg6, 0);
            this.method1134((byte) 24, false);
        }
        this.method1132(true, (byte) 62);
    }

    @OriginalMember(owner = "client!qv", name = "d", descriptor = "(B)V", line = 387)
    public static final void method1749(byte arg0) {
        if (arg0 > 99) {
            for (int var1 = 0; class292.field3915 > var1; ++var1) {
                class20 var2 = class526.field7723[var1];
                boolean var3 = false;
                if (var2.field213 == null) {
                    --var2.field201;
                    if (~var2.field201 > ~(var2.field209 != 2 ? -10 : -1500)) {
                        var3 = true;
                    } else {
                        if (~var2.field209 == -2 && var2.field212 == null) {
                            var2.field212 = class363.method2044(class266.field3645, var2.field216, 0);
                            if (var2.field212 == null) {
                                continue;
                            }
                            var2.field201 += var2.field212.method2046();
                        } else if (~var2.field209 == -3 && (var2.field204 == null || var2.field198 == null)) {
                            if (var2.field204 == null) {
                                var2.field204 = class355.method1975(class63.field872, var2.field216);
                            }
                            if (var2.field204 == null) {
                                continue;
                            }
                            if (var2.field198 == null) {
                                var2.field198 = var2.field204.method1965(new int[] { 22050 });
                                if (var2.field198 == null) {
                                    continue;
                                }
                            }
                        }
                        if (~var2.field201 > -1) {
                            int var5;
                            if (~var2.field207 != -1) {
                                int var4 = 3 & var2.field207 >> 24;
                                if (class75.field1089.field464 != var4) {
                                    var5 = 0;
                                } else {
                                    int var6 = 32640 & var2.field207 << 7;
                                    int var7 = var2.field207 >> 16 & 255;
                                    int var8 = (var7 << 7) - (-64 - -class75.field1089.field466);
                                    if (~var8 > -1) {
                                        var8 = -var8;
                                    }
                                    int var9 = (65471 & var2.field207) >> 8;
                                    int var10 = (var9 << 7) - -64 + -class75.field1089.field461;
                                    if (var10 < 0) {
                                        var10 = -var10;
                                    }
                                    int var11 = var8 + var10 - 128;
                                    if (~var11 < ~var6) {
                                        var2.field201 = -99999;
                                        continue;
                                    }
                                    if (~var11 > -1) {
                                        var11 = 0;
                                    }
                                    var5 = (-var11 + var6) * var2.field200 * class437.field6374.field4273 / var6 >> 8;
                                }
                            } else {
                                var5 = class437.field6374.field4262 * var2.field200 >> 8;
                            }
                            if (~var5 < -1) {
                                class286 var12 = null;
                                if (~var2.field209 != -2) {
                                    if (~var2.field209 == -3) {
                                        var12 = var2.field198;
                                    }
                                } else {
                                    var12 = var2.field212.method2047().method1635(class184.field2579);
                                }
                                class280 var13 = var2.field213 = class280.method1587(var12, 100, var5);
                                var13.method1575(var2.field197 + -1);
                                class189.field2623.method939(var13);
                            }
                        }
                    }
                } else if (!var2.field213.method2944((byte) 119)) {
                    var3 = true;
                }
                if (var3) {
                    --class292.field3915;
                    for (int var14 = var1; var14 < class292.field3915; ++var14) {
                        class526.field7723[var14] = class526.field7723[var14 + 1];
                    }
                    --var1;
                }
            }
            ++field4224;
            if (class208.field2948 && !class105.method686(49)) {
                if (class437.field6374.field4252 != 0 && ~class444.field6455 != 0) {
                    class370.method2140(false, false, class252.field3511, 0, class444.field6455, class437.field6374.field4252);
                }
                class208.field2948 = false;
            } else if (~class437.field6374.field4252 != -1 && class444.field6455 != -1 && !class105.method686(84)) {
                ++class437.field6385;
                class356.method1978((byte) 46, class367.field5156);
                class244.field3395.method2074(false, class444.field6455);
                class444.field6455 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!qv", name = "g", descriptor = "(I)V", line = 560)
    public static void method1750(int arg0) {
        field4227 = null;
        if (arg0 != 6976) {
            method1744(false);
        }
        field4226 = null;
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(ZZB)V", line = 572)
    public final void method1751(boolean arg0, boolean arg1, byte arg2) {
        if (arg2 > 48) {
            if (super.field2613 == 3553) {
                super.field2615.method2412((byte) 4, this);
                OpenGL.glTexParameteri(super.field2613, 10242, !arg0 ? 33071 : 10497);
                OpenGL.glTexParameteri(super.field2613, 10243, arg1 ? 10497 : 33071);
            }
            ++field4215;
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(IIIIIII)V", line = 589)
    public final void method1752(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field4229;
        if (arg3 == 900) {
            int var8 = super.field2615.field5680 - arg4 + -arg6;
            super.field2615.method2412((byte) 4, this);
            OpenGL.glCopyTexSubImage2D(super.field2613, 0, arg0, this.field4220 - arg6 - arg1, arg2, var8, arg5, arg6);
            OpenGL.glFlush();
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(I)V", line = 604)
    public final void method43(int arg0) {
        ++field4223;
        OpenGL.glFramebufferTexture2DEXT(this.field4217, this.field4214, super.field2613, 0, 0);
        int var2 = 125 % ((arg0 - -72) / 38);
        this.field4217 = -1;
        this.field4214 = -1;
    }

    @OriginalMember(owner = "client!qv", name = "e", descriptor = "(B)V", line = 649)
    public static final void method1753(byte arg0) {
        class473.field6909 = -1;
        int var1 = 111 / ((54 - arg0) / 54);
        class285.field3824 = -1;
        class398.field5544 = -1;
        class166.field2346 = 0;
        ++field4225;
    }
}
