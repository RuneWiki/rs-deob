import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class107 implements Runnable {

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
    private int field2434 = 0;

    @OriginalMember(owner = "client!pc", name = "n", descriptor = "Z")
    private boolean field2445 = false;

    @OriginalMember(owner = "client!pc", name = "r", descriptor = "I")
    private int field2449 = 0;

    @OriginalMember(owner = "client!pc", name = "u", descriptor = "Z")
    private boolean field2452 = false;

    @OriginalMember(owner = "client!pc", name = "m", descriptor = "Lq;")
    private class111 field2444;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "Ljava/net/Socket;")
    private Socket field2436;

    @OriginalMember(owner = "client!pc", name = "p", descriptor = "Ljava/io/InputStream;")
    private InputStream field2447;

    @OriginalMember(owner = "client!pc", name = "t", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field2451;

    @OriginalMember(owner = "client!pc", name = "q", descriptor = "Lac;")
    public static class4 field2448 = new class4();

    @OriginalMember(owner = "client!pc", name = "v", descriptor = "I")
    public static int field2453 = 0;

    @OriginalMember(owner = "client!pc", name = "w", descriptor = "[J")
    public static long[] field2454 = new long[200];

    @OriginalMember(owner = "client!pc", name = "z", descriptor = "Lob;")
    public static class99 field2457 = new class99(500);

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
    public static int field2432;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
    public static int field2433;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
    public static int field2435;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
    public static int field2438;

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "I")
    public static int field2439;

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "I")
    public static int field2440;

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
    public static int field2441;

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "I")
    public static int field2443;

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!pc", name = "y", descriptor = "I")
    public static int field2456;

    @OriginalMember(owner = "client!pc", name = "x", descriptor = "Lfd;")
    public static class40 field2455;

    @OriginalMember(owner = "client!pc", name = "s", descriptor = "Lg;")
    private class43 field2450;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "[B")
    private byte[] field2437;

    @OriginalMember(owner = "client!pc", name = "A", descriptor = "[Lkd;")
    public static class73[] field2458;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V")
    public static final void method841(byte arg0) {
        field2443++;
        for (int var1 = 0; var1 < class71.field1442; var1++) {
            int var2 = class89.field1961[var1];
            class83 var3 = class85.field1885[var2];
            int var4 = class9.field196.method649(false);
            if ((var4 & 0x2) != 0) {
                var4 += class9.field196.method649(false) << 8;
            }
            class122.method958(var3, var2, 121, var4);
        }
        if (arg0 != 33) {
            field2453 = -113;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "([BIII)V")
    public final void method842(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field2442++;
        if (this.field2452) {
            return;
        }
        if (this.field2445) {
            this.field2445 = false;
            throw new IOException();
        }
        if (this.field2437 == null) {
            this.field2437 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg1; var6++) {
                this.field2437[this.field2434] = arg0[arg3 + var6];
                this.field2434 = (this.field2434 + 1) % 5000;
                if ((this.field2449 + 4900) % 5000 == this.field2434) {
                    throw new IOException();
                }
            }
            int var7 = 112 % ((arg2 - 36) / 35);
            if (this.field2450 == null) {
                this.field2450 = this.field2444.method875(3, this, 2);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!pc", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method847(106);
        field2433++;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "([BIIZ)V")
    public final void method843(byte[] arg0, int arg1, int arg2, boolean arg3) throws IOException {
        field2440++;
        if (this.field2452 || arg3) {
            return;
        }
        while (arg1 > 0) {
            int var5 = this.field2447.read(arg0, arg2, arg1);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg2 += var5;
            arg1 -= var5;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;")
    public static final String method844(byte arg0, Throwable arg1) throws IOException {
        field2435++;
        if (arg0 != -52) {
            method849((byte) -108, -87, 103);
        }
        String var2;
        if (arg1 instanceof class118) {
            class118 var3 = (class118) arg1;
            arg1 = var3.field2651;
            var2 = var3.field2654 + " | ";
        } else {
            var2 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    return var2 + "| " + var8;
                }
                int var10 = var9.indexOf(40);
                int var11 = var9.indexOf(41, var10 + 1);
                if (var10 >= 0 && var11 >= 0) {
                    String var12 = var9.substring(var10 + 1, var11);
                    int var13 = var12.indexOf(".java:");
                    if (var13 >= 0) {
                        String var14 = var12.substring(0, var13) + var12.substring(var13 + 5);
                        var2 = var2 + var14 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var10);
                }
                String var15 = var9.trim();
                String var16 = var15.substring(var15.lastIndexOf(32) + 1);
                String var17 = var16.substring(var16.lastIndexOf(9) + 1);
                var2 = var2 + var17 + ' ';
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "run", descriptor = "()V")
    public final void run() {
        field2438++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field2449 == this.field2434) {
                        if (this.field2452) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    var2 = this.field2449;
                    if (this.field2434 < this.field2449) {
                        var3 = 5000 - this.field2449;
                    } else {
                        var3 = this.field2434 - this.field2449;
                    }
                }
                if (var3 > 0) {
                    try {
                        this.field2451.write(this.field2437, var2, var3);
                    } catch (IOException var9) {
                        this.field2445 = true;
                    }
                    this.field2449 = (this.field2449 + var3) % 5000;
                    try {
                        if (this.field2449 == this.field2434) {
                            this.field2451.flush();
                        }
                    } catch (IOException var8) {
                        this.field2445 = true;
                    }
                }
            }
            try {
                if (this.field2447 != null) {
                    this.field2447.close();
                }
                if (this.field2451 != null) {
                    this.field2451.close();
                }
                if (this.field2436 != null) {
                    this.field2436.close();
                }
            } catch (IOException var7) {
            }
            this.field2437 = null;
        } catch (Exception var12) {
            class112.method887(-32453, var12, null);
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(B)I")
    public final int method845(byte arg0) throws IOException {
        if (arg0 == 121) {
            field2441++;
            return this.field2452 ? 0 : this.field2447.read();
        } else {
            return 29;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V")
    public static void method846(int arg0) {
        field2457 = null;
        if (arg0 == 32) {
            field2454 = null;
            field2458 = null;
            field2455 = null;
            field2448 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)V")
    public final void method847(int arg0) {
        field2432++;
        if (this.field2452) {
            return;
        }
        int var2 = 81 % ((24 - arg0) / 61);
        synchronized (this) {
            this.field2452 = true;
            this.notifyAll();
        }
        if (this.field2450 != null) {
            while (this.field2450.field806 == 0) {
                class104.method822(-85, 1L);
            }
            if (this.field2450.field806 == 1) {
                try {
                    ((Thread) this.field2450.field808).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2450 = null;
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(B)I")
    public final int method848(byte arg0) throws IOException {
        field2446++;
        if (this.field2452) {
            return 0;
        } else {
            if (arg0 != -125) {
                field2456 = -9;
            }
            return this.field2447.available();
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BII)Z")
    public static final boolean method849(byte arg0, int arg1, int arg2) {
        if (arg0 <= 33) {
            field2448 = null;
        }
        field2439++;
        return (arg1 >> arg2 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Ljava/net/Socket;Lq;)V")
    public class107(Socket arg0, class111 arg1) throws IOException {
        this.field2444 = arg1;
        this.field2436 = arg0;
        this.field2436.setSoTimeout(30000);
        this.field2436.setTcpNoDelay(true);
        this.field2447 = this.field2436.getInputStream();
        this.field2451 = this.field2436.getOutputStream();
    }
}
