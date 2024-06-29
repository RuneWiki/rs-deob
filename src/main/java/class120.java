import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class120 {

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "Lba;")
    private class12 field2222 = new class12();

    @OriginalMember(owner = "client!nb", name = "u", descriptor = "Lbc;")
    private class14 field2235 = new class14();

    @OriginalMember(owner = "client!nb", name = "t", descriptor = "I")
    private int field2234;

    @OriginalMember(owner = "client!nb", name = "r", descriptor = "I")
    private int field2232;

    @OriginalMember(owner = "client!nb", name = "q", descriptor = "Lmd;")
    private class113 field2231;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "Lkb;")
    public static class93 field2215 = class76.method390("Lade Texturen )2 ", 0);

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "[I")
    public static int[] field2220 = new int[1000];

    @OriginalMember(owner = "client!nb", name = "o", descriptor = "Lkb;")
    public static class93 field2229 = class76.method390("sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1", 0);

    @OriginalMember(owner = "client!nb", name = "s", descriptor = "Lkb;")
    private static class93 field2233 = class76.method390("You need a members account to login to this world)3", 0);

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "Lkb;")
    private static class93 field2218 = class76.method390("To play on this world move to a free area first)3", 0);

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "Lkb;")
    public static class93 field2219 = field2218;

    @OriginalMember(owner = "client!nb", name = "w", descriptor = "Lkb;")
    public static class93 field2237 = field2233;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "I")
    public static int field2221;

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "I")
    public static int field2224;

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "I")
    public static int field2225;

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!nb", name = "m", descriptor = "I")
    public static int field2227;

    @OriginalMember(owner = "client!nb", name = "n", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!nb", name = "p", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!nb", name = "v", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "Ljg;")
    public static class89 field2217;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
    public static final void method675(int arg0) {
        field2227++;
        int[] var1 = new int[class157.field3114];
        int var2 = 0;
        for (int var3 = 0; var3 < class157.field3114; var3++) {
            class166 var5 = class166.method1126(arg0 + 10911, var3);
            if (var5.field3295 >= 0 || var5.field3297 >= 0) {
                var1[var2++] = var3;
            }
        }
        class111.field2011 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            class111.field2011[var4] = var1[var4];
        }
        if (arg0 != -10813) {
            field2229 = null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)V")
    public final void method676(int arg0) {
        while (true) {
            class12 var2 = this.field2235.method82(arg0 ^ 0x7FA2);
            if (var2 == null) {
                field2228++;
                this.field2234 = this.field2232;
                if (arg0 != 30626) {
                    field2220 = null;
                    return;
                }
                return;
            }
            var2.method235(false);
            var2.method60((byte) -93);
        }
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(I)Lsg;")
    public static final class170 method677(int arg0) {
        if (arg0 != 0) {
            return null;
        }
        field2223++;
        try {
            return (class170) Class.forName("ga").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return new class183();
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZLba;J)V")
    public final void method678(boolean arg0, class12 arg1, long arg2) {
        if (!arg0) {
            this.field2235 = null;
        }
        if (this.field2234 == 0) {
            class12 var5 = this.field2235.method82(2048);
            var5.method235(false);
            var5.method60((byte) -93);
            if (this.field2222 == var5) {
                class12 var6 = this.field2235.method82(2048);
                var6.method235(false);
                var6.method60((byte) -93);
            }
        } else {
            this.field2234--;
        }
        this.field2231.method617(0, arg2, arg1);
        field2224++;
        this.field2235.method81(66, arg1);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)V")
    public static void method679(byte arg0) {
        field2233 = null;
        field2218 = null;
        field2237 = null;
        field2217 = null;
        if (arg0 < 14) {
            method675(27);
        }
        field2215 = null;
        field2220 = null;
        field2229 = null;
        field2219 = null;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(JB)Lba;")
    public final class12 method680(long arg0, byte arg1) {
        field2221++;
        class12 var4 = (class12) this.field2231.method616(arg0, -1);
        if (var4 != null) {
            this.field2235.method81(62, var4);
        }
        int var5 = 126 % ((arg1 - 55) / 32);
        return var4;
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(B)Lee;")
    public final class44 method681(byte arg0) {
        if (arg0 >= -58) {
            method679((byte) 96);
        }
        field2230++;
        return this.field2231.method612(12981);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(BJ)V")
    public final void method682(byte arg0, long arg1) {
        if (arg0 > -73) {
            field2217 = null;
        }
        class12 var4 = (class12) this.field2231.method616(arg1, -1);
        if (var4 != null) {
            var4.method235(false);
            var4.method60((byte) -93);
            this.field2234++;
        }
        field2226++;
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(B)Lee;")
    public final class44 method683(byte arg0) {
        if (arg0 < 114) {
            return null;
        } else {
            field2225++;
            return this.field2231.method623((byte) -77);
        }
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(I)V")
    public class120(int arg0) {
        this.field2234 = arg0;
        this.field2232 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2231 = new class113(var2);
    }
}
