import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class315 {

    @OriginalMember(owner = "client!h", name = "f", descriptor = "Lai;")
    private class258 field5310 = null;

    @OriginalMember(owner = "client!h", name = "k", descriptor = "Lai;")
    private class258 field5315 = null;

    @OriginalMember(owner = "client!h", name = "c", descriptor = "I")
    private int field5307 = 65000;

    @OriginalMember(owner = "client!h", name = "e", descriptor = "I")
    private int field5309;

    @OriginalMember(owner = "client!h", name = "g", descriptor = "[B")
    public static byte[] field5311;

    @OriginalMember(owner = "client!h", name = "o", descriptor = "Lbd;")
    private static class162 field5319;

    @OriginalMember(owner = "client!h", name = "n", descriptor = "Lbd;")
    public static class162 field5318;

    @OriginalMember(owner = "client!h", name = "q", descriptor = "Lbd;")
    private static class162 field5321;

    @OriginalMember(owner = "client!h", name = "m", descriptor = "Lbd;")
    private static class162 field5317;

    @OriginalMember(owner = "client!h", name = "p", descriptor = "Lbd;")
    public static class162 field5320;

    @OriginalMember(owner = "client!h", name = "r", descriptor = "Lbd;")
    public static class162 field5322;

    @OriginalMember(owner = "client!h", name = "s", descriptor = "Lbd;")
    public static class162 field5323;

    @OriginalMember(owner = "client!h", name = "t", descriptor = "[I")
    public static int[] field5324;

    @OriginalMember(owner = "client!h", name = "u", descriptor = "Lbd;")
    public static class162 field5325;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "I")
    public static int field5305;

    @OriginalMember(owner = "client!h", name = "b", descriptor = "I")
    public static int field5306;

    @OriginalMember(owner = "client!h", name = "d", descriptor = "I")
    public static int field5308;

    @OriginalMember(owner = "client!h", name = "h", descriptor = "I")
    public static int field5312;

    @OriginalMember(owner = "client!h", name = "i", descriptor = "I")
    public static int field5313;

    @OriginalMember(owner = "client!h", name = "j", descriptor = "I")
    public static int field5314;

    @OriginalMember(owner = "client!h", name = "l", descriptor = "[[Lba;")
    public static class26[][] field5316;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "([BIII)Z", line = 6)
    public final boolean method2146(byte[] arg0, int arg1, int arg2, int arg3) {
        field5313++;
        class258 var5 = this.field5315;
        synchronized (this.field5315) {
            if (arg1 < 0 || this.field5307 < arg1) {
                throw new IllegalArgumentException();
            } else if (arg3 > -106) {
                return false;
            } else {
                boolean var6 = this.method2150(arg0, (byte) 2, arg2, arg1, true);
                if (!var6) {
                    var6 = this.method2150(arg0, (byte) 2, arg2, arg1, false);
                }
                return var6;
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "toString", descriptor = "()Ljava/lang/String;", line = 48)
    public final String toString() {
        field5305++;
        return "Cache:" + this.field5309;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IZLaf;IZILaf;)I", line = 57)
    public static final int method2147(int arg0, boolean arg1, class223 arg2, int arg3, boolean arg4, int arg5, class223 arg6) {
        int var7 = class64.method437(false, arg2, arg6, arg1, arg5);
        field5306++;
        if (var7 != 0) {
            return arg1 ? -var7 : var7;
        } else if (~arg0 == arg3) {
            return 0;
        } else {
            int var8 = class64.method437(false, arg2, arg6, arg4, arg0);
            return arg4 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(B)V", line = 86)
    public static void method2148(byte arg0) {
        field5324 = null;
        field5320 = null;
        field5318 = null;
        field5317 = null;
        field5311 = null;
        field5321 = null;
        field5322 = null;
        field5316 = (class26[][]) null;
        field5319 = null;
        if (arg0 < 92) {
            method2148((byte) -6);
        }
        field5323 = null;
        field5325 = null;
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "(ILai;Lai;I)V", line = 392)
    public class315(int arg0, class258 arg1, class258 arg2, int arg3) {
        this.field5309 = arg0;
        this.field5315 = arg1;
        this.field5310 = arg2;
        this.field5307 = arg3;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIILrk;Lrk;IIIIJ)V", line = 108)
    public static final void method2149(int arg0, int arg1, int arg2, int arg3, class255 arg4, class255 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class138 var12 = new class138();
        var12.field2461 = arg10;
        var12.field2469 = arg1 * 128 + 64;
        var12.field2464 = arg2 * 128 + 64;
        var12.field2462 = arg3;
        var12.field2459 = arg4;
        var12.field2468 = arg5;
        var12.field2458 = arg6;
        var12.field2470 = arg7;
        var12.field2471 = arg8;
        var12.field2472 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class288.field4856[var13][arg1][arg2] == null) {
                class288.field4856[var13][arg1][arg2] = new class225(var13, arg1, arg2);
            }
        }
        class288.field4856[arg0][arg1][arg2].field3775 = var12;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "([BBIIZ)Z", line = 139)
    private final boolean method2150(byte[] arg0, byte arg1, int arg2, int arg3, boolean arg4) {
        field5308++;
        class258 var6 = this.field5315;
        synchronized (this.field5315) {
            try {
                int var7;
                boolean var10000;
                if (arg4) {
                    if (this.field5310.method1779(-29100) < (long) (arg2 * 6 + 6)) {
                        var10000 = false;
                        return var10000;
                    }
                    this.field5310.method1775((byte) 46, (long) (arg2 * 6));
                    this.field5310.method1780(class91.field1619, 6, (byte) -124, 0);
                    var7 = ((class91.field1619[3] & 0xFF) << 16) + (((class91.field1619[4] & 0xFF) << 8) + (class91.field1619[5] & 0xFF));
                    if (var7 <= 0 || this.field5315.method1779(arg1 - 29102) / 520L < (long) var7) {
                        var10000 = false;
                        return var10000;
                    }
                } else {
                    var7 = (int) ((this.field5315.method1779(-29100) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class91.field1619[4] = (byte) (var7 >> 8);
                class91.field1619[3] = (byte) (var7 >> 16);
                class91.field1619[5] = (byte) var7;
                class91.field1619[1] = (byte) (arg3 >> 8);
                class91.field1619[2] = (byte) arg3;
                int var8 = 0;
                class91.field1619[0] = (byte) (arg3 >> 16);
                int var9 = 0;
                this.field5310.method1775((byte) 46, (long) (arg2 * 6));
                if (arg1 != 2) {
                    field5316 = (class26[][]) ((class26[][]) null);
                }
                this.field5310.method1781(-1, 0, 6, class91.field1619);
                while (true) {
                    if (arg3 > var8) {
                        label136: {
                            int var10 = 0;
                            if (arg4) {
                                this.field5315.method1775((byte) 46, (long) (var7 * 520));
                                try {
                                    this.field5315.method1780(class91.field1619, 8, (byte) -127, 0);
                                } catch (EOFException var18) {
                                    break label136;
                                }
                                var10 = ((class91.field1619[4] & 0xFF) << 16) + (class91.field1619[5] & 0xFF << 8) + (class91.field1619[6] & 0xFF);
                                int var12 = ((class91.field1619[0] & 0xFF) << 8) + (class91.field1619[1] & 0xFF);
                                int var13 = (class91.field1619[2] & 0xFF << 8) + (class91.field1619[3] & 0xFF);
                                int var14 = class91.field1619[7] & 0xFF;
                                if (arg2 != var12 || var9 != var13 || this.field5309 != var14) {
                                    var10000 = false;
                                    return var10000;
                                }
                                if (var10 < 0 || (long) var10 > this.field5315.method1779(-29100) / 520L) {
                                    var10000 = false;
                                    return var10000;
                                }
                            }
                            if (var10 == 0) {
                                var10 = (int) ((this.field5315.method1779(arg1 - 29102) + 519L) / 520L);
                                if (var10 == 0) {
                                    var10++;
                                }
                                arg4 = false;
                                if (var7 == var10) {
                                    var10++;
                                }
                            }
                            if (arg3 - var8 <= 512) {
                                var10 = 0;
                            }
                            class91.field1619[2] = (byte) (var9 >> 8);
                            int var15 = arg3 - var8;
                            class91.field1619[3] = (byte) var9;
                            class91.field1619[1] = (byte) arg2;
                            class91.field1619[6] = (byte) var10;
                            if (var15 > 512) {
                                var15 = 512;
                            }
                            class91.field1619[5] = (byte) (var10 >> 8);
                            class91.field1619[0] = (byte) (arg2 >> 8);
                            class91.field1619[7] = (byte) this.field5309;
                            class91.field1619[4] = (byte) (var10 >> 16);
                            var9++;
                            this.field5315.method1775((byte) 46, (long) (var7 * 520));
                            var7 = var10;
                            this.field5315.method1781(-1, 0, 8, class91.field1619);
                            this.field5315.method1781(-1, var8, var15, arg0);
                            var8 += var15;
                            continue;
                        }
                    }
                    var10000 = true;
                    return var10000;
                }
            } catch (IOException var19) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(BI)V", line = 258)
    public static final void method2151(byte arg0, int arg1) {
        field5312++;
        class292.field4911.method1538(arg1, (byte) -14);
        class183.field3160.method1538(arg1, (byte) -46);
        int var2 = -59 / ((arg0 - 27) / 54);
        class126.field2294.method1538(arg1, (byte) -9);
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(BI)[B", line = 270)
    public final byte[] method2152(byte arg0, int arg1) {
        field5314++;
        class258 var3 = this.field5315;
        synchronized (this.field5315) {
            try {
                Object var10000;
                if (this.field5310.method1779(arg0 - 29225) < (long) (arg1 * 6 + 6)) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                this.field5310.method1775((byte) 46, (long) (arg1 * 6));
                this.field5310.method1780(class91.field1619, 6, (byte) -126, 0);
                int var4 = (class91.field1619[5] & 0xFF) + (((class91.field1619[3] & 0xFF) << 16) + ((class91.field1619[4] & 0xFF) << 8));
                if (arg0 != 125) {
                    field5316 = (class26[][]) ((class26[][]) null);
                }
                int var5 = (class91.field1619[2] & 0xFF) + ((class91.field1619[0] & 0xFF) << 16) + ((class91.field1619[1] & 0xFF) << 8);
                if (var5 < 0 || var5 > this.field5307) {
                    var10000 = null;
                    return (byte[]) var10000;
                } else if (var4 > 0 && this.field5315.method1779(-29100) / 520L >= (long) var4) {
                    byte[] var6 = new byte[var5];
                    int var7 = 0;
                    int var8 = 0;
                    while (var5 > var7) {
                        if (var4 == 0) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        this.field5315.method1775((byte) 46, (long) (var4 * 520));
                        int var9 = var5 - var7;
                        if (var9 > 512) {
                            var9 = 512;
                        }
                        this.field5315.method1780(class91.field1619, var9 + 8, (byte) 21, 0);
                        int var10 = (class91.field1619[0] & 0xFF << 8) + (class91.field1619[1] & 0xFF);
                        int var11 = (class91.field1619[2] & 0xFF << 8) + (class91.field1619[3] & 0xFF);
                        int var12 = (class91.field1619[6] & 0xFF) + ((class91.field1619[4] & 0xFF) << 16) + ((class91.field1619[5] & 0xFF) << 8);
                        int var13 = class91.field1619[7] & 0xFF;
                        if (arg1 == var10 && var8 == var11 && this.field5309 == var13) {
                            if (var12 >= 0 && this.field5315.method1779(-29100) / 520L >= (long) var12) {
                                var4 = var12;
                                for (int var14 = 0; var14 < var9; var14++) {
                                    var6[var7++] = class91.field1619[var14 + 8];
                                }
                                var8++;
                                continue;
                            }
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        var10000 = null;
                        return (byte[]) var10000;
                    }
                    byte[] var19 = var6;
                    return var19;
                } else {
                    var10000 = null;
                    return (byte[]) var10000;
                }
            } catch (IOException var17) {
                return null;
            }
        }
    }

    static {
        int var0 = 0;
        field5311 = new byte[32896];
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field5311[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
        field5319 = class17.method142(0, "skill: ");
        field5318 = class17.method142(0, "::wm0");
        field5321 = class17.method142(0, "Members object");
        field5317 = class17.method142(0, " is already on your friend list)3");
        field5320 = field5317;
        field5322 = field5321;
        field5323 = class17.method142(0, "(U0a )2 non)2existant gosub script)2num: ");
        field5324 = new int[2];
        field5325 = field5319;
    }
}
