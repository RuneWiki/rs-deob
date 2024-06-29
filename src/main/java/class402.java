import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jba")
public class class402 {

    @OriginalMember(owner = "client!jba", name = "b", descriptor = "Lnd;")
    private class547 field5097;

    @OriginalMember(owner = "client!jba", name = "e", descriptor = "I")
    public int field5100;

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "I")
    public static int field5096;

    @OriginalMember(owner = "client!jba", name = "d", descriptor = "I")
    public static int field5099;

    @OriginalMember(owner = "client!jba", name = "c", descriptor = "Liea;")
    public static class481 field5098;

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(B)V", line = 3)
    public static final void method2242(byte arg0) throws IOException {
        if (class12.field143 != null && class28.field506 > 0) {
            class31.field528.field6193 = 0;
            while (true) {
                class589 var1 = (class589) class586.field8185.method3672(-1);
                if (var1 == null || (class31.field528.field6180.length - class31.field528.field6193) < var1.field8252) {
                    class12.field143.method2306((byte) -120, class31.field528.field6180, 0, class31.field528.field6193);
                    class214.field2828 += class31.field528.field6193;
                    class688.field9586 = 0;
                    break;
                }
                class31.field528.method2614(3, 0, var1.field8251.field6180, var1.field8252);
                class28.field506 -= var1.field8252;
                var1.method1175(-2);
                var1.field8251.method2592((byte) 127);
                var1.method3347((byte) 101);
            }
        }
        field5096++;
        if (arg0 != 18) {
            method2243(114);
        }
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(I)Z", line = 45)
    public static final boolean method2243(int arg0) {
        if (arg0 != 0) {
            method2244((byte) 16);
        }
        field5099++;
        if (class760.field10602) {
            try {
                class568.method3263("showVideoAd", class64.field900, false);
                return true;
            } catch (Throwable var1) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!jba", name = "b", descriptor = "(B)V", line = 71)
    public static void method2244(byte arg0) {
        if (arg0 != 33) {
            field5098 = null;
        }
        field5098 = null;
    }

    @OriginalMember(owner = "client!jba", name = "<init>", descriptor = "(Lal;ILnd;)V", line = 88)
    public class402(class102 arg0, int arg1, class547 arg2) {
        new class534(64);
        this.field5097 = arg2;
        this.field5100 = this.field5097.method3178((byte) 81, 15);
    }
}
