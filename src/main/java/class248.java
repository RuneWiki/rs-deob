import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public class class248 {

    @OriginalMember(owner = "client!es", name = "g", descriptor = "Lrp;")
    private class288 field3807 = new class288(64);

    @OriginalMember(owner = "client!es", name = "k", descriptor = "Llt;")
    private class458 field3811;

    @OriginalMember(owner = "client!es", name = "b", descriptor = "[I")
    public static int[] field3802 = new int[2];

    @OriginalMember(owner = "client!es", name = "h", descriptor = "I")
    public static int field3808 = 0;

    @OriginalMember(owner = "client!es", name = "d", descriptor = "I")
    public static int field3804 = 0;

    @OriginalMember(owner = "client!es", name = "c", descriptor = "I")
    public static int field3803 = 0;

    @OriginalMember(owner = "client!es", name = "a", descriptor = "I")
    public static int field3801;

    @OriginalMember(owner = "client!es", name = "e", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!es", name = "f", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!es", name = "i", descriptor = "I")
    public static int field3809;

    @OriginalMember(owner = "client!es", name = "j", descriptor = "I")
    public static int field3810;

    @OriginalMember(owner = "client!es", name = "l", descriptor = "I")
    public static int field3812;

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(Z)V", line = 3)
    public static void method1496(boolean arg0) {
        if (!arg0) {
            field3802 = null;
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(II)V", line = 15)
    public final void method1497(int arg0, int arg1) {
        class288 var3 = this.field3807;
        synchronized (this.field3807) {
            this.field3807.method1760(arg0, arg1 ^ 0x76BC);
        }
        field3809++;
        if (arg1 != 2) {
            field3812 = -31;
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(IIB)Z", line = 30)
    public static final boolean method1498(int arg0, int arg1, byte arg2) {
        if (arg2 != -44) {
            method1496(false);
        }
        field3805++;
        return class284.method1732(arg0, 0, arg1) & class308.method1851(0, arg1, arg0);
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(B)V", line = 52)
    public final void method1499(byte arg0) {
        field3801++;
        class288 var2 = this.field3807;
        synchronized (this.field3807) {
            if (arg0 >= -44) {
                method1498(100, 126, (byte) 104);
            }
            this.field3807.method1749((byte) 126);
        }
    }

    @OriginalMember(owner = "client!es", name = "b", descriptor = "(II)Lru;", line = 72)
    public final class121 method1500(int arg0, int arg1) {
        field3806++;
        class288 var3 = this.field3807;
        class121 var4;
        synchronized (this.field3807) {
            var4 = (class121) this.field3807.method1752(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field3811.method2715(arg1, arg0, false);
        class121 var6 = new class121();
        if (var5 != null) {
            var6.method843(new class40(var5), 0);
        }
        class288 var7 = this.field3807;
        synchronized (this.field3807) {
            this.field3807.method1758(arg0 ^ 0x1E, var6, (long) arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(I)V", line = 98)
    public final void method1501(int arg0) {
        class288 var2 = this.field3807;
        synchronized (this.field3807) {
            this.field3807.method1761(-128);
            if (arg0 != 64) {
                field3804 = -88;
            }
        }
        field3810++;
    }

    @OriginalMember(owner = "client!es", name = "<init>", descriptor = "(Lcm;ILlt;)V", line = 121)
    public class248(class491 arg0, int arg1, class458 arg2) {
        this.field3811 = arg2;
        this.field3811.method2726((byte) 113, 31);
    }
}
