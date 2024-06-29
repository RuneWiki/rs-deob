import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class130 implements Runnable {

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
    private int field2283 = 0;

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "I")
    private int field2294 = 0;

    @OriginalMember(owner = "client!lb", name = "r", descriptor = "Z")
    private boolean field2298 = false;

    @OriginalMember(owner = "client!lb", name = "B", descriptor = "Z")
    private boolean field2308 = false;

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "Ljava/net/Socket;")
    private Socket field2295;

    @OriginalMember(owner = "client!lb", name = "E", descriptor = "Llh;")
    private class286 field2311;

    @OriginalMember(owner = "client!lb", name = "u", descriptor = "Ljava/io/InputStream;")
    private InputStream field2301;

    @OriginalMember(owner = "client!lb", name = "A", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field2307;

    @OriginalMember(owner = "client!lb", name = "w", descriptor = "Lcf;")
    public static class93 field2303 = class147.method1066(" steht bereits auf Ihrer Freunde)2Liste(Q", -48);

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "Lcf;")
    public static class93 field2296 = class147.method1066("0(U", -48);

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "I")
    public static int field2287 = -1;

    @OriginalMember(owner = "client!lb", name = "D", descriptor = "Lcf;")
    public static class93 field2310 = class147.method1066(": ", -48);

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "S")
    public static short field2292 = 320;

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "Lcf;")
    public static class93 field2293 = class147.method1066(" loggt sich aus)3", -48);

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "I")
    public static int field2281;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "I")
    public static int field2284;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "I")
    public static int field2286;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "I")
    public static int field2288;

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
    public static int field2290;

    @OriginalMember(owner = "client!lb", name = "q", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "client!lb", name = "t", descriptor = "I")
    public static int field2300;

    @OriginalMember(owner = "client!lb", name = "v", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!lb", name = "x", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!lb", name = "y", descriptor = "I")
    public static int field2305;

    @OriginalMember(owner = "client!lb", name = "z", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!lb", name = "C", descriptor = "I")
    public static int field2309;

    @OriginalMember(owner = "client!lb", name = "s", descriptor = "Lhg;")
    public static class177 field2299;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "Lwd;")
    private class22 field2282;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "[B")
    private byte[] field2291;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "[Ldh;")
    public static class120[] field2289;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "([BBII)V")
    public final void method945(byte[] arg0, byte arg1, int arg2, int arg3) throws IOException {
        field2302++;
        if (arg1 <= 126 || this.field2308) {
            return;
        }
        if (this.field2298) {
            this.field2298 = false;
            throw new IOException();
        }
        if (this.field2291 == null) {
            this.field2291 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg3; var6++) {
                this.field2291[this.field2294] = arg0[arg2 + var6];
                this.field2294 = (this.field2294 + 1) % 5000;
                if (((this.field2283 + 4900) % 5000) == this.field2294) {
                    throw new IOException();
                }
            }
            if (this.field2282 == null) {
                this.field2282 = this.field2311.method1960(3, this, (byte) -84);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "([BIII)V")
    public final void method946(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field2288++;
        if (arg3 != 1 || this.field2308) {
            return;
        }
        while (arg1 > 0) {
            int var5 = this.field2301.read(arg0, arg2, arg1);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg2 += var5;
            arg1 -= var5;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V")
    public final void method947(byte arg0) {
        field2304++;
        if (this.field2308) {
            return;
        }
        synchronized (this) {
            this.field2308 = true;
            this.notifyAll();
            if (arg0 <= 7) {
                this.field2311 = null;
            }
        }
        if (this.field2282 != null) {
            while (this.field2282.field290 == 0) {
                class53.method290(1L, true);
            }
            if (this.field2282.field290 == 1) {
                try {
                    ((Thread) this.field2282.field292).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field2282 = null;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZI)Lli;")
    public static final class288 method948(boolean arg0, int arg1) {
        field2284++;
        if (!arg0) {
            method954(false, (class280) null);
        }
        return class48.field775 && arg1 >= class152.field2676 && class58.field997 >= arg1 ? class242.field4367[arg1 - class152.field2676] : null;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B[Lcf;)Lcf;")
    public static final class93 method949(byte arg0, class93[] arg1) {
        if (arg0 != -77) {
            field2289 = null;
        }
        field2309++;
        if (arg1.length < 2) {
            throw new IllegalArgumentException();
        }
        return class86.method591(arg1.length, (byte) 91, 0, arg1);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)I")
    public final int method950(boolean arg0) throws IOException {
        if (arg0) {
            return -104;
        } else {
            field2290++;
            return this.field2308 ? 0 : this.field2301.available();
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)I")
    public final int method951(int arg0) throws IOException {
        field2281++;
        if (this.field2308) {
            return 0;
        } else if (arg0 == 0) {
            return this.field2301.read();
        } else {
            return -53;
        }
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V")
    public final void method952(int arg0) {
        field2300++;
        if (this.field2308) {
            return;
        }
        if (arg0 != 5000) {
            this.method952(80);
        }
        this.field2301 = new class123();
        this.field2307 = new class109();
    }

    @OriginalMember(owner = "client!lb", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method947((byte) 123);
        field2285++;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(III)V")
    public static final void method953(int arg0, int arg1, int arg2) {
        field2305++;
        class47.field754[arg1] = arg2;
        if (arg0 != 1) {
            method954(true, (class280) null);
        }
        class60 var3 = (class60) class208.field3722.method135((long) arg1, true);
        if (var3 == null) {
            class60 var4 = new class60(4611686018427387905L);
            class208.field3722.method137((long) arg1, var4, -1);
        } else if (var3.field1014 != 4611686018427387905L) {
            var3.field1014 = class28.method155((byte) 119) + 500L | 0x4000000000000000L;
        }
    }

    @OriginalMember(owner = "client!lb", name = "run", descriptor = "()V")
    public final void run() {
        field2306++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field2294 == this.field2283) {
                        if (this.field2308) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    if (this.field2294 >= this.field2283) {
                        var2 = this.field2294 - this.field2283;
                    } else {
                        var2 = 5000 - this.field2283;
                    }
                    var3 = this.field2283;
                }
                if (var2 > 0) {
                    try {
                        this.field2307.write(this.field2291, var3, var2);
                    } catch (IOException var9) {
                        this.field2298 = true;
                    }
                    this.field2283 = (this.field2283 + var2) % 5000;
                    try {
                        if (this.field2294 == this.field2283) {
                            this.field2307.flush();
                        }
                    } catch (IOException var8) {
                        this.field2298 = true;
                    }
                }
            }
            try {
                if (this.field2301 != null) {
                    this.field2301.close();
                }
                if (this.field2307 != null) {
                    this.field2307.close();
                }
                if (this.field2295 != null) {
                    this.field2295.close();
                }
            } catch (IOException var7) {
            }
            this.field2291 = null;
        } catch (Exception var12) {
            class127.method931((byte) -124, (String) null, var12);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZLee;)V")
    public static final void method954(boolean arg0, class280 arg1) {
        field2297++;
        if (arg1.field5011.length - arg1.field5027 < 1) {
            return;
        }
        int var2 = arg1.method1907(16832);
        if (var2 < 0 || var2 > 11) {
            return;
        }
        byte var3;
        if (var2 == 11) {
            var3 = 33;
        } else if (var2 == 10) {
            var3 = 32;
        } else if (var2 == 9) {
            var3 = 31;
        } else if (var2 == 8) {
            var3 = 30;
        } else if (var2 == 7) {
            var3 = 29;
        } else if (var2 == 6) {
            var3 = 28;
        } else if (var2 == 5) {
            var3 = 28;
        } else if (var2 == 4) {
            var3 = 24;
        } else if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if ((arg1.field5011.length - arg1.field5027) < var3) {
            return;
        }
        class66.field1216 = arg1.method1907(16832);
        if (class66.field1216 < 1) {
            class66.field1216 = 1;
        } else if (class66.field1216 > 4) {
            class66.field1216 = 4;
        }
        class148.method1069(91, arg1.method1907(16832) == 1);
        class170.field3000 = arg1.method1907(16832) == 1;
        class154.field2704 = arg1.method1907(16832) == 1;
        if (!arg0) {
            field2293 = null;
        }
        class46.field739 = arg1.method1907(16832) == 1;
        class230.field4124 = arg1.method1907(16832) == 1;
        class280.field5059 = arg1.method1907(16832) == 1;
        class119.field2117 = arg1.method1907(16832) == 1;
        class154.field2697 = arg1.method1907(16832) == 1;
        class280.field5052 = arg1.method1907(16832);
        if (class280.field5052 > 2) {
            class280.field5052 = 2;
        }
        if (var2 < 2) {
            class235.field4195 = arg1.method1907(16832) == 1;
            arg1.method1907(16832);
        } else {
            class235.field4195 = arg1.method1907(16832) == 1;
        }
        class110.field1876 = arg1.method1907(16832) == 1;
        class207.field3717 = arg1.method1907(16832) == 1;
        class154.field2699 = arg1.method1907(16832);
        if (class154.field2699 > 2) {
            class154.field2699 = 2;
        }
        class119.field2121 = class154.field2699;
        class161.field2832 = arg1.method1907(16832) == 1;
        class267.field4756 = arg1.method1907(16832);
        if (class267.field4756 > 127) {
            class267.field4756 = 127;
        }
        class195.field3552 = arg1.method1907(16832);
        class143.field2480 = arg1.method1907(16832);
        if (class143.field2480 > 127) {
            class143.field2480 = 127;
        }
        if (var2 >= 1) {
            class46.field748 = arg1.method1891(-111);
            class48.field772 = arg1.method1891(-116);
        }
        if (var2 >= 3 && var2 < 6) {
            arg1.method1907(16832);
        }
        if (var2 >= 4) {
            int var4 = arg1.method1907(16832);
            if (class58.field979 < 96) {
                var4 = 0;
            }
            class91.method629(var4);
        }
        if (var2 >= 5) {
            class133.field2340 = arg1.method1872(100);
        }
        if (var2 >= 6) {
            class180.field3168 = arg1.method1907(16832);
        }
        if (var2 >= 7) {
            class193.field3539 = arg1.method1907(16832) == 1;
        }
        if (var2 >= 8) {
            class223.field4026 = arg1.method1907(16832) == 1;
        }
        if (var2 >= 9) {
            class66.field1219 = arg1.method1907(16832);
        }
        if (var2 >= 10) {
            class152.field2678 = arg1.method1907(16832) != 0;
        }
        if (var2 >= 11) {
            class42.field667 = arg1.method1907(16832) != 0;
        }
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(Z)V")
    public final void method955(boolean arg0) throws IOException {
        if (!arg0) {
            field2310 = null;
        }
        field2286++;
        if (!this.field2308 && this.field2298) {
            this.field2298 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(B)V")
    public static void method956(byte arg0) {
        field2299 = null;
        field2303 = null;
        field2296 = null;
        field2289 = null;
        field2310 = null;
        if (arg0 > -8) {
            field2296 = null;
        }
        field2293 = null;
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Ljava/net/Socket;Llh;)V")
    public class130(Socket arg0, class286 arg1) throws IOException {
        this.field2295 = arg0;
        this.field2311 = arg1;
        this.field2295.setSoTimeout(30000);
        this.field2295.setTcpNoDelay(true);
        this.field2301 = this.field2295.getInputStream();
        this.field2307 = this.field2295.getOutputStream();
    }
}
