import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class95 {

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "Loc;")
    public static class151 field1769 = class137.method873(2, "titlebox");

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "Loc;")
    public static class151 field1770 = null;

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "I")
    public static int field1771 = -1;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "Loc;")
    public static class151 field1765 = class137.method873(2, " loggt sich ein)3");

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "[Ln;")
    public static class138[] field1768 = new class138[4];

    @OriginalMember(owner = "client!ii", name = "m", descriptor = "[Lq;")
    public static class168[] field1777 = new class168[500];

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
    public static int field1766;

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!ii", name = "j", descriptor = "I")
    public static int field1774;

    @OriginalMember(owner = "client!ii", name = "k", descriptor = "I")
    public static int field1775;

    @OriginalMember(owner = "client!ii", name = "l", descriptor = "[[[Lgg;")
    public static class72[][][] field1776;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Z)V")
    public static void method602(boolean arg0) {
        field1768 = null;
        field1765 = null;
        field1769 = null;
        field1777 = null;
        field1776 = null;
        field1770 = null;
        if (arg0) {
            method602(false);
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IB[Lwd;)V")
    public static final void method603(int arg0, byte arg1, class232[] arg2) {
        if (arg1 != 18) {
            method604(null, -85, null, null);
        }
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class232 var4 = arg2[var3];
            if (var4 != null && var4.field4156 == arg0 && (!var4.field4237 || !class16.method133(11804, var4))) {
                if (var4.field4173 == 0) {
                    if (!var4.field4237 && class16.method133(11804, var4) && class231.field4116 != var4) {
                        continue;
                    }
                    method603(var4.field4261, (byte) 18, arg2);
                    if (var4.field4239 != null) {
                        method603(var4.field4261, (byte) 18, var4.field4239);
                    }
                    class147 var5 = (class147) class227.field3961.method1538((long) var4.field4261, (byte) 127);
                    if (var5 != null) {
                        class175.method1121(var5.field2631, (byte) -16);
                    }
                }
                if (var4.field4173 == 6) {
                    if (var4.field4270 != -1 || var4.field4212 != -1) {
                        boolean var6 = class219.method1368(2, var4);
                        int var7;
                        if (var6) {
                            var7 = var4.field4212;
                        } else {
                            var7 = var4.field4270;
                        }
                        if (var7 != -1) {
                            class115 var8 = class197.method1233(50, var7);
                            if (var8 != null) {
                                var4.field4171 += class181.field3273;
                                while (var4.field4171 > var8.field2051[var4.field4150]) {
                                    var4.field4171 -= var8.field2051[var4.field4150];
                                    var4.field4150++;
                                    if (var8.field2056.length <= var4.field4150) {
                                        var4.field4150 -= var8.field2055;
                                        if (var4.field4150 < 0 || var8.field2056.length <= var4.field4150) {
                                            var4.field4150 = 0;
                                        }
                                    }
                                    class27.method208(true, var4);
                                }
                            }
                        }
                    }
                    if (var4.field4138 != 0 && !var4.field4237) {
                        int var9 = var4.field4138 >> 16;
                        int var10 = class181.field3273 * var9;
                        int var11 = var4.field4138 << 16 >> 16;
                        var4.field4251 = var4.field4251 + var10 & 0x7FF;
                        int var12 = class181.field3273 * var11;
                        var4.field4269 = var4.field4269 + var12 & 0x7FF;
                        class27.method208(true, var4);
                    }
                }
            }
        }
        field1773++;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Loc;ILoc;Lsd;)[Lcg;")
    public static final class30[] method604(class151 arg0, int arg1, class151 arg2, class192 arg3) {
        field1772++;
        int var4 = arg3.method1198(25128, arg2);
        int var5 = arg3.method1202(arg0, var4, 126);
        int var6 = 15 % ((-arg1 - 42) / 56);
        return class45.method321((byte) -117, arg3, var5, var4);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)I")
    public static final int method605(int arg0) {
        if (arg0 != 0) {
            method604(null, -119, null, null);
        }
        field1766++;
        return 6;
    }
}
