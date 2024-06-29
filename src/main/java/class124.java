import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public abstract class class124 {

    @OriginalMember(owner = "client!c", name = "a", descriptor = "I")
    public static int field2144 = 0;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "[Lpn;")
    public static class528[] field2145 = new class528[4];

    @OriginalMember(owner = "client!c", name = "c", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "I")
    public static int field2147;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Z)V", line = 13)
    public static final void method985(boolean arg0) {
        if (arg0) {
            class518.field7511 = class310.field4698;
            class520.field7560 = class293.field4481;
        } else {
            class518.field7511 = class224.field3513;
            class520.field7560 = class531.field7727;
        }
        class138.field2320 = class518.field7511.length;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(III)V", line = 28)
    public static final void method986(int arg0, int arg1, int arg2) {
        class234 var3 = class518.field7511[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field3610 != null) {
            var3.field3610 = null;
        }
        if (var3.field3613 != null) {
            var3.field3613 = null;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(B)V", line = 41)
    public static void method987(byte arg0) {
        field2145 = null;
        if (arg0 != -102) {
            method986(-50, -122, -37);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIILms;I)V", line = 55)
    public static final void method988(int arg0, int arg1, int arg2, class535 arg3, int arg4) {
        field2147++;
        class166 var5 = arg3.method3169((byte) 23);
        int var6 = arg3.field7806 - arg3.field7814.field7625 & 0x3FFF;
        if (arg1 == -1) {
            if (var6 != 0 || arg3.field7835 > 25) {
                arg3.field7781 = false;
                if (arg4 < 0 && var5.field2664 != -1) {
                    arg3.field7800 = var5.field2664;
                } else if (arg4 <= 0 || var5.field2653 == -1) {
                    arg3.field7800 = var5.field2645;
                } else {
                    arg3.field7800 = var5.field2653;
                }
            } else if (!arg3.field7781 || !var5.method1170(arg3.field7800, (byte) 99)) {
                arg3.field7800 = var5.method1171((byte) -119);
                arg3.field7781 = arg3.field7800 != -1;
            }
        } else if (arg3.field7804 != -1 && var6 >= 10240 || var6 <= 2048) {
            int var7 = class315.field4756[arg2] - arg3.field7814.field7625 & 0x3FFF;
            arg3.field7781 = false;
            if (arg1 == 2 && var5.field2684 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field2644 != -1) {
                    arg3.field7800 = var5.field2644;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field2677 != -1) {
                    arg3.field7800 = var5.field2677;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field2671 == -1) {
                    arg3.field7800 = var5.field2684;
                } else {
                    arg3.field7800 = var5.field2671;
                }
            } else if (arg1 == 0 && var5.field2681 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field2663 != -1) {
                    arg3.field7800 = var5.field2663;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field2640 != -1) {
                    arg3.field7800 = var5.field2640;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field2659 == -1) {
                    arg3.field7800 = var5.field2681;
                } else {
                    arg3.field7800 = var5.field2659;
                }
            } else if (var7 > 2048 && var7 <= 6144 && var5.field2683 != -1) {
                arg3.field7800 = var5.field2683;
            } else if (var7 >= 10240 && var7 < 14336 && var5.field2682 != -1) {
                arg3.field7800 = var5.field2682;
            } else if (var7 <= 6144 || var7 >= 10240 || var5.field2658 == -1) {
                arg3.field7800 = var5.field2645;
            } else {
                arg3.field7800 = var5.field2658;
            }
        } else if (var6 == 0 && arg3.field7835 <= 25) {
            arg3.field7781 = false;
            if (arg1 == 2 && var5.field2684 != -1) {
                arg3.field7800 = var5.field2684;
            } else if (arg1 == 0 && var5.field2681 != -1) {
                arg3.field7800 = var5.field2681;
            } else {
                arg3.field7800 = var5.field2645;
            }
        } else {
            if (arg1 == 2 && var5.field2684 != -1) {
                if (arg4 < 0 && var5.field2673 != -1) {
                    arg3.field7800 = var5.field2673;
                } else if (arg4 <= 0 || var5.field2662 == -1) {
                    arg3.field7800 = var5.field2684;
                } else {
                    arg3.field7800 = var5.field2662;
                }
            } else if (arg1 == 0 && var5.field2681 != -1) {
                if (arg4 < 0 && var5.field2650 != -1) {
                    arg3.field7800 = var5.field2650;
                } else if (arg4 <= 0 || var5.field2676 == -1) {
                    arg3.field7800 = var5.field2681;
                } else {
                    arg3.field7800 = var5.field2676;
                }
            } else if (arg4 < 0 && var5.field2638 != -1) {
                arg3.field7800 = var5.field2638;
            } else if (arg4 <= 0 || var5.field2649 == -1) {
                arg3.field7800 = var5.field2645;
            } else {
                arg3.field7800 = var5.field2649;
            }
            arg3.field7781 = false;
        }
        if (arg0 != -653) {
            method985(false);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IB)V", line = 228)
    public static final void method989(int arg0, byte arg1) {
        if (!class186.field2990.field2553) {
            arg0 = -1;
        }
        field2148++;
        if (arg1 != -55) {
            field2144 = 65;
        }
        if (class380.field5554 == arg0) {
            return;
        }
        if (arg0 != -1) {
            class409 var2 = class62.field1264.method1694(arg0, false);
            class340 var3 = var2.method2537(0);
            if (var3 == null) {
                arg0 = -1;
            } else {
                class497.field7305.method2871(var3.method2140(), var3.method2138(), class262.field4007, 17, new Point(var2.field6196, var2.field6194), var3.method2149());
                class380.field5554 = arg0;
            }
        }
        if (arg0 == -1 && class380.field5554 != -1) {
            class497.field7305.method2871(-1, -1, class262.field4007, 17, new Point(), null);
            class380.field5554 = -1;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(III[I)V")
    public abstract void method837(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!c", name = "A", descriptor = "(I)V")
    public abstract void method836(int arg0);

    @OriginalMember(owner = "client!c", name = "YA", descriptor = "(IIIIII)V")
    public abstract void method839(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!c", name = "K", descriptor = "(III[I)V")
    public abstract void method829(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!c", name = "wa", descriptor = "([I)V")
    public abstract void method831(int[] arg0);

    @OriginalMember(owner = "client!c", name = "U", descriptor = "(III)V")
    public abstract void method835(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!c", name = "v", descriptor = "()V")
    public abstract void method827();

    @OriginalMember(owner = "client!c", name = "EA", descriptor = "(I)V")
    public abstract void method826(int arg0);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "()Lc;")
    public abstract class124 method833();

    @OriginalMember(owner = "client!c", name = "ea", descriptor = "(I)V")
    public abstract void method830(int arg0);

    @OriginalMember(owner = "client!c", name = "ca", descriptor = "(I)V")
    public abstract void method832(int arg0);

    @OriginalMember(owner = "client!c", name = "W", descriptor = "(III)V")
    public abstract void method834(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!c", name = "g", descriptor = "(I)V")
    public abstract void method838(int arg0);

    @OriginalMember(owner = "client!c", name = "ha", descriptor = "(Lc;)V")
    public abstract void method828(class124 arg0);
}
