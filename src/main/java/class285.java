import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class285 {

    @OriginalMember(owner = "client!re", name = "a", descriptor = "I")
    public static int field4623 = 0;

    @OriginalMember(owner = "client!re", name = "p", descriptor = "Lok;")
    private static class41 field4638 = class137.method956("wishes to trade with you)3", 45);

    @OriginalMember(owner = "client!re", name = "h", descriptor = "Lok;")
    public static class41 field4630 = field4638;

    @OriginalMember(owner = "client!re", name = "j", descriptor = "Lak;")
    public static class20 field4632 = new class20(64);

    @OriginalMember(owner = "client!re", name = "s", descriptor = "I")
    public static int field4641 = 0;

    @OriginalMember(owner = "client!re", name = "u", descriptor = "[Lua;")
    public static class264[] field4643 = new class264[50];

    @OriginalMember(owner = "client!re", name = "t", descriptor = "Lol;")
    public static class118 field4642 = new class118(5000);

    @OriginalMember(owner = "client!re", name = "v", descriptor = "Lok;")
    public static class41 field4644 = class137.method956(" ", 45);

    @OriginalMember(owner = "client!re", name = "b", descriptor = "I")
    public static int field4624;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "I")
    public int field4627;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "I")
    public static int field4628;

    @OriginalMember(owner = "client!re", name = "i", descriptor = "I")
    public static int field4631;

    @OriginalMember(owner = "client!re", name = "k", descriptor = "I")
    public int field4633;

    @OriginalMember(owner = "client!re", name = "l", descriptor = "I")
    public static int field4634;

    @OriginalMember(owner = "client!re", name = "n", descriptor = "I")
    public int field4636;

    @OriginalMember(owner = "client!re", name = "o", descriptor = "I")
    public int field4637;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "J")
    public long field4625;

    @OriginalMember(owner = "client!re", name = "g", descriptor = "Lth;")
    public class126 field4629;

    @OriginalMember(owner = "client!re", name = "m", descriptor = "Lth;")
    public class126 field4635;

    @OriginalMember(owner = "client!re", name = "q", descriptor = "Lth;")
    public class126 field4639;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "Lfm;")
    public static class94 field4626;

    @OriginalMember(owner = "client!re", name = "r", descriptor = "[B")
    public static byte[] field4640;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(II)Z", line = 6)
    public static final boolean method1999(int arg0, int arg1) {
        field4624++;
        if (arg1 >= -112) {
            return true;
        } else {
            return ((arg0 & 0x1DAB6DAA) >> 28) != 0;
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(II)Lrk;", line = 43)
    public static final class205 method2000(int arg0, int arg1) {
        field4628++;
        class205 var2 = (class205) class165.field2608.method136((long) arg0, true);
        if (arg1 != 4442) {
            return (class205) null;
        } else if (var2 == null) {
            byte[] var3 = class248.field3962.method454(class41.method283(12770, arg0), arg1 - 4442, class22.method149(-20182, arg0));
            class205 var4 = new class205();
            if (var3 != null) {
                var4.method1448(65535, new class112(var3));
            }
            var4.method1453(125);
            class165.field2608.method132((long) arg0, var4, -1);
            return var4;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(B)V", line = 70)
    public static void method2001(byte arg0) {
        field4630 = null;
        field4626 = null;
        field4644 = null;
        field4632 = null;
        field4642 = null;
        field4643 = null;
        field4640 = null;
        if (arg0 > 24) {
            field4638 = null;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(III)Luh;", line = 87)
    public static final class241 method2002(int arg0, int arg1, int arg2) {
        class308 var3 = class205.field3312[arg0][arg1][arg2];
        return var3 == null ? null : var3.field5210;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)Lmg;", line = 95)
    public static final class314 method2003(int arg0) {
        field4631++;
        if (arg0 != 0) {
            return (class314) null;
        }
        class314 var1;
        if (class166.field2625) {
            var1 = new class11(class204.field3299, class205.field3318, class95.field1412[0], class314.field5288[0], class69.field1040[0], class173.field2812[0], class223.field3562[0], class312.field5263);
        } else {
            var1 = new class279(class204.field3299, class205.field3318, class95.field1412[0], class314.field5288[0], class69.field1040[0], class173.field2812[0], class223.field3562[0], class312.field5263);
        }
        class286.method2005((byte) -9);
        return var1;
    }
}
