import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class233 {

    @OriginalMember(owner = "client!uq", name = "f", descriptor = "[C")
    public static char[] field3215 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "I")
    public static int field3210;

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "I")
    public static int field3211;

    @OriginalMember(owner = "client!uq", name = "c", descriptor = "I")
    public static int field3212;

    @OriginalMember(owner = "client!uq", name = "d", descriptor = "I")
    public static int field3213;

    @OriginalMember(owner = "client!uq", name = "e", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!uq", name = "g", descriptor = "I")
    public static int field3216;

    @OriginalMember(owner = "client!uq", name = "h", descriptor = "I")
    public static int field3217;

    @OriginalMember(owner = "client!uq", name = "i", descriptor = "I")
    public static int field3218;

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(III)I", line = 7)
    public static final int method1259(int arg0, int arg1, int arg2) {
        field3217++;
        int var3 = 16 % ((arg2 + 7) / 63);
        return arg0 == 4 || arg0 == 5 ? class69.field732[arg1 & 0x3] : 256;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(I)V", line = 21)
    public static final void method1260(int arg0) {
        field3211++;
        if (arg0 != -2) {
            field3215 = null;
        }
        class114 var1 = class374.field5258;
        synchronized (class374.field5258) {
            class374.field5258.method613(true);
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(B)V", line = 34)
    public static final void method1261(byte arg0) {
        if (arg0 == -18) {
            class69.field722.method606((byte) 92);
            field3216++;
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(II)V", line = 45)
    public static final void method1262(int arg0, int arg1) {
        class38.field394.method614(-123, arg1);
        field3212++;
        if (arg0 > -21) {
            method1265(-64, -39);
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Ltq;I)V", line = 57)
    public static final void method1263(class250 arg0, int arg1) {
        field3210++;
        if (arg0.field3406.length - arg0.field3389 < 1) {
            return;
        }
        int var2 = arg0.method1350(arg1 ^ 0x7A21);
        if (var2 < 0 || var2 > 14) {
            return;
        }
        byte var3;
        if (var2 == 14) {
            var3 = 36;
        } else if (var2 == 13) {
            var3 = 35;
        } else if (var2 == 12) {
            var3 = 34;
        } else if (var2 == 11) {
            var3 = 33;
        } else if (var2 == 10) {
            var3 = 32;
        } else if (var2 == 9) {
            var3 = 31;
        } else if (var2 == 8) {
            var3 = 30;
        } else if (var2 == 7) {
            var3 = 29;
        } else if (var2 == 6) {
            var3 = 28;
        } else if (var2 == 5) {
            var3 = 28;
        } else if (var2 == 4) {
            var3 = 24;
        } else if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if ((arg0.field3406.length - arg0.field3389) < var3) {
            return;
        }
        class168.field2125 = arg0.method1350(31351);
        if (class168.field2125 < 1) {
            class168.field2125 = 1;
        } else if (class168.field2125 > 4) {
            class168.field2125 = 4;
        }
        class424.method2637(arg0.method1350(arg1 + 31265) == 1, -1417244891);
        class177.field2217 = arg0.method1350(31351) == 1;
        class216.field2905 = arg0.method1350(arg1 + 31265) == 1;
        class92.field1058 = arg0.method1350(31351) == 1;
        class295.field4005 = arg0.method1350(31351) == 1 ? 1 : 0;
        class448.field6510 = arg0.method1350(31351) == 1;
        class2.field19 = arg0.method1350(arg1 + 31265) == 1;
        class405.field5900 = arg0.method1350(31351) == 1;
        class169.field2133 = arg0.method1350(arg1 + 31265);
        if (class169.field2133 > 2) {
            class169.field2133 = 2;
        }
        if (arg1 != 86) {
            field3213 = 43;
        }
        if (var2 < 2) {
            class199.field2664 = arg0.method1350(arg1 + 31265) == 1;
            arg0.method1350(arg1 ^ 0x7A21);
        } else {
            class199.field2664 = arg0.method1350(31351) == 1;
        }
        class29.field278 = arg0.method1350(31351) == 1;
        class264.field3609 = arg0.method1350(31351) == 1;
        class9.field80 = arg0.method1350(31351);
        if (class9.field80 > 2) {
            class9.field80 = 2;
        }
        class424.field6226 = class9.field80;
        class84.field942 = arg0.method1350(31351) == 1;
        class63.field653 = arg0.method1350(31351);
        if (class63.field653 > 127) {
            class63.field653 = 127;
        }
        class160.field2062 = arg0.method1350(31351);
        class295.field4002 = arg0.method1350(31351);
        if (class295.field4002 > 127) {
            class295.field4002 = 127;
        }
        if (var2 >= 1) {
            class444.field6490 = arg0.method1374(-2);
            class335.field4449 = arg0.method1374(-2);
        }
        if (var2 >= 3 && var2 < 6) {
            arg0.method1350(31351);
        }
        if (var2 >= 4) {
            int var4 = arg0.method1350(31351);
            if (var4 < 0 || var4 > 2) {
                var4 = 0;
            }
            if (class436.field6389 < 96) {
                var4 = 0;
            }
            class34.method163(-32, var4);
        }
        if (var2 >= 5) {
            class289.field3931 = arg0.method1359(255);
        }
        int var5 = 0;
        if (var2 >= 6) {
            class284.field3877 = var5 = arg0.method1350(31351);
        }
        if (class284.field3877 != 1 && class284.field3877 != 2) {
            class284.field3877 = 2;
        }
        if (var2 >= 7) {
            class308.field4173 = arg0.method1350(31351) == 1;
        }
        if (var2 >= 8) {
            class165.field2104 = arg0.method1350(31351) == 1;
        }
        if (var2 >= 9) {
            class292.field3962 = arg0.method1350(31351);
        }
        if (class292.field3962 < 0 || class292.field3962 > 3) {
            class292.field3962 = 0;
        }
        if (var2 >= 10) {
            class225.field3041 = arg0.method1350(31351) != 0;
        }
        if (var2 >= 11) {
            class274.field3689 = arg0.method1350(31351) != 0;
        }
        if (var2 >= 12) {
            class295.field4005 = arg0.method1350(arg1 + 31265);
        }
        if (class295.field4005 < 0 || class295.field4005 > 2) {
            class295.field4005 = 1;
        }
        if (var2 >= 13) {
            class297.field4040 = arg0.method1350(31351) == 1;
        }
        if (var2 >= 14) {
            class417.field6000 = arg0.method1350(31351);
        } else if (var5 == 0) {
            class417.field6000 = 2;
        } else {
            class417.field6000 = 1;
        }
        if (class417.field6000 < 0 || class417.field6000 > 3) {
            class417.field6000 = 2;
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lal;Ljava/awt/Canvas;II)Lvm;", line = 283)
    public static final class322 method1264(class369 arg0, Canvas arg1, int arg2, int arg3) {
        if (arg2 != 2) {
            field3215 = null;
        }
        field3218++;
        return new class280(arg1, arg0, arg3);
    }

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "(II)V", line = 295)
    public static final void method1265(int arg0, int arg1) {
        field3214++;
        class114 var2 = class374.field5258;
        synchronized (class374.field5258) {
            if (arg1 != 1) {
                field3213 = -5;
            }
            class374.field5258.method613(true);
            class374.field5258 = new class114(arg0);
        }
    }

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "(B)V", line = 309)
    public static void method1266(byte arg0) {
        if (arg0 <= 79) {
            method1259(34, -58, 64);
        }
        field3215 = null;
    }
}
