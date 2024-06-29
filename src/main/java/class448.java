import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class448 extends class450 {

    @OriginalMember(owner = "client!bn", name = "g", descriptor = "I")
    public static int field6138;

    @OriginalMember(owner = "client!bn", name = "h", descriptor = "I")
    public static int field6139;

    @OriginalMember(owner = "client!bn", name = "i", descriptor = "I")
    public static int field6140;

    @OriginalMember(owner = "client!bn", name = "j", descriptor = "I")
    public static int field6141;

    @OriginalMember(owner = "client!bn", name = "k", descriptor = "I")
    public static int field6142;

    @OriginalMember(owner = "client!bn", name = "l", descriptor = "I")
    public static int field6143;

    @OriginalMember(owner = "client!bn", name = "m", descriptor = "I")
    public static int field6144;

    @OriginalMember(owner = "client!bn", name = "f", descriptor = "Ltk;")
    public static class348 field6137;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(II)I")
    public final int method75(int arg0, int arg1) {
        ++field6140;
        if (arg0 != 0) {
            method2565((byte) -23);
        }
        return 1;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIBI)I")
    public static final int method2564(int arg0, int arg1, byte arg2, int arg3) {
        ++field6143;
        int var4 = -arg1 + 255;
        if (arg2 <= 56) {
            return 82;
        } else {
            int var5 = ((65280 & arg3) * arg1 & 16711680 | (arg3 & 16711935) * arg1 & -16711936) >>> 8;
            return ((16711680 & (65280 & arg0) * var4 | -16711936 & (16711935 & arg0) * var4) >>> 8) + var5;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Z)I")
    public final int method68(boolean arg0) {
        if (arg0) {
            return -85;
        } else {
            ++field6142;
            return 1;
        }
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(B)V")
    public static void method2565(byte arg0) {
        int var1 = 65 / ((arg0 - -20) / 60);
        field6137 = null;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(B)V")
    public final void method73(byte arg0) {
        if (arg0 == 98) {
            ++field6138;
            if (super.field6171.method1671(7108) == class12.field187) {
                super.field6170 = 2;
            }
            if (super.field6170 < 0 || super.field6170 > 2) {
                super.field6170 = this.method68(false);
            }
        }
    }

    @OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(Lup;)V")
    public class448(class278 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(Z)I")
    public final int method2566(boolean arg0) {
        if (!arg0) {
            return 99;
        } else {
            ++field6141;
            return super.field6170;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(BLwu;)V")
    public static final void method2567(byte arg0, class376 arg1) {
        class155.field2365 = 0;
        class680.field9503 = 0;
        ++field6139;
        class543.field7191 = new class687();
        class573.field7529 = new class579[1024];
        if (arg0 != -43) {
            field6137 = null;
        }
        class514.field6814 = new class17[class311.field4465[class175.field2642] + 1];
        class401.field5594 = 0;
        class66.field823 = 0;
        class613.method3336(5, arg1);
        class299.method1839(false, arg1);
    }

    @OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(ILup;)V")
    public class448(int arg0, class278 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(ZI)V")
    public final void method67(boolean arg0, int arg1) {
        super.field6170 = arg1;
        ++field6144;
        if (!arg0) {
            field6137 = null;
        }
    }
}
