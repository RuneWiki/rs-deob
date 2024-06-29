import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class222 {

    @OriginalMember(owner = "client!og", name = "n", descriptor = "[I")
    private int[] field3865;

    @OriginalMember(owner = "client!og", name = "l", descriptor = "[I")
    private int[] field3863;

    @OriginalMember(owner = "client!og", name = "k", descriptor = "[B")
    private byte[] field3862;

    @OriginalMember(owner = "client!og", name = "h", descriptor = "I")
    public static int field3859 = 1;

    @OriginalMember(owner = "client!og", name = "j", descriptor = "I")
    public static int field3861 = 0;

    @OriginalMember(owner = "client!og", name = "c", descriptor = "Loa;")
    public static class99 field3854 = class221.method1463(2844, "Mem:");

    @OriginalMember(owner = "client!og", name = "m", descriptor = "Loa;")
    public static class99 field3864 = class221.method1463(2844, "violet:");

    @OriginalMember(owner = "client!og", name = "i", descriptor = "[I")
    public static int[] field3860 = new int[4096];

    @OriginalMember(owner = "client!og", name = "g", descriptor = "Loa;")
    public static class99 field3858 = class221.method1463(2844, "hitmarks");

    @OriginalMember(owner = "client!og", name = "o", descriptor = "I")
    public static int field3866 = 0;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "I")
    public static int field3852;

    @OriginalMember(owner = "client!og", name = "b", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!og", name = "d", descriptor = "I")
    public static int field3855;

    @OriginalMember(owner = "client!og", name = "e", descriptor = "I")
    public static int field3856;

    @OriginalMember(owner = "client!og", name = "f", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Z)V")
    public static final void method1467(boolean arg0) {
        class129.field2252.method973(arg0);
        field3853++;
        int var1 = class129.field2252.method975(1, true);
        if (var1 == 0) {
            return;
        }
        int var2 = class129.field2252.method975(2, true);
        if (var2 == 0) {
            class25.field438[class64.field1078++] = 2047;
        } else if (var2 == 1) {
            int var3 = class129.field2252.method975(3, !arg0);
            class168.field3006.method523(var3, false, (byte) -66);
            int var4 = class129.field2252.method975(1, true);
            if (var4 == 1) {
                class25.field438[class64.field1078++] = 2047;
            }
        } else if (var2 == 2) {
            int var5 = class129.field2252.method975(3, true);
            class168.field3006.method523(var5, true, (byte) 95);
            int var6 = class129.field2252.method975(3, true);
            class168.field3006.method523(var6, true, (byte) -70);
            int var7 = class129.field2252.method975(1, true);
            if (var7 == 1) {
                class25.field438[class64.field1078++] = 2047;
            }
        } else if (var2 == 3) {
            int var8 = class129.field2252.method975(7, true);
            class255.field4407 = class129.field2252.method975(2, true);
            int var9 = class129.field2252.method975(1, true);
            int var10 = class129.field2252.method975(1, true);
            if (var10 == 1) {
                class25.field438[class64.field1078++] = 2047;
            }
            int var11 = class129.field2252.method975(7, true);
            class168.field3006.method1258(var11, var9 == 1, var8, (byte) -30);
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(II)Lj;")
    public static final class166 method1468(int arg0, int arg1) {
        class166 var2 = (class166) class272.field4809.method1811((long) arg1, arg0 - 75);
        field3852++;
        if (var2 != null) {
            return var2;
        }
        if (arg0 != 1) {
            method1468(-47, 57);
        }
        byte[] var3 = class37.field643.method1242(class153.method1017(true, arg1), class258.method1673(arg1, (byte) -87), 6801);
        class166 var4 = new class166();
        var4.field2957 = arg1;
        if (var3 != null) {
            var4.method1118(new class261(var3), (byte) -16);
        }
        var4.method1113((byte) 124);
        if (var4.field2904 != -1) {
            var4.method1123(method1468(arg0, var4.field2904), (byte) -16, method1468(1, var4.field2925));
        }
        if (var4.field2924 != -1) {
            var4.method1128(method1468(1, var4.field2967), (byte) 105, method1468(1, var4.field2924));
        }
        if (!class9.field77 && var4.field2968) {
            var4.field2931 = null;
            var4.field2936 = false;
            var4.field2943 = null;
            var4.field2963 = class199.field3459;
            var4.field2970 = 0;
        }
        class272.field4809.method1817((long) arg1, 16, var4);
        return var4;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V")
    public static void method1469(int arg0) {
        field3860 = null;
        field3858 = null;
        field3854 = null;
        field3864 = null;
        if (arg0 <= 4) {
            method1467(false);
        }
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "([B)V")
    public class222(byte[] arg0) {
        int var2 = arg0.length;
        this.field3865 = new int[var2];
        this.field3863 = new int[8];
        this.field3862 = arg0;
        int[] var3 = new int[33];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field3865[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
                    var9 = var7 | var8;
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var3[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var11 & var12) != 0) {
                            var3[var10] = var3[var10 - 1];
                            break;
                        }
                        var3[var10] = class179.method1194(var12, var11);
                    }
                } else {
                    var9 = var3[var6 - 1];
                }
                var3[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var8) {
                        var3[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var16 & var8) == 0) {
                        var14++;
                    } else {
                        if (this.field3863[var14] == 0) {
                            this.field3863[var14] = var4;
                        }
                        var14 = this.field3863[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (this.field3863.length <= var14) {
                        int[] var18 = new int[this.field3863.length * 2];
                        for (int var19 = 0; var19 < this.field3863.length; var19++) {
                            var18[var19] = this.field3863[var19];
                        }
                        this.field3863 = var18;
                    }
                }
                this.field3863[var14] = ~var5;
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I[BI[BII)I")
    public final int method1470(int arg0, byte[] arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        field3857++;
        if (arg5 == 0) {
            return 0;
        }
        int var7 = arg2 + arg5;
        int var8 = 0;
        int var9 = arg0;
        while (true) {
            byte var10 = arg3[var9];
            if (var10 >= 0) {
                var8++;
            } else {
                var8 = this.field3863[var8];
            }
            int var11;
            if ((var11 = this.field3863[var8]) < 0) {
                arg1[arg2++] = (byte) (~var11);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field3863[var8];
            }
            int var12;
            if ((var12 = this.field3863[var8]) < 0) {
                arg1[arg2++] = (byte) (~var12);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field3863[var8];
            }
            int var13;
            if ((var13 = this.field3863[var8]) < 0) {
                arg1[arg2++] = (byte) (~var13);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field3863[var8];
            }
            int var14;
            if ((var14 = this.field3863[var8]) < 0) {
                arg1[arg2++] = (byte) (~var14);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field3863[var8];
            }
            int var15;
            if ((var15 = this.field3863[var8]) < 0) {
                arg1[arg2++] = (byte) (~var15);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field3863[var8];
            }
            int var16;
            if ((var16 = this.field3863[var8]) < 0) {
                arg1[arg2++] = (byte) (~var16);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field3863[var8];
            }
            int var17;
            if ((var17 = this.field3863[var8]) < 0) {
                arg1[arg2++] = (byte) (~var17);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field3863[var8];
            }
            int var18;
            if ((var18 = this.field3863[var8]) < 0) {
                arg1[arg2++] = (byte) (~var18);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        if (arg4 != 19578) {
            field3854 = null;
        }
        return var9 + 1 - arg0;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ZI)Z")
    public static final boolean method1471(boolean arg0, int arg1) {
        field3855++;
        if (!arg0) {
            field3858 = null;
        }
        return ((arg1 & 0x7F20AC) >> 22) != 0;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(B[B[BIII)I")
    public final int method1472(byte arg0, byte[] arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        int var7 = 107 / ((4 - arg0) / 46);
        int var8 = arg3 + arg5;
        int var9 = arg4 << 3;
        int var10 = 0;
        field3856++;
        while (var8 > arg3) {
            int var11 = arg2[arg3] & 0xFF;
            byte var12 = this.field3862[var11];
            int var13 = this.field3865[var11];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var11);
            }
            int var14 = var9 & 0x7;
            int var15 = var10 & -var14 >> 31;
            int var16 = var9 >> 3;
            var9 += var12;
            int var17 = var16 + (var12 + var14 - 1 >> 3);
            int var18 = var14 + 24;
            arg1[var16] = (byte) (var10 = class179.method1194(var15, var13 >>> var18));
            if (var16 < var17) {
                var14 = var18 - 8;
                var16++;
                arg1[var16] = (byte) (var10 = var13 >>> var14);
                if (var17 > var16) {
                    var14 -= 8;
                    var16++;
                    arg1[var16] = (byte) (var10 = var13 >>> var14);
                    if (var17 > var16) {
                        var16++;
                        var14 -= 8;
                        arg1[var16] = (byte) (var10 = var13 >>> var14);
                        if (var17 > var16) {
                            var14 -= 8;
                            var16++;
                            arg1[var16] = (byte) (var10 = var13 << -var14);
                        }
                    }
                }
            }
            arg3++;
        }
        return (var9 + 7 >> 3) - arg4;
    }
}
