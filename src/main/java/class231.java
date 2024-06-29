import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class231 extends class51 {

    @OriginalMember(owner = "client!gi", name = "t", descriptor = "[Lv;")
    public static class80[] field3696 = new class80[14];

    @OriginalMember(owner = "client!gi", name = "p", descriptor = "[I")
    public static int[] field3692 = new int[4096];

    @OriginalMember(owner = "client!gi", name = "u", descriptor = "I")
    public static int field3697;

    @OriginalMember(owner = "client!gi", name = "w", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!gi", name = "r", descriptor = "B")
    public static byte field3694;

    @OriginalMember(owner = "client!gi", name = "o", descriptor = "I")
    public static int field3691;

    @OriginalMember(owner = "client!gi", name = "q", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!gi", name = "s", descriptor = "I")
    public static int field3695;

    @OriginalMember(owner = "client!gi", name = "v", descriptor = "I")
    public static int field3698;

    @OriginalMember(owner = "client!gi", name = "y", descriptor = "I")
    public static int field3701;

    @OriginalMember(owner = "client!gi", name = "x", descriptor = "[Z")
    public static boolean[] field3700;

    @OriginalMember(owner = "client!gi", name = "z", descriptor = "[[[B")
    public static byte[][][] field3702;

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "(I)V", line = 5)
    public static void method1665(int arg0) {
        field3696 = null;
        field3702 = (byte[][][]) null;
        if (arg0 != -16651) {
            method1665(79);
        }
        field3700 = null;
        field3692 = null;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(BII)V", line = 46)
    public static final void method1666(byte arg0, int arg1, int arg2) {
        class179 var3 = class319.method2220(arg2, (byte) -38, 12);
        if (arg0 <= 97) {
            method1666((byte) -63, -123, -46);
        }
        field3693++;
        var3.method1242((byte) 98);
        var3.field2897 = arg1;
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field3692[var0] = class168.method1157(30, var0);
        }
        field3697 = 100;
        field3699 = 0;
    }
}
