import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qu")
public class class63 {

    @OriginalMember(owner = "client!qu", name = "c", descriptor = "[J")
    public static long[] field973 = new long[100];

    @OriginalMember(owner = "client!qu", name = "g", descriptor = "I")
    public static int field977 = 12;

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "I")
    public static int field971;

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "I")
    public static int field972;

    @OriginalMember(owner = "client!qu", name = "d", descriptor = "I")
    public static int field974;

    @OriginalMember(owner = "client!qu", name = "e", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!qu", name = "f", descriptor = "I")
    public static int field976;

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(Lcr;III)V")
    public static final void method434(class403 arg0, int arg1, int arg2, int arg3) {
        field971++;
        if (arg0 == null) {
            return;
        }
        if (arg0.field5445 != null) {
            class353 var4 = new class353();
            var4.field4772 = arg0.field5445;
            var4.field4770 = arg0;
            class122.method893(var4);
        }
        class450.field6125 = arg2;
        class394.field5341 = arg0.field5512;
        class351.field4740 = arg1;
        class32.field529 = true;
        class196.field2749 = arg0.field5431;
        class246.field3275 = arg0.field5530;
        class94.field1415 = arg0.field5553;
        class16.field285 = arg0.field5471;
        if (arg3 != 5465) {
            field977 = 120;
        }
        class412.method2378(arg0, (byte) -115);
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(II)I")
    public static final int method435(int arg0, int arg1) {
        field974++;
        if (arg0 != 127) {
            field975 = 83;
        }
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method436(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != -2860) {
            return true;
        }
        field972++;
        if ((class117.field1677[0][arg2][arg1] & 0x2) != 0) {
            return true;
        } else if ((class117.field1677[arg0][arg2][arg1] & 0x10) == 0) {
            return class206.method1323(-15434, arg0, arg2, arg1) == arg3;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method437(int arg0, int arg1, boolean arg2) {
        field976++;
        if (!arg2) {
            field977 = -64;
        }
        return (arg1 & 0x40000) != 0 | class30.method247(arg1, arg0, 5888) || class480.method2760(arg0, 97, arg1);
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(I)V")
    public static void method438(int arg0) {
        if (arg0 == 2) {
            field973 = null;
        }
    }
}
