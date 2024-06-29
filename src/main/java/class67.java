import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class67 {

    @OriginalMember(owner = "client!la", name = "g", descriptor = "La;")
    public static class1 field1664 = class113.method934(-11538, "*6n");

    @OriginalMember(owner = "client!la", name = "y", descriptor = "I")
    public static int field1682 = 0;

    @OriginalMember(owner = "client!la", name = "t", descriptor = "La;")
    private static class1 field1677 = class113.method934(-11538, "Trade)4compete");

    @OriginalMember(owner = "client!la", name = "v", descriptor = "La;")
    public static class1 field1679 = field1677;

    @OriginalMember(owner = "client!la", name = "E", descriptor = "La;")
    private static class1 field1688 = class113.method934(-11538, "Off");

    @OriginalMember(owner = "client!la", name = "D", descriptor = "I")
    public static int field1687 = 50;

    @OriginalMember(owner = "client!la", name = "G", descriptor = "[I")
    public static int[] field1690 = new int[field1687];

    @OriginalMember(owner = "client!la", name = "e", descriptor = "[I")
    public static int[] field1662 = new int[field1687];

    @OriginalMember(owner = "client!la", name = "a", descriptor = "[I")
    public static int[] field1658 = new int[field1687];

    @OriginalMember(owner = "client!la", name = "J", descriptor = "[I")
    public static int[] field1693 = new int[field1687];

    @OriginalMember(owner = "client!la", name = "c", descriptor = "La;")
    public static class1 field1660 = field1688;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "[I")
    public static int[] field1666 = new int[field1687];

    @OriginalMember(owner = "client!la", name = "s", descriptor = "La;")
    public static class1 field1676 = class113.method934(-11538, "(U(Y");

    @OriginalMember(owner = "client!la", name = "p", descriptor = "[I")
    public static int[] field1673 = new int[field1687];

    @OriginalMember(owner = "client!la", name = "C", descriptor = "I")
    public static int field1686 = -1;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "[I")
    public static int[] field1663 = new int[field1687];

    @OriginalMember(owner = "client!la", name = "r", descriptor = "[La;")
    public static class1[] field1675 = new class1[field1687];

    @OriginalMember(owner = "client!la", name = "K", descriptor = "La;")
    public static class1 field1694 = class113.method934(-11538, "scape main");

    @OriginalMember(owner = "client!la", name = "b", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "I")
    public static int field1667;

    @OriginalMember(owner = "client!la", name = "k", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!la", name = "l", descriptor = "I")
    public static int field1669;

    @OriginalMember(owner = "client!la", name = "o", descriptor = "I")
    public static int field1672;

    @OriginalMember(owner = "client!la", name = "q", descriptor = "I")
    private int field1674;

    @OriginalMember(owner = "client!la", name = "u", descriptor = "I")
    public static int field1678;

    @OriginalMember(owner = "client!la", name = "w", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!la", name = "x", descriptor = "I")
    public static int field1681;

    @OriginalMember(owner = "client!la", name = "z", descriptor = "I")
    public static int field1683;

    @OriginalMember(owner = "client!la", name = "A", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!la", name = "B", descriptor = "I")
    public static int field1685;

    @OriginalMember(owner = "client!la", name = "F", descriptor = "I")
    public static int field1689;

    @OriginalMember(owner = "client!la", name = "M", descriptor = "J")
    private long field1696;

    @OriginalMember(owner = "client!la", name = "N", descriptor = "J")
    private long field1697;

    @OriginalMember(owner = "client!la", name = "L", descriptor = "Lvc;")
    public static class129 field1695;

    @OriginalMember(owner = "client!la", name = "n", descriptor = "Lwb;")
    public static class133 field1671;

    @OriginalMember(owner = "client!la", name = "I", descriptor = "Lwc;")
    public static class134 field1692;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "Z")
    public boolean field1661;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "Z")
    public static boolean field1665;

    @OriginalMember(owner = "client!la", name = "m", descriptor = "[I")
    private int[] field1670;

    @OriginalMember(owner = "client!la", name = "H", descriptor = "[I")
    private int[] field1691;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)I", line = 4)
    public final int method637(int arg0) {
        field1680++;
        if (arg0 == -20874) {
            return this.field1674 == -1 ? (this.field1691[4] << 20) + ((this.field1691[0] << 25) + (this.field1670[0] << 15)) + (this.field1670[8] << 10) + (this.field1670[11] << 5) + this.field1670[1] : class102.method867((byte) -105, this.field1674).field1138 + 305419896;
        } else {
            return 109;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILba;)V", line = 22)
    public final void method638(int arg0, class8 arg1) {
        arg1.method142(this.field1661 ? 1 : 0, (byte) -128);
        field1684++;
        for (int var3 = arg0; var3 < 7; var3++) {
            int var5 = this.field1670[class114.field2811[var3]];
            if (var5 == 0) {
                arg1.method142(-1, (byte) -128);
            } else {
                arg1.method142(var5 - 256, (byte) -128);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg1.method142(this.field1691[var4], (byte) -128);
        }
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(I)V", line = 52)
    public static void method639(int arg0) {
        field1690 = null;
        field1666 = null;
        field1695 = null;
        if (arg0 != 13429) {
            method644(-90, null);
        }
        field1673 = null;
        field1663 = null;
        field1693 = null;
        field1664 = null;
        field1688 = null;
        field1675 = null;
        field1671 = null;
        field1677 = null;
        field1662 = null;
        field1658 = null;
        field1692 = null;
        field1679 = null;
        field1660 = null;
        field1676 = null;
        field1694 = null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lhe;Lhe;IIB)Lpa;", line = 80)
    public final class91 method640(class47 arg0, class47 arg1, int arg2, int arg3, byte arg4) {
        field1672++;
        if (this.field1674 != -1) {
            return class102.method867((byte) -101, this.field1674).method449((byte) -50, arg0, arg1, arg2, arg3);
        }
        long var6 = this.field1696;
        int[] var8 = this.field1670;
        if (arg0 != null && (arg0.field1236 >= 0 || arg0.field1248 >= 0)) {
            var8 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var8[var9] = this.field1670[var9];
            }
            if (arg0.field1236 >= 0) {
                var6 += arg0.field1236 - this.field1670[5] << 8;
                var8[5] = arg0.field1236;
            }
            if (arg0.field1248 >= 0) {
                var6 += arg0.field1248 - this.field1670[3] << 16;
                var8[3] = arg0.field1248;
            }
        }
        if (arg4 >= -84) {
            return null;
        }
        class91 var10 = (class91) class11.field380.method264(var6, (byte) 66);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var20 = var8[var12];
                if (var20 >= 256 && var20 < 512 && !class8.method178((byte) -94, var20 - 256).method824(true)) {
                    var11 = true;
                }
                if (var20 >= 512 && !class89.method763(var20 - 512, 10).method943(this.field1661, (byte) 127)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field1697 != -1L) {
                    var10 = (class91) class11.field380.method264(this.field1697, (byte) 123);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                class91[] var13 = new class91[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var17 = var8[var15];
                    if (var17 >= 256 && var17 < 512) {
                        class91 var18 = class8.method178((byte) -94, var17 - 256).method831(false);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                    if (var17 >= 512) {
                        class91 var19 = class89.method763(var17 - 512, 10).method944(this.field1661, -32);
                        if (var19 != null) {
                            var13[var14++] = var19;
                        }
                    }
                }
                var10 = new class91(var13, var14);
                for (int var16 = 0; var16 < 5; var16++) {
                    if (this.field1691[var16] != 0) {
                        var10.method774(class116.field2897[var16][0], class116.field2897[var16][this.field1691[var16]]);
                        if (var16 == 1) {
                            var10.method774(class75.field1868[0], class75.field1868[this.field1691[var16]]);
                        }
                    }
                }
                var10.method781();
                var10.method773(64, 850, -30, -50, -30, true);
                class11.field380.method263(-7208, var6, var10);
                this.field1697 = var6;
            }
        }
        if (arg0 == null && arg1 == null) {
            return var10;
        }
        class91 var21;
        if (arg0 != null && arg1 != null) {
            var21 = arg0.method487(var10, arg1, arg3, arg2, (byte) 63);
        } else if (arg0 == null) {
            var21 = arg1.method496(arg2, var10, false);
        } else {
            var21 = arg0.method496(arg3, var10, false);
        }
        return var21;
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "(I)V", line = 246)
    private final void method641(int arg0) {
        field1668++;
        int var2 = this.field1670[9];
        int var3 = this.field1670[5];
        long var4 = this.field1696;
        this.field1670[5] = var2;
        this.field1670[9] = var3;
        this.field1696 = 0L;
        for (int var6 = 0; var6 < 12; var6++) {
            this.field1696 <<= 0x4;
            if (this.field1670[var6] >= 256) {
                this.field1696 += this.field1670[var6] - 256;
            }
        }
        if (this.field1670[0] >= 256) {
            this.field1696 += this.field1670[0] - 256 >> 4;
        }
        if (this.field1670[1] >= 256) {
            this.field1696 += this.field1670[1] - 256 >> 8;
        }
        for (int var7 = 0; var7 < 5; var7++) {
            this.field1696 <<= 0x3;
            this.field1696 += this.field1691[var7];
        }
        if (arg0 <= 94) {
            this.method638(70, null);
        }
        this.field1696 <<= 0x1;
        this.field1696 += this.field1661 ? 1 : 0;
        this.field1670[5] = var3;
        this.field1670[9] = var2;
        if (var4 != 0L && this.field1696 != var4) {
            class11.field380.method265(var4, 108);
        }
    }

    @OriginalMember(owner = "client!la", name = "d", descriptor = "(I)Lpa;", line = 304)
    public final class91 method642(int arg0) {
        field1667++;
        if (this.field1674 != -1) {
            return class102.method867((byte) -117, this.field1674).method456((byte) 111);
        }
        boolean var2 = false;
        for (int var3 = 0; var3 < 12; var3++) {
            int var12 = this.field1670[var3];
            if (var12 >= 256 && var12 < 512 && !class8.method178((byte) -94, var12 - 256).method825(false)) {
                var2 = true;
            }
            if (var12 >= 512 && !class89.method763(var12 - 512, 10).method942((byte) 44, this.field1661)) {
                var2 = true;
            }
        }
        if (arg0 <= 20) {
            field1659 = 106;
        }
        if (var2) {
            return null;
        }
        class91[] var4 = new class91[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var9 = this.field1670[var6];
            if (var9 >= 256 && var9 < 512) {
                class91 var10 = class8.method178((byte) -94, var9 - 256).method830((byte) -100);
                if (var10 != null) {
                    var4[var5++] = var10;
                }
            }
            if (var9 >= 512) {
                class91 var11 = class89.method763(var9 - 512, 10).method951(this.field1661, (byte) 25);
                if (var11 != null) {
                    var4[var5++] = var11;
                }
            }
        }
        class91 var7 = new class91(var4, var5);
        for (int var8 = 0; var8 < 5; var8++) {
            if (this.field1691[var8] != 0) {
                var7.method774(class116.field2897[var8][0], class116.field2897[var8][this.field1691[var8]]);
                if (var8 == 1) {
                    var7.method774(class75.field1868[0], class75.field1868[this.field1691[var8]]);
                }
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "([IZI[II)V", line = 405)
    public final void method643(int[] arg0, boolean arg1, int arg2, int[] arg3, int arg4) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class36.field975; var7++) {
                    class95 var8 = class8.method178((byte) -94, var7);
                    if (var8 != null && !var8.field2376 && var6 + (arg1 ? 7 : 0) == var8.field2369) {
                        arg0[class114.field2811[var6]] = var7 + 256;
                        break;
                    }
                }
            }
        }
        this.field1674 = arg4;
        this.field1661 = arg1;
        this.field1670 = arg0;
        this.field1691 = arg3;
        field1669++;
        if (arg2 == 7) {
            this.method641(97);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILnb;)V", line = 450)
    public static final void method644(int arg0, class80 arg1) {
        if (arg0 != 22378) {
            method639(90);
        }
        if (class82.field2066 == arg1.field1984 || arg1.field2018 == -1 || arg1.field1999 != 0 || arg1.field1992 + 1 > class4.method104(arg1.field2018, 2).field1225[arg1.field1981]) {
            int var2 = arg1.field1984 - arg1.field1989;
            int var3 = class82.field2066 - arg1.field1989;
            int var4 = arg1.field2002 * 128 + arg1.field1973 * 64;
            int var5 = arg1.field1973 * 64 + arg1.field1958 * 128;
            int var6 = arg1.field1976 * 128 + arg1.field1973 * 64;
            int var7 = arg1.field2004 * 128 + arg1.field1973 * 64;
            arg1.field1975 = ((var2 - var3) * var4 + var3 * var6) / var2;
            arg1.field1966 = ((var2 - var3) * var5 + var3 * var7) / var2;
        }
        if (arg1.field1950 == 0) {
            arg1.field1957 = 1024;
        }
        field1678++;
        arg1.field1951 = 0;
        if (arg1.field1950 == 1) {
            arg1.field1957 = 1536;
        }
        if (arg1.field1950 == 2) {
            arg1.field1957 = 0;
        }
        if (arg1.field1950 == 3) {
            arg1.field1957 = 512;
        }
        arg1.field1995 = arg1.field1957;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IZI)V", line = 503)
    public final void method645(int arg0, boolean arg1, int arg2) {
        field1689++;
        if (arg0 == 1 && this.field1661) {
            return;
        }
        int var4 = this.field1670[class114.field2811[arg0]];
        if (var4 == 0) {
            return;
        }
        var4 -= 256;
        if (arg2 <= 3) {
            return;
        }
        class95 var5;
        do {
            if (arg1) {
                var4++;
                if (class36.field975 <= var4) {
                    var4 = 0;
                }
            } else {
                var4--;
                if (var4 < 0) {
                    var4 = class36.field975 - 1;
                }
            }
            var5 = class8.method178((byte) -94, var4);
        } while (var5 == null || var5.field2376 || var5.field2369 != arg0 + (this.field1661 ? 7 : 0));
        this.field1670[class114.field2811[arg0]] = var4 + 256;
        this.method641(117);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ZB)V", line = 556)
    public final void method646(boolean arg0, byte arg1) {
        field1683++;
        if (this.field1661 != arg0) {
            if (arg1 != -110) {
                this.method645(57, false, 67);
            }
            this.method643(null, arg0, 7, this.field1691, -1);
        }
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(IZI)V", line = 604)
    public final void method647(int arg0, boolean arg1, int arg2) {
        int var4 = -67 % ((-arg0 - 30) / 56);
        field1681++;
        int var5 = this.field1691[arg2];
        if (arg1) {
            var5++;
            if (var5 >= class116.field2897[arg2].length) {
                var5 = 0;
            }
        } else {
            var5--;
            if (var5 < 0) {
                var5 = class116.field2897[arg2].length - 1;
            }
        }
        this.field1691[arg2] = var5;
        this.method641(119);
    }
}
