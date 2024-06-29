import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class201 extends class273 {

    @OriginalMember(owner = "client!o", name = "K", descriptor = "[S")
    public static short[] field3267 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!o", name = "N", descriptor = "Lpl;")
    public static class255 field3270 = new class255(0, 0);

    @OriginalMember(owner = "client!o", name = "R", descriptor = "Z")
    public static boolean field3274 = true;

    @OriginalMember(owner = "client!o", name = "S", descriptor = "Ljava/lang/String;")
    public static String field3275 = "Walk here";

    @OriginalMember(owner = "client!o", name = "J", descriptor = "I")
    public static int field3266;

    @OriginalMember(owner = "client!o", name = "L", descriptor = "I")
    public static int field3268;

    @OriginalMember(owner = "client!o", name = "M", descriptor = "I")
    public static int field3269;

    @OriginalMember(owner = "client!o", name = "O", descriptor = "I")
    public static int field3271;

    @OriginalMember(owner = "client!o", name = "P", descriptor = "I")
    public static int field3272;

    @OriginalMember(owner = "client!o", name = "Q", descriptor = "Ljava/awt/Frame;")
    public static Frame field3273;

    @OriginalMember(owner = "client!o", name = "e", descriptor = "(I)V")
    public static void method1356(int arg0) {
        field3270 = null;
        field3273 = null;
        field3275 = null;
        field3267 = null;
        if (arg0 != 4) {
            method1356(-34);
        }
    }

    @OriginalMember(owner = "client!o", name = "f", descriptor = "(I)V")
    public static final void method1357(int arg0) {
        class105.method779(4, class282.field4476);
        int var1 = (class170.field2787 >> 3) + (class148.field2434 >> 10);
        byte var2 = 0;
        ++field3266;
        byte var3 = 8;
        int var4 = (class31.field527 >> 10) + (class256.field4082 >> 3);
        if (arg0 <= -1) {
            byte var5 = 8;
            byte var6 = 18;
            class216.field3474 = new byte[var6][];
            class92.field1460 = new int[var6];
            class106.field1624 = new int[var6];
            class40.field688 = new int[var6];
            class250.field3988 = new int[var6];
            class266.field4245 = new byte[var6][];
            class178.field2967 = new byte[var6][];
            class26.field460 = new int[var6];
            class268.field4291 = new int[var6];
            class209.field3352 = new int[var6][4];
            int var7 = 0;
            for (int var8 = (var4 + -6) / 8; ~((var4 + 6) / 8) <= ~var8; ++var8) {
                for (int var10 = (var1 - 6) / 8; ~var10 >= ~((var1 + 6) / 8); ++var10) {
                    int var11 = (var8 << 8) - -var10;
                    class268.field4291[var7] = var11;
                    class106.field1624[var7] = class91.field1431.method889("m" + var8 + "_" + var10, -1);
                    class250.field3988[var7] = class91.field1431.method889("l" + var8 + "_" + var10, -1);
                    class92.field1460[var7] = class91.field1431.method889("n" + var8 + "_" + var10, -1);
                    class40.field688[var7] = class91.field1431.method889("um" + var8 + "_" + var10, -1);
                    class26.field460[var7] = class91.field1431.method889("ul" + var8 + "_" + var10, -1);
                    if (class92.field1460[var7] == -1) {
                        class106.field1624[var7] = -1;
                        class250.field3988[var7] = -1;
                        class40.field688[var7] = -1;
                        class26.field460[var7] = -1;
                    }
                    ++var7;
                }
            }
            for (int var9 = var7; ~var9 > ~class92.field1460.length; ++var9) {
                class92.field1460[var9] = -1;
                class106.field1624[var9] = -1;
                class250.field3988[var9] = -1;
                class40.field688[var9] = -1;
                class26.field460[var9] = -1;
            }
            class206.method1387((byte) 106, var4, var3, true, false, var2, var1, var5);
        }
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(ZI)V")
    public static final void method1358(boolean arg0, int arg1) {
        int[] var2 = null;
        ++field3272;
        if (arg1 == 7) {
            byte[][] var3 = class216.field3474;
            byte var4 = 4;
            for (int var5 = 0; ~var5 > ~var4; ++var5) {
                class260.method1738(true);
                for (int var6 = 0; ~var6 > -14; ++var6) {
                    for (int var7 = 0; var7 < 13; ++var7) {
                        boolean var8 = false;
                        int var9 = class72.field1196[var5][var6][var7];
                        if (var9 != -1) {
                            int var10 = 3 & var9 >> 24;
                            if (!arg0 || ~var10 == -1) {
                                int var11 = (16768322 & var9) >> 14;
                                int var12 = (7 & var9) >> 1;
                                int var13 = (var9 & 16376) >> 3;
                                int var14 = (var11 / 8 << 8) + var13 / 8;
                                for (int var15 = 0; ~var15 > ~class268.field4291.length; ++var15) {
                                    if (~class268.field4291[var15] == ~var14 && var3[var15] != null) {
                                        int[] var16 = class118.method866(var5, var13, var12, var10, var3[var15], class141.field2352, var7 * 8, -1403374237, arg0, var6 * 8, var11);
                                        var8 = true;
                                        if (var2 == null && var16 != null) {
                                            var2 = var16;
                                        }
                                        break;
                                    }
                                }
                            }
                        }
                        if (!var8) {
                            class48.method414(var5, var6 * 8, 8, var7 * 8, arg1 ^ 6, 8);
                        }
                    }
                }
            }
            if (var2 != null) {
                class240.field3781 = var2[2];
                class180.field2999 = var2[4];
                class107.field1632 = var2[1];
                class142.field2354 = var2[3];
                class1.field2 = var2[0];
            } else {
                class1.field2 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Luf;IIII)V")
    public static final void method1359(class165 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3269;
        if (class42.field776 < 400) {
            if (arg0.field2741 != null) {
                arg0 = arg0.method1188((byte) -73);
            }
            if (arg0 != null) {
                if (arg0.field2737) {
                    String var5 = arg0.field2718;
                    if (arg0.field2736 != arg4) {
                        String var6 = ~class238.field3752 != -2 ? class8.field93 : class19.field282;
                        var5 = var5 + class235.method1562(class48.field878.field3425, arg0.field2736, -4) + " (" + var6 + arg0.field2736 + ")";
                    }
                    if (class219.field3514 != 1) {
                        if (!class239.field3761) {
                            ++class37.field627;
                            String[] var7 = arg0.field2712;
                            if (class11.field156) {
                                var7 = class56.method449((byte) -30, var7);
                            }
                            if (var7 != null) {
                                for (int var8 = 4; ~var8 <= -1; --var8) {
                                    if (var7[var8] != null && (~class238.field3752 != -1 || !var7[var8].equalsIgnoreCase(class230.field3664))) {
                                        ++class56.field988;
                                        byte var9 = 0;
                                        int var10 = -1;
                                        if (var8 == 0) {
                                            var9 = 20;
                                        }
                                        if (arg0.field2688 == var8) {
                                            var10 = arg0.field2716;
                                        }
                                        if (arg0.field2685 == var8) {
                                            var10 = arg0.field2681;
                                        }
                                        if (var8 == 1) {
                                            var9 = 30;
                                        }
                                        if (var8 == 2) {
                                            var9 = 31;
                                        }
                                        if (~var8 == -4) {
                                            var9 = 19;
                                        }
                                        if (~var8 == -5) {
                                            var9 = 23;
                                        }
                                        class107.method798((long) arg2, false, var10, var9, arg1, "<col=ffff00>" + var5, var7[var8], arg3);
                                    }
                                }
                            }
                            if (class238.field3752 == 0 && var7 != null) {
                                for (int var11 = 4; ~var11 <= -1; --var11) {
                                    if (var7[var11] != null && var7[var11].equalsIgnoreCase(class230.field3664)) {
                                        ++class146.field2402;
                                        short var12 = 0;
                                        if (~arg0.field2736 < ~class48.field878.field3425) {
                                            var12 = 2000;
                                        }
                                        short var13 = 0;
                                        if (var11 == 0) {
                                            var13 = 20;
                                        }
                                        if (~var11 == -2) {
                                            var13 = 30;
                                        }
                                        if (~var11 == -3) {
                                            var13 = 31;
                                        }
                                        if (~var11 == -4) {
                                            var13 = 19;
                                        }
                                        if (~var11 == -5) {
                                            var13 = 23;
                                        }
                                        if (~var13 != -1) {
                                            var13 += var12;
                                        }
                                        class107.method798((long) arg2, false, arg0.field2738, var13, arg1, "<col=ffff00>" + var5, var7[var11], arg3);
                                    }
                                }
                            }
                            class107.method798((long) arg2, false, class107.field1633, (short) 1002, arg1, "<col=ffff00>" + var5, class32.field529, arg3);
                            return;
                        }
                        class70 var14 = class172.field2912 == -1 ? null : class57.method455(class172.field2912, false);
                        if ((2 & class111.field1708) != 0) {
                            if (var14 == null || ~arg0.method1193(var14.field1177, arg4 ^ -26774, class172.field2912) != ~var14.field1177) {
                                ++class27.field471;
                                class107.method798((long) arg2, false, class110.field1702, (short) 1, arg1, class20.field314 + " -> <col=ffff00>" + var5, class135.field2226, arg3);
                            }
                            return;
                        }
                    } else {
                        ++class268.field4301;
                        class107.method798((long) arg2, false, class286.field4556, (short) 43, arg1, class236.field3730 + " -> <col=ffff00>" + var5, class131.field2169, arg3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ZI)[I")
    public final int[] method4(boolean arg0, int arg1) {
        ++field3271;
        int[] var3 = super.field4359.method387((byte) 112, arg1);
        if (super.field4359.field833) {
            class68.method532(var3, 0, class26.field458, class255.field4068[arg1]);
        }
        return arg0 ? null : var3;
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V")
    public class201() {
        super(0, true);
    }
}
