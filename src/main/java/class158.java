import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class158 {

    @OriginalMember(owner = "client!hq", name = "l", descriptor = "I")
    public int field1745;

    @OriginalMember(owner = "client!hq", name = "j", descriptor = "[B")
    private byte[] field1743;

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!hq", name = "d", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!hq", name = "h", descriptor = "I")
    public int field1741;

    @OriginalMember(owner = "client!hq", name = "i", descriptor = "I")
    public static int field1742;

    @OriginalMember(owner = "client!hq", name = "k", descriptor = "I")
    public int field1744;

    @OriginalMember(owner = "client!hq", name = "o", descriptor = "I")
    public int field1748;

    @OriginalMember(owner = "client!hq", name = "s", descriptor = "I")
    public static int field1752;

    @OriginalMember(owner = "client!hq", name = "t", descriptor = "I")
    public static int field1753;

    @OriginalMember(owner = "client!hq", name = "v", descriptor = "I")
    public static int field1755;

    @OriginalMember(owner = "client!hq", name = "g", descriptor = "Lsl;")
    public class457 field1740;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "Ljava/lang/String;")
    public static String field1734;

    @OriginalMember(owner = "client!hq", name = "c", descriptor = "[I")
    public int[] field1736;

    @OriginalMember(owner = "client!hq", name = "f", descriptor = "[I")
    public int[] field1739;

    @OriginalMember(owner = "client!hq", name = "q", descriptor = "[I")
    public int[] field1750;

    @OriginalMember(owner = "client!hq", name = "r", descriptor = "[I")
    public int[] field1751;

    @OriginalMember(owner = "client!hq", name = "u", descriptor = "[I")
    public int[] field1754;

    @OriginalMember(owner = "client!hq", name = "w", descriptor = "[I")
    public int[] field1756;

    @OriginalMember(owner = "client!hq", name = "e", descriptor = "[Lsl;")
    public class457[] field1738;

    @OriginalMember(owner = "client!hq", name = "p", descriptor = "[[B")
    public byte[][] field1749;

    @OriginalMember(owner = "client!hq", name = "m", descriptor = "[[I")
    public int[][] field1746;

    @OriginalMember(owner = "client!hq", name = "n", descriptor = "[[I")
    public int[][] field1747;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(I)V", line = 10)
    public static void method973(int arg0) {
        field1734 = null;
        if (arg0 != -6) {
            field1734 = null;
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(I[B)V", line = 25)
    private final void method974(int arg0, byte[] arg1) {
        field1752++;
        class244 var3 = new class244(class325.method1938((byte) 87, arg1));
        int var4 = var3.method1423(-45);
        if (var4 < 5 || var4 > 6) {
            throw new RuntimeException();
        }
        if (var4 < 6) {
            this.field1741 = 0;
        } else {
            this.field1741 = var3.method1438(109);
        }
        int var5 = var3.method1423(-74);
        boolean var6 = (var5 & 0x1) != 0;
        this.field1744 = var3.method1476(81);
        boolean var7 = (var5 & 0x2) != 0;
        int var8 = 0;
        this.field1754 = new int[this.field1744];
        int var9 = -1;
        for (int var10 = 0; var10 < this.field1744; var10++) {
            this.field1754[var10] = var8 += var3.method1476(43);
            if (this.field1754[var10] > var9) {
                var9 = this.field1754[var10];
            }
        }
        this.field1748 = var9 + 1;
        if (var7) {
            this.field1749 = new byte[this.field1748][];
        }
        this.field1747 = new int[this.field1748][];
        this.field1756 = new int[this.field1748];
        this.field1736 = new int[this.field1748];
        this.field1750 = new int[this.field1748];
        this.field1739 = new int[this.field1748];
        if (var6) {
            this.field1751 = new int[this.field1748];
            for (int var11 = 0; var11 < this.field1748; var11++) {
                this.field1751[var11] = -1;
            }
            for (int var12 = 0; var12 < this.field1744; var12++) {
                this.field1751[this.field1754[var12]] = var3.method1438(95);
            }
            this.field1740 = new class457(this.field1751);
        }
        for (int var13 = 0; var13 < this.field1744; var13++) {
            this.field1750[this.field1754[var13]] = var3.method1438(109);
        }
        if (var7) {
            for (int var14 = 0; var14 < this.field1744; var14++) {
                byte[] var15 = new byte[64];
                var3.method1461(824, 0, var15, 64);
                this.field1749[this.field1754[var14]] = var15;
            }
        }
        for (int var16 = 0; var16 < this.field1744; var16++) {
            this.field1739[this.field1754[var16]] = var3.method1438(124);
        }
        for (int var17 = 0; var17 < this.field1744; var17++) {
            this.field1736[this.field1754[var17]] = var3.method1476(95);
        }
        int var18 = 0;
        if (arg0 > -61) {
            this.field1746 = null;
        }
        while (var18 < this.field1744) {
            int var25 = this.field1754[var18];
            int var26 = 0;
            int var27 = this.field1736[var25];
            this.field1747[var25] = new int[var27];
            int var28 = -1;
            for (int var29 = 0; var29 < var27; var29++) {
                int var30 = this.field1747[var25][var29] = var26 += var3.method1476(-91);
                if (var28 < var30) {
                    var28 = var30;
                }
            }
            this.field1756[var25] = var28 + 1;
            if ((var28 + 1) == var27) {
                this.field1747[var25] = null;
            }
            var18++;
        }
        if (!var6) {
            return;
        }
        this.field1746 = new int[var9 + 1][];
        this.field1738 = new class457[var9 + 1];
        for (int var19 = 0; var19 < this.field1744; var19++) {
            int var20 = this.field1754[var19];
            int var21 = this.field1736[var20];
            this.field1746[var20] = new int[this.field1756[var20]];
            for (int var22 = 0; var22 < this.field1756[var20]; var22++) {
                this.field1746[var20][var22] = -1;
            }
            for (int var23 = 0; var23 < var21; var23++) {
                int var24;
                if (this.field1747[var20] == null) {
                    var24 = var23;
                } else {
                    var24 = this.field1747[var20][var23];
                }
                this.field1746[var20][var24] = var3.method1438(91);
            }
            this.field1738[var20] = new class457(this.field1746[var20]);
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(I[Ljava/lang/Object;[J)V", line = 227)
    public static final void method975(int arg0, Object[] arg1, long[] arg2) {
        class734.method4089(arg2, 43, 0, arg2.length + arg0, arg1);
        field1737++;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lbda;IB)V", line = 235)
    public static final void method976(class504 arg0, int arg1, byte arg2) {
        if (arg2 > -39) {
            method977(null, 51);
        }
        field1755++;
        if (arg0.field7152 == null) {
            return;
        }
        int var3 = arg0.field7152[arg1 + 1];
        if (arg0.field7145 == var3) {
            return;
        }
        arg0.field7089 = 0;
        arg0.field7161 = 0;
        arg0.field7145 = var3;
        arg0.field7115 = 0;
        arg0.field7074 = 1;
        arg0.field7188 = arg0.field7184;
        if (arg0.field7145 != -1) {
            class629.method3607(arg0, class637.field9158.method1905(80, arg0.field7145), -120, arg0.field7089);
            return;
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "([BI)[B", line = 267)
    public static final byte[] method977(byte[] arg0, int arg1) {
        field1742++;
        int var2 = arg0.length;
        if (arg1 >= -50) {
            method979(null, 92, 84, 112, null);
        }
        byte[] var3 = new byte[var2];
        class143.method894(arg0, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "(I)Lqd;", line = 283)
    public static final class447 method978(int arg0) {
        if (arg0 >= -59) {
            field1734 = null;
        }
        field1753++;
        try {
            return (class447) Class.forName("no").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lr;III[Z)V", line = 301)
    public static final void method979(class182 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class504.field7120 == class159.field1758) {
            return;
        }
        int var5 = class11.field88[arg1].method1675(arg3, arg2, 65286);
        for (int var6 = 0; var6 <= arg1; var6++) {
            if (arg4 == null || arg4[var6]) {
                class278 var7 = class11.field88[var6];
                if (var7 != null) {
                    var7.method1663(arg0, arg2, var5 - var7.method1675(arg3, arg2, 65286), arg3, 0, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hq", name = "<init>", descriptor = "([BI[B)V", line = 335)
    public class158(byte[] arg0, int arg1, byte[] arg2) {
        this.field1745 = class743.method4137(arg0, arg0.length, true);
        if (this.field1745 != arg1) {
            throw new RuntimeException();
        }
        if (arg2 != null) {
            if (arg2.length != 64) {
                throw new RuntimeException();
            }
            this.field1743 = class327.method1954(0, arg0.length, arg0, 802);
            for (int var4 = 0; var4 < 64; var4++) {
                if (this.field1743[var4] != arg2[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.method974(-104, arg0);
    }
}
