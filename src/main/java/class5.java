import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public class class5 implements Runnable {

    @OriginalMember(owner = "client!js", name = "j", descriptor = "I")
    private int field72 = 0;

    @OriginalMember(owner = "client!js", name = "b", descriptor = "I")
    private int field74 = 0;

    @OriginalMember(owner = "client!js", name = "m", descriptor = "I")
    private int field69;

    @OriginalMember(owner = "client!js", name = "l", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field71;

    @OriginalMember(owner = "client!js", name = "h", descriptor = "[B")
    private byte[] field70;

    @OriginalMember(owner = "client!js", name = "c", descriptor = "Ljava/lang/Thread;")
    private Thread field73;

    @OriginalMember(owner = "client!js", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field75 = new String[] { method38(method37("]K\u0001ahYQ[c)")), method38(method37("YMC1")), method38(method37("L\u0016\u0001s|")), method38(method37("]K\u0001\u001b)")), method38(method37("]K\u0001\u0019)")), method38(method37("]K\u0001\u0018)")), method38(method37("]K\u0001\u001e)")), method38(method37("]K\u0001/tY\u0010")), method38(method37("]K\u0001\u001c)")) };

    @OriginalMember(owner = "client!js", name = "i", descriptor = "Lsb;")
    public static class261 field65 = new class261(48, -1);

    @OriginalMember(owner = "client!js", name = "a", descriptor = "I")
    public static int field61;

    @OriginalMember(owner = "client!js", name = "k", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!js", name = "n", descriptor = "I")
    public static int field63;

    @OriginalMember(owner = "client!js", name = "g", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!js", name = "d", descriptor = "I")
    public static int field66;

    @OriginalMember(owner = "client!js", name = "f", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!js", name = "e", descriptor = "Ljava/io/IOException;")
    private IOException field67;

    @OriginalMember(owner = "client!js", name = "b", descriptor = "(I)V")
    public final void method31(int arg0) {
        try {
            field64++;
            synchronized (this) {
                if (this.field67 == null) {
                    this.field67 = new IOException("");
                }
                this.notifyAll();
            }
            try {
                this.field73.join();
                if (arg0 != -1) {
                    field65 = null;
                }
            } catch (InterruptedException var4) {
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field75[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "([BIIZ)V")
    public final void method32(byte[] arg0, int arg1, int arg2, boolean arg3) throws IOException {
        try {
            field68++;
            if (arg1 < 0 || arg2 < 0 || arg1 + arg2 > arg0.length) {
                throw new IOException();
            }
            synchronized (this) {
                if (this.field67 != null) {
                    throw new IOException(this.field67.toString());
                }
                int var6;
                if (this.field72 > this.field74) {
                    var6 = this.field72 - this.field74 - 1;
                } else {
                    var6 = this.field69 - this.field74 - (-this.field72 - -1);
                }
                if (var6 < arg1) {
                    throw new IOException("");
                }
                if (this.field69 >= this.field74 + arg1) {
                    class569.method4247(arg0, arg2, this.field70, this.field74, arg1);
                } else {
                    int var7 = this.field69 - this.field74;
                    class569.method4247(arg0, arg2, this.field70, this.field74, var7);
                    class569.method4247(arg0, arg2 + var7, this.field70, 0, arg1 - var7);
                }
                this.field74 = (this.field74 + arg1) % this.field69;
                this.notifyAll();
            }
            if (!arg3) {
                this.field73 = null;
            }
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field75[6] + (arg0 == null ? field75[1] : field75[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!js", name = "run", descriptor = "()V")
    public final void run() {
        try {
            field66++;
            while (true) {
                int var2;
                synchronized (this) {
                    while (true) {
                        if (this.field67 != null) {
                            return;
                        }
                        if (this.field74 < this.field72) {
                            var2 = this.field74 + this.field69 - this.field72;
                        } else {
                            var2 = this.field74 - this.field72;
                        }
                        if (var2 > 0) {
                            break;
                        }
                        try {
                            this.field71.flush();
                        } catch (IOException var17) {
                            this.field67 = var17;
                            return;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var16) {
                        }
                    }
                }
                try {
                    if (this.field72 + var2 > this.field69) {
                        int var4 = this.field69 - this.field72;
                        this.field71.write(this.field70, this.field72, var4);
                        this.field71.write(this.field70, 0, var2 - var4);
                    } else {
                        this.field71.write(this.field70, this.field72, var2);
                    }
                } catch (IOException var19) {
                    IOException var5 = var19;
                    synchronized (this) {
                        this.field67 = var5;
                        return;
                    }
                }
                synchronized (this) {
                    this.field72 = (this.field72 + var2) % this.field69;
                }
            }
        } catch (RuntimeException var21) {
            throw class665.method4799(var21, field75[7] + ')');
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(B)V")
    public static void method33(byte arg0) {
        try {
            field65 = null;
            if (arg0 != -121) {
                field63 = 125;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field75[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(II)V")
    public static final void method34(int arg0, int arg1) {
        try {
            field62++;
            if (arg1 != -30582) {
                method34(44, -24);
            }
            class153.field1957.method2038(0, arg0);
            class207.field3023.method2038(0, arg0);
            class140.field1821.method2038(0, arg0);
            class229.field3321.method2038(0, arg0);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field75[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "()V")
    public static final void method35() {
        while (true) {
            boolean var0 = true;
            for (int var1 = 0; var1 < class650.field9243.length; var1++) {
                if (class650.field9243[var1].method247()) {
                    class306.field4250[var1] = class650.field9243[var1].method251();
                } else {
                    synchronized (class650.field9243[var1]) {
                        class650.field9243[var1].notify();
                    }
                    var0 = false;
                }
            }
            if (var0) {
                class650.field9243[class650.field9243.length - 1].method246();
                class47.method505(1);
                while (true) {
                    boolean var3 = true;
                    for (int var4 = 0; var4 < class650.field9243.length - 1; var4++) {
                        if (!class650.field9243[var4].method247()) {
                            synchronized (class650.field9243[var4]) {
                                class650.field9243[var4].notify();
                            }
                            var3 = false;
                        }
                    }
                    if (var3) {
                        for (int var6 = 1; var6 < class650.field9243.length - 2; var6++) {
                            class650.field9243[var6].method246();
                        }
                        class47.method505(2);
                        while (!class650.field9243[0].method247()) {
                            synchronized (class650.field9243[0]) {
                                class650.field9243[0].notify();
                            }
                            try {
                                class449.method3474(20817, 1L);
                            } catch (Exception var9) {
                            }
                        }
                        class650.field9243[0].method246();
                        return;
                    }
                    try {
                        class449.method3474(20817, 1L);
                    } catch (Exception var12) {
                    }
                }
            }
            try {
                class449.method3474(20817, 1L);
            } catch (Exception var8) {
            }
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(I)V")
    public final void method36(int arg0) {
        try {
            if (arg0 >= -58) {
                this.field67 = null;
            }
            this.field71 = new class623();
            field61++;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field75[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!js", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
    public class5(OutputStream arg0, int arg1) {
        try {
            this.field69 = arg1 + 1;
            this.field71 = arg0;
            this.field70 = new byte[this.field69];
            this.field73 = new Thread(this);
            this.field73.setDaemon(true);
            this.field73.start();
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field75[0] + (arg0 == null ? field75[1] : field75[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!js", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method37(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x1);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!js", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method38(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 55;
                    break;
                case 1:
                    var10005 = 56;
                    break;
                case 2:
                    var10005 = 47;
                    break;
                case 3:
                    var10005 = 93;
                    break;
                default:
                    var10005 = 1;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
