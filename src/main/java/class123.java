import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public class class123 {

    @OriginalMember(owner = "client!fv", name = "d", descriptor = "I")
    public static int field1612 = 0;

    @OriginalMember(owner = "client!fv", name = "j", descriptor = "I")
    public static int field1618 = 1339;

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!fv", name = "c", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!fv", name = "e", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!fv", name = "f", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!fv", name = "g", descriptor = "I")
    public static int field1615;

    @OriginalMember(owner = "client!fv", name = "h", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!fv", name = "i", descriptor = "I")
    public static int field1617;

    @OriginalMember(owner = "client!fv", name = "k", descriptor = "I")
    public static int field1619;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fv", name = "l", descriptor = "Ljava/lang/Class;")
    public static Class field1620;

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(ZI)V")
    public static final void method789(boolean arg0, int arg1) {
        field1619++;
        if (arg0) {
            if (class116.field1543 != -1) {
                class166.method974(false, class116.field1543);
            }
            for (class526 var2 = (class526) class520.field6994.method2560(122); var2 != null; var2 = (class526) class520.field6994.method2557(-1)) {
                if (!var2.method314((byte) 78)) {
                    var2 = (class526) class520.field6994.method2560(104);
                    if (var2 == null) {
                        break;
                    }
                }
                class303.method1815(arg1 + 16399, false, var2, true);
            }
            class116.field1543 = -1;
            class520.field6994 = new class459(8);
            class430.method2456(118);
            class116.field1543 = class37.field387;
            class574.method3221(39, false);
            class340.method2004(2);
            class498.method2786(class116.field1543);
        }
        class24.field181 = true;
        if (arg1 != -1) {
            field1618 = 122;
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(II)V")
    public static final void method790(int arg0, int arg1) {
        class526.field7068 = -1;
        class226.field2934 = 1;
        class669.field9309 = false;
        class122.field1593 = -1;
        class276.field3683 = arg1;
        field1610++;
        class302.field4082 = 0;
        class476.field6580 = null;
        class520.field6997 = null;
        int var2 = -83 / ((arg0 - 47) / 53);
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(BIIII)V")
    public static final void method791(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field1614++;
        int var5 = 0;
        int var6 = arg2;
        if (arg0 != -109) {
            return;
        }
        int var7 = -arg2;
        int var8 = -1;
        int var9 = class105.method716(false, class165.field2070, class122.field1604, arg2 + arg3);
        int var10 = class105.method716(false, class165.field2070, class122.field1604, arg3 - arg2);
        class168.method980(arg4, class300.field4036[arg1], var10, var9, (byte) -125);
        while (var6 > var5) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var11 = arg1 - var6;
                int var12 = arg1 + var6;
                if (var12 >= class759.field10576 && class29.field238 >= var11) {
                    int var13 = class105.method716(false, class165.field2070, class122.field1604, arg3 + var5);
                    int var14 = class105.method716(false, class165.field2070, class122.field1604, arg3 - var5);
                    if (var12 <= class29.field238) {
                        class168.method980(arg4, class300.field4036[var12], var14, var13, (byte) -127);
                    }
                    if (class759.field10576 <= var11) {
                        class168.method980(arg4, class300.field4036[var11], var14, var13, (byte) -125);
                    }
                }
            }
            var5++;
            int var15 = arg1 - var5;
            int var16 = arg1 + var5;
            if (class759.field10576 <= var16 && class29.field238 >= var15) {
                int var17 = class105.method716(false, class165.field2070, class122.field1604, arg3 + var6);
                int var18 = class105.method716(false, class165.field2070, class122.field1604, arg3 - var6);
                if (var16 <= class29.field238) {
                    class168.method980(arg4, class300.field4036[var16], var18, var17, (byte) -124);
                }
                if (class759.field10576 <= var15) {
                    class168.method980(arg4, class300.field4036[var15], var18, var17, (byte) -125);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(IIIZ)I")
    public static final int method792(int arg0, int arg1, int arg2, boolean arg3) {
        field1613++;
        class369 var4 = class190.method1059(arg0, arg3, 6);
        int var5 = -50 % ((-arg1 - 58) / 49);
        if (var4 == null) {
            return -1;
        } else if (arg2 >= 0 && var4.field5172.length > arg2) {
            return var4.field5172[arg2];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(ILha;)V")
    public static final void method793(int arg0, class60 arg1) {
        field1615++;
        if (!(arg0 <= class43.field470 || class595.field8291) || class72.field774 != null) {
            return;
        }
        String var2;
        if (class595.field8291 && class43.field470 < 2) {
            var2 = class702.field9857 + class755.field10512.method4201(class723.field10095, (byte) 25) + class719.field10067 + " ->";
        } else if (class581.field8149 && class290.field3843.method1426(81, 5503) && class43.field470 > 2) {
            var2 = class656.method3714((byte) -124, class736.field10279);
        } else {
            class227 var3 = class736.field10279;
            if (var3 == null) {
                return;
            }
            var2 = class656.method3714((byte) -124, var3);
            int[] var4 = null;
            if (class425.method2435(127, var3.field2948)) {
                var4 = class761.field10628.method4169((int) var3.field2945, (byte) -120).field9762;
            } else if (var3.field2946 != -1) {
                var4 = class761.field10628.method4169(var3.field2946, (byte) -128).field9762;
            } else if (class641.method3607(var3.field2948, (byte) -61)) {
                class706 var7 = (class706) class681.field9475.method2552((long) ((int) var3.field2945), arg0 - 3);
                if (var7 != null) {
                    class215 var8 = var7.field9890;
                    class274 var9 = var8.field2589;
                    if (var9.field3616 != null) {
                        var9 = var9.method1637(class386.field5455, (byte) 72);
                    }
                    if (var9 != null) {
                        var4 = var9.field3668;
                    }
                }
            } else if (class422.method2408(var3.field2948, false)) {
                Object var5 = null;
                class685 var6;
                if (var3.field2948 == 1009) {
                    var6 = class707.field9894.method4109((int) var3.field2945, (byte) 119);
                } else {
                    var6 = class707.field9894.method4109((int) (var3.field2945 >>> 32 & 0x7FFFFFFFL), (byte) 119);
                }
                if (var6.field9528 != null) {
                    var6 = var6.method3875(class386.field5455, (byte) -48);
                }
                if (var6 != null) {
                    var4 = var6.field9539;
                }
            }
            if (var4 != null) {
                var2 = var2 + class41.method247(0, var4);
            }
        }
        if (class43.field470 > 2) {
            var2 = var2 + "<col=ffffff> / " + (class43.field470 - 2) + class755.field10505.method4201(class723.field10095, (byte) 25);
        }
        if (class596.field8311 != null) {
            class61 var10 = class596.field8311.method1227(-47, arg1);
            if (var10 == null) {
                var10 = class214.field2575;
            }
            var10.method480(class277.field3702, class596.field8311.field2695, class546.field7708, class596.field8311.field2833, class596.field8311.field2718, class122.field1589, class596.field8311.field2818, class402.field5682, class596.field8311.field2781, var2, class596.field8311.field2763, class385.field5414, -121, class587.field8211, class233.field3023);
            class640.method3603(class402.field5682[3], -1, class402.field5682[2], class402.field5682[0], class402.field5682[1]);
        } else if (class21.field151 != null && class51.field541 == class257.field3338) {
            int var11 = class214.field2575.method472(0, 16777215, class571.field8036 + 16, var2, class122.field1589, class385.field5414, class546.field7708, class441.field6155 + 4, class587.field8211, -70);
            class640.method3603(16, -1, class616.field8643.method2216(var2, arg0 + 106) + var11, class441.field6155 + 4, class571.field8036);
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(I)V")
    public static final void method794(int arg0) {
        field1616++;
        int var1 = -1 % ((arg0 - 46) / 46);
        if (class287.field3823.field10283) {
            class206.field2483 = 96;
            return;
        }
        try {
            Method var2 = (field1620 == null ? (field1620 = method796("java.lang.Runtime")) : field1620).getMethod("maxMemory");
            if (var2 != null) {
                try {
                    Runtime var3 = Runtime.getRuntime();
                    Long var4 = (Long) var2.invoke(var3, (Object[]) null);
                    class206.field2483 = (int) (var4 / 1048576L) + 1;
                    return;
                } catch (Throwable var5) {
                    return;
                }
            }
        } catch (Exception var6) {
            return;
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(B)V")
    public static final void method795(byte arg0) {
        field1617++;
        class395.field5617.method442(class402.field5681, class11.field68.field5512.method813((byte) 122) == 1 ? class105.field1406 + 256 << 2 : -1, 0);
        if (arg0 != -42) {
            field1612 = 54;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method796(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
