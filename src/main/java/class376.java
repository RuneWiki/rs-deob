import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public class class376 extends IOException {

    @OriginalMember(owner = "client!up", name = "b", descriptor = "Ljd;")
    public static class539 field5109 = new class539();

    @OriginalMember(owner = "client!up", name = "f", descriptor = "Lcq;")
    public static class110 field5113 = new class110(18, -2);

    @OriginalMember(owner = "client!up", name = "g", descriptor = "Lcq;")
    public static class110 field5114 = new class110(105, 8);

    @OriginalMember(owner = "client!up", name = "h", descriptor = "Lsb;")
    public static class305 field5115 = new class305(28, -1);

    @OriginalMember(owner = "client!up", name = "a", descriptor = "I")
    public static int field5108;

    @OriginalMember(owner = "client!up", name = "c", descriptor = "I")
    public static int field5110;

    @OriginalMember(owner = "client!up", name = "d", descriptor = "I")
    public static int field5111;

    @OriginalMember(owner = "client!up", name = "e", descriptor = "I")
    public static int field5112;

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(BI)V", line = 3)
    public static final void method2178(byte arg0, int arg1) {
        class533.field7494 = 2;
        field5110++;
        if (arg0 > -41) {
            method2181((byte) -7);
        }
        class445.field6273 = arg1;
        long var2 = 0L;
        if (class463.field6589 == null) {
            class123.method707(35, -4);
        } else {
            class115 var4 = new class115(class446.method2586(true, class507.method2902(false, class463.field6589)));
            long var5 = var4.method671(0);
            class357.field4791 = var4.method671(0);
            class483.method2795(19326, true, class645.method3614(72, var5), "");
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(I)V", line = 33)
    public static void method2179(int arg0) {
        if (arg0 != -2) {
            field5109 = null;
        }
        field5115 = null;
        field5113 = null;
        field5114 = null;
        field5109 = null;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(BII)I", line = 48)
    public static final int method2180(byte arg0, int arg1, int arg2) {
        field5111++;
        if (arg0 < 15) {
            method2178((byte) -23, 6);
        }
        int var3 = arg2 >>> 31;
        return (arg2 + var3) / arg1 - var3;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(B)V", line = 74)
    public static final void method2181(byte arg0) {
        class19 var1 = class139.field1538;
        synchronized (class139.field1538) {
            class139.field1538.method88(83);
            if (arg0 <= 85) {
                field5114 = null;
            }
        }
        field5108++;
        class19 var2 = class256.field3203;
        synchronized (class256.field3203) {
            class256.field3203.method88(53);
        }
    }

    @OriginalMember(owner = "client!up", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 90)
    public class376(String arg0) {
        super(arg0);
    }
}
