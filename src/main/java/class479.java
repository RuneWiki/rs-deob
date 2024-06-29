import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eea")
public class class479 {

    @OriginalMember(owner = "client!eea", name = "d", descriptor = "Lrda;")
    public static class467 field6198 = new class467(4);

    @OriginalMember(owner = "client!eea", name = "e", descriptor = "Z")
    public static boolean field6199 = false;

    @OriginalMember(owner = "client!eea", name = "f", descriptor = "I")
    public static int field6200 = 0;

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "I")
    public static int field6195;

    @OriginalMember(owner = "client!eea", name = "b", descriptor = "I")
    public static int field6196;

    @OriginalMember(owner = "client!eea", name = "c", descriptor = "[Ljia;")
    public static class355[] field6197;

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(B)V", line = 3)
    public static void method2686(byte arg0) {
        field6197 = null;
        if (arg0 < -32) {
            field6198 = null;
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 17)
    public static final int method2687(String arg0, int arg1) {
        field6196++;
        if (arg0 == null) {
            return -1;
        }
        int var2 = 0;
        if (arg1 != 9170) {
            field6198 = null;
        }
        while (var2 < class703.field9297) {
            if (arg0.equalsIgnoreCase(class176.field2319[var2])) {
                return var2;
            }
            var2++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(ILtia;)V", line = 49)
    public static final void method2688(int arg0, class740 arg1) {
        field6195++;
        int var2 = 0;
        arg1.method4021((byte) 48);
        for (int var3 = 0; var3 < class20.field189; var3++) {
            int var15 = class503.field6451[var3];
            if ((class130.field1735[var15] & 0x1) == 0) {
                if (var2 > 0) {
                    class130.field1735[var15] = (byte) class77.method473(class130.field1735[var15], 2);
                    var2--;
                } else {
                    int var16 = arg1.method4023(true, 1);
                    if (var16 == 0) {
                        var2 = class178.method1143(arg1, -3);
                        class130.field1735[var15] = (byte) class77.method473(class130.field1735[var15], 2);
                    } else {
                        class567.method3058(var15, arg1, 0);
                    }
                }
            }
        }
        arg1.method4030(false);
        if (var2 != 0) {
            throw new RuntimeException("nsn0");
        }
        arg1.method4021((byte) 48);
        for (int var4 = 0; var4 < class20.field189; var4++) {
            int var13 = class503.field6451[var4];
            if ((class130.field1735[var13] & 0x1) != 0) {
                if (var2 > 0) {
                    class130.field1735[var13] = (byte) class77.method473(class130.field1735[var13], 2);
                    var2--;
                } else {
                    int var14 = arg1.method4023(true, 1);
                    if (var14 == 0) {
                        var2 = class178.method1143(arg1, -3);
                        class130.field1735[var13] = (byte) class77.method473(class130.field1735[var13], 2);
                    } else {
                        class567.method3058(var13, arg1, 0);
                    }
                }
            }
        }
        arg1.method4030(false);
        if (var2 != 0) {
            throw new RuntimeException("nsn1");
        }
        if (arg0 != -10052) {
            method2686((byte) -124);
        }
        arg1.method4021((byte) 48);
        for (int var5 = 0; var5 < class194.field2702; var5++) {
            int var11 = class119.field1604[var5];
            if ((class130.field1735[var11] & 0x1) != 0) {
                if (var2 > 0) {
                    class130.field1735[var11] = (byte) class77.method473(class130.field1735[var11], 2);
                    var2--;
                } else {
                    int var12 = arg1.method4023(true, 1);
                    if (var12 == 0) {
                        var2 = class178.method1143(arg1, arg0 ^ 0x2741);
                        class130.field1735[var11] = (byte) class77.method473(class130.field1735[var11], 2);
                    } else if (class143.method824(arg1, var11, -125)) {
                        class130.field1735[var11] = (byte) class77.method473(class130.field1735[var11], 2);
                    }
                }
            }
        }
        arg1.method4030(false);
        if (var2 != 0) {
            throw new RuntimeException("nsn2");
        }
        arg1.method4021((byte) 48);
        for (int var6 = 0; var6 < class194.field2702; var6++) {
            int var9 = class119.field1604[var6];
            if ((class130.field1735[var9] & 0x1) == 0) {
                if (var2 > 0) {
                    class130.field1735[var9] = (byte) class77.method473(class130.field1735[var9], 2);
                    var2--;
                } else {
                    int var10 = arg1.method4023(true, 1);
                    if (var10 == 0) {
                        var2 = class178.method1143(arg1, -3);
                        class130.field1735[var9] = (byte) class77.method473(class130.field1735[var9], 2);
                    } else if (class143.method824(arg1, var9, -105)) {
                        class130.field1735[var9] = (byte) class77.method473(class130.field1735[var9], 2);
                    }
                }
            }
        }
        arg1.method4030(false);
        if (var2 != 0) {
            throw new RuntimeException("nsn3");
        }
        class20.field189 = 0;
        class194.field2702 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            class130.field1735[var7] = (byte) (class130.field1735[var7] >> 1);
            class33 var8 = class263.field3508[var7];
            if (var8 == null) {
                class119.field1604[class194.field2702++] = var7;
            } else {
                class503.field6451[class20.field189++] = var7;
            }
        }
    }
}
