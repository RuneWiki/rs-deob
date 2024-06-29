import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class68 implements Runnable {

    @OriginalMember(owner = "client!ga", name = "n", descriptor = "I")
    private int field1131 = 0;

    @OriginalMember(owner = "client!ga", name = "r", descriptor = "I")
    private int field1135 = 0;

    @OriginalMember(owner = "client!ga", name = "x", descriptor = "Z")
    private boolean field1141 = false;

    @OriginalMember(owner = "client!ga", name = "B", descriptor = "Z")
    private boolean field1145 = false;

    @OriginalMember(owner = "client!ga", name = "t", descriptor = "Lhf;")
    private class83 field1137;

    @OriginalMember(owner = "client!ga", name = "A", descriptor = "Ljava/net/Socket;")
    private Socket field1144;

    @OriginalMember(owner = "client!ga", name = "y", descriptor = "Ljava/io/InputStream;")
    private InputStream field1142;

    @OriginalMember(owner = "client!ga", name = "z", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1143;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "[Log;")
    public static class159[] field1120 = new class159[2048];

    @OriginalMember(owner = "client!ga", name = "m", descriptor = "[I")
    public static int[] field1130 = new int[5];

    @OriginalMember(owner = "client!ga", name = "j", descriptor = "Lmb;")
    private static class132 field1127 = class166.method1092("Take", 112);

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "Lmb;")
    private static class132 field1124 = class166.method1092("Connecting to server)3)3)3", 111);

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "Lmb;")
    private static class132 field1121 = class166.method1092("Click to switch", 113);

    @OriginalMember(owner = "client!ga", name = "s", descriptor = "[Lmb;")
    public static class132[] field1136 = new class132[200];

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "Lmb;")
    public static class132 field1119 = field1124;

    @OriginalMember(owner = "client!ga", name = "k", descriptor = "Lmb;")
    public static class132 field1128 = field1121;

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "Lmb;")
    public static class132 field1126 = field1127;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "I")
    public static int field1122;

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "I")
    public static int field1123;

    @OriginalMember(owner = "client!ga", name = "l", descriptor = "I")
    public static int field1129;

    @OriginalMember(owner = "client!ga", name = "o", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "client!ga", name = "p", descriptor = "I")
    public static int field1133;

    @OriginalMember(owner = "client!ga", name = "u", descriptor = "I")
    public static int field1138;

    @OriginalMember(owner = "client!ga", name = "v", descriptor = "I")
    public static int field1139;

    @OriginalMember(owner = "client!ga", name = "w", descriptor = "I")
    public static int field1140;

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "Lla;")
    private class120 field1125;

    @OriginalMember(owner = "client!ga", name = "q", descriptor = "[B")
    private byte[] field1134;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "([BBII)V")
    public final void method418(byte[] arg0, byte arg1, int arg2, int arg3) throws IOException {
        field1118++;
        if (this.field1145) {
            return;
        }
        while (arg3 > 0) {
            int var5 = this.field1142.read(arg0, arg2, arg3);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg2 += var5;
            arg3 -= var5;
        }
        if (arg1 < 94) {
            this.field1144 = null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I[BII)V")
    public final void method419(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field1140++;
        if (arg0 >= -43 || this.field1145) {
            return;
        }
        if (this.field1141) {
            this.field1141 = false;
            throw new IOException();
        }
        if (this.field1134 == null) {
            this.field1134 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg3; var6++) {
                this.field1134[this.field1131] = arg1[arg2 + var6];
                this.field1131 = (this.field1131 + 1) % 5000;
                if ((this.field1135 + 4900) % 5000 == this.field1131) {
                    throw new IOException();
                }
            }
            if (this.field1125 == null) {
                this.field1125 = this.field1137.method505(this, 3, -4263);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Z)I")
    public final int method420(boolean arg0) throws IOException {
        field1129++;
        if (this.field1145) {
            return 0;
        } else {
            if (!arg0) {
                field1120 = null;
            }
            return this.field1142.read();
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)V")
    public static void method421(byte arg0) {
        field1124 = null;
        field1120 = null;
        field1127 = null;
        field1121 = null;
        if (arg0 != -28) {
            field1126 = null;
        }
        field1119 = null;
        field1130 = null;
        field1136 = null;
        field1128 = null;
        field1126 = null;
    }

    @OriginalMember(owner = "client!ga", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method423(true);
        field1123++;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "([BB)V")
    public static final void method422(byte[] arg0, byte arg1) {
        field1132++;
        class112 var2 = new class112(arg0);
        int var3 = var2.method739(-127);
        if (arg1 != 52) {
            return;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class100 var5 = new class100();
            class132 var6 = var2.method720((byte) 56);
            var5.field1880 = var2.method739(-124);
            var5.field1874 = var2.method739(27);
            var5.field1875 = var2.method716(-1308);
            var5.field1877 = var6.method868((byte) 121, 47, 32);
            var5.field1883 = var6.method863((byte) -93, 47);
            class138.field2584.method120(arg1 ^ 0x34, var5);
        }
    }

    @OriginalMember(owner = "client!ga", name = "run", descriptor = "()V")
    public final void run() {
        field1133++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field1135 == this.field1131) {
                        if (this.field1145) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    if (this.field1131 < this.field1135) {
                        var2 = 5000 - this.field1135;
                    } else {
                        var2 = this.field1131 - this.field1135;
                    }
                    var3 = this.field1135;
                }
                if (var2 > 0) {
                    try {
                        this.field1143.write(this.field1134, var3, var2);
                    } catch (IOException var9) {
                        this.field1141 = true;
                    }
                    this.field1135 = (this.field1135 + var2) % 5000;
                    try {
                        if (this.field1135 == this.field1131) {
                            this.field1143.flush();
                        }
                    } catch (IOException var8) {
                        this.field1141 = true;
                    }
                }
            }
            try {
                if (this.field1142 != null) {
                    this.field1142.close();
                }
                if (this.field1143 != null) {
                    this.field1143.close();
                }
                if (this.field1144 != null) {
                    this.field1144.close();
                }
            } catch (IOException var7) {
            }
            this.field1134 = null;
        } catch (Exception var12) {
            class92.method571(null, var12, 63);
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(Z)V")
    public final void method423(boolean arg0) {
        field1122++;
        if (this.field1145) {
            return;
        }
        synchronized (this) {
            this.field1145 = arg0;
            this.notifyAll();
        }
        if (this.field1125 != null) {
            while (this.field1125.field2264 == 0) {
                class130.method856(1, 1L);
            }
            if (this.field1125.field2264 == 1) {
                try {
                    ((Thread) this.field1125.field2269).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field1125 = null;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)I")
    public final int method424(int arg0) throws IOException {
        field1138++;
        if (this.field1145) {
            return 0;
        } else if (arg0 == 5000) {
            return this.field1142.available();
        } else {
            return -79;
        }
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Ljava/net/Socket;Lhf;)V")
    public class68(Socket arg0, class83 arg1) throws IOException {
        this.field1137 = arg1;
        this.field1144 = arg0;
        this.field1144.setSoTimeout(30000);
        this.field1144.setTcpNoDelay(true);
        this.field1142 = this.field1144.getInputStream();
        this.field1143 = this.field1144.getOutputStream();
    }
}
