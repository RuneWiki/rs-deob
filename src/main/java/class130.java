import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!baa")
public class class130 {

    @OriginalMember(owner = "client!baa", name = "p", descriptor = "I")
    private int field1821 = 0;

    @OriginalMember(owner = "client!baa", name = "o", descriptor = "[Lno;")
    public class71[] field1820;

    @OriginalMember(owner = "client!baa", name = "j", descriptor = "I")
    public int field1815;

    @OriginalMember(owner = "client!baa", name = "l", descriptor = "I")
    public static int field1817 = -1;

    @OriginalMember(owner = "client!baa", name = "b", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!baa", name = "c", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!baa", name = "e", descriptor = "I")
    public static int field1810;

    @OriginalMember(owner = "client!baa", name = "f", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!baa", name = "g", descriptor = "I")
    public static int field1812;

    @OriginalMember(owner = "client!baa", name = "h", descriptor = "I")
    public static int field1813;

    @OriginalMember(owner = "client!baa", name = "i", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!baa", name = "k", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!baa", name = "m", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!baa", name = "n", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!baa", name = "r", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "J")
    private long field1806;

    @OriginalMember(owner = "client!baa", name = "d", descriptor = "Lno;")
    private class71 field1809;

    @OriginalMember(owner = "client!baa", name = "q", descriptor = "Lno;")
    private class71 field1822;

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(IJ)Lno;")
    public final class71 method812(int arg0, long arg1) {
        field1812++;
        if (arg0 <= 101) {
            this.method818(-36);
        }
        this.field1806 = arg1;
        class71 var4 = this.field1820[(int) (arg1 & (long) (this.field1815 - 1))];
        for (this.field1809 = var4.field1077; this.field1809 != var4; this.field1809 = this.field1809.field1077) {
            if (this.field1809.field1079 == arg1) {
                class71 var5 = this.field1809;
                this.field1809 = this.field1809.field1077;
                return var5;
            }
        }
        this.field1809 = null;
        return null;
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(IILha;ZII)V")
    public static final void method813(int arg0, int arg1, class548 arg2, boolean arg3, int arg4, int arg5) {
        arg2.method1544(arg5, arg1, arg4 + arg5, arg1 - -arg0);
        field1813++;
        arg2.method3249(arg5, 124, arg0, arg4, -16777216, arg1);
        if (class537.field7447 < 100) {
            return;
        }
        float var6 = (float) class461.field6413 / (float) class461.field6404;
        int var7 = arg4;
        int var8 = arg0;
        if ((var6 < 1.0F)) {
            var8 = (int) ((float) arg4 * var6);
        } else {
            var7 = (int) ((float) arg0 / var6);
        }
        int var9 = (arg4 - var7) / 2 + arg5;
        int var10 = (arg0 - var8) / 2 + arg1;
        if (class548.field7626 == null || class548.field7626.method1955() != arg4 || class548.field7626.method1952() != arg0) {
            class461.method2825(class461.field6400, class461.field6413 + class461.field6408, class461.field6404 + class461.field6400, class461.field6408, var9, var10, var7 + var9, var8 + var10);
            class461.method2812(arg2);
            class548.field7626 = arg2.method1514(var9, var10, var7, var8, false);
        }
        if (arg3) {
            method822((byte) 14);
        }
        class548.field7626.method1970(var9, var10);
        int var11 = class534.field7407 * var7 / class461.field6404;
        int var12 = class263.field3855 * var8 / class461.field6413;
        int var13 = class654.field8747 * var7 / class461.field6404 + var9;
        int var14 = var8 + var10 - var12 - (class750.field10325 * var8 / class461.field6413);
        int var15 = -1996554240;
        if (class712.field9955 == class289.field4140) {
            var15 = -1996488705;
        }
        arg2.method1412(var13, var14, var11, var12, var15, 1);
        arg2.method1534(var13, var14, var11, var12, var15, 0);
        if (class224.field3017 <= 0) {
            return;
        }
        int var16;
        if (class659.field8770 <= 50) {
            var16 = class659.field8770 * 5;
        } else {
            var16 = 500 - (class659.field8770 * 5);
        }
        for (class717 var17 = (class717) class461.field6394.method3618(82); var17 != null; var17 = (class717) class461.field6394.method3619(0)) {
            class21 var18 = class461.field6385.method11(32, var17.field9990);
            if (class332.method2125(var18, true)) {
                if (class505.field7031 == var17.field9990) {
                    int var21 = var17.field9989 * var7 / class461.field6404 + var9;
                    int var22 = var10 + ((class461.field6413 - var17.field9985) * var8 / class461.field6413);
                    arg2.method3249(var21 - 2, -112, 4, 4, var16 << 24 | 0xFFFF00, var22 - 2);
                } else if (class293.field4201 != -1 && class293.field4201 == var18.field235) {
                    int var19 = var17.field9989 * var7 / class461.field6404 + var9;
                    int var20 = var10 + ((class461.field6413 - var17.field9985) * var8 / class461.field6413);
                    arg2.method3249(var19 - 2, 47, 4, 4, var16 << 24 | 0xFFFF00, var20 - 2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(B)I")
    public final int method814(byte arg0) {
        if (arg0 != -84) {
            this.field1815 = 119;
        }
        field1807++;
        return this.field1815;
    }

    @OriginalMember(owner = "client!baa", name = "b", descriptor = "(B)Lno;")
    public final class71 method815(byte arg0) {
        field1808++;
        if (this.field1809 == null) {
            return null;
        }
        int var2 = 33 % ((arg0 + 50) / 46);
        class71 var3 = this.field1820[(int) (this.field1806 & (long) (this.field1815 - 1))];
        while (this.field1809 != var3) {
            if (this.field1809.field1079 == this.field1806) {
                class71 var4 = this.field1809;
                this.field1809 = this.field1809.field1077;
                return var4;
            }
            this.field1809 = this.field1809.field1077;
        }
        this.field1809 = null;
        return null;
    }

    @OriginalMember(owner = "client!baa", name = "c", descriptor = "(B)I")
    public final int method816(byte arg0) {
        field1816++;
        int var2 = 0;
        if (arg0 != -36) {
            this.field1815 = 7;
        }
        for (int var3 = 0; var3 < this.field1815; var3++) {
            class71 var4 = this.field1820[var3];
            class71 var5 = var4.field1077;
            while (var4 != var5) {
                var5 = var5.field1077;
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(B[Lno;)I")
    public final int method817(byte arg0, class71[] arg1) {
        field1818++;
        int var3 = 0;
        if (arg0 != -79) {
            this.method818(11);
        }
        for (int var4 = 0; var4 < this.field1815; var4++) {
            class71 var5 = this.field1820[var4];
            for (class71 var6 = var5.field1077; var6 != var5; var6 = var6.field1077) {
                arg1[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(I)Lno;")
    public final class71 method818(int arg0) {
        field1823++;
        if (arg0 <= 27) {
            return null;
        } else if (this.field1821 <= 0 || this.field1820[this.field1821 - 1] == this.field1822) {
            while (this.field1815 > this.field1821) {
                class71 var3 = this.field1820[this.field1821++].field1077;
                if (this.field1820[this.field1821 - 1] != var3) {
                    this.field1822 = var3.field1077;
                    return var3;
                }
            }
            return null;
        } else {
            class71 var2 = this.field1822;
            this.field1822 = var2.field1077;
            return var2;
        }
    }

    @OriginalMember(owner = "client!baa", name = "b", descriptor = "(I)V")
    public final void method819(int arg0) {
        field1810++;
        int var2 = 0;
        if (arg0 != 23738) {
            this.method817((byte) -5, null);
        }
        while (var2 < this.field1815) {
            class71 var3 = this.field1820[var2];
            while (true) {
                class71 var4 = var3.field1077;
                if (var3 == var4) {
                    var2++;
                    break;
                }
                var4.method549(6410);
            }
        }
        this.field1822 = null;
        this.field1809 = null;
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(JBLno;)V")
    public final void method820(long arg0, byte arg1, class71 arg2) {
        if (arg1 != -42) {
            this.method815((byte) -118);
        }
        field1814++;
        if (arg2.field1075 != null) {
            arg2.method549(6410);
        }
        class71 var5 = this.field1820[(int) (arg0 & (long) (this.field1815 - 1))];
        arg2.field1077 = var5;
        arg2.field1075 = var5.field1075;
        arg2.field1075.field1077 = arg2;
        arg2.field1077.field1075 = arg2;
        arg2.field1079 = arg0;
    }

    @OriginalMember(owner = "client!baa", name = "<init>", descriptor = "(I)V")
    public class130(int arg0) {
        this.field1820 = new class71[arg0];
        this.field1815 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class71 var3 = this.field1820[var2] = new class71();
            var3.field1077 = var3;
            var3.field1075 = var3;
        }
    }

    @OriginalMember(owner = "client!baa", name = "d", descriptor = "(B)Lno;")
    public final class71 method821(byte arg0) {
        if (arg0 <= 108) {
            this.method819(43);
        }
        this.field1821 = 0;
        field1811++;
        return this.method818(96);
    }

    @OriginalMember(owner = "client!baa", name = "e", descriptor = "(B)[Lww;")
    public static final class288[] method822(byte arg0) {
        field1819++;
        int var1 = 49 / ((3 - arg0) / 56);
        return new class288[] { class731.field10160, class498.field6963, class220.field2975, class63.field991, class757.field10565, class550.field7651, class687.field9560, class588.field8005, class318.field4422, class548.field7624 };
    }
}
