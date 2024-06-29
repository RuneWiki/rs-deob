import java.awt.Container;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uha")
public class class723 implements Runnable {

    @OriginalMember(owner = "client!uha", name = "r", descriptor = "Lbia;")
    private class409 field10153 = new class264();

    @OriginalMember(owner = "client!uha", name = "z", descriptor = "Lbia;")
    private class409 field10161 = null;

    @OriginalMember(owner = "client!uha", name = "d", descriptor = "I")
    public static int field10139 = 0;

    @OriginalMember(owner = "client!uha", name = "f", descriptor = "Laia;")
    public static class257 field10141 = new class257("WTRC", "office", "_rc", 1);

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "I")
    public static int field10136;

    @OriginalMember(owner = "client!uha", name = "b", descriptor = "I")
    public static int field10137;

    @OriginalMember(owner = "client!uha", name = "c", descriptor = "I")
    public static int field10138;

    @OriginalMember(owner = "client!uha", name = "e", descriptor = "I")
    public static int field10140;

    @OriginalMember(owner = "client!uha", name = "h", descriptor = "I")
    public static int field10143;

    @OriginalMember(owner = "client!uha", name = "i", descriptor = "I")
    public static int field10144;

    @OriginalMember(owner = "client!uha", name = "j", descriptor = "I")
    public static int field10145;

    @OriginalMember(owner = "client!uha", name = "k", descriptor = "I")
    public static int field10146;

    @OriginalMember(owner = "client!uha", name = "l", descriptor = "I")
    public static int field10147;

    @OriginalMember(owner = "client!uha", name = "m", descriptor = "I")
    public static int field10148;

    @OriginalMember(owner = "client!uha", name = "n", descriptor = "I")
    public static int field10149;

    @OriginalMember(owner = "client!uha", name = "o", descriptor = "I")
    public static int field10150;

    @OriginalMember(owner = "client!uha", name = "p", descriptor = "I")
    public static int field10151;

    @OriginalMember(owner = "client!uha", name = "q", descriptor = "I")
    public static int field10152;

    @OriginalMember(owner = "client!uha", name = "t", descriptor = "I")
    public static int field10155;

    @OriginalMember(owner = "client!uha", name = "u", descriptor = "I")
    public static int field10156;

    @OriginalMember(owner = "client!uha", name = "v", descriptor = "I")
    public static int field10157;

    @OriginalMember(owner = "client!uha", name = "B", descriptor = "I")
    private int field10163;

    @OriginalMember(owner = "client!uha", name = "C", descriptor = "I")
    private int field10164;

    @OriginalMember(owner = "client!uha", name = "w", descriptor = "J")
    private long field10158;

    @OriginalMember(owner = "client!uha", name = "x", descriptor = "J")
    private long field10159;

    @OriginalMember(owner = "client!uha", name = "A", descriptor = "Lps;")
    private class432 field10162;

    @OriginalMember(owner = "client!uha", name = "y", descriptor = "Ljava/lang/String;")
    private String field10160;

    @OriginalMember(owner = "client!uha", name = "g", descriptor = "Z")
    private volatile boolean field10142;

    @OriginalMember(owner = "client!uha", name = "s", descriptor = "Z")
    private boolean field10154;

    @OriginalMember(owner = "client!uha", name = "run", descriptor = "()V")
    public final void run() {
        field10146++;
        while (!this.field10142) {
            long var1 = class18.method109(-11121);
            synchronized (this) {
                try {
                    this.field10163++;
                    if (this.field10153 instanceof class264) {
                        this.field10153.method1767(this.field10154, 119);
                    } else {
                        long var4 = class18.method109(-11121);
                        if (class364.field5573 == null || this.field10161 == null || this.field10161.method1754(true) == 0 || this.field10158 < var4 - ((long) this.field10161.method1754(true))) {
                            if (this.field10161 != null) {
                                this.field10154 = true;
                                this.field10161.method1763((byte) 100);
                                this.field10161 = null;
                            }
                            if (this.field10154) {
                                class120.method944((byte) 111);
                                if (class364.field5573 != null) {
                                    class364.field5573.method1328(0);
                                }
                            }
                            this.field10153.method1767(this.field10154 || class364.field5573 != null && class364.field5573.method370(), 84);
                        } else {
                            int var6 = (int) ((var4 - this.field10158) * 255L / (long) this.field10161.method1754(true));
                            int var7 = 255 - var6;
                            int var8 = var6 << 24 | 0xFFFFFF;
                            class120.method944((byte) 54);
                            int var9 = var7 << 24 | 0xFFFFFF;
                            class364.field5573.method1328(0);
                            class34 var10 = class364.field5573.method406(class660.field9408, class412.field6066, true);
                            class364.field5573.method3184(var10, (byte) -119);
                            this.field10161.method1767(true, 97);
                            class364.field5573.method1274();
                            var10.method48(0, 0, 0, var9, 1);
                            class364.field5573.method3184(var10, (byte) 46);
                            class364.field5573.method1328(0);
                            this.field10153.method1767(true, 58);
                            class364.field5573.method1274();
                            var10.method48(0, 0, 0, var8, 1);
                        }
                        try {
                            if (class364.field5573 != null && !(this.field10153 instanceof class264)) {
                                class364.field5573.method3193(0);
                            }
                        } catch (class556 var18) {
                            class333.method2135(var18, var18.getMessage() + " (Recovered) " + class52.field834.method2736(0), -123);
                            class526.method3125(1221653740, 0, true);
                        }
                    }
                    Container var12;
                    if (class530.field7619 != null) {
                        var12 = class530.field7619;
                    } else if (class351.field5138 == null) {
                        var12 = class690.field9800;
                    } else {
                        var12 = class351.field5138;
                    }
                    var12.getSize();
                    var12.getSize();
                    if (class530.field7619 == var12) {
                        class530.field7619.getInsets();
                    }
                    this.field10154 = false;
                    if (class364.field5573 != null && !(this.field10153 instanceof class264) && this.field10162.method2683((byte) 66) < class432.field6331.method2683((byte) 66)) {
                        class15.method83((byte) -127);
                    }
                } catch (Exception var19) {
                    continue;
                }
            }
            long var13 = class18.method109(-11121);
            int var15 = (int) (var1 - (var13 - 20L));
            if (var15 > 0) {
                class484.method2932(true, (long) var15);
            }
        }
    }

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(I)V")
    public final void method3977(int arg0) {
        this.field10142 = true;
        if (arg0 != -15785) {
            this.field10153 = null;
        }
        field10143++;
    }

    @OriginalMember(owner = "client!uha", name = "b", descriptor = "(I)Ljava/lang/String;")
    public final String method3978(int arg0) {
        field10136++;
        int var2 = -3 % ((arg0 - 50) / 45);
        return this.field10160;
    }

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(ZLbia;)V")
    public final synchronized void method3979(boolean arg0, class409 arg1) {
        this.field10161 = this.field10153;
        field10145++;
        this.field10153 = arg1;
        this.field10158 = class18.method109(-11121);
        if (arg0) {
            method3987(null, (byte) 96);
        }
    }

    @OriginalMember(owner = "client!uha", name = "c", descriptor = "(I)Z")
    public final synchronized boolean method3980(int arg0) {
        field10140++;
        if (arg0 != 31225) {
            this.field10142 = true;
        }
        return this.field10153.method1762(-31640, this.field10158);
    }

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(Z)I")
    public final int method3981(boolean arg0) {
        field10157++;
        if (!arg0) {
            this.method3990(99L, (byte) 119, 124, null, null);
        }
        return this.field10164;
    }

    @OriginalMember(owner = "client!uha", name = "d", descriptor = "(I)V")
    public final synchronized void method3982(int arg0) {
        this.field10154 = true;
        if (arg0 != 1) {
            this.field10161 = null;
        }
        field10138++;
    }

    @OriginalMember(owner = "client!uha", name = "e", descriptor = "(I)I")
    public final int method3983(int arg0) {
        field10152++;
        if (this.field10162 == null) {
            return 0;
        }
        int var2 = this.field10162.method2683((byte) 66);
        if (arg0 != -30449) {
            method3988(6, null, -78);
        }
        if (this.field10162.field6307 && this.field10162.field6312 > this.field10164) {
            return this.field10164 + 1;
        } else if (var2 >= 0 && var2 < class612.field8628.length - 1) {
            return this.field10162.field6308 == this.field10164 ? this.field10162.field6312 : this.field10162.field6308;
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(B)V")
    public static void method3984(byte arg0) {
        field10141 = null;
        int var1 = 62 / ((1 - arg0) / 45);
    }

    @OriginalMember(owner = "client!uha", name = "b", descriptor = "(Z)Lps;")
    public final class432 method3985(boolean arg0) {
        field10151++;
        return arg0 ? this.field10162 : null;
    }

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;Z)V")
    public static final void method3986(byte arg0, String arg1, String arg2, boolean arg3) {
        int var4 = 86 / ((arg0 + 30) / 51);
        field10137++;
        class18.field190 = arg2;
        class678.field9561 = arg3;
        class1.field4 = arg1;
        if (!class678.field9561 && class1.field4.equals("") || class18.field190.equals("")) {
            class129.method1045(127, 3);
            return;
        }
        class612.field8625 = false;
        if (class377.field5674 != 1) {
            class564.field7997 = -1;
            class3.field19 = 0;
        }
        class129.method1045(124, -3);
        class714.field10032 = 1;
        class116.field1800 = 0;
        class694.field9839 = 0;
    }

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(Lha;B)V")
    public static final void method3987(class544 arg0, byte arg1) {
        field10147++;
        class236.field3788 = class702.method3896(arg1 - 170, class424.field6234, arg0, true);
        class570.field8090 = method3988(-29123, arg0, class424.field6234);
        class74.field1105 = class702.method3896(arg1 - 212, class715.field10041, arg0, true);
        class594.field8343 = method3988(arg1 - 29224, arg0, class715.field10041);
        class257.field4034 = class702.method3896(-59, class719.field10082, arg0, true);
        if (arg1 == 101) {
            class632.field8881 = method3988(-29123, arg0, class719.field10082);
        }
    }

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(ILha;I)Lpia;")
    public static final class54 method3988(int arg0, class544 arg1, int arg2) {
        if (arg0 != -29123) {
            field10141 = null;
        }
        field10150++;
        class484 var3 = class592.method3393((byte) -97, true, arg1, arg2);
        return var3 == null ? null : var3.field6992;
    }

    @OriginalMember(owner = "client!uha", name = "b", descriptor = "(B)I")
    public final int method3989(byte arg0) {
        field10144++;
        if (arg0 != -99) {
            this.method3991(true);
        }
        return this.field10163;
    }

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(JBILps;Ljava/lang/String;)V")
    public final synchronized void method3990(long arg0, byte arg1, int arg2, class432 arg3, String arg4) {
        field10156++;
        this.field10164 = arg2;
        int var7 = 110 % ((arg1 + 14) / 48);
        this.field10159 = arg0;
        this.field10162 = arg3;
        this.field10160 = arg4;
    }

    @OriginalMember(owner = "client!uha", name = "c", descriptor = "(Z)J")
    public final long method3991(boolean arg0) {
        if (!arg0) {
            method3986((byte) 13, null, null, false);
        }
        field10148++;
        return this.field10159;
    }
}
