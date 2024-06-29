import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public abstract class class135 extends class130 {

    @OriginalMember(owner = "client!n", name = "K", descriptor = "Z")
    public boolean field1962;

    @OriginalMember(owner = "client!n", name = "E", descriptor = "[Ln;")
    public class135[] field1956;

    @OriginalMember(owner = "client!n", name = "F", descriptor = "I")
    public static int field1957 = 0;

    @OriginalMember(owner = "client!n", name = "O", descriptor = "[I")
    public static int[] field1966 = new int[5];

    @OriginalMember(owner = "client!n", name = "R", descriptor = "Z")
    public static boolean field1969 = false;

    @OriginalMember(owner = "client!n", name = "J", descriptor = "I")
    public static int field1961 = 0;

    @OriginalMember(owner = "client!n", name = "D", descriptor = "Lqj;")
    private static class196 field1955 = class80.method502("Please wait)3)3)3", -48);

    @OriginalMember(owner = "client!n", name = "w", descriptor = "Lqj;")
    public static class196 field1948 = field1955;

    @OriginalMember(owner = "client!n", name = "T", descriptor = "Lqj;")
    public static class196 field1971 = class80.method502("settings", -48);

    @OriginalMember(owner = "client!n", name = "S", descriptor = "Lqj;")
    private static class196 field1970 = class80.method502("Connecting to update server", -48);

    @OriginalMember(owner = "client!n", name = "y", descriptor = "Lqj;")
    public static class196 field1950 = field1970;

    @OriginalMember(owner = "client!n", name = "q", descriptor = "I")
    public static int field1942;

    @OriginalMember(owner = "client!n", name = "r", descriptor = "I")
    public static int field1943;

    @OriginalMember(owner = "client!n", name = "t", descriptor = "I")
    public int field1945;

    @OriginalMember(owner = "client!n", name = "u", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!n", name = "x", descriptor = "I")
    public static int field1949;

    @OriginalMember(owner = "client!n", name = "z", descriptor = "I")
    public static int field1951;

    @OriginalMember(owner = "client!n", name = "A", descriptor = "I")
    public static int field1952;

    @OriginalMember(owner = "client!n", name = "B", descriptor = "I")
    public static int field1953;

    @OriginalMember(owner = "client!n", name = "G", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!n", name = "H", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!n", name = "I", descriptor = "I")
    public static int field1960;

    @OriginalMember(owner = "client!n", name = "L", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!n", name = "M", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!n", name = "N", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!n", name = "Q", descriptor = "I")
    public static int field1968;

    @OriginalMember(owner = "client!n", name = "U", descriptor = "I")
    public static int field1972;

    @OriginalMember(owner = "client!n", name = "C", descriptor = "Ltb;")
    public class20 field1954;

    @OriginalMember(owner = "client!n", name = "v", descriptor = "Lsd;")
    public class81 field1947;

    @OriginalMember(owner = "client!n", name = "P", descriptor = "Z")
    public static boolean field1967;

    @OriginalMember(owner = "client!n", name = "s", descriptor = "[[B")
    public static byte[][] field1944;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ZB)V")
    public static final void method812(boolean arg0, byte arg1) {
        field1949++;
        byte[][] var2 = field1944;
        byte var3 = 4;
        if (arg1 < 61) {
            field1966 = null;
        }
        int var4 = var2.length;
        for (int var5 = 0; var5 < var4; var5++) {
            int var11 = (class181.field3191[var5] >> 8) * 64 - class106.field1523;
            int var12 = (class181.field3191[var5] & 0xFF) * 64 - class178.field3011;
            byte[] var13 = var2[var5];
            if (var13 != null) {
                class181.method1187((byte) 113);
                class64.method405(class192.field3375 * 8 - 48, var12, class188.field3298, (class223.field4001 - 6) * 8, var11, var13, 11840, arg0);
            }
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class181.field3191[var6] >> 8) * 64 - class106.field1523;
            byte[] var8 = var2[var6];
            int var9 = (class181.field3191[var6] & 0xFF) * 64 - class178.field3011;
            if (var8 == null && class192.field3375 < 800) {
                class181.method1187((byte) 113);
                for (int var10 = 0; var10 < var3; var10++) {
                    class214.method1475(var7, var9, var10, -105, 64, 64);
                }
            }
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIZIZ)V")
    public static final void method813(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        class163.field2640++;
        if (!arg3) {
            class67.method429(true, 22380);
            class41.method209(true, 127);
            class67.method429(false, 22380);
        }
        class41.method209(false, 126);
        field1958++;
        if (!arg3) {
            class256.method1725((byte) -72);
        }
        class74.method471(104);
        if (class202.field3597 == 1) {
            int var6 = class18.field216 + class131.field1869 & 0x7FF;
            int var7 = class194.field3417;
            if (var7 < class96.field1414 / 256) {
                var7 = class96.field1414 / 256;
            }
            if (class201.field3565[4] && var7 < class90.field1324[4] + 128) {
                var7 = class90.field1324[4] + 128;
            }
            class29.method158(var7 * 3 + 600, var6, class87.field1282, var7, class74.method470(class102.field1477.field2085, class27.field335, 103, class102.field1477.field2081) - 50, (byte) 86, arg2, class48.field577);
        }
        int var8 = class132.field1889;
        int var9 = class149.field2396;
        int var10 = class13.field151;
        int var11 = class185.field3232;
        int var12 = class25.field321;
        for (int var13 = 0; var13 < 5; var13++) {
            if (class201.field3565[var13]) {
                int var38 = (int) ((double) -class71.field1009[var13] + (double) (class71.field1009[var13] * 2 + 1) * Math.random() + Math.sin((double) class237.field4206[var13] / 100.0D * (double) class194.field3415[var13]) * (double) class90.field1324[var13]);
                if (var13 == 1) {
                    class132.field1889 += var38;
                }
                if (var13 == 4) {
                    class149.field2396 += var38;
                    if (class149.field2396 < 128) {
                        class149.field2396 = 128;
                    }
                    if (class149.field2396 > 383) {
                        class149.field2396 = 383;
                    }
                }
                if (var13 == 2) {
                    class25.field321 += var38;
                }
                if (var13 == 3) {
                    class185.field3232 = class185.field3232 + var38 & 0x7FF;
                }
                if (var13 == 0) {
                    class13.field151 += var38;
                }
            }
        }
        int var14 = 3;
        if (!class240.field4271 && !class8.field76) {
            var14 = class27.field335;
        }
        if (class9.method37(0) && class240.field4271 && !class8.field76) {
            if (class224.field4008 == null) {
                class224.field4008 = new byte[4][104][104];
            }
            int var15 = class163.field2640 % 104;
            byte var16 = (byte) (class163.field2640 - 4 & 0xFF);
            for (int var17 = 0; var17 < 4; var17++) {
                for (int var18 = 0; var18 < 104; var18++) {
                    class224.field4008[var17][var15][var18] = var16;
                }
            }
        }
        boolean var19 = false;
        if (class9.method37(0) && class240.field4271 && !class8.field76 && class27.field335 != 3) {
            for (int var20 = 0; var20 < 2; var20++) {
                class21.field269[var20] = -1000000;
                class224.field4014[var20] = 1000000;
                class230.field4094[var20] = 0;
                class237.field4214[var20] = 1000000;
                class76.field1100[var20] = 0;
            }
            if (class202.field3597 == 1) {
                if ((class88.field1300[class27.field335][class102.field1477.field2081 >> 7][class102.field1477.field2085 >> 7] & 0x4) != 0) {
                    class80.method503(class102.field1477.field2085 >> 7, class249.field4410, class102.field1477.field2081 >> 7, (byte) 122, 0);
                    var19 = true;
                }
                if (class149.field2396 < 310) {
                    int var21 = class13.field151 >> 7;
                    int var22 = class25.field321 >> 7;
                    int var23 = class102.field1477.field2085 >> 7;
                    int var24 = class102.field1477.field2081 >> 7;
                    int var25;
                    if (var22 < var23) {
                        var25 = var23 - var22;
                    } else {
                        var25 = var22 - var23;
                    }
                    int var26;
                    if (var24 > var21) {
                        var26 = var24 - var21;
                    } else {
                        var26 = var21 - var24;
                    }
                    if (var25 < var26) {
                        int var27 = 32768;
                        int var28 = var25 * 65536 / var26;
                        while (var21 != var24) {
                            if (var24 > var21) {
                                var21++;
                            } else if (var24 < var21) {
                                var21--;
                            }
                            if ((class88.field1300[class27.field335][var21][var22] & 0x4) != 0) {
                                var19 = true;
                                class80.method503(var22, class249.field4410, var21, (byte) 118, 1);
                                break;
                            }
                            var27 += var28;
                            if (var27 >= 65536) {
                                if (var23 > var22) {
                                    var22++;
                                } else if (var22 > var23) {
                                    var22--;
                                }
                                var27 -= 65536;
                                if ((class88.field1300[class27.field335][var21][var22] & 0x4) != 0) {
                                    class80.method503(var22, class249.field4410, var21, (byte) 126, 1);
                                    var19 = true;
                                    break;
                                }
                            }
                        }
                    } else {
                        int var29 = var26 * 65536 / var25;
                        int var30 = 32768;
                        while (var22 != var23) {
                            if (var22 < var23) {
                                var22++;
                            } else if (var23 < var22) {
                                var22--;
                            }
                            if ((class88.field1300[class27.field335][var21][var22] & 0x4) != 0) {
                                var19 = true;
                                class80.method503(var22, class249.field4410, var21, (byte) 111, 1);
                                break;
                            }
                            var30 += var29;
                            if (var30 >= 65536) {
                                var30 -= 65536;
                                if (var24 > var21) {
                                    var21++;
                                } else if (var24 < var21) {
                                    var21--;
                                }
                                if ((class88.field1300[class27.field335][var21][var22] & 0x4) != 0) {
                                    class80.method503(var22, class249.field4410, var21, (byte) 116, 1);
                                    var19 = true;
                                    break;
                                }
                            }
                        }
                    }
                }
            } else {
                int var31 = class74.method470(class25.field321, class27.field335, 103, class13.field151);
                if (var31 - class132.field1889 < 800 && (class88.field1300[class27.field335][class13.field151 >> 7][class25.field321 >> 7] & 0x4) != 0) {
                    class80.method503(class25.field321 >> 7, class249.field4410, class13.field151 >> 7, (byte) 125, 1);
                    var19 = true;
                }
            }
        }
        class55.method296(arg4, arg1, arg0 + arg4, arg1 - -arg2);
        class15.method64();
        int var32 = class52.field646;
        int var33 = class63.field869;
        if (!arg5) {
            method817((byte) 45, -3);
        }
        if (arg4 <= var32 && arg0 + arg4 > var32 && arg1 <= var33 && arg1 + arg2 > var33) {
            class220.field3967 = 0;
            int var34 = class161.field2580;
            int var35 = class146.field2309;
            class136.field1978 = (class52.field646 - arg4) * (var35 - var34) / arg0 + var34;
            class54.field674 = true;
            int var36 = class43.field494;
            int var37 = class6.field48;
            class110.field1568 = (class63.field869 - arg1) * (var37 - var36) / arg2 + var36;
        } else {
            class220.field3967 = 0;
            class54.field674 = false;
        }
        class181.method1187((byte) 113);
        class55.method295(arg4, arg1, arg0, arg2, 0);
        if (var19) {
            class245.method1670(class13.field151, class132.field1889, class25.field321, class149.field2396, class185.field3232, var14, class224.field4008, class21.field269, class224.field4014, class230.field4094, class76.field1100, class237.field4214, class27.field335 + 1, (byte) class163.field2640, class102.field1477.field2081 >> 7, class102.field1477.field2085 >> 7);
        } else {
            class245.method1670(class13.field151, class132.field1889, class25.field321, class149.field2396, class185.field3232, var14, null, null, null, null, null, null, 0, (byte) 0, class102.field1477.field2081 >> 7, class102.field1477.field2085 >> 7);
        }
        class181.method1187((byte) 113);
        class188.method1229();
        class94.method580(arg0, -1, arg1, arg2, arg4, 256, 256);
        class94.method584((byte) -92, arg2, arg0, 256, arg1, arg4, 256);
        ((class185) class15.field171).method1212(class113.field1658, (byte) 27);
        class211.method1460(arg4, arg2, arg1, (byte) 98, arg0);
        class132.field1889 = var8;
        class25.field321 = var12;
        class149.field2396 = var9;
        class185.field3232 = var11;
        class13.field151 = var10;
        if (class41.field470 && class29.method160(true, (byte) -116, false) == 0) {
            class41.field470 = false;
        }
        if (class41.field470) {
            class55.method295(arg4, arg1, arg0, arg2, 0);
            class104.method636((byte) 34, false, class242.field4300);
        }
        if (!arg3 && !class41.field470 && !class160.field2574 && var32 >= arg4 && arg4 + arg0 > var32 && arg1 <= var33 && var33 < arg1 + arg2) {
            class202.method1364(arg2, var33, 31126, var32, arg0, arg4, arg1);
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(III)V")
    public final void method814(int arg0, int arg1, int arg2) {
        int var4 = ~this.field1945 == arg1 ? arg0 : this.field1945;
        if (this.field1962) {
            this.field1954 = new class20(var4, arg0, arg2);
        } else {
            this.field1947 = new class81(var4, arg0, arg2);
        }
        field1964++;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(I)I")
    public int method815(int arg0) {
        field1960++;
        if (arg0 != -28861) {
            this.method818(-110, -42, 100);
        }
        return -1;
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(B)V")
    public static void method816(byte arg0) {
        field1971 = null;
        field1970 = null;
        field1950 = null;
        field1948 = null;
        if (arg0 == 102) {
            field1955 = null;
            field1944 = null;
            field1966 = null;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(BI)I")
    public static final int method817(byte arg0, int arg1) {
        field1942++;
        if (arg1 >= 65 && arg1 <= 90 || !(arg1 < 192 || arg1 > 222 || arg1 == 215)) {
            return arg1 + 32;
        } else if (arg1 == 159) {
            return 255;
        } else {
            if (arg0 != -67) {
                field1969 = true;
            }
            return arg1 == 140 ? 156 : arg1;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IZ)[I")
    public int[] method99(int arg0, boolean arg1) {
        if (arg1) {
            return null;
        } else {
            field1968++;
            throw new IllegalStateException("This operation does not have a monochrome output");
        }
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(I)I")
    public int method515(int arg0) {
        if (arg0 == -26001) {
            field1953++;
            return -1;
        } else {
            return 76;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lp;II)V")
    public void method97(class56 arg0, int arg1, int arg2) {
        field1946++;
        if (arg2 != -16231) {
            field1971 = null;
        }
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(III)[[I")
    public final int[][] method818(int arg0, int arg1, int arg2) {
        field1951++;
        if (arg0 != 2) {
            this.field1945 = 49;
        }
        if (!this.field1956[arg2].field1962) {
            return this.field1956[arg2].method164(260028743, arg1);
        }
        int[][] var4 = new int[3][];
        int[] var5 = this.field1956[arg2].method99(arg1, false);
        var4[1] = var5;
        var4[0] = var5;
        var4[2] = var5;
        return var4;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(II)[[I")
    public int[][] method164(int arg0, int arg1) {
        if (arg0 == 260028743) {
            field1952++;
            throw new IllegalStateException("This operation does not have a colour output");
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!n", name = "d", descriptor = "(B)V")
    public void method102(byte arg0) {
        if (arg0 != -85) {
            this.method102((byte) 21);
        }
        field1972++;
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(III)[I")
    public final int[] method819(int arg0, int arg1, int arg2) {
        if (arg0 >= -80) {
            field1969 = false;
        }
        field1943++;
        return this.field1956[arg1].field1962 ? this.field1956[arg1].method99(arg2, false) : this.field1956[arg1].method164(260028743, arg2)[0];
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Z)V")
    public void method517(boolean arg0) {
        field1963++;
        if (arg0) {
            return;
        }
        if (this.field1962) {
            this.field1954.method108(-93);
            this.field1954 = null;
        } else {
            this.field1947.method508((byte) 93);
            this.field1947 = null;
        }
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "(IZ)V")
    public class135(int arg0, boolean arg1) {
        this.field1962 = arg1;
        this.field1956 = new class135[arg0];
    }
}
