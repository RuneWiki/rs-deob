import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class140 {

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "Z")
    public boolean field2460 = true;

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "I")
    public int field2467;

    @OriginalMember(owner = "client!ch", name = "o", descriptor = "I")
    public int field2473;

    @OriginalMember(owner = "client!ch", name = "r", descriptor = "I")
    public int field2476;

    @OriginalMember(owner = "client!ch", name = "k", descriptor = "I")
    public int field2469;

    @OriginalMember(owner = "client!ch", name = "n", descriptor = "I")
    public int field2472;

    @OriginalMember(owner = "client!ch", name = "p", descriptor = "I")
    public int field2474;

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "[I")
    public static int[] field2462 = new int[4096];

    @OriginalMember(owner = "client!ch", name = "q", descriptor = "Lsf;")
    public static class108 field2475;

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "I")
    public static int field2465;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "I")
    public static int field2459;

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "I")
    public static int field2461;

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "I")
    public static int field2464;

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "I")
    public static int field2466;

    @OriginalMember(owner = "client!ch", name = "l", descriptor = "I")
    public static int field2470;

    @OriginalMember(owner = "client!ch", name = "m", descriptor = "I")
    public static int field2471;

    @OriginalMember(owner = "client!ch", name = "s", descriptor = "I")
    public static int field2477;

    @OriginalMember(owner = "client!ch", name = "j", descriptor = "Li;")
    public static class218 field2468;

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "Z")
    public static boolean field2463;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(BLik;)I", line = 5)
    public static final int method972(byte arg0, class262 arg1) {
        int var2 = 0;
        if (arg1.method1861(class239.field4166, arg0 ^ 0x35)) {
            var2++;
        }
        if (arg0 != 90) {
            return 54;
        }
        field2461++;
        if (arg1.method1861(class266.field4683, -40)) {
            var2++;
        }
        if (arg1.method1861(class213.field3790, 108)) {
            var2++;
        }
        if (arg1.method1861(class109.field1916, 126)) {
            var2++;
        }
        if (arg1.method1861(class96.field1539, 121)) {
            var2++;
        }
        if (arg1.method1861(class5.field65, 103)) {
            var2++;
        }
        if (arg1.method1861(class247.field4270, arg0 ^ 0x2D)) {
            var2++;
        }
        if (arg1.method1861(class184.field3384, -122)) {
            var2++;
        }
        if (arg1.method1861(field2471, arg0 + 18)) {
            var2++;
        }
        if (arg1.method1861(class211.field3771, arg0 - 169)) {
            var2++;
        }
        if (arg1.method1861(class68.field1057, arg0 ^ 0x5A)) {
            var2++;
        }
        if (arg1.method1861(class291.field5085, arg0 ^ 0x30)) {
            var2++;
        }
        if (arg1.method1861(class144.field2544, -60)) {
            var2++;
        }
        if (arg1.method1861(class240.field4174, -100)) {
            var2++;
        }
        if (arg1.method1861(class242.field4197, 116)) {
            var2++;
        }
        if (arg1.method1861(class69.field1063, -79)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILjava/lang/String;)Lsf;", line = 90)
    public static final class108 method973(int arg0, String arg1) {
        field2459++;
        if (arg0 != 255) {
            return (class108) null;
        }
        byte[] var2 = arg1.getBytes();
        int var3 = 0;
        int var4 = var2.length;
        class108 var5 = new class108();
        var5.field1884 = new byte[var4];
        while (var4 > var3) {
            int var6 = var2[var3++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var3 >= var4) {
                    break;
                }
                int var7 = var2[var3++] & 0xFF;
                var5.field1884[var5.field1870++] = (byte) (var6 * 43 + var7 - 1720 - 48);
            } else if (var6 != 0) {
                var5.field1884[var5.field1870++] = (byte) var6;
            }
        }
        var5.method745(0);
        return var5.method756(114);
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field2462[var0] = class105.method723(var0, 6150);
        }
        field2475 = method973(255, "::fps ");
        field2465 = 0;
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(IIIIIIZ)V", line = 227)
    public class140(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field2467 = arg2;
        this.field2473 = arg0;
        this.field2476 = arg1;
        this.field2460 = arg6;
        this.field2469 = arg5;
        this.field2472 = arg4;
        this.field2474 = arg3;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)V", line = 163)
    public static final void method974(int arg0) {
        class138.method951();
        field2470++;
        class106.field1837 = new class41[7];
        class106.field1837[1] = new class225();
        class106.field1837[2] = new class31();
        class106.field1837[3] = new class150();
        if (arg0 == -14316) {
            class106.field1837[4] = new class65();
            class106.field1837[5] = new class195();
            class106.field1837[6] = new class228();
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(B)V", line = 184)
    public static void method975(byte arg0) {
        field2468 = null;
        if (arg0 != -18) {
            method975((byte) -107);
        }
        field2462 = null;
        field2475 = null;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lik;II)Lka;", line = 202)
    public static final class191 method976(class262 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1866((byte) -122, arg2);
        if (arg1 == 28310) {
            field2477++;
            return var3 == null ? null : new class191(var3);
        } else {
            return (class191) null;
        }
    }
}
