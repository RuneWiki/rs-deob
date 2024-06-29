import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class99 {

    @OriginalMember(owner = "client!me", name = "j", descriptor = "I")
    public int field1067 = -1;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "I")
    public static int field1058;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "I")
    public int field1059;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "I")
    public static int field1060;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "I")
    public int field1062;

    @OriginalMember(owner = "client!me", name = "f", descriptor = "I")
    public int field1063;

    @OriginalMember(owner = "client!me", name = "g", descriptor = "I")
    public static int field1064;

    @OriginalMember(owner = "client!me", name = "h", descriptor = "I")
    public int field1065;

    @OriginalMember(owner = "client!me", name = "i", descriptor = "I")
    public int field1066;

    @OriginalMember(owner = "client!me", name = "k", descriptor = "I")
    public static int field1068;

    @OriginalMember(owner = "client!me", name = "l", descriptor = "I")
    public int field1069;

    @OriginalMember(owner = "client!me", name = "m", descriptor = "I")
    public int field1070;

    @OriginalMember(owner = "client!me", name = "n", descriptor = "I")
    public int field1071;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "Llba;")
    public static class255 field1061;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V", line = 3)
    public static void method534(int arg0) {
        field1061 = null;
        if (arg0 > -55) {
            field1061 = null;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(B)Z", line = 16)
    public static final boolean method535(byte arg0) {
        field1058++;
        try {
            return arg0 == 119 ? class90.method458(false) : false;
        } catch (IOException var4) {
            class254.method1505(-22614);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + (class223.field2773 == null ? -1 : class223.field2773.method593((byte) 89)) + "," + (class152.field1677 == null ? -1 : class152.field1677.method593((byte) 89)) + "," + (class336.field4227 == null ? -1 : class336.field4227.method593((byte) 89)) + " - " + class257.field3209 + "," + (class362.field4859.field9517[0] + class26.field245) + "," + (class362.field4859.field9513[0] + class231.field2860) + " - ";
            for (int var3 = 0; class257.field3209 > var3 && var3 < 50; var3++) {
                var2 = var2 + class626.field8849.field1269[var3] + ",";
            }
            class333.method1923(var5, true, var2);
            class73.method394(0, false);
            return true;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "([BIB)[B", line = 50)
    public static final byte[] method536(byte[] arg0, int arg1, byte arg2) {
        field1068++;
        byte[] var3 = new byte[arg1];
        class567.method3213(arg0, 0, var3, 0, arg1);
        int var4 = 49 % ((arg2 - 53) / 60);
        return var3;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIII)V", line = 63)
    public static final void method537(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class470.field6718 != null) {
            class470.field6718[arg0][arg1] = arg2 | 0xFF000000;
        }
        if (class383.field5172 != null) {
            class383.field5172[arg0][arg1] = (short) arg3;
        }
        if (class559.field7988 != null) {
            class559.field7988[arg0][arg1] = (byte) arg4;
        }
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V", line = 82)
    public static final void method538(int arg0) {
        int var1 = 13 / ((arg0 + 67) / 36);
        field1064++;
        class165.field1838 = new class117(8);
        class638.field8995 = 0;
        for (class339 var2 = (class339) class369.field5054.method1672((byte) 76); var2 != null; var2 = (class339) class369.field5054.method1669(-2747)) {
            var2.method1953();
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIZILgd;)V", line = 106)
    public static final void method539(int arg0, int arg1, int arg2, boolean arg3, int arg4, class273 arg5) {
        field1060++;
        if (arg5.field3418 == -1 && arg5.field3409 == null) {
            return;
        }
        if (arg3) {
            field1061 = null;
        }
        int var6 = 0;
        int var7 = class639.field9075.field6809 * arg5.field3395 >> 8;
        if (arg5.field3391 < arg4) {
            var6 += arg4 - arg5.field3391;
        } else if (arg4 < arg5.field3416) {
            var6 += arg5.field3416 - arg4;
        }
        if (arg1 > arg5.field3417) {
            var6 += arg1 - arg5.field3417;
        } else if (arg5.field3396 > arg1) {
            var6 += arg5.field3396 - arg1;
        }
        if (arg5.field3400 == 0 || arg5.field3400 < var6 - 256 || class639.field9075.field6809 == 0 || arg5.field3411 != arg0) {
            if (arg5.field3406 != null) {
                class209.field2471.method3885(arg5.field3406);
                arg5.field3390 = null;
                arg5.field3398 = null;
                arg5.field3406 = null;
            }
            if (arg5.field3405 != null) {
                class209.field2471.method3885(arg5.field3405);
                arg5.field3405 = null;
                arg5.field3420 = null;
                arg5.field3414 = null;
            }
            return;
        }
        var6 -= 256;
        if (var6 < 0) {
            var6 = 0;
        }
        int var8 = (arg5.field3400 - var6) * var7 / arg5.field3400;
        if (arg5.field3406 != null) {
            arg5.field3406.method3910(var8);
        } else if (arg5.field3418 >= 0) {
            if (arg5.field3393) {
                if (arg5.field3390 == null) {
                    arg5.field3390 = class253.method1486(class461.field6558, arg5.field3418);
                }
                if (arg5.field3390 != null) {
                    if (arg5.field3398 == null) {
                        arg5.field3398 = arg5.field3390.method1485(new int[] { 22050 });
                    }
                    if (arg5.field3398 != null) {
                        class704 var9 = class704.method3932(arg5.field3398, 100, var8);
                        var9.method3913(-1);
                        class209.field2471.method3891(var9);
                        arg5.field3406 = var9;
                    }
                }
            } else {
                class52 var10 = class52.method268(class392.field5317, arg5.field3418, 0);
                if (var10 != null) {
                    class450 var11 = var10.method270().method2594(class203.field2397);
                    class704 var12 = class704.method3932(var11, 100, var8);
                    var12.method3913(-1);
                    class209.field2471.method3891(var12);
                    arg5.field3406 = var12;
                }
            }
        }
        if (arg5.field3405 != null) {
            arg5.field3405.method3910(var8);
            if (!arg5.field3405.method1925(14325)) {
                arg5.field3405 = null;
                arg5.field3414 = null;
                arg5.field3420 = null;
            }
        } else if (arg5.field3409 != null && (arg5.field3404 -= arg2) <= 0) {
            if (!arg5.field3389) {
                int var13 = (int) (Math.random() * (double) arg5.field3409.length);
                class52 var14 = class52.method268(class392.field5317, arg5.field3409[var13], 0);
                if (var14 != null) {
                    class450 var15 = var14.method270().method2594(class203.field2397);
                    class704 var16 = class704.method3932(var15, 100, var8);
                    var16.method3913(0);
                    class209.field2471.method3891(var16);
                    arg5.field3404 = (int) ((double) (arg5.field3421 - arg5.field3401) * Math.random()) + arg5.field3401;
                    arg5.field3405 = var16;
                    return;
                }
                return;
            }
            if (arg5.field3420 == null) {
                int var17 = (int) ((double) arg5.field3409.length * Math.random());
                arg5.field3420 = class253.method1486(class461.field6558, arg5.field3409[var17]);
            }
            if (arg5.field3420 != null) {
                if (arg5.field3414 == null) {
                    arg5.field3414 = arg5.field3420.method1485(new int[] { 22050 });
                }
                if (arg5.field3414 != null) {
                    class704 var18 = class704.method3932(arg5.field3414, 100, var8);
                    var18.method3913(0);
                    class209.field2471.method3891(var18);
                    arg5.field3404 = arg5.field3401 + ((int) ((double) (arg5.field3421 - arg5.field3401) * Math.random()));
                    arg5.field3405 = var18;
                    return;
                }
            }
        }
    }
}
