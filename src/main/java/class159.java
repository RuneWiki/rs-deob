import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class159 extends class285 {

    @OriginalMember(owner = "client!gb", name = "J", descriptor = "Lek;")
    public class173 field2690;

    @OriginalMember(owner = "client!gb", name = "L", descriptor = "Lve;")
    public static class255 field2691 = class87.method607(47, "hitbar_default");

    @OriginalMember(owner = "client!gb", name = "B", descriptor = "Lve;")
    public static class255 field2682 = class87.method607(29, "<col=80ff00>");

    @OriginalMember(owner = "client!gb", name = "A", descriptor = "F")
    public static float field2681;

    @OriginalMember(owner = "client!gb", name = "z", descriptor = "I")
    public static int field2680;

    @OriginalMember(owner = "client!gb", name = "C", descriptor = "I")
    public static int field2683;

    @OriginalMember(owner = "client!gb", name = "D", descriptor = "I")
    public static int field2684;

    @OriginalMember(owner = "client!gb", name = "H", descriptor = "I")
    public static int field2688;

    @OriginalMember(owner = "client!gb", name = "I", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!gb", name = "F", descriptor = "Lrg;")
    public static class88 field2686;

    @OriginalMember(owner = "client!gb", name = "E", descriptor = "[[[B")
    public static byte[][][] field2685;

    @OriginalMember(owner = "client!gb", name = "G", descriptor = "[[[Lsc;")
    public static class249[][][] field2687;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "(I)V", line = 12)
    public static void method1157(int arg0) {
        field2686 = null;
        if (arg0 == 24987) {
            field2682 = null;
            field2685 = (byte[][][]) null;
            field2691 = null;
            field2687 = (class249[][][]) null;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILtl;)Z", line = 40)
    public static final boolean method1158(int arg0, class197 arg1) {
        field2680++;
        if (arg1.field3412 == null) {
            return false;
        }
        for (int var2 = 0; var2 < arg1.field3412.length; var2++) {
            int var3 = class213.method1528(17, arg1, var2);
            int var4 = arg1.field3398[var2];
            if (arg1.field3412[var2] == 2) {
                if (var3 >= var4) {
                    return false;
                }
            } else if (arg1.field3412[var2] == 3) {
                if (var4 >= var3) {
                    return false;
                }
            } else if (arg1.field3412[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        if (arg0 != 30439) {
            field2691 = (class255) null;
        }
        return true;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)Lve;", line = 95)
    public static final class255 method1159(int arg0, int arg1) {
        if (arg0 > -36) {
            field2681 = 1.3043154F;
        }
        class255 var2 = class215.method1532(arg1, true);
        field2684++;
        for (int var3 = var2.method1774(-41) - 3; var3 > 0; var3 -= 3) {
            var2 = class3.method14(new class255[] { var2.method1780(var3, -10449, 0), class269.field4633, var2.method1786(var3, 9751) }, (byte) -74);
        }
        if (var2.method1774(-41) > 9) {
            return class3.method14(new class255[] { class11.field164, var2.method1780(var2.method1774(-41) - 8, -10449, 0), class187.field3009, class199.field3422, var2, class300.field5101 }, (byte) -75);
        } else if (var2.method1774(-41) <= 6) {
            return class3.method14(new class255[] { class314.field5331, var2, class160.field2705 }, (byte) -117);
        } else {
            return class3.method14(new class255[] { class143.field2382, var2.method1780(var2.method1774(-41) - 4, -10449, 0), class249.field4201, class199.field3422, var2, class300.field5101 }, (byte) -107);
        }
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lek;)V", line = 123)
    public class159(class173 arg0) {
        this.field2690 = arg0;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IZI)V", line = 133)
    public static final void method1160(int arg0, boolean arg1, int arg2) {
        field2683++;
        if (arg1) {
            return;
        }
        for (int var3 = 0; var3 < class6.field96; var3++) {
            class289 var4 = class167.method1216(var3, (byte) 122);
            if (var4 != null) {
                int var5 = var4.field4963;
                if (var5 >= 0 && !class283.field4866.method991((byte) 101, var5)) {
                    var5 = -1;
                }
                int var6;
                if (var4.field4977 >= 0) {
                    int var10 = var4.field4977;
                    int var11 = (var10 & 0x7F) + arg0;
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > 127) {
                        var11 = 127;
                    }
                    int var12 = (var10 & 0x380) + (var10 + arg2 & 0xFC00) + var11;
                    var6 = class283.field4865[class287.method2032(!arg1, 96, var12)];
                } else if (var5 >= 0) {
                    var6 = class283.field4865[class287.method2032(true, 96, class283.field4866.method982(var5, true))];
                } else if (var4.field4969 == -1) {
                    var6 = -1;
                } else {
                    int var7 = var4.field4969;
                    int var8 = (var7 & 0x7F) + arg0;
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 127) {
                        var8 = 127;
                    }
                    int var9 = (arg2 + var7 & 0xFC00) + (var7 & 0x380) + var8;
                    var6 = class283.field4865[class287.method2032(true, 96, var9)];
                }
                class106.field1782[var3 + 1] = var6;
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "(I)V", line = 209)
    public static final void method1161(int arg0) {
        field2688++;
        for (int var1 = arg0; var1 < class282.field4858; var1++) {
            int var2 = class84.field1356[var1];
            class186 var3 = class82.field1334[var2];
            if (var3 != null) {
                class127.method942(2, var3, var3.field2996.field3933);
            }
        }
    }
}
