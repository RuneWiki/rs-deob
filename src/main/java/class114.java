import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class114 {

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "Z")
    public boolean field1703 = true;

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "I")
    public int field1708 = 128;

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "I")
    public int field1704 = -1;

    @OriginalMember(owner = "client!sb", name = "t", descriptor = "I")
    private int field1711 = 0;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "Lma;")
    public static class5 field1697 = class12.method119("(Udns", (byte) 127);

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "[I")
    public static int[] field1702 = new int[2000];

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "[I")
    public static int[] field1699 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
    public int field1692;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
    public int field1694;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
    public static int field1695;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
    public int field1696;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "I")
    public static int field1700;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "I")
    public static int field1705;

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "I")
    public int field1706;

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "I")
    public static int field1707;

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!sb", name = "s", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "Lnd;")
    public static class216 field1693;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)Z", line = 4)
    public static final boolean method749(int arg0, int arg1) {
        field1700++;
        if (arg0 >= -9) {
            method750((byte) -81);
        }
        return (arg1 >> 20 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V", line = 33)
    public static void method750(byte arg0) {
        field1702 = null;
        if (arg0 > -62) {
            field1697 = (class5) null;
        }
        field1697 = null;
        field1699 = null;
        field1693 = null;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(II)V", line = 46)
    private final void method751(int arg0, int arg1) {
        field1705++;
        double var3 = (double) ((arg1 & 0xFFB6) >> 8) / 256.0D;
        double var5 = (double) (arg1 & 0xFF) / 256.0D;
        double var7 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var9 = var7;
        if (var7 > var3) {
            var9 = var3;
        }
        if (var9 > var5) {
            var9 = var5;
        }
        double var11 = 0.0D;
        double var13 = var7;
        if (var3 > var7) {
            var13 = var3;
        }
        double var15 = 0.0D;
        if (var13 < var5) {
            var13 = var5;
        }
        double var17 = (var9 + var13) / 2.0D;
        this.field1696 = (int) (var17 * 256.0D);
        if (var9 != var13) {
            if (var17 < 0.5D) {
                var15 = (var13 - var9) / (var9 + var13);
            }
            if (var17 >= 0.5D) {
                var15 = (var13 - var9) / (2.0D - var13 - var9);
            }
            if (var7 == var13) {
                var11 = (var3 - var5) / (var13 - var9);
            } else if (var3 == var13) {
                var11 = (var5 - var7) / (var13 - var9) + 2.0D;
            } else if (var5 == var13) {
                var11 = (var7 - var3) / (var13 - var9) + 4.0D;
            }
        }
        this.field1694 = (int) (var15 * 256.0D);
        if ((var17 > 0.5D)) {
            this.field1706 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field1706 = (int) (var15 * var17 * 512.0D);
        }
        double var19 = var11 / 6.0D;
        if (arg0 <= 109) {
            return;
        }
        if (this.field1696 < 0) {
            this.field1696 = 0;
        } else if (this.field1696 > 255) {
            this.field1696 = 255;
        }
        if (this.field1694 < 0) {
            this.field1694 = 0;
        } else if (this.field1694 > 255) {
            this.field1694 = 255;
        }
        if (this.field1706 < 1) {
            this.field1706 = 1;
        }
        this.field1692 = (int) ((double) this.field1706 * var19);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILii;I)V", line = 148)
    public final void method752(int arg0, class221 arg1, int arg2) {
        if (arg0 != -15445) {
            this.method752(109, (class221) null, 56);
        }
        field1701++;
        while (true) {
            int var4 = arg1.method1509(true);
            if (var4 == 0) {
                return;
            }
            this.method753(arg1, 3, arg2, var4);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lii;III)V", line = 182)
    private final void method753(class221 arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 3) {
            this.field1708 = -63;
        }
        field1695++;
        if (arg3 == 1) {
            this.field1711 = arg0.method1497(3610);
            this.method751(121, this.field1711);
        } else if (arg3 == 2) {
            this.field1704 = arg0.method1524((byte) 84);
            if (this.field1704 == 65535) {
                this.field1704 = -1;
            }
        } else if (arg3 == 3) {
            this.field1708 = arg0.method1524((byte) 48);
        } else if (arg3 == 4) {
            this.field1703 = false;
        }
    }
}
