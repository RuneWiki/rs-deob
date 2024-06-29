import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class258 implements Runnable {

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "I")
    private int field4132 = 0;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "Z")
    private boolean field4130 = false;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "Z")
    private boolean field4124 = false;

    @OriginalMember(owner = "client!fc", name = "t", descriptor = "I")
    private int field4143 = 0;

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "Ljava/net/Socket;")
    private Socket field4138;

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "Lgt;")
    private class66 field4134;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "Ljava/io/InputStream;")
    private InputStream field4128;

    @OriginalMember(owner = "client!fc", name = "x", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field4147;

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "Lpu;")
    public static class179 field4131 = new class179("slide:", "gleiten:", "glissement:", "deslizamento:");

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "[Lfg;")
    public static class128[] field4135 = new class128[50];

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "Lpn;")
    public static class49 field4136 = new class49(19, 4);

    @OriginalMember(owner = "client!fc", name = "y", descriptor = "I")
    public static int field4148 = 2;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
    public static int field4125;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "I")
    public static int field4126;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
    public static int field4127;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
    public static int field4129;

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
    public static int field4133;

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "I")
    public static int field4139;

    @OriginalMember(owner = "client!fc", name = "r", descriptor = "I")
    public static int field4141;

    @OriginalMember(owner = "client!fc", name = "s", descriptor = "I")
    public static int field4142;

    @OriginalMember(owner = "client!fc", name = "u", descriptor = "I")
    public static int field4144;

    @OriginalMember(owner = "client!fc", name = "v", descriptor = "I")
    public static int field4145;

    @OriginalMember(owner = "client!fc", name = "w", descriptor = "I")
    public static int field4146;

    @OriginalMember(owner = "client!fc", name = "z", descriptor = "Lap;")
    public static class29 field4149;

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "Lwk;")
    private class329 field4137;

    @OriginalMember(owner = "client!fc", name = "q", descriptor = "[B")
    private byte[] field4140;

    @OriginalMember(owner = "client!fc", name = "A", descriptor = "[[I")
    public static int[][] field4150;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IZI[B)V")
    public final void method1811(int arg0, boolean arg1, int arg2, byte[] arg3) throws IOException {
        field4139++;
        if (this.field4130) {
            return;
        }
        if (this.field4124) {
            this.field4124 = false;
            throw new IOException();
        }
        if (this.field4140 == null) {
            this.field4140 = new byte[5000];
        }
        if (arg1) {
            method1818(51, null, false);
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg2; var6++) {
                this.field4140[this.field4132] = arg3[arg0 + var6];
                this.field4132 = (this.field4132 + 1) % 5000;
                if ((this.field4143 + 4900) % 5000 == this.field4132) {
                    throw new IOException();
                }
            }
            if (this.field4137 == null) {
                this.field4137 = this.field4134.method448(3, this, (byte) 75);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!fc", name = "run", descriptor = "()V")
    public final void run() {
        field4126++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field4143 == this.field4132) {
                        if (this.field4130) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    if (this.field4132 >= this.field4143) {
                        var2 = this.field4132 - this.field4143;
                    } else {
                        var2 = 5000 - this.field4143;
                    }
                    var3 = this.field4143;
                }
                if (var2 > 0) {
                    try {
                        this.field4147.write(this.field4140, var3, var2);
                    } catch (IOException var9) {
                        this.field4124 = true;
                    }
                    this.field4143 = (this.field4143 + var2) % 5000;
                    try {
                        if (this.field4143 == this.field4132) {
                            this.field4147.flush();
                        }
                    } catch (IOException var8) {
                        this.field4124 = true;
                    }
                }
            }
            try {
                if (this.field4128 != null) {
                    this.field4128.close();
                }
                if (this.field4147 != null) {
                    this.field4147.close();
                }
                if (this.field4138 != null) {
                    this.field4138.close();
                }
            } catch (IOException var7) {
            }
            this.field4140 = null;
        } catch (Exception var12) {
            class197.method1407(true, null, var12);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
    public final void method1812(int arg0) {
        field4125++;
        if (arg0 != -401) {
            method1816(-69);
        }
        if (this.field4130) {
            return;
        }
        synchronized (this) {
            this.field4130 = true;
            this.notifyAll();
        }
        if (this.field4137 != null) {
            while (this.field4137.field4974 == 0) {
                class468.method2848(1L, (byte) -123);
            }
            if (this.field4137.field4974 == 1) {
                try {
                    ((Thread) this.field4137.field4975).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field4137 = null;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)V")
    public final void method1813(int arg0) {
        field4144++;
        if (this.field4130) {
            return;
        }
        this.field4128 = new class467();
        if (arg0 != -1) {
            method1816(33);
        }
        this.field4147 = new class259();
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V")
    public static void method1814(byte arg0) {
        if (arg0 != -100) {
            field4135 = null;
        }
        field4149 = null;
        field4136 = null;
        field4150 = null;
        field4131 = null;
        field4135 = null;
    }

    @OriginalMember(owner = "client!fc", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method1812(-401);
        field4142++;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(B)V")
    public final void method1815(byte arg0) throws IOException {
        field4133++;
        if (arg0 == -8 && !this.field4130 && this.field4124) {
            this.field4124 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(I)Z")
    public static final boolean method1816(int arg0) {
        field4127++;
        if (arg0 == -29710) {
            return class62.field991 != class287.field4471 || class224.field3421 >= 2;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "(I)I")
    public final int method1817(int arg0) throws IOException {
        field4141++;
        if (this.field4130) {
            return 0;
        } else {
            if (arg0 >= -41) {
                this.run();
            }
            return this.field4128.read();
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILsj;Z)V")
    public static final void method1818(int arg0, class511 arg1, boolean arg2) {
        field4146++;
        if (class540.field7909 >= 400) {
            return;
        }
        if (class116.field1781 != arg1) {
            String var3;
            if (arg1.field7449 == 0) {
                boolean var4 = true;
                if (class116.field1781.field7462 != -1 && arg1.field7462 != -1) {
                    int var5 = class116.field1781.field7469 <= arg1.field7469 ? arg1.field7469 : class116.field1781.field7469;
                    int var6 = class116.field1781.field7462 >= arg1.field7462 ? arg1.field7462 : class116.field1781.field7462;
                    int var7 = var5 * 10 / 100 + var6 + 5;
                    int var8 = class116.field1781.field7469 - arg1.field7469;
                    if (var8 < 0) {
                        var8 = -var8;
                    }
                    if (var8 > var7) {
                        var4 = false;
                    }
                }
                String var9 = class401.field5923 == class268.field4258 ? class320.field4854.method1265(class345.field5141, -101) : class234.field3512.method1265(class345.field5141, -94);
                if (arg1.field7432 > arg1.field7469) {
                    var3 = arg1.method3044(true, arg0 - 16643) + (var4 ? class485.method2932(class116.field1781.field7469, arg1.field7469, (byte) 37) : "<col=ffffff>") + " (" + var9 + arg1.field7469 + "+" + (arg1.field7432 - arg1.field7469) + ")";
                } else {
                    var3 = arg1.method3044(true, -1) + (var4 ? class485.method2932(class116.field1781.field7469, arg1.field7469, (byte) 37) : "<col=ffffff>") + " (" + var9 + arg1.field7469 + ")";
                }
            } else {
                var3 = arg1.method3044(true, -90) + " (" + class5.field71.method1265(class345.field5141, -102) + arg1.field7449 + ")";
            }
            if (class2.field17) {
                if (!arg2 && (class166.field2500 & 0x8) != 0) {
                    class423.method2637((long) arg1.field7562, -1, 0, (byte) -113, true, 12, class218.field3297, class246.field3688, false, 0, class447.field6638 + " -> <col=ffffff>" + var3);
                    class443.field6594++;
                }
            } else if (arg2) {
                class423.method2637(0L, 0, 0, (byte) -113, false, -1, "<col=cccccc>" + var3, -1, true, 0, "");
            } else {
                for (int var10 = 7; var10 >= 0; var10--) {
                    if (class96.field1517[var10] != null) {
                        short var11 = 0;
                        if (class81.field1327 == class401.field5923 && class96.field1517[var10].equalsIgnoreCase(class354.field5248.method1265(class345.field5141, arg0 - 16829))) {
                            if (arg1.field7469 > class116.field1781.field7469) {
                                var11 = 2000;
                            }
                            if (class116.field1781.field7458 != 0 && arg1.field7458 != 0) {
                                if (class116.field1781.field7458 == arg1.field7458) {
                                    var11 = 2000;
                                } else {
                                    var11 = 0;
                                }
                            }
                        } else if (class428.field6364[var10]) {
                            var11 = 2000;
                        }
                        short var12 = (short) (class412.field6082[var10] + var11);
                        int var13 = class52.field791[var10] == -1 ? class504.field7324 : class52.field791[var10];
                        class423.method2637((long) arg1.field7562, -1, 0, (byte) -113, true, var12, class96.field1517[var10], var13, false, 0, "<col=ffffff>" + var3);
                        class504.field7316++;
                    }
                }
            }
            if (arg0 != 16706) {
                method1814((byte) 18);
            }
            if (!arg2) {
                for (class376 var14 = (class376) class154.field2370.method295((byte) 126); var14 != null; var14 = (class376) class154.field2370.method296(true)) {
                    if (var14.field5546 == 6) {
                        var14.field5543 = "<col=ffffff>" + var3;
                        return;
                    }
                }
            }
        } else if (class2.field17 && (class166.field2500 & 0x10) != 0) {
            class423.method2637(0L, -1, 0, (byte) -113, true, 13, class218.field3297, class246.field3688, false, 0, class447.field6638 + " -> <col=ffffff>" + class508.field7401.method1265(class345.field5141, -94));
            class374.field5534++;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B[BII)V")
    public final void method1819(byte arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field4129++;
        if (arg0 >= 0 || this.field4130) {
            return;
        }
        while (arg2 > 0) {
            int var5 = this.field4128.read(arg1, arg3, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg2 -= var5;
            arg3 += var5;
        }
    }

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "(I)I")
    public final int method1820(int arg0) throws IOException {
        field4145++;
        if (this.field4130) {
            return 0;
        } else if (arg0 <= 62) {
            return 111;
        } else {
            return this.field4128.available();
        }
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Ljava/net/Socket;Lgt;)V")
    public class258(Socket arg0, class66 arg1) throws IOException {
        this.field4138 = arg0;
        this.field4134 = arg1;
        this.field4138.setSoTimeout(30000);
        this.field4138.setTcpNoDelay(true);
        this.field4128 = this.field4138.getInputStream();
        this.field4147 = this.field4138.getOutputStream();
    }
}
