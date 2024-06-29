import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class269 {

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "[Z")
    public static boolean[] field4778 = new boolean[100];

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "Ljd;")
    public static class85 field4781 = class221.method1499("<col=ff9040>", (byte) -90);

    @OriginalMember(owner = "client!jh", name = "i", descriptor = "I")
    public static int field4786 = 0;

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "Ljd;")
    public static class85 field4779 = class98.method690(160, false);

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "I")
    public static int field4782;

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "I")
    public static int field4783;

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "I")
    public static int field4784;

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "I")
    public static int field4785;

    @OriginalMember(owner = "client!jh", name = "j", descriptor = "I")
    public static int field4787;

    @OriginalMember(owner = "client!jh", name = "k", descriptor = "Lge;")
    public static class68 field4788;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "[I")
    public static int[] field4780;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)V")
    public static void method1847(byte arg0) {
        field4788 = null;
        field4781 = null;
        field4779 = null;
        field4778 = null;
        field4780 = null;
        if (arg0 != -17) {
            field4788 = null;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(BLge;II)[Lfg;")
    public static final class12[] method1848(byte arg0, class68 arg1, int arg2, int arg3) {
        int var4 = 30 / ((arg0 + 83) / 43);
        field4783++;
        return class253.method1750(arg2, arg1, (byte) 124, arg3) ? class195.method1331((byte) -6) : null;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZI)V")
    public static final void method1849(boolean arg0, int arg1) {
        class52.field903.method1267(arg1, (byte) -115);
        if (!arg0) {
            class48.field848.method1267(arg1, (byte) -35);
            field4785++;
            class185.field3185.method1267(arg1, (byte) -59);
            class171.field2944.method1267(arg1, (byte) -118);
        }
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(B)V")
    public static final void method1850(byte arg0) {
        field4784++;
        try {
            if (class230.field3983 == 1) {
                int var1 = class201.field3511.method777(-7425);
                if (var1 > 0 && class201.field3511.method794(-99)) {
                    int var2 = var1 - class40.field635;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class201.field3511.method801(7692, var2);
                    return;
                }
                class201.field3511.method797(104);
                class201.field3511.method792(-87);
                if (field4788 == null) {
                    class230.field3983 = 0;
                } else {
                    class230.field3983 = 2;
                }
                class223.field3900 = null;
                class193.field3297 = null;
            }
            if (arg0 >= -60) {
                field4781 = null;
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class201.field3511.method797(63);
            class223.field3900 = null;
            class193.field3297 = null;
            field4788 = null;
            class230.field3983 = 0;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IB)V")
    public static final void method1851(int arg0, byte arg1) {
        field4782++;
        class186 var2 = (class186) class172.field2975.method1398(arg1 - 97, (long) arg0);
        if (arg1 != 98) {
            method1849(true, -53);
        }
        if (var2 != null) {
            var2.method1753(arg1 ^ 0xEB);
        }
    }
}
