import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class186 implements Runnable {

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "Z")
    private boolean field2960 = false;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "I")
    private int field2953 = 0;

    @OriginalMember(owner = "client!qe", name = "v", descriptor = "Z")
    private boolean field2972 = false;

    @OriginalMember(owner = "client!qe", name = "z", descriptor = "I")
    private int field2976 = 0;

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "Ljava/net/Socket;")
    private Socket field2958;

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "Ldi;")
    private class151 field2964;

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "Ljava/io/InputStream;")
    private InputStream field2962;

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field2961;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "Lwm;")
    public static class152 field2951 = class157.method1048("Weiter", 114);

    @OriginalMember(owner = "client!qe", name = "q", descriptor = "Lwm;")
    public static class152 field2967 = class157.method1048("clignotant1:", 123);

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "[[I")
    public static int[][] field2952 = new int[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!qe", name = "s", descriptor = "Lwm;")
    public static class152 field2969 = class157.method1048("(U4", 127);

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
    public static int field2954;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "I")
    public static int field2955;

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "I")
    public static int field2959;

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!qe", name = "o", descriptor = "I")
    public static int field2965;

    @OriginalMember(owner = "client!qe", name = "p", descriptor = "I")
    public static int field2966;

    @OriginalMember(owner = "client!qe", name = "r", descriptor = "I")
    public static int field2968;

    @OriginalMember(owner = "client!qe", name = "u", descriptor = "I")
    public static int field2971;

    @OriginalMember(owner = "client!qe", name = "w", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!qe", name = "y", descriptor = "I")
    public static int field2975;

    @OriginalMember(owner = "client!qe", name = "x", descriptor = "Lka;")
    private class188 field2974;

    @OriginalMember(owner = "client!qe", name = "t", descriptor = "[B")
    private byte[] field2970;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "[I")
    public static int[] field2956;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z)V", line = 7)
    public static void method1234(boolean arg0) {
        field2952 = (int[][]) null;
        if (!arg0) {
            field2975 = 21;
        }
        field2956 = null;
        field2967 = null;
        field2969 = null;
        field2951 = null;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)I", line = 23)
    public final int method1235(int arg0) throws IOException {
        if (arg0 > -72) {
            this.run();
        }
        field2965++;
        return this.field2972 ? 0 : this.field2962.read();
    }

    @OriginalMember(owner = "client!qe", name = "finalize", descriptor = "()V", line = 38)
    protected final void finalize() {
        field2963++;
        this.method1239((byte) -47);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)V", line = 48)
    public static final void method1236(int arg0, int arg1) {
        field2973++;
        if (arg0 == 0) {
            class303 var2 = class90.method589(false, arg1, 10);
            var2.method2114((byte) 111);
        }
    }

    @OriginalMember(owner = "client!qe", name = "run", descriptor = "()V", line = 65)
    public final void run() {
        try {
            while (true) {
                int var3;
                int var4;
                synchronized (this) {
                    if (this.field2976 == this.field2953) {
                        if (this.field2972) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var12) {
                        }
                    }
                    var3 = this.field2976;
                    if (this.field2953 < this.field2976) {
                        var4 = 5000 - this.field2976;
                    } else {
                        var4 = this.field2953 - this.field2976;
                    }
                }
                if (var4 > 0) {
                    try {
                        this.field2961.write(this.field2970, var3, var4);
                    } catch (IOException var11) {
                        this.field2960 = true;
                    }
                    this.field2976 = (this.field2976 + var4) % 5000;
                    try {
                        if (this.field2976 == this.field2953) {
                            this.field2961.flush();
                        }
                    } catch (IOException var10) {
                        this.field2960 = true;
                    }
                }
            }
            try {
                if (this.field2962 != null) {
                    this.field2962.close();
                }
                if (this.field2961 != null) {
                    this.field2961.close();
                }
                if (this.field2958 != null) {
                    this.field2958.close();
                }
            } catch (IOException var13) {
            }
            this.field2970 = null;
        } catch (Exception var15) {
            class169.method1109(var15, (byte) -80, (String) null);
        }
        field2959++;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZII[B)V", line = 129)
    public final void method1237(boolean arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field2954++;
        if (this.field2972 || !arg0) {
            return;
        }
        if (this.field2960) {
            this.field2960 = false;
            throw new IOException();
        }
        if (this.field2970 == null) {
            this.field2970 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg2; var6++) {
                this.field2970[this.field2953] = arg3[arg1 + var6];
                this.field2953 = (this.field2953 + 1) % 5000;
                if ((this.field2976 + 4900) % 5000 == this.field2953) {
                    throw new IOException();
                }
            }
            if (this.field2974 == null) {
                this.field2974 = this.field2964.method956(3, 0, this);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(I)I", line = 181)
    public final int method1238(int arg0) throws IOException {
        field2971++;
        if (this.field2972) {
            return 0;
        } else {
            if (arg0 != 1) {
                this.field2972 = false;
            }
            return this.field2962.available();
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)V", line = 196)
    public final void method1239(byte arg0) {
        field2957++;
        if (arg0 > -41 || this.field2972) {
            return;
        }
        synchronized (this) {
            this.field2972 = true;
            this.notifyAll();
        }
        if (this.field2974 != null) {
            while (this.field2974.field2980 == 0) {
                class4.method19(0, 1L);
            }
            if (this.field2974.field2980 == 1) {
                try {
                    ((Thread) this.field2974.field2977).join();
                } catch (InterruptedException var5) {
                }
            }
        }
        this.field2974 = null;
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Ljava/net/Socket;Ldi;)V", line = 347)
    public class186(Socket arg0, class151 arg1) throws IOException {
        this.field2958 = arg0;
        this.field2964 = arg1;
        this.field2958.setSoTimeout(30000);
        this.field2958.setTcpNoDelay(true);
        this.field2962 = this.field2958.getInputStream();
        this.field2961 = this.field2958.getOutputStream();
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "([BIII)V", line = 258)
    public final void method1240(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field2968++;
        if (this.field2972) {
            return;
        }
        int var5 = 18 / ((53 - arg3) / 43);
        while (arg2 > 0) {
            int var6 = this.field2962.read(arg0, arg1, arg2);
            if (var6 <= 0) {
                throw new EOFException();
            }
            arg1 += var6;
            arg2 -= var6;
        }
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(I)V", line = 286)
    public final void method1241(int arg0) {
        field2955++;
        if (!this.field2972) {
            this.field2962 = new class62();
            if (arg0 > 19) {
                this.field2961 = new class184();
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "(I)V", line = 303)
    public final void method1242(int arg0) throws IOException {
        field2966++;
        if (this.field2972) {
            return;
        }
        if (this.field2960) {
            this.field2960 = false;
            throw new IOException();
        } else if (arg0 != 1) {
            this.field2960 = false;
        }
    }
}
