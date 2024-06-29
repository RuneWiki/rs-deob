import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tea")
public class class704 {

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "I")
    public static int field9980;

    @OriginalMember(owner = "client!tea", name = "b", descriptor = "I")
    public static int field9981;

    @OriginalMember(owner = "client!tea", name = "c", descriptor = "I")
    public static int field9982;

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(BLrg;III)V", line = 5)
    public static final void method3941(byte arg0, class523 arg1, int arg2, int arg3, int arg4) {
        int var5 = 126 % ((arg0 - 13) / 43);
        field9980++;
        class589 var6 = arg1.method2957(true);
        int var7 = arg1.field7333 - arg1.field7349.field5078 & 0x3FFF;
        if (arg2 == -1) {
            if (var7 != 0 || arg1.field7356 > 25) {
                if (arg4 < 0 && var6.field8565 != -1) {
                    arg1.field7404 = false;
                    arg1.field7334 = var6.field8565;
                } else if (arg4 <= 0 || var6.field8563 == -1) {
                    arg1.field7334 = var6.field8573;
                } else {
                    arg1.field7334 = var6.field8563;
                }
                arg1.field7404 = false;
            } else if (!arg1.field7404 || !var6.method3363(arg1.field7334, 0)) {
                arg1.field7334 = var6.method3365(125);
                arg1.field7404 = arg1.field7334 != -1;
            }
        } else if (arg1.field7423 != -1 && (var7 >= 10240 || var7 <= 2048)) {
            int var8 = class453.field6531[arg3] - arg1.field7349.field5078 & 0x3FFF;
            arg1.field7404 = false;
            if (arg2 == 2 && var6.field8562 != -1) {
                if (var8 > 2048 && var8 <= 6144 && var6.field8579 != -1) {
                    arg1.field7334 = var6.field8579;
                } else if (var8 >= 10240 && var8 < 14336 && var6.field8575 != -1) {
                    arg1.field7334 = var6.field8575;
                } else if (var8 <= 6144 || var8 >= 10240 || var6.field8572 == -1) {
                    arg1.field7334 = var6.field8562;
                } else {
                    arg1.field7334 = var6.field8572;
                }
            } else if (arg2 == 0 && var6.field8543 != -1) {
                if (var8 > 2048 && var8 <= 6144 && var6.field8557 != -1) {
                    arg1.field7334 = var6.field8557;
                } else if (var8 >= 10240 && var8 < 14336 && var6.field8539 != -1) {
                    arg1.field7334 = var6.field8539;
                } else if (var8 <= 6144 || var8 >= 10240 || var6.field8554 == -1) {
                    arg1.field7334 = var6.field8543;
                } else {
                    arg1.field7334 = var6.field8554;
                }
            } else if (var8 > 2048 && var8 <= 6144 && var6.field8570 != -1) {
                arg1.field7334 = var6.field8570;
            } else if (var8 >= 10240 && var8 < 14336 && var6.field8541 != -1) {
                arg1.field7334 = var6.field8541;
            } else if (var8 <= 6144 || var8 >= 10240 || var6.field8568 == -1) {
                arg1.field7334 = var6.field8573;
            } else {
                arg1.field7334 = var6.field8568;
            }
        } else if (var7 == 0 && arg1.field7356 <= 25) {
            if (arg2 == 2 && var6.field8562 != -1) {
                arg1.field7334 = var6.field8562;
            } else if (arg2 == 0 && var6.field8543 != -1) {
                arg1.field7334 = var6.field8543;
            } else {
                arg1.field7334 = var6.field8573;
            }
            arg1.field7404 = false;
        } else {
            arg1.field7404 = false;
            if (arg2 == 2 && var6.field8562 != -1) {
                if (arg4 < 0 && var6.field8552 != -1) {
                    arg1.field7334 = var6.field8552;
                } else if (arg4 <= 0 || var6.field8585 == -1) {
                    arg1.field7334 = var6.field8562;
                } else {
                    arg1.field7334 = var6.field8585;
                }
            } else if (arg2 == 0 && var6.field8543 != -1) {
                if (arg4 < 0 && var6.field8548 != -1) {
                    arg1.field7334 = var6.field8548;
                } else if (arg4 <= 0 || var6.field8546 == -1) {
                    arg1.field7334 = var6.field8543;
                } else {
                    arg1.field7334 = var6.field8546;
                }
            } else if (arg4 < 0 && var6.field8532 != -1) {
                arg1.field7334 = var6.field8532;
            } else if (arg4 <= 0 || var6.field8581 == -1) {
                arg1.field7334 = var6.field8573;
            } else {
                arg1.field7334 = var6.field8581;
            }
        }
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(III)Lsda;", line = 169)
    public static final class489 method3942(int arg0, int arg1, int arg2) {
        field9982++;
        class489 var3 = (class489) class9.field253.method2002((byte) -117, (long) arg1 << 32 | (long) arg0);
        if (arg2 != 0) {
            return null;
        }
        if (var3 == null) {
            var3 = new class489(arg1, arg0);
            class9.field253.method2001(82, var3, var3.field5740);
        }
        return var3;
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(B)V", line = 191)
    public static final void method3943(byte arg0) {
        int var1 = 43 % ((66 - arg0) / 60);
        class597.field8644.method1905(0);
        field9981++;
        class54.field827.method1905(0);
        for (class426 var2 = (class426) class152.field2150.method1904(false); var2 != null; var2 = (class426) class152.field2150.method1901(126)) {
            int var19 = var2.field6223;
            if (var19 < 1000) {
                var2.method2360((byte) 66);
                if (var19 == 57 || var19 == 9 || var19 == 50 || var19 == 3 || var19 == 59 || var19 == 22 || var19 == 46) {
                    class54.field827.method1909(var2, (byte) -81);
                } else {
                    class597.field8644.method1909(var2, (byte) -81);
                }
            }
        }
        class597.field8644.method1910(class152.field2150, (byte) -83);
        class54.field827.method1910(class152.field2150, (byte) -83);
        if (class373.field5520 <= 1) {
            class340.field4933 = null;
        } else if (class51.field790 && class18.field362.method1609(81, -27453) && class373.field5520 > 2) {
            class340.field4933 = (class426) class152.field2150.field4475.field5735.field5735;
        } else {
            class340.field4933 = (class426) class152.field2150.field4475.field5735;
        }
        int var3 = -1;
        class147 var4 = (class147) class430.field6262.method1904(false);
        if (var4 != null) {
            var3 = var4.method479((byte) 41);
        }
        if (!class683.field9638) {
            if (var3 == 0 && (class342.field5060 == 1 && class373.field5520 > 2 || class221.method1388((byte) -47))) {
                var3 = 2;
            }
            if (var3 == 2 && class373.field5520 > 0 && var4 != null) {
                if (class188.field2561 == null && class393.field5949 == 0) {
                    class172.method1191((byte) -93, var4.method478(0), var4.method475(-2));
                } else {
                    class44.field659 = 2;
                }
            }
            if (var3 == 0 && class373.field5520 > 0) {
                class395.method2464(4752);
            }
            if (class188.field2561 != null || class393.field5949 != 0) {
                return;
            }
            class44.field659 = 0;
            class606.field8763 = null;
            return;
        }
        if (var3 == -1) {
            int var5 = class315.field4612.method2340(40960);
            int var6 = class315.field4612.method2338((byte) 123);
            if ((class201.field2730 - 10) > var5 || (class201.field2730 + class367.field5374 + 10) < var5 || var6 < class291.field4283 - 10 || var6 > (class291.field4283 + class232.field3067 + 10)) {
                class291.method1794(15669);
            }
        }
        if (var3 != 0) {
            return;
        }
        int var7 = class201.field2730;
        int var8 = class291.field4283;
        int var9 = class367.field5374;
        int var10 = var4.method478(0);
        int var11 = var4.method475(-2);
        int var12 = -1;
        for (int var13 = 0; var13 < class373.field5520; var13++) {
            if (class70.field1083) {
                int var18 = (class373.field5520 - var13 - 1) * 16 + var8 + 33;
                if (var7 < var10 && var7 + var9 > var10 && var11 > (var18 - 13) && var11 < var18 + 4) {
                    var12 = var13;
                }
            } else {
                int var17 = (class373.field5520 - var13 - 1) * 16 + var8 + 31;
                if (var7 < var10 && (var7 + var9) > var10 && var11 > var17 - 13 && var11 < (var17 + 3)) {
                    var12 = var13;
                }
            }
        }
        if (var12 != -1) {
            int var14 = 0;
            class656 var15 = new class656(class152.field2150);
            for (class426 var16 = (class426) var15.method3704((byte) -105); var16 != null; var16 = (class426) var15.method3706(18)) {
                if (var12 == var14) {
                    class85.method482(var16, 0, var11, var10);
                }
                var14++;
            }
        }
        class291.method1794(15669);
        return;
    }
}
