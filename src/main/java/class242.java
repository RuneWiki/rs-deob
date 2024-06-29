import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class242 {

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "I")
    public static int field3184 = 0;

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "I")
    public static int field3189 = 0;

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "I")
    public static int field3191 = 0;

    @OriginalMember(owner = "client!eh", name = "i", descriptor = "F")
    public static float field3192;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
    public int field3185;

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "I")
    public int field3187;

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "I")
    public static int field3188;

    @OriginalMember(owner = "client!eh", name = "j", descriptor = "I")
    public static int field3193;

    @OriginalMember(owner = "client!eh", name = "k", descriptor = "I")
    public int field3194;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "Lba;")
    public static class661 field3186;

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "Ljava/lang/Object;")
    public static Object field3190;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Z)V")
    public static void method1490(boolean arg0) {
        field3190 = null;
        field3186 = null;
        if (!arg0) {
            method1491(66, 12, (byte) 116, -14);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIBI)V")
    public static final void method1491(int arg0, int arg1, byte arg2, int arg3) {
        field3188++;
        String var4 = "tele " + arg0 + "," + (arg1 >> 6) + "," + (arg3 >> 6) + "," + (arg1 & 0x3F) + "," + (arg3 & 0x3F);
        int var5 = 43 % ((arg2 - 62) / 41);
        System.out.println(var4);
        class567.method3144(var4, 100, true, false);
    }
}
