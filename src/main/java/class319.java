import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class319 extends class338 {

    @OriginalMember(owner = "client!t", name = "L", descriptor = "I")
    public int field4266 = 0;

    @OriginalMember(owner = "client!t", name = "C", descriptor = "I")
    public static int field4257 = 0;

    @OriginalMember(owner = "client!t", name = "D", descriptor = "[Ljava/awt/Color;")
    public static Color[] field4258 = new Color[] { new Color(9179409), new Color(3289650) };

    @OriginalMember(owner = "client!t", name = "m", descriptor = "I")
    public static int field4241;

    @OriginalMember(owner = "client!t", name = "n", descriptor = "I")
    public int field4242;

    @OriginalMember(owner = "client!t", name = "o", descriptor = "I")
    public static int field4243;

    @OriginalMember(owner = "client!t", name = "p", descriptor = "I")
    public int field4244;

    @OriginalMember(owner = "client!t", name = "q", descriptor = "I")
    public int field4245;

    @OriginalMember(owner = "client!t", name = "t", descriptor = "I")
    public int field4248;

    @OriginalMember(owner = "client!t", name = "u", descriptor = "I")
    public int field4249;

    @OriginalMember(owner = "client!t", name = "v", descriptor = "I")
    public int field4250;

    @OriginalMember(owner = "client!t", name = "x", descriptor = "I")
    public int field4252;

    @OriginalMember(owner = "client!t", name = "y", descriptor = "I")
    public static int field4253;

    @OriginalMember(owner = "client!t", name = "z", descriptor = "I")
    public int field4254;

    @OriginalMember(owner = "client!t", name = "A", descriptor = "I")
    public int field4255;

    @OriginalMember(owner = "client!t", name = "B", descriptor = "I")
    public int field4256;

    @OriginalMember(owner = "client!t", name = "E", descriptor = "I")
    public static int field4259;

    @OriginalMember(owner = "client!t", name = "G", descriptor = "I")
    public int field4261;

    @OriginalMember(owner = "client!t", name = "H", descriptor = "I")
    public static int field4262;

    @OriginalMember(owner = "client!t", name = "I", descriptor = "I")
    public static int field4263;

    @OriginalMember(owner = "client!t", name = "J", descriptor = "I")
    public static int field4264;

    @OriginalMember(owner = "client!t", name = "R", descriptor = "Lc;")
    public class158 field4270;

    @OriginalMember(owner = "client!t", name = "w", descriptor = "Lds;")
    public class225 field4251;

    @OriginalMember(owner = "client!t", name = "P", descriptor = "Lam;")
    public static class286 field4269;

    @OriginalMember(owner = "client!t", name = "r", descriptor = "Lgm;")
    public class336 field4246;

    @OriginalMember(owner = "client!t", name = "K", descriptor = "Lgm;")
    public class336 field4265;

    @OriginalMember(owner = "client!t", name = "O", descriptor = "Lme;")
    public static class360 field4268;

    @OriginalMember(owner = "client!t", name = "s", descriptor = "Lur;")
    public class91 field4247;

    @OriginalMember(owner = "client!t", name = "N", descriptor = "Z")
    public boolean field4267;

    @OriginalMember(owner = "client!t", name = "F", descriptor = "[I")
    public int[] field4260;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(II)V", line = 4)
    public static final void method1835(int arg0, int arg1) {
        class295.field4009 = arg0;
        field4264++;
        class249.field3353.method613(true);
        if (arg1 != 27518) {
            method1842(-62);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(B)V", line = 24)
    public static final void method1836(byte arg0) {
        class160.field2061.method606(arg0);
        field4262++;
        class158.field2047.method606((byte) 121);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIIIIII)V", line = 34)
    public static final void method1837(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4253++;
        int var8 = arg5 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = class305.field4133 + ((class118.field1475 - class305.field4133) * var8 / 100);
        int var10 = arg1 * var9 >> 8;
        int var11 = 16384 - arg0 & 0x3FFF;
        int var12 = 16384 - arg2 & 0x3FFF;
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (var11 != 0) {
            var14 = class356.field5037[var11] * -var10 >> 15;
            var15 = class356.field5025[var11] * var10 >> 15;
        }
        if (var12 != 0) {
            var13 = class356.field5037[var12] * var15 >> 15;
            var15 = class356.field5025[var12] * var15 >> 15;
        }
        class127.field1633 = arg7 - var13;
        if (arg6 != 2087999407) {
            field4258 = null;
        }
        class175.field2197 = arg4 - var14;
        class308.field4177 = arg2;
        class180.field2272 = arg3 - var15;
        class67.field700 = arg0;
    }

    @OriginalMember(owner = "client!t", name = "d", descriptor = "(I)V", line = 89)
    public static void method1838(int arg0) {
        field4268 = null;
        field4258 = null;
        if (arg0 != 1) {
            method1841(19);
        }
        field4269 = null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lor;IIIII)V", line = 104)
    public static final void method1839(class295 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field4008 = 0;
        label58: for (int var6 = arg2; var6 <= arg4; var6++) {
            label56: for (int var7 = arg3; var7 <= arg5; var7++) {
                int var8 = class396.field5706[arg1][var6][var7];
                int var9 = 0;
                while (true) {
                    label51: while (true) {
                        if (var9 > 24) {
                            continue label56;
                        }
                        int var10 = var8 >>> var9 & 0xFF;
                        if (var10 <= 0) {
                            continue label56;
                        }
                        class106 var11 = class227.field3090[var10 - 1];
                        for (int var12 = 0; var12 < arg0.field4008; var12++) {
                            if (arg0.field3999[var12] == var11) {
                                var9 += 8;
                                continue label51;
                            }
                        }
                        arg0.field3999[arg0.field4008++] = var11;
                        if (arg0.field4008 == 4) {
                            break label58;
                        }
                        var9 += 8;
                    }
                }
            }
        }
        for (int var13 = arg0.field4008; var13 < 4; var13++) {
            arg0.field3999[var13] = null;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ILam;IIZI)V", line = 175)
    public static final void method1840(int arg0, class286 arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field4263++;
        class27.field259 = arg5;
        class266.field3616 = arg1;
        class109.field1333 = arg3;
        class425.field6234 = arg2;
        class242.field3303 = arg4;
        if (arg0 != 14652) {
            field4269 = null;
        }
        class412.field5953 = 10000;
        class252.field3445 = 1;
    }

    @OriginalMember(owner = "client!t", name = "e", descriptor = "(I)Z", line = 197)
    public static final boolean method1841(int arg0) {
        field4243++;
        int var1 = 59 % ((61 - arg0) / 61);
        return class252.field3445 == 0 ? class314.field4205.method2357(98) : true;
    }

    @OriginalMember(owner = "client!t", name = "f", descriptor = "(I)V", line = 215)
    public static final void method1842(int arg0) {
        field4259++;
        if (class259.field3519 && class249.field3361[81] && class244.field3323 > 2) {
            class393.method2443(true, (class405) class342.field4577.field1942.field4506.field4506);
        } else {
            class393.method2443(true, (class405) class342.field4577.field1942.field4506);
        }
        if (arg0 < 82) {
            method1836((byte) -61);
        }
    }

    @OriginalMember(owner = "client!t", name = "g", descriptor = "(I)V", line = 244)
    public final void method1843(int arg0) {
        field4241++;
        int var2 = this.field4256;
        if (arg0 != 0) {
            return;
        }
        if (this.field4251 != null) {
            class225 var5 = this.field4251.method1219(-120);
            if (var5 == null) {
                this.field4256 = -1;
                this.field4244 = 0;
                this.field4255 = 0;
                this.field4254 = 0;
                this.field4248 = 0;
                this.field4260 = null;
            } else {
                this.field4255 = var5.field3000;
                this.field4260 = var5.field3063;
                this.field4254 = var5.field2997 * 128;
                this.field4248 = var5.field3040;
                this.field4244 = var5.field3023;
                this.field4256 = var5.field3017;
            }
        } else if (this.field4247 != null) {
            int var3 = class247.method1318(this.field4247, (byte) 109);
            if (var2 != var3) {
                this.field4256 = var3;
                class345 var4 = this.field4247.field1035;
                if (var4.field4672 != null) {
                    var4 = var4.method2026(-1);
                }
                if (var4 == null) {
                    this.field4244 = this.field4254 = 0;
                } else {
                    this.field4254 = var4.field4654 * 128;
                    this.field4244 = var4.field4637;
                }
            }
        } else if (this.field4270 != null) {
            this.field4256 = class356.method2169((byte) -113, this.field4270);
            this.field4244 = this.field4270.field2020;
            this.field4254 = this.field4270.field2025 * 128;
        }
        if (this.field4256 != var2 && this.field4246 != null) {
            class374.field5265.method2213(this.field4246);
            this.field4246 = null;
        }
    }
}
