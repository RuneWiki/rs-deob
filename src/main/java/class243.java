import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class243 {

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "Lsha;")
    private class757 field3190;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "J")
    public long field3191;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "Ljb;")
    public static class519 field3192 = new class519(22, 4);

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "[Ldt;")
    public static class254[] field3193 = new class254[2048];

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "I")
    public static int field3194 = 0;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    public static int field3188;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BIIII)V")
    public static final void method1521(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field3187++;
        for (class119 var5 = (class119) class197.field2555.method679((byte) -86); var5 != null; var5 = (class119) class197.field2555.method681(-31)) {
            class8.method43(arg3, arg2, var5, arg0 ^ 0x60A3, arg4, arg1);
        }
        if (arg0 != 95) {
            return;
        }
        for (class119 var6 = (class119) class205.field2641.method679((byte) -86); var6 != null; var6 = (class119) class205.field2641.method681(-106)) {
            byte var12 = 1;
            class588 var13 = var6.field1609.method2573(-1);
            if (var6.field1609.field6111 == -1 || var6.field1609.field6128) {
                var12 = 0;
            } else if (var6.field1609.field6111 == var13.field8030 || var6.field1609.field6111 == var13.field7992 || var6.field1609.field6111 == var13.field8008 || var6.field1609.field6111 == var13.field8000) {
                var12 = 2;
            } else if (var6.field1609.field6111 == var13.field7989 || var6.field1609.field6111 == var13.field7985 || var6.field1609.field6111 == var13.field8018 || var6.field1609.field6111 == var13.field8009) {
                var12 = 3;
            }
            if (var6.field1605 != var12) {
                int var14 = class489.method2862(var6.field1609, -1);
                class304 var15 = var6.field1609.field217;
                if (var15.field4295 != null) {
                    var15 = var15.method1968(class480.field6740, -1);
                }
                if (var15 == null || var14 == -1) {
                    var6.field1593 = false;
                    var6.field1584 = -1;
                    var6.field1605 = var12;
                } else if (var6.field1584 == var14 && var6.field1593 == var15.field4282) {
                    var6.field1605 = var12;
                    var6.field1591 = var15.field4324;
                } else {
                    boolean var16 = false;
                    if (var6.field1599 == null) {
                        var16 = true;
                    } else {
                        var6.field1591 -= 512;
                        if (var6.field1591 <= 0) {
                            class701.field9285.method22(var6.field1599);
                            var6.field1599 = null;
                            var16 = true;
                        }
                    }
                    if (var16) {
                        var6.field1593 = var15.field4282;
                        var6.field1605 = var12;
                        var6.field1597 = null;
                        var6.field1603 = null;
                        var6.field1584 = var14;
                        var6.field1591 = var15.field4324;
                    }
                }
            }
            var6.field1582 = var6.field1609.field2802;
            var6.field1588 = var6.field1609.field2802 + (var6.field1609.method2563(-12840) << 8);
            var6.field1583 = var6.field1609.field2810;
            var6.field1586 = var6.field1609.field2810 + (var6.field1609.method2563(-12840) << 8);
            class8.method43(arg3, arg2, var6, 24828, arg4, arg1);
        }
        for (class119 var7 = (class119) class310.field4390.method1249((byte) -110); var7 != null; var7 = (class119) class310.field4390.method1246(true)) {
            byte var8 = 1;
            class588 var9 = var7.field1594.method2573(-1);
            if (var7.field1594.field6111 == -1 || var7.field1594.field6128) {
                var8 = 0;
            } else if (var7.field1594.field6111 == var9.field8030 || var7.field1594.field6111 == var9.field7992 || var7.field1594.field6111 == var9.field8008 || var7.field1594.field6111 == var9.field8000) {
                var8 = 2;
            } else if (var7.field1594.field6111 == var9.field7989 || var7.field1594.field6111 == var9.field7985 || var7.field1594.field6111 == var9.field8018 || var7.field1594.field6111 == var9.field8009) {
                var8 = 3;
            }
            if (var7.field1605 != var8) {
                int var10 = class585.method3294(var7.field1594, (byte) -23);
                if (var7.field1584 == var10 && var7.field1593 == var7.field1594.field10351) {
                    var7.field1605 = var8;
                    var7.field1591 = var7.field1594.field10372;
                } else {
                    boolean var11 = false;
                    if (var7.field1599 == null) {
                        var11 = true;
                    } else {
                        var7.field1591 -= 512;
                        if (var7.field1591 <= 0) {
                            class701.field9285.method22(var7.field1599);
                            var11 = true;
                            var7.field1599 = null;
                        }
                    }
                    if (var11) {
                        var7.field1597 = null;
                        var7.field1584 = var10;
                        var7.field1605 = var8;
                        var7.field1603 = null;
                        var7.field1593 = var7.field1594.field10351;
                        var7.field1591 = var7.field1594.field10372;
                    }
                }
            }
            var7.field1582 = var7.field1594.field2802;
            var7.field1588 = var7.field1594.field2802 + (var7.field1594.method2563(-12840) << 8);
            var7.field1583 = var7.field1594.field2810;
            var7.field1586 = var7.field1594.field2810 + (var7.field1594.method2563(-12840) << 8);
            class8.method43(arg3, arg2, var7, 24828, arg4, arg1);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILnf;)Z")
    public static final boolean method1522(int arg0, class602 arg1) {
        field3188++;
        class412 var2 = class210.field2705.method1362(0, arg1.method1748(5875));
        if (var2.field5865 == -1) {
            return true;
        } else {
            class742 var3 = class548.field7574.method3176((byte) -125, var2.field5865);
            return var3.field10040 == arg0 ? true : var3.method4081(-22613);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)V")
    public static void method1523(byte arg0) {
        field3193 = null;
        field3192 = null;
        if (arg0 >= -127) {
            method1523((byte) -60);
        }
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(Lsha;J[Lmca;)V")
    public class243(class757 arg0, long arg1, class33[] arg2) {
        this.field3190 = arg0;
        this.field3191 = arg1;
    }

    @OriginalMember(owner = "client!jd", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field3190.method4152((byte) -46, this.field3191);
        field3189++;
        super.finalize();
    }
}
