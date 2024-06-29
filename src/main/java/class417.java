import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jea")
public class class417 {

    @OriginalMember(owner = "client!jea", name = "d", descriptor = "Lmq;")
    private class472 field5906 = new class472(16);

    @OriginalMember(owner = "client!jea", name = "h", descriptor = "Ljn;")
    private class668 field5910;

    @OriginalMember(owner = "client!jea", name = "m", descriptor = "I")
    public static int field5915 = 0;

    @OriginalMember(owner = "client!jea", name = "b", descriptor = "I")
    public static int field5904;

    @OriginalMember(owner = "client!jea", name = "c", descriptor = "I")
    public static int field5905;

    @OriginalMember(owner = "client!jea", name = "e", descriptor = "I")
    public static int field5907;

    @OriginalMember(owner = "client!jea", name = "f", descriptor = "I")
    public static int field5908;

    @OriginalMember(owner = "client!jea", name = "i", descriptor = "I")
    public static int field5911;

    @OriginalMember(owner = "client!jea", name = "j", descriptor = "I")
    public static int field5912;

    @OriginalMember(owner = "client!jea", name = "k", descriptor = "I")
    public static int field5913;

    @OriginalMember(owner = "client!jea", name = "l", descriptor = "I")
    public static int field5914;

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "Ln;")
    public static class17 field5903;

    @OriginalMember(owner = "client!jea", name = "g", descriptor = "Lgda;")
    public static class50 field5909;

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(II)Lwda;")
    public final class590 method2506(int arg0, int arg1) {
        field5905++;
        class472 var3 = this.field5906;
        class590 var4;
        synchronized (this.field5906) {
            if (arg1 != 28011) {
                field5909 = null;
            }
            var4 = (class590) this.field5906.method2766(-122, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class668 var5 = this.field5910;
        byte[] var6;
        synchronized (this.field5910) {
            var6 = this.field5910.method3800(arg0, 30, (byte) -92);
        }
        class590 var7 = new class590();
        if (var6 != null) {
            var7.method3427(0, new class389(var6));
        }
        class472 var8 = this.field5906;
        synchronized (this.field5906) {
            this.field5906.method2772(var7, true, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(Z)V")
    public final void method2507(boolean arg0) {
        class472 var2 = this.field5906;
        synchronized (this.field5906) {
            this.field5906.method2778((byte) 116);
            if (!arg0) {
                field5915 = 75;
            }
        }
        field5914++;
    }

    @OriginalMember(owner = "client!jea", name = "b", descriptor = "(Z)V")
    public static void method2508(boolean arg0) {
        field5903 = null;
        field5909 = null;
        if (arg0) {
            field5915 = -85;
        }
    }

    @OriginalMember(owner = "client!jea", name = "c", descriptor = "(Z)V")
    public final void method2509(boolean arg0) {
        class472 var2 = this.field5906;
        synchronized (this.field5906) {
            this.field5906.method2776(arg0);
        }
        if (arg0) {
            field5904 = -103;
        }
        field5907++;
    }

    @OriginalMember(owner = "client!jea", name = "b", descriptor = "(II)V")
    public final void method2510(int arg0, int arg1) {
        if (arg0 <= 85) {
            field5911 = -86;
        }
        class472 var3 = this.field5906;
        synchronized (this.field5906) {
            this.field5906.method2777(arg1, 104);
        }
        field5908++;
    }

    @OriginalMember(owner = "client!jea", name = "<init>", descriptor = "(Ler;ILjn;)V")
    public class417(class90 arg0, int arg1, class668 arg2) {
        this.field5910 = arg2;
        this.field5910.method3805(30, false);
    }
}
