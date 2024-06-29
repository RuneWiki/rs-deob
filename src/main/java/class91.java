import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class91 {

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "I")
    private int field1685;

    @OriginalMember(owner = "client!cf", name = "s", descriptor = "I")
    public static int field1687 = 0;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "I")
    public static int field1672;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "I")
    public int field1674;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "I")
    public int field1675;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "I")
    public static int field1678;

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "I")
    public static int field1682;

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "I")
    public int field1684;

    @OriginalMember(owner = "client!cf", name = "r", descriptor = "I")
    public static int field1686;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "Lng;")
    public class74 field1676;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "[I")
    public int[] field1669;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "[I")
    public int[] field1673;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "[I")
    public int[] field1677;

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "[I")
    public int[] field1679;

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "[I")
    public int[] field1680;

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "[I")
    public int[] field1681;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "[Lng;")
    public class74[] field1670;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "[[I")
    public int[][] field1671;

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "[[I")
    public int[][] field1683;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(BI)V")
    public static final void method663(byte arg0, int arg1) {
        class150.field2537 = -1;
        class150.field2537 = -1;
        if (arg1 == 37) {
            class11.field165 = 3.0F;
        } else if (arg1 == 50) {
            class11.field165 = 4.0F;
        } else if (arg1 == 75) {
            class11.field165 = 6.0F;
        } else {
            class11.field165 = 8.0F;
        }
        field1678++;
        if (arg0 > -75) {
            field1687 = -29;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "([BZ)V")
    private final void method664(byte[] arg0, boolean arg1) {
        field1686++;
        class247 var3 = new class247(class273.method1860(arg0, false));
        int var4 = var3.method1711((byte) -67);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 < 6) {
            this.field1674 = 0;
        } else {
            this.field1674 = var3.method1712(6357);
        }
        int var5 = var3.method1711((byte) -67);
        this.field1684 = var3.method1694((byte) -100);
        int var6 = 0;
        this.field1677 = new int[this.field1684];
        int var7 = -1;
        for (int var8 = 0; var8 < this.field1684; var8++) {
            this.field1677[var8] = var6 += var3.method1694((byte) -100);
            if (var7 < this.field1677[var8]) {
                var7 = this.field1677[var8];
            }
        }
        this.field1675 = var7 + 1;
        this.field1681 = new int[this.field1675];
        this.field1673 = new int[this.field1675];
        this.field1669 = new int[this.field1675];
        this.field1679 = new int[this.field1675];
        this.field1683 = new int[this.field1675][];
        if (var5 != 0) {
            this.field1680 = new int[this.field1675];
            for (int var9 = 0; var9 < this.field1675; var9++) {
                this.field1680[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field1684; var10++) {
                this.field1680[this.field1677[var10]] = var3.method1712(6357);
            }
            this.field1676 = new class74(this.field1680);
        }
        for (int var11 = 0; var11 < this.field1684; var11++) {
            this.field1681[this.field1677[var11]] = var3.method1712(6357);
        }
        int var12 = 0;
        if (!arg1) {
            method666(114, 5);
        }
        while (this.field1684 > var12) {
            this.field1669[this.field1677[var12]] = var3.method1712(6357);
            var12++;
        }
        for (int var13 = 0; var13 < this.field1684; var13++) {
            this.field1673[this.field1677[var13]] = var3.method1694((byte) -100);
        }
        for (int var14 = 0; var14 < this.field1684; var14++) {
            int var21 = 0;
            int var22 = this.field1677[var14];
            int var23 = this.field1673[var22];
            this.field1683[var22] = new int[var23];
            int var24 = -1;
            for (int var25 = 0; var25 < var23; var25++) {
                int var26 = this.field1683[var22][var25] = var21 += var3.method1694((byte) -100);
                if (var26 > var24) {
                    var24 = var26;
                }
            }
            this.field1679[var22] = var24 + 1;
            if ((var24 + 1) == var23) {
                this.field1683[var22] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field1670 = new class74[var7 + 1];
        this.field1671 = new int[var7 + 1][];
        for (int var15 = 0; var15 < this.field1684; var15++) {
            int var16 = this.field1677[var15];
            int var17 = this.field1673[var16];
            this.field1671[var16] = new int[this.field1679[var16]];
            for (int var18 = 0; var18 < this.field1679[var16]; var18++) {
                this.field1671[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                int var20;
                if (this.field1683[var16] == null) {
                    var20 = var19;
                } else {
                    var20 = this.field1683[var16][var19];
                }
                this.field1671[var16][var20] = var3.method1712(6357);
            }
            this.field1670[var16] = new class74(this.field1671[var16]);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V")
    public static final void method665(byte arg0) {
        class178.field3039.method1262(17244);
        field1682++;
        int var1 = -128 / ((arg0 + 9) / 59);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)Ljd;")
    public static final class85 method666(int arg0, int arg1) {
        field1672++;
        if (arg0 < 100000) {
            return class172.method1150(new class85[] { class154.field2660, class68.method451(arg0, -12572), class171.field2957 }, arg1 + 7898);
        } else if (arg0 < 10000000) {
            return class172.method1150(new class85[] { class11.field173, class68.method451(arg0 / 1000, -12572), class105.field1847, class171.field2957 }, 0);
        } else {
            if (arg1 != -7898) {
                field1687 = 2;
            }
            return class172.method1150(new class85[] { class189.field3244, class68.method451(arg0 / 1000000, -12572), class187.field3220, class171.field2957 }, 0);
        }
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "([BI)V")
    public class91(byte[] arg0, int arg1) {
        this.field1685 = class222.method1507(arg0.length, arg0, -17901);
        if (this.field1685 != arg1) {
            throw new RuntimeException();
        }
        this.method664(arg0, true);
    }
}
