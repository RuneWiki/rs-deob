import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uha")
public class class255 extends class316 {

    @OriginalMember(owner = "client!uha", name = "t", descriptor = "J")
    private long field3751 = -1L;

    @OriginalMember(owner = "client!uha", name = "r", descriptor = "Ljava/lang/String;")
    private String field3749 = null;

    @OriginalMember(owner = "client!uha", name = "s", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3750 = new BigInteger("b6734208529cf5b9c3d32fb978cc3c51c4cba115b1bbfee93db64b3e7d37af5c9fa8d7845f53af429d2da7f674a6a580b8823057a8bc707633c72456dfecbc3b", 16);

    @OriginalMember(owner = "client!uha", name = "p", descriptor = "I")
    public static int field3747;

    @OriginalMember(owner = "client!uha", name = "q", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!uha", name = "u", descriptor = "I")
    public static int field3752;

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(BLmda;)V", line = 6)
    public final void method152(byte arg0, class276 arg1) {
        if (arg0 < 80) {
            this.method148(-27, null);
        }
        field3748++;
        arg1.method1794(-21876, this.field3751, this.field3749);
    }

    @OriginalMember(owner = "client!uha", name = "c", descriptor = "(B)V", line = 18)
    public static void method1663(byte arg0) {
        if (arg0 <= 12) {
            field3750 = null;
        }
        field3750 = null;
    }

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(ILso;)V", line = 45)
    public final void method148(int arg0, class494 arg1) {
        field3747++;
        if (arg1.method2964((byte) 112) != 255) {
            arg1.field7042--;
            this.field3751 = arg1.method3005(-119);
        }
        this.field3749 = arg1.method2984((byte) -92);
        if (class418.field5731) {
            System.out.println("memberhash:" + this.field3751 + " membername:" + this.field3749);
        }
        if (arg0 != -1001) {
            this.method148(0, null);
        }
    }
}
