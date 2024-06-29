import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class245 {

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "Z")
    public static boolean field4257 = false;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "I")
    public static volatile int field4260 = 0;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "I")
    public static int field4262 = 20;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "Lcd;")
    public static class64 field4261 = class44.method335((byte) 71, "m-Ochte mit Ihnen handeln)3");

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "I")
    public static int field4258;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "I")
    public static int field4259;

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "I")
    public static int field4263;

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "I")
    public static int field4264;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V", line = 10)
    public static void method1776(int arg0) {
        field4261 = null;
        if (arg0 != 20) {
            field4263 = 65;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lkh;ZI)Lcd;", line = 34)
    public static final class64 method1777(class13 arg0, boolean arg1, int arg2) {
        field4264++;
        try {
            class64 var3 = new class64();
            var3.field1274 = arg0.method163(255);
            if (var3.field1274 > arg2) {
                var3.field1274 = arg2;
            }
            var3.field1252 = new byte[var3.field1274];
            if (arg1) {
                arg0.field281 += class3.field26.method1837(arg0.field254, 0, var3.field1274, var3.field1252, -50, arg0.field281);
                return var3;
            } else {
                return (class64) null;
            }
        } catch (Exception var5) {
            return class278.field4801;
        }
    }
}
