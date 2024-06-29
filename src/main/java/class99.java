import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class99 {

    @OriginalMember(owner = "client!r", name = "a", descriptor = "I")
    private int field1360 = 65000;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "Lfc;")
    private class141 field1366 = null;

    @OriginalMember(owner = "client!r", name = "h", descriptor = "Lfc;")
    private class141 field1367 = null;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "I")
    private int field1364;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "Lbj;")
    public static class131 field1365 = new class131(50);

    @OriginalMember(owner = "client!r", name = "i", descriptor = "I")
    public static int field1368 = 0;

    @OriginalMember(owner = "client!r", name = "l", descriptor = "[I")
    public static int[] field1371 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!r", name = "q", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!r", name = "o", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!r", name = "n", descriptor = "Lbj;")
    public static class131 field1373;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "I")
    public static int field1361;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "I")
    public static int field1362;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!r", name = "j", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!r", name = "k", descriptor = "I")
    public static int field1370;

    @OriginalMember(owner = "client!r", name = "m", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!r", name = "p", descriptor = "I")
    public static int field1375;

    @OriginalMember(owner = "client!r", name = "r", descriptor = "Lnq;")
    public static class268 field1377;

    @OriginalMember(owner = "client!r", name = "s", descriptor = "Luo;")
    public static class345 field1378;

    static {
        new class442("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do clã agora ");
        field1376 = 500;
        field1374 = 0;
        field1373 = new class131(64);
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "(ILfc;Lfc;I)V", line = 892)
    public class99(int arg0, class141 arg1, class141 arg2, int arg3) {
        this.field1366 = arg2;
        this.field1367 = arg1;
        this.field1364 = arg0;
        this.field1360 = arg3;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIZ[BI)Z", line = 9)
    private final boolean method711(int arg0, int arg1, boolean arg2, byte[] arg3, int arg4) {
        field1362++;
        class141 var6 = this.field1367;
        synchronized (this.field1367) {
            try {
                int var7;
                if (arg2) {
                    if ((long) (arg4 * 6 + 6) > this.field1366.method969(430)) {
                        return false;
                    }
                    this.field1366.method967((byte) -122, (long) (arg4 * 6));
                    this.field1366.method976(class139.field1997, arg1, 0, 6);
                    var7 = ((class139.field1997[3] & 0xFF) << 16) + ((class139.field1997[4] & 0xFF) << 8) + (class139.field1997[5] & 0xFF);
                    if (var7 <= 0 || this.field1367.method969(430) / 520L < (long) var7) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field1367.method969(430) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class139.field1997[5] = (byte) var7;
                class139.field1997[3] = (byte) (var7 >> 16);
                class139.field1997[2] = (byte) arg0;
                class139.field1997[0] = (byte) (arg0 >> 16);
                class139.field1997[1] = (byte) (arg0 >> 8);
                class139.field1997[4] = (byte) (var7 >> 8);
                this.field1366.method967((byte) -97, (long) (arg4 * 6));
                this.field1366.method973(6, 0, class139.field1997, arg1);
                int var10 = 0;
                int var11 = 0;
                while (var10 < arg0) {
                    int var12 = 0;
                    if (arg2) {
                        label105: {
                            this.field1367.method967((byte) -118, (long) (var7 * 520));
                            try {
                                this.field1367.method976(class139.field1997, -1, 0, 8);
                            } catch (EOFException var33) {
                                return true;
                            }
                            int var13 = (class139.field1997[0] & 0xFF << 8) + (class139.field1997[1] & 0xFF);
                            int var14 = (class139.field1997[2] & 0xFF << 8) + (class139.field1997[3] & 0xFF);
                            var12 = (class139.field1997[4] & 0xFF << 16) + ((class139.field1997[5] & 0xFF) << 8) + (class139.field1997[6] & 0xFF);
                            int var15 = class139.field1997[7] & 0xFF;
                            if (arg4 == var13 && var11 == var14 && this.field1364 == var15) {
                                if (var12 >= 0 && ((long) var12) <= (this.field1367.method969(430) / 520L)) {
                                    break label105;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        var12 = (int) ((this.field1367.method969(arg1 ^ 0xFFFFFE51) + 519L) / 520L);
                        arg2 = false;
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var7 == var12) {
                            var12++;
                        }
                    }
                    class139.field1997[1] = (byte) arg4;
                    class139.field1997[2] = (byte) (var11 >> 8);
                    if ((arg0 - var10) <= 512) {
                        var12 = 0;
                    }
                    class139.field1997[3] = (byte) var11;
                    class139.field1997[0] = (byte) (arg4 >> 8);
                    class139.field1997[6] = (byte) var12;
                    class139.field1997[5] = (byte) (var12 >> 8);
                    class139.field1997[7] = (byte) this.field1364;
                    class139.field1997[4] = (byte) (var12 >> 16);
                    this.field1367.method967((byte) -114, (long) (var7 * 520));
                    this.field1367.method973(8, 0, class139.field1997, -1);
                    int var18 = arg0 - var10;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    this.field1367.method973(var18, var10, arg3, -1);
                    var10 += var18;
                    var7 = var12;
                    var11++;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IB)[B", line = 125)
    public final byte[] method712(int arg0, byte arg1) {
        field1372++;
        class141 var3 = this.field1367;
        synchronized (this.field1367) {
            try {
                if (((long) (arg0 * 6 + 6)) > this.field1366.method969(430)) {
                    return null;
                }
                this.field1366.method967((byte) -128, (long) (arg0 * 6));
                this.field1366.method976(class139.field1997, -1, 0, 6);
                if (arg1 < 109) {
                    return null;
                }
                int var6 = (class139.field1997[0] & 0xFF << 16) + (class139.field1997[1] & 0xFF << 8) + (class139.field1997[2] & 0xFF);
                int var7 = (class139.field1997[4] & 0xFF << 8) + ((class139.field1997[3] & 0xFF) << 16) + (class139.field1997[5] & 0xFF);
                if (var6 < 0 || var6 > this.field1360) {
                    return null;
                } else if (var7 > 0 && this.field1367.method969(430) / 520L >= (long) var7) {
                    byte[] var10 = new byte[var6];
                    int var11 = 0;
                    int var12 = 0;
                    label74: while (var11 < var6) {
                        if (var7 == 0) {
                            return null;
                        }
                        this.field1367.method967((byte) -116, (long) (var7 * 520));
                        int var14 = var6 - var11;
                        if (var14 > 512) {
                            var14 = 512;
                        }
                        this.field1367.method976(class139.field1997, -1, 0, var14 + 8);
                        int var15 = (class139.field1997[0] & 0xFF << 8) + (class139.field1997[1] & 0xFF);
                        int var16 = (class139.field1997[2] & 0xFF << 8) + (class139.field1997[3] & 0xFF);
                        int var17 = ((class139.field1997[5] & 0xFF) << 8) + ((class139.field1997[4] & 0xFF) << 16) + (class139.field1997[6] & 0xFF);
                        int var18 = class139.field1997[7] & 0xFF;
                        if (arg0 == var15 && var12 == var16 && this.field1364 == var18) {
                            if (var17 >= 0 && this.field1367.method969(430) / 520L >= (long) var17) {
                                var7 = var17;
                                var12++;
                                int var21 = 0;
                                while (true) {
                                    if (var14 <= var21) {
                                        continue label74;
                                    }
                                    var10[var11++] = class139.field1997[var21 + 8];
                                    var21++;
                                }
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

    @OriginalMember(owner = "client!r", name = "toString", descriptor = "()Ljava/lang/String;", line = 214)
    public final String toString() {
        field1361++;
        return "Cache:" + this.field1364;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II[BI)Z", line = 223)
    public final boolean method713(int arg0, int arg1, byte[] arg2, int arg3) {
        field1363++;
        class141 var5 = this.field1367;
        synchronized (this.field1367) {
            if (arg1 < 0 || arg1 > this.field1360) {
                throw new IllegalArgumentException();
            }
            int var6 = -51 % ((arg3 + 74) / 36);
            boolean var7 = this.method711(arg1, -1, true, arg2, arg0);
            if (!var7) {
                var7 = this.method711(arg1, -1, false, arg2, arg0);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V", line = 250)
    public static void method714(int arg0) {
        field1378 = null;
        field1373 = null;
        field1371 = null;
        if (arg0 != 8) {
            field1376 = 73;
        }
        field1365 = null;
        field1377 = null;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIZIZIIILuo;IIILhh;)V", line = 273)
    public static final void method715(int arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, class345 arg8, int arg9, int arg10, int arg11, class67 arg12) {
        field1369++;
        if (!class51.method428(-1) && !class85.method614(class125.field1760, arg11, -31202, arg5, arg9)) {
            return;
        }
        if (arg5 < class268.field3727) {
            class268.field3727 = arg5;
        }
        class64 var13 = class375.method2395((byte) 9, arg3);
        if (class326.field4462 == 1 && var13.field915) {
            return;
        }
        int var14;
        int var15;
        if (arg7 == arg10 || arg7 == 3) {
            var15 = var13.field950;
            var14 = var13.field872;
        } else {
            var14 = var13.field950;
            var15 = var13.field872;
        }
        int var16;
        int var17;
        if (arg9 + var15 <= class211.field2954) {
            var16 = (var15 >> 1) + arg9;
            var17 = (var15 + 1 >> 1) + arg9;
        } else {
            var17 = arg9 + 1;
            var16 = arg9;
        }
        int var18;
        int var19;
        if (class290.field4061 < arg11 + var14) {
            var18 = arg11 + 1;
            var19 = arg11;
        } else {
            var18 = (var14 + 1 >> 1) + arg11;
            var19 = arg11 + (var14 >> 1);
        }
        class242 var20 = class375.field5354[arg6];
        int var21 = var20.method737(var16, var19) - (-var20.method737(var17, var19) - var20.method737(var16, var18) - var20.method737(var17, var18)) >> 2;
        int var22 = (arg9 << 7) + (var15 << 6);
        int var23 = (arg11 << 7) + (var14 << 6);
        boolean var24 = arg4 && !arg2 && var13.field905;
        if (var13.method487(4096)) {
            class369.method2373(arg10, arg11, (class134) null, arg7, (class198) null, arg9, var13, arg5);
        }
        boolean var25 = arg0 == -1 && var13.field876 == -1 && var13.field896 == null && var13.field908 == null && !var13.field938;
        if (class192.field2648 && var13.field898 != 1) {
            return;
        }
        if (arg1 == 22) {
            if (class154.field2169 || var13.field922 != 0 || var13.field906 == 1 || var13.field955) {
                class109 var27;
                if (var25) {
                    class362 var26 = new class362(arg8, var13, arg6, var22, var21, var23, arg2, arg7, var24);
                    if (var26.method691((byte) -72)) {
                        var26.method677(arg8, 67);
                    }
                    var27 = var26;
                } else {
                    var27 = new class371(arg8, var13, arg7, arg5, arg6, var22, var21, var23, arg2, arg0);
                }
                class196.method1265(arg5, arg9, arg11, var27);
                if (var13.field906 == 1 && arg12 != null) {
                    arg12.method516(arg9, (byte) -96, arg11);
                }
            }
        } else if (arg1 == 10 || arg1 == 11) {
            class347 var65 = null;
            class447 var66;
            int var67;
            if (var25) {
                class347 var68 = new class347(arg8, var13, arg5, arg6, var22, var21, var23, arg2, arg9, var15 + arg9 - 1, arg11, arg11 + var14 - 1, arg1, arg7, var24);
                var66 = var68;
                var67 = var68.method2198(arg10 ^ 0x7210);
                var65 = var68;
            } else {
                var66 = new class132(arg8, var13, arg1, arg7, arg5, arg6, var22, var21, var23, arg2, arg9, var15 + arg9 - 1, arg11, arg11 + var14 - 1, arg0);
                var67 = 15;
            }
            if (class80.method583(var66, false)) {
                if (var65 != null && var65.method691((byte) -72)) {
                    var65.method677(arg8, 125);
                }
                if (var13.field946 && arg4) {
                    if (var67 > 30) {
                        var67 = 30;
                    }
                    for (int var69 = 0; var69 <= var15; var69++) {
                        for (int var70 = 0; var70 <= var14; var70++) {
                            var20.method738(arg9 + var69, arg11 - -var70, var67);
                        }
                    }
                }
            }
            if (var13.field906 != 0 && arg12 != null) {
                arg12.method529(var13.field953, !var13.field926, arg10 ^ 0xFFFFFF99, var15, arg9, arg11, var14);
            }
        } else if (!(arg1 < 12 || arg1 > 17) || !(arg1 < 18 || arg1 > 21)) {
            class447 var29;
            if (var25) {
                class347 var28 = new class347(arg8, var13, arg5, arg6, var22, var21, var23, arg2, arg9, var15 + arg9 - 1, arg11, arg11 + var14 - 1, arg1, arg7, var24);
                var29 = var28;
                if (var28.method691((byte) -72)) {
                    var28.method677(arg8, 121);
                }
            } else {
                var29 = new class132(arg8, var13, arg1, arg7, arg5, arg6, var22, var21, var23, arg2, arg9, arg9 + var15 - 1, arg11, arg11 + var14 - 1, arg0);
            }
            class80.method583(var29, false);
            if (arg4 && !arg2 && arg1 >= 12 && arg1 <= 17 && arg1 != 13 && arg5 > 0 && var13.field898 != 0) {
                class195.field2682[arg5][arg9][arg11] = (byte) class393.method2487(class195.field2682[arg5][arg9][arg11], 4);
            }
            if (var13.field906 != 0 && arg12 != null) {
                arg12.method529(var13.field953, !var13.field926, arg10 ^ 0xFFFFFFA8, var15, arg9, arg11, var14);
            }
        } else if (arg1 == 0) {
            class34 var31;
            if (var25) {
                class95 var30 = new class95(arg8, var13, arg6, var22, var21, var23, arg2, arg1, arg7, var24);
                var31 = var30;
                if (var30.method691((byte) -72)) {
                    var30.method677(arg8, 47);
                }
            } else {
                var31 = new class440(arg8, var13, 0, arg7, arg5, arg6, var22, var21, var23, arg2, arg0);
            }
            class2.method12(arg5, arg9, arg11, var31, (class34) null);
            if (arg4) {
                if (arg7 == 0) {
                    if (var13.field946) {
                        var20.method738(arg9, arg11, 50);
                        var20.method738(arg9, arg11 + 1, 50);
                    }
                    if (var13.field898 == 1 && !arg2) {
                        class195.field2682[arg5][arg9][arg11] = (byte) class393.method2487(class195.field2682[arg5][arg9][arg11], 1);
                    }
                } else if (arg7 == 1) {
                    if (var13.field946) {
                        var20.method738(arg9, arg11 + 1, 50);
                        var20.method738(arg9 + 1, arg11 + 1, 50);
                    }
                    if (var13.field898 == 1 && !arg2) {
                        class195.field2682[arg5][arg9][arg11 + 1] = (byte) class393.method2487(class195.field2682[arg5][arg9][arg11 + 1], 2);
                    }
                } else if (arg7 == 2) {
                    if (var13.field946) {
                        var20.method738(arg9 + 1, arg11, 50);
                        var20.method738(arg9 + 1, arg11 + 1, 50);
                    }
                    if (var13.field898 == 1 && !arg2) {
                        class195.field2682[arg5][arg9 + 1][arg11] = (byte) class393.method2487(class195.field2682[arg5][arg9 + 1][arg11], 1);
                    }
                } else if (arg7 == 3) {
                    if (var13.field946) {
                        var20.method738(arg9, arg11, 50);
                        var20.method738(arg9 + 1, arg11, 50);
                    }
                    if (var13.field898 == 1 && !arg2) {
                        class195.field2682[arg5][arg9][arg11] = (byte) class393.method2487(class195.field2682[arg5][arg9][arg11], 2);
                    }
                }
            }
            if (var13.field906 != 0 && arg12 != null) {
                arg12.method525(!var13.field926, arg9, var13.field953, arg1, 26121, arg7, arg11);
            }
            if (var13.field943 != 16) {
                class367.method2362(arg5, arg9, arg11, var13.field943);
            }
        } else if (arg1 == 1) {
            class34 var32;
            if (var25) {
                class95 var33 = new class95(arg8, var13, arg6, var22, var21, var23, arg2, arg1, arg7, var24);
                if (var33.method691((byte) -72)) {
                    var33.method677(arg8, 110);
                }
                var32 = var33;
            } else {
                var32 = new class440(arg8, var13, 1, arg7, arg5, arg6, var22, var21, var23, arg2, arg0);
            }
            class2.method12(arg5, arg9, arg11, var32, (class34) null);
            if (var13.field946 && arg4) {
                if (arg7 == 0) {
                    var20.method738(arg9, arg11 + 1, 50);
                } else if (arg7 == 1) {
                    var20.method738(arg9 + 1, arg11 - -1, 50);
                } else if (arg7 == 2) {
                    var20.method738(arg9 + 1, arg11, 50);
                } else if (arg7 == 3) {
                    var20.method738(arg9, arg11, 50);
                }
            }
            if (var13.field906 != 0 && arg12 != null) {
                arg12.method525(!var13.field926, arg9, var13.field953, arg1, arg10 + 26120, arg7, arg11);
            }
        } else if (arg1 == 2) {
            int var34 = arg7 + 1 & 0x3;
            class34 var37;
            class34 var38;
            if (var25) {
                class95 var35 = new class95(arg8, var13, arg6, var22, var21, var23, arg2, arg1, arg7 + 4, var24);
                class95 var36 = new class95(arg8, var13, arg6, var22, var21, var23, arg2, arg1, var34, var24);
                if (var35.method691((byte) -72)) {
                    var35.method677(arg8, 80);
                }
                var37 = var36;
                if (var36.method691((byte) -72)) {
                    var36.method677(arg8, 107);
                }
                var38 = var35;
            } else {
                var38 = new class440(arg8, var13, 2, arg7 + 4, arg5, arg6, var22, var21, var23, arg2, arg0);
                var37 = new class440(arg8, var13, 2, var34, arg5, arg6, var22, var21, var23, arg2, arg0);
            }
            class2.method12(arg5, arg9, arg11, var38, var37);
            if (var13.field898 == 1 && arg4 && !arg2) {
                if (arg7 == 0) {
                    class195.field2682[arg5][arg9][arg11] = (byte) class393.method2487(class195.field2682[arg5][arg9][arg11], 1);
                    class195.field2682[arg5][arg9][arg11 + 1] = (byte) class393.method2487(class195.field2682[arg5][arg9][arg11 + 1], 2);
                } else if (arg7 == 1) {
                    class195.field2682[arg5][arg9][arg11 + 1] = (byte) class393.method2487(class195.field2682[arg5][arg9][arg11 + 1], 2);
                    class195.field2682[arg5][arg9 + 1][arg11] = (byte) class393.method2487(class195.field2682[arg5][arg9 + 1][arg11], 1);
                } else if (arg7 == 2) {
                    class195.field2682[arg5][arg9 + 1][arg11] = (byte) class393.method2487(class195.field2682[arg5][arg9 + 1][arg11], 1);
                    class195.field2682[arg5][arg9][arg11] = (byte) class393.method2487(class195.field2682[arg5][arg9][arg11], 2);
                } else if (arg7 == 3) {
                    class195.field2682[arg5][arg9][arg11] = (byte) class393.method2487(class195.field2682[arg5][arg9][arg11], 2);
                    class195.field2682[arg5][arg9][arg11] = (byte) class393.method2487(class195.field2682[arg5][arg9][arg11], 1);
                }
            }
            if (var13.field906 != 0 && arg12 != null) {
                arg12.method525(!var13.field926, arg9, var13.field953, arg1, 26121, arg7, arg11);
            }
            if (var13.field943 != 16) {
                class367.method2362(arg5, arg9, arg11, var13.field943);
            }
        } else if (arg1 == 3) {
            class34 var39;
            if (var25) {
                class95 var40 = new class95(arg8, var13, arg6, var22, var21, var23, arg2, arg1, arg7, var24);
                if (var40.method691((byte) -72)) {
                    var40.method677(arg8, 57);
                }
                var39 = var40;
            } else {
                var39 = new class440(arg8, var13, 3, arg7, arg5, arg6, var22, var21, var23, arg2, arg0);
            }
            class2.method12(arg5, arg9, arg11, var39, (class34) null);
            if (var13.field946 && arg4) {
                if (arg7 == 0) {
                    var20.method738(arg9, arg11 + 1, 50);
                } else if (arg7 == 1) {
                    var20.method738(arg9 + 1, arg11 - -1, 50);
                } else if (arg7 == 2) {
                    var20.method738(arg9 + 1, arg11, 50);
                } else if (arg7 == 3) {
                    var20.method738(arg9, arg11, 50);
                }
            }
            if (var13.field906 != 0 && arg12 != null) {
                arg12.method525(!var13.field926, arg9, var13.field953, arg1, 26121, arg7, arg11);
            }
        } else if (arg1 == 9) {
            class447 var41;
            if (var25) {
                class347 var42 = new class347(arg8, var13, arg5, arg6, var22, var21, var23, arg2, arg9, arg9, arg11, arg11, arg1, arg7, var24);
                if (var42.method691((byte) -72)) {
                    var42.method677(arg8, arg10 + 76);
                }
                var41 = var42;
            } else {
                var41 = new class132(arg8, var13, arg1, arg7, arg5, arg6, var22, var21, var23, arg2, arg9, arg9 + var15 - 1, arg11, arg11 + var14 - 1, arg0);
            }
            class80.method583(var41, false);
            if (var13.field906 != 0 && arg12 != null) {
                arg12.method529(var13.field953, !var13.field926, -114, var15, arg9, arg11, var14);
            }
            if (var13.field943 != 16) {
                class367.method2362(arg5, arg9, arg11, var13.field943);
            }
        } else if (arg1 == 4) {
            class214 var44;
            if (var25) {
                class280 var43 = new class280(arg8, var13, arg6, var22, var21, var23, arg2, 0, 0, 0, arg1, arg7);
                var44 = var43;
                if (var43.method691((byte) -72)) {
                    var43.method677(arg8, 60);
                }
            } else {
                var44 = new class247(arg8, var13, arg1, arg7, arg5, arg6, var22, var21, var23, arg2, 0, 0, 0, arg0);
            }
            class348.method2205(arg5, arg9, arg11, var44, (class214) null);
        } else if (arg1 == 5) {
            int var45 = 16;
            class193 var46 = (class193) class244.method1655(arg5, arg9, arg11);
            if (var46 != null) {
                var45 = class375.method2395((byte) 75, var46.method689((byte) -83)).field943;
            }
            class214 var48;
            if (var25) {
                class280 var47 = new class280(arg8, var13, arg6, var22, var21, var23, arg2, 0, class151.field2133[arg7] * var45, class207.field2848[arg7] * var45, arg1, arg7);
                if (var47.method691((byte) -72)) {
                    var47.method677(arg8, 61);
                }
                var48 = var47;
            } else {
                var48 = new class247(arg8, var13, arg1, arg7, arg5, arg6, var22, var21, var23, arg2, 0, class151.field2133[arg7] * var45, class207.field2848[arg7] * var45, arg0);
            }
            class348.method2205(arg5, arg9, arg11, var48, (class214) null);
        } else if (arg1 == 6) {
            int var49 = 8;
            class193 var50 = (class193) class244.method1655(arg5, arg9, arg11);
            if (var50 != null) {
                var49 = class375.method2395((byte) 126, var50.method689((byte) -83)).field943 / 2;
            }
            class214 var52;
            if (var25) {
                class280 var51 = new class280(arg8, var13, arg6, var22, var21, var23, arg2, arg7, class151.field2133[arg7] * var49, class207.field2848[arg7] * var49, arg1, arg7 + 4);
                var52 = var51;
                if (var51.method691((byte) -72)) {
                    var51.method677(arg8, 59);
                }
            } else {
                var52 = new class247(arg8, var13, arg1, arg7 + 4, arg5, arg6, var22, var21, var23, arg2, arg7, class248.field3513[arg7] * var49, class143.field2054[arg7] * var49, arg0);
            }
            class348.method2205(arg5, arg9, arg11, var52, (class214) null);
        } else if (arg1 == 7) {
            int var53 = arg7 + 2 & 0x3;
            class214 var54;
            if (var25) {
                class280 var55 = new class280(arg8, var13, arg6, var22, var21, var23, arg2, var53, 0, 0, arg1, var53 + 4);
                if (var55.method691((byte) -72)) {
                    var55.method677(arg8, 65);
                }
                var54 = var55;
            } else {
                var54 = new class247(arg8, var13, arg1, var53 + 4, arg5, arg6, var22, var21, var23, arg2, var53, 0, 0, arg0);
            }
            class348.method2205(arg5, arg9, arg11, var54, (class214) null);
        } else if (arg1 == 8) {
            int var56 = arg7 + 2 & 0x3;
            int var57 = 8;
            class193 var58 = (class193) class244.method1655(arg5, arg9, arg11);
            if (var58 != null) {
                var57 = class375.method2395((byte) 40, var58.method689((byte) -83)).field943 / 2;
            }
            class214 var61;
            class214 var62;
            if (var25) {
                class280 var59 = new class280(arg8, var13, arg6, var22, var21, var23, arg2, arg7, class248.field3513[arg7] * var57, class143.field2054[arg7] * var57, arg1, arg7 + 4);
                class280 var60 = new class280(arg8, var13, arg6, var22, var21, var23, arg2, arg7, 0, 0, arg1, var56 + 4);
                if (var59.method691((byte) -72)) {
                    var59.method677(arg8, 120);
                }
                var61 = var59;
                var62 = var60;
                if (var60.method691((byte) -72)) {
                    var60.method677(arg8, 105);
                }
            } else {
                class247 var63 = new class247(arg8, var13, arg1, arg7 + 4, arg5, arg6, var22, var21, var23, arg2, arg7, class248.field3513[arg7] * var57, class143.field2054[arg7] * var57, arg0);
                class247 var64 = new class247(arg8, var13, arg1, var56 + 4, arg5, arg6, var22, var21, var23, arg2, arg7, 0, 0, arg0);
                var61 = var63;
                var62 = var64;
            }
            class348.method2205(arg5, arg9, arg11, var61, var62);
        }
    }
}
