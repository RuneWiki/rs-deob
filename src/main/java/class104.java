import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class104 extends class166 {

    @OriginalMember(owner = "client!ka", name = "Kb", descriptor = "Ljava/lang/String;")
    public static String field1614 = " has logged in.";

    @OriginalMember(owner = "client!ka", name = "Ob", descriptor = "I")
    public static int field1618 = 0;

    @OriginalMember(owner = "client!ka", name = "Fb", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!ka", name = "Gb", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!ka", name = "Hb", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!ka", name = "Ib", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!ka", name = "Jb", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!ka", name = "Mb", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!ka", name = "Nb", descriptor = "I")
    public static int field1617;

    @OriginalMember(owner = "client!ka", name = "Qb", descriptor = "I")
    public static int field1620;

    @OriginalMember(owner = "client!ka", name = "Rb", descriptor = "I")
    private int field1621;

    @OriginalMember(owner = "client!ka", name = "Sb", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!ka", name = "Lb", descriptor = "Ll;")
    public static class133 field1615;

    @OriginalMember(owner = "client!ka", name = "Pb", descriptor = "Lbj;")
    private class201 field1619;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIB[B)V", line = 7)
    public final void method751(int arg0, int arg1, byte arg2, byte[] arg3) {
        for (int var5 = 0; var5 < arg0; var5++) {
            arg3[arg1 + var5] = (byte) (this.field2500[this.field2532++] - this.field1619.method1433(false));
        }
        field1613++;
        if (arg2 != -25) {
            field1614 = (String) null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(Z)V", line = 23)
    public final void method752(boolean arg0) {
        this.field1621 = this.field2532 * 8;
        field1610++;
        if (arg0) {
            this.field1621 = -72;
        }
    }

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "(II)V", line = 37)
    public final void method753(int arg0, int arg1) {
        this.field2500[this.field2532++] = (byte) (this.field1619.method1433(false) + arg1);
        field1611++;
        int var3 = 112 / ((arg0 - 69) / 53);
    }

    @OriginalMember(owner = "client!ka", name = "D", descriptor = "(I)I", line = 50)
    public final int method754(int arg0) {
        field1609++;
        if (arg0 != -20368) {
            field1614 = (String) null;
        }
        return this.field2500[this.field2532++] - this.field1619.method1433(false) & 0xFF;
    }

    @OriginalMember(owner = "client!ka", name = "E", descriptor = "(I)V", line = 70)
    public static void method755(int arg0) {
        if (arg0 <= 64) {
            method755(29);
        }
        field1615 = null;
        field1614 = null;
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(I)V", line = 82)
    public class104(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ka", name = "q", descriptor = "(II)I", line = 90)
    public final int method756(int arg0, int arg1) {
        if (arg1 == 255) {
            field1620++;
            return arg0 * 8 - this.field1621;
        } else {
            return 70;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(III)Lqb;", line = 102)
    public static final class26 method757(int arg0, int arg1, int arg2) {
        class142 var3 = class256.field4013[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field2204; var4++) {
            class26 var5 = var3.field2197[var4];
            if ((var5.field402 >> 29 & 0x3L) == 2L && var5.field411 == arg1 && var5.field410 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "(B)V", line = 123)
    public final void method758(byte arg0) {
        field1612++;
        if (arg0 == -124) {
            this.field2532 = (this.field1621 + 7) / 8;
        }
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(ZI)I", line = 142)
    public final int method759(boolean arg0, int arg1) {
        field1622++;
        int var3 = this.field1621 >> 3;
        int var4 = 8 - (this.field1621 & 0x7);
        this.field1621 += arg1;
        if (arg0) {
            this.method753(10, -66);
        }
        int var5 = 0;
        while (arg1 > var4) {
            var5 += (this.field2500[var3++] & class60.field969[var4]) << arg1 - var4;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg1 == var4) {
            var6 = (class60.field969[var4] & this.field2500[var3]) + var5;
        } else {
            var6 = (this.field2500[var3] >> var4 - arg1 & class60.field969[arg1]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "([II)V", line = 176)
    public final void method760(int[] arg0, int arg1) {
        field1616++;
        if (arg1 != 8) {
            field1615 = (class133) null;
        }
        this.field1619 = new class201(arg0);
    }
}
