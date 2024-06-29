import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class207 extends class27 {

    @OriginalMember(owner = "client!t", name = "r", descriptor = "I")
    public static int field3932 = 0;

    @OriginalMember(owner = "client!t", name = "x", descriptor = "Li;")
    public static class88 field3938 = class208.method1425(105, "Bitte laden Sie die Seite neu)3");

    @OriginalMember(owner = "client!t", name = "o", descriptor = "Li;")
    public static class88 field3929 = class208.method1425(105, ":chalreq:");

    @OriginalMember(owner = "client!t", name = "m", descriptor = "I")
    public static int field3927 = 50;

    @OriginalMember(owner = "client!t", name = "t", descriptor = "[I")
    public static int[] field3934 = new int[field3927];

    @OriginalMember(owner = "client!t", name = "z", descriptor = "[I")
    public static int[] field3940 = new int[field3927];

    @OriginalMember(owner = "client!t", name = "s", descriptor = "[I")
    public static int[] field3933 = new int[field3927];

    @OriginalMember(owner = "client!t", name = "n", descriptor = "[I")
    public static int[] field3928 = new int[field3927];

    @OriginalMember(owner = "client!t", name = "B", descriptor = "[I")
    public static int[] field3942 = new int[field3927];

    @OriginalMember(owner = "client!t", name = "C", descriptor = "I")
    public static int field3943 = 0;

    @OriginalMember(owner = "client!t", name = "q", descriptor = "[I")
    public static int[] field3931 = new int[field3927];

    @OriginalMember(owner = "client!t", name = "u", descriptor = "[Li;")
    public static class88[] field3935 = new class88[field3927];

    @OriginalMember(owner = "client!t", name = "y", descriptor = "[I")
    public static int[] field3939 = new int[field3927];

    @OriginalMember(owner = "client!t", name = "l", descriptor = "I")
    public static int field3926;

    @OriginalMember(owner = "client!t", name = "p", descriptor = "I")
    public static int field3930;

    @OriginalMember(owner = "client!t", name = "v", descriptor = "I")
    public static int field3936;

    @OriginalMember(owner = "client!t", name = "w", descriptor = "I")
    public static int field3937;

    @OriginalMember(owner = "client!t", name = "A", descriptor = "I")
    public static int field3941;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(III)V")
    public static final void method1421(int arg0, int arg1, int arg2) {
        class52 var3 = class29.field489[arg0][arg1][arg2];
        if (var3 != null) {
            var3.field949 = null;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIBIII)V")
    public static final void method1422(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field3926++;
        int var10 = arg4 + 1;
        class230.method1536(arg0, arg5, -7, arg1, class3.field42[arg4]);
        int var9 = arg3 - 1;
        class230.method1536(arg0, arg5, -7, arg1, class3.field42[arg3]);
        for (int var6 = var10; var6 <= var9; var6++) {
            int[] var7 = class3.field42[var6];
            var7[arg0] = var7[arg1] = arg5;
        }
        if (arg2 > -76) {
            field3936 = 46;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIIIIIIIZII)Z")
    public static final boolean method1423(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11) {
        if (arg0 != 3044) {
            field3928 = null;
        }
        field3930++;
        if (class240.field4458.field4105 == 2) {
            return class108.method739(arg9, arg11, -1, arg6, arg1, arg5, arg7, arg2, arg4, arg10, arg8, arg3);
        } else if (class240.field4458.field4105 > 2) {
            return class241.method1593(arg6, arg4, class240.field4458.field4105, arg7, arg3, arg5, arg2, arg9, arg11, 19661304, arg8, arg10, arg1);
        } else {
            return class99.method692(arg3, arg7, arg11, arg5, arg4, arg1, arg2, arg0 + 5611, arg6, arg8, arg10, arg9);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V")
    public static void method1424(int arg0) {
        field3940 = null;
        field3931 = null;
        field3928 = null;
        field3933 = null;
        field3935 = null;
        if (arg0 <= 16) {
            field3935 = null;
        }
        field3934 = null;
        field3938 = null;
        field3939 = null;
        field3942 = null;
        field3929 = null;
    }
}
