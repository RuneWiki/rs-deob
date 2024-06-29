import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class33 {

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "Lva;")
    public static class121 field801 = class107.method797("backright1", -10983);

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "Lva;")
    private static class121 field808 = class107.method797("Add ignore", -10983);

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "Lva;")
    public static class121 field804 = field808;

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field809 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "Z")
    public static boolean field812 = false;

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "I")
    public static int field811 = 0;

    @OriginalMember(owner = "client!fb", name = "n", descriptor = "Li;")
    public static class48 field814 = new class48(500);

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
    public static int field802;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
    public static int field803;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "I")
    public static int field810;

    @OriginalMember(owner = "client!fb", name = "o", descriptor = "J")
    public static long field815;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "Lbe;")
    public static class12 field807;

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "[[[B")
    public static byte[][][] field813;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V", line = 8)
    public static void method236(int arg0) {
        field807 = null;
        field804 = null;
        if (arg0 != 0) {
            field814 = null;
        }
        field801 = null;
        field809 = null;
        field808 = null;
        field814 = null;
        field813 = null;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lva;ILhe;Lva;)Lbc;", line = 26)
    public static final class10 method237(class121 arg0, int arg1, class47 arg2, class121 arg3) {
        if (arg1 != 0) {
            method238(95);
        }
        field810++;
        int var4 = arg2.method332(arg3, -22814);
        int var5 = arg2.method337(var4, (byte) 57, arg0);
        return class57.method415(var5, arg2, var4, (byte) -113);
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)V", line = 96)
    public static final void method238(int arg0) {
        if (arg0 != -24160) {
            field804 = null;
        }
        field805++;
        while (true) {
            class9 var1 = class15.field294;
            class101 var2;
            synchronized (class15.field294) {
                var2 = (class101) class50.field1194.method68(5416);
            }
            if (var2 == null) {
                return;
            }
            var2.field2259.method96(var2.field2263, false, -3, (int) var2.field577, var2.field2252);
        }
    }
}
