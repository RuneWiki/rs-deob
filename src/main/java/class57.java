import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class57 implements Runnable {

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "I")
    private int field1044 = 0;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "Z")
    private boolean field1043 = false;

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "I")
    private int field1046 = 0;

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "Z")
    private boolean field1047 = false;

    @OriginalMember(owner = "client!ga", name = "l", descriptor = "Lma;")
    private class109 field1054;

    @OriginalMember(owner = "client!ga", name = "o", descriptor = "Ljava/net/Socket;")
    private Socket field1057;

    @OriginalMember(owner = "client!ga", name = "j", descriptor = "Ljava/io/InputStream;")
    private InputStream field1052;

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1048;

    @OriginalMember(owner = "client!ga", name = "n", descriptor = "Lcb;")
    public static class22 field1056 = new class22();

    @OriginalMember(owner = "client!ga", name = "v", descriptor = "I")
    public static int field1064 = 0;

    @OriginalMember(owner = "client!ga", name = "w", descriptor = "Lsg;")
    public static class169 field1065 = class165.method1060("logo", 1536);

    @OriginalMember(owner = "client!ga", name = "z", descriptor = "Lsg;")
    private static class169 field1068 = class165.method1060("Loaded input handler", 1536);

    @OriginalMember(owner = "client!ga", name = "A", descriptor = "Lsg;")
    private static class169 field1069 = class165.method1060("New User", 1536);

    @OriginalMember(owner = "client!ga", name = "x", descriptor = "Lsg;")
    public static class169 field1066 = field1069;

    @OriginalMember(owner = "client!ga", name = "B", descriptor = "Lsg;")
    public static class169 field1070 = class165.method1060("AUS", 1536);

    @OriginalMember(owner = "client!ga", name = "y", descriptor = "Lsg;")
    public static class169 field1067 = field1068;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "I")
    public static int field1045;

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "I")
    public static int field1049;

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!ga", name = "k", descriptor = "I")
    public static int field1053;

    @OriginalMember(owner = "client!ga", name = "m", descriptor = "I")
    public static int field1055;

    @OriginalMember(owner = "client!ga", name = "p", descriptor = "I")
    public static int field1058;

    @OriginalMember(owner = "client!ga", name = "r", descriptor = "I")
    public static int field1060;

    @OriginalMember(owner = "client!ga", name = "s", descriptor = "I")
    public static int field1061;

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "Lsh;")
    private class170 field1051;

    @OriginalMember(owner = "client!ga", name = "t", descriptor = "Lke;")
    public static class95 field1062;

    @OriginalMember(owner = "client!ga", name = "q", descriptor = "[B")
    private byte[] field1059;

    @OriginalMember(owner = "client!ga", name = "u", descriptor = "[[B")
    public static byte[][] field1063;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZB)V")
    public static final void method356(boolean arg0, byte arg1) {
        class37.method240((byte) -99);
        field1055++;
        if (arg1 >= -83) {
            field1066 = null;
        }
        class137.field2558++;
        if (class137.field2558 < 50 && !arg0) {
            return;
        }
        class137.field2558 = 0;
        if (class171.field3308 || class2.field37 == null) {
            return;
        }
        class169.field3245++;
        class141.field2621.method1024(46, (byte) -94);
        try {
            class2.field37.method361(0, class141.field2621.field2346, -1, class141.field2621.field2325);
            class141.field2621.field2346 = 0;
        } catch (IOException var2) {
            class171.field3308 = true;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(II[BI)V")
    public final void method357(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field1049++;
        if (this.field1047) {
            return;
        }
        if (arg0 > -54) {
            field1069 = null;
        }
        while (arg3 > 0) {
            int var5 = this.field1052.read(arg2, arg1, arg3);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 += var5;
            arg3 -= var5;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)I")
    public final int method358(int arg0) throws IOException {
        if (arg0 != -10633) {
            field1070 = null;
        }
        field1045++;
        return this.field1047 ? 0 : this.field1052.available();
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)V")
    public final void method359(byte arg0) {
        field1050++;
        if (this.field1047) {
            return;
        }
        synchronized (this) {
            this.field1047 = true;
            if (arg0 < 45) {
                return;
            }
            this.notifyAll();
        }
        if (this.field1051 != null) {
            while (this.field1051.field3296 == 0) {
                client.method203(1L, (byte) -89);
            }
            if (this.field1051.field3296 == 1) {
                try {
                    ((Thread) this.field1051.field3299).join();
                } catch (InterruptedException var5) {
                }
            }
        }
        this.field1051 = null;
    }

    @OriginalMember(owner = "client!ga", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field1046 == this.field1044) {
                            if (this.field1047) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        if (this.field1046 >= this.field1044) {
                            var2 = this.field1046 - this.field1044;
                        } else {
                            var2 = 5000 - this.field1044;
                        }
                        var3 = this.field1044;
                    }
                    if (var2 <= 0) {
                        continue;
                    }
                    try {
                        this.field1048.write(this.field1059, var3, var2);
                    } catch (IOException var9) {
                        this.field1043 = true;
                    }
                    this.field1044 = (this.field1044 + var2) % 5000;
                    try {
                        if (this.field1046 == this.field1044) {
                            this.field1048.flush();
                        }
                    } catch (IOException var8) {
                        this.field1043 = true;
                    }
                    continue;
                }
                try {
                    if (this.field1052 != null) {
                        this.field1052.close();
                    }
                    if (this.field1048 != null) {
                        this.field1048.close();
                    }
                    if (this.field1057 != null) {
                        this.field1057.close();
                    }
                } catch (IOException var7) {
                }
                this.field1059 = null;
                break;
            }
        } catch (Exception var12) {
            class21.method142(85, null, var12);
        }
        field1060++;
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(B)V")
    public static void method360(byte arg0) {
        field1062 = null;
        field1070 = null;
        field1063 = null;
        field1066 = null;
        field1065 = null;
        field1067 = null;
        field1069 = null;
        if (arg0 < -81) {
            field1068 = null;
            field1056 = null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(III[B)V")
    public final void method361(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field1058++;
        if (this.field1047) {
            return;
        }
        if (this.field1043) {
            this.field1043 = false;
            throw new IOException();
        }
        if (this.field1059 == null) {
            this.field1059 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg1; var6++) {
                this.field1059[this.field1046] = arg3[arg0 + var6];
                this.field1046 = (this.field1046 + 1) % 5000;
                if ((this.field1044 + 4900) % 5000 == this.field1046) {
                    throw new IOException();
                }
            }
            if (arg2 != -1) {
                field1063 = null;
            }
            if (this.field1051 == null) {
                this.field1051 = this.field1054.method676(0, this, 3);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!ga", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field1061++;
        this.method359((byte) 114);
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)I")
    public final int method362(int arg0) throws IOException {
        field1053++;
        if (this.field1047) {
            return 0;
        } else if (arg0 >= -8) {
            return -30;
        } else {
            return this.field1052.read();
        }
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Ljava/net/Socket;Lma;)V")
    public class57(Socket arg0, class109 arg1) throws IOException {
        this.field1054 = arg1;
        this.field1057 = arg0;
        this.field1057.setSoTimeout(30000);
        this.field1057.setTcpNoDelay(true);
        this.field1052 = this.field1057.getInputStream();
        this.field1048 = this.field1057.getOutputStream();
    }
}
