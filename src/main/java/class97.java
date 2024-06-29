import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class97 extends class561 implements class391 {

    @OriginalMember(owner = "client!ok", name = "H", descriptor = "I")
    private int field1209;

    @OriginalMember(owner = "client!ok", name = "A", descriptor = "I")
    private int field1202;

    @OriginalMember(owner = "client!ok", name = "D", descriptor = "I")
    public static int field1205 = 0;

    @OriginalMember(owner = "client!ok", name = "E", descriptor = "Lica;")
    public static class205 field1206 = new class205(8);

    @OriginalMember(owner = "client!ok", name = "O", descriptor = "Lnj;")
    public static class487 field1216 = new class487("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");

    @OriginalMember(owner = "client!ok", name = "z", descriptor = "I")
    public static int field1201;

    @OriginalMember(owner = "client!ok", name = "B", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "client!ok", name = "C", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!ok", name = "F", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "client!ok", name = "G", descriptor = "I")
    public static int field1208;

    @OriginalMember(owner = "client!ok", name = "I", descriptor = "I")
    public static int field1210;

    @OriginalMember(owner = "client!ok", name = "J", descriptor = "I")
    public static int field1211;

    @OriginalMember(owner = "client!ok", name = "K", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "client!ok", name = "L", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!ok", name = "M", descriptor = "I")
    public static int field1214;

    @OriginalMember(owner = "client!ok", name = "N", descriptor = "I")
    public static int field1215;

    @OriginalMember(owner = "client!ok", name = "P", descriptor = "Luf;")
    public static class353 field1217;

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(Lqba;Ljt;II[BII)V", line = 3)
    public class97(class540 arg0, class489 arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class629.field9208, arg2 * arg3, false);
        this.field1209 = arg2;
        this.field1202 = arg3;
        super.field8314.method1152(this, true);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Dub(super.field8320, 0, this.method3277(1), arg2, arg3, 0, class135.method836(false, super.field8310), 5121, arg4, arg5);
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(Lqba;Ljt;II[FII)V", line = 21)
    public class97(class540 arg0, class489 arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class629.field9212, arg2 * arg3, false);
        this.field1209 = arg2;
        this.field1202 = arg3;
        super.field8314.method1152(this, true);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Df(super.field8320, 0, this.method3277(1), arg2, arg3, 0, class135.method836(false, super.field8310), 5126, arg4, arg5 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILjt;I[BIIIII)V", line = 35)
    public final void method558(int arg0, class489 arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (~arg5 == -1) {
            arg5 = arg6;
        }
        super.field8314.method1152(this, true);
        ++field1212;
        if (arg2 == -1294) {
            OpenGL.glPixelStorei(3317, 1);
            if (arg5 != arg6) {
                OpenGL.glPixelStorei(3314, arg5);
            }
            OpenGL.glTexSubImage2Dub(super.field8320, 0, arg7, arg0, arg6, arg4, class135.method836(false, arg1), 5121, arg3, arg8);
            if (arg5 != arg6) {
                OpenGL.glPixelStorei(3314, 0);
            }
            OpenGL.glPixelStorei(3317, 4);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Ljava/lang/String;Ldda;BZ)Lfe;", line = 66)
    public static final class191 method559(String arg0, class597 arg1, byte arg2, boolean arg3) {
        ++field1207;
        int var4 = arg1.method3478(-1, arg0);
        if (~var4 == 0) {
            return new class191(0);
        } else if (arg2 > -120) {
            return null;
        } else {
            int[] var5 = arg1.method3465(0, var4);
            class191 var6 = new class191(var5.length);
            int var7 = 0;
            int var8 = 0;
            while (true) {
                while (~var6.field2896 < ~var7) {
                    class428 var9 = new class428(arg1.method3486((byte) -76, var5[var8++], var4));
                    int var10 = var9.method2589(-11179);
                    int var11 = var9.method2620(19);
                    int var12 = var9.method2561((byte) 122);
                    if (!arg3 && ~var12 == -2) {
                        --var6.field2896;
                    } else {
                        var6.field2901[var7] = var10;
                        var6.field2898[var7] = var11;
                        ++var7;
                    }
                }
                return var6;
            }
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IILps;)Ljava/lang/String;", line = 112)
    public static final String method560(int arg0, int arg1, class428 arg2) {
        ++field1201;
        int var3 = -89 % ((-38 - arg0) / 49);
        try {
            int var4 = arg2.method2573(-14319);
            if (arg1 < var4) {
                var4 = arg1;
            }
            byte[] var5 = new byte[var4];
            arg2.field6221 += class312.field4688.method1989(arg2.field6221, 0, arg2.field6162, var5, -1, var4);
            return class66.method405(var4, 0, var5, 14569);
        } catch (Exception var7) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(III[IIIII)V", line = 142)
    public final void method561(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field1204;
        if (~arg4 == -1) {
            arg4 = arg7;
        }
        super.field8314.method1152(this, true);
        if (~arg4 != ~arg7) {
            OpenGL.glPixelStorei(3314, arg4);
        }
        OpenGL.glTexSubImage2Di(super.field8320, 0, arg0, arg5, arg7, arg2, 32993, super.field8314.field8072, arg3, arg6);
        if (~arg4 != ~arg7) {
            OpenGL.glPixelStorei(3314, 0);
        }
        if (arg1 != 12382) {
            this.method565(78, 1.0483813F);
        }
    }

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "(I)V", line = 167)
    public static void method562(int arg0) {
        field1217 = null;
        field1216 = null;
        if (arg0 != 4) {
            field1206 = null;
        }
        field1206 = null;
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(Lqba;Ljt;Llc;II)V", line = 179)
    public class97(class540 arg0, class489 arg1, class629 arg2, int arg3, int arg4) {
        super(arg0, 34037, arg1, arg2, arg3 * arg4, false);
        this.field1209 = arg3;
        this.field1202 = arg4;
        super.field8314.method1152(this, true);
        OpenGL.glTexImage2Dub(super.field8320, 0, this.method3277(1), arg3, arg4, 0, class135.method836(false, super.field8310), class476.method2896(-90, super.field8312), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ZIZ)V", line = 193)
    public final void method563(boolean arg0, int arg1, boolean arg2) {
        ++field1214;
        int var4 = -43 / ((arg1 - -52) / 59);
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(I)I", line = 202)
    public final int method564(int arg0) {
        ++field1215;
        if (arg0 != 7427) {
            this.method569(33, -1.4169446F);
        }
        return this.field1202;
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(IF)F", line = 216)
    public final float method565(int arg0, float arg1) {
        if (arg0 != -32442) {
            this.field1209 = 62;
        }
        ++field1213;
        return arg1;
    }

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "(I)V", line = 227)
    public static final void method566(int arg0) {
        ++field1210;
        class151.method885((byte) -112, false);
        class200.field2996 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class162.field2164.length; ++var2) {
            if (class347.field5052[var2] != -1 && class162.field2164[var2] == null) {
                class162.field2164[var2] = class594.field8766.method3486((byte) -105, 0, class347.field5052[var2]);
                if (class162.field2164[var2] == null) {
                    var1 = false;
                    ++class200.field2996;
                }
            }
            if (~class62.field727[var2] != 0 && class268.field3984[var2] == null) {
                class268.field3984[var2] = class594.field8766.method3473(class69.field787[var2], -2, class62.field727[var2], 0);
                if (class268.field3984[var2] == null) {
                    var1 = false;
                    ++class200.field2996;
                }
            }
            if (class382.field5584[var2] != -1 && class546.field8156[var2] == null) {
                class546.field8156[var2] = class594.field8766.method3486((byte) -41, 0, class382.field5584[var2]);
                if (class546.field8156[var2] == null) {
                    var1 = false;
                    ++class200.field2996;
                }
            }
            if (~class370.field5345[var2] != 0 && class142.field1853[var2] == null) {
                class142.field1853[var2] = class594.field8766.method3486((byte) -116, 0, class370.field5345[var2]);
                if (class142.field1853[var2] == null) {
                    ++class200.field2996;
                    var1 = false;
                }
            }
            if (class370.field5354 != null && class184.field2800[var2] == null && ~class370.field5354[var2] != 0) {
                class184.field2800[var2] = class594.field8766.method3473(class69.field787[var2], -2, class370.field5354[var2], 0);
                if (class184.field2800[var2] == null) {
                    var1 = false;
                    ++class200.field2996;
                }
            }
        }
        if (class517.field7688 == null) {
            if (class210.field3106 != null && class308.field4493.method3463(class210.field3106.field647 + "_staticelements", arg0 ^ -75)) {
                if (!class308.field4493.method3476(100, class210.field3106.field647 + "_staticelements")) {
                    ++class200.field2996;
                    var1 = false;
                } else {
                    class517.field7688 = method559(class210.field3106.field647 + "_staticelements", class308.field4493, (byte) -123, class306.field4467);
                }
            } else {
                class517.field7688 = new class191(0);
            }
        }
        if (!var1) {
            class63.field736 = 1;
        } else {
            boolean var3 = true;
            class608.field8960 = 0;
            for (int var4 = 0; ~class162.field2164.length < ~var4; ++var4) {
                byte[] var19 = class268.field3984[var4];
                if (var19 != null) {
                    int var20 = (class256.field3741[var4] >> 8) * 64 - class584.field8677;
                    int var21 = (class256.field3741[var4] & 255) * 64 + -class424.field6061;
                    if (~class277.field4064 != -1) {
                        var21 = 10;
                        var20 = 10;
                    }
                    var3 &= class343.method2122(var19, class35.field399, class382.field5586, var20, var21, -23);
                }
                byte[] var22 = class142.field1853[var4];
                if (var22 != null) {
                    int var23 = (class256.field3741[var4] >> 8) * 64 - class584.field8677;
                    int var24 = (255 & class256.field3741[var4]) * 64 + -class424.field6061;
                    if (class277.field4064 != 0) {
                        var23 = 10;
                        var24 = 10;
                    }
                    var3 &= class343.method2122(var22, class35.field399, class382.field5586, var23, var24, -23);
                }
            }
            if (!var3) {
                class63.field736 = 2;
            } else {
                if (~class63.field736 != -1) {
                    class162.method946((byte) 55, class259.field3800, true, class288.field4237.method2953(arg0 ^ -3182, class77.field889) + "<br>(100%)");
                }
                class171.method1090(arg0 + -13786);
                class151.method883((byte) -97);
                boolean var5 = false;
                if (class379.field5558.method973() && class94.field1158.field299) {
                    for (int var6 = 0; ~var6 > ~class162.field2164.length; ++var6) {
                        if (class142.field1853[var6] != null || class546.field8156[var6] != null) {
                            var5 = true;
                            break;
                        }
                    }
                }
                int var7;
                if (class94.field1158.field265) {
                    var7 = class536.field7934[class102.field1303];
                } else {
                    var7 = class163.field2183[class102.field1303];
                }
                if (class379.field5558.method1006()) {
                    ++var7;
                }
                class39.method204(7, 4, class35.field399, class382.field5586, var7, var5, ~class379.field5558.method994() < -1);
                for (int var8 = 0; var8 < 4; ++var8) {
                    class67.field772[var8].method481(78);
                }
                class197.method1272((byte) -126);
                class469.method2853(false, false);
                class292.method1802(-30146);
                class477.field7267 = null;
                class564.field8368 = false;
                class171.method1090(-13787);
                System.gc();
                class151.method885((byte) -88, true);
                class122.method742(arg0 ^ -39);
                class136.field1799 = class94.field1158.method131(false, class239.field3499);
                class312.field4691 = class94.field1158.field299;
                class169.field2296 = ~class223.field3276 <= -97;
                class177.field2689 = class94.field1158.method130(-27423, class239.field3499);
                class231.field3413 = !class94.field1158.field290;
                class555.field8244 = !class94.field1158.method2675(0, class239.field3499) ? field1205 : -1;
                class245.field3589 = class594.method3454((byte) -97, class239.field3499) || class94.field1158.field296;
                class545.field8134 = class94.field1158.field262;
                class288.field4249 = new class359(4, class35.field399, class382.field5586, false);
                if (~class277.field4064 != arg0) {
                    class285.method1777(class162.field2164, class288.field4249, false);
                } else {
                    class615.method3576(class288.field4249, class162.field2164, (byte) -94);
                }
                class509.method3041(class35.field399 >> 4, (byte) -102, class382.field5586 >> 4);
                class427.method2540(18818);
                if (var5) {
                    class296.method1836(true);
                    class226.field3329 = new class359(1, class35.field399, class382.field5586, true);
                    if (~class277.field4064 != -1) {
                        class285.method1777(class546.field8156, class226.field3329, false);
                        class151.method885((byte) -100, true);
                    } else {
                        class615.method3576(class226.field3329, class546.field8156, (byte) 109);
                        class151.method885((byte) -104, true);
                    }
                    class226.field3329.method3631(class288.field4249.field9138[0], true, 0);
                    class226.field3329.method3633((byte) 105, class379.field5558, (class82[]) null, (int[][][]) null);
                    class296.method1836(false);
                }
                class288.field4249.method3633((byte) 115, class379.field5558, class67.field772, !var5 ? null : class226.field3329.field9138);
                if (~class277.field4064 == -1) {
                    class151.method885((byte) -106, true);
                    class245.method1572(class268.field3984, (byte) -106, class288.field4249);
                    if (class184.field2800 != null) {
                        class364.method2231(arg0 ^ -256);
                    }
                } else {
                    class151.method885((byte) -90, true);
                    class108.method643(class268.field3984, (byte) -44, class288.field4249);
                }
                class151.method883((byte) -116);
                if (~class223.field3276 > -97) {
                    class626.method3657(-114);
                }
                class151.method885((byte) -101, true);
                class288.field4249.method3637((class543) null, class379.field5558, (byte) -112, !var5 ? null : class287.field4219[0]);
                class288.field4249.method2207(class379.field5558, arg0 + -508390936);
                class151.method885((byte) -113, true);
                if (var5) {
                    class296.method1836(true);
                    class151.method885((byte) -93, true);
                    if (~class277.field4064 != -1) {
                        class108.method643(class142.field1853, (byte) -81, class226.field3329);
                    } else {
                        class245.method1572(class142.field1853, (byte) -73, class226.field3329);
                    }
                    class151.method883((byte) -111);
                    class151.method885((byte) -84, true);
                    class226.field3329.method3637(class562.field8337[0], class379.field5558, (byte) -112, (class543) null);
                    class226.field3329.method2207(class379.field5558, -508390937);
                    class151.method885((byte) -109, true);
                    class296.method1836(false);
                }
                class328.method2044(Integer.MAX_VALUE);
                int var9 = class288.field4249.field5209;
                if (~class355.field5157 > ~var9) {
                    var9 = class355.field5157;
                }
                if (class355.field5157 + -1 > var9) {
                    var9 = class355.field5157 + -1;
                }
                if (class94.field1158.method2675(0, class239.field3499)) {
                    class433.method2647(0);
                } else {
                    class433.method2647(var9);
                }
                for (int var10 = 0; ~var10 > -5; ++var10) {
                    for (int var17 = 0; ~var17 > ~class35.field399; ++var17) {
                        for (int var18 = 0; ~class382.field5586 < ~var18; ++var18) {
                            class229.method1496(arg0 + -15, var17, var10, var18);
                        }
                    }
                }
                class552.method3230(-2617);
                class171.method1090(-13787);
                class542.method3186(-113);
                class151.method883((byte) 30);
                class488.method2954(256);
                if (class248.field3628 != null && class513.field7606 != null && class192.field2903 == 10) {
                    ++class558.field8278;
                    class165.method1046(arg0 ^ 3465, class641.field9314);
                    class221.field3268.method2576(true, 1057001181);
                }
                if (~class277.field4064 == -1) {
                    int var11 = (-(class35.field399 >> 4) + class157.field2003) / 8;
                    int var12 = ((class35.field399 >> 4) + class157.field2003) / 8;
                    int var13 = (class184.field2798 - (class382.field5586 >> 4)) / 8;
                    int var14 = ((class382.field5586 >> 4) + class184.field2798) / 8;
                    for (int var15 = var11 + -1; ~var15 >= ~(var12 + 1); ++var15) {
                        for (int var16 = var13 + -1; ~(var14 - -1) <= ~var16; ++var16) {
                            if (~var15 > ~var11 || var15 > var12 || var16 < var13 || var14 < var16) {
                                class594.field8766.method3460(-1, "m" + var15 + "_" + var16);
                                class594.field8766.method3460(-1, "l" + var15 + "_" + var16);
                            }
                        }
                    }
                }
                if (class192.field2903 != 3) {
                    if (class192.field2903 != 7) {
                        class463.method2749(1, 9);
                        if (class513.field7606 != null) {
                            class165.method1046(-3466, class325.field4816);
                        }
                    } else {
                        class463.method2749(1, 6);
                    }
                } else {
                    class463.method2749(arg0 + 2, 2);
                }
                class622.method3626(-20123);
                class171.method1090(-13787);
                class304.method1879(0);
            }
        }
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(Lqba;II[III)V", line = 688)
    public class97(class540 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        super(arg0, 34037, class411.field5856, class629.field9208, arg1 * arg2, false);
        this.field1209 = arg1;
        this.field1202 = arg2;
        super.field8314.method1152(this, true);
        OpenGL.glPixelStorei(3314, arg5);
        OpenGL.glTexImage2Di(super.field8320, 0, 6408, this.field1209, this.field1202, 0, 32993, super.field8314.field8072, arg3, arg4 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Z)I", line = 702)
    public final int method567(boolean arg0) {
        ++field1203;
        if (!arg0) {
            this.field1209 = -60;
        }
        return this.field1209;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)Z", line = 713)
    public final boolean method568(int arg0) {
        ++field1211;
        if (arg0 != 25992) {
            this.field1202 = -57;
        }
        return false;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IF)F", line = 728)
    public final float method569(int arg0, float arg1) {
        if (arg0 != -2297) {
            return 0.2930675F;
        } else {
            ++field1208;
            return arg1;
        }
    }
}
