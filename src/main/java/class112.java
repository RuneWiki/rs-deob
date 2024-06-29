import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class112 extends class89 {

    @OriginalMember(owner = "client!kd", name = "s", descriptor = "I")
    public int field2098 = -1;

    @OriginalMember(owner = "client!kd", name = "q", descriptor = "I")
    public int field2096 = 0;

    @OriginalMember(owner = "client!kd", name = "m", descriptor = "[I")
    public static int[] field2092 = new int[4096];

    @OriginalMember(owner = "client!kd", name = "B", descriptor = "Lqe;")
    private static class179 field2107;

    @OriginalMember(owner = "client!kd", name = "A", descriptor = "Lqe;")
    public static class179 field2106;

    @OriginalMember(owner = "client!kd", name = "E", descriptor = "Lqe;")
    private static class179 field2110;

    @OriginalMember(owner = "client!kd", name = "I", descriptor = "Lqe;")
    public static class179 field2114;

    @OriginalMember(owner = "client!kd", name = "C", descriptor = "Z")
    public static boolean field2108;

    @OriginalMember(owner = "client!kd", name = "D", descriptor = "Lqe;")
    public static class179 field2109;

    @OriginalMember(owner = "client!kd", name = "F", descriptor = "Lqe;")
    public static class179 field2111;

    @OriginalMember(owner = "client!kd", name = "K", descriptor = "I")
    public static int field2116;

    @OriginalMember(owner = "client!kd", name = "H", descriptor = "Lqe;")
    public static class179 field2113;

    @OriginalMember(owner = "client!kd", name = "n", descriptor = "I")
    public int field2093;

    @OriginalMember(owner = "client!kd", name = "o", descriptor = "I")
    public int field2094;

    @OriginalMember(owner = "client!kd", name = "p", descriptor = "I")
    public int field2095;

    @OriginalMember(owner = "client!kd", name = "r", descriptor = "I")
    public int field2097;

    @OriginalMember(owner = "client!kd", name = "t", descriptor = "I")
    public int field2099;

    @OriginalMember(owner = "client!kd", name = "u", descriptor = "I")
    public static int field2100;

    @OriginalMember(owner = "client!kd", name = "w", descriptor = "I")
    public int field2102;

    @OriginalMember(owner = "client!kd", name = "x", descriptor = "I")
    public int field2103;

    @OriginalMember(owner = "client!kd", name = "y", descriptor = "I")
    public int field2104;

    @OriginalMember(owner = "client!kd", name = "z", descriptor = "I")
    public static int field2105;

    @OriginalMember(owner = "client!kd", name = "G", descriptor = "I")
    public int field2112;

    @OriginalMember(owner = "client!kd", name = "J", descriptor = "I")
    public int field2115;

    @OriginalMember(owner = "client!kd", name = "L", descriptor = "I")
    public static int field2117;

    @OriginalMember(owner = "client!kd", name = "v", descriptor = "Lee;")
    public static class49 field2101;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZI)I")
    public static final int method723(boolean arg0, int arg1) {
        if (arg0) {
            field2105++;
            return arg1 & 0x7F;
        } else {
            return -81;
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)V")
    public static void method724(int arg0) {
        if (arg0 <= 64) {
            return;
        }
        field2092 = null;
        field2109 = null;
        field2110 = null;
        field2114 = null;
        field2107 = null;
        field2111 = null;
        field2101 = null;
        field2106 = null;
        field2113 = null;
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field2092[var0] = class130.method828(918232524, var0);
        }
        field2107 = class206.method1380("go back to the main RuneScape webpage", (byte) -126);
        field2106 = class206.method1380("(R", (byte) -43);
        field2110 = class206.method1380("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ", (byte) -128);
        field2114 = class206.method1380("welle:", (byte) 66);
        field2108 = false;
        field2109 = class206.method1380("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3", (byte) -126);
        field2111 = field2107;
        field2116 = 0;
        field2113 = field2110;
    }
}
