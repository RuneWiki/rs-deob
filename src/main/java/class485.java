import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class485 {

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "I")
    public int field6820 = -1;

    @OriginalMember(owner = "client!pn", name = "i", descriptor = "I")
    public static int field6827 = 100;

    @OriginalMember(owner = "client!pn", name = "d", descriptor = "I")
    public static int field6822;

    @OriginalMember(owner = "client!pn", name = "f", descriptor = "I")
    public static int field6824;

    @OriginalMember(owner = "client!pn", name = "h", descriptor = "I")
    public static int field6826;

    @OriginalMember(owner = "client!pn", name = "j", descriptor = "I")
    public static int field6828;

    @OriginalMember(owner = "client!pn", name = "k", descriptor = "I")
    public static int field6829;

    @OriginalMember(owner = "client!pn", name = "l", descriptor = "I")
    public static int field6830;

    @OriginalMember(owner = "client!pn", name = "e", descriptor = "Lb;")
    public static class201 field6823;

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "Lhd;")
    public class482 field6821;

    @OriginalMember(owner = "client!pn", name = "g", descriptor = "[I")
    public int[] field6825;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "[Ljava/lang/String;")
    public String[] field6819;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(I)V")
    public static void method2831(int arg0) {
        field6823 = null;
        int var1 = 89 % ((43 - arg0) / 32);
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "([Ltr;I)V")
    public static final void method2832(class176[] arg0, int arg1) {
        field6828++;
        class255.field3729 = arg0.length;
        class11.field120 = new class176[class255.field3729 + 10];
        class466.field6525 = new int[class255.field3729 + 10];
        class415.method2450(arg0, 0, class11.field120, 0, class255.field3729);
        for (int var2 = 0; var2 < class255.field3729; var2++) {
            class466.field6525[var2] = class11.field120[var2].method524();
        }
        for (int var3 = class255.field3729; var3 < class11.field120.length; var3++) {
            class466.field6525[var3] = 12;
        }
        if (arg1 <= 9) {
            method2834(-74, -57, -101, -16, 1, 102, -3);
        }
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(I)V")
    public static final void method2833(int arg0) {
        field6824++;
        class225[] var1 = class171.field2487;
        synchronized (class171.field2487) {
            int var2 = 0;
            while (true) {
                if (var2 >= class171.field2487.length) {
                    break;
                }
                class171.field2487[var2] = new class225();
                class200.field2920[var2] = 0;
                var2++;
            }
        }
        if (arg0 != 5) {
            method2837(57, '\u0011');
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2834(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class9 var7 = new class9();
        var7.field89 = arg1 >> class216.field3242;
        var7.field93 = arg2 >> class216.field3242;
        var7.field87 = arg3 >> class216.field3242;
        var7.field95 = arg4 >> class216.field3242;
        var7.field96 = arg0;
        var7.field85 = arg1;
        var7.field102 = arg2;
        var7.field92 = arg3;
        var7.field91 = arg4;
        var7.field97 = arg5;
        var7.field88 = arg6;
        class451.field6241[class23.field302++] = var7;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IZI)Lee;")
    public static final class441 method2835(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            return null;
        }
        field6826++;
        class441 var3 = new class441();
        var3.field6099 = -1;
        var3.field6104 = arg0 + 5 + 1;
        var3.field6109 = arg2 + 1 + 5;
        var3.field6101 = -1;
        var3.field6121 = new int[var3.field6109][var3.field6104];
        var3.method2584(-124);
        return var3;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IZLbj;)V")
    public static final void method2836(int arg0, boolean arg1, class146 arg2) {
        field6830++;
        int var3 = -1;
        int var4 = 0;
        if (arg2.field2111 > class353.field5090) {
            class259.method1611(arg2, 111);
        } else if (class353.field5090 <= arg2.field2148) {
            class351.method2195(arg2, (byte) -24);
        } else {
            class411.method2428((byte) 32, arg2, false);
            var3 = class90.field1124;
            var4 = class37.field476;
        }
        if (arg2.field4331 < 128 || arg2.field4317 < 128 || class58.field758 * 128 - 128 <= arg2.field4331 || (class287.field4181 * 128 - 128) <= arg2.field4317) {
            var4 = 0;
            var3 = -1;
            arg2.field2080 = -1;
            arg2.field2111 = 0;
            arg2.field2148 = 0;
            arg2.field2147 = -1;
            arg2.field4331 = arg2.field2163[0] * 128 + arg2.method918(false) * 64;
            arg2.field4317 = arg2.field2159[0] * 128 + arg2.method918(!arg1) * 64;
            arg2.method927(0);
        }
        if (class492.field6935 == arg2 && (arg2.field4331 < 1536 || arg2.field4317 < 1536 || (class58.field758 * 128 - 1536) <= arg2.field4331 || (class287.field4181 * 128 - 1536) <= arg2.field4317)) {
            arg2.field2080 = -1;
            var4 = 0;
            arg2.field2147 = -1;
            arg2.field2148 = 0;
            var3 = -1;
            arg2.field2111 = 0;
            arg2.field4331 = arg2.field2163[0] * 128 + (arg2.method918(false) * 64);
            arg2.field4317 = arg2.field2159[0] * 128 + arg2.method918(false) * 64;
            arg2.method927(0);
        }
        int var5 = class171.method1059(-118, arg2);
        class43.method286(var4, arg1, var5, arg2, var3);
        class334.method2110(arg2, -68);
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IC)Z")
    public static final boolean method2837(int arg0, char arg1) {
        field6822++;
        if (arg0 < 42) {
            method2835(52, true, -68);
        }
        return arg1 == ' ' || arg1 == ' ' || arg1 == '_' || arg1 == '-';
    }
}
