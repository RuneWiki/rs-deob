import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public class class521 extends class155 {

    @OriginalMember(owner = "client!bt", name = "q", descriptor = "I")
    public int field7306 = (int) (class337.method2062(false) / 1000L);

    @OriginalMember(owner = "client!bt", name = "r", descriptor = "S")
    public short field7307;

    @OriginalMember(owner = "client!bt", name = "t", descriptor = "Ljava/lang/String;")
    public String field7309;

    @OriginalMember(owner = "client!bt", name = "o", descriptor = "Lin;")
    public static class380 field7304 = new class380(36, -2);

    @OriginalMember(owner = "client!bt", name = "s", descriptor = "[Ljava/awt/Color;")
    public static Color[] field7308 = new Color[] { new Color(9179409), new Color(3289650), new Color(3289650), new Color(3289650) };

    @OriginalMember(owner = "client!bt", name = "u", descriptor = "Low;")
    public static class665 field7310 = new class665();

    @OriginalMember(owner = "client!bt", name = "v", descriptor = "Laq;")
    public static class494 field7311 = new class494(10);

    @OriginalMember(owner = "client!bt", name = "n", descriptor = "I")
    public static int field7303;

    @OriginalMember(owner = "client!bt", name = "p", descriptor = "I")
    public static int field7305;

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(BILha;IILjava/lang/String;II)V", line = 5)
    public static final void method3059(byte arg0, int arg1, class475 arg2, int arg3, int arg4, String arg5, int arg6, int arg7) {
        field7305++;
        if (class391.field5447 == null || class278.field4013 == null) {
            if (class176.field2648.method3005(class400.field5512, (byte) -69) && class176.field2648.method3005(class664.field9359, (byte) -69)) {
                class391.field5447 = arg2.method487(class418.method2468(class176.field2648, class400.field5512, 0), true);
                class418 var8 = class418.method2468(class176.field2648, class664.field9359, 0);
                class278.field4013 = arg2.method487(var8, true);
                var8.method2461();
                class122.field2073 = arg2.method487(var8, true);
            } else {
                arg2.method436(arg4, arg6, arg3, arg7, 255 - class373.field5246 << 24 | class637.field8997, 1);
            }
        }
        if (class391.field5447 != null && class278.field4013 != null) {
            int var9 = (arg3 - (class278.field4013.method16() * 2)) / class391.field5447.method16();
            for (int var10 = 0; var10 < var9; var10++) {
                class391.field5447.method759(arg4 + class278.field4013.method16() + class391.field5447.method16() * var10, arg6);
            }
            class278.field4013.method759(arg4, arg6);
            class122.field2073.method759(arg3 + arg4 - class122.field2073.method16(), arg6);
        }
        class670.field9398.method2628(class421.field5865 | 0xFF000000, arg5, arg4 + 3, -97, arg6 + 14, -1);
        if (arg0 > -28) {
            method3061(-1, -38);
        }
        arg2.method436(arg4, arg6 + arg7, arg3, arg1 - arg7, class637.field8997 | -class373.field5246 + 255 << 24, 1);
    }

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "(B)V", line = 49)
    public static void method3060(byte arg0) {
        field7304 = null;
        field7310 = null;
        if (arg0 != 71) {
            field7310 = null;
        }
        field7311 = null;
        field7308 = null;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(II)I", line = 67)
    public static final int method3061(int arg0, int arg1) {
        int var2 = -67 % ((-arg1 - 43) / 34);
        field7303++;
        return arg0 == 16711935 ? -1 : class246.method1631(-22173, arg0);
    }

    @OriginalMember(owner = "client!bt", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 85)
    public class521(String arg0, int arg1) {
        this.field7307 = (short) arg1;
        this.field7309 = arg0;
    }
}
