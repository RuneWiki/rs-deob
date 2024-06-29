import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class220 extends class90 {

    @OriginalMember(owner = "client!rj", name = "j", descriptor = "I")
    public static int field3756 = -1;

    @OriginalMember(owner = "client!rj", name = "n", descriptor = "I")
    public static int field3760 = 0;

    @OriginalMember(owner = "client!rj", name = "r", descriptor = "[[[Loa;")
    public static class262[][][] field3764 = new class262[4][104][104];

    @OriginalMember(owner = "client!rj", name = "q", descriptor = "Luc;")
    public static class11 field3763 = new class11(64);

    @OriginalMember(owner = "client!rj", name = "s", descriptor = "Lmb;")
    public static class96 field3765 = class243.method1708("<br>", (byte) 113);

    @OriginalMember(owner = "client!rj", name = "k", descriptor = "I")
    public static int field3757;

    @OriginalMember(owner = "client!rj", name = "l", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!rj", name = "m", descriptor = "I")
    public static int field3759;

    @OriginalMember(owner = "client!rj", name = "o", descriptor = "I")
    public static int field3761;

    @OriginalMember(owner = "client!rj", name = "p", descriptor = "Lff;")
    public static class3 field3762;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(II)I")
    public static final int method1512(int arg0, int arg1) {
        if (arg1 <= 65) {
            method1515(76, (class3) null, -12, 76);
        }
        field3761++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ISLmb;ILmb;JI)V")
    public static final void method1513(int arg0, short arg1, class96 arg2, int arg3, class96 arg4, long arg5, int arg6) {
        field3759++;
        if (class170.field2981) {
            return;
        }
        if (arg0 >= -14) {
            method1515(71, (class3) null, 72, 57);
        }
        if (class73.field1254 >= 500) {
            return;
        }
        class208.field3586[class73.field1254] = arg2;
        class192.field3316[class73.field1254] = arg4;
        class79.field1346[class73.field1254] = arg1;
        class214.field3687[class73.field1254] = arg5;
        class53.field927[class73.field1254] = arg3;
        class78.field1329[class73.field1254] = arg6;
        class73.field1254++;
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(B)V")
    public static final void method1514(byte arg0) {
        if (arg0 <= 111) {
            field3760 = 81;
        }
        class250.field4316.method96(false);
        field3757++;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILff;II)Lka;")
    public static final class174 method1515(int arg0, class3 arg1, int arg2, int arg3) {
        if (arg2 != 0) {
            method1513(-18, (short) 81, (class96) null, -26, (class96) null, 104L, 13);
        }
        field3758++;
        return class224.method1530(arg0, arg3, (byte) -70, arg1) ? class9.method69((byte) -86) : null;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Z)V")
    public static void method1516(boolean arg0) {
        field3762 = null;
        field3763 = null;
        if (!arg0) {
            method1515(-45, (class3) null, 23, -35);
        }
        field3764 = null;
        field3765 = null;
    }
}
