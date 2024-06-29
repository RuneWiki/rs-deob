import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class326 {

    @OriginalMember(owner = "client!gr", name = "j", descriptor = "Luj;")
    public class128 field4831 = new class128();

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "I")
    public static int field4822 = 0;

    @OriginalMember(owner = "client!gr", name = "g", descriptor = "Z")
    public static boolean field4828 = false;

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "I")
    public static int field4823;

    @OriginalMember(owner = "client!gr", name = "c", descriptor = "I")
    public static int field4824;

    @OriginalMember(owner = "client!gr", name = "d", descriptor = "I")
    public static int field4825;

    @OriginalMember(owner = "client!gr", name = "e", descriptor = "I")
    public static int field4826;

    @OriginalMember(owner = "client!gr", name = "f", descriptor = "I")
    public static int field4827;

    @OriginalMember(owner = "client!gr", name = "h", descriptor = "I")
    public static int field4829;

    @OriginalMember(owner = "client!gr", name = "i", descriptor = "I")
    public static int field4830;

    @OriginalMember(owner = "client!gr", name = "k", descriptor = "I")
    public static int field4832;

    @OriginalMember(owner = "client!gr", name = "l", descriptor = "Luj;")
    private class128 field4833;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)Luj;", line = 4)
    public final class128 method2135(int arg0) {
        field4824++;
        class128 var2 = this.field4831.field1663;
        if (arg0 != -2) {
            field4829 = -7;
        }
        if (this.field4831 == var2) {
            this.field4833 = null;
            return null;
        } else {
            this.field4833 = var2.field1663;
            return var2;
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(B)Luj;", line = 26)
    public final class128 method2136(byte arg0) {
        field4825++;
        class128 var2 = this.field4833;
        int var3 = -128 % ((89 - arg0) / 34);
        if (this.field4831 == var2) {
            this.field4833 = null;
            return null;
        } else {
            this.field4833 = var2.field1663;
            return var2;
        }
    }

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "(I)V", line = 45)
    public final void method2137(int arg0) {
        while (true) {
            class128 var2 = this.field4831.field1663;
            if (this.field4831 == var2) {
                field4827++;
                this.field4833 = null;
                if (arg0 != 0) {
                    method2141((byte) -38, -66, 107, 112);
                    return;
                }
                return;
            }
            var2.method902((byte) -53);
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIIIIB)V", line = 68)
    public static final void method2138(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        int var6 = 39 % ((arg5 + 67) / 55);
        for (int var7 = arg4; var7 <= arg0; var7++) {
            class351.method2317(false, arg2, class444.field6416[var7], arg3, arg1);
        }
        field4830++;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(ZLuj;)V", line = 109)
    public final void method2139(boolean arg0, class128 arg1) {
        if (arg1.field1665 != null) {
            arg1.method902((byte) -88);
        }
        field4823++;
        arg1.field1663 = this.field4831;
        if (!arg0) {
            field4828 = true;
        }
        arg1.field1665 = this.field4831.field1665;
        arg1.field1665.field1663 = arg1;
        arg1.field1663.field1665 = arg1;
    }

    @OriginalMember(owner = "client!gr", name = "c", descriptor = "(I)V", line = 133)
    public static final void method2140(int arg0) {
        field4832++;
        class51 var1 = class318.field4678;
        synchronized (class318.field4678) {
            if (arg0 != 28806) {
                field4829 = 74;
            }
            class318.field4678.method372(121);
        }
        class51 var2 = class295.field4442;
        synchronized (class295.field4442) {
            class295.field4442.method372(121);
        }
    }

    @OriginalMember(owner = "client!gr", name = "<init>", descriptor = "()V", line = 180)
    public class326() {
        this.field4831.field1665 = this.field4831;
        this.field4831.field1663 = this.field4831;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(BIII)I", line = 157)
    public static final int method2141(byte arg0, int arg1, int arg2, int arg3) {
        field4826++;
        int var4 = arg2 & 0x3;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return arg3;
        } else if (var4 == 2) {
            return 1023 - arg1;
        } else {
            if (arg0 <= 83) {
                field4822 = 106;
            }
            return 1023 - arg3;
        }
    }
}
