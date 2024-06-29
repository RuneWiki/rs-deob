import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class311 {

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "Lvh;")
    public static class84 field4403 = new class84(5000);

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "I")
    public static int field4404;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "Lpg;")
    public static class454 field4402;

    @OriginalMember(owner = "client!vq", name = "d", descriptor = "[Lvf;")
    public static class56[] field4405;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(B)V")
    public static void method1983(byte arg0) {
        field4403 = null;
        if (arg0 > -53) {
            field4403 = null;
        }
        field4405 = null;
        field4402 = null;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(III)Lpf;")
    public static final class18 method1984(int arg0, int arg1, int arg2) {
        field4404++;
        class18 var3 = new class18();
        var3.field182 = arg1;
        var3.field180 = arg2 + 6;
        var3.field187 = -1;
        var3.field179 = arg0 + 6;
        var3.field176 = new int[var3.field179][var3.field180];
        var3.method118(arg1 + 3175);
        return var3;
    }
}
