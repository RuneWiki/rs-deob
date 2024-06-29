import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class145 {

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "[I")
    private int[] field3587;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "I")
    public static volatile int field3581 = 0;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "Lkd;")
    public static class73 field3578 = class126.method1070((byte) -66, " )2>");

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "Lkd;")
    public static class73 field3585 = class126.method1070((byte) -66, "Lade Ignorieren)2Liste)3)3)3");

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "[I")
    public static int[] field3577 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!vc", name = "r", descriptor = "Lkd;")
    public static class73 field3594 = class126.method1070((byte) -66, "<col=c0ff00>");

    @OriginalMember(owner = "client!vc", name = "m", descriptor = "Lkd;")
    private static class73 field3589 = class126.method1070((byte) -66, "K");

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "Lkd;")
    public static class73 field3579 = field3589;

    @OriginalMember(owner = "client!vc", name = "q", descriptor = "Lkd;")
    public static class73 field3593 = class126.method1070((byte) -66, "Benutzername: ");

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "Lkd;")
    public static class73 field3580 = field3589;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "Ljb;")
    public static class64 field3582 = new class64(64);

    @OriginalMember(owner = "client!vc", name = "u", descriptor = "Lkd;")
    public static class73 field3597 = class126.method1070((byte) -66, "Unerwartete Antwort vom Anmelde)2Server)3");

    @OriginalMember(owner = "client!vc", name = "s", descriptor = "Lkd;")
    public static class73 field3595 = class126.method1070((byte) -66, "");

    @OriginalMember(owner = "client!vc", name = "t", descriptor = "Lkd;")
    public static class73 field3596 = class126.method1070((byte) -66, "auf einer freien Welt zu spielen)3");

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
    public static int field3583;

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!vc", name = "n", descriptor = "I")
    public static int field3590;

    @OriginalMember(owner = "client!vc", name = "o", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!vc", name = "p", descriptor = "I")
    public static int field3592;

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "La;")
    public static class1 field3588;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
    public static final void method1161(int arg0) {
        int var1 = -1;
        if (arg0 != 14522) {
            return;
        }
        while (var1 < class63.field1661) {
            int var5;
            if (var1 == -1) {
                var5 = 2047;
            } else {
                var5 = class14.field435[var1];
            }
            class118 var6 = class42.field1141[var5];
            if (var6 != null && var6.field2250 > 0) {
                var6.field2250--;
                if (var6.field2250 == 0) {
                    var6.field2285 = null;
                }
            }
            var1++;
        }
        for (int var2 = 0; var2 < client.field618; var2++) {
            int var3 = class55.field1455[var2];
            class9 var4 = class133.field3345[var3];
            if (var4 != null && var4.field2250 > 0) {
                var4.field2250--;
                if (var4.field2250 == 0) {
                    var4.field2285 = null;
                }
            }
        }
        field3584++;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(III)I")
    public static final int method1162(int arg0, int arg1, int arg2) {
        if (arg0 > arg1) {
            int var3 = arg1;
            arg1 = arg0;
            arg0 = var3;
        }
        while (arg0 != 0) {
            int var4 = arg1 % arg0;
            arg1 = arg0;
            arg0 = var4;
        }
        if (arg2 != -2) {
            field3585 = null;
        }
        field3583++;
        return arg1;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IB)I")
    public final int method1163(int arg0, byte arg1) {
        field3591++;
        int var3 = this.field3587.length - 2;
        if (arg1 != -72) {
            method1161(34);
        }
        int var4 = arg0 << 1 & var3;
        while (true) {
            int var5 = this.field3587[var4];
            if (arg0 == var5) {
                return this.field3587[var4 + 1];
            }
            if (var5 == -1) {
                return -1;
            }
            var4 = var3 & var4 + 2;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)V")
    public static void method1164(byte arg0) {
        field3595 = null;
        field3580 = null;
        field3579 = null;
        field3597 = null;
        field3596 = null;
        field3582 = null;
        field3585 = null;
        field3588 = null;
        field3578 = null;
        field3577 = null;
        if (arg0 > -19) {
            field3593 = null;
        }
        field3593 = null;
        field3594 = null;
        field3589 = null;
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "([I)V")
    public class145(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field3587 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field3587[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field3587[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field3587[var5 + var5] = arg0[var4];
            this.field3587[var5 + var5 + 1] = var4++;
        }
    }
}
