import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class132 implements class389 {

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "Lsm;")
    private class96 field2142;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "Lvo;")
    private class345 field2144;

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "Lvo;")
    private class345 field2150;

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "I")
    public static int field2149 = 0;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
    public static int field2141;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
    public static int field2147;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "Lvo;")
    public static class345 field2145;

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "Lla;")
    private class395 field2148;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2143;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(I)V", line = 3)
    public static void method1024(int arg0) {
        if (arg0 > -19) {
            method1025(null);
        }
        field2145 = null;
        field2143 = null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ZZ)V", line = 17)
    public final void method344(boolean arg0, boolean arg1) {
        if (arg1) {
            int var3 = this.field2142.field1422.method1329(class570.field8333, this.field2142.field1416, false) + this.field2142.field1415;
            int var4 = this.field2142.field1425.method2447(-1464849236, class140.field2349, this.field2142.field1423) + this.field2142.field1417;
            this.field2148.method2402(this.field2142.field1411, null, null, this.field2142.field1423, 0, (byte) -104, 0, this.field2142.field1421, this.field2142.field1419, var4, this.field2142.field1416, this.field2142.field1426, this.field2142.field1424, this.field2142.field1412, null, var3);
        }
        if (!arg0) {
            field2146++;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V", line = 41)
    public final void method343(int arg0) {
        if (arg0 > -29) {
            method1025(null);
        }
        field2141++;
        class490 var2 = class61.method514(this.field2144, this.field2142.field1413, -1);
        this.field2148 = class637.field9048.method804(var2, class628.method3538(this.field2150, this.field2142.field1413), true);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Leb;)V", line = 58)
    public static final void method1025(class8 arg0) {
        if (class410.field5858 >= 65535) {
            return;
        }
        class289 var1 = arg0.field90;
        class126.field2067[class410.field5858] = arg0;
        class235.field3491[class410.field5858] = false;
        class410.field5858++;
        int var2 = arg0.field79;
        if (arg0.field85) {
            var2 = 0;
        }
        int var3 = arg0.field79;
        if (arg0.field83) {
            var3 = class596.field8626 - 1;
        }
        for (int var4 = var2; var4 <= var3; var4++) {
            int var5 = 0;
            int var6 = var1.method1771(true) + class211.field3229 - var1.method1772(true) >> class49.field637;
            if (var6 < 0) {
                var5 -= var6;
                var6 = 0;
            }
            int var7 = var1.method1771(true) + var1.method1772(true) - class211.field3229 >> class49.field637;
            if (var7 >= class687.field9758) {
                var7 = class687.field9758 - 1;
            }
            for (int var8 = var6; var8 <= var7; var8++) {
                short var9 = arg0.field77[var5++];
                int var10 = (var1.method1776((byte) -116) + class211.field3229 - var1.method1772(true) >> class49.field637) + (var9 >>> 8);
                int var11 = (var9 & 0xFF) + var10 - 1;
                if (var10 < 0) {
                    var10 = 0;
                }
                if (var11 >= class33.field474) {
                    var11 = class33.field474 - 1;
                }
                for (int var12 = var10; var12 <= var11; var12++) {
                    long var13 = class155.field2554[var4][var12][var8];
                    if ((var13 & 0xFFFFL) == 0L) {
                        class155.field2554[var4][var12][var8] = var13 | (long) class410.field5858;
                    } else if ((var13 & 0xFFFF0000L) == 0L) {
                        class155.field2554[var4][var12][var8] = var13 | (long) class410.field5858 << 16;
                    } else if ((var13 & 0xFFFF00000000L) == 0L) {
                        class155.field2554[var4][var12][var8] = var13 | (long) class410.field5858 << 32;
                    } else if ((var13 & 0xFFFF000000000000L) == 0L) {
                        class155.field2554[var4][var12][var8] = var13 | (long) class410.field5858 << 48;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)Z", line = 150)
    public final boolean method348(int arg0) {
        if (arg0 != 21378) {
            return false;
        }
        field2147++;
        boolean var2 = true;
        if (!this.field2150.method2077(0, this.field2142.field1413)) {
            var2 = false;
        }
        if (!this.field2144.method2077(0, this.field2142.field1413)) {
            var2 = false;
        }
        return var2;
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Lvo;Lvo;Lsm;)V", line = 173)
    public class132(class345 arg0, class345 arg1, class96 arg2) {
        this.field2142 = arg2;
        this.field2144 = arg1;
        this.field2150 = arg0;
    }
}
