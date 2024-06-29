import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class70 {

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "Ljava/lang/Object;")
    public static Object field1686 = new Object();

    @OriginalMember(owner = "client!ld", name = "x", descriptor = "Lpd;")
    private static class94 field1702 = class28.method249(50, "Existing user");

    @OriginalMember(owner = "client!ld", name = "v", descriptor = "Lpd;")
    private static class94 field1700 = class28.method249(-50, "Examine");

    @OriginalMember(owner = "client!ld", name = "w", descriptor = "Lpd;")
    public static class94 field1701 = field1700;

    @OriginalMember(owner = "client!ld", name = "s", descriptor = "Lpd;")
    private static class94 field1697 = class28.method249(97, "Off");

    @OriginalMember(owner = "client!ld", name = "u", descriptor = "Lpd;")
    public static class94 field1699 = class28.method249(-56, "backvmid3");

    @OriginalMember(owner = "client!ld", name = "z", descriptor = "I")
    public static int field1704 = 0;

    @OriginalMember(owner = "client!ld", name = "E", descriptor = "Lpd;")
    public static class94 field1709 = field1697;

    @OriginalMember(owner = "client!ld", name = "D", descriptor = "Lpd;")
    public static class94 field1708 = field1702;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
    public static int field1679;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    public static int field1682;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
    public static int field1685;

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "I")
    public static int field1688;

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "I")
    public static int field1689;

    @OriginalMember(owner = "client!ld", name = "l", descriptor = "I")
    public static int field1690;

    @OriginalMember(owner = "client!ld", name = "m", descriptor = "I")
    public static int field1691;

    @OriginalMember(owner = "client!ld", name = "n", descriptor = "I")
    private int field1692;

    @OriginalMember(owner = "client!ld", name = "p", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!ld", name = "q", descriptor = "I")
    public static int field1695;

    @OriginalMember(owner = "client!ld", name = "r", descriptor = "I")
    public static int field1696;

    @OriginalMember(owner = "client!ld", name = "t", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!ld", name = "y", descriptor = "I")
    public static int field1703;

    @OriginalMember(owner = "client!ld", name = "A", descriptor = "I")
    public static int field1705;

    @OriginalMember(owner = "client!ld", name = "C", descriptor = "I")
    public static int field1707;

    @OriginalMember(owner = "client!ld", name = "F", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "J")
    private long field1683;

    @OriginalMember(owner = "client!ld", name = "o", descriptor = "J")
    private long field1693;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "Z")
    public boolean field1681;

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "[I")
    private int[] field1687;

    @OriginalMember(owner = "client!ld", name = "B", descriptor = "[I")
    private int[] field1706;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "([Lpd;I)[Lpd;", line = 3)
    public static final class94[] method511(class94[] arg0, int arg1) {
        field1680++;
        class94[] var2 = new class94[arg1];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = class4.method20(new class94[] { class51.method403(var3, true), class77.field1929 }, true);
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = class4.method20(new class94[] { var2[var3], arg0[var3] }, true);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILuc;)V", line = 27)
    public final void method512(int arg0, class122 arg1) {
        arg1.method916(-2, this.field1681 ? 1 : 0);
        for (int var3 = 0; var3 < 7; var3++) {
            int var5 = this.field1687[class108.field2675[var3]];
            if (var5 == 0) {
                arg1.method916(-2, -1);
            } else {
                arg1.method916(-2, var5 - 256);
            }
        }
        int var4 = 0;
        if (arg0 >= -120) {
            field1700 = null;
        }
        while (var4 < 5) {
            arg1.method916(-2, this.field1706[var4]);
            var4++;
        }
        field1694++;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZILs;Ls;)V", line = 61)
    public static final void method513(boolean arg0, int arg1, class111 arg2, class111 arg3) {
        if (arg1 != 6174) {
            method515(-43, -39);
        }
        class76.field1853 = arg3;
        class112.field2829 = arg0;
        class115.field2902 = arg2;
        field1703++;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)Lia;", line = 76)
    public final class48 method514(int arg0) {
        field1689++;
        if (this.field1692 != -1) {
            return class40.method301(this.field1692, (byte) 16).method844((byte) -83);
        }
        boolean var2 = false;
        for (int var3 = 0; var3 < 12; var3++) {
            int var12 = this.field1687[var3];
            if (var12 >= 256 && var12 < 512 && !class72.method539(var12 - 256, false).method337((byte) 80)) {
                var2 = true;
            }
            if (var12 >= 512 && !class39.method295(var12 - 512, 1).method792(this.field1681, (byte) 86)) {
                var2 = true;
            }
        }
        if (var2) {
            return null;
        }
        class48[] var4 = new class48[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var9 = this.field1687[var6];
            if (var9 >= 256 && var9 < 512) {
                class48 var10 = class72.method539(var9 - 256, false).method338(9571);
                if (var10 != null) {
                    var4[var5++] = var10;
                }
            }
            if (var9 >= 512) {
                class48 var11 = class39.method295(var9 - 512, 1).method794(this.field1681, (byte) 121);
                if (var11 != null) {
                    var4[var5++] = var11;
                }
            }
        }
        if (arg0 != -31437) {
            return null;
        }
        class48 var7 = new class48(var4, var5);
        for (int var8 = 0; var8 < 5; var8++) {
            if (this.field1706[var8] != 0) {
                var7.method363(class4.field79[var8][0], class4.field79[var8][this.field1706[var8]]);
                if (var8 == 1) {
                    var7.method363(class1.field41[0], class1.field41[this.field1706[var8]]);
                }
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)V", line = 179)
    public static final void method515(int arg0, int arg1) {
        if (arg0 != 46) {
            field1700 = null;
        }
        field1698++;
        if (!class120.method904(true)) {
            return;
        }
        if (class103.field2597) {
            class120.field2989 = arg1;
        } else {
            class28.method250(arg1, true);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILj;Lj;II)Lia;", line = 200)
    public final class48 method516(int arg0, class57 arg1, class57 arg2, int arg3, int arg4) {
        field1684++;
        if (this.field1692 != -1) {
            return class40.method301(this.field1692, (byte) 16).method845((byte) -7, arg0, arg1, arg2, arg3);
        }
        long var6 = this.field1683;
        int[] var8 = this.field1687;
        if (arg2 != null && (arg2.field1451 >= 0 || arg2.field1427 >= 0)) {
            var8 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var8[var9] = this.field1687[var9];
            }
            if (arg2.field1451 >= 0) {
                var6 += arg2.field1451 - this.field1687[5] << 8;
                var8[5] = arg2.field1451;
            }
            if (arg2.field1427 >= 0) {
                var6 += arg2.field1427 - this.field1687[3] << 16;
                var8[3] = arg2.field1427;
            }
        }
        if (arg4 != 256) {
            return null;
        }
        class48 var10 = (class48) class50.field1261.method1007(var6, (byte) -90);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var20 = var8[var12];
                if (var20 >= 256 && var20 < 512 && !class72.method539(var20 - 256, false).method339((byte) 23)) {
                    var11 = true;
                }
                if (var20 >= 512 && !class39.method295(var20 - 512, arg4 + -255).method802(this.field1681, true)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field1693 != -1L) {
                    var10 = (class48) class50.field1261.method1007(this.field1693, (byte) -104);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                class48[] var13 = new class48[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var17 = var8[var15];
                    if (var17 >= 256 && var17 < 512) {
                        class48 var18 = class72.method539(var17 - 256, false).method336(arg4 - 253);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                    if (var17 >= 512) {
                        class48 var19 = class39.method295(var17 - 512, arg4 + -255).method796(this.field1681, 44);
                        if (var19 != null) {
                            var13[var14++] = var19;
                        }
                    }
                }
                var10 = new class48(var13, var14);
                for (int var16 = 0; var16 < 5; var16++) {
                    if (this.field1706[var16] != 0) {
                        var10.method363(class4.field79[var16][0], class4.field79[var16][this.field1706[var16]]);
                        if (var16 == 1) {
                            var10.method363(class1.field41[0], class1.field41[this.field1706[var16]]);
                        }
                    }
                }
                var10.method358();
                var10.method365(64, 850, -30, -50, -30, true);
                class50.field1261.method1012(50, var10, var6);
                this.field1693 = var6;
            }
        }
        if (arg2 == null && arg1 == null) {
            return var10;
        }
        class48 var21;
        if (arg2 != null && arg1 != null) {
            var21 = arg2.method450(var10, arg3, 1833408208, arg1, arg0);
        } else if (arg2 == null) {
            var21 = arg1.method452(arg0, 0, var10);
        } else {
            var21 = arg2.method452(arg3, 0, var10);
        }
        return var21;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V", line = 367)
    private final void method517(byte arg0) {
        field1688++;
        long var2 = this.field1683;
        int var4 = this.field1687[5];
        int var5 = this.field1687[9];
        this.field1687[5] = var5;
        this.field1687[9] = var4;
        this.field1683 = 0L;
        if (arg0 != -80) {
            this.method514(118);
        }
        for (int var6 = 0; var6 < 12; var6++) {
            this.field1683 <<= 0x4;
            if (this.field1687[var6] >= 256) {
                this.field1683 += this.field1687[var6] - 256;
            }
        }
        if (this.field1687[0] >= 256) {
            this.field1683 += this.field1687[0] - 256 >> 4;
        }
        if (this.field1687[1] >= 256) {
            this.field1683 += this.field1687[1] - 256 >> 8;
        }
        for (int var7 = 0; var7 < 5; var7++) {
            this.field1683 <<= 0x3;
            this.field1683 += this.field1706[var7];
        }
        this.field1683 <<= 0x1;
        this.field1683 += this.field1681 ? 1 : 0;
        this.field1687[5] = var4;
        this.field1687[9] = var5;
        if (var2 != 0L && this.field1683 != var2) {
            class50.field1261.method1011(-15205, var2);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I[IIZ[I)V", line = 426)
    public final void method518(int arg0, int[] arg1, int arg2, boolean arg3, int[] arg4) {
        if (arg1 == null) {
            arg1 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class136.field3344; var7++) {
                    class45 var8 = class72.method539(var7, false);
                    if (var8 != null && !var8.field1106 && (arg3 ? 7 : 0) + var6 == var8.field1121) {
                        arg1[class108.field2675[var6]] = var7 + 256;
                        break;
                    }
                }
            }
        }
        this.field1687 = arg1;
        this.field1692 = arg0;
        this.field1681 = arg3;
        field1707++;
        this.field1706 = arg4;
        if (arg2 != -19872) {
            method520(6);
        }
        this.method517((byte) -80);
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(II)Lj;", line = 473)
    public static final class57 method519(int arg0, int arg1) {
        if (arg0 != 5) {
            field1704 = 88;
        }
        field1710++;
        class57 var2 = (class57) class115.field2898.method1007((long) arg1, (byte) -44);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class76.field1845.method808((byte) 66, 12, arg1);
        class57 var4 = new class57();
        if (var3 != null) {
            var4.method449(false, new class122(var3));
        }
        var4.method448(127);
        class115.field2898.method1012(50, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)V", line = 499)
    public static final void method520(int arg0) {
        if (class9.field249) {
            class9.field249 = false;
            class46.method342((byte) -49);
            class73.field1781 = true;
            class135.field3323 = true;
            class2.field54 = true;
            class121.field3033 = true;
        }
        class17.method126(57);
        if (class62.field1516 && class40.field1035 == 1) {
            class135.field3323 = true;
        }
        if (class45.field1108 != -1) {
            boolean var1 = class128.method1010(class45.field1108, 104);
            if (var1) {
                class135.field3323 = true;
            }
        }
        if (class134.field3297 == 2) {
            class135.field3323 = true;
        }
        field1679++;
        if (class100.field2535 == 2) {
            class135.field3323 = true;
        }
        if (class135.field3323) {
            class135.field3323 = false;
            class46.method346(-22711);
        }
        if (class115.field2925 == -1) {
            class87.field2205.field1915 = class46.field1138 - class92.field2362 - 77;
            if (class94.field2411 > 448 && class94.field2411 < 560 && class84.field2121 > 332) {
                class128.method1008(class94.field2411 - 17, -1, class46.field1138, 77, class87.field2205, 104, 0, class84.field2121 - 357, 463);
            }
            int var2 = class46.field1138 - class87.field2205.field1915 - 77;
            if (var2 < 0) {
                var2 = 0;
            }
            if (var2 > class46.field1138 - 77) {
                var2 = class46.field1138 - 77;
            }
            if (class92.field2362 != var2) {
                class92.field2362 = var2;
                class73.field1781 = true;
            }
        }
        if (class115.field2925 == -1 && class110.field2741 == 3) {
            int var3 = class126.field3162 * 14 + 7;
            class87.field2205.field1915 = client.field502;
            if (class94.field2411 > 448 && class94.field2411 < 560 && class84.field2121 > 332) {
                class128.method1008(class94.field2411 - 17, -1, var3, 77, class87.field2205, arg0 + 4429, 0, class84.field2121 - 357, 463);
            }
            int var4 = class87.field2205.field1915;
            if (var4 < 0) {
                var4 = 0;
            }
            if (var3 - 77 < var4) {
                var4 = var3 - 77;
            }
            if (client.field502 != var4) {
                class73.field1781 = true;
                client.field502 = var4;
            }
        }
        if (class115.field2925 != -1) {
            boolean var5 = class128.method1010(class115.field2925, arg0 + 4362);
            if (var5) {
                class73.field1781 = true;
            }
        }
        if (class134.field3297 == 3) {
            class73.field1781 = true;
        }
        if (class100.field2535 == 3) {
            class73.field1781 = true;
        }
        if (class76.field1855 != null) {
            class73.field1781 = true;
        }
        if (class62.field1516 && class40.field1035 == 2) {
            class73.field1781 = true;
        }
        if (class73.field1781) {
            class73.field1781 = false;
            class37.method287(false);
        }
        class45.method340((byte) 92);
        if (class66.field1629 != -1) {
            class121.field3033 = true;
        }
        if (class121.field3033) {
            if (class66.field1629 != -1 && class92.field2361 == class66.field1629) {
                class33.field913++;
                class66.field1629 = -1;
                class107.field2670.method326(46, -116);
                class107.field2670.method916(-2, class92.field2361);
            }
            class37.field955 = true;
            class121.field3033 = false;
            class17.method128(class45.field1108 == -1, class42.field1065, class26.field699 % 20 >= 10 ? class66.field1629 : -1, class92.field2361, (byte) 35);
        }
        if (class2.field54) {
            class37.field955 = true;
            class2.field54 = false;
            class66.method494(class102.field2569, class2.field58, class112.field2835, -1, class97.field2473);
        }
        class17.method124(class64.field1589, class66.field1620, (byte) -128, class80.field2044.field177, class80.field2044.field222);
        if (arg0 == -4307) {
            class66.field1620 = 0;
        }
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(B)V", line = 660)
    public static final void method521(byte arg0) {
        class37 var1 = (class37) class39.field1007.method895(-14156);
        field1696++;
        int var2 = -75 / ((arg0 + 50) / 49);
        while (var1 != null) {
            if (var1.field963 > 0) {
                var1.field963--;
            }
            if (var1.field963 != 0) {
                if (var1.field951 > 0) {
                    var1.field951--;
                }
                if (var1.field951 == 0 && var1.field967 >= 1 && var1.field962 >= 1 && var1.field967 <= 102 && var1.field962 <= 102 && (var1.field979 < 0 || class86.method633(4, var1.field979, var1.field959))) {
                    class113.method846(var1.field967, var1.field962, -64, var1.field964, var1.field956, var1.field979, var1.field959, var1.field952);
                    var1.field951 = -1;
                    if (var1.field979 == var1.field961 && var1.field961 == -1) {
                        var1.method1074((byte) -28);
                    } else if (var1.field979 == var1.field961 && var1.field976 == var1.field956 && var1.field974 == var1.field959) {
                        var1.method1074((byte) -28);
                    }
                }
            } else if (var1.field961 < 0 || class86.method633(4, var1.field961, var1.field974)) {
                class113.method846(var1.field967, var1.field962, -109, var1.field964, var1.field976, var1.field961, var1.field974, var1.field952);
                var1.method1074((byte) -28);
            }
            var1 = (class37) class39.field1007.method893(true);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIZ)V", line = 722)
    public final void method522(int arg0, int arg1, boolean arg2) {
        field1682++;
        if (arg1 == 1 && this.field1681) {
            return;
        }
        int var4 = this.field1687[class108.field2675[arg1]];
        if (var4 == 0) {
            return;
        }
        var4 -= 256;
        class45 var5;
        do {
            if (arg2) {
                var4++;
                if (var4 >= class136.field3344) {
                    var4 = 0;
                }
            } else {
                var4--;
                if (var4 < 0) {
                    var4 = class136.field3344 - 1;
                }
            }
            var5 = class72.method539(var4, false);
        } while (var5 == null || var5.field1106 || arg1 + (this.field1681 ? 7 : 0) != var5.field1121);
        this.field1687[class108.field2675[arg1]] = var4 + 256;
        if (arg0 != -3053) {
            this.field1706 = null;
        }
        this.method517((byte) -80);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(BZ)V", line = 769)
    public final void method523(byte arg0, boolean arg1) {
        if (arg0 == -11) {
            field1691++;
            if (arg1 != this.field1681) {
                this.method518(-1, null, arg0 - 19861, arg1, this.field1706);
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZII)V", line = 784)
    public final void method524(boolean arg0, int arg1, int arg2) {
        field1690++;
        int var4 = this.field1706[arg1];
        if (arg2 != -1) {
            method511(null, -22);
        }
        if (arg0) {
            var4++;
            if (var4 >= class4.field79[arg1].length) {
                var4 = 0;
            }
        } else {
            var4--;
            if (var4 < 0) {
                var4 = class4.field79[arg1].length - 1;
            }
        }
        this.field1706[arg1] = var4;
        this.method517((byte) -80);
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(B)V", line = 821)
    public static void method525(byte arg0) {
        field1700 = null;
        field1709 = null;
        field1702 = null;
        if (arg0 < 58) {
            field1697 = null;
        }
        field1699 = null;
        field1686 = null;
        field1697 = null;
        field1701 = null;
        field1708 = null;
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(I)I", line = 845)
    public final int method526(int arg0) {
        if (arg0 == 27721) {
            field1685++;
            return this.field1692 == -1 ? (this.field1687[8] << 10) + (this.field1687[11] << 5) + (this.field1706[0] << 25) + (this.field1706[4] << 20) + (this.field1687[0] << 15) + this.field1687[1] : class40.method301(this.field1692, (byte) 16).field2840 + 305419896;
        } else {
            return 83;
        }
    }

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "(B)V", line = 871)
    public static final void method527(byte arg0) {
        field1705++;
        int var1 = 8 % ((arg0 + 46) / 54);
        for (class29 var2 = (class29) class21.field573.method895(-14156); var2 != null; var2 = (class29) class21.field573.method893(true)) {
            if (var2.field822 != null) {
                var2.method255(true);
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lme;B)V", line = 902)
    public static final void method528(class77 arg0, byte arg1) {
        field1695++;
        int var2 = arg0.field1896;
        int var3 = 126 % ((-arg1 - 77) / 36);
        if (var2 >= 1 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
            if (var2 == 1 && class52.field1303 == 0) {
                arg0.field1894 = 0;
                arg0.field1905 = class54.field1328;
            } else if (var2 == 1 && class52.field1303 == 1) {
                arg0.field1905 = class54.field1363;
                arg0.field1894 = 0;
            } else if (var2 == 2 && class52.field1303 != 2) {
                arg0.field1905 = class20.field550;
                arg0.field1894 = 0;
            } else {
                if (var2 <= 700) {
                    var2--;
                } else {
                    var2 -= 601;
                }
                int var4 = class77.field1963;
                if (class52.field1303 != 2) {
                    var4 = 0;
                }
                if (var4 <= var2) {
                    arg0.field1905 = class8.field230;
                    arg0.field1894 = 0;
                } else {
                    arg0.field1905 = class120.field3008[var2];
                    arg0.field1894 = 1;
                }
            }
        } else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
            if (var2 <= 800) {
                var2 -= 101;
            } else {
                var2 -= 701;
            }
            int var5 = class77.field1963;
            if (class52.field1303 != 2) {
                var5 = 0;
            }
            if (var5 <= var2) {
                arg0.field1905 = class8.field230;
                arg0.field1894 = 0;
            } else {
                if (class72.field1723[var2] == 0) {
                    arg0.field1905 = class4.method20(new class94[] { class105.field2630, class2.field69 }, true);
                } else if (class72.field1723[var2] < 5000) {
                    if (class72.field1723[var2] == class1.field36) {
                        arg0.field1905 = class4.method20(new class94[] { class7.field133, class43.field1091, class51.method403(class72.field1723[var2], true) }, true);
                    } else {
                        arg0.field1905 = class4.method20(new class94[] { class111.field2805, class43.field1091, class51.method403(class72.field1723[var2], true) }, true);
                    }
                } else if (class72.field1723[var2] == class1.field36) {
                    arg0.field1905 = class4.method20(new class94[] { class7.field133, class57.field1448, class51.method403(class72.field1723[var2] - 5000, true) }, true);
                } else {
                    arg0.field1905 = class4.method20(new class94[] { class111.field2805, class57.field1448, class51.method403(class72.field1723[var2] - 5000, true) }, true);
                }
                arg0.field1894 = 1;
            }
        } else if (var2 == 203) {
            int var6 = class77.field1963;
            if (class52.field1303 != 2) {
                var6 = 0;
            }
            arg0.field1866 = var6 * 15 + 20;
            if (arg0.field1866 <= arg0.field1967) {
                arg0.field1866 = arg0.field1967 + 1;
            }
        } else if (var2 >= 401 && var2 <= 500) {
            var2 -= 401;
            if (var2 == 0 && class52.field1303 == 0) {
                arg0.field1894 = 0;
                arg0.field1905 = class63.field1560;
            } else if (var2 == 1 && class52.field1303 == 0) {
                arg0.field1905 = class20.field550;
                arg0.field1894 = 0;
            } else {
                int var7 = class89.field2322;
                if (class52.field1303 == 0) {
                    var7 = 0;
                }
                if (var2 >= var7) {
                    arg0.field1905 = class8.field230;
                    arg0.field1894 = 0;
                } else {
                    arg0.field1905 = class120.method900(class79.field2009[var2], 0).method707(-14211);
                    arg0.field1894 = 1;
                }
            }
        } else if (var2 == 503) {
            arg0.field1866 = class89.field2322 * 15 + 20;
            if (arg0.field1866 <= arg0.field1967) {
                arg0.field1866 = arg0.field1967 + 1;
            }
        } else if (var2 == 324) {
            if (class105.field2613 == -1) {
                class47.field1148 = arg0.field1959;
                class105.field2613 = arg0.field1976;
            }
            if (class52.field1304.field1681) {
                arg0.field1976 = class105.field2613;
            } else {
                arg0.field1976 = class47.field1148;
            }
        } else if (var2 == 325) {
            if (class105.field2613 == -1) {
                class105.field2613 = arg0.field1976;
                class47.field1148 = arg0.field1959;
            }
            if (class52.field1304.field1681) {
                arg0.field1976 = class47.field1148;
            } else {
                arg0.field1976 = class105.field2613;
            }
        } else if (var2 == 327) {
            arg0.field1892 = 150;
            arg0.field1875 = (int) (Math.sin((double) class26.field699 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field1893 = 0;
            arg0.field1969 = 5;
        } else if (var2 == 328) {
            arg0.field1892 = 150;
            arg0.field1875 = (int) (Math.sin((double) class26.field699 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field1969 = 5;
            arg0.field1893 = 1;
        } else if (var2 == 600) {
            arg0.field1905 = class4.method20(new class94[] { class8.field236, class85.field2153 }, true);
        } else if (var2 == 620) {
            if (class73.field1784 < 1) {
                arg0.field1905 = class8.field230;
            } else if (class122.field3100) {
                arg0.field1905 = class117.field2942;
                arg0.field1876 = 16711680;
            } else {
                arg0.field1876 = 16777215;
                arg0.field1905 = class54.field1372;
            }
        }
    }
}
