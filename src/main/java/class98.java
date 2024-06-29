import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class98 extends class146 {

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "Lec;")
    private static class32 field2256 = class73.method594("go back to the main RuneScape webpage", true);

    @OriginalMember(owner = "client!oa", name = "N", descriptor = "[I")
    public static int[] field2268 = new int[] { 45, 23, 50, 29, 44, 48, 16, 6 };

    @OriginalMember(owner = "client!oa", name = "V", descriptor = "Lec;")
    public static class32 field2276 = class73.method594("Wordpack geladen)3", true);

    @OriginalMember(owner = "client!oa", name = "K", descriptor = "I")
    public static int field2265 = 0;

    @OriginalMember(owner = "client!oa", name = "R", descriptor = "I")
    public static int field2272 = 0;

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "[I")
    public static int[] field2266 = new int[] { 1, 1, 1, 1 };

    @OriginalMember(owner = "client!oa", name = "Y", descriptor = "Lec;")
    public static class32 field2279 = field2256;

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "I")
    public int field2246;

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "I")
    public int field2250;

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "I")
    public int field2251;

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "I")
    public int field2253;

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "I")
    public int field2257;

    @OriginalMember(owner = "client!oa", name = "D", descriptor = "I")
    public int field2258;

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "I")
    public static int field2260;

    @OriginalMember(owner = "client!oa", name = "H", descriptor = "I")
    public int field2262;

    @OriginalMember(owner = "client!oa", name = "I", descriptor = "I")
    public static int field2263;

    @OriginalMember(owner = "client!oa", name = "M", descriptor = "I")
    public static int field2267;

    @OriginalMember(owner = "client!oa", name = "Q", descriptor = "I")
    public int field2271;

    @OriginalMember(owner = "client!oa", name = "T", descriptor = "I")
    public static int field2274;

    @OriginalMember(owner = "client!oa", name = "W", descriptor = "I")
    public int field2277;

    @OriginalMember(owner = "client!oa", name = "X", descriptor = "I")
    public int field2278;

    @OriginalMember(owner = "client!oa", name = "G", descriptor = "J")
    public static long field2261;

    @OriginalMember(owner = "client!oa", name = "O", descriptor = "J")
    public static long field2269;

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "Lea;")
    public static class30 field2259;

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "Lga;")
    public static class44 field2248;

    @OriginalMember(owner = "client!oa", name = "P", descriptor = "Lga;")
    public static class44 field2270;

    @OriginalMember(owner = "client!oa", name = "J", descriptor = "Lhb;")
    public static class51 field2264;

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "Lhd;")
    public class53 field2252;

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "Ln;")
    public class90 field2249;

    @OriginalMember(owner = "client!oa", name = "S", descriptor = "Ln;")
    public class90 field2273;

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "[I")
    public int[] field2247;

    @OriginalMember(owner = "client!oa", name = "U", descriptor = "[I")
    public static int[] field2275;

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "[Lf;")
    public static class36[] field2255;

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "[Lhb;")
    public static class51[] field2254;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lea;I)V")
    public static final void method766(class30 arg0, int arg1) {
        field2274++;
        class48.field1134 = arg0;
        if (arg1 >= -96) {
            method766(null, -34);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lwf;")
    public static final class159 method767(Throwable arg0, String arg1) {
        field2267++;
        class159 var2;
        if (arg0 instanceof class159) {
            var2 = (class159) arg0;
            var2.field3645 = var2.field3645 + ' ' + arg1;
        } else {
            var2 = new class159(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V")
    public static void method768(boolean arg0) {
        field2248 = null;
        field2256 = null;
        field2268 = null;
        field2276 = null;
        field2259 = null;
        field2270 = null;
        field2275 = null;
        field2254 = null;
        field2266 = null;
        field2279 = null;
        field2264 = null;
        field2255 = null;
        if (!arg0) {
            method770(true, 48);
        }
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)V")
    public final void method769(int arg0) {
        field2263++;
        int var2 = this.field2277;
        class53 var3 = this.field2252.method423((byte) -17);
        if (arg0 != 13492) {
            return;
        }
        if (var3 == null) {
            this.field2277 = -1;
            this.field2247 = null;
            this.field2246 = 0;
            this.field2262 = 0;
            this.field2251 = 0;
        } else {
            this.field2251 = var3.field1251;
            this.field2246 = var3.field1260;
            this.field2277 = var3.field1257;
            this.field2247 = var3.field1219;
            this.field2262 = var3.field1241 * 128;
        }
        if (this.field2277 != var2 && this.field2249 != null) {
            class37.field882.method909(this.field2249);
            this.field2249 = null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZI)I")
    public static final int method770(boolean arg0, int arg1) {
        if (!arg0) {
            field2264 = null;
        }
        field2260++;
        return arg1 >> 11 & 0x3F;
    }
}
