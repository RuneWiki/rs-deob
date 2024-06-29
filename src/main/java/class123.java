import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public class class123 extends class56 {

    @OriginalMember(owner = "client!ut", name = "D", descriptor = "I")
    private int field1462 = 81;

    @OriginalMember(owner = "client!ut", name = "N", descriptor = "I")
    private int field1471 = 1024;

    @OriginalMember(owner = "client!ut", name = "U", descriptor = "I")
    private int field1478 = 4;

    @OriginalMember(owner = "client!ut", name = "S", descriptor = "I")
    private int field1476 = 1024;

    @OriginalMember(owner = "client!ut", name = "cb", descriptor = "I")
    private int field1486 = 0;

    @OriginalMember(owner = "client!ut", name = "Z", descriptor = "I")
    private int field1483 = 409;

    @OriginalMember(owner = "client!ut", name = "W", descriptor = "I")
    private int field1480 = 8;

    @OriginalMember(owner = "client!ut", name = "E", descriptor = "I")
    private int field1463 = 204;

    @OriginalMember(owner = "client!ut", name = "Y", descriptor = "I")
    public static int field1482 = 0;

    @OriginalMember(owner = "client!ut", name = "O", descriptor = "F")
    public static float field1472;

    @OriginalMember(owner = "client!ut", name = "T", descriptor = "F")
    public static float field1477;

    @OriginalMember(owner = "client!ut", name = "G", descriptor = "I")
    private int field1465;

    @OriginalMember(owner = "client!ut", name = "H", descriptor = "I")
    public static int field1466;

    @OriginalMember(owner = "client!ut", name = "I", descriptor = "I")
    private int field1467;

    @OriginalMember(owner = "client!ut", name = "K", descriptor = "I")
    public static int field1468;

    @OriginalMember(owner = "client!ut", name = "L", descriptor = "I")
    private int field1469;

    @OriginalMember(owner = "client!ut", name = "M", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client!ut", name = "P", descriptor = "I")
    public static int field1473;

    @OriginalMember(owner = "client!ut", name = "Q", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!ut", name = "R", descriptor = "I")
    public static int field1475;

    @OriginalMember(owner = "client!ut", name = "V", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!ut", name = "X", descriptor = "I")
    public static int field1481;

    @OriginalMember(owner = "client!ut", name = "bb", descriptor = "I")
    public static int field1485;

    @OriginalMember(owner = "client!ut", name = "db", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!ut", name = "eb", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!ut", name = "ab", descriptor = "[I")
    private int[] field1484;

    @OriginalMember(owner = "client!ut", name = "F", descriptor = "[[I")
    private int[][] field1464;

    @OriginalMember(owner = "client!ut", name = "fb", descriptor = "[[I")
    private int[][] field1489;

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(ILee;I)V")
    public final void method6(int arg0, class675 arg1, int arg2) {
        ++field1474;
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (~arg2 != -5) {
                            if (arg2 != 5) {
                                if (arg2 != 6) {
                                    if (arg2 == 7) {
                                        this.field1476 = arg1.method3757((byte) -65);
                                    }
                                } else {
                                    this.field1462 = arg1.method3757((byte) -65);
                                }
                            } else {
                                this.field1486 = arg1.method3757((byte) -65);
                            }
                        } else {
                            this.field1471 = arg1.method3757((byte) -65);
                        }
                    } else {
                        this.field1463 = arg1.method3757((byte) -65);
                    }
                } else {
                    this.field1483 = arg1.method3757((byte) -65);
                }
            } else {
                this.field1480 = arg1.method3750((byte) 35);
            }
        } else {
            this.field1478 = arg1.method3750((byte) 35);
        }
        if (arg0 != 3731) {
            field1472 = -0.16622394F;
        }
    }

    @OriginalMember(owner = "client!ut", name = "e", descriptor = "(III)V")
    public static final void method834(int arg0, int arg1, int arg2) {
        if (~class469.field6659 != -1) {
            if (arg1 < 0) {
                for (int var3 = 0; var3 < 16; ++var3) {
                    class601.field8432[var3] = arg2;
                }
            } else {
                class601.field8432[arg1] = arg2;
            }
        }
        if (arg0 != 0) {
            field1477 = -0.51017433F;
        }
        ++field1475;
        class165.field2262.method1365(arg1, (byte) 113, arg2);
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(BILjava/lang/String;Z)I")
    public static final int method835(byte arg0, int arg1, String arg2, boolean arg3) {
        ++field1487;
        if (~arg1 <= -3 && ~arg1 >= -37) {
            boolean var4 = false;
            boolean var5 = false;
            if (arg0 != -21) {
                return 60;
            } else {
                int var6 = 0;
                int var7 = arg2.length();
                for (int var8 = 0; var7 > var8; ++var8) {
                    char var9 = arg2.charAt(var8);
                    if (var8 == 0) {
                        if (~var9 == -46) {
                            var4 = true;
                            continue;
                        }
                        if (~var9 == -44 && arg3) {
                            continue;
                        }
                    }
                    int var11;
                    if (~var9 <= -49 && ~var9 >= -58) {
                        var11 = var9 - '0';
                    } else if (var9 >= 'A' && var9 <= 'Z') {
                        var11 = var9 - '7';
                    } else {
                        if (var9 < 'a' || var9 > 'z') {
                            throw new NumberFormatException();
                        }
                        var11 = var9 - 'W';
                    }
                    if (~var11 <= ~arg1) {
                        throw new NumberFormatException();
                    }
                    if (var4) {
                        var11 = -var11;
                    }
                    int var10 = arg1 * var6 - -var11;
                    if (~(var10 / arg1) != ~var6) {
                        throw new NumberFormatException();
                    }
                    var6 = var10;
                    var5 = true;
                }
                if (!var5) {
                    throw new NumberFormatException();
                } else {
                    return var6;
                }
            }
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(IBLjb;)Ljava/lang/String;")
    public static final String method836(int arg0, byte arg1, class493 arg2) {
        ++field1468;
        if (!client.method1950(arg2).method2850(arg1 ^ -71, arg0) && arg2.field7040 == null) {
            return null;
        } else if (arg2.field7005 != null && ~arg0 > ~arg2.field7005.length && arg2.field7005[arg0] != null && arg2.field7005[arg0].trim().length() != 0) {
            return arg1 != 113 ? null : arg2.field7005[arg0];
        } else {
            return class600.field8422 ? "Hidden-" + arg0 : null;
        }
    }

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "(II)I")
    public static final int method837(int arg0, int arg1) {
        int var7 = arg1 - 1;
        ++field1481;
        if (arg0 < 105) {
            return 101;
        } else {
            int var2 = var7 | var7 >>> 1;
            int var3 = var2 | var2 >>> 2;
            int var4 = var3 | var3 >>> 4;
            int var5 = var4 | var4 >>> 8;
            int var6 = var5 | var5 >>> 16;
            return var6 + 1;
        }
    }

    @OriginalMember(owner = "client!ut", name = "e", descriptor = "(I)V")
    private final void method838(int arg0) {
        ++field1470;
        Random var2 = new Random((long) this.field1480);
        this.field1465 = this.field1462 / 2;
        this.field1467 = 4096 / this.field1478;
        this.field1469 = 4096 / this.field1480;
        if (arg0 <= -79) {
            int var3 = this.field1467 / 2;
            this.field1464 = new int[this.field1480][this.field1478];
            this.field1484 = new int[this.field1480 - -1];
            this.field1489 = new int[this.field1480][this.field1478 + 1];
            int var4 = this.field1469 / 2;
            this.field1484[0] = 0;
            for (int var5 = 0; ~var5 > ~this.field1480; ++var5) {
                if (~var5 < -1) {
                    int var6 = this.field1469;
                    int var7 = (class111.method790(4096, var2, (byte) -119) + -2048) * this.field1463 >> 12;
                    int var8 = (var4 * var7 >> 12) + var6;
                    this.field1484[var5] = this.field1484[var5 + -1] + var8;
                }
                this.field1489[var5][0] = 0;
                for (int var9 = 0; this.field1478 > var9; ++var9) {
                    if (~var9 < -1) {
                        int var10 = this.field1467;
                        int var11 = (class111.method790(4096, var2, (byte) -119) + -2048) * this.field1483 >> 12;
                        int var12 = (var3 * var11 >> 12) + var10;
                        this.field1489[var5][var9] = this.field1489[var5][var9 + -1] + var12;
                    }
                    this.field1464[var5][var9] = ~this.field1476 >= -1 ? 4096 : -class111.method790(this.field1476, var2, (byte) -119) + 4096;
                }
                this.field1489[var5][this.field1478] = 4096;
            }
            this.field1484[this.field1480] = 4096;
        }
    }

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "(I)V")
    public final void method364(int arg0) {
        this.method838(-94);
        if (arg0 != 7) {
            this.field1464 = null;
        }
        ++field1488;
    }

    @OriginalMember(owner = "client!ut", name = "c", descriptor = "(B)V")
    public static final void method839(byte arg0) {
        ++field1479;
        if (~class557.field7812.field6509.method3516(false) == -3) {
            byte var1 = (byte) (class82.field1033 + -4 & 255);
            int var2 = class82.field1033 % class336.field4683;
            for (int var3 = 0; var3 < 4; ++var3) {
                for (int var18 = 0; var18 < class700.field9768; ++var18) {
                    class741.field10305[var3][var2][var18] = var1;
                }
            }
            if (class526.field7430 != 3) {
                for (int var4 = 0; ~var4 > -3; ++var4) {
                    class418.field5909[var4] = -1000000;
                    class402.field5702[var4] = 1000000;
                    class267.field3817[var4] = 0;
                    class394.field5582[var4] = 1000000;
                    class307.field4297[var4] = 0;
                }
                int var5 = class660.field9039.field1264;
                if (arg0 == 116) {
                    int var6 = class660.field9039.field1250;
                    if (~class97.field1168 != -2 && ~class419.field5919 == 0) {
                        int var7 = class469.method2798(101, class32.field426, class526.field7430, class511.field7303);
                        if (-class155.field2169 + var7 < 3200 && ~(4 & class651.field8948[class526.field7430][class511.field7303 >> 9][class32.field426 >> 9]) != -1) {
                            class350.method2260(class553.field7776, class32.field426 >> 9, class511.field7303 >> 9, false, 1, 6721);
                            return;
                        }
                    } else {
                        if (class97.field1168 != 1) {
                            var5 = class419.field5919;
                            var6 = class218.field2850;
                        }
                        if ((4 & class651.field8948[class526.field7430][var5 >> 9][var6 >> 9]) != 0) {
                            class350.method2260(class553.field7776, var6 >> 9, var5 >> 9, false, 0, arg0 + 6605);
                        }
                        if (~class187.field2514 <= -2561) {
                            return;
                        }
                        int var8 = class511.field7303 >> 9;
                        int var9 = class32.field426 >> 9;
                        int var10 = var5 >> 9;
                        int var11 = var6 >> 9;
                        int var12;
                        if (~var10 >= ~var8) {
                            var12 = -var10 + var8;
                        } else {
                            var12 = -var8 + var10;
                        }
                        int var13;
                        if (~var9 > ~var11) {
                            var13 = var11 - var9;
                        } else {
                            var13 = -var11 + var9;
                        }
                        if (var12 == 0 && var13 == 0 || -class336.field4683 >= var12 || var12 >= class336.field4683 || -class700.field9768 >= var13 || class700.field9768 <= var13) {
                            class248.method1583((byte) -104, "RC: " + var8 + "," + var9 + " " + var10 + "," + var11 + " " + class228.field3063 + "," + class3.field30, (Throwable) null);
                            return;
                        }
                        if (~var12 < ~var13) {
                            int var14 = var13 * 65536 / var12;
                            int var15 = 32768;
                            while (var8 != var10) {
                                if (~var8 <= ~var10) {
                                    if (~var8 < ~var10) {
                                        --var8;
                                    }
                                } else {
                                    ++var8;
                                }
                                if ((class651.field8948[class526.field7430][var8][var9] & 4) != 0) {
                                    class350.method2260(class553.field7776, var9, var8, false, 1, arg0 + 6605);
                                    return;
                                }
                                var15 += var14;
                                if (~var15 <= -65537) {
                                    if (var9 >= var11) {
                                        if (~var9 < ~var11) {
                                            --var9;
                                        }
                                    } else {
                                        ++var9;
                                    }
                                    var15 -= 65536;
                                    if (~(4 & class651.field8948[class526.field7430][var8][var9]) != -1) {
                                        class350.method2260(class553.field7776, var9, var8, false, 1, arg0 + 6605);
                                        return;
                                    }
                                }
                            }
                            return;
                        }
                        int var16 = var12 * 65536 / var13;
                        int var17 = 32768;
                        while (var9 != var11) {
                            if (var9 >= var11) {
                                if (~var11 > ~var9) {
                                    --var9;
                                }
                            } else {
                                ++var9;
                            }
                            if ((class651.field8948[class526.field7430][var8][var9] & 4) != 0) {
                                class350.method2260(class553.field7776, var9, var8, false, 1, arg0 ^ 6709);
                                return;
                            }
                            var17 += var16;
                            if (var17 >= 65536) {
                                var17 -= 65536;
                                if (var8 < var10) {
                                    ++var8;
                                } else if (~var8 < ~var10) {
                                    --var8;
                                }
                                if (~(class651.field8948[class526.field7430][var8][var9] & 4) != -1) {
                                    class350.method2260(class553.field7776, var9, var8, false, 1, 6721);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ut", name = "c", descriptor = "(II)V")
    public static final void method840(int arg0, int arg1) {
        ++field1485;
        int var2 = -102 / ((arg0 - 2) / 46);
        class592 var3 = class682.method3825(-652872096, 2, arg1);
        var3.method3350(0);
    }

    @OriginalMember(owner = "client!ut", name = "<init>", descriptor = "()V")
    public class123() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(IZ)[I")
    public final int[] method24(int arg0, boolean arg1) {
        ++field1466;
        int[] var3 = super.field673.method3270(arg0, (byte) -42);
        if (!arg1) {
            return null;
        } else {
            if (super.field673.field8073) {
                int var4 = 0;
                int var5;
                for (var5 = class720.field10000[arg0] + this.field1486; ~var5 > -1; var5 += 4096) {
                }
                while (~var5 < -4097) {
                    var5 -= 4096;
                }
                while (this.field1480 > var4 && var5 >= this.field1484[var4]) {
                    ++var4;
                }
                int var6 = var4 + -1;
                boolean var7 = (var4 & 1) == 0;
                int var8 = this.field1484[var4];
                int var9 = this.field1484[var4 + -1];
                if (var5 > this.field1465 + var9 && var5 < -this.field1465 + var8) {
                    for (int var10 = 0; ~var10 > ~class328.field4576; ++var10) {
                        int var11 = 0;
                        int var12 = var7 ? this.field1471 : -this.field1471;
                        int var13;
                        for (var13 = (this.field1467 * var12 >> 12) + class132.field1945[var10]; var13 < 0; var13 += 4096) {
                        }
                        while (~var13 < -4097) {
                            var13 -= 4096;
                        }
                        while (var11 < this.field1478 && ~this.field1489[var6][var11] >= ~var13) {
                            ++var11;
                        }
                        int var14 = var11 + -1;
                        int var15 = this.field1489[var6][var14];
                        int var16 = this.field1489[var6][var11];
                        if (this.field1465 + var15 < var13 && ~(-this.field1465 + var16) < ~var13) {
                            var3[var10] = this.field1464[var6][var14];
                        } else {
                            var3[var10] = 0;
                        }
                    }
                } else {
                    class255.method1691(var3, 0, class328.field4576, 0);
                }
            }
            return var3;
        }
    }
}
