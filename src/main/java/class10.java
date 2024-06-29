import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class10 extends OutputStream {

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "Z")
    public static boolean field136 = true;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
    public static int field133;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
    public static int field137;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "I")
    public static int field139;

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "I")
    public static int field140;

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!aa", name = "k", descriptor = "I")
    public static int field142;

    @OriginalMember(owner = "client!aa", name = "l", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "Lll;")
    public static class166 field132;

    @OriginalMember(owner = "client!aa", name = "write", descriptor = "(I)V", line = 5)
    public final void write(int arg0) throws IOException {
        field135++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)I", line = 15)
    public static final int method49(int arg0) {
        if (arg0 == 0) {
            field142++;
            return ((class261.field3947 == 0 ? 0 : 1) << 22) + ((class225.field3192 == 0 ? 0 : 1) << 21) + ((class259.field3934 == 0 ? 0 : 1) << 20) + (class163.field2260 << 17) + ((class177.field2567 ? 1 : 0) << 16) + ((class172.field2481 ? 1 : 0) << 15) + ((class162.field2241 ? 1 : 0) << 13) + ((class272.field4269 ? 1 : 0) << 10) + ((class229.field3332 ? 1 : 0) << 9) + ((class321.field4926 ? 1 : 0) << 8) + ((class240.field3616 ? 1 : 0) << 7) + ((class117.field1661 ? 1 : 0) << 6) + ((class90.field1124 ? 1 : 0) << 5) + ((class238.field3539 ? 1 : 0) << 4) + ((field136 ? 1 : 0) << 3) + (class165.field2289 & 0x7) + (class345.field5352 & 0x3 << 11) + (((class54.field668 ? 1 : 0) << 19) - -(class274.method1976() << 23));
        } else {
            return 48;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V", line = 26)
    public static void method50(byte arg0) {
        field132 = null;
        if (arg0 != 95) {
            method54((class170) null, false);
        }
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)[Ltb;", line = 38)
    public static final class234[] method51(int arg0) {
        field133++;
        class234[] var1 = new class234[class21.field266];
        for (int var2 = 0; var2 < class21.field266; var2++) {
            var1[var2] = new class234(class99.field1288, class78.field988, class120.field1681[var2], class223.field3150[var2], class54.field664[var2], class264.field4159[var2], class153.field2105[var2], class134.field1854);
        }
        class321.method2238(104);
        if (arg0 < 16) {
            field132 = (class166) null;
        }
        return var1;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Z)V", line = 68)
    public static final void method52(boolean arg0) {
        if (!arg0) {
            field141 = -115;
        }
        field134++;
        for (class7 var1 = (class7) class74.field955.method2331((byte) 114); var1 != null; var1 = (class7) class74.field955.method2332(-121)) {
            if (var1.field92 > 0) {
                var1.field92--;
            }
            if (var1.field92 != 0) {
                if (var1.field97 > 0) {
                    var1.field97--;
                }
                if (var1.field97 == 0 && var1.field86 >= 1 && var1.field88 >= 1 && var1.field86 <= 102 && var1.field88 <= 102 && (var1.field101 < 0 || class232.method1638(var1.field90, var1.field101, (byte) -68))) {
                    class53.method324(var1.field88, var1.field102, var1.field91, var1.field90, var1.field103, var1.field86, var1.field101, 2);
                    var1.field97 = -1;
                    if (var1.field87 == var1.field101 && var1.field87 == -1) {
                        var1.method2285(arg0);
                    } else if (var1.field87 == var1.field101 && var1.field95 == var1.field91 && var1.field90 == var1.field89) {
                        var1.method2285(true);
                    }
                }
            } else if (var1.field87 < 0 || class232.method1638(var1.field89, var1.field87, (byte) -68)) {
                class53.method324(var1.field88, var1.field102, var1.field95, var1.field89, var1.field103, var1.field86, var1.field87, 2);
                var1.method2285(arg0);
            }
        }
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(B)V", line = 129)
    public static final void method53(byte arg0) {
        if (arg0 < -91) {
            field137++;
            class229.field3337 = new class224(32);
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lg;Z)V", line = 142)
    public static final void method54(class170 arg0, boolean arg1) {
        field138++;
        arg0.field2441 = false;
        if (arg0.field2376 != -1) {
            class247 var2 = class185.method1289(arg0.field2376, (byte) 107);
            if (var2 == null || var2.field3734 == null) {
                arg0.field2376 = -1;
            } else {
                arg0.field2370++;
                if (var2.field3734.length > arg0.field2363 && arg0.field2370 > var2.field3746[arg0.field2363]) {
                    arg0.field2363++;
                    arg0.field2370 = 1;
                    arg0.field2413++;
                    class337.method2329(class118.field1664 == arg0, var2, (byte) -97, arg0.field2392, arg0.field2357, arg0.field2363);
                }
                if (arg0.field2363 >= var2.field3734.length) {
                    arg0.field2363 = 0;
                    arg0.field2370 = 0;
                    class337.method2329(class118.field1664 == arg0, var2, (byte) -97, arg0.field2392, arg0.field2357, arg0.field2363);
                }
                arg0.field2413 = arg0.field2363 + 1;
                if (var2.field3734.length <= arg0.field2413) {
                    arg0.field2413 = 0;
                }
            }
        }
        if (arg0.field2372 != -1 && class38.field463 >= arg0.field2396) {
            class159 var3 = class120.method818((byte) 96, arg0.field2372);
            int var4 = var3.field2205;
            if (var4 == -1) {
                arg0.field2372 = -1;
            } else {
                label306: {
                    class247 var5 = class185.method1289(var4, (byte) 124);
                    if (var3.field2196) {
                        if (var5.field3752 == 3) {
                            if (arg0.field2450 > 0 && class38.field463 >= arg0.field2454 && class38.field463 > arg0.field2388) {
                                arg0.field2372 = -1;
                                break label306;
                            }
                        } else if (var5.field3752 == 1 && arg0.field2450 > 0 && arg0.field2454 <= class38.field463 && class38.field463 > arg0.field2388) {
                            arg0.field2396 = class38.field463 + 1;
                            break label306;
                        }
                    }
                    if (var5 == null || var5.field3734 == null) {
                        arg0.field2372 = -1;
                    } else {
                        if (arg0.field2449 < 0) {
                            arg0.field2449 = 0;
                            class337.method2329(class118.field1664 == arg0, var5, (byte) -97, arg0.field2392, arg0.field2357, 0);
                        }
                        arg0.field2408++;
                        if (arg0.field2449 < var5.field3734.length && var5.field3746[arg0.field2449] < arg0.field2408) {
                            arg0.field2408 = 1;
                            arg0.field2449++;
                            class337.method2329(class118.field1664 == arg0, var5, (byte) -97, arg0.field2392, arg0.field2357, arg0.field2449);
                        }
                        if (var5.field3734.length <= arg0.field2449) {
                            if (var3.field2196) {
                                arg0.field2424++;
                                arg0.field2449 -= var5.field3753;
                                if (arg0.field2424 >= var5.field3730) {
                                    arg0.field2372 = -1;
                                } else if (arg0.field2449 >= 0 && arg0.field2449 < var5.field3734.length) {
                                    class337.method2329(class118.field1664 == arg0, var5, (byte) -97, arg0.field2392, arg0.field2357, arg0.field2449);
                                } else {
                                    arg0.field2372 = -1;
                                }
                            } else {
                                arg0.field2372 = -1;
                            }
                        }
                        arg0.field2412 = arg0.field2449 + 1;
                        if (var5.field3734.length <= arg0.field2412) {
                            if (var3.field2196) {
                                arg0.field2412 -= var5.field3753;
                                if ((arg0.field2424 + 1) >= var5.field3730) {
                                    arg0.field2412 = -1;
                                } else if (arg0.field2412 < 0 || var5.field3734.length <= arg0.field2412) {
                                    arg0.field2412 = -1;
                                }
                            } else {
                                arg0.field2412 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg0.field2435 != -1 && arg0.field2365 <= 1) {
            class247 var6 = class185.method1289(arg0.field2435, (byte) 122);
            if (var6.field3752 == 3) {
                if (arg0.field2450 > 0 && class38.field463 >= arg0.field2454 && class38.field463 > arg0.field2388) {
                    arg0.field2435 = -1;
                }
            } else if (var6.field3752 == 1 && arg0.field2450 > 0 && arg0.field2454 <= class38.field463 && arg0.field2388 < class38.field463) {
                arg0.field2365 = 1;
            }
        }
        if (arg0.field2435 != -1 && arg0.field2365 == 0) {
            class247 var7 = class185.method1289(arg0.field2435, (byte) 120);
            if (var7 == null || var7.field3734 == null) {
                arg0.field2435 = -1;
            } else {
                arg0.field2366++;
                if (arg0.field2425 < var7.field3734.length && var7.field3746[arg0.field2425] < arg0.field2366) {
                    arg0.field2366 = 1;
                    arg0.field2425++;
                    class337.method2329(class118.field1664 == arg0, var7, (byte) -97, arg0.field2392, arg0.field2357, arg0.field2425);
                }
                if (arg0.field2425 >= var7.field3734.length) {
                    arg0.field2356++;
                    arg0.field2425 -= var7.field3753;
                    if (var7.field3730 <= arg0.field2356) {
                        arg0.field2435 = -1;
                    } else if (arg0.field2425 >= 0 && var7.field3734.length > arg0.field2425) {
                        class337.method2329(class118.field1664 == arg0, var7, (byte) -97, arg0.field2392, arg0.field2357, arg0.field2425);
                    } else {
                        arg0.field2435 = -1;
                    }
                }
                arg0.field2405 = arg0.field2425 + 1;
                if (var7.field3734.length <= arg0.field2405) {
                    arg0.field2405 -= var7.field3753;
                    if (var7.field3730 <= arg0.field2356 + 1) {
                        arg0.field2405 = -1;
                    } else if (arg0.field2405 < 0 || var7.field3734.length <= arg0.field2405) {
                        arg0.field2405 = -1;
                    }
                }
                arg0.field2441 = var7.field3745;
            }
        }
        if (arg0.field2365 > 0) {
            arg0.field2365--;
        }
        int var8 = 0;
        if (!arg1) {
            field136 = true;
        }
        while (arg0.field2364.length > var8) {
            class204 var9 = arg0.field2364[var8];
            if (var9 != null) {
                if (var9.field2858 > 0) {
                    var9.field2858--;
                } else {
                    class247 var10 = class185.method1289(var9.field2870, (byte) 124);
                    if (var10 == null || var10.field3734 == null) {
                        arg0.field2364[var8] = null;
                    } else {
                        var9.field2863++;
                        if (var9.field2866 < var10.field3734.length && var10.field3746[var9.field2866] < var9.field2863) {
                            var9.field2863 = 1;
                            var9.field2866++;
                            class337.method2329(class118.field1664 == arg0, var10, (byte) -97, arg0.field2392, arg0.field2357, var9.field2866);
                        }
                        if (var9.field2866 >= var10.field3734.length) {
                            var9.field2866 -= var10.field3753;
                            var9.field2861++;
                            if (var9.field2861 >= var10.field3730) {
                                arg0.field2364[var8] = null;
                            } else if (var9.field2866 >= 0 && var10.field3734.length > var9.field2866) {
                                class337.method2329(class118.field1664 == arg0, var10, (byte) -97, arg0.field2392, arg0.field2357, var9.field2866);
                            } else {
                                arg0.field2364[var8] = null;
                            }
                        }
                        var9.field2865 = var9.field2866 + 1;
                        if (var9.field2865 >= var10.field3734.length) {
                            var9.field2865 -= var10.field3753;
                            if (var10.field3730 <= (var9.field2861 + 1)) {
                                var9.field2865 = -1;
                            } else if (var9.field2865 < 0 || var9.field2865 >= var10.field3734.length) {
                                var9.field2865 = -1;
                            }
                        }
                    }
                }
            }
            var8++;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZLp;)Llf;", line = 441)
    public static final class133 method55(boolean arg0, class107 arg1) {
        field143++;
        return arg0 ? (class133) null : new class133(arg1.method656(-83), arg1.method656(86), arg1.method656(119), arg1.method656(-101), arg1.method656(-122), arg1.method656(121), arg1.method656(-111), arg1.method656(-119), arg1.method622((byte) -121), arg1.method661(-1));
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIZ)I", line = 456)
    public static final int method56(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            return 44;
        }
        field140++;
        if (arg1 == -1) {
            return 12345678;
        }
        int var3 = (arg1 & 0x7F) * arg0 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg1 & 0xFF80) + var3;
    }
}
