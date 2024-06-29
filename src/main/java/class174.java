import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class174 {

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "[J")
    public static long[] field3361 = new long[32];

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "Leh;")
    public static class47 field3363 = class195.method1282((byte) -4, " ");

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3359 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "I")
    public static int field3366 = 0;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
    public static int field3364;

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
    public static int field3365;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V")
    public static void method1167(int arg0) {
        field3359 = null;
        field3363 = null;
        int var1 = 4 / ((arg0 + 30) / 45);
        field3361 = null;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)[Ldh;")
    public static final class38[] method1168(byte arg0) {
        field3360++;
        class38[] var1 = new class38[class98.field2085];
        for (int var2 = 0; var2 < class98.field2085; var2++) {
            class38 var3 = new class38();
            var3.field746 = class197.field3834;
            var3.field752 = class132.field2604;
            var3.field748 = class69.field1516[var2];
            var3.field747 = class198.field3850[var2];
            var3.field749 = class96.field1979[var2];
            var3.field750 = class109.field2270[var2];
            var3.field751 = class64.field1390;
            var3.field753 = class69.field1511[var2];
            var1[var2] = var3;
        }
        if (arg0 != 101) {
            method1168((byte) -70);
        }
        class95.method755(arg0 - 171);
        return var1;
    }
}
