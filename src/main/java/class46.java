import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class46 {

    @OriginalMember(owner = "client!il", name = "k", descriptor = "I")
    public int field736;

    @OriginalMember(owner = "client!il", name = "m", descriptor = "Lli;")
    private static class185 field738 = class245.method1649("Loading textures )2 ", 124);

    @OriginalMember(owner = "client!il", name = "h", descriptor = "Lli;")
    public static class185 field733 = field738;

    @OriginalMember(owner = "client!il", name = "l", descriptor = "Lli;")
    public static class185 field737 = class245.method1649("Chargement des sprites )2 ", -82);

    @OriginalMember(owner = "client!il", name = "r", descriptor = "[I")
    public static int[] field743 = new int[50];

    @OriginalMember(owner = "client!il", name = "B", descriptor = "Lli;")
    public static class185 field753 = class245.method1649("(U(Y", -17);

    @OriginalMember(owner = "client!il", name = "g", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!il", name = "i", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!il", name = "j", descriptor = "I")
    public static int field735;

    @OriginalMember(owner = "client!il", name = "n", descriptor = "I")
    public static int field739;

    @OriginalMember(owner = "client!il", name = "o", descriptor = "I")
    public static int field740;

    @OriginalMember(owner = "client!il", name = "t", descriptor = "I")
    public int field745;

    @OriginalMember(owner = "client!il", name = "u", descriptor = "I")
    public int field746;

    @OriginalMember(owner = "client!il", name = "w", descriptor = "I")
    public static int field748;

    @OriginalMember(owner = "client!il", name = "x", descriptor = "I")
    public int field749;

    @OriginalMember(owner = "client!il", name = "A", descriptor = "I")
    public static int field752;

    @OriginalMember(owner = "client!il", name = "y", descriptor = "Lg;")
    public class133 field750;

    @OriginalMember(owner = "client!il", name = "q", descriptor = "Ltj;")
    public static class152 field742;

    @OriginalMember(owner = "client!il", name = "f", descriptor = "Lhi;")
    public static class250 field731;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "[I")
    public int[] field726;

    @OriginalMember(owner = "client!il", name = "d", descriptor = "[I")
    public int[] field729;

    @OriginalMember(owner = "client!il", name = "e", descriptor = "[I")
    public int[] field730;

    @OriginalMember(owner = "client!il", name = "p", descriptor = "[I")
    public int[] field741;

    @OriginalMember(owner = "client!il", name = "s", descriptor = "[I")
    public int[] field744;

    @OriginalMember(owner = "client!il", name = "v", descriptor = "[I")
    public int[] field747;

    @OriginalMember(owner = "client!il", name = "z", descriptor = "[Lg;")
    public class133[] field751;

    @OriginalMember(owner = "client!il", name = "b", descriptor = "[[I")
    public int[][] field727;

    @OriginalMember(owner = "client!il", name = "c", descriptor = "[[I")
    public int[][] field728;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)V")
    public static void method282(int arg0) {
        field738 = null;
        field733 = null;
        if (arg0 != 0) {
            method286(3, -39);
        }
        field731 = null;
        field737 = null;
        field743 = null;
        field753 = null;
        field742 = null;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "([BZ)V")
    private final void method283(byte[] arg0, boolean arg1) {
        field748++;
        class118 var3 = new class118(class134.method946(arg0, (byte) 10));
        int var4 = var3.method867(arg1);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        int var5 = -1;
        int var6 = 0;
        if (var4 >= 6) {
            this.field745 = var3.method875((byte) 95);
        } else {
            this.field745 = 0;
        }
        int var7 = var3.method867(arg1);
        this.field746 = var3.method827(255);
        this.field741 = new int[this.field746];
        for (int var8 = 0; var8 < this.field746; var8++) {
            this.field741[var8] = var6 += var3.method827(255);
            if (var5 < this.field741[var8]) {
                var5 = this.field741[var8];
            }
        }
        this.field749 = var5 + 1;
        this.field730 = new int[this.field749];
        this.field726 = new int[this.field749];
        this.field727 = new int[this.field749][];
        this.field744 = new int[this.field749];
        this.field747 = new int[this.field749];
        if (var7 != 0) {
            this.field729 = new int[this.field749];
            for (int var9 = 0; var9 < this.field749; var9++) {
                this.field729[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field746; var10++) {
                this.field729[this.field741[var10]] = var3.method875((byte) 99);
            }
            this.field750 = new class133(this.field729);
        }
        for (int var11 = 0; var11 < this.field746; var11++) {
            this.field730[this.field741[var11]] = var3.method875((byte) 110);
        }
        for (int var12 = 0; var12 < this.field746; var12++) {
            this.field744[this.field741[var12]] = var3.method875((byte) 121);
        }
        for (int var13 = 0; var13 < this.field746; var13++) {
            this.field726[this.field741[var13]] = var3.method827(255);
        }
        for (int var14 = 0; var14 < this.field746; var14++) {
            int var21 = 0;
            int var22 = this.field741[var14];
            int var23 = this.field726[var22];
            this.field727[var22] = new int[var23];
            int var24 = -1;
            for (int var25 = 0; var25 < var23; var25++) {
                int var26 = this.field727[var22][var25] = var21 += var3.method827(255);
                if (var24 < var26) {
                    var24 = var26;
                }
            }
            this.field747[var22] = var24 + 1;
            if ((var24 + 1) == var23) {
                this.field727[var22] = null;
            }
        }
        if (var7 == 0) {
            return;
        }
        this.field728 = new int[var5 + 1][];
        this.field751 = new class133[var5 + 1];
        for (int var15 = 0; var15 < this.field746; var15++) {
            int var16 = this.field741[var15];
            int var17 = this.field726[var16];
            this.field728[var16] = new int[this.field747[var16]];
            for (int var18 = 0; var18 < this.field747[var16]; var18++) {
                this.field728[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                int var20;
                if (this.field727[var16] == null) {
                    var20 = var19;
                } else {
                    var20 = this.field727[var16][var19];
                }
                this.field728[var16][var20] = var3.method875((byte) 105);
            }
            this.field751[var16] = new class133(this.field728[var16]);
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIIIII)I")
    public static final int method284(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field735++;
        if (arg4 != 12239) {
            field753 = null;
        }
        if ((arg0 & 0x1) == 1) {
            int var7 = arg5;
            arg5 = arg6;
            arg6 = var7;
        }
        int var8 = arg2 & 0x3;
        if (var8 == 0) {
            return arg3;
        } else if (var8 == 1) {
            return 7 + 1 - arg5 - arg1;
        } else if (var8 == 2) {
            return 1 + 7 - arg6 - arg3;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(II)V")
    public static final void method285(int arg0, int arg1) {
        field739++;
        class174 var2 = class249.method1671(4, arg1, (byte) -113);
        var2.method1234((byte) -43);
        if (arg0 != -1) {
            field737 = null;
        }
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(II)V")
    public static final void method286(int arg0, int arg1) {
        field752++;
        class174 var2 = class249.method1671(3, arg0, (byte) -116);
        if (arg1 != 0) {
            field732 = 85;
        }
        var2.method1234((byte) -85);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Z)V")
    public static final void method287(boolean arg0) {
        if (arg0) {
            field738 = null;
        }
        field740++;
        class212.field3868.method86(0);
        class27.field458.method86(0);
        class26.field435.method86(0);
        class106.field1903.method86(0);
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "([BI)V")
    public class46(byte[] arg0, int arg1) {
        this.field736 = class24.method159(arg0, arg0.length, (byte) 112);
        if (this.field736 != arg1) {
            throw new RuntimeException();
        }
        this.method283(arg0, false);
    }
}
