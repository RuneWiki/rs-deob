import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class4 {

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "Z")
    public static boolean field27 = false;

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field28 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "Lwo;")
    public static class285 field31;

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field30;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(II)I")
    public static final int method16(int arg0, int arg1) {
        field29++;
        if (arg1 != 2000492488) {
            field31 = null;
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)V")
    public static void method17(int arg0) {
        field31 = null;
        field30 = null;
        field28 = null;
        if (arg0 < 25) {
            field27 = true;
        }
    }
}
