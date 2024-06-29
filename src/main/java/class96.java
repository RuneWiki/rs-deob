import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class96 extends class68 {

    @OriginalMember(owner = "client!pd", name = "A", descriptor = "I")
    public static int field2269 = -1;

    @OriginalMember(owner = "client!pd", name = "D", descriptor = "I")
    public static int field2272 = -1;

    @OriginalMember(owner = "client!pd", name = "G", descriptor = "Lae;")
    public static class6 field2275 = class64.method474(126, "headicons_prayer");

    @OriginalMember(owner = "client!pd", name = "L", descriptor = "Lae;")
    public static class6 field2279 = class64.method474(105, "gr-Un:");

    @OriginalMember(owner = "client!pd", name = "W", descriptor = "Lae;")
    public static class6 field2290 = null;

    @OriginalMember(owner = "client!pd", name = "V", descriptor = "Lae;")
    public static class6 field2289 = class64.method474(108, "Ein kostenloses Spielkonto erstellen)3");

    @OriginalMember(owner = "client!pd", name = "ab", descriptor = "I")
    public static int field2294 = -1;

    @OriginalMember(owner = "client!pd", name = "db", descriptor = "Lae;")
    private static class6 field2297 = class64.method474(114, "flash2:");

    @OriginalMember(owner = "client!pd", name = "C", descriptor = "Lae;")
    public static class6 field2271 = class64.method474(110, "Die Verbindung konnte");

    @OriginalMember(owner = "client!pd", name = "P", descriptor = "Lae;")
    public static class6 field2283 = class64.method474(117, "p12_full");

    @OriginalMember(owner = "client!pd", name = "F", descriptor = "Lae;")
    public static class6 field2274 = class64.method474(124, "@red@");

    @OriginalMember(owner = "client!pd", name = "eb", descriptor = "Lae;")
    public static class6 field2298 = class64.method474(123, "blinken2:");

    @OriginalMember(owner = "client!pd", name = "jb", descriptor = "Lae;")
    public static class6 field2303 = field2297;

    @OriginalMember(owner = "client!pd", name = "ib", descriptor = "Lae;")
    public static class6 field2302 = class64.method474(113, "Wir vermuten ihr Spielkonto wurde gestohlen");

    @OriginalMember(owner = "client!pd", name = "y", descriptor = "I")
    public static int field2267;

    @OriginalMember(owner = "client!pd", name = "E", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "client!pd", name = "H", descriptor = "I")
    public int field2276;

    @OriginalMember(owner = "client!pd", name = "I", descriptor = "I")
    public static int field2277;

    @OriginalMember(owner = "client!pd", name = "M", descriptor = "I")
    public int field2280;

    @OriginalMember(owner = "client!pd", name = "N", descriptor = "I")
    public int field2281;

    @OriginalMember(owner = "client!pd", name = "Q", descriptor = "I")
    public static int field2284;

    @OriginalMember(owner = "client!pd", name = "R", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!pd", name = "S", descriptor = "I")
    public int field2286;

    @OriginalMember(owner = "client!pd", name = "T", descriptor = "I")
    public int field2287;

    @OriginalMember(owner = "client!pd", name = "U", descriptor = "I")
    public int field2288;

    @OriginalMember(owner = "client!pd", name = "X", descriptor = "I")
    public static int field2291;

    @OriginalMember(owner = "client!pd", name = "Y", descriptor = "I")
    public int field2292;

    @OriginalMember(owner = "client!pd", name = "Z", descriptor = "I")
    public int field2293;

    @OriginalMember(owner = "client!pd", name = "cb", descriptor = "I")
    public int field2296;

    @OriginalMember(owner = "client!pd", name = "fb", descriptor = "I")
    public static int field2299;

    @OriginalMember(owner = "client!pd", name = "hb", descriptor = "I")
    public int field2301;

    @OriginalMember(owner = "client!pd", name = "O", descriptor = "Lr;")
    public class107 field2282;

    @OriginalMember(owner = "client!pd", name = "J", descriptor = "Lbf;")
    public static class14 field2278;

    @OriginalMember(owner = "client!pd", name = "gb", descriptor = "Lbf;")
    public static class14 field2300;

    @OriginalMember(owner = "client!pd", name = "B", descriptor = "Lpe;")
    public class97 field2270;

    @OriginalMember(owner = "client!pd", name = "bb", descriptor = "Lpe;")
    public class97 field2295;

    @OriginalMember(owner = "client!pd", name = "z", descriptor = "[I")
    public int[] field2268;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "(I)V", line = 12)
    public final void method799(int arg0) {
        field2267++;
        if (arg0 >= -37) {
            field2303 = null;
        }
        int var2 = this.field2287;
        class107 var3 = this.field2282.method900(0);
        if (var3 == null) {
            this.field2287 = -1;
            this.field2301 = 0;
            this.field2268 = null;
            this.field2280 = 0;
            this.field2293 = 0;
        } else {
            this.field2287 = var3.field2542;
            this.field2268 = var3.field2509;
            this.field2280 = var3.field2554;
            this.field2293 = var3.field2525;
            this.field2301 = var3.field2515 * 128;
        }
        if (this.field2287 != var2 && this.field2270 != null) {
            class4.field35.method175(this.field2270);
            this.field2270 = null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(Z)V", line = 97)
    public static void method800(boolean arg0) {
        field2275 = null;
        field2278 = null;
        field2274 = null;
        field2279 = null;
        if (arg0) {
            field2271 = null;
        }
        field2289 = null;
        field2302 = null;
        field2283 = null;
        field2303 = null;
        field2290 = null;
        field2297 = null;
        field2300 = null;
        field2271 = null;
        field2298 = null;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILvb;IZIBB)V", line = 150)
    public static final void method801(int arg0, class129 arg1, int arg2, boolean arg3, int arg4, byte arg5, byte arg6) {
        field2299++;
        long var7 = (long) ((arg2 << 16) + arg0);
        class34 var9 = (class34) class40.field888.method276((byte) -19, var7);
        if (var9 != null) {
            return;
        }
        class34 var10 = (class34) class8.field171.method276((byte) -19, var7);
        if (var10 != null) {
            return;
        }
        class34 var11 = (class34) class59.field1283.method276((byte) -19, var7);
        if (var11 == null) {
            if (!arg3) {
                class34 var12 = (class34) class30.field731.method276((byte) -19, var7);
                if (var12 != null) {
                    return;
                }
            }
            class34 var13 = new class34();
            var13.field804 = arg6;
            if (arg5 < 65) {
                method800(false);
            }
            var13.field815 = arg4;
            var13.field809 = arg1;
            if (arg3) {
                class40.field888.method269(var7, var13, (byte) -113);
                class51.field1151++;
            } else {
                class56.field1224.method892(var13, 0);
                class59.field1283.method269(var7, var13, (byte) -30);
                class70.field1548++;
            }
        } else if (arg3) {
            var11.method572(16777215);
            class40.field888.method269(var7, var11, (byte) -8);
            class51.field1151++;
            class70.field1548--;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(BLbf;Lae;Lae;)Lva;", line = 228)
    public static final class128 method802(byte arg0, class14 arg1, class6 arg2, class6 arg3) {
        field2277++;
        int var4 = arg1.method158(arg2, (byte) 30);
        if (arg0 != -79) {
            field2269 = -32;
        }
        int var5 = arg1.method138(arg0 ^ 0xFFFFFFD5, var4, arg3);
        return class49.method393(arg1, var5, var4, true);
    }
}
