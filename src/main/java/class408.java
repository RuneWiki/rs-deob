import jaggl.OpenGL;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vea")
public class class408 implements Runnable {

    @OriginalMember(owner = "client!vea", name = "e", descriptor = "I")
    private int field5443 = 0;

    @OriginalMember(owner = "client!vea", name = "m", descriptor = "Z")
    private boolean field5451 = false;

    @OriginalMember(owner = "client!vea", name = "k", descriptor = "I")
    private int field5449 = 0;

    @OriginalMember(owner = "client!vea", name = "s", descriptor = "Z")
    private boolean field5457 = false;

    @OriginalMember(owner = "client!vea", name = "r", descriptor = "Ljava/net/Socket;")
    private Socket field5456;

    @OriginalMember(owner = "client!vea", name = "v", descriptor = "Lpi;")
    private class464 field5460;

    @OriginalMember(owner = "client!vea", name = "p", descriptor = "Ljava/io/InputStream;")
    private InputStream field5454;

    @OriginalMember(owner = "client!vea", name = "y", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field5463;

    @OriginalMember(owner = "client!vea", name = "d", descriptor = "F")
    public static float field5442;

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "I")
    public static int field5439;

    @OriginalMember(owner = "client!vea", name = "f", descriptor = "I")
    public static int field5444;

    @OriginalMember(owner = "client!vea", name = "g", descriptor = "I")
    public static int field5445;

    @OriginalMember(owner = "client!vea", name = "h", descriptor = "I")
    public static int field5446;

    @OriginalMember(owner = "client!vea", name = "i", descriptor = "I")
    public static int field5447;

    @OriginalMember(owner = "client!vea", name = "j", descriptor = "I")
    public static int field5448;

    @OriginalMember(owner = "client!vea", name = "n", descriptor = "I")
    public static int field5452;

    @OriginalMember(owner = "client!vea", name = "o", descriptor = "I")
    public static int field5453;

    @OriginalMember(owner = "client!vea", name = "t", descriptor = "I")
    public static int field5458;

    @OriginalMember(owner = "client!vea", name = "u", descriptor = "I")
    public static int field5459;

    @OriginalMember(owner = "client!vea", name = "w", descriptor = "I")
    public static int field5461;

    @OriginalMember(owner = "client!vea", name = "x", descriptor = "I")
    public static int field5462;

    @OriginalMember(owner = "client!vea", name = "c", descriptor = "Ltf;")
    public static class701 field5441;

    @OriginalMember(owner = "client!vea", name = "b", descriptor = "Lbp;")
    private class88 field5440;

    @OriginalMember(owner = "client!vea", name = "q", descriptor = "[B")
    private byte[] field5455;

    @OriginalMember(owner = "client!vea", name = "l", descriptor = "[I")
    public static int[] field5450;

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(III)Lhfa;")
    public static final class465 method2278(int arg0, int arg1, int arg2) {
        class499 var3 = class487.field7044[arg0][arg1][arg2];
        return var3 == null ? null : var3.field7223;
    }

