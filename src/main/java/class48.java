import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class48 implements Runnable {

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "Z")
    private boolean field1154 = false;

    @OriginalMember(owner = "client!gf", name = "p", descriptor = "I")
    private int field1162 = 0;

    @OriginalMember(owner = "client!gf", name = "D", descriptor = "I")
    private int field1176 = 0;

    @OriginalMember(owner = "client!gf", name = "F", descriptor = "Z")
    private boolean field1178 = false;

    @OriginalMember(owner = "client!gf", name = "K", descriptor = "Lvf;")
    private class152 field1183;

    @OriginalMember(owner = "client!gf", name = "r", descriptor = "Ljava/net/Socket;")
    private Socket field1164;

    @OriginalMember(owner = "client!gf", name = "B", descriptor = "Ljava/io/InputStream;")
    private InputStream field1174;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1152;

    @OriginalMember(owner = "client!gf", name = "o", descriptor = "Lr;")
    public static class118 field1161 = class153.method1136(109, "<br>(X");

    @OriginalMember(owner = "client!gf", name = "v", descriptor = "I")
    public static int field1168 = 500;

    @OriginalMember(owner = "client!gf", name = "u", descriptor = "I")
    public static int field1167 = -1;

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "I")
    public static int field1158 = 0;

    @OriginalMember(owner = "client!gf", name = "A", descriptor = "Lr;")
    public static class118 field1173 = class153.method1136(107, ")3runescape)3com");

    @OriginalMember(owner = "client!gf", name = "C", descriptor = "Lr;")
    private static class118 field1175 = class153.method1136(92, "Please try using a different world)3");

    @OriginalMember(owner = "client!gf", name = "x", descriptor = "I")
    public static int field1170 = 0;

    @OriginalMember(owner = "client!gf", name = "L", descriptor = "Lr;")
    public static class118 field1184 = field1175;

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "Lr;")
    public static class118 field1153 = field1175;

    @OriginalMember(owner = "client!gf", name = "s", descriptor = "Lr;")
    public static class118 field1165 = class153.method1136(88, "::clientdrop");

    @OriginalMember(owner = "client!gf", name = "n", descriptor = "Lr;")
    public static class118 field1160 = field1175;

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "Lr;")
    public static class118 field1149 = field1175;

    @OriginalMember(owner = "client!gf", name = "y", descriptor = "Lr;")
    public static class118 field1171 = field1175;

    @OriginalMember(owner = "client!gf", name = "M", descriptor = "Lr;")
    public static class118 field1185 = field1175;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "I")
    public static int field1151;

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!gf", name = "q", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!gf", name = "t", descriptor = "I")
    public static int field1166;

    @OriginalMember(owner = "client!gf", name = "w", descriptor = "I")
    public static int field1169;

    @OriginalMember(owner = "client!gf", name = "z", descriptor = "I")
    public static int field1172;

    @OriginalMember(owner = "client!gf", name = "E", descriptor = "I")
    public static int field1177;

    @OriginalMember(owner = "client!gf", name = "G", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "client!gf", name = "I", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!gf", name = "J", descriptor = "I")
    public static int field1182;

    @OriginalMember(owner = "client!gf", name = "m", descriptor = "Lbd;")
    private class12 field1159;

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "Z")
    public static boolean field1148;

    @OriginalMember(owner = "client!gf", name = "H", descriptor = "Z")
    public static boolean field1180;

    @OriginalMember(owner = "client!gf", name = "N", descriptor = "[B")
    private byte[] field1186;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)I")
    public final int method400(int arg0) throws IOException {
        int var2 = 89 / ((arg0 - 8) / 41);
        field1156++;
        return this.field1178 ? 0 : this.field1174.read();
    }

    @OriginalMember(owner = "client!gf", name = "run", descriptor = "()V")
    public final void run() {
        field1181++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field1176 == this.field1162) {
                        if (this.field1178) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    var2 = this.field1162;
                    if (this.field1176 < this.field1162) {
                        var3 = 5000 - this.field1162;
                    } else {
                        var3 = this.field1176 - this.field1162;
                    }
                }
                if (var3 > 0) {
                    try {
                        this.field1152.write(this.field1186, var2, var3);
                    } catch (IOException var9) {
                        this.field1154 = true;
                    }
                    this.field1162 = (this.field1162 + var3) % 5000;
                    try {
                        if (this.field1176 == this.field1162) {
                            this.field1152.flush();
                        }
                    } catch (IOException var8) {
                        this.field1154 = true;
                    }
                }
            }
            try {
                if (this.field1174 != null) {
                    this.field1174.close();
                }
                if (this.field1152 != null) {
                    this.field1152.close();
                }
                if (this.field1164 != null) {
                    this.field1164.close();
                }
            } catch (IOException var7) {
            }
            this.field1186 = null;
        } catch (Exception var12) {
            class23.method212(null, (byte) 96, var12);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZI)V")
    public static final void method401(boolean arg0, int arg1) {
        class15 var2 = (class15) class112.field2622.method296(0);
        if (arg0) {
            field1173 = null;
        }
        while (var2 != null) {
            if ((var2.field2295 >> 48 & 0xFFFFL) == (long) arg1) {
                var2.method768(-1);
            }
            var2 = (class15) class112.field2622.method290(-1);
        }
        field1147++;
    }

    @OriginalMember(owner = "client!gf", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method408((byte) 110);
        field1163++;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "([BIBI)V")
    public final void method402(byte[] arg0, int arg1, byte arg2, int arg3) throws IOException {
        if (arg2 != -62) {
            return;
        }
        field1150++;
        if (this.field1178) {
            return;
        }
        while (arg3 > 0) {
            int var5 = this.field1174.read(arg0, arg1, arg3);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 += var5;
            arg3 -= var5;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILke;)Lke;")
    public static final class74 method403(int arg0, class74 arg1) {
        field1151++;
        if (arg0 != -1) {
            field1170 = 11;
        }
        class74 var2 = class34.method284(arg1, false);
        if (var2 == null) {
            var2 = arg1.field1793;
        }
        return var2;
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)V")
    public static void method404(int arg0) {
        field1160 = null;
        if (arg0 != 21958) {
            return;
        }
        field1165 = null;
        field1149 = null;
        field1175 = null;
        field1173 = null;
        field1185 = null;
        field1184 = null;
        field1161 = null;
        field1153 = null;
        field1171 = null;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)V")
    public static final void method405(byte arg0) {
        class13 var1 = (class13) class112.field2607.method889(123);
        int var2 = -88 / ((57 - arg0) / 43);
        while (var1 != null) {
            if (var1.field273 > 0) {
                var1.field273--;
            }
            if (var1.field273 != 0) {
                if (var1.field284 > 0) {
                    var1.field284--;
                }
                if (var1.field284 == 0 && var1.field282 >= 1 && var1.field279 >= 1 && var1.field282 <= 102 && var1.field279 <= 102 && (var1.field274 < 0 || class137.method1036(var1.field287, false, var1.field274))) {
                    class25.method220(var1.field282, 98, var1.field287, var1.field274, var1.field280, var1.field294, var1.field290, var1.field279);
                    var1.field284 = -1;
                    if (var1.field288 == var1.field274 && var1.field288 == -1) {
                        var1.method768(-1);
                    } else if (var1.field288 == var1.field274 && var1.field294 == var1.field285 && var1.field287 == var1.field277) {
                        var1.method768(-1);
                    }
                }
            } else if (var1.field288 < 0 || class137.method1036(var1.field277, false, var1.field288)) {
                class25.method220(var1.field282, 59, var1.field277, var1.field288, var1.field280, var1.field285, var1.field290, var1.field279);
                var1.method768(-1);
            }
            var1 = (class13) class112.field2607.method884(true);
        }
        field1177++;
    }

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "(I)I")
    public final int method406(int arg0) throws IOException {
        field1172++;
        if (this.field1178) {
            return 0;
        } else {
            if (arg0 >= -3) {
                field1170 = -113;
            }
            return this.field1174.available();
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(III)I")
    public static final int method407(int arg0, int arg1, int arg2) {
        int var3 = class105.method820(arg0 - 1, (byte) -112, arg1 - 1) + class105.method820(arg0 - 1, (byte) -27, arg1 + 1) + class105.method820(arg0 + 1, (byte) 97, arg1 - 1) + class105.method820(arg0 + 1, (byte) 124, arg1 + 1);
        int var4 = class105.method820(arg0, (byte) 116, arg1 - 1) + class105.method820(arg0, (byte) -57, arg1 + 1) + class105.method820(arg0 + -1, (byte) 115, arg1) + class105.method820(arg0 + 1, (byte) 110, arg1);
        field1169++;
        int var5 = class105.method820(arg0, (byte) 111, arg1);
        if (arg2 != -15508) {
            field1185 = null;
        }
        return var4 / 8 + var3 / 16 + var5 / 4;
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(B)V")
    public final void method408(byte arg0) {
        field1166++;
        if (this.field1178) {
            return;
        }
        synchronized (this) {
            this.field1178 = true;
            this.notifyAll();
        }
        if (this.field1159 != null) {
            while (this.field1159.field268 == 0) {
                class139.method1042(-54, 1L);
            }
            if (this.field1159.field268 == 1) {
                try {
                    ((Thread) this.field1159.field269).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        if (arg0 < 101) {
            method407(65, 3, 100);
        }
        this.field1159 = null;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(B[BII)V")
    public final void method409(byte arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field1179++;
        if (this.field1178) {
            return;
        }
        if (this.field1154) {
            this.field1154 = false;
            throw new IOException();
        }
        if (this.field1186 == null) {
            this.field1186 = new byte[5000];
        }
        synchronized (this) {
            if (arg0 > -80) {
                method401(true, 11);
            }
            for (int var6 = 0; var6 < arg3; var6++) {
                this.field1186[this.field1176] = arg1[arg2 + var6];
                this.field1176 = (this.field1176 + 1) % 5000;
                if ((this.field1162 + 4900) % 5000 == this.field1176) {
                    throw new IOException();
                }
            }
            if (this.field1159 == null) {
                this.field1159 = this.field1183.method1128(-17306, this, 3);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Ljava/net/Socket;Lvf;)V")
    public class48(Socket arg0, class152 arg1) throws IOException {
        this.field1183 = arg1;
        this.field1164 = arg0;
        this.field1164.setSoTimeout(30000);
        this.field1164.setTcpNoDelay(true);
        this.field1174 = this.field1164.getInputStream();
        this.field1152 = this.field1164.getOutputStream();
    }
}
