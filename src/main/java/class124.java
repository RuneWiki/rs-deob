import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class124 {

    @OriginalMember(owner = "client!vm", name = "k", descriptor = "I")
    public int field1607;

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "I")
    public int field1599;

    @OriginalMember(owner = "client!vm", name = "e", descriptor = "I")
    public static int field1601;

    @OriginalMember(owner = "client!vm", name = "g", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!vm", name = "l", descriptor = "I")
    public static int field1608;

    @OriginalMember(owner = "client!vm", name = "o", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!vm", name = "p", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!vm", name = "q", descriptor = "I")
    public int field1613;

    @OriginalMember(owner = "client!vm", name = "r", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!vm", name = "t", descriptor = "I")
    public int field1616;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "Lqq;")
    public class389 field1597;

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "[I")
    public int[] field1598;

    @OriginalMember(owner = "client!vm", name = "f", descriptor = "[I")
    public int[] field1602;

    @OriginalMember(owner = "client!vm", name = "h", descriptor = "[I")
    public int[] field1604;

    @OriginalMember(owner = "client!vm", name = "m", descriptor = "[I")
    public int[] field1609;

    @OriginalMember(owner = "client!vm", name = "n", descriptor = "[I")
    public int[] field1610;

    @OriginalMember(owner = "client!vm", name = "s", descriptor = "[I")
    public int[] field1615;

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "[Lqq;")
    public class389[] field1600;

    @OriginalMember(owner = "client!vm", name = "i", descriptor = "[[I")
    public int[][] field1605;

    @OriginalMember(owner = "client!vm", name = "j", descriptor = "[[I")
    public int[][] field1606;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(I[B)V", line = 5)
    private final void method881(int arg0, byte[] arg1) {
        field1612++;
        class341 var3 = new class341(class407.method2577(arg1, 1));
        int var4 = var3.method2233((byte) 104);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field1616 = var3.method2232(-78);
        } else {
            this.field1616 = 0;
        }
        int var5 = var3.method2233((byte) 104);
        this.field1613 = var3.method2239(-1076227960);
        int var6 = 0;
        int var7 = -1;
        this.field1609 = new int[this.field1613];
        for (int var8 = 0; var8 < this.field1613; var8++) {
            this.field1609[var8] = var6 += var3.method2239(-1076227960);
            if (this.field1609[var8] > var7) {
                var7 = this.field1609[var8];
            }
        }
        this.field1599 = var7 + 1;
        this.field1615 = new int[this.field1599];
        this.field1602 = new int[this.field1599];
        this.field1598 = new int[this.field1599];
        this.field1606 = new int[this.field1599][];
        this.field1610 = new int[this.field1599];
        if (var5 != 0) {
            this.field1604 = new int[this.field1599];
            for (int var9 = 0; var9 < this.field1599; var9++) {
                this.field1604[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field1613; var10++) {
                this.field1604[this.field1609[var10]] = var3.method2232(122);
            }
            this.field1597 = new class389(this.field1604);
        }
        if (arg0 > -113) {
            return;
        }
        for (int var11 = 0; var11 < this.field1613; var11++) {
            this.field1615[this.field1609[var11]] = var3.method2232(-128);
        }
        for (int var12 = 0; var12 < this.field1613; var12++) {
            this.field1602[this.field1609[var12]] = var3.method2232(121);
        }
        for (int var13 = 0; var13 < this.field1613; var13++) {
            this.field1598[this.field1609[var13]] = var3.method2239(-1076227960);
        }
        for (int var14 = 0; var14 < this.field1613; var14++) {
            int var21 = this.field1609[var14];
            int var22 = 0;
            int var23 = this.field1598[var21];
            this.field1606[var21] = new int[var23];
            int var24 = -1;
            for (int var25 = 0; var25 < var23; var25++) {
                int var26 = this.field1606[var21][var25] = var22 += var3.method2239(-1076227960);
                if (var24 < var26) {
                    var24 = var26;
                }
            }
            this.field1610[var21] = var24 + 1;
            if ((var24 + 1) == var23) {
                this.field1606[var21] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field1605 = new int[var7 + 1][];
        this.field1600 = new class389[var7 + 1];
        for (int var15 = 0; var15 < this.field1613; var15++) {
            int var16 = this.field1609[var15];
            int var17 = this.field1598[var16];
            this.field1605[var16] = new int[this.field1610[var16]];
            for (int var18 = 0; var18 < this.field1610[var16]; var18++) {
                this.field1605[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                int var20;
                if (this.field1606[var16] == null) {
                    var20 = var19;
                } else {
                    var20 = this.field1606[var16][var19];
                }
                this.field1605[var16][var20] = var3.method2232(103);
            }
            this.field1600[var16] = new class389(this.field1605[var16]);
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(BJ)V", line = 188)
    public static final void method882(byte arg0, long arg1) {
        class140.field1797.field5049 = 0;
        field1603++;
        class140.field1797.method2204(21, arg0 + 78);
        if (arg0 != -70) {
            field1614 = 108;
        }
        class140.field1797.method2258(25445, arg1);
        class40.field603 = 0;
        class8.field111 = -3;
        class86.field1195 = 0;
        class17.field279 = 1;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(ILjava/lang/String;I)I", line = 206)
    public static final int method883(int arg0, String arg1, int arg2) {
        field1611++;
        if (arg0 != 21) {
            method882((byte) 64, -26L);
        }
        return class36.method281(arg2, true, arg1, -119);
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(III)V", line = 219)
    public static final void method884(int arg0, int arg1, int arg2) {
        class30.field497 = new class51(arg0);
        field1601++;
        if (arg2 == 11479) {
            class425.field6204 = new class51(arg1);
        }
    }

    @OriginalMember(owner = "client!vm", name = "<init>", descriptor = "([BI)V", line = 244)
    public class124(byte[] arg0, int arg1) {
        this.field1607 = class30.method242(arg0, 0, arg0.length);
        if (this.field1607 != arg1) {
            throw new RuntimeException();
        }
        this.method881(-126, arg0);
    }
}
