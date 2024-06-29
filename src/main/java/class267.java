import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public abstract class class267 {

    @OriginalMember(owner = "client!c", name = "f", descriptor = "Lha;")
    private static class46 field4618 = class271.method1828(" is already on your friend list)3", -46);

    @OriginalMember(owner = "client!c", name = "o", descriptor = "Lha;")
    public static class46 field4627 = field4618;

    @OriginalMember(owner = "client!c", name = "n", descriptor = "I")
    public static int field4626 = 0;

    @OriginalMember(owner = "client!c", name = "q", descriptor = "Lha;")
    private static class46 field4629 = class271.method1828("glow3:", -46);

    @OriginalMember(owner = "client!c", name = "e", descriptor = "Lha;")
    public static class46 field4617 = field4629;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "Lha;")
    public static class46 field4616 = field4629;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "I")
    public int field4613;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "I")
    public static int field4614;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "I")
    public static int field4615;

    @OriginalMember(owner = "client!c", name = "g", descriptor = "I")
    public int field4619;

    @OriginalMember(owner = "client!c", name = "h", descriptor = "I")
    public int field4620;

    @OriginalMember(owner = "client!c", name = "i", descriptor = "I")
    public int field4621;

    @OriginalMember(owner = "client!c", name = "j", descriptor = "I")
    public int field4622;

    @OriginalMember(owner = "client!c", name = "k", descriptor = "I")
    public static int field4623;

    @OriginalMember(owner = "client!c", name = "l", descriptor = "I")
    public static int field4624;

    @OriginalMember(owner = "client!c", name = "m", descriptor = "I")
    public static int field4625;

    @OriginalMember(owner = "client!c", name = "p", descriptor = "I")
    public int field4628;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)[Lkg;")
    public static final class21[] method1788(int arg0) {
        field4625++;
        class21[] var1 = new class21[class246.field4365];
        for (int var2 = arg0; var2 < class246.field4365; var2++) {
            int var3 = class219.field3858[var2] * class118.field2209[var2];
            int[] var4 = new int[var3];
            byte[] var5 = class273.field4765[var2];
            for (int var6 = 0; var6 < var3; var6++) {
                var4[var6] = class107.field1980[class50.method369(255, var5[var6])];
            }
            var1[var2] = new class21(class222.field3911, class3.field45, class56.field939[var2], class215.field3816[var2], class219.field3858[var2], class118.field2209[var2], var4);
        }
        class242.method1661(29720);
        return var1;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(II)V")
    public abstract void method1278(int arg0, int arg1);

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(I)V")
    public static final void method1789(int arg0) {
        if (class152.field2702 != null) {
            class152.field2702.method1145(11001);
        }
        if (class242.field4293 != null) {
            class242.field4293.method1145(11001);
        }
        field4615++;
        if (arg0 < 49) {
            method1788(-79);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(B)V")
    public static void method1790(byte arg0) {
        field4617 = null;
        field4616 = null;
        field4627 = null;
        if (arg0 == 77) {
            field4629 = null;
            field4618 = null;
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(B)V")
    public static final void method1791(byte arg0) {
        field4624++;
        int var1 = 116 / ((arg0 - 35) / 50);
        class74.field1332.method84(-32377);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(III)V")
    public abstract void method1286(int arg0, int arg1, int arg2);
}
