import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class205 {

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "I")
    public static int field2876 = -1;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "I")
    public static int field2873;

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "I")
    public static int field2875;

    @OriginalMember(owner = "client!pl", name = "g", descriptor = "I")
    public static int field2877;

    @OriginalMember(owner = "client!pl", name = "i", descriptor = "I")
    public static int field2879;

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "Llc;")
    public static class175 field2874;

    @OriginalMember(owner = "client!pl", name = "h", descriptor = "Lod;")
    public static class28 field2878;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Ltk;IIIII)Ljava/awt/Frame;", line = 9)
    public static final Frame method1394(class265 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 != -31672) {
            field2874 = (class175) null;
        }
        field2879++;
        if (!arg0.method1914(26960)) {
            return null;
        }
        if (arg1 == 0) {
            class149[] var6 = class177.method1215(21134, arg0);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field2077 == arg4 && var6[var8].field2067 == arg3 && (arg2 == 0 || var6[var8].field2071 == arg2) && (!var7 || var6[var8].field2069 > arg1)) {
                    arg1 = var6[var8].field2069;
                    var7 = true;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class18 var9 = arg0.method1919(arg4, arg3, arg1, arg5 ^ 0x7BEB, arg2);
        while (var9.field238 == 0) {
            class81.method485(10L, 1);
        }
        Frame var10 = (Frame) var9.field241;
        if (var10 == null) {
            return null;
        } else if (var9.field238 == 2) {
            class244.method1756(arg0, -27740, var10);
            return null;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(ILlc;)Z", line = 84)
    public static final boolean method1395(int arg0, class175 arg1) {
        field2873++;
        if (arg0 == -1) {
            return arg1.method1194(class14.field179, (byte) 126);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V", line = 107)
    public static void method1396(int arg0) {
        if (arg0 == 37) {
            field2878 = null;
            field2874 = null;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(BI)V", line = 121)
    public static final void method1397(byte arg0, int arg1) {
        field2875++;
        int var2 = 84 % ((6 - arg0) / 39);
        class96 var3 = class141.method935(arg1, 7, 68);
        var3.method582(-1);
    }
}
