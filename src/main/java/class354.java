import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class354 {

    @OriginalMember(owner = "client!le", name = "l", descriptor = "I")
    public int field5492 = 128;

    @OriginalMember(owner = "client!le", name = "n", descriptor = "I")
    public int field5494 = 128;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "I")
    public int field5485;

    @OriginalMember(owner = "client!le", name = "f", descriptor = "I")
    public int field5486;

    @OriginalMember(owner = "client!le", name = "i", descriptor = "I")
    public int field5489;

    @OriginalMember(owner = "client!le", name = "p", descriptor = "I")
    public int field5496;

    @OriginalMember(owner = "client!le", name = "k", descriptor = "Lui;")
    public static class375 field5491 = new class375(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");

    @OriginalMember(owner = "client!le", name = "o", descriptor = "I")
    public static int field5495 = -1;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "I")
    public int field5481;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "I")
    public static int field5482;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "I")
    public int field5483;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "I")
    public static int field5484;

    @OriginalMember(owner = "client!le", name = "g", descriptor = "I")
    public int field5487;

    @OriginalMember(owner = "client!le", name = "h", descriptor = "I")
    public int field5488;

    @OriginalMember(owner = "client!le", name = "j", descriptor = "I")
    public static int field5490;

    @OriginalMember(owner = "client!le", name = "m", descriptor = "I")
    public static int field5493;

    @OriginalMember(owner = "client!le", name = "q", descriptor = "I")
    public static int field5497;

    @OriginalMember(owner = "client!le", name = "r", descriptor = "I")
    public static int field5498;

    @OriginalMember(owner = "client!le", name = "s", descriptor = "Lns;")
    public static class438 field5499;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)Lle;", line = 10)
    public final class354 method2233(int arg0) {
        if (arg0 <= 121) {
            return null;
        } else {
            field5484++;
            return new class354(this.field5485, this.field5492, this.field5494, this.field5496, this.field5486, this.field5489);
        }
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(I)V", line = 23)
    public static final void method2234(int arg0) {
        field5493++;
        try {
            int var1 = 23 / ((arg0 - 20) / 33);
            if (class30.field464 == 1) {
                int var2 = class295.field4368.method1528(84);
                if (var2 > 0 && class295.field4368.method1531((byte) 68)) {
                    int var3 = var2 - class123.field1772;
                    if (var3 < 0) {
                        var3 = 0;
                    }
                    class295.field4368.method1515(var3, -193);
                } else {
                    class295.field4368.method1522((byte) -30);
                    class295.field4368.method1513((byte) 127);
                    class189.field2648 = null;
                    class231.field3285 = null;
                    if (class466.field6795 == null) {
                        class30.field464 = 0;
                    } else {
                        class30.field464 = 2;
                    }
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            class295.field4368.method1522((byte) -30);
            class231.field3285 = null;
            class189.field2648 = null;
            class30.field464 = 0;
            class466.field6795 = null;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(CI)Z", line = 66)
    public static final boolean method2235(char arg0, int arg1) {
        field5490++;
        if (arg0 >= ' ' && arg0 <= '~') {
            return true;
        }
        if (arg1 != 26881) {
            method2234(-37);
        }
        if (arg0 >= ' ' && arg0 <= 'ÿ') {
            return true;
        } else {
            return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V", line = 95)
    public static void method2236(byte arg0) {
        field5499 = null;
        field5491 = null;
        if (arg0 >= -102) {
            field5495 = -8;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(III)Ljo;", line = 107)
    public static final class255 method2237(int arg0, int arg1, int arg2) {
        class420 var3 = class380.field5802[arg0][arg1][arg2];
        return var3 == null ? null : var3.field6283;
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(I)V", line = 146)
    public class354(int arg0) {
        this.field5485 = arg0;
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(IIIIII)V", line = 153)
    private class354(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field5485 = arg0;
        this.field5494 = arg2;
        this.field5486 = arg4;
        this.field5489 = arg5;
        this.field5496 = arg3;
        this.field5492 = arg1;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Lle;B)V", line = 121)
    public final void method2238(class354 arg0, byte arg1) {
        this.field5492 = arg0.field5492;
        this.field5485 = arg0.field5485;
        field5482++;
        this.field5486 = arg0.field5486;
        if (arg1 == 63) {
            this.field5489 = arg0.field5489;
            this.field5496 = arg0.field5496;
            this.field5494 = arg0.field5494;
        }
    }
}
