import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class20 {

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "I")
    public int field437 = 0;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "I")
    public int field436 = 0;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "I")
    public static int field433 = 0;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "[I")
    public static int[] field430 = new int[1000];

    @OriginalMember(owner = "client!ce", name = "o", descriptor = "Z")
    public static boolean field443 = false;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "Ln;")
    public static class90 field434 = new class90(30);

    @OriginalMember(owner = "client!ce", name = "q", descriptor = "Loa;")
    private static class98 field445 = class38.method349(255, "Connecting to server)3)3)3");

    @OriginalMember(owner = "client!ce", name = "r", descriptor = "Loa;")
    public static class98 field446 = field445;

    @OriginalMember(owner = "client!ce", name = "s", descriptor = "Z")
    public static boolean field447 = false;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
    public int field435;

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "I")
    public int field439;

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "I")
    public int field440;

    @OriginalMember(owner = "client!ce", name = "m", descriptor = "I")
    public int field441;

    @OriginalMember(owner = "client!ce", name = "n", descriptor = "I")
    public int field442;

    @OriginalMember(owner = "client!ce", name = "t", descriptor = "Ltb;")
    public static class130 field448;

    @OriginalMember(owner = "client!ce", name = "p", descriptor = "Lj;")
    public static class62 field444;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "Lnd;")
    public class94 field429;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V")
    public static void method187(byte arg0) {
        field430 = null;
        field444 = null;
        field448 = null;
        int var1 = 86 % ((7 - arg0) / 49);
        field446 = null;
        field445 = null;
        field434 = null;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Loa;Ltb;BLoa;)Loc;")
    public static final class100 method188(class98 arg0, class130 arg1, byte arg2, class98 arg3) {
        if (arg2 >= -14) {
            method189(false, 97L);
        }
        field438++;
        int var4 = arg1.method1060((byte) 91, arg0);
        int var5 = arg1.method1048(arg3, var4, (byte) -113);
        return class88.method720(true, var5, var4, arg1);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZJ)V")
    public static final void method189(boolean arg0, long arg1) {
        field432++;
        if (arg1 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class77.field1697; var3++) {
            if (class102.field2345[var3] == arg1) {
                class137.field3332 = true;
                class77.field1697--;
                class87.field1990++;
                for (int var4 = var3; var4 < class77.field1697; var4++) {
                    class102.field2345[var4] = class102.field2345[var4 + 1];
                }
                class132.field3116.method177(6624, 172);
                class132.field3116.method92(true, arg1);
                break;
            }
        }
        if (!arg0) {
            field446 = null;
        }
    }
}
