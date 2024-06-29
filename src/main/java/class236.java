import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class236 implements Runnable {

    @OriginalMember(owner = "client!fr", name = "h", descriptor = "Z")
    private boolean field3206 = false;

    @OriginalMember(owner = "client!fr", name = "r", descriptor = "Z")
    private boolean field3216 = false;

    @OriginalMember(owner = "client!fr", name = "z", descriptor = "I")
    private int field3224 = 0;

    @OriginalMember(owner = "client!fr", name = "s", descriptor = "I")
    private int field3217 = 0;

    @OriginalMember(owner = "client!fr", name = "n", descriptor = "Lam;")
    private class378 field3212;

    @OriginalMember(owner = "client!fr", name = "t", descriptor = "Ljava/net/Socket;")
    private Socket field3218;

    @OriginalMember(owner = "client!fr", name = "x", descriptor = "Ljava/io/InputStream;")
    private InputStream field3222;

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field3200;

    @OriginalMember(owner = "client!fr", name = "v", descriptor = "[I")
    public static int[] field3220 = new int[14];

    @OriginalMember(owner = "client!fr", name = "l", descriptor = "[Lu;")
    public static class46[] field3210 = new class46[50];

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "I")
    public static int field3199;

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "I")
    public static int field3201;

    @OriginalMember(owner = "client!fr", name = "d", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!fr", name = "e", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "client!fr", name = "f", descriptor = "I")
    public static int field3204;

    @OriginalMember(owner = "client!fr", name = "g", descriptor = "I")
    public static int field3205;

    @OriginalMember(owner = "client!fr", name = "i", descriptor = "I")
    public static int field3207;

    @OriginalMember(owner = "client!fr", name = "j", descriptor = "I")
    public static int field3208;

    @OriginalMember(owner = "client!fr", name = "k", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!fr", name = "m", descriptor = "I")
    public static int field3211;

    @OriginalMember(owner = "client!fr", name = "o", descriptor = "I")
    public static int field3213;

    @OriginalMember(owner = "client!fr", name = "q", descriptor = "I")
    public static int field3215;

    @OriginalMember(owner = "client!fr", name = "u", descriptor = "I")
    public static int field3219;

    @OriginalMember(owner = "client!fr", name = "w", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!fr", name = "y", descriptor = "Lep;")
    private class241 field3223;

    @OriginalMember(owner = "client!fr", name = "p", descriptor = "[B")
    private byte[] field3214;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)V", line = 4)
    public static final void method1501(int arg0) {
        field3204++;
        if (arg0 <= -119) {
            class257.field3504.method999(((float) class287.field4044 * 0.1F + 0.7F) * 1.1523438F);
            class257.field3504.method1018(class158.field2243, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
            class257.field3504.method933(class217.field2978, -1);
            class257.field3504.method1024(class102.field1152);
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "([BIII)V", line = 20)
    public final void method1502(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        if (arg1 != -1) {
            this.run();
        }
        field3213++;
        if (this.field3216) {
            return;
        }
        while (arg2 > 0) {
            int var5 = this.field3222.read(arg0, arg3, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg2 -= var5;
            arg3 += var5;
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(Z)V", line = 47)
    public final void method1503(boolean arg0) {
        field3199++;
        if (this.field3216 || arg0) {
            return;
        }
        synchronized (this) {
            this.field3216 = true;
            this.notifyAll();
        }
        if (this.field3223 != null) {
            while (this.field3223.field3268 == 0) {
                class278.method1757(1L, 0);
            }
            if (this.field3223.field3268 == 1) {
                try {
                    ((Thread) this.field3223.field3270).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field3223 = null;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(IIBIII)V", line = 86)
    public static final void method1504(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field3208++;
        int var6 = (arg4 - 32) * arg4 / arg3;
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg4 - var6 - 32) * arg0 / (arg3 - arg4);
        class45.field548[0].method90(arg5, arg1);
        class45.field548[1].method90(arg5, arg1 + arg4 - 16);
        class218.field2991.method1150((byte) 122, arg1 + 16, arg5, arg4 - 32, 16, class420.field6035);
        class218.field2991.method1150((byte) 122, arg1 + var7 + 16, arg5, var6, 16, class130.field1804);
        class218.field2991.method1148(arg5, 1, class197.field2676, var6, var7 + arg1 + 16);
        class218.field2991.method1148(arg5 + 1, 1, class197.field2676, var6, arg1 + var7 + 16);
        if (arg2 != 116) {
            field3220 = null;
        }
        class218.field2991.method1146(class197.field2676, (byte) 60, var7 + arg1 + 16, 16, arg5);
        class218.field2991.method1146(class197.field2676, (byte) 60, arg1 + var7 + 17, 16, arg5);
        class218.field2991.method1148(arg5 + 15, 1, class324.field4568, var6, arg1 - (-var7 - 16));
        class218.field2991.method1148(arg5 + 14, 1, class324.field4568, var6 - 1, arg1 + 17 + var7);
        class218.field2991.method1146(class324.field4568, (byte) 60, var7 + arg1 + var6 + 15, 16, arg5);
        class218.field2991.method1146(class324.field4568, (byte) 60, var7 + arg1 + var6 + 14, 15, arg5 + 1);
    }

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "(I)V", line = 120)
    public final void method1505(int arg0) {
        field3209++;
        if (this.field3216) {
            return;
        }
        this.field3222 = new class303();
        this.field3200 = new class248();
        if (arg0 > -88) {
            this.field3217 = 115;
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(B)V", line = 140)
    public static void method1506(byte arg0) {
        field3220 = null;
        field3210 = null;
        if (arg0 <= 43) {
            method1507(true);
        }
    }

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "(Z)V", line = 158)
    public static final void method1507(boolean arg0) {
        field3221++;
        if (class400.field5808) {
            return;
        }
        class452.method2815((byte) 32, class384.field5629);
        if (class379.field5582 != null) {
            class452.method2815((byte) 107, class379.field5582);
        }
        class400.field5808 = arg0;
    }

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "(B)I", line = 179)
    public final int method1508(byte arg0) throws IOException {
        int var2 = 21 / ((arg0 - 29) / 32);
        field3211++;
        return this.field3216 ? 0 : this.field3222.available();
    }

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "(B)I", line = 209)
    public final int method1509(byte arg0) throws IOException {
        field3215++;
        if (arg0 != 26) {
            this.field3223 = null;
        }
        return this.field3216 ? 0 : this.field3222.read();
    }

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "(I)V", line = 224)
    public final void method1510(int arg0) throws IOException {
        field3202++;
        if (this.field3216) {
            return;
        }
        if (arg0 != 16) {
            this.finalize();
        }
        if (this.field3206) {
            this.field3206 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!fr", name = "<init>", descriptor = "(Ljava/net/Socket;Lam;)V", line = 391)
    public class236(Socket arg0, class378 arg1) throws IOException {
        this.field3212 = arg1;
        this.field3218 = arg0;
        this.field3218.setSoTimeout(30000);
        this.field3218.setTcpNoDelay(true);
        this.field3222 = this.field3218.getInputStream();
        this.field3200 = this.field3218.getOutputStream();
    }

    @OriginalMember(owner = "client!fr", name = "run", descriptor = "()V", line = 256)
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field3224 == this.field3217) {
                            if (this.field3216) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        var2 = this.field3224;
                        if (this.field3217 >= this.field3224) {
                            var3 = this.field3217 - this.field3224;
                        } else {
                            var3 = 5000 - this.field3224;
                        }
                    }
                    if (var3 <= 0) {
                        continue;
                    }
                    try {
                        this.field3200.write(this.field3214, var2, var3);
                    } catch (IOException var9) {
                        this.field3206 = true;
                    }
                    this.field3224 = (this.field3224 + var3) % 5000;
                    try {
                        if (this.field3224 == this.field3217) {
                            this.field3200.flush();
                        }
                    } catch (IOException var8) {
                        this.field3206 = true;
                    }
                    continue;
                }
                try {
                    if (this.field3222 != null) {
                        this.field3222.close();
                    }
                    if (this.field3200 != null) {
                        this.field3200.close();
                    }
                    if (this.field3218 != null) {
                        this.field3218.close();
                    }
                } catch (IOException var7) {
                }
                this.field3214 = null;
                break;
            }
        } catch (Exception var12) {
            class411.method2578(var12, (String) null, (byte) -68);
        }
        field3203++;
    }

    @OriginalMember(owner = "client!fr", name = "finalize", descriptor = "()V", line = 328)
    protected final void finalize() {
        field3201++;
        this.method1503(false);
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(III[B)V", line = 336)
    public final void method1511(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field3205++;
        if (this.field3216) {
            return;
        }
        if (this.field3206) {
            this.field3206 = false;
            throw new IOException();
        }
        if (this.field3214 == null) {
            this.field3214 = new byte[5000];
        }
        synchronized (this) {
            if (arg1 != 28067) {
                this.method1503(true);
            }
            for (int var6 = 0; var6 < arg0; var6++) {
                this.field3214[this.field3217] = arg3[arg2 + var6];
                this.field3217 = (this.field3217 + 1) % 5000;
                if ((this.field3224 + 4900) % 5000 == this.field3217) {
                    throw new IOException();
                }
            }
            if (this.field3223 == null) {
                this.field3223 = this.field3212.method2386(3, this, (byte) -55);
            }
            this.notifyAll();
        }
    }
}
