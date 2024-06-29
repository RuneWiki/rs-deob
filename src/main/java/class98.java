import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class98 {

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "I")
    public int field1673;

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "[I")
    public static int[] field1679 = new int[256];

    @OriginalMember(owner = "client!pj", name = "s", descriptor = "Lbg;")
    public static class160 field1689 = new class160();

    @OriginalMember(owner = "client!pj", name = "t", descriptor = "I")
    public static int field1690 = 0;

    @OriginalMember(owner = "client!pj", name = "y", descriptor = "Ljava/lang/String;")
    public static String field1695 = "red:";

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "I")
    public static int field1672;

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "I")
    public static int field1678;

    @OriginalMember(owner = "client!pj", name = "p", descriptor = "I")
    public int field1686;

    @OriginalMember(owner = "client!pj", name = "q", descriptor = "I")
    public int field1687;

    @OriginalMember(owner = "client!pj", name = "r", descriptor = "I")
    public static int field1688;

    @OriginalMember(owner = "client!pj", name = "v", descriptor = "I")
    public static int field1692;

    @OriginalMember(owner = "client!pj", name = "x", descriptor = "I")
    public int field1694;

    @OriginalMember(owner = "client!pj", name = "w", descriptor = "Lvh;")
    public static class108 field1693;

    @OriginalMember(owner = "client!pj", name = "m", descriptor = "Lwa;")
    public class277 field1683;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "[I")
    public int[] field1671;

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "[I")
    public int[] field1675;

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "[I")
    public int[] field1676;

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "[I")
    public int[] field1677;

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "[I")
    public int[] field1680;

    @OriginalMember(owner = "client!pj", name = "n", descriptor = "[I")
    public int[] field1684;

    @OriginalMember(owner = "client!pj", name = "o", descriptor = "[Lwa;")
    public class277[] field1685;

    @OriginalMember(owner = "client!pj", name = "u", descriptor = "[Lcj;")
    public static class74[] field1691;

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "[[I")
    public int[][] field1681;

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "[[I")
    public int[][] field1682;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(III)Lvj;")
    public static final class173 method617(int arg0, int arg1, int arg2) {
        class109 var3 = class79.field1367[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field1968; var4++) {
            class173 var5 = var3.field1961[var4];
            if ((var5.field2850 >> 29 & 0x3L) == 2L && var5.field2840 == arg1 && var5.field2839 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)V")
    public static void method618(byte arg0) {
        field1693 = null;
        field1695 = null;
        if (arg0 != -14) {
            method617(-48, -18, -88);
        }
        field1679 = null;
        field1691 = null;
        field1689 = null;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method619(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1672++;
        if (arg5 != 1) {
            method619(84, 18, -51, -53, 113, 104, -55, 69);
        }
        if (arg0 == arg4) {
            class229.method1536(arg6, -12403, arg2, arg4, arg1, arg3, arg7);
        } else if (class126.field2222 <= arg7 - arg4 && (arg4 + arg7) <= class118.field2098 && (arg1 - arg0) >= class118.field2094 && (arg1 + arg0) <= class89.field1582) {
            class103.method701(arg0, arg1, 122, arg6, arg4, arg3, arg2, arg7);
        } else {
            class157.method1077(arg1, arg6, arg7, arg0, (byte) 105, arg3, arg4, arg2);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "([BI)V")
    private final void method620(byte[] arg0, int arg1) {
        field1678++;
        class101 var3 = new class101(class272.method1785(arg0, -72));
        int var4 = var3.method669((byte) 36);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 < 6) {
            this.field1694 = 0;
        } else {
            this.field1694 = var3.method655((byte) 91);
        }
        int var5 = var3.method669((byte) 36);
        this.field1686 = var3.method677(false);
        this.field1680 = new int[this.field1686];
        int var6 = 0;
        int var7 = -1;
        for (int var8 = 0; var8 < this.field1686; var8++) {
            this.field1680[var8] = var6 += var3.method677(false);
            if (this.field1680[var8] > var7) {
                var7 = this.field1680[var8];
            }
        }
        this.field1687 = var7 + 1;
        this.field1684 = new int[this.field1687];
        this.field1671 = new int[this.field1687];
        this.field1677 = new int[this.field1687];
        this.field1682 = new int[this.field1687][];
        this.field1676 = new int[this.field1687];
        if (var5 != 0) {
            this.field1675 = new int[this.field1687];
            for (int var9 = 0; var9 < this.field1687; var9++) {
                this.field1675[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field1686; var10++) {
                this.field1675[this.field1680[var10]] = var3.method655((byte) 124);
            }
            this.field1683 = new class277(this.field1675);
        }
        if (arg1 != 30046) {
            this.method620((byte[]) null, 47);
        }
        for (int var11 = 0; var11 < this.field1686; var11++) {
            this.field1684[this.field1680[var11]] = var3.method655((byte) 70);
        }
        for (int var12 = 0; var12 < this.field1686; var12++) {
            this.field1676[this.field1680[var12]] = var3.method655((byte) 42);
        }
        for (int var13 = 0; var13 < this.field1686; var13++) {
            this.field1671[this.field1680[var13]] = var3.method677(false);
        }
        for (int var14 = 0; var14 < this.field1686; var14++) {
            int var21 = 0;
            int var22 = this.field1680[var14];
            int var23 = -1;
            int var24 = this.field1671[var22];
            this.field1682[var22] = new int[var24];
            for (int var25 = 0; var25 < var24; var25++) {
                int var26 = this.field1682[var22][var25] = var21 += var3.method677(false);
                if (var23 < var26) {
                    var23 = var26;
                }
            }
            this.field1677[var22] = var23 + 1;
            if ((var23 + 1) == var24) {
                this.field1682[var22] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field1685 = new class277[var7 + 1];
        this.field1681 = new int[var7 + 1][];
        for (int var15 = 0; var15 < this.field1686; var15++) {
            int var16 = this.field1680[var15];
            int var17 = this.field1671[var16];
            this.field1681[var16] = new int[this.field1677[var16]];
            for (int var18 = 0; var18 < this.field1677[var16]; var18++) {
                this.field1681[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                int var20;
                if (this.field1682[var16] == null) {
                    var20 = var19;
                } else {
                    var20 = this.field1682[var16][var19];
                }
                this.field1681[var16][var20] = var3.method655((byte) 81);
            }
            this.field1685[var16] = new class277(this.field1681[var16]);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IZ)V")
    public static final void method621(int arg0, boolean arg1) {
        field1688++;
        if (arg0 == 256 && class107.field1912 != arg1) {
            class107.field1912 = arg1;
            class176.method1169(false);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIII)V")
    public static final void method622(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != -1) {
            return;
        }
        field1674++;
        if (arg2 >= class126.field2222 && arg2 <= class118.field2098) {
            int var5 = class160.method1090(arg0, (byte) 16, class89.field1582, class118.field2094);
            int var6 = class160.method1090(arg3, (byte) 16, class89.field1582, class118.field2094);
            class114.method798(arg2, var6, arg4, var5, (byte) -96);
        }
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "([BI)V")
    public class98(byte[] arg0, int arg1) {
        this.field1673 = class158.method1085(arg0, 20484, arg0.length);
        if (this.field1673 != arg1) {
            throw new RuntimeException();
        }
        this.method620(arg0, 30046);
    }
}
