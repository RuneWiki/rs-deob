import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class188 {

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "Z")
    public static boolean field2778 = false;

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "[I")
    public static int[] field2781 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "[B")
    public static byte[] field2776 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "I")
    public int field2777;

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "I")
    public int field2780;

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "I")
    public int field2782;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "Ljava/applet/Applet;")
    public static Applet field2779;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)V")
    public static void method1250(byte arg0) {
        field2781 = null;
        field2779 = null;
        field2776 = null;
        if (arg0 != 3) {
            method1251(79, 69, 3, -107, 2, true, false);
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIIZZ)V")
    public static final void method1251(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        class627.field8753 = arg0;
        class658.field9268 = 0x1 << class627.field8753;
        class634.field8905 = class658.field9268 >> 1;
        class88.field1197 = (int) Math.sqrt((double) (class634.field8905 * class634.field8905 + class634.field8905 * class634.field8905));
        class528.field7232 = class658.field9268 >> 2;
        class302.field4477 = class658.field9268;
        class137.field1931 = arg2;
        class22.field308 = arg3;
        class614.field8507 = arg4;
        class368.field5264 = new class486[arg1][class137.field1931][class22.field308];
        class31.field369 = new class136[arg1];
        if (arg5) {
            class326.field4815 = new int[class137.field1931][class22.field308];
            class198.field2927 = new byte[class137.field1931][class22.field308];
            class144.field2144 = new short[class137.field1931][class22.field308];
            class690.field9701 = new class486[1][class137.field1931][class22.field308];
            class581.field8114 = new class136[1];
        } else {
            class326.field4815 = null;
            class198.field2927 = null;
            class144.field2144 = null;
            class690.field9701 = null;
            class581.field8114 = null;
        }
        if (arg6) {
            class185.field2716 = new long[arg1][arg2][arg3];
            class324.field4793 = new class517[65535];
            class250.field3526 = new boolean[65535];
            class68.field935 = 0;
        } else {
            class185.field2716 = null;
            class324.field4793 = null;
            class250.field3526 = null;
            class68.field935 = 0;
        }
        class19.method100(false);
        class398.field5527 = new class205[1000];
        class160.field2390 = 0;
        class261.field3713 = new class205[1000];
        class411.field5807 = 0;
        class397.field5523 = new int[arg1][class137.field1931 + 1][class22.field308 + 1];
        class376.field5329 = new class39[5000];
        class589.field8211 = 0;
        class525.field7157 = new boolean[class614.field8507 + class614.field8507 + 1][class614.field8507 + class614.field8507 + 1];
        class81.field1138 = new boolean[class614.field8507 + class614.field8507 + 2][class614.field8507 + class614.field8507 + 2];
        class220.field3196 = null;
    }
}
