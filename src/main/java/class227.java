import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class227 {

    @OriginalMember(owner = "client!jf", name = "w", descriptor = "I")
    private int field3645 = 0;

    @OriginalMember(owner = "client!jf", name = "t", descriptor = "I")
    public int field3642;

    @OriginalMember(owner = "client!jf", name = "v", descriptor = "[Lsn;")
    public class187[] field3644;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "I")
    public static int field3628 = 0;

    @OriginalMember(owner = "client!jf", name = "p", descriptor = "Ljava/lang/String;")
    public static String field3638 = null;

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "F")
    public static float field3633;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
    public static int field3626;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "I")
    public static int field3630;

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "I")
    public static int field3632;

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "I")
    public static int field3634;

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "I")
    public static int field3635;

    @OriginalMember(owner = "client!jf", name = "n", descriptor = "I")
    public static int field3636;

    @OriginalMember(owner = "client!jf", name = "o", descriptor = "I")
    public static int field3637;

    @OriginalMember(owner = "client!jf", name = "q", descriptor = "I")
    public static int field3639;

    @OriginalMember(owner = "client!jf", name = "r", descriptor = "I")
    public static int field3640;

    @OriginalMember(owner = "client!jf", name = "s", descriptor = "I")
    public static int field3641;

    @OriginalMember(owner = "client!jf", name = "u", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "J")
    private long field3625;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "Lsn;")
    private class187 field3627;

    @OriginalMember(owner = "client!jf", name = "x", descriptor = "Lsn;")
    private class187 field3646;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)Lsn;", line = 9)
    public final class187 method1546(int arg0) {
        field3623++;
        if (arg0 != -1) {
            return (class187) null;
        } else if (this.field3645 <= 0 || this.field3644[this.field3645 - 1] == this.field3646) {
            class187 var3;
            do {
                if (this.field3645 >= this.field3642) {
                    return null;
                }
                var3 = this.field3644[this.field3645++].field2846;
            } while (this.field3644[this.field3645 - 1] == var3);
            this.field3646 = var3.field2846;
            return var3;
        } else {
            class187 var2 = this.field3646;
            this.field3646 = var2.field2846;
            return var2;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V", line = 48)
    public static void method1547(byte arg0) {
        field3638 = null;
        if (arg0 > -25) {
            field3628 = -10;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIII)Lig;", line = 60)
    public static final class67 method1548(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != -8952) {
            field3628 = -123;
        }
        field3626++;
        long var5 = (long) arg0 & 0xFFFFL << 16 | ((long) arg4 & 0xFFFFL) << 48 | (long) arg1 & 0xFFFFL << 32 | (long) arg3 & 0xFFFFL;
        class67 var7 = (class67) class274.field4214.method1294(var5, 115);
        if (var7 != null) {
            return var7;
        }
        class285 var8 = class230.method1582(arg3, (byte) -51);
        class25[] var9 = null;
        if (var8.field4364 != null) {
            var9 = new class25[var8.field4364.length];
            for (int var10 = 0; var10 < var9.length; var10++) {
                class84 var11 = class95.method656(30, var8.field4364[var10]);
                var9[var10] = new class25(var11.field1279, var11.field1267, var11.field1272, var11.field1271, var11.field1268, var11.field1277, var11.field1274, var11.field1278);
            }
        }
        class67 var12 = new class67(var8.field4363, var9, var8.field4359, arg4, arg1, arg0);
        class274.field4214.method1292(var5, arg2 + 8860, var12);
        return var12;
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(B)Lsn;", line = 103)
    public final class187 method1549(byte arg0) {
        this.field3645 = 0;
        field3635++;
        int var2 = 44 / ((arg0 - 29) / 52);
        return this.method1546(-1);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lsn;JB)V", line = 115)
    public final void method1550(class187 arg0, long arg1, byte arg2) {
        if (arg2 <= 0) {
            return;
        }
        if (arg0.field2850 != null) {
            arg0.method1284(0);
        }
        class187 var5 = this.field3644[(int) ((long) (this.field3642 - 1) & arg1)];
        arg0.field2850 = var5.field2850;
        field3632++;
        arg0.field2846 = var5;
        arg0.field2850.field2846 = arg0;
        arg0.field2846.field2850 = arg0;
        arg0.field2852 = arg1;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(BLwf;)V", line = 142)
    public static final void method1551(byte arg0, class306 arg1) {
        field3639++;
        class33.field428 = arg1;
        if (arg0 != 76) {
            field3628 = 9;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Z)I", line = 154)
    public final int method1552(boolean arg0) {
        field3634++;
        if (!arg0) {
            method1555((String) null, 118, -101, true);
        }
        return this.field3642;
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)V", line = 167)
    public final void method1553(int arg0) {
        int var2 = 0;
        if (arg0 != -27930) {
            method1555((String) null, -54, -28, true);
        }
        while (this.field3642 > var2) {
            class187 var3 = this.field3644[var2];
            while (true) {
                class187 var4 = var3.field2846;
                if (var3 == var4) {
                    var2++;
                    break;
                }
                var4.method1284(0);
            }
        }
        this.field3627 = null;
        field3624++;
        this.field3646 = null;
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(I)Lsn;", line = 206)
    public final class187 method1554(int arg0) {
        field3636++;
        if (this.field3627 == null) {
            return null;
        }
        if (arg0 != 0) {
            this.method1546(-60);
        }
        class187 var2 = this.field3644[(int) (this.field3625 & (long) (this.field3642 - 1))];
        while (this.field3627 != var2) {
            if (this.field3627.field2852 == this.field3625) {
                class187 var3 = this.field3627;
                this.field3627 = this.field3627.field2846;
                return var3;
            }
            this.field3627 = this.field3627.field2846;
        }
        this.field3627 = null;
        return null;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Ljava/lang/String;IIZ)Z", line = 240)
    public static final boolean method1555(String arg0, int arg1, int arg2, boolean arg3) {
        field3641++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg0.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg0.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg3) {
                    continue;
                }
            }
            int var12;
            if (var9 >= '0' && var9 <= '9') {
                var12 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var12 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var12 = var9 - 'W';
            } else {
                return false;
            }
            if (arg2 <= var12) {
                return false;
            }
            if (var4) {
                var12 = -var12;
            }
            int var10 = arg2 * var6 + var12;
            if ((var10 / arg2) != var6) {
                return false;
            }
            var5 = true;
            var6 = var10;
        }
        int var11 = -60 / ((-arg1 - 36) / 63);
        return var5;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZIIZIIII)V", line = 319)
    public static final void method1556(boolean arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
        field3643++;
        if (!arg0 && class144.field2288 == arg7 && class240.field3815 == arg1 && class230.field3720 == arg5 || class148.method1042((byte) 54)) {
            return;
        }
        class240.field3815 = arg1;
        class144.field2288 = arg7;
        class230.field3720 = arg5;
        if (class148.method1042((byte) 54)) {
            class230.field3720 = 0;
        }
        if (arg3) {
            class231.method1583(28, (byte) 28);
        } else {
            class231.method1583(25, (byte) 108);
        }
        class204.method1369(true, true, class200.field3016);
        int var8 = class30.field374;
        int var9 = class294.field4535;
        class30.field374 = (arg7 - 6) * 8;
        class294.field4535 = (arg1 - 6) * 8;
        class336.field5223 = class286.method1871(class144.field2288 * 8, (byte) -121, class240.field3815 * 8);
        int var10 = class294.field4535 - var9;
        class210.field3333 = null;
        int var11 = class294.field4535;
        int var12 = class30.field374 - var8;
        int var13 = class30.field374;
        if (arg3) {
            class155.field2439 = 0;
            for (int var17 = 0; var17 < 32768; var17++) {
                class80 var18 = class208.field3313[var17];
                if (var18 != null) {
                    var18.field519 -= var10 * 128;
                    var18.field537 -= var12 * 128;
                    if (var18.field537 >= 0 && var18.field537 <= 13184 && var18.field519 >= 0 && var18.field519 <= 13184) {
                        for (int var19 = 0; var19 < 10; var19++) {
                            var18.field476[var19] -= var12;
                            var18.field505[var19] -= var10;
                        }
                        class144.field2286[class155.field2439++] = var17;
                    } else {
                        class208.field3313[var17].method554((class298) null, -112);
                        class208.field3313[var17] = null;
                    }
                }
            }
        } else {
            for (int var14 = 0; var14 < 32768; var14++) {
                class80 var15 = class208.field3313[var14];
                if (var15 != null) {
                    for (int var16 = 0; var16 < 10; var16++) {
                        var15.field476[var16] -= var12;
                        var15.field505[var16] -= var10;
                    }
                    var15.field537 -= var12 * 128;
                    var15.field519 -= var10 * 128;
                }
            }
        }
        for (int var20 = 0; var20 < 2048; var20++) {
            class82 var21 = class64.field966[var20];
            if (var21 != null) {
                for (int var22 = 0; var22 < 10; var22++) {
                    var21.field476[var22] -= var12;
                    var21.field505[var22] -= var10;
                }
                var21.field537 -= var12 * 128;
                var21.field519 -= var10 * 128;
            }
        }
        class77.field1154 = arg5;
        class79.field1173.method567(false, -25545, arg6, arg4);
        byte var23 = 0;
        byte var24 = 104;
        if (arg2 != -2732) {
            field3633 = -1.9377006F;
        }
        byte var25 = 0;
        byte var26 = 104;
        byte var27 = 1;
        byte var28 = 1;
        if (var12 < 0) {
            var28 = -1;
            var24 = -1;
            var23 = 103;
        }
        if (var10 < 0) {
            var25 = 103;
            var27 = -1;
            var26 = -1;
        }
        for (int var29 = var23; var29 != var24; var29 += var28) {
            for (int var30 = var25; var30 != var26; var30 += var27) {
                int var31 = var12 + var29;
                int var32 = var10 + var30;
                for (int var33 = 0; var33 < 4; var33++) {
                    if (var31 >= 0 && var32 >= 0 && var31 < 104 && var32 < 104) {
                        class274.field4221[var33][var29][var30] = class274.field4221[var33][var31][var32];
                    } else {
                        class274.field4221[var33][var29][var30] = null;
                    }
                }
            }
        }
        for (class208 var34 = (class208) class203.field3069.method10((byte) 41); var34 != null; var34 = (class208) class203.field3069.method13((byte) -32)) {
            var34.field3316 -= var12;
            var34.field3322 -= var10;
            if (var34.field3316 < 0 || var34.field3322 < 0 || var34.field3316 >= 104 || var34.field3322 >= 104) {
                var34.method1284(0);
            }
        }
        if (arg3) {
            class298.field4598 -= var12 * 128;
            class131.field2067 -= var12;
            class29.field365 -= var12;
            class225.field3592 -= var10 * 128;
            class269.field4147 -= var10;
            class213.field3379 -= var10;
        } else {
            class219.field3489 = 1;
        }
        class271.field4162 = 0;
        if (class133.field2099 != 0) {
            class133.field2099 -= var12;
            class228.field3660 -= var10;
        }
        if (class333.field5166 && arg3 && (Math.abs(var12) > 104 || Math.abs(var10) > 104)) {
            class323.method2186(-96);
        }
        class34.field445 = -1;
        class18.field252.method5(63);
        class39.field568.method5(35);
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(B)V", line = 573)
    public static final void method1557(byte arg0) {
        field3631++;
        class44.method311(-19394, 5);
        class237.method1616(true, 5);
        class218.method1460(5, arg0 + 298);
        class24.method183(5, 3);
        class302.method1986(5, arg0 ^ 0x57);
        class293.method1913((byte) 118, 5);
        class3.method16(115, 5);
        class77.method543(5, (byte) -88);
        class234.method1596(5, false);
        class265.method1757(5, arg0 ^ 0xFFFFFF8D);
        class19.method149(0, 5);
        class61.method413(5, arg0 + 44);
        class146.method1011(5, -1);
        class282.method1853(110, 5);
        class112.method755(5, (byte) 35);
        class154.method1077((byte) 107, 5);
        class120.method820(5, 500);
        class282.method1852(arg0 ^ 0xFFFFFFFE, 50);
        class177.method1197(5, arg0 ^ 0xFFFFFFD6);
        class47.method326(5, 12);
        class166.field2555.method1287(5, -108);
        class68.field1023.method1287(5, 117);
        if (arg0 != -42) {
            method1555((String) null, 101, -101, true);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(JZ)Lsn;", line = 605)
    public final class187 method1558(long arg0, boolean arg1) {
        this.field3625 = arg0;
        field3629++;
        if (arg1) {
            method1556(true, 59, -128, true, 0, 8, 123, -120);
        }
        class187 var4 = this.field3644[(int) ((long) (this.field3642 - 1) & arg0)];
        for (this.field3627 = var4.field2846; this.field3627 != var4; this.field3627 = this.field3627.field2846) {
            if (this.field3627.field2852 == arg0) {
                class187 var5 = this.field3627;
                this.field3627 = this.field3627.field2846;
                return var5;
            }
        }
        this.field3627 = null;
        return null;
    }

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "(I)I", line = 635)
    public final int method1559(int arg0) {
        int var2 = 0;
        field3630++;
        if (arg0 != -29512) {
            return 106;
        }
        for (int var3 = 0; var3 < this.field3642; var3++) {
            class187 var4 = this.field3644[var3];
            class187 var5 = var4.field2846;
            while (var4 != var5) {
                var5 = var5.field2846;
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "([Lsn;I)I", line = 667)
    public final int method1560(class187[] arg0, int arg1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = -17 % ((83 - arg1) / 38);
        while (var4 < this.field3642) {
            class187 var6 = this.field3644[var4];
            for (class187 var7 = var6.field2846; var7 != var6; var7 = var7.field2846) {
                arg0[var3++] = var7;
            }
            var4++;
        }
        field3637++;
        return var3;
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(I)V", line = 699)
    public class227(int arg0) {
        this.field3642 = arg0;
        this.field3644 = new class187[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class187 var3 = this.field3644[var2] = new class187();
            var3.field2850 = var3;
            var3.field2846 = var3;
        }
    }
}
