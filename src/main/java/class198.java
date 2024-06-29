import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class198 {

    @OriginalMember(owner = "client!al", name = "w", descriptor = "J")
    private long field2997 = -1L;

    @OriginalMember(owner = "client!al", name = "t", descriptor = "I")
    private int field2994 = 0;

    @OriginalMember(owner = "client!al", name = "y", descriptor = "J")
    private long field2999 = -1L;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "Lvn;")
    private class235 field2975;

    @OriginalMember(owner = "client!al", name = "s", descriptor = "J")
    private long field2993;

    @OriginalMember(owner = "client!al", name = "b", descriptor = "J")
    private long field2976;

    @OriginalMember(owner = "client!al", name = "q", descriptor = "[B")
    private byte[] field2991;

    @OriginalMember(owner = "client!al", name = "x", descriptor = "[B")
    private byte[] field2998;

    @OriginalMember(owner = "client!al", name = "p", descriptor = "J")
    private long field2990;

    @OriginalMember(owner = "client!al", name = "m", descriptor = "Lwl;")
    public static class452 field2987 = new class452(45, 3);

    @OriginalMember(owner = "client!al", name = "z", descriptor = "Lpf;")
    public static class425 field3000 = new class425(39, 2);

    @OriginalMember(owner = "client!al", name = "D", descriptor = "I")
    public static int field3004 = 104;

    @OriginalMember(owner = "client!al", name = "F", descriptor = "S")
    public static short field3006 = 320;

    @OriginalMember(owner = "client!al", name = "G", descriptor = "I")
    public static int field3007 = 0;

    @OriginalMember(owner = "client!al", name = "c", descriptor = "I")
    public static int field2977;

    @OriginalMember(owner = "client!al", name = "d", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!al", name = "e", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!al", name = "f", descriptor = "I")
    public static int field2980;

    @OriginalMember(owner = "client!al", name = "g", descriptor = "I")
    public static int field2981;

    @OriginalMember(owner = "client!al", name = "h", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!al", name = "i", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!al", name = "j", descriptor = "I")
    public static int field2984;

    @OriginalMember(owner = "client!al", name = "k", descriptor = "I")
    public static int field2985;

    @OriginalMember(owner = "client!al", name = "l", descriptor = "I")
    private int field2986;

    @OriginalMember(owner = "client!al", name = "n", descriptor = "I")
    public static int field2988;

    @OriginalMember(owner = "client!al", name = "o", descriptor = "I")
    public static int field2989;

    @OriginalMember(owner = "client!al", name = "u", descriptor = "I")
    public static int field2995;

    @OriginalMember(owner = "client!al", name = "v", descriptor = "I")
    public static int field2996;

    @OriginalMember(owner = "client!al", name = "A", descriptor = "I")
    public static int field3001;

    @OriginalMember(owner = "client!al", name = "B", descriptor = "I")
    public static int field3002;

    @OriginalMember(owner = "client!al", name = "C", descriptor = "I")
    public static int field3003;

    @OriginalMember(owner = "client!al", name = "E", descriptor = "I")
    public static int field3005;

    @OriginalMember(owner = "client!al", name = "r", descriptor = "J")
    private long field2992;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)J")
    public final long method1177(int arg0) {
        if (arg0 < 57) {
            method1184(false, 6, -14, (class170[]) null, 76, true);
        }
        field2996++;
        return this.field2976;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1178(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2984++;
        if (arg2 == arg6) {
            class251.method1527(arg2, arg5, arg1, arg4, arg0, -27, arg3);
            return;
        }
        if (arg7 != -13117) {
            field3006 = 95;
        }
        if (arg0 - arg2 >= class192.field2917 && (arg0 + arg2) <= class39.field497 && arg3 - arg6 >= class189.field2831 && class204.field3060 >= arg3 + arg6) {
            class120.method723((byte) -27, arg5, arg6, arg2, arg4, arg3, arg1, arg0);
        } else {
            class113.method687(arg4, arg0, arg6, 388842497, arg5, arg2, arg3, arg1);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ZII[B)V")
    public final void method1179(boolean arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field2980++;
        try {
            if (this.field2976 < this.field2990 + ((long) arg2)) {
                this.field2976 = (long) arg2 + this.field2990;
            }
            if (arg0) {
                field3004 = 61;
            }
            if (this.field2999 != -1L && (this.field2990 < this.field2999 || this.field2990 > this.field2999 + ((long) this.field2994))) {
                this.method1187((byte) -63);
            }
            if (this.field2999 != -1L && this.field2990 + ((long) arg2) > (long) this.field2998.length + this.field2999) {
                int var5 = (int) (-this.field2990 - (-this.field2999 - (long) this.field2998.length));
                class129.method768(arg3, arg1, this.field2998, (int) (this.field2990 - this.field2999), var5);
                arg2 -= var5;
                this.field2990 += (long) var5;
                arg1 += var5;
                this.field2994 = this.field2998.length;
                this.method1187((byte) -63);
            }
            if (this.field2998.length < arg2) {
                if (this.field2992 != this.field2990) {
                    this.field2975.method1422(this.field2990, true);
                    this.field2992 = this.field2990;
                }
                this.field2975.method1417(arg2, arg3, arg1, false);
                this.field2992 += (long) arg2;
                if (this.field2993 < this.field2992) {
                    this.field2993 = this.field2992;
                }
                long var6 = -1L;
                long var8 = -1L;
                if (this.field2990 >= this.field2997 && (long) this.field2986 + this.field2997 > this.field2990) {
                    var6 = this.field2990;
                } else if (this.field2997 >= this.field2990 && ((long) arg2 + this.field2990) > this.field2997) {
                    var6 = this.field2997;
                }
                if (this.field2997 < (long) arg2 + this.field2990 && this.field2990 + ((long) arg2) <= (long) this.field2986 + this.field2997) {
                    var8 = (long) arg2 + this.field2990;
                } else if (this.field2990 < (this.field2997 + ((long) this.field2986)) && ((long) arg2 + this.field2990) >= ((long) this.field2986 + this.field2997)) {
                    var8 = (long) this.field2986 + this.field2997;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class129.method768(arg3, (int) ((long) arg1 - (this.field2990 - var6)), this.field2991, (int) (var6 - this.field2997), var10);
                }
                this.field2990 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field2999 == -1L) {
                    this.field2999 = this.field2990;
                }
                class129.method768(arg3, arg1, this.field2998, (int) (this.field2990 - this.field2999), arg2);
                this.field2990 += (long) arg2;
                if ((this.field2990 - this.field2999) > ((long) this.field2994)) {
                    this.field2994 = (int) (this.field2990 - this.field2999);
                }
            }
        } catch (IOException var12) {
            this.field2992 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(I)V")
    public static final void method1180(int arg0) {
        if (arg0 != -16) {
            field2987 = null;
        }
        field2985++;
        if (class34.field423) {
            return;
        }
        if (class212.field3193) {
            class188.field2811 = (float) ((int) class188.field2811 + 47 & 0xFFFFFFF0);
        } else {
            class228.field3472 += (12.0F - class228.field3472) / 2.0F;
        }
        class424.field6235 = true;
        class34.field423 = true;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(II)Lok;")
    public static final class66 method1181(int arg0, int arg1) {
        field3003++;
        class66 var2 = (class66) class440.field6476.method1491((long) arg0, arg1 ^ 0x22);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class442.field6499.method823(arg1, -20334, arg0);
        class66 var4 = new class66();
        if (var3 != null) {
            var4.method447(arg0, new class385(var3), 17466);
        }
        class440.field6476.method1488(128, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!al", name = "c", descriptor = "(I)Z")
    public static final boolean method1182(int arg0) {
        if (arg0 == 4) {
            field2979++;
            return class115.field1524;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IZ[BI)V")
    public final void method1183(int arg0, boolean arg1, byte[] arg2, int arg3) throws IOException {
        field2981++;
        try {
            if (arg2.length < (arg0 + arg3)) {
                throw new ArrayIndexOutOfBoundsException(arg0 - (arg2.length - arg3));
            }
            if (!arg1) {
                this.field2994 = -124;
            }
            if (this.field2999 != -1L && this.field2990 >= this.field2999 && (long) arg3 + this.field2990 <= (long) this.field2994 + this.field2999) {
                class129.method768(this.field2998, (int) (this.field2990 - this.field2999), arg2, arg0, arg3);
                this.field2990 += (long) arg3;
                return;
            }
            long var5 = this.field2990;
            int var7 = arg0;
            int var8 = arg3;
            if (this.field2990 >= this.field2997 && (long) this.field2986 + this.field2997 > this.field2990) {
                int var9 = (int) (this.field2997 + (long) this.field2986 - this.field2990);
                if (var9 > arg3) {
                    var9 = arg3;
                }
                class129.method768(this.field2991, (int) (this.field2990 - this.field2997), arg2, arg0, var9);
                arg0 += var9;
                this.field2990 += (long) var9;
                arg3 -= var9;
            }
            if (arg3 > this.field2991.length) {
                this.field2975.method1422(this.field2990, arg1);
                this.field2992 = this.field2990;
                while (arg3 > 0) {
                    int var10 = this.field2975.method1419(0, arg2, arg0, arg3);
                    if (var10 == -1) {
                        break;
                    }
                    arg3 -= var10;
                    this.field2990 += (long) var10;
                    this.field2992 += (long) var10;
                    arg0 += var10;
                }
            } else if (arg3 > 0) {
                this.method1191(0);
                int var11 = arg3;
                if (arg3 > this.field2986) {
                    var11 = this.field2986;
                }
                class129.method768(this.field2991, 0, arg2, arg0, var11);
                this.field2990 += (long) var11;
                arg0 += var11;
                arg3 -= var11;
            }
            if (this.field2999 != -1L) {
                if (this.field2999 > this.field2990 && arg3 > 0) {
                    int var12 = (int) (this.field2999 - this.field2990) + arg0;
                    if (var12 > arg0 + arg3) {
                        var12 = arg0 + arg3;
                    }
                    while (var12 > arg0) {
                        arg2[arg0++] = 0;
                        arg3--;
                        this.field2990++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (this.field2999 >= var5 && this.field2999 < (long) var8 + var5) {
                    var13 = this.field2999;
                } else if (var5 >= this.field2999 && var5 < this.field2999 + ((long) this.field2994)) {
                    var13 = var5;
                }
                if (var5 < (long) this.field2994 + this.field2999 && (long) var8 + var5 >= (long) this.field2994 + this.field2999) {
                    var15 = (long) this.field2994 + this.field2999;
                } else if (this.field2999 < ((long) var8 + var5) && ((long) this.field2994 + this.field2999) >= ((long) var8 + var5)) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class129.method768(this.field2998, (int) (var13 - this.field2999), arg2, (int) (var13 - var5) + var7, var17);
                    if (var15 > this.field2990) {
                        arg3 = (int) ((long) arg3 - (var15 - this.field2990));
                        this.field2990 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field2992 = -1L;
            throw var19;
        }
        if (arg3 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ZII[Lfh;IZ)V")
    public static final void method1184(boolean arg0, int arg1, int arg2, class170[] arg3, int arg4, boolean arg5) {
        for (int var6 = 0; var6 < arg3.length; var6++) {
            class170 var7 = arg3[var6];
            if (var7 != null && var7.field2474 == arg4) {
                class205.method1211(30, arg2, var7, arg1, arg5);
                class425.method2620(arg2, var7, arg1, (byte) 75);
                if (var7.field2521 > (var7.field2577 - var7.field2561)) {
                    var7.field2521 = var7.field2577 - var7.field2561;
                }
                if (var7.field2521 < 0) {
                    var7.field2521 = 0;
                }
                if (var7.field2559 > var7.field2598 - var7.field2501) {
                    var7.field2559 = var7.field2598 - var7.field2501;
                }
                if (var7.field2559 < 0) {
                    var7.field2559 = 0;
                }
                if (var7.field2558 == 0) {
                    class207.method1215(var7, arg5, 109);
                }
            }
        }
        if (arg0) {
            field2983++;
        }
    }

    @OriginalMember(owner = "client!al", name = "d", descriptor = "(I)V")
    public static final void method1185(int arg0) {
        for (class306 var1 = (class306) class372.field5433.method2514((byte) 61); var1 != null; var1 = (class306) class372.field5433.method2511(43)) {
            if (class435.method2670(var1.field4616, -61)) {
                class63.method340(var1, 89);
            }
        }
        field2988++;
        if (~class149.field2067 == arg0) {
            class306.field4628 = false;
            class238.method1436(class331.field4957, class258.field3957, class331.field4946, class353.field5219, arg0 + 51);
            return;
        }
        class238.method1436(class331.field4957, class258.field3957, class331.field4946, class353.field5219, 112);
        int var2 = class188.field2828.method1693(arg0 - 100, class302.field4562.method937((byte) 108, class27.field356));
        for (class306 var3 = (class306) class372.field5433.method2514((byte) 61); var3 != null; var3 = (class306) class372.field5433.method2511(54)) {
            int var4 = class451.method2780(arg0 ^ 0xFFFFFFFC, var3);
            if (var4 > var2) {
                var2 = var4;
            }
        }
        class258.field3957 = class149.field2067 * 16 + (class338.field5046 ? 26 : 22);
        class331.field4946 = var2 + 8;
    }

    @OriginalMember(owner = "client!al", name = "e", descriptor = "(I)V")
    public static void method1186(int arg0) {
        if (arg0 <= -102) {
            field2987 = null;
            field3000 = null;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(B)V")
    private final void method1187(byte arg0) throws IOException {
        field3005++;
        if (arg0 != -63) {
            this.field2976 = -23L;
        }
        if (this.field2999 == -1L) {
            return;
        }
        if (this.field2999 != this.field2992) {
            this.field2975.method1422(this.field2999, true);
            this.field2992 = this.field2999;
        }
        this.field2975.method1417(this.field2994, this.field2998, 0, false);
        this.field2992 += (long) this.field2994;
        if (this.field2993 < this.field2992) {
            this.field2993 = this.field2992;
        }
        long var2 = -1L;
        long var4 = -1L;
        if (this.field2997 <= this.field2999 && this.field2999 < (long) this.field2986 + this.field2997) {
            var2 = this.field2999;
        } else if (this.field2999 <= this.field2997 && ((long) this.field2994 + this.field2999) > this.field2997) {
            var2 = this.field2997;
        }
        if (this.field2997 < ((long) this.field2994 + this.field2999) && (long) this.field2986 + this.field2997 >= this.field2999 - -((long) this.field2994)) {
            var4 = (long) this.field2994 + this.field2999;
        } else if (this.field2999 < ((long) this.field2986 + this.field2997) && ((long) this.field2986 + this.field2997) <= ((long) this.field2994 + this.field2999)) {
            var4 = this.field2997 + ((long) this.field2986);
        }
        if (var2 > -1L && var2 < var4) {
            int var6 = (int) (var4 - var2);
            class129.method768(this.field2998, (int) (var2 - this.field2999), this.field2991, (int) (var2 - this.field2997), var6);
        }
        this.field2994 = 0;
        this.field2999 = -1L;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "([BI)V")
    public final void method1188(byte[] arg0, int arg1) throws IOException {
        this.method1183(arg1, true, arg0, arg0.length);
        field2978++;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(JB)V")
    public final void method1189(long arg0, byte arg1) throws IOException {
        field3002++;
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method1190((byte) 78));
        }
        if (arg1 != 83) {
            method1193((class385) null, -14);
        }
        this.field2990 = arg0;
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(B)Ljava/io/File;")
    private final File method1190(byte arg0) {
        field3001++;
        int var2 = -16 / ((arg0 - 34) / 32);
        return this.field2975.method1418(0);
    }

    @OriginalMember(owner = "client!al", name = "f", descriptor = "(I)V")
    private final void method1191(int arg0) throws IOException {
        this.field2986 = arg0;
        field2982++;
        if (this.field2992 != this.field2990) {
            this.field2975.method1422(this.field2990, true);
            this.field2992 = this.field2990;
        }
        this.field2997 = this.field2990;
        while (this.field2991.length > this.field2986) {
            int var2 = this.field2991.length - this.field2986;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field2975.method1419(0, this.field2991, this.field2986, var2);
            if (var3 == -1) {
                break;
            }
            this.field2992 += (long) var3;
            this.field2986 += var3;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIII)I")
    public static final int method1192(int arg0, int arg1, int arg2, int arg3) {
        field2977++;
        if (arg3 != -3) {
            return 52;
        } else if (arg0 <= arg2) {
            return arg1 < arg2 ? arg1 : arg2;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Lef;I)V")
    public static final void method1193(class385 arg0, int arg1) {
        field2995++;
        if (arg0.field5685.length - arg0.field5666 < 1) {
            return;
        }
        if (arg1 != -14859) {
            method1178(52, -62, 78, -39, -115, 16, -5, 30);
        }
        int var2 = arg0.method2343(255);
        if (var2 < 0 || var2 > 1 || arg0.field5685.length - arg0.field5666 < 2) {
            return;
        }
        int var3 = arg0.method2323(arg1 ^ 0x3A60);
        if (var3 * 6 != arg0.field5685.length - arg0.field5666) {
            return;
        }
        while (true) {
            int var4;
            int var5;
            do {
                do {
                    do {
                        if (arg0.field5685.length <= arg0.field5666) {
                            return;
                        }
                        var4 = arg0.method2323(-69);
                        var5 = arg0.method2354(255);
                    } while (var4 >= class413.field6135.length);
                } while (!class14.field174[var4]);
            } while (class409.method2571(var4, arg1 ^ 0xFFFFC5A4).field265 == '1' && (var5 < -1 || var5 > 1));
            class413.field6135[var4] = var5;
        }
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lvn;II)V")
    public class198(class235 arg0, int arg1, int arg2) throws IOException {
        this.field2975 = arg0;
        this.field2976 = this.field2993 = arg0.method1421((byte) 71);
        this.field2991 = new byte[arg1];
        this.field2998 = new byte[arg2];
        this.field2990 = 0L;
    }
}
