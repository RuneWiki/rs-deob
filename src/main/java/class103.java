import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class103 {

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "Z")
    public static boolean field1264 = false;

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "[I")
    public static int[] field1261 = new int[1];

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "S")
    public static short field1262 = 32767;

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "Lvk;")
    public static class308 field1258;

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "Lav;")
    public static class545 field1265;

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "[I")
    public static int[] field1259;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V", line = 3)
    public static void method614(int arg0) {
        field1258 = null;
        field1261 = null;
        if (arg0 >= -115) {
            method614(10);
        }
        field1265 = null;
        field1259 = null;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(II)Z", line = 23)
    public static final boolean method615(int arg0, int arg1) {
        if (arg1 <= 70) {
            method614(-75);
        }
        field1260++;
        return arg0 >= 12 && arg0 <= 17;
    }
}
