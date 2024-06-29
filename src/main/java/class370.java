import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class370 extends class509 {

    @OriginalMember(owner = "client!ub", name = "u", descriptor = "J")
    public static long field5346 = 0L;

    @OriginalMember(owner = "client!ub", name = "z", descriptor = "I")
    public static int field5351 = 0;

    @OriginalMember(owner = "client!ub", name = "q", descriptor = "I")
    public static int field5342;

    @OriginalMember(owner = "client!ub", name = "s", descriptor = "I")
    public static int field5344;

    @OriginalMember(owner = "client!ub", name = "v", descriptor = "I")
    public static int field5347;

    @OriginalMember(owner = "client!ub", name = "w", descriptor = "I")
    public static int field5348;

    @OriginalMember(owner = "client!ub", name = "x", descriptor = "I")
    public static int field5349;

    @OriginalMember(owner = "client!ub", name = "y", descriptor = "I")
    public static int field5350;

    @OriginalMember(owner = "client!ub", name = "A", descriptor = "I")
    public static int field5352;

    @OriginalMember(owner = "client!ub", name = "B", descriptor = "I")
    public static int field5353;

    @OriginalMember(owner = "client!ub", name = "r", descriptor = "Ljava/lang/Object;")
    public static Object field5343;

    @OriginalMember(owner = "client!ub", name = "t", descriptor = "[I")
    public static int[] field5345;

    @OriginalMember(owner = "client!ub", name = "C", descriptor = "[I")
    public static int[] field5354;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIZIIII)V")
    public static final void method2256(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field5342;
        int var7 = arg4 - arg1;
        int var8 = arg1 + arg5;
        if (!arg2) {
            field5346 = 32L;
        }
        for (int var9 = arg5; var8 > var9; ++var9) {
            class69.method418(arg3, class47.field558[var9], arg6, (byte) 117, arg0);
        }
        int var10 = arg0 + arg1;
        for (int var11 = arg4; ~var7 > ~var11; --var11) {
            class69.method418(arg3, class47.field558[var11], arg6, (byte) 117, arg0);
        }
        int var12 = arg6 - arg1;
        for (int var13 = var8; ~var13 >= ~var7; ++var13) {
            int[] var14 = class47.field558[var13];
            class69.method418(arg3, var14, var10, (byte) 117, arg0);
            class69.method418(arg3, var14, arg6, (byte) 117, var12);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZB)V")
    public final void method35(boolean arg0, byte arg1) {
        super.field7558.method1139(true, 4);
        int var3 = -78 % ((arg1 - 40) / 36);
        ++field5350;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)V")
    public final void method38(byte arg0) {
        if (arg0 != 59) {
            field5343 = null;
        }
        super.field7558.method1139(false, 4);
        ++field5348;
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Lkw;)V")
    public class370(class174 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IBI)V")
    public final void method43(int arg0, byte arg1, int arg2) {
        ++field5352;
        if (arg1 != -60) {
            method2257(-112);
        }
    }

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "(I)V")
    public static final void method2257(int arg0) {
        ++field5347;
        for (int var1 = 0; var1 < 5; ++var1) {
            class41.field457[var1] = false;
        }
        class402.field5767 = 0;
        class261.field3842 = 0;
        class434.field6364 = class367.field5319;
        class117.field1531 = class543.field8120;
        class287.field4232 = 5;
        class434.field6361 = class358.field5200;
        class225.field3321 = class111.field1412;
        class3.field32 = class576.field8505;
        int var2 = -90 % ((arg0 - 27) / 63);
        class586.field8709 = -1;
        class615.field9012 = -1;
        class223.field3275 = class151.field1935;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)Z")
    public final boolean method40(int arg0) {
        if (arg0 <= 44) {
            method2257(79);
        }
        ++field5353;
        return true;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZILmn;)V")
    public final void method42(boolean arg0, int arg1, class60 arg2) {
        super.field7558.method1152(arg2, arg0);
        if (!arg0) {
            this.method39(27, false);
        }
        ++field5349;
        super.field7558.method1142(192, arg1);
    }

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "(B)V")
    public static void method2258(byte arg0) {
        field5354 = null;
        field5343 = null;
        field5345 = null;
        int var1 = 50 % ((-34 - arg0) / 37);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IZ)V")
    public final void method39(int arg0, boolean arg1) {
        if (arg0 == 0) {
            ++field5344;
        }
    }
}
