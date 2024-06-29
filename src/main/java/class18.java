import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class18 {

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "I")
    public int field243 = 0;

    @OriginalMember(owner = "client!rl", name = "j", descriptor = "Lnk;")
    public static class2 field252 = new class2();

    @OriginalMember(owner = "client!rl", name = "l", descriptor = "I")
    public static int field254 = 0;

    @OriginalMember(owner = "client!rl", name = "m", descriptor = "I")
    public static int field255 = 0;

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "I")
    public static int field244;

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "I")
    public static int field245;

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "I")
    public static int field247;

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "I")
    public static int field248;

    @OriginalMember(owner = "client!rl", name = "g", descriptor = "I")
    public static int field249;

    @OriginalMember(owner = "client!rl", name = "h", descriptor = "I")
    public static int field250;

    @OriginalMember(owner = "client!rl", name = "k", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "client!rl", name = "i", descriptor = "[I")
    public static int[] field251;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lgn;I)V", line = 7)
    public final void method140(class303 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2043((byte) -108);
            if (var3 == 0) {
                if (arg1 != 0) {
                    method141(55);
                }
                field250++;
                return;
            }
            this.method144(arg0, arg1 - 21931, var3);
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)V", line = 26)
    public static void method141(int arg0) {
        field252 = null;
        if (arg0 == 906) {
            field251 = null;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIIBI)V", line = 45)
    public static final void method142(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field244++;
        int var6 = class3.method20(class323.field5030, arg1, class88.field1324, -27521);
        int var7 = class3.method20(class323.field5030, arg2, class88.field1324, -27521);
        int var8 = class3.method20(class256.field3995, arg3, class118.field1834, -27521);
        int var9 = class3.method20(class256.field3995, arg5, class118.field1834, -27521);
        if (arg4 >= 125) {
            for (int var10 = var6; var10 <= var7; var10++) {
                class253.method1704(var8, var9, arg0, class175.field2675[var10], 7);
            }
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(B)I", line = 71)
    public static final int method143(byte arg0) {
        field248++;
        if ((double) class246.field3863 == 3.0D) {
            return 37;
        } else if ((double) class246.field3863 == 4.0D) {
            return 50;
        } else if ((double) class246.field3863 == 6.0D) {
            return 75;
        } else if ((double) class246.field3863 == 8.0D) {
            return 100;
        } else {
            int var1 = 110 % ((arg0 - 28) / 34);
            return 200;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lgn;II)V", line = 97)
    private final void method144(class303 arg0, int arg1, int arg2) {
        if (arg2 == 5) {
            this.field243 = arg0.method1994(false);
        }
        if (arg1 != -21931) {
            this.field243 = 66;
        }
        field245++;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(JB)V", line = 114)
    public static final void method145(long arg0, byte arg1) {
        field246++;
        if (arg0 == 0L) {
            return;
        }
        if (!(class116.field1795 < 100 || class84.field1275) || class116.field1795 >= 200) {
            class343.method2390(class330.field5114, 0, false, "");
            return;
        }
        String var3 = class305.method2073(false, arg0);
        for (int var4 = 0; var4 < class116.field1795; var4++) {
            if (class81.field1205[var4] == arg0) {
                class343.method2390(var3 + class190.field2892, 0, false, "");
                return;
            }
        }
        int var5 = 0;
        if (arg1 >= -68) {
            return;
        }
        while (var5 < class190.field2891) {
            if (class115.field1792[var5] == arg0) {
                class343.method2390(class307.field4835 + var3 + class332.field5137, 0, false, "");
                return;
            }
            var5++;
        }
        if (var3.equals(class79.field1173.field1218)) {
            class343.method2390(class309.field4859, 0, false, "");
            return;
        }
        class6.field66++;
        class120.field1851[class116.field1795] = var3;
        class81.field1205[class116.field1795] = arg0;
        class95.field1455[class116.field1795] = 0;
        class30.field373[class116.field1795] = "";
        class229.field3673[class116.field1795] = 0;
        class291.field4454[class116.field1795] = false;
        class315.field4968 = class71.field1068;
        class116.field1795++;
        class265.field4095.method2064(255, 234);
        class265.field4095.method2023(arg0, 101);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(ZIIII)V", line = 188)
    public static final void method146(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        class75 var5 = class204.method1371(8, 7, arg3);
        if (!arg0) {
            field255 = -24;
        }
        field247++;
        var5.method524((byte) 57);
        var5.field1122 = arg4;
        var5.field1124 = arg1;
        var5.field1117 = arg2;
    }
}
