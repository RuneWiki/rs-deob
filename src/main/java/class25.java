import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class25 {

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "Lfl;")
    private class85 field306 = null;

    @OriginalMember(owner = "client!lj", name = "m", descriptor = "Lfl;")
    private class85 field314 = null;

    @OriginalMember(owner = "client!lj", name = "k", descriptor = "I")
    private int field312 = 65000;

    @OriginalMember(owner = "client!lj", name = "p", descriptor = "I")
    private int field317;

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "[I")
    public static int[] field307 = new int[2];

    @OriginalMember(owner = "client!lj", name = "l", descriptor = "Ljava/lang/String;")
    public static String field313 = "green:";

    @OriginalMember(owner = "client!lj", name = "o", descriptor = "Ljava/lang/String;")
    public static String field316 = " has logged in.";

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "Loj;")
    public static class246 field303 = new class246();

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "B")
    public static byte field309;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!lj", name = "i", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!lj", name = "j", descriptor = "I")
    public static int field311;

    @OriginalMember(owner = "client!lj", name = "n", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "([BIII)Z")
    public final boolean method135(byte[] arg0, int arg1, int arg2, int arg3) {
        field302++;
        class85 var5 = this.field314;
        synchronized (this.field314) {
            if (arg3 < 0 || this.field312 < arg3) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method138(arg0, true, arg3, arg2, arg1 ^ 0xFFFFA08B);
            if (!var6) {
                var6 = this.method138(arg0, false, arg3, arg2, 51);
            }
            return arg1 == -24339 ? var6 : true;
        }
    }

    @OriginalMember(owner = "client!lj", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field308++;
        return "Cache:" + this.field317;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;BILjava/lang/String;I)V")
    public static final void method136(String arg0, int arg1, String arg2, String arg3, byte arg4, int arg5, String arg6, int arg7) {
        for (int var8 = 99; var8 > 0; var8--) {
            class177.field2886[var8] = class177.field2886[var8 - 1];
            class258.field4172[var8] = class258.field4172[var8 - 1];
            class124.field1970[var8] = class124.field1970[var8 - 1];
            class296.field4738[var8] = class296.field4738[var8 - 1];
            class88.field1441[var8] = class88.field1441[var8 - 1];
            class137.field2177[var8] = class137.field2177[var8 - 1];
            class199.field3196[var8] = class199.field3196[var8 - 1];
        }
        if (arg4 != -5) {
            field316 = null;
        }
        class312.field4982 = class74.field1237;
        class124.field1970[0] = arg3;
        class296.field4738[0] = arg0;
        field304++;
        class88.field1441[0] = arg6;
        class251.field4012++;
        class137.field2177[0] = arg2;
        class177.field2886[0] = arg7;
        class258.field4172[0] = arg5;
        class199.field3196[0] = arg1;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)[B")
    public final byte[] method137(int arg0, int arg1) {
        field305++;
        class85 var3 = this.field314;
        synchronized (this.field314) {
            try {
                if (this.field306.method584(-1) < ((long) (arg1 * 6 + 6))) {
                    return null;
                }
                this.field306.method580(false, (long) (arg1 * 6));
                this.field306.method585(0, class141.field2244, -1, 6);
                int var5 = (class141.field2244[4] & 0xFF << 8) + (((class141.field2244[3] & 0xFF) << 16) + (class141.field2244[5] & 0xFF));
                int var6 = (class141.field2244[2] & 0xFF) + ((class141.field2244[arg0] & 0xFF) << 16) + ((class141.field2244[1] & 0xFF) << 8);
                if (var6 < 0 || var6 > this.field312) {
                    return null;
                } else if (var5 > 0 && (this.field314.method584(-1) / 520L) >= ((long) var5)) {
                    byte[] var9 = new byte[var6];
                    int var10 = 0;
                    int var11 = 0;
                    while (var6 > var10) {
                        if (var5 == 0) {
                            return null;
                        }
                        this.field314.method580(false, (long) (var5 * 520));
                        int var13 = var6 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field314.method585(0, class141.field2244, -1, var13 + 8);
                        int var14 = (class141.field2244[0] & 0xFF << 8) + (class141.field2244[1] & 0xFF);
                        int var15 = class141.field2244[7] & 0xFF;
                        int var16 = (class141.field2244[2] & 0xFF << 8) + (class141.field2244[3] & 0xFF);
                        int var17 = (class141.field2244[4] & 0xFF << 16) + (class141.field2244[5] & 0xFF << 8) + (class141.field2244[6] & 0xFF);
                        if (arg1 == var14 && var11 == var16 && this.field317 == var15) {
                            if (var17 >= 0 && ((long) var17) <= (this.field314.method584(arg0 - 1) / 520L)) {
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var9[var10++] = class141.field2244[var20 + 8];
                                }
                                var11++;
                                var5 = var17;
                                continue;
                            }
                            return null;
                        }
                        return null;
                    }
                    return var9;
                } else {
                    return null;
                }
            } catch (IOException var39) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "([BZIII)Z")
    private final boolean method138(byte[] arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field311++;
        class85 var6 = this.field314;
        synchronized (this.field314) {
            try {
                if (arg4 <= 49) {
                    this.method137(-6, -33);
                }
                int var8;
                if (arg1) {
                    if (this.field306.method584(-1) < (long) (arg3 * 6 + 6)) {
                        return false;
                    }
                    this.field306.method580(false, (long) (arg3 * 6));
                    this.field306.method585(0, class141.field2244, -1, 6);
                    var8 = ((class141.field2244[3] & 0xFF) << 16) + ((class141.field2244[4] & 0xFF) << 8) + (class141.field2244[5] & 0xFF);
                    if (var8 <= 0 || (long) var8 > this.field314.method584(-1) / 520L) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field314.method584(-1) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class141.field2244[3] = (byte) (var8 >> 16);
                class141.field2244[5] = (byte) var8;
                int var10 = 0;
                class141.field2244[4] = (byte) (var8 >> 8);
                class141.field2244[1] = (byte) (arg2 >> 8);
                class141.field2244[0] = (byte) (arg2 >> 16);
                int var11 = 0;
                class141.field2244[2] = (byte) arg2;
                this.field306.method580(false, (long) (arg3 * 6));
                this.field306.method579((byte) -114, class141.field2244, 6, 0);
                while (arg2 > var10) {
                    int var12 = 0;
                    if (arg1) {
                        label108: {
                            this.field314.method580(false, (long) (var8 * 520));
                            try {
                                this.field314.method585(0, class141.field2244, -1, 8);
                            } catch (EOFException var33) {
                                return true;
                            }
                            int var13 = ((class141.field2244[0] & 0xFF) << 8) + (class141.field2244[1] & 0xFF);
                            int var14 = ((class141.field2244[2] & 0xFF) << 8) + (class141.field2244[3] & 0xFF);
                            var12 = (class141.field2244[5] & 0xFF << 8) + (class141.field2244[4] & 0xFF << 16) + (class141.field2244[6] & 0xFF);
                            int var15 = class141.field2244[7] & 0xFF;
                            if (arg3 == var13 && var11 == var14 && this.field317 == var15) {
                                if (var12 >= 0 && ((long) var12) <= (this.field314.method584(-1) / 520L)) {
                                    break label108;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    int var18 = arg2 - var10;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    if (var12 == 0) {
                        arg1 = false;
                        var12 = (int) ((this.field314.method584(-1) + 519L) / 520L);
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var8 == var12) {
                            var12++;
                        }
                    }
                    class141.field2244[0] = (byte) (arg3 >> 8);
                    class141.field2244[2] = (byte) (var11 >> 8);
                    if ((arg2 - var10) <= 512) {
                        var12 = 0;
                    }
                    class141.field2244[7] = (byte) this.field317;
                    class141.field2244[5] = (byte) (var12 >> 8);
                    class141.field2244[6] = (byte) var12;
                    class141.field2244[1] = (byte) arg3;
                    class141.field2244[3] = (byte) var11;
                    var11++;
                    class141.field2244[4] = (byte) (var12 >> 16);
                    this.field314.method580(false, (long) (var8 * 520));
                    this.field314.method579((byte) -106, class141.field2244, 8, 0);
                    var8 = var12;
                    this.field314.method579((byte) -101, arg0, var18, var10);
                    var10 += var18;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(B)V")
    public static void method139(byte arg0) {
        field313 = null;
        if (arg0 > -101) {
            field316 = null;
        }
        field303 = null;
        field316 = null;
        field307 = null;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method140(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field315++;
        long var8 = class276.method1861(arg5, arg4 + arg1, arg0 + arg3);
        if (var8 != 0L) {
            int var10 = ((int) var8 & 0x3F9C2B) >> 20;
            int var11 = ((int) var8 & 0x7D1B1) >> 14;
            int var12 = Integer.MAX_VALUE & (int) (var8 >>> 32);
            class158 var13 = class5.method29(var12, true);
            if (var13.field2472 == -1) {
                int var14 = arg7;
                int var15 = arg4 * 4 + ((-(arg0 * 512) + 52736) * 4) + 24624;
                int[] var16 = class127.field2007;
                if (var8 > 0L) {
                    var14 = arg6;
                }
                if (var11 == 0 || var11 == 2) {
                    if (var10 == 0) {
                        var16[var15] = var14;
                        var16[var15 + 512] = var14;
                        var16[var15 + 1024] = var14;
                        var16[var15 + 1536] = var14;
                    } else if (var10 == 1) {
                        var16[var15] = var14;
                        var16[var15 + 1] = var14;
                        var16[var15 + 2] = var14;
                        var16[var15 + 3] = var14;
                    } else if (var10 == 2) {
                        var16[var15 + 3] = var14;
                        var16[var15 + 512 + 3] = var14;
                        var16[var15 + 3 + 1024] = var14;
                        var16[var15 + 1536 + 3] = var14;
                    } else if (var10 == 3) {
                        var16[var15 + 1536] = var14;
                        var16[var15 + 1537] = var14;
                        var16[var15 + 1536 + 2] = var14;
                        var16[var15 + 3 + 1536] = var14;
                    }
                }
                if (var11 == 3) {
                    if (var10 == 0) {
                        var16[var15] = var14;
                    } else if (var10 == 1) {
                        var16[var15 + 3] = var14;
                    } else if (var10 == 2) {
                        var16[var15 + 3 + 1536] = var14;
                    } else if (var10 == 3) {
                        var16[var15 + 1536] = var14;
                    }
                }
                if (var11 == 2) {
                    if (var10 == 3) {
                        var16[var15] = var14;
                        var16[var15 + 512] = var14;
                        var16[var15 + 1024] = var14;
                        var16[var15 + 1536] = var14;
                    } else if (var10 == 0) {
                        var16[var15] = var14;
                        var16[var15 + 1] = var14;
                        var16[var15 + 2] = var14;
                        var16[var15 + 3] = var14;
                    } else if (var10 == 1) {
                        var16[var15 + 3] = var14;
                        var16[var15 + 3 + 512] = var14;
                        var16[var15 + 3 + 1024] = var14;
                        var16[var15 + 3 + 1536] = var14;
                    } else if (var10 == 2) {
                        var16[var15 + 1536] = var14;
                        var16[var15 + 1536 + 1] = var14;
                        var16[var15 + 1536 + 2] = var14;
                        var16[var15 + 1539] = var14;
                    }
                }
            } else if (!class233.method1576(arg3, arg4, 104, var10, var13, arg0, arg1)) {
                return false;
            }
        }
        long var17 = class203.method1421(arg5, arg1 + arg4, arg0 + arg3);
        if (arg2 != 5) {
            field316 = null;
        }
        if (var17 != 0L) {
            int var19 = (int) var17 >> 20 & 0x3;
            int var20 = ((int) var17 & 0x7FA86) >> 14;
            int var21 = Integer.MAX_VALUE & (int) (var17 >>> 32);
            class158 var22 = class5.method29(var21, true);
            if (var22.field2472 == -1) {
                if (var20 == 9) {
                    int[] var23 = class127.field2007;
                    int var24 = (103 - arg0) * 2048 + arg4 * 4 + 24624;
                    int var25 = 15658734;
                    if (var17 > 0L) {
                        var25 = 15597568;
                    }
                    if (var19 == 0 || var19 == 2) {
                        var23[var24 + 1536] = var25;
                        var23[var24 + 1024 + 1] = var25;
                        var23[var24 + 2 + 512] = var25;
                        var23[var24 + 3] = var25;
                    } else {
                        var23[var24] = var25;
                        var23[var24 + 513] = var25;
                        var23[var24 + 1024 + 2] = var25;
                        var23[var24 + 3 + 1536] = var25;
                    }
                }
            } else if (!class233.method1576(arg3, arg4, arg2 ^ 0x6D, var19, var22, arg0, arg1)) {
                return false;
            }
        }
        long var26 = class205.method1435(arg5, arg1 + arg4, arg0 - -arg3);
        if (var26 != 0L) {
            int var28 = (int) var26 >> 20 & 0x3;
            int var29 = Integer.MAX_VALUE & (int) (var26 >>> 32);
            class158 var30 = class5.method29(var29, true);
            if (var30.field2472 != -1 && !class233.method1576(arg3, arg4, 104, var28, var30, arg0, arg1)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ZLed;)Z")
    public static final boolean method141(boolean arg0, class50 arg1) {
        field310++;
        if (arg1 == null) {
            return false;
        } else if (!arg1.field832) {
            return false;
        } else if (!arg1.method356(1223)) {
            return false;
        } else if (class48.field802.method1059(0, (long) arg1.field834) != null) {
            return false;
        } else if (class240.field3835.method1059(0, (long) arg1.field845) == null) {
            return arg0 ? true : true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(ILfl;Lfl;I)V")
    public class25(int arg0, class85 arg1, class85 arg2, int arg3) {
        this.field306 = arg2;
        this.field312 = arg3;
        this.field314 = arg1;
        this.field317 = arg0;
    }
}
