import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public abstract class class333 {

    @OriginalMember(owner = "client!is", name = "c", descriptor = "[F")
    public static float[] field4711 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!is", name = "a", descriptor = "I")
    public static int field4709;

    @OriginalMember(owner = "client!is", name = "d", descriptor = "I")
    public static int field4712;

    @OriginalMember(owner = "client!is", name = "e", descriptor = "I")
    public static int field4713;

    @OriginalMember(owner = "client!is", name = "b", descriptor = "[Luq;")
    public static class318[] field4710;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(B)V")
    public static void method2128(byte arg0) {
        field4710 = null;
        field4711 = null;
        if (arg0 != -83) {
            method2131((byte) -66, -100, 116);
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(Z)J")
    public abstract long method2129(boolean arg0);

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(BLwq;)V")
    public static final void method2130(byte arg0, class679 arg1) {
        field4709++;
        if (arg0 < 120) {
            return;
        }
        for (class457 var2 = (class457) class649.field8701.method3618(89); var2 != null; var2 = (class457) class649.field8701.method3619(0)) {
            if (var2.field6333 == arg1) {
                if (var2.field6340 != null) {
                    class483.field6739.method361(var2.field6340);
                    var2.field6340 = null;
                }
                var2.method549(6410);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(BII)V")
    public static final void method2131(byte arg0, int arg1, int arg2) {
        field4713++;
        if (class217.field2826 != 0) {
            if (arg2 >= 0) {
                class240.field3592[arg2] = arg1;
            } else {
                for (int var3 = 0; var3 < 16; var3++) {
                    class240.field3592[var3] = arg1;
                }
            }
        }
        class149.field2066.method1788(arg1, arg2, 16256);
        if (arg0 > -46) {
            method2131((byte) -63, 112, -47);
        }
    }
}
