import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class361 extends class55 {

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "Lqe;")
    public static class469 field5221 = new class469(111, 2);

    @OriginalMember(owner = "client!vh", name = "s", descriptor = "Lqe;")
    public static class469 field5230 = new class469(59, 0);

    @OriginalMember(owner = "client!vh", name = "t", descriptor = "I")
    public static int field5231 = 0;

    @OriginalMember(owner = "client!vh", name = "l", descriptor = "I")
    public static int field5223;

    @OriginalMember(owner = "client!vh", name = "m", descriptor = "I")
    public static int field5224;

    @OriginalMember(owner = "client!vh", name = "n", descriptor = "I")
    public static int field5225;

    @OriginalMember(owner = "client!vh", name = "o", descriptor = "I")
    public static int field5226;

    @OriginalMember(owner = "client!vh", name = "q", descriptor = "I")
    public static int field5228;

    @OriginalMember(owner = "client!vh", name = "r", descriptor = "I")
    public static int field5229;

    @OriginalMember(owner = "client!vh", name = "k", descriptor = "Lvh;")
    public class361 field5222;

    @OriginalMember(owner = "client!vh", name = "p", descriptor = "Lvh;")
    public class361 field5227;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIIIIII)V", line = 3)
    public static final void method2246(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5226++;
        if (arg2 < 67) {
            field5230 = null;
        }
        if (arg1 >= class497.field7073 && arg4 <= class391.field5895 && arg6 >= class166.field2622 && class432.field6446 >= arg5) {
            class500.method2975(arg5, arg0, arg6, arg4, arg3, arg7, arg1, -31469);
        } else {
            class209.method1410(arg3, arg6, (byte) -71, arg1, arg4, arg7, arg5, arg0);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V", line = 23)
    public final void method2247(int arg0) {
        field5225++;
        if (arg0 != 0) {
            this.method2247(-5);
        }
        if (this.field5227 != null) {
            this.field5227.field5222 = this.field5222;
            this.field5222.field5227 = this.field5227;
            this.field5222 = null;
            this.field5227 = null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)[Lfa;", line = 41)
    public static final class235[] method2248(int arg0) {
        if (arg0 == 6434) {
            field5228++;
            return new class235[] { class248.field3610, class339.field4930, class359.field5215, class684.field9473, class739.field10362, class223.field3272, class392.field5896, class175.field2708, class732.field10250, class362.field5233, class648.field9141, class280.field3961, class63.field917, class432.field6445 };
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIII)Z", line = 55)
    public static final boolean method2249(int arg0, int arg1, int arg2, int arg3) {
        field5223++;
        if (!class24.field247 || !class587.field8325) {
            return false;
        } else if (class357.field5193 < 100) {
            return false;
        } else {
            int var4 = class70.field986[arg3][arg2][arg0];
            if (arg1 < 21) {
                field5231 = 28;
            }
            if ((-class440.field6515) == var4) {
                return false;
            } else if (class440.field6515 == var4) {
                return true;
            } else if (class582.field8287 == class46.field568) {
                return false;
            } else {
                int var5 = arg2 << class459.field6769;
                int var6 = arg0 << class459.field6769;
                if (class167.method1224(class504.field7164 + var5 - 1, class504.field7164 + var6 - 1, class582.field8287[arg3].method1787(arg2 + 1, 19646, arg0 + 1), var5 + 1, (byte) 111, var5 + 1, class582.field8287[arg3].method1787(arg2, 19646, arg0 + 1), class582.field8287[arg3].method1787(arg2, 19646, arg0), class504.field7164 + var6 - 1, var6 + 1) && class167.method1224(class504.field7164 + var5 - 1, var6 + 1, class582.field8287[arg3].method1787(arg2 + 1, 19646, arg0), var5 + 1, (byte) -92, class504.field7164 + var5 - 1, class582.field8287[arg3].method1787(arg2 + 1, 19646, arg0 + 1), class582.field8287[arg3].method1787(arg2, 19646, arg0), var6 + class504.field7164 - 1, var6 + 1)) {
                    class118.field1621++;
                    class70.field986[arg3][arg2][arg0] = class440.field6515;
                    return true;
                } else {
                    class70.field986[arg3][arg2][arg0] = -class440.field6515;
                    return false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)V", line = 109)
    public static void method2250(byte arg0) {
        if (arg0 > -66) {
            method2248(83);
        }
        field5221 = null;
        field5230 = null;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ZI)I", line = 123)
    public static final int method2251(boolean arg0, int arg1) {
        field5229++;
        if (class716.field10074 == null) {
            return 0;
        } else if (arg0 || class122.field1661 == null) {
            int var2 = 0;
            int var3 = 0;
            if (arg1 != 2) {
                return -28;
            }
            while (var3 < class716.field10074.length) {
                int var4 = class716.field10074[var3];
                if (class323.field4609.method208(var4, (byte) 70)) {
                    var2++;
                }
                if (class256.field3683.method208(var4, (byte) 70)) {
                    var2++;
                }
                var3++;
            }
            return var2;
        } else {
            return class716.field10074.length * 2;
        }
    }
}
