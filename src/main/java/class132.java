import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public class class132 {

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "Lem;")
    public class153 field1732 = null;

    @OriginalMember(owner = "client!pq", name = "j", descriptor = "[Lgu;")
    public class417[] field1740 = null;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "[Lgu;")
    public class417[] field1731 = null;

    @OriginalMember(owner = "client!pq", name = "g", descriptor = "Lem;")
    public class153 field1737 = null;

    @OriginalMember(owner = "client!pq", name = "k", descriptor = "Lem;")
    public class153 field1741 = null;

    @OriginalMember(owner = "client!pq", name = "f", descriptor = "Z")
    public boolean field1736;

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "I")
    public static int field1733;

    @OriginalMember(owner = "client!pq", name = "e", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!pq", name = "h", descriptor = "I")
    public static int field1738;

    @OriginalMember(owner = "client!pq", name = "i", descriptor = "I")
    public static int field1739;

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "Lvl;")
    public static class11 field1734;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(BLza;)V")
    public static final void method839(byte arg0, class290 arg1) {
        field1735++;
        if (arg0 >= -59) {
            field1734 = null;
        }
        if (!(class37.field408 >= 2 || class427.field6024) || class471.field6573 != null) {
            return;
        }
        String var2;
        if (class427.field6024 && class37.field408 < 2) {
            var2 = class380.field5366 + class19.field223.method3116(class149.field1979, (byte) 117) + class431.field6089 + " ->";
        } else if (class462.field6464 && class345.field5009.method870(81, -116) && class37.field408 > 2) {
            var2 = class120.method809(-32060, (class214) class363.field5190.field6378.field7056.field7056);
        } else {
            class214 var3 = (class214) class363.field5190.field6378.field7056;
            var2 = class120.method809(-32060, var3);
            int[] var4 = null;
            if (class308.method1869(var3.field3094, (byte) -106)) {
                var4 = class344.field5000.method993((int) var3.field3089, true).field5534;
            } else if (var3.field3085 != -1) {
                var4 = class344.field5000.method993(var3.field3085, true).field5534;
            } else if (class26.method168(var3.field3094, 205)) {
                class378 var5 = (class378) class125.field1687.method2405((long) ((int) var3.field3089), -50);
                if (var5 != null) {
                    class429 var6 = var5.field5353;
                    class322 var7 = var6.field6055;
                    if (var7.field4693 != null) {
                        var7 = var7.method1939(15964, class163.field2413);
                    }
                    if (var7 != null) {
                        var4 = var7.field4680;
                    }
                }
            } else if (class350.method2072(var3.field3094, (byte) 100)) {
                Object var8 = null;
                class270 var9;
                if (var3.field3094 == 1002) {
                    var9 = class377.field5338.method1901(50, (int) var3.field3089);
                } else {
                    var9 = class377.field5338.method1901(50, (int) (var3.field3089 >>> 32 & 0x7FFFFFFFL));
                }
                if (var9.field3998 != null) {
                    var9 = var9.method1704((byte) 21, class163.field2413);
                }
                if (var9 != null) {
                    var4 = var9.field3934;
                }
            }
            if (var4 != null) {
                var2 = var2 + class440.method2579(var4, false);
            }
        }
        if (class37.field408 > 2) {
            var2 = var2 + "<col=ffffff> / " + (class37.field408 - 2) + class462.field6452.method3116(class149.field1979, (byte) 109);
        }
        if (class220.field3180 != null) {
            class319 var10 = class220.field3180.method931(21118, arg1);
            if (var10 == null) {
                var10 = class107.field1431;
            }
            var10.method1926(class220.field3180.field2113, class220.field3180.field2033, class220.field3180.field2132, class244.field3542, class220.field3180.field2148, var2, -15565, class220.field3180.field2103, class487.field6796, class33.field380, class81.field1048, class143.field1882, class220.field3180.field1992, class353.field5065, class55.field696);
            class108.method738(class143.field1882[1], class143.field1882[0], (byte) 123, class143.field1882[3], class143.field1882[2]);
        } else if (class251.field3750 != null && class519.field7646 == class246.field3594) {
            int var11 = class107.field1431.method1919(var2, class33.field380, class81.field1048, 16777215, class55.field696, class202.field2889 + 4, (byte) 76, class230.field3390 + 16, class487.field6796, 0);
            class108.method738(class230.field3390, class202.field2889 + 4, (byte) 34, 16, var11 + class113.field1536.method2430(var2, (byte) -121));
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(I)V")
    public static void method840(int arg0) {
        if (arg0 != 0) {
            field1734 = null;
        }
        field1734 = null;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(B)V")
    public static final void method841(byte arg0) {
        class273.field4049 = null;
        class460.field6424 = null;
        class116.field1567 = null;
        class467.field6526 = null;
        class53.field682 = null;
        class107.field1431 = null;
        field1739++;
        if (arg0 != -106) {
            field1734 = null;
        }
        class536.field7852 = null;
        class438.field6143 = null;
        class149.field1976 = null;
        class507.field7499 = null;
        class388.field5453 = null;
        class324.field4727 = null;
        class357.field5119 = null;
        class8.field130 = null;
        class328.field4785 = null;
        class38.field415 = null;
        class131.field1726 = null;
        class90.field1122 = null;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IBI)B")
    public static final byte method842(int arg0, byte arg1, int arg2) {
        field1733++;
        if (arg2 == 9) {
            if (arg1 < 36) {
                method839((byte) -77, null);
            }
            return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(Lih;)V")
    public class132(class503 arg0) {
        this.field1736 = arg0.field7393;
        class8.method49(arg0, (byte) -88);
        if (this.field1736) {
            byte[] var6 = class90.method645(class263.field3873, false, false);
            this.field1741 = new class153(arg0, 6410, 128, 128, 16, var6, 6410);
            byte[] var7 = class90.method645(class419.field5901, false, false);
            this.field1732 = new class153(arg0, 6410, 128, 128, 16, var7, 6410);
            class36 var8 = arg0.field7315;
            if (var8.method206(-12071)) {
                byte[] var9 = class90.method645(class266.field3890, false, false);
                this.field1737 = new class153(arg0, 6408, 128, 128, 16);
                class153 var10 = new class153(arg0, 6409, 128, 128, 16, var9, 6409);
                if (var8.method203(2.0F, this.field1737, 1840, var10)) {
                    this.field1737.method2761((byte) 121);
                } else {
                    this.field1737.method2757(-10909);
                    this.field1737 = null;
                }
                var10.method2757(-10909);
            }
        } else {
            this.field1731 = new class417[16];
            for (int var2 = 0; var2 < 16; var2++) {
                byte[] var5 = class183.method1157((byte) 105, var2 * 16384 * 2, 32768, class263.field3873);
                this.field1731[var2] = new class417(arg0, 3553, 6410, 128, 128, true, var5, 6410, false);
            }
            this.field1740 = new class417[16];
            for (int var3 = 0; var3 < 16; var3++) {
                byte[] var4 = class183.method1157((byte) 68, var3 * 128 * 128 * 2, 32768, class419.field5901);
                this.field1740[var3] = new class417(arg0, 3553, 6410, 128, 128, true, var4, 6410, false);
            }
        }
    }
}
