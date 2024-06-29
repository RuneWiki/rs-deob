import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nha")
public class class525 implements Runnable {

    @OriginalMember(owner = "client!nha", name = "k", descriptor = "I")
    private int field7234 = 0;

    @OriginalMember(owner = "client!nha", name = "l", descriptor = "I")
    private int field7235 = 0;

    @OriginalMember(owner = "client!nha", name = "f", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field7229;

    @OriginalMember(owner = "client!nha", name = "e", descriptor = "I")
    private int field7228;

    @OriginalMember(owner = "client!nha", name = "q", descriptor = "[B")
    private byte[] field7240;

    @OriginalMember(owner = "client!nha", name = "p", descriptor = "Ljava/lang/Thread;")
    private Thread field7239;

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "I")
    public static int field7224 = 104;

    @OriginalMember(owner = "client!nha", name = "b", descriptor = "I")
    public static int field7225;

    @OriginalMember(owner = "client!nha", name = "d", descriptor = "I")
    public static int field7227;

    @OriginalMember(owner = "client!nha", name = "h", descriptor = "I")
    public static int field7231;

    @OriginalMember(owner = "client!nha", name = "i", descriptor = "I")
    public static int field7232;

    @OriginalMember(owner = "client!nha", name = "j", descriptor = "I")
    public static int field7233;

    @OriginalMember(owner = "client!nha", name = "m", descriptor = "I")
    public static int field7236;

    @OriginalMember(owner = "client!nha", name = "n", descriptor = "I")
    public static int field7237;

    @OriginalMember(owner = "client!nha", name = "o", descriptor = "I")
    public static int field7238;

    @OriginalMember(owner = "client!nha", name = "c", descriptor = "Lhw;")
    public static class300 field7226;

    @OriginalMember(owner = "client!nha", name = "g", descriptor = "Ljava/io/IOException;")
    private IOException field7230;

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(B)V", line = 4)
    public static void method3123(byte arg0) {
        field7226 = null;
        if (arg0 <= 3) {
            field7226 = null;
        }
    }

