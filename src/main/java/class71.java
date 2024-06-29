import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class71 implements Runnable {

    @OriginalMember(owner = "client!eo", name = "f", descriptor = "Z")
    private boolean field930 = false;

    @OriginalMember(owner = "client!eo", name = "j", descriptor = "I")
    private int field934 = 0;

    @OriginalMember(owner = "client!eo", name = "s", descriptor = "Z")
    private boolean field943 = false;

    @OriginalMember(owner = "client!eo", name = "z", descriptor = "I")
    private int field950 = 0;

    @OriginalMember(owner = "client!eo", name = "o", descriptor = "Ljava/net/Socket;")
    private Socket field939;

    @OriginalMember(owner = "client!eo", name = "x", descriptor = "Lpm;")
    private class69 field948;

    @OriginalMember(owner = "client!eo", name = "r", descriptor = "Ljava/io/InputStream;")
    private InputStream field942;

    @OriginalMember(owner = "client!eo", name = "e", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field929;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "I")
    public static int field925 = 5063219;

    @OriginalMember(owner = "client!eo", name = "l", descriptor = "I")
    public static int field936 = -1;

    @OriginalMember(owner = "client!eo", name = "q", descriptor = "Z")
    public static boolean field941 = false;

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field926 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "I")
    public static int field927;

    @OriginalMember(owner = "client!eo", name = "d", descriptor = "I")
    public static int field928;

    @OriginalMember(owner = "client!eo", name = "g", descriptor = "I")
    public static int field931;

    @OriginalMember(owner = "client!eo", name = "h", descriptor = "I")
    public static int field932;

    @OriginalMember(owner = "client!eo", name = "i", descriptor = "I")
    public static int field933;

    @OriginalMember(owner = "client!eo", name = "m", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!eo", name = "p", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!eo", name = "t", descriptor = "I")
    public static int field944;

    @OriginalMember(owner = "client!eo", name = "u", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "client!eo", name = "w", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!eo", name = "A", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!eo", name = "y", descriptor = "Lvk;")
    private class188 field949;

    @OriginalMember(owner = "client!eo", name = "n", descriptor = "[B")
    private byte[] field938;

    @OriginalMember(owner = "client!eo", name = "v", descriptor = "[Lfe;")
    public static class153[] field946;

    @OriginalMember(owner = "client!eo", name = "k", descriptor = "[[[I")
    public static int[][][] field935;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)V", line = 7)
    public static void method521(int arg0) {
        field926 = null;
        field935 = (int[][][]) null;
        if (arg0 != 14420) {
            method521(31);
        }
        field946 = null;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(I[BIB)V", line = 20)
    public final void method522(int arg0, byte[] arg1, int arg2, byte arg3) throws IOException {
        field928++;
        if (arg3 <= 11) {
            field936 = -8;
        }
        if (this.field930) {
            return;
        }
        while (arg2 > 0) {
            int var5 = this.field942.read(arg1, arg0, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg2 -= var5;
            arg0 += var5;
        }
    }

    @OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(Ljava/net/Socket;Lpm;)V", line = 506)
    public class71(Socket arg0, class69 arg1) throws IOException {
        this.field939 = arg0;
        this.field948 = arg1;
        this.field939.setSoTimeout(30000);
        this.field939.setTcpNoDelay(true);
        this.field942 = this.field939.getInputStream();
        this.field929 = this.field939.getOutputStream();
    }

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "(I)V", line = 57)
    public static final void method523(int arg0) {
        field931++;
        if (class261.field3778 == 0) {
            return;
        }
        try {
            if ((++class340.field5312) > 1500) {
                if (class265.field3848 != null) {
                    class265.field3848.method526(arg0 ^ 0xFFFFED64);
                    class265.field3848 = null;
                }
                if (class10.field118 >= 1) {
                    class49.field654 = -5;
                    class261.field3778 = 0;
                    return;
                }
                class261.field3778 = 1;
                class10.field118++;
                if (class329.field4822 == class253.field3695) {
                    class253.field3695 = class183.field2496;
                } else {
                    class253.field3695 = class329.field4822;
                }
                class340.field5312 = 0;
            }
            if (class261.field3778 == 1) {
                class236.field3406 = class157.field2216.method505(19, class167.field2331, class253.field3695);
                class261.field3778 = 2;
            }
            if (class261.field3778 == 2) {
                if (class236.field3406.field2608 == 2) {
                    throw new IOException();
                }
                if (class236.field3406.field2608 != 1) {
                    return;
                }
                class265.field3848 = new class71((Socket) class236.field3406.field2606, class157.field2216);
                class236.field3406 = null;
                class265.field3848.method530(0, class251.field3681.field4350, class251.field3681.field4351, arg0 ^ 0x2DC5);
                if (class335.field5234 != null) {
                    class335.field5234.method2458(arg0 - 22771);
                }
                if (class328.field4801 != null) {
                    class328.field4801.method2458(2);
                }
                int var1 = class265.field3848.method528(true);
                if (class335.field5234 != null) {
                    class335.field5234.method2458(2);
                }
                if (class328.field4801 != null) {
                    class328.field4801.method2458(2);
                }
                if (var1 != 101) {
                    class49.field654 = var1;
                    class261.field3778 = 0;
                    class265.field3848.method526(arg0 ^ 0xFFFFED64);
                    class265.field3848 = null;
                    return;
                }
                class261.field3778 = 3;
            }
            if (class261.field3778 == 3) {
                if (class265.field3848.method524((byte) -72) < 2) {
                    return;
                }
                int var2 = class265.field3848.method528(true) << 8 | class265.field3848.method528(true);
                class232.method1655((byte) 125, var2);
                if (class84.field1085 == -1) {
                    class261.field3778 = 0;
                    class49.field654 = 6;
                    class265.field3848.method526(-19055);
                    class265.field3848 = null;
                    return;
                }
                class261.field3778 = 0;
                class265.field3848.method526(arg0 ^ 0xFFFFED64);
                class265.field3848 = null;
                class345.method2394((byte) -120);
                return;
            }
        } catch (IOException var4) {
            if (class265.field3848 != null) {
                class265.field3848.method526(-19055);
                class265.field3848 = null;
            }
            if (class10.field118 < 1) {
                class10.field118++;
                class340.field5312 = 0;
                if (class329.field4822 == class253.field3695) {
                    class253.field3695 = class183.field2496;
                } else {
                    class253.field3695 = class329.field4822;
                }
                class261.field3778 = 1;
            } else {
                class261.field3778 = 0;
                class49.field654 = -4;
            }
        }
        if (arg0 != 22773) {
            method525(true, -13);
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(B)I", line = 208)
    public final int method524(byte arg0) throws IOException {
        int var2 = 3 / ((7 - arg0) / 54);
        field932++;
        return this.field930 ? 0 : this.field942.available();
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(ZI)V", line = 225)
    public static final void method525(boolean arg0, int arg1) {
        field937++;
        if (arg1 == -1 || !class140.method1081(-125, arg1) || !arg0) {
            return;
        }
        class333[] var2 = class26.field308[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class333 var4 = var2[var3];
            if (var4.field5147 != null) {
                class135 var5 = new class135();
                var5.field1836 = var4.field5147;
                var5.field1831 = var4;
                class327.method2266(var5, false, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "(I)V", line = 264)
    public final void method526(int arg0) {
        if (arg0 != -19055) {
            this.field938 = (byte[]) null;
        }
        field940++;
        if (this.field930) {
            return;
        }
        synchronized (this) {
            this.field930 = true;
            this.notifyAll();
        }
        if (this.field949 != null) {
            while (this.field949.field2608 == 0) {
                class177.method1299((byte) 64, 1L);
            }
            if (this.field949.field2608 == 1) {
                try {
                    ((Thread) this.field949.field2606).join();
                } catch (InterruptedException var5) {
                }
            }
        }
        this.field949 = null;
    }

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "(B)V", line = 311)
    public final void method527(byte arg0) {
        if (arg0 != 52) {
            field941 = true;
        }
        field947++;
        if (!this.field930) {
            this.field942 = new class344();
            this.field929 = new class247();
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(Z)I", line = 327)
    public final int method528(boolean arg0) throws IOException {
        field927++;
        if (arg0) {
            return this.field930 ? 0 : this.field942.read();
        } else {
            return -38;
        }
    }

    @OriginalMember(owner = "client!eo", name = "finalize", descriptor = "()V", line = 343)
    protected final void finalize() {
        field944++;
        this.method526(-19055);
    }

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "(B)V", line = 351)
    public final void method529(byte arg0) throws IOException {
        field945++;
        if (this.field930) {
            return;
        }
        if (arg0 != -120) {
            method525(false, 116);
        }
        if (this.field943) {
            this.field943 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!eo", name = "run", descriptor = "()V", line = 383)
    public final void run() {
        try {
            while (true) {
                int var3;
                int var4;
                label88: {
                    synchronized (this) {
                        label89: {
                            if (this.field950 == this.field934) {
                                if (this.field930) {
                                    break label89;
                                }
                                try {
                                    this.wait();
                                } catch (InterruptedException var13) {
                                }
                            }
                            var3 = this.field934;
                            if (this.field934 <= this.field950) {
                                var4 = this.field950 - this.field934;
                            } else {
                                var4 = 5000 - this.field934;
                            }
                            break label88;
                        }
                    }
                    try {
                        if (this.field942 != null) {
                            this.field942.close();
                        }
                        if (this.field929 != null) {
                            this.field929.close();
                        }
                        if (this.field939 != null) {
                            this.field939.close();
                        }
                    } catch (IOException var10) {
                    }
                    this.field938 = null;
                    break;
                }
                if (var4 > 0) {
                    try {
                        this.field929.write(this.field938, var3, var4);
                    } catch (IOException var12) {
                        this.field943 = true;
                    }
                    this.field934 = (this.field934 + var4) % 5000;
                    try {
                        if (this.field950 == this.field934) {
                            this.field929.flush();
                        }
                    } catch (IOException var11) {
                        this.field943 = true;
                    }
                }
            }
        } catch (Exception var15) {
            class347.method2409(var15, 3924, (String) null);
        }
        field951++;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(I[BII)V", line = 452)
    public final void method530(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (arg3 != 30000) {
            this.field942 = (InputStream) null;
        }
        field933++;
        if (this.field930) {
            return;
        }
        if (this.field943) {
            this.field943 = false;
            throw new IOException();
        }
        if (this.field938 == null) {
            this.field938 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg2; var6++) {
                this.field938[this.field950] = arg1[arg0 + var6];
                this.field950 = (this.field950 + 1) % 5000;
                if ((this.field934 + 4900) % 5000 == this.field950) {
                    throw new IOException();
                }
            }
            if (this.field949 == null) {
                this.field949 = this.field948.method494(3, true, this);
            }
            this.notifyAll();
        }
    }
}
