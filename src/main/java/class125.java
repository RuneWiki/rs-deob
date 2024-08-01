import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("nd")
public class class125 implements Runnable {

    @OriginalMember(owner = "nd", name = "d", descriptor = "Z")
    private boolean field2398 = false;

    @OriginalMember(owner = "nd", name = "l", descriptor = "I")
    private int field2406 = 0;

    @OriginalMember(owner = "nd", name = "e", descriptor = "I")
    private int field2399 = 0;

    @OriginalMember(owner = "nd", name = "z", descriptor = "Z")
    private boolean field2420 = false;

    @OriginalMember(owner = "nd", name = "c", descriptor = "Lke;")
    private class99 field2397;

    @OriginalMember(owner = "nd", name = "n", descriptor = "Ljava/net/Socket;")
    private Socket field2408;

    @OriginalMember(owner = "nd", name = "v", descriptor = "Ljava/io/InputStream;")
    private InputStream field2416;

    @OriginalMember(owner = "nd", name = "A", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field2421;

    @OriginalMember(owner = "nd", name = "g", descriptor = "Llf;")
    public static class109 field2401 = class35.method275("compass", 2);

    @OriginalMember(owner = "nd", name = "a", descriptor = "I")
    public static int field2395 = 1;

    @OriginalMember(owner = "nd", name = "k", descriptor = "[I")
    public static int[] field2405 = new int[2048];

    @OriginalMember(owner = "nd", name = "r", descriptor = "I")
    public static int field2412 = 0;

    @OriginalMember(owner = "nd", name = "B", descriptor = "Llf;")
    public static class109 field2422 = class35.method275(":assist:", 2);

    @OriginalMember(owner = "nd", name = "f", descriptor = "I")
    public static int field2400;

    @OriginalMember(owner = "nd", name = "h", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "nd", name = "i", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "nd", name = "j", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "nd", name = "m", descriptor = "I")
    public static int field2407;

    @OriginalMember(owner = "nd", name = "o", descriptor = "I")
    public static int field2409;

    @OriginalMember(owner = "nd", name = "p", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "nd", name = "q", descriptor = "I")
    public static int field2411;

    @OriginalMember(owner = "nd", name = "s", descriptor = "I")
    public static int field2413;

    @OriginalMember(owner = "nd", name = "u", descriptor = "I")
    public static int field2415;

    @OriginalMember(owner = "nd", name = "w", descriptor = "I")
    public static int field2417;

    @OriginalMember(owner = "nd", name = "y", descriptor = "I")
    public static int field2419;

    @OriginalMember(owner = "nd", name = "C", descriptor = "I")
    public static int field2423;

    @OriginalMember(owner = "nd", name = "D", descriptor = "I")
    public static int field2424;

    @OriginalMember(owner = "nd", name = "t", descriptor = "Lbg;")
    public static class18 field2414;

    @OriginalMember(owner = "nd", name = "x", descriptor = "Lda;")
    private class32 field2418;

    @OriginalMember(owner = "nd", name = "b", descriptor = "[B")
    private byte[] field2396;

    @OriginalMember(owner = "nd", name = "a", descriptor = "(II[BI)V")
    public final void method906(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        int var5 = 96 % ((arg0 - 54) / 46);
        field2407++;
        if (this.field2398) {
            return;
        }
        while (arg1 > 0) {
            int var6 = this.field2416.read(arg2, arg3, arg1);
            if (var6 <= 0) {
                throw new EOFException();
            }
            arg3 += var6;
            arg1 -= var6;
        }
    }

    @OriginalMember(owner = "nd", name = "a", descriptor = "(I)I")
    public final int method907(int arg0) throws IOException {
        field2400++;
        if (this.field2398) {
            return 0;
        } else {
            if (arg0 > -65) {
                method916(false, null);
            }
            return this.field2416.available();
        }
    }

    @OriginalMember(owner = "nd", name = "a", descriptor = "(III[B)V")
    public final void method908(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field2404++;
        if (this.field2398) {
            return;
        }
        if (this.field2420) {
            this.field2420 = false;
            throw new IOException();
        }
        if (this.field2396 == null) {
            this.field2396 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg2; var6++) {
                this.field2396[this.field2399] = arg3[arg1 + var6];
                this.field2399 = (this.field2399 + 1) % 5000;
                if ((this.field2406 + 4900) % 5000 == this.field2399) {
                    throw new IOException();
                }
            }
            if (this.field2418 == null) {
                this.field2418 = this.field2397.method694(this, 3, (byte) 46);
            }
            this.notifyAll();
        }
        if (arg0 >= -40) {
            field2419 = -35;
        }
    }

