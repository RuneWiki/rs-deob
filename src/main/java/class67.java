import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class67 implements Runnable {

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
    private int field1054 = 0;

    @OriginalMember(owner = "client!ec", name = "r", descriptor = "I")
    private int field1071 = 0;

    @OriginalMember(owner = "client!ec", name = "v", descriptor = "Z")
    private boolean field1075 = false;

    @OriginalMember(owner = "client!ec", name = "w", descriptor = "Z")
    private boolean field1076 = false;

    @OriginalMember(owner = "client!ec", name = "l", descriptor = "Ljava/net/Socket;")
    private Socket field1065;

    @OriginalMember(owner = "client!ec", name = "x", descriptor = "Lwe;")
    private class92 field1077;

    @OriginalMember(owner = "client!ec", name = "s", descriptor = "Ljava/io/InputStream;")
    private InputStream field1072;

    @OriginalMember(owner = "client!ec", name = "m", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1066;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "Lph;")
    public static class229 field1060 = class266.method1858("Schlie-8en", 0);

    @OriginalMember(owner = "client!ec", name = "q", descriptor = "Z")
    public static volatile boolean field1070 = true;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "Lja;")
    public static class143 field1062 = new class143(64);

    @OriginalMember(owner = "client!ec", name = "y", descriptor = "[J")
    public static long[] field1078 = new long[256];

    @OriginalMember(owner = "client!ec", name = "z", descriptor = "Lph;")
    public static class229 field1079;

    @OriginalMember(owner = "client!ec", name = "A", descriptor = "Lph;")
    public static class229 field1080;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
    public static int field1055;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
    public static int field1056;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
    public static int field1058;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
    public static int field1059;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
    public static int field1061;

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "I")
    public static int field1064;

    @OriginalMember(owner = "client!ec", name = "n", descriptor = "I")
    public static int field1067;

    @OriginalMember(owner = "client!ec", name = "o", descriptor = "I")
    public static int field1068;

    @OriginalMember(owner = "client!ec", name = "p", descriptor = "I")
    public static int field1069;

    @OriginalMember(owner = "client!ec", name = "u", descriptor = "I")
    public static int field1074;

    @OriginalMember(owner = "client!ec", name = "t", descriptor = "Lii;")
    private class247 field1073;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "[B")
    private byte[] field1057;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)I", line = 11)
    public final int method525(boolean arg0) throws IOException {
        if (arg0) {
            method528(119);
        }
        field1059++;
        return this.field1075 ? 0 : this.field1072.available();
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V", line = 27)
    public static final void method526(int arg0) {
        int var1 = 0;
        if (arg0 != 128) {
            field1060 = (class229) null;
        }
        while (class313.field5278 > var1) {
            int var2 = class105.field1782[var1];
            class217 var3 = class187.field3035[var2];
            int var4 = class88.field1497.method1178(arg0 ^ 0x88);
            if ((var4 & 0x80) != 0) {
                var3.field5134 = class88.field1497.method1190(0);
                var3.field5132 = 100;
            }
            if ((var4 & 0x40) != 0) {
                var3.field5118 = class88.field1497.method1187((byte) -99);
                if (var3.field5118 == 65535) {
                    var3.field5118 = -1;
                }
            }
            if ((var4 & 0x20) != 0) {
                if (var3.field3559.method2117(false)) {
                    class108.method826(var3, (byte) 119);
                }
                var3.method1523((byte) 119, class25.method155(class88.field1497.method1183(2), arg0 ^ 0xFFFFFF17));
                var3.method2058((byte) -90, var3.field3559.field5304);
                var3.field5114 = var3.field3559.field5276;
                var3.field5131 = var3.field3559.field5289;
                var3.field5160 = var3.field3559.field5302;
                var3.field5161 = var3.field3559.field5319;
                var3.field5153 = var3.field3559.field5292;
                var3.field5146 = var3.field3559.field5317;
                var3.field5142 = var3.field3559.field5288;
                var3.field5108 = var3.field3559.field5312;
                if (var3.field3559.method2117(false)) {
                    class250.method1756(var3.field5104[0], class298.field4849, false, 0, (class209) null, (class83) null, var3.field5159[0], var3);
                }
            }
            if ((var4 & 0x1) != 0) {
                var3.field5112 = class88.field1497.method1187((byte) -99);
                int var5 = class88.field1497.method1171(true);
                if (var3.field5112 == 65535) {
                    var3.field5112 = -1;
                }
                var3.field5097 = 0;
                var3.field5119 = 0;
                var3.field5137 = var5 >> 16;
                var3.field5107 = (var5 & 0xFFFF) + class319.field5393;
                if (var3.field5107 > class319.field5393) {
                    var3.field5119 = -1;
                }
                if (var3.field5112 != -1 && class319.field5393 == var3.field5107) {
                    int var6 = class259.method1799(20527, var3.field5112).field4508;
                    if (var6 != -1) {
                        class312 var7 = class53.method362((byte) -117, var6);
                        if (var7 != null && var7.field5226 != null) {
                            class176.method1265(arg0 - 220, false, 0, var3.field5168, var7, var3.field5147);
                        }
                    }
                }
            }
            if ((var4 & 0x8) != 0) {
                int var8 = class88.field1497.method1193((byte) 33);
                int var9 = class88.field1497.method1199(false);
                var3.method2071(class319.field5393, 0, var8, var9);
            }
            if ((var4 & 0x2) != 0) {
                int var10 = class88.field1497.method1187((byte) -99);
                int var11 = class88.field1497.method1199(false);
                if (var10 == 65535) {
                    var10 = -1;
                }
                class316.method2141(var11, arg0 - 128, var3, var10);
            }
            if ((var4 & 0x10) != 0) {
                int var12 = class88.field1497.method1178(8);
                int var13 = class88.field1497.method1198(false);
                var3.method2071(class319.field5393, 0, var12, var13);
                var3.field5099 = class319.field5393 + 300;
                var3.field5152 = class88.field1497.method1178(8);
            }
            if ((var4 & 0x4) != 0) {
                var3.field5096 = class88.field1497.method1187((byte) -99);
                var3.field5167 = class88.field1497.method1161(true);
            }
            var1++;
        }
        field1058++;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "([BIII)V", line = 169)
    public final void method527(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field1061++;
        if (this.field1075) {
            return;
        }
        if (arg1 != 20737) {
            this.field1054 = 79;
        }
        if (this.field1076) {
            this.field1076 = false;
            throw new IOException();
        }
        if (this.field1057 == null) {
            this.field1057 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg2; var6++) {
                this.field1057[this.field1054] = arg0[arg3 + var6];
                this.field1054 = (this.field1054 + 1) % 5000;
                if ((this.field1071 + 4900) % 5000 == this.field1054) {
                    throw new IOException();
                }
            }
            if (this.field1073 == null) {
                this.field1073 = this.field1077.method685(3, this, (byte) -128);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!ec", name = "finalize", descriptor = "()V", line = 221)
    protected final void finalize() {
        this.method534(-1);
        field1064++;
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)V", line = 234)
    public static void method528(int arg0) {
        field1078 = null;
        field1060 = null;
        field1080 = null;
        field1062 = null;
        field1079 = null;
        if (arg0 < 38) {
            field1080 = (class229) null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "run", descriptor = "()V", line = 251)
    public final void run() {
        field1074++;
        try {
            while (true) {
                int var3;
                int var4;
                synchronized (this) {
                    if (this.field1071 == this.field1054) {
                        if (this.field1075) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var13) {
                        }
                    }
                    if (this.field1071 > this.field1054) {
                        var3 = 5000 - this.field1071;
                    } else {
                        var3 = this.field1054 - this.field1071;
                    }
                    var4 = this.field1071;
                }
                if (var3 > 0) {
                    try {
                        this.field1066.write(this.field1057, var4, var3);
                    } catch (IOException var12) {
                        this.field1076 = true;
                    }
                    this.field1071 = (this.field1071 + var3) % 5000;
                    try {
                        if (this.field1071 == this.field1054) {
                            this.field1066.flush();
                        }
                    } catch (IOException var11) {
                        this.field1076 = true;
                    }
                }
            }
            try {
                if (this.field1072 != null) {
                    this.field1072.close();
                }
                if (this.field1066 != null) {
                    this.field1066.close();
                }
                if (this.field1065 != null) {
                    this.field1065.close();
                }
            } catch (IOException var10) {
            }
            this.field1057 = null;
        } catch (Exception var15) {
            class110.method834((String) null, var15, -1);
        }
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(I)I", line = 321)
    public final int method529(int arg0) throws IOException {
        field1067++;
        if (this.field1075) {
            return 0;
        } else {
            if (arg0 != -27959) {
                field1070 = true;
            }
            return this.field1072.read();
        }
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(Z)V", line = 337)
    public final void method530(boolean arg0) throws IOException {
        field1068++;
        if (!this.field1075 && arg0 && this.field1076) {
            this.field1076 = false;
            throw new IOException();
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field1078[var0] = var1;
        }
        field1079 = class266.method1858("Stufe: ", 0);
        field1080 = class266.method1858("0(U", 0);
    }

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "(I)V", line = 369)
    public final void method531(int arg0) {
        if (arg0 > -92) {
            this.finalize();
        }
        field1069++;
        if (!this.field1075) {
            this.field1072 = new class110();
            this.field1066 = new class249();
        }
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Ljava/net/Socket;Lwe;)V", line = 522)
    public class67(Socket arg0, class92 arg1) throws IOException {
        this.field1065 = arg0;
        this.field1077 = arg1;
        this.field1065.setSoTimeout(30000);
        this.field1065.setTcpNoDelay(true);
        this.field1072 = this.field1065.getInputStream();
        this.field1066 = this.field1065.getOutputStream();
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZII[B)V", line = 390)
    public final void method532(boolean arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field1056++;
        if (this.field1075) {
            return;
        }
        while (arg1 > 0) {
            int var5 = this.field1072.read(arg3, arg2, arg1);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg2 += var5;
            arg1 -= var5;
        }
        if (arg0) {
            this.field1072 = (InputStream) null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "(I)V", line = 418)
    public static final void method533(int arg0) {
        field1055++;
        if (arg0 != 1) {
            field1070 = true;
        }
        class266.field4478.method1415(arg0 - 18219);
    }

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "(I)V", line = 436)
    public final void method534(int arg0) {
        field1063++;
        if (this.field1075) {
            return;
        }
        synchronized (this) {
            this.field1075 = true;
            this.notifyAll();
        }
        if (this.field1073 != null) {
            while (this.field1073.field4125 == 0) {
                class288.method1976((byte) 52, 1L);
            }
            if (this.field1073.field4125 == 1) {
                try {
                    ((Thread) this.field1073.field4123).join();
                } catch (InterruptedException var5) {
                }
            }
        }
        this.field1073 = null;
        if (arg0 != -1) {
            method526(-53);
        }
    }
}
