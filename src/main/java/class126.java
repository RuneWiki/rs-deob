import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class126 {

    @OriginalMember(owner = "client!po", name = "l", descriptor = "I")
    public int field1731;

    @OriginalMember(owner = "client!po", name = "p", descriptor = "I")
    public static int field1735 = 0;

    @OriginalMember(owner = "client!po", name = "f", descriptor = "Lfn;")
    public static class52 field1725 = new class52(83, -1);

    @OriginalMember(owner = "client!po", name = "c", descriptor = "I")
    public int field1722;

    @OriginalMember(owner = "client!po", name = "e", descriptor = "I")
    public int field1724;

    @OriginalMember(owner = "client!po", name = "h", descriptor = "I")
    public int field1727;

    @OriginalMember(owner = "client!po", name = "q", descriptor = "I")
    public static int field1736;

    @OriginalMember(owner = "client!po", name = "r", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!po", name = "u", descriptor = "Ldr;")
    public static class250 field1740;

    @OriginalMember(owner = "client!po", name = "b", descriptor = "Lfc;")
    public static class343 field1721;

    @OriginalMember(owner = "client!po", name = "d", descriptor = "Ldl;")
    public class64 field1723;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "[I")
    public int[] field1720;

    @OriginalMember(owner = "client!po", name = "g", descriptor = "[I")
    public int[] field1726;

    @OriginalMember(owner = "client!po", name = "i", descriptor = "[I")
    public int[] field1728;

    @OriginalMember(owner = "client!po", name = "j", descriptor = "[I")
    public int[] field1729;

    @OriginalMember(owner = "client!po", name = "s", descriptor = "[I")
    public int[] field1738;

    @OriginalMember(owner = "client!po", name = "t", descriptor = "[I")
    public int[] field1739;

    @OriginalMember(owner = "client!po", name = "k", descriptor = "[Ldl;")
    public class64[] field1730;

    @OriginalMember(owner = "client!po", name = "m", descriptor = "[[I")
    public int[][] field1732;

    @OriginalMember(owner = "client!po", name = "n", descriptor = "[[I")
    public static int[][] field1733;

    @OriginalMember(owner = "client!po", name = "o", descriptor = "[[I")
    public int[][] field1734;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(B)Z", line = 7)
    public static final boolean method763(byte arg0) {
        field1736++;
        class106 var1 = (class106) class250.field3514.field3504.field2609;
        if (var1 == null || class250.field3514.field3504 == var1) {
            return false;
        }
        if (var1.field1517 >= 2000) {
            var1.field1517 -= 2000;
        }
        if (var1.field1517 == 1004) {
            return true;
        } else {
            int var2 = 34 / ((59 - arg0) / 54);
            return false;
        }
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(B)V", line = 29)
    public static void method764(byte arg0) {
        if (arg0 >= -35) {
            method764((byte) 39);
        }
        field1725 = null;
        field1740 = null;
        field1721 = null;
        field1733 = null;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "([BI)V", line = 56)
    private final void method765(byte[] arg0, int arg1) {
        field1737++;
        class425 var3 = new class425(class198.method1259(arg0, (byte) 123));
        int var4 = var3.method2503(true);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field1722 = var3.method2502((byte) -86);
        } else {
            this.field1722 = 0;
        }
        int var5 = var3.method2503(true);
        this.field1724 = var3.method2508(true);
        int var6 = 0;
        int var7 = -1;
        this.field1739 = new int[this.field1724];
        for (int var8 = 0; var8 < this.field1724; var8++) {
            this.field1739[var8] = var6 += var3.method2508(true);
            if (var7 < this.field1739[var8]) {
                var7 = this.field1739[var8];
            }
        }
        this.field1727 = var7 + 1;
        this.field1738 = new int[this.field1727];
        this.field1734 = new int[this.field1727][];
        this.field1728 = new int[this.field1727];
        this.field1729 = new int[this.field1727];
        this.field1720 = new int[this.field1727];
        if (var5 != 0) {
            this.field1726 = new int[this.field1727];
            for (int var9 = 0; var9 < this.field1727; var9++) {
                this.field1726[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field1724; var10++) {
                this.field1726[this.field1739[var10]] = var3.method2502((byte) -86);
            }
            this.field1723 = new class64(this.field1726);
        }
        for (int var11 = 0; var11 < this.field1724; var11++) {
            this.field1738[this.field1739[var11]] = var3.method2502((byte) -86);
        }
        for (int var12 = 0; var12 < this.field1724; var12++) {
            this.field1729[this.field1739[var12]] = var3.method2502((byte) -86);
        }
        for (int var13 = 0; var13 < this.field1724; var13++) {
            this.field1720[this.field1739[var13]] = var3.method2508(true);
        }
        for (int var14 = 0; var14 < this.field1724; var14++) {
            int var21 = this.field1739[var14];
            int var22 = 0;
            int var23 = this.field1720[var21];
            int var24 = -1;
            this.field1734[var21] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                int var26 = this.field1734[var21][var25] = var22 += var3.method2508(true);
                if (var26 > var24) {
                    var24 = var26;
                }
            }
            this.field1728[var21] = var24 + 1;
            if ((var24 + 1) == var23) {
                this.field1734[var21] = null;
            }
        }
        if (~var5 == arg1) {
            return;
        }
        this.field1730 = new class64[var7 + 1];
        this.field1732 = new int[var7 + 1][];
        for (int var15 = 0; var15 < this.field1724; var15++) {
            int var16 = this.field1739[var15];
            int var17 = this.field1720[var16];
            this.field1732[var16] = new int[this.field1728[var16]];
            for (int var18 = 0; var18 < this.field1728[var16]; var18++) {
                this.field1732[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                int var20;
                if (this.field1734[var16] == null) {
                    var20 = var19;
                } else {
                    var20 = this.field1734[var16][var19];
                }
                this.field1732[var16][var20] = var3.method2502((byte) -86);
            }
            this.field1730[var16] = new class64(this.field1732[var16]);
        }
    }

    @OriginalMember(owner = "client!po", name = "<init>", descriptor = "([BI)V", line = 235)
    public class126(byte[] arg0, int arg1) {
        this.field1731 = class464.method2740(false, arg0, arg0.length);
        if (this.field1731 != arg1) {
            throw new RuntimeException();
        }
        this.method765(arg0, -1);
    }
}
