import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class77 {

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "I")
    public static int field792 = -1;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "Lsb;")
    public static class305 field791 = new class305(36, 7);

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "I")
    public static int field793;

    @OriginalMember(owner = "client!jp", name = "d", descriptor = "I")
    public static int field794;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(B)V")
    public static void method409(byte arg0) {
        if (arg0 < 38) {
            method410(null, -92, -24);
        }
        field791 = null;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "([Lwp;II)V")
    public static final void method410(class452[] arg0, int arg1, int arg2) {
        field793++;
        int var3 = 0;
        if (arg2 >= -90) {
            method409((byte) 79);
        }
        while (var3 < arg0.length) {
            class452 var4 = arg0[var3];
            if (var4 != null) {
                if (var4.field6471 == 0) {
                    if (var4.field6399 != null) {
                        method410(var4.field6399, arg1, -127);
                    }
                    class633 var5 = (class633) class14.field117.method3669((long) var4.field6339, -1);
                    if (var5 != null) {
                        class633.method3561(false, var5.field8920, arg1);
                    }
                }
                if (arg1 == 0 && var4.field6475 != null) {
                    class213 var6 = new class213();
                    var6.field2592 = var4;
                    var6.field2587 = var4.field6475;
                    class281.method1642(var6);
                }
                if (arg1 == 1 && var4.field6425 != null) {
                    label62: {
                        if (var4.field6360 >= 0) {
                            class452 var7 = class92.method464(var4.field6339, -167823504);
                            if (var7 == null || var7.field6399 == null || var7.field6399.length <= var4.field6360 || var7.field6399[var4.field6360] != var4) {
                                break label62;
                            }
                        }
                        class213 var8 = new class213();
                        var8.field2592 = var4;
                        var8.field2587 = var4.field6425;
                        class281.method1642(var8);
                    }
                }
            }
            var3++;
        }
    }
}
