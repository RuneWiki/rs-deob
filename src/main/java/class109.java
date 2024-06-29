import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class109 extends class34 {

    @OriginalMember(owner = "client!fi", name = "r", descriptor = "[Lca;")
    public class264[] field2189 = new class264[5];

    @OriginalMember(owner = "client!fi", name = "w", descriptor = "[I")
    public int[] field2194 = new int[5];

    @OriginalMember(owner = "client!fi", name = "B", descriptor = "I")
    public int field2199 = 0;

    @OriginalMember(owner = "client!fi", name = "S", descriptor = "I")
    public int field2215;

    @OriginalMember(owner = "client!fi", name = "L", descriptor = "I")
    public int field2208;

    @OriginalMember(owner = "client!fi", name = "v", descriptor = "I")
    public int field2193;

    @OriginalMember(owner = "client!fi", name = "y", descriptor = "I")
    public int field2196;

    @OriginalMember(owner = "client!fi", name = "u", descriptor = "I")
    public static int field2192 = 0;

    @OriginalMember(owner = "client!fi", name = "n", descriptor = "Lcc;")
    public static class209 field2185 = class95.method669(122, "::clientjs5drop");

    @OriginalMember(owner = "client!fi", name = "F", descriptor = "Lcc;")
    public static class209 field2202 = class95.method669(100, "compass");

    @OriginalMember(owner = "client!fi", name = "x", descriptor = "Lcc;")
    public static class209 field2195 = class95.method669(122, "; Max)2Age=");

    @OriginalMember(owner = "client!fi", name = "O", descriptor = "Lcc;")
    public static class209 field2211 = class95.method669(110, "b12_full");

    @OriginalMember(owner = "client!fi", name = "K", descriptor = "Lcc;")
    public static class209 field2207 = class95.method669(82, ")2");

    @OriginalMember(owner = "client!fi", name = "W", descriptor = "B")
    public byte field2219;

    @OriginalMember(owner = "client!fi", name = "o", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!fi", name = "q", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!fi", name = "t", descriptor = "I")
    public int field2191;

    @OriginalMember(owner = "client!fi", name = "z", descriptor = "I")
    public int field2197;

    @OriginalMember(owner = "client!fi", name = "G", descriptor = "I")
    public int field2203;

    @OriginalMember(owner = "client!fi", name = "H", descriptor = "I")
    public int field2204;

    @OriginalMember(owner = "client!fi", name = "M", descriptor = "I")
    public int field2209;

    @OriginalMember(owner = "client!fi", name = "N", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!fi", name = "P", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!fi", name = "R", descriptor = "Lke;")
    public class107 field2214;

    @OriginalMember(owner = "client!fi", name = "T", descriptor = "Lfi;")
    public class109 field2216;

    @OriginalMember(owner = "client!fi", name = "V", descriptor = "Led;")
    public class181 field2218;

    @OriginalMember(owner = "client!fi", name = "Q", descriptor = "Lma;")
    public class187 field2213;

    @OriginalMember(owner = "client!fi", name = "A", descriptor = "Lwc;")
    public class230 field2198;

    @OriginalMember(owner = "client!fi", name = "I", descriptor = "Lsc;")
    public class249 field2205;

    @OriginalMember(owner = "client!fi", name = "E", descriptor = "Ljk;")
    public class253 field2201;

    @OriginalMember(owner = "client!fi", name = "p", descriptor = "Lji;")
    public static class42 field2187;

    @OriginalMember(owner = "client!fi", name = "U", descriptor = "Li;")
    public class56 field2217;

    @OriginalMember(owner = "client!fi", name = "s", descriptor = "Z")
    public boolean field2190;

    @OriginalMember(owner = "client!fi", name = "D", descriptor = "Z")
    public boolean field2200;

    @OriginalMember(owner = "client!fi", name = "J", descriptor = "Z")
    public boolean field2206;

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(III)V")
    public class109(int arg0, int arg1, int arg2) {
        this.field2215 = arg2;
        this.field2193 = this.field2208 = arg0;
        this.field2196 = arg1;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIILji;)V")
    public static final void method790(int arg0, int arg1, int arg2, class42 arg3) {
        field2212++;
        if (class207.field3691 != null || class244.field4418 || arg3 == null || class63.method470(arg3, -19257) == null) {
            return;
        }
        class207.field3691 = arg3;
        if (arg2 != 255) {
            method792(0.26303726650139525D, -91);
        }
        class178.field3242 = class63.method470(arg3, -19257);
        class246.field4457 = false;
        class218.field3925 = arg0;
        class161.field2924 = 0;
        class93.field1845 = arg1;
    }

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "(I)V")
    public static void method791(int arg0) {
        field2185 = null;
        field2187 = null;
        field2195 = null;
        field2211 = null;
        if (arg0 <= 49) {
            field2207 = null;
        }
        field2202 = null;
        field2207 = null;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(DI)V")
    public static final void method792(double arg0, int arg1) {
        if (class99.field1926 != arg0) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
                class205.field3661[var3] = var4 > 255 ? 255 : var4;
            }
            class99.field1926 = arg0;
        }
        if (arg1 < -1) {
            field2188++;
        }
    }

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "(I)V")
    public static final void method793(int arg0) {
        if (arg0 == 0) {
            class162.field2933.method665(1);
            field2186++;
        }
    }
}
