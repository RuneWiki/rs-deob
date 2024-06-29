import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class97 implements Runnable {

    @OriginalMember(owner = "client!pc", name = "t", descriptor = "Z")
    private boolean field2197 = false;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
    private int field2179 = 0;

    @OriginalMember(owner = "client!pc", name = "A", descriptor = "Z")
    private boolean field2204 = false;

    @OriginalMember(owner = "client!pc", name = "E", descriptor = "I")
    private int field2208 = 0;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "Lc;")
    private class15 field2184;

    @OriginalMember(owner = "client!pc", name = "x", descriptor = "Ljava/net/Socket;")
    private Socket field2201;

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "Ljava/io/InputStream;")
    private InputStream field2185;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field2181;

    @OriginalMember(owner = "client!pc", name = "s", descriptor = "Lkc;")
    public static class67 field2196 = class19.method144("@gr2@", 76);

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "I")
    public static int field2189 = -1;

    @OriginalMember(owner = "client!pc", name = "r", descriptor = "I")
    public static int field2195 = 0;

    @OriginalMember(owner = "client!pc", name = "m", descriptor = "Lkc;")
    public static class67 field2190 = class19.method144("cross", 95);

    @OriginalMember(owner = "client!pc", name = "y", descriptor = "Lkc;")
    private static class67 field2202 = class19.method144("Welcome to RuneScape", 82);

    @OriginalMember(owner = "client!pc", name = "p", descriptor = "Lkc;")
    public static class67 field2193 = class19.method144("W-=hlen Sie eine Option", 85);

    @OriginalMember(owner = "client!pc", name = "F", descriptor = "Lkc;")
    public static class67 field2209 = field2202;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
    public static int field2178;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
    public static int field2182;

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
    public static int field2187;

    @OriginalMember(owner = "client!pc", name = "n", descriptor = "I")
    public static int field2191;

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!pc", name = "q", descriptor = "I")
    public static int field2194;

    @OriginalMember(owner = "client!pc", name = "u", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!pc", name = "v", descriptor = "I")
    public static int field2199;

    @OriginalMember(owner = "client!pc", name = "w", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!pc", name = "z", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!pc", name = "D", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!pc", name = "C", descriptor = "Lwd;")
    public static class140 field2206;

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "Lea;")
    public static class30 field2188;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "Ljd;")
    private class62 field2183;

    @OriginalMember(owner = "client!pc", name = "B", descriptor = "Lnd;")
    public static class86 field2205;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "[B")
    private byte[] field2180;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(III[B)V", line = 3)
    public final void method749(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field2199++;
        if (this.field2204) {
            return;
        }
        int var5 = -49 % ((-arg2 - 1) / 59);
        while (arg1 > 0) {
            int var6 = this.field2185.read(arg3, arg0, arg1);
            if (var6 <= 0) {
                throw new EOFException();
            }
            arg1 -= var6;
            arg0 += var6;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V", line = 38)
    public static final void method750(byte arg0) {
        if (arg0 != 9) {
            method753((byte) -76, 39, null, 23);
        }
        while (class112.field2558.method710(class133.field3166, (byte) 124) >= 27) {
            int var1 = class112.field2558.method709(15, (byte) 86);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class9.field189[var1] == null) {
                var2 = true;
                class9.field189[var1] = new class66();
            }
            class66 var3 = class9.field189[var1];
            class65.field1530[class130.field3042++] = var1;
            var3.field1217 = class135.field3243;
            int var4 = class112.field2558.method709(5, (byte) 86);
            int var5 = class42.field1027[class112.field2558.method709(3, (byte) 86)];
            if (var4 > 15) {
                var4 -= 32;
            }
            if (var2) {
                var3.field1199 = var5;
            }
            int var6 = class112.field2558.method709(1, (byte) 86);
            if (var6 == 1) {
                class138.field3308[class69.field1649++] = var1;
            }
            var3.field1542 = class63.method483(class112.field2558.method709(13, (byte) 86), true);
            int var7 = class112.field2558.method709(5, (byte) 86);
            int var8 = class112.field2558.method709(1, (byte) 86);
            var3.field1237 = var3.field1542.field1713;
            var3.field1208 = var3.field1542.field1707;
            if (var7 > 15) {
                var7 -= 32;
            }
            var3.field1231 = var3.field1542.field1723;
            var3.field1204 = var3.field1542.field1743;
            var3.field1197 = var3.field1542.field1739;
            var3.field1221 = var3.field1542.field1711;
            var3.field1249 = var3.field1542.field1701;
            if (var3.field1249 == 0) {
                var3.field1199 = 0;
            }
            var3.field1220 = var3.field1542.field1738;
            var3.field1254 = var3.field1542.field1736;
            var3.method415(class69.field1640.field1263[0] + var4, class69.field1640.field1198[0] + var7, var8 == 1, false);
        }
        class112.field2558.method716((byte) 110);
        field2187++;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V", line = 114)
    public final void method751(int arg0) {
        field2192++;
        if (this.field2204 || arg0 != -2) {
            return;
        }
        synchronized (this) {
            this.field2204 = true;
            this.notifyAll();
        }
        if (this.field2183 != null) {
            while (this.field2183.field1464 == 0) {
                class84.method653(1L, (byte) 124);
            }
            if (this.field2183.field1464 == 1) {
                try {
                    ((Thread) this.field2183.field1467).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field2183 = null;
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(B)I", line = 169)
    public final int method752(byte arg0) throws IOException {
        field2203++;
        if (arg0 == -115) {
            return this.field2204 ? 0 : this.field2185.available();
        } else {
            return -53;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BI[BI)I", line = 183)
    public static final int method753(byte arg0, int arg1, byte[] arg2, int arg3) {
        field2182++;
        int var4 = -1;
        for (int var5 = arg3; var5 < arg1; var5++) {
            var4 = class117.field2771[(var4 ^ arg2[var5]) & 0xFF] ^ var4 >>> 8;
        }
        if (arg0 != -84) {
            method755(-96);
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(III[B)V", line = 206)
    public final void method754(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field2200++;
        if (this.field2204) {
            return;
        }
        if (this.field2197) {
            this.field2197 = false;
            throw new IOException();
        }
        if (this.field2180 == null) {
            this.field2180 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg0; var6++) {
                this.field2180[this.field2208] = arg3[arg2 + var6];
                this.field2208 = (this.field2208 + 1) % 5000;
                if ((this.field2179 + 4900) % 5000 == this.field2208) {
                    throw new IOException();
                }
            }
            if (this.field2183 == null) {
                this.field2183 = this.field2184.method130(3, this, arg1 - 43611);
            }
            this.notifyAll();
            if (arg1 != 32741) {
                method750((byte) -84);
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "run", descriptor = "()V", line = 263)
    public final void run() {
        field2198++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field2208 == this.field2179) {
                        if (this.field2204) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    var2 = this.field2179;
                    if (this.field2208 < this.field2179) {
                        var3 = 5000 - this.field2179;
                    } else {
                        var3 = this.field2208 - this.field2179;
                    }
                }
                if (var3 > 0) {
                    try {
                        this.field2181.write(this.field2180, var2, var3);
                    } catch (IOException var9) {
                        this.field2197 = true;
                    }
                    this.field2179 = (this.field2179 + var3) % 5000;
                    try {
                        if (this.field2208 == this.field2179) {
                            this.field2181.flush();
                        }
                    } catch (IOException var8) {
                        this.field2197 = true;
                    }
                }
            }
            try {
                if (this.field2185 != null) {
                    this.field2185.close();
                }
                if (this.field2181 != null) {
                    this.field2181.close();
                }
                if (this.field2201 != null) {
                    this.field2201.close();
                }
            } catch (IOException var7) {
            }
            this.field2180 = null;
        } catch (Exception var12) {
            class109.method832(68, var12, null);
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)V", line = 337)
    public static void method755(int arg0) {
        field2209 = null;
        field2188 = null;
        field2193 = null;
        field2202 = null;
        field2196 = null;
        field2206 = null;
        if (arg0 == 0) {
            field2190 = null;
            field2205 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(B)I", line = 356)
    public final int method756(byte arg0) throws IOException {
        field2186++;
        if (this.field2204) {
            return 0;
        } else if (arg0 >= -86) {
            return -71;
        } else {
            return this.field2185.read();
        }
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Ljava/net/Socket;Lc;)V", line = 441)
    public class97(Socket arg0, class15 arg1) throws IOException {
        this.field2184 = arg1;
        this.field2201 = arg0;
        this.field2201.setSoTimeout(30000);
        this.field2201.setTcpNoDelay(true);
        this.field2185 = this.field2201.getInputStream();
        this.field2181 = this.field2201.getOutputStream();
    }

    @OriginalMember(owner = "client!pc", name = "finalize", descriptor = "()V", line = 386)
    protected final void finalize() {
        this.method751(-2);
        field2191++;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lac;II)Z", line = 409)
    public static final boolean method757(class4 arg0, int arg1, int arg2) {
        field2178++;
        byte[] var3 = arg0.method24(117, arg1);
        if (arg2 != 13) {
            return false;
        } else if (var3 == null) {
            return false;
        } else {
            class14.method116(var3, -21239);
            return true;
        }
    }
}
