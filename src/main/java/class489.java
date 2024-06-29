import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class489 {

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "Z")
    public boolean field7398 = false;

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "Lof;")
    private class328 field7399 = new class328(64);

    @OriginalMember(owner = "client!ci", name = "p", descriptor = "Lof;")
    public class328 field7408 = new class328(500);

    @OriginalMember(owner = "client!ci", name = "q", descriptor = "Lof;")
    public class328 field7409 = new class328(30);

    @OriginalMember(owner = "client!ci", name = "r", descriptor = "Lof;")
    public class328 field7410 = new class328(50);

    @OriginalMember(owner = "client!ci", name = "k", descriptor = "Lmn;")
    public class162 field7403;

    @OriginalMember(owner = "client!ci", name = "m", descriptor = "Z")
    public boolean field7405;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "Lmn;")
    private class162 field7393;

    @OriginalMember(owner = "client!ci", name = "o", descriptor = "Lss;")
    public static class213 field7407 = new class213("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "I")
    public static int field7394;

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
    public static int field7395;

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "I")
    public static int field7396;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "I")
    public static int field7397;

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "I")
    public static int field7400;

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "I")
    public static int field7401;

    @OriginalMember(owner = "client!ci", name = "j", descriptor = "I")
    public static int field7402;

    @OriginalMember(owner = "client!ci", name = "l", descriptor = "I")
    public static int field7404;

    @OriginalMember(owner = "client!ci", name = "n", descriptor = "I")
    public static int field7406;

    @OriginalMember(owner = "client!ci", name = "s", descriptor = "I")
    public int field7411;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ZI)V")
    public final void method2999(boolean arg0, int arg1) {
        if (arg1 <= 75) {
            this.field7409 = null;
        }
        field7395++;
        if (this.field7398 != arg0) {
            this.field7398 = arg0;
            this.method3000((byte) 109);
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)V")
    public final void method3000(byte arg0) {
        field7397++;
        if (arg0 <= 46) {
            return;
        }
        class328 var2 = this.field7399;
        synchronized (this.field7399) {
            this.field7399.method2189(false);
        }
        class328 var3 = this.field7408;
        synchronized (this.field7408) {
            this.field7408.method2189(false);
        }
        class328 var4 = this.field7409;
        synchronized (this.field7409) {
            this.field7409.method2189(false);
        }
        class328 var5 = this.field7410;
        synchronized (this.field7410) {
            this.field7410.method2189(false);
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
    public static void method3001(int arg0) {
        if (arg0 > 117) {
            field7407 = null;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(II)Loq;")
    public final class156 method3002(int arg0, int arg1) {
        field7394++;
        class328 var3 = this.field7399;
        class156 var4;
        synchronized (this.field7399) {
            var4 = (class156) this.field7399.method2191((byte) -73, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class162 var5 = this.field7393;
        byte[] var6;
        synchronized (this.field7393) {
            var6 = this.field7393.method1004(class188.method1177((byte) 44, arg1), false, class83.method588(arg1, true));
        }
        if (arg0 != -1) {
            return null;
        }
        class156 var7 = new class156();
        var7.field2082 = arg1;
        var7.field2096 = this;
        if (var6 != null) {
            var7.method964(false, new class208(var6));
        }
        var7.method954(104);
        if (var7.field2067) {
            var7.field2137 = false;
            var7.field2125 = 0;
        }
        if (!this.field7405 && var7.field2063) {
            var7.field2068 = null;
            var7.field2101 = null;
        }
        class328 var8 = this.field7399;
        synchronized (this.field7399) {
            this.field7399.method2188(-122, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Z)V")
    public final void method3003(boolean arg0) {
        class328 var2 = this.field7399;
        synchronized (this.field7399) {
            this.field7399.method2187(-1);
        }
        field7401++;
        class328 var3 = this.field7408;
        synchronized (this.field7408) {
            this.field7408.method2187(-1);
        }
        class328 var4 = this.field7409;
        synchronized (this.field7409) {
            this.field7409.method2187(-1);
        }
        class328 var5 = this.field7410;
        synchronized (this.field7410) {
            this.field7410.method2187(-1);
            if (!arg0) {
                this.field7409 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(II)V")
    public final void method3004(int arg0, int arg1) {
        field7402++;
        this.field7411 = arg0;
        class328 var3 = this.field7408;
        synchronized (this.field7408) {
            this.field7408.method2189(false);
        }
        class328 var4 = this.field7409;
        synchronized (this.field7409) {
            this.field7409.method2189(false);
        }
        class328 var5 = this.field7410;
        synchronized (this.field7410) {
            int var6 = -19 % ((-arg1 - 60) / 45);
            this.field7410.method2189(false);
        }
    }

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "(II)V")
    public final void method3005(int arg0, int arg1) {
        field7396++;
        class328 var3 = this.field7399;
        synchronized (this.field7399) {
            this.field7399.method2202(0, arg1);
        }
        class328 var4 = this.field7408;
        synchronized (this.field7408) {
            this.field7408.method2202(arg0 ^ arg0, arg1);
        }
        class328 var5 = this.field7409;
        synchronized (this.field7409) {
            this.field7409.method2202(0, arg1);
        }
        class328 var6 = this.field7410;
        synchronized (this.field7410) {
            this.field7410.method2202(0, arg1);
        }
    }

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "(II)V")
    public final void method3006(int arg0, int arg1) {
        if (arg1 == 64) {
            field7404++;
            this.field7399 = new class328(arg0);
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ZB)V")
    public final void method3007(boolean arg0, byte arg1) {
        field7406++;
        if (this.field7405 != arg0) {
            this.field7405 = arg0;
            if (arg1 == -119) {
                this.method3000((byte) 67);
            }
        }
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(Lpr;IZLmn;Lmn;)V")
    public class489(class236 arg0, int arg1, boolean arg2, class162 arg3, class162 arg4) {
        this.field7403 = arg4;
        this.field7405 = arg2;
        this.field7393 = arg3;
        if (this.field7393 != null) {
            int var6 = this.field7393.method1023(127) - 1;
            this.field7393.method1008(var6, (byte) -21);
        }
    }

    static {
        new class213("Loaded additional fonts", "Zusatzschriftarten geladen", "Polices secondaires chargées", "Fontes principais carregadas");
    }
}
