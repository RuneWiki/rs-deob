import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class305 extends class223 {

    @OriginalMember(owner = "client!vj", name = "m", descriptor = "Lbg;")
    public static class324 field4331 = new class324(73, 12);

    @OriginalMember(owner = "client!vj", name = "r", descriptor = "[Z")
    public static boolean[] field4336 = new boolean[200];

    @OriginalMember(owner = "client!vj", name = "l", descriptor = "I")
    public static int field4330;

    @OriginalMember(owner = "client!vj", name = "n", descriptor = "I")
    public static int field4332;

    @OriginalMember(owner = "client!vj", name = "o", descriptor = "I")
    public int field4333;

    @OriginalMember(owner = "client!vj", name = "p", descriptor = "I")
    public static int field4334;

    @OriginalMember(owner = "client!vj", name = "q", descriptor = "I")
    public int field4335;

    @OriginalMember(owner = "client!vj", name = "t", descriptor = "Lln;")
    public static class257 field4338;

    @OriginalMember(owner = "client!vj", name = "s", descriptor = "Lfs;")
    public static class387 field4337;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Let;II)I", line = 4)
    public static final int method1897(class419 arg0, int arg1, int arg2) {
        field4332++;
        byte var3 = -1;
        int var4 = -70 % ((-arg2 - 5) / 37);
        return var3;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)V", line = 18)
    public static void method1898(int arg0) {
        if (arg0 != 200) {
            method1898(-42);
        }
        field4331 = null;
        field4337 = null;
        field4338 = null;
        field4336 = null;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Z)V", line = 36)
    public static final void method1899(boolean arg0) {
        field4334++;
        class496.method2971();
        for (int var1 = 0; var1 < 4; var1++) {
            class455.field6684[var1].method566(-81);
        }
        if (arg0) {
            field4338 = null;
        }
        class489.method2941(-121);
        class180.method1264((byte) 92);
        System.gc();
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(II)Z", line = 59)
    public static final boolean method1900(int arg0, int arg1) {
        field4330++;
        if (arg0 != 200) {
            field4336 = null;
        }
        return (arg1 & -arg1) == arg1;
    }
}
