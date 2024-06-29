import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class182 {

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "[I")
    public static int[] field3107 = new int[2];

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "I")
    public static int field3110 = -1;

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "I")
    public static int field3109 = 127;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "I")
    public static int field3105;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "I")
    public static int field3108;

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "Z")
    public static boolean field3106;

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "[Lfg;")
    public static class12[] field3112;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)V")
    public static void method1251(byte arg0) {
        if (arg0 < -123) {
            field3112 = null;
            field3107 = null;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIBIIIII)V")
    public static final void method1252(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3111++;
        if (arg3 != 4) {
            return;
        }
        if (class222.method1508(0, arg8)) {
            class235.field4061 = null;
            class230.method1542(-118, arg6, arg2, class215.field3774[arg8], -1, arg4, arg1, arg5, arg0, arg7);
            if (class235.field4061 != null) {
                class230.method1542(-126, arg6, class83.field1526, class235.field4061, -1412584499, arg4, arg1, class242.field4160, arg0, arg7);
                class235.field4061 = null;
            }
        } else if (arg0 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class20.field286[var9] = true;
            }
        } else {
            class20.field286[arg0] = true;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(JI)V")
    public static final void method1253(long arg0, int arg1) {
        field3108++;
        class207.field3618.field4224 = 0;
        class207.field3618.method1714(245, -714043120);
        class207.field3618.method1674((byte) 101, arg0);
        class177.field3032 = 0;
        class115.field2056 = 1;
        class86.field1616 = arg1;
        class112.field1965 = -3;
    }
}
