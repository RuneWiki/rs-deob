import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class28 extends class23 {

    @OriginalMember(owner = "client!ce", name = "S", descriptor = "Li;")
    public static class88 field464 = null;

    @OriginalMember(owner = "client!ce", name = "U", descriptor = "I")
    public static int field466 = -1;

    @OriginalMember(owner = "client!ce", name = "Z", descriptor = "I")
    public static int field471 = 0;

    @OriginalMember(owner = "client!ce", name = "bb", descriptor = "I")
    public static int field473 = 0;

    @OriginalMember(owner = "client!ce", name = "W", descriptor = "I")
    public static int field468 = 99;

    @OriginalMember(owner = "client!ce", name = "cb", descriptor = "Li;")
    public static class88 field474 = class208.method1425(105, "Sie befinden sich in einem Mitglieder)2Gebiet(Q");

    @OriginalMember(owner = "client!ce", name = "db", descriptor = "I")
    public static int field475 = 0;

    @OriginalMember(owner = "client!ce", name = "ab", descriptor = "Li;")
    public static class88 field472 = class208.method1425(105, "<img=1>");

    @OriginalMember(owner = "client!ce", name = "Y", descriptor = "I")
    public static int field470 = 1;

    @OriginalMember(owner = "client!ce", name = "eb", descriptor = "[J")
    public static long[] field476 = new long[1000];

    @OriginalMember(owner = "client!ce", name = "Q", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!ce", name = "R", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!ce", name = "T", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!ce", name = "V", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!ce", name = "X", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "()V")
    public class28() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "(I)V")
    public static void method172(int arg0) {
        field476 = null;
        if (arg0 != 1000) {
            method172(-22);
        }
        field464 = null;
        field474 = null;
        field472 = null;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IB)[I")
    public final int[] method54(int arg0, byte arg1) {
        int[] var3 = super.field379.method1080(false, arg0);
        if (arg1 < 19) {
            this.method54(-97, (byte) -49);
        }
        ++field467;
        if (super.field379.field3100) {
            class124.method839(var3, 0, class70.field1276, class111.field2023[arg0]);
        }
        return var3;
    }
}
