import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class109 {

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "Lka;")
    private class473 field1757 = new class473(64);

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "Lka;")
    private class473 field1764 = new class473(100);

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "Ldk;")
    private class421 field1763;

    @OriginalMember(owner = "client!ec", name = "l", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!ec", name = "n", descriptor = "[I")
    public static int[] field1770;

    @OriginalMember(owner = "client!ec", name = "o", descriptor = "[Lwh;")
    public static class420[] field1771;

    @OriginalMember(owner = "client!ec", name = "m", descriptor = "Lkc;")
    public static class157 field1769;

    @OriginalMember(owner = "client!ec", name = "p", descriptor = "Lkc;")
    public static class157 field1772;

    @OriginalMember(owner = "client!ec", name = "q", descriptor = "Lrb;")
    public static class283 field1773;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
    public static int field1758;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
    public static int field1759;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
    public static int field1761;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "I")
    public static int field1765;

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "I")
    public static int field1766;

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IB)Lwh;")
    public final class420 method827(int arg0, byte arg1) {
        int var3 = -30 % ((arg1 + 68) / 51);
        field1761++;
        class473 var4 = this.field1764;
        class420 var5;
        synchronized (this.field1764) {
            var5 = (class420) this.field1764.method2767((long) arg0, 0);
            if (var5 == null) {
                var5 = new class420(arg0);
                this.field1764.method2777(-1025, var5, (long) arg0);
            }
        }
        synchronized (var5) {
            return var5.method2482(false) ? var5 : null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Ldk;ZLdk;)I")
    public static final int method828(class421 arg0, boolean arg1, class421 arg2) {
        field1765++;
        if (arg1) {
            field1769 = null;
        }
        int var3 = 0;
        if (arg0.method2517(class454.field6637, (byte) -116)) {
            var3++;
        }
        if (arg0.method2517(class521.field7644, (byte) -105)) {
            var3++;
        }
        if (arg0.method2517(class348.field4999, (byte) -91)) {
            var3++;
        }
        if (arg2.method2517(class454.field6637, (byte) -19)) {
            var3++;
        }
        if (arg2.method2517(class521.field7644, (byte) -104)) {
            var3++;
        }
        if (arg2.method2517(class348.field4999, (byte) -35)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
    public static void method829(int arg0) {
        field1770 = null;
        field1773 = null;
        field1769 = null;
        field1771 = null;
        field1772 = null;
        if (arg0 != 2) {
            field1771 = null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)V")
    public final void method830(int arg0) {
        class473 var2 = this.field1757;
        synchronized (this.field1757) {
            this.field1757.method2764(-769);
        }
        field1760++;
        class473 var3 = this.field1764;
        synchronized (this.field1764) {
            this.field1764.method2764(arg0 ^ 0xFFFFFCF1);
            if (arg0 != 14) {
                this.method831(-32, (byte) 93);
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(IB)Ljp;")
    public final class55 method831(int arg0, byte arg1) {
        field1758++;
        class473 var3 = this.field1757;
        class55 var4;
        synchronized (this.field1757) {
            var4 = (class55) this.field1757.method2767((long) arg0, 0);
        }
        if (arg1 != 54) {
            method829(-46);
        }
        if (var4 != null) {
            return var4;
        }
        class421 var5 = this.field1763;
        byte[] var6;
        synchronized (this.field1763) {
            var6 = this.field1763.method2512(class180.method1226(2, arg0), (byte) -93, class54.method348(arg0, false));
        }
        class55 var7 = new class55();
        var7.field790 = this;
        var7.field801 = arg0;
        if (var6 != null) {
            var7.method356(new class319(var6), (byte) -117);
        }
        var7.method360(88);
        class473 var8 = this.field1757;
        synchronized (this.field1757) {
            this.field1757.method2777(arg1 ^ 0xFFFFFBC9, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(I)[Lvr;")
    public static final class187[] method832(int arg0) {
        field1767++;
        int var1 = 11 / ((arg0 - 57) / 33);
        return new class187[] { class81.field1144, class478.field6908, class271.field3659, class270.field3637, class6.field79, class232.field3236 };
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)V")
    public final void method833(int arg0, int arg1) {
        field1759++;
        class473 var3 = this.field1757;
        synchronized (this.field1757) {
            if (arg1 <= 97) {
                return;
            }
            this.field1757.method2779(14896, arg0);
        }
        class473 var4 = this.field1764;
        synchronized (this.field1764) {
            this.field1764.method2779(14896, arg0);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lat;Lza;B)V")
    public static final void method834(class444 arg0, class295 arg1, byte arg2) {
        field1762++;
        boolean var3 = class534.field7872.method3084(arg1, arg0.field6501 ? class81.field1158.field7015 : null, (byte) -4, arg0.field6466, arg0.field6463, arg0.field6475, arg0.field6481, arg0.field6400 | 0xFF000000) == null;
        if (var3) {
            class279.field3799.method3139(0, new class332(arg0.field6481, arg0.field6475, arg0.field6466, arg0.field6400 | 0xFF000000, arg0.field6463, arg0.field6501));
            class151.method1093(arg0, 117);
        }
        if (arg2 >= -113) {
            field1772 = null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "(I)V")
    public final void method835(int arg0) {
        field1766++;
        class473 var2 = this.field1757;
        synchronized (this.field1757) {
            if (arg0 != 100) {
                field1768 = -94;
            }
            this.field1757.method2774((byte) -20);
        }
        class473 var3 = this.field1764;
        synchronized (this.field1764) {
            this.field1764.method2774((byte) -77);
        }
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Lad;ILdk;Ldk;Ldk;)V")
    public class109(class12 arg0, int arg1, class421 arg2, class421 arg3, class421 arg4) {
        this.field1763 = arg2;
        if (this.field1763 != null) {
            int var6 = this.field1763.method2493((byte) -41) - 1;
            this.field1763.method2509(0, var6);
        }
        class6.method36(arg4, arg3, 4);
    }

    static {
        new class157("From", "Von:", "De", "De");
        new class157("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.");
        field1768 = 765;
        field1770 = new int[2];
        field1771 = new class420[14];
        field1769 = new class157("white:", "weiss:", "blanc:", "branco:");
        field1772 = new class157("flash2:", "blinken2:", "clignotant2:", "flash2:");
        field1773 = new class283(76, 3);
    }
}
