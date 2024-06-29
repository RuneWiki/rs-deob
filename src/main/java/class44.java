import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class44 extends class98 {

    @OriginalMember(owner = "client!wf", name = "U", descriptor = "Z")
    public boolean field766 = false;

    @OriginalMember(owner = "client!wf", name = "S", descriptor = "Lqk;")
    private class6 field764;

    @OriginalMember(owner = "client!wf", name = "P", descriptor = "Z")
    private boolean field761;

    @OriginalMember(owner = "client!wf", name = "C", descriptor = "Z")
    private boolean field748;

    @OriginalMember(owner = "client!wf", name = "T", descriptor = "I")
    private int field765;

    @OriginalMember(owner = "client!wf", name = "W", descriptor = "I")
    private int field768;

    @OriginalMember(owner = "client!wf", name = "A", descriptor = "I")
    public static int field746 = 0;

    @OriginalMember(owner = "client!wf", name = "B", descriptor = "Lmb;")
    private static class96 field747 = class243.method1708("Loading config )2 ", (byte) 110);

    @OriginalMember(owner = "client!wf", name = "J", descriptor = "I")
    public static int field755 = 0;

    @OriginalMember(owner = "client!wf", name = "M", descriptor = "[I")
    public static int[] field758 = new int[2000];

    @OriginalMember(owner = "client!wf", name = "O", descriptor = "Lmb;")
    public static class96 field760 = class243.method1708("(U3", (byte) 112);

    @OriginalMember(owner = "client!wf", name = "Q", descriptor = "Lmb;")
    public static class96 field762 = field747;

    @OriginalMember(owner = "client!wf", name = "I", descriptor = "F")
    private float field754;

    @OriginalMember(owner = "client!wf", name = "D", descriptor = "I")
    public static int field749;

    @OriginalMember(owner = "client!wf", name = "F", descriptor = "I")
    public static int field751;

    @OriginalMember(owner = "client!wf", name = "G", descriptor = "I")
    public static int field752;

    @OriginalMember(owner = "client!wf", name = "H", descriptor = "I")
    public static int field753;

    @OriginalMember(owner = "client!wf", name = "L", descriptor = "I")
    public static int field757;

    @OriginalMember(owner = "client!wf", name = "N", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!wf", name = "R", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!wf", name = "V", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!wf", name = "X", descriptor = "I")
    public static int field769;

    @OriginalMember(owner = "client!wf", name = "E", descriptor = "Lpf;")
    public static class216 field750;

    @OriginalMember(owner = "client!wf", name = "K", descriptor = "[I")
    private int[] field756;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)V")
    public final void method340(int arg0, int arg1) {
        field759++;
        if (arg0 != -1) {
            method341((byte) 6);
        }
        if (this.field756 == null || this.field768 == 0 && this.field765 == 0) {
            return;
        }
        if (class109.field2016 == null || class109.field2016.length < this.field756.length) {
            class109.field2016 = new int[this.field756.length];
        }
        int var3 = this.field756.length;
        int var4 = this.field756.length == 4096 ? 64 : 128;
        int var5 = this.field765 * arg1;
        int var6 = var4 - 1;
        int var7 = arg1 * var4 * this.field768;
        int var8 = var3 - 1;
        for (int var9 = 0; var9 < var3; var9 += var4) {
            int var11 = var9 + var7 & var8;
            for (int var12 = 0; var12 < var4; var12++) {
                int var13 = var9 + var12;
                int var14 = (var12 + var5 & var6) + var11;
                class109.field2016[var13] = this.field756[var14];
            }
        }
        int[] var10 = this.field756;
        this.field756 = class109.field2016;
        class109.field2016 = var10;
    }

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "(B)[Lrf;")
    public static final class30[] method341(byte arg0) {
        field763++;
        class30[] var1 = new class30[class252.field4368];
        for (int var2 = 0; var2 < class252.field4368; var2++) {
            var1[var2] = new class30(class249.field4309, class109.field2019, class241.field4187[var2], class176.field3064[var2], class31.field490[var2], class170.field2982[var2], class217.field3724[var2], class139.field2492);
        }
        int var3 = -89 % ((arg0 - 46) / 48);
        class192.method1344(0);
        return var1;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZBLff;Ljc;F)[I")
    public final int[] method342(boolean arg0, byte arg1, class3 arg2, class160 arg3, float arg4) {
        if (arg1 <= 65) {
            method343((byte) 77, false);
        }
        field751++;
        if (this.field756 == null || this.field754 != arg4) {
            if (!this.field764.method63(arg2, arg3, (byte) -87)) {
                return null;
            }
            int var6 = arg0 ? 64 : 128;
            this.field756 = this.field764.method61(var6, arg3, (double) arg4, true, var6, this.field748, arg2, -108);
            this.field754 = arg4;
            if (this.field761) {
                int[] var7 = new int[var6];
                int[] var8 = new int[var6];
                int[] var9 = new int[var6];
                int var10 = var6;
                int var11 = var6;
                int var12 = var6;
                int[] var13 = new int[var6 * var6];
                int var14 = var6 - 1;
                int var16 = var6 * var6;
                int var17 = var6 - 1;
                for (int var18 = 2; var18 >= 0; var18--) {
                    for (int var34 = var14; var34 >= 0; var34--) {
                        var11--;
                        int var35 = this.field756[var11];
                        var7[var34] += class130.method985(var35 >> 16, 255);
                        var8[var34] += class130.method985(65297, var35) >> 8;
                        var9[var34] += class130.method985(var35, 255);
                    }
                    if (var11 == 0) {
                        var11 = var16;
                    }
                }
                int var19 = var16;
                for (int var20 = var17; var20 >= 0; var20--) {
                    int var21 = 0;
                    int var22 = 0;
                    int var23 = 0;
                    int var24 = 1;
                    int var25 = 1;
                    for (int var26 = 2; var26 >= 0; var26--) {
                        var25--;
                        var23 += var7[var25];
                        var22 += var9[var25];
                        var21 += var8[var25];
                        if (var25 == 0) {
                            var25 = var10;
                        }
                    }
                    for (int var27 = var14; var27 >= 0; var27--) {
                        int var31 = var23 / 9;
                        int var32 = var22 / 9;
                        int var33 = var21 / 9;
                        var24--;
                        var19--;
                        var13[var19] = class45.method348(class45.method348(var31 << 16, var33 << 8), var32);
                        var25--;
                        var23 += var7[var25] - var7[var24];
                        var21 += var8[var25] - var8[var24];
                        var22 += var9[var25] - var9[var24];
                        if (var25 == 0) {
                            var25 = var10;
                        }
                        if (var24 == 0) {
                            var24 = var10;
                        }
                    }
                    for (int var28 = var14; var28 >= 0; var28--) {
                        var11--;
                        int var29 = this.field756[var11];
                        var12--;
                        int var30 = this.field756[var12];
                        var7[var28] += -class130.method985(255, var30 >> 16) + class130.method985(255, var29 >> 16);
                        var8[var28] += (class130.method985(var29, 65310) >> 8) - (class130.method985(var30, 65522) >> 8);
                        var9[var28] += class130.method985(255, var29) - class130.method985(var30, 255);
                    }
                    if (var12 == 0) {
                        var12 = var16;
                    }
                    if (var11 == 0) {
                        var11 = var16;
                    }
                }
                this.field756 = var13;
            }
        }
        return this.field756;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(BZ)V")
    public static final void method343(byte arg0, boolean arg1) {
        class54.field939 = new int[104];
        class214.field3688 = new int[104];
        field767++;
        class10.field175 = new int[104];
        class233.field4003 = new int[104];
        class154.field2713 = new int[104];
        class41.field707 = 99;
        byte var2;
        if (arg1) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        class272.field4733 = new byte[var2][104][104];
        class169.field2969 = new byte[var2][104][104];
        class27.field462 = new byte[var2][105][105];
        class247.field4276 = new byte[var2][104][104];
        class162.field2889 = new int[var2][105][105];
        if (arg0 <= 68) {
            field750 = null;
        }
        class48.field857 = new byte[var2][104][104];
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(BLff;Ljc;Z)[I")
    public final int[] method344(byte arg0, class3 arg1, class160 arg2, boolean arg3) {
        field749++;
        if (this.field764.method63(arg1, arg2, (byte) -108)) {
            int var5 = -83 % ((arg0 + 10) / 44);
            int var6 = arg3 ? 64 : 128;
            return this.field764.method61(var6, arg2, 1.0D, false, var6, this.field748, arg1, -112);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "(III)V")
    public static final void method345(int arg0, int arg1, int arg2) {
        field753++;
        if (arg2 <= -10) {
            class43 var3 = class270.method1847(arg1, -10277, 7);
            var3.method333(-124);
            var3.field740 = arg0;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILjc;Lff;)Z")
    public final boolean method346(int arg0, class160 arg1, class3 arg2) {
        if (arg0 <= 53) {
            this.method342(false, (byte) 59, (class3) null, (class160) null, 0.79593295F);
        }
        field769++;
        return this.field764.method63(arg2, arg1, (byte) 83);
    }

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "(I)V")
    public static void method347(int arg0) {
        field758 = null;
        if (arg0 < -65) {
            field762 = null;
            field760 = null;
            field750 = null;
            field747 = null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        super.finalize();
        field757++;
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Lrg;)V")
    public class44(class239 arg0) {
        this.field764 = new class6(arg0);
        this.field761 = arg0.method1651(4139) == 1;
        this.field748 = arg0.method1651(4139) == 1;
        arg0.method1651(4139);
        arg0.method1651(4139);
        int var2 = arg0.method1651(4139) & 0x3;
        this.field765 = arg0.method1656(79);
        this.field768 = arg0.method1656(36);
        arg0.method1651(4139);
        arg0.method1651(4139);
    }
}
