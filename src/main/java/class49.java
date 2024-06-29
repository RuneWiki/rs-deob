import jaggl.OpenGL;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class class49 extends class195 {

    @OriginalMember(owner = "client!gp", name = "A", descriptor = "I")
    private int field702 = -1;

    @OriginalMember(owner = "client!gp", name = "J", descriptor = "I")
    private int field711 = -1;

    @OriginalMember(owner = "client!gp", name = "F", descriptor = "I")
    public int field707;

    @OriginalMember(owner = "client!gp", name = "D", descriptor = "I")
    public int field705;

    @OriginalMember(owner = "client!gp", name = "G", descriptor = "I")
    public int field708;

    @OriginalMember(owner = "client!gp", name = "x", descriptor = "I")
    public static int field699 = 0;

    @OriginalMember(owner = "client!gp", name = "E", descriptor = "Lpha;")
    public static class165 field706 = new class165();

    @OriginalMember(owner = "client!gp", name = "K", descriptor = "Lqe;")
    public static class469 field712 = new class469(42, -2);

    @OriginalMember(owner = "client!gp", name = "y", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!gp", name = "z", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!gp", name = "B", descriptor = "I")
    public static int field703;

    @OriginalMember(owner = "client!gp", name = "C", descriptor = "I")
    public static int field704;

    @OriginalMember(owner = "client!gp", name = "H", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "client!gp", name = "I", descriptor = "I")
    public static int field710;

    // $FF: synthetic field
    @OriginalMember(owner = "client!gp", name = "L", descriptor = "Ljava/lang/Class;")
    public static Class field713;

    // $FF: synthetic field
    @OriginalMember(owner = "client!gp", name = "M", descriptor = "Ljava/lang/Class;")
    public static Class field714;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIIIIILka;Lha;IILao;III)Lka;")
    public static final class473 method358(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class473 arg6, class60 arg7, int arg8, int arg9, class288 arg10, int arg11, int arg12, int arg13) {
        ++field710;
        if (arg6 == null) {
            return null;
        } else {
            int var14 = 2055;
            if (arg10 != null) {
                int var15 = var14 | arg10.method1838(arg5 + 65517, arg11, false, -1);
                var14 = var15 & -513;
            }
            long var16 = ((long) arg2 << 48) + (long) ((arg12 << 24) + arg3 - -(arg13 << 16)) - -((long) arg8 << 32);
            class106 var18 = class141.field1858;
            class473 var19;
            synchronized (class141.field1858) {
                var19 = (class473) class141.field1858.method803(117, var16);
            }
            if (var19 == null || arg7.method491(var19.method255(), var14) != 0) {
                if (var19 != null) {
                    var14 = arg7.method490(var14, var19.method255());
                }
                byte var20;
                if (~arg3 == -2) {
                    var20 = 9;
                } else if (arg3 != 2) {
                    if (arg3 != 3) {
                        if (~arg3 != -5) {
                            var20 = 21;
                        } else {
                            var20 = 18;
                        }
                    } else {
                        var20 = 15;
                    }
                } else {
                    var20 = 12;
                }
                byte var21 = 3;
                int[] var22 = new int[] { 64, 96, 128 };
                class322 var23 = new class322(var20 * var21 + 1, var21 * 2 * var20 + -var20, 0);
                int var24 = var23.method2052(0, 0, (byte) 82, 0);
                int[][] var25 = new int[var21][var20];
                for (int var26 = 0; var26 < var21; ++var26) {
                    int var27 = var22[var26];
                    int var28 = var22[var26];
                    for (int var29 = 0; ~var20 < ~var29; ++var29) {
                        int var30 = (var29 << 14) / var20;
                        int var31 = class373.field5548[var30] * var27 >> 14;
                        int var32 = class373.field5549[var30] * var28 >> 14;
                        var25[var26][var29] = var23.method2052(0, var32, (byte) 96, var31);
                    }
                }
                for (int var33 = 0; ~var33 > ~var21; ++var33) {
                    int var34 = (var33 * 256 + 128) / var21;
                    int var35 = -var34 + 256;
                    byte var36 = (byte) (arg12 * var34 + arg13 * var35 >> 8);
                    short var37 = (short) (((arg2 & 127) * var34 + (arg8 & 127) * var35 & 32512) + (229376 & (896 & arg2) * var34 + (896 & arg8) * var35) + (16515072 & (64512 & arg2) * var34 + (64512 & arg8) * var35) >> 8);
                    for (int var38 = 0; ~var20 < ~var38; ++var38) {
                        if (var33 == 0) {
                            var23.method2051(var25[0][var38], (byte) -1, (byte) 1, var37, 0, var36, var25[0][(var38 + 1) % var20], var24, (short) -1);
                        } else {
                            var23.method2051(var25[var33][(var38 - -1) % var20], (byte) -1, (byte) 1, var37, 0, var36, var25[var33 + -1][(var38 + 1) % var20], var25[var33 + -1][var38], (short) -1);
                            var23.method2051(var25[var33][var38], (byte) -1, (byte) 1, var37, 0, var36, var25[var33][(var38 + 1) % var20], var25[var33 + -1][var38], (short) -1);
                        }
                    }
                }
                var19 = arg7.method418(var23, var14, class191.field2888, 64, 768);
                class106 var39 = class141.field1858;
                synchronized (class141.field1858) {
                    class141.field1858.method801(1, var19, var16);
                }
            }
            if (arg5 != 18) {
                method363(77, 119);
            }
            int var40 = arg6.method258();
            int var41 = arg6.method239();
            int var42 = arg6.method246();
            int var43 = arg6.method250();
            class253 var44 = null;
            if (arg10 != null) {
                int var45 = arg10.field4081[arg11];
                var44 = class742.field10404.method2666(true, var45 >> 16);
                arg11 = var45 & 65535;
            }
            class473 var46;
            if (var44 != null) {
                var46 = var19.method251((byte) 3, var14, true);
                var46.method286(-var40 + var41 >> 1, 128, -var42 + var43 >> 1);
                var46.method238(var40 + var41 >> 1, 0, var42 + var43 >> 1);
                var46.method2855((byte) -122, arg11, var44);
            } else {
                var46 = var19.method251((byte) 3, var14, true);
                var46.method286(-var40 + var41 >> 1, 128, -var42 + var43 >> 1);
                var46.method238(var40 + var41 >> 1, 0, var42 + var43 >> 1);
            }
            if (~arg9 != -1) {
                var46.method243(arg9);
            }
            if (~arg0 != -1) {
                var46.method279(arg0);
            }
            if (~arg4 != -1) {
                var46.method238(0, arg4, 0);
            }
            return var46;
        }
    }

    @OriginalMember(owner = "client!gp", name = "d", descriptor = "(I)V")
    public static void method359(int arg0) {
        field706 = null;
        if (arg0 != -2239) {
            field712 = null;
        }
        field712 = null;
    }

    @OriginalMember(owner = "client!gp", name = "e", descriptor = "(I)I")
    public static final int method360(int arg0) {
        ++field709;
        int var1 = 0;
        if (arg0 >= -117) {
            field712 = null;
        }
        Field[] var2 = (field713 != null ? field713 : (field713 = method364("hb"))).getDeclaredFields();
        Field[] var3 = var2;
        for (int var4 = 0; ~var3.length < ~var4; ++var4) {
            Field var5 = var3[var4];
            if ((field714 != null ? field714 : (field714 = method364("vw"))).isAssignableFrom(var5.getType())) {
                ++var1;
            }
        }
        return var1 + 1;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(II)I")
    public static final int method361(int arg0, int arg1) {
        if (arg0 != -27343) {
            method361(-121, -92);
        }
        ++field700;
        return 255 & arg1;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(I)V")
    public final void method106(int arg0) {
        ++field704;
        OpenGL.glFramebufferTexture3DEXT(this.field711, this.field702, super.field2957, 0, 0, 0);
        this.field711 = -1;
        this.field702 = -1;
        if (arg0 < 14) {
            field712 = null;
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIBIIIII)V")
    public final void method362(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        super.field2967.method1088(this, -27749);
        ++field703;
        OpenGL.glCopyTexSubImage3D(super.field2957, 0, arg1, arg5, arg7, arg6, arg0, arg4, arg3);
        OpenGL.glFlush();
        if (arg2 <= 105) {
            method360(15);
        }
    }

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "(II)V")
    public static final void method363(int arg0, int arg1) {
        ++field701;
        if (~class87.field1246 != ~arg0) {
            if (~arg0 == -14) {
                if (class72.field1015 != null) {
                    class587.method3394(-25622, class92.field1284);
                } else {
                    class64.method566(-92, class273.field3888, class92.field1284, class100.field1424);
                }
            }
            if (arg0 != 13 && class262.field3718 != null) {
                class262.field3718.method850(2);
                class262.field3718 = null;
            }
            if (~arg0 == -4) {
                class370.method2273((byte) 116, class87.field1249 != class574.field8116);
            }
            if (arg0 == 7) {
                class345.method2185(true, ~class87.field1249 != ~class382.field5763);
            }
            if (arg0 == 5) {
                if (class72.field1015 != null) {
                    class307.method1938((byte) -73);
                } else {
                    class481.method2888(class100.field1424, class273.field3888, -53);
                }
            } else if (arg0 == 6) {
                if (class72.field1015 != null) {
                    class587.method3394(-25622, class92.field1284);
                } else {
                    class64.method566(58, class273.field3888, class92.field1284, class100.field1424);
                }
            } else if (~arg0 != -10) {
                if (arg0 == 12) {
                    if (class72.field1015 == null) {
                        class481.method2888(class100.field1424, class273.field3888, 92);
                    } else {
                        class307.method1938((byte) -102);
                    }
                }
            } else if (class72.field1015 == null) {
                class64.method566(75, class273.field3888, class92.field1284, class100.field1424);
            } else {
                class587.method3394(-25622, class92.field1284);
            }
            if (class221.method1487(-9, class87.field1246)) {
                class734.field10278.field400 = 2;
                class421.field6286.field400 = 2;
                class588.field8343.field400 = 2;
                class411.field6187.field400 = 2;
                class259.field3698.field400 = 2;
                class134.field1791.field400 = 2;
                class565.field8034.field400 = 2;
            }
            int var2 = -86 % ((48 - arg1) / 46);
            if (class221.method1487(-9, arg0)) {
                class376.field5697 = 1;
                class304.field4319 = 1;
                class44.field477 = 0;
                class456.field6729 = 0;
                class505.field7183 = 0;
                client.method1892(-124, true);
                class734.field10278.field400 = 1;
                class421.field6286.field400 = 1;
                class588.field8343.field400 = 1;
                class411.field6187.field400 = 1;
                class259.field3698.field400 = 1;
                class134.field1791.field400 = 1;
                class565.field8034.field400 = 1;
            }
            if (arg0 == 11 || arg0 == 3) {
                class596.method3472((byte) -127);
            }
            boolean var3 = arg0 == 2 || class245.method1633(arg0, 695) || class245.method1631(-10, arg0);
            boolean var4 = ~class87.field1246 == -3 || class245.method1633(class87.field1246, 695) || class245.method1631(-10, class87.field1246);
            if (!var3 == var4) {
                if (!var3) {
                    class144.method1007(2, (byte) 25);
                    class115.field1594.method20(true, 103);
                } else {
                    class9.field142 = class444.field6604;
                    if (class63.field916.field10164.method2268(17503) != 0) {
                        class654.method3788(class444.field6604, false, 0, class63.field916.field10164.method2268(17503), false, 2, class299.field4244);
                        class718.method4079((byte) -86);
                    } else {
                        class144.method1007(2, (byte) 25);
                    }
                    class115.field1594.method20(false, 117);
                }
            }
            if (class221.method1487(-9, arg0) || arg0 == 13) {
                class736.field10316.method472();
            }
            class87.field1246 = arg0;
        }
    }

    @OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(Lwh;IIII)V")
    public class49(class148 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, 32879, arg1, arg3 * arg4 * arg2, false);
        this.field707 = arg2;
        this.field705 = arg3;
        this.field708 = arg4;
        super.field2967.method1088(this, -27749);
        OpenGL.glTexImage3Dub(super.field2957, 0, super.field2956, this.field707, this.field705, this.field708, 0, class307.method1935(-119, super.field2956), 5121, (byte[]) null, 0);
        this.method1362(true, 1287);
    }

    @OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(Lwh;IIII[BI)V")
    public class49(class148 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field707 = arg2;
        this.field708 = arg4;
        this.field705 = arg3;
        super.field2967.method1088(this, -27749);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field2957, 0, super.field2956, this.field707, this.field705, this.field708, 0, arg6, 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method1362(true, 1287);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method364(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
