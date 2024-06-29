import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class52 extends class24 {

    @OriginalMember(owner = "client!hc", name = "ab", descriptor = "I")
    public int field1072 = 0;

    @OriginalMember(owner = "client!hc", name = "V", descriptor = "Lqf;")
    private static class117 field1067 = class72.method514(123, "Attack");

    @OriginalMember(owner = "client!hc", name = "W", descriptor = "Lqf;")
    public static class117 field1068 = field1067;

    @OriginalMember(owner = "client!hc", name = "gb", descriptor = "Lqf;")
    private static class117 field1078 = class72.method514(124, "Please reload this page)3");

    @OriginalMember(owner = "client!hc", name = "X", descriptor = "Lqf;")
    public static class117 field1069 = field1078;

    @OriginalMember(owner = "client!hc", name = "jb", descriptor = "Lqf;")
    public static class117 field1081 = class72.method514(125, "Verbinde mit Server)3)3)3");

    @OriginalMember(owner = "client!hc", name = "db", descriptor = "Z")
    public static boolean field1075 = false;

    @OriginalMember(owner = "client!hc", name = "lb", descriptor = "Lqf;")
    public static class117 field1083 = class72.method514(119, "Hierhin gehen");

    @OriginalMember(owner = "client!hc", name = "T", descriptor = "I")
    public static int field1065;

    @OriginalMember(owner = "client!hc", name = "U", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!hc", name = "Y", descriptor = "I")
    public static int field1070;

    @OriginalMember(owner = "client!hc", name = "Z", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!hc", name = "bb", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!hc", name = "eb", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "client!hc", name = "fb", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "client!hc", name = "ib", descriptor = "I")
    public static int field1080;

    @OriginalMember(owner = "client!hc", name = "kb", descriptor = "I")
    public static int field1082;

    @OriginalMember(owner = "client!hc", name = "cb", descriptor = "Ljb;")
    public static class64 field1074;

    @OriginalMember(owner = "client!hc", name = "hb", descriptor = "Lnc;")
    public static class93 field1079;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIZIII)V")
    public static final void method383(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        int var7 = 2048 - arg6 & 0x7FF;
        field1070++;
        if (!arg3) {
            method385((byte) -90);
        }
        int var8 = 0;
        int var9 = arg4;
        int var10 = 0;
        int var11 = 2048 - arg5 & 0x7FF;
        if (var11 != 0) {
            int var12 = class12.field177[var11];
            int var13 = class12.field180[var11];
            int var14 = var8 * var12 - arg4 * var13 >> 16;
            var9 = var8 * var13 + arg4 * var12 >> 16;
            var8 = var14;
        }
        if (var7 != 0) {
            int var15 = class12.field177[var7];
            int var16 = class12.field180[var7];
            int var17 = var9 * var16 + var10 * var15 >> 16;
            var9 = var9 * var15 - var10 * var16 >> 16;
            var10 = var17;
        }
        class136.field3247 = arg1 - var8;
        class117.field2813 = arg2 - var9;
        class27.field530 = arg6;
        class87.field1959 = arg0 - var10;
        class77.field1722 = arg5;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lqf;B)V")
    public static final void method384(class117 arg0, byte arg1) {
        field1073++;
        if (arg0 == null || arg0.method915(27) == 0) {
            class21.field345 = 0;
            return;
        }
        class117 var2 = arg0;
        class117[] var3 = new class117[100];
        int var4 = 0;
        if (arg1 < 17) {
            method383(114, 127, 29, true, -38, -118, 58);
        }
        while (true) {
            int var5 = var2.method920(0, 32);
            if (var5 == -1) {
                class117 var7 = var2.method906((byte) -128);
                if (var7.method915(27) > 0) {
                    var3[var4++] = var7.method925(true);
                }
                class21.field345 = 0;
                label49: for (int var8 = 0; var8 < class48.field969; var8++) {
                    class72 var9 = class27.method206(var8, (byte) 90);
                    if (var9.field1551 == -1 && var9.field1544 != null) {
                        class117 var10 = var9.field1544.method925(true);
                        for (int var11 = 0; var11 < var4; var11++) {
                            if (var10.method926((byte) -98, var3[var11]) == -1) {
                                continue label49;
                            }
                        }
                        class71.field1525[class21.field345] = var10;
                        class73.field1605[class21.field345] = var8;
                        class21.field345++;
                        if (class21.field345 >= class71.field1525.length) {
                            return;
                        }
                    }
                }
                return;
            }
            class117 var6 = var2.method943(0, (byte) 122, var5).method906((byte) 6);
            if (var6.method915(27) > 0) {
                var3[var4++] = var6.method925(true);
            }
            var2 = var2.method908(var5 + 1, (byte) 120);
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(B)V")
    public static final void method385(byte arg0) {
        field1071++;
        if (class20.field334 && class67.field1399 != class140.field3344) {
            class152.method1210(class3.field35, class94.field2284, 97, class141.field3395.field1970[0], class141.field3395.field2004[0], class140.field3344);
        } else if (arg0 > 49 && class68.field1427 != class140.field3344) {
            class68.field1427 = class140.field3344;
            class129.method1008(class140.field3344, false);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IILve;III)V")
    public static final void method386(int arg0, int arg1, class148 arg2, int arg3, int arg4, int arg5) {
        field1076++;
        class22 var6 = new class22();
        var6.field428 = arg2.field3634;
        var6.field419 = arg2.field3626 * 128;
        var6.field426 = arg2.field3611;
        var6.field416 = arg2.field3610;
        var6.field412 = arg1 * 128;
        var6.field417 = arg3;
        var6.field433 = arg2.field3629;
        if (arg0 != 14072) {
            field1074 = null;
        }
        var6.field404 = arg5 * 128;
        int var7 = arg2.field3649;
        int var8 = arg2.field3665;
        if (arg4 == 1 || arg4 == 3) {
            var8 = arg2.field3649;
            var7 = arg2.field3665;
        }
        var6.field425 = (arg5 + var7) * 128;
        var6.field403 = (arg1 + var8) * 128;
        if (arg2.field3653 != null) {
            var6.field411 = arg2;
            var6.method179(0);
        }
        class66.field1374.method22(var6, (byte) 33);
        if (var6.field428 != null) {
            var6.field431 = var6.field433 + (int) (Math.random() * (double) (var6.field416 - var6.field433));
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lla;I)V")
    public final void method387(class77 arg0, int arg1) {
        if (arg1 != 32) {
            return;
        }
        field1066++;
        while (true) {
            int var3 = arg0.method570((byte) 123);
            if (var3 == 0) {
                return;
            }
            this.method389(var3, -55, arg0);
        }
    }

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "(I)V")
    public static void method388(int arg0) {
        field1079 = null;
        field1074 = null;
        if (arg0 < 16) {
            field1068 = null;
        }
        field1081 = null;
        field1069 = null;
        field1067 = null;
        field1078 = null;
        field1068 = null;
        field1083 = null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IILla;)V")
    private final void method389(int arg0, int arg1, class77 arg2) {
        if (arg0 == 2) {
            this.field1072 = arg2.method597(115);
        }
        int var4 = 90 / ((arg1 + 19) / 34);
        field1077++;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BLjava/awt/Component;II)Ldf;")
    public static final class28 method390(byte arg0, Component arg1, int arg2, int arg3) {
        field1080++;
        try {
            Class var4 = Class.forName("oa");
            class28 var5 = (class28) var4.getDeclaredConstructor().newInstance();
            int var6 = 44 % ((arg0 + 71) / 40);
            var5.method215(-60, arg1, arg2, arg3);
            return var5;
        } catch (Throwable var8) {
            class103 var7 = new class103();
            var7.method215(87, arg1, arg2, arg3);
            return var7;
        }
    }
}
