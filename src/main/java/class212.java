import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class class212 extends class45 {

    @OriginalMember(owner = "client!dr", name = "v", descriptor = "Ljava/lang/String;")
    public String field2841;

    @OriginalMember(owner = "client!dr", name = "r", descriptor = "I")
    public int field2837;

    @OriginalMember(owner = "client!dr", name = "q", descriptor = "I")
    public int field2836;

    @OriginalMember(owner = "client!dr", name = "s", descriptor = "Ljava/lang/String;")
    public String field2838;

    @OriginalMember(owner = "client!dr", name = "m", descriptor = "I")
    public int field2832;

    @OriginalMember(owner = "client!dr", name = "l", descriptor = "I")
    public int field2831;

    @OriginalMember(owner = "client!dr", name = "k", descriptor = "J")
    public long field2830;

    @OriginalMember(owner = "client!dr", name = "p", descriptor = "Lfq;")
    public static class178 field2835 = new class178(100);

    @OriginalMember(owner = "client!dr", name = "u", descriptor = "[Ljava/lang/String;")
    public static String[] field2840 = new String[100];

    @OriginalMember(owner = "client!dr", name = "t", descriptor = "Lgq;")
    public static class418 field2839 = new class418(64);

    @OriginalMember(owner = "client!dr", name = "y", descriptor = "I")
    public static int field2844 = 0;

    @OriginalMember(owner = "client!dr", name = "n", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!dr", name = "o", descriptor = "I")
    public static int field2834;

    @OriginalMember(owner = "client!dr", name = "w", descriptor = "I")
    public static int field2842;

    @OriginalMember(owner = "client!dr", name = "x", descriptor = "I")
    public static int field2843;

    @OriginalMember(owner = "client!dr", name = "z", descriptor = "I")
    public static int field2845;

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "(I)V")
    public static void method1260(int arg0) {
        if (arg0 == -18763) {
            field2839 = null;
            field2835 = null;
            field2840 = null;
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IB)I")
    public static final int method1261(int arg0, byte arg1) {
        if (arg1 == 35) {
            field2843++;
            return arg0 & 0xFF;
        } else {
            return 84;
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(ZLnj;)V")
    public static final void method1262(boolean arg0, class228 arg1) {
        field2834++;
        if (arg1.field3040.length - arg1.field3029 < 1) {
            return;
        }
        if (arg0) {
            field2840 = null;
        }
        int var2 = arg1.method1348(-95);
        if (var2 < 0 || var2 > 1 || arg1.field3040.length - arg1.field3029 < 2) {
            return;
        }
        int var3 = arg1.method1343(255);
        if ((var3 * 6) != (arg1.field3040.length - arg1.field3029)) {
            return;
        }
        while (true) {
            int var4;
            int var5;
            do {
                do {
                    do {
                        if (arg1.field3029 >= arg1.field3040.length) {
                            return;
                        }
                        var4 = arg1.method1343(255);
                        var5 = arg1.method1344((byte) 121);
                    } while (var4 >= class43.field594.length);
                } while (!class63.field842[var4]);
            } while (class284.method1954(137, var4).field2238 == '1' && (var5 < -1 || var5 > 1));
            class43.field594[var4] = var5;
        }
    }

    @OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIJII)V")
    public class212(String arg0, String arg1, int arg2, int arg3, long arg4, int arg5, int arg6) {
        this.field2841 = arg0;
        this.field2837 = arg5;
        this.field2836 = arg3;
        this.field2838 = arg1;
        this.field2832 = arg2;
        this.field2831 = arg6;
        this.field2830 = arg4;
    }
}
