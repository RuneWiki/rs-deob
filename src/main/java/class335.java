import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class335 extends class477 {

    @OriginalMember(owner = "client!rk", name = "n", descriptor = "Z")
    public static boolean field4290 = false;

    @OriginalMember(owner = "client!rk", name = "k", descriptor = "Lpi;")
    public static class340 field4287 = new class340(34, 6);

    @OriginalMember(owner = "client!rk", name = "j", descriptor = "I")
    public static int field4286;

    @OriginalMember(owner = "client!rk", name = "l", descriptor = "I")
    public static int field4288;

    @OriginalMember(owner = "client!rk", name = "m", descriptor = "I")
    public static int field4289;

    @OriginalMember(owner = "client!rk", name = "o", descriptor = "I")
    public static int field4291;

    @OriginalMember(owner = "client!rk", name = "p", descriptor = "I")
    public static int field4292;

    @OriginalMember(owner = "client!rk", name = "q", descriptor = "I")
    public static int field4293;

    @OriginalMember(owner = "client!rk", name = "r", descriptor = "I")
    public static int field4294;

    @OriginalMember(owner = "client!rk", name = "s", descriptor = "I")
    public static int field4295;

    @OriginalMember(owner = "client!rk", name = "t", descriptor = "I")
    public static int field4296;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(B)Z", line = 3)
    public final boolean method264(byte arg0) {
        ++field4296;
        if (arg0 < 45) {
            this.method272((byte) -66, -66, -16);
        }
        return true;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(II)I", line = 14)
    public static final int method1987(int arg0, int arg1) {
        ++field4292;
        return arg1 != 127 ? 16 : 127 & arg0;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Z)V", line = 26)
    public static void method1988(boolean arg0) {
        field4287 = null;
        if (!arg0) {
            method1988(true);
        }
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(B)V", line = 36)
    public final void method269(byte arg0) {
        if (arg0 != 126) {
            field4290 = true;
        }
        super.field6964.method2745((byte) -6, false);
        ++field4288;
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Lgk;)V", line = 49)
    public class335(class463 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(BII)V", line = 52)
    public final void method272(byte arg0, int arg1, int arg2) {
        ++field4293;
        if (arg0 < 33) {
            this.method266((class31) null, 117, -65);
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lrh;II)V", line = 68)
    public final void method266(class31 arg0, int arg1, int arg2) {
        super.field6964.method2771(arg0, -16785);
        ++field4289;
        super.field6964.method2739(arg2, 0);
        if (arg1 != -11) {
            field4295 = 14;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 80)
    public static final void method1989(String arg0, int arg1) {
        ++field4291;
        if (class515.field7573) {
            boolean var2 = false;
            int var3 = class206.field2684;
            int[] var4 = class143.field1892;
            for (int var5 = 0; ~var3 < ~var5; ++var5) {
                class518 var6 = class76.field952[var4[var5]];
                if (var6 != null && class37.field573 != var6 && var6.field7630 != null && var6.field7630.equalsIgnoreCase(arg0)) {
                    ++class459.field6417;
                    class420.method2472((byte) -101, class294.field3804);
                    class319.field4112.method566(-12633, var4[var5]);
                    class319.field4112.method609(class315.field4065, -125);
                    class319.field4112.method559(0, (byte) 107);
                    class319.field4112.method572(-108, class172.field2229);
                    class319.field4112.method560(false, class206.field2687);
                    var2 = true;
                    class411.method2431(var6.method2342(10804), 0, true, var6.method2342(10804), -1, var6.field5251[0], var6.field5246[0], 0, -2);
                    break;
                }
            }
            if (!var2) {
                class360.method2120(class499.field7343.method1127(class379.field4920, false) + arg0, arg1 + -27096);
            }
            if (arg1 != 27184) {
                field4295 = -23;
            }
            if (class515.field7573) {
                class356.method2082(arg1 ^ -27185);
            }
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ZI)V", line = 130)
    public final void method271(boolean arg0, int arg1) {
        ++field4286;
        if (arg1 != -13) {
            field4290 = true;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ZZ)V", line = 140)
    public final void method270(boolean arg0, boolean arg1) {
        if (!arg0) {
            this.method264((byte) -24);
        }
        ++field4294;
        super.field6964.method2745((byte) -6, true);
    }
}
