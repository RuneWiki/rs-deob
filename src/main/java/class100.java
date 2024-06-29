import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class100 extends class60 {

    @OriginalMember(owner = "client!id", name = "t", descriptor = "I")
    private int field1521 = -1;

    @OriginalMember(owner = "client!id", name = "H", descriptor = "I")
    private int field1535 = -32768;

    @OriginalMember(owner = "client!id", name = "B", descriptor = "Lcj;")
    private class74 field1529 = null;

    @OriginalMember(owner = "client!id", name = "G", descriptor = "Z")
    private boolean field1534 = false;

    @OriginalMember(owner = "client!id", name = "S", descriptor = "I")
    private int field1546 = -1;

    @OriginalMember(owner = "client!id", name = "O", descriptor = "I")
    private int field1542;

    @OriginalMember(owner = "client!id", name = "N", descriptor = "I")
    private int field1541;

    @OriginalMember(owner = "client!id", name = "x", descriptor = "I")
    private int field1525;

    @OriginalMember(owner = "client!id", name = "R", descriptor = "I")
    private int field1545;

    @OriginalMember(owner = "client!id", name = "u", descriptor = "I")
    private int field1522;

    @OriginalMember(owner = "client!id", name = "o", descriptor = "I")
    private int field1516;

    @OriginalMember(owner = "client!id", name = "w", descriptor = "Lel;")
    private class77 field1524;

    @OriginalMember(owner = "client!id", name = "D", descriptor = "I")
    private int field1531;

    @OriginalMember(owner = "client!id", name = "z", descriptor = "I")
    private int field1527;

    @OriginalMember(owner = "client!id", name = "J", descriptor = "I")
    private int field1537;

    @OriginalMember(owner = "client!id", name = "p", descriptor = "I")
    private int field1517;

    @OriginalMember(owner = "client!id", name = "r", descriptor = "I")
    public static int field1519 = 0;

    @OriginalMember(owner = "client!id", name = "y", descriptor = "[Ljava/lang/String;")
    public static String[] field1526 = new String[100];

    @OriginalMember(owner = "client!id", name = "m", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!id", name = "n", descriptor = "I")
    public static int field1515;

    @OriginalMember(owner = "client!id", name = "q", descriptor = "I")
    public static int field1518;

    @OriginalMember(owner = "client!id", name = "s", descriptor = "I")
    public static int field1520;

    @OriginalMember(owner = "client!id", name = "v", descriptor = "I")
    public static int field1523;

    @OriginalMember(owner = "client!id", name = "A", descriptor = "I")
    public static int field1528;

    @OriginalMember(owner = "client!id", name = "C", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!id", name = "E", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!id", name = "I", descriptor = "I")
    public static int field1536;

    @OriginalMember(owner = "client!id", name = "K", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!id", name = "L", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!id", name = "P", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!id", name = "Q", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!id", name = "F", descriptor = "Lrb;")
    public static class164 field1533;

    @OriginalMember(owner = "client!id", name = "M", descriptor = "Lpj;")
    private class98 field1540;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(IIIII)V")
    public final void method100(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1530++;
        this.method747(arg3, (byte) 93, arg4);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IBI)V")
    private final void method747(int arg0, byte arg1, int arg2) {
        if (this.field1524 != null) {
            int var4 = class207.field3336 - this.field1517;
            if (var4 > 100 && this.field1524.field1260 > 0) {
                int var5 = this.field1524.field1256.length - this.field1524.field1260;
                while (var5 > this.field1531 && var4 > this.field1524.field1282[this.field1531]) {
                    var4 -= this.field1524.field1282[this.field1531];
                    this.field1531++;
                }
                if (var5 <= this.field1531) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field1524.field1256.length; var7++) {
                        var6 += this.field1524.field1282[var7];
                    }
                    var4 %= var6;
                }
                this.field1527 = this.field1531 + 1;
                if (this.field1527 >= this.field1524.field1256.length) {
                    this.field1527 -= this.field1524.field1260;
                    if (this.field1527 < 0 || this.field1524.field1256.length <= this.field1527) {
                        this.field1527 = -1;
                    }
                }
            }
            while (this.field1524.field1282[this.field1531] < var4) {
                class124.method916(arg2, arg0, 477628496, false, this.field1524, this.field1531);
                var4 -= this.field1524.field1282[this.field1531];
                this.field1531++;
                if (this.field1531 >= this.field1524.field1256.length) {
                    this.field1531 -= this.field1524.field1260;
                    if (this.field1531 < 0 || this.field1531 >= this.field1524.field1256.length) {
                        this.field1524 = null;
                        break;
                    }
                }
                this.field1527 = this.field1531 + 1;
                if (this.field1527 >= this.field1524.field1256.length) {
                    this.field1527 -= this.field1524.field1260;
                    if (this.field1527 < 0 || this.field1524.field1256.length <= this.field1527) {
                        this.field1527 = -1;
                    }
                }
            }
            this.field1537 = var4;
            this.field1517 = class207.field3336 - var4;
        }
        int var8 = 107 / ((arg1 + 62) / 41);
        field1515++;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method748(String arg0, int arg1) {
        if (arg1 != -8924) {
            method748((String) null, -107);
        }
        field1532++;
        int var2 = arg0.length();
        char[] var3 = new char[var2];
        byte var4 = 2;
        for (int var5 = 0; var5 < var2; var5++) {
            char var6 = arg0.charAt(var5);
            if (var4 == 0) {
                var6 = Character.toLowerCase(var6);
            } else if (var4 == 2 || Character.isUpperCase(var6)) {
                var6 = class206.method1386(var6, -27109);
            }
            if (Character.isLetter(var6)) {
                var4 = 0;
            } else if (var6 == '.' || var6 == '?' || var6 == '!') {
                var4 = 2;
            } else if (!Character.isSpaceChar(var6)) {
                var4 = 1;
            } else if (var4 != 2) {
                var4 = 1;
            }
            var3[var5] = var6;
        }
        return new String(var3);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "()I")
    public final int method99() {
        field1543++;
        return this.field1535;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIIIIIIJILpj;)V")
    public final void method98(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class98 arg10) {
        field1523++;
        class60 var13 = this.method749(-1);
        if (var13 != null) {
            var13.method98(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1540);
        }
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(I)Lci;")
    public final class60 method749(int arg0) {
        if (arg0 != -1) {
            this.field1525 = 108;
        }
        field1536++;
        return this.method752(-19521, false);
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(I)V")
    public static void method750(int arg0) {
        if (arg0 != 8) {
            field1528 = -105;
        }
        field1533 = null;
        field1526 = null;
    }

    @OriginalMember(owner = "client!id", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field1544++;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(II)Z")
    public static final boolean method751(int arg0, int arg1) {
        byte var2 = 0;
        field1539++;
        byte var3 = 0;
        if (class247.field3888 == null) {
            if (class196.field3200 == null) {
                class247.field3888 = new class17(512, 512);
            } else {
                class247.field3888 = (class17) class196.field3200;
            }
            int[] var4 = class247.field3888.field244;
            int var5 = var4.length;
            for (int var6 = 0; var6 < var5; var6++) {
                var4[var6] = 1;
            }
            for (int var7 = var2 + 1; var7 < 103 - var2; var7++) {
                int var21 = ((var2 + 103 - var7) * 2048) + 24628;
                for (int var22 = var3 + 1; var22 < 104 - var3 - 1; var22++) {
                    if ((class43.field790[arg1][var22][var7] & 0x18) == 0) {
                        class242.method1603(var4, var21, 512, arg1, var22, var7);
                    }
                    if (arg1 < 3 && (class43.field790[arg1 + 1][var22][var7] & 0x8) != 0) {
                        class242.method1603(var4, var21, 512, arg1 + 1, var22, var7);
                    }
                    var21 += 4;
                }
            }
            class276.field4394 = 0;
            for (int var8 = 0; var8 < 104; var8++) {
                for (int var9 = 0; var9 < 104; var9++) {
                    long var10 = class205.method1382(class92.field1448, var8 + var3, var2 + var9);
                    if (var10 != 0L) {
                        class248 var12 = class46.method396(Integer.MAX_VALUE & (int) (var10 >>> 32), (byte) 63);
                        int var13 = var12.field3907;
                        if (var12.field3897 != null) {
                            for (int var14 = 0; var14 < var12.field3897.length; var14++) {
                                if (var12.field3897[var14] != -1) {
                                    class248 var15 = class46.method396(var12.field3897[var14], (byte) 63);
                                    if (var15.field3907 >= 0) {
                                        var13 = var15.field3907;
                                        break;
                                    }
                                }
                            }
                        }
                        if (var13 >= 0) {
                            int var16 = var3 + var8;
                            int var17 = var2 + var9;
                            if (var13 != 22 && var13 != 29 && var13 != 34 && var13 != 36 && var13 != 46 && var13 != 47 && var13 != 48) {
                                int[][] var18 = class141.field2352[class92.field1448].field171;
                                for (int var19 = 0; var19 < 10; var19++) {
                                    int var20 = (int) (Math.random() * 4.0D);
                                    if (var20 == 0 && var16 > 0 && (var8 - 3) < var16 && (var18[var16 - 1][var17] & 0x2C0108) == 0) {
                                        var16--;
                                    }
                                    if (var20 == 1 && var16 < 103 && (var8 + 3) > var16 && (var18[var16 + 1][var17] & 0x2C0180) == 0) {
                                        var16++;
                                    }
                                    if (var20 == 2 && var17 > 0 && (var9 - 3) < var17 && (var18[var16][var17 - 1] & 0x2C0102) == 0) {
                                        var17--;
                                    }
                                    if (var20 == 3 && var17 < 103 && var17 < var9 + 3 && (var18[var16][var17 + 1] & 0x2C0120) == 0) {
                                        var17++;
                                    }
                                }
                            }
                            class247.field3885[class276.field4394] = var12.field3893;
                            class137.field2303[class276.field4394] = var16 - var3;
                            class205.field3295[class276.field4394] = var17 - var2;
                            class276.field4394++;
                        }
                    }
                }
            }
        }
        class247.field3888.method110();
        int var23 = ((((int) (Math.random() * 20.0D)) + 238) - 10 << 16) - (-((int) (Math.random() * 20.0D) + 228 << 8) - 228) + (int) (Math.random() * 20.0D);
        int var24 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        for (int var25 = 1; var25 < 103; var25++) {
            for (int var26 = 1; var26 < 103; var26++) {
                if ((class43.field790[arg1][var26 + var3][var2 + var25] & 0x18) == 0 && !class193.method1324(var24, arg1, var26, var25, -109, var23, var2, var3)) {
                    class263.field4173.method943(128);
                    return false;
                }
                if (arg1 < 3 && (class43.field790[arg1 + 1][var26 + var3][var2 + var25] & 0x8) != 0 && !class193.method1324(var24, arg1 + 1, var26, var25, -112, var23, var2, var3)) {
                    class263.field4173.method943(arg0 + 92);
                    return false;
                }
            }
        }
        class196.field3200 = class247.field3888;
        class263.field4173.method943(arg0 ^ 0xA4);
        if (arg0 != 36) {
            field1526 = null;
        }
        class247.field3888 = null;
        return true;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IZ)Lci;")
    private final class60 method752(int arg0, boolean arg1) {
        field1520++;
        boolean var3 = class21.field327 != class161.field2627;
        class248 var4 = class46.method396(this.field1516, (byte) 63);
        int var5 = var4.field3946;
        if (var4.field3897 != null) {
            var4 = var4.method1656(arg0 + 19521);
        }
        if (var4 == null) {
            return null;
        }
        if (class238.field3752 != 0 && this.field1534 && (this.field1524 == null || this.field1524 != null && this.field1524.field1284 != var4.field3946)) {
            int var6 = var4.field3946;
            if (var4.field3946 == -1) {
                var6 = var5;
            }
            if (var6 == -1) {
                this.field1524 = null;
            } else {
                this.field1524 = class28.method246(88, var6);
            }
            if (this.field1524 != null) {
                if (var4.field3911 && this.field1524.field1260 != -1) {
                    this.field1531 = (int) ((double) this.field1524.field1256.length * Math.random());
                    this.field1517 -= (int) (Math.random() * (double) this.field1524.field1282[this.field1531]);
                } else {
                    this.field1531 = 0;
                    this.field1517 = class207.field3336 - 1;
                }
            }
        }
        int var7 = this.field1542 & 0x3;
        int var8;
        int var9;
        if (var7 == 1 || var7 == 3) {
            var9 = var4.field3960;
            var8 = var4.field3947;
        } else {
            var8 = var4.field3960;
            var9 = var4.field3947;
        }
        int var10 = (var9 >> 1) + this.field1522;
        int var11 = (var9 + 1 >> 1) + this.field1522;
        int var12 = (var8 + 1 >> 1) + this.field1541;
        int var13 = (var8 >> 1) + this.field1541;
        this.method747(var10 * 128, (byte) -108, var13 * 128);
        boolean var14 = !var3 && var4.field3967 && (this.field1521 != var4.field3893 || (this.field1546 != this.field1531 || this.field1524 != null && (this.field1524.field1263 || class294.field4671) && this.field1531 != this.field1527) && class112.field1735 >= 2);
        if (arg1 && !var14) {
            return null;
        }
        int[][] var15 = class21.field327[this.field1525];
        if (arg0 != -19521) {
            return null;
        }
        int var16 = (this.field1541 << 7) + (var8 << 6);
        int[][] var17 = null;
        int var18 = var15[var10][var12] + var15[var11][var12] + var15[var10][var13] + var15[var11][var13] >> 2;
        boolean var19 = this.field1529 == null;
        if (var3) {
            var17 = class161.field2627[0];
        } else if (this.field1525 < 3) {
            var17 = class21.field327[this.field1525 + 1];
        }
        int var20 = (this.field1522 << 7) + (var9 << 6);
        class55 var21;
        if (this.field1524 == null) {
            var21 = var4.method1647(var16, var20, var14, var19 ? class124.field2043 : this.field1529, var17, var15, this.field1542, this.field1545, 78, false, var18);
        } else {
            var21 = var4.method1646(this.field1545, var15, var19 ? class124.field2043 : this.field1529, var17, var20, var14, var16, this.field1524, var18, this.field1527, this.field1537, (byte) -124, this.field1542, this.field1531);
        }
        return var21 == null ? null : var21.field986;
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "(IIIIIIIZLci;)V")
    public class100(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class60 arg8) {
        this.field1542 = arg2;
        this.field1541 = arg5;
        this.field1525 = arg3;
        this.field1545 = arg1;
        this.field1522 = arg4;
        this.field1516 = arg0;
        if (arg6 != -1) {
            this.field1524 = class28.method246(-67, arg6);
            this.field1531 = 0;
            if (this.field1524.field1256.length > 1) {
                this.field1527 = 1;
            } else {
                this.field1527 = 0;
            }
            this.field1537 = 1;
            this.field1517 = class207.field3336 - 1;
            if (this.field1524.field1270 == 0 && arg8 != null && arg8 instanceof class100) {
                class100 var10 = (class100) arg8;
                if (this.field1524 == var10.field1524) {
                    this.field1517 = var10.field1517;
                    this.field1531 = var10.field1531;
                    this.field1527 = var10.field1527;
                    this.field1537 = var10.field1537;
                    return;
                }
            }
            if (arg7 && this.field1524.field1260 != -1) {
                this.field1531 = (int) ((double) this.field1524.field1256.length * Math.random());
                this.field1527 = this.field1531 + 1;
                if (this.field1527 >= this.field1524.field1256.length) {
                    this.field1527 -= this.field1524.field1260;
                    if (this.field1527 < 0 || this.field1527 >= this.field1524.field1256.length) {
                        this.field1527 = -1;
                    }
                }
                this.field1537 = (int) ((double) this.field1524.field1282[this.field1531] * Math.random()) + 1;
                this.field1517 = class207.field3336 - this.field1537;
            }
        }
        if (arg8 == null) {
            class248 var11 = class46.method396(this.field1516, (byte) 63);
            if (var11.field3897 != null) {
                this.field1534 = true;
                return;
            }
        }
    }
}
