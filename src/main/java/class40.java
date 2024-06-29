import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class40 implements Runnable {

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "Z")
    private boolean field1018 = false;

    @OriginalMember(owner = "client!gd", name = "v", descriptor = "Z")
    private boolean field1038 = false;

    @OriginalMember(owner = "client!gd", name = "A", descriptor = "I")
    private int field1043 = 0;

    @OriginalMember(owner = "client!gd", name = "B", descriptor = "I")
    private int field1044 = 0;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "Laa;")
    private class2 field1020;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "Ljava/net/Socket;")
    private Socket field1017;

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "Ljava/io/InputStream;")
    private InputStream field1032;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1025;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "[I")
    public static int[] field1022 = new int[5];

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "Lad;")
    private static class5 field1026 = class88.method674("RuneScape has been updated(Q", -66);

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
    public static int field1021 = 0;

    @OriginalMember(owner = "client!gd", name = "x", descriptor = "[I")
    public static int[] field1040 = new int[200];

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "Lad;")
    public static class5 field1028 = class88.method674("da dieser Computer gegen unsere ", -105);

    @OriginalMember(owner = "client!gd", name = "z", descriptor = "I")
    public static int field1042 = 2;

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "[Lhc;")
    public static class45[] field1027 = new class45[4];

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "Lad;")
    public static class5 field1031 = field1026;

    @OriginalMember(owner = "client!gd", name = "w", descriptor = "Lad;")
    private static class5 field1039 = class88.method674("Continue", 45);

    @OriginalMember(owner = "client!gd", name = "u", descriptor = "Lad;")
    public static class5 field1037 = field1039;

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "[J")
    public static long[] field1033 = new long[100];

    @OriginalMember(owner = "client!gd", name = "F", descriptor = "Z")
    public static boolean field1048 = false;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!gd", name = "C", descriptor = "I")
    public static int field1045;

    @OriginalMember(owner = "client!gd", name = "D", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!gd", name = "E", descriptor = "I")
    public static int field1047;

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "Lrd;")
    public static class106 field1030;

    @OriginalMember(owner = "client!gd", name = "t", descriptor = "Lkb;")
    private class62 field1036;

    @OriginalMember(owner = "client!gd", name = "y", descriptor = "[B")
    private byte[] field1041;

    @OriginalMember(owner = "client!gd", name = "s", descriptor = "[I")
    public static int[] field1035;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II[BI)V", line = 3)
    public final void method344(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        int var5 = 67 % ((24 - arg3) / 54);
        field1029++;
        if (this.field1038) {
            return;
        }
        while (arg1 > 0) {
            int var6 = this.field1032.read(arg2, arg0, arg1);
            if (var6 <= 0) {
                throw new EOFException();
            }
            arg1 -= var6;
            arg0 += var6;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V", line = 27)
    public static final void method345(byte arg0) {
        field1045++;
        for (class94 var1 = (class94) class7.field259.method180(0); var1 != null; var1 = (class94) class7.field259.method181(0)) {
            if (var1.field2215 != null) {
                class58.field1417.method568(var1.field2215);
                var1.field2215 = null;
            }
            if (var1.field2224 != null) {
                class58.field1417.method568(var1.field2224);
                var1.field2224 = null;
            }
        }
        if (arg0 != -10) {
            field1033 = null;
        }
        class7.field259.method182(arg0 ^ 0xFFFF9911);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)I", line = 59)
    public final int method346(int arg0) throws IOException {
        field1047++;
        if (this.field1038) {
            return 0;
        } else {
            if (arg0 != 0) {
                field1048 = true;
            }
            return this.field1032.read();
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)I", line = 80)
    public static int method347(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)I", line = 91)
    public final int method348(int arg0) throws IOException {
        if (arg0 != 0) {
            field1022 = null;
        }
        field1019++;
        return this.field1038 ? 0 : this.field1032.available();
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Ljava/net/Socket;Laa;)V", line = 375)
    public class40(Socket arg0, class2 arg1) throws IOException {
        this.field1020 = arg1;
        this.field1017 = arg0;
        this.field1017.setSoTimeout(30000);
        this.field1017.setTcpNoDelay(true);
        this.field1032 = this.field1017.getInputStream();
        this.field1025 = this.field1017.getOutputStream();
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(III[B)V", line = 127)
    public final void method349(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field1024++;
        if (arg1 != -1) {
            field1022 = null;
        }
        if (this.field1038) {
            return;
        }
        if (this.field1018) {
            this.field1018 = false;
            throw new IOException();
        }
        if (this.field1041 == null) {
            this.field1041 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg2; var6++) {
                this.field1041[this.field1044] = arg3[arg0 + var6];
                this.field1044 = (this.field1044 + 1) % 5000;
                if ((this.field1043 + 4900) % 5000 == this.field1044) {
                    throw new IOException();
                }
            }
            if (this.field1036 == null) {
                this.field1036 = this.field1020.method13(3, this, ~arg1);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!gd", name = "run", descriptor = "()V", line = 181)
    public final void run() {
        field1046++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field1044 == this.field1043) {
                        if (this.field1038) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    var2 = this.field1043;
                    if (this.field1043 > this.field1044) {
                        var3 = 5000 - this.field1043;
                    } else {
                        var3 = this.field1044 - this.field1043;
                    }
                }
                if (var3 > 0) {
                    try {
                        this.field1025.write(this.field1041, var2, var3);
                    } catch (IOException var9) {
                        this.field1018 = true;
                    }
                    this.field1043 = (this.field1043 + var3) % 5000;
                    try {
                        if (this.field1044 == this.field1043) {
                            this.field1025.flush();
                        }
                    } catch (IOException var8) {
                        this.field1018 = true;
                    }
                }
            }
            try {
                if (this.field1032 != null) {
                    this.field1032.close();
                }
                if (this.field1025 != null) {
                    this.field1025.close();
                }
                if (this.field1017 != null) {
                    this.field1017.close();
                }
            } catch (IOException var7) {
            }
            this.field1041 = null;
        } catch (Exception var12) {
            class118.method932(var12, null, 1);
        }
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)V", line = 263)
    public final void method350(int arg0) {
        field1023++;
        if (this.field1038) {
            return;
        }
        synchronized (this) {
            this.field1038 = true;
            if (arg0 != -5918) {
                this.field1017 = null;
            }
            this.notifyAll();
        }
        if (this.field1036 != null) {
            while (this.field1036.field1513 == 0) {
                class121.method958(1L, (byte) 103);
            }
            if (this.field1036.field1513 == 1) {
                try {
                    ((Thread) this.field1036.field1516).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field1036 = null;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(B)V", line = 311)
    public static void method351(byte arg0) {
        field1022 = null;
        field1039 = null;
        if (arg0 > -34) {
            return;
        }
        field1030 = null;
        field1037 = null;
        field1031 = null;
        field1033 = null;
        field1040 = null;
        field1028 = null;
        field1027 = null;
        field1035 = null;
        field1026 = null;
    }

    @OriginalMember(owner = "client!gd", name = "finalize", descriptor = "()V", line = 334)
    protected final void finalize() {
        this.method350(-5918);
        field1034++;
    }
}
