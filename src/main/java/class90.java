import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class90 {

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1119 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
    public static int field1121;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "[Lo;")
    public static class24[] field1122;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Ljava/lang/Object;ZZ)[B")
    public static final byte[] method645(Object arg0, boolean arg1, boolean arg2) {
        field1120++;
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var3 = (byte[]) arg0;
            return arg1 ? class220.method1366(var3, -24315) : var3;
        } else if (arg0 instanceof class538) {
            class538 var4 = (class538) arg0;
            return var4.method1226((byte) 101);
        } else {
            if (arg2) {
                method645(null, false, false);
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Z)V")
    public static void method646(boolean arg0) {
        field1122 = null;
        field1119 = null;
        if (arg0) {
            field1119 = null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)Ltj;")
    public static final class135 method647(int arg0) {
        if (arg0 <= 38) {
            field1122 = null;
        }
        class160.field2376 = 0;
        field1118++;
        return class107.method725(124);
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)V")
    public static final void method648(int arg0) {
        field1121++;
        for (class136 var1 = (class136) class26.field317.method2655(arg0 + 6409); var1 != null; var1 = (class136) class26.field317.method2660((byte) 67)) {
            if (var1.field1782) {
                var1.method856((byte) -111);
            }
        }
        for (class136 var2 = (class136) class503.field7294.method2655(arg0 ^ 0x1917); var2 != null; var2 = (class136) class503.field7294.method2660((byte) 67)) {
            if (var2.field1782) {
                var2.method856((byte) -117);
            }
        }
        if (arg0 != 8743) {
            field1122 = null;
        }
    }

    static {
        new class530("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter à un serveur d'abonnés pour cette interaction.", "Para interagir, acesse um servidor para membros.");
    }
}
