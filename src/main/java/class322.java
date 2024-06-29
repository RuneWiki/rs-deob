import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public class class322 extends class245 {

    @OriginalMember(owner = "client!es", name = "u", descriptor = "I")
    private int field4441;

    @OriginalMember(owner = "client!es", name = "n", descriptor = "I")
    private int field4434;

    @OriginalMember(owner = "client!es", name = "o", descriptor = "I")
    private int field4435;

    @OriginalMember(owner = "client!es", name = "m", descriptor = "I")
    private int field4433;

    @OriginalMember(owner = "client!es", name = "p", descriptor = "I")
    public static int field4436;

    @OriginalMember(owner = "client!es", name = "q", descriptor = "I")
    public static int field4437;

    @OriginalMember(owner = "client!es", name = "r", descriptor = "I")
    public static int field4438;

    @OriginalMember(owner = "client!es", name = "s", descriptor = "I")
    public static int field4439;

    @OriginalMember(owner = "client!es", name = "t", descriptor = "I")
    public static int field4440;

    @OriginalMember(owner = "client!es", name = "v", descriptor = "I")
    public static int field4442;

    @OriginalMember(owner = "client!es", name = "w", descriptor = "I")
    public static int field4443;

    @OriginalMember(owner = "client!es", name = "x", descriptor = "I")
    public static int field4444;

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(BII)V", line = 3)
    public final void method1352(byte arg0, int arg1, int arg2) {
        ++field4442;
        int var4 = this.field4435 * arg1 >> 12;
        int var5 = this.field4434 * arg1 >> 12;
        int var6 = this.field4433 * arg2 >> 12;
        int var7 = 1 / ((43 - arg0) / 54);
        int var8 = this.field4441 * arg2 >> 12;
        class132.method917(var6, var5, 11467, var4, var8, super.field3526);
    }

    @OriginalMember(owner = "client!es", name = "b", descriptor = "(III)V", line = 23)
    public final void method1351(int arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            ++field4439;
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(BLkda;Lkda;Ltca;Lkda;)Z", line = 36)
    public static final boolean method1937(byte arg0, class328 arg1, class328 arg2, class150 arg3, class328 arg4) {
        class336.field4652 = arg2;
        class390.field5379 = arg1;
        class129.field1796 = arg3;
        ++field4437;
        if (arg0 != 75) {
            method1938(74, -23);
        }
        class371.field5102 = arg4;
        return true;
    }

    @OriginalMember(owner = "client!es", name = "<init>", descriptor = "(IIIIIII)V", line = 56)
    public class322(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field4441 = arg3;
        this.field4434 = arg2;
        this.field4435 = arg0;
        this.field4433 = arg1;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(II)I", line = 68)
    public static final int method1938(int arg0, int arg1) {
        int var7 = arg0 - 1;
        ++field4438;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        if (arg1 < 35) {
            field4443 = -69;
        }
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(IBI)V", line = 89)
    public final void method1350(int arg0, byte arg1, int arg2) {
        ++field4436;
        int var4 = this.field4435 * arg2 >> 12;
        int var5 = this.field4434 * arg2 >> 12;
        int var6 = this.field4433 * arg0 >> 12;
        int var7 = -63 / ((arg1 - -23) / 57);
        int var8 = this.field4441 * arg0 >> 12;
        class510.method3036(var5, 8, var8, var4, super.field3526, var6, super.field3529, super.field3527);
    }
}
