import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class160 {

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "I")
    public static int field2642 = 0;

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "Z")
    public static boolean field2644 = true;

    @OriginalMember(owner = "client!ki", name = "r", descriptor = "[I")
    public static int[] field2656 = new int[2048];

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "Ljava/lang/String;")
    public static String field2643 = "Loaded world list data";

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
    public static int field2640 = 50;

    @OriginalMember(owner = "client!ki", name = "k", descriptor = "[I")
    public static int[] field2649 = new int[field2640];

    @OriginalMember(owner = "client!ki", name = "t", descriptor = "[I")
    public static int[] field2658 = new int[field2640];

    @OriginalMember(owner = "client!ki", name = "s", descriptor = "[I")
    public static int[] field2657 = new int[field2640];

    @OriginalMember(owner = "client!ki", name = "m", descriptor = "[I")
    public static int[] field2651 = new int[field2640];

    @OriginalMember(owner = "client!ki", name = "p", descriptor = "[Ljava/lang/String;")
    public static String[] field2654 = new String[field2640];

    @OriginalMember(owner = "client!ki", name = "i", descriptor = "[I")
    public static int[] field2647 = new int[field2640];

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "[I")
    public static int[] field2645 = new int[field2640];

    @OriginalMember(owner = "client!ki", name = "l", descriptor = "[I")
    public static int[] field2650 = new int[field2640];

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
    public static int field2639;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "I")
    public static int field2641;

    @OriginalMember(owner = "client!ki", name = "n", descriptor = "I")
    public static int field2652;

    @OriginalMember(owner = "client!ki", name = "o", descriptor = "I")
    public static int field2653;

    @OriginalMember(owner = "client!ki", name = "q", descriptor = "I")
    public static int field2655;

    @OriginalMember(owner = "client!ki", name = "u", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!ki", name = "j", descriptor = "Li;")
    public static class15 field2648;

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "[I")
    public static int[] field2646;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)V", line = 30)
    public static void method1141(int arg0) {
        field2643 = null;
        field2651 = null;
        field2650 = null;
        field2647 = null;
        field2656 = null;
        field2646 = null;
        field2649 = null;
        field2645 = null;
        field2658 = null;
        if (arg0 != 11729) {
            method1141(-115);
        }
        field2657 = null;
        field2648 = null;
        field2654 = null;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lak;IIILak;)Lkh;", line = 55)
    public static final class251 method1142(class172 arg0, int arg1, int arg2, int arg3, class172 arg4) {
        field2659++;
        if (class55.method353(arg0, arg3, (byte) -5, arg1)) {
            return arg2 == -10596 ? class45.method289(-128, arg4.method1287(arg1, arg3, -1)) : (class251) null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lqm;I[I[I[I)V", line = 81)
    public static final void method1143(class334 arg0, int arg1, int[] arg2, int[] arg3, int[] arg4) {
        field2653++;
        for (int var5 = 0; var5 < arg4.length; var5++) {
            int var6 = arg4[var5];
            int var7 = arg3[var5];
            int var8 = arg2[var5];
            int var9 = 0;
            while (var8 != 0 && arg0.field4274.length > var9) {
                if ((var8 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg0.field4274[var9] = null;
                    } else {
                        class202 var10 = class325.method2274(var6, -76);
                        int var11 = var10.field3291;
                        class240 var12 = arg0.field4274[var9];
                        if (var12 != null) {
                            if (var12.field3812 == var6) {
                                if (var11 == 0) {
                                    var12 = arg0.field4274[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field3810 = 0;
                                    var12.field3816 = 0;
                                    var12.field3811 = 1;
                                    var12.field3807 = 0;
                                    var12.field3808 = var7;
                                    class190.method1411(31, class191.field3129 == arg0, var10, arg0.field4264, 0, arg0.field4255);
                                } else if (var11 == 2) {
                                    var12.field3810 = 0;
                                }
                            } else if (var10.field3279 >= class325.method2274(var12.field3812, -73).field3279) {
                                var12 = arg0.field4274[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class240 var13 = arg0.field4274[var9] = new class240();
                            var13.field3811 = 1;
                            var13.field3808 = var7;
                            var13.field3807 = 0;
                            var13.field3810 = 0;
                            var13.field3812 = var6;
                            var13.field3816 = 0;
                            class190.method1411(arg1 ^ 0xFFFFF53C, class191.field3129 == arg0, var10, arg0.field4264, 0, arg0.field4255);
                        }
                    }
                }
                var9++;
                var8 >>>= 0x1;
            }
        }
        if (arg1 != -2781) {
            field2643 = (String) null;
        }
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "()V", line = 208)
    public class160() {
        new class286();
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IB)Ljava/lang/String;", line = 185)
    public static final String method1144(int arg0, byte arg1) {
        field2639++;
        if (arg1 != 97) {
            field2647 = (int[]) null;
        }
        return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + ((arg0 & 0xFF70) >> 8) + "." + (arg0 & 0xFF);
    }
}
