import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class276 implements Runnable {

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "Lpo;")
    private class375 field4182 = new class375();

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "Z")
    private boolean field4187 = false;

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "I")
    public int field4185 = 0;

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "Ljava/lang/Thread;")
    private Thread field4186;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "I")
    public static int field4177;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "I")
    public static int field4178;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "I")
    public static int field4179;

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "I")
    public static int field4180;

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "I")
    public static int field4183;

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "I")
    public static int field4184;

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "I")
    public static int field4188;

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "[I")
    public static int[] field4181;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(BLvn;)V", line = 4)
    private final void method1674(byte arg0, class196 arg1) {
        class375 var3 = this.field4182;
        synchronized (this.field4182) {
            this.field4182.method2256(arg1, 30978);
            this.field4185++;
            this.field4182.notifyAll();
        }
        field4184++;
        if (arg0 < 7) {
            this.method1676(2, null, null, -126);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V", line = 20)
    public static void method1675(int arg0) {
        int var1 = -68 % ((arg0 + 47) / 34);
        field4181 = null;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILap;[BI)Lvn;", line = 30)
    public final class196 method1676(int arg0, class319 arg1, byte[] arg2, int arg3) {
        field4178++;
        class196 var5 = new class196();
        var5.field3924 = false;
        var5.field3091 = arg1;
        var5.field3839 = arg0;
        var5.field3093 = arg2;
        var5.field3094 = arg3;
        this.method1674((byte) 121, var5);
        return var5;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Z)V", line = 47)
    public final void method1677(boolean arg0) {
        this.field4187 = true;
        field4177++;
        class375 var2 = this.field4182;
        synchronized (this.field4182) {
            this.field4182.notifyAll();
        }
        if (arg0) {
            this.field4186 = null;
        }
        try {
            this.field4186.join();
        } catch (InterruptedException var3) {
        }
        this.field4186 = null;
    }

    @OriginalMember(owner = "client!mf", name = "run", descriptor = "()V", line = 71)
    public final void run() {
        field4183++;
        while (!this.field4187) {
            class375 var1 = this.field4182;
            class196 var2;
            synchronized (this.field4182) {
                var2 = (class196) this.field4182.method2254((byte) 125);
                if (var2 == null) {
                    try {
                        this.field4182.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field4185--;
            }
            try {
                if (var2.field3094 == 2) {
                    var2.field3091.method2000((int) var2.field3839, false, var2.field3093, var2.field3093.length);
                } else if (var2.field3094 == 3) {
                    var2.field3093 = var2.field3091.method1998((int) var2.field3839, 56);
                }
            } catch (Exception var6) {
                class32.method177(var6, (byte) -104, null);
            }
            var2.field3923 = false;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)I", line = 115)
    public static final int method1678(int arg0, int arg1) {
        if (arg0 != 4515) {
            method1678(-119, -80);
        }
        field4188++;
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(BLap;I)Lvn;", line = 126)
    public final class196 method1679(byte arg0, class319 arg1, int arg2) {
        field4180++;
        int var4 = 93 % ((arg0 - 37) / 45);
        class196 var5 = new class196();
        var5.field3094 = 3;
        var5.field3091 = arg1;
        var5.field3924 = false;
        var5.field3839 = arg2;
        this.method1674((byte) 34, var5);
        return var5;
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lhf;)V", line = 189)
    public class276(class260 arg0) {
        class180 var2 = arg0.method1579(5, this, 2);
        while (var2.field2802 == 0) {
            class414.method2437(10L, (byte) -122);
        }
        if (var2.field2802 == 2) {
            throw new RuntimeException();
        }
        this.field4186 = (Thread) var2.field2803;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lap;II)Lvn;", line = 147)
    public final class196 method1680(class319 arg0, int arg1, int arg2) {
        field4179++;
        class196 var4 = new class196();
        var4.field3094 = 1;
        int var5 = -91 / ((arg2 - 73) / 43);
        class375 var6 = this.field4182;
        synchronized (this.field4182) {
            class196 var7 = (class196) this.field4182.method2260((byte) 51);
            while (true) {
                if (var7 == null) {
                    break;
                }
                if (((long) arg1) == var7.field3839 && var7.field3091 == arg0 && var7.field3094 == 2) {
                    var4.field3923 = false;
                    var4.field3093 = var7.field3093;
                    return var4;
                }
                var7 = (class196) this.field4182.method2258(0);
            }
        }
        var4.field3093 = arg0.method1998(arg1, 124);
        var4.field3923 = false;
        var4.field3924 = true;
        return var4;
    }
}
