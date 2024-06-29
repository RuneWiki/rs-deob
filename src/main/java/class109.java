import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class109 extends class363 {

    @OriginalMember(owner = "client!jh", name = "j", descriptor = "J")
    public static long field1564 = -1L;

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!jh", name = "k", descriptor = "I")
    public static int field1565;

    @OriginalMember(owner = "client!jh", name = "l", descriptor = "I")
    public static int field1566;

    @OriginalMember(owner = "client!jh", name = "m", descriptor = "I")
    public static int field1567;

    @OriginalMember(owner = "client!jh", name = "n", descriptor = "I")
    public static int field1568;

    @OriginalMember(owner = "client!jh", name = "o", descriptor = "I")
    public static int field1569;

    @OriginalMember(owner = "client!jh", name = "p", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!jh", name = "i", descriptor = "Lm;")
    public static class126 field1563;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIII)V", line = 7)
    public static final void method671(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1561;
        for (class404 var5 = (class404) class46.field732.method816(109); var5 != null; var5 = (class404) class46.field732.method812(95)) {
            class527.method3112(arg3, 93, arg2, arg1, arg4, var5);
        }
        for (class404 var6 = (class404) class372.field5674.method816(110); var6 != null; var6 = (class404) class372.field5674.method812(107)) {
            byte var12 = 1;
            class82 var13 = var6.field6103.method845(0);
            if (!var6.field6103.field1963) {
                if (~var6.field6103.field1931 != ~var13.field1267 && ~var6.field6103.field1931 != ~var13.field1268 && ~var6.field6103.field1931 != ~var13.field1252 && var6.field6103.field1931 != var13.field1235) {
                    if (var6.field6103.field1931 == var13.field1260 || var6.field6103.field1931 == var13.field1245 || var6.field6103.field1931 == var13.field1232 || ~var6.field6103.field1931 == ~var13.field1242) {
                        var12 = 3;
                    }
                } else {
                    var12 = 2;
                }
            } else {
                var12 = 0;
            }
            if (var6.field6092 != var12) {
                int var14 = class531.method3135(var6.field6103, 105);
                if (~var6.field6098 != ~var14) {
                    if (var6.field6085 != null) {
                        class366.field5591.method1794(var6.field6085);
                        var6.field6085 = null;
                    }
                    var6.field6098 = var14;
                }
                var6.field6092 = var12;
            }
            var6.field6104 = var6.field6103.field1763;
            var6.field6087 = var6.field6103.field1763 - -(var6.field6103.method847(-1) << 6);
            var6.field6102 = var6.field6103.field1769;
            var6.field6097 = var6.field6103.field1769 + (var6.field6103.method847(-1) << 6);
            class527.method3112(arg3, 76, arg2, arg1, arg4, var6);
        }
        class404 var7 = (class404) class164.field2414.method2608(true);
        int var8 = 34 % ((arg0 - 10) / 58);
        while (var7 != null) {
            byte var9 = 1;
            class82 var10 = var7.field6084.method845(0);
            if (!var7.field6084.field1963) {
                if (var7.field6084.field1931 != var10.field1267 && ~var7.field6084.field1931 != ~var10.field1268 && ~var7.field6084.field1931 != ~var10.field1252 && ~var7.field6084.field1931 != ~var10.field1235) {
                    if (var7.field6084.field1931 == var10.field1260 || ~var7.field6084.field1931 == ~var10.field1245 || var7.field6084.field1931 == var10.field1232 || var7.field6084.field1931 == var10.field1242) {
                        var9 = 3;
                    }
                } else {
                    var9 = 2;
                }
            } else {
                var9 = 0;
            }
            if (var7.field6092 != var9) {
                int var11 = class462.method2782(5424, var7.field6084);
                if (~var7.field6098 != ~var11) {
                    if (var7.field6085 != null) {
                        class366.field5591.method1794(var7.field6085);
                        var7.field6085 = null;
                    }
                    var7.field6098 = var11;
                }
                var7.field6092 = var9;
            }
            var7.field6104 = var7.field6084.field1763;
            var7.field6087 = var7.field6084.field1763 - -(var7.field6084.method847(-1) << 6);
            var7.field6102 = var7.field6084.field1769;
            var7.field6097 = var7.field6084.field1769 - -(var7.field6084.method847(-1) << 6);
            class527.method3112(arg3, -56, arg2, arg1, arg4, var7);
            var7 = (class404) class164.field2414.method2603(89);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Ljk;IB)V", line = 123)
    public final void method121(class446 arg0, int arg1, byte arg2) {
        ++field1565;
        super.field5564.method2200(arg0, (byte) 127);
        if (arg2 <= -69) {
            super.field5564.method2186(arg1, 51);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZI)V", line = 136)
    public final void method125(boolean arg0, int arg1) {
        if (arg1 > -69) {
            this.method121((class446) null, -4, (byte) -66);
        }
        ++field1566;
        super.field5564.method2120(true, 8705);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Z)V", line = 148)
    public final void method120(boolean arg0) {
        super.field5564.method2120(arg0, 8705);
        ++field1569;
    }

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "(I)V", line = 156)
    public static void method672(int arg0) {
        if (arg0 == -1) {
            field1563 = null;
        }
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(Lod;)V", line = 169)
    public class109(class349 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(I)Z", line = 172)
    public final boolean method126(int arg0) {
        ++field1567;
        int var2 = -22 / ((37 - arg0) / 48);
        return true;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(II)I", line = 182)
    public static final int method673(int arg0, int arg1) {
        int var2 = ((-1431655765 & arg1) >>> 1) + (1431655765 & arg1);
        if (arg0 != -8081) {
            return -93;
        } else {
            ++field1568;
            int var3 = (var2 & 858993459) - -((-858993457 & var2) >>> 2);
            int var4 = (var3 >>> 4) + var3 & 252645135;
            int var5 = (var4 >>> 8) + var4;
            int var6 = (var5 >>> 16) + var5;
            return 255 & var6;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZB)V", line = 198)
    public final void method122(boolean arg0, byte arg1) {
        ++field1562;
        if (arg1 != 52) {
            field1563 = null;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(III)V", line = 212)
    public final void method128(int arg0, int arg1, int arg2) {
        if (arg1 <= -13) {
            ++field1570;
        }
    }
}
