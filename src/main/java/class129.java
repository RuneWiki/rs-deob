import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public abstract class class129 {

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "I")
    public int field2478;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
    public int field2475;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
    public int field2481;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "[Z")
    public static boolean[] field2476 = new boolean[100];

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "[Lcc;")
    public static class209[] field2474 = new class209[100];

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2477 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "I")
    public static int field2480 = 50;

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "Lik;")
    public static class260 field2482 = new class260(0, 0);

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "Z")
    public static boolean field2484 = true;

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "I")
    public static int field2488 = 0;

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "Lcc;")
    public static class209 field2487 = class95.method669(127, "");

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "Lbd;")
    public static class185 field2485 = new class185(64);

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "I")
    public static int field2473;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
    public static int field2483;

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "I")
    public static int field2486;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "[I")
    public static int[] field2479;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)I")
    public static final int method924(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BI)V")
    public static final void method925(byte arg0, int arg1) {
        class20.field382.method662(32768, arg1);
        field2486++;
        class251.field4507.method662(32768, arg1);
        class157.field2861.method662(32768, arg1);
        int var2 = -47 % ((-arg0 - 51) / 38);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(III)V")
    public abstract void method96(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(III)V")
    public abstract void method103(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(III)V")
    public class129(int arg0, int arg1, int arg2) {
        this.field2478 = arg2;
        this.field2475 = arg0;
        this.field2481 = arg1;
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(III)V")
    public abstract void method100(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
    public static void method926(int arg0) {
        if (arg0 < 35) {
            return;
        }
        field2479 = null;
        field2487 = null;
        field2482 = null;
        field2477 = null;
        field2476 = null;
        field2485 = null;
        field2474 = null;
    }
}
