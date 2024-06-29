import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class102 implements Runnable {

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "I")
    private int field2131 = 0;

    @OriginalMember(owner = "client!kg", name = "s", descriptor = "I")
    private int field2141 = 0;

    @OriginalMember(owner = "client!kg", name = "n", descriptor = "Z")
    private boolean field2136 = false;

    @OriginalMember(owner = "client!kg", name = "q", descriptor = "Z")
    private boolean field2139 = false;

    @OriginalMember(owner = "client!kg", name = "y", descriptor = "Ljava/net/Socket;")
    private Socket field2147;

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "Lgg;")
    private class67 field2130;

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "Ljava/io/InputStream;")
    private InputStream field2127;

    @OriginalMember(owner = "client!kg", name = "l", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field2134;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "I")
    public static int field2123;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "I")
    public static int field2125;

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "I")
    public static int field2126;

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "I")
    public static int field2128;

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "I")
    public static int field2129;

    @OriginalMember(owner = "client!kg", name = "k", descriptor = "I")
    public static int field2133;

    @OriginalMember(owner = "client!kg", name = "r", descriptor = "I")
    public static int field2140;

    @OriginalMember(owner = "client!kg", name = "t", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!kg", name = "u", descriptor = "I")
    public static int field2143;

    @OriginalMember(owner = "client!kg", name = "v", descriptor = "I")
    public static int field2144;

    @OriginalMember(owner = "client!kg", name = "x", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!kg", name = "z", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!kg", name = "A", descriptor = "I")
    public static int field2149;

    @OriginalMember(owner = "client!kg", name = "w", descriptor = "Luf;")
    public static class190 field2145;

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "Lea;")
    private class42 field2124;

    @OriginalMember(owner = "client!kg", name = "j", descriptor = "[B")
    private byte[] field2132;

    @OriginalMember(owner = "client!kg", name = "m", descriptor = "[I")
    public static int[] field2135;

    @OriginalMember(owner = "client!kg", name = "o", descriptor = "[Lrh;")
    public static class165[] field2137;

    @OriginalMember(owner = "client!kg", name = "p", descriptor = "[[[B")
    public static byte[][][] field2138;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)I")
    public final int method693(int arg0) throws IOException {
        field2125++;
        if (arg0 > -107) {
            this.method694((byte) -125);
        }
        return this.field2136 ? 0 : this.field2127.available();
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)V")
    public final void method694(byte arg0) {
        field2142++;
        if (this.field2136) {
            return;
        }
        synchronized (this) {
            this.field2136 = true;
            this.notifyAll();
            if (arg0 > -55) {
                method700(20, null, (byte) -11, 34);
            }
        }
        if (this.field2124 != null) {
            while (this.field2124.field855 == 0) {
                class25.method151(1L, (byte) 0);
            }
            if (this.field2124.field855 == 1) {
                try {
                    ((Thread) this.field2124.field854).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field2124 = null;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Z)I")
    public final int method695(boolean arg0) throws IOException {
        if (arg0) {
            return 123;
        } else {
            field2146++;
            return this.field2136 ? 0 : this.field2127.read();
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Ldg;IIII)V")
    public static final void method696(class38 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= -71) {
            method698(-42, 38);
        }
        field2143++;
        if (class56.field1136 == arg0 || class184.field3678 >= 400) {
            return;
        }
        class163 var5;
        if (arg0.field761 == 0) {
            var5 = class180.method1216(new class163[] { arg0.field758, class195.method1300(arg0.field753, class56.field1136.field753, -43), class150.field3106, class22.field392, class34.method217(arg0.field753, -46), class21.field365 }, false);
        } else {
            var5 = class180.method1216(new class163[] { arg0.field758, class150.field3106, class26.field473, class34.method217(arg0.field761, -63), class21.field365 }, false);
        }
        if (class62.field1326 == 1) {
            class63.field1333++;
            class62.method453((short) 43, (long) arg2, arg3, arg4, class193.field3794, (byte) 113, class180.method1216(new class163[] { class119.field2516, class22.field391, var5 }, false));
        } else if (!class189.field3766) {
            for (int var6 = 7; var6 >= 0; var6--) {
                if (class9.field180[var6] != null) {
                    short var7 = 0;
                    class154.field3180++;
                    boolean var8 = false;
                    if (class9.field180[var6].method1038(class112.field2363, 0)) {
                        if (arg0.field753 > class56.field1136.field753) {
                            var7 = 2000;
                        }
                        if (class56.field1136.field770 != 0 && arg0.field770 != 0) {
                            if (class56.field1136.field770 == arg0.field770) {
                                var7 = 2000;
                            } else {
                                var7 = 0;
                            }
                        }
                    } else if (class151.field3110[var6]) {
                        var7 = 2000;
                    }
                    short var9 = class11.field213[var6];
                    short var10 = (short) (var7 + var9);
                    class62.method453(var10, (long) arg2, arg3, arg4, class9.field180[var6], (byte) 114, class180.method1216(new class163[] { class168.field3403, var5 }, false));
                }
            }
        } else if ((class112.field2362 & 0x8) == 8) {
            class62.method453((short) 45, (long) arg2, arg3, arg4, class181.field3635, (byte) -53, class180.method1216(new class163[] { class6.field134, class22.field391, var5 }, false));
            class26.field482++;
        }
        for (int var11 = 0; var11 < class184.field3678; var11++) {
            if (class21.field373[var11] == 5) {
                class197.field3918[var11] = class180.method1216(new class163[] { class168.field3403, var5 }, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "([BIBI)V")
    public final void method697(byte[] arg0, int arg1, byte arg2, int arg3) throws IOException {
        field2149++;
        if (this.field2136) {
            return;
        }
        if (this.field2139) {
            this.field2139 = false;
            throw new IOException();
        }
        if (this.field2132 == null) {
            this.field2132 = new byte[5000];
        }
        synchronized (this) {
            if (arg2 <= -109) {
                for (int var6 = 0; var6 < arg1; var6++) {
                    this.field2132[this.field2141] = arg0[arg3 + var6];
                    this.field2141 = (this.field2141 + 1) % 5000;
                    if ((this.field2131 + 4900) % 5000 == this.field2141) {
                        throw new IOException();
                    }
                }
                if (this.field2124 == null) {
                    this.field2124 = this.field2130.method481(3, this, (byte) 81);
                }
                this.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!kg", name = "run", descriptor = "()V")
    public final void run() {
        field2133++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field2141 == this.field2131) {
                        if (this.field2136) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    if (this.field2141 < this.field2131) {
                        var2 = 5000 - this.field2131;
                    } else {
                        var2 = this.field2141 - this.field2131;
                    }
                    var3 = this.field2131;
                }
                if (var2 > 0) {
                    try {
                        this.field2134.write(this.field2132, var3, var2);
                    } catch (IOException var9) {
                        this.field2139 = true;
                    }
                    this.field2131 = (this.field2131 + var2) % 5000;
                    try {
                        if (this.field2141 == this.field2131) {
                            this.field2134.flush();
                        }
                    } catch (IOException var8) {
                        this.field2139 = true;
                    }
                }
            }
            try {
                if (this.field2127 != null) {
                    this.field2127.close();
                }
                if (this.field2134 != null) {
                    this.field2134.close();
                }
                if (this.field2147 != null) {
                    this.field2147.close();
                }
            } catch (IOException var7) {
            }
            this.field2132 = null;
        } catch (Exception var12) {
            class152.method980(var12, null, true);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(II)Z")
    public static final boolean method698(int arg0, int arg1) {
        if (arg0 == -5542) {
            field2140++;
            return (arg1 >> 29 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IZI[B)V")
    public final void method699(int arg0, boolean arg1, int arg2, byte[] arg3) throws IOException {
        field2144++;
        if (this.field2136) {
            return;
        }
        while (arg2 > 0) {
            int var5 = this.field2127.read(arg3, arg0, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg0 += var5;
            arg2 -= var5;
        }
        if (!arg1) {
            this.field2124 = null;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILu;BI)Z")
    public static final boolean method700(int arg0, class184 arg1, byte arg2, int arg3) {
        field2128++;
        byte[] var4 = arg1.method1235(arg3, (byte) -64, arg0);
        if (var4 == null) {
            return false;
        }
        if (arg2 > -6) {
            field2129 = 94;
        }
        class99.method679(var4, (byte) -3);
        return true;
    }

    @OriginalMember(owner = "client!kg", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method694((byte) -106);
        field2126++;
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(B)V")
    public static void method701(byte arg0) {
        field2137 = null;
        field2145 = null;
        field2135 = null;
        if (arg0 != 1) {
            method698(-85, 38);
        }
        field2138 = null;
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Ljava/net/Socket;Lgg;)V")
    public class102(Socket arg0, class67 arg1) throws IOException {
        this.field2147 = arg0;
        this.field2130 = arg1;
        this.field2147.setSoTimeout(30000);
        this.field2147.setTcpNoDelay(true);
        this.field2127 = this.field2147.getInputStream();
        this.field2134 = this.field2147.getOutputStream();
    }
}
