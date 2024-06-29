import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class105 {

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "Z")
    public boolean field1611 = true;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "I")
    public int field1597;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
    public int field1605;

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
    public int field1606;

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "I")
    public int field1608;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
    public int field1601;

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "I")
    public int field1610;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "I")
    public static int field1600 = 0;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "Ljava/lang/String;")
    public static String field1607 = "Loading wordpack - ";

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
    public static int field1598;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "I")
    public static int field1604;

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)Z")
    public static final boolean method779(int arg0, int arg1) {
        field1598++;
        if (class200.field3254 == arg1) {
            return false;
        }
        class258.field4112 = new int[104][104];
        class72.field1196 = new int[arg0][13][13];
        for (int var2 = 0; var2 < 4; var2++) {
            class141.field2352[var2] = new class13(104, 104);
        }
        class229.field3656 = new byte[4][104][104];
        class43.field790 = new byte[4][104][104];
        class2.field23 = new class266[4][104][104];
        class200.field3254 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
    public static void method780(int arg0) {
        if (arg0 != 104) {
            method780(-19);
        }
        field1607 = null;
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V")
    public static final void method781(int arg0) {
        field1602++;
        if (arg0 >= -28) {
            method780(-14);
        }
        class136.field2259.method1157(760);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BIIII)V")
    public static final void method782(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field1604++;
        if (arg0 > 14 && arg1 >= class108.field1650 && class154.field2509 >= arg1) {
            int var5 = class32.method278(class32.field540, 1, class61.field1034, arg2);
            int var6 = class32.method278(class32.field540, 1, class61.field1034, arg4);
            class225.method1508(var6, arg3, arg1, var5, -31738);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lsb;IZLsb;Lvf;)V")
    public static final void method783(class124 arg0, int arg1, boolean arg2, class124 arg3, class30 arg4) {
        class250.field3989 = arg0;
        class16.field242 = arg2;
        class295.field4674 = arg3;
        field1599++;
        int var5 = class250.field3989.method905(-1) - 1;
        class240.field3780 = var5 * 256 + class250.field3989.method891(arg1 ^ arg1, var5);
        class254.field4047 = arg4;
        class246.field3875 = new String[] { null, null, null, null, class4.field51 };
        class96.field1491 = new String[] { null, null, class23.field369, null, null };
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(I)V")
    public static final void method784(int arg0) {
        class87.field1405.method607(174, (byte) 118);
        class87.field1405.method967((byte) -8, (long) arg0);
        field1609++;
        class161.field2638++;
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(II)Lfl;")
    public static final class80 method785(int arg0, int arg1) {
        field1612++;
        if (arg0 < 43) {
            method784(-31);
        }
        return class185.field3037 && arg1 >= class130.field2154 && class6.field74 >= arg1 ? class15.field235[arg1 - class130.field2154] : null;
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class105(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field1597 = arg2;
        this.field1605 = arg1;
        this.field1606 = arg5;
        this.field1608 = arg0;
        this.field1611 = arg6;
        this.field1601 = arg4;
        this.field1610 = arg3;
    }
}
