import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class226 extends class154 {

    @OriginalMember(owner = "client!aa", name = "n", descriptor = "I")
    private int field3522;

    @OriginalMember(owner = "client!aa", name = "w", descriptor = "I")
    private int field3531;

    @OriginalMember(owner = "client!aa", name = "o", descriptor = "I")
    private int field3523;

    @OriginalMember(owner = "client!aa", name = "x", descriptor = "I")
    private int field3532;

    @OriginalMember(owner = "client!aa", name = "v", descriptor = "I")
    public static int field3530 = 0;

    @OriginalMember(owner = "client!aa", name = "l", descriptor = "I")
    public static int field3520 = 0;

    @OriginalMember(owner = "client!aa", name = "y", descriptor = "I")
    public static int field3533 = 0;

    @OriginalMember(owner = "client!aa", name = "k", descriptor = "I")
    public static int field3519;

    @OriginalMember(owner = "client!aa", name = "q", descriptor = "I")
    public static int field3525;

    @OriginalMember(owner = "client!aa", name = "r", descriptor = "I")
    public static int field3526;

    @OriginalMember(owner = "client!aa", name = "s", descriptor = "I")
    public static int field3527;

    @OriginalMember(owner = "client!aa", name = "t", descriptor = "I")
    public static int field3528;

    @OriginalMember(owner = "client!aa", name = "u", descriptor = "I")
    public static int field3529;

    @OriginalMember(owner = "client!aa", name = "z", descriptor = "I")
    public static int field3534;

    @OriginalMember(owner = "client!aa", name = "m", descriptor = "Lrn;")
    public static class18 field3521;

    @OriginalMember(owner = "client!aa", name = "p", descriptor = "Lkb;")
    public static class214 field3524;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IB)V", line = 8)
    public static final void method1687(int arg0, byte arg1) {
        class66.field1006--;
        field3527++;
        if (class66.field1006 == arg0) {
            return;
        }
        class65.method644(class212.field3328, arg0 + 1, class212.field3328, arg0, class66.field1006 - arg0);
        class65.method644(class318.field4904, arg0 + 1, class318.field4904, arg0, class66.field1006 - arg0);
        class65.method641(class78.field1134, arg0 + 1, class78.field1134, arg0, class66.field1006 - arg0);
        class65.method643(class356.field5670, arg0 + 1, class356.field5670, arg0, class66.field1006 - arg0);
        class65.method640(class356.field5669, arg0 + 1, class356.field5669, arg0, class66.field1006 - arg0);
        class65.method641(class41.field654, arg0 + 1, class41.field654, arg0, class66.field1006 - arg0);
        if (arg1 < 10) {
            field3524 = (class214) null;
        }
        class65.method641(class90.field1278, arg0 + 1, class90.field1278, arg0, class66.field1006 - arg0);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)I", line = 31)
    public static final int method1688(int arg0, int arg1) {
        if (arg1 != -1951127992) {
            field3530 = -101;
        }
        field3528++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(IBI)V", line = 44)
    public final void method1269(int arg0, byte arg1, int arg2) {
        field3529++;
        if (arg1 <= 37) {
            method1688(99, 33);
        }
        int var4 = this.field3523 * arg0 >> 12;
        int var5 = this.field3532 * arg2 >> 12;
        int var6 = this.field3522 * arg0 >> 12;
        int var7 = this.field3531 * arg2 >> 12;
        class114.method981(this.field2496, var6, var4, this.field2497, var5, false, this.field2498, var7);
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(B)V", line = 66)
    public static void method1689(byte arg0) {
        field3524 = null;
        if (arg0 != -55) {
            method1688(6, -5);
        }
        field3521 = null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IBI)V", line = 85)
    public final void method1265(int arg0, byte arg1, int arg2) {
        field3525++;
        int var4 = 38 % ((arg1 + 4) / 40);
        int var5 = this.field3523 * arg0 >> 12;
        int var6 = this.field3532 * arg2 >> 12;
        int var7 = this.field3522 * arg0 >> 12;
        int var8 = this.field3531 * arg2 >> 12;
        class176.method1377(-28139, var8, var5, var6, this.field2496, var7);
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(II)Lui;", line = 105)
    public static final class205 method1690(int arg0, int arg1) {
        int var2 = 1 / ((arg1 + 68) / 46);
        field3534++;
        class205 var3 = (class205) class340.field5229.method1386(-1, (long) arg0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class301.field4678.method187(5, arg0, -1);
        class205 var5 = new class205();
        if (var4 != null) {
            var5.method1527(new class25(var4), 128);
        }
        class340.field5229.method1385(var5, (byte) -30, (long) arg0);
        return var5;
    }

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(II)I", line = 127)
    public static int method1691(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(IIIIIII)V", line = 136)
    public class226(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field3522 = arg0;
        this.field3531 = arg3;
        this.field3523 = arg2;
        this.field3532 = arg1;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(III)V", line = 152)
    public final void method1268(int arg0, int arg1, int arg2) {
        if (arg1 >= 91) {
            field3526++;
        }
    }
}
