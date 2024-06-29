import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class109 implements Runnable {

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "I")
    private int field2034 = 0;

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "Z")
    private boolean field2040 = false;

    @OriginalMember(owner = "client!aj", name = "x", descriptor = "Z")
    private boolean field2052 = false;

    @OriginalMember(owner = "client!aj", name = "w", descriptor = "I")
    private int field2051 = 0;

    @OriginalMember(owner = "client!aj", name = "E", descriptor = "Lrc;")
    private class9 field2059;

    @OriginalMember(owner = "client!aj", name = "u", descriptor = "Ljava/net/Socket;")
    private Socket field2049;

    @OriginalMember(owner = "client!aj", name = "z", descriptor = "Ljava/io/InputStream;")
    private InputStream field2054;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field2033;

    @OriginalMember(owner = "client!aj", name = "C", descriptor = "[I")
    public static int[] field2057 = new int[64];

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "I")
    public static int field2039 = 0;

    @OriginalMember(owner = "client!aj", name = "F", descriptor = "Z")
    public static boolean field2060 = false;

    @OriginalMember(owner = "client!aj", name = "J", descriptor = "[[S")
    public static short[][] field2064 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "I")
    public static int field2030;

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
    public static int field2031;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
    public static int field2032;

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!aj", name = "m", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!aj", name = "n", descriptor = "I")
    public static int field2042;

    @OriginalMember(owner = "client!aj", name = "o", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!aj", name = "q", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!aj", name = "r", descriptor = "I")
    public static int field2046;

    @OriginalMember(owner = "client!aj", name = "s", descriptor = "I")
    public static int field2047;

    @OriginalMember(owner = "client!aj", name = "t", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!aj", name = "v", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!aj", name = "y", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!aj", name = "A", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!aj", name = "B", descriptor = "I")
    public static int field2056;

    @OriginalMember(owner = "client!aj", name = "D", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!aj", name = "H", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!aj", name = "I", descriptor = "I")
    public static int field2063;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "Lmc;")
    private class165 field2029;

    @OriginalMember(owner = "client!aj", name = "p", descriptor = "Lpi;")
    public static class181 field2044;

    @OriginalMember(owner = "client!aj", name = "G", descriptor = "Lee;")
    public static class64 field2061;

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "[B")
    private byte[] field2035;

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "[[[I")
    public static int[][][] field2037;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(BI)I")
    public static final int method847(byte arg0, int arg1) {
        if (arg0 != -109) {
            method857(-8);
        }
        field2042++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V")
    public final void method848(int arg0) throws IOException {
        field2050++;
        if (!this.field2052 && arg0 == -19005 && this.field2040) {
            this.field2040 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(I)V")
    public static void method849(int arg0) {
        if (arg0 > -13) {
            method855(-37, (class46[]) null);
        }
        field2037 = null;
        field2064 = null;
        field2057 = null;
        field2061 = null;
        field2044 = null;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(B)I")
    public final int method850(byte arg0) throws IOException {
        field2056++;
        if (arg0 != 121) {
            method857(107);
        }
        return this.field2052 ? 0 : this.field2054.available();
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(B)V")
    public final void method851(byte arg0) {
        field2055++;
        int var2 = 78 % ((arg0 - 28) / 41);
        if (!this.field2052) {
            this.field2054 = new class198();
            this.field2033 = new class20();
        }
    }

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "(I)V")
    public final void method852(int arg0) {
        field2047++;
        if (this.field2052) {
            return;
        }
        synchronized (this) {
            this.field2052 = true;
            this.notifyAll();
            if (arg0 != 5790) {
                field2032 = 66;
            }
        }
        if (this.field2029 != null) {
            while (this.field2029.field2925 == 0) {
                class187.method1360((byte) 75, 1L);
            }
            if (this.field2029.field2925 == 1) {
                try {
                    ((Thread) this.field2029.field2921).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field2029 = null;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)Z")
    public static final boolean method853(int arg0, int arg1) {
        field2031++;
        if (arg0 != -27714) {
            method857(6);
        }
        return arg1 >= 97 && arg1 <= 122 || arg1 >= 65 && arg1 <= 90;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "([BIII)V")
    public final void method854(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field2053++;
        if (this.field2052) {
            return;
        }
        while (arg1 > 0) {
            int var5 = this.field2054.read(arg0, arg2, arg1);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 -= var5;
            arg2 += var5;
        }
        if (arg3 != 0) {
            method847((byte) 70, -72);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I[Lha;)Lha;")
    public static final class46 method855(int arg0, class46[] arg1) {
        field2045++;
        if (arg1.length < 2) {
            throw new IllegalArgumentException();
        }
        if (arg0 != 0) {
            field2044 = null;
        }
        return class10.method49(arg1, arg1.length, 0, 16);
    }

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "(I)V")
    public static final void method856(int arg0) {
        field2030++;
        if (class71.field1214 != null) {
            class71.field1214.method852(5790);
            class71.field1214 = null;
        }
        if (arg0 != -22374) {
            field2032 = -128;
        }
        class199.method1421(-28124);
        class86.method673();
        for (int var1 = 0; var1 < 4; var1++) {
            class183.field3282[var1].method1119(true);
        }
        client.method1812((byte) 55);
        System.gc();
        class229.method1560(2, 5870);
        class29.field572 = false;
        class51.field890 = -1;
        class90.method698(64, true);
        class77.field1432 = 0;
        class213.field3790 = false;
        class29.field567 = 0;
        for (int var2 = 0; var2 < class84.field1611.length; var2++) {
            class84.field1611[var2] = null;
        }
        class156.field2783 = 0;
        class51.field888 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class1.field6[var3] = null;
            class151.field2696[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class2.field29[var4] = null;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var6 = 0; var6 < 104; var6++) {
                for (int var7 = 0; var7 < 104; var7++) {
                    class103.field1874[var5][var6][var7] = null;
                }
            }
        }
        class60.method407(52);
        class265.field4607 = 0;
        class232.method1569(true, arg0 + 22372);
    }

    @OriginalMember(owner = "client!aj", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method852(5790);
        field2038++;
    }

    @OriginalMember(owner = "client!aj", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field2051 == this.field2034) {
                            if (this.field2052) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        var2 = this.field2034;
                        if (this.field2051 >= this.field2034) {
                            var3 = this.field2051 - this.field2034;
                        } else {
                            var3 = 5000 - this.field2034;
                        }
                    }
                    if (var3 <= 0) {
                        continue;
                    }
                    try {
                        this.field2033.write(this.field2035, var2, var3);
                    } catch (IOException var9) {
                        this.field2040 = true;
                    }
                    this.field2034 = (this.field2034 + var3) % 5000;
                    try {
                        if (this.field2051 == this.field2034) {
                            this.field2033.flush();
                        }
                    } catch (IOException var8) {
                        this.field2040 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2054 != null) {
                        this.field2054.close();
                    }
                    if (this.field2033 != null) {
                        this.field2033.close();
                    }
                    if (this.field2049 != null) {
                        this.field2049.close();
                    }
                } catch (IOException var7) {
                }
                this.field2035 = null;
                break;
            }
        } catch (Exception var12) {
            class272.method1835(var12, -80, (String) null);
        }
        field2058++;
    }

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "(I)V")
    public static final void method857(int arg0) {
        field2036++;
        if (class189.field3370 == null) {
            return;
        }
        if (class46.field764 < 10) {
            if (!class77.field1428.method1316(class189.field3370.field1325, 90)) {
                class46.field764 = class26.field516.method1325(class189.field3370.field1325, (byte) 26) / 10;
                return;
            }
            class63.method443((byte) -126);
            class46.field764 = 10;
        }
        if (class46.field764 == 10) {
            class194.field3493 = class189.field3370.field1336 >> 6 << 6;
            class137.field2474 = (class189.field3370.field1311 >> 6 << 6) + 64 - class194.field3493;
            class232.field4039 = class189.field3370.field1328 >> 6 << 6;
            int var1 = (class277.field4824.field2585 >> 7) + class29.field567 - class194.field3493;
            class49.field836 = (class189.field3370.field1320 >> 6 << 6) + 64 - class232.field4039;
            class45.field746 = 8.0F;
            class83.field1602 = 8.0F;
            int var2 = var1 + ((int) (Math.random() * 10.0D) - 5);
            int var3 = class232.field4039 + class49.field836 - class77.field1432 - (class277.field4824.field2546 >> 7) - 1;
            int var4 = var3 + ((int) (Math.random() * 10.0D) - 5);
            if (var2 >= 0 && var2 < class137.field2474 && var4 >= 0 && class49.field836 > var4) {
                class194.field3490 = var4;
                class57.field950 = var2;
            } else {
                class57.field950 = class189.field3370.field1342 * 64 - class194.field3493;
                class194.field3490 = class49.field836 + class232.field4039 - (class189.field3370.field1327 * 64) - 1;
            }
            class212.method1498(-116);
            int var5 = class49.field836 >> 6;
            class12.field188 = new int[class115.field2172 + 1];
            int var6 = class4.field75 >> 1;
            int var7 = class137.field2474 >> 6;
            class10.field175 = new int[var7][var5][];
            class218.field3852 = new byte[var7][var5][];
            class214.field3797 = new byte[var7][var5][];
            class113.field2146 = new byte[var7][var5][];
            int var8 = class141.field2554 >> 2 << 10;
            class270.field4712 = new byte[var7][var5][];
            class227.field3976 = new short[var7][var5][];
            class161.field2839 = new int[var7][var5][];
            class210.field3760 = new byte[var7][var5][];
            class134.method1035(var6, 64512, var8);
            class46.field764 = 20;
            return;
        }
        if (arg0 <= 76) {
            field2032 = 80;
        }
        if (class46.field764 == 20) {
            class226.method1548(new class75(class77.field1428.method1313(-19091, class189.field3370.field1325, class86.field1646)), 64);
            class46.field764 = 30;
            class185.method1336((byte) -69, true);
            class82.method654((byte) -70);
        } else if (class46.field764 == 30) {
            class115.method928((byte) 126, new class75(class77.field1428.method1313(-19091, class189.field3370.field1325, class107.field1981)));
            class46.field764 = 40;
            class82.method654((byte) -120);
        } else if (class46.field764 == 40) {
            class77.method611(false, new class75(class77.field1428.method1313(-19091, class189.field3370.field1325, class184.field3292)));
            class46.field764 = 50;
            class82.method654((byte) -77);
        } else if (class46.field764 == 50) {
            class111.method905(new class75(class77.field1428.method1313(-19091, class189.field3370.field1325, class10.field173)), -29900);
            class46.field764 = 60;
            class185.method1336((byte) -69, true);
            class82.method654((byte) -96);
        } else if (class46.field764 == 60) {
            if (class77.field1428.method1300(false, method855(0, new class46[] { class189.field3370.field1325, class77.field1435 }))) {
                if (!class77.field1428.method1316(method855(0, new class46[] { class189.field3370.field1325, class77.field1435 }), 36)) {
                    return;
                }
                class163.field2914 = class173.method1245(class77.field1428, method855(0, new class46[] { class189.field3370.field1325, class77.field1435 }), 126);
            } else {
                class163.field2914 = new class238(0);
            }
            class46.field764 = 70;
            class82.method654((byte) -96);
        } else if (class46.field764 == 70) {
            class189.field3378 = new class211(11, true, class258.field4508);
            class46.field764 = 73;
            class185.method1336((byte) -69, true);
            class82.method654((byte) -84);
        } else if (class46.field764 == 73) {
            class247.field4374 = new class211(12, true, class258.field4508);
            class46.field764 = 76;
            class185.method1336((byte) -69, true);
            class82.method654((byte) -89);
        } else if (class46.field764 == 76) {
            class142.field2601 = new class211(14, true, class258.field4508);
            class46.field764 = 79;
            class185.method1336((byte) -69, true);
            class82.method654((byte) -100);
        } else if (class46.field764 == 79) {
            class187.field3343 = new class211(17, true, class258.field4508);
            class46.field764 = 82;
            class185.method1336((byte) -69, true);
            class82.method654((byte) -96);
        } else if (class46.field764 == 82) {
            class122.field2274 = new class211(19, true, class258.field4508);
            class46.field764 = 85;
            class185.method1336((byte) -69, true);
            class82.method654((byte) -117);
        } else if (class46.field764 == 85) {
            class63.field1071 = new class211(22, true, class258.field4508);
            class46.field764 = 88;
            class185.method1336((byte) -69, true);
            class82.method654((byte) -87);
        } else if (class46.field764 == 88) {
            class170.field3029 = new class211(26, true, class258.field4508);
            class46.field764 = 91;
            class185.method1336((byte) -69, true);
            class82.method654((byte) -97);
        } else {
            class152.field2701 = new class211(30, true, class258.field4508);
            class46.field764 = 100;
            class185.method1336((byte) -69, true);
            class82.method654((byte) -70);
            class146.field2644 = -1;
            class26.field521 = -1;
            System.gc();
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ILpi;)Z")
    public static final boolean method858(int arg0, class181 arg1) {
        if (arg0 == -27466) {
            field2041++;
            return arg1.method1307((byte) -14, class268.field4635);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "(I)I")
    public final int method859(int arg0) throws IOException {
        field2046++;
        if (this.field2052) {
            return 0;
        } else {
            int var2 = 62 % ((-arg0 - 33) / 45);
            return this.field2054.read();
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I[BII)V")
    public final void method860(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (arg3 <= 81) {
            this.method852(-95);
        }
        field2048++;
        if (this.field2052) {
            return;
        }
        if (this.field2040) {
            this.field2040 = false;
            throw new IOException();
        }
        if (this.field2035 == null) {
            this.field2035 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg2; var6++) {
                this.field2035[this.field2051] = arg1[arg0 + var6];
                this.field2051 = (this.field2051 + 1) % 5000;
                if (((this.field2034 + 4900) % 5000) == this.field2051) {
                    throw new IOException();
                }
            }
            if (this.field2029 == null) {
                this.field2029 = this.field2059.method36(this, 72, 3);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIII)V")
    public static final void method861(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2043++;
        for (int var5 = arg0; var5 < class193.field3473; var5++) {
            if (arg1 < class186.field3336[var5] + class175.field3156[var5] && arg1 + arg4 > class175.field3156[var5] && arg3 < class98.field1816[var5] + class51.field894[var5] && (arg2 + arg3) > class51.field894[var5]) {
                class31.field592[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(Ljava/net/Socket;Lrc;)V")
    public class109(Socket arg0, class9 arg1) throws IOException {
        this.field2059 = arg1;
        this.field2049 = arg0;
        this.field2049.setSoTimeout(30000);
        this.field2049.setTcpNoDelay(true);
        this.field2054 = this.field2049.getInputStream();
        this.field2033 = this.field2049.getOutputStream();
    }
}
