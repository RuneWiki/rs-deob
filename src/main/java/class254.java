import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class254 extends class103 {

    @OriginalMember(owner = "client!ta", name = "Q", descriptor = "Ljava/lang/Object;")
    private Object field4447;

    @OriginalMember(owner = "client!ta", name = "P", descriptor = "I")
    public static int field4446 = -1;

    @OriginalMember(owner = "client!ta", name = "R", descriptor = "Lid;")
    public static class149 field4448 = class60.method382("(Z", (byte) 111);

    @OriginalMember(owner = "client!ta", name = "T", descriptor = "Lid;")
    public static class149 field4450 = class60.method382(" ", (byte) 58);

    @OriginalMember(owner = "client!ta", name = "L", descriptor = "I")
    public static int field4442;

    @OriginalMember(owner = "client!ta", name = "N", descriptor = "I")
    public static int field4444;

    @OriginalMember(owner = "client!ta", name = "O", descriptor = "I")
    public static int field4445;

    @OriginalMember(owner = "client!ta", name = "S", descriptor = "I")
    public static int field4449;

    @OriginalMember(owner = "client!ta", name = "U", descriptor = "I")
    public static int field4451;

    @OriginalMember(owner = "client!ta", name = "V", descriptor = "I")
    public static int field4452;

    @OriginalMember(owner = "client!ta", name = "M", descriptor = "Lal;")
    public static class230 field4443;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIIB)V")
    public static final void method1750(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        class222.field3915[0].method1353(arg4, arg1);
        class222.field3915[1].method1353(arg4, arg0 + arg1 - 16);
        field4442++;
        int var6 = (arg0 - 32) * arg0 / arg3;
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg0 - var6 - 32) * arg2 / (arg3 - arg0);
        class72.method459(arg4, arg1 + 16, 16, arg0 - 32, class170.field3142);
        class72.method459(arg4, arg1 + var7 + 16, 16, var6, class152.field2762);
        class72.method468(arg4, arg1 + var7 + 16, var6, class213.field3779);
        int var8 = -49 % ((49 - arg5) / 51);
        class72.method468(arg4 + 1, arg1 - -16 + var7, var6, class213.field3779);
        class72.method466(arg4, arg1 + var7 + 16, 16, class213.field3779);
        class72.method466(arg4, arg1 + var7 + 17, 16, class213.field3779);
        class72.method468(arg4 + 15, arg1 + var7 - -16, var6, class227.field3986);
        class72.method468(arg4 + 14, arg1 + 17 + var7, var6 - 1, class227.field3986);
        class72.method466(arg4, arg1 + var6 - (-var7 - 15), 16, class227.field3986);
        class72.method466(arg4 + 1, arg1 - (-var7 - var6) + 14, 15, class227.field3986);
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(Z)Ljava/lang/Object;")
    public final Object method729(boolean arg0) {
        field4444++;
        if (!arg0) {
            field4450 = null;
        }
        return this.field4447;
    }

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "(Z)Z")
    public final boolean method732(boolean arg0) {
        if (!arg0) {
            this.method732(false);
        }
        field4452++;
        return false;
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class254(Object arg0) {
        this.field4447 = arg0;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lid;I)I")
    public static final int method1751(class149 arg0, int arg1) {
        if (arg1 != -1) {
            method1752((byte) 87);
        }
        field4449++;
        if (class168.field3120 == null || arg0.method1053((byte) -123) == 0) {
            return -1;
        }
        for (int var2 = 0; var2 < class168.field3120.field4965; var2++) {
            if (class168.field3120.field4967[var2].method1030(class166.field3091, true, class86.field1566).method1051((byte) -28, arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(B)V")
    public static void method1752(byte arg0) {
        field4443 = null;
        field4448 = null;
        field4450 = null;
        if (arg0 != 47) {
            field4448 = null;
        }
    }
}
