import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class157 implements Runnable {

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "Z")
    private boolean field3030 = false;

    @OriginalMember(owner = "client!ph", name = "t", descriptor = "I")
    private int field3037 = 0;

    @OriginalMember(owner = "client!ph", name = "z", descriptor = "Z")
    private boolean field3043 = false;

    @OriginalMember(owner = "client!ph", name = "y", descriptor = "I")
    private int field3042 = 0;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "Lt;")
    private class189 field3018;

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "Ljava/net/Socket;")
    private Socket field3027;

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "Ljava/io/InputStream;")
    private InputStream field3025;

    @OriginalMember(owner = "client!ph", name = "o", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field3032;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "Lob;")
    public static class141 field3021 = class175.method1195(40, "Startseite auf (WSpielkonto wiederherstellen(W)3");

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "Lob;")
    public static class141 field3022 = class175.method1195(40, " <col=00ff80>");

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "I")
    public static int field3028 = 0;

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "[S")
    public static short[] field3026 = new short[500];

    @OriginalMember(owner = "client!ph", name = "u", descriptor = "Lob;")
    public static class141 field3038 = class175.method1195(40, "(U0a )2 non)2existant gosub script)2num: ");

    @OriginalMember(owner = "client!ph", name = "p", descriptor = "I")
    public static int field3033 = 0;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
    public static int field3019;

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "I")
    public static int field3024;

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!ph", name = "n", descriptor = "I")
    public static int field3031;

    @OriginalMember(owner = "client!ph", name = "q", descriptor = "I")
    public static int field3034;

    @OriginalMember(owner = "client!ph", name = "r", descriptor = "I")
    public static int field3035;

    @OriginalMember(owner = "client!ph", name = "s", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!ph", name = "w", descriptor = "I")
    public static int field3040;

    @OriginalMember(owner = "client!ph", name = "x", descriptor = "I")
    public static int field3041;

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "Lfa;")
    public static class52 field3023;

    @OriginalMember(owner = "client!ph", name = "v", descriptor = "Lfd;")
    private class55 field3039;

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "[B")
    private byte[] field3020;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V")
    public static void method1088(int arg0) {
        field3022 = null;
        int var1 = 122 % ((arg0 + 9) / 63);
        field3038 = null;
        field3021 = null;
        field3023 = null;
        field3026 = null;
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(I)V")
    public final void method1089(int arg0) {
        field3019++;
        if (this.field3043) {
            return;
        }
        synchronized (this) {
            if (arg0 != -2) {
                this.run();
            }
            this.field3043 = true;
            this.notifyAll();
        }
        if (this.field3039 != null) {
            while (this.field3039.field1089 == 0) {
                class93.method638(1L, (byte) -8);
            }
            if (this.field3039.field1089 == 1) {
                try {
                    ((Thread) this.field3039.field1090).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field3039 = null;
    }

    @OriginalMember(owner = "client!ph", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method1089(-2);
        field3024++;
    }

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "(I)I")
    public final int method1090(int arg0) throws IOException {
        field3031++;
        if (this.field3043) {
            return 0;
        } else {
            int var2 = -68 % ((arg0 + 74) / 45);
            return this.field3025.read();
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)I")
    public static int method1091(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lob;B)Z")
    public static final boolean method1092(class141 arg0, byte arg1) {
        field3035++;
        if (arg0 == null) {
            return false;
        } else if (arg1 == -115) {
            for (int var2 = 0; var2 < class88.field1750; var2++) {
                if (arg0.method933((byte) -66, class188.field3640[var2])) {
                    return true;
                }
            }
            return arg0.method933((byte) -111, class114.field2176.field773);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I[BII)V")
    public final void method1093(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field3034++;
        if (this.field3043) {
            return;
        }
        if (this.field3030) {
            this.field3030 = false;
            throw new IOException();
        }
        if (this.field3020 == null) {
            this.field3020 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg2; var6++) {
                this.field3020[this.field3042] = arg1[arg3 + var6];
                this.field3042 = (this.field3042 + 1) % 5000;
                if ((this.field3037 + 4900) % 5000 == this.field3042) {
                    throw new IOException();
                }
            }
            if (arg0 != 39) {
                field3028 = 106;
            }
            if (this.field3039 == null) {
                this.field3039 = this.field3018.method1256(3360, 3, this);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IB[BI)V")
    public final void method1094(int arg0, byte arg1, byte[] arg2, int arg3) throws IOException {
        int var5 = 112 % ((-arg1 - 67) / 55);
        field3029++;
        if (this.field3043) {
            return;
        }
        while (arg0 > 0) {
            int var6 = this.field3025.read(arg2, arg3, arg0);
            if (var6 <= 0) {
                throw new EOFException();
            }
            arg0 -= var6;
            arg3 += var6;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZI)Loh;")
    public static final class147 method1095(boolean arg0, int arg1) {
        field3036++;
        class147 var2 = (class147) class29.field558.method1383((long) arg1, (byte) -83);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class96.field1913.method1065((byte) -105, 0, arg1);
        if (var3 == null) {
            return null;
        }
        if (arg0) {
            field3022 = null;
        }
        class147 var4 = new class147();
        class146 var5 = new class146(var3);
        var5.field2865 = var5.field2859.length - 2;
        int var6 = var5.method1007(79);
        int var7 = var5.field2859.length - var6 - 2 - 12;
        var5.field2865 = var7;
        int var8 = var5.method979(1029109968);
        var4.field2872 = var5.method1007(70);
        var4.field2866 = var5.method1007(59);
        var4.field2877 = var5.method1007(81);
        var4.field2878 = var5.method1007(125);
        int var9 = var5.method991(255);
        if (var9 > 0) {
            var4.field2870 = new class123[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = var5.method1007(56);
                class123 var12 = new class123(class167.method1148(var11, 25920));
                var4.field2870[var10] = var12;
                while (var11-- > 0) {
                    int var13 = var5.method979(1029109968);
                    int var14 = var5.method979(1029109968);
                    var12.method797(new class110(var14), (long) var13, true);
                }
            }
        }
        var5.field2865 = 0;
        int var15 = 0;
        var4.field2867 = var5.method984(114);
        var4.field2869 = new int[var8];
        var4.field2874 = new int[var8];
        var4.field2873 = new class141[var8];
        while (var5.field2865 < var7) {
            int var16 = var5.method1007(111);
            if (var16 == 3) {
                var4.field2873[var15] = var5.method1013(-19405);
            } else if (var16 >= 100 || var16 == 21 || var16 == 38 || var16 == 39) {
                var4.field2869[var15] = var5.method991(255);
            } else {
                var4.field2869[var15] = var5.method979(1029109968);
            }
            var4.field2874[var15++] = var16;
        }
        class29.field558.method1378(var4, (byte) -120, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!ph", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field3042 == this.field3037) {
                            if (this.field3043) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        if (this.field3037 <= this.field3042) {
                            var2 = this.field3042 - this.field3037;
                        } else {
                            var2 = 5000 - this.field3037;
                        }
                        var3 = this.field3037;
                    }
                    if (var2 <= 0) {
                        continue;
                    }
                    try {
                        this.field3032.write(this.field3020, var3, var2);
                    } catch (IOException var9) {
                        this.field3030 = true;
                    }
                    this.field3037 = (this.field3037 + var2) % 5000;
                    try {
                        if (this.field3042 == this.field3037) {
                            this.field3032.flush();
                        }
                    } catch (IOException var8) {
                        this.field3030 = true;
                    }
                    continue;
                }
                try {
                    if (this.field3025 != null) {
                        this.field3025.close();
                    }
                    if (this.field3032 != null) {
                        this.field3032.close();
                    }
                    if (this.field3027 != null) {
                        this.field3027.close();
                    }
                } catch (IOException var7) {
                }
                this.field3020 = null;
                break;
            }
        } catch (Exception var12) {
            class170.method1162(null, var12, (byte) 124);
        }
        field3040++;
    }

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "(I)I")
    public final int method1096(int arg0) throws IOException {
        field3041++;
        if (this.field3043) {
            return 0;
        } else {
            if (arg0 != 0) {
                this.field3032 = null;
            }
            return this.field3025.available();
        }
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Ljava/net/Socket;Lt;)V")
    public class157(Socket arg0, class189 arg1) throws IOException {
        this.field3018 = arg1;
        this.field3027 = arg0;
        this.field3027.setSoTimeout(30000);
        this.field3027.setTcpNoDelay(true);
        this.field3025 = this.field3027.getInputStream();
        this.field3032 = this.field3027.getOutputStream();
    }
}
