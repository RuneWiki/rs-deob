import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class class416 {

    @OriginalMember(owner = "client!br", name = "f", descriptor = "Laj;")
    private class333 field5970;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "I")
    private int field5965;

    @OriginalMember(owner = "client!br", name = "e", descriptor = "[Z")
    private boolean[] field5969;

    @OriginalMember(owner = "client!br", name = "i", descriptor = "[[I")
    private int[][] field5973;

    @OriginalMember(owner = "client!br", name = "g", descriptor = "Lmt;")
    public static class419 field5971 = new class419(2, 4, 4, 0);

    @OriginalMember(owner = "client!br", name = "j", descriptor = "Ljw;")
    public static class581 field5974 = new class581(66, 4);

    @OriginalMember(owner = "client!br", name = "b", descriptor = "I")
    public static int field5966;

    @OriginalMember(owner = "client!br", name = "c", descriptor = "I")
    public static int field5967;

    @OriginalMember(owner = "client!br", name = "d", descriptor = "I")
    public static int field5968;

    @OriginalMember(owner = "client!br", name = "h", descriptor = "I")
    public static int field5972;

    @OriginalMember(owner = "client!br", name = "l", descriptor = "Ljp;")
    public static class376 field5976;

    @OriginalMember(owner = "client!br", name = "k", descriptor = "[Lvr;")
    public static class147[] field5975;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(I)V")
    public static void method2566(int arg0) {
        field5974 = null;
        field5976 = null;
        field5975 = null;
        if (arg0 < -81) {
            field5971 = null;
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(Laj;I)V")
    public static final void method2567(class333 arg0, int arg1) {
        class691.field9699 = arg0.method2092("p11_full", false);
        if (arg1 < -14) {
            field5972++;
            class229.field3121 = arg0.method2092("p12_full", false);
            class45.field676 = arg0.method2092("b12_full", false);
        }
    }

    @OriginalMember(owner = "client!br", name = "b", descriptor = "(I)Z")
    public final boolean method2568(int arg0) {
        field5967++;
        if (arg0 != 23382) {
            this.method2570(-46, false);
        }
        return this.field5965 != -1;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(II)Ljn;")
    public final class750 method2569(int arg0, int arg1) {
        field5968++;
        byte[] var3 = this.field5970.method2095(arg1, 1, 1);
        if (arg0 != -1) {
            this.method2568(26);
        }
        class750 var4 = new class750();
        var4.method4144(new class376(var3), (byte) 83);
        return var4;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IZ)[I")
    public final int[] method2570(int arg0, boolean arg1) {
        field5966++;
        if (arg0 < 0 || this.field5973.length <= arg0) {
            return this.field5965 == -1 ? new int[0] : new int[] { this.field5965 };
        } else if (this.field5969[arg0] && this.field5973[arg0].length > 1) {
            int var3 = this.field5965 == -1 ? 0 : 1;
            if (!arg1) {
                this.field5970 = null;
            }
            Random var4 = new Random();
            int[] var5 = new int[this.field5973[arg0].length];
            class278.method1798(this.field5973[arg0], 0, var5, 0, var5.length);
            for (int var6 = var3; var6 < var5.length; var6++) {
                int var7 = var3 + class739.method4090(var4, 79, var5.length - var3);
                int var8 = var5[var6];
                var5[var6] = var5[var7];
                var5[var7] = var8;
            }
            return var5;
        } else {
            return this.field5973[arg0];
        }
    }

    @OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Lgia;ILaj;)V")
    public class416(class285 arg0, int arg1, class333 arg2) {
        this.field5970 = arg2;
        this.field5970.method2090(1, false);
        class376 var4 = new class376(this.field5970.method2095(0, 0, 1));
        int var5 = var4.method2398(-1372747256);
        if (var5 > 3) {
            this.field5965 = -1;
            this.field5973 = new int[0][];
            this.field5969 = new boolean[0];
        } else {
            int var6 = var4.method2398(-1372747256);
            class546[] var7 = class52.method385(-65);
            boolean var8 = true;
            if (var7.length == var6) {
                for (int var9 = 0; var9 < var7.length; var9++) {
                    int var10 = var4.method2398(-1372747256);
                    if (var7[var9].field7400 != var10) {
                        var8 = false;
                        break;
                    }
                }
            } else {
                var8 = false;
            }
            if (var8) {
                int var11 = var4.method2398(-1372747256);
                int var12 = var4.method2398(-1372747256);
                if (var5 <= 2) {
                    this.field5965 = -1;
                } else {
                    this.field5965 = var4.method2355(3);
                }
                this.field5969 = new boolean[var12 + 1];
                this.field5973 = new int[var12 + 1][];
                for (int var13 = 0; var13 < var11; var13++) {
                    int var15 = var4.method2398(-1372747256);
                    this.field5969[var15] = var4.method2398(-1372747256) == 1;
                    int var16 = var4.method2359(-1);
                    if (this.field5965 == -1) {
                        this.field5973[var15] = new int[var16];
                        for (int var18 = 0; var18 < var16; var18++) {
                            this.field5973[var15][var18] = var4.method2359(-1);
                        }
                    } else {
                        this.field5973[var15] = new int[var16 + 1];
                        this.field5973[var15][0] = this.field5965;
                        for (int var17 = 0; var17 < var16; var17++) {
                            this.field5973[var15][var17 + 1] = var4.method2359(-1);
                        }
                    }
                }
                for (int var14 = 0; var14 < var12 + 1; var14++) {
                    if (this.field5973[var14] == null) {
                        if (this.field5965 == -1) {
                            this.field5973[var14] = new int[0];
                        } else {
                            this.field5973[var14] = new int[] { this.field5965 };
                        }
                    }
                }
            } else {
                this.field5965 = -1;
                this.field5969 = new boolean[0];
                this.field5973 = new int[0][];
            }
        }
    }
}
