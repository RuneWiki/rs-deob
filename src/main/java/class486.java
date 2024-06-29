import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class486 implements class214 {

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "Lkl;")
    private class70 field6949 = new class70(256);

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "Lom;")
    private class344 field6951;

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "Lom;")
    private class344 field6953;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "I")
    private int field6952;

    @OriginalMember(owner = "client!sf", name = "q", descriptor = "[Lnca;")
    private class699[] field6964;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "[Luaa;")
    public static class102[] field6948 = new class102[35];

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "I")
    public static int field6954;

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "I")
    public static int field6955;

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "I")
    public static int field6956;

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "I")
    public static int field6957;

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "I")
    public static int field6958;

    @OriginalMember(owner = "client!sf", name = "l", descriptor = "I")
    public static int field6959;

    @OriginalMember(owner = "client!sf", name = "m", descriptor = "I")
    public static int field6960;

    @OriginalMember(owner = "client!sf", name = "n", descriptor = "I")
    public static int field6961;

    @OriginalMember(owner = "client!sf", name = "o", descriptor = "I")
    public static int field6962;

    @OriginalMember(owner = "client!sf", name = "r", descriptor = "Lwca;")
    public static class631 field6965;

    @OriginalMember(owner = "client!sf", name = "p", descriptor = "Lclient;")
    public static client field6963;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "[I")
    public static int[] field6950;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(II)Lnca;")
    public final class699 method1500(int arg0, int arg1) {
        field6957++;
        if (arg1 >= -6) {
            field6965 = null;
        }
        return this.field6964[arg0];
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(II)Lwba;")
    private final class46 method2932(int arg0, int arg1) {
        field6954++;
        class678 var3 = this.field6949.method783(55, (long) arg1);
        if (var3 != null) {
            return (class46) var3;
        }
        byte[] var4 = this.field6953.method2242(0, arg1);
        if (arg0 < 69) {
            return null;
        } else if (var4 == null) {
            return null;
        } else {
            class46 var5 = new class46(new class61(var4));
            this.field6949.method780((long) arg1, (byte) -124, var5);
            return var5;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILjava/awt/Component;)Lwca;")
    public static final class631 method2933(int arg0, Component arg1) {
        if (arg0 != 0) {
            method2933(-22, null);
        }
        field6960++;
        return new class342(arg1);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IZFIII)[I")
    public final int[] method1495(int arg0, boolean arg1, float arg2, int arg3, int arg4, int arg5) {
        if (arg5 == 32682) {
            field6958++;
            return this.method2932(arg5 - 32555, arg0).method594(this.field6964[arg0].field9850, this.field6951, arg3, 118, arg4, arg1, (double) arg2, this);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V")
    public static void method2934(int arg0) {
        field6963 = null;
        field6948 = null;
        if (arg0 != 20548) {
            method2934(124);
        }
        field6965 = null;
        field6950 = null;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIZIFZ)[F")
    public final float[] method1498(int arg0, int arg1, boolean arg2, int arg3, float arg4, boolean arg5) {
        field6955++;
        if (!arg5) {
            this.method1496(50, 122, -3.1417997F, false, -118, 15);
        }
        return this.method2932(103, arg0).method591(arg3, this.field6951, this, this.field6964[arg0].field9850, arg1, 255);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIFZII)[I")
    public final int[] method1496(int arg0, int arg1, float arg2, boolean arg3, int arg4, int arg5) {
        field6959++;
        return arg5 == -15473 ? this.method2932(arg5 + 15545, arg0).method595(this.field6951, -256, (double) arg2, arg1, arg4, this, this.field6964[arg0].field9850) : null;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)Z")
    public final boolean method1499(int arg0, int arg1) {
        field6962++;
        class46 var3 = this.method2932(86, arg0);
        if (arg1 != -24052) {
            method2934(23);
        }
        return var3 != null && var3.method596(this, this.field6951, -111);
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Lom;Lom;Lom;)V")
    public class486(class344 arg0, class344 arg1, class344 arg2) {
        this.field6951 = arg2;
        this.field6953 = arg1;
        class61 var4 = new class61(arg0.method2216(0, 0, true));
        this.field6952 = var4.method723((byte) -25);
        this.field6964 = new class699[this.field6952];
        for (int var5 = 0; var5 < this.field6952; var5++) {
            if (var4.method732(-559537960) == 1) {
                this.field6964[var5] = new class699();
            }
        }
        for (int var6 = 0; var6 < this.field6952; var6++) {
            if (this.field6964[var6] != null) {
                this.field6964[var6].field9844 = var4.method732(-559537960) == 0;
            }
        }
        for (int var7 = 0; var7 < this.field6952; var7++) {
            if (this.field6964[var7] != null) {
                this.field6964[var7].field9846 = var4.method732(-559537960) == 1;
            }
        }
        for (int var8 = 0; var8 < this.field6952; var8++) {
            if (this.field6964[var8] != null) {
                this.field6964[var8].field9836 = var4.method732(-559537960) == 1;
            }
        }
        for (int var9 = 0; var9 < this.field6952; var9++) {
            if (this.field6964[var9] != null) {
                this.field6964[var9].field9839 = var4.method732(-559537960) == 1;
            }
        }
        for (int var10 = 0; var10 < this.field6952; var10++) {
            if (this.field6964[var10] != null) {
                this.field6964[var10].field9838 = var4.method710((byte) 43);
            }
        }
        for (int var11 = 0; var11 < this.field6952; var11++) {
            if (this.field6964[var11] != null) {
                this.field6964[var11].field9843 = var4.method710((byte) 43);
            }
        }
        for (int var12 = 0; var12 < this.field6952; var12++) {
            if (this.field6964[var12] != null) {
                this.field6964[var12].field9829 = var4.method710((byte) 43);
            }
        }
        for (int var13 = 0; var13 < this.field6952; var13++) {
            if (this.field6964[var13] != null) {
                this.field6964[var13].field9849 = var4.method710((byte) 43);
            }
        }
        for (int var14 = 0; var14 < this.field6952; var14++) {
            if (this.field6964[var14] != null) {
                this.field6964[var14].field9828 = (short) var4.method723((byte) -25);
            }
        }
        for (int var15 = 0; var15 < this.field6952; var15++) {
            if (this.field6964[var15] != null) {
                this.field6964[var15].field9852 = var4.method710((byte) 43);
            }
        }
        for (int var16 = 0; var16 < this.field6952; var16++) {
            if (this.field6964[var16] != null) {
                this.field6964[var16].field9834 = var4.method710((byte) 43);
            }
        }
        for (int var17 = 0; var17 < this.field6952; var17++) {
            if (this.field6964[var17] != null) {
                this.field6964[var17].field9848 = var4.method732(-559537960) == 1;
            }
        }
        for (int var18 = 0; var18 < this.field6952; var18++) {
            if (this.field6964[var18] != null) {
                this.field6964[var18].field9850 = var4.method732(-559537960) == 1;
            }
        }
        for (int var19 = 0; var19 < this.field6952; var19++) {
            if (this.field6964[var19] != null) {
                this.field6964[var19].field9842 = var4.method710((byte) 43);
            }
        }
        for (int var20 = 0; var20 < this.field6952; var20++) {
            if (this.field6964[var20] != null) {
                this.field6964[var20].field9847 = var4.method732(-559537960) == 1;
            }
        }
        for (int var21 = 0; var21 < this.field6952; var21++) {
            if (this.field6964[var21] != null) {
                this.field6964[var21].field9832 = var4.method732(-559537960) == 1;
            }
        }
        for (int var22 = 0; var22 < this.field6952; var22++) {
            if (this.field6964[var22] != null) {
                this.field6964[var22].field9827 = var4.method732(-559537960) == 1;
            }
        }
        for (int var23 = 0; var23 < this.field6952; var23++) {
            if (this.field6964[var23] != null) {
                this.field6964[var23].field9835 = var4.method732(-559537960);
            }
        }
        for (int var24 = 0; var24 < this.field6952; var24++) {
            if (this.field6964[var24] != null) {
                this.field6964[var24].field9826 = var4.method730(92);
            }
        }
        for (int var25 = 0; var25 < this.field6952; var25++) {
            if (this.field6964[var25] != null) {
                this.field6964[var25].field9840 = var4.method732(-559537960) == 1;
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)I")
    public final int method1497(byte arg0) {
        if (arg0 >= -55) {
            return -6;
        } else {
            field6956++;
            return this.field6952;
        }
    }
}
