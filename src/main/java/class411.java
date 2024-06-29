import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class411 {

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "Lmo;")
    private class336 field5624 = new class336(64);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "Lnl;")
    private class435 field5617;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "I")
    public int field5620;

    @OriginalMember(owner = "client!ja", name = "k", descriptor = "I")
    public static int field5627;

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "Lrc;")
    public static class108 field5625;

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "I")
    public static int field5618;

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "I")
    public static int field5621;

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "I")
    public static int field5622;

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "I")
    public static int field5623;

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "I")
    public static int field5626;

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "I")
    public static int field5628;

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "Lue;")
    public static class149 field5619;

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "Lam;")
    public static class199 field5629;

    @OriginalMember(owner = "client!ja", name = "n", descriptor = "[Ljava/lang/String;")
    public static String[] field5630;

    static {
        new class151("You are not allowed to join this user's clan channel.", "Du darfst den Chatraum dieses Benutzers nicht betreten.", "Vous n'êtes pas autorisé à rejoindre le canal de clan de cet utilisateur.", "Você não tem permissão para entrar no canal de clã desse usuário.");
        field5627 = 0;
        field5625 = new class108(43, 3);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V", line = 5)
    public final void method2456(int arg0) {
        field5623++;
        class336 var2 = this.field5624;
        synchronized (this.field5624) {
            this.field5624.method2119(0);
        }
        if (arg0 != -1855727496) {
            this.field5620 = 124;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IZ)V", line = 18)
    public final void method2457(int arg0, boolean arg1) {
        if (arg1) {
            return;
        }
        class336 var3 = this.field5624;
        synchronized (this.field5624) {
            this.field5624.method2120((byte) -126, arg0);
        }
        field5621++;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIB)V", line = 36)
    public static final void method2458(int arg0, int arg1, int arg2, byte arg3) {
        field5626++;
        if (arg3 <= 15) {
            field5619 = null;
        }
        class483 var4 = class9.field71[arg0][arg1];
        class261.method1754(13, var4 == null ? class390.field5388 : var4, arg2);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)I", line = 52)
    public static final int method2459(int arg0, int arg1, int arg2) {
        field5622++;
        int var3 = arg1 >>> 24;
        int var4 = 255 - var3;
        if (arg2 != -2153) {
            method2459(8, -33, -31);
        }
        int var5 = ((arg1 & 0xFF00) * var3 & 0xFF0000 | (arg1 & 0xFF00FF) * var3 & 0xFF00FF00) >>> 8;
        return (((arg0 & 0xFF00) * var4 & 0xFF0000 | (arg0 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8) + var5;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(BI)Log;", line = 69)
    public final class319 method2460(byte arg0, int arg1) {
        if (arg0 != 0) {
            return null;
        }
        field5628++;
        class336 var3 = this.field5624;
        class319 var4;
        synchronized (this.field5624) {
            var4 = (class319) this.field5624.method2113(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field5617.method2633(16, arg1, -112);
        class319 var6 = new class319();
        if (var5 != null) {
            var6.method2031(new class161(var5), -10764);
        }
        class336 var7 = this.field5624;
        synchronized (this.field5624) {
            this.field5624.method2116((long) arg1, (byte) -116, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Z)V", line = 105)
    public final void method2461(boolean arg0) {
        field5618++;
        class336 var2 = this.field5624;
        synchronized (this.field5624) {
            this.field5624.method2109(-1);
        }
        if (arg0) {
            field5630 = null;
        }
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)V", line = 122)
    public static void method2462(int arg0) {
        field5625 = null;
        if (arg0 <= 83) {
            field5627 = 33;
        }
        field5619 = null;
        field5629 = null;
        field5630 = null;
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(Llo;ILnl;)V", line = 137)
    public class411(class280 arg0, int arg1, class435 arg2) {
        this.field5617 = arg2;
        if (this.field5617 == null) {
            this.field5620 = 0;
        } else {
            this.field5620 = this.field5617.method2638(1, 16);
        }
    }
}
