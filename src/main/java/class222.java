import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sca")
public class class222 {

    @OriginalMember(owner = "client!sca", name = "g", descriptor = "I")
    public int field2850 = 128;

    @OriginalMember(owner = "client!sca", name = "i", descriptor = "I")
    public int field2852 = 128;

    @OriginalMember(owner = "client!sca", name = "d", descriptor = "I")
    public int field2847;

    @OriginalMember(owner = "client!sca", name = "l", descriptor = "I")
    public int field2855;

    @OriginalMember(owner = "client!sca", name = "j", descriptor = "I")
    public int field2853;

    @OriginalMember(owner = "client!sca", name = "h", descriptor = "I")
    public int field2851;

    @OriginalMember(owner = "client!sca", name = "e", descriptor = "[F")
    public static float[] field2848;

    @OriginalMember(owner = "client!sca", name = "c", descriptor = "Lbr;")
    public static class184 field2846;

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "I")
    public static int field2844;

    @OriginalMember(owner = "client!sca", name = "b", descriptor = "I")
    public static int field2845;

    @OriginalMember(owner = "client!sca", name = "f", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!sca", name = "k", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(Lsca;I)V")
    public final void method1421(class222 arg0, int arg1) {
        this.field2850 = arg0.field2850;
        this.field2847 = arg0.field2847;
        this.field2853 = arg0.field2853;
        field2849++;
        this.field2855 = arg0.field2855;
        this.field2851 = arg0.field2851;
        int var3 = -127 % ((76 - arg1) / 41);
        this.field2852 = arg0.field2852;
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(B)Lsca;")
    public final class222 method1422(byte arg0) {
        field2854++;
        int var2 = -12 % ((arg0 + 42) / 48);
        return new class222(this.field2847, this.field2850, this.field2852, this.field2855, this.field2851, this.field2853);
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(I)V")
    public static void method1423(int arg0) {
        if (arg0 == 0) {
            field2846 = null;
            field2848 = null;
        }
    }

    @OriginalMember(owner = "client!sca", name = "<init>", descriptor = "(I)V")
    public class222(int arg0) {
        this.field2847 = arg0;
    }

    @OriginalMember(owner = "client!sca", name = "<init>", descriptor = "(IIIIII)V")
    private class222(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field2852 = arg2;
        this.field2855 = arg3;
        this.field2850 = arg1;
        this.field2847 = arg0;
        this.field2853 = arg5;
        this.field2851 = arg4;
    }

    static {
        new class344("Changes will take effect on your clan in the next 60 seconds.", "Die Änderungen am Chatraum werden innerhalb von 60 Sekunden gültig.", "Les modifications seront apportées à votre clan dans les prochaines 60 secondes.", "As alterações passarão a valer no seu clã nos próximos 60 segundos.");
        field2848 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };
        field2846 = class356.method2216((byte) -128);
    }
}
