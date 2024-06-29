import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class147 {

    @OriginalMember(owner = "client!va", name = "f", descriptor = "J")
    public static long field3361 = 0L;

    @OriginalMember(owner = "client!va", name = "e", descriptor = "Lod;")
    public static class101 field3360 = class46.method335(-117, "mapdots");

    @OriginalMember(owner = "client!va", name = "d", descriptor = "I")
    public static int field3359 = 0;

    @OriginalMember(owner = "client!va", name = "g", descriptor = "Lod;")
    public static class101 field3362 = class46.method335(82, "Die Adresse dieses Computers wurde gesperrt)1");

    @OriginalMember(owner = "client!va", name = "l", descriptor = "Lod;")
    public static class101 field3367 = class46.method335(-97, "Einloggen");

    @OriginalMember(owner = "client!va", name = "n", descriptor = "I")
    public static int field3369 = 0;

    @OriginalMember(owner = "client!va", name = "o", descriptor = "I")
    public static volatile int field3370 = -1;

    @OriginalMember(owner = "client!va", name = "h", descriptor = "Lod;")
    private static class101 field3363 = class46.method335(-78, "and choose the (Wcreate account(W");

    @OriginalMember(owner = "client!va", name = "b", descriptor = "Lod;")
    public static class101 field3357 = field3363;

    @OriginalMember(owner = "client!va", name = "j", descriptor = "Z")
    public static boolean field3365 = false;

    @OriginalMember(owner = "client!va", name = "c", descriptor = "Lod;")
    public static class101 field3358 = class46.method335(115, "Lade Wordpack )2 ");

    @OriginalMember(owner = "client!va", name = "i", descriptor = "I")
    public static int field3364;

    @OriginalMember(owner = "client!va", name = "k", descriptor = "I")
    public static int field3366;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "Ldd;")
    public static class26 field3356;

    @OriginalMember(owner = "client!va", name = "m", descriptor = "[Lrd;")
    public static class122[] field3368;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "([BII)I")
    public static final int method1157(byte[] arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            field3366++;
            return class13.method93(0, arg0, arg1 - 71, arg2);
        } else {
            return 107;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Lc;Lod;Lod;B)Lqe;")
    public static final class116 method1158(class15 arg0, class101 arg1, class101 arg2, byte arg3) {
        field3364++;
        int var4 = arg0.method110(0, arg1);
        int var5 = arg0.method125(2, arg2, var4);
        if (arg3 >= -102) {
            method1158(null, null, null, (byte) 16);
        }
        return class118.method895(var5, (byte) -54, var4, arg0);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V")
    public static void method1159(int arg0) {
        field3357 = null;
        field3356 = null;
        field3358 = null;
        field3363 = null;
        field3360 = null;
        field3362 = null;
        field3367 = null;
        field3368 = null;
        if (arg0 != -1) {
            field3368 = null;
        }
    }
}
