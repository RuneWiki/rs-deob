import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class211 extends class146 {

    @OriginalMember(owner = "client!tg", name = "m", descriptor = "I")
    public static int field3569 = 0;

    @OriginalMember(owner = "client!tg", name = "k", descriptor = "Lpf;")
    public static class168 field3567 = new class168(128);

    @OriginalMember(owner = "client!tg", name = "o", descriptor = "[I")
    public static int[] field3571 = new int[2];

    @OriginalMember(owner = "client!tg", name = "p", descriptor = "[S")
    public static short[] field3572 = new short[256];

    @OriginalMember(owner = "client!tg", name = "q", descriptor = "J")
    public static volatile long field3573 = 0L;

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "I")
    public static int field3566;

    @OriginalMember(owner = "client!tg", name = "l", descriptor = "I")
    public static int field3568;

    @OriginalMember(owner = "client!tg", name = "n", descriptor = "I")
    public static int field3570;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)V")
    public static final void method1343(byte arg0) {
        field3570++;
        class172.method1102((byte) 9);
        class104.method634(103);
        class100.method616(-11);
        class72.method436(0);
        class194.method1233(24466);
        class88.method525((byte) -103);
        class7.method29(116);
        class193.method1229(1179390311);
        class148.method935(false);
        class77.method457(arg0 + 32665);
        class229.method1549(-53);
        class187.method1195(true);
        class71.method431(true);
        class2.method2((byte) 96);
        ((class10) class62.field1129).method40((byte) -98);
        class199.field3415.method1039((byte) -64);
        class31.field495.method885((byte) -28);
        class33.field547.method885((byte) -28);
        class188.field3198.method885((byte) -28);
        class95.field1648.method885((byte) -28);
        if (arg0 != 102) {
            method1345((byte) -7, 32);
        }
        class232.field4042.method885((byte) -28);
        class14.field270.method885((byte) -28);
        class252.field4358.method885((byte) -28);
        class94.field1639.method885((byte) -28);
        class207.field3510.method885((byte) -28);
        class149.field2602.method885((byte) -28);
        class128.field2254.method885((byte) -28);
    }

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "(I)V")
    public static void method1344(int arg0) {
        field3571 = null;
        field3572 = null;
        field3567 = null;
        if (arg0 != 0) {
            field3567 = null;
        }
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(BI)Lub;")
    public static final class227 method1345(byte arg0, int arg1) {
        if (arg0 < 110) {
            field3567 = null;
        }
        field3566++;
        return arg1 < 999999999 ? class204.method1303(arg1, 1) : class174.field2901;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIIIII)I")
    public static final int method1346(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg4 & 0x3;
        field3568++;
        if ((arg3 & 0x1) == 1) {
            int var8 = arg5;
            arg5 = arg6;
            arg6 = var8;
        }
        if (var7 == 0) {
            return arg2;
        }
        if (arg0 != 7) {
            method1344(-93);
        }
        if (var7 == 1) {
            return -arg5 - (arg1 - 1 - 7);
        } else if (var7 == 2) {
            return 7 + 1 - arg2 - arg6;
        } else {
            return arg1;
        }
    }
}
