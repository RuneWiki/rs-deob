import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class227 implements Runnable {

    @OriginalMember(owner = "client!al", name = "q", descriptor = "I")
    private int field3923 = 0;

    @OriginalMember(owner = "client!al", name = "u", descriptor = "Z")
    private boolean field3927 = false;

    @OriginalMember(owner = "client!al", name = "s", descriptor = "Z")
    private boolean field3925 = false;

    @OriginalMember(owner = "client!al", name = "c", descriptor = "I")
    private int field3909 = 0;

    @OriginalMember(owner = "client!al", name = "d", descriptor = "Ljava/net/Socket;")
    private Socket field3910;

    @OriginalMember(owner = "client!al", name = "b", descriptor = "Lug;")
    private class198 field3908;

    @OriginalMember(owner = "client!al", name = "w", descriptor = "Ljava/io/InputStream;")
    private InputStream field3929;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field3907;

    @OriginalMember(owner = "client!al", name = "k", descriptor = "[I")
    public static int[] field3917 = new int[500];

    @OriginalMember(owner = "client!al", name = "i", descriptor = "I")
    public static int field3915 = 0;

    @OriginalMember(owner = "client!al", name = "p", descriptor = "Lp;")
    public static class280 field3922 = class18.method140((byte) -119, "Monde de jeu cr-B-B");

    @OriginalMember(owner = "client!al", name = "t", descriptor = "Z")
    public static volatile boolean field3926 = true;

    @OriginalMember(owner = "client!al", name = "z", descriptor = "Lp;")
    public static class280 field3932 = class18.method140((byte) -118, "0");

    @OriginalMember(owner = "client!al", name = "e", descriptor = "I")
    public static int field3911;

    @OriginalMember(owner = "client!al", name = "f", descriptor = "I")
    public static int field3912;

    @OriginalMember(owner = "client!al", name = "g", descriptor = "I")
    public static int field3913;

    @OriginalMember(owner = "client!al", name = "j", descriptor = "I")
    public static int field3916;

    @OriginalMember(owner = "client!al", name = "m", descriptor = "I")
    public static int field3919;

    @OriginalMember(owner = "client!al", name = "n", descriptor = "I")
    public static int field3920;

    @OriginalMember(owner = "client!al", name = "o", descriptor = "I")
    public static int field3921;

    @OriginalMember(owner = "client!al", name = "r", descriptor = "I")
    public static int field3924;

    @OriginalMember(owner = "client!al", name = "v", descriptor = "I")
    public static int field3928;

    @OriginalMember(owner = "client!al", name = "y", descriptor = "I")
    public static int field3931;

    @OriginalMember(owner = "client!al", name = "l", descriptor = "Lbc;")
    private class174 field3918;

    @OriginalMember(owner = "client!al", name = "h", descriptor = "Lpa;")
    public static class211 field3914;

    @OriginalMember(owner = "client!al", name = "x", descriptor = "[B")
    private byte[] field3930;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)V")
    public final void method1524(int arg0) throws IOException {
        field3931++;
        if (arg0 > 65 && !this.field3925 && this.field3927) {
            this.field3927 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(I)I")
    public final int method1525(int arg0) throws IOException {
        field3924++;
        if (this.field3925) {
            return 0;
        } else if (arg0 == 5000) {
            return this.field3929.available();
        } else {
            return 72;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(III[B)V")
    public final void method1526(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field3912++;
        if (this.field3925) {
            return;
        }
        if (this.field3927) {
            this.field3927 = false;
            throw new IOException();
        }
        if (this.field3930 == null) {
            this.field3930 = new byte[5000];
        }
        synchronized (this) {
            int var6 = -8 % ((arg1 + 57) / 35);
            for (int var7 = 0; var7 < arg0; var7++) {
                this.field3930[this.field3909] = arg3[arg2 + var7];
                this.field3909 = (this.field3909 + 1) % 5000;
                if (((this.field3923 + 4900) % 5000) == this.field3909) {
                    throw new IOException();
                }
            }
            if (this.field3918 == null) {
                this.field3918 = this.field3908.method1361(this, 4, 3);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IZI)V")
    public static final void method1527(int arg0, boolean arg1, int arg2) {
        int var3 = arg0--;
        if (var3 > 25) {
            var3 = 25;
        }
        int var4 = class241.field4218[arg0];
        int var5 = class250.field4385[arg0];
        if (!arg1) {
            return;
        }
        field3916++;
        if (arg2 == 0) {
            class34.field627.method551(38, true);
            class153.field2654++;
            class34.field627.method227(-20435, var3 - (-var3 - 3));
        }
        if (arg2 == 1) {
            class86.field1425++;
            class34.field627.method551(201, arg1);
            class34.field627.method227(-20435, var3 + var3 + 3 + 14);
        }
        if (arg2 == 2) {
            class56.field910++;
            class34.field627.method551(235, true);
            class34.field627.method227(-20435, var3 + var3 + 3);
        }
        class34.field627.method186(1693383072, class88.field1431[82] ? 1 : 0);
        class209.field3599 = class250.field4385[0];
        class73.field1204 = class241.field4218[0];
        for (int var6 = 1; var6 < var3; var6++) {
            arg0--;
            class34.field627.method233(66, class250.field4385[arg0] - var5);
            class34.field627.method236(class241.field4218[arg0] - var4, (byte) 118);
        }
        class34.field627.method214(-3, class49.field806 + var5);
        class34.field627.method228(9949, var4 + class91.field1480);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIB[B)V")
    public final void method1528(int arg0, int arg1, byte arg2, byte[] arg3) throws IOException {
        field3911++;
        if (this.field3925) {
            return;
        }
        while (arg1 > 0) {
            int var5 = this.field3929.read(arg3, arg0, arg1);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg0 += var5;
            arg1 -= var5;
        }
        if (arg2 <= 58) {
            this.field3907 = null;
        }
    }

    @OriginalMember(owner = "client!al", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field3923 == this.field3909) {
                            if (this.field3925) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        var2 = this.field3923;
                        if (this.field3909 >= this.field3923) {
                            var3 = this.field3909 - this.field3923;
                        } else {
                            var3 = 5000 - this.field3923;
                        }
                    }
                    if (var3 <= 0) {
                        continue;
                    }
                    try {
                        this.field3907.write(this.field3930, var2, var3);
                    } catch (IOException var9) {
                        this.field3927 = true;
                    }
                    this.field3923 = (this.field3923 + var3) % 5000;
                    try {
                        if (this.field3923 == this.field3909) {
                            this.field3907.flush();
                        }
                    } catch (IOException var8) {
                        this.field3927 = true;
                    }
                    continue;
                }
                try {
                    if (this.field3929 != null) {
                        this.field3929.close();
                    }
                    if (this.field3907 != null) {
                        this.field3907.close();
                    }
                    if (this.field3910 != null) {
                        this.field3910.close();
                    }
                } catch (IOException var7) {
                }
                this.field3930 = null;
                break;
            }
        } catch (Exception var12) {
            class207.method1398((String) null, -74, var12);
        }
        field3913++;
    }

    @OriginalMember(owner = "client!al", name = "c", descriptor = "(I)I")
    public final int method1529(int arg0) throws IOException {
        field3921++;
        if (arg0 != 0) {
            this.field3907 = null;
        }
        return this.field3925 ? 0 : this.field3929.read();
    }

    @OriginalMember(owner = "client!al", name = "d", descriptor = "(I)V")
    public static void method1530(int arg0) {
        field3914 = null;
        field3917 = null;
        field3932 = null;
        field3922 = null;
        if (arg0 != 5000) {
            field3922 = null;
        }
    }

    @OriginalMember(owner = "client!al", name = "e", descriptor = "(I)V")
    public final void method1531(int arg0) {
        field3919++;
        if (!this.field3925) {
            int var2 = -19 / ((arg0 - 20) / 43);
            this.field3929 = new class254();
            this.field3907 = new class59();
        }
    }

    @OriginalMember(owner = "client!al", name = "f", descriptor = "(I)V")
    public final void method1532(int arg0) {
        field3920++;
        if (arg0 < 27 || this.field3925) {
            return;
        }
        synchronized (this) {
            this.field3925 = true;
            this.notifyAll();
        }
        if (this.field3918 != null) {
            while (this.field3918.field3025 == 0) {
                class159.method1130(1L, 0);
            }
            if (this.field3918.field3025 == 1) {
                try {
                    ((Thread) this.field3918.field3028).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field3918 = null;
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Ljava/net/Socket;Lug;)V")
    public class227(Socket arg0, class198 arg1) throws IOException {
        this.field3910 = arg0;
        this.field3908 = arg1;
        this.field3910.setSoTimeout(30000);
        this.field3910.setTcpNoDelay(true);
        this.field3929 = this.field3910.getInputStream();
        this.field3907 = this.field3910.getOutputStream();
    }

    @OriginalMember(owner = "client!al", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method1532(63);
        field3928++;
    }
}
