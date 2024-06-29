import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class32 {

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "Ljava/lang/String;")
    public static String field425 = "purple:";

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "Ljava/lang/String;")
    public static String field427 = "Allocated memory";

    @OriginalMember(owner = "client!ah", name = "m", descriptor = "Ljava/lang/String;")
    public static String field437 = "Hidden";

    @OriginalMember(owner = "client!ah", name = "l", descriptor = "I")
    public static int field436 = 0;

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "I")
    public int field428;

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "I")
    public int field430;

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!ah", name = "k", descriptor = "I")
    public static int field435;

    @OriginalMember(owner = "client!ah", name = "n", descriptor = "I")
    public int field438;

    @OriginalMember(owner = "client!ah", name = "p", descriptor = "I")
    public static int field440;

    @OriginalMember(owner = "client!ah", name = "q", descriptor = "I")
    public int field441;

    @OriginalMember(owner = "client!ah", name = "r", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "J")
    public long field429;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "Lj;")
    public class7 field426;

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "Lj;")
    public class7 field433;

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "Lj;")
    public class7 field434;

    @OriginalMember(owner = "client!ah", name = "o", descriptor = "[S")
    public static short[] field439;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V", line = 11)
    public static final void method175(int arg0) {
        field442++;
        if (class124.field1947.toLowerCase().indexOf("microsoft") == -1) {
            class208.field3416[92] = 74;
            class208.field3416[59] = 57;
            class208.field3416[45] = 26;
            class208.field3416[91] = 42;
            class208.field3416[47] = 73;
            class208.field3416[61] = 27;
            if (class124.field1949 == null) {
                class208.field3416[222] = 59;
                class208.field3416[192] = 58;
            } else {
                class208.field3416[520] = 59;
                class208.field3416[192] = 28;
                class208.field3416[222] = 58;
            }
            class208.field3416[93] = 43;
            class208.field3416[46] = 72;
            class208.field3416[44] = 71;
        } else {
            class208.field3416[189] = 26;
            class208.field3416[190] = 72;
            class208.field3416[187] = 27;
            class208.field3416[192] = 58;
            class208.field3416[186] = 57;
            class208.field3416[188] = 71;
            class208.field3416[191] = 73;
            class208.field3416[220] = 74;
            class208.field3416[222] = 59;
            class208.field3416[223] = 28;
            class208.field3416[219] = 42;
            class208.field3416[221] = 43;
        }
        if (arg0 != 27) {
            field439 = (short[]) null;
        }
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(I)V", line = 61)
    public static void method176(int arg0) {
        if (arg0 != 18637) {
            method175(6);
        }
        field437 = null;
        field427 = null;
        field425 = null;
        field439 = null;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZI)V", line = 101)
    public static final void method177(boolean arg0, int arg1) {
        field440++;
        class5.field78 = new int[arg1];
        class164.field2736 = new int[arg1];
        class121.field1879 = new int[arg1];
        if (!arg0) {
            class15.field193 = new int[arg1];
            class84.field1174 = new int[arg1];
        }
    }
}
