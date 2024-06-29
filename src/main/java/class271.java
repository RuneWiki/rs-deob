import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class271 extends OutputStream {

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "[I")
    public static int[] field4651 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "[Lbj;")
    public static class55[] field4654 = new class55[28];

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "I")
    public static int field4649;

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "I")
    public static int field4650;

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "I")
    public static int field4652;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "Lek;")
    public static class185 field4653;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(II)Lij;", line = 4)
    public static final class83 method1909(int arg0, int arg1) {
        field4652++;
        class83 var2 = (class83) class217.field3730.method229((long) arg1, -14);
        if (var2 != null) {
            return var2;
        }
        int var3 = 35 % ((74 - arg0) / 33);
        byte[] var4 = class160.field2710.method1275(class324.method2185(arg1, 12), class292.method2029(arg1, (byte) -30), -5211);
        class83 var5 = new class83();
        var5.field1580 = arg1;
        if (var4 != null) {
            var5.method589(new class14(var4), 0);
        }
        var5.method603(-6);
        if (var5.field1584) {
            var5.field1551 = 0;
            var5.field1592 = false;
        }
        if (!class307.field5191 && var5.field1594) {
            var5.field1588 = null;
        }
        class217.field3730.method227(-25077, var5, (long) arg1);
        return var5;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)V", line = 44)
    public static void method1910(byte arg0) {
        field4654 = null;
        if (arg0 != 115) {
            method1911(-59, 58, -69, -79, -91);
        }
        field4653 = null;
        field4651 = null;
    }

    @OriginalMember(owner = "client!jh", name = "write", descriptor = "(I)V", line = 78)
    public final void write(int arg0) throws IOException {
        field4650++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIII)V", line = 104)
    public static final void method1911(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != 0) {
            method1911(-71, -56, -24, 126, 123);
        }
        if (class149.field2578 <= arg0 && arg0 <= class327.field5490) {
            int var5 = class129.method909(class56.field991, arg3 ^ 0x0, arg1, class142.field2458);
            int var6 = class129.method909(class56.field991, 0, arg2, class142.field2458);
            class329.method2243(arg4, var6, -7, var5, arg0);
        }
        field4649++;
    }
}
