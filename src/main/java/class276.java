import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class276 {

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "Leg;")
    private static class37 field4895 = class174.method1167("Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3", -62);

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "Lpe;")
    public static class237 field4891 = null;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "Leg;")
    public static class37 field4894 = field4895;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "I")
    public static int field4892;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
    public static int field4893;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "I")
    public static int field4898;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "Ljl;")
    public static class101 field4896;

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "Llh;")
    public static class197 field4897;

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "Z")
    public static boolean field4899;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V")
    public static void method1859(byte arg0) {
        field4897 = null;
        field4895 = null;
        field4896 = null;
        field4891 = null;
        field4894 = null;
        int var1 = -50 / ((arg0 - 82) / 40);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
    public static final Class method1860(String arg0, int arg1) throws ClassNotFoundException {
        if (arg1 != 29609) {
            return null;
        }
        field4892++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg0.equals("F")) {
            return Float.TYPE;
        } else if (arg0.equals("D")) {
            return Double.TYPE;
        } else if (arg0.equals("C")) {
            return Character.TYPE;
        } else {
            return Class.forName(arg0);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lpi;IIII)V")
    public static final void method1861(class188 arg0, int arg1, int arg2, int arg3, int arg4) {
        field4898++;
        if (class82.field1285 == arg0 || class159.field2661 >= 400) {
            return;
        }
        class37 var5;
        if (arg0.field3205 == 0) {
            boolean var6 = true;
            if (class82.field1285.field3228 != -1 && arg0.field3228 != -1) {
                int var7 = arg0.field3241 >= class82.field1285.field3241 ? arg0.field3241 : class82.field1285.field3241;
                int var8 = arg0.field3228 > class82.field1285.field3228 ? class82.field1285.field3228 : arg0.field3228;
                int var9 = 5 - (-(var7 * 10 / 100) - var8);
                int var10 = class82.field1285.field3241 - arg0.field3241;
                if (var10 < 0) {
                    var10 = -var10;
                }
                if (var10 > var9) {
                    var6 = false;
                }
            }
            if (arg0.field3216 > arg0.field3241) {
                var5 = class156.method1061((byte) 122, new class37[] { arg0.method1306((byte) 88), var6 ? class88.method585(21722, arg0.field3241, class82.field1285.field3241) : class170.field2854, class200.field3398, class129.field2155, class163.method1096(arg0.field3241, (byte) -35), class177.field2960, class163.method1096(arg0.field3216 - arg0.field3241, (byte) -35), class269.field4696 });
            } else {
                var5 = class156.method1061((byte) -50, new class37[] { arg0.method1306((byte) 88), var6 ? class88.method585(arg4 + 54219, arg0.field3241, class82.field1285.field3241) : class170.field2854, class200.field3398, class129.field2155, class163.method1096(arg0.field3241, (byte) -35), class269.field4696 });
            }
        } else {
            var5 = class156.method1061((byte) -83, new class37[] { arg0.method1306((byte) 88), class200.field3398, class144.field2464, class163.method1096(arg0.field3205, (byte) -35), class269.field4696 });
        }
        if (class23.field292 == 1) {
            class241.field4315++;
            class87.method583(arg1, arg3, class156.method1061((byte) 88, new class37[] { class150.field2523, class108.field1689, var5 }), 29782, (short) 13, (long) arg2, class86.field1365);
        } else if (!class174.field2924) {
            for (int var11 = 7; var11 >= 0; var11--) {
                if (class268.field4687[var11] != null) {
                    short var12 = 0;
                    if (class132.field2221 == 0 && class268.field4687[var11].method256(true, class189.field3247)) {
                        if (class82.field1285.field3241 < arg0.field3241) {
                            var12 = 2000;
                        }
                        if (class82.field1285.field3225 != 0 && arg0.field3225 != 0) {
                            if (class82.field1285.field3225 == arg0.field3225) {
                                var12 = 2000;
                            } else {
                                var12 = 0;
                            }
                        }
                    } else if (class50.field781[var11]) {
                        var12 = 2000;
                    }
                    boolean var13 = false;
                    short var14 = class158.field2617[var11];
                    class241.field4335++;
                    short var15 = (short) (var12 + var14);
                    class87.method583(arg1, arg3, class156.method1061((byte) 120, new class37[] { class170.field2854, var5 }), arg4 + 62279, var15, (long) arg2, class268.field4687[var11]);
                }
            }
        } else if ((class274.field4807 & 0x8) == 8) {
            class87.method583(arg1, arg3, class156.method1061((byte) 104, new class37[] { class93.field1464, class108.field1689, var5 }), arg4 + 62279, (short) 4, (long) arg2, class147.field2497);
            class265.field4659++;
        }
        for (int var16 = 0; var16 < class159.field2661; var16++) {
            if (class264.field4642[var16] == 36) {
                class160.field2663[var16] = class156.method1061((byte) 95, new class37[] { class170.field2854, var5 });
                break;
            }
        }
        if (arg4 != -32497) {
            method1861((class188) null, -95, 111, 105, -36);
        }
    }
}
