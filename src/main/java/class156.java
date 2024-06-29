import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class156 implements Runnable {

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "I")
    private int field2445 = 0;

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "I")
    private int field2441 = 0;

    @OriginalMember(owner = "client!ol", name = "v", descriptor = "Z")
    private boolean field2461 = false;

    @OriginalMember(owner = "client!ol", name = "A", descriptor = "Z")
    private boolean field2466 = false;

    @OriginalMember(owner = "client!ol", name = "p", descriptor = "Lap;")
    private class279 field2455;

    @OriginalMember(owner = "client!ol", name = "t", descriptor = "Ljava/net/Socket;")
    private Socket field2459;

    @OriginalMember(owner = "client!ol", name = "k", descriptor = "Ljava/io/InputStream;")
    private InputStream field2450;

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field2442;

    @OriginalMember(owner = "client!ol", name = "C", descriptor = "Ljava/lang/String;")
    public static String field2468 = "white:";

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "I")
    public static int field2443;

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "I")
    public static int field2444;

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!ol", name = "h", descriptor = "I")
    public static int field2447;

    @OriginalMember(owner = "client!ol", name = "i", descriptor = "I")
    public static int field2448;

    @OriginalMember(owner = "client!ol", name = "j", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!ol", name = "l", descriptor = "I")
    public static int field2451;

    @OriginalMember(owner = "client!ol", name = "m", descriptor = "I")
    public static int field2452;

    @OriginalMember(owner = "client!ol", name = "n", descriptor = "I")
    public static int field2453;

    @OriginalMember(owner = "client!ol", name = "o", descriptor = "I")
    public static int field2454;

    @OriginalMember(owner = "client!ol", name = "r", descriptor = "I")
    public static int field2457;

    @OriginalMember(owner = "client!ol", name = "s", descriptor = "I")
    public static int field2458;

    @OriginalMember(owner = "client!ol", name = "x", descriptor = "I")
    public static int field2463;

    @OriginalMember(owner = "client!ol", name = "y", descriptor = "I")
    public static int field2464;

    @OriginalMember(owner = "client!ol", name = "B", descriptor = "I")
    public static int field2467;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "Lvd;")
    private class26 field2440;

    @OriginalMember(owner = "client!ol", name = "u", descriptor = "Lmo;")
    public static class447 field2460;

    @OriginalMember(owner = "client!ol", name = "w", descriptor = "Lmo;")
    public static class447 field2462;

    @OriginalMember(owner = "client!ol", name = "z", descriptor = "[B")
    private byte[] field2465;

    @OriginalMember(owner = "client!ol", name = "q", descriptor = "[S")
    public static short[] field2456;

    @OriginalMember(owner = "client!ol", name = "run", descriptor = "()V", line = 5)
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field2445 == this.field2441) {
                            if (this.field2461) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        if (this.field2441 > this.field2445) {
                            var2 = 5000 - this.field2441;
                        } else {
                            var2 = this.field2445 - this.field2441;
                        }
                        var3 = this.field2441;
                    }
                    if (var2 <= 0) {
                        continue;
                    }
                    try {
                        this.field2442.write(this.field2465, var3, var2);
                    } catch (IOException var9) {
                        this.field2466 = true;
                    }
                    this.field2441 = (this.field2441 + var2) % 5000;
                    try {
                        if (this.field2445 == this.field2441) {
                            this.field2442.flush();
                        }
                    } catch (IOException var8) {
                        this.field2466 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2450 != null) {
                        this.field2450.close();
                    }
                    if (this.field2442 != null) {
                        this.field2442.close();
                    }
                    if (this.field2459 != null) {
                        this.field2459.close();
                    }
                } catch (IOException var7) {
                }
                this.field2465 = null;
                break;
            }
        } catch (Exception var12) {
            class272.method1845(var12, 124, (String) null);
        }
        field2463++;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V", line = 77)
    public final void method1096(int arg0) {
        field2453++;
        if (!this.field2461) {
            this.field2450 = new class410();
            if (arg0 == -15279) {
                this.field2442 = new class395();
            }
        }
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(I)V", line = 94)
    public static void method1097(int arg0) {
        field2468 = null;
        if (arg0 != -20126) {
            method1099(-5, -65);
        }
        field2460 = null;
        field2456 = null;
        field2462 = null;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)V", line = 108)
    public final void method1098(byte arg0) {
        if (arg0 <= 48) {
            method1097(-10);
        }
        field2454++;
        if (this.field2461) {
            return;
        }
        synchronized (this) {
            this.field2461 = true;
            this.notifyAll();
        }
        if (this.field2440 != null) {
            while (this.field2440.field304 == 0) {
                class84.method517((byte) -73, 1L);
            }
            if (this.field2440.field304 == 1) {
                try {
                    ((Thread) this.field2440.field305).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field2440 = null;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(II)Lgn;", line = 149)
    public static final class417 method1099(int arg0, int arg1) {
        field2444++;
        class52 var2 = class47.field584;
        class417 var3;
        synchronized (class47.field584) {
            if (arg1 < 46) {
                field2456 = null;
            }
            var3 = (class417) class47.field584.method331((byte) 69, (long) arg0);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class411.field6085.method2771(class56.method371(-109, arg0), class405.method2541(127, arg0), 3);
        class417 var5 = new class417();
        var5.field6153 = arg0;
        if (var4 != null) {
            var5.method2605((byte) -79, new class186(var4));
        }
        var5.method2609(0);
        class52 var6 = class47.field584;
        synchronized (class47.field584) {
            class47.field584.method341(93, (long) arg0, var5);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(III)I", line = 182)
    public static final int method1100(int arg0, int arg1, int arg2) {
        if (arg2 == 5000) {
            field2464++;
            return arg1 == 1 || arg1 == 3 ? class114.field1582[arg0 & 0x3] : class374.field5647[arg0 & 0x3];
        } else {
            return -112;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "([BIII)V", line = 198)
    public final void method1101(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field2467++;
        if (this.field2461) {
            return;
        }
        if (this.field2466) {
            this.field2466 = false;
            throw new IOException();
        }
        if (this.field2465 == null) {
            this.field2465 = new byte[5000];
        }
        synchronized (this) {
            if (arg3 != 3) {
                method1099(31, -52);
            }
            for (int var6 = 0; var6 < arg2; var6++) {
                this.field2465[this.field2445] = arg0[arg1 + var6];
                this.field2445 = (this.field2445 + 1) % 5000;
                if ((this.field2441 + 4900) % 5000 == this.field2445) {
                    throw new IOException();
                }
            }
            if (this.field2440 == null) {
                this.field2440 = this.field2455.method1897(3, this, 2);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "(I)I", line = 254)
    public final int method1102(int arg0) throws IOException {
        if (arg0 == 30000) {
            field2457++;
            return this.field2461 ? 0 : this.field2450.available();
        } else {
            return -31;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I[BII)V", line = 269)
    public final void method1103(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field2447++;
        if (this.field2461) {
            return;
        }
        while (arg2 > 0) {
            int var5 = this.field2450.read(arg1, arg3, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg2 -= var5;
            arg3 += var5;
        }
        if (arg0 != 0) {
            this.method1096(-16);
        }
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(Ljava/net/Socket;Lap;)V", line = 377)
    public class156(Socket arg0, class279 arg1) throws IOException {
        this.field2455 = arg1;
        this.field2459 = arg0;
        this.field2459.setSoTimeout(30000);
        this.field2459.setTcpNoDelay(true);
        this.field2450 = this.field2459.getInputStream();
        this.field2442 = this.field2459.getOutputStream();
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(B)V", line = 304)
    public final void method1104(byte arg0) throws IOException {
        field2446++;
        if (arg0 != -128) {
            field2460 = null;
        }
        if (!this.field2461 && this.field2466) {
            this.field2466 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Z)I", line = 329)
    public final int method1105(boolean arg0) throws IOException {
        if (arg0) {
            this.method1098((byte) 25);
        }
        field2443++;
        return this.field2461 ? 0 : this.field2450.read();
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(BI)V", line = 349)
    public static final void method1106(byte arg0, int arg1) {
        if (arg0 != 67) {
            return;
        }
        class52 var2 = class8.field102;
        synchronized (class8.field102) {
            class8.field102.method337(arg1, (byte) -107);
        }
        field2458++;
    }

    @OriginalMember(owner = "client!ol", name = "finalize", descriptor = "()V", line = 363)
    protected final void finalize() {
        this.method1098((byte) 114);
        field2448++;
    }
}
