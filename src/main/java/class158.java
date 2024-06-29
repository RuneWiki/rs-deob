import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public class class158 {

    @OriginalMember(owner = "client!bq", name = "e", descriptor = "[I")
    public static int[] field2059 = new int[16384];

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "[I")
    public static int[] field2055 = new int[16384];

    @OriginalMember(owner = "client!bq", name = "d", descriptor = "Z")
    public static boolean field2058 = false;

    @OriginalMember(owner = "client!bq", name = "g", descriptor = "S")
    public static short field2061;

    @OriginalMember(owner = "client!bq", name = "h", descriptor = "Lfk;")
    public static class393 field2062;

    @OriginalMember(owner = "client!bq", name = "k", descriptor = "[I")
    public static int[] field2065;

    @OriginalMember(owner = "client!bq", name = "i", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2063;

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "I")
    public static int field2056;

    @OriginalMember(owner = "client!bq", name = "c", descriptor = "I")
    public static int field2057;

    @OriginalMember(owner = "client!bq", name = "f", descriptor = "Ltq;")
    public static class376 field2060;

    @OriginalMember(owner = "client!bq", name = "j", descriptor = "[I")
    public static int[] field2064;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(IZLtq;Ltq;I)V")
    public static final void method1010(int arg0, boolean arg1, class376 arg2, class376 arg3, int arg4) {
        class403.field5794 = arg0;
        class392.field5537 = arg1;
        class323.field4602 = arg2;
        field2057++;
        class281.field3980 = arg3;
        if (arg4 != 556) {
            field2061 = -86;
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(II)I")
    public static final int method1011(int arg0, int arg1) {
        if (arg1 != 3234) {
            field2064 = null;
        }
        field2056++;
        return arg0 & 0x3FF;
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Z)V")
    public static void method1012(boolean arg0) {
        field2063 = null;
        field2060 = null;
        if (!arg0) {
            field2063 = null;
        }
        field2065 = null;
        field2055 = null;
        field2064 = null;
        field2062 = null;
        field2059 = null;
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field2055[var2] = (int) (Math.sin((double) var2 * var0) * 32768.0D);
            field2059[var2] = (int) (Math.cos((double) var2 * var0) * 32768.0D);
        }
        field2061 = 256;
        field2062 = new class393();
        field2065 = new int[13];
        field2063 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
    }
}
