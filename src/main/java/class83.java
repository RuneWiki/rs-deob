import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class83 implements Runnable {

    @OriginalMember(owner = "client!m", name = "i", descriptor = "I")
    private int field2161 = 0;

    @OriginalMember(owner = "client!m", name = "o", descriptor = "Z")
    private boolean field2167 = false;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "Z")
    private boolean field2155 = false;

    @OriginalMember(owner = "client!m", name = "C", descriptor = "I")
    private int field2181 = 0;

    @OriginalMember(owner = "client!m", name = "l", descriptor = "Ljava/net/Socket;")
    private Socket field2164;

    @OriginalMember(owner = "client!m", name = "p", descriptor = "Lba;")
    private class9 field2168;

    @OriginalMember(owner = "client!m", name = "h", descriptor = "Ljava/io/InputStream;")
    private InputStream field2160;

    @OriginalMember(owner = "client!m", name = "r", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field2170;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "Lrd;")
    public static class117 field2154 = class95.method812("Titelbild geladen)3", (byte) 8);

    @OriginalMember(owner = "client!m", name = "s", descriptor = "Lrd;")
    public static class117 field2171 = class95.method812(" x", (byte) 8);

    @OriginalMember(owner = "client!m", name = "w", descriptor = "Lrd;")
    private static class117 field2175 = class95.method812("Loading sprites )2 ", (byte) 8);

    @OriginalMember(owner = "client!m", name = "q", descriptor = "Lrd;")
    public static class117 field2169 = class95.method812("Wordpack geladen)3", (byte) 8);

    @OriginalMember(owner = "client!m", name = "v", descriptor = "Lrd;")
    public static class117 field2174 = field2175;

    @OriginalMember(owner = "client!m", name = "A", descriptor = "Lrd;")
    private static class117 field2179 = class95.method812("Unexpected loginserver response)3", (byte) 8);

    @OriginalMember(owner = "client!m", name = "E", descriptor = "[I")
    public static int[] field2183 = new int[4000];

    @OriginalMember(owner = "client!m", name = "g", descriptor = "Lrd;")
    public static class117 field2159 = field2179;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "I")
    public static int field2153;

    @OriginalMember(owner = "client!m", name = "k", descriptor = "I")
    public static int field2163;

    @OriginalMember(owner = "client!m", name = "m", descriptor = "I")
    public static int field2165;

    @OriginalMember(owner = "client!m", name = "n", descriptor = "I")
    public static int field2166;

    @OriginalMember(owner = "client!m", name = "u", descriptor = "I")
    public static int field2173;

    @OriginalMember(owner = "client!m", name = "y", descriptor = "I")
    public static int field2177;

    @OriginalMember(owner = "client!m", name = "z", descriptor = "I")
    public static int field2178;

    @OriginalMember(owner = "client!m", name = "B", descriptor = "I")
    public static int field2180;

    @OriginalMember(owner = "client!m", name = "D", descriptor = "I")
    public static int field2182;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "Leb;")
    private class31 field2157;

    @OriginalMember(owner = "client!m", name = "t", descriptor = "Leb;")
    public static class31 field2172;

    @OriginalMember(owner = "client!m", name = "x", descriptor = "Ljc;")
    public static class65 field2176;

    @OriginalMember(owner = "client!m", name = "j", descriptor = "Laf;")
    public static class7 field2162;

    @OriginalMember(owner = "client!m", name = "d", descriptor = "[B")
    private byte[] field2156;

    @OriginalMember(owner = "client!m", name = "f", descriptor = "[I")
    public static int[] field2158;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V")
    public static void method751(int arg0) {
        field2169 = null;
        if (arg0 <= 12) {
            method753(true, null);
        }
        field2159 = null;
        field2175 = null;
        field2171 = null;
        field2162 = null;
        field2154 = null;
        field2174 = null;
        field2158 = null;
        field2176 = null;
        field2172 = null;
        field2183 = null;
        field2179 = null;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(B)I")
    public final int method752(byte arg0) throws IOException {
        if (arg0 < 36) {
            field2171 = null;
        }
        field2180++;
        return this.field2155 ? 0 : this.field2160.read();
    }

    @OriginalMember(owner = "client!m", name = "run", descriptor = "()V")
    public final void run() {
        field2153++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field2181 == this.field2161) {
                        if (this.field2155) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    if (this.field2181 < this.field2161) {
                        var2 = 5000 - this.field2161;
                    } else {
                        var2 = this.field2181 - this.field2161;
                    }
                    var3 = this.field2161;
                }
                if (var2 > 0) {
                    try {
                        this.field2170.write(this.field2156, var3, var2);
                    } catch (IOException var9) {
                        this.field2167 = true;
                    }
                    this.field2161 = (this.field2161 + var2) % 5000;
                    try {
                        if (this.field2181 == this.field2161) {
                            this.field2170.flush();
                        }
                    } catch (IOException var8) {
                        this.field2167 = true;
                    }
                }
            }
            try {
                if (this.field2160 != null) {
                    this.field2160.close();
                }
                if (this.field2170 != null) {
                    this.field2170.close();
                }
                if (this.field2164 != null) {
                    this.field2164.close();
                }
            } catch (IOException var7) {
            }
            this.field2156 = null;
        } catch (Exception var12) {
            class109.method897(-8638, var12, null);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ZLwa;)V")
    public static final void method753(boolean arg0, class144 arg1) {
        if (arg0) {
            return;
        }
        int var2 = arg1.field3467;
        field2173++;
        if (var2 >= 1 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
            if (class93.field2347 == 0) {
                if (var2 == 1) {
                    arg1.field3417 = class44.field1248;
                    arg1.field3511 = 0;
                    return;
                }
                if (var2 == 2) {
                    arg1.field3511 = 0;
                    arg1.field3417 = class38.field1109;
                    return;
                }
            }
            if (class93.field2347 == 1) {
                if (var2 == 1) {
                    arg1.field3511 = 0;
                    arg1.field3417 = class60.field1696;
                    return;
                }
                if (var2 == 2) {
                    arg1.field3417 = class38.field1104;
                    arg1.field3511 = 0;
                    return;
                }
                if (var2 == 3) {
                    arg1.field3511 = 0;
                    arg1.field3417 = class20.field555;
                    return;
                }
            }
            if (var2 <= 700) {
                var2--;
            } else {
                var2 -= 601;
            }
            int var3 = class5.field119;
            if (class93.field2347 != 2) {
                var3 = 0;
            }
            if (var2 >= var3) {
                arg1.field3511 = 0;
                arg1.field3417 = class134.field3215;
            } else {
                arg1.field3417 = class72.field2025[var2];
                arg1.field3511 = 1;
            }
        } else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
            if (var2 <= 800) {
                var2 -= 101;
            } else {
                var2 -= 701;
            }
            int var4 = class5.field119;
            if (class93.field2347 != 2) {
                var4 = 0;
            }
            if (var4 <= var2) {
                arg1.field3417 = class134.field3215;
                arg1.field3511 = 0;
            } else {
                if (class35.field1037[var2] == 0) {
                    arg1.field3417 = class18.method193(new class117[] { class93.field2349, class32.field964 }, 124);
                } else if (class35.field1037[var2] < 5000) {
                    if (class35.field1037[var2] == class138.field3317) {
                        arg1.field3417 = class18.method193(new class117[] { class134.field3211, class104.field2608, class142.method1131(class35.field1037[var2], !arg0) }, 70);
                    } else {
                        arg1.field3417 = class18.method193(new class117[] { class15.field346, class104.field2608, class142.method1131(class35.field1037[var2], !arg0) }, 40);
                    }
                } else if (class35.field1037[var2] == class138.field3317) {
                    arg1.field3417 = class18.method193(new class117[] { class134.field3211, class101.field2544, class142.method1131(class35.field1037[var2] - 5000, true) }, 51);
                } else {
                    arg1.field3417 = class18.method193(new class117[] { class15.field346, class101.field2544, class142.method1131(class35.field1037[var2] - 5000, true) }, 66);
                }
                arg1.field3511 = 1;
            }
        } else if (var2 == 203) {
            int var5 = class5.field119;
            if (class93.field2347 != 2) {
                var5 = 0;
            }
            arg1.field3420 = var5 * 15 + 20;
            if (arg1.field3490 >= arg1.field3420) {
                arg1.field3420 = arg1.field3490 + 1;
            }
        } else if (var2 >= 401 && var2 <= 500) {
            var2 -= 401;
            if (var2 == 0 && class93.field2347 == 0) {
                arg1.field3417 = class40.field1168;
                arg1.field3511 = 0;
            } else if (var2 == 1 && class93.field2347 == 0) {
                arg1.field3511 = 0;
                arg1.field3417 = class38.field1109;
            } else {
                int var6 = class109.field2739;
                if (class93.field2347 == 0) {
                    var6 = 0;
                }
                if (var6 <= var2) {
                    arg1.field3511 = 0;
                    arg1.field3417 = class134.field3215;
                } else {
                    arg1.field3417 = class26.method272(false, class109.field2720[var2]).method957(-8191);
                    arg1.field3511 = 1;
                }
            }
        } else if (var2 == 503) {
            arg1.field3420 = class109.field2739 * 15 + 20;
            if (arg1.field3490 >= arg1.field3420) {
                arg1.field3420 = arg1.field3490 + 1;
            }
        } else if (var2 == 324) {
            if (class148.field3644 == -1) {
                class148.field3644 = arg1.field3529;
                class27.field802 = arg1.field3527;
            }
            if (class147.field3589.field948) {
                arg1.field3529 = class148.field3644;
            } else {
                arg1.field3529 = class27.field802;
            }
        } else if (var2 == 325) {
            if (class148.field3644 == -1) {
                class148.field3644 = arg1.field3529;
                class27.field802 = arg1.field3527;
            }
            if (class147.field3589.field948) {
                arg1.field3529 = class27.field802;
            } else {
                arg1.field3529 = class148.field3644;
            }
        } else if (var2 == 327) {
            arg1.field3466 = 150;
            arg1.field3471 = (int) (Math.sin((double) class85.field2236 / 40.0D) * 256.0D) & 0x7FF;
            arg1.field3474 = 0;
            arg1.field3487 = 5;
        } else if (var2 == 328) {
            arg1.field3466 = 150;
            arg1.field3471 = (int) (Math.sin((double) class85.field2236 / 40.0D) * 256.0D) & 0x7FF;
            arg1.field3487 = 5;
            arg1.field3474 = 1;
        } else if (var2 == 600) {
            arg1.field3417 = class18.method193(new class117[] { class134.field3202, class72.field2026 }, 43);
        } else if (var2 == 620) {
            if (class24.field676 < 1) {
                arg1.field3417 = class134.field3215;
            } else if (class110.field2760) {
                arg1.field3502 = 16711680;
                arg1.field3417 = class148.field3605;
            } else {
                arg1.field3502 = 16777215;
                arg1.field3417 = class110.field2763;
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IBI[B)V")
    public final void method754(int arg0, byte arg1, int arg2, byte[] arg3) throws IOException {
        field2165++;
        if (this.field2155) {
            return;
        }
        if (this.field2167) {
            this.field2167 = false;
            throw new IOException();
        }
        if (this.field2156 == null) {
            this.field2156 = new byte[5000];
        }
        synchronized (this) {
            if (arg1 > 28) {
                for (int var6 = 0; var6 < arg2; var6++) {
                    this.field2156[this.field2181] = arg3[arg0 + var6];
                    this.field2181 = (this.field2181 + 1) % 5000;
                    if ((this.field2161 + 4900) % 5000 == this.field2181) {
                        throw new IOException();
                    }
                }
                if (this.field2157 == null) {
                    this.field2157 = this.field2168.method66(3, this, true);
                }
                this.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(I)V")
    public final void method755(int arg0) {
        field2163++;
        if (this.field2155) {
            return;
        }
        synchronized (this) {
            this.field2155 = true;
            if (arg0 != -2) {
                return;
            }
            this.notifyAll();
        }
        if (this.field2157 != null) {
            while (this.field2157.field940 == 0) {
                class60.method611(1L, true);
            }
            if (this.field2157.field940 == 1) {
                try {
                    ((Thread) this.field2157.field937).join();
                } catch (InterruptedException var5) {
                }
            }
        }
        this.field2157 = null;
    }

    @OriginalMember(owner = "client!m", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method755(-2);
        field2166++;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(II[BI)V")
    public final void method756(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field2182++;
        if (arg1 < 65 || this.field2155) {
            return;
        }
        while (arg0 > 0) {
            int var5 = this.field2160.read(arg2, arg3, arg0);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg0 -= var5;
            arg3 += var5;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Z)I")
    public final int method757(boolean arg0) throws IOException {
        if (!arg0) {
            field2176 = null;
        }
        field2177++;
        return this.field2155 ? 0 : this.field2160.available();
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Ljava/net/Socket;Lba;)V")
    public class83(Socket arg0, class9 arg1) throws IOException {
        this.field2164 = arg0;
        this.field2168 = arg1;
        this.field2164.setSoTimeout(30000);
        this.field2164.setTcpNoDelay(true);
        this.field2160 = this.field2164.getInputStream();
        this.field2170 = this.field2164.getOutputStream();
    }
}
