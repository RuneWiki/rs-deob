import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class96 {

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "I")
    private int field2078 = 65000;

    @OriginalMember(owner = "client!nf", name = "o", descriptor = "Ldd;")
    private class26 field2086 = null;

    @OriginalMember(owner = "client!nf", name = "x", descriptor = "Ldd;")
    private class26 field2095 = null;

    @OriginalMember(owner = "client!nf", name = "m", descriptor = "I")
    private int field2084;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "Lod;")
    private static class101 field2072 = class46.method335(72, "Welcome to RuneScape");

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "[I")
    public static int[] field2076 = new int[100];

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "Lod;")
    private static class101 field2082 = class46.method335(-78, "Connection lost");

    @OriginalMember(owner = "client!nf", name = "q", descriptor = "Lod;")
    public static class101 field2088 = field2072;

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "Lod;")
    public static class101 field2075 = field2082;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "Lod;")
    public static class101 field2073 = class46.method335(74, "Unerwartete Antwort vom Anmelde)2Server)3");

    @OriginalMember(owner = "client!nf", name = "s", descriptor = "Lod;")
    private static class101 field2090 = class46.method335(76, "Unable to connect)3");

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "[[B")
    public static byte[][] field2081 = new byte[1000][];

    @OriginalMember(owner = "client!nf", name = "t", descriptor = "Lod;")
    public static class101 field2091 = field2090;

    @OriginalMember(owner = "client!nf", name = "l", descriptor = "Lod;")
    public static class101 field2083 = field2090;

    @OriginalMember(owner = "client!nf", name = "u", descriptor = "Lud;")
    public static class143 field2092 = new class143(8);

    @OriginalMember(owner = "client!nf", name = "y", descriptor = "I")
    public static volatile int field2096 = 0;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "I")
    public static int field2074;

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "I")
    public static int field2077;

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "I")
    public static int field2079;

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "I")
    public static int field2080;

    @OriginalMember(owner = "client!nf", name = "n", descriptor = "I")
    public static int field2085;

    @OriginalMember(owner = "client!nf", name = "p", descriptor = "I")
    public static int field2087;

    @OriginalMember(owner = "client!nf", name = "r", descriptor = "I")
    public static int field2089;

    @OriginalMember(owner = "client!nf", name = "w", descriptor = "I")
    public static int field2094;

    @OriginalMember(owner = "client!nf", name = "v", descriptor = "J")
    public static long field2093;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I[BBZI)Z")
    private final boolean method668(int arg0, byte[] arg1, byte arg2, boolean arg3, int arg4) {
        field2087++;
        class26 var6 = this.field2086;
        synchronized (this.field2086) {
            try {
                int var8;
                if (arg3) {
                    if (this.field2095.method210(-74) < (long) (arg0 * 6 + 6)) {
                        return false;
                    }
                    this.field2095.method213((long) (arg0 * 6), -1829);
                    this.field2095.method214(class108.field2301, 0, -1, 6);
                    var8 = (class108.field2301[5] & 0xFF) + ((class108.field2301[4] & 0xFF) << 8) + ((class108.field2301[3] & 0xFF) << 16);
                    if (var8 <= 0 || this.field2086.method210(-90) / 520L < (long) var8) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field2086.method210(-115) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class108.field2301[5] = (byte) var8;
                class108.field2301[0] = (byte) (arg4 >> 16);
                class108.field2301[4] = (byte) (var8 >> 8);
                class108.field2301[1] = (byte) (arg4 >> 8);
                class108.field2301[2] = (byte) arg4;
                if (arg2 >= -46) {
                    field2081 = null;
                }
                class108.field2301[3] = (byte) (var8 >> 16);
                int var10 = 0;
                this.field2095.method213((long) (arg0 * 6), -1829);
                int var11 = 0;
                this.field2095.method207(6, (byte) -96, class108.field2301, 0);
                while (var11 < arg4) {
                    int var12 = 0;
                    if (arg3) {
                        label108: {
                            this.field2086.method213((long) (var8 * 520), -1829);
                            try {
                                this.field2086.method214(class108.field2301, 0, -1, 8);
                            } catch (EOFException var33) {
                                return true;
                            }
                            var12 = (class108.field2301[6] & 0xFF) + ((class108.field2301[5] & 0xFF) << 8) + ((class108.field2301[4] & 0xFF) << 16);
                            int var13 = ((class108.field2301[2] & 0xFF) << 8) + (class108.field2301[3] & 0xFF);
                            int var14 = ((class108.field2301[0] & 0xFF) << 8) + (class108.field2301[1] & 0xFF);
                            int var15 = class108.field2301[7] & 0xFF;
                            if (arg0 == var14 && var10 == var13 && this.field2084 == var15) {
                                if (var12 >= 0 && this.field2086.method210(-92) / 520L >= (long) var12) {
                                    break label108;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        var12 = (int) ((this.field2086.method210(-115) + 519L) / 520L);
                        arg3 = false;
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var8 == var12) {
                            var12++;
                        }
                    }
                    class108.field2301[2] = (byte) (var10 >> 8);
                    class108.field2301[3] = (byte) var10;
                    if (arg4 - var11 <= 512) {
                        var12 = 0;
                    }
                    class108.field2301[7] = (byte) this.field2084;
                    class108.field2301[0] = (byte) (arg0 >> 8);
                    class108.field2301[1] = (byte) arg0;
                    class108.field2301[4] = (byte) (var12 >> 16);
                    class108.field2301[6] = (byte) var12;
                    var10++;
                    class108.field2301[5] = (byte) (var12 >> 8);
                    int var18 = arg4 - var11;
                    this.field2086.method213((long) (var8 * 520), -1829);
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    var8 = var12;
                    this.field2086.method207(8, (byte) -96, class108.field2301, 0);
                    this.field2086.method207(var18, (byte) -96, arg1, var11);
                    var11 += var18;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IZ)[B")
    public final byte[] method669(int arg0, boolean arg1) {
        field2080++;
        class26 var3 = this.field2086;
        synchronized (this.field2086) {
            try {
                if (this.field2095.method210(-48) < (long) (arg0 * 6 + 6)) {
                    return null;
                }
                this.field2095.method213((long) (arg0 * 6), -1829);
                this.field2095.method214(class108.field2301, 0, -1, 6);
                if (arg1) {
                    field2073 = null;
                }
                int var5 = ((class108.field2301[1] & 0xFF) << 8) + ((class108.field2301[0] & 0xFF) << 16) + (class108.field2301[2] & 0xFF);
                int var6 = ((class108.field2301[4] & 0xFF) << 8) + ((class108.field2301[3] & 0xFF) << 16) + (class108.field2301[5] & 0xFF);
                if (var5 < 0 || var5 > this.field2078) {
                    return null;
                } else if (var6 > 0 && (long) var6 <= this.field2086.method210(-102) / 520L) {
                    int var9 = 0;
                    byte[] var10 = new byte[var5];
                    int var11 = 0;
                    while (var9 < var5) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field2086.method213((long) (var6 * 520), -1829);
                        int var13 = var5 - var9;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field2086.method214(class108.field2301, 0, -1, var13 + 8);
                        int var14 = ((class108.field2301[0] & 0xFF) << 8) + (class108.field2301[1] & 0xFF);
                        int var15 = ((class108.field2301[2] & 0xFF) << 8) + (class108.field2301[3] & 0xFF);
                        int var16 = (class108.field2301[6] & 0xFF) + (((class108.field2301[4] & 0xFF) << 16) + ((class108.field2301[5] & 0xFF) << 8));
                        int var17 = class108.field2301[7] & 0xFF;
                        if (arg0 == var14 && var11 == var15 && this.field2084 == var17) {
                            if (var16 >= 0 && this.field2086.method210(-108) / 520L >= (long) var16) {
                                var11++;
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var10[var9++] = class108.field2301[var20 + 8];
                                }
                                var6 = var16;
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

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V")
    public static void method670(int arg0) {
        field2092 = null;
        field2082 = null;
        field2075 = null;
        field2076 = null;
        field2090 = null;
        field2091 = null;
        field2081 = null;
        if (arg0 == 3) {
            field2072 = null;
            field2073 = null;
            field2088 = null;
            field2083 = null;
        }
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(I)V")
    public static final void method671(int arg0) {
        field2094++;
        class40.method300(false, class99.field2146);
        class137.field3140++;
        if (class17.field366 && class140.field3232) {
            int var1 = class40.field947;
            int var2 = var1 - class138.field3156;
            int var3 = class105.field2264;
            if (class99.field2149 > var2) {
                var2 = class99.field2149;
            }
            if (class99.field2149 + class86.field1908.field2785 < class99.field2146.field2785 + var2) {
                var2 = class99.field2149 + class86.field1908.field2785 - class99.field2146.field2785;
            }
            int var4 = var2 - class79.field1654;
            int var5 = class99.field2146.field2834;
            int var6 = var2 + class86.field1908.field2833 - class99.field2149;
            int var7 = var3 - class47.field1119;
            if (arg0 != -1201781456) {
                method671(107);
            }
            if (var7 < class85.field1862) {
                var7 = class85.field1862;
            }
            if (class99.field2146.field2871 + var7 > class85.field1862 + class86.field1908.field2871) {
                var7 = class85.field1862 + class86.field1908.field2871 - class99.field2146.field2871;
            }
            int var8 = var7 - class149.field3384;
            if (class99.field2146.field2832 < class137.field3140 && (var4 > var5 || var4 < -var5 || var8 > var5 || -var5 > var8)) {
                class87.field1910 = true;
            }
            int var9 = class86.field1908.field2867 + var7 - class85.field1862;
            if (class99.field2146.field2858 != null && class87.field1910) {
                class141 var10 = new class141();
                var10.field3238 = class99.field2146;
                var10.field3252 = var9;
                var10.field3250 = var6;
                var10.field3247 = class99.field2146.field2858;
                class31.method237((byte) -71, var10);
            }
            if (class27.field724 == 0) {
                if (class87.field1910) {
                    if (class99.field2146.field2800 != null) {
                        class141 var11 = new class141();
                        var11.field3247 = class99.field2146.field2800;
                        var11.field3238 = class99.field2146;
                        var11.field3252 = var9;
                        var11.field3244 = class34.field872;
                        var11.field3250 = var6;
                        class31.method237((byte) -71, var11);
                    }
                    if (class34.field872 != null && class10.method49(class99.field2146, (byte) 110) != null) {
                        class17.field364.method419(213, (byte) 0);
                        client.field486++;
                        class17.field364.method1063((byte) -12, class99.field2146.field2780);
                        class17.field364.method1102(class34.field872.field2780, arg0 ^ 0x5F11A0);
                        class17.field364.method1054(arg0 ^ 0x41C805F8, class34.field872.field2807);
                        class17.field364.method1068(class99.field2146.field2807, 28588);
                    }
                } else if ((client.field482 == 1 || class157.method1216(class54.field1244 - 1, true)) && class54.field1244 > 2) {
                    class102.method744(arg0 + 1201782221);
                } else if (class54.field1244 > 0) {
                    class118.method892(arg0 + 1201781456, class54.field1244 + -1);
                }
                class99.field2146 = null;
            }
        } else if (class137.field3140 > 1) {
            class99.field2146 = null;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(III[B)Z")
    public final boolean method672(int arg0, int arg1, int arg2, byte[] arg3) {
        field2089++;
        class26 var5 = this.field2086;
        synchronized (this.field2086) {
            if (arg2 < 0 || this.field2078 < arg2) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method668(arg0, arg3, (byte) -120, true, arg2);
            if (!var6) {
                var6 = this.method668(arg0, arg3, (byte) -83, false, arg2);
            }
            if (arg1 != -26096) {
                field2096 = -12;
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!nf", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2085++;
        return "Cache:" + this.field2084;
    }

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "(I)V")
    public static final void method673(int arg0) {
        field2077++;
        class56.field1262 = null;
        class63.field1404 = null;
        class83.field1807 = null;
        class23.field530 = null;
        class138.field3182 = null;
        class11.field202 = null;
        class144.field3329 = null;
        class65.field1470 = null;
        class35.field894 = null;
        class43.field1036 = null;
        class115.field2562 = null;
        class137.field3128 = null;
        if (arg0 != 0) {
            method670(-126);
        }
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(ILdd;Ldd;I)V")
    public class96(int arg0, class26 arg1, class26 arg2, int arg3) {
        this.field2095 = arg2;
        this.field2084 = arg0;
        this.field2086 = arg1;
        this.field2078 = arg3;
    }
}
