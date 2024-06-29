import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class138 extends class475 {

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "[I")
    public static int[] field1840 = new int[2];

    @OriginalMember(owner = "client!fl", name = "j", descriptor = "I")
    public static int field1844 = 0;

    @OriginalMember(owner = "client!fl", name = "m", descriptor = "I")
    public static int field1847 = -1;

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "Z")
    public static boolean field1841 = false;

    @OriginalMember(owner = "client!fl", name = "i", descriptor = "J")
    public static long field1843 = -1L;

    @OriginalMember(owner = "client!fl", name = "h", descriptor = "I")
    public static int field1842;

    @OriginalMember(owner = "client!fl", name = "k", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!fl", name = "l", descriptor = "I")
    public static int field1846;

    @OriginalMember(owner = "client!fl", name = "n", descriptor = "Ldn;")
    public static class201 field1848;

    @OriginalMember(owner = "client!fl", name = "o", descriptor = "[I")
    public static int[] field1849;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)Z", line = 6)
    public static final boolean method962(int arg0, int arg1) {
        field1846++;
        if (arg1 < 92) {
            field1848 = null;
        }
        if (arg0 == 44 || arg0 == 58 || arg0 == 4 || arg0 == 49 || arg0 == 50) {
            return true;
        } else {
            return arg0 == 19 || arg0 == 1001;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)V", line = 33)
    public static void method963(int arg0) {
        field1849 = null;
        field1840 = null;
        field1848 = null;
        if (arg0 != 1) {
            method964(-7, true, -128, -106);
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IZII)V", line = 52)
    public static final void method964(int arg0, boolean arg1, int arg2, int arg3) {
        field1842++;
        class436 var4 = class459.method2712(11, arg0, -1759243680);
        var4.method2574((byte) 116);
        var4.field5980 = arg2;
        if (arg1) {
            var4.field5977 = arg3;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lqa;Lrn;IIIII)V", line = 71)
    public static final void method965(class129 arg0, class242 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        boolean var7 = true;
        int var8 = arg3;
        int var9 = arg3 + arg5;
        int var10 = arg4 - 1;
        int var11 = arg4 + arg6;
        for (int var12 = arg2; var12 <= arg2 + 1; var12++) {
            if (class412.field5495 != var12) {
                for (int var13 = var8; var13 <= var9; var13++) {
                    if (var13 >= 0 && var13 < class166.field2155) {
                        for (int var14 = var10; var14 <= var11; var14++) {
                            if (var14 >= 0 && var14 < class13.field230 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < arg4 && arg3 != var13)) {
                                class510 var15 = class470.field6877[var12][var13][var14];
                                if (var15 != null) {
                                    int var16 = (class92.field1285[var12].method1187(var13, var14) + class92.field1285[var12].method1187(var13 + 1, var14) + class92.field1285[var12].method1187(var13, var14 + 1) + class92.field1285[var12].method1187(var13 + 1, var14 + 1)) / 4 - (class92.field1285[arg2].method1187(arg3, arg4) + class92.field1285[arg2].method1187(arg3 + 1, arg4) + class92.field1285[arg2].method1187(arg3, arg4 + 1) + class92.field1285[arg2].method1187(arg3 + 1, arg4 + 1)) / 4;
                                    class270 var17 = var15.field7499;
                                    class270 var18 = var15.field7502;
                                    if (var17 != null && var17.method177(5)) {
                                        arg1.method174((byte) 91, var17, var7, (var14 - arg4) * class286.field3658 + (1 - arg6) * class477.field6971, var16, arg0, (var13 - arg3) * class286.field3658 + (1 - arg5) * class477.field6971);
                                    }
                                    if (var18 != null && var18.method177(5)) {
                                        arg1.method174((byte) 91, var18, var7, (var14 - arg4) * class286.field3658 + (1 - arg6) * class477.field6971, var16, arg0, (var13 - arg3) * class286.field3658 + (1 - arg5) * class477.field6971);
                                    }
                                    for (class319 var19 = var15.field7494; var19 != null; var19 = var19.field4102) {
                                        class448 var20 = var19.field4107;
                                        if (var20 != null && var20.method177(5) && (var20.field6238 == var13 || var8 == var13) && (var20.field6228 == var14 || var10 == var14)) {
                                            int var21 = var20.field6229 + 1 - var20.field6238;
                                            int var22 = var20.field6221 + 1 - var20.field6228;
                                            arg1.method174((byte) 91, var20, var7, (var20.field6228 - arg4) * class286.field3658 + (var22 - arg6) * class477.field6971, var16, arg0, (var20.field6238 - arg3) * class286.field3658 + (var21 - arg5) * class477.field6971);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var8--;
                var7 = false;
            }
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lqt;ZI)V", line = 169)
    public static final void method966(class295 arg0, boolean arg1, int arg2) {
        if (arg2 != 49) {
            return;
        }
        field1845++;
        if (class271.field3433 >= 400) {
            return;
        }
        class10 var3 = arg0.field3831;
        if (var3.field111 != null) {
            var3 = var3.method63(false, class198.field2555);
            if (var3 == null) {
                return;
            }
        }
        if (!var3.field99) {
            return;
        }
        String var4 = var3.field166;
        if (var3.field151 != 0) {
            String var5 = class494.field7234 == class10.field134 ? class334.field4267.method1127(class379.field4920, false) : class284.field3624.method1127(class379.field4920, false);
            var4 = var4 + class203.method1334(-74, var3.field151, class37.field573.field7633) + " (" + var5 + var3.field151 + ")";
        }
        if (!class515.field7573) {
            if (!arg1) {
                String[] var7 = var3.field114;
                if (class298.field3869) {
                    var7 = class124.method787(98, var7);
                }
                if (var7 != null) {
                    for (int var8 = 4; var8 >= 0; var8--) {
                        if (var7[var8] != null && (class494.field7234 != class276.field3527 || !var7[var8].equalsIgnoreCase(class318.field4096.method1127(class379.field4920, false)))) {
                            byte var9 = 0;
                            if (var8 == 0) {
                                var9 = 44;
                            }
                            int var10 = class395.field5239;
                            if (var8 == 1) {
                                var9 = 58;
                            }
                            if (var8 == 2) {
                                var9 = 4;
                            }
                            if (var8 == 3) {
                                var9 = 49;
                            }
                            if (var8 == 4) {
                                var9 = 50;
                            }
                            if (var3.field127 == var8) {
                                var10 = var3.field110;
                            }
                            if (var3.field121 == var8) {
                                var10 = var3.field131;
                            }
                            class417.field5547++;
                            class126.method793(0, var9, (long) arg0.field5159, -1, 0, (byte) -5, false, "<col=ffff00>" + var4, true, var7[var8], var10);
                        }
                    }
                }
                if (class494.field7234 == class276.field3527 && var7 != null) {
                    for (int var11 = 4; var11 >= 0; var11--) {
                        if (var7[var11] != null && var7[var11].equalsIgnoreCase(class318.field4096.method1127(class379.field4920, false))) {
                            short var12 = 0;
                            if (class37.field573.field7633 < var3.field151) {
                                var12 = 2000;
                            }
                            short var13 = 0;
                            if (var11 == 0) {
                                var13 = 44;
                            }
                            if (var11 == 1) {
                                var13 = 58;
                            }
                            if (var11 == 2) {
                                var13 = 4;
                            }
                            if (var11 == 3) {
                                var13 = 49;
                            }
                            if (var11 == 4) {
                                var13 = 50;
                            }
                            if (var13 != 0) {
                                var13 += var12;
                            }
                            class506.field7441++;
                            class126.method793(0, var13, (long) arg0.field5159, -1, 0, (byte) -5, false, "<col=ffff00>" + var4, true, var7[var11], var3.field164);
                        }
                    }
                }
            }
            class126.method793(0, 1001, (long) arg0.field5159, -1, 0, (byte) -5, arg1, "<col=ffff00>" + var4, true, class122.field1702.method1127(class379.field4920, false), class291.field3721);
            class437.field5997++;
        } else if (!arg1) {
            class483 var6 = class227.field2931 == -1 ? null : class495.field7242.method1837(11, class227.field2931);
            if ((class182.field2380 & 0x2) != 0) {
                if (var6 == null || var3.method66(arg2 ^ 0xFFFFAB16, var6.field7035, class227.field2931) != var6.field7035) {
                    class292.field3752++;
                    class126.method793(0, 19, (long) arg0.field5159, -1, 0, (byte) -5, false, class195.field2532 + " -> <col=ffff00>" + var4, true, class257.field3252, class35.field543);
                }
                return;
            }
        }
    }
}
