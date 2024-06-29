import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class68 implements class97 {

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "I")
    private int field1339 = 128;

    @OriginalMember(owner = "client!gb", name = "v", descriptor = "I")
    private int field1350 = 50;

    @OriginalMember(owner = "client!gb", name = "u", descriptor = "Lsd;")
    private class192 field1349;

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "Lsd;")
    private class192 field1336;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "Luc;")
    private class211 field1332;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
    public static int field1329 = 0;

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "[I")
    public static int[] field1341 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "Loc;")
    private static class151 field1338 = class137.method873(2, " ");

    @OriginalMember(owner = "client!gb", name = "q", descriptor = "Loc;")
    public static class151 field1345 = field1338;

    @OriginalMember(owner = "client!gb", name = "s", descriptor = "Loc;")
    public static class151 field1347 = class137.method873(2, "mapfunction");

    @OriginalMember(owner = "client!gb", name = "x", descriptor = "Loc;")
    public static class151 field1352 = class137.method873(2, "blinken3:");

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
    public static int field1330;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
    public static int field1333;

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "I")
    public static int field1334;

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
    public static int field1335;

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "I")
    public static int field1340;

    @OriginalMember(owner = "client!gb", name = "n", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!gb", name = "o", descriptor = "I")
    public static int field1343;

    @OriginalMember(owner = "client!gb", name = "p", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!gb", name = "r", descriptor = "I")
    public static int field1346;

    @OriginalMember(owner = "client!gb", name = "t", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "client!gb", name = "w", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "client!gb", name = "y", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "Lsd;")
    public static class192 field1331;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IB)Z")
    public final boolean method453(int arg0, byte arg1) {
        field1348++;
        return arg1 == -24 ? this.method456(arg0, (byte) 36).field525 : true;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)Z")
    public final boolean method454(int arg0, int arg1) {
        field1335++;
        if (arg0 != 14102) {
            this.method464(86, -17);
        }
        return this.field1339 == 64 || this.method456(arg1, (byte) 36).field550 == 64;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIF)[I")
    public final int[] method455(int arg0, int arg1, float arg2) {
        field1340++;
        if (arg0 != -31145) {
            field1352 = null;
        }
        class25 var4 = this.method456(arg1, (byte) 36);
        var4.field548 = true;
        return var4.method194(this.field1339, this, arg2, this.field1336, (byte) 110);
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(IB)Lcb;")
    private final class25 method456(int arg0, byte arg1) {
        field1353++;
        class25 var3 = (class25) this.field1332.method1318((byte) -77, (long) arg0);
        if (arg1 != 36) {
            this.field1349 = null;
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field1349.method1208(arg0, (byte) -73, 0);
        if (var4 == null) {
            return class54.method374((byte) -17);
        } else {
            class229 var5 = new class229(var4);
            class25 var6 = new class25(var5);
            this.field1332.method1324(var6, 18373, (long) arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(IB)[I")
    public final int[] method457(int arg0, byte arg1) {
        field1342++;
        if (arg1 == 115) {
            class25 var3 = this.method456(arg0, (byte) 36);
            return var3.method201(this, this.field1336, (byte) -97, this.field1339);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Loc;B)V")
    public static final void method458(class151 arg0, byte arg1) {
        field1346++;
        if (class174.field3151.field724 == null) {
            return;
        }
        try {
            if (arg1 == 77) {
                class151 var2 = class65.field1261.method954(class174.field3151.field724, 0);
                class151 var3 = class156.field2832.method954(class174.field3151.field724, 0);
                class151 var4 = class126.method761(new class151[] { var2, class208.field3669, arg0, class218.field3797, var3 }, 10260);
                class151 var5;
                if (arg0.method988(arg1 - 78) == 0) {
                    var5 = class126.method761(new class151[] { var4, class162.field2936 }, 10260);
                } else {
                    var5 = class126.method761(new class151[] { var4, class44.field918, class42.method299(class217.method1351(-76) + 94608000000L, arg1 + -67), class129.field2374, class155.method1018(94608000L, (byte) -110) }, 10260);
                }
                class126.method761(new class151[] { class46.field952, var5, class33.field680 }, 10260).method984(false, class174.field3151.field724);
            }
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(BI)Z")
    public final boolean method459(byte arg0, int arg1) {
        field1334++;
        int var3 = 0 % ((58 - arg0) / 57);
        return this.method456(arg1, (byte) 36).field542;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V")
    public static void method460(int arg0) {
        if (arg0 <= 67) {
            method458(null, (byte) 64);
        }
        field1352 = null;
        field1338 = null;
        field1345 = null;
        field1341 = null;
        field1347 = null;
        field1331 = null;
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)V")
    public final void method461(int arg0) {
        if (arg0 > -32) {
            this.field1350 = 61;
        }
        this.field1332 = new class211(this.field1350);
        field1343++;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZI)I")
    public final int method462(boolean arg0, int arg1) {
        field1351++;
        if (!arg0) {
            this.field1349 = null;
        }
        return this.method456(arg1, (byte) 36).field544;
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(II)V")
    public final void method463(int arg0, int arg1) {
        if (arg1 != -21679) {
            return;
        }
        for (class25 var3 = (class25) this.field1332.method1322((byte) 71); var3 != null; var3 = (class25) this.field1332.method1320(0)) {
            if (var3.field548) {
                var3.method197((byte) -101, arg0);
                var3.field548 = false;
            }
        }
        field1330++;
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(II)Z")
    public final boolean method464(int arg0, int arg1) {
        field1337++;
        if (arg0 <= 1) {
            field1329 = -20;
        }
        return this.method456(arg1, (byte) 36).method196(95, this, this.field1336);
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(I)V")
    public static final void method465(int arg0) {
        field1333++;
        class27.field564.method1317((byte) -123);
        int var1 = -124 / ((arg0 - 39) / 52);
        class108.field1914.method1317((byte) -128);
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lsd;Lsd;II)V")
    public class68(class192 arg0, class192 arg1, int arg2, int arg3) {
        this.field1350 = arg2;
        this.field1349 = arg0;
        this.field1339 = arg3;
        this.field1336 = arg1;
        this.field1332 = new class211(this.field1350);
    }
}
