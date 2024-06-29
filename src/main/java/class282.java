import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class282 extends class217 {

    @OriginalMember(owner = "client!jc", name = "M", descriptor = "I")
    private final int field4778;

    @OriginalMember(owner = "client!jc", name = "y", descriptor = "I")
    private final int field4765;

    @OriginalMember(owner = "client!jc", name = "E", descriptor = "I")
    private final int field4770;

    @OriginalMember(owner = "client!jc", name = "C", descriptor = "I")
    private final int field4768;

    @OriginalMember(owner = "client!jc", name = "O", descriptor = "I")
    private final int field4780;

    @OriginalMember(owner = "client!jc", name = "N", descriptor = "I")
    private final int field4779;

    @OriginalMember(owner = "client!jc", name = "t", descriptor = "I")
    private final int field4760;

    @OriginalMember(owner = "client!jc", name = "R", descriptor = "I")
    private final int field4782;

    @OriginalMember(owner = "client!jc", name = "x", descriptor = "Lbe;")
    private static class283 field4764 = class153.method941(126, " has logged out)3");

    @OriginalMember(owner = "client!jc", name = "B", descriptor = "I")
    public static int field4767 = 0;

    @OriginalMember(owner = "client!jc", name = "z", descriptor = "Lbe;")
    public static class283 field4766 = class153.method941(125, "<col=80ff00>");

    @OriginalMember(owner = "client!jc", name = "L", descriptor = "Lkg;")
    public static class69 field4777 = null;

    @OriginalMember(owner = "client!jc", name = "w", descriptor = "Lbe;")
    public static class283 field4763 = field4764;

    @OriginalMember(owner = "client!jc", name = "u", descriptor = "I")
    public static int field4761;

    @OriginalMember(owner = "client!jc", name = "v", descriptor = "I")
    public static int field4762;

    @OriginalMember(owner = "client!jc", name = "D", descriptor = "I")
    public static int field4769;

    @OriginalMember(owner = "client!jc", name = "F", descriptor = "I")
    public static int field4771;

    @OriginalMember(owner = "client!jc", name = "H", descriptor = "I")
    public static int field4773;

    @OriginalMember(owner = "client!jc", name = "K", descriptor = "I")
    public static int field4776;

    @OriginalMember(owner = "client!jc", name = "Q", descriptor = "I")
    public static int field4781;

    @OriginalMember(owner = "client!jc", name = "G", descriptor = "Lek;")
    public static class172 field4772;

    @OriginalMember(owner = "client!jc", name = "J", descriptor = "Lek;")
    public static class172 field4775;

    @OriginalMember(owner = "client!jc", name = "I", descriptor = "Lkg;")
    public static class69 field4774;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIZI)V", line = 9)
    public static final void method1893(int arg0, int arg1, boolean arg2, int arg3) {
        if (class255.field4301 != 0 && arg3 != 0 && class127.field2103 < 50 && arg0 != -1) {
            class30.field460[class127.field2103] = arg0;
            class280.field4679[class127.field2103] = arg3;
            class225.field3788[class127.field2103] = arg1;
            class168.field2815[class127.field2103] = null;
            class187.field3200[class127.field2103] = 0;
            class127.field2103++;
        }
        field4776++;
        if (!arg2) {
            field4764 = (class283) null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(Z)V", line = 33)
    public static final void method1894(boolean arg0) {
        field4762++;
        if (class123.method776(-20253) != 2) {
            return;
        }
        byte var1 = (byte) (class309.field5285 - 4 & 0xFF);
        int var2 = class309.field5285 % 104;
        int var3 = 0;
        if (!arg0) {
            return;
        }
        while (var3 < 4) {
            for (int var4 = 0; var4 < 104; var4++) {
                class208.field3567[var3][var2][var4] = var1;
            }
            var3++;
        }
        if (class61.field850 == 3) {
            return;
        }
        for (int var5 = 0; var5 < 2; var5++) {
            class169.field2843[var5] = -1000000;
            class2.field24[var5] = 1000000;
            class34.field517[var5] = 0;
            class264.field4499[var5] = 1000000;
            class130.field2206[var5] = 0;
        }
        if (class26.field377 != 1) {
            int var16 = class42.method254(class61.field850, class135.field2273, class116.field1976, -20341);
            if (var16 - class63.field876 < 800 && (class252.field4282[class61.field850][class116.field1976 >> 7][class135.field2273 >> 7] & 0x4) != 0) {
                class222.method1455(false, class116.field1976 >> 7, class86.field1459, class135.field2273 >> 7, 1, true);
            }
            return;
        }
        if ((class252.field4282[class61.field850][class213.field3624.field1193 >> 7][class213.field3624.field1210 >> 7] & 0x4) != 0) {
            class222.method1455(false, class213.field3624.field1193 >> 7, class86.field1459, class213.field3624.field1210 >> 7, 0, true);
        }
        if (class150.field2450 >= 310) {
            return;
        }
        int var6 = class116.field1976 >> 7;
        int var7 = class213.field3624.field1193 >> 7;
        int var8 = class135.field2273 >> 7;
        int var9 = class213.field3624.field1210 >> 7;
        int var10;
        if (var6 >= var7) {
            var10 = var6 - var7;
        } else {
            var10 = var7 - var6;
        }
        int var11;
        if (var9 <= var8) {
            var11 = var8 - var9;
        } else {
            var11 = var9 - var8;
        }
        if (var10 > var11) {
            int var14 = var11 * 65536 / var10;
            int var15 = 32768;
            while (var6 != var7) {
                if (var7 > var6) {
                    var6++;
                } else if (var7 < var6) {
                    var6--;
                }
                if ((class252.field4282[class61.field850][var6][var8] & 0x4) != 0) {
                    class222.method1455(false, var6, class86.field1459, var8, 1, true);
                    break;
                }
                var15 += var14;
                if (var15 >= 65536) {
                    var15 -= 65536;
                    if (var8 < var9) {
                        var8++;
                    } else if (var9 < var8) {
                        var8--;
                    }
                    if ((class252.field4282[class61.field850][var6][var8] & 0x4) != 0) {
                        class222.method1455(false, var6, class86.field1459, var8, 1, true);
                        break;
                    }
                }
            }
            return;
        }
        int var12 = var10 * 65536 / var11;
        int var13 = 32768;
        while (var8 != var9) {
            if (var9 > var8) {
                var8++;
            } else if (var8 > var9) {
                var8--;
            }
            if ((class252.field4282[class61.field850][var6][var8] & 0x4) != 0) {
                class222.method1455(false, var6, class86.field1459, var8, 1, true);
                break;
            }
            var13 += var12;
            if (var13 >= 65536) {
                if (var7 > var6) {
                    var6++;
                } else if (var7 < var6) {
                    var6--;
                }
                var13 -= 65536;
                if ((class252.field4282[class61.field850][var6][var8] & 0x4) != 0) {
                    class222.method1455(false, var6, class86.field1459, var8, 1, arg0);
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZII)V", line = 221)
    public final void method66(boolean arg0, int arg1, int arg2) {
        field4773++;
        if (arg0) {
            method1895(29);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V", line = 231)
    public static void method1895(int arg0) {
        field4763 = null;
        if (arg0 != -30694) {
            return;
        }
        field4775 = null;
        field4772 = null;
        field4774 = null;
        field4764 = null;
        field4766 = null;
        field4777 = null;
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(III)V", line = 248)
    public final void method67(int arg0, int arg1, int arg2) {
        field4771++;
        int var4 = this.field4778 * arg0 >> 12;
        int var5 = this.field4768 * arg1 >> 12;
        int var6 = this.field4765 * arg0 >> 12;
        int var7 = this.field4782 * arg0 >> 12;
        int var8 = this.field4770 * arg1 >> 12;
        int var9 = this.field4760 * arg0 >> 12;
        int var10 = this.field4779 * arg1 >> 12;
        if (arg2 != 17113) {
            field4777 = (class69) null;
        }
        int var11 = this.field4780 * arg1 >> 12;
        class164.method1001(var5, var8, var11, var4, var10, 78, this.field3671, var9, var6, var7);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(BLfe;)V", line = 279)
    public static final void method1896(byte arg0, class229 arg1) {
        field4769++;
        if (arg0 <= 54) {
            method1897((long[]) null, 115, (int[]) null);
        }
        while (true) {
            while (arg1.field3905 < arg1.field3879.length) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg1.method1535((byte) 77) == 1) {
                    var2 = true;
                    var3 = arg1.method1535((byte) 120);
                    var4 = arg1.method1535((byte) 72);
                }
                int var5 = arg1.method1535((byte) 75);
                int var6 = arg1.method1535((byte) 91);
                int var7 = var5 * 64 - class123.field2045;
                int var8 = class134.field2254 + class110.field1865 - (var6 * 64) - 1;
                if (var7 >= 0 && (var8 - 63) >= 0 && (var7 + 63) < class77.field1345 && var8 < class134.field2254) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var11 >= var3 * 8 && var3 * 8 + 8 > var11 && var12 >= (var4 * 8) && (var4 * 8 + 8) > var12) {
                                int var13 = arg1.method1535((byte) 108);
                                if (var13 != 0) {
                                    if ((var13 & 0x1) == 1) {
                                        int var14 = arg1.method1535((byte) 96);
                                        if (class86.field1451[var9][var10] == null) {
                                            class86.field1451[var9][var10] = new byte[4096];
                                        }
                                        class86.field1451[var9][var10][(63 - var12 << 6) + var11] = (byte) var14;
                                    }
                                    if ((var13 & 0x2) == 2) {
                                        int var15 = arg1.method1496(true);
                                        if (class74.field1297[var9][var10] == null) {
                                            class74.field1297[var9][var10] = new short[4096];
                                        }
                                        class74.field1297[var9][var10][(63 - var12 << 6) + var11] = (short) var15;
                                    }
                                    if ((var13 & 0x4) == 4) {
                                        int var16 = (arg1.method1535((byte) 95) & 0xFF << 16) + ((arg1.method1535((byte) 126) & 0xFF) << 8) + (arg1.method1535((byte) 109) & 0xFF);
                                        if (class309.field5291[var9][var10] == null) {
                                            class309.field5291[var9][var10] = new int[4096];
                                        }
                                        var16--;
                                        class281 var17 = class254.method1722(0, var16);
                                        if (var17.field4752 != null) {
                                            var17 = var17.method1873((byte) 40);
                                            if (var17 == null || var17.field4685 == -1) {
                                                continue;
                                            }
                                        }
                                        class309.field5291[var9][var10][(63 - var12 << 6) + var11] = var17.field4693 + 1;
                                        class292 var18 = new class292();
                                        var18.field4950 = var7;
                                        var18.field4951 = var8;
                                        var18.field4948 = var17.field4685;
                                        class48.field659.method1809(var18, (byte) -125);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    for (int var19 = 0; var19 < (var2 ? 64 : 4096); var19++) {
                        int var20 = arg1.method1535((byte) 99);
                        if (var20 != 0) {
                            if ((var20 & 0x1) == 1) {
                                arg1.field3905++;
                            }
                            if ((var20 & 0x2) == 2) {
                                arg1.field3905 += 2;
                            }
                            if ((var20 & 0x4) == 4) {
                                arg1.field3905 += 3;
                            }
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 422)
    public class282(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field4778 = arg0;
        this.field4765 = arg2;
        this.field4770 = arg3;
        this.field4768 = arg1;
        this.field4780 = arg5;
        this.field4779 = arg7;
        this.field4760 = arg6;
        this.field4782 = arg4;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)V", line = 452)
    public final void method68(int arg0, int arg1, int arg2) {
        field4781++;
        if (arg1 >= -28) {
            field4775 = (class172) null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "([JI[I)V", line = 466)
    public static final void method1897(long[] arg0, int arg1, int[] arg2) {
        class240.method1614(arg0, arg2, (byte) 104, 0, arg0.length - 1);
        if (arg1 > -119) {
            field4767 = -68;
        }
        field4761++;
    }
}
