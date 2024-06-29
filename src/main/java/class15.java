import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ica")
public class class15 extends class349 {

    @OriginalMember(owner = "client!ica", name = "E", descriptor = "Lcb;")
    public static class318 field125 = new class318(114, 12);

    @OriginalMember(owner = "client!ica", name = "J", descriptor = "I")
    public static int field129 = 1405;

    @OriginalMember(owner = "client!ica", name = "B", descriptor = "I")
    public static int field122;

    @OriginalMember(owner = "client!ica", name = "D", descriptor = "I")
    public static int field124;

    @OriginalMember(owner = "client!ica", name = "G", descriptor = "I")
    public static int field126;

    @OriginalMember(owner = "client!ica", name = "I", descriptor = "I")
    public static int field128;

    @OriginalMember(owner = "client!ica", name = "K", descriptor = "I")
    public static int field130;

    @OriginalMember(owner = "client!ica", name = "H", descriptor = "[I")
    public static int[] field127;

    @OriginalMember(owner = "client!ica", name = "C", descriptor = "[Lvca;")
    private class499[] field123;

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(IB)[[I", line = 3)
    public final int[][] method9(int arg0, byte arg1) {
        ++field126;
        int[][] var3 = super.field5103.method2268(true, arg0);
        int var4 = 114 % ((arg1 - -32) / 47);
        if (super.field5103.field5314) {
            int var5 = class39.field497;
            int var6 = class442.field6080;
            int[][] var7 = new int[var6][var5];
            int[][][] var8 = super.field5103.method2266((byte) 33);
            this.method83(0, var7);
            for (int var9 = 0; class442.field6080 > var9; ++var9) {
                int[] var10 = var7[var9];
                int[][] var11 = var8[var9];
                int[] var12 = var11[0];
                int[] var13 = var11[1];
                int[] var14 = var11[2];
                for (int var15 = 0; var15 < class39.field497; ++var15) {
                    int var16 = var10[var15];
                    var14[var15] = class230.method1424(var16, 255) << 4;
                    var13[var15] = class230.method1424(4080, var16 >> 4);
                    var12[var15] = class230.method1424(4080, var16 >> 12);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ica", name = "b", descriptor = "(BI)[I", line = 65)
    public final int[] method13(byte arg0, int arg1) {
        int var3 = -88 / ((arg0 - 56) / 41);
        ++field124;
        int[] var4 = super.field5109.method3088(arg1, (byte) 26);
        if (super.field5109.field7515) {
            this.method83(0, super.field5109.method3084(-101));
        }
        return var4;
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(IILdga;)V", line = 89)
    public final void method5(int arg0, int arg1, class138 arg2) {
        if (arg0 == 4095) {
            ++field122;
            if (~arg1 == -1) {
                this.field123 = new class499[arg2.method957((byte) -63)];
                for (int var4 = 0; this.field123.length > var4; ++var4) {
                    int var5 = arg2.method957((byte) -65);
                    if (var5 != 0) {
                        if (var5 != 1) {
                            if (var5 != 2) {
                                if (~var5 == -4) {
                                    this.field123[var4] = class569.method3209(arg2, 3069);
                                }
                            } else {
                                this.field123[var4] = class531.method3015(arg2, class599.method3320(arg0, 4083));
                            }
                        } else {
                            this.field123[var4] = class159.method1079((byte) 126, arg2);
                        }
                    } else {
                        this.field123[var4] = class218.method1345(arg2, false);
                    }
                }
            } else if (~arg1 == -2) {
                super.field5100 = arg2.method957((byte) -107) == 1;
            }
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(I[[I)V", line = 173)
    private final void method83(int arg0, int[][] arg1) {
        ++field130;
        int var3 = class39.field497;
        int var4 = class442.field6080;
        class52.method301(arg1, (byte) -101);
        class637.method3469(arg0 ^ 62, arg0, class4.field38, class144.field1839, 0);
        if (this.field123 != null) {
            for (int var5 = 0; this.field123.length > var5; ++var5) {
                class499 var6 = this.field123[var5];
                int var7 = var6.field6738;
                int var8 = var6.field6739;
                if (var7 >= 0) {
                    if (~var8 > -1) {
                        var6.method1380(var4, (byte) -20, var3);
                    } else {
                        var6.method1374(var3, -114, var4);
                    }
                } else if (var8 >= 0) {
                    var6.method1376(101, var4, var3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ica", name = "f", descriptor = "(I)V", line = 227)
    public static void method84(int arg0) {
        field125 = null;
        if (arg0 != 0) {
            field129 = -122;
        }
        field127 = null;
    }

    @OriginalMember(owner = "client!ica", name = "<init>", descriptor = "()V", line = 239)
    public class15() {
        super(0, true);
    }
}
