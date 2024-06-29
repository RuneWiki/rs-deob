import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public class class284 implements Runnable {

    @OriginalMember(owner = "client!wt", name = "e", descriptor = "Ljw;")
    private class516 field4221 = new class271();

    @OriginalMember(owner = "client!wt", name = "x", descriptor = "Ljw;")
    private class516 field4240 = null;

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "[[I")
    public static int[][] field4218 = new int[128][128];

    @OriginalMember(owner = "client!wt", name = "m", descriptor = "Ljava/lang/String;")
    public static String field4229 = "";

    @OriginalMember(owner = "client!wt", name = "i", descriptor = "Lsb;")
    public static class266 field4225 = new class266(25, -1);

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "I")
    public static int field4217;

    @OriginalMember(owner = "client!wt", name = "c", descriptor = "I")
    public static int field4219;

    @OriginalMember(owner = "client!wt", name = "d", descriptor = "I")
    public static int field4220;

    @OriginalMember(owner = "client!wt", name = "g", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!wt", name = "h", descriptor = "I")
    public static int field4224;

    @OriginalMember(owner = "client!wt", name = "j", descriptor = "I")
    public static int field4226;

    @OriginalMember(owner = "client!wt", name = "k", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!wt", name = "l", descriptor = "I")
    public static int field4228;

    @OriginalMember(owner = "client!wt", name = "n", descriptor = "I")
    public static int field4230;

    @OriginalMember(owner = "client!wt", name = "o", descriptor = "I")
    public static int field4231;

    @OriginalMember(owner = "client!wt", name = "p", descriptor = "I")
    public static int field4232;

    @OriginalMember(owner = "client!wt", name = "q", descriptor = "I")
    public static int field4233;

    @OriginalMember(owner = "client!wt", name = "r", descriptor = "I")
    public static int field4234;

    @OriginalMember(owner = "client!wt", name = "t", descriptor = "I")
    public static int field4236;

    @OriginalMember(owner = "client!wt", name = "w", descriptor = "I")
    private int field4239;

    @OriginalMember(owner = "client!wt", name = "z", descriptor = "I")
    private int field4242;

    @OriginalMember(owner = "client!wt", name = "y", descriptor = "J")
    private long field4241;

    @OriginalMember(owner = "client!wt", name = "C", descriptor = "J")
    private long field4244;

    @OriginalMember(owner = "client!wt", name = "v", descriptor = "Lrd;")
    private class310 field4238;

    @OriginalMember(owner = "client!wt", name = "A", descriptor = "Ljava/lang/String;")
    private String field4243;

    @OriginalMember(owner = "client!wt", name = "s", descriptor = "Z")
    private boolean field4235;

    @OriginalMember(owner = "client!wt", name = "u", descriptor = "Z")
    private volatile boolean field4237;

    @OriginalMember(owner = "client!wt", name = "f", descriptor = "[Lf;")
    public static class702[] field4222;

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(I)Ljava/lang/String;")
    public final String method1872(int arg0) {
        field4223++;
        return arg0 <= 82 ? null : this.field4243;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(B)Z")
    public final synchronized boolean method1873(byte arg0) {
        if (arg0 != -74) {
            this.field4244 = 93L;
        }
        field4228++;
        return this.field4221.method1768(this.field4241, -109);
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(ILjw;)V")
    public final synchronized void method1874(int arg0, class516 arg1) {
        if (arg0 != -23547) {
            this.field4237 = false;
        }
        this.field4240 = this.field4221;
        field4231++;
        this.field4221 = arg1;
        this.field4241 = class525.method3074((byte) -101);
    }

    @OriginalMember(owner = "client!wt", name = "run", descriptor = "()V")
    public final void run() {
        while (!this.field4237) {
            long var1 = class525.method3074((byte) -101);
            synchronized (this) {
                try {
                    if (this.field4221 instanceof class271) {
                        this.field4221.method1763(this.field4235, (byte) -91);
                    } else {
                        this.field4239++;
                        long var4 = class525.method3074((byte) -101);
                        if (class623.field9017 == null || this.field4240 == null || this.field4240.method1770((byte) -127) == 0 || this.field4241 < var4 - ((long) this.field4240.method1770((byte) -37))) {
                            if (this.field4240 != null) {
                                this.field4235 = true;
                                this.field4240.method1765((byte) 88);
                                this.field4240 = null;
                            }
                            if (this.field4235) {
                                class278.method1836(true);
                                if (class623.field9017 != null) {
                                    class623.field9017.method42(0);
                                }
                            }
                            this.field4221.method1763(this.field4235 || class623.field9017 != null && class623.field9017.method159(), (byte) -91);
                        } else {
                            int var6 = (int) ((var4 - this.field4241) * 255L / (long) this.field4240.method1770((byte) -77));
                            int var7 = 255 - var6;
                            int var8 = var6 << 24 | 0xFFFFFF;
                            class278.method1836(true);
                            int var9 = var7 << 24 | 0xFFFFFF;
                            class623.field9017.method42(0);
                            class702 var10 = class623.field9017.method186(class506.field7173, class310.field4626, true);
                            class623.field9017.method1264(var10, 0);
                            this.field4240.method1763(true, (byte) -91);
                            class623.field9017.method111();
                            var10.method1743(0, 0, 0, var9, 1);
                            class623.field9017.method1264(var10, 0);
                            class623.field9017.method42(0);
                            this.field4221.method1763(true, (byte) -91);
                            class623.field9017.method111();
                            var10.method1743(0, 0, 0, var8, 1);
                        }
                        try {
                            if (class623.field9017 != null && !(this.field4221 instanceof class271)) {
                                class623.field9017.method63();
                            }
                        } catch (class105 var17) {
                            class374.method2357(var17.getMessage() + " (Recovered) " + class486.field6963.method1809(100), 121, var17);
                            class294.method1959((byte) 120, 0);
                        }
                    }
                    this.field4235 = false;
                } catch (Exception var18) {
                    continue;
                }
            }
            long var12 = class525.method3074((byte) -101);
            int var14 = (int) (var1 + 20L - var12);
            if (var14 > 0) {
                class185.method1354((long) var14, 10);
            }
        }
        field4217++;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(Lrd;IILjava/lang/String;J)V")
    public final synchronized void method1875(class310 arg0, int arg1, int arg2, String arg3, long arg4) {
        this.field4244 = arg4;
        if (arg1 != -22010) {
            this.method1882(123);
        }
        this.field4243 = arg3;
        this.field4242 = arg2;
        field4227++;
        this.field4238 = arg0;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(III)Z")
    public static final boolean method1876(int arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            field4230++;
            return (arg0 & 0x100) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "(I)I")
    public final int method1877(int arg0) {
        field4234++;
        if (this.field4238 == null) {
            return 0;
        }
        int var2 = this.field4238.method2024((byte) 100);
        if (this.field4238.field4601 && this.field4238.field4598 > this.field4242) {
            return this.field4242 + 1;
        } else if (var2 < 0 || var2 >= class636.field9176.length - 1) {
            return 100;
        } else if (this.field4238.field4591 == this.field4242) {
            return this.field4238.field4598;
        } else {
            if (arg0 != 128) {
                this.field4241 = -27L;
            }
            return this.field4238.field4591;
        }
    }

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "(B)V")
    public final void method1878(byte arg0) {
        this.field4237 = true;
        field4233++;
        if (arg0 > -84) {
            this.field4241 = 63L;
        }
    }

    @OriginalMember(owner = "client!wt", name = "c", descriptor = "(I)Lrd;")
    public final class310 method1879(int arg0) {
        int var2 = -92 % ((arg0 - 39) / 62);
        field4236++;
        return this.field4238;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(Z)V")
    public static void method1880(boolean arg0) {
        field4225 = null;
        field4218 = null;
        if (arg0) {
            field4222 = null;
            field4229 = null;
        }
    }

    @OriginalMember(owner = "client!wt", name = "c", descriptor = "(B)I")
    public final int method1881(byte arg0) {
        field4224++;
        return arg0 > -6 ? 22 : this.field4239;
    }

    @OriginalMember(owner = "client!wt", name = "d", descriptor = "(I)I")
    public final int method1882(int arg0) {
        if (arg0 != 25) {
            this.field4235 = false;
        }
        field4219++;
        return this.field4242;
    }

    @OriginalMember(owner = "client!wt", name = "d", descriptor = "(B)J")
    public final long method1883(byte arg0) {
        field4220++;
        if (arg0 != 64) {
            this.method1882(44);
        }
        return this.field4244;
    }

    @OriginalMember(owner = "client!wt", name = "e", descriptor = "(I)V")
    public final synchronized void method1884(int arg0) {
        int var2 = -69 / ((arg0 - 5) / 44);
        this.field4235 = true;
        field4226++;
    }
}
