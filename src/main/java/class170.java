import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class170 {

    @OriginalMember(owner = "client!bf", name = "m", descriptor = "Z")
    public boolean field2425 = true;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "Lct;")
    public static class285 field2416 = new class285(8, -1);

    @OriginalMember(owner = "client!bf", name = "l", descriptor = "I")
    public static int field2424 = 0;

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "I")
    public static int field2420 = 0;

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "Z")
    public static boolean field2422 = false;

    @OriginalMember(owner = "client!bf", name = "p", descriptor = "[I")
    public static int[] field2428 = new int[14];

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "C")
    private char field2413;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
    public static int field2414;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "I")
    public static int field2415;

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
    public static int field2417;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "I")
    public static int field2418;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
    public int field2419;

    @OriginalMember(owner = "client!bf", name = "n", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "Lei;")
    public static class247 field2423;

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "Lui;")
    public static class451 field2421;

    @OriginalMember(owner = "client!bf", name = "q", descriptor = "Lui;")
    public static class451 field2429;

    @OriginalMember(owner = "client!bf", name = "r", descriptor = "Ljava/lang/String;")
    public String field2430;

    @OriginalMember(owner = "client!bf", name = "o", descriptor = "[[[Lke;")
    public static class337[][][] field2427;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lre;I)V", line = 9)
    public final void method1176(class446 arg0, int arg1) {
        if (arg1 != 0) {
            field2427 = null;
        }
        while (true) {
            int var3 = arg0.method2628(49152);
            if (var3 == 0) {
                field2414++;
                return;
            }
            this.method1177(-5, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IILre;)V", line = 38)
    private final void method1177(int arg0, int arg1, class446 arg2) {
        if (arg1 == 1) {
            this.field2413 = class372.method2308(arg2.method2642(true), (byte) -70);
        } else if (arg1 == 2) {
            this.field2419 = arg2.method2604(arg0 + 110);
        } else if (arg1 == 4) {
            this.field2425 = false;
        } else if (arg1 == 5) {
            this.field2430 = arg2.method2582((byte) -116);
        }
        field2426++;
        if (arg0 != -5) {
            field2423 = null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIBI)V", line = 76)
    public static final void method1178(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 >= -86) {
            return;
        }
        field2415++;
        class186 var4 = class275.method1789(arg0, (byte) 123, 9);
        var4.method1285(0);
        var4.field2819 = arg3;
        var4.field2829 = arg1;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)Z", line = 93)
    public final boolean method1179(int arg0) {
        if (arg0 >= -110) {
            this.field2425 = true;
        }
        field2417++;
        return this.field2413 == 's';
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)V", line = 107)
    public static void method1180(byte arg0) {
        field2421 = null;
        field2428 = null;
        field2416 = null;
        field2429 = null;
        field2423 = null;
        field2427 = null;
        if (arg0 <= 10) {
            method1180((byte) 115);
        }
    }
}
