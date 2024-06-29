import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class108 {

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "Ljava/lang/String;")
    public static String field1419 = " is already on your friend list.";

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "F")
    public static float field1416;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "I")
    public static int field1415;

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
    public static int field1418;

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "[I")
    public static int[] field1417;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(III)I", line = 3)
    public static final int method814(int arg0, int arg1, int arg2) {
        field1418++;
        int var3 = 1;
        while (arg0 > 1) {
            if ((arg0 & 0x1) != 0) {
                var3 = arg2 * var3;
            }
            arg2 *= arg2;
            arg0 >>= 0x1;
        }
        if (arg0 == arg1) {
            return arg2 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lir;IIB)Lka;", line = 33)
    public static final class379 method815(class185 arg0, int arg1, int arg2, byte arg3) {
        field1415++;
        if (arg3 >= -111) {
            return null;
        }
        class341 var4 = new class341(arg0.method1235(arg1, false, arg2));
        class379 var5 = new class379(arg2, var4.method2261((byte) 110), var4.method2261((byte) 123), var4.method2232(100), var4.method2232(102), var4.method2233((byte) 104) == 1, var4.method2233((byte) 104));
        int var6 = var4.method2233((byte) 104);
        for (int var7 = 0; var7 < var6; var7++) {
            var5.field5534.method1560(-106, new class14(var4.method2233((byte) 104), var4.method2239(-1076227960), var4.method2239(-1076227960), var4.method2239(-1076227960), var4.method2239(-1076227960), var4.method2239(-1076227960), var4.method2239(-1076227960), var4.method2239(-1076227960), var4.method2239(-1076227960)));
        }
        var5.method2475(false);
        return var5;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IBI)I", line = 65)
    public static final int method816(int arg0, byte arg1, int arg2) {
        field1420++;
        int var3 = -2 / ((13 - arg1) / 49);
        int var4 = arg0 >>> 31;
        return (arg0 + var4) / arg2 - var4;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V", line = 78)
    public static void method817(int arg0) {
        field1419 = null;
        field1417 = null;
        if (arg0 > -49) {
            field1421 = 12;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lc;III[Z)V", line = 91)
    public static final void method818(class308 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class370.field5469 == class266.field3950) {
            return;
        }
        int var5 = class142.field1804[arg1].method725(arg2, arg3);
        for (int var6 = 0; var6 <= arg1; var6++) {
            if (arg4 == null || arg4[var6]) {
                class193 var7 = class142.field1804[var6];
                if (var7 != null) {
                    var7.method727(arg0, arg2, var5 - var7.method725(arg2, arg3), arg3, 0, false);
                }
            }
        }
    }
}
