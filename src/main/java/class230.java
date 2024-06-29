import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class230 {

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "Lqe;")
    public static class179 field4248 = class206.method1380("Der Server wird gerade aktualisiert)3", (byte) 71);

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "Lqe;")
    public static class179 field4249 = class206.method1380("<col=c0ff00>", (byte) -10);

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "Lqe;")
    public static class179 field4252 = class206.method1380("W-=hlen Sie eine Option", (byte) -128);

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "I")
    public static int field4254 = 5063219;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "I")
    public static int field4247;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
    public static int field4250;

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "I")
    public static int field4251;

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "I")
    public static int field4253;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "[Lfc;")
    public static class58[] field4246;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)V")
    public static void method1509(byte arg0) {
        if (arg0 == 35) {
            field4252 = null;
            field4246 = null;
            field4249 = null;
            field4248 = null;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V")
    public static final void method1510(int arg0) {
        if (arg0 != 5063219) {
            method1510(10);
        }
        field4250++;
        while (true) {
            class36 var1 = class111.field2090;
            class127 var2;
            synchronized (class111.field2090) {
                var2 = (class127) class77.field1495.method230(arg0 ^ 0xFFB2BDB6);
            }
            if (var2 == null) {
                return;
            }
            var2.field2319.method327(13512, (int) var2.field1694, var2.field2325, var2.field2317, false);
        }
    }
}
