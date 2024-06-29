import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class13 {

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "[I")
    public static int[] field320 = new int[] { 2, 2, 4, 0, 1, 8, 0 };

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "I")
    public static int field322 = 0;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "Lqe;")
    public static class179 field324 = class206.method1380("::fpsoff", (byte) -127);

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "[Lqe;")
    public static class179[] field327 = new class179[100];

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "I")
    public static int field329;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "Ljf;")
    public static class103 field325;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "[Lp;")
    public static class163[] field326;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V")
    public static void method88(int arg0) {
        field326 = null;
        field325 = null;
        field324 = null;
        field327 = null;
        field320 = null;
        if (arg0 != 2) {
            method90(null, 6, -28, 49);
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lqe;Lqe;ILeh;)[Lnb;")
    public static final class143[] method89(class179 arg0, class179 arg1, int arg2, class52 arg3) {
        if (arg2 != 1) {
            field324 = null;
        }
        field321++;
        int var4 = arg3.method359(arg2 - 2, arg1);
        int var5 = arg3.method362(-126, var4, arg0);
        return class105.method687(arg3, arg2 + 123, var5, var4);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Leh;III)[Lgg;")
    public static final class72[] method90(class52 arg0, int arg1, int arg2, int arg3) {
        field328++;
        if (class77.method495(arg3 + 20478, arg2, arg1, arg0)) {
            if (arg3 != 2) {
                method90(null, 90, 29, 88);
            }
            return class108.method710((byte) -114);
        } else {
            return null;
        }
    }
}
