import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class537 extends class496 {

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "I")
    public int field7938 = -1;

    @OriginalMember(owner = "client!nc", name = "t", descriptor = "I")
    public int field7947 = 0;

    @OriginalMember(owner = "client!nc", name = "p", descriptor = "Lrk;")
    public static class419 field7943 = new class419();

    @OriginalMember(owner = "client!nc", name = "w", descriptor = "Ljava/lang/String;")
    public static String field7950 = "";

    @OriginalMember(owner = "client!nc", name = "x", descriptor = "Lqp;")
    public static class586 field7951 = new class586(71, 6);

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "I")
    public int field7936;

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "I")
    public int field7937;

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
    public int field7939;

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
    public int field7940;

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
    public int field7941;

    @OriginalMember(owner = "client!nc", name = "o", descriptor = "I")
    public static int field7942;

    @OriginalMember(owner = "client!nc", name = "q", descriptor = "I")
    public int field7944;

    @OriginalMember(owner = "client!nc", name = "r", descriptor = "I")
    public int field7945;

    @OriginalMember(owner = "client!nc", name = "s", descriptor = "I")
    public int field7946;

    @OriginalMember(owner = "client!nc", name = "u", descriptor = "I")
    public int field7948;

    @OriginalMember(owner = "client!nc", name = "v", descriptor = "I")
    public int field7949;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V")
    public static void method3156(byte arg0) {
        field7943 = null;
        field7950 = null;
        if (arg0 != -69) {
            method3157(-109);
        }
        field7951 = null;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V")
    public static final void method3157(int arg0) {
        class325 var1 = class161.field2155;
        synchronized (class161.field2155) {
            class161.field2155.method2024((byte) -111);
        }
        field7942++;
        class325 var2 = class19.field173;
        synchronized (class19.field173) {
            class19.field173.method2024((byte) -99);
        }
        if (arg0 > -26) {
            field7943 = null;
        }
    }
}
