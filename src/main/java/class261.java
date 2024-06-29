import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class261 implements Runnable {

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "Z")
    private boolean field4637 = false;

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "Z")
    private boolean field4640 = false;

    @OriginalMember(owner = "client!oh", name = "s", descriptor = "I")
    private int field4650 = 0;

    @OriginalMember(owner = "client!oh", name = "r", descriptor = "I")
    private int field4649 = 0;

    @OriginalMember(owner = "client!oh", name = "y", descriptor = "Lfh;")
    private class129 field4656;

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "Ljava/net/Socket;")
    private Socket field4638;

    @OriginalMember(owner = "client!oh", name = "l", descriptor = "Ljava/io/InputStream;")
    private InputStream field4643;

    @OriginalMember(owner = "client!oh", name = "m", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field4644;

    @OriginalMember(owner = "client!oh", name = "n", descriptor = "Leb;")
    public static class230 field4645 = class68.method589(0, "weiss:");

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "Leb;")
    public static class230 field4633 = class68.method589(0, "Mem:");

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "Leb;")
    public static class230 field4641 = class68.method589(0, "Ausw-=hlen");

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "Leb;")
    public static class230 field4632 = class68.method589(0, "::tele ");

    @OriginalMember(owner = "client!oh", name = "t", descriptor = "Leb;")
    public static class230 field4651 = class68.method589(0, "details");

    @OriginalMember(owner = "client!oh", name = "z", descriptor = "Leb;")
    public static class230 field4657 = class68.method589(0, "Untersuchen");

    @OriginalMember(owner = "client!oh", name = "C", descriptor = "Z")
    public static boolean field4660 = false;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "I")
    public static int field4635;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "I")
    public static int field4636;

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "I")
    public static int field4642;

    @OriginalMember(owner = "client!oh", name = "o", descriptor = "I")
    public static int field4646;

    @OriginalMember(owner = "client!oh", name = "p", descriptor = "I")
    public static int field4647;

    @OriginalMember(owner = "client!oh", name = "q", descriptor = "I")
    public static int field4648;

    @OriginalMember(owner = "client!oh", name = "u", descriptor = "I")
    public static int field4652;

    @OriginalMember(owner = "client!oh", name = "v", descriptor = "I")
    public static int field4653;

    @OriginalMember(owner = "client!oh", name = "w", descriptor = "I")
    public static int field4654;

    @OriginalMember(owner = "client!oh", name = "A", descriptor = "I")
    public static int field4658;

    @OriginalMember(owner = "client!oh", name = "B", descriptor = "I")
    public static int field4659;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "Lug;")
    private class193 field4634;

    @OriginalMember(owner = "client!oh", name = "x", descriptor = "[B")
    private byte[] field4655;

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "[I")
    public static int[] field4639;

    @OriginalMember(owner = "client!oh", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field4635++;
        this.method1818(-2);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)Lec;")
    public static final class23 method1812(int arg0, int arg1) {
        field4652++;
        int var2 = 105 % ((arg0 - 50) / 42);
        return class166.field2931 && arg1 >= class109.field1962 && class178.field3136 >= arg1 ? class139.field2484[arg1 - class109.field1962] : null;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V")
    public static void method1813(int arg0) {
        int var1 = -35 / ((16 - arg0) / 40);
        field4632 = null;
        field4639 = null;
        field4651 = null;
        field4645 = null;
        field4657 = null;
        field4633 = null;
        field4641 = null;
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)I")
    public final int method1814(int arg0) throws IOException {
        field4654++;
        if (this.field4637) {
            return 0;
        } else {
            if (arg0 != 0) {
                this.method1818(61);
            }
            return this.field4643.read();
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lgj;IIIIIIZ)V")
    public static final void method1815(class224 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field3859.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var22 = arg0.field3859[var9] - class274.field4817;
            int var23 = arg0.field3868[var9] - class72.field1317;
            int var24 = arg0.field3858[var9] - class79.field1439;
            int var25 = arg3 * var24 + arg4 * var22 >> 16;
            int var26 = arg4 * var24 - arg3 * var22 >> 16;
            int var28 = arg2 * var23 - arg1 * var26 >> 16;
            int var29 = arg1 * var23 + arg2 * var26 >> 16;
            if (var29 < 50) {
                return;
            }
            if (arg0.field3863 != null) {
                class224.field3866[var9] = var25;
                class224.field3865[var9] = var28;
                class224.field3867[var9] = var29;
            }
            class224.field3857[var9] = (var25 << 9) / var29 + class3.field19;
            class224.field3870[var9] = (var28 << 9) / var29 + class3.field25;
        }
        class3.field29 = 0;
        int var10 = arg0.field3874.length;
        for (int var11 = 0; var11 < var10; var11++) {
            int var12 = arg0.field3874[var11];
            int var13 = arg0.field3876[var11];
            int var14 = arg0.field3856[var11];
            int var15 = class224.field3857[var12];
            int var16 = class224.field3857[var13];
            int var17 = class224.field3857[var14];
            int var18 = class224.field3870[var12];
            int var19 = class224.field3870[var13];
            int var20 = class224.field3870[var14];
            if ((var15 - var16) * (var20 - var19) - (var17 - var16) * (var18 - var19) > 0) {
                if (class267.field4748 && class8.method81(class3.field19 + class219.field3772, class95.field1721 + class3.field25, var18, var19, var20, var15, var16, var17)) {
                    client.field2718 = arg5;
                    class37.field694 = arg6;
                }
                if (!arg7) {
                    class3.field16 = false;
                    if (var15 < 0 || var16 < 0 || var17 < 0 || var15 > class3.field23 || var16 > class3.field23 || var17 > class3.field23) {
                        class3.field16 = true;
                    }
                    if (arg0.field3863 == null || arg0.field3863[var11] == -1) {
                        if (arg0.field3861[var11] != 12345678) {
                            class3.method18(var18, var19, var20, var15, var16, var17, arg0.field3861[var11], arg0.field3862[var11], arg0.field3877[var11]);
                        }
                    } else if (!class99.field1833) {
                        int var21 = class3.field15.method729(83, arg0.field3863[var11]);
                        class3.method18(var18, var19, var20, var15, var16, var17, class29.method267(var21, arg0.field3861[var11]), class29.method267(var21, arg0.field3862[var11]), class29.method267(var21, arg0.field3877[var11]));
                    } else if (arg0.field3871) {
                        class3.method35(var18, var19, var20, var15, var16, var17, arg0.field3861[var11], arg0.field3862[var11], arg0.field3877[var11], class224.field3866[0], class224.field3866[1], class224.field3866[3], class224.field3865[0], class224.field3865[1], class224.field3865[3], class224.field3867[0], class224.field3867[1], class224.field3867[3], arg0.field3863[var11]);
                    } else {
                        class3.method35(var18, var19, var20, var15, var16, var17, arg0.field3861[var11], arg0.field3862[var11], arg0.field3877[var11], class224.field3866[var12], class224.field3866[var13], class224.field3866[var14], class224.field3865[var12], class224.field3865[var13], class224.field3865[var14], class224.field3867[var12], class224.field3867[var13], class224.field3867[var14], arg0.field3863[var11]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(I)I")
    public final int method1816(int arg0) throws IOException {
        field4647++;
        if (this.field4637) {
            return 0;
        } else {
            if (arg0 != 0) {
                field4642 = 101;
            }
            return this.field4643.available();
        }
    }

    @OriginalMember(owner = "client!oh", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field4650 == this.field4649) {
                            if (this.field4637) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        var2 = this.field4649;
                        if (this.field4650 < this.field4649) {
                            var3 = 5000 - this.field4649;
                        } else {
                            var3 = this.field4650 - this.field4649;
                        }
                    }
                    if (var3 <= 0) {
                        continue;
                    }
                    try {
                        this.field4644.write(this.field4655, var2, var3);
                    } catch (IOException var9) {
                        this.field4640 = true;
                    }
                    this.field4649 = (this.field4649 + var3) % 5000;
                    try {
                        if (this.field4650 == this.field4649) {
                            this.field4644.flush();
                        }
                    } catch (IOException var8) {
                        this.field4640 = true;
                    }
                    continue;
                }
                try {
                    if (this.field4643 != null) {
                        this.field4643.close();
                    }
                    if (this.field4644 != null) {
                        this.field4644.close();
                    }
                    if (this.field4638 != null) {
                        this.field4638.close();
                    }
                } catch (IOException var7) {
                }
                this.field4655 = null;
                break;
            }
        } catch (Exception var12) {
            class154.method1177(var12, (byte) -62, (String) null);
        }
        field4653++;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "([BIII)V")
    public final void method1817(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field4636++;
        if (arg2 != -12152 || this.field4637) {
            return;
        }
        if (this.field4640) {
            this.field4640 = false;
            throw new IOException();
        }
        if (this.field4655 == null) {
            this.field4655 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg3; var6++) {
                this.field4655[this.field4650] = arg0[arg1 + var6];
                this.field4650 = (this.field4650 + 1) % 5000;
                if ((this.field4649 + 4900) % 5000 == this.field4650) {
                    throw new IOException();
                }
            }
            if (this.field4634 == null) {
                this.field4634 = this.field4656.method1019(this, (byte) -111, 3);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Ljava/net/Socket;Lfh;)V")
    public class261(Socket arg0, class129 arg1) throws IOException {
        this.field4656 = arg1;
        this.field4638 = arg0;
        this.field4638.setSoTimeout(30000);
        this.field4638.setTcpNoDelay(true);
        this.field4643 = this.field4638.getInputStream();
        this.field4644 = this.field4638.getOutputStream();
    }

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "(I)V")
    public final void method1818(int arg0) {
        field4658++;
        if (arg0 != -2) {
            this.field4638 = null;
        }
        if (this.field4637) {
            return;
        }
        synchronized (this) {
            this.field4637 = true;
            this.notifyAll();
        }
        if (this.field4634 != null) {
            while (this.field4634.field3421 == 0) {
                class52.method417((byte) -115, 1L);
            }
            if (this.field4634.field3421 == 1) {
                try {
                    ((Thread) this.field4634.field3423).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field4634 = null;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(II[BB)V")
    public final void method1819(int arg0, int arg1, byte[] arg2, byte arg3) throws IOException {
        field4648++;
        if (arg3 < 93) {
            this.finalize();
        }
        if (this.field4637) {
            return;
        }
        while (arg0 > 0) {
            int var5 = this.field4643.read(arg2, arg1, arg0);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg0 -= var5;
            arg1 += var5;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(BI)V")
    public static final void method1820(byte arg0, int arg1) {
        field4659++;
        class212.method1472(22312);
        class82.method671((byte) -105);
        int var2 = class125.method983((byte) 122, arg1).field3672;
        if (var2 == 0 || arg0 > -34) {
            return;
        }
        int var3 = class99.field1838[arg1];
        if (var2 == 9) {
            class56.field1030 = var3;
        }
        if (var2 == 6) {
            class200.field3557 = var3;
        }
        if (var2 == 5) {
            class159.field2834 = var3;
        }
    }
}
