import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class163 {

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "Lke;")
    public static class256 field2887 = class316.method2202("Cache:", 27626);

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "Lke;")
    public static class256 field2885 = class316.method2202(")2", 27626);

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "[[S")
    public static short[][] field2883 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "I")
    public static int field2890 = 0;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
    public static int field2884 = 0;

    @OriginalMember(owner = "client!sg", name = "k", descriptor = "[I")
    public static int[] field2892 = new int[100];

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "[[Lib;")
    public static class62[][] field2889 = new class62[13][13];

    @OriginalMember(owner = "client!sg", name = "p", descriptor = "Lke;")
    public static class256 field2897 = class316.method2202("n", 27626);

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "I")
    public static int field2882 = 0;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "I")
    public static int field2886;

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!sg", name = "o", descriptor = "I")
    public static int field2896;

    @OriginalMember(owner = "client!sg", name = "n", descriptor = "J")
    public long field2895;

    @OriginalMember(owner = "client!sg", name = "l", descriptor = "Lsg;")
    public class163 field2893;

    @OriginalMember(owner = "client!sg", name = "m", descriptor = "Lsg;")
    public class163 field2894;

    @OriginalMember(owner = "client!sg", name = "q", descriptor = "[I")
    public static int[] field2898;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)Z", line = 19)
    public final boolean method1198(int arg0) {
        field2896++;
        if (arg0 != 24) {
            this.method1198(-43);
        }
        return this.field2894 != null;
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)V", line = 37)
    public final void method1199(int arg0) {
        if (arg0 != 21966) {
            return;
        }
        field2886++;
        if (this.field2894 != null) {
            this.field2894.field2893 = this.field2893;
            this.field2893.field2894 = this.field2894;
            this.field2893 = null;
            this.field2894 = null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(I)V", line = 54)
    public static void method1200(int arg0) {
        field2892 = null;
        if (arg0 != -24797) {
            method1201((class51) null, -33, -93, -106);
        }
        field2885 = null;
        field2887 = null;
        field2897 = null;
        field2889 = (class62[][]) null;
        field2883 = (short[][]) null;
        field2898 = null;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lmc;III)V", line = 92)
    public static final void method1201(class51 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class129.field2264) {
            class271 var4 = class41.field790[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field4628 != null && var4.field4628.field3905.method408()) {
                arg0.method410(var4.field4628.field3905, 128, 0, 0, true);
            }
        }
        if (arg3 < class129.field2264) {
            class271 var5 = class41.field790[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field4628 != null && var5.field4628.field3905.method408()) {
                arg0.method410(var5.field4628.field3905, 0, 0, 128, true);
            }
        }
        if (arg2 < class129.field2264 && arg3 < class57.field1051) {
            class271 var6 = class41.field790[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field4628 != null && var6.field4628.field3905.method408()) {
                arg0.method410(var6.field4628.field3905, 128, 0, 128, true);
            }
        }
        if (arg2 < class129.field2264 && arg3 > 0) {
            class271 var7 = class41.field790[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field4628 != null && var7.field4628.field3905.method408()) {
                arg0.method410(var7.field4628.field3905, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(III)V", line = 163)
    public static final void method1202(int arg0, int arg1, int arg2) {
        class14.field187 = true;
        class90.field1651 = arg0;
        class135.field2353 = arg1;
        class303.field5244 = arg2;
        class91.field1666 = -1;
        class160.field2847 = -1;
    }
}
