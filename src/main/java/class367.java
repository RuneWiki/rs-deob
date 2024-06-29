import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class367 {

    @OriginalMember(owner = "client!gr", name = "e", descriptor = "Lsw;")
    private class641 field4822 = new class641(64);

    @OriginalMember(owner = "client!gr", name = "h", descriptor = "Ldn;")
    private class438 field4825;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "I")
    public static int field4818;

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "I")
    public static int field4819;

    @OriginalMember(owner = "client!gr", name = "d", descriptor = "I")
    public static int field4821;

    @OriginalMember(owner = "client!gr", name = "f", descriptor = "I")
    public static int field4823;

    @OriginalMember(owner = "client!gr", name = "g", descriptor = "I")
    public static int field4824;

    @OriginalMember(owner = "client!gr", name = "i", descriptor = "I")
    public static int field4826;

    @OriginalMember(owner = "client!gr", name = "j", descriptor = "I")
    public static int field4827;

    @OriginalMember(owner = "client!gr", name = "k", descriptor = "I")
    public static int field4828;

    @OriginalMember(owner = "client!gr", name = "l", descriptor = "I")
    public static int field4829;

    @OriginalMember(owner = "client!gr", name = "m", descriptor = "I")
    public static int field4830;

    @OriginalMember(owner = "client!gr", name = "c", descriptor = "Lmm;")
    public static class232 field4820;

    @OriginalMember(owner = "client!gr", name = "n", descriptor = "Ljava/awt/Font;")
    public static Font field4831;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public static final boolean method2050(String arg0, byte arg1) {
        field4823++;
        if (arg0 == null) {
            return false;
        }
        int var2 = -88 / ((-arg1 - 87) / 33);
        for (int var3 = 0; var3 < class389.field5147; var3++) {
            if (arg0.equalsIgnoreCase(class436.field5911[var3])) {
                return true;
            }
        }
        return arg0.equalsIgnoreCase(class103.field1265.field8023);
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(II)V")
    public final void method2051(int arg0, int arg1) {
        class641 var3 = this.field4822;
        synchronized (this.field4822) {
            this.field4822.method3686((byte) 53, arg1);
        }
        if (arg0 <= 70) {
            method2058(82, -80, -82, null, null);
        }
        field4829++;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(BI)Lum;")
    public final class445 method2052(byte arg0, int arg1) {
        field4826++;
        if (arg0 >= -60) {
            return null;
        }
        class641 var3 = this.field4822;
        class445 var4;
        synchronized (this.field4822) {
            var4 = (class445) this.field4822.method3682(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class438 var5 = this.field4825;
        byte[] var6;
        synchronized (this.field4825) {
            var6 = this.field4825.method2558(100, class71.method390(-70, arg1), class373.method2079((byte) -109, arg1));
        }
        class445 var7 = new class445();
        if (var6 != null) {
            var7.method2603(new class374(var6), 26744);
        }
        class641 var8 = this.field4822;
        synchronized (this.field4822) {
            this.field4822.method3684(var7, 0, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIIZZ)V")
    public static final void method2053(int arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        field4821++;
        if (!arg4 && class343.field4424 == arg0 && class522.field7330 == arg1 && class442.field6099 == class13.field104 || class565.field8299.method3590(class529.field7429, -2)) {
            return;
        }
        class13.field104 = class442.field6099;
        class522.field7330 = arg1;
        class343.field4424 = arg0;
        if (class565.field8299.method3590(class529.field7429, -2)) {
            class13.field104 = 0;
        }
        class35.method200(arg2, 2);
        class164.method893(class326.field4163.method987(class31.field247, 22), true, class137.field1673, 19206);
        int var5 = class632.field9113;
        class632.field9113 = (class343.field4424 - (class106.field1289 >> 4)) * 8;
        int var6 = class119.field1504;
        class119.field1504 = (class522.field7330 - (class422.field5452 >> 4)) * 8;
        class194.field2355 = class353.method1965(class343.field4424 * 8, class522.field7330 * 8);
        if (!arg3) {
            field4820 = null;
        }
        class315.field4019 = null;
        int var7 = class632.field9113 - var5;
        int var8 = class119.field1504 - var6;
        if (arg2 == 10) {
            for (int var17 = 0; var17 < class98.field1215; var17++) {
                class415 var30 = class393.field5189[var17];
                if (var30 != null) {
                    class459 var31 = var30.field5390;
                    for (int var32 = 0; var32 < 10; var32++) {
                        var31.field6483[var32] -= var7;
                        var31.field6491[var32] -= var8;
                    }
                    var31.field8652 -= var8 * 128;
                    var31.field8661 -= var7 * 128;
                }
            }
        } else {
            class474.field6637 = 0;
            boolean var9 = false;
            int var10 = class106.field1289 * 128 - 128;
            int var11 = (class422.field5452 - 1) * 128;
            for (int var12 = 0; var12 < class98.field1215; var12++) {
                class415 var13 = class393.field5189[var12];
                if (var13 != null) {
                    class459 var14 = var13.field5390;
                    var14.field8661 -= var7 * 128;
                    var14.field8652 -= var8 * 128;
                    if (var14.field8661 >= 0 && var14.field8661 <= var10 && var14.field8652 >= 0 && var14.field8652 <= var11) {
                        boolean var15 = true;
                        for (int var16 = 0; var16 < 10; var16++) {
                            var14.field6483[var16] -= var7;
                            var14.field6491[var16] -= var8;
                            if (var14.field6483[var16] < 0 || var14.field6483[var16] >= class106.field1289 || var14.field6491[var16] < 0 || var14.field6491[var16] >= class422.field5452) {
                                var15 = false;
                            }
                        }
                        if (var15) {
                            class194.field2345[class474.field6637++] = var14.field6399;
                        } else {
                            var14.method2674(null, 0);
                            var13.method3187(true);
                            var9 = true;
                        }
                    } else {
                        var14.method2674(null, 0);
                        var9 = true;
                        var13.method3187(true);
                    }
                }
            }
            if (var9) {
                class98.field1215 = class309.field3938.method2639(118);
                class309.field3938.method2644(class393.field5189, 4923);
            }
        }
        for (int var18 = 0; var18 < 2048; var18++) {
            class545 var28 = class459.field6329[var18];
            if (var28 != null) {
                for (int var29 = 0; var29 < 10; var29++) {
                    var28.field6483[var29] -= var7;
                    var28.field6491[var29] -= var8;
                }
                var28.field8652 -= var8 * 128;
                var28.field8661 -= var7 * 128;
            }
        }
        class458[] var19 = class225.field2765;
        for (int var20 = 0; var20 < var19.length; var20++) {
            class458 var27 = var19[var20];
            if (var27 != null) {
                var27.field6300 -= var8 * 128;
                var27.field6297 -= var7 * 128;
            }
        }
        for (class541 var21 = (class541) class54.field461.method1050((byte) 73); var21 != null; var21 = (class541) class54.field461.method1047(-7962)) {
            var21.field7901 -= var8;
            var21.field7913 -= var7;
            if (class593.field8620 != 4 && (var21.field7913 < 0 || var21.field7901 < 0 || var21.field7913 >= class106.field1289 || var21.field7901 >= class422.field5452)) {
                var21.method3187(arg3);
            }
        }
        if (class593.field8620 != 4) {
            for (class36 var22 = (class36) class150.field1787.method2638(!arg3); var22 != null; var22 = (class36) class150.field1787.method2641(12089)) {
                int var23 = (int) (var22.field7967 & 0x3FFFL);
                int var24 = var23 - class632.field9113;
                int var25 = (int) (var22.field7967 >> 14 & 0x3FFFL);
                int var26 = var25 - class119.field1504;
                if (var24 < 0 || var26 < 0 || class106.field1289 <= var24 || var26 >= class422.field5452) {
                    var22.method3187(arg3);
                }
            }
        }
        if (class469.field6549 != 0) {
            class136.field1666 -= var8;
            class469.field6549 -= var7;
        }
        class467.method2724(0);
        if (arg2 != 10) {
            class286.field3729 -= var7 * 128;
            class58.field543 -= var7;
            class641.field9238 -= var8;
            class42.field335 -= var7;
            class306.field3891 -= var8;
            class39.field303 -= var8 * 128;
            if (Math.abs(var7) > class106.field1289 || Math.abs(var8) > class422.field5452) {
                class316.method1751(87);
            }
        } else if (class617.field8931 == 4) {
            class449.field6219 -= var8 * 128;
            class381.field5051 -= var8 * 128;
            class485.field6788 -= var7 * 128;
            class429.field5826 -= var7 * 128;
        } else {
            class617.field8931 = 1;
        }
        class66.method370((byte) -127);
        class463.method2698((byte) -24);
        class389.field5136.method1048(-7730);
        class209.field2545.method1048(-7730);
        class82.field991.method1985(0);
        class391.method2250(2028208128);
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)V")
    public final void method2054(int arg0) {
        field4819++;
        if (arg0 == 128) {
            class641 var2 = this.field4822;
            synchronized (this.field4822) {
                this.field4822.method3694(0);
            }
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(B)V")
    public final void method2055(byte arg0) {
        field4818++;
        class641 var2 = this.field4822;
        synchronized (this.field4822) {
            this.field4822.method3687(1402);
        }
        int var3 = -28 % ((40 - arg0) / 60);
    }

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "(II)V")
    public final void method2056(int arg0, int arg1) {
        class641 var3 = this.field4822;
        synchronized (this.field4822) {
            this.field4822.method3687(arg0 + 1274);
            this.field4822 = new class641(arg1);
        }
        if (arg0 != 128) {
            field4820 = null;
        }
        field4827++;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(FIIILtp;IFBFFF)[B")
    public static final byte[] method2057(float arg0, int arg1, int arg2, int arg3, class454 arg4, int arg5, float arg6, byte arg7, float arg8, float arg9, float arg10) {
        field4830++;
        byte[] var11 = new byte[arg1 * arg3 * arg2];
        class6.method38(arg3, arg8, -21117, 0, arg0, arg2, arg1, arg6, arg10, arg4, arg5, var11, arg9);
        if (arg7 != 81) {
            field4820 = null;
        }
        return var11;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIILbq;Lbq;)V")
    public static final void method2058(int arg0, int arg1, int arg2, class241 arg3, class241 arg4) {
        class349 var5 = class78.method450(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field4496 = arg3;
            var5.field4497 = arg4;
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(ZB)Z")
    public static final boolean method2059(boolean arg0, byte arg1) {
        field4828++;
        boolean var2 = class210.field2560.method1143();
        if (arg1 != 15) {
            return false;
        } else if (arg0 == var2) {
            return true;
        } else {
            if (!arg0) {
                class210.field2560.method1109();
            } else if (!class210.field2560.method1169()) {
                arg0 = false;
            }
            if (var2 == arg0) {
                return false;
            } else {
                class565.field8299.field2169 = arg0;
                class565.field8299.method3585(true, class74.field873);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "(I)V")
    public static void method2060(int arg0) {
        if (arg0 > -109) {
            method2057(-1.4145151F, -113, 123, 100, null, 8, 1.6415727F, (byte) 94, 1.1010914F, 1.8254921F, -0.30834097F);
        }
        field4820 = null;
        field4831 = null;
    }

    @OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(Lre;ILdn;)V")
    public class367(class515 arg0, int arg1, class438 arg2) {
        this.field4825 = arg2;
        if (this.field4825 != null) {
            int var4 = this.field4825.method2565((byte) 99) - 1;
            this.field4825.method2554(var4, 127);
        }
    }

    static {
        new class180("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
        new class180("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.");
    }
}