    @OriginalMember(owner = "nd", name = "b", descriptor = "(I)V")
    public static void method909(int arg0) {
        field2422 = null;
        field2401 = null;
        if (arg0 != -1147533848) {
            method911(null, -73, null);
        }
        field2405 = null;
        field2414 = null;
    }

    @OriginalMember(owner = "nd", name = "c", descriptor = "(I)V")
    public static final void method910(int arg0) {
        field2403++;
        short var1 = 256;
        if (class127.field2450 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (class127.field2450 > 768) {
                    class115.field2275[var2] = class173.method1158(class76.field1467[var2], 1024 - class127.field2450, class143.field2753[var2], (byte) 120);
                } else if (class127.field2450 > 256) {
                    class115.field2275[var2] = class143.field2753[var2];
                } else {
                    class115.field2275[var2] = class173.method1158(class143.field2753[var2], 256 - class127.field2450, class76.field1467[var2], (byte) 126);
                }
            }
        } else if (class93.field1914 > 0) {
            for (int var3 = 0; var3 < 256; var3++) {
                if (class93.field1914 > 768) {
                    class115.field2275[var3] = class173.method1158(class76.field1467[var3], 1024 - class93.field1914, class170.field3167[var3], (byte) 103);
                } else if (class93.field1914 <= 256) {
                    class115.field2275[var3] = class173.method1158(class170.field3167[var3], 256 - class93.field1914, class76.field1467[var3], (byte) 121);
                } else {
                    class115.field2275[var3] = class170.field3167[var3];
                }
            }
        } else {
            for (int var4 = 0; var4 < 256; var4++) {
                class115.field2275[var4] = class76.field1467[var4];
            }
        }
        if (arg0 >= -9) {
            return;
        }
        int var5 = class98.field1986.field2009 * 9;
        int var6 = 0;
        int var7 = 0;
        for (int var8 = 1; var8 < var1 - 1; var8++) {
            int var21 = (var1 - var8) * class193.field3695[var8] / var1 + 22;
            if (var21 < 0) {
                var21 = 0;
            }
            var6 += var21;
            for (int var22 = var21; var22 < 128; var22++) {
                int var24 = class38.field819[var6++];
                int var25 = class98.field1986.field2007[var5++];
                if (var24 == 0) {
                    class77.field1485.field2007[var7++] = var25;
                } else {
                    int var27 = 256 - var24;
                    int var28 = class115.field2275[var24];
                    class77.field1485.field2007[var7++] = class170.method1140(16711680, class170.method1140(var28, 65280) * var24 + var27 * class170.method1140(65280, var25)) + class170.method1140(-16711936, class170.method1140(16711935, var28) * var24 + var27 * class170.method1140(var25, 16711935)) >> 8;
                }
            }
            for (int var23 = 0; var23 < var21; var23++) {
                class77.field1485.field2007[var7++] = class98.field1986.field2007[var5++];
            }
            var5 += class98.field1986.field2009 - 128;
        }
        class77.field1485.method730(0, 9);
        int var9 = 0;
        int var10 = class98.field1986.field2009 * 9 + 128;
        int var11 = 0;
        for (int var12 = 1; var12 < var1 - 1; var12++) {
            int var13 = (var1 - var12) * class193.field3695[var12] / var1 + 22;
            if (var13 < 0) {
                var13 = 0;
            }
            for (int var14 = 0; var14 < var13; var14++) {
                int var10001 = var9++;
                var10--;
                class160.field3003.field2007[var10001] = class98.field1986.field2007[var10];
            }
            for (int var15 = var13; var15 < 128; var15++) {
                var10--;
                int var16 = class98.field1986.field2007[var10];
                int var17 = class38.field819[var11++];
                if (var17 == 0) {
                    class160.field3003.field2007[var9++] = var16;
                } else {
                    int var19 = 256 - var17;
                    int var20 = class115.field2275[var17];
                    class160.field3003.field2007[var9++] = class170.method1140(-16711936, var19 * class170.method1140(var16, 16711935) + var17 * class170.method1140(16711935, var20)) + class170.method1140(16711680, class170.method1140(var16, 65280) * var19 + class170.method1140(var20, 65280) * var17) >> 8;
                }
            }
            var10 += class98.field1986.field2009 + 128;
            var11 += var13;
        }
        class160.field3003.method730(637, 9);
    }

    @OriginalMember(owner = "nd", name = "a", descriptor = "(Lvg;ILlf;)Llf;")
    public static final class109 method911(class200 arg0, int arg1, class109 arg2) {
        if (arg2.method799(class23.field508, 59) != -1) {
            label62: while (true) {
                int var3 = arg2.method799(class28.field611, arg1 ^ 0x461);
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg2.method799(class95.field1938, arg1 ^ 0x465);
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg2.method799(class191.field3662, 28);
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg2.method799(class183.field3445, 126);
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg2.method799(class140.field2717, 96);
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg2.method799(class45.field938, 58);
                                                        if (var8 == -1) {
                                                            break label62;
                                                        }
                                                        class109 var9 = class174.field3306;
                                                        if (class55.field1107 != null) {
                                                            var9 = class103.method739(class55.field1107.field751, -1665);
                                                            try {
                                                                if (class55.field1107.field748 != null) {
                                                                    byte[] var10 = ((String) class55.field1107.field748).getBytes("ISO-8859-1");
                                                                    var9 = class206.method1351(var10, var10.length, 0, false);
                                                                }
                                                            } catch (UnsupportedEncodingException var11) {
                                                            }
                                                        }
                                                        arg2 = class36.method279(new class109[] { arg2.method794(var8, 0, 73), var9, arg2.method798(-41, var8 + 4) }, arg1 - 897);
                                                    }
                                                }
                                                arg2 = class36.method279(new class109[] { arg2.method794(var7, 0, 106), class7.method32((byte) -100, class181.method1235(arg0, 10, 4)), arg2.method798(-41, var7 + 2) }, 118);
                                            }
                                        }
                                        arg2 = class36.method279(new class109[] { arg2.method794(var6, 0, 122), class7.method32((byte) -33, class181.method1235(arg0, 10, 3)), arg2.method798(-41, var6 + 2) }, arg1 - 901);
                                    }
                                }
                                arg2 = class36.method279(new class109[] { arg2.method794(var5, 0, 80), class7.method32((byte) -85, class181.method1235(arg0, 10, 2)), arg2.method798(-41, var5 + 2) }, arg1 ^ 0x477);
                            }
                        }
                        arg2 = class36.method279(new class109[] { arg2.method794(var4, 0, 102), class7.method32((byte) -99, class181.method1235(arg0, 10, 1)), arg2.method798(-41, var4 + 2) }, arg1 - 1138);
                    }
                }
                arg2 = class36.method279(new class109[] { arg2.method794(var3, 0, arg1 - 961), class7.method32((byte) -91, class181.method1235(arg0, arg1 ^ 0x40A, 0)), arg2.method798(-41, var3 + 2) }, arg1 ^ 0x475);
            }
        }
        if (arg1 != 1024) {
            method911(null, 4, null);
        }
        field2410++;
        return arg2;
    }

    @OriginalMember(owner = "nd", name = "a", descriptor = "(II[Llb;[BIIIIII)V")
    public static final void method912(int arg0, int arg1, class105[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2417++;
        class86 var10 = new class86(arg3);
        int var11 = -1;
        if (arg9 >= -114) {
            method917((byte) -115);
        }
        while (true) {
            int var12 = var10.method560(0);
            if (var12 == 0) {
                return;
            }
            int var13 = 0;
            var11 += var12;
            while (true) {
                int var14 = var10.method560(0);
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method598((byte) 90);
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && arg7 <= var16 && var16 < arg7 + 8 && var15 >= arg5 && var15 < arg5 + 8) {
                    class78 var21 = class140.method1000(var11, 0);
                    int var22 = arg1 + class194.method1301(var20, var21.field1498, var16 & 0x7, var21.field1501, true, var15 & 0x7, arg0);
                    int var23 = class45.method317(var21.field1498, var20, var15 & 0x7, arg0, 3, var16 & 0x7, var21.field1501) + arg6;
                    if (var22 > 0 && var23 > 0 && var22 < 103 && var23 < 103) {
                        class105 var24 = null;
                        int var25 = arg8;
                        if ((class88.field1827[1][var22][var23] & 0x2) == 2) {
                            var25 = arg8 - 1;
                        }
                        if (var25 >= 0) {
                            var24 = arg2[var25];
                        }
                        class202.method1329(arg8, var11, arg0 + var20 & 0x3, var19, 16, var24, var22, var23);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "nd", name = "a", descriptor = "(ZI)I")
    public static final int method913(boolean arg0, int arg1) {
        int var7 = arg1 - 1;
        field2402++;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        if (arg0) {
            int var5 = var4 | var4 >>> 8;
            int var6 = var5 | var5 >>> 16;
            return var6 + 1;
        } else {
            return 64;
        }
    }

    @OriginalMember(owner = "nd", name = "a", descriptor = "(Z)I")
    public final int method914(boolean arg0) throws IOException {
        field2411++;
        if (this.field2398) {
            return 0;
        } else {
            if (!arg0) {
                method910(9);
            }
            return this.field2416.read();
        }
    }

    @OriginalMember(owner = "nd", name = "run", descriptor = "()V")
    public final void run() {
        field2409++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field2406 == this.field2399) {
                        if (this.field2398) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    if (this.field2406 > this.field2399) {
                        var2 = 5000 - this.field2406;
                    } else {
                        var2 = this.field2399 - this.field2406;
                    }
                    var3 = this.field2406;
                }
                if (var2 > 0) {
                    try {
                        this.field2421.write(this.field2396, var3, var2);
                    } catch (IOException var9) {
                        this.field2420 = true;
                    }
                    this.field2406 = (this.field2406 + var2) % 5000;
                    try {
                        if (this.field2406 == this.field2399) {
                            this.field2421.flush();
                        }
                    } catch (IOException var8) {
                        this.field2420 = true;
                    }
                }
            }
            try {
                if (this.field2416 != null) {
                    this.field2416.close();
                }
                if (this.field2421 != null) {
                    this.field2421.close();
                }
                if (this.field2408 != null) {
                    this.field2408.close();
                }
            } catch (IOException var7) {
            }
            this.field2396 = null;
        } catch (Exception var12) {
            class9.method43(null, -35, var12);
        }
    }

    @OriginalMember(owner = "nd", name = "a", descriptor = "(B)V")
    public final void method915(byte arg0) {
        field2423++;
        if (this.field2398) {
            return;
        }
        synchronized (this) {
            this.field2398 = true;
            this.notifyAll();
        }
        if (arg0 >= -35) {
            this.field2418 = null;
        }
        if (this.field2418 != null) {
            while (this.field2418.field746 == 0) {
                class54.method354(1L, -126);
            }
            if (this.field2418.field746 == 1) {
                try {
                    ((Thread) this.field2418.field748).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field2418 = null;
    }

    @OriginalMember(owner = "nd", name = "a", descriptor = "(ZLbg;)V")
    public static final void method916(boolean arg0, class18 arg1) {
        class150.field2886 = arg1;
        if (arg0) {
            method911(null, 51, null);
        }
        field2415++;
    }

    @OriginalMember(owner = "nd", name = "<init>", descriptor = "(Ljava/net/Socket;Lke;)V")
    public class125(Socket arg0, class99 arg1) throws IOException {
        this.field2397 = arg1;
        this.field2408 = arg0;
        this.field2408.setSoTimeout(30000);
        this.field2408.setTcpNoDelay(true);
        this.field2416 = this.field2408.getInputStream();
        this.field2421 = this.field2408.getOutputStream();
    }

    @OriginalMember(owner = "nd", name = "b", descriptor = "(B)V")
    public static final void method917(byte arg0) {
        class88.method652(2047);
        class104.method746((byte) 124);
        class47.method323(121);
        class24.method216((byte) -99);
        class45.method313((byte) 25);
        field2413++;
        class178.method1213((byte) 109);
        class134.method949(109);
        class186.method1260(5041);
        class67.method438((byte) 114);
        class193.method1293(64);
        class3.method10(113);
        class117.method856((byte) -7);
        ((class14) class124.field2385).method89(2);
        class28.field608.method1088(-51);
        class62.field1199.method174(512);
        class46.field965.method174(512);
        class57.field1161.method174(512);
        class136.field2625.method174(512);
        class171.field3212.method174(512);
        class103.field2030.method174(512);
        class174.field3297.method174(512);
        if (arg0 >= -57) {
            field2419 = 72;
        }
        class73.field1410.method174(512);
        class39.field835.method174(512);
        class95.field1937.method174(512);
        class50.field1021.method174(512);
    }

    @OriginalMember(owner = "nd", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field2424++;
        this.method915((byte) -69);
    }
}
