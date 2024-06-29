import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class13 {

    @OriginalMember(owner = "client!be", name = "f", descriptor = "Ljb;")
    private class64 field288 = new class64();

    @OriginalMember(owner = "client!be", name = "l", descriptor = "I")
    public static int field294 = 3353893;

    @OriginalMember(owner = "client!be", name = "e", descriptor = "Lrd;")
    public static class114 field287 = class84.method656("Gegenstand f-Ur Mitglieder", (byte) 117);

    @OriginalMember(owner = "client!be", name = "k", descriptor = "I")
    public static int field293 = -1;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "Lrd;")
    public static class114 field286 = class84.method656("Spiel)2Fenster geladen)3", (byte) 127);

    @OriginalMember(owner = "client!be", name = "c", descriptor = "Lnd;")
    public static class90 field285 = null;

    @OriginalMember(owner = "client!be", name = "h", descriptor = "[Lce;")
    public static class20[] field290 = new class20[50];

    @OriginalMember(owner = "client!be", name = "m", descriptor = "I")
    public static int field295 = 0;

    @OriginalMember(owner = "client!be", name = "r", descriptor = "I")
    public static int field300 = 0;

    @OriginalMember(owner = "client!be", name = "o", descriptor = "Lrd;")
    public static class114 field297 = class84.method656("Ihre Nachricht an: ", (byte) 123);

    @OriginalMember(owner = "client!be", name = "a", descriptor = "I")
    public static int field283;

    @OriginalMember(owner = "client!be", name = "b", descriptor = "I")
    public static int field284;

    @OriginalMember(owner = "client!be", name = "g", descriptor = "I")
    public static int field289;

    @OriginalMember(owner = "client!be", name = "j", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!be", name = "n", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!be", name = "p", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!be", name = "q", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "client!be", name = "i", descriptor = "[[B")
    public static byte[][] field291;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(B)Ljb;")
    public final class64 method107(byte arg0) {
        field289++;
        class64 var2 = this.field288.field1359;
        if (this.field288 == var2) {
            return null;
        } else if (arg0 == -53) {
            var2.method519((byte) -117);
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Ljb;B)V")
    public final void method108(class64 arg0, byte arg1) {
        if (arg0.field1364 != null) {
            arg0.method519((byte) -89);
        }
        arg0.field1359 = this.field288;
        if (arg1 > -111) {
            field300 = -109;
        }
        field299++;
        arg0.field1364 = this.field288.field1364;
        arg0.field1364.field1359 = arg0;
        arg0.field1359.field1364 = arg0;
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(B)Ljb;")
    public final class64 method109(byte arg0) {
        field283++;
        class64 var2 = this.field288.field1359;
        if (arg0 >= -59) {
            this.method107((byte) -98);
        }
        return this.field288 == var2 ? null : var2;
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "()V")
    public class13() {
        this.field288.field1364 = this.field288;
        this.field288.field1359 = this.field288;
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(Ljb;B)V")
    public final void method110(class64 arg0, byte arg1) {
        if (arg0.field1364 != null) {
            arg0.method519((byte) -83);
        }
        field296++;
        if (arg1 != -20) {
            this.method109((byte) 119);
        }
        arg0.field1359 = this.field288.field1359;
        arg0.field1364 = this.field288;
        arg0.field1364.field1359 = arg0;
        arg0.field1359.field1364 = arg0;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ILrd;Lrd;Lrd;)V")
    public static final void method111(int arg0, class114 arg1, class114 arg2, class114 arg3) {
        class42.field870 = arg2;
        field284++;
        class42.field853 = arg3;
        class42.field857 = arg1;
        if (arg0 != 0) {
            field294 = 57;
        }
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "(B)V")
    public static void method112(byte arg0) {
        field290 = null;
        if (arg0 >= -66) {
            return;
        }
        field287 = null;
        field285 = null;
        field291 = null;
        field297 = null;
        field286 = null;
    }
}
