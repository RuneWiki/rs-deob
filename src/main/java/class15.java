import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class15 extends class80 {

    @OriginalMember(owner = "client!qd", name = "y", descriptor = "[I")
    public int[] field192 = new int[1];

    @OriginalMember(owner = "client!qd", name = "B", descriptor = "[I")
    public int[] field195 = new int[] { -1 };

    @OriginalMember(owner = "client!qd", name = "q", descriptor = "[I")
    public static int[] field184 = new int[128];

    @OriginalMember(owner = "client!qd", name = "s", descriptor = "Lr;")
    public static class66 field186 = class93.method641(43, "(U0a )2 non)2existant gosub script)2num: ");

    @OriginalMember(owner = "client!qd", name = "r", descriptor = "Z")
    public static boolean field185 = false;

    @OriginalMember(owner = "client!qd", name = "w", descriptor = "Lr;")
    public static class66 field190 = class93.method641(43, "");

    @OriginalMember(owner = "client!qd", name = "C", descriptor = "I")
    public static int field196 = -1;

    @OriginalMember(owner = "client!qd", name = "D", descriptor = "Lr;")
    public static class66 field197 = class93.method641(43, ":assistreq:");

    @OriginalMember(owner = "client!qd", name = "x", descriptor = "I")
    public static int field191 = 0;

    @OriginalMember(owner = "client!qd", name = "t", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field187 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!qd", name = "F", descriptor = "I")
    public static int field199 = 1;

    @OriginalMember(owner = "client!qd", name = "G", descriptor = "Z")
    public static boolean field200 = true;

    @OriginalMember(owner = "client!qd", name = "H", descriptor = "Lr;")
    public static class66 field201 = class93.method641(43, "mem=");

    @OriginalMember(owner = "client!qd", name = "v", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "client!qd", name = "z", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!qd", name = "A", descriptor = "I")
    public static int field194;

    @OriginalMember(owner = "client!qd", name = "E", descriptor = "I")
    public static int field198;

    @OriginalMember(owner = "client!qd", name = "u", descriptor = "[I")
    public static int[] field188;

    @OriginalMember(owner = "client!qd", name = "p", descriptor = "[[I")
    public static int[][] field183;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "(I)V")
    public static void method62(int arg0) {
        field183 = null;
        field201 = null;
        field184 = null;
        field186 = null;
        field187 = null;
        field197 = null;
        field188 = null;
        field190 = null;
        if (arg0 != -1) {
            method62(7);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IBLcj;I)Lni;")
    public static final class168 method63(int arg0, byte arg1, class28 arg2, int arg3) {
        if (arg1 != -96) {
            field183 = null;
        }
        field189++;
        return class31.method174(-29381, arg0, arg2, arg3) ? class139.method955((byte) -83) : null;
    }
}
