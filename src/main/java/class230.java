import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class230 {

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "Ltl;")
    private class400 field3379 = new class400(64);

    @OriginalMember(owner = "client!lm", name = "h", descriptor = "Lui;")
    private class451 field3382;

    @OriginalMember(owner = "client!lm", name = "k", descriptor = "Lo;")
    public static class332 field3385;

    @OriginalMember(owner = "client!lm", name = "l", descriptor = "Lsh;")
    public static class472 field3386;

    @OriginalMember(owner = "client!lm", name = "m", descriptor = "Lo;")
    public static class332 field3387;

    @OriginalMember(owner = "client!lm", name = "n", descriptor = "Lfa;")
    public static class371 field3388;

    @OriginalMember(owner = "client!lm", name = "p", descriptor = "Lvg;")
    public static class51 field3390;

    @OriginalMember(owner = "client!lm", name = "q", descriptor = "I")
    public static int field3391;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "I")
    public static int field3375;

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "I")
    public static int field3376;

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "I")
    public static int field3377;

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "I")
    public static int field3378;

    @OriginalMember(owner = "client!lm", name = "f", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!lm", name = "g", descriptor = "I")
    public static int field3381;

    @OriginalMember(owner = "client!lm", name = "i", descriptor = "I")
    public static int field3383;

    @OriginalMember(owner = "client!lm", name = "j", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!lm", name = "o", descriptor = "I")
    public static int field3389;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Z)V")
    public final void method1507(boolean arg0) {
        if (!arg0) {
            return;
        }
        class400 var2 = this.field3379;
        synchronized (this.field3379) {
            this.field3379.method2388(121);
        }
        field3377++;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1508(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 != 64) {
            method1508(80, 61, 27, -9, 118, 25, 73);
        }
        if (arg5 >= class293.field4420 && arg4 <= class119.field1643 && arg0 >= class176.field2503 && class296.field4443 >= arg6) {
            if (arg2 == 1) {
                class330.method2020(arg1, (byte) 84, arg4, arg0, arg6, arg5);
            } else {
                class4.method32(arg5, arg2, (byte) -114, arg1, arg6, arg4, arg0);
            }
        } else if (arg2 == 1) {
            class231.method1516(arg6, arg5, arg4, (byte) 36, arg0, arg1);
        } else {
            class281.method1807(arg2, -30468, arg0, arg6, arg4, arg1, arg5);
        }
        field3376++;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(BI)Lga;")
    public final class227 method1509(byte arg0, int arg1) {
        int var3 = -74 / ((-arg0 - 42) / 52);
        field3383++;
        class400 var4 = this.field3379;
        class227 var5;
        synchronized (this.field3379) {
            var5 = (class227) this.field3379.method2393(-127, (long) arg1);
        }
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = this.field3382.method2691(class150.method1014((byte) -59, arg1), class281.method1808((byte) -127, arg1), 0);
        class227 var7 = new class227();
        if (var6 != null) {
            var7.method1475(new class446(var6), (byte) -82);
        }
        class400 var8 = this.field3379;
        synchronized (this.field3379) {
            this.field3379.method2395(0, var7, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)V")
    public static void method1510(int arg0) {
        field3387 = null;
        field3388 = null;
        field3385 = null;
        field3390 = null;
        field3386 = null;
        if (arg0 != -1923473896) {
            field3391 = -27;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(III)I")
    public static final int method1511(int arg0, int arg1, int arg2) {
        field3378++;
        int var3 = arg0 >>> 24;
        int var4 = ((arg0 & arg2) * var3 & 0xFF00FF00 | (arg0 & 0xFF00) * var3 & 0xFF0000) >>> 8;
        int var5 = 255 - var3;
        return (((arg1 & 0xFF00) * var5 & 0xFF0000 | (arg1 & 0xFF00FF) * var5 & 0xFF00FF00) >>> 8) + var4;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(II)V")
    public final void method1512(int arg0, int arg1) {
        class400 var3 = this.field3379;
        synchronized (this.field3379) {
            this.field3379.method2401((byte) -56);
            this.field3379 = new class400(arg1);
        }
        if (arg0 == 16711680) {
            field3381++;
        }
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(BI)V")
    public final void method1513(byte arg0, int arg1) {
        int var3 = 9 % ((arg0 + 79) / 39);
        field3375++;
        class400 var4 = this.field3379;
        synchronized (this.field3379) {
            this.field3379.method2389(false, arg1);
        }
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(Z)V")
    public final void method1514(boolean arg0) {
        field3384++;
        if (arg0) {
            this.field3382 = null;
        }
        class400 var2 = this.field3379;
        synchronized (this.field3379) {
            this.field3379.method2401((byte) -99);
        }
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lgp;ILui;)V")
    public class230(class430 arg0, int arg1, class451 arg2) {
        this.field3382 = arg2;
        if (this.field3382 != null) {
            int var4 = this.field3382.method2675(false) - 1;
            this.field3382.method2662(var4, (byte) -7);
        }
    }

    static {
        new class332("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
        field3385 = new class332("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");
        field3386 = new class472(19, 0);
        field3387 = new class332("RuneScape is loading - please wait...", "RuneScape wird geladen - bitte warten...", "Chargement de RuneScape en cours - veuillez patienter...", "RuneScape carregando. Aguarde...");
        field3388 = new class371(32);
        field3390 = new class51(5000);
        field3391 = 0;
    }
}
