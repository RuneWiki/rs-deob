import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class294 {

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field4366 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "I")
    public static int field4365 = 1;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
    public static int field4364 = 0;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "I")
    public static int field4363;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V", line = 6)
    public static void method1845(int arg0) {
        if (arg0 == -1323174201) {
            field4366 = null;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIIIII)V", line = 20)
    public static final void method1846(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class231[] var7 = class251.field3525;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class231 var9 = var7[var8];
            if (var9 != null && var9.field3198 == 2) {
                class73.method371(var9.field3201 * 2, arg5 >> 1, arg1, arg0 >> 1, true, (var9.field3195 - class93.field1163 << 7) + var9.field3196, arg3, (var9.field3194 - class349.field5023 << 7) + var9.field3188, var9.field3189);
                if (class398.field5662[0] > -1 && (class204.field2796 % 20) < 10) {
                    class63.field794[var9.field3193].method2363(class398.field5662[0] + arg2 - 12, arg6 - (-class398.field5662[1] - -28));
                }
            }
        }
        field4363++;
        if (arg4 != -11) {
            field4366 = null;
        }
    }
}
