import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class151 {

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "I")
    public static int field3743 = 0;

    @OriginalMember(owner = "client!wc", name = "r", descriptor = "Lkd;")
    private static class73 field3748 = class126.method1070((byte) -66, "wave2:");

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "Lkd;")
    public static class73 field3735 = field3748;

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "Lkd;")
    public static class73 field3742 = field3748;

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field3740 = new CRC32();

    @OriginalMember(owner = "client!wc", name = "u", descriptor = "Lkd;")
    public static class73 field3751 = class126.method1070((byte) -66, "<col=80ff00>");

    @OriginalMember(owner = "client!wc", name = "t", descriptor = "Lkd;")
    public static class73 field3750 = class126.method1070((byte) -66, "Spieler kann nicht gefunden werden: ");

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
    public int field3732;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "I")
    public static int field3733;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "I")
    public static int field3736;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "I")
    public static int field3737;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "I")
    public int field3738;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "I")
    public int field3739;

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "I")
    public static int field3741;

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "I")
    public int field3744;

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "I")
    public static int field3745;

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "I")
    public static int field3746;

    @OriginalMember(owner = "client!wc", name = "q", descriptor = "Lbc;")
    public static class11 field3747;

    @OriginalMember(owner = "client!wc", name = "s", descriptor = "Lde;")
    public static class27 field3749;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "Lkd;")
    public class73 field3731;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "Z")
    public boolean field3734;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V")
    public static final void method1216(int arg0) {
        field3733++;
        if (class87.field2198 != arg0 || class74.field1917 != null) {
            return;
        }
        int var1 = class105.field2615;
        if (class50.field1329 && class103.field2570 >= 516 && class42.field1134 >= 160 && class103.field2570 <= 765 && class42.field1134 <= 205) {
            var1 = 0;
        }
        if (!class15.field459) {
            if (var1 == 1 && class129.field3262 > 0) {
                int var12 = class74.field1921[class129.field3262 - 1];
                if (var12 == 24 || var12 == 4 || var12 == 22 || var12 == 38 || var12 == 7 || var12 == 18 || var12 == 34 || var12 == 1 || var12 == 37 || var12 == 9 || var12 == 19 || var12 == 1005) {
                    int var13 = class76.field1946[class129.field3262 - 1];
                    int var14 = class118.field3013[class129.field3262 - 1];
                    class1 var15 = class45.method335(var13, -120);
                    if (class109.method873(class153.method1225(var15, -127), false) || method1218(0, class153.method1225(var15, -126))) {
                        class87.field2198 = 2;
                        class9.field291 = class42.field1134;
                        class115.field2907 = var13;
                        class63.field1663 = var14;
                        class34.field934 = 0;
                        class30.field850 = false;
                        if (var13 >> 16 == class52.field1393) {
                            class87.field2198 = 1;
                        }
                        class73.field1892 = class103.field2570;
                        if (var13 >> 16 == class129.field3246) {
                            class87.field2198 = 3;
                        }
                        return;
                    }
                }
            }
            if (var1 == 1 && (class115.field2904 == 1 || class140.method1138(class129.field3262 - 1, 0)) && class129.field3262 > 2) {
                var1 = 2;
            }
            if (var1 == 1 && class129.field3262 > 0) {
                class115.method983(0, class129.field3262 - 1);
            }
            if (var1 != 2 || class129.field3262 <= 0) {
                return;
            }
            class24.method194((byte) -84);
            return;
        }
        if (var1 != 1) {
            int var2 = class31.field869;
            int var3 = class3.field161;
            if (class50.field1333 == 0) {
                var3 -= 4;
                var2 -= 4;
            }
            if (class50.field1333 == 1) {
                var2 -= 553;
                var3 -= 205;
            }
            if (class50.field1333 == 2) {
                var3 -= 357;
                var2 -= 17;
            }
            if (class39.field1059 - 10 > var2 || var2 > class126.field3183 + class39.field1059 + 10 || class103.field2568 - 10 > var3 || var3 > class103.field2568 + class143.field3556 + 10) {
                if (class50.field1333 == 2) {
                    class132.field3304 = true;
                }
                class15.field459 = false;
                if (class50.field1333 == 1) {
                    class38.field1028 = true;
                }
            }
        }
        if (var1 != 1) {
            return;
        }
        int var4 = class39.field1059;
        int var5 = class103.field2568;
        int var6 = class126.field3183;
        int var7 = class42.field1134;
        int var8 = class103.field2570;
        int var9 = -1;
        if (class50.field1333 == 0) {
            var8 -= 4;
            var7 -= 4;
        }
        if (class50.field1333 == 1) {
            var7 -= 205;
            var8 -= 553;
        }
        if (class50.field1333 == 2) {
            var8 -= 17;
            var7 -= 357;
        }
        for (int var10 = 0; var10 < class129.field3262; var10++) {
            int var11 = var5 + (class129.field3262 - var10 - 1) * 15 + 31;
            if (var4 < var8 && var4 + var6 > var8 && var7 > var11 - 13 && var11 + 3 > var7) {
                var9 = var10;
            }
        }
        if (var9 != -1) {
            class115.method983(0, var9);
        }
        class15.field459 = false;
        if (class50.field1333 == 2) {
            class132.field3304 = true;
        }
        if (class50.field1333 == 1) {
            class38.field1028 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)V")
    public static void method1217(int arg0) {
        field3751 = null;
        if (arg0 != -2) {
            return;
        }
        field3735 = null;
        field3740 = null;
        field3742 = null;
        field3749 = null;
        field3750 = null;
        field3748 = null;
        field3747 = null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)Z")
    public static final boolean method1218(int arg0, int arg1) {
        field3746++;
        if (arg0 == 0) {
            return (arg1 >> 29 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(BI)V")
    public static final void method1219(byte arg0, int arg1) {
        field3737++;
        if (arg1 == -1 || !class80.method690(arg1, arg0 + 76)) {
            return;
        }
        class1[] var2 = class120.field3066[arg1];
        if (arg0 != -77) {
            field3743 = -40;
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class1 var4 = var2[var3];
            if (var4.field102 != null) {
                class57.method490(var4.field102, 0, (byte) 78, null, 0, var4, 0);
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IZ)I")
    public static final int method1220(int arg0, boolean arg1) {
        field3745++;
        int var7 = arg0 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        if (arg1) {
            return -41;
        } else {
            int var5 = var4 | var4 >>> 8;
            int var6 = var5 | var5 >>> 16;
            return var6 + 1;
        }
    }
}
