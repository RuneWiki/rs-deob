import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class147 {

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
    public static int field2294 = 0;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "[Z")
    public static boolean[] field2295 = new boolean[200];

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "[Lna;")
    public static class26[] field2302 = new class26[1000];

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "Lna;")
    public static class26 field2305 = class69.method505("Objet d(Wabonn-Bs", (byte) -119);

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "Lih;")
    public static class32 field2306 = new class32();

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "I")
    public static int field2299;

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
    public static int field2300;

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
    public static int field2301;

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "I")
    public static int field2307;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "J")
    public long field2293;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "Lab;")
    public class147 field2296;

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "Lab;")
    public class147 field2304;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)Z", line = 9)
    public final boolean method1002(int arg0) {
        if (arg0 == 0) {
            field2297++;
            return this.field2304 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V", line = 23)
    public static void method1003(byte arg0) {
        field2305 = null;
        field2302 = null;
        if (arg0 != 30) {
            method1004((class26) null, 89);
        }
        field2306 = null;
        field2295 = null;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lna;I)V", line = 55)
    public static final void method1004(class26 arg0, int arg1) {
        if (arg1 != -801) {
            field2305 = (class26) null;
        }
        int var2 = class24.method150(0, arg0);
        field2298++;
        if (var2 != -1) {
            class8.method51((byte) 86, class298.field5133.field173[var2], class298.field5133.field160[var2]);
        }
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(B)V", line = 77)
    public static final void method1005(byte arg0) {
        int var1 = -122 % ((arg0 + 63) / 48);
        field2299++;
        class157.field2447.method1986((byte) -99);
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V", line = 100)
    public final void method1006(int arg0) {
        field2300++;
        if (this.field2304 == null) {
            return;
        }
        this.field2304.field2296 = this.field2296;
        this.field2296.field2304 = this.field2304;
        if (arg0 != -1024) {
            this.method1006(-35);
        }
        this.field2304 = null;
        this.field2296 = null;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)V", line = 132)
    public static final void method1007(int arg0, int arg1) {
        if (arg0 >= -20) {
            method1003((byte) 44);
        }
        field2307++;
        if (arg1 == 0) {
            return;
        }
        if (arg1 == 1) {
            class277.method1961(false);
        } else if (arg1 == 2) {
            class92.method709((byte) 121);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(B)[Lod;", line = 155)
    public static final class25[] method1008(byte arg0) {
        if (arg0 != 28) {
            field2295 = (boolean[]) null;
        }
        if (class95.field1553 == null) {
            class25[] var1 = class103.method743(arg0 ^ 0x16, class45.field712);
            class25[] var2 = new class25[var1.length];
            int var3 = 0;
            label55: for (int var4 = 0; var4 < var1.length; var4++) {
                class25 var5 = var1[var4];
                if ((var5.field370 <= 0 || var5.field370 >= 24) && var5.field367 >= 800 && var5.field369 >= 600) {
                    for (int var6 = 0; var6 < var3; var6++) {
                        class25 var7 = var2[var6];
                        if (var5.field367 == var7.field367 && var5.field369 == var7.field369) {
                            if (var5.field370 > var7.field370) {
                                var2[var6] = var5;
                            }
                            continue label55;
                        }
                    }
                    var2[var3] = var5;
                    var3++;
                }
            }
            class95.field1553 = new class25[var3];
            class75.method541(var2, 0, class95.field1553, 0, var3);
            int[] var8 = new int[class95.field1553.length];
            for (int var9 = 0; var9 < class95.field1553.length; var9++) {
                class25 var10 = class95.field1553[var9];
                var8[var9] = var10.field369 * var10.field367;
            }
            class317.method2203(21, var8, class95.field1553);
        }
        field2303++;
        return class95.field1553;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ZLve;Lve;Lve;Lve;)V", line = 232)
    public static final void method1009(boolean arg0, class266 arg1, class266 arg2, class266 arg3, class266 arg4) {
        class137.field2098 = arg2;
        class314.field5380 = arg1;
        class240.field3884 = arg3;
        field2301++;
        class298.field5139 = arg4;
        if (!arg0) {
            method1007(-98, 11);
        }
        class86.field1416 = new class297[class240.field3884.method1877(0)][];
        class259.field4226 = new boolean[class240.field3884.method1877(0)];
    }
}
