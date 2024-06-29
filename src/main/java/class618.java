import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class618 implements Runnable {

    @OriginalMember(owner = "client!cp", name = "h", descriptor = "Ldm;")
    private class46 field8855 = new class46();

    @OriginalMember(owner = "client!cp", name = "e", descriptor = "Ljava/lang/Thread;")
    private Thread field8852 = new Thread(this);

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "I")
    public static int field8848;

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "I")
    public static int field8849;

    @OriginalMember(owner = "client!cp", name = "d", descriptor = "I")
    public static int field8851;

    @OriginalMember(owner = "client!cp", name = "f", descriptor = "I")
    public static int field8853;

    @OriginalMember(owner = "client!cp", name = "i", descriptor = "I")
    public static int field8856;

    @OriginalMember(owner = "client!cp", name = "j", descriptor = "I")
    public static int field8857;

    @OriginalMember(owner = "client!cp", name = "k", descriptor = "I")
    public static int field8858;

    @OriginalMember(owner = "client!cp", name = "g", descriptor = "Lm;")
    public static class163 field8854;

    @OriginalMember(owner = "client!cp", name = "c", descriptor = "[[Lmc;")
    public static class114[][] field8850;

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(I)V")
    public static void method3596(int arg0) {
        field8850 = null;
        field8854 = null;
        if (arg0 > -51) {
            field8854 = null;
        }
    }

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "(I)V")
    public final void method3597(int arg0) {
        field8848++;
        if (this.field8852 == null) {
            return;
        }
        this.method3600(10, new class176());
        if (arg0 != 0) {
            this.method3597(-68);
        }
        try {
            this.field8852.join();
        } catch (InterruptedException var2) {
        }
        this.field8852 = null;
    }

    @OriginalMember(owner = "client!cp", name = "run", descriptor = "()V")
    public final void run() {
        field8849++;
        while (true) {
            class46 var1 = this.field8855;
            class248 var3;
            synchronized (this.field8855) {
                class176 var2;
                for (var2 = this.field8855.method459(3553); var2 == null; var2 = this.field8855.method459(3553)) {
                    try {
                        this.field8855.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class248)) {
                    return;
                }
                var3 = (class248) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field3447).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field3448 = var5;
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(ILjava/lang/String;BLjava/lang/String;)V")
    public static final void method3598(int arg0, String arg1, byte arg2, String arg3) {
        field8858++;
        class40.field797 = 2;
        class320.field4337 = arg0;
        if (arg2 >= 18) {
            class403.method2406(false, (byte) 93, arg3, arg1);
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(Ljava/lang/String;I)Lnba;")
    public final class248 method3599(String arg0, int arg1) {
        field8853++;
        if (this.field8852 == null) {
            throw new IllegalStateException("");
        } else if (arg0 == null) {
            throw new IllegalArgumentException("");
        } else if (arg1 < 2) {
            return null;
        } else {
            class248 var3 = new class248(arg0);
            this.method3600(10, var3);
            return var3;
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(ILik;)V")
    private final void method3600(int arg0, class176 arg1) {
        field8857++;
        if (arg0 != 10) {
            method3602(-13, -102L, true, null);
        }
        class46 var3 = this.field8855;
        synchronized (this.field8855) {
            this.field8855.method463(arg1, -119);
            this.field8855.notify();
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIIIBI)V")
    public static final void method3601(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field8856++;
        if (arg4 <= 5) {
            method3601(-119, 44, 51, 88, (byte) 14, -108);
        }
        if (arg2 == arg3) {
            class218.method1408(61, arg1, arg0, arg3, arg5);
        } else if (class326.field4387 <= (arg5 - arg3) && arg3 + arg5 <= class596.field8621 && (arg0 - arg2) >= class264.field3687 && (arg0 + arg2) <= class591.field8435) {
            class562.method3204(arg3, arg5, arg0, 0, arg2, arg1);
        } else {
            class103.method732(arg3, arg2, arg1, arg5, 0, arg0);
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IJZLjava/lang/String;)V")
    public static final void method3602(int arg0, long arg1, boolean arg2, String arg3) {
        field8851++;
        if (arg2) {
            class645.method3717(arg0 - 702);
            if (class394.field5558.equals("")) {
                class111.field1721 = 39;
                return;
            }
        }
        class11 var5 = new class11(576);
        var5.method108((byte) -128, 10);
        var5.method84((int) (Math.random() * 65535.0D), (byte) -109);
        var5.method102(arg1, false);
        var5.method84(arg2 ? class507.field7090 : class517.field7259, (byte) -106);
        var5.method117(77, (int) (Math.random() * 9.9999999E7D));
        var5.method74(arg3, arg0 - 606);
        var5.method117(-115, (int) (Math.random() * 9.9999999E7D));
        if (arg2) {
            var5.method102(class639.method3697((byte) 80, class394.field5558), false);
            try {
                var5.method102(Long.parseLong(class395.field5620), false);
            } catch (Exception var6) {
                class111.field1721 = 39;
                return;
            }
        } else {
            var5.method117(76, (int) (Math.random() * 9.9999999E7D));
            var5.method117(arg0 ^ 0x239, (int) (Math.random() * 9.9999999E7D));
            var5.method117(arg0 - 516, (int) (Math.random() * 9.9999999E7D));
            var5.method117(arg0 - 678, (int) (Math.random() * 9.9999999E7D));
        }
        var5.method117(-126, (int) (Math.random() * 9.9999999E7D));
        var5.method64(class94.field1451, class615.field8835, 0);
        class479.field6754.field165 = 0;
        class479.field6754.method108((byte) -128, arg2 ? class21.field311.field6351 : class21.field308.field6351);
        class479.field6754.method84(var5.field165 + 28, (byte) -118);
        class479.field6754.method84(arg0, (byte) -128);
        class479.field6754.method108((byte) -128, class173.field2491);
        class479.field6754.method108((byte) -128, class163.field2363.field1720);
        class592.method3497((byte) 80, class479.field6754);
        class479.field6754.method87(var5.field138, 0, var5.field165, 18278);
        class111.field1721 = -3;
        class208.field2931 = 0;
        class440.field6262 = 0;
        class10.field109 = 1;
    }

    @OriginalMember(owner = "client!cp", name = "<init>", descriptor = "()V")
    public class618() {
        this.field8852.setDaemon(true);
        this.field8852.start();
    }
}
