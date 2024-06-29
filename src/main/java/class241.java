import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class241 extends class346 {

    @OriginalMember(owner = "client!er", name = "H", descriptor = "I")
    public static int field3371 = -2;

    @OriginalMember(owner = "client!er", name = "O", descriptor = "[I")
    public static int[] field3378 = new int[500];

    @OriginalMember(owner = "client!er", name = "N", descriptor = "I")
    public static int field3377 = 0;

    @OriginalMember(owner = "client!er", name = "I", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!er", name = "K", descriptor = "I")
    public static int field3374;

    @OriginalMember(owner = "client!er", name = "L", descriptor = "I")
    public static int field3375;

    @OriginalMember(owner = "client!er", name = "M", descriptor = "I")
    public static int field3376;

    @OriginalMember(owner = "client!er", name = "J", descriptor = "[I")
    public static int[] field3373;

    @OriginalMember(owner = "client!er", name = "<init>", descriptor = "()V", line = 3)
    public class241() {
        super(0, true);
    }

    @OriginalMember(owner = "client!er", name = "d", descriptor = "(B)V", line = 8)
    public static void method1556(byte arg0) {
        field3373 = null;
        field3378 = null;
        if (arg0 != 76) {
            method1557(true);
        }
    }

    @OriginalMember(owner = "client!er", name = "d", descriptor = "(Z)I", line = 19)
    public static final int method1557(boolean arg0) {
        field3376++;
        try {
            if (class258.field3804 == 0) {
                if (class125.field1623 > (class98.method768((byte) -128) - 5000L)) {
                    return 0;
                }
                class184.field2477 = class63.field948.method2385(0, class112.field1451, class322.field4800);
                class329.field4851 = class98.method768((byte) 44);
                class258.field3804 = 1;
            }
            if (!arg0) {
                field3378 = null;
            }
            if ((class329.field4851 + 30000L) < class98.method768((byte) 114)) {
                return class66.method570((byte) -56, 1000);
            }
            if (class258.field3804 == 1) {
                if (class184.field2477.field3104 == 2) {
                    return class66.method570((byte) -56, 1001);
                }
                if (class184.field2477.field3104 != 1) {
                    return -1;
                }
                class290.field4380 = new class359((Socket) class184.field2477.field3105, class63.field948);
                class184.field2477 = null;
                int var1 = 0;
                if (class322.field4797) {
                    var1 = class390.field5705;
                }
                class140.field1797.field5049 = 0;
                class140.field1797.method2204(23, 8);
                class140.field1797.method2240((byte) -88, var1);
                class290.field4380.method2365(class140.field1797.field5042, class140.field1797.field5049, 5000, 0);
                if (class78.field1088 != null) {
                    class78.field1088.method2536(0);
                }
                if (class261.field3836 != null) {
                    class261.field3836.method2536(0);
                }
                int var2 = class290.field4380.method2362(27648);
                if (class78.field1088 != null) {
                    class78.field1088.method2536(0);
                }
                if (class261.field3836 != null) {
                    class261.field3836.method2536(0);
                }
                if (var2 != 0) {
                    return class66.method570((byte) -56, var2);
                }
                class258.field3804 = 2;
            }
            if (class258.field3804 == 2) {
                if (class290.field4380.method2359(true) < 2) {
                    return -1;
                }
                class84.field1156 = class290.field4380.method2362(27648);
                class84.field1156 <<= 0x8;
                class84.field1156 += class290.field4380.method2362(27648);
                class436.field6336 = new byte[class84.field1156];
                class212.field2931 = 0;
                class258.field3804 = 3;
            }
            if (class258.field3804 != 3) {
                return -1;
            }
            int var3 = class290.field4380.method2359(true);
            if (var3 < 1) {
                return -1;
            }
            if (var3 > class84.field1156 - class212.field2931) {
                var3 = class84.field1156 - class212.field2931;
            }
            class290.field4380.method2366(class436.field6336, 0, class212.field2931, var3);
            class212.field2931 += var3;
            if (class84.field1156 > class212.field2931) {
                return -1;
            } else if (class50.method364(class436.field6336, -2)) {
                class1.field15 = new class184[class230.field3156];
                int var4 = 0;
                for (int var5 = class269.field3988; var5 <= class373.field5498; var5++) {
                    class184 var6 = class158.method1049(var5, -21426);
                    if (var6 != null) {
                        class1.field15[var4++] = var6;
                    }
                }
                class166.field2247 = 0;
                class228.field3149 = null;
                class290.field4380.method2360((byte) 123);
                class362.field5361 = 0;
                class436.field6336 = null;
                class290.field4380 = null;
                class258.field3804 = 0;
                class125.field1623 = class98.method768((byte) -98);
                return 0;
            } else {
                return class66.method570((byte) -56, 1002);
            }
        } catch (IOException var7) {
            return class66.method570((byte) -56, 1003);
        }
    }

    @OriginalMember(owner = "client!er", name = "d", descriptor = "(I)V", line = 180)
    public static final void method1558(int arg0) {
        class140.field1797.field5049 = 0;
        field3372++;
        class20.field342 = 0;
        class86.field1199 = -1;
        class400.field5861 = -1;
        class27.field471.field5049 = 0;
        class21.field383 = 0;
        class402.field5870 = -1;
        class8.field112 = -1;
        class195.field2702 = 0;
        class373.method2454((byte) -2);
        class390.method2517(-70);
        for (int var1 = 0; var1 < class176.field2382.length; var1++) {
            if (class176.field2382[var1] != null) {
                class176.field2382[var1].field2179 = -1;
            }
        }
        for (int var2 = arg0; var2 < class388.field5670.length; var2++) {
            if (class388.field5670[var2] != null) {
                class388.field5670[var2].field2179 = -1;
            }
        }
        class354.method2330((byte) 113);
        class212.field2884 = 1;
        class63.method558(30, true);
        for (int var3 = 0; var3 < 100; var3++) {
            class33.field536[var3] = true;
        }
        class132.method944((byte) 102);
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(II)[I", line = 233)
    public final int[] method45(int arg0, int arg1) {
        if (arg1 == 3) {
            field3375++;
            return class361.field5340;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "([[[BLtj;IIIIIIIIIII)V", line = 244)
    public static final void method1559(byte[][][] arg0, class298 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        field3374++;
        if (arg4 != -2658) {
            method1558(16);
        }
        if (arg5 == 0 || arg8 == 0) {
            return;
        }
        if (arg5 == 9) {
            arg9 = arg9 + 1 & 0x3;
            arg5 = 1;
        }
        if (arg5 == 10) {
            arg5 = 1;
            arg9 = arg9 + 3 & 0x3;
        }
        if (arg5 == 11) {
            arg9 = arg9 + 3 & 0x3;
            arg5 = 8;
        }
        arg1.method426(arg7, arg2, arg11, arg12, arg6, arg3, arg0[arg5 - 1][arg9], arg8, arg10);
    }
}
