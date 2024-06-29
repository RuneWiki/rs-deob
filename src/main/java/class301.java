import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public abstract class class301 {

    @OriginalMember(owner = "client!bn", name = "g", descriptor = "Ltu;")
    public static class7 field3900 = new class7();

    @OriginalMember(owner = "client!bn", name = "l", descriptor = "[I")
    public static int[] field3905 = new int[5];

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "I")
    public static int field3894;

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "I")
    public static int field3895;

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "I")
    public static int field3896;

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "I")
    public static int field3897;

    @OriginalMember(owner = "client!bn", name = "f", descriptor = "I")
    public static int field3899;

    @OriginalMember(owner = "client!bn", name = "h", descriptor = "I")
    public static int field3901;

    @OriginalMember(owner = "client!bn", name = "e", descriptor = "Ltr;")
    public static class243 field3898;

    @OriginalMember(owner = "client!bn", name = "i", descriptor = "[Llk;")
    public static class311[] field3902;

    @OriginalMember(owner = "client!bn", name = "k", descriptor = "[Leq;")
    public static class504[] field3904;

    @OriginalMember(owner = "client!bn", name = "j", descriptor = "[Z")
    public static boolean[] field3903;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIIIIIII)V", line = 8)
    public static final void method1803(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3899++;
        int var8 = arg5;
        int var9 = arg6;
        int var10 = 0;
        int var11 = arg2 - arg0;
        int var12 = arg6 - arg0;
        int var13 = arg2 * arg2;
        int var14 = arg6 * arg6;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg6 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - (var21 - 1) * var18;
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - (var22 - 1) * var20;
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg6 - 1) * var27;
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        int[] var39 = class333.field4265[arg4];
        class183.method1212(arg1, var39, true, arg7 - arg2, -var11 + arg7);
        class183.method1212(arg3, var39, true, arg7 - var11, arg7 + var11);
        class183.method1212(arg1, var39, true, arg7 + var11, arg2 + arg7);
        while (var9 > 0) {
            boolean var40 = var9 <= var12;
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var31;
                    var24 += var35;
                    var31 += var28;
                    var8++;
                    var35 += var28;
                }
            }
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var26 += var37;
                        var25 += var33;
                        var10++;
                        var33 += var30;
                        var37 += var30;
                    }
                }
                if (var26 < 0) {
                    var26 += var37;
                    var25 += var33;
                    var37 += var30;
                    var33 += var30;
                    var10++;
                }
                var25 += -var38;
                var26 += -var34;
                var38 -= var29;
                var34 -= var29;
            }
            if (var24 < 0) {
                var24 += var35;
                var23 += var31;
                var35 += var28;
                var31 += var28;
                var8++;
            }
            var23 += -var36;
            var24 += -var32;
            var32 -= var27;
            var9--;
            var36 -= var27;
            int var41 = arg4 - var9;
            int var42 = arg4 + var9;
            int var43 = arg7 + var8;
            int var44 = arg7 - var8;
            if (var40) {
                int var45 = arg7 + var10;
                int var46 = arg7 - var10;
                class183.method1212(arg1, class333.field4265[var41], true, var44, var46);
                class183.method1212(arg3, class333.field4265[var41], true, var46, var45);
                class183.method1212(arg1, class333.field4265[var41], true, var45, var43);
                class183.method1212(arg1, class333.field4265[var42], true, var44, var46);
                class183.method1212(arg3, class333.field4265[var42], true, var46, var45);
                class183.method1212(arg1, class333.field4265[var42], true, var45, var43);
            } else {
                class183.method1212(arg1, class333.field4265[var41], true, var44, var43);
                class183.method1212(arg1, class333.field4265[var42], true, var44, var43);
            }
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(III[B)I", line = 184)
    public static final int method1804(int arg0, int arg1, int arg2, byte[] arg3) {
        if (arg2 != 350461212) {
            field3904 = null;
        }
        field3897++;
        int var4 = -1;
        for (int var5 = arg1; var5 < arg0; var5++) {
            var4 = class81.field1017[(var4 ^ arg3[var5]) & 0xFF] ^ var4 >>> 8;
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "()V", line = 213)
    public static final void method1805() {
        class118.field1648 = 0;
        label212: for (int var0 = 0; var0 < class292.field3750; var0++) {
            class504 var1 = field3904[var0];
            if (class493.field7206 != null) {
                for (int var2 = 0; var2 < class493.field7206.length; var2++) {
                    if (class493.field7206[var2] != -1000000 && (var1.field7418 <= class493.field7206[var2] || var1.field7404 <= class493.field7206[var2]) && (var1.field7416 <= class269.field3406[var2] || var1.field7405 <= class269.field3406[var2]) && (var1.field7416 >= class391.field5131[var2] || var1.field7405 >= class391.field5131[var2]) && (var1.field7413 <= class349.field4472[var2] || var1.field7421 <= class349.field4472[var2]) && (var1.field7413 >= class29.field498[var2] || var1.field7421 >= class29.field498[var2])) {
                        continue label212;
                    }
                }
            }
            if (var1.field7407 == 1) {
                int var3 = var1.field7420 + class18.field318 - class225.field2922;
                if (var3 >= 0 && var3 <= class18.field318 + class18.field318) {
                    int var4 = var1.field7419 + class18.field318 - class477.field6969;
                    if (var4 < 0) {
                        var4 = 0;
                    } else if (var4 > class18.field318 + class18.field318) {
                        continue;
                    }
                    int var5 = var1.field7403 + class18.field318 - class477.field6969;
                    if (var5 > class18.field318 + class18.field318) {
                        var5 = class18.field318 + class18.field318;
                    } else if (var5 < 0) {
                        continue;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class357.field4598[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class273.field3472 - var1.field7416;
                        if (var7 > class152.field2043) {
                            var1.field7402 = 1;
                        } else {
                            if (var7 >= -class152.field2043) {
                                continue;
                            }
                            var1.field7402 = 2;
                            var7 = -var7;
                        }
                        var1.field7411 = (var1.field7413 - class436.field5986 << 8) / var7;
                        var1.field7417 = (var1.field7421 - class436.field5986 << 8) / var7;
                        var1.field7408 = (var1.field7418 - class332.field4258 << 8) / var7;
                        var1.field7409 = (var1.field7404 - class332.field4258 << 8) / var7;
                        class193.field2499[class118.field1648++] = var1;
                    }
                }
            } else if (var1.field7407 == 2) {
                int var8 = var1.field7419 + class18.field318 - class477.field6969;
                if (var8 >= 0 && var8 <= class18.field318 + class18.field318) {
                    int var9 = var1.field7420 + class18.field318 - class225.field2922;
                    if (var9 < 0) {
                        var9 = 0;
                    } else if (var9 > class18.field318 + class18.field318) {
                        continue;
                    }
                    int var10 = var1.field7410 + class18.field318 - class225.field2922;
                    if (var10 > class18.field318 + class18.field318) {
                        var10 = class18.field318 + class18.field318;
                    } else if (var10 < 0) {
                        continue;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class357.field4598[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class436.field5986 - var1.field7413;
                        if (var12 > class152.field2043) {
                            var1.field7402 = 3;
                        } else {
                            if (var12 >= -class152.field2043) {
                                continue;
                            }
                            var1.field7402 = 4;
                            var12 = -var12;
                        }
                        var1.field7415 = (var1.field7416 - class273.field3472 << 8) / var12;
                        var1.field7412 = (var1.field7405 - class273.field3472 << 8) / var12;
                        var1.field7408 = (var1.field7418 - class332.field4258 << 8) / var12;
                        var1.field7409 = (var1.field7404 - class332.field4258 << 8) / var12;
                        class193.field2499[class118.field1648++] = var1;
                    }
                }
            } else if (var1.field7407 == 4) {
                int var13 = var1.field7418 - class332.field4258;
                if (var13 > class419.field5571) {
                    int var14 = var1.field7419 + class18.field318 - class477.field6969;
                    if (var14 < 0) {
                        var14 = 0;
                    } else if (var14 > class18.field318 + class18.field318) {
                        continue;
                    }
                    int var15 = var1.field7403 + class18.field318 - class477.field6969;
                    if (var15 > class18.field318 + class18.field318) {
                        var15 = class18.field318 + class18.field318;
                    } else if (var15 < 0) {
                        continue;
                    }
                    int var16 = var1.field7420 + class18.field318 - class225.field2922;
                    if (var16 < 0) {
                        var16 = 0;
                    } else if (var16 > class18.field318 + class18.field318) {
                        continue;
                    }
                    int var17 = var1.field7410 + class18.field318 - class225.field2922;
                    if (var17 > class18.field318 + class18.field318) {
                        var17 = class18.field318 + class18.field318;
                    } else if (var17 < 0) {
                        continue;
                    }
                    boolean var18 = false;
                    label184: for (int var19 = var16; var19 <= var17; var19++) {
                        for (int var20 = var14; var20 <= var15; var20++) {
                            if (class357.field4598[var19][var20]) {
                                var18 = true;
                                break label184;
                            }
                        }
                    }
                    if (var18) {
                        var1.field7402 = 5;
                        var1.field7415 = (var1.field7416 - class273.field3472 << 8) / var13;
                        var1.field7412 = (var1.field7405 - class273.field3472 << 8) / var13;
                        var1.field7411 = (var1.field7413 - class436.field5986 << 8) / var13;
                        var1.field7417 = (var1.field7421 - class436.field5986 << 8) / var13;
                        class193.field2499[class118.field1648++] = var1;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(III)Lrr;", line = 465)
    public static final class303 method1806(int arg0, int arg1, int arg2) {
        class510 var3 = class470.field6877[arg0][arg1][arg2];
        return var3 == null ? null : var3.field7485;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IILeo;Lqa;I)V", line = 472)
    public static final void method1807(int arg0, int arg1, class423 arg2, class129 arg3, int arg4) {
        field3896++;
        class113 var5 = arg2.method2498(25733, arg3);
        if (var5 == null) {
            return;
        }
        arg3.method925(arg4, arg0, arg2.field5735 + arg4, arg2.field5726 + arg0);
        if (class461.field6450 == 2 || class461.field6450 == 5 || class198.field2557 == null) {
            arg3.method912(-16777216, var5, arg4, arg0);
        } else {
            int var6;
            int var7;
            int var8;
            int var9;
            if (class396.field5271 == 4) {
                var7 = (int) (-class244.field3138) & 0x3FFF;
                var8 = 4096;
                var9 = class265.field3369;
                var6 = class157.field2069;
            } else {
                var6 = class37.field573.field6239;
                var7 = (int) (-class244.field3138) + class446.field6192 & 0x3FFF;
                var8 = 4096 - class364.field4694 * 16;
                var9 = class37.field573.field6241;
            }
            int var10 = (var6 / 32) + 48 + 208 - (class200.field2594 * 2);
            int var11 = class118.field1647 * 4 + 48 - ((class118.field1647 - 104) * 2) - (var9 / 32);
            class198.field2557.method2408((float) arg2.field5735 / 2.0F + (float) arg4, (float) arg2.field5726 / 2.0F + (float) arg0, (float) var10, (float) var11, var8, var7 << 2, var5, arg4, arg0);
            for (class206 var12 = (class206) class74.field930.method49(-126); var12 != null; var12 = (class206) class74.field930.method46((byte) 112)) {
                int var54 = var12.field2681;
                int var55 = (class28.field475.field835[var54] >> 14 & 0x3FFF) - class35.field545;
                int var56 = (class28.field475.field835[var54] & 0x3FFF) - class336.field4299;
                int var57 = var55 * 4 + 2 - (var6 / 32);
                int var58 = var56 * 4 + 2 - (var9 / 32);
                class117.method753(arg3, var5, var57, arg2, var58, arg0, class28.field475.field833[var54], arg4, arg1 ^ 0x21);
            }
            for (int var13 = 0; var13 < class201.field2633; var13++) {
                int var51 = class298.field3866[var13] * 4 + 2 - (var6 / 32);
                int var52 = class371.field4825[var13] * 4 + 2 - (var9 / 32);
                class402 var53 = class52.field715.method1164(class6.field55[var13], 0);
                if (var53.field5419 != null) {
                    var53 = var53.method2393(class198.field2555, (byte) 32);
                    if (var53 == null || var53.field5335 == -1) {
                        continue;
                    }
                }
                class117.method753(arg3, var5, var51, arg2, var52, arg0, var53.field5335, arg4, 1);
            }
            for (class237 var14 = (class237) class376.field4885.method2087(0); var14 != null; var14 = (class237) class376.field4885.method2091(-128)) {
                int var48 = (int) (var14.field7456 >> 28 & 0x3L);
                if (class202.field2648 == var48) {
                    int var49 = (int) (var14.field7456 & 0x3FFFL) * 4 + 2 - (var6 / 32);
                    int var50 = (int) (var14.field7456 >> 14 & 0x3FFFL) * 4 + 2 - (var9 / 32);
                    class519.method3087(arg4, var5, var50, (byte) -120, var49, arg2, arg0, class54.field745[0]);
                }
            }
            for (int var15 = 0; var15 < class16.field264; var15++) {
                class295 var44 = class527.field7791[class414.field5507[var15]];
                if (var44 != null && var44.method1772(-6181) && class37.field573.field6220 == var44.field6220) {
                    class10 var45 = var44.field3831;
                    if (var45 != null && var45.field111 != null) {
                        var45 = var45.method63(false, class198.field2555);
                    }
                    if (var45 != null && var45.field125 && var45.field99) {
                        int var46 = var44.field6239 / 32 - (var6 / 32);
                        int var47 = var44.field6241 / 32 - (var9 / 32);
                        if (var45.field162 == -1) {
                            class519.method3087(arg4, var5, var47, (byte) -125, var46, arg2, arg0, class54.field745[1]);
                        } else {
                            class117.method753(arg3, var5, var46, arg2, var47, arg0, var45.field162, arg4, 1);
                        }
                    }
                }
            }
            int var16 = class206.field2684;
            int[] var17 = class143.field1892;
            for (int var18 = 0; var18 < var16; var18++) {
                class518 var36 = class76.field952[var17[var18]];
                if (var36 != null && var36.method3078(-6181) && class37.field573 != var36 && class37.field573.field6220 == var36.field6220) {
                    int var37 = var36.field6239 / 32 - (var6 / 32);
                    int var38 = var36.field6241 / 32 - var9 / 32;
                    boolean var39 = false;
                    for (int var40 = 0; var40 < class364.field4692; var40++) {
                        if (var36.field7630.equals(class231.field2996[var40]) && class208.field2705[var40] != 0) {
                            var39 = true;
                            break;
                        }
                    }
                    boolean var41 = false;
                    for (int var42 = 0; var42 < class192.field2492; var42++) {
                        if (var36.field7630.equals(class238.field3092[var42].field4307)) {
                            var41 = true;
                            break;
                        }
                    }
                    boolean var43 = false;
                    if (class37.field573.field7624 != 0 && var36.field7624 != 0 && class37.field573.field7624 == var36.field7624) {
                        var43 = true;
                    }
                    if (var36.field7649) {
                        class519.method3087(arg4, var5, var38, (byte) -124, var37, arg2, arg0, class54.field745[6]);
                    } else if (var39) {
                        class519.method3087(arg4, var5, var38, (byte) -114, var37, arg2, arg0, class54.field745[3]);
                    } else if (var41) {
                        class519.method3087(arg4, var5, var38, (byte) -115, var37, arg2, arg0, class54.field745[5]);
                    } else if (var43) {
                        class519.method3087(arg4, var5, var38, (byte) -121, var37, arg2, arg0, class54.field745[4]);
                    } else {
                        class519.method3087(arg4, var5, var38, (byte) -127, var37, arg2, arg0, class54.field745[2]);
                    }
                }
            }
            class208[] var19 = class509.field7472;
            for (int var20 = 0; var20 < var19.length; var20++) {
                class208 var23 = var19[var20];
                if (var23 != null && var23.field2697 != 0 && (class264.field3353 % 20) < 10) {
                    if (var23.field2697 == 1 && var23.field2693 >= 0 && class527.field7791.length > var23.field2693) {
                        class295 var24 = class527.field7791[var23.field2693];
                        if (var24 != null) {
                            int var25 = var24.field6239 / 32 - (var6 / 32);
                            int var26 = var24.field6241 / 32 - var9 / 32;
                            class415.method2439(360000L, arg2, 68, var26, var25, arg4, var5, var23.field2703, arg0);
                        }
                    }
                    if (var23.field2697 == 2) {
                        int var27 = var23.field2699 / 32 - (var6 / 32);
                        int var28 = var23.field2696 / 32 - (var9 / 32);
                        long var29 = (long) (var23.field2694 << 5);
                        long var31 = var29 * var29;
                        class415.method2439(var31, arg2, -57, var28, var27, arg4, var5, var23.field2703, arg0);
                    }
                    if (var23.field2697 == 10 && var23.field2693 >= 0 && var23.field2693 < class76.field952.length) {
                        class518 var33 = class76.field952[var23.field2693];
                        if (var33 != null) {
                            int var34 = var33.field6239 / 32 - var6 / 32;
                            int var35 = var33.field6241 / 32 - var9 / 32;
                            class415.method2439(360000L, arg2, 96, var35, var34, arg4, var5, var23.field2703, arg0);
                        }
                    }
                }
            }
            if (class396.field5271 != 4) {
                if (class429.field5919 != 0) {
                    int var21 = class429.field5919 * 4 + (-(var6 / 32) - -((class37.field573.method2342(arg1 + 10772) + -1) * 2)) + 2;
                    int var22 = (class138.field1847 * 4 - -((class37.field573.method2342(10804) - 1) * 2)) + 2 - (var9 / 32);
                    class519.method3087(arg4, var5, var22, (byte) -123, var21, arg2, arg0, class475.field6950[class403.field5425 ? 1 : 0]);
                }
                arg3.method866(3, -5152, arg4 + (arg2.field5735 / 2) - 1, 3, arg2.field5726 / 2 + arg0 - 1, -1);
            }
        }
        if (arg1 != 32) {
            method1804(114, -9, 99, null);
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lsj;I)V", line = 766)
    public static final void method1808(class502 arg0, int arg1) {
        field3894++;
        if (arg1 == 29581 && !class450.field6267) {
            arg0.method3021(-128);
            class271.field3433--;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(B)V", line = 782)
    public static final void method1809(byte arg0) {
        class249.field3175.method90((byte) -27);
        field3901++;
        class24.field429.method90((byte) -27);
        class412.field5493.method90((byte) -27);
        class248.field3172.method90((byte) -27);
        class256.field3238.method90((byte) -27);
        int var1 = 93 % ((arg0 + 46) / 45);
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(B)V", line = 797)
    public static void method1810(byte arg0) {
        field3904 = null;
        field3903 = null;
        field3905 = null;
        field3900 = null;
        field3902 = null;
        field3898 = null;
        if (arg0 != 12) {
            field3905 = null;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Ljo;Z)Ljo;")
    public abstract class377 method290(class377 arg0, boolean arg1);
}
