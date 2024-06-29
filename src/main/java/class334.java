import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class334 {

    @OriginalMember(owner = "client!qk", name = "k", descriptor = "Loo;")
    private class383 field4440 = null;

    @OriginalMember(owner = "client!qk", name = "o", descriptor = "I")
    private int field4444 = 65000;

    @OriginalMember(owner = "client!qk", name = "p", descriptor = "Loo;")
    private class383 field4445 = null;

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "I")
    private int field4434;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "I")
    public static int field4430 = 2;

    @OriginalMember(owner = "client!qk", name = "l", descriptor = "[I")
    public static int[] field4441 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "Ljava/lang/String;")
    public static String field4437 = "";

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "I")
    public static int field4431;

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "I")
    public static int field4432;

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "I")
    public static int field4433;

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "I")
    public static int field4435;

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "I")
    public static int field4436;

    @OriginalMember(owner = "client!qk", name = "i", descriptor = "I")
    public static int field4438;

    @OriginalMember(owner = "client!qk", name = "j", descriptor = "I")
    public static int field4439;

    @OriginalMember(owner = "client!qk", name = "m", descriptor = "I")
    public static int field4442;

    @OriginalMember(owner = "client!qk", name = "n", descriptor = "I")
    public static int field4443;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)I", line = 6)
    public static final int method1898(int arg0) {
        if (arg0 == -24496) {
            field4439++;
            return 6;
        } else {
            return -6;
        }
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)V", line = 22)
    public static final void method1899(int arg0) {
        field4436++;
        class335.field4451 = null;
        if (arg0 != 520) {
            method1902(99);
        }
        class40.field406 = null;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IZIB[B)Z", line = 37)
    private final boolean method1900(int arg0, boolean arg1, int arg2, byte arg3, byte[] arg4) {
        field4431++;
        class383 var6 = this.field4440;
        synchronized (this.field4440) {
            try {
                int var8;
                if (arg1) {
                    if ((long) (arg0 * 6 + 6) > this.field4445.method2378((byte) -102)) {
                        return false;
                    }
                    this.field4445.method2381(23397, (long) (arg0 * 6));
                    this.field4445.method2376(6, true, 0, class115.field1435);
                    var8 = (class115.field1435[3] & 0xFF << 16) + (class115.field1435[4] & 0xFF << 8) + (class115.field1435[5] & 0xFF);
                    if (var8 <= 0 || this.field4440.method2378((byte) -103) / 520L < (long) var8) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field4440.method2378((byte) -115) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class115.field1435[4] = (byte) (var8 >> 8);
                class115.field1435[0] = (byte) (arg2 >> 16);
                class115.field1435[1] = (byte) (arg2 >> 8);
                class115.field1435[2] = (byte) arg2;
                class115.field1435[5] = (byte) var8;
                class115.field1435[3] = (byte) (var8 >> 16);
                this.field4445.method2381(arg3 ^ 0xFFFFA4CB, (long) (arg0 * 6));
                if (arg3 != -82) {
                    field4441 = null;
                }
                this.field4445.method2377(6, class115.field1435, 0, (byte) -67);
                int var10 = 0;
                int var11 = 0;
                while (arg2 > var10) {
                    int var12 = 0;
                    if (arg1) {
                        label108: {
                            this.field4440.method2381(23397, (long) (var8 * 520));
                            try {
                                this.field4440.method2376(8, true, 0, class115.field1435);
                            } catch (EOFException var33) {
                                return true;
                            }
                            int var13 = ((class115.field1435[0] & 0xFF) << 8) + (class115.field1435[1] & 0xFF);
                            int var14 = (class115.field1435[2] & 0xFF << 8) + (class115.field1435[3] & 0xFF);
                            var12 = ((class115.field1435[4] & 0xFF) << 16) - (-((class115.field1435[5] & 0xFF) << 8) - (class115.field1435[6] & 0xFF));
                            int var15 = class115.field1435[7] & 0xFF;
                            if (arg0 == var13 && var11 == var14 && this.field4434 == var15) {
                                if (var12 >= 0 && (this.field4440.method2378((byte) -104) / 520L) >= ((long) var12)) {
                                    break label108;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        arg1 = false;
                        var12 = (int) ((this.field4440.method2378((byte) -92) + 519L) / 520L);
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var8 == var12) {
                            var12++;
                        }
                    }
                    class115.field1435[2] = (byte) (var11 >> 8);
                    class115.field1435[0] = (byte) (arg0 >> 8);
                    class115.field1435[3] = (byte) var11;
                    class115.field1435[1] = (byte) arg0;
                    if (arg2 - var10 <= 512) {
                        var12 = 0;
                    }
                    class115.field1435[7] = (byte) this.field4434;
                    class115.field1435[5] = (byte) (var12 >> 8);
                    class115.field1435[4] = (byte) (var12 >> 16);
                    class115.field1435[6] = (byte) var12;
                    this.field4440.method2381(23397, (long) (var8 * 520));
                    this.field4440.method2377(8, class115.field1435, 0, (byte) -67);
                    int var18 = arg2 - var10;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    this.field4440.method2377(var18, arg4, var10, (byte) -67);
                    var11++;
                    var8 = var12;
                    var10 += var18;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)V", line = 162)
    public static void method1901(byte arg0) {
        field4437 = null;
        field4441 = null;
        if (arg0 < 115) {
            field4430 = 23;
        }
    }

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "(I)V", line = 176)
    public static final void method1902(int arg0) {
        field4438++;
        if (class104.field1273 != null) {
            if (class104.field1273.field4123 == 1) {
                class104.field1273 = null;
                return;
            }
            if (class104.field1273.field4123 == 2) {
                class306.method1797(2, (byte) 108, class143.field1820, class248.field3348);
                class104.field1273 = null;
                return;
            }
        }
        if (arg0 != 28878) {
            field4441 = null;
        }
    }

    @OriginalMember(owner = "client!qk", name = "toString", descriptor = "()Ljava/lang/String;", line = 204)
    public final String toString() {
        field4432++;
        return "Cache:" + this.field4434;
    }

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "(I)V", line = 212)
    public static final void method1903(int arg0) {
        if (arg0 != 65280) {
            method1903(47);
        }
        for (int var1 = 0; var1 < class338.field4509; var1++) {
            int var2 = class192.field2423[var1];
            class158 var3 = class85.field957[var2];
            int var4 = class448.field6514.method1350(31351);
            if ((var4 & 0x8) != 0) {
                var4 += class448.field6514.method1350(arg0 ^ 0x8577) << 8;
            }
            class222.method1204((byte) -41, var4, var3, var2);
        }
        field4435++;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIBI)V", line = 245)
    public static final void method1904(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 != 64) {
            field4437 = null;
        }
        field4442++;
        if (class322.field4306 <= (arg2 - arg0) && class310.field4183 >= (arg0 + arg2) && arg4 - arg0 >= class335.field4462 && (arg0 + arg4) <= class6.field42) {
            class268.method1492(arg2, arg3 ^ 0xFFFFFFC5, arg1, arg4, arg0);
        } else {
            class417.method2589(arg0, arg1, (byte) -87, arg4, arg2);
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)[B", line = 264)
    public final byte[] method1905(int arg0, int arg1) {
        field4433++;
        class383 var3 = this.field4440;
        synchronized (this.field4440) {
            try {
                if ((long) (arg1 * 6 + 6) > this.field4445.method2378((byte) -126)) {
                    return null;
                }
                this.field4445.method2381(23397, (long) (arg1 * 6));
                if (arg0 != -13253) {
                    method1898(28);
                }
                this.field4445.method2376(6, true, 0, class115.field1435);
                int var5 = (class115.field1435[0] & 0xFF << 16) + (class115.field1435[1] & 0xFF << 8) + (class115.field1435[2] & 0xFF);
                int var6 = (class115.field1435[5] & 0xFF) + ((class115.field1435[3] & 0xFF) << 16) + (class115.field1435[4] & 0xFF << 8);
                if (var5 < 0 || this.field4444 < var5) {
                    return null;
                } else if (var6 > 0 && ((long) var6) <= (this.field4440.method2378((byte) -99) / 520L)) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = 0;
                    label72: while (var5 > var10) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field4440.method2381(23397, (long) (var6 * 520));
                        int var13 = var5 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field4440.method2376(var13 + 8, true, 0, class115.field1435);
                        int var14 = ((class115.field1435[0] & 0xFF) << 8) + (class115.field1435[1] & 0xFF);
                        int var15 = ((class115.field1435[2] & 0xFF) << 8) + (class115.field1435[3] & 0xFF);
                        int var16 = (class115.field1435[5] & 0xFF << 8) + (class115.field1435[4] & 0xFF << 16) + (class115.field1435[6] & 0xFF);
                        int var17 = class115.field1435[7] & 0xFF;
                        if (arg1 == var14 && var11 == var15 && this.field4434 == var17) {
                            if (var16 >= 0 && this.field4440.method2378((byte) -109) / 520L >= (long) var16) {
                                var11++;
                                var6 = var16;
                                int var20 = 0;
                                while (true) {
                                    if (var13 <= var20) {
                                        continue label72;
                                    }
                                    var9[var10++] = class115.field1435[var20 + 8];
                                    var20++;
                                }
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

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "([BIII)Z", line = 343)
    public final boolean method1906(byte[] arg0, int arg1, int arg2, int arg3) {
        field4443++;
        class383 var5 = this.field4440;
        synchronized (this.field4440) {
            if (arg3 < 0 || arg3 > this.field4444) {
                throw new IllegalArgumentException();
            }
            if (arg1 != 22061) {
                field4437 = null;
            }
            boolean var6 = this.method1900(arg2, true, arg3, (byte) -82, arg0);
            if (!var6) {
                var6 = this.method1900(arg2, false, arg3, (byte) -82, arg0);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(ILoo;Loo;I)V", line = 391)
    public class334(int arg0, class383 arg1, class383 arg2, int arg3) {
        this.field4434 = arg0;
        this.field4440 = arg1;
        this.field4444 = arg3;
        this.field4445 = arg2;
    }
}