    @OriginalMember(owner = "client!nha", name = "run", descriptor = "()V", line = 14)
    public final void run() {
        field7231++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field7230 != null) {
                        return;
                    }
                    if (this.field7234 > this.field7235) {
                        var2 = this.field7235 + this.field7228 - this.field7234;
                    } else {
                        var2 = this.field7235 - this.field7234;
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
                if (this.field7234 + var2 <= this.field7228) {
                    this.field7229.write(this.field7240, this.field7234, var2);
                } else {
                    int var3 = this.field7228 - this.field7234;
                    this.field7229.write(this.field7240, this.field7234, var3);
                    this.field7229.write(this.field7240, 0, var2 - var3);
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field7230 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field7234 = (this.field7234 + var2) % this.field7228;
            }
        }
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(II)V", line = 75)
    public static final void method3124(int arg0, int arg1) {
        field7227++;
        if (arg0 < 49) {
            field7237 = -89;
        }
        class773.field10655 = arg1;
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(II[BI)V", line = 86)
    public final void method3125(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field7236++;
        if (arg3 < 0 || arg1 < 0 || arg1 + arg3 > arg2.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field7230 != null) {
                throw new IOException(this.field7230.toString());
            }
            if (arg0 != 0) {
                this.field7235 = 35;
            }
            int var6;
            if (this.field7235 >= this.field7234) {
                var6 = this.field7234 + this.field7228 - this.field7235 - 1;
            } else {
                var6 = this.field7234 - this.field7235 - 1;
            }
            if (var6 < arg3) {
                throw new IOException("");
            }
            if (this.field7235 + arg3 > this.field7228) {
                int var7 = this.field7228 - this.field7235;
                class335.method2118(arg2, arg1, this.field7240, this.field7235, var7);
                class335.method2118(arg2, arg1 + var7, this.field7240, 0, arg3 - var7);
            } else {
                class335.method2118(arg2, arg1, this.field7240, this.field7235, arg3);
            }
            this.field7235 = (this.field7235 + arg3) % this.field7228;
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(I)V", line = 138)
    public final void method3126(int arg0) {
        field7238++;
        if (arg0 > -110) {
            method3128((byte) 110, null, 42, 34);
        }
        this.field7229 = new class722();
    }

    @OriginalMember(owner = "client!nha", name = "b", descriptor = "(B)V", line = 149)
    public final void method3127(byte arg0) {
        synchronized (this) {
            if (this.field7230 == null) {
                this.field7230 = new IOException("");
            }
            this.notifyAll();
        }
        field7232++;
        try {
            int var3 = -33 % ((arg0 - 72) / 53);
            this.field7239.join();
        } catch (InterruptedException var4) {
        }
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(BLsha;II)V", line = 175)
    public static final void method3128(byte arg0, class115 arg1, int arg2, int arg3) {
        if (arg0 > -10) {
            field7226 = null;
        }
        field7233++;
        class87 var4 = arg1.method843(class111.field1332, 1531777828);
        if (var4 == null) {
            return;
        }
        class111.field1332.method225(arg2, arg3, arg1.field1560 + arg2, arg1.field1517 + arg3);
        if (class255.field3779 < 3) {
            class140.field1792.method2027((float) arg1.field1560 / 2.0F + (float) arg2, (float) arg1.field1517 / 2.0F + (float) arg3, 4096, (int) (-class702.field9790) & 0x3FFF << 2, var4, arg2, arg3);
        } else {
            class111.field1332.method176(-16777216, var4, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!nha", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V", line = 307)
    public class525(OutputStream arg0, int arg1) {
        this.field7229 = arg0;
        this.field7228 = arg1 + 1;
        this.field7240 = new byte[this.field7228];
        this.field7239 = new Thread(this);
        this.field7239.setDaemon(true);
        this.field7239.start();
    }

    @OriginalMember(owner = "client!nha", name = "c", descriptor = "(B)Z", line = 208)
    public static final boolean method3129(byte arg0) {
        if (arg0 >= -107) {
            return true;
        }
        field7225++;
        try {
            if (class20.field171 == 2) {
                if (class212.field2928 == null) {
                    class212.field2928 = class481.method2860(class164.field2097, class748.field10330, class793.field10868);
                    if (class212.field2928 == null) {
                        return false;
                    }
                }
                if (class395.field5616 == null) {
                    class395.field5616 = new class141(class781.field10731, class531.field7315);
                }
                class82 var1 = class493.field6796;
                if (class574.field8079 != null) {
                    var1 = class574.field8079;
                }
                if (var1.method620(class693.field9670, (byte) 118, class212.field2928, class395.field5616, 22050)) {
                    class493.field6796 = var1;
                    class493.field6796.method585(-8193);
                    if (class153.field2004 <= 0) {
                        class20.field171 = 0;
                        class493.field6796.method584((byte) 106, class354.field5120);
                        for (int var2 = 0; var2 < class744.field10271.length; var2++) {
                            class493.field6796.method586(class744.field10271[var2], (byte) 57, var2);
                            class744.field10271[var2] = 255;
                        }
                    } else {
                        class20.field171 = 3;
                        class493.field6796.method584((byte) 117, class354.field5120 >= class153.field2004 ? class153.field2004 : class354.field5120);
                        for (int var3 = 0; var3 < class744.field10271.length; var3++) {
                            class493.field6796.method586(class744.field10271[var3], (byte) 56, var3);
                            class744.field10271[var3] = 255;
                        }
                    }
                    if (class574.field8079 == null) {
                        if (class156.field2030 > 0L) {
                            class493.field6796.method619(class194.field2599, class212.field2928, class156.field2030, true, 502);
                        } else {
                            class493.field6796.method617((byte) 89, class194.field2599, class212.field2928);
                        }
                    }
                    if (class474.field6580 != null) {
                        class474.field6580.method1904((byte) -114, class493.field6796);
                    }
                    class574.field8079 = null;
                    class164.field2097 = null;
                    class395.field5616 = null;
                    class156.field2030 = 0L;
                    class212.field2928 = null;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            class493.field6796.method621(-96);
            class395.field5616 = null;
            class212.field2928 = null;
            class20.field171 = 0;
            class164.field2097 = null;
            class574.field8079 = null;
        }
        return false;
    }
}
