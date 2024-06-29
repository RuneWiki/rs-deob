import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class252 {

    @OriginalMember(owner = "client!rp", name = "f", descriptor = "Ldq;")
    public static class90 field3703 = new class90(8);

    @OriginalMember(owner = "client!rp", name = "j", descriptor = "Lbn;")
    public static class160 field3707 = new class160(45, 8);

    @OriginalMember(owner = "client!rp", name = "m", descriptor = "I")
    public static int field3710 = 0;

    @OriginalMember(owner = "client!rp", name = "l", descriptor = "Ljn;")
    public static class409 field3709 = new class409("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "I")
    public static int field3698;

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "I")
    public static int field3700;

    @OriginalMember(owner = "client!rp", name = "d", descriptor = "I")
    public static int field3701;

    @OriginalMember(owner = "client!rp", name = "g", descriptor = "I")
    public static int field3704;

    @OriginalMember(owner = "client!rp", name = "i", descriptor = "I")
    public static int field3706;

    @OriginalMember(owner = "client!rp", name = "k", descriptor = "I")
    public static int field3708;

    @OriginalMember(owner = "client!rp", name = "h", descriptor = "Lh;")
    public static class440 field3705;

    @OriginalMember(owner = "client!rp", name = "e", descriptor = "[[I")
    public static int[][] field3702;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIIBI)V", line = 6)
    public static final void method1662(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (class248.field3659 <= arg2 && arg2 <= class146.field1978) {
            int var5 = class382.method2423(arg4, class63.field838, 75, class9.field128);
            int var6 = class382.method2423(arg0, class63.field838, 46, class9.field128);
            class388.method2454(arg1, arg2, var6, false, var5);
        }
        if (arg3 == -59) {
            field3704++;
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIZ)I", line = 25)
    public static final int method1663(int arg0, int arg1, boolean arg2) {
        field3698++;
        if (arg0 == 1 || arg0 == 3) {
            return class436.field6365[arg1 & 0x3];
        } else {
            if (arg2) {
                method1666(-110, (class104) null);
            }
            return class132.field1795[arg1 & 0x3];
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(ILui;)V", line = 42)
    public static final void method1664(int arg0, class378 arg1) {
        class215.field3069[arg0] = arg1;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(I)V", line = 54)
    public static void method1665(int arg0) {
        if (arg0 != 1205) {
            field3706 = -79;
        }
        field3705 = null;
        field3707 = null;
        field3709 = null;
        field3703 = null;
        field3702 = null;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(ILct;)V", line = 68)
    public static final void method1666(int arg0, class104 arg1) {
        class137.field1880 = arg1.method707(-1, "titlebg");
        field3700++;
        class342.field5041 = arg1.method707(-1, "logo");
        if (arg0 != 3) {
            method1665(-40);
        }
    }

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "(I)V", line = 82)
    public static final void method1667(int arg0) {
        if (arg0 != -23812) {
            method1666(65, (class104) null);
        }
        class278.field4110 = new class375(class213.field3002.method2543(false, class153.field2073), "", class392.field5703, 1011, 0L, 0, 0, true, false);
        field3701++;
    }
}
