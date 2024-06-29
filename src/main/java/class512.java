import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class512 extends class389 {

    @OriginalMember(owner = "client!qj", name = "m", descriptor = "I")
    private int field6695 = 0;

    @OriginalMember(owner = "client!qj", name = "s", descriptor = "Z")
    public boolean field6701 = false;

    @OriginalMember(owner = "client!qj", name = "l", descriptor = "Lhs;")
    public class125 field6694 = new class125();

    @OriginalMember(owner = "client!qj", name = "A", descriptor = "Lhs;")
    private class125 field6709 = new class125();

    @OriginalMember(owner = "client!qj", name = "B", descriptor = "Z")
    private boolean field6710 = false;

    @OriginalMember(owner = "client!qj", name = "w", descriptor = "Lru;")
    public class231 field6705;

    @OriginalMember(owner = "client!qj", name = "x", descriptor = "J")
    private long field6706;

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "Lgi;")
    public class574 field6691;

    @OriginalMember(owner = "client!qj", name = "j", descriptor = "Lhm;")
    public class216 field6692;

    @OriginalMember(owner = "client!qj", name = "y", descriptor = "Lhca;")
    public class365 field6707;

    @OriginalMember(owner = "client!qj", name = "z", descriptor = "F")
    public static float field6708;

    @OriginalMember(owner = "client!qj", name = "k", descriptor = "I")
    public static int field6693;

    @OriginalMember(owner = "client!qj", name = "o", descriptor = "I")
    public static int field6697;

    @OriginalMember(owner = "client!qj", name = "p", descriptor = "I")
    public static int field6698;

    @OriginalMember(owner = "client!qj", name = "q", descriptor = "I")
    public int field6699;

    @OriginalMember(owner = "client!qj", name = "r", descriptor = "I")
    public static int field6700;

    @OriginalMember(owner = "client!qj", name = "t", descriptor = "I")
    public static int field6702;

    @OriginalMember(owner = "client!qj", name = "u", descriptor = "I")
    public static int field6703;

    @OriginalMember(owner = "client!qj", name = "v", descriptor = "I")
    public static int field6704;

    @OriginalMember(owner = "client!qj", name = "C", descriptor = "I")
    private int field6711;

    @OriginalMember(owner = "client!qj", name = "D", descriptor = "I")
    private int field6712;

    @OriginalMember(owner = "client!qj", name = "E", descriptor = "I")
    private int field6713;

    @OriginalMember(owner = "client!qj", name = "F", descriptor = "I")
    private int field6714;

    @OriginalMember(owner = "client!qj", name = "G", descriptor = "I")
    private int field6715;

    @OriginalMember(owner = "client!qj", name = "H", descriptor = "I")
    private int field6716;

    @OriginalMember(owner = "client!qj", name = "I", descriptor = "I")
    private int field6717;

    @OriginalMember(owner = "client!qj", name = "n", descriptor = "Lpe;")
    public static class615 field6696;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lcp;IIIII)V", line = 7)
    public static final void method2758(class242 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field3251 = 0;
        for (int var6 = 0; var6 < 4; var6++) {
            if (arg0.field3254[var6] != null) {
                arg0.field3251++;
            }
        }
        label50: for (int var7 = 0; var7 < arg0.field3251; var7++) {
            long var8 = class283.field3689[arg1][arg2][arg3];
            while (var8 != 0L) {
                class357 var14 = class421.field5440[(int) ((var8 & 0xFFFFL) - 1L)];
                var8 >>>= 0x10;
                if (arg0.field3254[var7] == var14.field4631) {
                    continue label50;
                }
            }
            long var10 = class283.field3689[arg1][arg4][arg5];
            while (var10 != 0L) {
                class357 var13 = class421.field5440[(int) ((var10 & 0xFFFFL) - 1L)];
                var10 >>>= 0x10;
                if (arg0.field3254[var7] == var13.field4631) {
                    continue label50;
                }
            }
            for (int var12 = var7; var12 < arg0.field3251 - 1; var12++) {
                arg0.field3254[var12] = arg0.field3254[var12 + 1];
            }
            arg0.field3251--;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIBZ)V", line = 61)
    public static final void method2759(int arg0, int arg1, int arg2, byte arg3, boolean arg4) {
        field6702++;
        if (!arg4 && class677.field9340 == arg1 && class649.field9048 == arg2 && class517.field6768 == class390.field4991 || class260.field3509.method1571(class364.field4697, -23572)) {
            return;
        }
        class649.field9048 = arg2;
        class677.field9340 = arg1;
        class517.field6768 = class390.field4991;
        if (class260.field3509.method1571(class364.field4697, -23572)) {
            class517.field6768 = 0;
        }
        class442.method2508(arg0, 1);
        class542.method2877(true, class604.field8136.method3280((byte) -127, class144.field1890), class520.field6799, class562.field7337, class401.field5111, true);
        if (arg3 <= 89) {
            field6696 = null;
        }
        int var5 = class100.field1326;
        int var6 = class186.field2376;
        class100.field1326 = (class677.field9340 - (class611.field8258 >> 4)) * 8;
        class186.field2376 = (class649.field9048 - (class656.field9155 >> 4)) * 8;
        class80.field1104 = class706.method3873(class677.field9340 * 8, class649.field9048 * 8);
        class155.field1966 = null;
        int var7 = class100.field1326 - var5;
        int var8 = class186.field2376 - var6;
        if (arg0 == 11) {
            for (int var9 = 0; var9 < class480.field6406; var9++) {
                class234 var10 = class93.field1230[var9];
                if (var10 != null) {
                    class532 var11 = var10.field3131;
                    for (int var12 = 0; var12 < 10; var12++) {
                        var11.field3030[var12] -= var7;
                        var11.field3039[var12] -= var8;
                    }
                    var11.field506 -= var7 * 512;
                    var11.field503 -= var8 * 512;
                }
            }
        } else {
            class248.field3351 = 0;
            boolean var13 = false;
            int var14 = (class611.field8258 - 1) * 512;
            int var15 = (class656.field9155 - 1) * 512;
            for (int var16 = 0; var16 < class480.field6406; var16++) {
                class234 var29 = class93.field1230[var16];
                if (var29 != null) {
                    class532 var30 = var29.field3131;
                    var30.field506 -= var7 * 512;
                    var30.field503 -= var8 * 512;
                    if (var30.field506 >= 0 && var30.field506 <= var14 && var30.field503 >= 0 && var30.field503 <= var15) {
                        boolean var31 = true;
                        for (int var32 = 0; var32 < 10; var32++) {
                            var30.field3030[var32] -= var7;
                            var30.field3039[var32] -= var8;
                            if (var30.field3030[var32] < 0 || var30.field3030[var32] >= class611.field8258 || var30.field3039[var32] < 0 || var30.field3039[var32] >= class656.field9155) {
                                var31 = false;
                            }
                        }
                        if (var31) {
                            class40.field558[class248.field3351++] = var30.field2960;
                        } else {
                            var30.method2830((byte) -75, null);
                            var29.method2438((byte) -118);
                            var13 = true;
                        }
                    } else {
                        var30.method2830((byte) -75, null);
                        var29.method2438((byte) 110);
                        var13 = true;
                    }
                }
            }
            if (var13) {
                class480.field6406 = class505.field6640.method43((byte) -125);
                class505.field6640.method48(27731, class93.field1230);
            }
        }
        for (int var17 = 0; var17 < 2048; var17++) {
            class193 var27 = class592.field8019[var17];
            if (var27 != null) {
                for (int var28 = 0; var28 < 10; var28++) {
                    var27.field3030[var28] -= var7;
                    var27.field3039[var28] -= var8;
                }
                var27.field503 -= var8 * 512;
                var27.field506 -= var7 * 512;
            }
        }
        class514[] var18 = class434.field5591;
        for (int var19 = 0; var19 < var18.length; var19++) {
            class514 var26 = var18[var19];
            if (var26 != null) {
                var26.field6727 -= var7 * 512;
                var26.field6731 -= var8 * 512;
            }
        }
        for (class549 var20 = (class549) class354.field4574.method2090(true); var20 != null; var20 = (class549) class354.field4574.method2088(-152)) {
            var20.field7125 -= var8;
            var20.field7116 -= var7;
            if (class105.field1383 != 4 && (var20.field7116 < 0 || var20.field7125 < 0 || var20.field7116 >= class611.field8258 || class656.field9155 <= var20.field7125)) {
                var20.method2438((byte) 113);
            }
        }
        if (class105.field1383 != 4) {
            for (class37 var21 = (class37) class197.field2589.method42((byte) 42); var21 != null; var21 = (class37) class197.field2589.method40(false)) {
                int var22 = (int) (var21.field5499 & 0x3FFFL);
                int var23 = var22 - class100.field1326;
                int var24 = (int) (var21.field5499 >> 14 & 0x3FFFL);
                int var25 = var24 - class186.field2376;
                if (var23 < 0 || var25 < 0 || class611.field8258 <= var23 || class656.field9155 <= var25) {
                    var21.method2438((byte) -49);
                }
            }
        }
        if (class199.field2598 != 0) {
            class247.field3310 -= var8;
            class199.field2598 -= var7;
        }
        class544.method2888(0);
        if (arg0 != 11) {
            class67.field909 -= var8;
            class435.field5643 -= var7;
            class688.field9415 -= var8;
            class549.field7132 -= var8 * 512;
            class499.field6555 -= var7 * 512;
            class421.field5441 -= var7;
            if (Math.abs(var7) > class611.field8258 || Math.abs(var8) > class656.field9155) {
                class693.method3772((byte) 47);
            }
        } else if (class704.field9810 == 4) {
            class473.field6168 -= var7 * 512;
            class425.field5518 -= var7 * 512;
            class509.field6669 -= var8 * 512;
            class219.field2880 -= var8 * 512;
        } else {
            class704.field9810 = 1;
        }
        class40.method315(-115);
        class107.method830(125);
        class21.field231.method2085((byte) 9);
        class407.field5178.method2085((byte) 9);
        class686.field9407.method2100((byte) -57);
        class658.method3616(106);
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(Loa;Lgi;Lru;J)V", line = 1270)
    public class512(class43 arg0, class574 arg1, class231 arg2, long arg3) {
        this.field6705 = arg2;
        this.field6706 = arg3;
        this.field6691 = arg1;
        this.field6692 = this.field6691.method3061(-20239);
        if (!arg0.method329() && this.field6692.field2843 != -1) {
            this.field6692 = class314.method1831(this.field6692.field2843, (byte) -96);
        }
        this.field6707 = new class365();
        this.field6695 = (int) ((double) this.field6695 + Math.random() * 64.0D);
        this.method2766(28);
        this.field6709.field1621 = this.field6694.field1621;
        this.field6709.field1622 = this.field6694.field1622;
        this.field6709.field1615 = this.field6694.field1615;
        this.field6709.field1616 = this.field6694.field1616;
        this.field6709.field1610 = this.field6694.field1610;
        this.field6709.field1626 = this.field6694.field1626;
        this.field6709.field1624 = this.field6694.field1624;
        this.field6709.field1612 = this.field6694.field1612;
        this.field6709.field1625 = this.field6694.field1625;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(CZ)C", line = 329)
    public static final char method2760(char arg0, boolean arg1) {
        field6697++;
        if (arg1) {
            method2760((char) 65425, true);
        }
        if (arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-') {
            return '_';
        } else if (arg0 == '[' || arg0 == ']' || arg0 == '#') {
            return arg0;
        } else if (arg0 == 'à' || arg0 == 'á' || arg0 == 'â' || arg0 == 'ä' || arg0 == 'ã' || arg0 == 'À' || arg0 == 'Á' || arg0 == 'Â' || arg0 == 'Ä' || arg0 == 'Ã') {
            return 'a';
        } else if (arg0 == 'è' || arg0 == 'é' || arg0 == 'ê' || arg0 == 'ë' || arg0 == 'È' || arg0 == 'É' || arg0 == 'Ê' || arg0 == 'Ë') {
            return 'e';
        } else if (arg0 == 'í' || arg0 == 'î' || arg0 == 'ï' || arg0 == 'Í' || arg0 == 'Î' || arg0 == 'Ï') {
            return 'i';
        } else if (arg0 == 'ò' || arg0 == 'ó' || arg0 == 'ô' || arg0 == 'ö' || arg0 == 'õ' || arg0 == 'Ò' || arg0 == 'Ó' || arg0 == 'Ô' || arg0 == 'Ö' || arg0 == 'Õ') {
            return 'o';
        } else if (arg0 == 'ù' || arg0 == 'ú' || arg0 == 'û' || arg0 == 'ü' || arg0 == 'Ù' || arg0 == 'Ú' || arg0 == 'Û' || arg0 == 'Ü') {
            return 'u';
        } else if (arg0 == 'ç' || arg0 == 'Ç') {
            return 'c';
        } else if (arg0 == 'ÿ' || arg0 == 'Ÿ') {
            return 'y';
        } else if (arg0 == 'ñ' || arg0 == 'Ñ') {
            return 'n';
        } else if (arg0 == 'ß') {
            return 'b';
        } else {
            return Character.toLowerCase(arg0);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(JLoa;I)V", line = 726)
    public final void method2761(long arg0, class43 arg1, int arg2) {
        class209 var5 = (class209) this.field6707.method2101(260);
        if (arg2 != 200) {
            this.field6716 = 0;
        }
        while (var5 != null) {
            var5.method1339(arg1, arg0);
            var5 = (class209) this.field6707.method2098((byte) 57);
        }
        field6698++;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(II)V", line = 748)
    public static final void method2762(int arg0, int arg1) {
        class222.field2906 = arg0;
        class57.field769 = 2;
        field6693++;
        long var2 = 0L;
        if (class285.field3701 == null) {
            class252.method1602(-113, 35);
            return;
        }
        class418 var4 = new class418(class597.method3236((byte) 105, class99.method739((byte) -106, class285.field3701)));
        long var5 = var4.method2377(arg1 ^ 0x2413AD9F);
        class510.field6690 = var4.method2377(-605269408);
        if (arg1 != -1) {
            field6708 = -0.62913114F;
        }
        class540.method2866(true, class84.method641(37, var5), 0, "");
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)V", line = 776)
    public static final void method2763(byte arg0) {
        field6700++;
        if (arg0 >= -18) {
            return;
        }
        int var1 = class435.field5643 * 512 + 256;
        int var2 = class67.field909 * 512 + 256;
        int var3 = class332.method1916(1218445319, var2, class390.field4991, var1) - class691.field9445;
        if (class608.field8220 >= 100) {
            class549.field7132 = class67.field909 * 512 + 256;
            class499.field6555 = class435.field5643 * 512 + 256;
            class655.field9120 = class332.method1916(1218445319, class549.field7132, class390.field4991, class499.field6555) - class691.field9445;
        } else {
            if (class499.field6555 < var1) {
                class499.field6555 += (var1 - class499.field6555) * class608.field8220 / 1000 + class49.field690;
                if (var1 < class499.field6555) {
                    class499.field6555 = var1;
                }
            }
            if (var1 < class499.field6555) {
                class499.field6555 -= (class499.field6555 - var1) * class608.field8220 / 1000 + class49.field690;
                if (class499.field6555 < var1) {
                    class499.field6555 = var1;
                }
            }
            if (class655.field9120 < var3) {
                class655.field9120 += (var3 - class655.field9120) * class608.field8220 / 1000 + class49.field690;
                if (class655.field9120 > var3) {
                    class655.field9120 = var3;
                }
            }
            if (class549.field7132 < var2) {
                class549.field7132 += (var2 - class549.field7132) * class608.field8220 / 1000 + class49.field690;
                if (var2 < class549.field7132) {
                    class549.field7132 = var2;
                }
            }
            if (class655.field9120 > var3) {
                class655.field9120 -= (class655.field9120 - var3) * class608.field8220 / 1000 + class49.field690;
                if (class655.field9120 < var3) {
                    class655.field9120 = var3;
                }
            }
            if (var2 < class549.field7132) {
                class549.field7132 -= (class549.field7132 - var2) * class608.field8220 / 1000 + class49.field690;
                if (class549.field7132 < var2) {
                    class549.field7132 = var2;
                }
            }
        }
        int var4 = class688.field9415 * 512 + 256;
        int var5 = class421.field5441 * 512 + 256;
        int var6 = class332.method1916(1218445319, var4, class390.field4991, var5) - class65.field884;
        int var7 = var5 - class499.field6555;
        int var8 = var6 - class655.field9120;
        int var9 = var4 - class549.field7132;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 2607.5945876176133D) & 0x3FFF;
        if (var11 < 1024) {
            var11 = 1024;
        }
        int var12 = (int) (Math.atan2((double) var7, (double) var9) * -2607.5945876176133D) & 0x3FFF;
        if (var11 > 3072) {
            var11 = 3072;
        }
        if (var11 > class299.field3911) {
            class299.field3911 += class235.field3140 + ((var11 - class299.field3911 >> 3) * class71.field965 / 1000) << 3;
            if (var11 < class299.field3911) {
                class299.field3911 = var11;
            }
        }
        if (class299.field3911 > var11) {
            class299.field3911 -= (class299.field3911 - var11 >> 3) * class71.field965 / 1000 + class235.field3140 << 3;
            if (class299.field3911 < var11) {
                class299.field3911 = var11;
            }
        }
        int var13 = var12 - class358.field4639;
        if (var13 > 8192) {
            var13 -= 16384;
        }
        if (var13 < -8192) {
            var13 += 16384;
        }
        int var14 = var13 >> 3;
        if (var14 > 0) {
            class358.field4639 += class71.field965 * var14 / 1000 + class235.field3140 << 3;
            class358.field4639 &= 0x3FFF;
        }
        if (var14 < 0) {
            class358.field4639 -= -var14 * class71.field965 / 1000 + class235.field3140 << 3;
            class358.field4639 &= 0x3FFF;
        }
        int var15 = var12 - class358.field4639;
        if (var15 > 8192) {
            var15 -= 16384;
        }
        if (var15 < -8192) {
            var15 += 16384;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            class358.field4639 = var12;
        }
        class470.field6146 = 0;
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(B)V", line = 938)
    public static void method2764(byte arg0) {
        int var1 = -40 % ((60 - arg0) / 47);
        field6696 = null;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(JBLoa;IZ)V", line = 948)
    public final void method2765(long arg0, byte arg1, class43 arg2, int arg3, boolean arg4) {
        field6704++;
        if (arg1 != -87) {
            this.field6709 = null;
        }
        if (this.field6701) {
            arg4 = false;
        } else if (this.field6692.field2838 > class446.field5735) {
            arg4 = false;
        } else if (class461.field6054[class446.field5735] < class514.field6735) {
            arg4 = false;
        } else if (this.field6710) {
            arg4 = false;
        } else if (this.field6692.field2839 != -1) {
            int var7 = (int) (arg0 - this.field6706);
            if (this.field6692.field2797 || this.field6692.field2839 >= var7) {
                var7 %= this.field6692.field2839;
            } else {
                arg4 = false;
            }
            if (!this.field6692.field2828 && var7 < this.field6692.field2811) {
                arg4 = false;
            }
            if (this.field6692.field2828 && this.field6692.field2811 <= var7) {
                arg4 = false;
            }
        }
        if (arg4) {
            class123.field1599++;
            int var8 = (this.field6694.field1616 + this.field6694.field1615 + this.field6694.field1624) / 3;
            int var9 = (this.field6694.field1625 + this.field6694.field1622 + this.field6694.field1621) / 3;
            int var10 = (this.field6694.field1610 + this.field6694.field1612 + this.field6694.field1626) / 3;
            if (this.field6694.field1608 != var8 || this.field6694.field1613 != var9 || this.field6694.field1609 != var10) {
                this.field6694.field1609 = var10;
                this.field6694.field1613 = var9;
                this.field6694.field1608 = var8;
                int var11 = this.field6694.field1615 - this.field6694.field1616;
                int var12 = this.field6694.field1625 - this.field6694.field1622;
                int var13 = this.field6694.field1612 - this.field6694.field1610;
                int var14 = this.field6694.field1624 - this.field6694.field1616;
                int var15 = this.field6694.field1621 - this.field6694.field1622;
                int var16 = this.field6694.field1626 - this.field6694.field1610;
                this.field6716 = var11 * var15 - var12 * var14;
                this.field6711 = var12 * var16 - (var13 * var15);
                this.field6713 = var13 * var14 - var11 * var16;
                while (true) {
                    if (this.field6711 <= 32767 && this.field6713 <= 32767 && this.field6716 <= 32767 && this.field6711 >= -32767 && this.field6713 >= -32767 && this.field6716 >= -32767) {
                        int var17 = (int) Math.sqrt((double) (this.field6716 * this.field6716 + this.field6711 * this.field6711 + (this.field6713 * this.field6713)));
                        if (var17 <= 0) {
                            var17 = 1;
                        }
                        this.field6713 = this.field6713 * 32767 / var17;
                        this.field6711 = this.field6711 * 32767 / var17;
                        this.field6716 = this.field6716 * 32767 / var17;
                        if (this.field6692.field2791 > 0 || this.field6692.field2778 > 0) {
                            int var18 = (int) (Math.atan2((double) this.field6716, (double) this.field6711) * 2607.5945876176133D);
                            int var19 = (int) (Math.atan2((double) this.field6713, Math.sqrt((double) (this.field6716 * this.field6716 + this.field6711 * this.field6711))) * 2607.5945876176133D);
                            this.field6712 = this.field6692.field2791 - this.field6692.field2776;
                            this.field6714 = this.field6692.field2778 - this.field6692.field2810;
                            this.field6717 = this.field6692.field2776 + var18 - (this.field6712 >> 1);
                            this.field6715 = var19 + this.field6692.field2810 - (this.field6714 >> 1);
                        }
                        break;
                    }
                    this.field6716 >>= 0x1;
                    this.field6713 >>= 0x1;
                    this.field6711 >>= 0x1;
                }
            }
            this.field6695 += (int) (((double) this.field6692.field2815 + (double) (this.field6692.field2795 - this.field6692.field2815) * Math.random()) * (double) arg3);
            if (this.field6695 > 63) {
                int var20 = this.field6695 >> 6;
                this.field6695 &= 0x3F;
                for (int var21 = 0; var21 < var20; var21++) {
                    int var22;
                    int var23;
                    int var24;
                    if (this.field6692.field2791 <= 0 && this.field6692.field2778 <= 0) {
                        var22 = this.field6713;
                        var23 = this.field6716;
                        var24 = this.field6711;
                    } else {
                        int var25 = this.field6717 + (int) ((double) this.field6712 * Math.random());
                        int var26 = var25 & 0x3FFF;
                        int var27 = class237.field3193[var26];
                        int var28 = class237.field3196[var26];
                        int var29 = (int) (Math.random() * (double) this.field6714) + this.field6715;
                        int var30 = var29 & 0x1FFF;
                        int var31 = class237.field3193[var30];
                        int var32 = class237.field3196[var30];
                        byte var33 = 13;
                        var24 = var28 * var31 >> var33;
                        var22 = (var32 << 1) * -1;
                        var23 = var27 * var31 >> var33;
                    }
                    float var34 = (float) Math.random();
                    float var35 = (float) Math.random();
                    if (var34 + var35 > 1.0F) {
                        var35 = 1.0F - var35;
                        var34 = 1.0F - var34;
                    }
                    float var36 = 1.0F - var34 - var35;
                    int var37 = (int) ((float) this.field6694.field1624 * var36 + (float) this.field6694.field1616 * var34 + (float) this.field6694.field1615 * var35);
                    int var38 = (int) ((float) this.field6694.field1621 * var36 + (float) this.field6694.field1625 * var35 + (float) this.field6694.field1622 * var34);
                    int var39 = (int) ((float) this.field6694.field1626 * var36 + (float) this.field6694.field1612 * var35 + (float) this.field6694.field1610 * var34);
                    int var40 = (int) ((float) this.field6709.field1624 * var36 + (float) this.field6709.field1616 * var34 + (float) this.field6709.field1615 * var35);
                    int var41 = (int) ((float) this.field6709.field1621 * var36 + (float) this.field6709.field1625 * var35 + (float) this.field6709.field1622 * var34);
                    int var42 = (int) ((float) this.field6709.field1626 * var36 + (float) this.field6709.field1612 * var35 + (float) this.field6709.field1610 * var34);
                    int var43 = var37 - var40;
                    int var44 = var38 - var41;
                    int var45 = var39 - var42;
                    int var46 = (int) ((double) var40 + (double) var43 * Math.random());
                    int var47 = (int) ((double) var41 + Math.random() * (double) var44);
                    int var48 = (int) ((double) var45 * Math.random() + (double) var42);
                    int var49 = this.field6692.field2806 + ((int) ((double) (this.field6692.field2827 - this.field6692.field2806) * Math.random()));
                    int var50 = (int) ((double) (this.field6692.field2785 - this.field6692.field2779) * Math.random()) + this.field6692.field2779;
                    int var51 = this.field6692.field2794 + (int) ((double) (this.field6692.field2782 - this.field6692.field2794) * Math.random());
                    int var52;
                    if (this.field6692.field2826) {
                        double var53 = Math.random();
                        var52 = (int) ((double) this.field6692.field2788 * Math.random() + (double) this.field6692.field2818) << 24 | (int) ((double) this.field6692.field2816 * var53 + (double) this.field6692.field2796) << 8 | (int) ((double) this.field6692.field2805 * var53 + (double) this.field6692.field2809) << 16 | (int) ((double) this.field6692.field2786 * var53 + (double) this.field6692.field2841);
                    } else {
                        var52 = (int) ((double) this.field6692.field2796 + (double) this.field6692.field2816 * Math.random()) << 8 | (int) ((double) this.field6692.field2809 + Math.random() * (double) this.field6692.field2805) << 16 | (int) ((double) this.field6692.field2841 + Math.random() * (double) this.field6692.field2786) | (int) ((double) this.field6692.field2818 + Math.random() * (double) this.field6692.field2788) << 24;
                    }
                    int var55 = this.field6692.field2836;
                    if (!arg2.method329() && !this.field6692.field2798) {
                        var55 = -1;
                    }
                    if (class61.field828 == class112.field1473) {
                        new class209(this, var46, var47, var48, var24, var22, var23, var49, var50, var52, var51, var55, this.field6692.field2821, this.field6692.field2830);
                    } else {
                        class209 var56 = class277.field3627[class112.field1473];
                        class112.field1473 = class112.field1473 + 1 & 0x3FF;
                        var56.method1338(this, var46, var47, var48, var24, var22, var23, var49, var50, var52, var51, var55, this.field6692.field2821, this.field6692.field2830);
                    }
                }
            }
        }
        if (!this.field6694.method915(this.field6709, (byte) -108)) {
            class125 var58 = this.field6709;
            this.field6709 = this.field6694;
            this.field6694 = var58;
            this.field6694.field1616 = this.field6691.field7470;
            this.field6694.field1626 = this.field6691.field7468;
            this.field6694.field1622 = this.field6691.field7472;
            this.field6694.field1625 = this.field6691.field7480;
            this.field6694.field1612 = this.field6691.field7475;
            this.field6694.field1624 = this.field6691.field7467;
            this.field6694.field1610 = this.field6691.field7466;
            this.field6694.field1615 = this.field6691.field7483;
            this.field6694.field1621 = this.field6691.field7471;
        }
        this.field6699 = 0;
        for (class209 var59 = (class209) this.field6707.method2101(260); var59 != null; var59 = (class209) this.field6707.method2098((byte) 57)) {
            var59.method1337(arg0, arg3);
            this.field6699++;
        }
        class53.field726 += this.field6699;
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "(I)V", line = 1209)
    public final void method2766(int arg0) {
        this.field6694.field1616 = this.field6691.field7470;
        this.field6694.field1610 = this.field6691.field7466;
        this.field6694.field1624 = this.field6691.field7467;
        this.field6694.field1612 = this.field6691.field7475;
        this.field6694.field1626 = this.field6691.field7468;
        this.field6694.field1621 = this.field6691.field7471;
        this.field6694.field1622 = this.field6691.field7472;
        field6703++;
        this.field6694.field1625 = this.field6691.field7480;
        if (arg0 <= 22) {
            return;
        }
        this.field6694.field1615 = this.field6691.field7483;
        if (this.field6694.field1616 == this.field6694.field1615 && this.field6694.field1624 == this.field6694.field1615 && this.field6694.field1625 == this.field6694.field1622 && this.field6694.field1625 == this.field6694.field1621 && this.field6694.field1612 == this.field6694.field1610 && this.field6694.field1626 == this.field6694.field1612) {
            this.field6710 = true;
        } else if (this.field6710) {
            this.field6710 = false;
            this.field6709.field1622 = this.field6694.field1622;
            this.field6709.field1615 = this.field6694.field1615;
            this.field6709.field1624 = this.field6694.field1624;
            this.field6709.field1626 = this.field6694.field1626;
            this.field6709.field1621 = this.field6694.field1621;
            this.field6709.field1616 = this.field6694.field1616;
            this.field6709.field1610 = this.field6694.field1610;
            this.field6709.field1612 = this.field6694.field1612;
            this.field6709.field1625 = this.field6694.field1625;
        }
    }
}
