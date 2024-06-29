import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public abstract class class511 extends class496 {

    @OriginalMember(owner = "client!hq", name = "p", descriptor = "Los;")
    public class468 field7589;

    @OriginalMember(owner = "client!hq", name = "n", descriptor = "Lqu;")
    public static class364 field7587 = new class364(9, 7);

    @OriginalMember(owner = "client!hq", name = "s", descriptor = "I")
    public static int field7592 = -60;

    @OriginalMember(owner = "client!hq", name = "t", descriptor = "F")
    public static float field7593;

    @OriginalMember(owner = "client!hq", name = "i", descriptor = "I")
    public static int field7582;

    @OriginalMember(owner = "client!hq", name = "j", descriptor = "I")
    public static int field7583;

    @OriginalMember(owner = "client!hq", name = "k", descriptor = "I")
    public static int field7584;

    @OriginalMember(owner = "client!hq", name = "m", descriptor = "I")
    public static int field7586;

    @OriginalMember(owner = "client!hq", name = "q", descriptor = "I")
    public static int field7590;

    @OriginalMember(owner = "client!hq", name = "r", descriptor = "I")
    public static int field7591;

    @OriginalMember(owner = "client!hq", name = "u", descriptor = "I")
    public static int field7594;

    @OriginalMember(owner = "client!hq", name = "w", descriptor = "I")
    public static int field7596;

    @OriginalMember(owner = "client!hq", name = "l", descriptor = "Ldd;")
    public static class166 field7585;

    @OriginalMember(owner = "client!hq", name = "v", descriptor = "Lbca;")
    public static class286 field7595;

    @OriginalMember(owner = "client!hq", name = "o", descriptor = "Z")
    public boolean field7588;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(I)Z")
    public abstract boolean method576(int arg0);

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "(I)I")
    public int method583(int arg0) {
        if (arg0 != 1) {
            field7593 = -1.2139628F;
        }
        field7583++;
        return 0;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(ILot;Lot;I)V")
    public abstract void method580(int arg0, class210 arg1, class210 arg2, int arg3);

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IILwca;Lqa;I)V")
    public static final void method3047(int arg0, int arg1, class311 arg2, class167 arg3, int arg4) {
        field7590++;
        if (arg1 >= -31) {
            return;
        }
        class594 var5 = arg2.method1920(arg3, 0);
        if (var5 == null) {
            return;
        }
        arg3.method1022(arg0, arg4, arg2.field4543 + arg0, arg2.field4620 + arg4);
        if (class529.field7847 == 2 || class529.field7847 == 5 || class293.field4302 == null) {
            arg3.method956(-16777216, var5, arg0, arg4);
            return;
        }
        int var6;
        int var7;
        int var8;
        int var9;
        if (class287.field4232 == 4) {
            var8 = class293.field4306;
            var7 = class392.field5713;
            var9 = 4096;
            var6 = (int) (-class591.field8752) & 0x3FFF;
        } else {
            var6 = (int) (-class591.field8752) + class225.field3322 & 0x3FFF;
            var7 = class239.field3493.field3463;
            var8 = class239.field3493.field3464;
            var9 = 4096 - (class99.field1254 * 16);
        }
        int var10 = var8 / 32 + (48 - (class35.field399 * 2 - 208));
        int var11 = (class382.field5586 * 4) - (class382.field5586 * 2) - ((var7 / 32) - 208 - 48);
        class293.field4302.method713((float) arg2.field4543 / 2.0F + (float) arg0, (float) arg2.field4620 / 2.0F + (float) arg4, (float) var10, (float) var11, var9, var6 << 2, var5, arg0, arg4);
        for (class269 var12 = (class269) class88.field1128.method2496((byte) 102); var12 != null; var12 = (class269) class88.field1128.method2494(76)) {
            int var58 = var12.field3986;
            int var59 = (class517.field7688.field2901[var58] >> 14 & 0x3FFF) - class584.field8677;
            int var60 = (class517.field7688.field2901[var58] & 0x3FFF) - class424.field6061;
            int var61 = var59 * 4 + 2 - (var8 / 32);
            int var62 = var60 * 4 + 2 - (var7 / 32);
            class266.method1699(var61, false, class517.field7688.field2898[var58], arg2, var5, arg3, arg4, var62, arg0);
        }
        for (int var13 = 0; var13 < class461.field6669; var13++) {
            int var55 = class336.field4941[var13] * 4 + 2 - (var8 / 32);
            int var56 = class162.field2161[var13] * 4 - ((var7 / 32) - 2);
            class158 var57 = class312.field4690.method2004(false, class419.field6023[var13]);
            if (var57.field2035 != null) {
                var57 = var57.method923(-121, class406.field5823);
                if (var57 == null || var57.field2021 == -1) {
                    continue;
                }
            }
            class266.method1699(var55, false, var57.field2021, arg2, var5, arg3, arg4, var56, arg0);
        }
        for (class368 var14 = (class368) class546.field8147.method1331(-1925); var14 != null; var14 = (class368) class546.field8147.method1340((byte) 103)) {
            int var50 = (int) (var14.field7465 >> 28 & 0x3L);
            if (class117.field1529 == var50) {
                int var51 = (int) (var14.field7465 & 0x3FFFL) - class584.field8677;
                int var52 = (int) (var14.field7465 >> 14 & 0x3FFFL) - class424.field6061;
                int var53 = var51 * 4 + 2 - (var8 / 32);
                int var54 = var52 * 4 - (var7 / 32 - 2);
                class169.method1075(var54, true, arg0, class319.field4756[0], var53, arg2, arg4, var5);
            }
        }
        for (int var15 = 0; var15 < class567.field8409; var15++) {
            class234 var45 = (class234) class627.field9185.method1333((long) class25.field230[var15], false);
            if (var45 != null) {
                class383 var46 = var45.field3443;
                if (var46.method2320(7772) && class239.field3493.field3457 == var46.field3457) {
                    class429 var47 = var46.field5601;
                    if (var47 != null && var47.field6238 != null) {
                        var47 = var47.method2629(class406.field5823, (byte) 112);
                    }
                    if (var47 != null && var47.field6248 && var47.field6296) {
                        int var48 = var46.field3464 / 32 - (var8 / 32);
                        int var49 = var46.field3463 / 32 - (var7 / 32);
                        if (var47.field6265 == -1) {
                            class169.method1075(var49, true, arg0, class319.field4756[1], var48, arg2, arg4, var5);
                        } else {
                            class266.method1699(var48, false, var47.field6265, arg2, var5, arg3, arg4, var49, arg0);
                        }
                    }
                }
            }
        }
        int var16 = class264.field3925;
        int[] var17 = class533.field7895;
        for (int var18 = 0; var18 < var16; var18++) {
            class179 var37 = class383.field5604[var17[var18]];
            if (var37 != null && var37.method1195(7772) && class239.field3493 != var37 && class239.field3493.field3457 == var37.field3457) {
                int var38 = var37.field3464 / 32 - (var8 / 32);
                int var39 = var37.field3463 / 32 - (var7 / 32);
                boolean var40 = false;
                for (int var41 = 0; var41 < class156.field1993; var41++) {
                    if (var37.field2718.equals(class417.field5994[var41]) && class526.field7779[var41] != 0) {
                        var40 = true;
                        break;
                    }
                }
                boolean var42 = false;
                for (int var43 = 0; var43 < class127.field1684; var43++) {
                    if (var37.field2718.equals(class625.field9168[var43].field8333)) {
                        var42 = true;
                        break;
                    }
                }
                boolean var44 = false;
                if (class239.field3493.field2725 != 0 && var37.field2725 != 0 && class239.field3493.field2725 == var37.field2725) {
                    var44 = true;
                }
                if (var37.field2744) {
                    class169.method1075(var39, true, arg0, class319.field4756[6], var38, arg2, arg4, var5);
                } else if (var40) {
                    class169.method1075(var39, true, arg0, class319.field4756[3], var38, arg2, arg4, var5);
                } else if (var42) {
                    class169.method1075(var39, true, arg0, class319.field4756[5], var38, arg2, arg4, var5);
                } else if (var44) {
                    class169.method1075(var39, true, arg0, class319.field4756[4], var38, arg2, arg4, var5);
                } else {
                    class169.method1075(var39, true, arg0, class319.field4756[2], var38, arg2, arg4, var5);
                }
            }
        }
        class67[] var19 = class255.field3737;
        for (int var20 = 0; var20 < var19.length; var20++) {
            class67 var23 = var19[var20];
            if (var23 != null && var23.field769 != 0 && (class576.field8505 % 20) < 10) {
                if (var23.field769 == 1) {
                    class234 var24 = (class234) class627.field9185.method1333((long) var23.field776, false);
                    if (var24 != null) {
                        class383 var25 = var24.field3443;
                        int var26 = var25.field3464 / 32 - (var8 / 32);
                        int var27 = var25.field3463 / 32 - var7 / 32;
                        class127.method790(var23.field767, arg4, var5, arg2, var26, var27, arg0, (byte) 5, 360000L);
                    }
                }
                if (var23.field769 == 2) {
                    int var28 = var23.field766 / 32 - var8 / 32;
                    int var29 = var23.field764 / 32 - (var7 / 32);
                    long var30 = (long) (var23.field774 << 5);
                    long var32 = var30 * var30;
                    class127.method790(var23.field767, arg4, var5, arg2, var28, var29, arg0, (byte) 5, var32);
                }
                if (var23.field769 == 10 && var23.field776 >= 0 && var23.field776 < class383.field5604.length) {
                    class179 var34 = class383.field5604[var23.field776];
                    if (var34 != null) {
                        int var35 = var34.field3464 / 32 - (var8 / 32);
                        int var36 = var34.field3463 / 32 - (var7 / 32);
                        class127.method790(var23.field767, arg4, var5, arg2, var35, var36, arg0, (byte) 5, 360000L);
                    }
                }
            }
        }
        if (class287.field4232 == 4) {
            return;
        }
        if (class415.field5969 != 0) {
            int var21 = class415.field5969 * 4 + (class239.field3493.method514(0) - 1) * 2 + 2 - (var8 / 32);
            int var22 = (class158.field2058 * 4 - (var7 / 32) - (-(class239.field3493.method514(0) * 2) - -2)) + 2;
            class169.method1075(var22, true, arg0, class3.field34[class121.field1566 ? 1 : 0], var21, arg2, arg4, var5);
        }
        arg3.method1066((byte) 47, arg4 + (arg2.field4620 / 2) - 1, -1, arg2.field4543 / 2 + (arg0 - 1), 3, 3);
        return;
    }

    @OriginalMember(owner = "client!hq", name = "c", descriptor = "(I)I")
    public final int method3048(int arg0) {
        if (arg0 != 32) {
            this.method582(84);
        }
        field7591++;
        return 1;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(III)V")
    public abstract void method587(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(B)Z")
    public final boolean method3049(byte arg0) {
        int var2 = -43 / ((arg0 + 36) / 56);
        field7586++;
        return this.field7588;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(II)V")
    public abstract void method586(int arg0, int arg1);

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "([I[IILlk;[I)V")
    public static final void method3050(int[] arg0, int[] arg1, int arg2, class383 arg3, int[] arg4) {
        if (arg2 != -1) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length; var5++) {
            int var6 = arg0[var5];
            int var7 = arg1[var5];
            int var8 = arg4[var5];
            int var9 = 0;
            while (var7 != 0 && arg3.field1074.length > var9) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg3.field1074[var9] = null;
                    } else {
                        class224 var10 = class470.field7205.method3498(false, var6);
                        int var11 = var10.field3301;
                        class251 var12 = arg3.field1074[var9];
                        if (var12 != null) {
                            if (var12.field3649 == var6) {
                                if (var11 == 0) {
                                    var12 = arg3.field1074[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field3646 = var8;
                                    var12.field3653 = 0;
                                    var12.field3654 = 0;
                                    var12.field3644 = 1;
                                    var12.field3651 = 0;
                                    class295.method1830(0, arg3.field3463, (byte) 73, arg3.field3457, var10, false, arg3.field3464);
                                } else if (var11 == 2) {
                                    var12.field3653 = 0;
                                }
                            } else if (var10.field3308 >= class470.field7205.method3498(false, var12.field3649).field3308) {
                                var12 = arg3.field1074[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class251 var13 = arg3.field1074[var9] = new class251();
                            var13.field3644 = 1;
                            var13.field3651 = 0;
                            var13.field3649 = var6;
                            var13.field3653 = 0;
                            var13.field3646 = var8;
                            var13.field3654 = 0;
                            class295.method1830(0, arg3.field3463, (byte) 95, arg3.field3457, var10, false, arg3.field3464);
                        }
                    }
                }
                var9++;
                var7 >>>= 0x1;
            }
        }
        field7582++;
    }

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "(III)Z")
    public static final boolean method3051(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            method3047(-79, 49, null, null, -16);
        }
        field7594++;
        return (arg2 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "(B)Z")
    public final boolean method3052(byte arg0) {
        field7596++;
        int var2 = -50 / ((-arg0 - 33) / 50);
        return false;
    }

    @OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Los;)V")
    public class511(class468 arg0) {
        this.field7589 = arg0;
    }

    @OriginalMember(owner = "client!hq", name = "c", descriptor = "(B)V")
    public abstract void method585(byte arg0);

    @OriginalMember(owner = "client!hq", name = "g", descriptor = "(I)V")
    public static void method3053(int arg0) {
        field7585 = null;
        field7587 = null;
        field7595 = null;
        if (arg0 != 1) {
            field7587 = null;
        }
    }

    @OriginalMember(owner = "client!hq", name = "h", descriptor = "(I)Z")
    public abstract boolean method582(int arg0);

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lfba;")
    public static final class519 method3054(Throwable arg0, String arg1) {
        field7584++;
        class519 var2;
        if ((arg0 instanceof class519)) {
            var2 = (class519) arg0;
            var2.field7713 = var2.field7713 + ' ' + arg1;
        } else {
            var2 = new class519(arg0, arg1);
        }
        return var2;
    }
}
