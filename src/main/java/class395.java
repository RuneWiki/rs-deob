import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class395 {

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "Lgk;")
    public class264 field5735 = new class264();

    @OriginalMember(owner = "client!eb", name = "n", descriptor = "Z")
    public static boolean field5747 = false;

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "Ljn;")
    public static class409 field5744 = new class409("Loading fonts - ", "Lade Schriftsätze - ", "Chargement des polices - ", "Carregando fontes - ");

    @OriginalMember(owner = "client!eb", name = "t", descriptor = "I")
    public static int field5753 = 0;

    @OriginalMember(owner = "client!eb", name = "u", descriptor = "Lvq;")
    public static class24 field5754;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
    public static int field5734;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "I")
    public static int field5736;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "I")
    public static int field5737;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
    public static int field5738;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
    public static int field5739;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "I")
    public static int field5740;

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "I")
    public static int field5741;

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "I")
    public static int field5742;

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "I")
    public static int field5743;

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "I")
    public static int field5745;

    @OriginalMember(owner = "client!eb", name = "m", descriptor = "I")
    public static int field5746;

    @OriginalMember(owner = "client!eb", name = "o", descriptor = "I")
    public static int field5748;

    @OriginalMember(owner = "client!eb", name = "p", descriptor = "I")
    public static int field5749;

    @OriginalMember(owner = "client!eb", name = "q", descriptor = "I")
    public static int field5750;

    @OriginalMember(owner = "client!eb", name = "r", descriptor = "I")
    public static int field5751;

    @OriginalMember(owner = "client!eb", name = "s", descriptor = "Lgk;")
    private class264 field5752;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)Z")
    public final boolean method2473(byte arg0) {
        if (arg0 > -118) {
            return true;
        } else {
            field5734++;
            return this.field5735.field3906 == this.field5735;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILgk;)V")
    public final void method2474(int arg0, class264 arg1) {
        if (arg0 != -11725) {
            return;
        }
        field5743++;
        if (arg1.field3908 != null) {
            arg1.method1820(-25246);
        }
        arg1.field3906 = this.field5735.field3906;
        arg1.field3908 = this.field5735;
        arg1.field3908.field3906 = arg1;
        arg1.field3906.field3908 = arg1;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V")
    public static void method2475(int arg0) {
        field5744 = null;
        field5754 = null;
        if (arg0 != 3) {
            field5754 = null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)Lgk;")
    public final class264 method2476(int arg0) {
        field5738++;
        class264 var2 = this.field5735.field3906;
        if (this.field5735 == var2) {
            return null;
        }
        if (arg0 != -29642) {
            field5744 = null;
        }
        var2.method1820(-25246);
        return var2;
    }

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "(I)V")
    public final void method2477(int arg0) {
        while (true) {
            class264 var2 = this.field5735.field3906;
            if (this.field5735 == var2) {
                field5749++;
                if (arg0 != -14221) {
                    this.method2482(68);
                }
                this.field5752 = null;
                return;
            }
            var2.method1820(-25246);
        }
    }

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "(I)Lgk;")
    public final class264 method2478(int arg0) {
        field5750++;
        if (arg0 != 1603) {
            return null;
        }
        class264 var2 = this.field5735.field3906;
        if (this.field5735 == var2) {
            this.field5752 = null;
            return null;
        } else {
            this.field5752 = var2.field3906;
            return var2;
        }
    }

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "(I)Lgk;")
    public final class264 method2479(int arg0) {
        field5740++;
        if (arg0 != -1) {
            field5753 = 24;
        }
        class264 var2 = this.field5735.field3908;
        if (this.field5735 == var2) {
            this.field5752 = null;
            return null;
        } else {
            this.field5752 = var2.field3908;
            return var2;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BII)V")
    public static final void method2480(byte arg0, int arg1, int arg2) {
        field5746++;
        class125 var3 = class56.method428(arg2, 7, -3636);
        var3.method846(26848);
        var3.field1657 = arg1;
        if (arg0 != -32) {
            field5753 = -89;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "([I[Ljava/lang/Object;I)V")
    public static final void method2481(int[] arg0, Object[] arg1, int arg2) {
        if (arg2 != 3) {
            field5754 = null;
        }
        class322.method2112(arg0, arg1, 0, -31706, arg0.length - 1);
        field5737++;
    }

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "(I)Lgk;")
    public final class264 method2482(int arg0) {
        if (arg0 != -5046) {
            this.method2473((byte) -5);
        }
        field5741++;
        class264 var2 = this.field5752;
        if (this.field5735 == var2) {
            this.field5752 = null;
            return null;
        } else {
            this.field5752 = var2.field3908;
            return var2;
        }
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(B)I")
    public final int method2483(byte arg0) {
        field5751++;
        int var2 = 0;
        class264 var3 = this.field5735.field3906;
        while (this.field5735 != var3) {
            var3 = var3.field3906;
            var2++;
        }
        return arg0 >= -117 ? -88 : var2;
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(ILgk;)V")
    public final void method2484(int arg0, class264 arg1) {
        field5736++;
        if (arg0 != 0) {
            return;
        }
        if (arg1.field3908 != null) {
            arg1.method1820(-25246);
        }
        arg1.field3906 = this.field5735;
        arg1.field3908 = this.field5735.field3908;
        arg1.field3908.field3906 = arg1;
        arg1.field3906.field3908 = arg1;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)Luq;")
    public static final class241 method2485(int arg0, int arg1) {
        field5745++;
        class304[] var2 = class5.field84;
        synchronized (class5.field84) {
            class241 var3;
            if (arg1 >= class5.field84.length || class5.field84[arg1].method2020(-118)) {
                var3 = new class241();
                var3.field3578 = new class396[arg1];
                for (int var4 = 0; var4 < arg1; var4++) {
                    var3.field3578[var4] = new class396();
                }
            } else {
                var3 = (class241) class5.field84[arg1].method2028((byte) -73);
                var3.method2611(-1);
                int var10002 = class323.field4768[arg1]--;
            }
            if (arg0 != -29083) {
                method2481((int[]) null, (Object[]) null, 58);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "(B)Lgk;")
    public final class264 method2486(byte arg0) {
        field5748++;
        if (arg0 != -82) {
            this.method2483((byte) 4);
        }
        class264 var2 = this.field5752;
        if (this.field5735 == var2) {
            this.field5752 = null;
            return null;
        } else {
            this.field5752 = var2.field3906;
            return var2;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BLeb;Lgk;)V")
    private final void method2487(byte arg0, class395 arg1, class264 arg2) {
        field5739++;
        class264 var4 = this.field5735.field3908;
        this.field5735.field3908 = arg2.field3908;
        arg2.field3908.field3906 = this.field5735;
        if (this.field5735 != arg2) {
            arg2.field3908 = arg1.field5735.field3908;
            arg2.field3908.field3906 = arg2;
            var4.field3906 = arg1.field5735;
            arg1.field5735.field3908 = var4;
        }
        if (arg0 != -120) {
            field5747 = true;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILeb;)V")
    public final void method2488(int arg0, class395 arg1) {
        field5742++;
        this.method2487((byte) -120, arg1, this.field5735.field3906);
        if (arg0 != 3451) {
            field5754 = null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "()V")
    public class395() {
        this.field5735.field3906 = this.field5735;
        this.field5735.field3908 = this.field5735;
    }

    static {
        new class409("Unable to send abuse report - system busy.", "Unable to send abuse report - system busy.", "Unable to send abuse report - system busy.", "Unable to send abuse report - system busy.");
        field5754 = new class24(3, -1);
    }
}
