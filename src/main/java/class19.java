import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class19 {

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "I")
    public static int field290 = 0;

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "Ljava/util/Random;")
    public static Random field292 = new Random();

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "Luv;")
    public static class2 field293 = new class2(77, 6);

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "I")
    public static int field289;

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lok;IIB)Ldu;", line = 5)
    public static final class443 method210(class74 arg0, int arg1, int arg2, byte arg3) {
        if (arg3 < 63) {
            method210(null, -94, -29, (byte) -111);
        }
        field291++;
        byte[] var4 = arg0.method541(arg1, arg2, (byte) -122);
        return var4 == null ? null : new class443(var4);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Z)V", line = 23)
    public static void method211(boolean arg0) {
        if (!arg0) {
            method210(null, 64, 32, (byte) -45);
        }
        field292 = null;
        field293 = null;
    }
}
