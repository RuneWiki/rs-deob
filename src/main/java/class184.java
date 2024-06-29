import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class184 implements Runnable {

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "Z")
    private boolean field2769 = false;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "I")
    private int field2766 = 0;

    @OriginalMember(owner = "client!kf", name = "u", descriptor = "I")
    private int field2780 = 0;

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "Z")
    private boolean field2775 = false;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "Ljava/net/Socket;")
    private Socket field2760;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "Lja;")
    private class59 field2762;

    @OriginalMember(owner = "client!kf", name = "r", descriptor = "Ljava/io/InputStream;")
    private InputStream field2777;

    @OriginalMember(owner = "client!kf", name = "s", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field2778;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "[[B")
    public static byte[][] field2763 = new byte[1000][];

    @OriginalMember(owner = "client!kf", name = "z", descriptor = "I")
    public static int field2785 = 0;

    @OriginalMember(owner = "client!kf", name = "v", descriptor = "I")
    public static int field2781 = 0;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "I")
    public static int field2761;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
    public static int field2765;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
    public static int field2767;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "I")
    public static int field2768;

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "I")
    public static int field2771;

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "I")
    public static int field2774;

    @OriginalMember(owner = "client!kf", name = "t", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!kf", name = "w", descriptor = "I")
    public static int field2782;

    @OriginalMember(owner = "client!kf", name = "x", descriptor = "I")
    public static int field2783;

    @OriginalMember(owner = "client!kf", name = "y", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!kf", name = "A", descriptor = "I")
    public static int field2786;

    @OriginalMember(owner = "client!kf", name = "B", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!kf", name = "C", descriptor = "I")
    public static int field2788;

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "Lfl;")
    private class248 field2773;

    @OriginalMember(owner = "client!kf", name = "q", descriptor = "[B")
    private byte[] field2776;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "[I")
    public static int[] field2764;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I[BII)V")
    public final void method1231(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field2774++;
        if (this.field2769) {
            return;
        }
        if (arg3 != 0) {
            this.field2778 = null;
        }
        while (arg2 > 0) {
            int var5 = this.field2777.read(arg1, arg0, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg0 += var5;
            arg2 -= var5;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)I")
    public final int method1232(int arg0) throws IOException {
        if (arg0 == 22221) {
            field2768++;
            return this.field2769 ? 0 : this.field2777.read();
        } else {
            return -113;
        }
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)V")
    public final void method1233(int arg0) throws IOException {
        field2761++;
        if (this.field2769) {
            return;
        }
        if (this.field2775) {
            this.field2775 = false;
            throw new IOException();
        } else if (arg0 != 0) {
            field2763 = null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "run", descriptor = "()V")
    public final void run() {
        field2782++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field2780 == this.field2766) {
                        if (this.field2769) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    if (this.field2766 >= this.field2780) {
                        var2 = this.field2766 - this.field2780;
                    } else {
                        var2 = 5000 - this.field2780;
                    }
                    var3 = this.field2780;
                }
                if (var2 > 0) {
                    try {
                        this.field2778.write(this.field2776, var3, var2);
                    } catch (IOException var9) {
                        this.field2775 = true;
                    }
                    this.field2780 = (this.field2780 + var2) % 5000;
                    try {
                        if (this.field2780 == this.field2766) {
                            this.field2778.flush();
                        }
                    } catch (IOException var8) {
                        this.field2775 = true;
                    }
                }
            }
            try {
                if (this.field2777 != null) {
                    this.field2777.close();
                }
                if (this.field2778 != null) {
                    this.field2778.close();
                }
                if (this.field2760 != null) {
                    this.field2760.close();
                }
            } catch (IOException var7) {
            }
            this.field2776 = null;
        } catch (Exception var12) {
            class223.method1490(var12, (String) null, (byte) -50);
        }
    }

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "(I)I")
    public static final int method1234(int arg0) {
        if (arg0 != 3) {
            method1236(-81, (String) null, false, -30);
        }
        class31.field505 = 0;
        field2786++;
        return class50.method416(-26921);
    }

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "(I)V")
    public static void method1235(int arg0) {
        field2764 = null;
        field2763 = null;
        if (arg0 != -29513) {
            method1244(44);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILjava/lang/String;ZI)Z")
    public static final boolean method1236(int arg0, String arg1, boolean arg2, int arg3) {
        field2771++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
        if (arg0 != -4) {
            method1234(-110);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = arg1.length();
        int var7 = 0;
        for (int var8 = 0; var8 < var6; var8++) {
            char var9 = arg1.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg2) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                return false;
            }
            if (var11 >= arg3) {
                return false;
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg3 * var7 + var11;
            if ((var10 / arg3) != var7) {
                return false;
            }
            var7 = var10;
            var5 = true;
        }
        return var5;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lcd;ILna;ILtd;III)V")
    public static final void method1237(class28 arg0, int arg1, class32 arg2, int arg3, class73 arg4, int arg5, int arg6, int arg7) {
        class144 var8 = new class144();
        var8.field2242 = arg3 * arg6;
        field2788++;
        var8.field2250 = arg7;
        var8.field2241 = arg5 * 128;
        if (arg4 != null) {
            var8.field2228 = arg4;
            var8.field2252 = arg4.field1194;
            var8.field2232 = arg4.field1165;
            var8.field2243 = arg4.field1218;
            var8.field2227 = arg4.field1220;
            var8.field2235 = arg4.field1229;
            int var9 = arg4.field1227;
            var8.field2244 = arg4.field1184 * 128;
            int var10 = arg4.field1232;
            if (arg1 == 1 || arg1 == 3) {
                var9 = arg4.field1232;
                var10 = arg4.field1227;
            }
            var8.field2248 = (arg6 + var10) * 128;
            var8.field2245 = (arg5 + var9) * 128;
            if (arg4.field1189 != null) {
                var8.field2247 = true;
                var8.method996(true);
            }
            if (var8.field2227 != null) {
                var8.field2239 = (int) ((double) (var8.field2252 - var8.field2235) * Math.random()) + var8.field2235;
            }
            class286.field4493.method1013(arg3 + 312991476, var8);
        } else if (arg2 != null) {
            class217 var11 = arg2.field518;
            var8.field2249 = arg2;
            if (var11.field3405 != null) {
                var8.field2247 = true;
                var11 = var11.method1446(12);
            }
            if (var11 != null) {
                var8.field2245 = (var11.field3352 + arg5) * 128;
                var8.field2248 = (var11.field3352 + arg6) * 128;
                var8.field2243 = class7.method85(-1, arg2);
                var8.field2232 = var11.field3416;
                var8.field2244 = var11.field3401 * 128;
            }
            class203.field3164.method1013(312991604, var8);
        } else if (arg0 != null) {
            var8.field2240 = arg0;
            var8.field2248 = (arg0.method226((byte) -97) + arg6) * 128;
            var8.field2245 = (arg5 + arg0.method226((byte) -97)) * 128;
            var8.field2243 = class237.method1594((byte) 88, arg0);
            var8.field2244 = arg0.field444 * 128;
            var8.field2232 = arg0.field441;
            class61.field981.method1409(class247.method1668(arg0.field446, true), arg3 - 127, var8);
            return;
        }
    }

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "(I)V")
    public static final void method1238(int arg0) {
        class253 var1 = class276.field4349;
        synchronized (class276.field4349) {
            class3.field50 = class217.field3396;
            if (arg0 < 119) {
                return;
            }
            class187.field2820++;
            class188.field3012 = class144.field2251;
            class108.field1719 = class209.field3241;
            class71.field1137 = class241.field3728;
            class78.field1317 = class163.field2484;
            class126.field1985 = class276.field4331;
            class155.field2377 = class16.field267;
            class241.field3728 = 0;
        }
        field2767++;
    }

    @OriginalMember(owner = "client!kf", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field2770++;
        this.method1242((byte) 113);
    }

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "(I)V")
    public final void method1239(int arg0) {
        field2772++;
        if (this.field2769) {
            return;
        }
        if (arg0 != 128) {
            this.field2760 = null;
        }
        this.field2777 = new class151();
        this.field2778 = new class165();
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)I")
    public final int method1240(byte arg0) throws IOException {
        field2783++;
        if (this.field2769) {
            return 0;
        } else if (arg0 <= 5) {
            return -50;
        } else {
            return this.field2777.available();
        }
    }

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "(I)V")
    public static final void method1241(int arg0) {
        class132 var1 = class258.field3955;
        synchronized (class258.field3955) {
            class175.field2594++;
            class41.field671 = class73.field1214;
            if (class259.field3961 >= arg0) {
                while (class259.field3961 != class178.field2665) {
                    int var3 = class223.field3517[class178.field2665];
                    class178.field2665 = class178.field2665 + 1 & 0x7F;
                    if (var3 < 0) {
                        class145.field2256[~var3] = false;
                    } else {
                        class145.field2256[var3] = true;
                    }
                }
            } else {
                for (int var2 = 0; var2 < 112; var2++) {
                    class145.field2256[var2] = false;
                }
                class259.field3961 = class178.field2665;
            }
            class73.field1214 = class177.field2653;
        }
        field2765++;
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(B)V")
    public final void method1242(byte arg0) {
        field2784++;
        if (this.field2769) {
            return;
        }
        synchronized (this) {
            this.field2769 = true;
            this.notifyAll();
            if (arg0 != 113) {
                this.field2769 = true;
            }
        }
        if (this.field2773 != null) {
            while (this.field2773.field3828 == 0) {
                class42.method354(1L, false);
            }
            if (this.field2773.field3828 == 1) {
                try {
                    ((Thread) this.field2773.field3831).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field2773 = null;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I[BIB)V")
    public final void method1243(int arg0, byte[] arg1, int arg2, byte arg3) throws IOException {
        field2779++;
        if (this.field2769) {
            return;
        }
        if (this.field2775) {
            this.field2775 = false;
            throw new IOException();
        }
        if (this.field2776 == null) {
            this.field2776 = new byte[5000];
        }
        synchronized (this) {
            if (arg3 > -79) {
                field2785 = 33;
            }
            for (int var6 = 0; var6 < arg2; var6++) {
                this.field2776[this.field2766] = arg1[arg0 + var6];
                this.field2766 = (this.field2766 + 1) % 5000;
                if (((this.field2780 + 4900) % 5000) == this.field2766) {
                    throw new IOException();
                }
            }
            if (this.field2773 == null) {
                this.field2773 = this.field2762.method467(3, this, true);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "(I)V")
    public static final void method1244(int arg0) {
        field2787++;
        int var1 = class62.field994;
        if (arg0 >= -47) {
            method1234(87);
        }
        int var2 = class93.field1509;
        int var3 = class237.field3656 - class35.field573 - var2;
        int var4 = class205.field3183 - class277.field4369 - var1;
        if (var2 <= 0 && var3 <= 0 && var1 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class6.field114 != null) {
                var5 = class6.field114;
            } else if (class239.field3716 == null) {
                var5 = class22.field329.field934;
            } else {
                var5 = class239.field3716;
            }
            int var6 = 0;
            int var7 = 0;
            if (class239.field3716 == var5) {
                Insets var8 = class239.field3716.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var2 > 0) {
                var9.fillRect(var6, var7, var2, class205.field3183);
            }
            if (var1 > 0) {
                var9.fillRect(var6, var7, class237.field3656, var1);
            }
            if (var3 > 0) {
                var9.fillRect(var6 + class237.field3656 - var3, var7, var3, class205.field3183);
            }
            if (var4 > 0) {
                var9.fillRect(var6, class205.field3183 + var7 - var4, class237.field3656, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Ljava/net/Socket;Lja;)V")
    public class184(Socket arg0, class59 arg1) throws IOException {
        this.field2760 = arg0;
        this.field2762 = arg1;
        this.field2760.setSoTimeout(30000);
        this.field2760.setTcpNoDelay(true);
        this.field2777 = this.field2760.getInputStream();
        this.field2778 = this.field2760.getOutputStream();
    }
}
