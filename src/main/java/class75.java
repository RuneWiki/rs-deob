import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class75 {

    @OriginalMember(owner = "client!mc", name = "n", descriptor = "[I")
    private int[] field1669;

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "[I")
    private int[] field1665;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "[B")
    private byte[] field1660;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "I")
    public static int field1664 = 0;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
    public static volatile int field1656 = 0;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "Lle;")
    public static class71 field1659 = new class71(100);

    @OriginalMember(owner = "client!mc", name = "s", descriptor = "I")
    public static int field1674 = 0;

    @OriginalMember(owner = "client!mc", name = "t", descriptor = "J")
    public static volatile long field1675 = 0L;

    @OriginalMember(owner = "client!mc", name = "q", descriptor = "Lrc;")
    public static class105 field1672 = class43.method374("Geben Sie Ihren Benutzernamen", 0);

    @OriginalMember(owner = "client!mc", name = "r", descriptor = "Lb;")
    public static class7 field1673 = new class7(new byte[5000]);

    @OriginalMember(owner = "client!mc", name = "w", descriptor = "Lrc;")
    public static class105 field1678 = class43.method374("@cya@", 0);

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
    public static int field1657;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "I")
    public static int field1661;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "I")
    public static int field1667;

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "I")
    public static int field1670;

    @OriginalMember(owner = "client!mc", name = "p", descriptor = "I")
    public static int field1671;

    @OriginalMember(owner = "client!mc", name = "u", descriptor = "Lfc;")
    public static class34 field1676;

    @OriginalMember(owner = "client!mc", name = "v", descriptor = "Z")
    public static boolean field1677;

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "[Leb;")
    public static class27[] field1668;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I[BBI[BI)I", line = 13)
    public final int method630(int arg0, byte[] arg1, byte arg2, int arg3, byte[] arg4, int arg5) {
        int var7 = arg0 + arg3;
        if (arg2 <= 16) {
            method638(14);
        }
        int var8 = 0;
        int var9 = arg5 << 3;
        field1658++;
        while (var7 > arg3) {
            int var10 = arg1[arg3] & 0xFF;
            int var11 = this.field1669[var10];
            byte var12 = this.field1660[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            int var15 = var8 & -var14 >> 31;
            int var16 = (var14 + var12 - 1 >> 3) + var13;
            int var17 = var14 + 24;
            arg4[var13] = (byte) (var8 = class14.method156(var15, var11 >>> var17));
            if (var13 < var16) {
                var13++;
                var14 = var17 - 8;
                arg4[var13] = (byte) (var8 = var11 >>> var14);
                if (var13 < var16) {
                    var13++;
                    var14 -= 8;
                    arg4[var13] = (byte) (var8 = var11 >>> var14);
                    if (var16 > var13) {
                        var14 -= 8;
                        var13++;
                        arg4[var13] = (byte) (var8 = var11 >>> var14);
                        if (var13 < var16) {
                            var13++;
                            var14 -= 8;
                            arg4[var13] = (byte) (var8 = var11 << -var14);
                        }
                    }
                }
            }
            var9 += var12;
            arg3++;
        }
        return (var9 + 7 >> 3) - arg5;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V", line = 90)
    public static void method631(int arg0) {
        field1673 = null;
        field1672 = null;
        field1678 = null;
        field1659 = null;
        int var1 = 62 / ((-arg0 - 32) / 50);
        field1668 = null;
        field1676 = null;
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)V", line = 111)
    public static final void method632(int arg0) {
        for (class81 var1 = (class81) class108.field2480.method31(1280); var1 != null; var1 = (class81) class108.field2480.method26((byte) 108)) {
            if (var1.field1828 != null) {
                class34.field787.method1009(var1.field1828);
                var1.field1828 = null;
            }
            if (var1.field1809 != null) {
                class34.field787.method1009(var1.field1809);
                var1.field1809 = null;
            }
        }
        field1663++;
        class108.field2480.method24(1633);
        if (arg0 <= 67) {
            method636(-83, 5);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "([BIIIB[B)I", line = 143)
    public final int method633(byte[] arg0, int arg1, int arg2, int arg3, byte arg4, byte[] arg5) {
        field1657++;
        if (arg1 == 0) {
            return 0;
        } else if (arg4 == 92) {
            int var7 = 0;
            int var8 = arg1 + arg2;
            int var9 = arg3;
            while (true) {
                byte var10 = arg5[var9];
                if (var10 >= 0) {
                    var7++;
                } else {
                    var7 = this.field1665[var7];
                }
                int var11;
                if ((var11 = this.field1665[var7]) < 0) {
                    arg0[arg2++] = (byte) ~var11;
                    if (var8 <= arg2) {
                        break;
                    }
                    var7 = 0;
                }
                if ((var10 & 0x40) == 0) {
                    var7++;
                } else {
                    var7 = this.field1665[var7];
                }
                int var12;
                if ((var12 = this.field1665[var7]) < 0) {
                    arg0[arg2++] = (byte) ~var12;
                    if (arg2 >= var8) {
                        break;
                    }
                    var7 = 0;
                }
                if ((var10 & 0x20) == 0) {
                    var7++;
                } else {
                    var7 = this.field1665[var7];
                }
                int var13;
                if ((var13 = this.field1665[var7]) < 0) {
                    arg0[arg2++] = (byte) ~var13;
                    if (arg2 >= var8) {
                        break;
                    }
                    var7 = 0;
                }
                if ((var10 & 0x10) == 0) {
                    var7++;
                } else {
                    var7 = this.field1665[var7];
                }
                int var14;
                if ((var14 = this.field1665[var7]) < 0) {
                    arg0[arg2++] = (byte) ~var14;
                    if (var8 <= arg2) {
                        break;
                    }
                    var7 = 0;
                }
                if ((var10 & 0x8) == 0) {
                    var7++;
                } else {
                    var7 = this.field1665[var7];
                }
                int var15;
                if ((var15 = this.field1665[var7]) < 0) {
                    arg0[arg2++] = (byte) ~var15;
                    if (arg2 >= var8) {
                        break;
                    }
                    var7 = 0;
                }
                if ((var10 & 0x4) == 0) {
                    var7++;
                } else {
                    var7 = this.field1665[var7];
                }
                int var16;
                if ((var16 = this.field1665[var7]) < 0) {
                    arg0[arg2++] = (byte) ~var16;
                    if (var8 <= arg2) {
                        break;
                    }
                    var7 = 0;
                }
                if ((var10 & 0x2) == 0) {
                    var7++;
                } else {
                    var7 = this.field1665[var7];
                }
                int var17;
                if ((var17 = this.field1665[var7]) < 0) {
                    arg0[arg2++] = (byte) ~var17;
                    if (arg2 >= var8) {
                        break;
                    }
                    var7 = 0;
                }
                if ((var10 & 0x1) == 0) {
                    var7++;
                } else {
                    var7 = this.field1665[var7];
                }
                int var18;
                if ((var18 = this.field1665[var7]) < 0) {
                    arg0[arg2++] = (byte) ~var18;
                    if (var8 <= arg2) {
                        break;
                    }
                    var7 = 0;
                }
                var9++;
            }
            return var9 + 1 - arg3;
        } else {
            return 70;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(JI)V", line = 297)
    public static final void method634(long arg0, int arg1) {
        if (arg1 != 20306) {
            field1673 = null;
        }
        field1670++;
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            class106.method866(false, arg0 - 1L);
            class106.method866(false, 1L);
        } else {
            class106.method866(false, arg0);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)Lsa;", line = 318)
    public static final class109 method635(int arg0, int arg1) {
        if (arg1 != 3) {
            field1678 = null;
        }
        class109 var2 = (class109) class22.field532.method601((long) arg0, (byte) 118);
        field1662++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class117.field2746.method766(arg0, (byte) -45, 3);
        class109 var4 = new class109();
        if (var3 != null) {
            var4.method881((byte) -93, new class7(var3));
        }
        class22.field532.method608((long) arg0, var4, (byte) 121);
        return var4;
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(II)Lf;", line = 357)
    public static final class31 method636(int arg0, int arg1) {
        field1667++;
        class31 var2 = (class31) class29.field656.method601((long) arg0, (byte) 118);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class111.field2615.method766(arg0, (byte) -45, 10);
        class31 var4 = new class31();
        var4.field751 = arg0;
        if (var3 != null) {
            var4.method297(new class7(var3), arg1 ^ 0xFFFFE10E);
        }
        var4.method301(arg1 ^ 0xFFFFFFA4);
        if (~var4.field736 != arg1) {
            var4.method302(true, method636(var4.field736, 0), method636(var4.field722, 0));
        }
        if (!class78.field1752 && var4.field731) {
            var4.field710 = null;
            var4.field749 = null;
            var4.field706 = class36.field827;
            var4.field752 = 0;
        }
        class29.field656.method608((long) arg0, var4, (byte) 125);
        return var4;
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(II)Lrc;", line = 393)
    public static final class105 method637(int arg0, int arg1) {
        if (arg1 != 8241) {
            field1668 = null;
        }
        field1661++;
        return class84.method704(arg0, -98, 10, false);
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(I)Z", line = 405)
    public static final boolean method638(int arg0) {
        if (arg0 != -12164) {
            field1659 = null;
        }
        field1671++;
        return class74.field1634 != null;
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "([B)V", line = 426)
    public class75(byte[] arg0) {
        int var2 = arg0.length;
        this.field1669 = new int[var2];
        this.field1665 = new int[8];
        int var3 = 0;
        int[] var4 = new int[33];
        this.field1660 = arg0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var4[var6];
                this.field1669[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
                    var9 = var8 | var7;
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var4[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var12 & var11) != 0) {
                            var4[var10] = var4[var10 - 1];
                            break;
                        }
                        var4[var10] = class14.method156(var11, var12);
                    }
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
                        if (this.field1665[var14] == 0) {
                            this.field1665[var14] = var3;
                        }
                        var14 = this.field1665[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (this.field1665.length <= var14) {
                        int[] var18 = new int[this.field1665.length * 2];
                        for (int var19 = 0; var19 < this.field1665.length; var19++) {
                            var18[var19] = this.field1665[var19];
                        }
                        this.field1665 = var18;
                    }
                }
                if (var3 <= var14) {
                    var3 = var14 + 1;
                }
                this.field1665[var14] = ~var5;
            }
        }
    }
}
