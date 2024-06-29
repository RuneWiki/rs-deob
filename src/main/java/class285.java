import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class285 {

    @OriginalMember(owner = "client!nn", name = "f", descriptor = "Lff;")
    private class9 field3828 = new class9(16);

    @OriginalMember(owner = "client!nn", name = "e", descriptor = "Lvh;")
    private class240 field3827;

    @OriginalMember(owner = "client!nn", name = "n", descriptor = "[S")
    public static short[] field3836 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "I")
    public static int field3824 = -1;

    @OriginalMember(owner = "client!nn", name = "m", descriptor = "B")
    public static byte field3835;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "I")
    public static int field3825;

    @OriginalMember(owner = "client!nn", name = "d", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!nn", name = "g", descriptor = "I")
    public static int field3829;

    @OriginalMember(owner = "client!nn", name = "h", descriptor = "I")
    public static int field3830;

    @OriginalMember(owner = "client!nn", name = "i", descriptor = "I")
    public static int field3831;

    @OriginalMember(owner = "client!nn", name = "j", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!nn", name = "k", descriptor = "I")
    public static int field3833;

    @OriginalMember(owner = "client!nn", name = "l", descriptor = "I")
    public static int field3834;

    @OriginalMember(owner = "client!nn", name = "o", descriptor = "I")
    public static int field3837;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(IIII)I")
    public static final int method1625(int arg0, int arg1, int arg2, int arg3) {
        field3831++;
        if (arg0 < 44) {
            field3836 = null;
        }
        if ((class456.field6661[arg1][arg2][arg3] & 0x8) == 0) {
            return arg1 <= 0 || (class456.field6661[1][arg2][arg3] & 0x2) == 0 ? arg1 : arg1 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(II)Lsp;")
    private final class449 method1626(int arg0, int arg1) {
        field3825++;
        class9 var3 = this.field3828;
        class449 var4;
        synchronized (this.field3828) {
            var4 = (class449) this.field3828.method56((long) arg0, 92);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field3827.method1411(true, arg0, arg1);
        class449 var6 = new class449();
        if (var5 != null) {
            var6.method2648(new class365(var5), arg1 - 28);
        }
        class9 var7 = this.field3828;
        synchronized (this.field3828) {
            this.field3828.method73((long) arg0, var6, 26425);
            return var6;
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(I)V")
    public static void method1627(int arg0) {
        if (arg0 != 2) {
            method1627(-21);
        }
        field3836 = null;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(Ljp;IIIII)Lmd;")
    public final class380 method1628(class236 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3823++;
        if (arg5 != 0) {
            this.field3828 = null;
        }
        class417[] var7 = null;
        class449 var8 = this.method1626(arg4, arg5 ^ 0x1D);
        if (var8.field6487 != null) {
            var7 = new class417[var8.field6487.length];
            for (int var9 = 0; var9 < var7.length; var9++) {
                class512 var10 = arg0.method1377(30, var8.field6487[var9]);
                var7[var9] = new class417(var10.field7531, var10.field7530, var10.field7523, var10.field7524, var10.field7522, var10.field7528, var10.field7532, var10.field7529);
            }
        }
        return new class380(var8.field6485, var7, var8.field6482, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "(I)V")
    public static final void method1629(int arg0) {
        field3837++;
        class45.field638.method2035(false);
        class159.field2290 = null;
        class510.field7488 = arg0;
    }

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "(II)V")
    public final void method1630(int arg0, int arg1) {
        field3826++;
        class9 var3 = this.field3828;
        synchronized (this.field3828) {
            if (arg0 == 1288) {
                this.field3828.method61((byte) -67, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(III[BIII)V")
    public static final void method1631(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6) {
        field3833++;
        if (arg5 > 0 && !class455.method2685(arg5, 20721)) {
            throw new IllegalArgumentException("");
        } else if (arg6 <= arg4 || class455.method2685(arg6, 20721)) {
            int var7 = class185.method1115(-127, arg1);
            int var8 = 0;
            int var9 = arg5 < arg6 ? arg5 : arg6;
            int var10 = arg5 >> 1;
            int var11 = arg6 >> 1;
            byte[] var12 = arg3;
            byte[] var13 = new byte[var10 * var11 * var7];
            while (true) {
                OpenGL.glTexImage2Dub(arg2, var8, arg0, arg5, arg6, 0, arg1, 5121, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg5 * var7;
                for (int var15 = 0; var15 < var7; var15++) {
                    int var17 = var15;
                    int var18 = var15;
                    int var19 = var14 + var15;
                    for (int var20 = 0; var20 < var11; var20++) {
                        for (int var21 = 0; var21 < var10; var21++) {
                            byte var22 = var12[var18];
                            int var23 = var7 + var18;
                            int var24 = var12[var23] + var22;
                            int var25 = var12[var19] + var24;
                            var18 = var7 + var23;
                            int var26 = var7 + var19;
                            int var27 = var12[var26] + var25;
                            var13[var17] = (byte) (var27 >> 2);
                            var19 = var7 + var26;
                            var17 += var7;
                        }
                        var18 += var14;
                        var19 += var14;
                    }
                }
                byte[] var16 = var13;
                var13 = var12;
                arg6 = var11;
                arg5 = var10;
                var12 = var16;
                var11 >>= 0x1;
                var9 >>= 0x1;
                var10 >>= 0x1;
                var8++;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "(I)V")
    public final void method1632(int arg0) {
        if (arg0 != 1) {
            method1627(-117);
        }
        field3832++;
        class9 var2 = this.field3828;
        synchronized (this.field3828) {
            this.field3828.method65(false);
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(BII)I")
    public static final int method1633(byte arg0, int arg1, int arg2) {
        field3834++;
        int var3 = 3 / ((arg0 - 68) / 55);
        return arg2 == 1 || arg2 == 3 ? class132.field1893[arg1 & 0x3] : class109.field1486[arg1 & 0x3];
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(B)V")
    public final void method1634(byte arg0) {
        class9 var2 = this.field3828;
        synchronized (this.field3828) {
            int var3 = -54 % ((arg0 - 46) / 47);
            this.field3828.method67(109);
        }
        field3830++;
    }

    @OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(Llf;ILvh;)V")
    public class285(class157 arg0, int arg1, class240 arg2) {
        this.field3827 = arg2;
        this.field3827.method1397((byte) -119, 29);
    }
}
