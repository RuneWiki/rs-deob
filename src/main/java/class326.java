import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class326 extends class73 {

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "I")
    private int field5114;

    @OriginalMember(owner = "client!ha", name = "y", descriptor = "I")
    private int field5122;

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "I")
    private int field5113;

    @OriginalMember(owner = "client!ha", name = "v", descriptor = "I")
    private int field5119;

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "Lgi;")
    public static class437 field5117 = null;

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "Lqu;")
    public static class219 field5118 = new class219(57, 4);

    @OriginalMember(owner = "client!ha", name = "z", descriptor = "Lqu;")
    public static class219 field5123;

    @OriginalMember(owner = "client!ha", name = "C", descriptor = "I")
    public static int field5126;

    @OriginalMember(owner = "client!ha", name = "D", descriptor = "[Ljava/lang/String;")
    public static String[] field5127;

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "I")
    public static int field5110;

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "I")
    public static int field5111;

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "I")
    public static int field5112;

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "I")
    public static int field5115;

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "I")
    public static int field5116;

    @OriginalMember(owner = "client!ha", name = "w", descriptor = "I")
    public static int field5120;

    @OriginalMember(owner = "client!ha", name = "x", descriptor = "I")
    public static int field5121;

    @OriginalMember(owner = "client!ha", name = "B", descriptor = "I")
    public static int field5125;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ha", name = "E", descriptor = "Ljava/lang/Class;")
    public static Class field5128;

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "[Lec;")
    public static class68[] field5124;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIBILmn;IZ)V")
    public static final void method2176(int arg0, int arg1, byte arg2, int arg3, class162 arg4, int arg5, boolean arg6) {
        class503.field7532 = arg3;
        class170.field2489 = arg0;
        class186.field2709 = arg1;
        class328.field5138 = arg6;
        class210.field3273 = arg5;
        ++field5116;
        class73.field1106 = arg4;
        class174.field2565 = 1;
        int var7 = -4 / ((arg2 - 24) / 49);
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIB)V")
    public final void method537(int arg0, int arg1, byte arg2) {
        ++field5111;
        int var4 = this.field5113 * arg0 >> 12;
        int var5 = this.field5114 * arg0 >> 12;
        int var6 = this.field5122 * arg1 >> 12;
        int var7 = this.field5119 * arg1 >> 12;
        if (arg2 >= -78) {
            field5118 = null;
        }
        class166.method1049(var6, super.field1098, var7, super.field1096, super.field1101, false, var4, var5);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IZI)V")
    public final void method538(int arg0, boolean arg1, int arg2) {
        ++field5125;
        int var4 = this.field5113 * arg0 >> 12;
        int var5 = this.field5114 * arg0 >> 12;
        int var6 = this.field5122 * arg2 >> 12;
        if (!arg1) {
            int var7 = this.field5119 * arg2 >> 12;
            class36.method223(var7, var5, super.field1101, var4, super.field1098, 66, var6);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lza;BIIIIIII)V")
    public static final void method2177(class497 arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field5112;
        class267 var9 = (class267) class409.method2611(arg4, arg6, arg5);
        if (var9 != null) {
            class156 var10 = class454.field7029.method3002(-1, var9.method96((byte) 94));
            int var11 = var9.method106((byte) 18) & 3;
            int var12 = var9.method99((byte) 61);
            if (var10.field2104 != -1) {
                class319.method2136(arg2, var11, (byte) 101, var10, arg0, arg8);
            } else {
                int var13 = arg7;
                if (~var10.field2079 < -1) {
                    var13 = arg3;
                }
                if (~var12 == -1 || var12 == 2) {
                    if (var11 != 0) {
                        if (~var11 != -2) {
                            if (~var11 != -3) {
                                if (var11 == 3) {
                                    arg0.method3046(arg8 + 3, var13, arg2, arg1 ^ -115, 4);
                                }
                            } else {
                                arg0.method3036(4, arg2 + 3, var13, (byte) 111, arg8);
                            }
                        } else {
                            arg0.method3046(arg8, var13, arg2, arg1 ^ -115, 4);
                        }
                    } else {
                        arg0.method3036(4, arg2, var13, (byte) 116, arg8);
                    }
                }
                if (~var12 == -4) {
                    if (~var11 == -1) {
                        arg0.method3042(1, (byte) -118, arg8, var13, arg2, 1);
                    } else if (~var11 == -2) {
                        arg0.method3042(1, (byte) -101, arg8, var13, arg2 + 3, 1);
                    } else if (var11 == 2) {
                        arg0.method3042(1, (byte) -103, arg8 - -3, var13, arg2 - -3, 1);
                    } else if (~var11 == -4) {
                        arg0.method3042(1, (byte) -119, arg8 + 3, var13, arg2, 1);
                    }
                }
                if (~var12 == -3) {
                    if (var11 != 0) {
                        if (~var11 != -2) {
                            if (~var11 == -3) {
                                arg0.method3046(arg8 + 3, var13, arg2, 2, 4);
                            } else if (var11 == 3) {
                                arg0.method3036(4, arg2, var13, (byte) 35, arg8);
                            }
                        } else {
                            arg0.method3036(4, arg2 + 3, var13, (byte) 72, arg8);
                        }
                    } else {
                        arg0.method3046(arg8, var13, arg2, 2, 4);
                    }
                }
            }
        }
        class267 var14 = (class267) class49.method352(arg4, arg6, arg5, field5128 != null ? field5128 : (field5128 = method2182("jq")));
        if (var14 != null) {
            class156 var15 = class454.field7029.method3002(-1, var14.method96((byte) 98));
            int var16 = 3 & var14.method106((byte) 18);
            int var17 = var14.method99((byte) 72);
            if (~var15.field2104 == 0) {
                if (var17 == 9) {
                    int var18 = -1118482;
                    if (var15.field2079 > 0) {
                        var18 = -1179648;
                    }
                    if (var16 != 0 && ~var16 != -3) {
                        arg0.method3045(arg2, (byte) -107, arg8, arg2 + 3, arg8 + 3, var18);
                    } else {
                        arg0.method3045(arg2, (byte) -71, arg8 + 3, arg2 + 3, arg8, var18);
                    }
                }
            } else {
                class319.method2136(arg2, var16, (byte) 101, var15, arg0, arg8);
            }
        }
        class267 var19 = (class267) class76.method548(arg4, arg6, arg5);
        if (arg1 != -113) {
            method2179((byte) -45);
        }
        if (var19 != null) {
            class156 var20 = class454.field7029.method3002(arg1 + 112, var19.method96((byte) 100));
            int var21 = var19.method106((byte) 18) & 3;
            if (~var20.field2104 != 0) {
                class319.method2136(arg2, var21, (byte) 101, var20, arg0, arg8);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lna;[Lim;I)Lmv;")
    public static final class233 method2178(class211 arg0, class297[] arg1, int arg2) {
        ++field5120;
        for (int var3 = 0; arg1.length > var3; ++var3) {
            if (arg1[var3] == null || arg1[var3].field4678 <= 0L) {
                return null;
            }
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        for (int var6 = 0; ~arg1.length < ~var6; ++var6) {
            OpenGL.glAttachObjectARB(var4, arg1[var6].field4678);
        }
        int var7 = 93 % ((arg2 - 62) / 41);
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class534.field7828, 0);
        if (class534.field7828[0] == 0) {
            if (~class534.field7828[0] == -1) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class534.field7828, 1);
            if (class534.field7828[1] > 1) {
                byte[] var8 = new byte[class534.field7828[1]];
                OpenGL.glGetInfoLogARB(var4, class534.field7828[1], class534.field7828, 0, var8, 0);
                System.out.println(new String(var8));
            }
            if (class534.field7828[0] == 0) {
                for (int var9 = 0; arg1.length > var9; ++var9) {
                    OpenGL.glDetachObjectARB(var4, arg1[var9].field4678);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class233(arg0, var4, arg1);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIB)V")
    public final void method532(int arg0, int arg1, byte arg2) {
        ++field5121;
        int var4 = this.field5113 * arg1 >> 12;
        int var5 = this.field5114 * arg1 >> 12;
        if (arg2 != -67) {
            method2178((class211) null, (class297[]) null, -62);
        }
        int var6 = this.field5122 * arg0 >> 12;
        int var7 = this.field5119 * arg0 >> 12;
        class213.method1581(var6, 0, super.field1096, var7, var5, var4);
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(IIIIIII)V")
    public class326(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field5114 = arg2;
        this.field5122 = arg1;
        this.field5113 = arg0;
        this.field5119 = arg3;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V")
    public static void method2179(byte arg0) {
        int var1 = 49 % ((-73 - arg0) / 35);
        field5127 = null;
        field5117 = null;
        field5124 = null;
        field5118 = null;
        field5123 = null;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([II)Ljava/lang/String;")
    public static final String method2180(int[] arg0, int arg1) {
        ++field5110;
        StringBuffer var2 = new StringBuffer();
        int var3 = class147.field1990;
        if (arg1 > -23) {
            method2177((class497) null, (byte) 124, -80, -123, 13, 54, -96, -109, -112);
        }
        for (int var4 = 0; var4 < arg0.length; ++var4) {
            class126 var5 = class360.field5583.method131(arg0[var4], 28375);
            if (~var5.field1704 != 0) {
                class139 var6 = (class139) class316.field4933.method2191((byte) -73, (long) var5.field1704);
                if (var6 == null) {
                    class175 var7 = class175.method1115(class120.field1646, var5.field1704, 0);
                    if (var7 != null) {
                        var6 = class19.field198.method1278(var7, true);
                        class316.field4933.method2188(-125, (long) var5.field1704, var6);
                    }
                }
                if (var6 != null) {
                    class243.field3946[var3] = var6;
                    var2.append(" <img=").append(var3).append(">");
                    ++var3;
                }
            }
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)V")
    public static final void method2181(int arg0) {
        ++field5115;
        class180.field2620.method2189(false);
        if (arg0 > -91) {
            method2181(47);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2182(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class213((String) null, "Spieler nicht auf deiner Freunde-Liste.", (String) null, (String) null);
        field5123 = new class219(22, 2);
        field5126 = 0;
        field5127 = new String[100];
    }
}
