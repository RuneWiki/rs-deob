import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class71 {

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "Ljp;")
    public static class55 field1129 = new class55(1, 2);

    @OriginalMember(owner = "client!ln", name = "d", descriptor = "I")
    public static int field1130 = 0;

    @OriginalMember(owner = "client!ln", name = "g", descriptor = "I")
    public static int field1133 = 0;

    @OriginalMember(owner = "client!ln", name = "f", descriptor = "Z")
    public static boolean field1132 = false;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "I")
    public static int field1127;

    @OriginalMember(owner = "client!ln", name = "e", descriptor = "I")
    public static int field1131;

    @OriginalMember(owner = "client!ln", name = "h", descriptor = "I")
    public static int field1134;

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "Lfp;")
    public class440 field1128;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(B)V")
    public static final void method614(byte arg0) {
        field1127++;
        class237.field3555 = new class38[class254.field4106.method754(false)][];
        if (arg0 != 1) {
            field1129 = null;
        }
        class394.field5749 = new class38[class254.field4106.method754(false)][];
        class327.field4950 = new boolean[class254.field4106.method754(false)];
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(ILza;Lnv;II)V")
    public static final void method615(int arg0, class299 arg1, class44 arg2, int arg3, int arg4) {
        class328.field4965.method291(false);
        field1134++;
        if (class270.field4278 || arg0 >= -52) {
            return;
        }
        for (class53 var5 = (class53) arg2.method295((byte) 112); var5 != null; var5 = (class53) arg2.method296(true)) {
            class30 var6 = class362.field5329.method2182(var5.field824, (byte) -42);
            if (class142.method1021(false, var6)) {
                boolean var7 = class92.method785(arg3, arg4, arg1, var6, 114, var5);
                if (var7) {
                    class386.method2454(89, var6, var5, arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)V")
    public static void method616(int arg0) {
        if (arg0 <= 122) {
            method617(true, -101, -74, -126, true);
        }
        field1129 = null;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(ZIIIZ)Lur;")
    public static final class295 method617(boolean arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field1131++;
        if (arg4) {
            return null;
        }
        class295 var5 = new class295();
        var5.field4546 = arg1;
        var5.field4542 = arg2;
        class215.field3248.method357(var5, 1, (long) arg3);
        class356.method2272(-42, arg1);
        class38 var6 = class159.method1143(-357225936, arg3);
        if (var6 != null) {
            class5.method27(var6, -208246073);
        }
        if (class416.field6108 != null) {
            class5.method27(class416.field6108, -208246073);
            class416.field6108 = null;
        }
        class396.method2501(-28916);
        if (var6 != null) {
            class93.method789(!arg0, (byte) -109, var6);
        }
        if (!arg0) {
            class152.method1094(arg1);
        }
        if (!arg0 && class134.field2010 != -1) {
            class306.method2022(class134.field2010, 1, (byte) 114);
        }
        return var5;
    }
}
