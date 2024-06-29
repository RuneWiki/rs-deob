import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class472 extends class320 {

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "I")
    public volatile int field7074 = -1;

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "Ljava/lang/String;")
    public volatile String field7076;

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field7075 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "I")
    public static int field7077;

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 28)
    public class472(String arg0) {
        this.field7076 = arg0;
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(I)V", line = 12)
    public static void method2832(int arg0) {
        if (arg0 == -1) {
            field7075 = null;
        }
    }
}
