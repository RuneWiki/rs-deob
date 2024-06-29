import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class78 {

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "J")
    public long field1355 = 0L;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "Lmb;")
    private static class132 field1340 = class166.method1092("Sun", 127);

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "Lmb;")
    private static class132 field1344 = class166.method1092("Mon", 119);

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "Lmb;")
    private static class132 field1343 = class166.method1092("Fri", 116);

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "Lmb;")
    private static class132 field1346 = class166.method1092("Tue", 118);

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "Lmb;")
    private static class132 field1356 = class166.method1092("Sat", 112);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "Lmb;")
    public static class132 field1339 = class166.method1092("Benutzername: ", 118);

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "Lmb;")
    private static class132 field1357 = class166.method1092("Thu", 117);

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "Lmb;")
    public static class132 field1345 = class166.method1092("Benutzen", 114);

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "Lmb;")
    private static class132 field1354 = class166.method1092("Wed", 114);

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "[Lmb;")
    public static class132[] field1347 = new class132[] { field1340, field1344, field1346, field1354, field1357, field1343, field1356 };

    @OriginalMember(owner = "client!ha", name = "v", descriptor = "Lkd;")
    public static class112 field1359 = new class112(new byte[5000]);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
    public int field1338;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
    public int field1341;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
    public int field1342;

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "I")
    public int field1349;

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "I")
    public int field1350;

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "I")
    public int field1352;

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "I")
    public int field1353;

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "I")
    public int field1358;

    @OriginalMember(owner = "client!ha", name = "w", descriptor = "I")
    public int field1360;

    @OriginalMember(owner = "client!ha", name = "x", descriptor = "I")
    public int field1361;

    @OriginalMember(owner = "client!ha", name = "y", descriptor = "I")
    public int field1362;

    @OriginalMember(owner = "client!ha", name = "z", descriptor = "Lmf;")
    public class136 field1363;

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "Lpb;")
    public static class165 field1348;

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "[[[I")
    public static int[][][] field1364;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
    public static void method483(int arg0) {
        field1340 = null;
        field1364 = null;
        field1345 = null;
        field1339 = null;
        if (arg0 <= 59) {
            field1346 = null;
        }
        field1347 = null;
        field1348 = null;
        field1343 = null;
        field1356 = null;
        field1344 = null;
        field1354 = null;
        field1357 = null;
        field1346 = null;
        field1359 = null;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIZI)V")
    public static final void method484(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        class239.method1517(arg1, arg0, arg1 + arg4, arg0 + arg2);
        if (arg3) {
            method483(-31);
        }
        class50.method336();
        class239.method1525(arg1, arg0, arg4, arg2, 0);
        field1351++;
        if (class70.field1171 < 100) {
            return;
        }
        if (class75.field1243 == null) {
            class18 var5 = new class18(arg4, arg2);
            class239.method1533(var5.field263, arg4, arg2);
            class180.method1157(0, 0, 0, class192.field3586, (byte) -125, 0, arg2, class113.field2188, arg4);
            class75.field1243 = var5;
            class140.field2628.method578(0);
        }
        class75.field1243.method106(arg1, arg0);
        int var6 = class243.field4408 * arg4 / class192.field3586 + arg1;
        int var7 = class54.field907 * arg2 / class113.field2188 + arg0;
        int var8 = class136.field2561 * arg4 / class192.field3586;
        int var9 = class4.field48 * arg2 / class113.field2188;
        class239.method1531(var6, var7, var8, var9, 16711680, 128);
        class239.method1528(var6, var7, var8, var9, 16711680);
        if (class185.field3438 <= 0 || class185.field3438 % 10 >= 5) {
            return;
        }
        for (class137 var10 = (class137) class231.field4165.method119(true); var10 != null; var10 = (class137) class231.field4165.method125((byte) -111)) {
            if (class163.field2949 == var10.field2570) {
                int var11 = var10.field2566 * arg2 / class113.field2188 + arg0;
                int var12 = var10.field2576 * arg4 / class192.field3586 + arg1;
                class239.method1525(var12 - 2, var11 + -2, 4, 4, 16776960);
            }
        }
    }
}
