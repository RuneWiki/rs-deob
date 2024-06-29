import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class132 {

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
    public int field1782;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "[I")
    public static int[] field1788;

    @OriginalMember(owner = "client!ne", name = "p", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
    public static int field1784;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
    public int field1787;

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!ne", name = "o", descriptor = "I")
    public int field1796;

    @OriginalMember(owner = "client!ne", name = "q", descriptor = "I")
    public int field1798;

    @OriginalMember(owner = "client!ne", name = "r", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "Lqs;")
    public class502 field1786;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "[I")
    public int[] field1783;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "[I")
    public int[] field1785;

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "[I")
    public int[] field1790;

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "[I")
    public int[] field1791;

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "[I")
    public int[] field1792;

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "[I")
    public int[] field1793;

    @OriginalMember(owner = "client!ne", name = "s", descriptor = "[Lqs;")
    public class502[] field1800;

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "[[I")
    public int[][] field1789;

    @OriginalMember(owner = "client!ne", name = "n", descriptor = "[[I")
    public int[][] field1795;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(III)Z")
    public static final boolean method817(int arg0, int arg1, int arg2) {
        if (arg2 != -1) {
            field1788 = null;
        }
        field1799++;
        return (arg0 & 0x20) != 0;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "([BB)V")
    private final void method818(byte[] arg0, byte arg1) {
        field1794++;
        class208 var3 = new class208(class272.method1840(arg0, arg1 ^ 0x7F));
        int var4 = var3.method1445(-119);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 < 6) {
            this.field1798 = 0;
        } else {
            this.field1798 = var3.method1436((byte) 99);
        }
        int var5 = var3.method1445(arg1 + 237);
        this.field1787 = var3.method1455(arg1 - 3259);
        int var6 = 0;
        int var7 = -1;
        this.field1791 = new int[this.field1787];
        for (int var8 = 0; var8 < this.field1787; var8++) {
            this.field1791[var8] = var6 += var3.method1455(arg1 - 3259);
            if (this.field1791[var8] > var7) {
                var7 = this.field1791[var8];
            }
        }
        this.field1796 = var7 + 1;
        this.field1792 = new int[this.field1796];
        this.field1795 = new int[this.field1796][];
        this.field1793 = new int[this.field1796];
        this.field1783 = new int[this.field1796];
        this.field1785 = new int[this.field1796];
        if (var5 != 0) {
            this.field1790 = new int[this.field1796];
            for (int var9 = 0; var9 < this.field1796; var9++) {
                this.field1790[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field1787; var10++) {
                this.field1790[this.field1791[var10]] = var3.method1436((byte) 123);
            }
            this.field1786 = new class502(this.field1790);
        }
        int var11 = 0;
        if (arg1 != -128) {
            this.method818(null, (byte) -66);
        }
        while (this.field1787 > var11) {
            this.field1793[this.field1791[var11]] = var3.method1436((byte) 126);
            var11++;
        }
        for (int var12 = 0; var12 < this.field1787; var12++) {
            this.field1785[this.field1791[var12]] = var3.method1436((byte) 86);
        }
        for (int var13 = 0; var13 < this.field1787; var13++) {
            this.field1792[this.field1791[var13]] = var3.method1455(-3387);
        }
        for (int var14 = 0; var14 < this.field1787; var14++) {
            int var21 = this.field1791[var14];
            int var22 = 0;
            int var23 = this.field1792[var21];
            this.field1795[var21] = new int[var23];
            int var24 = -1;
            for (int var25 = 0; var25 < var23; var25++) {
                int var26 = this.field1795[var21][var25] = var22 += var3.method1455(-3387);
                if (var24 < var26) {
                    var24 = var26;
                }
            }
            this.field1783[var21] = var24 + 1;
            if ((var24 + 1) == var23) {
                this.field1795[var21] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field1789 = new int[var7 + 1][];
        this.field1800 = new class502[var7 + 1];
        for (int var15 = 0; var15 < this.field1787; var15++) {
            int var16 = this.field1791[var15];
            int var17 = this.field1792[var16];
            this.field1789[var16] = new int[this.field1783[var16]];
            for (int var18 = 0; var18 < this.field1783[var16]; var18++) {
                this.field1789[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                int var20;
                if (this.field1795[var16] == null) {
                    var20 = var19;
                } else {
                    var20 = this.field1795[var16][var19];
                }
                this.field1789[var16][var20] = var3.method1436((byte) 103);
            }
            this.field1800[var16] = new class502(this.field1789[var16]);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V")
    public static void method819(int arg0) {
        if (arg0 != 0) {
            method819(-14);
        }
        field1788 = null;
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "([BI)V")
    public class132(byte[] arg0, int arg1) {
        this.field1782 = class225.method1623((byte) -19, arg0.length, arg0);
        if (this.field1782 != arg1) {
            throw new RuntimeException();
        }
        this.method818(arg0, (byte) -128);
    }

    static {
        new class213(null, "bevor du die Option 'Regelverstoß melden' benutzt.", null, null);
        field1788 = new int[1000];
        field1797 = -1;
    }
}
