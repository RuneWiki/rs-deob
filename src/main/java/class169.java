import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class169 implements Runnable {

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "I")
    private int field2858 = 0;

    @OriginalMember(owner = "client!sj", name = "p", descriptor = "I")
    private int field2872 = 0;

    @OriginalMember(owner = "client!sj", name = "q", descriptor = "Z")
    private boolean field2873 = false;

    @OriginalMember(owner = "client!sj", name = "n", descriptor = "Z")
    private boolean field2870 = false;

    @OriginalMember(owner = "client!sj", name = "s", descriptor = "Ljava/net/Socket;")
    private Socket field2875;

    @OriginalMember(owner = "client!sj", name = "E", descriptor = "Lme;")
    private class295 field2887;

    @OriginalMember(owner = "client!sj", name = "k", descriptor = "Ljava/io/InputStream;")
    private InputStream field2867;

    @OriginalMember(owner = "client!sj", name = "t", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field2876;

    @OriginalMember(owner = "client!sj", name = "j", descriptor = "Loh;")
    public static class258 field2866 = class153.method1046("b12_full", 91);

    @OriginalMember(owner = "client!sj", name = "m", descriptor = "Loh;")
    public static class258 field2869 = class153.method1046("<col=ffffff>", 107);

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "Lmi;")
    public static class12 field2857 = new class12();

    @OriginalMember(owner = "client!sj", name = "v", descriptor = "Loh;")
    public static class258 field2878 = class153.method1046("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q", 102);

    @OriginalMember(owner = "client!sj", name = "A", descriptor = "I")
    public static int field2883 = 0;

    @OriginalMember(owner = "client!sj", name = "x", descriptor = "Loh;")
    public static class258 field2880 = class153.method1046(")1", 105);

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "I")
    public static int field2859;

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "I")
    public static int field2862;

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!sj", name = "h", descriptor = "I")
    public static int field2864;

    @OriginalMember(owner = "client!sj", name = "i", descriptor = "I")
    public static int field2865;

    @OriginalMember(owner = "client!sj", name = "l", descriptor = "I")
    public static int field2868;

    @OriginalMember(owner = "client!sj", name = "o", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!sj", name = "r", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!sj", name = "w", descriptor = "I")
    public static int field2879;

    @OriginalMember(owner = "client!sj", name = "y", descriptor = "I")
    public static int field2881;

    @OriginalMember(owner = "client!sj", name = "z", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!sj", name = "C", descriptor = "I")
    public static int field2885;

    @OriginalMember(owner = "client!sj", name = "u", descriptor = "Lke;")
    private class116 field2877;

    @OriginalMember(owner = "client!sj", name = "D", descriptor = "Z")
    public static boolean field2886;

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "[B")
    private byte[] field2860;

    @OriginalMember(owner = "client!sj", name = "B", descriptor = "[[S")
    public static short[][] field2884;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lqj;I)I", line = 14)
    public static final int method1116(class231 arg0, int arg1) {
        field2871++;
        if (arg1 != 0) {
            method1121(47);
        }
        int var2 = arg0.field3986;
        if (arg0.field929 == arg0.field909) {
            var2 = arg0.field3981;
        } else if (arg0.field937 == arg0.field909) {
            var2 = arg0.field4001;
        }
        return var2;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)I", line = 44)
    public final int method1117(int arg0) throws IOException {
        field2881++;
        if (this.field2870) {
            return 0;
        } else {
            if (arg0 != 0) {
                method1125(-118);
            }
            return this.field2867.read();
        }
    }

    @OriginalMember(owner = "client!sj", name = "run", descriptor = "()V", line = 64)
    public final void run() {
        try {
            while (true) {
                int var3;
                int var4;
                label88: {
                    synchronized (this) {
                        label89: {
                            if (this.field2872 == this.field2858) {
                                if (this.field2870) {
                                    break label89;
                                }
                                try {
                                    this.wait();
                                } catch (InterruptedException var13) {
                                }
                            }
                            var3 = this.field2872;
                            if (this.field2858 >= this.field2872) {
                                var4 = this.field2858 - this.field2872;
                            } else {
                                var4 = 5000 - this.field2872;
                            }
                            break label88;
                        }
                    }
                    try {
                        if (this.field2867 != null) {
                            this.field2867.close();
                        }
                        if (this.field2876 != null) {
                            this.field2876.close();
                        }
                        if (this.field2875 != null) {
                            this.field2875.close();
                        }
                    } catch (IOException var10) {
                    }
                    this.field2860 = null;
                    break;
                }
                if (var4 > 0) {
                    try {
                        this.field2876.write(this.field2860, var3, var4);
                    } catch (IOException var12) {
                        this.field2873 = true;
                    }
                    this.field2872 = (this.field2872 + var4) % 5000;
                    try {
                        if (this.field2872 == this.field2858) {
                            this.field2876.flush();
                        }
                    } catch (IOException var11) {
                        this.field2873 = true;
                    }
                }
            }
        } catch (Exception var15) {
            class107.method796(var15, (byte) -91, (String) null);
        }
        field2879++;
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(I)V", line = 128)
    public final void method1118(int arg0) throws IOException {
        field2885++;
        if (arg0 != 8789) {
            this.field2872 = 98;
        }
        if (!this.field2870 && this.field2873) {
            this.field2873 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Ljava/net/Socket;Lme;)V", line = 543)
    public class169(Socket arg0, class295 arg1) throws IOException {
        this.field2875 = arg0;
        this.field2887 = arg1;
        this.field2875.setSoTimeout(30000);
        this.field2875.setTcpNoDelay(true);
        this.field2867 = this.field2875.getInputStream();
        this.field2876 = this.field2875.getOutputStream();
    }

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "(I)V", line = 159)
    public final void method1119(int arg0) {
        field2868++;
        if (this.field2870) {
            return;
        }
        if (arg0 <= 112) {
            field2857 = (class12) null;
        }
        this.field2867 = new class271();
        this.field2876 = new class229();
    }

    @OriginalMember(owner = "client!sj", name = "finalize", descriptor = "()V", line = 179)
    protected final void finalize() {
        this.method1122(-1);
        field2865++;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ZII[B)V", line = 187)
    public final void method1120(boolean arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field2874++;
        if (this.field2870 || arg0) {
            return;
        }
        while (arg2 > 0) {
            int var5 = this.field2867.read(arg3, arg1, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 += var5;
            arg2 -= var5;
        }
    }

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "(I)I", line = 226)
    public static final int method1121(int arg0) {
        field2861++;
        try {
            if (++class203.field3526 > 1500) {
                throw new IOException();
            }
            if (class188.field3339 == 0) {
                if (class247.field4284 > class25.method197(-3418) - 5000L) {
                    return 0;
                }
                class15.field199 = class297.field5086.method2073(class201.field3486, -30885, class148.field2507);
                class188.field3339 = 1;
            }
            if (class188.field3339 == 1) {
                if (class15.field199.field2067 == 2) {
                    throw new IOException();
                }
                if (class15.field199.field2067 != 1) {
                    return -1;
                }
                int var1 = 0;
                class73.field1289 = new class169((Socket) class15.field199.field2063, class297.field5086);
                class159.field2710.field4051 = 0;
                if (class153.field2633) {
                    var1 = class218.field3756;
                }
                class15.field199 = null;
                class159.field2710.method1598(226, 27052);
                class159.field2710.method1577(true, var1);
                class73.field1289.method1123(4900, 0, class159.field2710.field4051, class159.field2710.field4066);
                if (class76.field1322 != null) {
                    class76.field1322.method1007((byte) -13);
                }
                if (class152.field2602 != null) {
                    class152.field2602.method1007((byte) -13);
                }
                int var2 = class73.field1289.method1117(0);
                if (class76.field1322 != null) {
                    class76.field1322.method1007((byte) -13);
                }
                if (class152.field2602 != null) {
                    class152.field2602.method1007((byte) -13);
                }
                if (var2 != 0) {
                    if (class73.field1289 != null) {
                        class73.field1289.method1122(arg0 + 3942);
                        class73.field1289 = null;
                    }
                    class5.field64++;
                    if (class5.field64 <= 4) {
                        if (class243.field4225 == class148.field2507) {
                            class148.field2507 = class228.field3949;
                        } else {
                            class148.field2507 = class243.field4225;
                        }
                        class203.field3526 = 0;
                        class188.field3339 = 0;
                        return -1;
                    }
                    class258.method1792(-101);
                    return var2;
                }
                class188.field3339 = 2;
            }
            if (arg0 != -3943) {
                field2886 = true;
            }
            if (class188.field3339 == 2) {
                if (class73.field1289.method1124(true) < 2) {
                    return -1;
                }
                class271.field4689 = class73.field1289.method1117(arg0 ^ 0xFFFFF099);
                class271.field4689 <<= 0x8;
                class271.field4689 += class73.field1289.method1117(0);
                class225.field3866 = new byte[class271.field4689];
                class188.field3339 = 3;
            }
            if (class188.field3339 == 3) {
                int var3 = class73.field1289.method1124(true);
                if (var3 >= 1) {
                    if ((class271.field4689 - class191.field3382) < var3) {
                        var3 = class271.field4689 - class191.field3382;
                    }
                    class73.field1289.method1120(false, class191.field3382, var3, class225.field3866);
                    class191.field3382 += var3;
                    if (class271.field4689 <= class191.field3382) {
                        class114.method836(-2, class225.field3866);
                        class144.field2426 = new class98[class3.field43];
                        int var4 = 0;
                        for (int var5 = class123.field2179; var5 <= class291.field5004; var5++) {
                            class98 var6 = class27.method210(-115, var5);
                            if (var6 != null) {
                                class144.field2426[var4++] = var6;
                            }
                        }
                        class73.field1289.method1122(-1);
                        class73.field1289 = null;
                        class258.method1792(arg0 + 3818);
                        class247.field4284 = class25.method197(-3418);
                        return 0;
                    }
                    return -1;
                }
                return -1;
            }
        } catch (IOException var8) {
            if (class73.field1289 != null) {
                class73.field1289.method1122(arg0 + 3942);
                class73.field1289 = null;
            }
            class5.field64++;
            if (class5.field64 > 4) {
                class258.method1792(-127);
                return 1000;
            }
            class203.field3526 = 0;
            class188.field3339 = 0;
            if (class243.field4225 == class148.field2507) {
                class148.field2507 = class228.field3949;
            } else {
                class148.field2507 = class243.field4225;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "(I)V", line = 399)
    public final void method1122(int arg0) {
        field2864++;
        if (this.field2870) {
            return;
        }
        synchronized (this) {
            this.field2870 = true;
            this.notifyAll();
            if (arg0 != -1) {
                method1116((class231) null, -48);
            }
        }
        if (this.field2877 != null) {
            while (this.field2877.field2067 == 0) {
                class237.method1628((byte) -88, 1L);
            }
            if (this.field2877.field2067 == 1) {
                try {
                    ((Thread) this.field2877.field2063).join();
                } catch (InterruptedException var5) {
                }
            }
        }
        this.field2877 = null;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(III[B)V", line = 441)
    public final void method1123(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field2863++;
        if (this.field2870) {
            return;
        }
        if (this.field2873) {
            this.field2873 = false;
            throw new IOException();
        }
        if (this.field2860 == null) {
            this.field2860 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg2; var6++) {
                this.field2860[this.field2858] = arg3[arg1 + var6];
                this.field2858 = (this.field2858 + 1) % 5000;
                if ((this.field2872 + 4900) % 5000 == this.field2858) {
                    throw new IOException();
                }
            }
            if (arg0 != 4900) {
                field2878 = (class258) null;
            }
            if (this.field2877 == null) {
                this.field2877 = this.field2887.method2070(3, this, -119);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Z)I", line = 493)
    public final int method1124(boolean arg0) throws IOException {
        field2882++;
        if (!arg0) {
            this.method1119(5);
        }
        return this.field2870 ? 0 : this.field2867.available();
    }

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "(I)V", line = 507)
    public static void method1125(int arg0) {
        field2878 = null;
        if (arg0 != -5) {
            return;
        }
        field2857 = null;
        field2884 = (short[][]) null;
        field2866 = null;
        field2880 = null;
        field2869 = null;
    }
}
