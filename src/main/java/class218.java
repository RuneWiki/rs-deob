import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class218 implements Runnable {

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "I")
    private int field3498 = 0;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
    private int field3488 = 0;

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "Z")
    private boolean field3497 = false;

    @OriginalMember(owner = "client!ke", name = "o", descriptor = "Z")
    private boolean field3502 = false;

    @OriginalMember(owner = "client!ke", name = "w", descriptor = "Ljava/net/Socket;")
    private Socket field3510;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "Lag;")
    private class211 field3492;

    @OriginalMember(owner = "client!ke", name = "t", descriptor = "Ljava/io/InputStream;")
    private InputStream field3507;

    @OriginalMember(owner = "client!ke", name = "v", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field3509;

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "Lok;")
    public static class41 field3494 = class137.method956("scrollbar", 45);

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "I")
    public static int field3495 = -1;

    @OriginalMember(owner = "client!ke", name = "m", descriptor = "Lok;")
    private static class41 field3500 = class137.method956(" has logged out)3", 45);

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
    public static int field3490 = 0;

    @OriginalMember(owner = "client!ke", name = "z", descriptor = "Z")
    public static boolean field3513 = false;

    @OriginalMember(owner = "client!ke", name = "y", descriptor = "Lok;")
    public static class41 field3512 = field3500;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
    public static int field3491;

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "I")
    public static int field3496;

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!ke", name = "n", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!ke", name = "p", descriptor = "I")
    public static int field3503;

    @OriginalMember(owner = "client!ke", name = "q", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "client!ke", name = "r", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "client!ke", name = "u", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!ke", name = "x", descriptor = "I")
    public static int field3511;

    @OriginalMember(owner = "client!ke", name = "s", descriptor = "Ldm;")
    private class182 field3506;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "[B")
    private byte[] field3493;

    @OriginalMember(owner = "client!ke", name = "finalize", descriptor = "()V", line = 8)
    protected final void finalize() {
        field3501++;
        this.method1570((byte) -104);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)I", line = 16)
    public final int method1567(int arg0) throws IOException {
        if (arg0 != -15806) {
            this.field3507 = (InputStream) null;
        }
        field3489++;
        return this.field3497 ? 0 : this.field3507.read();
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)V", line = 31)
    public final void method1568(int arg0) {
        field3496++;
        if (this.field3497) {
            return;
        }
        this.field3507 = new class296();
        this.field3509 = new class226();
        if (arg0 <= 79) {
            field3513 = false;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V", line = 58)
    public static void method1569(byte arg0) {
        if (arg0 <= 89) {
            field3490 = -19;
        }
        field3512 = null;
        field3500 = null;
        field3494 = null;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(B)V", line = 70)
    public final void method1570(byte arg0) {
        field3503++;
        if (this.field3497) {
            return;
        }
        int var2 = -14 % ((arg0 + 41) / 41);
        synchronized (this) {
            this.field3497 = true;
            this.notifyAll();
        }
        if (this.field3506 != null) {
            while (this.field3506.field2948 == 0) {
                class300.method2068(119, 1L);
            }
            if (this.field3506.field2948 == 1) {
                try {
                    ((Thread) this.field3506.field2945).join();
                } catch (InterruptedException var6) {
                }
            }
        }
        this.field3506 = null;
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(I)I", line = 115)
    public final int method1571(int arg0) throws IOException {
        int var2 = -38 % ((arg0 + 46) / 43);
        field3508++;
        return this.field3497 ? 0 : this.field3507.available();
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(III[B)V", line = 132)
    public final void method1572(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field3505++;
        if (this.field3497) {
            return;
        }
        int var5 = -98 / ((-arg0 - 41) / 42);
        if (this.field3502) {
            this.field3502 = false;
            throw new IOException();
        }
        if (this.field3493 == null) {
            this.field3493 = new byte[5000];
        }
        synchronized (this) {
            for (int var7 = 0; var7 < arg1; var7++) {
                this.field3493[this.field3488] = arg3[arg2 + var7];
                this.field3488 = (this.field3488 + 1) % 5000;
                if ((this.field3498 + 4900) % 5000 == this.field3488) {
                    throw new IOException();
                }
            }
            if (this.field3506 == null) {
                this.field3506 = this.field3492.method1479(this, 114, 3);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(Ljava/net/Socket;Lag;)V", line = 352)
    public class218(Socket arg0, class211 arg1) throws IOException {
        this.field3510 = arg0;
        this.field3492 = arg1;
        this.field3510.setSoTimeout(30000);
        this.field3510.setTcpNoDelay(true);
        this.field3507 = this.field3510.getInputStream();
        this.field3509 = this.field3510.getOutputStream();
    }

    @OriginalMember(owner = "client!ke", name = "run", descriptor = "()V", line = 198)
    public final void run() {
        try {
            while (true) {
                int var3;
                int var4;
                label88: {
                    synchronized (this) {
                        label89: {
                            if (this.field3498 == this.field3488) {
                                if (this.field3497) {
                                    break label89;
                                }
                                try {
                                    this.wait();
                                } catch (InterruptedException var13) {
                                }
                            }
                            if (this.field3488 >= this.field3498) {
                                var3 = this.field3488 - this.field3498;
                            } else {
                                var3 = 5000 - this.field3498;
                            }
                            var4 = this.field3498;
                            break label88;
                        }
                    }
                    try {
                        if (this.field3507 != null) {
                            this.field3507.close();
                        }
                        if (this.field3509 != null) {
                            this.field3509.close();
                        }
                        if (this.field3510 != null) {
                            this.field3510.close();
                        }
                    } catch (IOException var10) {
                    }
                    this.field3493 = null;
                    break;
                }
                if (var3 > 0) {
                    try {
                        this.field3509.write(this.field3493, var4, var3);
                    } catch (IOException var12) {
                        this.field3502 = true;
                    }
                    this.field3498 = (this.field3498 + var3) % 5000;
                    try {
                        if (this.field3498 == this.field3488) {
                            this.field3509.flush();
                        }
                    } catch (IOException var11) {
                        this.field3502 = true;
                    }
                }
            }
        } catch (Exception var15) {
            class104.method719((String) null, var15, false);
        }
        field3511++;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lmh;BLmh;)V", line = 267)
    public static final void method1573(class65 arg0, byte arg1, class65 arg2) {
        if (arg1 > -35) {
            method1573((class65) null, (byte) 90, (class65) null);
        }
        class300.field4862 = arg2;
        class288.field4681 = arg0;
        field3504++;
    }

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "(I)V", line = 280)
    public final void method1574(int arg0) throws IOException {
        field3491++;
        if (this.field3497) {
            return;
        }
        if (this.field3502) {
            this.field3502 = false;
            throw new IOException();
        } else if (arg0 != -17368) {
            this.field3506 = (class182) null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(III[B)V", line = 308)
    public final void method1575(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (arg1 != 14574) {
            return;
        }
        field3499++;
        if (this.field3497) {
            return;
        }
        while (arg0 > 0) {
            int var5 = this.field3507.read(arg3, arg2, arg0);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg2 += var5;
            arg0 -= var5;
        }
    }
}
