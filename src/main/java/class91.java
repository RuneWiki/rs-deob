import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class91 extends class107 {

    @OriginalMember(owner = "client!ne", name = "F", descriptor = "[Lvd;")
    public static class138[] field2155 = new class138[1000];

    @OriginalMember(owner = "client!ne", name = "t", descriptor = "[I")
    public static int[] field2143 = new int[128];

    @OriginalMember(owner = "client!ne", name = "I", descriptor = "Lvc;")
    public static class137 field2158 = class45.method325("(U3", -46);

    @OriginalMember(owner = "client!ne", name = "P", descriptor = "Lvc;")
    private static class137 field2165 = class45.method325("cyan:", -46);

    @OriginalMember(owner = "client!ne", name = "y", descriptor = "Lvc;")
    public static class137 field2148 = field2165;

    @OriginalMember(owner = "client!ne", name = "T", descriptor = "I")
    public static int field2169 = 0;

    @OriginalMember(owner = "client!ne", name = "C", descriptor = "I")
    public static int field2152 = 0;

    @OriginalMember(owner = "client!ne", name = "L", descriptor = "Lvc;")
    public static class137 field2161 = class45.method325("@whi@ )4 ", -46);

    @OriginalMember(owner = "client!ne", name = "u", descriptor = "I")
    public static int field2144;

    @OriginalMember(owner = "client!ne", name = "v", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!ne", name = "z", descriptor = "I")
    public int field2149;

    @OriginalMember(owner = "client!ne", name = "B", descriptor = "I")
    public static int field2151;

    @OriginalMember(owner = "client!ne", name = "G", descriptor = "I")
    public static int field2156;

    @OriginalMember(owner = "client!ne", name = "M", descriptor = "I")
    public static int field2162;

    @OriginalMember(owner = "client!ne", name = "N", descriptor = "I")
    public static int field2163;

    @OriginalMember(owner = "client!ne", name = "Q", descriptor = "I")
    public static int field2166;

    @OriginalMember(owner = "client!ne", name = "R", descriptor = "I")
    public int field2167;

    @OriginalMember(owner = "client!ne", name = "D", descriptor = "J")
    public static long field2153;

    @OriginalMember(owner = "client!ne", name = "x", descriptor = "Lqe;")
    public static class109 field2147;

    @OriginalMember(owner = "client!ne", name = "U", descriptor = "Lra;")
    public static class111 field2170;

    @OriginalMember(owner = "client!ne", name = "J", descriptor = "Lrb;")
    public static class112 field2159;

    @OriginalMember(owner = "client!ne", name = "w", descriptor = "[I")
    public int[] field2146;

    @OriginalMember(owner = "client!ne", name = "H", descriptor = "[I")
    public static int[] field2157;

    @OriginalMember(owner = "client!ne", name = "K", descriptor = "[I")
    public int[] field2160;

    @OriginalMember(owner = "client!ne", name = "S", descriptor = "[I")
    public int[] field2168;

    @OriginalMember(owner = "client!ne", name = "E", descriptor = "[Lvb;")
    public class136[] field2154;

    @OriginalMember(owner = "client!ne", name = "O", descriptor = "[Lvb;")
    public class136[] field2164;

    @OriginalMember(owner = "client!ne", name = "A", descriptor = "[[[B")
    public byte[][][] field2150;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)Laf;")
    public static final class7 method672(int arg0, int arg1) {
        field2156++;
        class7 var2 = (class7) class36.field791.method758((long) arg1, (byte) -104);
        if (var2 != null) {
            return var2;
        }
        if (arg0 != -1019) {
            method674(93, 40);
        }
        byte[] var3 = class35.field742.method668(1, -214, arg1);
        class7 var4 = new class7();
        if (var3 != null) {
            var4.method39(-101, arg1, new class109(var3));
        }
        var4.method46(false);
        class36.field791.method760(var4, arg0 ^ 0xFFFFFC05, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(B)V")
    public static void method673(byte arg0) {
        field2157 = null;
        field2158 = null;
        field2143 = null;
        field2147 = null;
        field2161 = null;
        field2165 = null;
        field2159 = null;
        if (arg0 != -30) {
            method673((byte) 57);
        }
        field2170 = null;
        field2148 = null;
        field2155 = null;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(II)Lgb;")
    public static final class45 method674(int arg0, int arg1) {
        field2144++;
        class45 var2 = (class45) class45.field1019.method758((long) arg0, (byte) -95);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class12.field253.method668(5, arg1 ^ 0xFFFFFF2B, arg0);
        class45 var4 = new class45();
        if (var3 != null) {
            var4.method321(arg1 - 129, new class109(var3));
        }
        class45.field1019.method760(var4, 0, (long) arg0);
        return arg1 == 1 ? var4 : null;
    }
}
