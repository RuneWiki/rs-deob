import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class35 implements Runnable {

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "Z")
    private boolean field582 = false;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
    private int field584 = 0;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    private int field577 = 0;

    @OriginalMember(owner = "client!cd", name = "t", descriptor = "Z")
    private boolean field596 = false;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "Ljava/net/Socket;")
    private Socket field581;

    @OriginalMember(owner = "client!cd", name = "D", descriptor = "Lne;")
    private class78 field606;

    @OriginalMember(owner = "client!cd", name = "E", descriptor = "Ljava/io/InputStream;")
    private InputStream field607;

    @OriginalMember(owner = "client!cd", name = "z", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field602;

    @OriginalMember(owner = "client!cd", name = "o", descriptor = "Ljava/lang/String;")
    public static String field591 = "Loading - please wait.";

    @OriginalMember(owner = "client!cd", name = "A", descriptor = "[Ljava/lang/String;")
    public static String[] field603 = new String[200];

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
    public static int field578;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
    public static int field579;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
    public static int field580;

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "I")
    public static int field585;

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "I")
    public static int field586;

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "I")
    public static int field588;

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!cd", name = "n", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!cd", name = "p", descriptor = "I")
    public static int field592;

    @OriginalMember(owner = "client!cd", name = "s", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!cd", name = "v", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!cd", name = "w", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!cd", name = "x", descriptor = "I")
    public static int field600;

    @OriginalMember(owner = "client!cd", name = "y", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!cd", name = "B", descriptor = "I")
    public static int field604;

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "Luc;")
    private class115 field587;

    @OriginalMember(owner = "client!cd", name = "r", descriptor = "Lsb;")
    public static class124 field594;

    @OriginalMember(owner = "client!cd", name = "C", descriptor = "Lqh;")
    public static class134 field605;

    @OriginalMember(owner = "client!cd", name = "q", descriptor = "[B")
    private byte[] field593;

    @OriginalMember(owner = "client!cd", name = "u", descriptor = "[[[I")
    public static int[][][] field597;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V")
    public static void method291(int arg0) {
        field597 = null;
        field603 = null;
        field591 = null;
        field605 = null;
        field594 = null;
        if (arg0 >= -107) {
            field597 = null;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZILjava/lang/String;)V")
    public static final void method292(boolean arg0, int arg1, String arg2) {
        boolean var3 = arg0;
        field598++;
        String var4 = class146.method1079(class145.method1072(arg2, -21512), 10446);
        for (int var5 = 0; var5 < class144.field2386; var5++) {
            class213 var6 = class191.field3129[class279.field4431[var5]];
            if (var6 != null && var6.field3445 != null && var6.field3445.equalsIgnoreCase(var4)) {
                var3 = true;
                if (arg1 == 1) {
                    class92.field1449++;
                    class87.field1405.method607(156, (byte) 67);
                    class87.field1405.method1021(0, (byte) -116);
                    class87.field1405.method995(class279.field4431[var5], -22205);
                } else if (arg1 == 4) {
                    class87.field1405.method607(180, (byte) 112);
                    class87.field1405.method968((byte) 85, class279.field4431[var5]);
                    class50.field912++;
                    class87.field1405.method970(0, 128);
                } else if (arg1 == 5) {
                    class225.field3585++;
                    class87.field1405.method607(76, (byte) 109);
                    class87.field1405.method971(3792, class279.field4431[var5]);
                    class87.field1405.method1021(0, (byte) -116);
                } else if (arg1 == 6) {
                    class87.field1405.method607(102, (byte) 106);
                    class75.field1236++;
                    class87.field1405.method970(0, 128);
                    class87.field1405.method968((byte) 85, class279.field4431[var5]);
                } else if (arg1 == 7) {
                    class87.field1405.method607(164, (byte) 120);
                    class87.field1405.method999(-23518, 0);
                    class87.field1405.method1017((byte) -103, class279.field4431[var5]);
                    class286.field4553++;
                }
                break;
            }
        }
        if (!var3) {
            class106.method787(class127.field2101 + var4, "", 0, true);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(III)I")
    public static final int method293(int arg0, int arg1, int arg2) {
        int var3 = class262.method1760(arg0 + 45365, arg1 + 91923, 4, 0) - (-(class262.method1760(arg0 + 10294, arg1 + 37821, 2, arg2 ^ arg2) - 128 >> 1) + -(class262.method1760(arg0, arg1, 1, 0) - 128 >> 2)) - 128;
        field589++;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)V")
    public final void method294(byte arg0) {
        field590++;
        if (this.field596) {
            return;
        }
        synchronized (this) {
            this.field596 = true;
            this.notifyAll();
        }
        int var3 = 58 % ((arg0 - 55) / 49);
        if (this.field587 != null) {
            while (this.field587.field1937 == 0) {
                class234.method1550(-28773, 1L);
            }
            if (this.field587.field1937 == 1) {
                try {
                    ((Thread) this.field587.field1936).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field587 = null;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)I")
    public final int method295(int arg0) throws IOException {
        field604++;
        if (arg0 != -8922) {
            method292(true, 53, (String) null);
        }
        return this.field596 ? 0 : this.field607.read();
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(I)I")
    public final int method296(int arg0) throws IOException {
        field601++;
        if (this.field596) {
            return 0;
        } else {
            int var2 = -15 / ((13 - arg0) / 53);
            return this.field607.available();
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lmk;[I[I[IB)V")
    public static final void method297(class213 arg0, int[] arg1, int[] arg2, int[] arg3, byte arg4) {
        field592++;
        int var5 = 0;
        if (arg4 < 18) {
            return;
        }
        while (var5 < arg2.length) {
            int var6 = arg3[var5];
            int var7 = arg2[var5];
            int var8 = arg1[var5];
            for (int var9 = 0; var6 != 0 && arg0.field2847.length > var9; var9++) {
                if ((var6 & 0x1) != 0) {
                    if (var7 == -1) {
                        arg0.field2847[var9] = null;
                    } else {
                        class77 var10 = class28.method246(96, var7);
                        class161 var11 = arg0.field2847[var9];
                        int var12 = var10.field1270;
                        if (var11 != null) {
                            if (var11.field2633 == var7) {
                                if (var12 == 0) {
                                    var11 = arg0.field2847[var9] = null;
                                } else if (var12 == 1) {
                                    var11.field2623 = 0;
                                    var11.field2626 = 0;
                                    var11.field2622 = var8;
                                    var11.field2639 = 0;
                                    var11.field2624 = 1;
                                    class124.method916(arg0.field2887, arg0.field2849, 477628496, class48.field878 == arg0, var10, 0);
                                } else if (var12 == 2) {
                                    var11.field2626 = 0;
                                }
                            } else if (var10.field1257 >= class28.method246(-59, var11.field2633).field1257) {
                                var11 = arg0.field2847[var9] = null;
                            }
                        }
                        if (var11 == null) {
                            class161 var13 = arg0.field2847[var9] = new class161();
                            var13.field2639 = 0;
                            var13.field2626 = 0;
                            var13.field2624 = 1;
                            var13.field2633 = var7;
                            var13.field2623 = 0;
                            var13.field2622 = var8;
                            class124.method916(arg0.field2887, arg0.field2849, 477628496, class48.field878 == arg0, var10, 0);
                        }
                    }
                }
                var6 >>>= 0x1;
            }
            var5++;
        }
    }

    @OriginalMember(owner = "client!cd", name = "run", descriptor = "()V")
    public final void run() {
        field578++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field584 == this.field577) {
                        if (this.field596) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    if (this.field577 >= this.field584) {
                        var2 = this.field577 - this.field584;
                    } else {
                        var2 = 5000 - this.field584;
                    }
                    var3 = this.field584;
                }
                if (var2 > 0) {
                    try {
                        this.field602.write(this.field593, var3, var2);
                    } catch (IOException var9) {
                        this.field582 = true;
                    }
                    this.field584 = (this.field584 + var2) % 5000;
                    try {
                        if (this.field584 == this.field577) {
                            this.field602.flush();
                        }
                    } catch (IOException var8) {
                        this.field582 = true;
                    }
                }
            }
            try {
                if (this.field607 != null) {
                    this.field607.close();
                }
                if (this.field602 != null) {
                    this.field602.close();
                }
                if (this.field581 != null) {
                    this.field581.close();
                }
            } catch (IOException var7) {
            }
            this.field593 = null;
        } catch (Exception var12) {
            class161.method1167(var12, -128, (String) null);
        }
    }

    @OriginalMember(owner = "client!cd", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field585++;
        this.method294((byte) 108);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IZ)Lsj;")
    public static final class281 method298(int arg0, boolean arg1) {
        class281 var2 = (class281) class2.field12.method1155((long) arg0, true);
        field586++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class92.field1458.method900(class15.method106(arg0, true), class159.method1150((byte) -62, arg0), arg1);
        class281 var4 = new class281();
        var4.field4454 = arg0;
        if (var3 != null) {
            var4.method1887(new class136(var3), 0);
        }
        class2.field12.method1161(var4, (byte) -111, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "(I)V")
    public final void method299(int arg0) {
        if (arg0 != 1) {
            this.method294((byte) -108);
        }
        field588++;
        if (!this.field596) {
            this.field607 = new class276();
            this.field602 = new class65();
        }
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(B)V")
    public final void method300(byte arg0) throws IOException {
        field580++;
        if (this.field596) {
            return;
        }
        if (arg0 < 108) {
            method292(false, -34, (String) null);
        }
        if (this.field582) {
            this.field582 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(II[BB)V")
    public final void method301(int arg0, int arg1, byte[] arg2, byte arg3) throws IOException {
        field600++;
        if (this.field596) {
            return;
        }
        if (this.field582) {
            this.field582 = false;
            throw new IOException();
        }
        int var5 = 125 % ((19 - arg3) / 43);
        if (this.field593 == null) {
            this.field593 = new byte[5000];
        }
        synchronized (this) {
            for (int var7 = 0; var7 < arg0; var7++) {
                this.field593[this.field577] = arg2[arg1 + var7];
                this.field577 = (this.field577 + 1) % 5000;
                if ((this.field584 + 4900) % 5000 == this.field577) {
                    throw new IOException();
                }
            }
            if (this.field587 == null) {
                this.field587 = this.field606.method628(3, this, (byte) 82);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIB)I")
    public static final int method302(int arg0, int arg1, byte arg2) {
        field595++;
        if (arg2 != -25) {
            method298(-22, false);
        }
        if (arg0 == -2) {
            return 12345678;
        } else if (arg0 == -1) {
            if (arg1 < 2) {
                arg1 = 2;
            } else if (arg1 > 126) {
                arg1 = 126;
            }
            return arg1;
        } else {
            int var3 = (arg0 & 0x7F) * arg1 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg0 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(II[BI)V")
    public final void method303(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field583++;
        if (this.field596) {
            return;
        }
        while (arg1 > 0) {
            int var5 = this.field607.read(arg2, arg3, arg1);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg3 += var5;
            arg1 -= var5;
        }
        if (arg0 != -1) {
            method291(12);
        }
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Ljava/net/Socket;Lne;)V")
    public class35(Socket arg0, class78 arg1) throws IOException {
        this.field581 = arg0;
        this.field606 = arg1;
        this.field581.setSoTimeout(30000);
        this.field581.setTcpNoDelay(true);
        this.field607 = this.field581.getInputStream();
        this.field602 = this.field581.getOutputStream();
    }
}
