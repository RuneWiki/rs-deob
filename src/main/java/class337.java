import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public abstract class class337 {

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "Lmh;")
    public class537 field4382;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "Lsw;")
    public static class641 field4387 = new class641(10);

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
    public static int field4383;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "I")
    public static int field4384;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
    public static int field4385;

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "Lpq;")
    public static class165 field4386;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IBLuu;)V")
    public abstract void method253(int arg0, byte arg1, class238 arg2);

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1896(int arg0, byte arg1, int arg2) {
        field4384++;
        int var3 = 117 / ((-arg1 - 7) / 63);
        if (class187.method1024(3, arg2, arg0)) {
            return class448.method2623(arg0, arg2, 27) | (arg2 & 0x9000) != 0 | class521.method2968(arg2, arg0, (byte) 122) ? true : (arg0 & 0x37) == 0 & ((arg2 & 0x2000) != 0 | class342.method1908(arg2, false, arg0) | class168.method944(arg0, arg2, (byte) -63));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(BZ)V")
    public abstract void method252(byte arg0, boolean arg1);

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)V")
    public abstract void method251(byte arg0);

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(Lmh;)V")
    public class337(class537 arg0) {
        this.field4382 = arg0;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZII)V")
    public abstract void method258(boolean arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZI)V")
    public abstract void method256(boolean arg0, int arg1);

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(BII)Z")
    public static final boolean method1897(byte arg0, int arg1, int arg2) {
        field4383++;
        int var3 = 50 / ((-arg0 - 29) / 46);
        return (arg1 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)Lbo;")
    public static final class620 method1898(int arg0, int arg1) {
        field4385++;
        class620 var2 = (class620) class300.field3848.method3682(0, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class560.field8244.method2558(arg0 - 1270, arg1, 0);
        class620 var4 = new class620();
        if (var3 != null) {
            var4.method3562((byte) 65, arg1, new class374(var3));
        }
        class300.field3848.method3684(var4, arg0 ^ arg0, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(B)Z")
    public abstract boolean method257(byte arg0);

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
    public static void method1899(int arg0) {
        if (arg0 == 55) {
            field4387 = null;
            field4386 = null;
        }
    }
}
