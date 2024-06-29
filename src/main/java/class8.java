import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class8 {

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "Luk;")
    public static class96 field260 = new class96(30);

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "I")
    public static int field263 = -1;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "I")
    public static int field259;

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "I")
    public static int field261;

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!rj", name = "h", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)V")
    public static final void method53(int arg0) {
        field264++;
        class208.field3766++;
        if (arg0 != 30) {
            method53(118);
        }
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(I)V")
    public static void method54(int arg0) {
        if (arg0 >= -84) {
            field259 = -97;
        }
        field260 = null;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lqk;B)Lpf;")
    public static final class273 method55(class200 arg0, byte arg1) {
        arg0.method1408((byte) -76);
        field265++;
        int var2 = arg0.method1408((byte) -82);
        if (arg1 != -79) {
            return null;
        }
        class273 var3 = class205.method1460(var2, 0);
        var3.field4806 = arg0.method1408((byte) -103);
        int var4 = arg0.method1408((byte) -29);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg0.method1408((byte) -128);
            var3.method34(var6, arg0, arg1 ^ 0x71);
        }
        var3.method84(4095);
        return var3;
    }
}
