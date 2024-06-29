import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class171 extends class445 {

    @OriginalMember(owner = "client!sm", name = "x", descriptor = "J")
    public long field2348;

    @OriginalMember(owner = "client!sm", name = "t", descriptor = "Lbc;")
    public static class225 field2344 = new class225("", 13);

    @OriginalMember(owner = "client!sm", name = "w", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2347 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!sm", name = "z", descriptor = "I")
    public static int field2350 = 0;

    @OriginalMember(owner = "client!sm", name = "y", descriptor = "I")
    public static int field2349 = 0;

    @OriginalMember(owner = "client!sm", name = "B", descriptor = "Lh;")
    public static class434 field2352;

    @OriginalMember(owner = "client!sm", name = "s", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!sm", name = "u", descriptor = "I")
    public static int field2345;

    @OriginalMember(owner = "client!sm", name = "v", descriptor = "I")
    public static int field2346;

    @OriginalMember(owner = "client!sm", name = "D", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!sm", name = "A", descriptor = "Lii;")
    public static class358 field2351;

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(B)V")
    public static final void method997(byte arg0) {
        class338.field4547.method502(0);
        field2345++;
        if (arg0 <= 46) {
            method998(true, -74, (byte) 107);
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(ZIB)Ljava/lang/String;")
    public static final String method998(boolean arg0, int arg1, byte arg2) {
        int var3 = 114 / ((arg2 - 11) / 47);
        field2346++;
        return arg0 && arg1 >= 0 ? class196.method1129(arg0, 10, arg1, -1) : Integer.toString(arg1);
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(Z)V")
    public static void method999(boolean arg0) {
        if (!arg0) {
            method997((byte) 7);
        }
        field2352 = null;
        field2347 = null;
        field2344 = null;
        field2351 = null;
    }

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "()V")
    public class171() {
    }

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(J)V")
    public class171(long arg0) {
        this.field2348 = arg0;
    }

    static {
        new class206("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.");
        field2352 = new class434(93, 5);
    }
}
