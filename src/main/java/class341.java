import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class341 {

    @OriginalMember(owner = "client!db", name = "l", descriptor = "I")
    private int field4771 = -1;

    @OriginalMember(owner = "client!db", name = "n", descriptor = "Z")
    public boolean field4773 = true;

    @OriginalMember(owner = "client!db", name = "p", descriptor = "I")
    private int field4775;

    @OriginalMember(owner = "client!db", name = "o", descriptor = "Lee;")
    private class703 field4774;

    @OriginalMember(owner = "client!db", name = "j", descriptor = "I")
    private int field4769;

    @OriginalMember(owner = "client!db", name = "x", descriptor = "Ljaa;")
    private class640 field4783;

    @OriginalMember(owner = "client!db", name = "r", descriptor = "Lfk;")
    private class678 field4777;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "I")
    public int field4760;

    @OriginalMember(owner = "client!db", name = "s", descriptor = "I")
    private int field4778;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "I")
    private int field4763;

    @OriginalMember(owner = "client!db", name = "q", descriptor = "Lra;")
    private class118 field4776;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "Z")
    public static boolean field4764 = false;

    @OriginalMember(owner = "client!db", name = "w", descriptor = "I")
    public static int field4782 = 1400;

    @OriginalMember(owner = "client!db", name = "v", descriptor = "I")
    public static int field4781 = -1;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "I")
    public static int field4761;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "I")
    public static int field4762;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "I")
    public static int field4765;

    @OriginalMember(owner = "client!db", name = "g", descriptor = "I")
    public static int field4766;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "I")
    public static int field4767;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "I")
    public static int field4768;

    @OriginalMember(owner = "client!db", name = "k", descriptor = "I")
    public static int field4770;

    @OriginalMember(owner = "client!db", name = "u", descriptor = "I")
    public static int field4780;

    @OriginalMember(owner = "client!db", name = "t", descriptor = "[I")
    public static int[] field4779;

    @OriginalMember(owner = "client!db", name = "m", descriptor = "[Lvm;")
    public static class713[] field4772;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(II)Z")
    public static final boolean method2166(int arg0, int arg1) {
        if (arg1 != 17) {
            method2166(62, 47);
        }
        field4765++;
        return arg0 == 19 || arg0 == 57 || arg0 == 1002 || arg0 == 17 || arg0 == 16;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(III)Z")
    public static final boolean method2167(int arg0, int arg1, int arg2) {
        field4770++;
        return arg1 == -15254 ? class182.method1234(arg0, 16, arg2) & class512.method2989((byte) 107, arg0, arg2) : true;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Laa;Lofa;IIZLeb;ILjava/lang/String;Lda;III)V")
    public static final void method2168(class512 arg0, class347 arg1, int arg2, int arg3, boolean arg4, class651 arg5, int arg6, String arg7, class67 arg8, int arg9, int arg10, int arg11) {
        field4761++;
        int var12;
        if (class697.field9252 == 4) {
            var12 = (int) class514.field7144 & 0x3FFF;
        } else {
            var12 = (int) class514.field7144 + class551.field7614 & 0x3FFF;
        }
        int var13 = Math.max(arg1.field4986 / 2, arg1.field4940 / 2) + 10;
        int var14 = arg9 * arg9 + arg10 * arg10;
        if (var14 > (var13 * var13)) {
            return;
        }
        int var15 = class110.field1524[var12];
        int var16 = class110.field1523[var12];
        if (class697.field9252 != 4) {
            var15 = var15 * 256 / (class767.field10544 + 256);
            var16 = var16 * 256 / (class767.field10544 + 256);
        }
        int var17 = arg9 * var15 + arg10 * var16 >> 14;
        int var18 = arg9 * var16 - arg10 * var15 >> 14;
        int var19 = arg5.method3626(null, arg7, arg4, 100);
        int var20 = arg5.method3616(null, 0, (byte) 54, 100, arg7);
        int var21 = var17 - var19 / 2;
        if (var21 >= -arg1.field4986 && var21 <= arg1.field4986 && -arg1.field4940 <= var18 && var18 <= arg1.field4940) {
            arg8.method557(arg1.field4940 / 2 + arg3 - arg6 - var18 - var20, arg1.field4986 / 2 + (var21 - -arg11), null, null, 1, (byte) 113, arg7, var19, 0, 0, arg0, arg3, arg11, arg2, 0, 50);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIII)V")
    public static final void method2169(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4780++;
        float var5 = (float) class752.field10181 / (float) class752.field10176;
        int var6 = arg3;
        int var7 = arg1;
        if (arg0 != 0) {
            field4772 = null;
        }
        if ((var5 < 1.0F)) {
            var7 = (int) ((float) arg3 * var5);
        } else {
            var6 = (int) ((float) arg1 / var5);
        }
        int var8 = arg4 - (arg1 - var7) / 2;
        int var9 = arg2 - (arg3 - var6) / 2;
        class313.field4423 = -1;
        class720.field9789 = class752.field10176 * var9 / var6;
        class213.field2800 = -1;
        class81.field1129 = class752.field10181 - class752.field10181 * var8 / var7;
        class642.method3536(arg0 + 125);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lra;II)V")
    public final void method2170(class118 arg0, int arg1, int arg2) {
        if (arg1 > arg2) {
            this.method2172(arg2);
            this.field4774.method3882(0, this.field4777);
            this.field4774.method2820(arg1, 0, -13847, this.field4778 + 1 - this.field4763, class356.field5191, this.field4763, arg0);
        }
        field4762++;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V")
    public static void method2171(byte arg0) {
        field4772 = null;
        if (arg0 != 6) {
            field4764 = false;
        }
        field4779 = null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
    private final void method2172(int arg0) {
        field4767++;
        if (!this.field4773) {
            return;
        }
        this.field4773 = false;
        byte[] var2 = this.field4783.field8629;
        int var3 = 0;
        int var4 = this.field4783.field8628;
        int var5 = this.field4783.field8628 * this.field4775 + this.field4769;
        for (int var6 = -128; var6 < 0; var6++) {
            var3 = (var3 << 8) - var3;
            for (int var17 = -128; var17 < 0; var17++) {
                if (var2[var5++] != 0) {
                    var3++;
                }
            }
            var5 += var4 - 128;
        }
        if (this.field4777 != null && this.field4771 == var3) {
            this.field4773 = false;
            return;
        }
        this.field4771 = var3;
        int var7 = this.field4775 * var4 + this.field4769;
        int var8 = arg0;
        if (!this.field4774.method2784(true, class415.field5986, class325.field4613)) {
            if (class631.field8533 == null) {
                class631.field8533 = new int[16384];
            }
            int[] var13 = class631.field8533;
            for (int var14 = -128; var14 < 0; var14++) {
                for (int var15 = -128; var15 < 0; var15++) {
                    if (var2[var7] == 0) {
                        int var16 = 0;
                        if (var2[var7 - 1] != 0) {
                            var16++;
                        }
                        if (var2[var7 + 1] != 0) {
                            var16++;
                        }
                        if (var2[var7 - var4] != 0) {
                            var16++;
                        }
                        if (var2[var4 + var7] != 0) {
                            var16++;
                        }
                        var13[var8++] = var16 * 17 << 24;
                    } else {
                        var13[var8++] = 1140850688;
                    }
                    var7++;
                }
                var7 += this.field4783.field8628 - 128;
            }
            if (this.field4777 == null) {
                this.field4777 = this.field4774.method3856(false, 128, 128, class631.field8533, false);
                this.field4777.method622(true, false, false);
            } else {
                this.field4777.method620(0, 0, 128, 0, 128, class631.field8533, 98, 128);
            }
            return;
        }
        if (class749.field10090 == null) {
            class749.field10090 = new byte[16384];
        }
        byte[] var9 = class749.field10090;
        for (int var10 = -128; var10 < 0; var10++) {
            for (int var11 = -128; var11 < 0; var11++) {
                if (var2[var7] == 0) {
                    int var12 = 0;
                    if (var2[var7 - 1] != 0) {
                        var12++;
                    }
                    if (var2[var7 + 1] != 0) {
                        var12++;
                    }
                    if (var2[var7 - var4] != 0) {
                        var12++;
                    }
                    if (var2[var4 + var7] != 0) {
                        var12++;
                    }
                    var9[var8++] = (byte) (var12 * 17);
                } else {
                    var9[var8++] = 68;
                }
                var7++;
            }
            var7 += this.field4783.field8628 - 128;
        }
        if (this.field4777 == null) {
            this.field4777 = this.field4774.method3861(128, 128, false, 12413, class749.field10090, class325.field4613);
            this.field4777.method622(true, false, false);
        } else {
            this.field4777.method618(0, 0, 128, 128, 0, class749.field10090, class325.field4613, 128, (byte) 120);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IC)Z")
    public static final boolean method2173(int arg0, char arg1) {
        field4766++;
        if (arg0 != -58) {
            field4764 = false;
        }
        return arg1 >= '0' && arg1 <= '9';
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(I)V")
    public final void method2174(int arg0) {
        field4768++;
        this.method2170(this.field4776, this.field4760, 0);
        if (arg0 <= 24) {
            method2167(100, -28, -101);
        }
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Lee;Ljaa;Lqq;IIIII)V")
    public class341(class703 arg0, class640 arg1, class501 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field4775 = arg7;
        this.field4774 = arg0;
        this.field4769 = arg6;
        this.field4783 = arg1;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var29 = (var12 + var13) * arg2.field4174 + var11;
            for (int var30 = 0; var30 < var9; var30++) {
                short[] var31 = arg2.field7037[var29++];
                if (var31 != null) {
                    var10 += var31.length;
                }
            }
        }
        if (var10 <= 0) {
            this.field4777 = null;
            this.field4760 = 0;
        } else {
            this.field4778 = Integer.MIN_VALUE;
            this.field4763 = Integer.MAX_VALUE;
            this.field4776 = this.field4774.method2813(false, (byte) -102);
            this.field4776.method850(-8165, var10);
            for (int var14 = 0; var14 < 4; var14++) {
                Buffer var15 = this.field4776.method847(-116, true);
                if (var15 != null) {
                    Stream var16 = this.field4774.method3889(0, var15);
                    if (Stream.method3798()) {
                        for (int var23 = 0; var23 < var9; var23++) {
                            int var24 = (var12 + var23) * arg2.field4174 + var11;
                            for (int var25 = 0; var25 < var9; var25++) {
                                short[] var26 = arg2.field7037[var24++];
                                if (var26 != null) {
                                    for (int var27 = 0; var27 < var26.length; var27++) {
                                        int var28 = var26[var27] & 0xFFFF;
                                        if (this.field4778 < var28) {
                                            this.field4778 = var28;
                                        }
                                        if (this.field4763 > var28) {
                                            this.field4763 = var28;
                                        }
                                        var16.method3795(var28);
                                    }
                                }
                            }
                        }
                    } else {
                        for (int var17 = 0; var17 < var9; var17++) {
                            int var18 = (var12 + var17) * arg2.field4174 + var11;
                            for (int var19 = 0; var19 < var9; var19++) {
                                short[] var20 = arg2.field7037[var18++];
                                if (var20 != null) {
                                    for (int var21 = 0; var21 < var20.length; var21++) {
                                        int var22 = var20[var21] & 0xFFFF;
                                        if (this.field4763 > var22) {
                                            this.field4763 = var22;
                                        }
                                        if (var22 > this.field4778) {
                                            this.field4778 = var22;
                                        }
                                        var16.method3804(var22);
                                    }
                                }
                            }
                        }
                    }
                    var16.method3797();
                    if (this.field4776.method849(18579)) {
                        break;
                    }
                }
            }
            this.field4760 = var10 / 3;
        }
    }
}
