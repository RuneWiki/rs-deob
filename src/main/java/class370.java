import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public class class370 implements class278 {

    @OriginalMember(owner = "client!pt", name = "n", descriptor = "Lvq;")
    private class323 field4790 = new class323(256);

    @OriginalMember(owner = "client!pt", name = "l", descriptor = "Lqn;")
    private class47 field4788;

    @OriginalMember(owner = "client!pt", name = "g", descriptor = "Lqn;")
    private class47 field4783;

    @OriginalMember(owner = "client!pt", name = "e", descriptor = "[Lhi;")
    private class139[] field4781;

    @OriginalMember(owner = "client!pt", name = "o", descriptor = "[Lcm;")
    public static class513[] field4791 = new class513[14];

    @OriginalMember(owner = "client!pt", name = "p", descriptor = "[I")
    public static int[] field4792;

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "I")
    public static int field4777;

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "I")
    public static int field4778;

    @OriginalMember(owner = "client!pt", name = "c", descriptor = "I")
    public static int field4779;

    @OriginalMember(owner = "client!pt", name = "d", descriptor = "I")
    public static int field4780;

    @OriginalMember(owner = "client!pt", name = "f", descriptor = "I")
    public static int field4782;

    @OriginalMember(owner = "client!pt", name = "h", descriptor = "I")
    public static int field4784;

    @OriginalMember(owner = "client!pt", name = "i", descriptor = "I")
    public static int field4785;

    @OriginalMember(owner = "client!pt", name = "j", descriptor = "I")
    public static int field4786;

    @OriginalMember(owner = "client!pt", name = "k", descriptor = "I")
    public static int field4787;

    @OriginalMember(owner = "client!pt", name = "m", descriptor = "I")
    public static int field4789;

    static {
        new class335("Loaded additional fonts", "Zusatzschriftarten geladen", "Polices secondaires chargées", "Fontes principais carregadas");
        field4792 = new int[] { 16, 32, 64, 128 };
        new class335("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.");
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(IFIBZI)[I", line = 10)
    public final int[] method1640(int arg0, float arg1, int arg2, byte arg3, boolean arg4, int arg5) {
        field4787++;
        return arg3 == -24 ? this.method2111(arg5, (byte) -47).method887(127, this, arg2, (double) arg1, this.field4783, this.field4781[arg5].field1777, arg0) : null;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(IIILrd;)V", line = 21)
    public static final void method2108(int arg0, int arg1, int arg2, class223 arg3) {
        if (arg2 != -16032) {
            field4792 = null;
        }
        if (arg3.field4859 == arg0 && arg0 != -1) {
            class415 var4 = class404.field5756.method557(arg0, 15);
            int var5 = var4.field5931;
            if (var5 == 1) {
                arg3.field4873 = 0;
                arg3.field4852 = 0;
                arg3.field4853 = arg1;
                arg3.field4881 = 1;
                arg3.field4870 = 0;
                class334.method1931(arg3.field2666, (byte) 121, var4, arg3.field2676, class23.field336 == arg3, arg3.field4873, arg3.field2677);
            }
            if (var5 == 2) {
                arg3.field4852 = 0;
            }
        } else if (arg0 == -1 || arg3.field4859 == -1 || class404.field5756.method557(arg0, arg2 + 16047).field5913 >= class404.field5756.method557(arg3.field4859, arg2 ^ 0xFFFFC16F).field5913) {
            arg3.field4943 = arg3.field4941;
            arg3.field4853 = arg1;
            arg3.field4873 = 0;
            arg3.field4852 = 0;
            arg3.field4881 = 1;
            arg3.field4859 = arg0;
            arg3.field4870 = 0;
            if (arg3.field4859 != -1) {
                class334.method1931(arg3.field2666, (byte) 98, class404.field5756.method557(arg3.field4859, arg2 + 16047), arg3.field2676, class23.field336 == arg3, arg3.field4873, arg3.field2677);
            }
        }
        field4779++;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(BI)Z", line = 71)
    public static final boolean method2109(byte arg0, int arg1) {
        field4782++;
        if (arg0 != -90) {
            method2108(27, -102, 29, null);
        }
        return arg1 == 2 || arg1 == 6 || arg1 == 9;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(ZIIFII)[I", line = 83)
    public final int[] method1641(boolean arg0, int arg1, int arg2, float arg3, int arg4, int arg5) {
        if (arg1 == 13724) {
            field4786++;
            return this.method2111(arg5, (byte) -86).method882(this, arg2, arg4, (double) arg3, this.field4781[arg5].field1777, (byte) 125, arg0, this.field4783);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(I)V", line = 97)
    public static void method2110(int arg0) {
        if (arg0 != -19442) {
            field4791 = null;
        }
        field4791 = null;
        field4792 = null;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(ZZIIIF)[F", line = 108)
    public final float[] method1639(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, float arg5) {
        if (arg1) {
            this.field4788 = null;
        }
        field4785++;
        return this.method2111(arg4, (byte) -12).method885(arg3, this.field4781[arg4].field1777, 767816418, this.field4783, arg2, this);
    }

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "(II)Lhi;", line = 119)
    public final class139 method1642(int arg0, int arg1) {
        int var3 = -35 % ((75 - arg1) / 45);
        field4784++;
        return this.field4781[arg0];
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(IB)Lop;", line = 130)
    private final class126 method2111(int arg0, byte arg1) {
        field4789++;
        class89 var3 = this.field4790.method1892((long) arg0, false);
        if (var3 != null) {
            return (class126) var3;
        } else if (arg1 > -5) {
            return null;
        } else {
            byte[] var4 = this.field4788.method457(arg0, -63);
            if (var4 == null) {
                return null;
            } else {
                class126 var5 = new class126(new class463(var4));
                this.field4790.method1894(var5, (long) arg0, 8690);
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(II)Z", line = 156)
    public final boolean method1638(int arg0, int arg1) {
        field4778++;
        int var3 = -80 % ((55 - arg0) / 52);
        class126 var4 = this.method2111(arg1, (byte) -28);
        return var4 != null && var4.method883(this.field4783, (byte) -120, this);
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(III)Z", line = 169)
    public static final boolean method2112(int arg0, int arg1, int arg2) {
        field4777++;
        return arg1 >= -77 ? false : class532.method3155(arg0, -1, arg2) & class136.method934(24016, arg0, arg2);
    }

    @OriginalMember(owner = "client!pt", name = "<init>", descriptor = "(Lqn;Lqn;Lqn;)V", line = 188)
    public class370(class47 arg0, class47 arg1, class47 arg2) {
        this.field4788 = arg1;
        this.field4783 = arg2;
        class463 var4 = new class463(arg0.method481(0, 0, -92));
        int var5 = var4.method2758((byte) 104);
        this.field4781 = new class139[var5];
        for (int var6 = 0; var6 < var5; var6++) {
            if (var4.method2737(false) == 1) {
                this.field4781[var6] = new class139();
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            if (this.field4781[var7] != null) {
                this.field4781[var7].field1775 = var4.method2737(false) == 0;
            }
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (this.field4781[var8] != null) {
                this.field4781[var8].field1783 = var4.method2737(false) == 1;
            }
        }
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field4781[var9] != null) {
                this.field4781[var9].field1773 = var4.method2737(false) == 1;
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            if (this.field4781[var10] != null) {
                this.field4781[var10].field1779 = var4.method2737(false) == 1;
            }
        }
        for (int var11 = 0; var11 < var5; var11++) {
            if (this.field4781[var11] != null) {
                this.field4781[var11].field1788 = var4.method2793(32767);
            }
        }
        for (int var12 = 0; var12 < var5; var12++) {
            if (this.field4781[var12] != null) {
                this.field4781[var12].field1785 = var4.method2793(32767);
            }
        }
        for (int var13 = 0; var13 < var5; var13++) {
            if (this.field4781[var13] != null) {
                this.field4781[var13].field1794 = var4.method2793(32767);
            }
        }
        for (int var14 = 0; var14 < var5; var14++) {
            if (this.field4781[var14] != null) {
                this.field4781[var14].field1790 = var4.method2793(32767);
            }
        }
        for (int var15 = 0; var15 < var5; var15++) {
            if (this.field4781[var15] != null) {
                this.field4781[var15].field1795 = (short) var4.method2758((byte) 97);
            }
        }
        for (int var16 = 0; var16 < var5; var16++) {
            if (this.field4781[var16] != null) {
                this.field4781[var16].field1791 = var4.method2793(32767);
            }
        }
        for (int var17 = 0; var17 < var5; var17++) {
            if (this.field4781[var17] != null) {
                this.field4781[var17].field1789 = var4.method2793(32767);
            }
        }
        for (int var18 = 0; var18 < var5; var18++) {
            if (this.field4781[var18] != null) {
                this.field4781[var18].field1793 = var4.method2737(false) == 1;
            }
        }
        for (int var19 = 0; var19 < var5; var19++) {
            if (this.field4781[var19] != null) {
                this.field4781[var19].field1777 = var4.method2737(false) == 1;
            }
        }
        for (int var20 = 0; var20 < var5; var20++) {
            if (this.field4781[var20] != null) {
                this.field4781[var20].field1787 = var4.method2793(32767);
            }
        }
        for (int var21 = 0; var21 < var5; var21++) {
            if (this.field4781[var21] != null) {
                this.field4781[var21].field1784 = var4.method2737(false) == 1;
            }
        }
        for (int var22 = 0; var22 < var5; var22++) {
            if (this.field4781[var22] != null) {
                this.field4781[var22].field1778 = var4.method2737(false) == 1;
            }
        }
        for (int var23 = 0; var23 < var5; var23++) {
            if (this.field4781[var23] != null) {
                this.field4781[var23].field1780 = var4.method2737(false) == 1;
            }
        }
        for (int var24 = 0; var24 < var5; var24++) {
            if (this.field4781[var24] != null) {
                this.field4781[var24].field1786 = var4.method2737(false);
            }
        }
        for (int var25 = 0; var25 < var5; var25++) {
            if (this.field4781[var25] != null) {
                this.field4781[var25].field1781 = var4.method2727(-113);
            }
        }
    }
}
