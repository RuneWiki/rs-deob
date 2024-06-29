import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class39 extends class255 {

    @OriginalMember(owner = "client!ok", name = "Q", descriptor = "[Lse;")
    public class198[] field720;

    @OriginalMember(owner = "client!ok", name = "U", descriptor = "Leb;")
    public static class230 field724 = class68.method589(0, "::gc");

    @OriginalMember(owner = "client!ok", name = "N", descriptor = "Leb;")
    public static class230 field717 = class68.method589(0, ")2");

    @OriginalMember(owner = "client!ok", name = "T", descriptor = "[Leb;")
    public static class230[] field723 = new class230[100];

    @OriginalMember(owner = "client!ok", name = "O", descriptor = "I")
    public static int field718 = 0;

    @OriginalMember(owner = "client!ok", name = "W", descriptor = "Leb;")
    public static class230 field726 = class68.method589(0, "compass");

    @OriginalMember(owner = "client!ok", name = "L", descriptor = "I")
    public static int field715;

    @OriginalMember(owner = "client!ok", name = "M", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!ok", name = "P", descriptor = "I")
    public static int field719;

    @OriginalMember(owner = "client!ok", name = "R", descriptor = "I")
    public static int field721;

    @OriginalMember(owner = "client!ok", name = "V", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!ok", name = "S", descriptor = "Lug;")
    public static class193 field722;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(BI)Z")
    public final boolean method347(byte arg0, int arg1) {
        field725++;
        if (arg0 != -123) {
            field718 = -121;
        }
        return this.field720[arg1].field3540;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Z)V")
    private static final void method348(boolean arg0) {
        field721++;
        boolean var1 = arg0;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < (class186.field3266 - 1); var2++) {
                if (class225.field3890[var2] < 1000 && class225.field3890[var2 + 1] > 1000) {
                    var1 = false;
                    class230 var3 = class192.field3388[var2];
                    class192.field3388[var2] = class192.field3388[var2 + 1];
                    class192.field3388[var2 + 1] = var3;
                    class230 var4 = class149.field2667[var2];
                    class149.field2667[var2] = class149.field2667[var2 + 1];
                    class149.field2667[var2 + 1] = var4;
                    int var5 = class46.field809[var2];
                    class46.field809[var2] = class46.field809[var2 + 1];
                    class46.field809[var2 + 1] = var5;
                    int var6 = class244.field4196[var2];
                    class244.field4196[var2] = class244.field4196[var2 + 1];
                    class244.field4196[var2 + 1] = var6;
                    short var7 = class225.field3890[var2];
                    class225.field3890[var2] = class225.field3890[var2 + 1];
                    class225.field3890[var2 + 1] = var7;
                    long var8 = class145.field2599[var2];
                    class145.field2599[var2] = class145.field2599[var2 + 1];
                    class145.field2599[var2 + 1] = var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILeb;)Z")
    public static final boolean method349(int arg0, class230 arg1) {
        if (arg0 <= 59) {
            method349(-90, (class230) null);
        }
        field719++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class273.field4805; var2++) {
            if (arg1.method1612((byte) 15, class12.field239[var2])) {
                return true;
            }
        }
        return arg1.method1612((byte) 15, class56.field1033.field4620);
    }

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "(I)V")
    public static final void method350(int arg0) {
        if (!class243.field4188) {
            class225.field3890[0] = 1007;
            if (class176.field3083 != 0) {
                class246.field4375 = class194.field3495;
                class61.field1178 = class270.field4777;
            } else if (class96.field1727 == 0) {
                class246.field4375 = class34.field620;
                class61.field1178 = class251.field4497;
            } else {
                class246.field4375 = class225.field3886;
                class61.field1178 = class92.field1657;
            }
            class186.field3266 = 1;
            class149.field2667[0] = class9.field158;
            class192.field3388[0] = class89.field1580;
        }
        field715++;
        if (class263.field4679 != -1) {
            class112.method902(110, class263.field4679);
        }
        for (int var1 = 0; var1 < class72.field1318; var1++) {
            if (class71.field1300[var1]) {
                class125.field2198[var1] = true;
            }
            class29.field531[var1] = class71.field1300[var1];
            class71.field1300[var1] = false;
        }
        class177.field3116 = -1;
        class37.field701 = -1;
        class192.field3413 = null;
        class127.field2215 = class259.field4584;
        if (class263.field4679 != -1) {
            class72.field1318 = 0;
            class223.method1547(0, class180.field3155, 0, 0, class263.field4679, 0, -1, -1, class135.field2434);
        }
        class87.method700();
        method348(false);
        if (class243.field4188) {
            class66.method583((byte) 27);
        } else if (class37.field701 != -1) {
            class79.method654(class177.field3116, (byte) -87, class37.field701);
        }
        if (class21.field428 == 3) {
            for (int var2 = 0; var2 < class72.field1318; var2++) {
                if (class29.field531[var2]) {
                    class87.method701(class76.field1375[var2], class153.field2731[var2], class177.field3115[var2], class172.field3039[var2], 16711935, 128);
                } else if (class125.field2198[var2]) {
                    class87.method701(class76.field1375[var2], class153.field2731[var2], class177.field3115[var2], class172.field3039[var2], 16711680, 128);
                }
            }
        }
        class194.method1386(class56.field1033.field2300, class219.field3771, (byte) -73, class124.field2174, class56.field1033.field2274);
        class219.field3771 = 0;
        if (arg0 != 25991) {
            method351((byte) -101);
        }
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(Lkk;Lkk;IZ)V")
    public class39(class223 arg0, class223 arg1, int arg2, boolean arg3) {
        class98 var5 = new class98();
        int var6 = arg0.method1533((byte) 83, arg2);
        this.field720 = new class198[var6];
        int[] var7 = arg0.method1535(arg2, (byte) 84);
        for (int var8 = 0; var8 < var7.length; var8++) {
            class158 var9 = null;
            byte[] var10 = arg0.method1546(var7[var8], (byte) -100, arg2);
            int var11 = (var10[0] & 0xFF) << 8 | var10[1] & 0xFF;
            for (class158 var12 = (class158) var5.method839(128); var12 != null; var12 = (class158) var5.method834((byte) 82)) {
                if (var12.field2823 == var11) {
                    var9 = var12;
                    break;
                }
            }
            if (var9 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method1528(0, var11, false);
                } else {
                    var13 = arg1.method1528(var11, 0, false);
                }
                var9 = new class158(var11, var13);
                var5.method843(-5, var9);
            }
            this.field720[var7[var8]] = new class198(var10, var9);
        }
    }

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "(B)V")
    public static void method351(byte arg0) {
        if (arg0 <= 100) {
            method351((byte) -78);
        }
        field723 = null;
        field722 = null;
        field724 = null;
        field717 = null;
        field726 = null;
    }
}
