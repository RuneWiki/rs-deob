import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class301 {

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "Lvj;")
    public static class402 field3936 = new class402(1);

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "I")
    public static int field3935;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "I")
    public static int field3937;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lep;I)V", line = 3)
    public static final void method1702(class382 arg0, int arg1) {
        if (arg1 != 0) {
            return;
        }
        field3937++;
        if (class372.field4837 != arg0.field5091) {
            return;
        }
        if (class377.field4914.field6324 == null) {
            arg0.field5072 = 0;
            arg0.field5028 = 0;
            return;
        }
        arg0.field5004 = 150;
        arg0.field5043 = (int) (Math.sin((double) class469.field6549 / 40.0D) * 256.0D) & 0x7FF;
        arg0.field5038 = 5;
        arg0.field5072 = class90.field1038;
        arg0.field5028 = class116.method706(class377.field4914.field6324, (byte) 66);
        arg0.field5048 = class377.field4914.field3782;
        arg0.field5061 = class377.field4914.field3738;
        arg0.field4956 = 0;
        arg0.field5027 = class377.field4914.field3773;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)V", line = 37)
    public static void method1703(byte arg0) {
        field3936 = null;
        if (arg0 < 68) {
            method1702(null, -45);
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(B)V", line = 55)
    public static final void method1704(byte arg0) {
        field3935++;
        class662.method3720(32767);
        if (arg0 != 115) {
            method1704((byte) 71);
        }
        class270.field3402 = null;
        class337.field4413 = null;
        class113.field1323 = null;
        class205.field2503 = null;
        class14.field135 = null;
    }
}
