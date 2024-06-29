import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class531 extends class548 {

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "J")
    public static long field7311 = 20000000L;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "F")
    public static float field7310;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "I")
    public static int field7313;

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "I")
    public static int field7314;

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "I")
    public static int field7316;

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "Lae;")
    public static class283 field7315;

    @OriginalMember(owner = "client!tc", name = "m", descriptor = "Lfe;")
    public static class344 field7317;

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "Lee;")
    public static class506 field7312;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)V")
    public static void method3151(int arg0) {
        field7317 = null;
        field7315 = null;
        field7312 = null;
        if (arg0 > -71) {
            field7315 = null;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(BLsha;Lsha;)V")
    public static final void method3152(byte arg0, class115 arg1, class115 arg2) {
        field7314++;
        class96.field1128++;
        class116 var3 = class248.method1672(class84.field1023, class497.field6823, -20647);
        var3.field1575.method3003(arg2.field1446, -23061);
        var3.field1575.method2986(arg2.field1458, -54);
        var3.field1575.method2981(arg1.field1458, 128);
        var3.field1575.method3044(arg1.field1482, 37);
        var3.field1575.method2996(arg1.field1446, true);
        if (arg0 > 93) {
            var3.field1575.method3044(arg2.field1482, 99);
            class443.method2655(0, var3);
        }
    }
}
