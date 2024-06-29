import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class60 {

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
    public int field982 = -1;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field984 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "I")
    public static int field991 = 1;

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "[J")
    public static long[] field992 = new long[200];

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field990 = new String[] { "en", "de", "fr", "pt" };

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "Z")
    public static boolean field993 = false;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
    public int field981;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
    public int field983;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
    public static int field985;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
    public int field986;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "I")
    public int field987;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "I")
    public int field988;

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "I")
    public int field989;

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "I")
    public int field994;

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "I")
    public static int field995;

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "I")
    public int field996;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)Z")
    public static final boolean method432(byte arg0) {
        field995++;
        int var1 = -110 % ((-arg0 - 69) / 52);
        return class220.field3599 == 0 ? class21.field357.method664(18897) : true;
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(B)V")
    public static void method433(byte arg0) {
        field992 = null;
        field984 = null;
        if (arg0 != -32) {
            method432((byte) 78);
        }
        field990 = null;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lqh;B)V")
    public static final void method434(class201 arg0, byte arg1) {
        int var2 = -28 / ((-arg1 - 13) / 63);
        field985++;
        class162.field2582 = arg0;
    }
}
