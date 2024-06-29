import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class128 extends class293 {

    @OriginalMember(owner = "client!el", name = "k", descriptor = "I")
    public static int field1778 = -1;

    @OriginalMember(owner = "client!el", name = "u", descriptor = "Liu;")
    public static class397 field1788 = null;

    @OriginalMember(owner = "client!el", name = "t", descriptor = "I")
    public static int field1787 = 0;

    @OriginalMember(owner = "client!el", name = "i", descriptor = "C")
    public char field1776;

    @OriginalMember(owner = "client!el", name = "h", descriptor = "I")
    public static int field1775;

    @OriginalMember(owner = "client!el", name = "j", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!el", name = "m", descriptor = "I")
    public static int field1780;

    @OriginalMember(owner = "client!el", name = "n", descriptor = "I")
    public int field1781;

    @OriginalMember(owner = "client!el", name = "o", descriptor = "I")
    public static int field1782;

    @OriginalMember(owner = "client!el", name = "s", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!el", name = "v", descriptor = "I")
    public int field1789;

    @OriginalMember(owner = "client!el", name = "l", descriptor = "J")
    public long field1779;

    @OriginalMember(owner = "client!el", name = "q", descriptor = "Lel;")
    public class128 field1784;

    @OriginalMember(owner = "client!el", name = "r", descriptor = "Lfc;")
    public static class239 field1785;

    @OriginalMember(owner = "client!el", name = "p", descriptor = "Z")
    public boolean field1783;

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(I)I")
    public final int method891(int arg0) {
        if (arg0 != -1) {
            this.field1783 = true;
        }
        field1775++;
        return this.field1781;
    }

    @OriginalMember(owner = "client!el", name = "d", descriptor = "(I)I")
    public final int method892(int arg0) {
        if (arg0 != -1) {
            field1787 = 101;
        }
        field1780++;
        return this.field1789;
    }

    @OriginalMember(owner = "client!el", name = "c", descriptor = "(B)J")
    public final long method893(byte arg0) {
        field1786++;
        if (arg0 != 75) {
            this.field1784 = null;
        }
        return this.field1779;
    }

    @OriginalMember(owner = "client!el", name = "e", descriptor = "(I)V")
    public static final void method894(int arg0) {
        class426.field6093 = arg0;
        for (int var1 = 0; var1 < class412.field5957; var1++) {
            for (int var2 = 0; var2 < class315.field4743; var2++) {
                if (class170.field2427[arg0][var1][var2] == null) {
                    class170.field2427[arg0][var1][var2] = new class337(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(B)C")
    public final char method895(byte arg0) {
        if (arg0 <= 29) {
            return '\u007f';
        } else {
            field1777++;
            return this.field1776;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Z)V")
    public static void method896(boolean arg0) {
        if (!arg0) {
            field1787 = -13;
        }
        field1788 = null;
        field1785 = null;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)Z")
    public final boolean method897(int arg0) {
        int var2 = 25 % ((arg0 - 9) / 32);
        field1782++;
        return this.field1783;
    }
}
