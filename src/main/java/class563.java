import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class563 extends class324 {

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "I")
    public static int field8024 = 0;

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "Ldh;")
    public static class271 field8025 = new class271(0, -1);

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
    public int field8021;

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
    public int field8022;

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "I")
    public static int field8023;

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "I")
    public static int field8026;

    @OriginalMember(owner = "client!lc", name = "p", descriptor = "I")
    public static int field8027;

    @OriginalMember(owner = "client!lc", name = "q", descriptor = "I")
    public static int field8028;

    @OriginalMember(owner = "client!lc", name = "r", descriptor = "I")
    public static int field8029;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(CB)Z")
    public static final boolean method3253(char arg0, byte arg1) {
        if (arg1 != 90) {
            field8025 = null;
        }
        field8026++;
        return arg0 >= '0' && arg0 <= '9';
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIILhh;)V")
    public static final void method3254(int arg0, int arg1, int arg2, class111 arg3) {
        class99 var4 = class290.method1876(arg0, arg1, arg2);
        if (var4 != null) {
            var4.field1174 = arg3;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(III)Z")
    public static final boolean method3255(int arg0, int arg1, int arg2) {
        field8029++;
        if (arg1 != 29686) {
            field8024 = -106;
        }
        return class55.method410(125, arg0, arg2) || class496.method2975(arg0, (byte) -54, arg2);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIII)V")
    public static final void method3256(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field8028++;
        if (class461.field6877 >= arg2 && arg0 >= class418.field6298) {
            boolean var6;
            if (arg4 < class113.field1385) {
                arg4 = class113.field1385;
                var6 = false;
            } else if (class4.field43 >= arg4) {
                var6 = true;
            } else {
                arg4 = class4.field43;
                var6 = false;
            }
            boolean var7;
            if (class113.field1385 > arg3) {
                arg3 = class113.field1385;
                var7 = false;
            } else if (arg3 > class4.field43) {
                var7 = false;
                arg3 = class4.field43;
            } else {
                var7 = true;
            }
            if (arg2 < class418.field6298) {
                arg2 = class418.field6298;
            } else {
                class645.method3675(121, class402.field6087[arg2++], arg5, arg4, arg3);
            }
            if (arg0 > class461.field6877) {
                arg0 = class461.field6877;
            } else {
                class645.method3675(89, class402.field6087[arg0--], arg5, arg4, arg3);
            }
            if (var6 && var7) {
                for (int var8 = arg2; var8 <= arg0; var8++) {
                    int[] var9 = class402.field6087[var8];
                    var9[arg4] = var9[arg3] = arg5;
                }
            } else if (var6) {
                for (int var10 = arg2; var10 <= arg0; var10++) {
                    class402.field6087[var10][arg4] = arg5;
                }
            } else if (var7) {
                for (int var11 = arg2; var11 <= arg0; var11++) {
                    class402.field6087[var11][arg3] = arg5;
                }
            }
        }
        int var12 = -119 % (-arg1 / 43);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lqb;B)V")
    public static final void method3257(class191 arg0, byte arg1) {
        field8023++;
        boolean var2 = false;
        if (class287.field3982 == arg0.field2498 || arg0.field2502 == -1 || arg0.field2482 != 0) {
            var2 = true;
        } else {
            class177 var3 = class259.field3686.method2961(arg0.field2502, 8);
            if (var3.field2153 || arg0.field2487 + 1 > var3.field2150[arg0.field2491]) {
                var2 = true;
            }
        }
        if (arg1 < 39) {
            method3256(-8, 82, -107, 100, -87, -49);
        }
        if (var2) {
            int var4 = arg0.field2498 - arg0.field2459;
            int var5 = class287.field3982 - arg0.field2459;
            int var6 = arg0.field2466 * 512 + (arg0.method1153(true) * 256);
            int var7 = arg0.field2429 * 512 + (arg0.method1153(true) * 256);
            int var8 = arg0.field2463 * 512 + arg0.method1153(true) * 256;
            int var9 = arg0.field2461 * 512 + (arg0.method1153(true) * 256);
            arg0.field1768 = ((var4 - var5) * var7 + var5 * var9) / var4;
            arg0.field1764 = ((var4 - var5) * var6 + (var5 * var8)) / var4;
        }
        arg0.field2516 = 0;
        if (arg0.field2441 == 0) {
            arg0.method1149(8192, 123, false);
        }
        if (arg0.field2441 == 1) {
            arg0.method1149(12288, 125, false);
        }
        if (arg0.field2441 == 2) {
            arg0.method1149(0, 115, false);
        }
        if (arg0.field2441 == 3) {
            arg0.method1149(4096, 93, false);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(BIIIIIII)V")
    public static final void method3258(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field8027++;
        int var8 = arg7 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = (class635.field9133 - class310.field4560) * var8 / 100 + class310.field4560;
        if (arg0 != 15) {
            return;
        }
        int var10 = arg2 * var9 >> 8;
        int var11 = 16384 - arg3 & 0x3FFF;
        int var12 = 16384 - arg4 & 0x3FFF;
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (var11 != 0) {
            var14 = class605.field8859[var11] * -var10 >> 14;
            var15 = class605.field8858[var11] * var10 >> 14;
        }
        if (var12 != 0) {
            var13 = class605.field8859[var12] * var15 >> 14;
            var15 = class605.field8858[var12] * var15 >> 14;
        }
        class17.field177 = arg4;
        class309.field4550 = arg3;
        class337.field4821 = arg6 - var13;
        class207.field2781 = arg1 - var15;
        class474.field7009 = 0;
        class100.field1192 = arg5 - var14;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(Z)V")
    public static void method3259(boolean arg0) {
        if (arg0) {
            field8024 = 32;
        }
        field8025 = null;
    }
}
