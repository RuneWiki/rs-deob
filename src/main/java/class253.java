import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class253 {

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "Lff;")
    private class9 field3516 = new class9(64);

    @OriginalMember(owner = "client!bk", name = "j", descriptor = "Lff;")
    private class9 field3521 = new class9(100);

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "Lvh;")
    private class240 field3519;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "Lfg;")
    public static class83 field3512 = new class83("slide:", "gleiten:", "glissement:", "deslizamento:");

    @OriginalMember(owner = "client!bk", name = "l", descriptor = "Luf;")
    public static class310 field3523 = new class310(52, 1);

    @OriginalMember(owner = "client!bk", name = "m", descriptor = "Luf;")
    public static class310 field3524;

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "I")
    public static int field3515;

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "I")
    public static int field3517;

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "I")
    public static int field3518;

    @OriginalMember(owner = "client!bk", name = "i", descriptor = "I")
    public static int field3520;

    @OriginalMember(owner = "client!bk", name = "k", descriptor = "I")
    public static int field3522;

    @OriginalMember(owner = "client!bk", name = "n", descriptor = "Lpv;")
    public static class50 field3525;

    static {
        new class83("Unable to send abuse report - system busy.", "Meldung konnte nicht gesendet werden - Systeme überlastet", "Impossible de signaler un abus - Erreur système", "Sistema ocupado. Não foi possível enviar sua denúncia de abuso.");
        field3524 = new class310(85, -2);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(II)Lqp;", line = 5)
    public final class467 method1484(int arg0, int arg1) {
        if (arg0 != 0) {
            return null;
        }
        field3522++;
        class9 var3 = this.field3516;
        class467 var4;
        synchronized (this.field3516) {
            var4 = (class467) this.field3516.method56((long) arg1, 32);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field3519.method1411(true, class393.method2249(arg1, 101), class401.method2324((byte) 113, arg1));
        class467 var6 = new class467();
        var6.field6823 = this;
        var6.field6819 = arg1;
        if (var5 != null) {
            var6.method2743(92, new class365(var5));
        }
        var6.method2744(arg0 ^ 0x80);
        class9 var7 = this.field3516;
        synchronized (this.field3516) {
            this.field3516.method73((long) arg1, var6, 26425);
            return var6;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(BI)V", line = 35)
    public static final void method1485(byte arg0, int arg1) {
        if (arg0 != 62) {
            field3525 = null;
        }
        field3518++;
        class226.field3182 = arg1;
        class61.field810.method67(-102);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IZ)V", line = 52)
    public final void method1486(int arg0, boolean arg1) {
        field3520++;
        if (!arg1) {
            return;
        }
        class9 var3 = this.field3516;
        synchronized (this.field3516) {
            this.field3516.method61((byte) -67, arg0);
        }
        class9 var4 = this.field3521;
        synchronized (this.field3521) {
            this.field3521.method61((byte) -67, arg0);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Z)V", line = 68)
    public static void method1487(boolean arg0) {
        if (!arg0) {
            field3523 = null;
        }
        field3523 = null;
        field3524 = null;
        field3512 = null;
        field3525 = null;
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(II)Ld;", line = 81)
    public final class102 method1488(int arg0, int arg1) {
        field3515++;
        class9 var3 = this.field3521;
        class102 var4;
        synchronized (this.field3521) {
            var4 = (class102) this.field3521.method56((long) arg1, 88);
            if (arg0 != -24) {
                field3523 = null;
            }
            if (var4 == null) {
                var4 = new class102(arg1);
                this.field3521.method73((long) arg1, var4, 26425);
            }
        }
        synchronized (var4) {
            return var4.method674(true) ? var4 : null;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IBI)Z", line = 108)
    public static final boolean method1489(int arg0, byte arg1, int arg2) {
        field3513++;
        if (!class9.field86) {
            return false;
        }
        int var3 = arg2 >> 16;
        int var4 = arg2 & 0xFFFF;
        if (arg1 > -112) {
            return false;
        } else if (class522.field7701[var3] == null || class522.field7701[var3][var4] == null) {
            return false;
        } else {
            class295 var5 = class522.field7701[var3][var4];
            if (arg0 == -1 && var5.field3984 == 0) {
                for (class149 var6 = (class149) class260.field3585.method3072((byte) 119); var6 != null; var6 = (class149) class260.field3585.method3066(2)) {
                    if (var6.field2102 == 5 || var6.field2102 == 1010 || var6.field2102 == 57 || var6.field2102 == 20 || var6.field2102 == 23) {
                        for (class295 var7 = class339.method1882((byte) 119, var6.field2103); var7 != null; var7 = class282.method1617(false, var7)) {
                            if (var5.field4073 == var7.field4073) {
                                return true;
                            }
                        }
                    }
                }
            } else {
                for (class149 var8 = (class149) class260.field3585.method3072((byte) 119); var8 != null; var8 = (class149) class260.field3585.method3066(2)) {
                    if (var8.field2106 == arg0 && var5.field4073 == var8.field2103 && (var8.field2102 == 5 || var8.field2102 == 1010 || var8.field2102 == 57 || var8.field2102 == 20 || var8.field2102 == 23)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(Llf;ILvh;Lvh;Lvh;)V", line = 232)
    public class253(class157 arg0, int arg1, class240 arg2, class240 arg3, class240 arg4) {
        this.field3519 = arg2;
        if (this.field3519 != null) {
            int var6 = this.field3519.method1410(0) - 1;
            this.field3519.method1397((byte) -127, var6);
        }
        class140.method907(arg4, arg3, 10303);
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(Z)V", line = 186)
    public final void method1490(boolean arg0) {
        field3517++;
        class9 var2 = this.field3516;
        synchronized (this.field3516) {
            if (!arg0) {
                field3523 = null;
            }
            this.field3516.method67(93);
        }
        class9 var3 = this.field3521;
        synchronized (this.field3521) {
            this.field3521.method67(120);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)V", line = 203)
    public final void method1491(byte arg0) {
        class9 var2 = this.field3516;
        synchronized (this.field3516) {
            this.field3516.method65(false);
        }
        field3514++;
        if (arg0 == -65) {
            class9 var3 = this.field3521;
            synchronized (this.field3521) {
                this.field3521.method65(false);
            }
        }
    }
}
