import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class319 {

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
    public static int field5194 = 0;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "[[S")
    public static short[][] field5197 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
    public static int field5191;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
    public static int field5192;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
    public static int field5193;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
    public static int field5195;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "I")
    public static int field5198;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
    public static int field5199;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "I")
    public static int field5200;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "[B")
    public static byte[] field5196;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZLek;)V", line = 19)
    public static final void method2296(boolean arg0, class206 arg1) {
        if (!arg0) {
            method2297(-78, -38, -21, true, 101);
        }
        class345.field5506 = arg1;
        field5193++;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIZI)V", line = 38)
    public static final void method2297(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field5200++;
        class189.method1309(-1, false);
        class282.field4614 = arg1;
        class178.field2941 = arg2;
        class185.field3178 = arg3;
        class38.method277(arg0);
        if (arg4 != 0) {
            method2300(false);
        }
        class334.field5324 = new class328(8);
        class321.field5219 = new class328(8);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[B)Ldj;", line = 55)
    public static final class361 method2298(int arg0, byte[] arg1) {
        field5198++;
        if (arg1 == null) {
            return null;
        }
        if (arg0 != 10304) {
            method2297(106, -21, -33, false, -119);
        }
        class361 var2 = new class361(arg1, class321.field5218, class232.field3804, class9.field284, class76.field1367, class309.field5053);
        class213.method1470(false);
        return var2;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V", line = 72)
    public static final void method2299(boolean arg0) {
        field5195++;
        try {
            if (arg0) {
                method2298(5, (byte[]) null);
            }
            if (class222.field3671 == 1) {
                int var1 = class349.field5586.method2462(false);
                if (var1 > 0 && class349.field5586.method2448(27736)) {
                    int var2 = var1 - class316.field5136;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class349.field5586.method2437(-27441, var2);
                    return;
                }
                class349.field5586.method2429(true);
                class349.field5586.method2426(-78);
                class57.field1134 = null;
                if (class257.field4202 == null) {
                    class222.field3671 = 0;
                } else {
                    class222.field3671 = 2;
                }
                class104.field1904 = null;
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class349.field5586.method2429(true);
            class257.field4202 = null;
            class222.field3671 = 0;
            class104.field1904 = null;
            class57.field1134 = null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Z)V", line = 119)
    public static void method2300(boolean arg0) {
        if (arg0) {
            method2296(true, (class206) null);
        }
        field5197 = (short[][]) null;
        field5196 = null;
    }
}
