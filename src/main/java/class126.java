import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class126 extends class290 {

    @OriginalMember(owner = "client!hc", name = "s", descriptor = "[I")
    private int[] field1751 = new int[this.field4379];

    @OriginalMember(owner = "client!hc", name = "u", descriptor = "Lfc;")
    public static class235 field1753 = new class235(94, 2);

    @OriginalMember(owner = "client!hc", name = "z", descriptor = "Luj;")
    public static class349 field1758 = new class349();

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "I")
    private int field1747;

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "I")
    public static int field1748;

    @OriginalMember(owner = "client!hc", name = "q", descriptor = "I")
    public static int field1749;

    @OriginalMember(owner = "client!hc", name = "t", descriptor = "I")
    private int field1752;

    @OriginalMember(owner = "client!hc", name = "v", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!hc", name = "w", descriptor = "I")
    public static int field1755;

    @OriginalMember(owner = "client!hc", name = "x", descriptor = "I")
    public static int field1756;

    @OriginalMember(owner = "client!hc", name = "y", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!hc", name = "A", descriptor = "I")
    public static int field1759;

    @OriginalMember(owner = "client!hc", name = "r", descriptor = "[B")
    private byte[] field1750;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)V")
    public final void method894(int arg0, int arg1, int arg2) {
        if (arg1 != 630249516) {
            method895(72);
        }
        this.field1747 += this.field1751[arg2] * arg0 >> 12;
        ++field1749;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)I")
    public static final int method895(int arg0) {
        ++field1754;
        if ((double) class148.field2194 == 3.0D) {
            return 37;
        } else if ((double) class148.field2194 == 4.0D) {
            return 50;
        } else if ((double) class148.field2194 == 6.0D) {
            return 75;
        } else if (arg0 != 37) {
            return 92;
        } else {
            return (double) class148.field2194 == 8.0D ? 100 : 200;
        }
    }

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "(B)V")
    public final void method896(byte arg0) {
        ++field1756;
        this.field1747 = Math.abs(this.field1747);
        if (~this.field1747 <= -4097) {
            this.field1747 = 4095;
        }
        this.method899(this.field1752++, true, (byte) (this.field1747 >> 4));
        if (arg0 != -29) {
            field1757 = -30;
        }
        this.field1747 = 0;
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(B)V")
    public final void method897(byte arg0) {
        ++field1755;
        this.field1752 = 0;
        int var2 = 71 % ((-14 - arg0) / 59);
        this.field1747 = 0;
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(IIIIIF)V")
    public class126(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; var7 < super.field4379; ++var7) {
            this.field1751[var7] = (short) ((int) (4096.0D * Math.pow((double) arg5, (double) var7)));
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)V")
    public static void method898(int arg0) {
        int var1 = 118 % ((38 - arg0) / 56);
        field1753 = null;
        field1758 = null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IZB)V")
    public void method899(int arg0, boolean arg1, byte arg2) {
        this.field1750[this.field1752++] = (byte) (127 + class249.method1537(127, arg2 >> 1));
        ++field1748;
        if (!arg1) {
            this.method896((byte) 16);
        }
    }
}
