import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class457 extends class14 {

    @OriginalMember(owner = "client!a", name = "I", descriptor = "I")
    private int field6710;

    @OriginalMember(owner = "client!a", name = "E", descriptor = "[I")
    public static int[] field6706 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!a", name = "B", descriptor = "[I")
    public static int[] field6703 = new int[32];

    @OriginalMember(owner = "client!a", name = "A", descriptor = "Z")
    public static boolean field6702 = false;

    @OriginalMember(owner = "client!a", name = "C", descriptor = "I")
    public static int field6704;

    @OriginalMember(owner = "client!a", name = "D", descriptor = "I")
    public static int field6705;

    @OriginalMember(owner = "client!a", name = "G", descriptor = "I")
    public static int field6708;

    @OriginalMember(owner = "client!a", name = "H", descriptor = "I")
    public static int field6709;

    @OriginalMember(owner = "client!a", name = "J", descriptor = "I")
    public static int field6711;

    @OriginalMember(owner = "client!a", name = "F", descriptor = "Ljava/lang/String;")
    public static String field6707;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IFIFF)F", line = 7)
    public static final float method2748(int arg0, float arg1, int arg2, float arg3, float arg4) {
        ++field6711;
        if (arg0 != 2) {
            return -0.5930673F;
        } else {
            float[] var5 = class483.field7037[arg2];
            return var5[2] * arg3 + var5[0] * arg4 + var5[1] * arg1;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)V", line = 21)
    public final void method127(boolean arg0) {
        ++field6708;
        if (arg0) {
            field6706 = null;
        }
    }

    @OriginalMember(owner = "client!a", name = "f", descriptor = "(I)V", line = 31)
    public static final void method2749(int arg0) {
        ++field6709;
        if (class500.field7455) {
            class499 var1 = class458.method2757(class186.field2616, false, class126.field1798);
            if (var1 != null && var1.field7300 != null) {
                class199 var2 = new class199();
                var2.field2817 = var1;
                var2.field2813 = var1.field7300;
                class291.method1886(var2);
            }
            class91.field1336 = -1;
            class500.field7455 = false;
            class479.field7008 = arg0;
            if (var1 != null) {
                class338.method2189((byte) 104, var1);
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lvj;)V", line = 66)
    public static final void method2750(class153 arg0) {
        for (int var1 = arg0.field2208; var1 <= arg0.field2214; ++var1) {
            for (int var2 = arg0.field2216; var2 <= arg0.field2213; ++var2) {
                class420 var3 = class380.field5802[arg0.field2210][var1][var2];
                if (var3 != null) {
                    class115 var4 = var3.field6273;
                    class115 var5 = null;
                    while (var4 != null) {
                        if (var4.field1594 == arg0) {
                            if (var5 != null) {
                                var5.field1600 = var4.field1600;
                            } else {
                                var3.field6273 = var4.field1600;
                            }
                            var4.method747(60);
                            break;
                        }
                        var5 = var4;
                        var4 = var4.field1600;
                    }
                    var3.field6258 = 0;
                    for (class115 var6 = var3.field6273; var6 != null; var6 = var6.field1600) {
                        var3.field6258 = (byte) (var3.field6258 | var6.field1595);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Lbv;II[BI)V", line = 119)
    public class457(class282 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field6710 = arg2;
        super.field241.method1787(this, (byte) 121);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage1Dub(super.field240, 0, super.field223, this.field6710, 0, arg4, 5121, arg3, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method123(false, true);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(BZ)V", line = 137)
    public final void method2751(byte arg0, boolean arg1) {
        ++field6705;
        int var3 = 120 / ((22 - arg0) / 61);
        super.field241.method1787(this, (byte) 121);
        OpenGL.glTexParameteri(super.field240, 10242, !arg1 ? 33071 : 10497);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIZLjb;I)V", line = 148)
    public static final void method2752(int arg0, int arg1, boolean arg2, class499 arg3, int arg4) {
        ++field6704;
        int var5 = arg3.field7348;
        int var6 = arg3.field7386;
        if (~arg3.field7399 == -1) {
            arg3.field7348 = arg3.field7319;
        } else if (arg3.field7399 != 1) {
            if (~arg3.field7399 == -3) {
                arg3.field7348 = arg3.field7319 * arg1 >> 14;
            }
        } else {
            arg3.field7348 = -arg3.field7319 + arg1;
        }
        if (arg3.field7289 != 0) {
            if (~arg3.field7289 == -2) {
                arg3.field7386 = -arg3.field7342 + arg0;
            } else if (arg3.field7289 == 2) {
                arg3.field7386 = arg3.field7342 * arg0 >> 14;
            }
        } else {
            arg3.field7386 = arg3.field7342;
        }
        if (arg3.field7399 == 4) {
            arg3.field7348 = arg3.field7386 * arg3.field7371 / arg3.field7390;
        }
        if (arg3.field7289 == 4) {
            arg3.field7386 = arg3.field7390 * arg3.field7348 / arg3.field7371;
        }
        if (class197.field2788 && (~client.method450(arg3).field5891 != -1 || arg3.field7355 == 0)) {
            if (~arg3.field7386 > -6 && ~arg3.field7348 > -6) {
                arg3.field7348 = 5;
                arg3.field7386 = 5;
            } else {
                if (~arg3.field7386 >= -1) {
                    arg3.field7386 = 5;
                }
                if (arg3.field7348 <= 0) {
                    arg3.field7348 = 5;
                }
            }
        }
        if (arg4 != 31166) {
            method2750((class153) null);
        }
        if (~class301.field4445 == ~arg3.field7369) {
            class38.field603 = arg3;
        }
        if (arg2 && arg3.field7414 != null) {
            if (~arg3.field7348 != ~var5 || ~arg3.field7386 != ~var6) {
                class199 var7 = new class199();
                var7.field2813 = arg3.field7414;
                var7.field2817 = arg3;
                class296.field4384.method1958(var7, arg4 + -31166);
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lj;III[Z)Z", line = 236)
    public static final boolean method2753(class229 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class455.field6683 != class187.field2632) {
            int var6 = class204.field2871[arg1].method853(arg2, arg3);
            for (int var7 = 0; var7 <= arg1; ++var7) {
                class206 var8 = class204.field2871[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method853(arg2, arg3);
                    if (arg4 != null) {
                        arg4[var7] = var8.method847(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method844(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!a", name = "g", descriptor = "(I)V", line = 271)
    public static void method2754(int arg0) {
        field6707 = null;
        field6703 = null;
        field6706 = null;
        if (arg0 != 0) {
            method2752(-110, -117, false, (class499) null, 27);
        }
    }
}
