import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class139 implements Runnable {

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "Z")
    private boolean field2213 = false;

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "Z")
    private boolean field2219 = false;

    @OriginalMember(owner = "client!ca", name = "w", descriptor = "I")
    private int field2226 = 0;

    @OriginalMember(owner = "client!ca", name = "A", descriptor = "I")
    private int field2230 = 0;

    @OriginalMember(owner = "client!ca", name = "C", descriptor = "Ljava/net/Socket;")
    private Socket field2232;

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "Lrm;")
    private class45 field2209;

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "Ljava/io/InputStream;")
    private InputStream field2216;

    @OriginalMember(owner = "client!ca", name = "o", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field2218;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "Z")
    public static boolean field2205 = false;

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "I")
    public static int field2215 = 0;

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "Z")
    public static boolean field2211 = false;

    @OriginalMember(owner = "client!ca", name = "s", descriptor = "I")
    public static int field2222 = 0;

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "Z")
    public static boolean field2217 = false;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "I")
    public static int field2204;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
    public static int field2206;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!ca", name = "q", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!ca", name = "r", descriptor = "I")
    public static int field2221;

    @OriginalMember(owner = "client!ca", name = "t", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!ca", name = "u", descriptor = "I")
    public static int field2224;

    @OriginalMember(owner = "client!ca", name = "x", descriptor = "I")
    public static int field2227;

    @OriginalMember(owner = "client!ca", name = "y", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!ca", name = "B", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!ca", name = "v", descriptor = "Lbg;")
    private class172 field2225;

    @OriginalMember(owner = "client!ca", name = "z", descriptor = "[B")
    private byte[] field2229;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
    public static final void method969(int arg0) {
        field2207++;
        class177 var1 = class34.field516;
        synchronized (class34.field516) {
            class14.field151++;
            class68.field1134 = class303.field4837;
            if (class41.field603 < 0) {
                for (int var2 = 0; var2 < 112; var2++) {
                    class100.field1627[var2] = false;
                }
                class41.field603 = class256.field4143;
            } else {
                while (class41.field603 != class256.field4143) {
                    int var3 = class109.field1741[class256.field4143];
                    class256.field4143 = class256.field4143 + 1 & 0x7F;
                    if (var3 >= 0) {
                        class100.field1627[var3] = true;
                    } else {
                        class100.field1627[~var3] = false;
                    }
                }
            }
            class303.field4837 = class99.field1594;
            if (arg0 != -8150) {
                field2222 = -29;
            }
        }
    }

    @OriginalMember(owner = "client!ca", name = "run", descriptor = "()V")
    public final void run() {
        field2210++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field2230 == this.field2226) {
                        if (this.field2219) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    var2 = this.field2230;
                    if (this.field2230 > this.field2226) {
                        var3 = 5000 - this.field2230;
                    } else {
                        var3 = this.field2226 - this.field2230;
                    }
                }
                if (var3 > 0) {
                    try {
                        this.field2218.write(this.field2229, var2, var3);
                    } catch (IOException var9) {
                        this.field2213 = true;
                    }
                    this.field2230 = (this.field2230 + var3) % 5000;
                    try {
                        if (this.field2230 == this.field2226) {
                            this.field2218.flush();
                        }
                    } catch (IOException var8) {
                        this.field2213 = true;
                    }
                }
            }
            try {
                if (this.field2216 != null) {
                    this.field2216.close();
                }
                if (this.field2218 != null) {
                    this.field2218.close();
                }
                if (this.field2232 != null) {
                    this.field2232.close();
                }
            } catch (IOException var7) {
            }
            this.field2229 = null;
        } catch (Exception var12) {
            class19.method94(-126, var12, (String) null);
        }
    }

    @OriginalMember(owner = "client!ca", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method974((byte) 119);
        field2206++;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)V")
    public final void method970(byte arg0) {
        if (arg0 < 13) {
            return;
        }
        field2227++;
        if (!this.field2219) {
            this.field2216 = new class270();
            this.field2218 = new class4();
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Z)V")
    public static final void method971(boolean arg0) {
        field2204++;
        if (arg0) {
            method975((byte) 28, (class251) null, (class251) null, false);
        }
        class136.field2145.method1255(-102);
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)I")
    public final int method972(int arg0) throws IOException {
        field2221++;
        if (this.field2219) {
            return 0;
        } else {
            if (arg0 != 0) {
                this.method970((byte) 11);
            }
            return this.field2216.available();
        }
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(Z)V")
    public final void method973(boolean arg0) throws IOException {
        if (!arg0) {
            return;
        }
        field2214++;
        if (!this.field2219 && this.field2213) {
            this.field2213 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(B)V")
    public final void method974(byte arg0) {
        field2231++;
        if (this.field2219) {
            return;
        }
        synchronized (this) {
            this.field2219 = true;
            this.notifyAll();
        }
        if (arg0 < 105) {
            return;
        }
        if (this.field2225 != null) {
            while (this.field2225.field2814 == 0) {
                class262.method1758(1L, 29552);
            }
            if (this.field2225.field2814 == 1) {
                try {
                    ((Thread) this.field2225.field2817).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field2225 = null;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(BLdk;Ldk;Z)V")
    public static final void method975(byte arg0, class251 arg1, class251 arg2, boolean arg3) {
        class198.field3189 = arg2;
        field2208++;
        class96.field1553 = arg1;
        if (arg0 <= 64) {
            method976(-100);
        }
        class298.field4748 = arg3;
    }

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "(I)V")
    public static final void method976(int arg0) {
        field2223++;
        if (arg0 != -11901) {
            method969(10);
        }
        if (!class266.field4275 && class225.field3652 != 2) {
            try {
                class297.method1967(false, "tbrefresh", class59.field973);
            } catch (Throwable var1) {
            }
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "([BIII)V")
    public final void method977(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field2212++;
        if (arg3 != -27241) {
            method969(75);
        }
        if (this.field2219) {
            return;
        }
        if (this.field2213) {
            this.field2213 = false;
            throw new IOException();
        }
        if (this.field2229 == null) {
            this.field2229 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg1; var6++) {
                this.field2229[this.field2226] = arg0[arg2 + var6];
                this.field2226 = (this.field2226 + 1) % 5000;
                if ((this.field2230 + 4900) % 5000 == this.field2226) {
                    throw new IOException();
                }
            }
            if (this.field2225 == null) {
                this.field2225 = this.field2209.method319(3, this, (byte) -118);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "(I)I")
    public final int method978(int arg0) throws IOException {
        field2220++;
        if (arg0 >= -93) {
            this.field2229 = null;
        }
        return this.field2219 ? 0 : this.field2216.read();
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "([BIII)V")
    public final void method979(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field2228++;
        if (arg1 != -1) {
            field2211 = true;
        }
        if (this.field2219) {
            return;
        }
        while (arg3 > 0) {
            int var5 = this.field2216.read(arg0, arg2, arg3);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg3 -= var5;
            arg2 += var5;
        }
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Ljava/net/Socket;Lrm;)V")
    public class139(Socket arg0, class45 arg1) throws IOException {
        this.field2232 = arg0;
        this.field2209 = arg1;
        this.field2232.setSoTimeout(30000);
        this.field2232.setTcpNoDelay(true);
        this.field2216 = this.field2232.getInputStream();
        this.field2218 = this.field2232.getOutputStream();
    }
}
