import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class447 extends class398 {

    @OriginalMember(owner = "client!pf", name = "M", descriptor = "I")
    private int field6548 = 1;

    @OriginalMember(owner = "client!pf", name = "S", descriptor = "I")
    private int field6553 = 1;

    @OriginalMember(owner = "client!pf", name = "Q", descriptor = "Lgq;")
    public static class418 field6551 = new class418(128);

    @OriginalMember(owner = "client!pf", name = "W", descriptor = "I")
    public static int field6557 = 0;

    @OriginalMember(owner = "client!pf", name = "U", descriptor = "Lar;")
    public static class47 field6555 = new class47();

    @OriginalMember(owner = "client!pf", name = "X", descriptor = "I")
    public static int field6558 = 0;

    @OriginalMember(owner = "client!pf", name = "J", descriptor = "I")
    public static int field6546;

    @OriginalMember(owner = "client!pf", name = "L", descriptor = "I")
    public static int field6547;

    @OriginalMember(owner = "client!pf", name = "O", descriptor = "I")
    public static int field6549;

    @OriginalMember(owner = "client!pf", name = "P", descriptor = "I")
    public static int field6550;

    @OriginalMember(owner = "client!pf", name = "R", descriptor = "I")
    public static int field6552;

    @OriginalMember(owner = "client!pf", name = "V", descriptor = "I")
    public static int field6556;

    @OriginalMember(owner = "client!pf", name = "T", descriptor = "Llm;")
    public static class347 field6554;

    @OriginalMember(owner = "client!pf", name = "Y", descriptor = "Lcq;")
    public static class67 field6559;

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(B)V")
    public static void method2810(byte arg0) {
        if (arg0 == 77) {
            field6554 = null;
            field6551 = null;
            field6559 = null;
            field6555 = null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIILps;BII)V")
    public static final void method2811(int arg0, int arg1, int arg2, int arg3, class394 arg4, byte arg5, int arg6, int arg7) {
        if (!class377.field5491) {
            class308.field4541 = 0;
        } else {
            class308.field4541 = 32;
        }
        ++field6549;
        class377.field5491 = false;
        if (class129.field1788 != 0) {
            if (arg1 >= arg0 && ~(arg0 - -16) < ~arg1 && arg3 <= arg7 && ~arg7 > ~(arg3 - -16)) {
                arg4.field5764 -= 4;
                class407.method2621(arg4, 15);
            } else if (arg0 <= arg1 && arg0 + 16 > arg1 && ~arg7 <= ~(arg3 + -16 + arg6) && ~arg7 > ~(arg3 + arg6)) {
                arg4.field5764 += 4;
                class407.method2621(arg4, 15);
            } else if (~arg1 <= ~(-class308.field4541 + arg0) && arg1 < arg0 - -16 + class308.field4541 && arg3 + 16 <= arg7 && ~(arg3 + arg6 + -16) < ~arg7) {
                int var8 = (arg6 + -32) * arg6 / arg2;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = -(var8 / 2) + -16 + -arg3 + arg7;
                int var10 = arg6 + -32 + -var8;
                arg4.field5764 = (-arg6 + arg2) * var9 / var10;
                class407.method2621(arg4, 15);
                class377.field5491 = true;
            }
        }
        if (class349.field5060 != 0) {
            int var11 = arg4.field5773;
            if (-var11 + arg0 <= arg1 && arg7 >= arg3 && arg1 < arg0 + 16 && arg3 - -arg6 >= arg7) {
                arg4.field5764 += class349.field5060 * 45;
                class407.method2621(arg4, 15);
            }
        }
        int var12 = -80 / ((-20 - arg5) / 48);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)[I")
    public final int[] method95(int arg0, int arg1) {
        ++field6546;
        if (arg1 != 0) {
            return null;
        } else {
            int[] var3 = super.field5927.method305(arg0, (byte) 109);
            if (super.field5927.field591) {
                int var4 = this.field6553 + this.field6553 + 1;
                int var5 = 65536 / var4;
                int var6 = this.field6548 + this.field6548 + 1;
                int var7 = 65536 / var6;
                int[][] var8 = new int[var4][];
                for (int var9 = -this.field6553 + arg0; ~(this.field6553 + arg0) <= ~var9; ++var9) {
                    int[] var13 = this.method2558(0, 29295, var9 & class411.field6070);
                    int[] var14 = new int[class140.field1922];
                    int var15 = 0;
                    for (int var16 = -this.field6548; ~var16 >= ~this.field6548; ++var16) {
                        var15 += var13[var16 & class242.field3233];
                    }
                    int var17 = 0;
                    while (~class140.field1922 < ~var17) {
                        var14[var17] = var7 * var15 >> 16;
                        int var18 = var15 - var13[class242.field3233 & -this.field6548 + var17];
                        ++var17;
                        var15 = var13[class242.field3233 & this.field6548 + var17] + var18;
                    }
                    var8[this.field6553 + var9 + -arg0] = var14;
                }
                for (int var10 = 0; class140.field1922 > var10; ++var10) {
                    int var11 = 0;
                    for (int var12 = 0; var12 < var4; ++var12) {
                        var11 += var8[var12][var10];
                    }
                    var3[var10] = var5 * var11 >> 16;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "()V")
    public class447() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(IB)I")
    public static final int method2812(int arg0, byte arg1) {
        ++field6547;
        if (arg1 != -51) {
            field6557 = 101;
        }
        return 127 & arg0;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lnj;II)V")
    public final void method208(class228 arg0, int arg1, int arg2) {
        ++field6556;
        if (arg2 != -13132) {
            field6558 = 106;
        }
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    super.field5931 = arg0.method1348(arg2 + 13013) == 1;
                }
            } else {
                this.field6553 = arg0.method1348(-102);
            }
        } else {
            this.field6548 = arg0.method1348(-104);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(JB)V")
    public static final void method2813(long arg0, byte arg1) {
        if (class213.field2852 != null) {
            if (~class346.field4979 != -2 && class346.field4979 != 5) {
                if (~class346.field4979 == -5) {
                    class39.method279((byte) 124, arg0);
                }
            } else {
                class406.method2619(arg0, (byte) -101);
            }
        }
        if (arg1 == -101) {
            ++field6552;
            class404.method2604(0, (long) class28.field418, class61.field807);
            if (~class329.field4790 != 0) {
                class388.method2499(arg1 + 102, class329.field4790);
            }
            for (int var3 = 0; class1.field13 > var3; ++var3) {
                if (class270.field3927[var3]) {
                    class57.field775[var3] = true;
                }
                class140.field1920[var3] = class270.field3927[var3];
                class270.field3927[var3] = false;
            }
            class124.field1747 = class28.field418;
            if (class61.field807.method1720()) {
                class28.field410 = true;
            }
            class146.field2002 = null;
            if (~class329.field4790 != 0) {
                class1.field13 = 0;
                class23.method156(arg1 + 104);
            }
            class61.field807.method1652();
            class162.method1000(-19285, class61.field807);
            int var4 = class78.method569(-1);
            if (var4 == -1) {
                var4 = class139.field1909;
            }
            class78.method567(-1, var4);
            class236.method1413(class227.field2988.field734, class379.field5514, class227.field2988.field740, 0, class227.field2981);
            class379.field5514 = 0;
        }
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(II)[[I")
    public final int[][] method99(int arg0, int arg1) {
        ++field6550;
        if (arg1 != 2) {
            field6559 = null;
        }
        int[][] var3 = super.field5933.method2205((byte) -114, arg0);
        if (super.field5933.field4847) {
            int var4 = this.field6553 + this.field6553 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field6548 + 1 + this.field6548;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = -this.field6553 + arg0; ~(this.field6553 + arg0) <= ~var9; ++var9) {
                int[][] var19 = this.method2561(class411.field6070 & var9, (byte) -63, 0);
                int[][] var20 = new int[3][class140.field1922];
                int var21 = 0;
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[0];
                int[] var25 = var19[1];
                int[] var26 = var19[2];
                for (int var27 = -this.field6548; this.field6548 >= var27; ++var27) {
                    int var37 = class242.field3233 & var27;
                    var23 += var26[var37];
                    var22 += var25[var37];
                    var21 += var24[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (~class140.field1922 < ~var31) {
                    var28[var31] = var7 * var21 >> 16;
                    var29[var31] = var7 * var22 >> 16;
                    var30[var31] = var7 * var23 >> 16;
                    int var32 = -this.field6548 + var31 & class242.field3233;
                    int var33 = var23 - var26[var32];
                    int var34 = var22 - var25[var32];
                    int var35 = var21 - var24[var32];
                    ++var31;
                    int var36 = this.field6548 + var31 & class242.field3233;
                    var23 = var26[var36] + var33;
                    var22 = var25[var36] + var34;
                    var21 = var24[var36] + var35;
                }
                var8[-arg0 + this.field6553 + var9] = var20;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; var13 < class140.field1922; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; ~var17 > ~var4; ++var17) {
                    int[][] var18 = var8[var17];
                    var14 += var18[0][var13];
                    var16 += var18[2][var13];
                    var15 += var18[1][var13];
                }
                var10[var13] = var5 * var14 >> 16;
                var11[var13] = var5 * var15 >> 16;
                var12[var13] = var5 * var16 >> 16;
            }
        }
        return var3;
    }
}
