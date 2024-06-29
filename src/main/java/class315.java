import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class315 implements class496 {

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
    public int field4743;

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "[I")
    public static int[] field4747 = new int[5];

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "Lkh;")
    public static class13 field4745 = new class13(5);

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "Lob;")
    public static class521 field4750 = new class521(80, 3);

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "Lak;")
    public static class234 field4751 = new class234(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "Z")
    public static boolean field4752 = false;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "I")
    public static int field4744;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "I")
    public static int field4746;

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "I")
    public static int field4748;

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "I")
    public static int field4749;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(B)V")
    public static void method2016(byte arg0) {
        field4751 = null;
        field4750 = null;
        if (arg0 < 34) {
            method2016((byte) -29);
        }
        field4745 = null;
        field4747 = null;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lya;ILuq;)V")
    public static final void method2017(class38 arg0, int arg1, class114 arg2) {
        field4744++;
        boolean var3 = class390.field5847.method468(arg2.field1621, arg2.field1723 ? class398.field5947.field2667 : null, arg2.field1613, arg2.field1697, -118, arg1 | arg2.field1664, arg2.field1670, arg0) == null;
        if (var3) {
            class36.field404.method994(new class506(arg2.field1670, arg2.field1621, arg2.field1697, arg2.field1664 | 0xFF000000, arg2.field1613, arg2.field1723), -3610);
            class262.method1747(20556, arg2);
        }
    }

    @OriginalMember(owner = "client!qd", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4749++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class315(String arg0, int arg1) {
        this.field4743 = arg1;
    }
}
