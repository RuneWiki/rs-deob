import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public class class150 implements class172 {

    @OriginalMember(owner = "client!or", name = "l", descriptor = "Lih;")
    private class108 field1748 = new class108(256);

    @OriginalMember(owner = "client!or", name = "q", descriptor = "Lwo;")
    private class285 field1753;

    @OriginalMember(owner = "client!or", name = "u", descriptor = "Lwo;")
    private class285 field1757;

    @OriginalMember(owner = "client!or", name = "w", descriptor = "[Loj;")
    private class358[] field1759;

    @OriginalMember(owner = "client!or", name = "k", descriptor = "[I")
    public static int[] field1747 = new int[4096];

    @OriginalMember(owner = "client!or", name = "a", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!or", name = "c", descriptor = "I")
    public static int field1739;

    @OriginalMember(owner = "client!or", name = "d", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!or", name = "e", descriptor = "I")
    public static int field1741;

    @OriginalMember(owner = "client!or", name = "f", descriptor = "I")
    public static int field1742;

    @OriginalMember(owner = "client!or", name = "g", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!or", name = "h", descriptor = "I")
    public static int field1744;

    @OriginalMember(owner = "client!or", name = "i", descriptor = "I")
    public static int field1745;

    @OriginalMember(owner = "client!or", name = "j", descriptor = "I")
    public static int field1746;

    @OriginalMember(owner = "client!or", name = "m", descriptor = "I")
    public static int field1749;

    @OriginalMember(owner = "client!or", name = "n", descriptor = "I")
    public static int field1750;

    @OriginalMember(owner = "client!or", name = "o", descriptor = "I")
    public static int field1751;

    @OriginalMember(owner = "client!or", name = "p", descriptor = "I")
    public static int field1752;

    @OriginalMember(owner = "client!or", name = "r", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!or", name = "s", descriptor = "I")
    public static int field1755;

    @OriginalMember(owner = "client!or", name = "v", descriptor = "I")
    public static int field1758;

    @OriginalMember(owner = "client!or", name = "x", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!or", name = "b", descriptor = "Lwo;")
    public static class285 field1738;

    @OriginalMember(owner = "client!or", name = "t", descriptor = "[Lc;")
    public static class436[] field1756;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(I)Lal;")
    public static final class195 method957(int arg0) {
        field1758++;
        if (arg0 != -15039) {
            field1747 = null;
        }
        return class224.field2802;
    }

    @OriginalMember(owner = "client!or", name = "b", descriptor = "(I)V")
    public static void method958(int arg0) {
        field1756 = null;
        if (arg0 <= 8) {
            method961(-84);
        }
        field1747 = null;
        field1738 = null;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(IIZ)I")
    public static final int method959(int arg0, int arg1, boolean arg2) {
        field1750++;
        if (arg2) {
            return 0;
        }
        class391 var3 = class70.method415(Integer.MIN_VALUE, arg1, arg2);
        if (var3 == null) {
            return class176.method1104(arg1, true).field572;
        }
        int var4 = 0;
        for (int var5 = 0; var5 < var3.field5330.length; var5++) {
            if (var3.field5330[var5] == -1) {
                var4++;
            }
        }
        int var6 = 79 % ((72 - arg0) / 50);
        return var4 + class176.method1104(arg1, true).field572 - var3.field5330.length;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(IB)Loj;")
    public final class358 method960(int arg0, byte arg1) {
        field1740++;
        return arg1 == -40 ? this.field1759[arg0] : null;
    }

    @OriginalMember(owner = "client!or", name = "c", descriptor = "(I)V")
    public static final void method961(int arg0) {
        class229.field2909 = 0;
        field1754++;
        int var1 = (class143.field1684.field1516 >> 7) + class278.field3608;
        int var2 = (class143.field1684.field1514 >> 7) + class129.field1432;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class229.field2909 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class229.field2909 = 1;
        }
        if (class229.field2909 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class229.field2909 = 0;
        }
        if (arg0 != -13206) {
            field1747 = null;
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(II)V")
    public static final void method962(int arg0, int arg1) {
        class365 var2 = class57.field654;
        synchronized (class57.field654) {
            if (arg1 != -2) {
                method970(false, 110);
            }
            class57.field654.method2286(arg0, (byte) 36);
        }
        field1737++;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(IZ)Z")
    public final boolean method963(int arg0, boolean arg1) {
        if (!arg1) {
            field1747 = null;
        }
        field1742++;
        class146 var3 = this.method968((byte) 120, arg0);
        return var3 != null && var3.method943(111, this, this.field1757);
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(IIIFIZ)[I")
    public final int[] method964(int arg0, int arg1, int arg2, float arg3, int arg4, boolean arg5) {
        field1739++;
        return arg2 == -22968 ? this.method968((byte) 114, arg0).method949((double) arg3, arg4, this, this.field1757, 29280, arg1, this.field1759[arg0].field4849) : null;
    }

    @OriginalMember(owner = "client!or", name = "b", descriptor = "(IIIFIZ)[I")
    public final int[] method965(int arg0, int arg1, int arg2, float arg3, int arg4, boolean arg5) {
        field1744++;
        int var7 = -45 % ((arg0 - 64) / 48);
        return this.method968((byte) 124, arg2).method948((double) arg3, arg4, arg1, this.field1759[arg2].field4849, 0, this.field1757, this, arg5);
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(IILjava/lang/String;)V")
    public static final void method966(int arg0, int arg1, String arg2) {
        field1752++;
        class12 var3 = class390.method2422(341555040, arg1, 3);
        var3.method66(-25);
        if (arg0 != 13503) {
            method958(116);
        }
        var3.field140 = arg2;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(ZIIILwo;I)V")
    public static final void method967(boolean arg0, int arg1, int arg2, int arg3, class285 arg4, int arg5) {
        class97.field1144 = arg5;
        field1746++;
        class372.field5048 = arg2;
        class139.field1590 = 1;
        class272.field3509 = 10000;
        class137.field1554 = arg0;
        class369.field5026 = arg4;
        class264.field3385 = arg3;
        if (arg1 != -3063) {
            field1738 = null;
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(BI)Loa;")
    private final class146 method968(byte arg0, int arg1) {
        field1741++;
        class179 var3 = this.field1748.method648(1, (long) arg1);
        if (var3 != null) {
            return (class146) var3;
        }
        byte[] var4 = this.field1753.method1805(arg1, true);
        if (var4 == null) {
            return null;
        } else if (arg0 < 106) {
            return null;
        } else {
            class146 var5 = new class146(new class242(var4));
            this.field1748.method643((long) arg1, var5, (byte) 122);
            return var5;
        }
    }

    @OriginalMember(owner = "client!or", name = "b", descriptor = "(II)I")
    public static final int method969(int arg0, int arg1) {
        field1745++;
        if (arg0 < 96) {
            return 0;
        } else if (arg0 < 128) {
            return 2;
        } else {
            if (arg1 < 56) {
                method957(-41);
            }
            return 3;
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(ZI)Z")
    public static final boolean method970(boolean arg0, int arg1) {
        field1755++;
        if (arg0) {
            return arg1 == 58 || arg1 == 57 || arg1 == 1010 || arg1 == 10 || arg1 == 2;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(FZIIIZ)[F")
    public final float[] method971(float arg0, boolean arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field1743++;
        return arg5 ? null : this.method968((byte) 127, arg2).method945(this.field1759[arg2].field4849, arg4, 0, this.field1757, arg3, this);
    }

    @OriginalMember(owner = "client!or", name = "<init>", descriptor = "(Lwo;Lwo;Lwo;)V")
    public class150(class285 arg0, class285 arg1, class285 arg2) {
        this.field1753 = arg1;
        this.field1757 = arg2;
        class242 var4 = new class242(arg0.method1794(5860, 0, 0));
        int var5 = var4.method1587((byte) -102);
        this.field1759 = new class358[var5];
        for (int var6 = 0; var6 < var5; var6++) {
            if (var4.method1563(-128) == 1) {
                this.field1759[var6] = new class358();
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            if (this.field1759[var7] != null) {
                this.field1759[var7].field4862 = var4.method1563(-128) == 0;
            }
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (this.field1759[var8] != null) {
                this.field1759[var8].field4854 = var4.method1563(-128) == 1;
            }
        }
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field1759[var9] != null) {
                this.field1759[var9].field4856 = var4.method1563(-128) == 1;
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            if (this.field1759[var10] != null) {
                this.field1759[var10].field4860 = var4.method1563(-128) == 1;
            }
        }
        for (int var11 = 0; var11 < var5; var11++) {
            if (this.field1759[var11] != null) {
                this.field1759[var11].field4869 = var4.method1589(false);
            }
        }
        for (int var12 = 0; var12 < var5; var12++) {
            if (this.field1759[var12] != null) {
                this.field1759[var12].field4861 = var4.method1589(false);
            }
        }
        for (int var13 = 0; var13 < var5; var13++) {
            if (this.field1759[var13] != null) {
                this.field1759[var13].field4859 = var4.method1589(false);
            }
        }
        for (int var14 = 0; var14 < var5; var14++) {
            if (this.field1759[var14] != null) {
                this.field1759[var14].field4852 = var4.method1589(false);
            }
        }
        for (int var15 = 0; var15 < var5; var15++) {
            if (this.field1759[var15] != null) {
                this.field1759[var15].field4864 = (short) var4.method1587((byte) -102);
            }
        }
        for (int var16 = 0; var16 < var5; var16++) {
            if (this.field1759[var16] != null) {
                this.field1759[var16].field4853 = var4.method1589(false);
            }
        }
        for (int var17 = 0; var17 < var5; var17++) {
            if (this.field1759[var17] != null) {
                this.field1759[var17].field4850 = var4.method1589(false);
            }
        }
        for (int var18 = 0; var18 < var5; var18++) {
            if (this.field1759[var18] != null) {
                this.field1759[var18].field4848 = var4.method1563(-128) == 1;
            }
        }
        for (int var19 = 0; var19 < var5; var19++) {
            if (this.field1759[var19] != null) {
                this.field1759[var19].field4849 = var4.method1563(-128) == 1;
            }
        }
        for (int var20 = 0; var20 < var5; var20++) {
            if (this.field1759[var20] != null) {
                this.field1759[var20].field4865 = var4.method1589(false);
            }
        }
        for (int var21 = 0; var21 < var5; var21++) {
            if (this.field1759[var21] != null) {
                this.field1759[var21].field4868 = var4.method1563(-128) == 1;
            }
        }
        for (int var22 = 0; var22 < var5; var22++) {
            if (this.field1759[var22] != null) {
                this.field1759[var22].field4857 = var4.method1563(-128) == 1;
            }
        }
        for (int var23 = 0; var23 < var5; var23++) {
            if (this.field1759[var23] != null) {
                this.field1759[var23].field4851 = var4.method1563(-128) == 1;
            }
        }
    }
}
