import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qda")
public class class678 implements Runnable {

    @OriginalMember(owner = "client!qda", name = "A", descriptor = "I")
    private int field9504 = 0;

    @OriginalMember(owner = "client!qda", name = "z", descriptor = "Z")
    private boolean field9509 = false;

    @OriginalMember(owner = "client!qda", name = "e", descriptor = "Z")
    private boolean field9502 = false;

    @OriginalMember(owner = "client!qda", name = "j", descriptor = "I")
    private int field9522 = 0;

    @OriginalMember(owner = "client!qda", name = "s", descriptor = "Lft;")
    private class188 field9505;

    @OriginalMember(owner = "client!qda", name = "w", descriptor = "Ljava/net/Socket;")
    private Socket field9507;

    @OriginalMember(owner = "client!qda", name = "B", descriptor = "Ljava/io/InputStream;")
    private InputStream field9517;

    @OriginalMember(owner = "client!qda", name = "d", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field9519;

    @OriginalMember(owner = "client!qda", name = "t", descriptor = "I")
    private int field9506;

    @OriginalMember(owner = "client!qda", name = "D", descriptor = "[Ljava/lang/String;")
    private static final String[] field9529 = new String[] { method4872(method4871("Km\u0002Ed\u0012")), method4872(method4871("T|\u000f\u0007")), method4872(method4871("A'MER")), method4872(method4871("Km\u0002Eg\u0012")), method4872(method4871("Km\u0002Eh\u0012")), method4872(method4871("Km\u0002EISg\u0002\u0007F@lK")), method4872(method4871("Km\u0002E\u0013Sg\n\u001f\u0011\u0012")), method4872(method4871("Km\u0002Ef\u0012")), method4872(method4871("Km\u0002Ee\u0012")), method4872(method4871("Km\u0002Ei\u0012")), method4872(method4871("Km\u0002Ek\u0012")), method4872(method4871("Km\u0002E]OgK")), method4872(method4871("Km\u0002En\u0012")), method4872(method4871("Km\u0002Em\u0012")), method4872(method4871("Km\u0002Ec\u0012")), method4872(method4871("Km\u0002El\u0012")), method4872(method4871("Km\u0002Ej\u0012")) };

    @OriginalMember(owner = "client!qda", name = "b", descriptor = "Lsb;")
    public static class261 field9525 = new class261(80, -1);

    @OriginalMember(owner = "client!qda", name = "C", descriptor = "I")
    public static int field9527 = 2;

    @OriginalMember(owner = "client!qda", name = "o", descriptor = "F")
    public static float field9528;

    @OriginalMember(owner = "client!qda", name = "g", descriptor = "I")
    public static int field9500;

    @OriginalMember(owner = "client!qda", name = "c", descriptor = "I")
    public static int field9501;

    @OriginalMember(owner = "client!qda", name = "x", descriptor = "I")
    public static int field9503;

    @OriginalMember(owner = "client!qda", name = "y", descriptor = "I")
    public static int field9508;

    @OriginalMember(owner = "client!qda", name = "v", descriptor = "I")
    public static int field9510;

    @OriginalMember(owner = "client!qda", name = "p", descriptor = "I")
    public static int field9512;

    @OriginalMember(owner = "client!qda", name = "m", descriptor = "I")
    public static int field9513;

    @OriginalMember(owner = "client!qda", name = "n", descriptor = "I")
    public static int field9514;

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "I")
    public static int field9515;

    @OriginalMember(owner = "client!qda", name = "f", descriptor = "I")
    public static int field9518;

    @OriginalMember(owner = "client!qda", name = "i", descriptor = "I")
    public static int field9520;

    @OriginalMember(owner = "client!qda", name = "l", descriptor = "I")
    public static int field9521;

    @OriginalMember(owner = "client!qda", name = "k", descriptor = "I")
    public static int field9523;

    @OriginalMember(owner = "client!qda", name = "q", descriptor = "I")
    public static int field9524;

    @OriginalMember(owner = "client!qda", name = "u", descriptor = "Lvn;")
    private class328 field9516;

    @OriginalMember(owner = "client!qda", name = "r", descriptor = "[B")
    private byte[] field9511;

    @OriginalMember(owner = "client!qda", name = "h", descriptor = "[Lns;")
    public static class382[] field9526;

