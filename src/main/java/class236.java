import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public class class236 extends class542 {

    @OriginalMember(owner = "client!tu", name = "n", descriptor = "I")
    private int field3339;

    @OriginalMember(owner = "client!tu", name = "p", descriptor = "I")
    private int field3341;

    @OriginalMember(owner = "client!tu", name = "r", descriptor = "I")
    private int field3343;

    @OriginalMember(owner = "client!tu", name = "l", descriptor = "I")
    private int field3337;

    @OriginalMember(owner = "client!tu", name = "o", descriptor = "[I")
    public static int[] field3340 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!tu", name = "h", descriptor = "I")
    public static int field3333;

    @OriginalMember(owner = "client!tu", name = "i", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!tu", name = "j", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!tu", name = "k", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!tu", name = "m", descriptor = "I")
    public static int field3338;

    @OriginalMember(owner = "client!tu", name = "q", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!tu", name = "s", descriptor = "[[S")
    public static short[][] field3344;

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(ILjava/lang/String;)V", line = 5)
    public static final void method1564(int arg0, String arg1) {
        ++field3334;
        if (arg1 != null) {
            if (arg1.startsWith("*")) {
                arg1 = arg1.substring(1);
            }
            String var2 = class467.method2808(-1, arg1);
            if (var2 != null) {
                for (int var3 = 0; ~class454.field6834 < ~var3; ++var3) {
                    String var4 = class466.field6946[var3];
                    if (var4.startsWith("*")) {
                        var4 = var4.substring(1);
                    }
                    String var5 = class467.method2808(arg0 + -186329901, var4);
                    if (var5 != null && var5.equals(var2)) {
                        --class454.field6834;
                        for (int var6 = var3; class454.field6834 > var6; ++var6) {
                            class466.field6946[var6] = class466.field6946[var6 + 1];
                            class64.field918[var6] = class64.field918[var6 + 1];
                            class241.field3394[var6] = class241.field3394[var6 + 1];
                            class11.field191[var6] = class11.field191[var6 + 1];
                            class388.field5933[var6] = class388.field5933[var6 - -1];
                            class271.field3766[var6] = class271.field3766[var6 + 1];
                        }
                        class114.field1586 = class145.field1932;
                        ++class323.field4675;
                        class424.method2582(class144.field1921, arg0 ^ -186329901);
                        class538.field7879.method1072((byte) 102, class436.method2652(arg1, (byte) -77));
                        class538.field7879.method1071(arg0 ^ -186339079, arg1);
                        break;
                    }
                }
                if (arg0 != 186329900) {
                    field3342 = 52;
                }
            }
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(IIB)V", line = 69)
    public final void method931(int arg0, int arg1, byte arg2) {
        ++field3336;
        if (arg2 != 0) {
            this.field3341 = -78;
        }
        int var4 = this.field3341 * arg0 >> 12;
        int var5 = this.field3339 * arg0 >> 12;
        int var6 = this.field3343 * arg1 >> 12;
        int var7 = this.field3337 * arg1 >> 12;
        class101.method664(true, var5, var4, var6, var7, super.field7926);
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(III)V", line = 90)
    public final void method928(int arg0, int arg1, int arg2) {
        ++field3338;
        if (arg0 != 21074) {
            method1566(-47);
        }
    }

    @OriginalMember(owner = "client!tu", name = "<init>", descriptor = "(IIIIII)V", line = 100)
    public class236(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field3339 = arg2;
        this.field3341 = arg0;
        this.field3343 = arg1;
        this.field3337 = arg3;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(IB)I", line = 114)
    public static final int method1565(int arg0, byte arg1) {
        int var2 = -69 % ((-43 - arg1) / 54);
        ++field3335;
        return 255 & arg0;
    }

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "(I)V", line = 124)
    public static void method1566(int arg0) {
        field3344 = null;
        field3340 = null;
        if (arg0 != -6522) {
            method1566(-100);
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(BII)V", line = 138)
    public final void method930(byte arg0, int arg1, int arg2) {
        ++field3333;
        if (arg0 > -107) {
            this.field3343 = 70;
        }
    }
}
