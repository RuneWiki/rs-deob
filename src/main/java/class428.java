import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class class428 implements Runnable {

    @OriginalMember(owner = "client!dr", name = "h", descriptor = "I")
    private int field6479 = 0;

    @OriginalMember(owner = "client!dr", name = "i", descriptor = "I")
    private int field6480 = 0;

    @OriginalMember(owner = "client!dr", name = "l", descriptor = "Ljava/io/InputStream;")
    private InputStream field6483;

    @OriginalMember(owner = "client!dr", name = "k", descriptor = "I")
    private int field6482;

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "[B")
    private byte[] field6472;

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "Ljava/lang/Thread;")
    private Thread field6474;

    @OriginalMember(owner = "client!dr", name = "m", descriptor = "Lbi;")
    public static class104 field6484 = new class104(111, 12);

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "I")
    public static int field6473;

    @OriginalMember(owner = "client!dr", name = "d", descriptor = "I")
    public static int field6475;

    @OriginalMember(owner = "client!dr", name = "e", descriptor = "I")
    public static int field6476;

    @OriginalMember(owner = "client!dr", name = "f", descriptor = "I")
    public static int field6477;

    @OriginalMember(owner = "client!dr", name = "g", descriptor = "I")
    public static int field6478;

    @OriginalMember(owner = "client!dr", name = "n", descriptor = "I")
    public static int field6485;

    @OriginalMember(owner = "client!dr", name = "o", descriptor = "I")
    public static int field6486;

    @OriginalMember(owner = "client!dr", name = "p", descriptor = "I")
    public static int field6487;

    @OriginalMember(owner = "client!dr", name = "j", descriptor = "Ljava/io/IOException;")
    private IOException field6481;

    // $FF: synthetic field
    @OriginalMember(owner = "client!dr", name = "q", descriptor = "Ljava/lang/Class;")
    public static Class field6488;

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2708(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field6485++;
        if (arg2 >= 0 && arg5 >= 0 && arg2 < class135.field1839 - 1 && class197.field3038 - 1 > arg5) {
            if (class217.field3699 == null) {
                return;
            }
            if (arg7 == 0) {
                class267 var12 = (class267) class409.method2611(arg0, arg2, arg5);
                class267 var13 = (class267) class77.method556(arg0, arg2, arg5);
                if (var12 != null && arg3 != 2) {
                    if (var12 instanceof class542) {
                        ((class542) var12).field7913.method2939((byte) 60, arg6);
                    } else {
                        class128.method799(var12.method96((byte) 116), arg0, arg2, arg7, arg3, arg6, arg5, 3, arg4);
                    }
                }
                if (var13 != null) {
                    if (var13 instanceof class542) {
                        ((class542) var13).field7913.method2939((byte) -125, arg6);
                    } else {
                        class128.method799(var13.method96((byte) 89), arg0, arg2, arg7, arg3, arg6, arg5, arg1 ^ 0xF, arg4);
                    }
                }
            } else if (arg7 == 1) {
                class267 var8 = (class267) class75.method544(arg0, arg2, arg5);
                if (var8 != null) {
                    if ((var8 instanceof class345)) {
                        ((class345) var8).field5374.method2939((byte) 71, arg6);
                    } else {
                        int var9 = var8.method96((byte) 104);
                        if (arg3 == 4 || arg3 == 5) {
                            class128.method799(var9, arg0, arg2, arg7, 4, arg6, arg5, 3, arg4);
                        } else if (arg3 == 6) {
                            class128.method799(var9, arg0, arg2, arg7, 4, arg6, arg5, 3, arg4 + 4);
                        } else if (arg3 == 7) {
                            class128.method799(var9, arg0, arg2, arg7, 4, arg6, arg5, 3, (arg4 + 2 & 0x3) + 4);
                        } else if (arg3 == 8) {
                            class128.method799(var9, arg0, arg2, arg7, 4, arg6, arg5, arg1 ^ 0xF, arg4 + 4);
                            class128.method799(var9, arg0, arg2, arg7, 4, arg6, arg5, 3, (arg4 + 2 & 0x3) + 4);
                        }
                    }
                }
            } else if (arg7 == 2) {
                class267 var10 = (class267) class49.method352(arg0, arg2, arg5, field6488 == null ? (field6488 = method2715("jq")) : field6488);
                if (var10 != null) {
                    if (arg3 == 11) {
                        arg3 = 10;
                    }
                    if (var10 instanceof class217) {
                        ((class217) var10).field3680.method2939((byte) 97, arg6);
                    } else {
                        class128.method799(var10.method96((byte) 117), arg0, arg2, arg7, arg3, arg6, arg5, arg1 - 9, arg4);
                    }
                }
            } else if (arg7 == 3) {
                class267 var11 = (class267) class76.method548(arg0, arg2, arg5);
                if (var11 != null) {
                    if (var11 instanceof class471) {
                        ((class471) var11).field7207.method2939((byte) 103, arg6);
                    } else {
                        class128.method799(var11.method96((byte) 102), arg0, arg2, arg7, arg3, arg6, arg5, 3, arg4);
                    }
                }
            }
        }
        if (arg1 != 12) {
            field6484 = null;
        }
    }

    @OriginalMember(owner = "client!dr", name = "run", descriptor = "()V")
    public final void run() {
        field6478++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field6481 != null) {
                        return;
                    }
                    if (this.field6480 == 0) {
                        var2 = this.field6482 - this.field6479 - 1;
                    } else if (this.field6480 < this.field6479) {
                        var2 = this.field6482 - this.field6479;
                    } else {
                        var2 = this.field6480 - this.field6479 - 1;
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var12) {
                    }
                }
            }
            int var3;
            try {
                var3 = this.field6483.read(this.field6472, this.field6479, var2);
                if (var3 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field6481 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field6479 = (this.field6479 + var3) % this.field6482;
            }
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(I)V")
    public final void method2709(int arg0) {
        field6476++;
        this.field6483 = new class425();
        if (arg0 != -12) {
            this.method2712((byte) -26);
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(II)Z")
    public final boolean method2710(int arg0, int arg1) throws IOException {
        field6473++;
        if (arg1 <= 0 || this.field6482 <= arg1) {
            throw new IndexOutOfBoundsException();
        }
        synchronized (this) {
            if (arg0 != -11728) {
                return true;
            }
            int var5;
            if (this.field6480 <= this.field6479) {
                var5 = this.field6479 - this.field6480;
            } else {
                var5 = this.field6479 + this.field6482 - this.field6480;
            }
            if (arg1 <= var5) {
                return true;
            } else if (this.field6481 == null) {
                return false;
            } else {
                throw new IOException(this.field6481.toString());
            }
        }
    }

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "(I)V")
    public static void method2711(int arg0) {
        field6484 = null;
        if (arg0 != 4380) {
            method2711(7);
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(B)V")
    public final void method2712(byte arg0) {
        synchronized (this) {
            if (this.field6481 == null) {
                this.field6481 = new IOException("");
            }
            this.notifyAll();
        }
        field6475++;
        try {
            this.field6474.join();
            if (arg0 != 84) {
                this.field6474 = null;
            }
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
    public class428(InputStream arg0, int arg1) {
        this.field6483 = arg0;
        this.field6482 = arg1 + 1;
        this.field6472 = new byte[this.field6482];
        this.field6474 = new Thread(this);
        this.field6474.setDaemon(true);
        this.field6474.start();
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "([BIII)I")
    public final int method2713(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field6487++;
        if (arg2 < 0 || arg1 < 0 || arg0.length < (arg1 + arg2)) {
            throw new IndexOutOfBoundsException();
        }
        if (arg3 < 117) {
            this.field6482 = 84;
        }
        synchronized (this) {
            int var6;
            if (this.field6480 <= this.field6479) {
                var6 = this.field6479 - this.field6480;
            } else {
                var6 = this.field6482 + this.field6479 - this.field6480;
            }
            if (var6 < arg2) {
                arg2 = var6;
            }
            if (arg2 == 0 && this.field6481 != null) {
                throw new IOException(this.field6481.toString());
            }
            if ((this.field6480 + arg2) <= this.field6482) {
                class324.method2166(this.field6472, this.field6480, arg0, arg1, arg2);
            } else {
                int var7 = this.field6482 - this.field6480;
                class324.method2166(this.field6472, this.field6480, arg0, arg1, var7);
                class324.method2166(this.field6472, 0, arg0, arg1 + var7, -var7 + arg2);
            }
            this.field6480 = (this.field6480 + arg2) % this.field6482;
            this.notifyAll();
            return arg2;
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIIZ)I")
    public static final int method2714(int arg0, int arg1, int arg2, boolean arg3) {
        field6477++;
        if (arg0 != 0) {
            method2708(106, 47, 119, -84, 53, 67, -17, 36);
        }
        class339 var4 = class154.method940(arg2, arg3, (byte) 119);
        if (var4 == null) {
            return 0;
        } else if (arg1 >= 0 && var4.field5290.length > arg1) {
            return var4.field5290[arg1];
        } else {
            return 0;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2715(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
