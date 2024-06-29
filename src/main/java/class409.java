import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kda")
public class class409 extends class97 {

    @OriginalMember(owner = "client!kda", name = "e", descriptor = "I")
    public static int field5788;

    @OriginalMember(owner = "client!kda", name = "f", descriptor = "I")
    public static int field5789;

    @OriginalMember(owner = "client!kda", name = "g", descriptor = "I")
    public static int field5790;

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(BLpja;)V")
    public static final void method2457(byte arg0, class43 arg1) {
        field5789++;
        class583.field7921.method689(arg1, 116);
        arg1.field459 = arg1.field457.field3725;
        arg1.field457.field3725 = 0;
        class426.field6202 += arg1.field459;
        if (arg0 != -100) {
            method2457((byte) -60, null);
        }
    }

    @OriginalMember(owner = "client!kda", name = "b", descriptor = "(III)I")
    public static final int method2458(int arg0, int arg1, int arg2) {
        field5788++;
        if (arg1 >= -5) {
            method2457((byte) -92, null);
        }
        byte var3;
        if (arg2 > 20000) {
            var3 = 4;
            class630.method3480(false);
        } else if (arg2 > 10000) {
            class383.method2379(-2);
            var3 = 3;
        } else if (arg2 <= 5000) {
            class37.method212(28974, true);
            var3 = 1;
        } else {
            var3 = 2;
            class517.method3013((byte) -126);
        }
        if (arg0 != class125.field1721.field5141.method2541(43)) {
            class125.field1721.method2255(true, arg0, class125.field1721.field5140);
            class399.method2434(false, (byte) -41, arg0);
        }
        class515.method3006(-2);
        return var3;
    }
}
