import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class145 {

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
    public static int field3027 = 0;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "I")
    public static int field3032 = -1;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
    public static int field3030 = 0;

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "Lea;")
    public static class38 field3034 = class9.method46((byte) 113, "Spieler");

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "Lea;")
    public static class38 field3036 = class9.method46((byte) 112, "headicons_hint");

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
    public static int field3028 = 0;

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "I")
    public static int field3035;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "Lk;")
    public static class89 field3033;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "[Lfa;")
    public static class47[] field3029;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "[Lk;")
    public static class89[] field3031;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V")
    public static void method1040(byte arg0) {
        field3034 = null;
        field3036 = null;
        field3029 = null;
        field3031 = null;
        field3033 = null;
        if (arg0 != 0) {
            method1041(-60, 116);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)V")
    public static final void method1041(int arg0, int arg1) {
        field3035++;
        if (arg0 != 32701) {
            field3034 = null;
        }
        if (class45.field1104 == 0) {
            class52.field1336.method544(arg1, (byte) 119);
        } else {
            class105.field2350 = arg1;
        }
    }
}
