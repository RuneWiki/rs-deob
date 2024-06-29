import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class402 {

    @OriginalMember(owner = "client!im", name = "g", descriptor = "Lnj;")
    private class162 field5895 = new class162(64);

    @OriginalMember(owner = "client!im", name = "p", descriptor = "Lnj;")
    public class162 field5904 = new class162(64);

    @OriginalMember(owner = "client!im", name = "j", descriptor = "Lmg;")
    private class101 field5898;

    @OriginalMember(owner = "client!im", name = "e", descriptor = "Lmg;")
    public class101 field5893;

    @OriginalMember(owner = "client!im", name = "f", descriptor = "Lri;")
    public static class74 field5894 = new class74(9, 3);

    @OriginalMember(owner = "client!im", name = "l", descriptor = "Lqp;")
    public static class466 field5900 = new class466("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado");

    @OriginalMember(owner = "client!im", name = "a", descriptor = "I")
    public static int field5889;

    @OriginalMember(owner = "client!im", name = "b", descriptor = "I")
    public static int field5890;

    @OriginalMember(owner = "client!im", name = "c", descriptor = "I")
    public static int field5891;

    @OriginalMember(owner = "client!im", name = "d", descriptor = "I")
    public static int field5892;

    @OriginalMember(owner = "client!im", name = "h", descriptor = "I")
    public static int field5896;

    @OriginalMember(owner = "client!im", name = "i", descriptor = "I")
    public static int field5897;

    @OriginalMember(owner = "client!im", name = "k", descriptor = "I")
    public static int field5899;

    @OriginalMember(owner = "client!im", name = "m", descriptor = "I")
    public static int field5901;

    @OriginalMember(owner = "client!im", name = "o", descriptor = "Lmh;")
    public static class444 field5903;

    @OriginalMember(owner = "client!im", name = "n", descriptor = "Lqu;")
    public static class64 field5902;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(I)V")
    public final void method2420(int arg0) {
        field5890++;
        class162 var2 = this.field5895;
        synchronized (this.field5895) {
            this.field5895.method1066(arg0 + 4016);
        }
        class162 var3 = this.field5904;
        synchronized (this.field5904) {
            this.field5904.method1066(4080);
            if (arg0 != 64) {
                field5900 = null;
            }
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(III)V")
    public final void method2421(int arg0, int arg1, int arg2) {
        if (arg2 != 9) {
            this.method2420(-118);
        }
        this.field5895 = new class162(arg1);
        field5891++;
        this.field5904 = new class162(arg0);
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(II)V")
    public final void method2422(int arg0, int arg1) {
        field5897++;
        if (arg1 != -1) {
            method2425(-51, 88);
        }
        class162 var3 = this.field5895;
        synchronized (this.field5895) {
            this.field5895.method1065((byte) -95, arg0);
        }
        class162 var4 = this.field5904;
        synchronized (this.field5904) {
            this.field5904.method1065((byte) -95, arg0);
        }
    }

    @OriginalMember(owner = "client!im", name = "b", descriptor = "(II)Lat;")
    public final class256 method2423(int arg0, int arg1) {
        field5892++;
        class162 var3 = this.field5895;
        class256 var4;
        synchronized (this.field5895) {
            var4 = (class256) this.field5895.method1073((long) arg0, false);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field5898.method727(arg0, 34, -74);
        class256 var6 = new class256();
        if (arg1 != 64) {
            field5902 = null;
        }
        var6.field3552 = this;
        if (var5 != null) {
            var6.method1538(new class391(var5), 1007);
        }
        class162 var7 = this.field5895;
        synchronized (this.field5895) {
            this.field5895.method1072((long) arg0, var6, false);
            return var6;
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(B)V")
    public final void method2424(byte arg0) {
        class162 var2 = this.field5895;
        synchronized (this.field5895) {
            this.field5895.method1068(0);
        }
        field5896++;
        class162 var3 = this.field5904;
        synchronized (this.field5904) {
            this.field5904.method1068(0);
        }
        int var4 = 7 % ((arg0 + 59) / 36);
    }

    @OriginalMember(owner = "client!im", name = "c", descriptor = "(II)I")
    public static final int method2425(int arg0, int arg1) {
        field5889++;
        if (arg0 == 34) {
            return arg1 == 16711935 ? -1 : class385.method2274(arg1, false);
        } else {
            return 13;
        }
    }

    @OriginalMember(owner = "client!im", name = "b", descriptor = "(I)V")
    public static void method2426(int arg0) {
        if (arg0 >= -121) {
            field5901 = 115;
        }
        field5903 = null;
        field5894 = null;
        field5900 = null;
        field5902 = null;
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "(Lal;ILmg;Lmg;)V")
    public class402(class66 arg0, int arg1, class101 arg2, class101 arg3) {
        this.field5898 = arg2;
        this.field5893 = arg3;
        this.field5898.method753(34, -62);
    }
}
