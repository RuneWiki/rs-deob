import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class144 extends class180 {

    @OriginalMember(owner = "client!oc", name = "H", descriptor = "I")
    private final int field2521;

    @OriginalMember(owner = "client!oc", name = "B", descriptor = "I")
    private final int field2515;

    @OriginalMember(owner = "client!oc", name = "s", descriptor = "I")
    private final int field2506;

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "I")
    private final int field2501;

    @OriginalMember(owner = "client!oc", name = "t", descriptor = "Z")
    public static boolean field2507 = false;

    @OriginalMember(owner = "client!oc", name = "x", descriptor = "Ljf;")
    private static class229 field2511 = class212.method1457((byte) 66, "wave:");

    @OriginalMember(owner = "client!oc", name = "r", descriptor = "Ljf;")
    public static class229 field2505 = field2511;

    @OriginalMember(owner = "client!oc", name = "v", descriptor = "Ljf;")
    private static class229 field2509 = class212.method1457((byte) 67, "skill: ");

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "Ljf;")
    public static class229 field2500 = field2511;

    @OriginalMember(owner = "client!oc", name = "w", descriptor = "Ljf;")
    public static class229 field2510 = field2509;

    @OriginalMember(owner = "client!oc", name = "I", descriptor = "Ljf;")
    private static class229 field2522 = class212.method1457((byte) 118, "Drop");

    @OriginalMember(owner = "client!oc", name = "E", descriptor = "Ljf;")
    public static class229 field2518 = field2522;

    @OriginalMember(owner = "client!oc", name = "z", descriptor = "Lni;")
    public static class24 field2513 = new class24(50);

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "I")
    public static int field2503;

    @OriginalMember(owner = "client!oc", name = "q", descriptor = "I")
    public static int field2504;

    @OriginalMember(owner = "client!oc", name = "u", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!oc", name = "y", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!oc", name = "A", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!oc", name = "F", descriptor = "I")
    public static int field2519;

    @OriginalMember(owner = "client!oc", name = "G", descriptor = "I")
    public static int field2520;

    @OriginalMember(owner = "client!oc", name = "C", descriptor = "Ljf;")
    public static class229 field2516;

    @OriginalMember(owner = "client!oc", name = "J", descriptor = "[Lrm;")
    public static class248[] field2523;

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "[Lkb;")
    public static class35[] field2502;

    @OriginalMember(owner = "client!oc", name = "D", descriptor = "[[[B")
    public static byte[][][] field2517;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V", line = 6)
    public static final void method1002(int arg0) {
        class259.method1845();
        class123.field2173 = null;
        class308.field5211 = arg0;
        class254.method1808(1);
        field2504++;
        class304.field5160.method644(1);
        class249.field4384 = new class72();
        ((class275) class227.field3904).method1927(53);
        class216.field3703 = new class186[255];
        class216.field3710 = 0;
        class239.method1710();
        class139.method979();
        class281.method1975((byte) 118);
        class225.method1548(false, (byte) -20);
        class280.method1961((byte) 127);
        for (int var1 = 0; var1 < 2048; var1++) {
            class33 var2 = class192.field3334[var1];
            if (var2 != null) {
                var2.field612 = null;
            }
        }
        if (class108.field1900) {
            class139.method972(104, 104);
            class164.method1116();
        }
        class19.method189(class269.field4616, 0, class106.field1840);
        class186.method1301(arg0 ^ 0xFFFFFFEB, class269.field4616);
        if (class325.field5482 == 5) {
            class203.method1423(23823, class269.field4616);
        }
        if (class325.field5482 == 10) {
            class237.method1695((byte) -126, false);
        }
        if (class325.field5482 == 30) {
            class186.method1295(25, (byte) 84);
        }
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(IIIIIII)V", line = 73)
    public class144(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field2521 = arg1;
        this.field2515 = arg0;
        this.field2506 = arg2;
        this.field2501 = arg3;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)V", line = 87)
    public static void method1003(byte arg0) {
        if (arg0 != 110) {
            method1003((byte) 71);
        }
        field2522 = null;
        field2500 = null;
        field2517 = (byte[][][]) null;
        field2516 = null;
        field2505 = null;
        field2510 = null;
        field2502 = null;
        field2518 = null;
        field2511 = null;
        field2509 = null;
        field2513 = null;
        field2523 = null;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(III)V", line = 109)
    public final void method787(int arg0, int arg1, int arg2) {
        field2503++;
        int var4 = this.field2515 * arg1 >> 12;
        int var5 = this.field2506 * arg1 >> 12;
        int var6 = 118 % ((arg0 + 20) / 52);
        int var7 = this.field2521 * arg2 >> 12;
        int var8 = this.field2501 * arg2 >> 12;
        class8.method44(this.field3121, this.field3115, this.field3122, var8, var4, var7, var5, 55);
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(III)V", line = 132)
    public final void method786(int arg0, int arg1, int arg2) {
        if (arg1 < 71) {
            return;
        }
        int var4 = this.field2515 * arg2 >> 12;
        field2520++;
        int var5 = this.field2506 * arg2 >> 12;
        int var6 = this.field2521 * arg0 >> 12;
        int var7 = this.field2501 * arg0 >> 12;
        class283.method1988(var6, var7, (byte) -125, var4, this.field3121, var5);
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(III)V", line = 149)
    public final void method789(int arg0, int arg1, int arg2) {
        if (arg0 != -1) {
            field2522 = (class229) null;
        }
        int var4 = this.field2506 * arg2 >> 12;
        field2519++;
        int var5 = this.field2515 * arg2 >> 12;
        int var6 = this.field2501 * arg1 >> 12;
        int var7 = this.field2521 * arg1 >> 12;
        class297.method2049(var7, this.field3122, this.field3115, var4, -10383, var5, var6);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lek;ILek;)V", line = 178)
    public static final void method1004(class185 arg0, int arg1, class185 arg2) {
        class143.field2487 = arg2;
        field2514++;
        if (arg1 != 3776) {
            field2513 = (class24) null;
        }
        class274.field4691 = arg0;
    }
}
