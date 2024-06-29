import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class474 {

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "Liba;")
    public static class211 field6803 = new class211(33, 7);

    @OriginalMember(owner = "client!qn", name = "e", descriptor = "Ldc;")
    public static class302 field6805 = new class302();

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "I")
    public static int field6801;

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "I")
    public static int field6802;

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "I")
    public static int field6804;

    @OriginalMember(owner = "client!qn", name = "f", descriptor = "I")
    public static int field6806;

    @OriginalMember(owner = "client!qn", name = "g", descriptor = "I")
    public static int field6807;

    @OriginalMember(owner = "client!qn", name = "h", descriptor = "I")
    public static int field6808;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qn", name = "j", descriptor = "Ljava/lang/Class;")
    public static Class field6810;

    @OriginalMember(owner = "client!qn", name = "i", descriptor = "[I")
    public static int[] field6809;

    // $FF: synthetic method
    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2732(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(II)I", line = 4)
    public static final int method2726(int arg0, int arg1) {
        field6807++;
        if (arg1 > -90) {
            field6809 = null;
        }
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)V", line = 17)
    public static final void method2727(int arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class215.field2883[var1] = false;
        }
        field6802++;
        class115.field1731 = 0;
        class74.field1160 = -1;
        class608.field8804 = 0;
        class150.field2120 = -1;
        class250.field3280 = -1;
        if (arg0 <= 105) {
            return;
        }
        class577.field8380 = class481.field6886;
        class56.field879 = class533.field7839;
        class684.field9659 = 5;
        class269.field3522 = class246.field3255;
        class441.field6408 = class306.field4529;
        class306.field4534 = class45.field685;
        class630.field9126 = class603.field8702;
        class426.field6233 = -1;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(ZLr;)V", line = 49)
    public static final void method2728(boolean arg0, class98 arg1) {
        field6801++;
        arg1.method652(0, 0, class454.field6538, 350);
        arg1.method700(0, 0, class454.field6538, 350, class298.field4389 << 24 | 0x332277, 1);
        int var2 = 350 / class380.field5721;
        if (class477.field6836 > 0) {
            int var3 = 342 - class380.field5721;
            int var4 = var2 * var3 / (var2 + class477.field6836 - 1);
            int var5 = 4;
            if (class477.field6836 > 1) {
                var5 += (class477.field6836 - class217.field2899 - 1) * (var3 - var4) / (class477.field6836 - 1);
            }
            arg1.method700(class454.field6538 - 16, var5, 12, var4, class298.field4389 << 24 | 0x332277, 2);
            for (int var6 = class217.field2899; var6 < class217.field2899 + var2 && class477.field6836 > var6; var6++) {
                String[] var7 = class509.method2891(class69.field1078[var6], '\b', -124);
                int var8 = (class454.field6538 - 8 - 16) / var7.length;
                for (int var9 = 0; var9 < var7.length; var9++) {
                    int var10 = var8 * var9 + 8;
                    arg1.method652(var10, 0, var10 + var8 - 8, 350);
                    class244.field3236.method2447(var10, class131.method934((byte) 100, var7[var9]), -1, 2, 350 - ((var6 - class217.field2899) * class380.field5721) - class624.field9024.field8759 - class11.field276 - 2, -16777216);
                }
            }
        }
        class597.field8642.method2434(-1, 22118, "Build: 627", -16777216, class454.field6538 - 25, 330);
        arg1.method652(0, 0, class454.field6538, 350);
        if (arg0) {
            method2728(false, null);
        }
        arg1.method695(-1, 350 - class11.field276, 0, class454.field6538, (byte) 110);
        class395.field5976.method2447(10, "--> " + class131.method934((byte) -122, class362.field5322), -1, 2, 349 - class141.field2042.field8759, -16777216);
        if (!class696.field9809) {
            return;
        }
        int var11 = -1;
        if (class45.field685 % 30 > 15) {
            var11 = 16777215;
        }
        arg1.method644(var11, 12, 350 - class141.field2042.field8759 - 11, class141.field2042.method3455("--> " + class131.method934((byte) 84, class362.field5322).substring(0, class576.field8374), (byte) 1) + 10, true);
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IZIIIILr;II)V", line = 117)
    public static final void method2729(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, class98 arg6, int arg7, int arg8) {
        field6806++;
        if (!arg1) {
            method2726(-23, 10);
        }
        class83 var9 = (class83) class386.method2381(arg5, arg8, arg7);
        if (var9 != null) {
            class289 var10 = class60.field965.method2596(0, var9.method277((byte) 95));
            int var11 = var9.method263((byte) 72) & 0x3;
            int var12 = var9.method264(-5273);
            if (var10.field4246 == -1) {
                int var13 = arg0;
                if (var10.field4250 > 0) {
                    var13 = arg3;
                }
                if (var12 == 0 || var12 == 2) {
                    if (var11 == 0) {
                        arg6.method644(var13, 4, arg2, arg4, true);
                    } else if (var11 == 1) {
                        arg6.method695(var13, arg2, arg4, 4, (byte) 89);
                    } else if (var11 == 2) {
                        arg6.method644(var13, 4, arg2, arg4 + 3, true);
                    } else if (var11 == 3) {
                        arg6.method695(var13, arg2 + 3, arg4, 4, (byte) 115);
                    }
                }
                if (var12 == 3) {
                    if (var11 == 0) {
                        arg6.method710(arg2, 22339, var13, 1, arg4, 1);
                    } else if (var11 == 1) {
                        arg6.method710(arg2, 22339, var13, 1, arg4 + 3, 1);
                    } else if (var11 == 2) {
                        arg6.method710(arg2 + 3, 22339, var13, 1, arg4 + 3, 1);
                    } else if (var11 == 3) {
                        arg6.method710(arg2 + 3, 22339, var13, 1, arg4, 1);
                    }
                }
                if (var12 == 2) {
                    if (var11 == 0) {
                        arg6.method695(var13, arg2, arg4, 4, (byte) 122);
                    } else if (var11 == 1) {
                        arg6.method644(var13, 4, arg2, arg4 + 3, true);
                    } else if (var11 == 2) {
                        arg6.method695(var13, arg2 + 3, arg4, 4, (byte) 98);
                    } else if (var11 == 3) {
                        arg6.method644(var13, 4, arg2, arg4, true);
                    }
                }
            } else {
                class153.method1094(var11, !arg1, arg6, var10, arg4, arg2);
            }
        }
        class83 var14 = (class83) class434.method2583(arg5, arg8, arg7, field6810 == null ? (field6810 = method2732("je")) : field6810);
        if (var14 != null) {
            class289 var15 = class60.field965.method2596(0, var14.method277((byte) 95));
            int var16 = var14.method263((byte) 16) & 0x3;
            int var17 = var14.method264(-5273);
            if (var15.field4246 != -1) {
                class153.method1094(var16, false, arg6, var15, arg4, arg2);
            } else if (var17 == 9) {
                int var18 = -1118482;
                if (var15.field4250 > 0) {
                    var18 = -1179648;
                }
                if (var16 == 0 || var16 == 2) {
                    arg6.method664(arg4, arg2, 1, arg2 + 3, arg4 - -3, var18);
                } else {
                    arg6.method664(arg4, arg2 + 3, 1, arg2, arg4 + 3, var18);
                }
            }
        }
        class83 var19 = (class83) class566.method3261(arg5, arg8, arg7);
        if (var19 == null) {
            return;
        }
        class289 var20 = class60.field965.method2596(0, var19.method277((byte) 95));
        int var21 = var19.method263((byte) 115) & 0x3;
        if (var20.field4246 != -1) {
            class153.method1094(var21, false, arg6, var20, arg4, arg2);
            return;
        }
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(II)Z", line = 261)
    public static final boolean method2730(int arg0, int arg1) {
        field6804++;
        if (arg0 <= 64) {
            method2731(-105);
        }
        return arg1 == 4 || arg1 == 8 || arg1 == 11;
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(I)V", line = 279)
    public static void method2731(int arg0) {
        field6803 = null;
        if (arg0 != 2) {
            method2727(-24);
        }
        field6805 = null;
        field6809 = null;
    }
}
