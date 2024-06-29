import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class36 {

    @OriginalMember(owner = "client!f", name = "b", descriptor = "[B")
    private byte[] field937;

    @OriginalMember(owner = "client!f", name = "q", descriptor = "[I")
    private int[] field952;

    @OriginalMember(owner = "client!f", name = "f", descriptor = "[I")
    private int[] field941;

    @OriginalMember(owner = "client!f", name = "o", descriptor = "I")
    public static int field950 = 0;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "Lic;")
    public static class59 field938 = class59.method433(0, "Lade Konfiguration )2 ");

    @OriginalMember(owner = "client!f", name = "t", descriptor = "I")
    public static int field955 = 0;

    @OriginalMember(owner = "client!f", name = "v", descriptor = "Lic;")
    private static class59 field957 = class59.method433(0, "New User");

    @OriginalMember(owner = "client!f", name = "w", descriptor = "Lic;")
    public static class59 field958 = field957;

    @OriginalMember(owner = "client!f", name = "p", descriptor = "Lic;")
    public static class59 field951 = class59.method433(0, "::gc");

    @OriginalMember(owner = "client!f", name = "j", descriptor = "Lic;")
    public static class59 field945 = class59.method433(0, "_");

    @OriginalMember(owner = "client!f", name = "i", descriptor = "Lic;")
    private static class59 field944 = class59.method433(0, "purple:");

    @OriginalMember(owner = "client!f", name = "u", descriptor = "Lic;")
    public static class59 field956 = field944;

    @OriginalMember(owner = "client!f", name = "r", descriptor = "Lic;")
    public static class59 field953 = null;

    @OriginalMember(owner = "client!f", name = "s", descriptor = "Lic;")
    public static class59 field954 = field944;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "I")
    public static int field939;

    @OriginalMember(owner = "client!f", name = "e", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!f", name = "g", descriptor = "I")
    public static int field942;

    @OriginalMember(owner = "client!f", name = "h", descriptor = "I")
    public static int field943;

    @OriginalMember(owner = "client!f", name = "k", descriptor = "I")
    public static int field946;

    @OriginalMember(owner = "client!f", name = "m", descriptor = "I")
    public static int field948;

    @OriginalMember(owner = "client!f", name = "n", descriptor = "I")
    public static int field949;

    @OriginalMember(owner = "client!f", name = "x", descriptor = "I")
    public static int field959;

    @OriginalMember(owner = "client!f", name = "y", descriptor = "I")
    public static int field960;

    @OriginalMember(owner = "client!f", name = "l", descriptor = "[Lce;")
    public static class20[] field947;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IB[BII[B)I")
    public final int method272(int arg0, byte arg1, byte[] arg2, int arg3, int arg4, byte[] arg5) {
        field948++;
        if (arg4 == 0) {
            return 0;
        }
        int var7 = arg3 + arg4;
        int var8 = 0;
        if (arg1 >= -29) {
            method280(true);
        }
        int var9 = arg0;
        while (true) {
            byte var10 = arg2[var9];
            if (var10 >= 0) {
                var8++;
            } else {
                var8 = this.field941[var8];
            }
            int var11;
            if ((var11 = this.field941[var8]) < 0) {
                arg5[arg3++] = (byte) ~var11;
                if (var7 <= arg3) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field941[var8];
            }
            int var12;
            if ((var12 = this.field941[var8]) < 0) {
                arg5[arg3++] = (byte) ~var12;
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field941[var8];
            }
            int var13;
            if ((var13 = this.field941[var8]) < 0) {
                arg5[arg3++] = (byte) ~var13;
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field941[var8];
            }
            int var14;
            if ((var14 = this.field941[var8]) < 0) {
                arg5[arg3++] = (byte) ~var14;
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field941[var8];
            }
            int var15;
            if ((var15 = this.field941[var8]) < 0) {
                arg5[arg3++] = (byte) ~var15;
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field941[var8];
            }
            int var16;
            if ((var16 = this.field941[var8]) < 0) {
                arg5[arg3++] = (byte) ~var16;
                if (var7 <= arg3) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field941[var8];
            }
            int var17;
            if ((var17 = this.field941[var8]) < 0) {
                arg5[arg3++] = (byte) ~var17;
                if (var7 <= arg3) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field941[var8];
            }
            int var18;
            if ((var18 = this.field941[var8]) < 0) {
                arg5[arg3++] = (byte) ~var18;
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg0;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lic;II)V")
    public static final void method273(class59 arg0, int arg1, int arg2) {
        class115.field2713++;
        class125.field2842.method1072(209, -1);
        field946++;
        class125.field2842.method1184(arg0.method447(12074), true);
        class125.field2842.method1188(arg1 ^ arg1, arg2);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Z)V")
    public static void method274(boolean arg0) {
        field954 = null;
        field947 = null;
        if (!arg0) {
            field957 = null;
        }
        field958 = null;
        field945 = null;
        field951 = null;
        field953 = null;
        field944 = null;
        field956 = null;
        field957 = null;
        field938 = null;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IBIILdc;)V")
    private static final void method275(int arg0, byte arg1, int arg2, int arg3, class25 arg4) {
        field936++;
        if (class68.field1703 >= 50 || class73.field1804 == 0 || (arg4.field622 == null || arg4.field622.length <= arg2)) {
            return;
        }
        int var5 = arg4.field622[arg2];
        if (var5 == 0) {
            return;
        }
        int var6 = -24 / ((30 - arg1) / 32);
        int var7 = var5 >> 8;
        int var8 = var5 & 0xF;
        class75.field1855[class68.field1703] = var7;
        int var9 = var5 >> 4 & 0x7;
        int var10 = (arg0 - 64) / 128;
        int var11 = (arg3 - 64) / 128;
        class61.field1562[class68.field1703] = var9;
        class38.field973[class68.field1703] = 0;
        class4.field81[class68.field1703] = null;
        class22.field522[class68.field1703] = (var10 << 16) - (-(var11 << 8) - var8);
        class68.field1703++;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I[BI[BZI)I")
    public final int method276(int arg0, byte[] arg1, int arg2, byte[] arg3, boolean arg4, int arg5) {
        field940++;
        if (arg4) {
            field950 = -18;
        }
        int var7 = 0;
        int var8 = arg0 + arg5;
        int var9 = arg2 << 3;
        while (arg5 < var8) {
            int var10 = arg3[arg5] & 0xFF;
            int var11 = this.field952[var10];
            byte var12 = this.field937[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 & 0x7;
            int var14 = var9 >> 3;
            var9 += var12;
            int var15 = var7 & -var13 >> 31;
            int var16 = (var12 + var13 - 1 >> 3) + var14;
            int var17 = var13 + 24;
            arg1[var14] = (byte) (var7 = class52.method392(var15, var11 >>> var17));
            if (var14 < var16) {
                var13 = var17 - 8;
                var14++;
                arg1[var14] = (byte) (var7 = var11 >>> var13);
                if (var16 > var14) {
                    var14++;
                    var13 -= 8;
                    arg1[var14] = (byte) (var7 = var11 >>> var13);
                    if (var16 > var14) {
                        var14++;
                        var13 -= 8;
                        arg1[var14] = (byte) (var7 = var11 >>> var13);
                        if (var14 < var16) {
                            var13 -= 8;
                            var14++;
                            arg1[var14] = (byte) (var7 = var11 << -var13);
                        }
                    }
                }
            }
            arg5++;
        }
        return (var9 + 7 >> 3) - arg2;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V")
    public static final void method277(int arg0) {
        field959++;
        if (arg0 <= 81) {
            method280(false);
        }
        for (class118 var1 = (class118) class22.field525.method682(0); var1 != null; var1 = (class118) class22.field525.method684((byte) -65)) {
            if (var1.field2741 == -1) {
                var1.field2746 = 0;
                class21.method115(false, var1);
            } else {
                var1.method929(101);
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "([B)V")
    public class36(byte[] arg0) {
        int[] var2 = new int[33];
        int var3 = 0;
        int var4 = arg0.length;
        this.field937 = arg0;
        this.field952 = new int[var4];
        this.field941 = new int[8];
        for (int var5 = 0; var5 < var4; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var2[var6];
                this.field952[var5] = var8;
                int var12;
                if ((var8 & var7) == 0) {
                    for (int var9 = var6 - 1; var9 >= 1; var9--) {
                        int var10 = var2[var9];
                        if (var8 != var10) {
                            break;
                        }
                        int var11 = 0x1 << 32 - var9;
                        if ((var11 & var10) != 0) {
                            var2[var9] = var2[var9 - 1];
                            break;
                        }
                        var2[var9] = class52.method392(var11, var10);
                    }
                    var12 = var8 | var7;
                } else {
                    var12 = var2[var6 - 1];
                }
                var2[var6] = var12;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var2[var13] == var8) {
                        var2[var13] = var12;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var16 & var8) == 0) {
                        var14++;
                    } else {
                        if (this.field941[var14] == 0) {
                            this.field941[var14] = var3;
                        }
                        var14 = this.field941[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (var14 >= this.field941.length) {
                        int[] var18 = new int[this.field941.length * 2];
                        for (int var19 = 0; var19 < this.field941.length; var19++) {
                            var18[var19] = this.field941[var19];
                        }
                        this.field941 = var18;
                    }
                }
                if (var3 <= var14) {
                    var3 = var14 + 1;
                }
                this.field941[var14] = ~var5;
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(II)I")
    public static final int method278(int arg0, int arg1) {
        int var2 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
        int var3 = (var2 >>> 2 & 0x33333333) + (var2 & 0x33333333);
        if (arg1 != -9516) {
            return -50;
        }
        field949++;
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Ljf;Z)V")
    public static final void method279(class68 arg0, boolean arg1) {
        arg0.field1708 = arg1;
        if (arg0.field1686 != -1) {
            class25 var2 = class49.method381(arg0.field1686, (byte) 122);
            if (var2 == null || var2.field625 == null) {
                arg0.field1686 = -1;
            } else {
                arg0.field1758++;
                if (arg0.field1706 < var2.field625.length && arg0.field1758 > var2.field610[arg0.field1706]) {
                    arg0.field1758 = 1;
                    arg0.field1706++;
                    method275(arg0.field1730, (byte) 113, arg0.field1706, arg0.field1751, var2);
                }
                if (var2.field625.length <= arg0.field1706) {
                    arg0.field1706 = 0;
                    arg0.field1758 = 0;
                    method275(arg0.field1730, (byte) 66, arg0.field1706, arg0.field1751, var2);
                }
            }
        }
        field939++;
        if (arg0.field1682 != -1 && class23.field561 >= arg0.field1746) {
            if (arg0.field1739 < 0) {
                arg0.field1739 = 0;
            }
            int var3 = class16.method87(16, arg0.field1682).field534;
            if (var3 == -1) {
                arg0.field1682 = -1;
            } else {
                class25 var4 = class49.method381(var3, (byte) 127);
                if (var4 == null || var4.field625 == null) {
                    arg0.field1682 = -1;
                } else {
                    arg0.field1705++;
                    if (var4.field625.length > arg0.field1739 && var4.field610[arg0.field1739] < arg0.field1705) {
                        arg0.field1739++;
                        arg0.field1705 = 1;
                        method275(arg0.field1730, (byte) 63, arg0.field1739, arg0.field1751, var4);
                    }
                    if (arg0.field1739 >= var4.field625.length && (arg0.field1739 < 0 || var4.field625.length <= arg0.field1739)) {
                        arg0.field1682 = -1;
                    }
                }
            }
        }
        if (arg0.field1685 != -1 && arg0.field1709 <= 1) {
            class25 var5 = class49.method381(arg0.field1685, (byte) 111);
            if (var5.field633 == 1 && arg0.field1681 > 0 && class23.field561 >= arg0.field1707 && arg0.field1725 < class23.field561) {
                arg0.field1709 = 1;
                return;
            }
        }
        if (arg0.field1685 != -1 && arg0.field1709 == 0) {
            class25 var6 = class49.method381(arg0.field1685, (byte) 121);
            if (var6 == null || var6.field625 == null) {
                arg0.field1685 = -1;
            } else {
                arg0.field1754++;
                if (arg0.field1691 < var6.field625.length && arg0.field1754 > var6.field610[arg0.field1691]) {
                    arg0.field1754 = 1;
                    arg0.field1691++;
                    method275(arg0.field1730, (byte) -57, arg0.field1691, arg0.field1751, var6);
                }
                if (arg0.field1691 >= var6.field625.length) {
                    arg0.field1743++;
                    arg0.field1691 -= var6.field639;
                    if (var6.field611 <= arg0.field1743) {
                        arg0.field1685 = -1;
                    } else if (arg0.field1691 >= 0 && arg0.field1691 < var6.field625.length) {
                        method275(arg0.field1730, (byte) 116, arg0.field1691, arg0.field1751, var6);
                    } else {
                        arg0.field1685 = -1;
                    }
                }
                arg0.field1708 = var6.field619;
            }
        }
        if (arg0.field1709 > 0) {
            arg0.field1709--;
        }
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(Z)I")
    public static final int method280(boolean arg0) {
        field942++;
        return arg0 ? 6 : -48;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIILq;IILkd;III)V")
    public static final void method281(int arg0, int arg1, int arg2, class111 arg3, int arg4, int arg5, class73 arg6, int arg7, int arg8, int arg9) {
        field960++;
        class19 var10 = class53.method397(arg1, arg4 + 13415);
        int var11;
        int var12;
        if (arg5 == 1 || arg5 == 3) {
            var12 = var10.field418;
            var11 = var10.field434;
        } else {
            var11 = var10.field418;
            var12 = var10.field434;
        }
        int var13;
        int var14;
        if (arg8 + var12 > 104) {
            var13 = arg8;
            var14 = arg8 + 1;
        } else {
            var13 = (var12 >> 1) + arg8;
            var14 = (var12 + 1 >> 1) + arg8;
        }
        int var15;
        int var16;
        if (arg7 + var11 <= 104) {
            var15 = arg7 + (var11 >> 1);
            var16 = (var11 + 1 >> 1) + arg7;
        } else {
            var15 = arg7;
            var16 = arg7 + 1;
        }
        int[][] var17 = class26.field695[arg2];
        int var18 = var17[var15][var13] + var17[var16][var13] + var17[var15][var14] + var17[var16][var14] >> 2;
        int var19 = (arg7 << 7) + (var11 << 6);
        int var20 = (arg8 << 7) + (arg1 << 14) + arg7 + 1073741824;
        int var21 = (arg8 << 7) + (var12 << 6);
        int var22 = (arg5 << 6) + arg9;
        if (var10.field433 == 1) {
            var22 += 256;
        }
        if (var10.field375 == 0) {
            var20 += Integer.MIN_VALUE;
        }
        if (arg9 == 22) {
            class70 var23;
            if (var10.field411 == -1 && var10.field379 == null) {
                var23 = var10.method98(arg5, 22, var17, var21, var18, var19, false);
            } else {
                var23 = new class8(arg1, 22, arg5, arg2, arg7, arg8, var10.field411, true, null);
            }
            arg3.method871(arg0, arg7, arg8, var18, var23, var20, var22);
            if (var10.field391 == 1) {
                arg6.method611((byte) 35, arg7, arg8);
            }
        } else if (arg9 == 10 || arg9 == 11) {
            class70 var46;
            if (var10.field411 == -1 && var10.field379 == null) {
                var46 = var10.method98(arg5, 10, var17, var21, var18, var19, false);
            } else {
                var46 = new class8(arg1, 10, arg5, arg2, arg7, arg8, var10.field411, true, null);
            }
            if (var46 != null) {
                arg3.method875(arg0, arg7, arg8, var18, var11, var12, var46, arg9 == 11 ? 256 : 0, var20, var22);
            }
            if (var10.field391 != 0) {
                arg6.method615(var11, var12, arg8, arg4 ^ 0x5F, arg7, var10.field400);
            }
        } else if (arg9 >= 12) {
            class70 var24;
            if (var10.field411 == -1 && var10.field379 == null) {
                var24 = var10.method98(arg5, arg9, var17, var21, var18, var19, false);
            } else {
                var24 = new class8(arg1, arg9, arg5, arg2, arg7, arg8, var10.field411, true, null);
            }
            arg3.method875(arg0, arg7, arg8, var18, 1, 1, var24, 0, var20, var22);
            if (var10.field391 != 0) {
                arg6.method615(var11, var12, arg8, 124, arg7, var10.field400);
            }
        } else if (arg4 == arg9) {
            class70 var25;
            if (var10.field411 == -1 && var10.field379 == null) {
                var25 = var10.method98(arg5, 0, var17, var21, var18, var19, false);
            } else {
                var25 = new class8(arg1, 0, arg5, arg2, arg7, arg8, var10.field411, true, null);
            }
            arg3.method889(arg0, arg7, arg8, var18, var25, null, class21.field447[arg5], 0, var20, var22);
            if (var10.field391 != 0) {
                arg6.method605(var10.field400, arg5, arg8, arg7, 3499, arg9);
            }
        } else if (arg9 == 1) {
            class70 var26;
            if (var10.field411 == -1 && var10.field379 == null) {
                var26 = var10.method98(arg5, 1, var17, var21, var18, var19, false);
            } else {
                var26 = new class8(arg1, 1, arg5, arg2, arg7, arg8, var10.field411, true, null);
            }
            arg3.method889(arg0, arg7, arg8, var18, var26, null, class16.field315[arg5], 0, var20, var22);
            if (var10.field391 != 0) {
                arg6.method605(var10.field400, arg5, arg8, arg7, 3499, arg9);
            }
        } else if (arg9 == 2) {
            int var27 = arg5 + 1 & 0x3;
            class70 var28;
            class70 var29;
            if (var10.field411 == -1 && var10.field379 == null) {
                var28 = var10.method98(arg5 + 4, 2, var17, var21, var18, var19, false);
                var29 = var10.method98(var27, 2, var17, var21, var18, var19, false);
            } else {
                var28 = new class8(arg1, 2, arg5 + 4, arg2, arg7, arg8, var10.field411, true, null);
                var29 = new class8(arg1, 2, var27, arg2, arg7, arg8, var10.field411, true, null);
            }
            arg3.method889(arg0, arg7, arg8, var18, var28, var29, class21.field447[arg5], class21.field447[var27], var20, var22);
            if (var10.field391 != 0) {
                arg6.method605(var10.field400, arg5, arg8, arg7, 3499, arg9);
            }
        } else if (arg9 == 3) {
            class70 var30;
            if (var10.field411 == -1 && var10.field379 == null) {
                var30 = var10.method98(arg5, 3, var17, var21, var18, var19, false);
            } else {
                var30 = new class8(arg1, 3, arg5, arg2, arg7, arg8, var10.field411, true, null);
            }
            arg3.method889(arg0, arg7, arg8, var18, var30, null, class16.field315[arg5], 0, var20, var22);
            if (var10.field391 != 0) {
                arg6.method605(var10.field400, arg5, arg8, arg7, arg4 + 3499, arg9);
            }
        } else if (arg9 == 9) {
            class70 var31;
            if (var10.field411 == -1 && var10.field379 == null) {
                var31 = var10.method98(arg5, arg9, var17, var21, var18, var19, false);
            } else {
                var31 = new class8(arg1, arg9, arg5, arg2, arg7, arg8, var10.field411, true, null);
            }
            arg3.method875(arg0, arg7, arg8, var18, 1, 1, var31, 0, var20, var22);
            if (var10.field391 != 0) {
                arg6.method615(var11, var12, arg8, 111, arg7, var10.field400);
            }
        } else if (arg9 == 4) {
            class70 var32;
            if (var10.field411 == -1 && var10.field379 == null) {
                var32 = var10.method98(arg5, 4, var17, var21, var18, var19, false);
            } else {
                var32 = new class8(arg1, 4, arg5, arg2, arg7, arg8, var10.field411, true, null);
            }
            arg3.method893(arg0, arg7, arg8, var18, var32, null, class21.field447[arg5], 0, 0, 0, var20, var22);
        } else if (arg9 == 5) {
            int var33 = arg3.method876(arg0, arg7, arg8);
            int var34 = 16;
            if (var33 != 0) {
                var34 = class53.method397(var33 >> 14 & 0x7FFF, 13415).field425;
            }
            class70 var35;
            if (var10.field411 == -1 && var10.field379 == null) {
                var35 = var10.method98(arg5, 4, var17, var21, var18, var19, false);
            } else {
                var35 = new class8(arg1, 4, arg5, arg2, arg7, arg8, var10.field411, true, null);
            }
            arg3.method893(arg0, arg7, arg8, var18, var35, null, class21.field447[arg5], 0, class86.field2153[arg5] * var34, class46.field1158[arg5] * var34, var20, var22);
        } else if (arg9 == 6) {
            int var36 = 8;
            int var37 = arg3.method876(arg0, arg7, arg8);
            if (var37 != 0) {
                var36 = class53.method397(var37 >> 14 & 0x7FFF, arg4 + 13415).field425 / 2;
            }
            class70 var38;
            if (var10.field411 == -1 && var10.field379 == null) {
                var38 = var10.method98(arg5 + 4, 4, var17, var21, var18, var19, false);
            } else {
                var38 = new class8(arg1, 4, arg5 + 4, arg2, arg7, arg8, var10.field411, true, null);
            }
            arg3.method893(arg0, arg7, arg8, var18, var38, null, 256, arg5, class128.field2897[arg5] * var36, class126.field2856[arg5] * var36, var20, var22);
        } else if (arg9 == 7) {
            int var39 = arg5 + 2 & 0x3;
            class70 var40;
            if (var10.field411 == -1 && var10.field379 == null) {
                var40 = var10.method98(var39 + 4, 4, var17, var21, var18, var19, false);
            } else {
                var40 = new class8(arg1, 4, var39 + 4, arg2, arg7, arg8, var10.field411, true, null);
            }
            arg3.method893(arg0, arg7, arg8, var18, var40, null, 256, var39, 0, 0, var20, var22);
        } else if (arg9 == 8) {
            int var41 = 8;
            int var42 = arg5 + 2 & 0x3;
            int var43 = arg3.method876(arg0, arg7, arg8);
            if (var43 != 0) {
                var41 = class53.method397(var43 >> 14 & 0x7FFF, 13415).field425 / 2;
            }
            class70 var44;
            class70 var45;
            if (var10.field411 == -1 && var10.field379 == null) {
                var44 = var10.method98(arg5 + 4, 4, var17, var21, var18, var19, false);
                var45 = var10.method98(var42 + 4, 4, var17, var21, var18, var19, false);
            } else {
                var44 = new class8(arg1, 4, arg5 + 4, arg2, arg7, arg8, var10.field411, true, null);
                var45 = new class8(arg1, 4, var42 + 4, arg2, arg7, arg8, var10.field411, true, null);
            }
            arg3.method893(arg0, arg7, arg8, var18, var44, var45, 256, arg5, class128.field2897[arg5] * var41, class126.field2856[arg5] * var41, var20, var22);
        }
    }
}
