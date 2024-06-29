import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class317 extends class108 {

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "I")
    public static int field5030 = -1;

    @OriginalMember(owner = "client!ob", name = "l", descriptor = "Ljava/lang/String;")
    public static String field5034 = "";

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "I")
    public static int field5031;

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "I")
    public static int field5032;

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "I")
    public static int field5033;

    @OriginalMember(owner = "client!ob", name = "m", descriptor = "I")
    public static int field5035;

    @OriginalMember(owner = "client!ob", name = "o", descriptor = "I")
    public static int field5037;

    @OriginalMember(owner = "client!ob", name = "n", descriptor = "[Lwm;")
    public static class168[] field5036;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "(I)V", line = 4)
    public static void method2181(int arg0) {
        field5034 = null;
        if (arg0 >= 101) {
            field5036 = null;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(III)Z", line = 21)
    public static final boolean method2182(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class139.field2558; var3++) {
            class38 var4 = class159.field2809[var3];
            if (var4.field574 == 1) {
                int var5 = var4.field559 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field561 * var5 >> 8) + var4.field570;
                    int var7 = (var4.field576 * var5 >> 8) + var4.field562;
                    int var8 = (var4.field557 * var5 >> 8) + var4.field571;
                    int var9 = (var4.field555 * var5 >> 8) + var4.field569;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field574 == 2) {
                int var10 = arg0 - var4.field559;
                if (var10 > 0) {
                    int var11 = (var4.field561 * var10 >> 8) + var4.field570;
                    int var12 = (var4.field576 * var10 >> 8) + var4.field562;
                    int var13 = (var4.field557 * var10 >> 8) + var4.field571;
                    int var14 = (var4.field555 * var10 >> 8) + var4.field569;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field574 == 3) {
                int var15 = var4.field570 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field549 * var15 >> 8) + var4.field559;
                    int var17 = (var4.field564 * var15 >> 8) + var4.field577;
                    int var18 = (var4.field557 * var15 >> 8) + var4.field571;
                    int var19 = (var4.field555 * var15 >> 8) + var4.field569;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field574 == 4) {
                int var20 = arg2 - var4.field570;
                if (var20 > 0) {
                    int var21 = (var4.field549 * var20 >> 8) + var4.field559;
                    int var22 = (var4.field564 * var20 >> 8) + var4.field577;
                    int var23 = (var4.field557 * var20 >> 8) + var4.field571;
                    int var24 = (var4.field555 * var20 >> 8) + var4.field569;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field574 == 5) {
                int var25 = arg1 - var4.field571;
                if (var25 > 0) {
                    int var26 = (var4.field549 * var25 >> 8) + var4.field559;
                    int var27 = (var4.field564 * var25 >> 8) + var4.field577;
                    int var28 = (var4.field561 * var25 >> 8) + var4.field570;
                    int var29 = (var4.field576 * var25 >> 8) + var4.field562;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(BIILwh;I)V", line = 145)
    public static final void method2183(byte arg0, int arg1, int arg2, class12 arg3, int arg4) {
        field5032++;
        if (class293.field4708 >= 400) {
            return;
        }
        if (arg3.field179 != null) {
            arg3 = arg3.method122(97);
        }
        if (arg3 == null || !arg3.field197) {
            return;
        }
        String var5 = arg3.field148;
        if (arg3.field139 != 0) {
            String var6 = class72.field1199 == 1 ? class121.field2099 : class41.field614;
            var5 = var5 + class36.method322(class218.field3632.field3480, arg3.field139, -94) + " (" + var6 + arg3.field139 + ")";
        }
        if (arg0 >= -107) {
            method2183((byte) 25, -80, 97, (class12) null, -9);
        }
        if (class93.field1458 == 1) {
            class75.field1232++;
            class86.method770((short) 37, class207.field3516 + " -> <col=ffff00>" + var5, class198.field3388, 57, class12.field166, (long) arg2, arg4, arg1);
        } else if (class179.field3027) {
            class53 var7 = class52.field811 == -1 ? null : class223.method1631(class52.field811, 11);
            if ((class161.field2861 & 0x2) != 0 && (var7 == null || arg3.method125(class52.field811, var7.field832, -105) != var7.field832)) {
                class86.method770((short) 9, class28.field386 + " -> <col=ffff00>" + var5, class50.field784, 90, class292.field4681, (long) arg2, arg4, arg1);
                class142.field2607++;
            }
        } else {
            class291.field4657++;
            String[] var8 = arg3.field164;
            if (class49.field778) {
                var8 = class172.method1354(var8, 38);
            }
            if (var8 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var8[var9] != null && (class72.field1199 != 0 || !var8[var9].equalsIgnoreCase(class308.field4904))) {
                        class36.field516++;
                        int var10 = -1;
                        byte var11 = 0;
                        if (arg3.field167 == var9) {
                            var10 = arg3.field195;
                        }
                        if (var9 == 0) {
                            var11 = 3;
                        }
                        if (var9 == 1) {
                            var11 = 40;
                        }
                        if (arg3.field138 == var9) {
                            var10 = arg3.field165;
                        }
                        if (var9 == 2) {
                            var11 = 20;
                        }
                        if (var9 == 3) {
                            var11 = 33;
                        }
                        if (var9 == 4) {
                            var11 = 60;
                        }
                        class86.method770(var11, "<col=ffff00>" + var5, var8[var9], 115, var10, (long) arg2, arg4, arg1);
                    }
                }
            }
            if (class72.field1199 == 0 && var8 != null) {
                for (int var12 = 4; var12 >= 0; var12--) {
                    if (var8[var12] != null && var8[var12].equalsIgnoreCase(class308.field4904)) {
                        class133.field2276++;
                        short var13 = 0;
                        if (var12 == 0) {
                            var13 = 3;
                        }
                        short var14 = 0;
                        if (class218.field3632.field3480 < arg3.field139) {
                            var14 = 2000;
                        }
                        if (var12 == 1) {
                            var13 = 40;
                        }
                        if (var12 == 2) {
                            var13 = 20;
                        }
                        if (var12 == 3) {
                            var13 = 33;
                        }
                        if (var12 == 4) {
                            var13 = 60;
                        }
                        if (var13 != 0) {
                            var13 += var14;
                        }
                        class86.method770(var13, "<col=ffff00>" + var5, var8[var12], 96, arg3.field193, (long) arg2, arg4, arg1);
                    }
                }
            }
            class86.method770((short) 1006, "<col=ffff00>" + var5, class120.field2077, 88, class44.field703, (long) arg2, arg4, arg1);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IB[III)V", line = 312)
    public static final void method2184(int arg0, byte arg1, int[] arg2, int arg3, int arg4) {
        field5037++;
        arg4--;
        int var7 = arg0 - 1;
        int var5 = var7 - 7;
        while (arg4 < var5) {
            int var8 = arg4 + 1;
            arg2[var8] = arg3;
            int var9 = var8 + 1;
            arg2[var9] = arg3;
            int var10 = var9 + 1;
            arg2[var10] = arg3;
            int var11 = var10 + 1;
            arg2[var11] = arg3;
            int var12 = var11 + 1;
            arg2[var12] = arg3;
            int var13 = var12 + 1;
            arg2[var13] = arg3;
            int var14 = var13 + 1;
            arg2[var14] = arg3;
            arg4 = var14 + 1;
            arg2[arg4] = arg3;
        }
        while (arg4 < var7) {
            arg4++;
            arg2[arg4] = arg3;
        }
        int var6 = -102 / ((arg1 - 38) / 43);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IB)V", line = 342)
    public static final void method2185(int arg0, byte arg1) {
        if (arg1 >= 54) {
            field5031++;
            class38.field552 = (class325) class137.field2370.method732((long) arg0, true);
        }
    }
}
