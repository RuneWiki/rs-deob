import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class100 {

    @OriginalMember(owner = "client!pl", name = "k", descriptor = "B")
    private byte field1778;

    @OriginalMember(owner = "client!pl", name = "g", descriptor = "I")
    public int field1774;

    @OriginalMember(owner = "client!pl", name = "q", descriptor = "I")
    public int field1784;

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "I")
    public int field1770;

    @OriginalMember(owner = "client!pl", name = "n", descriptor = "I")
    public int field1781;

    @OriginalMember(owner = "client!pl", name = "t", descriptor = "I")
    public int field1787;

    @OriginalMember(owner = "client!pl", name = "h", descriptor = "Loh;")
    public static class258 field1775 = class153.method1046("Ladevorgang )2 bitte warten Sie)3", 109);

    @OriginalMember(owner = "client!pl", name = "o", descriptor = "Loh;")
    private static class258 field1782 = class153.method1046("scroll:", 97);

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "Loh;")
    public static class258 field1769 = field1782;

    @OriginalMember(owner = "client!pl", name = "l", descriptor = "Loh;")
    public static class258 field1779 = field1782;

    @OriginalMember(owner = "client!pl", name = "p", descriptor = "Lqa;")
    public static class294 field1783 = new class294();

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!pl", name = "i", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!pl", name = "j", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!pl", name = "m", descriptor = "I")
    public static int field1780;

    @OriginalMember(owner = "client!pl", name = "s", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!pl", name = "r", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field1785;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(II)Lsg;", line = 23)
    public static final class197 method748(int arg0, int arg1) {
        field1780++;
        if (arg0 == 0) {
            return new class301();
        } else if (arg0 == 1) {
            return new class86();
        } else if (arg0 == 2) {
            return new class164();
        } else if (arg0 == 3) {
            return new class253();
        } else if (arg0 == 4) {
            return new class165();
        } else if (arg0 == 5) {
            return new class241();
        } else if (arg0 == 6) {
            return new class224();
        } else if (arg0 == 7) {
            return new class29();
        } else if (arg0 == 8) {
            return new class203();
        } else if (arg0 == 9) {
            return new class15();
        } else if (arg0 == 10) {
            return new class188();
        } else if (arg0 == 11) {
            return new class193();
        } else if (arg0 == 12) {
            return new class78();
        } else if (arg0 == 13) {
            return new class34();
        } else if (arg0 == 14) {
            return new class95();
        } else if (arg0 == 15) {
            return new class308();
        } else if (arg0 == 16) {
            return new class79();
        } else if (arg0 == 17) {
            return new class47();
        } else if (arg0 == 18) {
            return new class312();
        } else if (arg0 == 19) {
            return new class311();
        } else if (arg0 == 20) {
            return new class139();
        } else if (arg0 == 21) {
            return new class128();
        } else if (arg0 == 22) {
            return new class310();
        } else if (arg0 == 23) {
            return new class19();
        } else if (arg0 == 24) {
            return new class240();
        } else if (arg0 == 25) {
            return new class147();
        } else if (arg0 == 26) {
            return new class14();
        } else if (arg0 == 27) {
            return new class293();
        } else if (arg0 == 28) {
            return new class92();
        } else if (arg0 == 29) {
            return new class52();
        } else if (arg0 == 30) {
            return new class168();
        } else if (arg0 == 31) {
            return new class205();
        } else if (arg0 == 32) {
            return new class45();
        } else if (arg0 == 33) {
            return new class173();
        } else if (arg0 == 34) {
            return new class30();
        } else if (arg0 == 35) {
            return new class153();
        } else if (arg0 == 36) {
            return new class70();
        } else if (arg0 == 37) {
            return new class127();
        } else if (arg0 == 38) {
            return new class306();
        } else if (arg0 == 39) {
            return new class83();
        } else {
            if (arg1 != 14441) {
                method755(13, (class258[]) null);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(B)I", line = 349)
    public final int method749(byte arg0) {
        if (arg0 != -76) {
            method754(86);
        }
        field1768++;
        return (this.field1778 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IBI)I", line = 361)
    public static final int method750(int arg0, byte arg1, int arg2) {
        field1771++;
        if (arg1 < 55) {
            return -126;
        }
        int var3 = 1;
        while (arg0 > 1) {
            if ((arg0 & 0x1) != 0) {
                var3 = arg2 * var3;
            }
            arg2 *= arg2;
            arg0 >>= 0x1;
        }
        if (arg0 == 1) {
            return arg2 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(II)V", line = 393)
    public static final void method751(int arg0, int arg1) {
        class286 var2 = class48.method389(arg0, 2, 10738);
        field1773++;
        var2.method2010((byte) -38);
        if (arg1 != -31) {
            field1769 = (class258) null;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V", line = 418)
    public static void method752(int arg0) {
        field1783 = null;
        field1775 = null;
        field1785 = null;
        if (arg0 == -11) {
            field1779 = null;
            field1769 = null;
            field1782 = null;
        }
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(I)I", line = 433)
    public final int method753(int arg0) {
        if (arg0 != 7) {
            field1785 = (FontMetrics) null;
        }
        field1786++;
        return this.field1778 & 0x7;
    }

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "(I)V", line = 445)
    public static final void method754(int arg0) {
        field1776++;
        class308.field5224.method1161(arg0 - 62);
        if (arg0 != -1) {
            method748(13, -35);
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I[Loh;)Loh;", line = 456)
    public static final class258 method755(int arg0, class258[] arg1) {
        if (arg0 != -6) {
            return (class258) null;
        }
        field1772++;
        if (arg1.length < 2) {
            throw new IllegalArgumentException();
        }
        return class263.method1841(arg1.length, 0, arg1, (byte) 123);
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "()V", line = 492)
    public class100() {
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Lva;)V", line = 494)
    public class100(class235 arg0) {
        this.field1778 = arg0.method1617((byte) -117);
        this.field1774 = arg0.method1615(-118);
        this.field1784 = arg0.method1611(-126);
        this.field1770 = arg0.method1611(-115);
        this.field1781 = arg0.method1611(-70);
        this.field1787 = arg0.method1611(-113);
    }
}
