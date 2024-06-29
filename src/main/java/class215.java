import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class215 implements Runnable {

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "Ltf;")
    private class248 field2962 = new class248();

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "I")
    public int field2967 = 0;

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "Z")
    private boolean field2972 = false;

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "Ljava/lang/Thread;")
    private Thread field2969;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "[I")
    public static int[] field2963 = new int[4096];

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "I")
    public static int field2960;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
    public static int field2961;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "I")
    public static int field2965;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
    public static int field2966;

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "I")
    public static int field2968;

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "I")
    public static int field2970;

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "I")
    public static int field2971;

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "I")
    public static int field2974;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "[I")
    public static int[] field2959;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V", line = 3)
    public static final void method1415(int arg0) {
        class320.method2088(-1);
        field2960++;
        if (arg0 != 587) {
            method1417(null, false);
        }
        class650.method3714(2, (byte) -122, class595.field8694.field6520, 22050);
        class227.field3184 = class130.method799(class30.field348, 22050, 0, false, class20.field197);
        class227.field3184.method168(class42.field457, -124);
        class321.field4651 = class130.method799(class30.field348, 2048, 1, false, class20.field197);
        class321.field4651.method168(class44.field469, 120);
    }

    @OriginalMember(owner = "client!kf", name = "run", descriptor = "()V", line = 20)
    public final void run() {
        field2965++;
        while (!this.field2972) {
            class248 var1 = this.field2962;
            class472 var2;
            synchronized (this.field2962) {
                var2 = (class472) this.field2962.method1645(93);
                if (var2 == null) {
                    try {
                        this.field2962.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field2967--;
            }
            try {
                if (var2.field6986 == 2) {
                    var2.field6990.method750((int) var2.field401, (byte) -128, var2.field6985, var2.field6985.length);
                } else if (var2.field6986 == 3) {
                    var2.field6985 = var2.field6990.method747((int) var2.field401, 1748413256);
                }
            } catch (Exception var6) {
                class630.method3607(7, var6, null);
            }
            var2.field9009 = false;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IBLls;)Lmd;", line = 65)
    public final class472 method1416(int arg0, byte arg1, class121 arg2) {
        field2970++;
        class472 var4 = new class472();
        var4.field6986 = 1;
        class248 var5 = this.field2962;
        synchronized (this.field2962) {
            if (arg1 != 109) {
                this.field2969 = null;
            }
            class472 var6 = (class472) this.field2962.method1644((byte) -127);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if ((long) arg0 == var6.field401 && var6.field6990 == arg2 && var6.field6986 == 2) {
                    var4.field9009 = false;
                    var4.field6985 = var6.field6985;
                    return var4;
                }
                var6 = (class472) this.field2962.method1642(0);
            }
        }
        var4.field6985 = arg2.method747(arg0, 1748413256);
        var4.field9008 = true;
        var4.field9009 = false;
        return var4;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Laj;Z)V", line = 99)
    public static final void method1417(class264 arg0, boolean arg1) {
        field2968++;
        if (!arg1) {
            class180.field2218 = arg0;
        }
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)V", line = 110)
    public final void method1418(int arg0) {
        this.field2972 = true;
        if (arg0 != 1) {
            return;
        }
        field2961++;
        class248 var2 = this.field2962;
        synchronized (this.field2962) {
            this.field2962.notifyAll();
        }
        try {
            this.field2969.join();
        } catch (InterruptedException var3) {
        }
        this.field2969 = null;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)V", line = 129)
    public static void method1419(byte arg0) {
        field2959 = null;
        field2963 = null;
        int var1 = -123 % ((arg0 + 20) / 42);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IZLls;)Lmd;", line = 143)
    public final class472 method1420(int arg0, boolean arg1, class121 arg2) {
        field2973++;
        class472 var4 = new class472();
        var4.field6990 = arg2;
        var4.field6986 = 3;
        var4.field401 = arg0;
        var4.field9008 = arg1;
        this.method1423(125, var4);
        return var4;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "([BILls;I)Lmd;", line = 159)
    public final class472 method1421(byte[] arg0, int arg1, class121 arg2, int arg3) {
        field2966++;
        class472 var5 = new class472();
        if (arg3 != -19912) {
            this.method1416(3, (byte) 72, null);
        }
        var5.field9008 = false;
        var5.field6985 = arg0;
        var5.field6986 = 2;
        var5.field6990 = arg2;
        var5.field401 = arg1;
        this.method1423(52, var5);
        return var5;
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Ltq;)V", line = 228)
    public class215(class545 arg0) {
        class175 var2 = arg0.method3177(5, 100, this);
        while (var2.field2138 == 0) {
            class646.method3696(1, 10L);
        }
        if (var2.field2138 == 2) {
            throw new RuntimeException();
        }
        this.field2969 = (Thread) var2.field2140;
    }

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "(I)[Lig;", line = 185)
    public static final class206[] method1422(int arg0) {
        field2964++;
        if (arg0 > -92) {
            field2963 = null;
        }
        return new class206[] { class359.field5093, class149.field1845, class218.field2994, class341.field4867, class596.field8713, class251.field3558, class515.field7511, class445.field6661, class616.field8957, class453.field6767, class98.field1154, class258.field3676, class528.field7650, class522.field7586, class140.field1731, class229.field3229, class16.field155, class461.field6872, class37.field407, class639.field9183, class327.field4717, class104.field1252, class119.field1490, class490.field7150, class155.field1924, class13.field112, class494.field7208, class107.field1279, class10.field84, class69.field747, class613.field8919, class327.field4719, class194.field2633, class310.field4563, class504.field7297, class213.field2928, class316.field4608, class384.field5786, class484.field7087, class628.field9070, class603.field8811, class162.field1990, class456.field6833, class605.field8860, class304.field4476, class490.field7144, class156.field1932, class133.field1671, class555.field7872, class329.field4741, class349.field5005, class346.field4953, class517.field7532, class17.field171, class123.field1535, class364.field5518, class475.field7022, class13.field107, class245.field3462, class544.field7776, class157.field1943, class509.field7409, class593.field8669, class225.field3177, class13.field114, class239.field3400, class402.field6086, class489.field7131, class566.field8077, class160.field1972, class337.field4820, class292.field4051, class385.field5883, class630.field9095, class22.field235, class174.field2136, class464.field6897, class495.field7235, class358.field5086, class299.field4412, class568.field8155, class651.field9391, class576.field8314, class304.field4473, class102.field1221, class596.field8714, class559.field7965, class564.field8044, class2.field13, class574.field8286, class309.field4553, class96.field1136, class456.field6830, class40.field442, class63.field713, class96.field1134, class600.field8759, class644.field9287, class418.field6295, class123.field1536, class488.field7113, class289.field4005, class91.field1052, class385.field5884, class547.field7833, class298.field4408, class445.field6664, class507.field7368, class543.field7768, class35.field394, class276.field3856, class271.field3796, class404.field6106, class58.field665, class331.field4765, class452.field6745, class637.field9163 };
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILmd;)V", line = 202)
    private final void method1423(int arg0, class472 arg1) {
        class248 var3 = this.field2962;
        synchronized (this.field2962) {
            this.field2962.method1646(72, arg1);
            this.field2967++;
            if (arg0 <= 38) {
                return;
            }
            this.field2962.notifyAll();
        }
        field2971++;
    }
}
