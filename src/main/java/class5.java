import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class5 extends class186 {

    @OriginalMember(owner = "client!vi", name = "ib", descriptor = "I")
    public static int field44 = 0;

    @OriginalMember(owner = "client!vi", name = "fb", descriptor = "I")
    public static int field41 = 0;

    @OriginalMember(owner = "client!vi", name = "eb", descriptor = "I")
    public static int field40;

    @OriginalMember(owner = "client!vi", name = "gb", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!vi", name = "hb", descriptor = "I")
    public static int field43;

    @OriginalMember(owner = "client!vi", name = "jb", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!vi", name = "kb", descriptor = "I")
    public static int field46;

    @OriginalMember(owner = "client!vi", name = "mb", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!vi", name = "nb", descriptor = "I")
    public static int field49;

    @OriginalMember(owner = "client!vi", name = "pb", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!vi", name = "qb", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!vi", name = "lb", descriptor = "Lnh;")
    public static class107 field47;

    @OriginalMember(owner = "client!vi", name = "ob", descriptor = "Lek;")
    public static class172 field50;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ZI)V", line = 8)
    public static final void method25(boolean arg0, int arg1) {
        field48++;
        byte var2;
        byte[][] var3;
        if (arg0) {
            var2 = 1;
            var3 = class63.field872;
        } else {
            var2 = 4;
            var3 = class254.field4296;
        }
        for (int var4 = arg1; var4 < var2; var4++) {
            class281.method1876((byte) -9);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class18.field208[var4][var5][var6];
                    boolean var8 = false;
                    if (var7 != -1) {
                        int var9 = var7 >> 24 & 0x3;
                        if (!arg0 || var9 == 0) {
                            int var10 = (var7 & 0xFFD000) >> 14;
                            int var11 = (var7 & 0x6) >> 1;
                            int var12 = (var7 & 0x3FFF) >> 3;
                            int var13 = (var10 / 8 << 8) + var12 / 8;
                            for (int var14 = 0; var14 < class177.field3039.length; var14++) {
                                if (class177.field3039[var14] == var13 && var3[var14] != null) {
                                    class25.method176(var4, var5 * 8, arg0, true, var6 * 8, var9, var3[var14], (var10 & 0x7) * 8, (var12 & 0x7) * 8, class180.field3102, var11);
                                    var8 = true;
                                    break;
                                }
                            }
                        }
                    }
                    if (!var8) {
                        class129.method807(var6 * 8, 8, 8, var4, var5 * 8, (byte) -84);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "([[IB)V", line = 94)
    public static final void method26(int[][] arg0, byte arg1) {
        class97.field1636 = arg0;
        field46++;
        if (arg1 != -88) {
            field44 = -4;
        }
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(IB)V", line = 108)
    public static final void method27(int arg0, byte arg1) {
        class42.field589--;
        field45++;
        if (class42.field589 == arg0) {
            return;
        }
        class136.method850(class103.field1752, arg0 + 1, class103.field1752, arg0, class42.field589 - arg0);
        class136.method850(class216.field3656, arg0 + 1, class216.field3656, arg0, class42.field589 - arg0);
        class136.method848(class110.field1868, arg0 + 1, class110.field1868, arg0, class42.field589 - arg0);
        class136.method845(class76.field1320, arg0 + 1, class76.field1320, arg0, class42.field589 - arg0);
        if (arg1 != -10) {
            field50 = (class172) null;
        }
        class136.method847(class135.field2257, arg0 + 1, class135.field2257, arg0, class42.field589 - arg0);
        class136.method847(class215.field3647, arg0 + 1, class215.field3647, arg0, class42.field589 - arg0);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(BJ)Lbe;", line = 134)
    public static final class283 method28(byte arg0, long arg1) {
        class71.field1224.setTime(new Date(arg1));
        int var3 = class71.field1224.get(7);
        field52++;
        if (arg0 != 106) {
            method26((int[][]) ((int[][]) null), (byte) -20);
        }
        int var4 = class71.field1224.get(5);
        int var5 = class71.field1224.get(2);
        int var6 = class71.field1224.get(1);
        int var7 = class71.field1224.get(11);
        int var8 = class71.field1224.get(12);
        int var9 = class71.field1224.get(13);
        return class299.method2022(new class283[] { class170.field2878[var3 - 1], class160.field2614, class296.method2012(var4 / 10, (byte) -111), class296.method2012(var4 % 10, (byte) -2), class70.field1168, class305.field5220[var5], class70.field1168, class296.method2012(var6, (byte) 123), class248.field4232, class296.method2012(var7 / 10, (byte) 122), class296.method2012(var7 % 10, (byte) -22), class183.field3139, class296.method2012(var8 / 10, (byte) 124), class296.method2012(var8 % 10, (byte) -67), class183.field3139, class296.method2012(var9 / 10, (byte) 120), class296.method2012(var9 % 10, (byte) 126), class203.field3475 }, (byte) 51);
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(IIII)V", line = 163)
    public static final void method29(int arg0, int arg1, int arg2, int arg3) {
        class160 var4 = class86.field1459[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class291 var5 = var4.field2642;
        if (var5 != null) {
            var5.field4929 = var5.field4929 * arg3 / 16;
            var5.field4944 = var5.field4944 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIIIZIII)V", line = 182)
    public static final void method30(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        field42++;
        int var8 = 0;
        int var9 = arg0;
        int var10 = arg6 - arg3;
        int var11 = arg0 * arg0;
        if (!arg4) {
            field47 = (class107) null;
        }
        int var12 = arg6 * arg6;
        int var13 = 0;
        int var14 = arg0 - arg3;
        int var15 = var10 * var10;
        int var16 = var14 * var14;
        int var17 = var12 << 1;
        int var18 = var11 << 1;
        int var19 = var15 << 1;
        int var20 = var16 << 1;
        int var21 = arg0 << 1;
        int var22 = (1 - var21) * var12 + var18;
        int var23 = var14 << 1;
        int var24 = var11 - (var21 - 1) * var17;
        int var25 = var16 - (var23 - 1) * var19;
        int var26 = var12 << 2;
        int var27 = var15 << 2;
        int var28 = var11 << 2;
        int var29 = (1 - var23) * var15 + var20;
        int var30 = var16 << 2;
        int var31 = var18 * 3;
        int var32 = (var21 - 3) * var17;
        int var33 = var20 * 3;
        int var34 = (var23 - 3) * var19;
        int var35 = var28;
        int var36 = (arg0 - 1) * var26;
        int var37 = var30;
        int var38 = (var14 - 1) * var27;
        if (arg1 >= class217.field3677 && class247.field4220 >= arg1) {
            int[] var39 = class97.field1636[arg1];
            int var40 = class44.method263(class166.field2765, arg5 - arg6, (byte) -49, class269.field4551);
            int var41 = class44.method263(class166.field2765, arg5 + arg6, (byte) -69, class269.field4551);
            int var42 = class44.method263(class166.field2765, arg5 - var10, (byte) -51, class269.field4551);
            int var43 = class44.method263(class166.field2765, arg5 + var10, (byte) -36, class269.field4551);
            class114.method742(30197, var40, var39, var42, arg7);
            class114.method742(30197, var42, var39, var43, arg2);
            class114.method742(30197, var43, var39, var41, arg7);
        }
        while (var9 > 0) {
            if (var22 < 0) {
                while (var22 < 0) {
                    var8++;
                    var22 += var31;
                    var24 += var35;
                    var35 += var28;
                    var31 += var28;
                }
            }
            boolean var44 = var14 >= var9;
            var9--;
            if (var24 < 0) {
                var8++;
                var22 += var31;
                var24 += var35;
                var31 += var28;
                var35 += var28;
            }
            int var45 = arg1 - var9;
            if (var44) {
                if (var29 < 0) {
                    while (var29 < 0) {
                        var29 += var33;
                        var33 += var30;
                        var25 += var37;
                        var37 += var30;
                        var13++;
                    }
                }
                if (var25 < 0) {
                    var25 += var37;
                    var29 += var33;
                    var13++;
                    var37 += var30;
                    var33 += var30;
                }
                var29 += -var38;
                var38 -= var27;
                var25 += -var34;
                var34 -= var27;
            }
            var22 += -var36;
            var36 -= var26;
            var24 += -var32;
            int var46 = arg1 + var9;
            var32 -= var26;
            if (var46 >= class217.field3677 && class247.field4220 >= var45) {
                int var47 = class44.method263(class166.field2765, arg5 + var8, (byte) -78, class269.field4551);
                int var48 = class44.method263(class166.field2765, arg5 - var8, (byte) -51, class269.field4551);
                if (var44) {
                    int var49 = class44.method263(class166.field2765, arg5 + var13, (byte) -100, class269.field4551);
                    int var50 = class44.method263(class166.field2765, arg5 - var13, (byte) -72, class269.field4551);
                    if (class217.field3677 <= var45) {
                        int[] var51 = class97.field1636[var45];
                        class114.method742(30197, var48, var51, var50, arg7);
                        class114.method742(30197, var50, var51, var49, arg2);
                        class114.method742(30197, var49, var51, var47, arg7);
                    }
                    if (class247.field4220 >= var46) {
                        int[] var52 = class97.field1636[var46];
                        class114.method742(30197, var48, var52, var50, arg7);
                        class114.method742(30197, var50, var52, var49, arg2);
                        class114.method742(30197, var49, var52, var47, arg7);
                    }
                } else {
                    if (class217.field3677 <= var45) {
                        class114.method742(30197, var48, class97.field1636[var45], var47, arg7);
                    }
                    if (var46 <= class247.field4220) {
                        class114.method742(30197, var48, class97.field1636[var46], var47, arg7);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(II)V", line = 389)
    public static final void method31(int arg0, int arg1) {
        field49++;
        int var2 = 6 % ((arg0 - 44) / 54);
        class72 var3 = class25.method174(arg1, (byte) 121, 2);
        var3.method479(127);
    }

    @OriginalMember(owner = "client!vi", name = "i", descriptor = "(I)V", line = 402)
    public static void method32(int arg0) {
        int var1 = -42 % ((arg0 - 67) / 44);
        field47 = null;
        field50 = null;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IB)[[I", line = 420)
    public final int[][] method16(int arg0, byte arg1) {
        field40++;
        int[][] var3 = this.field4878.method938((byte) -6, arg0);
        if (arg1 != -19) {
            field43 = -46;
        }
        if (this.field4878.field2524 && this.method1221((byte) -10)) {
            int[] var4 = var3[1];
            int[] var5 = var3[2];
            int[] var6 = var3[0];
            int var7 = arg0 % this.field3186 * this.field3186;
            for (int var8 = 0; var8 < class27.field410; var8++) {
                int var9 = this.field3185[var8 % this.field3199 + var7];
                var5[var8] = class178.method1174(var9 << 4, 4080);
                var4[var8] = class178.method1174(var9, 65280) >> 4;
                var6[var8] = class178.method1174(var9 >> 12, 4080);
            }
        }
        return var3;
    }
}
