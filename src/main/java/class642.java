import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class642 extends class56 {

    @OriginalMember(owner = "client!ph", name = "J", descriptor = "I")
    private int field8802 = 4096;

    @OriginalMember(owner = "client!ph", name = "O", descriptor = "I")
    private int field8807 = 409;

    @OriginalMember(owner = "client!ph", name = "L", descriptor = "I")
    private int field8804 = 4096;

    @OriginalMember(owner = "client!ph", name = "Q", descriptor = "I")
    private int field8809 = 4096;

    @OriginalMember(owner = "client!ph", name = "K", descriptor = "[I")
    private int[] field8803 = new int[3];

    @OriginalMember(owner = "client!ph", name = "E", descriptor = "I")
    public static int field8797 = -1;

    @OriginalMember(owner = "client!ph", name = "R", descriptor = "[[I")
    public static int[][] field8810 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!ph", name = "G", descriptor = "Lqfa;")
    public static class98 field8799 = new class98(59, 4);

    @OriginalMember(owner = "client!ph", name = "S", descriptor = "Lqfa;")
    public static class98 field8811 = new class98(4, -1);

    @OriginalMember(owner = "client!ph", name = "D", descriptor = "I")
    public static int field8796;

    @OriginalMember(owner = "client!ph", name = "F", descriptor = "I")
    public static int field8798;

    @OriginalMember(owner = "client!ph", name = "I", descriptor = "I")
    public static int field8801;

    @OriginalMember(owner = "client!ph", name = "M", descriptor = "I")
    public static int field8805;

    @OriginalMember(owner = "client!ph", name = "N", descriptor = "I")
    public static int field8806;

    @OriginalMember(owner = "client!ph", name = "P", descriptor = "I")
    public static int field8808;

    @OriginalMember(owner = "client!ph", name = "H", descriptor = "[Ljt;")
    public static class104[] field8800;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZILjava/lang/String;)V")
    public static final void method3549(boolean arg0, int arg1, String arg2) {
        if (!arg0) {
            method3550(false);
        }
        ++field8798;
        class336.method2182(-120, arg2, "", 0, "", "", arg1);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Z)V")
    public static final void method3550(boolean arg0) {
        ++field8796;
        class68 var1 = null;
        try {
            var1 = class316.method2037("2", (byte) -45);
            class675 var2 = new class675(class631.field8721 * 6 + 3);
            var2.method3694(1, -1528071456);
            var2.method3745(-126, class631.field8721);
            for (int var3 = 0; var3 < class718.field9975.length; ++var3) {
                if (class538.field7548[var3]) {
                    var2.method3745(-126, var3);
                    var2.method3733(-49, class718.field9975[var3]);
                }
            }
            var1.method567(0, var2.field9146, var2.field9154, true);
        } catch (Exception var5) {
        }
        try {
            if (var1 != null) {
                var1.method562(-32);
            }
        } catch (Exception var4) {
        }
        class13.field248 = class479.method2864((byte) -103);
        class476.field6748 = arg0;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILee;I)V")
    public final void method6(int arg0, class675 arg1, int arg2) {
        ++field8808;
        if (arg0 == 3731) {
            if (arg2 != 0) {
                if (~arg2 != -2) {
                    if (~arg2 != -3) {
                        if (arg2 != 3) {
                            if (arg2 == 4) {
                                int var5 = arg1.method3756(false);
                                this.field8803[2] = class286.method1877(255, var5) >> 12;
                                this.field8803[0] = class286.method1877(267386880, var5 << 4);
                                this.field8803[1] = class286.method1877(4080, var5 >> 4);
                            }
                        } else {
                            this.field8802 = arg1.method3757((byte) -65);
                        }
                    } else {
                        this.field8804 = arg1.method3757((byte) -65);
                    }
                } else {
                    this.field8809 = arg1.method3757((byte) -65);
                }
            } else {
                this.field8807 = arg1.method3757((byte) -65);
            }
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)[[I")
    public final int[][] method5(int arg0, int arg1) {
        ++field8801;
        int[][] var3 = super.field668.method3009(arg1 + -1, arg0);
        if (arg1 != 1) {
            this.method6(89, (class675) null, -18);
        }
        if (super.field668.field7292) {
            int[][] var4 = this.method369(arg0, -55, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class328.field4576 > var11; ++var11) {
                int var12 = var5[var11];
                int var13 = -this.field8803[0] + var12;
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (~this.field8807 > ~var13) {
                    var8[var11] = var12;
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = -this.field8803[1] + var14;
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (this.field8807 < var15) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = -this.field8803[2] + var16;
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (this.field8807 < var17) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field8802 * var12 >> 12;
                            var9[var11] = this.field8804 * var14 >> 12;
                            var10[var11] = this.field8809 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "(B)V")
    public static void method3551(byte arg0) {
        field8800 = null;
        if (arg0 >= 0) {
            field8799 = null;
        }
        field8810 = null;
        field8799 = null;
        field8811 = null;
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "()V")
    public class642() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "(I)V")
    public static final void method3552(int arg0) {
        if (arg0 < 72) {
            method3549(false, -110, (String) null);
        }
        class452.field6394.method428(class196.field2614, class452.field6397, class267.field3810);
        ++field8806;
    }
}
