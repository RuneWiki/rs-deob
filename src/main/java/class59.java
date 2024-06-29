import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class59 extends class358 {

    @OriginalMember(owner = "client!rf", name = "E", descriptor = "[I")
    public static int[] field1055 = new int[14];

    @OriginalMember(owner = "client!rf", name = "C", descriptor = "I")
    public static int field1053;

    @OriginalMember(owner = "client!rf", name = "F", descriptor = "I")
    private int field1056;

    @OriginalMember(owner = "client!rf", name = "J", descriptor = "I")
    public static int field1060;

    @OriginalMember(owner = "client!rf", name = "L", descriptor = "I")
    public static int field1062;

    @OriginalMember(owner = "client!rf", name = "N", descriptor = "I")
    public static int field1064;

    @OriginalMember(owner = "client!rf", name = "O", descriptor = "I")
    public static int field1065;

    @OriginalMember(owner = "client!rf", name = "Q", descriptor = "I")
    public static int field1067;

    @OriginalMember(owner = "client!rf", name = "R", descriptor = "I")
    public static int field1068;

    @OriginalMember(owner = "client!rf", name = "S", descriptor = "I")
    private int field1069;

    @OriginalMember(owner = "client!rf", name = "T", descriptor = "I")
    private int field1070;

    @OriginalMember(owner = "client!rf", name = "U", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!rf", name = "W", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!rf", name = "X", descriptor = "I")
    private int field1074;

    @OriginalMember(owner = "client!rf", name = "ab", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "client!rf", name = "G", descriptor = "Lsq;")
    public static class121 field1057;

    @OriginalMember(owner = "client!rf", name = "I", descriptor = "Luk;")
    private class176 field1059;

    @OriginalMember(owner = "client!rf", name = "Z", descriptor = "Luk;")
    private class176 field1076;

    @OriginalMember(owner = "client!rf", name = "H", descriptor = "Lnn;")
    private class292 field1058;

    @OriginalMember(owner = "client!rf", name = "Y", descriptor = "Lnn;")
    private class292 field1075;

    @OriginalMember(owner = "client!rf", name = "V", descriptor = "Lmj;")
    public static class473 field1072;

    @OriginalMember(owner = "client!rf", name = "D", descriptor = "Lej;")
    private class80 field1054;

    @OriginalMember(owner = "client!rf", name = "K", descriptor = "Lej;")
    private class80 field1061;

    @OriginalMember(owner = "client!rf", name = "M", descriptor = "Lej;")
    private class80 field1063;

    @OriginalMember(owner = "client!rf", name = "bb", descriptor = "Lej;")
    private class80 field1078;

    @OriginalMember(owner = "client!rf", name = "P", descriptor = "[Luk;")
    private class176[] field1066;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)V", line = 4)
    public final void method499(int arg0, int arg1) {
        OpenGL.glUseProgramObjectARB(0L);
        ++field1060;
        super.field5191.method277(arg0, (byte) 70);
        super.field5191.method285(false, (class120) null);
        super.field5191.method277(0, (byte) 100);
    }

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "(I)V", line = 15)
    public static void method500(int arg0) {
        field1057 = null;
        if (arg0 != 921) {
            field1055 = null;
        }
        field1072 = null;
        field1055 = null;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(III)V", line = 32)
    public final void method501(int arg0, int arg1, int arg2) {
        this.field1069 = arg1;
        ++field1053;
        this.field1070 = arg2;
        if (arg0 != 34842) {
            this.method499(112, 68);
        }
        int var4 = class285.method1834(-112, this.field1070);
        int var5 = class285.method1834(-105, this.field1069);
        if (this.field1074 != var4 || this.field1056 != var5) {
            if (this.field1066 != null) {
                for (int var6 = 0; this.field1066.length > var6; ++var6) {
                    this.field1066[var6].method883(-8820);
                }
                this.field1066 = null;
            }
            if (var4 <= 256 && ~var5 >= -257) {
                this.field1075 = null;
            } else {
                int var7 = var4;
                int var8 = var5;
                int var9 = 0;
                if (this.field1075 == null) {
                    this.field1075 = new class292(super.field5191);
                }
                label60: while (true) {
                    if (~var7 >= -257 && ~var8 >= -257) {
                        this.field1066 = new class176[var9];
                        int var10 = var4;
                        int var11 = var5;
                        int var12 = 0;
                        while (true) {
                            if (~var10 >= -257 && var11 <= 256) {
                                break label60;
                            }
                            this.field1066[var12++] = new class176(super.field5191, 3553, 34842, var10, var11);
                            if (var11 > 256) {
                                var11 >>= 1;
                            }
                            if (var10 > 256) {
                                var10 >>= 1;
                            }
                        }
                    }
                    if (var8 > 256) {
                        var8 >>= 1;
                    }
                    if (var7 > 256) {
                        var7 >>= 1;
                    }
                    ++var9;
                }
            }
            this.field1074 = var4;
            this.field1056 = var5;
        }
    }

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "(I)Z", line = 112)
    public final boolean method502(int arg0) {
        ++field1067;
        if (super.field5191.field758 && super.field5191.field653 && super.field5191.field757) {
            this.field1058 = new class292(super.field5191);
            this.field1076 = new class176(super.field5191, 3553, 34842, 256, 256);
            this.field1076.method1226(false, false, (byte) -123);
            this.field1059 = new class176(super.field5191, 3553, 34842, 256, 256);
            this.field1059.method1226(false, false, (byte) -60);
            super.field5191.method289(8704, this.field1058);
            this.field1058.method1874(0, 1, this.field1076);
            this.field1058.method1874(1, 1, this.field1059);
            this.field1058.method1868(0, true);
            if (!this.field1058.method1866(-36054)) {
                super.field5191.method281(this.field1058, -21590);
                return false;
            } else {
                super.field5191.method281(this.field1058, -21590);
                this.field1054 = class533.method3155(super.field5191, true, new class314[] { class490.method2872(52, super.field5191, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", 35632) });
                this.field1061 = class533.method3155(super.field5191, true, new class314[] { class490.method2872(-65, super.field5191, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", 35632) });
                this.field1063 = class533.method3155(super.field5191, true, new class314[] { class490.method2872(47, super.field5191, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", 35632) });
                this.field1078 = class533.method3155(super.field5191, true, new class314[] { class490.method2872(109, super.field5191, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", 35632) });
                return this.field1061 != null && this.field1054 != null && this.field1063 != null && this.field1078 != null;
            }
        } else {
            if (arg0 >= -46) {
                this.method509(-48, (class176) null, (class176) null, false);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ZLjava/lang/String;)V", line = 157)
    public static final void method503(boolean arg0, String arg1) {
        ++field1065;
        if (arg1 != null) {
            if ((~class290.field4314 > -101 || class92.field1477) && class290.field4314 < 200) {
                String var2 = class274.method1769(0, arg1);
                if (var2 != null) {
                    for (int var3 = 0; class290.field4314 > var3; ++var3) {
                        String var7 = class274.method1769(0, class163.field2463[var3]);
                        if (var7 != null && var7.equals(var2)) {
                            class171.method1208((byte) 54, arg1 + class337.field4995.method426(class503.field7255, 77));
                            return;
                        }
                        if (class397.field5630[var3] != null) {
                            String var8 = class274.method1769(0, class397.field5630[var3]);
                            if (var8 != null && var8.equals(var2)) {
                                class171.method1208((byte) -101, arg1 + class337.field4995.method426(class503.field7255, 95));
                                return;
                            }
                        }
                    }
                    for (int var4 = 0; ~var4 > ~class8.field71; ++var4) {
                        String var5 = class274.method1769(0, class440.field6273[var4]);
                        if (var5 != null && var5.equals(var2)) {
                            class171.method1208((byte) 67, class73.field1198.method426(class503.field7255, 40) + arg1 + class69.field1137.method426(class503.field7255, 62));
                            return;
                        }
                        if (class350.field5133[var4] != null) {
                            String var6 = class274.method1769(0, class350.field5133[var4]);
                            if (var6 != null && var6.equals(var2)) {
                                class171.method1208((byte) 86, class73.field1198.method426(class503.field7255, 119) + arg1 + class69.field1137.method426(class503.field7255, 56));
                                return;
                            }
                        }
                    }
                    if (class274.method1769(0, class364.field5293.field7363).equals(var2)) {
                        class171.method1208((byte) -93, class337.field4999.method426(class503.field7255, 73));
                    } else {
                        class228.method1528(arg0, class18.field203);
                        ++class31.field409;
                        class276.field4124.method3048(-2034159384, class132.method966(arg1, 10240));
                        class276.field4124.method3057((byte) -28, arg1);
                    }
                }
            } else {
                class171.method1208((byte) 126, class352.field5141.method426(class503.field7255, 50));
            }
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)Z", line = 247)
    public final boolean method504(byte arg0) {
        ++field1068;
        if (arg0 <= 77) {
            this.field1063 = null;
        }
        return super.field5191.field758 && super.field5191.field653 && super.field5191.field757;
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)I", line = 259)
    public final int method505(int arg0) {
        if (arg0 != 0) {
            this.method504((byte) -101);
        }
        ++field1062;
        return 1;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lqa;I)V", line = 271)
    public static final void method506(class167 arg0, int arg1) {
        ++field1073;
        int var2 = class252.field3743;
        int var3 = class291.field4322;
        int var4 = class415.field5887;
        int var5 = class517.field7487 + -3;
        byte var6 = 20;
        if (class133.field2075 == null || class102.field1574 == null) {
            if (class96.field1527.method2035(class479.field6978, (byte) -94) && class96.field1527.method2035(class259.field3834, (byte) -94)) {
                class133.field2075 = arg0.method308(class104.method767(class96.field1527, class479.field6978, 0), true);
                class104 var7 = class104.method767(class96.field1527, class259.field3834, 0);
                class102.field1574 = arg0.method308(var7, true);
                var7.method755();
                class290.field4315 = arg0.method308(var7, true);
            } else {
                arg0.method215(var2, var3, var4, var6, -class233.field3486 + 255 << 24 | class424.field5993, 1);
            }
        }
        if (class133.field2075 != null && class102.field1574 != null) {
            int var8 = (-(class102.field1574.method378() * 2) + var4) / class133.field2075.method378();
            for (int var9 = 0; var8 > var9; ++var9) {
                class133.field2075.method2175(var2 - -class102.field1574.method378() - -(class133.field2075.method378() * var9), var3);
            }
            class102.field1574.method2175(var2, var3);
            class290.field4315.method2175(var2 - (-var4 - -class290.field4315.method378()), var3);
        }
        class270.field4072.method1743(class136.field2113.method426(class503.field7255, 114), var2 + 3, -1, var3 + 14, -16777216 | class451.field6583, (byte) -98);
        arg0.method215(var2, var3 + var6, var4, -var6 + var5, -class233.field3486 + 255 << 24 | class424.field5993, arg1);
        int var10 = class49.field909.method639((byte) -118);
        int var11 = class49.field909.method644(101);
        int var12 = 0;
        for (class341 var13 = (class341) class258.field3829.method863(-1); var13 != null; var13 = (class341) class258.field3829.method865(arg1 + -2)) {
            int var31 = (-var12 + class430.field6184 - 1) * 16 + 13 + var3 + var6;
            if (~var10 < ~var2 && var10 < var2 - -var4 && var31 + -13 < var11 && var11 < var31 + 4 && var13.field5041) {
                arg0.method215(var2, var31 - 12, var4, 16, -class540.field7949 + 255 << 24 | class46.field888, 1);
            }
            ++var12;
        }
        if ((class482.field7005 == null || class108.field1622 == null || class118.field1847 == null) && class96.field1527.method2035(class242.field3625, (byte) -94) && class96.field1527.method2035(class73.field1195, (byte) -94) && class96.field1527.method2035(class170.field2532, (byte) -94)) {
            class104 var14 = class104.method767(class96.field1527, class73.field1195, 0);
            class108.field1622 = arg0.method308(var14, true);
            var14.method755();
            class200.field3060 = arg0.method308(var14, true);
            class482.field7005 = arg0.method308(class104.method767(class96.field1527, class242.field3625, 0), true);
            class104 var15 = class104.method767(class96.field1527, class170.field2532, 0);
            class118.field1847 = arg0.method308(var15, true);
            var15.method755();
            class366.field5298 = arg0.method308(var15, true);
        }
        int var16 = 0;
        if (class482.field7005 != null && class108.field1622 != null && class118.field1847 != null) {
            int var17 = (-(2 * class118.field1847.method378()) + var4) / class482.field7005.method378();
            for (int var18 = 0; var18 < var17; ++var18) {
                class482.field7005.method2175(class118.field1847.method378() + var2 + class482.field7005.method378() * var18, -class482.field7005.method367() + var5 + var3);
            }
            int var19 = (-class118.field1847.method367() + -var6 + var5) / class108.field1622.method367();
            for (int var20 = 0; ~var20 > ~var19; ++var20) {
                class108.field1622.method2175(var2, var20 * class108.field1622.method367() + var3 + var6);
                class200.field3060.method2175(var2 + var4 + -class200.field3060.method378(), var20 * class108.field1622.method367() + (var3 - -var6));
            }
            class118.field1847.method2175(var2, var3 + var5 - class118.field1847.method367());
            class366.field5298.method2175(-class118.field1847.method378() + var2 + var4, -class118.field1847.method367() + var3 + var5);
        }
        for (class341 var21 = (class341) class258.field3829.method863(-1); var21 != null; var21 = (class341) class258.field3829.method865(-1)) {
            int var22 = (class430.field6184 + -1 + -var16) * 16 + var3 - (-var6 - 13);
            int var23 = class451.field6583 | -16777216;
            if (~var10 < ~var2 && var2 + var4 > var10 && ~var11 < ~(var22 + -13) && ~var11 > ~(var22 - -4) && var21.field5041) {
                var23 = -16777216 | class302.field4474;
            }
            int[] var24 = null;
            if (!class303.method1937(0, var21.field5039)) {
                if (~var21.field5035 != 0) {
                    var24 = class58.field1052.method1646(arg1 ^ 21709, var21.field5035).field1799;
                } else if (!class15.method85(var21.field5039, -20)) {
                    if (class116.method833(var21.field5039, (byte) 109)) {
                        Object var25 = null;
                        class261 var26;
                        if (var21.field5039 == 1007) {
                            var26 = class277.field4139.method569((byte) 115, (int) var21.field5037);
                        } else {
                            var26 = class277.field4139.method569((byte) 63, (int) (2147483647L & var21.field5037 >>> 32));
                        }
                        if (var26.field3926 != null) {
                            var26 = var26.method1679(class84.field1335, 1349439392);
                        }
                        if (var26 != null) {
                            var24 = var26.field3891;
                        }
                    }
                } else {
                    class193 var27 = (class193) class390.field5539.method2284(true, (long) ((int) var21.field5037));
                    if (var27 != null) {
                        class279 var28 = var27.field2805;
                        class311 var29 = var28.field4157;
                        if (var29.field4631 != null) {
                            var29 = var29.method1972(class84.field1335, (byte) -32);
                        }
                        if (var29 != null) {
                            var24 = var29.field4582;
                        }
                    }
                }
            } else {
                var24 = class58.field1052.method1646(21708, (int) var21.field5037).field1799;
            }
            String var30 = class136.method991(117, var21);
            if (var24 != null) {
                var30 = var30 + class176.method1233(104, var24);
            }
            class270.field4072.method1738(class7.field40, (byte) 19, var23, var30, var2 - -3, 0, class175.field2613, var22);
            if (var21.field5042) {
                class375.field5393.method2175(var2 + 5 - -class425.field6028.method875(var30, (byte) 5), var22 + -12);
            }
            ++var16;
        }
        class154.method1084(110, class517.field7487, class415.field5887, class252.field3743, class291.field4322);
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "(Z)V", line = 476)
    public final void method507(boolean arg0) {
        ++field1071;
        this.field1076 = null;
        this.field1066 = null;
        this.field1058 = null;
        this.field1061 = null;
        if (arg0) {
            this.field1076 = null;
        }
        this.field1075 = null;
        this.field1059 = null;
        this.field1063 = null;
        this.field1078 = null;
        this.field1054 = null;
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(Lbt;)V", line = 495)
    public class59(class33 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "(I)Z", line = 505)
    public final boolean method508(int arg0) {
        ++field1064;
        if (arg0 <= 64) {
            this.field1056 = 124;
        }
        return this.field1058 != null;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ILuk;Luk;Z)V", line = 516)
    public final void method509(int arg0, class176 arg1, class176 arg2, boolean arg3) {
        ++field1077;
        OpenGL.glPushAttrib(2048);
        OpenGL.glMatrixMode(5889);
        OpenGL.glPushMatrix();
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field1066 != null) {
            super.field5191.method289(8704, this.field1075);
            int var5 = class285.method1834(-128, this.field1070);
            int var6 = class285.method1834(-93, this.field1069);
            int var7 = 0;
            while (~var5 < -257 || var6 > 256) {
                OpenGL.glViewport(0, 0, var5, var6);
                this.field1075.method1874(0, 1, this.field1066[var7]);
                if (var5 > 256) {
                    var5 >>= 1;
                }
                if (var6 > 256) {
                    var6 >>= 1;
                }
                if (var7 != 0) {
                    super.field5191.method285(false, this.field1066[var7 + -1]);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(1.0F, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f(1.0F, 1.0F);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, 1.0F);
                    OpenGL.glVertex2i(0, 1);
                    OpenGL.glEnd();
                } else {
                    super.field5191.method285(false, arg2);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f((float) this.field1070, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f((float) this.field1070, (float) this.field1069);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field1069);
                    OpenGL.glVertex2i(0, 1);
                    OpenGL.glEnd();
                }
                ++var7;
            }
            super.field5191.method281(this.field1075, -21590);
            super.field5191.method285(false, this.field1066[var7 + -1]);
            super.field5191.method289(8704, this.field1058);
            this.field1058.method1868(0, !arg3);
            OpenGL.glViewport(0, 0, 256, 256);
            long var8 = this.field1061.field1301;
            OpenGL.glUseProgramObjectARB(var8);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var8, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var8, "params"), class279.field4141, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f(1.0F, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f(1.0F, 1.0F);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, 1.0F);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        } else {
            super.field5191.method285(false, arg2);
            super.field5191.method289(8704, this.field1058);
            this.field1058.method1868(0, true);
            OpenGL.glViewport(0, 0, 256, 256);
            long var10 = this.field1054.field1301;
            OpenGL.glUseProgramObjectARB(var10);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var10, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var10, "params"), class279.field4141, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f((float) this.field1070, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f((float) this.field1070, (float) this.field1069);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, (float) this.field1069);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        }
        this.field1058.method1868(1, true);
        super.field5191.method285(false, this.field1076);
        long var12 = this.field1078.field1301;
        OpenGL.glUseProgramObjectARB(var12);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var12, "baseTex"), 0);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var12, "step"), 0.00390625F, 0.0F, 0.0F);
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(0, 0);
        OpenGL.glTexCoord2f(1.0F, 0.0F);
        OpenGL.glVertex2i(1, 0);
        OpenGL.glTexCoord2f(1.0F, 1.0F);
        OpenGL.glVertex2i(1, 1);
        OpenGL.glTexCoord2f(0.0F, 1.0F);
        OpenGL.glVertex2i(0, 1);
        OpenGL.glEnd();
        this.field1058.method1868(0, true);
        super.field5191.method285(false, this.field1059);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var12, "step"), 0.0F, 0.00390625F, 0.0F);
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(0, 0);
        OpenGL.glTexCoord2f(1.0F, 0.0F);
        OpenGL.glVertex2i(1, 0);
        OpenGL.glTexCoord2f(1.0F, 1.0F);
        OpenGL.glVertex2i(1, 1);
        OpenGL.glTexCoord2f(0.0F, 1.0F);
        OpenGL.glVertex2i(0, 1);
        OpenGL.glEnd();
        OpenGL.glPopAttrib();
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
        super.field5191.method281(this.field1058, -21590);
        long var14 = this.field1063.field1301;
        OpenGL.glUseProgramObjectARB(var14);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "sceneTex"), 0);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "bloomTex"), 1);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var14, "params"), class218.field3318, class244.field3656, 0.0F);
        super.field5191.method277(1, (byte) 53);
        super.field5191.method285(arg3, this.field1076);
        super.field5191.method277(0, (byte) 94);
        super.field5191.method285(false, arg2);
    }
}
