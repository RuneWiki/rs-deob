import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class82 {

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "Ltg;")
    private static class184 field1465 = class135.method812("You need a members account to login to this world)3", 3);

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "Ltg;")
    public static class184 field1461 = class135.method812("sl_stars", 3);

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "[I")
    public static int[] field1462 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "Ltg;")
    public static class184 field1466 = field1465;

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "[I")
    public static int[] field1469 = new int[5];

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "I")
    public static int field1468 = 0;

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "I")
    public static int field1470 = -1;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    public static int field1463;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
    public static int field1464;

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "I")
    public static int field1467;

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(BII)I")
    public static final int method457(byte arg0, int arg1, int arg2) {
        field1467++;
        long var3 = (long) ((arg1 << 16) + arg2);
        int var5 = -125 % ((arg0 - 58) / 39);
        return class2.field55 != null && class2.field55.field2393 == var3 ? class47.field885.field1834 * 99 / (class47.field885.field1809.length - class2.field55.field1485) + 1 : 0;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIII)V")
    public static final void method458(int arg0, int arg1, int arg2, int arg3) {
        class90 var4 = class190.field3704[arg0][arg1][arg2];
        if (var4 != null) {
            class190.field3704[arg0][arg1][arg2].field1676 = arg3;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
    public static void method459(int arg0) {
        field1466 = null;
        field1461 = null;
        if (arg0 == 3) {
            field1462 = null;
            field1469 = null;
            field1465 = null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)Loe;")
    public static final class137 method460(boolean arg0) {
        class137 var1 = new class137();
        if (arg0) {
            method459(-114);
        }
        var1.field2495 = class110.field1980;
        var1.field2496 = class24.field436;
        var1.field2491 = class83.field1479[0];
        field1472++;
        var1.field2494 = class177.field3387[0];
        var1.field2490 = class184.field3535[0];
        var1.field2492 = class26.field472[0];
        byte[] var2 = class202.field3902[0];
        int var3 = var1.field2491 * var1.field2490;
        var1.field2493 = new int[var3];
        for (int var4 = 0; var4 < var3; var4++) {
            var1.field2493[var4] = class83.field1481[class10.method61(255, var2[var4])];
        }
        class200.method1283((byte) -98);
        return var1;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Ltg;ILrh;)Ltg;")
    public static final class184 method461(class184 arg0, int arg1, class167 arg2) {
        field1463++;
        if (arg1 != -4) {
            field1462 = null;
        }
        if (arg0.method1142(class159.field2866, (byte) 110) == -1) {
            return arg0;
        }
        while (true) {
            int var3 = arg0.method1142(class120.field2164, (byte) 110);
            if (var3 == -1) {
                while (true) {
                    int var4 = arg0.method1142(class20.field379, (byte) 110);
                    if (var4 == -1) {
                        while (true) {
                            int var5 = arg0.method1142(class186.field3593, (byte) 110);
                            if (var5 == -1) {
                                while (true) {
                                    int var6 = arg0.method1142(class116.field2096, (byte) 110);
                                    if (var6 == -1) {
                                        while (true) {
                                            int var7 = arg0.method1142(class36.field673, (byte) 110);
                                            if (var7 == -1) {
                                                while (true) {
                                                    int var8 = arg0.method1142(class50.field931, (byte) 110);
                                                    if (var8 == -1) {
                                                        return arg0;
                                                    }
                                                    class184 var9 = class170.field3242;
                                                    if (class173.field3286 != null) {
                                                        var9 = class41.method238(class173.field3286.field1768, (byte) 97);
                                                        try {
                                                            if (class173.field3286.field1767 != null) {
                                                                byte[] var10 = ((String) class173.field3286.field1767).getBytes("ISO-8859-1");
                                                                var9 = class120.method725(0, var10.length, arg1 + 4, var10);
                                                            }
                                                        } catch (UnsupportedEncodingException var11) {
                                                        }
                                                    }
                                                    arg0 = class144.method884(0, new class184[] { arg0.method1162(0, -711833726, var8), var9, arg0.method1140(arg1 ^ 0xFFFFFFFD, var8 + 4) });
                                                }
                                            }
                                            arg0 = class144.method884(0, new class184[] { arg0.method1162(0, -711833726, var7), class12.method79(class177.method1086(4, arg2, (byte) 17), 4006), arg0.method1140(arg1 ^ 0xFFFFFFFD, var7 + 2) });
                                        }
                                    }
                                    arg0 = class144.method884(arg1 ^ 0xFFFFFFFC, new class184[] { arg0.method1162(0, -711833726, var6), class12.method79(class177.method1086(3, arg2, (byte) 17), 4006), arg0.method1140(arg1 + 5, var6 + 2) });
                                }
                            }
                            arg0 = class144.method884(0, new class184[] { arg0.method1162(0, -711833726, var5), class12.method79(class177.method1086(2, arg2, (byte) 17), arg1 ^ 0xFFFFF05A), arg0.method1140(1, var5 + 2) });
                        }
                    }
                    arg0 = class144.method884(0, new class184[] { arg0.method1162(0, -711833726, var4), class12.method79(class177.method1086(1, arg2, (byte) 17), 4006), arg0.method1140(1, var4 + 2) });
                }
            }
            arg0 = class144.method884(0, new class184[] { arg0.method1162(0, arg1 ^ 0x2A6DB87E, var3), class12.method79(class177.method1086(0, arg2, (byte) 17), arg1 + 4010), arg0.method1140(1, var3 + 2) });
        }
    }
}
