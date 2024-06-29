import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class251 implements Runnable {

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "Z")
    private boolean field4324 = false;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "I")
    private int field4328 = 0;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "Z")
    private boolean field4326 = false;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
    private int field4322 = 0;

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "Ljava/net/Socket;")
    private Socket field4335;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "Lgj;")
    private class239 field4325;

    @OriginalMember(owner = "client!vb", name = "s", descriptor = "Ljava/io/InputStream;")
    private InputStream field4340;

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field4336;

    @OriginalMember(owner = "client!vb", name = "q", descriptor = "Lqe;")
    public static class168 field4338 = class66.method448("Schrifts-=tze geladen)3", 122);

    @OriginalMember(owner = "client!vb", name = "r", descriptor = "Lqe;")
    public static class168 field4339 = class66.method448(")1p", -127);

    @OriginalMember(owner = "client!vb", name = "y", descriptor = "[I")
    public static int[] field4346 = new int[32];

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
    public static int field4323;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
    public static int field4327;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "I")
    public static int field4329;

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "I")
    public static int field4331;

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "I")
    public static int field4332;

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "I")
    public static int field4333;

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "I")
    public static int field4334;

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "I")
    public static int field4337;

    @OriginalMember(owner = "client!vb", name = "u", descriptor = "I")
    public static int field4342;

    @OriginalMember(owner = "client!vb", name = "v", descriptor = "I")
    public static int field4343;

    @OriginalMember(owner = "client!vb", name = "w", descriptor = "I")
    public static int field4344;

    @OriginalMember(owner = "client!vb", name = "x", descriptor = "I")
    public static int field4345;

    @OriginalMember(owner = "client!vb", name = "z", descriptor = "I")
    public static int field4347;

    @OriginalMember(owner = "client!vb", name = "t", descriptor = "Leg;")
    private class5 field4341;

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "[B")
    private byte[] field4330;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(BII)V")
    public static final void method1647(byte arg0, int arg1, int arg2) {
        class50.field682[arg1] = arg2;
        if (arg0 != 12) {
            field4338 = null;
        }
        field4329++;
        class245 var3 = (class245) class104.field1673.method1527((long) arg1, (byte) -87);
        if (var3 == null) {
            class245 var4 = new class245(4611686018427387905L);
            class104.field1673.method1533((long) arg1, 75, var4);
        } else if (var3.field4249 != 4611686018427387905L) {
            var3.field4249 = class59.method407(-121) + 500L | 0x4000000000000000L;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)I")
    public final int method1648(int arg0) throws IOException {
        if (arg0 > -84) {
            return -88;
        } else {
            field4345++;
            return this.field4326 ? 0 : this.field4340.available();
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(BIIZI[Lmj;)V")
    public static final void method1649(byte arg0, int arg1, int arg2, boolean arg3, int arg4, class129[] arg5) {
        for (int var6 = 0; var6 < arg5.length; var6++) {
            class129 var7 = arg5[var6];
            if (var7 != null && var7.field2276 == arg2) {
                class52.method375(var7, arg1, false, arg3, arg4);
                class64.method438(arg4, var7, arg1, (byte) -86);
                if (var7.field2291 - var7.field2210 < var7.field2224) {
                    var7.field2224 = var7.field2291 - var7.field2210;
                }
                if (var7.field2224 < 0) {
                    var7.field2224 = 0;
                }
                if (var7.field2203 > var7.field2271 - var7.field2175) {
                    var7.field2203 = var7.field2271 - var7.field2175;
                }
                if (var7.field2203 < 0) {
                    var7.field2203 = 0;
                }
                if (var7.field2230 == 0) {
                    class149.method993(10218, arg3, var7);
                }
            }
        }
        field4343++;
        if (arg0 >= -81) {
            field4338 = null;
        }
    }

    @OriginalMember(owner = "client!vb", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field4328 == this.field4322) {
                            if (this.field4326) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        var2 = this.field4328;
                        if (this.field4322 >= this.field4328) {
                            var3 = this.field4322 - this.field4328;
                        } else {
                            var3 = 5000 - this.field4328;
                        }
                    }
                    if (var3 <= 0) {
                        continue;
                    }
                    try {
                        this.field4336.write(this.field4330, var2, var3);
                    } catch (IOException var9) {
                        this.field4324 = true;
                    }
                    this.field4328 = (this.field4328 + var3) % 5000;
                    try {
                        if (this.field4328 == this.field4322) {
                            this.field4336.flush();
                        }
                    } catch (IOException var8) {
                        this.field4324 = true;
                    }
                    continue;
                }
                try {
                    if (this.field4340 != null) {
                        this.field4340.close();
                    }
                    if (this.field4336 != null) {
                        this.field4336.close();
                    }
                    if (this.field4335 != null) {
                        this.field4335.close();
                    }
                } catch (IOException var7) {
                }
                this.field4330 = null;
                break;
            }
        } catch (Exception var12) {
            class112.method763(var12, null, 110);
        }
        field4333++;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(II[BI)V")
    public final void method1650(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field4344++;
        if (this.field4326) {
            return;
        }
        if (this.field4324) {
            this.field4324 = false;
            throw new IOException();
        }
        if (this.field4330 == null) {
            this.field4330 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg3; var6++) {
                this.field4330[this.field4322] = arg2[arg1 + var6];
                this.field4322 = (this.field4322 + 1) % 5000;
                if ((this.field4328 + 4900) % 5000 == this.field4322) {
                    throw new IOException();
                }
            }
            if (arg0 != 12398) {
                this.finalize();
            }
            if (this.field4341 == null) {
                this.field4341 = this.field4325.method1553((byte) 63, 3, this);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)I")
    public static final int method1651(int arg0, int arg1) {
        field4337++;
        int var2 = (arg1 >>> 1 & 0x55555555) + (arg1 & 0x55555555);
        int var3 = (var2 & 0x33333333) + (var2 >>> 2 & 0xB3333333);
        int var4 = var3 + (var3 >>> 4) & 0xF0F0F0F;
        if (arg0 != 255) {
            method1654(false);
        }
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(II[BI)V")
    public final void method1652(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field4323++;
        if (this.field4326) {
            return;
        }
        if (arg0 != -1) {
            method1647((byte) -89, 103, 53);
        }
        while (arg1 > 0) {
            int var5 = this.field4340.read(arg2, arg3, arg1);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg3 += var5;
            arg1 -= var5;
        }
    }

    @OriginalMember(owner = "client!vb", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field4327++;
        this.method1653(-115);
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)V")
    public final void method1653(int arg0) {
        field4342++;
        if (this.field4326) {
            return;
        }
        synchronized (this) {
            this.field4326 = true;
            this.notifyAll();
        }
        int var3 = 12 % ((arg0 - 25) / 42);
        if (this.field4341 != null) {
            while (this.field4341.field57 == 0) {
                class38.method259(1L, 31644);
            }
            if (this.field4341.field57 == 1) {
                try {
                    ((Thread) this.field4341.field59).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field4341 = null;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Z)V")
    public static final void method1654(boolean arg0) {
        field4331++;
        class114 var1 = (class114) class176.field3079.method1536(69);
        if (arg0) {
            method1649((byte) 106, 78, -109, true, -1, null);
        }
        while (var1 != null) {
            int var2 = var1.field1853;
            if (class97.method636(var2, -125)) {
                boolean var3 = true;
                class129[] var4 = class108.field1741[var2];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field2258;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field3308;
                    class129 var7 = class257.method1713(var6, 126);
                    if (var7 != null) {
                        class65.method443(var7, 0);
                    }
                }
            }
            var1 = (class114) class176.field3079.method1534(-21389);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V")
    public static void method1655(byte arg0) {
        if (arg0 <= 63) {
            field4347 = -68;
        }
        field4346 = null;
        field4338 = null;
        field4339 = null;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(III)I")
    public static final int method1656(int arg0, int arg1, int arg2) {
        field4332++;
        class170 var3 = (class170) class119.field1941.method1527((long) arg1, (byte) -118);
        if (var3 == null) {
            return 0;
        } else if (arg2 >= arg0 && var3.field2960.length > arg2) {
            return var3.field2960[arg2];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(I)I")
    public final int method1657(int arg0) throws IOException {
        if (arg0 != 5000) {
            method1654(false);
        }
        field4334++;
        return this.field4326 ? 0 : this.field4340.read();
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Ljava/net/Socket;Lgj;)V")
    public class251(Socket arg0, class239 arg1) throws IOException {
        this.field4335 = arg0;
        this.field4325 = arg1;
        this.field4335.setSoTimeout(30000);
        this.field4335.setTcpNoDelay(true);
        this.field4340 = this.field4335.getInputStream();
        this.field4336 = this.field4335.getOutputStream();
    }
}
