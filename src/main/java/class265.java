import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class265 implements class485 {

    @OriginalMember(owner = "client!je", name = "h", descriptor = "Lke;")
    private class407 field4013 = new class407(128);

    @OriginalMember(owner = "client!je", name = "j", descriptor = "[I")
    public int[] field4015 = new int[class368.field5407.field2584];

    @OriginalMember(owner = "client!je", name = "g", descriptor = "[I")
    private int[] field4012 = new int[class368.field5407.field2584];

    @OriginalMember(owner = "client!je", name = "e", descriptor = "Lsk;")
    public static class423 field4010 = new class423("wave:", "welle:", "ondulation:", "onda:");

    @OriginalMember(owner = "client!je", name = "n", descriptor = "Lke;")
    public static class407 field4019 = new class407(8);

    @OriginalMember(owner = "client!je", name = "a", descriptor = "I")
    public static int field4006;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "I")
    public static int field4007;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "I")
    public static int field4008;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "I")
    public static int field4009;

    @OriginalMember(owner = "client!je", name = "f", descriptor = "I")
    public static int field4011;

    @OriginalMember(owner = "client!je", name = "i", descriptor = "I")
    public static int field4014;

    @OriginalMember(owner = "client!je", name = "k", descriptor = "I")
    public static int field4016;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "I")
    public static int field4017;

    @OriginalMember(owner = "client!je", name = "m", descriptor = "I")
    public static int field4018;

    @OriginalMember(owner = "client!je", name = "o", descriptor = "I")
    public static int field4020;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(III)V")
    public final void method1616(int arg0, int arg1, int arg2) {
        int var4 = -28 % ((-arg2 - 69) / 48);
        this.field4012[arg1] = arg0;
        field4011++;
        class50 var5 = (class50) this.field4013.method2409(false, (long) arg1);
        if (var5 == null) {
            class50 var6 = new class50(4611686018427387905L);
            this.field4013.method2413((long) arg1, -1, var6);
        } else if (var5.field763 != 4611686018427387905L) {
            var5.field763 = class344.method2111((byte) -14) + 500L | 0x4000000000000000L;
            return;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IZI)V")
    public final void method1617(int arg0, boolean arg1, int arg2) {
        this.field4015[arg2] = arg0;
        if (!arg1) {
            field4014 = -108;
        }
        field4020++;
        class50 var4 = (class50) this.field4013.method2409(false, (long) arg2);
        if (var4 == null) {
            class50 var5 = new class50(class344.method2111((byte) -56) + 500L);
            this.field4013.method2413((long) arg2, -1, var5);
        } else {
            var4.field763 = class344.method2111((byte) -55) + 500L;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II)I")
    public final int method1618(int arg0, int arg1) {
        field4009++;
        class380 var3 = class117.field1962.method1382(arg1, (byte) -128);
        int var4 = 52 / ((18 - arg0) / 45);
        int var5 = var3.field5549;
        int var6 = var3.field5547;
        int var7 = var3.field5544;
        int var8 = class274.field4151[var7 - var6];
        return var8 & this.field4015[var5] >> var6;
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(III)V")
    public final void method1619(int arg0, int arg1, int arg2) {
        field4007++;
        class380 var4 = class117.field1962.method1382(arg0, (byte) -106);
        int var5 = var4.field5549;
        int var6 = var4.field5547;
        if (arg1 <= 80) {
            field4019 = null;
        }
        int var7 = var4.field5544;
        int var8 = class274.field4151[var7 - var6];
        if (arg2 < 0 || var8 < arg2) {
            arg2 = 0;
        }
        int var9 = var8 << var6;
        this.method1617(var9 & arg2 << var6 | this.field4015[var5] & ~var9, true, var5);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V")
    public static void method1620(byte arg0) {
        field4019 = null;
        field4010 = null;
        if (arg0 > -76) {
            method1620((byte) -51);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ZB)I")
    public final int method1621(boolean arg0, byte arg1) {
        field4017++;
        long var3 = class344.method2111((byte) -58);
        if (arg1 != 107) {
            this.field4013 = null;
        }
        for (class50 var5 = arg0 ? (class50) this.field4013.method2415((byte) -121) : (class50) this.field4013.method2416((byte) -126); var5 != null; var5 = (class50) this.field4013.method2416((byte) -122)) {
            if ((var5.field763 & 0x3FFFFFFFFFFFFFFFL) < var3) {
                if ((var5.field763 & 0x4000000000000000L) != 0L) {
                    int var6 = (int) var5.field2798;
                    this.field4015[var6] = this.field4012[var6];
                    var5.method1121(false);
                    return var6;
                }
                var5.method1121(false);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
    public static final Class method1622(int arg0, String arg1) throws ClassNotFoundException {
        field4008++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg1.equals("F")) {
            return Float.TYPE;
        } else {
            if (arg0 != 0) {
                field4010 = null;
            }
            if (arg1.equals("D")) {
                return Double.TYPE;
            } else if (arg1.equals("C")) {
                return Character.TYPE;
            } else {
                return Class.forName(arg1);
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(BI)I")
    public final int method1623(byte arg0, int arg1) {
        if (arg0 > -113) {
            this.method1623((byte) 44, -18);
        }
        field4016++;
        return this.field4015[arg1];
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(BII)V")
    public final void method1624(byte arg0, int arg1, int arg2) {
        field4006++;
        class380 var4 = class117.field1962.method1382(arg1, (byte) -117);
        int var5 = var4.field5549;
        int var6 = var4.field5547;
        if (arg0 > -119) {
            return;
        }
        int var7 = var4.field5544;
        int var8 = class274.field4151[var7 - var6];
        if (arg2 < 0 || arg2 > var8) {
            arg2 = 0;
        }
        int var9 = var8 << var6;
        this.method1616(this.field4012[var5] & ~var9 | var9 & arg2 << var6, var5, -128);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
    public final void method1625(int arg0) {
        field4018++;
        if (arg0 <= 28) {
            this.field4015 = null;
        }
        for (int var2 = 0; var2 < class368.field5407.field2584; var2++) {
            class365 var3 = class368.field5407.method1052(var2, 30350);
            if (var3 != null && var3.field5368 == 0) {
                this.field4012[var2] = 0;
                this.field4015[var2] = 0;
            }
        }
        this.field4013 = new class407(128);
    }

    static {
        new class423("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
    }
}
