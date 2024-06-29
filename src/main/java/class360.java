import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class360 extends class501 {

    @OriginalMember(owner = "client!cb", name = "r", descriptor = "I")
    private int field5246 = 0;

    @OriginalMember(owner = "client!cb", name = "v", descriptor = "Leo;")
    private class194 field5250 = new class194();

    @OriginalMember(owner = "client!cb", name = "y", descriptor = "Lqp;")
    public static class466 field5253 = new class466("K", "T", "K", "K");

    @OriginalMember(owner = "client!cb", name = "z", descriptor = "S")
    public static short field5254 = 256;

    @OriginalMember(owner = "client!cb", name = "B", descriptor = "I")
    public static int field5256 = -60;

    @OriginalMember(owner = "client!cb", name = "C", descriptor = "I")
    public static int field5257;

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "I")
    public static int field5240;

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "I")
    public static int field5241;

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "I")
    public static int field5242;

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
    public static int field5243;

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "I")
    public static int field5244;

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "I")
    public static int field5245;

    @OriginalMember(owner = "client!cb", name = "s", descriptor = "I")
    public static int field5247;

    @OriginalMember(owner = "client!cb", name = "t", descriptor = "I")
    public static int field5248;

    @OriginalMember(owner = "client!cb", name = "u", descriptor = "I")
    public static int field5249;

    @OriginalMember(owner = "client!cb", name = "w", descriptor = "I")
    public static int field5251;

    @OriginalMember(owner = "client!cb", name = "x", descriptor = "I")
    public static int field5252;

    @OriginalMember(owner = "client!cb", name = "A", descriptor = "Lfs;")
    public static class388 field5255;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)V")
    public final void method2153(int arg0, int arg1) {
        if (arg0 != 5000) {
            field5256 = 27;
        }
        ++field5245;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lhg;I)V")
    public final void method2154(class486 arg0, int arg1) {
        super.field7370[super.field7379] = 21;
        if (arg1 != -4093) {
            field5253 = null;
        }
        ++field5242;
        super.field7371[super.field7379] = arg0;
        ++super.field7379;
        if (super.field7379 >= 5000) {
            super.field7379 = 0;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(BFILta;Z)V")
    public final void method2155(byte arg0, float arg1, int arg2, class142 arg3, boolean arg4) {
        super.field7370[super.field7379] = (byte) (arg4 ? arg2 + 40 : arg2 + 30);
        ++field5251;
        if (arg0 < 33) {
            this.field5250 = null;
        }
        super.field7371[super.field7379] = arg3;
        super.field7372[super.field7379] = arg1;
        ++super.field7379;
        if (~super.field7379 <= -5001) {
            super.field7379 = 0;
        }
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(I)V")
    public final void method2156(int arg0) {
        if (arg0 != 5000) {
            this.method2163(11, (class486) null);
        }
        while (super.field7379 != super.field7378) {
            this.method2160(arg0 ^ -5054);
        }
        ++field5240;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)[Lrm;")
    public static final class282[] method2157(boolean arg0) {
        ++field5241;
        return !arg0 ? null : new class282[] { class457.field6708, class439.field6490, class425.field6243 };
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lhg;Z)V")
    public final void method2158(class486 arg0, boolean arg1) {
        if (!arg1) {
            field5254 = -105;
        }
        ++field5243;
        --super.field7378;
        if (super.field7378 < 0) {
            super.field7378 = 4999;
        }
        super.field7370[super.field7378] = 21;
        super.field7371[super.field7378] = arg0;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IZI)Z")
    public static final boolean method2159(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            return true;
        } else {
            ++field5248;
            return (class267.field3700[1][arg2][arg0] & 2) != 0;
        }
    }

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "(I)V")
    private final void method2160(int arg0) {
        ++field5247;
        int var2 = super.field7378++;
        if (~super.field7378 <= -5001) {
            super.field7378 = 0;
        }
        this.field5246 = super.field7370[var2];
        Object var3 = super.field7371[var2];
        super.field7371[var2] = null;
        if (arg0 < -31) {
            if (~this.field5246 == -22) {
                class315.method1837(this.field5250, (class486) var3);
            } else {
                if (~this.field5246 != -21) {
                    if (~this.field5246 <= -31 && ~this.field5246 >= -34) {
                        class449.field6615.method245(3000.0F, super.field7372[var2] * 1.5F);
                        ((class142) var3).method362(class368.field5398, class403.field5916, class110.field1656, class457.field6712, this.field5246 + -30 == 0);
                        return;
                    }
                    if (this.field5246 >= 40 && this.field5246 <= 43) {
                        class449.field6615.method245(3000.0F, super.field7372[var2] * 1.5F);
                        ((class142) var3).method362(class368.field5398, class403.field5916, class110.field1656, class414.field6042, this.field5246 + -40 == 0);
                        return;
                    }
                    if (~this.field5246 == -23) {
                        class449.field6615.method327(-1, 1583160, 40, 127);
                        return;
                    }
                    if (~this.field5246 == -24) {
                        class449.field6615.method222();
                        return;
                    }
                    if (this.field5246 == 24) {
                        class449.field6615.method255(0, (class153[]) null);
                        return;
                    }
                } else {
                    class486 var4 = (class486) var3;
                    if (var4.field7114 != null) {
                        var4.field7114.method493(-116, class449.field6615);
                    }
                    if (var4.field7118 != null) {
                        var4.field7118.method493(-126, class449.field6615);
                    }
                    if (var4.field7103 != null) {
                        var4.field7103.method493(-122, class449.field6615);
                    }
                    if (var4.field7105 != null) {
                        var4.field7105.method493(-122, class449.field6615);
                    }
                    if (var4.field7100 != null) {
                        var4.field7100.method493(-120, class449.field6615);
                    }
                    for (class164 var5 = var4.field7115; var5 != null; var5 = var5.field2467) {
                        var5.field2468.method493(-117, class449.field6615);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "(I)V")
    public static void method2161(int arg0) {
        if (arg0 == -3090) {
            field5253 = null;
            field5255 = null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V")
    public final void method2162(int arg0) {
        if (arg0 == 5000) {
            ++field5249;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILhg;)V")
    public final void method2163(int arg0, class486 arg1) {
        ++field5252;
        super.field7370[super.field7379] = 20;
        super.field7371[super.field7379] = arg1;
        ++super.field7379;
        if (~super.field7379 <= -5001) {
            super.field7379 = 0;
        }
        if (arg0 != -11487) {
            field5257 = -96;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(BI)V")
    public final void method2164(byte arg0, int arg1) {
        super.field7370[super.field7379] = (byte) arg1;
        ++field5244;
        ++super.field7379;
        if (super.field7379 >= 5000) {
            super.field7379 = 0;
        }
        if (arg0 != -3) {
            this.method2162(51);
        }
    }

    static {
        new class466("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, insérez le symbole / au début de chaque ligne.", "Para falar, comece cada linha de conversa com o símbolo /.");
        field5257 = -1;
    }
}
