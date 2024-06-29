import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class91 extends class47 {

    @OriginalMember(owner = "client!nb", name = "E", descriptor = "I")
    public static int field2224 = 0;

    @OriginalMember(owner = "client!nb", name = "K", descriptor = "Loc;")
    public static class99 field2230 = class48.method402((byte) -104, "0(U");

    @OriginalMember(owner = "client!nb", name = "G", descriptor = "Z")
    public static boolean field2226 = true;

    @OriginalMember(owner = "client!nb", name = "C", descriptor = "Loc;")
    public static class99 field2222 = class48.method402((byte) -104, "m");

    @OriginalMember(owner = "client!nb", name = "L", descriptor = "Loc;")
    public static class99 field2231 = class48.method402((byte) -104, "Verbinde mit Server)3)3)3");

    @OriginalMember(owner = "client!nb", name = "u", descriptor = "Lrd;")
    public static class119 field2214 = new class119(4096);

    @OriginalMember(owner = "client!nb", name = "P", descriptor = "Loc;")
    public static class99 field2235 = class48.method402((byte) -104, "Okay");

    @OriginalMember(owner = "client!nb", name = "R", descriptor = "Loc;")
    public static class99 field2237 = class48.method402((byte) -104, "leuchten3:");

    @OriginalMember(owner = "client!nb", name = "T", descriptor = "Loc;")
    private static class99 field2239 = class48.method402((byte) -104, "Invalid username or password)3");

    @OriginalMember(owner = "client!nb", name = "U", descriptor = "Loc;")
    private static class99 field2240 = class48.method402((byte) -104, "Trade)4compete");

    @OriginalMember(owner = "client!nb", name = "Q", descriptor = "Loc;")
    public static class99 field2236 = class48.method402((byte) -104, "Ung-Ultiger Benutzername");

    @OriginalMember(owner = "client!nb", name = "O", descriptor = "Loc;")
    public static class99 field2234 = class48.method402((byte) -104, "m-Ochte mit Ihnen handeln)3");

    @OriginalMember(owner = "client!nb", name = "S", descriptor = "I")
    public static int field2238 = 0;

    @OriginalMember(owner = "client!nb", name = "V", descriptor = "Loc;")
    public static class99 field2241 = field2240;

    @OriginalMember(owner = "client!nb", name = "W", descriptor = "Loc;")
    public static class99 field2242 = field2239;

    @OriginalMember(owner = "client!nb", name = "v", descriptor = "I")
    public int field2215;

    @OriginalMember(owner = "client!nb", name = "y", descriptor = "I")
    public static int field2218;

    @OriginalMember(owner = "client!nb", name = "B", descriptor = "I")
    public int field2221;

    @OriginalMember(owner = "client!nb", name = "D", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!nb", name = "I", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!nb", name = "J", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!nb", name = "N", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!nb", name = "A", descriptor = "Loe;")
    public static class102 field2220;

    @OriginalMember(owner = "client!nb", name = "X", descriptor = "Lvb;")
    public static class140 field2243;

    @OriginalMember(owner = "client!nb", name = "F", descriptor = "[I")
    public int[] field2225;

    @OriginalMember(owner = "client!nb", name = "H", descriptor = "[I")
    public int[] field2227;

    @OriginalMember(owner = "client!nb", name = "M", descriptor = "[I")
    public int[] field2232;

    @OriginalMember(owner = "client!nb", name = "x", descriptor = "[Ldf;")
    public class28[] field2217;

    @OriginalMember(owner = "client!nb", name = "z", descriptor = "[Ldf;")
    public class28[] field2219;

    @OriginalMember(owner = "client!nb", name = "w", descriptor = "[[[B")
    public byte[][][] field2216;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Loc;ILoc;Loc;)V")
    public static final void method754(class99 arg0, int arg1, class99 arg2, class99 arg3) {
        class109.field2707 = arg3;
        class109.field2704 = arg0;
        class109.field2711 = arg2;
        field2229++;
        if (arg1 >= -39) {
            field2237 = null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(I)V")
    public static void method755(int arg0) {
        field2239 = null;
        field2237 = null;
        field2242 = null;
        field2241 = null;
        field2220 = null;
        field2234 = null;
        field2222 = null;
        field2236 = null;
        field2243 = null;
        field2230 = null;
        field2235 = null;
        field2214 = null;
        if (arg0 > 2) {
            field2231 = null;
            field2240 = null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Loc;BLoc;Lpc;)Ldc;")
    public static final class24 method756(class99 arg0, byte arg1, class99 arg2, class105 arg3) {
        int var4 = arg3.method883(arg2, arg1 ^ 0xFFFFFFBD);
        int var5 = arg3.method898(arg0, arg1 + 103, var4);
        if (arg1 != -43) {
            field2230 = null;
        }
        field2223++;
        return class3.method13(arg3, arg1 ^ 0xFFFFFFD5, var4, var5);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIZ)I")
    public static final int method757(int arg0, int arg1, boolean arg2) {
        long var3 = (long) ((arg0 << 16) + arg1);
        if (arg2) {
            method757(58, 32, true);
        }
        field2233++;
        return class42.field1019 != null && class42.field1019.field1138 == var3 ? class79.field1956.field1477 * 99 / (class79.field1956.field1469.length - class42.field1019.field1645) + 1 : 0;
    }
}
