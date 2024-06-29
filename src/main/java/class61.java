import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class61 {

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "I")
    public static int field893;

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "I")
    public static int field895;

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "I")
    public static int field896;

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "[I")
    public static int[] field892;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)V", line = 4)
    public static final void method492(byte arg0) {
        class83.method659(class144.field2326, (byte) -101);
        field893++;
        if (arg0 > -84) {
            return;
        }
        int var1 = (class137.field2239 >> 10) + (class133.field2118 >> 3);
        byte var2 = 0;
        int var3 = (class152.field2498 >> 10) + (class117.field1902 >> 3);
        byte var4 = 8;
        byte var5 = 8;
        byte var6 = 18;
        class245.field3658 = new int[var6][4];
        class274.field4293 = new int[var6];
        class115.field1862 = new byte[var6][];
        class15.field318 = new byte[var6][];
        class14.field307 = new byte[var6][];
        class338.field5218 = new int[var6];
        class338.field5222 = new byte[var6][];
        class67.field1017 = new int[var6];
        class172.field2756 = new int[var6];
        class180.field2867 = new int[var6];
        class126.field2020 = new byte[var6][];
        class305.field4853 = new int[var6];
        int var7 = 0;
        for (int var8 = (var3 - 6) / 8; var8 <= (var3 + 6) / 8; var8++) {
            for (int var9 = (var1 - 6) / 8; var9 <= ((var1 + 6) / 8); var9++) {
                int var10 = (var8 << 8) + var9;
                class338.field5218[var7] = var10;
                class305.field4853[var7] = class200.field3062.method958(113, "m" + var8 + "_" + var9);
                class274.field4293[var7] = class200.field3062.method958(123, "l" + var8 + "_" + var9);
                class67.field1017[var7] = class200.field3062.method958(108, "n" + var8 + "_" + var9);
                class172.field2756[var7] = class200.field3062.method958(119, "um" + var8 + "_" + var9);
                class180.field2867[var7] = class200.field3062.method958(115, "ul" + var8 + "_" + var9);
                if (class67.field1017[var7] == -1) {
                    class305.field4853[var7] = -1;
                    class274.field4293[var7] = -1;
                    class172.field2756[var7] = -1;
                    class180.field2867[var7] = -1;
                }
                var7++;
            }
        }
        for (int var11 = var7; var11 < class67.field1017.length; var11++) {
            class67.field1017[var11] = -1;
            class305.field4853[var11] = -1;
            class274.field4293[var11] = -1;
            class172.field2756[var11] = -1;
            class180.field2867[var11] = -1;
        }
        class154.method1150(var2, false, true, var3, (byte) 116, var1, var4, var5);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(BLaj;I)Lbi;", line = 89)
    public static final class91 method493(byte arg0, class1 arg1, int arg2) {
        field896++;
        class91 var3 = new class91(arg2, arg1.method53(32), arg1.method53(arg0 + 74), arg1.method33(false), arg1.method33(false), arg1.method15((byte) 112) == 1, arg1.method15((byte) 62));
        if (arg0 != -42) {
            method493((byte) 23, (class1) null, -114);
        }
        int var4 = arg1.method15((byte) 68);
        for (int var5 = 0; var5 < var4; var5++) {
            var3.field1474.method277(new class147(arg1.method15((byte) -97), arg1.method15((byte) -12), arg1.method56(19612), arg1.method56(19612), arg1.method56(arg0 ^ 0xFFFFB34A), arg1.method56(arg0 + 19654), arg1.method56(19612), arg1.method56(19612), arg1.method56(19612), arg1.method56(19612)), (byte) -119);
        }
        var3.method728(arg0 ^ 0xFFFFD1CD);
        return var3;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V", line = 114)
    public static void method494(int arg0) {
        field892 = null;
        if (arg0 != 6) {
            field892 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IB)V", line = 130)
    public static final void method495(int arg0, byte arg1) {
        field895++;
        class170 var2 = class221.method1613(9, arg0, -8410);
        var2.method1267(41);
        if (arg1 != -125) {
            field892 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIIII)V", line = 149)
    public static final void method496(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field898++;
        int var6 = arg5;
        if (arg4 == -1) {
            while (var6 <= arg2) {
                class323.method2273(arg0, arg3, class221.field3443[var6], arg1, arg4 ^ 0xFFFFFF80);
                var6++;
            }
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(ZIIIIII)V", line = 168)
    public static final void method497(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class20.field367 = arg3;
        class106.field1734 = arg1;
        class64.field948 = arg2;
        class309.field4889 = arg6;
        if (arg5 <= 55) {
            return;
        }
        class154.field2510 = arg4;
        if (arg0 && class64.field948 >= 100) {
            class152.field2498 = class20.field367 * 128 + 64;
            class137.field2239 = class154.field2510 * 128 + 64;
            class332.field5180 = class170.method1265(class152.field2498, class137.field2239, class75.field1153, 1) - class309.field4889;
        }
        field894++;
        class73.field1112 = 2;
    }
}
