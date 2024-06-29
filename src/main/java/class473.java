import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public class class473 implements Runnable {

    @OriginalMember(owner = "client!st", name = "c", descriptor = "Z")
    private boolean field7001 = false;

    @OriginalMember(owner = "client!st", name = "p", descriptor = "I")
    private int field7014 = 0;

    @OriginalMember(owner = "client!st", name = "a", descriptor = "Z")
    private boolean field6999 = false;

    @OriginalMember(owner = "client!st", name = "n", descriptor = "I")
    private int field7012 = 0;

    @OriginalMember(owner = "client!st", name = "f", descriptor = "Lnv;")
    private class493 field7004;

    @OriginalMember(owner = "client!st", name = "h", descriptor = "Ljava/net/Socket;")
    private Socket field7006;

    @OriginalMember(owner = "client!st", name = "m", descriptor = "Ljava/io/InputStream;")
    private InputStream field7011;

    @OriginalMember(owner = "client!st", name = "y", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field7023;

    @OriginalMember(owner = "client!st", name = "j", descriptor = "Llo;")
    public static class306 field7008 = new class306("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");

    @OriginalMember(owner = "client!st", name = "b", descriptor = "I")
    public static int field7000;

    @OriginalMember(owner = "client!st", name = "d", descriptor = "I")
    public static int field7002;

    @OriginalMember(owner = "client!st", name = "g", descriptor = "I")
    public static int field7005;

    @OriginalMember(owner = "client!st", name = "i", descriptor = "I")
    public static int field7007;

    @OriginalMember(owner = "client!st", name = "k", descriptor = "I")
    public static int field7009;

    @OriginalMember(owner = "client!st", name = "l", descriptor = "I")
    public static int field7010;

    @OriginalMember(owner = "client!st", name = "q", descriptor = "I")
    public static int field7015;

    @OriginalMember(owner = "client!st", name = "r", descriptor = "I")
    public static int field7016;

    @OriginalMember(owner = "client!st", name = "s", descriptor = "I")
    public static int field7017;

    @OriginalMember(owner = "client!st", name = "t", descriptor = "I")
    public static int field7018;

    @OriginalMember(owner = "client!st", name = "u", descriptor = "I")
    public static int field7019;

    @OriginalMember(owner = "client!st", name = "v", descriptor = "I")
    public static int field7020;

    @OriginalMember(owner = "client!st", name = "w", descriptor = "I")
    public static int field7021;

    @OriginalMember(owner = "client!st", name = "x", descriptor = "I")
    public static int field7022;

    @OriginalMember(owner = "client!st", name = "o", descriptor = "Lln;")
    private class169 field7013;

    @OriginalMember(owner = "client!st", name = "e", descriptor = "[B")
    private byte[] field7003;

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(II[BI)V", line = 4)
    public final void method2794(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (arg0 <= 103) {
            return;
        }
        field7022++;
        if (this.field6999) {
            return;
        }
        while (arg3 > 0) {
            int var5 = this.field7011.read(arg2, arg1, arg3);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg3 -= var5;
            arg1 += var5;
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(IIB[B)V", line = 30)
    public final void method2795(int arg0, int arg1, byte arg2, byte[] arg3) throws IOException {
        field7020++;
        if (this.field6999) {
            return;
        }
        if (this.field7001) {
            this.field7001 = false;
            throw new IOException();
        }
        if (this.field7003 == null) {
            this.field7003 = new byte[5000];
        }
        synchronized (this) {
            if (arg2 == 14) {
                for (int var6 = 0; var6 < arg1; var6++) {
                    this.field7003[this.field7014] = arg3[arg0 + var6];
                    this.field7014 = (this.field7014 + 1) % 5000;
                    if (((this.field7012 + 4900) % 5000) == this.field7014) {
                        throw new IOException();
                    }
                }
                if (this.field7013 == null) {
                    this.field7013 = this.field7004.method2874(-12, this, 3);
                }
                this.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(B)V", line = 83)
    public final void method2796(byte arg0) throws IOException {
        int var2 = 70 % ((arg0 - 19) / 40);
        field7016++;
        if (!this.field6999 && this.field7001) {
            this.field7001 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!st", name = "finalize", descriptor = "()V", line = 108)
    protected final void finalize() {
        field7017++;
        this.method2804(true);
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(I)V", line = 120)
    public final void method2797(int arg0) {
        field7010++;
        if (!this.field6999 && arg0 == 5000) {
            this.field7011 = new class88();
            this.field7023 = new class353();
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "([BBII)[B", line = 138)
    public static final byte[] method2798(byte[] arg0, byte arg1, int arg2, int arg3) {
        field7018++;
        byte[] var4 = new byte[arg2];
        class85.method613(arg0, arg3, var4, 0, arg2);
        int var5 = -46 / ((arg1 + 58) / 41);
        return var4;
    }

    @OriginalMember(owner = "client!st", name = "b", descriptor = "(B)I", line = 151)
    public final int method2799(byte arg0) throws IOException {
        field7015++;
        if (arg0 != 74) {
            this.field7023 = null;
        }
        return this.field6999 ? 0 : this.field7011.read();
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(Z)V", line = 167)
    public static final void method2800(boolean arg0) {
        if (!arg0) {
            field7021 = -22;
        }
        field7009++;
        class75.method540(-7, 10);
        class217.method1501(-1);
        System.gc();
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(Lia;I)Lgf;", line = 181)
    public static final class46 method2801(class23 arg0, int arg1) {
        if (arg1 != 7573) {
            field7008 = null;
        }
        field7005++;
        return new class46(arg0.method170(492756037), arg0.method170(arg1 ^ 0x1D5EC1D0), arg0.method170(492756037), arg0.method170(492756037), arg0.method181(-30), arg0.method181(arg1 ^ 0xFFFFE212), arg0.method126((byte) -98));
    }

    @OriginalMember(owner = "client!st", name = "run", descriptor = "()V", line = 195)
    public final void run() {
        field7000++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field7014 == this.field7012) {
                        if (this.field6999) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    var2 = this.field7012;
                    if (this.field7014 >= this.field7012) {
                        var3 = this.field7014 - this.field7012;
                    } else {
                        var3 = 5000 - this.field7012;
                    }
                }
                if (var3 > 0) {
                    try {
                        this.field7023.write(this.field7003, var2, var3);
                    } catch (IOException var9) {
                        this.field7001 = true;
                    }
                    this.field7012 = (this.field7012 + var3) % 5000;
                    try {
                        if (this.field7014 == this.field7012) {
                            this.field7023.flush();
                        }
                    } catch (IOException var8) {
                        this.field7001 = true;
                    }
                }
            }
            try {
                if (this.field7011 != null) {
                    this.field7011.close();
                }
                if (this.field7023 != null) {
                    this.field7023.close();
                }
                if (this.field7006 != null) {
                    this.field7006.close();
                }
            } catch (IOException var7) {
            }
            this.field7003 = null;
        } catch (Exception var12) {
            class502.method2968(null, (byte) -81, var12);
        }
    }

    @OriginalMember(owner = "client!st", name = "b", descriptor = "(I)V", line = 264)
    public static void method2802(int arg0) {
        if (arg0 != 21061) {
            field7008 = null;
        }
        field7008 = null;
    }

    @OriginalMember(owner = "client!st", name = "c", descriptor = "(B)I", line = 274)
    public final int method2803(byte arg0) throws IOException {
        if (arg0 >= -110) {
            this.method2797(-31);
        }
        field7002++;
        return this.field6999 ? 0 : this.field7011.available();
    }

    @OriginalMember(owner = "client!st", name = "b", descriptor = "(Z)V", line = 296)
    public final void method2804(boolean arg0) {
        field7007++;
        if (this.field6999) {
            return;
        }
        synchronized (this) {
            this.field6999 = arg0;
            this.notifyAll();
        }
        if (this.field7013 != null) {
            while (this.field7013.field2692 == 0) {
                class444.method2667(-28210, 1L);
            }
            if (this.field7013.field2692 == 1) {
                try {
                    ((Thread) this.field7013.field2695).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field7013 = null;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(Lou;I)V", line = 329)
    public static final void method2805(class197 arg0, int arg1) {
        if (arg0 instanceof class265) {
            class265 var2 = (class265) arg0;
            if (var2.field4430 != null) {
                class373.method2344(2000, class302.field4850.field4720 != var2.field4720, var2);
            }
        } else if (arg0 instanceof class166) {
            class166 var3 = (class166) arg0;
            class126.method987(var3, class302.field4850.field4720 != var3.field4720, 0);
        }
        if (arg1 == -23404) {
            field7019++;
        }
    }

    @OriginalMember(owner = "client!st", name = "<init>", descriptor = "(Ljava/net/Socket;Lnv;)V", line = 375)
    public class473(Socket arg0, class493 arg1) throws IOException {
        this.field7004 = arg1;
        this.field7006 = arg0;
        this.field7006.setSoTimeout(30000);
        this.field7006.setTcpNoDelay(true);
        this.field7011 = this.field7006.getInputStream();
        this.field7023 = this.field7006.getOutputStream();
    }
}
