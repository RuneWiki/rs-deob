import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class307 implements Runnable {

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "Z")
    private boolean field4617 = false;

    @OriginalMember(owner = "client!ti", name = "r", descriptor = "I")
    private int field4629 = 0;

    @OriginalMember(owner = "client!ti", name = "w", descriptor = "Z")
    private boolean field4634 = false;

    @OriginalMember(owner = "client!ti", name = "m", descriptor = "I")
    private int field4624 = 0;

    @OriginalMember(owner = "client!ti", name = "i", descriptor = "Lod;")
    private class352 field4620;

    @OriginalMember(owner = "client!ti", name = "n", descriptor = "Ljava/net/Socket;")
    private Socket field4625;

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "Ljava/io/InputStream;")
    private InputStream field4613;

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field4616;

    @OriginalMember(owner = "client!ti", name = "t", descriptor = "Z")
    public static boolean field4631;

    @OriginalMember(owner = "client!ti", name = "y", descriptor = "[I")
    public static int[] field4636;

    @OriginalMember(owner = "client!ti", name = "u", descriptor = "Lob;")
    public static class521 field4632;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "I")
    public static int field4612;

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "I")
    public static int field4614;

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "I")
    public static int field4615;

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "I")
    public static int field4618;

    @OriginalMember(owner = "client!ti", name = "h", descriptor = "I")
    public static int field4619;

    @OriginalMember(owner = "client!ti", name = "j", descriptor = "I")
    public static int field4621;

    @OriginalMember(owner = "client!ti", name = "k", descriptor = "I")
    public static int field4622;

    @OriginalMember(owner = "client!ti", name = "l", descriptor = "I")
    public static int field4623;

    @OriginalMember(owner = "client!ti", name = "q", descriptor = "I")
    public static int field4628;

    @OriginalMember(owner = "client!ti", name = "s", descriptor = "I")
    public static int field4630;

    @OriginalMember(owner = "client!ti", name = "x", descriptor = "I")
    public static int field4635;

    @OriginalMember(owner = "client!ti", name = "v", descriptor = "Lgq;")
    public static class358 field4633;

    @OriginalMember(owner = "client!ti", name = "o", descriptor = "Lam;")
    private class449 field4626;

    @OriginalMember(owner = "client!ti", name = "p", descriptor = "[B")
    private byte[] field4627;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)V")
    public final void method1964(byte arg0) throws IOException {
        field4623++;
        if (arg0 > -72) {
            this.field4627 = null;
        }
        if (!this.field4634 && this.field4617) {
            this.field4617 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIB[B)V")
    public final void method1965(int arg0, int arg1, byte arg2, byte[] arg3) throws IOException {
        field4618++;
        if (arg2 != -81) {
            method1967(39);
        }
        if (this.field4634) {
            return;
        }
        while (arg1 > 0) {
            int var5 = this.field4613.read(arg3, arg0, arg1);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg0 += var5;
            arg1 -= var5;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V")
    public final void method1966(int arg0) {
        field4621++;
        if (arg0 < 60 || this.field4634) {
            return;
        }
        synchronized (this) {
            this.field4634 = true;
            this.notifyAll();
        }
        if (this.field4626 != null) {
            while (this.field4626.field6570 == 0) {
                class434.method2690(10, 1L);
            }
            if (this.field4626.field6570 == 1) {
                try {
                    ((Thread) this.field4626.field6569).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field4626 = null;
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(I)V")
    public static void method1967(int arg0) {
        field4633 = null;
        field4636 = null;
        field4632 = null;
        if (arg0 != 4900) {
            method1971(38, 61, -27, true, 64, 41, -62, null, 0.13747846F, -128);
        }
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(B)I")
    public final int method1968(byte arg0) throws IOException {
        field4635++;
        if (this.field4634) {
            return 0;
        } else {
            if (arg0 <= 40) {
                field4633 = null;
            }
            return this.field4613.read();
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "([BIBI)V")
    public final void method1969(byte[] arg0, int arg1, byte arg2, int arg3) throws IOException {
        field4612++;
        if (this.field4634) {
            return;
        }
        int var5 = -109 / ((arg2 + 92) / 34);
        if (this.field4617) {
            this.field4617 = false;
            throw new IOException();
        }
        if (this.field4627 == null) {
            this.field4627 = new byte[5000];
        }
        synchronized (this) {
            for (int var7 = 0; var7 < arg3; var7++) {
                this.field4627[this.field4624] = arg0[arg1 + var7];
                this.field4624 = (this.field4624 + 1) % 5000;
                if ((this.field4629 + 4900) % 5000 == this.field4624) {
                    throw new IOException();
                }
            }
            if (this.field4626 == null) {
                this.field4626 = this.field4620.method2195(3, 0, this);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!ti", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field4615++;
        this.method1966(90);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Z)I")
    public final int method1970(boolean arg0) throws IOException {
        field4630++;
        if (this.field4634) {
            return 0;
        } else {
            if (!arg0) {
                this.field4625 = null;
            }
            return this.field4613.available();
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIZIII[FFI)V")
    public static final void method1971(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, float[] arg7, float arg8, int arg9) {
        int var10 = arg4 - arg1;
        field4622++;
        int var11 = arg6 - arg2;
        int var12 = arg0 - arg9;
        float var13 = arg7[2] * (float) var12 + arg7[1] * (float) var11 + arg7[0] * (float) var10;
        float var14 = arg7[5] * (float) var12 + arg7[3] * (float) var10 + arg7[4] * (float) var11;
        float var15 = arg7[8] * (float) var12 + arg7[6] * (float) var10 + arg7[7] * (float) var11;
        float var16 = (float) Math.sqrt((double) (var15 * var15 + var13 * var13 + var14 * var14));
        if (arg3) {
            field4631 = false;
        }
        float var17 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        float var18 = arg8 + (float) Math.asin((double) (var14 / var16)) / 3.1415927F + 0.5F;
        if (arg5 == 1) {
            float var20 = var17;
            var17 = -var18;
            var18 = var20;
        } else if (arg5 == 2) {
            var17 = -var17;
            var18 = -var18;
        } else if (arg5 == 3) {
            float var19 = var17;
            var17 = var18;
            var18 = -var19;
        }
        class348.field5153 = var17;
        class289.field4360 = var18;
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Ljava/net/Socket;Lod;)V")
    public class307(Socket arg0, class352 arg1) throws IOException {
        this.field4620 = arg1;
        this.field4625 = arg0;
        this.field4625.setSoTimeout(30000);
        this.field4625.setTcpNoDelay(true);
        this.field4613 = this.field4625.getInputStream();
        this.field4616 = this.field4625.getOutputStream();
    }

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "(I)V")
    public final void method1972(int arg0) {
        field4614++;
        if (this.field4634) {
            return;
        }
        if (arg0 != 1) {
            this.method1972(60);
        }
        this.field4613 = new class163();
        this.field4616 = new class297();
    }

    @OriginalMember(owner = "client!ti", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field4629 == this.field4624) {
                            if (this.field4634) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        if (this.field4629 <= this.field4624) {
                            var2 = this.field4624 - this.field4629;
                        } else {
                            var2 = 5000 - this.field4629;
                        }
                        var3 = this.field4629;
                    }
                    if (var2 <= 0) {
                        continue;
                    }
                    try {
                        this.field4616.write(this.field4627, var3, var2);
                    } catch (IOException var9) {
                        this.field4617 = true;
                    }
                    this.field4629 = (this.field4629 + var2) % 5000;
                    try {
                        if (this.field4629 == this.field4624) {
                            this.field4616.flush();
                        }
                    } catch (IOException var8) {
                        this.field4617 = true;
                    }
                    continue;
                }
                try {
                    if (this.field4613 != null) {
                        this.field4613.close();
                    }
                    if (this.field4616 != null) {
                        this.field4616.close();
                    }
                    if (this.field4625 != null) {
                        this.field4625.close();
                    }
                } catch (IOException var7) {
                }
                this.field4627 = null;
                break;
            }
        } catch (Exception var12) {
            class88.method727(var12, -40, null);
        }
        field4628++;
    }

    static {
        new class234("Your clan channel has now been enabled!", "Dein Chatraum ist jetzt eingeschaltet.", "Votre canal de clan est activé !", "Seu canal de clã já está ativado!");
        field4631 = false;
        field4636 = new int[] { 104, 120, 136, 168 };
        field4632 = new class521(69, 0);
    }
}
