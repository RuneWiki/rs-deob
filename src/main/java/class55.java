import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class55 implements Runnable {

    @OriginalMember(owner = "client!fd", name = "o", descriptor = "Z")
    private boolean field1145 = false;

    @OriginalMember(owner = "client!fd", name = "n", descriptor = "I")
    private int field1144 = 0;

    @OriginalMember(owner = "client!fd", name = "v", descriptor = "I")
    private int field1152 = 0;

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "Z")
    private boolean field1140 = false;

    @OriginalMember(owner = "client!fd", name = "y", descriptor = "Lrh;")
    private class169 field1155;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "Ljava/net/Socket;")
    private Socket field1132;

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "Ljava/io/InputStream;")
    private InputStream field1142;

    @OriginalMember(owner = "client!fd", name = "z", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1156;

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "Ljd;")
    public static class92 field1133 = class202.method1325((byte) 90, "mapscene");

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "[I")
    public static int[] field1137 = new int[50];

    @OriginalMember(owner = "client!fd", name = "s", descriptor = "Ljd;")
    private static class92 field1149 = class202.method1325((byte) 90, "To create a new account you need to");

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "Ljd;")
    public static class92 field1134 = field1149;

    @OriginalMember(owner = "client!fd", name = "m", descriptor = "[Z")
    public static boolean[] field1143 = new boolean[100];

    @OriginalMember(owner = "client!fd", name = "D", descriptor = "I")
    public static int field1160 = 0;

    @OriginalMember(owner = "client!fd", name = "E", descriptor = "[Lh;")
    public static class70[] field1161 = new class70[2048];

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
    public static int field1131;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "I")
    public static int field1135;

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "I")
    public static int field1139;

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!fd", name = "p", descriptor = "I")
    public static int field1146;

    @OriginalMember(owner = "client!fd", name = "q", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "client!fd", name = "r", descriptor = "I")
    public static int field1148;

    @OriginalMember(owner = "client!fd", name = "x", descriptor = "I")
    public static int field1154;

    @OriginalMember(owner = "client!fd", name = "A", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!fd", name = "B", descriptor = "I")
    public static int field1158;

    @OriginalMember(owner = "client!fd", name = "C", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!fd", name = "w", descriptor = "Llh;")
    public static class115 field1153;

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "Ltd;")
    private class183 field1138;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "Lga;")
    public static class62 field1136;

    @OriginalMember(owner = "client!fd", name = "u", descriptor = "[B")
    private byte[] field1151;

    @OriginalMember(owner = "client!fd", name = "t", descriptor = "[I")
    public static int[] field1150;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IBI[B)V")
    public final void method318(int arg0, byte arg1, int arg2, byte[] arg3) throws IOException {
        if (arg1 <= 50) {
            this.finalize();
        }
        field1158++;
        if (this.field1140) {
            return;
        }
        while (arg2 > 0) {
            int var5 = this.field1142.read(arg3, arg0, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg0 += var5;
            arg2 -= var5;
        }
    }

    @OriginalMember(owner = "client!fd", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method319(true);
        field1135++;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Z)V")
    public final void method319(boolean arg0) {
        field1154++;
        if (this.field1140) {
            return;
        }
        synchronized (this) {
            this.field1140 = arg0;
            this.notifyAll();
        }
        if (this.field1138 != null) {
            while (this.field1138.field3476 == 0) {
                class58.method357(-24534, 1L);
            }
            if (this.field1138.field3476 == 1) {
                try {
                    ((Thread) this.field1138.field3474).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field1138 = null;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V")
    public static final void method320(int arg0) {
        class198.field3871.method1252(false);
        field1159++;
        int var1 = -123 % ((arg0 + 11) / 50);
        class156.field3100 = null;
        class79.field1619 = 1;
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)I")
    public final int method321(int arg0) throws IOException {
        if (arg0 >= -99) {
            field1161 = null;
        }
        field1139++;
        return this.field1140 ? 0 : this.field1142.read();
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILnh;I)Lrf;")
    public static final class167 method322(int arg0, class133 arg1, int arg2) {
        field1146++;
        if (arg2 != 30000) {
            field1160 = 14;
        }
        return class204.method1332(arg0, arg1, arg2 ^ 0x754A) ? class140.method933(255) : null;
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(I)V")
    public static void method323(int arg0) {
        field1161 = null;
        field1137 = null;
        field1149 = null;
        field1134 = null;
        field1153 = null;
        field1150 = null;
        if (arg0 != 31876) {
            method322(109, null, -122);
        }
        field1136 = null;
        field1143 = null;
        field1133 = null;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I[BII)V")
    public final void method324(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field1141++;
        if (this.field1140) {
            return;
        }
        if (this.field1145) {
            this.field1145 = false;
            throw new IOException();
        }
        if (this.field1151 == null) {
            this.field1151 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg2; var6++) {
                this.field1151[this.field1144] = arg1[arg0 + var6];
                this.field1144 = (this.field1144 + 1) % 5000;
                if ((this.field1152 + 4900) % 5000 == this.field1144) {
                    throw new IOException();
                }
            }
            if (arg3 != 2084) {
                method320(-91);
            }
            if (this.field1138 == null) {
                this.field1138 = this.field1155.method1125(this, 3, 17258);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!fd", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field1152 == this.field1144) {
                            if (this.field1140) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        if (this.field1144 >= this.field1152) {
                            var2 = this.field1144 - this.field1152;
                        } else {
                            var2 = 5000 - this.field1152;
                        }
                        var3 = this.field1152;
                    }
                    if (var2 <= 0) {
                        continue;
                    }
                    try {
                        this.field1156.write(this.field1151, var3, var2);
                    } catch (IOException var9) {
                        this.field1145 = true;
                    }
                    this.field1152 = (this.field1152 + var2) % 5000;
                    try {
                        if (this.field1152 == this.field1144) {
                            this.field1156.flush();
                        }
                    } catch (IOException var8) {
                        this.field1145 = true;
                    }
                    continue;
                }
                try {
                    if (this.field1142 != null) {
                        this.field1142.close();
                    }
                    if (this.field1156 != null) {
                        this.field1156.close();
                    }
                    if (this.field1132 != null) {
                        this.field1132.close();
                    }
                } catch (IOException var7) {
                }
                this.field1151 = null;
                break;
            }
        } catch (Exception var12) {
            class164.method1059(null, var12, 113);
        }
        field1147++;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(II)Lch;")
    public static final class29 method325(int arg0, int arg1) {
        field1131++;
        class29 var2 = (class29) class20.field480.method930(-84, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class36.field831.method899((byte) 87, 16, arg0);
        class29 var4 = new class29();
        if (var3 != null) {
            var4.method181(new class70(var3), arg1 - 34592);
        }
        if (arg1 != 28037) {
            method322(-98, null, 117);
        }
        class20.field480.method927(24744, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Ljava/net/Socket;Lrh;)V")
    public class55(Socket arg0, class169 arg1) throws IOException {
        this.field1155 = arg1;
        this.field1132 = arg0;
        this.field1132.setSoTimeout(30000);
        this.field1132.setTcpNoDelay(true);
        this.field1142 = this.field1132.getInputStream();
        this.field1156 = this.field1132.getOutputStream();
    }

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "(I)I")
    public final int method326(int arg0) throws IOException {
        field1148++;
        if (this.field1140) {
            return 0;
        } else if (arg0 == 0) {
            return this.field1142.available();
        } else {
            return -22;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "([BI)[B")
    public static final byte[] method327(byte[] arg0, int arg1) {
        field1157++;
        if (arg1 != 30000) {
            method320(-33);
        }
        int var2 = arg0.length;
        byte[] var3 = new byte[var2];
        class11.method75(arg0, 0, var3, 0, var2);
        return var3;
    }
}
