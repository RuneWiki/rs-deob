import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class446 extends class220 {

    @OriginalMember(owner = "client!pl", name = "T", descriptor = "Z")
    private boolean field6491 = true;

    @OriginalMember(owner = "client!pl", name = "X", descriptor = "Z")
    private boolean field6495 = true;

    @OriginalMember(owner = "client!pl", name = "V", descriptor = "Z")
    public static boolean field6493 = false;

    @OriginalMember(owner = "client!pl", name = "R", descriptor = "[Ljava/lang/String;")
    public static String[] field6489 = new String[100];

    @OriginalMember(owner = "client!pl", name = "P", descriptor = "Lop;")
    public static class353 field6487 = new class353(64);

    @OriginalMember(owner = "client!pl", name = "Q", descriptor = "I")
    public static int field6488;

    @OriginalMember(owner = "client!pl", name = "S", descriptor = "I")
    public static int field6490;

    @OriginalMember(owner = "client!pl", name = "U", descriptor = "I")
    public static int field6492;

    @OriginalMember(owner = "client!pl", name = "W", descriptor = "I")
    public static int field6494;

    @OriginalMember(owner = "client!pl", name = "Z", descriptor = "I")
    public static int field6497;

    @OriginalMember(owner = "client!pl", name = "ab", descriptor = "I")
    public static int field6498;

    @OriginalMember(owner = "client!pl", name = "bb", descriptor = "I")
    public static int field6499;

    @OriginalMember(owner = "client!pl", name = "Y", descriptor = "Lqj;")
    public static class238 field6496;

    // $FF: synthetic field
    @OriginalMember(owner = "client!pl", name = "cb", descriptor = "Ljava/lang/Class;")
    public static Class field6500;

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "()V")
    public class446() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(II)[[I")
    public final int[][] method1(int arg0, int arg1) {
        if (arg1 != 0) {
            return null;
        } else {
            ++field6492;
            int[][] var3 = super.field3135.method1774(arg0, -2);
            if (super.field3135.field4087) {
                int[][] var4 = this.method1369(0, (byte) 125, this.field6495 ? class315.field4510 - arg0 : arg0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                if (this.field6491) {
                    for (int var11 = 0; var11 < class344.field5043; ++var11) {
                        var8[var11] = var5[class392.field5887 - var11];
                        var9[var11] = var6[-var11 + class392.field5887];
                        var10[var11] = var7[-var11 + class392.field5887];
                    }
                } else {
                    for (int var12 = 0; ~var12 > ~class344.field5043; ++var12) {
                        var8[var12] = var5[var12];
                        var9[var12] = var6[var12];
                        var10[var12] = var7[var12];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIILnr;ZIII)V")
    public static final void method2802(int arg0, int arg1, int arg2, int arg3, class437 arg4, boolean arg5, int arg6, int arg7, int arg8) {
        ++field6497;
        if (!arg5) {
            method2802(-47, -7, -16, 98, (class437) null, false, -34, 57, 105);
        }
        class351 var9 = (class351) class87.method539(arg3, arg7, arg6);
        if (var9 != null) {
            class404 var10 = class165.method1020(var9.method150((byte) -120), -80);
            int var11 = 3 & var9.method148((byte) -68);
            int var12 = var9.method160(-22056);
            if (var10.field6054 == -1) {
                int var13 = arg0;
                if (var10.field6009 > 0) {
                    var13 = arg1;
                }
                if (~var12 == -1 || var12 == 2) {
                    if (~var11 == -1) {
                        arg4.method2771(true, arg8, var13, arg2, 4);
                    } else if (var11 != 1) {
                        if (~var11 != -3) {
                            if (var11 == 3) {
                                arg4.method2769(arg2, var13, (byte) -103, 4, arg8 - -3);
                            }
                        } else {
                            arg4.method2771(arg5, arg8, var13, arg2 - -3, 4);
                        }
                    } else {
                        arg4.method2769(arg2, var13, (byte) -106, 4, arg8);
                    }
                }
                if (~var12 == -4) {
                    if (var11 != 0) {
                        if (var11 != 1) {
                            if (var11 == 2) {
                                arg4.method2766(1, 1, arg2 - -3, arg8 + 3, var13, -122);
                            } else if (~var11 == -4) {
                                arg4.method2766(1, 1, arg2, arg8 - -3, var13, 40);
                            }
                        } else {
                            arg4.method2766(1, 1, arg2 + 3, arg8, var13, 73);
                        }
                    } else {
                        arg4.method2766(1, 1, arg2, arg8, var13, -90);
                    }
                }
                if (var12 == 2) {
                    if (var11 == 0) {
                        arg4.method2769(arg2, var13, (byte) -94, 4, arg8);
                    } else if (var11 != 1) {
                        if (var11 == 2) {
                            arg4.method2769(arg2, var13, (byte) -104, 4, arg8 + 3);
                        } else if (~var11 == -4) {
                            arg4.method2771(true, arg8, var13, arg2, 4);
                        }
                    } else {
                        arg4.method2771(arg5, arg8, var13, arg2 + 3, 4);
                    }
                }
            } else {
                class237.method1448(arg8, arg2, false, arg4, var10, var11);
            }
        }
        class351 var14 = (class351) class312.method1947(arg3, arg7, arg6, field6500 != null ? field6500 : (field6500 = method2807("im")));
        if (var14 != null) {
            class404 var15 = class165.method1020(var14.method150((byte) -122), 113);
            int var16 = var14.method148((byte) -68) & 3;
            int var17 = var14.method160(-22056);
            if (~var15.field6054 != 0) {
                class237.method1448(arg8, arg2, false, arg4, var15, var16);
            } else if (var17 == 9) {
                int var18 = -1118482;
                if (~var15.field6009 < -1) {
                    var18 = -1179648;
                }
                if (var16 != 0 && ~var16 != -3) {
                    arg4.method2762(true, arg8 - -3, arg2 + 3, arg8, arg2, var18);
                } else {
                    arg4.method2762(true, arg8, arg2 + 3, arg8 + 3, arg2, var18);
                }
            }
        }
        class351 var19 = (class351) class135.method910(arg3, arg7, arg6);
        if (var19 != null) {
            class404 var20 = class165.method1020(var19.method150((byte) -122), -60);
            int var21 = var19.method148((byte) -68) & 3;
            if (var20.field6054 != -1) {
                class237.method1448(arg8, arg2, !arg5, arg4, var20, var21);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "(I)V")
    public static final void method2803(int arg0) {
        if (arg0 <= 107) {
            method2804(74);
        }
        ++field6488;
        if (class35.field574 != null) {
            class357.field5232.method977(0);
            class42.method318();
            class122.method842((byte) 50);
            class23.method193((byte) -116);
            class255.method1607((byte) -125);
            class323.method1997(true);
            if (class94.field1305 != null) {
                class94.field1305.method566(119);
            }
            class295.method1882(-125);
            class215.method1350(8110);
            class197.method1229(-32);
            class282.method1801(0, false);
            class444.method2796(16777216);
            for (int var1 = 0; var1 < 2048; ++var1) {
                class194 var5 = class125.field1664[var1];
                if (var5 != null) {
                    var5.field308 = null;
                    for (int var6 = 0; var6 < var5.field304.length; ++var6) {
                        var5.field304[var6] = null;
                    }
                }
            }
            for (int var2 = 0; ~class23.field408.length < ~var2; ++var2) {
                class129 var3 = class23.field408[var2];
                if (var3 != null) {
                    for (int var4 = 0; var3.field304.length > var4; ++var4) {
                        var3.field304[var4] = null;
                    }
                }
            }
            class35.field574.method2761(-31586);
            class35.field574 = null;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IBLil;)V")
    public final void method2(int arg0, byte arg1, class265 arg2) {
        ++field6499;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    super.field3131 = arg2.method1697(-24) == 1;
                }
            } else {
                this.field6495 = ~arg2.method1697(97) == -2;
            }
        } else {
            this.field6491 = arg2.method1697(108) == 1;
        }
        if (arg1 != -49) {
            field6487 = null;
        }
    }

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "(I)V")
    public static void method2804(int arg0) {
        if (arg0 < 43) {
            field6493 = false;
        }
        field6496 = null;
        field6489 = null;
        field6487 = null;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IB)Lle;")
    public static final class65 method2805(int arg0, byte arg1) {
        if (arg1 >= -75) {
            field6493 = true;
        }
        ++field6498;
        class65 var2 = (class65) class307.field4392.method209(127, (long) arg0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class94.field1294.method1472(arg0, 1, 0);
            class65 var4 = new class65();
            var4.field913 = arg0;
            if (var3 != null) {
                var4.method428(-1, new class265(var3));
            }
            var4.method425(8);
            if (~var4.field928 == -3 && class130.field1747.method954(-45, (long) arg0) == null) {
                class130.field1747.method956(false, (long) arg0, new class231(class204.field2951));
                class100.field1353[class204.field2951++] = var4;
            }
            class307.field4392.method202(true, var4, (long) arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "(II)[I")
    public final int[] method43(int arg0, int arg1) {
        ++field6494;
        if (arg0 != -11543) {
            this.method2(-32, (byte) -2, (class265) null);
        }
        int[] var3 = super.field3125.method2005(arg1, (byte) -117);
        if (super.field3125.field4676) {
            int[] var4 = this.method1366(0, (byte) -40, this.field6495 ? -arg1 + class315.field4510 : arg1);
            if (this.field6491) {
                for (int var5 = 0; class344.field5043 > var5; ++var5) {
                    var3[var5] = var4[class392.field5887 - var5];
                }
            } else {
                class111.method775(var4, 0, var3, 0, class344.field5043);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(CB)Z")
    public static final boolean method2806(char arg0, byte arg1) {
        int var2 = 28 % ((arg1 - -67) / 47);
        ++field6490;
        return arg0 == 160 || arg0 == ' ' || arg0 == '_' || ~arg0 == -46;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2807(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
