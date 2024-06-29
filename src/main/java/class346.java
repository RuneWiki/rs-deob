import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kw")
public class class346 implements class267 {

    @OriginalMember(owner = "client!kw", name = "h", descriptor = "Lmha;")
    private class701 field5111 = new class701(256);

    @OriginalMember(owner = "client!kw", name = "r", descriptor = "Lla;")
    private class422 field5121;

    @OriginalMember(owner = "client!kw", name = "l", descriptor = "Lla;")
    private class422 field5115;

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "I")
    private int field5104;

    @OriginalMember(owner = "client!kw", name = "g", descriptor = "[Lhia;")
    private class569[] field5110;

    @OriginalMember(owner = "client!kw", name = "e", descriptor = "I")
    public static int field5108 = 1406;

    @OriginalMember(owner = "client!kw", name = "k", descriptor = "[[Z")
    public static boolean[][] field5114 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "F")
    public static float field5105;

    @OriginalMember(owner = "client!kw", name = "c", descriptor = "I")
    public static int field5106;

    @OriginalMember(owner = "client!kw", name = "d", descriptor = "I")
    public static int field5107;

    @OriginalMember(owner = "client!kw", name = "f", descriptor = "I")
    public static int field5109;

    @OriginalMember(owner = "client!kw", name = "j", descriptor = "I")
    public static int field5113;

    @OriginalMember(owner = "client!kw", name = "m", descriptor = "I")
    public static int field5116;

    @OriginalMember(owner = "client!kw", name = "n", descriptor = "I")
    public static int field5117;

    @OriginalMember(owner = "client!kw", name = "o", descriptor = "I")
    public static int field5118;

    @OriginalMember(owner = "client!kw", name = "q", descriptor = "I")
    public static int field5120;

    @OriginalMember(owner = "client!kw", name = "p", descriptor = "Lfj;")
    public static class656 field5119;

    @OriginalMember(owner = "client!kw", name = "i", descriptor = "Luha;")
    public static class723 field5112;

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(I)V", line = 7)
    public static void method2210(int arg0) {
        field5114 = null;
        field5119 = null;
        field5112 = null;
        if (arg0 != 0) {
            field5119 = null;
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(IZFIII)[F", line = 21)
    public final float[] method1775(int arg0, boolean arg1, float arg2, int arg3, int arg4, int arg5) {
        if (arg4 == -27353) {
            field5106++;
            return this.method2212(arg5, (byte) 99).method1097(this.field5121, arg0, arg3, this.field5110[arg5].field8059, this, arg4 ^ 0x7582);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "(II)Lhia;", line = 33)
    public final class569 method1774(int arg0, int arg1) {
        if (arg0 <= 47) {
            this.method1772(105, -89);
        }
        field5117++;
        return this.field5110[arg1];
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(III)Z", line = 44)
    public static final boolean method2211(int arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            field5109++;
            return (arg0 & 0x20) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(ZFIBII)[I", line = 55)
    public final int[] method1776(boolean arg0, float arg1, int arg2, byte arg3, int arg4, int arg5) {
        if (arg3 == 45) {
            field5113++;
            return this.method2212(arg5, (byte) 99).method1092(arg4, this.field5110[arg5].field8059, this.field5121, arg2, -1, (double) arg1, this);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(II)Z", line = 73)
    public final boolean method1772(int arg0, int arg1) {
        field5116++;
        class140 var3 = this.method2212(arg1, (byte) 99);
        if (arg0 == -5919) {
            return var3 != null && var3.method1098(this, arg0 + 6036, this.field5121);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(Z)I", line = 90)
    public final int method1773(boolean arg0) {
        field5120++;
        if (!arg0) {
            field5105 = -1.2105362F;
        }
        return this.field5104;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(IB)Lhv;", line = 106)
    private final class140 method2212(int arg0, byte arg1) {
        if (arg1 != 99) {
            return null;
        }
        field5118++;
        class205 var3 = this.field5111.method3893(0, (long) arg0);
        if (var3 != null) {
            return (class140) var3;
        }
        byte[] var4 = this.field5115.method2633(true, arg0);
        if (var4 == null) {
            return null;
        } else {
            class140 var5 = new class140(new class301(var4));
            this.field5111.method3894(var5, (long) arg0, 0);
            return var5;
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(FIIIBZ)[I", line = 131)
    public final int[] method1771(float arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        field5107++;
        if (arg4 != 70) {
            field5119 = null;
        }
        return this.method2212(arg2, (byte) 99).method1094(arg1, this, this.field5110[arg2].field8059, this.field5121, true, arg5, (double) arg0, arg3);
    }

    @OriginalMember(owner = "client!kw", name = "<init>", descriptor = "(Lla;Lla;Lla;)V", line = 150)
    public class346(class422 arg0, class422 arg1, class422 arg2) {
        this.field5121 = arg2;
        this.field5115 = arg1;
        class301 var4 = new class301(arg0.method2624(0, 0, 0));
        this.field5104 = var4.method1989((byte) -96);
        this.field5110 = new class569[this.field5104];
        for (int var5 = 0; var5 < this.field5104; var5++) {
            if (var4.method1987(-24) == 1) {
                this.field5110[var5] = new class569();
            }
        }
        for (int var6 = 0; var6 < this.field5104; var6++) {
            if (this.field5110[var6] != null) {
                this.field5110[var6].field8062 = var4.method1987(-43) == 0;
            }
        }
        for (int var7 = 0; var7 < this.field5104; var7++) {
            if (this.field5110[var7] != null) {
                this.field5110[var7].field8067 = var4.method1987(-18) == 1;
            }
        }
        for (int var8 = 0; var8 < this.field5104; var8++) {
            if (this.field5110[var8] != null) {
                this.field5110[var8].field8068 = var4.method1987(-53) == 1;
            }
        }
        for (int var9 = 0; var9 < this.field5104; var9++) {
            if (this.field5110[var9] != null) {
                this.field5110[var9].field8077 = var4.method1984(4);
            }
        }
        for (int var10 = 0; var10 < this.field5104; var10++) {
            if (this.field5110[var10] != null) {
                this.field5110[var10].field8069 = var4.method1984(4);
            }
        }
        for (int var11 = 0; var11 < this.field5104; var11++) {
            if (this.field5110[var11] != null) {
                this.field5110[var11].field8079 = var4.method1984(4);
            }
        }
        for (int var12 = 0; var12 < this.field5104; var12++) {
            if (this.field5110[var12] != null) {
                this.field5110[var12].field8065 = var4.method1984(4);
            }
        }
        for (int var13 = 0; var13 < this.field5104; var13++) {
            if (this.field5110[var13] != null) {
                this.field5110[var13].field8071 = (short) var4.method1989((byte) -128);
            }
        }
        for (int var14 = 0; var14 < this.field5104; var14++) {
            if (this.field5110[var14] != null) {
                this.field5110[var14].field8058 = var4.method1984(4);
            }
        }
        for (int var15 = 0; var15 < this.field5104; var15++) {
            if (this.field5110[var15] != null) {
                this.field5110[var15].field8066 = var4.method1984(4);
            }
        }
        for (int var16 = 0; var16 < this.field5104; var16++) {
            if (this.field5110[var16] != null) {
                this.field5110[var16].field8076 = var4.method1987(-17) == 1;
            }
        }
        for (int var17 = 0; var17 < this.field5104; var17++) {
            if (this.field5110[var17] != null) {
                this.field5110[var17].field8059 = var4.method1987(-112) == 1;
            }
        }
        for (int var18 = 0; var18 < this.field5104; var18++) {
            if (this.field5110[var18] != null) {
                this.field5110[var18].field8061 = var4.method1984(4);
            }
        }
        for (int var19 = 0; var19 < this.field5104; var19++) {
            if (this.field5110[var19] != null) {
                this.field5110[var19].field8063 = var4.method1987(-39) == 1;
            }
        }
        for (int var20 = 0; var20 < this.field5104; var20++) {
            if (this.field5110[var20] != null) {
                this.field5110[var20].field8078 = var4.method1987(-111) == 1;
            }
        }
        for (int var21 = 0; var21 < this.field5104; var21++) {
            if (this.field5110[var21] != null) {
                this.field5110[var21].field8070 = var4.method1987(-18) == 1;
            }
        }
        for (int var22 = 0; var22 < this.field5104; var22++) {
            if (this.field5110[var22] != null) {
                this.field5110[var22].field8074 = var4.method1987(-118);
            }
        }
        for (int var23 = 0; var23 < this.field5104; var23++) {
            if (this.field5110[var23] != null) {
                this.field5110[var23].field8080 = var4.method1934(-2);
            }
        }
        for (int var24 = 0; var24 < this.field5104; var24++) {
            if (this.field5110[var24] != null) {
                this.field5110[var24].field8072 = var4.method1987(-72);
            }
        }
    }
}
