import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class102 extends class166 {

    @OriginalMember(owner = "client!lf", name = "l", descriptor = "Lsg;")
    public static class30 field2067 = class167.method1221((byte) 33, "Verbindung mit Update)2Server)3)3)3");

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "Lsg;")
    private static class30 field2065 = class167.method1221((byte) 33, "Loaded update list");

    @OriginalMember(owner = "client!lf", name = "q", descriptor = "I")
    public static int field2072 = -1;

    @OriginalMember(owner = "client!lf", name = "o", descriptor = "Lsg;")
    public static class30 field2070 = field2065;

    @OriginalMember(owner = "client!lf", name = "p", descriptor = "Llk;")
    public static class232 field2071 = new class232(50);

    @OriginalMember(owner = "client!lf", name = "s", descriptor = "[J")
    public static long[] field2074 = new long[256];

    @OriginalMember(owner = "client!lf", name = "t", descriptor = "I")
    public static int field2075;

    @OriginalMember(owner = "client!lf", name = "k", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!lf", name = "n", descriptor = "I")
    public static int field2069;

    @OriginalMember(owner = "client!lf", name = "r", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!lf", name = "u", descriptor = "[Lt;")
    public static class211[] field2076;

    @OriginalMember(owner = "client!lf", name = "m", descriptor = "[Lbj;")
    public static class44[] field2068;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(B)V")
    public static final void method824(byte arg0) {
        field2066++;
        int var1 = class44.field1041.length;
        if (arg0 != -46) {
            method825((byte) 59);
        }
        for (int var2 = 0; var2 < var1; var2++) {
            if (class44.field1041[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class245.field4376; var4++) {
                    if (class208.field3746[var2] == class148.field2829[var4]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class148.field2829[class245.field4376] = class208.field3746[var2];
                    var3 = class245.field4376++;
                }
                class8 var5 = new class8(class44.field1041[var2]);
                int var6 = 0;
                while (var5.field146 < class44.field1041[var2].length && var6 < 511) {
                    int var7 = var5.method65((byte) 124);
                    int var8 = var3 | var6++ << 6;
                    int var9 = var7 >> 14;
                    int var10 = (var7 & 0x1F98) >> 7;
                    int var11 = (class208.field3746[var2] >> 8) * 64 + var10 - class22.field421;
                    int var12 = var7 & 0x3F;
                    int var13 = (class208.field3746[var2] & 0xFF) * 64 + var12 - class196.field3547;
                    class241 var14 = class2.method14(false, var5.method65((byte) 112));
                    if (class125.field2443[var8] == null && (var14.field4305 & 0x1) > 0 && class109.field2191 == var9 && var11 >= 0 && (var14.field4307 + var11) < 104 && var13 >= 0 && (var14.field4307 + var13) < 104) {
                        class125.field2443[var8] = new class275();
                        class275 var15 = class125.field2443[var8];
                        class4.field55[class221.field3985++] = var8;
                        var15.field1391 = class133.field2617;
                        var15.field4805 = var14;
                        var15.method567((byte) 68, var15.field4805.field4307);
                        var15.field1378 = var15.field4805.field4278;
                        var15.field1362 = var15.field4805.field4288;
                        var15.field1409 = var15.field4805.field4261;
                        var15.field1392 = var15.field4805.field4290;
                        var15.field1385 = var15.field4805.field4296;
                        var15.field1376 = var15.field4805.field4308;
                        if (var15.field1409 == 0) {
                            var15.field1389 = 0;
                        }
                        var15.field1354 = var15.field4805.field4315;
                        var15.field1399 = var15.field4805.field4313;
                        var15.method569((byte) -17, true, var11, var15.method574(true), var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(B)V")
    public static void method825(byte arg0) {
        field2070 = null;
        field2068 = null;
        field2067 = null;
        field2076 = null;
        int var1 = 120 % ((5 - arg0) / 50);
        field2071 = null;
        field2065 = null;
        field2074 = null;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Z)V")
    public static final void method826(boolean arg0) {
        class134.field2621.method1652(-8259);
        class49.field1111.method1652(-8259);
        field2073++;
        if (arg0) {
            field2074 = null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)V")
    public static final void method827(int arg0) {
        int var1 = class169.field3187;
        field2069++;
        int var2 = class208.field3744;
        int var3 = class163.field3039;
        int var4 = 6116423;
        int var5 = class202.field3594;
        class188.method1361(var1, var2, var3, var5, var4);
        class188.method1361(var1 + 1, var2 + 1, var3 - 2, 16, 0);
        class188.method1354(var1 + 1, var2 + 18, var3 - 2, var5 + -19, 0);
        class223.field4000.method1450(class269.field4737, var1 + 3, var2 + 14, var4, -1);
        int var6 = class104.field2095;
        int var7 = class23.field440;
        for (int var8 = 0; var8 < class52.field1165; var8++) {
            int var9 = (class52.field1165 - var8 - 1) * 15 + var2 + 31;
            int var10 = 16777215;
            if (var7 > var1 && (var1 + var3) > var7 && var9 - 13 < var6 && var6 < var9 + 3) {
                var10 = 16776960;
            }
            class223.field4000.method1450(class109.method864(arg0 - 11303, var8), var1 + 3, var9, var10, 0);
        }
        if (arg0 != 11303) {
            method825((byte) 117);
        }
        class270.method1853(class208.field3744, class202.field3594, class163.field3039, class169.field3187, arg0 - 11181);
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field2074[var0] = var1;
        }
        field2075 = 0;
    }
}
