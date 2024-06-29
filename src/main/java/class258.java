import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class258 {

    @OriginalMember(owner = "client!w", name = "c", descriptor = "I")
    public static int field4199 = -1;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "I")
    public static int field4197;

    @OriginalMember(owner = "client!w", name = "d", descriptor = "I")
    public static int field4200;

    @OriginalMember(owner = "client!w", name = "f", descriptor = "I")
    public static int field4202;

    @OriginalMember(owner = "client!w", name = "g", descriptor = "I")
    public static int field4203;

    @OriginalMember(owner = "client!w", name = "h", descriptor = "I")
    public static int field4204;

    @OriginalMember(owner = "client!w", name = "i", descriptor = "I")
    public static int field4205;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "Loj;")
    public static class309 field4198;

    @OriginalMember(owner = "client!w", name = "e", descriptor = "Ljava/lang/String;")
    public static String field4201;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IILim;)Ljava/lang/String;")
    public static final String method1824(int arg0, int arg1, class170 arg2) {
        field4202++;
        try {
            int var3 = arg2.method1162(-129);
            if (arg0 < var3) {
                var3 = arg0;
            }
            byte[] var4 = new byte[var3];
            if (arg1 >= -106) {
                field4201 = null;
            }
            arg2.field2676 += class27.field318.method2024(0, arg2.field2676, arg2.field2650, var3, var4, 0);
            return class77.method529(var4, 0, 0, var3);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Z)V")
    public static final void method1825(boolean arg0) {
        field4203++;
        class175.field2763.method443((byte) 103);
        int var1 = class175.field2763.method439(111, 8);
        if (var1 < class80.field1211) {
            for (int var2 = var1; var2 < class80.field1211; var2++) {
                class111.field1607[class81.field1234++] = class187.field2939[var2];
            }
        }
        if (var1 > class80.field1211) {
            throw new RuntimeException("gnpov1");
        }
        class80.field1211 = 0;
        if (arg0) {
            field4201 = null;
        }
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class187.field2939[var3];
            class86 var5 = class191.field3045[var4];
            int var6 = class175.field2763.method439(107, 1);
            if (var6 == 0) {
                class187.field2939[class80.field1211++] = var4;
                var5.field3931 = class311.field4996;
            } else {
                int var7 = class175.field2763.method439(115, 2);
                if (var7 == 0) {
                    class187.field2939[class80.field1211++] = var4;
                    var5.field3931 = class311.field4996;
                    class212.field3299[class140.field2016++] = var4;
                } else if (var7 == 1) {
                    class187.field2939[class80.field1211++] = var4;
                    var5.field3931 = class311.field4996;
                    int var8 = class175.field2763.method439(108, 3);
                    var5.method1733(1, (byte) -117, var8);
                    int var9 = class175.field2763.method439(109, 1);
                    if (var9 == 1) {
                        class212.field3299[class140.field2016++] = var4;
                    }
                } else if (var7 == 2) {
                    class187.field2939[class80.field1211++] = var4;
                    var5.field3931 = class311.field4996;
                    if (class175.field2763.method439(103, 1) == 1) {
                        int var11 = class175.field2763.method439(120, 3);
                        var5.method1733(2, (byte) -71, var11);
                        int var12 = class175.field2763.method439(120, 3);
                        var5.method1733(2, (byte) -122, var12);
                    } else {
                        int var10 = class175.field2763.method439(120, 3);
                        var5.method1733(0, (byte) -42, var10);
                    }
                    int var13 = class175.field2763.method439(110, 1);
                    if (var13 == 1) {
                        class212.field3299[class140.field2016++] = var4;
                    }
                } else if (var7 == 3) {
                    class111.field1607[class81.field1234++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
    public static final void method1826(int arg0) {
        field4205++;
        if (arg0 > -41) {
            method1826(8);
        }
        class50.field636.method1510(10283);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(B)I")
    public static final int method1827(byte arg0) {
        field4197++;
        if ((double) class207.field3244 == 3.0D) {
            return 37;
        } else if ((double) class207.field3244 == 4.0D) {
            return 50;
        } else if ((double) class207.field3244 == 6.0D) {
            return 75;
        } else {
            if (arg0 != -117) {
                method1830(115);
            }
            return (double) class207.field3244 == 8.0D ? 100 : 200;
        }
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(I)V")
    public static final void method1828(int arg0) {
        if (class108.field1568 != null) {
            class81 var1 = class108.field1568;
            synchronized (class108.field1568) {
                class108.field1568 = null;
            }
        }
        field4204++;
        if (arg0 != 200) {
            method1825(true);
        }
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(I)V")
    public static final void method1829(int arg0) {
        field4200++;
        if (!class60.method384(-4) && class250.field4051 != class148.field2204) {
            class281.method1934(class22.field288, class97.field1464, false, class148.field2204, class214.field3347.field3970[0], 2048, false, class214.field3347.field3972[0]);
            return;
        }
        class117.method769(8);
        if (arg0 != -22758) {
            field4198 = null;
        }
        if (class28.field345 != class148.field2204) {
            class276.method1910((byte) 58);
        }
    }

    @OriginalMember(owner = "client!w", name = "d", descriptor = "(I)V")
    public static void method1830(int arg0) {
        field4201 = null;
        int var1 = -118 % ((-arg0 - 66) / 54);
        field4198 = null;
    }
}