    @OriginalMember(owner = "client!vea", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method2287(6780);
        field5444++;
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(I)V")
    public static final void method2279(int arg0) {
        for (int var1 = 0; var1 < class309.field3825; var1++) {
            class340 var3 = class89.field891[var1];
            boolean var4 = false;
            if (var3.field4297 == null) {
                var3.field4288--;
                if (var3.field4288 >= (var3.method1966((byte) -110) ? -1500 : -10)) {
                    if (var3.field4296 == 1 && var3.field4291 == null) {
                        var3.field4291 = class52.method268(class392.field5317, var3.field4294, 0);
                        if (var3.field4291 == null) {
                            continue;
                        }
                        var3.field4288 += var3.field4291.method267();
                    } else if (var3.method1966((byte) -110) && (var3.field4286 == null || var3.field4292 == null)) {
                        if (var3.field4286 == null) {
                            var3.field4286 = class253.method1486(class461.field6558, var3.field4294);
                        }
                        if (var3.field4286 == null) {
                            continue;
                        }
                        if (var3.field4292 == null) {
                            var3.field4292 = var3.field4286.method1485(new int[] { 22050 });
                            if (var3.field4292 == null) {
                                continue;
                            }
                        }
                    }
                    if (var3.field4288 < 0) {
                        int var12;
                        if (var3.field4290 == 0) {
                            var12 = var3.field4295 * (var3.field4296 == 3 ? class639.field9075.field6776 : class639.field9075.field6773) >> 8;
                        } else {
                            int var5 = var3.field4290 >> 24 & 0x3;
                            if (class362.field4859.field5166 == var5) {
                                int var6 = (var3.field4290 & 0xFF) << 9;
                                int var7 = (var3.field4290 & 0xFF144B) >> 16;
                                int var8 = (var7 << 9) + 256 - class362.field4859.field5179;
                                if (var8 < 0) {
                                    var8 = -var8;
                                }
                                int var9 = (var3.field4290 & 0xFF8C) >> 8;
                                int var10 = (var9 << 9) + 256 - class362.field4859.field5176;
                                if (var10 < 0) {
                                    var10 = -var10;
                                }
                                int var11 = var8 + var10 - 512;
                                if (var11 > var6) {
                                    var3.field4288 = -99999;
                                    continue;
                                }
                                if (var11 < 0) {
                                    var11 = 0;
                                }
                                var12 = (var6 - var11) * var3.field4295 * class639.field9075.field6809 / var6 >> 8;
                            } else {
                                var12 = 0;
                            }
                        }
                        if (var12 > 0) {
                            class450 var13 = null;
                            if (var3.field4296 == 1) {
                                var13 = var3.field4291.method270().method2594(class203.field2397);
                            } else if (var3.method1966((byte) -110)) {
                                var13 = var3.field4292;
                            }
                            class704 var14 = var3.field4297 = class704.method3932(var13, 100, var12);
                            var14.method3913(var3.field4287 - 1);
                            class209.field2471.method3891(var14);
                        }
                    }
                } else {
                    var4 = true;
                }
            } else if (!var3.field4297.method1925(arg0 ^ 0x853D13FD)) {
                var4 = true;
            }
            if (var4) {
                class309.field3825--;
                for (int var15 = var1; var15 < class309.field3825; var15++) {
                    class89.field891[var15] = class89.field891[var15 + 1];
                }
                var1--;
            }
        }
        field5462++;
        if (class19.field151 && !class614.method3415(-63)) {
            if (class639.field9075.field6764 != 0 && class331.field4169 != -1) {
                class193.method1175(0, class331.field4169, class536.field7504, 0, class639.field9075.field6764, false);
            }
            class19.field151 = false;
        } else if (class639.field9075.field6764 != 0 && class331.field4169 != -1 && !class614.method3415(-38)) {
            class386.field5209++;
            class653 var2 = class699.method3845((byte) 45, class39.field395, class197.field2273);
            var2.field9158.method660((byte) 60, class331.field4169);
            class568.method3220(var2, (byte) 123);
            class331.field4169 = -1;
        }
        if (arg0 != -2059590648) {
            method2278(-92, -89, 48);
        }
    }

    @OriginalMember(owner = "client!vea", name = "b", descriptor = "(I)I")
    public final int method2280(int arg0) throws IOException {
        field5461++;
        if (this.field5451) {
            return 0;
        } else {
            if (arg0 != 0) {
                method2279(-21);
            }
            return this.field5454.read();
        }
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(I[BBI)V")
    public final void method2281(int arg0, byte[] arg1, byte arg2, int arg3) throws IOException {
        field5445++;
        if (this.field5451) {
            return;
        }
        if (this.field5457) {
            this.field5457 = false;
            throw new IOException();
        }
        if (this.field5455 == null) {
            this.field5455 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg0; var6++) {
                this.field5455[this.field5449] = arg1[arg3 + var6];
                this.field5449 = (this.field5449 + 1) % 5000;
                if ((this.field5443 + 4900) % 5000 == this.field5449) {
                    throw new IOException();
                }
            }
            if (this.field5440 == null) {
                this.field5440 = this.field5460.method2668(this, 3, -114);
            }
            this.notifyAll();
        }
        if (arg2 > -81) {
            this.field5460 = null;
        }
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(B)V")
    public final void method2282(byte arg0) {
        field5446++;
        if (this.field5451) {
            return;
        }
        this.field5454 = new class370();
        this.field5463 = new class220();
        if (arg0 > -60) {
            this.finalize();
        }
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(II[BI)V")
    public final void method2283(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (arg1 != -1) {
            method2278(89, -49, 118);
        }
        field5458++;
        if (this.field5451) {
            return;
        }
        while (arg3 > 0) {
            int var5 = this.field5454.read(arg2, arg0, arg3);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg0 += var5;
            arg3 -= var5;
        }
    }

    @OriginalMember(owner = "client!vea", name = "c", descriptor = "(I)I")
    public final int method2284(int arg0) throws IOException {
        if (arg0 != 5000) {
            this.field5463 = null;
        }
        field5453++;
        return this.field5451 ? 0 : this.field5454.available();
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "([Lsi;ILmr;)Luj;")
    public static final class626 method2285(class141[] arg0, int arg1, class221 arg2) {
        field5439++;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (arg0[var3] == null || arg0[var3].field1557 <= 0L) {
                return null;
            }
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        int var6 = 0;
        if (arg1 != 5000) {
            field5441 = null;
        }
        while (var6 < arg0.length) {
            OpenGL.glAttachObjectARB(var4, arg0[var6].field1557);
            var6++;
        }
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class372.field5075, 0);
        if (class372.field5075[0] == 0) {
            if (class372.field5075[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class372.field5075, 1);
            if (class372.field5075[1] > 1) {
                byte[] var7 = new byte[class372.field5075[1]];
                OpenGL.glGetInfoLogARB(var4, class372.field5075[1], class372.field5075, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class372.field5075[0] == 0) {
                for (int var8 = 0; var8 < arg0.length; var8++) {
                    OpenGL.glDetachObjectARB(var4, arg0[var8].field1557);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class626(arg2, var4, arg0);
    }

    @OriginalMember(owner = "client!vea", name = "d", descriptor = "(I)V")
    public static void method2286(int arg0) {
        field5441 = null;
        field5450 = null;
        int var1 = 88 / ((38 - arg0) / 38);
    }

    @OriginalMember(owner = "client!vea", name = "e", descriptor = "(I)V")
    public final void method2287(int arg0) {
        if (arg0 != 6780) {
            return;
        }
        field5459++;
        if (this.field5451) {
            return;
        }
        synchronized (this) {
            this.field5451 = true;
            this.notifyAll();
        }
        if (this.field5440 != null) {
            while (this.field5440.field884 == 0) {
                class452.method2602(1L, (byte) -97);
            }
            if (this.field5440.field884 == 1) {
                try {
                    ((Thread) this.field5440.field886).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field5440 = null;
    }

    @OriginalMember(owner = "client!vea", name = "f", descriptor = "(I)V")
    public final void method2288(int arg0) throws IOException {
        field5452++;
        if (this.field5451) {
            return;
        }
        if (this.field5457) {
            this.field5457 = false;
            throw new IOException();
        } else if (arg0 != 0) {
            method2279(-125);
        }
    }

    @OriginalMember(owner = "client!vea", name = "run", descriptor = "()V")
    public final void run() {
        field5448++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field5449 == this.field5443) {
                        if (this.field5451) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    var2 = this.field5443;
                    if (this.field5449 < this.field5443) {
                        var3 = 5000 - this.field5443;
                    } else {
                        var3 = this.field5449 - this.field5443;
                    }
                }
                if (var3 > 0) {
                    try {
                        this.field5463.write(this.field5455, var2, var3);
                    } catch (IOException var9) {
                        this.field5457 = true;
                    }
                    this.field5443 = (this.field5443 + var3) % 5000;
                    try {
                        if (this.field5449 == this.field5443) {
                            this.field5463.flush();
                        }
                    } catch (IOException var8) {
                        this.field5457 = true;
                    }
                }
            }
            try {
                if (this.field5454 != null) {
                    this.field5454.close();
                }
                if (this.field5463 != null) {
                    this.field5463.close();
                }
                if (this.field5456 != null) {
                    this.field5456.close();
                }
            } catch (IOException var7) {
            }
            this.field5455 = null;
        } catch (Exception var12) {
            class333.method1923(var12, true, null);
        }
    }

    @OriginalMember(owner = "client!vea", name = "b", descriptor = "(B)V")
    public static final void method2289(byte arg0) {
        field5447++;
        class19 var1 = class139.field1538;
        synchronized (class139.field1538) {
            int var2 = 91 / ((arg0 - 67) / 58);
            class139.field1538.method80((byte) -72);
        }
        class19 var3 = class256.field3203;
        synchronized (class256.field3203) {
            class256.field3203.method80((byte) 74);
        }
    }

    @OriginalMember(owner = "client!vea", name = "<init>", descriptor = "(Ljava/net/Socket;Lpi;)V")
    public class408(Socket arg0, class464 arg1) throws IOException {
        this.field5456 = arg0;
        this.field5460 = arg1;
        this.field5456.setSoTimeout(30000);
        this.field5456.setTcpNoDelay(true);
        this.field5454 = this.field5456.getInputStream();
        this.field5463 = this.field5456.getOutputStream();
    }
}
