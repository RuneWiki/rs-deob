import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public class class49 {

    @OriginalMember(owner = "client!ip", name = "k", descriptor = "Lhc;")
    public static class368 field630 = new class368("slide:", "", "", "");

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "I")
    public int field620;

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "I")
    public static int field621;

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "I")
    public static int field622;

    @OriginalMember(owner = "client!ip", name = "d", descriptor = "I")
    public int field623;

    @OriginalMember(owner = "client!ip", name = "e", descriptor = "I")
    public static int field624;

    @OriginalMember(owner = "client!ip", name = "f", descriptor = "I")
    public int field625;

    @OriginalMember(owner = "client!ip", name = "g", descriptor = "I")
    public int field626;

    @OriginalMember(owner = "client!ip", name = "h", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!ip", name = "i", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!ip", name = "l", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!ip", name = "m", descriptor = "I")
    public static int field632;

    @OriginalMember(owner = "client!ip", name = "n", descriptor = "I")
    public static int field633;

    @OriginalMember(owner = "client!ip", name = "j", descriptor = "[[I")
    public static int[][] field629;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIBI)Lmc;")
    public static final class318 method400(int arg0, int arg1, byte arg2, int arg3) {
        field622++;
        int var4 = arg1 << 8 | arg3;
        class318 var5 = (class318) class402.field5559.method515(-1, (long) var4 << 16);
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = class72.field1011.method1908((byte) -85, class72.field1011.method1931((byte) 104, var4));
        if (var6 == null) {
            int var8 = arg0 + 65536 << 8 | arg3;
            class318 var9 = (class318) class402.field5559.method515(-1, (long) var8 << 16);
            if (var9 != null) {
                return var9;
            }
            byte[] var10 = class72.field1011.method1908((byte) -126, class72.field1011.method1931((byte) 104, var8));
            if (var10 == null) {
                int var12 = arg3 | 0xFFFF00;
                class318 var13 = (class318) class402.field5559.method515(-1, (long) var12 << 16);
                if (arg2 != -54) {
                    field629 = null;
                }
                if (var13 != null) {
                    return var13;
                }
                byte[] var14 = class72.field1011.method1908((byte) -68, class72.field1011.method1931((byte) 104, var12));
                if (var14 == null) {
                    return null;
                } else if (var14.length <= 1) {
                    return null;
                } else {
                    class318 var15 = class431.method2656(var14, false);
                    var15.field4327 = arg3;
                    class402.field5559.method519((long) var12 << 16, true, var15);
                    return var15;
                }
            } else if (var10.length <= 1) {
                return null;
            } else {
                class318 var11 = class431.method2656(var10, false);
                var11.field4327 = arg3;
                class402.field5559.method519((long) var8 << 16, true, var11);
                return var11;
            }
        } else if (var6.length <= 1) {
            return null;
        } else {
            class318 var7 = class431.method2656(var6, false);
            var7.field4327 = arg3;
            class402.field5559.method519((long) var4 << 16, true, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(I)V")
    public static final void method401(int arg0) {
        field621++;
        class435.method2679((byte) -72);
        class48.method394(8185);
        class294.method1794(0);
        class398.method2465(0);
        if (arg0 < 24) {
            return;
        }
        class343.method2086(2);
        class258.method1666((byte) 116);
        class39.method348(16383);
        class19.method112(-126);
        class447.method2769((byte) -110);
        class410.method2545(-3);
        class350.method2118(28412);
        class58.method455(true);
        class337.method2046(-124);
        class301.method1829(false);
        class124.method949(7);
        class230.method1505(0);
        class313.method1895((byte) -128);
        class274.method1732(512);
        class142.method1037(true);
        class150.method1116(0);
        class91.method723(-105);
        class243.method1586(false);
        class194.method1344(94);
        class446.field6251.method2522((byte) 115);
        class416.field5767.method2522((byte) 77);
        class92.field1291.method2522((byte) 21);
        class412.field5729.method2522((byte) 68);
        class172.field2477.method2522((byte) 123);
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIIZ)V")
    public static final void method402(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg3) {
            method401(59);
        }
        field624++;
        class26 var4 = class217.method1445(!arg3, arg1, 11);
        var4.method158(28194);
        var4.field341 = arg2;
        var4.field339 = arg0;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(B)I")
    public static final int method403(byte arg0) {
        if (arg0 > -101) {
            method403((byte) -31);
        }
        field627++;
        return ((class336.field4540 == 0 ? 0 : 1) << 22) + ((class1.field2 == 0 ? 0 : 1) << 21) + ((class231.field3253 == 0 ? 0 : 1) << 20) + ((class119.field1814 ? 1 : 0) << 19) + (class294.field3962 << 17) + ((class160.field2272 ? 1 : 0) << 16) + ((class428.field5958 ? 1 : 0) << 13) + ((class341.field4607 ? 1 : 0) << 8) + ((class441.field6201 ? 1 : 0) << 5) + (class359.field4957 & 0x7) + (((class86.field1206 ? 1 : 0) << 3) + ((class230.field3237 ? 1 : 0) << 4) + ((class215.field3009 ? 1 : 0) << 6) + ((class107.field1521 ? 1 : 0) << 9) - (-((class404.field5593 ? 1 : 0) << 10) + -((class228.field3188 & 0x3) << 11) - ((class152.field2192 ? 1 : 0) << 15)) - -(class244.method1590(-28442) << 23) - (-(class316.field4264 << 25) - ((class319.field4357 ? 1 : 0) << 27) - (class344.field4647 << 28)));
    }

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "(I)V")
    public static final void method404(int arg0) {
        field628++;
        class26 var1 = class217.method1445(true, 0, 15);
        if (arg0 <= -85) {
            var1.method164(12);
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(III)V")
    public static final void method405(int arg0, int arg1, int arg2) {
        if (arg2 == -1286790035) {
            field633++;
            class24.field312 = arg0 - class333.field4518;
            class258.field3572 = arg1 - class333.field4514;
        }
    }

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "(I)V")
    public static void method406(int arg0) {
        field630 = null;
        field629 = null;
        int var1 = -27 / ((-arg0 - 87) / 36);
    }
}
