import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class235 {

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "I")
    public int field3850 = 0;

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "I")
    public int field3857 = 0;

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "Z")
    public boolean field3854 = false;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "Lqd;")
    public static class40 field3846 = class147.method1106("<br>", (byte) -62);

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "Lqd;")
    public static class40 field3851 = class147.method1106("Lade Titelbild )2 ", (byte) -52);

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "Z")
    public static boolean field3855 = false;

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "I")
    public static int field3856 = -1;

    @OriginalMember(owner = "client!fd", name = "n", descriptor = "[I")
    public static int[] field3859 = new int[32];

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "I")
    public static int field3848;

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "Lrb;")
    public static class213 field3852;

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "Lt;")
    public class245 field3849;

    @OriginalMember(owner = "client!fd", name = "m", descriptor = "Ljava/nio/ByteBuffer;")
    public ByteBuffer field3858;

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "[I")
    public static int[] field3853;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "[[[B")
    public static byte[][][] field3847;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IZII[Lrb;I)V", line = 28)
    public static final void method1630(int arg0, boolean arg1, int arg2, int arg3, class213[] arg4, int arg5) {
        for (int var6 = 0; var6 < arg4.length; var6++) {
            class213 var7 = arg4[var6];
            if (var7 != null && var7.field3421 == arg0) {
                class162.method1235(arg1, var7, arg5, false, arg3);
                class93.method709(var7, arg3, arg5, -3);
                if (var7.field3530 > (var7.field3571 - var7.field3502)) {
                    var7.field3530 = var7.field3571 - var7.field3502;
                }
                if (var7.field3530 < 0) {
                    var7.field3530 = 0;
                }
                if (var7.field3437 - var7.field3565 < var7.field3583) {
                    var7.field3583 = var7.field3437 - var7.field3565;
                }
                if (var7.field3583 < 0) {
                    var7.field3583 = 0;
                }
                if (var7.field3525 == 0) {
                    class299.method2041(arg1, (byte) -106, var7);
                }
            }
        }
        if (arg2 != -1) {
            field3855 = false;
        }
        field3848++;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V", line = 86)
    public static void method1631(int arg0) {
        field3846 = null;
        field3853 = null;
        field3859 = null;
        field3847 = (byte[][][]) null;
        field3852 = null;
        field3851 = null;
        if (arg0 != -11388) {
            field3853 = (int[]) null;
        }
    }
}
