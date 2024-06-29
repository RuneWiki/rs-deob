import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class299 {

    @OriginalMember(owner = "client!er", name = "k", descriptor = "Ljava/lang/String;")
    public String field4245;

    @OriginalMember(owner = "client!er", name = "e", descriptor = "Ljava/lang/String;")
    public String field4239;

    @OriginalMember(owner = "client!er", name = "b", descriptor = "I")
    public int field4236;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "I")
    public int field4235;

    @OriginalMember(owner = "client!er", name = "i", descriptor = "J")
    public long field4243;

    @OriginalMember(owner = "client!er", name = "c", descriptor = "I")
    public static int field4237 = -1;

    @OriginalMember(owner = "client!er", name = "g", descriptor = "[S")
    public static short[] field4241 = new short[256];

    @OriginalMember(owner = "client!er", name = "f", descriptor = "I")
    public static int field4240 = 0;

    @OriginalMember(owner = "client!er", name = "d", descriptor = "F")
    public static float field4238;

    @OriginalMember(owner = "client!er", name = "j", descriptor = "I")
    public static int field4244;

    @OriginalMember(owner = "client!er", name = "l", descriptor = "I")
    public static int field4246;

    @OriginalMember(owner = "client!er", name = "m", descriptor = "I")
    public static int field4247;

    @OriginalMember(owner = "client!er", name = "h", descriptor = "[Lfd;")
    public static class298[] field4242;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Z[[[BIBIIZ)V", line = 9)
    public static final void method1972(boolean arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5, boolean arg6) {
        int var7 = arg0 ? 1 : 0;
        class450.field6246 = 0;
        class477.field6643 = 0;
        class463.field6452++;
        if ((arg5 & 0x2) == 0) {
            for (class318 var8 = class234.field3474[var7]; var8 != null; var8 = var8.field4412) {
                if (!class336.method2136(var8, arg0, arg1, arg2, arg3)) {
                    class1.method7(var8);
                    if (var8.field4409 != -1) {
                        class324.field4481[class450.field6246++] = var8;
                    }
                }
            }
        }
        if ((arg5 & 0x1) == 0) {
            for (class318 var9 = class333.field4710[var7]; var9 != null; var9 = var9.field4412) {
                if (!class336.method2136(var9, arg0, arg1, arg2, arg3)) {
                    class1.method7(var9);
                    if (var9.field4409 != -1) {
                        class274.field3967[class477.field6643++] = var9;
                    }
                }
            }
            for (class318 var10 = class204.field2694[var7]; var10 != null; var10 = var10.field4412) {
                if (!class336.method2136(var10, arg0, arg1, arg2, arg3)) {
                    if (var10.method785(-118)) {
                        class1.method7(var10);
                        if (var10.field4409 != -1) {
                            class274.field3967[class477.field6643++] = var10;
                        }
                    } else {
                        class1.method7(var10);
                        if (var10.field4409 != -1) {
                            class324.field4481[class450.field6246++] = var10;
                        }
                    }
                }
            }
            if (!arg0) {
                for (int var11 = 0; var11 < class323.field4472; var11++) {
                    if (!class336.method2136(class529.field7337[var11], arg0, arg1, arg2, arg3)) {
                        class1.method7(class529.field7337[var11]);
                        if (class529.field7337[var11].field4409 != -1) {
                            if (class529.field7337[var11].method785(-126)) {
                                class274.field3967[class477.field6643++] = class529.field7337[var11];
                            } else {
                                class324.field4481[class450.field6246++] = class529.field7337[var11];
                            }
                        }
                    }
                }
            }
        }
        if (class450.field6246 > 0) {
            class491.method2983(class324.field4481, 0, class450.field6246 - 1);
            for (int var12 = 0; var12 < class450.field6246; var12++) {
                class139.method921(class324.field4481[var12], true, arg6);
            }
        }
        if (class518.field7229) {
            class441.field6132.method1532(0, null);
        }
        if ((arg5 & 0x2) == 0) {
            for (int var13 = class259.field3750; var13 < class370.field5229; var13++) {
                if (var13 < arg2 || arg1 == null) {
                    int var23 = class417.field5900.length;
                    if (class417.field5900.length + class334.field4716 > class61.field877) {
                        var23 -= class417.field5900.length + class334.field4716 - class61.field877;
                    }
                    int var24 = class417.field5900[0].length;
                    if (class417.field5900[0].length + class621.field8318 > class713.field9959) {
                        var24 -= class417.field5900[0].length + class621.field8318 - class713.field9959;
                    }
                    boolean[][] var25 = class679.field9426;
                    if (class369.field5216) {
                        if (class520.field7248) {
                            var25 = class172.field2387[var13];
                        }
                        for (int var26 = class252.field3695; var26 < var23; var26++) {
                            int var27 = class334.field4716 + var26 - class252.field3695;
                            for (int var28 = class141.field1997; var28 < var24; var28++) {
                                if (class417.field5900[var26][var28] && !class409.method2565(class621.field8318 + var28 - class141.field1997, var13, var27, 0)) {
                                    var25[var26][var28] = true;
                                } else {
                                    var25[var26][var28] = false;
                                }
                            }
                        }
                    }
                    if (class520.field7248) {
                        if (arg4 >= 0) {
                            class433.field6043[var13].method1043(0, 0, 0, null, false, arg4, arg5);
                        } else {
                            class433.field6043[var13].method1027(0, 0, 0, null, false, arg5);
                        }
                        for (int var29 = 0; var29 < class265.field3895; var29++) {
                            class690.field9610[var29].method3948((byte) 112, new class488(var13 + 1));
                        }
                    } else if (arg4 >= 0) {
                        class433.field6043[var13].method1043(class103.field1410, class307.field4314, class218.field2854, class679.field9426, true, arg4, arg5);
                    } else {
                        class433.field6043[var13].method1027(class103.field1410, class307.field4314, class218.field2854, class679.field9426, true, arg5);
                    }
                } else {
                    int var14 = class417.field5900.length;
                    if (class417.field5900.length + class334.field4716 > class61.field877) {
                        var14 -= class417.field5900.length + class334.field4716 - class61.field877;
                    }
                    int var15 = class417.field5900[0].length;
                    if (class417.field5900[0].length + class621.field8318 > class713.field9959) {
                        var15 -= class417.field5900[0].length + class621.field8318 - class713.field9959;
                    }
                    boolean[][] var16 = class679.field9426;
                    if (class369.field5216) {
                        if (class520.field7248) {
                            var16 = class172.field2387[var13];
                        }
                        for (int var17 = class252.field3695; var17 < var14; var17++) {
                            int var18 = class334.field4716 + var17 - class252.field3695;
                            for (int var19 = class141.field1997; var19 < var15; var19++) {
                                var16[var17][var19] = false;
                                if (class417.field5900[var17][var19]) {
                                    int var20 = class621.field8318 + var19 - class141.field1997;
                                    for (int var21 = var13; var21 >= 0; var21--) {
                                        if (class137.field1948[var21][var18][var20] != null && class137.field1948[var21][var18][var20].field3852 == var13) {
                                            if ((var21 < arg2 || arg1[var21][var18][var20] != arg3) && !class409.method2565(var20, var13, var18, 0)) {
                                                var16[var17][var19] = true;
                                                break;
                                            }
                                            var16[var17][var19] = false;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (class520.field7248) {
                        if (arg4 >= 0) {
                            class433.field6043[var13].method1043(0, 0, 0, null, false, arg4, arg5);
                        } else {
                            class433.field6043[var13].method1027(0, 0, 0, null, false, arg5);
                        }
                        for (int var22 = 0; var22 < class265.field3895; var22++) {
                            class690.field9610[var22].method3948((byte) -123, new class488(var13 + 1));
                        }
                    } else if (arg4 >= 0) {
                        class433.field6043[var13].method1043(class103.field1410, class307.field4314, class218.field2854, class679.field9426, false, arg4, arg5);
                    } else {
                        class433.field6043[var13].method1027(class103.field1410, class307.field4314, class218.field2854, class679.field9426, false, arg5);
                    }
                }
            }
        }
        if (class477.field6643 > 0) {
            class48.method350(class274.field3967, 0, class477.field6643 - 1);
            for (int var30 = 0; var30 < class477.field6643; var30++) {
                class139.method921(class274.field3967[var30], true, arg6);
            }
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(BI[Ljava/awt/Rectangle;)V", line = 315)
    public static final void method1973(byte arg0, int arg1, Rectangle[] arg2) throws class692 {
        if (class521.field7260 == 1) {
            class496.field6948.method282(arg2, arg1, class154.field2107, class26.field325);
        } else {
            class496.field6948.method282(arg2, arg1, 0, 0);
        }
        field4246++;
        int var3 = 28 / ((arg0 - 40) / 34);
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(I)V", line = 336)
    public static void method1974(int arg0) {
        field4242 = null;
        if (arg0 != 26902) {
            method1975(38, -74, -28, 97, 101);
        }
        field4241 = null;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IIIII)V", line = 347)
    public static final void method1975(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 <= arg3) {
            class102.method675(arg2, 51, arg1, arg3, class538.field7454[arg0]);
        } else {
            class102.method675(arg2, -29, arg3, arg1, class538.field7454[arg0]);
        }
        field4247++;
        int var5 = -101 % ((arg4 + 26) / 36);
    }

    @OriginalMember(owner = "client!er", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V", line = 366)
    public class299(int arg0, String arg1, int arg2, String arg3, long arg4) {
        this.field4245 = arg3;
        this.field4239 = arg1;
        this.field4236 = arg0;
        this.field4235 = arg2;
        this.field4243 = arg4;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(III)Ldaa;", line = 378)
    public static final class346 method1976(int arg0, int arg1, int arg2) {
        field4244++;
        class346 var3 = (class346) class63.field987.method812(120, (long) arg1 << 32 | (long) arg2);
        if (var3 == null) {
            var3 = new class346(arg1, arg2);
            class63.field987.method820(var3.field1079, (byte) -42, var3);
        }
        return arg0 == 0 ? var3 : null;
    }
}
