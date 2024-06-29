import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class432 {

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "Ljava/util/Random;")
    public static Random field6375 = new Random();

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "I")
    public static int field6370;

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "I")
    public int field6371;

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "I")
    public int field6372;

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "I")
    public static int field6373;

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "I")
    public int field6374;

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "I")
    public int field6376;

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "I")
    public static int field6377;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)Lnm;", line = 3)
    public static final class160 method2742(int arg0) {
        field6373++;
        if (arg0 < 12) {
            return null;
        }
        class160 var1 = (class160) class16.field182.method978((byte) -32);
        if (var1 == null) {
            return new class160();
        } else {
            class326.field4682--;
            return var1;
        }
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(I)V", line = 24)
    public static void method2743(int arg0) {
        field6375 = null;
        if (arg0 <= 46) {
            method2742(-73);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IB)V", line = 36)
    public static final void method2744(int arg0, byte arg1) {
        field6370++;
        class24 var2 = class23.field395;
        synchronized (class23.field395) {
            if (arg1 < 9) {
                field6377 = 81;
            }
            class23.field395.method215(0, arg0);
        }
    }
}
