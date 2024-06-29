import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bea")
public class class235 implements Runnable {

    @OriginalMember(owner = "client!bea", name = "d", descriptor = "I")
    private int field3538 = 0;

    @OriginalMember(owner = "client!bea", name = "s", descriptor = "I")
    private int field3550 = 0;

    @OriginalMember(owner = "client!bea", name = "b", descriptor = "I")
    private int field3536;

    @OriginalMember(owner = "client!bea", name = "h", descriptor = "Ljava/io/InputStream;")
    private InputStream field3542;

    @OriginalMember(owner = "client!bea", name = "p", descriptor = "[B")
    private byte[] field3547;

    @OriginalMember(owner = "client!bea", name = "m", descriptor = "Ljava/lang/Thread;")
    private Thread field3541;

    @OriginalMember(owner = "client!bea", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3553 = new String[] { method2010(method2009("xy\u001aO\u00012")), method2010(method2009("xy\u001aO\u00032")), method2010(method2009("xy\u001aO7orS")), method2010(method2009("a2UO8")), method2010(method2009("xy\u001aO\u00002")), method2010(method2009("ti\u0017\r")), method2010(method2009("xy\u001aO\u00072")), method2010(method2009("xy\u001aOysr\u0012\u0015{2")), method2010(method2009("Sr\r\u0000)sx[\u0013$~u\u0003[")), method2010(method2009("xy\u001aO\u00062")), method2010(method2009("xy\u001aO\u00022")), method2010(method2009("xy\u001aO\u00042")) };

    @OriginalMember(owner = "client!bea", name = "l", descriptor = "Lvaa;")
    public static class494 field3540 = new class494(2, 2);

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "Z")
    public static boolean field3549 = false;

    @OriginalMember(owner = "client!bea", name = "c", descriptor = "[I")
    public static int[] field3551 = new int[1];

    @OriginalMember(owner = "client!bea", name = "k", descriptor = "Lel;")
    public static class573 field3548 = new class573(87, -1);

    @OriginalMember(owner = "client!bea", name = "i", descriptor = "Lel;")
    public static class573 field3552 = new class573(7, 3);

