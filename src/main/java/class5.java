import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class5 extends class45 {

    @OriginalMember(owner = "client!ti", name = "u", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field62 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!ti", name = "k", descriptor = "I")
    public int field52;

    @OriginalMember(owner = "client!ti", name = "l", descriptor = "I")
    public int field53;

    @OriginalMember(owner = "client!ti", name = "m", descriptor = "I")
    public int field54;

    @OriginalMember(owner = "client!ti", name = "n", descriptor = "I")
    public int field55;

    @OriginalMember(owner = "client!ti", name = "o", descriptor = "I")
    public int field56;

    @OriginalMember(owner = "client!ti", name = "p", descriptor = "I")
    public int field57;

    @OriginalMember(owner = "client!ti", name = "q", descriptor = "I")
    public int field58;

    @OriginalMember(owner = "client!ti", name = "r", descriptor = "I")
    public int field59;

    @OriginalMember(owner = "client!ti", name = "s", descriptor = "I")
    public int field60;

    @OriginalMember(owner = "client!ti", name = "t", descriptor = "I")
    public static int field61;

    @OriginalMember(owner = "client!ti", name = "v", descriptor = "I")
    public int field63;

    @OriginalMember(owner = "client!ti", name = "w", descriptor = "I")
    public int field64;

    @OriginalMember(owner = "client!ti", name = "x", descriptor = "I")
    public static int field65;

    @OriginalMember(owner = "client!ti", name = "y", descriptor = "I")
    public static int field66;

    @OriginalMember(owner = "client!ti", name = "A", descriptor = "I")
    public int field68;

    @OriginalMember(owner = "client!ti", name = "B", descriptor = "I")
    public static int field69;

    @OriginalMember(owner = "client!ti", name = "z", descriptor = "[[Z")
    public static boolean[][] field67;

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "(I)V", line = 13)
    public static void method32(int arg0) {
        field62 = null;
        if (arg0 < 39) {
            method32(-30);
        }
        field67 = null;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I[BIB)I", line = 39)
    public static final int method33(int arg0, byte[] arg1, int arg2, byte arg3) {
        field61++;
        int var4 = -1;
        int var5 = arg2;
        int var6 = 121 / ((arg3 + 59) / 49);
        while (arg0 > var5) {
            var4 = class156.field2121[(var4 ^ arg1[var5]) & 0xFF] ^ var4 >>> 8;
            var5++;
        }
        return ~var4;
    }
}
