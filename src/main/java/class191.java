import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class191 implements Runnable {

    @OriginalMember(owner = "client!ul", name = "n", descriptor = "Z")
    private boolean field2900 = false;

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "I")
    private int field2889 = 0;

    @OriginalMember(owner = "client!ul", name = "i", descriptor = "Z")
    private boolean field2895 = false;

    @OriginalMember(owner = "client!ul", name = "y", descriptor = "I")
    private int field2911 = 0;

    @OriginalMember(owner = "client!ul", name = "o", descriptor = "Lfk;")
    private class52 field2901;

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "Ljava/net/Socket;")
    private Socket field2891;

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "Ljava/io/InputStream;")
    private InputStream field2893;

    @OriginalMember(owner = "client!ul", name = "l", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field2898;

    @OriginalMember(owner = "client!ul", name = "m", descriptor = "Z")
    public static boolean field2899 = false;

    @OriginalMember(owner = "client!ul", name = "x", descriptor = "[I")
    public static int[] field2910 = new int[50];

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "I")
    public static int field2887;

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "I")
    public static int field2890;

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "I")
    public static int field2892;

    @OriginalMember(owner = "client!ul", name = "h", descriptor = "I")
    public static int field2894;

    @OriginalMember(owner = "client!ul", name = "j", descriptor = "I")
    public static int field2896;

    @OriginalMember(owner = "client!ul", name = "k", descriptor = "I")
    public static int field2897;

    @OriginalMember(owner = "client!ul", name = "p", descriptor = "I")
    public static int field2902;

    @OriginalMember(owner = "client!ul", name = "q", descriptor = "I")
    public static int field2903;

    @OriginalMember(owner = "client!ul", name = "r", descriptor = "I")
    public static int field2904;

    @OriginalMember(owner = "client!ul", name = "s", descriptor = "I")
    public static int field2905;

    @OriginalMember(owner = "client!ul", name = "u", descriptor = "I")
    public static int field2907;

    @OriginalMember(owner = "client!ul", name = "z", descriptor = "I")
    public static int field2912;

    @OriginalMember(owner = "client!ul", name = "A", descriptor = "I")
    public static int field2913;

    @OriginalMember(owner = "client!ul", name = "v", descriptor = "Lui;")
    private class286 field2908;

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "[B")
    private byte[] field2888;

    @OriginalMember(owner = "client!ul", name = "w", descriptor = "[Lbf;")
    public static class108[] field2909;

    @OriginalMember(owner = "client!ul", name = "t", descriptor = "[Z")
    public static boolean[] field2906;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(BII[B)V")
    public final void method1202(byte arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field2905++;
        if (this.field2900) {
            return;
        }
        if (this.field2895) {
            this.field2895 = false;
            throw new IOException();
        }
        if (this.field2888 == null) {
            this.field2888 = new byte[5000];
        }
        synchronized (this) {
            if (arg0 < -58) {
                for (int var6 = 0; var6 < arg2; var6++) {
                    this.field2888[this.field2911] = arg3[arg1 + var6];
                    this.field2911 = (this.field2911 + 1) % 5000;
                    if ((this.field2889 + 4900) % 5000 == this.field2911) {
                        throw new IOException();
                    }
                }
                if (this.field2908 == null) {
                    this.field2908 = this.field2901.method325((byte) -107, this, 3);
                }
                this.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IILbj;)Ljava/lang/String;")
    public static final String method1203(int arg0, int arg1, class215 arg2) {
        field2887++;
        try {
            int var3 = arg2.method1347(true);
            if (arg0 < var3) {
                var3 = arg0;
            }
            byte[] var4 = new byte[var3];
            arg2.field3280 += class156.field2156.method664(arg1, var3, var4, arg1 + 1, arg2.field3280, arg2.field3287);
            return class109.method695((byte) 13, var3, var4, 0);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(B)V")
    public static void method1204(byte arg0) {
        if (arg0 <= 1) {
            method1207(114, -4, -124, 122, (class202) null, 85L, (class202) null, (class202) null);
        }
        field2909 = null;
        field2910 = null;
        field2906 = null;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILee;)V")
    public static final void method1205(int arg0, class74 arg1) {
        field2890++;
        short var2 = 256;
        for (int var3 = 0; var3 < class261.field4207.length; var3++) {
            class261.field4207[var3] = 0;
        }
        for (int var4 = 0; var4 < 5000; var4++) {
            int var16 = (int) ((double) var2 * 128.0D * Math.random());
            class261.field4207[var16] = (int) (Math.random() * 284.0D);
        }
        if (arg0 < 49) {
            field2892 = -4;
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var12 = 1; var12 < (var2 - 1); var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = (var12 << 7) + var14;
                    class228.field3575[var15] = (class261.field4207[var15 + 1] + class261.field4207[var15 - 1] + class261.field4207[var15 - 128] + class261.field4207[var15 + 128]) / 4;
                }
            }
            int[] var13 = class261.field4207;
            class261.field4207 = class228.field3575;
            class228.field3575 = var13;
        }
        if (arg1 == null) {
            return;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < arg1.field4557; var7++) {
            for (int var8 = 0; var8 < arg1.field4566; var8++) {
                if (arg1.field1042[var6++] != 0) {
                    int var9 = var8 + arg1.field4565 + 16;
                    int var10 = var7 + arg1.field4564 + 16;
                    int var11 = (var10 << 7) + var9;
                    class261.field4207[var11] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)I")
    public final int method1206(int arg0) throws IOException {
        field2902++;
        if (this.field2900) {
            return 0;
        } else {
            int var2 = -61 % ((arg0 - 67) / 55);
            return this.field2893.read();
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIIILsk;JLsk;Lsk;)V")
    public static final void method1207(int arg0, int arg1, int arg2, int arg3, class202 arg4, long arg5, class202 arg6, class202 arg7) {
        class115 var9 = new class115();
        var9.field1654 = arg4;
        var9.field1658 = arg1 * 128 + 64;
        var9.field1664 = arg2 * 128 + 64;
        var9.field1656 = arg3;
        var9.field1659 = arg5;
        var9.field1651 = arg6;
        var9.field1665 = arg7;
        int var10 = 0;
        class91 var11 = class246.field3856[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field1343; var12++) {
                class160 var13 = var11.field1339[var12];
                if ((var13.field2225 & 0x400000L) == 4194304L) {
                    int var14 = var13.field2230.method9();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field1661 = -var10;
        if (class246.field3856[arg0][arg1][arg2] == null) {
            class246.field3856[arg0][arg1][arg2] = new class91(arg0, arg1, arg2);
        }
        class246.field3856[arg0][arg1][arg2].field1332 = var9;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(BI)I")
    public static final int method1208(byte arg0, int arg1) {
        field2913++;
        if (arg0 != 54) {
            field2909 = null;
        }
        return arg1 & 0x3FF;
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(I)V")
    public final void method1209(int arg0) {
        if (arg0 > -65) {
            this.field2888 = null;
        }
        field2904++;
        if (!this.field2900) {
            this.field2893 = new class311();
            this.field2898 = new class186();
        }
    }

    @OriginalMember(owner = "client!ul", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method1211((byte) -50);
        field2912++;
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(B)V")
    public final void method1210(byte arg0) throws IOException {
        field2903++;
        if (this.field2900) {
            return;
        }
        if (this.field2895) {
            this.field2895 = false;
            throw new IOException();
        } else {
            int var2 = -63 / ((arg0 + 62) / 38);
        }
    }

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "(B)V")
    public final void method1211(byte arg0) {
        field2897++;
        if (this.field2900) {
            return;
        }
        synchronized (this) {
            this.field2900 = true;
            this.notifyAll();
        }
        int var3 = 92 % ((43 - arg0) / 56);
        if (this.field2908 != null) {
            while (this.field2908.field4570 == 0) {
                class17.method116(122, 1L);
            }
            if (this.field2908.field4570 == 1) {
                try {
                    ((Thread) this.field2908.field4567).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2908 = null;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(II[BI)V")
    public final void method1212(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (arg0 != 0) {
            this.finalize();
        }
        field2894++;
        if (this.field2900) {
            return;
        }
        while (arg3 > 0) {
            int var5 = this.field2893.read(arg2, arg1, arg3);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg3 -= var5;
            arg1 += var5;
        }
    }

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "(B)I")
    public final int method1213(byte arg0) throws IOException {
        int var2 = 51 % ((arg0 + 30) / 61);
        field2896++;
        return this.field2900 ? 0 : this.field2893.available();
    }

    @OriginalMember(owner = "client!ul", name = "run", descriptor = "()V")
    public final void run() {
        field2907++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field2911 == this.field2889) {
                        if (this.field2900) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    var2 = this.field2889;
                    if (this.field2889 > this.field2911) {
                        var3 = 5000 - this.field2889;
                    } else {
                        var3 = this.field2911 - this.field2889;
                    }
                }
                if (var3 > 0) {
                    try {
                        this.field2898.write(this.field2888, var2, var3);
                    } catch (IOException var9) {
                        this.field2895 = true;
                    }
                    this.field2889 = (this.field2889 + var3) % 5000;
                    try {
                        if (this.field2911 == this.field2889) {
                            this.field2898.flush();
                        }
                    } catch (IOException var8) {
                        this.field2895 = true;
                    }
                }
            }
            try {
                if (this.field2893 != null) {
                    this.field2893.close();
                }
                if (this.field2898 != null) {
                    this.field2898.close();
                }
                if (this.field2891 != null) {
                    this.field2891.close();
                }
            } catch (IOException var7) {
            }
            this.field2888 = null;
        } catch (Exception var12) {
            class121.method780(160, (String) null, var12);
        }
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Ljava/net/Socket;Lfk;)V")
    public class191(Socket arg0, class52 arg1) throws IOException {
        this.field2901 = arg1;
        this.field2891 = arg0;
        this.field2891.setSoTimeout(30000);
        this.field2891.setTcpNoDelay(true);
        this.field2893 = this.field2891.getInputStream();
        this.field2898 = this.field2891.getOutputStream();
    }
}
