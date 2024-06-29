import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class254 {

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "Lmb;")
    public static class96 field4387 = class243.method1708("Ausw-=hlen", (byte) 119);

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "Z")
    public static boolean field4390 = false;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
    public static int field4389 = 0;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "[[S")
    public static short[][] field4386 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
    public static int field4384;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
    public static int field4388;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "I")
    public static int field4391;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "Lhk;")
    public static class33 field4385;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIILw;II)V")
    public static final void method1765(int arg0, int arg1, int arg2, int arg3, int arg4, class107 arg5, int arg6, int arg7) {
        field4384++;
        if (class121.field2238) {
            class60.field1030 = 32;
        } else {
            class60.field1030 = 0;
        }
        class121.field2238 = false;
        if (class40.field692 != 0) {
            if (arg6 >= arg4 && (arg4 + 16) > arg6 && arg0 >= arg2 && arg0 < (arg2 + 16)) {
                arg5.field1934 -= 4;
                class53.method403(-112, arg5);
            } else if (arg6 >= arg4 && (arg4 + 16) > arg6 && arg0 >= (arg2 + arg7 - 16) && arg2 + arg7 > arg0) {
                arg5.field1934 += 4;
                class53.method403(-111, arg5);
            } else if (arg6 >= arg4 - class60.field1030 && arg6 < class60.field1030 + arg4 + 16 && arg2 + 16 <= arg0 && (arg2 + arg7 - 16) > arg0) {
                int var8 = (arg7 - 32) * arg7 / arg1;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg7 - var8 - 32;
                int var10 = arg0 - arg2 - (var8 / 2) - 16;
                arg5.field1934 = (arg1 - arg7) * var10 / var9;
                class53.method403(-103, arg5);
                class121.field2238 = true;
            }
        }
        if (arg3 >= -89 || class208.field3587 == 0) {
            return;
        }
        int var11 = arg5.field1856;
        if (arg4 - var11 <= arg6 && arg0 >= arg2 && arg6 < arg4 + 16 && arg0 <= arg2 + arg7) {
            arg5.field1934 += class208.field3587 * 45;
            class53.method403(-99, arg5);
            return;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V")
    public static void method1766(byte arg0) {
        if (arg0 == -88) {
            field4387 = null;
            field4385 = null;
            field4386 = null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "([Lsi;BII[BIIIZII)V")
    public static final void method1767(class207[] arg0, byte arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10) {
        if (!arg8) {
            for (int var11 = 0; var11 < 8; var11++) {
                for (int var12 = 0; var12 < 8; var12++) {
                    if (arg6 + var11 > 0 && arg6 + var11 < 103 && arg7 + var12 > 0 && arg7 + var12 < 103) {
                        arg0[arg2].field3566[arg6 + var11][arg7 + var12] = class130.method985(arg0[arg2].field3566[arg6 + var11][arg7 + var12], -16777217);
                    }
                }
            }
        }
        if (arg1 != 44) {
            return;
        }
        field4391++;
        byte var13;
        if (arg8) {
            var13 = 1;
        } else {
            var13 = 4;
        }
        class239 var14 = new class239(arg4);
        for (int var15 = 0; var15 < var13; var15++) {
            for (int var16 = 0; var16 < 64; var16++) {
                for (int var17 = 0; var17 < 64; var17++) {
                    if (arg10 == var15 && var16 >= arg3 && arg3 + 8 > var16 && var17 >= arg5 && var17 < (arg5 + 8)) {
                        class251.method1749(arg9, class20.method146(var17 & 0x7, var16 & 0x7, arg9, (byte) -76) + arg7, 0, arg2, arg6 + class268.method1840(var16 & 0x7, false, arg9, var17 & 0x7), arg8, -69, var14, 0);
                    } else {
                        class251.method1749(0, -1, 0, 0, -1, arg8, -80, var14, 0);
                    }
                }
            }
        }
    }
}
