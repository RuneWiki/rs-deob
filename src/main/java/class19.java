import java.io.EOFException;
import java.io.IOException;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class19 {

    @OriginalMember(owner = "client!nr", name = "h", descriptor = "Lgd;")
    private class344 field370 = null;

    @OriginalMember(owner = "client!nr", name = "i", descriptor = "Lgd;")
    private class344 field371 = null;

    @OriginalMember(owner = "client!nr", name = "n", descriptor = "I")
    private int field376 = 65000;

    @OriginalMember(owner = "client!nr", name = "e", descriptor = "I")
    private int field367;

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "Lvg;")
    public static class622 field365 = new class622(103, 0);

    @OriginalMember(owner = "client!nr", name = "k", descriptor = "Ljava/util/Random;")
    public static Random field373 = new Random();

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "I")
    public static int field364;

    @OriginalMember(owner = "client!nr", name = "d", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!nr", name = "f", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!nr", name = "g", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!nr", name = "j", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!nr", name = "l", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!nr", name = "m", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!nr", name = "o", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!nr", name = "p", descriptor = "I")
    public static int field378;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(II)[B")
    public final byte[] method127(int arg0, int arg1) {
        field366++;
        class344 var3 = this.field371;
        synchronized (this.field371) {
            try {
                if (((long) (arg1 * 6 + 6)) > this.field370.method2135(32452)) {
                    return null;
                }
                this.field370.method2139((long) (arg1 * 6), (byte) -105);
                this.field370.method2137(class240.field3166, 0, true, 6);
                int var5 = ((class240.field3166[1] & 0xFF) << 8) + (class240.field3166[0] & 0xFF << 16) + (class240.field3166[2] & 0xFF);
                int var6 = (class240.field3166[5] & 0xFF) + ((class240.field3166[3] & 0xFF << 16) + ((class240.field3166[4] & 0xFF) << 8));
                if (var5 < 0 || this.field376 < var5) {
                    return null;
                } else if (var6 > 0 && (long) var6 <= this.field371.method2135(32452) / 520L) {
                    byte[] var9 = new byte[var5];
                    int var10 = -106 % ((arg0 + 82) / 40);
                    int var11 = 0;
                    int var12 = 0;
                    label70: while (var5 > var11) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field371.method2139((long) (var6 * 520), (byte) -123);
                        int var14 = var5 - var11;
                        if (var14 > 512) {
                            var14 = 512;
                        }
                        this.field371.method2137(class240.field3166, 0, true, var14 + 8);
                        int var15 = (class240.field3166[0] & 0xFF << 8) + (class240.field3166[1] & 0xFF);
                        int var16 = (class240.field3166[2] & 0xFF << 8) + (class240.field3166[3] & 0xFF);
                        int var17 = (class240.field3166[6] & 0xFF) + ((class240.field3166[4] & 0xFF) << 16) + (class240.field3166[5] & 0xFF << 8);
                        int var18 = class240.field3166[7] & 0xFF;
                        if (arg1 == var15 && var12 == var16 && this.field367 == var18) {
                            if (var17 >= 0 && (long) var17 <= this.field371.method2135(32452) / 520L) {
                                var6 = var17;
                                var12++;
                                int var21 = 0;
                                while (true) {
                                    if (var14 <= var21) {
                                        continue label70;
                                    }
                                    var9[var11++] = class240.field3166[var21 + 8];
                                    var21++;
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
            } catch (IOException var40) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(BI)I")
    public static final int method128(byte arg0, int arg1) {
        if (arg0 <= 49) {
            field378 = 42;
        }
        field377++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "(II)V")
    public static final void method129(int arg0, int arg1) {
        field368++;
        if (class233.method1442(false, arg0)) {
            class181.method1216(-1, class220.field2917[arg0], arg1 ^ arg1);
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Z[BIII)Z")
    private final boolean method130(boolean arg0, byte[] arg1, int arg2, int arg3, int arg4) {
        field374++;
        class344 var6 = this.field371;
        synchronized (this.field371) {
            try {
                int var7;
                if (arg0) {
                    if ((long) (arg2 * 6 + 6) > this.field370.method2135(arg3 ^ 0x4AC8)) {
                        return false;
                    }
                    this.field370.method2139((long) (arg2 * 6), (byte) -116);
                    this.field370.method2137(class240.field3166, 0, true, 6);
                    var7 = ((class240.field3166[3] & 0xFF) << 16) + (class240.field3166[4] & 0xFF << 8) + (class240.field3166[5] & 0xFF);
                    if (var7 <= 0 || this.field371.method2135(32452) / 520L < (long) var7) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field371.method2135(32452) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class240.field3166[4] = (byte) (var7 >> 8);
                class240.field3166[1] = (byte) (arg4 >> 8);
                class240.field3166[2] = (byte) arg4;
                class240.field3166[3] = (byte) (var7 >> 16);
                class240.field3166[5] = (byte) var7;
                class240.field3166[0] = (byte) (arg4 >> 16);
                this.field370.method2139((long) (arg2 * 6), (byte) -83);
                this.field370.method2136(6, arg3 ^ 0xFFFFCBB0, 0, class240.field3166);
                if (arg3 != 13324) {
                    return false;
                }
                int var11 = 0;
                int var12 = 0;
                while (var11 < arg4) {
                    int var13 = 0;
                    if (arg0) {
                        label110: {
                            this.field371.method2139((long) (var7 * 520), (byte) -94);
                            try {
                                this.field371.method2137(class240.field3166, 0, true, 8);
                            } catch (EOFException var36) {
                                return true;
                            }
                            int var14 = (class240.field3166[0] & 0xFF << 8) + (class240.field3166[1] & 0xFF);
                            int var15 = (class240.field3166[2] & 0xFF << 8) + (class240.field3166[3] & 0xFF);
                            var13 = ((class240.field3166[4] & 0xFF) << 16) + (class240.field3166[5] & 0xFF << 8) + (class240.field3166[6] & 0xFF);
                            int var16 = class240.field3166[7] & 0xFF;
                            if (arg2 == var14 && var12 == var15 && this.field367 == var16) {
                                if (var13 >= 0 && (long) var13 <= this.field371.method2135(32452) / 520L) {
                                    break label110;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var13 == 0) {
                        arg0 = false;
                        var13 = (int) ((this.field371.method2135(arg3 + 19128) + 519L) / 520L);
                        if (var13 == 0) {
                            var13++;
                        }
                        if (var7 == var13) {
                            var13++;
                        }
                    }
                    class240.field3166[0] = (byte) (arg2 >> 8);
                    if (arg4 - var11 <= 512) {
                        var13 = 0;
                    }
                    class240.field3166[1] = (byte) arg2;
                    class240.field3166[2] = (byte) (var12 >> 8);
                    class240.field3166[3] = (byte) var12;
                    class240.field3166[5] = (byte) (var13 >> 8);
                    class240.field3166[4] = (byte) (var13 >> 16);
                    class240.field3166[7] = (byte) this.field367;
                    class240.field3166[6] = (byte) var13;
                    this.field371.method2139((long) (var7 * 520), (byte) -1);
                    this.field371.method2136(8, -118, 0, class240.field3166);
                    int var19 = arg4 - var11;
                    if (var19 > 512) {
                        var19 = 512;
                    }
                    this.field371.method2136(var19, -95, var11, arg1);
                    var11 += var19;
                    var7 = var13;
                    var12++;
                }
                return true;
            } catch (IOException var37) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(I)V")
    public static void method131(int arg0) {
        field365 = null;
        field373 = null;
        if (arg0 != -1) {
            field375 = 115;
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "([BIZI)Z")
    public final boolean method132(byte[] arg0, int arg1, boolean arg2, int arg3) {
        field364++;
        class344 var5 = this.field371;
        synchronized (this.field371) {
            if (arg1 < 0 || this.field376 < arg1) {
                throw new IllegalArgumentException();
            }
            if (arg2) {
                this.field376 = 103;
            }
            boolean var6 = this.method130(true, arg0, arg3, 13324, arg1);
            if (!var6) {
                var6 = this.method130(false, arg0, arg3, 13324, arg1);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIIIIZ)V")
    public static final void method133(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field372++;
        long var6 = (long) ((arg5 ? Integer.MIN_VALUE : 0) | arg0);
        class15 var8 = (class15) class94.field1450.method2002((byte) -108, var6);
        if (var8 == null) {
            var8 = new class15();
            class94.field1450.method2001(arg1 - 118, var8, var6);
        }
        if (var8.field330.length <= arg4) {
            int[] var9 = new int[arg4 + 1];
            int[] var10 = new int[arg4 + 1];
            for (int var11 = 0; var11 < var8.field330.length; var11++) {
                var9[var11] = var8.field330[var11];
                var10[var11] = var8.field328[var11];
            }
            for (int var12 = var8.field330.length; var12 < arg4; var12++) {
                var9[var12] = -1;
                var10[var12] = 0;
            }
            var8.field330 = var9;
            var8.field328 = var10;
        }
        var8.field330[arg4] = arg3;
        var8.field328[arg4] = arg2;
        if (arg1 != 0) {
            method134(3, 30);
        }
    }

    @OriginalMember(owner = "client!nr", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field363++;
        return "Cache:" + this.field367;
    }

    @OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(ILgd;Lgd;I)V")
    public class19(int arg0, class344 arg1, class344 arg2, int arg3) {
        this.field370 = arg2;
        this.field376 = arg3;
        this.field367 = arg0;
        this.field371 = arg1;
    }

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "(II)V")
    public static final void method134(int arg0, int arg1) {
        field369++;
        class489 var2 = class704.method3942(arg1, arg0, arg0 ^ 0xA);
        var2.method2799(-76);
    }
}
