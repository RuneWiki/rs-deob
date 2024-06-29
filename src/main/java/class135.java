import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class135 implements Runnable {

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "Z")
    private boolean field2884 = false;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
    private int field2883 = 0;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
    private int field2891 = 0;

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "Z")
    private boolean field2906 = false;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "Ljava/net/Socket;")
    private Socket field2892;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "Le;")
    private class41 field2889;

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "Ljava/io/InputStream;")
    private InputStream field2900;

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field2896;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "[I")
    public static int[] field2893 = new int[100];

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "Ldd;")
    private static class35 field2894 = class180.method1196((byte) 127, "Loaded textures");

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "Ldd;")
    public static class35 field2899 = class180.method1196((byte) 127, "Lade Sprites )2 ");

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "Ldd;")
    public static class35 field2905 = class180.method1196((byte) 127, "welle:");

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "Ldd;")
    public static class35 field2898 = field2894;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
    public static int field2885;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
    public static int field2886;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "I")
    public static int field2890;

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "I")
    public static int field2897;

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "I")
    public static int field2901;

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "I")
    public static int field2902;

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "I")
    public static int field2903;

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "I")
    public static int field2904;

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "I")
    public static int field2908;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "Lhf;")
    private class76 field2887;

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "Lag;")
    public static class8 field2909;

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "[B")
    private byte[] field2907;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V")
    public final void method920(byte arg0) {
        field2890++;
        if (this.field2884) {
            return;
        }
        synchronized (this) {
            this.field2884 = true;
            if (arg0 >= -48) {
                this.field2891 = -16;
            }
            this.notifyAll();
        }
        if (this.field2887 != null) {
            while (this.field2887.field1806 == 0) {
                class204.method1347(1L, false);
            }
            if (this.field2887.field1806 == 1) {
                try {
                    ((Thread) this.field2887.field1804).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field2887 = null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lce;IBLe;)V")
    public static final void method921(class26 arg0, int arg1, byte arg2, class41 arg3) {
        class43 var4 = new class43();
        field2901++;
        var4.field932 = arg0.method221(-83);
        var4.field937 = arg0.method240(8);
        if (arg2 < 58) {
            method927(-75);
        }
        var4.field931 = new int[var4.field932];
        var4.field950 = new class76[var4.field932];
        var4.field933 = new class76[var4.field932];
        var4.field949 = new int[var4.field932];
        var4.field945 = new byte[var4.field932][][];
        var4.field946 = new int[var4.field932];
        for (int var5 = 0; var5 < var4.field932; var5++) {
            try {
                int var6 = arg0.method221(-126);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var17 = new String(arg0.method236(0).method325(-20306));
                    int var18 = 0;
                    String var19 = new String(arg0.method236(0).method325(-20306));
                    if (var6 == 1) {
                        var18 = arg0.method240(8);
                    }
                    var4.field931[var5] = var6;
                    var4.field949[var5] = var18;
                    var4.field933[var5] = arg3.method390(class1.method5((byte) 94, var17), (byte) -125, var19);
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = new String(arg0.method236(0).method325(-20306));
                    String var8 = new String(arg0.method236(0).method325(-20306));
                    int var9 = arg0.method221(-95);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = new String(arg0.method236(0).method325(-20306));
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg0.method240(8);
                            var12[var13] = new byte[var14];
                            arg0.method255((byte) -109, 0, var12[var13], var14);
                        }
                    }
                    var4.field931[var5] = var6;
                    Class[] var15 = new Class[var9];
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class1.method5((byte) 114, var10[var16]);
                    }
                    var4.field950[var5] = arg3.method389(8, var15, var8, class1.method5((byte) 116, var7));
                    var4.field945[var5] = var12;
                }
            } catch (ClassNotFoundException var20) {
                var4.field946[var5] = -1;
            } catch (SecurityException var21) {
                var4.field946[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field946[var5] = -3;
            } catch (Exception var23) {
                var4.field946[var5] = -4;
            } catch (Throwable var24) {
                var4.field946[var5] = -5;
            }
        }
        class172.field3438.method1236((byte) 126, var4);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[BI)V")
    public final void method922(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field2897++;
        if (this.field2884) {
            return;
        }
        while (arg1 > 0) {
            int var5 = this.field2900.read(arg2, arg3, arg1);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg3 += var5;
            arg1 -= var5;
        }
        if (arg0 != 1) {
            method921(null, -66, (byte) 99, null);
        }
    }

    @OriginalMember(owner = "client!oa", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field2891 == this.field2883) {
                            if (this.field2884) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        var2 = this.field2891;
                        if (this.field2891 > this.field2883) {
                            var3 = 5000 - this.field2891;
                        } else {
                            var3 = this.field2883 - this.field2891;
                        }
                    }
                    if (var3 <= 0) {
                        continue;
                    }
                    try {
                        this.field2896.write(this.field2907, var2, var3);
                    } catch (IOException var9) {
                        this.field2906 = true;
                    }
                    this.field2891 = (this.field2891 + var3) % 5000;
                    try {
                        if (this.field2891 == this.field2883) {
                            this.field2896.flush();
                        }
                    } catch (IOException var8) {
                        this.field2906 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2900 != null) {
                        this.field2900.close();
                    }
                    if (this.field2896 != null) {
                        this.field2896.close();
                    }
                    if (this.field2892 != null) {
                        this.field2892.close();
                    }
                } catch (IOException var7) {
                }
                this.field2907 = null;
                break;
            }
        } catch (Exception var12) {
            class173.method1145((byte) -65, null, var12);
        }
        field2886++;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)I")
    public final int method923(boolean arg0) throws IOException {
        if (arg0) {
            method929(null, (byte) -104, null);
        }
        field2908++;
        return this.field2884 ? 0 : this.field2900.available();
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[BZ)V")
    public final void method924(int arg0, int arg1, byte[] arg2, boolean arg3) throws IOException {
        field2902++;
        if (this.field2884) {
            return;
        }
        if (this.field2906) {
            this.field2906 = false;
            throw new IOException();
        }
        if (this.field2907 == null) {
            this.field2907 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg1; var6++) {
                this.field2907[this.field2883] = arg2[arg0 + var6];
                this.field2883 = (this.field2883 + 1) % 5000;
                if ((this.field2891 + 4900) % 5000 == this.field2883) {
                    throw new IOException();
                }
            }
            if (!arg3) {
                this.run();
            }
            if (this.field2887 == null) {
                this.field2887 = this.field2889.method387(this, !arg3, 3);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(B)V")
    public static final void method925(byte arg0) {
        for (int var1 = 0; var1 < class83.field1921; var1++) {
            int var2 = class73.field1738[var1];
            class19 var3 = class204.field4058[var2];
            if (var3 != null) {
                class201.method1335(var3.field377.field3717, var3, 125);
            }
        }
        field2885++;
        if (arg0 <= 7) {
            method926(43, 6);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)V")
    public static final void method926(int arg0, int arg1) {
        class54 var2 = class191.field3853[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class54 var4 = class191.field3853[var3][arg0][arg1] = class191.field3853[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field1208--;
                for (int var5 = 0; var5 < var4.field1218; var5++) {
                    class131 var6 = var4.field1225[var5];
                    if ((var6.field2822 >> 29 & 0x3L) == 2L && var6.field2816 == arg0 && var6.field2812 == arg1) {
                        var6.field2819--;
                    }
                }
            }
        }
        if (class191.field3853[0][arg0][arg1] == null) {
            class191.field3853[0][arg0][arg1] = new class54(0, arg0, arg1);
        }
        class191.field3853[0][arg0][arg1].field1214 = var2;
        class191.field3853[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
    public static void method927(int arg0) {
        field2893 = null;
        field2898 = null;
        if (arg0 > -43) {
            field2905 = null;
        }
        field2905 = null;
        field2899 = null;
        field2909 = null;
        field2894 = null;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Z)I")
    public final int method928(boolean arg0) throws IOException {
        field2888++;
        if (arg0) {
            return this.field2884 ? 0 : this.field2900.read();
        } else {
            return -23;
        }
    }

    @OriginalMember(owner = "client!oa", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method920((byte) -96);
        field2895++;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lag;BLag;)V")
    public static final void method929(class8 arg0, byte arg1, class8 arg2) {
        class58.field1445 = arg0;
        if (arg1 <= 65) {
            method921(null, 112, (byte) 123, null);
        }
        class42.field920 = arg2;
        field2903++;
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Ljava/net/Socket;Le;)V")
    public class135(Socket arg0, class41 arg1) throws IOException {
        this.field2892 = arg0;
        this.field2889 = arg1;
        this.field2892.setSoTimeout(30000);
        this.field2892.setTcpNoDelay(true);
        this.field2900 = this.field2892.getInputStream();
        this.field2896 = this.field2892.getOutputStream();
    }
}
