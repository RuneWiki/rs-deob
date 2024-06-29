import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class240 {

    @OriginalMember(owner = "client!in", name = "e", descriptor = "I")
    public static int field3381 = 0;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "Lbd;")
    public static class464 field3377 = new class464(3, 5);

    @OriginalMember(owner = "client!in", name = "k", descriptor = "[[B")
    public static byte[][] field3387 = new byte[1000][];

    @OriginalMember(owner = "client!in", name = "i", descriptor = "Ldt;")
    public static class184 field3385 = new class184(16);

    @OriginalMember(owner = "client!in", name = "b", descriptor = "I")
    public static int field3378;

    @OriginalMember(owner = "client!in", name = "c", descriptor = "I")
    public static int field3379;

    @OriginalMember(owner = "client!in", name = "d", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!in", name = "f", descriptor = "I")
    public static int field3382;

    @OriginalMember(owner = "client!in", name = "j", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!in", name = "g", descriptor = "Lfm;")
    public static class81 field3383;

    @OriginalMember(owner = "client!in", name = "h", descriptor = "Ljava/awt/Frame;")
    public static Frame field3384;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
    public static final void method1502(String arg0, int arg1, boolean arg2) {
        field3378++;
        String var3 = arg0.toLowerCase();
        short[] var4 = new short[16];
        if (arg1 != -1) {
            return;
        }
        int var5 = 0;
        int var6 = arg2 ? 32768 : 0;
        int var7 = var6 + (arg2 ? class407.field5644 : class123.field1704);
        for (int var8 = var6; var8 < var7; var8++) {
            class389 var11 = class148.method913(var8, 105);
            if (var11.field5484 && var11.method2320(arg1).toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 50) {
                    class445.field6146 = -1;
                    class292.field4011 = null;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var12 = new short[var4.length * 2];
                    for (int var13 = 0; var13 < var5; var13++) {
                        var12[var13] = var4[var13];
                    }
                    var4 = var12;
                }
                var4[var5++] = (short) var8;
            }
        }
        class292.field4011 = var4;
        class330.field4545 = 0;
        class445.field6146 = var5;
        String[] var9 = new String[class445.field6146];
        for (int var10 = 0; var10 < class445.field6146; var10++) {
            var9[var10] = class148.method913(var4[var10], class382.method2292(arg1, 69)).method2320(-1);
        }
        class30.method239(class292.field4011, 15883, var9);
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(III)I")
    public static final int method1503(int arg0, int arg1, int arg2) {
        field3382++;
        int var3 = arg2 >>> 31;
        if (arg0 != -127) {
            field3377 = null;
        }
        return (arg2 + var3) / arg1 - var3;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(I)V")
    public static void method1504(int arg0) {
        field3387 = null;
        if (arg0 != 1) {
            field3377 = null;
        }
        field3383 = null;
        field3385 = null;
        field3384 = null;
        field3377 = null;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IIZZIII)V")
    public static final void method1505(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6) {
        if (arg4 != -1) {
            return;
        }
        if (arg0 < arg5) {
            int var7 = (arg0 + arg5) / 2;
            int var8 = arg0;
            class334 var9 = class199.field2849[var7];
            class199.field2849[var7] = class199.field2849[arg5];
            class199.field2849[arg5] = var9;
            for (int var10 = arg0; var10 < arg5; var10++) {
                if (class265.method1671(arg3, -115, class199.field2849[var10], var9, arg2, arg1, arg6) <= 0) {
                    class334 var11 = class199.field2849[var10];
                    class199.field2849[var10] = class199.field2849[var8];
                    class199.field2849[var8++] = var11;
                }
            }
            class199.field2849[arg5] = class199.field2849[var8];
            class199.field2849[var8] = var9;
            method1505(arg0, arg1, arg2, arg3, arg4, var8 - 1, arg6);
            method1505(var8 + 1, arg1, arg2, arg3, -1, arg5, arg6);
        }
        field3379++;
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(III)I")
    public static final int method1506(int arg0, int arg1, int arg2) {
        field3380++;
        if (arg2 == -1254419329) {
            int var3 = arg0 - 1 & arg1 >> 31;
            return (arg1 + (arg1 >>> 31)) % arg0 + var3;
        } else {
            return -83;
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(ILqr;ILpf;I)V")
    public static final void method1507(int arg0, class23 arg1, int arg2, class133 arg3, int arg4) {
        field3386++;
        byte var5 = -1;
        if ((arg2 & 0x100) != 0) {
            var5 = arg3.method2486(1);
        }
        if ((arg2 & 0x400) != 0) {
            int var6 = arg3.method2503(true);
            int[] var7 = new int[var6];
            int[] var8 = new int[var6];
            int[] var9 = new int[var6];
            for (int var10 = 0; var10 < var6; var10++) {
                int var11 = arg3.method2500(49);
                if (var11 == 65535) {
                    var11 = -1;
                }
                var7[var10] = var11;
                var8[var10] = arg3.method2503(true);
                var9[var10] = arg3.method2508(true);
            }
            class33.method256(arg1, var8, var9, (byte) -123, var7);
        }
        if ((arg2 & 0x4) != 0) {
            arg1.field388 = arg3.method2508(true);
            if (arg1.field1142 == 0) {
                arg1.method505(arg1.field388, -32082);
                arg1.field388 = -1;
            }
        }
        if ((arg2 & 0x800) != 0) {
            int var12 = arg3.method2483(-2103088664);
            if (var12 == 65535) {
                var12 = -1;
            }
            int var13 = arg3.method2484(-103);
            boolean var14 = true;
            if (var12 != -1 && arg1.field1079 != -1) {
                if (arg1.field1079 == var12) {
                    class321 var15 = class163.field2348.method548(var12, (byte) -109);
                    if (var15.field4392 && var15.field4391 != -1) {
                        class372 var16 = class31.field505.method950(true, var15.field4391);
                        int var17 = var16.field5271;
                        if (var17 == 0) {
                            var14 = false;
                        } else if (var17 == 1) {
                            var14 = true;
                        } else if (var17 == 2) {
                            arg1.field1071 = 0;
                            var14 = false;
                        }
                    }
                } else {
                    class321 var18 = class163.field2348.method548(var12, (byte) -125);
                    class321 var19 = class163.field2348.method548(arg1.field1079, (byte) -122);
                    if (var18.field4391 != -1 && var19.field4391 != -1) {
                        class372 var20 = class31.field505.method950(true, var18.field4391);
                        class372 var21 = class31.field505.method950(true, var19.field4391);
                        if (var20.field5260 < var21.field5260) {
                            var14 = false;
                        }
                    }
                }
            }
            if (var14) {
                int var22 = class356.field4972;
                arg1.field1079 = var12;
                arg1.field1132 = var13 >> 16;
                arg1.field1074 = 1;
                arg1.field1121 = (var13 & 0xFFFF) + var22;
                arg1.field1125 = 0;
                arg1.field1091 = 0;
                if (var22 < arg1.field1121) {
                    arg1.field1091 = -1;
                }
                if (arg1.field1079 != -1 && arg1.field1121 == var22) {
                    int var23 = class163.field2348.method548(arg1.field1079, (byte) 24).field4391;
                    if (var23 != -1) {
                        class372 var24 = class31.field505.method950(true, var23);
                        if (var24 != null && var24.field5278 != null) {
                            class272.method1706(arg1.field6766, var24, class2.field21 == arg1, (byte) 31, arg1.field6765, arg1.field6746, 0);
                        }
                    }
                }
            }
        }
        int var25 = -44 % ((65 - arg0) / 46);
        if ((arg2 & 0x20) != 0) {
            int var26 = arg3.method2459(-110);
            byte[] var27 = new byte[var26];
            class425 var28 = new class425(var27);
            arg3.method2488(var27, 0, (byte) 40, var26);
            class293.field4020[arg4] = var28;
            arg1.method188(false, var28);
        }
        if ((arg2 & 0x200) != 0) {
            int var29 = arg3.method2508(true);
            arg1.field1067 = arg3.method2459(-126);
            arg1.field1130 = arg3.method2459(-112);
            arg1.field1122 = (var29 & 0x8000) != 0;
            arg1.field1112 = var29 & 0x7FFF;
            arg1.field1066 = class356.field4972 + arg1.field1112 + arg1.field1067;
        }
        if ((arg2 & 0x1) != 0) {
            int var30 = arg3.method2483(-2103088664);
            int var31 = arg3.method2456(-29879);
            int var32 = arg3.method2503(true);
            int var33 = arg3.field5830;
            boolean var34 = (var30 & 0x8000) != 0;
            if (arg1.field407 != null && arg1.field400 != null) {
                boolean var35 = false;
                if (var31 <= 1) {
                    if (!var34 && (class205.field2942 && !class78.field1185 || class42.field719)) {
                        var35 = true;
                    } else if (class261.method1612(arg1.field407, false)) {
                        var35 = true;
                    }
                }
                if (!var35 && class121.field1696 == 0) {
                    class485.field6851.field5830 = 0;
                    arg3.method2460(class485.field6851.field5886, var32, 0, true);
                    class485.field6851.field5830 = 0;
                    int var36 = -1;
                    String var37;
                    if (var34) {
                        var30 &= 0x7FFF;
                        class125 var38 = class152.method920(false, class485.field6851);
                        var36 = var38.field1714;
                        var37 = var38.field1715.method2313(0, class485.field6851);
                    } else {
                        var37 = class418.method2439(class407.method2391(class277.method1736(false, class485.field6851), 99), (byte) 120);
                    }
                    arg1.field1118 = var37.trim();
                    arg1.field1102 = var30 & 0xFF;
                    arg1.field1084 = 150;
                    arg1.field1078 = var30 >> 8;
                    int var39;
                    if (var31 == 1 || var31 == 2) {
                        var39 = var34 ? 17 : 1;
                    } else {
                        var39 = var34 ? 17 : 2;
                    }
                    if (var31 == 2) {
                        class254.method1581(var36, (byte) -83, "<img=1>" + arg1.method207(80, true), var37, var39, (String) null, 0, "<img=1>" + arg1.method187(false, false));
                    } else if (var31 == 1) {
                        class254.method1581(var36, (byte) 43, "<img=0>" + arg1.method207(99, true), var37, var39, (String) null, 0, "<img=0>" + arg1.method187(false, false));
                    } else {
                        class254.method1581(var36, (byte) 74, arg1.method207(121, true), var37, var39, (String) null, 0, arg1.method187(false, false));
                    }
                }
            }
            arg3.field5830 = var32 + var33;
        }
        if ((arg2 & 0x2000) != 0) {
            arg1.field1095 = arg3.method2497(false);
            arg1.field1098 = arg3.method2480(-8315);
            arg1.field1085 = arg3.method2497(false);
            arg1.field1115 = arg3.method2486(1);
            arg1.field1129 = arg3.method2492((byte) -48) + class356.field4972;
            arg1.field1131 = arg3.method2492((byte) -48) + class356.field4972;
            arg1.field1097 = arg3.method2503(true);
            arg1.field1138 = 0;
            if (arg1.field396 == -1) {
                arg1.field1095 += arg1.field1144[0];
                arg1.field1085 += arg1.field1144[0];
                arg1.field1098 += arg1.field1140[0];
                arg1.field1142 = 1;
                arg1.field1115 += arg1.field1140[0];
            } else {
                arg1.field1098 += arg1.field425;
                arg1.field1142 = 0;
                arg1.field1115 += arg1.field425;
                arg1.field1095 += arg1.field396;
                arg1.field1085 += arg1.field396;
            }
        }
        if ((arg2 & 0x40) != 0) {
            int var40 = arg3.method2474((byte) 125);
            int var41 = arg3.method2459(-90);
            arg1.method514(class356.field4972, var40, var41, (byte) 28);
            arg1.field1069 = class356.field4972 + 300;
            arg1.field1113 = arg3.method2456(-29879);
        }
        if ((arg2 & 0x10) != 0) {
            class238.field3357[arg4] = arg3.method2480(-8315);
        }
        if ((arg2 & 0x2) != 0) {
            int var42 = arg3.method2500(85);
            if (var42 == 65535) {
                var42 = -1;
            }
            int var43 = arg3.method2503(true);
            class487.method2865(var42, var43, 60, arg1);
        }
        if ((arg2 & 0x80) != 0) {
            int var44 = arg3.method2508(true);
            if (var44 == 65535) {
                var44 = -1;
            }
            arg1.field1096 = var44;
        }
        if ((arg2 & 0x4000) != 0) {
            int var45 = class356.field4972;
            int var46 = arg3.method2474((byte) 90);
            int var47 = arg3.method2456(-29879);
            arg1.method514(var45, var46, var47, (byte) -121);
        }
        if ((arg2 & 0x1000) != 0) {
            arg1.field1118 = arg3.method2464(false);
            if (arg1.field1118.charAt(0) == '~') {
                arg1.field1118 = arg1.field1118.substring(1);
                class5.method77(arg1.field1118, 0, arg1.method187(false, false), arg1.method207(107, true), false, 2);
            } else if (class2.field21 == arg1) {
                class5.method77(arg1.field1118, 0, arg1.method187(false, false), arg1.method207(117, true), false, 2);
            }
            arg1.field1084 = 150;
            arg1.field1078 = 0;
            arg1.field1102 = 0;
        }
        if (arg1.field396 == -1) {
            return;
        }
        if (var5 == 127) {
            arg1.method201((byte) -128, arg1.field396, arg1.field425);
            return;
        }
        byte var48;
        if (var5 == -1) {
            var48 = class238.field3357[arg4];
        } else {
            var48 = var5;
        }
        arg1.method196(arg1.field425, arg1.field396, (byte) -126, var48);
    }
}
