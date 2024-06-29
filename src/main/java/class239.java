import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class239 extends class41 {

    @OriginalMember(owner = "client!pb", name = "C", descriptor = "I")
    public int field4152;

    @OriginalMember(owner = "client!pb", name = "S", descriptor = "I")
    private int field4166;

    @OriginalMember(owner = "client!pb", name = "v", descriptor = "[Z")
    public boolean[] field4145;

    @OriginalMember(owner = "client!pb", name = "y", descriptor = "[I")
    public int[] field4148;

    @OriginalMember(owner = "client!pb", name = "x", descriptor = "[[I")
    public int[][] field4147;

    @OriginalMember(owner = "client!pb", name = "w", descriptor = "I")
    public static int field4146 = 0;

    @OriginalMember(owner = "client!pb", name = "K", descriptor = "I")
    public static int field4158 = 0;

    @OriginalMember(owner = "client!pb", name = "M", descriptor = "Lsc;")
    public static class181 field4160 = class149.method967(255, "slr2)3ws?order=LPWM");

    @OriginalMember(owner = "client!pb", name = "J", descriptor = "Lsc;")
    public static class181 field4157 = class149.method967(255, "<col=40ff00>");

    @OriginalMember(owner = "client!pb", name = "F", descriptor = "Lsc;")
    public static class181 field4155 = class149.method967(255, ":clanreq:");

    @OriginalMember(owner = "client!pb", name = "A", descriptor = "I")
    public static int field4150 = 0;

    @OriginalMember(owner = "client!pb", name = "R", descriptor = "Z")
    public static boolean field4165 = true;

    @OriginalMember(owner = "client!pb", name = "z", descriptor = "Lsc;")
    private static class181 field4149 = class149.method967(255, "M");

    @OriginalMember(owner = "client!pb", name = "E", descriptor = "Z")
    public static boolean field4154 = true;

    @OriginalMember(owner = "client!pb", name = "L", descriptor = "Lsc;")
    public static class181 field4159 = field4149;

    @OriginalMember(owner = "client!pb", name = "N", descriptor = "I")
    public static int field4161 = 0;

    @OriginalMember(owner = "client!pb", name = "H", descriptor = "Lsc;")
    public static class181 field4156 = field4149;

    @OriginalMember(owner = "client!pb", name = "D", descriptor = "I")
    public static int field4153;

    @OriginalMember(owner = "client!pb", name = "P", descriptor = "I")
    public static int field4163;

    @OriginalMember(owner = "client!pb", name = "Q", descriptor = "I")
    public static int field4164;

    @OriginalMember(owner = "client!pb", name = "O", descriptor = "Ltg;")
    public static class107 field4162;

    @OriginalMember(owner = "client!pb", name = "B", descriptor = "[I")
    public static int[] field4151;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(B)I")
    public static final int method1630(byte arg0) {
        field4164++;
        int var1 = -103 / ((arg0 + 13) / 43);
        return ((class55.field849 == 0 ? 0 : 1) << 22) + ((class77.field1241 ? 1 : 0) << 16) + ((class78.field1268 ? 1 : 0) << 15) + ((class254.field4445 ? 1 : 0) << 13) + (class184.field3252 & 0x3 << 11) + ((field4154 ? 1 : 0) << 10) + ((class148.field2481 ? 1 : 0) << 8) + ((class207.field3552 ? 1 : 0) << 7) + ((class180.field3140 ? 1 : 0) << 6) + ((class8.field140 ? 1 : 0) << 4) + (class209.field3590 & 0x7) + ((class259.field4527 ? 1 : 0) << 3) + ((class94.field1502 == 0 ? 0 : 1) << 21) - (-((field4165 ? 1 : 0) << 5) + -((class73.field1166 ? 1 : 0) << 9) + -((class242.field4212 & 0x3) << 17) - ((class82.field1317 ? 1 : 0) << 19) + -((class173.field2911 == 0 ? 0 : 1) << 20));
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1631(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = 0;
        int var9 = arg3;
        field4163++;
        int var10 = arg1 - arg4;
        int var11 = 0;
        int var12 = arg3 - arg4;
        int var13 = arg3 * arg3;
        int var14 = var10 * var10;
        int var15 = 18 % ((arg0 - 22) / 54);
        int var16 = arg1 * arg1;
        int var17 = var12 * var12;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var14 << 1;
        int var21 = var17 << 1;
        int var22 = arg3 << 1;
        int var23 = var12 << 1;
        int var24 = var13 - ((var22 - 1) * var19);
        int var25 = (1 - var23) * var14 + var21;
        int var26 = var17 - ((var23 - 1) * var20);
        int var27 = (1 - var22) * var16 + var18;
        int var28 = var16 << 2;
        int var29 = var14 << 2;
        int var30 = var13 << 2;
        int var31 = var17 << 2;
        int var32 = var18 * 3;
        int var33 = (var22 - 3) * var19;
        int var34 = var21 * 3;
        int var35 = var30;
        int var36 = (var23 - 3) * var20;
        int var37 = (arg3 - 1) * var28;
        int var38 = var31;
        int var39 = (var12 - 1) * var29;
        if (arg2 >= class23.field408 && arg2 <= class125.field2056) {
            int[] var40 = class149.field2507[arg2];
            int var41 = class144.method931(98, class124.field2032, class11.field219, arg6 - arg1);
            int var42 = class144.method931(103, class124.field2032, class11.field219, arg1 + arg6);
            int var43 = class144.method931(-24, class124.field2032, class11.field219, arg6 - var10);
            int var44 = class144.method931(-87, class124.field2032, class11.field219, arg6 + var10);
            class171.method1133(var40, var41, arg5, var43, (byte) 127);
            class171.method1133(var40, var43, arg7, var44, (byte) 127);
            class171.method1133(var40, var44, arg5, var42, (byte) 126);
        }
        while (var9 > 0) {
            boolean var45 = var9 <= var12;
            if (var27 < 0) {
                while (var27 < 0) {
                    var27 += var32;
                    var24 += var35;
                    var8++;
                    var32 += var30;
                    var35 += var30;
                }
            }
            var9--;
            if (var45) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var11++;
                        var26 += var38;
                        var25 += var34;
                        var34 += var31;
                        var38 += var31;
                    }
                }
                if (var26 < 0) {
                    var25 += var34;
                    var26 += var38;
                    var34 += var31;
                    var11++;
                    var38 += var31;
                }
                var26 += -var36;
                var36 -= var29;
                var25 += -var39;
                var39 -= var29;
            }
            int var46 = arg2 - var9;
            int var47 = arg2 + var9;
            if (var24 < 0) {
                var27 += var32;
                var32 += var30;
                var8++;
                var24 += var35;
                var35 += var30;
            }
            var24 += -var33;
            var33 -= var28;
            if (class23.field408 <= var47 && var46 <= class125.field2056) {
                int var48 = class144.method931(96, class124.field2032, class11.field219, arg6 + var8);
                int var49 = class144.method931(110, class124.field2032, class11.field219, arg6 - var8);
                if (var45) {
                    int var50 = class144.method931(-37, class124.field2032, class11.field219, arg6 + var11);
                    int var51 = class144.method931(104, class124.field2032, class11.field219, arg6 - var11);
                    if (var46 >= class23.field408) {
                        int[] var52 = class149.field2507[var46];
                        class171.method1133(var52, var49, arg5, var51, (byte) 125);
                        class171.method1133(var52, var51, arg7, var50, (byte) 126);
                        class171.method1133(var52, var50, arg5, var48, (byte) 127);
                    }
                    if (class125.field2056 >= var47) {
                        int[] var53 = class149.field2507[var47];
                        class171.method1133(var53, var49, arg5, var51, (byte) 125);
                        class171.method1133(var53, var51, arg7, var50, (byte) 125);
                        class171.method1133(var53, var50, arg5, var48, (byte) 125);
                    }
                } else {
                    if (var46 >= class23.field408) {
                        class171.method1133(class149.field2507[var46], var49, arg5, var48, (byte) 127);
                    }
                    if (class125.field2056 >= var47) {
                        class171.method1133(class149.field2507[var47], var49, arg5, var48, (byte) 127);
                    }
                }
            }
            var27 += -var37;
            var37 -= var28;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIII)V")
    public static final void method1632(int arg0, int arg1, int arg2, int arg3) {
        class84.field1339 = new class220[arg0][arg1][arg2];
        class21.field379 = new int[arg0][arg1 + 1][arg2 + 1];
        class45.method303(false);
        class238.field4129 = arg1;
        class2.field47 = arg2;
        class86.field1365 = new int[arg0][arg1 + 1][arg2 + 1];
        class256.method1747();
        class189.field3340 = arg3;
        class184.field3272 = new boolean[class189.field3340 + class189.field3340 + 1][class189.field3340 + class189.field3340 + 1];
        class131.field2172 = new boolean[class189.field3340 + class189.field3340 + 2][class189.field3340 + class189.field3340 + 2];
    }

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "(I)V")
    public static void method1633(int arg0) {
        field4156 = null;
        field4157 = null;
        if (arg0 > -16) {
            return;
        }
        field4159 = null;
        field4155 = null;
        field4162 = null;
        field4151 = null;
        field4160 = null;
        field4149 = null;
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(I[B)V")
    public class239(int arg0, byte[] arg1) {
        this.field4152 = arg0;
        class230 var3 = new class230(arg1);
        this.field4166 = var3.method1516((byte) 82);
        this.field4145 = new boolean[this.field4166];
        this.field4148 = new int[this.field4166];
        this.field4147 = new int[this.field4166][];
        for (int var4 = 0; var4 < this.field4166; var4++) {
            this.field4148[var4] = var3.method1516((byte) 82);
        }
        for (int var5 = 0; var5 < this.field4166; var5++) {
            this.field4145[var5] = var3.method1516((byte) 82) == 1;
        }
        for (int var6 = 0; var6 < this.field4166; var6++) {
            this.field4147[var6] = new int[var3.method1516((byte) 82)];
        }
        for (int var7 = 0; var7 < this.field4166; var7++) {
            for (int var8 = 0; var8 < this.field4147[var7].length; var8++) {
                this.field4147[var7][var8] = var3.method1516((byte) 82);
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIII)V")
    public static final void method1634(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4153++;
        if ((arg4 - arg3) >= class11.field219 && (arg3 + arg4) <= class124.field2032 && arg0 - arg3 >= class23.field408 && class125.field2056 >= arg0 + arg3) {
            class115.method757(arg2, arg3, arg0, arg4, -1);
        } else {
            class76.method528(arg2, (byte) -127, arg3, arg4, arg0);
        }
        if (arg1 != 1) {
            method1631(22, -119, -96, -78, -1, -26, -46, -63);
        }
    }
}
