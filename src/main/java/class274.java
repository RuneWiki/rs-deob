import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public abstract class class274 {

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
    public volatile int field3436 = 0;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
    public int field3435 = 0;

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "[B")
    public byte[] field3438 = new byte[5000];

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "I")
    public int field3442 = 0;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "I")
    public volatile int field3433 = 0;

    @OriginalMember(owner = "client!sg", name = "l", descriptor = "[Ljava/lang/Object;")
    public Object[] field3444 = new Object[5000];

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "[F")
    public float[] field3440 = new float[5000];

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "I")
    public static int field3441 = -1;

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "Lap;")
    public static class335 field3439 = new class335("RuneScape is loading - please wait...", "RuneScape wird geladen - bitte warten...", "Chargement de RuneScape en cours - veuillez patienter...", "RuneScape carregando. Aguarde...");

    @OriginalMember(owner = "client!sg", name = "k", descriptor = "F")
    public static float field3443;

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "I")
    public static int field3434;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "Lli;")
    public static class297 field3437;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)V")
    public abstract void method1421(int arg0, int arg1);

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V")
    public static void method1617(int arg0) {
        field3439 = null;
        field3437 = null;
        if (arg0 != 5000) {
            field3439 = null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILev;)V")
    public abstract void method1419(int arg0, class490 arg1);

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lev;I)V")
    public abstract void method1417(class490 arg0, int arg1);

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)V")
    public abstract void method1422(int arg0);

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(BI)V")
    public abstract void method1416(byte arg0, int arg1);

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lta;IIFZ)V")
    public abstract void method1414(class143 arg0, int arg1, int arg2, float arg3, boolean arg4);

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)V")
    public abstract void method1420(byte arg0);

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(ILev;)V")
    public abstract void method1415(int arg0, class490 arg1);

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(BI)I")
    public static final int method1618(byte arg0, int arg1) {
        field3434++;
        if (arg0 > -47) {
            field3437 = null;
        }
        return arg1 & 0xFF;
    }
}
