import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class class350 {

    @OriginalMember(owner = "client!br", name = "d", descriptor = "I")
    public static int field4712;

    @OriginalMember(owner = "client!br", name = "g", descriptor = "Ljm;")
    public static class162 field4715;

    @OriginalMember(owner = "client!br", name = "h", descriptor = "I")
    public static int field4716;

    @OriginalMember(owner = "client!br", name = "i", descriptor = "[B")
    public static byte[] field4717;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "I")
    public static int field4709;

    @OriginalMember(owner = "client!br", name = "b", descriptor = "I")
    public static int field4710;

    @OriginalMember(owner = "client!br", name = "c", descriptor = "I")
    public static int field4711;

    @OriginalMember(owner = "client!br", name = "e", descriptor = "I")
    public static int field4713;

    @OriginalMember(owner = "client!br", name = "f", descriptor = "I")
    public static int field4714;

    @OriginalMember(owner = "client!br", name = "j", descriptor = "I")
    public static int field4718;

    @OriginalMember(owner = "client!br", name = "k", descriptor = "I")
    public static int field4719;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(I)V")
    public static final void method2113(int arg0) {
        class191.method1321(25, 40);
        field4710++;
        class232.method1514((byte) 107);
        if (arg0 <= -103) {
            System.gc();
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(ILdn;)V")
    public static final void method2114(int arg0, class323 arg1) {
        class436.field6160[arg0] = arg1;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(B)V")
    public static final void method2115(byte arg0) {
        class422.method2607(5, 98);
        field4711++;
        class88.method700((byte) -96, 5);
        class405.method2503(5, 28152);
        class132.method986(1060698244, 5);
        class398.method2468((byte) 85, 5);
        class372.method2326((byte) 95, 5);
        class439.method2698(true, 5);
        class56.method442(5, (byte) 57);
        class436.method2685((byte) -97, 5);
        class429.method2646(53, 5);
        class62.method504((byte) 75, 5);
        class405.method2500((byte) -99, 5);
        class419.method2593(5, (byte) 30);
        class29.method278(5, (byte) 71);
        class341.method2080(-20063, 5);
        class303.method1836(5, false);
        class412.method2548(5, (byte) 4);
        class13.method63((byte) 127, 5);
        class311.method1881(5, (byte) -26);
        class392.method2434(29472, 5);
        class52.method423(50, 89);
        class406.method2508((byte) -110, 5);
        class281.method1765((byte) 122, 5);
        if (arg0 < 11) {
            field4716 = -45;
        }
        class446.field6251.method2531(5, 112);
        class416.field5767.method2531(5, 112);
        class92.field1291.method2531(5, 112);
        class412.field5729.method2531(5, 112);
        class172.field2477.method2531(5, 112);
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IZ)Z")
    public static final boolean method2116(int arg0, boolean arg1) {
        if (arg0 != 5) {
            field4716 = -23;
        }
        field4713++;
        boolean var2 = class354.field4765.method226();
        if (var2 == arg1) {
            return true;
        }
        if (!arg1) {
            class354.field4765.method209();
        } else if (!class354.field4765.method192()) {
            arg1 = false;
        }
        if (arg1 == var2) {
            return false;
        } else {
            class415.field5752 = arg1;
            class120.method934(-96, class122.field1839);
            return true;
        }
    }

    @OriginalMember(owner = "client!br", name = "b", descriptor = "(I)V")
    public static void method2117(int arg0) {
        field4715 = null;
        if (arg0 < 108) {
            method2118(99);
        }
        field4717 = null;
    }

    @OriginalMember(owner = "client!br", name = "c", descriptor = "(I)V")
    public static final void method2118(int arg0) {
        class408 var1 = class120.field1820;
        synchronized (class120.field1820) {
            class120.field1820.method2522((byte) 57);
        }
        field4709++;
        if (arg0 != 28412) {
            method2117(-117);
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IB)Lfk;")
    public static final class23 method2119(int arg0, byte arg1) {
        field4714++;
        if (arg1 != 52) {
            method2119(-70, (byte) -72);
        }
        if (arg0 == 0) {
            if ((double) class333.field4493 == 3.0D) {
                return class230.field3245;
            }
            if ((double) class333.field4493 == 4.0D) {
                return class445.field6238;
            }
            if ((double) class333.field4493 == 6.0D) {
                return class309.field4195;
            }
            if ((double) class333.field4493 >= 8.0D) {
                return class1.field4;
            }
        } else if (arg0 == 1) {
            if ((double) class333.field4493 == 3.0D) {
                return class309.field4195;
            }
            if ((double) class333.field4493 == 4.0D) {
                return class1.field4;
            }
            if ((double) class333.field4493 == 6.0D) {
                return class46.field588;
            }
            if ((double) class333.field4493 >= 8.0D) {
                return class2.field12;
            }
        } else if (arg0 == 2) {
            if ((double) class333.field4493 == 3.0D) {
                return class46.field588;
            }
            if ((double) class333.field4493 == 4.0D) {
                return class2.field12;
            }
            if ((double) class333.field4493 == 6.0D) {
                return class53.field683;
            }
            if ((double) class333.field4493 >= 8.0D) {
                return class55.field720;
            }
        }
        return null;
    }

    static {
        new class368(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.");
        field4712 = -1;
        field4715 = new class162();
        field4716 = 0;
        field4717 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };
    }
}
