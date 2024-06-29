import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class375 {

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "Lff;")
    public static class9 field5090 = new class9(66, 10);

    @OriginalMember(owner = "client!vi", name = "h", descriptor = "I")
    public static int field5091 = 0;

    @OriginalMember(owner = "client!vi", name = "k", descriptor = "I")
    public static int field5094 = 0;

    @OriginalMember(owner = "client!vi", name = "j", descriptor = "Lwl;")
    public static class280 field5093 = new class280();

    @OriginalMember(owner = "client!vi", name = "m", descriptor = "I")
    public static int field5096 = 0;

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "B")
    public byte field5086;

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "I")
    public static int field5085;

    @OriginalMember(owner = "client!vi", name = "i", descriptor = "I")
    public static int field5092;

    @OriginalMember(owner = "client!vi", name = "l", descriptor = "I")
    public int field5095;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "Ljava/lang/String;")
    public String field5084;

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "Ljava/lang/String;")
    public String field5087;

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "Ljava/lang/String;")
    public String field5088;

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "Ljava/lang/String;")
    public String field5089;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)V")
    public static void method2175(byte arg0) {
        field5090 = null;
        if (arg0 > -62) {
            field5093 = null;
        }
        field5093 = null;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILpc;I)Lat;")
    public static final class255 method2176(int arg0, class473 arg1, int arg2) {
        field5085++;
        byte[] var3 = arg1.method2707(arg0, 0);
        if (arg2 > -47) {
            field5090 = null;
        }
        return var3 == null ? null : new class255(var3);
    }
}
