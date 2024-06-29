import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eda")
public class class109 {

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "I")
    public static int field1314 = 104;

    @OriginalMember(owner = "client!eda", name = "b", descriptor = "I")
    public static int field1315 = 0;

    @OriginalMember(owner = "client!eda", name = "d", descriptor = "I")
    public static int field1317 = 0;

    @OriginalMember(owner = "client!eda", name = "c", descriptor = "I")
    public static int field1316;

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(I)J", line = 7)
    public static final synchronized long method731(int arg0) {
        if (arg0 <= 10) {
            return -84L;
        }
        field1316++;
        long var1 = System.currentTimeMillis();
        if (class232.field3364 > var1) {
            class627.field8860 += class232.field3364 - var1;
        }
        class232.field3364 = var1;
        return var1 + class627.field8860;
    }
}
