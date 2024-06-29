import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class257 {

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "Lpfa;")
    public static class299 field3259 = new class299();

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "Lkg;")
    public static class275 field3261 = new class275(46, 4);

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "[I")
    public static int[] field3265 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "Lhg;")
    public static class693 field3266 = new class693(67, 8);

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "[F")
    public static float[] field3267 = new float[2];

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
    public static int field3262;

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "Lr;")
    public class185 field3264;

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "Lka;")
    public class474 field3263;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(III)Z", line = 5)
    public static final boolean method1561(int arg0, int arg1, int arg2) {
        field3262++;
        int var3 = -64 / ((arg2 - 9) / 54);
        return (arg0 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IB)V", line = 21)
    public static final void method1562(int arg0, byte arg1) {
        field3260++;
        if (arg1 != -40) {
            field3265 = null;
        }
        class375 var2 = (class375) class297.field3910.method1160((long) arg0, 127);
        if (var2 != null) {
            var2.field4804 = !var2.field4804;
            var2.field4807.method2918(-12405, var2.field4804);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V", line = 43)
    public static void method1563(int arg0) {
        field3261 = null;
        field3265 = null;
        field3267 = null;
        field3266 = null;
        field3259 = null;
        if (arg0 <= 52) {
            method1563(-14);
        }
    }
}
