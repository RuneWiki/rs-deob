import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class147 implements Runnable {

    @OriginalMember(owner = "client!kc", name = "n", descriptor = "I")
    private int field2083 = 0;

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
    private int field2074 = 0;

    @OriginalMember(owner = "client!kc", name = "t", descriptor = "Z")
    private boolean field2089 = false;

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "Z")
    private boolean field2078 = false;

    @OriginalMember(owner = "client!kc", name = "A", descriptor = "Ljava/net/Socket;")
    private Socket field2096;

    @OriginalMember(owner = "client!kc", name = "w", descriptor = "Lng;")
    private class153 field2092;

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "Ljava/io/InputStream;")
    private InputStream field2077;

    @OriginalMember(owner = "client!kc", name = "m", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field2082;

    @OriginalMember(owner = "client!kc", name = "r", descriptor = "Z")
    public static boolean field2087 = false;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "I")
    public static int field2072 = 0;

    @OriginalMember(owner = "client!kc", name = "s", descriptor = "Lsh;")
    public static class472 field2088 = new class472(9, 6);

    @OriginalMember(owner = "client!kc", name = "C", descriptor = "Lsh;")
    public static class472 field2098 = new class472(0, -2);

    @OriginalMember(owner = "client!kc", name = "D", descriptor = "Lsh;")
    public static class472 field2099 = null;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
    public static int field2070;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
    public static int field2075;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "I")
    public static int field2076;

    @OriginalMember(owner = "client!kc", name = "l", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!kc", name = "o", descriptor = "I")
    public static int field2084;

    @OriginalMember(owner = "client!kc", name = "p", descriptor = "I")
    public static int field2085;

    @OriginalMember(owner = "client!kc", name = "q", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!kc", name = "u", descriptor = "I")
    public static int field2090;

    @OriginalMember(owner = "client!kc", name = "v", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!kc", name = "x", descriptor = "I")
    public static int field2093;

    @OriginalMember(owner = "client!kc", name = "y", descriptor = "I")
    public static int field2094;

    @OriginalMember(owner = "client!kc", name = "z", descriptor = "I")
    public static int field2095;

    @OriginalMember(owner = "client!kc", name = "B", descriptor = "I")
    public static int field2097;

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "Liu;")
    private class397 field2080;

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "[B")
    private byte[] field2079;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)V")
    public static void method994(byte arg0) {
        if (arg0 > -68) {
            field2088 = null;
        }
        field2088 = null;
        field2098 = null;
        field2099 = null;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lui;I)I")
    public static final int method995(class451 arg0, int arg1) {
        field2091++;
        int var2 = 0;
        if (arg0.method2672(class23.field310, 23775)) {
            var2++;
        }
        if (arg0.method2672(class492.field6922, 23775)) {
            var2++;
        }
        if (arg0.method2672(class228.field3341, 23775)) {
            var2++;
        }
        if (arg0.method2672(class183.field2714, 23775)) {
            var2++;
        }
        if (arg0.method2672(class357.field5431, 23775)) {
            var2++;
        }
        if (arg0.method2672(class356.field5412, 23775)) {
            var2++;
        }
        if (arg1 > -48) {
            return -103;
        }
        if (arg0.method2672(class105.field1481, 23775)) {
            var2++;
        }
        if (arg0.method2672(class449.field6349, 23775)) {
            var2++;
        }
        if (arg0.method2672(class317.field4760, 23775)) {
            var2++;
        }
        if (arg0.method2672(class344.field5187, 23775)) {
            var2++;
        }
        if (arg0.method2672(class429.field6117, 23775)) {
            var2++;
        }
        if (arg0.method2672(class169.field2412, 23775)) {
            var2++;
        }
        if (arg0.method2672(class72.field972, 23775)) {
            var2++;
        }
        if (arg0.method2672(class282.field4260, 23775)) {
            var2++;
        }
        if (arg0.method2672(class142.field2030, 23775)) {
            var2++;
        }
        if (arg0.method2672(class395.field5815, 23775)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I[BZI)V")
    public final void method996(int arg0, byte[] arg1, boolean arg2, int arg3) throws IOException {
        field2084++;
        if (this.field2089) {
            return;
        }
        while (arg0 > 0) {
            int var5 = this.field2077.read(arg1, arg3, arg0);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg3 += var5;
            arg0 -= var5;
        }
        if (!arg2) {
            this.field2092 = null;
        }
    }

    @OriginalMember(owner = "client!kc", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field2083 == this.field2074) {
                            if (this.field2089) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        var2 = this.field2083;
                        if (this.field2083 <= this.field2074) {
                            var3 = this.field2074 - this.field2083;
                        } else {
                            var3 = 5000 - this.field2083;
                        }
                    }
                    if (var3 <= 0) {
                        continue;
                    }
                    try {
                        this.field2082.write(this.field2079, var2, var3);
                    } catch (IOException var9) {
                        this.field2078 = true;
                    }
                    this.field2083 = (this.field2083 + var3) % 5000;
                    try {
                        if (this.field2083 == this.field2074) {
                            this.field2082.flush();
                        }
                    } catch (IOException var8) {
                        this.field2078 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2077 != null) {
                        this.field2077.close();
                    }
                    if (this.field2082 != null) {
                        this.field2082.close();
                    }
                    if (this.field2096 != null) {
                        this.field2096.close();
                    }
                } catch (IOException var7) {
                }
                this.field2079 = null;
                break;
            }
        } catch (Exception var12) {
            class416.method2475(false, var12, (String) null);
        }
        field2081++;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V")
    public static final void method997(int arg0) {
        class463.field6540.method1600(0);
        field2076++;
        class352.field5364.method2567(9894);
        class158.field2197.method1387(arg0);
        class206.field3124.method336((byte) -19);
        class448.field6339.method333((byte) 111);
        class23.field309.method2370(true);
        class170.field2423.method1587(false);
        class322.field4848.method949(5);
        class180.field2687.method1507(true);
        class156.field2167.method915(64);
        class297.field4454.method1826((byte) 110);
        class256.field3796.method2240(-347);
        class492.field6915.method1113(-9620);
        class388.field5714.method1523((byte) 95);
        class237.field3463.method1402((byte) -37);
        class365.field5529.method683(16);
        class431.field6129.method451((byte) 124);
        class81.field1144.method2443(-36);
        class42.field571.method130((byte) -124);
        class258.field3853.method1967(arg0 ^ 0x60);
        class255.method1685((byte) 106);
        class468.method2747(-113);
        class89.method698((byte) 93);
        class201.method1360((byte) 117);
        class2.field40.method2388(122);
        class256.field3794.method2388(-17);
        class19.field246.method2388(120);
        class313.field4716.method2388(127);
        class477.field6703.method2388(124);
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(B)V")
    public final void method998(byte arg0) {
        field2094++;
        if (this.field2089) {
            return;
        }
        synchronized (this) {
            if (arg0 != -13) {
                this.method1004((byte) 113);
            }
            this.field2089 = true;
            this.notifyAll();
        }
        if (this.field2080 != null) {
            while (this.field2080.field5822 == 0) {
                class325.method2005(true, 1L);
            }
            if (this.field2080.field5822 == 1) {
                try {
                    ((Thread) this.field2080.field5823).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field2080 = null;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)V")
    public final void method999(int arg0) throws IOException {
        if (arg0 != 1) {
            method995((class451) null, 120);
        }
        field2071++;
        if (!this.field2089 && this.field2078) {
            this.field2078 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(III[B)V")
    public final void method1000(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field2095++;
        if (arg0 != 30000 || this.field2089) {
            return;
        }
        if (this.field2078) {
            this.field2078 = false;
            throw new IOException();
        }
        if (this.field2079 == null) {
            this.field2079 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg2; var6++) {
                this.field2079[this.field2074] = arg3[arg1 + var6];
                this.field2074 = (this.field2074 + 1) % 5000;
                if ((this.field2083 + 4900) % 5000 == this.field2074) {
                    throw new IOException();
                }
            }
            if (this.field2080 == null) {
                this.field2080 = this.field2092.method1040(arg0 ^ 0x7532, 3, this);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(I)Lja;")
    public static final class209 method1001(int arg0) {
        field2097++;
        if (arg0 != 21063) {
            field2098 = null;
        }
        try {
            return (class209) Class.forName("ls").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(B)I")
    public final int method1002(byte arg0) throws IOException {
        int var2 = 34 % ((arg0 - 13) / 63);
        field2090++;
        return this.field2089 ? 0 : this.field2077.read();
    }

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "(I)V")
    public static final void method1003(int arg0) {
        class400 var1 = class475.field6651;
        synchronized (class475.field6651) {
            class475.field6651.method2401((byte) -118);
        }
        if (arg0 != 0) {
            method1006(-125, -102, 33);
        }
        field2070++;
    }

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "(B)V")
    public final void method1004(byte arg0) {
        field2086++;
        if (arg0 >= -47) {
            this.method998((byte) -91);
        }
        if (!this.field2089) {
            this.field2077 = new class136();
            this.field2082 = new class205();
        }
    }

    @OriginalMember(owner = "client!kc", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field2075++;
        this.method998((byte) -13);
    }

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "(I)I")
    public final int method1005(int arg0) throws IOException {
        field2093++;
        if (this.field2089) {
            return 0;
        } else {
            if (arg0 != 5000) {
                this.method998((byte) -9);
            }
            return this.field2077.available();
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(III)Lmp;")
    public static final class100 method1006(int arg0, int arg1, int arg2) {
        class337 var3 = class170.field2427[arg0][arg1][arg2];
        return var3 == null ? null : var3.field5044;
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(Ljava/net/Socket;Lng;)V")
    public class147(Socket arg0, class153 arg1) throws IOException {
        this.field2096 = arg0;
        this.field2092 = arg1;
        this.field2096.setSoTimeout(30000);
        this.field2096.setTcpNoDelay(true);
        this.field2077 = this.field2096.getInputStream();
        this.field2082 = this.field2096.getOutputStream();
    }
}
