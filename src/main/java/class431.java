import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class431 implements Runnable {

    @OriginalMember(owner = "client!da", name = "h", descriptor = "I")
    private int field6287 = 0;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "I")
    private int field6289 = 0;

    @OriginalMember(owner = "client!da", name = "l", descriptor = "I")
    private int field6291;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field6284;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "[B")
    private byte[] field6283;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "Ljava/lang/Thread;")
    private Thread field6286;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    public static int field6281;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "I")
    public static int field6282;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "I")
    public static int field6285;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "I")
    public static int field6288;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "I")
    public static int field6290;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "I")
    public static int field6292;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "Lgp;")
    public static class561 field6293;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "Ljava/io/IOException;")
    private IOException field6280;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(B)V")
    public final void method2565(byte arg0) {
        if (arg0 != 24) {
            this.field6287 = -117;
        }
        this.field6284 = new class42();
        field6288++;
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(B)V")
    public final void method2566(byte arg0) {
        synchronized (this) {
            if (this.field6280 == null) {
                this.field6280 = new IOException("");
            }
            this.notifyAll();
            if (arg0 > -46) {
                this.method2565((byte) 13);
            }
        }
        field6292++;
        try {
            this.field6286.join();
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IB[BI)V")
    public final void method2567(int arg0, byte arg1, byte[] arg2, int arg3) throws IOException {
        field6282++;
        if (arg0 < 0 || arg3 < 0 || arg2.length < (arg0 + arg3)) {
            throw new IndexOutOfBoundsException();
        }
        int var5 = -122 / ((-arg1 - 62) / 52);
        synchronized (this) {
            if (this.field6280 != null) {
                throw new IOException(this.field6280.toString());
            }
            int var7;
            if (this.field6287 > this.field6289) {
                var7 = this.field6287 - (this.field6289 + 1);
            } else {
                var7 = this.field6291 + this.field6287 - this.field6289 - 1;
            }
            if (var7 < arg0) {
                throw new IOException("");
            }
            if (this.field6291 < this.field6289 + arg0) {
                int var8 = this.field6291 - this.field6289;
                class164.method1151(arg2, arg3, this.field6283, this.field6289, var8);
                class164.method1151(arg2, arg3 + var8, this.field6283, 0, arg0 - var8);
            } else {
                class164.method1151(arg2, arg3, this.field6283, this.field6289, arg0);
            }
            this.field6289 = (this.field6289 + arg0) % this.field6291;
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BLqa;Ln;)V")
    public static final void method2568(byte arg0, class167 arg1, class472 arg2) {
        field6281++;
        if (class212.field3093 == null) {
            return;
        }
        if (class210.field2970 < 10) {
            if (!class212.field3092.method3168((byte) -106, class212.field3093.field9365)) {
                class210.field2970 = class421.field6184.method3182(class212.field3093.field9365, -39) / 10;
                return;
            }
            class105.method892(0);
            class210.field2970 = 10;
        }
        if (class210.field2970 == 10) {
            class212.field3118 = class212.field3093.field9361 >> 6 << 6;
            class212.field3120 = class212.field3093.field9359 >> 6 << 6;
            class212.field3121 = (class212.field3093.field9372 >> 6 << 6) + 64 - class212.field3118;
            class212.field3116 = (class212.field3093.field9364 >> 6 << 6) + 64 - class212.field3120;
            int[] var3 = new int[3];
            int var4 = -1;
            int var5 = -1;
            if (class212.field3093.method3710(class597.field8500 + (class644.field9367.field5109 >> 7), (class644.field9367.field5108 >> 7) + class382.field5687, class644.field9367.field5116, (byte) 96, var3)) {
                var4 = var3[1] - class212.field3118;
                var5 = var3[2] - class212.field3120;
            }
            if (!class343.field4928 && var4 >= 0 && class212.field3121 > var4 && var5 >= 0 && class212.field3116 > var5) {
                int var6 = var4 + (int) (Math.random() * 10.0D) - 5;
                int var7 = var5 + (int) (Math.random() * 10.0D) - 5;
                class119.field1915 = var7;
                class274.field4008 = var6;
            } else if (class600.field8519 == -1 || class642.field9334 == -1) {
                class212.field3093.method3713(class212.field3093.field9356 >> 14 & 0x3FFF, var3, class212.field3093.field9356 & 0x3FFF, (byte) 99);
                class274.field4008 = var3[1] - class212.field3118;
                class119.field1915 = var3[2] - class212.field3120;
            } else {
                class212.field3093.method3713(class600.field8519, var3, class642.field9334, (byte) -26);
                if (var3 != null) {
                    class274.field4008 = var3[1] - class212.field3118;
                    class119.field1915 = var3[2] - class212.field3120;
                }
                class642.field9334 = -1;
                class600.field8519 = -1;
                class343.field4928 = false;
            }
            if (class212.field3093.field9377 == 37) {
                class212.field3102 = 3.0F;
                class212.field3108 = 3.0F;
            } else if (class212.field3093.field9377 == 50) {
                class212.field3102 = 4.0F;
                class212.field3108 = 4.0F;
            } else if (class212.field3093.field9377 == 75) {
                class212.field3102 = 6.0F;
                class212.field3108 = 6.0F;
            } else if (class212.field3093.field9377 == 100) {
                class212.field3102 = 8.0F;
                class212.field3108 = 8.0F;
            } else if (class212.field3093.field9377 == 200) {
                class212.field3102 = 16.0F;
                class212.field3108 = 16.0F;
            } else {
                class212.field3102 = 8.0F;
                class212.field3108 = 8.0F;
            }
            class212.field3104 = (int) class212.field3102 >> 1;
            class212.field3101 = class593.method3389((byte) 125, class212.field3104);
            class173.method1192(588394986);
            class212.method1415();
            class97.field1694 = new class47();
            class212.field3099 += (int) (Math.random() * 5.0D) - 2;
            if (class212.field3099 < -8) {
                class212.field3099 = -8;
            }
            if (class212.field3099 > 8) {
                class212.field3099 = 8;
            }
            class212.field3107 += (int) (Math.random() * 5.0D) - 2;
            if (class212.field3107 < -16) {
                class212.field3107 = -16;
            }
            if (class212.field3107 > 16) {
                class212.field3107 = 16;
            }
            class212.method1413(arg2, class212.field3099 >> 2 << 10, class212.field3107 >> 1);
            class212.field3095.method67(1024, 128, 256);
            class212.field3091.method2559(-117, 256, 256);
            class212.field3096.method2882(-4893, 4096);
            class17.field257.method2697(22, 256);
            class210.field2970 = 20;
        } else if (arg0 >= 68) {
            if (class210.field2970 == 20) {
                class327.method2039(true, 0);
                class212.method1429(arg1, class212.field3099, class212.field3107);
                class210.field2970 = 60;
                class327.method2039(true, 0);
                class369.method2229(-88);
            } else if (class210.field2970 == 60) {
                if (class212.field3092.method3169(class212.field3093.field9365 + "_staticelements", 87)) {
                    if (!class212.field3092.method3168((byte) -106, class212.field3093.field9365 + "_staticelements")) {
                        return;
                    }
                    class212.field3105 = class37.method324(class56.field800, class212.field3093.field9365 + "_staticelements", 0, class212.field3092);
                } else {
                    class212.field3105 = new class313(0);
                }
                class212.method1414();
                class210.field2970 = 70;
                class327.method2039(true, 0);
                class369.method2229(-127);
            } else if (class210.field2970 == 70) {
                class496.field6956 = new class482(arg1, 11, true, class474.field6795);
                class210.field2970 = 73;
                class327.method2039(true, 0);
                class369.method2229(-91);
            } else if (class210.field2970 == 73) {
                class205.field2887 = new class482(arg1, 12, true, class474.field6795);
                class210.field2970 = 76;
                class327.method2039(true, 0);
                class369.method2229(-90);
            } else if (class210.field2970 == 76) {
                class471.field6773 = new class482(arg1, 14, true, class474.field6795);
                class210.field2970 = 79;
                class327.method2039(true, 0);
                class369.method2229(-70);
            } else if (class210.field2970 == 79) {
                class333.field4786 = new class482(arg1, 17, true, class474.field6795);
                class210.field2970 = 82;
                class327.method2039(true, 0);
                class369.method2229(-89);
            } else if (class210.field2970 == 82) {
                class270.field3977 = new class482(arg1, 19, true, class474.field6795);
                class210.field2970 = 85;
                class327.method2039(true, 0);
                class369.method2229(-77);
            } else if (class210.field2970 == 85) {
                class512.field7091 = new class482(arg1, 22, true, class474.field6795);
                class210.field2970 = 88;
                class327.method2039(true, 0);
                class369.method2229(-125);
            } else if (class210.field2970 == 88) {
                class318.field4620 = new class482(arg1, 26, true, class474.field6795);
                class210.field2970 = 91;
                class327.method2039(true, 0);
                class369.method2229(-47);
            } else {
                class340.field4888 = new class482(arg1, 30, true, class474.field6795);
                class210.field2970 = 100;
                class327.method2039(true, 0);
                class369.method2229(-60);
                System.gc();
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(B)V")
    public static void method2569(byte arg0) {
        if (arg0 > -106) {
            method2568((byte) -55, null, null);
        }
        field6293 = null;
    }

    @OriginalMember(owner = "client!da", name = "run", descriptor = "()V")
    public final void run() {
        field6290++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field6280 != null) {
                        return;
                    }
                    if (this.field6287 <= this.field6289) {
                        var2 = this.field6289 - this.field6287;
                    } else {
                        var2 = this.field6291 + this.field6289 - this.field6287;
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
                if ((this.field6287 + var2) <= this.field6291) {
                    this.field6284.write(this.field6283, this.field6287, var2);
                } else {
                    int var3 = this.field6291 - this.field6287;
                    this.field6284.write(this.field6283, this.field6287, var3);
                    this.field6284.write(this.field6283, 0, var2 - var3);
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field6280 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field6287 = (this.field6287 + var2) % this.field6291;
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
    public class431(OutputStream arg0, int arg1) {
        this.field6291 = arg1 + 1;
        this.field6284 = arg0;
        this.field6283 = new byte[this.field6291];
        this.field6286 = new Thread(this);
        this.field6286.setDaemon(true);
        this.field6286.start();
    }

    static {
        new class567("clan_chat", "clanchat", "conversation_clan", "clan_chat");
    }
}
