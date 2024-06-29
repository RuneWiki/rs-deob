import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class513 extends class223 {

    @OriginalMember(owner = "client!pg", name = "o", descriptor = "I")
    private int field7553;

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "I")
    private int field7547;

    @OriginalMember(owner = "client!pg", name = "k", descriptor = "I")
    private int field7549;

    @OriginalMember(owner = "client!pg", name = "p", descriptor = "I")
    private int field7554;

    @OriginalMember(owner = "client!pg", name = "s", descriptor = "Z")
    public static boolean field7557 = false;

    @OriginalMember(owner = "client!pg", name = "j", descriptor = "Lvj;")
    public static class304 field7548 = new class304("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");

    @OriginalMember(owner = "client!pg", name = "t", descriptor = "I")
    public static int field7558 = -1;

    @OriginalMember(owner = "client!pg", name = "v", descriptor = "I")
    public static int field7560 = 0;

    @OriginalMember(owner = "client!pg", name = "w", descriptor = "I")
    public static int field7561 = 0;

    @OriginalMember(owner = "client!pg", name = "x", descriptor = "Lvj;")
    public static class304 field7562 = new class304("K", "T", "K", "K");

    @OriginalMember(owner = "client!pg", name = "l", descriptor = "I")
    public static int field7550;

    @OriginalMember(owner = "client!pg", name = "m", descriptor = "I")
    public static int field7551;

    @OriginalMember(owner = "client!pg", name = "n", descriptor = "I")
    public static int field7552;

    @OriginalMember(owner = "client!pg", name = "q", descriptor = "I")
    public static int field7555;

    @OriginalMember(owner = "client!pg", name = "r", descriptor = "I")
    public static int field7556;

    @OriginalMember(owner = "client!pg", name = "u", descriptor = "Lpc;")
    public static class473 field7559;

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(Z)V")
    public static final void method3019(boolean arg0) {
        ++field7550;
        if (!arg0) {
            method3020(27);
        }
        class236 var1 = class388.field5270;
        synchronized (class388.field5270) {
            class388.field5270.method1459(19088);
        }
        class236 var2 = class165.field2408;
        synchronized (class165.field2408) {
            class165.field2408.method1459(19088);
        }
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(I)V")
    public static void method3020(int arg0) {
        if (arg0 < 53) {
            method3019(true);
        }
        field7559 = null;
        field7562 = null;
        field7548 = null;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(III)V")
    public final void method209(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            field7557 = false;
        }
        ++field7551;
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(IIIIII)V")
    public class513(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field7553 = arg2;
        this.field7547 = arg0;
        this.field7549 = arg3;
        this.field7554 = arg1;
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(III)V")
    public final void method211(int arg0, int arg1, int arg2) {
        ++field7555;
        int var4 = this.field7547 * arg1 >> 12;
        int var5 = this.field7553 * arg1 >> 12;
        int var6 = this.field7554 * arg0 >> 12;
        int var7 = this.field7549 * arg0 >> 12;
        if (arg2 != 91) {
            method3020(3);
        }
        class514.method3028(var6, super.field3010, -126, var5, var4, var7);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public static final void method3021(int arg0, String arg1, int arg2) {
        ++class238.field3187;
        if (arg2 >= 38) {
            ++field7556;
            class118.method822(42, class48.field724);
            class193.field2708.method2200(7, class125.method912(arg1, 1) + 1);
            class193.field2708.method2216(arg1, -118);
            class193.field2708.method2229((byte) 90, arg0);
        }
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(III)V")
    public final void method205(int arg0, int arg1, int arg2) {
        ++field7552;
        if (arg2 != -28706) {
            field7559 = null;
        }
    }
}