    @OriginalMember(owner = "client!qda", name = "run", descriptor = "()V", line = 5)
    public final void run() {
        try {
            try {
                while (true) {
                    int var2;
                    int var3;
                    label87: {
                        synchronized (this) {
                            label88: {
                                if (this.field9522 == this.field9504) {
                                    if (this.field9509) {
                                        break label88;
                                    }
                                    try {
                                        this.wait();
                                    } catch (InterruptedException var11) {
                                    }
                                }
                                var2 = this.field9504;
                                if (this.field9522 >= this.field9504) {
                                    var3 = this.field9522 - this.field9504;
                                } else {
                                    var3 = this.field9506 - this.field9504;
                                }
                                break label87;
                            }
                        }
                        try {
                            if (this.field9517 != null) {
                                this.field9517.close();
                            }
                            if (this.field9519 != null) {
                                this.field9519.close();
                            }
                            if (this.field9507 != null) {
                                this.field9507.close();
                            }
                        } catch (IOException var8) {
                        }
                        this.field9511 = null;
                        break;
                    }
                    if (var3 > 0) {
                        try {
                            this.field9519.write(this.field9511, var2, var3);
                        } catch (IOException var10) {
                            this.field9502 = true;
                        }
                        this.field9504 = (this.field9504 + var3) % this.field9506;
                        try {
                            if (this.field9522 == this.field9504) {
                                this.field9519.flush();
                            }
                        } catch (IOException var9) {
                            this.field9502 = true;
                        }
                    }
                }
            } catch (Exception var13) {
                class162.method1374(var13, null, (byte) -93);
            }
            field9515++;
        } catch (RuntimeException var14) {
            throw class665.method4799(var14, field9529[11] + ')');
        }
    }

