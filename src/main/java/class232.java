import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class232 extends class106 {

    @OriginalMember(owner = "client!ff", name = "U", descriptor = "Ljava/lang/Object;")
    private Object field4013;

    @OriginalMember(owner = "client!ff", name = "M", descriptor = "I")
    public static int field4005 = -1;

    @OriginalMember(owner = "client!ff", name = "L", descriptor = "[[I")
    public static int[][] field4004 = new int[5][5000];

    @OriginalMember(owner = "client!ff", name = "N", descriptor = "I")
    public static int field4006;

    @OriginalMember(owner = "client!ff", name = "O", descriptor = "I")
    public static int field4007;

    @OriginalMember(owner = "client!ff", name = "Q", descriptor = "I")
    public static int field4009;

    @OriginalMember(owner = "client!ff", name = "R", descriptor = "I")
    public static int field4010;

    @OriginalMember(owner = "client!ff", name = "T", descriptor = "I")
    public static int field4012;

    @OriginalMember(owner = "client!ff", name = "V", descriptor = "I")
    public static int field4014;

    @OriginalMember(owner = "client!ff", name = "S", descriptor = "Lhi;")
    public static class26 field4011;

    @OriginalMember(owner = "client!ff", name = "P", descriptor = "Led;")
    public static class49 field4008;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)V", line = 23)
    public static final void method1639(int arg0, int arg1) {
        if (class209.field3539 == null || arg0 > class209.field3539.length) {
            class209.field3539 = new int[arg0];
        }
        if (arg1 > 87) {
            field4007++;
        }
    }

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "(I)Z", line = 38)
    public final boolean method15(int arg0) {
        field4012++;
        if (arg0 != 3) {
            method1639(124, -7);
        }
        return false;
    }

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "(I)V", line = 58)
    public static final void method1640(int arg0) {
        field4014++;
        if (class254.field4319 != null) {
            return;
        }
        if (arg0 != 6652) {
            field4008 = (class49) null;
        }
        if (class164.field2674 != null) {
            return;
        }
        int var1 = class235.field4049;
        if (class80.field1341) {
            if (var1 != 1) {
                int var6 = class275.field4725;
                int var7 = class221.field3795;
                if (var6 < class206.field3498 - 10 || (class206.field3498 + class250.field4246 + 10) < var6 || var7 < (class162.field2632 - 10) || var7 > (class276.field4751 + class162.field2632 + 10)) {
                    class80.field1341 = false;
                    class267.method1840(class206.field3498, class276.field4751, class162.field2632, 0, class250.field4246);
                }
            }
            if (var1 == 1) {
                int var8 = class250.field4246;
                int var9 = class206.field3498;
                int var10 = class162.field2632;
                int var11 = class171.field2786;
                int var12 = class207.field3520;
                int var13 = -1;
                for (int var14 = 0; var14 < class195.field3293; var14++) {
                    int var15 = (class195.field3293 - var14 - 1) * 15 + (var10 + 31);
                    if (var9 < var11 && (var8 + var9) > var11 && var12 > (var15 - 13) && var12 < (var15 + 3)) {
                        var13 = var14;
                    }
                }
                if (var13 != -1) {
                    class131.method961(var13, Integer.MAX_VALUE);
                }
                class80.field1341 = false;
                class267.method1840(class206.field3498, class276.field4751, class162.field2632, arg0 ^ 0x19FC, class250.field4246);
            }
            return;
        }
        if (var1 == 1 && class195.field3293 > 0) {
            short var2 = class286.field4892[class195.field3293 - 1];
            if (var2 == 36 || var2 == 29 || var2 == 22 || var2 == 48 || var2 == 6 || var2 == 37 || var2 == 45 || var2 == 20 || var2 == 46 || var2 == 35 || var2 == 23 || var2 == 1004) {
                int var3 = class109.field1766[class195.field3293 - 1];
                int var4 = class212.field3557[class195.field3293 - 1];
                class191 var5 = class1.method2(var3, (byte) -37);
                if (class111.method860(client.method2058(var5), arg0 ^ 0x1B0828DC) || class164.method1184(arg0 + 1494577281, client.method2058(var5))) {
                    class270.field4586 = 0;
                    class304.field5239 = false;
                    if (class254.field4319 != null) {
                        class250.method1744(class254.field4319, (byte) 94);
                    }
                    class254.field4319 = class1.method2(var3, (byte) -37);
                    class227.field3944 = class171.field2786;
                    class237.field4065 = var4;
                    class146.field2311 = class207.field3520;
                    class250.method1744(class254.field4319, (byte) 116);
                    return;
                }
            }
        }
        if (var1 == 1 && (class240.field4090 == 1 && class195.field3293 > 2 || class195.method1373((byte) 77, class195.field3293 - 1))) {
            var1 = 2;
        }
        if (var1 == 2 && class195.field3293 > 0 || class218.field3769 == 1) {
            class96.method763(18141);
        }
        if (var1 == 1 && class195.field3293 > 0 || class218.field3769 == 2) {
            class36.method237(-1);
        }
    }

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "(I)V", line = 190)
    public static void method1641(int arg0) {
        field4011 = null;
        field4004 = (int[][]) null;
        field4008 = null;
        if (arg0 != 1783363559) {
            field4011 = (class26) null;
        }
    }

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "(B)Ljava/lang/Object;", line = 202)
    public final Object method16(byte arg0) {
        if (arg0 <= 114) {
            return (Object) null;
        } else {
            field4009++;
            return this.field4013;
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(II)V", line = 216)
    public static final void method1642(int arg0, int arg1) {
        if (arg0 != 21247) {
            return;
        }
        class272 var2 = (class272) class222.field3829.method311((byte) 114, (long) arg1);
        field4006++;
        if (var2 != null) {
            for (int var3 = 0; var3 < var2.field4627.length; var3++) {
                var2.field4627[var3] = -1;
                var2.field4625[var3] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIII[BZ[Lwc;I)V", line = 244)
    public static final void method1643(int arg0, int arg1, int arg2, int arg3, byte[] arg4, boolean arg5, class218[] arg6, int arg7) {
        if (!arg5) {
            for (int var8 = 0; var8 < 4; var8++) {
                for (int var9 = 0; var9 < 64; var9++) {
                    for (int var10 = 0; var10 < 64; var10++) {
                        if ((arg7 + var9) > 0 && arg7 + var9 < 103 && arg1 + var10 > 0 && arg1 + var10 < 103) {
                            arg6[var8].field3756[arg7 + var9][arg1 + var10] = class234.method1648(arg6[var8].field3756[arg7 + var9][arg1 + var10], -16777217);
                        }
                    }
                }
            }
        }
        field4010++;
        byte var11;
        if (arg5) {
            var11 = 1;
        } else {
            var11 = 4;
        }
        int var12 = -5 / ((arg0 - 11) / 44);
        class92 var13 = new class92(arg4);
        for (int var14 = 0; var14 < var11; var14++) {
            for (int var15 = 0; var15 < 64; var15++) {
                for (int var16 = 0; var16 < 64; var16++) {
                    class49.method318(0, var14, var13, 8, arg2, arg3, arg1 + var16, arg5, arg7 + var15);
                }
            }
        }
        if (arg5) {
            return;
        }
        class307 var17 = null;
        while (true) {
            while (var13.field1476 < var13.field1495.length) {
                int var18 = var13.method702(-1);
                if (var18 == 0) {
                    var17 = new class307(var13);
                } else if (var18 == 1) {
                    int var19 = var13.method702(-1);
                    if (var19 > 0) {
                        for (int var20 = 0; var20 < var19; var20++) {
                            class292 var21 = new class292(var13);
                            var21.field4962 += arg7 << 7;
                            int var22 = var21.field4962 >> 7;
                            var21.field4959 += arg1 << 7;
                            int var23 = var21.field4959 >> 7;
                            if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104) {
                                var21.field4973 = class37.field569[var21.field4969][var22][var23] - var21.field4973;
                                class117.method902(var21);
                            }
                        }
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
            if (var17 == null) {
                var17 = new class307();
            }
            for (int var24 = 0; var24 < 8; var24++) {
                for (int var25 = 0; var25 < 8; var25++) {
                    int var26 = (arg7 >> 3) + var24;
                    int var27 = (arg1 >> 3) + var25;
                    if (var26 >= 0 && var26 < 13 && var27 >= 0 && var27 < 13) {
                        class215.field3648[var26][var27] = var17;
                    }
                }
            }
            break;
        }
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 401)
    public class232(Object arg0) {
        this.field4013 = arg0;
    }
}
