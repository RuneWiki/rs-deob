import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class463 {

    @OriginalMember(owner = "client!fn", name = "k", descriptor = "Ler;")
    private class157 field6780 = new class157(64);

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "Lns;")
    private class438 field6770;

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "[Lfm;")
    public static class187[] field6771 = new class187[8];

    @OriginalMember(owner = "client!fn", name = "e", descriptor = "Lpg;")
    public static class492 field6774 = new class492(77, 6);

    @OriginalMember(owner = "client!fn", name = "j", descriptor = "I")
    public static int field6779;

    @OriginalMember(owner = "client!fn", name = "i", descriptor = "Lpg;")
    public static class492 field6778;

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "I")
    public static int field6772;

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "I")
    public static int field6773;

    @OriginalMember(owner = "client!fn", name = "f", descriptor = "I")
    public static int field6775;

    @OriginalMember(owner = "client!fn", name = "g", descriptor = "I")
    public static int field6776;

    @OriginalMember(owner = "client!fn", name = "h", descriptor = "I")
    public static int field6777;

    static {
        new class375("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
        field6779 = -1;
        field6778 = new class492(29, -1);
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(II)V", line = 6)
    public final void method2769(int arg0, int arg1) {
        field6777++;
        class157 var3 = this.field6780;
        synchronized (this.field6780) {
            if (arg1 != -1) {
                this.method2769(96, 3);
            }
            this.field6780.method1016(arg0, (byte) 121);
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(CB)Z", line = 21)
    public static final boolean method2770(char arg0, byte arg1) {
        field6776++;
        int var2 = 8 % ((40 - arg1) / 38);
        return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)V", line = 36)
    public static void method2771(int arg0) {
        field6774 = null;
        if (arg0 != -24876) {
            field6779 = 28;
        }
        field6771 = null;
        field6778 = null;
    }

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(I)V", line = 48)
    public final void method2772(int arg0) {
        class157 var2 = this.field6780;
        synchronized (this.field6780) {
            if (arg0 != -8206) {
                return;
            }
            this.field6780.method1015((byte) 93);
        }
        field6773++;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Z)V", line = 62)
    public final void method2773(boolean arg0) {
        class157 var2 = this.field6780;
        synchronized (this.field6780) {
            this.field6780.method1022((byte) -34);
            if (!arg0) {
                this.method2774(false, 5);
            }
        }
        field6775++;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(ZI)Loh;", line = 90)
    public final class437 method2774(boolean arg0, int arg1) {
        field6772++;
        class157 var3 = this.field6780;
        class437 var4;
        synchronized (this.field6780) {
            var4 = (class437) this.field6780.method1013((long) arg1, (byte) -106);
        }
        if (var4 != null) {
            return var4;
        } else if (arg0) {
            byte[] var5 = this.field6770.method2650(arg1, -88, 31);
            class437 var6 = new class437();
            if (var5 != null) {
                var6.method2612(0, new class91(var5));
            }
            class157 var7 = this.field6780;
            synchronized (this.field6780) {
                this.field6780.method1012(-70, (long) arg1, var6);
                return var6;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(Lgo;ILns;)V", line = 127)
    public class463(class331 arg0, int arg1, class438 arg2) {
        this.field6770 = arg2;
        this.field6770.method2645(1, 31);
    }
}
