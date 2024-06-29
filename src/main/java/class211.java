import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class211 {

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "[[B")
    public static byte[][] field3457 = new byte[50][];

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "I")
    public static int field3454;

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "I")
    public static int field3455;

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "I")
    public static int field3460;

    @OriginalMember(owner = "client!ti", name = "i", descriptor = "I")
    public static int field3462;

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "Lun;")
    public static class121 field3459;

    @OriginalMember(owner = "client!ti", name = "h", descriptor = "Log;")
    public static class157 field3461;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)V", line = 7)
    public static void method1522(byte arg0) {
        field3461 = null;
        field3459 = null;
        field3457 = (byte[][]) null;
        if (arg0 != 126) {
            field3461 = (class157) null;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lak;I)V", line = 19)
    public static final void method1523(class172 arg0, int arg1) {
        field3454++;
        class182.field3025 = arg0;
        if (arg1 < 55) {
            method1525((byte) 2, 102L);
        }
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(B)Lem;", line = 43)
    public static final class260 method1524(byte arg0) {
        if (arg0 < 87) {
            method1525((byte) -127, -23L);
        }
        class260 var1;
        if (class232.field3690) {
            var1 = new class312(class303.field4757, class243.field3832, class270.field4364[0], class51.field732[0], class102.field1489[0], class184.field3046[0], class278.field4481[0], class205.field3370);
        } else {
            var1 = new class326(class303.field4757, class243.field3832, class270.field4364[0], class51.field732[0], class102.field1489[0], class184.field3046[0], class278.field4481[0], class205.field3370);
        }
        class106.method727(true);
        field3460++;
        return var1;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(BJ)V", line = 61)
    public static final void method1525(byte arg0, long arg1) {
        field3458++;
        if (class31.field423 == 1 || class31.field423 == 5) {
            class281.method2035(0, arg1);
        } else if (class31.field423 == 2) {
            class65.method438(-92);
        } else {
            class173.method1303(-16980);
        }
        if (!class196.field3204) {
            class113.field1727[0] = 1003;
            class185.field3070 = 1;
            class212.field3474[0] = class222.field3560;
            if (class194.field3168 != 0) {
                class222.field3554 = class7.field100;
                class200.field3248 = class67.field960;
            } else if (class160.field2642 == 0) {
                class222.field3554 = class233.field3738;
                class200.field3248 = class70.field995;
            } else {
                class200.field3248 = class105.field1542;
                class222.field3554 = class198.field3221;
            }
            class168.field2777[0] = class81.field1132;
            class157.field2458[0] = "";
        }
        if (class147.field2287 != -1) {
            class76.method519(class147.field2287, arg0 - 23209);
        }
        for (int var3 = 0; var3 < class20.field291; var3++) {
            if (class174.field2884[var3]) {
                class127.field1991[var3] = true;
            }
            class45.field638[var3] = class174.field2884[var3];
            class174.field2884[var3] = false;
        }
        class331.field5161 = -1;
        if (class232.field3690) {
            class185.field3067 = true;
        }
        class174.field2878 = null;
        class111.field1653 = -1;
        field3461 = null;
        class42.field539 = class240.field3818;
        if (class147.field2287 != -1) {
            class20.field291 = 0;
            class200.method1466(true);
        }
        if (class232.field3690) {
            class75.method508();
        } else {
            class59.method391();
        }
        class215.method1547(-52);
        if (class196.field3204) {
            if (class52.field737) {
                class94.method628(17066);
            } else {
                class197.method1453(true);
            }
        } else if (class174.field2878 != null) {
            class93.method621(class61.field868, class174.field2878, (byte) 108, class205.field3372);
        } else if (class331.field5161 != -1) {
            class93.method621(class111.field1653, (class157) null, (byte) 111, class331.field5161);
        }
        int var4 = class196.field3204 ? -1 : class315.method2212(true);
        if (var4 == -1) {
            var4 = class291.field4663;
        }
        class258.method1851(-1, var4);
        if (class147.field2289 == 1) {
            class147.field2289 = 2;
        }
        if (class129.field2015 == 1) {
            class129.field2015 = 2;
        }
        if (arg0 != 68) {
            method1523((class172) null, 94);
        }
        if (class130.field2055 == 3) {
            for (int var5 = 0; var5 < class20.field291; var5++) {
                if (class45.field638[var5]) {
                    if (class232.field3690) {
                        class75.method510(class81.field1146[var5], class213.field3481[var5], class197.field3215[var5], class323.field5013[var5], 16711935, 128);
                    } else {
                        class59.method394(class81.field1146[var5], class213.field3481[var5], class197.field3215[var5], class323.field5013[var5], 16711935, 128);
                    }
                } else if (class127.field1991[var5]) {
                    if (class232.field3690) {
                        class75.method510(class81.field1146[var5], class213.field3481[var5], class197.field3215[var5], class323.field5013[var5], 16711680, 128);
                    } else {
                        class59.method394(class81.field1146[var5], class213.field3481[var5], class197.field3215[var5], class323.field5013[var5], 16711680, 128);
                    }
                }
            }
        }
        class319.method2244(class49.field698, class36.field477, -43, class191.field3129.field4255, class191.field3129.field4264);
        class36.field477 = 0;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V", line = 219)
    public static final void method1526(int arg0) {
        if (arg0 >= -71) {
            field3461 = (class157) null;
        }
        field3462++;
        class229.method1626();
        for (int var1 = 0; var1 < 4; var1++) {
            class126.field1964[var1].method737(-127);
        }
        System.gc();
    }
}
