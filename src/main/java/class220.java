import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class220 extends class223 {

    @OriginalMember(owner = "client!on", name = "t", descriptor = "I")
    private int field2982;

    @OriginalMember(owner = "client!on", name = "i", descriptor = "I")
    private int field2971;

    @OriginalMember(owner = "client!on", name = "k", descriptor = "I")
    private int field2973;

    @OriginalMember(owner = "client!on", name = "o", descriptor = "I")
    private int field2977;

    @OriginalMember(owner = "client!on", name = "m", descriptor = "Lvj;")
    public static class304 field2975 = new class304("Connected to update server", "Verbindung zum Update-Server hergestellt.", "Connecté au serveur de mise à jour", "Conectado ao servidor de atualização");

    @OriginalMember(owner = "client!on", name = "s", descriptor = "Lff;")
    public static class9 field2981 = new class9(32, -2);

    @OriginalMember(owner = "client!on", name = "u", descriptor = "Lsl;")
    public static class317 field2983 = new class317("", 14);

    @OriginalMember(owner = "client!on", name = "j", descriptor = "I")
    public static int field2972;

    @OriginalMember(owner = "client!on", name = "l", descriptor = "I")
    public static int field2974;

    @OriginalMember(owner = "client!on", name = "n", descriptor = "I")
    public static int field2976;

    @OriginalMember(owner = "client!on", name = "p", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!on", name = "q", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!on", name = "r", descriptor = "I")
    public static int field2980;

    @OriginalMember(owner = "client!on", name = "v", descriptor = "Lf;")
    public static class529 field2984;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(BLcr;)V")
    public static final void method1392(byte arg0, class403 arg1) {
        if (arg1.field5480 == 5 && arg1.field5530 != -1) {
            class290.method1708(class370.field4984, arg1, -16777216);
        }
        ++field2974;
        int var2 = -114 % ((arg0 - 81) / 45);
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(III)V")
    public final void method211(int arg0, int arg1, int arg2) {
        if (arg2 != 91) {
            this.method211(-78, 117, 72);
        }
        ++field2976;
    }

    @OriginalMember(owner = "client!on", name = "<init>", descriptor = "(IIIIIII)V")
    public class220(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field2982 = arg0;
        this.field2971 = arg3;
        this.field2973 = arg2;
        this.field2977 = arg1;
    }

    @OriginalMember(owner = "client!on", name = "c", descriptor = "(III)V")
    public final void method205(int arg0, int arg1, int arg2) {
        ++field2972;
        int var4 = this.field2982 * arg1 >> 12;
        int var5 = this.field2973 * arg1 >> 12;
        int var6 = this.field2977 * arg0 >> 12;
        int var7 = this.field2971 * arg0 >> 12;
        if (arg2 != -28706) {
            this.method211(10, 51, -27);
        }
        class352.method2063(super.field3003, super.field3005, var7, var6, var5, var4, super.field3010, -2);
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(I)V")
    public static void method1393(int arg0) {
        field2975 = null;
        field2981 = null;
        field2984 = null;
        if (arg0 != -7987) {
            method1393(115);
        }
        field2983 = null;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(III)V")
    public final void method209(int arg0, int arg1, int arg2) {
        ++field2978;
        if (arg1 == 0) {
            int var4 = this.field2982 * arg2 >> 12;
            int var5 = this.field2973 * arg2 >> 12;
            int var6 = this.field2977 * arg0 >> 12;
            int var7 = this.field2971 * arg0 >> 12;
            class290.method1704(var7, var4, var5, false, super.field3005, var6);
        }
    }
}
