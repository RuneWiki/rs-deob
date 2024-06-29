import java.awt.Image;
import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class86 {

    @OriginalMember(owner = "client!p", name = "f", descriptor = "Lwa;")
    private class139 field1685 = null;

    @OriginalMember(owner = "client!p", name = "g", descriptor = "I")
    private int field1686 = 65000;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "Lwa;")
    private class139 field1683 = null;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "I")
    private int field1681;

    @OriginalMember(owner = "client!p", name = "h", descriptor = "Lr;")
    public static class66 field1687 = class93.method641(43, "(U1");

    @OriginalMember(owner = "client!p", name = "e", descriptor = "B")
    public static byte field1684 = 0;

    @OriginalMember(owner = "client!p", name = "i", descriptor = "Lr;")
    public static class66 field1688 = class93.method641(43, "(U3");

    @OriginalMember(owner = "client!p", name = "a", descriptor = "Lr;")
    public static class66 field1680 = class93.method641(43, "m-Ochte mit Ihnen handeln)3");

    @OriginalMember(owner = "client!p", name = "k", descriptor = "Lr;")
    public static class66 field1690 = class93.method641(43, "<br>(X");

    @OriginalMember(owner = "client!p", name = "c", descriptor = "I")
    public static int field1682;

    @OriginalMember(owner = "client!p", name = "j", descriptor = "I")
    public static int field1689;

    @OriginalMember(owner = "client!p", name = "m", descriptor = "I")
    public static int field1692;

    @OriginalMember(owner = "client!p", name = "n", descriptor = "I")
    public static int field1693;

    @OriginalMember(owner = "client!p", name = "o", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!p", name = "p", descriptor = "I")
    public static int field1695;

    @OriginalMember(owner = "client!p", name = "q", descriptor = "I")
    public static int field1696;

    @OriginalMember(owner = "client!p", name = "r", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!p", name = "s", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!p", name = "l", descriptor = "Ljava/awt/Image;")
    public static Image field1691;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(III)V")
    public static final void method604(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class131.field2449; var3++) {
            for (int var4 = 0; var4 < class40.field629; var4++) {
                for (int var5 = 0; var5 < class11.field136; var5++) {
                    class16 var6 = class110.field2124[var3][var4][var5];
                    if (var6 != null) {
                        class47 var7 = var6.field205;
                        if (var7 != null && var7.field849.method87()) {
                            class219.method1403(var7.field849, var3, var4, var5, 1, 1);
                            if (var7.field852 != null && var7.field852.method87()) {
                                class219.method1403(var7.field852, var3, var4, var5, 1, 1);
                                var7.field849.method82(var7.field852, 0, 0, 0, false);
                                var7.field852 = var7.field852.method86(arg0, arg1, arg2);
                            }
                            var7.field849 = var7.field849.method86(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field219; var8++) {
                            class44 var10 = var6.field220[var8];
                            if (var10 != null && var10.field779.method87()) {
                                class219.method1403(var10.field779, var3, var4, var5, var10.field775 + 1 - var10.field791, var10.field771 - var10.field790 + 1);
                                var10.field779 = var10.field779.method86(arg0, arg1, arg2);
                            }
                        }
                        class90 var9 = var6.field225;
                        if (var9 != null && var9.field1734.method87()) {
                            class26.method112(var9.field1734, var3, var4, var5);
                            var9.field1734 = var9.field1734.method86(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIZII)V")
    public static final void method605(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field1698++;
        class194.method1266(arg1 - arg4, (byte) -17, arg5, class15.field183[arg2], arg1 + arg4);
        int var6 = arg0;
        int var7 = arg4 * arg4;
        int var8 = 0;
        int var9 = arg0 * arg0;
        int var10 = var9 << 1;
        int var11 = var7 << 1;
        int var12 = arg0 << 1;
        if (!arg3) {
            field1691 = null;
        }
        int var13 = (1 - var12) * var7 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var7 << 2;
        int var16 = var9 << 2;
        int var17 = ((var8 << 1) + 3) * var10;
        int var18 = (arg0 - 1) * var15;
        int var19 = (var8 + 1) * var16;
        int var20 = ((arg0 << 1) - 3) * var11;
        while (var6 > 0) {
            var6--;
            if (var13 < 0) {
                while (var13 < 0) {
                    var8++;
                    var14 += var19;
                    var19 += var16;
                    var13 += var17;
                    var17 += var16;
                }
            }
            int var21 = arg2 - var6;
            if (var14 < 0) {
                var8++;
                var14 += var19;
                var13 += var17;
                var17 += var16;
                var19 += var16;
            }
            int var22 = arg1 + var8;
            int var23 = arg1 - var8;
            class194.method1266(var23, (byte) -17, arg5, class15.field183[var21], var22);
            var13 += -var18;
            var18 -= var15;
            var14 += -var20;
            var20 -= var15;
            int var24 = arg2 + var6;
            class194.method1266(var23, (byte) -17, arg5, class15.field183[var24], var22);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method606(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1695++;
        class14 var10 = null;
        if (arg1 != 0) {
            method610(-51, 16, 10, 40, -61, (byte[][][]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, -61, (byte) 4, 55, -127);
        }
        for (class14 var11 = (class14) class180.field3146.method873((byte) 76); var11 != null; var11 = (class14) class180.field3146.method870((byte) 14)) {
            if (var11.field173 == arg7 && var11.field175 == arg0 && var11.field168 == arg4 && var11.field170 == arg3) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class14();
            var10.field170 = arg3;
            var10.field175 = arg0;
            var10.field173 = arg7;
            var10.field168 = arg4;
            class31.method176(var10, true);
            class180.field3146.method866(var10, true);
        }
        var10.field179 = arg2;
        var10.field174 = arg5;
        var10.field181 = arg9;
        var10.field178 = arg8;
        var10.field171 = arg6;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(B)V")
    public static void method607(byte arg0) {
        field1688 = null;
        field1691 = null;
        field1690 = null;
        if (arg0 < 99) {
            method612(124, 7, 65);
        }
        field1687 = null;
        field1680 = null;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IBI[BZ)Z")
    private final boolean method608(int arg0, byte arg1, int arg2, byte[] arg3, boolean arg4) {
        field1694++;
        class139 var6 = this.field1685;
        synchronized (this.field1685) {
            try {
                int var8;
                if (arg4) {
                    if (this.field1683.method958((byte) 90) < (long) (arg2 * 6 + 6)) {
                        return false;
                    }
                    this.field1683.method964((long) (arg2 * 6), 1);
                    this.field1683.method965(0, 6, 0, class252.field4429);
                    var8 = (class252.field4429[5] & 0xFF) + ((class252.field4429[4] & 0xFF) << 8) + (class252.field4429[3] & 0xFF << 16);
                    if (var8 <= 0 || (long) var8 > this.field1685.method958((byte) 75) / 520L) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field1685.method958((byte) 51) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class252.field4429[1] = (byte) (arg0 >> 8);
                class252.field4429[2] = (byte) arg0;
                class252.field4429[5] = (byte) var8;
                class252.field4429[0] = (byte) (arg0 >> 16);
                class252.field4429[3] = (byte) (var8 >> 16);
                class252.field4429[4] = (byte) (var8 >> 8);
                this.field1683.method964((long) (arg2 * 6), 1);
                this.field1683.method959(6, 0, 0, class252.field4429);
                int var10 = -90 % ((40 - arg1) / 54);
                int var11 = 0;
                int var12 = 0;
                while (arg0 > var11) {
                    int var13 = 0;
                    if (arg4) {
                        label104: {
                            this.field1685.method964((long) (var8 * 520), 1);
                            try {
                                this.field1685.method965(0, 8, 0, class252.field4429);
                            } catch (EOFException var34) {
                                return true;
                            }
                            int var14 = ((class252.field4429[0] & 0xFF) << 8) + (class252.field4429[1] & 0xFF);
                            var13 = (class252.field4429[4] & 0xFF << 16) + (class252.field4429[6] & 0xFF) + (class252.field4429[5] & 0xFF << 8);
                            int var15 = class252.field4429[7] & 0xFF;
                            int var16 = ((class252.field4429[2] & 0xFF) << 8) + (class252.field4429[3] & 0xFF);
                            if (arg2 == var14 && var12 == var16 && this.field1681 == var15) {
                                if (var13 >= 0 && ((long) var13) <= (this.field1685.method958((byte) 116) / 520L)) {
                                    break label104;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var13 == 0) {
                        arg4 = false;
                        var13 = (int) ((this.field1685.method958((byte) 82) + 519L) / 520L);
                        if (var13 == 0) {
                            var13++;
                        }
                        if (var8 == var13) {
                            var13++;
                        }
                    }
                    class252.field4429[0] = (byte) (arg2 >> 8);
                    class252.field4429[2] = (byte) (var12 >> 8);
                    class252.field4429[7] = (byte) this.field1681;
                    class252.field4429[1] = (byte) arg2;
                    if ((arg0 - var11) <= 512) {
                        var13 = 0;
                    }
                    class252.field4429[6] = (byte) var13;
                    class252.field4429[5] = (byte) (var13 >> 8);
                    class252.field4429[3] = (byte) var12;
                    int var19 = arg0 - var11;
                    class252.field4429[4] = (byte) (var13 >> 16);
                    var12++;
                    if (var19 > 512) {
                        var19 = 512;
                    }
                    this.field1685.method964((long) (var8 * 520), 1);
                    this.field1685.method959(8, 0, 0, class252.field4429);
                    var8 = var13;
                    this.field1685.method959(var19, 0, var11, arg3);
                    var11 += var19;
                }
                return true;
            } catch (IOException var35) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "([BIIB)Z")
    public final boolean method609(byte[] arg0, int arg1, int arg2, byte arg3) {
        field1693++;
        class139 var5 = this.field1685;
        synchronized (this.field1685) {
            if (arg2 < 0 || this.field1686 < arg2) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method608(arg2, (byte) 123, arg1, arg0, true);
            if (!var6) {
                var6 = this.method608(arg2, (byte) -109, arg1, arg0, false);
            }
            int var7 = -116 % ((arg3 + 61) / 47);
            return var6;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V")
    public static final void method610(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class40.field629 * 128) {
            arg0 = class40.field629 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class11.field136 * 128) {
            arg2 = class11.field136 * 128 - 1;
        }
        class160.field2875 = class123.field2314[arg3];
        class218.field3752 = class123.field2326[arg3];
        class167.field3001 = class123.field2314[arg4];
        class125.field2370 = class123.field2326[arg4];
        class171.field3036 = arg0;
        class142.field2603 = arg1;
        class30.field455 = arg2;
        class256.field4504 = arg0 / 128;
        class254.field4452 = arg2 / 128;
        class44.field776 = class256.field4504 - class94.field1818;
        if (class44.field776 < 0) {
            class44.field776 = 0;
        }
        class192.field3329 = class254.field4452 - class94.field1818;
        if (class192.field3329 < 0) {
            class192.field3329 = 0;
        }
        class98.field1920 = class94.field1818 + class256.field4504;
        if (class98.field1920 > class40.field629) {
            class98.field1920 = class40.field629;
        }
        class64.field1271 = class94.field1818 + class254.field4452;
        if (class64.field1271 > class11.field136) {
            class64.field1271 = class11.field136;
        }
        short var15 = 3500;
        for (int var16 = 0; var16 < class94.field1818 + class94.field1818 + 2; var16++) {
            for (int var19 = 0; var19 < class94.field1818 + class94.field1818 + 2; var19++) {
                int var20 = (var16 - class94.field1818 << 7) - (class171.field3036 & 0x7F);
                int var21 = (var19 - class94.field1818 << 7) - (class30.field455 & 0x7F);
                int var22 = class256.field4504 + var16 - class94.field1818;
                int var23 = class254.field4452 + var19 - class94.field1818;
                if (var22 >= 0 && var23 >= 0 && var22 < class40.field629 && var23 < class11.field136) {
                    int var24;
                    if (class70.field1409 == null) {
                        var24 = class250.field4412[0][var22][var23] + 128 - class142.field2603;
                    } else {
                        var24 = class70.field1409[0][var22][var23] + 128 - class142.field2603;
                    }
                    int var25 = class250.field4412[3][var22][var23] - class142.field2603 - 1000;
                    class105.field2031[var16][var19] = class30.method168(var20, var25, var24, var21, var15);
                } else {
                    class105.field2031[var16][var19] = false;
                }
            }
        }
        for (int var17 = 0; var17 < class94.field1818 + class94.field1818 + 1; var17++) {
            for (int var18 = 0; var18 < class94.field1818 + class94.field1818 + 1; var18++) {
                class35.field522[var17][var18] = class105.field2031[var17][var18] || class105.field2031[var17 + 1][var18] || class105.field2031[var17][var18 + 1] || class105.field2031[var17 + 1][var18 + 1];
            }
        }
        class150.field2698 = arg6;
        class15.field188 = arg7;
        class224.field3818 = arg8;
        class82.field1596 = arg9;
        class190.field3286 = arg10;
        class41.method273();
        class203.method1316(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(B)V")
    public static final void method611(byte arg0) {
        if (arg0 >= -1) {
            method605(125, 31, 8, true, -92, -128);
        }
        for (int var1 = 0; var1 < class240.field4170; var1++) {
            int var2 = class83.field1599[var1];
            class37 var3 = class178.field3112[var2];
            int var4 = class84.field1627.method1677(-6677);
            if ((var4 & 0x10) != 0) {
                var3.field2041 = class84.field1627.method1674(1355769544);
                if (var3.field2041 == 65535) {
                    var3.field2041 = -1;
                }
            }
            if ((var4 & 0x8) != 0) {
                if (var3.field548.method1336(0)) {
                    class59.method390(var3, 2);
                }
                var3.field548 = class96.method665(class84.field1627.method1636(119), 18);
                var3.field2046 = var3.field548.field3519;
                var3.field2081 = var3.field548.field3577;
                var3.field2090 = var3.field548.field3557;
                var3.field2059 = var3.field548.field3550;
                var3.field2048 = var3.field548.field3520;
                var3.field2080 = var3.field548.field3531;
                var3.field2097 = var3.field548.field3566;
                var3.field2060 = var3.field548.field3561;
                var3.field2079 = var3.field548.field3525;
                if (var3.field548.method1336(0)) {
                    class242.method1596(19395, var3.field2086[0], var3, (class231) null, 0, var3.field2039[0], class196.field3401, (class45) null);
                }
            }
            if ((var4 & 0x40) != 0) {
                var3.field2092 = class84.field1627.method1637(127);
                var3.field2085 = 100;
            }
            if ((var4 & 0x1) != 0) {
                int var5 = class84.field1627.method1642(-15046);
                if (var5 == 65535) {
                    var5 = -1;
                }
                int var6 = class84.field1627.method1677(-6677);
                class67.method495(0, var5, var3, var6);
            }
            if ((var4 & 0x2) != 0) {
                var3.field2068 = class84.field1627.method1642(-15046);
                int var7 = class84.field1627.method1659(false);
                var3.field2057 = (var7 & 0xFFFF) + class75.field1501;
                var3.field2102 = 0;
                if (var3.field2068 == 65535) {
                    var3.field2068 = -1;
                }
                var3.field2076 = var7 >> 16;
                var3.field2094 = 0;
                if (class75.field1501 < var3.field2057) {
                    var3.field2094 = -1;
                }
            }
            if ((var4 & 0x20) != 0) {
                int var8 = class84.field1627.method1677(-6677);
                int var9 = class84.field1627.method1676(70);
                var3.method733(var8, false, class75.field1501, var9);
            }
            if ((var4 & 0x80) != 0) {
                var3.field2042 = class84.field1627.method1642(-15046);
                var3.field2088 = class84.field1627.method1690((byte) -47);
            }
            if ((var4 & 0x4) != 0) {
                int var10 = class84.field1627.method1677(-6677);
                int var11 = class84.field1627.method1677(-6677);
                var3.method733(var10, false, class75.field1501, var11);
                var3.field2050 = class75.field1501 + 300;
                var3.field2063 = class84.field1627.method1676(101);
            }
        }
        field1692++;
    }

    @OriginalMember(owner = "client!p", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1697++;
        return "Cache:" + this.field1681;
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(III)J")
    public static final long method612(int arg0, int arg1, int arg2) {
        class16 var3 = class110.field2124[arg0][arg1][arg2];
        return var3 == null || var3.field225 == null ? 0L : var3.field225.field1746;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IZ)[B")
    public final byte[] method613(int arg0, boolean arg1) {
        field1696++;
        class139 var3 = this.field1685;
        synchronized (this.field1685) {
            try {
                if (this.field1683.method958((byte) 101) < (long) (arg0 * 6 + 6)) {
                    return null;
                }
                this.field1683.method964((long) (arg0 * 6), 1);
                this.field1683.method965(0, 6, 0, class252.field4429);
                int var5 = (class252.field4429[1] & 0xFF << 8) + (((class252.field4429[0] & 0xFF) << 16) + (class252.field4429[2] & 0xFF));
                int var6 = ((class252.field4429[4] & 0xFF) << 8) + (class252.field4429[3] & 0xFF << 16) + (class252.field4429[5] & 0xFF);
                if (!arg1) {
                    return null;
                } else if (var5 < 0 || this.field1686 < var5) {
                    return null;
                } else if (var6 > 0 && (this.field1685.method958((byte) 104) / 520L) >= ((long) var6)) {
                    byte[] var10 = new byte[var5];
                    int var11 = 0;
                    int var12 = 0;
                    while (var5 > var11) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field1685.method964((long) (var6 * 520), 1);
                        int var14 = var5 - var11;
                        if (var14 > 512) {
                            var14 = 512;
                        }
                        this.field1685.method965(0, var14 + 8, 0, class252.field4429);
                        int var15 = (class252.field4429[6] & 0xFF) + ((class252.field4429[4] & 0xFF << 16) + (class252.field4429[5] & 0xFF << 8));
                        int var16 = ((class252.field4429[0] & 0xFF) << 8) + (class252.field4429[1] & 0xFF);
                        int var17 = ((class252.field4429[2] & 0xFF) << 8) + (class252.field4429[3] & 0xFF);
                        int var18 = class252.field4429[7] & 0xFF;
                        if (arg0 == var16 && var12 == var17 && this.field1681 == var18) {
                            if (var15 >= 0 && (long) var15 <= this.field1685.method958((byte) 67) / 520L) {
                                var6 = var15;
                                for (int var21 = 0; var21 < var14; var21++) {
                                    var10[var11++] = class252.field4429[var21 + 8];
                                }
                                var12++;
                                continue;
                            }
                            return null;
                        }
                        return null;
                    }
                    return var10;
                } else {
                    return null;
                }
            } catch (IOException var42) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "([BZ)[B")
    public static final byte[] method614(byte[] arg0, boolean arg1) {
        int var2 = arg0.length;
        field1682++;
        byte[] var3 = new byte[var2];
        if (arg1) {
            method614((byte[]) null, true);
        }
        class46.method331(arg0, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(ILwa;Lwa;I)V")
    public class86(int arg0, class139 arg1, class139 arg2, int arg3) {
        this.field1681 = arg0;
        this.field1686 = arg3;
        this.field1683 = arg2;
        this.field1685 = arg1;
    }
}
