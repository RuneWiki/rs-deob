import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class261 {

    @OriginalMember(owner = "client!dg", name = "m", descriptor = "I")
    public int field3827;

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "Lwf;")
    public static class79 field3820 = new class79(16, 18);

    @OriginalMember(owner = "client!dg", name = "l", descriptor = "Lus;")
    public static class1 field3826 = new class1(46, 5);

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "I")
    public static int field3821;

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "I")
    public int field3823;

    @OriginalMember(owner = "client!dg", name = "o", descriptor = "I")
    public int field3829;

    @OriginalMember(owner = "client!dg", name = "p", descriptor = "I")
    public int field3830;

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "Ltl;")
    public class403 field3822;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "[I")
    public int[] field3816;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "[I")
    public int[] field3817;

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "[I")
    public int[] field3819;

    @OriginalMember(owner = "client!dg", name = "j", descriptor = "[I")
    public int[] field3824;

    @OriginalMember(owner = "client!dg", name = "k", descriptor = "[I")
    public int[] field3825;

    @OriginalMember(owner = "client!dg", name = "q", descriptor = "[I")
    public int[] field3831;

    @OriginalMember(owner = "client!dg", name = "n", descriptor = "[Ltl;")
    public class403[] field3828;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "[[I")
    public int[][] field3815;

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "[[I")
    public int[][] field3818;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I[B)V")
    private final void method1618(int arg0, byte[] arg1) {
        field3821++;
        class276 var3 = new class276(class237.method1509(arg1, -124));
        int var4 = var3.method1701(-23121);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field3823 = var3.method1688(20402);
        } else {
            this.field3823 = 0;
        }
        int var5 = var3.method1701(-23121);
        this.field3830 = var3.method1729(arg0 ^ 0x9449);
        int var6 = 0;
        int var7 = -1;
        this.field3817 = new int[this.field3830];
        for (int var8 = 0; var8 < this.field3830; var8++) {
            this.field3817[var8] = var6 += var3.method1729(65280);
            if (this.field3817[var8] > var7) {
                var7 = this.field3817[var8];
            }
        }
        this.field3829 = var7 + 1;
        this.field3818 = new int[this.field3829][];
        this.field3831 = new int[this.field3829];
        this.field3816 = new int[this.field3829];
        this.field3824 = new int[this.field3829];
        this.field3825 = new int[this.field3829];
        if (var5 != 0) {
            this.field3819 = new int[this.field3829];
            for (int var9 = 0; var9 < this.field3829; var9++) {
                this.field3819[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field3830; var10++) {
                this.field3819[this.field3817[var10]] = var3.method1688(arg0 - 7063);
            }
            this.field3822 = new class403(this.field3819);
        }
        for (int var11 = 0; var11 < this.field3830; var11++) {
            this.field3825[this.field3817[var11]] = var3.method1688(20402);
        }
        for (int var12 = 0; var12 < this.field3830; var12++) {
            this.field3816[this.field3817[var12]] = var3.method1688(20402);
        }
        for (int var13 = 0; var13 < this.field3830; var13++) {
            this.field3831[this.field3817[var13]] = var3.method1729(class125.method786(arg0, 37961));
        }
        for (int var14 = 0; var14 < this.field3830; var14++) {
            int var21 = this.field3817[var14];
            int var22 = this.field3831[var21];
            int var23 = 0;
            int var24 = -1;
            this.field3818[var21] = new int[var22];
            for (int var25 = 0; var25 < var22; var25++) {
                int var26 = this.field3818[var21][var25] = var23 += var3.method1729(65280);
                if (var24 < var26) {
                    var24 = var26;
                }
            }
            this.field3824[var21] = var24 + 1;
            if (var24 + 1 == var22) {
                this.field3818[var21] = null;
            }
        }
        if (var5 != 0) {
            this.field3815 = new int[var7 + 1][];
            this.field3828 = new class403[var7 + 1];
            for (int var15 = 0; var15 < this.field3830; var15++) {
                int var16 = this.field3817[var15];
                int var17 = this.field3831[var16];
                this.field3815[var16] = new int[this.field3824[var16]];
                for (int var18 = 0; var18 < this.field3824[var16]; var18++) {
                    this.field3815[var16][var18] = -1;
                }
                for (int var19 = 0; var19 < var17; var19++) {
                    int var20;
                    if (this.field3818[var16] == null) {
                        var20 = var19;
                    } else {
                        var20 = this.field3818[var16][var19];
                    }
                    this.field3815[var16][var20] = var3.method1688(20402);
                }
                this.field3828[var16] = new class403(this.field3815[var16]);
            }
        }
        if (arg0 != 27465) {
            this.field3815 = null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Z)V")
    public static void method1619(boolean arg0) {
        field3820 = null;
        if (arg0) {
            field3826 = null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "([BI)V")
    public class261(byte[] arg0, int arg1) {
        this.field3827 = class66.method401(-65, arg0, arg0.length);
        if (this.field3827 != arg1) {
            throw new RuntimeException();
        }
        this.method1618(27465, arg0);
    }
}
