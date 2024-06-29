import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class108 {

    @OriginalMember(owner = "client!pd", name = "o", descriptor = "I")
    public int field2518 = 0;

    @OriginalMember(owner = "client!pd", name = "t", descriptor = "I")
    public int field2523 = 0;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "Z")
    public static boolean field2508 = false;

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "Lr;")
    private static class118 field2514 = class153.method1136(99, "Your account is already logged in)3");

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "[S")
    public static short[] field2509 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!pd", name = "n", descriptor = "I")
    public static int field2517 = 0;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "Lr;")
    public static class118 field2505 = field2514;

    @OriginalMember(owner = "client!pd", name = "s", descriptor = "Lr;")
    public static class118 field2522 = class153.method1136(80, " ");

    @OriginalMember(owner = "client!pd", name = "r", descriptor = "Z")
    public static boolean field2521 = true;

    @OriginalMember(owner = "client!pd", name = "q", descriptor = "I")
    public static int field2520 = 50;

    @OriginalMember(owner = "client!pd", name = "w", descriptor = "[Lt;")
    public static class132[] field2526 = new class132[2048];

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "I")
    public static int field2515 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "Lr;")
    private static class118 field2511 = class153.method1136(121, "Login limit exceeded)3");

    @OriginalMember(owner = "client!pd", name = "v", descriptor = "I")
    public static int field2525 = 0;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "Lr;")
    public static class118 field2506 = field2511;

    @OriginalMember(owner = "client!pd", name = "B", descriptor = "Lr;")
    public static class118 field2531 = class153.method1136(112, "Diese Betatest)2Welt ist nur f-Ur eingeladene");

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "I")
    public int field2512;

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "I")
    public int field2513;

    @OriginalMember(owner = "client!pd", name = "m", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!pd", name = "p", descriptor = "I")
    public static int field2519;

    @OriginalMember(owner = "client!pd", name = "u", descriptor = "I")
    public int field2524;

    @OriginalMember(owner = "client!pd", name = "x", descriptor = "I")
    public static int field2527;

    @OriginalMember(owner = "client!pd", name = "y", descriptor = "I")
    public static int field2528;

    @OriginalMember(owner = "client!pd", name = "z", descriptor = "I")
    public int field2529;

    @OriginalMember(owner = "client!pd", name = "A", descriptor = "I")
    public int field2530;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "Lmf;")
    public class89 field2504;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "Lmf;")
    public class89 field2507;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(JI)V")
    public static final void method857(long arg0, int arg1) {
        field2516++;
        if (arg0 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class134.field3055; var3++) {
            if (class75.field1848[var3] == arg0) {
                class134.field3055--;
                for (int var4 = var3; var4 < class134.field3055; var4++) {
                    class75.field1848[var4] = class75.field1848[var4 + 1];
                    class122.field2824[var4] = class122.field2824[var4 + 1];
                }
                class91.field2161++;
                field2517 = class73.field1691;
                class1.field22.method722(161, (byte) -124);
                class1.field22.method824(arg0, true);
                break;
            }
        }
        if (arg1 != -552) {
            field2520 = -115;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)V")
    public static void method858(byte arg0) {
        field2509 = null;
        field2505 = null;
        field2531 = null;
        field2522 = null;
        field2514 = null;
        field2526 = null;
        field2506 = null;
        field2511 = null;
        if (arg0 != 78) {
            method859(null, null, (byte) -105, null);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lff;Lff;BLff;)V")
    public static final void method859(class42 arg0, class42 arg1, byte arg2, class42 arg3) {
        int var4 = 81 % ((arg2 + 57) / 45);
        class149.field3360 = arg1;
        class13.field289 = arg0;
        field2528++;
        class84.field2024 = arg3;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)I")
    public static final int method860(int arg0, int arg1) {
        int var2 = (arg1 >>> 1 & 0x55555555) + (arg1 & 0x55555555);
        field2519++;
        int var3 = (var2 >>> 2 & 0x33333333) + (var2 & 0x33333333);
        int var4 = (var3 >>> 4) + var3 & arg0;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }
}
