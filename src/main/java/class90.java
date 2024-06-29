import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class90 extends class246 {

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
    public static int field1449;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    public static int field1450;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
    public static int field1451;

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "Lom;")
    public static class265 field1454;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)I", line = 4)
    public static final int method737(int arg0, int arg1) {
        if (arg1 != -1522725112) {
            return -121;
        } else {
            ++field1451;
            return arg0 >>> 8;
        }
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Lpg;)V", line = 15)
    public class90(class333 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)Z", line = 23)
    public final boolean method738(byte arg0) {
        ++field1449;
        if (arg0 <= 99) {
            method741(-123);
        }
        return true;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V", line = 34)
    public final void method739(int arg0) {
        int var2 = 4 / ((arg0 - -80) / 32);
        super.field3361.method2028(false, 5);
        ++field1456;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZI)V", line = 44)
    public final void method740(boolean arg0, int arg1) {
        if (arg1 != 26715) {
            field1454 = null;
        }
        ++field1453;
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)V", line = 54)
    public static void method741(int arg0) {
        if (arg0 > -70) {
            field1454 = null;
        }
        field1454 = null;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILfg;I)V", line = 64)
    public final void method742(int arg0, class128 arg1, int arg2) {
        super.field3361.method1977(arg1, true);
        ++field1450;
        if (arg0 != 4) {
            this.method743(true, (byte) -121);
        }
        super.field3361.method1966(arg0 ^ -5, arg2);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZB)V", line = 78)
    public final void method743(boolean arg0, byte arg1) {
        if (arg1 <= 83) {
            this.method740(false, -82);
        }
        ++field1455;
        super.field3361.method2028(true, 5);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(BII)V", line = 89)
    public final void method744(byte arg0, int arg1, int arg2) {
        ++field1452;
        if (arg0 != 53) {
            field1454 = null;
        }
    }
}
