import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class443 {

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "Lsm;")
    private class249 field6109;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "[I")
    public static int[] field6108 = new int[4096];

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "Z")
    public static boolean field6112 = false;

    @OriginalMember(owner = "client!mk", name = "k", descriptor = "Z")
    public static boolean field6118;

    @OriginalMember(owner = "client!mk", name = "l", descriptor = "J")
    public static long field6119;

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "I")
    public static int field6110;

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "I")
    public static int field6111;

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "I")
    public static int field6113;

    @OriginalMember(owner = "client!mk", name = "h", descriptor = "I")
    public static int field6115;

    @OriginalMember(owner = "client!mk", name = "i", descriptor = "I")
    public static int field6116;

    @OriginalMember(owner = "client!mk", name = "j", descriptor = "I")
    public static int field6117;

    @OriginalMember(owner = "client!mk", name = "g", descriptor = "Lag;")
    private class180 field6114;

    static {
        new class112("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
        field6118 = true;
        field6119 = 0L;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 6)
    public static final void method2576(String arg0, int arg1, int arg2) {
        field6113++;
        int var3 = 26 / ((-arg2 - 40) / 32);
        class265 var4 = class440.method2554(arg1, 2, 2);
        var4.method1675(false);
        var4.field3688 = arg0;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(II)V", line = 20)
    public static final void method2577(int arg0, int arg1) {
        class104 var2 = class267.field3716;
        synchronized (class267.field3716) {
            class267.field3716.method666(arg0, false);
        }
        field6110++;
        if (arg1 >= 21) {
            class104 var3 = class21.field367;
            synchronized (class21.field367) {
                class21.field367.method666(arg0, false);
            }
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Z)V", line = 36)
    public static void method2578(boolean arg0) {
        if (!arg0) {
            field6108 = null;
        }
        field6108 = null;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)Lag;", line = 47)
    public final class180 method2579(int arg0) {
        field6115++;
        if (arg0 > -101) {
            this.method2580((byte) -92, (class249) null);
        }
        class180 var2 = this.field6114;
        if (this.field6109.field3504 == var2) {
            this.field6114 = null;
            return null;
        } else {
            this.field6114 = var2.field2610;
            return var2;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(BLsm;)V", line = 68)
    public final void method2580(byte arg0, class249 arg1) {
        field6116++;
        if (arg0 > -81) {
            this.method2580((byte) 73, (class249) null);
        }
        this.field6109 = arg1;
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(Z)Lag;", line = 95)
    public final class180 method2581(boolean arg0) {
        field6117++;
        class180 var2 = this.field6109.field3504.field2610;
        if (!arg0) {
            method2577(-102, 92);
        }
        if (this.field6109.field3504 == var2) {
            this.field6114 = null;
            return null;
        } else {
            this.field6114 = var2.field2610;
            return var2;
        }
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "()V", line = 115)
    public class443() {
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Lsm;)V", line = 117)
    public class443(class249 arg0) {
        this.field6109 = arg0;
    }
}
