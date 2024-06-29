import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vda")
public class class479 extends class334 {

    @OriginalMember(owner = "client!vda", name = "E", descriptor = "Lwca;")
    public static class36 field6857 = new class36();

    @OriginalMember(owner = "client!vda", name = "H", descriptor = "Lvg;")
    public static class622 field6859 = new class622(49, 14);

    @OriginalMember(owner = "client!vda", name = "A", descriptor = "I")
    public static int field6854;

    @OriginalMember(owner = "client!vda", name = "B", descriptor = "I")
    public static int field6855;

    @OriginalMember(owner = "client!vda", name = "D", descriptor = "I")
    public static int field6856;

    @OriginalMember(owner = "client!vda", name = "G", descriptor = "I")
    public static int field6858;

    @OriginalMember(owner = "client!vda", name = "I", descriptor = "[Lf;")
    public static class256[] field6860;

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(II)V")
    public static final void method2745(int arg0, int arg1) {
        class642.field9200.method3900(arg0, 0);
        if (arg1 != -24817) {
            method2746(-116, (class540) null);
        }
        ++field6858;
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(ILgk;)Llea;")
    public static final class510 method2746(int arg0, class540 arg1) {
        ++field6856;
        if (arg0 < 42) {
            field6859 = null;
        }
        class510 var2 = new class510();
        var2.field7198 = arg1.method3169(26488);
        var2.field7195 = class23.field431.method2749(var2.field7198, false);
        return var2;
    }

    @OriginalMember(owner = "client!vda", name = "g", descriptor = "(I)V")
    public static void method2747(int arg0) {
        field6860 = null;
        if (arg0 != 49) {
            field6857 = null;
        }
        field6857 = null;
        field6859 = null;
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(IIII)V")
    public final void method1166(int arg0, int arg1, int arg2, int arg3) {
        super.field4853 = arg2;
        if (arg0 != 6211) {
            field6857 = null;
        }
        super.field4859 = arg1;
        super.field4858 = arg3;
        ++field6855;
    }

    @OriginalMember(owner = "client!vda", name = "<init>", descriptor = "(IIIIIF)V")
    public class479(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(FB)V")
    public final void method1165(float arg0, byte arg1) {
        ++field6854;
        super.field4848 = arg0;
        if (arg1 != -18) {
            field6860 = null;
        }
    }
}
