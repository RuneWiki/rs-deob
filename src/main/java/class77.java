import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class77 implements Runnable {

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "Z")
    private boolean field1108 = false;

    @OriginalMember(owner = "client!ai", name = "r", descriptor = "Z")
    private boolean field1121 = false;

    @OriginalMember(owner = "client!ai", name = "u", descriptor = "I")
    private int field1124 = 0;

    @OriginalMember(owner = "client!ai", name = "s", descriptor = "I")
    private int field1122 = 0;

    @OriginalMember(owner = "client!ai", name = "p", descriptor = "Llj;")
    private class205 field1119;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "Ljava/net/Socket;")
    private Socket field1104;

    @OriginalMember(owner = "client!ai", name = "q", descriptor = "Ljava/io/InputStream;")
    private InputStream field1120;

    @OriginalMember(owner = "client!ai", name = "k", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1114;

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "Lqj;")
    public static class196 field1105 = class80.method502(")4l=", -48);

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "I")
    public static int field1113 = 0;

    @OriginalMember(owner = "client!ai", name = "m", descriptor = "[Lab;")
    public static class174[] field1116 = new class174[50];

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "I")
    public static int field1106;

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!ai", name = "l", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!ai", name = "n", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!ai", name = "o", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!ai", name = "v", descriptor = "I")
    public static int field1125;

    @OriginalMember(owner = "client!ai", name = "t", descriptor = "Lh;")
    private class139 field1123;

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "[B")
    private byte[] field1107;

    @OriginalMember(owner = "client!ai", name = "w", descriptor = "[I")
    public static int[] field1126;

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "[Lsc;")
    public static class212[] field1109;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)I")
    public final int method479(int arg0) throws IOException {
        field1115++;
        if (arg0 != 30000) {
            method485(101);
        }
        return this.field1121 ? 0 : this.field1120.available();
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(I)I")
    public final int method480(int arg0) throws IOException {
        int var2 = 49 % ((arg0 + 25) / 62);
        field1106++;
        return this.field1121 ? 0 : this.field1120.read();
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Z)V")
    public final void method481(boolean arg0) {
        field1110++;
        if (this.field1121) {
            return;
        }
        synchronized (this) {
            this.field1121 = arg0;
            this.notifyAll();
        }
        if (this.field1123 != null) {
            while (this.field1123.field2140 == 0) {
                class73.method464((byte) -102, 1L);
            }
            if (this.field1123.field2140 == 1) {
                try {
                    ((Thread) this.field1123.field2135).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field1123 = null;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(BII[B)V")
    public final void method482(byte arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field1111++;
        if (arg0 <= 34) {
            this.finalize();
        }
        if (this.field1121) {
            return;
        }
        while (arg2 > 0) {
            int var5 = this.field1120.read(arg3, arg1, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg2 -= var5;
            arg1 += var5;
        }
    }

    @OriginalMember(owner = "client!ai", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field1118++;
        this.method481(true);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lpe;III)V")
    public static final void method483(class258 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class23.field293) {
            class61 var4 = class249.field4410[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field818 != null && var4.field818.field1681.method1435()) {
                arg0.method1443(var4.field818.field1681, 128, 0, 0, true);
            }
        }
        if (arg3 < class23.field293) {
            class61 var5 = class249.field4410[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field818 != null && var5.field818.field1681.method1435()) {
                arg0.method1443(var5.field818.field1681, 0, 0, 128, true);
            }
        }
        if (arg2 < class23.field293 && arg3 < class110.field1566) {
            class61 var6 = class249.field4410[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field818 != null && var6.field818.field1681.method1435()) {
                arg0.method1443(var6.field818.field1681, 128, 0, 128, true);
            }
        }
        if (arg2 < class23.field293 && arg3 > 0) {
            class61 var7 = class249.field4410[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field818 != null && var7.field818.field1681.method1435()) {
                arg0.method1443(var7.field818.field1681, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "run", descriptor = "()V")
    public final void run() {
        field1112++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field1124 == this.field1122) {
                        if (this.field1121) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    if (this.field1122 >= this.field1124) {
                        var2 = this.field1122 - this.field1124;
                    } else {
                        var2 = 5000 - this.field1124;
                    }
                    var3 = this.field1124;
                }
                if (var2 > 0) {
                    try {
                        this.field1114.write(this.field1107, var3, var2);
                    } catch (IOException var9) {
                        this.field1108 = true;
                    }
                    this.field1124 = (this.field1124 + var2) % 5000;
                    try {
                        if (this.field1124 == this.field1122) {
                            this.field1114.flush();
                        }
                    } catch (IOException var8) {
                        this.field1108 = true;
                    }
                }
            }
            try {
                if (this.field1120 != null) {
                    this.field1120.close();
                }
                if (this.field1114 != null) {
                    this.field1114.close();
                }
                if (this.field1104 != null) {
                    this.field1104.close();
                }
            } catch (IOException var7) {
            }
            this.field1107 = null;
        } catch (Exception var12) {
            class165.method1054(35, null, var12);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "([BIII)V")
    public final void method484(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field1125++;
        if (this.field1121) {
            return;
        }
        if (this.field1108) {
            this.field1108 = false;
            throw new IOException();
        }
        if (this.field1107 == null) {
            this.field1107 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg1; var6++) {
                this.field1107[this.field1122] = arg0[arg2 + var6];
                this.field1122 = (this.field1122 + 1) % 5000;
                if ((this.field1124 + 4900) % 5000 == this.field1122) {
                    throw new IOException();
                }
            }
            if (this.field1123 == null) {
                this.field1123 = this.field1119.method1398(3, 0, this);
            }
            if (arg3 != 3) {
                method483(null, -31, -80, 77);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(I)V")
    public static void method485(int arg0) {
        field1109 = null;
        field1105 = null;
        if (arg0 != 5688) {
            field1113 = -7;
        }
        field1116 = null;
        field1126 = null;
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Ljava/net/Socket;Llj;)V")
    public class77(Socket arg0, class205 arg1) throws IOException {
        this.field1119 = arg1;
        this.field1104 = arg0;
        this.field1104.setSoTimeout(30000);
        this.field1104.setTcpNoDelay(true);
        this.field1120 = this.field1104.getInputStream();
        this.field1114 = this.field1104.getOutputStream();
    }
}
