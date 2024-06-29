import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class75 {

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "[I")
    public static int[] field1131 = new int[14];

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "I")
    public static int field1134;

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "I")
    public static int field1135;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "Lvk;")
    public static class160 field1133;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V")
    public static final void method519(int arg0) {
        class68.method453(false, -29397);
        field1135++;
        System.gc();
        class95.method651(25, (byte) 16);
        if (arg0 != -16777216) {
            method520(-78);
        }
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(I)V")
    public static void method520(int arg0) {
        field1131 = null;
        field1133 = null;
        if (arg0 <= 98) {
            field1131 = null;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILvl;B)Z")
    public static final boolean method521(int arg0, class73 arg1, byte arg2) {
        field1132++;
        byte[] var3 = arg1.method507(-2, arg0);
        if (var3 == null) {
            return false;
        } else {
            class55.method360(true, var3);
            return arg2 < -98;
        }
    }
}
