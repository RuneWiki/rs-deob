import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public abstract class class228 extends class508 {

    @OriginalMember(owner = "client!ab", name = "s", descriptor = "Lpb;")
    public static class296 field2935 = new class296("", 15);

    @OriginalMember(owner = "client!ab", name = "p", descriptor = "I")
    public static int field2932;

    @OriginalMember(owner = "client!ab", name = "q", descriptor = "I")
    public static int field2933;

    @OriginalMember(owner = "client!ab", name = "r", descriptor = "I")
    public static int field2934;

    @OriginalMember(owner = "client!ab", name = "t", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(B)V", line = 7)
    public static void method1441(byte arg0) {
        if (arg0 >= -87) {
            method1443(-117);
        }
        field2935 = null;
    }

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "(I)V", line = 22)
    public static final void method1443(int arg0) {
        field2932++;
        class300.method1799(class512.field7538, (long) class264.field3353, -21523);
        if (class282.field3610 != -1) {
            class438.method2588(class282.field3610, 2272);
        }
        for (int var1 = 0; var1 < class5.field43; var1++) {
            if (class76.field967[var1]) {
                class264.field3343[var1] = true;
            }
            class316.field4074[var1] = class76.field967[var1];
            class76.field967[var1] = false;
        }
        class254.field3210 = class264.field3353;
        if (class512.field7538.method890()) {
            class417.field5549 = true;
        }
        if (class282.field3610 != -1) {
            class5.field43 = 0;
            class198.method1275((byte) -124);
        }
        class512.field7538.method865();
        class196.method1266(false, class169.field2205);
        if (arg0 == 2) {
            class314.field4050 = 0;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ZILlk;Llk;Z)I", line = 71)
    public static final int method1445(boolean arg0, int arg1, class311 arg2, class311 arg3, boolean arg4) {
        field2934++;
        if (arg1 == 1) {
            int var5 = arg2.field626;
            int var6 = arg3.field626;
            if (!arg4) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return var5 - var6;
        }
        if (arg0) {
            field2935 = null;
        }
        if (arg1 == 2) {
            return class40.method250(arg3.method1856(-1).field2241, class379.field4920, 106, arg2.method1856(-1).field2241);
        } else if (arg1 == 3) {
            if (arg2.field4009.equals("-")) {
                if (arg3.field4009.equals("-")) {
                    return 0;
                } else if (arg4) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg3.field4009.equals("-")) {
                return arg4 ? 1 : -1;
            } else {
                return class40.method250(arg3.field4009, class379.field4920, 80, arg2.field4009);
            }
        } else if (arg1 == 4) {
            if (arg2.method278(1)) {
                return arg3.method278(1) ? 0 : 1;
            } else if (arg3.method278(1)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg1 == 5) {
            if (arg2.method275(1)) {
                return arg3.method275(1) ? 0 : 1;
            } else if (arg3.method275(1)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg1 == 6) {
            if (arg2.method274(5777)) {
                return arg3.method274(5777) ? 0 : 1;
            } else if (arg3.method274(5777)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg1 == 7) {
            if (arg2.method276(0)) {
                return arg3.method276(0) ? 0 : 1;
            } else if (arg3.method276(0)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg1 == 8) {
            int var7 = arg2.field4010;
            int var8 = arg3.field4010;
            if (arg4) {
                if (var8 == 1000) {
                    var8 = -1;
                }
                if (var7 == 1000) {
                    var7 = -1;
                }
            } else {
                if (var7 == -1) {
                    var7 = 1000;
                }
                if (var8 == -1) {
                    var8 = 1000;
                }
            }
            return var7 - var8;
        } else {
            return arg2.field4008 - arg3.field4008;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IZ)V", line = 168)
    public static final void method1446(int arg0, boolean arg1) {
        if (arg0 >= -89) {
            field2936 = 117;
        }
        while (class109.field1514.method103(class37.field574, true) >= 15) {
            int var2 = class109.field1514.method100((byte) 12, 15);
            if (var2 == 32767) {
                break;
            }
            boolean var3 = false;
            if (class527.field7791[var2] == null) {
                class527.field7791[var2] = new class295();
                class527.field7791[var2].field5159 = var2;
                var3 = true;
            }
            class295 var4 = class527.field7791[var2];
            class414.field5507[class16.field264++] = var2;
            var4.field5232 = class264.field3353;
            if (var4.field3831 != null && var4.field3831.method72(0)) {
                class11.method81(var4, (byte) -58);
            }
            int var5 = class109.field1514.method100((byte) 21, 2);
            int var6 = class109.field1514.method100((byte) 127, 3) + 4 << 11 & 0x3974;
            int var7;
            if (arg1) {
                var7 = class109.field1514.method100((byte) 30, 8);
                if (var7 > 127) {
                    var7 -= 256;
                }
            } else {
                var7 = class109.field1514.method100((byte) -113, 5);
                if (var7 > 15) {
                    var7 -= 32;
                }
            }
            var4.method1776(class192.field2495.method1869(class109.field1514.method100((byte) 11, 14), false), (byte) 87);
            int var8 = class109.field1514.method100((byte) 113, 1);
            if (var8 == 1) {
                class9.field96[class24.field428++] = var2;
            }
            int var9;
            if (arg1) {
                var9 = class109.field1514.method100((byte) 120, 8);
                if (var9 > 127) {
                    var9 -= 256;
                }
            } else {
                var9 = class109.field1514.method100((byte) -121, 5);
                if (var9 > 15) {
                    var9 -= 32;
                }
            }
            int var10 = class109.field1514.method100((byte) -74, 1);
            var4.method2353(var4.field3831.field128, (byte) 107);
            var4.field5200 = var4.field3831.field138 << 3;
            if (var4.field5200 == 0) {
                var4.method2344(0, -18840);
            } else if (var3) {
                var4.method2344(var6, -18840);
            }
            var4.method1769(var4.method2342(10804), class37.field573.field5246[0] + var7, class37.field573.field5251[0] + var9, var5, var10 == 1, 0);
            if (var4.field3831.method72(0)) {
                class25.method167(null, var4, null, var4.field5246[0], 0, 255, var4.field6220, var4.field5251[0]);
            }
        }
        field2933++;
        class109.field1514.method102(110);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)I")
    public abstract int method1439(int arg0);

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "(I)J")
    public abstract long method1440(int arg0);

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "(B)I")
    public abstract int method1442(byte arg0);

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "(I)I")
    public abstract int method1444(int arg0);
}
