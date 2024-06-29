import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public class class220 {

    @OriginalMember(owner = "client!hs", name = "n", descriptor = "Lub;")
    private class18 field3366 = new class18();

    @OriginalMember(owner = "client!hs", name = "o", descriptor = "I")
    private int field3367;

    @OriginalMember(owner = "client!hs", name = "g", descriptor = "I")
    private int field3359;

    @OriginalMember(owner = "client!hs", name = "f", descriptor = "Lhl;")
    private class375 field3358;

    @OriginalMember(owner = "client!hs", name = "m", descriptor = "[B")
    public static byte[] field3365;

    @OriginalMember(owner = "client!hs", name = "q", descriptor = "Lqt;")
    public static class459 field3369;

    @OriginalMember(owner = "client!hs", name = "t", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!hs", name = "r", descriptor = "Lhl;")
    public static class375 field3370;

    @OriginalMember(owner = "client!hs", name = "u", descriptor = "I")
    public static int field3373;

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "I")
    public static int field3353;

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!hs", name = "c", descriptor = "I")
    public static int field3355;

    @OriginalMember(owner = "client!hs", name = "d", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!hs", name = "e", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!hs", name = "h", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!hs", name = "i", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!hs", name = "j", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!hs", name = "k", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!hs", name = "l", descriptor = "I")
    public static int field3364;

    @OriginalMember(owner = "client!hs", name = "p", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!hs", name = "s", descriptor = "Lp;")
    public static class149 field3371;

    static {
        new class44("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un ami - système occupé.", "Não foi possível adicionar o amigo. O sistema está ocupado.");
        field3365 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };
        new class44("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.");
        new class44("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
        field3369 = new class459(30, 3);
        field3372 = 0;
        field3370 = new class375(8);
        field3373 = 2;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Ljava/lang/Object;Ltp;I)V", line = 3)
    public final void method1489(Object arg0, class379 arg1, int arg2) {
        this.method1493(5823, arg1, arg0, 1);
        if (arg2 == 24216) {
            field3353++;
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(BI)V", line = 17)
    public final void method1490(byte arg0, int arg1) {
        if (arg0 != -79) {
            return;
        }
        field3362++;
        if (class119.field1848 == null) {
            return;
        }
        for (class385 var3 = (class385) this.field3366.method102(1048575); var3 != null; var3 = (class385) this.field3366.method105((byte) 43)) {
            if (var3.method2098(arg0 ^ 0x15)) {
                if (var3.method2097((byte) 63) == null) {
                    var3.method421(22071);
                    var3.method3115((byte) 103);
                    this.field3367 += var3.field5501;
                }
            } else if (((long) arg1) < (++var3.field7659)) {
                class385 var4 = class119.field1848.method2069(var3, true);
                this.field3358.method2292(var3.field863, var4, (byte) -128);
                class313.method1987(var3, arg0 - 26401, var4);
                var3.method421(22071);
                var3.method3115((byte) 103);
            }
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(B)V", line = 65)
    public static void method1491(byte arg0) {
        if (arg0 < 14) {
            field3369 = null;
        }
        field3369 = null;
        field3365 = null;
        field3371 = null;
        field3370 = null;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Lac;I)V", line = 82)
    private final void method1492(class385 arg0, int arg1) {
        if (arg1 != 23361) {
            field3369 = null;
        }
        field3355++;
        if (arg0 != null) {
            arg0.method421(arg1 - 1290);
            arg0.method3115((byte) 103);
            this.field3367 += arg0.field5501;
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(ILtp;Ljava/lang/Object;I)V", line = 101)
    private final void method1493(int arg0, class379 arg1, Object arg2, int arg3) {
        field3361++;
        if (this.field3359 < arg3) {
            throw new IllegalStateException("s>cs");
        }
        this.method1499(arg1, -15777);
        this.field3367 -= arg3;
        while (this.field3367 < 0) {
            class385 var6 = (class385) this.field3366.method103(1048575);
            this.method1492(var6, 23361);
        }
        class412 var5 = new class412(arg1, arg2, arg3);
        this.field3358.method2292(arg1.method2247((byte) 63), var5, (byte) -128);
        this.field3366.method99(var5, 5604);
        var5.field7659 = 0L;
        if (arg0 != 5823) {
            method1491((byte) 37);
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Ltp;I)Ljava/lang/Object;", line = 131)
    public final Object method1494(class379 arg0, int arg1) {
        field3363++;
        long var3 = arg0.method2247((byte) 63);
        for (class385 var5 = (class385) this.field3358.method2284(true, var3); var5 != null; var5 = (class385) this.field3358.method2290((byte) -125)) {
            if (var5.field5497.method2241(arg0, -22538)) {
                Object var6 = var5.method2097((byte) 127);
                if (var6 != null) {
                    if (var5.method2098(-123)) {
                        class412 var7 = new class412(arg0, var6, var5.field5501);
                        this.field3358.method2292(var5.field863, var7, (byte) -128);
                        this.field3366.method99(var7, 5604);
                        var7.field7659 = 0L;
                        var5.method421(22071);
                        var5.method3115((byte) 103);
                    } else {
                        this.field3366.method99(var5, 5604);
                        var5.field7659 = 0L;
                    }
                    return var6;
                }
                var5.method421(22071);
                var5.method3115((byte) 103);
                this.field3367 += var5.field5501;
            }
        }
        if (arg1 != 0) {
            this.method1498(92);
        }
        return null;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(I)V", line = 191)
    public final void method1495(int arg0) {
        field3356++;
        class385 var2 = (class385) this.field3366.method102(1048575);
        if (arg0 != 1) {
            field3370 = null;
        }
        while (var2 != null) {
            if (var2.method2098(-105)) {
                var2.method421(22071);
                var2.method3115((byte) 103);
                this.field3367 += var2.field5501;
            }
            var2 = (class385) this.field3366.method105((byte) 43);
        }
    }

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(B)I", line = 217)
    public final int method1496(byte arg0) {
        field3364++;
        int var2 = -5 / ((arg0 + 35) / 62);
        return this.field3359;
    }

    @OriginalMember(owner = "client!hs", name = "c", descriptor = "(B)I", line = 227)
    public final int method1497(byte arg0) {
        if (arg0 >= -6) {
            this.method1489(null, null, 43);
        }
        field3360++;
        return this.field3367;
    }

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(I)V", line = 248)
    public final void method1498(int arg0) {
        field3354++;
        this.field3366.method101((byte) -128);
        this.field3358.method2286((byte) 19);
        if (arg0 != 0) {
            this.field3366 = null;
        }
        this.field3367 = this.field3359;
    }

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(Ltp;I)V", line = 261)
    private final void method1499(class379 arg0, int arg1) {
        field3357++;
        long var3 = arg0.method2247((byte) 63);
        if (arg1 != -15777) {
            return;
        }
        for (class385 var5 = (class385) this.field3358.method2284(true, var3); var5 != null; var5 = (class385) this.field3358.method2290((byte) -111)) {
            if (var5.field5497.method2241(arg0, -22538)) {
                this.method1492(var5, arg1 + 39138);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(I)V", line = 295)
    public class220(int arg0) {
        this.field3367 = arg0;
        this.field3359 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3358 = new class375(var2);
    }
}
