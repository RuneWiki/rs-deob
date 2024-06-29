import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class93 implements Runnable {

    @OriginalMember(owner = "client!nc", name = "p", descriptor = "Z")
    private boolean field2262 = false;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
    private int field2247 = 0;

    @OriginalMember(owner = "client!nc", name = "v", descriptor = "I")
    private int field2268 = 0;

    @OriginalMember(owner = "client!nc", name = "q", descriptor = "Z")
    private boolean field2263 = false;

    @OriginalMember(owner = "client!nc", name = "r", descriptor = "Lu;")
    private class137 field2264;

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "Ljava/net/Socket;")
    private Socket field2256;

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "Ljava/io/InputStream;")
    private InputStream field2252;

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field2260;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "Lqf;")
    public static class117 field2248 = class72.method514(110, "");

    @OriginalMember(owner = "client!nc", name = "A", descriptor = "Lqf;")
    private static class117 field2273 = class72.method514(122, " has logged in)3");

    @OriginalMember(owner = "client!nc", name = "o", descriptor = "Lqf;")
    public static class117 field2261 = field2273;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
    public static int field2249;

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "I")
    public static int field2250;

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
    public static int field2253;

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "I")
    public static int field2255;

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "I")
    public static int field2257;

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
    public static int field2258;

    @OriginalMember(owner = "client!nc", name = "t", descriptor = "I")
    public static int field2266;

    @OriginalMember(owner = "client!nc", name = "u", descriptor = "I")
    public static int field2267;

    @OriginalMember(owner = "client!nc", name = "w", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!nc", name = "x", descriptor = "I")
    public static int field2270;

    @OriginalMember(owner = "client!nc", name = "y", descriptor = "I")
    public static int field2271;

    @OriginalMember(owner = "client!nc", name = "z", descriptor = "I")
    public static int field2272;

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "Lr;")
    public static class118 field2254;

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "Laf;")
    private class7 field2259;

    @OriginalMember(owner = "client!nc", name = "s", descriptor = "[B")
    private byte[] field2265;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIB[B)V")
    public final void method729(int arg0, int arg1, byte arg2, byte[] arg3) throws IOException {
        field2266++;
        if (arg2 <= 115) {
            method735(false);
        }
        if (this.field2262) {
            return;
        }
        while (arg0 > 0) {
            int var5 = this.field2252.read(arg3, arg1, arg0);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg0 -= var5;
            arg1 += var5;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Ljb;Ljb;Z)V")
    public static final void method730(class64 arg0, class64 arg1, boolean arg2) {
        class68.field1410 = arg0;
        class77.field1711 = arg1;
        field2267++;
        if (!arg2) {
            method735(true);
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)I")
    public final int method731(int arg0) throws IOException {
        field2271++;
        if (arg0 == 0) {
            return this.field2262 ? 0 : this.field2252.available();
        } else {
            return -3;
        }
    }

    @OriginalMember(owner = "client!nc", name = "run", descriptor = "()V")
    public final void run() {
        field2255++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field2268 == this.field2247) {
                        if (this.field2262) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    if (this.field2268 < this.field2247) {
                        var2 = 5000 - this.field2247;
                    } else {
                        var2 = this.field2268 - this.field2247;
                    }
                    var3 = this.field2247;
                }
                if (var2 > 0) {
                    try {
                        this.field2260.write(this.field2265, var3, var2);
                    } catch (IOException var9) {
                        this.field2263 = true;
                    }
                    this.field2247 = (this.field2247 + var2) % 5000;
                    try {
                        if (this.field2268 == this.field2247) {
                            this.field2260.flush();
                        }
                    } catch (IOException var8) {
                        this.field2263 = true;
                    }
                }
            }
            try {
                if (this.field2252 != null) {
                    this.field2252.close();
                }
                if (this.field2260 != null) {
                    this.field2260.close();
                }
                if (this.field2256 != null) {
                    this.field2256.close();
                }
            } catch (IOException var7) {
            }
            this.field2265 = null;
        } catch (Exception var12) {
            class105.method803((byte) -74, var12, null);
        }
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)I")
    public final int method732(int arg0) throws IOException {
        field2249++;
        if (this.field2262) {
            return 0;
        } else {
            if (arg0 != 27426) {
                this.field2268 = -94;
            }
            return this.field2252.read();
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Z)V")
    public static final void method733(boolean arg0) {
        class91.field2225 = 0;
        field2272++;
        class139.field3318 = 0;
        if (arg0) {
            return;
        }
        class16.method141(0);
        class73.method524(0);
        class83.method651(2);
        for (int var1 = 0; var1 < class139.field3318; var1++) {
            int var3 = class91.field2221[var1];
            if (class43.field856 != class72.field1533[var3].field2008) {
                class72.field1533[var3].field1172 = null;
                class72.field1533[var3] = null;
            }
        }
        if (class71.field1502 != class96.field2338.field1691) {
            throw new RuntimeException("gnp1 pos:" + class96.field2338.field1691 + " psize:" + class71.field1502);
        }
        for (int var2 = 0; var2 < class25.field483; var2++) {
            if (class72.field1533[class150.field3724[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class25.field483);
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZLjb;IIIII)V")
    public static final void method734(boolean arg0, class64 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class125.field2952 = arg4;
        class44.field876 = arg0;
        class78.field1773 = arg5;
        class125.field2953 = 1;
        class112.field2615 = arg3;
        field2270++;
        class89.field2047 = arg6;
        class80.field1831 = arg1;
        if (arg2 != 1368) {
            method739(-84, 3, null, null);
        }
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(Z)V")
    public static final void method735(boolean arg0) {
        class149.field3693++;
        class99.field2373.method961(141, -1198);
        field2251++;
        if (class140.field3343 != -1) {
            class140.method1087(-81, class140.field3343);
            class140.field3343 = -1;
            class139.field3310 = true;
            class115.field2719 = -1;
            class55.field1144 = true;
        }
        if (class95.field2288 != -1) {
            class140.method1087(-114, class95.field2288);
            class95.field2288 = -1;
            class115.field2719 = -1;
            class87.field1993 = true;
        }
        if (class135.field3227 != -1) {
            class140.method1087(-104, class135.field3227);
            class135.field3227 = -1;
            class62.method430(30, (byte) -47);
        }
        if (class70.field1482 != -1) {
            class140.method1087(-74, class70.field1482);
            class70.field1482 = -1;
        }
        if (class96.field2316 != -1) {
            class140.method1087(-88, class96.field2316);
            class115.field2719 = -1;
            class96.field2316 = -1;
        }
        if (!arg0) {
            field2254 = null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(B[BII)V")
    public final void method736(byte arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field2258++;
        if (this.field2262) {
            return;
        }
        if (arg0 != 42) {
            this.field2260 = null;
        }
        if (this.field2263) {
            this.field2263 = false;
            throw new IOException();
        }
        if (this.field2265 == null) {
            this.field2265 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg2; var6++) {
                this.field2265[this.field2268] = arg1[arg3 + var6];
                this.field2268 = (this.field2268 + 1) % 5000;
                if ((this.field2247 + 4900) % 5000 == this.field2268) {
                    throw new IOException();
                }
            }
            if (this.field2259 == null) {
                this.field2259 = this.field2264.method1066(this, -23553, 3);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(I)V")
    public static void method737(int arg0) {
        field2261 = null;
        field2248 = null;
        int var1 = 85 / ((62 - arg0) / 33);
        field2273 = null;
        field2254 = null;
    }

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "(I)V")
    public final void method738(int arg0) {
        field2250++;
        if (this.field2262) {
            return;
        }
        synchronized (this) {
            this.field2262 = true;
            this.notifyAll();
        }
        if (arg0 != 1) {
            field2248 = null;
        }
        if (this.field2259 != null) {
            while (this.field2259.field108 == 0) {
                class148.method1183(arg0 ^ 0x1, 1L);
            }
            if (this.field2259.field108 == 1) {
                try {
                    ((Thread) this.field2259.field106).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field2259 = null;
    }

    @OriginalMember(owner = "client!nc", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method738(1);
        field2269++;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IILqf;Lqf;)V")
    public static final void method739(int arg0, int arg1, class117 arg2, class117 arg3) {
        if (class95.field2288 == -1) {
            class87.field1993 = true;
        }
        if (arg0 == 0 && class152.field3738 != -1) {
            class133.field3142 = 0;
            class149.field3694 = arg2;
        }
        for (int var4 = 99; var4 > 0; var4--) {
            class70.field1486[var4] = class70.field1486[var4 - 1];
            class119.field2852[var4] = class119.field2852[var4 - 1];
            class148.field3656[var4] = class148.field3656[var4 - 1];
        }
        class119.field2852[0] = arg3;
        field2253++;
        class70.field1486[arg1] = arg0;
        class148.field3656[0] = arg2;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)Z")
    public static final boolean method740(int arg0, int arg1) {
        if (arg0 != 5757) {
            field2248 = null;
        }
        field2257++;
        return arg1 >= 48 && arg1 <= 57;
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Ljava/net/Socket;Lu;)V")
    public class93(Socket arg0, class137 arg1) throws IOException {
        this.field2264 = arg1;
        this.field2256 = arg0;
        this.field2256.setSoTimeout(30000);
        this.field2256.setTcpNoDelay(true);
        this.field2252 = this.field2256.getInputStream();
        this.field2260 = this.field2256.getOutputStream();
    }
}
