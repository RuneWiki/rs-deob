import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class22 implements Runnable {

    @OriginalMember(owner = "client!na", name = "m", descriptor = "Z")
    private boolean field334 = false;

    @OriginalMember(owner = "client!na", name = "n", descriptor = "I")
    private int field335 = 0;

    @OriginalMember(owner = "client!na", name = "s", descriptor = "Z")
    private boolean field340 = false;

    @OriginalMember(owner = "client!na", name = "x", descriptor = "I")
    private int field345 = 0;

    @OriginalMember(owner = "client!na", name = "g", descriptor = "Ljava/net/Socket;")
    private Socket field328;

    @OriginalMember(owner = "client!na", name = "t", descriptor = "Lvc;")
    private class137 field341;

    @OriginalMember(owner = "client!na", name = "j", descriptor = "Ljava/io/InputStream;")
    private InputStream field331;

    @OriginalMember(owner = "client!na", name = "k", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field332;

    @OriginalMember(owner = "client!na", name = "l", descriptor = "Ljava/lang/String;")
    public static String field333 = "Loaded textures";

    @OriginalMember(owner = "client!na", name = "c", descriptor = "Lod;")
    public static class223 field324 = new class223(64);

    @OriginalMember(owner = "client!na", name = "z", descriptor = "[I")
    public static int[] field347 = new int[50];

    @OriginalMember(owner = "client!na", name = "b", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "I")
    public static int field325;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!na", name = "f", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!na", name = "i", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!na", name = "o", descriptor = "I")
    public static int field336;

    @OriginalMember(owner = "client!na", name = "p", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!na", name = "r", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "client!na", name = "u", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!na", name = "v", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!na", name = "w", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!na", name = "y", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "Lcl;")
    private class114 field322;

    @OriginalMember(owner = "client!na", name = "q", descriptor = "Ltn;")
    public static class38 field338;

    @OriginalMember(owner = "client!na", name = "h", descriptor = "[B")
    private byte[] field329;

    @OriginalMember(owner = "client!na", name = "finalize", descriptor = "()V", line = 5)
    protected final void finalize() {
        field346++;
        this.method218(true);
    }

    @OriginalMember(owner = "client!na", name = "run", descriptor = "()V", line = 18)
    public final void run() {
        try {
            while (true) {
                int var3;
                int var4;
                label87: {
                    synchronized (this) {
                        label88: {
                            if (this.field345 == this.field335) {
                                if (this.field334) {
                                    break label88;
                                }
                                try {
                                    this.wait();
                                } catch (InterruptedException var13) {
                                }
                            }
                            if (this.field335 > this.field345) {
                                var3 = 5000 - this.field335;
                            } else {
                                var3 = this.field345 - this.field335;
                            }
                            var4 = this.field335;
                            break label87;
                        }
                    }
                    try {
                        if (this.field331 != null) {
                            this.field331.close();
                        }
                        if (this.field332 != null) {
                            this.field332.close();
                        }
                        if (this.field328 != null) {
                            this.field328.close();
                        }
                    } catch (IOException var10) {
                    }
                    this.field329 = null;
                    break;
                }
                if (var3 > 0) {
                    try {
                        this.field332.write(this.field329, var4, var3);
                    } catch (IOException var12) {
                        this.field340 = true;
                    }
                    this.field335 = (this.field335 + var3) % 5000;
                    try {
                        if (this.field345 == this.field335) {
                            this.field332.flush();
                        }
                    } catch (IOException var11) {
                        this.field340 = true;
                    }
                }
            }
        } catch (Exception var15) {
            client.method949((String) null, var15, 24);
        }
        field343++;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(B)I", line = 87)
    public final int method214(byte arg0) throws IOException {
        field339++;
        if (this.field334) {
            return 0;
        } else {
            if (arg0 != 83) {
                field324 = (class223) null;
            }
            return this.field331.read();
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIZIII)V", line = 107)
    public static final void method215(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field342++;
        int var6 = arg4;
        int var7 = 0;
        int var8 = arg3 * arg3;
        if (!arg2) {
            return;
        }
        int var9 = var8 << 1;
        int var10 = arg4 * arg4;
        int var11 = var10 << 1;
        int var12 = arg4 << 1;
        int var13 = (1 - var12) * var8 + var11;
        int var14 = var10 - ((var12 - 1) * var9);
        int var15 = var8 << 2;
        int var16 = ((var7 << 1) + 3) * var11;
        int var17 = var10 << 2;
        int var18 = (var7 + 1) * var17;
        if (arg5 >= class42.field579 && arg5 <= class334.field5205) {
            int var19 = class171.method1280(class291.field4490, (byte) -7, class210.field3309, arg0 + arg3);
            int var20 = class171.method1280(class291.field4490, (byte) -7, class210.field3309, arg0 - arg3);
            class256.method1853(class284.field4402[arg5], var20, arg1, var19, 0);
        }
        int var21 = (arg4 - 1) * var15;
        int var22 = ((arg4 << 1) - 3) * var9;
        while (var6 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var14 += var18;
                    var18 += var17;
                    var13 += var16;
                    var16 += var17;
                    var7++;
                }
            }
            if (var14 < 0) {
                var7++;
                var13 += var16;
                var16 += var17;
                var14 += var18;
                var18 += var17;
            }
            var6--;
            var13 += -var21;
            var14 += -var22;
            int var23 = arg5 + var6;
            var21 -= var15;
            int var24 = arg5 - var6;
            var22 -= var15;
            if (var23 >= class42.field579 && class334.field5205 >= var24) {
                int var25 = class171.method1280(class291.field4490, (byte) -7, class210.field3309, arg0 + var7);
                int var26 = class171.method1280(class291.field4490, (byte) -7, class210.field3309, arg0 - var7);
                if (class42.field579 <= var24) {
                    class256.method1853(class284.field4402[var24], var26, arg1, var25, 0);
                }
                if (class334.field5205 >= var23) {
                    class256.method1853(class284.field4402[var23], var26, arg1, var25, 0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(II)I", line = 211)
    public static final int method216(int arg0, int arg1) {
        if (arg0 >= -49) {
            return 103;
        } else {
            field344++;
            return arg1 & 0xFF;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)I", line = 222)
    public final int method217(int arg0) throws IOException {
        field325++;
        if (arg0 != 30000) {
            field333 = (String) null;
        }
        return this.field334 ? 0 : this.field331.available();
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Z)V", line = 237)
    public final void method218(boolean arg0) {
        field336++;
        if (this.field334) {
            return;
        }
        synchronized (this) {
            this.field334 = arg0;
            this.notifyAll();
        }
        if (this.field322 != null) {
            while (this.field322.field1595 == 0) {
                class272.method1918((byte) 22, 1L);
            }
            if (this.field322.field1595 == 1) {
                try {
                    ((Thread) this.field322.field1591).join();
                } catch (InterruptedException var5) {
                }
            }
        }
        this.field322 = null;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(II[BB)V", line = 275)
    public final void method219(int arg0, int arg1, byte[] arg2, byte arg3) throws IOException {
        field326++;
        if (this.field334) {
            return;
        }
        while (arg0 > 0) {
            int var5 = this.field331.read(arg2, arg1, arg0);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 += var5;
            arg0 -= var5;
        }
        if (arg3 != 24) {
            this.run();
        }
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V", line = 301)
    public final void method220(int arg0) throws IOException {
        field330++;
        if (this.field334) {
            return;
        }
        if (arg0 != -6365) {
            this.field340 = true;
        }
        if (this.field340) {
            this.field340 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I[BII)V", line = 322)
    public final void method221(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field323++;
        if (this.field334) {
            return;
        }
        if (this.field340) {
            this.field340 = false;
            throw new IOException();
        }
        if (this.field329 == null) {
            this.field329 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg3; var6++) {
                this.field329[this.field345] = arg1[arg2 + var6];
                this.field345 = (this.field345 + 1) % 5000;
                if ((this.field335 + 4900) % 5000 == this.field345) {
                    throw new IOException();
                }
            }
            int var7 = 67 / ((21 - arg0) / 56);
            if (this.field322 == null) {
                this.field322 = this.field341.method1014(this, 6, 3);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(Ljava/net/Socket;Lvc;)V", line = 435)
    public class22(Socket arg0, class137 arg1) throws IOException {
        this.field328 = arg0;
        this.field341 = arg1;
        this.field328.setSoTimeout(30000);
        this.field328.setTcpNoDelay(true);
        this.field331 = this.field328.getInputStream();
        this.field332 = this.field328.getOutputStream();
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(B)V", line = 385)
    public final void method222(byte arg0) {
        if (arg0 >= -82) {
            return;
        }
        field327++;
        if (!this.field334) {
            this.field331 = new class41();
            this.field332 = new class62();
        }
    }

    @OriginalMember(owner = "client!na", name = "c", descriptor = "(I)V", line = 410)
    public static void method223(int arg0) {
        field338 = null;
        field347 = null;
        field333 = null;
        if (arg0 != -1) {
            method215(72, -33, false, -24, -115, 1);
        }
        field324 = null;
    }
}
