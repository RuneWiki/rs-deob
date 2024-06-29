import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class381 {

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "F")
    public static float field5158 = 0.0F;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "Lsb;")
    public static class305 field5157 = new class305(39, 3);

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "Lko;")
    public static class259 field5159 = new class259("LIVE", 0);

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "[I")
    public static int[] field5160 = new int[4];

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "Z")
    public static boolean field5161 = false;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "I")
    public static int field5163 = 0;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
    public static int field5155;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "I")
    public static int field5156;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "[I")
    public static int[] field5162;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)Z")
    public static final boolean method2195(int arg0) {
        field5155++;
        try {
            int var1 = 88 / ((14 - arg0) / 61);
            if (class258.field3249 == 2) {
                if (class549.field7864 == null) {
                    class549.field7864 = class431.method2478(class25.field217, class597.field8420, class369.field5053);
                    if (class549.field7864 == null) {
                        return false;
                    }
                }
                if (class226.field2800 == null) {
                    class226.field2800 = new class231(class597.field8422, class112.field1187);
                }
                if (class291.field3642.method509(class226.field2800, 22050, class222.field2761, class549.field7864, 0)) {
                    class291.field3642.method523(0);
                    if (class105.field1130 <= 0) {
                        class258.field3249 = 0;
                        class291.field3642.method514(false, class168.field1878);
                    } else {
                        class258.field3249 = 3;
                        class291.field3642.method514(false, 0);
                    }
                    if (class145.field1598 <= 0L) {
                        class291.field3642.method493(class549.field7864, class370.field5061, -7745);
                    } else {
                        class291.field3642.method494(class145.field1598, true, class370.field5061, (byte) -114, class549.field7864);
                    }
                    class145.field1598 = 0L;
                    class25.field217 = null;
                    class226.field2800 = null;
                    class549.field7864 = null;
                    return true;
                }
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            class291.field3642.method492((byte) -44);
            class258.field3249 = 0;
            class226.field2800 = null;
            class549.field7864 = null;
            class25.field217 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIIII)I")
    public static final int method2196(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg1 & 0x1) == 1) {
            int var7 = arg2;
            arg2 = arg4;
            arg4 = var7;
        }
        int var8 = arg6 & 0x3;
        field5156++;
        if (var8 == 0) {
            return arg3;
        }
        if (arg0 != -15446) {
            method2196(30, -105, 127, 40, -122, 100, 81);
        }
        if (var8 == 1) {
            return arg5;
        } else if (var8 == 2) {
            return 1 - (arg2 - 7) - arg3;
        } else {
            return 7 + 1 - arg5 - arg4;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V")
    public static void method2197(byte arg0) {
        field5159 = null;
        if (arg0 < 12) {
            method2197((byte) -100);
        }
        field5160 = null;
        field5162 = null;
        field5157 = null;
    }
}
