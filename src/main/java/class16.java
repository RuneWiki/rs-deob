import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class16 implements Runnable {

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "Z")
    private boolean field295 = false;

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "I")
    private int field301 = 0;

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "Z")
    private boolean field304 = false;

    @OriginalMember(owner = "client!oh", name = "y", descriptor = "I")
    private int field318 = 0;

    @OriginalMember(owner = "client!oh", name = "q", descriptor = "Loj;")
    private class325 field310;

    @OriginalMember(owner = "client!oh", name = "r", descriptor = "Ljava/net/Socket;")
    private Socket field311;

    @OriginalMember(owner = "client!oh", name = "m", descriptor = "Ljava/io/InputStream;")
    private InputStream field306;

    @OriginalMember(owner = "client!oh", name = "o", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field308;

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "Lik;")
    public static class259 field303 = new class259(64);

    @OriginalMember(owner = "client!oh", name = "x", descriptor = "I")
    public static int field317 = 0;

    @OriginalMember(owner = "client!oh", name = "z", descriptor = "I")
    public static volatile int field319 = 0;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!oh", name = "l", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!oh", name = "n", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "client!oh", name = "p", descriptor = "I")
    public static int field309;

    @OriginalMember(owner = "client!oh", name = "t", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!oh", name = "u", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "client!oh", name = "v", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "client!oh", name = "w", descriptor = "I")
    public static int field316;

    @OriginalMember(owner = "client!oh", name = "A", descriptor = "Lwc;")
    public static class104 field320;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "Lub;")
    private class21 field296;

    @OriginalMember(owner = "client!oh", name = "s", descriptor = "[B")
    private byte[] field312;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)V", line = 12)
    public final void method130(byte arg0) throws IOException {
        field302++;
        if (arg0 < 0) {
            field303 = (class259) null;
        }
        if (!this.field304 && this.field295) {
            this.field295 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V", line = 36)
    public final void method131(int arg0) {
        field314++;
        if (this.field304) {
            return;
        }
        if (arg0 != -11918) {
            method133(-31);
        }
        synchronized (this) {
            this.field304 = true;
            this.notifyAll();
        }
        if (this.field296 != null) {
            while (this.field296.field387 == 0) {
                class279.method1991(arg0 + 12021, 1L);
            }
            if (this.field296.field387 == 1) {
                try {
                    ((Thread) this.field296.field391).join();
                } catch (InterruptedException var5) {
                }
            }
        }
        this.field296 = null;
    }

    @OriginalMember(owner = "client!oh", name = "run", descriptor = "()V", line = 80)
    public final void run() {
        try {
            while (true) {
                int var3;
                int var4;
                label88: {
                    synchronized (this) {
                        label89: {
                            if (this.field318 == this.field301) {
                                if (this.field304) {
                                    break label89;
                                }
                                try {
                                    this.wait();
                                } catch (InterruptedException var13) {
                                }
                            }
                            if (this.field301 <= this.field318) {
                                var3 = this.field318 - this.field301;
                            } else {
                                var3 = 5000 - this.field301;
                            }
                            var4 = this.field301;
                            break label88;
                        }
                    }
                    try {
                        if (this.field306 != null) {
                            this.field306.close();
                        }
                        if (this.field308 != null) {
                            this.field308.close();
                        }
                        if (this.field311 != null) {
                            this.field311.close();
                        }
                    } catch (IOException var10) {
                    }
                    this.field312 = null;
                    break;
                }
                if (var3 > 0) {
                    try {
                        this.field308.write(this.field312, var4, var3);
                    } catch (IOException var12) {
                        this.field295 = true;
                    }
                    this.field301 = (this.field301 + var3) % 5000;
                    try {
                        if (this.field318 == this.field301) {
                            this.field308.flush();
                        }
                    } catch (IOException var11) {
                        this.field295 = true;
                    }
                }
            }
        } catch (Exception var15) {
            class134.method1009(-2, (String) null, var15);
        }
        field305++;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;", line = 146)
    public static final String method132(byte arg0, String arg1) {
        int var2 = arg1.length();
        field297++;
        byte var3 = 2;
        if (arg0 < 83) {
            field317 = -117;
        }
        char[] var4 = new char[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            char var6 = arg1.charAt(var5);
            if (var3 == 0) {
                var6 = Character.toLowerCase(var6);
            } else if (var3 == 2 || Character.isUpperCase(var6)) {
                var6 = class163.method1204(-403, var6);
            }
            if (Character.isLetter(var6)) {
                var3 = 0;
            } else if (var6 == '.' || var6 == '?' || var6 == '!') {
                var3 = 2;
            } else if (!Character.isSpaceChar(var6)) {
                var3 = 1;
            } else if (var3 != 2) {
                var3 = 1;
            }
            var4[var5] = var6;
        }
        return new String(var4);
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)V", line = 202)
    public static void method133(int arg0) {
        field303 = null;
        field320 = null;
        if (arg0 > -122) {
            field317 = 87;
        }
    }

    @OriginalMember(owner = "client!oh", name = "finalize", descriptor = "()V", line = 213)
    protected final void finalize() {
        field309++;
        this.method131(-11918);
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(B)V", line = 221)
    public final void method134(byte arg0) {
        field316++;
        if (this.field304) {
            return;
        }
        this.field306 = new class22();
        this.field308 = new class235();
        if (arg0 != -14) {
            this.field318 = 16;
        }
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Ljava/net/Socket;Loj;)V", line = 390)
    public class16(Socket arg0, class325 arg1) throws IOException {
        this.field310 = arg1;
        this.field311 = arg0;
        this.field311.setSoTimeout(30000);
        this.field311.setTcpNoDelay(true);
        this.field306 = this.field311.getInputStream();
        this.field308 = this.field311.getOutputStream();
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IZIII)V", line = 244)
    public static final void method135(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field315++;
        class4 var5 = class67.method510(1, 4, arg3);
        var5.method14(24710);
        var5.field21 = arg2;
        var5.field20 = arg4;
        if (!arg1) {
            field319 = -116;
        }
        var5.field15 = arg0;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I[BBI)V", line = 265)
    public final void method136(int arg0, byte[] arg1, byte arg2, int arg3) throws IOException {
        field307++;
        if (this.field304) {
            return;
        }
        if (this.field295) {
            this.field295 = false;
            throw new IOException();
        }
        if (this.field312 == null) {
            this.field312 = new byte[5000];
        }
        synchronized (this) {
            int var6 = 0;
            if (arg2 != -4) {
                this.method134((byte) -104);
            }
            while (var6 < arg0) {
                this.field312[this.field318] = arg1[arg3 + var6];
                this.field318 = (this.field318 + 1) % 5000;
                if ((this.field301 + 4900) % 5000 == this.field318) {
                    throw new IOException();
                }
                var6++;
            }
            if (this.field296 == null) {
                this.field296 = this.field310.method2237(3, this, (byte) 68);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(B)I", line = 318)
    public final int method137(byte arg0) throws IOException {
        if (arg0 < 5) {
            method133(83);
        }
        field299++;
        return this.field304 ? 0 : this.field306.available();
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(I)I", line = 335)
    public final int method138(int arg0) throws IOException {
        field313++;
        if (arg0 == -5380) {
            return this.field304 ? 0 : this.field306.read();
        } else {
            return 109;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "([BIII)V", line = 359)
    public final void method139(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field298++;
        if (arg1 != -3) {
            field320 = (class104) null;
        }
        if (this.field304) {
            return;
        }
        while (arg2 > 0) {
            int var5 = this.field306.read(arg0, arg3, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg3 += var5;
            arg2 -= var5;
        }
    }
}
