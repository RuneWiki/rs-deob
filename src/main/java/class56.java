import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public class class56 {

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "Ljv;")
    private class55 field967 = new class55(64);

    @OriginalMember(owner = "client!gv", name = "r", descriptor = "Ljv;")
    public class55 field983 = new class55(50);

    @OriginalMember(owner = "client!gv", name = "s", descriptor = "Ljv;")
    public class55 field984 = new class55(5);

    @OriginalMember(owner = "client!gv", name = "g", descriptor = "Lbu;")
    public class17 field972;

    @OriginalMember(owner = "client!gv", name = "e", descriptor = "Z")
    public boolean field970;

    @OriginalMember(owner = "client!gv", name = "l", descriptor = "Lbu;")
    private class17 field977;

    @OriginalMember(owner = "client!gv", name = "c", descriptor = "Lpi;")
    public static class342 field968 = new class342("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");

    @OriginalMember(owner = "client!gv", name = "m", descriptor = "Lrn;")
    public static class174 field978 = new class174(72, 3);

    @OriginalMember(owner = "client!gv", name = "q", descriptor = "Lgr;")
    public static class296 field982 = new class296(6, 7);

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "I")
    public static int field966;

    @OriginalMember(owner = "client!gv", name = "d", descriptor = "I")
    public static int field969;

    @OriginalMember(owner = "client!gv", name = "f", descriptor = "I")
    public static int field971;

    @OriginalMember(owner = "client!gv", name = "h", descriptor = "I")
    public static int field973;

    @OriginalMember(owner = "client!gv", name = "i", descriptor = "I")
    public static int field974;

    @OriginalMember(owner = "client!gv", name = "j", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!gv", name = "k", descriptor = "I")
    public static int field976;

    @OriginalMember(owner = "client!gv", name = "n", descriptor = "I")
    public static int field979;

    @OriginalMember(owner = "client!gv", name = "o", descriptor = "I")
    public static int field980;

    @OriginalMember(owner = "client!gv", name = "t", descriptor = "I")
    public int field985;

    @OriginalMember(owner = "client!gv", name = "p", descriptor = "Lbu;")
    public static class17 field981;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(ZZ)V")
    public final void method496(boolean arg0, boolean arg1) {
        field975++;
        if (this.field970 == arg1) {
            return;
        }
        if (!arg0) {
            field968 = null;
        }
        this.field970 = arg1;
        this.method498(3);
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(I)V")
    public static void method497(int arg0) {
        field968 = null;
        field982 = null;
        field978 = null;
        if (arg0 >= 118) {
            field981 = null;
        }
    }

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "(I)V")
    public final void method498(int arg0) {
        field973++;
        class55 var2 = this.field967;
        synchronized (this.field967) {
            this.field967.method488(-3);
            if (arg0 != 3) {
                field968 = null;
            }
        }
        class55 var3 = this.field983;
        synchronized (this.field983) {
            this.field983.method488(-3);
        }
        class55 var4 = this.field984;
        synchronized (this.field984) {
            this.field984.method488(-3);
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(II)V")
    public final void method499(int arg0, int arg1) {
        field966++;
        class55 var3 = this.field967;
        synchronized (this.field967) {
            this.field967.method493(false, arg1);
            if (arg0 <= 102) {
                field981 = null;
            }
        }
        class55 var4 = this.field983;
        synchronized (this.field983) {
            this.field983.method493(false, arg1);
        }
        class55 var5 = this.field984;
        synchronized (this.field984) {
            this.field984.method493(false, arg1);
        }
    }

    @OriginalMember(owner = "client!gv", name = "c", descriptor = "(I)V")
    public final void method500(int arg0) {
        field971++;
        class55 var2 = this.field967;
        synchronized (this.field967) {
            this.field967.method484(-78);
        }
        class55 var3 = this.field983;
        synchronized (this.field983) {
            this.field983.method484(arg0 - 71);
        }
        class55 var4 = this.field984;
        synchronized (this.field984) {
            this.field984.method484(-128);
        }
        if (arg0 != -1) {
            field981 = null;
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(BI)V")
    public final void method501(byte arg0, int arg1) {
        field974++;
        this.field985 = arg1;
        class55 var3 = this.field983;
        synchronized (this.field983) {
            this.field983.method488(-3);
        }
        if (arg0 < -102) {
            class55 var4 = this.field984;
            synchronized (this.field984) {
                this.field984.method488(-3);
            }
        }
    }

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "(II)Lda;")
    public final class42 method502(int arg0, int arg1) {
        field969++;
        class55 var3 = this.field967;
        class42 var5;
        synchronized (this.field967) {
            if (arg1 > -2) {
                return null;
            }
            var5 = (class42) this.field967.method494(0, (long) arg0);
        }
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = this.field977.method114(class245.method1594(true, arg0), class408.method2486(31293, arg0), -90);
        class42 var7 = new class42();
        var7.field751 = arg0;
        var7.field769 = this;
        if (var6 != null) {
            var7.method424(false, new class145(var6));
        }
        var7.method426((byte) -64);
        class55 var8 = this.field967;
        synchronized (this.field967) {
            this.field967.method485((long) arg0, (byte) -125, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!gv", name = "d", descriptor = "(I)V")
    public final void method503(int arg0) {
        int var2 = 17 / ((arg0 - 2) / 56);
        field979++;
        class55 var3 = this.field983;
        synchronized (this.field983) {
            this.field983.method488(-3);
        }
        class55 var4 = this.field984;
        synchronized (this.field984) {
            this.field984.method488(-3);
        }
    }

    @OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(Loq;IZLbu;Lbu;)V")
    public class56(class239 arg0, int arg1, boolean arg2, class17 arg3, class17 arg4) {
        this.field972 = arg4;
        this.field970 = arg2;
        this.field977 = arg3;
        if (this.field977 != null) {
            int var6 = this.field977.method138(false) - 1;
            this.field977.method119(29630, var6);
        }
    }
}
