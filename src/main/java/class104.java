import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class104 {

    @OriginalMember(owner = "client!d", name = "j", descriptor = "I")
    public int field1407;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "Ljava/lang/String;")
    public String field1399;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!d", name = "c", descriptor = "I")
    public static int field1400;

    @OriginalMember(owner = "client!d", name = "d", descriptor = "I")
    public static int field1401;

    @OriginalMember(owner = "client!d", name = "e", descriptor = "I")
    public static int field1402;

    @OriginalMember(owner = "client!d", name = "f", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!d", name = "g", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!d", name = "i", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!d", name = "k", descriptor = "I")
    public static int field1408;

    @OriginalMember(owner = "client!d", name = "h", descriptor = "Lfv;")
    public static class79 field1405;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(BI)I")
    public static final int method627(byte arg0, int arg1) {
        field1408++;
        if (arg0 >= -11) {
            method629((byte) 90);
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V")
    public static final void method628(int arg0) {
        field1398++;
        if (arg0 > -97) {
            field1405 = null;
        }
        for (int var1 = 0; var1 < 100; var1++) {
            class442.field6427[var1] = true;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(B)V")
    public static final void method629(byte arg0) {
        field1404++;
        class178.method1037(0, (long) class532.field7836, class343.field4596);
        if (class168.field2174 != -1) {
            class140.method865(class168.field2174, 6);
        }
        for (int var1 = 0; var1 < class266.field3569; var1++) {
            if (class442.field6427[var1]) {
                class114.field1496[var1] = true;
            }
            class207.field2728[var1] = class442.field6427[var1];
            class442.field6427[var1] = false;
        }
        class319.field4257 = class532.field7836;
        if (arg0 < 70) {
            field1405 = null;
        }
        if (class343.field4596.method1144()) {
            class98.field1295 = true;
        }
        if (class168.field2174 != -1) {
            class266.field3569 = 0;
            class195.method1119(0);
        }
        class343.field4596.method1206();
        class334.method1947((byte) -87, class343.field4596);
        int var2 = class214.method1368(-24880);
        if (var2 == -1) {
            var2 = class256.field3403;
        }
        if (var2 == -1) {
            var2 = class176.field2274;
        }
        class363.method2167(var2, -29608);
        class123.field1594 = 0;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(BLza;)V")
    public static final void method630(byte arg0, class287 arg1) {
        if (class144.field1922) {
            class115.method691(31111, arg1);
        } else {
            class179.method1041(arg1, false);
        }
        field1400++;
        if (arg0 != -45) {
            field1405 = null;
        }
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(B)V")
    public static final void method631(byte arg0) {
        field1403++;
        if (arg0 != 31) {
            field1405 = null;
        }
        if (class49.field556 < 0) {
            class178.field2308 = -1;
            class508.field7367 = -1;
            class49.field556 = 0;
        }
        if (class416.field6014 < class49.field556) {
            class178.field2308 = -1;
            class49.field556 = class416.field6014;
            class508.field7367 = -1;
        }
        if (class163.field2133 < 0) {
            class163.field2133 = 0;
            class508.field7367 = -1;
            class178.field2308 = -1;
        }
        if (class416.field6015 < class163.field2133) {
            class178.field2308 = -1;
            class508.field7367 = -1;
            class163.field2133 = class416.field6015;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "([JII[II)V")
    public static final void method632(long[] arg0, int arg1, int arg2, int[] arg3, int arg4) {
        if (arg2 != 26678) {
            field1405 = null;
        }
        field1401++;
        if (arg1 >= arg4) {
            return;
        }
        int var5 = (arg1 + arg4) / 2;
        int var6 = arg1;
        long var7 = arg0[var5];
        arg0[var5] = arg0[arg4];
        arg0[arg4] = var7;
        int var9 = arg3[var5];
        arg3[var5] = arg3[arg4];
        arg3[arg4] = var9;
        int var10 = ~var7 == Long.MIN_VALUE ? 0 : 1;
        for (int var11 = arg1; var11 < arg4; var11++) {
            if (((long) (var11 & var10) + var7) > arg0[var11]) {
                long var12 = arg0[var11];
                arg0[var11] = arg0[var6];
                arg0[var6] = var12;
                int var14 = arg3[var11];
                arg3[var11] = arg3[var6];
                arg3[var6++] = var14;
            }
        }
        arg0[arg4] = arg0[var6];
        arg0[var6] = var7;
        arg3[arg4] = arg3[var6];
        arg3[var6] = var9;
        method632(arg0, arg1, 26678, arg3, var6 - 1);
        method632(arg0, var6 + 1, 26678, arg3, arg4);
    }

    @OriginalMember(owner = "client!d", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1406++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lgp;I)V")
    public static final void method633(class36 arg0, int arg1) {
        field1402++;
        if (!class483.field7125) {
            arg0.method2674(true);
            if (arg1 > 52) {
                class391.field5656--;
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(B)V")
    public static void method634(byte arg0) {
        field1405 = null;
        if (arg0 != -13) {
            field1405 = null;
        }
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class104(String arg0, int arg1) {
        this.field1407 = arg1;
        this.field1399 = arg0;
    }
}
