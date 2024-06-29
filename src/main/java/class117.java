import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public class class117 {

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "I")
    public int field1505;

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "Lbt;")
    public static class117 field1503 = new class117(1);

    @OriginalMember(owner = "client!bt", name = "d", descriptor = "Lbt;")
    public static class117 field1506 = new class117(2);

    @OriginalMember(owner = "client!bt", name = "f", descriptor = "Lbt;")
    public static class117 field1508 = new class117(4);

    @OriginalMember(owner = "client!bt", name = "g", descriptor = "Lbt;")
    public static class117 field1509 = new class117(1);

    @OriginalMember(owner = "client!bt", name = "h", descriptor = "Lbt;")
    public static class117 field1510 = new class117(2);

    @OriginalMember(owner = "client!bt", name = "i", descriptor = "Lbt;")
    public static class117 field1511 = new class117(4);

    @OriginalMember(owner = "client!bt", name = "j", descriptor = "Lbt;")
    public static class117 field1512 = new class117(2);

    @OriginalMember(owner = "client!bt", name = "k", descriptor = "Lbt;")
    public static class117 field1513 = new class117(4);

    @OriginalMember(owner = "client!bt", name = "l", descriptor = "Lrga;")
    public static class280 field1514 = new class280(33, 3);

    @OriginalMember(owner = "client!bt", name = "n", descriptor = "[B")
    public static byte[] field1516 = new byte[520];

    @OriginalMember(owner = "client!bt", name = "o", descriptor = "Lrga;")
    public static class280 field1517 = new class280(3, -1);

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "I")
    public static int field1504;

    @OriginalMember(owner = "client!bt", name = "e", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!bt", name = "p", descriptor = "I")
    public static int field1518;

    @OriginalMember(owner = "client!bt", name = "m", descriptor = "Ljava/lang/String;")
    public static String field1515;

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(I)V", line = 10)
    public static void method637(int arg0) {
        field1513 = null;
        field1510 = null;
        field1506 = null;
        field1508 = null;
        field1516 = null;
        field1511 = null;
        field1514 = null;
        if (arg0 != 18914) {
            method637(114);
        }
        field1503 = null;
        field1517 = null;
        field1509 = null;
        field1512 = null;
        field1515 = null;
    }

    @OriginalMember(owner = "client!bt", name = "<init>", descriptor = "(I)V", line = 32)
    private class117(int arg0) {
        this.field1505 = arg0;
    }

    @OriginalMember(owner = "client!bt", name = "toString", descriptor = "()Ljava/lang/String;", line = 43)
    public final String toString() {
        field1504++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(B)V", line = 51)
    public static final void method638(byte arg0) {
        field1507++;
        int var1 = -34 / ((-arg0 - 60) / 62);
        for (int var2 = 0; var2 < class265.field3368; var2++) {
            class377 var4 = class572.field7993[var2];
            boolean var5 = false;
            if (var4.field4749 == null) {
                var4.field4759--;
                if (var4.field4759 >= (var4.method2046(1) ? -1500 : -10)) {
                    if (var4.field4754 == 1 && var4.field4764 == null) {
                        var4.field4764 = class211.method1258(class533.field7189, var4.field4760, 0);
                        if (var4.field4764 == null) {
                            continue;
                        }
                        var4.field4759 += var4.field4764.method1259();
                    } else if (var4.method2046(1) && (var4.field4752 == null || var4.field4762 == null)) {
                        if (var4.field4752 == null) {
                            var4.field4752 = class416.method2214(class472.field5993, var4.field4760);
                        }
                        if (var4.field4752 == null) {
                            continue;
                        }
                        if (var4.field4762 == null) {
                            var4.field4762 = var4.field4752.method2216(new int[] { 22050 });
                            if (var4.field4762 == null) {
                                continue;
                            }
                        }
                    }
                    if (var4.field4759 < 0) {
                        int var6;
                        if (var4.field4755 == 0) {
                            var6 = var4.field4763 * (var4.field4754 == 3 ? class301.field3698.field6635 : class301.field3698.field6628) >> 8;
                        } else {
                            int var7 = var4.field4755 >> 24 & 0x3;
                            if (class376.field4748.field6470 == var7) {
                                int var8 = var4.field4755 & 0xFF << 9;
                                int var9 = (var4.field4755 & 0xFF142F) >> 16;
                                int var10 = (var9 << 9) + 256 - class376.field4748.field6461;
                                if (var10 < 0) {
                                    var10 = -var10;
                                }
                                int var11 = (var4.field4755 & 0xFFE6) >> 8;
                                int var12 = (var11 << 9) + 256 - class376.field4748.field6464;
                                if (var12 < 0) {
                                    var12 = -var12;
                                }
                                int var13 = var12 + var10 - 512;
                                if (var13 > var8) {
                                    var4.field4759 = -99999;
                                    continue;
                                }
                                if (var13 < 0) {
                                    var13 = 0;
                                }
                                var6 = (var8 - var13) * class301.field3698.field6644 * var4.field4763 / var8 >> 8;
                            } else {
                                var6 = 0;
                            }
                        }
                        if (var6 > 0) {
                            class555 var14 = null;
                            if (var4.field4754 == 1) {
                                var14 = var4.field4764.method1260().method3059(class584.field8166);
                            } else if (var4.method2046(1)) {
                                var14 = var4.field4762;
                            }
                            class519 var15 = var4.field4749 = class519.method2811(var14, 100, var6);
                            var15.method2841(var4.field4756 - 1);
                            class480.field6387.method1296(var15);
                        }
                    }
                } else {
                    var5 = true;
                }
            } else if (!var4.field4749.method1873(-38)) {
                var5 = true;
            }
            if (var5) {
                class265.field3368--;
                for (int var16 = var2; var16 < class265.field3368; var16++) {
                    class572.field7993[var16] = class572.field7993[var16 + 1];
                }
                var2--;
            }
        }
        if (class639.field8989 && !class27.method185(true)) {
            if (class301.field3698.field6633 != 0 && class582.field8137 != -1) {
                class627.method3447(false, 0, class301.field3698.field6633, class81.field1086, (byte) 107, class582.field8137);
            }
            class639.field8989 = false;
        } else if (class301.field3698.field6633 != 0 && class582.field8137 != -1 && !class27.method185(true)) {
            class445.field5626++;
            class704 var3 = class314.method1820(class562.field7810, class400.field5014, (byte) 76);
            var3.field9929.method3464(class582.field8137, -105);
            class122.method654(var3, (byte) -36);
            class582.field8137 = -1;
        }
    }
}
