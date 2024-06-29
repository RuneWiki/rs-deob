import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class294 implements Runnable {

    @OriginalMember(owner = "client!pi", name = "l", descriptor = "I")
    private int field5050 = 0;

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "Z")
    private boolean field5045 = false;

    @OriginalMember(owner = "client!pi", name = "p", descriptor = "Z")
    private boolean field5054 = false;

    @OriginalMember(owner = "client!pi", name = "o", descriptor = "I")
    private int field5053 = 0;

    @OriginalMember(owner = "client!pi", name = "k", descriptor = "Ljava/net/Socket;")
    private Socket field5049;

    @OriginalMember(owner = "client!pi", name = "w", descriptor = "Lcl;")
    private class124 field5061;

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "Ljava/io/InputStream;")
    private InputStream field5044;

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field5046;

    @OriginalMember(owner = "client!pi", name = "j", descriptor = "Lwa;")
    public static class75 field5048 = class66.method560("sch-Utteln:", false);

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "Lwa;")
    public static class75 field5040 = class66.method560("M", false);

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "I")
    public static int field5041 = 100;

    @OriginalMember(owner = "client!pi", name = "x", descriptor = "Lgb;")
    public static class158 field5062 = new class158(30);

    @OriginalMember(owner = "client!pi", name = "z", descriptor = "Lwa;")
    public static class75 field5064 = class66.method560("hint_headicons", false);

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "I")
    public static int field5039;

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "I")
    public static int field5042;

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "I")
    public static int field5043;

    @OriginalMember(owner = "client!pi", name = "i", descriptor = "I")
    public static int field5047;

    @OriginalMember(owner = "client!pi", name = "r", descriptor = "I")
    public static int field5056;

    @OriginalMember(owner = "client!pi", name = "s", descriptor = "I")
    public static int field5057;

    @OriginalMember(owner = "client!pi", name = "t", descriptor = "I")
    public static int field5058;

    @OriginalMember(owner = "client!pi", name = "u", descriptor = "I")
    public static int field5059;

    @OriginalMember(owner = "client!pi", name = "v", descriptor = "I")
    public static int field5060;

    @OriginalMember(owner = "client!pi", name = "y", descriptor = "Lcb;")
    public static class267 field5063;

    @OriginalMember(owner = "client!pi", name = "m", descriptor = "Lbi;")
    private class77 field5051;

    @OriginalMember(owner = "client!pi", name = "n", descriptor = "[B")
    private byte[] field5052;

    @OriginalMember(owner = "client!pi", name = "q", descriptor = "[[B")
    public static byte[][] field5055;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(BI)V", line = 16)
    public static final void method2041(byte arg0, int arg1) {
        if (arg0 != -68) {
            field5063 = (class267) null;
        }
        field5042++;
        if (class274.field4731 == arg1 && arg1 != 0) {
            class243 var2 = class302.field5164[arg1];
            var2.method161(class20.field269);
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)I", line = 40)
    public final int method2042(int arg0) throws IOException {
        field5058++;
        if (this.field5054) {
            return 0;
        } else {
            if (arg0 >= -30) {
                field5048 = (class75) null;
            }
            return this.field5044.available();
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "([BIII)V", line = 62)
    public final void method2043(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field5039++;
        if (this.field5054) {
            return;
        }
        if (this.field5045) {
            this.field5045 = false;
            throw new IOException();
        }
        if (this.field5052 == null) {
            this.field5052 = new byte[5000];
        }
        synchronized (this) {
            int var6 = 0;
            if (arg3 != -31544) {
                this.field5046 = (OutputStream) null;
            }
            while (var6 < arg1) {
                this.field5052[this.field5050] = arg0[arg2 + var6];
                this.field5050 = (this.field5050 + 1) % 5000;
                if ((this.field5053 + 4900) % 5000 == this.field5050) {
                    throw new IOException();
                }
                var6++;
            }
            if (this.field5051 == null) {
                this.field5051 = this.field5061.method947(arg3 ^ 0xFFFF84C8, this, 3);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Ljava/net/Socket;Lcl;)V", line = 245)
    public class294(Socket arg0, class124 arg1) throws IOException {
        this.field5049 = arg0;
        this.field5061 = arg1;
        this.field5049.setSoTimeout(30000);
        this.field5049.setTcpNoDelay(true);
        this.field5044 = this.field5049.getInputStream();
        this.field5046 = this.field5049.getOutputStream();
    }

    @OriginalMember(owner = "client!pi", name = "run", descriptor = "()V", line = 126)
    public final void run() {
        field5056++;
        try {
            while (true) {
                int var3;
                int var4;
                synchronized (this) {
                    if (this.field5053 == this.field5050) {
                        if (this.field5054) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var13) {
                        }
                    }
                    var3 = this.field5053;
                    if (this.field5053 > this.field5050) {
                        var4 = 5000 - this.field5053;
                    } else {
                        var4 = this.field5050 - this.field5053;
                    }
                }
                if (var4 > 0) {
                    try {
                        this.field5046.write(this.field5052, var3, var4);
                    } catch (IOException var12) {
                        this.field5045 = true;
                    }
                    this.field5053 = (this.field5053 + var4) % 5000;
                    try {
                        if (this.field5053 == this.field5050) {
                            this.field5046.flush();
                        }
                    } catch (IOException var11) {
                        this.field5045 = true;
                    }
                }
            }
            try {
                if (this.field5044 != null) {
                    this.field5044.close();
                }
                if (this.field5046 != null) {
                    this.field5046.close();
                }
                if (this.field5049 != null) {
                    this.field5049.close();
                }
            } catch (IOException var10) {
            }
            this.field5052 = null;
        } catch (Exception var15) {
            class17.method100(var15, -14020, (String) null);
        }
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(I)V", line = 208)
    public static void method2044(int arg0) {
        field5064 = null;
        field5048 = null;
        field5040 = null;
        field5062 = null;
        field5055 = (byte[][]) null;
        if (arg0 >= -44) {
            method2044(24);
        }
        field5063 = null;
    }

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "(I)I", line = 224)
    public final int method2045(int arg0) throws IOException {
        if (arg0 < 1) {
            method2044(-113);
        }
        field5047++;
        return this.field5054 ? 0 : this.field5044.read();
    }

    @OriginalMember(owner = "client!pi", name = "finalize", descriptor = "()V", line = 239)
    protected final void finalize() {
        this.method2048((byte) -119);
        field5043++;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V", line = 258)
    public static final void method2046(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class150.field2573 * 128) {
            arg0 = class150.field2573 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class262.field4440 * 128) {
            arg2 = class262.field4440 * 128 - 1;
        }
        class42.field701 = class21.field288[arg3];
        class130.field2257 = class21.field286[arg3];
        class270.field4667 = class21.field288[arg4];
        class34.field501 = class21.field286[arg4];
        class199.field3347 = arg0;
        class300.field5129 = arg1;
        class207.field3509 = arg2;
        class53.field875 = arg0 / 128;
        class188.field3131 = arg2 / 128;
        class217.field3710 = class53.field875 - class260.field4359;
        if (class217.field3710 < 0) {
            class217.field3710 = 0;
        }
        class255.field4270 = class188.field3131 - class260.field4359;
        if (class255.field4270 < 0) {
            class255.field4270 = 0;
        }
        class182.field3039 = class53.field875 + class260.field4359;
        if (class182.field3039 > class150.field2573) {
            class182.field3039 = class150.field2573;
        }
        class260.field4360 = class260.field4359 + class188.field3131;
        if (class260.field4360 > class262.field4440) {
            class260.field4360 = class262.field4440;
        }
        short var15 = 3584;
        for (int var16 = 0; var16 < class260.field4359 + class260.field4359 + 2; var16++) {
            for (int var17 = 0; var17 < class260.field4359 + class260.field4359 + 2; var17++) {
                int var18 = (var16 - class260.field4359 << 7) - (class199.field3347 & 0x7F);
                int var19 = (var17 - class260.field4359 << 7) - (class207.field3509 & 0x7F);
                int var20 = class53.field875 + var16 - class260.field4359;
                int var21 = class188.field3131 + var17 - class260.field4359;
                if (var20 >= 0 && var21 >= 0 && var20 < class150.field2573 && var21 < class262.field4440) {
                    int var22;
                    if (class156.field2669 == null) {
                        var22 = class60.field1058[0][var20][var21] + 128 - class300.field5129;
                    } else {
                        var22 = class156.field2669[0][var20][var21] + 128 - class300.field5129;
                    }
                    int var23 = class60.field1058[3][var20][var21] - class300.field5129 - 1000;
                    class147.field2554[var16][var17] = class211.method1559(var18, var23, var22, var19, var15);
                } else {
                    class147.field2554[var16][var17] = false;
                }
            }
        }
        for (int var24 = 0; var24 < class260.field4359 + class260.field4359 + 1; var24++) {
            for (int var25 = 0; var25 < class260.field4359 + class260.field4359 + 1; var25++) {
                class7.field84[var24][var25] = class147.field2554[var24][var25] || class147.field2554[var24 + 1][var25] || class147.field2554[var24][var25 + 1] || class147.field2554[var24 + 1][var25 + 1];
            }
        }
        class65.field1123 = arg6;
        class137.field2347 = arg7;
        class63.field1094 = arg8;
        class177.field2972 = arg9;
        class82.field1376 = arg10;
        class287.method2018();
        if (class91.field1501 != null) {
            class258.method1844(true);
            class261.method1861(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg13, arg14);
            class156.field2682 = false;
            class140.method1079(0, (byte) -79, 0);
            class239.method1740((float[]) null);
            class209.method1554();
            class258.method1844(false);
        }
        class261.method1861(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "([BIII)V", line = 380)
    public final void method2047(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        if (arg3 != -3532) {
            field5064 = (class75) null;
        }
        field5059++;
        if (this.field5054) {
            return;
        }
        while (arg2 > 0) {
            int var5 = this.field5044.read(arg0, arg1, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 += var5;
            arg2 -= var5;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)V", line = 412)
    public final void method2048(byte arg0) {
        if (arg0 > -45) {
            return;
        }
        field5057++;
        if (this.field5054) {
            return;
        }
        synchronized (this) {
            this.field5054 = true;
            this.notifyAll();
        }
        if (this.field5051 != null) {
            while (this.field5051.field1330 == 0) {
                class235.method1708(62, 1L);
            }
            if (this.field5051.field1330 == 1) {
                try {
                    ((Thread) this.field5051.field1329).join();
                } catch (InterruptedException var5) {
                }
            }
        }
        this.field5051 = null;
    }
}
