import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class169 extends class295 {

    @OriginalMember(owner = "client!th", name = "G", descriptor = "Ljava/lang/String;")
    private String field2495 = "null";

    @OriginalMember(owner = "client!th", name = "L", descriptor = "I")
    public static volatile int field2500 = 0;

    @OriginalMember(owner = "client!th", name = "D", descriptor = "C")
    public char field2492;

    @OriginalMember(owner = "client!th", name = "I", descriptor = "C")
    public char field2497;

    @OriginalMember(owner = "client!th", name = "B", descriptor = "I")
    private int field2490;

    @OriginalMember(owner = "client!th", name = "C", descriptor = "I")
    public static int field2491;

    @OriginalMember(owner = "client!th", name = "E", descriptor = "I")
    public static int field2493;

    @OriginalMember(owner = "client!th", name = "F", descriptor = "I")
    public static int field2494;

    @OriginalMember(owner = "client!th", name = "J", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!th", name = "K", descriptor = "I")
    public static int field2499;

    @OriginalMember(owner = "client!th", name = "M", descriptor = "I")
    public static int field2501;

    @OriginalMember(owner = "client!th", name = "O", descriptor = "I")
    public static int field2502;

    @OriginalMember(owner = "client!th", name = "P", descriptor = "I")
    public static int field2503;

    @OriginalMember(owner = "client!th", name = "R", descriptor = "I")
    public static int field2505;

    @OriginalMember(owner = "client!th", name = "S", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!th", name = "H", descriptor = "Laj;")
    private class71 field2496;

    @OriginalMember(owner = "client!th", name = "Q", descriptor = "Laj;")
    public class71 field2504;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 3)
    public final boolean method1265(int arg0, String arg1) {
        field2498++;
        if (this.field2504 == null) {
            return false;
        }
        if (this.field2496 == null) {
            this.method1270(true);
        }
        if (arg0 >= -21) {
            this.method1266(24, -17, (class289) null);
        }
        for (class6 var3 = (class6) this.field2496.method614(-114, class330.method2103(9479941, arg1)); var3 != null; var3 = (class6) this.field2496.method605(69)) {
            if (var3.field43.equals(arg1)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IILap;)V", line = 42)
    private final void method1266(int arg0, int arg1, class289 arg2) {
        field2501++;
        if (arg1 >= -100) {
            field2494 = 42;
        }
        if (arg0 == 1) {
            this.field2492 = class393.method2421(arg2.method1868((byte) -120), 20483);
        } else if (arg0 == 2) {
            this.field2497 = class393.method2421(arg2.method1868((byte) -124), 20483);
        } else if (arg0 == 3) {
            this.field2495 = arg2.method1871(-1);
        } else if (arg0 == 4) {
            this.field2490 = arg2.method1856((byte) 25);
        } else if (arg0 == 5 || arg0 == 6) {
            int var4 = arg2.method1853(101);
            this.field2504 = new class71(class443.method2751(true, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method1856((byte) 27);
                class381 var7;
                if (arg0 == 5) {
                    var7 = new class448(arg2.method1871(-1));
                } else {
                    var7 = new class193(arg2.method1856((byte) 77));
                }
                this.field2504.method612((long) var6, -1, var7);
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ZI)Ljava/lang/String;", line = 95)
    public final String method1267(boolean arg0, int arg1) {
        field2502++;
        if (this.field2504 == null) {
            return this.field2495;
        }
        if (arg0) {
            field2494 = 36;
        }
        class448 var3 = (class448) this.field2504.method614(-116, (long) arg1);
        return var3 == null ? this.field2495 : var3.field6492;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IB)V", line = 122)
    public static final void method1268(int arg0, byte arg1) {
        class410 var2 = class348.field4722;
        synchronized (class348.field4722) {
            class348.field4722.method2534(arg1 ^ 0xFFFFFFF9, arg0);
        }
        field2503++;
        class410 var3 = class167.field2487;
        synchronized (class167.field2487) {
            if (arg1 != -7) {
                field2494 = 9;
            }
            class167.field2487.method2534(0, arg0);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(II)I", line = 138)
    public final int method1269(int arg0, int arg1) {
        field2491++;
        if (this.field2504 == null) {
            return this.field2490;
        }
        if (arg0 != -6) {
            this.method1271((byte) -50, (class289) null);
        }
        class193 var3 = (class193) this.field2504.method614(-122, (long) arg1);
        return var3 == null ? this.field2490 : var3.field2776;
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(Z)V", line = 165)
    private final void method1270(boolean arg0) {
        field2493++;
        this.field2496 = new class71(this.field2504.method615(!arg0));
        if (!arg0) {
            this.field2504 = null;
        }
        for (class448 var2 = (class448) this.field2504.method608(77); var2 != null; var2 = (class448) this.field2504.method606((byte) 113)) {
            class6 var3 = new class6(var2.field6492, (int) var2.field5349);
            this.field2496.method612(class330.method2103(9479941, var2.field6492), -1, var3);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(BLap;)V", line = 187)
    public final void method1271(byte arg0, class289 arg1) {
        while (true) {
            int var3 = arg1.method1861((byte) -72);
            if (var3 == 0) {
                if (arg0 != -106) {
                    return;
                }
                field2506++;
                return;
            }
            this.method1266(var3, -126, arg1);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(BI)Z", line = 207)
    public final boolean method1272(byte arg0, int arg1) {
        field2505++;
        if (this.field2504 == null) {
            return false;
        }
        if (this.field2496 == null) {
            this.method1273(arg0 - 53);
        }
        class193 var3 = (class193) this.field2496.method614(-122, (long) arg1);
        if (arg0 == 53) {
            return var3 != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!th", name = "e", descriptor = "(I)V", line = 238)
    private final void method1273(int arg0) {
        this.field2496 = new class71(this.field2504.method615(false));
        field2499++;
        if (arg0 != 0) {
            this.method1266(-126, -63, (class289) null);
        }
        for (class193 var2 = (class193) this.field2504.method608(arg0 ^ 0xFFFFFFE0); var2 != null; var2 = (class193) this.field2504.method606((byte) 121)) {
            class193 var3 = new class193((int) var2.field5349);
            this.field2496.method612((long) var2.field2776, -1, var3);
        }
    }
}
