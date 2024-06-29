import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class27 extends class252 {

    @OriginalMember(owner = "client!lj", name = "C", descriptor = "Lcf;")
    public class98 field487;

    @OriginalMember(owner = "client!lj", name = "A", descriptor = "I")
    public static int field486 = 0;

    @OriginalMember(owner = "client!lj", name = "w", descriptor = "I")
    public static int field482 = 0;

    @OriginalMember(owner = "client!lj", name = "v", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!lj", name = "x", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!lj", name = "y", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!lj", name = "z", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!lj", name = "D", descriptor = "I")
    public static int field488;

    @OriginalMember(owner = "client!lj", name = "u", descriptor = "[[[B")
    public static byte[][][] field480;

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "(I)V")
    public static void method207(int arg0) {
        field480 = null;
        if (arg0 != 2) {
            field486 = -22;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILfj;)V")
    public static final void method208(int arg0, class274 arg1) {
        field485++;
        if ((arg1.field4441.length - arg1.field4458) < 1) {
            return;
        }
        int var2 = arg1.method1849(255);
        if (var2 < 0 || var2 > 11) {
            return;
        }
        byte var3;
        if (var2 == 11) {
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
        if (arg1.field4441.length - arg1.field4458 < var3) {
            return;
        }
        class288.field4664 = arg1.method1849(255);
        if (class288.field4664 < 1) {
            class288.field4664 = 1;
        } else if (class288.field4664 > 4) {
            class288.field4664 = 4;
        }
        class191.method1339((byte) 40, arg1.method1849(255) == 1);
        class33.field545 = arg1.method1849(255) == 1;
        class296.field4835 = arg1.method1849(255) == 1;
        class236.field3701 = arg1.method1849(255) == 1;
        if (arg0 >= -28) {
            field482 = 83;
        }
        class101.field1586 = arg1.method1849(255) == 1;
        class117.field1804 = arg1.method1849(255) == 1;
        class4.field95 = arg1.method1849(255) == 1;
        class277.field4524 = arg1.method1849(255) == 1;
        class240.field3761 = arg1.method1849(255);
        if (class240.field3761 > 2) {
            class240.field3761 = 2;
        }
        if (var2 >= 2) {
            class244.field3867 = arg1.method1849(255) == 1;
        } else {
            class244.field3867 = arg1.method1849(255) == 1;
            arg1.method1849(255);
        }
        class131.field2101 = arg1.method1849(255) == 1;
        class143.field2314 = arg1.method1849(255) == 1;
        class46.field689 = arg1.method1849(255);
        if (class46.field689 > 2) {
            class46.field689 = 2;
        }
        class275.field4503 = class46.field689;
        class127.field2032 = arg1.method1849(255) == 1;
        class129.field2066 = arg1.method1849(255);
        if (class129.field2066 > 127) {
            class129.field2066 = 127;
        }
        class44.field654 = arg1.method1849(255);
        class66.field1067 = arg1.method1849(255);
        if (class66.field1067 > 127) {
            class66.field1067 = 127;
        }
        if (var2 >= 1) {
            class220.field3456 = arg1.method1837(252);
            class8.field173 = arg1.method1837(252);
        }
        if (var2 >= 3 && var2 < 6) {
            arg1.method1849(255);
        }
        if (var2 >= 4) {
            int var4 = arg1.method1849(255);
            if (class9.field197 < 96) {
                var4 = 0;
            }
            class181.method1281(var4);
        }
        if (var2 >= 5) {
            class57.field827 = arg1.method1833((byte) -104);
        }
        if (var2 >= 6) {
            class147.field2352 = arg1.method1849(255);
        }
        if (var2 >= 7) {
            class156.field2485 = arg1.method1849(255) == 1;
        }
        if (var2 >= 8) {
            class184.field3053 = arg1.method1849(255) == 1;
        }
        if (var2 >= 9) {
            class265.field4313 = arg1.method1849(255);
        }
        if (var2 >= 10) {
            class91.field1432 = arg1.method1849(255) != 0;
        }
        if (var2 >= 11) {
            class186.field3077 = arg1.method1849(255) != 0;
        }
    }

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "(I)Z")
    public static final boolean method209(int arg0) {
        field484++;
        if (arg0 <= 110) {
            field486 = -39;
        }
        try {
            return class239.method1630((byte) 117);
        } catch (IOException var4) {
            class240.method1631((byte) -67);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + class88.field1369 + "," + class251.field4126 + "," + class119.field1892 + " - " + class271.field4366 + "," + (class217.field3408.field965[0] + class75.field1211) + "," + (class217.field3408.field956[0] + class145.field2327) + " - ";
            for (int var3 = 0; class271.field4366 > var3 && var3 < 50; var3++) {
                var2 = var2 + class229.field3584.field4441[var3] + ",";
            }
            class284.method1930(98, var2, var5);
            class116.method801(104);
            return true;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lgi;III)[Lrk;")
    public static final class292[] method210(class164 arg0, int arg1, int arg2, int arg3) {
        if (arg1 > -79) {
            method211(-24);
        }
        field483++;
        return class284.method1927(arg2, (byte) -78, arg3, arg0) ? class306.method2082(0) : null;
    }

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "(I)V")
    public static final void method211(int arg0) {
        class306.field4983 = 0;
        field488++;
        int var1 = (class217.field3408.field994 >> 7) + class75.field1211;
        int var2 = (class217.field3408.field929 >> 7) + class145.field2327;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class306.field4983 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class306.field4983 = 1;
        }
        if (class306.field4983 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class306.field4983 = 0;
        }
        if (arg0 != -451202265) {
            field480 = null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(Lcf;)V")
    public class27(class98 arg0) {
        this.field487 = arg0;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ZII)I")
    public static final int method212(boolean arg0, int arg1, int arg2) {
        if (arg2 > arg1) {
            int var3 = arg1;
            arg1 = arg2;
            arg2 = var3;
        }
        field481++;
        if (arg0) {
            return 10;
        }
        while (arg2 != 0) {
            int var4 = arg1 % arg2;
            arg1 = arg2;
            arg2 = var4;
        }
        return arg1;
    }
}
