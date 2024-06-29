import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class145 extends class134 {

    @OriginalMember(owner = "client!hf", name = "L", descriptor = "I")
    public int field2293 = 0;

    @OriginalMember(owner = "client!hf", name = "t", descriptor = "[I")
    public static int[] field2275 = new int[64];

    @OriginalMember(owner = "client!hf", name = "y", descriptor = "I")
    public static int field2280 = 0;

    @OriginalMember(owner = "client!hf", name = "u", descriptor = "[I")
    public static int[] field2276 = new int[8];

    @OriginalMember(owner = "client!hf", name = "m", descriptor = "I")
    public int field2268;

    @OriginalMember(owner = "client!hf", name = "n", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!hf", name = "o", descriptor = "I")
    public int field2270;

    @OriginalMember(owner = "client!hf", name = "p", descriptor = "I")
    public int field2271;

    @OriginalMember(owner = "client!hf", name = "r", descriptor = "I")
    public int field2273;

    @OriginalMember(owner = "client!hf", name = "v", descriptor = "I")
    public int field2277;

    @OriginalMember(owner = "client!hf", name = "w", descriptor = "I")
    public static int field2278;

    @OriginalMember(owner = "client!hf", name = "x", descriptor = "I")
    public int field2279;

    @OriginalMember(owner = "client!hf", name = "A", descriptor = "I")
    public int field2282;

    @OriginalMember(owner = "client!hf", name = "C", descriptor = "I")
    public int field2284;

    @OriginalMember(owner = "client!hf", name = "D", descriptor = "I")
    public int field2285;

    @OriginalMember(owner = "client!hf", name = "F", descriptor = "I")
    public int field2287;

    @OriginalMember(owner = "client!hf", name = "G", descriptor = "I")
    public int field2288;

    @OriginalMember(owner = "client!hf", name = "J", descriptor = "I")
    public static int field2291;

    @OriginalMember(owner = "client!hf", name = "K", descriptor = "I")
    public static int field2292;

    @OriginalMember(owner = "client!hf", name = "H", descriptor = "Lfd;")
    public static class130 field2289;

    @OriginalMember(owner = "client!hf", name = "E", descriptor = "Lwg;")
    public class185 field2286;

    @OriginalMember(owner = "client!hf", name = "I", descriptor = "Lwg;")
    public class185 field2290;

    @OriginalMember(owner = "client!hf", name = "s", descriptor = "Lcl;")
    public class208 field2274;

    @OriginalMember(owner = "client!hf", name = "O", descriptor = "Lfa;")
    public static class273 field2296;

    @OriginalMember(owner = "client!hf", name = "z", descriptor = "Lbl;")
    public class35 field2281;

    @OriginalMember(owner = "client!hf", name = "B", descriptor = "Ltd;")
    public class74 field2283;

    @OriginalMember(owner = "client!hf", name = "N", descriptor = "Lclient;")
    public static client field2295;

    @OriginalMember(owner = "client!hf", name = "q", descriptor = "Z")
    public boolean field2272;

    @OriginalMember(owner = "client!hf", name = "M", descriptor = "[I")
    public int[] field2294;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "(I)V")
    public static void method972(int arg0) {
        field2276 = null;
        field2296 = null;
        field2275 = null;
        if (arg0 <= 106) {
            field2275 = null;
        }
        field2289 = null;
        field2295 = null;
    }

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "(I)V")
    public final void method973(int arg0) {
        field2278++;
        int var2 = this.field2279;
        if (this.field2283 != null) {
            class74 var3 = this.field2283.method488(arg0 - 93);
            if (var3 == null) {
                this.field2271 = 0;
                this.field2273 = 0;
                this.field2279 = -1;
                this.field2294 = null;
                this.field2270 = 0;
                this.field2287 = 0;
            } else {
                this.field2294 = var3.field1100;
                this.field2279 = var3.field1177;
                this.field2271 = var3.field1126 * 128;
                this.field2287 = var3.field1110;
                this.field2270 = var3.field1134;
                this.field2273 = var3.field1135;
            }
        } else if (this.field2281 != null) {
            int var4 = class79.method527(this.field2281, (byte) -104);
            if (var2 != var4) {
                class106 var5 = this.field2281.field442;
                this.field2279 = var4;
                if (var5.field1630 != null) {
                    var5 = var5.method685(~arg0);
                }
                if (var5 == null) {
                    this.field2287 = this.field2271 = 0;
                } else {
                    this.field2271 = var5.field1608 * 128;
                    this.field2287 = var5.field1628;
                }
            }
        } else if (this.field2274 != null) {
            this.field2279 = class74.method484(this.field2274, -11443);
            this.field2271 = this.field2274.field3311 * 128;
            this.field2287 = this.field2274.field3316;
        }
        if (arg0 != 0) {
            this.method973(-127);
        }
        if (this.field2279 != var2 && this.field2290 != null) {
            class71.field1024.method597(this.field2290);
            this.field2290 = null;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)Luh;")
    public static final class106 method974(int arg0, int arg1) {
        field2292++;
        class106 var2 = (class106) class87.field1360.method149((byte) -79, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class292.field4815.method1877(class119.method776(arg1, (byte) 46), class314.method2128(arg1, 103), (byte) 30);
        if (arg0 >= -50) {
            field2289 = null;
        }
        class106 var4 = new class106();
        var4.field1581 = arg1;
        if (var3 != null) {
            var4.method689(58, new class202(var3));
        }
        var4.method692(-1);
        class87.field1360.method152(var4, (long) arg1, true);
        return var4;
    }
}
