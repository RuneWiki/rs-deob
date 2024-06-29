import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class185 {

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "I")
    private int field3694;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "[[I")
    private int[][] field3697;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "I")
    private int field3693;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "I")
    public static int field3690 = 0;

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "Lrf;")
    public static class163 field3700 = class53.method392(67, "Abbrechen");

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "Lrf;")
    private static class163 field3698 = class53.method392(-109, "Loading wordpack )2 ");

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "Lrf;")
    public static class163 field3701 = field3698;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "I")
    public static int field3688;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
    public static int field3689;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
    public static int field3691;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "I")
    public static int field3692;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "I")
    public static int field3695;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "I")
    public static int field3696;

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!ua", name = "p", descriptor = "I")
    public static int field3703;

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "Lu;")
    public static class184 field3702;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IB)I")
    public final int method1251(int arg0, byte arg1) {
        if (arg1 != -102) {
            field3701 = null;
        }
        if (this.field3697 != null) {
            arg0 = (int) ((long) this.field3694 * (long) arg0 / (long) this.field3693);
        }
        field3692++;
        return arg0;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I[B)[B")
    public final byte[] method1252(int arg0, byte[] arg1) {
        if (this.field3697 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field3694 / (long) this.field3693) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field3697[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field3694 + var6;
                int var14 = var13 / this.field3693;
                var5 += var14;
                var6 = var13 - this.field3693 * var14;
            }
            arg1 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg1[var8] = -128;
                } else if (var9 <= 127) {
                    arg1[var8] = (byte) var9;
                } else {
                    arg1[var8] = 127;
                }
            }
        }
        field3699++;
        if (arg0 < 33) {
            this.field3697 = null;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)V")
    public static final void method1253(boolean arg0) {
        class105.field2195.method328(-93);
        if (!arg0) {
            method1257(-106, null, -30);
        }
        int var1 = class105.field2195.method331(1, -2055311549);
        field3696++;
        if (var1 == 0) {
            return;
        }
        int var2 = class105.field2195.method331(2, -2055311549);
        if (var2 == 0) {
            class52.field1088[class181.field3638++] = 2047;
        } else if (var2 == 1) {
            int var3 = class105.field2195.method331(3, -2055311549);
            class56.field1136.method223(false, var3, false);
            int var4 = class105.field2195.method331(1, -2055311549);
            if (var4 == 1) {
                class52.field1088[class181.field3638++] = 2047;
            }
        } else if (var2 == 2) {
            int var5 = class105.field2195.method331(3, -2055311549);
            class56.field1136.method223(!arg0, var5, true);
            int var6 = class105.field2195.method331(3, -2055311549);
            class56.field1136.method223(!arg0, var6, true);
            int var7 = class105.field2195.method331(1, -2055311549);
            if (var7 == 1) {
                class52.field1088[class181.field3638++] = 2047;
            }
        } else if (var2 == 3) {
            int var8 = class105.field2195.method331(7, -2055311549);
            int var9 = class105.field2195.method331(1, -2055311549);
            int var10 = class105.field2195.method331(7, -2055311549);
            class60.field1227 = class105.field2195.method331(2, -2055311549);
            int var11 = class105.field2195.method331(1, -2055311549);
            if (var11 == 1) {
                class52.field1088[class181.field3638++] = 2047;
            }
            class56.field1136.method225(var8, var10, -24, var9 == 1);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(BI)I")
    public final int method1254(byte arg0, int arg1) {
        if (arg0 > -38) {
            return 24;
        }
        field3689++;
        if (this.field3697 != null) {
            arg1 = (int) ((long) this.field3694 * (long) arg1 / (long) this.field3693) + 6;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILu;I)Ljb;")
    public static final class88 method1255(int arg0, class184 arg1, int arg2) {
        if (arg0 != -9871) {
            method1257(49, null, 105);
        }
        byte[] var3 = arg1.method1246(arg0 + 9781, arg2);
        field3695++;
        return var3 == null ? null : new class88(var3);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V")
    public static void method1256(byte arg0) {
        field3702 = null;
        field3698 = null;
        if (arg0 <= -49) {
            field3700 = null;
            field3701 = null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILme;I)V")
    public static final void method1257(int arg0, class118 arg1, int arg2) {
        field3688++;
        Object[] var3 = arg1.field2502;
        int var4 = (Integer) var3[0];
        class149 var5 = class122.method825(var4, -12);
        if (var5 == null) {
            return;
        }
        int var6 = 0;
        class187.field3730 = 0;
        int var7 = 0;
        int var8 = -1;
        int[] var9 = var5.field3074;
        int[] var10 = var5.field3068;
        byte var11 = -1;
        try {
            class199.field3944 = new class163[var5.field3071];
            class131.field2745 = new int[var5.field3062];
            int var12 = 0;
            int var13 = 0;
            if (arg2 == 4200) {
                for (int var14 = 1; var14 < var3.length; var14++) {
                    if (var3[var14] instanceof Integer) {
                        int var16 = (Integer) var3[var14];
                        if (var16 == -2147483647) {
                            var16 = arg1.field2495;
                        }
                        if (var16 == -2147483646) {
                            var16 = arg1.field2487;
                        }
                        if (var16 == -2147483645) {
                            var16 = arg1.field2500 == null ? -1 : arg1.field2500.field1782;
                        }
                        if (var16 == -2147483644) {
                            var16 = arg1.field2499;
                        }
                        if (var16 == -2147483643) {
                            var16 = arg1.field2500 == null ? -1 : arg1.field2500.field1758;
                        }
                        if (var16 == -2147483642) {
                            var16 = arg1.field2484 == null ? -1 : arg1.field2484.field1782;
                        }
                        if (var16 == -2147483641) {
                            var16 = arg1.field2484 == null ? -1 : arg1.field2484.field1758;
                        }
                        if (var16 == -2147483640) {
                            var16 = arg1.field2486;
                        }
                        if (var16 == -2147483639) {
                            var16 = arg1.field2494;
                        }
                        class131.field2745[var13++] = var16;
                    } else if (var3[var14] instanceof class163) {
                        class163 var15 = (class163) var3[var14];
                        if (var15.method1043(109, class79.field1610)) {
                            var15 = arg1.field2506;
                        }
                        class199.field3944[var12++] = var15;
                    }
                }
                int var17 = 0;
                label2217: while (true) {
                    var17++;
                    if (arg0 < var17) {
                        throw new RuntimeException("slow");
                    }
                    var8++;
                    int var316 = var9[var8];
                    if (var316 < 100) {
                        if (var316 == 0) {
                            class139.field2869[var6++] = var10[var8];
                            continue;
                        }
                        if (var316 == 1) {
                            int var18 = var10[var8];
                            class139.field2869[var6++] = class143.field2940[var18];
                            continue;
                        }
                        if (var316 == 2) {
                            int var19 = var10[var8];
                            var6--;
                            class143.field2940[var19] = class139.field2869[var6];
                            continue;
                        }
                        if (var316 == 3) {
                            class103.field2161[var7++] = var5.field3070[var8];
                            continue;
                        }
                        if (var316 == 6) {
                            var8 += var10[var8];
                            continue;
                        }
                        if (var316 == 7) {
                            var6 -= 2;
                            if (class139.field2869[var6 + 1] != class139.field2869[var6]) {
                                var8 += var10[var8];
                            }
                            continue;
                        }
                        if (var316 == 8) {
                            var6 -= 2;
                            if (class139.field2869[var6 + 1] == class139.field2869[var6]) {
                                var8 += var10[var8];
                            }
                            continue;
                        }
                        if (var316 == 9) {
                            var6 -= 2;
                            if (class139.field2869[var6] < class139.field2869[var6 + 1]) {
                                var8 += var10[var8];
                            }
                            continue;
                        }
                        if (var316 == 10) {
                            var6 -= 2;
                            if (class139.field2869[var6] > class139.field2869[var6 + 1]) {
                                var8 += var10[var8];
                            }
                            continue;
                        }
                        if (var316 == 21) {
                            if (class187.field3730 == 0) {
                                return;
                            }
                            class188 var20 = class96.field2049[--class187.field3730];
                            class131.field2745 = var20.field3744;
                            var5 = var20.field3738;
                            var10 = var5.field3068;
                            var9 = var5.field3074;
                            class199.field3944 = var20.field3742;
                            var8 = var20.field3734;
                            continue;
                        }
                        if (var316 == 25) {
                            int var21 = var10[var8];
                            class139.field2869[var6++] = class86.method609(var21, arg2 + 21131);
                            continue;
                        }
                        if (var316 == 27) {
                            int var22 = var10[var8];
                            var6--;
                            class90.method624(-97, var22, class139.field2869[var6]);
                            continue;
                        }
                        if (var316 == 31) {
                            var6 -= 2;
                            if (class139.field2869[var6] <= class139.field2869[var6 + 1]) {
                                var8 += var10[var8];
                            }
                            continue;
                        }
                        if (var316 == 32) {
                            var6 -= 2;
                            if (class139.field2869[var6] >= class139.field2869[var6 + 1]) {
                                var8 += var10[var8];
                            }
                            continue;
                        }
                        if (var316 == 33) {
                            class139.field2869[var6++] = class131.field2745[var10[var8]];
                            continue;
                        }
                        int var10001;
                        if (var316 == 34) {
                            var10001 = var10[var8];
                            var6--;
                            class131.field2745[var10001] = class139.field2869[var6];
                            continue;
                        }
                        if (var316 == 35) {
                            class103.field2161[var7++] = class199.field3944[var10[var8]];
                            continue;
                        }
                        if (var316 == 36) {
                            var10001 = var10[var8];
                            var7--;
                            class199.field3944[var10001] = class103.field2161[var7];
                            continue;
                        }
                        if (var316 == 37) {
                            int var23 = var10[var8];
                            var7 -= var23;
                            class163 var24 = class57.method413(class103.field2161, var23, var7, 88);
                            class103.field2161[var7++] = var24;
                            continue;
                        }
                        if (var316 == 38) {
                            var6--;
                            continue;
                        }
                        if (var316 == 39) {
                            var7--;
                            continue;
                        }
                        if (var316 == 40) {
                            int var25 = var10[var8];
                            class149 var26 = class122.method825(var25, -12);
                            int[] var27 = new int[var26.field3062];
                            class163[] var28 = new class163[var26.field3071];
                            for (int var29 = 0; var29 < var26.field3067; var29++) {
                                var27[var29] = class139.field2869[var6 + var29 - var26.field3067];
                            }
                            for (int var30 = 0; var30 < var26.field3072; var30++) {
                                var28[var30] = class103.field2161[var7 + var30 - var26.field3072];
                            }
                            var6 -= var26.field3067;
                            var7 -= var26.field3072;
                            class188 var31 = new class188();
                            var31.field3734 = var8;
                            var31.field3738 = var5;
                            var31.field3744 = class131.field2745;
                            var31.field3742 = class199.field3944;
                            if (class187.field3730 >= class96.field2049.length) {
                                throw new RuntimeException();
                            }
                            var5 = var26;
                            class96.field2049[class187.field3730++] = var31;
                            var10 = var26.field3068;
                            class199.field3944 = var28;
                            var8 = -1;
                            var9 = var26.field3074;
                            class131.field2745 = var27;
                            continue;
                        }
                        if (var316 == 42) {
                            class139.field2869[var6++] = class154.field3203[var10[var8]];
                            continue;
                        }
                        if (var316 == 43) {
                            var10001 = var10[var8];
                            var6--;
                            class154.field3203[var10001] = class139.field2869[var6];
                            continue;
                        }
                        if (var316 == 44) {
                            int var32 = var10[var8] >> 16;
                            int var33 = var10[var8] & 0xFFFF;
                            var6--;
                            int var34 = class139.field2869[var6];
                            if (var34 >= 0 && var34 <= 5000) {
                                class15.field267[var32] = var34;
                                byte var35 = -1;
                                if (var33 == 105) {
                                    var35 = 0;
                                }
                                int var36 = 0;
                                while (true) {
                                    if (var34 <= var36) {
                                        continue label2217;
                                    }
                                    class170.field3447[var32][var36] = var35;
                                    var36++;
                                }
                            }
                            throw new RuntimeException();
                        }
                        if (var316 == 45) {
                            int var37 = var10[var8];
                            var6--;
                            int var38 = class139.field2869[var6];
                            if (var38 >= 0 && class15.field267[var37] > var38) {
                                class139.field2869[var6++] = class170.field3447[var37][var38];
                                continue;
                            }
                            throw new RuntimeException();
                        }
                        if (var316 == 46) {
                            var6 -= 2;
                            int var39 = var10[var8];
                            int var40 = class139.field2869[var6];
                            if (var40 >= 0 && class15.field267[var39] > var40) {
                                class170.field3447[var39][var40] = class139.field2869[var6 + 1];
                                continue;
                            }
                            throw new RuntimeException();
                        }
                        if (var316 == 47) {
                            class163 var41 = class146.field2998[var10[var8]];
                            if (var41 == null) {
                                var41 = class170.field3455;
                            }
                            class103.field2161[var7++] = var41;
                            continue;
                        }
                        if (var316 == 48) {
                            var10001 = var10[var8];
                            var7--;
                            class146.field2998[var10001] = class103.field2161[var7];
                            continue;
                        }
                    }
                    boolean var42;
                    if (var10[var8] == 1) {
                        var42 = true;
                    } else {
                        var42 = false;
                    }
                    if (var316 < 300) {
                        if (var316 == 100) {
                            var6 -= 3;
                            int var43 = class139.field2869[var6];
                            int var44 = class139.field2869[var6 + 1];
                            int var45 = class139.field2869[var6 + 2];
                            if (var44 == 0) {
                                throw new RuntimeException();
                            }
                            class84 var46 = class138.method907(var43, false);
                            if (var46.field1804 == null) {
                                var46.field1804 = new class84[var45 + 1];
                            }
                            if (var45 >= var46.field1804.length) {
                                class84[] var47 = new class84[var45 + 1];
                                for (int var48 = 0; var48 < var46.field1804.length; var48++) {
                                    var47[var48] = var46.field1804[var48];
                                }
                                var46.field1804 = var47;
                            }
                            if (var45 > 0 && var46.field1804[var45 - 1] == null) {
                                throw new RuntimeException("Gap at:" + (var45 - 1));
                            }
                            class84 var49 = new class84();
                            var49.field1853 = true;
                            var49.field1758 = var45;
                            var49.field1724 = var49.field1782 = var46.field1782;
                            var49.field1755 = var44;
                            var46.field1804[var45] = var49;
                            if (var42) {
                                class191.field3791 = var49;
                            } else {
                                class106.field2205 = var49;
                            }
                            class194.method1295((byte) 25, var46);
                            continue;
                        }
                        if (var316 == 101) {
                            class84 var50 = var42 ? class191.field3791 : class106.field2205;
                            if (var50.field1758 == -1) {
                                if (!var42) {
                                    throw new RuntimeException("Tried to cc_delete static active-component!");
                                }
                                throw new RuntimeException("Tried to .cc_delete static .active-component!");
                            }
                            class84 var51 = class138.method907(var50.field1782, false);
                            var51.field1804[var50.field1758] = null;
                            class194.method1295((byte) -18, var51);
                            continue;
                        }
                        if (var316 == 102) {
                            var6--;
                            class84 var52 = class138.method907(class139.field2869[var6], false);
                            var52.field1804 = null;
                            class194.method1295((byte) -27, var52);
                            continue;
                        }
                        if (var316 == 200) {
                            var6 -= 2;
                            int var53 = class139.field2869[var6];
                            int var54 = class139.field2869[var6 + 1];
                            class84 var55 = class48.method298(var53, var54, arg2 ^ 0x1068);
                            if (var55 != null && var54 != -1) {
                                class139.field2869[var6++] = 1;
                                if (var42) {
                                    class191.field3791 = var55;
                                } else {
                                    class106.field2205 = var55;
                                }
                                continue;
                            }
                            class139.field2869[var6++] = 0;
                            continue;
                        }
                        if (var316 == 201) {
                            var6--;
                            int var56 = class139.field2869[var6];
                            class84 var57 = class138.method907(var56, false);
                            if (var57 == null) {
                                class139.field2869[var6++] = 0;
                            } else {
                                class139.field2869[var6++] = 1;
                                if (var42) {
                                    class191.field3791 = var57;
                                } else {
                                    class106.field2205 = var57;
                                }
                            }
                            continue;
                        }
                    } else if (var316 < 500) {
                        if (var316 == 403) {
                            var6 -= 2;
                            int var306 = class139.field2869[var6];
                            int var307 = class139.field2869[var6 + 1];
                            if (var306 >= 7) {
                                var306 -= 7;
                            }
                            class56.field1136.field795.method782(var306, var307, Integer.MIN_VALUE);
                            continue;
                        }
                        if (var316 == 404) {
                            var6 -= 2;
                            int var308 = class139.field2869[var6];
                            int var309 = class139.field2869[var6 + 1];
                            class56.field1136.field795.method791(var309, var308, (byte) 114);
                            continue;
                        }
                        if (var316 == 410) {
                            var6--;
                            boolean var310 = class139.field2869[var6] != 0;
                            class56.field1136.field795.method793((byte) -97, var310);
                            continue;
                        }
                    } else if (var316 >= 1000 && var316 < 1100 || var316 >= 2000 && var316 < 2100) {
                        class84 var58;
                        if (var316 >= 2000) {
                            var6--;
                            var58 = class138.method907(class139.field2869[var6], false);
                            var316 -= 1000;
                        } else {
                            var58 = var42 ? class191.field3791 : class106.field2205;
                        }
                        if (var316 == 1000) {
                            var6 -= 2;
                            var58.field1725 = class139.field2869[var6];
                            var58.field1744 = class139.field2869[var6 + 1];
                            class194.method1295((byte) 81, var58);
                            continue;
                        }
                        if (var316 == 1001) {
                            var6 -= 2;
                            var58.field1746 = class139.field2869[var6];
                            var58.field1815 = class139.field2869[var6 + 1];
                            class194.method1295((byte) -120, var58);
                            continue;
                        }
                        if (var316 == 1003) {
                            var6--;
                            boolean var59 = class139.field2869[var6] == 1;
                            if (var58.field1780 != var59) {
                                var58.field1780 = var59;
                                class194.method1295((byte) 79, var58);
                            }
                            continue;
                        }
                    } else if (var316 >= 1100 && var316 < 1200 || !(var316 < 2100 || var316 >= 2200)) {
                        class84 var303;
                        if (var316 >= 2000) {
                            var6--;
                            var303 = class138.method907(class139.field2869[var6], false);
                            var316 -= 1000;
                        } else {
                            var303 = var42 ? class191.field3791 : class106.field2205;
                        }
                        if (var316 == 1100) {
                            var6 -= 2;
                            var303.field1781 = class139.field2869[var6];
                            if (var303.field1822 - var303.field1746 < var303.field1781) {
                                var303.field1781 = var303.field1822 - var303.field1746;
                            }
                            if (var303.field1781 < 0) {
                                var303.field1781 = 0;
                            }
                            var303.field1747 = class139.field2869[var6 + 1];
                            if (var303.field1747 > var303.field1777 - var303.field1815) {
                                var303.field1747 = var303.field1777 - var303.field1815;
                            }
                            if (var303.field1747 < 0) {
                                var303.field1747 = 0;
                            }
                            class194.method1295((byte) -120, var303);
                            continue;
                        }
                        if (var316 == 1101) {
                            var6--;
                            var303.field1829 = class139.field2869[var6];
                            class194.method1295((byte) 119, var303);
                            continue;
                        }
                        if (var316 == 1102) {
                            var6--;
                            var303.field1783 = class139.field2869[var6] == 1;
                            class194.method1295((byte) -124, var303);
                            continue;
                        }
                        if (var316 == 1103) {
                            var6--;
                            var303.field1814 = class139.field2869[var6];
                            class194.method1295((byte) 90, var303);
                            continue;
                        }
                        if (var316 == 1104) {
                            var6--;
                            var303.field1841 = class139.field2869[var6];
                            class194.method1295((byte) -127, var303);
                            continue;
                        }
                        if (var316 == 1105) {
                            var6--;
                            var303.field1730 = class139.field2869[var6];
                            class194.method1295((byte) 112, var303);
                            continue;
                        }
                        if (var316 == 1106) {
                            var6--;
                            var303.field1831 = class139.field2869[var6];
                            class194.method1295((byte) -121, var303);
                            continue;
                        }
                        if (var316 == 1107) {
                            var6--;
                            var303.field1713 = class139.field2869[var6] == 1;
                            class194.method1295((byte) 44, var303);
                            continue;
                        }
                        if (var316 == 1108) {
                            var303.field1816 = 1;
                            var6--;
                            var303.field1787 = class139.field2869[var6];
                            class194.method1295((byte) 10, var303);
                            continue;
                        }
                        if (var316 == 1109) {
                            var6 -= 6;
                            var303.field1759 = class139.field2869[var6];
                            var303.field1788 = class139.field2869[var6 + 1];
                            var303.field1742 = class139.field2869[var6 + 2];
                            var303.field1739 = class139.field2869[var6 + 3];
                            var303.field1740 = class139.field2869[var6 + 4];
                            var303.field1802 = class139.field2869[var6 + 5];
                            class194.method1295((byte) -119, var303);
                            continue;
                        }
                        if (var316 == 1110) {
                            var6--;
                            int var304 = class139.field2869[var6];
                            if (var303.field1827 != var304) {
                                var303.field1715 = 0;
                                var303.field1827 = var304;
                                var303.field1785 = 0;
                                class194.method1295((byte) 43, var303);
                            }
                            continue;
                        }
                        if (var316 == 1111) {
                            var6--;
                            var303.field1772 = class139.field2869[var6] == 1;
                            class194.method1295((byte) 26, var303);
                            continue;
                        }
                        if (var316 == 1112) {
                            var7--;
                            class163 var305 = class103.field2161[var7];
                            if (!var305.method1043(81, var303.field1753)) {
                                var303.field1753 = var305;
                                class194.method1295((byte) -119, var303);
                            }
                            continue;
                        }
                        if (var316 == 1113) {
                            var6--;
                            var303.field1743 = class139.field2869[var6];
                            class194.method1295((byte) -116, var303);
                            continue;
                        }
                        if (var316 == 1114) {
                            var6 -= 3;
                            var303.field1860 = class139.field2869[var6];
                            var303.field1728 = class139.field2869[var6 + 1];
                            var303.field1836 = class139.field2869[var6 + 2];
                            class194.method1295((byte) 33, var303);
                            continue;
                        }
                        if (var316 == 1115) {
                            var6--;
                            var303.field1809 = class139.field2869[var6] == 1;
                            class194.method1295((byte) -121, var303);
                            continue;
                        }
                        if (var316 == 1116) {
                            var6--;
                            var303.field1850 = class139.field2869[var6];
                            class194.method1295((byte) 0, var303);
                            continue;
                        }
                        if (var316 == 1117) {
                            var6--;
                            var303.field1796 = class139.field2869[var6];
                            class194.method1295((byte) -125, var303);
                            continue;
                        }
                        if (var316 == 1118) {
                            var6--;
                            var303.field1748 = class139.field2869[var6] == 1;
                            class194.method1295((byte) -120, var303);
                            continue;
                        }
                        if (var316 == 1119) {
                            var6--;
                            var303.field1769 = class139.field2869[var6] == 1;
                            class194.method1295((byte) -122, var303);
                            continue;
                        }
                        if (var316 == 1120) {
                            var6 -= 2;
                            var303.field1822 = class139.field2869[var6];
                            var303.field1777 = class139.field2869[var6 + 1];
                            class194.method1295((byte) -120, var303);
                            continue;
                        }
                    } else if (var316 >= 1200 && var316 < 1300 || var316 >= 2200 && var316 < 2300) {
                        class84 var299;
                        if (var316 < 2000) {
                            var299 = var42 ? class191.field3791 : class106.field2205;
                        } else {
                            var316 -= 1000;
                            var6--;
                            var299 = class138.method907(class139.field2869[var6], false);
                        }
                        class194.method1295((byte) -116, var299);
                        if (var316 == 1200) {
                            var6 -= 2;
                            int var300 = class139.field2869[var6 + 1];
                            int var301 = class139.field2869[var6];
                            if (var301 == -1) {
                                var299.field1787 = -1;
                                var299.field1816 = 1;
                                var299.field1821 = -1;
                            } else {
                                var299.field1790 = var300;
                                var299.field1821 = var301;
                                class4 var302 = class97.method669(-109, var301);
                                var299.field1759 = var302.field63;
                                var299.field1802 = var302.field92;
                                var299.field1740 = var302.field96;
                                if (var299.field1746 > 0) {
                                    var299.field1802 = var299.field1802 * 32 / var299.field1746;
                                }
                                var299.field1739 = var302.field68;
                                var299.field1788 = var302.field70;
                                var299.field1742 = var302.field84;
                            }
                            continue;
                        }
                        if (var316 == 1201) {
                            var299.field1816 = 2;
                            var6--;
                            var299.field1787 = class139.field2869[var6];
                            continue;
                        }
                        if (var316 == 1202) {
                            var299.field1816 = 3;
                            var299.field1787 = class56.field1136.field795.method788(11);
                            continue;
                        }
                        if (var316 == 1203) {
                            var299.field1816 = 6;
                            var6--;
                            var299.field1787 = class139.field2869[var6];
                            continue;
                        }
                        if (var316 == 1204) {
                            var299.field1816 = 5;
                            var6--;
                            var299.field1787 = class139.field2869[var6];
                            continue;
                        }
                    } else if (var316 >= 1300 && var316 < 1400 || var316 >= 2300 && var316 < 2400) {
                        class84 var60;
                        if (var316 < 2000) {
                            var60 = var42 ? class191.field3791 : class106.field2205;
                        } else {
                            var6--;
                            var60 = class138.method907(class139.field2869[var6], false);
                            var316 -= 1000;
                        }
                        if (var316 == 1300) {
                            var6--;
                            int var61 = class139.field2869[var6] - 1;
                            if (var61 >= 0 && var61 <= 9) {
                                var7--;
                                var60.method599(var61, (byte) -126, class103.field2161[var7]);
                                continue;
                            }
                            var7--;
                            continue;
                        }
                        if (var316 == 1301) {
                            var6 -= 2;
                            int var62 = class139.field2869[var6];
                            int var63 = class139.field2869[var6 + 1];
                            var60.field1789 = class48.method298(var62, var63, arg2 ^ 0x1068);
                            continue;
                        }
                        if (var316 == 1302) {
                            var6--;
                            var60.field1771 = class139.field2869[var6] == 1;
                            continue;
                        }
                        if (var316 == 1303) {
                            var6--;
                            var60.field1716 = class139.field2869[var6];
                            continue;
                        }
                        if (var316 == 1304) {
                            var6--;
                            var60.field1852 = class139.field2869[var6];
                            continue;
                        }
                        if (var316 == 1305) {
                            var7--;
                            var60.field1800 = class103.field2161[var7];
                            continue;
                        }
                        if (var316 == 1306) {
                            var7--;
                            var60.field1810 = class103.field2161[var7];
                            continue;
                        }
                        if (var316 == 1307) {
                            var60.field1805 = null;
                            continue;
                        }
                    } else {
                        if (var316 >= 1400 && var316 < 1500 || var316 >= 2400 && var316 < 2500) {
                            class84 var64;
                            if (var316 < 2000) {
                                var64 = var42 ? class191.field3791 : class106.field2205;
                            } else {
                                var316 -= 1000;
                                var6--;
                                var64 = class138.method907(class139.field2869[var6], false);
                            }
                            var7--;
                            class163 var65 = class103.field2161[var7];
                            int[] var66 = null;
                            if (var65.method1029(arg2 ^ 0x1014) > 0 && var65.method1032(var65.method1029(118) - 1, (byte) 119) == 89) {
                                var6--;
                                int var67 = class139.field2869[var6];
                                if (var67 > 0) {
                                    var66 = new int[var67];
                                    while (var67-- > 0) {
                                        var6--;
                                        var66[var67] = class139.field2869[var6];
                                    }
                                }
                                var65 = var65.method1036(var65.method1029(115) - 1, (byte) 97, 0);
                            }
                            Object[] var68 = new Object[var65.method1029(125) + 1];
                            for (int var69 = var68.length - 1; var69 >= 1; var69--) {
                                if (var65.method1032(var69 - 1, (byte) -49) == 115) {
                                    var7--;
                                    var68[var69] = class103.field2161[var7];
                                } else {
                                    var6--;
                                    var68[var69] = Integer.valueOf(class139.field2869[var6]);
                                }
                            }
                            var6--;
                            int var70 = class139.field2869[var6];
                            if (var70 == -1) {
                                var68 = null;
                            } else {
                                var68[0] = Integer.valueOf(var70);
                            }
                            if (var316 == 1423) {
                                var64.field1731 = var68;
                            }
                            if (var316 == 1407) {
                                var64.field1727 = var66;
                                var64.field1801 = var68;
                            }
                            if (var316 == 1416) {
                                var64.field1765 = var68;
                            }
                            if (var316 == 1421) {
                                var64.field1857 = var68;
                            }
                            if (var316 == 1405) {
                                var64.field1799 = var68;
                            }
                            if (var316 == 1412) {
                                var64.field1797 = var68;
                            }
                            if (var316 == 1415) {
                                var64.field1775 = var66;
                                var64.field1837 = var68;
                            }
                            if (var316 == 1401) {
                                var64.field1779 = var68;
                            }
                            if (var316 == 1406) {
                                var64.field1732 = var68;
                            }
                            if (var316 == 1419) {
                                var64.field1735 = var68;
                            }
                            if (var316 == 1420) {
                                var64.field1776 = var68;
                            }
                            var64.field1803 = true;
                            if (var316 == 1414) {
                                var64.field1719 = var66;
                                var64.field1736 = var68;
                            }
                            if (var316 == 1418) {
                                var64.field1741 = var68;
                            }
                            if (var316 == 1402) {
                                var64.field1778 = var68;
                            }
                            if (var316 == 1425) {
                                var64.field1845 = var68;
                            }
                            if (var316 == 1404) {
                                var64.field1826 = var68;
                            }
                            if (var316 == 1408) {
                                var64.field1762 = var68;
                            }
                            if (var316 == 1409) {
                                var64.field1792 = var68;
                            }
                            if (var316 == 1422) {
                                var64.field1749 = var68;
                            }
                            if (var316 == 1417) {
                                var64.field1817 = var68;
                            }
                            if (var316 == 1424) {
                                var64.field1819 = var68;
                            }
                            if (var316 == 1410) {
                                var64.field1786 = var68;
                            }
                            if (var316 == 1411) {
                                var64.field1714 = var68;
                            }
                            if (var316 == 1403) {
                                var64.field1807 = var68;
                            }
                            if (var316 == 1400) {
                                var64.field1767 = var68;
                            }
                            continue;
                        }
                        if (var316 < 1600) {
                            class84 var71 = var42 ? class191.field3791 : class106.field2205;
                            if (var316 == 1500) {
                                class139.field2869[var6++] = var71.field1725;
                                continue;
                            }
                            if (var316 == 1501) {
                                class139.field2869[var6++] = var71.field1744;
                                continue;
                            }
                            if (var316 == 1502) {
                                class139.field2869[var6++] = var71.field1746;
                                continue;
                            }
                            if (var316 == 1503) {
                                class139.field2869[var6++] = var71.field1815;
                                continue;
                            }
                            if (var316 == 1504) {
                                class139.field2869[var6++] = var71.field1780 ? 1 : 0;
                                continue;
                            }
                            if (var316 == 1505) {
                                class139.field2869[var6++] = var71.field1724;
                                continue;
                            }
                        } else if (var316 < 1700) {
                            class84 var298 = var42 ? class191.field3791 : class106.field2205;
                            if (var316 == 1600) {
                                class139.field2869[var6++] = var298.field1781;
                                continue;
                            }
                            if (var316 == 1601) {
                                class139.field2869[var6++] = var298.field1747;
                                continue;
                            }
                            if (var316 == 1602) {
                                class103.field2161[var7++] = var298.field1753;
                                continue;
                            }
                            if (var316 == 1603) {
                                class139.field2869[var6++] = var298.field1822;
                                continue;
                            }
                            if (var316 == 1604) {
                                class139.field2869[var6++] = var298.field1777;
                                continue;
                            }
                            if (var316 == 1605) {
                                class139.field2869[var6++] = var298.field1802;
                                continue;
                            }
                            if (var316 == 1606) {
                                class139.field2869[var6++] = var298.field1742;
                                continue;
                            }
                            if (var316 == 1607) {
                                class139.field2869[var6++] = var298.field1740;
                                continue;
                            }
                            if (var316 == 1608) {
                                class139.field2869[var6++] = var298.field1739;
                                continue;
                            }
                            if (var316 == 1609) {
                                class139.field2869[var6++] = var298.field1814;
                                continue;
                            }
                        } else if (var316 < 1800) {
                            class84 var72 = var42 ? class191.field3791 : class106.field2205;
                            if (var316 == 1700) {
                                class139.field2869[var6++] = var72.field1821;
                                continue;
                            }
                            if (var316 == 1701) {
                                if (var72.field1821 == -1) {
                                    class139.field2869[var6++] = 0;
                                } else {
                                    class139.field2869[var6++] = var72.field1790;
                                }
                                continue;
                            }
                            if (var316 == 1702) {
                                class139.field2869[var6++] = var72.field1758;
                                continue;
                            }
                        } else if (var316 < 1900) {
                            class84 var296 = var42 ? class191.field3791 : class106.field2205;
                            if (var316 == 1800) {
                                class139.field2869[var6++] = class88.method618((byte) -62, class21.method130(var296, (byte) 77));
                                continue;
                            }
                            if (var316 == 1801) {
                                var6--;
                                int var297 = class139.field2869[var6];
                                int var318 = var297 - 1;
                                if (var296.field1805 != null && var318 < var296.field1805.length && var296.field1805[var318] != null) {
                                    class103.field2161[var7++] = var296.field1805[var318];
                                    continue;
                                }
                                class103.field2161[var7++] = class20.field348;
                                continue;
                            }
                            if (var316 == 1802) {
                                if (var296.field1800 == null) {
                                    class103.field2161[var7++] = class20.field348;
                                } else {
                                    class103.field2161[var7++] = var296.field1800;
                                }
                                continue;
                            }
                        } else if (var316 < 2600) {
                            var6--;
                            class84 var73 = class138.method907(class139.field2869[var6], false);
                            if (var316 == 2500) {
                                class139.field2869[var6++] = var73.field1725;
                                continue;
                            }
                            if (var316 == 2501) {
                                class139.field2869[var6++] = var73.field1744;
                                continue;
                            }
                            if (var316 == 2502) {
                                class139.field2869[var6++] = var73.field1746;
                                continue;
                            }
                            if (var316 == 2503) {
                                class139.field2869[var6++] = var73.field1815;
                                continue;
                            }
                            if (var316 == 2504) {
                                class139.field2869[var6++] = var73.field1780 ? 1 : 0;
                                continue;
                            }
                            if (var316 == 2505) {
                                class139.field2869[var6++] = var73.field1724;
                                continue;
                            }
                        } else if (var316 < 2700) {
                            var6--;
                            class84 var74 = class138.method907(class139.field2869[var6], false);
                            if (var316 == 2600) {
                                class139.field2869[var6++] = var74.field1781;
                                continue;
                            }
                            if (var316 == 2601) {
                                class139.field2869[var6++] = var74.field1747;
                                continue;
                            }
                            if (var316 == 2602) {
                                class103.field2161[var7++] = var74.field1753;
                                continue;
                            }
                            if (var316 == 2603) {
                                class139.field2869[var6++] = var74.field1822;
                                continue;
                            }
                            if (var316 == 2604) {
                                class139.field2869[var6++] = var74.field1777;
                                continue;
                            }
                            if (var316 == 2605) {
                                class139.field2869[var6++] = var74.field1802;
                                continue;
                            }
                            if (var316 == 2606) {
                                class139.field2869[var6++] = var74.field1742;
                                continue;
                            }
                            if (var316 == 2607) {
                                class139.field2869[var6++] = var74.field1740;
                                continue;
                            }
                            if (var316 == 2608) {
                                class139.field2869[var6++] = var74.field1739;
                                continue;
                            }
                            if (var316 == 2609) {
                                class139.field2869[var6++] = var74.field1814;
                                continue;
                            }
                        } else if (var316 < 2800) {
                            if (var316 == 2700) {
                                var6--;
                                class84 var286 = class138.method907(class139.field2869[var6], false);
                                class139.field2869[var6++] = var286.field1821;
                                continue;
                            }
                            if (var316 == 2701) {
                                var6--;
                                class84 var287 = class138.method907(class139.field2869[var6], false);
                                if (var287.field1821 == -1) {
                                    class139.field2869[var6++] = 0;
                                } else {
                                    class139.field2869[var6++] = var287.field1790;
                                }
                                continue;
                            }
                            if (var316 == 2702) {
                                var6--;
                                int var288 = class139.field2869[var6];
                                class87 var289 = (class87) class138.field2847.method465((long) var288, (byte) 94);
                                if (var289 == null) {
                                    class139.field2869[var6++] = 0;
                                } else {
                                    class139.field2869[var6++] = 1;
                                }
                                continue;
                            }
                            if (var316 == 2703) {
                                var6--;
                                class84 var290 = class138.method907(class139.field2869[var6], false);
                                if (var290.field1804 == null) {
                                    class139.field2869[var6++] = 0;
                                    continue;
                                }
                                int var291 = var290.field1804.length;
                                for (int var292 = 0; var292 < var290.field1804.length; var292++) {
                                    if (var290.field1804[var292] == null) {
                                        var291 = var292;
                                        break;
                                    }
                                }
                                class139.field2869[var6++] = var291;
                                continue;
                            }
                            if (var316 == 2704 || var316 == 2705) {
                                var6 -= 2;
                                int var293 = class139.field2869[var6];
                                int var294 = class139.field2869[var6 + 1];
                                class87 var295 = (class87) class138.field2847.method465((long) var293, (byte) 110);
                                if (var295 != null && var295.field1903 == var294) {
                                    class139.field2869[var6++] = 1;
                                } else {
                                    class139.field2869[var6++] = 0;
                                }
                                continue;
                            }
                        } else if (var316 < 2900) {
                            var6--;
                            class84 var75 = class138.method907(class139.field2869[var6], false);
                            if (var316 == 2800) {
                                class139.field2869[var6++] = class88.method618((byte) -26, class21.method130(var75, (byte) 77));
                                continue;
                            }
                            if (var316 == 2801) {
                                var6--;
                                int var76 = class139.field2869[var6];
                                int var317 = var76 - 1;
                                if (var75.field1805 != null && var75.field1805.length > var317 && var75.field1805[var317] != null) {
                                    class103.field2161[var7++] = var75.field1805[var317];
                                    continue;
                                }
                                class103.field2161[var7++] = class20.field348;
                                continue;
                            }
                            if (var316 == 2802) {
                                if (var75.field1800 == null) {
                                    class103.field2161[var7++] = class20.field348;
                                } else {
                                    class103.field2161[var7++] = var75.field1800;
                                }
                                continue;
                            }
                        } else if (var316 < 3200) {
                            if (var316 == 3100) {
                                var7--;
                                class163 var271 = class103.field2161[var7];
                                class43.method267((byte) -109, var271, class20.field348, 0);
                                continue;
                            }
                            if (var316 == 3101) {
                                var6 -= 2;
                                class38.method241(class139.field2869[var6], class139.field2869[var6 + 1], -13808, class56.field1136);
                                continue;
                            }
                            if (var316 == 3103) {
                                class97.method670(-94);
                                continue;
                            }
                            if (var316 == 3104) {
                                class28.field520++;
                                var7--;
                                class163 var272 = class103.field2161[var7];
                                int var273 = 0;
                                if (var272.method1042(arg2 ^ 0xFFFFF049)) {
                                    var273 = var272.method1025(20559);
                                }
                                class141.field2896.method326(arg2 - 4096, 135);
                                class141.field2896.method369(var273, (byte) -117);
                                continue;
                            }
                            if (var316 == 3105) {
                                class149.field3061++;
                                var7--;
                                class163 var274 = class103.field2161[var7];
                                class141.field2896.method326(104, 153);
                                class141.field2896.method373((byte) -52, var274.method1058(105));
                                continue;
                            }
                            if (var316 == 3106) {
                                class146.field2995++;
                                var7--;
                                class163 var275 = class103.field2161[var7];
                                class141.field2896.method326(arg2 ^ 0x1000, 239);
                                class141.field2896.method370(var275.method1029(117) + 1, (byte) 123);
                                class141.field2896.method342(true, var275);
                                continue;
                            }
                            if (var316 == 3107) {
                                var6--;
                                int var276 = class139.field2869[var6];
                                var7--;
                                class163 var277 = class103.field2161[var7];
                                class73.method516((byte) 29, var277, var276);
                                continue;
                            }
                            if (var316 == 3108) {
                                var6 -= 3;
                                int var278 = class139.field2869[var6 + 1];
                                int var279 = class139.field2869[var6 + 2];
                                int var280 = class139.field2869[var6];
                                class84 var281 = class138.method907(var279, false);
                                class39.method244(var280, var278, var281, (byte) 9);
                                continue;
                            }
                            if (var316 == 3109) {
                                var6 -= 2;
                                int var282 = class139.field2869[var6];
                                class84 var283 = var42 ? class191.field3791 : class106.field2205;
                                int var284 = class139.field2869[var6 + 1];
                                class39.method244(var282, var284, var283, (byte) 9);
                                continue;
                            }
                            if (var316 == 3110) {
                                class109.field2311++;
                                var6--;
                                int var285 = class139.field2869[var6];
                                class141.field2896.method326(104, 90);
                                class141.field2896.method346(0, var285);
                                continue;
                            }
                        } else if (var316 < 3300) {
                            if (var316 == 3200) {
                                var6 -= 3;
                                class175.method1184(-1, class139.field2869[var6], class139.field2869[var6 + 2], class139.field2869[var6 + 1]);
                                continue;
                            }
                            if (var316 == 3201) {
                                int var10000 = arg2 - 4086;
                                var6--;
                                class59.method424(var10000, class139.field2869[var6]);
                                continue;
                            }
                            if (var316 == 3202) {
                                var6 -= 2;
                                class107.method726(class139.field2869[var6 + 1], class139.field2869[var6], 30706);
                                continue;
                            }
                        } else if (var316 < 3400) {
                            if (var316 == 3300) {
                                class139.field2869[var6++] = class51.field1023;
                                continue;
                            }
                            if (var316 == 3301) {
                                var6 -= 2;
                                int var249 = class139.field2869[var6];
                                int var250 = class139.field2869[var6 + 1];
                                class139.field2869[var6++] = class194.method1292(false, var249, var250);
                                continue;
                            }
                            if (var316 == 3302) {
                                var6 -= 2;
                                int var251 = class139.field2869[var6 + 1];
                                int var252 = class139.field2869[var6];
                                class139.field2869[var6++] = class135.method894(var252, false, var251);
                                continue;
                            }
                            if (var316 == 3303) {
                                var6 -= 2;
                                int var253 = class139.field2869[var6 + 1];
                                int var254 = class139.field2869[var6];
                                class139.field2869[var6++] = class74.method522(var253, false, var254);
                                continue;
                            }
                            if (var316 == 3304) {
                                var6--;
                                int var255 = class139.field2869[var6];
                                class139.field2869[var6++] = class113.method776(113, var255).field2752;
                                continue;
                            }
                            if (var316 == 3305) {
                                var6--;
                                int var256 = class139.field2869[var6];
                                class139.field2869[var6++] = class92.field2003[var256];
                                continue;
                            }
                            if (var316 == 3306) {
                                var6--;
                                int var257 = class139.field2869[var6];
                                class139.field2869[var6++] = class186.field3711[var257];
                                continue;
                            }
                            if (var316 == 3307) {
                                var6--;
                                int var258 = class139.field2869[var6];
                                class139.field2869[var6++] = class11.field227[var258];
                                continue;
                            }
                            if (var316 == 3308) {
                                int var259 = class60.field1227;
                                int var260 = (class56.field1136.field716 >> 7) + class172.field3493;
                                int var261 = (class56.field1136.field679 >> 7) + class69.field1470;
                                class139.field2869[var6++] = (var259 << 28) + (var260 << 14) + var261;
                                continue;
                            }
                            if (var316 == 3309) {
                                var6--;
                                int var262 = class139.field2869[var6];
                                class139.field2869[var6++] = class133.method887(16383, var262 >> 14);
                                continue;
                            }
                            if (var316 == 3310) {
                                var6--;
                                int var263 = class139.field2869[var6];
                                class139.field2869[var6++] = var263 >> 28;
                                continue;
                            }
                            if (var316 == 3311) {
                                var6--;
                                int var264 = class139.field2869[var6];
                                class139.field2869[var6++] = class133.method887(var264, 16383);
                                continue;
                            }
                            if (var316 == 3312) {
                                class139.field2869[var6++] = class143.field2955 ? 1 : 0;
                                continue;
                            }
                            if (var316 == 3313) {
                                var6 -= 2;
                                int var265 = class139.field2869[var6] + 32768;
                                int var266 = class139.field2869[var6 + 1];
                                class139.field2869[var6++] = class194.method1292(false, var265, var266);
                                continue;
                            }
                            if (var316 == 3314) {
                                var6 -= 2;
                                int var267 = class139.field2869[var6 + 1];
                                int var268 = class139.field2869[var6] + 32768;
                                class139.field2869[var6++] = class135.method894(var268, false, var267);
                                continue;
                            }
                            if (var316 == 3315) {
                                var6 -= 2;
                                int var269 = class139.field2869[var6] + 32768;
                                int var270 = class139.field2869[var6 + 1];
                                class139.field2869[var6++] = class74.method522(var270, false, var269);
                                continue;
                            }
                            if (var316 == 3316) {
                                if (class21.field366 >= 2) {
                                    class139.field2869[var6++] = class21.field366;
                                } else {
                                    class139.field2869[var6++] = 0;
                                }
                                continue;
                            }
                            if (var316 == 3317) {
                                class139.field2869[var6++] = class188.field3732;
                                continue;
                            }
                            if (var316 == 3318) {
                                class139.field2869[var6++] = class27.field503;
                                continue;
                            }
                            if (var316 == 3321) {
                                class139.field2869[var6++] = class58.field1171;
                                continue;
                            }
                            if (var316 == 3322) {
                                class139.field2869[var6++] = class38.field791;
                                continue;
                            }
                            if (var316 == 3323) {
                                if (class21.field366 == 1) {
                                    class139.field2869[var6++] = 1;
                                } else {
                                    class139.field2869[var6++] = 0;
                                }
                                continue;
                            }
                            if (var316 == 3324) {
                                if (class65.field1381 >= 5 && class65.field1381 <= 9) {
                                    class139.field2869[var6++] = class65.field1381;
                                    continue;
                                }
                                class139.field2869[var6++] = 0;
                                continue;
                            }
                            if (var316 == 3325) {
                                if (class155.field3215 <= 0) {
                                    class139.field2869[var6++] = 0;
                                } else {
                                    class139.field2869[var6++] = 1;
                                }
                                continue;
                            }
                            if (var316 == 3326) {
                                class139.field2869[var6++] = class56.field1136.field753;
                                continue;
                            }
                            if (var316 == 3327) {
                                class139.field2869[var6++] = class56.field1136.field795.field2402 ? 1 : 0;
                                continue;
                            }
                        } else if (var316 < 3500) {
                            if (var316 == 3400) {
                                var6 -= 2;
                                int var239 = class139.field2869[var6];
                                int var240 = class139.field2869[var6 + 1];
                                class41 var241 = class170.method1146(var239, arg2 ^ 0xFFFFEFF7);
                                for (int var242 = 0; var242 < var241.field849; var242++) {
                                    if (var241.field835[var242] == var240) {
                                        class103.field2161[var7++] = var241.field844[var242];
                                        var241 = null;
                                        break;
                                    }
                                }
                                if (var241 != null) {
                                    class103.field2161[var7++] = var241.field851;
                                }
                                continue;
                            }
                            if (var316 == 3408) {
                                var6 -= 4;
                                int var243 = class139.field2869[var6 + 2];
                                int var244 = class139.field2869[var6 + 3];
                                int var245 = class139.field2869[var6];
                                int var246 = class139.field2869[var6 + 1];
                                class41 var247 = class170.method1146(var243, -128);
                                if (var247.field834 == var245 && var247.field850 == var246) {
                                    for (int var248 = 0; var248 < var247.field849; var248++) {
                                        if (var247.field835[var248] == var244) {
                                            if (var246 == 115) {
                                                class103.field2161[var7++] = var247.field844[var248];
                                            } else {
                                                class139.field2869[var6++] = var247.field838[var248];
                                            }
                                            var247 = null;
                                            break;
                                        }
                                    }
                                    if (var247 != null) {
                                        if (var246 == 115) {
                                            class103.field2161[var7++] = var247.field851;
                                        } else {
                                            class139.field2869[var6++] = var247.field845;
                                        }
                                    }
                                    continue;
                                }
                                if (var246 == 115) {
                                    class103.field2161[var7++] = class170.field3455;
                                } else {
                                    class139.field2869[var6++] = 0;
                                }
                                continue;
                            }
                        } else if (var316 < 3700) {
                            if (var316 == 3600) {
                                if (class6.field132 == 0) {
                                    class139.field2869[var6++] = -2;
                                } else if (class6.field132 == 1) {
                                    class139.field2869[var6++] = -1;
                                } else {
                                    class139.field2869[var6++] = class186.field3717;
                                }
                                continue;
                            }
                            if (var316 == 3601) {
                                var6--;
                                int var77 = class139.field2869[var6];
                                if (class6.field132 == 2 && class186.field3717 > var77) {
                                    class103.field2161[var7++] = class87.field1891[var77];
                                    continue;
                                }
                                class103.field2161[var7++] = class20.field348;
                                continue;
                            }
                            if (var316 == 3602) {
                                var6--;
                                int var78 = class139.field2869[var6];
                                if (class6.field132 == 2 && var78 < class186.field3717) {
                                    class139.field2869[var6++] = class115.field2449[var78];
                                    continue;
                                }
                                class139.field2869[var6++] = 0;
                                continue;
                            }
                            if (var316 == 3603) {
                                var6--;
                                int var79 = class139.field2869[var6];
                                if (class6.field132 == 2 && var79 < class186.field3717) {
                                    class139.field2869[var6++] = class52.field1091[var79];
                                    continue;
                                }
                                class139.field2869[var6++] = 0;
                                continue;
                            }
                            if (var316 == 3604) {
                                var6--;
                                int var80 = class139.field2869[var6];
                                var7--;
                                class163 var81 = class103.field2161[var7];
                                class89.method622(0, var81, var80);
                                continue;
                            }
                            if (var316 == 3605) {
                                var7--;
                                class163 var82 = class103.field2161[var7];
                                class161.method1006(var82.method1058(25), arg2 ^ 0xFFFFEFE9);
                                continue;
                            }
                            if (var316 == 3606) {
                                var7--;
                                class163 var83 = class103.field2161[var7];
                                class75.method528((byte) 68, var83.method1058(113));
                                continue;
                            }
                            if (var316 == 3607) {
                                var7--;
                                class163 var84 = class103.field2161[var7];
                                class95.method661(0, var84.method1058(125));
                                continue;
                            }
                            if (var316 == 3608) {
                                var7--;
                                class163 var85 = class103.field2161[var7];
                                class19.method123(var85.method1058(-113), (byte) -62);
                                continue;
                            }
                            if (var316 == 3609) {
                                var7--;
                                class163 var86 = class103.field2161[var7];
                                if (var86.method1024(116, class180.field3617) || var86.method1024(112, class44.field886)) {
                                    var86 = var86.method1039(7, arg2 ^ 0x1034);
                                }
                                class139.field2869[var6++] = class31.method206(0, var86) ? 1 : 0;
                                continue;
                            }
                            if (var316 == 3611) {
                                if (class65.field1387 == null) {
                                    class103.field2161[var7++] = class20.field348;
                                } else {
                                    class103.field2161[var7++] = class65.field1387.method1031(false);
                                }
                                continue;
                            }
                            if (var316 == 3612) {
                                if (class65.field1387 == null) {
                                    class139.field2869[var6++] = 0;
                                } else {
                                    class139.field2869[var6++] = class75.field1563;
                                }
                                continue;
                            }
                            if (var316 == 3613) {
                                var6--;
                                int var87 = class139.field2869[var6];
                                if (class65.field1387 != null && class75.field1563 > var87) {
                                    class103.field2161[var7++] = class176.field3540[var87].field4027.method1031(false);
                                    continue;
                                }
                                class103.field2161[var7++] = class20.field348;
                                continue;
                            }
                            if (var316 == 3614) {
                                var6--;
                                int var88 = class139.field2869[var6];
                                if (class65.field1387 != null && class75.field1563 > var88) {
                                    class139.field2869[var6++] = class176.field3540[var88].field4034;
                                    continue;
                                }
                                class139.field2869[var6++] = 0;
                                continue;
                            }
                            if (var316 == 3615) {
                                var6--;
                                int var89 = class139.field2869[var6];
                                if (class65.field1387 != null && var89 < class75.field1563) {
                                    class139.field2869[var6++] = class176.field3540[var89].field4029;
                                    continue;
                                }
                                class139.field2869[var6++] = 0;
                                continue;
                            }
                            if (var316 == 3616) {
                                class139.field2869[var6++] = class155.field3214;
                                continue;
                            }
                            if (var316 == 3617) {
                                var7--;
                                class163 var90 = class103.field2161[var7];
                                class17.method110(var90, 0);
                                continue;
                            }
                            if (var316 == 3618) {
                                class139.field2869[var6++] = class205.field4006;
                                continue;
                            }
                            if (var316 == 3619) {
                                var7--;
                                class163 var91 = class103.field2161[var7];
                                class70.method501((byte) 113, var91.method1058(-125));
                                continue;
                            }
                            if (var316 == 3620) {
                                class68.method484(-1379);
                                continue;
                            }
                            if (var316 == 3621) {
                                if (class6.field132 == 0) {
                                    class139.field2869[var6++] = -1;
                                } else {
                                    class139.field2869[var6++] = class26.field479;
                                }
                                continue;
                            }
                            if (var316 == 3622) {
                                var6--;
                                int var92 = class139.field2869[var6];
                                if (class6.field132 != 0 && class26.field479 > var92) {
                                    class103.field2161[var7++] = class116.method802(class130.field2713[var92], true).method1031(false);
                                    continue;
                                }
                                class103.field2161[var7++] = class20.field348;
                                continue;
                            }
                            if (var316 == 3623) {
                                var7--;
                                class163 var93 = class103.field2161[var7];
                                if (var93.method1024(93, class180.field3617) || var93.method1024(91, class44.field886)) {
                                    var93 = var93.method1039(7, 65);
                                }
                                class139.field2869[var6++] = class79.method543(var93, -7854) ? 1 : 0;
                                continue;
                            }
                            if (var316 == 3624) {
                                var6--;
                                int var94 = class139.field2869[var6];
                                if (class176.field3540 != null && class75.field1563 > var94 && class176.field3540[var94].field4027.method1038(class56.field1136.field758, 0)) {
                                    class139.field2869[var6++] = 1;
                                    continue;
                                }
                                class139.field2869[var6++] = 0;
                                continue;
                            }
                            if (var316 == 3625) {
                                if (class113.field2387 == null) {
                                    class103.field2161[var7++] = class20.field348;
                                } else {
                                    class103.field2161[var7++] = class113.field2387.method1031(false);
                                }
                                continue;
                            }
                        } else if (var316 < 4000) {
                            if (var316 == 3903) {
                                var6--;
                                int var225 = class139.field2869[var6];
                                class139.field2869[var6++] = class71.field1499[var225].method431((byte) -61);
                                continue;
                            }
                            if (var316 == 3904) {
                                var6--;
                                int var226 = class139.field2869[var6];
                                class139.field2869[var6++] = class71.field1499[var226].field1231;
                                continue;
                            }
                            if (var316 == 3905) {
                                var6--;
                                int var227 = class139.field2869[var6];
                                class139.field2869[var6++] = class71.field1499[var227].field1225;
                                continue;
                            }
                            if (var316 == 3906) {
                                var6--;
                                int var228 = class139.field2869[var6];
                                class139.field2869[var6++] = class71.field1499[var228].field1226;
                                continue;
                            }
                            if (var316 == 3907) {
                                var6--;
                                int var229 = class139.field2869[var6];
                                class139.field2869[var6++] = class71.field1499[var229].field1230;
                                continue;
                            }
                            if (var316 == 3908) {
                                var6--;
                                int var230 = class139.field2869[var6];
                                class139.field2869[var6++] = class71.field1499[var230].field1223;
                                continue;
                            }
                            if (var316 == 3910) {
                                var6--;
                                int var231 = class139.field2869[var6];
                                int var232 = class71.field1499[var231].method429(-8);
                                class139.field2869[var6++] = var232 == 0 ? 1 : 0;
                                continue;
                            }
                            if (var316 == 3911) {
                                var6--;
                                int var233 = class139.field2869[var6];
                                int var234 = class71.field1499[var233].method429(-8);
                                class139.field2869[var6++] = var234 == 2 ? 1 : 0;
                                continue;
                            }
                            if (var316 == 3912) {
                                var6--;
                                int var235 = class139.field2869[var6];
                                int var236 = class71.field1499[var235].method429(-8);
                                class139.field2869[var6++] = var236 == 5 ? 1 : 0;
                                continue;
                            }
                            if (var316 == 3913) {
                                var6--;
                                int var237 = class139.field2869[var6];
                                int var238 = class71.field1499[var237].method429(-8);
                                class139.field2869[var6++] = var238 == 1 ? 1 : 0;
                                continue;
                            }
                        } else if (var316 < 4100) {
                            if (var316 == 4000) {
                                var6 -= 2;
                                int var182 = class139.field2869[var6 + 1];
                                int var183 = class139.field2869[var6];
                                class139.field2869[var6++] = var182 + var183;
                                continue;
                            }
                            if (var316 == 4001) {
                                var6 -= 2;
                                int var184 = class139.field2869[var6];
                                int var185 = class139.field2869[var6 + 1];
                                class139.field2869[var6++] = var184 - var185;
                                continue;
                            }
                            if (var316 == 4002) {
                                var6 -= 2;
                                int var186 = class139.field2869[var6];
                                int var187 = class139.field2869[var6 + 1];
                                class139.field2869[var6++] = var186 * var187;
                                continue;
                            }
                            if (var316 == 4003) {
                                var6 -= 2;
                                int var188 = class139.field2869[var6];
                                int var189 = class139.field2869[var6 + 1];
                                class139.field2869[var6++] = var188 / var189;
                                continue;
                            }
                            if (var316 == 4004) {
                                var6--;
                                int var190 = class139.field2869[var6];
                                class139.field2869[var6++] = (int) (Math.random() * (double) var190);
                                continue;
                            }
                            if (var316 == 4005) {
                                var6--;
                                int var191 = class139.field2869[var6];
                                class139.field2869[var6++] = (int) (Math.random() * (double) (var191 + 1));
                                continue;
                            }
                            if (var316 == 4006) {
                                var6 -= 5;
                                int var192 = class139.field2869[var6 + 1];
                                int var193 = class139.field2869[var6];
                                int var194 = class139.field2869[var6 + 3];
                                int var195 = class139.field2869[var6 + 4];
                                int var196 = class139.field2869[var6 + 2];
                                class139.field2869[var6++] = (var195 - var196) * (-var193 + var192) / (var194 - var196) + var193;
                                continue;
                            }
                            if (var316 == 4007) {
                                var6 -= 2;
                                int var197 = class139.field2869[var6 + 1];
                                int var198 = class139.field2869[var6];
                                class139.field2869[var6++] = var197 * var198 / 100 + var198;
                                continue;
                            }
                            if (var316 == 4008) {
                                var6 -= 2;
                                int var199 = class139.field2869[var6];
                                int var200 = class139.field2869[var6 + 1];
                                class139.field2869[var6++] = class150.method971(0x1 << var200, var199);
                                continue;
                            }
                            if (var316 == 4009) {
                                var6 -= 2;
                                int var201 = class139.field2869[var6];
                                int var202 = class139.field2869[var6 + 1];
                                class139.field2869[var6++] = class133.method887(-(0x1 << var202) - 1, var201);
                                continue;
                            }
                            if (var316 == 4010) {
                                var6 -= 2;
                                int var203 = class139.field2869[var6];
                                int var204 = class139.field2869[var6 + 1];
                                class139.field2869[var6++] = class133.method887(var203, 0x1 << var204) == 0 ? 0 : 1;
                                continue;
                            }
                            if (var316 == 4011) {
                                var6 -= 2;
                                int var205 = class139.field2869[var6];
                                int var206 = class139.field2869[var6 + 1];
                                class139.field2869[var6++] = var205 % var206;
                                continue;
                            }
                            if (var316 == 4012) {
                                var6 -= 2;
                                int var207 = class139.field2869[var6];
                                int var208 = class139.field2869[var6 + 1];
                                if (var207 == 0) {
                                    class139.field2869[var6++] = 0;
                                } else {
                                    class139.field2869[var6++] = (int) Math.pow((double) var207, (double) var208);
                                }
                                continue;
                            }
                            if (var316 == 4013) {
                                var6 -= 2;
                                int var209 = class139.field2869[var6 + 1];
                                int var210 = class139.field2869[var6];
                                if (var210 == 0) {
                                    class139.field2869[var6++] = 0;
                                } else if (var209 == 0) {
                                    class139.field2869[var6++] = Integer.MAX_VALUE;
                                } else {
                                    class139.field2869[var6++] = (int) Math.pow((double) var210, 1.0D / (double) var209);
                                }
                                continue;
                            }
                            if (var316 == 4014) {
                                var6 -= 2;
                                int var211 = class139.field2869[var6 + 1];
                                int var212 = class139.field2869[var6];
                                class139.field2869[var6++] = class133.method887(var212, var211);
                                continue;
                            }
                            if (var316 == 4015) {
                                var6 -= 2;
                                int var213 = class139.field2869[var6];
                                int var214 = class139.field2869[var6 + 1];
                                class139.field2869[var6++] = class150.method971(var213, var214);
                                continue;
                            }
                            if (var316 == 4016) {
                                var6 -= 2;
                                int var215 = class139.field2869[var6 + 1];
                                int var216 = class139.field2869[var6];
                                class139.field2869[var6++] = var215 > var216 ? var216 : var215;
                                continue;
                            }
                            if (var316 == 4017) {
                                var6 -= 2;
                                int var217 = class139.field2869[var6];
                                int var218 = class139.field2869[var6 + 1];
                                class139.field2869[var6++] = var217 > var218 ? var217 : var218;
                                continue;
                            }
                            if (var316 == 4018) {
                                var6 -= 3;
                                long var219 = (long) class139.field2869[var6 + 1];
                                long var221 = (long) class139.field2869[var6];
                                long var223 = (long) class139.field2869[var6 + 2];
                                class139.field2869[var6++] = (int) (var221 * var223 / var219);
                                continue;
                            }
                        } else if (var316 < 4200) {
                            if (var316 == 4100) {
                                var7--;
                                class163 var95 = class103.field2161[var7];
                                var6--;
                                int var96 = class139.field2869[var6];
                                class103.field2161[var7++] = class180.method1216(new class163[] { var95, class34.method217(var96, -93) }, false);
                                continue;
                            }
                            if (var316 == 4101) {
                                var7 -= 2;
                                class163 var97 = class103.field2161[var7];
                                class163 var98 = class103.field2161[var7 + 1];
                                class103.field2161[var7++] = class180.method1216(new class163[] { var97, var98 }, false);
                                continue;
                            }
                            if (var316 == 4102) {
                                var7--;
                                class163 var99 = class103.field2161[var7];
                                var6--;
                                int var100 = class139.field2869[var6];
                                class103.field2161[var7++] = class180.method1216(new class163[] { var99, class11.method87(var100, true, false) }, false);
                                continue;
                            }
                            if (var316 == 4103) {
                                var7--;
                                class163 var101 = class103.field2161[var7];
                                class103.field2161[var7++] = var101.method1060(-18265);
                                continue;
                            }
                            if (var316 == 4104) {
                                var6--;
                                int var102 = class139.field2869[var6];
                                long var103 = ((long) var102 + 11745L) * 86400000L;
                                class51.field1025.setTime(new Date(var103));
                                int var105 = class51.field1025.get(5);
                                int var106 = class51.field1025.get(2);
                                int var107 = class51.field1025.get(1);
                                class103.field2161[var7++] = class180.method1216(new class163[] { class34.method217(var105, -114), class135.field2784, class7.field151[var106], class135.field2784, class34.method217(var107, -107) }, false);
                                continue;
                            }
                            if (var316 == 4105) {
                                var7 -= 2;
                                class163 var108 = class103.field2161[var7];
                                class163 var109 = class103.field2161[var7 + 1];
                                if (class56.field1136.field795 != null && class56.field1136.field795.field2402) {
                                    class103.field2161[var7++] = var109;
                                    continue;
                                }
                                class103.field2161[var7++] = var108;
                                continue;
                            }
                            if (var316 == 4106) {
                                var6--;
                                int var110 = class139.field2869[var6];
                                class103.field2161[var7++] = class34.method217(var110, -123);
                                continue;
                            }
                            if (var316 == 4107) {
                                var7 -= 2;
                                class139.field2869[var6++] = class103.field2161[var7].method1045(111, class103.field2161[var7 + 1]);
                                continue;
                            }
                            if (var316 == 4108) {
                                var6 -= 2;
                                int var111 = class139.field2869[var6];
                                var7--;
                                class163 var112 = class103.field2161[var7];
                                int var113 = class139.field2869[var6 + 1];
                                byte[] var114 = class202.field3981.method1235(0, (byte) -64, var113);
                                class126 var115 = new class126(var114);
                                var115.method576(class133.field2771, null);
                                class139.field2869[var6++] = var115.method571(var112, var111);
                                continue;
                            }
                            if (var316 == 4109) {
                                var7--;
                                class163 var116 = class103.field2161[var7];
                                var6 -= 2;
                                int var117 = class139.field2869[var6];
                                int var118 = class139.field2869[var6 + 1];
                                byte[] var119 = class202.field3981.method1235(0, (byte) -64, var118);
                                class126 var120 = new class126(var119);
                                var120.method576(class133.field2771, null);
                                class139.field2869[var6++] = var120.method582(var116, var117);
                                continue;
                            }
                            if (var316 == 4110) {
                                var7 -= 2;
                                class163 var121 = class103.field2161[var7];
                                class163 var122 = class103.field2161[var7 + 1];
                                var6--;
                                if (class139.field2869[var6] == 1) {
                                    class103.field2161[var7++] = var121;
                                } else {
                                    class103.field2161[var7++] = var122;
                                }
                                continue;
                            }
                            if (var316 == 4111) {
                                var7--;
                                class163 var123 = class103.field2161[var7];
                                class103.field2161[var7++] = class83.method580(var123);
                                continue;
                            }
                            if (var316 == 4112) {
                                var7--;
                                class163 var124 = class103.field2161[var7];
                                var6--;
                                int var125 = class139.field2869[var6];
                                class103.field2161[var7++] = var124.method1047(var125, (byte) -78);
                                continue;
                            }
                            if (var316 == 4113) {
                                var6--;
                                int var126 = class139.field2869[var6];
                                class139.field2869[var6++] = class56.method410(129, var126) ? 1 : 0;
                                continue;
                            }
                            if (var316 == 4114) {
                                var6--;
                                int var127 = class139.field2869[var6];
                                class139.field2869[var6++] = class162.method1010(var127, -1) ? 1 : 0;
                                continue;
                            }
                            if (var316 == 4115) {
                                var6--;
                                int var128 = class139.field2869[var6];
                                class139.field2869[var6++] = class186.method1261(var128, -110) ? 1 : 0;
                                continue;
                            }
                            if (var316 == 4116) {
                                var6--;
                                int var129 = class139.field2869[var6];
                                class139.field2869[var6++] = class130.method859(class70.method502(arg2, 4184), var129) ? 1 : 0;
                                continue;
                            }
                            if (var316 == 4117) {
                                var7--;
                                class163 var130 = class103.field2161[var7];
                                if (var130 == null) {
                                    class139.field2869[var6++] = 0;
                                } else {
                                    class139.field2869[var6++] = var130.method1029(arg2 - 4079);
                                }
                                continue;
                            }
                            if (var316 == 4118) {
                                var6 -= 2;
                                int var131 = class139.field2869[var6];
                                var7--;
                                class163 var132 = class103.field2161[var7];
                                int var133 = class139.field2869[var6 + 1];
                                class103.field2161[var7++] = var132.method1036(var133, (byte) 105, var131);
                                continue;
                            }
                            if (var316 == 4119) {
                                var7--;
                                class163 var134 = class103.field2161[var7];
                                class163 var135 = class90.method625(-66, var134.method1029(arg2 ^ 0x1013));
                                boolean var136 = false;
                                for (int var137 = 0; var134.method1029(119) > var137; var137++) {
                                    int var138 = var134.method1032(var137, (byte) -54);
                                    if (var138 == 60) {
                                        var136 = true;
                                    } else if (var138 == 62) {
                                        var136 = false;
                                    } else if (!var136) {
                                        var135.method1022(var138, true);
                                    }
                                }
                                var135.method1026(true);
                                class103.field2161[var7++] = var135;
                                continue;
                            }
                            if (var316 == 4120) {
                                var7--;
                                class163 var139 = class103.field2161[var7];
                                var6 -= 2;
                                int var140 = class139.field2869[var6];
                                int var141 = class139.field2869[var6 + 1];
                                class139.field2869[var6++] = var139.method1057(class70.method502(arg2, -17290), var140, var141);
                                continue;
                            }
                            if (var316 == 4121) {
                                var7 -= 2;
                                class163 var142 = class103.field2161[var7];
                                var6--;
                                int var143 = class139.field2869[var6];
                                class163 var144 = class103.field2161[var7 + 1];
                                class139.field2869[var6++] = var142.method1033(1, var143, var144);
                                continue;
                            }
                        } else if (var316 < 4300) {
                            if (var316 == 4200) {
                                var6--;
                                int var145 = class139.field2869[var6];
                                class103.field2161[var7++] = class97.method669(-123, var145).field62;
                                continue;
                            }
                            if (var316 == 4201) {
                                var6 -= 2;
                                int var146 = class139.field2869[var6];
                                int var147 = class139.field2869[var6 + 1];
                                class4 var148 = class97.method669(-126, var146);
                                if (var147 >= 1 && var147 <= 5 && var148.field88[var147 - 1] != null) {
                                    class103.field2161[var7++] = var148.field88[var147 - 1];
                                    continue;
                                }
                                class103.field2161[var7++] = class20.field348;
                                continue;
                            }
                            if (var316 == 4202) {
                                var6 -= 2;
                                int var149 = class139.field2869[var6];
                                int var150 = class139.field2869[var6 + 1];
                                class4 var151 = class97.method669(-101, var149);
                                if (var150 >= 1 && var150 <= 5 && var151.field42[var150 - 1] != null) {
                                    class103.field2161[var7++] = var151.field42[var150 - 1];
                                    continue;
                                }
                                class103.field2161[var7++] = class20.field348;
                                continue;
                            }
                            if (var316 == 4203) {
                                var6--;
                                int var152 = class139.field2869[var6];
                                class139.field2869[var6++] = class97.method669(-115, var152).field95;
                                continue;
                            }
                            if (var316 == 4204) {
                                var6--;
                                int var153 = class139.field2869[var6];
                                class139.field2869[var6++] = class97.method669(class70.method502(arg2, -4107), var153).field87 == 1 ? 1 : 0;
                                continue;
                            }
                            if (var316 == 4205) {
                                var6--;
                                int var154 = class139.field2869[var6];
                                class4 var155 = class97.method669(arg2 ^ 0xFFFFEFCE, var154);
                                if (var155.field53 == -1 && var155.field54 >= 0) {
                                    class139.field2869[var6++] = var155.field54;
                                    continue;
                                }
                                class139.field2869[var6++] = var154;
                                continue;
                            }
                            if (var316 == 4206) {
                                var6--;
                                int var156 = class139.field2869[var6];
                                class4 var157 = class97.method669(-100, var156);
                                if (var157.field53 >= 0 && var157.field54 >= 0) {
                                    class139.field2869[var6++] = var157.field54;
                                    continue;
                                }
                                class139.field2869[var6++] = var156;
                                continue;
                            }
                            if (var316 == 4207) {
                                var6--;
                                int var158 = class139.field2869[var6];
                                class139.field2869[var6++] = class97.method669(-94, var158).field37 ? 1 : 0;
                                continue;
                            }
                            if (var316 == 4210) {
                                var7--;
                                class163 var159 = class103.field2161[var7];
                                var6--;
                                int var160 = class139.field2869[var6];
                                class10.method83(var160 == 1, var159, arg2 ^ 0x1068);
                                class139.field2869[var6++] = class79.field1603;
                                continue;
                            }
                            if (var316 == 4211) {
                                if (class112.field2365 != null && class79.field1603 > class8.field176) {
                                    class139.field2869[var6++] = class133.method887(65535, class112.field2365[class8.field176++]);
                                    continue;
                                }
                                class139.field2869[var6++] = -1;
                                continue;
                            }
                            if (var316 == 4212) {
                                class8.field176 = 0;
                                continue;
                            }
                        } else if (var316 < 5100) {
                            if (var316 == 5000) {
                                class139.field2869[var6++] = class57.field1140;
                                continue;
                            }
                            if (var316 == 5001) {
                                var6 -= 3;
                                class27.field502++;
                                class57.field1140 = class139.field2869[var6];
                                class118.field2503 = class139.field2869[var6 + 1];
                                class186.field3709 = class139.field2869[var6 + 2];
                                class141.field2896.method326(104, 107);
                                class141.field2896.method370(class57.field1140, (byte) 123);
                                class141.field2896.method370(class118.field2503, (byte) 123);
                                class141.field2896.method370(class186.field3709, (byte) 123);
                                continue;
                            }
                            if (var316 == 5002) {
                                var6 -= 2;
                                class128.field2632++;
                                var7--;
                                class163 var161 = class103.field2161[var7];
                                int var162 = class139.field2869[var6];
                                int var163 = class139.field2869[var6 + 1];
                                class141.field2896.method326(104, 51);
                                class141.field2896.method373((byte) -52, var161.method1058(arg2 ^ 0xFFFFEFE7));
                                class141.field2896.method370(var162 - 1, (byte) 123);
                                class141.field2896.method370(var163, (byte) 123);
                                continue;
                            }
                            if (var316 == 5003) {
                                var6--;
                                int var164 = class139.field2869[var6];
                                class163 var165 = null;
                                if (var164 < 100) {
                                    var165 = class191.field3786[var164];
                                }
                                if (var165 == null) {
                                    var165 = class20.field348;
                                }
                                class103.field2161[var7++] = var165;
                                continue;
                            }
                            if (var316 == 5004) {
                                var6--;
                                int var166 = class139.field2869[var6];
                                int var167 = -1;
                                if (var166 < 100 && class191.field3786[var166] != null) {
                                    var167 = class147.field3013[var166];
                                }
                                class139.field2869[var6++] = var167;
                                continue;
                            }
                            if (var316 == 5005) {
                                class139.field2869[var6++] = class118.field2503;
                                continue;
                            }
                            if (var316 == 5008) {
                                var7--;
                                class163 var168 = class103.field2161[var7];
                                if (var168.method1024(arg2 - 4079, class100.field2104)) {
                                    class9.method76(var168, (byte) -123);
                                } else {
                                    class163 var169 = var168.method1060(-18265);
                                    class107.field2225++;
                                    byte var170 = 0;
                                    if (var169.method1024(arg2 - 4086, class74.field1553)) {
                                        var168 = var168.method1039(class74.field1553.method1029(114), arg2 ^ 0x102A);
                                        var170 = 0;
                                    } else if (var169.method1024(arg2 - 4101, class88.field1920)) {
                                        var168 = var168.method1039(class88.field1920.method1029(123), 64);
                                        var170 = 1;
                                    } else if (var169.method1024(arg2 - 4074, class206.field4028)) {
                                        var168 = var168.method1039(class206.field4028.method1029(126), arg2 ^ 0x1010);
                                        var170 = 2;
                                    } else if (var169.method1024(104, class131.field2743)) {
                                        var170 = 3;
                                        var168 = var168.method1039(class131.field2743.method1029(121), arg2 - 4105);
                                    } else if (var169.method1024(arg2 - 4109, class48.field940)) {
                                        var170 = 4;
                                        var168 = var168.method1039(class48.field940.method1029(arg2 - 4073), 110);
                                    } else if (var169.method1024(120, class38.field757)) {
                                        var168 = var168.method1039(class38.field757.method1029(127), 80);
                                        var170 = 5;
                                    } else if (var169.method1024(104, class49.field957)) {
                                        var168 = var168.method1039(class49.field957.method1029(117), arg2 ^ 0xFFFFEFE6);
                                        var170 = 6;
                                    } else if (var169.method1024(108, class61.field1294)) {
                                        var170 = 7;
                                        var168 = var168.method1039(class61.field1294.method1029(120), -76);
                                    } else if (var169.method1024(112, class210.field4088)) {
                                        var168 = var168.method1039(class210.field4088.method1029(122), 113);
                                        var170 = 8;
                                    } else if (var169.method1024(118, class103.field2155)) {
                                        var170 = 9;
                                        var168 = var168.method1039(class103.field2155.method1029(122), 78);
                                    } else if (var169.method1024(arg2 - 4096, class131.field2720)) {
                                        var168 = var168.method1039(class131.field2720.method1029(115), arg2 - 4103);
                                        var170 = 10;
                                    } else if (var169.method1024(98, class136.field2801)) {
                                        var170 = 11;
                                        var168 = var168.method1039(class136.field2801.method1029(119), -65);
                                    } else if (class133.field2763 != 0) {
                                        if (var169.method1024(arg2 ^ 0x1007, class74.field1552)) {
                                            var170 = 0;
                                            var168 = var168.method1039(class74.field1552.method1029(124), 67);
                                        } else if (var169.method1024(94, class88.field1918)) {
                                            var170 = 1;
                                            var168 = var168.method1039(class88.field1918.method1029(124), 103);
                                        } else if (var169.method1024(114, class206.field4030)) {
                                            var170 = 2;
                                            var168 = var168.method1039(class206.field4030.method1029(126), -48);
                                        } else if (var169.method1024(117, class131.field2744)) {
                                            var170 = 3;
                                            var168 = var168.method1039(class131.field2744.method1029(124), arg2 - 4075);
                                        } else if (var169.method1024(96, class48.field943)) {
                                            var168 = var168.method1039(class48.field943.method1029(116), 66);
                                            var170 = 4;
                                        } else if (var169.method1024(116, class38.field756)) {
                                            var170 = 5;
                                            var168 = var168.method1039(class38.field756.method1029(112), arg2 - 4121);
                                        } else if (var169.method1024(113, class49.field951)) {
                                            var168 = var168.method1039(class49.field951.method1029(arg2 - 4085), 82);
                                            var170 = 6;
                                        } else if (var169.method1024(97, class61.field1268)) {
                                            var168 = var168.method1039(class61.field1268.method1029(arg2 - 4077), arg2 ^ 0xFFFFEFBC);
                                            var170 = 7;
                                        } else if (var169.method1024(112, class210.field4086)) {
                                            var168 = var168.method1039(class210.field4086.method1029(arg2 ^ 0x101E), -96);
                                            var170 = 8;
                                        } else if (var169.method1024(111, class103.field2167)) {
                                            var168 = var168.method1039(class103.field2167.method1029(127), arg2 ^ 0xFFFFEFE0);
                                            var170 = 9;
                                        } else if (var169.method1024(120, class131.field2741)) {
                                            var170 = 10;
                                            var168 = var168.method1039(class131.field2741.method1029(126), arg2 ^ 0xFFFFEFD1);
                                        } else if (var169.method1024(97, class136.field2816)) {
                                            var168 = var168.method1039(class136.field2816.method1029(arg2 ^ 0x1013), -56);
                                            var170 = 11;
                                        }
                                    }
                                    class163 var171 = var168.method1060(-18265);
                                    byte var172 = 0;
                                    if (var171.method1024(103, class129.field2688)) {
                                        var172 = 1;
                                        var168 = var168.method1039(class129.field2688.method1029(127), 72);
                                    } else if (var171.method1024(92, class90.field1947)) {
                                        var168 = var168.method1039(class90.field1947.method1029(112), -94);
                                        var172 = 2;
                                    } else if (var171.method1024(125, class73.field1543)) {
                                        var172 = 3;
                                        var168 = var168.method1039(class73.field1543.method1029(117), arg2 - 4128);
                                    } else if (var171.method1024(117, class52.field1079)) {
                                        var172 = 4;
                                        var168 = var168.method1039(class52.field1079.method1029(arg2 - 4088), 67);
                                    } else if (var171.method1024(104, class152.field3125)) {
                                        var168 = var168.method1039(class152.field3125.method1029(123), -46);
                                        var172 = 5;
                                    } else if (class133.field2763 != 0) {
                                        if (var171.method1024(123, class129.field2689)) {
                                            var172 = 1;
                                            var168 = var168.method1039(class129.field2689.method1029(arg2 ^ 0x101E), -107);
                                        } else if (var171.method1024(112, class90.field1956)) {
                                            var168 = var168.method1039(class90.field1956.method1029(122), 72);
                                            var172 = 2;
                                        } else if (var171.method1024(arg2 - 4085, class73.field1531)) {
                                            var168 = var168.method1039(class73.field1531.method1029(125), arg2 - 4106);
                                            var172 = 3;
                                        } else if (var171.method1024(102, class52.field1081)) {
                                            var172 = 4;
                                            var168 = var168.method1039(class52.field1081.method1029(115), -44);
                                        } else if (var171.method1024(96, class152.field3119)) {
                                            var168 = var168.method1039(class152.field3119.method1029(arg2 ^ 0x1019), arg2 ^ 0x1032);
                                            var172 = 5;
                                        }
                                    }
                                    class141.field2896.method326(104, 188);
                                    class141.field2896.method370(0, (byte) 123);
                                    int var173 = class141.field2896.field1033;
                                    class141.field2896.method370(var170, (byte) 123);
                                    class141.field2896.method370(var172, (byte) 123);
                                    class108.method728(var168, -61, class141.field2896);
                                    class141.field2896.method359(class141.field2896.field1033 - var173, arg2 ^ 0xEF68);
                                }
                                continue;
                            }
                            if (var316 == 5009) {
                                var7 -= 2;
                                class81.field1643++;
                                class163 var174 = class103.field2161[var7 + 1];
                                class163 var175 = class103.field2161[var7];
                                class141.field2896.method326(104, 195);
                                class141.field2896.method370(0, (byte) 123);
                                int var176 = class141.field2896.field1033;
                                class141.field2896.method373((byte) -52, var175.method1058(arg2 ^ 0xFFFFEFE6));
                                class108.method728(var174, -114, class141.field2896);
                                class141.field2896.method359(class141.field2896.field1033 - var176, arg2 ^ 0xEF68);
                                continue;
                            }
                            if (var316 == 5010) {
                                var6--;
                                int var177 = class139.field2869[var6];
                                class163 var178 = null;
                                if (var177 < 100) {
                                    var178 = class19.field317[var177];
                                }
                                if (var178 == null) {
                                    var178 = class20.field348;
                                }
                                class103.field2161[var7++] = var178;
                                continue;
                            }
                            if (var316 == 5011) {
                                var6--;
                                int var179 = class139.field2869[var6];
                                class163 var180 = null;
                                if (var179 < 100) {
                                    var180 = class109.field2297[var179];
                                }
                                if (var180 == null) {
                                    var180 = class20.field348;
                                }
                                class103.field2161[var7++] = var180;
                                continue;
                            }
                            if (var316 == 5015) {
                                class163 var181;
                                if (class56.field1136 == null || class56.field1136.field758 == null) {
                                    var181 = class202.field3989;
                                } else {
                                    var181 = class56.field1136.field758;
                                }
                                class103.field2161[var7++] = var181;
                                continue;
                            }
                            if (var316 == 5016) {
                                class139.field2869[var6++] = class186.field3709;
                                continue;
                            }
                            if (var316 == 5017) {
                                class139.field2869[var6++] = class137.field2817;
                                continue;
                            }
                        }
                    }
                    throw new IllegalStateException();
                }
            }
        } catch (Exception var315) {
            if (var5.field3065 == null) {
                if (class36.field700 != 0) {
                    class43.method267((byte) -127, class22.field383, class20.field348, 0);
                }
                class152.method980(var315, "CS2 - scr:" + var5.field1950 + " op:" + var11, true);
            } else {
                class163 var312 = class90.method625(-66, 30);
                var312.method1034(class114.field2426, arg2 - 4162).method1034(var5.field3065, -117);
                for (int var313 = class187.field3730 - 1; var313 >= 0; var313--) {
                    var312.method1034(class154.field3185, arg2 ^ 0x1015).method1034(class96.field2049[var313].field3738.field3065, -99);
                }
                if (var11 == 40) {
                    int var314 = var10[var8];
                    var312.method1034(class26.field475, -90).method1034(class34.method217(var314, arg2 - 4313), -53);
                }
                if (class36.field700 != 0) {
                    class43.method267((byte) -85, class180.method1216(new class163[] { class73.field1527, var5.field3065 }, false), class20.field348, 0);
                }
                class152.method980(var315, "CS2 - scr:" + var5.field1950 + " op:" + var11 + new String(var312.method1059(arg2 - 4078)), true);
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(II)V")
    public class185(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class10.method78(arg0, (byte) 91, arg1);
            int var4 = arg0 / var3;
            int var5 = arg1 / var3;
            this.field3694 = var5;
            this.field3697 = new int[var4][14];
            this.field3693 = var4;
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field3697[var6];
                double var8 = (double) var6 / (double) var4 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                double var12 = (double) var5 / (double) var4;
                while (var11 > var10) {
                    double var14 = var12;
                    double var16 = ((double) var10 - var8) * 3.141592653589793D;
                    if (var16 < -1.0E-4D || var16 > 1.0E-4D) {
                        var14 = var12 * (Math.sin(var16) / var16);
                    }
                    double var18 = var14 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }
}
