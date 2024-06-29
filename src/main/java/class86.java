import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class86 {

    @OriginalMember(owner = "client!km", name = "j", descriptor = "Ltl;")
    public static class59 field1353 = class85.method639("::qa_op_test", 9588);

    @OriginalMember(owner = "client!km", name = "q", descriptor = "I")
    public static int field1360 = 0;

    @OriginalMember(owner = "client!km", name = "B", descriptor = "Ltl;")
    public static class59 field1371 = class85.method639("(Z", 9588);

    @OriginalMember(owner = "client!km", name = "a", descriptor = "I")
    public int field1344;

    @OriginalMember(owner = "client!km", name = "b", descriptor = "I")
    public int field1345;

    @OriginalMember(owner = "client!km", name = "c", descriptor = "I")
    public int field1346;

    @OriginalMember(owner = "client!km", name = "d", descriptor = "I")
    public static int field1347;

    @OriginalMember(owner = "client!km", name = "e", descriptor = "I")
    public int field1348;

    @OriginalMember(owner = "client!km", name = "f", descriptor = "I")
    public static int field1349;

    @OriginalMember(owner = "client!km", name = "h", descriptor = "I")
    public int field1351;

    @OriginalMember(owner = "client!km", name = "i", descriptor = "I")
    public int field1352;

    @OriginalMember(owner = "client!km", name = "k", descriptor = "I")
    public int field1354;

    @OriginalMember(owner = "client!km", name = "l", descriptor = "I")
    public int field1355;

    @OriginalMember(owner = "client!km", name = "m", descriptor = "I")
    public int field1356;

    @OriginalMember(owner = "client!km", name = "n", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!km", name = "o", descriptor = "I")
    public int field1358;

    @OriginalMember(owner = "client!km", name = "p", descriptor = "I")
    public int field1359;

    @OriginalMember(owner = "client!km", name = "r", descriptor = "I")
    public static int field1361;

    @OriginalMember(owner = "client!km", name = "s", descriptor = "I")
    public static int field1362;

    @OriginalMember(owner = "client!km", name = "t", descriptor = "I")
    public int field1363;

    @OriginalMember(owner = "client!km", name = "u", descriptor = "I")
    public int field1364;

    @OriginalMember(owner = "client!km", name = "v", descriptor = "I")
    public int field1365;

    @OriginalMember(owner = "client!km", name = "w", descriptor = "I")
    public int field1366;

    @OriginalMember(owner = "client!km", name = "x", descriptor = "I")
    public int field1367;

    @OriginalMember(owner = "client!km", name = "y", descriptor = "I")
    public int field1368;

    @OriginalMember(owner = "client!km", name = "z", descriptor = "I")
    public int field1369;

    @OriginalMember(owner = "client!km", name = "A", descriptor = "I")
    public static int field1370;

    @OriginalMember(owner = "client!km", name = "g", descriptor = "Loe;")
    public static class9 field1350;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(III)V", line = 8)
    public static final void method644(int arg0, int arg1, int arg2) {
        class274.field4719 = true;
        class177.field2902 = arg0;
        class155.field2532 = arg1;
        class27.field359 = arg2;
        class262.field4374 = -1;
        class266.field4592 = -1;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Ltl;Lma;I)Ltl;", line = 17)
    public static final class59 method645(class59 arg0, class263 arg1, int arg2) {
        field1347++;
        if (~arg0.method478(class269.field4669, (byte) -89) == arg2) {
            return arg0;
        }
        while (true) {
            int var3 = arg0.method478(class285.field4902, (byte) 99);
            if (var3 == -1) {
                while (true) {
                    int var4 = arg0.method478(class148.field2422, (byte) -82);
                    if (var4 == -1) {
                        while (true) {
                            int var5 = arg0.method478(class299.field5118, (byte) 107);
                            if (var5 == -1) {
                                while (true) {
                                    int var6 = arg0.method478(class163.field2653, (byte) 110);
                                    if (var6 == -1) {
                                        while (true) {
                                            int var7 = arg0.method478(class105.field1755, (byte) 113);
                                            if (var7 == -1) {
                                                while (true) {
                                                    int var8 = arg0.method478(class281.field4846, (byte) 107);
                                                    if (var8 == -1) {
                                                        return arg0;
                                                    }
                                                    class59 var9 = class275.field4742;
                                                    if (class270.field4675 != null) {
                                                        var9 = class179.method1324(class270.field4675.field4258, 255);
                                                        try {
                                                            if (class270.field4675.field4255 != null) {
                                                                byte[] var10 = ((String) class270.field4675.field4255).getBytes("ISO-8859-1");
                                                                var9 = class316.method2176(0, var10.length, true, var10);
                                                            }
                                                        } catch (UnsupportedEncodingException var12) {
                                                        }
                                                    }
                                                    arg0 = class233.method1630(new class59[] { arg0.method473(var8, 0, (byte) 51), var9, arg0.method497(var8 + 4, (byte) 60) }, -2883);
                                                }
                                            }
                                            arg0 = class233.method1630(new class59[] { arg0.method473(var7, 0, (byte) 102), class182.method1353((byte) 102, class85.method643(4365, arg1, 4)), arg0.method497(var7 + 2, (byte) 60) }, arg2 ^ 0xFFFFF4BD);
                                        }
                                    }
                                    arg0 = class233.method1630(new class59[] { arg0.method473(var6, 0, (byte) 32), class182.method1353((byte) 115, class85.method643(4365, arg1, 3)), arg0.method497(var6 + 2, (byte) 60) }, -2883);
                                }
                            }
                            arg0 = class233.method1630(new class59[] { arg0.method473(var5, 0, (byte) 51), class182.method1353((byte) -118, class85.method643(4365, arg1, 2)), arg0.method497(var5 + 2, (byte) 60) }, -2883);
                        }
                    }
                    arg0 = class233.method1630(new class59[] { arg0.method473(var4, 0, (byte) 68), class182.method1353((byte) 126, class85.method643(4365, arg1, 1)), arg0.method497(var4 + 2, (byte) 60) }, -2883);
                }
            }
            arg0 = class233.method1630(new class59[] { arg0.method473(var3, 0, (byte) 116), class182.method1353((byte) 115, class85.method643(4365, arg1, 0)), arg0.method497(var3 + 2, (byte) 60) }, -2883);
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IIB)Z", line = 117)
    public static final boolean method646(int arg0, int arg1, byte arg2) {
        if (arg0 == 11) {
            arg0 = 10;
        }
        field1362++;
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        class180 var3 = class188.method1390(arg1, false);
        if (arg2 != -113) {
            field1361 = 124;
        }
        return var3.method1338(false, arg0);
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I)Lgg;", line = 155)
    public static final class47 method647(int arg0) {
        int var1 = class41.field615[0] * class236.field3925[0];
        field1370++;
        byte[] var2 = class53.field794[0];
        int[] var3 = new int[var1];
        int var4 = -109 % ((-arg0 - 77) / 41);
        for (int var5 = 0; var5 < var1; var5++) {
            var3[var5] = class284.field4879[class93.method680(var2[var5], 255)];
        }
        class47 var6 = new class47(class300.field5123, class165.field2680, class243.field4061[0], class311.field5274[0], class41.field615[0], class236.field3925[0], var3);
        class133.method974((byte) 78);
        return var6;
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(I)V", line = 185)
    public static final void method648(int arg0) {
        field1357++;
        class231.method1613(32);
        class41.method265(-105);
        class173.method1276(-654049200);
        class62.method514((byte) 30);
        class293.method2024(7929);
        class295.method2065((byte) -74);
        class72.method582((byte) -107);
        class127.method937((byte) 65);
        class280.method1974(true);
        class301.method2103((byte) 34);
        class266.method1841(4);
        class251.method1755((byte) -122);
        class233.method1635((byte) 50);
        class167.method1184(-1780302036);
        int var1 = 69 % ((arg0 + 53) / 40);
        class169.field2722.method1482((byte) 30);
    }

    @OriginalMember(owner = "client!km", name = "c", descriptor = "(I)V", line = 218)
    public static void method649(int arg0) {
        if (arg0 >= -74) {
            field1350 = (class9) null;
        }
        field1353 = null;
        field1371 = null;
        field1350 = null;
    }

    @OriginalMember(owner = "client!km", name = "d", descriptor = "(I)V", line = 230)
    public static final void method650(int arg0) {
        if (arg0 >= -2) {
            method647(37);
        }
        field1349++;
        if (class56.field833 > 0) {
            class311.method2147(-128);
        } else {
            class252.field4192 = class21.field284;
            class21.field284 = null;
            class286.method1996(30143, 40);
        }
    }
}
