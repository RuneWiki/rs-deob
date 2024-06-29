import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class223 {

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "Ljk;")
    public static class297 field3464 = null;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "[I")
    public static int[] field3471 = new int[14];

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "I")
    public static int field3468 = 0;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "Ljava/lang/String;")
    public static String field3472 = "Starting 3d Library";

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
    public static int field3465;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "I")
    public static int field3474;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "Lpk;")
    public static class237 field3469;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V")
    public static void method1525(byte arg0) {
        field3464 = null;
        field3472 = null;
        field3471 = null;
        if (arg0 < 123) {
            field3471 = null;
        }
        field3469 = null;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIBLpk;)Z")
    public static final boolean method1526(int arg0, int arg1, byte arg2, class237 arg3) {
        field3467++;
        if (arg2 != 112) {
            field3471 = null;
        }
        byte[] var4 = arg3.method1605(-124, arg1, arg0);
        if (var4 == null) {
            return false;
        } else {
            class58.method477(2, var4);
            return true;
        }
    }
}
