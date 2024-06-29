import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public class class415 {

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "[I")
    public int[] field6109 = new int[257];

    @OriginalMember(owner = "client!vs", name = "h", descriptor = "I")
    public int field6116 = 0;

    @OriginalMember(owner = "client!vs", name = "n", descriptor = "[B")
    public byte[] field6122 = new byte[18002];

    @OriginalMember(owner = "client!vs", name = "d", descriptor = "[[I")
    public int[][] field6112 = new int[6][258];

    @OriginalMember(owner = "client!vs", name = "r", descriptor = "[B")
    public byte[] field6126 = new byte[4096];

    @OriginalMember(owner = "client!vs", name = "q", descriptor = "[B")
    public byte[] field6125 = new byte[256];

    @OriginalMember(owner = "client!vs", name = "E", descriptor = "[I")
    public int[] field6139 = new int[6];

    @OriginalMember(owner = "client!vs", name = "p", descriptor = "[B")
    public byte[] field6124 = new byte[18002];

    @OriginalMember(owner = "client!vs", name = "A", descriptor = "[[I")
    public int[][] field6135 = new int[6][258];

    @OriginalMember(owner = "client!vs", name = "g", descriptor = "I")
    public int field6115 = 0;

    @OriginalMember(owner = "client!vs", name = "m", descriptor = "[Z")
    public boolean[] field6121 = new boolean[16];

    @OriginalMember(owner = "client!vs", name = "y", descriptor = "[[B")
    public byte[][] field6133 = new byte[6][258];

    @OriginalMember(owner = "client!vs", name = "u", descriptor = "[[I")
    public int[][] field6129 = new int[6][258];

    @OriginalMember(owner = "client!vs", name = "K", descriptor = "[I")
    public int[] field6145 = new int[16];

    @OriginalMember(owner = "client!vs", name = "J", descriptor = "[I")
    public int[] field6144 = new int[256];

    @OriginalMember(owner = "client!vs", name = "c", descriptor = "[Z")
    public boolean[] field6111 = new boolean[256];

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "I")
    public static int field6110 = 0;

    @OriginalMember(owner = "client!vs", name = "j", descriptor = "I")
    public static int field6118 = -1;

    @OriginalMember(owner = "client!vs", name = "D", descriptor = "[Ljava/lang/String;")
    public static String[] field6138 = new String[100];

    @OriginalMember(owner = "client!vs", name = "x", descriptor = "B")
    public byte field6132;

    @OriginalMember(owner = "client!vs", name = "e", descriptor = "I")
    public int field6113;

    @OriginalMember(owner = "client!vs", name = "i", descriptor = "I")
    public int field6117;

    @OriginalMember(owner = "client!vs", name = "k", descriptor = "I")
    public int field6119;

    @OriginalMember(owner = "client!vs", name = "l", descriptor = "I")
    public int field6120;

    @OriginalMember(owner = "client!vs", name = "o", descriptor = "I")
    public static int field6123;

    @OriginalMember(owner = "client!vs", name = "s", descriptor = "I")
    public int field6127;

    @OriginalMember(owner = "client!vs", name = "v", descriptor = "I")
    public int field6130;

    @OriginalMember(owner = "client!vs", name = "w", descriptor = "I")
    public int field6131;

    @OriginalMember(owner = "client!vs", name = "z", descriptor = "I")
    public int field6134;

    @OriginalMember(owner = "client!vs", name = "B", descriptor = "I")
    public int field6136;

    @OriginalMember(owner = "client!vs", name = "C", descriptor = "I")
    public int field6137;

    @OriginalMember(owner = "client!vs", name = "F", descriptor = "I")
    public static int field6140;

    @OriginalMember(owner = "client!vs", name = "G", descriptor = "I")
    public int field6141;

    @OriginalMember(owner = "client!vs", name = "H", descriptor = "I")
    public int field6142;

    @OriginalMember(owner = "client!vs", name = "I", descriptor = "I")
    public int field6143;

    @OriginalMember(owner = "client!vs", name = "f", descriptor = "[B")
    public byte[] field6114;

    @OriginalMember(owner = "client!vs", name = "t", descriptor = "[B")
    public byte[] field6128;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(ZZIIIII)V")
    public static final void method2558(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6123++;
        class23.field419 = arg6;
        class311.field4453 = arg2;
        class274.field3960 = arg5;
        class114.field1805 = arg3;
        class294.field4197 = arg4;
        if (!arg0) {
            return;
        }
        if (arg1 && class23.field419 >= 100) {
            class291.field4175 = class311.field4453 * 128 + 64;
            class430.field6262 = class294.field4197 * 128 + 64;
            class207.field2983 = class259.method1646(class291.field4175, class430.field6262, 851701031, class434.field6317) - class114.field1805;
        }
        class403.field5944 = 2;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(III)Z")
    public static final boolean method2559(int arg0, int arg1, int arg2) {
        if (arg0 <= 44) {
            method2559(-32, 117, -23);
        }
        field6140++;
        return (class390.method2452(33, arg2, arg1) | class179.method1270((byte) 49, arg2, arg1) | class478.method2860(0, arg2, arg1)) & class402.method2503(arg2, arg1, -42);
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(I)V")
    public static void method2560(int arg0) {
        field6138 = null;
        if (arg0 != 100) {
            method2559(46, -8, 72);
        }
    }
}
