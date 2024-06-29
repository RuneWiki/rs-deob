import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class234 {

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "Ljv;")
    private class55 field3405 = new class55(16);

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "Lbu;")
    private class17 field3401;

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "Lpi;")
    public static class342 field3409;

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "F")
    public static float field3408;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
    public static int field3402;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
    public static int field3403;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
    public static int field3404;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "I")
    public static int field3406;

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "I")
    public static int field3407;

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "I")
    public static int field3411;

    static {
        new class342("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
        new class342("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
        field3409 = new class342("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IB)V", line = 3)
    public final void method1537(int arg0, byte arg1) {
        field3407++;
        class55 var3 = this.field3405;
        synchronized (this.field3405) {
            if (arg1 == 103) {
                this.field3405.method493(false, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Z)V", line = 17)
    public final void method1538(boolean arg0) {
        field3402++;
        if (!arg0) {
            this.method1539(71, -44);
        }
        class55 var2 = this.field3405;
        synchronized (this.field3405) {
            this.field3405.method488(-3);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)Lsl;", line = 34)
    public final class316 method1539(int arg0, int arg1) {
        field3404++;
        class55 var3 = this.field3405;
        class316 var4;
        synchronized (this.field3405) {
            var4 = (class316) this.field3405.method494(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field3401.method114(arg0, 30, 124);
        class316 var6 = new class316();
        if (var5 != null) {
            var6.method2060(-127, new class145(var5));
        }
        class55 var7 = this.field3405;
        synchronized (this.field3405) {
            if (arg1 != -3765) {
                this.method1539(-104, -98);
            }
            this.field3405.method485((long) arg0, (byte) -125, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(BLop;)Z", line = 62)
    public static final boolean method1540(byte arg0, class124 arg1) {
        field3406++;
        if (arg0 != -104) {
            method1541((byte) 109);
        }
        return class284.field4055 == arg1 || class516.field7583 == arg1 || class257.field3728 == arg1 || class4.field112 == arg1;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)V", line = 76)
    public static void method1541(byte arg0) {
        field3409 = null;
        if (arg0 != -16) {
            field3410 = -35;
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(Z)V", line = 87)
    public final void method1542(boolean arg0) {
        field3403++;
        class55 var2 = this.field3405;
        synchronized (this.field3405) {
            this.field3405.method484(-69);
        }
        if (!arg0) {
            this.field3401 = null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Loq;ILbu;)V", line = 108)
    public class234(class239 arg0, int arg1, class17 arg2) {
        this.field3401 = arg2;
        this.field3401.method119(29630, 30);
    }
}
