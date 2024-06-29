import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class352 {

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "I")
    public static int field5393 = -1;

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "I")
    public static int field5395 = 0;

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "Lso;")
    public static class327 field5397 = new class327(3, 7);

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "Lng;")
    public static class226 field5399 = new class226(20);

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "I")
    public static int field5391;

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "I")
    public static int field5392;

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "I")
    public static int field5394;

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "I")
    public static int field5396;

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "I")
    public static int field5398;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I[[[Lfl;)V", line = 3)
    public static final void method2204(int arg0, class518[][][] arg1) {
        field5391++;
        for (int var2 = 0; var2 < arg1.length; var2++) {
            class518[][] var3 = arg1[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class518 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field7550 instanceof class351) {
                            ((class351) var6.field7550).method15((byte) -96);
                        }
                        if (var6.field7551 instanceof class351) {
                            ((class351) var6.field7551).method15((byte) -60);
                        }
                        if (var6.field7552 instanceof class351) {
                            ((class351) var6.field7552).method15((byte) -111);
                        }
                        if (var6.field7559 instanceof class351) {
                            ((class351) var6.field7559).method15((byte) -17);
                        }
                        if (var6.field7570 instanceof class351) {
                            ((class351) var6.field7570).method15((byte) -65);
                        }
                        for (class284 var7 = var6.field7569; var7 != null; var7 = var7.field4087) {
                            class117 var8 = var7.field4083;
                            if (var8 instanceof class351) {
                                ((class351) var8).method15((byte) -71);
                            }
                        }
                    }
                }
            }
        }
        if (arg0 >= -4) {
            field5398 = 89;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IBI)I", line = 82)
    public static final int method2205(int arg0, byte arg1, int arg2) {
        if (arg1 >= -34) {
            return 67;
        }
        field5396++;
        int var3 = class297.method1883((byte) -25, arg0 - 1, arg2 + -1) + class297.method1883((byte) -25, arg0 - 1, arg2 + 1) - (-class297.method1883((byte) -25, arg0 - -1, arg2 + -1) - class297.method1883((byte) -25, arg0 + 1, arg2 + 1));
        int var4 = class297.method1883((byte) -25, arg0, arg2 - 1) - (-class297.method1883((byte) -25, arg0, arg2 + 1) - class297.method1883((byte) -25, arg0 - 1, arg2)) + class297.method1883((byte) -25, arg0 + 1, arg2);
        int var5 = class297.method1883((byte) -25, arg0, arg2);
        return var3 / 16 - (-(var4 / 8) - var5 / 4);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Z)V", line = 99)
    public static final void method2206(boolean arg0) {
        field5394++;
        class71 var1 = null;
        try {
            class281 var2 = class483.field7077.method2589("2", arg0);
            while (var2.field4032 == 0) {
                class246.method1659((byte) 117, 1L);
            }
            if (var2.field4032 == 1) {
                var1 = (class71) var2.field4030;
                class209 var3 = new class209(class323.field4627 * 6 + 3);
                var3.method1410(1, -27645);
                var3.method1413(-123, class323.field4627);
                for (int var4 = 0; var4 < class146.field2173.length; var4++) {
                    if (class436.field6519[var4]) {
                        var3.method1413(-119, var4);
                        var3.method1415(class146.field2173[var4], (byte) -94);
                    }
                }
                var1.method408(var3.field3037, 0, -101, var3.field3036);
            }
        } catch (Exception var6) {
        }
        try {
            if (var1 != null) {
                var1.method410(-119);
            }
        } catch (Exception var5) {
        }
        class84.field1294 = class256.method1708((byte) 118);
        class394.field5938 = false;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)V", line = 155)
    public static final void method2207(byte arg0) {
        field5392++;
        for (class404 var1 = (class404) class46.field732.method816(111); var1 != null; var1 = (class404) class46.field732.method812(80)) {
            if (var1.field6094) {
                var1.method2434(arg0 ^ 0xFFFFFFBF);
            }
        }
        if (arg0 != 64) {
            field5395 = -70;
        }
        for (class404 var2 = (class404) class372.field5674.method816(106); var2 != null; var2 = (class404) class372.field5674.method812(118)) {
            if (var2.field6094) {
                var2.method2434(-1);
            }
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)V", line = 194)
    public static void method2208(int arg0) {
        if (arg0 != 3) {
            method2207((byte) -108);
        }
        field5397 = null;
        field5399 = null;
    }
}
