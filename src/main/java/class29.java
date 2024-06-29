import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class29 extends class212 {

    @OriginalMember(owner = "client!fk", name = "L", descriptor = "I")
    public static int field348 = -1;

    @OriginalMember(owner = "client!fk", name = "O", descriptor = "I")
    public static int field351 = 0;

    @OriginalMember(owner = "client!fk", name = "T", descriptor = "I")
    public static int field356 = 0;

    @OriginalMember(owner = "client!fk", name = "I", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!fk", name = "K", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "client!fk", name = "M", descriptor = "I")
    public int field349;

    @OriginalMember(owner = "client!fk", name = "N", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!fk", name = "P", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "client!fk", name = "Q", descriptor = "I")
    public static int field353;

    @OriginalMember(owner = "client!fk", name = "R", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!fk", name = "U", descriptor = "I")
    public static int field357;

    @OriginalMember(owner = "client!fk", name = "W", descriptor = "I")
    private int field359;

    @OriginalMember(owner = "client!fk", name = "X", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!fk", name = "S", descriptor = "Lqe;")
    public class168 field355;

    @OriginalMember(owner = "client!fk", name = "V", descriptor = "[I")
    public static int[] field358;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILqe;B)V")
    public static final void method189(int arg0, class168 arg1, byte arg2) {
        class121.field1988++;
        field346++;
        class87.field1348.method672(60, arg2 + 171);
        class87.field1348.method768(arg0, 7295);
        if (arg2 != 67) {
            field356 = 67;
        }
        class87.field1348.method752(100, arg1.method1084(32383));
    }

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "(I)V")
    public static void method190(int arg0) {
        if (arg0 != -19332) {
            field356 = -63;
        }
        field358 = null;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lnh;BI)V")
    private final void method191(class112 arg0, byte arg1, int arg2) {
        if (arg2 == 1) {
            this.field359 = arg0.method758(true);
        } else if (arg2 == 2) {
            this.field349 = arg0.method769((byte) -86);
        } else if (arg2 == 5) {
            this.field355 = arg0.method751((byte) -88);
        }
        if (arg1 > -63) {
            this.method195(null, (byte) 126);
        }
        field360++;
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(B)Z")
    public final boolean method192(byte arg0) {
        field352++;
        if (arg0 < 9) {
            return true;
        } else {
            return this.field359 == 115;
        }
    }

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "(B)V")
    public static final void method193(byte arg0) {
        if (class190.field3306[98]) {
            class33.field407 += (12 - class33.field407) / 2;
        } else if (class190.field3306[99]) {
            class33.field407 += (-class33.field407 - 12) / 2;
        } else {
            class33.field407 /= 2;
        }
        if (class190.field3306[96]) {
            class85.field1323 += (-class85.field1323 - 24) / 2;
        } else if (class190.field3306[97]) {
            class85.field1323 += (24 - class85.field1323) / 2;
        } else {
            class85.field1323 /= 2;
        }
        int var1 = class21.field257 + class7.field85.field190;
        field350++;
        class71.field1093 += class33.field407 / 2;
        class103.field1665 += class85.field1323 / 2;
        int var2 = class254.field4399 + class7.field85.field166;
        if (class126.field2101 - var1 < -500 || class126.field2101 - var1 > 500 || class127.field2109 - var2 < -500 || class127.field2109 - var2 > 500) {
            class126.field2101 = var1;
            class127.field2109 = var2;
        }
        if (arg0 != -95) {
            method190(-44);
        }
        if (class126.field2101 != var1) {
            class126.field2101 += (var1 - class126.field2101) / 16;
        }
        if (class127.field2109 != var2) {
            class127.field2109 += (var2 - class127.field2109) / 16;
        }
        class171.method1134(98);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lfd;Loe;ZLoe;Z)V")
    public static final void method194(class11 arg0, class256 arg1, boolean arg2, class256 arg3, boolean arg4) {
        if (arg2) {
            return;
        }
        field357++;
        class91.field1428 = arg1;
        class55.field767 = arg3;
        class175.field3068 = arg4;
        int var5 = class91.field1428.method1698(-9) - 1;
        class60.field821 = var5 * 256 + class91.field1428.method1694(var5, 28851);
        class44.field580 = arg0;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lnh;B)V")
    public final void method195(class112 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method758(true);
            if (var3 == 0) {
                field353++;
                if (arg1 >= -30) {
                    method194(null, null, true, null, true);
                    return;
                }
                return;
            }
            this.method191(arg0, (byte) -113, var3);
        }
    }
}
