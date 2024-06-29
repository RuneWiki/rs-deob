import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class8 {

    @OriginalMember(owner = "client!bh", name = "k", descriptor = "B")
    private byte field180;

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "I")
    public int field175;

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "I")
    public int field177;

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "I")
    public int field178;

    @OriginalMember(owner = "client!bh", name = "q", descriptor = "I")
    public int field186;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "I")
    public int field172;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "I")
    public static int field173 = 0;

    @OriginalMember(owner = "client!bh", name = "n", descriptor = "I")
    public static int field183 = 0;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "[Z")
    public static boolean[] field170 = new boolean[112];

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "I")
    public static int field179 = 0;

    @OriginalMember(owner = "client!bh", name = "o", descriptor = "Ljava/lang/String;")
    public static String field184 = "Please wait...";

    @OriginalMember(owner = "client!bh", name = "l", descriptor = "Z")
    public static boolean field181 = true;

    @OriginalMember(owner = "client!bh", name = "t", descriptor = "Ljava/lang/String;")
    public static String field189 = "K";

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
    public static int field174;

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!bh", name = "p", descriptor = "I")
    public static int field185;

    @OriginalMember(owner = "client!bh", name = "r", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!bh", name = "s", descriptor = "I")
    public static int field188;

    @OriginalMember(owner = "client!bh", name = "m", descriptor = "Z")
    public static boolean field182;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)I")
    public final int method77(int arg0) {
        field185++;
        int var2 = -63 % ((arg0 - 19) / 62);
        return (this.field180 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IZLmk;)V")
    public static final void method78(int arg0, boolean arg1, class109 arg2) {
        field188++;
        if (arg0 != -9) {
            method78(115, false, (class109) null);
        }
        int var3 = arg2.field1689;
        int var4 = (int) arg2.field2209;
        arg2.method952((byte) 98);
        if (arg1) {
            class253.method1716(true, var3);
        }
        class225.method1562(var3, 28557);
        class248 var5 = class281.method1913(var4, (byte) 70);
        if (var5 != null) {
            class111.method776(var5, (byte) 25);
        }
        int var6 = class291.field4776;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class146.method1000(50, class26.field478[var7])) {
                class188.method1330(var7, arg0 - 8293);
            }
        }
        if (class291.field4776 == 1) {
            class41.field633 = false;
            class110.method773(true, class229.field3597, class128.field2059, class159.field2596, class120.field1904);
        } else {
            class110.method773(true, class229.field3597, class128.field2059, class159.field2596, class120.field1904);
            int var8 = class170.field2792.method527(class123.field1958);
            for (int var9 = 0; var9 < class291.field4776; var9++) {
                int var10 = class170.field2792.method527(class292.method2016(var9, arg0 ^ 0xFFFFFFCD));
                if (var10 > var8) {
                    var8 = var10;
                }
            }
            class159.field2596 = var8 + 8;
            class120.field1904 = (class248.field3903 ? 26 : 22) + class291.field4776 * 15;
        }
        if (class68.field1089 != -1) {
            class297.method2035((byte) 108, class68.field1089, 1);
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(BII)Z")
    public static final boolean method79(byte arg0, int arg1, int arg2) {
        if (arg2 == 11) {
            arg2 = 10;
        }
        if (arg0 < 113) {
            return true;
        }
        class172 var3 = class49.method319(arg1, 0);
        field171++;
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        return var3.method1222(arg2, 29109);
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)I")
    public final int method80(int arg0) {
        field174++;
        if (arg0 != 7) {
            field170 = null;
        }
        return this.field180 & 0x7;
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "(I)Ljava/lang/String;")
    public static final String method81(int arg0) {
        String var1 = "";
        String var2 = "www";
        int var3 = -47 / ((arg0 - 29) / 38);
        field187++;
        if (class41.field625 != 0) {
            var2 = "www-wtqa";
        }
        if (class179.field2966 != null) {
            var1 = "/p=" + class179.field2966;
        }
        return "http://" + var2 + ".runescape.com/l=" + class84.field1339 + "/a=" + class215.field3396 + var1 + "/";
    }

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "(I)V")
    public static void method82(int arg0) {
        field189 = null;
        field184 = null;
        if (arg0 == 31582) {
            field170 = null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "()V")
    public class8() {
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Lfj;)V")
    public class8(class274 arg0) {
        this.field180 = arg0.method1830((byte) 109);
        this.field175 = arg0.method1837(252);
        this.field177 = arg0.method1833((byte) -104);
        this.field178 = arg0.method1833((byte) -104);
        this.field186 = arg0.method1833((byte) -104);
        this.field172 = arg0.method1833((byte) -104);
    }
}
