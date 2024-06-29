import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class414 {

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "Ljo;")
    private class382 field6245 = new class382(64);

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "Lok;")
    private class74 field6250;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "Lfp;")
    public static class437 field6247 = new class437(9, 0, 4, 1);

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    public static int field6243;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    public static int field6244;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
    public static int field6246;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    public static int field6249;

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "I")
    public static int field6251;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "Ltv;")
    public static class294 field6248;

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "[I")
    public static int[] field6252;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
    public static final void method2478(int arg0) {
        for (class477 var1 = (class477) class154.field2334.method2957(arg0 ^ 0xFFFFFFDE); var1 != null; var1 = (class477) class154.field2334.method2947(53)) {
            if (class427.method2532(var1.field7034, (byte) -121)) {
                class411.method2462(var1, 512);
            }
        }
        if (arg0 != 64) {
            field6248 = null;
        }
        field6251++;
        if (class448.field6610 == 1) {
            class258.method1583(-12144);
            return;
        }
        class490.method2924(class27.field396, class274.field4094, class88.field1383, class148.field2227, 103);
        int var2 = class342.field5252.method2599(class227.field3205.method2103(class30.field430, (byte) 34), (byte) 102);
        for (class477 var3 = (class477) class154.field2334.method2957(113); var3 != null; var3 = (class477) class154.field2334.method2947(25)) {
            int var4 = class78.method565(270664672, var3);
            if (var2 < var4) {
                var2 = var4;
            }
        }
        class27.field396 = (class56.field774 ? 26 : 22) + class448.field6610 * 16;
        class88.field1383 = var2 + 8;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IB)V")
    public final void method2479(int arg0, byte arg1) {
        class382 var3 = this.field6245;
        synchronized (this.field6245) {
            this.field6245.method2294(arg0, true);
        }
        field6244++;
        if (arg1 != -97) {
            field6252 = null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V")
    public final void method2480(int arg0) {
        int var2 = 28 / ((arg0 + 14) / 33);
        field6249++;
        class382 var3 = this.field6245;
        synchronized (this.field6245) {
            this.field6245.method2287(103);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Z)V")
    public final void method2481(boolean arg0) {
        class382 var2 = this.field6245;
        synchronized (this.field6245) {
            this.field6245.method2293(arg0);
        }
        field6246++;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IZ)Lph;")
    public final class363 method2482(int arg0, boolean arg1) {
        field6243++;
        class382 var3 = this.field6245;
        class363 var4;
        synchronized (this.field6245) {
            var4 = (class363) this.field6245.method2288((long) arg0, 0);
        }
        if (var4 != null) {
            return var4;
        }
        class74 var5 = this.field6250;
        byte[] var6;
        synchronized (this.field6250) {
            var6 = this.field6250.method541(arg0, 35, (byte) -122);
            if (arg1) {
                this.method2482(-40, false);
            }
        }
        class363 var7 = new class363();
        if (var6 != null) {
            var7.method2165(new class468(var6), true);
        }
        var7.method2169(10);
        class382 var8 = this.field6245;
        synchronized (this.field6245) {
            this.field6245.method2290((long) arg0, var7, 100);
            return var7;
        }
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(I)V")
    public static void method2483(int arg0) {
        field6252 = null;
        field6247 = null;
        field6248 = null;
        if (arg0 != 1) {
            method2483(3);
        }
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(Lkr;ILok;)V")
    public class414(class262 arg0, int arg1, class74 arg2) {
        this.field6250 = arg2;
        if (this.field6250 != null) {
            this.field6250.method536(false, 35);
        }
    }

    static {
        new class347("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.");
    }
}
