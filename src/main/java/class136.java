import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!taa")
public class class136 implements Runnable {

    @OriginalMember(owner = "client!taa", name = "e", descriptor = "I")
    private int field2185 = 0;

    @OriginalMember(owner = "client!taa", name = "k", descriptor = "I")
    private int field2191 = 0;

    @OriginalMember(owner = "client!taa", name = "h", descriptor = "I")
    private int field2188;

    @OriginalMember(owner = "client!taa", name = "m", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field2193;

    @OriginalMember(owner = "client!taa", name = "c", descriptor = "[B")
    private byte[] field2183;

    @OriginalMember(owner = "client!taa", name = "p", descriptor = "Ljava/lang/Thread;")
    private Thread field2196;

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2181 = new BigInteger("9bced750c65ca83ed15cc2afe45853e8f871f132e09381ea1b10cd2f16ee666fb27050fee6d3aa9a80deed0fd5b7a29af317f032e4fac77d29465ca67f281409", 16);

    @OriginalMember(owner = "client!taa", name = "o", descriptor = "Leda;")
    public static class116 field2195 = new class116(17, 7);

    @OriginalMember(owner = "client!taa", name = "q", descriptor = "I")
    public static int field2197 = 0;

    @OriginalMember(owner = "client!taa", name = "b", descriptor = "I")
    public static int field2182;

    @OriginalMember(owner = "client!taa", name = "d", descriptor = "I")
    public static int field2184;

    @OriginalMember(owner = "client!taa", name = "f", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!taa", name = "g", descriptor = "I")
    public static int field2187;

    @OriginalMember(owner = "client!taa", name = "j", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!taa", name = "l", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!taa", name = "n", descriptor = "I")
    public static int field2194;

    @OriginalMember(owner = "client!taa", name = "i", descriptor = "Ljava/io/IOException;")
    private IOException field2189;

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(II[BI)V", line = 5)
    public final void method1038(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field2194++;
        if (arg1 != -1) {
            this.field2191 = -127;
        }
        if (arg3 < 0 || arg0 < 0 || (arg0 + arg3) > arg2.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field2189 != null) {
                throw new IOException(this.field2189.toString());
            }
            int var6;
            if (this.field2185 <= this.field2191) {
                var6 = this.field2185 + this.field2188 - this.field2191 - 1;
            } else {
                var6 = this.field2185 - this.field2191 - 1;
            }
            if (arg3 > var6) {
                throw new IOException("");
            }
            if (this.field2188 >= (this.field2191 + arg3)) {
                class553.method3242(arg2, arg0, this.field2183, this.field2191, arg3);
            } else {
                int var7 = this.field2188 - this.field2191;
                class553.method3242(arg2, arg0, this.field2183, this.field2191, var7);
                class553.method3242(arg2, arg0 + var7, this.field2183, 0, arg3 - var7);
            }
            this.field2191 = (this.field2191 + arg3) % this.field2188;
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(I)V", line = 48)
    public final void method1039(int arg0) {
        field2190++;
        synchronized (this) {
            if (this.field2189 == null) {
                this.field2189 = new IOException("");
            }
            this.notifyAll();
            if (arg0 != 0) {
                this.field2185 = 89;
            }
        }
        try {
            this.field2196.join();
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!taa", name = "b", descriptor = "(I)V", line = 71)
    public final void method1040(int arg0) {
        if (arg0 == -1) {
            field2182++;
            this.field2193 = new class658();
        }
    }

    @OriginalMember(owner = "client!taa", name = "run", descriptor = "()V", line = 83)
    public final void run() {
        field2192++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field2189 != null) {
                        return;
                    }
                    if (this.field2191 < this.field2185) {
                        var2 = this.field2188 + this.field2191 - this.field2185;
                    } else {
                        var2 = this.field2191 - this.field2185;
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var12) {
                    }
                }
            }
            try {
                if (this.field2185 + var2 > this.field2188) {
                    int var3 = this.field2188 - this.field2185;
                    this.field2193.write(this.field2183, this.field2185, var3);
                    this.field2193.write(this.field2183, 0, var2 - var3);
                } else {
                    this.field2193.write(this.field2183, this.field2185, var2);
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field2189 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field2185 = (this.field2185 + var2) % this.field2188;
            }
        }
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(IZ)V", line = 145)
    public static final void method1041(int arg0, boolean arg1) {
        class693 var2 = (class693) class33.field477.method3905(-123);
        if (arg0 > -1) {
            field2184 = 38;
        }
        while (var2 != null) {
            if (var2.field9843 != null) {
                class387.field5675.method3092(var2.field9843);
                var2.field9843 = null;
            }
            if (var2.field9818 != null) {
                class387.field5675.method3092(var2.field9818);
                var2.field9818 = null;
            }
            var2.method2549((byte) 31);
            var2 = (class693) class33.field477.method3899(0);
        }
        field2187++;
        if (!arg1) {
            return;
        }
        for (class693 var3 = (class693) class522.field7687.method3905(-109); var3 != null; var3 = (class693) class522.field7687.method3899(0)) {
            if (var3.field9843 != null) {
                class387.field5675.method3092(var3.field9843);
                var3.field9843 = null;
            }
            var3.method2549((byte) 69);
        }
        for (class693 var4 = (class693) class260.field3749.method2815(0); var4 != null; var4 = (class693) class260.field3749.method2814(4)) {
            if (var4.field9843 != null) {
                class387.field5675.method3092(var4.field9843);
                var4.field9843 = null;
            }
            var4.method2549((byte) 74);
        }
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(Z)V", line = 217)
    public static void method1042(boolean arg0) {
        if (arg0) {
            field2195 = null;
            field2181 = null;
        }
    }

    @OriginalMember(owner = "client!taa", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V", line = 266)
    public class136(OutputStream arg0, int arg1) {
        this.field2188 = arg1 + 1;
        this.field2193 = arg0;
        this.field2183 = new byte[this.field2188];
        this.field2196 = new Thread(this);
        this.field2196.setDaemon(true);
        this.field2196.start();
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(ILda;Leh;III)V", line = 249)
    public static final void method1043(int arg0, class397 arg1, class203 arg2, int arg3, int arg4, int arg5) {
        if (arg0 != 23175) {
            field2195 = null;
        }
        field2186++;
        if (arg1 != null) {
            arg2.method1410(arg1.method478(), arg1.method432(), arg1.method446(), arg1.method452(), arg5, arg3, 31831, arg4, arg1.method450(), arg1.method461(), arg1.method431());
        }
    }
}