    @OriginalMember(owner = "client!qda", name = "c", descriptor = "(I)I", line = 78)
    public static final int method4859(int arg0) {
        try {
            int var1 = 98 % ((-arg0 - 56) / 57);
            field9501++;
            return class323.field4403;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9529[14] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(B)V", line = 89)
    public static void method4860(byte arg0) {
        try {
            field9525 = null;
            field9526 = null;
            if (arg0 <= 61) {
                field9528 = 0.30549917F;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field9529[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qda", name = "finalize", descriptor = "()V", line = 100)
    protected final void finalize() {
        try {
            field9521++;
            this.method4870(21);
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field9529[5] + ')');
        }
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(IB)Lofa;", line = 109)
    public static final class139 method4861(int arg0, byte arg1) {
        try {
            field9523++;
            class139[] var2 = class96.method954((byte) -62);
            if (arg1 != -40) {
                return null;
            }
            for (int var3 = 0; var3 < var2.length; var3++) {
                class139 var4 = var2[var3];
                if (var4.field1810 == arg0) {
                    return var4;
                }
            }
            return null;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field9529[16] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qda", name = "<init>", descriptor = "(Ljava/net/Socket;Lft;I)V", line = 463)
    public class678(Socket arg0, class188 arg1, int arg2) throws IOException {
        try {
            this.field9505 = arg1;
            this.field9507 = arg0;
            this.field9507.setSoTimeout(30000);
            this.field9507.setTcpNoDelay(true);
            this.field9517 = this.field9507.getInputStream();
            this.field9519 = this.field9507.getOutputStream();
            this.field9506 = arg2;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field9529[6] + (arg0 == null ? field9529[1] : field9529[2]) + ',' + (arg1 == null ? field9529[1] : field9529[2]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!qda", name = "b", descriptor = "(I)V", line = 143)
    public final void method4862(int arg0) throws IOException {
        try {
            field9508++;
            if (!this.field9509 && arg0 == 1 && this.field9502) {
                this.field9502 = false;
                throw new IOException();
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9529[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(III[B)V", line = 165)
    public final void method4863(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        try {
            field9513++;
            if (!this.field9509) {
                int var5 = -31 % ((32 - arg1) / 33);
                while (arg0 > 0) {
                    int var6 = this.field9517.read(arg3, arg2, arg0);
                    if (var6 <= 0) {
                        throw new EOFException();
                    }
                    arg0 -= var6;
                    arg2 += var6;
                }
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field9529[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field9529[1] : field9529[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!qda", name = "b", descriptor = "(B)V", line = 190)
    public final void method4864(byte arg0) {
        try {
            int var2 = -71 % ((arg0 + 7) / 50);
            field9503++;
            if (!this.field9509) {
                this.field9517 = new class408();
                this.field9519 = new class384();
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field9529[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(IIBI[IIII)Z", line = 205)
    public static final boolean method4865(int arg0, int arg1, byte arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7) {
        try {
            if (arg0 < 0) {
                arg0 = 0;
            }
            field9510++;
            if (arg1 > class29.field372) {
                arg1 = class29.field372;
            }
            if (arg0 >= arg1) {
                return true;
            }
            arg7 += arg0 * arg6;
            if (arg2 <= 50) {
                return true;
            }
            int var12 = arg1 - arg0 >> 2;
            arg5 += arg0 - 1;
            int var10;
            int var11;
            int var10000;
            if (class404.field5873 == 1) {
                class459.field6696 += var12;
                while (true) {
                    var12--;
                    if (var12 < 0) {
                        var12 = arg1 - arg0 & 0x3;
                        while (true) {
                            var12--;
                            if (var12 < 0) {
                                return true;
                            }
                            arg5++;
                            if (arg4[arg5] > arg7) {
                                arg4[arg5] = arg7;
                            }
                            arg7 += arg6;
                        }
                    }
                    var10 = arg5 + 1;
                    if (arg7 < arg4[var10]) {
                        arg4[var10] = arg7;
                    }
                    var11 = arg6 + arg7;
                    var10++;
                    if (arg4[var10] > var11) {
                        arg4[var10] = var11;
                    }
                    var11 += arg6;
                    var10000 = ~var11;
                    var10++;
                    if (var10000 > ~arg4[var10]) {
                        arg4[var10] = var11;
                    }
                    var11 += arg6;
                    arg5 = var10 + 1;
                    if (arg4[arg5] > var11) {
                        arg4[arg5] = var11;
                    }
                    arg7 = arg6 + var11;
                }
            } else {
                arg7 -= 38400;
                while (true) {
                    var12--;
                    if (var12 < 0) {
                        var12 = arg1 - arg0 & 0x3;
                        while (true) {
                            var12--;
                            if (var12 < 0) {
                                return true;
                            }
                            arg5++;
                            if (arg4[arg5] > arg7) {
                                return false;
                            }
                            arg7 += arg6;
                        }
                    }
                    var10 = arg5 + 1;
                    if (arg4[var10] > arg7) {
                        return false;
                    }
                    var11 = arg6 + arg7;
                    var10++;
                    if (var11 < arg4[var10]) {
                        return false;
                    }
                    var11 += arg6;
                    var10000 = ~var11;
                    var10++;
                    if (var10000 > ~arg4[var10]) {
                        return false;
                    }
                    var11 += arg6;
                    arg5 = var10 + 1;
                    if (arg4[arg5] > var11) {
                        return false;
                    }
                    arg7 = arg6 + var11;
                }
            }
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field9529[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? field9529[1] : field9529[2]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(Z)I", line = 303)
    public final int method4866(boolean arg0) throws IOException {
        try {
            field9514++;
            if (!arg0) {
                this.field9502 = true;
            }
            return this.field9509 ? 0 : this.field9517.read();
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9529[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(I)I", line = 317)
    public final int method4867(int arg0) throws IOException {
        try {
            field9524++;
            if (arg0 == 0) {
                return this.field9509 ? 0 : this.field9517.available();
            } else {
                return 58;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9529[13] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(IIB)Z", line = 337)
    public static final boolean method4868(int arg0, int arg1, byte arg2) {
        try {
            field9518++;
            if (arg2 >= -93) {
                method4868(86, 43, (byte) 84);
            }
            return (arg1 & 0x70000) != 0 | class605.method4471(arg1, arg0, (byte) -93) || class669.method4817(arg0, (byte) 111, arg1);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field9529[12] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(BII[B)V", line = 351)
    public final void method4869(byte arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        try {
            field9520++;
            if (!this.field9509) {
                if (this.field9502) {
                    this.field9502 = false;
                    throw new IOException();
                }
                if (this.field9511 == null) {
                    this.field9511 = new byte[this.field9506];
                }
                synchronized (this) {
                    for (int var6 = 0; var6 < arg1; var6++) {
                        this.field9511[this.field9522] = arg3[arg2 + var6];
                        this.field9522 = (this.field9522 + 1) % this.field9506;
                        if (this.field9522 == (this.field9504 + this.field9506 - 100) % this.field9506) {
                            throw new IOException();
                        }
                    }
                    if (this.field9516 == null) {
                        this.field9516 = this.field9505.method1572(this, (byte) -116, 3);
                    }
                    this.notifyAll();
                    if (arg0 < 12) {
                        method4865(82, 6, (byte) 86, 98, null, -106, 68, -35);
                    }
                }
            }
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field9529[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field9529[1] : field9529[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!qda", name = "d", descriptor = "(I)V", line = 413)
    public final void method4870(int arg0) {
        try {
            field9512++;
            if (!this.field9509) {
                synchronized (this) {
                    this.field9509 = true;
                    this.notifyAll();
                }
                if (this.field9516 != null) {
                    while (this.field9516.field4486 == 0) {
                        class449.method3474(20817, 1L);
                    }
                    if (this.field9516.field4486 == 1) {
                        try {
                            ((Thread) this.field9516.field4487).join();
                        } catch (InterruptedException var4) {
                        }
                    }
                }
                this.field9516 = null;
                if (arg0 <= 13) {
                    this.field9504 = 99;
                }
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field9529[15] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qda", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4871(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x2F);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qda", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4872(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 58;
                    break;
                case 1:
                    var10005 = 9;
                    break;
                case 2:
                    var10005 = 99;
                    break;
                case 3:
                    var10005 = 107;
                    break;
                default:
                    var10005 = 47;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
