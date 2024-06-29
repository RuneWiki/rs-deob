import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class124 {

    @OriginalMember(owner = "client!t", name = "a", descriptor = "I")
    private int field2989 = 65000;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "Laa;")
    private class2 field2990 = null;

    @OriginalMember(owner = "client!t", name = "l", descriptor = "Laa;")
    private class2 field3000 = null;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "I")
    private int field2991;

    @OriginalMember(owner = "client!t", name = "h", descriptor = "Lmb;")
    public static class84 field2996 = class79.method672(true, "backbase2");

    @OriginalMember(owner = "client!t", name = "i", descriptor = "Lca;")
    public static class16 field2997 = new class16();

    @OriginalMember(owner = "client!t", name = "o", descriptor = "I")
    public static int field3003 = 0;

    @OriginalMember(owner = "client!t", name = "v", descriptor = "Lmb;")
    private static class84 field3010 = class79.method672(true, "Connection lost");

    @OriginalMember(owner = "client!t", name = "r", descriptor = "Lmb;")
    private static class84 field3006 = class79.method672(true, " seconds)3");

    @OriginalMember(owner = "client!t", name = "q", descriptor = "Lmb;")
    private static class84 field3005 = class79.method672(true, "Loaded fonts");

    @OriginalMember(owner = "client!t", name = "t", descriptor = "Lmb;")
    public static class84 field3008 = field3010;

    @OriginalMember(owner = "client!t", name = "u", descriptor = "I")
    public static int field3009 = 0;

    @OriginalMember(owner = "client!t", name = "x", descriptor = "Z")
    public static boolean field3012 = false;

    @OriginalMember(owner = "client!t", name = "n", descriptor = "Lmb;")
    public static class84 field3002 = field3005;

    @OriginalMember(owner = "client!t", name = "y", descriptor = "Lmb;")
    public static class84 field3013 = field3006;

    @OriginalMember(owner = "client!t", name = "z", descriptor = "Lmb;")
    public static class84 field3014 = class79.method672(true, "Verbinde mit Server)3)3)3");

    @OriginalMember(owner = "client!t", name = "B", descriptor = "Lmb;")
    private static class84 field3016 = class79.method672(true, "Connecting to friendserver");

    @OriginalMember(owner = "client!t", name = "p", descriptor = "Lmb;")
    public static class84 field3004 = field3016;

    @OriginalMember(owner = "client!t", name = "d", descriptor = "I")
    public static int field2992;

    @OriginalMember(owner = "client!t", name = "e", descriptor = "I")
    public static int field2993;

    @OriginalMember(owner = "client!t", name = "f", descriptor = "I")
    public static int field2994;

    @OriginalMember(owner = "client!t", name = "g", descriptor = "I")
    public static int field2995;

    @OriginalMember(owner = "client!t", name = "j", descriptor = "I")
    public static int field2998;

    @OriginalMember(owner = "client!t", name = "k", descriptor = "I")
    public static int field2999;

    @OriginalMember(owner = "client!t", name = "m", descriptor = "I")
    public static int field3001;

    @OriginalMember(owner = "client!t", name = "s", descriptor = "I")
    public static int field3007;

    @OriginalMember(owner = "client!t", name = "A", descriptor = "I")
    public static int field3015;

    @OriginalMember(owner = "client!t", name = "w", descriptor = "Lr;")
    public static class112 field3011;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ILsd;II)[Lsc;")
    public static final class121[] method1021(int arg0, class122 arg1, int arg2, int arg3) {
        if (arg2 != -1601600880) {
            field3002 = null;
        }
        field2995++;
        return class127.method1037(arg3, (byte) -104, arg1, arg0) ? class134.method1075(-125) : null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ILge;ZLt;)V")
    public static final void method1022(int arg0, class47 arg1, boolean arg2, class124 arg3) {
        class79 var4 = new class79();
        var4.field370 = arg0;
        field3007++;
        var4.field1966 = arg1;
        var4.field1965 = arg3;
        var4.field1963 = 1;
        class16 var5 = class24.field580;
        synchronized (class24.field580) {
            class24.field580.method108(var4, -112);
        }
        class79.method671(0);
        if (arg2) {
            method1021(-43, null, 70, 61);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(B)V")
    public static void method1023(byte arg0) {
        field3014 = null;
        field3013 = null;
        if (arg0 != 67) {
            return;
        }
        field3016 = null;
        field3004 = null;
        field3002 = null;
        field3010 = null;
        field3008 = null;
        field3005 = null;
        field3011 = null;
        field3006 = null;
        field2997 = null;
        field2996 = null;
    }

    @OriginalMember(owner = "client!t", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2992++;
        return "Cache:" + this.field2991;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(B[BIIZ)Z")
    private final boolean method1024(byte arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        if (arg0 >= -70) {
            return true;
        }
        field2994++;
        class2 var6 = this.field3000;
        synchronized (this.field3000) {
            try {
                int var8;
                if (arg4) {
                    if (this.field2990.method12(false) < (long) (arg3 * 6 + 6)) {
                        return false;
                    }
                    this.field2990.method20((byte) -125, (long) (arg3 * 6));
                    this.field2990.method17(0, 0, class22.field504, 6);
                    var8 = (class22.field504[5] & 0xFF) + ((class22.field504[3] & 0xFF) << 16) + ((class22.field504[4] & 0xFF) << 8);
                    if (var8 <= 0 || (long) var8 > this.field3000.method12(false) / 520L) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field3000.method12(false) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class22.field504[0] = (byte) (arg2 >> 16);
                class22.field504[1] = (byte) (arg2 >> 8);
                class22.field504[5] = (byte) var8;
                class22.field504[4] = (byte) (var8 >> 8);
                class22.field504[3] = (byte) (var8 >> 16);
                int var10 = 0;
                int var11 = 0;
                class22.field504[2] = (byte) arg2;
                this.field2990.method20((byte) -125, (long) (arg3 * 6));
                this.field2990.method10(0, 6, -117, class22.field504);
                while (arg2 > var11) {
                    int var12 = 0;
                    if (arg4) {
                        label109: {
                            this.field3000.method20((byte) -123, (long) (var8 * 520));
                            try {
                                this.field3000.method17(0, 0, class22.field504, 8);
                            } catch (EOFException var33) {
                                return true;
                            }
                            int var13 = ((class22.field504[0] & 0xFF) << 8) + (class22.field504[1] & 0xFF);
                            int var14 = ((class22.field504[2] & 0xFF) << 8) + (class22.field504[3] & 0xFF);
                            var12 = ((class22.field504[5] & 0xFF) << 8) + ((class22.field504[4] & 0xFF) << 16) + (class22.field504[6] & 0xFF);
                            int var15 = class22.field504[7] & 0xFF;
                            if (arg3 == var13 && var10 == var14 && this.field2991 == var15) {
                                if (var12 >= 0 && (long) var12 <= this.field3000.method12(false) / 520L) {
                                    break label109;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        arg4 = false;
                        var12 = (int) ((this.field3000.method12(false) + 519L) / 520L);
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var8 == var12) {
                            var12++;
                        }
                    }
                    int var18 = arg2 - var11;
                    class22.field504[7] = (byte) this.field2991;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    class22.field504[2] = (byte) (var10 >> 8);
                    class22.field504[3] = (byte) var10;
                    class22.field504[1] = (byte) arg3;
                    if (arg2 - var11 <= 512) {
                        var12 = 0;
                    }
                    class22.field504[4] = (byte) (var12 >> 16);
                    class22.field504[5] = (byte) (var12 >> 8);
                    class22.field504[6] = (byte) var12;
                    class22.field504[0] = (byte) (arg3 >> 8);
                    this.field3000.method20((byte) -97, (long) (var8 * 520));
                    this.field3000.method10(0, 8, 104, class22.field504);
                    var10++;
                    var8 = var12;
                    this.field3000.method10(var11, var18, -127, arg1);
                    var11 += var18;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ZI[BI)Z")
    public final boolean method1025(boolean arg0, int arg1, byte[] arg2, int arg3) {
        field2998++;
        class2 var5 = this.field3000;
        synchronized (this.field3000) {
            if (arg3 < 0 || this.field2989 < arg3) {
                throw new IllegalArgumentException();
            }
            if (arg0) {
                method1023((byte) 17);
            }
            boolean var6 = this.method1024((byte) -124, arg2, arg3, arg1, true);
            if (!var6) {
                var6 = this.method1024((byte) -106, arg2, arg3, arg1, false);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ZI)[B")
    public final byte[] method1026(boolean arg0, int arg1) {
        field3001++;
        class2 var3 = this.field3000;
        synchronized (this.field3000) {
            try {
                if (this.field2990.method12(arg0) < (long) (arg1 * 6 + 6)) {
                    return null;
                }
                this.field2990.method20((byte) -91, (long) (arg1 * 6));
                this.field2990.method17(0, 0, class22.field504, 6);
                int var5 = (class22.field504[2] & 0xFF) + ((class22.field504[1] & 0xFF) << 8) + ((class22.field504[0] & 0xFF) << 16);
                int var6 = (class22.field504[5] & 0xFF) + ((class22.field504[4] & 0xFF) << 8) + ((class22.field504[3] & 0xFF) << 16);
                if (var5 < 0 || var5 > this.field2989) {
                    return null;
                } else if (var6 > 0 && this.field3000.method12(false) / 520L >= (long) var6) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = 0;
                    while (var5 > var10) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field3000.method20((byte) -101, (long) (var6 * 520));
                        int var13 = var5 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field3000.method17(0, 0, class22.field504, var13 + 8);
                        int var14 = ((class22.field504[0] & 0xFF) << 8) + (class22.field504[1] & 0xFF);
                        int var15 = ((class22.field504[2] & 0xFF) << 8) + (class22.field504[3] & 0xFF);
                        int var16 = ((class22.field504[5] & 0xFF) << 8) + ((class22.field504[4] & 0xFF) << 16) + (class22.field504[6] & 0xFF);
                        int var17 = class22.field504[7] & 0xFF;
                        if (arg1 == var14 && var11 == var15 && this.field2991 == var17) {
                            if (var16 >= 0 && this.field3000.method12(false) / 520L >= (long) var16) {
                                var6 = var16;
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var9[var10++] = class22.field504[var20 + 8];
                                }
                                var11++;
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

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(ILaa;Laa;I)V")
    public class124(int arg0, class2 arg1, class2 arg2, int arg3) {
        this.field2991 = arg0;
        this.field2990 = arg2;
        this.field3000 = arg1;
        this.field2989 = arg3;
    }
}
