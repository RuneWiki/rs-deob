import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class67 {

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "Lku;")
    private class232 field852 = new class232(64);

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "Lb;")
    private class201 field855;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "Ldk;")
    public static class326 field849 = new class326("RuneScape is loading - please wait...", "RuneScape wird geladen - bitte warten...", "Chargement de RuneScape en cours - veuillez patienter...", "RuneScape carregando. Aguarde...");

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "I")
    public static int field854;

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "I")
    public static int field856;

    @OriginalMember(owner = "client!jj", name = "i", descriptor = "I")
    public static int field857;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZI)Lcb;")
    public final class332 method404(boolean arg0, int arg1) {
        if (arg0) {
            this.field852 = null;
        }
        field856++;
        class232 var3 = this.field852;
        class332 var4;
        synchronized (this.field852) {
            var4 = (class332) this.field852.method1479(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field855.method1257(arg1, 32, 24558);
        class332 var6 = new class332();
        if (var5 != null) {
            var6.method2098(new class276(var5), 48);
        }
        class232 var7 = this.field852;
        synchronized (this.field852) {
            this.field852.method1473(var6, (long) arg1, 111);
            return var6;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V")
    public final void method405(int arg0) {
        class232 var2 = this.field852;
        synchronized (this.field852) {
            this.field852.method1478((byte) -110);
            if (arg0 != 25062) {
                field857 = -102;
            }
        }
        field850++;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)V")
    public final void method406(int arg0, int arg1) {
        field854++;
        if (arg1 != 0) {
            this.field852 = null;
        }
        class232 var3 = this.field852;
        synchronized (this.field852) {
            this.field852.method1486(arg1 ^ 0x1A1D4A10, arg0);
        }
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(I)V")
    public static void method407(int arg0) {
        field849 = null;
        if (arg0 <= 57) {
            method407(60);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(BILoa;IB)V")
    public static final void method408(byte arg0, int arg1, class452 arg2, int arg3, byte arg4) {
        field853++;
        int var5 = arg2.field2163[0];
        int var6 = arg2.field2159[0];
        if (var5 < 0 || class58.field758 <= var5 || var6 < 0 || var6 >= class287.field4181 || arg3 < 0 || class58.field758 <= arg3 || arg1 < 0 || arg1 >= class287.field4181) {
            return;
        }
        int var7 = 124 / ((-arg0 - 44) / 32);
        int var8 = class239.method1518(true, arg3, 0, class126.field1650, var5, 0, arg1, class426.field5971, 0, 0, (byte) 111, arg2.method918(false), -4, class422.field5918[arg2.field4319], var6);
        if (var8 >= 1 && var8 <= 3) {
            for (int var9 = 0; var9 < var8 - 1; var9++) {
                arg2.method2644(class426.field5971[var9], -115, arg4, class126.field1650[var9]);
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "(I)V")
    public final void method409(int arg0) {
        field851++;
        class232 var2 = this.field852;
        synchronized (this.field852) {
            this.field852.method1475(0);
        }
        if (arg0 != 20895) {
            this.method405(12);
        }
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Lea;ILb;)V")
    public class67(class353 arg0, int arg1, class201 arg2) {
        this.field855 = arg2;
        this.field855.method1235(0, 32);
    }

    static {
        new class326((String) null, "Dieses System darf nicht missbraucht werden!", (String) null, (String) null);
    }
}
