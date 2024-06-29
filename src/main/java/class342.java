import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public abstract class class342 {

    @OriginalMember(owner = "client!om", name = "g", descriptor = "I")
    public static int field4521 = 0;

    @OriginalMember(owner = "client!om", name = "b", descriptor = "Ljk;")
    public static class585 field4516 = new class585(48, 11);

    @OriginalMember(owner = "client!om", name = "a", descriptor = "I")
    public static int field4515;

    @OriginalMember(owner = "client!om", name = "c", descriptor = "I")
    public static int field4517;

    @OriginalMember(owner = "client!om", name = "d", descriptor = "I")
    public static int field4518;

    @OriginalMember(owner = "client!om", name = "f", descriptor = "I")
    public static int field4520;

    @OriginalMember(owner = "client!om", name = "e", descriptor = "Laa;")
    public static class452 field4519;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(I)V", line = 4)
    public static void method1964(int arg0) {
        field4519 = null;
        if (arg0 != 1120) {
            field4516 = null;
        }
        field4516 = null;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IIIIIII)Z", line = 23)
    public static final boolean method1968(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 >= -113) {
            return true;
        }
        field4517++;
        if (!class186.field2276) {
            return false;
        } else if (class86.field1213 < 100) {
            return false;
        } else if (arg4 != arg6 || arg3 != arg5) {
            for (int var9 = arg6; var9 <= arg4; var9++) {
                for (int var12 = arg5; var12 <= arg3; var12++) {
                    if (class395.field5587[arg1][var9][var12] == (-class128.field1633)) {
                        return false;
                    }
                }
            }
            int var10 = (arg6 << class295.field3981) + 1;
            int var11 = (arg5 << class295.field3981) + 2;
            if (class281.method1691((arg4 + 1 - arg6) * class454.field6392, class155.field1899[arg1].method437(127, arg5, arg6), -6, var11, arg2, (arg3 + 1 - arg5) * class454.field6392, var10)) {
                class408.field5788++;
                return true;
            } else {
                return false;
            }
        } else if (class124.method860(arg5, false, arg1, arg6)) {
            int var7 = arg6 << class295.field3981;
            int var8 = arg5 << class295.field3981;
            if (class281.method1691(class454.field6392, class155.field1899[arg1].method437(122, arg5, arg6), -6, var8, arg2, class454.field6392, var7)) {
                class408.field5788++;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(JI)I", line = 94)
    public final int method1970(long arg0, int arg1) {
        field4518++;
        long var4 = this.method1969((byte) 58);
        if (var4 > 0L) {
            class151.method974((byte) -102, var4);
        }
        if (arg1 >= -126) {
            this.method1965(-67);
        }
        return this.method1967(arg0, 1);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(II)V", line = 117)
    public static final void method1971(int arg0, int arg1) {
        field4515++;
        class233 var2 = class7.method44(arg0, 3, -1);
        var2.method1423(arg1 ^ arg1);
    }

    @OriginalMember(owner = "client!om", name = "d", descriptor = "(I)Z", line = 127)
    public static final boolean method1972(int arg0) {
        field4520++;
        return class114.field1485 >= arg0;
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(I)J")
    public abstract long method1965(int arg0);

    @OriginalMember(owner = "client!om", name = "c", descriptor = "(I)V")
    public abstract void method1966(int arg0);

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(JI)I")
    public abstract int method1967(long arg0, int arg1);

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(B)J")
    public abstract long method1969(byte arg0);
}
