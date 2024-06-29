import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class class351 implements Runnable {

    @OriginalMember(owner = "client!bp", name = "g", descriptor = "I")
    private int field4672 = 0;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "I")
    private int field4666 = 0;

    @OriginalMember(owner = "client!bp", name = "d", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field4669;

    @OriginalMember(owner = "client!bp", name = "f", descriptor = "I")
    private int field4671;

    @OriginalMember(owner = "client!bp", name = "o", descriptor = "[B")
    private byte[] field4680;

    @OriginalMember(owner = "client!bp", name = "m", descriptor = "Ljava/lang/Thread;")
    private Thread field4678;

    @OriginalMember(owner = "client!bp", name = "k", descriptor = "Lem;")
    public static class206 field4676 = new class206(103, 4);

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "I")
    public static int field4667;

    @OriginalMember(owner = "client!bp", name = "c", descriptor = "I")
    public static int field4668;

    @OriginalMember(owner = "client!bp", name = "e", descriptor = "I")
    public static int field4670;

    @OriginalMember(owner = "client!bp", name = "h", descriptor = "I")
    public static int field4673;

    @OriginalMember(owner = "client!bp", name = "j", descriptor = "I")
    public static int field4675;

    @OriginalMember(owner = "client!bp", name = "l", descriptor = "I")
    public static int field4677;

    @OriginalMember(owner = "client!bp", name = "n", descriptor = "I")
    public static int field4679;

    @OriginalMember(owner = "client!bp", name = "i", descriptor = "Ljava/io/IOException;")
    private IOException field4674;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(II[BI)V")
    public final void method2020(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field4670++;
        if (arg1 < 0 || arg0 < 0 || arg0 + arg1 > arg2.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field4674 != null) {
                throw new IOException(this.field4674.toString());
            }
            int var6;
            if (this.field4672 > this.field4666) {
                var6 = this.field4672 - this.field4666 - 1;
            } else {
                var6 = this.field4672 + this.field4671 - this.field4666 - 1;
            }
            if (var6 < arg1) {
                throw new IOException("");
            }
            if (this.field4671 >= this.field4666 + arg1) {
                class359.method2053(arg2, arg0, this.field4680, this.field4666, arg1);
            } else {
                int var7 = this.field4671 - this.field4666;
                class359.method2053(arg2, arg0, this.field4680, this.field4666, var7);
                class359.method2053(arg2, arg0 + var7, this.field4680, 0, arg1 - var7);
            }
            if (arg3 <= 72) {
                this.run();
            }
            this.field4666 = (this.field4666 + arg1) % this.field4671;
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(Lvv;Z[[[BIB)Z")
    public static final boolean method2021(class295 arg0, boolean arg1, byte[][][] arg2, int arg3, byte arg4) {
        if (!class260.field3544) {
            return false;
        }
        int var5 = arg0.field4042 >> class588.field8259;
        int var6 = arg0.field4047 >> class588.field8259;
        if (var5 < class361.field4763 || var5 >= class601.field8384 || var6 < class154.field2265 || var6 >= class400.field5612) {
            return true;
        } else if ((arg2 == null || arg0.field4053 < arg3 || arg2[arg0.field4053][var5][var6] != arg4) && arg0.method1324(-121) && !arg0.method1322((byte) -54)) {
            return false;
        } else {
            if (!arg1 && var5 >= class167.field2435 - 16 && var5 <= class167.field2435 + 16 && var6 >= class353.field4699 - 16 && var6 <= class353.field4699 + 16) {
                if (class17.field174) {
                    class672.field9424[class386.field5474++].method1396(-10, arg0);
                    class386.field5474 %= class259.field3519;
                } else {
                    arg0.method220(class401.field5619, true);
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!bp", name = "run", descriptor = "()V")
    public final void run() {
        field4667++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field4674 != null) {
                        return;
                    }
                    if (this.field4672 > this.field4666) {
                        var2 = this.field4671 + this.field4666 - this.field4672;
                    } else {
                        var2 = this.field4666 - this.field4672;
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
            try {
                if (this.field4672 + var2 > this.field4671) {
                    int var3 = this.field4671 - this.field4672;
                    this.field4669.write(this.field4680, this.field4672, var3);
                    this.field4669.write(this.field4680, 0, var2 - var3);
                } else {
                    this.field4669.write(this.field4680, this.field4672, var2);
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field4674 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field4672 = (this.field4672 + var2) % this.field4671;
            }
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(ZI)V")
    public static final void method2022(boolean arg0, int arg1) {
        class609.field8456++;
        field4673++;
        class352 var2 = class290.method1786(98, class199.field2836, class372.field5006);
        if (arg1 >= -68) {
            method2022(true, 61);
        }
        class602.method3388(var2, (byte) 28);
        for (class685 var3 = (class685) class4.field26.method977(0); var3 != null; var3 = (class685) class4.field26.method975(-1)) {
            if (!var3.method2339(118)) {
                var3 = (class685) class4.field26.method977(0);
                if (var3 == null) {
                    break;
                }
            }
            if (var3.field9774 == 0) {
                class17.method83(true, var3, -8501, arg0);
            }
        }
        if (class578.field8165 != null) {
            class26.method255(class578.field8165, -20229);
            class578.field8165 = null;
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(IILjava/util/Random;)I")
    public static final int method2023(int arg0, int arg1, Random arg2) {
        field4677++;
        if (arg0 <= 0) {
            throw new IllegalArgumentException();
        } else if (class588.method3342(79, arg0)) {
            return (int) (((long) arg2.nextInt() & 0xFFFFFFFFL) * (long) arg0 >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg0));
            if (arg1 > -3) {
                field4676 = null;
            }
            int var4;
            do {
                var4 = arg2.nextInt();
            } while (var3 <= var4);
            return class602.method3390((byte) -117, arg0, var4);
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(Z)V")
    public final void method2024(boolean arg0) {
        field4668++;
        synchronized (this) {
            if (this.field4674 == null) {
                this.field4674 = new IOException("");
            }
            if (arg0) {
                this.field4674 = null;
            }
            this.notifyAll();
        }
        try {
            this.field4678.join();
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(Lsea;ZIIIIZ)V")
    public static final void method2025(class648 arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field4679++;
        if (arg3 <= 0) {
            class56.method471(arg5, arg4, arg2, arg6, -1, arg0);
        } else {
            class4.field34 = arg0;
            class129.field1848 = arg4;
            class542.field7334 = arg2;
            class123.field1688 = null;
            class131.field1891 = arg5;
            class450.field6183 = 1;
            class439.field6090 = arg6;
            class686.field9799 = class224.field3124.method2090((byte) 16) / arg3;
            if (class686.field9799 < 1) {
                class686.field9799 = 1;
            }
        }
        if (!arg1) {
            field4676 = null;
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(I)V")
    public final void method2026(int arg0) {
        if (arg0 == -14617) {
            this.field4669 = new class434();
            field4675++;
        }
    }

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "(I)V")
    public static void method2027(int arg0) {
        if (arg0 > -113) {
            field4676 = null;
        }
        field4676 = null;
    }

    @OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
    public class351(OutputStream arg0, int arg1) {
        this.field4669 = arg0;
        this.field4671 = arg1 + 1;
        this.field4680 = new byte[this.field4671];
        this.field4678 = new Thread(this);
        this.field4678.setDaemon(true);
        this.field4678.start();
    }
}
