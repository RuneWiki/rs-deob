import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class359 implements Runnable {

    @OriginalMember(owner = "client!kd", name = "k", descriptor = "Z")
    private boolean field5294 = false;

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "I")
    private int field5289 = 0;

    @OriginalMember(owner = "client!kd", name = "t", descriptor = "Z")
    private boolean field5303 = false;

    @OriginalMember(owner = "client!kd", name = "A", descriptor = "I")
    private int field5310 = 0;

    @OriginalMember(owner = "client!kd", name = "n", descriptor = "Lsc;")
    private class239 field5297;

    @OriginalMember(owner = "client!kd", name = "m", descriptor = "Ljava/net/Socket;")
    private Socket field5296;

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "Ljava/io/InputStream;")
    private InputStream field5293;

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field5288;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "[J")
    public static long[] field5286 = new long[256];

    @OriginalMember(owner = "client!kd", name = "z", descriptor = "[Lef;")
    public static class385[] field5309;

    @OriginalMember(owner = "client!kd", name = "B", descriptor = "Z")
    public static boolean field5311;

    @OriginalMember(owner = "client!kd", name = "u", descriptor = "Lwl;")
    public static class452 field5304;

    @OriginalMember(owner = "client!kd", name = "D", descriptor = "Ljg;")
    public static class241 field5313;

    @OriginalMember(owner = "client!kd", name = "E", descriptor = "Lnn;")
    public static class151 field5314;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
    public static int field5284;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "I")
    public static int field5287;

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "I")
    public static int field5290;

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "I")
    public static int field5291;

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "I")
    public static int field5292;

    @OriginalMember(owner = "client!kd", name = "o", descriptor = "I")
    public static int field5298;

    @OriginalMember(owner = "client!kd", name = "p", descriptor = "I")
    public static int field5299;

    @OriginalMember(owner = "client!kd", name = "q", descriptor = "I")
    public static int field5300;

    @OriginalMember(owner = "client!kd", name = "r", descriptor = "I")
    public static int field5301;

    @OriginalMember(owner = "client!kd", name = "s", descriptor = "I")
    public static int field5302;

    @OriginalMember(owner = "client!kd", name = "v", descriptor = "I")
    public static int field5305;

    @OriginalMember(owner = "client!kd", name = "w", descriptor = "I")
    public static int field5306;

    @OriginalMember(owner = "client!kd", name = "x", descriptor = "I")
    public static int field5307;

    @OriginalMember(owner = "client!kd", name = "y", descriptor = "I")
    public static int field5308;

    @OriginalMember(owner = "client!kd", name = "C", descriptor = "I")
    public static int field5312;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "Lbl;")
    private class211 field5285;

    @OriginalMember(owner = "client!kd", name = "l", descriptor = "[B")
    private byte[] field5295;

    @OriginalMember(owner = "client!kd", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field5310 == this.field5289) {
                            if (this.field5294) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        var2 = this.field5310;
                        if (this.field5289 >= this.field5310) {
                            var3 = this.field5289 - this.field5310;
                        } else {
                            var3 = 5000 - this.field5310;
                        }
                    }
                    if (var3 <= 0) {
                        continue;
                    }
                    try {
                        this.field5288.write(this.field5295, var2, var3);
                    } catch (IOException var9) {
                        this.field5303 = true;
                    }
                    this.field5310 = (this.field5310 + var3) % 5000;
                    try {
                        if (this.field5310 == this.field5289) {
                            this.field5288.flush();
                        }
                    } catch (IOException var8) {
                        this.field5303 = true;
                    }
                    continue;
                }
                try {
                    if (this.field5293 != null) {
                        this.field5293.close();
                    }
                    if (this.field5288 != null) {
                        this.field5288.close();
                    }
                    if (this.field5296 != null) {
                        this.field5296.close();
                    }
                } catch (IOException var7) {
                }
                this.field5295 = null;
                break;
            }
        } catch (Exception var12) {
            class288.method1783((String) null, var12, -70);
        }
        field5308++;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)I")
    public final int method2156(boolean arg0) throws IOException {
        if (!arg0) {
            method2166((byte) 104);
        }
        field5284++;
        return this.field5294 ? 0 : this.field5293.read();
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method2157(byte arg0, String arg1) {
        field5306++;
        if (arg1.equals("")) {
            return;
        }
        class380.field5544++;
        class177.method1082(class25.field321, 0);
        int var2 = 5 / ((arg0 + 52) / 45);
        class189.field2840.method2366(class386.method2384(-4580, arg1), true);
        class189.field2840.method2375(-18, arg1);
    }

    @OriginalMember(owner = "client!kd", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method2163(true);
        field5290++;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(Z)I")
    public final int method2158(boolean arg0) throws IOException {
        if (arg0) {
            field5309 = null;
        }
        field5287++;
        return this.field5294 ? 0 : this.field5293.available();
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(BII[B)V")
    public final void method2159(byte arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field5300++;
        if (this.field5294) {
            return;
        }
        while (arg2 > 0) {
            int var5 = this.field5293.read(arg3, arg1, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 += var5;
            arg2 -= var5;
        }
        if (arg0 != -128) {
            this.method2163(false);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)V")
    public static void method2160(byte arg0) {
        field5309 = null;
        field5304 = null;
        field5314 = null;
        field5313 = null;
        field5286 = null;
        if (arg0 <= 48) {
            field5304 = null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(BLjava/lang/String;III[B)I")
    public static final int method2161(byte arg0, String arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        field5298++;
        int var6 = arg3 - arg4;
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg1.charAt(arg4 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg5[arg2 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg5[arg2 + var7] = -128;
            } else if (var8 == '‚') {
                arg5[arg2 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg5[arg2 + var7] = -125;
            } else if (var8 == '„') {
                arg5[arg2 + var7] = -124;
            } else if (var8 == '…') {
                arg5[arg2 + var7] = -123;
            } else if (var8 == '†') {
                arg5[arg2 + var7] = -122;
            } else if (var8 == '‡') {
                arg5[arg2 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg5[arg2 + var7] = -120;
            } else if (var8 == '‰') {
                arg5[arg2 + var7] = -119;
            } else if (var8 == 'Š') {
                arg5[arg2 + var7] = -118;
            } else if (var8 == '‹') {
                arg5[arg2 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg5[arg2 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg5[arg2 + var7] = -114;
            } else if (var8 == '‘') {
                arg5[arg2 + var7] = -111;
            } else if (var8 == '’') {
                arg5[arg2 + var7] = -110;
            } else if (var8 == '“') {
                arg5[arg2 + var7] = -109;
            } else if (var8 == '”') {
                arg5[arg2 + var7] = -108;
            } else if (var8 == '•') {
                arg5[arg2 + var7] = -107;
            } else if (var8 == '–') {
                arg5[arg2 + var7] = -106;
            } else if (var8 == '—') {
                arg5[arg2 + var7] = -105;
            } else if (var8 == '˜') {
                arg5[arg2 + var7] = -104;
            } else if (var8 == '™') {
                arg5[arg2 + var7] = -103;
            } else if (var8 == 'š') {
                arg5[arg2 + var7] = -102;
            } else if (var8 == '›') {
                arg5[arg2 + var7] = -101;
            } else if (var8 == 'œ') {
                arg5[arg2 + var7] = -100;
            } else if (var8 == 'ž') {
                arg5[arg2 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg5[arg2 + var7] = -97;
            } else {
                arg5[arg2 + var7] = 63;
            }
        }
        if (arg0 != -100) {
            field5304 = null;
        }
        return var6;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method2162(String arg0, byte arg1) {
        field5312++;
        if (arg0 == null) {
            return;
        }
        if (arg0.startsWith("*")) {
            arg0 = arg0.substring(1);
        }
        String var2 = class171.method1054(0, arg0);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class145.field1985; var3++) {
            String var4 = class137.field1853[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class171.method1054(0, var4);
            if (var5 != null && var5.equals(var2)) {
                class145.field1985--;
                for (int var6 = var3; var6 < class145.field1985; var6++) {
                    class137.field1853[var6] = class137.field1853[var6 + 1];
                    class112.field1486[var6] = class112.field1486[var6 + 1];
                    class151.field2089[var6] = class151.field2089[var6 + 1];
                    class255.field3941[var6] = class255.field3941[var6 + 1];
                    class418.field6199[var6] = class418.field6199[var6 + 1];
                    class189.field2837[var6] = class189.field2837[var6 + 1];
                }
                class72.field958 = class172.field2639;
                class431.field6329++;
                class177.method1082(class386.field5701, 0);
                class189.field2840.method2366(class386.method2384(-4580, arg0), true);
                class189.field2840.method2375(125, arg0);
                break;
            }
        }
        if (arg1 < 24) {
            method2157((byte) 96, (String) null);
        }
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(Z)V")
    public final void method2163(boolean arg0) {
        field5291++;
        if (this.field5294) {
            return;
        }
        synchronized (this) {
            this.field5294 = arg0;
            this.notifyAll();
        }
        if (this.field5285 != null) {
            while (this.field5285.field3172 == 0) {
                class109.method674((byte) 99, 1L);
            }
            if (this.field5285.field3172 == 1) {
                try {
                    ((Thread) this.field5285.field3175).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field5285 = null;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IBI[B)V")
    public final void method2164(int arg0, byte arg1, int arg2, byte[] arg3) throws IOException {
        if (arg1 != -35) {
            this.field5293 = null;
        }
        field5307++;
        if (this.field5294) {
            return;
        }
        if (this.field5303) {
            this.field5303 = false;
            throw new IOException();
        }
        if (this.field5295 == null) {
            this.field5295 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg2; var6++) {
                this.field5295[this.field5289] = arg3[arg0 + var6];
                this.field5289 = (this.field5289 + 1) % 5000;
                if (((this.field5310 + 4900) % 5000) == this.field5289) {
                    throw new IOException();
                }
            }
            if (this.field5285 == null) {
                this.field5285 = this.field5297.method1438(false, 3, this);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
    public final void method2165(int arg0) {
        field5302++;
        if (arg0 <= -35 && !this.field5294) {
            this.field5293 = new class422();
            this.field5288 = new class442();
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(B)V")
    public static final void method2166(byte arg0) {
        int var1 = 0;
        if (arg0 < 49) {
            return;
        }
        while (var1 < class341.field5085.length) {
            for (int var2 = 0; var2 < class341.field5085[0].length; var2++) {
                for (int var3 = 0; var3 < class341.field5085[0][0].length; var3++) {
                    class341.field5085[var1][var2][var3] = 0;
                }
            }
            var1++;
        }
        field5301++;
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(B)V")
    public final void method2167(byte arg0) throws IOException {
        field5305++;
        if (this.field5294) {
            return;
        }
        if (arg0 != -43) {
            field5286 = null;
        }
        if (this.field5303) {
            this.field5303 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)V")
    public static final void method2168(int arg0) {
        if (arg0 != -4540) {
            field5286 = null;
        }
        class241 var1 = class427.field6296;
        synchronized (class427.field6296) {
            class427.field6296.method1482((byte) -111);
        }
        field5299++;
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Ljava/net/Socket;Lsc;)V")
    public class359(Socket arg0, class239 arg1) throws IOException {
        this.field5297 = arg1;
        this.field5296 = arg0;
        this.field5296.setSoTimeout(30000);
        this.field5296.setTcpNoDelay(true);
        this.field5293 = this.field5296.getInputStream();
        this.field5288 = this.field5296.getOutputStream();
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
            field5286[var0] = var1;
        }
        field5309 = new class385[2048];
        field5311 = false;
        field5304 = new class452(46, 5);
        field5313 = new class241(4);
        field5314 = new class151("red:", "rot:", "rouge:", "vermelho:");
    }
}
