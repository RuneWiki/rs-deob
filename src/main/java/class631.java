import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class631 extends class663 implements class615 {

    @OriginalMember(owner = "client!iq", name = "d", descriptor = "I")
    private int field8532;

    @OriginalMember(owner = "client!iq", name = "g", descriptor = "[[Ljava/lang/String;")
    public static String[][] field8535 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" }, { "jan", "fév", "mars", "avr", "mai", "juin", "juil", "août", "sept", "oct", "nov", "déc" }, { "jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez" }, { "jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec" } };

    @OriginalMember(owner = "client!iq", name = "l", descriptor = "Lmw;")
    public static class517 field8540 = new class517(8, -1);

    @OriginalMember(owner = "client!iq", name = "n", descriptor = "[I")
    public static int[] field8542 = new int[1];

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "I")
    public static int field8531;

    @OriginalMember(owner = "client!iq", name = "f", descriptor = "I")
    public static int field8534;

    @OriginalMember(owner = "client!iq", name = "h", descriptor = "I")
    public static int field8536;

    @OriginalMember(owner = "client!iq", name = "i", descriptor = "I")
    public static int field8537;

    @OriginalMember(owner = "client!iq", name = "j", descriptor = "I")
    public static int field8538;

    @OriginalMember(owner = "client!iq", name = "k", descriptor = "I")
    public static int field8539;

    @OriginalMember(owner = "client!iq", name = "m", descriptor = "I")
    public static int field8541;

    @OriginalMember(owner = "client!iq", name = "e", descriptor = "[I")
    public static int[] field8533;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(I)I")
    public final int method3415(int arg0) {
        if (arg0 < 85) {
            this.method3417((byte[]) null, -122, false, -56);
        }
        ++field8531;
        return 0;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Ltd;B)Ljava/lang/String;")
    public static final String method3482(class478 arg0, byte arg1) {
        if (arg1 != 100) {
            method3485(-78, (byte) 79);
        }
        ++field8537;
        if (arg0.field6704 != null && ~arg0.field6704.length() != -1) {
            return arg0.field6720 != null && ~arg0.field6720.length() < -1 ? arg0.field6710 + class58.field729.method365(class55.field647, (byte) 116) + arg0.field6720 + class58.field729.method365(class55.field647, (byte) 92) + arg0.field6704 : arg0.field6710 + class58.field729.method365(class55.field647, (byte) 77) + arg0.field6704;
        } else {
            return arg0.field6720 != null && ~arg0.field6720.length() < -1 ? arg0.field6710 + class58.field729.method365(class55.field647, (byte) 94) + arg0.field6720 : arg0.field6710;
        }
    }

    @OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Llf;I[BI)V")
    public class631(class250 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field8532 = arg1;
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(Z)J")
    public final long method3416(boolean arg0) {
        ++field8534;
        return arg0 ? -15L : super.field8911.getAddress();
    }

    @OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Llf;ILjaclib/memory/Buffer;)V")
    public class631(class250 arg0, int arg1, Buffer arg2) {
        super(arg0, arg2);
        this.field8532 = arg1;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(II)V")
    public static final void method3483(int arg0, int arg1) {
        class194 var2 = class443.field6387[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; ++var3) {
            class194 var4 = class443.field6387[var3][arg0][arg1] = class443.field6387[var3 + 1][arg0][arg1];
            if (var4 != null) {
                for (class511 var5 = var4.field2525; var5 != null; var5 = var5.field7127) {
                    class539 var6 = var5.field7126;
                    if (var6.field7466 == arg0 && var6.field7467 == arg1) {
                        --var6.field2813;
                    }
                }
                if (var4.field2519 != null) {
                    --var4.field2519.field2813;
                }
                if (var4.field2527 != null) {
                    --var4.field2527.field2813;
                }
                if (var4.field2523 != null) {
                    --var4.field2523.field2813;
                }
                if (var4.field2529 != null) {
                    --var4.field2529.field2813;
                }
                if (var4.field2531 != null) {
                    --var4.field2531.field2813;
                }
            }
        }
        if (class443.field6387[0][arg0][arg1] == null) {
            class443.field6387[0][arg0][arg1] = new class194(0);
            class443.field6387[0][arg0][arg1].field2521 = 1;
        }
        class443.field6387[0][arg0][arg1].field2526 = var2;
        class443.field6387[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Z)I")
    public final int method3414(boolean arg0) {
        if (arg0) {
            return 41;
        } else {
            ++field8536;
            return this.field8532;
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "([BIZI)V")
    public final void method3417(byte[] arg0, int arg1, boolean arg2, int arg3) {
        this.method3664(arg0, arg3);
        if (!arg2) {
            method3484(-73, (byte) -18);
        }
        ++field8538;
        this.field8532 = arg1;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(IB)V")
    public static final void method3484(int arg0, byte arg1) {
        ++field8541;
        class213.field2800 = -1;
        if (arg0 == 37) {
            class752.field10160 = 3.0F;
        } else if (arg0 == 50) {
            class752.field10160 = 4.0F;
        } else if (~arg0 != -76) {
            if (arg0 != 100) {
                if (arg0 == 200) {
                    class752.field10160 = 16.0F;
                }
            } else {
                class752.field10160 = 8.0F;
            }
        } else {
            class752.field10160 = 6.0F;
        }
        if (arg1 != -72) {
            field8533 = null;
        }
        class213.field2800 = -1;
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(IB)V")
    public static final void method3485(int arg0, byte arg1) {
        ++field8539;
        if (arg1 > -26) {
            method3484(119, (byte) 17);
        }
        class30.field293 = arg0;
        class535 var2 = class645.field8686;
        synchronized (class645.field8686) {
            class645.field8686.method3103(-11294);
        }
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(I)V")
    public static void method3486(int arg0) {
        field8540 = null;
        field8542 = null;
        field8533 = null;
        field8535 = null;
        if (arg0 != -1) {
            method3482((class478) null, (byte) -74);
        }
    }
}
