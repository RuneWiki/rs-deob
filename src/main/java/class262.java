import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class262 extends class194 {

    @OriginalMember(owner = "client!sg", name = "G", descriptor = "I")
    private int field3979 = -1;

    @OriginalMember(owner = "client!sg", name = "H", descriptor = "I")
    private int field3980 = -1;

    @OriginalMember(owner = "client!sg", name = "v", descriptor = "I")
    public int field3968;

    @OriginalMember(owner = "client!sg", name = "x", descriptor = "I")
    public int field3970;

    @OriginalMember(owner = "client!sg", name = "u", descriptor = "I")
    public static int field3967 = -1;

    @OriginalMember(owner = "client!sg", name = "t", descriptor = "I")
    public static int field3966;

    @OriginalMember(owner = "client!sg", name = "w", descriptor = "I")
    public static int field3969;

    @OriginalMember(owner = "client!sg", name = "y", descriptor = "I")
    public static int field3971;

    @OriginalMember(owner = "client!sg", name = "z", descriptor = "I")
    public static int field3972;

    @OriginalMember(owner = "client!sg", name = "A", descriptor = "I")
    public static int field3973;

    @OriginalMember(owner = "client!sg", name = "B", descriptor = "I")
    public static int field3974;

    @OriginalMember(owner = "client!sg", name = "C", descriptor = "I")
    public static int field3975;

    @OriginalMember(owner = "client!sg", name = "D", descriptor = "I")
    public static int field3976;

    @OriginalMember(owner = "client!sg", name = "E", descriptor = "I")
    public static int field3977;

    @OriginalMember(owner = "client!sg", name = "F", descriptor = "[Lfo;")
    public static class343[] field3978;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIB)V", line = 3)
    public static final void method1589(int arg0, int arg1, byte arg2) {
        ++field3976;
        class64 var3 = class230.method1387(arg1, (byte) 40, 16);
        var3.method441((byte) 58);
        var3.field1051 = arg0;
        if (arg2 != -39) {
            method1590(-112, -102, -122);
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(III)Z", line = 19)
    public static final boolean method1590(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class483.field7380; ++var3) {
            class168 var4 = class299.field4532[var3];
            if (var4.field2616 == 1) {
                int var5 = var4.field2617 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field2599 * var5 >> 8) + var4.field2609;
                    int var7 = (var4.field2615 * var5 >> 8) + var4.field2604;
                    int var8 = (var4.field2601 * var5 >> 8) + var4.field2614;
                    int var9 = (var4.field2598 * var5 >> 8) + var4.field2610;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field2616 == 2) {
                int var10 = arg0 - var4.field2617;
                if (var10 > 0) {
                    int var11 = (var4.field2599 * var10 >> 8) + var4.field2609;
                    int var12 = (var4.field2615 * var10 >> 8) + var4.field2604;
                    int var13 = (var4.field2601 * var10 >> 8) + var4.field2614;
                    int var14 = (var4.field2598 * var10 >> 8) + var4.field2610;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field2616 == 3) {
                int var15 = var4.field2609 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field2619 * var15 >> 8) + var4.field2617;
                    int var17 = (var4.field2603 * var15 >> 8) + var4.field2606;
                    int var18 = (var4.field2601 * var15 >> 8) + var4.field2614;
                    int var19 = (var4.field2598 * var15 >> 8) + var4.field2610;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field2616 == 4) {
                int var20 = arg2 - var4.field2609;
                if (var20 > 0) {
                    int var21 = (var4.field2619 * var20 >> 8) + var4.field2617;
                    int var22 = (var4.field2603 * var20 >> 8) + var4.field2606;
                    int var23 = (var4.field2601 * var20 >> 8) + var4.field2614;
                    int var24 = (var4.field2598 * var20 >> 8) + var4.field2610;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field2616 == 5) {
                int var25 = arg1 - var4.field2614;
                if (var25 > 0) {
                    int var26 = (var4.field2619 * var25 >> 8) + var4.field2617;
                    int var27 = (var4.field2603 * var25 >> 8) + var4.field2606;
                    int var28 = (var4.field2599 * var25 >> 8) + var4.field2609;
                    int var29 = (var4.field2615 * var25 >> 8) + var4.field2604;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIZII[BIIZI)V", line = 146)
    public final void method1591(int arg0, int arg1, boolean arg2, int arg3, int arg4, byte[] arg5, int arg6, int arg7, boolean arg8, int arg9) {
        ++field3974;
        if (~arg9 == -1) {
            arg9 = arg6;
        }
        if (arg8) {
            int var11 = class287.method1746(-119, arg4);
            int var12 = arg6 * var11;
            int var13 = arg9 * var11;
            byte[] var14 = new byte[arg7 * var12];
            for (int var15 = 0; ~var15 > ~arg7; ++var15) {
                int var16 = var12 * var15;
                int var17 = (arg7 - (var15 + 1)) * var13 + arg0;
                for (int var18 = 0; var18 < var12; ++var18) {
                    var14[var16++] = arg5[var17++];
                }
            }
            arg5 = var14;
        }
        super.field3065.method2586(this, false);
        OpenGL.glPixelStorei(3317, 1);
        if (~arg6 != ~arg9) {
            OpenGL.glPixelStorei(3314, arg9);
        }
        OpenGL.glTexSubImage2Dub(super.field3066, 0, arg3, arg1, arg6, arg7, arg4, 5121, arg5, arg0);
        if (!arg2) {
            this.field3970 = 38;
        }
        if (arg6 != arg9) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(Lbl;IIIIZ[BIZ)V", line = 206)
    public class262(class442 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field3968 = arg4;
        this.field3970 = arg3;
        if (arg8) {
            byte[] var10 = new byte[arg6.length];
            for (int var11 = 0; ~arg4 < ~var11; ++var11) {
                int var12 = arg3 * var11;
                int var13 = (-var11 + arg4 + -1) * arg3;
                for (int var14 = 0; ~var14 > ~arg3; ++var14) {
                    var10[var12++] = arg6[var13++];
                }
            }
            arg6 = var10;
        }
        super.field3065.method2586(this, false);
        OpenGL.glPixelStorei(3317, 1);
        if (arg5 && ~super.field3066 != -34038) {
            class97.method737(arg2, arg3, arg7, arg6, arg4, -570565119, arg1);
            this.method1213(true, (byte) 123);
        } else {
            OpenGL.glTexImage2Dub(super.field3066, 0, super.field3067, this.field3970, this.field3968, 0, arg7, 5121, arg6, 0);
            this.method1213(false, (byte) 102);
        }
        OpenGL.glPixelStorei(3317, 4);
        this.method1208(true, false);
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(Lbl;IIIII)V", line = 261)
    public class262(class442 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        this.field3968 = arg5;
        this.field3970 = arg4;
        int var7 = -arg3 + -arg5 + super.field3065.field6497;
        super.field3065.method2586(this, false);
        OpenGL.glCopyTexImage2D(super.field3066, 0, super.field3067, arg2, var7, arg4, arg5, 0);
        this.method1208(true, false);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIII)V", line = 280)
    public final void method1592(int arg0, int arg1, int arg2, int arg3) {
        ++field3966;
        OpenGL.glFramebufferTexture2DEXT(arg1, arg0, super.field3066, super.field3071, arg3);
        if (arg2 < 72) {
            this.method1591(-101, -105, true, 123, -11, (byte[]) null, 119, 9, false, -72);
        }
        this.field3980 = arg1;
        this.field3979 = arg0;
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(Lbl;IIIIZ[FI)V", line = 293)
    public class262(class442 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field3968 = arg4;
        this.field3970 = arg3;
        super.field3065.method2586(this, false);
        if (arg5 && ~super.field3066 != -34038) {
            class111.method793(arg1, 1, arg7, arg2, arg6, arg3, arg4);
            this.method1213(true, (byte) 111);
        } else {
            OpenGL.glTexImage2Df(super.field3066, 0, super.field3067, this.field3970, this.field3968, 0, arg7, 5126, arg6, 0);
            this.method1213(false, (byte) 113);
        }
        this.method1208(true, false);
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(Lbl;IIII)V", line = 318)
    public class262(class442 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        this.field3970 = arg3;
        this.field3968 = arg4;
        super.field3065.method2586(this, false);
        OpenGL.glTexImage2Dub(super.field3066, 0, super.field3067, arg3, arg4, 0, class458.method2735(super.field3067, 22775), 5121, (byte[]) null, 0);
        this.method1208(true, false);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ZZI)V", line = 330)
    public final void method1593(boolean arg0, boolean arg1, int arg2) {
        if (~super.field3066 == -3554) {
            super.field3065.method2586(this, false);
            OpenGL.glTexParameteri(super.field3066, 10242, !arg1 ? 33071 : 10497);
            OpenGL.glTexParameteri(super.field3066, 10243, !arg0 ? 33071 : 10497);
        }
        ++field3972;
        if (arg2 != 0) {
            field3978 = null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)I", line = 348)
    public static final int method1594(int arg0, int arg1) {
        if (arg1 != 28827) {
            return 64;
        } else {
            ++field3973;
            return ~arg0 == -16711936 ? -1 : class400.method2380(arg1 + -28827, arg0);
        }
    }

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "(I)V", line = 363)
    public static void method1595(int arg0) {
        field3978 = null;
        if (arg0 != 1) {
            method1597(-33, (class135) null);
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIZ[IBIII)V", line = 374)
    public final void method1596(int arg0, int arg1, int arg2, boolean arg3, int[] arg4, byte arg5, int arg6, int arg7, int arg8) {
        ++field3977;
        if (~arg8 == -1) {
            arg8 = arg1;
        }
        if (arg3) {
            int[] var10 = new int[arg1 * arg7];
            for (int var11 = 0; var11 < arg7; ++var11) {
                int var12 = arg1 * var11;
                int var13 = (-var11 + arg7 - 1) * arg8 - -arg2;
                for (int var14 = 0; arg1 > var14; ++var14) {
                    var10[var12++] = arg4[var13++];
                }
            }
            arg4 = var10;
        }
        if (arg5 != -110) {
            field3978 = null;
        }
        super.field3065.method2586(this, false);
        if (~arg1 != ~arg8) {
            OpenGL.glPixelStorei(3314, arg8);
        }
        OpenGL.glTexSubImage2Di(super.field3066, 0, arg6, arg0, arg1, arg7, 32993, super.field3065.field6807, arg4, arg2);
        if (arg1 != arg8) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(Lbl;IIIIZ[IZ)V", line = 424)
    public class262(class442 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, boolean arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field3970 = arg3;
        this.field3968 = arg4;
        if (arg7) {
            int[] var9 = new int[arg6.length];
            for (int var10 = 0; ~var10 > ~arg4; ++var10) {
                int var11 = arg3 * var10;
                int var12 = (arg4 - var10 + -1) * arg3;
                for (int var13 = 0; arg3 > var13; ++var13) {
                    var9[var11++] = arg6[var12++];
                }
            }
            arg6 = var9;
        }
        super.field3065.method2586(this, false);
        if (arg5 && super.field3066 != 34037) {
            class475.method2858(super.field3067, super.field3066, this.field3970, -2, super.field3065.field6807, 32993, this.field3968, arg6);
            this.method1213(true, (byte) 92);
        } else {
            OpenGL.glTexImage2Di(super.field3066, 0, super.field3067, this.field3970, this.field3968, 0, 32993, super.field3065.field6807, arg6, 0);
            this.method1213(false, (byte) 126);
        }
        this.method1208(true, false);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILta;)V", line = 475)
    public static final void method1597(int arg0, class135 arg1) {
        ++field3971;
        arg1.field2192 = false;
        if (arg1.field2201 != -1) {
            class87 var2 = class429.field6302.method106(-122, arg1.field2201);
            if (var2 != null && var2.field1512 != null) {
                label398: {
                    ++arg1.field2199;
                    if (~var2.field1512.length < ~arg1.field2194 && ~var2.field1526[arg1.field2194] > ~arg1.field2199) {
                        ++arg1.field2194;
                        arg1.field2199 = 1;
                        ++arg1.field2205;
                        class70.method516(var2, arg1.field3217, arg1.field2194, class286.field4329 == arg1, arg1.field3218, arg1.field3222, (byte) -79);
                    }
                    if (~var2.field1512.length >= ~arg1.field2194) {
                        arg1.field2199 = 0;
                        arg1.field2194 = 0;
                        if (arg1.field2196) {
                            arg1.field2201 = arg1.method892((byte) -110).method73(arg0 ^ -32157);
                            if (arg1.field2201 == -1) {
                                arg1.field2196 = false;
                                break label398;
                            }
                            var2 = class429.field6302.method106(-87, arg1.field2201);
                        }
                        class70.method516(var2, arg1.field3217, arg1.field2194, class286.field4329 == arg1, arg1.field3218, arg1.field3222, (byte) -79);
                    }
                    arg1.field2205 = arg1.field2194 + 1;
                    if (~arg1.field2205 <= ~var2.field1512.length) {
                        arg1.field2205 = 0;
                    }
                }
            } else {
                arg1.field2201 = -1;
                arg1.field2196 = false;
            }
        }
        if (~arg1.field2172 != 0 && ~class369.field5424 <= ~arg1.field2218) {
            class29 var3 = class201.field3192.method1250(arg1.field2172, 96);
            int var4 = var3.field373;
            if (~var4 == 0) {
                arg1.field2172 = -1;
            } else {
                label400: {
                    class87 var5 = class429.field6302.method106(-82, var4);
                    if (var3.field382) {
                        if (~var5.field1519 == -4) {
                            if (arg1.field2230 > 0 && class369.field5424 >= arg1.field2144 && ~class369.field5424 < ~arg1.field2160) {
                                arg1.field2172 = -1;
                                break label400;
                            }
                        } else if (~var5.field1519 == -2 && arg1.field2230 > 0 && arg1.field2144 <= class369.field5424 && ~class369.field5424 < ~arg1.field2160) {
                            arg1.field2218 = class369.field5424 - -1;
                            break label400;
                        }
                    }
                    if (var5 != null && var5.field1512 != null) {
                        if (arg1.field2180 < 0) {
                            arg1.field2180 = 0;
                            class70.method516(var5, arg1.field3217, 0, class286.field4329 == arg1, arg1.field3218, arg1.field3222, (byte) -79);
                        }
                        ++arg1.field2187;
                        if (var5.field1512.length > arg1.field2180 && arg1.field2187 > var5.field1526[arg1.field2180]) {
                            ++arg1.field2180;
                            arg1.field2187 = 1;
                            class70.method516(var5, arg1.field3217, arg1.field2180, class286.field4329 == arg1, arg1.field3218, arg1.field3222, (byte) -79);
                        }
                        if (~var5.field1512.length >= ~arg1.field2180) {
                            if (!var3.field382) {
                                arg1.field2172 = -1;
                            } else {
                                ++arg1.field2152;
                                arg1.field2180 -= var5.field1511;
                                if (~arg1.field2152 <= ~var5.field1508) {
                                    arg1.field2172 = -1;
                                } else if (~arg1.field2180 <= -1 && ~arg1.field2180 > ~var5.field1512.length) {
                                    class70.method516(var5, arg1.field3217, arg1.field2180, class286.field4329 == arg1, arg1.field3218, arg1.field3222, (byte) -79);
                                } else {
                                    arg1.field2172 = -1;
                                }
                            }
                        }
                        arg1.field2207 = arg1.field2180 + 1;
                        if (arg1.field2207 >= var5.field1512.length) {
                            if (!var3.field382) {
                                arg1.field2207 = -1;
                            } else {
                                arg1.field2207 -= var5.field1511;
                                if (~var5.field1508 < ~(arg1.field2152 + 1)) {
                                    if (arg1.field2207 < 0 || var5.field1512.length <= arg1.field2207) {
                                        arg1.field2207 = -1;
                                    }
                                } else {
                                    arg1.field2207 = -1;
                                }
                            }
                        }
                    } else {
                        arg1.field2172 = -1;
                    }
                }
            }
        }
        if (~arg1.field2170 != 0 && class369.field5424 >= arg1.field2168) {
            class29 var6 = class201.field3192.method1250(arg1.field2170, -13);
            int var7 = var6.field373;
            if (~var7 != 0) {
                label403: {
                    class87 var8 = class429.field6302.method106(-108, var7);
                    if (var6.field382) {
                        if (~var8.field1519 == -4) {
                            if (arg1.field2230 > 0 && ~class369.field5424 <= ~arg1.field2144 && ~class369.field5424 < ~arg1.field2160) {
                                arg1.field2170 = -1;
                                break label403;
                            }
                        } else if (var8.field1519 == 1 && ~arg1.field2230 < -1 && arg1.field2144 <= class369.field5424 && arg1.field2160 < class369.field5424) {
                            arg1.field2168 = class369.field5424 + 1;
                            break label403;
                        }
                    }
                    if (var8 != null && var8.field1512 != null) {
                        if (arg1.field2137 < 0) {
                            arg1.field2137 = 0;
                            class70.method516(var8, arg1.field3217, 0, class286.field4329 == arg1, arg1.field3218, arg1.field3222, (byte) -79);
                        }
                        ++arg1.field2176;
                        if (~arg1.field2137 > ~var8.field1512.length && arg1.field2176 > var8.field1526[arg1.field2137]) {
                            ++arg1.field2137;
                            arg1.field2176 = 1;
                            class70.method516(var8, arg1.field3217, arg1.field2137, class286.field4329 == arg1, arg1.field3218, arg1.field3222, (byte) -79);
                        }
                        if (arg1.field2137 >= var8.field1512.length) {
                            if (!var6.field382) {
                                arg1.field2170 = -1;
                            } else {
                                arg1.field2137 -= var8.field1511;
                                ++arg1.field2162;
                                if (var8.field1508 <= arg1.field2162) {
                                    arg1.field2170 = -1;
                                } else if (arg1.field2137 >= 0 && ~arg1.field2137 > ~var8.field1512.length) {
                                    class70.method516(var8, arg1.field3217, arg1.field2137, class286.field4329 == arg1, arg1.field3218, arg1.field3222, (byte) -79);
                                } else {
                                    arg1.field2170 = -1;
                                }
                            }
                        }
                        arg1.field2165 = arg1.field2137 + 1;
                        if (var8.field1512.length <= arg1.field2165) {
                            if (var6.field382) {
                                arg1.field2165 -= var8.field1511;
                                if (var8.field1508 > arg1.field2162 + 1) {
                                    if (arg1.field2165 < 0 || ~arg1.field2165 <= ~var8.field1512.length) {
                                        arg1.field2165 = -1;
                                    }
                                } else {
                                    arg1.field2165 = -1;
                                }
                            } else {
                                arg1.field2165 = -1;
                            }
                        }
                    } else {
                        arg1.field2170 = -1;
                    }
                }
            } else {
                arg1.field2170 = -1;
            }
        }
        if (arg1.field2174 != -1 && arg1.field2188 <= 1) {
            class87 var9 = class429.field6302.method106(arg0 ^ -88, arg1.field2174);
            if (~var9.field1519 == -4) {
                if (~arg1.field2230 < -1 && ~arg1.field2144 >= ~class369.field5424 && arg1.field2160 < class369.field5424) {
                    arg1.field2174 = -1;
                }
            } else if (~var9.field1519 == -2 && ~arg1.field2230 < -1 && ~arg1.field2144 >= ~class369.field5424 && ~class369.field5424 < ~arg1.field2160) {
                arg1.field2188 = 2;
            }
        }
        if (arg1.field2174 != -1 && arg1.field2188 == 0) {
            class87 var10 = class429.field6302.method106(arg0 + -118, arg1.field2174);
            if (var10 != null && var10.field1512 != null) {
                ++arg1.field2186;
                if (~arg1.field2141 > ~var10.field1512.length && ~var10.field1526[arg1.field2141] > ~arg1.field2186) {
                    arg1.field2186 = 1;
                    ++arg1.field2141;
                    class70.method516(var10, arg1.field3217, arg1.field2141, class286.field4329 == arg1, arg1.field3218, arg1.field3222, (byte) -79);
                }
                if (~var10.field1512.length >= ~arg1.field2141) {
                    ++arg1.field2193;
                    arg1.field2141 -= var10.field1511;
                    if (arg1.field2193 >= var10.field1508) {
                        arg1.field2174 = -1;
                    } else if (~arg1.field2141 <= -1 && ~arg1.field2141 > ~var10.field1512.length) {
                        class70.method516(var10, arg1.field3217, arg1.field2141, class286.field4329 == arg1, arg1.field3218, arg1.field3222, (byte) -79);
                    } else {
                        arg1.field2174 = -1;
                    }
                }
                arg1.field2150 = arg1.field2141 - -1;
                if (~var10.field1512.length >= ~arg1.field2150) {
                    arg1.field2150 -= var10.field1511;
                    if (arg1.field2193 - -1 >= var10.field1508) {
                        arg1.field2150 = -1;
                    } else if (arg1.field2150 < 0 || ~var10.field1512.length >= ~arg1.field2150) {
                        arg1.field2150 = -1;
                    }
                }
                arg1.field2192 = var10.field1505;
            } else {
                arg1.field2174 = -1;
            }
        }
        if (arg1.field2188 > 0) {
            --arg1.field2188;
        }
        for (int var11 = arg0; arg1.field2206.length > var11; ++var11) {
            class493 var12 = arg1.field2206[var11];
            if (var12 != null) {
                if (~var12.field7510 < -1) {
                    --var12.field7510;
                } else {
                    class87 var13 = class429.field6302.method106(arg0 + -125, var12.field7507);
                    if (var13 != null && var13.field1512 != null) {
                        ++var12.field7509;
                        if (~var13.field1512.length < ~var12.field7512 && var12.field7509 > var13.field1526[var12.field7512]) {
                            var12.field7509 = 1;
                            ++var12.field7512;
                            class70.method516(var13, arg1.field3217, var12.field7512, class286.field4329 == arg1, arg1.field3218, arg1.field3222, (byte) -79);
                        }
                        if (var13.field1512.length <= var12.field7512) {
                            var12.field7512 -= var13.field1511;
                            ++var12.field7508;
                            if (~var12.field7508 > ~var13.field1508) {
                                if (var12.field7512 >= 0 && var12.field7512 < var13.field1512.length) {
                                    class70.method516(var13, arg1.field3217, var12.field7512, class286.field4329 == arg1, arg1.field3218, arg1.field3222, (byte) -79);
                                } else {
                                    arg1.field2206[var11] = null;
                                }
                            } else {
                                arg1.field2206[var11] = null;
                            }
                        }
                        var12.field7505 = var12.field7512 + 1;
                        if (~var13.field1512.length >= ~var12.field7505) {
                            var12.field7505 -= var13.field1511;
                            if (var12.field7508 + 1 < var13.field1508) {
                                if (~var12.field7505 > -1 || var13.field1512.length <= var12.field7505) {
                                    var12.field7505 = -1;
                                }
                            } else {
                                var12.field7505 = -1;
                            }
                        }
                    } else {
                        arg1.field2206[var11] = null;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIIIII)V", line = 902)
    public final void method1598(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field3969;
        int var8 = -arg6 - arg0 + super.field3065.field6497;
        super.field3065.method2586(this, false);
        OpenGL.glCopyTexSubImage2D(super.field3066, 0, arg1, -arg0 + -arg5 + this.field3968, arg2, var8, arg4, arg0);
        OpenGL.glFlush();
        if (arg3 > -121) {
            method1589(17, 28, (byte) 45);
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)V", line = 924)
    public final void method1111(byte arg0) {
        if (arg0 <= -104) {
            OpenGL.glFramebufferTexture2DEXT(this.field3980, this.field3979, super.field3066, 0, 0);
            ++field3975;
            this.field3979 = -1;
            this.field3980 = -1;
        }
    }
}
