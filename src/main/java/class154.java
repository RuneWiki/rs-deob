import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class154 {

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
    public static int field2144 = 0;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
    public static int field2143 = 0;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
    public static int field2141 = 0;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
    public static int field2147 = 0;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "Ljava/awt/Font;")
    public static Font field2142;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILwf;IIIILuj;)V", line = 7)
    public static final void method1187(int arg0, class333 arg1, int arg2, int arg3, int arg4, int arg5, class158 arg6) {
        field2148++;
        if (arg6 == null) {
            return;
        }
        int var7 = (int) class247.field3601 + class354.field5534 & 0x7FF;
        int var8 = Math.max(arg1.field5056 / arg4, arg1.field5172 / 2) + 10;
        int var9 = arg3 * arg3 + arg5 * arg5;
        if (var9 > var8 * var8) {
            return;
        }
        int var10 = class350.field5476[var7];
        int var11 = var10 * 256 / (class318.field4690 + 256);
        int var12 = class350.field5474[var7];
        int var13 = var12 * 256 / (class318.field4690 + 256);
        int var14 = arg3 * var13 + arg5 * var11 >> 16;
        int var15 = arg5 * var13 - (arg3 * var11) >> 16;
        if (class47.field623) {
            ((class361) arg6).method2508(arg1.field5056 / 2 + arg0 + var14 - (arg6.field2244 / 2), arg1.field5172 / 2 + arg2 + -(arg6.field2255 / 2) + -var15, (class361) arg1.method2325(false, (byte) -18));
        } else {
            ((class11) arg6).method76(arg1.field5056 / 2 + var14 + arg0 - (arg6.field2244 / 2), arg1.field5172 / 2 + arg2 + -(arg6.field2255 / 2) + -var15, arg1.field5195, arg1.field5057);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZILwf;II)V", line = 42)
    public static final void method1188(boolean arg0, int arg1, class333 arg2, int arg3, int arg4) {
        if (arg4 != -4) {
            field2143 = 25;
        }
        field2145++;
        int var5 = arg2.field5172;
        if (arg2.field5211 == 0) {
            arg2.field5172 = arg2.field5173;
        } else if (arg2.field5211 == 1) {
            arg2.field5172 = arg3 - arg2.field5173;
        } else if (arg2.field5211 == 2) {
            arg2.field5172 = arg2.field5173 * arg3 >> 14;
        } else if (arg2.field5211 == 3) {
            if (arg2.field5105 == 2) {
                arg2.field5172 = (arg2.field5173 - 1) * arg2.field5193 + arg2.field5173 * 32;
            } else if (arg2.field5105 == 7) {
                arg2.field5172 = arg2.field5173 * 12 + ((arg2.field5173 - 1) * arg2.field5193);
            }
        }
        int var6 = arg2.field5056;
        if (arg2.field5072 == 0) {
            arg2.field5056 = arg2.field5127;
        } else if (arg2.field5072 == 1) {
            arg2.field5056 = arg1 - arg2.field5127;
        } else if (arg2.field5072 == 2) {
            arg2.field5056 = arg2.field5127 * arg1 >> 14;
        } else if (arg2.field5072 == 3) {
            if (arg2.field5105 == 2) {
                arg2.field5056 = (arg2.field5127 - 1) * arg2.field5157 + arg2.field5127 * 32;
            } else if (arg2.field5105 == 7) {
                arg2.field5056 = arg2.field5127 * 115 + ((arg2.field5127 - 1) * arg2.field5157);
            }
        }
        if (arg2.field5072 == 4) {
            arg2.field5056 = arg2.field5172 * arg2.field5092 / arg2.field5202;
        }
        if (arg2.field5211 == 4) {
            arg2.field5172 = arg2.field5202 * arg2.field5056 / arg2.field5092;
        }
        if (class40.field503 && (client.method891(arg2).field1981 != 0 || arg2.field5105 == 0)) {
            if (arg2.field5172 < 5 && arg2.field5056 < 5) {
                arg2.field5172 = 5;
                arg2.field5056 = 5;
            } else {
                if (arg2.field5172 <= 0) {
                    arg2.field5172 = 5;
                }
                if (arg2.field5056 <= 0) {
                    arg2.field5056 = 5;
                }
            }
        }
        if (arg2.field5084 == 1337) {
            class344.field5351 = arg2;
        }
        if (arg0 && arg2.field5206 != null && (arg2.field5056 != var6 || arg2.field5172 != var5)) {
            class135 var7 = new class135();
            var7.field1836 = arg2.field5206;
            var7.field1831 = arg2;
            class276.field3956.method415((byte) -117, var7);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(III)Ldm;", line = 147)
    public static final class24 method1189(int arg0, int arg1, int arg2) {
        class119 var3 = class345.field5367[arg0][arg1][arg2];
        return var3 == null || var3.field1577 == null ? null : var3.field1577;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V", line = 165)
    public static void method1190(int arg0) {
        field2142 = null;
        if (arg0 != 5) {
            method1187(112, (class333) null, -82, 29, 46, -44, (class158) null);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILp;BI)V", line = 175)
    public static final void method1191(int arg0, class169 arg1, byte arg2, int arg3) {
        field2146++;
        if (arg2 != -118) {
            field2143 = 103;
        }
        if (arg1.field4899 == arg0 && arg0 != -1) {
            class314 var4 = class207.method1516(arg0, 126);
            int var5 = var4.field4626;
            if (var5 == 1) {
                arg1.field4850 = 0;
                arg1.field4885 = arg3;
                arg1.field4906 = 1;
                arg1.field4891 = 0;
                arg1.field4940 = 0;
                class296.method2025(var4, arg1.field4893, arg1.field4855, arg1.field4850, false, false);
            }
            if (var5 == 2) {
                arg1.field4891 = 0;
            }
        } else if (arg0 == -1 || arg1.field4899 == -1 || class207.method1516(arg0, 122).field4638 >= class207.method1516(arg1.field4899, 127).field4638) {
            arg1.field4906 = 1;
            arg1.field4925 = arg1.field4845;
            arg1.field4891 = 0;
            arg1.field4850 = 0;
            arg1.field4885 = arg3;
            arg1.field4899 = arg0;
            arg1.field4940 = 0;
            if (arg1.field4899 != -1) {
                class296.method2025(class207.method1516(arg1.field4899, 124), arg1.field4893, arg1.field4855, arg1.field4850, false, false);
            }
        }
    }
}
