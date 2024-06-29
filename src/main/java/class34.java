import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class34 {

    @OriginalMember(owner = "client!va", name = "e", descriptor = "Lcc;")
    public static class209 field597 = class95.method669(90, "cross");

    @OriginalMember(owner = "client!va", name = "l", descriptor = "[[[I")
    public static int[][][] field604 = new int[4][13][13];

    @OriginalMember(owner = "client!va", name = "a", descriptor = "I")
    public static int field593;

    @OriginalMember(owner = "client!va", name = "b", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!va", name = "g", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!va", name = "i", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!va", name = "j", descriptor = "I")
    public static int field602;

    @OriginalMember(owner = "client!va", name = "k", descriptor = "I")
    public static int field603;

    @OriginalMember(owner = "client!va", name = "m", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!va", name = "d", descriptor = "J")
    public long field596;

    @OriginalMember(owner = "client!va", name = "c", descriptor = "Lva;")
    public class34 field595;

    @OriginalMember(owner = "client!va", name = "f", descriptor = "Lva;")
    public class34 field598;

    @OriginalMember(owner = "client!va", name = "h", descriptor = "Lsj;")
    public static class49 field600;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "([Lcc;III)Lcc;")
    public static final class209 method262(class209[] arg0, int arg1, int arg2, int arg3) {
        int var4 = 0;
        field603++;
        for (int var5 = 0; var5 < arg3; var5++) {
            if (arg0[arg2 + var5] == null) {
                arg0[arg2 + var5] = class167.field3011;
            }
            var4 += arg0[arg2 + var5].field3811;
        }
        int var6 = 0;
        byte[] var7 = new byte[var4];
        for (int var8 = 0; var8 < arg3; var8++) {
            class209 var10 = arg0[arg2 + var8];
            class270.method1847(var10.field3786, 0, var7, var6, var10.field3811);
            var6 += var10.field3811;
        }
        if (arg1 != -676) {
            method267(-54, -106, -46, 13, -108, 28);
        }
        class209 var9 = new class209();
        var9.field3786 = var7;
        var9.field3811 = var4;
        return var9;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V")
    public static void method263(int arg0) {
        field597 = null;
        if (arg0 == 9362) {
            field604 = null;
            field600 = null;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method264(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = 0;
        int var9 = arg7;
        field605++;
        int var10 = 0;
        int var11 = arg7 - arg6;
        int var12 = arg0 - arg6;
        int var13 = arg0 * arg0;
        int var14 = arg7 * arg7;
        int var15 = var12 * var12;
        int var16 = var11 * var11;
        int var17 = var13 << 1;
        int var18 = var14 << 1;
        int var19 = var11 << 1;
        int var20 = var15 << 1;
        if (arg5 < 39) {
            return;
        }
        int var21 = var16 << 1;
        int var22 = arg7 << 1;
        int var23 = (1 - var22) * var13 + var18;
        int var24 = var14 - ((var22 - 1) * var17);
        int var25 = (1 - var19) * var15 + var21;
        int var26 = var14 << 2;
        int var27 = var13 << 2;
        int var28 = var16 - ((var19 - 1) * var20);
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var18 * 3;
        int var32 = (var19 - 3) * var20;
        int var33 = var21 * 3;
        int var34 = (var22 - 3) * var17;
        int var35 = var26;
        int var36 = (arg7 - 1) * var27;
        int var37 = (var11 - 1) * var29;
        int[] var38 = class252.field4543[arg1];
        int var39 = var30;
        class176.method1215(arg3 - arg0, arg4, var38, arg3 - var12, (byte) -92);
        class176.method1215(arg3 - var12, arg2, var38, arg3 + var12, (byte) 113);
        class176.method1215(arg3 + var12, arg4, var38, arg0 + arg3, (byte) -82);
        while (var9 > 0) {
            if (var23 < 0) {
                while (var23 < 0) {
                    var8++;
                    var23 += var31;
                    var24 += var35;
                    var35 += var26;
                    var31 += var26;
                }
            }
            if (var24 < 0) {
                var24 += var35;
                var8++;
                var35 += var26;
                var23 += var31;
                var31 += var26;
            }
            boolean var40 = var11 >= var9;
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var33;
                        var10++;
                        var33 += var30;
                        var28 += var39;
                        var39 += var30;
                    }
                }
                if (var28 < 0) {
                    var25 += var33;
                    var28 += var39;
                    var39 += var30;
                    var10++;
                    var33 += var30;
                }
                var25 += -var37;
                var28 += -var32;
                var32 -= var29;
                var37 -= var29;
            }
            var24 += -var34;
            var34 -= var27;
            var9--;
            var23 += -var36;
            var36 -= var27;
            int var41 = arg3 + var8;
            int var42 = arg1 + var9;
            int var43 = arg1 - var9;
            int var44 = arg3 - var8;
            if (var40) {
                int var45 = arg3 + var10;
                int var46 = arg3 - var10;
                class176.method1215(var44, arg4, class252.field4543[var43], var46, (byte) -3);
                class176.method1215(var46, arg2, class252.field4543[var43], var45, (byte) -44);
                class176.method1215(var45, arg4, class252.field4543[var43], var41, (byte) -24);
                class176.method1215(var44, arg4, class252.field4543[var42], var46, (byte) -108);
                class176.method1215(var46, arg2, class252.field4543[var42], var45, (byte) -123);
                class176.method1215(var45, arg4, class252.field4543[var42], var41, (byte) 127);
            } else {
                class176.method1215(var44, arg4, class252.field4543[var43], var41, (byte) 113);
                class176.method1215(var44, arg4, class252.field4543[var42], var41, (byte) 122);
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(BI[Lji;)V")
    public static final void method265(byte arg0, int arg1, class42[] arg2) {
        field599++;
        if (arg0 <= 126) {
            method265((byte) -58, -52, (class42[]) null);
        }
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class42 var4 = arg2[var3];
            if (var4 != null && var4.field710 == arg1 && (!var4.field795 || !client.method1078(var4))) {
                if (var4.field810 == 0) {
                    if (!var4.field795 && client.method1078(var4) && class85.field1695 != var4) {
                        continue;
                    }
                    method265((byte) 127, var4.field779, arg2);
                    if (var4.field762 != null) {
                        method265((byte) 127, var4.field779, var4.field762);
                    }
                    class97 var5 = (class97) class114.field2288.method1755((long) var4.field779, (byte) -102);
                    if (var5 != null) {
                        class223.method1575(var5.field1895, -1);
                    }
                }
                if (var4.field810 == 6) {
                    if (var4.field850 != -1 || var4.field790 != -1) {
                        boolean var6 = class82.method580(-5078, var4);
                        int var7;
                        if (var6) {
                            var7 = var4.field790;
                        } else {
                            var7 = var4.field850;
                        }
                        if (var7 != -1) {
                            class241 var8 = class245.method1706(var7, (byte) 123);
                            if (var8 != null) {
                                var4.field805 += class122.field2402;
                                while (var4.field805 > var8.field4344[var4.field815]) {
                                    var4.field805 -= var8.field4344[var4.field815];
                                    var4.field815++;
                                    if (var4.field815 >= var8.field4341.length) {
                                        var4.field815 -= var8.field4366;
                                        if (var4.field815 < 0 || var8.field4341.length <= var4.field815) {
                                            var4.field815 = 0;
                                        }
                                    }
                                    class126.method907(var4, 0);
                                }
                            }
                        }
                    }
                    if (var4.field824 != 0 && !var4.field795) {
                        int var9 = var4.field824 << 16 >> 16;
                        int var10 = class122.field2402 * var9;
                        int var11 = var4.field824 >> 16;
                        var4.field748 = var4.field748 + var10 & 0x7FF;
                        int var12 = class122.field2402 * var11;
                        var4.field773 = var4.field773 + var12 & 0x7FF;
                        class126.method907(var4, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(I)Z")
    public final boolean method266(int arg0) {
        field593++;
        if (arg0 != 0) {
            this.field596 = -17L;
        }
        return this.field598 != null;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIIII)V")
    public static final void method267(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field601++;
        if (arg0 == arg1) {
            class108.method782(arg2, (byte) 104, arg5, arg4, arg1);
            return;
        }
        if (arg2 - arg1 >= class262.field4723 && arg1 + arg2 <= class230.field4184 && class102.field1957 <= arg4 - arg0 && class155.field2847 >= arg0 + arg4) {
            class97.method677(arg5, arg1, arg4, (byte) -35, arg2, arg0);
        } else {
            class47.method345(arg0, arg3 - 1954147682, arg2, arg1, arg4, arg5);
        }
        if (arg3 != 1954147681) {
            method264(-101, -66, 114, 23, -117, 66, 1, 0);
        }
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(I)Lcc;")
    public static final class209 method268(int arg0) {
        field594++;
        class209 var1 = class87.field1739;
        if (class100.field1945 != 0) {
            var1 = class279.field4899;
        }
        if (arg0 != 14537) {
            method263(-127);
        }
        class209 var2 = class246.field4451;
        if (client.field2812 != null) {
            var2 = class229.method1604(new class209[] { class69.field1313, client.field2812 }, (byte) 107);
        }
        return class229.method1604(new class209[] { class114.field2290, var1, class226.field4128, class66.method485(class131.field2514, (byte) 47), class14.field261, class66.method485(class60.field1210, (byte) 20), var2, class252.field4541 }, (byte) 84);
    }

    @OriginalMember(owner = "client!va", name = "d", descriptor = "(I)V")
    public final void method269(int arg0) {
        field602++;
        if (this.field598 == null) {
            return;
        }
        this.field598.field595 = this.field595;
        this.field595.field598 = this.field598;
        this.field595 = null;
        if (arg0 != -214950896) {
            this.field596 = 52L;
        }
        this.field598 = null;
    }
}
