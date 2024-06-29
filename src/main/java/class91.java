import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public abstract class class91 {

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "Lmb;")
    private static class84 field2266 = class79.method672(true, " ");

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "Lmb;")
    public static class84 field2267 = class79.method672(true, "und die Schaltfl-=che (WSpielkonto erstellen(W am");

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "I")
    public static int field2275 = 0;

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "Lmb;")
    private static class84 field2278 = class79.method672(true, "Accept challenge");

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
    public static int field2268 = 0;

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "Lmb;")
    public static class84 field2272 = field2278;

    @OriginalMember(owner = "client!nc", name = "o", descriptor = "Lmb;")
    public static class84 field2280 = field2266;

    @OriginalMember(owner = "client!nc", name = "p", descriptor = "Lca;")
    public static class16 field2281 = new class16();

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
    public static int field2270;

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
    public static int field2271;

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "I")
    public static int field2274;

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
    public static int field2277;

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
    public static int field2279;

    @OriginalMember(owner = "client!nc", name = "q", descriptor = "I")
    public static int field2282;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZLsc;)V")
    public static final void method773(boolean arg0, class121 arg1) {
        field2269++;
        short var2 = 256;
        for (int var3 = 0; var3 < class46.field995.length; var3++) {
            class46.field995[var3] = 0;
        }
        int var4 = 0;
        if (arg0) {
            field2267 = null;
        }
        while (var4 < 5000) {
            int var16 = (int) ((double) var2 * Math.random() * 128.0D);
            class46.field995[var16] = (int) (Math.random() * 256.0D);
            var4++;
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var12 = 1; var12 < var2 - 1; var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = var14 + (var12 << 7);
                    class96.field2386[var15] = (class46.field995[var15 - 1] + class46.field995[var15 + 1] + class46.field995[var15 - 128] + class46.field995[var15 - -128]) / 4;
                }
            }
            int[] var13 = class46.field995;
            class46.field995 = class96.field2386;
            class96.field2386 = var13;
        }
        if (arg1 == null) {
            return;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < arg1.field2898; var7++) {
            for (int var8 = 0; var8 < arg1.field2904; var8++) {
                if (arg1.field2903[var6++] != 0) {
                    int var9 = var7 + arg1.field2899 + 16;
                    int var10 = arg1.field2900 + var8 + 16;
                    int var11 = var10 + (var9 << 7);
                    class46.field995[var11] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Z)V")
    public abstract void method25(boolean arg0);

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(III)I")
    public abstract int method26(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V")
    public static final void method774(int arg0) {
        if (arg0 == 1) {
            System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german]");
            System.exit(1);
            field2270++;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V")
    public static void method775(byte arg0) {
        field2266 = null;
        field2280 = null;
        field2278 = null;
        field2267 = null;
        field2281 = null;
        field2272 = null;
        int var1 = -37 % ((arg0 + 29) / 48);
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(B)V")
    public abstract void method27(byte arg0);

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lmb;ZLmb;Lsd;)Lsc;")
    public static final class121 method776(class84 arg0, boolean arg1, class84 arg2, class122 arg3) {
        if (arg1) {
            field2267 = null;
        }
        field2274++;
        int var4 = arg3.method997(49, arg2);
        int var5 = arg3.method1004(false, arg0, var4);
        return class16.method106(arg3, -8265, var5, var4);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lsd;Lsd;B)V")
    public static final void method777(class122 arg0, class122 arg1, byte arg2) {
        class88.field2192 = arg1;
        if (arg2 == 74) {
            class103.field2511 = arg0;
            field2271++;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IB)Z")
    public static final boolean method778(int arg0, byte arg1) {
        field2282++;
        if (arg1 != -88) {
            field2267 = null;
        }
        return (arg0 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)Z")
    public static final boolean method779(int arg0, int arg1) {
        field2279++;
        if (arg1 != 28522) {
            field2278 = null;
        }
        return (arg0 >> 29 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILia;)I")
    public static final int method780(int arg0, class57 arg1) {
        if (arg0 != -150310624) {
            method776(null, true, null, null);
        }
        field2277++;
        class19 var2 = (class19) class50.field1071.method959(true, ((long) arg1.field1369 << 32) + (long) arg1.field1425);
        return var2 == null ? arg1.field1395 : var2.field405;
    }
}
