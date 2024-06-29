import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class33 {

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "Z")
    public static boolean field485 = false;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "Ljava/lang/String;")
    public static String field486 = "Loaded sprites";

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "[I")
    public static int[] field484 = new int[32];

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "Ljava/util/Random;")
    public static Random field490;

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "I")
    public static int field487;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "I")
    public static int field488;

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "Lgb;")
    public static class88 field491;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V", line = 28)
    public static void method301(int arg0) {
        if (arg0 != 0) {
            method302(false);
        }
        field484 = null;
        field490 = null;
        field486 = null;
        field491 = null;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field484[var1] = var0 - 1;
            var0 += var0;
        }
        field492 = -1;
        field489 = 0;
        field490 = new Random();
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Z)V", line = 59)
    public static final void method302(boolean arg0) {
        field487++;
        class304 var1 = class5.field58;
        synchronized (class5.field58) {
            class183.field2971 = class263.field4131;
            class25.field381 = class215.field3389;
            class281.field4345++;
            class82.field1129 = class284.field4399;
            class193.field3076 = class63.field924;
            class205.field3256 = class3.field29;
            if (!arg0) {
                method301(107);
            }
            class271.field4207 = class69.field968;
            class222.field3516 = class125.field1803;
            class63.field924 = 0;
        }
    }
}
