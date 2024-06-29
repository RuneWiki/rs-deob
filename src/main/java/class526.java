import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tv")
public class class526 {

    @OriginalMember(owner = "client!tv", name = "d", descriptor = "Ljw;")
    public static class520 field7004 = new class520(16);

    @OriginalMember(owner = "client!tv", name = "h", descriptor = "S")
    public static short field7008 = 256;

    @OriginalMember(owner = "client!tv", name = "f", descriptor = "[[I")
    public static int[][] field7006 = new int[128][128];

    @OriginalMember(owner = "client!tv", name = "i", descriptor = "[I")
    public static int[] field7009 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!tv", name = "e", descriptor = "Ldb;")
    public static class298 field7005 = new class298(113, 7);

    @OriginalMember(owner = "client!tv", name = "k", descriptor = "Lgba;")
    public static class625 field7011 = null;

    @OriginalMember(owner = "client!tv", name = "j", descriptor = "F")
    public static float field7010;

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "I")
    public static int field7001;

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "I")
    public static int field7002;

    @OriginalMember(owner = "client!tv", name = "c", descriptor = "I")
    public static int field7003;

    @OriginalMember(owner = "client!tv", name = "g", descriptor = "I")
    public static int field7007;

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(IIIZII)V")
    public static final void method2936(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field7003++;
        if (!arg3 && class344.field4718.field5450 != 0 && arg0 != 0 && class273.field3798 < 50 && arg2 != -1) {
            class653.field8828[class273.field3798++] = new class70((byte) 1, arg2, arg0, arg4, arg5, arg1);
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(I)V")
    public static final void method2937(int arg0) {
        field7007++;
        for (class597 var1 = (class597) class6.field182.method3257(-91); var1 != null; var1 = (class597) class6.field182.method3263((byte) -100)) {
            if (var1.field7915) {
                var1.method3294((byte) -121);
            }
        }
        if (arg0 != -18538) {
            field7009 = null;
        }
        for (class597 var2 = (class597) class665.field9431.method3257(arg0 ^ 0x487F); var2 != null; var2 = (class597) class665.field9431.method3263((byte) -117)) {
            if (var2.field7915) {
                var2.method3294((byte) -121);
            }
        }
    }

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "(I)V")
    public static void method2938(int arg0) {
        field7005 = null;
        field7004 = null;
        field7011 = null;
        field7006 = null;
        field7009 = null;
        if (arg0 != -65) {
            method2936(-63, 45, -21, false, 105, 111);
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(IZ)V")
    public static final void method2939(int arg0, boolean arg1) {
        field7002++;
        if (arg1) {
            class51.field719 = arg0;
            class358.field4846.method3739(0);
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(IILbi;)Lec;")
    public static final class218 method2940(int arg0, int arg1, class449 arg2) {
        if (arg1 <= 91) {
            field7004 = null;
        }
        field7001++;
        byte[] var3 = arg2.method2531(arg0, 0);
        return var3 == null ? null : new class218(var3);
    }
}
