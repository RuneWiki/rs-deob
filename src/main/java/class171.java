import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class171 extends class64 {

    @OriginalMember(owner = "client!cd", name = "u", descriptor = "I")
    private int field2417;

    @OriginalMember(owner = "client!cd", name = "w", descriptor = "I")
    private int field2419;

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "I")
    private int field2408;

    @OriginalMember(owner = "client!cd", name = "p", descriptor = "I")
    private int field2412;

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "I")
    public static int field2409;

    @OriginalMember(owner = "client!cd", name = "n", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!cd", name = "o", descriptor = "I")
    public static int field2411;

    @OriginalMember(owner = "client!cd", name = "q", descriptor = "I")
    public static int field2413;

    @OriginalMember(owner = "client!cd", name = "r", descriptor = "I")
    public static int field2414;

    @OriginalMember(owner = "client!cd", name = "s", descriptor = "I")
    public static int field2415;

    @OriginalMember(owner = "client!cd", name = "t", descriptor = "I")
    public static int field2416;

    @OriginalMember(owner = "client!cd", name = "x", descriptor = "I")
    public static int field2420;

    @OriginalMember(owner = "client!cd", name = "y", descriptor = "I")
    public static int field2421;

    @OriginalMember(owner = "client!cd", name = "v", descriptor = "[Lvj;")
    public static class256[] field2418;

    static {
        new class349("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.");
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)V", line = 12)
    public static void method1219(int arg0) {
        field2418 = null;
        if (arg0 != -1) {
            method1221((class316) null, -107);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZI)I", line = 22)
    public static final int method1220(boolean arg0, int arg1) {
        ++field2420;
        if (~arg1 > -97) {
            return 0;
        } else if (arg0) {
            return -55;
        } else {
            return ~arg1 > -129 ? 2 : 3;
        }
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(III)V", line = 50)
    public final void method169(int arg0, int arg1, int arg2) {
        ++field2421;
        int var4 = this.field2412 * arg0 >> 12;
        if (arg2 > -102) {
            field2418 = null;
        }
        int var5 = this.field2419 * arg0 >> 12;
        int var6 = this.field2417 * arg1 >> 12;
        int var7 = this.field2408 * arg1 >> 12;
        class114.method688(-114, var5, var7, var6, var4, super.field876);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lbf;I)V", line = 69)
    public static final void method1221(class316 arg0, int arg1) {
        arg0.field4636 = null;
        ++field2413;
        int var2 = arg0.field4631.length;
        if (arg1 <= 88) {
            method1224(-29, -14, -118, 12, -18);
        }
        for (int var3 = 0; var3 < var2; ++var3) {
            arg0.field4631[var3].field2158 = false;
        }
        class145[] var4 = class53.field689;
        synchronized (class53.field689) {
            if (var2 < class53.field689.length && class178.field2527[var2] < 200) {
                class53.field689[var2].method1076(124, arg0);
                int var10002 = class178.field2527[var2]++;
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(II)Lnf;", line = 98)
    public static final class346 method1222(int arg0, int arg1) {
        ++field2409;
        class15 var2 = class294.field4263;
        class346 var3;
        synchronized (class294.field4263) {
            var3 = (class346) class294.field4263.method99(true, (long) arg0);
        }
        if (var3 != null) {
            return var3;
        } else {
            byte[] var4 = class204.field2878.method643(class3.method10((byte) 104, arg0), class397.method2495(1799, arg0), true);
            class346 var5 = new class346();
            var5.field5027 = arg0;
            if (arg1 < 126) {
                return null;
            } else {
                if (var4 != null) {
                    var5.method2270(new class130(var4), (byte) -57);
                }
                var5.method2265(0);
                class15 var6 = class294.field4263;
                synchronized (class294.field4263) {
                    class294.field4263.method90(var5, (long) arg0, 0);
                    return var5;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(III)V", line = 129)
    public final void method173(int arg0, int arg1, int arg2) {
        ++field2416;
        int var4 = this.field2412 * arg2 >> 12;
        int var5 = this.field2419 * arg2 >> 12;
        int var6 = this.field2417 * arg1 >> 12;
        int var7 = this.field2408 * arg1 >> 12;
        if (arg0 != 200) {
            this.field2408 = -108;
        }
        class314.method2101(super.field883, var4, var7, (byte) 63, super.field878, super.field876, var5, var6);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IB)C", line = 154)
    public static final char method1223(int arg0, byte arg1) {
        ++field2414;
        if (arg0 != 3043) {
            method1224(99, -32, -58, 4, 15);
        }
        int var2 = 255 & arg1;
        if (~var2 == -1) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        } else {
            if (~var2 <= -129 && var2 < 160) {
                char var3 = class408.field5785[var2 + -128];
                if (~var3 == -1) {
                    var3 = '?';
                }
                var2 = var3;
            }
            return (char) var2;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIII)V", line = 182)
    public static final void method1224(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2411;
        class407.field5761.field1880 = 0;
        class407.field5761.method831(20, (byte) -53);
        class407.field5761.method831(arg4, (byte) 110);
        class407.field5761.method831(arg3, (byte) -110);
        class407.field5761.method799(arg1, arg0 + 13834);
        class407.field5761.method799(arg2, arg0 ^ 13769);
        if (arg0 == -13750) {
            class103.field1332 = 0;
            class415.field5926 = 1;
            class429.field6100 = 0;
            class44.field599 = -3;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(III)V", line = 202)
    public final void method168(int arg0, int arg1, int arg2) {
        ++field2410;
        int var4 = 41 / ((arg0 - -30) / 46);
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(IIIIIII)V", line = 211)
    public class171(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field2417 = arg1;
        this.field2419 = arg2;
        this.field2408 = arg3;
        this.field2412 = arg0;
    }
}
