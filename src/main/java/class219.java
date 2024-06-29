import java.awt.Component;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class219 implements Runnable {

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "Z")
    private boolean field3236 = false;

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "Z")
    private boolean field3241 = false;

    @OriginalMember(owner = "client!ak", name = "o", descriptor = "I")
    private int field3250 = 0;

    @OriginalMember(owner = "client!ak", name = "y", descriptor = "I")
    private int field3260 = 0;

    @OriginalMember(owner = "client!ak", name = "m", descriptor = "Ljava/net/Socket;")
    private Socket field3248;

    @OriginalMember(owner = "client!ak", name = "u", descriptor = "Lvj;")
    private class177 field3256;

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "Ljava/io/InputStream;")
    private InputStream field3240;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field3238;

    @OriginalMember(owner = "client!ak", name = "v", descriptor = "[I")
    public static int[] field3257 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!ak", name = "r", descriptor = "Lfg;")
    public static class18 field3253 = new class18(256);

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "I")
    public static int field3237;

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!ak", name = "i", descriptor = "I")
    public static int field3244;

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "I")
    public static int field3245;

    @OriginalMember(owner = "client!ak", name = "k", descriptor = "I")
    public static int field3246;

    @OriginalMember(owner = "client!ak", name = "l", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!ak", name = "n", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!ak", name = "p", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!ak", name = "q", descriptor = "I")
    public static int field3252;

    @OriginalMember(owner = "client!ak", name = "s", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!ak", name = "t", descriptor = "I")
    public static int field3255;

    @OriginalMember(owner = "client!ak", name = "w", descriptor = "I")
    public static int field3258;

    @OriginalMember(owner = "client!ak", name = "x", descriptor = "Lue;")
    private class131 field3259;

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "[B")
    private byte[] field3243;

    @OriginalMember(owner = "client!ak", name = "z", descriptor = "[Lpf;")
    public static class447[] field3261;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "([BIII)V", line = 4)
    public final void method1653(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field3254++;
        if (this.field3236) {
            return;
        }
        if (this.field3241) {
            this.field3241 = false;
            throw new IOException();
        }
        if (this.field3243 == null) {
            this.field3243 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg2; var6++) {
                this.field3243[this.field3250] = arg0[arg3 + var6];
                this.field3250 = (this.field3250 + 1) % 5000;
                if ((this.field3260 + 4900) % 5000 == this.field3250) {
                    throw new IOException();
                }
            }
            if (this.field3259 == null) {
                this.field3259 = this.field3256.method1384(this, true, 3);
            }
            if (arg1 != 3) {
                method1665((byte) 73, -9, 36);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)V", line = 55)
    public final void method1654(int arg0) {
        field3247++;
        if (this.field3236) {
            return;
        }
        synchronized (this) {
            this.field3236 = true;
            this.notifyAll();
        }
        if (this.field3259 != null) {
            while (this.field3259.field2121 == 0) {
                class134.method1106(1L, 10);
            }
            if (this.field3259.field2121 == 1) {
                try {
                    ((Thread) this.field3259.field2125).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        if (arg0 != -21013) {
            this.finalize();
        }
        this.field3259 = null;
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(I)I", line = 94)
    public final int method1655(int arg0) throws IOException {
        if (arg0 != -10561) {
            method1656(-21, 111, -96);
        }
        field3252++;
        return this.field3236 ? 0 : this.field3240.available();
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(III)Ljs;", line = 121)
    public static final class148 method1656(int arg0, int arg1, int arg2) {
        class168 var3 = class443.field6447[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2505;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)V", line = 128)
    public final void method1657(byte arg0) {
        field3237++;
        if (!this.field3236) {
            this.field3240 = new class21();
            int var2 = 126 % ((-arg0 - 46) / 62);
            this.field3238 = new class288();
        }
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(Ljava/net/Socket;Lvj;)V", line = 411)
    public class219(Socket arg0, class177 arg1) throws IOException {
        this.field3248 = arg0;
        this.field3256 = arg1;
        this.field3248.setSoTimeout(30000);
        this.field3248.setTcpNoDelay(true);
        this.field3240 = this.field3248.getInputStream();
        this.field3238 = this.field3248.getOutputStream();
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Ljava/awt/Component;Z)V", line = 151)
    public static final void method1658(Component arg0, boolean arg1) {
        field3251++;
        Method var2 = class177.field2655;
        if (var2 != null) {
            try {
                var2.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        if (arg1) {
            field3253 = null;
        }
        arg0.addKeyListener(class193.field2851);
        arg0.addFocusListener(class193.field2851);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I[BII)V", line = 180)
    public final void method1659(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        int var5 = -33 / ((75 - arg0) / 39);
        field3258++;
        if (this.field3236) {
            return;
        }
        while (arg2 > 0) {
            int var6 = this.field3240.read(arg1, arg3, arg2);
            if (var6 <= 0) {
                throw new EOFException();
            }
            arg3 += var6;
            arg2 -= var6;
        }
    }

    @OriginalMember(owner = "client!ak", name = "finalize", descriptor = "()V", line = 204)
    protected final void finalize() {
        this.method1654(-21013);
        field3246++;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIIIII)V", line = 212)
    public static final void method1660(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class257[] var7 = class431.field6220;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class257 var10 = var7[var8];
            if (var10 != null && var10.field3713 == 2) {
                class102.method837(var10.field3715 * 2, arg6, -77, (var10.field3714 - class294.field4362 << 7) + var10.field3716, (-class379.field5384 + var10.field3710 << 7) + var10.field3707, arg5, arg4 >> 1, arg0 >> 1);
                if (class435.field6340[0] > -1 && class267.field4002 % 20 < 10) {
                    class277.field4169[var10.field3721].method2645(arg1 + class435.field6340[0] - 12, arg2 - -class435.field6340[1] + -28);
                }
            }
        }
        int var9 = 46 % ((-arg3 - 21) / 63);
        field3255++;
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(I)V", line = 245)
    public static void method1661(int arg0) {
        field3261 = null;
        if (arg0 == 10) {
            field3253 = null;
            field3257 = null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "(I)I", line = 258)
    public final int method1662(int arg0) throws IOException {
        field3242++;
        if (this.field3236) {
            return 0;
        } else {
            if (arg0 != 1) {
                field3261 = null;
            }
            return this.field3240.read();
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILqo;)V", line = 278)
    public static final void method1663(int arg0, class127 arg1) {
        field3239++;
        class324 var2 = (class324) class356.field5056.method1219((long) arg1.field5657, -103);
        int var3 = -66 % ((-arg0 - 57) / 42);
        if (var2 == null) {
            class402.method2554(arg1.field5694[0], class367.field5213, arg1, 0, arg1.field5696[0], (class45) null, (byte) -113, (class98) null);
        } else {
            var2.method2153(0);
        }
    }

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "(I)V", line = 296)
    public final void method1664(int arg0) throws IOException {
        field3244++;
        if (this.field3236) {
            return;
        }
        if (arg0 != 2) {
            this.field3243 = null;
        }
        if (this.field3241) {
            this.field3241 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(BII)I", line = 324)
    public static final int method1665(byte arg0, int arg1, int arg2) {
        field3249++;
        if (arg0 != 86) {
            method1660(-97, -115, -120, -114, -66, -56, -36);
        }
        return arg1 == 4 || arg1 == 5 ? class279.field4191[arg2 & 0x3] : 256;
    }

    @OriginalMember(owner = "client!ak", name = "run", descriptor = "()V", line = 342)
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field3260 == this.field3250) {
                            if (this.field3236) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        if (this.field3250 < this.field3260) {
                            var2 = 5000 - this.field3260;
                        } else {
                            var2 = this.field3250 - this.field3260;
                        }
                        var3 = this.field3260;
                    }
                    if (var2 <= 0) {
                        continue;
                    }
                    try {
                        this.field3238.write(this.field3243, var3, var2);
                    } catch (IOException var9) {
                        this.field3241 = true;
                    }
                    this.field3260 = (this.field3260 + var2) % 5000;
                    try {
                        if (this.field3260 == this.field3250) {
                            this.field3238.flush();
                        }
                    } catch (IOException var8) {
                        this.field3241 = true;
                    }
                    continue;
                }
                try {
                    if (this.field3240 != null) {
                        this.field3240.close();
                    }
                    if (this.field3238 != null) {
                        this.field3238.close();
                    }
                    if (this.field3248 != null) {
                        this.field3248.close();
                    }
                } catch (IOException var7) {
                }
                this.field3243 = null;
                break;
            }
        } catch (Exception var12) {
            class282.method2003((String) null, -24830, var12);
        }
        field3245++;
    }
}
