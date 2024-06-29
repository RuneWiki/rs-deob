import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class114 extends class747 implements class200 {

    @OriginalMember(owner = "client!bm", name = "F", descriptor = "I")
    private int field1959;

    @OriginalMember(owner = "client!bm", name = "x", descriptor = "I")
    private int field1951;

    @OriginalMember(owner = "client!bm", name = "y", descriptor = "Ljava/lang/String;")
    public static String field1952 = null;

    @OriginalMember(owner = "client!bm", name = "z", descriptor = "I")
    public static int field1953;

    @OriginalMember(owner = "client!bm", name = "A", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!bm", name = "B", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!bm", name = "C", descriptor = "I")
    public static int field1956;

    @OriginalMember(owner = "client!bm", name = "D", descriptor = "I")
    public static int field1957;

    @OriginalMember(owner = "client!bm", name = "E", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!bm", name = "G", descriptor = "I")
    public static int field1960;

    @OriginalMember(owner = "client!bm", name = "H", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!bm", name = "I", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!bm", name = "J", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!bm", name = "K", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!bm", name = "L", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(BF)F", line = 3)
    public final float method1002(byte arg0, float arg1) {
        ++field1953;
        if (arg0 >= -24) {
            method1012(false);
        }
        return arg1 / (float) this.field1951;
    }

    @OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(Lbga;IIZ[III)V", line = 14)
    public class114(class358 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, 3553, class746.field10332, class523.field7249, arg1 * arg2, arg3);
        this.field1959 = arg1;
        this.field1951 = arg2;
        super.field10335.method4097((byte) 79, this);
        if (arg3 && arg6 == 0 && arg5 == 0) {
            this.method4169(arg1, arg2, arg4, super.field10346, 255);
        } else {
            OpenGL.glPixelStorei(3314, arg6);
            OpenGL.glTexImage2Di(super.field10346, 0, 6408, this.field1959, this.field1951, 0, 32993, super.field10335.field5169, arg4, arg5 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(BIILat;)V", line = 34)
    public static final void method1003(byte arg0, int arg1, int arg2, class378 arg3) {
        ++field1957;
        if (~arg3.field5493 != -1) {
            if (~arg3.field5493 == -2) {
                arg3.field5476 = (-arg3.field5385 + arg1) / 2 + arg3.field5464;
            } else if (~arg3.field5493 != -3) {
                if (~arg3.field5493 != -4) {
                    if (arg3.field5493 != 4) {
                        arg3.field5476 = -arg3.field5385 + arg1 + -(arg3.field5464 * arg1 >> 14);
                    } else {
                        arg3.field5476 = (-arg3.field5385 + arg1) / 2 - -(arg3.field5464 * arg1 >> 14);
                    }
                } else {
                    arg3.field5476 = arg3.field5464 * arg1 >> 14;
                }
            } else {
                arg3.field5476 = -arg3.field5385 + arg1 + -arg3.field5464;
            }
        } else {
            arg3.field5476 = arg3.field5464;
        }
        int var4 = 83 % ((arg0 - 50) / 50);
        if (arg3.field5357 != 0) {
            if (arg3.field5357 == 1) {
                arg3.field5426 = (-arg3.field5465 + arg2) / 2 - -arg3.field5415;
            } else if (arg3.field5357 == 2) {
                arg3.field5426 = arg2 - arg3.field5465 - arg3.field5415;
            } else if (~arg3.field5357 != -4) {
                if (~arg3.field5357 != -5) {
                    arg3.field5426 = -arg3.field5465 + arg2 + -(arg3.field5415 * arg2 >> 14);
                } else {
                    arg3.field5426 = (arg3.field5415 * arg2 >> 14) + (-arg3.field5465 + arg2) / 2;
                }
            } else {
                arg3.field5426 = arg3.field5415 * arg2 >> 14;
            }
        } else {
            arg3.field5426 = arg3.field5415;
        }
        if (class319.field4396) {
            if (~client.method1975(arg3).field4628 != -1 || arg3.field5450 == 0) {
                if (arg3.field5426 < 0) {
                    arg3.field5426 = 0;
                } else if (~(arg3.field5465 + arg3.field5426) < ~arg2) {
                    arg3.field5426 = arg2 - arg3.field5465;
                }
                if (arg3.field5476 >= 0) {
                    if (arg1 < arg3.field5476 - -arg3.field5385) {
                        arg3.field5476 = -arg3.field5385 + arg1;
                        return;
                    }
                } else {
                    arg3.field5476 = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(Lbga;Lwq;IIZ[BII)V", line = 104)
    public class114(class358 arg0, class169 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class523.field7249, arg2 * arg3, arg4);
        this.field1959 = arg2;
        this.field1951 = arg3;
        super.field10335.method4097((byte) -102, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg4 && arg7 == 0 && arg6 == 0) {
            this.method4166(7365, arg2, arg5, arg3, super.field10346);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Dub(super.field10346, 0, this.method4164(109), arg2, arg3, 0, class175.method1310(121, super.field10337), 5121, arg5, arg6);
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(FI)F", line = 128)
    public final float method1004(float arg0, int arg1) {
        ++field1958;
        if (arg1 <= 69) {
            this.method1010(84);
        }
        return arg0 / (float) this.field1959;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IB[FLwq;IIIII)V", line = 140)
    public final void method1005(int arg0, byte arg1, float[] arg2, class169 arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = 108 / ((-45 - arg1) / 49);
        ++field1961;
        super.field10335.method4097((byte) -106, this);
        OpenGL.glPixelStorei(3314, arg0);
        OpenGL.glTexSubImage2Df(super.field10346, 0, arg6, arg4, arg7, arg8, class175.method1310(106, arg3), 5121, arg2, arg5);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(B)V", line = 153)
    public static final void method1006(byte arg0) {
        ++field1964;
        int var1 = class113.field1950 * 512 + 256;
        int var2 = class197.field2897 * 512 + 256;
        int var3 = class197.method1403(var1, class382.field5551, 11219, var2) + -class500.field6984;
        if (class429.field6154 >= 100) {
            class275.field3870 = class197.field2897 * 512 + 256;
            class108.field1896 = class113.field1950 * 512 + 256;
            class458.field6444 = class197.method1403(class108.field1896, class382.field5551, 11219, class275.field3870) + -class500.field6984;
        } else {
            if (class108.field1896 < var1) {
                class108.field1896 += (-class108.field1896 + var1) * class429.field6154 / 1000 + class314.field4348;
                if (~class108.field1896 < ~var1) {
                    class108.field1896 = var1;
                }
            }
            if (~var1 > ~class108.field1896) {
                class108.field1896 -= class314.field4348 - -((-var1 + class108.field1896) * class429.field6154 / 1000);
                if (~var1 < ~class108.field1896) {
                    class108.field1896 = var1;
                }
            }
            if (~var3 < ~class458.field6444) {
                class458.field6444 += (-class458.field6444 + var3) * class429.field6154 / 1000 + class314.field4348;
                if (var3 < class458.field6444) {
                    class458.field6444 = var3;
                }
            }
            if (~var2 < ~class275.field3870) {
                class275.field3870 += class314.field4348 - -((-class275.field3870 + var2) * class429.field6154 / 1000);
                if (class275.field3870 > var2) {
                    class275.field3870 = var2;
                }
            }
            if (~class458.field6444 < ~var3) {
                class458.field6444 -= (class458.field6444 - var3) * class429.field6154 / 1000 + class314.field4348;
                if (~class458.field6444 > ~var3) {
                    class458.field6444 = var3;
                }
            }
            if (class275.field3870 > var2) {
                class275.field3870 -= (class275.field3870 - var2) * class429.field6154 / 1000 + class314.field4348;
                if (var2 > class275.field3870) {
                    class275.field3870 = var2;
                }
            }
        }
        int var4 = class276.field3874 * 512 + 256;
        int var5 = class547.field7541 * 512 + 256;
        int var6 = class197.method1403(var5, class382.field5551, 11219, var4) - class343.field4814;
        int var7 = -class108.field1896 + var5;
        int var8 = -class458.field6444 + var6;
        int var9 = -class275.field3870 + var4;
        int var10 = (int) Math.sqrt((double) (var7 * var7 - -(var9 * var9)));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 2607.5945876176133D) & 16383;
        if (arg0 < 126) {
            field1952 = null;
        }
        if (var11 < 1024) {
            var11 = 1024;
        }
        int var12 = 16383 & (int) (-2607.5945876176133D * Math.atan2((double) var7, (double) var9));
        if (var11 > 3072) {
            var11 = 3072;
        }
        if (~class634.field8721 > ~var11) {
            class634.field8721 += (var11 - class634.field8721 >> 3) * class640.field8803 / 1000 + class641.field8817 << 3;
            if (~class634.field8721 < ~var11) {
                class634.field8721 = var11;
            }
        }
        if (~var11 > ~class634.field8721) {
            class634.field8721 -= (-var11 + class634.field8721 >> 3) * class640.field8803 / 1000 + class641.field8817 << 3;
            if (~var11 < ~class634.field8721) {
                class634.field8721 = var11;
            }
        }
        int var13 = -class600.field8231 + var12;
        if (var13 > 8192) {
            var13 -= 16384;
        }
        if (var13 < -8192) {
            var13 += 16384;
        }
        int var14 = var13 >> 3;
        if (var14 > 0) {
            class600.field8231 += class640.field8803 * var14 / 1000 + class641.field8817 << 3;
            class600.field8231 &= 16383;
        }
        if (~var14 > -1) {
            class600.field8231 -= class641.field8817 - -(-var14 * class640.field8803 / 1000) << 3;
            class600.field8231 &= 16383;
        }
        int var15 = var12 - class600.field8231;
        if (~var15 < -8193) {
            var15 -= 16384;
        }
        if (var15 < -8192) {
            var15 += 16384;
        }
        class546.field7523 = 0;
        if (var15 < 0 && var14 > 0 || var15 > 0 && ~var14 > -1) {
            class600.field8231 = var12;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIBIIII[BLwq;)V", line = 313)
    public final void method1007(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7, class169 arg8) {
        ++field1955;
        super.field10335.method4097((byte) -24, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg3);
        OpenGL.glTexSubImage2Dub(super.field10346, 0, arg6, arg0, arg5, arg4, class175.method1310(103, arg8), 5121, arg7, arg1);
        if (arg2 >= -4) {
            this.field1959 = 33;
        }
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(I[IIIIBI)V", line = 333)
    public final void method1008(int arg0, int[] arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        ++field1960;
        int[] var8 = new int[this.field1959 * this.field1951];
        super.field10335.method4097((byte) -32, this);
        OpenGL.glGetTexImagei(super.field10346, 0, 32993, 5121, var8, 0);
        if (arg5 == 112) {
            for (int var9 = 0; ~var9 > ~arg4; ++var9) {
                class363.method2320(var8, (-var9 + arg4 + arg3 + -1) * this.field1959, arg1, arg2 * var9 + arg6, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Z)I", line = 356)
    public final int method1009(boolean arg0) {
        ++field1954;
        return arg0 ? -121 : this.field1959;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)I", line = 368)
    public final int method1010(int arg0) {
        ++field1956;
        int var2 = -48 / ((55 - arg0) / 63);
        return this.field1951;
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(I)Z", line = 379)
    public final boolean method1011(int arg0) {
        ++field1965;
        return arg0 >= 84;
    }

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "(Z)V", line = 390)
    public static void method1012(boolean arg0) {
        if (arg0) {
            field1952 = null;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(II[IIIIII)V", line = 400)
    public final void method1013(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        super.field10335.method4097((byte) -116, this);
        if (arg1 != 22809) {
            field1952 = null;
        }
        ++field1963;
        OpenGL.glPixelStorei(3314, arg0);
        OpenGL.glTexSubImage2Di(super.field10346, 0, arg3, arg6, arg5, arg7, 32993, super.field10335.field5169, arg2, arg4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(Lbga;Lwq;Lbaa;II)V", line = 418)
    public class114(class358 arg0, class169 arg1, class523 arg2, int arg3, int arg4) {
        super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
        this.field1959 = arg3;
        this.field1951 = arg4;
        super.field10335.method4097((byte) 110, this);
        OpenGL.glTexImage2Dub(super.field10346, 0, this.method4164(113), arg3, arg4, 0, class175.method1310(113, super.field10337), class491.method2898(-112, super.field10341), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(ZZI)V", line = 429)
    public final void method1014(boolean arg0, boolean arg1, int arg2) {
        super.field10335.method4097((byte) -29, this);
        ++field1962;
        OpenGL.glTexParameteri(super.field10346, 10242, !arg0 ? 33071 : 10497);
        OpenGL.glTexParameteri(super.field10346, 10243, !arg1 ? 33071 : 10497);
        if (arg2 != 25688) {
            this.field1951 = -90;
        }
    }

    @OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(Lbga;Lwq;IIZ[FII)V", line = 442)
    public class114(class358 arg0, class169 arg1, int arg2, int arg3, boolean arg4, float[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class523.field7253, arg2 * arg3, arg4);
        this.field1959 = arg2;
        this.field1951 = arg3;
        super.field10335.method4097((byte) -67, this);
        if (!arg4 && ~arg7 == -1 && ~arg6 == -1) {
            this.method4174(super.field10346, 1, arg2, arg5, arg3);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Df(super.field10346, 0, this.method4164(111), arg2, arg3, 0, class175.method1310(106, super.field10337), 5126, arg5, arg6 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }
}
