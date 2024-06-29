import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class92 {

    @OriginalMember(owner = "client!p", name = "c", descriptor = "Lck;")
    private static class119 field1422 = class298.method1987((byte) 48, "skill)2");

    @OriginalMember(owner = "client!p", name = "e", descriptor = "Lck;")
    public static class119 field1424 = field1422;

    @OriginalMember(owner = "client!p", name = "f", descriptor = "[S")
    public static short[] field1425 = new short[256];

    @OriginalMember(owner = "client!p", name = "h", descriptor = "Lck;")
    private static class119 field1427 = class298.method1987((byte) 8, "Started 3d library");

    @OriginalMember(owner = "client!p", name = "d", descriptor = "Lck;")
    public static class119 field1423 = field1427;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!p", name = "g", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(III)Z", line = 140)
    public static final boolean method630(int arg0, int arg1, int arg2) {
        if (arg2 > -48) {
            field1427 = (class119) null;
        }
        field1426++;
        return (arg1 >> arg0 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V", line = 154)
    public static void method631(int arg0) {
        if (arg0 != 13771) {
            return;
        }
        field1423 = null;
        field1424 = null;
        field1427 = null;
        field1422 = null;
        field1425 = null;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(B)V", line = 280)
    public static final void method632(byte arg0) {
        class231.field3732.method1334((byte) -60);
        field1421++;
        class73.field1137.method586((byte) 126);
        if (arg0 <= 4) {
            method630(-116, -112, 7);
        }
        class126.field1936.method586((byte) 126);
    }
}
