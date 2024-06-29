import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class64 extends class321 {

    @OriginalMember(owner = "client!ib", name = "M", descriptor = "Ljava/lang/Object;")
    private Object field846;

    @OriginalMember(owner = "client!ib", name = "H", descriptor = "Ljava/lang/String;")
    public static String field841 = " from your friend list first.";

    @OriginalMember(owner = "client!ib", name = "I", descriptor = "[I")
    public static int[] field842 = new int[128];

    @OriginalMember(owner = "client!ib", name = "E", descriptor = "I")
    public static int field839;

    @OriginalMember(owner = "client!ib", name = "G", descriptor = "I")
    public static int field840;

    @OriginalMember(owner = "client!ib", name = "J", descriptor = "I")
    public static int field843;

    @OriginalMember(owner = "client!ib", name = "K", descriptor = "I")
    public static int field844;

    @OriginalMember(owner = "client!ib", name = "L", descriptor = "I")
    public static int field845;

    @OriginalMember(owner = "client!ib", name = "N", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!ib", name = "O", descriptor = "I")
    public static int field848;

    @OriginalMember(owner = "client!ib", name = "P", descriptor = "I")
    public static int field849;

    @OriginalMember(owner = "client!ib", name = "Q", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!ib", name = "R", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(III)I", line = 10)
    public static final int method420(int arg0, int arg1, int arg2) {
        field843++;
        if (arg2 != 16777215) {
            field850 = 56;
        }
        int var3 = arg1 * 57 + arg0;
        int var4 = var3 << 13 ^ var3;
        int var5 = Integer.MAX_VALUE & (var4 * 15731 * var4 + 789221) * var4 + 1376312589;
        return (var5 & 0x7FD7568) >> 19;
    }

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "(I)Ljava/lang/Object;", line = 29)
    public final Object method421(int arg0) {
        if (arg0 != -15306) {
            method422(5, -55, 88, 10, 23, 48, -91, 119, -96);
        }
        field849++;
        return this.field846;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIIIIII)V", line = 43)
    public static final void method422(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        for (int var9 = 0; var9 < class155.field2325.field1996; var9++) {
            if (class155.field2325.method964(var9, true)) {
                int var10 = class296.field4533 + class111.field1719 - class155.field2325.field2006[var9] - 1;
                int var11 = class155.field2325.field2004[var9] - class292.field4439;
                int var12 = (arg3 - arg7) * (var11 - arg5) / (arg4 - arg5) + arg7;
                int var13 = arg2 + ((arg8 - arg2) * (var10 - arg1) / (arg6 - arg1));
                int var14 = 16777215;
                int var15 = class155.field2325.method963(var9, true);
                class95 var16 = null;
                if (var15 == 0) {
                    if ((double) class75.field980 == 3.0D) {
                        var16 = class176.field2601;
                    }
                    if ((double) class75.field980 == 4.0D) {
                        var16 = class305.field4644;
                    }
                    if ((double) class75.field980 == 6.0D) {
                        var16 = class320.field4846;
                    }
                    if ((double) class75.field980 >= 8.0D) {
                        var16 = class205.field3101;
                    }
                }
                if (var15 == 1) {
                    if ((double) class75.field980 == 3.0D) {
                        var16 = class320.field4846;
                    }
                    if ((double) class75.field980 == 4.0D) {
                        var16 = class205.field3101;
                    }
                    if ((double) class75.field980 == 6.0D) {
                        var16 = class169.field2529;
                    }
                    if ((double) class75.field980 >= 8.0D) {
                        var16 = class284.field4294;
                    }
                }
                if (var15 == 2) {
                    var14 = 16755200;
                    if ((double) class75.field980 == 3.0D) {
                        var16 = class169.field2529;
                    }
                    if ((double) class75.field980 == 4.0D) {
                        var16 = class284.field4294;
                    }
                    if ((double) class75.field980 == 6.0D) {
                        var16 = class258.field3899;
                    }
                    if ((double) class75.field980 >= 8.0D) {
                        var16 = class184.field2758;
                    }
                }
                if (class155.field2325.field2000[var9] != -1) {
                    var14 = class155.field2325.field2000[var9];
                }
                if (var16 != null) {
                    int var17 = class61.field817.method629(class155.field2325.field2007[var9], (int[]) null, class6.field32);
                    int var18 = var13 - (var17 - 1) * var16.method672() / 2;
                    int var19 = var18 + var16.method677() / 2;
                    for (int var20 = 0; var20 < var17; var20++) {
                        String var21 = class6.field32[var20];
                        if (var17 - 1 > var20) {
                            var21 = var21.substring(0, var21.length() - 4);
                        }
                        var16.method674(var21, var12, var19, var14, true);
                        var19 += var16.method672();
                    }
                }
            }
        }
        field845++;
        if (arg0 != 17062) {
            field841 = (String) null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(II)I", line = 160)
    public static final int method423(int arg0, int arg1) {
        if (arg0 != 16776960) {
            method426((byte) -102);
        }
        int var2 = arg1 & 0x3F;
        int var3 = (arg1 & 0xC7) >> 6;
        field848++;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIBI)V", line = 213)
    public static final void method424(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (class117.field1817) {
            class308.method2123(arg2, arg4, arg1 + arg2, arg0 + arg4);
            class308.method2126(arg2, arg4, arg1, arg0, 0);
        } else {
            class46.method301(arg2, arg4, arg1 + arg2, arg0 + arg4);
            class46.method312(arg2, arg4, arg1, arg0, 0);
        }
        field847++;
        int var5 = 59 / ((31 - arg3) / 48);
        if (class221.field3369 < 100) {
            return;
        }
        if (class259.field3942 == null || class259.field3942.field3533 != arg1 || class259.field3942.field3537 != arg0) {
            class127 var6 = new class127(arg1, arg0);
            class46.method321(var6.field1983, arg1, arg0);
            class203.method1388(class41.field497, class111.field1719, arg1, false, 0, 0, 0, 0, arg0);
            if (class117.field1817) {
                class259.field3942 = new class303(var6);
            } else {
                class259.field3942 = var6;
            }
            if (class117.field1817) {
                class46.field577 = null;
            } else {
                class171.field2574.method1474(0);
            }
        }
        class259.field3942.method932(arg2, arg4);
        int var7 = class245.field3658 * arg1 / class41.field497 + arg2;
        int var8 = arg4 + (class88.field1306 * arg0 / class111.field1719);
        int var9 = class235.field3536 * arg1 / class41.field497;
        int var10 = class98.field1531 * arg0 / class111.field1719;
        int var11 = 16711680;
        if (class237.field3555 == 1) {
            var11 = 16777215;
        }
        if (class117.field1817) {
            class308.method2125(var7, var8, var9, var10, var11, 128);
            class308.method2128(var7, var8, var9, var10, var11);
        } else {
            class46.method319(var7, var8, var9, var10, var11, 128);
            class46.method318(var7, var8, var9, var10, var11);
        }
        if (class155.field2329 <= 0) {
            return;
        }
        int var12;
        if (class142.field2141 > 10) {
            var12 = (20 - class142.field2141) * 25;
        } else {
            var12 = class142.field2141 * 25;
        }
        for (class186 var13 = (class186) class113.field1737.method1109(-104); var13 != null; var13 = (class186) class113.field1737.method1115((byte) 104)) {
            if (class255.field3874 == var13.field2774) {
                int var14 = arg2 + (var13.field2772 * arg1 / class41.field497);
                int var15 = var13.field2778 * arg0 / class111.field1719 + arg4;
                if (class117.field1817) {
                    class308.method2125(var14 - 2, var15 + -2, 4, 4, 16776960, var12);
                } else {
                    class46.method319(var14 - 2, var15 + -2, 4, 4, 16776960, var12);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(B)Z", line = 314)
    public final boolean method425(byte arg0) {
        int var2 = 83 / ((arg0 - 35) / 63);
        field839++;
        return false;
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(B)V", line = 324)
    public static void method426(byte arg0) {
        field842 = null;
        field841 = null;
        if (arg0 != -52) {
            field850 = 119;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIII)V", line = 347)
    public static final void method427(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class124.field1932 = arg0;
        if (arg4 != 3438) {
            return;
        }
        class287.field4340 = arg1;
        field851++;
        class250.field3732 = arg5;
        class107.field1671 = arg2;
        class200.field2993 = arg3;
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 366)
    public class64(Object arg0) {
        this.field846 = arg0;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IB)V", line = 384)
    public static final void method428(int arg0, byte arg1) {
        field840++;
        if (arg0 == -1 || !class72.method463(-127, arg0)) {
            return;
        }
        class329[] var2 = class278.field4231[arg0];
        if (arg1 <= 6) {
            method423(52, 9);
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class329 var4 = var2[var3];
            if (var4.field5081 != null) {
                class286 var5 = new class286();
                var5.field4310 = var4.field5081;
                var5.field4330 = var4;
                class258.method1759(2000000, var5, 2778);
            }
        }
    }
}
