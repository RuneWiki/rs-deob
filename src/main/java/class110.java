import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class110 {

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "I")
    public int field1521 = 128;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "I")
    public int field1520 = 128;

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "I")
    public int field1525;

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "I")
    public int field1522;

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "I")
    public int field1524;

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
    public int field1519;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "Lhda;")
    public static class752 field1516 = new class752(91, 4);

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "I")
    public static int field1515;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
    public static int field1517;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
    public static int field1518;

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "I")
    public static int field1523;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILli;)I")
    public static final int method810(int arg0, class433 arg1) {
        field1517++;
        if (arg0 >= -28) {
            method812(-112);
        }
        String var2 = class407.method2383(100, arg1);
        int[] var3 = null;
        if (class361.method2151(arg1.field5963, 50)) {
            var3 = class77.field948.method1165((byte) 104, (int) arg1.field5970).field7822;
        } else if (arg1.field5967 != -1) {
            var3 = class77.field948.method1165((byte) 108, arg1.field5967).field7822;
        } else if (class410.method2392(-83, arg1.field5963)) {
            class134 var6 = (class134) class390.field5470.method2135((long) ((int) arg1.field5970), (byte) 31);
            if (var6 != null) {
                class556 var7 = var6.field2154;
                class166 var8 = var7.field7328;
                if (var8.field2575 != null) {
                    var8 = var8.method1190((byte) 50, class74.field901);
                }
                if (var8 != null) {
                    var3 = var8.field2557;
                }
            }
        } else if (class84.method650(arg1.field5963, (byte) 70)) {
            Object var4 = null;
            class100 var5;
            if (arg1.field5963 == 1009) {
                var5 = class462.field6333.method2008((byte) -23, (int) arg1.field5970);
            } else {
                var5 = class462.field6333.method2008((byte) -118, (int) (arg1.field5970 >>> 32 & 0x7FFFFFFFL));
            }
            if (var5.field1307 != null) {
                var5 = var5.method748(class74.field901, 124);
            }
            if (var5 != null) {
                var3 = var5.field1287;
            }
        }
        if (var3 != null) {
            var2 = var2 + class540.method3010(26, var3);
        }
        int var9 = class105.field1446.method3004(215, var2, class657.field8682);
        if (arg1.field5959) {
            var9 += class288.field4081.method1042() + 4;
        }
        return var9;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lra;I)V")
    public final void method811(class110 arg0, int arg1) {
        this.field1520 = arg0.field1520;
        this.field1525 = arg0.field1525;
        this.field1519 = arg0.field1519;
        this.field1524 = arg0.field1524;
        this.field1522 = arg0.field1522;
        field1518++;
        if (arg1 != 91) {
            method812(-53);
        }
        this.field1521 = arg0.field1521;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V")
    public static void method812(int arg0) {
        field1516 = null;
        if (arg0 >= -115) {
            field1516 = null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)Lra;")
    public final class110 method813(int arg0) {
        if (arg0 != 24695) {
            this.field1520 = -92;
        }
        field1523++;
        return new class110(this.field1525, this.field1521, this.field1520, this.field1524, this.field1519, this.field1522);
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(I)V")
    public class110(int arg0) {
        this.field1525 = arg0;
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(IIIIII)V")
    private class110(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1525 = arg0;
        this.field1520 = arg2;
        this.field1522 = arg5;
        this.field1521 = arg1;
        this.field1524 = arg3;
        this.field1519 = arg4;
    }
}
