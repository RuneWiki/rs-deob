import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public abstract class class157 {

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
    public static int field2803 = 0;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
    public static int field2805;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "Lkj;")
    public static class106 field2801;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(III)I")
    public abstract int method162(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
    public static void method1156(int arg0) {
        if (arg0 == -5390) {
            field2801 = null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIB)V")
    public static final void method1157(int arg0, int arg1, byte arg2) {
        if (arg2 <= 30) {
            method1157(-78, -41, (byte) -96);
        }
        field2804++;
        if (class242.field4290 < 2 && class31.field585 == 0 && !class187.field3339) {
            return;
        }
        class46 var3;
        if (class31.field585 == 1 && class242.field4290 < 2) {
            var3 = class109.method855(0, new class46[] { class89.field1687, class56.field945, class32.field606, class216.field3832 });
        } else if (class187.field3339 && class242.field4290 < 2) {
            var3 = class109.method855(0, new class46[] { class64.field1083, class56.field945, class16.field232, class216.field3832 });
        } else {
            var3 = class155.method1147((byte) -53, class242.field4290 - 1);
        }
        if (class242.field4290 > 2) {
            var3 = class109.method855(0, new class46[] { var3, class245.field4359, class115.method932(false, class242.field4290 - 2), class6.field106 });
        }
        int var4 = class190.field3384.method157(var3, arg1 + 4, arg0 + 15, 16777215, 0, class174.field3138, class122.field2273);
        class109.method861(0, arg1 + 4, 15, arg0, var4 + class190.field3384.method153(var3));
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)Ltc;")
    public static final class236 method1158(int arg0, int arg1) {
        class236 var2 = (class236) class111.field2100.method86(7961, (long) arg0);
        field2802++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class116.field2184.method1293(class186.method1348(0, arg0), class109.method847((byte) -109, arg0), (byte) 96);
        class236 var4 = new class236();
        var4.field4146 = arg0;
        if (var3 != null) {
            var4.method1612(new class75(var3), 256);
        }
        var4.method1616(false);
        if (var4.field4174) {
            var4.field4139 = false;
            var4.field4157 = 0;
        }
        if (!class65.field1089 && var4.field4119) {
            var4.field4145 = null;
        }
        if (arg1 <= 100) {
            method1159((class75) null, -39);
        }
        class111.field2100.method80(var4, (long) arg0, (byte) 67);
        return var4;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)V")
    public abstract void method161(boolean arg0);

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lwe;I)Lhj;")
    public static final class103 method1159(class75 arg0, int arg1) {
        if (arg1 != 2) {
            field2803 = 66;
        }
        field2805++;
        return new class103(arg0.method591(true), arg0.method591(true), arg0.method591(true), arg0.method591(true), arg0.method559(arg1 - 3), arg0.method559(-1), arg0.method558(1));
    }
}
