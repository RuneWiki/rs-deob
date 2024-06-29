import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class124 {

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "J")
    public long field2050;

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "Lad;")
    private class669 field2045;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "Leda;")
    public static class116 field2044 = new class116(50, -1);

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "I")
    public static int field2046 = 1406;

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "I")
    public static int field2047;

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!ig", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field2047++;
        this.field2045.method3775(this.field2050, -1);
        super.finalize();
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(III)Llba;")
    public static final class198 method994(int arg0, int arg1, int arg2) {
        class293 var3 = class541.field7946[arg0][arg1][arg2];
        return var3 == null ? null : var3.field4097;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V")
    public static void method995(int arg0) {
        if (arg0 != 50) {
            method996(-105, 104, null);
        }
        field2044 = null;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(II[Lis;)V")
    public static final void method996(int arg0, int arg1, class101[] arg2) {
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class101 var4 = arg2[var3];
            if (var4 != null && var4.field1539 == arg0 && !client.method714(var4)) {
                if (var4.field1584 == 0) {
                    method996(var4.field1577, 125, arg2);
                    if (var4.field1578 != null) {
                        method996(var4.field1577, 124, var4.field1578);
                    }
                    class259 var5 = (class259) class199.field3098.method2818(-22803, (long) var4.field1577);
                    if (var5 != null) {
                        class246.method1583(var5.field3716, 11475);
                    }
                }
                if (var4.field1584 == 6 && var4.field1603 != -1) {
                    class606 var6 = class480.field6871.method1417(-3585, var4.field1603);
                    if (var6 != null) {
                        var4.field1545 += class193.field2993;
                        int var7 = var4.field1551;
                        while (var6.field8699[var4.field1551] < var4.field1545) {
                            var4.field1545 -= var6.field8699[var4.field1551];
                            var4.field1551++;
                            if (var4.field1551 >= var6.field8707.length) {
                                var4.field1551 -= var6.field8721;
                                if (var4.field1551 < 0 || var6.field8707.length <= var4.field1551) {
                                    var4.field1551 = 0;
                                }
                            }
                            var4.field1499 = var4.field1551 + 1;
                            if (var4.field1499 >= var6.field8707.length) {
                                var4.field1499 -= var6.field8721;
                                if (var4.field1499 < 0 || var6.field8707.length <= var4.field1499) {
                                    var4.field1499 = -1;
                                }
                            }
                            class326.method1948(1, var4);
                        }
                        if (var4.field1551 != var7) {
                            class173.method1274(var4.field1551, var6, false);
                        }
                    }
                }
            }
        }
        field2049++;
        if (arg1 <= 123) {
            field2044 = null;
        }
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(Lad;J[Lsk;)V")
    public class124(class669 arg0, long arg1, class446[] arg2) {
        this.field2050 = arg1;
        this.field2045 = arg0;
    }
}
