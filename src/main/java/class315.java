import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class315 {

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "Lqu;")
    public static class219 field4921 = new class219(35, 7);

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "Lqu;")
    public static class219 field4925 = new class219(28, 4);

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "I")
    public static int field4919;

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "I")
    public static int field4920;

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "I")
    public static int field4922;

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "I")
    public static int field4924;

    @OriginalMember(owner = "client!ri", name = "i", descriptor = "I")
    public static int field4927;

    @OriginalMember(owner = "client!ri", name = "j", descriptor = "I")
    public static int field4928;

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "Lmn;")
    public static class162 field4926;

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "Lla;")
    public static class299 field4923;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V")
    public static void method2103(int arg0) {
        field4925 = null;
        if (arg0 == -1) {
            field4923 = null;
            field4926 = null;
            field4921 = null;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIII)V")
    public static final void method2104(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4919++;
        int var5 = -55 / ((54 - arg1) / 35);
        class456 var6 = class233.method1654(arg0, 8, 127);
        var6.method2858(10250);
        var6.field7039 = arg4;
        var6.field7042 = arg2;
        var6.field7041 = arg3;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(B)V")
    public static final void method2105(byte arg0) {
        if (arg0 != -81) {
            field4923 = null;
        }
        class307.field4813.method1325(class188.field2734, class481.field7325, class272.field4341);
        field4924++;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static final String method2106(int arg0, long arg1) {
        field4922++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if (arg1 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg1;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            if (arg0 != 26759) {
                method2106(9, -86L);
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                char var9 = class108.field1546[(int) (var7 - (arg1 * 37L))];
                if (var9 == '_') {
                    int var10 = var6.length() - 1;
                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                    var9 = ' ';
                }
                var6.append(var9);
            }
            var6.reverse();
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            return var6.toString();
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "([I[JZ)V")
    public static final void method2107(int[] arg0, long[] arg1, boolean arg2) {
        field4927++;
        if (!arg2) {
            class146.method878(-124, arg1, arg0, 0, arg1.length - 1);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(BIILkj;I)V")
    public static final void method2108(byte arg0, int arg1, int arg2, class55 arg3, int arg4) {
        field4920++;
        if (arg0 != 2) {
            method2105((byte) 82);
        }
        class289 var5 = arg3.method418((byte) -41);
        int var6 = arg3.field849 - arg3.field887.field7375 & 0x3FFF;
        if (arg2 == -1) {
            if (var6 != 0 || arg3.field839 > 25) {
                arg3.field822 = false;
                if (arg4 < 0 && var5.field4534 != -1) {
                    arg3.field837 = var5.field4534;
                } else if (arg4 <= 0 || var5.field4565 == -1) {
                    arg3.field837 = var5.field4561;
                } else {
                    arg3.field837 = var5.field4565;
                }
            } else if (!arg3.field822 || !var5.method1946((byte) -116, arg3.field837)) {
                arg3.field837 = var5.method1950((byte) 117);
                arg3.field822 = arg3.field837 != -1;
            }
        } else if (arg3.field829 != -1 && (var6 >= 10240 || var6 <= 2048)) {
            int var7 = class403.field6060[arg1] - arg3.field887.field7375 & 0x3FFF;
            if (arg2 == 2 && var5.field4526 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field4540 != -1) {
                    arg3.field837 = var5.field4540;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field4559 != -1) {
                    arg3.field837 = var5.field4559;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field4543 == -1) {
                    arg3.field837 = var5.field4526;
                } else {
                    arg3.field837 = var5.field4543;
                }
            } else if (arg2 == 0 && var5.field4519 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field4568 != -1) {
                    arg3.field837 = var5.field4568;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field4575 != -1) {
                    arg3.field837 = var5.field4575;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field4531 == -1) {
                    arg3.field837 = var5.field4519;
                } else {
                    arg3.field837 = var5.field4531;
                }
            } else if (var7 > 2048 && var7 <= 6144 && var5.field4558 != -1) {
                arg3.field837 = var5.field4558;
            } else if (var7 >= 10240 && var7 < 14336 && var5.field4522 != -1) {
                arg3.field837 = var5.field4522;
            } else if (var7 <= 6144 || var7 >= 10240 || var5.field4528 == -1) {
                arg3.field837 = var5.field4561;
            } else {
                arg3.field837 = var5.field4528;
            }
            arg3.field822 = false;
        } else if (var6 == 0 && arg3.field839 <= 25) {
            if (arg2 == 2 && var5.field4526 != -1) {
                arg3.field837 = var5.field4526;
            } else if (arg2 == 0 && var5.field4519 != -1) {
                arg3.field837 = var5.field4519;
            } else {
                arg3.field837 = var5.field4561;
            }
            arg3.field822 = false;
        } else {
            arg3.field822 = false;
            if (arg2 == 2 && var5.field4526 != -1) {
                if (arg4 < 0 && var5.field4545 != -1) {
                    arg3.field837 = var5.field4545;
                } else if (arg4 <= 0 || var5.field4523 == -1) {
                    arg3.field837 = var5.field4526;
                } else {
                    arg3.field837 = var5.field4523;
                }
            } else if (arg2 == 0 && var5.field4519 != -1) {
                if (arg4 < 0 && var5.field4533 != -1) {
                    arg3.field837 = var5.field4533;
                } else if (arg4 <= 0 || var5.field4524 == -1) {
                    arg3.field837 = var5.field4519;
                } else {
                    arg3.field837 = var5.field4524;
                }
            } else if (arg4 < 0 && var5.field4563 != -1) {
                arg3.field837 = var5.field4563;
            } else if (arg4 <= 0 || var5.field4527 == -1) {
                arg3.field837 = var5.field4561;
            } else {
                arg3.field837 = var5.field4527;
            }
        }
    }
}
