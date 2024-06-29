import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uha")
public class class254 extends class192 {

    @OriginalMember(owner = "client!uha", name = "x", descriptor = "[B")
    public byte[] field3877;

    @OriginalMember(owner = "client!uha", name = "J", descriptor = "[Ljava/lang/String;")
    private static final String[] field3880 = new String[] { method2155(method2154(".kb\u007fTs")), method2155(method2154(".kb\u007fSs")), method2155(method2154(" --\u007fh")), method2155(method2154("5vo=")), method2155(method2154(".kb\u007f)2mj%+s")), method2155(method2154(".kb\u007fPs")), method2155(method2154(".kb\u007fQs")), method2155(method2154(".kb\u007fWs")), method2155(method2154(".kb\u007fVs")) };

    @OriginalMember(owner = "client!uha", name = "H", descriptor = "[I")
    public static int[] field3879 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!uha", name = "C", descriptor = "I")
    public int field3868;

    @OriginalMember(owner = "client!uha", name = "A", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!uha", name = "D", descriptor = "I")
    public static int field3870;

    @OriginalMember(owner = "client!uha", name = "y", descriptor = "I")
    public static int field3871;

    @OriginalMember(owner = "client!uha", name = "B", descriptor = "I")
    public int field3872;

    @OriginalMember(owner = "client!uha", name = "z", descriptor = "I")
    public static int field3873;

    @OriginalMember(owner = "client!uha", name = "G", descriptor = "I")
    public static int field3875;

    @OriginalMember(owner = "client!uha", name = "F", descriptor = "I")
    public int field3876;

    @OriginalMember(owner = "client!uha", name = "I", descriptor = "I")
    public int field3878;

    @OriginalMember(owner = "client!uha", name = "E", descriptor = "Leca;")
    public static class793 field3874;

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(IIIII)V")
    public final void method2148(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            if (arg2 != -1959768272) {
                method2153((byte) -25);
            }
            this.field3872 = arg4 - arg3;
            field3873++;
            this.field3868 = arg3;
            this.field3876 = arg0;
            this.field3878 = arg1 - arg0;
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field3880[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(BII)Z")
    public final boolean method2149(byte arg0, int arg1, int arg2) {
        try {
            if (arg0 != -109) {
                this.method2148(22, -95, 32, 30, -109);
            }
            field3871++;
            return arg1 * arg2 <= this.field3877.length;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field3880[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!uha", name = "c", descriptor = "(B)V")
    public final void method2150(byte arg0) {
        try {
            field3870++;
            int var2 = -1;
            int var3 = this.field3877.length - 8;
            if (arg0 == 31) {
                while (var2 < var3) {
                    var2++;
                    this.field3877[var2] = 0;
                    var2++;
                    this.field3877[var2] = 0;
                    var2++;
                    this.field3877[var2] = 0;
                    var2++;
                    this.field3877[var2] = 0;
                    var2++;
                    this.field3877[var2] = 0;
                    var2++;
                    this.field3877[var2] = 0;
                    var2++;
                    this.field3877[var2] = 0;
                    var2++;
                    this.field3877[var2] = 0;
                }
                while (var2 < this.field3877.length - 1) {
                    var2++;
                    this.field3877[var2] = 0;
                }
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field3880[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(IIIIIII)V")
    public final void method2151(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            field3869++;
            int var8 = 0;
            if (arg3 != arg4) {
                var8 = (arg2 - arg5 << 16) / (arg3 - arg4);
            }
            int var9 = arg0;
            if (arg1 != arg3) {
                var9 = (arg6 - arg2 << 16) / (arg1 - arg3);
            }
            int var10 = 0;
            if (arg1 != arg4) {
                var10 = (arg5 - arg6 << 16) / (arg4 - arg1);
            }
            if (arg3 >= arg4 && arg1 >= arg4) {
                if (arg1 <= arg3) {
                    arg2 = arg5 <<= 0x10;
                    if (arg4 < 0) {
                        arg5 -= arg4 * var8;
                        arg2 -= arg4 * var10;
                        arg4 = 0;
                    }
                    arg6 <<= 0x10;
                    if (arg1 < 0) {
                        arg6 -= arg1 * var9;
                        arg1 = 0;
                    }
                    if ((arg1 == arg4 || var10 >= var8) && (arg1 != arg4 || var8 >= var9)) {
                        arg3 -= arg1;
                        arg1 -= arg4;
                        arg4 = this.field3878 * arg4;
                        while (true) {
                            arg1--;
                            if (arg1 < 0) {
                                while (true) {
                                    arg3--;
                                    if (arg3 < 0) {
                                        return;
                                    }
                                    class220.method1948(arg5 >> 16, 0, arg4, arg6 >> 16, (byte) -108, this.field3877);
                                    arg5 += var8;
                                    arg6 += var9;
                                    arg4 += this.field3878;
                                }
                            }
                            class220.method1948(arg5 >> 16, 0, arg4, arg2 >> 16, (byte) -128, this.field3877);
                            arg4 += this.field3878;
                            arg2 += var10;
                            arg5 += var8;
                        }
                    } else {
                        arg3 -= arg1;
                        arg1 -= arg4;
                        arg4 = this.field3878 * arg4;
                        while (true) {
                            arg1--;
                            if (arg1 < 0) {
                                while (true) {
                                    arg3--;
                                    if (arg3 < 0) {
                                        return;
                                    }
                                    class220.method1948(arg6 >> 16, 0, arg4, arg5 >> 16, (byte) -127, this.field3877);
                                    arg5 += var8;
                                    arg6 += var9;
                                    arg4 += this.field3878;
                                }
                            }
                            class220.method1948(arg2 >> 16, 0, arg4, arg5 >> 16, (byte) -113, this.field3877);
                            arg5 += var8;
                            arg4 += this.field3878;
                            arg2 += var10;
                        }
                    }
                } else {
                    arg6 = arg5 <<= 0x10;
                    arg2 <<= 0x10;
                    if (arg4 < 0) {
                        arg6 -= arg4 * var10;
                        arg5 -= arg4 * var8;
                        arg4 = 0;
                    }
                    if (arg3 < 0) {
                        arg2 -= arg3 * var9;
                        arg3 = 0;
                    }
                    if (arg3 != arg4 && var8 > var10 || arg3 == arg4 && var9 < var10) {
                        arg1 -= arg3;
                        arg3 -= arg4;
                        arg4 = this.field3878 * arg4;
                        while (true) {
                            arg3--;
                            if (arg3 < 0) {
                                while (true) {
                                    arg1--;
                                    if (arg1 < 0) {
                                        return;
                                    }
                                    class220.method1948(arg6 >> 16, 0, arg4, arg2 >> 16, (byte) -120, this.field3877);
                                    arg6 += var10;
                                    arg4 += this.field3878;
                                    arg2 += var9;
                                }
                            }
                            class220.method1948(arg6 >> 16, 0, arg4, arg5 >> 16, (byte) -96, this.field3877);
                            arg4 += this.field3878;
                            arg6 += var10;
                            arg5 += var8;
                        }
                    } else {
                        arg1 -= arg3;
                        arg3 -= arg4;
                        arg4 = this.field3878 * arg4;
                        while (true) {
                            arg3--;
                            if (arg3 < 0) {
                                while (true) {
                                    arg1--;
                                    if (arg1 < 0) {
                                        return;
                                    }
                                    class220.method1948(arg2 >> 16, 0, arg4, arg6 >> 16, (byte) -124, this.field3877);
                                    arg2 += var9;
                                    arg4 += this.field3878;
                                    arg6 += var10;
                                }
                            }
                            class220.method1948(arg5 >> 16, 0, arg4, arg6 >> 16, (byte) -96, this.field3877);
                            arg5 += var8;
                            arg6 += var10;
                            arg4 += this.field3878;
                        }
                    }
                }
            } else if (arg1 >= arg3) {
                if (arg4 > arg1) {
                    arg5 = arg2 <<= 0x10;
                    if (arg3 < 0) {
                        arg2 -= arg3 * var9;
                        arg5 -= arg3 * var8;
                        arg3 = 0;
                    }
                    arg6 <<= 0x10;
                    if (arg1 < 0) {
                        arg6 -= arg1 * var10;
                        arg1 = 0;
                    }
                    if (arg1 != arg3 && var8 < var9 || arg1 == arg3 && var8 > var10) {
                        arg4 -= arg1;
                        arg1 -= arg3;
                        arg3 = this.field3878 * arg3;
                        while (true) {
                            arg1--;
                            if (arg1 < 0) {
                                while (true) {
                                    arg4--;
                                    if (arg4 < 0) {
                                        return;
                                    }
                                    class220.method1948(arg5 >> 16, 0, arg3, arg6 >> 16, (byte) -121, this.field3877);
                                    arg6 += var10;
                                    arg3 += this.field3878;
                                    arg5 += var8;
                                }
                            }
                            class220.method1948(arg5 >> 16, 0, arg3, arg2 >> 16, (byte) -111, this.field3877);
                            arg3 += this.field3878;
                            arg2 += var9;
                            arg5 += var8;
                        }
                    } else {
                        arg4 -= arg1;
                        arg1 -= arg3;
                        arg3 = this.field3878 * arg3;
                        while (true) {
                            arg1--;
                            if (arg1 < 0) {
                                while (true) {
                                    arg4--;
                                    if (arg4 < 0) {
                                        return;
                                    }
                                    class220.method1948(arg6 >> 16, 0, arg3, arg5 >> 16, (byte) -98, this.field3877);
                                    arg3 += this.field3878;
                                    arg5 += var8;
                                    arg6 += var10;
                                }
                            }
                            class220.method1948(arg2 >> 16, 0, arg3, arg5 >> 16, (byte) -111, this.field3877);
                            arg5 += var8;
                            arg2 += var9;
                            arg3 += this.field3878;
                        }
                    }
                } else {
                    arg6 = arg2 <<= 0x10;
                    if (arg3 < 0) {
                        arg2 -= arg3 * var9;
                        arg6 -= arg3 * var8;
                        arg3 = 0;
                    }
                    arg5 <<= 0x10;
                    if (arg4 < 0) {
                        arg5 -= arg4 * var10;
                        arg4 = 0;
                    }
                    if (var9 <= var8) {
                        arg1 -= arg4;
                        arg4 -= arg3;
                        arg3 = this.field3878 * arg3;
                        while (true) {
                            arg4--;
                            if (arg4 < 0) {
                                while (true) {
                                    arg1--;
                                    if (arg1 < 0) {
                                        return;
                                    }
                                    class220.method1948(arg2 >> 16, 0, arg3, arg5 >> 16, (byte) -98, this.field3877);
                                    arg5 += var10;
                                    arg3 += this.field3878;
                                    arg2 += var9;
                                }
                            }
                            class220.method1948(arg2 >> 16, 0, arg3, arg6 >> 16, (byte) -110, this.field3877);
                            arg3 += this.field3878;
                            arg6 += var8;
                            arg2 += var9;
                        }
                    } else {
                        arg1 -= arg4;
                        arg4 -= arg3;
                        arg3 = this.field3878 * arg3;
                        while (true) {
                            arg4--;
                            if (arg4 < 0) {
                                while (true) {
                                    arg1--;
                                    if (arg1 < 0) {
                                        return;
                                    }
                                    class220.method1948(arg5 >> 16, 0, arg3, arg2 >> 16, (byte) -95, this.field3877);
                                    arg5 += var10;
                                    arg2 += var9;
                                    arg3 += this.field3878;
                                }
                            }
                            class220.method1948(arg6 >> 16, 0, arg3, arg2 >> 16, (byte) -117, this.field3877);
                            arg6 += var8;
                            arg2 += var9;
                            arg3 += this.field3878;
                        }
                    }
                }
            } else if (arg4 < arg3) {
                arg2 = arg6 <<= 0x10;
                if (arg1 < 0) {
                    arg2 -= arg1 * var9;
                    arg6 -= arg1 * var10;
                    arg1 = 0;
                }
                arg5 <<= 0x10;
                if (arg4 < 0) {
                    arg5 -= arg4 * var8;
                    arg4 = 0;
                }
                if (var10 > var9) {
                    arg3 -= arg4;
                    arg4 -= arg1;
                    arg1 = this.field3878 * arg1;
                    while (true) {
                        arg4--;
                        if (arg4 < 0) {
                            while (true) {
                                arg3--;
                                if (arg3 < 0) {
                                    return;
                                }
                                class220.method1948(arg2 >> 16, 0, arg1, arg5 >> 16, (byte) -103, this.field3877);
                                arg1 += this.field3878;
                                arg5 += var8;
                                arg2 += var9;
                            }
                        }
                        class220.method1948(arg2 >> 16, 0, arg1, arg6 >> 16, (byte) -115, this.field3877);
                        arg1 += this.field3878;
                        arg2 += var9;
                        arg6 += var10;
                    }
                } else {
                    arg3 -= arg4;
                    arg4 -= arg1;
                    arg1 = this.field3878 * arg1;
                    while (true) {
                        arg4--;
                        if (arg4 < 0) {
                            while (true) {
                                arg3--;
                                if (arg3 < 0) {
                                    return;
                                }
                                class220.method1948(arg5 >> 16, 0, arg1, arg2 >> 16, (byte) -100, this.field3877);
                                arg2 += var9;
                                arg1 += this.field3878;
                                arg5 += var8;
                            }
                        }
                        class220.method1948(arg6 >> 16, 0, arg1, arg2 >> 16, (byte) -105, this.field3877);
                        arg1 += this.field3878;
                        arg2 += var9;
                        arg6 += var10;
                    }
                }
            } else {
                arg5 = arg6 <<= 0x10;
                arg2 <<= 0x10;
                if (arg1 < 0) {
                    arg6 -= arg1 * var10;
                    arg5 -= arg1 * var9;
                    arg1 = 0;
                }
                if (arg3 < 0) {
                    arg2 -= arg3 * var8;
                    arg3 = 0;
                }
                if (var10 > var9) {
                    arg4 -= arg3;
                    arg3 -= arg1;
                    arg1 = this.field3878 * arg1;
                    while (true) {
                        arg3--;
                        if (arg3 < 0) {
                            while (true) {
                                arg4--;
                                if (arg4 < 0) {
                                    return;
                                }
                                class220.method1948(arg2 >> 16, 0, arg1, arg6 >> 16, (byte) -105, this.field3877);
                                arg2 += var8;
                                arg6 += var10;
                                arg1 += this.field3878;
                            }
                        }
                        class220.method1948(arg5 >> 16, 0, arg1, arg6 >> 16, (byte) -128, this.field3877);
                        arg6 += var10;
                        arg5 += var9;
                        arg1 += this.field3878;
                    }
                } else {
                    arg4 -= arg3;
                    arg3 -= arg1;
                    arg1 = this.field3878 * arg1;
                    while (true) {
                        arg3--;
                        if (arg3 < 0) {
                            while (true) {
                                arg4--;
                                if (arg4 < 0) {
                                    return;
                                }
                                class220.method1948(arg6 >> 16, 0, arg1, arg2 >> 16, (byte) -99, this.field3877);
                                arg1 += this.field3878;
                                arg2 += var8;
                                arg6 += var10;
                            }
                        }
                        class220.method1948(arg6 >> 16, 0, arg1, arg5 >> 16, (byte) -126, this.field3877);
                        arg1 += this.field3878;
                        arg6 += var10;
                        arg5 += var9;
                    }
                }
            }
        } catch (RuntimeException var12) {
            throw class590.method4333(var12, field3880[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(IIB)I")
    public static final int method2152(int arg0, int arg1, byte arg2) {
        try {
            field3875++;
            if (arg0 == 1 || arg0 == 3) {
                return class15.field171[arg1 & 0x3];
            } else {
                int var3 = 76 / ((arg2 - 79) / 41);
                return class650.field9324[arg1 & 0x3];
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field3880[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!uha", name = "b", descriptor = "(B)V")
    public static void method2153(byte arg0) {
        try {
            if (arg0 != 0) {
                field3874 = null;
            }
            field3874 = null;
            field3879 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field3880[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uha", name = "<init>", descriptor = "(Lgca;II)V")
    public class254(class261 arg0, int arg1, int arg2) {
        try {
            this.field3877 = new byte[arg1 * arg2];
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field3880[4] + (arg0 == null ? field3880[3] : field3880[2]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!uha", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2154(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x15);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!uha", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2155(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 91;
                    break;
                case 1:
                    var10005 = 3;
                    break;
                case 2:
                    var10005 = 3;
                    break;
                case 3:
                    var10005 = 81;
                    break;
                default:
                    var10005 = 21;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
