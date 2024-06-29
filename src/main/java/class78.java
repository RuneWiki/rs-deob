import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class78 {

    @OriginalMember(owner = "client!te", name = "c", descriptor = "Ljava/lang/String;")
    public static String field1312 = "Your friend list is full. Max of 100 for free users, and 200 for members.";

    @OriginalMember(owner = "client!te", name = "i", descriptor = "[I")
    public static int[] field1318 = new int[1000];

    @OriginalMember(owner = "client!te", name = "h", descriptor = "I")
    public static int field1317 = 0;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "J")
    public static volatile long field1310 = 0L;

    @OriginalMember(owner = "client!te", name = "g", descriptor = "Ljava/lang/String;")
    public static String field1316 = null;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "I")
    public static int field1311;

    @OriginalMember(owner = "client!te", name = "e", descriptor = "I")
    public static int field1314;

    @OriginalMember(owner = "client!te", name = "f", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!te", name = "j", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!te", name = "d", descriptor = "Luf;")
    public static class176 field1313;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V")
    public static void method620(int arg0) {
        field1316 = null;
        if (arg0 == 13830) {
            field1313 = null;
            field1312 = null;
            field1318 = null;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(III)V")
    public static final void method621(int arg0, int arg1, int arg2) {
        field1311++;
        if (class178.field2662 != arg2) {
            class224.field3522 = new int[arg2];
            for (int var3 = 0; var3 < arg2; var3++) {
                class224.field3522[var3] = (var3 << 12) / arg2;
            }
            class178.field2662 = arg2;
            class129.field2012 = arg2 - 1;
            class58.field909 = arg2 * 32;
        }
        int var4 = 28 / ((60 - arg0) / 37);
        if (class209.field3248 == arg1) {
            return;
        }
        if (class178.field2662 == arg1) {
            class207.field3212 = class224.field3522;
        } else {
            class207.field3212 = new int[arg1];
            for (int var5 = 0; var5 < arg1; var5++) {
                class207.field3212[var5] = (var5 << 12) / arg1;
            }
        }
        class209.field3248 = arg1;
        class218.field3419 = arg1 - 1;
    }
}
