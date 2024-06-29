import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class21 extends class101 {

    @OriginalMember(owner = "client!i", name = "m", descriptor = "I")
    public int field242;

    @OriginalMember(owner = "client!i", name = "I", descriptor = "I")
    public int field263;

    @OriginalMember(owner = "client!i", name = "t", descriptor = "I")
    public static int field249 = 0;

    @OriginalMember(owner = "client!i", name = "v", descriptor = "Lom;")
    public static class156 field251 = new class156();

    @OriginalMember(owner = "client!i", name = "E", descriptor = "I")
    public static int field259 = 0;

    @OriginalMember(owner = "client!i", name = "G", descriptor = "I")
    public static int field261 = 0;

    @OriginalMember(owner = "client!i", name = "A", descriptor = "I")
    public static int field256 = 0;

    @OriginalMember(owner = "client!i", name = "F", descriptor = "I")
    public static int field260 = -1;

    @OriginalMember(owner = "client!i", name = "n", descriptor = "I")
    public static int field243;

    @OriginalMember(owner = "client!i", name = "o", descriptor = "I")
    public static int field244;

    @OriginalMember(owner = "client!i", name = "p", descriptor = "I")
    public static int field245;

    @OriginalMember(owner = "client!i", name = "q", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!i", name = "r", descriptor = "I")
    public static int field247;

    @OriginalMember(owner = "client!i", name = "s", descriptor = "I")
    public static int field248;

    @OriginalMember(owner = "client!i", name = "u", descriptor = "I")
    public static int field250;

    @OriginalMember(owner = "client!i", name = "w", descriptor = "I")
    public static int field252;

    @OriginalMember(owner = "client!i", name = "x", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "client!i", name = "y", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!i", name = "z", descriptor = "I")
    public static int field255;

    @OriginalMember(owner = "client!i", name = "D", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!i", name = "C", descriptor = "[[B")
    public static byte[][] field257;

    @OriginalMember(owner = "client!i", name = "H", descriptor = "[[B")
    public static byte[][] field262;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "(I)Z", line = 5)
    public final boolean method127(int arg0) {
        field258++;
        if (arg0 != 21828) {
            field257 = (byte[][]) ((byte[][]) null);
        }
        return (this.field242 >> 28 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!i", name = "d", descriptor = "(I)Z", line = 17)
    public final boolean method128(int arg0) {
        field243++;
        if (arg0 == 0) {
            return (this.field242 >> 31 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!i", name = "e", descriptor = "(I)I", line = 28)
    public final int method129(int arg0) {
        field254++;
        if (arg0 != -1016220482) {
            field251 = (class156) null;
        }
        return this.field242 >> 18 & 0x7;
    }

    @OriginalMember(owner = "client!i", name = "f", descriptor = "(I)V", line = 39)
    public static void method130(int arg0) {
        field262 = (byte[][]) null;
        field251 = null;
        field257 = (byte[][]) null;
        if (arg0 != 200) {
            field260 = 117;
        }
    }

    @OriginalMember(owner = "client!i", name = "g", descriptor = "(I)I", line = 60)
    public static final int method131(int arg0) {
        field246++;
        if ((double) class61.field802 == 3.0D) {
            return 37;
        } else if (arg0 != 27527) {
            return 18;
        } else if ((double) class61.field802 == 4.0D) {
            return 50;
        } else if ((double) class61.field802 == 6.0D) {
            return 75;
        } else if ((double) class61.field802 == 8.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @OriginalMember(owner = "client!i", name = "h", descriptor = "(I)Z", line = 88)
    public final boolean method132(int arg0) {
        int var2 = 5 / ((arg0 - 30) / 45);
        field255++;
        return (this.field242 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!i", name = "i", descriptor = "(I)Z", line = 98)
    public final boolean method133(int arg0) {
        field244++;
        if (arg0 != -1) {
            field251 = (class156) null;
        }
        return (this.field242 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!i", name = "j", descriptor = "(I)Z", line = 109)
    public final boolean method134(int arg0) {
        if (arg0 <= 74) {
            field251 = (class156) null;
        }
        field245++;
        return (this.field242 & 0x677B2EAD) >> 30 != 0;
    }

    @OriginalMember(owner = "client!i", name = "k", descriptor = "(I)Z", line = 121)
    public final boolean method135(int arg0) {
        field247++;
        if (arg0 != 200) {
            field260 = 39;
        }
        return ((this.field242 & 0x731C2C) >> 22) != 0;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ZII)I", line = 138)
    public static final int method136(boolean arg0, int arg1, int arg2) {
        field250++;
        class223 var3 = (class223) class295.field4520.method1320((long) arg1, 13002);
        if (var3 == null) {
            return -1;
        } else if (arg2 >= 0 && var3.field3398.length > arg2) {
            return arg0 ? -111 : var3.field3398[arg2];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II)Z", line = 168)
    public final boolean method137(int arg0, int arg1) {
        int var3 = 89 % ((arg1 + 50) / 33);
        field253++;
        return (this.field242 >> arg0 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(B)I", line = 189)
    public final int method138(byte arg0) {
        if (arg0 <= 76) {
            field257 = (byte[][]) ((byte[][]) null);
        }
        field252++;
        return class298.method2074(-63, this.field242);
    }

    @OriginalMember(owner = "client!i", name = "l", descriptor = "(I)Z", line = 203)
    public final boolean method139(int arg0) {
        field248++;
        if (arg0 != 11442) {
            this.field263 = -99;
        }
        return ((this.field242 & 0x3E25764A) >> 29) != 0;
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(II)V", line = 220)
    public class21(int arg0, int arg1) {
        this.field242 = arg0;
        this.field263 = arg1;
    }
}
