import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public class class100 {

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "Ltn;")
    public static class60 field1330 = new class60(74, 3);

    @OriginalMember(owner = "client!ct", name = "f", descriptor = "I")
    public static int field1335 = 0;

    @OriginalMember(owner = "client!ct", name = "c", descriptor = "Leh;")
    public static class246 field1332 = new class246(68, -2);

    @OriginalMember(owner = "client!ct", name = "g", descriptor = "Leh;")
    public static class246 field1336 = new class246(10, -1);

    @OriginalMember(owner = "client!ct", name = "h", descriptor = "Lam;")
    public static class455 field1337 = new class455();

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "I")
    public static int field1331;

    @OriginalMember(owner = "client!ct", name = "d", descriptor = "I")
    public static int field1333;

    @OriginalMember(owner = "client!ct", name = "e", descriptor = "I")
    public static int field1334;

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(II)V")
    public static final void method698(int arg0, int arg1) {
        field1331++;
        class45 var2 = class354.method2094(arg1, (byte) -113, 12);
        var2.method261(4);
        if (arg0 != 0) {
            field1337 = null;
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(I)V")
    public static void method699(int arg0) {
        field1337 = null;
        if (arg0 == -24880) {
            field1330 = null;
            field1332 = null;
            field1336 = null;
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(Ljp;B)V")
    public static final void method700(class241 arg0, byte arg1) {
        field1333++;
        int var2 = 93 / ((arg1 - 13) / 59);
        arg0.method1515(-2044015643);
        int var3 = 0;
        for (int var4 = 0; var4 < class144.field1908; var4++) {
            int var16 = class521.field7674[var4];
            if ((class395.field5603[var16] & 0x1) == 0) {
                if (var3 > 0) {
                    class395.field5603[var16] = (byte) class170.method1067(class395.field5603[var16], 2);
                    var3--;
                } else {
                    int var17 = arg0.method1520(-12494, 1);
                    if (var17 == 0) {
                        var3 = class236.method1447(false, arg0);
                        class395.field5603[var16] = (byte) class170.method1067(class395.field5603[var16], 2);
                    } else {
                        class127.method835(2, arg0, var16);
                    }
                }
            }
        }
        arg0.method1514(false);
        if (var3 != 0) {
            throw new RuntimeException("nsn0");
        }
        arg0.method1515(-2044015643);
        for (int var5 = 0; var5 < class144.field1908; var5++) {
            int var14 = class521.field7674[var5];
            if ((class395.field5603[var14] & 0x1) != 0) {
                if (var3 > 0) {
                    class395.field5603[var14] = (byte) class170.method1067(class395.field5603[var14], 2);
                    var3--;
                } else {
                    int var15 = arg0.method1520(-12494, 1);
                    if (var15 == 0) {
                        var3 = class236.method1447(false, arg0);
                        class395.field5603[var14] = (byte) class170.method1067(class395.field5603[var14], 2);
                    } else {
                        class127.method835(2, arg0, var14);
                    }
                }
            }
        }
        arg0.method1514(false);
        if (var3 != 0) {
            throw new RuntimeException("nsn1");
        }
        arg0.method1515(-2044015643);
        for (int var6 = 0; var6 < class187.field2693; var6++) {
            int var12 = class236.field3440[var6];
            if ((class395.field5603[var12] & 0x1) != 0) {
                if (var3 > 0) {
                    class395.field5603[var12] = (byte) class170.method1067(class395.field5603[var12], 2);
                    var3--;
                } else {
                    int var13 = arg0.method1520(-12494, 1);
                    if (var13 == 0) {
                        var3 = class236.method1447(false, arg0);
                        class395.field5603[var12] = (byte) class170.method1067(class395.field5603[var12], 2);
                    } else if (class343.method2043((byte) 127, var12, arg0)) {
                        class395.field5603[var12] = (byte) class170.method1067(class395.field5603[var12], 2);
                    }
                }
            }
        }
        arg0.method1514(false);
        if (var3 != 0) {
            throw new RuntimeException("nsn2");
        }
        arg0.method1515(-2044015643);
        for (int var7 = 0; var7 < class187.field2693; var7++) {
            int var10 = class236.field3440[var7];
            if ((class395.field5603[var10] & 0x1) == 0) {
                if (var3 > 0) {
                    class395.field5603[var10] = (byte) class170.method1067(class395.field5603[var10], 2);
                    var3--;
                } else {
                    int var11 = arg0.method1520(-12494, 1);
                    if (var11 == 0) {
                        var3 = class236.method1447(false, arg0);
                        class395.field5603[var10] = (byte) class170.method1067(class395.field5603[var10], 2);
                    } else if (class343.method2043((byte) 52, var10, arg0)) {
                        class395.field5603[var10] = (byte) class170.method1067(class395.field5603[var10], 2);
                    }
                }
            }
        }
        arg0.method1514(false);
        if (var3 != 0) {
            throw new RuntimeException("nsn3");
        }
        class187.field2693 = 0;
        class144.field1908 = 0;
        for (int var8 = 1; var8 < 2048; var8++) {
            class395.field5603[var8] = (byte) (class395.field5603[var8] >> 1);
            class22 var9 = class378.field5355[var8];
            if (var9 == null) {
                class236.field3440[class187.field2693++] = var8;
            } else {
                class521.field7674[class144.field1908++] = var8;
            }
        }
    }

    static {
        new class530(null, "der Spieler ist momentan nicht verfügbar.", null, null);
    }
}
