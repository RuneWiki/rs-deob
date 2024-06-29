import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cea")
public class class226 extends class249 {

    @OriginalMember(owner = "client!cea", name = "t", descriptor = "I")
    private int field3095;

    @OriginalMember(owner = "client!cea", name = "m", descriptor = "I")
    private int field3088;

    @OriginalMember(owner = "client!cea", name = "j", descriptor = "I")
    private int field3085;

    @OriginalMember(owner = "client!cea", name = "p", descriptor = "I")
    private int field3091;

    @OriginalMember(owner = "client!cea", name = "u", descriptor = "Lee;")
    public static class706 field3096 = new class706(16);

    @OriginalMember(owner = "client!cea", name = "v", descriptor = "Z")
    public static boolean field3097 = false;

    @OriginalMember(owner = "client!cea", name = "y", descriptor = "I")
    public static int field3100 = 0;

    @OriginalMember(owner = "client!cea", name = "z", descriptor = "Leo;")
    public static class314 field3101 = new class314();

    @OriginalMember(owner = "client!cea", name = "k", descriptor = "I")
    public static int field3086;

    @OriginalMember(owner = "client!cea", name = "l", descriptor = "I")
    public static int field3087;

    @OriginalMember(owner = "client!cea", name = "n", descriptor = "I")
    public static int field3089;

    @OriginalMember(owner = "client!cea", name = "o", descriptor = "I")
    public static int field3090;

