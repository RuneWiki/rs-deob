import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class181 {

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "[[[I")
    public static int[][][] field3257 = new int[4][13][13];

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "[I")
    public static int[] field3260 = new int[5];

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "Ljd;")
    private static class86 field3259 = class122.method868(" ", true);

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "Ljd;")
    public static class86 field3256 = field3259;

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "I")
    public static int field3262 = 0;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
    public static int field3255;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
    public static int field3258;

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "Lbj;")
    public static class151 field3261;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "Lvg;")
    public static class72 field3254;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
    public static final void method1262(int arg0) {
        class36.field809.method1356(8, true);
        if (arg0 != 13587) {
            field3259 = null;
        }
        class36.field809.method1399((byte) -95, 0L);
        class143.field2720++;
        field3258++;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I[Lwj;B)V")
    public static final void method1263(int arg0, class6[] arg1, byte arg2) {
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class6 var5 = arg1[var3];
            if (var5 != null && var5.field221 == arg0 && (!var5.field217 || !client.method1112(var5))) {
                if (var5.field184 == 0) {
                    if (!var5.field217 && client.method1112(var5) && class229.field4162 != var5) {
                        continue;
                    }
                    method1263(var5.field222, arg1, (byte) 48);
                    if (var5.field216 != null) {
                        method1263(var5.field222, var5.field216, (byte) -74);
                    }
                    class1 var6 = (class1) class1.field15.method1698((long) var5.field222, (byte) -126);
                    if (var6 != null) {
                        class105.method755(-118, var6.field2);
                    }
                }
                if (var5.field184 == 6) {
                    if (var5.field79 != -1 || var5.field142 != -1) {
                        boolean var7 = class118.method845(var5, -1);
                        int var8;
                        if (var7) {
                            var8 = var5.field142;
                        } else {
                            var8 = var5.field79;
                        }
                        if (var8 != -1) {
                            class122 var9 = class133.method952(var8, 127);
                            if (var9 != null) {
                                var5.field88 += class194.field3474;
                                while (var9.field2357[var5.field119] < var5.field88) {
                                    var5.field88 -= var9.field2357[var5.field119];
                                    var5.field119++;
                                    if (var9.field2361.length <= var5.field119) {
                                        var5.field119 -= var9.field2368;
                                        if (var5.field119 < 0 || var9.field2361.length <= var5.field119) {
                                            var5.field119 = 0;
                                        }
                                    }
                                    class62.method441(-29481, var5);
                                }
                            }
                        }
                    }
                    if (var5.field212 != 0 && !var5.field217) {
                        int var10 = var5.field212 >> 16;
                        int var11 = var5.field212 << 16 >> 16;
                        int var12 = class194.field3474 * var11;
                        var5.field110 = var5.field110 + var12 & 0x7FF;
                        int var13 = class194.field3474 * var10;
                        var5.field192 = var5.field192 + var13 & 0x7FF;
                        class62.method441(-29481, var5);
                    }
                }
            }
        }
        int var4 = 82 / ((arg2 + 7) / 35);
        field3255++;
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)V")
    public static void method1264(int arg0) {
        field3261 = null;
        field3256 = null;
        field3259 = null;
        field3257 = null;
        field3260 = null;
        field3254 = null;
        if (arg0 < 84) {
            field3262 = 14;
        }
    }
}
