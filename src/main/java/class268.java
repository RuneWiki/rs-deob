import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class268 {

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "Lhc;")
    public static class368 field3668 = new class368("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "[I")
    public static int[] field3671 = new int[4];

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "I")
    public static int field3673 = -1;

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "I")
    public static int field3672 = 2;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "I")
    public static int field3669;

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "Lwn;")
    public static class77 field3670;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Z)V")
    public static void method1704(boolean arg0) {
        field3671 = null;
        if (!arg0) {
            method1704(false);
        }
        field3670 = null;
        field3668 = null;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IZ)I")
    public static final int method1705(int arg0, boolean arg1) {
        if (arg1) {
            field3672 = -102;
        }
        field3669++;
        int var2 = arg0 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return ~var7 & arg0;
    }
}
