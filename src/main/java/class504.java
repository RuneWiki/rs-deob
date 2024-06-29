import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iea")
public class class504 implements Runnable {

    @OriginalMember(owner = "client!iea", name = "t", descriptor = "I")
    private int field7295 = 0;

    @OriginalMember(owner = "client!iea", name = "g", descriptor = "I")
    private int field7300 = 0;

    @OriginalMember(owner = "client!iea", name = "m", descriptor = "Z")
    private boolean field7314 = false;

    @OriginalMember(owner = "client!iea", name = "v", descriptor = "Z")
    private boolean field7316 = false;

    @OriginalMember(owner = "client!iea", name = "j", descriptor = "Lmca;")
    private class33 field7306;

    @OriginalMember(owner = "client!iea", name = "u", descriptor = "Ljava/net/Socket;")
    private Socket field7299;

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "Ljava/io/InputStream;")
    private InputStream field7302;

    @OriginalMember(owner = "client!iea", name = "i", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field7307;

    @OriginalMember(owner = "client!iea", name = "p", descriptor = "I")
    private int field7313;

    @OriginalMember(owner = "client!iea", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7317 = new String[] { method3805(method3804("%G\u001e\u00111d")), method3805(method3804("7\fQ\u0011\u000e")), method3805(method3804("%G\u001e\u0011O%L\u0016KMd")), method3805(method3804("\"W\u0013S")), method3805(method3804("%G\u001e\u00112d")), method3805(method3804("%G\u001e\u0011;d")), method3805(method3804("%G\u001e\u0011\u00019LW")), method3805(method3804("%G\u001e\u00117d")), method3805(method3804("%G\u001e\u00115d")), method3805(method3804("%G\u001e\u00114d")), method3805(method3804("%G\u001e\u00110d")), method3805(method3804("%G\u001e\u0011:d")), method3805(method3804("%G\u001e\u00116d")), method3805(method3804("%G\u001e\u0011\u0015%L\u001eS\u001a6GW")) };

    @OriginalMember(owner = "client!iea", name = "l", descriptor = "[Leba;")
    public static class614[] field7310 = new class614[5];

    @OriginalMember(owner = "client!iea", name = "n", descriptor = "I")
    public static int field7294;

    @OriginalMember(owner = "client!iea", name = "h", descriptor = "I")
    public static int field7296;

    @OriginalMember(owner = "client!iea", name = "f", descriptor = "I")
    public static int field7297;

    @OriginalMember(owner = "client!iea", name = "q", descriptor = "I")
    public static int field7301;

    @OriginalMember(owner = "client!iea", name = "r", descriptor = "I")
    public static int field7303;

    @OriginalMember(owner = "client!iea", name = "o", descriptor = "I")
    public static int field7304;

    @OriginalMember(owner = "client!iea", name = "e", descriptor = "I")
    public static int field7305;

    @OriginalMember(owner = "client!iea", name = "c", descriptor = "I")
    public static int field7308;

    @OriginalMember(owner = "client!iea", name = "k", descriptor = "I")
    public static int field7309;

    @OriginalMember(owner = "client!iea", name = "s", descriptor = "I")
    public static int field7312;

    @OriginalMember(owner = "client!iea", name = "w", descriptor = "I")
    public static int field7315;

    @OriginalMember(owner = "client!iea", name = "b", descriptor = "Lvd;")
    private class42 field7311;

    @OriginalMember(owner = "client!iea", name = "d", descriptor = "[B")
    private byte[] field7298;

    static {
        for (int var0 = 0; var0 < field7310.length; var0++) {
            field7310[var0] = new class614();
        }
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(I)V", line = 3)
    public final void method3795(int arg0) {
        try {
            field7309++;
            if (!this.field7316) {
                if (arg0 < 14) {
                    this.field7314 = true;
                }
                synchronized (this) {
                    this.field7316 = true;
                    this.notifyAll();
                }
                if (this.field7311 != null) {
                    while (this.field7311.field503 == 0) {
                        class151.method1269(false, 1L);
                    }
                    if (this.field7311.field503 == 1) {
                        try {
                            ((Thread) this.field7311.field499).join();
                        } catch (InterruptedException var4) {
                        }
                    }
                }
                this.field7311 = null;
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field7317[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!iea", name = "e", descriptor = "(I)I", line = 38)
    public final int method3796(int arg0) throws IOException {
        try {
            if (arg0 > -108) {
                return -82;
            } else {
                field7304++;
                return this.field7316 ? 0 : this.field7302.read();
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field7317[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!iea", name = "c", descriptor = "(I)V", line = 56)
    public final void method3797(int arg0) throws IOException {
        try {
            field7312++;
            int var2 = -95 % ((arg0 + 33) / 33);
            if (!this.field7316 && this.field7314) {
                this.field7314 = false;
                throw new IOException();
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field7317[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!iea", name = "b", descriptor = "(I)I", line = 78)
    public final int method3798(int arg0) throws IOException {
        try {
            field7303++;
            if (this.field7316) {
                return 0;
            } else if (arg0 == 30000) {
                return this.field7302.available();
            } else {
                return 89;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field7317[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(I[BIB)V", line = 99)
    public final void method3799(int arg0, byte[] arg1, int arg2, byte arg3) throws IOException {
        try {
            if (arg3 < -44) {
                field7308++;
                if (!this.field7316) {
                    if (this.field7314) {
                        this.field7314 = false;
                        throw new IOException();
                    }
                    if (this.field7298 == null) {
                        this.field7298 = new byte[this.field7313];
                    }
                    synchronized (this) {
                        for (int var6 = 0; var6 < arg2; var6++) {
                            this.field7298[this.field7300] = arg1[arg0 + var6];
                            this.field7300 = (this.field7300 + 1) % this.field7313;
                            if (this.field7300 == ((this.field7313 + this.field7295 - 100) % this.field7313)) {
                                throw new IOException();
                            }
                        }
                        if (this.field7311 == null) {
                            this.field7311 = this.field7306.method227(false, this, 3);
                        }
                        this.notifyAll();
                    }
                }
            }
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field7317[4] + arg0 + ',' + (arg1 == null ? field7317[3] : field7317[1]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "([BIZI)V", line = 153)
    public final void method3800(byte[] arg0, int arg1, boolean arg2, int arg3) throws IOException {
        try {
            field7297++;
            if (!this.field7316) {
                while (arg1 > 0) {
                    int var5 = this.field7302.read(arg0, arg3, arg1);
                    if (var5 <= 0) {
                        throw new EOFException();
                    }
                    arg1 -= var5;
                    arg3 += var5;
                }
                if (arg2) {
                    method3801(-105, (byte) 67, 54);
                }
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field7317[9] + (arg0 == null ? field7317[3] : field7317[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!iea", name = "finalize", descriptor = "()V", line = 178)
    protected final void finalize() {
        try {
            this.method3795(63);
            field7296++;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field7317[13] + ')');
        }
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(IBI)V", line = 190)
    public static final void method3801(int arg0, byte arg1, int arg2) {
        try {
            field7305++;
            if (class203.method1806(false)) {
                class591.field8684 = arg0;
                if (class472.field6852 != arg2) {
                    class76.field872 = "";
                }
                class472.field6852 = arg2;
                if (arg1 == 95) {
                    class86.method728(6, (byte) -96);
                }
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field7317[10] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!iea", name = "<init>", descriptor = "(Ljava/net/Socket;Lmca;I)V", line = 340)
    public class504(Socket arg0, class33 arg1, int arg2) throws IOException {
        try {
            this.field7306 = arg1;
            this.field7299 = arg0;
            this.field7299.setSoTimeout(30000);
            this.field7299.setTcpNoDelay(true);
            this.field7302 = this.field7299.getInputStream();
            this.field7307 = this.field7299.getOutputStream();
            this.field7313 = arg2;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field7317[2] + (arg0 == null ? field7317[3] : field7317[1]) + ',' + (arg1 == null ? field7317[3] : field7317[1]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!iea", name = "run", descriptor = "()V", line = 223)
    public final void run() {
        try {
            field7294++;
            try {
                while (true) {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field7300 == this.field7295) {
                            if (this.field7316) {
                                break;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var11) {
                            }
                        }
                        var2 = this.field7295;
                        if (this.field7300 >= this.field7295) {
                            var3 = this.field7300 - this.field7295;
                        } else {
                            var3 = this.field7313 - this.field7295;
                        }
                    }
                    if (var3 > 0) {
                        try {
                            this.field7307.write(this.field7298, var2, var3);
                        } catch (IOException var10) {
                            this.field7314 = true;
                        }
                        this.field7295 = (this.field7295 + var3) % this.field7313;
                        try {
                            if (this.field7300 == this.field7295) {
                                this.field7307.flush();
                            }
                        } catch (IOException var9) {
                            this.field7314 = true;
                        }
                    }
                }
                try {
                    if (this.field7302 != null) {
                        this.field7302.close();
                    }
                    if (this.field7307 != null) {
                        this.field7307.close();
                    }
                    if (this.field7299 != null) {
                        this.field7299.close();
                    }
                } catch (IOException var8) {
                }
                this.field7298 = null;
            } catch (Exception var13) {
                class618.method4603((byte) 123, null, var13);
            }
        } catch (RuntimeException var14) {
            throw class759.method5498(var14, field7317[6] + ')');
        }
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(B)V", line = 299)
    public final void method3802(byte arg0) {
        try {
            field7301++;
            if (!this.field7316) {
                this.field7302 = new class639();
                this.field7307 = new class174();
                if (arg0 >= -41) {
                    method3801(-104, (byte) -20, 76);
                }
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field7317[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!iea", name = "d", descriptor = "(I)V", line = 328)
    public static void method3803(int arg0) {
        try {
            field7310 = null;
            if (arg0 != 0) {
                method3801(79, (byte) -115, -36);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field7317[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!iea", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3804(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x73);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!iea", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3805(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 76;
                    break;
                case 1:
                    var10005 = 34;
                    break;
                case 2:
                    var10005 = 127;
                    break;
                case 3:
                    var10005 = 63;
                    break;
                default:
                    var10005 = 115;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
