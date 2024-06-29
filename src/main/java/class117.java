import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class class117 extends class469 {

    @OriginalMember(owner = "client!bp", name = "D", descriptor = "I")
    private int field1484 = -1;

    @OriginalMember(owner = "client!bp", name = "r", descriptor = "I")
    private int field1490 = -1;

    @OriginalMember(owner = "client!bp", name = "w", descriptor = "I")
    public int field1482;

    @OriginalMember(owner = "client!bp", name = "C", descriptor = "I")
    public int field1485;

    @OriginalMember(owner = "client!bp", name = "E", descriptor = "[Ljava/lang/String;")
    private static final String[] field1494 = new String[] { method1071(method1070("\t\u0000A6^")), method1071(method1070("\u0010^AI\u000b")), method1071(method1070("\t\u0000A(^")), method1071(method1070("\u0005\u0005\u0003\u000b")), method1071(method1070("\t\u0000A[\u001f\u0005\u0019\u001bY^")), method1071(method1070("\t\u0000A+^")), method1071(method1070("\t\u0000A*^")), method1071(method1070("\t\u0000A7^")), method1071(method1070("\t\u0000A&^")), method1071(method1070("\t\u0000A)^")) };

    @OriginalMember(owner = "client!bp", name = "x", descriptor = "Lsb;")
    public static class261 field1481 = new class261(21, 8);

    @OriginalMember(owner = "client!bp", name = "z", descriptor = "I")
    public static int field1483;

    @OriginalMember(owner = "client!bp", name = "v", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client!bp", name = "A", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!bp", name = "s", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!bp", name = "B", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!bp", name = "u", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!bp", name = "t", descriptor = "I")
    public static int field1493;

    @OriginalMember(owner = "client!bp", name = "y", descriptor = "[[[I")
    public static int[][][] field1492;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(I[BIIIZIIBI)V")
    public final void method1064(int arg0, byte[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, byte arg8, int arg9) {
        try {
            if (arg9 == 0) {
                arg9 = arg4;
            }
            ++field1491;
            if (arg8 != 62) {
                this.method1064(-79, (byte[]) null, 103, 20, -3, true, 116, -128, (byte) 60, -102);
            }
            if (arg5) {
                int var11 = class507.method3875(arg3, arg8 + 52);
                int var12 = arg4 * var11;
                int var13 = arg9 * var11;
                byte[] var14 = new byte[arg7 * var12];
                for (int var15 = 0; ~arg7 < ~var15; ++var15) {
                    int var16 = var12 * var15;
                    int var17 = (-var15 + arg7 + -1) * var13 - -arg2;
                    for (int var18 = 0; var12 > var18; ++var18) {
                        var14[var16++] = arg1[var17++];
                    }
                }
                arg1 = var14;
            }
            super.field6859.method1618((byte) -111, this);
            OpenGL.glPixelStorei(3317, 1);
            if (~arg4 != ~arg9) {
                OpenGL.glPixelStorei(3314, arg9);
            }
            OpenGL.glTexSubImage2Dub(super.field6861, 0, arg0, arg6, arg4, arg7, arg3, 5121, arg1, arg2);
            if (arg4 != arg9) {
                OpenGL.glPixelStorei(3314, 0);
            }
            OpenGL.glPixelStorei(3317, 4);
        } catch (RuntimeException var20) {
            throw class665.method4799(var20, field1494[2] + arg0 + ',' + (arg1 != null ? field1494[1] : field1494[3]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(Lml;IIIII)V")
    public class117(class194 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        try {
            this.field1482 = arg5;
            this.field1485 = arg4;
            int var7 = -arg3 + -arg5 + super.field6859.field2746;
            super.field6859.method1618((byte) -84, this);
            OpenGL.glCopyTexImage2D(super.field6861, 0, super.field6870, arg2, var7, arg4, arg5, 0);
            this.method3600(-117, true);
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field1494[4] + (arg0 != null ? field1494[1] : field1494[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(ZBZ)V")
    public final void method1065(boolean arg0, byte arg1, boolean arg2) {
        try {
            ++field1486;
            if (arg1 < 105) {
                this.method1064(-46, (byte[]) null, 78, -101, 115, false, -115, 20, (byte) 24, 7);
            }
            if (~super.field6861 == -3554) {
                super.field6859.method1618((byte) -108, this);
                OpenGL.glTexParameteri(super.field6861, 10242, !arg0 ? 33071 : 10497);
                OpenGL.glTexParameteri(super.field6861, 10243, arg2 ? 10497 : 33071);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field1494[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(IBII)V")
    public final void method1066(int arg0, byte arg1, int arg2, int arg3) {
        try {
            OpenGL.glFramebufferTexture2DEXT(arg3, arg2, super.field6861, super.field6867, arg0);
            ++field1483;
            if (arg1 != -56) {
                this.method992(95);
            }
            this.field1484 = arg3;
            this.field1490 = arg2;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field1494[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(IIIIIBI)V")
    public final void method1067(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        try {
            ++field1489;
            int var8 = -arg3 + super.field6859.field2746 + -arg2;
            super.field6859.method1618((byte) 56, this);
            if (arg5 == 93) {
                OpenGL.glCopyTexSubImage2D(super.field6861, 0, arg6, -arg1 - arg3 + this.field1482, arg4, var8, arg0, arg3);
                OpenGL.glFlush();
            }
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field1494[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(Lml;IIIIZ[BIZ)V")
    public class117(class194 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        try {
            this.field1482 = arg4;
            this.field1485 = arg3;
            if (arg8) {
                byte[] var10 = new byte[arg6.length];
                for (int var11 = 0; ~arg4 < ~var11; ++var11) {
                    int var12 = arg3 * var11;
                    int var13 = (arg4 - (var11 + 1)) * arg3;
                    for (int var14 = 0; ~var14 > ~arg3; ++var14) {
                        var10[var12++] = arg6[var13++];
                    }
                }
                arg6 = var10;
            }
            super.field6859.method1618((byte) -112, this);
            OpenGL.glPixelStorei(3317, 1);
            if (arg5 && super.field6861 != 34037) {
                class582.method4313(arg3, arg2, 5121, arg6, arg7, arg1, arg4);
                this.method3603(13486, true);
            } else {
                OpenGL.glTexImage2Dub(super.field6861, 0, super.field6870, this.field1485, this.field1482, 0, arg7, 5121, arg6, 0);
                this.method3603(13486, false);
            }
            OpenGL.glPixelStorei(3317, 4);
            this.method3600(124, true);
        } catch (RuntimeException var16) {
            throw class665.method4799(var16, field1494[4] + (arg0 != null ? field1494[1] : field1494[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field1494[1] : field1494[3]) + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(Lml;IIIIZ[IIIZ)V")
    public class117(class194 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, int arg7, int arg8, boolean arg9) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        try {
            this.field1482 = arg4;
            this.field1485 = arg3;
            if (arg9) {
                int[] var11 = new int[arg6.length];
                for (int var12 = 0; arg4 > var12; ++var12) {
                    int var13 = arg3 * var12;
                    int var14 = (-var12 + -1 + arg4) * arg3;
                    for (int var15 = 0; ~arg3 < ~var15; ++var15) {
                        var11[var13++] = arg6[var14++];
                    }
                }
                arg6 = var11;
            }
            super.field6859.method1618((byte) 27, this);
            if (super.field6861 != 34037 && arg5 && ~arg7 == -1 && ~arg8 == -1) {
                class219.method1850(arg6, super.field6861, this.field1485, 32993, super.field6870, super.field6859.field2824, 123, this.field1482);
                this.method3603(13486, true);
            } else {
                OpenGL.glPixelStorei(3314, arg7);
                OpenGL.glTexImage2Di(super.field6861, 0, super.field6870, this.field1485, this.field1482, 0, 32993, super.field6859.field2824, arg6, arg8 * 4);
                OpenGL.glPixelStorei(3314, 0);
                this.method3603(13486, false);
            }
            this.method3600(-87, true);
        } catch (RuntimeException var17) {
            throw class665.method4799(var17, field1494[4] + (arg0 != null ? field1494[1] : field1494[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field1494[1] : field1494[3]) + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(Lml;IIII)V")
    public class117(class194 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        try {
            this.field1485 = arg3;
            this.field1482 = arg4;
            super.field6859.method1618((byte) -108, this);
            OpenGL.glTexImage2Dub(super.field6861, 0, super.field6870, arg3, arg4, 0, class393.method3078(-22, super.field6870), 5121, (byte[]) null, 0);
            this.method3600(-79, true);
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field1494[4] + (arg0 != null ? field1494[1] : field1494[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(Lml;IIIIZ[FI)V")
    public class117(class194 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        try {
            this.field1482 = arg4;
            this.field1485 = arg3;
            super.field6859.method1618((byte) 0, this);
            if (arg5 && ~super.field6861 != -34038) {
                class718.method5210(arg1, arg4, arg2, arg3, arg6, arg7, (byte) -128);
                this.method3603(13486, true);
            } else {
                OpenGL.glTexImage2Df(super.field6861, 0, super.field6870, this.field1485, this.field1482, 0, arg7, 5126, arg6, 0);
                this.method3603(13486, false);
            }
            this.method3600(-66, true);
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field1494[4] + (arg0 != null ? field1494[1] : field1494[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field1494[1] : field1494[3]) + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(III[IZIIII)V")
    public final void method1068(int arg0, int arg1, int arg2, int[] arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8) {
        try {
            ++field1488;
            int var10 = -68 % ((arg5 - 25) / 46);
            if (arg1 == 0) {
                arg1 = arg7;
            }
            if (arg4) {
                int[] var11 = new int[arg0 * arg7];
                for (int var12 = 0; ~arg0 < ~var12; ++var12) {
                    int var13 = arg7 * var12;
                    int var14 = (-var12 + -1 + arg0) * arg1 - -arg8;
                    for (int var15 = 0; arg7 > var15; ++var15) {
                        var11[var13++] = arg3[var14++];
                    }
                }
                arg3 = var11;
            }
            super.field6859.method1618((byte) 12, this);
            if (arg1 != arg7) {
                OpenGL.glPixelStorei(3314, arg1);
            }
            OpenGL.glTexSubImage2Di(super.field6861, 0, arg6, -arg0 + this.field1482 + -arg2, arg7, arg0, 32993, super.field6859.field2824, arg3, arg8);
            if (arg1 != arg7) {
                OpenGL.glPixelStorei(3314, 0);
            }
        } catch (RuntimeException var17) {
            throw class665.method4799(var17, field1494[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field1494[1] : field1494[3]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "c", descriptor = "(B)V")
    public static void method1069(byte arg0) {
        try {
            field1492 = null;
            if (arg0 > -78) {
                field1481 = null;
            }
            field1481 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field1494[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(I)V")
    public final void method992(int arg0) {
        try {
            ++field1487;
            OpenGL.glFramebufferTexture2DEXT(this.field1484, this.field1490, super.field6861, 0, 0);
            this.field1490 = -1;
            this.field1484 = arg0;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1494[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1070(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 118);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!bp", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1071(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 107;
                    break;
                case 1:
                    var10005 = 112;
                    break;
                case 2:
                    var10005 = 111;
                    break;
                case 3:
                    var10005 = 103;
                    break;
                default:
                    var10005 = 118;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
