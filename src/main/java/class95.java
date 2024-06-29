import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public abstract class class95 {

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "[I")
    public static int[] field1137 = new int[5];

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "I")
    public static int field1138;

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "I")
    public static int field1139;

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "I")
    public static int field1140;

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(B)V", line = 6)
    public static void method526(byte arg0) {
        field1137 = null;
        if (arg0 != -124) {
            method530(-55, -121, false, 98, -20, -7, -28, 104, 29, -32, (byte) 39);
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(ILdg;)Ljava/lang/String;", line = 17)
    public static final String method527(int arg0, class236 arg1) {
        field1138++;
        if (arg0 >= -86) {
            method527(1, (class236) null);
        }
        return class362.method2333(true, 32767, arg1);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Ltq;I)I", line = 29)
    public static final int method528(class376 arg0, int arg1) {
        field1141++;
        if (arg1 < 8) {
            return 99;
        }
        int var2 = 0;
        if (arg0.method2412(class161.field2134, 124)) {
            var2++;
        }
        if (arg0.method2412(class163.field2222, 124)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIZIIIIIIIB)Z", line = 52)
    public static final boolean method530(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, byte arg10) {
        field1139++;
        if (arg10 != -45) {
            method528((class376) null, 49);
        }
        int var11 = class399.method2543(arg9, arg7, arg2, arg10 ^ 0xAC, arg1, class241.field3427, class102.field1247[class129.field1570], arg4, class384.field5422.method242(-30129), arg3, arg5, arg0, arg8, arg6, class113.field1384);
        if (var11 < 1) {
            return false;
        }
        class33.field386 = class241.field3427[var11 - 1];
        class443.field6343 = class113.field1384[var11 - 1];
        class360.field5136 = false;
        class385.method2472((byte) 27);
        return true;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(ILae;II)V", line = 81)
    public static final void method531(int arg0, class134 arg1, int arg2, int arg3) {
        field1140++;
        if (~arg2 > arg3 || arg0 < 0 || class62.field719 == 0 || class246.field3509 == 0) {
            return;
        }
        arg1.method652(class65.field740, class164.field2320, class62.field719, class246.field3509);
        arg1.method660(class143.field1756, class250.field3561, class62.field719, class246.field3509);
        class18 var4 = arg1.method639();
        var4.method131(class400.field5724, class88.field1077, class233.field3273, class1.field4, class365.field5186, class258.field3694);
        arg1.method628(var4);
        if (class98.field1191 != null) {
            int var5 = -1;
            int var6 = -1;
            int var7 = arg1.method629();
            int var8 = (arg2 - class65.field740) * var7 / class62.field719;
            int var9 = (arg0 - class164.field2320) * var7 / class246.field3509;
            int var10 = arg1.method670();
            int var11 = (arg2 - class65.field740) * var10 / class62.field719;
            int var12 = (arg0 - class164.field2320) * var10 / class246.field3509;
            int[] var13 = new int[] { var8, var9, var7 };
            var4.method121(var13);
            int[] var14 = new int[] { var11, var12, var10 };
            var4.method121(var14);
            float var15 = 0.0F;
            int var16 = var14[0] - var13[0];
            int var17 = var14[1] - var13[1];
            int var18 = var14[2] - var13[2];
            while (var15 < 1.0F) {
                int var19 = (int) ((float) var16 * var15 + (float) var13[0]);
                int var20 = var19 >> 7;
                int var21 = (int) ((float) var18 * var15 + (float) var13[2]);
                int var22 = var21 >> 7;
                if (var20 > 0 && var22 > 0 && class176.field2403 > var20 && class383.field5395 > var22) {
                    int var23 = class129.field1570;
                    if (var23 < 3 && (class399.field5699[1][var20][var22] & 0x2) != 0) {
                        var23++;
                    }
                    if ((float) class98.field1191[var23].method342(var19, var21) < (float) var17 * var15 + (float) var13[1]) {
                        var5 = class384.field5422.method242(-30129) * 64 - (64 - var19) >> 7;
                        var6 = class384.field5422.method242(-30129) * 64 + var21 - 64 >> 7;
                        break;
                    }
                }
                var15 = (float) ((double) var15 + 0.01D);
            }
            if (var5 != -1 && var6 != -1) {
                if (class279.field3951 && (class347.field4901 & 0x40) != 0) {
                    class184 var24 = class341.method2186(class408.field5883, (byte) 21, class188.field2714);
                    if (var24 == null) {
                        class3.method13(-11372);
                    } else {
                        class421.method2660(var5, " ->", class22.field279, class154.field1907, 0L, var6, 12, (byte) 29);
                    }
                } else {
                    if (class384.field5425 == 1) {
                        class421.method2660(var5, "", -1, class193.field2794.method2331(25, class271.field3836), 0L, var6, 45, (byte) 44);
                    }
                    class102.field1245++;
                    class421.method2660(var5, "", -1, class408.field5878, 0L, var6, 21, (byte) 68);
                }
            }
        }
        class393 var25 = class134.field1615;
        for (class186 var26 = (class186) var25.method2509((byte) 51); var26 != null; var26 = (class186) var25.method2515(0)) {
            if (var26.method1282(0, arg1, arg0, arg2) && class129.field1570 == var26.field2702) {
                if (var26.field2703 instanceof class40) {
                    class40 var27 = (class40) var26.field2703;
                    int var28 = var27.method242(-30129);
                    if ((var28 & 0x1) == 0 && (var27.field3284 & 0x7F) == 0 && (var27.field3269 & 0x7F) == 0 || (var28 & 0x1) == 1 && (var27.field3284 & 0x7F) == 64 && (var27.field3269 & 0x7F) == 64) {
                        int var29 = var27.field3284 - (var27.method242(-30129) - 1) * 64;
                        int var30 = var27.field3269 - ((var27.method242(-30129) - 1) * 64);
                        for (int var31 = 0; var31 < class102.field1250; var31++) {
                            class77 var36 = class167.field2335[class86.field981[var31]];
                            if (var36 != null && class189.field2726 != var36.field5648 && var36.field5581) {
                                int var37 = var36.field3284 + 64 - var36.field912.field1697 * 64;
                                int var38 = var36.field3269 - ((var36.field912.field1697 - 1) * 64);
                                if (var29 <= var37 && var36.field912.field1697 <= (var27.method242(arg3 - 30128) - (var37 - var29 >> 7)) && var30 <= var38 && var36.field912.field1697 <= var27.method242(-30129) - (var38 - var30 >> 7)) {
                                    class296.method1953(var36, (byte) -85);
                                    var36.field5648 = class189.field2726;
                                }
                            }
                        }
                        for (int var32 = 0; var32 < class305.field4287; var32++) {
                            class40 var33 = class26.field314[class94.field1135[var32]];
                            if (var33 != null && class189.field2726 != var33.field5648 && var27 != var33 && var33.field5581) {
                                int var34 = var33.field3284 - (var33.method242(arg3 - 30128) - 1) * 64;
                                int var35 = var33.field3269 - (var33.method242(-30129) - 1) * 64;
                                if (var34 >= var29 && var33.method242(arg3 ^ 0x75B0) <= (var27.method242(arg3 - 30128) - (var34 - var29 >> 7)) && var30 <= var35 && var33.method242(-30129) <= var27.method242(-30129) - (var35 - var30 >> 7)) {
                                    class203.method1348((byte) -85, var33);
                                    var33.field5648 = class189.field2726;
                                }
                            }
                        }
                    }
                    if (class189.field2726 == var27.field5648) {
                        continue;
                    }
                    class203.method1348((byte) -98, var27);
                    var27.field5648 = class189.field2726;
                }
                if (var26.field2703 instanceof class77) {
                    class77 var39 = (class77) var26.field2703;
                    if (var39.field912 != null) {
                        if ((var39.field912.field1697 & 0x1) == 0 && (var39.field3284 & 0x7F) == 0 && (var39.field3269 & 0x7F) == 0 || (var39.field912.field1697 & 0x1) == 1 && (var39.field3284 & 0x7F) == 64 && (var39.field3269 & 0x7F) == 64) {
                            int var40 = var39.field3284 - ((var39.field912.field1697 - 1) * 64);
                            int var41 = 64 - (var39.field912.field1697 * 64 - var39.field3269);
                            for (int var42 = 0; var42 < class102.field1250; var42++) {
                                class77 var47 = class167.field2335[class86.field981[var42]];
                                if (var47 != null && class189.field2726 != var47.field5648 && var39 != var47 && var47.field5581) {
                                    int var48 = var47.field3284 - (var47.field912.field1697 - 1) * 64;
                                    int var49 = var47.field3269 + 64 - (var47.field912.field1697 * 64);
                                    if (var48 >= var40 && (var39.field912.field1697 - (var48 - var40 >> 7)) >= var47.field912.field1697 && var49 >= var41 && var39.field912.field1697 - (var49 - var41 >> 7) >= var47.field912.field1697) {
                                        class296.method1953(var47, (byte) -57);
                                        var47.field5648 = class189.field2726;
                                    }
                                }
                            }
                            for (int var43 = 0; var43 < class305.field4287; var43++) {
                                class40 var44 = class26.field314[class94.field1135[var43]];
                                if (var44 != null && class189.field2726 != var44.field5648 && var44.field5581) {
                                    int var45 = var44.field3284 - (var44.method242(arg3 - 30128) - 1) * 64;
                                    int var46 = var44.field3269 - (var44.method242(-30129) - 1) * 64;
                                    if (var45 >= var40 && var44.method242(-30129) <= (var39.field912.field1697 - (var45 - var40 >> 7)) && var41 <= var46 && var44.method242(-30129) <= var39.field912.field1697 - (var46 - var41 >> 7)) {
                                        class203.method1348((byte) -96, var44);
                                        var44.field5648 = class189.field2726;
                                    }
                                }
                            }
                        }
                        if (class189.field2726 == var39.field5648) {
                            continue;
                        }
                        class296.method1953(var39, (byte) -127);
                        var39.field5648 = class189.field2726;
                    }
                }
                if (var26.field2703 instanceof class35) {
                    class282 var50 = (class282) class330.field4663.method1888((long) (var26.field2702 << 28 | var26.field2701 << 14 | var26.field2695), (byte) -30);
                    if (var50 != null) {
                        for (class89 var51 = (class89) var50.field3989.method510((byte) 105); var51 != null; var51 = (class89) var50.field3989.method512(-2)) {
                            class163 var52 = class50.method288(0, var51.field1084);
                            if (class279.field3951) {
                                class41 var57 = class4.field52 == -1 ? null : class401.method2555(class4.field52, 1024);
                                if ((class347.field4901 & 0x1) != 0 && (var57 == null || var52.method1094(class4.field52, -22036, var57.field499) != var57.field499)) {
                                    class323.field4605++;
                                    class421.method2660(var26.field2695, class253.field3613 + " -> <col=ff9040>" + var52.field2238, class22.field279, class154.field1907, (long) var51.field1084, var26.field2701, 46, (byte) 45);
                                }
                            } else {
                                String[] var53 = var52.field2261;
                                for (int var54 = 4; var54 >= 0; var54--) {
                                    if (var53 != null && var53[var54] != null) {
                                        byte var55 = 0;
                                        if (var54 == 0) {
                                            var55 = 58;
                                        }
                                        int var56 = class403.field5780;
                                        if (var54 == 1) {
                                            var55 = 11;
                                        }
                                        if (var54 == 2) {
                                            var55 = 57;
                                        }
                                        if (var54 == 3) {
                                            var55 = 6;
                                        }
                                        if (var54 == 4) {
                                            var55 = 22;
                                        }
                                        if (var52.field2262 == var54) {
                                            var56 = var52.field2268;
                                        }
                                        if (var52.field2255 == var54) {
                                            var56 = var52.field2240;
                                        }
                                        class421.method2660(var26.field2695, "<col=ff9040>" + var52.field2238, var56, var53[var54], (long) var51.field1084, var26.field2701, var55, (byte) 89);
                                        class89.field1079++;
                                    }
                                }
                                class189.field2720++;
                                class421.method2660(var26.field2695, "<col=ff9040>" + var52.field2238, class355.field5008, class404.field5833.method2331(25, class271.field3836), (long) var51.field1084, var26.field2701, 1001, (byte) 92);
                            }
                        }
                    }
                }
                if (var26.field2703 instanceof class9) {
                    class9 var58 = (class9) var26.field2703;
                    class88 var59 = class374.method2382(var58.method71((byte) -119), false);
                    if (var59.field1068 != null) {
                        var59 = var59.method480(122);
                    }
                    if (var59 != null) {
                        if (class279.field3951) {
                            class41 var64 = class4.field52 == -1 ? null : class401.method2555(class4.field52, 1024);
                            if ((class347.field4901 & 0x4) != 0 && (var64 == null || var59.method483(var64.field499, class4.field52, (byte) 107) != var64.field499)) {
                                class379.field5337++;
                                class421.method2660(var26.field2695, class253.field3613 + " -> <col=00ffff>" + var59.field1004, class22.field279, class154.field1907, class101.method558((byte) 127, var26.field2701, var26.field2695, var58), var26.field2701, 25, (byte) 96);
                            }
                        } else {
                            String[] var60 = var59.field1020;
                            if (var60 != null) {
                                for (int var61 = 4; var61 >= 0; var61--) {
                                    if (var60[var61] != null) {
                                        short var62 = 0;
                                        if (var61 == 0) {
                                            var62 = 19;
                                        }
                                        int var63 = class403.field5780;
                                        if (var61 == 1) {
                                            var62 = 15;
                                        }
                                        if (var61 == 2) {
                                            var62 = 3;
                                        }
                                        if (var61 == 3) {
                                            var62 = 13;
                                        }
                                        if (var59.field1043 == var61) {
                                            var63 = var59.field1061;
                                        }
                                        if (var61 == 4) {
                                            var62 = 1008;
                                        }
                                        if (var59.field1013 == var61) {
                                            var63 = var59.field1050;
                                        }
                                        class421.method2660(var26.field2695, "<col=00ffff>" + var59.field1004, var63, var60[var61], class101.method558((byte) 127, var26.field2701, var26.field2695, var58), var26.field2701, var62, (byte) 30);
                                        class33.field377++;
                                    }
                                }
                            }
                            class192.field2758++;
                            class421.method2660(var26.field2695, "<col=00ffff>" + var59.field1004, class355.field5008, class404.field5833.method2331(25, class271.field3836), (long) var59.field1026, var26.field2701, 1009, (byte) 116);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)[B")
    public abstract byte[] method525(int arg0);

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I[B)V")
    public abstract void method529(int arg0, byte[] arg1);
}
