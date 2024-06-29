import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class441 implements Runnable {

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
    private int field6331 = 0;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
    private int field6334 = 0;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "Z")
    private boolean field6337 = false;

    @OriginalMember(owner = "client!ee", name = "z", descriptor = "Z")
    private boolean field6356 = false;

    @OriginalMember(owner = "client!ee", name = "q", descriptor = "Ljava/net/Socket;")
    private Socket field6347;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "Lbd;")
    private class304 field6336;

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "Ljava/io/InputStream;")
    private InputStream field6342;

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field6341;

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "Ljava/lang/String;")
    public static String field6339 = "Loading defaults - ";

    @OriginalMember(owner = "client!ee", name = "v", descriptor = "Z")
    public static boolean field6352 = true;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    public static int field6332;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
    public static int field6333;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
    public static int field6335;

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "I")
    public static int field6338;

    @OriginalMember(owner = "client!ee", name = "n", descriptor = "I")
    public static int field6344;

    @OriginalMember(owner = "client!ee", name = "o", descriptor = "I")
    public static int field6345;

    @OriginalMember(owner = "client!ee", name = "p", descriptor = "I")
    public static int field6346;

    @OriginalMember(owner = "client!ee", name = "r", descriptor = "I")
    public static int field6348;

    @OriginalMember(owner = "client!ee", name = "s", descriptor = "I")
    public static int field6349;

    @OriginalMember(owner = "client!ee", name = "t", descriptor = "I")
    public static int field6350;

    @OriginalMember(owner = "client!ee", name = "u", descriptor = "I")
    public static int field6351;

    @OriginalMember(owner = "client!ee", name = "w", descriptor = "I")
    public static int field6353;

    @OriginalMember(owner = "client!ee", name = "x", descriptor = "I")
    public static int field6354;

    @OriginalMember(owner = "client!ee", name = "y", descriptor = "I")
    public static int field6355;

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "Lid;")
    private class242 field6343;

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "[B")
    private byte[] field6340;

    @OriginalMember(owner = "client!ee", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method2736(5000);
        field6344++;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)I")
    public final int method2732(int arg0) throws IOException {
        field6335++;
        if (arg0 == 0) {
            return this.field6356 ? 0 : this.field6342.available();
        } else {
            return 34;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I[BII)V")
    public final void method2733(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field6338++;
        if (arg2 <= 21) {
            this.field6336 = null;
        }
        if (this.field6356) {
            return;
        }
        while (arg3 > 0) {
            int var5 = this.field6342.read(arg1, arg0, arg3);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg0 += var5;
            arg3 -= var5;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IILbi;)I")
    public static final int method2734(int arg0, int arg1, class139 arg2) {
        field6333++;
        if (arg1 > -16) {
            method2738((byte) 42, (class139) null, false);
        }
        if (!client.method1648(arg2).method977(arg0, true) && arg2.field2073 == null) {
            return -1;
        } else if (arg2.field2103 == null || arg2.field2103.length <= arg0) {
            return -1;
        } else {
            return arg2.field2103[arg0];
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lrk;I)V")
    public static final void method2735(class427 arg0, int arg1) {
        if (arg1 != -16825) {
            method2735((class427) null, -46);
        }
        class64.field977 = arg0;
        field6350++;
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)V")
    public final void method2736(int arg0) {
        field6332++;
        if (this.field6356) {
            return;
        }
        synchronized (this) {
            this.field6356 = true;
            this.notifyAll();
        }
        if (this.field6343 != null) {
            while (this.field6343.field3345 == 0) {
                class229.method1541(123, 1L);
            }
            if (this.field6343.field3345 == 1) {
                try {
                    ((Thread) this.field6343.field3341).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field6343 = null;
        if (arg0 != 5000) {
            this.field6336 = null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "([BIII)V")
    public final void method2737(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field6353++;
        if (this.field6356 || arg3 >= -123) {
            return;
        }
        if (this.field6337) {
            this.field6337 = false;
            throw new IOException();
        }
        if (this.field6340 == null) {
            this.field6340 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg2; var6++) {
                this.field6340[this.field6334] = arg0[arg1 + var6];
                this.field6334 = (this.field6334 + 1) % 5000;
                if ((this.field6331 + 4900) % 5000 == this.field6334) {
                    throw new IOException();
                }
            }
            if (this.field6343 == null) {
                this.field6343 = this.field6336.method1950(-40, 3, this);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BLbi;Z)V")
    public static final void method2738(byte arg0, class139 arg1, boolean arg2) {
        field6355++;
        int var3 = arg1.field1998 == 0 ? arg1.field2027 : arg1.field1998;
        int var4 = arg1.field2086 == 0 ? arg1.field2011 : arg1.field2086;
        class296.method1906(var3, var4, (byte) 113, arg1.field1968, class291.field3949[arg1.field1968 >> 16], arg2);
        if (arg0 <= 58) {
            method2738((byte) -116, (class139) null, false);
        }
        if (arg1.field2045 != null) {
            class296.method1906(var3, var4, (byte) 108, arg1.field1968, arg1.field2045, arg2);
        }
        class64 var5 = (class64) class204.field2865.method614(-76, (long) arg1.field1968);
        if (var5 != null) {
            class166.method1234(arg2, var3, (byte) 34, var5.field976, var4);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Z)V")
    public static void method2739(boolean arg0) {
        field6339 = null;
        if (arg0) {
            field6339 = null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "run", descriptor = "()V")
    public final void run() {
        field6348++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field6334 == this.field6331) {
                        if (this.field6356) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    if (this.field6334 < this.field6331) {
                        var2 = 5000 - this.field6331;
                    } else {
                        var2 = this.field6334 - this.field6331;
                    }
                    var3 = this.field6331;
                }
                if (var2 > 0) {
                    try {
                        this.field6341.write(this.field6340, var3, var2);
                    } catch (IOException var9) {
                        this.field6337 = true;
                    }
                    this.field6331 = (this.field6331 + var2) % 5000;
                    try {
                        if (this.field6334 == this.field6331) {
                            this.field6341.flush();
                        }
                    } catch (IOException var8) {
                        this.field6337 = true;
                    }
                }
            }
            try {
                if (this.field6342 != null) {
                    this.field6342.close();
                }
                if (this.field6341 != null) {
                    this.field6341.close();
                }
                if (this.field6347 != null) {
                    this.field6347.close();
                }
            } catch (IOException var7) {
            }
            this.field6340 = null;
        } catch (Exception var12) {
            class380.method2365(-2, (String) null, var12);
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(Z)V")
    public static final void method2740(boolean arg0) {
        field6345++;
        class29.method340(25, (byte) -58);
        class411.method2548(-39);
        if (!arg0) {
            System.gc();
        }
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(I)V")
    public final void method2741(int arg0) {
        field6351++;
        if (this.field6356) {
            return;
        }
        this.field6342 = new class3();
        this.field6341 = new class94();
        if (arg0 != 5000) {
            this.method2741(-102);
        }
    }

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "(I)I")
    public final int method2742(int arg0) throws IOException {
        if (arg0 == 5000) {
            field6349++;
            return this.field6356 ? 0 : this.field6342.read();
        } else {
            return -28;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)V")
    public final void method2743(byte arg0) throws IOException {
        field6346++;
        if (this.field6356) {
            return;
        }
        if (this.field6337) {
            this.field6337 = false;
            throw new IOException();
        } else if (arg0 < 104) {
            method2740(false);
        }
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Ljava/net/Socket;Lbd;)V")
    public class441(Socket arg0, class304 arg1) throws IOException {
        this.field6347 = arg0;
        this.field6336 = arg1;
        this.field6347.setSoTimeout(30000);
        this.field6347.setTcpNoDelay(true);
        this.field6342 = this.field6347.getInputStream();
        this.field6341 = this.field6347.getOutputStream();
    }
}
