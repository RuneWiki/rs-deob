import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class46 extends class84 {

    @OriginalMember(owner = "client!kh", name = "N", descriptor = "I")
    public static int field662 = 0;

    @OriginalMember(owner = "client!kh", name = "Q", descriptor = "J")
    public static long field665 = 0L;

    @OriginalMember(owner = "client!kh", name = "Y", descriptor = "I")
    public static int field673 = 0;

    @OriginalMember(owner = "client!kh", name = "ab", descriptor = "I")
    public static int field675 = 0;

    @OriginalMember(owner = "client!kh", name = "bb", descriptor = "[I")
    public static int[] field676 = new int[] { 0, 12, 6, 6, 0, -2, -2, 0, 0, 0, 0, 3, 0, 0, 0, 0, -2, 0, 0, 0, -1, 0, 0, -1, 8, 10, 0, 1, 0, 0, 2, 1, 3, 0, 0, 0, -1, -1, 0, 0, 7, 2, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 4, 15, 9, 0, 0, 0, 0, 0, 5, 0, 0, 0, -2, 0, -1, 0, 0, 0, 2, 0, -1, 0, 0, 7, 6, 3, 0, 0, -1, -1, 6, 10, -2, 0, 0, -2, 0, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, -2, 0, 0, 14, 11, 0, 0, 14, 0, 0, 0, 0, 0, 3, 3, 0, 2, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0, -2, 6, 0, 0, 17, 0, 0, 0, 0, 0, 0, 8, 0, -1, 8, 8, 0, 7, 8, 0, 0, -2, 8, 4, 8, 1, 0, -1, 0, 6, 0, 1, 2, 6, 0, 6, 0, 0, 4, 0, 0, 0, 5, 0, -1, 0, 20, 1, 0, -1, 3, 0, 0, 4, -2, 0, 0, 5, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, -1, 12, 0, 0, 0, 0, 0, 0, 0, 6, 0, 28, 5, 0, 0, 8, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, -2, 0, 0, 0, 0, 0, 0, 7, 15, 12, 10, 12, 2, 0, -2, 2, 0, 0, 0, 0, 0, 0, -1, 0, 6 };

    @OriginalMember(owner = "client!kh", name = "O", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!kh", name = "P", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!kh", name = "R", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!kh", name = "S", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!kh", name = "T", descriptor = "I")
    public static int field668;

    @OriginalMember(owner = "client!kh", name = "U", descriptor = "I")
    public static int field669;

    @OriginalMember(owner = "client!kh", name = "V", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!kh", name = "W", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!kh", name = "X", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!kh", name = "Z", descriptor = "I")
    public static int field674;

    @OriginalMember(owner = "client!kh", name = "cb", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "client!kh", name = "M", descriptor = "Lbg;")
    public static class242 field661;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)Z")
    public static final boolean method341(int arg0, int arg1) {
        class210.field3373 = 65535 & arg0 + 1;
        class94.field1404 = true;
        ++field669;
        if (arg1 != 27787) {
            method343(86, (class113) null, -89, 120, 19, -57, -26);
        }
        return true;
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "()V")
    public class46() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Llc;ILlc;)V")
    public static final void method342(class86 arg0, int arg1, class86 arg2) {
        class90.field1334 = arg0;
        ++field670;
        class222.field3562 = arg2;
        class11.field122 = class222.field3562.method617((byte) 110, arg1);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILth;IIIII)V")
    public static final void method343(int arg0, class113 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        boolean var7 = true;
        boolean var8 = false;
        boolean var9 = false;
        long var10 = 0L;
        if (arg5 == -13427) {
            ++field674;
            if (~arg0 == -1) {
                var10 = class267.method1857(arg3, arg6, arg2);
            } else if (arg0 == 1) {
                var10 = class149.method1057(arg3, arg6, arg2);
            } else if (arg0 != 2) {
                if (arg0 == 3) {
                    var10 = class250.method1787(arg3, arg6, arg2);
                }
            } else {
                var10 = class274.method1898(arg3, arg6, arg2);
            }
            int var12 = Integer.MAX_VALUE & (int) (var10 >>> 32);
            class36 var13 = class134.method970(var12, 0);
            int var14 = 3 & (int) var10 >> 20;
            if (var13.method271((byte) -88)) {
                class96.method742(arg3, 79, arg2, arg6, var13);
            }
            int var15 = (509767 & (int) var10) >> 14;
            if (var10 != 0L) {
                if (arg0 == 0) {
                    class209.method1525(arg3, arg6, arg2);
                    if (var13.field516 != 0) {
                        arg1.method829(arg2, arg6, var13.field491, var15, !var13.field479, -3, var14);
                    }
                } else if (~arg0 != -2) {
                    if (~arg0 == -3) {
                        class204.method1490(arg3, arg6, arg2);
                        if (~var13.field516 != -1 && ~(var13.field487 + arg6) > -105 && var13.field487 + arg2 < 104 && var13.field501 + arg6 < 104 && var13.field501 + arg2 < 104) {
                            arg1.method826(var14, var13.field487, var13.field501, !var13.field479, var13.field491, arg5 + 11505, arg2, arg6);
                        }
                    } else if (~arg0 == -4) {
                        class82.method596(arg3, arg6, arg2);
                        if (~var13.field516 == -2) {
                            arg1.method828(arg2, arg6, -120);
                        }
                    }
                } else {
                    class106.method791(arg3, arg6, arg2);
                }
                if (var13.field471 != null) {
                    class36 var20 = var13.method277(27981);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public static final boolean method344(String arg0, int arg1) {
        ++field667;
        if (arg0 == null) {
            return false;
        } else {
            int var2 = 0;
            int var3 = 108 % ((arg1 - -6) / 51);
            while (var2 < class180.field2895) {
                if (arg0.equalsIgnoreCase(class229.field3700[var2])) {
                    return true;
                }
                ++var2;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!kh", name = "i", descriptor = "(I)V")
    public static void method345(int arg0) {
        field661 = null;
        if (arg0 == 26461) {
            field676 = null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIII)V")
    public static final void method346(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = 0; ~var5 > ~class115.field1664; ++var5) {
            if (class55.field783[var5] + class10.field93[var5] > arg1 && arg1 - -arg2 > class10.field93[var5] && ~(class188.field3047[var5] + class138.field2240[var5]) < ~arg0 && ~class188.field3047[var5] > ~(arg0 + arg3)) {
                class294.field4673[var5] = true;
            }
        }
        if (arg4 != 29262) {
            method342((class86) null, 5, (class86) null);
        }
        ++field671;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lv;BI)V")
    public final void method31(class152 arg0, byte arg1, int arg2) {
        if (~arg2 == -1) {
            super.field1217 = ~arg0.method1111(255) == -2;
        }
        if (arg1 <= 87) {
            method345(42);
        }
        ++field672;
    }

    @OriginalMember(owner = "client!kh", name = "j", descriptor = "(I)V")
    public static final void method347(int arg0) {
        for (int var1 = 0; ~var1 > -6; ++var1) {
            class156.field2574[var1] = false;
        }
        int var2 = -74 / ((arg0 - 48) / 50);
        class241.field3839 = 0;
        class121.field1765 = -1;
        class187.field3007 = 0;
        ++field668;
        class168.field2705 = -1;
        class176.field2853 = 5;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IB)[[I")
    public final int[][] method30(int arg0, byte arg1) {
        int[][] var3 = super.field1211.method193((byte) -125, arg0);
        if (super.field1211.field321) {
            int[][] var4 = this.method611(0, (byte) -117, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[1];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            for (int var11 = 0; class20.field221 > var11; ++var11) {
                var9[var11] = 4096 - var5[var11];
                var8[var11] = -var6[var11] + 4096;
                var10[var11] = -var7[var11] + 4096;
            }
        }
        ++field677;
        if (arg1 != -18) {
            field661 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(III)I")
    public static final int method348(int arg0, int arg1, int arg2) {
        ++field664;
        int var3 = arg2 >>> 31;
        if (arg0 > -42) {
            method343(-110, (class113) null, 58, 52, 95, 10, 25);
        }
        return (arg2 - -var3) / arg1 + -var3;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(BI)[I")
    public final int[] method91(byte arg0, int arg1) {
        ++field663;
        if (arg0 > -125) {
            this.method30(-73, (byte) -48);
        }
        int[] var3 = super.field1228.method1627(-1, arg1);
        if (super.field1228.field3651) {
            int[] var4 = this.method612(0, arg1, false);
            for (int var5 = 0; class20.field221 > var5; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        return var3;
    }
}
