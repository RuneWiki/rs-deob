import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public abstract class class120 extends class59 {

    @OriginalMember(owner = "client!i", name = "H", descriptor = "Z")
    public boolean field1770;

    @OriginalMember(owner = "client!i", name = "w", descriptor = "[Li;")
    public class120[] field1759;

    @OriginalMember(owner = "client!i", name = "v", descriptor = "Lok;")
    public static class41 field1758 = class137.method956("::", 45);

    @OriginalMember(owner = "client!i", name = "z", descriptor = "I")
    public static int field1762 = -1;

    @OriginalMember(owner = "client!i", name = "Q", descriptor = "Lok;")
    private static class41 field1779 = class137.method956("Loaded wordpack", 45);

    @OriginalMember(owner = "client!i", name = "C", descriptor = "Lok;")
    public static class41 field1765 = field1779;

    @OriginalMember(owner = "client!i", name = "x", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!i", name = "y", descriptor = "I")
    public static int field1761;

    @OriginalMember(owner = "client!i", name = "D", descriptor = "I")
    public static int field1766;

    @OriginalMember(owner = "client!i", name = "E", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!i", name = "F", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!i", name = "G", descriptor = "I")
    public static int field1769;

    @OriginalMember(owner = "client!i", name = "I", descriptor = "I")
    public int field1771;

    @OriginalMember(owner = "client!i", name = "J", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!i", name = "K", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!i", name = "L", descriptor = "I")
    public static int field1774;

    @OriginalMember(owner = "client!i", name = "N", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!i", name = "O", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!i", name = "P", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!i", name = "S", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!i", name = "M", descriptor = "Lkj;")
    public class121 field1775;

    @OriginalMember(owner = "client!i", name = "B", descriptor = "Lra;")
    public class123 field1764;

    @OriginalMember(owner = "client!i", name = "A", descriptor = "Ldm;")
    public static class182 field1763;

    @OriginalMember(owner = "client!i", name = "R", descriptor = "Lmh;")
    public static class65 field1780;

    @OriginalMember(owner = "client!i", name = "d", descriptor = "(I)V", line = 17)
    public void method31(int arg0) {
        field1776++;
        if (arg0 != -31851) {
            this.method14(22, 67);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(III)[I", line = 30)
    public final int[] method854(int arg0, int arg1, int arg2) {
        field1760++;
        if (arg2 != -24059) {
            this.method31(116);
        }
        return this.field1759[arg0].field1770 ? this.field1759[arg0].method14(arg1, -14959) : this.field1759[arg0].method168(arg1, true)[0];
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "(B)V", line = 52)
    public static void method855(byte arg0) {
        if (arg0 >= -71) {
            field1763 = (class182) null;
        }
        field1765 = null;
        field1780 = null;
        field1779 = null;
        field1763 = null;
        field1758 = null;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Z)V", line = 81)
    public void method435(boolean arg0) {
        if (this.field1770) {
            this.field1775.method864((byte) -8);
            this.field1775 = null;
        } else {
            this.field1764.method873(-126);
            this.field1764 = null;
        }
        if (arg0) {
            field1767++;
        }
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(III)V", line = 111)
    public final void method856(int arg0, int arg1, int arg2) {
        field1777++;
        int var4 = this.field1771 == 255 ? arg0 : this.field1771;
        if (arg1 != 1) {
            return;
        }
        if (this.field1770) {
            this.field1775 = new class121(var4, arg0, arg2);
        } else {
            this.field1764 = new class123(var4, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Llb;II)V", line = 135)
    public void method30(class112 arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            this.method438((byte) -117);
        }
        field1766++;
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(IZ)[[I", line = 146)
    public int[][] method168(int arg0, boolean arg1) {
        if (!arg1) {
            this.method14(-5, 1);
        }
        field1768++;
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II)[I", line = 158)
    public int[] method14(int arg0, int arg1) {
        field1761++;
        if (arg1 != -14959) {
            this.method30((class112) null, 109, -80);
        }
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!i", name = "e", descriptor = "(I)I", line = 170)
    public int method572(int arg0) {
        int var2 = -30 % ((arg0 - 64) / 61);
        field1774++;
        return -1;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IBIII)I", line = 183)
    public static final int method857(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field1769++;
        if (arg1 != 94) {
            field1780 = (class65) null;
        }
        int var5 = arg2 & 0xF;
        int var6 = var5 >= 4 ? (var5 == 12 || var5 == 14 ? arg3 : arg0) : arg4;
        int var7 = var5 < 8 ? arg3 : arg4;
        return ((var5 & 0x2) == 0 ? var6 : -var6) + ((var5 & 0x1) == 0 ? var7 : -var7);
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "(III)[[I", line = 200)
    public final int[][] method858(int arg0, int arg1, int arg2) {
        if (arg2 < 118) {
            return (int[][]) ((int[][]) null);
        }
        field1778++;
        if (this.field1759[arg0].field1770) {
            int[] var4 = this.field1759[arg0].method14(arg1, -14959);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field1759[arg0].method168(arg1, true);
        }
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(IZ)V", line = 242)
    public class120(int arg0, boolean arg1) {
        this.field1770 = arg1;
        this.field1759 = new class120[arg0];
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(II)V", line = 254)
    public static final void method859(int arg0, int arg1) {
        if (arg1 != 26149) {
            field1779 = (class41) null;
        }
        field1772++;
        if (arg0 == 0) {
            return;
        }
        if (arg0 == 1) {
            class244.method1746(arg1 - 26124);
        } else if (arg0 == 2) {
            class281.method1979(false);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!i", name = "d", descriptor = "(B)I", line = 289)
    public int method438(byte arg0) {
        field1781++;
        return arg0 == -71 ? -1 : -15;
    }
}
