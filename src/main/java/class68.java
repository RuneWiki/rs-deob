import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class68 {

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "Lhe;")
    public static class54 field1695 = class6.method58("null", false);

    @OriginalMember(owner = "client!jf", name = "s", descriptor = "Lhe;")
    public static class54 field1701 = class6.method58("Zu viele Anmelde)2Versuche von Ihrer Adresse", false);

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "Lhe;")
    private static class54 field1693 = class6.method58("Sorry invited players only)3", false);

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "Lhe;")
    private static class54 field1684 = class6.method58("You are standing in a members)2only area)3", false);

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "Lhe;")
    public static class54 field1688 = field1684;

    @OriginalMember(owner = "client!jf", name = "F", descriptor = "Lhe;")
    public static class54 field1713 = field1693;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
    public static int field1683;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
    public static int field1687;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
    public static int field1689;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "I")
    public static int field1690;

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "I")
    public static int field1691;

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!jf", name = "n", descriptor = "I")
    public static int field1696;

    @OriginalMember(owner = "client!jf", name = "o", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!jf", name = "p", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!jf", name = "q", descriptor = "I")
    private int field1699;

    @OriginalMember(owner = "client!jf", name = "r", descriptor = "I")
    public static int field1700;

    @OriginalMember(owner = "client!jf", name = "t", descriptor = "I")
    public static int field1702;

    @OriginalMember(owner = "client!jf", name = "u", descriptor = "I")
    public static int field1703;

    @OriginalMember(owner = "client!jf", name = "w", descriptor = "I")
    public static int field1705;

    @OriginalMember(owner = "client!jf", name = "x", descriptor = "I")
    public static int field1706;

    @OriginalMember(owner = "client!jf", name = "y", descriptor = "I")
    public static int field1707;

    @OriginalMember(owner = "client!jf", name = "E", descriptor = "I")
    public static int field1712;

    @OriginalMember(owner = "client!jf", name = "G", descriptor = "I")
    public static int field1714;

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "J")
    private long field1692;

    @OriginalMember(owner = "client!jf", name = "z", descriptor = "J")
    private long field1708;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "Z")
    public boolean field1685;

    @OriginalMember(owner = "client!jf", name = "v", descriptor = "Z")
    public static boolean field1704;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "[I")
    public static int[] field1686;

    @OriginalMember(owner = "client!jf", name = "C", descriptor = "[I")
    private int[] field1710;

    @OriginalMember(owner = "client!jf", name = "D", descriptor = "[I")
    private int[] field1711;

    @OriginalMember(owner = "client!jf", name = "B", descriptor = "[Lqb;")
    public static class113[] field1709;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)I")
    public final int method533(int arg0) {
        field1697++;
        if (arg0 != -256) {
            field1695 = null;
        }
        return this.field1699 == -1 ? (this.field1711[0] << 15) + ((this.field1710[4] << 20) + ((this.field1710[0] << 25) + (this.field1711[8] << 10)) + (this.field1711[11] << 5)) + this.field1711[1] : class139.method1078(-68, this.field1699).field281 + 305419896;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZII)V")
    public final void method534(boolean arg0, int arg1, int arg2) {
        field1703++;
        if (arg2 == 1 && this.field1685) {
            return;
        }
        int var4 = this.field1711[class134.field3023[arg2]];
        if (var4 == 0) {
            return;
        }
        var4 -= 256;
        class95 var5;
        do {
            if (arg0) {
                var4++;
                if (var4 >= class131.field2954) {
                    var4 = 0;
                }
            } else {
                var4--;
                if (var4 < 0) {
                    var4 = class131.field2954 - 1;
                }
            }
            var5 = class65.method508((byte) 121, var4);
        } while (var5 == null || var5.field2404 || (this.field1685 ? 7 : 0) + arg2 != var5.field2412);
        this.field1711[class134.field3023[arg2]] = var4 + 256;
        this.method545((byte) 11);
        if (arg1 != 7872) {
            this.method545((byte) -1);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIII)V")
    public static final void method535(int arg0, int arg1, int arg2, int arg3) {
        field1698++;
        if (arg3 != 12644) {
            field1695 = null;
        }
        if (class34.field856 == 0 || arg2 == 0 || class8.field227 >= 50) {
            return;
        }
        class39.field999[class8.field227] = arg1;
        class19.field544[class8.field227] = arg2;
        class50.field1217[class8.field227] = arg0;
        class89.field2188[class8.field227] = null;
        class1.field19[class8.field227] = 0;
        class8.field227++;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "([I[IIBZ)V")
    public final void method536(int[] arg0, int[] arg1, int arg2, byte arg3, boolean arg4) {
        field1694++;
        if (arg1 == null) {
            arg1 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class131.field2954; var7++) {
                    class95 var8 = class65.method508((byte) -85, var7);
                    if (var8 != null && !var8.field2404 && var8.field2412 == var6 + (arg4 ? 7 : 0)) {
                        arg1[class134.field3023[var6]] = var7 + 256;
                        break;
                    }
                }
            }
        }
        this.field1699 = arg2;
        this.field1710 = arg0;
        this.field1685 = arg4;
        if (arg3 != -79) {
            field1684 = null;
        }
        this.field1711 = arg1;
        this.method545((byte) 11);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lnc;I)Z")
    public static final boolean method537(class93 arg0, int arg1) {
        field1696++;
        if (arg1 != 2) {
            method544(125);
        }
        if (arg0.field2245 == null) {
            return false;
        }
        for (int var2 = 0; var2 < arg0.field2245.length; var2++) {
            int var3 = class95.method761((byte) 81, var2, arg0);
            int var4 = arg0.field2267[var2];
            if (arg0.field2245[var2] == 2) {
                if (var3 >= var4) {
                    return false;
                }
            } else if (arg0.field2245[var2] == 3) {
                if (var3 <= var4) {
                    return false;
                }
            } else if (arg0.field2245[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)Lfe;")
    public final class41 method538(int arg0) {
        field1706++;
        if (~this.field1699 != arg0) {
            return class139.method1078(-59, this.field1699).method77(0);
        }
        boolean var2 = false;
        for (int var3 = 0; var3 < 12; var3++) {
            int var12 = this.field1711[var3];
            if (var12 >= 256 && var12 < 512 && !class65.method508((byte) 89, var12 - 256).method756(127)) {
                var2 = true;
            }
            if (var12 >= 512 && !class141.method1088(var12 - 512, (byte) -122).method517((byte) -73, this.field1685)) {
                var2 = true;
            }
        }
        if (var2) {
            return null;
        }
        class41[] var4 = new class41[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var9 = this.field1711[var6];
            if (var9 >= 256 && var9 < 512) {
                class41 var10 = class65.method508((byte) -117, var9 - 256).method763(-1);
                if (var10 != null) {
                    var4[var5++] = var10;
                }
            }
            if (var9 >= 512) {
                class41 var11 = class141.method1088(var9 - 512, (byte) -126).method526(this.field1685, arg0);
                if (var11 != null) {
                    var4[var5++] = var11;
                }
            }
        }
        class41 var7 = new class41(var4, var5);
        for (int var8 = 0; var8 < 5; var8++) {
            if (this.field1710[var8] < class56.field1408[var8].length) {
                var7.method322(class32.field828[var8], class56.field1408[var8][this.field1710[var8]]);
            }
            if (class100.field2539[var8].length > this.field1710[var8]) {
                var7.method322(class8.field229[var8], class100.field2539[var8][this.field1710[var8]]);
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILuc;IILuc;)Loa;")
    public final class98 method539(int arg0, class142 arg1, int arg2, int arg3, class142 arg4) {
        field1689++;
        if (this.field1699 != -1) {
            return class139.method1078(-69, this.field1699).method71(arg3 ^ 0x352, arg1, arg4, arg0, arg2);
        }
        int[] var6 = this.field1711;
        long var7 = this.field1708;
        if (arg3 != 850) {
            this.field1710 = null;
        }
        if (arg1 != null && (arg1.field3243 >= 0 || arg1.field3248 >= 0)) {
            var6 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var6[var9] = this.field1711[var9];
            }
            if (arg1.field3243 >= 0) {
                var7 += arg1.field3243 - this.field1711[5] << 8;
                var6[5] = arg1.field3243;
            }
            if (arg1.field3248 >= 0) {
                var7 += arg1.field3248 - this.field1711[3] << 16;
                var6[3] = arg1.field3248;
            }
        }
        class98 var10 = (class98) class24.field678.method991(var7, true);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var21 = var6[var12];
                if (var21 >= 256 && var21 < 512 && !class65.method508((byte) -125, var21 - 256).method760(23232)) {
                    var11 = true;
                }
                if (var21 >= 512 && !class141.method1088(var21 - 512, (byte) -110).method518(-1, this.field1685)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field1692 != -1L) {
                    var10 = (class98) class24.field678.method991(this.field1692, true);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                class41[] var13 = new class41[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var18 = var6[var15];
                    if (var18 >= 256 && var18 < 512) {
                        class41 var19 = class65.method508((byte) -61, var18 - 256).method755((byte) 104);
                        if (var19 != null) {
                            var13[var14++] = var19;
                        }
                    }
                    if (var18 >= 512) {
                        class41 var20 = class141.method1088(var18 - 512, (byte) -107).method531(this.field1685, -25);
                        if (var20 != null) {
                            var13[var14++] = var20;
                        }
                    }
                }
                class41 var16 = new class41(var13, var14);
                for (int var17 = 0; var17 < 5; var17++) {
                    if (this.field1710[var17] < class56.field1408[var17].length) {
                        var16.method322(class32.field828[var17], class56.field1408[var17][this.field1710[var17]]);
                    }
                    if (this.field1710[var17] < class100.field2539[var17].length) {
                        var16.method322(class8.field229[var17], class100.field2539[var17][this.field1710[var17]]);
                    }
                }
                var10 = var16.method317(64, 850, -30, -50, -30);
                class24.field678.method990(true, var7, var10);
                this.field1692 = var7;
            }
        }
        if (arg1 == null && arg4 == null) {
            return var10;
        }
        class98 var22;
        if (arg1 != null && arg4 != null) {
            var22 = arg1.method1094(var10, arg0, arg4, arg2, arg3 ^ 0x5D5B);
        } else if (arg1 == null) {
            var22 = arg4.method1092((byte) -102, arg0, var10);
        } else {
            var22 = arg1.method1092((byte) 58, arg2, var10);
        }
        return var22;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZB)V")
    public final void method540(boolean arg0, byte arg1) {
        if (arg1 >= 61) {
            field1712++;
            if (this.field1685 != arg0) {
                this.method536(this.field1710, null, -1, (byte) -79, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(ZII)V")
    public final void method541(boolean arg0, int arg1, int arg2) {
        field1683++;
        int var4 = this.field1710[arg1];
        if (arg0) {
            var4++;
            if (var4 >= class56.field1408[arg1].length) {
                var4 = 0;
            }
        } else {
            var4--;
            if (var4 < 0) {
                var4 = class56.field1408[arg1].length - 1;
            }
        }
        if (arg2 <= 55) {
            field1690 = 37;
        }
        this.field1710[arg1] = var4;
        this.method545((byte) 11);
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(I)V")
    public static void method542(int arg0) {
        field1701 = null;
        field1693 = null;
        field1684 = null;
        field1686 = null;
        if (arg0 != -3) {
            field1686 = null;
        }
        field1709 = null;
        field1713 = null;
        field1695 = null;
        field1688 = null;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lm;I)V")
    public final void method543(class83 arg0, int arg1) {
        arg0.method649((byte) -27, this.field1685 ? 1 : 0);
        field1691++;
        for (int var3 = 0; var3 < 7; var3++) {
            int var5 = this.field1711[class134.field3023[var3]];
            if (var5 == 0) {
                arg0.method649((byte) -27, -1);
            } else {
                arg0.method649((byte) -27, var5 - 256);
            }
        }
        if (arg1 > -45) {
            method547((byte) 99, -75);
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method649((byte) -27, this.field1710[var4]);
        }
    }

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "(I)[Lqb;")
    public static final class113[] method544(int arg0) {
        class113[] var1 = new class113[class91.field2212];
        field1714++;
        for (int var2 = 0; var2 < class91.field2212; var2++) {
            class113 var3 = var1[var2] = new class113();
            var3.field2703 = class103.field2574;
            var3.field2701 = class64.field1549;
            var3.field2702 = field1686[var2];
            var3.field2705 = class70.field1732[var2];
            var3.field2704 = class62.field1503[var2];
            var3.field2700 = class56.field1412[var2];
            int var4 = var3.field2704 * var3.field2700;
            byte[] var5 = class141.field3221[var2];
            var3.field2699 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                var3.field2699[var6] = class134.field3050[class118.method887(255, var5[var6])];
            }
        }
        class80.method610(true);
        if (arg0 == 255) {
            return var1;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V")
    private final void method545(byte arg0) {
        field1707++;
        long var2 = this.field1708;
        if (arg0 != 11) {
            return;
        }
        int var4 = this.field1711[5];
        this.field1708 = 0L;
        int var5 = this.field1711[9];
        this.field1711[9] = var4;
        this.field1711[5] = var5;
        for (int var6 = 0; var6 < 12; var6++) {
            this.field1708 <<= 0x4;
            if (this.field1711[var6] >= 256) {
                this.field1708 += this.field1711[var6] - 256;
            }
        }
        if (this.field1711[0] >= 256) {
            this.field1708 += this.field1711[0] - 256 >> 4;
        }
        if (this.field1711[1] >= 256) {
            this.field1708 += this.field1711[1] - 256 >> 8;
        }
        for (int var7 = 0; var7 < 5; var7++) {
            this.field1708 <<= 0x3;
            this.field1708 += this.field1710[var7];
        }
        this.field1711[9] = var5;
        this.field1711[5] = var4;
        this.field1708 <<= 0x1;
        this.field1708 += this.field1685 ? 1 : 0;
        if (var2 != 0L && this.field1708 != var2) {
            class24.field678.method989(-68, var2);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)V")
    public static final void method546(int arg0, int arg1) {
        if (arg0 != 23245) {
            field1684 = null;
        }
        if (class83.field2051 == 0) {
            class1.field5.method128(arg1, 98);
        } else {
            class75.field1865 = arg1;
        }
        field1702++;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(BI)Lhe;")
    public static final class54 method547(byte arg0, int arg1) {
        field1705++;
        if (arg0 < 55) {
            return null;
        }
        class54 var2 = class147.method1117(-52, arg1);
        for (int var3 = var2.method404(-105) - 3; var3 > 0; var3 -= 3) {
            var2 = class143.method1105(new class54[] { var2.method408((byte) 121, 0, var3), class70.field1741, var2.method384(var3, -123) }, -842);
        }
        if (var2.method404(-114) > 9) {
            return class143.method1105(new class54[] { class58.field1478, var2.method408((byte) 6, 0, var2.method404(-111) - 8), class63.field1532, class43.field1106, var2, class12.field338 }, -842);
        } else if (var2.method404(-126) > 6) {
            return class143.method1105(new class54[] { class78.field1929, var2.method408((byte) 17, 0, var2.method404(-110) - 4), class146.field3312, class43.field1106, var2, class12.field338 }, -842);
        } else {
            return class143.method1105(new class54[] { class82.field2013, var2, class13.field346 }, -842);
        }
    }
}
