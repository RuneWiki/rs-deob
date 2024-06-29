import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bha")
public class class299 extends class288 {

    @OriginalMember(owner = "client!bha", name = "r", descriptor = "I")
    private int field4079 = 0;

    @OriginalMember(owner = "client!bha", name = "o", descriptor = "Llc;")
    public static class435 field4076 = new class435(23, -2);

    @OriginalMember(owner = "client!bha", name = "s", descriptor = "Lmr;")
    public static class611 field4080 = new class611();

    @OriginalMember(owner = "client!bha", name = "t", descriptor = "Llc;")
    public static class435 field4081 = new class435(112, -1);

    @OriginalMember(owner = "client!bha", name = "w", descriptor = "[I")
    public static int[] field4084 = new int[8];

    @OriginalMember(owner = "client!bha", name = "u", descriptor = "F")
    public static float field4082;

    @OriginalMember(owner = "client!bha", name = "n", descriptor = "I")
    public static int field4075;

    @OriginalMember(owner = "client!bha", name = "p", descriptor = "I")
    public static int field4077;

    @OriginalMember(owner = "client!bha", name = "q", descriptor = "I")
    public static int field4078;

    @OriginalMember(owner = "client!bha", name = "v", descriptor = "Ljk;")
    public static class183 field4083;

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(I)V", line = 3)
    public static void method1861(int arg0) {
        if (arg0 != 2) {
            field4080 = null;
        }
        field4083 = null;
        field4080 = null;
        field4081 = null;
        field4076 = null;
        field4084 = null;
    }

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(IIB)Z", line = 17)
    public static final boolean method1862(int arg0, int arg1, byte arg2) {
        ++field4075;
        if (arg2 != 21) {
            method1861(91);
        }
        return ~(arg1 & 2048) != -1 && (arg0 & 55) != 0;
    }

    @OriginalMember(owner = "client!bha", name = "<init>", descriptor = "(Lla;Lpia;)V", line = 85)
    public class299(class423 arg0, class56 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(ZB)V", line = 40)
    public final void method678(boolean arg0, byte arg1) {
        if (arg1 != -53) {
            this.method678(false, (byte) -90);
        }
        ++field4077;
        int var3 = super.field4005.field7959.method71(class758.field10546, (byte) 74, super.field3997.method784()) - -super.field4005.field7961;
        int var4 = super.field4005.field7955.method995(super.field3997.method780(), class544.field7915, (byte) 117) - -super.field4005.field7956;
        super.field3997.method3134((float) (super.field3997.method784() / 2 + var3), (float) (var4 + super.field3997.method780() / 2), 4096, this.field4079);
        this.field4079 += ((class56) super.field4005).field959;
    }

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(IIII)V", line = 57)
    public static final void method1863(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 * class243.field3580.field7980.method3577(false) >> 8;
        ++field4078;
        if (arg3 == -1 && !class509.field7381) {
            class547.method3295(104);
        } else if (arg3 != -1 && (~class428.field6173 != ~arg3 || !class236.method1649(3029)) && var4 != 0 && !class509.field7381) {
            class285.method1818(arg2, var4, class505.field7338, (byte) -21, arg3, 0, false);
            class303.method1894(0);
        }
        int var5 = 16 % ((arg0 - -47) / 60);
        if (~class428.field6173 != ~arg3) {
            class4.field32 = null;
        }
        class428.field6173 = arg3;
    }
}
