import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class360 extends class642 {

    @OriginalMember(owner = "client!sb", name = "B", descriptor = "I")
    private int field5286;

    @OriginalMember(owner = "client!sb", name = "D", descriptor = "I")
    public static int field5287;

    @OriginalMember(owner = "client!sb", name = "E", descriptor = "I")
    public static int field5288;

    @OriginalMember(owner = "client!sb", name = "F", descriptor = "I")
    public static int field5289;

    @OriginalMember(owner = "client!sb", name = "G", descriptor = "I")
    public static int field5290;

    @OriginalMember(owner = "client!sb", name = "H", descriptor = "I")
    public static int field5291;

    @OriginalMember(owner = "client!sb", name = "I", descriptor = "I")
    public static int field5292;

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(I)V")
    public class360(int arg0) {
        super(0, true);
        this.field5286 = 4096;
        this.field5286 = arg0;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(II)[I")
    public final int[] method3(int arg0, int arg1) {
        ++field5291;
        int[] var3 = super.field9216.method1185(arg0, -120);
        if (super.field9216.field2418) {
            class667.method3738(var3, 0, class338.field4909, this.field5286);
        }
        if (arg1 != -9) {
            this.field5286 = -127;
        }
        return var3;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILgk;B)V")
    public final void method1(int arg0, class540 arg1, byte arg2) {
        ++field5290;
        if (~arg0 == -1) {
            this.field5286 = (arg1.method3115(29871) << 12) / 255;
        }
        if (arg2 <= 29) {
            this.field5286 = 114;
        }
    }

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "(I)Z")
    public static final boolean method2214(int arg0) {
        ++field5292;
        try {
            class36 var1 = new class36();
            if (arg0 != 0) {
                return true;
            } else {
                byte[] var2 = var1.method211(7397, class441.field6409);
                class220.method1384(var2, (byte) 124);
                return true;
            }
        } catch (Exception var3) {
            return false;
        }
    }

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "(I)[Lcw;")
    public static final class127[] method2215(int arg0) {
        ++field5287;
        if (arg0 != -1) {
            method2214(-118);
        }
        return new class127[] { class654.field9359, class617.field8894, class367.field5372 };
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "()V")
    public class360() {
        this(4096);
    }

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "(I)V")
    public static final void method2216(int arg0) {
        class400.field6022 = null;
        if (arg0 != -12527) {
            method2215(54);
        }
        class194.field2597 = false;
        ++field5289;
        class370.field5482 = null;
        class464.field6680 = null;
        class164.field2303 = null;
        class591.field8587 = null;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZILjava/lang/Object;)[B")
    public static final byte[] method2217(boolean arg0, int arg1, Object arg2) {
        ++field5288;
        if (arg2 == null) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var3 = (byte[]) arg2;
            return arg0 ? class283.method1676(arg1 ^ -362969972, var3) : var3;
        } else if (arg2 instanceof class299) {
            class299 var4 = (class299) arg2;
            return var4.method1863(true);
        } else if (arg1 != -362969972) {
            return null;
        } else {
            throw new IllegalArgumentException();
        }
    }
}
