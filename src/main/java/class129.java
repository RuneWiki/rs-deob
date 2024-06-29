import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class129 extends class171 {

    @OriginalMember(owner = "client!ti", name = "B", descriptor = "Lwf;")
    public static class16 field2361 = new class16(64);

    @OriginalMember(owner = "client!ti", name = "N", descriptor = "[I")
    public static int[] field2373 = new int[2048];

    @OriginalMember(owner = "client!ti", name = "C", descriptor = "I")
    public static int field2362;

    @OriginalMember(owner = "client!ti", name = "D", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!ti", name = "E", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!ti", name = "F", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!ti", name = "G", descriptor = "I")
    public static int field2366;

    @OriginalMember(owner = "client!ti", name = "I", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!ti", name = "J", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!ti", name = "K", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!ti", name = "L", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!ti", name = "M", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!ti", name = "H", descriptor = "Lge;")
    private class235 field2367;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ZII)I")
    public static final int method997(boolean arg0, int arg1, int arg2) {
        field2364++;
        class80 var3 = (class80) class126.field2308.method1601(43, (long) arg2);
        if (var3 == null) {
            return -1;
        } else if (arg0) {
            return 94;
        } else if (arg1 >= 0 && var3.field1522.length > arg1) {
            return var3.field1522[arg1];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lha;II)Lha;")
    public final class46 method998(class46 arg0, int arg1, int arg2) {
        field2369++;
        if (this.field2367 == null) {
            return arg0;
        }
        class124 var4 = (class124) this.field2367.method1601(-84, (long) arg2);
        if (arg1 != -12678) {
            this.method1002(55, (class75) null);
        }
        return var4 == null ? arg0 : var4.field2289;
    }

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "(I)V")
    public static void method999(int arg0) {
        field2373 = null;
        if (arg0 == 16) {
            field2361 = null;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(BII)I")
    public final int method1000(byte arg0, int arg1, int arg2) {
        field2366++;
        if (this.field2367 == null) {
            return arg2;
        }
        if (arg0 != -52) {
            method1004((byte) -17, 2);
        }
        class176 var4 = (class176) this.field2367.method1601(89, (long) arg1);
        return var4 == null ? arg2 : var4.field3166;
    }

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "(B)I")
    public static final int method1001(byte arg0) {
        int var1 = 27 / ((arg0 + 76) / 45);
        field2371++;
        return 16;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ILwe;)V")
    public final void method1002(int arg0, class75 arg1) {
        if (arg0 >= -83) {
            field2361 = null;
        }
        while (true) {
            int var3 = arg1.method558(1);
            if (var3 == 0) {
                field2365++;
                return;
            }
            this.method1003(var3, 48, arg1);
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IILwe;)V")
    private final void method1003(int arg0, int arg1, class75 arg2) {
        field2368++;
        if (arg0 == 249) {
            int var4 = arg2.method558(1);
            if (this.field2367 == null) {
                int var5 = class127.method987(var4, 1868387312);
                this.field2367 = new class235(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg2.method558(1) == 1;
                int var8 = arg2.method559(-1);
                class69 var9;
                if (var7) {
                    var9 = new class124(arg2.method577(0));
                } else {
                    var9 = new class176(arg2.method562((byte) -71));
                }
                this.field2367.method1597((long) var8, (byte) -126, var9);
            }
        }
        if (arg1 <= 30) {
            this.method1003(-66, 97, (class75) null);
        }
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(BI)V")
    public static final void method1004(byte arg0, int arg1) {
        field2372++;
        class80 var2 = (class80) class126.field2308.method1601(-101, (long) arg1);
        if (arg0 <= -29 && var2 != null) {
            var2.method501(0);
        }
    }

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "(I)V")
    public static final void method1005(int arg0) {
        class87 var1 = class54.field928;
        synchronized (class54.field928) {
            class177.field3183 = class163.field2882;
            class14.field210++;
            class7.field116 = class182.field3276;
            class208.field3735 = class100.field1846;
            class71.field1270 = class244.field4337;
            class100.field1850 = class126.field2319;
            class143.field2607 = class85.field1615;
            class146.field2645 = class40.field700;
            if (arg0 != 2048) {
                field2373 = null;
            }
            class244.field4337 = 0;
        }
        field2362++;
    }
}
