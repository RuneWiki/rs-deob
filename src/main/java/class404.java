import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class404 {

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "Z")
    private boolean field5800 = false;

    @OriginalMember(owner = "client!ee", name = "E", descriptor = "I")
    private int field5825 = -1;

    @OriginalMember(owner = "client!ee", name = "F", descriptor = "Z")
    private boolean field5826 = false;

    @OriginalMember(owner = "client!ee", name = "D", descriptor = "I")
    private int field5824 = -1;

    @OriginalMember(owner = "client!ee", name = "N", descriptor = "I")
    private int field5834 = -32768;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "B")
    private byte field5801;

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "I")
    public int field5804;

    @OriginalMember(owner = "client!ee", name = "O", descriptor = "I")
    public int field5835;

    @OriginalMember(owner = "client!ee", name = "z", descriptor = "I")
    public int field5820;

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "I")
    private int field5806;

    @OriginalMember(owner = "client!ee", name = "I", descriptor = "B")
    private byte field5829;

    @OriginalMember(owner = "client!ee", name = "u", descriptor = "I")
    private int field5815;

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "Z")
    private boolean field5803;

    @OriginalMember(owner = "client!ee", name = "x", descriptor = "Z")
    public static boolean field5818 = false;

    @OriginalMember(owner = "client!ee", name = "s", descriptor = "I")
    public static int field5813 = 0;

    @OriginalMember(owner = "client!ee", name = "M", descriptor = "Liq;")
    public static class362 field5833 = new class362("Examine", "Untersuchen", "Examiner", "Examinar");

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
    private int field5795;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    private int field5796;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
    public static int field5797;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
    private int field5798;

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "I")
    public static int field5802;

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "I")
    public static int field5805;

    @OriginalMember(owner = "client!ee", name = "n", descriptor = "I")
    public static int field5808;

    @OriginalMember(owner = "client!ee", name = "o", descriptor = "I")
    private int field5809;

    @OriginalMember(owner = "client!ee", name = "p", descriptor = "I")
    public static int field5810;

    @OriginalMember(owner = "client!ee", name = "r", descriptor = "I")
    public static int field5812;

    @OriginalMember(owner = "client!ee", name = "t", descriptor = "I")
    public static int field5814;

    @OriginalMember(owner = "client!ee", name = "v", descriptor = "I")
    public static int field5816;

    @OriginalMember(owner = "client!ee", name = "w", descriptor = "I")
    public static int field5817;

    @OriginalMember(owner = "client!ee", name = "y", descriptor = "I")
    public static int field5819;

    @OriginalMember(owner = "client!ee", name = "A", descriptor = "I")
    public static int field5821;

    @OriginalMember(owner = "client!ee", name = "B", descriptor = "I")
    public static int field5822;

    @OriginalMember(owner = "client!ee", name = "C", descriptor = "I")
    public static int field5823;

    @OriginalMember(owner = "client!ee", name = "G", descriptor = "I")
    public static int field5827;

    @OriginalMember(owner = "client!ee", name = "H", descriptor = "I")
    public static int field5828;

    @OriginalMember(owner = "client!ee", name = "K", descriptor = "I")
    public static int field5831;

    @OriginalMember(owner = "client!ee", name = "L", descriptor = "I")
    public static int field5832;

    @OriginalMember(owner = "client!ee", name = "J", descriptor = "Lmm;")
    private class152 field5830;

    @OriginalMember(owner = "client!ee", name = "P", descriptor = "Lom;")
    public class209 field5836;

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "Lbk;")
    private class210 field5807;

    @OriginalMember(owner = "client!ee", name = "q", descriptor = "Lkb;")
    private class412 field5811;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "[Z")
    private boolean[] field5799;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Z)V", line = 9)
    public static void method2571(boolean arg0) {
        if (!arg0) {
            method2583(false, true, 113, -58, -85, 121);
        }
        field5833 = null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILae;)V", line = 20)
    public final void method2572(int arg0, class134 arg1) {
        if (this.field5830 != null) {
            class122.method778(this.field5830, this.field5801, this.field5806, this.field5815, this.field5799);
            this.field5830 = null;
            this.field5799 = null;
        }
        if (arg0 != 2) {
            this.field5830 = null;
        }
        field5808++;
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Lae;Ljh;IIIIIIZI)V", line = 1159)
    public class404(class134 arg0, class88 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        this.field5801 = (byte) arg5;
        this.field5804 = arg2;
        this.field5835 = arg3;
        this.field5820 = arg1.field1026;
        this.field5800 = arg8;
        this.field5806 = arg6;
        this.field5829 = (byte) arg4;
        this.field5815 = arg7;
        this.field5803 = arg0.method615() && arg1.field995 && !this.field5800;
        if (arg9 != -1) {
            this.field5826 = true;
        }
        this.method2581(1896462951, arg9);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BII)V", line = 44)
    private final void method2573(byte arg0, int arg1, int arg2) {
        field5812++;
        if (arg0 >= -113) {
            return;
        }
        label90: while (true) {
            if (this.field5811 == null) {
                if (this.field5826) {
                    return;
                }
                this.method2581(1896462951, -1);
                if (this.field5811 == null) {
                    return;
                }
            }
            int var4 = class189.field2726 - this.field5798;
            if (var4 > 100 && this.field5811.field5915 > 0) {
                int var5 = this.field5811.field5925.length - this.field5811.field5915;
                while (this.field5796 < var5 && var4 > this.field5811.field5918[this.field5796]) {
                    var4 -= this.field5811.field5918[this.field5796];
                    this.field5796++;
                }
                if (this.field5796 >= var5) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field5811.field5925.length; var7++) {
                        var6 += this.field5811.field5918[var7];
                    }
                    var4 %= var6;
                }
                this.field5809 = this.field5796 + 1;
                if (this.field5809 >= this.field5811.field5925.length) {
                    this.field5809 -= this.field5811.field5915;
                    if (this.field5809 < 0 || this.field5811.field5925.length <= this.field5809) {
                        this.field5809 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (var4 <= this.field5811.field5918[this.field5796]) {
                            this.field5795 = var4;
                            this.field5798 = class189.field2726 - var4;
                            return;
                        }
                        class148.method896(false, this.field5811, (byte) 101, arg1, this.field5796, arg2);
                        var4 -= this.field5811.field5918[this.field5796];
                        this.field5796++;
                        if (this.field5811.field5925.length <= this.field5796) {
                            this.field5796 -= this.field5811.field5915;
                            if (this.field5796 < 0 || this.field5796 >= this.field5811.field5925.length) {
                                this.field5811 = null;
                                continue label90;
                            }
                        }
                        this.field5809 = this.field5796 + 1;
                    } while (this.field5809 < this.field5811.field5925.length);
                    this.field5809 -= this.field5811.field5915;
                } while (this.field5809 >= 0 && this.field5809 < this.field5811.field5925.length);
                this.field5809 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IBI)I", line = 144)
    public static final int method2574(int arg0, byte arg1, int arg2) {
        field5827++;
        int var3 = -73 % ((arg1 - 69) / 51);
        int var4 = arg2 * 57 + arg0;
        int var5 = var4 << 13 ^ var4;
        int var6 = (var5 * 15731 * var5 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE;
        return (var6 & 0x7FEB136) >> 19;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BCI)I", line = 164)
    public static final int method2575(byte arg0, char arg1, int arg2) {
        if (arg0 != -111) {
            return -128;
        }
        field5831++;
        int var3 = arg1 << 4;
        if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
            arg1 = Character.toLowerCase(arg1);
            var3 = (arg1 << 4) + 1;
        }
        if (arg1 == 'ñ' && arg2 == 0) {
            var3 = 1762;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IZILae;IZI)Lbk;", line = 187)
    public final class210 method2576(int arg0, boolean arg1, int arg2, class134 arg3, int arg4, boolean arg5, int arg6) {
        field5814++;
        class88 var8 = class374.method2382(this.field5820, false);
        if (var8.field1068 != null) {
            var8 = var8.method480(117);
        }
        if (var8 == null) {
            this.method2572(arg0 ^ 0xFFFFFFF6, arg3);
            this.field5825 = -1;
            this.field5824 = this.field5796;
            return null;
        }
        if (!this.field5826 && this.field5825 != var8.field1026) {
            this.field5807 = null;
            this.method2581(1896462951, -1);
        }
        this.method2573((byte) -119, arg6, arg4);
        boolean var9 = arg5 & this.field5803 & class141.field1739 != 0;
        boolean var10 = var9 & (this.field5825 != var8.field1026 || (this.field5824 != this.field5796 || this.field5811 != null && (this.field5811.field5927 || field5818) && this.field5809 != this.field5796) && class141.field1739 >= 2);
        if (arg1 && !var10) {
            this.field5825 = var8.field1026;
            this.field5824 = this.field5796;
            return null;
        }
        if (var10) {
            class122.method778(this.field5830, this.field5801, this.field5806, this.field5815, this.field5799);
        }
        if (arg0 != -12) {
            method2582(-63, 111, 28, true, 77);
        }
        class327 var11 = class161.field2122[this.field5801];
        class327 var12;
        if (this.field5800) {
            var12 = class98.field1191[0];
        } else {
            var12 = this.field5801 < 3 ? class161.field2122[this.field5801 + 1] : null;
        }
        class210 var13 = null;
        if (this.field5811 != null) {
            if (var10) {
                arg2 |= 0x20000;
            }
            var13 = var8.method481(var11.method342(this.field5806, this.field5815), -2, arg3, var12, this.field5804 == 11 ? 10 : this.field5804, this.field5815, this.field5809, this.field5804 == 11 ? this.field5835 + 4 : this.field5835, this.field5796, this.field5795, this.field5806, arg2, var11, this.field5811);
            if (var13 == null) {
                this.field5799 = null;
                this.field5830 = null;
                this.field5834 = 0;
            } else {
                if (var10) {
                    if (this.field5799 == null) {
                        this.field5799 = new boolean[4];
                    }
                    this.field5830 = var13.method1379(this.field5830);
                    class258.method1733(this.field5830, this.field5801, arg6, arg4, this.field5799);
                }
                this.field5834 = var13.method1405();
            }
            this.field5807 = null;
        } else if (this.field5807 != null && (arg2 & this.field5807.method1410()) == arg2 && this.field5825 == var8.field1026) {
            var13 = this.field5807;
        } else {
            if (this.field5807 != null) {
                arg2 |= this.field5807.method1410();
            }
            class371 var14 = var8.method482(this.field5804 == 11 ? this.field5835 + 4 : this.field5835, var10, var11, arg3, this.field5804 == 11 ? 10 : this.field5804, this.field5806, this.field5815, var11.method342(this.field5806, this.field5815), arg0 - 81, arg2, var12);
            if (var14 == null) {
                this.field5799 = null;
                this.field5834 = 0;
                this.field5807 = null;
                this.field5830 = null;
            } else {
                var13 = var14.field5233;
                this.field5807 = var14.field5233;
                if (var10) {
                    this.field5799 = null;
                    this.field5830 = var14.field5235;
                    class258.method1733(this.field5830, this.field5801, arg6, arg4, (boolean[]) null);
                }
                this.field5834 = var13.method1405();
            }
        }
        this.field5815 = arg4;
        this.field5825 = var8.field1026;
        this.field5824 = this.field5796;
        this.field5806 = arg6;
        return var13;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIZLae;Lbk;I)V", line = 312)
    public final void method2577(int arg0, int arg1, int arg2, int arg3, boolean arg4, class134 arg5, class210 arg6, int arg7) {
        field5810++;
        if (arg0 != 16287) {
            return;
        }
        class42[] var9 = arg6.method1399();
        class190[] var10 = arg6.method1374();
        if ((this.field5836 == null || this.field5836.field2961) && (var9 != null || var10 != null)) {
            class88 var11 = class374.method2382(this.field5820, false);
            if (var11.field1068 != null) {
                var11 = var11.method480(117);
            }
            if (var11 != null) {
                this.field5836 = new class209(class189.field2726);
            }
        }
        if (this.field5836 == null) {
            return;
        }
        if (arg4) {
            this.field5836.method1362(arg5, (long) class189.field2726, var9, var10, false);
        } else {
            this.field5836.method1367((long) class189.field2726);
        }
        this.field5836.method1372(this.field5829, arg7, arg2, arg1, arg3);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)I", line = 350)
    public final int method2578(int arg0) {
        if (arg0 >= -53) {
            return -4;
        } else {
            field5819++;
            return this.field5834;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)V", line = 365)
    public static final void method2579(int arg0, int arg1) {
        if (!class156.field1916) {
            arg1 = -1;
        }
        field5822++;
        if (class299.field4189 == arg1) {
            return;
        }
        if (arg0 != arg1) {
            class50 var2 = class298.method1965(arg1, (byte) 106);
            class375 var3 = var2.method289((byte) -115);
            if (var3 == null) {
                arg1 = -1;
            } else {
                class14.field185.method1262(var3.method2393(), new Point(var2.field600, var2.field592), var3.method2399(), class402.field5767, var3.method2400(), -107);
                class299.field4189 = arg1;
            }
        }
        if (arg1 == -1 && class299.field4189 != -1) {
            class14.field185.method1262((int[]) null, new Point(), -1, class402.field5767, -1, 96);
            class299.field4189 = -1;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IILae;)V", line = 402)
    public static final void method2580(int arg0, int arg1, class134 arg2) {
        field5828++;
        if (arg0 <= 103) {
            field5818 = false;
        }
        class268.method1783(arg2);
        if (arg1 > 1) {
            for (int var3 = 0; var3 < class176.field2403; var3++) {
                for (int var4 = 0; var4 < class383.field5395; var4++) {
                    if ((class399.field5699[1][var3][var4] & 0x2) == 2) {
                        class191.method1293(var3, var4);
                    }
                }
            }
        }
        for (int var5 = 0; var5 < arg1; var5++) {
            for (int var6 = 0; var6 <= class383.field5395; var6++) {
                for (int var7 = 0; var7 <= class176.field2403; var7++) {
                    if ((class143.field1767[var5][var7][var6] & 0x1) != 0) {
                        int var8 = var6;
                        int var9 = var6;
                        int var10 = var5;
                        while (var8 > 0 && (class143.field1767[var5][var7][var8 - 1] & 0x1) != 0) {
                            var8--;
                        }
                        int var11 = var5;
                        while (var9 < class383.field5395 && (class143.field1767[var5][var7][var9 + 1] & 0x1) != 0) {
                            var9++;
                        }
                        label170: while (var10 > 0) {
                            for (int var12 = var8; var12 <= var9; var12++) {
                                if ((class143.field1767[var10 - 1][var7][var12] & 0x1) == 0) {
                                    break label170;
                                }
                            }
                            var10--;
                        }
                        label159: while (var11 < 3) {
                            for (int var13 = var8; var13 <= var9; var13++) {
                                if ((class143.field1767[var11 + 1][var7][var13] & 0x1) == 0) {
                                    break label159;
                                }
                            }
                            var11++;
                        }
                        int var14 = (var9 + 1 - var8) * (var11 + 1 - var10);
                        if (var14 >= 2) {
                            short var15 = 240;
                            int var16 = class419.field5994[var11][var7][var8] - var15;
                            int var17 = class419.field5994[var10][var7][var8];
                            class358.method2296(1, var7 * 128, var7 * 128, var8 * 128, var9 * 128 + 128, var16, var17);
                            for (int var18 = var10; var18 <= var11; var18++) {
                                for (int var19 = var8; var19 <= var9; var19++) {
                                    class143.field1767[var18][var7][var19] = (byte) class33.method210(class143.field1767[var18][var7][var19], -2);
                                }
                            }
                        }
                    }
                    if ((class143.field1767[var5][var7][var6] & 0x2) != 0) {
                        int var20 = var7;
                        int var21 = var7;
                        int var22 = var5;
                        int var23 = var5;
                        while (var20 > 0 && (class143.field1767[var5][var20 - 1][var6] & 0x2) != 0) {
                            var20--;
                        }
                        while (var21 < class176.field2403 && (class143.field1767[var5][var21 + 1][var6] & 0x2) != 0) {
                            var21++;
                        }
                        label224: while (var22 > 0) {
                            for (int var24 = var20; var24 <= var21; var24++) {
                                if ((class143.field1767[var22 - 1][var24][var6] & 0x2) == 0) {
                                    break label224;
                                }
                            }
                            var22--;
                        }
                        label213: while (var23 < 3) {
                            for (int var25 = var20; var25 <= var21; var25++) {
                                if ((class143.field1767[var23 + 1][var25][var6] & 0x2) == 0) {
                                    break label213;
                                }
                            }
                            var23++;
                        }
                        int var26 = (var21 + 1 - var20) * (var23 + 1 - var22);
                        if (var26 >= 2) {
                            short var27 = 240;
                            int var28 = class419.field5994[var23][var20][var6] - var27;
                            int var29 = class419.field5994[var22][var20][var6];
                            class358.method2296(2, var20 * 128, var21 * 128 + 128, var6 * 128, var6 * 128, var28, var29);
                            for (int var30 = var22; var30 <= var23; var30++) {
                                for (int var31 = var20; var31 <= var21; var31++) {
                                    class143.field1767[var30][var31][var6] = (byte) class33.method210(class143.field1767[var30][var31][var6], -3);
                                }
                            }
                        }
                    }
                    if ((class143.field1767[var5][var7][var6] & 0x4) != 0) {
                        int var32 = var7;
                        int var33 = var7;
                        int var34;
                        for (var34 = var6; var34 > 0 && (class143.field1767[var5][var7][var34 - 1] & 0x4) != 0; var34--) {
                        }
                        int var35;
                        for (var35 = var6; var35 < class383.field5395 && (class143.field1767[var5][var7][var35 + 1] & 0x4) != 0; var35++) {
                        }
                        label277: while (var32 > 0) {
                            for (int var36 = var34; var36 <= var35; var36++) {
                                if ((class143.field1767[var5][var32 - 1][var36] & 0x4) == 0) {
                                    break label277;
                                }
                            }
                            var32--;
                        }
                        label266: while (class176.field2403 > var33) {
                            for (int var37 = var34; var37 <= var35; var37++) {
                                if ((class143.field1767[var5][var33 + 1][var37] & 0x4) == 0) {
                                    break label266;
                                }
                            }
                            var33++;
                        }
                        if (((var33 + 1 - var32) * (var35 + 1 - var34)) >= 4) {
                            int var38 = class419.field5994[var5][var32][var34];
                            class358.method2296(4, var32 * 128, var33 * 128 + 128, var34 * 128, var35 * 128 + 128, var38, var38);
                            for (int var39 = var32; var39 <= var33; var39++) {
                                for (int var40 = var34; var40 <= var35; var40++) {
                                    class143.field1767[var5][var39][var40] = (byte) class33.method210(class143.field1767[var5][var39][var40], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(II)V", line = 689)
    private final void method2581(int arg0, int arg1) {
        field5805++;
        int var3 = arg1;
        boolean var4 = false;
        if (arg1 == -1) {
            class88 var5 = class374.method2382(this.field5820, false);
            class88 var6 = var5;
            if (var5.field1068 != null) {
                var5 = var5.method480(114);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field1005 != null) {
                if (this.field5811 != null && var5.method488(this.field5811.field5929, (byte) -62)) {
                    return;
                }
                var3 = var5.method476(-126);
                if (this.field5825 != var5.field1026) {
                    var4 = var5.field1062;
                }
            } else if (var5.field1057 == -1) {
                if (var6 != null && var6.field1005 != null) {
                    if (this.field5811 != null && var6.method488(this.field5811.field5929, (byte) -62)) {
                        return;
                    }
                    var3 = var6.method476(83);
                    if (this.field5825 != var6.field1026) {
                        var4 = var6.field1062;
                    }
                } else if (var6 != null && var6.field1057 != -1 && this.field5825 != var6.field1026) {
                    var3 = var6.field1057;
                    var4 = var6.field1062;
                }
            } else if (this.field5825 != var5.field1026) {
                var4 = var5.field1062;
                var3 = var5.field1057;
            }
        }
        if (arg0 != 1896462951) {
            this.field5829 = -19;
        }
        if (var3 == -1) {
            this.field5811 = null;
            return;
        }
        this.field5807 = null;
        if (this.field5811 == null || this.field5811.field5929 != var3) {
            this.field5811 = class189.method1288(arg0 ^ 0x8EF65A67, var3);
        } else if (this.field5811.field5910 == 0) {
            return;
        }
        if (this.field5811.field5925 == null) {
            this.field5811 = null;
            return;
        }
        if (var4) {
            this.field5796 = (int) ((double) this.field5811.field5925.length * Math.random());
            this.field5795 = (int) (Math.random() * (double) this.field5811.field5918[this.field5796]) + 1;
        } else {
            this.field5796 = 0;
            this.field5795 = 1;
        }
        this.field5809 = this.field5796 + 1;
        if (this.field5809 < 0 || this.field5811.field5925.length <= this.field5809) {
            this.field5809 = -1;
        }
        this.field5798 = class189.field2726 - this.field5795;
    }

    @OriginalMember(owner = "client!ee", name = "finalize", descriptor = "()V", line = 817)
    protected final void finalize() {
        field5802++;
        if (this.field5836 != null) {
            this.field5836.method1369();
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIZI)V", line = 831)
    public static final void method2582(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (arg3) {
            return;
        }
        if (class388.field5464 <= arg4 && arg4 <= class219.field3080) {
            int var5 = class130.method805(!arg3, class235.field3295, arg1, class81.field946);
            int var6 = class130.method805(!arg3, class235.field3295, arg0, class81.field946);
            class46.method273(var6, 26, arg2, var5, arg4);
        }
        field5816++;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZZIIII)V", line = 851)
    public static final void method2583(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field5797++;
        if (class250.field3570 == null) {
            class151.field1873.method827(arg4, arg5, arg2, -93, arg3, -16777216);
            return;
        }
        class348.field4931++;
        if (class384.field5422 != null && (class384.field5422.field3284 + 64 - class384.field5422.method242(-30129) * 64 >> 7) == class33.field386 && class384.field5422.field3269 - (class384.field5422.method242(-30129) - 1) * 64 >> 7 == class443.field6343) {
            class443.field6343 = -1;
            class33.field386 = -1;
            class385.method2472((byte) 46);
        }
        class166.method1126((byte) 78);
        if (!arg0) {
            class132.method815((byte) 82);
        }
        class397.method2534(95);
        class216.method1449(arg3, arg5, (byte) 70, arg4, true, arg2);
        int var6 = class42.field516;
        int var7 = class380.field5345;
        int var8 = class153.field1891;
        int var9 = class408.field5880;
        if (class129.field1568 == 1) {
            int var12 = (int) class292.field4085;
            if (class186.field2707 >> 8 > var12) {
                var12 = class186.field2707 >> 8;
            }
            if (class442.field6335[4] && var12 < class249.field3555[4] + 128) {
                var12 = class249.field3555[4] + 128;
            }
            int var13 = (int) class441.field6333 + class150.field1854 & 0x3FFF;
            class338.method2175((byte) 41, var13, var12, var6, class214.field3034, (var12 >> 3) * 3 + 600, class114.method709(class129.field1570, class384.field5422.field3284, 0, class384.field5422.field3269) + -50, class331.field4680);
        } else if (class129.field1568 == 4) {
            int var10 = (int) class292.field4085;
            if (var10 < (class186.field2707 >> 8)) {
                var10 = class186.field2707 >> 8;
            }
            if (class442.field6335[4] && (class249.field3555[4] + 128) > var10) {
                var10 = class249.field3555[4] + 128;
            }
            int var11 = (int) class441.field6333 & 0x3FFF;
            class338.method2175((byte) 41, var11, var10, var6, class214.field3034, (var10 >> 3) * 3 + 600, class114.method709(class129.field1570, class130.field1576, 0, class79.field929) + -50, class331.field4680);
        } else if (class129.field1568 == 5) {
            class131.method814(var6, (byte) 19);
        }
        int var14 = class334.field4730;
        int var15 = class276.field3925;
        int var16 = class265.field3774;
        int var17 = class138.field1722;
        int var18 = class377.field5324;
        for (int var19 = 0; var19 < 5; var19++) {
            if (class442.field6335[var19]) {
                int var22 = (int) ((double) (-class95.field1137[var19]) + (double) (class95.field1137[var19] * 2 + 1) * Math.random() + Math.sin((double) class318.field4516[var19] / 100.0D * (double) class365.field5185[var19]) * (double) class249.field3555[var19]);
                if (var19 == 0) {
                    class334.field4730 += var22;
                }
                if (var19 == 2) {
                    class265.field3774 += var22;
                }
                if (var19 == 4) {
                    class138.field1722 += var22;
                    if (class138.field1722 < 1024) {
                        class138.field1722 = 1024;
                    } else if (class138.field1722 > 3072) {
                        class138.field1722 = 3072;
                    }
                }
                if (var19 == 3) {
                    class377.field5324 = class377.field5324 + var22 & 0x3FFF;
                }
                if (var19 == 1) {
                    class276.field3925 += var22;
                }
            }
        }
        if (class334.field4730 < 0) {
            class334.field4730 = 0;
        }
        if (class265.field3774 < 0) {
            class265.field3774 = 0;
        }
        if ((class415.field5953 << 7) - 1 < class334.field4730) {
            class334.field4730 = (class415.field5953 << 7) - 1;
        }
        if ((class299.field4190 << 7) - 1 < class265.field3774) {
            class265.field3774 = (class299.field4190 << 7) - 1;
        }
        class271.method1791(-15170);
        class132.method819(-43);
        class151.field1873.method660(var7, var9, var7 + var8, var6 + var9);
        class151.field1873.method600();
        int var20 = class306.field4327;
        if (class332.field4704 == null) {
            class151.field1873.method601(var20);
        } else {
            class332.field4704.method1794(class138.field1722, class377.field5324, var7, 88, var6, var8, var20, class127.field1541 << 3, class151.field1873, var9);
        }
        class356.method2270(arg1);
        class65.field743.method131(class334.field4730, class276.field3925, class265.field3774, -class138.field1722 & 0x3FFF, -class377.field5324 & 0x3FFF, -class232.field3265 & 0x3FFF);
        class151.field1873.method628(class65.field743);
        class151.field1873.method652(var8 / 2 + var7, var6 / 2 + var9, class339.field4815 << 1, class339.field4815 << 1);
        class183.method1228(class339.field4815 << 1, var8 / 2 + var7, (byte) 108, var6 / 2 + var9, class339.field4815 << 1);
        class414.method2638(-class377.field5324 & 0x3FFF, class334.field4730, class276.field3925, -class232.field3265 & 0x3FFF, -class138.field1722 & 0x3FFF, 0, class265.field3774);
        byte var21 = class443.method2762((byte) -107) == 2 ? (byte) class348.field4931 : 1;
        class369.method2349(class151.field1873, class189.field2726, class216.field3052, class65.field743, class334.field4730, class276.field3925, class265.field3774, class325.field4622, class300.field4212, class237.field3367, class18.field206, class237.field3380, class273.field3874, class129.field1570 + 1, var21, class384.field5422.field3284 >> 7, class384.field5422.field3269 >> 7, !class414.field5947);
        class356.method2270(false);
        if (class40.field475 == 30) {
            class347.method2222(256, var7, var9, 256, var8, var6, -87);
            class177.method1199(var7, var8, var9, 256, 256, var6, -40);
            class452.method2800(var9, var8, 256, 256, var6, var7, (byte) -89);
            class188.method1286(var9, var8, var6, -1, var7);
        }
        class408.method2609();
        class276.field3925 = var15;
        class138.field1722 = var17;
        class334.field4730 = var14;
        class265.field3774 = var16;
        class377.field5324 = var18;
        if (class351.field4965 && class73.field879.method2324(97) == 0) {
            class351.field4965 = false;
        }
        if (class351.field4965) {
            class151.field1873.method827(var9, var7, var6, -93, var8, -16777216);
            class440.method2749((byte) -125, false, class248.field3544.method2331(25, class271.field3836), class73.field874);
        }
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(II)V", line = 1036)
    public final void method2584(int arg0, int arg1) {
        field5832++;
        int var3 = 105 % ((arg1 + 67) / 49);
        this.field5826 = true;
        this.method2581(1896462951, arg0);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lae;B)V", line = 1049)
    public final void method2585(class134 arg0, byte arg1) {
        if (arg1 < -103) {
            this.method2576(-12, true, 131072, arg0, this.field5815, true, this.field5806);
            field5823++;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIII)Lfj;", line = 1060)
    public static final class396 method2586(int arg0, int arg1, int arg2, int arg3) {
        field5821++;
        class193 var4 = class250.field3570[arg2][arg3][arg1];
        if (var4 == null) {
            return null;
        }
        class396 var5 = null;
        int var6 = -1;
        if (arg0 != -1675668601) {
            return null;
        }
        for (class250 var7 = var4.field2779; var7 != null; var7 = var7.field3568) {
            class233 var8 = var7.field3571;
            if (var8 instanceof class396) {
                class396 var9 = (class396) var8;
                int var10 = var9.method242(arg0 + 1675638472) * 64 + 60 - 64;
                int var11 = var9.field3284 - var10 >> 7;
                int var12 = var9.field3269 - var10 >> 7;
                int var13 = var9.field3284 + var10 >> 7;
                int var14 = var9.field3269 + var10 >> 7;
                if (var11 <= arg3 && var12 <= arg1 && arg3 <= var13 && arg1 <= var14) {
                    int var15 = (var14 + 1 - arg1) * (var13 + 1 - arg3);
                    if (var6 < var15) {
                        var6 = var15;
                        var5 = var9;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)Z", line = 1139)
    public final boolean method2587(int arg0) {
        field5817++;
        int var2 = -123 / ((arg0 - 71) / 49);
        return this.field5803;
    }
}
