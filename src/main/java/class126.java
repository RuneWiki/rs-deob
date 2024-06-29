import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class126 {

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "I")
    private int field3002 = 65000;

    @OriginalMember(owner = "client!sa", name = "p", descriptor = "Lo;")
    private class97 field3017 = null;

    @OriginalMember(owner = "client!sa", name = "s", descriptor = "Lo;")
    private class97 field3020 = null;

    @OriginalMember(owner = "client!sa", name = "v", descriptor = "I")
    private int field3023;

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "I")
    public static int field3003 = -1;

    @OriginalMember(owner = "client!sa", name = "l", descriptor = "Laf;")
    public static class7 field3013 = null;

    @OriginalMember(owner = "client!sa", name = "k", descriptor = "Laf;")
    public static class7 field3012 = class48.method406(40, "Geben Sie Ihren Benutzernamen");

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "I")
    public static int field3007 = 0;

    @OriginalMember(owner = "client!sa", name = "r", descriptor = "Laf;")
    private static class7 field3019 = class48.method406(40, "This world is full)3");

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "Laf;")
    public static class7 field3008 = field3019;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "Laf;")
    public static class7 field3004 = class48.method406(40, " x ");

    @OriginalMember(owner = "client!sa", name = "w", descriptor = "I")
    public static int field3024 = 0;

    @OriginalMember(owner = "client!sa", name = "u", descriptor = "Laf;")
    private static class7 field3022 = class48.method406(40, "Connecting to update server");

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "Laf;")
    public static class7 field3006 = field3022;

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "I")
    public static int field3009;

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "I")
    public static int field3010;

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "I")
    public static int field3011;

    @OriginalMember(owner = "client!sa", name = "m", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "client!sa", name = "n", descriptor = "I")
    public static int field3015;

    @OriginalMember(owner = "client!sa", name = "o", descriptor = "I")
    public static int field3016;

    @OriginalMember(owner = "client!sa", name = "q", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!sa", name = "t", descriptor = "I")
    public static int field3021;

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "Lkb;")
    public static class71 field3005;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IZLkb;BLaf;Laf;I)V")
    public static final void method1041(int arg0, boolean arg1, class71 arg2, byte arg3, class7 arg4, class7 arg5, int arg6) {
        if (arg3 == 0) {
            field3015++;
            int var7 = arg2.method586(arg5, -4795);
            int var8 = arg2.method560(arg4, var7, arg3 - 100);
            class151.method1197((byte) -9, var8, arg0, arg1, arg2, arg6, var7);
        }
    }

    @OriginalMember(owner = "client!sa", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3021++;
        return "Cache:" + this.field3023;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)[B")
    public final byte[] method1042(int arg0, int arg1) {
        field3011++;
        class97 var3 = this.field3020;
        synchronized (this.field3020) {
            try {
                if ((long) (arg1 * 6 + 6) > this.field3017.method791(false)) {
                    return null;
                }
                this.field3017.method789(true, (long) (arg1 * 6));
                this.field3017.method794(0, 6, class43.field1027, 0);
                int var5 = ((class43.field1027[1] & 0xFF) << 8) + ((class43.field1027[0] & 0xFF) << 16) + (class43.field1027[2] & 0xFF);
                if (arg0 != -23815) {
                    method1045(64);
                }
                int var6 = ((class43.field1027[3] & 0xFF) << 16) + (class43.field1027[5] & 0xFF) + ((class43.field1027[4] & 0xFF) << 8);
                if (var5 < 0 || this.field3002 < var5) {
                    return null;
                } else if (var6 > 0 && this.field3020.method791(false) / 520L >= (long) var6) {
                    int var9 = 0;
                    byte[] var10 = new byte[var5];
                    int var11 = 0;
                    while (var9 < var5) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field3020.method789(true, (long) (var6 * 520));
                        int var13 = var5 - var9;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field3020.method794(0, var13 + 8, class43.field1027, arg0 ^ 0xFFFFA2F9);
                        int var14 = ((class43.field1027[0] & 0xFF) << 8) + (class43.field1027[1] & 0xFF);
                        int var15 = ((class43.field1027[2] & 0xFF) << 8) + (class43.field1027[3] & 0xFF);
                        int var16 = class43.field1027[7] & 0xFF;
                        int var17 = (class43.field1027[6] & 0xFF) + ((class43.field1027[4] & 0xFF) << 16) + ((class43.field1027[5] & 0xFF) << 8);
                        if (arg1 == var14 && var11 == var15 && this.field3023 == var16) {
                            if (var17 >= 0 && this.field3020.method791(false) / 520L >= (long) var17) {
                                var11++;
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var10[var9++] = class43.field1027[var20 + 8];
                                }
                                var6 = var17;
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
            } catch (IOException var39) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZIII[B)Z")
    private final boolean method1043(boolean arg0, int arg1, int arg2, int arg3, byte[] arg4) {
        field3009++;
        class97 var6 = this.field3020;
        synchronized (this.field3020) {
            if (arg3 > -115) {
                this.field3002 = -5;
            }
            try {
                int var7;
                if (arg0) {
                    if (this.field3017.method791(false) < (long) (arg1 * 6 + 6)) {
                        return false;
                    }
                    this.field3017.method789(true, (long) (arg1 * 6));
                    this.field3017.method794(0, 6, class43.field1027, 0);
                    var7 = (class43.field1027[5] & 0xFF) + ((class43.field1027[3] & 0xFF) << 16) + ((class43.field1027[4] & 0xFF) << 8);
                    if (var7 <= 0 || this.field3020.method791(false) / 520L < (long) var7) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field3020.method791(false) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class43.field1027[0] = (byte) (arg2 >> 16);
                int var10 = 0;
                class43.field1027[1] = (byte) (arg2 >> 8);
                class43.field1027[2] = (byte) arg2;
                class43.field1027[3] = (byte) (var7 >> 16);
                class43.field1027[5] = (byte) var7;
                class43.field1027[4] = (byte) (var7 >> 8);
                this.field3017.method789(true, (long) (arg1 * 6));
                int var11 = 0;
                this.field3017.method788(class43.field1027, (byte) 89, 6, 0);
                while (arg2 > var10) {
                    int var12 = 0;
                    if (arg0) {
                        label109: {
                            this.field3020.method789(true, (long) (var7 * 520));
                            try {
                                this.field3020.method794(0, 8, class43.field1027, 0);
                            } catch (EOFException var33) {
                                return true;
                            }
                            var12 = (class43.field1027[6] & 0xFF) + ((class43.field1027[5] & 0xFF) << 8) + ((class43.field1027[4] & 0xFF) << 16);
                            int var13 = ((class43.field1027[0] & 0xFF) << 8) + (class43.field1027[1] & 0xFF);
                            int var14 = class43.field1027[7] & 0xFF;
                            int var15 = ((class43.field1027[2] & 0xFF) << 8) + (class43.field1027[3] & 0xFF);
                            if (arg1 == var13 && var11 == var15 && this.field3023 == var14) {
                                if (var12 >= 0 && (long) var12 <= this.field3020.method791(false) / 520L) {
                                    break label109;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        arg0 = false;
                        var12 = (int) ((this.field3020.method791(false) + 519L) / 520L);
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var7 == var12) {
                            var12++;
                        }
                    }
                    class43.field1027[3] = (byte) var11;
                    class43.field1027[0] = (byte) (arg1 >> 8);
                    if (arg2 - var10 <= 512) {
                        var12 = 0;
                    }
                    class43.field1027[5] = (byte) (var12 >> 8);
                    int var18 = arg2 - var10;
                    class43.field1027[1] = (byte) arg1;
                    class43.field1027[4] = (byte) (var12 >> 16);
                    class43.field1027[2] = (byte) (var11 >> 8);
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    class43.field1027[6] = (byte) var12;
                    class43.field1027[7] = (byte) this.field3023;
                    this.field3020.method789(true, (long) (var7 * 520));
                    var7 = var12;
                    this.field3020.method788(class43.field1027, (byte) -62, 8, 0);
                    var11++;
                    this.field3020.method788(arg4, (byte) 98, var18, var10);
                    var10 += var18;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(BI[BI)Z")
    public final boolean method1044(byte arg0, int arg1, byte[] arg2, int arg3) {
        if (arg0 != -23) {
            return true;
        }
        field3016++;
        class97 var5 = this.field3020;
        synchronized (this.field3020) {
            if (arg1 < 0 || arg1 > this.field3002) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method1043(true, arg3, arg1, -119, arg2);
            if (!var6) {
                var6 = this.method1043(false, arg3, arg1, arg0 - 93, arg2);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V")
    public static void method1045(int arg0) {
        field3013 = null;
        field3005 = null;
        field3006 = null;
        field3022 = null;
        field3019 = null;
        field3012 = null;
        field3008 = null;
        field3004 = null;
        if (arg0 != -2177) {
            method1046(38, 114, -70, 34);
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIII)I")
    public static final int method1046(int arg0, int arg1, int arg2, int arg3) {
        field3014++;
        int var4 = arg3 & 0x3;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return 7 - arg1;
        } else {
            if (arg2 != 7) {
                method1047(null, -25, -97, -97, -56, null, 42, -19, -126);
            }
            return var4 == 2 ? 7 - arg0 : arg1;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lrf;IIIILmd;III)V")
    public static final void method1047(class124 arg0, int arg1, int arg2, int arg3, int arg4, class87 arg5, int arg6, int arg7, int arg8) {
        field3018++;
        if (class91.field2106 && (class25.field670[0][arg4][arg3] & 0x2) == 0) {
            if ((class25.field670[arg2][arg4][arg3] & 0x10) != 0) {
                return;
            }
            if (class64.method525(arg4, arg3, arg2, (byte) 56) != class45.field1078) {
                return;
            }
        }
        if (class86.field2019 > arg2) {
            class86.field2019 = arg2;
        }
        int var9 = class108.field2636[arg2][arg4 + 1][arg3];
        int var10 = class108.field2636[arg2][arg4][arg3];
        int var11 = class108.field2636[arg2][arg4 + 1][arg3 + 1];
        int var12 = class108.field2636[arg2][arg4][arg3 + 1];
        class82 var13 = class155.method1214((byte) -113, arg6);
        int var14 = var9 + var11 + var10 + var12 >> 2;
        int var15 = (arg1 << 6) + arg7;
        if (var13.field1878 == 1) {
            var15 += 256;
        }
        int var16 = (arg3 << 7) + arg4 + (arg6 << 14) + 1073741824;
        if (var13.field1929 == 0) {
            var16 += Integer.MIN_VALUE;
        }
        if (var13.method683((byte) -92)) {
            class115.method900(arg1, arg4, arg2, true, var13, arg3);
        }
        if (arg7 == 22) {
            if (!class91.field2106 || var13.field1929 != 0 || var13.field1897 == 1 || var13.field1896) {
                class101 var17;
                if (var13.field1933 == -1 && var13.field1926 == null) {
                    var17 = var13.method687(22, var11, var9, var12, var10, arg1, 0);
                } else {
                    var17 = new class52(arg6, 22, arg1, var10, var9, var11, var12, var13.field1933, true, null);
                }
                arg0.method1020(arg2, arg4, arg3, var14, var17, var16, var15);
                if (var13.field1897 == 1 && arg5 != null) {
                    arg5.method712(arg4, arg3, 262144);
                }
            }
        } else if (arg7 == 10 || arg7 == 11) {
            class101 var37;
            if (var13.field1933 == -1 && var13.field1926 == null) {
                var37 = var13.method687(10, var11, var9, var12, var10, arg1, 0);
            } else {
                var37 = new class52(arg6, 10, arg1, var10, var9, var11, var12, var13.field1933, true, null);
            }
            if (var37 != null) {
                int var38 = 0;
                int var39;
                int var40;
                if (arg1 == 1 || arg1 == 3) {
                    var40 = var13.field1917;
                    var39 = var13.field1914;
                } else {
                    var39 = var13.field1917;
                    var40 = var13.field1914;
                }
                if (arg7 == 11) {
                    var38 += 256;
                }
                if (arg0.method1010(arg2, arg4, arg3, var14, var39, var40, var37, var38, var16, var15) && var13.field1930) {
                    int var41 = 15;
                    if (var37 instanceof class31) {
                        var41 = ((class31) var37).method269() / 4;
                        if (var41 > 30) {
                            var41 = 30;
                        }
                    }
                    for (int var42 = 0; var42 <= var39; var42++) {
                        for (int var43 = 0; var43 <= var40; var43++) {
                            if (var41 > class127.field3057[arg2][arg4 + var42][arg3 + var43]) {
                                class127.field3057[arg2][arg4 + var42][arg3 + var43] = (byte) var41;
                            }
                        }
                    }
                }
            }
            if (var13.field1897 != 0 && arg5 != null) {
                arg5.method711(arg4, arg1, arg3, var13.field1914, var13.field1917, (byte) -128, var13.field1928);
            }
        } else if (arg7 >= 12) {
            class101 var18;
            if (var13.field1933 == -1 && var13.field1926 == null) {
                var18 = var13.method687(arg7, var11, var9, var12, var10, arg1, 0);
            } else {
                var18 = new class52(arg6, arg7, arg1, var10, var9, var11, var12, var13.field1933, true, null);
            }
            arg0.method1010(arg2, arg4, arg3, var14, 1, 1, var18, 0, var16, var15);
            if (arg7 >= 12 && arg7 <= 17 && arg7 != 13 && arg2 > 0) {
                class111.field2697[arg2][arg4][arg3] = class141.method1150(class111.field2697[arg2][arg4][arg3], 2340);
            }
            if (var13.field1897 != 0 && arg5 != null) {
                arg5.method711(arg4, arg1, arg3, var13.field1914, var13.field1917, (byte) -128, var13.field1928);
            }
        } else {
            if (arg8 > -74) {
                field3003 = -44;
            }
            if (arg7 == 0) {
                class101 var19;
                if (var13.field1933 == -1 && var13.field1926 == null) {
                    var19 = var13.method687(0, var11, var9, var12, var10, arg1, 0);
                } else {
                    var19 = new class52(arg6, 0, arg1, var10, var9, var11, var12, var13.field1933, true, null);
                }
                arg0.method1005(arg2, arg4, arg3, var14, var19, null, class109.field2659[arg1], 0, var16, var15);
                if (arg1 == 0) {
                    if (var13.field1930) {
                        class127.field3057[arg2][arg4][arg3] = 50;
                        class127.field3057[arg2][arg4][arg3 + 1] = 50;
                    }
                    if (var13.field1907) {
                        class111.field2697[arg2][arg4][arg3] = class141.method1150(class111.field2697[arg2][arg4][arg3], 585);
                    }
                } else if (arg1 == 1) {
                    if (var13.field1930) {
                        class127.field3057[arg2][arg4][arg3 + 1] = 50;
                        class127.field3057[arg2][arg4 + 1][arg3 + 1] = 50;
                    }
                    if (var13.field1907) {
                        class111.field2697[arg2][arg4][arg3 + 1] = class141.method1150(class111.field2697[arg2][arg4][arg3 + 1], 1170);
                    }
                } else if (arg1 == 2) {
                    if (var13.field1930) {
                        class127.field3057[arg2][arg4 + 1][arg3] = 50;
                        class127.field3057[arg2][arg4 + 1][arg3 + 1] = 50;
                    }
                    if (var13.field1907) {
                        class111.field2697[arg2][arg4 + 1][arg3] = class141.method1150(class111.field2697[arg2][arg4 + 1][arg3], 585);
                    }
                } else if (arg1 == 3) {
                    if (var13.field1930) {
                        class127.field3057[arg2][arg4][arg3] = 50;
                        class127.field3057[arg2][arg4 + 1][arg3] = 50;
                    }
                    if (var13.field1907) {
                        class111.field2697[arg2][arg4][arg3] = class141.method1150(class111.field2697[arg2][arg4][arg3], 1170);
                    }
                }
                if (var13.field1897 != 0 && arg5 != null) {
                    arg5.method719(arg3, arg7, arg1, var13.field1928, arg4, 7);
                }
                if (var13.field1911 != 16) {
                    arg0.method1002(arg2, arg4, arg3, var13.field1911);
                }
            } else if (arg7 == 1) {
                class101 var20;
                if (var13.field1933 == -1 && var13.field1926 == null) {
                    var20 = var13.method687(1, var11, var9, var12, var10, arg1, 0);
                } else {
                    var20 = new class52(arg6, 1, arg1, var10, var9, var11, var12, var13.field1933, true, null);
                }
                arg0.method1005(arg2, arg4, arg3, var14, var20, null, class43.field1035[arg1], 0, var16, var15);
                if (var13.field1930) {
                    if (arg1 == 0) {
                        class127.field3057[arg2][arg4][arg3 + 1] = 50;
                    } else if (arg1 == 1) {
                        class127.field3057[arg2][arg4 + 1][arg3 + 1] = 50;
                    } else if (arg1 == 2) {
                        class127.field3057[arg2][arg4 + 1][arg3] = 50;
                    } else if (arg1 == 3) {
                        class127.field3057[arg2][arg4][arg3] = 50;
                    }
                }
                if (var13.field1897 != 0 && arg5 != null) {
                    arg5.method719(arg3, arg7, arg1, var13.field1928, arg4, 70);
                }
            } else if (arg7 == 2) {
                int var21 = arg1 + 1 & 0x3;
                class101 var22;
                class101 var23;
                if (var13.field1933 == -1 && var13.field1926 == null) {
                    var22 = var13.method687(2, var11, var9, var12, var10, arg1 + 4, 0);
                    var23 = var13.method687(2, var11, var9, var12, var10, var21, 0);
                } else {
                    var22 = new class52(arg6, 2, arg1 + 4, var10, var9, var11, var12, var13.field1933, true, null);
                    var23 = new class52(arg6, 2, var21, var10, var9, var11, var12, var13.field1933, true, null);
                }
                arg0.method1005(arg2, arg4, arg3, var14, var22, var23, class109.field2659[arg1], class109.field2659[var21], var16, var15);
                if (var13.field1907) {
                    if (arg1 == 0) {
                        class111.field2697[arg2][arg4][arg3] = class141.method1150(class111.field2697[arg2][arg4][arg3], 585);
                        class111.field2697[arg2][arg4][arg3 + 1] = class141.method1150(class111.field2697[arg2][arg4][arg3 + 1], 1170);
                    } else if (arg1 == 1) {
                        class111.field2697[arg2][arg4][arg3 + 1] = class141.method1150(class111.field2697[arg2][arg4][arg3 + 1], 1170);
                        class111.field2697[arg2][arg4 + 1][arg3] = class141.method1150(class111.field2697[arg2][arg4 + 1][arg3], 585);
                    } else if (arg1 == 2) {
                        class111.field2697[arg2][arg4 + 1][arg3] = class141.method1150(class111.field2697[arg2][arg4 + 1][arg3], 585);
                        class111.field2697[arg2][arg4][arg3] = class141.method1150(class111.field2697[arg2][arg4][arg3], 1170);
                    } else if (arg1 == 3) {
                        class111.field2697[arg2][arg4][arg3] = class141.method1150(class111.field2697[arg2][arg4][arg3], 1170);
                        class111.field2697[arg2][arg4][arg3] = class141.method1150(class111.field2697[arg2][arg4][arg3], 585);
                    }
                }
                if (var13.field1897 != 0 && arg5 != null) {
                    arg5.method719(arg3, arg7, arg1, var13.field1928, arg4, 32);
                }
                if (var13.field1911 != 16) {
                    arg0.method1002(arg2, arg4, arg3, var13.field1911);
                }
            } else if (arg7 == 3) {
                class101 var24;
                if (var13.field1933 == -1 && var13.field1926 == null) {
                    var24 = var13.method687(3, var11, var9, var12, var10, arg1, 0);
                } else {
                    var24 = new class52(arg6, 3, arg1, var10, var9, var11, var12, var13.field1933, true, null);
                }
                arg0.method1005(arg2, arg4, arg3, var14, var24, null, class43.field1035[arg1], 0, var16, var15);
                if (var13.field1930) {
                    if (arg1 == 0) {
                        class127.field3057[arg2][arg4][arg3 + 1] = 50;
                    } else if (arg1 == 1) {
                        class127.field3057[arg2][arg4 + 1][arg3 + 1] = 50;
                    } else if (arg1 == 2) {
                        class127.field3057[arg2][arg4 + 1][arg3] = 50;
                    } else if (arg1 == 3) {
                        class127.field3057[arg2][arg4][arg3] = 50;
                    }
                }
                if (var13.field1897 != 0 && arg5 != null) {
                    arg5.method719(arg3, arg7, arg1, var13.field1928, arg4, 111);
                }
            } else if (arg7 == 9) {
                class101 var25;
                if (var13.field1933 == -1 && var13.field1926 == null) {
                    var25 = var13.method687(arg7, var11, var9, var12, var10, arg1, 0);
                } else {
                    var25 = new class52(arg6, arg7, arg1, var10, var9, var11, var12, var13.field1933, true, null);
                }
                arg0.method1010(arg2, arg4, arg3, var14, 1, 1, var25, 0, var16, var15);
                if (var13.field1897 != 0 && arg5 != null) {
                    arg5.method711(arg4, arg1, arg3, var13.field1914, var13.field1917, (byte) -128, var13.field1928);
                }
            } else {
                if (var13.field1906) {
                    if (arg1 == 1) {
                        int var29 = var12;
                        var12 = var11;
                        var11 = var9;
                        var9 = var10;
                        var10 = var29;
                    } else if (arg1 == 2) {
                        int var27 = var12;
                        var12 = var9;
                        var9 = var27;
                        int var28 = var11;
                        var11 = var10;
                        var10 = var28;
                    } else if (arg1 == 3) {
                        int var26 = var12;
                        var12 = var10;
                        var10 = var9;
                        var9 = var11;
                        var11 = var26;
                    }
                }
                if (arg7 == 4) {
                    class101 var30;
                    if (var13.field1933 == -1 && var13.field1926 == null) {
                        var30 = var13.method687(4, var11, var9, var12, var10, 0, 0);
                    } else {
                        var30 = new class52(arg6, 4, 0, var10, var9, var11, var12, var13.field1933, true, null);
                    }
                    arg0.method1006(arg2, arg4, arg3, var14, var30, class109.field2659[arg1], arg1 * 512, 0, 0, var16, var15);
                } else if (arg7 == 5) {
                    int var31 = 16;
                    int var32 = arg0.method1036(arg2, arg4, arg3);
                    if (var32 != 0) {
                        var31 = class155.method1214((byte) -94, var32 >> 14 & 0x7FFF).field1911;
                    }
                    class101 var33;
                    if (var13.field1933 == -1 && var13.field1926 == null) {
                        var33 = var13.method687(4, var11, var9, var12, var10, 0, 0);
                    } else {
                        var33 = new class52(arg6, 4, 0, var10, var9, var11, var12, var13.field1933, true, null);
                    }
                    arg0.method1006(arg2, arg4, arg3, var14, var33, class109.field2659[arg1], arg1 * 512, class81.field1866[arg1] * var31, class52.field1245[arg1] * var31, var16, var15);
                } else if (arg7 == 6) {
                    class101 var34;
                    if (var13.field1933 == -1 && var13.field1926 == null) {
                        var34 = var13.method687(4, var11, var9, var12, var10, 0, 0);
                    } else {
                        var34 = new class52(arg6, 4, 0, var10, var9, var11, var12, var13.field1933, true, null);
                    }
                    arg0.method1006(arg2, arg4, arg3, var14, var34, 256, arg1, 0, 0, var16, var15);
                } else if (arg7 == 7) {
                    class101 var35;
                    if (var13.field1933 == -1 && var13.field1926 == null) {
                        var35 = var13.method687(4, var11, var9, var12, var10, 0, 0);
                    } else {
                        var35 = new class52(arg6, 4, 0, var10, var9, var11, var12, var13.field1933, true, null);
                    }
                    arg0.method1006(arg2, arg4, arg3, var14, var35, 512, arg1, 0, 0, var16, var15);
                } else if (arg7 == 8) {
                    class101 var36;
                    if (var13.field1933 == -1 && var13.field1926 == null) {
                        var36 = var13.method687(4, var11, var9, var12, var10, 0, 0);
                    } else {
                        var36 = new class52(arg6, 4, 0, var10, var9, var11, var12, var13.field1933, true, null);
                    }
                    arg0.method1006(arg2, arg4, arg3, var14, var36, 768, arg1, 0, 0, var16, var15);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(ILo;Lo;I)V")
    public class126(int arg0, class97 arg1, class97 arg2, int arg3) {
        this.field3023 = arg0;
        this.field3017 = arg2;
        this.field3020 = arg1;
        this.field3002 = arg3;
    }
}
