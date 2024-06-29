import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class477 {

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field6575;

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "Lcu;")
    public static class145 field6576;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "I")
    public static int field6571;

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "I")
    public static int field6572;

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
    public static int field6573;

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "I")
    public static int field6574;

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "I")
    public static int field6577;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V")
    public static void method2739(int arg0) {
        field6576 = null;
        field6575 = null;
        if (arg0 != 23450) {
            field6576 = null;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IB)V")
    public static final void method2740(int arg0, byte arg1) {
        if (arg1 < -64) {
            field6574++;
            class479.field6612 = arg0;
            class112.field1609.method1458((byte) 94);
        }
    }

    static {
        new class304("You are temporarily banned from this clan channel.", "Du wurdest temporär aus diesem Chatraum verbannt.", "Vous êtes temporairement exclu de ce canal de clan.", "Você está temporariamente vetado de entrar nesse canal de clã.");
        field6575 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
        field6576 = new class145(30, 7);
    }
}
