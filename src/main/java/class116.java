import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class116 extends class320 {

    @OriginalMember(owner = "client!gi", name = "H", descriptor = "[I")
    public static int[] field1778 = new int[14];

    @OriginalMember(owner = "client!gi", name = "M", descriptor = "Z")
    public static boolean field1783 = false;

    @OriginalMember(owner = "client!gi", name = "D", descriptor = "[Z")
    public static boolean[] field1774 = new boolean[112];

    @OriginalMember(owner = "client!gi", name = "B", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!gi", name = "G", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!gi", name = "I", descriptor = "I")
    public static int field1779;

    @OriginalMember(owner = "client!gi", name = "J", descriptor = "I")
    public static int field1780;

    @OriginalMember(owner = "client!gi", name = "O", descriptor = "I")
    public static int field1784;

    @OriginalMember(owner = "client!gi", name = "Q", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!gi", name = "F", descriptor = "Ljava/lang/String;")
    public String field1776;

    @OriginalMember(owner = "client!gi", name = "K", descriptor = "[C")
    public char[] field1781;

    @OriginalMember(owner = "client!gi", name = "P", descriptor = "[C")
    public char[] field1785;

    @OriginalMember(owner = "client!gi", name = "C", descriptor = "[I")
    public static int[] field1773;

    @OriginalMember(owner = "client!gi", name = "E", descriptor = "[I")
    public int[] field1775;

    @OriginalMember(owner = "client!gi", name = "L", descriptor = "[I")
    public int[] field1782;

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "(I)V", line = 12)
    public final void method994(int arg0) {
        field1784++;
        if (this.field1775 != null) {
            for (int var2 = 0; var2 < this.field1775.length; var2++) {
                this.field1775[var2] = class41.method426(this.field1775[var2], 32768);
            }
        }
        if (arg0 < -35 && this.field1782 != null) {
            for (int var3 = 0; var3 < this.field1782.length; var3++) {
                this.field1782[var3] = class41.method426(this.field1782[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "(I)V", line = 42)
    public static void method995(int arg0) {
        field1773 = null;
        if (arg0 == -892) {
            field1774 = null;
            field1778 = null;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(CB)I", line = 82)
    public final int method996(char arg0, byte arg1) {
        field1786++;
        if (this.field1782 == null) {
            return -1;
        }
        int var3 = 16 / ((5 - arg1) / 58);
        for (int var4 = 0; var4 < this.field1782.length; var4++) {
            if (this.field1785[var4] == arg0) {
                return this.field1782[var4];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(BLug;)V", line = 109)
    public final void method997(byte arg0, class25 arg1) {
        while (true) {
            int var3 = arg1.method281(-124);
            if (var3 == 0) {
                int var4 = -3 / ((52 - arg0) / 43);
                field1779++;
                return;
            }
            this.method998(var3, arg1, (byte) -119);
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILug;B)V", line = 125)
    private final void method998(int arg0, class25 arg1, byte arg2) {
        if (arg0 == 1) {
            this.field1776 = arg1.method297((byte) -85);
        } else if (arg0 == 2) {
            int var7 = arg1.method281(-128);
            this.field1785 = new char[var7];
            this.field1782 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1782[var8] = arg1.method314((byte) 66);
                byte var9 = arg1.method286((byte) 86);
                this.field1785[var8] = var9 == 0 ? 0 : class221.method1658((byte) -113, var9);
            }
        } else if (arg0 == 3) {
            int var4 = arg1.method281(-125);
            this.field1775 = new int[var4];
            this.field1781 = new char[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1775[var5] = arg1.method314((byte) 123);
                byte var6 = arg1.method286((byte) 114);
                this.field1781[var5] = var6 == 0 ? 0 : class221.method1658((byte) -114, var6);
            }
        } else if (arg0 == 4) {
        }
        field1777++;
        if (arg2 > -92) {
            this.field1781 = (char[]) null;
        }
    }

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "(B)Le;", line = 188)
    public static final class138 method999(byte arg0) {
        field1772++;
        if (arg0 != -48) {
            field1774 = (boolean[]) null;
        }
        class138 var1 = (class138) class158.field2531.method442((byte) -103);
        if (var1 != null) {
            var1.method1357(947647010);
            var1.method2262((byte) -102);
            return var1;
        }
        class138 var2;
        do {
            var2 = (class138) class104.field1554.method442((byte) -56);
            if (var2 == null) {
                return null;
            }
            if (var2.method1151(-19430) > class156.method1273((byte) -90)) {
                return null;
            }
            var2.method1357(947647010);
            var2.method2262((byte) -102);
        } while ((Long.MIN_VALUE & var2.field4932) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(CI)I", line = 229)
    public final int method1000(char arg0, int arg1) {
        field1780++;
        if (this.field1775 == null) {
            return -1;
        }
        if (arg1 != -1) {
            this.method998(-34, (class25) null, (byte) -42);
        }
        for (int var3 = 0; var3 < this.field1775.length; var3++) {
            if (this.field1781[var3] == arg0) {
                return this.field1775[var3];
            }
        }
        return -1;
    }
}
