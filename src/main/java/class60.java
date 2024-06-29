import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class60 extends class249 {

    @OriginalMember(owner = "client!r", name = "t", descriptor = "[I")
    public int[] field1035 = new int[] { -1 };

    @OriginalMember(owner = "client!r", name = "y", descriptor = "[I")
    public int[] field1040 = new int[1];

    @OriginalMember(owner = "client!r", name = "o", descriptor = "I")
    public static int field1030 = 0;

    @OriginalMember(owner = "client!r", name = "s", descriptor = "S")
    public static short field1034 = 32767;

    @OriginalMember(owner = "client!r", name = "q", descriptor = "Z")
    public static boolean field1032 = false;

    @OriginalMember(owner = "client!r", name = "p", descriptor = "I")
    public static int field1031 = 0;

    @OriginalMember(owner = "client!r", name = "r", descriptor = "S")
    public static short field1033 = 1;

    @OriginalMember(owner = "client!r", name = "v", descriptor = "Leb;")
    public static class234 field1037 = new class234();

    @OriginalMember(owner = "client!r", name = "A", descriptor = "Lmb;")
    public static class96 field1042 = class243.method1708(" steht bereits auf Ihrer Ignorieren)2Liste(Q", (byte) 96);

    @OriginalMember(owner = "client!r", name = "z", descriptor = "Lmb;")
    public static class96 field1041 = class243.method1708("cookiehost", (byte) 118);

    @OriginalMember(owner = "client!r", name = "w", descriptor = "I")
    public static int field1038;

    @OriginalMember(owner = "client!r", name = "x", descriptor = "I")
    public static int field1039;

    @OriginalMember(owner = "client!r", name = "u", descriptor = "[I")
    public static int[] field1036;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(B)V")
    public static void method435(byte arg0) {
        if (arg0 > -97) {
            method435((byte) 61);
        }
        field1037 = null;
        field1041 = null;
        field1042 = null;
        field1036 = null;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BI)V")
    public static final void method436(byte arg0, int arg1) {
        if (arg0 < -125) {
            class195.field3358.method82((byte) -109, arg1);
            class119.field2211.method82((byte) -109, arg1);
            field1038++;
            class110.field2038.method82((byte) -109, arg1);
        }
    }
}
