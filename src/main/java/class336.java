import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class336 extends InputStream {

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "I")
    public static int field4942;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "I")
    public static int field4943;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "I")
    public static int field4944;

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "I")
    public static int field4945;

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "I")
    public static int field4946;

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "I")
    public static int field4947;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)V")
    public static final void method2144(byte arg0) {
        field4942++;
        class621.field8441 = new class59();
        if (arg0 < 121) {
            field4947 = 14;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)V")
    public static final void method2145(int arg0, int arg1) {
        class323.field4728 = arg0;
        if (arg1 != 30000) {
            method2145(30, -94);
        }
        field4946++;
        class669.field9511.method3142(false);
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(B)V")
    public static final void method2146(byte arg0) {
        class288.field3880++;
        int var1 = -41 / ((11 - arg0) / 32);
        field4945++;
        class389.method2326((byte) 118, class348.field5095);
        class253.field3491.method951((byte) -82, 0);
    }

    @OriginalMember(owner = "client!gg", name = "read", descriptor = "()I")
    public final int read() {
        field4943++;
        class660.method3668(-1, 30000L);
        return -1;
    }

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "(B)[Lnn;")
    public static final class446[] method2147(byte arg0) {
        field4944++;
        if (arg0 != -59) {
            field4947 = -117;
        }
        return new class446[] { class516.field7080, class107.field1296, class410.field5752, class341.field5006, class50.field666, class528.field7313, class299.field3996, class679.field9658, class170.field2118, class440.field6063, class579.field7998, class420.field5861, class433.field6007, class100.field1220, class165.field2075, class49.field660 };
    }
}
