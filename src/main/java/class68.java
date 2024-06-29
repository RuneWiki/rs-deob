import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class68 {

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "Lal;")
    public static class52 field849 = new class52(100);

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
    public static int field851 = 0;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "J")
    public static long field855 = 0L;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "I")
    public static int field856 = 0;

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "I")
    public static int field858 = 0;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "I")
    public static int field854;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "Lol;")
    public static class156 field853;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "Lgl;")
    public static class356 field852;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "Z")
    public static boolean field857;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V")
    public static void method429(int arg0) {
        field849 = null;
        if (arg0 >= 48) {
            field852 = null;
            field853 = null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V")
    public static final void method430(byte arg0) {
        field854++;
        class285.field4582.method1536(126);
        class417.field6178 = 1;
        int var1 = -27 / ((42 - arg0) / 41);
        class390.field5860 = null;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILne;Z)V")
    public static final void method431(int arg0, class172 arg1, boolean arg2) {
        if (arg0 != 1099639664) {
            return;
        }
        field850++;
        int var3 = arg1.field2799 == 0 ? arg1.field2705 : arg1.field2799;
        int var4 = arg1.field2830 == 0 ? arg1.field2834 : arg1.field2830;
        class426.method2638(class203.field3266[arg1.field2865 >> 16], var4, arg1.field2865, arg2, var3, -104);
        if (arg1.field2866 != null) {
            class426.method2638(arg1.field2866, var4, arg1.field2865, arg2, var3, -115);
        }
        class196 var5 = (class196) class392.field5891.method1770(arg0 ^ 0xBE74D7E0, (long) arg1.field2865);
        if (var5 != null) {
            class281.method1919(var3, arg0 - 1099639665, var5.field3171, arg2, var4);
        }
    }
}
