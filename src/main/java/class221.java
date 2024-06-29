import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public abstract class class221 {

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
    public static int field3804 = 0;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "Lpj;")
    public static class237 field3806 = class33.method353("::clientjs5drop", 21);

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "Lpj;")
    public static class237 field3802 = class33.method353("Fps:", 104);

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "Lpj;")
    public static class237 field3801 = class33.method353("mapfunction", 94);

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "I")
    public static int field3810 = 0;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "I")
    public static int field3803;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "I")
    public static int field3808;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "I")
    public static int field3809;

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "I")
    public static int field3811;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "Lw;")
    public static class141 field3807;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "[Lgk;")
    public static class154[] field3805;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lfa;I)V")
    public static final void method1470(class239 arg0, int arg1) {
        if (arg1 != -1) {
            field3806 = null;
        }
        class141.field2525 = arg0;
        field3808++;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(III)I")
    public abstract int method417(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V")
    public abstract void method415(byte arg0);

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZIIBI)V")
    public static final void method1471(boolean arg0, int arg1, int arg2, byte arg3, int arg4) {
        class34.field744 = 0L;
        field3811++;
        int var5 = class37.method381(0);
        if (arg4 == 3 || var5 == 3) {
            arg0 = true;
        }
        if (class67.field1320.startsWith("mac") && arg4 > 0) {
            arg0 = true;
        }
        boolean var6 = false;
        if (arg4 > 0 == var5 <= 0) {
            var6 = true;
        }
        if (arg0 && arg4 > 0) {
            var6 = true;
        }
        class95.method712(arg0, 0, arg4, arg1, var5, arg2, var6);
        if (arg3 != -45) {
            field3802 = null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V")
    public static void method1472(int arg0) {
        field3801 = null;
        if (arg0 == -1) {
            field3806 = null;
            field3802 = null;
            field3807 = null;
            field3805 = null;
        }
    }
}
