import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class199 extends class84 {

    @OriginalMember(owner = "client!wh", name = "M", descriptor = "Ljc;")
    public class246 field2777;

    @OriginalMember(owner = "client!wh", name = "C", descriptor = "I")
    public static int field2768 = 0;

    @OriginalMember(owner = "client!wh", name = "J", descriptor = "I")
    public static int field2774 = 0;

    @OriginalMember(owner = "client!wh", name = "D", descriptor = "I")
    public static int field2769;

    @OriginalMember(owner = "client!wh", name = "H", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!wh", name = "I", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!wh", name = "L", descriptor = "I")
    public static int field2776;

    @OriginalMember(owner = "client!wh", name = "N", descriptor = "I")
    public static int field2778;

    @OriginalMember(owner = "client!wh", name = "K", descriptor = "Lv;")
    public static class152 field2775;

    @OriginalMember(owner = "client!wh", name = "E", descriptor = "Lse;")
    public static class211 field2770;

    @OriginalMember(owner = "client!wh", name = "F", descriptor = "Lhc;")
    public static class235 field2771;

    @OriginalMember(owner = "client!wh", name = "B", descriptor = "[[S")
    public static short[][] field2767;

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "(I)V")
    public static void method1268(int arg0) {
        field2770 = null;
        field2775 = null;
        field2771 = null;
        field2767 = null;
        if (arg0 <= 36) {
            method1272(false, (class235) null, -49, 97, -60, -3);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IILai;Z)V")
    public static final void method1269(int arg0, int arg1, class88 arg2, boolean arg3) {
        field2772++;
        if ((arg1 & 0x800) != 0) {
            int var4 = class233.field3518.method1492(2971768);
            int[] var5 = new int[var4];
            int[] var6 = new int[var4];
            int[] var7 = new int[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                int var9 = class233.field3518.method1474((byte) -115);
                if (var9 == 65535) {
                    var9 = -1;
                }
                var5[var8] = var9;
                var6[var8] = class233.field3518.method1453((byte) -128);
                var7[var8] = class233.field3518.method1465(-1691509480);
            }
            class149.method1004(arg2, var7, var6, var5, -101);
        }
        if (arg3) {
            field2775 = null;
        }
        if ((arg1 & 0x2) != 0) {
            arg2.field4014 = class233.field3518.method1474((byte) -111);
            if (arg2.field4014 == 65535) {
                arg2.field4014 = -1;
            }
        }
        if ((arg1 & 0x100) != 0) {
            int var10 = class233.field3518.method1442(255);
            if (var10 == 65535) {
                var10 = -1;
            }
            boolean var11 = true;
            int var12 = class233.field3518.method1467(4);
            if (var10 != -1 && arg2.field4046 != -1 && class132.method905(true, class82.method512(var10, (byte) 126).field2638).field3671 < class132.method905(true, class82.method512(arg2.field4046, (byte) 101).field2638).field3671) {
                var11 = false;
            }
            if (var11) {
                arg2.field4077 = 0;
                arg2.field4062 = 1;
                arg2.field4061 = 0;
                arg2.field4046 = var10;
                arg2.field4041 = class52.field740 + (var12 & 0xFFFF);
                arg2.field4047 = var12 >> 16;
                if (arg2.field4041 > class52.field740) {
                    arg2.field4077 = -1;
                }
                if (arg2.field4046 != -1 && class52.field740 == arg2.field4041) {
                    int var13 = class82.method512(arg2.field4046, (byte) 80).field2638;
                    if (var13 != -1) {
                        class240 var14 = class132.method905(true, var13);
                        if (var14 != null && var14.field3665 != null) {
                            class116.method781(arg2.field4085, 236, arg2.field4019, class217.field3280 == arg2, 0, var14);
                        }
                    }
                }
            }
        }
        if ((arg1 & 0x400) != 0) {
            int var15 = class233.field3518.method1461(true);
            int var16 = class233.field3518.method1453((byte) -127);
            arg2.method1739(var16, class52.field740, var15, (byte) -99);
        }
        if ((arg1 & 0x20) != 0) {
            int var17 = class233.field3518.method1442(255);
            int var18 = class233.field3518.method1492(2971768);
            int var19 = class233.field3518.method1453((byte) -128);
            int var20 = class233.field3518.field3402;
            boolean var21 = (var17 & 0x8000) != 0;
            if (arg2.field1217 != null && arg2.field1209 != null) {
                long var22 = class73.method465((byte) -120, arg2.field1217);
                boolean var24 = false;
                if (var18 <= 1) {
                    if (!var21 && (class110.field1529 && !class176.field2476 || class266.field4007)) {
                        var24 = true;
                    } else {
                        for (int var25 = 0; var25 < class93.field1300; var25++) {
                            if (class296.field4677[var25] == var22) {
                                var24 = true;
                                break;
                            }
                        }
                    }
                }
                if (!var24 && class103.field1434 == 0) {
                    class109.field1518.field3402 = 0;
                    int var26 = -1;
                    class233.field3518.method1468(5085, var19, 0, class109.field1518.field3336);
                    class109.field1518.field3402 = 0;
                    String var27;
                    if (var21) {
                        var17 &= 0x7FFF;
                        class264 var28 = class212.method1382(class109.field1518, -1);
                        var26 = var28.field3965;
                        var27 = var28.field3971.method610(class109.field1518, 0);
                    } else {
                        var27 = class126.method841(class269.method1782(1, class50.method323(class109.field1518, (byte) 115)));
                    }
                    arg2.field4049 = var27.trim();
                    arg2.field3988 = 150;
                    arg2.field4070 = var17 & 0xFF;
                    arg2.field4057 = var17 >> 8;
                    if (var18 == 2) {
                        class88.method562((String) null, "<img=1>" + arg2.method560(50), var21 ? 17 : 1, var26, !arg3, var27);
                    } else if (var18 == 1) {
                        class88.method562((String) null, "<img=0>" + arg2.method560(50), var21 ? 17 : 1, var26, true, var27);
                    } else {
                        class88.method562((String) null, arg2.method560(50), var21 ? 17 : 2, var26, true, var27);
                    }
                }
            }
            class233.field3518.field3402 = var20 + var19;
        }
        if ((arg1 & 0x1) != 0) {
            int var29 = class233.field3518.method1445(false);
            if (var29 == 65535) {
                var29 = -1;
            }
            int var30 = class233.field3518.method1492(2971768);
            class7.method49(arg2, !arg3, var30, var29);
        }
        if ((arg1 & 0x200) != 0) {
            arg2.field4065 = class233.field3518.method1492(2971768);
            arg2.field4075 = class233.field3518.method1460(2095725128);
            arg2.field4001 = class233.field3518.method1460(2095725128);
            arg2.field4055 = class233.field3518.method1453((byte) -127);
            arg2.field4012 = class233.field3518.method1465(-1691509480) + class52.field740;
            arg2.field3996 = class233.field3518.method1474((byte) -115) + class52.field740;
            arg2.field4072 = class233.field3518.method1460(2095725128);
            arg2.field4027 = 0;
            arg2.field4052 = 1;
        }
        if ((arg1 & 0x10) != 0) {
            int var31 = class233.field3518.method1453((byte) -127);
            byte[] var32 = new byte[var31];
            class224 var33 = new class224(var32);
            class233.field3518.method1457(var32, 0, -90, var31);
            class248.field3803[arg0] = var33;
            arg2.method563(3, var33);
        }
        if ((arg1 & 0x8) != 0) {
            int var34 = class233.field3518.method1461(true);
            int var35 = class233.field3518.method1460(2095725128);
            arg2.method1739(var35, class52.field740, var34, (byte) -37);
            arg2.field4086 = class52.field740 + 300;
            arg2.field4035 = class233.field3518.method1460(2095725128);
        }
        if ((arg1 & 0x40) != 0) {
            arg2.field4049 = class233.field3518.method1455(117);
            if (arg2.field4049.charAt(0) == '~') {
                arg2.field4049 = arg2.field4049.substring(1);
                class283.method1900(arg2.method560(50), arg2.field4049, 2, true);
            } else if (class217.field3280 == arg2) {
                class283.method1900(arg2.method560(50), arg2.field4049, 2, true);
            }
            arg2.field4070 = 0;
            arg2.field3988 = 150;
            arg2.field4057 = 0;
        }
        if ((arg1 & 0x4) != 0) {
            arg2.field4026 = class233.field3518.method1474((byte) -117);
            arg2.field4060 = class233.field3518.method1442(255);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IZ)V")
    public static final void method1270(int arg0, boolean arg1) {
        field2778++;
        class251.field3847 = arg1;
        if (arg0 != -1) {
            field2769 = -14;
        }
        class236.field3586 = !class34.method231(118);
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(IIIIII)V")
    public static final void method1271(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2776++;
        int var6 = class148.method996(class273.field4228, arg1, arg4 ^ 0xFFFFE25F, class127.field1782);
        int var7 = class148.method996(class273.field4228, arg2, 7585, class127.field1782);
        int var8 = class148.method996(class93.field1294, arg5, arg4 + 7587, class296.field4668);
        int var9 = class148.method996(class93.field1294, arg3, arg4 + 7587, class296.field4668);
        if (arg4 == -2) {
            for (int var10 = var6; var10 <= var7; var10++) {
                class154.method1028(-353, class216.field3264[var10], arg0, var8, var9);
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZLhc;IIII)V")
    public static final void method1272(boolean arg0, class235 arg1, int arg2, int arg3, int arg4, int arg5) {
        class202.field2806 = 1;
        class131.field1849 = arg5;
        if (arg2 <= 87) {
            method1269(-99, 106, (class88) null, true);
        }
        field2773++;
        client.field2186 = arg1;
        class122.field1705 = arg4;
        class247.field3782 = arg3;
        class76.field1068 = 10000;
        class82.field1117 = arg0;
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Ljc;)V")
    public class199(class246 arg0) {
        this.field2777 = arg0;
    }
}
