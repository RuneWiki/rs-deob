import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class412 extends class174 {

    @OriginalMember(owner = "client!pg", name = "hb", descriptor = "Leq;")
    public class613 field6106;

    @OriginalMember(owner = "client!pg", name = "ib", descriptor = "Z")
    public static boolean field6107 = false;

    @OriginalMember(owner = "client!pg", name = "kb", descriptor = "[Ljava/lang/String;")
    public static String[] field6109 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!pg", name = "fb", descriptor = "I")
    public static int field6104;

    @OriginalMember(owner = "client!pg", name = "gb", descriptor = "I")
    public static int field6105;

    @OriginalMember(owner = "client!pg", name = "jb", descriptor = "I")
    public static int field6108;

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Lvda;)V", line = 4)
    public class412(class309 arg0) {
        super(arg0);
        this.field6106 = new class613(arg0);
        super.field2558 = new class622(super.field2518);
        super.field2527 = new class622(super.field2518);
        super.field2551 = new class622(super.field2518);
        super.field2525 = new class622(super.field2518);
        super.field2552 = new class622(super.field2518);
        super.field2544 = new class622(super.field2518);
        super.field2526 = new class622(super.field2518);
        super.field2570 = new class622(super.field2518);
        super.field2548 = new class622(super.field2518);
        super.field2567 = new class622(super.field2518);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)V", line = 24)
    public static final void method2496(int arg0, int arg1) {
        ++field6108;
        int var2 = 2 / ((61 - arg0) / 56);
        if (~arg1 == -38) {
            class212.field3108 = 3.0F;
        } else if (arg1 == 50) {
            class212.field3108 = 4.0F;
        } else if (~arg1 != -76) {
            if (arg1 == 100) {
                class212.field3108 = 8.0F;
            } else if (arg1 == 200) {
                class212.field3108 = 16.0F;
            }
        } else {
            class212.field3108 = 6.0F;
        }
        class378.field5562 = -1;
        class378.field5562 = -1;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V", line = 55)
    public final void method1197(byte arg0) {
        this.field6106 = new class613(super.field2518);
        ++field6105;
        if (arg0 >= -100) {
            method2496(-11, 109);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Loh;I)V", line = 69)
    public static final void method2497(class549 arg0, int arg1) {
        if (~class133.field2154 == ~arg0.field7688) {
            class509.field7067[arg0.field7640] = true;
        }
        ++field6104;
        if (arg1 <= 78) {
            field6107 = false;
        }
    }

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "(B)V", line = 85)
    public static void method2498(byte arg0) {
        if (arg0 == -95) {
            field6109 = null;
        }
    }
}
