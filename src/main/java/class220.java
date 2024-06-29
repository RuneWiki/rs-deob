import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class220 implements Runnable {

    @OriginalMember(owner = "client!kn", name = "k", descriptor = "Z")
    private boolean field3303 = false;

    @OriginalMember(owner = "client!kn", name = "j", descriptor = "I")
    private int field3302 = 0;

    @OriginalMember(owner = "client!kn", name = "n", descriptor = "I")
    private int field3306 = 0;

    @OriginalMember(owner = "client!kn", name = "y", descriptor = "Z")
    private boolean field3317 = false;

    @OriginalMember(owner = "client!kn", name = "g", descriptor = "Lrj;")
    private class22 field3299;

    @OriginalMember(owner = "client!kn", name = "u", descriptor = "Ljava/net/Socket;")
    private Socket field3313;

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "Ljava/io/InputStream;")
    private InputStream field3295;

    @OriginalMember(owner = "client!kn", name = "t", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field3312;

    @OriginalMember(owner = "client!kn", name = "s", descriptor = "Ljava/lang/String;")
    public static String field3311 = "wave2:";

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "I")
    public static int field3294;

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!kn", name = "e", descriptor = "I")
    public static int field3297;

    @OriginalMember(owner = "client!kn", name = "f", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!kn", name = "h", descriptor = "I")
    public static int field3300;

    @OriginalMember(owner = "client!kn", name = "i", descriptor = "I")
    public static int field3301;

    @OriginalMember(owner = "client!kn", name = "l", descriptor = "I")
    public static int field3304;

    @OriginalMember(owner = "client!kn", name = "m", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "client!kn", name = "o", descriptor = "I")
    public static int field3307;

    @OriginalMember(owner = "client!kn", name = "r", descriptor = "I")
    public static int field3310;

    @OriginalMember(owner = "client!kn", name = "v", descriptor = "I")
    public static int field3314;

    @OriginalMember(owner = "client!kn", name = "w", descriptor = "I")
    public static int field3315;

    @OriginalMember(owner = "client!kn", name = "x", descriptor = "I")
    public static int field3316;

    @OriginalMember(owner = "client!kn", name = "z", descriptor = "Lvd;")
    private class153 field3318;

    @OriginalMember(owner = "client!kn", name = "p", descriptor = "Lnk;")
    public static class16 field3308;

    @OriginalMember(owner = "client!kn", name = "q", descriptor = "[B")
    private byte[] field3309;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(B)V", line = 5)
    public final void method1526(byte arg0) {
        if (arg0 != 34) {
            method1535((byte) 105);
        }
        field3304++;
        if (!this.field3303) {
            this.field3295 = new class4();
            this.field3312 = new class92();
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)V", line = 21)
    public final void method1527(int arg0) {
        field3298++;
        if (this.field3303) {
            return;
        }
        synchronized (this) {
            this.field3303 = true;
            if (arg0 <= 61) {
                method1530((byte) 88);
            }
            this.notifyAll();
        }
        if (this.field3318 != null) {
            while (this.field3318.field2419 == 0) {
                class19.method140(1L, 16711680);
            }
            if (this.field3318.field2419 == 1) {
                try {
                    ((Thread) this.field3318.field2421).join();
                } catch (InterruptedException var5) {
                }
            }
        }
        this.field3318 = null;
    }

    @OriginalMember(owner = "client!kn", name = "finalize", descriptor = "()V", line = 57)
    protected final void finalize() {
        this.method1527(75);
        field3294++;
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(I)I", line = 65)
    public final int method1528(int arg0) throws IOException {
        if (arg0 != -29741) {
            method1530((byte) -106);
        }
        field3296++;
        return this.field3303 ? 0 : this.field3295.read();
    }

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "(I)V", line = 81)
    public static final void method1529(int arg0) {
        class44.field492 = 0;
        field3300++;
        if (arg0 != 2) {
            return;
        }
        class218.field3280 = 0;
        class182.method1257((byte) 104);
        class281.method2027(25);
        class161.method1164(-1);
        for (int var1 = 0; var1 < class44.field492; var1++) {
            int var2 = class351.field5608[var1];
            if (class102.field1381 != class251.field3974[var2].field3772) {
                if (class251.field3974[var2].field3503.method958((byte) 72)) {
                    class75.method475(2045418567, class251.field3974[var2]);
                }
                class251.field3974[var2].method1599(23299, (class140) null);
                class251.field3974[var2] = null;
            }
        }
        if (class191.field2869 != class282.field4499.field2295) {
            throw new RuntimeException("gnp1 pos:" + class282.field4499.field2295 + " psize:" + class191.field2869);
        }
        for (int var3 = 0; var3 < class296.field4667; var3++) {
            if (class251.field3974[class225.field3392[var3]] == null) {
                throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class296.field4667);
            }
        }
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(B)V", line = 134)
    public static void method1530(byte arg0) {
        field3311 = null;
        if (arg0 <= -105) {
            field3308 = null;
        }
    }

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "(B)I", line = 146)
    public final int method1531(byte arg0) throws IOException {
        field3316++;
        int var2 = 101 / ((arg0 - 63) / 54);
        return this.field3303 ? 0 : this.field3295.available();
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(III[B)V", line = 163)
    public final void method1532(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field3297++;
        if (this.field3303) {
            return;
        }
        if (this.field3317) {
            this.field3317 = false;
            throw new IOException();
        }
        if (this.field3309 == null) {
            this.field3309 = new byte[5000];
        }
        synchronized (this) {
            int var6 = -77 % ((-arg2 - 42) / 41);
            for (int var7 = 0; var7 < arg0; var7++) {
                this.field3309[this.field3306] = arg3[arg1 + var7];
                this.field3306 = (this.field3306 + 1) % 5000;
                if ((this.field3302 + 4900) % 5000 == this.field3306) {
                    throw new IOException();
                }
            }
            if (this.field3318 == null) {
                this.field3318 = this.field3299.method155(3, this, -3);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(Ljava/net/Socket;Lrj;)V", line = 446)
    public class220(Socket arg0, class22 arg1) throws IOException {
        this.field3299 = arg1;
        this.field3313 = arg0;
        this.field3313.setSoTimeout(30000);
        this.field3313.setTcpNoDelay(true);
        this.field3295 = this.field3313.getInputStream();
        this.field3312 = this.field3313.getOutputStream();
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IILhi;II)V", line = 222)
    public static final void method1533(int arg0, int arg1, class323 arg2, int arg3, int arg4) {
        if (class272.field4317) {
            class239.method1668(arg0, arg1, arg2.field5169 + arg0, arg2.field5174 + arg1);
        }
        if (class355.field5641 < 3) {
            if (class272.field4317) {
                ((class200) class306.field4767).method1389(arg0, arg1, arg2.field5169, arg2.field5174, class306.field4767.field13 / 2, class306.field4767.field24 / 2, (int) class190.field2855, 256, (class200) arg2.method2249(-57, false));
            } else {
                ((class158) class306.field4767).method1128(arg0, arg1, arg2.field5169, arg2.field5174, class306.field4767.field13 / 2, class306.field4767.field24 / 2, (int) class190.field2855, 256, arg2.field5175, arg2.field5093);
            }
        } else if (class272.field4317) {
            class2 var5 = arg2.method2249(69, false);
            if (var5 != null) {
                var5.method11(arg0, arg1);
            }
        } else {
            class343.method2354(arg0, arg1, 0, arg2.field5175, arg2.field5093);
        }
        int var6 = 123 % ((arg4 + 33) / 38);
        class135.field2012[arg3] = true;
        field3314++;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(ILjava/util/Random;I)I", line = 264)
    public static final int method1534(int arg0, Random arg1, int arg2) {
        field3293++;
        if (arg0 <= 0) {
            throw new IllegalArgumentException();
        } else if (class181.method1250(arg0, arg2 - 6)) {
            return (int) ((long) arg0 * ((long) arg1.nextInt() & 0xFFFFFFFFL) >> 32);
        } else {
            if (arg2 != 2) {
                field3308 = (class16) null;
            }
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg0));
            int var4;
            do {
                var4 = arg1.nextInt();
            } while (var4 >= var3);
            return class42.method263(arg0, var4, 1);
        }
    }

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "(B)V", line = 300)
    public static final void method1535(byte arg0) {
        class16.field199.method383((byte) -48);
        int var1 = -98 / ((-arg0 - 60) / 54);
        class289.field4553.method383((byte) -48);
        field3315++;
        class223.field3374.method383((byte) -48);
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIB[B)V", line = 319)
    public final void method1536(int arg0, int arg1, byte arg2, byte[] arg3) throws IOException {
        field3301++;
        if (this.field3303) {
            return;
        }
        if (arg2 != -57) {
            this.run();
        }
        while (arg1 > 0) {
            int var5 = this.field3295.read(arg3, arg0, arg1);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg0 += var5;
            arg1 -= var5;
        }
    }

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "(I)V", line = 346)
    public final void method1537(int arg0) throws IOException {
        field3307++;
        if (arg0 == 0 && !this.field3303 && this.field3317) {
            this.field3317 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!kn", name = "run", descriptor = "()V", line = 369)
    public final void run() {
        field3310++;
        try {
            while (true) {
                int var3;
                int var4;
                synchronized (this) {
                    if (this.field3306 == this.field3302) {
                        if (this.field3303) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var13) {
                        }
                    }
                    var3 = this.field3302;
                    if (this.field3302 <= this.field3306) {
                        var4 = this.field3306 - this.field3302;
                    } else {
                        var4 = 5000 - this.field3302;
                    }
                }
                if (var4 > 0) {
                    try {
                        this.field3312.write(this.field3309, var3, var4);
                    } catch (IOException var12) {
                        this.field3317 = true;
                    }
                    this.field3302 = (this.field3302 + var4) % 5000;
                    try {
                        if (this.field3306 == this.field3302) {
                            this.field3312.flush();
                        }
                    } catch (IOException var11) {
                        this.field3317 = true;
                    }
                }
            }
            try {
                if (this.field3295 != null) {
                    this.field3295.close();
                }
                if (this.field3312 != null) {
                    this.field3312.close();
                }
                if (this.field3313 != null) {
                    this.field3313.close();
                }
            } catch (IOException var10) {
            }
            this.field3309 = null;
        } catch (Exception var15) {
            class27.method198(var15, (byte) 62, (String) null);
        }
    }
}