    @OriginalMember(owner = "client!bea", name = "g", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!bea", name = "q", descriptor = "I")
    public static int field3537;

    @OriginalMember(owner = "client!bea", name = "f", descriptor = "I")
    public static int field3539;

    @OriginalMember(owner = "client!bea", name = "r", descriptor = "I")
    public static int field3543;

    @OriginalMember(owner = "client!bea", name = "j", descriptor = "I")
    public static int field3544;

    @OriginalMember(owner = "client!bea", name = "n", descriptor = "I")
    public static int field3545;

    @OriginalMember(owner = "client!bea", name = "o", descriptor = "I")
    public static int field3546;

    @OriginalMember(owner = "client!bea", name = "e", descriptor = "Ljava/io/IOException;")
    private IOException field3534;

    @OriginalMember(owner = "client!bea", name = "c", descriptor = "(I)V", line = 8)
    public final void method2002(int arg0) {
        try {
            if (arg0 == -370) {
                this.field3542 = new class731();
                field3543++;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3553[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bea", name = "b", descriptor = "(I)V", line = 19)
    public static void method2003(int arg0) {
        try {
            field3552 = null;
            if (arg0 != -1) {
                field3549 = true;
            }
            field3551 = null;
            field3540 = null;
            field3548 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3553[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(II)Z", line = 37)
    public final boolean method2004(int arg0, int arg1) throws IOException {
        try {
            field3537++;
            if (arg0 <= 0 || arg0 >= this.field3536) {
                throw new IOException();
            }
            synchronized (this) {
                int var4;
                if (this.field3538 < this.field3550) {
                    var4 = this.field3536 + this.field3538 - this.field3550;
                } else {
                    var4 = this.field3538 - this.field3550;
                }
                if (arg0 <= var4) {
                    return arg1 == 0;
                } else if (this.field3534 == null) {
                    this.notifyAll();
                    return false;
                } else {
                    throw new IOException(this.field3534.toString());
                }
            }
        } catch (RuntimeException var16) {
            throw class759.method5498(var16, field3553[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(I)V", line = 70)
    public final void method2005(int arg0) {
        try {
            field3544++;
            synchronized (this) {
                if (this.field3534 == null) {
                    this.field3534 = new IOException("");
                }
                this.notifyAll();
            }
            if (arg0 >= -61) {
                method2003(90);
            }
            try {
                this.field3541.join();
            } catch (InterruptedException var4) {
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field3553[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(IB)I", line = 91)
    public static final int method2006(int arg0, byte arg1) {
        try {
            field3546++;
            return arg1 > -100 ? 23 : arg0 >>> 10;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3553[11] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!bea", name = "run", descriptor = "()V", line = 105)
    public final void run() {
        try {
            field3539++;
            while (true) {
                int var2;
                synchronized (this) {
                    while (true) {
                        if (this.field3534 != null) {
                            return;
                        }
                        if (this.field3550 == 0) {
                            var2 = this.field3536 - this.field3538 - 1;
                        } else if (this.field3550 > this.field3538) {
                            var2 = this.field3550 - (this.field3538 + 1);
                        } else {
                            var2 = this.field3536 - this.field3538;
                        }
                        if (var2 > 0) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var13) {
                        }
                    }
                }
                int var3;
                try {
                    var3 = this.field3542.read(this.field3547, this.field3538, var2);
                    if (var3 == -1) {
                        throw new EOFException();
                    }
                } catch (IOException var15) {
                    IOException var4 = var15;
                    synchronized (this) {
                        this.field3534 = var4;
                        return;
                    }
                }
                synchronized (this) {
                    this.field3538 = (this.field3538 + var3) % this.field3536;
                }
            }
        } catch (RuntimeException var17) {
            throw class759.method5498(var17, field3553[2] + ')');
        }
    }

    @OriginalMember(owner = "client!bea", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V", line = 278)
    public class235(InputStream arg0, int arg1) {
        try {
            this.field3536 = arg1 + 1;
            this.field3542 = arg0;
            this.field3547 = new byte[this.field3536];
            this.field3541 = new Thread(this);
            this.field3541.setDaemon(true);
            this.field3541.start();
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3553[7] + (arg0 == null ? field3553[5] : field3553[3]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(ZZII)Ljava/lang/String;", line = 168)
    public static final String method2007(boolean arg0, boolean arg1, int arg2, int arg3) {
        try {
            field3535++;
            if (arg3 < 2 || arg3 > 36) {
                throw new IllegalArgumentException(field3553[8] + arg3);
            } else if (arg1 && arg2 >= 0) {
                int var4 = 2;
                int var5 = arg2 / arg3;
                while (var5 != 0) {
                    var5 /= arg3;
                    var4++;
                }
                char[] var6 = new char[var4];
                var6[0] = '+';
                if (!arg0) {
                    return null;
                }
                for (int var7 = var4 - 1; var7 > 0; var7--) {
                    int var8 = arg2;
                    arg2 /= arg3;
                    int var9 = var8 - (arg2 * arg3);
                    if (var9 < 10) {
                        var6[var7] = (char) (var9 + 48);
                    } else {
                        var6[var7] = (char) (var9 + 87);
                    }
                }
                return new String(var6);
            } else {
                return Integer.toString(arg2, arg3);
            }
        } catch (RuntimeException var11) {
            throw class759.method5498(var11, field3553[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "([BIII)I", line = 217)
    public final int method2008(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        try {
            field3545++;
            if (arg1 < 0 || arg2 < 0 || (arg2 + arg1) > arg0.length) {
                throw new IOException();
            }
            synchronized (this) {
                int var6;
                if (this.field3538 >= this.field3550) {
                    var6 = this.field3538 - this.field3550;
                } else {
                    var6 = this.field3536 + this.field3538 - this.field3550;
                }
                if (var6 < arg1) {
                    arg1 = var6;
                }
                if (arg1 == 0 && this.field3534 != null) {
                    throw new IOException(this.field3534.toString());
                }
                if (arg3 != -14963) {
                    this.field3536 = -99;
                }
                if (this.field3550 + arg1 > this.field3536) {
                    int var7 = this.field3536 - this.field3550;
                    class467.method3556(this.field3547, this.field3550, arg0, arg2, var7);
                    class467.method3556(this.field3547, 0, arg0, arg2 + var7, -var7 + arg1);
                } else {
                    class467.method3556(this.field3547, this.field3550, arg0, arg2, arg1);
                }
                this.field3550 = (this.field3550 + arg1) % this.field3536;
                this.notifyAll();
                return arg1;
            }
        } catch (RuntimeException var13) {
            throw class759.method5498(var13, field3553[4] + (arg0 == null ? field3553[5] : field3553[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!bea", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2009(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x45);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!bea", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2010(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 26;
                    break;
                case 1:
                    var10005 = 28;
                    break;
                case 2:
                    var10005 = 123;
                    break;
                case 3:
                    var10005 = 97;
                    break;
                default:
                    var10005 = 69;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
