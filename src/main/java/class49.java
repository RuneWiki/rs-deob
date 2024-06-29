import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class49 {

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "I")
    public static int field818 = 0;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "Lsb;")
    public static class98 field815 = class47.method368("loc", 0);

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "I")
    public static int field819 = 0;

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "[Lsb;")
    public static class98[] field817 = new class98[200];

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "I")
    public static int field820 = 0;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
    public static int field811;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "[I")
    public static int[] field812;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
    public static void method383(int arg0) {
        field812 = null;
        int var1 = -94 / ((arg0 + 15) / 36);
        field815 = null;
        field817 = null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Ltg;III)[Lve;")
    public static final class174[] method384(class75 arg0, int arg1, int arg2, int arg3) {
        field814++;
        if (arg2 != 0) {
            method387(-13, -62);
        }
        return class43.method341(arg0, -1, arg3, arg1) ? class202.method1369((byte) 80) : null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)Lfe;")
    public static final class203 method385(int arg0, int arg1) {
        field811++;
        class203 var2 = (class203) class91.field1606.method1564((long) arg0, arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class185.field3201.method571(class4.method21(true, arg0), class98.method705(arg0, -103), 121);
        class203 var4 = new class203();
        var4.field3475 = arg0;
        if (var3 != null) {
            var4.method1374(new class216(var3), -81);
        }
        class91.field1606.method1563((long) arg0, arg1 ^ 0x550B, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(BZ)V")
    public static final void method386(byte arg0, boolean arg1) {
        if (arg0 != 60) {
            method383(-12);
        }
        field813++;
        class265.method1799(class232.field3992, arg1, 75, class180.field3111, class121.field2227);
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(II)Lha;")
    public static final class20 method387(int arg0, int arg1) {
        class20 var2 = (class20) class252.field4410.method1307((byte) -69, (long) arg0);
        field816++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg0 >= arg1) {
            var3 = class26.field507.method571(0, arg0 & 0x7FFF, arg1 - 32641);
        } else {
            var3 = class41.field668.method571(0, arg0, 125);
        }
        class20 var4 = new class20();
        if (var3 != null) {
            var4.method219(new class216(var3), -3);
        }
        if (arg0 >= 32768) {
            var4.method224((byte) 122);
        }
        class252.field4410.method1312(true, var4, (long) arg0);
        return var4;
    }
}