    @OriginalMember(owner = "client!cea", name = "q", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!cea", name = "r", descriptor = "I")
    public static int field3093;

    @OriginalMember(owner = "client!cea", name = "s", descriptor = "I")
    public static int field3094;

    @OriginalMember(owner = "client!cea", name = "w", descriptor = "I")
    public static int field3098;

    @OriginalMember(owner = "client!cea", name = "x", descriptor = "I")
    public static int field3099;

    @OriginalMember(owner = "client!cea", name = "b", descriptor = "(BII)V", line = 3)
    public final void method845(byte arg0, int arg1, int arg2) {
        if (arg0 == 85) {
            ++field3098;
            int var4 = this.field3085 * arg2 >> 12;
            int var5 = this.field3091 * arg2 >> 12;
            int var6 = this.field3088 * arg1 >> 12;
            int var7 = this.field3095 * arg1 >> 12;
            class160.method1171(super.field3689, super.field3690, super.field3694, -1, var7, var6, var5, var4);
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(III)V", line = 24)
    public final void method844(int arg0, int arg1, int arg2) {
        ++field3094;
        int var4 = this.field3085 * arg0 >> 12;
        if (arg2 != -7895) {
            this.field3085 = -121;
        }
        int var5 = this.field3091 * arg0 >> 12;
        int var6 = this.field3088 * arg1 >> 12;
        int var7 = this.field3095 * arg1 >> 12;
        class418.method2580(var6, var5, arg2 ^ 14271, var4, var7, super.field3694);
    }

    @OriginalMember(owner = "client!cea", name = "b", descriptor = "(I)V", line = 45)
    public static void method1490(int arg0) {
        if (arg0 != -23567) {
            method1490(-66);
        }
        field3101 = null;
        field3096 = null;
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(BII)V", line = 57)
    public final void method843(byte arg0, int arg1, int arg2) {
        if (arg0 == 101) {
            ++field3086;
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "([ILwp;I[I[I)V", line = 68)
    public static final void method1491(int[] arg0, class192 arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg2 != 3563) {
            field3099 = -63;
        }
        ++field3093;
        for (int var5 = 0; ~arg0.length < ~var5; ++var5) {
            int var6 = arg0[var5];
            int var7 = arg3[var5];
            int var8 = arg4[var5];
            for (int var9 = 0; ~var7 != -1 && ~arg1.field1859.length < ~var9; ++var9) {
                if ((1 & var7) != 0) {
                    if (var6 == -1) {
                        arg1.field1859[var9] = null;
                    } else {
                        class489 var10 = class6.field65.method1034(var6, arg2 + -3563);
                        int var11 = var10.field6786;
                        class545 var12 = arg1.field1859[var9];
                        if (var12 != null) {
                            if (var12.field7394 != var6) {
                                if (~var10.field6778 <= ~class6.field65.method1034(var12.field7394, 0).field6778) {
                                    var12 = arg1.field1859[var9] = null;
                                }
                            } else if (var11 == 0) {
                                var12 = arg1.field1859[var9] = null;
                            } else if (var11 == 1) {
                                var12.field7386 = 0;
                                var12.field7388 = 1;
                                var12.field7391 = 0;
                                var12.field7390 = var8;
                                var12.field7385 = 0;
                                if (!arg1.field1823) {
                                    class586.method3259(arg1, arg2 ^ 3563, var10, 0);
                                }
                            } else if (~var11 == -3) {
                                var12.field7386 = 0;
                            }
                        }
                        if (var12 == null) {
                            class545 var13 = arg1.field1859[var9] = new class545();
                            var13.field7385 = 0;
                            var13.field7394 = var6;
                            var13.field7386 = 0;
                            var13.field7390 = var8;
                            var13.field7388 = 1;
                            var13.field7391 = 0;
                            if (!arg1.field1823) {
                                class586.method3259(arg1, 0, var10, 0);
                            }
                        }
                    }
                }
                var7 >>>= 1;
            }
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(II)I", line = 169)
    public static final int method1492(int arg0, int arg1) {
        if (arg0 != -7636) {
            field3100 = -21;
        }
        ++field3092;
        return 255 & arg1;
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(ILaj;ILd;Ljava/awt/Canvas;)Lha;", line = 180)
    public static final class65 method1493(int arg0, class333 arg1, int arg2, class161 arg3, Canvas arg4) {
        ++field3089;
        if (!class164.method1190(-2500)) {
            throw new RuntimeException("");
        } else if (!class295.method1877(122, "jaggl")) {
            throw new RuntimeException("");
        } else {
            OpenGL var5 = new OpenGL();
            long var6 = var5.init(arg4, 8, 8, 8, 24, 0, arg0);
            if (var6 == 0L) {
                throw new RuntimeException("");
            } else {
                class391 var8 = new class391(var5, arg4, var6, arg3, arg1, arg0);
                var8.method3453(arg2 + arg2);
                return var8;
            }
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(ILgaa;I)Z", line = 210)
    public static final boolean method1494(int arg0, class315 arg1, int arg2) {
        ++field3090;
        int var3 = arg1.method1993(-1, 2);
        if (~var3 == -1) {
            if (arg1.method1993(-1, 1) != 0) {
                method1494(arg0, arg1, 0);
            }
            int var4 = arg1.method1993(-1, 6);
            int var5 = arg1.method1993(arg2 + -1, 6);
            boolean var6 = ~arg1.method1993(-1, 1) == -2;
            if (var6) {
                class477.field6626[class697.field9766++] = arg0;
            }
            if (class599.field8149[arg0] != null) {
                throw new RuntimeException("hr:lr");
            } else {
                class349 var7 = class94.field1342[arg0];
                class73 var8 = class599.field8149[arg0] = new class73();
                var8.field1812 = arg0;
                if (class81.field1149[arg0] != null) {
                    var8.method643(class81.field1149[arg0], true);
                }
                var8.method1021(16383, true, var7.field5122);
                var8.field1787 = var7.field5124;
                int var9 = var7.field5126;
                int var10 = var9 >> 28;
                int var11 = (4181665 & var9) >> 14;
                int var12 = var9 & 255;
                int var13 = (var11 << 6) + var4 + -class121.field1765;
                var8.field1052 = var7.field5127;
                int var14 = (var12 << 6) + -class230.field3147 + var5;
                var8.field1046 = var7.field5121;
                var8.field1887[0] = class697.field9785[arg0];
                var8.field2250 = var8.field2244 = (byte) var10;
                if (class74.method661(var13, var14, arg2 + 1)) {
                    ++var8.field2244;
                }
                var8.method654(var13, var14, false);
                var8.field1066 = false;
                class94.field1342[arg0] = null;
                return true;
            }
        } else if (var3 == 1) {
            int var15 = arg1.method1993(-1, 2);
            int var16 = class94.field1342[arg0].field5126;
            class94.field1342[arg0].field5126 = ((3 & (var16 >> 28) - -var15) << 28) + (var16 & 268435455);
            return false;
        } else if (~var3 == -3) {
            int var17 = arg1.method1993(arg2 + -1, 5);
            int var18 = var17 >> 3;
            int var19 = var17 & 7;
            int var20 = class94.field1342[arg0].field5126;
            int var21 = (var20 >> 28) + var18 & 3;
            int var22 = 255 & var20 >> 14;
            int var23 = var20 & 255;
            if (var19 == 0) {
                --var22;
                --var23;
            }
            if (var19 == 1) {
                --var23;
            }
            if (~var19 == -3) {
                --var23;
                ++var22;
            }
            if (var19 == 3) {
                --var22;
            }
            if (~var19 == -5) {
                ++var22;
            }
            if (var19 == 5) {
                ++var23;
                --var22;
            }
            if (var19 == 6) {
                ++var23;
            }
            if (var19 == 7) {
                ++var23;
                ++var22;
            }
            class94.field1342[arg0].field5126 = (var21 << 28) + var23 - -(var22 << 14);
            return false;
        } else {
            int var24 = arg1.method1993(-1, 18);
            int var25 = var24 >> 16;
            int var26 = (var24 & 65481) >> 8;
            if (arg2 != 0) {
                field3099 = 22;
            }
            int var27 = var24 & 255;
            int var28 = class94.field1342[arg0].field5126;
            int var29 = 3 & (var28 >> 28) + var25;
            int var30 = (var28 >> 14) - -var26 & 255;
            int var31 = var27 + var28 & 255;
            class94.field1342[arg0].field5126 = (var30 << 14) + (var29 << 28) + var31;
            return false;
        }
    }

    @OriginalMember(owner = "client!cea", name = "<init>", descriptor = "(IIIIIII)V", line = 391)
    public class226(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field3095 = arg3;
        this.field3088 = arg1;
        this.field3085 = arg0;
        this.field3091 = arg2;
    }
}
