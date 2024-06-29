import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nia")
public class class674 implements Runnable {

    @OriginalMember(owner = "client!nia", name = "l", descriptor = "I")
    private int field9556 = 0;

    @OriginalMember(owner = "client!nia", name = "d", descriptor = "I")
    private int field9559 = 0;

    @OriginalMember(owner = "client!nia", name = "i", descriptor = "I")
    private int field9567;

    @OriginalMember(owner = "client!nia", name = "k", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field9557;

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "[B")
    private byte[] field9561;

    @OriginalMember(owner = "client!nia", name = "g", descriptor = "Ljava/lang/Thread;")
    private Thread field9558;

    @OriginalMember(owner = "client!nia", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9569 = new String[] { method4880(method4879("\u001d3\u0017)\u0018[")), method4880(method4879("\u001d/\u001ak")), method4880(method4879("\u001d3\u0017)\u001e[")), method4880(method4879("\btX)&")), method4880(method4879("\u001d3\u0017)g\u001a4\u001fse[")), method4880(method4879("\u001d3\u0017))\u00064^")), method4880(method4879("\u001d3\u0017)\u001a[")), method4880(method4879("\u001d3\u0017)\u001f[")) };

    @OriginalMember(owner = "client!nia", name = "f", descriptor = "Ltda;")
    public static class666 field9562 = new class666();

    @OriginalMember(owner = "client!nia", name = "e", descriptor = "[[I")
    public static int[][] field9568 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!nia", name = "c", descriptor = "I")
    public static int field9560;

    @OriginalMember(owner = "client!nia", name = "m", descriptor = "I")
    public static int field9563;

    @OriginalMember(owner = "client!nia", name = "j", descriptor = "I")
    public static int field9565;

    @OriginalMember(owner = "client!nia", name = "h", descriptor = "I")
    public static int field9566;

    @OriginalMember(owner = "client!nia", name = "b", descriptor = "Ljava/io/IOException;")
    private IOException field9564;

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(B[BII)V", line = 3)
    public final void method4874(byte arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        try {
            field9563++;
            if (arg3 < 0 || arg2 < 0 || arg1.length < arg2 + arg3) {
                throw new IOException();
            }
            synchronized (this) {
                if (this.field9564 != null) {
                    throw new IOException(this.field9564.toString());
                }
                int var6;
                if (this.field9556 < this.field9559) {
                    var6 = this.field9559 - this.field9556 - 1;
                } else {
                    var6 = this.field9567 + this.field9559 - this.field9556 - 1;
                }
                if (arg0 == -2) {
                    if (arg3 > var6) {
                        throw new IOException("");
                    }
                    if (this.field9556 + arg3 <= this.field9567) {
                        class405.method3259(arg1, arg2, this.field9561, this.field9556, arg3);
                    } else {
                        int var7 = this.field9567 - this.field9556;
                        class405.method3259(arg1, arg2, this.field9561, this.field9556, var7);
                        class405.method3259(arg1, arg2 + var7, this.field9561, 0, arg3 - var7);
                    }
                    this.field9556 = (this.field9556 + arg3) % this.field9567;
                    this.notifyAll();
                }
            }
        } catch (RuntimeException var12) {
            throw class590.method4333(var12, field9569[2] + arg0 + ',' + (arg1 == null ? field9569[1] : field9569[3]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!nia", name = "b", descriptor = "(I)V", line = 45)
    public static void method4875(int arg0) {
        try {
            field9562 = null;
            field9568 = null;
            if (arg0 != -20361) {
                method4876(null, 96, -101);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field9569[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "([Lrda;II)V", line = 56)
    public static final void method4876(class693[] arg0, int arg1, int arg2) {
        if (arg1 >= arg2) {
            return;
        }
        int var3 = (arg1 + arg2) / 2;
        int var4 = arg1;
        class693 var5 = arg0[var3];
        arg0[var3] = arg0[arg2];
        arg0[arg2] = var5;
        int var6 = var5.field9973;
        for (int var7 = arg1; var7 < arg2; var7++) {
            if (arg0[var7].field9973 > (var7 & 0x1) + var6) {
                class693 var8 = arg0[var7];
                arg0[var7] = arg0[var4];
                arg0[var4++] = var8;
            }
        }
        arg0[arg2] = arg0[var4];
        arg0[var4] = var5;
        method4876(arg0, arg1, var4 - 1);
        method4876(arg0, var4 + 1, arg2);
    }

    @OriginalMember(owner = "client!nia", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V", line = 213)
    public class674(OutputStream arg0, int arg1) {
        try {
            this.field9567 = arg1 + 1;
            this.field9557 = arg0;
            this.field9561 = new byte[this.field9567];
            this.field9558 = new Thread(this);
            this.field9558.setDaemon(true);
            this.field9558.start();
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field9569[4] + (arg0 == null ? field9569[1] : field9569[3]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!nia", name = "run", descriptor = "()V", line = 101)
    public final void run() {
        try {
            field9565++;
            while (true) {
                int var2;
                synchronized (this) {
                    while (true) {
                        if (this.field9564 != null) {
                            return;
                        }
                        if (this.field9556 < this.field9559) {
                            var2 = this.field9556 + this.field9567 - this.field9559;
                        } else {
                            var2 = this.field9556 - this.field9559;
                        }
                        if (var2 > 0) {
                            break;
                        }
                        try {
                            this.field9557.flush();
                        } catch (IOException var17) {
                            this.field9564 = var17;
                            return;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var16) {
                        }
                    }
                }
                try {
                    if (this.field9559 + var2 <= this.field9567) {
                        this.field9557.write(this.field9561, this.field9559, var2);
                    } else {
                        int var4 = this.field9567 - this.field9559;
                        this.field9557.write(this.field9561, this.field9559, var4);
                        this.field9557.write(this.field9561, 0, var2 - var4);
                    }
                } catch (IOException var19) {
                    IOException var5 = var19;
                    synchronized (this) {
                        this.field9564 = var5;
                        return;
                    }
                }
                synchronized (this) {
                    this.field9559 = (this.field9559 + var2) % this.field9567;
                }
            }
        } catch (RuntimeException var21) {
            throw class590.method4333(var21, field9569[5] + ')');
        }
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(I)V", line = 170)
    public final void method4877(int arg0) {
        try {
            this.field9557 = new class538();
            field9560++;
            if (arg0 != 6) {
                this.method4878((byte) -128);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9569[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(B)V", line = 189)
    public final void method4878(byte arg0) {
        try {
            field9566++;
            synchronized (this) {
                if (this.field9564 == null) {
                    this.field9564 = new IOException("");
                }
                this.notifyAll();
            }
            try {
                int var3 = -78 % ((7 - arg0) / 62);
                this.field9558.join();
            } catch (InterruptedException var5) {
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field9569[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nia", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4879(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5B);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!nia", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4880(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 115;
                    break;
                case 1:
                    var10005 = 90;
                    break;
                case 2:
                    var10005 = 118;
                    break;
                case 3:
                    var10005 = 7;
                    break;
                default:
                    var10005 = 91;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
