import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public class class332 extends class476 {

    @OriginalMember(owner = "client!wp", name = "l", descriptor = "I")
    public int field4514;

    @OriginalMember(owner = "client!wp", name = "r", descriptor = "I")
    public int field4520;

    @OriginalMember(owner = "client!wp", name = "k", descriptor = "I")
    public int field4513;

    @OriginalMember(owner = "client!wp", name = "i", descriptor = "I")
    public int field4511;

    @OriginalMember(owner = "client!wp", name = "j", descriptor = "I")
    public int field4512;

    @OriginalMember(owner = "client!wp", name = "p", descriptor = "Z")
    public boolean field4518;

    @OriginalMember(owner = "client!wp", name = "n", descriptor = "Lhi;")
    public static class45 field4516 = new class45(81, 0);

    @OriginalMember(owner = "client!wp", name = "u", descriptor = "I")
    public static int field4523 = -1;

    @OriginalMember(owner = "client!wp", name = "m", descriptor = "I")
    public static int field4515;

    @OriginalMember(owner = "client!wp", name = "o", descriptor = "I")
    public static int field4517;

    @OriginalMember(owner = "client!wp", name = "s", descriptor = "I")
    public static int field4521;

    @OriginalMember(owner = "client!wp", name = "t", descriptor = "I")
    public static int field4522;

    @OriginalMember(owner = "client!wp", name = "q", descriptor = "Z")
    public static boolean field4519;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(IB)I", line = 4)
    public static final int method1958(int arg0, byte arg1) {
        field4521++;
        if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
            return 6407;
        } else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
            return 6408;
        } else {
            if (arg1 != 116) {
                method1959(-7, -101);
            }
            if (arg0 == 6406 || arg0 == 34844) {
                return 6406;
            } else if (arg0 == 6409 || arg0 == 34846) {
                return 6409;
            } else if (arg0 == 6410 || arg0 == 34847) {
                return 6410;
            } else if (arg0 == 6402) {
                return 6402;
            } else {
                throw new IllegalArgumentException("");
            }
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(II)V", line = 37)
    public static final void method1959(int arg0, int arg1) {
        field4517++;
        class314 var2 = class177.method1213(false, arg0, arg1);
        var2.method1811((byte) 86);
    }

    @OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(IIIIIZ)V", line = 55)
    public class332(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field4514 = arg3;
        this.field4520 = arg4;
        this.field4513 = arg1;
        this.field4511 = arg2;
        this.field4512 = arg0;
        this.field4518 = arg5;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(IIIII)V", line = 68)
    public static final void method1960(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = 32 % ((4 - arg3) / 56);
        field4515++;
        if (class41.field616 == 1) {
            class215.field3055[class273.field3699 / 100].method2142(class119.field1861 - 8, client.field7561 - 8);
        }
        if (class41.field616 == 2) {
            class215.field3055[class273.field3699 / 100 + 4].method2142(class119.field1861 - 8, client.field7561 - 8);
        }
        class119.method874(125);
    }

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "(I)V", line = 95)
    public static void method1961(int arg0) {
        field4516 = null;
        if (arg0 != 0) {
            field4523 = 123;
        }
    }
}
