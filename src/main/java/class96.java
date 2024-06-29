import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class96 extends class137 {

    @OriginalMember(owner = "client!nf", name = "B", descriptor = "Z")
    public static boolean field2269 = false;

    @OriginalMember(owner = "client!nf", name = "R", descriptor = "[J")
    public static long[] field2285 = new long[32];

    @OriginalMember(owner = "client!nf", name = "G", descriptor = "Laf;")
    public static class7 field2274 = class48.method406(40, "logo");

    @OriginalMember(owner = "client!nf", name = "P", descriptor = "Laf;")
    public static class7 field2283 = class48.method406(40, "Abbrechen");

    @OriginalMember(owner = "client!nf", name = "Z", descriptor = "Laf;")
    public static class7 field2293 = class48.method406(40, "au");

    @OriginalMember(owner = "client!nf", name = "L", descriptor = "Laf;")
    public static class7 field2279 = class48.method406(40, ":duelreq:");

    @OriginalMember(owner = "client!nf", name = "ab", descriptor = "[I")
    public static int[] field2294 = new int[100];

    @OriginalMember(owner = "client!nf", name = "db", descriptor = "I")
    public static int field2297 = 0;

    @OriginalMember(owner = "client!nf", name = "eb", descriptor = "I")
    public static int field2298 = -1;

    @OriginalMember(owner = "client!nf", name = "M", descriptor = "I")
    public static int field2280 = 0;

    @OriginalMember(owner = "client!nf", name = "fb", descriptor = "Laf;")
    public static class7 field2299 = class48.method406(40, "Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

    @OriginalMember(owner = "client!nf", name = "z", descriptor = "I")
    public static int field2267;

    @OriginalMember(owner = "client!nf", name = "A", descriptor = "I")
    public int field2268;

    @OriginalMember(owner = "client!nf", name = "C", descriptor = "I")
    public int field2270;

    @OriginalMember(owner = "client!nf", name = "D", descriptor = "I")
    public static int field2271;

    @OriginalMember(owner = "client!nf", name = "F", descriptor = "I")
    public int field2273;

    @OriginalMember(owner = "client!nf", name = "I", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!nf", name = "J", descriptor = "I")
    public int field2277;

    @OriginalMember(owner = "client!nf", name = "O", descriptor = "I")
    public static int field2282;

    @OriginalMember(owner = "client!nf", name = "Q", descriptor = "I")
    public int field2284;

    @OriginalMember(owner = "client!nf", name = "S", descriptor = "I")
    public static int field2286;

    @OriginalMember(owner = "client!nf", name = "T", descriptor = "I")
    public int field2287;

    @OriginalMember(owner = "client!nf", name = "V", descriptor = "I")
    public static int field2289;

    @OriginalMember(owner = "client!nf", name = "W", descriptor = "I")
    public int field2290;

    @OriginalMember(owner = "client!nf", name = "X", descriptor = "I")
    public int field2291;

    @OriginalMember(owner = "client!nf", name = "Y", descriptor = "I")
    public int field2292;

    @OriginalMember(owner = "client!nf", name = "bb", descriptor = "I")
    public int field2295;

    @OriginalMember(owner = "client!nf", name = "N", descriptor = "J")
    public static long field2281;

    @OriginalMember(owner = "client!nf", name = "U", descriptor = "J")
    public static long field2288;

    @OriginalMember(owner = "client!nf", name = "H", descriptor = "Lic;")
    public class59 field2275;

    @OriginalMember(owner = "client!nf", name = "cb", descriptor = "Lic;")
    public class59 field2296;

    @OriginalMember(owner = "client!nf", name = "K", descriptor = "Llf;")
    public class82 field2278;

    @OriginalMember(owner = "client!nf", name = "E", descriptor = "[I")
    public int[] field2272;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ILof;)Z")
    public static final boolean method783(int arg0, class103 arg1) {
        field2286++;
        if (arg1.field2449 == null) {
            return false;
        }
        for (int var2 = 0; var2 < arg1.field2449.length; var2++) {
            int var3 = class109.method866(arg1, var2, -120);
            int var4 = arg1.field2460[var2];
            if (arg1.field2449[var2] == 2) {
                if (var4 <= var3) {
                    return false;
                }
            } else if (arg1.field2449[var2] == 3) {
                if (var4 >= var3) {
                    return false;
                }
            } else if (arg1.field2449[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        if (arg0 != -5) {
            field2297 = 13;
        }
        return true;
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(I)V")
    public final void method784(int arg0) {
        field2276++;
        int var2 = this.field2277;
        class82 var3 = this.field2278.method691(-127);
        if (var3 == null) {
            this.field2272 = null;
            this.field2277 = -1;
            this.field2295 = 0;
            this.field2270 = 0;
            this.field2291 = 0;
        } else {
            this.field2270 = var3.field1899;
            this.field2272 = var3.field1889;
            this.field2295 = var3.field1931 * 128;
            this.field2277 = var3.field1908;
            this.field2291 = var3.field1870;
        }
        if (arg0 != 22773) {
            this.field2287 = -22;
        }
        if (this.field2277 != var2 && this.field2296 != null) {
            class144.field3402.method2(this.field2296);
            this.field2296 = null;
        }
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(II)I")
    public static int method785(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Z[BZ)Ljava/lang/Object;")
    public static final Object method786(boolean arg0, byte[] arg1, boolean arg2) {
        field2267++;
        if (arg1 == null) {
            return null;
        }
        if (arg1.length > 136 && !class7.field167) {
            try {
                class48 var3 = (class48) Class.forName("t").getDeclaredConstructor().newInstance();
                var3.method404(-128, arg1);
                return var3;
            } catch (Throwable var4) {
                class7.field167 = true;
            }
        }
        if (arg2) {
            field2297 = -5;
        }
        return arg0 ? class4.method22((byte) 77, arg1) : arg1;
    }

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "(I)V")
    public static void method787(int arg0) {
        field2293 = null;
        field2279 = null;
        field2283 = null;
        if (arg0 != 0) {
            field2269 = false;
        }
        field2285 = null;
        field2299 = null;
        field2294 = null;
        field2274 = null;
    }
}
