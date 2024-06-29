import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class302 {

    @OriginalMember(owner = "client!da", name = "c", descriptor = "I")
    public static int field4446 = -1;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "I")
    public static int field4450 = 0;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public static int field4444;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "I")
    public static int field4448;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "I")
    public static int field4449;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "I")
    public static int field4451;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "I")
    public static int field4452;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "I")
    public static int field4453;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "Lh;")
    public static class427 field4445;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "[[[B")
    public static byte[][][] field4447;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V")
    public static final void method2062(int arg0) {
        if (arg0 == 3) {
            class11.field167.method1136((byte) -108);
            field4449++;
        }
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(I)V")
    public static void method2063(int arg0) {
        if (arg0 != 0) {
            method2064((String) null, 33, -25);
        }
        field4447 = null;
        field4445 = null;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;II)V")
    public static final void method2064(String arg0, int arg1, int arg2) {
        field4448++;
        class263 var3 = class47.method337(3, 0, arg2);
        if (arg1 != -1) {
            field4446 = 60;
        }
        var3.method1807((byte) -120);
        var3.field3812 = arg0;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lwd;ZLjava/lang/String;ZB)V")
    public static final void method2065(class36 arg0, boolean arg1, String arg2, boolean arg3, byte arg4) {
        field4444++;
        if (arg3) {
            if (class36.field516.startsWith("win") && class36.field511 != 3) {
                String var5 = null;
                if (arg0.field519 != null) {
                    var5 = arg0.field519.getParameter("haveie6");
                }
                if (var5 == null || !var5.equals("1")) {
                    class429 var6 = class97.method661(arg0, arg2, -10628, 0);
                    class166.field2243 = arg2;
                    class304.field4462 = var6;
                    class304.field4460 = arg0;
                    return;
                }
            }
            if (class36.field516.startsWith("mac")) {
                String var7 = null;
                if (arg0.field519 != null) {
                    var7 = arg0.field519.getParameter("havefirefox");
                }
                if (var7 != null && var7.equals("1") && arg1) {
                    class97.method661(arg0, arg2, -10628, 1);
                    return;
                }
            }
            class97.method661(arg0, arg2, -10628, 2);
        } else {
            class97.method661(arg0, arg2, -10628, 3);
        }
        if (arg4 != -124) {
            field4446 = -76;
        }
    }
}
