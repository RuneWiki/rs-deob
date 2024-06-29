import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oga")
public class class442 implements Runnable {

    @OriginalMember(owner = "client!oga", name = "n", descriptor = "Lib;")
    private class143 field5561 = new class571();

    @OriginalMember(owner = "client!oga", name = "p", descriptor = "Lib;")
    private class143 field5563 = null;

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "I")
    public static int field5548 = 0;

    @OriginalMember(owner = "client!oga", name = "l", descriptor = "Lhm;")
    public static class208 field5559 = new class208(260);

    @OriginalMember(owner = "client!oga", name = "y", descriptor = "I")
    public static int field5572 = 0;

    @OriginalMember(owner = "client!oga", name = "b", descriptor = "I")
    public static int field5549;

    @OriginalMember(owner = "client!oga", name = "c", descriptor = "I")
    public static int field5550;

    @OriginalMember(owner = "client!oga", name = "d", descriptor = "I")
    public static int field5551;

    @OriginalMember(owner = "client!oga", name = "f", descriptor = "I")
    public static int field5553;

    @OriginalMember(owner = "client!oga", name = "g", descriptor = "I")
    public static int field5554;

    @OriginalMember(owner = "client!oga", name = "h", descriptor = "I")
    public static int field5555;

    @OriginalMember(owner = "client!oga", name = "j", descriptor = "I")
    public static int field5557;

    @OriginalMember(owner = "client!oga", name = "k", descriptor = "I")
    public static int field5558;

    @OriginalMember(owner = "client!oga", name = "m", descriptor = "I")
    public static int field5560;

    @OriginalMember(owner = "client!oga", name = "o", descriptor = "I")
    public static int field5562;

    @OriginalMember(owner = "client!oga", name = "q", descriptor = "I")
    public static int field5564;

    @OriginalMember(owner = "client!oga", name = "r", descriptor = "I")
    public static int field5565;

    @OriginalMember(owner = "client!oga", name = "u", descriptor = "I")
    private int field5568;

    @OriginalMember(owner = "client!oga", name = "w", descriptor = "I")
    private int field5570;

    @OriginalMember(owner = "client!oga", name = "z", descriptor = "I")
    public static int field5573;

    @OriginalMember(owner = "client!oga", name = "v", descriptor = "J")
    private long field5569;

    @OriginalMember(owner = "client!oga", name = "x", descriptor = "J")
    private long field5571;

    @OriginalMember(owner = "client!oga", name = "s", descriptor = "Lkk;")
    private class179 field5566;

    @OriginalMember(owner = "client!oga", name = "t", descriptor = "Ljava/lang/String;")
    private String field5567;

    @OriginalMember(owner = "client!oga", name = "e", descriptor = "Z")
    private volatile boolean field5552;

    @OriginalMember(owner = "client!oga", name = "i", descriptor = "Z")
    private boolean field5556;

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(I)V")
    public static void method2420(int arg0) {
        if (arg0 != -9723) {
            field5572 = -123;
        }
        field5559 = null;
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(II)Lrr;")
    public static final class337 method2421(int arg0, int arg1) {
        if (arg1 <= 50) {
            field5548 = 5;
        }
        field5550++;
        int var2 = arg0 >> 16;
        int var3 = arg0 & 0xFFFF;
        if (class325.field4062[var2] == null || class325.field4062[var2][var3] == null) {
            boolean var4 = class409.method2299((byte) -123, var2);
            if (!var4) {
                return null;
            }
        }
        return class325.field4062[var2][var3];
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(JLjava/lang/String;BLkk;I)V")
    public final synchronized void method2422(long arg0, String arg1, byte arg2, class179 arg3, int arg4) {
        this.field5567 = arg1;
        this.field5566 = arg3;
        this.field5570 = arg4;
        int var7 = 30 % ((arg2 - 52) / 40);
        this.field5569 = arg0;
        field5573++;
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(BLib;)V")
    public final synchronized void method2423(byte arg0, class143 arg1) {
        int var3 = -105 % ((-arg0 - 46) / 61);
        field5553++;
        this.field5563 = this.field5561;
        this.field5561 = arg1;
        this.field5571 = class321.method1854(-43);
    }

    @OriginalMember(owner = "client!oga", name = "b", descriptor = "(I)I")
    public final int method2424(int arg0) {
        if (arg0 < 70) {
            method2421(-60, 118);
        }
        field5554++;
        return this.field5568;
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(B)I")
    public final int method2425(byte arg0) {
        if (arg0 <= 75) {
            return 14;
        } else {
            field5562++;
            return this.field5570;
        }
    }

    @OriginalMember(owner = "client!oga", name = "c", descriptor = "(I)Lkk;")
    public final class179 method2426(int arg0) {
        field5557++;
        return arg0 == -6221 ? this.field5566 : null;
    }

    @OriginalMember(owner = "client!oga", name = "d", descriptor = "(I)V")
    public final void method2427(int arg0) {
        if (arg0 != -15766) {
            this.field5556 = true;
        }
        field5565++;
        this.field5552 = true;
    }

    @OriginalMember(owner = "client!oga", name = "e", descriptor = "(I)V")
    public final synchronized void method2428(int arg0) {
        field5555++;
        this.field5556 = true;
        if (arg0 < 27) {
            this.method2429((byte) -17);
        }
    }

    @OriginalMember(owner = "client!oga", name = "b", descriptor = "(B)Ljava/lang/String;")
    public final String method2429(byte arg0) {
        if (arg0 >= -39) {
            field5559 = null;
        }
        field5549++;
        return this.field5567;
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(Z)I")
    public final int method2430(boolean arg0) {
        field5564++;
        if (this.field5566 == null) {
            return 0;
        } else if (arg0) {
            int var2 = this.field5566.method1060(9);
            if (this.field5566.field2088 && this.field5566.field2094 > this.field5570) {
                return this.field5570 + 1;
            } else if (var2 >= 0 && (class510.field6384.length - 1) > var2) {
                return this.field5566.field2085 == this.field5570 ? this.field5566.field2094 : this.field5566.field2085;
            } else {
                return 100;
            }
        } else {
            return -82;
        }
    }

    @OriginalMember(owner = "client!oga", name = "f", descriptor = "(I)J")
    public final long method2431(int arg0) {
        field5560++;
        return arg0 < 11 ? 1L : this.field5569;
    }

    @OriginalMember(owner = "client!oga", name = "g", descriptor = "(I)Z")
    public final synchronized boolean method2432(int arg0) {
        if (arg0 == 65535) {
            field5558++;
            return this.field5561.method902(this.field5571, 126);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!oga", name = "run", descriptor = "()V")
    public final void run() {
        while (!this.field5552) {
            long var1 = class321.method1854(-14);
            synchronized (this) {
                try {
                    if (this.field5561 instanceof class571) {
                        this.field5561.method900(this.field5556, true);
                    } else {
                        this.field5568++;
                        long var4 = class321.method1854(-24);
                        if (class309.field3898 == null || this.field5563 == null || this.field5563.method904(-26721) == 0 || this.field5571 < (var4 - (long) this.field5563.method904(-26721))) {
                            if (this.field5563 != null) {
                                this.field5556 = true;
                                this.field5563.method903((byte) 67);
                                this.field5563 = null;
                            }
                            if (this.field5556) {
                                class215.method1251(110);
                                if (class309.field3898 != null) {
                                    class309.field3898.method315(0);
                                }
                            }
                            this.field5561.method900(this.field5556 || class309.field3898 != null && class309.field3898.method404(), true);
                        } else {
                            int var6 = (int) ((var4 - this.field5571) * 255L / (long) this.field5563.method904(-26721));
                            int var7 = 255 - var6;
                            int var8 = var6 << 24 | 0xFFFFFF;
                            class215.method1251(117);
                            int var9 = var7 << 24 | 0xFFFFFF;
                            class309.field3898.method315(0);
                            class468 var10 = class309.field3898.method441(class309.field3890, class491.field6129, true);
                            class309.field3898.method3628(var10, (byte) 42);
                            this.field5563.method900(true, true);
                            class309.field3898.method336();
                            var10.method1543(0, 0, 0, var9, 1);
                            class309.field3898.method3628(var10, (byte) -112);
                            class309.field3898.method315(0);
                            this.field5561.method900(true, true);
                            class309.field3898.method336();
                            var10.method1543(0, 0, 0, var8, 1);
                        }
                        try {
                            if (class309.field3898 != null && !(this.field5561 instanceof class571)) {
                                class309.field3898.method318();
                            }
                        } catch (class202 var17) {
                            class564.method2994((byte) 34, var17.getMessage() + " (Recovered) " + class455.field5687.method1204(992), var17);
                            class364.method2114(0, 111);
                        }
                    }
                    this.field5556 = false;
                } catch (Exception var18) {
                    continue;
                }
            }
            long var12 = class321.method1854(-96);
            int var14 = (int) (var1 + 20L - var12);
            if (var14 > 0) {
                class700.method3867(29279, (long) var14);
            }
        }
        field5551++;
    }
}
