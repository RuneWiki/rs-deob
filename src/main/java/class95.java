import java.io.IOException;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class95 {

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "[I")
    public static int[] field1260 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "Z")
    public static boolean field1259 = true;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1257 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "F")
    public static float field1263;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "I")
    public static int field1258;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "I")
    public static int field1261;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V", line = 5)
    public static void method678(int arg0) {
        if (arg0 < 11) {
            field1259 = false;
        }
        field1257 = null;
        field1260 = null;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lvl;I)V", line = 27)
    public static final void method679(class6 arg0, int arg1) {
        field1262++;
        if (arg1 >= -45) {
            field1257 = (BigInteger) null;
        }
        byte[] var2 = new byte[24];
        if (class2.field23 != null) {
            try {
                class2.field23.method268(0L, 128);
                class2.field23.method256(true, var2);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var6) {
                for (int var5 = 0; var5 < 24; var5++) {
                    var2[var5] = -1;
                }
            }
        }
        arg0.method67(24, 0, (byte) -126, var2);
    }
}
