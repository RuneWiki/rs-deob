import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class127 implements Runnable {

    @OriginalMember(owner = "client!nk", name = "s", descriptor = "I")
    private int field2211 = 0;

    @OriginalMember(owner = "client!nk", name = "r", descriptor = "Z")
    private boolean field2210 = false;

    @OriginalMember(owner = "client!nk", name = "l", descriptor = "Z")
    private boolean field2204 = false;

    @OriginalMember(owner = "client!nk", name = "v", descriptor = "I")
    private int field2214 = 0;

    @OriginalMember(owner = "client!nk", name = "m", descriptor = "Ljava/net/Socket;")
    private Socket field2205;

    @OriginalMember(owner = "client!nk", name = "w", descriptor = "Lwc;")
    private class229 field2215;

    @OriginalMember(owner = "client!nk", name = "q", descriptor = "Ljava/io/InputStream;")
    private InputStream field2209;

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field2198;

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "I")
    public static int field2196 = -1;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "[I")
    public static int[] field2193 = new int[128];

    @OriginalMember(owner = "client!nk", name = "t", descriptor = "Ljava/util/Random;")
    public static Random field2212 = new Random();

    @OriginalMember(owner = "client!nk", name = "B", descriptor = "Lob;")
    public static class130 field2220 = null;

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "I")
    public static int field2194;

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "I")
    public static int field2197;

    @OriginalMember(owner = "client!nk", name = "g", descriptor = "I")
    public static int field2199;

    @OriginalMember(owner = "client!nk", name = "i", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "client!nk", name = "k", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!nk", name = "n", descriptor = "I")
    public static int field2206;

    @OriginalMember(owner = "client!nk", name = "o", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!nk", name = "p", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!nk", name = "u", descriptor = "I")
    public static int field2213;

    @OriginalMember(owner = "client!nk", name = "x", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!nk", name = "z", descriptor = "I")
    public static int field2218;

    @OriginalMember(owner = "client!nk", name = "h", descriptor = "Lqe;")
    private class96 field2200;

    @OriginalMember(owner = "client!nk", name = "j", descriptor = "[B")
    private byte[] field2202;

    @OriginalMember(owner = "client!nk", name = "A", descriptor = "[I")
    public static int[] field2219;

    @OriginalMember(owner = "client!nk", name = "y", descriptor = "[Luh;")
    public static class100[] field2217;

    @OriginalMember(owner = "client!nk", name = "C", descriptor = "[[[I")
    public static int[][][] field2221;

    @OriginalMember(owner = "client!nk", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field2208++;
        this.method888(true);
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)V")
    public final void method887(byte arg0) throws IOException {
        field2199++;
        if (this.field2204) {
            return;
        }
        if (arg0 < 111) {
            method892(22, 7);
        }
        if (this.field2210) {
            this.field2210 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!nk", name = "run", descriptor = "()V")
    public final void run() {
        field2195++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field2214 == this.field2211) {
                        if (this.field2204) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    if (this.field2211 >= this.field2214) {
                        var2 = this.field2211 - this.field2214;
                    } else {
                        var2 = 5000 - this.field2214;
                    }
                    var3 = this.field2214;
                }
                if (var2 > 0) {
                    try {
                        this.field2198.write(this.field2202, var3, var2);
                    } catch (IOException var9) {
                        this.field2210 = true;
                    }
                    this.field2214 = (this.field2214 + var2) % 5000;
                    try {
                        if (this.field2214 == this.field2211) {
                            this.field2198.flush();
                        }
                    } catch (IOException var8) {
                        this.field2210 = true;
                    }
                }
            }
            try {
                if (this.field2209 != null) {
                    this.field2209.close();
                }
                if (this.field2198 != null) {
                    this.field2198.close();
                }
                if (this.field2205 != null) {
                    this.field2205.close();
                }
            } catch (IOException var7) {
            }
            this.field2202 = null;
        } catch (Exception var12) {
            class202.method1402((String) null, 32701, var12);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Z)V")
    public final void method888(boolean arg0) {
        field2201++;
        if (this.field2204) {
            return;
        }
        synchronized (this) {
            this.field2204 = arg0;
            this.notifyAll();
        }
        if (this.field2200 != null) {
            while (this.field2200.field1696 == 0) {
                class153.method1098((byte) 76, 1L);
            }
            if (this.field2200.field1696 == 1) {
                try {
                    ((Thread) this.field2200.field1699).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field2200 = null;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "([BBII)V")
    public final void method889(byte[] arg0, byte arg1, int arg2, int arg3) throws IOException {
        field2197++;
        int var5 = -51 / ((arg1 - 20) / 39);
        if (this.field2204) {
            return;
        }
        while (arg2 > 0) {
            int var6 = this.field2209.read(arg0, arg3, arg2);
            if (var6 <= 0) {
                throw new EOFException();
            }
            arg3 += var6;
            arg2 -= var6;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIIIII)I")
    public static final int method890(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg2 & 0x3;
        if ((arg1 & 0x1) == 1) {
            int var8 = arg0;
            arg0 = arg3;
            arg3 = var8;
        }
        field2206++;
        if (var7 == 0) {
            return arg6;
        } else if (var7 == 1) {
            return arg4;
        } else if (arg5 == -18030) {
            return var7 == 2 ? 7 + 1 - arg6 - arg0 : 7 - (arg3 + -1 + arg4);
        } else {
            return -124;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)I")
    public final int method891(int arg0) throws IOException {
        field2216++;
        if (this.field2204) {
            return 0;
        } else if (arg0 == 1) {
            return this.field2209.available();
        } else {
            return -70;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)V")
    public static final void method892(int arg0, int arg1) {
        class90 var2 = class221.method1575(1, arg1, 1651481952);
        var2.method651(-27655);
        if (arg0 == 3377) {
            field2194++;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(III)Lcc;")
    public static final class209 method893(int arg0, int arg1, int arg2) {
        class174 var3 = class82.field1498[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class209 var4 = var3.field3136;
            var3.field3136 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I[BII)V")
    public final void method894(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field2203++;
        if (this.field2204) {
            return;
        }
        if (this.field2210) {
            this.field2210 = false;
            throw new IOException();
        }
        if (this.field2202 == null) {
            this.field2202 = new byte[5000];
        }
        synchronized (this) {
            if (arg3 > -28) {
                method893(-121, 96, 10);
            }
            for (int var6 = 0; var6 < arg2; var6++) {
                this.field2202[this.field2211] = arg1[arg0 + var6];
                this.field2211 = (this.field2211 + 1) % 5000;
                if (((this.field2214 + 4900) % 5000) == this.field2211) {
                    throw new IOException();
                }
            }
            if (this.field2200 == null) {
                this.field2200 = this.field2215.method1636(false, 3, this);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(B)V")
    public static void method895(byte arg0) {
        field2221 = null;
        field2219 = null;
        field2220 = null;
        int var1 = 50 / ((arg0 + 40) / 52);
        field2193 = null;
        field2217 = null;
        field2212 = null;
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(Z)V")
    public final void method896(boolean arg0) {
        if (!arg0) {
            return;
        }
        field2207++;
        if (!this.field2204) {
            this.field2209 = new class62();
            this.field2198 = new class95();
        }
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(I)I")
    public final int method897(int arg0) throws IOException {
        if (arg0 != 30000) {
            field2193 = null;
        }
        field2213++;
        return this.field2204 ? 0 : this.field2209.read();
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Ljava/net/Socket;Lwc;)V")
    public class127(Socket arg0, class229 arg1) throws IOException {
        this.field2205 = arg0;
        this.field2215 = arg1;
        this.field2205.setSoTimeout(30000);
        this.field2205.setTcpNoDelay(true);
        this.field2209 = this.field2205.getInputStream();
        this.field2198 = this.field2205.getOutputStream();
    }
}
