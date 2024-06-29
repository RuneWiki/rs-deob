import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class60 {

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "[I")
    public int[] field988 = new int[16];

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "[[I")
    public int[][] field987 = new int[6][258];

    @OriginalMember(owner = "client!uh", name = "s", descriptor = "[[I")
    public int[][] field1000 = new int[6][258];

    @OriginalMember(owner = "client!uh", name = "t", descriptor = "[Z")
    public boolean[] field1001 = new boolean[16];

    @OriginalMember(owner = "client!uh", name = "z", descriptor = "[Z")
    public boolean[] field1007 = new boolean[256];

    @OriginalMember(owner = "client!uh", name = "A", descriptor = "[B")
    public byte[] field1008 = new byte[18002];

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "[[B")
    public byte[][] field991 = new byte[6][258];

    @OriginalMember(owner = "client!uh", name = "G", descriptor = "[[I")
    public int[][] field1014 = new int[6][258];

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "[B")
    public byte[] field982 = new byte[18002];

    @OriginalMember(owner = "client!uh", name = "F", descriptor = "I")
    public int field1013 = 0;

    @OriginalMember(owner = "client!uh", name = "q", descriptor = "[B")
    public byte[] field998 = new byte[256];

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "I")
    public int field990 = 0;

    @OriginalMember(owner = "client!uh", name = "p", descriptor = "[I")
    public int[] field997 = new int[6];

    @OriginalMember(owner = "client!uh", name = "J", descriptor = "[I")
    public int[] field1017 = new int[257];

    @OriginalMember(owner = "client!uh", name = "K", descriptor = "[I")
    public int[] field1018 = new int[256];

    @OriginalMember(owner = "client!uh", name = "N", descriptor = "[B")
    public byte[] field1021 = new byte[4096];

    @OriginalMember(owner = "client!uh", name = "n", descriptor = "Lhh;")
    public static class163 field995 = class137.method1065("::errortest", 17);

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "Lhh;")
    private static class163 field983 = class137.method1065("Take", 17);

    @OriginalMember(owner = "client!uh", name = "v", descriptor = "Lhh;")
    public static class163 field1003 = field983;

    @OriginalMember(owner = "client!uh", name = "l", descriptor = "[Lhh;")
    public static class163[] field993 = new class163[500];

    @OriginalMember(owner = "client!uh", name = "I", descriptor = "Lhh;")
    private static class163 field1016 = class137.method1065("Examine", 17);

    @OriginalMember(owner = "client!uh", name = "w", descriptor = "Lhh;")
    public static class163 field1004 = field1016;

    @OriginalMember(owner = "client!uh", name = "y", descriptor = "B")
    public byte field1006;

    @OriginalMember(owner = "client!uh", name = "u", descriptor = "I")
    public int field1002;

    @OriginalMember(owner = "client!uh", name = "x", descriptor = "I")
    public int field1005;

    @OriginalMember(owner = "client!uh", name = "B", descriptor = "I")
    public int field1009;

    @OriginalMember(owner = "client!uh", name = "C", descriptor = "I")
    public static int field1010;

    @OriginalMember(owner = "client!uh", name = "D", descriptor = "I")
    public int field1011;

    @OriginalMember(owner = "client!uh", name = "E", descriptor = "I")
    public int field1012;

    @OriginalMember(owner = "client!uh", name = "H", descriptor = "I")
    public int field1015;

    @OriginalMember(owner = "client!uh", name = "L", descriptor = "I")
    public int field1019;

    @OriginalMember(owner = "client!uh", name = "O", descriptor = "I")
    public int field1022;

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "I")
    public int field984;

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "I")
    public int field985;

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "I")
    public int field986;

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "I")
    public int field989;

    @OriginalMember(owner = "client!uh", name = "o", descriptor = "I")
    public int field996;

    @OriginalMember(owner = "client!uh", name = "r", descriptor = "I")
    public static int field999;

    @OriginalMember(owner = "client!uh", name = "k", descriptor = "[B")
    public byte[] field992;

    @OriginalMember(owner = "client!uh", name = "m", descriptor = "[B")
    public byte[] field994;

    @OriginalMember(owner = "client!uh", name = "M", descriptor = "[I")
    public static int[] field1020;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V")
    public static void method411(int arg0) {
        field1003 = null;
        field1020 = null;
        field983 = null;
        field995 = null;
        field1016 = null;
        field993 = null;
        if (arg0 == 258) {
            field1004 = null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)Llb;")
    public static final class36 method412(int arg0, int arg1) {
        field999++;
        class36 var2 = (class36) class89.field1639.method114((long) arg1, 0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class159.field2922.method973(4, true, arg1);
        class36 var4 = new class36();
        if (var3 != null) {
            var4.method262(-9010, new class81(var3), arg1);
        }
        int var5 = 63 / ((arg0 + 25) / 50);
        class89.field1639.method117(var4, false, (long) arg1);
        return var4;
    }
}
