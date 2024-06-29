import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class161 implements Runnable {

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "I")
    private int field2416 = 0;

    @OriginalMember(owner = "client!ba", name = "y", descriptor = "Z")
    private boolean field2429 = false;

    @OriginalMember(owner = "client!ba", name = "w", descriptor = "I")
    private int field2427 = 0;

    @OriginalMember(owner = "client!ba", name = "o", descriptor = "Z")
    private boolean field2419 = false;

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "Lgl;")
    private class262 field2412;

    @OriginalMember(owner = "client!ba", name = "x", descriptor = "Ljava/net/Socket;")
    private Socket field2428;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "Ljava/io/InputStream;")
    private InputStream field2405;

    @OriginalMember(owner = "client!ba", name = "u", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field2425;

    @OriginalMember(owner = "client!ba", name = "t", descriptor = "Z")
    public static boolean field2424 = true;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "I")
    public static int field2408;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "I")
    public static int field2409;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "I")
    public static int field2413;

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "I")
    public static int field2414;

    @OriginalMember(owner = "client!ba", name = "n", descriptor = "I")
    public static int field2418;

    @OriginalMember(owner = "client!ba", name = "p", descriptor = "I")
    public static int field2420;

    @OriginalMember(owner = "client!ba", name = "q", descriptor = "I")
    public static int field2421;

    @OriginalMember(owner = "client!ba", name = "r", descriptor = "I")
    public static int field2422;

    @OriginalMember(owner = "client!ba", name = "s", descriptor = "I")
    public static int field2423;

    @OriginalMember(owner = "client!ba", name = "v", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!ba", name = "z", descriptor = "I")
    public static int field2430;

    @OriginalMember(owner = "client!ba", name = "m", descriptor = "Lrk;")
    public static class16 field2417;

    @OriginalMember(owner = "client!ba", name = "k", descriptor = "Lbf;")
    private class227 field2415;

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "[B")
    private byte[] field2407;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "[Led;")
    public static class311[] field2411;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "([BZII)V", line = 10)
    public final void method1134(byte[] arg0, boolean arg1, int arg2, int arg3) throws IOException {
        field2422++;
        if (this.field2429) {
            return;
        }
        if (this.field2419) {
            this.field2419 = false;
            throw new IOException();
        }
        if (this.field2407 == null) {
            this.field2407 = new byte[5000];
        }
        if (!arg1) {
            return;
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg2; var6++) {
                this.field2407[this.field2427] = arg0[arg3 + var6];
                this.field2427 = (this.field2427 + 1) % 5000;
                if (((this.field2416 + 4900) % 5000) == this.field2427) {
                    throw new IOException();
                }
            }
            if (this.field2415 == null) {
                this.field2415 = this.field2412.method1770((byte) 85, 3, this);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIII)I", line = 69)
    public static final int method1135(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 51 / ((-arg2 - 16) / 43);
        field2414++;
        int var5 = class148.field2222[class77.method493(arg3, arg0)];
        if (arg1 > 0) {
            int var6 = class148.field2233.method740(arg1 & 0xFFFF, (byte) -99);
            if (var6 != 0) {
                int var7;
                if (arg0 < 0) {
                    var7 = 0;
                } else if (arg0 <= 127) {
                    var7 = arg0 * 131586;
                } else {
                    var7 = 16777215;
                }
                if (var6 == 256) {
                    var5 = var7;
                } else {
                    int var9 = 256 - var6;
                    var5 = ((var7 & 0xFF00) * var6 + ((var5 & 0xFF00) * var9) & 0xFF0000) + ((var5 & 0xFF00FF) * var9 + (var7 & 0xFF00FF) * var6 & 0xFF00FF00) >> 8;
                }
            }
            int var10 = class148.field2233.method735((byte) -18, arg1 & 0xFFFF);
            if (var10 != 0) {
                var10 += 256;
                int var11 = (var5 & 0xFF) * var10;
                int var12 = ((var5 & 0xFF0000) >> 16) * var10;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = (var5 >> 8 & 0xFF) * var10;
                if (var11 > 65535) {
                    var11 = 65535;
                }
                if (var13 > 65535) {
                    var13 = 65535;
                }
                var5 = (var13 & 0xFF00) + ((var12 & 0xB600FF00) << 8) + (var11 >> 8);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V", line = 140)
    public final void method1136(int arg0) throws IOException {
        field2430++;
        if (this.field2429) {
            return;
        }
        if (this.field2419) {
            this.field2419 = false;
            throw new IOException();
        } else if (arg0 != 728285352) {
            field2418 = -119;
        }
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)I", line = 162)
    public final int method1137(int arg0) throws IOException {
        if (arg0 == -2266) {
            field2420++;
            return this.field2429 ? 0 : this.field2405.available();
        } else {
            return -14;
        }
    }

    @OriginalMember(owner = "client!ba", name = "finalize", descriptor = "()V", line = 181)
    protected final void finalize() {
        this.method1138(-16726864);
        field2406++;
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(I)V", line = 189)
    public final void method1138(int arg0) {
        field2410++;
        if (this.field2429) {
            return;
        }
        synchronized (this) {
            this.field2429 = true;
            this.notifyAll();
        }
        if (this.field2415 != null) {
            while (this.field2415.field3456 == 0) {
                class93.method662(-553, 1L);
            }
            if (this.field2415.field3456 == 1) {
                try {
                    ((Thread) this.field2415.field3452).join();
                } catch (InterruptedException var5) {
                }
            }
        }
        if (arg0 != -16726864) {
            method1144((byte) -14);
        }
        this.field2415 = null;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)V", line = 232)
    public final void method1139(byte arg0) {
        field2421++;
        if (arg0 <= 64) {
            this.field2427 = 117;
        }
        if (!this.field2429) {
            this.field2405 = new class281();
            this.field2425 = new class6();
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(BI)I", line = 249)
    public static final int method1140(byte arg0, int arg1) {
        field2426++;
        return arg0 == -56 ? arg1 & 0x3FF : 22;
    }

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "(I)I", line = 260)
    public final int method1141(int arg0) throws IOException {
        if (arg0 == 65280) {
            field2413++;
            return this.field2429 ? 0 : this.field2405.read();
        } else {
            return 117;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IZ[BI)V", line = 275)
    public final void method1142(int arg0, boolean arg1, byte[] arg2, int arg3) throws IOException {
        if (!arg1) {
            return;
        }
        field2423++;
        if (this.field2429) {
            return;
        }
        while (arg0 > 0) {
            int var5 = this.field2405.read(arg2, arg3, arg0);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg0 -= var5;
            arg3 += var5;
        }
    }

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "(I)V", line = 307)
    public static void method1143(int arg0) {
        field2411 = null;
        field2417 = null;
        if (arg0 != -1) {
            method1144((byte) 69);
        }
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(Ljava/net/Socket;Lgl;)V", line = 345)
    public class161(Socket arg0, class262 arg1) throws IOException {
        this.field2412 = arg1;
        this.field2428 = arg0;
        this.field2428.setSoTimeout(30000);
        this.field2428.setTcpNoDelay(true);
        this.field2405 = this.field2428.getInputStream();
        this.field2425 = this.field2428.getOutputStream();
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(B)V", line = 334)
    public static final void method1144(byte arg0) {
        field2408++;
        class70.field921.method2182(false);
        if (arg0 == -118) {
            class160.field2397.method2182(false);
            class177.field2626.method2182(false);
        }
    }

    @OriginalMember(owner = "client!ba", name = "run", descriptor = "()V", line = 364)
    public final void run() {
        try {
            while (true) {
                int var3;
                int var4;
                synchronized (this) {
                    if (this.field2427 == this.field2416) {
                        if (this.field2429) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var12) {
                        }
                    }
                    var3 = this.field2416;
                    if (this.field2427 < this.field2416) {
                        var4 = 5000 - this.field2416;
                    } else {
                        var4 = this.field2427 - this.field2416;
                    }
                }
                if (var4 > 0) {
                    try {
                        this.field2425.write(this.field2407, var3, var4);
                    } catch (IOException var11) {
                        this.field2419 = true;
                    }
                    this.field2416 = (this.field2416 + var4) % 5000;
                    try {
                        if (this.field2427 == this.field2416) {
                            this.field2425.flush();
                        }
                    } catch (IOException var10) {
                        this.field2419 = true;
                    }
                }
            }
            try {
                if (this.field2405 != null) {
                    this.field2405.close();
                }
                if (this.field2425 != null) {
                    this.field2425.close();
                }
                if (this.field2428 != null) {
                    this.field2428.close();
                }
            } catch (IOException var13) {
            }
            this.field2407 = null;
        } catch (Exception var15) {
            class19.method122(var15, (String) null, (byte) -96);
        }
        field2409++;
    }
}
