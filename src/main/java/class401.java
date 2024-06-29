import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class401 {

    @OriginalMember(owner = "client!te", name = "a", descriptor = "Lmc;")
    public static class78 field5509 = new class78(28, 3);

    @OriginalMember(owner = "client!te", name = "i", descriptor = "I")
    public static int field5517 = 0;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "I")
    public int field5510;

    @OriginalMember(owner = "client!te", name = "c", descriptor = "I")
    private int field5511;

    @OriginalMember(owner = "client!te", name = "e", descriptor = "I")
    public static int field5513;

    @OriginalMember(owner = "client!te", name = "f", descriptor = "I")
    public int field5514;

    @OriginalMember(owner = "client!te", name = "g", descriptor = "I")
    public static int field5515;

    @OriginalMember(owner = "client!te", name = "h", descriptor = "I")
    public static int field5516;

    @OriginalMember(owner = "client!te", name = "j", descriptor = "I")
    public static int field5518;

    @OriginalMember(owner = "client!te", name = "k", descriptor = "I")
    public static int field5519;

    @OriginalMember(owner = "client!te", name = "d", descriptor = "Lmi;")
    public class314 field5512;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(B)Ldk;")
    public final synchronized class325 method2428(byte arg0) {
        field5513++;
        class325 var2 = (class325) this.field5512.field4173.method493((byte) 19, (long) this.field5511);
        if (var2 != null) {
            return var2;
        }
        class325 var3 = class325.method1817(this.field5512.field4168, this.field5511, 0);
        if (var3 != null) {
            this.field5512.field4173.method505((long) this.field5511, var3, 110);
        }
        if (arg0 != 75) {
            method2429((class471) null);
        }
        return var3;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lhb;)V")
    public static final void method2429(class471 arg0) {
        for (int var1 = arg0.field6500; var1 <= arg0.field6505; var1++) {
            for (int var2 = arg0.field6491; var2 <= arg0.field6497; var2++) {
                class491 var3 = class289.field3897[arg0.field6502][var1][var2];
                if (var3 != null) {
                    class309 var4 = var3.field6845;
                    class309 var5 = null;
                    while (var4 != null) {
                        if (var4.field4091 == arg0) {
                            if (var5 == null) {
                                var3.field6845 = var4.field4084;
                            } else {
                                var5.field4084 = var4.field4084;
                            }
                            var4.method1702(500);
                            break;
                        }
                        var5 = var4;
                        var4 = var4.field4084;
                    }
                    var3.field6843 = 0;
                    for (class309 var6 = var3.field6845; var6 != null; var6 = var6.field4084) {
                        var3.field6843 = (byte) (var3.field6843 | var6.field4082);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Z)Z")
    public static final boolean method2430(boolean arg0) {
        if (!arg0) {
            return false;
        }
        field5516++;
        if (class284.field3842) {
            try {
                if ((Boolean) class361.method2207(class251.field3359.field3209, "showingVideoAd", (byte) -112)) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lbt;I)V")
    public final void method2431(class32 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method201((byte) -125);
            if (var3 == 0) {
                field5518++;
                if (arg1 > -85) {
                    this.field5514 = -7;
                    return;
                }
                return;
            }
            this.method2433(-44, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V")
    public static void method2432(int arg0) {
        if (arg0 != 0) {
            method2430(true);
        }
        field5509 = null;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ILbt;I)V")
    private final void method2433(int arg0, class32 arg1, int arg2) {
        int var4 = -43 / ((arg0 - 73) / 44);
        field5519++;
        if (arg2 == 1) {
            this.field5511 = arg1.method215((byte) 109);
        } else if (arg2 == 2) {
            this.field5514 = arg1.method201((byte) -113);
            this.field5510 = arg1.method201((byte) -107);
        }
    }
}
