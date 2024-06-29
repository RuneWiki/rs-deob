import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class48 extends class109 {

    @OriginalMember(owner = "client!rf", name = "I", descriptor = "[I")
    private final int[] field747 = new int[this.field1538];

    @OriginalMember(owner = "client!rf", name = "D", descriptor = "I")
    public static int field742 = 0;

    @OriginalMember(owner = "client!rf", name = "H", descriptor = "I")
    public static int field746 = 0;

    @OriginalMember(owner = "client!rf", name = "L", descriptor = "I")
    public static int field750 = 0;

    @OriginalMember(owner = "client!rf", name = "O", descriptor = "Lok;")
    private static class41 field753 = class137.method956("Loading fonts )2 ", 45);

    @OriginalMember(owner = "client!rf", name = "C", descriptor = "Lok;")
    public static class41 field741 = field753;

    @OriginalMember(owner = "client!rf", name = "P", descriptor = "[[B")
    public static byte[][] field754 = new byte[250][];

    @OriginalMember(owner = "client!rf", name = "y", descriptor = "I")
    private int field737;

    @OriginalMember(owner = "client!rf", name = "z", descriptor = "I")
    public static int field738;

    @OriginalMember(owner = "client!rf", name = "A", descriptor = "I")
    private int field739;

    @OriginalMember(owner = "client!rf", name = "B", descriptor = "I")
    public static int field740;

    @OriginalMember(owner = "client!rf", name = "E", descriptor = "I")
    public static int field743;

    @OriginalMember(owner = "client!rf", name = "F", descriptor = "I")
    public static int field744;

    @OriginalMember(owner = "client!rf", name = "G", descriptor = "I")
    public static int field745;

    @OriginalMember(owner = "client!rf", name = "M", descriptor = "I")
    public static int field751;

    @OriginalMember(owner = "client!rf", name = "N", descriptor = "I")
    public static int field752;

    @OriginalMember(owner = "client!rf", name = "K", descriptor = "Ldk;")
    public static class253 field749;

    @OriginalMember(owner = "client!rf", name = "J", descriptor = "[B")
    private byte[] field748;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ZII)V", line = 11)
    public final void method341(boolean arg0, int arg1, int arg2) {
        this.field737 += this.field747[arg1] * arg2 >> 12;
        if (arg0) {
            method343(-77);
        }
        field745++;
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "(I)V", line = 25)
    public final void method342(int arg0) {
        this.field737 = Math.abs(this.field737);
        if (arg0 != 23101) {
            return;
        }
        if (this.field737 >= 4096) {
            this.field737 = 4095;
        }
        this.method345(this.field739++, (byte) (this.field737 >> 4));
        this.field737 = 0;
        field752++;
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(IIIIIF)V", line = 53)
    public class48(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; var7 < this.field1538; var7++) {
            this.field747[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "(I)V", line = 71)
    public static void method343(int arg0) {
        field741 = null;
        if (arg0 != 3664) {
            method343(-14);
        }
        field754 = (byte[][]) null;
        field749 = null;
        field753 = null;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)V", line = 85)
    public final void method344(byte arg0) {
        this.field739 = 0;
        if (arg0 == -77) {
            this.field737 = 0;
            field743++;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IB)V", line = 105)
    public void method345(int arg0, byte arg1) {
        field751++;
        this.field748[this.field739++] = (byte) (class217.method1563(arg1 >> 1, 127) + 127);
    }

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "(I)I", line = 127)
    public static final int method346(int arg0) {
        if (arg0 != 0) {
            method346(-42);
        }
        field738++;
        if (class268.field4318) {
            return 0;
        } else if (class75.method553(23987)) {
            return class33.field499 ? 2 : 1;
        } else {
            return 1;
        }
    }
}
