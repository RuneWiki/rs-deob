import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class63 {

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "[B")
    private byte[] field1515;

    @OriginalMember(owner = "client!gb", name = "n", descriptor = "[I")
    private int[] field1524;

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "[I")
    private int[] field1522;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "Ldd;")
    public static class35 field1514 = class180.method1196((byte) 127, "; version=1; path=)4; domain=");

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "I")
    public static volatile int field1518 = -1;

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "Ldd;")
    private static class35 field1521 = class180.method1196((byte) -27, "Use");

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "Ldd;")
    private static class35 field1523 = class180.method1196((byte) 127, "wishes to trade with you)3");

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "Ldd;")
    public static class35 field1517 = field1523;

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "Ldd;")
    public static class35 field1516 = field1521;

    @OriginalMember(owner = "client!gb", name = "p", descriptor = "[I")
    public static int[] field1526 = new int[128];

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
    public static int field1511;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
    public static int field1512;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
    public static int field1513;

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "I")
    public static int field1519;

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "I")
    public static int field1520;

    @OriginalMember(owner = "client!gb", name = "o", descriptor = "I")
    public static int field1525;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V")
    public static final void method523(int arg0) {
        if (arg0 != 0) {
            field1523 = null;
        }
        field1525++;
        if (class35.field781 && class175.field3585 != class152.field3160) {
            class73.method580(class71.field1704.field1603[0], 125, class175.field3585, class71.field1704.field1605[0], client.field632, class93.field2051);
        } else if (class99.field2173 != class175.field3585) {
            class99.field2173 = class175.field3585;
            class7.method34((byte) 19, class175.field3585);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lag;Lag;BLag;)V")
    public static final void method524(class8 arg0, class8 arg1, byte arg2, class8 arg3) {
        field1512++;
        class62.field1507 = arg0.method37(class55.field1342, (byte) -62);
        class107.field2394 = arg3.method37(class97.field2151, (byte) -62);
        class205.field4098 = arg3.method37(class88.field1972, (byte) -62);
        class130.field2803 = arg3.method37(class115.field2566, (byte) -62);
        class161.field3277 = arg3.method37(class79.field1851, (byte) -62);
        if (arg2 > -16) {
            field1518 = -103;
        }
        class178.field3663 = arg3.method37(class22.field452, (byte) -62);
        class133.field2847 = arg3.method37(class110.field2424, (byte) -62);
        class108.field2402 = arg3.method37(class123.field2698, (byte) -62);
        class176.field3600 = arg3.method37(class122.field2684, (byte) -62);
        class210.field4162 = arg3.method37(class138.field2946, (byte) -62);
        class110.field2425 = arg3.method37(class118.field2621, (byte) -62);
        class57.field1427 = arg1.method37(class95.field2092, (byte) -62);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(II[B[BII)I")
    public final int method525(int arg0, int arg1, byte[] arg2, byte[] arg3, int arg4, int arg5) {
        field1513++;
        if (~arg0 == arg1) {
            return 0;
        }
        int var7 = arg0 + arg5;
        int var8 = 0;
        int var9 = arg4;
        while (true) {
            byte var10 = arg3[var9];
            if (var10 >= 0) {
                var8++;
            } else {
                var8 = this.field1522[var8];
            }
            int var11;
            if ((var11 = this.field1522[var8]) < 0) {
                arg2[arg5++] = (byte) ~var11;
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field1522[var8];
            }
            int var12;
            if ((var12 = this.field1522[var8]) < 0) {
                arg2[arg5++] = (byte) ~var12;
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field1522[var8];
            }
            int var13;
            if ((var13 = this.field1522[var8]) < 0) {
                arg2[arg5++] = (byte) ~var13;
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field1522[var8];
            }
            int var14;
            if ((var14 = this.field1522[var8]) < 0) {
                arg2[arg5++] = (byte) ~var14;
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field1522[var8];
            }
            int var15;
            if ((var15 = this.field1522[var8]) < 0) {
                arg2[arg5++] = (byte) ~var15;
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field1522[var8];
            }
            int var16;
            if ((var16 = this.field1522[var8]) < 0) {
                arg2[arg5++] = (byte) ~var16;
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field1522[var8];
            }
            int var17;
            if ((var17 = this.field1522[var8]) < 0) {
                arg2[arg5++] = (byte) ~var17;
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field1522[var8];
            }
            int var18;
            if ((var18 = this.field1522[var8]) < 0) {
                arg2[arg5++] = (byte) ~var18;
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg4;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIZ)I")
    public static final int method526(int arg0, int arg1, boolean arg2) {
        if (arg1 > arg0) {
            int var3 = arg0;
            arg0 = arg1;
            arg1 = var3;
        }
        if (!arg2) {
            return -100;
        }
        field1519++;
        while (arg1 != 0) {
            int var4 = arg0 % arg1;
            arg0 = arg1;
            arg1 = var4;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)V")
    public static void method527(byte arg0) {
        field1516 = null;
        field1521 = null;
        field1517 = null;
        field1526 = null;
        field1523 = null;
        field1514 = null;
        if (arg0 != 60) {
            method526(-71, -7, true);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIZI[B[B)I")
    public final int method528(int arg0, int arg1, boolean arg2, int arg3, byte[] arg4, byte[] arg5) {
        field1520++;
        int var7 = arg0 + arg3;
        if (!arg2) {
            this.field1524 = null;
        }
        int var8 = 0;
        int var9 = arg1 << 3;
        while (arg0 < var7) {
            int var10 = arg4[arg0] & 0xFF;
            byte var11 = this.field1515[var10];
            int var12 = this.field1524[var10];
            if (var11 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            int var15 = var8 & -var14 >> 31;
            int var16 = var13 + (var11 + var14 - 1 >> 3);
            int var17 = var14 + 24;
            arg5[var13] = (byte) (var8 = class152.method1027(var15, var12 >>> var17));
            if (var16 > var13) {
                var13++;
                var14 = var17 - 8;
                arg5[var13] = (byte) (var8 = var12 >>> var14);
                if (var13 < var16) {
                    var13++;
                    var14 -= 8;
                    arg5[var13] = (byte) (var8 = var12 >>> var14);
                    if (var16 > var13) {
                        var14 -= 8;
                        var13++;
                        arg5[var13] = (byte) (var8 = var12 >>> var14);
                        if (var16 > var13) {
                            var13++;
                            var14 -= 8;
                            arg5[var13] = (byte) (var8 = var12 << -var14);
                        }
                    }
                }
            }
            var9 += var11;
            arg0++;
        }
        return (var9 + 7 >> 3) - arg1;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "([Ldd;B)Ldd;")
    public static final class35 method529(class35[] arg0, byte arg1) {
        field1511++;
        if (arg0.length < 2) {
            throw new IllegalArgumentException();
        }
        if (arg1 <= 49) {
            method526(-104, -113, false);
        }
        return class79.method598(arg0, arg0.length, 122, 0);
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "([B)V")
    public class63(byte[] arg0) {
        int var2 = arg0.length;
        this.field1515 = arg0;
        this.field1524 = new int[var2];
        this.field1522 = new int[8];
        int var3 = 0;
        int[] var4 = new int[33];
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var4[var6];
                this.field1524[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var4[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var11 & var12) != 0) {
                            var4[var10] = var4[var10 - 1];
                            break;
                        }
                        var4[var10] = class152.method1027(var12, var11);
                    }
                    var9 = var8 | var7;
                } else {
                    var9 = var4[var6 - 1];
                }
                var4[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var4[var13] == var8) {
                        var4[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field1522[var14] == 0) {
                            this.field1522[var14] = var3;
                        }
                        var14 = this.field1522[var14];
                    }
                    if (this.field1522.length <= var14) {
                        int[] var17 = new int[this.field1522.length * 2];
                        for (int var18 = 0; var18 < this.field1522.length; var18++) {
                            var17[var18] = this.field1522[var18];
                        }
                        this.field1522 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                this.field1522[var14] = ~var5;
                if (var14 >= var3) {
                    var3 = var14 + 1;
                }
            }
        }
    }
}
